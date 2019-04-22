// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

public class ErrorThrowingDeserializer extends JsonDeserializer
{

	public ErrorThrowingDeserializer(NoClassDefFoundError noclassdeffounderror)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void JsonDeserializer()>
		_cause = ((Error) (noclassdeffounderror));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Error _cause>
	//    5    9:return          
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		throw _cause;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Error _cause>
	//    2    4:athrow          
	}

	private final Error _cause;
}
