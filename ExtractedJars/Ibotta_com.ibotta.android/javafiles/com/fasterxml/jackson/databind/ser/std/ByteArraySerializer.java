// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
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
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectArrayFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #28  <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          21
			((JsonArrayFormatVisitor) (jsonformatvisitorwrapper)).itemsFormat(JsonFormatTypes.INTEGER);
	//    6   12:aload_1         
	//    7   13:getstatic       #34  <Field JsonFormatTypes JsonFormatTypes.INTEGER>
	//    8   16:invokeinterface #40  <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
	//    9   21:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("byte"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #49  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #51  <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #53  <String "byte">
	//    7   12:invokevirtual   #56  <Method ObjectNode createSchemaNode(String)>
	//    8   15:invokevirtual   #62  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    9   18:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (byte[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #14  <Class byte[]>
	//    4    6:invokevirtual   #67  <Method boolean isEmpty(SerializerProvider, byte[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, byte abyte0[])
	{
		return abyte0.length == 0;
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
		serialize((byte[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class byte[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #74  <Method void serialize(byte[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), abyte0, 0, abyte0.length);
	//    0    0:aload_2         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #80  <Method SerializationConfig SerializerProvider.getConfig()>
	//    3    5:invokevirtual   #86  <Method com.fasterxml.jackson.core.Base64Variant SerializationConfig.getBase64Variant()>
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:invokevirtual   #92  <Method void JsonGenerator.writeBinary(com.fasterxml.jackson.core.Base64Variant, byte[], int, int)>
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
	//    6    9:invokevirtual   #97  <Method void serializeWithType(byte[], JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(byte abyte0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (abyte0)), JsonToken.VALUE_EMBEDDED_OBJECT));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:getstatic       #103 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    5    9:invokevirtual   #109 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    6   12:invokevirtual   #113 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    7   15:astore          5
		jsongenerator.writeBinary(serializerprovider.getConfig().getBase64Variant(), abyte0, 0, abyte0.length);
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:invokevirtual   #80  <Method SerializationConfig SerializerProvider.getConfig()>
	//   11   22:invokevirtual   #86  <Method com.fasterxml.jackson.core.Base64Variant SerializationConfig.getBase64Variant()>
	//   12   25:aload_1         
	//   13   26:iconst_0        
	//   14   27:aload_1         
	//   15   28:arraylength     
	//   16   29:invokevirtual   #92  <Method void JsonGenerator.writeBinary(com.fasterxml.jackson.core.Base64Variant, byte[], int, int)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   17   32:aload           4
	//   18   34:aload_2         
	//   19   35:aload           5
	//   20   37:invokevirtual   #116 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   21   40:pop             
	//   22   41:return          
	}

	private static final long serialVersionUID = 1L;
}
