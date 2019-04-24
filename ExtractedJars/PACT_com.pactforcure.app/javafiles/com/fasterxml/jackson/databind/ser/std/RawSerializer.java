// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class RawSerializer extends StdSerializer
{

	public RawSerializer(Class class1)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #10  <Method void StdSerializer(Class, boolean)>
	//    4    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitStringFormat(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #29  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeRawValue(obj.toString());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method String Object.toString()>
	//    3    5:invokevirtual   #45  <Method void JsonGenerator.writeRawValue(String)>
	//    4    8:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #54  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
		serialize(obj, jsongenerator, serializerprovider);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #56  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
	//    9   14:aload           4
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #59  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   13   21:return          
	}
}
