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
package org.apache.directory.server.installers.rpm;


import java.io.File;

import org.apache.directory.server.installers.Target;


/**
 * An Rpm package target.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class RpmTarget extends Target
{
    /** The rpmbuild utility executable */
    private File rpmBuild = new File( "/usr/bin/rpmbuild" );


    /**
     * Creates a new instance of RpmTarget.
     */
    public RpmTarget()
    {
        setOsName( Target.OS_NAME_LINUX );
        setOsArch( Target.OS_ARCH_I386 );
    }


    /**
     * Sets the rpmbuild utility.
     *
     * @param rpmBuild
     *      the the rpmbuild utility
     */
    public void setRpmBuild( File rpmBuild )
    {
        this.rpmBuild = rpmBuild;
    }


    /**
     * Gets the rpmbuild utility.
     *
     * @return
     *      the rpmbuild utility
     */
    public File getRpmBuild()
    {
        return rpmBuild;
    }
}
