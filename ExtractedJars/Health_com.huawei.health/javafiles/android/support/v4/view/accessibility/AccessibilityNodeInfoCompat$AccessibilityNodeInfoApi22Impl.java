// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatApi22

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl extends AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl
{

	public Object getTraversalAfter(Object obj)
	{
		return AccessibilityNodeInfoCompatApi22.getTraversalAfter(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object AccessibilityNodeInfoCompatApi22.getTraversalAfter(Object)>
	//    2    4:areturn         
	}

	public Object getTraversalBefore(Object obj)
	{
		return AccessibilityNodeInfoCompatApi22.getTraversalBefore(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #24  <Method Object AccessibilityNodeInfoCompatApi22.getTraversalBefore(Object)>
	//    2    4:areturn         
	}

	public void setTraversalAfter(Object obj, View view)
	{
		AccessibilityNodeInfoCompatApi22.setTraversalAfter(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #28  <Method void AccessibilityNodeInfoCompatApi22.setTraversalAfter(Object, View)>
	//    3    5:return          
	}

	public void setTraversalAfter(Object obj, View view, int i)
	{
		AccessibilityNodeInfoCompatApi22.setTraversalAfter(obj, view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #31  <Method void AccessibilityNodeInfoCompatApi22.setTraversalAfter(Object, View, int)>
	//    4    6:return          
	}

	public void setTraversalBefore(Object obj, View view)
	{
		AccessibilityNodeInfoCompatApi22.setTraversalBefore(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #34  <Method void AccessibilityNodeInfoCompatApi22.setTraversalBefore(Object, View)>
	//    3    5:return          
	}

	public void setTraversalBefore(Object obj, View view, int i)
	{
		AccessibilityNodeInfoCompatApi22.setTraversalBefore(obj, view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #36  <Method void AccessibilityNodeInfoCompatApi22.setTraversalBefore(Object, View, int)>
	//    4    6:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi22Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoApi21Impl()>
	//    2    4:return          
	}
}
