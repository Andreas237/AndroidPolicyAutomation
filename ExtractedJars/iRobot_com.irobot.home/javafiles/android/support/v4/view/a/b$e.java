// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.a:
//			b

static class b$e extends b$d
{

	public Object a(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return ((Object) (android.view.accessibility.ssibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokestatic    #20  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean)>
	//    6   10:areturn         
	}

	public Object a(int i, int j, boolean flag, int k)
	{
		return ((Object) (android.view.accessibility.ssibilityNodeInfo.CollectionInfo.obtain(i, j, flag)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #26  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//    4    6:areturn         
	}

	public void a(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		accessibilitynodeinfo.setCollectionInfo((android.view.accessibility.ssibilityNodeInfo.CollectionInfo)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #23  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    3    5:invokevirtual   #33  <Method void AccessibilityNodeInfo.setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionInfo)>
	//    4    8:return          
	}

	public void b(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		accessibilitynodeinfo.setCollectionItemInfo((android.view.accessibility.ssibilityNodeInfo.CollectionItemInfo)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
	//    3    5:invokevirtual   #38  <Method void AccessibilityNodeInfo.setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo)>
	//    4    8:return          
	}

	public void c(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setContentInvalid(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #44  <Method void AccessibilityNodeInfo.setContentInvalid(boolean)>
	//    3    5:return          
	}

	public void d(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
		accessibilitynodeinfo.setCanOpenPopup(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #48  <Method void AccessibilityNodeInfo.setCanOpenPopup(boolean)>
	//    3    5:return          
	}

	b$e()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void b$d()>
	//    2    4:return          
	}
}
