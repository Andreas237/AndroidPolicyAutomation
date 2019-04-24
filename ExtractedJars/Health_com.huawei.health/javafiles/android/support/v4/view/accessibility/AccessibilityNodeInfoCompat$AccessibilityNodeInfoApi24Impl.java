// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatApi24

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi24Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi23Impl
{

	public Object getActionSetProgress()
	{
		return AccessibilityNodeInfoCompatApi24.getActionSetProgress();
	//    0    0:invokestatic    #21  <Method Object AccessibilityNodeInfoCompatApi24.getActionSetProgress()>
	//    1    3:areturn         
	}

	public int getDrawingOrder(Object obj)
	{
		return AccessibilityNodeInfoCompatApi24.getDrawingOrder(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method int AccessibilityNodeInfoCompatApi24.getDrawingOrder(Object)>
	//    2    4:ireturn         
	}

	public boolean isImportantForAccessibility(Object obj)
	{
		return AccessibilityNodeInfoCompatApi24.isImportantForAccessibility(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method boolean AccessibilityNodeInfoCompatApi24.isImportantForAccessibility(Object)>
	//    2    4:ireturn         
	}

	public void setDrawingOrder(Object obj, int i)
	{
		AccessibilityNodeInfoCompatApi24.setDrawingOrder(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #33  <Method void AccessibilityNodeInfoCompatApi24.setDrawingOrder(Object, int)>
	//    3    5:return          
	}

	public void setImportantForAccessibility(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatApi24.setImportantForAccessibility(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #37  <Method void AccessibilityNodeInfoCompatApi24.setImportantForAccessibility(Object, boolean)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi23Impl()>
	//    2    4:return          
	}
}
