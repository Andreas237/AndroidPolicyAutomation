// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

public class NullsAsEmptyProvider
	implements NullValueProvider, Serializable
{

	public NullsAsEmptyProvider(JsonDeserializer jsondeserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_deserializer = jsondeserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field JsonDeserializer _deserializer>
	//    5    9:return          
	}

	public AccessPattern getNullAccessPattern()
	{
		return AccessPattern.DYNAMIC;
	//    0    0:getstatic       #33  <Field AccessPattern AccessPattern.DYNAMIC>
	//    1    3:areturn         
	}

	public Object getNullValue(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		return _deserializer.getEmptyValue(deserializationcontext);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field JsonDeserializer _deserializer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method Object JsonDeserializer.getEmptyValue(DeserializationContext)>
	//    4    8:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JsonDeserializer _deserializer;
}
