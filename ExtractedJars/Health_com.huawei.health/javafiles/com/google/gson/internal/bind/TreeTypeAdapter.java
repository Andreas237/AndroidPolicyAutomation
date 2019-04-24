// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter extends TypeAdapter
{
	final class GsonContextImpl
		implements JsonDeserializationContext, JsonSerializationContext
	{

		public Object deserialize(JsonElement jsonelement, Type type)
			throws JsonParseException
		{
			return gson.fromJson(jsonelement, type);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field TreeTypeAdapter this$0>
		//    2    4:getfield        #32  <Field Gson TreeTypeAdapter.gson>
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:invokevirtual   #37  <Method Object Gson.fromJson(JsonElement, Type)>
		//    6   12:areturn         
		}

		public JsonElement serialize(Object obj)
		{
			return gson.toJsonTree(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field TreeTypeAdapter this$0>
		//    2    4:getfield        #32  <Field Gson TreeTypeAdapter.gson>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #45  <Method JsonElement Gson.toJsonTree(Object)>
		//    5   11:areturn         
		}

		public JsonElement serialize(Object obj, Type type)
		{
			return gson.toJsonTree(obj, type);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field TreeTypeAdapter this$0>
		//    2    4:getfield        #32  <Field Gson TreeTypeAdapter.gson>
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:invokevirtual   #48  <Method JsonElement Gson.toJsonTree(Object, Type)>
		//    6   12:areturn         
		}

		final TreeTypeAdapter this$0;

		private GsonContextImpl()
		{
			this$0 = TreeTypeAdapter.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field TreeTypeAdapter this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}

	static final class SingleTypeFactory
		implements TypeAdapterFactory
	{

		public TypeAdapter create(Gson gson1, TypeToken typetoken)
		{
			boolean flag;
			if(exactType != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field TypeToken exactType>
		//*   2    4:ifnull          49
			{
				if(exactType.equals(((Object) (typetoken))) || matchRawType && exactType.getType() == typetoken.getRawType())
		//*   3    7:aload_0         
		//*   4    8:getfield        #44  <Field TypeToken exactType>
		//*   5   11:aload_2         
		//*   6   12:invokevirtual   #59  <Method boolean TypeToken.equals(Object)>
		//*   7   15:ifne            39
		//*   8   18:aload_0         
		//*   9   19:getfield        #46  <Field boolean matchRawType>
		//*  10   22:ifeq            44
		//*  11   25:aload_0         
		//*  12   26:getfield        #44  <Field TypeToken exactType>
		//*  13   29:invokevirtual   #63  <Method Type TypeToken.getType()>
		//*  14   32:aload_2         
		//*  15   33:invokevirtual   #67  <Method Class TypeToken.getRawType()>
		//*  16   36:if_acmpne       44
					flag = true;
		//   17   39:iconst_1        
		//   18   40:istore_3        
				else
		//*  19   41:goto            61
					flag = false;
		//   20   44:iconst_0        
		//   21   45:istore_3        
			} else
		//*  22   46:goto            61
			{
				flag = hierarchyType.isAssignableFrom(typetoken.getRawType());
		//   23   49:aload_0         
		//   24   50:getfield        #48  <Field Class hierarchyType>
		//   25   53:aload_2         
		//   26   54:invokevirtual   #67  <Method Class TypeToken.getRawType()>
		//   27   57:invokevirtual   #73  <Method boolean Class.isAssignableFrom(Class)>
		//   28   60:istore_3        
			}
			if(flag)
		//*  29   61:iload_3         
		//*  30   62:ifeq            84
				return ((TypeAdapter) (new TreeTypeAdapter(serializer, deserializer, gson1, typetoken, ((TypeAdapterFactory) (this)))));
		//   31   65:new             #8   <Class TreeTypeAdapter>
		//   32   68:dup             
		//   33   69:aload_0         
		//   34   70:getfield        #32  <Field JsonSerializer serializer>
		//   35   73:aload_0         
		//   36   74:getfield        #36  <Field JsonDeserializer deserializer>
		//   37   77:aload_1         
		//   38   78:aload_2         
		//   39   79:aload_0         
		//   40   80:invokespecial   #76  <Method void TreeTypeAdapter(JsonSerializer, JsonDeserializer, Gson, TypeToken, TypeAdapterFactory)>
		//   41   83:areturn         
			else
				return null;
		//   42   84:aconst_null     
		//   43   85:areturn         
		}

		private final JsonDeserializer deserializer;
		private final TypeToken exactType;
		private final Class hierarchyType;
		private final boolean matchRawType;
		private final JsonSerializer serializer;

		SingleTypeFactory(Object obj, TypeToken typetoken, boolean flag, Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			JsonSerializer jsonserializer;
			if(obj instanceof JsonSerializer)
		//*   2    4:aload_1         
		//*   3    5:instanceof      #30  <Class JsonSerializer>
		//*   4    8:ifeq            20
				jsonserializer = (JsonSerializer)obj;
		//    5   11:aload_1         
		//    6   12:checkcast       #30  <Class JsonSerializer>
		//    7   15:astore          6
			else
		//*   8   17:goto            23
				jsonserializer = null;
		//    9   20:aconst_null     
		//   10   21:astore          6
			serializer = jsonserializer;
		//   11   23:aload_0         
		//   12   24:aload           6
		//   13   26:putfield        #32  <Field JsonSerializer serializer>
			if(obj instanceof JsonDeserializer)
		//*  14   29:aload_1         
		//*  15   30:instanceof      #34  <Class JsonDeserializer>
		//*  16   33:ifeq            44
				obj = ((Object) ((JsonDeserializer)obj));
		//   17   36:aload_1         
		//   18   37:checkcast       #34  <Class JsonDeserializer>
		//   19   40:astore_1        
			else
		//*  20   41:goto            46
				obj = null;
		//   21   44:aconst_null     
		//   22   45:astore_1        
			deserializer = ((JsonDeserializer) (obj));
		//   23   46:aload_0         
		//   24   47:aload_1         
		//   25   48:putfield        #36  <Field JsonDeserializer deserializer>
			boolean flag1;
			if(serializer != null || deserializer != null)
		//*  26   51:aload_0         
		//*  27   52:getfield        #32  <Field JsonSerializer serializer>
		//*  28   55:ifnonnull       65
		//*  29   58:aload_0         
		//*  30   59:getfield        #36  <Field JsonDeserializer deserializer>
		//*  31   62:ifnull          71
				flag1 = true;
		//   32   65:iconst_1        
		//   33   66:istore          5
			else
		//*  34   68:goto            74
				flag1 = false;
		//   35   71:iconst_0        
		//   36   72:istore          5
			com.google.gson.internal..Gson.Preconditions.checkArgument(flag1);
		//   37   74:iload           5
		//   38   76:invokestatic    #42  <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
			exactType = typetoken;
		//   39   79:aload_0         
		//   40   80:aload_2         
		//   41   81:putfield        #44  <Field TypeToken exactType>
			matchRawType = flag;
		//   42   84:aload_0         
		//   43   85:iload_3         
		//   44   86:putfield        #46  <Field boolean matchRawType>
			hierarchyType = class1;
		//   45   89:aload_0         
		//   46   90:aload           4
		//   47   92:putfield        #48  <Field Class hierarchyType>
		//   48   95:return          
		}
	}


	public TreeTypeAdapter(JsonSerializer jsonserializer, JsonDeserializer jsondeserializer, Gson gson1, TypeToken typetoken, TypeAdapterFactory typeadapterfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void TypeAdapter()>
	//    2    4:aload_0         
	//    3    5:new             #9   <Class TreeTypeAdapter$GsonContextImpl>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #40  <Method void TreeTypeAdapter$GsonContextImpl(TreeTypeAdapter, TreeTypeAdapter$1)>
	//    8   14:putfield        #42  <Field TreeTypeAdapter$GsonContextImpl context>
		serializer = jsonserializer;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #44  <Field JsonSerializer serializer>
		deserializer = jsondeserializer;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #46  <Field JsonDeserializer deserializer>
		gson = gson1;
	//   15   27:aload_0         
	//   16   28:aload_3         
	//   17   29:putfield        #48  <Field Gson gson>
		typeToken = typetoken;
	//   18   32:aload_0         
	//   19   33:aload           4
	//   20   35:putfield        #50  <Field TypeToken typeToken>
		skipPast = typeadapterfactory;
	//   21   38:aload_0         
	//   22   39:aload           5
	//   23   41:putfield        #52  <Field TypeAdapterFactory skipPast>
	//   24   44:return          
	}

	private TypeAdapter _mthdelegate()
	{
		TypeAdapter typeadapter = _flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field TypeAdapter _flddelegate>
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
	//    8   12:getfield        #48  <Field Gson gson>
	//    9   15:aload_0         
	//   10   16:getfield        #52  <Field TypeAdapterFactory skipPast>
	//   11   19:aload_0         
	//   12   20:getfield        #50  <Field TypeToken typeToken>
	//   13   23:invokevirtual   #64  <Method TypeAdapter Gson.getDelegateAdapter(TypeAdapterFactory, TypeToken)>
	//   14   26:astore_1        
			_flddelegate = typeadapter1;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #58  <Field TypeAdapter _flddelegate>
			return typeadapter1;
	//   18   32:aload_1         
	//   19   33:areturn         
		}
	}

	public static TypeAdapterFactory newFactory(TypeToken typetoken, Object obj)
	{
		return ((TypeAdapterFactory) (new SingleTypeFactory(obj, typetoken, false, ((Class) (null)))));
	//    0    0:new             #12  <Class TreeTypeAdapter$SingleTypeFactory>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aconst_null     
	//    6    8:invokespecial   #70  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class)>
	//    7   11:areturn         
	}

	public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken typetoken, Object obj)
	{
		boolean flag;
		if(typetoken.getType() == typetoken.getRawType())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method Type TypeToken.getType()>
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #82  <Method Class TypeToken.getRawType()>
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
	//   10   18:new             #12  <Class TreeTypeAdapter$SingleTypeFactory>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:aconst_null     
	//   16   26:invokespecial   #70  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class)>
	//   17   29:areturn         
	}

	public static TypeAdapterFactory newTypeHierarchyFactory(Class class1, Object obj)
	{
		return ((TypeAdapterFactory) (new SingleTypeFactory(obj, ((TypeToken) (null)), false, class1)));
	//    0    0:new             #12  <Class TreeTypeAdapter$SingleTypeFactory>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:invokespecial   #70  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class)>
	//    7   11:areturn         
	}

	public Object read(JsonReader jsonreader)
		throws IOException
	{
		if(deserializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field JsonDeserializer deserializer>
	//*   2    4:ifnonnull       16
			return _mthdelegate().read(jsonreader);
	//    3    7:aload_0         
	//    4    8:invokespecial   #91  <Method TypeAdapter _mthdelegate()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #93  <Method Object TypeAdapter.read(JsonReader)>
	//    7   15:areturn         
		jsonreader = ((JsonReader) (Streams.parse(jsonreader)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #99  <Method JsonElement Streams.parse(JsonReader)>
	//   10   20:astore_1        
		if(((JsonElement) (jsonreader)).isJsonNull())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #105 <Method boolean JsonElement.isJsonNull()>
	//*  13   25:ifeq            30
			return ((Object) (null));
	//   14   28:aconst_null     
	//   15   29:areturn         
		else
			return deserializer.deserialize(((JsonElement) (jsonreader)), typeToken.getType(), ((JsonDeserializationContext) (context)));
	//   16   30:aload_0         
	//   17   31:getfield        #46  <Field JsonDeserializer deserializer>
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #50  <Field TypeToken typeToken>
	//   21   39:invokevirtual   #78  <Method Type TypeToken.getType()>
	//   22   42:aload_0         
	//   23   43:getfield        #42  <Field TreeTypeAdapter$GsonContextImpl context>
	//   24   46:invokeinterface #111 <Method Object JsonDeserializer.deserialize(JsonElement, Type, JsonDeserializationContext)>
	//   25   51:areturn         
	}

	public void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		if(serializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field JsonSerializer serializer>
	//*   2    4:ifnonnull       17
		{
			_mthdelegate().write(jsonwriter, obj);
	//    3    7:aload_0         
	//    4    8:invokespecial   #91  <Method TypeAdapter _mthdelegate()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #117 <Method void TypeAdapter.write(JsonWriter, Object)>
			return;
	//    8   16:return          
		}
		if(obj == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       27
		{
			jsonwriter.nullValue();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #123 <Method JsonWriter JsonWriter.nullValue()>
	//   13   25:pop             
			return;
	//   14   26:return          
		} else
		{
			Streams.write(serializer.serialize(obj, typeToken.getType(), ((JsonSerializationContext) (context))), jsonwriter);
	//   15   27:aload_0         
	//   16   28:getfield        #44  <Field JsonSerializer serializer>
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #50  <Field TypeToken typeToken>
	//   20   36:invokevirtual   #78  <Method Type TypeToken.getType()>
	//   21   39:aload_0         
	//   22   40:getfield        #42  <Field TreeTypeAdapter$GsonContextImpl context>
	//   23   43:invokeinterface #129 <Method JsonElement JsonSerializer.serialize(Object, Type, JsonSerializationContext)>
	//   24   48:aload_1         
	//   25   49:invokestatic    #132 <Method void Streams.write(JsonElement, JsonWriter)>
			return;
	//   26   52:return          
		}
	}

	private final GsonContextImpl context = new GsonContextImpl();
	private TypeAdapter _flddelegate;
	private final JsonDeserializer deserializer;
	final Gson gson;
	private final JsonSerializer serializer;
	private final TypeAdapterFactory skipPast;
	private final TypeToken typeToken;
}
