// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

public final class TypeWrappedDeserializer extends JsonDeserializer
	implements Serializable
{

	public TypeWrappedDeserializer(TypeDeserializer typedeserializer, JsonDeserializer jsondeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void JsonDeserializer()>
		_typeDeserializer = typedeserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field TypeDeserializer _typeDeserializer>
		_deserializer = jsondeserializer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field JsonDeserializer _deserializer>
	//    8   14:return          
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _deserializer.deserializeWithType(jsonparser, deserializationcontext, _typeDeserializer);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field TypeDeserializer _typeDeserializer>
	//    6   10:invokevirtual   #36  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    7   13:areturn         
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		return _deserializer.deserialize(jsonparser, deserializationcontext, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #40  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext, Object)>
	//    6   10:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
	//    0    0:new             #42  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #44  <String "Type-wrapped deserializer's deserializeWithType should never get called">
	//    3    6:invokespecial   #47  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public JsonDeserializer getDelegatee()
	{
		return _deserializer.getDelegatee();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:invokevirtual   #51  <Method JsonDeserializer JsonDeserializer.getDelegatee()>
	//    3    7:areturn         
	}

	public Object getEmptyValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return _deserializer.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #58  <Method Object JsonDeserializer.getEmptyValue(DeserializationContext)>
	//    4    8:areturn         
	}

	public Collection getKnownPropertyNames()
	{
		return _deserializer.getKnownPropertyNames();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:invokevirtual   #62  <Method Collection JsonDeserializer.getKnownPropertyNames()>
	//    3    7:areturn         
	}

	public Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return _deserializer.getNullValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #66  <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//    4    8:areturn         
	}

	public Class handledType()
	{
		return _deserializer.handledType();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:invokevirtual   #70  <Method Class JsonDeserializer.handledType()>
	//    3    7:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return _deserializer.supportsUpdate(deserializationconfig);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonDeserializer _deserializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #75  <Method Boolean JsonDeserializer.supportsUpdate(DeserializationConfig)>
	//    4    8:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JsonDeserializer _deserializer;
	protected final TypeDeserializer _typeDeserializer;
}
