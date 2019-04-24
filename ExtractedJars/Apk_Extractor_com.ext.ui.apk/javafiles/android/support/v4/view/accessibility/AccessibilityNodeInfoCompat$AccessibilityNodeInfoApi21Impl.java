// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi19Impl
{

	public void addAction(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		accessibilitynodeinfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #19  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    3    5:invokevirtual   #24  <Method void AccessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    4    8:return          
	}

	public int getAccessibilityActionId(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getId();
	//    0    0:aload_1         
	//    1    1:checkcast       #19  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    2    4:invokevirtual   #30  <Method int android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getId()>
	//    3    7:ireturn         
	}

	public CharSequence getAccessibilityActionLabel(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getLabel();
	//    0    0:aload_1         
	//    1    1:checkcast       #19  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    2    4:invokevirtual   #36  <Method CharSequence android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getLabel()>
	//    3    7:areturn         
	}

	public List getActionList(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return (List)accessibilitynodeinfo.getActionList();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method List AccessibilityNodeInfo.getActionList()>
	//    2    4:checkcast       #43  <Class List>
	//    3    7:areturn         
	}

	public int getCollectionInfoSelectionMode(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getSelectionMode();
	//    0    0:aload_1         
	//    1    1:checkcast       #48  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    2    4:invokevirtual   #51  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getSelectionMode()>
	//    3    7:ireturn         
	}

	public CharSequence getError(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getError();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #55  <Method CharSequence AccessibilityNodeInfo.getError()>
	//    2    4:areturn         
	}

	public int getMaxTextLength(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getMaxTextLength();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method int AccessibilityNodeInfo.getMaxTextLength()>
	//    2    4:ireturn         
	}

	public Object getWindow(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getWindow()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method android.view.accessibility.AccessibilityWindowInfo AccessibilityNodeInfo.getWindow()>
	//    2    4:areturn         
	}

	public boolean isCollectionItemSelected(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).isSelected();
	//    0    0:aload_1         
	//    1    1:checkcast       #68  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    2    4:invokevirtual   #72  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.isSelected()>
	//    3    7:ireturn         
	}

	public Object newAccessibilityAction(int i, CharSequence charsequence)
	{
		return ((Object) (new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charsequence)));
	//    0    0:new             #19  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #77  <Method void android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction(int, CharSequence)>
	//    5    9:areturn         
	}

	public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #83  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean, int)>
	//    5    8:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:invokestatic    #88  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean, boolean)>
	//    7   12:areturn         
	}

	public boolean removeAction(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		return accessibilitynodeinfo.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #19  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    3    5:invokevirtual   #93  <Method boolean AccessibilityNodeInfo.removeAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    4    8:ireturn         
	}

	public boolean removeChild(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
		return accessibilitynodeinfo.removeChild(view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #98  <Method boolean AccessibilityNodeInfo.removeChild(View)>
	//    3    5:ireturn         
	}

	public boolean removeChild(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		return accessibilitynodeinfo.removeChild(view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #102 <Method boolean AccessibilityNodeInfo.removeChild(View, int)>
	//    4    6:ireturn         
	}

	public void setError(AccessibilityNodeInfo accessibilitynodeinfo, CharSequence charsequence)
	{
		accessibilitynodeinfo.setError(charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #107 <Method void AccessibilityNodeInfo.setError(CharSequence)>
	//    3    5:return          
	}

	public void setMaxTextLength(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		accessibilitynodeinfo.setMaxTextLength(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #112 <Method void AccessibilityNodeInfo.setMaxTextLength(int)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi19Impl()>
	//    2    4:return          
	}
}
