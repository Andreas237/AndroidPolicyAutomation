// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			GoogleApiManager, zzbm

final class zzbl
	implements com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
{

	zzbl(GoogleApiManager.zza zza)
	{
		zzkk = zza;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field GoogleApiManager$zza zzkk>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onSignOutComplete()
	{
		GoogleApiManager.zza(zzkk.zzjy).post(((Runnable) (new zzbm(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field GoogleApiManager$zza zzkk>
	//    2    4:getfield        #23  <Field GoogleApiManager GoogleApiManager$zza.zzjy>
	//    3    7:invokestatic    #29  <Method Handler GoogleApiManager.zza(GoogleApiManager)>
	//    4   10:new             #31  <Class zzbm>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:invokespecial   #34  <Method void zzbm(zzbl)>
	//    8   18:invokevirtual   #40  <Method boolean Handler.post(Runnable)>
	//    9   21:pop             
	//   10   22:return          
	}

	final GoogleApiManager.zza zzkk;
}
