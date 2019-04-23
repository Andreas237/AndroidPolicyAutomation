// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.location;

import com.google.android.gms.location.*;
import kotlin.jvm.functions.Function1;

// Referenced classes of package io.radar.sdk.location:
//			LocationManager

public static final class LocationManager$getLocation$listener$1 extends LocationCallback
{

	public void onLocationResult(LocationResult locationresult)
	{
		LocationManager.access$getLocationClient$p(LocationManager.this).removeLocationUpdates((LocationCallback)this);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LocationManager this$0>
	//    2    4:invokestatic    #47  <Method FusedLocationProviderClient LocationManager.access$getLocationClient$p(LocationManager)>
	//    3    7:aload_0         
	//    4    8:checkcast       #4   <Class LocationCallback>
	//    5   11:invokevirtual   #53  <Method com.google.android.gms.tasks.Task FusedLocationProviderClient.removeLocationUpdates(LocationCallback)>
	//    6   14:pop             
		Function1 function1 = $callback;
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field Function1 $callback>
	//    9   19:astore_2        
		if(locationresult != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          32
			locationresult = ((LocationResult) (locationresult.getLastLocation()));
	//   12   24:aload_1         
	//   13   25:invokevirtual   #59  <Method android.location.Location LocationResult.getLastLocation()>
	//   14   28:astore_1        
		else
	//*  15   29:goto            34
			locationresult = null;
	//   16   32:aconst_null     
	//   17   33:astore_1        
		function1.invoke(((Object) (locationresult)));
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokeinterface #65  <Method Object Function1.invoke(Object)>
	//   21   41:pop             
	//   22   42:return          
	}

	final Function1 $callback;
	final LocationManager this$0;

	LocationManager$getLocation$listener$1(LocationManager locationmanager, Function1 function1)
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
