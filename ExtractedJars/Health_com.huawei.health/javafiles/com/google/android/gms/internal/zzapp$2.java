// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.data.zzs;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.zzav;

// Referenced classes of package com.google.android.gms.internal:
//			zzapp, zzaoj, zzapr, zzaoy

class zzapp$2 extends c
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoj)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class zzaoj>
	//    3    5:invokevirtual   #35  <Method void zza(zzaoj)>
	//    4    8:return          
	}

	protected void zza(zzaoj zzaoj1)
		throws RemoteException
	{
		zzapr zzapr1 = new zzapr(((b) (this)));
	//    0    0:new             #38  <Class zzapr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #41  <Method void zzapr(zzaad$zzb)>
	//    4    8:astore_2        
		((zzaoy)zzaoj1.zzxD()).zza(new zzav(zzaVa, zzaVb, zzaVc, ((zzapf) (zzapr1))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #45  <Method android.os.IInterface zzaoj.zzxD()>
	//    7   13:checkcast       #47  <Class zzaoy>
	//    8   16:new             #49  <Class zzav>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #19  <Field SensorRequest zzaVa>
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field zzs zzaVb>
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field PendingIntent zzaVc>
	//   16   32:aload_2         
	//   17   33:invokespecial   #52  <Method void zzav(SensorRequest, zzs, PendingIntent, zzapf)>
	//   18   36:invokeinterface #55  <Method void zzaoy.zza(zzav)>
	//   19   41:return          
	}

	protected Status zzb(Status status)
	{
		return status;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #61  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	final SensorRequest zzaVa;
	final zzs zzaVb;
	final PendingIntent zzaVc;

	zzapp$2(zzapp zzapp1, GoogleApiClient googleapiclient, SensorRequest sensorrequest, zzs zzs, PendingIntent pendingintent)
	{
		zzaVa = sensorrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #19  <Field SensorRequest zzaVa>
		zzaVb = zzs;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field zzs zzaVb>
		zzaVc = pendingintent;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #23  <Field PendingIntent zzaVc>
		super(googleapiclient);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokespecial   #26  <Method void zzaoj$zzc(GoogleApiClient)>
	//   12   22:return          
	}
}
