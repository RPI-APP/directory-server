/*
 *   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.ldap.server.invocation;


import javax.naming.Name;
import javax.naming.NamingException;

import org.apache.ldap.server.partition.ContextPartition;


/**
 * Represents an {@link Invocation} on {@link ContextPartition#isSuffix(Name)}.
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 * @version $Rev$, $Date$
 */
public class IsSuffix extends EntryInvocation
{
    private static final long serialVersionUID = 3256723987429273908L;

    public IsSuffix( Name name )
    {
        super( name );
    }


    protected Object doExecute( ContextPartition store ) throws NamingException
    {
        return store.isSuffix( getName() ) ? Boolean.TRUE : Boolean.FALSE;
    }
}
