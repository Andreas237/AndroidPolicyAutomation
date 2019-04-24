// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

public abstract class DeserializationProblemHandler
{

	public DeserializationProblemHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public boolean handleUnknownProperty(DeserializationContext deserializationcontext, JsonParser jsonparser, JsonDeserializer jsondeserializer, Object obj, String s)
		throws IOException, JsonProcessingException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
