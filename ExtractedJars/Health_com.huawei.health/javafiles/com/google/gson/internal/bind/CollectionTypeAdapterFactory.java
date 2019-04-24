// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.*;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.*;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal.bind:
//			TypeAdapterRuntimeTypeWrapper

public final class CollectionTypeAdapterFactory
	implements TypeAdapterFactory
{
	static final class Adapter extends TypeAdapter
	{

		public volatile Object read(JsonReader jsonreader)
			throws IOException
		{
			return ((Object) (read(jsonreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #38  <Method Collection read(JsonReader)>
		//    3    5:areturn         
		}

		public Collection read(JsonReader jsonreader)
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
			Collection collection = (Collection)constructor.construct();
		//    8   16:aload_0         
		//    9   17:getfield        #28  <Field ObjectConstructor constructor>
		//   10   20:invokeinterface #60  <Method Object ObjectConstructor.construct()>
		//   11   25:checkcast       #62  <Class Collection>
		//   12   28:astore_2        
			jsonreader.beginArray();
		//   13   29:aload_1         
		//   14   30:invokevirtual   #65  <Method void JsonReader.beginArray()>
			for(; jsonreader.hasNext(); collection.add(elementTypeAdapter.read(jsonreader)));
		//   15   33:aload_1         
		//   16   34:invokevirtual   #69  <Method boolean JsonReader.hasNext()>
		//   17   37:ifeq            58
		//   18   40:aload_2         
		//   19   41:aload_0         
		//   20   42:getfield        #26  <Field TypeAdapter elementTypeAdapter>
		//   21   45:aload_1         
		//   22   46:invokevirtual   #71  <Method Object TypeAdapter.read(JsonReader)>
		//   23   49:invokeinterface #75  <Method boolean Collection.add(Object)>
		//   24   54:pop             
		//*  25   55:goto            33
			jsonreader.endArray();
		//   26   58:aload_1         
		//   27   59:invokevirtual   #78  <Method void JsonReader.endArray()>
			return collection;
		//   28   62:aload_2         
		//   29   63:areturn         
		}

		public volatile void write(JsonWriter jsonwriter, Object obj)
			throws IOException
		{
			write(jsonwriter, (Collection)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #62  <Class Collection>
		//    4    6:invokevirtual   #84  <Method void write(JsonWriter, Collection)>
		//    5    9:return          
		}

		public void write(JsonWriter jsonwriter, Collection collection)
			throws IOException
		{
			if(collection == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       10
			{
				jsonwriter.nullValue();
		//    2    4:aload_1         
		//    3    5:invokevirtual   #90  <Method JsonWriter JsonWriter.nullValue()>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			jsonwriter.beginArray();
		//    6   10:aload_1         
		//    7   11:invokevirtual   #92  <Method JsonWriter JsonWriter.beginArray()>
		//    8   14:pop             
			Object obj;
			for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); elementTypeAdapter.write(jsonwriter, obj))
		//*   9   15:aload_2         
		//*  10   16:invokeinterface #96  <Method Iterator Collection.iterator()>
		//*  11   21:astore_2        
		//*  12   22:aload_2         
		//*  13   23:invokeinterface #99  <Method boolean Iterator.hasNext()>
		//*  14   28:ifeq            50
				obj = ((Iterator) (collection)).next();
		//   15   31:aload_2         
		//   16   32:invokeinterface #102 <Method Object Iterator.next()>
		//   17   37:astore_3        

		//   18   38:aload_0         
		//   19   39:getfield        #26  <Field TypeAdapter elementTypeAdapter>
		//   20   42:aload_1         
		//   21   43:aload_3         
		//   22   44:invokevirtual   #104 <Method void TypeAdapter.write(JsonWriter, Object)>
		//*  23   47:goto            22
			jsonwriter.endArray();
		//   24   50:aload_1         
		//   25   51:invokevirtual   #106 <Method JsonWriter JsonWriter.endArray()>
		//   26   54:pop             
		//   27   55:return          
		}

		private final ObjectConstructor constructor;
		private final TypeAdapter elementTypeAdapter;

		public Adapter(Gson gson, Type type, TypeAdapter typeadapter, ObjectConstructor objectconstructor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void TypeAdapter()>
			elementTypeAdapter = ((TypeAdapter) (new TypeAdapterRuntimeTypeWrapper(gson, typeadapter, type)));
		//    2    4:aload_0         
		//    3    5:new             #21  <Class TypeAdapterRuntimeTypeWrapper>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_3         
		//    7   11:aload_2         
		//    8   12:invokespecial   #24  <Method void TypeAdapterRuntimeTypeWrapper(Gson, TypeAdapter, Type)>
		//    9   15:putfield        #26  <Field TypeAdapter elementTypeAdapter>
			constructor = objectconstructor;
		//   10   18:aload_0         
		//   11   19:aload           4
		//   12   21:putfield        #28  <Field ObjectConstructor constructor>
		//   13   24:return          
		}
	}


	public CollectionTypeAdapterFactory(ConstructorConstructor constructorconstructor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		constructorConstructor = constructorconstructor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ConstructorConstructor constructorConstructor>
	//    5    9:return          
	}

	public TypeAdapter create(Gson gson, TypeToken typetoken)
	{
		Type type = typetoken.getType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #27  <Method Type TypeToken.getType()>
	//    2    4:astore_3        
		Class class1 = typetoken.getRawType();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #31  <Method Class TypeToken.getRawType()>
	//    5    9:astore          4
		if(!((Class) (java/util/Collection)).isAssignableFrom(class1))
	//*   6   11:ldc1            #33  <Class Collection>
	//*   7   13:aload           4
	//*   8   15:invokevirtual   #39  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   18:ifne            23
		{
			return null;
	//   10   21:aconst_null     
	//   11   22:areturn         
		} else
		{
			type = com.google.gson.internal..Gson.Types.getCollectionElementType(type, class1);
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:invokestatic    #45  <Method Type com.google.gson.internal.$Gson$Types.getCollectionElementType(Type, Class)>
	//   15   29:astore_3        
			return ((TypeAdapter) (new Adapter(gson, type, gson.getAdapter(TypeToken.get(type)), constructorConstructor.get(typetoken))));
	//   16   30:new             #8   <Class CollectionTypeAdapterFactory$Adapter>
	//   17   33:dup             
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:aload_1         
	//   21   37:aload_3         
	//   22   38:invokestatic    #49  <Method TypeToken TypeToken.get(Type)>
	//   23   41:invokevirtual   #55  <Method TypeAdapter Gson.getAdapter(TypeToken)>
	//   24   44:aload_0         
	//   25   45:getfield        #18  <Field ConstructorConstructor constructorConstructor>
	//   26   48:aload_2         
	//   27   49:invokevirtual   #60  <Method ObjectConstructor ConstructorConstructor.get(TypeToken)>
	//   28   52:invokespecial   #63  <Method void CollectionTypeAdapterFactory$Adapter(Gson, Type, TypeAdapter, ObjectConstructor)>
	//   29   55:areturn         
		}
	}

	private final ConstructorConstructor constructorConstructor;
}
