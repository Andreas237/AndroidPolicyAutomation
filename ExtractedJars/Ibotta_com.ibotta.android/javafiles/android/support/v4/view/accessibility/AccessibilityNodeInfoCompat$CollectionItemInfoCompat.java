// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public static class AccessibilityNodeInfoCompat$CollectionItemInfoCompat
{

	public static AccessibilityNodeInfoCompat$CollectionItemInfoCompat obtain(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          27
			return new AccessibilityNodeInfoCompat$CollectionItemInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1))));
	//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//    4   11:dup             
	//    5   12:iload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:iload           5
	//   11   20:invokestatic    #30  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean, boolean)>
	//   12   23:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   13   26:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  14   27:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   30:bipush          19
	//*  16   32:icmplt          52
			return new AccessibilityNodeInfoCompat$CollectionItemInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag))));
	//   17   35:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//   18   38:dup             
	//   19   39:iload_0         
	//   20   40:iload_1         
	//   21   41:iload_2         
	//   22   42:iload_3         
	//   23   43:iload           4
	//   24   45:invokestatic    #35  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean)>
	//   25   48:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   26   51:areturn         
		else
			return new AccessibilityNodeInfoCompat$CollectionItemInfoCompat(((Object) (null)));
	//   27   52:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//   28   55:dup             
	//   29   56:aconst_null     
	//   30   57:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   31   60:areturn         
	}

	final Object mInfo;

	AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mInfo = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Object mInfo>
	//    5    9:return          
	}
}
