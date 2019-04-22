// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.okhttp;

import com.squareup.okhttp.*;

// Referenced classes of package com.facebook.stetho.okhttp:
//			StethoInterceptor

private static class StethoInterceptor$OkHttpInspectorResponse
	implements com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
{

	public int connectionId()
	{
		return ((Object) (mConnection)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Connection mConnection>
	//    2    4:invokevirtual   #36  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public boolean connectionReused()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String firstHeaderValue(String s)
	{
		return mResponse.header(s);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Response mResponse>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method String Response.header(String)>
	//    4    8:areturn         
	}

	public boolean fromDiskCache()
	{
		return mResponse.cacheResponse() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Response mResponse>
	//    2    4:invokevirtual   #52  <Method Response Response.cacheResponse()>
	//    3    7:ifnull          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public int headerCount()
	{
		return mResponse.headers().size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Response mResponse>
	//    2    4:invokevirtual   #57  <Method Headers Response.headers()>
	//    3    7:invokevirtual   #62  <Method int Headers.size()>
	//    4   10:ireturn         
	}

	public String headerName(int i)
	{
		return mResponse.headers().name(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Response mResponse>
	//    2    4:invokevirtual   #57  <Method Headers Response.headers()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #67  <Method String Headers.name(int)>
	//    5   11:areturn         
	}

	public String headerValue(int i)
	{
		return mResponse.headers().value(i);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Response mResponse>
	//    2    4:invokevirtual   #57  <Method Headers Response.headers()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #71  <Method String Headers.value(int)>
	//    5   11:areturn         
	}

	public String reasonPhrase()
	{
		return mResponse.message();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Response mResponse>
	//    2    4:invokevirtual   #76  <Method String Response.message()>
	//    3    7:areturn         
	}

	public String requestId()
	{
		return mRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String mRequestId>
	//    2    4:areturn         
	}

	public int statusCode()
	{
		return mResponse.code();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Response mResponse>
	//    2    4:invokevirtual   #81  <Method int Response.code()>
	//    3    7:ireturn         
	}

	public String url()
	{
		return mRequest.urlString();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:invokevirtual   #87  <Method String Request.urlString()>
	//    3    7:areturn         
	}

	private final Connection mConnection;
	private final Request mRequest;
	private final String mRequestId;
	private final Response mResponse;

	public StethoInterceptor$OkHttpInspectorResponse(String s, Request request, Response response, Connection connection)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mRequestId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String mRequestId>
		mRequest = request;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Request mRequest>
		mResponse = response;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Response mResponse>
		mConnection = connection;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field Connection mConnection>
	//   14   25:return          
	}
}
