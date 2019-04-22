// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


final class zzbi
	implements Runnable
{

	zzbi(GoogleApiManager.zza zza)
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

	public final void run()
	{
		GoogleApiManager.zza.zzc(zzkk);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field GoogleApiManager$zza zzkk>
	//    2    4:invokestatic    #22  <Method void GoogleApiManager$zza.zzc(GoogleApiManager$zza)>
	//    3    7:return          
	}

	private final GoogleApiManager.zza zzkk;
}
