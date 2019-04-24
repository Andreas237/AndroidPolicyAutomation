// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//			JsonProcessingException, JsonLocation, JsonGenerator

public class JsonGenerationException extends JsonProcessingException
{

	public JsonGenerationException(String s)
	{
		super(s, (JsonLocation)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #15  <Class JsonLocation>
	//    4    6:invokespecial   #18  <Method void JsonProcessingException(String, JsonLocation)>
	//    5    9:return          
	}

	public JsonGenerationException(String s, JsonGenerator jsongenerator)
	{
		super(s, (JsonLocation)null);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:checkcast       #15  <Class JsonLocation>
	//    4    6:invokespecial   #18  <Method void JsonProcessingException(String, JsonLocation)>
		_processor = jsongenerator;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field JsonGenerator _processor>
	//    8   14:return          
	}

	public JsonGenerationException(String s, Throwable throwable)
	{
		super(s, ((JsonLocation) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #27  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
	//    5    7:return          
	}

	public JsonGenerationException(String s, Throwable throwable, JsonGenerator jsongenerator)
	{
		super(s, ((JsonLocation) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aload_2         
	//    4    4:invokespecial   #27  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
		_processor = jsongenerator;
	//    5    7:aload_0         
	//    6    8:aload_3         
	//    7    9:putfield        #23  <Field JsonGenerator _processor>
	//    8   12:return          
	}

	public JsonGenerationException(Throwable throwable)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void JsonProcessingException(Throwable)>
	//    3    5:return          
	}

	public JsonGenerationException(Throwable throwable, JsonGenerator jsongenerator)
	{
		super(throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void JsonProcessingException(Throwable)>
		_processor = jsongenerator;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field JsonGenerator _processor>
	//    6   10:return          
	}

	public JsonGenerator getProcessor()
	{
		return _processor;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field JsonGenerator _processor>
	//    2    4:areturn         
	}

	public volatile Object getProcessor()
	{
		return ((Object) (getProcessor()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method JsonGenerator getProcessor()>
	//    2    4:areturn         
	}

	public JsonGenerationException withGenerator(JsonGenerator jsongenerator)
	{
		_processor = jsongenerator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field JsonGenerator _processor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final long serialVersionUID = 123L;
	protected transient JsonGenerator _processor;
}
