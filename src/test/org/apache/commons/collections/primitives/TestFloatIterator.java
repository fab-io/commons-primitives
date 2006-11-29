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

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.collections.iterators.AbstractTestIterator;
import org.apache.commons.collections.primitives.adapters.FloatIteratorIterator;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public abstract class TestFloatIterator extends AbstractTestIterator {

    // conventional
    // ------------------------------------------------------------------------

    public TestFloatIterator(String testName) {
        super(testName);
    }

    // collections testing framework
    // ------------------------------------------------------------------------

    public Iterator makeEmptyIterator() {
        return FloatIteratorIterator.wrap(makeEmptyFloatIterator());
    }

    public Iterator makeFullIterator() {
        return FloatIteratorIterator.wrap(makeFullFloatIterator());
    }


    protected abstract FloatIterator makeEmptyFloatIterator();
    protected abstract FloatIterator makeFullFloatIterator();
    protected abstract float[] getFullElements();

    // tests
    // ------------------------------------------------------------------------
    
    public void testNextHasNextRemove() {
        float[] elements = getFullElements();
        FloatIterator iter = makeFullFloatIterator();
        for(int i=0;i<elements.length;i++) {
            assertTrue(iter.hasNext());
            assertEquals(elements[i],iter.next(),0f);
            if(supportsRemove()) {
                iter.remove();
            }
        }        
        assertTrue(! iter.hasNext() );
    }

    public void testEmptyFloatIterator() {
        assertTrue( ! makeEmptyFloatIterator().hasNext() );
        try {
            makeEmptyFloatIterator().next();
            fail("Expected NoSuchElementException");
        } catch(NoSuchElementException e) {
            // expected
        }
        if(supportsRemove()) {
            try {
                makeEmptyFloatIterator().remove();
                fail("Expected IllegalStateException");
            } catch(IllegalStateException e) {
                // expected
            }
        }        
    }

    public void testRemoveBeforeNext() {
        if(supportsRemove()) {
            try {
                makeFullFloatIterator().remove();
                fail("Expected IllegalStateException");
            } catch(IllegalStateException e) {
                // expected
            }
        }        
    }

    public void testRemoveAfterRemove() {
        if(supportsRemove()) {
            FloatIterator iter = makeFullFloatIterator();
            iter.next();
            iter.remove();
            try {
                iter.remove();
                fail("Expected IllegalStateException");
            } catch(IllegalStateException e) {
                // expected
            }
        }        
    }
}
