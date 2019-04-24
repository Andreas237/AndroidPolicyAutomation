// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellyBean
{

	AccessibilityNodeInfoCompatJellyBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void addChild(Object obj, View view, int i)
	{
		((AccessibilityNodeInfo)obj).addChild(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #19  <Method void AccessibilityNodeInfo.addChild(View, int)>
	//    5    9:return          
	}

	public static Object findFocus(Object obj, int i)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).findFocus(i)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #24  <Method AccessibilityNodeInfo AccessibilityNodeInfo.findFocus(int)>
	//    4    8:areturn         
	}

	public static Object focusSearch(Object obj, int i)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).focusSearch(i)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #27  <Method AccessibilityNodeInfo AccessibilityNodeInfo.focusSearch(int)>
	//    4    8:areturn         
	}

	public static int getMovementGranularities(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getMovementGranularities();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #32  <Method int AccessibilityNodeInfo.getMovementGranularities()>
	//    3    7:ireturn         
	}

	public static boolean isAccessibilityFocused(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isAccessibilityFocused();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #37  <Method boolean AccessibilityNodeInfo.isAccessibilityFocused()>
	//    3    7:ireturn         
	}

	public static boolean isVisibleToUser(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isVisibleToUser();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #40  <Method boolean AccessibilityNodeInfo.isVisibleToUser()>
	//    3    7:ireturn         
	}

	public static Object obtain(View view, int i)
	{
		return ((Object) (AccessibilityNodeInfo.obtain(view, i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #45  <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View, int)>
	//    3    5:areturn         
	}

	public static boolean performAction(Object obj, int i, Bundle bundle)
	{
		return ((AccessibilityNodeInfo)obj).performAction(i, bundle);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #50  <Method boolean AccessibilityNodeInfo.performAction(int, Bundle)>
	//    5    9:ireturn         
	}

	public static void setAccesibilityFocused(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setAccessibilityFocused(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #56  <Method void AccessibilityNodeInfo.setAccessibilityFocused(boolean)>
	//    4    8:return          
	}

	public static void setMovementGranularities(Object obj, int i)
	{
		((AccessibilityNodeInfo)obj).setMovementGranularities(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #61  <Method void AccessibilityNodeInfo.setMovementGranularities(int)>
	//    4    8:return          
	}

	public static void setParent(Object obj, View view, int i)
	{
		((AccessibilityNodeInfo)obj).setParent(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #64  <Method void AccessibilityNodeInfo.setParent(View, int)>
	//    5    9:return          
	}

	public static void setSource(Object obj, View view, int i)
	{
		((AccessibilityNodeInfo)obj).setSource(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #67  <Method void AccessibilityNodeInfo.setSource(View, int)>
	//    5    9:return          
	}

	public static void setVisibleToUser(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setVisibleToUser(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #70  <Method void AccessibilityNodeInfo.setVisibleToUser(boolean)>
	//    4    8:return          
	}
}
