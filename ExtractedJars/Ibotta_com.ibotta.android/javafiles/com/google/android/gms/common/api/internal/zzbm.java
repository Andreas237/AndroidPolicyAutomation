// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;


// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbl

final class zzbm
	implements Runnable
{

	zzbm(zzbl zzbl1)
	{
		zzkm = zzbl1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzbl zzkm>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		GoogleApiManager.zza.zze(zzkm.zzkk).disconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzbl zzkm>
	//    2    4:getfield        #23  <Field GoogleApiManager$zza zzbl.zzkk>
	//    3    7:invokestatic    #29  <Method com.google.android.gms.common.api.Api$Client GoogleApiManager$zza.zze(GoogleApiManager$zza)>
	//    4   10:invokeinterface #34  <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
	//    5   15:return          
	}

	private final zzbl zzkm;
}
