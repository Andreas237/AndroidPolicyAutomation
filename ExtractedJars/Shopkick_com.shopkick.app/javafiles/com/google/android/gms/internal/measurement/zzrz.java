// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzrx

final class zzrz extends ContentObserver
{

	zzrz(zzrx zzrx1, Handler handler)
	{
		zzbri = zzrx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzrx zzbri>
		super(((Handler) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #13  <Method void ContentObserver(Handler)>
	//    6   10:return          
	}

	public final void onChange(boolean flag)
	{
		zzbri.zztl();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzrx zzbri>
	//    2    4:invokevirtual   #22  <Method void zzrx.zztl()>
	//    3    7:return          
	}

	private final zzrx zzbri;
}
