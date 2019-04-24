// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompat

private static class AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper
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
	//*   8   12:invokevirtual   #30  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #30  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		} else
		{
			obj = ((Object) ((AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper>
	//   16   28:astore_1        
			return ((Object) (mListener)).equals(((Object) (((AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper) (obj)).mListener)));
	//   17   29:aload_0         
	//   18   30:getfield        #22  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener mListener>
	//   19   33:aload_1         
	//   20   34:getfield        #22  <Field AccessibilityManagerCompat$TouchExplorationStateChangeListener mListener>
	//   21   37:invokevirtual   #32  <Method boolean Object.equals(Object)>
	//   22   40:ireturn         
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

	final AccessibilityManagerCompat.TouchExplorationStateChangeListener mListener;

	AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper(AccessibilityManagerCompat.TouchExplorationStateChangeListener touchexplorationstatechangelistener)
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
