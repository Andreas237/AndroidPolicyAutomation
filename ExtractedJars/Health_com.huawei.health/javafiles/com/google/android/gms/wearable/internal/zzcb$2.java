// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzcb, zzcx

class zzcb$2 extends zzm
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
		zzcx1.zzy(((com.google.android.gms.internal.zb) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #30  <Method void zzcx.zzy(com.google.android.gms.internal.zzaad$zzb)>
	//    3    5:return          
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzcc(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method com.google.android.gms.wearable.NodeApi$GetConnectedNodesResult zzcc(Status)>
	//    3    5:areturn         
	}

	protected com.google.android.gms.wearable..GetConnectedNodesResult zzcc(Status status)
	{
		return ((com.google.android.gms.wearable..GetConnectedNodesResult) (new a(status, ((java.util.List) (new ArrayList())))));
	//    0    0:new             #38  <Class zzcb$zza>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #40  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void ArrayList()>
	//    6   12:invokespecial   #46  <Method void zzcb$zza(Status, java.util.List)>
	//    7   15:areturn         
	}

	zzcb$2(zzcb zzcb1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
	//    3    5:return          
	}
}
