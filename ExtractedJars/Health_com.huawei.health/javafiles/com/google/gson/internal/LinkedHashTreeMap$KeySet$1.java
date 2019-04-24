// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			LinkedHashTreeMap

class LinkedHashTreeMap$KeySet$1 extends eMapIterator
{

	public Object next()
	{
		return nextNode().key;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method LinkedHashTreeMap$Node nextNode()>
	//    2    4:getfield        #39  <Field Object LinkedHashTreeMap$Node.key>
	//    3    7:areturn         
	}

	final LinkedHashTreeMap.KeySet this$1;

	LinkedHashTreeMap$KeySet$1()
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
