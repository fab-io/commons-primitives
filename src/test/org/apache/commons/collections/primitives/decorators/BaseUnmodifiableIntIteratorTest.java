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

import junit.framework.TestCase;

import org.apache.commons.collections.primitives.ArrayIntList;
import org.apache.commons.collections.primitives.IntIterator;
import org.apache.commons.collections.primitives.IntList;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public abstract class BaseUnmodifiableIntIteratorTest extends TestCase {

    // conventional
    // ------------------------------------------------------------------------

    public BaseUnmodifiableIntIteratorTest(String testName) {
        super(testName);
    }
    

    // framework
    // ------------------------------------------------------------------------
    protected abstract IntIterator makeUnmodifiableIntIterator();

    protected IntIterator makeIntIterator() {
        IntList list = new ArrayIntList();
        for(int i=0;i<10;i++) {
            list.add(i);
        }
        return list.iterator();
    }

    // tests
    // ------------------------------------------------------------------------

    public final void testIntIteratorNotModifiable() {
        IntIterator iter = makeUnmodifiableIntIterator();
        assertTrue(iter.hasNext());
        iter.next();
        try {
            iter.remove();
            fail("Expected UnsupportedOperationException");
        } catch(UnsupportedOperationException e) {
            // expected
        }
    }

    public final void testIterateIntIterator() {        
        IntIterator iter = makeUnmodifiableIntIterator();
        for(IntIterator expected = makeIntIterator(); expected.hasNext(); ) {
            assertTrue(iter.hasNext());
            assertEquals(expected.next(),iter.next());
        }
        assertTrue(! iter.hasNext() );
    }

}