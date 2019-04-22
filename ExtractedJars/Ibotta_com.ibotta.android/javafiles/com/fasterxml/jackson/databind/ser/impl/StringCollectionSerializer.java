// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
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

	protected StringCollectionSerializer(StringCollectionSerializer stringcollectionserializer, Boolean boolean1)
	{
		super(((StaticListSerializerBase) (stringcollectionserializer)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void StaticListSerializerBase(StaticListSerializerBase, Boolean)>
	//    4    6:return          
	}

	private final void serializeContents(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int j;
		j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		i = 0;
	//    2    3:iconst_0        
	//    3    4:istore          4
		Iterator iterator = collection.iterator();
	//    4    6:aload_1         
	//    5    7:invokeinterface #35  <Method Iterator Collection.iterator()>
	//    6   12:astore          6
_L2:
		j = i;
	//    7   14:iload           4
	//    8   16:istore          5
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//    9   18:aload           6
	//   10   20:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            90
		j = i;
	//   12   28:iload           4
	//   13   30:istore          5
		String s = (String)iterator.next();
	//   14   32:aload           6
	//   15   34:invokeinterface #45  <Method Object Iterator.next()>
	//   16   39:checkcast       #47  <Class String>
	//   17   42:astore          7
		if(s == null)
	//*  18   44:aload           7
	//*  19   46:ifnonnull       61
		{
			j = i;
	//   20   49:iload           4
	//   21   51:istore          5
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   22   53:aload_3         
	//   23   54:aload_2         
	//   24   55:invokevirtual   #53  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_71;
	//   25   58:goto            71
			}
	//*  26   61:iload           4
	//*  27   63:istore          5
	//*  28   65:aload_2         
	//*  29   66:aload           7
	//*  30   68:invokevirtual   #59  <Method void JsonGenerator.writeString(String)>
	//*  31   71:iload           4
	//*  32   73:iconst_1        
	//*  33   74:iadd            
	//*  34   75:istore          4
	//*  35   77:goto            14
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  36   80:astore_2        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (collection)), j);
	//   37   81:aload_0         
	//   38   82:aload_3         
	//   39   83:aload_2         
	//   40   84:aload_1         
	//   41   85:iload           5
	//   42   87:invokevirtual   #63  <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break; /* Loop/switch isn't completed */
		}
		j = i;
		jsongenerator.writeString(s);
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//   43   90:return          
	}

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new StringCollectionSerializer(this, boolean1)));
	//    0    0:new             #2   <Class StringCollectionSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #70  <Method void StringCollectionSerializer(StringCollectionSerializer, Boolean)>
	//    5    9:areturn         
	}

	protected void acceptContentVisitor(JsonArrayFormatVisitor jsonarrayformatvisitor)
		throws JsonMappingException
	{
		jsonarrayformatvisitor.itemsFormat(JsonFormatTypes.STRING);
	//    0    0:aload_1         
	//    1    1:getstatic       #81  <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    2    4:invokeinterface #87  <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
	//    3    9:return          
	}

	protected JsonNode contentSchema()
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #95  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
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
	//    5    7:invokevirtual   #99  <Method void serialize(Collection, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.setCurrentValue(((Object) (collection)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method void JsonGenerator.setCurrentValue(Object)>
		int i = collection.size();
	//    3    5:aload_1         
	//    4    6:invokeinterface #107 <Method int Collection.size()>
	//    5   11:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   6   13:iload           4
	//*   7   15:iconst_1        
	//*   8   16:icmpne          54
	//*   9   19:aload_0         
	//*  10   20:getfield        #111 <Field Boolean _unwrapSingle>
	//*  11   23:ifnonnull       36
	//*  12   26:aload_3         
	//*  13   27:getstatic       #117 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  14   30:invokevirtual   #121 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  15   33:ifne            46
	//*  16   36:aload_0         
	//*  17   37:getfield        #111 <Field Boolean _unwrapSingle>
	//*  18   40:getstatic       #126 <Field Boolean Boolean.TRUE>
	//*  19   43:if_acmpne       54
		{
			serializeContents(collection, jsongenerator, serializerprovider);
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:aload_2         
	//   23   49:aload_3         
	//   24   50:invokespecial   #128 <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
			return;
	//   25   53:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   26   54:aload_2         
	//   27   55:iload           4
	//   28   57:invokevirtual   #132 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(collection, jsongenerator, serializerprovider);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:aload_2         
	//   32   63:aload_3         
	//   33   64:invokespecial   #128 <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   34   67:aload_2         
	//   35   68:invokevirtual   #135 <Method void JsonGenerator.writeEndArray()>
			return;
	//   36   71:return          
		}
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
	//    6    9:invokevirtual   #140 <Method void serializeWithType(Collection, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsongenerator.setCurrentValue(((Object) (collection)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method void JsonGenerator.setCurrentValue(Object)>
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (collection)), JsonToken.START_ARRAY));
	//    3    5:aload           4
	//    4    7:aload_2         
	//    5    8:aload           4
	//    6   10:aload_1         
	//    7   11:getstatic       #146 <Field JsonToken JsonToken.START_ARRAY>
	//    8   14:invokevirtual   #152 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    9   17:invokevirtual   #156 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   10   20:astore          5
		serializeContents(collection, jsongenerator, serializerprovider);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:invokespecial   #128 <Method void serializeContents(Collection, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   16   29:aload           4
	//   17   31:aload_2         
	//   18   32:aload           5
	//   19   34:invokevirtual   #159 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   20   37:pop             
	//   21   38:return          
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
