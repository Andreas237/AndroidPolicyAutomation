// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$2
	implements Runnable
{

	public void run()
	{
		AppEventsLogger.access$200(val$logger, val$eventTime);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AppEventsLogger val$logger>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field long val$eventTime>
	//    4    8:invokestatic    #29  <Method void AppEventsLogger.access$200(AppEventsLogger, long)>
	//    5   11:return          
	}

	final long val$eventTime;
	final AppEventsLogger val$logger;

	AppEventsLogger$2(AppEventsLogger appeventslogger, long l)
	{
		val$logger = appeventslogger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AppEventsLogger val$logger>
		val$eventTime = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #21  <Field long val$eventTime>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
