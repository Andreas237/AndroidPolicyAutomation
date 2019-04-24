// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzn, zzcx

class zzn$1 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.b b)
		throws RemoteException
	{
		zza((zzcx)b);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class zzcx>
	//    3    5:invokevirtual   #33  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zzh(((com.google.android.gms.internal.zzb) (this)), zzbTI, zzbTJ);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #18  <Field String zzbTI>
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field int zzbTJ>
	//    6   10:invokevirtual   #38  <Method void zzcx.zzh(com.google.android.gms.internal.zzaad$zzb, String, int)>
	//    7   13:return          
	}

	protected com.google.android.gms.wearable.lityApi.GetCapabilityResult zzbP(Status status)
	{
		return ((com.google.android.gms.wearable.lityApi.GetCapabilityResult) (new e(status, ((com.google.android.gms.wearable.CapabilityInfo) (null)))));
	//    0    0:new             #42  <Class zzn$zze>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #45  <Method void zzn$zze(Status, com.google.android.gms.wearable.CapabilityInfo)>
	//    5    9:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbP(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #49  <Method com.google.android.gms.wearable.CapabilityApi$GetCapabilityResult zzbP(Status)>
	//    3    5:areturn         
	}

	final String zzbTI;
	final int zzbTJ;

	zzn$1(zzn zzn1, GoogleApiClient googleapiclient, String s, int i)
	{
		zzbTI = s;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #18  <Field String zzbTI>
		zzbTJ = i;
	//    3    5:aload_0         
	//    4    6:iload           4
	//    5    8:putfield        #20  <Field int zzbTJ>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #23  <Method void zzm(GoogleApiClient)>
	//    9   16:return          
	}
}
