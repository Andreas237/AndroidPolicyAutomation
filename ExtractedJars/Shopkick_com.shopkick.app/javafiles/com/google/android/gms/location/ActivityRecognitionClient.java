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

// Referenced classes of package com.google.android.gms.location:
//			LocationServices, ActivityRecognition, ActivityRecognitionApi, ActivityTransitionRequest

public class ActivityRecognitionClient extends GoogleApi
{

	public ActivityRecognitionClient(Activity activity)
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

	public ActivityRecognitionClient(Context context)
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

	public Task removeActivityTransitionUpdates(PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(ActivityRecognition.ActivityRecognitionApi.zza(asGoogleApiClient(), pendingintent));
	//    0    0:getstatic       #39  <Field ActivityRecognitionApi ActivityRecognition.ActivityRecognitionApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #49  <Method com.google.android.gms.common.api.PendingResult ActivityRecognitionApi.zza(com.google.android.gms.common.api.GoogleApiClient, PendingIntent)>
	//    5   13:invokestatic    #55  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}

	public Task removeActivityUpdates(PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(ActivityRecognition.ActivityRecognitionApi.removeActivityUpdates(asGoogleApiClient(), pendingintent));
	//    0    0:getstatic       #39  <Field ActivityRecognitionApi ActivityRecognition.ActivityRecognitionApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #61  <Method com.google.android.gms.common.api.PendingResult ActivityRecognitionApi.removeActivityUpdates(com.google.android.gms.common.api.GoogleApiClient, PendingIntent)>
	//    5   13:invokestatic    #55  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}

	public Task requestActivityTransitionUpdates(ActivityTransitionRequest activitytransitionrequest, PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(ActivityRecognition.ActivityRecognitionApi.zza(asGoogleApiClient(), activitytransitionrequest, pendingintent));
	//    0    0:getstatic       #39  <Field ActivityRecognitionApi ActivityRecognition.ActivityRecognitionApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #66  <Method com.google.android.gms.common.api.PendingResult ActivityRecognitionApi.zza(com.google.android.gms.common.api.GoogleApiClient, ActivityTransitionRequest, PendingIntent)>
	//    6   14:invokestatic    #55  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    7   17:areturn         
	}

	public Task requestActivityUpdates(long l, PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(ActivityRecognition.ActivityRecognitionApi.requestActivityUpdates(asGoogleApiClient(), l, pendingintent));
	//    0    0:getstatic       #39  <Field ActivityRecognitionApi ActivityRecognition.ActivityRecognitionApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #43  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:lload_1         
	//    4    8:aload_3         
	//    5    9:invokeinterface #72  <Method com.google.android.gms.common.api.PendingResult ActivityRecognitionApi.requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient, long, PendingIntent)>
	//    6   14:invokestatic    #55  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    7   17:areturn         
	}
}
