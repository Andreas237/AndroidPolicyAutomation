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
//			NumberSerializers

public static final class NumberSerializers$IntegerSerializer extends NumberSerializers.Base
{

	public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return super.createContextual(serializerprovider, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
	//    4    6:areturn         
	}

	public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return super.getSchema(serializerprovider, type);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
	//    4    6:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeNumber(((Integer)obj).intValue());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:checkcast       #13  <Class Integer>
	//    3    5:invokevirtual   #48  <Method int Integer.intValue()>
	//    4    8:invokevirtual   #54  <Method void JsonGenerator.writeNumber(int)>
	//    5   11:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serialize(obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #58  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
	//    5    7:return          
	}

	public NumberSerializers$IntegerSerializer()
	{
		super(java/lang/Integer, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class Integer>
	//    2    3:getstatic       #19  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    3    6:ldc1            #21  <String "integer">
	//    4    8:invokespecial   #24  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
	//    5   11:return          
	}
}
