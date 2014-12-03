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

import java.util.ListIterator;

import org.apache.commons.collections.primitives.DoubleListIterator;

/**
 * Adapts an {@link DoubleListIterator DoubleListIterator} to the
 * {@link ListIterator ListIterator} interface.
 * <p>
 * This implementation delegates most methods
 * to the provided {@link DoubleListIterator DoubleListIterator} 
 * implementation in the "obvious" way.
 *
 * @since Commons Primitives 1.0
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff 
 */
public class DoubleListIteratorListIterator implements ListIterator {
    
    /**
     * Create a {@link ListIterator ListIterator} wrapping
     * the specified {@link DoubleListIterator DoubleListIterator}.  When
     * the given <i>iterator</i> is <code>null</code>,
     * returns <code>null</code>.
     * 
     * @param iterator the (possibly <code>null</code>) 
     *        {@link DoubleListIterator DoubleListIterator} to wrap
     * @return a {@link ListIterator ListIterator} wrapping the given 
     *         <i>iterator</i>, or <code>null</code> when <i>iterator</i> is
     *         <code>null</code>.
     */
    public static ListIterator wrap(DoubleListIterator iterator) {
        return null == iterator ? null : new DoubleListIteratorListIterator(iterator);
    }
    
    /**
     * Creates an {@link ListIterator ListIterator} wrapping
     * the specified {@link DoubleListIterator DoubleListIterator}.
     * @see #wrap
     */
    public DoubleListIteratorListIterator(DoubleListIterator iterator) {
        _iterator = iterator;
    }
    
    public int nextIndex() {
        return _iterator.nextIndex();
    }

    public int previousIndex() {
        return _iterator.previousIndex();
    }

    public boolean hasNext() {
        return _iterator.hasNext();
    }

    public boolean hasPrevious() {
        return _iterator.hasPrevious();
    }
    
    public Object next() {
        return new Double(_iterator.next());
    }

    public Object previous() {
        return new Double(_iterator.previous());
    }

    public void add(Object obj) {
        _iterator.add(((Number)obj).doubleValue());
    }
      
    public void set(Object obj) {
        _iterator.set(((Number)obj).doubleValue());
    }

    public void remove() {
        _iterator.remove();
    }
          
    private DoubleListIterator _iterator = null;

}
