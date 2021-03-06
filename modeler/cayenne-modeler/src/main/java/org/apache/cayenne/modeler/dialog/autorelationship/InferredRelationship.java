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
package org.apache.cayenne.modeler.dialog.autorelationship;

import org.apache.cayenne.map.DbAttribute;
import org.apache.cayenne.map.DbEntity;

public class InferredRelationship {

    private DbEntity source;
    private DbEntity target;
    private DbAttribute joinSource;
    private DbAttribute joinTarget;
    private String name;
    private boolean toMany;

    public boolean isToMany() {
        return toMany;
    }

    public void setToMany(boolean toMany) {
        this.toMany = toMany;
    }

    public DbEntity getSource() {
        return source;
    }

    public void setSource(DbEntity source) {
        this.source = source;
    }

    public DbEntity getTarget() {
        return target;
    }

    public void setTarget(DbEntity target) {
        this.target = target;
    }

    public DbAttribute getJoinSource() {
        return joinSource;
    }

    public void setJoinSource(DbAttribute joinSource) {
        this.joinSource = joinSource;
    }

    public DbAttribute getJoinTarget() {
        return joinTarget;
    }

    public void setJoinTarget(DbAttribute joinTarget) {
        this.joinTarget = joinTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
