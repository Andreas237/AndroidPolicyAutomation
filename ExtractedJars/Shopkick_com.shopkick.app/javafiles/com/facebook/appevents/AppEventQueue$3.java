// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventQueue, FlushReason

static final class AppEventQueue$3
	implements Runnable
{

	public void run()
	{
		AppEventQueue.flushAndWait(val$reason);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field FlushReason val$reason>
	//    2    4:invokestatic    #24  <Method void AppEventQueue.flushAndWait(FlushReason)>
	//    3    7:return          
	}

	final FlushReason val$reason;

	AppEventQueue$3(FlushReason flushreason)
	{
		val$reason = flushreason;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field FlushReason val$reason>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
