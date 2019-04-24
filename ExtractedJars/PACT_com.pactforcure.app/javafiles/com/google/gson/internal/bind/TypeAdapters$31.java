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
		if(val$clazz.isAssignableFrom(typetoken.getRawType()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Class val$clazz>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #33  <Method Class TypeToken.getRawType()>
	//*   4    8:invokevirtual   #39  <Method boolean Class.isAssignableFrom(Class)>
	//*   5   11:ifeq            19
			return val$typeAdapter;
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field TypeAdapter val$typeAdapter>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Factory[typeHierarchy=").append(val$clazz.getName()).append(",adapter=").append(((Object) (val$typeAdapter))).append("]").toString();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:ldc1            #48  <String "Factory[typeHierarchy=">
	//    4    9:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field Class val$clazz>
	//    7   16:invokevirtual   #55  <Method String Class.getName()>
	//    8   19:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #57  <String ",adapter=">
	//   10   24:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #21  <Field TypeAdapter val$typeAdapter>
	//   13   31:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #62  <String "]">
	//   15   36:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	final Class val$clazz;
	final TypeAdapter val$typeAdapter;

	TypeAdapters$31(Class class1, TypeAdapter typeadapter)
	{
		val$clazz = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Class val$clazz>
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
