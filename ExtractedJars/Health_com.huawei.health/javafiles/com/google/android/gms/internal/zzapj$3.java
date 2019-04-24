// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.fitness.request.zzb;

// Referenced classes of package com.google.android.gms.internal:
//			zzapj, zzaod, zzapr, zzaos

class zzapj$3 extends c
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaod)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class zzaod>
	//    3    5:invokevirtual   #28  <Method void zza(zzaod)>
	//    4    8:return          
	}

	protected void zza(zzaod zzaod1)
		throws RemoteException
	{
		zzapr zzapr1 = new zzapr(((b) (this)));
	//    0    0:new             #31  <Class zzapr>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void zzapr(zzaad$zzb)>
	//    4    8:astore_2        
		((zzaos)zzaod1.zzxD()).zza(new zzb(zzaUF, ((com.google.android.gms.fitness.data.BleDevice) (null)), ((zzapf) (zzapr1))));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #38  <Method android.os.IInterface zzaod.zzxD()>
	//    7   13:checkcast       #40  <Class zzaos>
	//    8   16:new             #42  <Class zzb>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #15  <Field String zzaUF>
	//   12   24:aconst_null     
	//   13   25:aload_2         
	//   14   26:invokespecial   #45  <Method void zzb(String, com.google.android.gms.fitness.data.BleDevice, zzapf)>
	//   15   29:invokeinterface #48  <Method void zzaos.zza(zzb)>
	//   16   34:return          
	}

	final String zzaUF;

	zzapj$3(zzapj zzapj1, GoogleApiClient googleapiclient, String s)
	{
		zzaUF = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field String zzaUF>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzaod$zzc(GoogleApiClient)>
	//    6   10:return          
	}
}
