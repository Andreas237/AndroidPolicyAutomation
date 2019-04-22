// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityManager;

public final class AccessibilityManagerCompat
{
	public static interface AccessibilityStateChangeListener
	{

		public abstract void onAccessibilityStateChanged(boolean flag);
	}

	public static interface TouchExplorationStateChangeListener
	{

		public abstract void onTouchExplorationStateChanged(boolean flag);
	}

	private static class TouchExplorationStateChangeListenerWrapper
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
			if(obj != null && ((Object)this).getClass() == obj.getClass())
		//*   5    7:aload_1         
		//*   6    8:ifnull          42
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #30  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #30  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       25
		//*  12   22:goto            42
			{
				obj = ((Object) ((TouchExplorationStateChangeListenerWrapper)obj));
		//   13   25:aload_1         
		//   14   26:checkcast       #2   <Class AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper>
		//   15   29:astore_1        
				return ((Object) (mListener)).equals(((Object) (((TouchExplorationStateChangeListenerWrapper) (obj)).mListener)));
		//   16   30:aload_0         
		//   17   31:getfield        #22  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener mListener>
		//   18   34:aload_1         
		//   19   35:getfield        #22  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener mListener>
		//   20   38:invokevirtual   #32  <Method boolean Object.equals(Object)>
		//   21   41:ireturn         
			} else
			{
				return false;
		//   22   42:iconst_0        
		//   23   43:ireturn         
			}
		}

		public int hashCode()
		{
			return ((Object) (mListener)).hashCode();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener mListener>
		//    2    4:invokevirtual   #36  <Method int Object.hashCode()>
		//    3    7:ireturn         
		}

		public void onTouchExplorationStateChanged(boolean flag)
		{
			mListener.onTouchExplorationStateChanged(flag);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener mListener>
		//    2    4:iload_1         
		//    3    5:invokeinterface #42  <Method void AccessibilityManagerCompat$TouchExplorationStateChangeListener.onTouchExplorationStateChanged(boolean)>
		//    4   10:return          
		}

		final TouchExplorationStateChangeListener mListener;

		TouchExplorationStateChangeListenerWrapper(TouchExplorationStateChangeListener touchexplorationstatechangelistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mListener = touchexplorationstatechangelistener;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener mListener>
		//    5    9:return          
		}
	}


	public static boolean addTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          27
		{
			if(touchexplorationstatechangelistener == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       14
				return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
			else
				return accessibilitymanager.addTouchExplorationStateChangeListener(((android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener) (new TouchExplorationStateChangeListenerWrapper(touchexplorationstatechangelistener))));
	//    7   14:aload_0         
	//    8   15:new             #12  <Class AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:invokespecial   #25  <Method void AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper(AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//   12   23:invokevirtual   #30  <Method boolean AccessibilityManager.addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener)>
	//   13   26:ireturn         
		} else
		{
			return false;
	//   14   27:iconst_0        
	//   15   28:ireturn         
		}
	}

	public static boolean removeTouchExplorationStateChangeListener(AccessibilityManager accessibilitymanager, TouchExplorationStateChangeListener touchexplorationstatechangelistener)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          27
		{
			if(touchexplorationstatechangelistener == null)
	//*   3    8:aload_1         
	//*   4    9:ifnonnull       14
				return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
			else
				return accessibilitymanager.removeTouchExplorationStateChangeListener(((android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener) (new TouchExplorationStateChangeListenerWrapper(touchexplorationstatechangelistener))));
	//    7   14:aload_0         
	//    8   15:new             #12  <Class AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper>
	//    9   18:dup             
	//   10   19:aload_1         
	//   11   20:invokespecial   #25  <Method void AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper(AccessibilityManagerCompat$TouchExplorationStateChangeListener)>
	//   12   23:invokevirtual   #34  <Method boolean AccessibilityManager.removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener)>
	//   13   26:ireturn         
		} else
		{
			return false;
	//   14   27:iconst_0        
	//   15   28:ireturn         
		}
	}
}
