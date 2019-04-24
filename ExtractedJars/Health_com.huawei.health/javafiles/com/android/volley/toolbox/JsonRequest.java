// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import com.android.volley.*;
import java.io.UnsupportedEncodingException;

public abstract class JsonRequest extends Request
{

	public JsonRequest(int i, String s, String s1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		super(i, s, errorlistener);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload           5
	//    4    5:invokespecial   #34  <Method void Request(int, String, com.android.volley.Response$ErrorListener)>
		mListener = listener;
	//    5    8:aload_0         
	//    6    9:aload           4
	//    7   11:putfield        #36  <Field com.android.volley.Response$Listener mListener>
		mRequestBody = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #38  <Field String mRequestBody>
	//   11   19:return          
	}

	public JsonRequest(String s, String s1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
	{
		this(-1, s, s1, listener, errorlistener);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:invokespecial   #43  <Method void JsonRequest(int, String, String, com.android.volley.Response$Listener, com.android.volley.Response$ErrorListener)>
	//    7   10:return          
	}

	public void deliverResponse(Object obj)
	{
		mListener.onResponse(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field com.android.volley.Response$Listener mListener>
	//    2    4:aload_1         
	//    3    5:invokeinterface #51  <Method void com.android.volley.Response$Listener.onResponse(Object)>
	//    4   10:return          
	}

	public byte[] getBody()
	{
		if(mRequestBody == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field String mRequestBody>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		byte abyte0[];
		try
		{
			abyte0 = mRequestBody.getBytes("utf-8");
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field String mRequestBody>
	//    7   13:ldc1            #9   <String "utf-8">
	//    8   15:invokevirtual   #60  <Method byte[] String.getBytes(String)>
	//    9   18:astore_1        
		}
	//*  10   19:aload_1         
	//*  11   20:areturn         
		catch(UnsupportedEncodingException unsupportedencodingexception)
	//*  12   21:astore_1        
		{
			VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
				mRequestBody, "utf-8"
			});
	//   13   22:ldc1            #62  <String "Unsupported Encoding while trying to get the bytes of %s using %s">
	//   14   24:iconst_2        
	//   15   25:anewarray       Object[]
	//   16   28:dup             
	//   17   29:iconst_0        
	//   18   30:aload_0         
	//   19   31:getfield        #38  <Field String mRequestBody>
	//   20   34:aastore         
	//   21   35:dup             
	//   22   36:iconst_1        
	//   23   37:ldc1            #9   <String "utf-8">
	//   24   39:aastore         
	//   25   40:invokestatic    #68  <Method void VolleyLog.wtf(String, Object[])>
			return null;
	//   26   43:aconst_null     
	//   27   44:areturn         
		}
		return abyte0;
	}

	public String getBodyContentType()
	{
		return PROTOCOL_CONTENT_TYPE;
	//    0    0:getstatic       #28  <Field String PROTOCOL_CONTENT_TYPE>
	//    1    3:areturn         
	}

	public byte[] getPostBody()
	{
		return getBody();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method byte[] getBody()>
	//    2    4:areturn         
	}

	public String getPostBodyContentType()
	{
		return getBodyContentType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #76  <Method String getBodyContentType()>
	//    2    4:areturn         
	}

	public abstract Response parseNetworkResponse(NetworkResponse networkresponse);

	protected static final String PROTOCOL_CHARSET = "utf-8";
	private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[] {
		"utf-8"
	});
	private final com.android.volley.Response.Listener mListener;
	private final String mRequestBody;

	static 
	{
	//    0    0:ldc1            #18  <String "application/json; charset=%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #9   <String "utf-8">
	//    6   10:aastore         
	//    7   11:invokestatic    #26  <Method String String.format(String, Object[])>
	//    8   14:putstatic       #28  <Field String PROTOCOL_CONTENT_TYPE>
	//*   9   17:return          
	}
}
