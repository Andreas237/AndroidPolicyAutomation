// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
		//*   2    4:ifnull          70
			{
				if(exactType.equals(((Object) (typetoken))) || matchRawType && exactType.getType() == typetoken.getRawType())
		//*   3    7:aload_0         
		//*   4    8:getfield        #44  <Field TypeToken exactType>
		//*   5   11:aload_2         
		//*   6   12:invokevirtual   #62  <Method boolean TypeToken.equals(Object)>
		//*   7   15:ifne            39
		//*   8   18:aload_0         
		//*   9   19:getfield        #46  <Field boolean matchRawType>
		//*  10   22:ifeq            65
		//*  11   25:aload_0         
		//*  12   26:getfield        #44  <Field TypeToken exactType>
		//*  13   29:invokevirtual   #66  <Method java.lang.reflect.Type TypeToken.getType()>
		//*  14   32:aload_2         
		//*  15   33:invokevirtual   #70  <Method Class TypeToken.getRawType()>
		//*  16   36:if_acmpne       65
					flag = true;
		//   17   39:iconst_1        
		//   18   40:istore_3        
				else
		//*  19   41:iload_3         
		//*  20   42:ifeq            85
		//*  21   45:new             #8   <Class TreeTypeAdapter>
		//*  22   48:dup             
		//*  23   49:aload_0         
		//*  24   50:getfield        #32  <Field JsonSerializer serializer>
		//*  25   53:aload_0         
		//*  26   54:getfield        #36  <Field JsonDeserializer deserializer>
		//*  27   57:aload_1         
		//*  28   58:aload_2         
		//*  29   59:aload_0         
		//*  30   60:aconst_null     
		//*  31   61:invokespecial   #73  <Method void TreeTypeAdapter(JsonSerializer, JsonDeserializer, Gson, TypeToken, TypeAdapterFactory, TreeTypeAdapter$1)>
		//*  32   64:areturn         
					flag = false;
		//   33   65:iconst_0        
		//   34   66:istore_3        
			} else
		//*  35   67:goto            41
			{
				flag = hierarchyType.isAssignableFrom(typetoken.getRawType());
		//   36   70:aload_0         
		//   37   71:getfield        #48  <Field Class hierarchyType>
		//   38   74:aload_2         
		//   39   75:invokevirtual   #70  <Method Class TypeToken.getRawType()>
		//   40   78:invokevirtual   #79  <Method boolean Class.isAssignableFrom(Class)>
		//   41   81:istore_3        
			}
			if(flag)
				return ((TypeAdapter) (new TreeTypeAdapter(serializer, deserializer, gson1, typetoken, ((TypeAdapterFactory) (this)))));
			else
		//*  42   82:goto            41
				return null;
		//   43   85:aconst_null     
		//   44   86:areturn         
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
			boolean flag1;
			JsonSerializer jsonserializer;
			if(obj instanceof JsonSerializer)
		//*   2    4:aload_1         
		//*   3    5:instanceof      #30  <Class JsonSerializer>
		//*   4    8:ifeq            79
				jsonserializer = (JsonSerializer)obj;
		//    5   11:aload_1         
		//    6   12:checkcast       #30  <Class JsonSerializer>
		//    7   15:astore          6
			else
		//*   8   17:aload_0         
		//*   9   18:aload           6
		//*  10   20:putfield        #32  <Field JsonSerializer serializer>
		//*  11   23:aload_1         
		//*  12   24:instanceof      #34  <Class JsonDeserializer>
		//*  13   27:ifeq            85
		//*  14   30:aload_1         
		//*  15   31:checkcast       #34  <Class JsonDeserializer>
		//*  16   34:astore_1        
		//*  17   35:aload_0         
		//*  18   36:aload_1         
		//*  19   37:putfield        #36  <Field JsonDeserializer deserializer>
		//*  20   40:aload_0         
		//*  21   41:getfield        #32  <Field JsonSerializer serializer>
		//*  22   44:ifnonnull       54
		//*  23   47:aload_0         
		//*  24   48:getfield        #36  <Field JsonDeserializer deserializer>
		//*  25   51:ifnull          90
		//*  26   54:iconst_1        
		//*  27   55:istore          5
		//*  28   57:iload           5
		//*  29   59:invokestatic    #42  <Method void com.google.gson.internal.$Gson$Preconditions.checkArgument(boolean)>
		//*  30   62:aload_0         
		//*  31   63:aload_2         
		//*  32   64:putfield        #44  <Field TypeToken exactType>
		//*  33   67:aload_0         
		//*  34   68:iload_3         
		//*  35   69:putfield        #46  <Field boolean matchRawType>
		//*  36   72:aload_0         
		//*  37   73:aload           4
		//*  38   75:putfield        #48  <Field Class hierarchyType>
		//*  39   78:return          
				jsonserializer = null;
		//   40   79:aconst_null     
		//   41   80:astore          6
			serializer = jsonserializer;
			if(obj instanceof JsonDeserializer)
				obj = ((Object) ((JsonDeserializer)obj));
			else
		//*  42   82:goto            17
				obj = null;
		//   43   85:aconst_null     
		//   44   86:astore_1        
			deserializer = ((JsonDeserializer) (obj));
			if(serializer != null || deserializer != null)
				flag1 = true;
			else
		//*  45   87:goto            35
				flag1 = false;
		//   46   90:iconst_0        
		//   47   91:istore          5
			com.google.gson.internal..Gson.Preconditions.checkArgument(flag1);
			exactType = typetoken;
			matchRawType = flag;
			hierarchyType = class1;
		//*  48   93:goto            57
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
	//*   4    8:if_acmpne       26
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:new             #9   <Class TreeTypeAdapter$SingleTypeFactory>
	//*   8   16:dup             
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:iload_2         
	//*  12   20:aconst_null     
	//*  13   21:aconst_null     
	//*  14   22:invokespecial   #62  <Method void TreeTypeAdapter$SingleTypeFactory(Object, TypeToken, boolean, Class, TreeTypeAdapter$1)>
	//*  15   25:areturn         
			flag = false;
	//   16   26:iconst_0        
	//   17   27:istore_2        
		return ((TypeAdapterFactory) (new SingleTypeFactory(obj, typetoken, flag, ((Class) (null)))));
	//*  18   28:goto            13
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
		throws IOException
	{
		if(deserializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field JsonDeserializer deserializer>
	//*   2    4:ifnonnull       16
			return _mthdelegate().read(jsonreader);
	//    3    7:aload_0         
	//    4    8:invokespecial   #83  <Method TypeAdapter _mthdelegate()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #85  <Method Object TypeAdapter.read(JsonReader)>
	//    7   15:areturn         
		jsonreader = ((JsonReader) (Streams.parse(jsonreader)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #91  <Method JsonElement Streams.parse(JsonReader)>
	//   10   20:astore_1        
		if(((JsonElement) (jsonreader)).isJsonNull())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #97  <Method boolean JsonElement.isJsonNull()>
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
	//   24   46:getfield        #101 <Field JsonDeserializationContext Gson.deserializationContext>
	//   25   49:invokeinterface #107 <Method Object JsonDeserializer.deserialize(JsonElement, java.lang.reflect.Type, JsonDeserializationContext)>
	//   26   54:areturn         
	}

	public void write(JsonWriter jsonwriter, Object obj)
		throws IOException
	{
		if(serializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field JsonSerializer serializer>
	//*   2    4:ifnonnull       17
		{
			_mthdelegate().write(jsonwriter, obj);
	//    3    7:aload_0         
	//    4    8:invokespecial   #83  <Method TypeAdapter _mthdelegate()>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #113 <Method void TypeAdapter.write(JsonWriter, Object)>
			return;
	//    8   16:return          
		}
		if(obj == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       27
		{
			jsonwriter.nullValue();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #119 <Method JsonWriter JsonWriter.nullValue()>
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
	//   23   43:getfield        #123 <Field JsonSerializationContext Gson.serializationContext>
	//   24   46:invokeinterface #129 <Method JsonElement JsonSerializer.serialize(Object, java.lang.reflect.Type, JsonSerializationContext)>
	//   25   51:aload_1         
	//   26   52:invokestatic    #132 <Method void Streams.write(JsonElement, JsonWriter)>
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
