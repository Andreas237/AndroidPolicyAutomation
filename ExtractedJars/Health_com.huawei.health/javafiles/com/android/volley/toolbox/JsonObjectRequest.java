// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.*;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.volley.toolbox:
//			JsonRequest, HttpHeaderParser

public class JsonObjectRequest extends JsonRequest
{

	public JsonObjectRequest(int i, String s, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		super(i, s, ((String) (null)), listener, errorlistener);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:invokespecial   #10  <Method void JsonRequest(int, String, String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//    7   10:return          
	}

	public JsonObjectRequest(int i, String s, String s1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		super(i, s, s1, listener, errorlistener);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #10  <Method void JsonRequest(int, String, String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//    7   11:return          
	}

	public JsonObjectRequest(int i, String s, JSONObject jsonobject, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		if(jsonobject == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       9
			jsonobject = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		else
	//*   4    6:goto            14
			jsonobject = ((JSONObject) (jsonobject.toString()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #21  <Method String JSONObject.toString()>
	//    7   13:astore_3        
		super(i, s, ((String) (jsonobject)), listener, errorlistener);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:aload           4
	//   13   20:aload           5
	//   14   22:invokespecial   #10  <Method void JsonRequest(int, String, String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//   15   25:return          
	}

	public JsonObjectRequest(String s, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		super(0, s, ((String) (null)), listener, errorlistener);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:invokespecial   #10  <Method void JsonRequest(int, String, String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//    7    9:return          
	}

	public JsonObjectRequest(String s, JSONObject jsonobject, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		int i;
		if(jsonobject == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			i = 0;
	//    2    4:iconst_0        
	//    3    5:istore          5
		else
	//*   4    7:goto            13
			i = 1;
	//    5   10:iconst_1        
	//    6   11:istore          5
		this(i, s, jsonobject, listener, errorlistener);
	//    7   13:aload_0         
	//    8   14:iload           5
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:aload           4
	//   13   21:invokespecial   #27  <Method void JsonObjectRequest(int, String, JSONObject, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//   14   24:return          
	}

	public Response parseNetworkResponse(NetworkResponse networkresponse)
	{
		try
		{
			networkresponse = ((NetworkResponse) (Response.success(((Object) (new JSONObject(new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers, "utf-8"))))), HttpHeaderParser.parseCacheHeaders(networkresponse))));
	//    0    0:new             #17  <Class JSONObject>
	//    1    3:dup             
	//    2    4:new             #36  <Class String>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:getfield        #42  <Field byte[] NetworkResponse.data>
	//    6   12:aload_1         
	//    7   13:getfield        #46  <Field java.util.Map NetworkResponse.headers>
	//    8   16:ldc1            #48  <String "utf-8">
	//    9   18:invokestatic    #54  <Method String HttpHeaderParser.parseCharset(java.util.Map, String)>
	//   10   21:invokespecial   #57  <Method void String(byte[], String)>
	//   11   24:invokespecial   #60  <Method void JSONObject(String)>
	//   12   27:aload_1         
	//   13   28:invokestatic    #64  <Method com.android.volley.Cache$Entry HttpHeaderParser.parseCacheHeaders(NetworkResponse)>
	//   14   31:invokestatic    #70  <Method Response Response.success(Object, com.android.volley.Cache$Entry)>
	//   15   34:astore_1        
		}
	//*  16   35:aload_1         
	//*  17   36:areturn         
		// Misplaced declaration of an exception variable
		catch(NetworkResponse networkresponse)
	//*  18   37:astore_1        
		{
			return Response.error(((com.android.volley.VolleyError) (new ParseError(((Throwable) (networkresponse))))));
	//   19   38:new             #72  <Class ParseError>
	//   20   41:dup             
	//   21   42:aload_1         
	//   22   43:invokespecial   #75  <Method void ParseError(Throwable)>
	//   23   46:invokestatic    #79  <Method Response Response.error(com.android.volley.VolleyError)>
	//   24   49:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(NetworkResponse networkresponse)
	//*  25   50:astore_1        
		{
			return Response.error(((com.android.volley.VolleyError) (new ParseError(((Throwable) (networkresponse))))));
	//   26   51:new             #72  <Class ParseError>
	//   27   54:dup             
	//   28   55:aload_1         
	//   29   56:invokespecial   #75  <Method void ParseError(Throwable)>
	//   30   59:invokestatic    #79  <Method Response Response.error(com.android.volley.VolleyError)>
	//   31   62:areturn         
		}
		return ((Response) (networkresponse));
	}
}
