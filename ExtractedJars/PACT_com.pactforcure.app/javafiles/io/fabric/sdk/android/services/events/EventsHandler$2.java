// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsHandler, EventsStrategy

class EventsHandler$2
	implements Runnable
{

	public void run()
	{
		try
		{
			strategy.recordEvent(val$event);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field EventsHandler this$0>
	//    2    4:getfield        #32  <Field EventsStrategy EventsHandler.strategy>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Object val$event>
	//    5   11:invokeinterface #37  <Method void EventsStrategy.recordEvent(Object)>
			return;
	//    6   16:return          
		}
		catch(Exception exception)
	//*   7   17:astore_1        
		{
			CommonUtils.logControlledError(context, "Crashlytics failed to record event", ((Throwable) (exception)));
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field EventsHandler this$0>
	//   10   22:getfield        #41  <Field android.content.Context EventsHandler.context>
	//   11   25:ldc1            #43  <String "Crashlytics failed to record event">
	//   12   27:aload_1         
	//   13   28:invokestatic    #49  <Method void CommonUtils.logControlledError(android.content.Context, String, Throwable)>
		}
	//   14   31:return          
	}

	final EventsHandler this$0;
	final Object val$event;

	EventsHandler$2()
	{
		this$0 = final_eventshandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field EventsHandler this$0>
		val$event = Object.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Object val$event>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
