// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//			zzach, zzacj, zzacl

class zzach$1 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzacj)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class zzacj>
	//    3    5:invokevirtual   #24  <Method void zza(zzacj)>
	//    4    8:return          
	}

	protected void zza(zzacj zzacj1)
		throws RemoteException
	{
		((zzacl)zzacj1.zzxD()).zza(((zzack) (new a(((b) (this))))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method android.os.IInterface zzacj.zzxD()>
	//    2    4:checkcast       #31  <Class zzacl>
	//    3    7:new             #33  <Class zzach$zza>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #36  <Method void zzach$zza(zzaad$zzb)>
	//    7   15:invokeinterface #39  <Method void zzacl.zza(zzack)>
	//    8   20:return          
	}

	zzach$1(zzach zzach1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #14  <Method void zzaci$zza(GoogleApiClient)>
	//    3    5:return          
	}
}
