// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

// Referenced classes of package io.radar.sdk.internal:
//			LocationReceiver

public static final class LocationReceiver$Companion
{

	private final Intent baseIntent(Context context)
	{
		return new Intent(context, io/radar/sdk/internal/LocationReceiver);
	//    0    0:new             #42  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #6   <Class LocationReceiver>
	//    4    7:invokespecial   #45  <Method void Intent(Context, Class)>
	//    5   10:areturn         
	}

	public final PendingIntent getGeofencePendingIntent$sdk_release(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #48  <String "context">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intent intent = baseIntent(context);
	//    3    6:aload_0         
	//    4    7:checkcast       #2   <Class LocationReceiver$Companion>
	//    5   10:aload_1         
	//    6   11:invokespecial   #56  <Method Intent baseIntent(Context)>
	//    7   14:astore_2        
		intent.setAction("io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED");
	//    8   15:aload_2         
	//    9   16:ldc1            #58  <String "io.radar.sdk.internal.LocationReceiver.GEOFENCE_TRANSITIONED">
	//   10   18:invokevirtual   #62  <Method Intent Intent.setAction(String)>
	//   11   21:pop             
		context = ((Context) (PendingIntent.getBroadcast(context, 0, intent, 0x8000000)));
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:aload_2         
	//   15   25:ldc1            #63  <Int 0x8000000>
	//   16   27:invokestatic    #69  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   17   30:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)");
	//   18   31:aload_1         
	//   19   32:ldc1            #71  <String "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)">
	//   20   34:invokestatic    #74  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((PendingIntent) (context));
	//   21   37:aload_1         
	//   22   38:areturn         
	}

	public final PendingIntent getLocationPendingIntent$sdk_release(Context context)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #48  <String "context">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intent intent = baseIntent(context);
	//    3    6:aload_0         
	//    4    7:checkcast       #2   <Class LocationReceiver$Companion>
	//    5   10:aload_1         
	//    6   11:invokespecial   #56  <Method Intent baseIntent(Context)>
	//    7   14:astore_2        
		intent.setAction("io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED");
	//    8   15:aload_2         
	//    9   16:ldc1            #78  <String "io.radar.sdk.internal.LocationReceiver.LOCATIONS_RECEIVED">
	//   10   18:invokevirtual   #62  <Method Intent Intent.setAction(String)>
	//   11   21:pop             
		context = ((Context) (PendingIntent.getBroadcast(context, 0, intent, 0x8000000)));
	//   12   22:aload_1         
	//   13   23:iconst_0        
	//   14   24:aload_2         
	//   15   25:ldc1            #63  <Int 0x8000000>
	//   16   27:invokestatic    #69  <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   17   30:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (context)), "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)");
	//   18   31:aload_1         
	//   19   32:ldc1            #71  <String "PendingIntent.getBroadca\u2026tent.FLAG_UPDATE_CURRENT)">
	//   20   34:invokestatic    #74  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((PendingIntent) (context));
	//   21   37:aload_1         
	//   22   38:areturn         
	}

	private LocationReceiver$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public LocationReceiver$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void LocationReceiver$Companion()>
	//    2    4:return          
	}
}
