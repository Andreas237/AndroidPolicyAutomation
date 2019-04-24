// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi18Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi17Impl
{

	public List findAccessibilityNodeInfosByViewId(AccessibilityNodeInfo accessibilitynodeinfo, String s)
	{
		return accessibilitynodeinfo.findAccessibilityNodeInfosByViewId(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #22  <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByViewId(String)>
	//    3    5:areturn         
	}

	public int getTextSelectionEnd(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getTextSelectionEnd();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method int AccessibilityNodeInfo.getTextSelectionEnd()>
	//    2    4:ireturn         
	}

	public int getTextSelectionStart(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getTextSelectionStart();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method int AccessibilityNodeInfo.getTextSelectionStart()>
	//    2    4:ireturn         
	}

	public String getViewIdResourceName(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getViewIdResourceName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method String AccessibilityNodeInfo.getViewIdResourceName()>
	//    2    4:areturn         
	}

	public boolean isEditable(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isEditable();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method boolean AccessibilityNodeInfo.isEditable()>
	//    2    4:ireturn         
	}

	public boolean refresh(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.refresh();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method boolean AccessibilityNodeInfo.refresh()>
	//    2    4:ireturn         
	}

	public void setEditable(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setEditable(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #50  <Method void AccessibilityNodeInfo.setEditable(boolean)>
	//    3    5:return          
	}

	public void setTextSelection(AccessibilityNodeInfo accessibilitynodeinfo, int i, int j)
	{
		accessibilitynodeinfo.setTextSelection(i, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #55  <Method void AccessibilityNodeInfo.setTextSelection(int, int)>
	//    4    6:return          
	}

	public void setViewIdResourceName(AccessibilityNodeInfo accessibilitynodeinfo, String s)
	{
		accessibilitynodeinfo.setViewIdResourceName(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #60  <Method void AccessibilityNodeInfo.setViewIdResourceName(String)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi18Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi17Impl()>
	//    2    4:return          
	}
}
