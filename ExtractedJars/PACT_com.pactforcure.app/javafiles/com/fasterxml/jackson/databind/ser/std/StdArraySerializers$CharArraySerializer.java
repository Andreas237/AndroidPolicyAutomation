// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
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
		throws IOException, JsonGenerationException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(int j = ac.length; i < j; i++)
	//*   2    2:aload_2         
	//*   3    3:arraylength     
	//*   4    4:istore          4
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          26
			jsongenerator.writeString(ac, i, 1);
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:iload_3         
	//   11   15:iconst_1        
	//   12   16:invokevirtual   #29  <Method void JsonGenerator.writeString(char[], int, int)>

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
	//    3    3:getstatic       #40  <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    4    6:invokevirtual   #44  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
	//    5    9:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		serializerprovider = ((SerializerProvider) (createSchemaNode("array", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #52  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:astore_1        
		type = ((Type) (createSchemaNode("string")));
	//    5    8:aload_0         
	//    6    9:ldc1            #54  <String "string">
	//    7   11:invokevirtual   #57  <Method ObjectNode createSchemaNode(String)>
	//    8   14:astore_2        
		((ObjectNode) (type)).put("type", "string");
	//    9   15:aload_2         
	//   10   16:ldc1            #59  <String "type">
	//   11   18:ldc1            #54  <String "string">
	//   12   20:invokevirtual   #65  <Method ObjectNode ObjectNode.put(String, String)>
	//   13   23:pop             
		return ((ObjectNode) (serializerprovider)).set("items", ((JsonNode) (type)));
	//   14   24:aload_1         
	//   15   25:ldc1            #67  <String "items">
	//   16   27:aload_2         
	//   17   28:invokevirtual   #71  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   18   31:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (char[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #13  <Class char[]>
	//    4    6:invokevirtual   #76  <Method boolean isEmpty(SerializerProvider, char[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, char ac[])
	{
		return ac == null || ac.length == 0;
	//    0    0:aload_2         
	//    1    1:ifnull          9
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
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
	//    5    7:invokevirtual   #81  <Method void serialize(char[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #87  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
	//*   2    4:invokevirtual   #93  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            27
		{
			jsongenerator.writeStartArray(ac.length);
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:arraylength     
	//    7   13:invokevirtual   #97  <Method void JsonGenerator.writeStartArray(int)>
			_writeArrayContents(jsongenerator, ac);
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokespecial   #99  <Method void _writeArrayContents(JsonGenerator, char[])>
			jsongenerator.writeEndArray();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #102 <Method void JsonGenerator.writeEndArray()>
			return;
	//   14   26:return          
		} else
		{
			jsongenerator.writeString(ac, 0, ac.length);
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:iconst_0        
	//   18   30:aload_1         
	//   19   31:arraylength     
	//   20   32:invokevirtual   #29  <Method void JsonGenerator.writeString(char[], int, int)>
			return;
	//   21   35:return          
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
	//    6    9:invokevirtual   #107 <Method void serializeWithType(char[], JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonGenerationException
	{
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #87  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
	//*   2    4:invokevirtual   #93  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            31
		{
			typeserializer.writeTypePrefixForArray(((Object) (ac)), jsongenerator);
	//    4   10:aload           4
	//    5   12:aload_1         
	//    6   13:aload_2         
	//    7   14:invokevirtual   #113 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
			_writeArrayContents(jsongenerator, ac);
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:invokespecial   #99  <Method void _writeArrayContents(JsonGenerator, char[])>
			typeserializer.writeTypeSuffixForArray(((Object) (ac)), jsongenerator);
	//   12   23:aload           4
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #116 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
			return;
	//   16   30:return          
		} else
		{
			typeserializer.writeTypePrefixForScalar(((Object) (ac)), jsongenerator);
	//   17   31:aload           4
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #119 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
			jsongenerator.writeString(ac, 0, ac.length);
	//   21   38:aload_2         
	//   22   39:aload_1         
	//   23   40:iconst_0        
	//   24   41:aload_1         
	//   25   42:arraylength     
	//   26   43:invokevirtual   #29  <Method void JsonGenerator.writeString(char[], int, int)>
			typeserializer.writeTypeSuffixForScalar(((Object) (ac)), jsongenerator);
	//   27   46:aload           4
	//   28   48:aload_1         
	//   29   49:aload_2         
	//   30   50:invokevirtual   #122 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
			return;
	//   31   53:return          
		}
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
