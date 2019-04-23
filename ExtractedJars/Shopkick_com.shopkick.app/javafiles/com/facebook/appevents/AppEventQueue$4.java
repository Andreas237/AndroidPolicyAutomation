// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.appevents:
//			AppEventQueue, AppEventCollection, AppEventsLogger, FlushReason, 
//			AccessTokenAppIdPair, AppEvent

static final class AppEventQueue$4
	implements Runnable
{

	public void run()
	{
		AppEventQueue.access$100().addEvent(val$accessTokenAppId, val$appEvent);
	//    0    0:invokestatic    #29  <Method AppEventCollection AppEventQueue.access$100()>
	//    1    3:aload_0         
	//    2    4:getfield        #18  <Field AccessTokenAppIdPair val$accessTokenAppId>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field AppEvent val$appEvent>
	//    5   11:invokevirtual   #34  <Method void AppEventCollection.addEvent(AccessTokenAppIdPair, AppEvent)>
		if(AppEventsLogger.getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY && AppEventQueue.access$100().getEventCount() > 100)
	//*   6   14:invokestatic    #40  <Method AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
	//*   7   17:getstatic       #46  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*   8   20:if_acmpeq       41
	//*   9   23:invokestatic    #29  <Method AppEventCollection AppEventQueue.access$100()>
	//*  10   26:invokevirtual   #50  <Method int AppEventCollection.getEventCount()>
	//*  11   29:bipush          100
	//*  12   31:icmple          41
		{
			AppEventQueue.flushAndWait(FlushReason.EVENT_THRESHOLD);
	//   13   34:getstatic       #56  <Field FlushReason FlushReason.EVENT_THRESHOLD>
	//   14   37:invokestatic    #60  <Method void AppEventQueue.flushAndWait(FlushReason)>
			return;
	//   15   40:return          
		}
		if(AppEventQueue.access$000() == null)
	//*  16   41:invokestatic    #64  <Method java.util.concurrent.ScheduledFuture AppEventQueue.access$000()>
	//*  17   44:ifnonnull       68
		{
			java.util.concurrent.ScheduledFuture _tmp = AppEventQueue.access$002(AppEventQueue.access$300().schedule(AppEventQueue.access$200(), 15L, TimeUnit.SECONDS));
	//   18   47:invokestatic    #68  <Method ScheduledExecutorService AppEventQueue.access$300()>
	//   19   50:invokestatic    #72  <Method Runnable AppEventQueue.access$200()>
	//   20   53:ldc2w           #73  <Long 15L>
	//   21   56:getstatic       #80  <Field TimeUnit TimeUnit.SECONDS>
	//   22   59:invokeinterface #86  <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   23   64:invokestatic    #90  <Method java.util.concurrent.ScheduledFuture AppEventQueue.access$002(java.util.concurrent.ScheduledFuture)>
	//   24   67:pop             
		}
	//   25   68:return          
	}

	final AccessTokenAppIdPair val$accessTokenAppId;
	final AppEvent val$appEvent;

	AppEventQueue$4(AccessTokenAppIdPair accesstokenappidpair, AppEvent appevent)
	{
		val$accessTokenAppId = accesstokenappidpair;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AccessTokenAppIdPair val$accessTokenAppId>
		val$appEvent = appevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field AppEvent val$appEvent>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
