// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzaz, zzbk

final class zzbl extends com.google.android.gms.location.LocationServices.zza
{

	zzbl(zzbk zzbk, GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
	{
		zzdp = locationsettingsrequest;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #13  <Field LocationSettingsRequest zzdp>
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #15  <Field String zzdq>
		super(googleapiclient);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #18  <Method void com.google.android.gms.location.LocationServices$zza(GoogleApiClient)>
	//    9   15:return          
	}

	public final Result createFailedResult(Status status)
	{
		return ((Result) (new LocationSettingsResult(status)));
	//    0    0:new             #23  <Class LocationSettingsResult>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #26  <Method void LocationSettingsResult(Status)>
	//    4    8:areturn         
	}

	protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyclient)
		throws RemoteException
	{
		((zzaz)anyclient).zza(zzdp, ((com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder) (this)), zzdq);
	//    0    0:aload_1         
	//    1    1:checkcast       #32  <Class zzaz>
	//    2    4:aload_0         
	//    3    5:getfield        #13  <Field LocationSettingsRequest zzdp>
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field String zzdq>
	//    7   13:invokevirtual   #36  <Method void zzaz.zza(LocationSettingsRequest, com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder, String)>
	//    8   16:return          
	}

	private final LocationSettingsRequest zzdp;
	private final String zzdq = null;
}
