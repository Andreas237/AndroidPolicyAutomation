// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.RequestPayload;

// Referenced classes of package com.fasterxml.jackson.core:
//			JsonProcessingException, JsonParser, JsonLocation

public class JsonParseException extends JsonProcessingException
{

	public JsonParseException(JsonParser jsonparser, String s)
	{
		JsonLocation jsonlocation;
		if(jsonparser == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			jsonlocation = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		else
	//*   4    6:goto            14
			jsonlocation = jsonparser.getCurrentLocation();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #20  <Method JsonLocation JsonParser.getCurrentLocation()>
	//    7   13:astore_3        
		super(s, jsonlocation);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokespecial   #23  <Method void JsonProcessingException(String, JsonLocation)>
		_processor = jsonparser;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #25  <Field JsonParser _processor>
	//   15   25:return          
	}

	public JsonParseException(JsonParser jsonparser, String s, JsonLocation jsonlocation)
	{
		super(s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #23  <Method void JsonProcessingException(String, JsonLocation)>
		_processor = jsonparser;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #25  <Field JsonParser _processor>
	//    7   11:return          
	}

	public JsonParseException(JsonParser jsonparser, String s, JsonLocation jsonlocation, Throwable throwable)
	{
		super(s, jsonlocation, throwable);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokespecial   #31  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
		_processor = jsonparser;
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:putfield        #25  <Field JsonParser _processor>
	//    8   13:return          
	}

	public JsonParseException(JsonParser jsonparser, String s, Throwable throwable)
	{
		JsonLocation jsonlocation;
		if(jsonparser == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			jsonlocation = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		else
	//*   4    7:goto            16
			jsonlocation = jsonparser.getCurrentLocation();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #20  <Method JsonLocation JsonParser.getCurrentLocation()>
	//    7   14:astore          4
		super(s, jsonlocation, throwable);
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:aload           4
	//   11   20:aload_3         
	//   12   21:invokespecial   #31  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
		_processor = jsonparser;
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:putfield        #25  <Field JsonParser _processor>
	//   16   29:return          
	}

	public JsonParseException(String s, JsonLocation jsonlocation)
	{
		super(s, jsonlocation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void JsonProcessingException(String, JsonLocation)>
	//    4    6:return          
	}

	public JsonParseException(String s, JsonLocation jsonlocation, Throwable throwable)
	{
		super(s, jsonlocation, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #31  <Method void JsonProcessingException(String, JsonLocation, Throwable)>
	//    5    7:return          
	}

	public String getMessage()
	{
		String s = super.getMessage();
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method String JsonProcessingException.getMessage()>
	//    2    4:astore_2        
		Object obj = ((Object) (s));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(_requestPayload != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #40  <Field RequestPayload _requestPayload>
	//*   7   11:ifnull          52
		{
			obj = ((Object) (new StringBuilder()));
	//    8   14:new             #42  <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #45  <Method void StringBuilder()>
	//   11   21:astore_1        
			((StringBuilder) (obj)).append(s);
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
			((StringBuilder) (obj)).append("\nRequest payload : ");
	//   16   28:aload_1         
	//   17   29:ldc1            #51  <String "\nRequest payload : ">
	//   18   31:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			((StringBuilder) (obj)).append(_requestPayload.toString());
	//   20   35:aload_1         
	//   21   36:aload_0         
	//   22   37:getfield        #40  <Field RequestPayload _requestPayload>
	//   23   40:invokevirtual   #56  <Method String RequestPayload.toString()>
	//   24   43:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   47:aload_1         
	//   27   48:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   28   51:astore_1        
		}
		return ((String) (obj));
	//   29   52:aload_1         
	//   30   53:areturn         
	}

	public JsonParser getProcessor()
	{
		return _processor;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JsonParser _processor>
	//    2    4:areturn         
	}

	public volatile Object getProcessor()
	{
		return ((Object) (getProcessor()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method JsonParser getProcessor()>
	//    2    4:areturn         
	}

	public RequestPayload getRequestPayload()
	{
		return _requestPayload;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field RequestPayload _requestPayload>
	//    2    4:areturn         
	}

	public String getRequestPayloadAsString()
	{
		if(_requestPayload != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field RequestPayload _requestPayload>
	//*   2    4:ifnull          15
			return _requestPayload.toString();
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field RequestPayload _requestPayload>
	//    5   11:invokevirtual   #56  <Method String RequestPayload.toString()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public JsonParseException withParser(JsonParser jsonparser)
	{
		_processor = jsonparser;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field JsonParser _processor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonParseException withRequestPayload(RequestPayload requestpayload)
	{
		_requestPayload = requestpayload;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field RequestPayload _requestPayload>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private static final long serialVersionUID = 2L;
	protected transient JsonParser _processor;
	protected RequestPayload _requestPayload;
}
