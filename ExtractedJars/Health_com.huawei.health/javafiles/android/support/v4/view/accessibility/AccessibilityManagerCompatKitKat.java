// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;

class AccessibilityManagerCompatKitKat
{
	static interface TouchExplorationStateChangeListenerBridge
	{

		public abstract void onTouchExplorationStateChanged(boolean flag);
	}

	public static class TouchExplorationStateChangeListenerWrapper
		implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj == null || ((Object)this).getClass() != obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          22
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #29  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #29  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
				return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			obj = ((Object) ((TouchExplorationStateChangeListenerWrapper)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerWrapper>
		//   16   28:astore_1        
			if(mListener == null)
		//*  17   29:aload_0         
		//*  18   30:getfield        #20  <Field Object mListener>
		//*  19   33:ifnonnull       47
				return ((TouchExplorationStateChangeListenerWrapper) (obj)).mListener == null;
		//   20   36:aload_1         
		//   21   37:getfield        #20  <Field Object mListener>
		//   22   40:ifnonnull       45
		//   23   43:iconst_1        
		//   24   44:ireturn         
		//   25   45:iconst_0        
		//   26   46:ireturn         
			else
				return mListener.equals(((TouchExplorationStateChangeListenerWrapper) (obj)).mListener);
		//   27   47:aload_0         
		//   28   48:getfield        #20  <Field Object mListener>
		//   29   51:aload_1         
		//   30   52:getfield        #20  <Field Object mListener>
		//   31   55:invokevirtual   #31  <Method boolean Object.equals(Object)>
		//   32   58:ireturn         
		}

		public int hashCode()
		{
			if(mListener == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field Object mListener>
		//*   2    4:ifnonnull       9
				return 0;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			else
				return mListener.hashCode();
		//    5    9:aload_0         
		//    6   10:getfield        #20  <Field Object mListener>
		//    7   13:invokevirtual   #35  <Method int Object.hashCode()>
		//    8   16:ireturn         
		}

		public void onTouchExplorationStateChanged(boolean flag)
		{
			mListenerBridge.onTouchExplorationStateChanged(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge mListenerBridge>
		//    2    4:iload_1         
		//    3    5:invokeinterface #41  <Method void AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge.onTouchExplorationStateChanged(boolean)>
		//    4   10:return          
		}

		final Object mListener;
		final TouchExplorationStateChangeListenerBridge mListenerBridge;

		public TouchExplorationStateChangeListenerWrapper(Object obj, TouchExplorationStateChangeListenerBridge touchexplorationstatechangelistenerbridge)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mListener = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Object mListener>
			mListenerBridge = touchexplorationstatechangelistenerbridge;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge mListenerBridge>
		//    8   14:return          
		}
	}


	AccessibilityManagerCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public static boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
	{
		return accessibilitymanager.addTouchExplorationStateChangeListener((android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener>
	//    3    5:invokevirtual   #29  <Method boolean AccessibilityManager.addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener)>
	//    4    8:ireturn         
	}

	public static Object newTouchExplorationStateChangeListener(TouchExplorationStateChangeListenerBridge touchexplorationstatechangelistenerbridge)
	{
		return ((Object) (new android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener(touchexplorationstatechangelistenerbridge) {

			public void onTouchExplorationStateChanged(boolean flag)
			{
				bridge.onTouchExplorationStateChanged(flag);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge val$bridge>
			//    2    4:iload_1         
			//    3    5:invokeinterface #27  <Method void AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge.onTouchExplorationStateChanged(boolean)>
			//    4   10:return          
			}

			final TouchExplorationStateChangeListenerBridge val$bridge;

			
			{
				bridge = touchexplorationstatechangelistenerbridge;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge val$bridge>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #6   <Class AccessibilityManagerCompatKitKat$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #34  <Method void AccessibilityManagerCompatKitKat$1(AccessibilityManagerCompatKitKat$TouchExplorationStateChangeListenerBridge)>
	//    4    8:areturn         
	}

	public static boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, Object obj)
	{
		return accessibilitymanager.removeTouchExplorationStateChangeListener((android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener>
	//    3    5:invokevirtual   #37  <Method boolean AccessibilityManager.removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener)>
	//    4    8:ireturn         
	}
}
