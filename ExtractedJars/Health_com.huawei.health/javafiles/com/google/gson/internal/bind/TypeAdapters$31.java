// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$31
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		if(typetoken.equals(((Object) (val$type))))
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #19  <Field TypeToken val$type>
	//*   3    5:invokevirtual   #33  <Method boolean TypeToken.equals(Object)>
	//*   4    8:ifeq            16
			return val$typeAdapter;
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field TypeAdapter val$typeAdapter>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	final TypeToken val$type;
	final TypeAdapter val$typeAdapter;

	TypeAdapters$31(TypeToken typetoken, TypeAdapter typeadapter)
	{
		val$type = typetoken;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TypeToken val$type>
		val$typeAdapter = typeadapter;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TypeAdapter val$typeAdapter>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
