// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package b.a.a.a.a.e;

import java.net.*;

// Referenced classes of package b.a.a.a.a.e:
//			d

static final class d$b$1
	implements d.b
{

	public HttpURLConnection a(URL url)
	{
		return (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #24  <Class HttpURLConnection>
	//    3    7:areturn         
	}

	public HttpURLConnection a(URL url, Proxy proxy)
	{
		return (HttpURLConnection)url.openConnection(proxy);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #28  <Method java.net.URLConnection URL.openConnection(Proxy)>
	//    3    5:checkcast       #24  <Class HttpURLConnection>
	//    4    8:areturn         
	}

	d$b$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
