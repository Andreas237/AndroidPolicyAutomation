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
		return new AccessibilityNodeInfoCompat$CollectionInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionInfo(i, j, flag));
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//    1    3:dup             
	//    2    4:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #36  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.obtainCollectionInfo(int, int, boolean)>
	//    7   13:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//    8   16:areturn         
	}

	public static AccessibilityNodeInfoCompat$CollectionInfoCompat obtain(int i, int j, boolean flag, int k)
	{
		return new AccessibilityNodeInfoCompat$CollectionInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionInfo(i, j, flag, k));
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//    1    3:dup             
	//    2    4:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #42  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.obtainCollectionInfo(int, int, boolean, int)>
	//    8   14:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//    9   17:areturn         
	}

	public int getColumnCount()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoColumnCount(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokevirtual   #48  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getCollectionInfoColumnCount(Object)>
	//    4   10:ireturn         
	}

	public int getRowCount()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoRowCount(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokevirtual   #52  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getCollectionInfoRowCount(Object)>
	//    4   10:ireturn         
	}

	public int getSelectionMode()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoSelectionMode(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokevirtual   #56  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getCollectionInfoSelectionMode(Object)>
	//    4   10:ireturn         
	}

	public boolean isHierarchical()
	{
		return AccessibilityNodeInfoCompat.IMPL.isCollectionInfoHierarchical(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokevirtual   #62  <Method boolean AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.isCollectionInfoHierarchical(Object)>
	//    4   10:ireturn         
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
