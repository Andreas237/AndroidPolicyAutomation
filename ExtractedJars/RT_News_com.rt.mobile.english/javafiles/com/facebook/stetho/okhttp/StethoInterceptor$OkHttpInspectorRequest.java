// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.okhttp;

import com.squareup.okhttp.*;
import java.io.IOException;
import okio.Buffer;

// Referenced classes of package com.facebook.stetho.okhttp:
//			StethoInterceptor

private static class StethoInterceptor$OkHttpInspectorRequest
	implements com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
{

	private byte[] generateBody()
		throws IOException
	{
		RequestBody requestbody = mRequest.body();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:invokevirtual   #37  <Method RequestBody Request.body()>
	//    3    7:astore_1        
		if(requestbody == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
		{
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		} else
		{
			Buffer buffer = new Buffer();
	//    8   14:new             #39  <Class Buffer>
	//    9   17:dup             
	//   10   18:invokespecial   #40  <Method void Buffer()>
	//   11   21:astore_2        
			requestbody.writeTo(((okio.BufferedSink) (buffer)));
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #46  <Method void RequestBody.writeTo(okio.BufferedSink)>
			return buffer.readByteArray();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #49  <Method byte[] Buffer.readByteArray()>
	//   17   31:areturn         
		}
	}

	public byte[] body()
		throws IOException
	{
		if(!mBodyGenerated)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean mBodyGenerated>
	//*   2    4:ifne            20
		{
			mBodyGenerated = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #53  <Field boolean mBodyGenerated>
			mBody = generateBody();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokespecial   #55  <Method byte[] generateBody()>
	//    9   17:putfield        #57  <Field byte[] mBody>
		}
		return mBody;
	//   10   20:aload_0         
	//   11   21:getfield        #57  <Field byte[] mBody>
	//   12   24:areturn         
	}

	public String firstHeaderValue(String s)
	{
		return mRequest.header(s);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method String Request.header(String)>
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
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:invokevirtual   #73  <Method Headers Request.headers()>
	//    3    7:invokevirtual   #78  <Method int Headers.size()>
	//    4   10:ireturn         
	}

	public String headerName(int i)
	{
		return mRequest.headers().name(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:invokevirtual   #73  <Method Headers Request.headers()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #83  <Method String Headers.name(int)>
	//    5   11:areturn         
	}

	public String headerValue(int i)
	{
		return mRequest.headers().value(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:invokevirtual   #73  <Method Headers Request.headers()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #87  <Method String Headers.value(int)>
	//    5   11:areturn         
	}

	public String id()
	{
		return mRequestId;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String mRequestId>
	//    2    4:areturn         
	}

	public String method()
	{
		return mRequest.method();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:invokevirtual   #91  <Method String Request.method()>
	//    3    7:areturn         
	}

	public String url()
	{
		return mRequest.urlString();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Request mRequest>
	//    2    4:invokevirtual   #95  <Method String Request.urlString()>
	//    3    7:areturn         
	}

	private byte mBody[];
	private boolean mBodyGenerated;
	private final Request mRequest;
	private final String mRequestId;

	public StethoInterceptor$OkHttpInspectorRequest(String s, Request request)
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
	//    8   14:return          
	}
}
