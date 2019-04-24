// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import io.fabric.sdk.android.services.common.CommonUtils;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsHandler, EventsStrategy

class EventsHandler$3
	implements Runnable
{

	public void run()
	{
		try
		{
			strategy.sendEvents();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field EventsHandler this$0>
	//    2    4:getfield        #28  <Field EventsStrategy EventsHandler.strategy>
	//    3    7:invokeinterface #33  <Method void EventsStrategy.sendEvents()>
			return;
	//    4   12:return          
		}
		catch(Exception exception)
	//*   5   13:astore_1        
		{
			CommonUtils.logControlledError(context, "Failed to send events files.", ((Throwable) (exception)));
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field EventsHandler this$0>
	//    8   18:getfield        #37  <Field android.content.Context EventsHandler.context>
	//    9   21:ldc1            #39  <String "Failed to send events files.">
	//   10   23:aload_1         
	//   11   24:invokestatic    #45  <Method void CommonUtils.logControlledError(android.content.Context, String, Throwable)>
		}
	//   12   27:return          
	}

	final EventsHandler this$0;

	EventsHandler$3()
	{
		this$0 = EventsHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field EventsHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
