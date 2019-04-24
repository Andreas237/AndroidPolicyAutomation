// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi24Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi23Impl
{

	public Object getActionSetProgress()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS));
	//    0    0:getstatic       #23  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS>
	//    1    3:areturn         
	}

	public int getDrawingOrder(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getDrawingOrder();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method int AccessibilityNodeInfo.getDrawingOrder()>
	//    2    4:ireturn         
	}

	public boolean isImportantForAccessibility(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isImportantForAccessibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method boolean AccessibilityNodeInfo.isImportantForAccessibility()>
	//    2    4:ireturn         
	}

	public void setDrawingOrder(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		accessibilitynodeinfo.setDrawingOrder(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #40  <Method void AccessibilityNodeInfo.setDrawingOrder(int)>
	//    3    5:return          
	}

	public void setImportantForAccessibility(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setImportantForAccessibility(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #45  <Method void AccessibilityNodeInfo.setImportantForAccessibility(boolean)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi23Impl()>
	//    2    4:return          
	}
}
