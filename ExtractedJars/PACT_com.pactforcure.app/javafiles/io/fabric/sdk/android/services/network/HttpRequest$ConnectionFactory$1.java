// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.IOException;
import java.net.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

static final class HttpRequest$ConnectionFactory$1
	implements HttpRequest.ConnectionFactory
{

	public HttpURLConnection create(URL url)
		throws IOException
	{
		return (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #26  <Class HttpURLConnection>
	//    3    7:areturn         
	}

	public HttpURLConnection create(URL url, Proxy proxy)
		throws IOException
	{
		return (HttpURLConnection)url.openConnection(proxy);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #31  <Method java.net.URLConnection URL.openConnection(Proxy)>
	//    3    5:checkcast       #26  <Class HttpURLConnection>
	//    4    8:areturn         
	}

	HttpRequest$ConnectionFactory$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
