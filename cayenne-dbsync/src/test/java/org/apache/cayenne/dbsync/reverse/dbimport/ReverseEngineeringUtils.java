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

package org.apache.cayenne.dbsync.reverse.dbimport;

import java.util.Iterator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReverseEngineeringUtils {

    public static void assertCatalog(ReverseEngineering engineering) {
        Iterator<Catalog> catalogs = engineering.getCatalogs().iterator();
        assertEquals("catalog-name-01", catalogs.next().getName());
        assertEquals("catalog-name-02", catalogs.next().getName());

        assertCatalog(catalogs.next());
    }

    public static void assertCatalog(Catalog catalog ) {
        assertEquals("catalog-name-03", catalog.getName());

        Iterator<IncludeTable> includeTables = catalog.getIncludeTables().iterator();
        assertEquals("includeTable-01", includeTables.next().getPattern());
        assertEquals("includeTable-02", includeTables.next().getPattern());

        IncludeTable includeTable = includeTables.next();
        assertEquals("includeTable-03", includeTable.getPattern());
        assertEquals("includeColumn-01", includeTable.getIncludeColumns().iterator().next().getPattern());
        assertEquals("excludeColumn-01", includeTable.getExcludeColumns().iterator().next().getPattern());

        Iterator<ExcludeTable> excludeTables = catalog.getExcludeTables().iterator();
        assertEquals("excludeTable-01", excludeTables.next().getPattern());
        assertEquals("excludeTable-02", excludeTables.next().getPattern());
        assertEquals("excludeTable-03", excludeTables.next().getPattern());

        Iterator<ExcludeColumn> excludeColumns = catalog.getExcludeColumns().iterator();
        assertEquals("excludeColumn-01", excludeColumns.next().getPattern());
        assertEquals("excludeColumn-02", excludeColumns.next().getPattern());
        assertEquals("excludeColumn-03", excludeColumns.next().getPattern());
        Iterator<IncludeColumn> includeColumns = catalog.getIncludeColumns().iterator();
        assertEquals("includeColumn-01", includeColumns.next().getPattern());
        assertEquals("includeColumn-02", includeColumns.next().getPattern());
        assertEquals("includeColumn-03", includeColumns.next().getPattern());

        Iterator<ExcludeProcedure> excludeProcedures = catalog.getExcludeProcedures().iterator();
        assertEquals("excludeProcedure-01", excludeProcedures.next().getPattern());
        assertEquals("excludeProcedure-02", excludeProcedures.next().getPattern());
        assertEquals("excludeProcedure-03", excludeProcedures.next().getPattern());
        Iterator<IncludeProcedure> includeProcedures = catalog.getIncludeProcedures().iterator();
        assertEquals("includeProcedure-01", includeProcedures.next().getPattern());
        assertEquals("includeProcedure-02", includeProcedures.next().getPattern());
        assertEquals("includeProcedure-03", includeProcedures.next().getPattern());
    }

    public static void assertSchema(ReverseEngineering engineering) {
        Iterator<Schema> schemas = engineering.getSchemas().iterator();
        assertEquals("schema-name-01", schemas.next().getName());
        assertEquals("schema-name-02", schemas.next().getName());

        Schema schema = schemas.next();
        assertEquals("schema-name-03", schema.getName());

        assertSchemaContent(schema);
    }

    public static void assertSchemaContent(Schema schema) {
        Iterator<IncludeTable> includeTables = schema.getIncludeTables().iterator();
        assertEquals("includeTable-01", includeTables.next().getPattern());
        assertEquals("includeTable-02", includeTables.next().getPattern());

        IncludeTable includeTable = includeTables.next();
        assertEquals("includeTable-03", includeTable.getPattern());
        assertEquals("includeColumn-01", includeTable.getIncludeColumns().iterator().next().getPattern());
        assertEquals("excludeColumn-01", includeTable.getExcludeColumns().iterator().next().getPattern());

        Iterator<ExcludeTable> excludeTables = schema.getExcludeTables().iterator();
        assertEquals("excludeTable-01", excludeTables.next().getPattern());
        assertEquals("excludeTable-02", excludeTables.next().getPattern());
        assertEquals("excludeTable-03", excludeTables.next().getPattern());

        Iterator<ExcludeColumn> excludeColumns = schema.getExcludeColumns().iterator();
        assertEquals("excludeColumn-01", excludeColumns.next().getPattern());
        assertEquals("excludeColumn-02", excludeColumns.next().getPattern());
        assertEquals("excludeColumn-03", excludeColumns.next().getPattern());
        Iterator<IncludeColumn> includeColumns = schema.getIncludeColumns().iterator();
        assertEquals("includeColumn-01", includeColumns.next().getPattern());
        assertEquals("includeColumn-02", includeColumns.next().getPattern());
        assertEquals("includeColumn-03", includeColumns.next().getPattern());

        Iterator<ExcludeProcedure> excludeProcedures = schema.getExcludeProcedures().iterator();
        assertEquals("excludeProcedure-01", excludeProcedures.next().getPattern());
        assertEquals("excludeProcedure-02", excludeProcedures.next().getPattern());
        assertEquals("excludeProcedure-03", excludeProcedures.next().getPattern());
        Iterator<IncludeProcedure> includeProcedures = schema.getIncludeProcedures().iterator();
        assertEquals("includeProcedure-01", includeProcedures.next().getPattern());
        assertEquals("includeProcedure-02", includeProcedures.next().getPattern());
        assertEquals("includeProcedure-03", includeProcedures.next().getPattern());
    }

    public static void assertCatalogAndSchema(ReverseEngineering engineering) {
        Catalog catalog = engineering.getCatalogs().iterator().next();
        assertEquals("catalog-name", catalog.getName());

        Schema schema = catalog.getSchemas().iterator().next();
        assertEquals("schema-name", schema.getName());

        assertSchemaContent(schema);
    }

    public static void assertFlat(ReverseEngineering engineering) {
        Iterator<IncludeTable> includeTables = engineering.getIncludeTables().iterator();
        assertEquals("includeTable-01", includeTables.next().getPattern());
        assertEquals("includeTable-02", includeTables.next().getPattern());

        IncludeTable includeTable = includeTables.next();
        assertEquals("includeTable-03", includeTable.getPattern());
        assertEquals("includeColumn-01", includeTable.getIncludeColumns().iterator().next().getPattern());
        assertEquals("excludeColumn-01", includeTable.getExcludeColumns().iterator().next().getPattern());

        Iterator<ExcludeTable> excludeTables = engineering.getExcludeTables().iterator();
        assertEquals("excludeTable-01", excludeTables.next().getPattern());
        assertEquals("excludeTable-02", excludeTables.next().getPattern());
        assertEquals("excludeTable-03", excludeTables.next().getPattern());

        Iterator<ExcludeColumn> excludeColumns = engineering.getExcludeColumns().iterator();
        assertEquals("excludeColumn-01", excludeColumns.next().getPattern());
        assertEquals("excludeColumn-02", excludeColumns.next().getPattern());
        assertEquals("excludeColumn-03", excludeColumns.next().getPattern());
        Iterator<IncludeColumn> includeColumns = engineering.getIncludeColumns().iterator();
        assertEquals("includeColumn-01", includeColumns.next().getPattern());
        assertEquals("includeColumn-02", includeColumns.next().getPattern());
        assertEquals("includeColumn-03", includeColumns.next().getPattern());

        Iterator<ExcludeProcedure> excludeProcedures = engineering.getExcludeProcedures().iterator();
        assertEquals("excludeProcedure-01", excludeProcedures.next().getPattern());
        assertEquals("excludeProcedure-02", excludeProcedures.next().getPattern());
        assertEquals("excludeProcedure-03", excludeProcedures.next().getPattern());
        Iterator<IncludeProcedure> includeProcedures = engineering.getIncludeProcedures().iterator();
        assertEquals("includeProcedure-01", includeProcedures.next().getPattern());
        assertEquals("includeProcedure-02", includeProcedures.next().getPattern());
        assertEquals("includeProcedure-03", includeProcedures.next().getPattern());
    }

    public static void assertSkipRelationshipsLoading(ReverseEngineering engineering) {
        assertTrue(engineering.getSkipRelationshipsLoading());
    }

    public static void assertSkipPrimaryKeyLoading(ReverseEngineering engineering) {
        assertTrue(engineering.getSkipPrimaryKeyLoading());
    }

    public static void assertTableTypes(ReverseEngineering engineering) {
        assertArrayEquals(new String[]{"type1", "type2", "type3"}, engineering.getTableTypes());
    }
}
