// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapters

static final class TypeAdapters$29
	implements TypeAdapterFactory
{

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		gson = ((Gson) (typetoken.getRawType()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #36  <Method Class TypeToken.getRawType()>
	//    2    4:astore_1        
		if(gson == val$unboxed || gson == val$boxed)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #20  <Field Class val$unboxed>
	//*   6   10:if_acmpeq       21
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #22  <Field Class val$boxed>
	//*  10   18:if_acmpne       26
			return val$typeAdapter;
	//   11   21:aload_0         
	//   12   22:getfield        #24  <Field TypeAdapter val$typeAdapter>
	//   13   25:areturn         
		else
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("Factory[type=").append(val$boxed.getName()).append("+").append(val$unboxed.getName()).append(",adapter=").append(((Object) (val$typeAdapter))).append("]").toString();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:ldc1            #45  <String "Factory[type=">
	//    4    9:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #22  <Field Class val$boxed>
	//    7   16:invokevirtual   #54  <Method String Class.getName()>
	//    8   19:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #56  <String "+">
	//   10   24:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:getfield        #20  <Field Class val$unboxed>
	//   13   31:invokevirtual   #54  <Method String Class.getName()>
	//   14   34:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   37:ldc1            #58  <String ",adapter=">
	//   16   39:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   17   42:aload_0         
	//   18   43:getfield        #24  <Field TypeAdapter val$typeAdapter>
	//   19   46:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   20   49:ldc1            #63  <String "]">
	//   21   51:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   22   54:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   23   57:areturn         
	}

	final Class val$boxed;
	final TypeAdapter val$typeAdapter;
	final Class val$unboxed;

	TypeAdapters$29(Class class1, Class class2, TypeAdapter typeadapter)
	{
		val$unboxed = class1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Class val$unboxed>
		val$boxed = class2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Class val$boxed>
		val$typeAdapter = typeadapter;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field TypeAdapter val$typeAdapter>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
