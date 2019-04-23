// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import java.util.Map;
import kotlin.jvm.functions.Function1;

// Referenced classes of package io.radar.sdk.api:
//			ApiService

static final class ApiService$userUpsert$1
	implements Runnable
{

	public final void run()
	{
		(new ApiService.PutUserTask(ApiService.this, $publishableKey, $location, $callback)).execute(((Object []) (new Map[] {
			$params
		})));
	//    0    0:new             #53  <Class ApiService$PutUserTask>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field ApiService this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field String $publishableKey>
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field Location $location>
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field Function1 $callback>
	//   10   20:invokespecial   #56  <Method void ApiService$PutUserTask(ApiService, String, Location, Function1)>
	//   11   23:iconst_1        
	//   12   24:anewarray       Map[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:aload_0         
	//   16   30:getfield        #47  <Field Map $params>
	//   17   33:aastore         
	//   18   34:invokevirtual   #62  <Method android.os.AsyncTask ApiService$PutUserTask.execute(Object[])>
	//   19   37:pop             
	//   20   38:return          
	}

	final Function1 $callback;
	final Location $location;
	final Map $params;
	final String $publishableKey;
	final ApiService this$0;

	ApiService$userUpsert$1(ApiService apiservice, String s, Location location, Function1 function1, Map map)
	{
		this$0 = apiservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field ApiService this$0>
		$publishableKey = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #41  <Field String $publishableKey>
		$location = location;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #43  <Field Location $location>
		$callback = function1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #45  <Field Function1 $callback>
		$params = map;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #47  <Field Map $params>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #50  <Method void Object()>
	//   17   31:return          
	}
}
