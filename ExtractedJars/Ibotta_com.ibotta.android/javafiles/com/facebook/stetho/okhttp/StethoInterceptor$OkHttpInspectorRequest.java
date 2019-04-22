// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.okhttp;

import com.facebook.stetho.inspector.network.RequestBodyHelper;
import com.squareup.okhttp.*;
import java.io.IOException;
import okio.BufferedSink;
import okio.Okio;

// Referenced classes of package com.facebook.stetho.okhttp:
//			StethoInterceptor

private static class StethoInterceptor$OkHttpInspectorRequest
	implements com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
{

	public byte[] body()
		throws IOException
	{
		BufferedSink bufferedsink;
		RequestBody requestbody;
		requestbody = mRequest.body();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Request mRequest>
	//    2    4:invokevirtual   #37  <Method RequestBody Request.body()>
	//    3    7:astore_2        
		if(requestbody == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		bufferedsink = Okio.buffer(Okio.sink(mRequestBodyHelper.createBodySink(firstHeaderValue("Content-Encoding"))));
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field RequestBodyHelper mRequestBodyHelper>
	//   10   18:aload_0         
	//   11   19:ldc1            #39  <String "Content-Encoding">
	//   12   21:invokevirtual   #43  <Method String firstHeaderValue(String)>
	//   13   24:invokevirtual   #49  <Method java.io.OutputStream RequestBodyHelper.createBodySink(String)>
	//   14   27:invokestatic    #55  <Method okio.Sink Okio.sink(java.io.OutputStream)>
	//   15   30:invokestatic    #59  <Method BufferedSink Okio.buffer(okio.Sink)>
	//   16   33:astore_1        
		requestbody.writeTo(bufferedsink);
	//   17   34:aload_2         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #65  <Method void RequestBody.writeTo(BufferedSink)>
		bufferedsink.close();
	//   20   39:aload_1         
	//   21   40:invokeinterface #70  <Method void BufferedSink.close()>
		return mRequestBodyHelper.getDisplayBody();
	//   22   45:aload_0         
	//   23   46:getfield        #26  <Field RequestBodyHelper mRequestBodyHelper>
	//   24   49:invokevirtual   #73  <Method byte[] RequestBodyHelper.getDisplayBody()>
	//   25   52:areturn         
		Exception exception;
		exception;
	//   26   53:astore_2        
		bufferedsink.close();
	//   27   54:aload_1         
	//   28   55:invokeinterface #70  <Method void BufferedSink.close()>
		throw exception;
	//   29   60:aload_2         
	//   30   61:athrow          
	}

	public String firstHeaderValue(String s)
	{
		return mRequest.header(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Request mRequest>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #78  <Method String Request.header(String)>
	//    4    8:areturn         
	}

	public String friendlyName()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Integer friendlyNameExtra()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int headerCount()
	{
		return mRequest.headers().size();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Request mRequest>
	//    2    4:invokevirtual   #88  <Method Headers Request.headers()>
	//    3    7:invokevirtual   #93  <Method int Headers.size()>
	//    4   10:ireturn         
	}

	public String headerName(int i)
	{
		return mRequest.headers().name(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Request mRequest>
	//    2    4:invokevirtual   #88  <Method Headers Request.headers()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #98  <Method String Headers.name(int)>
	//    5   11:areturn         
	}

	public String headerValue(int i)
	{
		return mRequest.headers().value(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Request mRequest>
	//    2    4:invokevirtual   #88  <Method Headers Request.headers()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #102 <Method String Headers.value(int)>
	//    5   11:areturn         
	}

	public String id()
	{
		return mRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String mRequestId>
	//    2    4:areturn         
	}

	public String method()
	{
		return mRequest.method();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Request mRequest>
	//    2    4:invokevirtual   #106 <Method String Request.method()>
	//    3    7:areturn         
	}

	public String url()
	{
		return mRequest.urlString();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Request mRequest>
	//    2    4:invokevirtual   #110 <Method String Request.urlString()>
	//    3    7:areturn         
	}

	private final Request mRequest;
	private RequestBodyHelper mRequestBodyHelper;
	private final String mRequestId;

	public StethoInterceptor$OkHttpInspectorRequest(String s, Request request, RequestBodyHelper requestbodyhelper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mRequestId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String mRequestId>
		mRequest = request;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Request mRequest>
		mRequestBodyHelper = requestbodyhelper;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field RequestBodyHelper mRequestBodyHelper>
	//   11   19:return          
	}
}
