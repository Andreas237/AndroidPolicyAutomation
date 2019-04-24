// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityNodeInfo;

// Referenced classes of package android.support.v4.view.a:
//			b

static class b$f extends b$e
{

	public Object a(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return ((Object) (android.view.accessibility.ssibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:iload           6
	//    6    9:invokestatic    #20  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean, boolean)>
	//    7   12:areturn         
	}

	public Object a(int i, int j, boolean flag, int k)
	{
		return ((Object) (android.view.accessibility.ssibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k)));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #26  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean, int)>
	//    5    8:areturn         
	}

	public Object a(int i, CharSequence charsequence)
	{
		return ((Object) (new android.view.accessibility.ssibilityNodeInfo.AccessibilityAction(i, charsequence)));
	//    0    0:new             #29  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #32  <Method void android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction(int, CharSequence)>
	//    5    9:areturn         
	}

	public void a(AccessibilityNodeInfo accessibilitynodeinfo, CharSequence charsequence)
	{
		accessibilitynodeinfo.setError(charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #39  <Method void AccessibilityNodeInfo.setError(CharSequence)>
	//    3    5:return          
	}

	public boolean c(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		return accessibilitynodeinfo.removeAction((android.view.accessibility.ssibilityNodeInfo.AccessibilityAction)obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:checkcast       #29  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    3    5:invokevirtual   #45  <Method boolean AccessibilityNodeInfo.removeAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    4    8:ireturn         
	}

	b$f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void b$e()>
	//    2    4:return          
	}
}
