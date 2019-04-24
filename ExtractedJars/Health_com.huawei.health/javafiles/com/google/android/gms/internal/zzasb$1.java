// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

// Referenced classes of package com.google.android.gms.internal:
//			zzasb, zzash

class zzasb$1 extends a
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
		zzash1.zza(zzbkC, zzaUQ, ((b) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field GeofencingRequest zzbkC>
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field PendingIntent zzaUQ>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #36  <Method void zzash.zza(GeofencingRequest, PendingIntent, zzaad$zzb)>
	//    7   13:return          
	}

	final PendingIntent zzaUQ;
	final GeofencingRequest zzbkC;

	zzasb$1(zzasb zzasb1, GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
	{
		zzbkC = geofencingrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #17  <Field GeofencingRequest zzbkC>
		zzaUQ = pendingintent;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #19  <Field PendingIntent zzaUQ>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #22  <Method void zzasb$zza(GoogleApiClient)>
	//    9   16:return          
	}
}
