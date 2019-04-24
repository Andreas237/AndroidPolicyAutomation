// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompat, AccessibilityManagerCompatIcs

static class AccessibilityManagerCompat$AccessibilityManagerIcsImpl extends 
{

	public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, ener ener)
	{
		return AccessibilityManagerCompatIcs.addAccessibilityStateChangeListener(accessibilitymanager, newAccessibilityStateChangeListener(ener));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper newAccessibilityStateChangeListener(AccessibilityManagerCompat$AccessibilityStateChangeListener)>
	//    4    6:invokestatic    #25  <Method boolean AccessibilityManagerCompatIcs.addAccessibilityStateChangeListener(AccessibilityManager, AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper)>
	//    5    9:ireturn         
	}

	public List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
	{
		return AccessibilityManagerCompatIcs.getEnabledAccessibilityServiceList(accessibilitymanager, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #29  <Method List AccessibilityManagerCompatIcs.getEnabledAccessibilityServiceList(AccessibilityManager, int)>
	//    3    5:areturn         
	}

	public List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
	{
		return AccessibilityManagerCompatIcs.getInstalledAccessibilityServiceList(accessibilitymanager);
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method List AccessibilityManagerCompatIcs.getInstalledAccessibilityServiceList(AccessibilityManager)>
	//    2    4:areturn         
	}

	public boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
	{
		return AccessibilityManagerCompatIcs.isTouchExplorationEnabled(accessibilitymanager);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method boolean AccessibilityManagerCompatIcs.isTouchExplorationEnabled(AccessibilityManager)>
	//    2    4:ireturn         
	}

	public istenerWrapper newAccessibilityStateChangeListener(final ener listener)
	{
		return new istenerWrapper(((Object) (listener)), new AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge() {

			public void onAccessibilityStateChanged(boolean flag)
			{
				listener.onAccessibilityStateChanged(flag);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener val$listener>
			//    2    4:iload_1         
			//    3    5:invokeinterface #34  <Method void AccessibilityManagerCompat$AccessibilityStateChangeListener.onAccessibilityStateChanged(boolean)>
			//    4   10:return          
			}

			final AccessibilityManagerCompat.AccessibilityManagerIcsImpl this$0;
			final AccessibilityManagerCompat.AccessibilityStateChangeListener val$listener;

			
			{
				this$0 = AccessibilityManagerCompat.AccessibilityManagerIcsImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AccessibilityManagerCompat$AccessibilityManagerIcsImpl this$0>
				listener = accessibilitystatechangelistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:new             #42  <Class AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #9   <Class AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #45  <Method void AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1(AccessibilityManagerCompat$AccessibilityManagerIcsImpl, AccessibilityManagerCompat$AccessibilityStateChangeListener)>
	//    8   14:invokespecial   #48  <Method void AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper(Object, AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge)>
	//    9   17:areturn         
	}

	public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, ener ener)
	{
		return AccessibilityManagerCompatIcs.removeAccessibilityStateChangeListener(accessibilitymanager, newAccessibilityStateChangeListener(ener));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper newAccessibilityStateChangeListener(AccessibilityManagerCompat$AccessibilityStateChangeListener)>
	//    4    6:invokestatic    #51  <Method boolean AccessibilityManagerCompatIcs.removeAccessibilityStateChangeListener(AccessibilityManager, AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper)>
	//    5    9:ireturn         
	}

	AccessibilityManagerCompat$AccessibilityManagerIcsImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void AccessibilityManagerCompat$AccessibilityManagerStubImpl()>
	//    2    4:return          
	}
}
