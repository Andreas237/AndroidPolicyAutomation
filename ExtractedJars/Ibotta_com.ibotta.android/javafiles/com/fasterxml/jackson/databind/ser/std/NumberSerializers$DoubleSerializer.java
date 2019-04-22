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

public static final class NumberSerializers$DoubleSerializer extends NumberSerializers.Base
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
		jsongenerator.writeNumber(((Double)obj).doubleValue());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:checkcast       #46  <Class Double>
	//    3    5:invokevirtual   #50  <Method double Double.doubleValue()>
	//    4    8:invokevirtual   #56  <Method void JsonGenerator.writeNumber(double)>
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
	//    4    4:invokevirtual   #60  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
	//    5    7:return          
	}

	public NumberSerializers$DoubleSerializer(Class class1)
	{
		super(class1, com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE, "number");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #17  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
	//    3    5:ldc1            #19  <String "number">
	//    4    7:invokespecial   #22  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
	//    5   10:return          
	}
}
