// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$3
	implements Runnable
{

	public void run()
	{
		if(AppEventsLogger.getFlushBehavior() != ushBehavior.EXPLICIT_ONLY)
	//*   0    0:invokestatic    #20  <Method AppEventsLogger$FlushBehavior AppEventsLogger.getFlushBehavior()>
	//*   1    3:getstatic       #26  <Field AppEventsLogger$FlushBehavior AppEventsLogger$FlushBehavior.EXPLICIT_ONLY>
	//*   2    6:if_acmpeq       15
			AppEventsLogger.access$300(ushReason.TIMER);
	//    3    9:getstatic       #32  <Field AppEventsLogger$FlushReason AppEventsLogger$FlushReason.TIMER>
	//    4   12:invokestatic    #36  <Method void AppEventsLogger.access$300(AppEventsLogger$FlushReason)>
	//    5   15:return          
	}

	AppEventsLogger$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
