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
		if(gson != val$unboxed && gson != val$boxed)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #20  <Field Class val$unboxed>
	//*   6   10:if_acmpeq       26
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #22  <Field Class val$boxed>
	//*  10   18:if_acmpne       24
	//*  11   21:goto            26
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
		else
			return val$typeAdapter;
	//   14   26:aload_0         
	//   15   27:getfield        #24  <Field TypeAdapter val$typeAdapter>
	//   16   30:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Factory[type=");
	//    4    8:aload_1         
	//    5    9:ldc1            #45  <String "Factory[type=">
	//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(val$boxed.getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #22  <Field Class val$boxed>
	//   11   20:invokevirtual   #54  <Method String Class.getName()>
	//   12   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append("+");
	//   14   27:aload_1         
	//   15   28:ldc1            #56  <String "+">
	//   16   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(val$unboxed.getName());
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #20  <Field Class val$unboxed>
	//   21   39:invokevirtual   #54  <Method String Class.getName()>
	//   22   42:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append(",adapter=");
	//   24   46:aload_1         
	//   25   47:ldc1            #58  <String ",adapter=">
	//   26   49:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		stringbuilder.append(((Object) (val$typeAdapter)));
	//   28   53:aload_1         
	//   29   54:aload_0         
	//   30   55:getfield        #24  <Field TypeAdapter val$typeAdapter>
	//   31   58:invokevirtual   #61  <Method StringBuilder StringBuilder.append(Object)>
	//   32   61:pop             
		stringbuilder.append("]");
	//   33   62:aload_1         
	//   34   63:ldc1            #63  <String "]">
	//   35   65:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
		return stringbuilder.toString();
	//   37   69:aload_1         
	//   38   70:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   39   73:areturn         
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
