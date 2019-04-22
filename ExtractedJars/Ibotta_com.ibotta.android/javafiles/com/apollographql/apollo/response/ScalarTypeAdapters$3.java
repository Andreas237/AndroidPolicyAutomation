// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.response;


// Referenced classes of package com.apollographql.apollo.response:
//			ScalarTypeAdapters

class ScalarTypeAdapters$3 extends faultCustomTypeAdapter
{

	public Integer decode(String s)
	{
		return Integer.valueOf(Integer.parseInt(s));
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method int Integer.parseInt(String)>
	//    2    4:invokestatic    #29  <Method Integer Integer.valueOf(int)>
	//    3    7:areturn         
	}

	public volatile Object decode(String s)
	{
		return ((Object) (decode(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method Integer decode(String)>
	//    3    5:areturn         
	}

	ScalarTypeAdapters$3()
	{
		super(((ScalarTypeAdapters$1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void ScalarTypeAdapters$DefaultCustomTypeAdapter(ScalarTypeAdapters$1)>
	//    3    5:return          
	}
}
