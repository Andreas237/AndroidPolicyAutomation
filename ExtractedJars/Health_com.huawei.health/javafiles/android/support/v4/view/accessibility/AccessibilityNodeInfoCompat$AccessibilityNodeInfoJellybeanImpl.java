// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatJellyBean

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoCompat.AccessibilityNodeInfoIcsImpl
{

	public void addChild(Object obj, View view, int i)
	{
		AccessibilityNodeInfoCompatJellyBean.addChild(obj, view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #21  <Method void AccessibilityNodeInfoCompatJellyBean.addChild(Object, View, int)>
	//    4    6:return          
	}

	public Object findFocus(Object obj, int i)
	{
		return AccessibilityNodeInfoCompatJellyBean.findFocus(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #25  <Method Object AccessibilityNodeInfoCompatJellyBean.findFocus(Object, int)>
	//    3    5:areturn         
	}

	public Object focusSearch(Object obj, int i)
	{
		return AccessibilityNodeInfoCompatJellyBean.focusSearch(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #28  <Method Object AccessibilityNodeInfoCompatJellyBean.focusSearch(Object, int)>
	//    3    5:areturn         
	}

	public int getMovementGranularities(Object obj)
	{
		return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method int AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(Object)>
	//    2    4:ireturn         
	}

	public boolean isAccessibilityFocused(Object obj)
	{
		return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method boolean AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(Object)>
	//    2    4:ireturn         
	}

	public boolean isVisibleToUser(Object obj)
	{
		return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #39  <Method boolean AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(Object)>
	//    2    4:ireturn         
	}

	public Object obtain(View view, int i)
	{
		return AccessibilityNodeInfoCompatJellyBean.obtain(view, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #43  <Method Object AccessibilityNodeInfoCompatJellyBean.obtain(View, int)>
	//    3    5:areturn         
	}

	public boolean performAction(Object obj, int i, Bundle bundle)
	{
		return AccessibilityNodeInfoCompatJellyBean.performAction(obj, i, bundle);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #47  <Method boolean AccessibilityNodeInfoCompatJellyBean.performAction(Object, int, Bundle)>
	//    4    6:ireturn         
	}

	public void setAccessibilityFocused(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #52  <Method void AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(Object, boolean)>
	//    3    5:return          
	}

	public void setMovementGranularities(Object obj, int i)
	{
		AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #56  <Method void AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(Object, int)>
	//    3    5:return          
	}

	public void setParent(Object obj, View view, int i)
	{
		AccessibilityNodeInfoCompatJellyBean.setParent(obj, view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #59  <Method void AccessibilityNodeInfoCompatJellyBean.setParent(Object, View, int)>
	//    4    6:return          
	}

	public void setSource(Object obj, View view, int i)
	{
		AccessibilityNodeInfoCompatJellyBean.setSource(obj, view, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #62  <Method void AccessibilityNodeInfoCompatJellyBean.setSource(Object, View, int)>
	//    4    6:return          
	}

	public void setVisibleToUser(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #65  <Method void AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(Object, boolean)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoJellybeanImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl()>
	//    2    4:return          
	}
}
