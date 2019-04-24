// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
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
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #76  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #82  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #85  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return (Enum)nameToConstant.get(((Object) (jsonreader.nextString())));
		//    8   16:aload_0         
		//    9   17:getfield        #25  <Field Map nameToConstant>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #88  <Method String JsonReader.nextString()>
		//   12   24:invokeinterface #92  <Method Object Map.get(Object)>
		//   13   29:checkcast       #37  <Class Enum>
		//   14   32:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #96  <Method Enum read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Enum enum)
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
		//    8   14:invokeinterface #92  <Method Object Map.get(Object)>
		//    9   19:checkcast       #100 <Class String>
		//   10   22:astore_2        
			jsonwriter.value(((String) (enum)));
		//   11   23:aload_1         
		//   12   24:aload_2         
		//   13   25:invokevirtual   #105 <Method JsonWriter JsonWriter.value(String)>
		//   14   28:pop             
		//   15   29:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
		{
			write(jsonwriter, (Enum)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #37  <Class Enum>
		//    4    6:invokevirtual   #109 <Method void write(JsonWriter, Enum)>
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
			String s;
			Enum aenum[];
			Enum enum;
			SerializedName serializedname;
			try
			{
				aenum = (Enum[])class1.getEnumConstants();
		//   12   26:aload_1         
		//   13   27:invokevirtual   #33  <Method Object[] Class.getEnumConstants()>
		//   14   30:checkcast       #35  <Class Enum[]>
		//   15   33:astore          5
				j = aenum.length;
		//   16   35:aload           5
		//   17   37:arraylength     
		//   18   38:istore_3        
			}
		//*  19   39:iconst_0        
		//*  20   40:istore_2        
		//*  21   41:iload_2         
		//*  22   42:iload_3         
		//*  23   43:icmpge          124
		//*  24   46:aload           5
		//*  25   48:iload_2         
		//*  26   49:aaload          
		//*  27   50:astore          6
		//*  28   52:aload           6
		//*  29   54:invokevirtual   #41  <Method String Enum.name()>
		//*  30   57:astore          4
		//*  31   59:aload_1         
		//*  32   60:aload           4
		//*  33   62:invokevirtual   #45  <Method Field Class.getField(String)>
		//*  34   65:ldc1            #47  <Class SerializedName>
		//*  35   67:invokevirtual   #53  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
		//*  36   70:checkcast       #47  <Class SerializedName>
		//*  37   73:astore          7
		//*  38   75:aload           7
		//*  39   77:ifnull          89
		//*  40   80:aload           7
		//*  41   82:invokeinterface #56  <Method String SerializedName.value()>
		//*  42   87:astore          4
		//*  43   89:aload_0         
		//*  44   90:getfield        #25  <Field Map nameToConstant>
		//*  45   93:aload           4
		//*  46   95:aload           6
		//*  47   97:invokeinterface #62  <Method Object Map.put(Object, Object)>
		//*  48  102:pop             
		//*  49  103:aload_0         
		//*  50  104:getfield        #27  <Field Map constantToName>
		//*  51  107:aload           6
		//*  52  109:aload           4
		//*  53  111:invokeinterface #62  <Method Object Map.put(Object, Object)>
		//*  54  116:pop             
		//*  55  117:iload_2         
		//*  56  118:iconst_1        
		//*  57  119:iadd            
		//*  58  120:istore_2        
		//*  59  121:goto            41
		//*  60  124:return          
		//*  61  125:new             #64  <Class AssertionError>
		//*  62  128:dup             
		//*  63  129:invokespecial   #65  <Method void AssertionError()>
		//*  64  132:athrow          
			// Misplaced declaration of an exception variable
			catch(Class class1)
			{
				throw new AssertionError();
			}
			i = 0;
			if(i >= j)
				break; /* Loop/switch isn't completed */
			enum = aenum[i];
			s = enum.name();
			serializedname = (SerializedName)class1.getField(s).getAnnotation(com/google/gson/annotations/SerializedName);
			if(serializedname == null)
				break MISSING_BLOCK_LABEL_89;
			s = serializedname.value();
			nameToConstant.put(((Object) (s)), ((Object) (enum)));
			constantToName.put(((Object) (enum)), ((Object) (s)));
			i++;
			if(true) goto _L2; else goto _L1
_L2:
			break MISSING_BLOCK_LABEL_41;
_L1:
		//*  65  133:astore_1        
		//*  66  134:goto            125
		}
	}


	private TypeAdapters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #315 <Method void Object()>
	//    2    4:return          
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
	//    4    6:invokespecial   #319 <Method void TypeAdapters$27(TypeToken, TypeAdapter)>
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
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #39  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #40  <Method void StringBuilder()>
			//    3    7:astore_1        
				stringbuilder.append("Factory[type=");
			//    4    8:aload_1         
			//    5    9:ldc1            #42  <String "Factory[type=">
			//    6   11:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(type.getName());
			//    8   15:aload_1         
			//    9   16:aload_0         
			//   10   17:getfield        #19  <Field Class val$type>
			//   11   20:invokevirtual   #51  <Method String Class.getName()>
			//   12   23:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//   13   26:pop             
				stringbuilder.append(",adapter=");
			//   14   27:aload_1         
			//   15   28:ldc1            #53  <String ",adapter=">
			//   16   30:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//   17   33:pop             
				stringbuilder.append(((Object) (typeAdapter)));
			//   18   34:aload_1         
			//   19   35:aload_0         
			//   20   36:getfield        #21  <Field TypeAdapter val$typeAdapter>
			//   21   39:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
			//   22   42:pop             
				stringbuilder.append("]");
			//   23   43:aload_1         
			//   24   44:ldc1            #58  <String "]">
			//   25   46:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
			//   26   49:pop             
				return stringbuilder.toString();
			//   27   50:aload_1         
			//   28   51:invokevirtual   #60  <Method String StringBuilder.toString()>
			//   29   54:areturn         
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
	//    4    6:invokespecial   #324 <Method void TypeAdapters$28(Class, TypeAdapter)>
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
				if(gson != unboxed && gson != boxed)
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
					return typeAdapter;
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
				stringbuilder.append(boxed.getName());
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
				stringbuilder.append(unboxed.getName());
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
				stringbuilder.append(((Object) (typeAdapter)));
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
	//    5    7:invokespecial   #328 <Method void TypeAdapters$29(Class, Class, TypeAdapter)>
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
				if(gson != base && gson != sub)
			//*   3    5:aload_1         
			//*   4    6:aload_0         
			//*   5    7:getfield        #20  <Field Class val$base>
			//*   6   10:if_acmpeq       26
			//*   7   13:aload_1         
			//*   8   14:aload_0         
			//*   9   15:getfield        #22  <Field Class val$sub>
			//*  10   18:if_acmpne       24
			//*  11   21:goto            26
					return null;
			//   12   24:aconst_null     
			//   13   25:areturn         
				else
					return typeAdapter;
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
				stringbuilder.append(base.getName());
			//    8   15:aload_1         
			//    9   16:aload_0         
			//   10   17:getfield        #20  <Field Class val$base>
			//   11   20:invokevirtual   #54  <Method String Class.getName()>
			//   12   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   13   26:pop             
				stringbuilder.append("+");
			//   14   27:aload_1         
			//   15   28:ldc1            #56  <String "+">
			//   16   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   17   33:pop             
				stringbuilder.append(sub.getName());
			//   18   34:aload_1         
			//   19   35:aload_0         
			//   20   36:getfield        #22  <Field Class val$sub>
			//   21   39:invokevirtual   #54  <Method String Class.getName()>
			//   22   42:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   23   45:pop             
				stringbuilder.append(",adapter=");
			//   24   46:aload_1         
			//   25   47:ldc1            #58  <String ",adapter=">
			//   26   49:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
			//   27   52:pop             
				stringbuilder.append(((Object) (typeAdapter)));
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
	//    5    7:invokespecial   #330 <Method void TypeAdapters$30(Class, Class, TypeAdapter)>
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
				stringbuilder.append(clazz.getName());
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
				stringbuilder.append(((Object) (typeAdapter)));
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
	//    4    6:invokespecial   #332 <Method void TypeAdapters$31(Class, TypeAdapter)>
	//    5    9:areturn         
	}

	public static final TypeAdapter BIG_DECIMAL = new TypeAdapter() {

		public volatile Object read(JsonReader jsonreader)
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #17  <Method BigDecimal read(JsonReader)>
		//    3    5:areturn         
		}

		public BigDecimal read(JsonReader jsonreader)
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #31  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #34  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			try
			{
				jsonreader = ((JsonReader) (new BigDecimal(jsonreader.nextString())));
		//    8   16:new             #36  <Class BigDecimal>
		//    9   19:dup             
		//   10   20:aload_1         
		//   11   21:invokevirtual   #40  <Method String JsonReader.nextString()>
		//   12   24:invokespecial   #43  <Method void BigDecimal(String)>
		//   13   27:astore_1        
			}
		//*  14   28:aload_1         
		//*  15   29:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  16   30:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   17   31:new             #45  <Class JsonSyntaxException>
		//   18   34:dup             
		//   19   35:aload_1         
		//   20   36:invokespecial   #48  <Method void JsonSyntaxException(Throwable)>
		//   21   39:athrow          
			}
			return ((BigDecimal) (jsonreader));
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
		{
			write(jsonwriter, (BigDecimal)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #36  <Class BigDecimal>
		//    4    6:invokevirtual   #53  <Method void write(JsonWriter, BigDecimal)>
		//    5    9:return          
		}

		public void write(JsonWriter jsonwriter, BigDecimal bigdecimal)
		{
			jsonwriter.value(((Number) (bigdecimal)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #59  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

	}
;
	public static final TypeAdapter BIG_INTEGER = new TypeAdapter() {

		public volatile Object read(JsonReader jsonreader)
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #17  <Method BigInteger read(JsonReader)>
		//    3    5:areturn         
		}

		public BigInteger read(JsonReader jsonreader)
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #31  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #34  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			}
			try
			{
				jsonreader = ((JsonReader) (new BigInteger(jsonreader.nextString())));
		//    8   16:new             #36  <Class BigInteger>
		//    9   19:dup             
		//   10   20:aload_1         
		//   11   21:invokevirtual   #40  <Method String JsonReader.nextString()>
		//   12   24:invokespecial   #43  <Method void BigInteger(String)>
		//   13   27:astore_1        
			}
		//*  14   28:aload_1         
		//*  15   29:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  16   30:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   17   31:new             #45  <Class JsonSyntaxException>
		//   18   34:dup             
		//   19   35:aload_1         
		//   20   36:invokespecial   #48  <Method void JsonSyntaxException(Throwable)>
		//   21   39:athrow          
			}
			return ((BigInteger) (jsonreader));
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
		{
			write(jsonwriter, (BigInteger)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #36  <Class BigInteger>
		//    4    6:invokevirtual   #53  <Method void write(JsonWriter, BigInteger)>
		//    5    9:return          
		}

		public void write(JsonWriter jsonwriter, BigInteger biginteger)
		{
			jsonwriter.value(((Number) (biginteger)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #59  <Method JsonWriter JsonWriter.value(Number)>
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
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return Boolean.valueOf(jsonreader.nextString());
		//    8   16:aload_1         
		//    9   17:invokevirtual   #33  <Method String JsonReader.nextString()>
		//   10   20:invokestatic    #39  <Method Boolean Boolean.valueOf(String)>
		//   11   23:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #42  <Method Boolean read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Boolean boolean1)
		{
			if(boolean1 == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       10
				boolean1 = "null";
		//    2    4:ldc1            #46  <String "null">
		//    3    6:astore_2        
			else
		//*   4    7:goto            15
				boolean1 = ((Boolean) (boolean1.toString()));
		//    5   10:aload_2         
		//    6   11:invokevirtual   #49  <Method String Boolean.toString()>
		//    7   14:astore_2        
			jsonwriter.value(((String) (boolean1)));
		//    8   15:aload_1         
		//    9   16:aload_2         
		//   10   17:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
		//   11   20:pop             
		//   12   21:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
		{
			write(jsonwriter, (Boolean)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #35  <Class Boolean>
		//    4    6:invokevirtual   #58  <Method void write(JsonWriter, Boolean)>
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
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return ((Number) (Double.valueOf(jsonreader.nextDouble())));
		//    8   16:aload_1         
		//    9   17:invokevirtual   #33  <Method double JsonReader.nextDouble()>
		//   10   20:invokestatic    #39  <Method Double Double.valueOf(double)>
		//   11   23:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #42  <Method Number read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Number number)
		{
			jsonwriter.value(number);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #50  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
		{
			write(jsonwriter, (Number)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #53  <Class Number>
		//    4    6:invokevirtual   #55  <Method void write(JsonWriter, Number)>
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
			if(((Class) (java/lang/Enum)).isAssignableFrom(((Class) (typetoken))) && typetoken != java/lang/Enum)
		//*   3    5:ldc1            #23  <Class Enum>
		//*   4    7:aload_2         
		//*   5    8:invokevirtual   #29  <Method boolean Class.isAssignableFrom(Class)>
		//*   6   11:ifeq            46
		//*   7   14:aload_2         
		//*   8   15:ldc1            #23  <Class Enum>
		//*   9   17:if_acmpne       23
		//*  10   20:goto            46
			{
				gson = ((Gson) (typetoken));
		//   11   23:aload_2         
		//   12   24:astore_1        
				if(!((Class) (typetoken)).isEnum())
		//*  13   25:aload_2         
		//*  14   26:invokevirtual   #33  <Method boolean Class.isEnum()>
		//*  15   29:ifne            37
					gson = ((Gson) (((Class) (typetoken)).getSuperclass()));
		//   16   32:aload_2         
		//   17   33:invokevirtual   #36  <Method Class Class.getSuperclass()>
		//   18   36:astore_1        
				return ((TypeAdapter) (new EnumTypeAdapter(((Class) (gson)))));
		//   19   37:new             #38  <Class TypeAdapters$EnumTypeAdapter>
		//   20   40:dup             
		//   21   41:aload_1         
		//   22   42:invokespecial   #41  <Method void TypeAdapters$EnumTypeAdapter(Class)>
		//   23   45:areturn         
			} else
			{
				return null;
		//   24   46:aconst_null     
		//   25   47:areturn         
			}
		}

	}
;
	public static final TypeAdapter FLOAT = new TypeAdapter() {

		public Number read(JsonReader jsonreader)
		{
			if(jsonreader.peek() == JsonToken.NULL)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
		//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
		//*   3    7:if_acmpne       16
			{
				jsonreader.nextNull();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return ((Number) (Float.valueOf((float)jsonreader.nextDouble())));
		//    8   16:aload_1         
		//    9   17:invokevirtual   #33  <Method double JsonReader.nextDouble()>
		//   10   20:d2f             
		//   11   21:invokestatic    #39  <Method Float Float.valueOf(float)>
		//   12   24:areturn         
			}
		}

		public volatile Object read(JsonReader jsonreader)
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #42  <Method Number read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Number number)
		{
			jsonwriter.value(number);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #50  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
		{
			write(jsonwriter, (Number)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #53  <Class Number>
		//    4    6:invokevirtual   #55  <Method void write(JsonWriter, Number)>
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
			long l;
			try
			{
				l = jsonreader.nextLong();
		//    8   16:aload_1         
		//    9   17:invokevirtual   #35  <Method long JsonReader.nextLong()>
		//   10   20:lstore_2        
			}
		//*  11   21:lload_2         
		//*  12   22:invokestatic    #41  <Method Long Long.valueOf(long)>
		//*  13   25:areturn         
			// Misplaced declaration of an exception variable
			catch(JsonReader jsonreader)
		//*  14   26:astore_1        
			{
				throw new JsonSyntaxException(((Throwable) (jsonreader)));
		//   15   27:new             #43  <Class JsonSyntaxException>
		//   16   30:dup             
		//   17   31:aload_1         
		//   18   32:invokespecial   #46  <Method void JsonSyntaxException(Throwable)>
		//   19   35:athrow          
			}
			return ((Number) (Long.valueOf(l)));
		}

		public volatile Object read(JsonReader jsonreader)
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #49  <Method Number read(JsonReader)>
		//    3    5:areturn         
		}

		public void write(JsonWriter jsonwriter, Number number)
		{
			jsonwriter.value(number);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #57  <Method JsonWriter JsonWriter.value(Number)>
		//    3    5:pop             
		//    4    6:return          
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
		{
			write(jsonwriter, (Number)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #60  <Class Number>
		//    4    6:invokevirtual   #62  <Method void write(JsonWriter, Number)>
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
					{
						return ((Object) (read(jsonreader)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:invokevirtual   #29  <Method Timestamp read(JsonReader)>
					//    3    5:areturn         
					}

					public Timestamp read(JsonReader jsonreader)
					{
						jsonreader = ((JsonReader) ((Date)dateTypeAdapter.read(jsonreader)));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field TypeAdapter val$dateTypeAdapter>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #31  <Method Object TypeAdapter.read(JsonReader)>
					//    4    8:checkcast       #33  <Class Date>
					//    5   11:astore_1        
						if(jsonreader != null)
					//*   6   12:aload_1         
					//*   7   13:ifnull          28
							return new Timestamp(((Date) (jsonreader)).getTime());
					//    8   16:new             #35  <Class Timestamp>
					//    9   19:dup             
					//   10   20:aload_1         
					//   11   21:invokevirtual   #39  <Method long Date.getTime()>
					//   12   24:invokespecial   #42  <Method void Timestamp(long)>
					//   13   27:areturn         
						else
							return null;
					//   14   28:aconst_null     
					//   15   29:areturn         
					}

					public volatile void write(JsonWriter jsonwriter, Object obj)
					{
						write(jsonwriter, (Timestamp)obj);
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:aload_2         
					//    3    3:checkcast       #35  <Class Timestamp>
					//    4    6:invokevirtual   #47  <Method void write(JsonWriter, Timestamp)>
					//    5    9:return          
					}

					public void write(JsonWriter jsonwriter, Timestamp timestamp)
					{
						dateTypeAdapter.write(jsonwriter, ((Object) (timestamp)));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field TypeAdapter val$dateTypeAdapter>
					//    2    4:aload_1         
					//    3    5:aload_2         
					//    4    6:invokevirtual   #49  <Method void TypeAdapter.write(JsonWriter, Object)>
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
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
			//    8   16:new             #31  <Class UnsupportedOperationException>
			//    9   19:dup             
			//   10   20:ldc1            #33  <String "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?">
			//   11   22:invokespecial   #36  <Method void UnsupportedOperationException(String)>
			//   12   25:athrow          
				}
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #39  <Method Class read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Class class1)
			{
				if(class1 == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #47  <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				} else
				{
					jsonwriter = ((JsonWriter) (new StringBuilder()));
			//    6   10:new             #49  <Class StringBuilder>
			//    7   13:dup             
			//    8   14:invokespecial   #50  <Method void StringBuilder()>
			//    9   17:astore_1        
					((StringBuilder) (jsonwriter)).append("Attempted to serialize java.lang.Class: ");
			//   10   18:aload_1         
			//   11   19:ldc1            #52  <String "Attempted to serialize java.lang.Class: ">
			//   12   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   13   24:pop             
					((StringBuilder) (jsonwriter)).append(class1.getName());
			//   14   25:aload_1         
			//   15   26:aload_2         
			//   16   27:invokevirtual   #62  <Method String Class.getName()>
			//   17   30:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   18   33:pop             
					((StringBuilder) (jsonwriter)).append(". Forgot to register a type adapter?");
			//   19   34:aload_1         
			//   20   35:ldc1            #64  <String ". Forgot to register a type adapter?">
			//   21   37:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   22   40:pop             
					throw new UnsupportedOperationException(((StringBuilder) (jsonwriter)).toString());
			//   23   41:new             #31  <Class UnsupportedOperationException>
			//   24   44:dup             
			//   25   45:aload_1         
			//   26   46:invokevirtual   #67  <Method String StringBuilder.toString()>
			//   27   49:invokespecial   #36  <Method void UnsupportedOperationException(String)>
			//   28   52:athrow          
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Class)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #58  <Class Class>
			//    4    6:invokevirtual   #70  <Method void write(JsonWriter, Class)>
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method BitSet read(JsonReader)>
			//    3    5:areturn         
			}

			public BitSet read(JsonReader jsonreader)
			{
				int i;
				Object obj;
				BitSet bitset;
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #31  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #34  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				bitset = new BitSet();
			//    8   16:new             #36  <Class BitSet>
			//    9   19:dup             
			//   10   20:invokespecial   #37  <Method void BitSet()>
			//   11   23:astore          6
				jsonreader.beginArray();
			//   12   25:aload_1         
			//   13   26:invokevirtual   #40  <Method void JsonReader.beginArray()>
				obj = ((Object) (jsonreader.peek()));
			//   14   29:aload_1         
			//   15   30:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
			//   16   33:astore          5
				i = 0;
			//   17   35:iconst_0        
			//   18   36:istore_2        
_L9:
				if(obj == JsonToken.END_ARRAY) goto _L2; else goto _L1
			//   19   37:aload           5
			//   20   39:getstatic       #43  <Field JsonToken JsonToken.END_ARRAY>
			//   21   42:if_acmpeq       217
_L1:
				int j;
				boolean flag;
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
						catch(NoSuchFieldError nosuchfielderror) { }
					//   55  125:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
						}
					//*  56  126:goto            20
						catch(NoSuchFieldError nosuchfielderror1) { }
					//   57  129:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
						}
					//*  58  130:goto            31
						catch(NoSuchFieldError nosuchfielderror2) { }
					//   59  133:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
						}
					//*  60  134:goto            42
						catch(NoSuchFieldError nosuchfielderror3) { }
					//   61  137:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
						}
					//*  62  138:goto            53
						catch(NoSuchFieldError nosuchfielderror4) { }
					//   63  141:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
						}
					//*  64  142:goto            64
						catch(NoSuchFieldError nosuchfielderror5) { }
					//   65  145:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
						}
					//*  66  146:goto            76
						catch(NoSuchFieldError nosuchfielderror6) { }
					//   67  149:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
						}
					//*  68  150:goto            88
						catch(NoSuchFieldError nosuchfielderror7) { }
					//   69  153:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
						}
					//*  70  154:goto            100
						catch(NoSuchFieldError nosuchfielderror8) { }
					//   71  157:astore_0        
						try
						{
							$SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
						}
					//*  72  158:goto            112
						catch(NoSuchFieldError nosuchfielderror9) { }
					//   73  161:astore_0        
					//*  74  162:return          
					}
				}

				j = _cls32..SwitchMap.com.google.gson.stream.JsonToken[((JsonToken) (obj)).ordinal()];
			//   22   45:getstatic       #49  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
			//   23   48:aload           5
			//   24   50:invokevirtual   #53  <Method int JsonToken.ordinal()>
			//   25   53:iaload          
			//   26   54:istore_3        
				flag = true;
			//   27   55:iconst_1        
			//   28   56:istore          4
				j;
			//   29   58:iload_3         
				JVM INSTR tableswitch 1 3: default 84
			//			               1 186
			//			               2 177
			//			               3 118;
			//   30   59:tableswitch     1 3: default 84
			//			               1 186
			//			               2 177
			//			               3 118
				   goto _L3 _L4 _L5 _L6
_L3:
				jsonreader = ((JsonReader) (new StringBuilder()));
			//   31   84:new             #55  <Class StringBuilder>
			//   32   87:dup             
			//   33   88:invokespecial   #56  <Method void StringBuilder()>
			//   34   91:astore_1        
				((StringBuilder) (jsonreader)).append("Invalid bitset value type: ");
			//   35   92:aload_1         
			//   36   93:ldc1            #58  <String "Invalid bitset value type: ">
			//   37   95:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
			//   38   98:pop             
				((StringBuilder) (jsonreader)).append(obj);
			//   39   99:aload_1         
			//   40  100:aload           5
			//   41  102:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
			//   42  105:pop             
				throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
			//   43  106:new             #67  <Class JsonSyntaxException>
			//   44  109:dup             
			//   45  110:aload_1         
			//   46  111:invokevirtual   #71  <Method String StringBuilder.toString()>
			//   47  114:invokespecial   #74  <Method void JsonSyntaxException(String)>
			//   48  117:athrow          
_L6:
				obj = ((Object) (jsonreader.nextString()));
			//   49  118:aload_1         
			//   50  119:invokevirtual   #77  <Method String JsonReader.nextString()>
			//   51  122:astore          5
				int k;
				try
				{
					k = Integer.parseInt(((String) (obj)));
			//   52  124:aload           5
			//   53  126:invokestatic    #83  <Method int Integer.parseInt(String)>
			//   54  129:istore_3        
				}
			//*  55  130:iload_3         
			//*  56  131:ifeq            137
			//*  57  134:goto            193
			//*  58  137:iconst_0        
			//*  59  138:istore          4
			//*  60  140:goto            193
			//*  61  143:new             #55  <Class StringBuilder>
			//*  62  146:dup             
			//*  63  147:invokespecial   #56  <Method void StringBuilder()>
			//*  64  150:astore_1        
			//*  65  151:aload_1         
			//*  66  152:ldc1            #85  <String "Error: Expecting: bitset number value (1, 0), Found: ">
			//*  67  154:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
			//*  68  157:pop             
			//*  69  158:aload_1         
			//*  70  159:aload           5
			//*  71  161:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
			//*  72  164:pop             
			//*  73  165:new             #67  <Class JsonSyntaxException>
			//*  74  168:dup             
			//*  75  169:aload_1         
			//*  76  170:invokevirtual   #71  <Method String StringBuilder.toString()>
			//*  77  173:invokespecial   #74  <Method void JsonSyntaxException(String)>
			//*  78  176:athrow          
			//*  79  177:aload_1         
			//*  80  178:invokevirtual   #89  <Method boolean JsonReader.nextBoolean()>
			//*  81  181:istore          4
			//*  82  183:goto            193
			//*  83  186:aload_1         
			//*  84  187:invokevirtual   #92  <Method int JsonReader.nextInt()>
			//*  85  190:ifeq            137
			//*  86  193:iload           4
			//*  87  195:ifeq            204
			//*  88  198:aload           6
			//*  89  200:iload_2         
			//*  90  201:invokevirtual   #96  <Method void BitSet.set(int)>
			//*  91  204:iload_2         
			//*  92  205:iconst_1        
			//*  93  206:iadd            
			//*  94  207:istore_2        
			//*  95  208:aload_1         
			//*  96  209:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
			//*  97  212:astore          5
			//*  98  214:goto            37
			//*  99  217:aload_1         
			//* 100  218:invokevirtual   #99  <Method void JsonReader.endArray()>
			//* 101  221:aload           6
			//* 102  223:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
				{
					jsonreader = ((JsonReader) (new StringBuilder()));
					((StringBuilder) (jsonreader)).append("Error: Expecting: bitset number value (1, 0), Found: ");
					((StringBuilder) (jsonreader)).append(((String) (obj)));
					throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
				}
				if(k == 0) goto _L8; else goto _L7
_L8:
				flag = false;
				break; /* Loop/switch isn't completed */
_L5:
				flag = jsonreader.nextBoolean();
				break; /* Loop/switch isn't completed */
_L4:
				if(jsonreader.nextInt() == 0) goto _L8; else goto _L7
_L7:
				if(flag)
					bitset.set(i);
				i++;
				obj = ((Object) (jsonreader.peek()));
				  goto _L9
_L2:
				jsonreader.endArray();
				return bitset;
			//* 103  224:astore_1        
			//* 104  225:goto            143
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (BitSet)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #36  <Class BitSet>
			//    4    6:invokevirtual   #104 <Method void write(JsonWriter, BitSet)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, BitSet bitset)
			{
				throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
			//    0    0:new             #106 <Class RuntimeException>
			//    1    3:dup             
			//    2    4:ldc1            #108 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
			//    3    6:invokespecial   #111 <Method void Runtime(String)>
			//    4    9:athrow          
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
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				if(jsonreader.peek() == JsonToken.STRING)
			//*   8   16:aload_1         
			//*   9   17:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
			//*  10   20:getstatic       #32  <Field JsonToken JsonToken.STRING>
			//*  11   23:if_acmpne       37
					return Boolean.valueOf(Boolean.parseBoolean(jsonreader.nextString()));
			//   12   26:aload_1         
			//   13   27:invokevirtual   #36  <Method String JsonReader.nextString()>
			//   14   30:invokestatic    #42  <Method boolean Boolean.parseBoolean(String)>
			//   15   33:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
			//   16   36:areturn         
				else
					return Boolean.valueOf(jsonreader.nextBoolean());
			//   17   37:aload_1         
			//   18   38:invokevirtual   #50  <Method boolean JsonReader.nextBoolean()>
			//   19   41:invokestatic    #46  <Method Boolean Boolean.valueOf(boolean)>
			//   20   44:areturn         
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #53  <Method Boolean read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Boolean boolean1)
			{
				if(boolean1 == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #61  <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				} else
				{
					jsonwriter.value(boolean1.booleanValue());
			//    6   10:aload_1         
			//    7   11:aload_2         
			//    8   12:invokevirtual   #64  <Method boolean Boolean.booleanValue()>
			//    9   15:invokevirtual   #68  <Method JsonWriter JsonWriter.value(boolean)>
			//   10   18:pop             
					return;
			//   11   19:return          
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #38  <Class Boolean>
			//    4    6:invokevirtual   #71  <Method void write(JsonWriter, Boolean)>
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
				byte byte0;
				try
				{
					byte0 = (byte)jsonreader.nextInt();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #35  <Method int JsonReader.nextInt()>
			//   10   20:int2byte        
			//   11   21:istore_2        
				}
			//*  12   22:iload_2         
			//*  13   23:invokestatic    #41  <Method Byte Byte.valueOf(byte)>
			//*  14   26:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  15   27:astore_1        
				{
					throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//   16   28:new             #43  <Class JsonSyntaxException>
			//   17   31:dup             
			//   18   32:aload_1         
			//   19   33:invokespecial   #46  <Method void JsonSyntaxException(Throwable)>
			//   20   36:athrow          
				}
				return ((Number) (Byte.valueOf(byte0)));
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #49  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #57  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #60  <Class Number>
			//    4    6:invokevirtual   #62  <Method void write(JsonWriter, Number)>
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
				short word0;
				try
				{
					word0 = (short)jsonreader.nextInt();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #35  <Method int JsonReader.nextInt()>
			//   10   20:int2short       
			//   11   21:istore_2        
				}
			//*  12   22:iload_2         
			//*  13   23:invokestatic    #41  <Method Short Short.valueOf(short)>
			//*  14   26:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  15   27:astore_1        
				{
					throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//   16   28:new             #43  <Class JsonSyntaxException>
			//   17   31:dup             
			//   18   32:aload_1         
			//   19   33:invokespecial   #46  <Method void JsonSyntaxException(Throwable)>
			//   20   36:athrow          
				}
				return ((Number) (Short.valueOf(word0)));
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #49  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #57  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #60  <Class Number>
			//    4    6:invokevirtual   #62  <Method void write(JsonWriter, Number)>
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
				int i;
				try
				{
					i = jsonreader.nextInt();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #35  <Method int JsonReader.nextInt()>
			//   10   20:istore_2        
				}
			//*  11   21:iload_2         
			//*  12   22:invokestatic    #41  <Method Integer Integer.valueOf(int)>
			//*  13   25:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  14   26:astore_1        
				{
					throw new JsonSyntaxException(((Throwable) (jsonreader)));
			//   15   27:new             #43  <Class JsonSyntaxException>
			//   16   30:dup             
			//   17   31:aload_1         
			//   18   32:invokespecial   #46  <Method void JsonSyntaxException(Throwable)>
			//   19   35:athrow          
				}
				return ((Number) (Integer.valueOf(i)));
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #49  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #57  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #60  <Class Number>
			//    4    6:invokevirtual   #62  <Method void write(JsonWriter, Number)>
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
			{
				JsonToken jsontoken = jsonreader.peek();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
			//    2    4:astore_3        
				int i = _cls32..SwitchMap.com.google.gson.stream.JsonToken[jsontoken.ordinal()];
			//    3    5:getstatic       #26  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
			//    4    8:aload_3         
			//    5    9:invokevirtual   #32  <Method int JsonToken.ordinal()>
			//    6   12:iaload          
			//    7   13:istore_2        
				if(i != 1)
			//*   8   14:iload_2         
			//*   9   15:iconst_1        
			//*  10   16:icmpeq          63
				{
					if(i != 4)
			//*  11   19:iload_2         
			//*  12   20:iconst_4        
			//*  13   21:icmpeq          57
					{
						jsonreader = ((JsonReader) (new StringBuilder()));
			//   14   24:new             #34  <Class StringBuilder>
			//   15   27:dup             
			//   16   28:invokespecial   #35  <Method void StringBuilder()>
			//   17   31:astore_1        
						((StringBuilder) (jsonreader)).append("Expecting number, got: ");
			//   18   32:aload_1         
			//   19   33:ldc1            #37  <String "Expecting number, got: ">
			//   20   35:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
			//   21   38:pop             
						((StringBuilder) (jsonreader)).append(((Object) (jsontoken)));
			//   22   39:aload_1         
			//   23   40:aload_3         
			//   24   41:invokevirtual   #44  <Method StringBuilder StringBuilder.append(Object)>
			//   25   44:pop             
						throw new JsonSyntaxException(((StringBuilder) (jsonreader)).toString());
			//   26   45:new             #46  <Class JsonSyntaxException>
			//   27   48:dup             
			//   28   49:aload_1         
			//   29   50:invokevirtual   #50  <Method String StringBuilder.toString()>
			//   30   53:invokespecial   #53  <Method void JsonSyntaxException(String)>
			//   31   56:athrow          
					} else
					{
						jsonreader.nextNull();
			//   32   57:aload_1         
			//   33   58:invokevirtual   #56  <Method void JsonReader.nextNull()>
						return null;
			//   34   61:aconst_null     
			//   35   62:areturn         
					}
				} else
				{
					return ((Number) (new LazilyParsedNumber(jsonreader.nextString())));
			//   36   63:new             #58  <Class LazilyParsedNumber>
			//   37   66:dup             
			//   38   67:aload_1         
			//   39   68:invokevirtual   #61  <Method String JsonReader.nextString()>
			//   40   71:invokespecial   #62  <Method void LazilyParsedNumber(String)>
			//   41   74:areturn         
				}
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #65  <Method Number read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Number number)
			{
				jsonwriter.value(number);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #73  <Method JsonWriter JsonWriter.value(Number)>
			//    3    5:pop             
			//    4    6:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Number)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #76  <Class Number>
			//    4    6:invokevirtual   #78  <Method void write(JsonWriter, Number)>
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
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #20  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #26  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #29  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #33  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
				if(((String) (jsonreader)).length() != 1)
			//*  11   21:aload_1         
			//*  12   22:invokevirtual   #39  <Method int String.length()>
			//*  13   25:iconst_1        
			//*  14   26:icmpeq          62
				{
					StringBuilder stringbuilder = new StringBuilder();
			//   15   29:new             #41  <Class StringBuilder>
			//   16   32:dup             
			//   17   33:invokespecial   #42  <Method void StringBuilder()>
			//   18   36:astore_2        
					stringbuilder.append("Expecting character, got: ");
			//   19   37:aload_2         
			//   20   38:ldc1            #44  <String "Expecting character, got: ">
			//   21   40:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   22   43:pop             
					stringbuilder.append(((String) (jsonreader)));
			//   23   44:aload_2         
			//   24   45:aload_1         
			//   25   46:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
			//   26   49:pop             
					throw new JsonSyntaxException(stringbuilder.toString());
			//   27   50:new             #50  <Class JsonSyntaxException>
			//   28   53:dup             
			//   29   54:aload_2         
			//   30   55:invokevirtual   #53  <Method String StringBuilder.toString()>
			//   31   58:invokespecial   #56  <Method void JsonSyntaxException(String)>
			//   32   61:athrow          
				} else
				{
					return Character.valueOf(((String) (jsonreader)).charAt(0));
			//   33   62:aload_1         
			//   34   63:iconst_0        
			//   35   64:invokevirtual   #60  <Method char String.charAt(int)>
			//   36   67:invokestatic    #66  <Method Character Character.valueOf(char)>
			//   37   70:areturn         
				}
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #69  <Method Character read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, Character character)
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
			//    6   10:invokestatic    #74  <Method String String.valueOf(Object)>
			//    7   13:astore_2        
				jsonwriter.value(((String) (character)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #80  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Character)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #62  <Class Character>
			//    4    6:invokevirtual   #83  <Method void write(JsonWriter, Character)>
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method String read(JsonReader)>
			//    3    5:areturn         
			}

			public String read(JsonReader jsonreader)
			{
				JsonToken jsontoken = jsonreader.peek();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
			//    2    4:astore_2        
				if(jsontoken == JsonToken.NULL)
			//*   3    5:aload_2         
			//*   4    6:getstatic       #29  <Field JsonToken JsonToken.NULL>
			//*   5    9:if_acmpne       18
				{
					jsonreader.nextNull();
			//    6   12:aload_1         
			//    7   13:invokevirtual   #32  <Method void JsonReader.nextNull()>
					return null;
			//    8   16:aconst_null     
			//    9   17:areturn         
				}
				if(jsontoken == JsonToken.BOOLEAN)
			//*  10   18:aload_2         
			//*  11   19:getstatic       #35  <Field JsonToken JsonToken.BOOLEAN>
			//*  12   22:if_acmpne       33
					return Boolean.toString(jsonreader.nextBoolean());
			//   13   25:aload_1         
			//   14   26:invokevirtual   #39  <Method boolean JsonReader.nextBoolean()>
			//   15   29:invokestatic    #45  <Method String Boolean.toString(boolean)>
			//   16   32:areturn         
				else
					return jsonreader.nextString();
			//   17   33:aload_1         
			//   18   34:invokevirtual   #49  <Method String JsonReader.nextString()>
			//   19   37:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (String)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #53  <Class String>
			//    4    6:invokevirtual   #56  <Method void write(JsonWriter, String)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, String s)
			{
				jsonwriter.value(s);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #62  <Method JsonWriter JsonWriter.value(String)>
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method StringBuilder read(JsonReader)>
			//    3    5:areturn         
			}

			public StringBuilder read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #29  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #32  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return new StringBuilder(jsonreader.nextString());
			//    8   16:new             #34  <Class StringBuilder>
			//    9   19:dup             
			//   10   20:aload_1         
			//   11   21:invokevirtual   #38  <Method String JsonReader.nextString()>
			//   12   24:invokespecial   #41  <Method void StringBuilder(String)>
			//   13   27:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (StringBuilder)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #34  <Class StringBuilder>
			//    4    6:invokevirtual   #46  <Method void write(JsonWriter, StringBuilder)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, StringBuilder stringbuilder)
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
			//    6   10:invokevirtual   #49  <Method String StringBuilder.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (stringbuilder)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method StringBuffer read(JsonReader)>
			//    3    5:areturn         
			}

			public StringBuffer read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #29  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #32  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return new StringBuffer(jsonreader.nextString());
			//    8   16:new             #34  <Class StringBuffer>
			//    9   19:dup             
			//   10   20:aload_1         
			//   11   21:invokevirtual   #38  <Method String JsonReader.nextString()>
			//   12   24:invokespecial   #41  <Method void StringBuffer(String)>
			//   13   27:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (StringBuffer)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #34  <Class StringBuffer>
			//    4    6:invokevirtual   #46  <Method void write(JsonWriter, StringBuffer)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, StringBuffer stringbuffer)
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
			//    6   10:invokevirtual   #49  <Method String StringBuffer.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (stringbuffer)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #55  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method URL read(JsonReader)>
			//    3    5:areturn         
			}

			public URL read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #29  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #32  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #36  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
				if("null".equals(((Object) (jsonreader))))
			//*  11   21:ldc1            #38  <String "null">
			//*  12   23:aload_1         
			//*  13   24:invokevirtual   #44  <Method boolean String.equals(Object)>
			//*  14   27:ifeq            32
					return null;
			//   15   30:aconst_null     
			//   16   31:areturn         
				else
					return new URL(((String) (jsonreader)));
			//   17   32:new             #46  <Class URL>
			//   18   35:dup             
			//   19   36:aload_1         
			//   20   37:invokespecial   #49  <Method void URL(String)>
			//   21   40:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (URL)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #46  <Class URL>
			//    4    6:invokevirtual   #54  <Method void write(JsonWriter, URL)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, URL url)
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
			//    6   10:invokevirtual   #57  <Method String URL.toExternalForm()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (url)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #63  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method URI read(JsonReader)>
			//    3    5:areturn         
			}

			public URI read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #25  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #31  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #34  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader = ((JsonReader) (jsonreader.nextString()));
			//    8   16:aload_1         
			//    9   17:invokevirtual   #38  <Method String JsonReader.nextString()>
			//   10   20:astore_1        
				if("null".equals(((Object) (jsonreader))))
			//*  11   21:ldc1            #40  <String "null">
			//*  12   23:aload_1         
			//*  13   24:invokevirtual   #46  <Method boolean String.equals(Object)>
			//*  14   27:ifeq            32
					return null;
			//   15   30:aconst_null     
			//   16   31:areturn         
				try
				{
					jsonreader = ((JsonReader) (new URI(((String) (jsonreader)))));
			//   17   32:new             #48  <Class URI>
			//   18   35:dup             
			//   19   36:aload_1         
			//   20   37:invokespecial   #51  <Method void URI(String)>
			//   21   40:astore_1        
				}
			//*  22   41:aload_1         
			//*  23   42:areturn         
				// Misplaced declaration of an exception variable
				catch(JsonReader jsonreader)
			//*  24   43:astore_1        
				{
					throw new JsonIOException(((Throwable) (jsonreader)));
			//   25   44:new             #53  <Class JsonIOException>
			//   26   47:dup             
			//   27   48:aload_1         
			//   28   49:invokespecial   #56  <Method void JsonIOException(Throwable)>
			//   29   52:athrow          
				}
				return ((URI) (jsonreader));
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (URI)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #48  <Class URI>
			//    4    6:invokevirtual   #61  <Method void write(JsonWriter, URI)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, URI uri)
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
			//    6   10:invokevirtual   #64  <Method String URI.toASCIIString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (uri)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #70  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method InetAddress read(JsonReader)>
			//    3    5:areturn         
			}

			public InetAddress read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #29  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #32  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return InetAddress.getByName(jsonreader.nextString());
			//    8   16:aload_1         
			//    9   17:invokevirtual   #36  <Method String JsonReader.nextString()>
			//   10   20:invokestatic    #42  <Method InetAddress InetAddress.getByName(String)>
			//   11   23:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (InetAddress)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #38  <Class InetAddress>
			//    4    6:invokevirtual   #47  <Method void write(JsonWriter, InetAddress)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, InetAddress inetaddress)
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
			//    6   10:invokevirtual   #50  <Method String InetAddress.getHostAddress()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (inetaddress)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #56  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method UUID read(JsonReader)>
			//    3    5:areturn         
			}

			public UUID read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #29  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #32  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				} else
				{
					return java.util.UUID.fromString(jsonreader.nextString());
			//    8   16:aload_1         
			//    9   17:invokevirtual   #36  <Method String JsonReader.nextString()>
			//   10   20:invokestatic    #42  <Method UUID UUID.fromString(String)>
			//   11   23:areturn         
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (UUID)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #38  <Class UUID>
			//    4    6:invokevirtual   #47  <Method void write(JsonWriter, UUID)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, UUID uuid)
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
			//    6   10:invokevirtual   #50  <Method String UUID.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (uuid)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #56  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #36  <Method Calendar read(JsonReader)>
			//    3    5:areturn         
			}

			public Calendar read(JsonReader jsonreader)
			{
				if(jsonreader.peek() == JsonToken.NULL)
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #42  <Method JsonToken JsonReader.peek()>
			//*   2    4:getstatic       #48  <Field JsonToken JsonToken.NULL>
			//*   3    7:if_acmpne       16
				{
					jsonreader.nextNull();
			//    4   10:aload_1         
			//    5   11:invokevirtual   #51  <Method void JsonReader.nextNull()>
					return null;
			//    6   14:aconst_null     
			//    7   15:areturn         
				}
				jsonreader.beginObject();
			//    8   16:aload_1         
			//    9   17:invokevirtual   #54  <Method void JsonReader.beginObject()>
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
			//   23   38:invokevirtual   #42  <Method JsonToken JsonReader.peek()>
			//   24   41:getstatic       #57  <Field JsonToken JsonToken.END_OBJECT>
			//   25   44:if_acmpeq       153
					String s = jsonreader.nextName();
			//   26   47:aload_1         
			//   27   48:invokevirtual   #61  <Method String JsonReader.nextName()>
			//   28   51:astore          9
					int i = jsonreader.nextInt();
			//   29   53:aload_1         
			//   30   54:invokevirtual   #65  <Method int JsonReader.nextInt()>
			//   31   57:istore_2        
					if("year".equals(((Object) (s))))
			//*  32   58:ldc1            #26  <String "year">
			//*  33   60:aload           9
			//*  34   62:invokevirtual   #71  <Method boolean String.equals(Object)>
			//*  35   65:ifeq            74
						k1 = i;
			//   36   68:iload_2         
			//   37   69:istore          8
					else
			//*  38   71:goto            37
					if("month".equals(((Object) (s))))
			//*  39   74:ldc1            #20  <String "month">
			//*  40   76:aload           9
			//*  41   78:invokevirtual   #71  <Method boolean String.equals(Object)>
			//*  42   81:ifeq            90
						j1 = i;
			//   43   84:iload_2         
			//   44   85:istore          7
					else
			//*  45   87:goto            37
					if("dayOfMonth".equals(((Object) (s))))
			//*  46   90:ldc1            #11  <String "dayOfMonth">
			//*  47   92:aload           9
			//*  48   94:invokevirtual   #71  <Method boolean String.equals(Object)>
			//*  49   97:ifeq            106
						i1 = i;
			//   50  100:iload_2         
			//   51  101:istore          6
					else
			//*  52  103:goto            37
					if("hourOfDay".equals(((Object) (s))))
			//*  53  106:ldc1            #14  <String "hourOfDay">
			//*  54  108:aload           9
			//*  55  110:invokevirtual   #71  <Method boolean String.equals(Object)>
			//*  56  113:ifeq            122
						l = i;
			//   57  116:iload_2         
			//   58  117:istore          5
					else
			//*  59  119:goto            37
					if("minute".equals(((Object) (s))))
			//*  60  122:ldc1            #17  <String "minute">
			//*  61  124:aload           9
			//*  62  126:invokevirtual   #71  <Method boolean String.equals(Object)>
			//*  63  129:ifeq            138
						k = i;
			//   64  132:iload_2         
			//   65  133:istore          4
					else
			//*  66  135:goto            37
					if("second".equals(((Object) (s))))
			//*  67  138:ldc1            #23  <String "second">
			//*  68  140:aload           9
			//*  69  142:invokevirtual   #71  <Method boolean String.equals(Object)>
			//*  70  145:ifeq            37
						j = i;
			//   71  148:iload_2         
			//   72  149:istore_3        
				} while(true);
			//   73  150:goto            37
				jsonreader.endObject();
			//   74  153:aload_1         
			//   75  154:invokevirtual   #74  <Method void JsonReader.endObject()>
				return ((Calendar) (new GregorianCalendar(k1, j1, i1, l, k, j)));
			//   76  157:new             #76  <Class GregorianCalendar>
			//   77  160:dup             
			//   78  161:iload           8
			//   79  163:iload           7
			//   80  165:iload           6
			//   81  167:iload           5
			//   82  169:iload           4
			//   83  171:iload_3         
			//   84  172:invokespecial   #79  <Method void GregorianCalendar(int, int, int, int, int, int)>
			//   85  175:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Calendar)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #83  <Class Calendar>
			//    4    6:invokevirtual   #86  <Method void write(JsonWriter, Calendar)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, Calendar calendar)
			{
				if(calendar == null)
			//*   0    0:aload_2         
			//*   1    1:ifnonnull       10
				{
					jsonwriter.nullValue();
			//    2    4:aload_1         
			//    3    5:invokevirtual   #92  <Method JsonWriter JsonWriter.nullValue()>
			//    4    8:pop             
					return;
			//    5    9:return          
				} else
				{
					jsonwriter.beginObject();
			//    6   10:aload_1         
			//    7   11:invokevirtual   #94  <Method JsonWriter JsonWriter.beginObject()>
			//    8   14:pop             
					jsonwriter.name("year");
			//    9   15:aload_1         
			//   10   16:ldc1            #26  <String "year">
			//   11   18:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
			//   12   21:pop             
					jsonwriter.value(calendar.get(1));
			//   13   22:aload_1         
			//   14   23:aload_2         
			//   15   24:iconst_1        
			//   16   25:invokevirtual   #102 <Method int Calendar.get(int)>
			//   17   28:i2l             
			//   18   29:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
			//   19   32:pop             
					jsonwriter.name("month");
			//   20   33:aload_1         
			//   21   34:ldc1            #20  <String "month">
			//   22   36:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
			//   23   39:pop             
					jsonwriter.value(calendar.get(2));
			//   24   40:aload_1         
			//   25   41:aload_2         
			//   26   42:iconst_2        
			//   27   43:invokevirtual   #102 <Method int Calendar.get(int)>
			//   28   46:i2l             
			//   29   47:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
			//   30   50:pop             
					jsonwriter.name("dayOfMonth");
			//   31   51:aload_1         
			//   32   52:ldc1            #11  <String "dayOfMonth">
			//   33   54:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
			//   34   57:pop             
					jsonwriter.value(calendar.get(5));
			//   35   58:aload_1         
			//   36   59:aload_2         
			//   37   60:iconst_5        
			//   38   61:invokevirtual   #102 <Method int Calendar.get(int)>
			//   39   64:i2l             
			//   40   65:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
			//   41   68:pop             
					jsonwriter.name("hourOfDay");
			//   42   69:aload_1         
			//   43   70:ldc1            #14  <String "hourOfDay">
			//   44   72:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
			//   45   75:pop             
					jsonwriter.value(calendar.get(11));
			//   46   76:aload_1         
			//   47   77:aload_2         
			//   48   78:bipush          11
			//   49   80:invokevirtual   #102 <Method int Calendar.get(int)>
			//   50   83:i2l             
			//   51   84:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
			//   52   87:pop             
					jsonwriter.name("minute");
			//   53   88:aload_1         
			//   54   89:ldc1            #17  <String "minute">
			//   55   91:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
			//   56   94:pop             
					jsonwriter.value(calendar.get(12));
			//   57   95:aload_1         
			//   58   96:aload_2         
			//   59   97:bipush          12
			//   60   99:invokevirtual   #102 <Method int Calendar.get(int)>
			//   61  102:i2l             
			//   62  103:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
			//   63  106:pop             
					jsonwriter.name("second");
			//   64  107:aload_1         
			//   65  108:ldc1            #23  <String "second">
			//   66  110:invokevirtual   #98  <Method JsonWriter JsonWriter.name(String)>
			//   67  113:pop             
					jsonwriter.value(calendar.get(13));
			//   68  114:aload_1         
			//   69  115:aload_2         
			//   70  116:bipush          13
			//   71  118:invokevirtual   #102 <Method int Calendar.get(int)>
			//   72  121:i2l             
			//   73  122:invokevirtual   #106 <Method JsonWriter JsonWriter.value(long)>
			//   74  125:pop             
					jsonwriter.endObject();
			//   75  126:aload_1         
			//   76  127:invokevirtual   #108 <Method JsonWriter JsonWriter.endObject()>
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
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #17  <Method Locale read(JsonReader)>
			//    3    5:areturn         
			}

			public Locale read(JsonReader jsonreader)
			{
				Object obj = ((Object) (jsonreader.peek()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #23  <Method JsonToken JsonReader.peek()>
			//    2    4:astore_2        
				Object obj1 = ((Object) (JsonToken.NULL));
			//    3    5:getstatic       #29  <Field JsonToken JsonToken.NULL>
			//    4    8:astore          4
				String s = null;
			//    5   10:aconst_null     
			//    6   11:astore_3        
				if(obj == obj1)
			//*   7   12:aload_2         
			//*   8   13:aload           4
			//*   9   15:if_acmpne       24
				{
					jsonreader.nextNull();
			//   10   18:aload_1         
			//   11   19:invokevirtual   #32  <Method void JsonReader.nextNull()>
					return null;
			//   12   22:aconst_null     
			//   13   23:areturn         
				}
				obj1 = ((Object) (new StringTokenizer(jsonreader.nextString(), "_")));
			//   14   24:new             #34  <Class StringTokenizer>
			//   15   27:dup             
			//   16   28:aload_1         
			//   17   29:invokevirtual   #38  <Method String JsonReader.nextString()>
			//   18   32:ldc1            #40  <String "_">
			//   19   34:invokespecial   #43  <Method void StringTokenizer(String, String)>
			//   20   37:astore          4
				if(((StringTokenizer) (obj1)).hasMoreElements())
			//*  21   39:aload           4
			//*  22   41:invokevirtual   #47  <Method boolean StringTokenizer.hasMoreElements()>
			//*  23   44:ifeq            56
					jsonreader = ((JsonReader) (((StringTokenizer) (obj1)).nextToken()));
			//   24   47:aload           4
			//   25   49:invokevirtual   #50  <Method String StringTokenizer.nextToken()>
			//   26   52:astore_1        
				else
			//*  27   53:goto            58
					jsonreader = null;
			//   28   56:aconst_null     
			//   29   57:astore_1        
				if(((StringTokenizer) (obj1)).hasMoreElements())
			//*  30   58:aload           4
			//*  31   60:invokevirtual   #47  <Method boolean StringTokenizer.hasMoreElements()>
			//*  32   63:ifeq            75
					obj = ((Object) (((StringTokenizer) (obj1)).nextToken()));
			//   33   66:aload           4
			//   34   68:invokevirtual   #50  <Method String StringTokenizer.nextToken()>
			//   35   71:astore_2        
				else
			//*  36   72:goto            77
					obj = null;
			//   37   75:aconst_null     
			//   38   76:astore_2        
				if(((StringTokenizer) (obj1)).hasMoreElements())
			//*  39   77:aload           4
			//*  40   79:invokevirtual   #47  <Method boolean StringTokenizer.hasMoreElements()>
			//*  41   82:ifeq            91
					s = ((StringTokenizer) (obj1)).nextToken();
			//   42   85:aload           4
			//   43   87:invokevirtual   #50  <Method String StringTokenizer.nextToken()>
			//   44   90:astore_3        
				if(obj == null && s == null)
			//*  45   91:aload_2         
			//*  46   92:ifnonnull       108
			//*  47   95:aload_3         
			//*  48   96:ifnonnull       108
					return new Locale(((String) (jsonreader)));
			//   49   99:new             #52  <Class Locale>
			//   50  102:dup             
			//   51  103:aload_1         
			//   52  104:invokespecial   #55  <Method void Locale(String)>
			//   53  107:areturn         
				if(s == null)
			//*  54  108:aload_3         
			//*  55  109:ifnonnull       122
					return new Locale(((String) (jsonreader)), ((String) (obj)));
			//   56  112:new             #52  <Class Locale>
			//   57  115:dup             
			//   58  116:aload_1         
			//   59  117:aload_2         
			//   60  118:invokespecial   #56  <Method void Locale(String, String)>
			//   61  121:areturn         
				else
					return new Locale(((String) (jsonreader)), ((String) (obj)), s);
			//   62  122:new             #52  <Class Locale>
			//   63  125:dup             
			//   64  126:aload_1         
			//   65  127:aload_2         
			//   66  128:aload_3         
			//   67  129:invokespecial   #59  <Method void Locale(String, String, String)>
			//   68  132:areturn         
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (Locale)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #52  <Class Locale>
			//    4    6:invokevirtual   #64  <Method void write(JsonWriter, Locale)>
			//    5    9:return          
			}

			public void write(JsonWriter jsonwriter, Locale locale)
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
			//    6   10:invokevirtual   #67  <Method String Locale.toString()>
			//    7   13:astore_2        
				jsonwriter.value(((String) (locale)));
			//    8   14:aload_1         
			//    9   15:aload_2         
			//   10   16:invokevirtual   #73  <Method JsonWriter JsonWriter.value(String)>
			//   11   19:pop             
			//   12   20:return          
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
			{
				switch(_cls32..SwitchMap.com.google.gson.stream.JsonToken[jsonreader.peek().ordinal()])
			//*   0    0:getstatic       #20  <Field int[] TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken>
			//*   1    3:aload_1         
			//*   2    4:invokevirtual   #26  <Method JsonToken JsonReader.peek()>
			//*   3    7:invokevirtual   #32  <Method int JsonToken.ordinal()>
			//*   4   10:iaload          
				{
			//*   5   11:tableswitch     1 6: default 48
			//			               1 169
			//			               2 154
			//			               3 142
			//			               4 134
			//			               5 97
			//			               6 56
				default:
					throw new IllegalArgumentException();
			//    6   48:new             #34  <Class IllegalArgumentException>
			//    7   51:dup             
			//    8   52:invokespecial   #35  <Method void IllegalArgumentException()>
			//    9   55:athrow          

				case 6: // '\006'
					JsonObject jsonobject = new JsonObject();
			//   10   56:new             #37  <Class JsonObject>
			//   11   59:dup             
			//   12   60:invokespecial   #38  <Method void JsonObject()>
			//   13   63:astore_2        
					jsonreader.beginObject();
			//   14   64:aload_1         
			//   15   65:invokevirtual   #41  <Method void JsonReader.beginObject()>
					for(; jsonreader.hasNext(); jsonobject.add(jsonreader.nextName(), read(jsonreader)));
			//   16   68:aload_1         
			//   17   69:invokevirtual   #45  <Method boolean JsonReader.hasNext()>
			//   18   72:ifeq            91
			//   19   75:aload_2         
			//   20   76:aload_1         
			//   21   77:invokevirtual   #49  <Method String JsonReader.nextName()>
			//   22   80:aload_0         
			//   23   81:aload_1         
			//   24   82:invokevirtual   #51  <Method JsonElement read(JsonReader)>
			//   25   85:invokevirtual   #55  <Method void JsonObject.add(String, JsonElement)>
			//*  26   88:goto            68
					jsonreader.endObject();
			//   27   91:aload_1         
			//   28   92:invokevirtual   #58  <Method void JsonReader.endObject()>
					return ((JsonElement) (jsonobject));
			//   29   95:aload_2         
			//   30   96:areturn         

				case 5: // '\005'
					JsonArray jsonarray = new JsonArray();
			//   31   97:new             #60  <Class JsonArray>
			//   32  100:dup             
			//   33  101:invokespecial   #61  <Method void JsonArray()>
			//   34  104:astore_2        
					jsonreader.beginArray();
			//   35  105:aload_1         
			//   36  106:invokevirtual   #64  <Method void JsonReader.beginArray()>
					for(; jsonreader.hasNext(); jsonarray.add(read(jsonreader)));
			//   37  109:aload_1         
			//   38  110:invokevirtual   #45  <Method boolean JsonReader.hasNext()>
			//   39  113:ifeq            128
			//   40  116:aload_2         
			//   41  117:aload_0         
			//   42  118:aload_1         
			//   43  119:invokevirtual   #51  <Method JsonElement read(JsonReader)>
			//   44  122:invokevirtual   #67  <Method void JsonArray.add(JsonElement)>
			//*  45  125:goto            109
					jsonreader.endArray();
			//   46  128:aload_1         
			//   47  129:invokevirtual   #70  <Method void JsonReader.endArray()>
					return ((JsonElement) (jsonarray));
			//   48  132:aload_2         
			//   49  133:areturn         

				case 4: // '\004'
					jsonreader.nextNull();
			//   50  134:aload_1         
			//   51  135:invokevirtual   #73  <Method void JsonReader.nextNull()>
					return ((JsonElement) (JsonNull.INSTANCE));
			//   52  138:getstatic       #79  <Field JsonNull JsonNull.INSTANCE>
			//   53  141:areturn         

				case 3: // '\003'
					return ((JsonElement) (new JsonPrimitive(jsonreader.nextString())));
			//   54  142:new             #81  <Class JsonPrimitive>
			//   55  145:dup             
			//   56  146:aload_1         
			//   57  147:invokevirtual   #84  <Method String JsonReader.nextString()>
			//   58  150:invokespecial   #87  <Method void JsonPrimitive(String)>
			//   59  153:areturn         

				case 2: // '\002'
					return ((JsonElement) (new JsonPrimitive(Boolean.valueOf(jsonreader.nextBoolean()))));
			//   60  154:new             #81  <Class JsonPrimitive>
			//   61  157:dup             
			//   62  158:aload_1         
			//   63  159:invokevirtual   #90  <Method boolean JsonReader.nextBoolean()>
			//   64  162:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
			//   65  165:invokespecial   #99  <Method void JsonPrimitive(Boolean)>
			//   66  168:areturn         

				case 1: // '\001'
					return ((JsonElement) (new JsonPrimitive(((Number) (new LazilyParsedNumber(jsonreader.nextString()))))));
			//   67  169:new             #81  <Class JsonPrimitive>
			//   68  172:dup             
			//   69  173:new             #101 <Class LazilyParsedNumber>
			//   70  176:dup             
			//   71  177:aload_1         
			//   72  178:invokevirtual   #84  <Method String JsonReader.nextString()>
			//   73  181:invokespecial   #102 <Method void LazilyParsedNumber(String)>
			//   74  184:invokespecial   #105 <Method void JsonPrimitive(Number)>
			//   75  187:areturn         
				}
			}

			public volatile Object read(JsonReader jsonreader)
			{
				return ((Object) (read(jsonreader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #51  <Method JsonElement read(JsonReader)>
			//    3    5:areturn         
			}

			public void write(JsonWriter jsonwriter, JsonElement jsonelement)
			{
				if(jsonelement != null && !jsonelement.isJsonNull())
			//*   0    0:aload_2         
			//*   1    1:ifnull          239
			//*   2    4:aload_2         
			//*   3    5:invokevirtual   #113 <Method boolean JsonElement.isJsonNull()>
			//*   4    8:ifeq            14
			//*   5   11:goto            239
				{
					if(jsonelement.isJsonPrimitive())
			//*   6   14:aload_2         
			//*   7   15:invokevirtual   #116 <Method boolean JsonElement.isJsonPrimitive()>
			//*   8   18:ifeq            70
					{
						jsonelement = ((JsonElement) (jsonelement.getAsJsonPrimitive()));
			//    9   21:aload_2         
			//   10   22:invokevirtual   #120 <Method JsonPrimitive JsonElement.getAsJsonPrimitive()>
			//   11   25:astore_2        
						if(((JsonPrimitive) (jsonelement)).isNumber())
			//*  12   26:aload_2         
			//*  13   27:invokevirtual   #123 <Method boolean JsonPrimitive.isNumber()>
			//*  14   30:ifeq            43
						{
							jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsNumber());
			//   15   33:aload_1         
			//   16   34:aload_2         
			//   17   35:invokevirtual   #127 <Method Number JsonPrimitive.getAsNumber()>
			//   18   38:invokevirtual   #133 <Method JsonWriter JsonWriter.value(Number)>
			//   19   41:pop             
							return;
			//   20   42:return          
						}
						if(((JsonPrimitive) (jsonelement)).isBoolean())
			//*  21   43:aload_2         
			//*  22   44:invokevirtual   #136 <Method boolean JsonPrimitive.isBoolean()>
			//*  23   47:ifeq            60
						{
							jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsBoolean());
			//   24   50:aload_1         
			//   25   51:aload_2         
			//   26   52:invokevirtual   #139 <Method boolean JsonPrimitive.getAsBoolean()>
			//   27   55:invokevirtual   #142 <Method JsonWriter JsonWriter.value(boolean)>
			//   28   58:pop             
							return;
			//   29   59:return          
						} else
						{
							jsonwriter.value(((JsonPrimitive) (jsonelement)).getAsString());
			//   30   60:aload_1         
			//   31   61:aload_2         
			//   32   62:invokevirtual   #145 <Method String JsonPrimitive.getAsString()>
			//   33   65:invokevirtual   #148 <Method JsonWriter JsonWriter.value(String)>
			//   34   68:pop             
							return;
			//   35   69:return          
						}
					}
					if(jsonelement.isJsonArray())
			//*  36   70:aload_2         
			//*  37   71:invokevirtual   #151 <Method boolean JsonElement.isJsonArray()>
			//*  38   74:ifeq            122
					{
						jsonwriter.beginArray();
			//   39   77:aload_1         
			//   40   78:invokevirtual   #154 <Method JsonWriter JsonWriter.beginArray()>
			//   41   81:pop             
						for(jsonelement = ((JsonElement) (jsonelement.getAsJsonArray().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)((Iterator) (jsonelement)).next()));
			//   42   82:aload_2         
			//   43   83:invokevirtual   #158 <Method JsonArray JsonElement.getAsJsonArray()>
			//   44   86:invokevirtual   #162 <Method Iterator JsonArray.iterator()>
			//   45   89:astore_2        
			//   46   90:aload_2         
			//   47   91:invokeinterface #165 <Method boolean Iterator.hasNext()>
			//   48   96:ifeq            116
			//   49   99:aload_0         
			//   50  100:aload_1         
			//   51  101:aload_2         
			//   52  102:invokeinterface #169 <Method Object Iterator.next()>
			//   53  107:checkcast       #110 <Class JsonElement>
			//   54  110:invokevirtual   #171 <Method void write(JsonWriter, JsonElement)>
			//*  55  113:goto            90
						jsonwriter.endArray();
			//   56  116:aload_1         
			//   57  117:invokevirtual   #173 <Method JsonWriter JsonWriter.endArray()>
			//   58  120:pop             
						return;
			//   59  121:return          
					}
					if(jsonelement.isJsonObject())
			//*  60  122:aload_2         
			//*  61  123:invokevirtual   #176 <Method boolean JsonElement.isJsonObject()>
			//*  62  126:ifeq            203
					{
						jsonwriter.beginObject();
			//   63  129:aload_1         
			//   64  130:invokevirtual   #178 <Method JsonWriter JsonWriter.beginObject()>
			//   65  133:pop             
						java.util.Map.Entry entry;
						for(jsonelement = ((JsonElement) (jsonelement.getAsJsonObject().entrySet().iterator())); ((Iterator) (jsonelement)).hasNext(); write(jsonwriter, (JsonElement)entry.getValue()))
			//*  66  134:aload_2         
			//*  67  135:invokevirtual   #182 <Method JsonObject JsonElement.getAsJsonObject()>
			//*  68  138:invokevirtual   #186 <Method Set JsonObject.entrySet()>
			//*  69  141:invokeinterface #189 <Method Iterator Set.iterator()>
			//*  70  146:astore_2        
			//*  71  147:aload_2         
			//*  72  148:invokeinterface #165 <Method boolean Iterator.hasNext()>
			//*  73  153:ifeq            197
						{
							entry = (java.util.Map.Entry)((Iterator) (jsonelement)).next();
			//   74  156:aload_2         
			//   75  157:invokeinterface #169 <Method Object Iterator.next()>
			//   76  162:checkcast       #191 <Class java.util.Map$Entry>
			//   77  165:astore_3        
							jsonwriter.name((String)entry.getKey());
			//   78  166:aload_1         
			//   79  167:aload_3         
			//   80  168:invokeinterface #194 <Method Object java.util.Map$Entry.getKey()>
			//   81  173:checkcast       #196 <Class String>
			//   82  176:invokevirtual   #199 <Method JsonWriter JsonWriter.name(String)>
			//   83  179:pop             
						}

			//   84  180:aload_0         
			//   85  181:aload_1         
			//   86  182:aload_3         
			//   87  183:invokeinterface #202 <Method Object java.util.Map$Entry.getValue()>
			//   88  188:checkcast       #110 <Class JsonElement>
			//   89  191:invokevirtual   #171 <Method void write(JsonWriter, JsonElement)>
			//*  90  194:goto            147
						jsonwriter.endObject();
			//   91  197:aload_1         
			//   92  198:invokevirtual   #204 <Method JsonWriter JsonWriter.endObject()>
			//   93  201:pop             
						return;
			//   94  202:return          
					} else
					{
						jsonwriter = ((JsonWriter) (new StringBuilder()));
			//   95  203:new             #206 <Class StringBuilder>
			//   96  206:dup             
			//   97  207:invokespecial   #207 <Method void StringBuilder()>
			//   98  210:astore_1        
						((StringBuilder) (jsonwriter)).append("Couldn't write ");
			//   99  211:aload_1         
			//  100  212:ldc1            #209 <String "Couldn't write ">
			//  101  214:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
			//  102  217:pop             
						((StringBuilder) (jsonwriter)).append(((Object) (((Object) (jsonelement)).getClass())));
			//  103  218:aload_1         
			//  104  219:aload_2         
			//  105  220:invokevirtual   #219 <Method Class Object.getClass()>
			//  106  223:invokevirtual   #222 <Method StringBuilder StringBuilder.append(Object)>
			//  107  226:pop             
						throw new IllegalArgumentException(((StringBuilder) (jsonwriter)).toString());
			//  108  227:new             #34  <Class IllegalArgumentException>
			//  109  230:dup             
			//  110  231:aload_1         
			//  111  232:invokevirtual   #225 <Method String StringBuilder.toString()>
			//  112  235:invokespecial   #226 <Method void IllegalArgumentException(String)>
			//  113  238:athrow          
					}
				} else
				{
					jsonwriter.nullValue();
			//  114  239:aload_1         
			//  115  240:invokevirtual   #229 <Method JsonWriter JsonWriter.nullValue()>
			//  116  243:pop             
					return;
			//  117  244:return          
				}
			}

			public volatile void write(JsonWriter jsonwriter, Object obj)
			{
				write(jsonwriter, (JsonElement)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:checkcast       #110 <Class JsonElement>
			//    4    6:invokevirtual   #171 <Method void write(JsonWriter, JsonElement)>
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
