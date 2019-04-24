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
		//*   1    1:invokevirtual   #43  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #49  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #52  <Method void JsonReader.nextNull()>
				return ((Object) (null));
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			obj = constructor.construct();
		//    8   16:aload_0         
		//    9   17:getfield        #21  <Field ObjectConstructor constructor>
		//   10   20:invokeinterface #58  <Method Object ObjectConstructor.construct()>
		//   11   25:astore_2        
			jsonreader.beginObject();
		//   12   26:aload_1         
		//   13   27:invokevirtual   #61  <Method void JsonReader.beginObject()>
_L1:
			Object obj1;
			if(!jsonreader.hasNext())
				break MISSING_BLOCK_LABEL_103;
		//   14   30:aload_1         
		//   15   31:invokevirtual   #65  <Method boolean JsonReader.hasNext()>
		//   16   34:ifeq            103
			obj1 = ((Object) (jsonreader.nextName()));
		//   17   37:aload_1         
		//   18   38:invokevirtual   #69  <Method String JsonReader.nextName()>
		//   19   41:astore_3        
			obj1 = ((Object) ((BoundField)boundFields.get(obj1)));
		//   20   42:aload_0         
		//   21   43:getfield        #23  <Field Map boundFields>
		//   22   46:aload_3         
		//   23   47:invokeinterface #75  <Method Object Map.get(Object)>
		//   24   52:checkcast       #77  <Class ReflectiveTypeAdapterFactory$BoundField>
		//   25   55:astore_3        
			if(obj1 == null)
				break MISSING_BLOCK_LABEL_67;
		//   26   56:aload_3         
		//   27   57:ifnull          67
			if(((BoundField) (obj1)).deserialized)
				break MISSING_BLOCK_LABEL_84;
		//   28   60:aload_3         
		//   29   61:getfield        #81  <Field boolean ReflectiveTypeAdapterFactory$BoundField.deserialized>
		//   30   64:ifne            84
			jsonreader.skipValue();
		//   31   67:aload_1         
		//   32   68:invokevirtual   #84  <Method void JsonReader.skipValue()>
			  goto _L1
		//*  33   71:goto            30
		//*  34   74:astore_1        
		//*  35   75:new             #86  <Class JsonSyntaxException>
		//*  36   78:dup             
		//*  37   79:aload_1         
		//*  38   80:invokespecial   #89  <Method void JsonSyntaxException(Throwable)>
		//*  39   83:athrow          
			try
			{
				((BoundField) (obj1)).read(jsonreader, obj);
		//   40   84:aload_3         
		//   41   85:aload_1         
		//   42   86:aload_2         
		//   43   87:invokevirtual   #92  <Method void ReflectiveTypeAdapterFactory$BoundField.read(JsonReader, Object)>
			}
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
			}
		//*  44   90:goto            30
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  45   93:astore_1        
			{
				throw new AssertionError(((Object) (jsonreader)));
		//   46   94:new             #94  <Class AssertionError>
		//   47   97:dup             
		//   48   98:aload_1         
		//   49   99:invokespecial   #97  <Method void AssertionError(Object)>
		//   50  102:athrow          
			}
			  goto _L1
			jsonreader.endObject();
		//   51  103:aload_1         
		//   52  104:invokevirtual   #100 <Method void JsonReader.endObject()>
			return obj;
		//   53  107:aload_2         
		//   54  108:areturn         
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
		//    3    5:invokevirtual   #110 <Method JsonWriter JsonWriter.nullValue()>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			jsonwriter.beginObject();
		//    6   10:aload_1         
		//    7   11:invokevirtual   #112 <Method JsonWriter JsonWriter.beginObject()>
		//    8   14:pop             
			try
			{
				Iterator iterator = boundFields.values().iterator();
		//    9   15:aload_0         
		//   10   16:getfield        #23  <Field Map boundFields>
		//   11   19:invokeinterface #116 <Method Collection Map.values()>
		//   12   24:invokeinterface #122 <Method Iterator Collection.iterator()>
		//   13   29:astore_3        
				do
				{
					if(!iterator.hasNext())
						break;
		//   14   30:aload_3         
		//   15   31:invokeinterface #125 <Method boolean Iterator.hasNext()>
		//   16   36:ifeq            88
					BoundField boundfield = (BoundField)iterator.next();
		//   17   39:aload_3         
		//   18   40:invokeinterface #128 <Method Object Iterator.next()>
		//   19   45:checkcast       #77  <Class ReflectiveTypeAdapterFactory$BoundField>
		//   20   48:astore          4
					if(boundfield.writeField(obj))
		//*  21   50:aload           4
		//*  22   52:aload_2         
		//*  23   53:invokevirtual   #132 <Method boolean ReflectiveTypeAdapterFactory$BoundField.writeField(Object)>
		//*  24   56:ifeq            30
					{
						jsonwriter.name(boundfield.name);
		//   25   59:aload_1         
		//   26   60:aload           4
		//   27   62:getfield        #136 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
		//   28   65:invokevirtual   #139 <Method JsonWriter JsonWriter.name(String)>
		//   29   68:pop             
						boundfield.write(jsonwriter, obj);
		//   30   69:aload           4
		//   31   71:aload_1         
		//   32   72:aload_2         
		//   33   73:invokevirtual   #141 <Method void ReflectiveTypeAdapterFactory$BoundField.write(JsonWriter, Object)>
					}
				} while(true);
		//   34   76:goto            30
			}
			// Misplaced declaration of an exception variable
			catch(JsonWriter jsonwriter)
		//*  35   79:astore_1        
			{
				throw new AssertionError();
		//   36   80:new             #94  <Class AssertionError>
		//   37   83:dup             
		//   38   84:invokespecial   #142 <Method void AssertionError()>
		//   39   87:athrow          
			}
			jsonwriter.endObject();
		//   40   88:aload_1         
		//   41   89:invokevirtual   #144 <Method JsonWriter JsonWriter.endObject()>
		//   42   92:pop             
		//   43   93:return          
		}

		private final Map boundFields;
		private final ObjectConstructor constructor;

		private Adapter(ObjectConstructor objectconstructor, Map map)
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


	public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorconstructor, FieldNamingStrategy fieldnamingstrategy, Excluder excluder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		constructorConstructor = constructorconstructor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field ConstructorConstructor constructorConstructor>
		fieldNamingPolicy = fieldnamingstrategy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field FieldNamingStrategy fieldNamingPolicy>
		excluder = excluder1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field Excluder excluder>
	//   11   19:return          
	}

	private BoundField createBoundField(final Gson context, Field field, final String final_s, TypeToken typetoken, final boolean final_flag, final boolean final_flag1)
	{
		return ((BoundField) (new BoundField(field, typetoken, Primitives.isPrimitive(((java.lang.reflect.Type) (typetoken.getRawType())))) {

			void read(JsonReader jsonreader, Object obj)
				throws IOException, IllegalAccessException
			{
				jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:getfield        #43  <Field TypeAdapter typeAdapter>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #55  <Method Object TypeAdapter.read(JsonReader)>
			//    4    8:astore_1        
				if(jsonreader != null || !isPrimitive)
			//*   5    9:aload_1         
			//*   6   10:ifnonnull       20
			//*   7   13:aload_0         
			//*   8   14:getfield        #34  <Field boolean val$isPrimitive>
			//*   9   17:ifne            29
					field.set(obj, ((Object) (jsonreader)));
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
				obj = field.get(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #30  <Field Field val$field>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #68  <Method Object Field.get(Object)>
			//    4    8:astore_2        
				((TypeAdapter) (new TypeAdapterRuntimeTypeWrapper(context, typeAdapter, fieldType.getType()))).write(jsonwriter, obj);
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
				while(!serialized || field.get(obj) == obj) 
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

			
			{
				this$0 = ReflectiveTypeAdapterFactory.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field ReflectiveTypeAdapterFactory this$0>
				context = gson;
			//    3    5:aload_0         
			//    4    6:aload           5
			//    5    8:putfield        #28  <Field Gson val$context>
				field = field1;
			//    6   11:aload_0         
			//    7   12:aload           6
			//    8   14:putfield        #30  <Field Field val$field>
				fieldType = typetoken;
			//    9   17:aload_0         
			//   10   18:aload           7
			//   11   20:putfield        #32  <Field TypeToken val$fieldType>
				isPrimitive = flag2;
			//   12   23:aload_0         
			//   13   24:iload           8
			//   14   26:putfield        #34  <Field boolean val$isPrimitive>
				super(final_s, final_flag, final_flag1);
			//   15   29:aload_0         
			//   16   30:aload_2         
			//   17   31:iload_3         
			//   18   32:iload           4
			//   19   34:invokespecial   #37  <Method void ReflectiveTypeAdapterFactory$BoundField(String, boolean, boolean)>
				typeAdapter = getFieldAdapter(context, field, fieldType);
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
));
	//    0    0:new             #8   <Class ReflectiveTypeAdapterFactory$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:iload           5
	//    5    8:iload           6
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload           4
	//    9   14:aload           4
	//   10   16:invokevirtual   #46  <Method Class TypeToken.getRawType()>
	//   11   19:invokestatic    #52  <Method boolean Primitives.isPrimitive(java.lang.reflect.Type)>
	//   12   22:invokespecial   #55  <Method void ReflectiveTypeAdapterFactory$1(ReflectiveTypeAdapterFactory, String, boolean, boolean, Gson, Field, TypeToken, boolean)>
	//   13   25:areturn         
	}

	static boolean excludeField(Field field, boolean flag, Excluder excluder1)
	{
		return !excluder1.excludeClass(field.getType(), flag) && !excluder1.excludeField(field, flag);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #64  <Method Class Field.getType()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #70  <Method boolean Excluder.excludeClass(Class, boolean)>
	//    5    9:ifne            23
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #73  <Method boolean Excluder.excludeField(Field, boolean)>
	//   10   18:ifne            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	private Map getBoundFields(Gson gson, TypeToken typetoken, Class class1)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #77  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void LinkedHashMap()>
	//    3    7:astore          12
		if(!class1.isInterface()) goto _L2; else goto _L1
	//    4    9:aload_3         
	//    5   10:invokevirtual   #84  <Method boolean Class.isInterface()>
	//    6   13:ifeq            19
_L1:
		return ((Map) (linkedhashmap));
	//    7   16:aload           12
	//    8   18:areturn         
_L2:
		java.lang.reflect.Type type = typetoken.getType();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #87  <Method java.lang.reflect.Type TypeToken.getType()>
	//   11   23:astore          13
_L8:
		int i;
		int k;
		Field afield[];
		if(class1 == java/lang/Object)
			continue; /* Loop/switch isn't completed */
	//   12   25:aload_3         
	//   13   26:ldc1            #4   <Class Object>
	//   14   28:if_acmpeq       16
		afield = class1.getDeclaredFields();
	//   15   31:aload_3         
	//   16   32:invokevirtual   #91  <Method Field[] Class.getDeclaredFields()>
	//   17   35:astore          14
		k = afield.length;
	//   18   37:aload           14
	//   19   39:arraylength     
	//   20   40:istore          6
		i = 0;
	//   21   42:iconst_0        
	//   22   43:istore          4
_L4:
		boolean flag;
		boolean flag1;
		Field field;
		if(i >= k)
			break MISSING_BLOCK_LABEL_264;
	//   23   45:iload           4
	//   24   47:iload           6
	//   25   49:icmpge          264
		field = afield[i];
	//   26   52:aload           14
	//   27   54:iload           4
	//   28   56:aaload          
	//   29   57:astore          15
		flag = excludeField(field, true);
	//   30   59:aload_0         
	//   31   60:aload           15
	//   32   62:iconst_1        
	//   33   63:invokevirtual   #92  <Method boolean excludeField(Field, boolean)>
	//   34   66:istore          7
		flag1 = excludeField(field, false);
	//   35   68:aload_0         
	//   36   69:aload           15
	//   37   71:iconst_0        
	//   38   72:invokevirtual   #92  <Method boolean excludeField(Field, boolean)>
	//   39   75:istore          8
		if(flag || flag1)
			break; /* Loop/switch isn't completed */
	//   40   77:iload           7
	//   41   79:ifne            96
	//   42   82:iload           8
	//   43   84:ifne            96
_L6:
		i++;
	//   44   87:iload           4
	//   45   89:iconst_1        
	//   46   90:iadd            
	//   47   91:istore          4
		if(true) goto _L4; else goto _L3
	//   48   93:goto            45
_L3:
		BoundField boundfield;
		field.setAccessible(true);
	//   49   96:aload           15
	//   50   98:iconst_1        
	//   51   99:invokevirtual   #96  <Method void Field.setAccessible(boolean)>
		java.lang.reflect.Type type1 = com.google.gson.internal..Gson.Types.resolve(typetoken.getType(), class1, field.getGenericType());
	//   52  102:aload_2         
	//   53  103:invokevirtual   #87  <Method java.lang.reflect.Type TypeToken.getType()>
	//   54  106:aload_3         
	//   55  107:aload           15
	//   56  109:invokevirtual   #99  <Method java.lang.reflect.Type Field.getGenericType()>
	//   57  112:invokestatic    #105 <Method java.lang.reflect.Type com.google.gson.internal.$Gson$Types.resolve(java.lang.reflect.Type, Class, java.lang.reflect.Type)>
	//   58  115:astore          16
		List list = getFieldNames(field);
	//   59  117:aload_0         
	//   60  118:aload           15
	//   61  120:invokespecial   #109 <Method List getFieldNames(Field)>
	//   62  123:astore          17
		boundfield = null;
	//   63  125:aconst_null     
	//   64  126:astore          9
		for(int j = 0; j < list.size();)
	//*  65  128:iconst_0        
	//*  66  129:istore          5
	//*  67  131:iload           5
	//*  68  133:aload           17
	//*  69  135:invokeinterface #115 <Method int List.size()>
	//*  70  140:icmpge          223
		{
			Object obj = ((Object) ((String)list.get(j)));
	//   71  143:aload           17
	//   72  145:iload           5
	//   73  147:invokeinterface #119 <Method Object List.get(int)>
	//   74  152:checkcast       #121 <Class String>
	//   75  155:astore          10
			if(j != 0)
	//*  76  157:iload           5
	//*  77  159:ifeq            165
				flag = false;
	//   78  162:iconst_0        
	//   79  163:istore          7
			BoundField boundfield1 = (BoundField)((Map) (linkedhashmap)).put(obj, ((Object) (createBoundField(gson, field, ((String) (obj)), TypeToken.get(type1), flag, flag1))));
	//   80  165:aload           12
	//   81  167:aload           10
	//   82  169:aload_0         
	//   83  170:aload_1         
	//   84  171:aload           15
	//   85  173:aload           10
	//   86  175:aload           16
	//   87  177:invokestatic    #124 <Method TypeToken TypeToken.get(java.lang.reflect.Type)>
	//   88  180:iload           7
	//   89  182:iload           8
	//   90  184:invokespecial   #126 <Method ReflectiveTypeAdapterFactory$BoundField createBoundField(Gson, Field, String, TypeToken, boolean, boolean)>
	//   91  187:invokeinterface #132 <Method Object Map.put(Object, Object)>
	//   92  192:checkcast       #13  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   93  195:astore          11
			obj = ((Object) (boundfield));
	//   94  197:aload           9
	//   95  199:astore          10
			if(boundfield == null)
	//*  96  201:aload           9
	//*  97  203:ifnonnull       210
				obj = ((Object) (boundfield1));
	//   98  206:aload           11
	//   99  208:astore          10
			j++;
	//  100  210:iload           5
	//  101  212:iconst_1        
	//  102  213:iadd            
	//  103  214:istore          5
			boundfield = ((BoundField) (obj));
	//  104  216:aload           10
	//  105  218:astore          9
		}

	//* 106  220:goto            131
		if(boundfield == null) goto _L6; else goto _L5
	//  107  223:aload           9
	//  108  225:ifnull          87
_L5:
		throw new IllegalArgumentException((new StringBuilder()).append(((Object) (type))).append(" declares multiple JSON fields named ").append(boundfield.name).toString());
	//  109  228:new             #134 <Class IllegalArgumentException>
	//  110  231:dup             
	//  111  232:new             #136 <Class StringBuilder>
	//  112  235:dup             
	//  113  236:invokespecial   #137 <Method void StringBuilder()>
	//  114  239:aload           13
	//  115  241:invokevirtual   #141 <Method StringBuilder StringBuilder.append(Object)>
	//  116  244:ldc1            #143 <String " declares multiple JSON fields named ">
	//  117  246:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  118  249:aload           9
	//  119  251:getfield        #150 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
	//  120  254:invokevirtual   #146 <Method StringBuilder StringBuilder.append(String)>
	//  121  257:invokevirtual   #154 <Method String StringBuilder.toString()>
	//  122  260:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//  123  263:athrow          
		typetoken = TypeToken.get(com.google.gson.internal..Gson.Types.resolve(typetoken.getType(), class1, class1.getGenericSuperclass()));
	//  124  264:aload_2         
	//  125  265:invokevirtual   #87  <Method java.lang.reflect.Type TypeToken.getType()>
	//  126  268:aload_3         
	//  127  269:aload_3         
	//  128  270:invokevirtual   #160 <Method java.lang.reflect.Type Class.getGenericSuperclass()>
	//  129  273:invokestatic    #105 <Method java.lang.reflect.Type com.google.gson.internal.$Gson$Types.resolve(java.lang.reflect.Type, Class, java.lang.reflect.Type)>
	//  130  276:invokestatic    #124 <Method TypeToken TypeToken.get(java.lang.reflect.Type)>
	//  131  279:astore_2        
		class1 = typetoken.getRawType();
	//  132  280:aload_2         
	//  133  281:invokevirtual   #46  <Method Class TypeToken.getRawType()>
	//  134  284:astore_3        
		if(true) goto _L8; else goto _L7
	//  135  285:goto            25
_L7:
		if(true) goto _L1; else goto _L9
_L9:
	}

	private TypeAdapter getFieldAdapter(Gson gson, Field field, TypeToken typetoken)
	{
		field = ((Field) ((JsonAdapter)field.getAnnotation(com/google/gson/annotations/JsonAdapter)));
	//    0    0:aload_2         
	//    1    1:ldc1            #163 <Class JsonAdapter>
	//    2    3:invokevirtual   #167 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//    3    6:checkcast       #163 <Class JsonAdapter>
	//    4    9:astore_2        
		if(field != null)
	//*   5   10:aload_2         
	//*   6   11:ifnull          31
		{
			field = ((Field) (JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(constructorConstructor, gson, typetoken, ((JsonAdapter) (field)))));
	//    7   14:aload_0         
	//    8   15:getfield        #27  <Field ConstructorConstructor constructorConstructor>
	//    9   18:aload_1         
	//   10   19:aload_3         
	//   11   20:aload_2         
	//   12   21:invokestatic    #173 <Method TypeAdapter JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(ConstructorConstructor, Gson, TypeToken, JsonAdapter)>
	//   13   24:astore_2        
			if(field != null)
	//*  14   25:aload_2         
	//*  15   26:ifnull          31
				return ((TypeAdapter) (field));
	//   16   29:aload_2         
	//   17   30:areturn         
		}
		return gson.getAdapter(typetoken);
	//   18   31:aload_1         
	//   19   32:aload_3         
	//   20   33:invokevirtual   #179 <Method TypeAdapter Gson.getAdapter(TypeToken)>
	//   21   36:areturn         
	}

	static List getFieldName(FieldNamingStrategy fieldnamingstrategy, Field field)
	{
		SerializedName serializedname = (SerializedName)field.getAnnotation(com/google/gson/annotations/SerializedName);
	//    0    0:aload_1         
	//    1    1:ldc1            #184 <Class SerializedName>
	//    2    3:invokevirtual   #167 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//    3    6:checkcast       #184 <Class SerializedName>
	//    4    9:astore          5
		LinkedList linkedlist = new LinkedList();
	//    5   11:new             #186 <Class LinkedList>
	//    6   14:dup             
	//    7   15:invokespecial   #187 <Method void LinkedList()>
	//    8   18:astore          4
		if(serializedname == null)
	//*   9   20:aload           5
	//*  10   22:ifnonnull       43
		{
			((List) (linkedlist)).add(((Object) (fieldnamingstrategy.translateName(field))));
	//   11   25:aload           4
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokeinterface #193 <Method String FieldNamingStrategy.translateName(Field)>
	//   15   34:invokeinterface #197 <Method boolean List.add(Object)>
	//   16   39:pop             
		} else
	//*  17   40:aload           4
	//*  18   42:areturn         
		{
			((List) (linkedlist)).add(((Object) (serializedname.value())));
	//   19   43:aload           4
	//   20   45:aload           5
	//   21   47:invokeinterface #200 <Method String SerializedName.value()>
	//   22   52:invokeinterface #197 <Method boolean List.add(Object)>
	//   23   57:pop             
			fieldnamingstrategy = ((FieldNamingStrategy) (serializedname.alternate()));
	//   24   58:aload           5
	//   25   60:invokeinterface #204 <Method String[] SerializedName.alternate()>
	//   26   65:astore_0        
			int j = fieldnamingstrategy.length;
	//   27   66:aload_0         
	//   28   67:arraylength     
	//   29   68:istore_3        
			int i = 0;
	//   30   69:iconst_0        
	//   31   70:istore_2        
			while(i < j) 
	//*  32   71:iload_2         
	//*  33   72:iload_3         
	//*  34   73:icmpge          40
			{
				((List) (linkedlist)).add(((Object) (fieldnamingstrategy[i])));
	//   35   76:aload           4
	//   36   78:aload_0         
	//   37   79:iload_2         
	//   38   80:aaload          
	//   39   81:invokeinterface #197 <Method boolean List.add(Object)>
	//   40   86:pop             
				i++;
	//   41   87:iload_2         
	//   42   88:iconst_1        
	//   43   89:iadd            
	//   44   90:istore_2        
			}
		}
		return ((List) (linkedlist));
	//*  45   91:goto            71
	}

	private List getFieldNames(Field field)
	{
		return getFieldName(fieldNamingPolicy, field);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field FieldNamingStrategy fieldNamingPolicy>
	//    2    4:aload_1         
	//    3    5:invokestatic    #207 <Method List getFieldName(FieldNamingStrategy, Field)>
	//    4    8:areturn         
	}

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		Class class1 = typetoken.getRawType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #46  <Method Class TypeToken.getRawType()>
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
	//   12   21:getfield        #27  <Field ConstructorConstructor constructorConstructor>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #219 <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:invokespecial   #221 <Method Map getBoundFields(Gson, TypeToken, Class)>
	//   20   35:aconst_null     
	//   21   36:invokespecial   #224 <Method void ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor, Map, ReflectiveTypeAdapterFactory$1)>
	//   22   39:areturn         
	}

	public boolean excludeField(Field field, boolean flag)
	{
		return excludeField(field, flag, excluder);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field Excluder excluder>
	//    4    6:invokestatic    #227 <Method boolean excludeField(Field, boolean, Excluder)>
	//    5    9:ireturn         
	}

	private final ConstructorConstructor constructorConstructor;
	private final Excluder excluder;
	private final FieldNamingStrategy fieldNamingPolicy;


/*
	static TypeAdapter access$100(ReflectiveTypeAdapterFactory reflectivetypeadapterfactory, Gson gson, Field field, TypeToken typetoken)
	{
		return reflectivetypeadapterfactory.getFieldAdapter(gson, field, typetoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #38  <Method TypeAdapter getFieldAdapter(Gson, Field, TypeToken)>
	//    5    7:areturn         
	}

*/
}
