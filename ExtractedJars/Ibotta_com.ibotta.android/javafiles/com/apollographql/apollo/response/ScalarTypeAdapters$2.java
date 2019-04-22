// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.response;


// Referenced classes of package com.apollographql.apollo.response:
//			ScalarTypeAdapters

class ScalarTypeAdapters$2 extends faultCustomTypeAdapter
{

	public Boolean decode(String s)
	{
		return Boolean.valueOf(Boolean.parseBoolean(s));
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method boolean Boolean.parseBoolean(String)>
	//    2    4:invokestatic    #29  <Method Boolean Boolean.valueOf(boolean)>
	//    3    7:areturn         
	}

	public volatile Object decode(String s)
	{
		return ((Object) (decode(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #34  <Method Boolean decode(String)>
	//    3    5:areturn         
	}

	ScalarTypeAdapters$2()
	{
		super(((ScalarTypeAdapters$1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void ScalarTypeAdapters$DefaultCustomTypeAdapter(ScalarTypeAdapters$1)>
	//    3    5:return          
	}
}
