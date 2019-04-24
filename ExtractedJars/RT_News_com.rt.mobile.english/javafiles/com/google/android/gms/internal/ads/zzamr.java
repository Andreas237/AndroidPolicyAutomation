// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamq

final class zzamr extends BroadcastReceiver
{

	zzamr(zzamq zzamq1)
	{
		zzcuf = zzamq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzamq zzcuf>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	public final void onReceive(Context context, Intent intent)
	{
		zzamq.zza(zzcuf, context, intent);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field zzamq zzcuf>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #22  <Method void zzamq.zza(zzamq, Context, Intent)>
	//    5    9:return          
	}

	private final zzamq zzcuf;
}
