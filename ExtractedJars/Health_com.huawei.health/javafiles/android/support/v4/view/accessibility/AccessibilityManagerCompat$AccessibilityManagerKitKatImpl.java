// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompat, AccessibilityManagerCompatKitKat

static class AccessibilityManagerCompat$AccessibilityManagerKitKatImpl extends AccessibilityManagerCompat.AccessibilityManagerIcsImpl
{

	public boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, ener ener)
	{
		return AccessibilityManagerCompatKitKat.addTouchExplorationStateChangeListener(accessibilitymanager, ((Object) (newTouchExplorationStateChangeListener(ener))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerWrapper newTouchExplorationStateChangeListener(AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//    4    6:invokestatic    #25  <Method boolean AccessibilityManagerCompatKitKat.addTouchExplorationStateChangeListener(AccessibilityManager, Object)>
	//    5    9:ireturn         
	}

	public geListenerWrapper newTouchExplorationStateChangeListener(final ener listener)
	{
		return new geListenerWrapper(((Object) (listener)), new AccessibilityManagerCompatKitKat.TouchExplorationStateChangeListenerBridge() {

			public void onTouchExplorationStateChanged(boolean flag)
			{
				listener.onTouchExplorationStateChanged(flag);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener val$listener>
			//    2    4:iload_1         
			//    3    5:invokeinterface #34  <Method void AccessibilityManagerCompat$TouchExplorationStateChangeListener.onTouchExplorationStateChanged(boolean)>
			//    4   10:return          
			}

			final AccessibilityManagerCompat.AccessibilityManagerKitKatImpl this$0;
			final AccessibilityManagerCompat.TouchExplorationStateChangeListener val$listener;

			
			{
				this$0 = AccessibilityManagerCompat.AccessibilityManagerKitKatImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AccessibilityManagerCompat$AccessibilityManagerKitKatImpl this$0>
				listener = touchexplorationstatechangelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:new             #27  <Class AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerWrapper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #9   <Class AccessibilityManagerCompat$AccessibilityManagerKitKatImpl$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #30  <Method void AccessibilityManagerCompat$AccessibilityManagerKitKatImpl$1(AccessibilityManagerCompat$AccessibilityManagerKitKatImpl, AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//    8   14:invokespecial   #33  <Method void AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerWrapper(Object, AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge)>
	//    9   17:areturn         
	}

	public boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, ener ener)
	{
		return AccessibilityManagerCompatKitKat.removeTouchExplorationStateChangeListener(accessibilitymanager, ((Object) (newTouchExplorationStateChangeListener(ener))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerWrapper newTouchExplorationStateChangeListener(AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//    4    6:invokestatic    #36  <Method boolean AccessibilityManagerCompatKitKat.removeTouchExplorationStateChangeListener(AccessibilityManager, Object)>
	//    5    9:ireturn         
	}

	AccessibilityManagerCompat$AccessibilityManagerKitKatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AccessibilityManagerCompat$AccessibilityManagerIcsImpl()>
	//    2    4:return          
	}
}
