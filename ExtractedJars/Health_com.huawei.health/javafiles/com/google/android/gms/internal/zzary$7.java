// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzash, zzasi, zzata, 
//			zzabi

class zzary$7 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzash)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class zzash>
	//    3    5:invokevirtual   #36  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		b b = new b(((b) (this)));
	//    0    0:new             #39  <Class zzary$zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void zzary$zzb(zzaad$zzb)>
	//    4    8:astore_2        
		zzash1.zza(zzasi.zzb(zzbkv), zzabi.zzb(((Object) (zzbkx)), zzata.zzc(zzbkA), ((Class) (com/google/android/gms/location/LocationCallback)).getSimpleName()), ((zzasc) (b)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field LocationRequest zzbkv>
	//    8   14:invokestatic    #48  <Method zzasi zzasi.zzb(LocationRequest)>
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field LocationCallback zzbkx>
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field Looper zzbkA>
	//   13   25:invokestatic    #54  <Method Looper zzata.zzc(Looper)>
	//   14   28:ldc1            #56  <Class LocationCallback>
	//   15   30:invokevirtual   #62  <Method String Class.getSimpleName()>
	//   16   33:invokestatic    #67  <Method zzabh zzabi.zzb(Object, Looper, String)>
	//   17   36:aload_2         
	//   18   37:invokevirtual   #70  <Method void zzash.zza(zzasi, zzabh, zzasc)>
	//   19   40:return          
	}

	final Looper zzbkA;
	final LocationRequest zzbkv;
	final LocationCallback zzbkx;

	zzary$7(zzary zzary1, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
	{
		zzbkv = locationrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #19  <Field LocationRequest zzbkv>
		zzbkx = locationcallback;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field LocationCallback zzbkx>
		zzbkA = looper;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #23  <Field Looper zzbkA>
		super(googleapiclient);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokespecial   #26  <Method void zzary$zza(GoogleApiClient)>
	//   12   22:return          
	}
}
