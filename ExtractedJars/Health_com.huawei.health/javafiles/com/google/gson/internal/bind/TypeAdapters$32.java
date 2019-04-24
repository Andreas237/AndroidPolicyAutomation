// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$32
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		if(typetoken.getRawType() == val$type)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #33  <Method Class TypeToken.getRawType()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field Class val$type>
	//*   4    8:if_acmpne       16
			return val$typeAdapter;
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field TypeAdapter val$typeAdapter>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Factory[type=").append(val$type.getName()).append(",adapter=").append(((Object) (val$typeAdapter))).append("]").toString();
	//    0    0:new             #39  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void StringBuilder()>
	//    3    7:ldc1            #42  <String "Factory[type=">
	//    4    9:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #19  <Field Class val$type>
	//    7   16:invokevirtual   #51  <Method String Class.getName()>
	//    8   19:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #53  <String ",adapter=">
	//   10   24:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #21  <Field TypeAdapter val$typeAdapter>
	//   13   31:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   14   34:ldc1            #58  <String "]">
	//   15   36:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   16   39:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   17   42:areturn         
	}

	final Class val$type;
	final TypeAdapter val$typeAdapter;

	TypeAdapters$32(Class class1, TypeAdapter typeadapter)
	{
		val$type = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Class val$type>
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
