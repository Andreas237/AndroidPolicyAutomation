// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			NumberSerializers

public static final class NumberSerializers$IntLikeSerializer extends NumberSerializers.Base
{

	public volatile void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		super.acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void NumberSerializers$Base.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public volatile JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return super.createContextual(serializerprovider, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #43  <Method JsonSerializer NumberSerializers$Base.createContextual(SerializerProvider, BeanProperty)>
	//    4    6:areturn         
	}

	public volatile JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return super.getSchema(serializerprovider, type);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #47  <Method JsonNode NumberSerializers$Base.getSchema(SerializerProvider, Type)>
	//    4    6:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeNumber(((Number)obj).intValue());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class Number>
	//    3    5:invokevirtual   #55  <Method int Number.intValue()>
	//    4    8:invokevirtual   #61  <Method void JsonGenerator.writeNumber(int)>
	//    5   11:return          
	}

	static final NumberSerializers$IntLikeSerializer instance = new NumberSerializers$IntLikeSerializer();

	static 
	{
	//    0    0:new             #2   <Class NumberSerializers$IntLikeSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void NumberSerializers$IntLikeSerializer()>
	//    3    7:putstatic       #18  <Field NumberSerializers$IntLikeSerializer instance>
	//*   4   10:return          
	}

	public NumberSerializers$IntLikeSerializer()
	{
		super(java/lang/Number, com.fasterxml.jackson.core.JsonParser.NumberType.INT, "integer");
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <Class Number>
	//    2    3:getstatic       #27  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    3    6:ldc1            #29  <String "integer">
	//    4    8:invokespecial   #32  <Method void NumberSerializers$Base(Class, com.fasterxml.jackson.core.JsonParser$NumberType, String)>
	//    5   11:return          
	}
}
