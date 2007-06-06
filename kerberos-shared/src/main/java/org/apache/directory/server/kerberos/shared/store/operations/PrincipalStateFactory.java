/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */

package org.apache.directory.server.kerberos.shared.store.operations;


import java.io.IOException;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.SchemaViolationException;
import javax.naming.spi.DirStateFactory;

import org.apache.directory.server.kerberos.shared.crypto.encryption.EncryptionType;
import org.apache.directory.server.kerberos.shared.io.encoder.EncryptionKeyEncoder;
import org.apache.directory.server.kerberos.shared.messages.value.EncryptionKey;
import org.apache.directory.server.kerberos.shared.store.KerberosAttribute;
import org.apache.directory.server.kerberos.shared.store.PrincipalStoreEntry;
import org.apache.directory.shared.ldap.constants.SchemaConstants;
import org.apache.directory.shared.ldap.message.AttributeImpl;
import org.apache.directory.shared.ldap.message.AttributesImpl;
import org.apache.directory.shared.ldap.util.AttributeUtils;


/**
 * A StateFactory for a server profile.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev$, $Date$
 */
public class PrincipalStateFactory implements DirStateFactory
{
    public Result getStateToBind( Object obj, Name name, Context nameCtx, Hashtable environment, Attributes inAttrs )
        throws NamingException
    {
        // Only interested in PrincipalStoreEntry objects
        if ( obj instanceof PrincipalStoreEntry )
        {
            Attributes outAttrs;
            if ( inAttrs == null )
            {
                outAttrs = new AttributesImpl( true );
            }
            else
            {
                outAttrs = ( Attributes ) inAttrs.clone();
            }

            // process the objectClass attribute
            Attribute oc = outAttrs.get( SchemaConstants.OBJECT_CLASS_AT );

            if ( oc == null )
            {
                oc = new AttributeImpl( SchemaConstants.OBJECT_CLASS_AT );
                outAttrs.put( oc );
            }

            if ( !AttributeUtils.containsValueCaseIgnore( oc, SchemaConstants.TOP_OC ) )
            {
                oc.add( SchemaConstants.TOP_OC );
            }

            PrincipalStoreEntry p = ( PrincipalStoreEntry ) obj;

            if ( !AttributeUtils.containsValueCaseIgnore( oc, SchemaConstants.UID_OBJECT_AT ) )
            {
                oc.add( SchemaConstants.UID_OBJECT_AT );

                if ( p.getUserId() != null )
                {
                    outAttrs.put( SchemaConstants.UID_AT, p.getUserId() );
                }
                else
                {
                    throw new SchemaViolationException( "Person must have uid." );
                }
            }

            if ( !AttributeUtils.containsValueCaseIgnore( oc, SchemaConstants.EXTENSIBLE_OBJECT_OC ) )
            {
                oc.add( SchemaConstants.EXTENSIBLE_OBJECT_OC );
                outAttrs.put( "apacheSamType", "7" );
            }

            if ( !( AttributeUtils.containsValueCaseIgnore( oc, SchemaConstants.PERSON_OC ) || oc
                .contains( SchemaConstants.PERSON_OC_OID ) ) )
            {
                oc.add( SchemaConstants.PERSON_OC );

                // TODO - look into adding sn, gn, and cn to ServerProfiles
                outAttrs.put( SchemaConstants.SN_AT, p.getUserId() );
                outAttrs.put( SchemaConstants.CN_AT, p.getCommonName() );
            }

            if ( !( AttributeUtils.containsValueCaseIgnore( oc, SchemaConstants.ORGANIZATIONAL_PERSON_OC ) || oc
                .contains( SchemaConstants.ORGANIZATIONAL_PERSON_OC_OID ) ) )
            {
                oc.add( SchemaConstants.ORGANIZATIONAL_PERSON_OC );
            }

            if ( !( AttributeUtils.containsValueCaseIgnore( oc, SchemaConstants.INET_ORG_PERSON_OC ) || oc
                .contains( SchemaConstants.INET_ORG_PERSON_OC_OID ) ) )
            {
                oc.add( SchemaConstants.INET_ORG_PERSON_OC );
            }

            if ( !oc.contains( "krb5Principal" ) )
            {
                oc.add( "krb5Principal" );
            }

            if ( !oc.contains( "krb5KDCEntry" ) )
            {
                oc.add( "krb5KDCEntry" );

                String principal = p.getPrincipal().getName();

                EncryptionKey encryptionKey = p.getKeyMap().get( EncryptionType.DES_CBC_MD5 );

                try
                {
                    outAttrs.put( KerberosAttribute.KEY, EncryptionKeyEncoder.encode( encryptionKey ) );
                }
                catch ( IOException ioe )
                {
                    throw new InvalidAttributeValueException( "Unable to encode Kerberos key." );
                }

                int keyVersion = encryptionKey.getKeyVersion();

                outAttrs.put( KerberosAttribute.PRINCIPAL, principal );
                outAttrs.put( KerberosAttribute.VERSION, Integer.toString( keyVersion ) );
            }

            Result r = new Result( obj, outAttrs );

            return r;
        }

        return null;
    }


    public Object getStateToBind( Object obj, Name name, Context nameCtx, Hashtable environment )
        throws NamingException
    {
        throw new UnsupportedOperationException( "Structural objectClass needed with additional attributes!" );
    }
}
