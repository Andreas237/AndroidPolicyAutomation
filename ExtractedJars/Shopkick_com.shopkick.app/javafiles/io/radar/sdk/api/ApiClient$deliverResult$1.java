// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import android.location.Location;
import android.os.Handler;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

// Referenced classes of package io.radar.sdk.api:
//			ApiClient

static final class ApiClient$deliverResult$1
	implements Runnable
{

	public final void run()
	{
		ApiClient apiclient = ApiClient.this;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ApiClient this$0>
	//    2    4:astore_1        
		apiclient;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ApiClient.access$getHandler$p(ApiClient.this).removeCallbacksAndMessages(((Object) (null)));
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field ApiClient this$0>
	//    7   11:invokestatic    #55  <Method Handler ApiClient.access$getHandler$p(ApiClient)>
	//    8   14:aconst_null     
	//    9   15:invokevirtual   #61  <Method void Handler.removeCallbacksAndMessages(Object)>
		for(Iterator iterator = ((Iterable)ApiClient.access$getCallbacks$p(ApiClient.this)).iterator(); iterator.hasNext(); ((io.radar.sdk.Radar.RadarCallback)iterator.next()).onComplete($status, $location, $events, $user));
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field ApiClient this$0>
	//   12   22:invokestatic    #65  <Method ArrayList ApiClient.access$getCallbacks$p(ApiClient)>
	//   13   25:checkcast       #67  <Class Iterable>
	//   14   28:invokeinterface #71  <Method Iterator Iterable.iterator()>
	//   15   33:astore_2        
	//   16   34:aload_2         
	//   17   35:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            76
	//   19   43:aload_2         
	//   20   44:invokeinterface #81  <Method Object Iterator.next()>
	//   21   49:checkcast       #83  <Class io.radar.sdk.Radar$RadarCallback>
	//   22   52:aload_0         
	//   23   53:getfield        #41  <Field io.radar.sdk.Radar$RadarStatus $status>
	//   24   56:aload_0         
	//   25   57:getfield        #43  <Field Location $location>
	//   26   60:aload_0         
	//   27   61:getfield        #45  <Field RadarEvent[] $events>
	//   28   64:aload_0         
	//   29   65:getfield        #47  <Field RadarUser $user>
	//   30   68:invokeinterface #86  <Method void io.radar.sdk.Radar$RadarCallback.onComplete(io.radar.sdk.Radar$RadarStatus, Location, RadarEvent[], RadarUser)>
	//*  31   73:goto            34
		ApiClient.access$getCallbacks$p(ApiClient.this).clear();
	//   32   76:aload_0         
	//   33   77:getfield        #39  <Field ApiClient this$0>
	//   34   80:invokestatic    #65  <Method ArrayList ApiClient.access$getCallbacks$p(ApiClient)>
	//   35   83:invokevirtual   #91  <Method void ArrayList.clear()>
		Unit unit = Unit.INSTANCE;
	//   36   86:getstatic       #97  <Field Unit Unit.INSTANCE>
	//   37   89:astore_2        
		apiclient;
	//   38   90:aload_1         
		JVM INSTR monitorexit ;
	//   39   91:monitorexit     
		return;
	//   40   92:return          
		Exception exception;
		exception;
	//   41   93:astore_2        
	//*  42   94:aload_1         
		throw exception;
	//   43   95:monitorexit     
	//   44   96:aload_2         
	//   45   97:athrow          
	}

	final RadarEvent $events[];
	final Location $location;
	final io.radar.sdk.Radar.RadarStatus $status;
	final RadarUser $user;
	final ApiClient this$0;

	ApiClient$deliverResult$1(ApiClient apiclient, io.radar.sdk.Radar.RadarStatus radarstatus, Location location, RadarEvent aradarevent[], RadarUser radaruser)
	{
		this$0 = apiclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field ApiClient this$0>
		$status = radarstatus;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #41  <Field io.radar.sdk.Radar$RadarStatus $status>
		$location = location;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #43  <Field Location $location>
		$events = aradarevent;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #45  <Field RadarEvent[] $events>
		$user = radaruser;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #47  <Field RadarUser $user>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #50  <Method void Object()>
	//   17   31:return          
	}
}
