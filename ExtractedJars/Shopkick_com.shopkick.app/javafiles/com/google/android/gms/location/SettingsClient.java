// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.Task;

// Referenced classes of package com.google.android.gms.location:
//			LocationServices, SettingsApi, LocationSettingsResponse, LocationSettingsRequest

public class SettingsClient extends GoogleApi
{

	public SettingsClient(Activity activity)
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

	public SettingsClient(Context context)
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

	public Task checkLocationSettings(LocationSettingsRequest locationsettingsrequest)
	{
		return PendingResultUtil.toResponseTask(LocationServices.SettingsApi.checkLocationSettings(asGoogleApiClient(), locationsettingsrequest), ((com.google.android.gms.common.api.Response) (new LocationSettingsResponse())));
	//    0    0:getstatic       #34  <Field SettingsApi LocationServices.SettingsApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #38  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #43  <Method com.google.android.gms.common.api.PendingResult SettingsApi.checkLocationSettings(com.google.android.gms.common.api.GoogleApiClient, LocationSettingsRequest)>
	//    5   13:new             #45  <Class LocationSettingsResponse>
	//    6   16:dup             
	//    7   17:invokespecial   #46  <Method void LocationSettingsResponse()>
	//    8   20:invokestatic    #52  <Method Task PendingResultUtil.toResponseTask(com.google.android.gms.common.api.PendingResult, com.google.android.gms.common.api.Response)>
	//    9   23:areturn         
	}
}
