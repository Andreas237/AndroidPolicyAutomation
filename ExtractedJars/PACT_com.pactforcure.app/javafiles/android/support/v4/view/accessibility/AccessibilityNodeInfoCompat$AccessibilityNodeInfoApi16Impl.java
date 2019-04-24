// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi16Impl extends AccessibilityNodeInfoCompat.AccessibilityNodeInfoBaseImpl
{

	public void addChild(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		accessibilitynodeinfo.addChild(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #22  <Method void AccessibilityNodeInfo.addChild(View, int)>
	//    4    6:return          
	}

	public Object findFocus(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		return ((Object) (accessibilitynodeinfo.findFocus(i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #27  <Method AccessibilityNodeInfo AccessibilityNodeInfo.findFocus(int)>
	//    3    5:areturn         
	}

	public Object focusSearch(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		return ((Object) (accessibilitynodeinfo.focusSearch(i)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #30  <Method AccessibilityNodeInfo AccessibilityNodeInfo.focusSearch(int)>
	//    3    5:areturn         
	}

	public int getMovementGranularities(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getMovementGranularities();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method int AccessibilityNodeInfo.getMovementGranularities()>
	//    2    4:ireturn         
	}

	public boolean isAccessibilityFocused(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isAccessibilityFocused();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method boolean AccessibilityNodeInfo.isAccessibilityFocused()>
	//    2    4:ireturn         
	}

	public boolean isVisibleToUser(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isVisibleToUser();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method boolean AccessibilityNodeInfo.isVisibleToUser()>
	//    2    4:ireturn         
	}

	public AccessibilityNodeInfo obtain(View view, int i)
	{
		return AccessibilityNodeInfo.obtain(view, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #47  <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View, int)>
	//    3    5:areturn         
	}

	public boolean performAction(AccessibilityNodeInfo accessibilitynodeinfo, int i, Bundle bundle)
	{
		return accessibilitynodeinfo.performAction(i, bundle);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #52  <Method boolean AccessibilityNodeInfo.performAction(int, Bundle)>
	//    4    6:ireturn         
	}

	public void setAccessibilityFocused(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setAccessibilityFocused(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #57  <Method void AccessibilityNodeInfo.setAccessibilityFocused(boolean)>
	//    3    5:return          
	}

	public void setMovementGranularities(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		accessibilitynodeinfo.setMovementGranularities(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #62  <Method void AccessibilityNodeInfo.setMovementGranularities(int)>
	//    3    5:return          
	}

	public void setParent(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		accessibilitynodeinfo.setParent(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #65  <Method void AccessibilityNodeInfo.setParent(View, int)>
	//    4    6:return          
	}

	public void setSource(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		accessibilitynodeinfo.setSource(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #68  <Method void AccessibilityNodeInfo.setSource(View, int)>
	//    4    6:return          
	}

	public void setVisibleToUser(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setVisibleToUser(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #71  <Method void AccessibilityNodeInfo.setVisibleToUser(boolean)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl()>
	//    2    4:return          
	}
}
