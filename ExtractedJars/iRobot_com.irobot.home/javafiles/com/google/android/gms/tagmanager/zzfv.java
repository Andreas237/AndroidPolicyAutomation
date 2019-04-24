// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfx

final class zzfv
	implements zzfx
{

	zzfv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final HttpURLConnection zzc(URL url)
	{
		return (HttpURLConnection)url.openConnection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #19  <Method java.net.URLConnection URL.openConnection()>
	//    2    4:checkcast       #21  <Class HttpURLConnection>
	//    3    7:areturn         
	}
}
