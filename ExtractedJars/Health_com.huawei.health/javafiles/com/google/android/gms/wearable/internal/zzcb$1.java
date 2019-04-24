// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzcb, zzcx

class zzcb$1 extends zzm
{

	public volatile void zza(com.google.android.gms.common.api. )
		throws RemoteException
	{
		zza((zzcx));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class zzcx>
	//    3    5:invokevirtual   #25  <Method void zza(zzcx)>
	//    4    8:return          
	}

	protected void zza(zzcx zzcx1)
		throws RemoteException
	{
		zzcx1.zzx(((com.google.android.gms.internal.zb) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #30  <Method void zzcx.zzx(com.google.android.gms.internal.zzaad$zzb)>
	//    3    5:return          
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzcb(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method com.google.android.gms.wearable.NodeApi$GetLocalNodeResult zzcb(Status)>
	//    3    5:areturn         
	}

	protected com.google.android.gms.wearable..GetLocalNodeResult zzcb(Status status)
	{
		return ((com.google.android.gms.wearable..GetLocalNodeResult) (new b(status, ((com.google.android.gms.wearable.Node) (null)))));
	//    0    0:new             #38  <Class zzcb$zzb>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #41  <Method void zzcb$zzb(Status, com.google.android.gms.wearable.Node)>
	//    5    9:areturn         
	}

	zzcb$1(zzcb zzcb1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
	//    3    5:return          
	}
}
