// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatJellybeanMr2

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr1Impl
{

	public List findAccessibilityNodeInfosByViewId(Object obj, String s)
	{
		return AccessibilityNodeInfoCompatJellybeanMr2.findAccessibilityNodeInfosByViewId(obj, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #21  <Method List AccessibilityNodeInfoCompatJellybeanMr2.findAccessibilityNodeInfosByViewId(Object, String)>
	//    3    5:areturn         
	}

	public int getTextSelectionEnd(Object obj)
	{
		return AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionEnd(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #27  <Method int AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionEnd(Object)>
	//    2    4:ireturn         
	}

	public int getTextSelectionStart(Object obj)
	{
		return AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionStart(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method int AccessibilityNodeInfoCompatJellybeanMr2.getTextSelectionStart(Object)>
	//    2    4:ireturn         
	}

	public String getViewIdResourceName(Object obj)
	{
		return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method String AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(Object)>
	//    2    4:areturn         
	}

	public boolean isEditable(Object obj)
	{
		return AccessibilityNodeInfoCompatJellybeanMr2.isEditable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method boolean AccessibilityNodeInfoCompatJellybeanMr2.isEditable(Object)>
	//    2    4:ireturn         
	}

	public boolean refresh(Object obj)
	{
		return AccessibilityNodeInfoCompatJellybeanMr2.refresh(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #41  <Method boolean AccessibilityNodeInfoCompatJellybeanMr2.refresh(Object)>
	//    2    4:ireturn         
	}

	public void setEditable(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatJellybeanMr2.setEditable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #45  <Method void AccessibilityNodeInfoCompatJellybeanMr2.setEditable(Object, boolean)>
	//    3    5:return          
	}

	public void setTextSelection(Object obj, int i, int j)
	{
		AccessibilityNodeInfoCompatJellybeanMr2.setTextSelection(obj, i, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #49  <Method void AccessibilityNodeInfoCompatJellybeanMr2.setTextSelection(Object, int, int)>
	//    4    6:return          
	}

	public void setViewIdResourceName(Object obj, String s)
	{
		AccessibilityNodeInfoCompatJellybeanMr2.setViewIdResourceName(obj, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #53  <Method void AccessibilityNodeInfoCompatJellybeanMr2.setViewIdResourceName(Object, String)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr2Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr1Impl()>
	//    2    4:return          
	}
}
