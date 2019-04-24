// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//			LinkedHashTreeMap

class LinkedHashTreeMap$EntrySet$1 extends apIterator
{

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method java.util.Map$Entry next()>
	//    2    4:areturn         
	}

	public java.util.Map.Entry next()
	{
		return ((java.util.Map.Entry) (nextNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method LinkedHashTreeMap$Node nextNode()>
	//    2    4:areturn         
	}

	final LinkedHashTreeMap.EntrySet this$1;

	LinkedHashTreeMap$EntrySet$1()
	{
		this$1 = LinkedHashTreeMap.EntrySet.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LinkedHashTreeMap$EntrySet this$1>
		super(this$0, ((LinkedHashTreeMap._cls1) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #23  <Field LinkedHashTreeMap LinkedHashTreeMap$EntrySet.this$0>
	//    6   10:aconst_null     
	//    7   11:invokespecial   #26  <Method void LinkedHashTreeMap$LinkedTreeMapIterator(LinkedHashTreeMap, LinkedHashTreeMap$1)>
	//    8   14:return          
	}
}
