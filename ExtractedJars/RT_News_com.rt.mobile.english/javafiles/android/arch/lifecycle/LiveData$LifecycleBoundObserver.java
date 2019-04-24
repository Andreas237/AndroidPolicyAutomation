// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, LiveData, LifecycleOwner, Lifecycle, 
//			Observer

class LiveData$LifecycleBoundObserver extends LiveData.ObserverWrapper
	implements GenericLifecycleObserver
{

	void detachObserver()
	{
		mOwner.getLifecycle().removeObserver(((LifecycleObserver) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field LifecycleOwner mOwner>
	//    2    4:invokeinterface #36  <Method Lifecycle LifecycleOwner.getLifecycle()>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #42  <Method void Lifecycle.removeObserver(LifecycleObserver)>
	//    5   13:return          
	}

	boolean isAttachedTo(LifecycleOwner lifecycleowner)
	{
		return mOwner == lifecycleowner;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field LifecycleOwner mOwner>
	//    2    4:aload_1         
	//    3    5:if_acmpne       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void onStateChanged(LifecycleOwner lifecycleowner, Lifecycle.Event event)
	{
		if(mOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field LifecycleOwner mOwner>
	//*   2    4:invokeinterface #36  <Method Lifecycle LifecycleOwner.getLifecycle()>
	//*   3    9:invokevirtual   #50  <Method Lifecycle$State Lifecycle.getCurrentState()>
	//*   4   12:getstatic       #56  <Field Lifecycle$State Lifecycle$State.DESTROYED>
	//*   5   15:if_acmpne       30
		{
			removeObserver(mObserver);
	//    6   18:aload_0         
	//    7   19:getfield        #19  <Field LiveData this$0>
	//    8   22:aload_0         
	//    9   23:getfield        #60  <Field Observer mObserver>
	//   10   26:invokevirtual   #63  <Method void LiveData.removeObserver(Observer)>
			return;
	//   11   29:return          
		} else
		{
			activeStateChanged(shouldBeActive());
	//   12   30:aload_0         
	//   13   31:aload_0         
	//   14   32:invokevirtual   #67  <Method boolean shouldBeActive()>
	//   15   35:invokevirtual   #71  <Method void activeStateChanged(boolean)>
			return;
	//   16   38:return          
		}
	}

	boolean shouldBeActive()
	{
		return mOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field LifecycleOwner mOwner>
	//    2    4:invokeinterface #36  <Method Lifecycle LifecycleOwner.getLifecycle()>
	//    3    9:invokevirtual   #50  <Method Lifecycle$State Lifecycle.getCurrentState()>
	//    4   12:getstatic       #74  <Field Lifecycle$State Lifecycle$State.STARTED>
	//    5   15:invokevirtual   #78  <Method boolean Lifecycle$State.isAtLeast(Lifecycle$State)>
	//    6   18:ireturn         
	}

	final LifecycleOwner mOwner;
	final LiveData this$0;

	LiveData$LifecycleBoundObserver(LifecycleOwner lifecycleowner, Observer observer)
	{
		this$0 = LiveData.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LiveData this$0>
		super(LiveData.this, observer);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokespecial   #22  <Method void LiveData$ObserverWrapper(LiveData, Observer)>
		mOwner = lifecycleowner;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #24  <Field LifecycleOwner mOwner>
	//   10   16:return          
	}
}
