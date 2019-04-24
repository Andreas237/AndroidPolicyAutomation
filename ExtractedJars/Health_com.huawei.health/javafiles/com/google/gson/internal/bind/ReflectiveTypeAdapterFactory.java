// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package com.google.gson.internal.bind:
//			JsonAdapterAnnotationTypeAdapterFactory, TypeAdapterRuntimeTypeWrapper

public final class ReflectiveTypeAdapterFactory
	implements TypeAdapterFactory
{
	public static final class Adapter extends TypeAdapter
	{

		public Object read(JsonReader jsonreader)
			throws IOException
		{
			Object obj;
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #40  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #46  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #49  <Method void JsonReader.nextNull()>
				return ((Object) (null));
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			obj = constructor.construct();
		//    8   16:aload_0         
		//    9   17:getfield        #21  <Field ObjectConstructor constructor>
		//   10   20:invokeinterface #55  <Method Object ObjectConstructor.construct()>
		//   11   25:astore_2        
			jsonreader.beginObject();
		//   12   26:aload_1         
		//   13   27:invokevirtual   #58  <Method void JsonReader.beginObject()>
_L1:
			Object obj1;
			if(!jsonreader.hasNext())
				break MISSING_BLOCK_LABEL_106;
		//   14   30:aload_1         
		//   15   31:invokevirtual   #62  <Method boolean JsonReader.hasNext()>
		//   16   34:ifeq            83
			obj1 = ((Object) (jsonreader.nextName()));
		//   17   37:aload_1         
		//   18   38:invokevirtual   #66  <Method String JsonReader.nextName()>
		//   19   41:astore_3        
			obj1 = ((Object) ((BoundField)boundFields.get(obj1)));
		//   20   42:aload_0         
		//   21   43:getfield        #23  <Field Map boundFields>
		//   22   46:aload_3         
		//   23   47:invokeinterface #72  <Method Object Map.get(Object)>
		//   24   52:checkcast       #74  <Class ReflectiveTypeAdapterFactory$BoundField>
		//   25   55:astore_3        
			if(obj1 == null)
				break MISSING_BLOCK_LABEL_67;
		//   26   56:aload_3         
		//   27   57:ifnull          67
			if(((BoundField) (obj1)).deserialized)
				break MISSING_BLOCK_LABEL_74;
		//   28   60:aload_3         
		//   29   61:getfield        #78  <Field boolean ReflectiveTypeAdapterFactory$BoundField.deserialized>
		//   30   64:ifne            74
			jsonreader.skipValue();
		//   31   67:aload_1         
		//   32   68:invokevirtual   #81  <Method void JsonReader.skipValue()>
			  goto _L1
		//*  33   71:goto            80
			try
			{
				((BoundField) (obj1)).read(jsonreader, obj);
		//   34   74:aload_3         
		//   35   75:aload_1         
		//   36   76:aload_2         
		//   37   77:invokevirtual   #84  <Method void ReflectiveTypeAdapterFactory$BoundField.read(JsonReader, Object)>
			}
		//*  38   80:goto            30
		//*  39   83:goto            106
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  40   86:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   41   87:new             #86  <Class JsonSyntaxException>
		//   42   90:dup             
		//   43   91:aload_1         
		//   44   92:invokespecial   #89  <Method void JsonSyntaxException(Throwable)>
		//   45   95:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  46   96:astore_1        
			{
				throw new AssertionError(((Object) (jsonreader)));
		//   47   97:new             #91  <Class AssertionError>
		//   48  100:dup             
		//   49  101:aload_1         
		//   50  102:invokespecial   #94  <Method void AssertionError(Object)>
		//   51  105:athrow          
			}
			  goto _L1
			jsonreader.endObject();
		//   52  106:aload_1         
		//   53  107:invokevirtual   #97  <Method void JsonReader.endObject()>
			return obj;
		//   54  110:aload_2         
		//   55  111:areturn         
		}

		public void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			if(obj == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       10
			{
				jsonwriter.nullValue();
		//    2    4:aload_1         
		//    3    5:invokevirtual   #107 <Method JsonWriter JsonWriter.nullValue()>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			jsonwriter.beginObject();
		//    6   10:aload_1         
		//    7   11:invokevirtual   #109 <Method JsonWriter JsonWriter.beginObject()>
		//    8   14:pop             
			try
			{
				Iterator iterator = boundFields.values().iterator();
		//    9   15:aload_0         
		//   10   16:getfield        #23  <Field Map boundFields>
		//   11   19:invokeinterface #113 <Method Collection Map.values()>
		//   12   24:invokeinterface #119 <Method Iterator Collection.iterator()>
		//   13   29:astore_3        
				do
				{
					if(!iterator.hasNext())
						break;
		//   14   30:aload_3         
		//   15   31:invokeinterface #122 <Method boolean Iterator.hasNext()>
		//   16   36:ifeq            79
					BoundField boundfield = (BoundField)iterator.next();
		//   17   39:aload_3         
		//   18   40:invokeinterface #125 <Method Object Iterator.next()>
		//   19   45:checkcast       #74  <Class ReflectiveTypeAdapterFactory$BoundField>
		//   20   48:astore          4
					if(boundfield.writeField(obj))
		//*  21   50:aload           4
		//*  22   52:aload_2         
		//*  23   53:invokevirtual   #129 <Method boolean ReflectiveTypeAdapterFactory$BoundField.writeField(Object)>
		//*  24   56:ifeq            76
					{
						jsonwriter.name(boundfield.name);
		//   25   59:aload_1         
		//   26   60:aload           4
		//   27   62:getfield        #133 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
		//   28   65:invokevirtual   #136 <Method JsonWriter JsonWriter.name(String)>
		//   29   68:pop             
						boundfield.write(jsonwriter, obj);
		//   30   69:aload           4
		//   31   71:aload_1         
		//   32   72:aload_2         
		//   33   73:invokevirtual   #138 <Method void ReflectiveTypeAdapterFactory$BoundField.write(JsonWriter, Object)>
					}
				} while(true);
		//   34   76:goto            30
			}
		//*  35   79:goto            92
			// Misplaced declaration of an exception variable
			catch(JsonWriter jsonwriter)
		//*  36   82:astore_1        
			{
				throw new AssertionError(((Object) (jsonwriter)));
		//   37   83:new             #91  <Class AssertionError>
		//   38   86:dup             
		//   39   87:aload_1         
		//   40   88:invokespecial   #94  <Method void AssertionError(Object)>
		//   41   91:athrow          
			}
			jsonwriter.endObject();
		//   42   92:aload_1         
		//   43   93:invokevirtual   #140 <Method JsonWriter JsonWriter.endObject()>
		//   44   96:pop             
		//   45   97:return          
		}

		private final Map boundFields;
		private final ObjectConstructor constructor;

		Adapter(ObjectConstructor objectconstructor, Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void TypeAdapter()>
			constructor = objectconstructor;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field ObjectConstructor constructor>
			boundFields = map;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Map boundFields>
		//    8   14:return          
		}
	}

	static abstract class BoundField
	{

		abstract void read(JsonReader jsonreader, Object obj)
			throws IOException, IllegalAccessException;

		abstract void write(JsonWriter jsonwriter, Object obj)
			throws IOException, IllegalAccessException;

		abstract boolean writeField(Object obj)
			throws IOException, IllegalAccessException;

		final boolean deserialized;
		final String name;
		final boolean serialized;

		protected BoundField(String s, boolean flag, boolean flag1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			name = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field String name>
			serialized = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field boolean serialized>
			deserialized = flag1;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field boolean deserialized>
		//   11   19:return          
		}
	}


	public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorconstructor, FieldNamingStrategy fieldnamingstrategy, Excluder excluder1, JsonAdapterAnnotationTypeAdapterFactory jsonadapterannotationtypeadapterfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		constructorConstructor = constructorconstructor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field ConstructorConstructor constructorConstructor>
		fieldNamingPolicy = fieldnamingstrategy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field FieldNamingStrategy fieldNamingPolicy>
		excluder = excluder1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field Excluder excluder>
		jsonAdapterFactory = jsonadapterannotationtypeadapterfactory;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory>
	//   14   25:return          
	}

	private BoundField createBoundField(Gson gson, final Field field, final String final_s, TypeToken typetoken, final boolean final_flag, final boolean final_flag1)
	{
		boolean flag = Primitives.isPrimitive(((java.lang.reflect.Type) (typetoken.getRawType())));
	//    0    0:aload           4
	//    1    2:invokevirtual   #44  <Method Class TypeToken.getRawType()>
	//    2    5:invokestatic    #50  <Method boolean Primitives.isPrimitive(java.lang.reflect.Type)>
	//    3    8:istore          8
		final TypeAdapter typeAdapter = ((TypeAdapter) ((JsonAdapter)field.getAnnotation(com/google/gson/annotations/JsonAdapter)));
	//    4   10:aload_2         
	//    5   11:ldc1            #52  <Class JsonAdapter>
	//    6   13:invokevirtual   #58  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//    7   16:checkcast       #52  <Class JsonAdapter>
	//    8   19:astore          10
		TypeAdapter typeadapter = null;
	//    9   21:aconst_null     
	//   10   22:astore          9
		if(typeAdapter != null)
	//*  11   24:aload           10
	//*  12   26:ifnull          47
			typeadapter = jsonAdapterFactory.getTypeAdapter(constructorConstructor, gson, typetoken, ((JsonAdapter) (typeAdapter)));
	//   13   29:aload_0         
	//   14   30:getfield        #35  <Field JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory>
	//   15   33:aload_0         
	//   16   34:getfield        #29  <Field ConstructorConstructor constructorConstructor>
	//   17   37:aload_1         
	//   18   38:aload           4
	//   19   40:aload           10
	//   20   42:invokevirtual   #64  <Method TypeAdapter JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(ConstructorConstructor, Gson, TypeToken, JsonAdapter)>
	//   21   45:astore          9
		final boolean jsonAdapterPresent;
		if(typeadapter != null)
	//*  22   47:aload           9
	//*  23   49:ifnull          58
			jsonAdapterPresent = true;
	//   24   52:iconst_1        
	//   25   53:istore          7
		else
	//*  26   55:goto            61
			jsonAdapterPresent = false;
	//   27   58:iconst_0        
	//   28   59:istore          7
		typeAdapter = typeadapter;
	//   29   61:aload           9
	//   30   63:astore          10
		if(typeadapter == null)
	//*  31   65:aload           9
	//*  32   67:ifnonnull       78
			typeAdapter = gson.getAdapter(typetoken);
	//   33   70:aload_1         
	//   34   71:aload           4
	//   35   73:invokevirtual   #70  <Method TypeAdapter Gson.getAdapter(TypeToken)>
	//   36   76:astore          10
		return ((BoundField) (new BoundField(gson, typetoken, flag) {

			void read(JsonReader jsonreader, Object obj)
				throws IOException, IllegalAccessException
			{
				jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:getfield        #32  <Field TypeAdapter val$typeAdapter>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #53  <Method Object TypeAdapter.read(JsonReader)>
			//    4    8:astore_1        
				if(jsonreader != null || !isPrimitive)
			//*   5    9:aload_1         
			//*   6   10:ifnonnull       20
			//*   7   13:aload_0         
			//*   8   14:getfield        #38  <Field boolean val$isPrimitive>
			//*   9   17:ifne            29
					field.set(obj, ((Object) (jsonreader)));
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
				Object obj1 = field.get(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field Field val$field>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #66  <Method Object Field.get(Object)>
			//    4    8:astore_3        
				if(jsonAdapterPresent)
			//*   5    9:aload_0         
			//*   6   10:getfield        #30  <Field boolean val$jsonAdapterPresent>
			//*   7   13:ifeq            24
					obj = ((Object) (typeAdapter));
			//    8   16:aload_0         
			//    9   17:getfield        #32  <Field TypeAdapter val$typeAdapter>
			//   10   20:astore_2        
				else
			//*  11   21:goto            47
					obj = ((Object) (new TypeAdapterRuntimeTypeWrapper(context, typeAdapter, fieldType.getType())));
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
				return field.get(obj) != obj;
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

			
			{
				this$0 = ReflectiveTypeAdapterFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ReflectiveTypeAdapterFactory this$0>
				field = field1;
			//    3    5:aload_0         
			//    4    6:aload           5
			//    5    8:putfield        #28  <Field Field val$field>
				jsonAdapterPresent = flag2;
			//    6   11:aload_0         
			//    7   12:iload           6
			//    8   14:putfield        #30  <Field boolean val$jsonAdapterPresent>
				typeAdapter = typeadapter;
			//    9   17:aload_0         
			//   10   18:aload           7
			//   11   20:putfield        #32  <Field TypeAdapter val$typeAdapter>
				context = gson;
			//   12   23:aload_0         
			//   13   24:aload           8
			//   14   26:putfield        #34  <Field Gson val$context>
				fieldType = typetoken;
			//   15   29:aload_0         
			//   16   30:aload           9
			//   17   32:putfield        #36  <Field TypeToken val$fieldType>
				isPrimitive = flag3;
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
));
	//   37   78:new             #8   <Class ReflectiveTypeAdapterFactory$1>
	//   38   81:dup             
	//   39   82:aload_0         
	//   40   83:aload_3         
	//   41   84:iload           5
	//   42   86:iload           6
	//   43   88:aload_2         
	//   44   89:iload           7
	//   45   91:aload           10
	//   46   93:aload_1         
	//   47   94:aload           4
	//   48   96:iload           8
	//   49   98:invokespecial   #73  <Method void ReflectiveTypeAdapterFactory$1(ReflectiveTypeAdapterFactory, String, boolean, boolean, Field, boolean, TypeAdapter, Gson, TypeToken, boolean)>
	//   50  101:areturn         
	}

	static boolean excludeField(Field field, boolean flag, Excluder excluder1)
	{
		return !excluder1.excludeClass(field.getType(), flag) && !excluder1.excludeField(field, flag);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #80  <Method Class Field.getType()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #86  <Method boolean Excluder.excludeClass(Class, boolean)>
	//    5    9:ifne            23
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #89  <Method boolean Excluder.excludeField(Field, boolean)>
	//   10   18:ifne            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	private Map getBoundFields(Gson gson, TypeToken typetoken, Class class1)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #93  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #94  <Method void LinkedHashMap()>
	//    3    7:astore          13
		if(class1.isInterface())
	//*   4    9:aload_3         
	//*   5   10:invokevirtual   #100 <Method boolean Class.isInterface()>
	//*   6   13:ifeq            19
			return ((Map) (linkedhashmap));
	//    7   16:aload           13
	//    8   18:areturn         
		java.lang.reflect.Type type = typetoken.getType();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #103 <Method java.lang.reflect.Type TypeToken.getType()>
	//   11   23:astore          14
		for(; class1 != java/lang/Object; class1 = typetoken.getRawType())
	//*  12   25:aload_3         
	//*  13   26:ldc1            #4   <Class Object>
	//*  14   28:if_acmpeq       295
		{
			Field afield[] = class1.getDeclaredFields();
	//   15   31:aload_3         
	//   16   32:invokevirtual   #107 <Method Field[] Class.getDeclaredFields()>
	//   17   35:astore          15
			int k = afield.length;
	//   18   37:aload           15
	//   19   39:arraylength     
	//   20   40:istore          6
			for(int i = 0; i < k; i++)
	//*  21   42:iconst_0        
	//*  22   43:istore          4
	//*  23   45:iload           4
	//*  24   47:iload           6
	//*  25   49:icmpge          271
			{
				Field field = afield[i];
	//   26   52:aload           15
	//   27   54:iload           4
	//   28   56:aaload          
	//   29   57:astore          16
				boolean flag = excludeField(field, true);
	//   30   59:aload_0         
	//   31   60:aload           16
	//   32   62:iconst_1        
	//   33   63:invokevirtual   #108 <Method boolean excludeField(Field, boolean)>
	//   34   66:istore          8
				boolean flag1 = excludeField(field, false);
	//   35   68:aload_0         
	//   36   69:aload           16
	//   37   71:iconst_0        
	//   38   72:invokevirtual   #108 <Method boolean excludeField(Field, boolean)>
	//   39   75:istore          9
				if(!flag && !flag1)
	//*  40   77:iload           8
	//*  41   79:ifne            90
	//*  42   82:iload           9
	//*  43   84:ifne            90
					continue;
	//   44   87:goto            262
				field.setAccessible(true);
	//   45   90:aload           16
	//   46   92:iconst_1        
	//   47   93:invokevirtual   #112 <Method void Field.setAccessible(boolean)>
				java.lang.reflect.Type type1 = com.google.gson.internal..Gson.Types.resolve(typetoken.getType(), class1, field.getGenericType());
	//   48   96:aload_2         
	//   49   97:invokevirtual   #103 <Method java.lang.reflect.Type TypeToken.getType()>
	//   50  100:aload_3         
	//   51  101:aload           16
	//   52  103:invokevirtual   #115 <Method java.lang.reflect.Type Field.getGenericType()>
	//   53  106:invokestatic    #121 <Method java.lang.reflect.Type com.google.gson.internal.$Gson$Types.resolve(java.lang.reflect.Type, Class, java.lang.reflect.Type)>
	//   54  109:astore          17
				List list = getFieldNames(field);
	//   55  111:aload_0         
	//   56  112:aload           16
	//   57  114:invokespecial   #125 <Method List getFieldNames(Field)>
	//   58  117:astore          18
				BoundField boundfield = null;
	//   59  119:aconst_null     
	//   60  120:astore          10
				int j = 0;
	//   61  122:iconst_0        
	//   62  123:istore          5
				for(int l = list.size(); j < l;)
	//*  63  125:aload           18
	//*  64  127:invokeinterface #131 <Method int List.size()>
	//*  65  132:istore          7
	//*  66  134:iload           5
	//*  67  136:iload           7
	//*  68  138:icmpge          221
				{
					Object obj = ((Object) ((String)list.get(j)));
	//   69  141:aload           18
	//   70  143:iload           5
	//   71  145:invokeinterface #135 <Method Object List.get(int)>
	//   72  150:checkcast       #137 <Class String>
	//   73  153:astore          11
					if(j != 0)
	//*  74  155:iload           5
	//*  75  157:ifeq            163
						flag = false;
	//   76  160:iconst_0        
	//   77  161:istore          8
					BoundField boundfield1 = (BoundField)((Map) (linkedhashmap)).put(obj, ((Object) (createBoundField(gson, field, ((String) (obj)), TypeToken.get(type1), flag, flag1))));
	//   78  163:aload           13
	//   79  165:aload           11
	//   80  167:aload_0         
	//   81  168:aload_1         
	//   82  169:aload           16
	//   83  171:aload           11
	//   84  173:aload           17
	//   85  175:invokestatic    #140 <Method TypeToken TypeToken.get(java.lang.reflect.Type)>
	//   86  178:iload           8
	//   87  180:iload           9
	//   88  182:invokespecial   #142 <Method ReflectiveTypeAdapterFactory$BoundField createBoundField(Gson, Field, String, TypeToken, boolean, boolean)>
	//   89  185:invokeinterface #148 <Method Object Map.put(Object, Object)>
	//   90  190:checkcast       #13  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   91  193:astore          12
					obj = ((Object) (boundfield));
	//   92  195:aload           10
	//   93  197:astore          11
					if(boundfield == null)
	//*  94  199:aload           10
	//*  95  201:ifnonnull       208
						obj = ((Object) (boundfield1));
	//   96  204:aload           12
	//   97  206:astore          11
					j++;
	//   98  208:iload           5
	//   99  210:iconst_1        
	//  100  211:iadd            
	//  101  212:istore          5
					boundfield = ((BoundField) (obj));
	//  102  214:aload           11
	//  103  216:astore          10
				}

	//* 104  218:goto            134
				if(boundfield != null)
	//* 105  221:aload           10
	//* 106  223:ifnull          262
					throw new IllegalArgumentException((new StringBuilder()).append(((Object) (type))).append(" declares multiple JSON fields named ").append(boundfield.name).toString());
	//  107  226:new             #150 <Class IllegalArgumentException>
	//  108  229:dup             
	//  109  230:new             #152 <Class StringBuilder>
	//  110  233:dup             
	//  111  234:invokespecial   #153 <Method void StringBuilder()>
	//  112  237:aload           14
	//  113  239:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//  114  242:ldc1            #159 <String " declares multiple JSON fields named ">
	//  115  244:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  116  247:aload           10
	//  117  249:getfield        #166 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
	//  118  252:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  119  255:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  120  258:invokespecial   #173 <Method void IllegalArgumentException(String)>
	//  121  261:athrow          
			}

	//  122  262:iload           4
	//  123  264:iconst_1        
	//  124  265:iadd            
	//  125  266:istore          4
	//* 126  268:goto            45
			typetoken = TypeToken.get(com.google.gson.internal..Gson.Types.resolve(typetoken.getType(), class1, class1.getGenericSuperclass()));
	//  127  271:aload_2         
	//  128  272:invokevirtual   #103 <Method java.lang.reflect.Type TypeToken.getType()>
	//  129  275:aload_3         
	//  130  276:aload_3         
	//  131  277:invokevirtual   #176 <Method java.lang.reflect.Type Class.getGenericSuperclass()>
	//  132  280:invokestatic    #121 <Method java.lang.reflect.Type com.google.gson.internal.$Gson$Types.resolve(java.lang.reflect.Type, Class, java.lang.reflect.Type)>
	//  133  283:invokestatic    #140 <Method TypeToken TypeToken.get(java.lang.reflect.Type)>
	//  134  286:astore_2        
		}

	//  135  287:aload_2         
	//  136  288:invokevirtual   #44  <Method Class TypeToken.getRawType()>
	//  137  291:astore_3        
	//* 138  292:goto            25
		return ((Map) (linkedhashmap));
	//  139  295:aload           13
	//  140  297:areturn         
	}

	private List getFieldNames(Field field)
	{
		SerializedName serializedname = (SerializedName)field.getAnnotation(com/google/gson/annotations/SerializedName);
	//    0    0:aload_1         
	//    1    1:ldc1            #179 <Class SerializedName>
	//    2    3:invokevirtual   #58  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//    3    6:checkcast       #179 <Class SerializedName>
	//    4    9:astore          4
		if(serializedname == null)
	//*   5   11:aload           4
	//*   6   13:ifnonnull       30
			return Collections.singletonList(((Object) (fieldNamingPolicy.translateName(field))));
	//    7   16:aload_0         
	//    8   17:getfield        #31  <Field FieldNamingStrategy fieldNamingPolicy>
	//    9   20:aload_1         
	//   10   21:invokeinterface #185 <Method String FieldNamingStrategy.translateName(Field)>
	//   11   26:invokestatic    #191 <Method List Collections.singletonList(Object)>
	//   12   29:areturn         
		field = ((Field) (serializedname.value()));
	//   13   30:aload           4
	//   14   32:invokeinterface #194 <Method String SerializedName.value()>
	//   15   37:astore_1        
		String as[] = serializedname.alternate();
	//   16   38:aload           4
	//   17   40:invokeinterface #198 <Method String[] SerializedName.alternate()>
	//   18   45:astore          4
		if(as.length == 0)
	//*  19   47:aload           4
	//*  20   49:arraylength     
	//*  21   50:ifne            58
			return Collections.singletonList(((Object) (field)));
	//   22   53:aload_1         
	//   23   54:invokestatic    #191 <Method List Collections.singletonList(Object)>
	//   24   57:areturn         
		ArrayList arraylist = new ArrayList(as.length + 1);
	//   25   58:new             #200 <Class ArrayList>
	//   26   61:dup             
	//   27   62:aload           4
	//   28   64:arraylength     
	//   29   65:iconst_1        
	//   30   66:iadd            
	//   31   67:invokespecial   #203 <Method void ArrayList(int)>
	//   32   70:astore          5
		((List) (arraylist)).add(((Object) (field)));
	//   33   72:aload           5
	//   34   74:aload_1         
	//   35   75:invokeinterface #207 <Method boolean List.add(Object)>
	//   36   80:pop             
		int j = as.length;
	//   37   81:aload           4
	//   38   83:arraylength     
	//   39   84:istore_3        
		for(int i = 0; i < j; i++)
	//*  40   85:iconst_0        
	//*  41   86:istore_2        
	//*  42   87:iload_2         
	//*  43   88:iload_3         
	//*  44   89:icmpge          111
			((List) (arraylist)).add(((Object) (as[i])));
	//   45   92:aload           5
	//   46   94:aload           4
	//   47   96:iload_2         
	//   48   97:aaload          
	//   49   98:invokeinterface #207 <Method boolean List.add(Object)>
	//   50  103:pop             

	//   51  104:iload_2         
	//   52  105:iconst_1        
	//   53  106:iadd            
	//   54  107:istore_2        
	//*  55  108:goto            87
		return ((List) (arraylist));
	//   56  111:aload           5
	//   57  113:areturn         
	}

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		Class class1 = typetoken.getRawType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #44  <Method Class TypeToken.getRawType()>
	//    2    4:astore_3        
		if(!((Class) (java/lang/Object)).isAssignableFrom(class1))
	//*   3    5:ldc1            #4   <Class Object>
	//*   4    7:aload_3         
	//*   5    8:invokevirtual   #214 <Method boolean Class.isAssignableFrom(Class)>
	//*   6   11:ifne            16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		else
			return ((TypeAdapter) (new Adapter(constructorConstructor.get(typetoken), getBoundFields(gson, typetoken, class1))));
	//    9   16:new             #10  <Class ReflectiveTypeAdapterFactory$Adapter>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:getfield        #29  <Field ConstructorConstructor constructorConstructor>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #219 <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:invokespecial   #221 <Method Map getBoundFields(Gson, TypeToken, Class)>
	//   20   35:invokespecial   #224 <Method void ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor, Map)>
	//   21   38:areturn         
	}

	public boolean excludeField(Field field, boolean flag)
	{
		return excludeField(field, flag, excluder);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #33  <Field Excluder excluder>
	//    4    6:invokestatic    #227 <Method boolean excludeField(Field, boolean, Excluder)>
	//    5    9:ireturn         
	}

	private final ConstructorConstructor constructorConstructor;
	private final Excluder excluder;
	private final FieldNamingStrategy fieldNamingPolicy;
	private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
}
