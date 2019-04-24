// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;

// Referenced classes of package com.google.gson.internal.bind:
//			ReflectiveTypeAdapterFactory, TypeAdapterRuntimeTypeWrapper

class ReflectiveTypeAdapterFactory$1 extends undField
{

	void read(JsonReader jsonreader, Object obj)
		throws IOException, IllegalAccessException
	{
		jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TypeAdapter typeAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #55  <Method Object TypeAdapter.read(JsonReader)>
	//    4    8:astore_1        
		if(jsonreader != null || !val$isPrimitive)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       20
	//*   7   13:aload_0         
	//*   8   14:getfield        #34  <Field boolean val$isPrimitive>
	//*   9   17:ifne            29
			val$field.set(obj, ((Object) (jsonreader)));
	//   10   20:aload_0         
	//   11   21:getfield        #30  <Field Field val$field>
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #61  <Method void Field.set(Object, Object)>
	//   15   29:return          
	}

	void write(JsonWriter jsonwriter, Object obj)
		throws IOException, IllegalAccessException
	{
		obj = val$field.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Field val$field>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #68  <Method Object Field.get(Object)>
	//    4    8:astore_2        
		((TypeAdapter) (new TypeAdapterRuntimeTypeWrapper(val$context, typeAdapter, val$fieldType.getType()))).write(jsonwriter, obj);
	//    5    9:new             #70  <Class TypeAdapterRuntimeTypeWrapper>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field Gson val$context>
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field TypeAdapter typeAdapter>
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field TypeToken val$fieldType>
	//   13   25:invokevirtual   #76  <Method java.lang.reflect.Type TypeToken.getType()>
	//   14   28:invokespecial   #79  <Method void TypeAdapterRuntimeTypeWrapper(Gson, TypeAdapter, java.lang.reflect.Type)>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #81  <Method void TypeAdapter.write(JsonWriter, Object)>
	//   18   36:return          
	}

	public boolean writeField(Object obj)
		throws IOException, IllegalAccessException
	{
		while(!serialized || val$field.get(obj) == obj) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean serialized>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field Field val$field>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #68  <Method Object Field.get(Object)>
	//    9   17:aload_1         
	//   10   18:if_acmpeq       7
		return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}

	final ReflectiveTypeAdapterFactory this$0;
	final TypeAdapter typeAdapter;
	final Gson val$context;
	final Field val$field;
	final TypeToken val$fieldType;
	final boolean val$isPrimitive;

	ReflectiveTypeAdapterFactory$1(Field field1, TypeToken typetoken, 
			boolean flag2)
	{
		this$0 = final_reflectivetypeadapterfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ReflectiveTypeAdapterFactory this$0>
		val$context = Gson.this;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #28  <Field Gson val$context>
		val$field = field1;
	//    6   11:aload_0         
	//    7   12:aload           6
	//    8   14:putfield        #30  <Field Field val$field>
		val$fieldType = typetoken;
	//    9   17:aload_0         
	//   10   18:aload           7
	//   11   20:putfield        #32  <Field TypeToken val$fieldType>
		val$isPrimitive = flag2;
	//   12   23:aload_0         
	//   13   24:iload           8
	//   14   26:putfield        #34  <Field boolean val$isPrimitive>
		super(final_s, final_flag, final_flag1);
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:invokespecial   #37  <Method void ReflectiveTypeAdapterFactory$BoundField(String, boolean, boolean)>
		typeAdapter = ReflectiveTypeAdapterFactory.access$100(ReflectiveTypeAdapterFactory.this, val$context, val$field, val$fieldType);
	//   20   37:aload_0         
	//   21   38:aload_0         
	//   22   39:getfield        #26  <Field ReflectiveTypeAdapterFactory this$0>
	//   23   42:aload_0         
	//   24   43:getfield        #28  <Field Gson val$context>
	//   25   46:aload_0         
	//   26   47:getfield        #30  <Field Field val$field>
	//   27   50:aload_0         
	//   28   51:getfield        #32  <Field TypeToken val$fieldType>
	//   29   54:invokestatic    #41  <Method TypeAdapter ReflectiveTypeAdapterFactory.access$100(ReflectiveTypeAdapterFactory, Gson, Field, TypeToken)>
	//   30   57:putfield        #43  <Field TypeAdapter typeAdapter>
	//   31   60:return          
	}
}
