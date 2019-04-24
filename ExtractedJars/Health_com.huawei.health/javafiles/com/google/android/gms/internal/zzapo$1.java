// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.request.zzam;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzapo, zzaoi, zzaox

class zzapo$1 extends a
{

	protected ListSubscriptionsResult zzZ(Status status)
	{
		return ListSubscriptionsResult.zzah(status);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method ListSubscriptionsResult ListSubscriptionsResult.zzah(Status)>
	//    2    4:areturn         
	}

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzaoi)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class zzaoi>
	//    3    5:invokevirtual   #32  <Method void zza(zzaoi)>
	//    4    8:return          
	}

	protected void zza(zzaoi zzaoi1)
		throws RemoteException
	{
		a a = new a(((b) (this)), ((zzapo$1) (null)));
	//    0    0:new             #35  <Class zzapo$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #38  <Method void zzapo$zza(zzaad$zzb, zzapo$1)>
	//    5    9:astore_2        
		((zzaox)zzaoi1.zzxD()).zza(new zzam(((com.google.android.gms.fitness.data.DataType) (null)), ((zzapa) (a))));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #42  <Method android.os.IInterface zzaoi.zzxD()>
	//    8   14:checkcast       #44  <Class zzaox>
	//    9   17:new             #46  <Class zzam>
	//   10   20:dup             
	//   11   21:aconst_null     
	//   12   22:aload_2         
	//   13   23:invokespecial   #49  <Method void zzam(com.google.android.gms.fitness.data.DataType, zzapa)>
	//   14   26:invokeinterface #52  <Method void zzaox.zza(zzam)>
	//   15   31:return          
	}

	protected Result zzc(Status status)
	{
		return ((Result) (zzZ(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method ListSubscriptionsResult zzZ(Status)>
	//    3    5:areturn         
	}

	zzapo$1(zzapo zzapo1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void zzaoi$zza(GoogleApiClient)>
	//    3    5:return          
	}
}
