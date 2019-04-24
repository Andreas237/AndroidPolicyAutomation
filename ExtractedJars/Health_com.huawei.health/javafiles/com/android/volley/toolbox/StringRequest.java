// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.*;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.android.volley.toolbox:
//			HttpHeaderParser

public class StringRequest extends Request
{

	public StringRequest(int i, String s, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		super(i, s, errorlistener);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload           4
	//    4    5:invokespecial   #13  <Method void Request(int, String, com.android.volley.Response$ErrorListener)>
		mListener = listener;
	//    5    8:aload_0         
	//    6    9:aload_3         
	//    7   10:putfield        #15  <Field com.android.volley.Response$Listener mListener>
	//    8   13:return          
	}

	public StringRequest(String s, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		this(0, s, listener, errorlistener);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #21  <Method void StringRequest(int, String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//    6    8:return          
	}

	public volatile void deliverResponse(Object obj)
	{
		deliverResponse((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class String>
	//    3    5:invokevirtual   #29  <Method void deliverResponse(String)>
	//    4    8:return          
	}

	protected void deliverResponse(String s)
	{
		mListener.onResponse(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.android.volley.Response$Listener mListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #34  <Method void com.android.volley.Response$Listener.onResponse(Object)>
	//    4   10:return          
	}

	public Response parseNetworkResponse(NetworkResponse networkresponse)
	{
		Object obj;
		try
		{
			obj = ((Object) (new String(networkresponse.data, HttpHeaderParser.parseCharset(networkresponse.headers))));
	//    0    0:new             #26  <Class String>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #44  <Field byte[] NetworkResponse.data>
	//    4    8:aload_1         
	//    5    9:getfield        #48  <Field java.util.Map NetworkResponse.headers>
	//    6   12:invokestatic    #54  <Method String HttpHeaderParser.parseCharset(java.util.Map)>
	//    7   15:invokespecial   #57  <Method void String(byte[], String)>
	//    8   18:astore_2        
		}
	//*   9   19:goto            35
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   22:astore_2        
		{
			obj = ((Object) (new String(networkresponse.data)));
	//   11   23:new             #26  <Class String>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:getfield        #44  <Field byte[] NetworkResponse.data>
	//   15   31:invokespecial   #60  <Method void String(byte[])>
	//   16   34:astore_2        
		}
		return Response.success(obj, HttpHeaderParser.parseCacheHeaders(networkresponse));
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokestatic    #64  <Method com.android.volley.Cache$Entry HttpHeaderParser.parseCacheHeaders(NetworkResponse)>
	//   20   40:invokestatic    #70  <Method Response Response.success(Object, com.android.volley.Cache$Entry)>
	//   21   43:areturn         
	}

	private final com.android.volley.Response.Listener mListener;
}
