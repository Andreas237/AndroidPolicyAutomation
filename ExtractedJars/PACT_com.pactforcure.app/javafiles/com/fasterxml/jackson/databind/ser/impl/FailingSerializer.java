// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
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
		throw new JsonGenerationException(_msg, jsongenerator);
	//    0    0:new             #30  <Class JsonGenerationException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field String _msg>
	//    4    8:aload_2         
	//    5    9:invokespecial   #33  <Method void JsonGenerationException(String, JsonGenerator)>
	//    6   12:athrow          
	}

	protected final String _msg;
}
