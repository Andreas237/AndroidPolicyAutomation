// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityWindowInfo;

class AccessibilityWindowInfoCompatApi21
{

	AccessibilityWindowInfoCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void getBoundsInScreen(Object obj, Rect rect)
	{
		((AccessibilityWindowInfo)obj).getBoundsInScreen(rect);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #19  <Method void AccessibilityWindowInfo.getBoundsInScreen(Rect)>
	//    4    8:return          
	}

	public static Object getChild(Object obj, int i)
	{
		return ((Object) (((AccessibilityWindowInfo)obj).getChild(i)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #24  <Method AccessibilityWindowInfo AccessibilityWindowInfo.getChild(int)>
	//    4    8:areturn         
	}

	public static int getChildCount(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).getChildCount();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #29  <Method int AccessibilityWindowInfo.getChildCount()>
	//    3    7:ireturn         
	}

	public static int getId(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).getId();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #32  <Method int AccessibilityWindowInfo.getId()>
	//    3    7:ireturn         
	}

	public static int getLayer(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).getLayer();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #35  <Method int AccessibilityWindowInfo.getLayer()>
	//    3    7:ireturn         
	}

	public static Object getParent(Object obj)
	{
		return ((Object) (((AccessibilityWindowInfo)obj).getParent()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #40  <Method AccessibilityWindowInfo AccessibilityWindowInfo.getParent()>
	//    3    7:areturn         
	}

	public static Object getRoot(Object obj)
	{
		return ((Object) (((AccessibilityWindowInfo)obj).getRoot()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #44  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityWindowInfo.getRoot()>
	//    3    7:areturn         
	}

	public static int getType(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).getType();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #47  <Method int AccessibilityWindowInfo.getType()>
	//    3    7:ireturn         
	}

	public static boolean isAccessibilityFocused(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).isAccessibilityFocused();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #52  <Method boolean AccessibilityWindowInfo.isAccessibilityFocused()>
	//    3    7:ireturn         
	}

	public static boolean isActive(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).isActive();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #55  <Method boolean AccessibilityWindowInfo.isActive()>
	//    3    7:ireturn         
	}

	public static boolean isFocused(Object obj)
	{
		return ((AccessibilityWindowInfo)obj).isFocused();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #58  <Method boolean AccessibilityWindowInfo.isFocused()>
	//    3    7:ireturn         
	}

	public static Object obtain()
	{
		return ((Object) (AccessibilityWindowInfo.obtain()));
	//    0    0:invokestatic    #62  <Method AccessibilityWindowInfo AccessibilityWindowInfo.obtain()>
	//    1    3:areturn         
	}

	public static Object obtain(Object obj)
	{
		return ((Object) (AccessibilityWindowInfo.obtain((AccessibilityWindowInfo)obj)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokestatic    #65  <Method AccessibilityWindowInfo AccessibilityWindowInfo.obtain(AccessibilityWindowInfo)>
	//    3    7:areturn         
	}

	public static void recycle(Object obj)
	{
		((AccessibilityWindowInfo)obj).recycle();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityWindowInfo>
	//    2    4:invokevirtual   #69  <Method void AccessibilityWindowInfo.recycle()>
	//    3    7:return          
	}
}
