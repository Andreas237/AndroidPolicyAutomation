// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;

public final class TypeWrappedSerializer extends JsonSerializer
	implements ContextualSerializer
{

	public TypeWrappedSerializer(TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void JsonSerializer()>
		_typeSerializer = typeserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field TypeSerializer _typeSerializer>
		_serializer = jsonserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field JsonSerializer _serializer>
	//    8   14:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _serializer;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field JsonSerializer _serializer>
	//    2    4:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(jsonserializer1 instanceof ContextualSerializer)
	//*   5    9:aload           4
	//*   6   11:instanceof      #7   <Class ContextualSerializer>
	//*   7   14:ifeq            25
			jsonserializer = serializerprovider.handleSecondaryContextualization(jsonserializer1, beanproperty);
	//    8   17:aload_1         
	//    9   18:aload           4
	//   10   20:aload_2         
	//   11   21:invokevirtual   #34  <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   12   24:astore_3        
		if(jsonserializer == _serializer)
	//*  13   25:aload_3         
	//*  14   26:aload_0         
	//*  15   27:getfield        #21  <Field JsonSerializer _serializer>
	//*  16   30:if_acmpne       35
			return ((JsonSerializer) (this));
	//   17   33:aload_0         
	//   18   34:areturn         
		else
			return ((JsonSerializer) (new TypeWrappedSerializer(_typeSerializer, jsonserializer)));
	//   19   35:new             #2   <Class TypeWrappedSerializer>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:getfield        #19  <Field TypeSerializer _typeSerializer>
	//   23   43:aload_3         
	//   24   44:invokespecial   #36  <Method void TypeWrappedSerializer(TypeSerializer, JsonSerializer)>
	//   25   47:areturn         
	}

	public Class handledType()
	{
		return java/lang/Object;
	//    0    0:ldc1            #42  <Class Object>
	//    1    2:areturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		_serializer.serializeWithType(obj, jsongenerator, serializerprovider, _typeSerializer);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field JsonSerializer _serializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #19  <Field TypeSerializer _typeSerializer>
	//    7   11:invokevirtual   #51  <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    8   14:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		_serializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field JsonSerializer _serializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #51  <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	protected final JsonSerializer _serializer;
	protected final TypeSerializer _typeSerializer;
}
