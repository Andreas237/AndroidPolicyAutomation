// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk;

import android.content.Intent;
import android.location.Location;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk:
//			RadarReceiver

public static final class RadarReceiver$Companion
{

	public final Intent createErrorIntent$sdk_release(Radar.RadarStatus radarstatus)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radarstatus)), "status");
	//    0    0:aload_1         
	//    1    1:ldc1            #50  <String "status">
	//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intent intent = new Intent("io.radar.sdk.RECEIVED");
	//    3    6:new             #58  <Class Intent>
	//    4    9:dup             
	//    5   10:ldc1            #60  <String "io.radar.sdk.RECEIVED">
	//    6   12:invokespecial   #63  <Method void Intent(String)>
	//    7   15:astore_2        
		intent.putExtra("status", radarstatus.ordinal());
	//    8   16:aload_2         
	//    9   17:ldc1            #50  <String "status">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #69  <Method int Radar$RadarStatus.ordinal()>
	//   12   23:invokevirtual   #73  <Method Intent Intent.putExtra(String, int)>
	//   13   26:pop             
		return intent;
	//   14   27:aload_2         
	//   15   28:areturn         
	}

	public final Intent createIntent$sdk_release(JSONObject jsonobject, Location location)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "payload");
	//    0    0:aload_1         
	//    1    1:ldc1            #77  <String "payload">
	//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    3    6:aload_2         
	//    4    7:ldc1            #78  <String "location">
	//    5    9:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intent intent = new Intent("io.radar.sdk.RECEIVED");
	//    6   12:new             #58  <Class Intent>
	//    7   15:dup             
	//    8   16:ldc1            #60  <String "io.radar.sdk.RECEIVED">
	//    9   18:invokespecial   #63  <Method void Intent(String)>
	//   10   21:astore_3        
		intent.putExtra("response", jsonobject.toString());
	//   11   22:aload_3         
	//   12   23:ldc1            #80  <String "response">
	//   13   25:aload_1         
	//   14   26:invokevirtual   #86  <Method String JSONObject.toString()>
	//   15   29:invokevirtual   #89  <Method Intent Intent.putExtra(String, String)>
	//   16   32:pop             
		intent.putExtra("location", (Parcelable)location);
	//   17   33:aload_3         
	//   18   34:ldc1            #78  <String "location">
	//   19   36:aload_2         
	//   20   37:checkcast       #91  <Class Parcelable>
	//   21   40:invokevirtual   #94  <Method Intent Intent.putExtra(String, Parcelable)>
	//   22   43:pop             
		return intent;
	//   23   44:aload_3         
	//   24   45:areturn         
	}

	public final Intent createLocationIntent$sdk_release(Location location, boolean flag)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (location)), "location");
	//    0    0:aload_1         
	//    1    1:ldc1            #78  <String "location">
	//    2    3:invokestatic    #56  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intent intent = new Intent("io.radar.sdk.RECEIVED");
	//    3    6:new             #58  <Class Intent>
	//    4    9:dup             
	//    5   10:ldc1            #60  <String "io.radar.sdk.RECEIVED">
	//    6   12:invokespecial   #63  <Method void Intent(String)>
	//    7   15:astore_3        
		intent.putExtra("location", (Parcelable)location);
	//    8   16:aload_3         
	//    9   17:ldc1            #78  <String "location">
	//   10   19:aload_1         
	//   11   20:checkcast       #91  <Class Parcelable>
	//   12   23:invokevirtual   #94  <Method Intent Intent.putExtra(String, Parcelable)>
	//   13   26:pop             
		intent.putExtra("stopped", flag);
	//   14   27:aload_3         
	//   15   28:ldc1            #96  <String "stopped">
	//   16   30:iload_2         
	//   17   31:invokevirtual   #99  <Method Intent Intent.putExtra(String, boolean)>
	//   18   34:pop             
		return intent;
	//   19   35:aload_3         
	//   20   36:areturn         
	}

	private RadarReceiver$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public RadarReceiver$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void RadarReceiver$Companion()>
	//    2    4:return          
	}
}
