// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzash

class zzary$4 extends a
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
		zzash1.zzd(zzbkz);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field Location zzbkz>
	//    3    5:invokevirtual   #33  <Method void zzash.zzd(Location)>
		zzb(((com.google.android.gms.common.api.Result) (Status.zzazx)));
	//    4    8:aload_0         
	//    5    9:getstatic       #39  <Field Status Status.zzazx>
	//    6   12:invokevirtual   #43  <Method void zzb(com.google.android.gms.common.api.Result)>
	//    7   15:return          
	}

	final Location zzbkz;

	zzary$4(zzary zzary1, GoogleApiClient googleapiclient, Location location)
	{
		zzbkz = location;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #15  <Field Location zzbkz>
		super(googleapiclient);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #18  <Method void zzary$zza(GoogleApiClient)>
	//    6   10:return          
	}
}
