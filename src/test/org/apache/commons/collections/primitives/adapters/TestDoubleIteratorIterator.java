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

import java.util.Iterator;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.commons.collections.iterators.AbstractTestIterator;
import org.apache.commons.collections.primitives.ArrayDoubleList;
import org.apache.commons.collections.primitives.DoubleList;

/**
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff
 */
public class TestDoubleIteratorIterator extends AbstractTestIterator {

    // conventional
    // ------------------------------------------------------------------------

    public TestDoubleIteratorIterator(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(TestDoubleIteratorIterator.class);
    }

    // collections testing framework
    // ------------------------------------------------------------------------

    public Iterator makeEmptyIterator() {
        return DoubleIteratorIterator.wrap(makeEmptyDoubleList().iterator());
    }
    
    public Iterator makeFullIterator() {
        return DoubleIteratorIterator.wrap(makeFullDoubleList().iterator());
    }

    protected DoubleList makeEmptyDoubleList() {
        return new ArrayDoubleList();
    }
    
    protected DoubleList makeFullDoubleList() {
        DoubleList list = makeEmptyDoubleList();
        double[] elts = getFullElements();
        for(int i=0;i<elts.length;i++) {
            list.add((double)elts[i]);
        }
        return list;
    }
    
    public double[] getFullElements() {
        return new double[] { (double)0, (double)1, (double)2, (double)3, (double)4, (double)5, (double)6, (double)7, (double)8, (double)9 };
    }
    
    // tests
    // ------------------------------------------------------------------------


}
