// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityManagerCompatIcs

public static class AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper
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
	//*   8   12:invokevirtual   #29  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #29  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper>
	//   16   28:astore_1        
		if(mListener == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #20  <Field Object mListener>
	//*  19   33:ifnonnull       47
			return ((AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper) (obj)).mListener == null;
	//   20   36:aload_1         
	//   21   37:getfield        #20  <Field Object mListener>
	//   22   40:ifnonnull       45
	//   23   43:iconst_1        
	//   24   44:ireturn         
	//   25   45:iconst_0        
	//   26   46:ireturn         
		else
			return mListener.equals(((AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper) (obj)).mListener);
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

	public void onAccessibilityStateChanged(boolean flag)
	{
		mListenerBridge.onAccessibilityStateChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge mListenerBridge>
	//    2    4:iload_1         
	//    3    5:invokeinterface #41  <Method void AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge.onAccessibilityStateChanged(boolean)>
	//    4   10:return          
	}

	Object mListener;
	AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge mListenerBridge;

	public AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerWrapper(Object obj, AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge accessibilitystatechangelistenerbridge)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mListener = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Object mListener>
		mListenerBridge = accessibilitystatechangelistenerbridge;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge mListenerBridge>
	//    8   14:return          
	}
}
