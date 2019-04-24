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

public abstract class StdScalarSerializer extends StdSerializer
{

	protected StdScalarSerializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void StdSerializer(Class)>
	//    3    5:return          
	}

	protected StdScalarSerializer(Class class1, boolean flag)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void StdSerializer(Class)>
	//    3    5:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitStringFormat(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #21  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #30  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #40  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
		serialize(obj, jsongenerator, serializerprovider);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #44  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
	//    9   14:aload           4
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #47  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   13   21:return          
	}
}
