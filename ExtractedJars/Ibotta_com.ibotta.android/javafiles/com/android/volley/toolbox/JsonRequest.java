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
	//    4    5:invokespecial   #35  <Method void Request(int, String, com.android.volley.Response$ErrorListener)>
	//    5    8:aload_0         
	//    6    9:new             #19  <Class Object>
	//    7   12:dup             
	//    8   13:invokespecial   #37  <Method void Object()>
	//    9   16:putfield        #39  <Field Object mLock>
		mListener = listener;
	//   10   19:aload_0         
	//   11   20:aload           4
	//   12   22:putfield        #41  <Field com.android.volley.Response$Listener mListener>
		mRequestBody = s1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #43  <Field String mRequestBody>
	//   16   30:return          
	}

	protected void deliverResponse(Object obj)
	{
		com.android.volley.Response.Listener listener;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			listener = mListener;
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field com.android.volley.Response$Listener mListener>
	//    7   11:astore_3        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		if(listener != null)
	//*  10   14:aload_3         
	//*  11   15:ifnull          25
			listener.onResponse(obj);
	//   12   18:aload_3         
	//   13   19:aload_1         
	//   14   20:invokeinterface #52  <Method void com.android.volley.Response$Listener.onResponse(Object)>
		return;
	//   15   25:return          
		obj;
	//   16   26:astore_1        
		obj1;
	//   17   27:aload_2         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw obj;
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public byte[] getBody()
	{
		UnsupportedEncodingException unsupportedencodingexception;
		if(mRequestBody == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field String mRequestBody>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		byte abyte0[];
		try
		{
			abyte0 = mRequestBody.getBytes("utf-8");
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field String mRequestBody>
	//    7   13:ldc1            #21  <String "utf-8">
	//    8   15:invokevirtual   #61  <Method byte[] String.getBytes(String)>
	//    9   18:astore_1        
		}
	//*  10   19:aload_1         
	//*  11   20:areturn         
	//*  12   21:ldc1            #63  <String "Unsupported Encoding while trying to get the bytes of %s using %s">
	//*  13   23:iconst_2        
	//*  14   24:anewarray       Object[]
	//*  15   27:dup             
	//*  16   28:iconst_0        
	//*  17   29:aload_0         
	//*  18   30:getfield        #43  <Field String mRequestBody>
	//*  19   33:aastore         
	//*  20   34:dup             
	//*  21   35:iconst_1        
	//*  22   36:ldc1            #21  <String "utf-8">
	//*  23   38:aastore         
	//*  24   39:invokestatic    #69  <Method void VolleyLog.wtf(String, Object[])>
	//*  25   42:aconst_null     
	//*  26   43:areturn         
		// Misplaced declaration of an exception variable
		catch(UnsupportedEncodingException unsupportedencodingexception)
		{
			VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
				mRequestBody, "utf-8"
			});
			return null;
		}
		return abyte0;
	//*  27   44:astore_1        
	//*  28   45:goto            21
	}

	public String getBodyContentType()
	{
		return PROTOCOL_CONTENT_TYPE;
	//    0    0:getstatic       #29  <Field String PROTOCOL_CONTENT_TYPE>
	//    1    3:areturn         
	}

	public byte[] getPostBody()
	{
		return getBody();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method byte[] getBody()>
	//    2    4:areturn         
	}

	public String getPostBodyContentType()
	{
		return getBodyContentType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method String getBodyContentType()>
	//    2    4:areturn         
	}

	protected abstract Response parseNetworkResponse(NetworkResponse networkresponse);

	private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[] {
		"utf-8"
	});
	private com.android.volley.Response.Listener mListener;
	private final Object mLock = new Object();
	private final String mRequestBody;

	static 
	{
	//    0    0:ldc1            #17  <String "application/json; charset=%s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #21  <String "utf-8">
	//    6   10:aastore         
	//    7   11:invokestatic    #27  <Method String String.format(String, Object[])>
	//    8   14:putstatic       #29  <Field String PROTOCOL_CONTENT_TYPE>
	//*   9   17:return          
	}
}
