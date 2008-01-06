/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.directory.server.core.entry;


import org.apache.directory.shared.ldap.NotImplementedException;
import org.apache.directory.shared.ldap.entry.AbstractStringValue;
import org.apache.directory.shared.ldap.schema.AttributeType;
import org.apache.directory.shared.ldap.schema.MatchingRule;
import org.apache.directory.shared.ldap.schema.Normalizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.NamingException;
import java.util.Comparator;


/**
 * A server side schema aware wrapper around a String attribute value.
 * This value wrapper uses schema information to syntax check values,
 * and to compare them for equality and ordering.  It caches results
 * and invalidates them when the wrapped value changes.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev$, $Date$
 */
public class ServerStringValue extends AbstractStringValue implements ServerValue<String>, Cloneable
{
    /** logger for reporting errors that might not be handled properly upstream */
    private static final Logger LOG = LoggerFactory.getLogger( ServerStringValue.class );

    /** reference to the attributeType which is not serialized */
    private transient AttributeType attributeType;

    /** the canonical representation of the wrapped String value */
    private transient String normalizedValue;

    /** cached results of the isValid() method call */
    private transient Boolean valid;


    /**
     * Creates a ServerStringValue without an initial wrapped value.
     *
     * @param attributeType the schema type associated with this ServerStringValue
     */
    public ServerStringValue( AttributeType attributeType )
    {
        assert checkAttributeType( attributeType) == null : logAssert( checkAttributeType( attributeType ) );

        try
        {
            if ( ! attributeType.getSyntax().isHumanReadable() )
            {
                LOG.warn( "Treating a value of a binary attribute {} as a String: " +
                        "\nthis could cause data corruption!", attributeType.getName() );
            }
        }
        catch( NamingException e )
        {
            LOG.error( "Failed to resolve syntax for attributeType {}", attributeType, e );
        }

        this.attributeType = attributeType;
    }


    /**
     * Creates a ServerStringValue with an initial wrapped String value.
     *
     * @param attributeType the schema type associated with this ServerStringValue
     * @param wrapped the value to wrap which can be null
     */
    public ServerStringValue( AttributeType attributeType, String wrapped )
    {
        this( attributeType );
        super.set( wrapped );
    }


    // -----------------------------------------------------------------------
    // Value<String> Methods
    // -----------------------------------------------------------------------


    /**
     * Sets the wrapped String value.  Has the side effect of setting the
     * normalizedValue and the valid flags to null if the wrapped value is
     * different than what is already set.  These cached values must be
     * recomputed to be correct with different values.
     *
     * @see ServerValue#set(Object)
     */
    public final void set( String wrapped )
    {
        // Why should we invalidate the normalized value if it's we're setting the
        // wrapper to it's current value?
        if ( wrapped.equals( get() ) )
        {
            return;
        }

        normalizedValue = null;
        valid = null;
        super.set( wrapped );
    }


    // -----------------------------------------------------------------------
    // ServerValue<String> Methods
    // -----------------------------------------------------------------------


    /**
     * Gets the normalized (cannonical) representation for the wrapped string.
     * If the wrapped String is null, null is returned, otherwise the normalized
     * form is returned.  If no the normalizedValue is null, then this method
     * will attempt to generate it from the wrapped value: repeated calls to
     * this method do not unnecessarily normalize the wrapped value.  Only changes
     * to the wrapped value result in attempts to normalize the wrapped value.
     *
     * @return gets the normalized value
     * @throws NamingException if the value cannot be properly normalized
     */
    public String getNormalized() throws NamingException
    {
        if ( isNull() )
        {
            return null;
        }

        if ( normalizedValue == null )
        {
            Normalizer normalizer = getNormalizer();

            if ( normalizer == null )
            {
                normalizedValue = get();
            }
            else
            {
                normalizedValue = ( String ) normalizer.normalize( get() );
            }
        }

        return normalizedValue;
    }


    /**
     * Uses the syntaxChecker associated with the attributeType to check if the
     * value is valid.  Repeated calls to this method do not attempt to re-check
     * the syntax of the wrapped value every time if the wrapped value does not
     * change. Syntax checks only result on the first check, and when the wrapped
     * value changes.
     *
     * @see ServerValue#isValid()
     */
    public final boolean isValid() throws NamingException
    {
        if ( valid != null )
        {
            return valid;
        }

        valid = attributeType.getSyntax().getSyntaxChecker().isValidSyntax( get() );
        return valid;
    }


    /**
     * @see ServerValue#compareTo(ServerValue)
     * @throws IllegalStateException on failures to extract the comparator, or the
     * normalizers needed to perform the required comparisons based on the schema
     */
    public int compareTo( ServerValue<String> value )
    {
        if ( isNull() )
        {
            if ( ( value == null ) || value.isNull() )
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        else if ( ( value == null ) || value.isNull() )
        {
            return 1;
        }

        if ( value instanceof ServerStringValue )
        {
            ServerStringValue stringValue = ( ServerStringValue ) value;
            try
            {
                //noinspection unchecked
                return getComparator().compare( getNormalized(), stringValue.getNormalized() );
            }
            catch ( NamingException e )
            {
                String msg = "Failed to compare normalized values for " + get() + " and " + value;
                LOG.error( msg, e );
                throw new IllegalStateException( msg, e );
            }
        }

        throw new NotImplementedException( "I don't know what to do if value is not a ServerStringValue" );
    }


    public AttributeType getAttributeType()
    {
        return attributeType;
    }


    /**
     * @see ServerValue#instanceOf(AttributeType)
     */
    public boolean instanceOf( AttributeType attributeType ) throws NamingException
    {
        if ( this.attributeType.equals( attributeType ) )
        {
            return true;
        }

        return this.attributeType.isDescentantOf( attributeType );
    }


    // -----------------------------------------------------------------------
    // Object Methods
    // -----------------------------------------------------------------------


    /**
     * @see Object#hashCode()
     * @throws IllegalStateException on failures to extract the comparator, or the
     * normalizers needed to perform the required comparisons based on the schema
     */
    public int hashCode()
    {
        // return zero if the value is null so only one null value can be
        // stored in an attribute - the binary version does the same 
        if ( isNull() )
        {
            return 0;
        }

        try
        {
            return getNormalized().hashCode();
        }
        catch ( NamingException e )
        {
            String msg = "Failed to normalize \"" + get() + "\" while trying to get hashCode()";
            LOG.error( msg, e );
            throw new IllegalStateException( msg, e );
        }
    }


    /**
     * Checks to see if this ServerStringValue equals the supplied object.
     *
     * This equals implementation overrides the StringValue implementation which
     * is not schema aware.
     * @throws IllegalStateException on failures to extract the comparator, or the
     * normalizers needed to perform the required comparisons based on the schema
     */
    public boolean equals( Object obj )
    {
        if ( this == obj )
        {
            return true;
        }

        if ( ! ( obj instanceof ServerStringValue ) )
        {
            return false;
        }

        ServerStringValue other = ( ServerStringValue ) obj;
        
        if ( isNull() && other.isNull() )
        {
            return true;
        }

        if ( isNull() != other.isNull() )
        {
            return false;
        }

        // now unlike regular values we have to compare the normalized values
        try
        {
            return getNormalized().equals( other.getNormalized() );
        }
        catch ( NamingException e )
        {
            String msg = "Failed to normalize while testing for equality on String values: \"";
            msg += get() + "\"" + " and \"" + other.get() + "\"" ;
            LOG.error( msg, e );
            throw new IllegalStateException( msg, e );
        }
    }


    // -----------------------------------------------------------------------
    // Private Helper Methods (might be put into abstract base class)
    // -----------------------------------------------------------------------


    /**
     * Find a matchingRule to use for normalization and comparison.  If an equality
     * matchingRule cannot be found it checks to see if other matchingRules are
     * available: SUBSTR, and ORDERING.  If a matchingRule cannot be found null is
     * returned.
     *
     * @return a matchingRule or null if one cannot be found for the attributeType
     * @throws NamingException if resolution of schema entities fail
     */
    private MatchingRule getMatchingRule() throws NamingException
    {
        MatchingRule mr = attributeType.getEquality();

        if ( mr == null )
        {
            mr = attributeType.getOrdering();
        }

        if ( mr == null )
        {
            mr = attributeType.getSubstr();
        }

        return mr;
    }


    /**
     * Gets a normalizer using getMatchingRule() to resolve the matchingRule
     * that the normalizer is extracted from.
     *
     * @return a normalizer associated with the attributeType or null if one cannot be found
     * @throws NamingException if resolution of schema entities fail
     */
    private Normalizer getNormalizer() throws NamingException
    {
        MatchingRule mr = getMatchingRule();

        if ( mr == null )
        {
            return null;
        }

        return mr.getNormalizer();
    }


    /**
     * Gets a comparator using getMatchingRule() to resolve the matching
     * that the comparator is extracted from.
     *
     * @return a comparator associated with the attributeType or null if one cannot be found
     * @throws NamingException if resolution of schema entities fail
     */
    private Comparator getComparator() throws NamingException
    {
        MatchingRule mr = getMatchingRule();

        if ( mr == null )
        {
            return null;
        }

        return mr.getComparator();
    }
    
    
    /**
     * @return a copy of the current value
     */
    public ServerStringValue clone()
    {
        try
        {
            return (ServerStringValue)super.clone();
        }
        catch ( CloneNotSupportedException cnse )
        {
            return null;
        }
    }
}
