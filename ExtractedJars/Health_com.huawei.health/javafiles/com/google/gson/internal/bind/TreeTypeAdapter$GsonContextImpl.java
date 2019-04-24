// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import java.lang.reflect.Type;

// Referenced classes of package com.google.gson.internal.bind:
//			TreeTypeAdapter

final class TreeTypeAdapter$GsonContextImpl
	implements JsonDeserializationContext, JsonSerializationContext
{

	public Object deserialize(JsonElement jsonelement, Type type)
		throws JsonParseException
	{
		return gson.fromJson(jsonelement, type);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TreeTypeAdapter this$0>
	//    2    4:getfield        #32  <Field Gson TreeTypeAdapter.gson>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #37  <Method Object Gson.fromJson(JsonElement, Type)>
	//    6   12:areturn         
	}

	public JsonElement serialize(Object obj)
	{
		return gson.toJsonTree(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TreeTypeAdapter this$0>
	//    2    4:getfield        #32  <Field Gson TreeTypeAdapter.gson>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #45  <Method JsonElement Gson.toJsonTree(Object)>
	//    5   11:areturn         
	}

	public JsonElement serialize(Object obj, Type type)
	{
		return gson.toJsonTree(obj, type);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TreeTypeAdapter this$0>
	//    2    4:getfield        #32  <Field Gson TreeTypeAdapter.gson>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #48  <Method JsonElement Gson.toJsonTree(Object, Type)>
	//    6   12:areturn         
	}

	final TreeTypeAdapter this$0;

	private TreeTypeAdapter$GsonContextImpl()
	{
		this$0 = TreeTypeAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TreeTypeAdapter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	TreeTypeAdapter$GsonContextImpl(TreeTypeAdapter._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void TreeTypeAdapter$GsonContextImpl(TreeTypeAdapter)>
	//    3    5:return          
	}
}
