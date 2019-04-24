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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Factory[typeHierarchy=");
	//    4    8:aload_1         
	//    5    9:ldc1            #48  <String "Factory[typeHierarchy=">
	//    6   11:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(val$clazz.getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #19  <Field Class val$clazz>
	//   11   20:invokevirtual   #55  <Method String Class.getName()>
	//   12   23:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(",adapter=");
	//   14   27:aload_1         
	//   15   28:ldc1            #57  <String ",adapter=">
	//   16   30:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(((Object) (val$typeAdapter)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #21  <Field TypeAdapter val$typeAdapter>
	//   21   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   22   42:pop             
		stringbuilder.append("]");
	//   23   43:aload_1         
	//   24   44:ldc1            #62  <String "]">
	//   25   46:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		return stringbuilder.toString();
	//   27   50:aload_1         
	//   28   51:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   29   54:areturn         
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
