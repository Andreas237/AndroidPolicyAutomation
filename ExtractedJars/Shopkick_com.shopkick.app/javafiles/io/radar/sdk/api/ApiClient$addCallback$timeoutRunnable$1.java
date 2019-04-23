// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.api;

import java.util.ArrayList;

// Referenced classes of package io.radar.sdk.api:
//			ApiClient

static final class ApiClient$addCallback$timeoutRunnable$1
	implements Runnable
{

	public final void run()
	{
		ApiClient apiclient = ApiClient.this;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ApiClient this$0>
	//    2    4:astore_1        
		apiclient;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		io.radar.sdk.Radar.RadarCallback.DefaultImpls.onComplete$default($callback, io.radar.sdk.Radar.RadarStatus.ERROR_LOCATION, ((android.location.Location) (null)), ((io.radar.sdk.model.RadarEvent []) (null)), ((io.radar.sdk.model.RadarUser) (null)), 14, ((Object) (null)));
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field io.radar.sdk.Radar$RadarCallback $callback>
	//    7   11:getstatic       #45  <Field io.radar.sdk.Radar$RadarStatus io.radar.sdk.Radar$RadarStatus.ERROR_LOCATION>
	//    8   14:aconst_null     
	//    9   15:aconst_null     
	//   10   16:aconst_null     
	//   11   17:bipush          14
	//   12   19:aconst_null     
	//   13   20:invokestatic    #51  <Method void io.radar.sdk.Radar$RadarCallback$DefaultImpls.onComplete$default(io.radar.sdk.Radar$RadarCallback, io.radar.sdk.Radar$RadarStatus, android.location.Location, io.radar.sdk.model.RadarEvent[], io.radar.sdk.model.RadarUser, int, Object)>
		ApiClient.access$getCallbacks$p(ApiClient.this).remove(((Object) ($callback)));
	//   14   23:aload_0         
	//   15   24:getfield        #33  <Field ApiClient this$0>
	//   16   27:invokestatic    #55  <Method ArrayList ApiClient.access$getCallbacks$p(ApiClient)>
	//   17   30:aload_0         
	//   18   31:getfield        #35  <Field io.radar.sdk.Radar$RadarCallback $callback>
	//   19   34:invokevirtual   #61  <Method boolean ArrayList.remove(Object)>
	//   20   37:pop             
		apiclient;
	//   21   38:aload_1         
		JVM INSTR monitorexit ;
	//   22   39:monitorexit     
		return;
	//   23   40:return          
		Exception exception;
		exception;
	//   24   41:astore_2        
	//*  25   42:aload_1         
		throw exception;
	//   26   43:monitorexit     
	//   27   44:aload_2         
	//   28   45:athrow          
	}

	final io.radar.sdk.Radar.RadarCallback $callback;
	final ApiClient this$0;

	ApiClient$addCallback$timeoutRunnable$1(ApiClient apiclient, io.radar.sdk.Radar.RadarCallback radarcallback)
	{
		this$0 = apiclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field ApiClient this$0>
		$callback = radarcallback;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #35  <Field io.radar.sdk.Radar$RadarCallback $callback>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #38  <Method void Object()>
	//    8   14:return          
	}
}
