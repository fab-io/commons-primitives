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
package org.apache.commons.collections.primitives.adapters.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.collections.primitives.ByteIterator;
import org.apache.commons.collections.primitives.TestByteIterator;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public class TestInputStreamByteIterator extends TestByteIterator {

    // conventional
    // ------------------------------------------------------------------------

    public TestInputStreamByteIterator(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestInputStreamByteIterator.class);
    }

    // ------------------------------------------------------------------------
    
    public boolean supportsRemove() {
        return false;
    }

    protected ByteIterator makeEmptyByteIterator() {
        return new InputStreamByteIterator(new ByteArrayInputStream(new byte[0]));
    }

    protected ByteIterator makeFullByteIterator() {
        return new InputStreamByteIterator(new ByteArrayInputStream(getFullElements()));
    }

    protected byte[] getFullElements() {
        byte[] bytes = new byte[256];
        for(int i=0; i < 256; i++) {
            bytes[i] = (byte)(i-128);
        }
        return bytes;
    }


    // ------------------------------------------------------------------------
    
    public void testErrorThrowingStream() {
        InputStream errStream = new InputStream() {
            public int read() throws IOException {
                throw new IOException();
            }
        };
        
        ByteIterator iter = new InputStreamByteIterator(errStream);
        try {
            iter.hasNext();
            fail("Expected RuntimeException");
        } catch(RuntimeException e) {
            // expected
        } 
        try {
            iter.next();
            fail("Expected RuntimeException");
        } catch(RuntimeException e) {
            // expected
        } 
    }
    
    public void testAdaptNull() {
        assertNull(InputStreamByteIterator.adapt(null));
    }

    public void testAdaptNonNull() {
        assertNotNull(InputStreamByteIterator.adapt(new ByteArrayInputStream(new byte[0])));
    }
}
