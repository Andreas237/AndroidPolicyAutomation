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

public class NullSerializer extends StdSerializer
{

	private NullSerializer()
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Class Object>
	//    2    3:invokespecial   #21  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectNullFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #31  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor JsonFormatVisitorWrapper.expectNullFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return ((JsonNode) (createSchemaNode("null")));
	//    0    0:aload_0         
	//    1    1:ldc1            #36  <String "null">
	//    2    3:invokevirtual   #40  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String)>
	//    3    6:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeNull();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #49  <Method void JsonGenerator.writeNull()>
	//    2    4:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsongenerator.writeNull();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #49  <Method void JsonGenerator.writeNull()>
	//    2    4:return          
	}

	public static final NullSerializer instance = new NullSerializer();

	static 
	{
	//    0    0:new             #2   <Class NullSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void NullSerializer()>
	//    3    7:putstatic       #15  <Field NullSerializer instance>
	//*   4   10:return          
	}
}
