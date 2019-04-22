// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, StdArraySerializers

public static class StdArraySerializers$CharArraySerializer extends StdSerializer
{

	private final void _writeArrayContents(JsonGenerator jsongenerator, char ac[])
		throws IOException
	{
		int j = ac.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          26
			jsongenerator.writeString(ac, i, 1);
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:iload_3         
	//   11   15:iconst_1        
	//   12   16:invokevirtual   #27  <Method void JsonGenerator.writeString(char[], int, int)>

	//   13   19:iload_3         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:istore_3        
	//*  17   23:goto            6
	//   18   26:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.STRING);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #38  <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    4    6:invokevirtual   #42  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
	//    5    9:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		serializerprovider = ((SerializerProvider) (createSchemaNode("array", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #46  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #50  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:astore_1        
		type = ((Type) (createSchemaNode("string")));
	//    5    8:aload_0         
	//    6    9:ldc1            #52  <String "string">
	//    7   11:invokevirtual   #55  <Method ObjectNode createSchemaNode(String)>
	//    8   14:astore_2        
		((ObjectNode) (type)).put("type", "string");
	//    9   15:aload_2         
	//   10   16:ldc1            #57  <String "type">
	//   11   18:ldc1            #52  <String "string">
	//   12   20:invokevirtual   #63  <Method ObjectNode ObjectNode.put(String, String)>
	//   13   23:pop             
		return ((ObjectNode) (serializerprovider)).set("items", ((JsonNode) (type)));
	//   14   24:aload_1         
	//   15   25:ldc1            #65  <String "items">
	//   16   27:aload_2         
	//   17   28:invokevirtual   #69  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   18   31:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (char[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #13  <Class char[]>
	//    4    6:invokevirtual   #74  <Method boolean isEmpty(SerializerProvider, char[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, char ac[])
	{
		return ac.length == 0;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:ifne            7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((char[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class char[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #79  <Method void serialize(char[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #85  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
	//*   2    4:invokevirtual   #91  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            32
		{
			jsongenerator.writeStartArray(ac.length);
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:arraylength     
	//    7   13:invokevirtual   #95  <Method void JsonGenerator.writeStartArray(int)>
			jsongenerator.setCurrentValue(((Object) (ac)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #99  <Method void JsonGenerator.setCurrentValue(Object)>
			_writeArrayContents(jsongenerator, ac);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokespecial   #101 <Method void _writeArrayContents(JsonGenerator, char[])>
			jsongenerator.writeEndArray();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #104 <Method void JsonGenerator.writeEndArray()>
			return;
	//   17   31:return          
		} else
		{
			jsongenerator.writeString(ac, 0, ac.length);
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:iconst_0        
	//   21   35:aload_1         
	//   22   36:arraylength     
	//   23   37:invokevirtual   #27  <Method void JsonGenerator.writeString(char[], int, int)>
			return;
	//   24   40:return          
		}
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((char[])obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class char[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #109 <Method void serializeWithType(char[], JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #85  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
	//*   2    4:invokevirtual   #91  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            37
		{
			serializerprovider = ((SerializerProvider) (typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (ac)), JsonToken.START_ARRAY))));
	//    4   10:aload           4
	//    5   12:aload_2         
	//    6   13:aload           4
	//    7   15:aload_1         
	//    8   16:getstatic       #115 <Field JsonToken JsonToken.START_ARRAY>
	//    9   19:invokevirtual   #121 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//   10   22:invokevirtual   #125 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   11   25:astore_3        
			_writeArrayContents(jsongenerator, ac);
	//   12   26:aload_0         
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokespecial   #101 <Method void _writeArrayContents(JsonGenerator, char[])>
			ac = ((char []) (serializerprovider));
	//   16   32:aload_3         
	//   17   33:astore_1        
		} else
	//*  18   34:goto            63
		{
			serializerprovider = ((SerializerProvider) (typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (ac)), JsonToken.VALUE_STRING))));
	//   19   37:aload           4
	//   20   39:aload_2         
	//   21   40:aload           4
	//   22   42:aload_1         
	//   23   43:getstatic       #128 <Field JsonToken JsonToken.VALUE_STRING>
	//   24   46:invokevirtual   #121 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//   25   49:invokevirtual   #125 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   26   52:astore_3        
			jsongenerator.writeString(ac, 0, ac.length);
	//   27   53:aload_2         
	//   28   54:aload_1         
	//   29   55:iconst_0        
	//   30   56:aload_1         
	//   31   57:arraylength     
	//   32   58:invokevirtual   #27  <Method void JsonGenerator.writeString(char[], int, int)>
			ac = ((char []) (serializerprovider));
	//   33   61:aload_3         
	//   34   62:astore_1        
		}
		typeserializer.writeTypeSuffix(jsongenerator, ((com.fasterxml.jackson.core.type.WritableTypeId) (ac)));
	//   35   63:aload           4
	//   36   65:aload_2         
	//   37   66:aload_1         
	//   38   67:invokevirtual   #131 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   39   70:pop             
	//   40   71:return          
	}

	public StdArraySerializers$CharArraySerializer()
	{
		super([C);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class char[]>
	//    2    3:invokespecial   #16  <Method void StdSerializer(Class)>
	//    3    6:return          
	}
}
