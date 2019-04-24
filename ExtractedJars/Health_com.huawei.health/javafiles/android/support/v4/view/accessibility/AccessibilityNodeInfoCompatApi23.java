// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatApi23
{

	AccessibilityNodeInfoCompatApi23()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object getActionContextClick()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK));
	//    0    0:getstatic       #20  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK>
	//    1    3:areturn         
	}

	public static Object getActionScrollDown()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN));
	//    0    0:getstatic       #24  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN>
	//    1    3:areturn         
	}

	public static Object getActionScrollLeft()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT));
	//    0    0:getstatic       #28  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT>
	//    1    3:areturn         
	}

	public static Object getActionScrollRight()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT));
	//    0    0:getstatic       #32  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT>
	//    1    3:areturn         
	}

	public static Object getActionScrollToPosition()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION));
	//    0    0:getstatic       #36  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION>
	//    1    3:areturn         
	}

	public static Object getActionScrollUp()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP));
	//    0    0:getstatic       #40  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP>
	//    1    3:areturn         
	}

	public static Object getActionShowOnScreen()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN));
	//    0    0:getstatic       #44  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN>
	//    1    3:areturn         
	}

	public static boolean isContextClickable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isContextClickable();
	//    0    0:aload_0         
	//    1    1:checkcast       #48  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #51  <Method boolean AccessibilityNodeInfo.isContextClickable()>
	//    3    7:ireturn         
	}

	public static void setContextClickable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setContextClickable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #48  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #56  <Method void AccessibilityNodeInfo.setContextClickable(boolean)>
	//    4    8:return          
	}
}
