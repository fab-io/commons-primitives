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
package org.apache.commons.collections.primitives.adapters;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.collections.AbstractTestObject;
import org.apache.commons.collections.primitives.CharCollection;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public class TestCollectionCharCollection extends AbstractTestObject {

    // conventional
    // ------------------------------------------------------------------------

    public TestCollectionCharCollection(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestCollectionCharCollection.class);
    }

    // collections testing framework
    // ------------------------------------------------------------------------

    public Object makeObject() {
        List list = new ArrayList();
        for(int i=0;i<10;i++) {
            list.add(new Character((char)i));
        }
        return new CollectionCharCollection(list);
    }

    public void testSerializeDeserializeThenCompare() {
        // Collection.equal contract doesn't work that way
    }

    /** @TODO need to add serialized form to cvs */
    public void testCanonicalEmptyCollectionExists() {
        // XXX FIX ME XXX
        // need to add a serialized form to cvs
    }

    public void testCanonicalFullCollectionExists() {
        // XXX FIX ME XXX
        // need to add a serialized form to cvs
    }
    
    // tests
    // ------------------------------------------------------------------------

    public void testWrapNull() {
        assertNull(CollectionCharCollection.wrap(null));
    }
    
    public void testWrapSerializable() {
        CharCollection collection = CollectionCharCollection.wrap(new ArrayList());
        assertNotNull(collection);
        assertTrue(collection instanceof Serializable);
    }
    
    public void testWrapNonSerializable() {
        CharCollection collection = CollectionCharCollection.wrap(new AbstractList() { 
            public Object get(int i) { throw new IndexOutOfBoundsException(); } 
            public int size() { return 0; } 
        });
        assertNotNull(collection);
        assertTrue(!(collection instanceof Serializable));
    }

}
