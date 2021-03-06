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

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.collections.primitives.ByteIterator;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public class TestUnmodifiableByteIterator extends BaseUnmodifiableByteIteratorTest {

    // conventional
    // ------------------------------------------------------------------------

    public TestUnmodifiableByteIterator(String testName) {
        super(testName);
    }
    

    public static Test suite() {
        return new TestSuite(TestUnmodifiableByteIterator.class);
    }

    // framework
    // ------------------------------------------------------------------------

    protected ByteIterator makeUnmodifiableByteIterator() {
        return UnmodifiableByteIterator.wrap(makeByteIterator());
    }

    // tests
    // ------------------------------------------------------------------------

    public void testWrapNotNull() {
        assertNotNull(UnmodifiableByteIterator.wrap(makeByteIterator()));
    }

    public void testWrapNull() {
        assertNull(UnmodifiableByteIterator.wrap(null));
    }

    public void testWrapUnmodifiableByteIterator() {
        ByteIterator iter = makeUnmodifiableByteIterator();
        assertSame(iter,UnmodifiableByteIterator.wrap(iter));
    }

}