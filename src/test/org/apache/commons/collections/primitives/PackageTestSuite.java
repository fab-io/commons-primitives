/*
 * Copyright 2002-2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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
 * Test this package.
 * 
 * @version $Revision: 1.9 $ $Date: 2004/02/25 20:46:30 $
 * @author Rodney Waldhoff
 */
public class PackageTestSuite extends TestCase {
    public PackageTestSuite(String testName) {
        super(testName);
    }

    public static void main(String args[]) {
        String[] testCaseName = { PackageTestSuite.class.getName() };
        junit.textui.TestRunner.main(testCaseName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();

        suite.addTest(TestByteCollections.suite());
        suite.addTest(TestAbstractByteCollection.suite());
        suite.addTest(TestRandomAccessByteList.suite());
        suite.addTest(TestArrayByteList.suite());

        suite.addTest(TestShortCollections.suite());
        suite.addTest(TestAbstractShortCollection.suite());
        suite.addTest(TestRandomAccessShortList.suite());
        suite.addTest(TestArrayShortList.suite());
        suite.addTest(TestArrayUnsignedByteList.suite());

        suite.addTest(TestCharCollections.suite());
        suite.addTest(TestAbstractCharCollection.suite());
        suite.addTest(TestRandomAccessCharList.suite());
        suite.addTest(TestArrayCharList.suite());

        suite.addTest(TestIntCollections.suite());
        suite.addTest(TestAbstractIntCollection.suite());
        suite.addTest(TestRandomAccessIntList.suite());
        suite.addTest(TestArrayIntList.suite());
        suite.addTest(TestArrayUnsignedShortList.suite());

        suite.addTest(TestLongCollections.suite());
		suite.addTest(TestAbstractLongCollection.suite());
		suite.addTest(TestRandomAccessLongList.suite());
        suite.addTest(TestArrayLongList.suite());
        suite.addTest(TestArrayUnsignedIntList.suite());

        suite.addTest(TestFloatCollections.suite());
        suite.addTest(TestAbstractFloatCollection.suite());
        suite.addTest(TestRandomAccessFloatList.suite());
        suite.addTest(TestArrayFloatList.suite());

        suite.addTest(TestDoubleCollections.suite());
        suite.addTest(TestAbstractDoubleCollection.suite());
        suite.addTest(TestRandomAccessDoubleList.suite());
        suite.addTest(TestArrayDoubleList.suite());

        return suite;
    }
}

