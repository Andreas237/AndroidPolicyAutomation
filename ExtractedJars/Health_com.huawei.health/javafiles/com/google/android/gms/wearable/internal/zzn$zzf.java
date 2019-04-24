// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzn, zzcx

static final class zzn$zzf extends zzm
{

	public volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzcx)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class zzcx>
	//    3    5:invokevirtual   #30  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.b) (this)), zzbTL);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
	//    4    6:invokevirtual   #34  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.CapabilityApi$CapabilityListener)>
		zzbTL = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
	//    8   14:return          
	}

	public Status zzb(Status status)
	{
		zzbTL = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
		return status;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	private com.google.android.gms.wearable.tyApi.CapabilityListener zzbTL;

	private zzn$zzf(GoogleApiClient googleapiclient, com.google.android.gms.wearable.tyApi.CapabilityListener capabilitylistener)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
		zzbTL = capabilitylistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field com.google.android.gms.wearable.CapabilityApi$CapabilityListener zzbTL>
	//    6   10:return          
	}

	zzn$zzf(GoogleApiClient googleapiclient, com.google.android.gms.wearable.tyApi.CapabilityListener capabilitylistener, zzn._cls1 _pcls1)
	{
		this(googleapiclient, capabilitylistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void zzn$zzf(GoogleApiClient, com.google.android.gms.wearable.CapabilityApi$CapabilityListener)>
	//    4    6:return          
	}
}
