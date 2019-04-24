// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.*;

public class JsonEOFException extends JsonParseException
{

	public JsonEOFException(JsonParser jsonparser, JsonToken jsontoken, String s)
	{
		super(jsonparser, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #15  <Method void JsonParseException(JsonParser, String)>
		_token = jsontoken;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #17  <Field JsonToken _token>
	//    7   11:return          
	}

	public JsonToken getTokenBeingDecoded()
	{
		return _token;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JsonToken _token>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final JsonToken _token;
}
