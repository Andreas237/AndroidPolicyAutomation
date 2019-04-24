// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatApi22
{

	AccessibilityNodeInfoCompatApi22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object getTraversalAfter(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getTraversalAfter()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #19  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalAfter()>
	//    3    7:areturn         
	}

	public static Object getTraversalBefore(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getTraversalBefore()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #22  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getTraversalBefore()>
	//    3    7:areturn         
	}

	public static void setTraversalAfter(Object obj, View view)
	{
		((AccessibilityNodeInfo)obj).setTraversalAfter(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void AccessibilityNodeInfo.setTraversalAfter(View)>
	//    4    8:return          
	}

	public static void setTraversalAfter(Object obj, View view, int i)
	{
		((AccessibilityNodeInfo)obj).setTraversalAfter(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #31  <Method void AccessibilityNodeInfo.setTraversalAfter(View, int)>
	//    5    9:return          
	}

	public static void setTraversalBefore(Object obj, View view)
	{
		((AccessibilityNodeInfo)obj).setTraversalBefore(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void AccessibilityNodeInfo.setTraversalBefore(View)>
	//    4    8:return          
	}

	public static void setTraversalBefore(Object obj, View view, int i)
	{
		((AccessibilityNodeInfo)obj).setTraversalBefore(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #36  <Method void AccessibilityNodeInfo.setTraversalBefore(View, int)>
	//    5    9:return          
	}
}
