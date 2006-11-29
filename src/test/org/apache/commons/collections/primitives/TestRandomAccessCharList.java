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
package org.apache.commons.collections.primitives;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public class TestRandomAccessCharList extends TestCase {

    // conventional
    // ------------------------------------------------------------------------

    public TestRandomAccessCharList(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestRandomAccessCharList.class);
    }

    // tests
    // ------------------------------------------------------------------------
    
    public void testAddIsUnsupportedByDefault() {
        RandomAccessCharList list = new AbstractRandomAccessCharListImpl();
        try {
            list.add((char)1);
            fail("Expected UnsupportedOperationException");
        } catch(UnsupportedOperationException e) {
            // expected
        }        
        try {
            list.set(0,(char)1);
            fail("Expected UnsupportedOperationException");
        } catch(UnsupportedOperationException e) {
            // expected
        }               
    }

    public void testAddAllIsUnsupportedByDefault() {
        RandomAccessCharList list = new AbstractRandomAccessCharListImpl();
        CharList list2 = new ArrayCharList();
        list2.add((char)3);
        try {
            list.addAll(list2);
            fail("Expected UnsupportedOperationException");
        } catch(UnsupportedOperationException e) {
            // expected
        }               
    }
    
    public void testSetIsUnsupportedByDefault() {
        RandomAccessCharList list = new AbstractRandomAccessCharListImpl();
        try {
            list.set(0,(char)1);
            fail("Expected UnsupportedOperationException");
        } catch(UnsupportedOperationException e) {
            // expected
        }               
    }
    
    public void testRemoveElementIsUnsupportedByDefault() {
        RandomAccessCharList list = new AbstractRandomAccessCharListImpl();
        try {
            list.removeElementAt(0);
            fail("Expected UnsupportedOperationException");
        } catch(UnsupportedOperationException e) {
            // expected
        }               
    }
    
    // inner classes
    // ------------------------------------------------------------------------


    static class AbstractRandomAccessCharListImpl extends RandomAccessCharList {
        public AbstractRandomAccessCharListImpl() {
        }

        /**
         * @see org.apache.commons.collections.primitives.CharList#get(int)
         */
        public char get(int index) {
            throw new IndexOutOfBoundsException();
        }

        /**
         * @see org.apache.commons.collections.primitives.CharCollection#size()
         */
        public int size() {
            return 0;
        }

    }
}
