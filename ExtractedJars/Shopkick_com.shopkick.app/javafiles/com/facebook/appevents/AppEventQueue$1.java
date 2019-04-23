// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventQueue, AppEventsLogger, FlushReason

static final class AppEventQueue$1
	implements Runnable
{

	public void run()
	{
		java.util.concurrent.ScheduledFuture _tmp = AppEventQueue.access$002(((java.util.concurrent.ScheduledFuture) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #18  <Method java.util.concurrent.ScheduledFuture AppEventQueue.access$002(java.util.concurrent.ScheduledFuture)>
	//    2    4:pop             
		if(AppEventsLogger.getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
	//*   3    5:invokestatic    #24  <Method AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
	//*   4    8:getstatic       #30  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*   5   11:if_acmpeq       20
			AppEventQueue.flushAndWait(FlushReason.TIMER);
	//    6   14:getstatic       #36  <Field FlushReason FlushReason.TIMER>
	//    7   17:invokestatic    #40  <Method void AppEventQueue.flushAndWait(FlushReason)>
	//    8   20:return          
	}

	AppEventQueue$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
