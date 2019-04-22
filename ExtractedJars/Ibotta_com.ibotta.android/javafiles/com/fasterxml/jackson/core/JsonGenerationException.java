// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//			JsonProcessingException, JsonLocation, JsonGenerator

public class JsonGenerationException extends JsonProcessingException
{

	public JsonGenerationException(String s, JsonGenerator jsongenerator)
	{
		super(s, (JsonLocation)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #14  <Class JsonLocation>
	//    4    6:invokespecial   #17  <Method void JsonProcessingException(String, JsonLocation)>
		_processor = jsongenerator;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field JsonGenerator _processor>
	//    8   14:return          
	}

	public JsonGenerator getProcessor()
	{
		return _processor;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field JsonGenerator _processor>
	//    2    4:areturn         
	}

	public volatile Object getProcessor()
	{
		return ((Object) (getProcessor()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method JsonGenerator getProcessor()>
	//    2    4:areturn         
	}

	private static final long serialVersionUID = 123L;
	protected transient JsonGenerator _processor;
}
