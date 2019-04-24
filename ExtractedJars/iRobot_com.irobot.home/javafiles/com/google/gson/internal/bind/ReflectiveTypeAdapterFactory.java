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
		{
			Object obj;
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #41  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #47  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #50  <Method void JsonReader.nextNull()>
				return ((Object) (null));
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			obj = constructor.construct();
		//    8   16:aload_0         
		//    9   17:getfield        #21  <Field ObjectConstructor constructor>
		//   10   20:invokeinterface #56  <Method Object ObjectConstructor.construct()>
		//   11   25:astore_2        
			jsonreader.beginObject();
		//   12   26:aload_1         
		//   13   27:invokevirtual   #59  <Method void JsonReader.beginObject()>
_L1:
			Object obj1;
			if(!jsonreader.hasNext())
				break MISSING_BLOCK_LABEL_86;
		//   14   30:aload_1         
		//   15   31:invokevirtual   #63  <Method boolean JsonReader.hasNext()>
		//   16   34:ifeq            86
			obj1 = ((Object) (jsonreader.nextName()));
		//   17   37:aload_1         
		//   18   38:invokevirtual   #67  <Method String JsonReader.nextName()>
		//   19   41:astore_3        
			obj1 = ((Object) ((BoundField)boundFields.get(obj1)));
		//   20   42:aload_0         
		//   21   43:getfield        #23  <Field Map boundFields>
		//   22   46:aload_3         
		//   23   47:invokeinterface #73  <Method Object Map.get(Object)>
		//   24   52:checkcast       #75  <Class ReflectiveTypeAdapterFactory$BoundField>
		//   25   55:astore_3        
			if(obj1 == null)
				break MISSING_BLOCK_LABEL_79;
		//   26   56:aload_3         
		//   27   57:ifnull          79
			if(!((BoundField) (obj1)).deserialized)
		//*  28   60:aload_3         
		//*  29   61:getfield        #79  <Field boolean ReflectiveTypeAdapterFactory$BoundField.deserialized>
		//*  30   64:ifne            70
				break MISSING_BLOCK_LABEL_79;
		//   31   67:goto            79
			try
			{
				((BoundField) (obj1)).read(jsonreader, obj);
		//   32   70:aload_3         
		//   33   71:aload_1         
		//   34   72:aload_2         
		//   35   73:invokevirtual   #82  <Method void ReflectiveTypeAdapterFactory$BoundField.read(JsonReader, Object)>
			}
		//*  36   76:goto            30
		//*  37   79:aload_1         
		//*  38   80:invokevirtual   #85  <Method void JsonReader.skipValue()>
		//*  39   83:goto            30
		//*  40   86:aload_1         
		//*  41   87:invokevirtual   #88  <Method void JsonReader.endObject()>
		//*  42   90:aload_2         
		//*  43   91:areturn         
		//*  44   92:astore_1        
		//*  45   93:new             #90  <Class AssertionError>
		//*  46   96:dup             
		//*  47   97:aload_1         
		//*  48   98:invokespecial   #93  <Method void AssertionError(Object)>
		//*  49  101:athrow          
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  50  102:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   51  103:new             #95  <Class JsonSyntaxException>
		//   52  106:dup             
		//   53  107:aload_1         
		//   54  108:invokespecial   #98  <Method void JsonSyntaxException(Throwable)>
		//   55  111:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
			{
				throw new AssertionError(((Object) (jsonreader)));
			}
			  goto _L1
			jsonreader.skipValue();
			  goto _L1
			jsonreader.endObject();
			return obj;
		}

		public void write(JsonWriter jsonwriter, Object obj)
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
		//   19   45:checkcast       #75  <Class ReflectiveTypeAdapterFactory$BoundField>
		//   20   48:astore          4
				if(boundfield.writeField(obj))
		//*  21   50:aload           4
		//*  22   52:aload_2         
		//*  23   53:invokevirtual   #129 <Method boolean ReflectiveTypeAdapterFactory$BoundField.writeField(Object)>
		//*  24   56:ifeq            30
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
			jsonwriter.endObject();
		//   35   79:aload_1         
		//   36   80:invokevirtual   #140 <Method JsonWriter JsonWriter.endObject()>
		//   37   83:pop             
			return;
		//   38   84:return          
_L2:
			throw new AssertionError();
		//   39   85:new             #90  <Class AssertionError>
		//   40   88:dup             
		//   41   89:invokespecial   #141 <Method void AssertionError()>
		//   42   92:athrow          
			jsonwriter;
		//   43   93:astore_1        
			if(true) goto _L2; else goto _L1
_L1:
		//*  44   94:goto            85
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

		abstract void read(JsonReader jsonreader, Object obj);

		abstract void write(JsonWriter jsonwriter, Object obj);

		abstract boolean writeField(Object obj);

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
			{
				jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:getfield        #43  <Field TypeAdapter typeAdapter>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #51  <Method Object TypeAdapter.read(JsonReader)>
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
			//   14   26:invokevirtual   #57  <Method void Field.set(Object, Object)>
			//   15   29:return          
			}

			void write(JsonWriter jsonwriter, Object obj)
			{
				obj = field.get(obj);
			//    0    0:aload_0         
			//    1    1:getfield        #30  <Field Field val$field>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #63  <Method Object Field.get(Object)>
			//    4    8:astore_2        
				((TypeAdapter) (new TypeAdapterRuntimeTypeWrapper(context, typeAdapter, fieldType.getType()))).write(jsonwriter, obj);
			//    5    9:new             #65  <Class TypeAdapterRuntimeTypeWrapper>
			//    6   12:dup             
			//    7   13:aload_0         
			//    8   14:getfield        #28  <Field Gson val$context>
			//    9   17:aload_0         
			//   10   18:getfield        #43  <Field TypeAdapter typeAdapter>
			//   11   21:aload_0         
			//   12   22:getfield        #32  <Field TypeToken val$fieldType>
			//   13   25:invokevirtual   #71  <Method java.lang.reflect.Type TypeToken.getType()>
			//   14   28:invokespecial   #74  <Method void TypeAdapterRuntimeTypeWrapper(Gson, TypeAdapter, java.lang.reflect.Type)>
			//   15   31:aload_1         
			//   16   32:aload_2         
			//   17   33:invokevirtual   #76  <Method void TypeAdapter.write(JsonWriter, Object)>
			//   18   36:return          
			}

			public boolean writeField(Object obj)
			{
				boolean flag1 = serialized;
			//    0    0:aload_0         
			//    1    1:getfield        #81  <Field boolean serialized>
			//    2    4:istore_3        
				boolean flag = false;
			//    3    5:iconst_0        
			//    4    6:istore_2        
				if(!flag1)
			//*   5    7:iload_3         
			//*   6    8:ifne            13
					return false;
			//    7   11:iconst_0        
			//    8   12:ireturn         
				if(field.get(obj) != obj)
			//*   9   13:aload_0         
			//*  10   14:getfield        #30  <Field Field val$field>
			//*  11   17:aload_1         
			//*  12   18:invokevirtual   #63  <Method Object Field.get(Object)>
			//*  13   21:aload_1         
			//*  14   22:if_acmpeq       27
					flag = true;
			//   15   25:iconst_1        
			//   16   26:istore_2        
				return flag;
			//   17   27:iload_2         
			//   18   28:ireturn         
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
	//    3    7:astore          10
		if(class1.isInterface())
	//*   4    9:aload_3         
	//*   5   10:invokevirtual   #84  <Method boolean Class.isInterface()>
	//*   6   13:ifeq            19
			return ((Map) (linkedhashmap));
	//    7   16:aload           10
	//    8   18:areturn         
		java.lang.reflect.Type type = typetoken.getType();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #87  <Method java.lang.reflect.Type TypeToken.getType()>
	//   11   23:astore          9
		Class class2 = class1;
	//   12   25:aload_3         
	//   13   26:astore          8
		class1 = ((Class) (typetoken));
	//   14   28:aload_2         
	//   15   29:astore_3        
		for(typetoken = ((TypeToken) (class2)); typetoken != java/lang/Object; typetoken = ((TypeToken) (((TypeToken) (class1)).getRawType())))
	//*  16   30:aload           8
	//*  17   32:astore_2        
	//*  18   33:aload_2         
	//*  19   34:ldc1            #4   <Class Object>
	//*  20   36:if_acmpeq       244
		{
			Field afield[] = ((Class) (typetoken)).getDeclaredFields();
	//   21   39:aload_2         
	//   22   40:invokevirtual   #91  <Method Field[] Class.getDeclaredFields()>
	//   23   43:astore          8
			int j = afield.length;
	//   24   45:aload           8
	//   25   47:arraylength     
	//   26   48:istore          5
			for(int i = 0; i < j; i++)
	//*  27   50:iconst_0        
	//*  28   51:istore          4
	//*  29   53:iload           4
	//*  30   55:iload           5
	//*  31   57:icmpge          220
			{
				Object obj = ((Object) (afield[i]));
	//   32   60:aload           8
	//   33   62:iload           4
	//   34   64:aaload          
	//   35   65:astore          11
				boolean flag = excludeField(((Field) (obj)), true);
	//   36   67:aload_0         
	//   37   68:aload           11
	//   38   70:iconst_1        
	//   39   71:invokevirtual   #92  <Method boolean excludeField(Field, boolean)>
	//   40   74:istore          6
				boolean flag1 = excludeField(((Field) (obj)), false);
	//   41   76:aload_0         
	//   42   77:aload           11
	//   43   79:iconst_0        
	//   44   80:invokevirtual   #92  <Method boolean excludeField(Field, boolean)>
	//   45   83:istore          7
				if(!flag && !flag1)
	//*  46   85:iload           6
	//*  47   87:ifne            98
	//*  48   90:iload           7
	//*  49   92:ifne            98
					continue;
	//   50   95:goto            211
				((Field) (obj)).setAccessible(true);
	//   51   98:aload           11
	//   52  100:iconst_1        
	//   53  101:invokevirtual   #96  <Method void Field.setAccessible(boolean)>
				java.lang.reflect.Type type1 = com.google.gson.internal..Gson.Types.resolve(((TypeToken) (class1)).getType(), ((Class) (typetoken)), ((Field) (obj)).getGenericType());
	//   54  104:aload_3         
	//   55  105:invokevirtual   #87  <Method java.lang.reflect.Type TypeToken.getType()>
	//   56  108:aload_2         
	//   57  109:aload           11
	//   58  111:invokevirtual   #99  <Method java.lang.reflect.Type Field.getGenericType()>
	//   59  114:invokestatic    #105 <Method java.lang.reflect.Type com.google.gson.internal.$Gson$Types.resolve(java.lang.reflect.Type, Class, java.lang.reflect.Type)>
	//   60  117:astore          12
				obj = ((Object) (createBoundField(gson, ((Field) (obj)), getFieldName(((Field) (obj))), TypeToken.get(type1), flag, flag1)));
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:aload           11
	//   64  123:aload_0         
	//   65  124:aload           11
	//   66  126:invokespecial   #109 <Method String getFieldName(Field)>
	//   67  129:aload           12
	//   68  131:invokestatic    #113 <Method TypeToken TypeToken.get(java.lang.reflect.Type)>
	//   69  134:iload           6
	//   70  136:iload           7
	//   71  138:invokespecial   #115 <Method ReflectiveTypeAdapterFactory$BoundField createBoundField(Gson, Field, String, TypeToken, boolean, boolean)>
	//   72  141:astore          11
				obj = ((Object) ((BoundField)((Map) (linkedhashmap)).put(((Object) (((BoundField) (obj)).name)), obj)));
	//   73  143:aload           10
	//   74  145:aload           11
	//   75  147:getfield        #119 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
	//   76  150:aload           11
	//   77  152:invokeinterface #125 <Method Object Map.put(Object, Object)>
	//   78  157:checkcast       #13  <Class ReflectiveTypeAdapterFactory$BoundField>
	//   79  160:astore          11
				if(obj != null)
	//*  80  162:aload           11
	//*  81  164:ifnull          211
				{
					gson = ((Gson) (new StringBuilder()));
	//   82  167:new             #127 <Class StringBuilder>
	//   83  170:dup             
	//   84  171:invokespecial   #128 <Method void StringBuilder()>
	//   85  174:astore_1        
					((StringBuilder) (gson)).append(((Object) (type)));
	//   86  175:aload_1         
	//   87  176:aload           9
	//   88  178:invokevirtual   #132 <Method StringBuilder StringBuilder.append(Object)>
	//   89  181:pop             
					((StringBuilder) (gson)).append(" declares multiple JSON fields named ");
	//   90  182:aload_1         
	//   91  183:ldc1            #134 <String " declares multiple JSON fields named ">
	//   92  185:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   93  188:pop             
					((StringBuilder) (gson)).append(((BoundField) (obj)).name);
	//   94  189:aload_1         
	//   95  190:aload           11
	//   96  192:getfield        #119 <Field String ReflectiveTypeAdapterFactory$BoundField.name>
	//   97  195:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   98  198:pop             
					throw new IllegalArgumentException(((StringBuilder) (gson)).toString());
	//   99  199:new             #139 <Class IllegalArgumentException>
	//  100  202:dup             
	//  101  203:aload_1         
	//  102  204:invokevirtual   #143 <Method String StringBuilder.toString()>
	//  103  207:invokespecial   #146 <Method void IllegalArgumentException(String)>
	//  104  210:athrow          
				}
			}

	//  105  211:iload           4
	//  106  213:iconst_1        
	//  107  214:iadd            
	//  108  215:istore          4
	//* 109  217:goto            53
			class1 = ((Class) (TypeToken.get(com.google.gson.internal..Gson.Types.resolve(((TypeToken) (class1)).getType(), ((Class) (typetoken)), ((Class) (typetoken)).getGenericSuperclass()))));
	//  110  220:aload_3         
	//  111  221:invokevirtual   #87  <Method java.lang.reflect.Type TypeToken.getType()>
	//  112  224:aload_2         
	//  113  225:aload_2         
	//  114  226:invokevirtual   #149 <Method java.lang.reflect.Type Class.getGenericSuperclass()>
	//  115  229:invokestatic    #105 <Method java.lang.reflect.Type com.google.gson.internal.$Gson$Types.resolve(java.lang.reflect.Type, Class, java.lang.reflect.Type)>
	//  116  232:invokestatic    #113 <Method TypeToken TypeToken.get(java.lang.reflect.Type)>
	//  117  235:astore_3        
		}

	//  118  236:aload_3         
	//  119  237:invokevirtual   #46  <Method Class TypeToken.getRawType()>
	//  120  240:astore_2        
	//* 121  241:goto            33
		return ((Map) (linkedhashmap));
	//  122  244:aload           10
	//  123  246:areturn         
	}

	private TypeAdapter getFieldAdapter(Gson gson, Field field, TypeToken typetoken)
	{
		field = ((Field) ((JsonAdapter)field.getAnnotation(com/google/gson/annotations/JsonAdapter)));
	//    0    0:aload_2         
	//    1    1:ldc1            #152 <Class JsonAdapter>
	//    2    3:invokevirtual   #156 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//    3    6:checkcast       #152 <Class JsonAdapter>
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
	//   12   21:invokestatic    #162 <Method TypeAdapter JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(ConstructorConstructor, Gson, TypeToken, JsonAdapter)>
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
	//   20   33:invokevirtual   #168 <Method TypeAdapter Gson.getAdapter(TypeToken)>
	//   21   36:areturn         
	}

	static String getFieldName(FieldNamingStrategy fieldnamingstrategy, Field field)
	{
		SerializedName serializedname = (SerializedName)field.getAnnotation(com/google/gson/annotations/SerializedName);
	//    0    0:aload_1         
	//    1    1:ldc1            #172 <Class SerializedName>
	//    2    3:invokevirtual   #156 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//    3    6:checkcast       #172 <Class SerializedName>
	//    4    9:astore_2        
		if(serializedname == null)
	//*   5   10:aload_2         
	//*   6   11:ifnonnull       22
			return fieldnamingstrategy.translateName(field);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokeinterface #177 <Method String FieldNamingStrategy.translateName(Field)>
	//   10   21:areturn         
		else
			return serializedname.value();
	//   11   22:aload_2         
	//   12   23:invokeinterface #180 <Method String SerializedName.value()>
	//   13   28:areturn         
	}

	private String getFieldName(Field field)
	{
		return getFieldName(fieldNamingPolicy, field);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field FieldNamingStrategy fieldNamingPolicy>
	//    2    4:aload_1         
	//    3    5:invokestatic    #182 <Method String getFieldName(FieldNamingStrategy, Field)>
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
	//*   5    8:invokevirtual   #188 <Method boolean Class.isAssignableFrom(Class)>
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
	//   14   25:invokevirtual   #193 <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:invokespecial   #195 <Method Map getBoundFields(Gson, TypeToken, Class)>
	//   20   35:aconst_null     
	//   21   36:invokespecial   #198 <Method void ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor, Map, ReflectiveTypeAdapterFactory$1)>
	//   22   39:areturn         
	}

	public boolean excludeField(Field field, boolean flag)
	{
		return excludeField(field, flag, excluder);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field Excluder excluder>
	//    4    6:invokestatic    #201 <Method boolean excludeField(Field, boolean, Excluder)>
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
