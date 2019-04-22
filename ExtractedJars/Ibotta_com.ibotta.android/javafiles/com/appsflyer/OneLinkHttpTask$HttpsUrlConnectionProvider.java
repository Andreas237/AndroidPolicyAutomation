// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.appsflyer:
//			OneLinkHttpTask

public static class OneLinkHttpTask$HttpsUrlConnectionProvider
{

	static HttpsURLConnection _mth02CA(String s)
		throws IOException
	{
		return (HttpsURLConnection)URLConnectionInstrumentation.openConnection((new URL(s)).openConnection());
	//    0    0:new             #19  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void URL(String)>
	//    4    8:invokevirtual   #26  <Method java.net.URLConnection URL.openConnection()>
	//    5   11:invokestatic    #31  <Method java.net.URLConnection URLConnectionInstrumentation.openConnection(java.net.URLConnection)>
	//    6   14:checkcast       #33  <Class HttpsURLConnection>
	//    7   17:areturn         
	}

	public OneLinkHttpTask$HttpsUrlConnectionProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
