// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class TokenBufferSerializer extends StdSerializer
{

	public TokenBufferSerializer()
	{
		super(com/fasterxml/jackson/databind/util/TokenBuffer);
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Class TokenBuffer>
	//    2    3:invokespecial   #13  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #24  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("any", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #29  <String "any">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #33  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public void serialize(TokenBuffer tokenbuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		tokenbuffer.serialize(jsongenerator);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #40  <Method void TokenBuffer.serialize(JsonGenerator)>
	//    3    5:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((TokenBuffer)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class TokenBuffer>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #43  <Method void serialize(TokenBuffer, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serializeWithType(TokenBuffer tokenbuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (tokenbuffer)), JsonToken.VALUE_EMBEDDED_OBJECT));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:getstatic       #51  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    5    9:invokevirtual   #57  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    6   12:invokevirtual   #61  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    7   15:astore          5
		serialize(tokenbuffer, jsongenerator, serializerprovider);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #43  <Method void serialize(TokenBuffer, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   13   24:aload           4
	//   14   26:aload_2         
	//   15   27:aload           5
	//   16   29:invokevirtual   #64  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   17   32:pop             
	//   18   33:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((TokenBuffer)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class TokenBuffer>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #67  <Method void serializeWithType(TokenBuffer, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}
}
