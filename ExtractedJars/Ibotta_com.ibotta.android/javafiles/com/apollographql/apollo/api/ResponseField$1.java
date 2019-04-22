// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api;

import java.util.Comparator;

// Referenced classes of package com.apollographql.apollo.api:
//			ResponseField

class ResponseField$1
	implements Comparator
{

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((java.util.Map.Entry)obj, (java.util.Map.Entry)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class java.util.Map$Entry>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class java.util.Map$Entry>
	//    5    9:invokevirtual   #29  <Method int compare(java.util.Map$Entry, java.util.Map$Entry)>
	//    6   12:ireturn         
	}

	public int compare(java.util.Map.Entry entry, java.util.Map.Entry entry1)
	{
		return ((String)entry.getKey()).compareTo((String)entry1.getKey());
	//    0    0:aload_1         
	//    1    1:invokeinterface #33  <Method Object java.util.Map$Entry.getKey()>
	//    2    6:checkcast       #35  <Class String>
	//    3    9:aload_2         
	//    4   10:invokeinterface #33  <Method Object java.util.Map$Entry.getKey()>
	//    5   15:checkcast       #35  <Class String>
	//    6   18:invokevirtual   #39  <Method int String.compareTo(String)>
	//    7   21:ireturn         
	}

	final ResponseField this$0;

	ResponseField$1()
	{
		this$0 = ResponseField.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ResponseField this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
