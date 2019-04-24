// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.zzak;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapj, zzaod, zzaos

class zzapj$6 extends a
{

	protected BleDevicesResult zzU(Status status)
	{
		return BleDevicesResult.zzad(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method BleDevicesResult BleDevicesResult.zzad(Status)>
	//    2    4:areturn         
	}

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaod)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class zzaod>
	//    3    5:invokevirtual   #32  <Method void zza(zzaod)>
	//    4    8:return          
	}

	protected void zza(zzaod zzaod1)
		throws RemoteException
	{
		a a = new a(((b) (this)), ((zzapj$1) (null)));
	//    0    0:new             #35  <Class zzapj$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #38  <Method void zzapj$zza(zzaad$zzb, zzapj$1)>
	//    5    9:astore_2        
		((zzaos)zzaod1.zzxD()).zza(new zzak(((zzapt) (a))));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #42  <Method android.os.IInterface zzaod.zzxD()>
	//    8   14:checkcast       #44  <Class zzaos>
	//    9   17:new             #46  <Class zzak>
	//   10   20:dup             
	//   11   21:aload_2         
	//   12   22:invokespecial   #49  <Method void zzak(zzapt)>
	//   13   25:invokeinterface #52  <Method void zzaos.zza(zzak)>
	//   14   30:return          
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzU(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method BleDevicesResult zzU(Status)>
	//    3    5:areturn         
	}

	zzapj$6(zzapj zzapj1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void zzaod$zza(GoogleApiClient)>
	//    3    5:return          
	}
}
