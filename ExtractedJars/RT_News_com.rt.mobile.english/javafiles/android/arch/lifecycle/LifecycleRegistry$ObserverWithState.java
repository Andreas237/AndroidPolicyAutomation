// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LifecycleRegistry, Lifecycling, GenericLifecycleObserver, LifecycleObserver, 
//			LifecycleOwner

static class LifecycleRegistry$ObserverWithState
{

	void dispatchEvent(LifecycleOwner lifecycleowner, Lifecycle.Event event)
	{
		Lifecycle.State state = LifecycleRegistry.getStateAfter(event);
	//    0    0:aload_2         
	//    1    1:invokestatic    #33  <Method Lifecycle$State LifecycleRegistry.getStateAfter(Lifecycle$Event)>
	//    2    4:astore_3        
		mState = LifecycleRegistry.min(mState, state);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field Lifecycle$State mState>
	//    6   10:aload_3         
	//    7   11:invokestatic    #37  <Method Lifecycle$State LifecycleRegistry.min(Lifecycle$State, Lifecycle$State)>
	//    8   14:putfield        #26  <Field Lifecycle$State mState>
		mLifecycleObserver.onStateChanged(lifecycleowner, event);
	//    9   17:aload_0         
	//   10   18:getfield        #24  <Field GenericLifecycleObserver mLifecycleObserver>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokeinterface #42  <Method void GenericLifecycleObserver.onStateChanged(LifecycleOwner, Lifecycle$Event)>
		mState = state;
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:putfield        #26  <Field Lifecycle$State mState>
	//   17   33:return          
	}

	GenericLifecycleObserver mLifecycleObserver;
	Lifecycle.State mState;

	LifecycleRegistry$ObserverWithState(LifecycleObserver lifecycleobserver, Lifecycle.State state)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mLifecycleObserver = Lifecycling.getCallback(((Object) (lifecycleobserver)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method GenericLifecycleObserver Lifecycling.getCallback(Object)>
	//    5    9:putfield        #24  <Field GenericLifecycleObserver mLifecycleObserver>
		mState = state;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #26  <Field Lifecycle$State mState>
	//    9   17:return          
	}
}
