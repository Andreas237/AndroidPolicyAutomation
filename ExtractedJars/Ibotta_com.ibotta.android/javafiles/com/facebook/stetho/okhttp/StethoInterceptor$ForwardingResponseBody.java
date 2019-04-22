// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.okhttp;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import okio.BufferedSource;
import okio.Okio;

// Referenced classes of package com.facebook.stetho.okhttp:
//			StethoInterceptor

private static class StethoInterceptor$ForwardingResponseBody extends ResponseBody
{

	public long contentLength()
		throws IOException
	{
		return mBody.contentLength();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ResponseBody mBody>
	//    2    4:invokevirtual   #37  <Method long ResponseBody.contentLength()>
	//    3    7:lreturn         
	}

	public MediaType contentType()
	{
		return mBody.contentType();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ResponseBody mBody>
	//    2    4:invokevirtual   #42  <Method MediaType ResponseBody.contentType()>
	//    3    7:areturn         
	}

	public BufferedSource source()
	{
		return mInterceptedSource;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field BufferedSource mInterceptedSource>
	//    2    4:areturn         
	}

	private final ResponseBody mBody;
	private final BufferedSource mInterceptedSource;

	public StethoInterceptor$ForwardingResponseBody(ResponseBody responsebody, InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ResponseBody()>
		mBody = responsebody;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ResponseBody mBody>
		mInterceptedSource = Okio.buffer(Okio.source(inputstream));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #24  <Method okio.Source Okio.source(InputStream)>
	//    8   14:invokestatic    #28  <Method BufferedSource Okio.buffer(okio.Source)>
	//    9   17:putfield        #30  <Field BufferedSource mInterceptedSource>
	//   10   20:return          
	}
}
