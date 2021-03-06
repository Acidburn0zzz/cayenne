/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.project.compatibility;

import java.util.Arrays;
import java.util.Collection;

import org.apache.cayenne.configuration.server.CayenneServerModuleProvider;
import org.apache.cayenne.configuration.server.ServerModule;
import org.apache.cayenne.di.Module;
import org.apache.cayenne.project.ProjectModule;

/**
 * @since 4.1
 */
public class ProjectCompatibilityModuleProvider implements CayenneServerModuleProvider {

    @Override
    public Module module() {
        return new ProjectCompatibilityModule();
    }

    @Override
    public Class<? extends Module> moduleType() {
        return ProjectCompatibilityModule.class;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<Class<? extends Module>> overrides() {
        // compatibility module overrides XML loaders defined in ServerModule and
        // upgrade services from ProjectModule
        return Arrays.asList(ServerModule.class, ProjectModule.class);
    }
}
