/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections.primitives.decorators;

import java.io.Serializable;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.collections.primitives.IntList;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public class TestUnmodifiableIntList extends BaseUnmodifiableIntListTest {

    // conventional
    // ------------------------------------------------------------------------

    public TestUnmodifiableIntList(String testName) {
        super(testName);
    }
    

    public static Test suite() {
        return new TestSuite(TestUnmodifiableIntList.class);
    }

    // framework
    // ------------------------------------------------------------------------

    protected IntList makeUnmodifiableIntList() {
        return UnmodifiableIntList.wrap(makeIntList());
    }

    // tests
    // ------------------------------------------------------------------------

    public void testWrapNull() {
        assertNull(UnmodifiableIntList.wrap(null));
    }

    public void testWrapUnmodifiableIntList() {
        IntList list = makeUnmodifiableIntList();
        assertSame(list,UnmodifiableIntList.wrap(list));
    }

    public void testWrapSerializableIntList() {
        IntList list = makeIntList();
        assertTrue(list instanceof Serializable);
        assertTrue(UnmodifiableIntList.wrap(list) instanceof Serializable);
    }

    public void testWrapNonSerializableIntList() {
        IntList list = makeIntList();
        IntList ns = list.subList(0,list.size());
        assertTrue(!(ns instanceof Serializable));
        assertTrue(!(UnmodifiableIntList.wrap(ns) instanceof Serializable));
    }
}