// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$1
	implements Runnable
{

	public void run()
	{
		AppEventsLogger.access$000(val$logger, val$eventTime, val$sourceApplicationInfo);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AppEventsLogger val$logger>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field long val$eventTime>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field String val$sourceApplicationInfo>
	//    6   12:invokestatic    #33  <Method void AppEventsLogger.access$000(AppEventsLogger, long, String)>
	//    7   15:return          
	}

	final long val$eventTime;
	final AppEventsLogger val$logger;
	final String val$sourceApplicationInfo;

	AppEventsLogger$1(AppEventsLogger appeventslogger, long l, String s)
	{
		val$logger = appeventslogger;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AppEventsLogger val$logger>
		val$eventTime = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #23  <Field long val$eventTime>
		val$sourceApplicationInfo = s;
	//    6   10:aload_0         
	//    7   11:aload           4
	//    8   13:putfield        #25  <Field String val$sourceApplicationInfo>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #28  <Method void Object()>
	//   11   20:return          
	}
}
