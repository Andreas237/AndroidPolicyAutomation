// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatKitKat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoKitKatImpl extends _cls2Impl
{

	public boolean canOpenPopup(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.canOpenPopup(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method boolean AccessibilityNodeInfoCompatKitKat.canOpenPopup(Object)>
	//    2    4:ireturn         
	}

	public Object getCollectionInfo(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.getCollectionInfo(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method Object AccessibilityNodeInfoCompatKitKat.getCollectionInfo(Object)>
	//    2    4:areturn         
	}

	public int getCollectionInfoColumnCount(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionInfo.getColumnCount(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method int AccessibilityNodeInfoCompatKitKat$CollectionInfo.getColumnCount(Object)>
	//    2    4:ireturn         
	}

	public int getCollectionInfoRowCount(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionInfo.getRowCount(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method int AccessibilityNodeInfoCompatKitKat$CollectionInfo.getRowCount(Object)>
	//    2    4:ireturn         
	}

	public int getCollectionItemColumnIndex(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getColumnIndex(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method int AccessibilityNodeInfoCompatKitKat$CollectionItemInfo.getColumnIndex(Object)>
	//    2    4:ireturn         
	}

	public int getCollectionItemColumnSpan(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getColumnSpan(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method int AccessibilityNodeInfoCompatKitKat$CollectionItemInfo.getColumnSpan(Object)>
	//    2    4:ireturn         
	}

	public Object getCollectionItemInfo(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.getCollectionItemInfo(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #49  <Method Object AccessibilityNodeInfoCompatKitKat.getCollectionItemInfo(Object)>
	//    2    4:areturn         
	}

	public int getCollectionItemRowIndex(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getRowIndex(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method int AccessibilityNodeInfoCompatKitKat$CollectionItemInfo.getRowIndex(Object)>
	//    2    4:ireturn         
	}

	public int getCollectionItemRowSpan(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.getRowSpan(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #57  <Method int AccessibilityNodeInfoCompatKitKat$CollectionItemInfo.getRowSpan(Object)>
	//    2    4:ireturn         
	}

	public Bundle getExtras(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.getExtras(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #61  <Method Bundle AccessibilityNodeInfoCompatKitKat.getExtras(Object)>
	//    2    4:areturn         
	}

	public int getInputType(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.getInputType(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #64  <Method int AccessibilityNodeInfoCompatKitKat.getInputType(Object)>
	//    2    4:ireturn         
	}

	public int getLiveRegion(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.getLiveRegion(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #67  <Method int AccessibilityNodeInfoCompatKitKat.getLiveRegion(Object)>
	//    2    4:ireturn         
	}

	public Object getRangeInfo(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.getRangeInfo(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #70  <Method Object AccessibilityNodeInfoCompatKitKat.getRangeInfo(Object)>
	//    2    4:areturn         
	}

	public CharSequence getRoleDescription(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.getRoleDescription(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #74  <Method CharSequence AccessibilityNodeInfoCompatKitKat.getRoleDescription(Object)>
	//    2    4:areturn         
	}

	public boolean isCollectionInfoHierarchical(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionInfo.isHierarchical(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #78  <Method boolean AccessibilityNodeInfoCompatKitKat$CollectionInfo.isHierarchical(Object)>
	//    2    4:ireturn         
	}

	public boolean isCollectionItemHeading(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.CollectionItemInfo.isHeading(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #82  <Method boolean AccessibilityNodeInfoCompatKitKat$CollectionItemInfo.isHeading(Object)>
	//    2    4:ireturn         
	}

	public boolean isContentInvalid(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.isContentInvalid(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #85  <Method boolean AccessibilityNodeInfoCompatKitKat.isContentInvalid(Object)>
	//    2    4:ireturn         
	}

	public boolean isDismissable(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.isDismissable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method boolean AccessibilityNodeInfoCompatKitKat.isDismissable(Object)>
	//    2    4:ireturn         
	}

	public boolean isMultiLine(Object obj)
	{
		return AccessibilityNodeInfoCompatKitKat.isMultiLine(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #91  <Method boolean AccessibilityNodeInfoCompatKitKat.isMultiLine(Object)>
	//    2    4:ireturn         
	}

	public Object obtainCollectionInfo(int i, int j, boolean flag)
	{
		return AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(i, j, flag);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #95  <Method Object AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(int, int, boolean)>
	//    4    6:areturn         
	}

	public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
	{
		return AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(i, j, flag, k);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #98  <Method Object AccessibilityNodeInfoCompatKitKat.obtainCollectionInfo(int, int, boolean, int)>
	//    5    8:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag)
	{
		return AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(i, j, k, l, flag);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokestatic    #102 <Method Object AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(int, int, int, int, boolean)>
	//    6   10:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(i, j, k, l, flag);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokestatic    #102 <Method Object AccessibilityNodeInfoCompatKitKat.obtainCollectionItemInfo(int, int, int, int, boolean)>
	//    6   10:areturn         
	}

	public Object obtainRangeInfo(int i, float f, float f1, float f2)
	{
		return AccessibilityNodeInfoCompatKitKat.obtainRangeInfo(i, f, f1, f2);
	//    0    0:iload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:fload           4
	//    4    5:invokestatic    #107 <Method Object AccessibilityNodeInfoCompatKitKat.obtainRangeInfo(int, float, float, float)>
	//    5    8:areturn         
	}

	public void setCanOpenPopup(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatKitKat.setCanOpenPopup(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #111 <Method void AccessibilityNodeInfoCompatKitKat.setCanOpenPopup(Object, boolean)>
	//    3    5:return          
	}

	public void setCollectionInfo(Object obj, Object obj1)
	{
		AccessibilityNodeInfoCompatKitKat.setCollectionInfo(obj, obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #115 <Method void AccessibilityNodeInfoCompatKitKat.setCollectionInfo(Object, Object)>
	//    3    5:return          
	}

	public void setCollectionItemInfo(Object obj, Object obj1)
	{
		AccessibilityNodeInfoCompatKitKat.setCollectionItemInfo(obj, obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #118 <Method void AccessibilityNodeInfoCompatKitKat.setCollectionItemInfo(Object, Object)>
	//    3    5:return          
	}

	public void setContentInvalid(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatKitKat.setContentInvalid(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #121 <Method void AccessibilityNodeInfoCompatKitKat.setContentInvalid(Object, boolean)>
	//    3    5:return          
	}

	public void setDismissable(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatKitKat.setDismissable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #124 <Method void AccessibilityNodeInfoCompatKitKat.setDismissable(Object, boolean)>
	//    3    5:return          
	}

	public void setInputType(Object obj, int i)
	{
		AccessibilityNodeInfoCompatKitKat.setInputType(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #128 <Method void AccessibilityNodeInfoCompatKitKat.setInputType(Object, int)>
	//    3    5:return          
	}

	public void setLiveRegion(Object obj, int i)
	{
		AccessibilityNodeInfoCompatKitKat.setLiveRegion(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #131 <Method void AccessibilityNodeInfoCompatKitKat.setLiveRegion(Object, int)>
	//    3    5:return          
	}

	public void setMultiLine(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatKitKat.setMultiLine(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #134 <Method void AccessibilityNodeInfoCompatKitKat.setMultiLine(Object, boolean)>
	//    3    5:return          
	}

	public void setRangeInfo(Object obj, Object obj1)
	{
		AccessibilityNodeInfoCompatKitKat.setRangeInfo(obj, obj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #137 <Method void AccessibilityNodeInfoCompatKitKat.setRangeInfo(Object, Object)>
	//    3    5:return          
	}

	public void setRoleDescription(Object obj, CharSequence charsequence)
	{
		AccessibilityNodeInfoCompatKitKat.setRoleDescription(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #141 <Method void AccessibilityNodeInfoCompatKitKat.setRoleDescription(Object, CharSequence)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoKitKatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanMr2Impl()>
	//    2    4:return          
	}
}
