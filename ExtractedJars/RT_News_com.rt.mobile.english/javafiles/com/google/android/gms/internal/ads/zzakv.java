// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.http.SslError;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakt

public class zzakv extends zzakt
{

	public zzakv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void zzakt()>
	//    2    4:return          
	}

	public final String zza(SslError sslerror)
	{
		return sslerror.getUrl();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method String SslError.getUrl()>
	//    2    4:areturn         
	}

	public int zzrq()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
