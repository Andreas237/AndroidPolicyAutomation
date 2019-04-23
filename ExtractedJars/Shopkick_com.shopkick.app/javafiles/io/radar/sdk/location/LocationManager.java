// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.location;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.*;
import io.radar.sdk.internal.*;
import io.radar.sdk.internal.repository.OptionsRepository;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.location:
//			LocationManagerRepository

public final class LocationManager
{
	public static final class Companion
	{

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void LocationManager$Companion()>
		//    2    4:return          
		}
	}


	public LocationManager(Context context1, OptionsRepository optionsrepository, LocationManagerRepository locationmanagerrepository, GeofencingClient geofencingclient, FusedLocationProviderClient fusedlocationproviderclient)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context1)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #95  <String "context">
	//    2    3:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (optionsrepository)), "optionsRepository");
	//    3    6:aload_2         
	//    4    7:ldc1            #102 <String "optionsRepository">
	//    5    9:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (locationmanagerrepository)), "repository");
	//    6   12:aload_3         
	//    7   13:ldc1            #103 <String "repository">
	//    8   15:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (geofencingclient)), "geofencingClient");
	//    9   18:aload           4
	//   10   20:ldc1            #104 <String "geofencingClient">
	//   11   22:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (fusedlocationproviderclient)), "locationClient");
	//   12   25:aload           5
	//   13   27:ldc1            #105 <String "locationClient">
	//   14   29:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//   15   32:aload_0         
	//   16   33:invokespecial   #107 <Method void Object()>
		context = context1;
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:putfield        #109 <Field Context context>
		optionsRepository = optionsrepository;
	//   20   41:aload_0         
	//   21   42:aload_2         
	//   22   43:putfield        #111 <Field OptionsRepository optionsRepository>
		repository = locationmanagerrepository;
	//   23   46:aload_0         
	//   24   47:aload_3         
	//   25   48:putfield        #113 <Field LocationManagerRepository repository>
		geofencingClient = geofencingclient;
	//   26   51:aload_0         
	//   27   52:aload           4
	//   28   54:putfield        #115 <Field GeofencingClient geofencingClient>
		locationClient = fusedlocationproviderclient;
	//   29   57:aload_0         
	//   30   58:aload           5
	//   31   60:putfield        #117 <Field FusedLocationProviderClient locationClient>
	//   32   63:return          
	}

	private final void clearGeofences()
	{
		geofencingClient.removeGeofences(LocationReceiver.Companion.getGeofencePendingIntent$sdk_release(context));
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field GeofencingClient geofencingClient>
	//    2    4:getstatic       #127 <Field io.radar.sdk.internal.LocationReceiver$Companion LocationReceiver.Companion>
	//    3    7:aload_0         
	//    4    8:getfield        #109 <Field Context context>
	//    5   11:invokevirtual   #133 <Method android.app.PendingIntent io.radar.sdk.internal.LocationReceiver$Companion.getGeofencePendingIntent$sdk_release(Context)>
	//    6   14:invokevirtual   #139 <Method com.google.android.gms.tasks.Task GeofencingClient.removeGeofences(android.app.PendingIntent)>
	//    7   17:pop             
	//    8   18:return          
	}

	private final void clearUpdates()
	{
		locationClient.removeLocationUpdates(LocationReceiver.Companion.getLocationPendingIntent$sdk_release(context));
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field FusedLocationProviderClient locationClient>
	//    2    4:getstatic       #127 <Field io.radar.sdk.internal.LocationReceiver$Companion LocationReceiver.Companion>
	//    3    7:aload_0         
	//    4    8:getfield        #109 <Field Context context>
	//    5   11:invokevirtual   #142 <Method android.app.PendingIntent io.radar.sdk.internal.LocationReceiver$Companion.getLocationPendingIntent$sdk_release(Context)>
	//    6   14:invokevirtual   #147 <Method com.google.android.gms.tasks.Task FusedLocationProviderClient.removeLocationUpdates(android.app.PendingIntent)>
	//    7   17:pop             
		repository.setHasStarted$sdk_release(false);
	//    8   18:aload_0         
	//    9   19:getfield        #113 <Field LocationManagerRepository repository>
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #153 <Method void LocationManagerRepository.setHasStarted$sdk_release(boolean)>
	//   12   26:return          
	}

	private final void handleMoving(Moving moving)
	{
		startUpdates$default(this, false, 1, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iconst_1        
	//    3    3:aconst_null     
	//    4    4:invokestatic    #158 <Method void startUpdates$default(LocationManager, boolean, int, Object)>
		clearGeofences();
	//    5    7:aload_0         
	//    6    8:invokespecial   #160 <Method void clearGeofences()>
		int i = Math.max(optionsRepository.getDwellDelay$sdk_release(), 0x249f0);
	//    7   11:aload_0         
	//    8   12:getfield        #111 <Field OptionsRepository optionsRepository>
	//    9   15:invokevirtual   #166 <Method int OptionsRepository.getDwellDelay$sdk_release()>
	//   10   18:ldc1            #63  <Int 0x249f0>
	//   11   20:invokestatic    #172 <Method int Math.max(int, int)>
	//   12   23:istore_2        
		moving = ((Moving) ((new com.google.android.gms.location.Geofence.Builder()).setRequestId("radar_dwell_geo").setCircularRegion(moving.getLocation().getLatitude(), moving.getLocation().getLongitude(), 100F).setExpirationDuration(-1L).setTransitionTypes(4).setLoiteringDelay(i).build()));
	//   13   24:new             #174 <Class com.google.android.gms.location.Geofence$Builder>
	//   14   27:dup             
	//   15   28:invokespecial   #175 <Method void com.google.android.gms.location.Geofence$Builder()>
	//   16   31:ldc1            #67  <String "radar_dwell_geo">
	//   17   33:invokevirtual   #179 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setRequestId(String)>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #184 <Method Location Moving.getLocation()>
	//   20   40:invokevirtual   #190 <Method double Location.getLatitude()>
	//   21   43:aload_1         
	//   22   44:invokevirtual   #184 <Method Location Moving.getLocation()>
	//   23   47:invokevirtual   #193 <Method double Location.getLongitude()>
	//   24   50:ldc1            #84  <Float 100F>
	//   25   52:invokevirtual   #197 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setCircularRegion(double, double, float)>
	//   26   55:ldc2w           #198 <Long -1L>
	//   27   58:invokevirtual   #203 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setExpirationDuration(long)>
	//   28   61:iconst_4        
	//   29   62:invokevirtual   #207 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setTransitionTypes(int)>
	//   30   65:iload_2         
	//   31   66:invokevirtual   #210 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setLoiteringDelay(int)>
	//   32   69:invokevirtual   #214 <Method com.google.android.gms.location.Geofence com.google.android.gms.location.Geofence$Builder.build()>
	//   33   72:astore_1        
		moving = ((Moving) ((new com.google.android.gms.location.GeofencingRequest.Builder()).addGeofence(((com.google.android.gms.location.Geofence) (moving))).setInitialTrigger(4).build()));
	//   34   73:new             #216 <Class com.google.android.gms.location.GeofencingRequest$Builder>
	//   35   76:dup             
	//   36   77:invokespecial   #217 <Method void com.google.android.gms.location.GeofencingRequest$Builder()>
	//   37   80:aload_1         
	//   38   81:invokevirtual   #221 <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.addGeofence(com.google.android.gms.location.Geofence)>
	//   39   84:iconst_4        
	//   40   85:invokevirtual   #225 <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.setInitialTrigger(int)>
	//   41   88:invokevirtual   #228 <Method com.google.android.gms.location.GeofencingRequest com.google.android.gms.location.GeofencingRequest$Builder.build()>
	//   42   91:astore_1        
		RadarLogger.d$default(RadarLogger.INSTANCE, "Adding dwell and exit geofences", ((Throwable) (null)), 2, ((Object) (null)));
	//   43   92:getstatic       #234 <Field RadarLogger RadarLogger.INSTANCE>
	//   44   95:ldc1            #236 <String "Adding dwell and exit geofences">
	//   45   97:aconst_null     
	//   46   98:iconst_2        
	//   47   99:aconst_null     
	//   48  100:invokestatic    #240 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
		geofencingClient.addGeofences(((com.google.android.gms.location.GeofencingRequest) (moving)), LocationReceiver.Companion.getGeofencePendingIntent$sdk_release(context));
	//   49  103:aload_0         
	//   50  104:getfield        #115 <Field GeofencingClient geofencingClient>
	//   51  107:aload_1         
	//   52  108:getstatic       #127 <Field io.radar.sdk.internal.LocationReceiver$Companion LocationReceiver.Companion>
	//   53  111:aload_0         
	//   54  112:getfield        #109 <Field Context context>
	//   55  115:invokevirtual   #133 <Method android.app.PendingIntent io.radar.sdk.internal.LocationReceiver$Companion.getGeofencePendingIntent$sdk_release(Context)>
	//   56  118:invokevirtual   #244 <Method com.google.android.gms.tasks.Task GeofencingClient.addGeofences(com.google.android.gms.location.GeofencingRequest, android.app.PendingIntent)>
	//   57  121:pop             
	//   58  122:return          
	}

	private final void handleStopped(Stopped stopped)
	{
		clearUpdates();
	//    0    0:aload_0         
	//    1    1:invokespecial   #247 <Method void clearUpdates()>
		clearGeofences();
	//    2    4:aload_0         
	//    3    5:invokespecial   #160 <Method void clearGeofences()>
		stopped = ((Stopped) ((new com.google.android.gms.location.Geofence.Builder()).setRequestId("radar_exit_geo").setCircularRegion(stopped.getLocation().getLatitude(), stopped.getLocation().getLongitude(), 100F).setExpirationDuration(-1L).setTransitionTypes(2).build()));
	//    4    8:new             #174 <Class com.google.android.gms.location.Geofence$Builder>
	//    5   11:dup             
	//    6   12:invokespecial   #175 <Method void com.google.android.gms.location.Geofence$Builder()>
	//    7   15:ldc1            #71  <String "radar_exit_geo">
	//    8   17:invokevirtual   #179 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setRequestId(String)>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #250 <Method Location Stopped.getLocation()>
	//   11   24:invokevirtual   #190 <Method double Location.getLatitude()>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #250 <Method Location Stopped.getLocation()>
	//   14   31:invokevirtual   #193 <Method double Location.getLongitude()>
	//   15   34:ldc1            #84  <Float 100F>
	//   16   36:invokevirtual   #197 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setCircularRegion(double, double, float)>
	//   17   39:ldc2w           #198 <Long -1L>
	//   18   42:invokevirtual   #203 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setExpirationDuration(long)>
	//   19   45:iconst_2        
	//   20   46:invokevirtual   #207 <Method com.google.android.gms.location.Geofence$Builder com.google.android.gms.location.Geofence$Builder.setTransitionTypes(int)>
	//   21   49:invokevirtual   #214 <Method com.google.android.gms.location.Geofence com.google.android.gms.location.Geofence$Builder.build()>
	//   22   52:astore_1        
		stopped = ((Stopped) ((new com.google.android.gms.location.GeofencingRequest.Builder()).addGeofence(((com.google.android.gms.location.Geofence) (stopped))).setInitialTrigger(2).build()));
	//   23   53:new             #216 <Class com.google.android.gms.location.GeofencingRequest$Builder>
	//   24   56:dup             
	//   25   57:invokespecial   #217 <Method void com.google.android.gms.location.GeofencingRequest$Builder()>
	//   26   60:aload_1         
	//   27   61:invokevirtual   #221 <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.addGeofence(com.google.android.gms.location.Geofence)>
	//   28   64:iconst_2        
	//   29   65:invokevirtual   #225 <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.setInitialTrigger(int)>
	//   30   68:invokevirtual   #228 <Method com.google.android.gms.location.GeofencingRequest com.google.android.gms.location.GeofencingRequest$Builder.build()>
	//   31   71:astore_1        
		RadarLogger.d$default(RadarLogger.INSTANCE, "Adding exit geofence", ((Throwable) (null)), 2, ((Object) (null)));
	//   32   72:getstatic       #234 <Field RadarLogger RadarLogger.INSTANCE>
	//   33   75:ldc1            #252 <String "Adding exit geofence">
	//   34   77:aconst_null     
	//   35   78:iconst_2        
	//   36   79:aconst_null     
	//   37   80:invokestatic    #240 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
		geofencingClient.addGeofences(((com.google.android.gms.location.GeofencingRequest) (stopped)), LocationReceiver.Companion.getGeofencePendingIntent$sdk_release(context));
	//   38   83:aload_0         
	//   39   84:getfield        #115 <Field GeofencingClient geofencingClient>
	//   40   87:aload_1         
	//   41   88:getstatic       #127 <Field io.radar.sdk.internal.LocationReceiver$Companion LocationReceiver.Companion>
	//   42   91:aload_0         
	//   43   92:getfield        #109 <Field Context context>
	//   44   95:invokevirtual   #133 <Method android.app.PendingIntent io.radar.sdk.internal.LocationReceiver$Companion.getGeofencePendingIntent$sdk_release(Context)>
	//   45   98:invokevirtual   #244 <Method com.google.android.gms.tasks.Task GeofencingClient.addGeofences(com.google.android.gms.location.GeofencingRequest, android.app.PendingIntent)>
	//   46  101:pop             
	//   47  102:return          
	}

	public static void requestLocation$sdk_release$default(LocationManager locationmanager, boolean flag, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		locationmanager.requestLocation$sdk_release(flag);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:invokevirtual   #255 <Method void requestLocation$sdk_release(boolean)>
	//    9   13:return          
	}

	private final void startUpdates(boolean flag)
	{
		if(flag || !repository.getHasStarted$sdk_release())
	//*   0    0:iload_1         
	//*   1    1:ifne            14
	//*   2    4:aload_0         
	//*   3    5:getfield        #113 <Field LocationManagerRepository repository>
	//*   4    8:invokevirtual   #259 <Method boolean LocationManagerRepository.getHasStarted$sdk_release()>
	//*   5   11:ifne            122
		{
			long l = Math.max(optionsRepository.getUpdateInterval$sdk_release(), 0x57e40L);
	//    6   14:aload_0         
	//    7   15:getfield        #111 <Field OptionsRepository optionsRepository>
	//    8   18:invokevirtual   #263 <Method long OptionsRepository.getUpdateInterval$sdk_release()>
	//    9   21:ldc2w           #80  <Long 0x57e40L>
	//   10   24:invokestatic    #266 <Method long Math.max(long, long)>
	//   11   27:lstore_2        
			LocationRequest locationrequest = new LocationRequest();
	//   12   28:new             #268 <Class LocationRequest>
	//   13   31:dup             
	//   14   32:invokespecial   #269 <Method void LocationRequest()>
	//   15   35:astore          4
			locationrequest.setPriority(102);
	//   16   37:aload           4
	//   17   39:bipush          102
	//   18   41:invokevirtual   #273 <Method LocationRequest LocationRequest.setPriority(int)>
	//   19   44:pop             
			locationrequest.setFastestInterval(0x249f0L);
	//   20   45:aload           4
	//   21   47:ldc2w           #74  <Long 0x249f0L>
	//   22   50:invokevirtual   #277 <Method LocationRequest LocationRequest.setFastestInterval(long)>
	//   23   53:pop             
			locationrequest.setInterval(l);
	//   24   54:aload           4
	//   25   56:lload_2         
	//   26   57:invokevirtual   #280 <Method LocationRequest LocationRequest.setInterval(long)>
	//   27   60:pop             
			locationrequest.setMaxWaitTime(0xdbba0L);
	//   28   61:aload           4
	//   29   63:ldc2w           #77  <Long 0xdbba0L>
	//   30   66:invokevirtual   #283 <Method LocationRequest LocationRequest.setMaxWaitTime(long)>
	//   31   69:pop             
			locationClient.requestLocationUpdates(locationrequest, LocationReceiver.Companion.getLocationPendingIntent$sdk_release(context));
	//   32   70:aload_0         
	//   33   71:getfield        #117 <Field FusedLocationProviderClient locationClient>
	//   34   74:aload           4
	//   35   76:getstatic       #127 <Field io.radar.sdk.internal.LocationReceiver$Companion LocationReceiver.Companion>
	//   36   79:aload_0         
	//   37   80:getfield        #109 <Field Context context>
	//   38   83:invokevirtual   #142 <Method android.app.PendingIntent io.radar.sdk.internal.LocationReceiver$Companion.getLocationPendingIntent$sdk_release(Context)>
	//   39   86:invokevirtual   #287 <Method com.google.android.gms.tasks.Task FusedLocationProviderClient.requestLocationUpdates(LocationRequest, android.app.PendingIntent)>
	//   40   89:pop             
			repository.setHasStarted$sdk_release(true);
	//   41   90:aload_0         
	//   42   91:getfield        #113 <Field LocationManagerRepository repository>
	//   43   94:iconst_1        
	//   44   95:invokevirtual   #153 <Method void LocationManagerRepository.setHasStarted$sdk_release(boolean)>
			if(flag)
	//*  45   98:iload_1         
	//*  46   99:ifeq            110
				locationClient.flushLocations();
	//   47  102:aload_0         
	//   48  103:getfield        #117 <Field FusedLocationProviderClient locationClient>
	//   49  106:invokevirtual   #291 <Method com.google.android.gms.tasks.Task FusedLocationProviderClient.flushLocations()>
	//   50  109:pop             
			RadarLogger.d$default(RadarLogger.INSTANCE, "Requesting fresh location", ((Throwable) (null)), 2, ((Object) (null)));
	//   51  110:getstatic       #234 <Field RadarLogger RadarLogger.INSTANCE>
	//   52  113:ldc2            #293 <String "Requesting fresh location">
	//   53  116:aconst_null     
	//   54  117:iconst_2        
	//   55  118:aconst_null     
	//   56  119:invokestatic    #240 <Method void RadarLogger.d$default(RadarLogger, String, Throwable, int, Object)>
		}
	//   57  122:return          
	}

	static void startUpdates$default(LocationManager locationmanager, boolean flag, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            8
			flag = false;
	//    4    6:iconst_0        
	//    5    7:istore_1        
		locationmanager.startUpdates(flag);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:invokespecial   #295 <Method void startUpdates(boolean)>
	//    9   13:return          
	}

	public final void getLocation$sdk_release(Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "callback");
	//    0    0:aload_1         
	//    1    1:ldc2            #297 <String "callback">
	//    2    4:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		LocationRequest locationrequest = new LocationRequest();
	//    3    7:new             #268 <Class LocationRequest>
	//    4   10:dup             
	//    5   11:invokespecial   #269 <Method void LocationRequest()>
	//    6   14:astore_2        
		locationrequest.setPriority(100);
	//    7   15:aload_2         
	//    8   16:bipush          100
	//    9   18:invokevirtual   #273 <Method LocationRequest LocationRequest.setPriority(int)>
	//   10   21:pop             
		locationrequest.setInterval(5000L);
	//   11   22:aload_2         
	//   12   23:ldc2w           #298 <Long 5000L>
	//   13   26:invokevirtual   #280 <Method LocationRequest LocationRequest.setInterval(long)>
	//   14   29:pop             
		function1 = ((Function1) (new LocationCallback(this, function1) {

			public void onLocationResult(LocationResult locationresult)
			{
				locationClient.removeLocationUpdates((LocationCallback)this);
			//    0    0:aload_0         
			//    1    1:getfield        #34  <Field LocationManager this$0>
			//    2    4:invokestatic    #47  <Method FusedLocationProviderClient LocationManager.access$getLocationClient$p(LocationManager)>
			//    3    7:aload_0         
			//    4    8:checkcast       #4   <Class LocationCallback>
			//    5   11:invokevirtual   #53  <Method com.google.android.gms.tasks.Task FusedLocationProviderClient.removeLocationUpdates(LocationCallback)>
			//    6   14:pop             
				Function1 function1_1 = $callback;
			//    7   15:aload_0         
			//    8   16:getfield        #36  <Field Function1 $callback>
			//    9   19:astore_2        
				if(locationresult != null)
			//*  10   20:aload_1         
			//*  11   21:ifnull          32
					locationresult = ((LocationResult) (locationresult.getLastLocation()));
			//   12   24:aload_1         
			//   13   25:invokevirtual   #59  <Method Location LocationResult.getLastLocation()>
			//   14   28:astore_1        
				else
			//*  15   29:goto            34
					locationresult = null;
			//   16   32:aconst_null     
			//   17   33:astore_1        
				function1_1.invoke(((Object) (locationresult)));
			//   18   34:aload_2         
			//   19   35:aload_1         
			//   20   36:invokeinterface #65  <Method Object Function1.invoke(Object)>
			//   21   41:pop             
			//   22   42:return          
			}

			final Function1 $callback;
			final LocationManager this$0;

			
			{
				this$0 = locationmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field LocationManager this$0>
				$callback = function1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #36  <Field Function1 $callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #39  <Method void LocationCallback()>
			//    8   14:return          
			}
		}
));
	//   15   30:new             #9   <Class LocationManager$getLocation$listener$1>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokespecial   #302 <Method void LocationManager$getLocation$listener$1(LocationManager, Function1)>
	//   20   39:astore_1        
		locationClient.requestLocationUpdates(locationrequest, (LocationCallback)function1, Looper.getMainLooper());
	//   21   40:aload_0         
	//   22   41:getfield        #117 <Field FusedLocationProviderClient locationClient>
	//   23   44:aload_2         
	//   24   45:aload_1         
	//   25   46:checkcast       #304 <Class LocationCallback>
	//   26   49:invokestatic    #310 <Method Looper Looper.getMainLooper()>
	//   27   52:invokevirtual   #313 <Method com.google.android.gms.tasks.Task FusedLocationProviderClient.requestLocationUpdates(LocationRequest, LocationCallback, Looper)>
	//   28   55:pop             
	//   29   56:return          
	}

	public final void handleState$sdk_release(RadarState radarstate)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarstate)), "state");
	//    0    0:aload_1         
	//    1    1:ldc2            #317 <String "state">
	//    2    4:invokestatic    #101 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!optionsRepository.getBackgroundTracking$sdk_release())
	//*   3    7:aload_0         
	//*   4    8:getfield        #111 <Field OptionsRepository optionsRepository>
	//*   5   11:invokevirtual   #320 <Method boolean OptionsRepository.getBackgroundTracking$sdk_release()>
	//*   6   14:ifne            26
		{
			clearUpdates();
	//    7   17:aload_0         
	//    8   18:invokespecial   #247 <Method void clearUpdates()>
			clearGeofences();
	//    9   21:aload_0         
	//   10   22:invokespecial   #160 <Method void clearGeofences()>
			return;
	//   11   25:return          
		}
		if(radarstate instanceof Stopped)
	//*  12   26:aload_1         
	//*  13   27:instanceof      #249 <Class Stopped>
	//*  14   30:ifeq            42
		{
			handleStopped((Stopped)radarstate);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:checkcast       #249 <Class Stopped>
	//   18   38:invokespecial   #322 <Method void handleStopped(Stopped)>
			return;
	//   19   41:return          
		}
		if(radarstate instanceof Moving)
	//*  20   42:aload_1         
	//*  21   43:instanceof      #181 <Class Moving>
	//*  22   46:ifeq            57
			handleMoving((Moving)radarstate);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:checkcast       #181 <Class Moving>
	//   26   54:invokespecial   #324 <Method void handleMoving(Moving)>
	//   27   57:return          
	}

	public final void requestLocation$sdk_release(boolean flag)
	{
		if(!flag && !optionsRepository.getBackgroundTracking$sdk_release())
	//*   0    0:iload_1         
	//*   1    1:ifne            36
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field OptionsRepository optionsRepository>
	//*   4    8:invokevirtual   #320 <Method boolean OptionsRepository.getBackgroundTracking$sdk_release()>
	//*   5   11:ifeq            17
	//*   6   14:goto            36
		{
			if(!optionsRepository.getBackgroundTracking$sdk_release())
	//*   7   17:aload_0         
	//*   8   18:getfield        #111 <Field OptionsRepository optionsRepository>
	//*   9   21:invokevirtual   #320 <Method boolean OptionsRepository.getBackgroundTracking$sdk_release()>
	//*  10   24:ifne            41
			{
				clearUpdates();
	//   11   27:aload_0         
	//   12   28:invokespecial   #247 <Method void clearUpdates()>
				clearGeofences();
	//   13   31:aload_0         
	//   14   32:invokespecial   #160 <Method void clearGeofences()>
				return;
	//   15   35:return          
			}
		} else
		{
			startUpdates(flag);
	//   16   36:aload_0         
	//   17   37:iload_1         
	//   18   38:invokespecial   #295 <Method void startUpdates(boolean)>
		}
	//   19   41:return          
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final int DWELL_DELAY_MIN_DEFAULT = 0x249f0;
	public static final String GEOFENCE_DWELL_REQUEST_ID = "radar_dwell_geo";
	public static final String GEOFENCE_EXIT_REQUEST_ID = "radar_exit_geo";
	public static final long INTERVAL_FAST = 0x249f0L;
	public static final long INTERVAL_MAX = 0xdbba0L;
	public static final long INTERVAL_MIN_DEFAULT = 0x57e40L;
	public static final float RADIUS = 100F;
	private final Context context;
	private final GeofencingClient geofencingClient;
	private final FusedLocationProviderClient locationClient;
	private final OptionsRepository optionsRepository;
	private final LocationManagerRepository repository;

	static 
	{
	//    0    0:new             #6   <Class LocationManager$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #90  <Method void LocationManager$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #92  <Field LocationManager$Companion Companion>
	//*   5   11:return          
	}


/*
	public static final FusedLocationProviderClient access$getLocationClient$p(LocationManager locationmanager)
	{
		return locationmanager.locationClient;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field FusedLocationProviderClient locationClient>
	//    2    4:areturn         
	}

*/
}
