// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.toolbox:
//			JsonRequest, HttpHeaderParser

public class JsonObjectRequest extends JsonRequest
{

	public JsonObjectRequest(int i, String s, JSONObject jsonobject, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		if(jsonobject == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       9
			jsonobject = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		else
	//*   4    6:goto            35
		if(!(jsonobject instanceof JSONObject))
	//*   5    9:aload_3         
	//*   6   10:instanceof      #10  <Class JSONObject>
	//*   7   13:ifne            24
			jsonobject = ((JSONObject) (jsonobject.toString()));
	//    8   16:aload_3         
	//    9   17:invokevirtual   #14  <Method String JSONObject.toString()>
	//   10   20:astore_3        
		else
	//*  11   21:goto            6
			jsonobject = ((JSONObject) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   12   24:aload_3         
	//   13   25:checkcast       #10  <Class JSONObject>
	//   14   28:invokestatic    #19  <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   15   31:astore_3        
	//*  16   32:goto            6
		super(i, s, ((String) (jsonobject)), listener, errorlistener);
	//   17   35:aload_0         
	//   18   36:iload_1         
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:aload           4
	//   22   41:aload           5
	//   23   43:invokespecial   #22  <Method void JsonRequest(int, String, String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//   24   46:return          
	}

	protected Response parseNetworkResponse(NetworkResponse networkresponse)
	{
		try
		{
			networkresponse = ((NetworkResponse) (Response.success(((Object) (JSONObjectInstrumentation.init(new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers, "utf-8"))))), HttpHeaderParser.parseCacheHeaders(networkresponse))));
	//    0    0:new             #33  <Class String>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #39  <Field byte[] NetworkResponse.data>
	//    4    8:aload_1         
	//    5    9:getfield        #43  <Field java.util.Map NetworkResponse.headers>
	//    6   12:ldc1            #45  <String "utf-8">
	//    7   14:invokestatic    #51  <Method String HttpHeaderParser.parseCharset(java.util.Map, String)>
	//    8   17:invokespecial   #54  <Method void String(byte[], String)>
	//    9   20:invokestatic    #58  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   10   23:aload_1         
	//   11   24:invokestatic    #62  <Method com.android.volley.Cache$Entry HttpHeaderParser.parseCacheHeaders(NetworkResponse)>
	//   12   27:invokestatic    #68  <Method Response Response.success(Object, com.android.volley.Cache$Entry)>
	//   13   30:astore_1        
		}
	//*  14   31:aload_1         
	//*  15   32:areturn         
	//*  16   33:astore_1        
	//*  17   34:new             #70  <Class ParseError>
	//*  18   37:dup             
	//*  19   38:aload_1         
	//*  20   39:invokespecial   #73  <Method void ParseError(Throwable)>
	//*  21   42:invokestatic    #77  <Method Response Response.error(com.android.volley.VolleyError)>
	//*  22   45:areturn         
		// Misplaced declaration of an exception variable
		catch(NetworkResponse networkresponse)
	//*  23   46:astore_1        
		{
			return Response.error(((com.android.volley.VolleyError) (new ParseError(((Throwable) (networkresponse))))));
	//   24   47:new             #70  <Class ParseError>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:invokespecial   #73  <Method void ParseError(Throwable)>
	//   28   55:invokestatic    #77  <Method Response Response.error(com.android.volley.VolleyError)>
	//   29   58:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(NetworkResponse networkresponse)
		{
			return Response.error(((com.android.volley.VolleyError) (new ParseError(((Throwable) (networkresponse))))));
		}
		return ((Response) (networkresponse));
	}
}
