// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.*;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.gson.internal.bind:
//			CollectionTypeAdapterFactory, TypeAdapterRuntimeTypeWrapper

private static final class CollectionTypeAdapterFactory$Adapter extends TypeAdapter
{

	public volatile Object read(JsonReader jsonreader)
	{
		return ((Object) (read(jsonreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method Collection read(JsonReader)>
	//    3    5:areturn         
	}

	public Collection read(JsonReader jsonreader)
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
		Collection collection = (Collection)constructor.construct();
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field ObjectConstructor constructor>
	//   10   20:invokeinterface #57  <Method Object ObjectConstructor.construct()>
	//   11   25:checkcast       #59  <Class Collection>
	//   12   28:astore_2        
		jsonreader.beginArray();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #62  <Method void JsonReader.beginArray()>
		for(; jsonreader.hasNext(); collection.add(elementTypeAdapter.read(jsonreader)));
	//   15   33:aload_1         
	//   16   34:invokevirtual   #66  <Method boolean JsonReader.hasNext()>
	//   17   37:ifeq            58
	//   18   40:aload_2         
	//   19   41:aload_0         
	//   20   42:getfield        #26  <Field TypeAdapter elementTypeAdapter>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #68  <Method Object TypeAdapter.read(JsonReader)>
	//   23   49:invokeinterface #72  <Method boolean Collection.add(Object)>
	//   24   54:pop             
	//*  25   55:goto            33
		jsonreader.endArray();
	//   26   58:aload_1         
	//   27   59:invokevirtual   #75  <Method void JsonReader.endArray()>
		return collection;
	//   28   62:aload_2         
	//   29   63:areturn         
	}

	public volatile void write(JsonWriter jsonwriter, Object obj)
	{
		write(jsonwriter, (Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #59  <Class Collection>
	//    4    6:invokevirtual   #81  <Method void write(JsonWriter, Collection)>
	//    5    9:return          
	}

	public void write(JsonWriter jsonwriter, Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			jsonwriter.nullValue();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method JsonWriter JsonWriter.nullValue()>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		jsonwriter.beginArray();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #89  <Method JsonWriter JsonWriter.beginArray()>
	//    8   14:pop             
		Object obj;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); elementTypeAdapter.write(jsonwriter, obj))
	//*   9   15:aload_2         
	//*  10   16:invokeinterface #93  <Method Iterator Collection.iterator()>
	//*  11   21:astore_2        
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #96  <Method boolean Iterator.hasNext()>
	//*  14   28:ifeq            50
			obj = ((Iterator) (collection)).next();
	//   15   31:aload_2         
	//   16   32:invokeinterface #99  <Method Object Iterator.next()>
	//   17   37:astore_3        

	//   18   38:aload_0         
	//   19   39:getfield        #26  <Field TypeAdapter elementTypeAdapter>
	//   20   42:aload_1         
	//   21   43:aload_3         
	//   22   44:invokevirtual   #101 <Method void TypeAdapter.write(JsonWriter, Object)>
	//*  23   47:goto            22
		jsonwriter.endArray();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #103 <Method JsonWriter JsonWriter.endArray()>
	//   26   54:pop             
	//   27   55:return          
	}

	private final ObjectConstructor constructor;
	private final TypeAdapter elementTypeAdapter;

	public CollectionTypeAdapterFactory$Adapter(Gson gson, Type type, TypeAdapter typeadapter, ObjectConstructor objectconstructor)
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
