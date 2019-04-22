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
import java.util.List;

public final class IndexedStringListSerializer extends StaticListSerializerBase
{

	protected IndexedStringListSerializer()
	{
		super(java/util/List);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <Class List>
	//    2    3:invokespecial   #25  <Method void StaticListSerializerBase(Class)>
	//    3    6:return          
	}

	public IndexedStringListSerializer(IndexedStringListSerializer indexedstringlistserializer, Boolean boolean1)
	{
		super(((StaticListSerializerBase) (indexedstringlistserializer)), boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void StaticListSerializerBase(StaticListSerializerBase, Boolean)>
	//    4    6:return          
	}

	private final void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, int i)
		throws IOException
	{
		int j;
		jsongenerator.setCurrentValue(((Object) (list)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method void JsonGenerator.setCurrentValue(Object)>
		j = 0;
	//    3    5:iconst_0        
	//    4    6:istore          5
_L2:
		if(j >= i)
			break; /* Loop/switch isn't completed */
	//    5    8:iload           5
	//    6   10:iload           4
	//    7   12:icmpge          66
		String s = (String)list.get(j);
	//    8   15:aload_1         
	//    9   16:iload           5
	//   10   18:invokeinterface #45  <Method Object List.get(int)>
	//   11   23:checkcast       #47  <Class String>
	//   12   26:astore          6
		if(s == null)
	//*  13   28:aload           6
	//*  14   30:ifnonnull       41
		{
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   15   33:aload_3         
	//   16   34:aload_2         
	//   17   35:invokevirtual   #53  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_47;
	//   18   38:goto            47
			}
	//*  19   41:aload_2         
	//*  20   42:aload           6
	//*  21   44:invokevirtual   #57  <Method void JsonGenerator.writeString(String)>
	//*  22   47:iload           5
	//*  23   49:iconst_1        
	//*  24   50:iadd            
	//*  25   51:istore          5
	//*  26   53:goto            8
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  27   56:astore_2        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (list)), j);
	//   28   57:aload_0         
	//   29   58:aload_3         
	//   30   59:aload_2         
	//   31   60:aload_1         
	//   32   61:iload           5
	//   33   63:invokevirtual   #61  <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break; /* Loop/switch isn't completed */
		}
		jsongenerator.writeString(s);
		j++;
		if(true) goto _L2; else goto _L1
_L1:
	//   34   66:return          
	}

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new IndexedStringListSerializer(this, boolean1)));
	//    0    0:new             #2   <Class IndexedStringListSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #68  <Method void IndexedStringListSerializer(IndexedStringListSerializer, Boolean)>
	//    5    9:areturn         
	}

	protected void acceptContentVisitor(JsonArrayFormatVisitor jsonarrayformatvisitor)
		throws JsonMappingException
	{
		jsonarrayformatvisitor.itemsFormat(JsonFormatTypes.STRING);
	//    0    0:aload_1         
	//    1    1:getstatic       #79  <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    2    4:invokeinterface #85  <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
	//    3    9:return          
	}

	protected JsonNode contentSchema()
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #89  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #93  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((List)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class List>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #98  <Method void serialize(List, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #102 <Method int List.size()>
	//    2    6:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    8:iload           4
	//*   4   10:iconst_1        
	//*   5   11:icmpne          50
	//*   6   14:aload_0         
	//*   7   15:getfield        #106 <Field Boolean _unwrapSingle>
	//*   8   18:ifnonnull       31
	//*   9   21:aload_3         
	//*  10   22:getstatic       #112 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   25:invokevirtual   #116 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   28:ifne            41
	//*  13   31:aload_0         
	//*  14   32:getfield        #106 <Field Boolean _unwrapSingle>
	//*  15   35:getstatic       #121 <Field Boolean Boolean.TRUE>
	//*  16   38:if_acmpne       50
		{
			serializeContents(list, jsongenerator, serializerprovider, 1);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:iconst_1        
	//   22   46:invokespecial   #123 <Method void serializeContents(List, JsonGenerator, SerializerProvider, int)>
			return;
	//   23   49:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   24   50:aload_2         
	//   25   51:iload           4
	//   26   53:invokevirtual   #127 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(list, jsongenerator, serializerprovider, i);
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:aload_2         
	//   30   59:aload_3         
	//   31   60:iload           4
	//   32   62:invokespecial   #123 <Method void serializeContents(List, JsonGenerator, SerializerProvider, int)>
			jsongenerator.writeEndArray();
	//   33   65:aload_2         
	//   34   66:invokevirtual   #130 <Method void JsonGenerator.writeEndArray()>
			return;
	//   35   69:return          
		}
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((List)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class List>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #136 <Method void serializeWithType(List, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public volatile void serializeWithType(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((List)collection, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class List>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #136 <Method void serializeWithType(List, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (list)), JsonToken.START_ARRAY));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:getstatic       #143 <Field JsonToken JsonToken.START_ARRAY>
	//    5    9:invokevirtual   #149 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    6   12:invokevirtual   #153 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    7   15:astore          5
		serializeContents(list, jsongenerator, serializerprovider, list.size());
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:aload_1         
	//   13   22:invokeinterface #102 <Method int List.size()>
	//   14   27:invokespecial   #123 <Method void serializeContents(List, JsonGenerator, SerializerProvider, int)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   15   30:aload           4
	//   16   32:aload_2         
	//   17   33:aload           5
	//   18   35:invokevirtual   #156 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   19   38:pop             
	//   20   39:return          
	}

	public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class IndexedStringListSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void IndexedStringListSerializer()>
	//    3    7:putstatic       #19  <Field IndexedStringListSerializer instance>
	//*   4   10:return          
	}
}
