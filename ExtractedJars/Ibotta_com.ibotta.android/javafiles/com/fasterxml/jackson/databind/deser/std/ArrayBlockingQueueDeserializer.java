// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			CollectionDeserializer

public class ArrayBlockingQueueDeserializer extends CollectionDeserializer
{

	public ArrayBlockingQueueDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator)
	{
		super(javatype, jsondeserializer, typedeserializer, valueinstantiator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #12  <Method void CollectionDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator)>
	//    6    9:return          
	}

	protected ArrayBlockingQueueDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer1, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		super(javatype, jsondeserializer, typedeserializer, valueinstantiator, jsondeserializer1, nullvalueprovider, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokespecial   #18  <Method void CollectionDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, NullValueProvider, Boolean)>
	//    9   15:return          
	}

	protected Collection createDefaultInstance(DeserializationContext deserializationcontext)
		throws IOException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (Collection)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #29  <Class Collection>
	//    5    7:invokevirtual   #32  <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//    6   10:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		if(collection != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          12
			return super.deserialize(jsonparser, deserializationcontext, collection);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #33  <Method Collection CollectionDeserializer.deserialize(JsonParser, DeserializationContext, Collection)>
	//    7   11:areturn         
		if(!jsonparser.isExpectedStartArrayToken())
	//*   8   12:aload_1         
	//*   9   13:invokevirtual   #39  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*  10   16:ifne            34
		{
			return handleNonArray(jsonparser, deserializationcontext, ((Collection) (new ArrayBlockingQueue(1))));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:new             #41  <Class ArrayBlockingQueue>
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:invokespecial   #44  <Method void ArrayBlockingQueue(int)>
	//   18   30:invokevirtual   #47  <Method Collection handleNonArray(JsonParser, DeserializationContext, Collection)>
	//   19   33:areturn         
		} else
		{
			jsonparser = ((JsonParser) (super.deserialize(jsonparser, deserializationcontext, ((Collection) (new ArrayList())))));
	//   20   34:aload_0         
	//   21   35:aload_1         
	//   22   36:aload_2         
	//   23   37:new             #49  <Class ArrayList>
	//   24   40:dup             
	//   25   41:invokespecial   #52  <Method void ArrayList()>
	//   26   44:invokespecial   #33  <Method Collection CollectionDeserializer.deserialize(JsonParser, DeserializationContext, Collection)>
	//   27   47:astore_1        
			return ((Collection) (new ArrayBlockingQueue(((Collection) (jsonparser)).size(), false, ((Collection) (jsonparser)))));
	//   28   48:new             #41  <Class ArrayBlockingQueue>
	//   29   51:dup             
	//   30   52:aload_1         
	//   31   53:invokeinterface #56  <Method int Collection.size()>
	//   32   58:iconst_0        
	//   33   59:aload_1         
	//   34   60:invokespecial   #59  <Method void ArrayBlockingQueue(int, boolean, Collection)>
	//   35   63:areturn         
		}
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #68  <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected ArrayBlockingQueueDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return new ArrayBlockingQueueDeserializer(_containerType, jsondeserializer1, typedeserializer, _valueInstantiator, jsondeserializer, nullvalueprovider, boolean1);
	//    0    0:new             #2   <Class ArrayBlockingQueueDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field JavaType _containerType>
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:getfield        #78  <Field ValueInstantiator _valueInstantiator>
	//    8   14:aload_1         
	//    9   15:aload           4
	//   10   17:aload           5
	//   11   19:invokespecial   #79  <Method void ArrayBlockingQueueDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, NullValueProvider, Boolean)>
	//   12   22:areturn         
	}

	protected volatile CollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer, NullValueProvider nullvalueprovider, Boolean boolean1)
	{
		return ((CollectionDeserializer) (withResolved(jsondeserializer, jsondeserializer1, typedeserializer, nullvalueprovider, boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokevirtual   #83  <Method ArrayBlockingQueueDeserializer withResolved(JsonDeserializer, JsonDeserializer, TypeDeserializer, NullValueProvider, Boolean)>
	//    7   11:areturn         
	}

	private static final long serialVersionUID = 1L;
}
