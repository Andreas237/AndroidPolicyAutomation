// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer, StdJdkSerializers

public static class StdJdkSerializers$AtomicBooleanSerializer extends StdScalarSerializer
{

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectBooleanFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #26  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor JsonFormatVisitorWrapper.expectBooleanFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("boolean", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "boolean">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #35  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((AtomicBoolean)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #12  <Class AtomicBoolean>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #42  <Method void serialize(AtomicBoolean, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(AtomicBoolean atomicboolean, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeBoolean(atomicboolean.get());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method boolean AtomicBoolean.get()>
	//    3    5:invokevirtual   #54  <Method void JsonGenerator.writeBoolean(boolean)>
	//    4    8:return          
	}

	public StdJdkSerializers$AtomicBooleanSerializer()
	{
		super(java/util/concurrent/atomic/AtomicBoolean, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Class AtomicBoolean>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #15  <Method void StdScalarSerializer(Class, boolean)>
	//    4    7:return          
	}
}
