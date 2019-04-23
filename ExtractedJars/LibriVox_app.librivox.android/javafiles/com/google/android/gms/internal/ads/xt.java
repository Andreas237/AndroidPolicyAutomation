// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.http.SslError;

// Referenced classes of package com.google.android.gms.internal.ads:
//			xr

public class xt extends xr
{

	public xt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void xr()>
	//    2    4:return          
	}

	public final String a(SslError sslerror)
	{
		return sslerror.getUrl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method String SslError.getUrl()>
	//    2    4:areturn         
	}

	public int f()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
