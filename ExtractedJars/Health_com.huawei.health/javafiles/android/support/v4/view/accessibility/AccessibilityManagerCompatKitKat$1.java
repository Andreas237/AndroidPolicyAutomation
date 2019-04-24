// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompatKitKat

static final class AccessibilityManagerCompatKitKat$1
	implements android.view.accessibility.onStateChangeListener
{

	public void onTouchExplorationStateChanged(boolean flag)
	{
		val$bridge.onTouchExplorationStateChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge val$bridge>
	//    2    4:iload_1         
	//    3    5:invokeinterface #27  <Method void AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge.onTouchExplorationStateChanged(boolean)>
	//    4   10:return          
	}

	final uchExplorationStateChangeListenerBridge val$bridge;

	AccessibilityManagerCompatKitKat$1(uchExplorationStateChangeListenerBridge uchexplorationstatechangelistenerbridge)
	{
		val$bridge = uchexplorationstatechangelistenerbridge;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge val$bridge>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
