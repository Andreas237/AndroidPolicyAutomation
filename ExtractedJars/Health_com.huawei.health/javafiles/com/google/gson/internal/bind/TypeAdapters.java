// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.*;
import java.sql.Timestamp;
import java.util.*;
import java.util.concurrent.atomic.*;

public final class TypeAdapters
{
	static final class EnumTypeAdapter extends TypeAdapter
	{

		public Enum read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #84  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #90  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #93  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return (Enum)nameToConstant.get(((Object) (jsonreader.nextString())));
		//    8   16:aload_0         
		//    9   17:getfield        #25  <Field Map nameToConstant>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #96  <Method String JsonReader.nextString()>
		//   12   24:invokeinterface #100 <Method Object Map.get(Object)>
		//   13   29:checkcast       #37  <Class Enum>
		//   14   32:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #105 <Method Enum read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Enum enum)
			throws IOException
		{
			if(enum == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       9
				enum = null;
		//    2    4:aconst_null     
		//    3    5:astore_2        
			else
		//*   4    6:goto            23
				enum = ((Enum) ((String)constantToName.get(((Object) (enum)))));
		//    5    9:aload_0         
		//    6   10:getfield        #27  <Field Map constantToName>
		//    7   13:aload_2         
		//    8   14:invokeinterface #100 <Method Object Map.get(Object)>
		//    9   19:checkcast       #109 <Class String>
		//   10   22:astore_2        
			jsonwriter.value(((String) (enum)));
		//   11   23:aload_1         
		//   12   24:aload_2         
		//   13   25:invokevirtual   #114 <Method JsonWriter JsonWriter.value(String)>
		//   14   28:pop             
		//   15   29:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Enum)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #37  <Class Enum>
		//    4    6:invokevirtual   #118 <Method void write(JsonWriter, Enum)>
		//    5    9:return          
		}

		private final Map constantToName;
		private final Map nameToConstant;

		public EnumTypeAdapter(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void TypeAdapter()>
			nameToConstant = ((Map) (new HashMap()));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #23  <Method void HashMap()>
		//    6   12:putfield        #25  <Field Map nameToConstant>
			constantToName = ((Map) (new HashMap()));
		//    7   15:aload_0         
		//    8   16:new             #22  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #23  <Method void HashMap()>
		//   11   23:putfield        #27  <Field Map constantToName>
			int i;
			int j;
			int k;
			int l;
			String s;
			String s1;
			Enum aenum[];
			Enum enum;
			SerializedName serializedname;
			String as[];
			try
			{
				aenum = (Enum[])class1.getEnumConstants();
		//   12   26:aload_1         
		//   13   27:invokevirtual   #33  <Method Object[] Class.getEnumConstants()>
		//   14   30:checkcast       #35  <Class Enum[]>
		//   15   33:astore          8
				k = aenum.length;
		//   16   35:aload           8
		//   17   37:arraylength     
		//   18   38:istore          4
			}
		//*  19   40:iconst_0        
		//*  20   41:istore_2        
		//*  21   42:iload_2         
		//*  22   43:iload           4
		//*  23   45:icmpge          179
		//*  24   48:aload           8
		//*  25   50:iload_2         
		//*  26   51:aaload          
		//*  27   52:astore          9
		//*  28   54:aload           9
		//*  29   56:invokevirtual   #41  <Method String Enum.name()>
		//*  30   59:astore          6
		//*  31   61:aload_1         
		//*  32   62:aload           6
		//*  33   64:invokevirtual   #45  <Method Field Class.getField(String)>
		//*  34   67:ldc1            #47  <Class SerializedName>
		//*  35   69:invokevirtual   #53  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
		//*  36   72:checkcast       #47  <Class SerializedName>
		//*  37   75:astore          10
		//*  38   77:aload           10
		//*  39   79:ifnull          144
		//*  40   82:aload           10
		//*  41   84:invokeinterface #56  <Method String SerializedName.value()>
		//*  42   89:astore          7
		//*  43   91:aload           10
		//*  44   93:invokeinterface #60  <Method String[] SerializedName.alternate()>
		//*  45   98:astore          10
		//*  46  100:aload           10
		//*  47  102:arraylength     
		//*  48  103:istore          5
		//*  49  105:iconst_0        
		//*  50  106:istore_3        
		//*  51  107:aload           7
		//*  52  109:astore          6
		//*  53  111:iload_3         
		//*  54  112:iload           5
		//*  55  114:icmpge          144
		//*  56  117:aload           10
		//*  57  119:iload_3         
		//*  58  120:aaload          
		//*  59  121:astore          6
		//*  60  123:aload_0         
		//*  61  124:getfield        #25  <Field Map nameToConstant>
		//*  62  127:aload           6
		//*  63  129:aload           9
		//*  64  131:invokeinterface #66  <Method Object Map.put(Object, Object)>
		//*  65  136:pop             
		//*  66  137:iload_3         
		//*  67  138:iconst_1        
		//*  68  139:iadd            
		//*  69  140:istore_3        
		//*  70  141:goto            107
		//*  71  144:aload_0         
		//*  72  145:getfield        #25  <Field Map nameToConstant>
		//*  73  148:aload           6
		//*  74  150:aload           9
		//*  75  152:invokeinterface #66  <Method Object Map.put(Object, Object)>
		//*  76  157:pop             
		//*  77  158:aload_0         
		//*  78  159:getfield        #27  <Field Map constantToName>
		//*  79  162:aload           9
		//*  80  164:aload           6
		//*  81  166:invokeinterface #66  <Method Object Map.put(Object, Object)>
		//*  82  171:pop             
		//*  83  172:iload_2         
		//*  84  173:iconst_1        
		//*  85  174:iadd            
		//*  86  175:istore_2        
		//*  87  176:goto            42
		//*  88  179:return          
			// Misplaced declaration of an exception variable
			catch(Class class1)
		//*  89  180:astore_1        
			{
				throw new AssertionError(((Object) (class1)));
		//   90  181:new             #68  <Class AssertionError>
		//   91  184:dup             
		//   92  185:aload_1         
		//   93  186:invokespecial   #71  <Method void AssertionError(Object)>
		//   94  189:athrow          
			}
			i = 0;
			if(i >= k)
				break; /* Loop/switch isn't completed */
			enum = aenum[i];
			s = enum.name();
			serializedname = (SerializedName)class1.getField(s).getAnnotation(com/google/gson/annotations/SerializedName);
			if(serializedname == null) goto _L2; else goto _L1
_L1:
			s1 = serializedname.value();
			as = serializedname.alternate();
			l = as.length;
			j = 0;
_L3:
			s = s1;
			if(j >= l)
				break; /* Loop/switch isn't completed */
			s = as[j];
			nameToConstant.put(((Object) (s)), ((Object) (enum)));
			j++;
			if(true) goto _L3; else goto _L2
_L2:
			nameToConstant.put(((Object) (s)), ((Object) (enum)));
			constantToName.put(((Object) (enum)), ((Object) (s)));
			i++;
			if(true) goto _L5; else goto _L4
_L5:
			break MISSING_BLOCK_LABEL_42;
_L4:
		}
	}


	private TypeAdapters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #374 <Method void Object()>
		throw new UnsupportedOperationException();
	//    2    4:new             #376 <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #377 <Method void UnsupportedOperationException()>
	//    5   11:athrow          
	}

	public static TypeAdapterFactory newFactory(TypeToken typetoken, TypeAdapter typeadapter)
	{
		return new TypeAdapterFactory(typetoken, typeadapter) {

			public TypeAdapter create(Gson gson, TypeToken typetoken1)
			{
				if(typetoken1.equals(((Object) (type))))
			//*   0    0:aload_2         
			//*   1    1:aload_0         
			//*   2    2:getfield        #19  <Field TypeToken val$type>
			//*   3    5:invokevirtual   #33  <Method boolean TypeToken.equals(Object)>
			//*   4    8:ifeq            16
					return typeAdapter;
			//    5   11:aload_0         
			//    6   12:getfield        #21  <Field TypeAdapter val$typeAdapter>
			//    7   15:areturn         
				else
					return null;
			//    8   16:aconst_null     
			//    9   17:areturn         
			}

			final TypeToken val$type;
			final TypeAdapter val$typeAdapter;

			
			{
				type = typetoken;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TypeToken val$type>
				typeAdapter = typeadapter;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TypeAdapter val$typeAdapter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #56  <Class TypeAdapters$31>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #381 <Method void TypeAdapters$31(TypeToken, TypeAdapter)>
	//    5    9:areturn         
	}

	public static TypeAdapterFactory newFactory(Class class1, TypeAdapter typeadapter)
	{
		return new TypeAdapterFactory(class1, typeadapter) {

			public TypeAdapter create(Gson gson, TypeToken typetoken)
			{
				if(typetoken.getRawType() == type)
			//*   0    0:aload_2         
			//*   1    1:invokevirtual   #33  <Method Class TypeToken.getRawType()>
			//*   2    4:aload_0         
			//*   3    5:getfield        #19  <Field Class val$type>
			//*   4    8:if_acmpne       16
					return typeAdapter;
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
				return (new StringBuilder()).append("Factory[type=").append(type.getName()).append(",adapter=").append(((Object) (typeAdapter))).append("]").toString();
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

			
			{
				type = class1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Class val$type>
				typeAdapter = typeadapter;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TypeAdapter val$typeAdapter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #58  <Class TypeAdapters$32>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #386 <Method void TypeAdapters$32(Class, TypeAdapter)>
	//    5    9:areturn         
	}

	public static TypeAdapterFactory newFactory(Class class1, Class class2, TypeAdapter typeadapter)
	{
		return new TypeAdapterFactory(class1, class2, typeadapter) {

			public TypeAdapter create(Gson gson, TypeToken typetoken)
			{
				gson = ((Gson) (typetoken.getRawType()));
			//    0    0:aload_2         
			//    1    1:invokevirtual   #36  <Method Class TypeToken.getRawType()>
			//    2    4:astore_1        
				if(gson == unboxed || gson == boxed)
			//*   3    5:aload_1         
			//*   4    6:aload_0         
			//*   5    7:getfield        #20  <Field Class val$unboxed>
			//*   6   10:if_acmpeq       21
			//*   7   13:aload_1         
			//*   8   14:aload_0         
			//*   9   15:getfield        #22  <Field Class val$boxed>
			//*  10   18:if_acmpne       26
					return typeAdapter;
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
				return (new StringBuilder()).append("Factory[type=").append(boxed.getName()).append("+").append(unboxed.getName()).append(",adapter=").append(((Object) (typeAdapter))).append("]").toString();
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

			
			{
				unboxed = class1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Class val$unboxed>
				boxed = class2;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Class val$boxed>
				typeAdapter = typeadapter;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field TypeAdapter val$typeAdapter>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
;
	//    0    0:new             #60  <Class TypeAdapters$33>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #390 <Method void TypeAdapters$33(Class, Class, TypeAdapter)>
	//    6   10:areturn         
	}

	public static TypeAdapterFactory newFactoryForMultipleTypes(Class class1, Class class2, TypeAdapter typeadapter)
	{
		return new TypeAdapterFactory(class1, class2, typeadapter) {

			public TypeAdapter create(Gson gson, TypeToken typetoken)
			{
				gson = ((Gson) (typetoken.getRawType()));
			//    0    0:aload_2         
			//    1    1:invokevirtual   #36  <Method Class TypeToken.getRawType()>
			//    2    4:astore_1        
				if(gson == base || gson == sub)
			//*   3    5:aload_1         
			//*   4    6:aload_0         
			//*   5    7:getfield        #20  <Field Class val$base>
			//*   6   10:if_acmpeq       21
			//*   7   13:aload_1         
			//*   8   14:aload_0         
			//*   9   15:getfield        #22  <Field Class val$sub>
			//*  10   18:if_acmpne       26
					return typeAdapter;
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
				return (new StringBuilder()).append("Factory[type=").append(base.getName()).append("+").append(sub.getName()).append(",adapter=").append(((Object) (typeAdapter))).append("]").toString();
			//    0    0:new             #42  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #43  <Method void StringBuilder()>
			//    3    7:ldc1            #45  <String "Factory[type=">
			//    4    9:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//    5   12:aload_0         
			//    6   13:getfield        #20  <Field Class val$base>
			//    7   16:invokevirtual   #54  <Method String Class.getName()>
			//    8   19:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//    9   22:ldc1            #56  <String "+">
			//   10   24:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   11   27:aload_0         
			//   12   28:getfield        #22  <Field Class val$sub>
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

			final Class val$base;
			final Class val$sub;
			final TypeAdapter val$typeAdapter;

			
			{
				base = class1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field Class val$base>
				sub = class2;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Class val$sub>
				typeAdapter = typeadapter;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field TypeAdapter val$typeAdapter>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
		}
;
	//    0    0:new             #62  <Class TypeAdapters$34>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #392 <Method void TypeAdapters$34(Class, Class, TypeAdapter)>
	//    6   10:areturn         
	}

	public static TypeAdapterFactory newTypeHierarchyFactory(Class class1, TypeAdapter typeadapter)
	{
		return new TypeAdapterFactory(class1, typeadapter) {

			public TypeAdapter create(Gson gson, TypeToken typetoken)
			{
				gson = ((Gson) (typetoken.getRawType()));
			//    0    0:aload_2         
			//    1    1:invokevirtual   #35  <Method Class TypeToken.getRawType()>
			//    2    4:astore_1        
				if(!clazz.isAssignableFrom(((Class) (gson))))
			//*   3    5:aload_0         
			//*   4    6:getfield        #21  <Field Class val$clazz>
			//*   5    9:aload_1         
			//*   6   10:invokevirtual   #41  <Method boolean Class.isAssignableFrom(Class)>
			//*   7   13:ifne            18
					return null;
			//    8   16:aconst_null     
			//    9   17:areturn         
				else
					return ((TypeAdapter) (((_cls1) (gson)). new TypeAdapter() {

						public Object read(JsonReader jsonreader)
							throws IOException
						{
							jsonreader = ((JsonReader) (typeAdapter.read(jsonreader)));
						//    0    0:aload_0         
						//    1    1:getfield        #18  <Field TypeAdapters$35 this$0>
						//    2    4:getfield        #32  <Field TypeAdapter TypeAdapters$35.val$typeAdapter>
						//    3    7:aload_1         
						//    4    8:invokevirtual   #34  <Method Object TypeAdapter.read(JsonReader)>
						//    5   11:astore_1        
							if(jsonreader != null && !requestedType.isInstance(((Object) (jsonreader))))
						//*   6   12:aload_1         
						//*   7   13:ifnull          75
						//*   8   16:aload_0         
						//*   9   17:getfield        #20  <Field Class val$requestedType>
						//*  10   20:aload_1         
						//*  11   21:invokevirtual   #40  <Method boolean Class.isInstance(Object)>
						//*  12   24:ifne            75
								throw new JsonSyntaxException((new StringBuilder()).append("Expected a ").append(requestedType.getName()).append(" but was ").append(((Object) (jsonreader)).getClass().getName()).toString());
						//   13   27:new             #42  <Class JsonSyntaxException>
						//   14   30:dup             
						//   15   31:new             #44  <Class StringBuilder>
						//   16   34:dup             
						//   17   35:invokespecial   #45  <Method void StringBuilder()>
						//   18   38:ldc1            #47  <String "Expected a ">
						//   19   40:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
						//   20   43:aload_0         
						//   21   44:getfield        #20  <Field Class val$requestedType>
						//   22   47:invokevirtual   #55  <Method String Class.getName()>
						//   23   50:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
						//   24   53:ldc1            #57  <String " but was ">
						//   25   55:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
						//   26   58:aload_1         
						//   27   59:invokevirtual   #63  <Method Class Object.getClass()>
						//   28   62:invokevirtual   #55  <Method String Class.getName()>
						//   29   65:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
						//   30   68:invokevirtual   #66  <Method String StringBuilder.toString()>
						//   31   71:invokespecial   #69  <Method void JsonSyntaxException(String)>
						//   32   74:athrow          
							else
								return ((Object) (jsonreader));
						//   33   75:aload_1         
						//   34   76:areturn         
						}

						public void write(JsonWriter jsonwriter, Object obj)
							throws IOException
						{
							typeAdapter.write(jsonwriter, obj);
						//    0    0:aload_0         
						//    1    1:getfield        #18  <Field TypeAdapters$35 this$0>
						//    2    4:getfield        #32  <Field TypeAdapter TypeAdapters$35.val$typeAdapter>
						//    3    7:aload_1         
						//    4    8:aload_2         
						//    5    9:invokevirtual   #76  <Method void TypeAdapter.write(JsonWriter, Object)>
						//    6   12:return          
						}

						final _cls35 this$0;
						final Class val$requestedType;

			
			{
				this$0 = final__pcls35;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TypeAdapters$35 this$0>
				requestedType = Class.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Class val$requestedType>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void TypeAdapter()>
			//    8   14:return          
			}
					}
));
			//   10   18:new             #13  <Class TypeAdapters$35$1>
			//   11   21:dup             
			//   12   22:aload_0         
			//   13   23:aload_1         
			//   14   24:invokespecial   #44  <Method void TypeAdapters$35$1(TypeAdapters$35, Class)>
			//   15   27:areturn         
			}

			public String toString()
			{
				return (new StringBuilder()).append("Factory[typeHierarchy=").append(clazz.getName()).append(",adapter=").append(((Object) (typeAdapter))).append("]").toString();
			//    0    0:new             #50  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #51  <Method void StringBuilder()>
			//    3    7:ldc1            #53  <String "Factory[typeHierarchy=">
			//    4    9:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//    5   12:aload_0         
			//    6   13:getfield        #21  <Field Class val$clazz>
			//    7   16:invokevirtual   #60  <Method String Class.getName()>
			//    8   19:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//    9   22:ldc1            #62  <String ",adapter=">
			//   10   24:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   11   27:aload_0         
			//   12   28:getfield        #23  <Field TypeAdapter val$typeAdapter>
			//   13   31:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
			//   14   34:ldc1            #67  <String "]">
			//   15   36:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   16   39:invokevirtual   #69  <Method String StringBuilder.toString()>
			//   17   42:areturn         
			}

			final Class val$clazz;
			final TypeAdapter val$typeAdapter;

			
			{
				clazz = class1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field Class val$clazz>
				typeAdapter = typeadapter;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field TypeAdapter val$typeAdapter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    0    0:new             #64  <Class TypeAdapters$35>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #394 <Method void TypeAdapters$35(Class, TypeAdapter)>
	//    5    9:areturn         
	}

	public static final TypeAdapter ATOMIC_BOOLEAN;
	public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
	public static final TypeAdapter ATOMIC_INTEGER;
	public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
	public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
	public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
	public static final TypeAdapter BIG_DECIMAL = new TypeAdapter() {

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #19  <Method BigDecimal read(JsonReader)>
		//    3    5:areturn         
		}

		public BigDecimal read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			try
			{
				jsonreader = ((JsonReader) (new BigDecimal(jsonreader.nextString())));
		//    8   16:new             #39  <Class BigDecimal>
		//    9   19:dup             
		//   10   20:aload_1         
		//   11   21:invokevirtual   #43  <Method String JsonReader.nextString()>
		//   12   24:invokespecial   #46  <Method void BigDecimal(String)>
		//   13   27:astore_1        
			}
		//*  14   28:aload_1         
		//*  15   29:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  16   30:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   17   31:new             #48  <Class JsonSyntaxException>
		//   18   34:dup             
		//   19   35:aload_1         
		//   20   36:invokespecial   #51  <Method void JsonSyntaxException(Throwable)>
		//   21   39:athrow          
			}
			return ((BigDecimal) (jsonreader));
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (BigDecimal)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #39  <Class BigDecimal>
		//    4    6:invokevirtual   #56  <Method void write(JsonWriter, BigDecimal)>
		//    5    9:return          
		}

		public void write(JsonWriter jsonwriter, BigDecimal bigdecimal)
			throws IOException
		{
			jsonwriter.value(((Number) (bigdecimal)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #62  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

	}
;
	public static final TypeAdapter BIG_INTEGER = new TypeAdapter() {

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #19  <Method BigInteger read(JsonReader)>
		//    3    5:areturn         
		}

		public BigInteger read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			try
			{
				jsonreader = ((JsonReader) (new BigInteger(jsonreader.nextString())));
		//    8   16:new             #39  <Class BigInteger>
		//    9   19:dup             
		//   10   20:aload_1         
		//   11   21:invokevirtual   #43  <Method String JsonReader.nextString()>
		//   12   24:invokespecial   #46  <Method void BigInteger(String)>
		//   13   27:astore_1        
			}
		//*  14   28:aload_1         
		//*  15   29:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  16   30:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   17   31:new             #48  <Class JsonSyntaxException>
		//   18   34:dup             
		//   19   35:aload_1         
		//   20   36:invokespecial   #51  <Method void JsonSyntaxException(Throwable)>
		//   21   39:athrow          
			}
			return ((BigInteger) (jsonreader));
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (BigInteger)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #39  <Class BigInteger>
		//    4    6:invokevirtual   #56  <Method void write(JsonWriter, BigInteger)>
		//    5    9:return          
		}

		public void write(JsonWriter jsonwriter, BigInteger biginteger)
			throws IOException
		{
			jsonwriter.value(((Number) (biginteger)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #62  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

	}
;
	public static final TypeAdapter BIT_SET;
	public static final TypeAdapterFactory BIT_SET_FACTORY;
	public static final TypeAdapter BOOLEAN;
	public static final TypeAdapter BOOLEAN_AS_STRING = new TypeAdapter() {

		public Boolean read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #28  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #31  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return Boolean.valueOf(jsonreader.nextString());
		//    8   16:aload_1         
		//    9   17:invokevirtual   #35  <Method String JsonReader.nextString()>
		//   10   20:invokestatic    #41  <Method Boolean Boolean.valueOf(String)>
		//   11   23:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method Boolean read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Boolean boolean1)
			throws IOException
		{
			if(boolean1 == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       10
				boolean1 = "null";
		//    2    4:ldc1            #49  <String "null">
		//    3    6:astore_2        
			else
		//*   4    7:goto            15
				boolean1 = ((Boolean) (boolean1.toString()));
		//    5   10:aload_2         
		//    6   11:invokevirtual   #52  <Method String Boolean.toString()>
		//    7   14:astore_2        
			jsonwriter.value(((String) (boolean1)));
		//    8   15:aload_1         
		//    9   16:aload_2         
		//   10   17:invokevirtual   #58  <Method JsonWriter JsonWriter.value(String)>
		//   11   20:pop             
		//   12   21:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Boolean)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #37  <Class Boolean>
		//    4    6:invokevirtual   #61  <Method void write(JsonWriter, Boolean)>
		//    5    9:return          
		}

	}
;
	public static final TypeAdapterFactory BOOLEAN_FACTORY;
	public static final TypeAdapter BYTE;
	public static final TypeAdapterFactory BYTE_FACTORY;
	public static final TypeAdapter CALENDAR;
	public static final TypeAdapterFactory CALENDAR_FACTORY;
	public static final TypeAdapter CHARACTER;
	public static final TypeAdapterFactory CHARACTER_FACTORY;
	public static final TypeAdapter CLASS;
	public static final TypeAdapterFactory CLASS_FACTORY;
	public static final TypeAdapter CURRENCY;
	public static final TypeAdapterFactory CURRENCY_FACTORY;
	public static final TypeAdapter DOUBLE = new TypeAdapter() {

		public Number read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #28  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #31  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return ((Number) (Double.valueOf(jsonreader.nextDouble())));
		//    8   16:aload_1         
		//    9   17:invokevirtual   #35  <Method double JsonReader.nextDouble()>
		//   10   20:invokestatic    #41  <Method Double Double.valueOf(double)>
		//   11   23:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method Number read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Number number)
			throws IOException
		{
			jsonwriter.value(number);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #53  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Number)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #56  <Class Number>
		//    4    6:invokevirtual   #58  <Method void write(JsonWriter, Number)>
		//    5    9:return          
		}

	}
;
	public static final TypeAdapterFactory ENUM_FACTORY = new TypeAdapterFactory() {

		public TypeAdapter create(Gson gson, TypeToken typetoken)
		{
			typetoken = ((TypeToken) (typetoken.getRawType()));
		//    0    0:aload_2         
		//    1    1:invokevirtual   #21  <Method Class TypeToken.getRawType()>
		//    2    4:astore_2        
			if(!((Class) (java/lang/Enum)).isAssignableFrom(((Class) (typetoken))) || typetoken == java/lang/Enum)
		//*   3    5:ldc1            #23  <Class Enum>
		//*   4    7:aload_2         
		//*   5    8:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
		//*   6   11:ifeq            20
		//*   7   14:aload_2         
		//*   8   15:ldc1            #23  <Class Enum>
		//*   9   17:if_acmpne       22
				return null;
		//   10   20:aconst_null     
		//   11   21:areturn         
			gson = ((Gson) (typetoken));
		//   12   22:aload_2         
		//   13   23:astore_1        
			if(!((Class) (typetoken)).isEnum())
		//*  14   24:aload_2         
		//*  15   25:invokevirtual   #33  <Method boolean Class.isEnum()>
		//*  16   28:ifne            36
				gson = ((Gson) (((Class) (typetoken)).getSuperclass()));
		//   17   31:aload_2         
		//   18   32:invokevirtual   #36  <Method Class Class.getSuperclass()>
		//   19   35:astore_1        
			return ((TypeAdapter) (new EnumTypeAdapter(((Class) (gson)))));
		//   20   36:new             #38  <Class TypeAdapters$EnumTypeAdapter>
		//   21   39:dup             
		//   22   40:aload_1         
		//   23   41:invokespecial   #41  <Method void TypeAdapters$EnumTypeAdapter(Class)>
		//   24   44:areturn         
		}

	}
;
	public static final TypeAdapter FLOAT = new TypeAdapter() {

		public Number read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #28  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #31  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return ((Number) (Float.valueOf((float)jsonreader.nextDouble())));
		//    8   16:aload_1         
		//    9   17:invokevirtual   #35  <Method double JsonReader.nextDouble()>
		//   10   20:d2f             
		//   11   21:invokestatic    #41  <Method Float Float.valueOf(float)>
		//   12   24:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method Number read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Number number)
			throws IOException
		{
			jsonwriter.value(number);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #53  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Number)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #56  <Class Number>
		//    4    6:invokevirtual   #58  <Method void write(JsonWriter, Number)>
		//    5    9:return          
		}

	}
;
	public static final TypeAdapter INET_ADDRESS;
	public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
	public static final TypeAdapter INTEGER;
	public static final TypeAdapterFactory INTEGER_FACTORY;
	public static final TypeAdapter JSON_ELEMENT;
	public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
	public static final TypeAdapter LOCALE;
	public static final TypeAdapterFactory LOCALE_FACTORY;
	public static final TypeAdapter LONG = new TypeAdapter() {

		public Number read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #24  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #30  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #33  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			long l;
			try
			{
				l = jsonreader.nextLong();
		//    8   16:aload_1         
		//    9   17:invokevirtual   #37  <Method long JsonReader.nextLong()>
		//   10   20:lstore_2        
			}
		//*  11   21:lload_2         
		//*  12   22:invokestatic    #43  <Method Long Long.valueOf(long)>
		//*  13   25:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  14   26:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   15   27:new             #45  <Class JsonSyntaxException>
		//   16   30:dup             
		//   17   31:aload_1         
		//   18   32:invokespecial   #48  <Method void JsonSyntaxException(Throwable)>
		//   19   35:athrow          
			}
			return ((Number) (Long.valueOf(l)));
		}

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #52  <Method Number read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Number number)
			throws IOException
		{
			jsonwriter.value(number);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #60  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Number)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #63  <Class Number>
		//    4    6:invokevirtual   #65  <Method void write(JsonWriter, Number)>
		//    5    9:return          
		}

	}
;
	public static final TypeAdapter NUMBER;
	public static final TypeAdapterFactory NUMBER_FACTORY;
	public static final TypeAdapter SHORT;
	public static final TypeAdapterFactory SHORT_FACTORY;
	public static final TypeAdapter STRING;
	public static final TypeAdapter STRING_BUFFER;
	public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
	public static final TypeAdapter STRING_BUILDER;
	public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
	public static final TypeAdapterFactory STRING_FACTORY;
	public static final TypeAdapterFactory TIMESTAMP_FACTORY = new TypeAdapterFactory() {

		public TypeAdapter create(Gson gson, TypeToken typetoken)
		{
			if(typetoken.getRawType() != java/sql/Timestamp)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #23  <Method Class TypeToken.getRawType()>
		//*   2    4:ldc1            #25  <Class Timestamp>
		//*   3    6:if_acmpeq       11
				return null;
		//    4    9:aconst_null     
		//    5   10:areturn         
			else
				return ((TypeAdapter) (((_cls1) (gson.getAdapter(java/util/Date))). new TypeAdapter() {

					public volatile Object read(JsonReader jsonreader)
						throws IOException
					{
						return ((Object) (read(jsonreader)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:invokevirtual   #31  <Method Timestamp read(JsonReader)>
					//    3    5:areturn         
					}

					public Timestamp read(JsonReader jsonreader)
						throws IOException
					{
						jsonreader = ((JsonReader) ((Date)dateTypeAdapter.read(jsonreader)));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field TypeAdapter val$dateTypeAdapter>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #34  <Method Object TypeAdapter.read(JsonReader)>
					//    4    8:checkcast       #36  <Class Date>
					//    5   11:astore_1        
						if(jsonreader != null)
					//*   6   12:aload_1         
					//*   7   13:ifnull          28
							return new Timestamp(((Date) (jsonreader)).getTime());
					//    8   16:new             #38  <Class Timestamp>
					//    9   19:dup             
					//   10   20:aload_1         
					//   11   21:invokevirtual   #42  <Method long Date.getTime()>
					//   12   24:invokespecial   #45  <Method void Timestamp(long)>
					//   13   27:areturn         
						else
							return null;
					//   14   28:aconst_null     
					//   15   29:areturn         
					}

					public volatile void write(JsonWriter jsonwriter, Object obj)
						throws IOException
					{
						write(jsonwriter, (Timestamp)obj);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:aload_2         
					//    3    3:checkcast       #38  <Class Timestamp>
					//    4    6:invokevirtual   #50  <Method void write(JsonWriter, Timestamp)>
					//    5    9:return          
					}

					public void write(JsonWriter jsonwriter, Timestamp timestamp)
						throws IOException
					{
						dateTypeAdapter.write(jsonwriter, ((Object) (timestamp)));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field TypeAdapter val$dateTypeAdapter>
					//    2    4:aload_1         
					//    3    5:aload_2         
					//    4    6:invokevirtual   #52  <Method void TypeAdapter.write(JsonWriter, Object)>
					//    5    9:return          
					}

					final _cls26 this$0;
					final TypeAdapter val$dateTypeAdapter;

			
			{
				this$0 = final__pcls26;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TypeAdapters$26 this$0>
				dateTypeAdapter = TypeAdapter.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field TypeAdapter val$dateTypeAdapter>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void TypeAdapter()>
			//    8   14:return          
			}
				}
));
		//    6   11:new             #10  <Class TypeAdapters$26$1>
		//    7   14:dup             
		//    8   15:aload_0         
		//    9   16:aload_1         
		//   10   17:ldc1            #27  <Class Date>
		//   11   19:invokevirtual   #33  <Method TypeAdapter Gson.getAdapter(Class)>
		//   12   22:invokespecial   #36  <Method void TypeAdapters$26$1(TypeAdapters$26, TypeAdapter)>
		//   13   25:areturn         
		}

	}
;
	public static final TypeAdapter URI;
	public static final TypeAdapterFactory URI_FACTORY;
	public static final TypeAdapter URL;
	public static final TypeAdapterFactory URL_FACTORY;
	public static final TypeAdapter UUID;
	public static final TypeAdapterFactory UUID_FACTORY;

	static 
	{
		CLASS = ((_cls1) (new TypeAdapter() {

			public Class read(JsonReader jsonreader)
				throws IOException
			{
				throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
			//    0    0:new             #18  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:ldc1            #20  <String "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?">
			//    3    6:invokespecial   #23  <Method void UnsupportedOperationException(String)>
			//    4    9:athrow          
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #27  <Method Class read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Class class1)
				throws IOException
			{
				throw new UnsupportedOperationException((new StringBuilder()).append("Attempted to serialize java.lang.Class: ").append(class1.getName()).append(". Forgot to register a type adapter?").toString());
			//    0    0:new             #18  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:new             #31  <Class StringBuilder>
			//    3    7:dup             
			//    4    8:invokespecial   #32  <Method void StringBuilder()>
			//    5   11:ldc1            #34  <String "Attempted to serialize java.lang.Class: ">
			//    6   13:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//    7   16:aload_2         
			//    8   17:invokevirtual   #44  <Method String Class.getName()>
			//    9   20:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   10   23:ldc1            #46  <String ". Forgot to register a type adapter?">
			//   11   25:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   12   28:invokevirtual   #49  <Method String StringBuilder.toString()>
			//   13   31:invokespecial   #23  <Method void UnsupportedOperationException(String)>
			//   14   34:athrow          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Class)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #40  <Class Class>
			//    4    6:invokevirtual   #52  <Method void write(JsonWriter, Class)>
			//    5    9:return          
			}

		}
)).nullSafe();
	//    0    0:new             #6   <Class TypeAdapters$1>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void TypeAdapters$1()>
	//    3    7:invokevirtual   #167 <Method TypeAdapter TypeAdapters$1.nullSafe()>
	//    4   10:putstatic       #169 <Field TypeAdapter CLASS>
		CLASS_FACTORY = newFactory(java/lang/Class, CLASS);
	//    5   13:ldc1            #171 <Class Class>
	//    6   15:getstatic       #169 <Field TypeAdapter CLASS>
	//    7   18:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//    8   21:putstatic       #177 <Field TypeAdapterFactory CLASS_FACTORY>
		BIT_SET = ((_cls2) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method BitSet read(JsonReader)>
			//    3    5:areturn         
			}

			public BitSet read(JsonReader jsonreader)
				throws IOException
			{
				BitSet bitset = new BitSet();
			//    0    0:new             #24  <Class BitSet>
			//    1    3:dup             
			//    2    4:invokespecial   #25  <Method void BitSet()>
			//    3    7:astore          6
				jsonreader.beginArray();
			//    4    9:aload_1         
			//    5   10:invokevirtual   #30  <Method void JsonReader.beginArray()>
				int i = 0;
			//    6   13:iconst_0        
			//    7   14:istore_2        
				for(Object obj = ((Object) (jsonreader.peek())); obj != JsonToken.END_ARRAY; obj = ((Object) (jsonreader.peek())))
			//*   8   15:aload_1         
			//*   9   16:invokevirtual   #34  <Method JsonToken JsonReader.peek()>
			//*  10   19:astore          5
			//*  11   21:aload           5
			//*  12   23:getstatic       #40  <Field JsonToken JsonToken.END_ARRAY>
			//*  13   26:if_acmpeq       204
				{
					static class _cls36
					{

						static final int $SwitchMap$com$google$gson$stream$JsonToken[];

						static 
						{
							$SwitchMap$com$google$gson$stream$JsonToken = new int[JsonToken.values().length];
						//    0    0:invokestatic    #18  <Method JsonToken[] JsonToken.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//    5   12:getstatic       #24  <Field JsonToken JsonToken.NUMBER>
						//    6   15:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:goto            24
							catch(NoSuchFieldError nosuchfielderror) { }
						//   10   23:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
						//   11   24:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   12   27:getstatic       #31  <Field JsonToken JsonToken.BOOLEAN>
						//   13   30:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   14   33:iconst_2        
						//   15   34:iastore         
							}
						//*  16   35:goto            39
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   17   38:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
						//   18   39:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   19   42:getstatic       #34  <Field JsonToken JsonToken.STRING>
						//   20   45:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   21   48:iconst_3        
						//   22   49:iastore         
							}
						//*  23   50:goto            54
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   24   53:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
						//   25   54:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   26   57:getstatic       #37  <Field JsonToken JsonToken.NULL>
						//   27   60:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   28   63:iconst_4        
						//   29   64:iastore         
							}
						//*  30   65:goto            69
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   31   68:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
						//   32   69:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   33   72:getstatic       #40  <Field JsonToken JsonToken.BEGIN_ARRAY>
						//   34   75:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   35   78:iconst_5        
						//   36   79:iastore         
							}
						//*  37   80:goto            84
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   38   83:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
						//   39   84:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   40   87:getstatic       #43  <Field JsonToken JsonToken.BEGIN_OBJECT>
						//   41   90:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   42   93:bipush          6
						//   43   95:iastore         
							}
						//*  44   96:goto            100
							catch(NoSuchFieldError nosuchfielderror5) { }
						//   45   99:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
						//   46  100:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   47  103:getstatic       #46  <Field JsonToken JsonToken.END_DOCUMENT>
						//   48  106:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   49  109:bipush          7
						//   50  111:iastore         
							}
						//*  51  112:goto            116
							catch(NoSuchFieldError nosuchfielderror6) { }
						//   52  115:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
						//   53  116:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   54  119:getstatic       #49  <Field JsonToken JsonToken.NAME>
						//   55  122:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   56  125:bipush          8
						//   57  127:iastore         
							}
						//*  58  128:goto            132
							catch(NoSuchFieldError nosuchfielderror7) { }
						//   59  131:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
						//   60  132:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   61  135:getstatic       #52  <Field JsonToken JsonToken.END_OBJECT>
						//   62  138:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   63  141:bipush          9
						//   64  143:iastore         
							}
						//*  65  144:goto            148
							catch(NoSuchFieldError nosuchfielderror8) { }
						//   66  147:astore_0        
							try
							{
								$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
						//   67  148:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
						//   68  151:getstatic       #55  <Field JsonToken JsonToken.END_ARRAY>
						//   69  154:invokevirtual   #28  <Method int JsonToken.ordinal()>
						//   70  157:bipush          10
						//   71  159:iastore         
						//   72  160:return          
							}
							catch(NoSuchFieldError nosuchfielderror9) { }
						//   73  161:astore_0        
						//*  74  162:return          
						}
					}

					boolean flag;
					switch(_cls36..SwitchMap.com.google.gson.stream.JsonToken[((JsonToken) (obj)).ordinal()])
			//*  14   29:getstatic       #46  <Field int[] TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken>
			//*  15   32:aload           5
			//*  16   34:invokevirtual   #50  <Method int JsonToken.ordinal()>
			//*  17   37:iaload          
					{
			//*  18   38:tableswitch     1 3: default 64
			//			               1 67
			//			               2 86
			//			               3 95
			//*  19   64:goto            152
					case 1: // '\001'
						if(jsonreader.nextInt() != 0)
			//*  20   67:aload_1         
			//*  21   68:invokevirtual   #53  <Method int JsonReader.nextInt()>
			//*  22   71:ifeq            80
							flag = true;
			//   23   74:iconst_1        
			//   24   75:istore          4
						else
			//*  25   77:goto            83
							flag = false;
			//   26   80:iconst_0        
			//   27   81:istore          4
						break;

			//*  28   83:goto            180
					case 2: // '\002'
						flag = jsonreader.nextBoolean();
			//   29   86:aload_1         
			//   30   87:invokevirtual   #57  <Method boolean JsonReader.nextBoolean()>
			//   31   90:istore          4
						break;

			//*  32   92:goto            180
					case 3: // '\003'
						obj = ((Object) (jsonreader.nextString()));
			//   33   95:aload_1         
			//   34   96:invokevirtual   #61  <Method String JsonReader.nextString()>
			//   35   99:astore          5
						int j;
						try
						{
							j = Integer.parseInt(((String) (obj)));
			//   36  101:aload           5
			//   37  103:invokestatic    #67  <Method int Integer.parseInt(String)>
			//   38  106:istore_3        
						}
			//*  39  107:iload_3         
			//*  40  108:ifeq            117
			//*  41  111:iconst_1        
			//*  42  112:istore          4
			//*  43  114:goto            120
			//*  44  117:iconst_0        
			//*  45  118:istore          4
			//*  46  120:goto            180
						// Misplaced declaration of an exception variable
						catch(JsonReader jsonreader)
			//*  47  123:astore_1        
						{
							throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(((String) (obj))).toString());
			//   48  124:new             #69  <Class JsonSyntaxException>
			//   49  127:dup             
			//   50  128:new             #71  <Class StringBuilder>
			//   51  131:dup             
			//   52  132:invokespecial   #72  <Method void StringBuilder()>
			//   53  135:ldc1            #74  <String "Error: Expecting: bitset number value (1, 0), Found: ">
			//   54  137:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
			//   55  140:aload           5
			//   56  142:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
			//   57  145:invokevirtual   #81  <Method String StringBuilder.toString()>
			//   58  148:invokespecial   #84  <Method void JsonSyntaxException(String)>
			//   59  151:athrow          
						}
						if(j != 0)
							flag = true;
						else
							flag = false;
						break;

					default:
						throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(obj).toString());
			//   60  152:new             #69  <Class JsonSyntaxException>
			//   61  155:dup             
			//   62  156:new             #71  <Class StringBuilder>
			//   63  159:dup             
			//   64  160:invokespecial   #72  <Method void StringBuilder()>
			//   65  163:ldc1            #86  <String "Invalid bitset value type: ">
			//   66  165:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
			//   67  168:aload           5
			//   68  170:invokevirtual   #89  <Method StringBuilder StringBuilder.append(Object)>
			//   69  173:invokevirtual   #81  <Method String StringBuilder.toString()>
			//   70  176:invokespecial   #84  <Method void JsonSyntaxException(String)>
			//   71  179:athrow          
					}
					if(flag)
			//*  72  180:iload           4
			//*  73  182:ifeq            191
						bitset.set(i);
			//   74  185:aload           6
			//   75  187:iload_2         
			//   76  188:invokevirtual   #93  <Method void BitSet.set(int)>
					i++;
			//   77  191:iload_2         
			//   78  192:iconst_1        
			//   79  193:iadd            
			//   80  194:istore_2        
				}

			//   81  195:aload_1         
			//   82  196:invokevirtual   #34  <Method JsonToken JsonReader.peek()>
			//   83  199:astore          5
			//*  84  201:goto            21
				jsonreader.endArray();
			//   85  204:aload_1         
			//   86  205:invokevirtual   #96  <Method void JsonReader.endArray()>
				return bitset;
			//   87  208:aload           6
			//   88  210:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (BitSet)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #24  <Class BitSet>
			//    4    6:invokevirtual   #101 <Method void write(JsonWriter, BitSet)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, BitSet bitset)
				throws IOException
			{
				jsonwriter.beginArray();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #106 <Method JsonWriter JsonWriter.beginArray()>
			//    2    4:pop             
				int i = 0;
			//    3    5:iconst_0        
			//    4    6:istore_3        
				for(int k = bitset.length(); i < k; i++)
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #109 <Method int BitSet.length()>
			//*   7   11:istore          5
			//*   8   13:iload_3         
			//*   9   14:iload           5
			//*  10   16:icmpge          51
				{
					int j;
					if(bitset.get(i))
			//*  11   19:aload_2         
			//*  12   20:iload_3         
			//*  13   21:invokevirtual   #113 <Method boolean BitSet.get(int)>
			//*  14   24:ifeq            33
						j = 1;
			//   15   27:iconst_1        
			//   16   28:istore          4
					else
			//*  17   30:goto            36
						j = 0;
			//   18   33:iconst_0        
			//   19   34:istore          4
					jsonwriter.value(j);
			//   20   36:aload_1         
			//   21   37:iload           4
			//   22   39:i2l             
			//   23   40:invokevirtual   #117 <Method JsonWriter JsonWriter.value(long)>
			//   24   43:pop             
				}

			//   25   44:iload_3         
			//   26   45:iconst_1        
			//   27   46:iadd            
			//   28   47:istore_3        
			//*  29   48:goto            13
				jsonwriter.endArray();
			//   30   51:aload_1         
			//   31   52:invokevirtual   #119 <Method JsonWriter JsonWriter.endArray()>
			//   32   55:pop             
			//   33   56:return          
			}

		}
)).nullSafe();
	//    9   24:new             #28  <Class TypeAdapters$2>
	//   10   27:dup             
	//   11   28:invokespecial   #178 <Method void TypeAdapters$2()>
	//   12   31:invokevirtual   #179 <Method TypeAdapter TypeAdapters$2.nullSafe()>
	//   13   34:putstatic       #181 <Field TypeAdapter BIT_SET>
		BIT_SET_FACTORY = newFactory(java/util/BitSet, BIT_SET);
	//   14   37:ldc1            #183 <Class BitSet>
	//   15   39:getstatic       #181 <Field TypeAdapter BIT_SET>
	//   16   42:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//   17   45:putstatic       #185 <Field TypeAdapterFactory BIT_SET_FACTORY>
		BOOLEAN = ((TypeAdapter) (new TypeAdapter() {

			public Boolean read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #28  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #31  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				if(jsonreader.peek() == JsonToken.STRING)
			//*   8   16:aload_1         
			//*   9   17:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
			//*  10   20:getstatic       #34  <Field JsonToken JsonToken.STRING>
			//*  11   23:if_acmpne       37
					return Boolean.valueOf(Boolean.parseBoolean(jsonreader.nextString()));
			//   12   26:aload_1         
			//   13   27:invokevirtual   #38  <Method String JsonReader.nextString()>
			//   14   30:invokestatic    #44  <Method boolean Boolean.parseBoolean(String)>
			//   15   33:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
			//   16   36:areturn         
				else
					return Boolean.valueOf(jsonreader.nextBoolean());
			//   17   37:aload_1         
			//   18   38:invokevirtual   #52  <Method boolean JsonReader.nextBoolean()>
			//   19   41:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
			//   20   44:areturn         
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #56  <Method Boolean read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Boolean boolean1)
				throws IOException
			{
				jsonwriter.value(boolean1);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #64  <Method JsonWriter JsonWriter.value(Boolean)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #40  <Class Boolean>
			//    4    6:invokevirtual   #67  <Method void write(JsonWriter, Boolean)>
			//    5    9:return          
			}

		}
));
	//   18   48:new             #52  <Class TypeAdapters$3>
	//   19   51:dup             
	//   20   52:invokespecial   #186 <Method void TypeAdapters$3()>
	//   21   55:putstatic       #188 <Field TypeAdapter BOOLEAN>
	//   22   58:new             #70  <Class TypeAdapters$4>
	//   23   61:dup             
	//   24   62:invokespecial   #189 <Method void TypeAdapters$4()>
	//   25   65:putstatic       #191 <Field TypeAdapter BOOLEAN_AS_STRING>
		BOOLEAN_FACTORY = newFactory(Boolean.TYPE, java/lang/Boolean, BOOLEAN);
	//   26   68:getstatic       #197 <Field Class Boolean.TYPE>
	//   27   71:ldc1            #193 <Class Boolean>
	//   28   73:getstatic       #188 <Field TypeAdapter BOOLEAN>
	//   29   76:invokestatic    #200 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   30   79:putstatic       #202 <Field TypeAdapterFactory BOOLEAN_FACTORY>
		BYTE = ((TypeAdapter) (new TypeAdapter() {

			public Number read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #24  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #30  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #33  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				byte byte0;
				try
				{
					byte0 = (byte)jsonreader.nextInt();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #37  <Method int JsonReader.nextInt()>
			//   10   20:int2byte        
			//   11   21:istore_2        
				}
			//*  12   22:iload_2         
			//*  13   23:invokestatic    #43  <Method Byte Byte.valueOf(byte)>
			//*  14   26:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  15   27:astore_1        
				{
					throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//   16   28:new             #45  <Class JsonSyntaxException>
			//   17   31:dup             
			//   18   32:aload_1         
			//   19   33:invokespecial   #48  <Method void JsonSyntaxException(Throwable)>
			//   20   36:athrow          
				}
				return ((Number) (Byte.valueOf(byte0)));
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #52  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
				throws IOException
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #60  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #63  <Class Number>
			//    4    6:invokevirtual   #65  <Method void write(JsonWriter, Number)>
			//    5    9:return          
			}

		}
));
	//   31   82:new             #72  <Class TypeAdapters$5>
	//   32   85:dup             
	//   33   86:invokespecial   #203 <Method void TypeAdapters$5()>
	//   34   89:putstatic       #205 <Field TypeAdapter BYTE>
		BYTE_FACTORY = newFactory(Byte.TYPE, java/lang/Byte, BYTE);
	//   35   92:getstatic       #208 <Field Class Byte.TYPE>
	//   36   95:ldc1            #207 <Class Byte>
	//   37   97:getstatic       #205 <Field TypeAdapter BYTE>
	//   38  100:invokestatic    #200 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   39  103:putstatic       #210 <Field TypeAdapterFactory BYTE_FACTORY>
		SHORT = ((TypeAdapter) (new TypeAdapter() {

			public Number read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #24  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #30  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #33  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				short word0;
				try
				{
					word0 = (short)jsonreader.nextInt();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #37  <Method int JsonReader.nextInt()>
			//   10   20:int2short       
			//   11   21:istore_2        
				}
			//*  12   22:iload_2         
			//*  13   23:invokestatic    #43  <Method Short Short.valueOf(short)>
			//*  14   26:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  15   27:astore_1        
				{
					throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//   16   28:new             #45  <Class JsonSyntaxException>
			//   17   31:dup             
			//   18   32:aload_1         
			//   19   33:invokespecial   #48  <Method void JsonSyntaxException(Throwable)>
			//   20   36:athrow          
				}
				return ((Number) (Short.valueOf(word0)));
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #52  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
				throws IOException
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #60  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #63  <Class Number>
			//    4    6:invokevirtual   #65  <Method void write(JsonWriter, Number)>
			//    5    9:return          
			}

		}
));
	//   40  106:new             #74  <Class TypeAdapters$6>
	//   41  109:dup             
	//   42  110:invokespecial   #211 <Method void TypeAdapters$6()>
	//   43  113:putstatic       #213 <Field TypeAdapter SHORT>
		SHORT_FACTORY = newFactory(Short.TYPE, java/lang/Short, SHORT);
	//   44  116:getstatic       #216 <Field Class Short.TYPE>
	//   45  119:ldc1            #215 <Class Short>
	//   46  121:getstatic       #213 <Field TypeAdapter SHORT>
	//   47  124:invokestatic    #200 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   48  127:putstatic       #218 <Field TypeAdapterFactory SHORT_FACTORY>
		INTEGER = ((TypeAdapter) (new TypeAdapter() {

			public Number read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #24  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #30  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #33  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				int i;
				try
				{
					i = jsonreader.nextInt();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #37  <Method int JsonReader.nextInt()>
			//   10   20:istore_2        
				}
			//*  11   21:iload_2         
			//*  12   22:invokestatic    #43  <Method Integer Integer.valueOf(int)>
			//*  13   25:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  14   26:astore_1        
				{
					throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//   15   27:new             #45  <Class JsonSyntaxException>
			//   16   30:dup             
			//   17   31:aload_1         
			//   18   32:invokespecial   #48  <Method void JsonSyntaxException(Throwable)>
			//   19   35:athrow          
				}
				return ((Number) (Integer.valueOf(i)));
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #52  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
				throws IOException
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #60  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #63  <Class Number>
			//    4    6:invokevirtual   #65  <Method void write(JsonWriter, Number)>
			//    5    9:return          
			}

		}
));
	//   49  130:new             #76  <Class TypeAdapters$7>
	//   50  133:dup             
	//   51  134:invokespecial   #219 <Method void TypeAdapters$7()>
	//   52  137:putstatic       #221 <Field TypeAdapter INTEGER>
		INTEGER_FACTORY = newFactory(Integer.TYPE, java/lang/Integer, INTEGER);
	//   53  140:getstatic       #224 <Field Class Integer.TYPE>
	//   54  143:ldc1            #223 <Class Integer>
	//   55  145:getstatic       #221 <Field TypeAdapter INTEGER>
	//   56  148:invokestatic    #200 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   57  151:putstatic       #226 <Field TypeAdapterFactory INTEGER_FACTORY>
		ATOMIC_INTEGER = ((_cls8) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method AtomicInteger read(JsonReader)>
			//    3    5:areturn         
			}

			public AtomicInteger read(JsonReader jsonreader)
				throws IOException
			{
				try
				{
					jsonreader = ((JsonReader) (new AtomicInteger(jsonreader.nextInt())));
			//    0    0:new             #24  <Class AtomicInteger>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method int JsonReader.nextInt()>
			//    4    8:invokespecial   #33  <Method void AtomicInteger(int)>
			//    5   11:astore_1        
				}
			//*   6   12:aload_1         
			//*   7   13:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*   8   14:astore_1        
				{
					throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//    9   15:new             #35  <Class JsonSyntaxException>
			//   10   18:dup             
			//   11   19:aload_1         
			//   12   20:invokespecial   #38  <Method void JsonSyntaxException(Throwable)>
			//   13   23:athrow          
				}
				return ((AtomicInteger) (jsonreader));
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (AtomicInteger)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #24  <Class AtomicInteger>
			//    4    6:invokevirtual   #43  <Method void write(JsonWriter, AtomicInteger)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, AtomicInteger atomicinteger)
				throws IOException
			{
				jsonwriter.value(atomicinteger.get());
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #46  <Method int AtomicInteger.get()>
			//    3    5:i2l             
			//    4    6:invokevirtual   #52  <Method JsonWriter JsonWriter.value(long)>
			//    5    9:pop             
			//    6   10:return          
			}

		}
)).nullSafe();
	//   58  154:new             #78  <Class TypeAdapters$8>
	//   59  157:dup             
	//   60  158:invokespecial   #227 <Method void TypeAdapters$8()>
	//   61  161:invokevirtual   #228 <Method TypeAdapter TypeAdapters$8.nullSafe()>
	//   62  164:putstatic       #230 <Field TypeAdapter ATOMIC_INTEGER>
		ATOMIC_INTEGER_FACTORY = newFactory(java/util/concurrent/atomic/AtomicInteger, ATOMIC_INTEGER);
	//   63  167:ldc1            #232 <Class AtomicInteger>
	//   64  169:getstatic       #230 <Field TypeAdapter ATOMIC_INTEGER>
	//   65  172:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//   66  175:putstatic       #234 <Field TypeAdapterFactory ATOMIC_INTEGER_FACTORY>
		ATOMIC_BOOLEAN = ((_cls9) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method AtomicBoolean read(JsonReader)>
			//    3    5:areturn         
			}

			public AtomicBoolean read(JsonReader jsonreader)
				throws IOException
			{
				return new AtomicBoolean(jsonreader.nextBoolean());
			//    0    0:new             #22  <Class AtomicBoolean>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:invokevirtual   #28  <Method boolean JsonReader.nextBoolean()>
			//    4    8:invokespecial   #31  <Method void AtomicBoolean(boolean)>
			//    5   11:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (AtomicBoolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #22  <Class AtomicBoolean>
			//    4    6:invokevirtual   #36  <Method void write(JsonWriter, AtomicBoolean)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, AtomicBoolean atomicboolean)
				throws IOException
			{
				jsonwriter.value(atomicboolean.get());
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #39  <Method boolean AtomicBoolean.get()>
			//    3    5:invokevirtual   #45  <Method JsonWriter JsonWriter.value(boolean)>
			//    4    8:pop             
			//    5    9:return          
			}

		}
)).nullSafe();
	//   67  178:new             #80  <Class TypeAdapters$9>
	//   68  181:dup             
	//   69  182:invokespecial   #235 <Method void TypeAdapters$9()>
	//   70  185:invokevirtual   #236 <Method TypeAdapter TypeAdapters$9.nullSafe()>
	//   71  188:putstatic       #238 <Field TypeAdapter ATOMIC_BOOLEAN>
		ATOMIC_BOOLEAN_FACTORY = newFactory(java/util/concurrent/atomic/AtomicBoolean, ATOMIC_BOOLEAN);
	//   72  191:ldc1            #240 <Class AtomicBoolean>
	//   73  193:getstatic       #238 <Field TypeAdapter ATOMIC_BOOLEAN>
	//   74  196:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//   75  199:putstatic       #242 <Field TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY>
		ATOMIC_INTEGER_ARRAY = ((_cls10) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method AtomicIntegerArray read(JsonReader)>
			//    3    5:areturn         
			}

			public AtomicIntegerArray read(JsonReader jsonreader)
				throws IOException
			{
				ArrayList arraylist = new ArrayList();
			//    0    0:new             #24  <Class ArrayList>
			//    1    3:dup             
			//    2    4:invokespecial   #25  <Method void ArrayList()>
			//    3    7:astore          4
				jsonreader.beginArray();
			//    4    9:aload_1         
			//    5   10:invokevirtual   #30  <Method void JsonReader.beginArray()>
				while(jsonreader.hasNext()) 
			//*   6   13:aload_1         
			//*   7   14:invokevirtual   #34  <Method boolean JsonReader.hasNext()>
			//*   8   17:ifeq            48
					try
					{
						((List) (arraylist)).add(((Object) (Integer.valueOf(jsonreader.nextInt()))));
			//    9   20:aload           4
			//   10   22:aload_1         
			//   11   23:invokevirtual   #38  <Method int JsonReader.nextInt()>
			//   12   26:invokestatic    #44  <Method Integer Integer.valueOf(int)>
			//   13   29:invokeinterface #50  <Method boolean List.add(Object)>
			//   14   34:pop             
					}
			//*  15   35:goto            13
					// Misplaced declaration of an exception variable
					catch(JsonReader jsonreader)
			//*  16   38:astore_1        
					{
						throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//   17   39:new             #52  <Class JsonSyntaxException>
			//   18   42:dup             
			//   19   43:aload_1         
			//   20   44:invokespecial   #55  <Method void JsonSyntaxException(Throwable)>
			//   21   47:athrow          
					}
				jsonreader.endArray();
			//   22   48:aload_1         
			//   23   49:invokevirtual   #58  <Method void JsonReader.endArray()>
				int j = ((List) (arraylist)).size();
			//   24   52:aload           4
			//   25   54:invokeinterface #61  <Method int List.size()>
			//   26   59:istore_3        
				jsonreader = ((JsonReader) (new AtomicIntegerArray(j)));
			//   27   60:new             #63  <Class AtomicIntegerArray>
			//   28   63:dup             
			//   29   64:iload_3         
			//   30   65:invokespecial   #66  <Method void AtomicIntegerArray(int)>
			//   31   68:astore_1        
				for(int i = 0; i < j; i++)
			//*  32   69:iconst_0        
			//*  33   70:istore_2        
			//*  34   71:iload_2         
			//*  35   72:iload_3         
			//*  36   73:icmpge          102
					((AtomicIntegerArray) (jsonreader)).set(i, ((Integer)((List) (arraylist)).get(i)).intValue());
			//   37   76:aload_1         
			//   38   77:iload_2         
			//   39   78:aload           4
			//   40   80:iload_2         
			//   41   81:invokeinterface #70  <Method Object List.get(int)>
			//   42   86:checkcast       #40  <Class Integer>
			//   43   89:invokevirtual   #73  <Method int Integer.intValue()>
			//   44   92:invokevirtual   #77  <Method void AtomicIntegerArray.set(int, int)>

			//   45   95:iload_2         
			//   46   96:iconst_1        
			//   47   97:iadd            
			//   48   98:istore_2        
			//*  49   99:goto            71
				return ((AtomicIntegerArray) (jsonreader));
			//   50  102:aload_1         
			//   51  103:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (AtomicIntegerArray)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #63  <Class AtomicIntegerArray>
			//    4    6:invokevirtual   #82  <Method void write(JsonWriter, AtomicIntegerArray)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, AtomicIntegerArray atomicintegerarray)
				throws IOException
			{
				jsonwriter.beginArray();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #87  <Method JsonWriter JsonWriter.beginArray()>
			//    2    4:pop             
				int i = 0;
			//    3    5:iconst_0        
			//    4    6:istore_3        
				for(int j = atomicintegerarray.length(); i < j; i++)
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #90  <Method int AtomicIntegerArray.length()>
			//*   7   11:istore          4
			//*   8   13:iload_3         
			//*   9   14:iload           4
			//*  10   16:icmpge          37
					jsonwriter.value(atomicintegerarray.get(i));
			//   11   19:aload_1         
			//   12   20:aload_2         
			//   13   21:iload_3         
			//   14   22:invokevirtual   #93  <Method int AtomicIntegerArray.get(int)>
			//   15   25:i2l             
			//   16   26:invokevirtual   #97  <Method JsonWriter JsonWriter.value(long)>
			//   17   29:pop             

			//   18   30:iload_3         
			//   19   31:iconst_1        
			//   20   32:iadd            
			//   21   33:istore_3        
			//*  22   34:goto            13
				jsonwriter.endArray();
			//   23   37:aload_1         
			//   24   38:invokevirtual   #99  <Method JsonWriter JsonWriter.endArray()>
			//   25   41:pop             
			//   26   42:return          
			}

		}
)).nullSafe();
	//   76  202:new             #8   <Class TypeAdapters$10>
	//   77  205:dup             
	//   78  206:invokespecial   #243 <Method void TypeAdapters$10()>
	//   79  209:invokevirtual   #244 <Method TypeAdapter TypeAdapters$10.nullSafe()>
	//   80  212:putstatic       #246 <Field TypeAdapter ATOMIC_INTEGER_ARRAY>
		ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(java/util/concurrent/atomic/AtomicIntegerArray, ATOMIC_INTEGER_ARRAY);
	//   81  215:ldc1            #248 <Class AtomicIntegerArray>
	//   82  217:getstatic       #246 <Field TypeAdapter ATOMIC_INTEGER_ARRAY>
	//   83  220:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//   84  223:putstatic       #250 <Field TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY>
	//   85  226:new             #10  <Class TypeAdapters$11>
	//   86  229:dup             
	//   87  230:invokespecial   #251 <Method void TypeAdapters$11()>
	//   88  233:putstatic       #253 <Field TypeAdapter LONG>
	//   89  236:new             #12  <Class TypeAdapters$12>
	//   90  239:dup             
	//   91  240:invokespecial   #254 <Method void TypeAdapters$12()>
	//   92  243:putstatic       #256 <Field TypeAdapter FLOAT>
	//   93  246:new             #14  <Class TypeAdapters$13>
	//   94  249:dup             
	//   95  250:invokespecial   #257 <Method void TypeAdapters$13()>
	//   96  253:putstatic       #259 <Field TypeAdapter DOUBLE>
		NUMBER = ((TypeAdapter) (new TypeAdapter() {

			public Number read(JsonReader jsonreader)
				throws IOException
			{
				JsonToken jsontoken = jsonreader.peek();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
			//    2    4:astore_2        
				switch(_cls36..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
			//*   3    5:getstatic       #28  <Field int[] TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken>
			//*   4    8:aload_2         
			//*   5    9:invokevirtual   #34  <Method int JsonToken.ordinal()>
			//*   6   12:iaload          
				{
			//*   7   13:tableswitch     1 4: default 44
			//			               1 53
			//			               2 65
			//			               3 53
			//			               4 47
			//*   8   44:goto            65
				case 4: // '\004'
					jsonreader.nextNull();
			//    9   47:aload_1         
			//   10   48:invokevirtual   #37  <Method void JsonReader.nextNull()>
					return null;
			//   11   51:aconst_null     
			//   12   52:areturn         

				case 1: // '\001'
				case 3: // '\003'
					return ((Number) (new LazilyParsedNumber(jsonreader.nextString())));
			//   13   53:new             #39  <Class LazilyParsedNumber>
			//   14   56:dup             
			//   15   57:aload_1         
			//   16   58:invokevirtual   #43  <Method String JsonReader.nextString()>
			//   17   61:invokespecial   #46  <Method void LazilyParsedNumber(String)>
			//   18   64:areturn         
				}
				throw new JsonSyntaxException((new StringBuilder()).append("Expecting number, got: ").append(((Object) (jsontoken))).toString());
			//   19   65:new             #48  <Class JsonSyntaxException>
			//   20   68:dup             
			//   21   69:new             #50  <Class StringBuilder>
			//   22   72:dup             
			//   23   73:invokespecial   #51  <Method void StringBuilder()>
			//   24   76:ldc1            #53  <String "Expecting number, got: ">
			//   25   78:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   26   81:aload_2         
			//   27   82:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
			//   28   85:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   29   88:invokespecial   #64  <Method void JsonSyntaxException(String)>
			//   30   91:athrow          
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #68  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
				throws IOException
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #76  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #79  <Class Number>
			//    4    6:invokevirtual   #81  <Method void write(JsonWriter, Number)>
			//    5    9:return          
			}

		}
));
	//   97  256:new             #16  <Class TypeAdapters$14>
	//   98  259:dup             
	//   99  260:invokespecial   #260 <Method void TypeAdapters$14()>
	//  100  263:putstatic       #262 <Field TypeAdapter NUMBER>
		NUMBER_FACTORY = newFactory(java/lang/Number, NUMBER);
	//  101  266:ldc2            #264 <Class Number>
	//  102  269:getstatic       #262 <Field TypeAdapter NUMBER>
	//  103  272:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  104  275:putstatic       #266 <Field TypeAdapterFactory NUMBER_FACTORY>
		CHARACTER = ((TypeAdapter) (new TypeAdapter() {

			public Character read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #28  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #31  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #35  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
				if(((String) (jsonreader)).length() != 1)
			//*  11   21:aload_1         
			//*  12   22:invokevirtual   #41  <Method int String.length()>
			//*  13   25:iconst_1        
			//*  14   26:icmpeq          56
					throw new JsonSyntaxException((new StringBuilder()).append("Expecting character, got: ").append(((String) (jsonreader))).toString());
			//   15   29:new             #43  <Class JsonSyntaxException>
			//   16   32:dup             
			//   17   33:new             #45  <Class StringBuilder>
			//   18   36:dup             
			//   19   37:invokespecial   #46  <Method void StringBuilder()>
			//   20   40:ldc1            #48  <String "Expecting character, got: ">
			//   21   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
			//   22   45:aload_1         
			//   23   46:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
			//   24   49:invokevirtual   #55  <Method String StringBuilder.toString()>
			//   25   52:invokespecial   #58  <Method void JsonSyntaxException(String)>
			//   26   55:athrow          
				else
					return Character.valueOf(((String) (jsonreader)).charAt(0));
			//   27   56:aload_1         
			//   28   57:iconst_0        
			//   29   58:invokevirtual   #62  <Method char String.charAt(int)>
			//   30   61:invokestatic    #68  <Method Character Character.valueOf(char)>
			//   31   64:areturn         
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #72  <Method Character read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Character character)
				throws IOException
			{
				if(character == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					character = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					character = ((Character) (String.valueOf(((Object) (character)))));
			//    5    9:aload_2         
			//    6   10:invokestatic    #77  <Method String String.valueOf(Object)>
			//    7   13:astore_2        
				jsonwriter.value(((String) (character)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #83  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Character)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #64  <Class Character>
			//    4    6:invokevirtual   #86  <Method void write(JsonWriter, Character)>
			//    5    9:return          
			}

		}
));
	//  105  278:new             #18  <Class TypeAdapters$15>
	//  106  281:dup             
	//  107  282:invokespecial   #267 <Method void TypeAdapters$15()>
	//  108  285:putstatic       #269 <Field TypeAdapter CHARACTER>
		CHARACTER_FACTORY = newFactory(Character.TYPE, java/lang/Character, CHARACTER);
	//  109  288:getstatic       #272 <Field Class Character.TYPE>
	//  110  291:ldc2            #271 <Class Character>
	//  111  294:getstatic       #269 <Field TypeAdapter CHARACTER>
	//  112  297:invokestatic    #200 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//  113  300:putstatic       #274 <Field TypeAdapterFactory CHARACTER_FACTORY>
		STRING = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method String read(JsonReader)>
			//    3    5:areturn         
			}

			public String read(JsonReader jsonreader)
				throws IOException
			{
				JsonToken jsontoken = jsonreader.peek();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//    2    4:astore_2        
				if(jsontoken == JsonToken.NULL)
			//*   3    5:aload_2         
			//*   4    6:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   5    9:if_acmpne       18
				{
					jsonreader.nextNull();
			//    6   12:aload_1         
			//    7   13:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return null;
			//    8   16:aconst_null     
			//    9   17:areturn         
				}
				if(jsontoken == JsonToken.BOOLEAN)
			//*  10   18:aload_2         
			//*  11   19:getstatic       #38  <Field JsonToken JsonToken.BOOLEAN>
			//*  12   22:if_acmpne       33
					return Boolean.toString(jsonreader.nextBoolean());
			//   13   25:aload_1         
			//   14   26:invokevirtual   #42  <Method boolean JsonReader.nextBoolean()>
			//   15   29:invokestatic    #48  <Method String Boolean.toString(boolean)>
			//   16   32:areturn         
				else
					return jsonreader.nextString();
			//   17   33:aload_1         
			//   18   34:invokevirtual   #52  <Method String JsonReader.nextString()>
			//   19   37:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (String)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #56  <Class String>
			//    4    6:invokevirtual   #59  <Method void write(JsonWriter, String)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, String s)
				throws IOException
			{
				jsonwriter.value(s);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #65  <Method JsonWriter JsonWriter.value(String)>
			//    3    5:pop             
			//    4    6:return          
			}

		}
));
	//  114  303:new             #20  <Class TypeAdapters$16>
	//  115  306:dup             
	//  116  307:invokespecial   #275 <Method void TypeAdapters$16()>
	//  117  310:putstatic       #277 <Field TypeAdapter STRING>
	//  118  313:new             #22  <Class TypeAdapters$17>
	//  119  316:dup             
	//  120  317:invokespecial   #278 <Method void TypeAdapters$17()>
	//  121  320:putstatic       #280 <Field TypeAdapter BIG_DECIMAL>
	//  122  323:new             #24  <Class TypeAdapters$18>
	//  123  326:dup             
	//  124  327:invokespecial   #281 <Method void TypeAdapters$18()>
	//  125  330:putstatic       #283 <Field TypeAdapter BIG_INTEGER>
		STRING_FACTORY = newFactory(java/lang/String, STRING);
	//  126  333:ldc2            #285 <Class String>
	//  127  336:getstatic       #277 <Field TypeAdapter STRING>
	//  128  339:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  129  342:putstatic       #287 <Field TypeAdapterFactory STRING_FACTORY>
		STRING_BUILDER = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method StringBuilder read(JsonReader)>
			//    3    5:areturn         
			}

			public StringBuilder read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return new StringBuilder(jsonreader.nextString());
			//    8   16:new             #37  <Class StringBuilder>
			//    9   19:dup             
			//   10   20:aload_1         
			//   11   21:invokevirtual   #41  <Method String JsonReader.nextString()>
			//   12   24:invokespecial   #44  <Method void StringBuilder(String)>
			//   13   27:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (StringBuilder)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #37  <Class StringBuilder>
			//    4    6:invokevirtual   #49  <Method void write(JsonWriter, StringBuilder)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, StringBuilder stringbuilder)
				throws IOException
			{
				if(stringbuilder == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					stringbuilder = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					stringbuilder = ((StringBuilder) (stringbuilder.toString()));
			//    5    9:aload_2         
			//    6   10:invokevirtual   #52  <Method String StringBuilder.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (stringbuilder)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #58  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

		}
));
	//  130  345:new             #26  <Class TypeAdapters$19>
	//  131  348:dup             
	//  132  349:invokespecial   #288 <Method void TypeAdapters$19()>
	//  133  352:putstatic       #290 <Field TypeAdapter STRING_BUILDER>
		STRING_BUILDER_FACTORY = newFactory(java/lang/StringBuilder, STRING_BUILDER);
	//  134  355:ldc2            #292 <Class StringBuilder>
	//  135  358:getstatic       #290 <Field TypeAdapter STRING_BUILDER>
	//  136  361:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  137  364:putstatic       #294 <Field TypeAdapterFactory STRING_BUILDER_FACTORY>
		STRING_BUFFER = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method StringBuffer read(JsonReader)>
			//    3    5:areturn         
			}

			public StringBuffer read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return new StringBuffer(jsonreader.nextString());
			//    8   16:new             #37  <Class StringBuffer>
			//    9   19:dup             
			//   10   20:aload_1         
			//   11   21:invokevirtual   #41  <Method String JsonReader.nextString()>
			//   12   24:invokespecial   #44  <Method void StringBuffer(String)>
			//   13   27:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (StringBuffer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #37  <Class StringBuffer>
			//    4    6:invokevirtual   #49  <Method void write(JsonWriter, StringBuffer)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, StringBuffer stringbuffer)
				throws IOException
			{
				if(stringbuffer == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					stringbuffer = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					stringbuffer = ((StringBuffer) (stringbuffer.toString()));
			//    5    9:aload_2         
			//    6   10:invokevirtual   #52  <Method String StringBuffer.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (stringbuffer)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #58  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

		}
));
	//  138  367:new             #30  <Class TypeAdapters$20>
	//  139  370:dup             
	//  140  371:invokespecial   #295 <Method void TypeAdapters$20()>
	//  141  374:putstatic       #297 <Field TypeAdapter STRING_BUFFER>
		STRING_BUFFER_FACTORY = newFactory(java/lang/StringBuffer, STRING_BUFFER);
	//  142  377:ldc2            #299 <Class StringBuffer>
	//  143  380:getstatic       #297 <Field TypeAdapter STRING_BUFFER>
	//  144  383:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  145  386:putstatic       #301 <Field TypeAdapterFactory STRING_BUFFER_FACTORY>
		URL = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method URL read(JsonReader)>
			//    3    5:areturn         
			}

			public URL read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #39  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
				if("null".equals(((Object) (jsonreader))))
			//*  11   21:ldc1            #41  <String "null">
			//*  12   23:aload_1         
			//*  13   24:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  14   27:ifeq            32
					return null;
			//   15   30:aconst_null     
			//   16   31:areturn         
				else
					return new URL(((String) (jsonreader)));
			//   17   32:new             #49  <Class URL>
			//   18   35:dup             
			//   19   36:aload_1         
			//   20   37:invokespecial   #52  <Method void URL(String)>
			//   21   40:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (URL)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #49  <Class URL>
			//    4    6:invokevirtual   #57  <Method void write(JsonWriter, URL)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, URL url)
				throws IOException
			{
				if(url == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					url = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					url = ((URL) (url.toExternalForm()));
			//    5    9:aload_2         
			//    6   10:invokevirtual   #60  <Method String URL.toExternalForm()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (url)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #66  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

		}
));
	//  146  389:new             #32  <Class TypeAdapters$21>
	//  147  392:dup             
	//  148  393:invokespecial   #302 <Method void TypeAdapters$21()>
	//  149  396:putstatic       #304 <Field TypeAdapter URL>
		URL_FACTORY = newFactory(java/net/URL, URL);
	//  150  399:ldc2            #306 <Class URL>
	//  151  402:getstatic       #304 <Field TypeAdapter URL>
	//  152  405:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  153  408:putstatic       #308 <Field TypeAdapterFactory URL_FACTORY>
		URI = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method URI read(JsonReader)>
			//    3    5:areturn         
			}

			public URI read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #41  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
				if("null".equals(((Object) (jsonreader))))
			//*  11   21:ldc1            #43  <String "null">
			//*  12   23:aload_1         
			//*  13   24:invokevirtual   #49  <Method boolean String.equals(Object)>
			//*  14   27:ifeq            32
					return null;
			//   15   30:aconst_null     
			//   16   31:areturn         
				try
				{
					jsonreader = ((JsonReader) (new URI(((String) (jsonreader)))));
			//   17   32:new             #51  <Class URI>
			//   18   35:dup             
			//   19   36:aload_1         
			//   20   37:invokespecial   #54  <Method void URI(String)>
			//   21   40:astore_1        
				}
			//*  22   41:aload_1         
			//*  23   42:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  24   43:astore_1        
				{
					throw new JsonIOException(((Throwable) (jsonreader)));
			//   25   44:new             #56  <Class JsonIOException>
			//   26   47:dup             
			//   27   48:aload_1         
			//   28   49:invokespecial   #59  <Method void JsonIOException(Throwable)>
			//   29   52:athrow          
				}
				return ((URI) (jsonreader));
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (URI)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #51  <Class URI>
			//    4    6:invokevirtual   #64  <Method void write(JsonWriter, URI)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, URI uri)
				throws IOException
			{
				if(uri == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					uri = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					uri = ((URI) (uri.toASCIIString()));
			//    5    9:aload_2         
			//    6   10:invokevirtual   #67  <Method String URI.toASCIIString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (uri)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #73  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

		}
));
	//  154  411:new             #34  <Class TypeAdapters$22>
	//  155  414:dup             
	//  156  415:invokespecial   #309 <Method void TypeAdapters$22()>
	//  157  418:putstatic       #311 <Field TypeAdapter URI>
		URI_FACTORY = newFactory(java/net/URI, URI);
	//  158  421:ldc2            #313 <Class URI>
	//  159  424:getstatic       #311 <Field TypeAdapter URI>
	//  160  427:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  161  430:putstatic       #315 <Field TypeAdapterFactory URI_FACTORY>
		INET_ADDRESS = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method InetAddress read(JsonReader)>
			//    3    5:areturn         
			}

			public InetAddress read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return InetAddress.getByName(jsonreader.nextString());
			//    8   16:aload_1         
			//    9   17:invokevirtual   #39  <Method String JsonReader.nextString()>
			//   10   20:invokestatic    #45  <Method InetAddress InetAddress.getByName(String)>
			//   11   23:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (InetAddress)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #41  <Class InetAddress>
			//    4    6:invokevirtual   #50  <Method void write(JsonWriter, InetAddress)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, InetAddress inetaddress)
				throws IOException
			{
				if(inetaddress == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					inetaddress = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					inetaddress = ((InetAddress) (inetaddress.getHostAddress()));
			//    5    9:aload_2         
			//    6   10:invokevirtual   #53  <Method String InetAddress.getHostAddress()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (inetaddress)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #59  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

		}
));
	//  162  433:new             #36  <Class TypeAdapters$23>
	//  163  436:dup             
	//  164  437:invokespecial   #316 <Method void TypeAdapters$23()>
	//  165  440:putstatic       #318 <Field TypeAdapter INET_ADDRESS>
		INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java/net/InetAddress, INET_ADDRESS);
	//  166  443:ldc2            #320 <Class InetAddress>
	//  167  446:getstatic       #318 <Field TypeAdapter INET_ADDRESS>
	//  168  449:invokestatic    #323 <Method TypeAdapterFactory newTypeHierarchyFactory(Class, TypeAdapter)>
	//  169  452:putstatic       #325 <Field TypeAdapterFactory INET_ADDRESS_FACTORY>
		UUID = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method UUID read(JsonReader)>
			//    3    5:areturn         
			}

			public UUID read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return java.util.UUID.fromString(jsonreader.nextString());
			//    8   16:aload_1         
			//    9   17:invokevirtual   #39  <Method String JsonReader.nextString()>
			//   10   20:invokestatic    #45  <Method UUID UUID.fromString(String)>
			//   11   23:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (UUID)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #41  <Class UUID>
			//    4    6:invokevirtual   #50  <Method void write(JsonWriter, UUID)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, UUID uuid)
				throws IOException
			{
				if(uuid == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					uuid = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					uuid = ((UUID) (uuid.toString()));
			//    5    9:aload_2         
			//    6   10:invokevirtual   #53  <Method String UUID.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (uuid)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #59  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

		}
));
	//  170  455:new             #38  <Class TypeAdapters$24>
	//  171  458:dup             
	//  172  459:invokespecial   #326 <Method void TypeAdapters$24()>
	//  173  462:putstatic       #328 <Field TypeAdapter UUID>
		UUID_FACTORY = newFactory(java/util/UUID, UUID);
	//  174  465:ldc2            #330 <Class UUID>
	//  175  468:getstatic       #328 <Field TypeAdapter UUID>
	//  176  471:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  177  474:putstatic       #332 <Field TypeAdapterFactory UUID_FACTORY>
		CURRENCY = ((_cls25) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method Currency read(JsonReader)>
			//    3    5:areturn         
			}

			public Currency read(JsonReader jsonreader)
				throws IOException
			{
				return Currency.getInstance(jsonreader.nextString());
			//    0    0:aload_1         
			//    1    1:invokevirtual   #26  <Method String JsonReader.nextString()>
			//    2    4:invokestatic    #32  <Method Currency Currency.getInstance(String)>
			//    3    7:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Currency)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #28  <Class Currency>
			//    4    6:invokevirtual   #37  <Method void write(JsonWriter, Currency)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, Currency currency)
				throws IOException
			{
				jsonwriter.value(currency.getCurrencyCode());
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #40  <Method String Currency.getCurrencyCode()>
			//    3    5:invokevirtual   #46  <Method JsonWriter JsonWriter.value(String)>
			//    4    8:pop             
			//    5    9:return          
			}

		}
)).nullSafe();
	//  178  477:new             #40  <Class TypeAdapters$25>
	//  179  480:dup             
	//  180  481:invokespecial   #333 <Method void TypeAdapters$25()>
	//  181  484:invokevirtual   #334 <Method TypeAdapter TypeAdapters$25.nullSafe()>
	//  182  487:putstatic       #336 <Field TypeAdapter CURRENCY>
		CURRENCY_FACTORY = newFactory(java/util/Currency, CURRENCY);
	//  183  490:ldc2            #338 <Class Currency>
	//  184  493:getstatic       #336 <Field TypeAdapter CURRENCY>
	//  185  496:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  186  499:putstatic       #340 <Field TypeAdapterFactory CURRENCY_FACTORY>
	//  187  502:new             #42  <Class TypeAdapters$26>
	//  188  505:dup             
	//  189  506:invokespecial   #341 <Method void TypeAdapters$26()>
	//  190  509:putstatic       #343 <Field TypeAdapterFactory TIMESTAMP_FACTORY>
		CALENDAR = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #38  <Method Calendar read(JsonReader)>
			//    3    5:areturn         
			}

			public Calendar read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #51  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #54  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader.beginObject();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #57  <Method void JsonReader.beginObject()>
				int k1 = 0;
			//   10   20:iconst_0        
			//   11   21:istore          8
				int j1 = 0;
			//   12   23:iconst_0        
			//   13   24:istore          7
				int i1 = 0;
			//   14   26:iconst_0        
			//   15   27:istore          6
				int l = 0;
			//   16   29:iconst_0        
			//   17   30:istore          5
				int j = 0;
			//   18   32:iconst_0        
			//   19   33:istore_3        
				int k = 0;
			//   20   34:iconst_0        
			//   21   35:istore          4
				while(jsonreader.peek() != JsonToken.END_OBJECT) 
			//*  22   37:aload_1         
			//*  23   38:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
			//*  24   41:getstatic       #60  <Field JsonToken JsonToken.END_OBJECT>
			//*  25   44:if_acmpeq       287
				{
					String s = jsonreader.nextName();
			//   26   47:aload_1         
			//   27   48:invokevirtual   #64  <Method String JsonReader.nextName()>
			//   28   51:astore          14
					int i = jsonreader.nextInt();
			//   29   53:aload_1         
			//   30   54:invokevirtual   #68  <Method int JsonReader.nextInt()>
			//   31   57:istore_2        
					int l1;
					int i2;
					int j2;
					int k2;
					int l2;
					if("year".equals(((Object) (s))))
			//*  32   58:ldc1            #26  <String "year">
			//*  33   60:aload           14
			//*  34   62:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  35   65:ifeq            89
					{
						l1 = i;
			//   36   68:iload_2         
			//   37   69:istore          9
						i2 = j1;
			//   38   71:iload           7
			//   39   73:istore          10
						j2 = i1;
			//   40   75:iload           6
			//   41   77:istore          11
						k2 = l;
			//   42   79:iload           5
			//   43   81:istore          12
						l2 = j;
			//   44   83:iload_3         
			//   45   84:istore          13
					} else
			//*  46   86:goto            265
					if("month".equals(((Object) (s))))
			//*  47   89:ldc1            #20  <String "month">
			//*  48   91:aload           14
			//*  49   93:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  50   96:ifeq            120
					{
						l1 = k1;
			//   51   99:iload           8
			//   52  101:istore          9
						i2 = i;
			//   53  103:iload_2         
			//   54  104:istore          10
						j2 = i1;
			//   55  106:iload           6
			//   56  108:istore          11
						k2 = l;
			//   57  110:iload           5
			//   58  112:istore          12
						l2 = j;
			//   59  114:iload_3         
			//   60  115:istore          13
					} else
			//*  61  117:goto            265
					if("dayOfMonth".equals(((Object) (s))))
			//*  62  120:ldc1            #11  <String "dayOfMonth">
			//*  63  122:aload           14
			//*  64  124:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  65  127:ifeq            151
					{
						l1 = k1;
			//   66  130:iload           8
			//   67  132:istore          9
						i2 = j1;
			//   68  134:iload           7
			//   69  136:istore          10
						j2 = i;
			//   70  138:iload_2         
			//   71  139:istore          11
						k2 = l;
			//   72  141:iload           5
			//   73  143:istore          12
						l2 = j;
			//   74  145:iload_3         
			//   75  146:istore          13
					} else
			//*  76  148:goto            265
					if("hourOfDay".equals(((Object) (s))))
			//*  77  151:ldc1            #14  <String "hourOfDay">
			//*  78  153:aload           14
			//*  79  155:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  80  158:ifeq            182
					{
						l1 = k1;
			//   81  161:iload           8
			//   82  163:istore          9
						i2 = j1;
			//   83  165:iload           7
			//   84  167:istore          10
						j2 = i1;
			//   85  169:iload           6
			//   86  171:istore          11
						k2 = i;
			//   87  173:iload_2         
			//   88  174:istore          12
						l2 = j;
			//   89  176:iload_3         
			//   90  177:istore          13
					} else
			//*  91  179:goto            265
					if("minute".equals(((Object) (s))))
			//*  92  182:ldc1            #17  <String "minute">
			//*  93  184:aload           14
			//*  94  186:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  95  189:ifeq            214
					{
						l1 = k1;
			//   96  192:iload           8
			//   97  194:istore          9
						i2 = j1;
			//   98  196:iload           7
			//   99  198:istore          10
						j2 = i1;
			//  100  200:iload           6
			//  101  202:istore          11
						k2 = l;
			//  102  204:iload           5
			//  103  206:istore          12
						l2 = i;
			//  104  208:iload_2         
			//  105  209:istore          13
					} else
			//* 106  211:goto            265
					{
						l1 = k1;
			//  107  214:iload           8
			//  108  216:istore          9
						i2 = j1;
			//  109  218:iload           7
			//  110  220:istore          10
						j2 = i1;
			//  111  222:iload           6
			//  112  224:istore          11
						k2 = l;
			//  113  226:iload           5
			//  114  228:istore          12
						l2 = j;
			//  115  230:iload_3         
			//  116  231:istore          13
						if("second".equals(((Object) (s))))
			//* 117  233:ldc1            #23  <String "second">
			//* 118  235:aload           14
			//* 119  237:invokevirtual   #74  <Method boolean String.equals(Object)>
			//* 120  240:ifeq            265
						{
							k = i;
			//  121  243:iload_2         
			//  122  244:istore          4
							l2 = j;
			//  123  246:iload_3         
			//  124  247:istore          13
							k2 = l;
			//  125  249:iload           5
			//  126  251:istore          12
							j2 = i1;
			//  127  253:iload           6
			//  128  255:istore          11
							i2 = j1;
			//  129  257:iload           7
			//  130  259:istore          10
							l1 = k1;
			//  131  261:iload           8
			//  132  263:istore          9
						}
					}
					k1 = l1;
			//  133  265:iload           9
			//  134  267:istore          8
					j1 = i2;
			//  135  269:iload           10
			//  136  271:istore          7
					i1 = j2;
			//  137  273:iload           11
			//  138  275:istore          6
					l = k2;
			//  139  277:iload           12
			//  140  279:istore          5
					j = l2;
			//  141  281:iload           13
			//  142  283:istore_3        
				}
			//* 143  284:goto            37
				jsonreader.endObject();
			//  144  287:aload_1         
			//  145  288:invokevirtual   #77  <Method void JsonReader.endObject()>
				return ((Calendar) (new GregorianCalendar(k1, j1, i1, l, j, k)));
			//  146  291:new             #79  <Class GregorianCalendar>
			//  147  294:dup             
			//  148  295:iload           8
			//  149  297:iload           7
			//  150  299:iload           6
			//  151  301:iload           5
			//  152  303:iload_3         
			//  153  304:iload           4
			//  154  306:invokespecial   #82  <Method void GregorianCalendar(int, int, int, int, int, int)>
			//  155  309:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Calendar)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #86  <Class Calendar>
			//    4    6:invokevirtual   #89  <Method void write(JsonWriter, Calendar)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, Calendar calendar)
				throws IOException
			{
				if(calendar == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #95  <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				} else
				{
					jsonwriter.beginObject();
			//    6   10:aload_1         
			//    7   11:invokevirtual   #97  <Method JsonWriter JsonWriter.beginObject()>
			//    8   14:pop             
					jsonwriter.name("year");
			//    9   15:aload_1         
			//   10   16:ldc1            #26  <String "year">
			//   11   18:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
			//   12   21:pop             
					jsonwriter.value(calendar.get(1));
			//   13   22:aload_1         
			//   14   23:aload_2         
			//   15   24:iconst_1        
			//   16   25:invokevirtual   #105 <Method int Calendar.get(int)>
			//   17   28:i2l             
			//   18   29:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
			//   19   32:pop             
					jsonwriter.name("month");
			//   20   33:aload_1         
			//   21   34:ldc1            #20  <String "month">
			//   22   36:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
			//   23   39:pop             
					jsonwriter.value(calendar.get(2));
			//   24   40:aload_1         
			//   25   41:aload_2         
			//   26   42:iconst_2        
			//   27   43:invokevirtual   #105 <Method int Calendar.get(int)>
			//   28   46:i2l             
			//   29   47:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
			//   30   50:pop             
					jsonwriter.name("dayOfMonth");
			//   31   51:aload_1         
			//   32   52:ldc1            #11  <String "dayOfMonth">
			//   33   54:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
			//   34   57:pop             
					jsonwriter.value(calendar.get(5));
			//   35   58:aload_1         
			//   36   59:aload_2         
			//   37   60:iconst_5        
			//   38   61:invokevirtual   #105 <Method int Calendar.get(int)>
			//   39   64:i2l             
			//   40   65:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
			//   41   68:pop             
					jsonwriter.name("hourOfDay");
			//   42   69:aload_1         
			//   43   70:ldc1            #14  <String "hourOfDay">
			//   44   72:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
			//   45   75:pop             
					jsonwriter.value(calendar.get(11));
			//   46   76:aload_1         
			//   47   77:aload_2         
			//   48   78:bipush          11
			//   49   80:invokevirtual   #105 <Method int Calendar.get(int)>
			//   50   83:i2l             
			//   51   84:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
			//   52   87:pop             
					jsonwriter.name("minute");
			//   53   88:aload_1         
			//   54   89:ldc1            #17  <String "minute">
			//   55   91:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
			//   56   94:pop             
					jsonwriter.value(calendar.get(12));
			//   57   95:aload_1         
			//   58   96:aload_2         
			//   59   97:bipush          12
			//   60   99:invokevirtual   #105 <Method int Calendar.get(int)>
			//   61  102:i2l             
			//   62  103:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
			//   63  106:pop             
					jsonwriter.name("second");
			//   64  107:aload_1         
			//   65  108:ldc1            #23  <String "second">
			//   66  110:invokevirtual   #101 <Method JsonWriter JsonWriter.name(String)>
			//   67  113:pop             
					jsonwriter.value(calendar.get(13));
			//   68  114:aload_1         
			//   69  115:aload_2         
			//   70  116:bipush          13
			//   71  118:invokevirtual   #105 <Method int Calendar.get(int)>
			//   72  121:i2l             
			//   73  122:invokevirtual   #109 <Method JsonWriter JsonWriter.value(long)>
			//   74  125:pop             
					jsonwriter.endObject();
			//   75  126:aload_1         
			//   76  127:invokevirtual   #111 <Method JsonWriter JsonWriter.endObject()>
			//   77  130:pop             
					return;
			//   78  131:return          
				}
			}

			private static final String DAY_OF_MONTH = "dayOfMonth";
			private static final String HOUR_OF_DAY = "hourOfDay";
			private static final String MINUTE = "minute";
			private static final String MONTH = "month";
			private static final String SECOND = "second";
			private static final String YEAR = "year";

		}
));
	//  191  512:new             #46  <Class TypeAdapters$27>
	//  192  515:dup             
	//  193  516:invokespecial   #344 <Method void TypeAdapters$27()>
	//  194  519:putstatic       #346 <Field TypeAdapter CALENDAR>
		CALENDAR_FACTORY = newFactoryForMultipleTypes(java/util/Calendar, java/util/GregorianCalendar, CALENDAR);
	//  195  522:ldc2            #348 <Class Calendar>
	//  196  525:ldc2            #350 <Class GregorianCalendar>
	//  197  528:getstatic       #346 <Field TypeAdapter CALENDAR>
	//  198  531:invokestatic    #353 <Method TypeAdapterFactory newFactoryForMultipleTypes(Class, Class, TypeAdapter)>
	//  199  534:putstatic       #355 <Field TypeAdapterFactory CALENDAR_FACTORY>
		LOCALE = ((TypeAdapter) (new TypeAdapter() {

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #19  <Method Locale read(JsonReader)>
			//    3    5:areturn         
			}

			public Locale read(JsonReader jsonreader)
				throws IOException
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #32  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #35  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				StringTokenizer stringtokenizer = new StringTokenizer(jsonreader.nextString(), "_");
			//    8   16:new             #37  <Class StringTokenizer>
			//    9   19:dup             
			//   10   20:aload_1         
			//   11   21:invokevirtual   #41  <Method String JsonReader.nextString()>
			//   12   24:ldc1            #43  <String "_">
			//   13   26:invokespecial   #46  <Method void StringTokenizer(String, String)>
			//   14   29:astore          4
				jsonreader = null;
			//   15   31:aconst_null     
			//   16   32:astore_1        
				String s = null;
			//   17   33:aconst_null     
			//   18   34:astore_2        
				String s1 = null;
			//   19   35:aconst_null     
			//   20   36:astore_3        
				if(stringtokenizer.hasMoreElements())
			//*  21   37:aload           4
			//*  22   39:invokevirtual   #50  <Method boolean StringTokenizer.hasMoreElements()>
			//*  23   42:ifeq            51
					jsonreader = ((JsonReader) (stringtokenizer.nextToken()));
			//   24   45:aload           4
			//   25   47:invokevirtual   #53  <Method String StringTokenizer.nextToken()>
			//   26   50:astore_1        
				if(stringtokenizer.hasMoreElements())
			//*  27   51:aload           4
			//*  28   53:invokevirtual   #50  <Method boolean StringTokenizer.hasMoreElements()>
			//*  29   56:ifeq            65
					s = stringtokenizer.nextToken();
			//   30   59:aload           4
			//   31   61:invokevirtual   #53  <Method String StringTokenizer.nextToken()>
			//   32   64:astore_2        
				if(stringtokenizer.hasMoreElements())
			//*  33   65:aload           4
			//*  34   67:invokevirtual   #50  <Method boolean StringTokenizer.hasMoreElements()>
			//*  35   70:ifeq            79
					s1 = stringtokenizer.nextToken();
			//   36   73:aload           4
			//   37   75:invokevirtual   #53  <Method String StringTokenizer.nextToken()>
			//   38   78:astore_3        
				if(s == null && s1 == null)
			//*  39   79:aload_2         
			//*  40   80:ifnonnull       96
			//*  41   83:aload_3         
			//*  42   84:ifnonnull       96
					return new Locale(((String) (jsonreader)));
			//   43   87:new             #55  <Class Locale>
			//   44   90:dup             
			//   45   91:aload_1         
			//   46   92:invokespecial   #58  <Method void Locale(String)>
			//   47   95:areturn         
				if(s1 == null)
			//*  48   96:aload_3         
			//*  49   97:ifnonnull       110
					return new Locale(((String) (jsonreader)), s);
			//   50  100:new             #55  <Class Locale>
			//   51  103:dup             
			//   52  104:aload_1         
			//   53  105:aload_2         
			//   54  106:invokespecial   #59  <Method void Locale(String, String)>
			//   55  109:areturn         
				else
					return new Locale(((String) (jsonreader)), s, s1);
			//   56  110:new             #55  <Class Locale>
			//   57  113:dup             
			//   58  114:aload_1         
			//   59  115:aload_2         
			//   60  116:aload_3         
			//   61  117:invokespecial   #62  <Method void Locale(String, String, String)>
			//   62  120:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Locale)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #55  <Class Locale>
			//    4    6:invokevirtual   #67  <Method void write(JsonWriter, Locale)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, Locale locale)
				throws IOException
			{
				if(locale == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       9
					locale = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:goto            14
					locale = ((Locale) (locale.toString()));
			//    5    9:aload_2         
			//    6   10:invokevirtual   #70  <Method String Locale.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (locale)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #76  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

		}
));
	//  200  537:new             #48  <Class TypeAdapters$28>
	//  201  540:dup             
	//  202  541:invokespecial   #356 <Method void TypeAdapters$28()>
	//  203  544:putstatic       #358 <Field TypeAdapter LOCALE>
		LOCALE_FACTORY = newFactory(java/util/Locale, LOCALE);
	//  204  547:ldc2            #360 <Class Locale>
	//  205  550:getstatic       #358 <Field TypeAdapter LOCALE>
	//  206  553:invokestatic    #175 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  207  556:putstatic       #362 <Field TypeAdapterFactory LOCALE_FACTORY>
		JSON_ELEMENT = ((TypeAdapter) (new TypeAdapter() {

			public JsonElement read(JsonReader jsonreader)
				throws IOException
			{
				switch(_cls36..SwitchMap.com.google.gson.stream.JsonToken[jsonreader.peek().ordinal()])
			//*   0    0:getstatic       #22  <Field int[] TypeAdapters$36.$SwitchMap$com$google$gson$stream$JsonToken>
			//*   1    3:aload_1         
			//*   2    4:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
			//*   3    7:invokevirtual   #34  <Method int JsonToken.ordinal()>
			//*   4   10:iaload          
				{
			//*   5   11:tableswitch     1 10: default 64
			//			               1 79
			//			               2 98
			//			               3 67
			//			               4 113
			//			               5 121
			//			               6 158
			//			               7 199
			//			               8 199
			//			               9 199
			//			               10 199
			//*   6   64:goto            199
				case 3: // '\003'
					return ((JsonElement) (new JsonPrimitive(jsonreader.nextString())));
			//    7   67:new             #36  <Class JsonPrimitive>
			//    8   70:dup             
			//    9   71:aload_1         
			//   10   72:invokevirtual   #40  <Method String JsonReader.nextString()>
			//   11   75:invokespecial   #43  <Method void JsonPrimitive(String)>
			//   12   78:areturn         

				case 1: // '\001'
					return ((JsonElement) (new JsonPrimitive(((Number) (new LazilyParsedNumber(jsonreader.nextString()))))));
			//   13   79:new             #36  <Class JsonPrimitive>
			//   14   82:dup             
			//   15   83:new             #45  <Class LazilyParsedNumber>
			//   16   86:dup             
			//   17   87:aload_1         
			//   18   88:invokevirtual   #40  <Method String JsonReader.nextString()>
			//   19   91:invokespecial   #46  <Method void LazilyParsedNumber(String)>
			//   20   94:invokespecial   #49  <Method void JsonPrimitive(Number)>
			//   21   97:areturn         

				case 2: // '\002'
					return ((JsonElement) (new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()))));
			//   22   98:new             #36  <Class JsonPrimitive>
			//   23  101:dup             
			//   24  102:aload_1         
			//   25  103:invokevirtual   #53  <Method boolean JsonReader.nextBoolean()>
			//   26  106:invokestatic    #59  <Method Boolean Boolean.valueOf(boolean)>
			//   27  109:invokespecial   #62  <Method void JsonPrimitive(Boolean)>
			//   28  112:areturn         

				case 4: // '\004'
					jsonreader.nextNull();
			//   29  113:aload_1         
			//   30  114:invokevirtual   #65  <Method void JsonReader.nextNull()>
					return ((JsonElement) (JsonNull.INSTANCE));
			//   31  117:getstatic       #71  <Field JsonNull JsonNull.INSTANCE>
			//   32  120:areturn         

				case 5: // '\005'
					JsonArray jsonarray = new JsonArray();
			//   33  121:new             #73  <Class JsonArray>
			//   34  124:dup             
			//   35  125:invokespecial   #74  <Method void JsonArray()>
			//   36  128:astore_2        
					jsonreader.beginArray();
			//   37  129:aload_1         
			//   38  130:invokevirtual   #77  <Method void JsonReader.beginArray()>
					for(; jsonreader.hasNext(); jsonarray.add(read(jsonreader)));
			//   39  133:aload_1         
			//   40  134:invokevirtual   #80  <Method boolean JsonReader.hasNext()>
			//   41  137:ifeq            152
			//   42  140:aload_2         
			//   43  141:aload_0         
			//   44  142:aload_1         
			//   45  143:invokevirtual   #82  <Method JsonElement read(JsonReader)>
			//   46  146:invokevirtual   #86  <Method void JsonArray.add(JsonElement)>
			//*  47  149:goto            133
					jsonreader.endArray();
			//   48  152:aload_1         
			//   49  153:invokevirtual   #89  <Method void JsonReader.endArray()>
					return ((JsonElement) (jsonarray));
			//   50  156:aload_2         
			//   51  157:areturn         

				case 6: // '\006'
					JsonObject jsonobject = new JsonObject();
			//   52  158:new             #91  <Class JsonObject>
			//   53  161:dup             
			//   54  162:invokespecial   #92  <Method void JsonObject()>
			//   55  165:astore_2        
					jsonreader.beginObject();
			//   56  166:aload_1         
			//   57  167:invokevirtual   #95  <Method void JsonReader.beginObject()>
					for(; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), read(jsonreader)));
			//   58  170:aload_1         
			//   59  171:invokevirtual   #80  <Method boolean JsonReader.hasNext()>
			//   60  174:ifeq            193
			//   61  177:aload_2         
			//   62  178:aload_1         
			//   63  179:invokevirtual   #98  <Method String JsonReader.nextName()>
			//   64  182:aload_0         
			//   65  183:aload_1         
			//   66  184:invokevirtual   #82  <Method JsonElement read(JsonReader)>
			//   67  187:invokevirtual   #101 <Method void JsonObject.add(String, JsonElement)>
			//*  68  190:goto            170
					jsonreader.endObject();
			//   69  193:aload_1         
			//   70  194:invokevirtual   #104 <Method void JsonReader.endObject()>
					return ((JsonElement) (jsonobject));
			//   71  197:aload_2         
			//   72  198:areturn         
				}
				throw new IllegalArgumentException();
			//   73  199:new             #106 <Class IllegalArgumentException>
			//   74  202:dup             
			//   75  203:invokespecial   #107 <Method void IllegalArgumentException()>
			//   76  206:athrow          
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #82  <Method JsonElement read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, JsonElement jsonelement)
				throws IOException
			{
				if(jsonelement == null || jsonelement.isJsonNull())
			//*   0    0:aload_2         
			//*   1    1:ifnull          11
			//*   2    4:aload_2         
			//*   3    5:invokevirtual   #116 <Method boolean JsonElement.isJsonNull()>
			//*   4    8:ifeq            17
				{
					jsonwriter.nullValue();
			//    5   11:aload_1         
			//    6   12:invokevirtual   #122 <Method JsonWriter JsonWriter.nullValue()>
			//    7   15:pop             
					return;
			//    8   16:return          
				}
				if(jsonelement.isJsonPrimitive())
			//*   9   17:aload_2         
			//*  10   18:invokevirtual   #125 <Method boolean JsonElement.isJsonPrimitive()>
			//*  11   21:ifeq            77
				{
					jsonelement = ((JsonElement) (jsonelement.getAsJsonPrimitive()));
			//   12   24:aload_2         
			//   13   25:invokevirtual   #129 <Method JsonPrimitive JsonElement.getAsJsonPrimitive()>
			//   14   28:astore_2        
					if(((JsonPrimitive) (jsonelement)).isNumber())
			//*  15   29:aload_2         
			//*  16   30:invokevirtual   #132 <Method boolean JsonPrimitive.isNumber()>
			//*  17   33:ifeq            48
						jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsNumber());
			//   18   36:aload_1         
			//   19   37:aload_2         
			//   20   38:invokevirtual   #136 <Method Number JsonPrimitive.getAsNumber()>
			//   21   41:invokevirtual   #140 <Method JsonWriter JsonWriter.value(Number)>
			//   22   44:pop             
					else
			//*  23   45:goto            76
					if(((JsonPrimitive) (jsonelement)).isBoolean())
			//*  24   48:aload_2         
			//*  25   49:invokevirtual   #143 <Method boolean JsonPrimitive.isBoolean()>
			//*  26   52:ifeq            67
						jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsBoolean());
			//   27   55:aload_1         
			//   28   56:aload_2         
			//   29   57:invokevirtual   #146 <Method boolean JsonPrimitive.getAsBoolean()>
			//   30   60:invokevirtual   #149 <Method JsonWriter JsonWriter.value(boolean)>
			//   31   63:pop             
					else
			//*  32   64:goto            76
						jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsString());
			//   33   67:aload_1         
			//   34   68:aload_2         
			//   35   69:invokevirtual   #152 <Method String JsonPrimitive.getAsString()>
			//   36   72:invokevirtual   #155 <Method JsonWriter JsonWriter.value(String)>
			//   37   75:pop             
					return;
			//   38   76:return          
				}
				if(jsonelement.isJsonArray())
			//*  39   77:aload_2         
			//*  40   78:invokevirtual   #158 <Method boolean JsonElement.isJsonArray()>
			//*  41   81:ifeq            129
				{
					jsonwriter.beginArray();
			//   42   84:aload_1         
			//   43   85:invokevirtual   #160 <Method JsonWriter JsonWriter.beginArray()>
			//   44   88:pop             
					for(jsonelement = ((JsonElement) (jsonelement.getAsJsonArray().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)((Iterator) (jsonelement)).next()));
			//   45   89:aload_2         
			//   46   90:invokevirtual   #164 <Method JsonArray JsonElement.getAsJsonArray()>
			//   47   93:invokevirtual   #168 <Method Iterator JsonArray.iterator()>
			//   48   96:astore_2        
			//   49   97:aload_2         
			//   50   98:invokeinterface #171 <Method boolean Iterator.hasNext()>
			//   51  103:ifeq            123
			//   52  106:aload_0         
			//   53  107:aload_1         
			//   54  108:aload_2         
			//   55  109:invokeinterface #175 <Method Object Iterator.next()>
			//   56  114:checkcast       #113 <Class JsonElement>
			//   57  117:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
			//*  58  120:goto            97
					jsonwriter.endArray();
			//   59  123:aload_1         
			//   60  124:invokevirtual   #179 <Method JsonWriter JsonWriter.endArray()>
			//   61  127:pop             
					return;
			//   62  128:return          
				}
				if(jsonelement.isJsonObject())
			//*  63  129:aload_2         
			//*  64  130:invokevirtual   #182 <Method boolean JsonElement.isJsonObject()>
			//*  65  133:ifeq            210
				{
					jsonwriter.beginObject();
			//   66  136:aload_1         
			//   67  137:invokevirtual   #184 <Method JsonWriter JsonWriter.beginObject()>
			//   68  140:pop             
					java.util.Map.Entry entry;
					for(jsonelement = ((JsonElement) (jsonelement.getAsJsonObject().entrySet().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)entry.getValue()))
			//*  69  141:aload_2         
			//*  70  142:invokevirtual   #188 <Method JsonObject JsonElement.getAsJsonObject()>
			//*  71  145:invokevirtual   #192 <Method Set JsonObject.entrySet()>
			//*  72  148:invokeinterface #195 <Method Iterator Set.iterator()>
			//*  73  153:astore_2        
			//*  74  154:aload_2         
			//*  75  155:invokeinterface #171 <Method boolean Iterator.hasNext()>
			//*  76  160:ifeq            204
					{
						entry = (java.util.Map.Entry)((Iterator) (jsonelement)).next();
			//   77  163:aload_2         
			//   78  164:invokeinterface #175 <Method Object Iterator.next()>
			//   79  169:checkcast       #197 <Class java.util.Map$Entry>
			//   80  172:astore_3        
						jsonwriter.name((String)entry.getKey());
			//   81  173:aload_1         
			//   82  174:aload_3         
			//   83  175:invokeinterface #200 <Method Object java.util.Map$Entry.getKey()>
			//   84  180:checkcast       #202 <Class String>
			//   85  183:invokevirtual   #205 <Method JsonWriter JsonWriter.name(String)>
			//   86  186:pop             
					}

			//   87  187:aload_0         
			//   88  188:aload_1         
			//   89  189:aload_3         
			//   90  190:invokeinterface #208 <Method Object java.util.Map$Entry.getValue()>
			//   91  195:checkcast       #113 <Class JsonElement>
			//   92  198:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
			//*  93  201:goto            154
					jsonwriter.endObject();
			//   94  204:aload_1         
			//   95  205:invokevirtual   #210 <Method JsonWriter JsonWriter.endObject()>
			//   96  208:pop             
					return;
			//   97  209:return          
				} else
				{
					throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(((Object) (((Object) (jsonelement)).getClass()))).toString());
			//   98  210:new             #106 <Class IllegalArgumentException>
			//   99  213:dup             
			//  100  214:new             #212 <Class StringBuilder>
			//  101  217:dup             
			//  102  218:invokespecial   #213 <Method void StringBuilder()>
			//  103  221:ldc1            #215 <String "Couldn't write ">
			//  104  223:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
			//  105  226:aload_2         
			//  106  227:invokevirtual   #225 <Method Class Object.getClass()>
			//  107  230:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
			//  108  233:invokevirtual   #231 <Method String StringBuilder.toString()>
			//  109  236:invokespecial   #232 <Method void IllegalArgumentException(String)>
			//  110  239:athrow          
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (JsonElement)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #113 <Class JsonElement>
			//    4    6:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
			//    5    9:return          
			}

		}
));
	//  208  559:new             #50  <Class TypeAdapters$29>
	//  209  562:dup             
	//  210  563:invokespecial   #363 <Method void TypeAdapters$29()>
	//  211  566:putstatic       #365 <Field TypeAdapter JSON_ELEMENT>
		JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com/google/gson/JsonElement, JSON_ELEMENT);
	//  212  569:ldc2            #367 <Class JsonElement>
	//  213  572:getstatic       #365 <Field TypeAdapter JSON_ELEMENT>
	//  214  575:invokestatic    #323 <Method TypeAdapterFactory newTypeHierarchyFactory(Class, TypeAdapter)>
	//  215  578:putstatic       #369 <Field TypeAdapterFactory JSON_ELEMENT_FACTORY>
	//  216  581:new             #54  <Class TypeAdapters$30>
	//  217  584:dup             
	//  218  585:invokespecial   #370 <Method void TypeAdapters$30()>
	//  219  588:putstatic       #372 <Field TypeAdapterFactory ENUM_FACTORY>
	//* 220  591:return          
	}
}
