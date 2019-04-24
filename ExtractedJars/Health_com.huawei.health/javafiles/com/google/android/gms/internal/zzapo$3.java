// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.zzbm;

// Referenced classes of package com.google.android.gms.internal:
//			zzapo, zzaoi, zzapr, zzaox

class zzapo$3 extends c
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoi)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class zzaoi>
	//    3    5:invokevirtual   #27  <Method void zza(zzaoi)>
	//    4    8:return          
	}

	protected void zza(zzaoi zzaoi1)
		throws RemoteException
	{
		zzapr zzapr1 = new zzapr(((b) (this)));
	//    0    0:new             #30  <Class zzapr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void zzapr(zzaad$zzb)>
	//    4    8:astore_2        
		((zzaox)zzaoi1.zzxD()).zza(new zzbm(zzaUX, false, ((zzapf) (zzapr1))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #37  <Method android.os.IInterface zzaoi.zzxD()>
	//    7   13:checkcast       #39  <Class zzaox>
	//    8   16:new             #41  <Class zzbm>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field Subscription zzaUX>
	//   12   24:iconst_0        
	//   13   25:aload_2         
	//   14   26:invokespecial   #44  <Method void zzbm(Subscription, boolean, zzapf)>
	//   15   29:invokeinterface #47  <Method void zzaox.zza(zzbm)>
	//   16   34:return          
	}

	final Subscription zzaUX;

	zzapo$3(zzapo zzapo1, GoogleApiClient googleapiclient, Subscription subscription)
	{
		zzaUX = subscription;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field Subscription zzaUX>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzaoi$zzc(GoogleApiClient)>
	//    6   10:return          
	}
}
