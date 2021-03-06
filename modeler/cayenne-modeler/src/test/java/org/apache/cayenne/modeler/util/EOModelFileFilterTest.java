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

package org.apache.cayenne.modeler.util;

import org.junit.Before;
import org.junit.Test;

import javax.swing.filechooser.FileFilter;
import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 */
public class EOModelFileFilterTest {

    protected FileFilter filter;

    @Before
	public void setUp() throws Exception {
		filter = FileFilters.getEOModelFilter();
	}

    @Test
	public void testAcceptDir() throws Exception {
		assertTrue(filter.accept(new File(".")));
	}

    @Test
	public void testRejectIndexEOM() throws Exception {
		assertFalse(filter.accept(new File("index.eomodeld")));
	}

    @Test
	public void testAcceptIndexEOM() throws Exception {
		assertTrue(filter.accept(new File("some.eomodeld/index.eomodeld")));
	}

    @Test
	public void testRejectOther() throws Exception {
		assertFalse(filter.accept(new File("somefile.txt")));
	}
}

