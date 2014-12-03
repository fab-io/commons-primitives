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
 * Adapts a {@link Number}-valued {@link ListIterator ListIterator} 
 * to the {@link DoubleListIterator DoubleListIterator} interface.
 * <p>
 * This implementation delegates most methods
 * to the provided {@link DoubleListIterator DoubleListIterator} 
 * implementation in the "obvious" way.
 *
 * @since Commons Primitives 1.0
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff 
 */
public class ListIteratorDoubleListIterator implements DoubleListIterator {
        
    /**
     * Create an {@link DoubleListIterator DoubleListIterator} wrapping
     * the specified {@link ListIterator ListIterator}.  When
     * the given <i>iterator</i> is <code>null</code>,
     * returns <code>null</code>.
     * 
     * @param iterator the (possibly <code>null</code>) 
     *        {@link ListIterator ListIterator} to wrap
     * @return an {@link DoubleListIterator DoubleListIterator} wrapping the given 
     *         <i>iterator</i>, or <code>null</code> when <i>iterator</i> is
     *         <code>null</code>.
     */
    public static DoubleListIterator wrap(ListIterator iterator) {
        return null == iterator ? null : new ListIteratorDoubleListIterator(iterator);
    }    
    
    /**
     * Creates an {@link DoubleListIterator DoubleListIterator} wrapping
     * the specified {@link ListIterator ListIterator}.
     * @see #wrap
     */
    public ListIteratorDoubleListIterator(ListIterator iterator) {
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
    
    public double next() {
        return ((Number)_iterator.next()).doubleValue();
    }

    public double previous() {
        return ((Number)_iterator.previous()).doubleValue();
    }

    public void add(double element) {
        _iterator.add(new Double(element));
    }
      
    public void set(double element) {
        _iterator.set(new Double(element));
    }

    public void remove() {
        _iterator.remove();
    }
      
    private ListIterator _iterator = null;

}
