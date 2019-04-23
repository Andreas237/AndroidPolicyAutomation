// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.google.android.gms.internal.ads:
//			rb

final class ry extends FilterInputStream
{

	ry(HttpURLConnection httpurlconnection)
	{
		super(rb.a(httpurlconnection));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #13  <Method java.io.InputStream rb.a(HttpURLConnection)>
	//    3    5:invokespecial   #16  <Method void FilterInputStream(java.io.InputStream)>
		a = httpurlconnection;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #18  <Field HttpURLConnection a>
	//    7   13:return          
	}

	public final void close()
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void FilterInputStream.close()>
		a.disconnect();
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field HttpURLConnection a>
	//    4    8:invokevirtual   #28  <Method void HttpURLConnection.disconnect()>
	//    5   11:return          
	}

	private final HttpURLConnection a;
}
