// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public static class AccessibilityNodeInfoCompat$CollectionInfoCompat
{

	public static AccessibilityNodeInfoCompat$CollectionInfoCompat obtain(int i, int j, boolean flag, int k)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          23
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k))));
	//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//    4   11:dup             
	//    5   12:iload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokestatic    #30  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean, int)>
	//   10   19:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   11   22:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  12   23:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   26:bipush          19
	//*  14   28:icmplt          45
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag))));
	//   15   31:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   16   34:dup             
	//   17   35:iload_0         
	//   18   36:iload_1         
	//   19   37:iload_2         
	//   20   38:invokestatic    #35  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//   21   41:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   22   44:areturn         
		else
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (null)));
	//   23   45:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   24   48:dup             
	//   25   49:aconst_null     
	//   26   50:invokespecial   #32  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   27   53:areturn         
	}

	final Object mInfo;

	AccessibilityNodeInfoCompat$CollectionInfoCompat(Object obj)
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
