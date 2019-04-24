// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//			zzabz, zzacb, zzacd

class zzabz$1 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzacb)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class zzacb>
	//    3    5:invokevirtual   #24  <Method void zza(zzacb)>
	//    4    8:return          
	}

	protected void zza(zzacb zzacb1)
		throws RemoteException
	{
		((zzacd)zzacb1.zzwW()).zza(((zzacc) (new a((() (this))))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method android.os.IInterface zzacb.zzwW()>
	//    2    4:checkcast       #31  <Class zzacd>
	//    3    7:new             #33  <Class zzabz$zza>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #36  <Method void zzabz$zza(zzzv$zzb)>
	//    7   15:invokeinterface #39  <Method void zzacd.zza(zzacc)>
	//    8   20:return          
	}

	zzabz$1(zzabz zzabz1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #14  <Method void zzaca$zza(GoogleApiClient)>
	//    3    5:return          
	}
}
