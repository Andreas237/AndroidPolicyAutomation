// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatApi24
{

	AccessibilityNodeInfoCompatApi24()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object getActionSetProgress()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS));
	//    0    0:getstatic       #20  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS>
	//    1    3:areturn         
	}

	public static int getDrawingOrder(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getDrawingOrder();
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #27  <Method int AccessibilityNodeInfo.getDrawingOrder()>
	//    3    7:ireturn         
	}

	public static boolean isImportantForAccessibility(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isImportantForAccessibility();
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #32  <Method boolean AccessibilityNodeInfo.isImportantForAccessibility()>
	//    3    7:ireturn         
	}

	public static void setDrawingOrder(Object obj, int i)
	{
		((AccessibilityNodeInfo)obj).setDrawingOrder(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #37  <Method void AccessibilityNodeInfo.setDrawingOrder(int)>
	//    4    8:return          
	}

	public static void setImportantForAccessibility(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setImportantForAccessibility(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #42  <Method void AccessibilityNodeInfo.setImportantForAccessibility(boolean)>
	//    4    8:return          
	}
}
