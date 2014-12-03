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

/**
 * An ordered collection of <code>char</code> values.
 *
 * @see org.apache.commons.collections.primitives.adapters.CharListList
 * @see org.apache.commons.collections.primitives.adapters.ListCharList
 *
 * @since Commons Primitives 1.0
 * @version $Revision$ $Date$
 * 
 * @author Rodney Waldhoff 
 */
public interface CharList extends CharCollection {
    /** 
     * Appends the specified element to the end of me
     * (optional operation).  Returns <code>true</code>
     * iff I changed as a result of this call.
     * <p>
     * If a collection refuses to add the specified
     * element for any reason other than that it already contains
     * the element, it <i>must</i> throw an exception (rather than
     * simply returning {@code false}).  This preserves the invariant
     * that a collection always contains the specified element after 
     * this call returns. 
     * 
     * @param element the value whose presence within me is to be ensured
     * @return <code>true</code> iff I changed as a result of this call
     * 
     * @throws UnsupportedOperationException when this operation is not 
     *         supported
     * @throws IllegalArgumentException may be thrown if some aspect of the 
     *         specified element prevents it from being added to me
     */
    boolean add(char element);
       
    /** 
     * Inserts the specified element at the specified position 
     * (optional operation). Shifts the element currently 
     * at that position (if any) and any subsequent elements to the 
     * right, increasing their indices.
     * 
     * @param index the index at which to insert the element
     * @param element the value to insert
     * 
     * @throws UnsupportedOperationException when this operation is not 
     *         supported
     * @throws IllegalArgumentException if some aspect of the specified element 
     *         prevents it from being added to me
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    void add(int index, char element);
          
    /** 
     * Inserts all of the elements in the specified collection into me,
     * at the specified position (optional operation).  Shifts the 
     * element currently at that position (if any) and any subsequent 
     * elements to the right, increasing their indices.  The new elements 
     * will appear in the order that they are returned by the given 
     * collection's {@link CharCollection#iterator iterator}.
     * 
     * @param index the index at which to insert the first element from 
     *        the specified collection
     * @param collection the {@link CharCollection CharCollection} of elements to add 
     * @return <code>true</code> iff I changed as a result of this call
     * 
     * @throws UnsupportedOperationException when this operation is not 
     *         supported
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    boolean addAll(int index, CharCollection collection);
    
    /**
     * Returns <code>true</code> iff <i>that</i> is an <code>CharList</code>
     * that contains the same elements in the same order as me.
     * In other words, returns <code>true</code> iff <i>that</i> is
     * a <code>CharList</code> that has the same {@link #size() size} as me,
     * and for which the elements returned by its 
     * {@link CharList#iterator iterator} are equal (<code>==</code>) to
     * the corresponding elements within me.
     * (This contract ensures that this method works properly across 
     * different implementations of the <code>CharList</code> interface.)
     * 
     * @param that the object to compare to me
     * @return <code>true</code> iff <i>that</i> is an <code>CharList</code>
     *         that contains the same elements in the same order as me
     */
    boolean equals(Object that);
    
    /** 
     * Returns the value of the element at the specified position 
     * within me. 
     * 
     * @param index the index of the element to return
     * @return the value of the element at the specified position
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    char get(int index);
        
    /**
     * Returns my hash code.
     * <p>
     * The hash code of an <code>CharList</code> is defined to be the
     * result of the following calculation:
     * <pre> int hash = 1;
     * for(CharIterator iter = iterator(); iter.hasNext(); ) {
     *   char value = iter.next();
     *   hash = 31*hash + (int)(value ^ (value &gt;&gt;&gt; 32));
     * }</pre>
     * <p>
     * This contract ensures that this method is consistent with 
     * {@link #equals equals} and with the 
     * {@link java.util.List#hashCode hashCode}
     * method of a {@link java.util.List List} of {@link Character}s. 
     * 
     * @return my hash code
     */
    int hashCode();

    /** 
     * Returns the index of the first occurrence 
     * of the specified element within me, 
     * or <code>-1</code> if I do not contain 
     * the element. 
     * 
     * @param element the element to search for
     * @return the smallest index of an element matching the specified value,
     *         or <code>-1</code> if no such matching element can be found 
     */
    int indexOf(char element);
     
    /** 
     * Returns an {@link CharIterator iterator} over all my elements,
     * in the appropriate sequence.
     * @return an {@link CharIterator iterator} over all my elements.
     */
    CharIterator iterator();

    /** 
     * Returns the index of the last occurrence 
     * of the specified element within me, 
     * or -1 if I do not contain the element. 
     * 
     * @param element the element to search for
     * @return the largest index of an element matching the specified value,
     *         or <code>-1</code> if no such matching element can be found 
     */
    int lastIndexOf(char element);
    
    /** 
     * Returns a 
     * {@link CharListIterator bidirectional iterator}
     * over all my elements, in the appropriate sequence.
     */
    CharListIterator listIterator();
    
    /** 
     * Returns a 
     * {@link CharListIterator bidirectional iterator}
     * over all my elements, in the appropriate sequence, 
     * starting at the specified position. The 
     * specified <i>index</i> indicates the first 
     * element that would be returned by an initial 
     * call to the 
     * {@link CharListIterator#next next} 
     * method. An initial call to the 
     * {@link CharListIterator#previous previous}
     * method would return the element with the specified 
     * <i>index</i> minus one.
     * 
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    CharListIterator listIterator(int index);
    
    /** 
     * Removes the element at the specified position in 
     * (optional operation).  Any subsequent elements 
     * are shifted to the left, subtracting one from their 
     * indices.  Returns the element that was removed.
     * 
     * @param index the index of the element to remove
     * @return the value of the element that was removed
     * 
     * @throws UnsupportedOperationException when this operation is not 
     *         supported
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    char removeElementAt(int index);
   
    /** 
     * Replaces the element at the specified 
     * position in me with the specified element
     * (optional operation). 
     * 
     * @param index the index of the element to change
     * @param element the value to be stored at the specified position
     * @return the value previously stored at the specified position
     * 
     * @throws UnsupportedOperationException when this operation is not 
     *         supported
     * @throws IndexOutOfBoundsException if the specified index is out of range
     */
    char set(int index, char element);
    
    /** 
     * Returns a view of the elements within me 
     * between the specified <i>fromIndex</i>, inclusive, and 
     * <i>toIndex</i>, exclusive.  The returned <code>CharList</code>
     * is backed by me, so that any changes in 
     * the returned list are reflected in me, and vice-versa.
     * The returned list supports all of the optional operations
     * that I support.
     * <p>
     * Note that when <code><i>fromIndex</i> == <i>toIndex</i></code>,
     * the returned list is initially empty, and when 
     * <code><i>fromIndex</i> == 0 &amp;&amp; <i>toIndex</i> == {@link #size() size()}</code>
     * the returned list is my "improper" sublist, containing all my elements.
     * <p>
     * The semantics of the returned list become undefined
     * if I am structurally modified in any way other than 
     * via the returned list.
     * 
     * @param fromIndex the smallest index (inclusive) in me that appears in 
     *        the returned list
     * @param toIndex the largest index (exclusive) in me that appears in the 
     *        returned list
     * @return a view of this list from <i>fromIndex</i> (inclusive) to 
     *         <i>toIndex</i> (exclusive)
     * 
     * @throws IndexOutOfBoundsException if either specified index is out of range
     */
    CharList subList(int fromIndex, int toIndex);

}
