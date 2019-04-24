// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzash

class zzary$5 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzash)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class zzash>
	//    3    5:invokevirtual   #24  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		zzash1.zza(((zzasc) (new b(((b) (this))))));
	//    0    0:aload_1         
	//    1    1:new             #27  <Class zzary$zzb>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #30  <Method void zzary$zzb(zzaad$zzb)>
	//    5    9:invokevirtual   #33  <Method void zzash.zza(zzasc)>
	//    6   12:return          
	}

	zzary$5(zzary zzary1, GoogleApiClient googleapiclient)
	{
		super(googleapiclient);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #14  <Method void zzary$zza(GoogleApiClient)>
	//    3    5:return          
	}
}
