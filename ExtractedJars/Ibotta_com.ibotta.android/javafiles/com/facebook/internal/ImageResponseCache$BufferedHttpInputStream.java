// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import java.io.*;
import java.net.HttpURLConnection;

// Referenced classes of package com.facebook.internal:
//			ImageResponseCache, Utility

private static class ImageResponseCache$BufferedHttpInputStream extends BufferedInputStream
{

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BufferedInputStream.close()>
		Utility.disconnectQuietly(((java.net.URLConnection) (connection)));
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field HttpURLConnection connection>
	//    4    8:invokestatic    #29  <Method void Utility.disconnectQuietly(java.net.URLConnection)>
	//    5   11:return          
	}

	HttpURLConnection connection;

	ImageResponseCache$BufferedHttpInputStream(InputStream inputstream, HttpURLConnection httpurlconnection)
	{
		super(inputstream, 8192);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          8192
	//    3    5:invokespecial   #14  <Method void BufferedInputStream(InputStream, int)>
		connection = httpurlconnection;
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:putfield        #16  <Field HttpURLConnection connection>
	//    7   13:return          
	}
}
