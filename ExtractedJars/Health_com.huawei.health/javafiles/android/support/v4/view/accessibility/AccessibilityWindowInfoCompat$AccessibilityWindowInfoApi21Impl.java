// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityWindowInfoCompat, AccessibilityWindowInfoCompatApi21

static class AccessibilityWindowInfoCompat$AccessibilityWindowInfoApi21Impl extends AccessibilityWindowInfoCompat.AccessibilityWindowInfoStubImpl
{

	public void getBoundsInScreen(Object obj, Rect rect)
	{
		AccessibilityWindowInfoCompatApi21.getBoundsInScreen(obj, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #18  <Method void AccessibilityWindowInfoCompatApi21.getBoundsInScreen(Object, Rect)>
	//    3    5:return          
	}

	public Object getChild(Object obj, int i)
	{
		return AccessibilityWindowInfoCompatApi21.getChild(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #22  <Method Object AccessibilityWindowInfoCompatApi21.getChild(Object, int)>
	//    3    5:areturn         
	}

	public int getChildCount(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.getChildCount(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method int AccessibilityWindowInfoCompatApi21.getChildCount(Object)>
	//    2    4:ireturn         
	}

	public int getId(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.getId(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method int AccessibilityWindowInfoCompatApi21.getId(Object)>
	//    2    4:ireturn         
	}

	public int getLayer(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.getLayer(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method int AccessibilityWindowInfoCompatApi21.getLayer(Object)>
	//    2    4:ireturn         
	}

	public Object getParent(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.getParent(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method Object AccessibilityWindowInfoCompatApi21.getParent(Object)>
	//    2    4:areturn         
	}

	public Object getRoot(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.getRoot(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #39  <Method Object AccessibilityWindowInfoCompatApi21.getRoot(Object)>
	//    2    4:areturn         
	}

	public int getType(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.getType(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method int AccessibilityWindowInfoCompatApi21.getType(Object)>
	//    2    4:ireturn         
	}

	public boolean isAccessibilityFocused(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.isAccessibilityFocused(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method boolean AccessibilityWindowInfoCompatApi21.isAccessibilityFocused(Object)>
	//    2    4:ireturn         
	}

	public boolean isActive(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.isActive(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #49  <Method boolean AccessibilityWindowInfoCompatApi21.isActive(Object)>
	//    2    4:ireturn         
	}

	public boolean isFocused(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.isFocused(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #52  <Method boolean AccessibilityWindowInfoCompatApi21.isFocused(Object)>
	//    2    4:ireturn         
	}

	public Object obtain()
	{
		return AccessibilityWindowInfoCompatApi21.obtain();
	//    0    0:invokestatic    #56  <Method Object AccessibilityWindowInfoCompatApi21.obtain()>
	//    1    3:areturn         
	}

	public Object obtain(Object obj)
	{
		return AccessibilityWindowInfoCompatApi21.obtain(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #58  <Method Object AccessibilityWindowInfoCompatApi21.obtain(Object)>
	//    2    4:areturn         
	}

	public void recycle(Object obj)
	{
		AccessibilityWindowInfoCompatApi21.recycle(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #62  <Method void AccessibilityWindowInfoCompatApi21.recycle(Object)>
	//    2    4:return          
	}

	AccessibilityWindowInfoCompat$AccessibilityWindowInfoApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoStubImpl()>
	//    2    4:return          
	}
}
