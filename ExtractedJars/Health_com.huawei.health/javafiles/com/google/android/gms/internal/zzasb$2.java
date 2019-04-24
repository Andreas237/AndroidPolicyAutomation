// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.zzt;

// Referenced classes of package com.google.android.gms.internal:
//			zzasb, zzash

class zzasb$2 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzash)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class zzash>
	//    3    5:invokevirtual   #27  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		zzash1.zza(zzbkD, ((b) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field zzt zzbkD>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #31  <Method void zzash.zza(zzt, zzaad$zzb)>
	//    5    9:return          
	}

	final zzt zzbkD;

	zzasb$2(zzasb zzasb1, GoogleApiClient googleapiclient, zzt zzt)
	{
		zzbkD = zzt;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field zzt zzbkD>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzasb$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
