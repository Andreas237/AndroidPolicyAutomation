// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal:
//			LinkedHashTreeMap

final class LinkedHashTreeMap$KeySet extends AbstractSet
{

	public void clear()
	{
		LinkedHashTreeMap.this.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    2    4:invokevirtual   #23  <Method void LinkedHashTreeMap.clear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		return containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method boolean LinkedHashTreeMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new LinkedHashTreeMap.LinkedTreeMapIterator() {

			public Object next()
			{
				return nextNode().key;
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method LinkedHashTreeMap$Node nextNode()>
			//    2    4:getfield        #39  <Field Object LinkedHashTreeMap$Node.key>
			//    3    7:areturn         
			}

			final LinkedHashTreeMap.KeySet this$1;

			
			{
				this$1 = LinkedHashTreeMap.KeySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedHashTreeMap$KeySet this$1>
				super(this$0);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedHashTreeMap LinkedHashTreeMap$KeySet.this$0>
			//    6   10:invokespecial   #26  <Method void LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap)>
			//    7   13:return          
			}
		}
));
	//    0    0:new             #10  <Class LinkedHashTreeMap$KeySet$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void LinkedHashTreeMap$KeySet$1(LinkedHashTreeMap$KeySet)>
	//    4    8:areturn         
	}

	public boolean remove(Object obj)
	{
		return removeInternalByKey(obj) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method LinkedHashTreeMap$Node LinkedHashTreeMap.removeInternalByKey(Object)>
	//    4    8:ifnull          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int size()
	{
		return LinkedHashTreeMap.this.size;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedHashTreeMap this$0>
	//    2    4:getfield        #45  <Field int LinkedHashTreeMap.size>
	//    3    7:ireturn         
	}

	final LinkedHashTreeMap this$0;

	LinkedHashTreeMap$KeySet()
	{
		this$0 = LinkedHashTreeMap.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field LinkedHashTreeMap this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AbstractSet()>
	//    5    9:return          
	}
}
