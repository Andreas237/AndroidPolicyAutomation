// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzcd, zzcx

final class zzda
	implements zzcd
{

	zzda(zzcx zzcx1, Runnable runnable)
	{
		zzacg = zzcx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzcx zzacg>
		zzacf = runnable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Runnable zzacf>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(Throwable throwable)
	{
		zzcx.zza(zzacg).post(zzacf);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzcx zzacg>
	//    2    4:invokestatic    #27  <Method Handler zzcx.zza(zzcx)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field Runnable zzacf>
	//    5   11:invokevirtual   #33  <Method boolean Handler.post(Runnable)>
	//    6   14:pop             
	//    7   15:return          
	}

	private final Runnable zzacf;
	private final zzcx zzacg;
}
