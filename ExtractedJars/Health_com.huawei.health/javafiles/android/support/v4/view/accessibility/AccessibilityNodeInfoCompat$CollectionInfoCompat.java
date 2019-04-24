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
	//    2    4:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokeinterface #36  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.obtainCollectionInfo(int, int, boolean)>
	//    7   15:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//    8   18:areturn         
	}

	public static AccessibilityNodeInfoCompat$CollectionInfoCompat obtain(int i, int j, boolean flag, int k)
	{
		return new AccessibilityNodeInfoCompat$CollectionInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionInfo(i, j, flag, k));
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$CollectionInfoCompat>
	//    1    3:dup             
	//    2    4:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokeinterface #42  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.obtainCollectionInfo(int, int, boolean, int)>
	//    8   16:invokespecial   #38  <Method void AccessibilityNodeInfoCompat$CollectionInfoCompat(Object)>
	//    9   19:areturn         
	}

	public int getColumnCount()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoColumnCount(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokeinterface #48  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.getCollectionInfoColumnCount(Object)>
	//    4   12:ireturn         
	}

	public int getRowCount()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoRowCount(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokeinterface #52  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.getCollectionInfoRowCount(Object)>
	//    4   12:ireturn         
	}

	public int getSelectionMode()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionInfoSelectionMode(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokeinterface #56  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.getCollectionInfoSelectionMode(Object)>
	//    4   12:ireturn         
	}

	public boolean isHierarchical()
	{
		return AccessibilityNodeInfoCompat.IMPL.isCollectionInfoHierarchical(mInfo);
	//    0    0:getstatic       #30  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #23  <Field Object mInfo>
	//    3    7:invokeinterface #62  <Method boolean AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.isCollectionInfoHierarchical(Object)>
	//    4   12:ireturn         
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
