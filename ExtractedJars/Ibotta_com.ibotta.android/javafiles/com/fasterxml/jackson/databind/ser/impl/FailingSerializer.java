// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.reflect.Type;

public class FailingSerializer extends StdSerializer
{

	public FailingSerializer(String s)
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <Class Object>
	//    2    3:invokespecial   #14  <Method void StdSerializer(Class)>
		_msg = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #16  <Field String _msg>
	//    6   11:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
	{
	//    0    0:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializerprovider.reportMappingProblem(_msg, new Object[0]);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field String _msg>
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #34  <Method void SerializerProvider.reportMappingProblem(String, Object[])>
	//    6   12:return          
	}

	protected final String _msg;
}
