// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.google.gson:
//			TypeAdapter, Gson, JsonElement, JsonDeserializer, 
//			JsonSerializer, TypeAdapterFactory

final class TreeTypeAdapter extends TypeAdapter
{
	private static class SingleTypeFactory
		implements TypeAdapterFactory
	{

		public TypeAdapter create(Gson gson1, TypeToken typetoken)
		{
			boolean flag;
			if(exactType != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field TypeToken exactType>
		//*   2    4:ifnull          52
			{
				if(!exactType.equals(((Object) (typetoken))) && (!matchRawType || exactType.getType() != typetoken.getRawType()))
		//*   3    7:aload_0         
		//*   4    8:getfield        #44  <Field TypeToken exactType>
		//*   5   11:aload_2         
		//*   6   12:invokevirtual   #62  <Method boolean TypeToken.equals(Object)>
		//*   7   15:ifne            47
		//*   8   18:aload_0         
		//*   9   19:getfield        #46  <Field boolean matchRawType>
		//*  10   22:ifeq            42
		//*  11   25:aload_0         
		//*  12   26:getfield        #44  <Field TypeToken exactType>
		//*  13   29:invokevirtual   #66  <Method java.lang.reflect.Type TypeToken.getType()>
		//*  14   32:aload_2         
		//*  15   33:invokevirtual   #70  <Method Class TypeToken.getRawType()>
		//*  16   36:if_acmpne       42
		//*  17   39:goto            47
					flag = false;
		//   18   42:iconst_0        
		//   19   43:istore_3        
				else
		//*  20   44:goto            64
					flag = true;
		//   21   47:iconst_1        
		//   22   48:istore_3        
			} else
		//*  23   49:goto            64
			{
				flag = hierarchyType.isAssignableFrom(typetoken.getRawType());
		//   24   52:aload_0         
		//   25   53:getfield        #48  <Field Class hierarchyType>
		//   26   56:aload_2         
		//   27   57:invokevirtual   #70  <Method Class TypeToken.getRawType()>
		//   28   60:invokevirtual   #76  <Method boolean Class.isAssignableFrom(Class)>
		//   29   63:istore_3        
			}
			if(flag)
		//*  30   64:iload_3         
		//*  31   65:ifeq            88
				return ((TypeAdapter) (new TreeTypeAdapter(serializer, deserializer, gson1, typetoken, ((TypeAdapterFactory) (this)))));
		//   32   68:new             #8   <Class TreeTypeAdapter>
		//   33   71:dup             
		//   34   72:aload_0         
		//   35   73:getfield        #32  <Field JsonSerializer serializer>
		//   36   76:aload_0         
		//   37   77:getfield        #36  <Field JsonDeserializer deserializer>
		//   38   80:aload_1         
		//   39   81:aload_2         
		//   40   82:aload_0         
		//   41   83:aconst_null     
		//   42   84:invokespecial   #79  <Method void TreeTypeAdapter(JsonSerializer, JsonDeserializer, Gson, TypeToken, TypeAdapterFactory, TreeTypeAdapter$1)>
		//   43   87:areturn         
			else
				return null;
		//   44   88:aconst_null     
		//   45   89:areturn         
		}

		private final JsonDeserializer deserializer;
		private final TypeToken exactType;
		private final Class hierarchyType;
		private final boolean matchRawType;
		private final JsonSerializer serializer;

		private SingleTypeFactory(Object obj, TypeToken typetoken, boolean flag, Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			boolean flag1 = obj instanceof JsonSerializer;
		//    2    4:aload_1         
		//    3    5:instanceof      #30  <Class JsonSerializer>
		//    4    8:istore          5
			Object obj2 = null;
		//    5   10:aconst_null     
		//    6   11:astore          7
			Object obj1;
			if(flag1)
		//*   7   13:iload           5
		//*   8   15:ifeq            27
				obj1 = ((Object) ((JsonSerializer)obj));
		//    9   18:aload_1         
		//   10   19:checkcast       #30  <Class JsonSerializer>
		//   11   22:astore          6
			else
		//*  12   24:goto            30
				obj1 = null;
		//   13   27:aconst_null     
		//   14   28:astore          6
			serializer = ((JsonSerializer) (obj1));
		//   15   30:aload_0         
		//   16   31:aload           6
		//   17   33:putfield        #32  <Field JsonSerializer serializer>
			obj1 = ((Object) (obj2));
		//   18   36:aload           7
		//   19   38:astore          6
			if(obj instanceof JsonDeserializer)
		//*  20   40:aload_1         
		//*  21   41:instanceof      #34  <Class JsonDeserializer>
		//*  22   44:ifeq            53
				obj1 = ((Object) ((JsonDeserializer)obj));
		//   23   47:aload_1         
		//   24   48:checkcast       #34  <Class JsonDeserializer>
		//   25   51:astore          6
			deserializer = ((JsonDeserializer) (obj1));
		//   26   53:aload_0         
		//   27   54:aload           6
		//   28   56:putfield        #36  <Field JsonDeserializer deserializer>
			if(serializer == null && deserializer == null)
		//*  29   59:aload_0         
		//*  30   60:getfield        #32  <Field JsonSerializer serializer>
		//*  31   63:ifnonnull       82
		//*  32   66:aload_0         
		//*  33   67:getfield        #36  <Field JsonDeserializer deserializer>
		//*  34   70:ifnull          76
		//*  35   73:goto            82
				flag1 = false;
		//   36   76:iconst_0        
		//   37   77:istore          5
			else
		//*  38   79:goto            85
				flag1 = true;
		//   39   82:iconst_1        
		//   40   83:istore          5
			com.google.gson.internal..Gson.Preconditions.checkArgument(flag1);
		//   41   85:iload           5
		//   42   87:invokestatic    #42  <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
			exactType = typetoken;
		//   43   90:aload_0         
		//   44   91:aload_2         
		//   45   92:putfield        #44  <Field TypeToken exactType>
			matchRawType = flag;
		//   46   95:aload_0         
		//   47   96:iload_3         
		//   48   97:putfield        #46  <Field boolean matchRawType>
			hierarchyType = class1;
		//   49  100:aload_0         
		//   50  101:aload           4
		//   51  103:putfield        #48  <Field Class hierarchyType>
		//   52  106:return          
		}

	}


	private TreeTypeAdapter(JsonSerializer jsonserializer, JsonDeserializer jsondeserializer, Gson gson1, TypeToken typetoken, TypeAdapterFactory typeadapterfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void TypeAdapter()>
		serializer = jsonserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field JsonSerializer serializer>
		deserializer = jsondeserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field JsonDeserializer deserializer>
		gson = gson1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field Gson gson>
		typeToken = typetoken;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #39  <Field TypeToken typeToken>
		skipPast = typeadapterfactory;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #41  <Field TypeAdapterFactory skipPast>
	//   17   31:return          
	}


	private TypeAdapter _mthdelegate()
	{
		TypeAdapter typeadapter = _flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field TypeAdapter _flddelegate>
	//    2    4:astore_1        
		if(typeadapter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return typeadapter;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			TypeAdapter typeadapter1 = gson.getDelegateAdapter(skipPast, typeToken);
	//    7   11:aload_0         
	//    8   12:getfield        #37  <Field Gson gson>
	//    9   15:aload_0         
	//   10   16:getfield        #41  <Field TypeAdapterFactory skipPast>
	//   11   19:aload_0         
	//   12   20:getfield        #39  <Field TypeToken typeToken>
	//   13   23:invokevirtual   #56  <Method TypeAdapter Gson.getDelegateAdapter(TypeAdapterFactory, TypeToken)>
	//   14   26:astore_1        
			_flddelegate = typeadapter1;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #50  <Field TypeAdapter _flddelegate>
			return typeadapter1;
	//   18   32:aload_1         
	//   19   33:areturn         
		}
	}

	public static TypeAdapterFactory newFactory(TypeToken typetoken, Object obj)
	{
		return ((TypeAdapterFactory) (new SingleTypeFactory(obj, typetoken, false, ((Class) (null)))));
	//    0    0:new             #9   <Class TreeTypeAdapter$SingleTypeFactory>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aconst_null     
	//    6    8:aconst_null     
	//    7    9:invokespecial   #62  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class, TreeTypeAdapter$1)>
	//    8   12:areturn         
	}

	public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken typetoken, Object obj)
	{
		boolean flag;
		if(typetoken.getType() == typetoken.getRawType())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #70  <Method java.lang.reflect.Type TypeToken.getType()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #74  <Method Class TypeToken.getRawType()>
	//*   4    8:if_acmpne       16
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:goto            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		return ((TypeAdapterFactory) (new SingleTypeFactory(obj, typetoken, flag, ((Class) (null)))));
	//   10   18:new             #9   <Class TreeTypeAdapter$SingleTypeFactory>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:aconst_null     
	//   16   26:aconst_null     
	//   17   27:invokespecial   #62  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class, TreeTypeAdapter$1)>
	//   18   30:areturn         
	}

	public static TypeAdapterFactory newTypeHierarchyFactory(Class class1, Object obj)
	{
		return ((TypeAdapterFactory) (new SingleTypeFactory(obj, ((TypeToken) (null)), false, class1)));
	//    0    0:new             #9   <Class TreeTypeAdapter$SingleTypeFactory>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #62  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class, TreeTypeAdapter$1)>
	//    8   12:areturn         
	}

	public Object read(JsonReader jsonreader)
	{
		if(deserializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field JsonDeserializer deserializer>
	//*   2    4:ifnonnull       16
			return _mthdelegate().read(jsonreader);
	//    3    7:aload_0         
	//    4    8:invokespecial   #81  <Method TypeAdapter _mthdelegate()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #83  <Method Object TypeAdapter.read(JsonReader)>
	//    7   15:areturn         
		jsonreader = ((JsonReader) (Streams.parse(jsonreader)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #89  <Method JsonElement Streams.parse(JsonReader)>
	//   10   20:astore_1        
		if(((JsonElement) (jsonreader)).isJsonNull())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #95  <Method boolean JsonElement.isJsonNull()>
	//*  13   25:ifeq            30
			return ((Object) (null));
	//   14   28:aconst_null     
	//   15   29:areturn         
		else
			return deserializer.deserialize(((JsonElement) (jsonreader)), typeToken.getType(), gson.deserializationContext);
	//   16   30:aload_0         
	//   17   31:getfield        #35  <Field JsonDeserializer deserializer>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #39  <Field TypeToken typeToken>
	//   21   39:invokevirtual   #70  <Method java.lang.reflect.Type TypeToken.getType()>
	//   22   42:aload_0         
	//   23   43:getfield        #37  <Field Gson gson>
	//   24   46:getfield        #99  <Field JsonDeserializationContext Gson.deserializationContext>
	//   25   49:invokeinterface #105 <Method Object JsonDeserializer.deserialize(JsonElement, java.lang.reflect.Type, JsonDeserializationContext)>
	//   26   54:areturn         
	}

	public void write(JsonWriter jsonwriter, Object obj)
	{
		if(serializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field JsonSerializer serializer>
	//*   2    4:ifnonnull       17
		{
			_mthdelegate().write(jsonwriter, obj);
	//    3    7:aload_0         
	//    4    8:invokespecial   #81  <Method TypeAdapter _mthdelegate()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #110 <Method void TypeAdapter.write(JsonWriter, Object)>
			return;
	//    8   16:return          
		}
		if(obj == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       27
		{
			jsonwriter.nullValue();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #116 <Method JsonWriter JsonWriter.nullValue()>
	//   13   25:pop             
			return;
	//   14   26:return          
		} else
		{
			Streams.write(serializer.serialize(obj, typeToken.getType(), gson.serializationContext), jsonwriter);
	//   15   27:aload_0         
	//   16   28:getfield        #33  <Field JsonSerializer serializer>
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #39  <Field TypeToken typeToken>
	//   20   36:invokevirtual   #70  <Method java.lang.reflect.Type TypeToken.getType()>
	//   21   39:aload_0         
	//   22   40:getfield        #37  <Field Gson gson>
	//   23   43:getfield        #120 <Field JsonSerializationContext Gson.serializationContext>
	//   24   46:invokeinterface #126 <Method JsonElement JsonSerializer.serialize(Object, java.lang.reflect.Type, JsonSerializationContext)>
	//   25   51:aload_1         
	//   26   52:invokestatic    #129 <Method void Streams.write(JsonElement, JsonWriter)>
			return;
	//   27   55:return          
		}
	}

	private TypeAdapter _flddelegate;
	private final JsonDeserializer deserializer;
	private final Gson gson;
	private final JsonSerializer serializer;
	private final TypeAdapterFactory skipPast;
	private final TypeToken typeToken;
}
