// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.io.IOException;
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

	public IndexedStringListSerializer(IndexedStringListSerializer indexedstringlistserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((StaticListSerializerBase) (indexedstringlistserializer)), jsonserializer, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #29  <Method void StaticListSerializerBase(StaticListSerializerBase, JsonSerializer, Boolean)>
	//    5    7:return          
	}

	private final void _serializeUnwrapped(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_serializer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field JsonSerializer _serializer>
	//*   2    4:ifnonnull       16
		{
			serializeContents(list, jsongenerator, serializerprovider, 1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:iconst_1        
	//    8   12:invokespecial   #43  <Method void serializeContents(List, JsonGenerator, SerializerProvider, int)>
			return;
	//    9   15:return          
		} else
		{
			serializeUsingCustom(list, jsongenerator, serializerprovider, 1);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:aload_2         
	//   13   19:aload_3         
	//   14   20:iconst_1        
	//   15   21:invokespecial   #46  <Method void serializeUsingCustom(List, JsonGenerator, SerializerProvider, int)>
			return;
	//   16   24:return          
		}
	}

	private final void serializeContents(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, int i)
		throws IOException
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
_L2:
		if(j >= i)
			break MISSING_BLOCK_LABEL_55;
	//    2    3:iload           5
	//    3    5:iload           4
	//    4    7:icmpge          55
		String s = (String)list.get(j);
	//    5   10:aload_1         
	//    6   11:iload           5
	//    7   13:invokeinterface #54  <Method Object List.get(int)>
	//    8   18:checkcast       #56  <Class String>
	//    9   21:astore          6
		if(s == null)
	//*  10   23:aload           6
	//*  11   25:ifnonnull       36
		{
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   12   28:aload_3         
	//   13   29:aload_2         
	//   14   30:invokevirtual   #62  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_56;
	//   15   33:goto            56
			}
	//*  16   36:aload_2         
	//*  17   37:aload           6
	//*  18   39:invokevirtual   #68  <Method void JsonGenerator.writeString(String)>
	//*  19   42:goto            56
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  20   45:astore_2        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (list)), j);
	//   21   46:aload_0         
	//   22   47:aload_3         
	//   23   48:aload_2         
	//   24   49:aload_1         
	//   25   50:iload           5
	//   26   52:invokevirtual   #72  <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break MISSING_BLOCK_LABEL_55;
		}
		jsongenerator.writeString(s);
		break MISSING_BLOCK_LABEL_56;
		return;
	//   27   55:return          
		j++;
	//   28   56:iload           5
	//   29   58:iconst_1        
	//   30   59:iadd            
	//   31   60:istore          5
		if(true) goto _L2; else goto _L1
	//   32   62:goto            3
_L1:
	}

	private final void serializeUsingCustom(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, int i)
		throws IOException
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		JsonSerializer jsonserializer = _serializer;
	//    2    3:aload_0         
	//    3    4:getfield        #39  <Field JsonSerializer _serializer>
	//    4    7:astore          7
		int j = 0;
	//    5    9:iconst_0        
	//    6   10:istore          5
_L2:
		if(j >= i)
			break MISSING_BLOCK_LABEL_79;
	//    7   12:iload           5
	//    8   14:iload           4
	//    9   16:icmpge          79
		k = j;
	//   10   19:iload           5
	//   11   21:istore          6
		String s = (String)list.get(j);
	//   12   23:aload_1         
	//   13   24:iload           5
	//   14   26:invokeinterface #54  <Method Object List.get(int)>
	//   15   31:checkcast       #56  <Class String>
	//   16   34:astore          8
		if(s == null)
	//*  17   36:aload           8
	//*  18   38:ifnonnull       53
		{
			k = j;
	//   19   41:iload           5
	//   20   43:istore          6
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   21   45:aload_3         
	//   22   46:aload_2         
	//   23   47:invokevirtual   #62  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_80;
	//   24   50:goto            80
			}
	//*  25   53:iload           5
	//*  26   55:istore          6
	//*  27   57:aload           7
	//*  28   59:aload           8
	//*  29   61:aload_2         
	//*  30   62:aload_3         
	//*  31   63:invokevirtual   #79  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  32   66:goto            80
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  33   69:astore_2        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), ((Object) (list)), k);
	//   34   70:aload_0         
	//   35   71:aload_3         
	//   36   72:aload_2         
	//   37   73:aload_1         
	//   38   74:iload           6
	//   39   76:invokevirtual   #72  <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break MISSING_BLOCK_LABEL_79;
		}
		k = j;
		jsonserializer.serialize(((Object) (s)), jsongenerator, serializerprovider);
		break MISSING_BLOCK_LABEL_80;
		return;
	//   40   79:return          
		j++;
	//   41   80:iload           5
	//   42   82:iconst_1        
	//   43   83:iadd            
	//   44   84:istore          5
		if(true) goto _L2; else goto _L1
	//   45   86:goto            12
_L1:
	}

	public JsonSerializer _withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, Boolean boolean1)
	{
		return ((JsonSerializer) (new IndexedStringListSerializer(this, jsonserializer, boolean1)));
	//    0    0:new             #2   <Class IndexedStringListSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #83  <Method void IndexedStringListSerializer(IndexedStringListSerializer, JsonSerializer, Boolean)>
	//    6   10:areturn         
	}

	protected void acceptContentVisitor(JsonArrayFormatVisitor jsonarrayformatvisitor)
		throws JsonMappingException
	{
		jsonarrayformatvisitor.itemsFormat(JsonFormatTypes.STRING);
	//    0    0:aload_1         
	//    1    1:getstatic       #94  <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    2    4:invokeinterface #100 <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
	//    3    9:return          
	}

	protected JsonNode contentSchema()
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #104 <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #108 <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
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
	//    5    7:invokevirtual   #110 <Method void serialize(List, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #114 <Method int List.size()>
	//    2    6:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    8:iload           4
	//*   4   10:iconst_1        
	//*   5   11:icmpne          49
	//*   6   14:aload_0         
	//*   7   15:getfield        #118 <Field Boolean _unwrapSingle>
	//*   8   18:ifnonnull       31
	//*   9   21:aload_3         
	//*  10   22:getstatic       #124 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   25:invokevirtual   #128 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   28:ifne            41
	//*  13   31:aload_0         
	//*  14   32:getfield        #118 <Field Boolean _unwrapSingle>
	//*  15   35:getstatic       #133 <Field Boolean Boolean.TRUE>
	//*  16   38:if_acmpne       49
		{
			_serializeUnwrapped(list, jsongenerator, serializerprovider);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokespecial   #135 <Method void _serializeUnwrapped(List, JsonGenerator, SerializerProvider)>
			return;
	//   22   48:return          
		}
		jsongenerator.writeStartArray(i);
	//   23   49:aload_2         
	//   24   50:iload           4
	//   25   52:invokevirtual   #139 <Method void JsonGenerator.writeStartArray(int)>
		if(_serializer == null)
	//*  26   55:aload_0         
	//*  27   56:getfield        #39  <Field JsonSerializer _serializer>
	//*  28   59:ifnonnull       76
			serializeContents(list, jsongenerator, serializerprovider, i);
	//   29   62:aload_0         
	//   30   63:aload_1         
	//   31   64:aload_2         
	//   32   65:aload_3         
	//   33   66:iload           4
	//   34   68:invokespecial   #43  <Method void serializeContents(List, JsonGenerator, SerializerProvider, int)>
		else
	//*  35   71:aload_2         
	//*  36   72:invokevirtual   #142 <Method void JsonGenerator.writeEndArray()>
	//*  37   75:return          
			serializeUsingCustom(list, jsongenerator, serializerprovider, i);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:aload_3         
	//   42   80:iload           4
	//   43   82:invokespecial   #46  <Method void serializeUsingCustom(List, JsonGenerator, SerializerProvider, int)>
		jsongenerator.writeEndArray();
	//*  44   85:goto            71
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
	//    6    9:invokevirtual   #147 <Method void serializeWithType(List, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(List list, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		int i = list.size();
	//    0    0:aload_1         
	//    1    1:invokeinterface #114 <Method int List.size()>
	//    2    6:istore          5
		typeserializer.writeTypePrefixForArray(((Object) (list)), jsongenerator);
	//    3    8:aload           4
	//    4   10:aload_1         
	//    5   11:aload_2         
	//    6   12:invokevirtual   #153 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
		if(_serializer == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #39  <Field JsonSerializer _serializer>
	//*   9   19:ifnonnull       39
			serializeContents(list, jsongenerator, serializerprovider, i);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_3         
	//   14   26:iload           5
	//   15   28:invokespecial   #43  <Method void serializeContents(List, JsonGenerator, SerializerProvider, int)>
		else
	//*  16   31:aload           4
	//*  17   33:aload_1         
	//*  18   34:aload_2         
	//*  19   35:invokevirtual   #156 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
	//*  20   38:return          
			serializeUsingCustom(list, jsongenerator, serializerprovider, i);
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:aload_3         
	//   25   43:iload           5
	//   26   45:invokespecial   #46  <Method void serializeUsingCustom(List, JsonGenerator, SerializerProvider, int)>
		typeserializer.writeTypeSuffixForArray(((Object) (list)), jsongenerator);
	//*  27   48:goto            31
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
