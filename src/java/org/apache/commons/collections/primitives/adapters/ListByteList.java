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
import java.util.List;

import org.apache.commons.collections.primitives.ByteList;

/**
 * Adapts a {@link Number}-valued {@link List List} 
 * to the {@link ByteList ByteList} interface.
 * <p>
 * This implementation delegates most methods
 * to the provided {@link List List} 
 * implementation in the "obvious" way.
 *
 * @since Commons Primitives 1.0
 * @version $Revision$ $Date$
 * @author Rodney Waldhoff 
 */
public class ListByteList extends AbstractListByteList implements Serializable {
    
    /**
     * Create an {@link ByteList ByteList} wrapping
     * the specified {@link List List}.  When
     * the given <i>list</i> is <code>null</code>,
     * returns <code>null</code>.
     * 
     * @param list the (possibly <code>null</code>) 
     *        {@link List List} to wrap
     * @return a {@link ByteList ByteList} wrapping the given 
     *         <i>list</i>, or <code>null</code> when <i>list</i> is
     *         <code>null</code>.
     */
    public static ByteList wrap(List list) {
        if(null == list) {
            return null;
        } else if(list instanceof Serializable) {
            return new ListByteList(list);
        } else {
            return new NonSerializableListByteList(list);
        }
    }

    /**
     * Creates an {@link ByteList ByteList} wrapping
     * the specified {@link List List}.
     * @see #wrap
     */
    public ListByteList(List list) {
        _list = list;     
    }
    
    protected List getList() {
        return _list;
    }
        
    private List _list = null;
    
}
