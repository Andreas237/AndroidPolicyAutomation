// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import kotlin.jvm.functions.Function1;

// Referenced classes of package io.radar.sdk.api:
//			ApiService

static final class ApiService$fetchPlaces$1
	implements Runnable
{

	public final void run()
	{
		(new Task(ApiService.this, $fbAccessToken, $callback)).execute(((Object []) (new Location[] {
			$location
		})));
	//    0    0:new             #49  <Class ApiService$FacebookPlacesTask>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field ApiService this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field String $fbAccessToken>
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field Function1 $callback>
	//    8   16:invokespecial   #52  <Method void ApiService$FacebookPlacesTask(ApiService, String, Function1)>
	//    9   19:iconst_1        
	//   10   20:anewarray       Location[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:aload_0         
	//   14   26:getfield        #43  <Field Location $location>
	//   15   29:aastore         
	//   16   30:invokevirtual   #58  <Method android.os.AsyncTask ApiService$FacebookPlacesTask.execute(Object[])>
	//   17   33:pop             
	//   18   34:return          
	}

	final Function1 $callback;
	final String $fbAccessToken;
	final Location $location;
	final ApiService this$0;

	ApiService$fetchPlaces$1(ApiService apiservice, String s, Function1 function1, Location location)
	{
		this$0 = apiservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field ApiService this$0>
		$fbAccessToken = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #39  <Field String $fbAccessToken>
		$callback = function1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #41  <Field Function1 $callback>
		$location = location;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #43  <Field Location $location>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #46  <Method void Object()>
	//   14   25:return          
	}
}
