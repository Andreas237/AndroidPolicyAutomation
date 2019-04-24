// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzn, zzcx

class zzn$3 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.b b)
		throws RemoteException
	{
		zza((zzcx)b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class zzcx>
	//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zzv(((com.google.android.gms.internal.zzb) (this)), zzbTI);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field String zzbTI>
	//    4    6:invokevirtual   #34  <Method void zzcx.zzv(com.google.android.gms.internal.zzaad$zzb, String)>
	//    5    9:return          
	}

	protected com.google.android.gms.wearable.lityApi.AddLocalCapabilityResult zzbR(Status status)
	{
		return ((com.google.android.gms.wearable.lityApi.AddLocalCapabilityResult) (new a(status)));
	//    0    0:new             #38  <Class zzn$zza>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #41  <Method void zzn$zza(Status)>
	//    4    8:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbR(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method com.google.android.gms.wearable.CapabilityApi$AddLocalCapabilityResult zzbR(Status)>
	//    3    5:areturn         
	}

	final String zzbTI;

	zzn$3(zzn zzn1, GoogleApiClient googleapiclient, String s)
	{
		zzbTI = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field String zzbTI>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
	//    6   10:return          
	}
}
