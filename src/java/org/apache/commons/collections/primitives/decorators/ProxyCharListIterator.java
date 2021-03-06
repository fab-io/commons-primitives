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

import org.apache.commons.collections.primitives.CharIterator;
import org.apache.commons.collections.primitives.CharListIterator;

/**
 * 
 * @since Commons Primitives 1.0
 * @version $Revision$ $Date$
 * 
 * @author Rodney Waldhoff 
 */
abstract class ProxyCharListIterator extends ProxyCharIterator implements CharListIterator {
    ProxyCharListIterator() {
    }
    
    public boolean hasPrevious() {
        return getListIterator().hasPrevious();
    }

    public int nextIndex() {
        return getListIterator().nextIndex();
    }

    public char previous() {
        return getListIterator().previous();
    }

    public int previousIndex() {
        return getListIterator().previousIndex();
    }

    protected final CharIterator getIterator() {
        return getListIterator();    
    }

    protected abstract CharListIterator getListIterator();

}
