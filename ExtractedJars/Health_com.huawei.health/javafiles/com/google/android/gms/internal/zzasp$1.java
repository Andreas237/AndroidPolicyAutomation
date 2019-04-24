// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.internal:
//			zzasp, zzash

class zzasp$1 extends com.google.android.gms.location.Services.zza
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
		zzash1.zza(zzbkV, ((b) (this)), zzbkW);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field LocationSettingsRequest zzbkV>
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #20  <Field String zzbkW>
	//    6   10:invokevirtual   #36  <Method void zzash.zza(LocationSettingsRequest, zzaad$zzb, String)>
	//    7   13:return          
	}

	public LocationSettingsResult zzbp(Status status)
	{
		return new LocationSettingsResult(status);
	//    0    0:new             #40  <Class LocationSettingsResult>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #43  <Method void LocationSettingsResult(Status)>
	//    4    8:areturn         
	}

	public Result zzc(Status status)
	{
		return ((Result) (zzbp(status)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method LocationSettingsResult zzbp(Status)>
	//    3    5:areturn         
	}

	final LocationSettingsRequest zzbkV;
	final String zzbkW;

	zzasp$1(zzasp zzasp1, GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
	{
		zzbkV = locationsettingsrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #18  <Field LocationSettingsRequest zzbkV>
		zzbkW = s;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #20  <Field String zzbkW>
		super(googleapiclient);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #23  <Method void com.google.android.gms.location.LocationServices$zza(GoogleApiClient)>
	//    9   16:return          
	}
}
