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
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer, StdJdkSerializers

public static class StdJdkSerializers$AtomicLongSerializer extends StdScalarSerializer
{

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.LONG);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #26  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//    4    6:invokevirtual   #30  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
	//    5    9:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("integer", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "integer">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #39  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((AtomicLong)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #12  <Class AtomicLong>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #46  <Method void serialize(AtomicLong, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(AtomicLong atomiclong, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		jsongenerator.writeNumber(atomiclong.get());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method long AtomicLong.get()>
	//    3    5:invokevirtual   #58  <Method void JsonGenerator.writeNumber(long)>
	//    4    8:return          
	}

	public StdJdkSerializers$AtomicLongSerializer()
	{
		super(java/util/concurrent/atomic/AtomicLong, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Class AtomicLong>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #15  <Method void StdScalarSerializer(Class, boolean)>
	//    4    7:return          
	}
}
