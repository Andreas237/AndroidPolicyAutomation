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

public final class TypeAdapters
{
	private static final class EnumTypeAdapter extends TypeAdapter
	{

		public Enum read(JsonReader jsonreader)
			throws IOException
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #82  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #88  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #91  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return (Enum)nameToConstant.get(((Object) (jsonreader.nextString())));
		//    8   16:aload_0         
		//    9   17:getfield        #25  <Field Map nameToConstant>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #94  <Method String JsonReader.nextString()>
		//   12   24:invokeinterface #98  <Method Object Map.get(Object)>
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
		//    2    2:invokevirtual   #103 <Method Enum read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Enum enum)
			throws IOException
		{
			if(enum == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       13
				enum = null;
		//    2    4:aconst_null     
		//    3    5:astore_2        
			else
		//*   4    6:aload_1         
		//*   5    7:aload_2         
		//*   6    8:invokevirtual   #110 <Method JsonWriter JsonWriter.value(String)>
		//*   7   11:pop             
		//*   8   12:return          
				enum = ((Enum) ((String)constantToName.get(((Object) (enum)))));
		//    9   13:aload_0         
		//   10   14:getfield        #27  <Field Map constantToName>
		//   11   17:aload_2         
		//   12   18:invokeinterface #98  <Method Object Map.get(Object)>
		//   13   23:checkcast       #112 <Class String>
		//   14   26:astore_2        
			jsonwriter.value(((String) (enum)));
		//*  15   27:goto            6
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Enum)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #37  <Class Enum>
		//    4    6:invokevirtual   #116 <Method void write(JsonWriter, Enum)>
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
		//*  23   45:icmpge          188
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
			// Misplaced declaration of an exception variable
			catch(Class class1)
		//*  88  179:astore_1        
			{
				throw new AssertionError();
		//   89  180:new             #68  <Class AssertionError>
		//   90  183:dup             
		//   91  184:invokespecial   #69  <Method void AssertionError()>
		//   92  187:athrow          
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
		//   93  188:return          
		}
	}


	private TypeAdapters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #315 <Method void Object()>
		throw new UnsupportedOperationException();
	//    2    4:new             #317 <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:invokespecial   #318 <Method void UnsupportedOperationException()>
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
	//    0    0:new             #46  <Class TypeAdapters$27>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #322 <Method void TypeAdapters$27(TypeToken, TypeAdapter)>
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
	//    0    0:new             #48  <Class TypeAdapters$28>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #327 <Method void TypeAdapters$28(Class, TypeAdapter)>
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
	//    0    0:new             #50  <Class TypeAdapters$29>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #331 <Method void TypeAdapters$29(Class, Class, TypeAdapter)>
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
	//    0    0:new             #54  <Class TypeAdapters$30>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #333 <Method void TypeAdapters$30(Class, Class, TypeAdapter)>
	//    6   10:areturn         
	}

	public static TypeAdapterFactory newTypeHierarchyFactory(Class class1, TypeAdapter typeadapter)
	{
		return new TypeAdapterFactory(class1, typeadapter) {

			public TypeAdapter create(Gson gson, TypeToken typetoken)
			{
				if(clazz.isAssignableFrom(typetoken.getRawType()))
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field Class val$clazz>
			//*   2    4:aload_2         
			//*   3    5:invokevirtual   #33  <Method Class TypeToken.getRawType()>
			//*   4    8:invokevirtual   #39  <Method boolean Class.isAssignableFrom(Class)>
			//*   5   11:ifeq            19
					return typeAdapter;
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
				return (new StringBuilder()).append("Factory[typeHierarchy=").append(clazz.getName()).append(",adapter=").append(((Object) (typeAdapter))).append("]").toString();
			//    0    0:new             #45  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #46  <Method void StringBuilder()>
			//    3    7:ldc1            #48  <String "Factory[typeHierarchy=">
			//    4    9:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
			//    5   12:aload_0         
			//    6   13:getfield        #19  <Field Class val$clazz>
			//    7   16:invokevirtual   #55  <Method String Class.getName()>
			//    8   19:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
			//    9   22:ldc1            #57  <String ",adapter=">
			//   10   24:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
			//   11   27:aload_0         
			//   12   28:getfield        #21  <Field TypeAdapter val$typeAdapter>
			//   13   31:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
			//   14   34:ldc1            #62  <String "]">
			//   15   36:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
			//   16   39:invokevirtual   #64  <Method String StringBuilder.toString()>
			//   17   42:areturn         
			}

			final Class val$clazz;
			final TypeAdapter val$typeAdapter;

			
			{
				clazz = class1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field Class val$clazz>
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
	//    4    6:invokespecial   #335 <Method void TypeAdapters$31(Class, TypeAdapter)>
	//    5    9:areturn         
	}

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
		//*   1    1:ifnonnull       14
				boolean1 = "null";
		//    2    4:ldc1            #49  <String "null">
		//    3    6:astore_2        
			else
		//*   4    7:aload_1         
		//*   5    8:aload_2         
		//*   6    9:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
		//*   7   12:pop             
		//*   8   13:return          
				boolean1 = ((Boolean) (boolean1.toString()));
		//    9   14:aload_2         
		//   10   15:invokevirtual   #58  <Method String Boolean.toString()>
		//   11   18:astore_2        
			jsonwriter.value(((String) (boolean1)));
		//*  12   19:goto            7
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

					final _cls22 this$0;
					final TypeAdapter val$dateTypeAdapter;

			
			{
				this$0 = final__pcls22;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field TypeAdapters$22 this$0>
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
		//    6   11:new             #10  <Class TypeAdapters$22$1>
		//    7   14:dup             
		//    8   15:aload_0         
		//    9   16:aload_1         
		//   10   17:ldc1            #27  <Class Date>
		//   11   19:invokevirtual   #33  <Method TypeAdapter Gson.getAdapter(Class)>
		//   12   22:invokespecial   #36  <Method void TypeAdapters$22$1(TypeAdapters$22, TypeAdapter)>
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
		CLASS = ((TypeAdapter) (new TypeAdapter() {

			public Class read(JsonReader jsonreader)
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
					throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
			//    8   16:new             #33  <Class UnsupportedOperationException>
			//    9   19:dup             
			//   10   20:ldc1            #35  <String "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?">
			//   11   22:invokespecial   #38  <Method void UnsupportedOperationException(String)>
			//   12   25:athrow          
				}
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #42  <Method Class read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Class class1)
				throws IOException
			{
				if(class1 == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #50  <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				} else
				{
					throw new UnsupportedOperationException((new StringBuilder()).append("Attempted to serialize java.lang.Class: ").append(class1.getName()).append(". Forgot to register a type adapter?").toString());
			//    6   10:new             #33  <Class UnsupportedOperationException>
			//    7   13:dup             
			//    8   14:new             #52  <Class StringBuilder>
			//    9   17:dup             
			//   10   18:invokespecial   #53  <Method void StringBuilder()>
			//   11   21:ldc1            #55  <String "Attempted to serialize java.lang.Class: ">
			//   12   23:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   13   26:aload_2         
			//   14   27:invokevirtual   #65  <Method String Class.getName()>
			//   15   30:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   16   33:ldc1            #67  <String ". Forgot to register a type adapter?">
			//   17   35:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   18   38:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   19   41:invokespecial   #38  <Method void UnsupportedOperationException(String)>
			//   20   44:athrow          
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Class)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #61  <Class Class>
			//    4    6:invokevirtual   #73  <Method void write(JsonWriter, Class)>
			//    5    9:return          
			}

		}
));
	//    0    0:new             #6   <Class TypeAdapters$1>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void TypeAdapters$1()>
	//    3    7:putstatic       #143 <Field TypeAdapter CLASS>
		CLASS_FACTORY = newFactory(java/lang/Class, CLASS);
	//    4   10:ldc1            #145 <Class Class>
	//    5   12:getstatic       #143 <Field TypeAdapter CLASS>
	//    6   15:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//    7   18:putstatic       #151 <Field TypeAdapterFactory CLASS_FACTORY>
		BIT_SET = ((TypeAdapter) (new TypeAdapter() {

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
				int i;
				JsonToken jsontoken;
				BitSet bitset;
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
				bitset = new BitSet();
			//    8   16:new             #39  <Class BitSet>
			//    9   19:dup             
			//   10   20:invokespecial   #40  <Method void BitSet()>
			//   11   23:astore          6
				jsonreader.beginArray();
			//   12   25:aload_1         
			//   13   26:invokevirtual   #43  <Method void JsonReader.beginArray()>
				i = 0;
			//   14   29:iconst_0        
			//   15   30:istore_2        
				jsontoken = jsonreader.peek();
			//   16   31:aload_1         
			//   17   32:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
			//   18   35:astore          5
_L2:
				boolean flag;
				if(jsontoken == JsonToken.END_ARRAY)
					break MISSING_BLOCK_LABEL_214;
			//   19   37:aload           5
			//   20   39:getstatic       #46  <Field JsonToken JsonToken.END_ARRAY>
			//   21   42:if_acmpeq       214
				static class _cls32
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
					//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  10   23:getstatic       #31  <Field JsonToken JsonToken.BOOLEAN>
					//*  11   26:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  15   34:getstatic       #34  <Field JsonToken JsonToken.STRING>
					//*  16   37:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  20   45:getstatic       #37  <Field JsonToken JsonToken.NULL>
					//*  21   48:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  25   56:getstatic       #40  <Field JsonToken JsonToken.BEGIN_ARRAY>
					//*  26   59:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  27   62:iconst_5        
					//*  28   63:iastore         
					//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  30   67:getstatic       #43  <Field JsonToken JsonToken.BEGIN_OBJECT>
					//*  31   70:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  32   73:bipush          6
					//*  33   75:iastore         
					//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  35   79:getstatic       #46  <Field JsonToken JsonToken.END_DOCUMENT>
					//*  36   82:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  37   85:bipush          7
					//*  38   87:iastore         
					//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  40   91:getstatic       #49  <Field JsonToken JsonToken.NAME>
					//*  41   94:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  42   97:bipush          8
					//*  43   99:iastore         
					//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  45  103:getstatic       #52  <Field JsonToken JsonToken.END_OBJECT>
					//*  46  106:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  47  109:bipush          9
					//*  48  111:iastore         
					//*  49  112:getstatic       #20  <Field int[] $SwitchMap$com$google$gson$stream$JsonToken>
					//*  50  115:getstatic       #55  <Field JsonToken JsonToken.END_ARRAY>
					//*  51  118:invokevirtual   #28  <Method int JsonToken.ordinal()>
					//*  52  121:bipush          10
					//*  53  123:iastore         
					//*  54  124:return          
					//*  55  125:astore_0        
					//*  56  126:return          
					//*  57  127:astore_0        
					//*  58  128:goto            112
					//*  59  131:astore_0        
					//*  60  132:goto            100
					//*  61  135:astore_0        
					//*  62  136:goto            88
					//*  63  139:astore_0        
					//*  64  140:goto            76
					//*  65  143:astore_0        
					//*  66  144:goto            64
					//*  67  147:astore_0        
					//*  68  148:goto            53
					//*  69  151:astore_0        
					//*  70  152:goto            42
					//*  71  155:astore_0        
					//*  72  156:goto            31
						catch(NoSuchFieldError nosuchfielderror9) { }
					//   73  159:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
						}
						catch(NoSuchFieldError nosuchfielderror8) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
						}
						catch(NoSuchFieldError nosuchfielderror7) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
						}
						catch(NoSuchFieldError nosuchfielderror6) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
						}
						catch(NoSuchFieldError nosuchfielderror5) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
						}
						catch(NoSuchFieldError nosuchfielderror4) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
						}
						catch(NoSuchFieldError nosuchfielderror3) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
						}
						catch(NoSuchFieldError nosuchfielderror2) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
						}
						catch(NoSuchFieldError nosuchfielderror1) { }
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
						}
						catch(NoSuchFieldError nosuchfielderror)
						{
							return;
						}
					//*  74  160:goto            20
					}
				}

				switch(_cls32..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
			//*  22   45:getstatic       #52  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
			//*  23   48:aload           5
			//*  24   50:invokevirtual   #56  <Method int JsonToken.ordinal()>
			//*  25   53:iaload          
				{
			//*  26   54:tableswitch     1 3: default 80
			//			               1 108
			//			               2 148
			//			               3 157
				default:
					throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(((Object) (jsontoken))).toString());
			//   27   80:new             #58  <Class JsonSyntaxException>
			//   28   83:dup             
			//   29   84:new             #60  <Class StringBuilder>
			//   30   87:dup             
			//   31   88:invokespecial   #61  <Method void StringBuilder()>
			//   32   91:ldc1            #63  <String "Invalid bitset value type: ">
			//   33   93:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
			//   34   96:aload           5
			//   35   98:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
			//   36  101:invokevirtual   #74  <Method String StringBuilder.toString()>
			//   37  104:invokespecial   #77  <Method void JsonSyntaxException(String)>
			//   38  107:athrow          

				case 2: // '\002'
					break; /* Loop/switch isn't completed */

				case 3: // '\003'
					break MISSING_BLOCK_LABEL_157;

				case 1: // '\001'
					if(jsonreader.nextInt() != 0)
			//*  39  108:aload_1         
			//*  40  109:invokevirtual   #80  <Method int JsonReader.nextInt()>
			//*  41  112:ifeq            142
						flag = true;
			//   42  115:iconst_1        
			//   43  116:istore          4
					else
			//*  44  118:iload           4
			//*  45  120:ifeq            129
			//*  46  123:aload           6
			//*  47  125:iload_2         
			//*  48  126:invokevirtual   #84  <Method void BitSet.set(int)>
			//*  49  129:iload_2         
			//*  50  130:iconst_1        
			//*  51  131:iadd            
			//*  52  132:istore_2        
			//*  53  133:aload_1         
			//*  54  134:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
			//*  55  137:astore          5
			//*  56  139:goto            37
						flag = false;
			//   57  142:iconst_0        
			//   58  143:istore          4
					break;
				}
_L3:
				if(flag)
					bitset.set(i);
				i++;
				jsontoken = jsonreader.peek();
				if(true) goto _L2; else goto _L1
			//*  59  145:goto            118
_L1:
				flag = jsonreader.nextBoolean();
			//   60  148:aload_1         
			//   61  149:invokevirtual   #88  <Method boolean JsonReader.nextBoolean()>
			//   62  152:istore          4
				  goto _L3
			//*  63  154:goto            118
				String s = jsonreader.nextString();
			//   64  157:aload_1         
			//   65  158:invokevirtual   #91  <Method String JsonReader.nextString()>
			//   66  161:astore          5
				int j;
				try
				{
					j = Integer.parseInt(s);
			//   67  163:aload           5
			//   68  165:invokestatic    #97  <Method int Integer.parseInt(String)>
			//   69  168:istore_3        
				}
			//*  70  169:iload_3         
			//*  71  170:ifeq            179
			//*  72  173:iconst_1        
			//*  73  174:istore          4
			//*  74  176:goto            118
			//*  75  179:iconst_0        
			//*  76  180:istore          4
			//*  77  182:goto            176
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  78  185:astore_1        
				{
					throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(s).toString());
			//   79  186:new             #58  <Class JsonSyntaxException>
			//   80  189:dup             
			//   81  190:new             #60  <Class StringBuilder>
			//   82  193:dup             
			//   83  194:invokespecial   #61  <Method void StringBuilder()>
			//   84  197:ldc1            #99  <String "Error: Expecting: bitset number value (1, 0), Found: ">
			//   85  199:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
			//   86  202:aload           5
			//   87  204:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
			//   88  207:invokevirtual   #74  <Method String StringBuilder.toString()>
			//   89  210:invokespecial   #77  <Method void JsonSyntaxException(String)>
			//   90  213:athrow          
				}
				if(j != 0)
					flag = true;
				else
					flag = false;
				  goto _L3
				jsonreader.endArray();
			//   91  214:aload_1         
			//   92  215:invokevirtual   #102 <Method void JsonReader.endArray()>
				return bitset;
			//   93  218:aload           6
			//   94  220:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (BitSet)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #39  <Class BitSet>
			//    4    6:invokevirtual   #107 <Method void write(JsonWriter, BitSet)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, BitSet bitset)
				throws IOException
			{
				if(bitset == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #113 <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				}
				jsonwriter.beginArray();
			//    6   10:aload_1         
			//    7   11:invokevirtual   #115 <Method JsonWriter JsonWriter.beginArray()>
			//    8   14:pop             
				int i = 0;
			//    9   15:iconst_0        
			//   10   16:istore_3        
				while(i < bitset.length()) 
			//*  11   17:iload_3         
			//*  12   18:aload_2         
			//*  13   19:invokevirtual   #118 <Method int BitSet.length()>
			//*  14   22:icmpge          57
				{
					int j;
					if(bitset.get(i))
			//*  15   25:aload_2         
			//*  16   26:iload_3         
			//*  17   27:invokevirtual   #122 <Method boolean BitSet.get(int)>
			//*  18   30:ifeq            51
						j = 1;
			//   19   33:iconst_1        
			//   20   34:istore          4
					else
			//*  21   36:aload_1         
			//*  22   37:iload           4
			//*  23   39:i2l             
			//*  24   40:invokevirtual   #126 <Method JsonWriter JsonWriter.value(long)>
			//*  25   43:pop             
			//*  26   44:iload_3         
			//*  27   45:iconst_1        
			//*  28   46:iadd            
			//*  29   47:istore_3        
			//*  30   48:goto            17
						j = 0;
			//   31   51:iconst_0        
			//   32   52:istore          4
					jsonwriter.value(j);
					i++;
				}
			//*  33   54:goto            36
				jsonwriter.endArray();
			//   34   57:aload_1         
			//   35   58:invokevirtual   #128 <Method JsonWriter JsonWriter.endArray()>
			//   36   61:pop             
			//   37   62:return          
			}

		}
));
	//    8   21:new             #28  <Class TypeAdapters$2>
	//    9   24:dup             
	//   10   25:invokespecial   #152 <Method void TypeAdapters$2()>
	//   11   28:putstatic       #154 <Field TypeAdapter BIT_SET>
		BIT_SET_FACTORY = newFactory(java/util/BitSet, BIT_SET);
	//   12   31:ldc1            #156 <Class BitSet>
	//   13   33:getstatic       #154 <Field TypeAdapter BIT_SET>
	//   14   36:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//   15   39:putstatic       #158 <Field TypeAdapterFactory BIT_SET_FACTORY>
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
				if(boolean1 == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #64  <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				} else
				{
					jsonwriter.value(boolean1.booleanValue());
			//    6   10:aload_1         
			//    7   11:aload_2         
			//    8   12:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
			//    9   15:invokevirtual   #71  <Method JsonWriter JsonWriter.value(boolean)>
			//   10   18:pop             
					return;
			//   11   19:return          
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
				throws IOException
			{
				write(jsonwriter, (Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #40  <Class Boolean>
			//    4    6:invokevirtual   #74  <Method void write(JsonWriter, Boolean)>
			//    5    9:return          
			}

		}
));
	//   16   42:new             #52  <Class TypeAdapters$3>
	//   17   45:dup             
	//   18   46:invokespecial   #159 <Method void TypeAdapters$3()>
	//   19   49:putstatic       #161 <Field TypeAdapter BOOLEAN>
	//   20   52:new             #60  <Class TypeAdapters$4>
	//   21   55:dup             
	//   22   56:invokespecial   #162 <Method void TypeAdapters$4()>
	//   23   59:putstatic       #164 <Field TypeAdapter BOOLEAN_AS_STRING>
		BOOLEAN_FACTORY = newFactory(Boolean.TYPE, java/lang/Boolean, BOOLEAN);
	//   24   62:getstatic       #170 <Field Class Boolean.TYPE>
	//   25   65:ldc1            #166 <Class Boolean>
	//   26   67:getstatic       #161 <Field TypeAdapter BOOLEAN>
	//   27   70:invokestatic    #173 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   28   73:putstatic       #175 <Field TypeAdapterFactory BOOLEAN_FACTORY>
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
	//   29   76:new             #62  <Class TypeAdapters$5>
	//   30   79:dup             
	//   31   80:invokespecial   #176 <Method void TypeAdapters$5()>
	//   32   83:putstatic       #178 <Field TypeAdapter BYTE>
		BYTE_FACTORY = newFactory(Byte.TYPE, java/lang/Byte, BYTE);
	//   33   86:getstatic       #181 <Field Class Byte.TYPE>
	//   34   89:ldc1            #180 <Class Byte>
	//   35   91:getstatic       #178 <Field TypeAdapter BYTE>
	//   36   94:invokestatic    #173 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   37   97:putstatic       #183 <Field TypeAdapterFactory BYTE_FACTORY>
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
	//   38  100:new             #64  <Class TypeAdapters$6>
	//   39  103:dup             
	//   40  104:invokespecial   #184 <Method void TypeAdapters$6()>
	//   41  107:putstatic       #186 <Field TypeAdapter SHORT>
		SHORT_FACTORY = newFactory(Short.TYPE, java/lang/Short, SHORT);
	//   42  110:getstatic       #189 <Field Class Short.TYPE>
	//   43  113:ldc1            #188 <Class Short>
	//   44  115:getstatic       #186 <Field TypeAdapter SHORT>
	//   45  118:invokestatic    #173 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   46  121:putstatic       #191 <Field TypeAdapterFactory SHORT_FACTORY>
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
	//   47  124:new             #66  <Class TypeAdapters$7>
	//   48  127:dup             
	//   49  128:invokespecial   #192 <Method void TypeAdapters$7()>
	//   50  131:putstatic       #194 <Field TypeAdapter INTEGER>
		INTEGER_FACTORY = newFactory(Integer.TYPE, java/lang/Integer, INTEGER);
	//   51  134:getstatic       #197 <Field Class Integer.TYPE>
	//   52  137:ldc1            #196 <Class Integer>
	//   53  139:getstatic       #194 <Field TypeAdapter INTEGER>
	//   54  142:invokestatic    #173 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   55  145:putstatic       #199 <Field TypeAdapterFactory INTEGER_FACTORY>
	//   56  148:new             #68  <Class TypeAdapters$8>
	//   57  151:dup             
	//   58  152:invokespecial   #200 <Method void TypeAdapters$8()>
	//   59  155:putstatic       #202 <Field TypeAdapter LONG>
	//   60  158:new             #70  <Class TypeAdapters$9>
	//   61  161:dup             
	//   62  162:invokespecial   #203 <Method void TypeAdapters$9()>
	//   63  165:putstatic       #205 <Field TypeAdapter FLOAT>
	//   64  168:new             #8   <Class TypeAdapters$10>
	//   65  171:dup             
	//   66  172:invokespecial   #206 <Method void TypeAdapters$10()>
	//   67  175:putstatic       #208 <Field TypeAdapter DOUBLE>
		NUMBER = ((TypeAdapter) (new TypeAdapter() {

			public Number read(JsonReader jsonreader)
				throws IOException
			{
				JsonToken jsontoken = jsonreader.peek();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #22  <Method JsonToken JsonReader.peek()>
			//    2    4:astore_2        
				switch(_cls32..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()])
			//*   3    5:getstatic       #28  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
			//*   4    8:aload_2         
			//*   5    9:invokevirtual   #34  <Method int JsonToken.ordinal()>
			//*   6   12:iaload          
				{
			//*   7   13:tableswitch     1 4: default 44
			//			               1 77
			//			               2 44
			//			               3 44
			//			               4 71
				case 2: // '\002'
				case 3: // '\003'
				default:
					throw new JsonSyntaxException((new StringBuilder()).append("Expecting number, got: ").append(((Object) (jsontoken))).toString());
			//    8   44:new             #36  <Class JsonSyntaxException>
			//    9   47:dup             
			//   10   48:new             #38  <Class StringBuilder>
			//   11   51:dup             
			//   12   52:invokespecial   #39  <Method void StringBuilder()>
			//   13   55:ldc1            #41  <String "Expecting number, got: ">
			//   14   57:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
			//   15   60:aload_2         
			//   16   61:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
			//   17   64:invokevirtual   #52  <Method String StringBuilder.toString()>
			//   18   67:invokespecial   #55  <Method void JsonSyntaxException(String)>
			//   19   70:athrow          

				case 4: // '\004'
					jsonreader.nextNull();
			//   20   71:aload_1         
			//   21   72:invokevirtual   #58  <Method void JsonReader.nextNull()>
					return null;
			//   22   75:aconst_null     
			//   23   76:areturn         

				case 1: // '\001'
					return ((Number) (new LazilyParsedNumber(jsonreader.nextString())));
			//   24   77:new             #60  <Class LazilyParsedNumber>
			//   25   80:dup             
			//   26   81:aload_1         
			//   27   82:invokevirtual   #63  <Method String JsonReader.nextString()>
			//   28   85:invokespecial   #64  <Method void LazilyParsedNumber(String)>
			//   29   88:areturn         
				}
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
	//   68  178:new             #10  <Class TypeAdapters$11>
	//   69  181:dup             
	//   70  182:invokespecial   #209 <Method void TypeAdapters$11()>
	//   71  185:putstatic       #211 <Field TypeAdapter NUMBER>
		NUMBER_FACTORY = newFactory(java/lang/Number, NUMBER);
	//   72  188:ldc1            #213 <Class Number>
	//   73  190:getstatic       #211 <Field TypeAdapter NUMBER>
	//   74  193:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//   75  196:putstatic       #215 <Field TypeAdapterFactory NUMBER_FACTORY>
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
			//*   1    1:ifnonnull       13
					character = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #80  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					character = ((Character) (String.valueOf(((Object) (character)))));
			//    9   13:aload_2         
			//   10   14:invokestatic    #83  <Method String String.valueOf(Object)>
			//   11   17:astore_2        
				jsonwriter.value(((String) (character)));
			//*  12   18:goto            6
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
	//   76  199:new             #12  <Class TypeAdapters$12>
	//   77  202:dup             
	//   78  203:invokespecial   #216 <Method void TypeAdapters$12()>
	//   79  206:putstatic       #218 <Field TypeAdapter CHARACTER>
		CHARACTER_FACTORY = newFactory(Character.TYPE, java/lang/Character, CHARACTER);
	//   80  209:getstatic       #221 <Field Class Character.TYPE>
	//   81  212:ldc1            #220 <Class Character>
	//   82  214:getstatic       #218 <Field TypeAdapter CHARACTER>
	//   83  217:invokestatic    #173 <Method TypeAdapterFactory newFactory(Class, Class, TypeAdapter)>
	//   84  220:putstatic       #223 <Field TypeAdapterFactory CHARACTER_FACTORY>
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
	//   85  223:new             #14  <Class TypeAdapters$13>
	//   86  226:dup             
	//   87  227:invokespecial   #224 <Method void TypeAdapters$13()>
	//   88  230:putstatic       #226 <Field TypeAdapter STRING>
	//   89  233:new             #16  <Class TypeAdapters$14>
	//   90  236:dup             
	//   91  237:invokespecial   #227 <Method void TypeAdapters$14()>
	//   92  240:putstatic       #229 <Field TypeAdapter BIG_DECIMAL>
	//   93  243:new             #18  <Class TypeAdapters$15>
	//   94  246:dup             
	//   95  247:invokespecial   #230 <Method void TypeAdapters$15()>
	//   96  250:putstatic       #232 <Field TypeAdapter BIG_INTEGER>
		STRING_FACTORY = newFactory(java/lang/String, STRING);
	//   97  253:ldc1            #234 <Class String>
	//   98  255:getstatic       #226 <Field TypeAdapter STRING>
	//   99  258:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  100  261:putstatic       #236 <Field TypeAdapterFactory STRING_FACTORY>
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
			//*   1    1:ifnonnull       13
					stringbuilder = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					stringbuilder = ((StringBuilder) (stringbuilder.toString()));
			//    9   13:aload_2         
			//   10   14:invokevirtual   #58  <Method String StringBuilder.toString()>
			//   11   17:astore_2        
				jsonwriter.value(((String) (stringbuilder)));
			//*  12   18:goto            6
			}

		}
));
	//  101  264:new             #20  <Class TypeAdapters$16>
	//  102  267:dup             
	//  103  268:invokespecial   #237 <Method void TypeAdapters$16()>
	//  104  271:putstatic       #239 <Field TypeAdapter STRING_BUILDER>
		STRING_BUILDER_FACTORY = newFactory(java/lang/StringBuilder, STRING_BUILDER);
	//  105  274:ldc1            #241 <Class StringBuilder>
	//  106  276:getstatic       #239 <Field TypeAdapter STRING_BUILDER>
	//  107  279:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  108  282:putstatic       #243 <Field TypeAdapterFactory STRING_BUILDER_FACTORY>
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
			//*   1    1:ifnonnull       13
					stringbuffer = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					stringbuffer = ((StringBuffer) (stringbuffer.toString()));
			//    9   13:aload_2         
			//   10   14:invokevirtual   #58  <Method String StringBuffer.toString()>
			//   11   17:astore_2        
				jsonwriter.value(((String) (stringbuffer)));
			//*  12   18:goto            6
			}

		}
));
	//  109  285:new             #22  <Class TypeAdapters$17>
	//  110  288:dup             
	//  111  289:invokespecial   #244 <Method void TypeAdapters$17()>
	//  112  292:putstatic       #246 <Field TypeAdapter STRING_BUFFER>
		STRING_BUFFER_FACTORY = newFactory(java/lang/StringBuffer, STRING_BUFFER);
	//  113  295:ldc1            #248 <Class StringBuffer>
	//  114  297:getstatic       #246 <Field TypeAdapter STRING_BUFFER>
	//  115  300:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  116  303:putstatic       #250 <Field TypeAdapterFactory STRING_BUFFER_FACTORY>
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
				} else
			//*   6   14:aconst_null     
			//*   7   15:areturn         
				{
					jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #39  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
					if(!"null".equals(((Object) (jsonreader))))
			//*  11   21:ldc1            #41  <String "null">
			//*  12   23:aload_1         
			//*  13   24:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  14   27:ifne            14
						return new URL(((String) (jsonreader)));
			//   15   30:new             #49  <Class URL>
			//   16   33:dup             
			//   17   34:aload_1         
			//   18   35:invokespecial   #52  <Method void URL(String)>
			//   19   38:areturn         
				}
				return null;
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
			//*   1    1:ifnonnull       13
					url = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #63  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					url = ((URL) (url.toExternalForm()));
			//    9   13:aload_2         
			//   10   14:invokevirtual   #66  <Method String URL.toExternalForm()>
			//   11   17:astore_2        
				jsonwriter.value(((String) (url)));
			//*  12   18:goto            6
			}

		}
));
	//  117  306:new             #24  <Class TypeAdapters$18>
	//  118  309:dup             
	//  119  310:invokespecial   #251 <Method void TypeAdapters$18()>
	//  120  313:putstatic       #253 <Field TypeAdapter URL>
		URL_FACTORY = newFactory(java/net/URL, URL);
	//  121  316:ldc1            #255 <Class URL>
	//  122  318:getstatic       #253 <Field TypeAdapter URL>
	//  123  321:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  124  324:putstatic       #257 <Field TypeAdapterFactory URL_FACTORY>
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
				if(jsonreader.peek() != JsonToken.NULL) goto _L2; else goto _L1
			//    0    0:aload_1         
			//    1    1:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
			//    2    4:getstatic       #34  <Field JsonToken JsonToken.NULL>
			//    3    7:if_acmpne       16
_L1:
				jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #37  <Method void JsonReader.nextNull()>
_L4:
				return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
_L2:
				jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #41  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
				if("null".equals(((Object) (jsonreader)))) goto _L4; else goto _L3
			//   11   21:ldc1            #43  <String "null">
			//   12   23:aload_1         
			//   13   24:invokevirtual   #49  <Method boolean String.equals(Object)>
			//   14   27:ifne            14
_L3:
				jsonreader = ((JsonReader) (new URI(((String) (jsonreader)))));
			//   15   30:new             #51  <Class URI>
			//   16   33:dup             
			//   17   34:aload_1         
			//   18   35:invokespecial   #54  <Method void URI(String)>
			//   19   38:astore_1        
				return ((URI) (jsonreader));
			//   20   39:aload_1         
			//   21   40:areturn         
				jsonreader;
			//   22   41:astore_1        
				throw new JsonIOException(((Throwable) (jsonreader)));
			//   23   42:new             #56  <Class JsonIOException>
			//   24   45:dup             
			//   25   46:aload_1         
			//   26   47:invokespecial   #59  <Method void JsonIOException(Throwable)>
			//   27   50:athrow          
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
			//*   1    1:ifnonnull       13
					uri = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #70  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					uri = ((URI) (uri.toASCIIString()));
			//    9   13:aload_2         
			//   10   14:invokevirtual   #73  <Method String URI.toASCIIString()>
			//   11   17:astore_2        
				jsonwriter.value(((String) (uri)));
			//*  12   18:goto            6
			}

		}
));
	//  125  327:new             #26  <Class TypeAdapters$19>
	//  126  330:dup             
	//  127  331:invokespecial   #258 <Method void TypeAdapters$19()>
	//  128  334:putstatic       #260 <Field TypeAdapter URI>
		URI_FACTORY = newFactory(java/net/URI, URI);
	//  129  337:ldc2            #262 <Class URI>
	//  130  340:getstatic       #260 <Field TypeAdapter URI>
	//  131  343:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  132  346:putstatic       #264 <Field TypeAdapterFactory URI_FACTORY>
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
			//*   1    1:ifnonnull       13
					inetaddress = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #56  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					inetaddress = ((InetAddress) (inetaddress.getHostAddress()));
			//    9   13:aload_2         
			//   10   14:invokevirtual   #59  <Method String InetAddress.getHostAddress()>
			//   11   17:astore_2        
				jsonwriter.value(((String) (inetaddress)));
			//*  12   18:goto            6
			}

		}
));
	//  133  349:new             #30  <Class TypeAdapters$20>
	//  134  352:dup             
	//  135  353:invokespecial   #265 <Method void TypeAdapters$20()>
	//  136  356:putstatic       #267 <Field TypeAdapter INET_ADDRESS>
		INET_ADDRESS_FACTORY = newTypeHierarchyFactory(java/net/InetAddress, INET_ADDRESS);
	//  137  359:ldc2            #269 <Class InetAddress>
	//  138  362:getstatic       #267 <Field TypeAdapter INET_ADDRESS>
	//  139  365:invokestatic    #272 <Method TypeAdapterFactory newTypeHierarchyFactory(Class, TypeAdapter)>
	//  140  368:putstatic       #274 <Field TypeAdapterFactory INET_ADDRESS_FACTORY>
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
			//*   1    1:ifnonnull       13
					uuid = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #56  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					uuid = ((UUID) (uuid.toString()));
			//    9   13:aload_2         
			//   10   14:invokevirtual   #59  <Method String UUID.toString()>
			//   11   17:astore_2        
				jsonwriter.value(((String) (uuid)));
			//*  12   18:goto            6
			}

		}
));
	//  141  371:new             #32  <Class TypeAdapters$21>
	//  142  374:dup             
	//  143  375:invokespecial   #275 <Method void TypeAdapters$21()>
	//  144  378:putstatic       #277 <Field TypeAdapter UUID>
		UUID_FACTORY = newFactory(java/util/UUID, UUID);
	//  145  381:ldc2            #279 <Class UUID>
	//  146  384:getstatic       #277 <Field TypeAdapter UUID>
	//  147  387:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  148  390:putstatic       #281 <Field TypeAdapterFactory UUID_FACTORY>
	//  149  393:new             #34  <Class TypeAdapters$22>
	//  150  396:dup             
	//  151  397:invokespecial   #282 <Method void TypeAdapters$22()>
	//  152  400:putstatic       #284 <Field TypeAdapterFactory TIMESTAMP_FACTORY>
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
				int k = 0;
			//   18   32:iconst_0        
			//   19   33:istore          4
				int j = 0;
			//   20   35:iconst_0        
			//   21   36:istore_3        
				do
				{
					if(jsonreader.peek() == JsonToken.END_OBJECT)
						break;
			//   22   37:aload_1         
			//   23   38:invokevirtual   #45  <Method JsonToken JsonReader.peek()>
			//   24   41:getstatic       #60  <Field JsonToken JsonToken.END_OBJECT>
			//   25   44:if_acmpeq       153
					String s = jsonreader.nextName();
			//   26   47:aload_1         
			//   27   48:invokevirtual   #64  <Method String JsonReader.nextName()>
			//   28   51:astore          9
					int i = jsonreader.nextInt();
			//   29   53:aload_1         
			//   30   54:invokevirtual   #68  <Method int JsonReader.nextInt()>
			//   31   57:istore_2        
					if("year".equals(((Object) (s))))
			//*  32   58:ldc1            #26  <String "year">
			//*  33   60:aload           9
			//*  34   62:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  35   65:ifeq            74
						k1 = i;
			//   36   68:iload_2         
			//   37   69:istore          8
					else
			//*  38   71:goto            37
					if("month".equals(((Object) (s))))
			//*  39   74:ldc1            #20  <String "month">
			//*  40   76:aload           9
			//*  41   78:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  42   81:ifeq            90
						j1 = i;
			//   43   84:iload_2         
			//   44   85:istore          7
					else
			//*  45   87:goto            37
					if("dayOfMonth".equals(((Object) (s))))
			//*  46   90:ldc1            #11  <String "dayOfMonth">
			//*  47   92:aload           9
			//*  48   94:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  49   97:ifeq            106
						i1 = i;
			//   50  100:iload_2         
			//   51  101:istore          6
					else
			//*  52  103:goto            37
					if("hourOfDay".equals(((Object) (s))))
			//*  53  106:ldc1            #14  <String "hourOfDay">
			//*  54  108:aload           9
			//*  55  110:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  56  113:ifeq            122
						l = i;
			//   57  116:iload_2         
			//   58  117:istore          5
					else
			//*  59  119:goto            37
					if("minute".equals(((Object) (s))))
			//*  60  122:ldc1            #17  <String "minute">
			//*  61  124:aload           9
			//*  62  126:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  63  129:ifeq            138
						k = i;
			//   64  132:iload_2         
			//   65  133:istore          4
					else
			//*  66  135:goto            37
					if("second".equals(((Object) (s))))
			//*  67  138:ldc1            #23  <String "second">
			//*  68  140:aload           9
			//*  69  142:invokevirtual   #74  <Method boolean String.equals(Object)>
			//*  70  145:ifeq            37
						j = i;
			//   71  148:iload_2         
			//   72  149:istore_3        
				} while(true);
			//   73  150:goto            37
				jsonreader.endObject();
			//   74  153:aload_1         
			//   75  154:invokevirtual   #77  <Method void JsonReader.endObject()>
				return ((Calendar) (new GregorianCalendar(k1, j1, i1, l, k, j)));
			//   76  157:new             #79  <Class GregorianCalendar>
			//   77  160:dup             
			//   78  161:iload           8
			//   79  163:iload           7
			//   80  165:iload           6
			//   81  167:iload           5
			//   82  169:iload           4
			//   83  171:iload_3         
			//   84  172:invokespecial   #82  <Method void GregorianCalendar(int, int, int, int, int, int)>
			//   85  175:areturn         
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
	//  153  403:new             #38  <Class TypeAdapters$23>
	//  154  406:dup             
	//  155  407:invokespecial   #285 <Method void TypeAdapters$23()>
	//  156  410:putstatic       #287 <Field TypeAdapter CALENDAR>
		CALENDAR_FACTORY = newFactoryForMultipleTypes(java/util/Calendar, java/util/GregorianCalendar, CALENDAR);
	//  157  413:ldc2            #289 <Class Calendar>
	//  158  416:ldc2            #291 <Class GregorianCalendar>
	//  159  419:getstatic       #287 <Field TypeAdapter CALENDAR>
	//  160  422:invokestatic    #294 <Method TypeAdapterFactory newFactoryForMultipleTypes(Class, Class, TypeAdapter)>
	//  161  425:putstatic       #296 <Field TypeAdapterFactory CALENDAR_FACTORY>
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
			//*   1    1:ifnonnull       13
					locale = null;
			//    2    4:aconst_null     
			//    3    5:astore_2        
				else
			//*   4    6:aload_1         
			//*   5    7:aload_2         
			//*   6    8:invokevirtual   #73  <Method JsonWriter JsonWriter.value(String)>
			//*   7   11:pop             
			//*   8   12:return          
					locale = ((Locale) (locale.toString()));
			//    9   13:aload_2         
			//   10   14:invokevirtual   #76  <Method String Locale.toString()>
			//   11   17:astore_2        
				jsonwriter.value(((String) (locale)));
			//*  12   18:goto            6
			}

		}
));
	//  162  428:new             #40  <Class TypeAdapters$24>
	//  163  431:dup             
	//  164  432:invokespecial   #297 <Method void TypeAdapters$24()>
	//  165  435:putstatic       #299 <Field TypeAdapter LOCALE>
		LOCALE_FACTORY = newFactory(java/util/Locale, LOCALE);
	//  166  438:ldc2            #301 <Class Locale>
	//  167  441:getstatic       #299 <Field TypeAdapter LOCALE>
	//  168  444:invokestatic    #149 <Method TypeAdapterFactory newFactory(Class, TypeAdapter)>
	//  169  447:putstatic       #303 <Field TypeAdapterFactory LOCALE_FACTORY>
		JSON_ELEMENT = ((TypeAdapter) (new TypeAdapter() {

			public JsonElement read(JsonReader jsonreader)
				throws IOException
			{
				JsonObject jsonobject;
				switch(_cls32..SwitchMap.com.google.gson.stream.JsonToken[jsonreader.peek().ordinal()])
			//*   0    0:getstatic       #22  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
			//*   1    3:aload_1         
			//*   2    4:invokevirtual   #28  <Method JsonToken JsonReader.peek()>
			//*   3    7:invokevirtual   #34  <Method int JsonToken.ordinal()>
			//*   4   10:iaload          
				{
			//*   5   11:tableswitch     1 6: default 48
			//			               1 68
			//			               2 87
			//			               3 56
			//			               4 102
			//			               5 110
			//			               6 147
				default:
					throw new IllegalArgumentException();
			//    6   48:new             #36  <Class IllegalArgumentException>
			//    7   51:dup             
			//    8   52:invokespecial   #37  <Method void IllegalArgumentException()>
			//    9   55:athrow          

				case 3: // '\003'
					return ((JsonElement) (new JsonPrimitive(jsonreader.nextString())));
			//   10   56:new             #39  <Class JsonPrimitive>
			//   11   59:dup             
			//   12   60:aload_1         
			//   13   61:invokevirtual   #43  <Method String JsonReader.nextString()>
			//   14   64:invokespecial   #46  <Method void JsonPrimitive(String)>
			//   15   67:areturn         

				case 1: // '\001'
					return ((JsonElement) (new JsonPrimitive(((Number) (new LazilyParsedNumber(jsonreader.nextString()))))));
			//   16   68:new             #39  <Class JsonPrimitive>
			//   17   71:dup             
			//   18   72:new             #48  <Class LazilyParsedNumber>
			//   19   75:dup             
			//   20   76:aload_1         
			//   21   77:invokevirtual   #43  <Method String JsonReader.nextString()>
			//   22   80:invokespecial   #49  <Method void LazilyParsedNumber(String)>
			//   23   83:invokespecial   #52  <Method void JsonPrimitive(Number)>
			//   24   86:areturn         

				case 2: // '\002'
					return ((JsonElement) (new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()))));
			//   25   87:new             #39  <Class JsonPrimitive>
			//   26   90:dup             
			//   27   91:aload_1         
			//   28   92:invokevirtual   #56  <Method boolean JsonReader.nextBoolean()>
			//   29   95:invokestatic    #62  <Method Boolean Boolean.valueOf(boolean)>
			//   30   98:invokespecial   #65  <Method void JsonPrimitive(Boolean)>
			//   31  101:areturn         

				case 4: // '\004'
					jsonreader.nextNull();
			//   32  102:aload_1         
			//   33  103:invokevirtual   #68  <Method void JsonReader.nextNull()>
					return ((JsonElement) (JsonNull.INSTANCE));
			//   34  106:getstatic       #74  <Field JsonNull JsonNull.INSTANCE>
			//   35  109:areturn         

				case 5: // '\005'
					JsonArray jsonarray = new JsonArray();
			//   36  110:new             #76  <Class JsonArray>
			//   37  113:dup             
			//   38  114:invokespecial   #77  <Method void JsonArray()>
			//   39  117:astore_2        
					jsonreader.beginArray();
			//   40  118:aload_1         
			//   41  119:invokevirtual   #80  <Method void JsonReader.beginArray()>
					for(; jsonreader.hasNext(); jsonarray.add(read(jsonreader)));
			//   42  122:aload_1         
			//   43  123:invokevirtual   #83  <Method boolean JsonReader.hasNext()>
			//   44  126:ifeq            141
			//   45  129:aload_2         
			//   46  130:aload_0         
			//   47  131:aload_1         
			//   48  132:invokevirtual   #85  <Method JsonElement read(JsonReader)>
			//   49  135:invokevirtual   #89  <Method void JsonArray.add(JsonElement)>
			//*  50  138:goto            122
					jsonreader.endArray();
			//   51  141:aload_1         
			//   52  142:invokevirtual   #92  <Method void JsonReader.endArray()>
					return ((JsonElement) (jsonarray));
			//   53  145:aload_2         
			//   54  146:areturn         

				case 6: // '\006'
					jsonobject = new JsonObject();
			//   55  147:new             #94  <Class JsonObject>
			//   56  150:dup             
			//   57  151:invokespecial   #95  <Method void JsonObject()>
			//   58  154:astore_2        
					jsonreader.beginObject();
			//   59  155:aload_1         
			//   60  156:invokevirtual   #98  <Method void JsonReader.beginObject()>
					break;
				}
				for(; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), read(jsonreader)));
			//   61  159:aload_1         
			//   62  160:invokevirtual   #83  <Method boolean JsonReader.hasNext()>
			//   63  163:ifeq            182
			//   64  166:aload_2         
			//   65  167:aload_1         
			//   66  168:invokevirtual   #101 <Method String JsonReader.nextName()>
			//   67  171:aload_0         
			//   68  172:aload_1         
			//   69  173:invokevirtual   #85  <Method JsonElement read(JsonReader)>
			//   70  176:invokevirtual   #104 <Method void JsonObject.add(String, JsonElement)>
			//*  71  179:goto            159
				jsonreader.endObject();
			//   72  182:aload_1         
			//   73  183:invokevirtual   #107 <Method void JsonReader.endObject()>
				return ((JsonElement) (jsonobject));
			//   74  186:aload_2         
			//   75  187:areturn         
			}

			public volatile Object read(JsonReader jsonreader)
				throws IOException
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #85  <Method JsonElement read(JsonReader)>
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
			//*  11   21:ifeq            73
				{
					jsonelement = ((JsonElement) (jsonelement.getAsJsonPrimitive()));
			//   12   24:aload_2         
			//   13   25:invokevirtual   #129 <Method JsonPrimitive JsonElement.getAsJsonPrimitive()>
			//   14   28:astore_2        
					if(((JsonPrimitive) (jsonelement)).isNumber())
			//*  15   29:aload_2         
			//*  16   30:invokevirtual   #132 <Method boolean JsonPrimitive.isNumber()>
			//*  17   33:ifeq            46
					{
						jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsNumber());
			//   18   36:aload_1         
			//   19   37:aload_2         
			//   20   38:invokevirtual   #136 <Method Number JsonPrimitive.getAsNumber()>
			//   21   41:invokevirtual   #140 <Method JsonWriter JsonWriter.value(Number)>
			//   22   44:pop             
						return;
			//   23   45:return          
					}
					if(((JsonPrimitive) (jsonelement)).isBoolean())
			//*  24   46:aload_2         
			//*  25   47:invokevirtual   #143 <Method boolean JsonPrimitive.isBoolean()>
			//*  26   50:ifeq            63
					{
						jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsBoolean());
			//   27   53:aload_1         
			//   28   54:aload_2         
			//   29   55:invokevirtual   #146 <Method boolean JsonPrimitive.getAsBoolean()>
			//   30   58:invokevirtual   #149 <Method JsonWriter JsonWriter.value(boolean)>
			//   31   61:pop             
						return;
			//   32   62:return          
					} else
					{
						jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsString());
			//   33   63:aload_1         
			//   34   64:aload_2         
			//   35   65:invokevirtual   #152 <Method String JsonPrimitive.getAsString()>
			//   36   68:invokevirtual   #155 <Method JsonWriter JsonWriter.value(String)>
			//   37   71:pop             
						return;
			//   38   72:return          
					}
				}
				if(jsonelement.isJsonArray())
			//*  39   73:aload_2         
			//*  40   74:invokevirtual   #158 <Method boolean JsonElement.isJsonArray()>
			//*  41   77:ifeq            125
				{
					jsonwriter.beginArray();
			//   42   80:aload_1         
			//   43   81:invokevirtual   #160 <Method JsonWriter JsonWriter.beginArray()>
			//   44   84:pop             
					for(jsonelement = ((JsonElement) (jsonelement.getAsJsonArray().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)((Iterator) (jsonelement)).next()));
			//   45   85:aload_2         
			//   46   86:invokevirtual   #164 <Method JsonArray JsonElement.getAsJsonArray()>
			//   47   89:invokevirtual   #168 <Method Iterator JsonArray.iterator()>
			//   48   92:astore_2        
			//   49   93:aload_2         
			//   50   94:invokeinterface #171 <Method boolean Iterator.hasNext()>
			//   51   99:ifeq            119
			//   52  102:aload_0         
			//   53  103:aload_1         
			//   54  104:aload_2         
			//   55  105:invokeinterface #175 <Method Object Iterator.next()>
			//   56  110:checkcast       #113 <Class JsonElement>
			//   57  113:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
			//*  58  116:goto            93
					jsonwriter.endArray();
			//   59  119:aload_1         
			//   60  120:invokevirtual   #179 <Method JsonWriter JsonWriter.endArray()>
			//   61  123:pop             
					return;
			//   62  124:return          
				}
				if(jsonelement.isJsonObject())
			//*  63  125:aload_2         
			//*  64  126:invokevirtual   #182 <Method boolean JsonElement.isJsonObject()>
			//*  65  129:ifeq            206
				{
					jsonwriter.beginObject();
			//   66  132:aload_1         
			//   67  133:invokevirtual   #184 <Method JsonWriter JsonWriter.beginObject()>
			//   68  136:pop             
					java.util.Map.Entry entry;
					for(jsonelement = ((JsonElement) (jsonelement.getAsJsonObject().entrySet().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)entry.getValue()))
			//*  69  137:aload_2         
			//*  70  138:invokevirtual   #188 <Method JsonObject JsonElement.getAsJsonObject()>
			//*  71  141:invokevirtual   #192 <Method Set JsonObject.entrySet()>
			//*  72  144:invokeinterface #195 <Method Iterator Set.iterator()>
			//*  73  149:astore_2        
			//*  74  150:aload_2         
			//*  75  151:invokeinterface #171 <Method boolean Iterator.hasNext()>
			//*  76  156:ifeq            200
					{
						entry = (java.util.Map.Entry)((Iterator) (jsonelement)).next();
			//   77  159:aload_2         
			//   78  160:invokeinterface #175 <Method Object Iterator.next()>
			//   79  165:checkcast       #197 <Class java.util.Map$Entry>
			//   80  168:astore_3        
						jsonwriter.name((String)entry.getKey());
			//   81  169:aload_1         
			//   82  170:aload_3         
			//   83  171:invokeinterface #200 <Method Object java.util.Map$Entry.getKey()>
			//   84  176:checkcast       #202 <Class String>
			//   85  179:invokevirtual   #205 <Method JsonWriter JsonWriter.name(String)>
			//   86  182:pop             
					}

			//   87  183:aload_0         
			//   88  184:aload_1         
			//   89  185:aload_3         
			//   90  186:invokeinterface #208 <Method Object java.util.Map$Entry.getValue()>
			//   91  191:checkcast       #113 <Class JsonElement>
			//   92  194:invokevirtual   #177 <Method void write(JsonWriter, JsonElement)>
			//*  93  197:goto            150
					jsonwriter.endObject();
			//   94  200:aload_1         
			//   95  201:invokevirtual   #210 <Method JsonWriter JsonWriter.endObject()>
			//   96  204:pop             
					return;
			//   97  205:return          
				} else
				{
					throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(((Object) (((Object) (jsonelement)).getClass()))).toString());
			//   98  206:new             #36  <Class IllegalArgumentException>
			//   99  209:dup             
			//  100  210:new             #212 <Class StringBuilder>
			//  101  213:dup             
			//  102  214:invokespecial   #213 <Method void StringBuilder()>
			//  103  217:ldc1            #215 <String "Couldn't write ">
			//  104  219:invokevirtual   #219 <Method StringBuilder StringBuilder.append(String)>
			//  105  222:aload_2         
			//  106  223:invokevirtual   #225 <Method Class Object.getClass()>
			//  107  226:invokevirtual   #228 <Method StringBuilder StringBuilder.append(Object)>
			//  108  229:invokevirtual   #231 <Method String StringBuilder.toString()>
			//  109  232:invokespecial   #232 <Method void IllegalArgumentException(String)>
			//  110  235:athrow          
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
	//  170  450:new             #42  <Class TypeAdapters$25>
	//  171  453:dup             
	//  172  454:invokespecial   #304 <Method void TypeAdapters$25()>
	//  173  457:putstatic       #306 <Field TypeAdapter JSON_ELEMENT>
		JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(com/google/gson/JsonElement, JSON_ELEMENT);
	//  174  460:ldc2            #308 <Class JsonElement>
	//  175  463:getstatic       #306 <Field TypeAdapter JSON_ELEMENT>
	//  176  466:invokestatic    #272 <Method TypeAdapterFactory newTypeHierarchyFactory(Class, TypeAdapter)>
	//  177  469:putstatic       #310 <Field TypeAdapterFactory JSON_ELEMENT_FACTORY>
	//  178  472:new             #44  <Class TypeAdapters$26>
	//  179  475:dup             
	//  180  476:invokespecial   #311 <Method void TypeAdapters$26()>
	//  181  479:putstatic       #313 <Field TypeAdapterFactory ENUM_FACTORY>
	//* 182  482:return          
	}
}
