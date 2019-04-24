// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;


// Referenced classes of package com.google.gson:
//			LongSerializationPolicy, JsonPrimitive, JsonElement

static final class LongSerializationPolicy$1 extends LongSerializationPolicy
{

	public JsonElement serialize(Long long1)
	{
		return ((JsonElement) (new JsonPrimitive(((Number) (long1)))));
	//    0    0:new             #14  <Class JsonPrimitive>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #17  <Method void JsonPrimitive(Number)>
	//    4    8:areturn         
	}

	LongSerializationPolicy$1(String s, int i)
	{
		super(s, i, ((LongSerializationPolicy$1) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #9   <Method void LongSerializationPolicy(String, int, LongSerializationPolicy$1)>
	//    5    7:return          
	}
}
