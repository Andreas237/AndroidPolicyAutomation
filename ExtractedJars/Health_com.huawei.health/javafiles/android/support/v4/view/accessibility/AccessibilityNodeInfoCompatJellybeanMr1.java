// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellybeanMr1
{

	AccessibilityNodeInfoCompatJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object getLabelFor(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getLabelFor()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #19  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabelFor()>
	//    3    7:areturn         
	}

	public static Object getLabeledBy(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getLabeledBy()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #22  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getLabeledBy()>
	//    3    7:areturn         
	}

	public static void setLabelFor(Object obj, View view)
	{
		((AccessibilityNodeInfo)obj).setLabelFor(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void AccessibilityNodeInfo.setLabelFor(View)>
	//    4    8:return          
	}

	public static void setLabelFor(Object obj, View view, int i)
	{
		((AccessibilityNodeInfo)obj).setLabelFor(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #31  <Method void AccessibilityNodeInfo.setLabelFor(View, int)>
	//    5    9:return          
	}

	public static void setLabeledBy(Object obj, View view)
	{
		((AccessibilityNodeInfo)obj).setLabeledBy(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void AccessibilityNodeInfo.setLabeledBy(View)>
	//    4    8:return          
	}

	public static void setLabeledBy(Object obj, View view, int i)
	{
		((AccessibilityNodeInfo)obj).setLabeledBy(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #36  <Method void AccessibilityNodeInfo.setLabeledBy(View, int)>
	//    5    9:return          
	}
}
