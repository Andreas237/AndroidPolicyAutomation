// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class StringCollectionSerializer extends StaticListSerializerBase
{

	protected StringCollectionSerializer()
	{
		super(java/util/Collection);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Class Collection>
	//    2    3:invokespecial   #21  <Method void StaticListSerializerBase(Class)>
	//    3    6:return          
	}

	protected StringCollectionSerializer(StringCollectionSerializer stringcollectionserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((StaticListSerializerBase) (stringcollectionserializer)), jsonserializer, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #25  <Method void StaticListSerializerBase(StaticListSerializerBase, JsonSerializer, Boolean)>
	//    5    7:return          
	}

	private final void _serializeUnwrapped(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_serializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field JsonSerializer _serializer>
	//*   2    4:ifnonnull       15
		{
			serializeContents(collection, jsongenerator, serializerprovider);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #38  <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
			return;
	//    8   14:return          
		} else
		{
			serializeUsingCustom(collection, jsongenerator, serializerprovider);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:aload_3         
	//   13   19:invokespecial   #41  <Method void serializeUsingCustom(Collection, JsonGenerator, SerializerProvider)>
			return;
	//   14   22:return          
		}
	}

	private final void serializeContents(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		if(_serializer == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field JsonSerializer _serializer>
	//    2    4:ifnull          15
_L1:
		serializeUsingCustom(collection, jsongenerator, serializerprovider);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #41  <Method void serializeUsingCustom(Collection, JsonGenerator, SerializerProvider)>
_L6:
		return;
	//    8   14:return          
_L2:
		int i;
		Iterator iterator;
		i = 0;
	//    9   15:iconst_0        
	//   10   16:istore          4
		iterator = collection.iterator();
	//   11   18:aload_1         
	//   12   19:invokeinterface #51  <Method Iterator Collection.iterator()>
	//   13   24:astore          5
_L4:
label0:
		{
			if(!iterator.hasNext())
				continue; /* Loop/switch isn't completed */
	//   14   26:aload           5
	//   15   28:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   16   33:ifeq            14
			String s = (String)iterator.next();
	//   17   36:aload           5
	//   18   38:invokeinterface #61  <Method Object Iterator.next()>
	//   19   43:checkcast       #63  <Class String>
	//   20   46:astore          6
			if(s == null)
	//*  21   48:aload           6
	//*  22   50:ifnonnull       61
			{
				try
				{
					serializerprovider.defaultSerializeNull(jsongenerator);
	//   23   53:aload_3         
	//   24   54:aload_2         
	//   25   55:invokevirtual   #69  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
					break label0;
	//   26   58:goto            85
				}
	//*  27   61:aload_2         
	//*  28   62:aload           6
	//*  29   64:invokevirtual   #75  <Method void JsonGenerator.writeString(String)>
	//*  30   67:goto            85
				catch(Exception exception)
	//*  31   70:astore          6
				{
					wrapAndThrow(serializerprovider, ((Throwable) (exception)), ((Object) (collection)), i);
	//   32   72:aload_0         
	//   33   73:aload_3         
	//   34   74:aload           6
	//   35   76:aload_1         
	//   36   77:iload           4
	//   37   79:invokevirtual   #79  <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
				}
				break; /* Loop/switch isn't completed */
	//   38   82:goto            26
			}
		}
		jsongenerator.writeString(s);
		i++;
	//   39   85:iload           4
	//   40   87:iconst_1        
	//   41   88:iadd            
	//   42   89:istore          4
		if(true) goto _L4; else goto _L3
	//   43   91:goto            26
_L3:
		if(true) goto _L6; else goto _L5
_L5:
	}

	private void serializeUsingCustom(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		JsonSerializer jsonserializer;
		Iterator iterator;
		jsonserializer = _serializer;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field JsonSerializer _serializer>
	//    2    4:astore          4
		iterator = collection.iterator();
	//    3    6:aload_1         
	//    4    7:invokeinterface #51  <Method Iterator Collection.iterator()>
	//    5   12:astore          5
_L2:
		Object obj;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//    6   14:aload           5
	//    7   16:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//    8   21:ifeq            75
		obj = ((Object) ((String)iterator.next()));
	//    9   24:aload           5
	//   10   26:invokeinterface #61  <Method Object Iterator.next()>
	//   11   31:checkcast       #63  <Class String>
	//   12   34:astore          6
		if(obj == null)
	//*  13   36:aload           6
	//*  14   38:ifnonnull       63
		{
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   15   41:aload_3         
	//   16   42:aload_2         
	//   17   43:invokevirtual   #69  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			}
	//*  18   46:goto            14
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  19   49:astore          6
			{
				wrapAndThrow(serializerprovider, ((Throwable) (obj)), ((Object) (collection)), 0);
	//   20   51:aload_0         
	//   21   52:aload_3         
	//   22   53:aload           6
	//   23   55:aload_1         
	//   24   56:iconst_0        
	//   25   57:invokevirtual   #79  <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			continue; /* Loop/switch isn't completed */
	//   26   60:goto            14
		}
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
	//   27   63:aload           4
	//   28   65:aload           6
	//   29   67:aload_2         
	//   30   68:aload_3         
	//   31   69:invokevirtual   #85  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		if(true) goto _L2; else goto _L1
	//   32   72:goto            14
_L1:
	//   33   75:return          
	}

	public JsonSerializer _withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return ((JsonSerializer) (new StringCollectionSerializer(this, jsonserializer, boolean1)));
	//    0    0:new             #2   <Class StringCollectionSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #89  <Method void StringCollectionSerializer(StringCollectionSerializer, JsonSerializer, Boolean)>
	//    6   10:areturn         
	}

	protected void acceptContentVisitor(JsonArrayFormatVisitor jsonarrayformatvisitor)
		throws JsonMappingException
	{
		jsonarrayformatvisitor.itemsFormat(JsonFormatTypes.STRING);
	//    0    0:aload_1         
	//    1    1:getstatic       #100 <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    2    4:invokeinterface #106 <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
	//    3    9:return          
	}

	protected JsonNode contentSchema()
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #110 <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #114 <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Collection)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class Collection>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #116 <Method void serialize(Collection, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = collection.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #120 <Method int Collection.size()>
	//    2    6:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    8:iload           4
	//*   4   10:iconst_1        
	//*   5   11:icmpne          49
	//*   6   14:aload_0         
	//*   7   15:getfield        #124 <Field Boolean _unwrapSingle>
	//*   8   18:ifnonnull       31
	//*   9   21:aload_3         
	//*  10   22:getstatic       #130 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   25:invokevirtual   #134 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   28:ifne            41
	//*  13   31:aload_0         
	//*  14   32:getfield        #124 <Field Boolean _unwrapSingle>
	//*  15   35:getstatic       #139 <Field Boolean Boolean.TRUE>
	//*  16   38:if_acmpne       49
		{
			_serializeUnwrapped(collection, jsongenerator, serializerprovider);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokespecial   #141 <Method void _serializeUnwrapped(Collection, JsonGenerator, SerializerProvider)>
			return;
	//   22   48:return          
		}
		jsongenerator.writeStartArray(i);
	//   23   49:aload_2         
	//   24   50:iload           4
	//   25   52:invokevirtual   #145 <Method void JsonGenerator.writeStartArray(int)>
		if(_serializer == null)
	//*  26   55:aload_0         
	//*  27   56:getfield        #35  <Field JsonSerializer _serializer>
	//*  28   59:ifnonnull       74
			serializeContents(collection, jsongenerator, serializerprovider);
	//   29   62:aload_0         
	//   30   63:aload_1         
	//   31   64:aload_2         
	//   32   65:aload_3         
	//   33   66:invokespecial   #38  <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
		else
	//*  34   69:aload_2         
	//*  35   70:invokevirtual   #148 <Method void JsonGenerator.writeEndArray()>
	//*  36   73:return          
			serializeUsingCustom(collection, jsongenerator, serializerprovider);
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:aload_2         
	//   40   77:aload_3         
	//   41   78:invokespecial   #41  <Method void serializeUsingCustom(Collection, JsonGenerator, SerializerProvider)>
		jsongenerator.writeEndArray();
	//*  42   81:goto            69
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((Collection)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class Collection>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #153 <Method void serializeWithType(Collection, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonGenerationException
	{
		typeserializer.writeTypePrefixForArray(((Object) (collection)), jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #159 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
		if(_serializer == null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #35  <Field JsonSerializer _serializer>
	//*   6   11:ifnonnull       29
			serializeContents(collection, jsongenerator, serializerprovider);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:aload_3         
	//   11   18:invokespecial   #38  <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
		else
	//*  12   21:aload           4
	//*  13   23:aload_1         
	//*  14   24:aload_2         
	//*  15   25:invokevirtual   #162 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
	//*  16   28:return          
			serializeUsingCustom(collection, jsongenerator, serializerprovider);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:aload_2         
	//   20   32:aload_3         
	//   21   33:invokespecial   #41  <Method void serializeUsingCustom(Collection, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForArray(((Object) (collection)), jsongenerator);
	//*  22   36:goto            21
	}

	public static final StringCollectionSerializer instance = new StringCollectionSerializer();

	static 
	{
	//    0    0:new             #2   <Class StringCollectionSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void StringCollectionSerializer()>
	//    3    7:putstatic       #15  <Field StringCollectionSerializer instance>
	//*   4   10:return          
	}
}
