// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			ServiceLifecycleDispatcher, LifecycleRegistry

static class ServiceLifecycleDispatcher$DispatchRunnable
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

	ServiceLifecycleDispatcher$DispatchRunnable(LifecycleRegistry lifecycleregistry, Lifecycle.Event event)
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
