// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

class AccessibilityNodeInfoCompatJellybeanMr2
{

	AccessibilityNodeInfoCompatJellybeanMr2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static List findAccessibilityNodeInfosByViewId(Object obj, String s)
	{
		return (List)((AccessibilityNodeInfo)obj).findAccessibilityNodeInfosByViewId(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #19  <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByViewId(String)>
	//    4    8:checkcast       #21  <Class List>
	//    5   11:areturn         
	}

	public static int getTextSelectionEnd(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getTextSelectionEnd();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #28  <Method int AccessibilityNodeInfo.getTextSelectionEnd()>
	//    3    7:ireturn         
	}

	public static int getTextSelectionStart(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getTextSelectionStart();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #31  <Method int AccessibilityNodeInfo.getTextSelectionStart()>
	//    3    7:ireturn         
	}

	public static String getViewIdResourceName(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getViewIdResourceName();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #36  <Method String AccessibilityNodeInfo.getViewIdResourceName()>
	//    3    7:areturn         
	}

	public static boolean isEditable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isEditable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #41  <Method boolean AccessibilityNodeInfo.isEditable()>
	//    3    7:ireturn         
	}

	public static boolean refresh(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).refresh();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #44  <Method boolean AccessibilityNodeInfo.refresh()>
	//    3    7:ireturn         
	}

	public static void setEditable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setEditable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #49  <Method void AccessibilityNodeInfo.setEditable(boolean)>
	//    4    8:return          
	}

	public static void setTextSelection(Object obj, int i, int j)
	{
		((AccessibilityNodeInfo)obj).setTextSelection(i, j);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #54  <Method void AccessibilityNodeInfo.setTextSelection(int, int)>
	//    5    9:return          
	}

	public static void setViewIdResourceName(Object obj, String s)
	{
		((AccessibilityNodeInfo)obj).setViewIdResourceName(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #59  <Method void AccessibilityNodeInfo.setViewIdResourceName(String)>
	//    4    8:return          
	}
}
