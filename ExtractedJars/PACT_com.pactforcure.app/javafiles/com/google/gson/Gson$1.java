// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import java.lang.reflect.Type;

// Referenced classes of package com.google.gson:
//			JsonDeserializationContext, Gson, JsonParseException, JsonElement

class Gson$1
	implements JsonDeserializationContext
{

	public Object deserialize(JsonElement jsonelement, Type type)
		throws JsonParseException
	{
		return fromJson(jsonelement, type);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Gson this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method Object Gson.fromJson(JsonElement, Type)>
	//    5    9:areturn         
	}

	final Gson this$0;

	Gson$1()
	{
		this$0 = Gson.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Gson this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
