// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//			LocationServices, GeofencingApi, GeofencingRequest

public class GeofencingClient extends GoogleApi
{

	public GeofencingClient(Activity activity)
	{
		super(activity, LocationServices.API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #14  <Field com.google.android.gms.common.api.Api LocationServices.API>
	//    3    5:aconst_null     
	//    4    6:new             #16  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #22  <Method void GoogleApi(Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	public GeofencingClient(Context context)
	{
		super(context, LocationServices.API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #14  <Field com.google.android.gms.common.api.Api LocationServices.API>
	//    3    5:aconst_null     
	//    4    6:new             #16  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #19  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #28  <Method void GoogleApi(Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	public Task addGeofences(GeofencingRequest geofencingrequest, PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(LocationServices.GeofencingApi.addGeofences(asGoogleApiClient(), geofencingrequest, pendingintent));
	//    0    0:getstatic       #37  <Field GeofencingApi LocationServices.GeofencingApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #41  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #46  <Method com.google.android.gms.common.api.PendingResult GeofencingApi.addGeofences(com.google.android.gms.common.api.GoogleApiClient, GeofencingRequest, PendingIntent)>
	//    6   14:invokestatic    #52  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    7   17:areturn         
	}

	public Task removeGeofences(PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(LocationServices.GeofencingApi.removeGeofences(asGoogleApiClient(), pendingintent));
	//    0    0:getstatic       #37  <Field GeofencingApi LocationServices.GeofencingApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #41  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #60  <Method com.google.android.gms.common.api.PendingResult GeofencingApi.removeGeofences(com.google.android.gms.common.api.GoogleApiClient, PendingIntent)>
	//    5   13:invokestatic    #52  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}

	public Task removeGeofences(List list)
	{
		return PendingResultUtil.toVoidTask(LocationServices.GeofencingApi.removeGeofences(asGoogleApiClient(), list));
	//    0    0:getstatic       #37  <Field GeofencingApi LocationServices.GeofencingApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #41  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #65  <Method com.google.android.gms.common.api.PendingResult GeofencingApi.removeGeofences(com.google.android.gms.common.api.GoogleApiClient, List)>
	//    5   13:invokestatic    #52  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}
}
