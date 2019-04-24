// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.*;

public class ClearCacheRequest extends Request
{

	public ClearCacheRequest(Cache cache, Runnable runnable)
	{
		super(0, ((String) (null)), ((com.android.volley.Response.ErrorListener) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #14  <Method void Request(int, String, com.android.volley.Response$ErrorListener)>
		mCache = cache;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #16  <Field Cache mCache>
		mCallback = runnable;
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:putfield        #18  <Field Runnable mCallback>
	//   11   17:return          
	}

	public void deliverResponse(Object obj)
	{
	//    0    0:return          
	}

	public com.android.volley.Request.Priority getPriority()
	{
		return com.android.volley.Request.Priority.IMMEDIATE;
	//    0    0:getstatic       #29  <Field com.android.volley.Request$Priority com.android.volley.Request$Priority.IMMEDIATE>
	//    1    3:areturn         
	}

	public boolean isCanceled()
	{
		mCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Cache mCache>
	//    2    4:invokeinterface #37  <Method void Cache.clear()>
		if(mCallback != null)
	//*   3    9:aload_0         
	//*   4   10:getfield        #18  <Field Runnable mCallback>
	//*   5   13:ifnull          34
			(new Handler(Looper.getMainLooper())).postAtFrontOfQueue(mCallback);
	//    6   16:new             #39  <Class Handler>
	//    7   19:dup             
	//    8   20:invokestatic    #45  <Method Looper Looper.getMainLooper()>
	//    9   23:invokespecial   #48  <Method void Handler(Looper)>
	//   10   26:aload_0         
	//   11   27:getfield        #18  <Field Runnable mCallback>
	//   12   30:invokevirtual   #52  <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   13   33:pop             
		return true;
	//   14   34:iconst_1        
	//   15   35:ireturn         
	}

	public Response parseNetworkResponse(NetworkResponse networkresponse)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private final Cache mCache;
	private final Runnable mCallback;
}
