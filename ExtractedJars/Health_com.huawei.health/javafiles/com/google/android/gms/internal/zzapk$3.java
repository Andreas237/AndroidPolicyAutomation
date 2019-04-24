// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.zzw;

// Referenced classes of package com.google.android.gms.internal:
//			zzapk, zzaoe, zzapr, zzaot

class zzapk$3 extends c
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoe)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class zzaoe>
	//    3    5:invokevirtual   #24  <Method void zza(zzaoe)>
	//    4    8:return          
	}

	protected void zza(zzaoe zzaoe1)
		throws RemoteException
	{
		zzapr zzapr1 = new zzapr(((b) (this)));
	//    0    0:new             #27  <Class zzapr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #30  <Method void zzapr(zzaad$zzb)>
	//    4    8:astore_2        
		((zzaot)zzaoe1.zzxD()).zza(new zzw(((zzapf) (zzapr1))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method android.os.IInterface zzaoe.zzxD()>
	//    7   13:checkcast       #36  <Class zzaot>
	//    8   16:new             #38  <Class zzw>
	//    9   19:dup             
	//   10   20:aload_2         
	//   11   21:invokespecial   #41  <Method void zzw(zzapf)>
	//   12   24:invokeinterface #44  <Method void zzaot.zza(zzw)>
	//   13   29:return          
	}

	zzapk$3(zzapk zzapk1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #14  <Method void zzaoe$zzc(GoogleApiClient)>
	//    3    5:return          
	}
}
