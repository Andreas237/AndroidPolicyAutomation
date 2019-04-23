// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public static class AccessibilityNodeInfoCompat$CollectionInfoCompat
{

	public static AccessibilityNodeInfoCompat$CollectionInfoCompat obtain(int i, int j, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          22
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag))));
	//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//    4   11:dup             
	//    5   12:iload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:invokestatic    #36  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//    9   18:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   10   21:areturn         
		else
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (null)));
	//   11   22:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   12   25:dup             
	//   13   26:aconst_null     
	//   14   27:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   15   30:areturn         
	}

	public static AccessibilityNodeInfoCompat$CollectionInfoCompat obtain(int i, int j, boolean flag, int k)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          23
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k))));
	//    3    8:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//    4   11:dup             
	//    5   12:iload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokestatic    #42  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean, int)>
	//   10   19:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   11   22:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  12   23:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   26:bipush          19
	//*  14   28:icmplt          45
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag))));
	//   15   31:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   16   34:dup             
	//   17   35:iload_0         
	//   18   36:iload_1         
	//   19   37:iload_2         
	//   20   38:invokestatic    #36  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean)>
	//   21   41:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   22   44:areturn         
		else
			return new AccessibilityNodeInfoCompat$CollectionInfoCompat(((Object) (null)));
	//   23   45:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//   24   48:dup             
	//   25   49:aconst_null     
	//   26   50:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//   27   53:areturn         
	}

	public int getColumnCount()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).getColumnCount();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    6   15:invokevirtual   #46  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getColumnCount()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getRowCount()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).getRowCount();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    6   15:invokevirtual   #49  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getRowCount()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSelectionMode()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).getSelectionMode();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    6   15:invokevirtual   #52  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getSelectionMode()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public boolean isHierarchical()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)mInfo).isHierarchical();
	//    3    8:aload_0         
	//    4    9:getfield        #23  <Field Object mInfo>
	//    5   12:checkcast       #33  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    6   15:invokevirtual   #56  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.isHierarchical()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public static final int SELECTION_MODE_MULTIPLE = 2;
	public static final int SELECTION_MODE_NONE = 0;
	public static final int SELECTION_MODE_SINGLE = 1;
	final Object mInfo;

	AccessibilityNodeInfoCompat$CollectionInfoCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mInfo = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Object mInfo>
	//    5    9:return          
	}
}
