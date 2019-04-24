// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public static class AccessibilityNodeInfoCompat$CollectionItemInfoCompat
{

	public static AccessibilityNodeInfoCompat$CollectionItemInfoCompat obtain(int i, int j, int k, int l, boolean flag)
	{
		return new AccessibilityNodeInfoCompat$CollectionItemInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionItemInfo(i, j, k, l, flag));
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//    1    3:dup             
	//    2    4:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokeinterface #29  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.obtainCollectionItemInfo(int, int, int, int, boolean)>
	//    9   18:invokespecial   #31  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   10   21:areturn         
	}

	public static AccessibilityNodeInfoCompat$CollectionItemInfoCompat obtain(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return new AccessibilityNodeInfoCompat$CollectionItemInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionItemInfo(i, j, k, l, flag, flag1));
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//    1    3:dup             
	//    2    4:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokeinterface #35  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.obtainCollectionItemInfo(int, int, int, int, boolean, boolean)>
	//   10   20:invokespecial   #31  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   11   23:areturn         
	}

	public int getColumnIndex()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnIndex(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokeinterface #41  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.getCollectionItemColumnIndex(Object)>
	//    4   12:ireturn         
	}

	public int getColumnSpan()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnSpan(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokeinterface #45  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.getCollectionItemColumnSpan(Object)>
	//    4   12:ireturn         
	}

	public int getRowIndex()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowIndex(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokeinterface #49  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.getCollectionItemRowIndex(Object)>
	//    4   12:ireturn         
	}

	public int getRowSpan()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowSpan(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokeinterface #53  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.getCollectionItemRowSpan(Object)>
	//    4   12:ireturn         
	}

	public boolean isHeading()
	{
		return AccessibilityNodeInfoCompat.IMPL.isCollectionItemHeading(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokeinterface #59  <Method boolean AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.isCollectionItemHeading(Object)>
	//    4   12:ireturn         
	}

	public boolean isSelected()
	{
		return AccessibilityNodeInfoCompat.IMPL.isCollectionItemSelected(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokeinterface #63  <Method boolean AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl.isCollectionItemSelected(Object)>
	//    4   12:ireturn         
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
