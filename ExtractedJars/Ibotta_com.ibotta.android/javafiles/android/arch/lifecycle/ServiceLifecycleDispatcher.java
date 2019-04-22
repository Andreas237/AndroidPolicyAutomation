// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.os.Handler;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleRegistry, LifecycleOwner, Lifecycle

public class ServiceLifecycleDispatcher
{
	static class DispatchRunnable
		implements Runnable
	{

		public void run()
		{
			if(!mWasExecuted)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field boolean mWasExecuted>
		//*   2    4:ifne            23
			{
				mRegistry.handleLifecycleEvent(mEvent);
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field LifecycleRegistry mRegistry>
		//    5   11:aload_0         
		//    6   12:getfield        #27  <Field Lifecycle$Event mEvent>
		//    7   15:invokevirtual   #36  <Method void LifecycleRegistry.handleLifecycleEvent(Lifecycle$Event)>
				mWasExecuted = true;
		//    8   18:aload_0         
		//    9   19:iconst_1        
		//   10   20:putfield        #23  <Field boolean mWasExecuted>
			}
		//   11   23:return          
		}

		final Lifecycle.Event mEvent;
		private final LifecycleRegistry mRegistry;
		private boolean mWasExecuted;

		DispatchRunnable(LifecycleRegistry lifecycleregistry, Lifecycle.Event event)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mWasExecuted = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #23  <Field boolean mWasExecuted>
			mRegistry = lifecycleregistry;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #25  <Field LifecycleRegistry mRegistry>
			mEvent = event;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #27  <Field Lifecycle$Event mEvent>
		//   11   19:return          
		}
	}


	public ServiceLifecycleDispatcher(LifecycleOwner lifecycleowner)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mRegistry = new LifecycleRegistry(lifecycleowner);
	//    2    4:aload_0         
	//    3    5:new             #21  <Class LifecycleRegistry>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #23  <Method void LifecycleRegistry(LifecycleOwner)>
	//    7   13:putfield        #25  <Field LifecycleRegistry mRegistry>
	//    8   16:aload_0         
	//    9   17:new             #27  <Class Handler>
	//   10   20:dup             
	//   11   21:invokespecial   #28  <Method void Handler()>
	//   12   24:putfield        #30  <Field Handler mHandler>
	//   13   27:return          
	}

	private void postDispatchRunnable(Lifecycle.Event event)
	{
		DispatchRunnable dispatchrunnable = mLastDispatchRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ServiceLifecycleDispatcher$DispatchRunnable mLastDispatchRunnable>
	//    2    4:astore_2        
		if(dispatchrunnable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			dispatchrunnable.run();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #39  <Method void ServiceLifecycleDispatcher$DispatchRunnable.run()>
		mLastDispatchRunnable = new DispatchRunnable(mRegistry, event);
	//    7   13:aload_0         
	//    8   14:new             #6   <Class ServiceLifecycleDispatcher$DispatchRunnable>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:getfield        #25  <Field LifecycleRegistry mRegistry>
	//   12   22:aload_1         
	//   13   23:invokespecial   #42  <Method void ServiceLifecycleDispatcher$DispatchRunnable(LifecycleRegistry, Lifecycle$Event)>
	//   14   26:putfield        #36  <Field ServiceLifecycleDispatcher$DispatchRunnable mLastDispatchRunnable>
		mHandler.postAtFrontOfQueue(((Runnable) (mLastDispatchRunnable)));
	//   15   29:aload_0         
	//   16   30:getfield        #30  <Field Handler mHandler>
	//   17   33:aload_0         
	//   18   34:getfield        #36  <Field ServiceLifecycleDispatcher$DispatchRunnable mLastDispatchRunnable>
	//   19   37:invokevirtual   #46  <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   20   40:pop             
	//   21   41:return          
	}

	public Lifecycle getLifecycle()
	{
		return ((Lifecycle) (mRegistry));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field LifecycleRegistry mRegistry>
	//    2    4:areturn         
	}

	public void onServicePreSuperOnBind()
	{
		postDispatchRunnable(Lifecycle.Event.ON_START);
	//    0    0:aload_0         
	//    1    1:getstatic       #55  <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//    2    4:invokespecial   #57  <Method void postDispatchRunnable(Lifecycle$Event)>
	//    3    7:return          
	}

	public void onServicePreSuperOnCreate()
	{
		postDispatchRunnable(Lifecycle.Event.ON_CREATE);
	//    0    0:aload_0         
	//    1    1:getstatic       #61  <Field Lifecycle$Event Lifecycle$Event.ON_CREATE>
	//    2    4:invokespecial   #57  <Method void postDispatchRunnable(Lifecycle$Event)>
	//    3    7:return          
	}

	public void onServicePreSuperOnDestroy()
	{
		postDispatchRunnable(Lifecycle.Event.ON_STOP);
	//    0    0:aload_0         
	//    1    1:getstatic       #65  <Field Lifecycle$Event Lifecycle$Event.ON_STOP>
	//    2    4:invokespecial   #57  <Method void postDispatchRunnable(Lifecycle$Event)>
		postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
	//    3    7:aload_0         
	//    4    8:getstatic       #68  <Field Lifecycle$Event Lifecycle$Event.ON_DESTROY>
	//    5   11:invokespecial   #57  <Method void postDispatchRunnable(Lifecycle$Event)>
	//    6   14:return          
	}

	public void onServicePreSuperOnStart()
	{
		postDispatchRunnable(Lifecycle.Event.ON_START);
	//    0    0:aload_0         
	//    1    1:getstatic       #55  <Field Lifecycle$Event Lifecycle$Event.ON_START>
	//    2    4:invokespecial   #57  <Method void postDispatchRunnable(Lifecycle$Event)>
	//    3    7:return          
	}

	private final Handler mHandler = new Handler();
	private DispatchRunnable mLastDispatchRunnable;
	private final LifecycleRegistry mRegistry;
}
