// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package bo.app:
//			f

public class h
{

	public h()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static URLConnection a(URL url)
	{
		URLConnection urlconnection;
		urlconnection = url.openConnection();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method URLConnection URL.openConnection()>
	//    2    4:astore_1        
		if(!url.getProtocol().equals("https"))
			break MISSING_BLOCK_LABEL_40;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #46  <Method String URL.getProtocol()>
	//    5    9:ldc1            #48  <String "https">
	//    6   11:invokevirtual   #54  <Method boolean String.equals(Object)>
	//    7   14:ifeq            40
		((HttpsURLConnection)urlconnection).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (b)));
	//    8   17:aload_1         
	//    9   18:checkcast       #56  <Class HttpsURLConnection>
	//   10   21:getstatic       #27  <Field f b>
	//   11   24:invokevirtual   #60  <Method void HttpsURLConnection.setSSLSocketFactory(javax.net.ssl.SSLSocketFactory)>
		return urlconnection;
	//   12   27:aload_1         
	//   13   28:areturn         
		url;
	//   14   29:astore_0        
		AppboyLogger.e(a, "Exception setting TLS socket factory on url connection.", ((Throwable) (url)));
	//   15   30:getstatic       #20  <Field String a>
	//   16   33:ldc1            #62  <String "Exception setting TLS socket factory on url connection.">
	//   17   35:aload_0         
	//   18   36:invokestatic    #33  <Method int AppboyLogger.e(String, String, Throwable)>
	//   19   39:pop             
		return urlconnection;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/h);
	private static f b;

	static 
	{
	//    0    0:ldc1            #2   <Class h>
	//    1    2:invokestatic    #18  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #20  <Field String a>
		try
		{
			b = new f();
	//    3    8:new             #22  <Class f>
	//    4   11:dup             
	//    5   12:invokespecial   #25  <Method void f()>
	//    6   15:putstatic       #27  <Field f b>
	//    7   18:return          
		}
		catch(Exception exception)
	//*   8   19:astore_0        
		{
			AppboyLogger.e(a, "Exception initializing static TLS socket factory.", ((Throwable) (exception)));
	//    9   20:getstatic       #20  <Field String a>
	//   10   23:ldc1            #29  <String "Exception initializing static TLS socket factory.">
	//   11   25:aload_0         
	//   12   26:invokestatic    #33  <Method int AppboyLogger.e(String, String, Throwable)>
	//   13   29:pop             
		}
	//*  14   30:return          
	}
}
