// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi19Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi18Impl
{

	public boolean canOpenPopup(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.canOpenPopup();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method boolean AccessibilityNodeInfo.canOpenPopup()>
	//    2    4:ireturn         
	}

	public Object getCollectionInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getCollectionInfo()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo AccessibilityNodeInfo.getCollectionInfo()>
	//    2    4:areturn         
	}

	public int getCollectionInfoColumnCount(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getColumnCount();
	//    0    0:aload_1         
	//    1    1:checkcast       #35  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    2    4:invokevirtual   #39  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getColumnCount()>
	//    3    7:ireturn         
	}

	public int getCollectionInfoRowCount(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getRowCount();
	//    0    0:aload_1         
	//    1    1:checkcast       #35  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    2    4:invokevirtual   #43  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getRowCount()>
	//    3    7:ireturn         
	}

	public int getCollectionItemColumnIndex(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getColumnIndex();
	//    0    0:aload_1         
	//    1    1:checkcast       #46  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    2    4:invokevirtual   #49  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getColumnIndex()>
	//    3    7:ireturn         
	}

	public int getCollectionItemColumnSpan(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getColumnSpan();
	//    0    0:aload_1         
	//    1    1:checkcast       #46  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    2    4:invokevirtual   #53  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getColumnSpan()>
	//    3    7:ireturn         
	}

	public Object getCollectionItemInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getCollectionItemInfo()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #57  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo AccessibilityNodeInfo.getCollectionItemInfo()>
	//    2    4:areturn         
	}

	public int getCollectionItemRowIndex(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getRowIndex();
	//    0    0:aload_1         
	//    1    1:checkcast       #46  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    2    4:invokevirtual   #61  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getRowIndex()>
	//    3    7:ireturn         
	}

	public int getCollectionItemRowSpan(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).getRowSpan();
	//    0    0:aload_1         
	//    1    1:checkcast       #46  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    2    4:invokevirtual   #65  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.getRowSpan()>
	//    3    7:ireturn         
	}

	public Bundle getExtras(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getExtras();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #70  <Method Bundle AccessibilityNodeInfo.getExtras()>
	//    2    4:areturn         
	}

	public int getInputType(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getInputType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #74  <Method int AccessibilityNodeInfo.getInputType()>
	//    2    4:ireturn         
	}

	public int getLiveRegion(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.getLiveRegion();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #77  <Method int AccessibilityNodeInfo.getLiveRegion()>
	//    2    4:ireturn         
	}

	public Object getRangeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (accessibilitynodeinfo.getRangeInfo()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #81  <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo AccessibilityNodeInfo.getRangeInfo()>
	//    2    4:areturn         
	}

	public CharSequence getRoleDescription(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return getExtras(accessibilitynodeinfo).getCharSequence("AccessibilityNodeInfo.roleDescription");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #85  <Method Bundle getExtras(AccessibilityNodeInfo)>
	//    3    5:ldc1            #14  <String "AccessibilityNodeInfo.roleDescription">
	//    4    7:invokevirtual   #91  <Method CharSequence Bundle.getCharSequence(String)>
	//    5   10:areturn         
	}

	public boolean isCollectionInfoHierarchical(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).isHierarchical();
	//    0    0:aload_1         
	//    1    1:checkcast       #35  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    2    4:invokevirtual   #96  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.isHierarchical()>
	//    3    7:ireturn         
	}

	public boolean isCollectionItemHeading(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).isHeading();
	//    0    0:aload_1         
	//    1    1:checkcast       #46  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    2    4:invokevirtual   #100 <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.isHeading()>
	//    3    7:ireturn         
	}

	public boolean isContentInvalid(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isContentInvalid();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #103 <Method boolean AccessibilityNodeInfo.isContentInvalid()>
	//    2    4:ireturn         
	}

	public boolean isDismissable(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isDismissable();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #106 <Method boolean AccessibilityNodeInfo.isDismissable()>
	//    2    4:ireturn         
	}

	public boolean isMultiLine(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return accessibilitynodeinfo.isMultiLine();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method boolean AccessibilityNodeInfo.isMultiLine()>
	//    2    4:ireturn         
	}

	public Object obtainCollectionInfo(int i, int j, boolean flag)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #115 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//    4    6:areturn         
	}

	public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #115 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//    4    6:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokestatic    #121 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean)>
	//    6   10:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokestatic    #121 <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean)>
	//    6   10:areturn         
	}

	public Object obtainRangeInfo(int i, float f, float f1, float f2)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i, f, f1, f2)));
	//    0    0:iload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:fload           4
	//    4    5:invokestatic    #129 <Method android.view.accessibility.AccessibilityNodeInfo$RangeInfo android.view.accessibility.AccessibilityNodeInfo$RangeInfo.obtain(int, float, float, float)>
	//    5    8:areturn         
	}

	public void setCanOpenPopup(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setCanOpenPopup(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #134 <Method void AccessibilityNodeInfo.setCanOpenPopup(boolean)>
	//    3    5:return          
	}

	public void setCollectionInfo(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		accessibilitynodeinfo.setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #35  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    3    5:invokevirtual   #139 <Method void AccessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo)>
	//    4    8:return          
	}

	public void setCollectionItemInfo(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		accessibilitynodeinfo.setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #46  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    3    5:invokevirtual   #143 <Method void AccessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo)>
	//    4    8:return          
	}

	public void setContentInvalid(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setContentInvalid(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #146 <Method void AccessibilityNodeInfo.setContentInvalid(boolean)>
	//    3    5:return          
	}

	public void setDismissable(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setDismissable(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #149 <Method void AccessibilityNodeInfo.setDismissable(boolean)>
	//    3    5:return          
	}

	public void setInputType(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		accessibilitynodeinfo.setInputType(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #154 <Method void AccessibilityNodeInfo.setInputType(int)>
	//    3    5:return          
	}

	public void setLiveRegion(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		accessibilitynodeinfo.setLiveRegion(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #157 <Method void AccessibilityNodeInfo.setLiveRegion(int)>
	//    3    5:return          
	}

	public void setMultiLine(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setMultiLine(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #160 <Method void AccessibilityNodeInfo.setMultiLine(boolean)>
	//    3    5:return          
	}

	public void setRangeInfo(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		accessibilitynodeinfo.setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #126 <Class android.view.accessibility.AccessibilityNodeInfo$RangeInfo>
	//    3    5:invokevirtual   #164 <Method void AccessibilityNodeInfo.setRangeInfo(android.view.accessibility.AccessibilityNodeInfo$RangeInfo)>
	//    4    8:return          
	}

	public void setRoleDescription(AccessibilityNodeInfo accessibilitynodeinfo, CharSequence charsequence)
	{
		getExtras(accessibilitynodeinfo).putCharSequence("AccessibilityNodeInfo.roleDescription", charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #85  <Method Bundle getExtras(AccessibilityNodeInfo)>
	//    3    5:ldc1            #14  <String "AccessibilityNodeInfo.roleDescription">
	//    4    7:aload_2         
	//    5    8:invokevirtual   #170 <Method void Bundle.putCharSequence(String, CharSequence)>
	//    6   11:return          
	}

	private static final String ROLE_DESCRIPTION_KEY = "AccessibilityNodeInfo.roleDescription";

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi18Impl()>
	//    2    4:return          
	}
}
