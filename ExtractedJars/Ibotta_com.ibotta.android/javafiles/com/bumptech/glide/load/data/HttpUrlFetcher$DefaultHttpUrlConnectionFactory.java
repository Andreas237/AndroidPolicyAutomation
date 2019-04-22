// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.bumptech.glide.load.data:
//			HttpUrlFetcher

private static class HttpUrlFetcher$DefaultHttpUrlConnectionFactory
	implements HttpUrlFetcher.HttpUrlConnectionFactory
{

	public HttpURLConnection build(URL url)
		throws IOException
	{
		return (HttpURLConnection)URLConnectionInstrumentation.openConnection(url.openConnection());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method java.net.URLConnection URL.openConnection()>
	//    2    4:invokestatic    #30  <Method java.net.URLConnection URLConnectionInstrumentation.openConnection(java.net.URLConnection)>
	//    3    7:checkcast       #32  <Class HttpURLConnection>
	//    4   10:areturn         
	}

	HttpUrlFetcher$DefaultHttpUrlConnectionFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
