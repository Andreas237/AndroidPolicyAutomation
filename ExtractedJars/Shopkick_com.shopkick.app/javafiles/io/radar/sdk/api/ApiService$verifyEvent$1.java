// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package io.radar.sdk.api:
//			ApiService

static final class ApiService$verifyEvent$1
	implements Runnable
{

	public final void run()
	{
		(new k(ApiService.this, $publishableKey, $eventId)).execute(((Object []) (new Map[] {
			(Map)$params
		})));
	//    0    0:new             #48  <Class ApiService$VerifyEventTask>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field ApiService this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field String $publishableKey>
	//    6   12:aload_0         
	//    7   13:getfield        #40  <Field String $eventId>
	//    8   16:invokespecial   #51  <Method void ApiService$VerifyEventTask(ApiService, String, String)>
	//    9   19:iconst_1        
	//   10   20:anewarray       Map[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:aload_0         
	//   14   26:getfield        #42  <Field HashMap $params>
	//   15   29:checkcast       #53  <Class Map>
	//   16   32:aastore         
	//   17   33:invokevirtual   #57  <Method android.os.AsyncTask ApiService$VerifyEventTask.execute(Object[])>
	//   18   36:pop             
	//   19   37:return          
	}

	final String $eventId;
	final HashMap $params;
	final String $publishableKey;
	final ApiService this$0;

	ApiService$verifyEvent$1(ApiService apiservice, String s, String s1, HashMap hashmap)
	{
		this$0 = apiservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field ApiService this$0>
		$publishableKey = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #38  <Field String $publishableKey>
		$eventId = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #40  <Field String $eventId>
		$params = hashmap;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #42  <Field HashMap $params>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #45  <Method void Object()>
	//   14   25:return          
	}
}
