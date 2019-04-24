// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
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

	protected ArrayBlockingQueueDeserializer(JavaType javatype, JsonDeserializer jsondeserializer, TypeDeserializer typedeserializer, ValueInstantiator valueinstantiator, JsonDeserializer jsondeserializer1, Boolean boolean1)
	{
		super(javatype, jsondeserializer, typedeserializer, valueinstantiator, jsondeserializer1, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #18  <Method void CollectionDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, Boolean)>
	//    8   13:return          
	}

	protected ArrayBlockingQueueDeserializer(ArrayBlockingQueueDeserializer arrayblockingqueuedeserializer)
	{
		super(((CollectionDeserializer) (arrayblockingqueuedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void CollectionDeserializer(CollectionDeserializer)>
	//    3    5:return          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method Collection deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext, (Collection)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:checkcast       #36  <Class Collection>
	//    5    7:invokevirtual   #39  <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//    6   10:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(_delegateDeserializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field JsonDeserializer _delegateDeserializer>
	//*   2    4:ifnull          28
			return (Collection)_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field ValueInstantiator _valueInstantiator>
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field JsonDeserializer _delegateDeserializer>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #51  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   11   21:invokevirtual   #57  <Method Object ValueInstantiator.createUsingDelegate(DeserializationContext, Object)>
	//   12   24:checkcast       #36  <Class Collection>
	//   13   27:areturn         
		if(jsonparser.getCurrentToken() == JsonToken.VALUE_STRING)
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #63  <Method JsonToken JsonParser.getCurrentToken()>
	//*  16   32:getstatic       #69  <Field JsonToken JsonToken.VALUE_STRING>
	//*  17   35:if_acmpne       63
		{
			String s = jsonparser.getText();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #73  <Method String JsonParser.getText()>
	//   20   42:astore_3        
			if(s.length() == 0)
	//*  21   43:aload_3         
	//*  22   44:invokevirtual   #79  <Method int String.length()>
	//*  23   47:ifne            63
				return (Collection)_valueInstantiator.createFromString(deserializationcontext, s);
	//   24   50:aload_0         
	//   25   51:getfield        #47  <Field ValueInstantiator _valueInstantiator>
	//   26   54:aload_2         
	//   27   55:aload_3         
	//   28   56:invokevirtual   #83  <Method Object ValueInstantiator.createFromString(DeserializationContext, String)>
	//   29   59:checkcast       #36  <Class Collection>
	//   30   62:areturn         
		}
		return deserialize(jsonparser, deserializationcontext, ((Collection) (null)));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:aconst_null     
	//   35   67:invokevirtual   #39  <Method Collection deserialize(JsonParser, DeserializationContext, Collection)>
	//   36   70:areturn         
	}

	public Collection deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Collection collection)
		throws IOException
	{
		ArrayList arraylist;
		JsonDeserializer jsondeserializer;
		TypeDeserializer typedeserializer;
		if(!jsonparser.isExpectedStartArrayToken())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #90  <Method boolean JsonParser.isExpectedStartArrayToken()>
	//*   2    4:ifne            22
			return handleNonArray(jsonparser, deserializationcontext, ((Collection) (new ArrayBlockingQueue(1))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:new             #92  <Class ArrayBlockingQueue>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #95  <Method void ArrayBlockingQueue(int)>
	//   10   18:invokevirtual   #98  <Method Collection handleNonArray(JsonParser, DeserializationContext, Collection)>
	//   11   21:areturn         
		arraylist = new ArrayList();
	//   12   22:new             #100 <Class ArrayList>
	//   13   25:dup             
	//   14   26:invokespecial   #103 <Method void ArrayList()>
	//   15   29:astore          5
		jsondeserializer = _valueDeserializer;
	//   16   31:aload_0         
	//   17   32:getfield        #106 <Field JsonDeserializer _valueDeserializer>
	//   18   35:astore          6
		typedeserializer = _valueTypeDeserializer;
	//   19   37:aload_0         
	//   20   38:getfield        #110 <Field TypeDeserializer _valueTypeDeserializer>
	//   21   41:astore          7
_L2:
		Object obj;
		obj = ((Object) (jsonparser.nextToken()));
	//   22   43:aload_1         
	//   23   44:invokevirtual   #113 <Method JsonToken JsonParser.nextToken()>
	//   24   47:astore          4
		if(obj == JsonToken.END_ARRAY)
			break MISSING_BLOCK_LABEL_128;
	//   25   49:aload           4
	//   26   51:getstatic       #116 <Field JsonToken JsonToken.END_ARRAY>
	//   27   54:if_acmpeq       128
		if(obj != JsonToken.VALUE_NULL)
			break; /* Loop/switch isn't completed */
	//   28   57:aload           4
	//   29   59:getstatic       #119 <Field JsonToken JsonToken.VALUE_NULL>
	//   30   62:if_acmpne       97
		obj = jsondeserializer.getNullValue(deserializationcontext);
	//   31   65:aload           6
	//   32   67:aload_2         
	//   33   68:invokevirtual   #123 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   34   71:astore          4
_L3:
		arraylist.add(obj);
	//   35   73:aload           5
	//   36   75:aload           4
	//   37   77:invokevirtual   #127 <Method boolean ArrayList.add(Object)>
	//   38   80:pop             
		if(true) goto _L2; else goto _L1
	//   39   81:goto            43
	//*  40   84:astore_1        
	//*  41   85:aload_1         
	//*  42   86:aload           5
	//*  43   88:aload           5
	//*  44   90:invokevirtual   #130 <Method int ArrayList.size()>
	//*  45   93:invokestatic    #136 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//*  46   96:athrow          
_L1:
label0:
		{
			if(typedeserializer != null)
				break label0;
	//   47   97:aload           7
	//   48   99:ifnonnull       114
			try
			{
				obj = jsondeserializer.deserialize(jsonparser, deserializationcontext);
	//   49  102:aload           6
	//   50  104:aload_1         
	//   51  105:aload_2         
	//   52  106:invokevirtual   #51  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   53  109:astore          4
			}
			// Misplaced declaration of an exception variable
			catch(JsonParser jsonparser)
			{
				throw JsonMappingException.wrapWithPath(((Throwable) (jsonparser)), ((Object) (arraylist)), arraylist.size());
			}
		}
		  goto _L3
	//*  54  111:goto            73
		obj = jsondeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
	//   55  114:aload           6
	//   56  116:aload_1         
	//   57  117:aload_2         
	//   58  118:aload           7
	//   59  120:invokevirtual   #140 <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//   60  123:astore          4
		  goto _L3
	//*  61  125:goto            73
		if(collection != null)
	//*  62  128:aload_3         
	//*  63  129:ifnull          143
		{
			collection.addAll(((Collection) (arraylist)));
	//   64  132:aload_3         
	//   65  133:aload           5
	//   66  135:invokeinterface #144 <Method boolean Collection.addAll(Collection)>
	//   67  140:pop             
			return collection;
	//   68  141:aload_3         
	//   69  142:areturn         
		} else
		{
			return ((Collection) (new ArrayBlockingQueue(arraylist.size(), false, ((Collection) (arraylist)))));
	//   70  143:new             #92  <Class ArrayBlockingQueue>
	//   71  146:dup             
	//   72  147:aload           5
	//   73  149:invokevirtual   #130 <Method int ArrayList.size()>
	//   74  152:iconst_0        
	//   75  153:aload           5
	//   76  155:invokespecial   #147 <Method void ArrayBlockingQueue(int, boolean, Collection)>
	//   77  158:areturn         
		}
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromArray(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #153 <Method Object TypeDeserializer.deserializeTypedFromArray(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	protected ArrayBlockingQueueDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer, Boolean boolean1)
	{
		if(jsondeserializer == _delegateDeserializer && jsondeserializer1 == _valueDeserializer && typedeserializer == _valueTypeDeserializer && _unwrapSingle == boolean1)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #43  <Field JsonDeserializer _delegateDeserializer>
	//*   3    5:if_acmpne       35
	//*   4    8:aload_2         
	//*   5    9:aload_0         
	//*   6   10:getfield        #106 <Field JsonDeserializer _valueDeserializer>
	//*   7   13:if_acmpne       35
	//*   8   16:aload_3         
	//*   9   17:aload_0         
	//*  10   18:getfield        #110 <Field TypeDeserializer _valueTypeDeserializer>
	//*  11   21:if_acmpne       35
	//*  12   24:aload_0         
	//*  13   25:getfield        #159 <Field Boolean _unwrapSingle>
	//*  14   28:aload           4
	//*  15   30:if_acmpne       35
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		else
			return new ArrayBlockingQueueDeserializer(_collectionType, jsondeserializer1, typedeserializer, _valueInstantiator, jsondeserializer, boolean1);
	//   18   35:new             #2   <Class ArrayBlockingQueueDeserializer>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:getfield        #163 <Field JavaType _collectionType>
	//   22   43:aload_2         
	//   23   44:aload_3         
	//   24   45:aload_0         
	//   25   46:getfield        #47  <Field ValueInstantiator _valueInstantiator>
	//   26   49:aload_1         
	//   27   50:aload           4
	//   28   52:invokespecial   #164 <Method void ArrayBlockingQueueDeserializer(JavaType, JsonDeserializer, TypeDeserializer, ValueInstantiator, JsonDeserializer, Boolean)>
	//   29   55:areturn         
	}

	protected volatile CollectionDeserializer withResolved(JsonDeserializer jsondeserializer, JsonDeserializer jsondeserializer1, TypeDeserializer typedeserializer, Boolean boolean1)
	{
		return ((CollectionDeserializer) (withResolved(jsondeserializer, jsondeserializer1, typedeserializer, boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #168 <Method ArrayBlockingQueueDeserializer withResolved(JsonDeserializer, JsonDeserializer, TypeDeserializer, Boolean)>
	//    6    9:areturn         
	}

	private static final long serialVersionUID = 1L;
}
