// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.response;

import com.apollographql.apollo.CustomTypeAdapter;

// Referenced classes of package com.apollographql.apollo.response:
//			ScalarTypeAdapters

private static abstract class ScalarTypeAdapters$DefaultCustomTypeAdapter
	implements CustomTypeAdapter
{

	public String encode(Object obj)
	{
		return obj.toString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method String Object.toString()>
	//    2    4:areturn         
	}

	private ScalarTypeAdapters$DefaultCustomTypeAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	ScalarTypeAdapters$DefaultCustomTypeAdapter(ScalarTypeAdapters._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ScalarTypeAdapters$DefaultCustomTypeAdapter()>
	//    2    4:return          
	}
}
