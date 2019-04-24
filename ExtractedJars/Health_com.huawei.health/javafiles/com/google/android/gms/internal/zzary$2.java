// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;

// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzash, zzabi

class zzary$2 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzash)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class zzash>
	//    3    5:invokevirtual   #28  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		zzash1.zzb(zzabi.zza(((Object) (zzbkx)), ((Class) (com/google/android/gms/location/LocationCallback)).getSimpleName()), ((zzasc) (new b(((b) (this))))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field LocationCallback zzbkx>
	//    3    5:ldc1            #31  <Class LocationCallback>
	//    4    7:invokevirtual   #37  <Method String Class.getSimpleName()>
	//    5   10:invokestatic    #42  <Method zzabh$zzb zzabi.zza(Object, String)>
	//    6   13:new             #44  <Class zzary$zzb>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #47  <Method void zzary$zzb(zzaad$zzb)>
	//   10   21:invokevirtual   #51  <Method void zzash.zzb(zzabh$zzb, zzasc)>
	//   11   24:return          
	}

	final LocationCallback zzbkx;

	zzary$2(zzary zzary1, GoogleApiClient googleapiclient, LocationCallback locationcallback)
	{
		zzbkx = locationcallback;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field LocationCallback zzbkx>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
