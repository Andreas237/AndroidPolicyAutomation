// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzcb, zzcx

class zzcb$4 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api. )
		throws RemoteException
	{
		zza((zzcx));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class zzcx>
	//    3    5:invokevirtual   #29  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zza(((com.google.android.gms.internal.zb) (this)), zzbUK);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field com.google.android.gms.wearable.NodeApi$NodeListener zzbUK>
	//    4    6:invokevirtual   #33  <Method void zzcx.zza(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.NodeApi$NodeListener)>
	//    5    9:return          
	}

	public Status zzb(Status status)
	{
		return status;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method Status zzb(Status)>
	//    3    5:areturn         
	}

	final com.google.android.gms.wearable..NodeListener zzbUK;

	zzcb$4(zzcb zzcb1, GoogleApiClient googleapiclient, com.google.android.gms.wearable..NodeListener nodelistener)
	{
		zzbUK = nodelistener;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #16  <Field com.google.android.gms.wearable.NodeApi$NodeListener zzbUK>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #19  <Method void zzm(GoogleApiClient)>
	//    6   10:return          
	}
}
