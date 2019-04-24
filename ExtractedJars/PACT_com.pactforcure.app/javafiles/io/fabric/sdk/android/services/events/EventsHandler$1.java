// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsHandler, EventsStrategy

class EventsHandler$1
	implements Runnable
{

	public void run()
	{
		try
		{
			strategy.recordEvent(val$event);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field EventsHandler this$0>
	//    2    4:getfield        #36  <Field EventsStrategy EventsHandler.strategy>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Object val$event>
	//    5   11:invokeinterface #42  <Method void EventsStrategy.recordEvent(Object)>
			if(val$sendImmediately)
	//*   6   16:aload_0         
	//*   7   17:getfield        #25  <Field boolean val$sendImmediately>
	//*   8   20:ifeq            36
				strategy.rollFileOver();
	//    9   23:aload_0         
	//   10   24:getfield        #21  <Field EventsHandler this$0>
	//   11   27:getfield        #36  <Field EventsStrategy EventsHandler.strategy>
	//   12   30:invokeinterface #46  <Method boolean EventsStrategy.rollFileOver()>
	//   13   35:pop             
			return;
	//   14   36:return          
		}
		catch(Exception exception)
	//*  15   37:astore_1        
		{
			CommonUtils.logControlledError(context, "Failed to record event.", ((Throwable) (exception)));
	//   16   38:aload_0         
	//   17   39:getfield        #21  <Field EventsHandler this$0>
	//   18   42:getfield        #50  <Field android.content.Context EventsHandler.context>
	//   19   45:ldc1            #52  <String "Failed to record event.">
	//   20   47:aload_1         
	//   21   48:invokestatic    #58  <Method void CommonUtils.logControlledError(android.content.Context, String, Throwable)>
		}
	//   22   51:return          
	}

	final EventsHandler this$0;
	final Object val$event;
	final boolean val$sendImmediately;

	EventsHandler$1()
	{
		this$0 = final_eventshandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field EventsHandler this$0>
		val$event = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Object val$event>
		val$sendImmediately = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field boolean val$sendImmediately>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
