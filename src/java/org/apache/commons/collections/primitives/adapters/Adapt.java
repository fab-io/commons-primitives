/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//primitives/src/java/org/apache/commons/collections/primitives/adapters/Adapt.java,v 1.1 2003/12/04 22:57:19 rwaldhoff Exp $
 * ====================================================================
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2003 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowledgement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgement may appear in the software itself,
 *    if and wherever such third-party acknowledgements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.commons.collections.primitives.adapters;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.collections.primitives.ByteCollection;
import org.apache.commons.collections.primitives.ByteIterator;
import org.apache.commons.collections.primitives.ByteList;
import org.apache.commons.collections.primitives.ByteListIterator;
import org.apache.commons.collections.primitives.CharCollection;
import org.apache.commons.collections.primitives.CharIterator;
import org.apache.commons.collections.primitives.CharList;
import org.apache.commons.collections.primitives.CharListIterator;
import org.apache.commons.collections.primitives.DoubleCollection;
import org.apache.commons.collections.primitives.DoubleIterator;
import org.apache.commons.collections.primitives.DoubleList;
import org.apache.commons.collections.primitives.DoubleListIterator;
import org.apache.commons.collections.primitives.FloatCollection;
import org.apache.commons.collections.primitives.FloatIterator;
import org.apache.commons.collections.primitives.FloatList;
import org.apache.commons.collections.primitives.FloatListIterator;
import org.apache.commons.collections.primitives.IntCollection;
import org.apache.commons.collections.primitives.IntIterator;
import org.apache.commons.collections.primitives.IntList;
import org.apache.commons.collections.primitives.IntListIterator;
import org.apache.commons.collections.primitives.LongCollection;
import org.apache.commons.collections.primitives.LongIterator;
import org.apache.commons.collections.primitives.LongList;
import org.apache.commons.collections.primitives.LongListIterator;
import org.apache.commons.collections.primitives.ShortCollection;
import org.apache.commons.collections.primitives.ShortIterator;
import org.apache.commons.collections.primitives.ShortList;
import org.apache.commons.collections.primitives.ShortListIterator;

/**
 * Convenience methods for constructing adapters.
 *  
 * @since Commons Primitives 1.1
 * @version $Revision: 1.1 $ $Date: 2003/12/04 22:57:19 $
 * @author Rodney Waldhoff 
 */
public final class Adapt {
    public Adapt() {
    }
    
    public static final Collection toCollection(ByteCollection c) {
        return ByteCollectionCollection.wrap(c);
    }
    
    public static final Collection toCollection(CharCollection c) {
        return CharCollectionCollection.wrap(c);
    }
    
    public static final Collection toCollection(DoubleCollection c) {
        return DoubleCollectionCollection.wrap(c);
    }
    
    public static final Collection toCollection(FloatCollection c) {
        return FloatCollectionCollection.wrap(c);
    }
    
    public static final Collection toCollection(IntCollection c) {
        return IntCollectionCollection.wrap(c);
    }
    
    public static final Collection toCollection(LongCollection c) {
        return LongCollectionCollection.wrap(c);
    }
    
    public static final Collection toCollection(ShortCollection c) {
        return ShortCollectionCollection.wrap(c);
    }

    public static final List toList(ByteList c) {
        return ByteListList.wrap(c);
    }
    
    public static final List toList(CharList c) {
        return CharListList.wrap(c);
    }
    
    public static final List toList(DoubleList c) {
        return DoubleListList.wrap(c);
    }
    
    public static final List toList(FloatList c) {
        return FloatListList.wrap(c);
    }
    
    public static final List toList(IntList c) {
        return IntListList.wrap(c);
    }
    
    public static final List toList(LongList c) {
        return LongListList.wrap(c);
    }
    
    public static final List toList(ShortList c) {
        return ShortListList.wrap(c);
    }

    public static final Iterator toIterator(ByteIterator c) {
        return ByteIteratorIterator.wrap(c);
    }
    
    public static final Iterator toIterator(CharIterator c) {
        return CharIteratorIterator.wrap(c);
    }
    
    public static final Iterator toIterator(DoubleIterator c) {
        return DoubleIteratorIterator.wrap(c);
    }
    
    public static final Iterator toIterator(FloatIterator c) {
        return FloatIteratorIterator.wrap(c);
    }
    
    public static final Iterator toIterator(IntIterator c) {
        return IntIteratorIterator.wrap(c);
    }
    
    public static final Iterator toIterator(LongIterator c) {
        return LongIteratorIterator.wrap(c);
    }
    
    public static final Iterator toIterator(ShortIterator c) {
        return ShortIteratorIterator.wrap(c);
    }

    public static final ListIterator toListIterator(ByteListIterator c) {
        return ByteListIteratorListIterator.wrap(c);
    }
    
    public static final ListIterator toListIterator(CharListIterator c) {
        return CharListIteratorListIterator.wrap(c);
    }
    
    public static final ListIterator toListIterator(DoubleListIterator c) {
        return DoubleListIteratorListIterator.wrap(c);
    }
    
    public static final ListIterator toListIterator(FloatListIterator c) {
        return FloatListIteratorListIterator.wrap(c);
    }
    
    public static final ListIterator toListIterator(IntListIterator c) {
        return IntListIteratorListIterator.wrap(c);
    }
    
    public static final ListIterator toListIterator(LongListIterator c) {
        return LongListIteratorListIterator.wrap(c);
    }
    
    public static final ListIterator toListIterator(ShortListIterator c) {
        return ShortListIteratorListIterator.wrap(c);
    }

}