// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzash, zzata, zzabi

class zzary$1 extends a
{

	protected volatile void zza(com.google.android.gms.common.api.Api$zzb api$zzb)
		throws RemoteException
	{
		zza((zzash)api$zzb);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class zzash>
	//    3    5:invokevirtual   #32  <Method void zza(zzash)>
	//    4    8:return          
	}

	protected void zza(zzash zzash1)
		throws RemoteException
	{
		b b = new b(((b) (this)));
	//    0    0:new             #35  <Class zzary$zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #38  <Method void zzary$zzb(zzaad$zzb)>
	//    4    8:astore_2        
		zzash1.zza(zzbkv, zzabi.zzb(((Object) (zzbkw)), zzata.zzJl(), ((Class) (com/google/android/gms/location/LocationListener)).getSimpleName()), ((zzasc) (b)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field LocationRequest zzbkv>
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field LocationListener zzbkw>
	//   10   18:invokestatic    #44  <Method android.os.Looper zzata.zzJl()>
	//   11   21:ldc1            #46  <Class LocationListener>
	//   12   23:invokevirtual   #52  <Method String Class.getSimpleName()>
	//   13   26:invokestatic    #58  <Method zzabh zzabi.zzb(Object, android.os.Looper, String)>
	//   14   29:aload_2         
	//   15   30:invokevirtual   #61  <Method void zzash.zza(LocationRequest, zzabh, zzasc)>
	//   16   33:return          
	}

	final LocationRequest zzbkv;
	final LocationListener zzbkw;

	zzary$1(zzary zzary1, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
	{
		zzbkv = locationrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #17  <Field LocationRequest zzbkv>
		zzbkw = locationlistener;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #19  <Field LocationListener zzbkw>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #22  <Method void zzary$zza(GoogleApiClient)>
	//    9   16:return          
	}
}