// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

public final class TypeWrappedSerializer extends JsonSerializer
{

	public TypeWrappedSerializer(TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void JsonSerializer()>
		_typeSerializer = typeserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field TypeSerializer _typeSerializer>
		_serializer = jsonserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field JsonSerializer _serializer>
	//    8   14:return          
	}

	public Class handledType()
	{
		return java/lang/Object;
	//    0    0:ldc1            #25  <Class Object>
	//    1    2:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		_serializer.serializeWithType(obj, jsongenerator, serializerprovider, _typeSerializer);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JsonSerializer _serializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #16  <Field TypeSerializer _typeSerializer>
	//    7   11:invokevirtual   #34  <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    8   14:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		_serializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JsonSerializer _serializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #34  <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public TypeSerializer typeSerializer()
	{
		return _typeSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TypeSerializer _typeSerializer>
	//    2    4:areturn         
	}

	public JsonSerializer valueSerializer()
	{
		return _serializer;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field JsonSerializer _serializer>
	//    2    4:areturn         
	}

	protected final JsonSerializer _serializer;
	protected final TypeSerializer _typeSerializer;
}
