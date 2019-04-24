// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi23Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl
{

	public Object getActionContextClick()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK));
	//    0    0:getstatic       #23  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK>
	//    1    3:areturn         
	}

	public Object getActionScrollDown()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN));
	//    0    0:getstatic       #27  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN>
	//    1    3:areturn         
	}

	public Object getActionScrollLeft()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT));
	//    0    0:getstatic       #31  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT>
	//    1    3:areturn         
	}

	public Object getActionScrollRight()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT));
	//    0    0:getstatic       #35  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT>
	//    1    3:areturn         
	}

	public Object getActionScrollToPosition()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION));
	//    0    0:getstatic       #39  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION>
	//    1    3:areturn         
	}

	public Object getActionScrollUp()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP));
	//    0    0:getstatic       #43  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP>
	//    1    3:areturn         
	}

	public Object getActionShowOnScreen()
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN));
	//    0    0:getstatic       #47  <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN>
	//    1    3:areturn         
	}

	public boolean isContextClickable(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isContextClickable();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method boolean AccessibilityNodeInfo.isContextClickable()>
	//    2    4:ireturn         
	}

	public void setContextClickable(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setContextClickable(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #59  <Method void AccessibilityNodeInfo.setContextClickable(boolean)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi23Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl()>
	//    2    4:return          
	}
}
