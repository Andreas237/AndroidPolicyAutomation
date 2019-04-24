// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatApi21

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl extends 
{

	public void addAction(Object obj, Object obj1)
	{
		AccessibilityNodeInfoCompatApi21.addAction(obj, obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #21  <Method void AccessibilityNodeInfoCompatApi21.addAction(Object, Object)>
	//    3    5:return          
	}

	public int getAccessibilityActionId(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.getAccessibilityActionId(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method int AccessibilityNodeInfoCompatApi21.getAccessibilityActionId(Object)>
	//    2    4:ireturn         
	}

	public CharSequence getAccessibilityActionLabel(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.getAccessibilityActionLabel(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method CharSequence AccessibilityNodeInfoCompatApi21.getAccessibilityActionLabel(Object)>
	//    2    4:areturn         
	}

	public List getActionList(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.getActionList(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #33  <Method List AccessibilityNodeInfoCompatApi21.getActionList(Object)>
	//    2    4:areturn         
	}

	public int getCollectionInfoSelectionMode(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.CollectionInfo.getSelectionMode(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #41  <Method int AccessibilityNodeInfoCompatApi21$CollectionInfo.getSelectionMode(Object)>
	//    2    4:ireturn         
	}

	public CharSequence getError(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.getError(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #44  <Method CharSequence AccessibilityNodeInfoCompatApi21.getError(Object)>
	//    2    4:areturn         
	}

	public int getMaxTextLength(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.getMaxTextLength(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method int AccessibilityNodeInfoCompatApi21.getMaxTextLength(Object)>
	//    2    4:ireturn         
	}

	public Object getWindow(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.getWindow(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #51  <Method Object AccessibilityNodeInfoCompatApi21.getWindow(Object)>
	//    2    4:areturn         
	}

	public boolean isCollectionItemSelected(Object obj)
	{
		return AccessibilityNodeInfoCompatApi21.CollectionItemInfo.isSelected(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method boolean AccessibilityNodeInfoCompatApi21$CollectionItemInfo.isSelected(Object)>
	//    2    4:ireturn         
	}

	public Object newAccessibilityAction(int i, CharSequence charsequence)
	{
		return AccessibilityNodeInfoCompatApi21.newAccessibilityAction(i, charsequence);
	//    0    0:iload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #62  <Method Object AccessibilityNodeInfoCompatApi21.newAccessibilityAction(int, CharSequence)>
	//    3    5:areturn         
	}

	public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
	{
		return AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(i, j, flag, k);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #66  <Method Object AccessibilityNodeInfoCompatApi21.obtainCollectionInfo(int, int, boolean, int)>
	//    5    8:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(i, j, k, l, flag, flag1);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:invokestatic    #70  <Method Object AccessibilityNodeInfoCompatApi21.obtainCollectionItemInfo(int, int, int, int, boolean, boolean)>
	//    7   12:areturn         
	}

	public boolean removeAction(Object obj, Object obj1)
	{
		return AccessibilityNodeInfoCompatApi21.removeAction(obj, obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #74  <Method boolean AccessibilityNodeInfoCompatApi21.removeAction(Object, Object)>
	//    3    5:ireturn         
	}

	public boolean removeChild(Object obj, View view)
	{
		return AccessibilityNodeInfoCompatApi21.removeChild(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #78  <Method boolean AccessibilityNodeInfoCompatApi21.removeChild(Object, View)>
	//    3    5:ireturn         
	}

	public boolean removeChild(Object obj, View view, int i)
	{
		return AccessibilityNodeInfoCompatApi21.removeChild(obj, view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #81  <Method boolean AccessibilityNodeInfoCompatApi21.removeChild(Object, View, int)>
	//    4    6:ireturn         
	}

	public void setError(Object obj, CharSequence charsequence)
	{
		AccessibilityNodeInfoCompatApi21.setError(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #85  <Method void AccessibilityNodeInfoCompatApi21.setError(Object, CharSequence)>
	//    3    5:return          
	}

	public void setMaxTextLength(Object obj, int i)
	{
		AccessibilityNodeInfoCompatApi21.setMaxTextLength(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #89  <Method void AccessibilityNodeInfoCompatApi21.setMaxTextLength(Object, int)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoKitKatImpl()>
	//    2    4:return          
	}
}
