// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.*;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.location.*;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.location:
//			LocationServices, zzp, FusedLocationProviderApi, zzl, 
//			zzm, LocationCallback, zzn, zzo, 
//			LocationRequest

public class FusedLocationProviderClient extends GoogleApi
{
	private static final class zza extends zzak
	{

		public final void zza(zzad zzad1)
		{
			TaskUtil.setResultOrApiException(zzad1.getStatus(), zzac);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method com.google.android.gms.common.api.Status zzad.getStatus()>
		//    2    4:aload_0         
		//    3    5:getfield        #17  <Field TaskCompletionSource zzac>
		//    4    8:invokestatic    #33  <Method void TaskUtil.setResultOrApiException(com.google.android.gms.common.api.Status, TaskCompletionSource)>
		//    5   11:return          
		}

		private final TaskCompletionSource zzac;

		public zza(TaskCompletionSource taskcompletionsource)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void zzak()>
			zzac = taskcompletionsource;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field TaskCompletionSource zzac>
		//    5    9:return          
		}
	}


	public FusedLocationProviderClient(Activity activity)
	{
		super(activity, LocationServices.API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #21  <Field com.google.android.gms.common.api.Api LocationServices.API>
	//    3    5:aconst_null     
	//    4    6:new             #23  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #26  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #29  <Method void GoogleApi(Activity, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	public FusedLocationProviderClient(Context context)
	{
		super(context, LocationServices.API, ((com.google.android.gms.common.api.Api.ApiOptions) (null)), ((com.google.android.gms.common.api.internal.StatusExceptionMapper) (new ApiExceptionMapper())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #21  <Field com.google.android.gms.common.api.Api LocationServices.API>
	//    3    5:aconst_null     
	//    4    6:new             #23  <Class ApiExceptionMapper>
	//    5    9:dup             
	//    6   10:invokespecial   #26  <Method void ApiExceptionMapper()>
	//    7   13:invokespecial   #35  <Method void GoogleApi(Context, com.google.android.gms.common.api.Api, com.google.android.gms.common.api.Api$ApiOptions, com.google.android.gms.common.api.internal.StatusExceptionMapper)>
	//    8   16:return          
	}

	static zzaj zza(FusedLocationProviderClient fusedlocationproviderclient, TaskCompletionSource taskcompletionsource)
	{
		return fusedlocationproviderclient.zza(taskcompletionsource);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method zzaj zza(TaskCompletionSource)>
	//    3    5:areturn         
	}

	private final zzaj zza(TaskCompletionSource taskcompletionsource)
	{
		return ((zzaj) (new zzp(this, taskcompletionsource)));
	//    0    0:new             #41  <Class zzp>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #44  <Method void zzp(FusedLocationProviderClient, TaskCompletionSource)>
	//    5    9:areturn         
	}

	public Task flushLocations()
	{
		return PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.flushLocations(asGoogleApiClient()));
	//    0    0:getstatic       #52  <Field FusedLocationProviderApi LocationServices.FusedLocationApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #56  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:invokeinterface #61  <Method com.google.android.gms.common.api.PendingResult FusedLocationProviderApi.flushLocations(com.google.android.gms.common.api.GoogleApiClient)>
	//    4   12:invokestatic    #67  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    5   15:areturn         
	}

	public Task getLastLocation()
	{
		return doRead(((com.google.android.gms.common.api.internal.TaskApiCall) (new zzl(this))));
	//    0    0:aload_0         
	//    1    1:new             #75  <Class zzl>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #78  <Method void zzl(FusedLocationProviderClient)>
	//    5    9:invokevirtual   #82  <Method Task doRead(com.google.android.gms.common.api.internal.TaskApiCall)>
	//    6   12:areturn         
	}

	public Task getLocationAvailability()
	{
		return doRead(((com.google.android.gms.common.api.internal.TaskApiCall) (new zzm(this))));
	//    0    0:aload_0         
	//    1    1:new             #87  <Class zzm>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #88  <Method void zzm(FusedLocationProviderClient)>
	//    5    9:invokevirtual   #82  <Method Task doRead(com.google.android.gms.common.api.internal.TaskApiCall)>
	//    6   12:areturn         
	}

	public Task removeLocationUpdates(PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.removeLocationUpdates(asGoogleApiClient(), pendingintent));
	//    0    0:getstatic       #52  <Field FusedLocationProviderApi LocationServices.FusedLocationApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #56  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #94  <Method com.google.android.gms.common.api.PendingResult FusedLocationProviderApi.removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient, PendingIntent)>
	//    5   13:invokestatic    #67  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}

	public Task removeLocationUpdates(LocationCallback locationcallback)
	{
		return TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(ListenerHolders.createListenerKey(((Object) (locationcallback)), ((Class) (com/google/android/gms/location/LocationCallback)).getSimpleName())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #98  <Class LocationCallback>
	//    3    4:invokevirtual   #104 <Method String Class.getSimpleName()>
	//    4    7:invokestatic    #110 <Method com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey ListenerHolders.createListenerKey(Object, String)>
	//    5   10:invokevirtual   #114 <Method Task doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey)>
	//    6   13:invokestatic    #120 <Method Task TaskUtil.toVoidTaskThatFailsOnFalse(Task)>
	//    7   16:areturn         
	}

	public Task requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
	{
		return PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.requestLocationUpdates(asGoogleApiClient(), locationrequest, pendingintent));
	//    0    0:getstatic       #52  <Field FusedLocationProviderApi LocationServices.FusedLocationApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #56  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokeinterface #126 <Method com.google.android.gms.common.api.PendingResult FusedLocationProviderApi.requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient, LocationRequest, PendingIntent)>
	//    6   14:invokestatic    #67  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    7   17:areturn         
	}

	public Task requestLocationUpdates(LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
	{
		locationrequest = ((LocationRequest) (zzbd.zza(locationrequest)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #134 <Method zzbd zzbd.zza(LocationRequest)>
	//    2    4:astore_1        
		locationcallback = ((LocationCallback) (ListenerHolders.createListenerHolder(((Object) (locationcallback)), zzbm.zza(looper), ((Class) (com/google/android/gms/location/LocationCallback)).getSimpleName())));
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokestatic    #139 <Method Looper zzbm.zza(Looper)>
	//    6   10:ldc1            #98  <Class LocationCallback>
	//    7   12:invokevirtual   #104 <Method String Class.getSimpleName()>
	//    8   15:invokestatic    #143 <Method ListenerHolder ListenerHolders.createListenerHolder(Object, Looper, String)>
	//    9   18:astore_2        
		return doRegisterEventListener(((com.google.android.gms.common.api.internal.RegisterListenerMethod) (new zzn(this, ((ListenerHolder) (locationcallback)), ((zzbd) (locationrequest)), ((ListenerHolder) (locationcallback))))), ((com.google.android.gms.common.api.internal.UnregisterListenerMethod) (new zzo(this, ((ListenerHolder) (locationcallback)).getListenerKey()))));
	//   10   19:aload_0         
	//   11   20:new             #145 <Class zzn>
	//   12   23:dup             
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:aload_1         
	//   16   27:aload_2         
	//   17   28:invokespecial   #148 <Method void zzn(FusedLocationProviderClient, ListenerHolder, zzbd, ListenerHolder)>
	//   18   31:new             #150 <Class zzo>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:aload_2         
	//   22   37:invokevirtual   #156 <Method com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey ListenerHolder.getListenerKey()>
	//   23   40:invokespecial   #159 <Method void zzo(FusedLocationProviderClient, com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey)>
	//   24   43:invokevirtual   #163 <Method Task doRegisterEventListener(com.google.android.gms.common.api.internal.RegisterListenerMethod, com.google.android.gms.common.api.internal.UnregisterListenerMethod)>
	//   25   46:areturn         
	}

	public Task setMockLocation(Location location)
	{
		return PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.setMockLocation(asGoogleApiClient(), location));
	//    0    0:getstatic       #52  <Field FusedLocationProviderApi LocationServices.FusedLocationApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #56  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:aload_1         
	//    4    8:invokeinterface #169 <Method com.google.android.gms.common.api.PendingResult FusedLocationProviderApi.setMockLocation(com.google.android.gms.common.api.GoogleApiClient, Location)>
	//    5   13:invokestatic    #67  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}

	public Task setMockMode(boolean flag)
	{
		return PendingResultUtil.toVoidTask(LocationServices.FusedLocationApi.setMockMode(asGoogleApiClient(), flag));
	//    0    0:getstatic       #52  <Field FusedLocationProviderApi LocationServices.FusedLocationApi>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #56  <Method com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()>
	//    3    7:iload_1         
	//    4    8:invokeinterface #175 <Method com.google.android.gms.common.api.PendingResult FusedLocationProviderApi.setMockMode(com.google.android.gms.common.api.GoogleApiClient, boolean)>
	//    5   13:invokestatic    #67  <Method Task PendingResultUtil.toVoidTask(com.google.android.gms.common.api.PendingResult)>
	//    6   16:areturn         
	}

	public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";
}
