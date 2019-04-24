// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class ByteArraySerializer extends StdSerializer
{

	public ByteArraySerializer()
	{
		super([B);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class byte[]>
	//    2    3:invokespecial   #17  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.STRING);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #28  <Field JsonFormatTypes JsonFormatTypes.STRING>
	//    4    6:invokevirtual   #32  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
	//    5    9:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("string"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #41  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #43  <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #45  <String "string">
	//    7   12:invokevirtual   #48  <Method ObjectNode createSchemaNode(String)>
	//    8   15:invokevirtual   #54  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    9   18:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (byte[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #14  <Class byte[]>
	//    4    6:invokevirtual   #59  <Method boolean isEmpty(SerializerProvider, byte[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, byte abyte0[])
	{
		return abyte0 == null || abyte0.length == 0;
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
		serialize((byte[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class byte[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #66  <Method void serialize(byte[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), abyte0, 0, abyte0.length);
	//    0    0:aload_2         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #72  <Method SerializationConfig SerializerProvider.getConfig()>
	//    3    5:invokevirtual   #78  <Method com.fasterxml.jackson.core.Base64Variant SerializationConfig.getBase64Variant()>
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:invokevirtual   #84  <Method void JsonGenerator.writeBinary(com.fasterxml.jackson.core.Base64Variant, byte[], int, int)>
	//    9   15:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((byte[])obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class byte[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #89  <Method void serializeWithType(byte[], JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForScalar(((Object) (abyte0)), jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #95  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
		jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), abyte0, 0, abyte0.length);
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokevirtual   #72  <Method SerializationConfig SerializerProvider.getConfig()>
	//    7   12:invokevirtual   #78  <Method com.fasterxml.jackson.core.Base64Variant SerializationConfig.getBase64Variant()>
	//    8   15:aload_1         
	//    9   16:iconst_0        
	//   10   17:aload_1         
	//   11   18:arraylength     
	//   12   19:invokevirtual   #84  <Method void JsonGenerator.writeBinary(com.fasterxml.jackson.core.Base64Variant, byte[], int, int)>
		typeserializer.writeTypeSuffixForScalar(((Object) (abyte0)), jsongenerator);
	//   13   22:aload           4
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #98  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   17   29:return          
	}

	private static final long serialVersionUID = 1L;
}
