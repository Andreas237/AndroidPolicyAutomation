// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsStorageListener, EventsFilesManager, EventsStrategy

public abstract class EventsHandler
	implements EventsStorageListener
{

	public EventsHandler(Context context1, EventsStrategy eventsstrategy, EventsFilesManager eventsfilesmanager, ScheduledExecutorService scheduledexecutorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #33  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #35  <Field Context context>
		executor = scheduledexecutorservice;
	//    6   12:aload_0         
	//    7   13:aload           4
	//    8   15:putfield        #37  <Field ScheduledExecutorService executor>
		strategy = eventsstrategy;
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:putfield        #39  <Field EventsStrategy strategy>
		eventsfilesmanager.registerRollOverListener(((EventsStorageListener) (this)));
	//   12   23:aload_3         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #45  <Method void EventsFilesManager.registerRollOverListener(EventsStorageListener)>
	//   15   28:return          
	}

	public void disable()
	{
		executeAsync(new Runnable() {

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
			//   16   34:getfield        #40  <Field Context EventsHandler.context>
			//   17   37:ldc1            #42  <String "Failed to disable events.">
			//   18   39:aload_1         
			//   19   40:invokestatic    #48  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
				}
			//   20   43:return          
			}

			final EventsHandler this$0;

			
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
);
	//    0    0:aload_0         
	//    1    1:new             #15  <Class EventsHandler$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #52  <Method void EventsHandler$4(EventsHandler)>
	//    5    9:invokevirtual   #56  <Method void executeAsync(Runnable)>
	//    6   12:return          
	}

	protected void executeAsync(Runnable runnable)
	{
		try
		{
			executor.submit(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ScheduledExecutorService executor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #64  <Method Future ScheduledExecutorService.submit(Runnable)>
	//    4   10:pop             
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Runnable runnable)
	//*   6   12:astore_1        
		{
			CommonUtils.logControlledError(context, "Failed to submit events task", ((Throwable) (runnable)));
	//    7   13:aload_0         
	//    8   14:getfield        #35  <Field Context context>
	//    9   17:ldc1            #66  <String "Failed to submit events task">
	//   10   19:aload_1         
	//   11   20:invokestatic    #72  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		}
	//   12   23:return          
	}

	protected void executeSync(Runnable runnable)
	{
		try
		{
			executor.submit(runnable).get();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ScheduledExecutorService executor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #64  <Method Future ScheduledExecutorService.submit(Runnable)>
	//    4   10:invokeinterface #79  <Method Object Future.get()>
	//    5   15:pop             
			return;
	//    6   16:return          
		}
		// Misplaced declaration of an exception variable
		catch(Runnable runnable)
	//*   7   17:astore_1        
		{
			CommonUtils.logControlledError(context, "Failed to run events task", ((Throwable) (runnable)));
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field Context context>
	//   10   22:ldc1            #81  <String "Failed to run events task">
	//   11   24:aload_1         
	//   12   25:invokestatic    #72  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
		}
	//   13   28:return          
	}

	protected abstract EventsStrategy getDisabledEventsStrategy();

	public void onRollOver(String s)
	{
		executeAsync(new Runnable() {

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
			//    8   18:getfield        #37  <Field Context EventsHandler.context>
			//    9   21:ldc1            #39  <String "Failed to send events files.">
			//   10   23:aload_1         
			//   11   24:invokestatic    #45  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
				}
			//   12   27:return          
			}

			final EventsHandler this$0;

			
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
);
	//    0    0:aload_0         
	//    1    1:new             #13  <Class EventsHandler$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #86  <Method void EventsHandler$3(EventsHandler)>
	//    5    9:invokevirtual   #56  <Method void executeAsync(Runnable)>
	//    6   12:return          
	}

	public void recordEventAsync(final Object event, final boolean sendImmediately)
	{
		executeAsync(new Runnable() {

			public void run()
			{
				try
				{
					strategy.recordEvent(event);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field EventsHandler this$0>
			//    2    4:getfield        #36  <Field EventsStrategy EventsHandler.strategy>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field Object val$event>
			//    5   11:invokeinterface #42  <Method void EventsStrategy.recordEvent(Object)>
					if(sendImmediately)
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
			//   18   42:getfield        #50  <Field Context EventsHandler.context>
			//   19   45:ldc1            #52  <String "Failed to record event.">
			//   20   47:aload_1         
			//   21   48:invokestatic    #58  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
				}
			//   22   51:return          
			}

			final EventsHandler this$0;
			final Object val$event;
			final boolean val$sendImmediately;

			
			{
				this$0 = EventsHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field EventsHandler this$0>
				event = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Object val$event>
				sendImmediately = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #25  <Field boolean val$sendImmediately>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #9   <Class EventsHandler$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:invokespecial   #91  <Method void EventsHandler$1(EventsHandler, Object, boolean)>
	//    7   11:invokevirtual   #56  <Method void executeAsync(Runnable)>
	//    8   14:return          
	}

	public void recordEventSync(final Object event)
	{
		executeSync(new Runnable() {

			public void run()
			{
				try
				{
					strategy.recordEvent(event);
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
			//   10   22:getfield        #41  <Field Context EventsHandler.context>
			//   11   25:ldc1            #43  <String "Crashlytics failed to record event">
			//   12   27:aload_1         
			//   13   28:invokestatic    #49  <Method void CommonUtils.logControlledError(Context, String, Throwable)>
				}
			//   14   31:return          
			}

			final EventsHandler this$0;
			final Object val$event;

			
			{
				this$0 = EventsHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field EventsHandler this$0>
				event = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$event>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #11  <Class EventsHandler$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #97  <Method void EventsHandler$2(EventsHandler, Object)>
	//    6   10:invokevirtual   #99  <Method void executeSync(Runnable)>
	//    7   13:return          
	}

	protected final Context context;
	protected final ScheduledExecutorService executor;
	protected EventsStrategy strategy;
}
