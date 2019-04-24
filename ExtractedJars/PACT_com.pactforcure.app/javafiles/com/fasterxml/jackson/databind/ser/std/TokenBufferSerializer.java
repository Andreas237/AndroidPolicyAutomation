// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
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
		typeserializer.writeTypePrefixForScalar(((Object) (tokenbuffer)), jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #51  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
		serialize(tokenbuffer, jsongenerator, serializerprovider);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #43  <Method void serialize(TokenBuffer, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(((Object) (tokenbuffer)), jsongenerator);
	//    9   14:aload           4
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #54  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   13   21:return          
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
	//    6    9:invokevirtual   #57  <Method void serializeWithType(TokenBuffer, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}
}
