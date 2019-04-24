// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal:
//			LinkedTreeMap

final class LinkedTreeMap$KeySet extends AbstractSet
{

	public void clear()
	{
		LinkedTreeMap.this.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
	//    2    4:invokevirtual   #23  <Method void LinkedTreeMap.clear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		return containsKey(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method boolean LinkedTreeMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new LinkedTreeMap.LinkedTreeMapIterator() {

			public Object next()
			{
				return nextNode().key;
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method LinkedTreeMap$Node nextNode()>
			//    2    4:getfield        #39  <Field Object LinkedTreeMap$Node.key>
			//    3    7:areturn         
			}

			final LinkedTreeMap.KeySet this$1;

			
			{
				this$1 = LinkedTreeMap.KeySet.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LinkedTreeMap$KeySet this$1>
				super(this$0, ((LinkedTreeMap._cls1) (null)));
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:getfield        #23  <Field LinkedTreeMap LinkedTreeMap$KeySet.this$0>
			//    6   10:aconst_null     
			//    7   11:invokespecial   #26  <Method void LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap, LinkedTreeMap$1)>
			//    8   14:return          
			}
		}
));
	//    0    0:new             #10  <Class LinkedTreeMap$KeySet$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void LinkedTreeMap$KeySet$1(LinkedTreeMap$KeySet)>
	//    4    8:areturn         
	}

	public boolean remove(Object obj)
	{
		return removeInternalByKey(obj) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method LinkedTreeMap$Node LinkedTreeMap.removeInternalByKey(Object)>
	//    4    8:ifnull          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public int size()
	{
		return LinkedTreeMap.this.size;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field LinkedTreeMap this$0>
	//    2    4:getfield        #45  <Field int LinkedTreeMap.size>
	//    3    7:ireturn         
	}

	final LinkedTreeMap this$0;

	LinkedTreeMap$KeySet()
	{
		this$0 = LinkedTreeMap.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field LinkedTreeMap this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AbstractSet()>
	//    5    9:return          
	}
}
