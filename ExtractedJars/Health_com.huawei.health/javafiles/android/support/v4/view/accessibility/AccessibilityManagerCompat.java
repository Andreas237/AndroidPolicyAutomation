// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompatIcs, AccessibilityManagerCompatKitKat

public final class AccessibilityManagerCompat
{
	static class AccessibilityManagerIcsImpl extends AccessibilityManagerStubImpl
	{

		public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener)
		{
			return AccessibilityManagerCompatIcs.addAccessibilityStateChangeListener(accessibilitymanager, newAccessibilityStateChangeListener(accessibilitystatechangelistener));
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

		public AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerWrapper newAccessibilityStateChangeListener(AccessibilityStateChangeListener accessibilitystatechangelistener)
		{
			return new AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerWrapper(((Object) (accessibilitystatechangelistener)), ((_cls1) (accessibilitystatechangelistener)). new AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge() {

				public void onAccessibilityStateChanged(boolean flag)
				{
					listener.onAccessibilityStateChanged(flag);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener val$listener>
				//    2    4:iload_1         
				//    3    5:invokeinterface #34  <Method void AccessibilityManagerCompat$AccessibilityStateChangeListener.onAccessibilityStateChanged(boolean)>
				//    4   10:return          
				}

				final AccessibilityManagerIcsImpl this$0;
				final AccessibilityStateChangeListener val$listener;

			
			{
				this$0 = final_accessibilitymanagericsimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AccessibilityManagerCompat$AccessibilityManagerIcsImpl this$0>
				listener = AccessibilityStateChangeListener.this;
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

		public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener)
		{
			return AccessibilityManagerCompatIcs.removeAccessibilityStateChangeListener(accessibilitymanager, newAccessibilityStateChangeListener(accessibilitystatechangelistener));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #20  <Method AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper newAccessibilityStateChangeListener(AccessibilityManagerCompat$AccessibilityStateChangeListener)>
		//    4    6:invokestatic    #51  <Method boolean AccessibilityManagerCompatIcs.removeAccessibilityStateChangeListener(AccessibilityManager, AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper)>
		//    5    9:ireturn         
		}

		AccessibilityManagerIcsImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void AccessibilityManagerCompat$AccessibilityManagerStubImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityManagerKitKatImpl extends AccessibilityManagerIcsImpl
	{

		public boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
		{
			return AccessibilityManagerCompatKitKat.addTouchExplorationStateChangeListener(accessibilitymanager, ((Object) (newTouchExplorationStateChangeListener(touchexplorationstatechangelistener))));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #20  <Method AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerWrapper newTouchExplorationStateChangeListener(AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
		//    4    6:invokestatic    #25  <Method boolean AccessibilityManagerCompatKitKat.addTouchExplorationStateChangeListener(AccessibilityManager, Object)>
		//    5    9:ireturn         
		}

		public AccessibilityManagerCompatKitKat.TouchExplorationStateChangeListenerWrapper newTouchExplorationStateChangeListener(TouchExplorationStateChangeListener touchexplorationstatechangelistener)
		{
			return new AccessibilityManagerCompatKitKat.TouchExplorationStateChangeListenerWrapper(((Object) (touchexplorationstatechangelistener)), ((_cls1) (touchexplorationstatechangelistener)). new AccessibilityManagerCompatKitKat.TouchExplorationStateChangeListenerBridge() {

				public void onTouchExplorationStateChanged(boolean flag)
				{
					listener.onTouchExplorationStateChanged(flag);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener val$listener>
				//    2    4:iload_1         
				//    3    5:invokeinterface #34  <Method void AccessibilityManagerCompat$TouchExplorationStateChangeListener.onTouchExplorationStateChanged(boolean)>
				//    4   10:return          
				}

				final AccessibilityManagerKitKatImpl this$0;
				final TouchExplorationStateChangeListener val$listener;

			
			{
				this$0 = final_accessibilitymanagerkitkatimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AccessibilityManagerCompat$AccessibilityManagerKitKatImpl this$0>
				listener = TouchExplorationStateChangeListener.this;
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

		public boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
		{
			return AccessibilityManagerCompatKitKat.removeTouchExplorationStateChangeListener(accessibilitymanager, ((Object) (newTouchExplorationStateChangeListener(touchexplorationstatechangelistener))));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #20  <Method AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerWrapper newTouchExplorationStateChangeListener(AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
		//    4    6:invokestatic    #36  <Method boolean AccessibilityManagerCompatKitKat.removeTouchExplorationStateChangeListener(AccessibilityManager, Object)>
		//    5    9:ireturn         
		}

		AccessibilityManagerKitKatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void AccessibilityManagerCompat$AccessibilityManagerIcsImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityManagerStubImpl
		implements AccessibilityManagerVersionImpl
	{

		public boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
		{
			return Collections.emptyList();
		//    0    0:invokestatic    #26  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
		{
			return Collections.emptyList();
		//    0    0:invokestatic    #26  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerWrapper newAccessibilityStateChangeListener(AccessibilityStateChangeListener accessibilitystatechangelistener)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public AccessibilityManagerCompatKitKat.TouchExplorationStateChangeListenerWrapper newTouchExplorationStateChangeListener(TouchExplorationStateChangeListener touchexplorationstatechangelistener)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		AccessibilityManagerStubImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface AccessibilityManagerVersionImpl
	{

		public abstract boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener);

		public abstract boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener);

		public abstract List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i);

		public abstract List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager);

		public abstract boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager);

		public abstract AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerWrapper newAccessibilityStateChangeListener(AccessibilityStateChangeListener accessibilitystatechangelistener);

		public abstract AccessibilityManagerCompatKitKat.TouchExplorationStateChangeListenerWrapper newTouchExplorationStateChangeListener(TouchExplorationStateChangeListener touchexplorationstatechangelistener);

		public abstract boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener);

		public abstract boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener);
	}

	public static interface AccessibilityStateChangeListener
	{

		public abstract void onAccessibilityStateChanged(boolean flag);
	}

	public static abstract class AccessibilityStateChangeListenerCompat
		implements AccessibilityStateChangeListener
	{

		public AccessibilityStateChangeListenerCompat()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface TouchExplorationStateChangeListener
	{

		public abstract void onTouchExplorationStateChanged(boolean flag);
	}


	private AccessibilityManagerCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
	//    2    4:return          
	}

	public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener)
	{
		return IMPL.addAccessibilityStateChangeListener(accessibilitymanager, accessibilitystatechangelistener);
	//    0    0:getstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.addAccessibilityStateChangeListener(AccessibilityManager, AccessibilityManagerCompat$AccessibilityStateChangeListener)>
	//    4   10:ireturn         
	}

	public static boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
	{
		return IMPL.addTouchExplorationStateChangeListener(accessibilitymanager, touchexplorationstatechangelistener);
	//    0    0:getstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #56  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.addTouchExplorationStateChangeListener(AccessibilityManager, AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//    4   10:ireturn         
	}

	public static List getEnabledAccessibilityServiceList(AccessibilityManager accessibilitymanager, int i)
	{
		return IMPL.getEnabledAccessibilityServiceList(accessibilitymanager, i);
	//    0    0:getstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokeinterface #60  <Method List AccessibilityManagerCompat$AccessibilityManagerVersionImpl.getEnabledAccessibilityServiceList(AccessibilityManager, int)>
	//    4   10:areturn         
	}

	public static List getInstalledAccessibilityServiceList(AccessibilityManager accessibilitymanager)
	{
		return IMPL.getInstalledAccessibilityServiceList(accessibilitymanager);
	//    0    0:getstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #66  <Method List AccessibilityManagerCompat$AccessibilityManagerVersionImpl.getInstalledAccessibilityServiceList(AccessibilityManager)>
	//    3    9:areturn         
	}

	public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilitymanager)
	{
		return IMPL.isTouchExplorationEnabled(accessibilitymanager);
	//    0    0:getstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #71  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.isTouchExplorationEnabled(AccessibilityManager)>
	//    3    9:ireturn         
	}

	public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilitymanager, AccessibilityStateChangeListener accessibilitystatechangelistener)
	{
		return IMPL.removeAccessibilityStateChangeListener(accessibilitymanager, accessibilitystatechangelistener);
	//    0    0:getstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #74  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.removeAccessibilityStateChangeListener(AccessibilityManager, AccessibilityManagerCompat$AccessibilityStateChangeListener)>
	//    4   10:ireturn         
	}

	public static boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
	{
		return IMPL.removeTouchExplorationStateChangeListener(accessibilitymanager, touchexplorationstatechangelistener);
	//    0    0:getstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #77  <Method boolean AccessibilityManagerCompat$AccessibilityManagerVersionImpl.removeTouchExplorationStateChangeListener(AccessibilityManager, AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//    4   10:ireturn         
	}

	private static final AccessibilityManagerVersionImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityManagerVersionImpl) (new AccessibilityManagerKitKatImpl()));
	//    3    8:new             #11  <Class AccessibilityManagerCompat$AccessibilityManagerKitKatImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #42  <Method void AccessibilityManagerCompat$AccessibilityManagerKitKatImpl()>
	//    6   15:putstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   8   19:getstatic       #39  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          14
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityManagerVersionImpl) (new AccessibilityManagerIcsImpl()));
	//   11   27:new             #6   <Class AccessibilityManagerCompat$AccessibilityManagerIcsImpl>
	//   12   30:dup             
	//   13   31:invokespecial   #45  <Method void AccessibilityManagerCompat$AccessibilityManagerIcsImpl()>
	//   14   34:putstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//   15   37:return          
		else
			IMPL = ((AccessibilityManagerVersionImpl) (new AccessibilityManagerStubImpl()));
	//   16   38:new             #16  <Class AccessibilityManagerCompat$AccessibilityManagerStubImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #46  <Method void AccessibilityManagerCompat$AccessibilityManagerStubImpl()>
	//   19   45:putstatic       #44  <Field AccessibilityManagerCompat$AccessibilityManagerVersionImpl IMPL>
	//*  20   48:return          
	}
}
