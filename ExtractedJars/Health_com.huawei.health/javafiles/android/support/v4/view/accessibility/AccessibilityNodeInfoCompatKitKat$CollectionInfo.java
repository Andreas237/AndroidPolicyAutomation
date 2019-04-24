// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompatKitKat

static class AccessibilityNodeInfoCompatKitKat$CollectionInfo
{

	static int getColumnCount(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getColumnCount();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    2    4:invokevirtual   #19  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getColumnCount()>
	//    3    7:ireturn         
	}

	static int getRowCount(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getRowCount();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    2    4:invokevirtual   #22  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getRowCount()>
	//    3    7:ireturn         
	}

	static boolean isHierarchical(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).isHierarchical();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
	//    2    4:invokevirtual   #27  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.isHierarchical()>
	//    3    7:ireturn         
	}

	AccessibilityNodeInfoCompatKitKat$CollectionInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
