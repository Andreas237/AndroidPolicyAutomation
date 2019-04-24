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
	//    2    4:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:invokevirtual   #29  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.obtainCollectionItemInfo(int, int, int, int, boolean)>
	//    9   16:invokespecial   #31  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   10   19:areturn         
	}

	public static AccessibilityNodeInfoCompat$CollectionItemInfoCompat obtain(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return new AccessibilityNodeInfoCompat$CollectionItemInfoCompat(AccessibilityNodeInfoCompat.IMPL.obtainCollectionItemInfo(i, j, k, l, flag, flag1));
	//    0    0:new             #2   <Class AccessibilityNodeInfoCompat$CollectionItemInfoCompat>
	//    1    3:dup             
	//    2    4:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    3    7:iload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokevirtual   #35  <Method Object AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.obtainCollectionItemInfo(int, int, int, int, boolean, boolean)>
	//   10   18:invokespecial   #31  <Method void AccessibilityNodeInfoCompat$CollectionItemInfoCompat(Object)>
	//   11   21:areturn         
	}

	public int getColumnIndex()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnIndex(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokevirtual   #41  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getCollectionItemColumnIndex(Object)>
	//    4   10:ireturn         
	}

	public int getColumnSpan()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemColumnSpan(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokevirtual   #45  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getCollectionItemColumnSpan(Object)>
	//    4   10:ireturn         
	}

	public int getRowIndex()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowIndex(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokevirtual   #49  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getCollectionItemRowIndex(Object)>
	//    4   10:ireturn         
	}

	public int getRowSpan()
	{
		return AccessibilityNodeInfoCompat.IMPL.getCollectionItemRowSpan(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokevirtual   #53  <Method int AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.getCollectionItemRowSpan(Object)>
	//    4   10:ireturn         
	}

	public boolean isHeading()
	{
		return AccessibilityNodeInfoCompat.IMPL.isCollectionItemHeading(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokevirtual   #59  <Method boolean AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.isCollectionItemHeading(Object)>
	//    4   10:ireturn         
	}

	public boolean isSelected()
	{
		return AccessibilityNodeInfoCompat.IMPL.isCollectionItemSelected(mInfo);
	//    0    0:getstatic       #23  <Field AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl AccessibilityNodeInfoCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #16  <Field Object mInfo>
	//    3    7:invokevirtual   #63  <Method boolean AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl.isCollectionItemSelected(Object)>
	//    4   10:ireturn         
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
