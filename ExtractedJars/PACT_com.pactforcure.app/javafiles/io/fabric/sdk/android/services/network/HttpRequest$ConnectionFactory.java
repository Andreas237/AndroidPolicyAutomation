// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.io.IOException;
import java.net.*;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

public static interface HttpRequest$ConnectionFactory
{

	public abstract HttpURLConnection create(URL url)
		throws IOException;

	public abstract HttpURLConnection create(URL url, Proxy proxy)
		throws IOException;

	public static final HttpRequest$ConnectionFactory DEFAULT = new HttpRequest.ConnectionFactory() {

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

	}
;

	/* static  */
	/* { */
	//    0    0:new             #9   <Class HttpRequest$ConnectionFactory$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void HttpRequest$ConnectionFactory$1()>
	//    3    7:putstatic       #18  <Field HttpRequest$ConnectionFactory DEFAULT>
	//*   4   10:return          
	/* } */
}
