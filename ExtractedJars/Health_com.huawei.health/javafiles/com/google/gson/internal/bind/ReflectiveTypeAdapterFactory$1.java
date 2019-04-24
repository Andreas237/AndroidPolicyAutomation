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
		jsonreader = ((JsonReader) (val$typeAdapter.read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field TypeAdapter val$typeAdapter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method Object TypeAdapter.read(JsonReader)>
	//    4    8:astore_1        
		if(jsonreader != null || !val$isPrimitive)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       20
	//*   7   13:aload_0         
	//*   8   14:getfield        #38  <Field boolean val$isPrimitive>
	//*   9   17:ifne            29
			val$field.set(obj, ((Object) (jsonreader)));
	//   10   20:aload_0         
	//   11   21:getfield        #28  <Field Field val$field>
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #59  <Method void Field.set(Object, Object)>
	//   15   29:return          
	}

	void write(JsonWriter jsonwriter, Object obj)
		throws IOException, IllegalAccessException
	{
		Object obj1 = val$field.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Field val$field>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #66  <Method Object Field.get(Object)>
	//    4    8:astore_3        
		if(val$jsonAdapterPresent)
	//*   5    9:aload_0         
	//*   6   10:getfield        #30  <Field boolean val$jsonAdapterPresent>
	//*   7   13:ifeq            24
			obj = ((Object) (val$typeAdapter));
	//    8   16:aload_0         
	//    9   17:getfield        #32  <Field TypeAdapter val$typeAdapter>
	//   10   20:astore_2        
		else
	//*  11   21:goto            47
			obj = ((Object) (new TypeAdapterRuntimeTypeWrapper(val$context, val$typeAdapter, val$fieldType.getType())));
	//   12   24:new             #68  <Class TypeAdapterRuntimeTypeWrapper>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:getfield        #34  <Field Gson val$context>
	//   16   32:aload_0         
	//   17   33:getfield        #32  <Field TypeAdapter val$typeAdapter>
	//   18   36:aload_0         
	//   19   37:getfield        #36  <Field TypeToken val$fieldType>
	//   20   40:invokevirtual   #74  <Method java.lang.reflect.Type TypeToken.getType()>
	//   21   43:invokespecial   #77  <Method void TypeAdapterRuntimeTypeWrapper(Gson, TypeAdapter, java.lang.reflect.Type)>
	//   22   46:astore_2        
		((TypeAdapter) (obj)).write(jsonwriter, obj1);
	//   23   47:aload_2         
	//   24   48:aload_1         
	//   25   49:aload_3         
	//   26   50:invokevirtual   #79  <Method void TypeAdapter.write(JsonWriter, Object)>
	//   27   53:return          
	}

	public boolean writeField(Object obj)
		throws IOException, IllegalAccessException
	{
		if(!serialized)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean serialized>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		return val$field.get(obj) != obj;
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field Field val$field>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #66  <Method Object Field.get(Object)>
	//    9   17:aload_1         
	//   10   18:if_acmpeq       23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	final ReflectiveTypeAdapterFactory this$0;
	final Gson val$context;
	final Field val$field;
	final TypeToken val$fieldType;
	final boolean val$isPrimitive;
	final boolean val$jsonAdapterPresent;
	final TypeAdapter val$typeAdapter;

	ReflectiveTypeAdapterFactory$1(Gson gson, TypeToken typetoken, boolean flag3)
	{
		this$0 = final_reflectivetypeadapterfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ReflectiveTypeAdapterFactory this$0>
		val$field = field1;
	//    3    5:aload_0         
	//    4    6:aload           5
	//    5    8:putfield        #28  <Field Field val$field>
		val$jsonAdapterPresent = flag2;
	//    6   11:aload_0         
	//    7   12:iload           6
	//    8   14:putfield        #30  <Field boolean val$jsonAdapterPresent>
		val$typeAdapter = TypeAdapter.this;
	//    9   17:aload_0         
	//   10   18:aload           7
	//   11   20:putfield        #32  <Field TypeAdapter val$typeAdapter>
		val$context = gson;
	//   12   23:aload_0         
	//   13   24:aload           8
	//   14   26:putfield        #34  <Field Gson val$context>
		val$fieldType = typetoken;
	//   15   29:aload_0         
	//   16   30:aload           9
	//   17   32:putfield        #36  <Field TypeToken val$fieldType>
		val$isPrimitive = flag3;
	//   18   35:aload_0         
	//   19   36:iload           10
	//   20   38:putfield        #38  <Field boolean val$isPrimitive>
		super(final_s, final_flag, final_flag1);
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:iload_3         
	//   24   44:iload           4
	//   25   46:invokespecial   #41  <Method void ReflectiveTypeAdapterFactory$BoundField(String, boolean, boolean)>
	//   26   49:return          
	}
}
