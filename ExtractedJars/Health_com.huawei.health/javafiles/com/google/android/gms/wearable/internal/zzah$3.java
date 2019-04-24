// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzm, zzah, zzcx

class zzah$3 extends zzm
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
		zzcx1.zzw(((com.google.android.gms.internal.zb) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #30  <Method void zzcx.zzw(com.google.android.gms.internal.zzaad$zzb)>
	//    3    5:return          
	}

	protected DataItemBuffer zzbX(Status status)
	{
		return new DataItemBuffer(DataHolder.zzcJ(status.getStatusCode()));
	//    0    0:new             #34  <Class DataItemBuffer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method int Status.getStatusCode()>
	//    4    8:invokestatic    #46  <Method DataHolder DataHolder.zzcJ(int)>
	//    5   11:invokespecial   #49  <Method void DataItemBuffer(DataHolder)>
	//    6   14:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbX(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method DataItemBuffer zzbX(Status)>
	//    3    5:areturn         
	}

	zzah$3(zzah zzah1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void zzm(GoogleApiClient)>
	//    3    5:return          
	}
}
