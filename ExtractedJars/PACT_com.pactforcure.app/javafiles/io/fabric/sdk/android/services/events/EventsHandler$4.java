// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsHandler, EventsStrategy

class EventsHandler$4
	implements Runnable
{

	public void run()
	{
		try
		{
			EventsStrategy eventsstrategy = strategy;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field EventsHandler this$0>
	//    2    4:getfield        #27  <Field EventsStrategy EventsHandler.strategy>
	//    3    7:astore_1        
			strategy = getDisabledEventsStrategy();
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field EventsHandler this$0>
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field EventsHandler this$0>
	//    8   16:invokevirtual   #31  <Method EventsStrategy EventsHandler.getDisabledEventsStrategy()>
	//    9   19:putfield        #27  <Field EventsStrategy EventsHandler.strategy>
			eventsstrategy.deleteAllEvents();
	//   10   22:aload_1         
	//   11   23:invokeinterface #36  <Method void EventsStrategy.deleteAllEvents()>
			return;
	//   12   28:return          
		}
		catch(Exception exception)
	//*  13   29:astore_1        
		{
			CommonUtils.logControlledError(context, "Failed to disable events.", ((Throwable) (exception)));
	//   14   30:aload_0         
	//   15   31:getfield        #17  <Field EventsHandler this$0>
	//   16   34:getfield        #40  <Field android.content.Context EventsHandler.context>
	//   17   37:ldc1            #42  <String "Failed to disable events.">
	//   18   39:aload_1         
	//   19   40:invokestatic    #48  <Method void CommonUtils.logControlledError(android.content.Context, String, Throwable)>
		}
	//   20   43:return          
	}

	final EventsHandler this$0;

	EventsHandler$4()
	{
		this$0 = EventsHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field EventsHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
