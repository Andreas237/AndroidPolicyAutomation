// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfp

final class zzfr extends BroadcastReceiver
{

	zzfr(zzfp zzfp1)
	{
		zzagk = zzfp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzfp zzagk>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		zzfp.zza(zzagk, 3);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzfp zzagk>
	//    2    4:iconst_3        
	//    3    5:invokestatic    #22  <Method void zzfp.zza(zzfp, int)>
	//    4    8:return          
	}

	private final zzfp zzagk;
}
