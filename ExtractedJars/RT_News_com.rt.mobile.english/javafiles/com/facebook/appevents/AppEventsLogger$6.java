// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

static final class AppEventsLogger$6
	implements Runnable
{

	public void run()
	{
		AppEventsLogger.access$300(val$reason);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field AppEventsLogger$FlushReason val$reason>
	//    2    4:invokestatic    #24  <Method void AppEventsLogger.access$300(AppEventsLogger$FlushReason)>
	//    3    7:return          
	}

	final ushReason val$reason;

	AppEventsLogger$6(ushReason ushreason)
	{
		val$reason = ushreason;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AppEventsLogger$FlushReason val$reason>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
