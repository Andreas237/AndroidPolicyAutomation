// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompat

private static class AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper
	implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
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
	//*   8   12:invokevirtual   #27  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #27  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		} else
		{
			obj = ((Object) ((AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper>
	//   16   28:astore_1        
			return ((Object) (mListener)).equals(((Object) (((AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper) (obj)).mListener)));
	//   17   29:aload_0         
	//   18   30:getfield        #19  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener mListener>
	//   19   33:aload_1         
	//   20   34:getfield        #19  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener mListener>
	//   21   37:invokevirtual   #29  <Method boolean Object.equals(Object)>
	//   22   40:ireturn         
		}
	}

	public int hashCode()
	{
		return ((Object) (mListener)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener mListener>
	//    2    4:invokevirtual   #33  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public void onAccessibilityStateChanged(boolean flag)
	{
		mListener.onAccessibilityStateChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener mListener>
	//    2    4:iload_1         
	//    3    5:invokeinterface #39  <Method void AccessibilityManagerCompat$AccessibilityStateChangeListener.onAccessibilityStateChanged(boolean)>
	//    4   10:return          
	}

	AccessibilityManagerCompat.AccessibilityStateChangeListener mListener;

	AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper(AccessibilityManagerCompat.AccessibilityStateChangeListener accessibilitystatechangelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mListener = accessibilitystatechangelistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field AccessibilityManagerCompat$AccessibilityStateChangeListener mListener>
	//    5    9:return          
	}
}
