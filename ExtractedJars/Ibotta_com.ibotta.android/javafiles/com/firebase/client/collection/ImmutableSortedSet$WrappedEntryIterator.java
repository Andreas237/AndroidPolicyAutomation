// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.Iterator;

// Referenced classes of package com.firebase.client.collection:
//			ImmutableSortedSet

private static class ImmutableSortedSet$WrappedEntryIterator
	implements Iterator
{

	public boolean hasNext()
	{
		return iterator.hasNext();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Iterator iterator>
	//    2    4:invokeinterface #27  <Method boolean Iterator.hasNext()>
	//    3    9:ireturn         
	}

	public Object next()
	{
		return ((java.util.Map.Entry)iterator.next()).getKey();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Iterator iterator>
	//    2    4:invokeinterface #31  <Method Object Iterator.next()>
	//    3    9:checkcast       #33  <Class java.util.Map$Entry>
	//    4   12:invokeinterface #36  <Method Object java.util.Map$Entry.getKey()>
	//    5   17:areturn         
	}

	public void remove()
	{
		iterator.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Iterator iterator>
	//    2    4:invokeinterface #40  <Method void Iterator.remove()>
	//    3    9:return          
	}

	final Iterator iterator;

	public ImmutableSortedSet$WrappedEntryIterator(Iterator iterator1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		iterator = iterator1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Iterator iterator>
	//    5    9:return          
	}
}
