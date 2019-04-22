// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import java.util.Iterator;

// Referenced classes of package com.firebase.client.snapshot:
//			ChildrenNode, NamedNode, ChildKey, Node

private static class ChildrenNode$NamedNodeIterator
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

	public NamedNode next()
	{
		java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Iterator iterator>
	//    2    4:invokeinterface #32  <Method Object Iterator.next()>
	//    3    9:checkcast       #34  <Class java.util.Map$Entry>
	//    4   12:astore_1        
		return new NamedNode((ChildKey)entry.getKey(), (Node)entry.getValue());
	//    5   13:new             #36  <Class NamedNode>
	//    6   16:dup             
	//    7   17:aload_1         
	//    8   18:invokeinterface #39  <Method Object java.util.Map$Entry.getKey()>
	//    9   23:checkcast       #41  <Class ChildKey>
	//   10   26:aload_1         
	//   11   27:invokeinterface #44  <Method Object java.util.Map$Entry.getValue()>
	//   12   32:checkcast       #46  <Class Node>
	//   13   35:invokespecial   #49  <Method void NamedNode(ChildKey, Node)>
	//   14   38:areturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method NamedNode next()>
	//    2    4:areturn         
	}

	public void remove()
	{
		iterator.remove();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Iterator iterator>
	//    2    4:invokeinterface #54  <Method void Iterator.remove()>
	//    3    9:return          
	}

	private final Iterator iterator;

	public ChildrenNode$NamedNodeIterator(Iterator iterator1)
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
