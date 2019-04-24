// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzash, zzata, zzabi

class zzary$6 extends a
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
		zzash1.zza(zzbkv, zzabi.zzb(((Object) (zzbkw)), zzata.zzc(zzbkA), ((Class) (com/google/android/gms/location/LocationListener)).getSimpleName()), ((zzasc) (b)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field LocationRequest zzbkv>
	//    8   14:aload_0         
	//    9   15:getfield        #21  <Field LocationListener zzbkw>
	//   10   18:aload_0         
	//   11   19:getfield        #23  <Field Looper zzbkA>
	//   12   22:invokestatic    #48  <Method Looper zzata.zzc(Looper)>
	//   13   25:ldc1            #50  <Class LocationListener>
	//   14   27:invokevirtual   #56  <Method String Class.getSimpleName()>
	//   15   30:invokestatic    #62  <Method zzabh zzabi.zzb(Object, Looper, String)>
	//   16   33:aload_2         
	//   17   34:invokevirtual   #65  <Method void zzash.zza(LocationRequest, zzabh, zzasc)>
	//   18   37:return          
	}

	final Looper zzbkA;
	final LocationRequest zzbkv;
	final LocationListener zzbkw;

	zzary$6(zzary zzary1, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
	{
		zzbkv = locationrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #19  <Field LocationRequest zzbkv>
		zzbkw = locationlistener;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field LocationListener zzbkw>
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
