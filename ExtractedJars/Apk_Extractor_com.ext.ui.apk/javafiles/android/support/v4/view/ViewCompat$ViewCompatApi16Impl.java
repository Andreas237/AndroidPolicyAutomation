// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

static class ViewCompat$ViewCompatApi16Impl extends ViewCompat$ViewCompatApi15Impl
{

	public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view)
	{
		view = ((View) (view.getAccessibilityNodeProvider()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method android.view.accessibility.AccessibilityNodeProvider View.getAccessibilityNodeProvider()>
	//    2    4:astore_1        
		if(view != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			return new AccessibilityNodeProviderCompat(((Object) (view)));
	//    5    9:new             #24  <Class AccessibilityNodeProviderCompat>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #27  <Method void AccessibilityNodeProviderCompat(Object)>
	//    9   17:areturn         
		else
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
	}

	public boolean getFitsSystemWindows(View view)
	{
		return view.getFitsSystemWindows();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method boolean View.getFitsSystemWindows()>
	//    2    4:ireturn         
	}

	public int getImportantForAccessibility(View view)
	{
		return view.getImportantForAccessibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #37  <Method int View.getImportantForAccessibility()>
	//    2    4:ireturn         
	}

	public int getMinimumHeight(View view)
	{
		return view.getMinimumHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int View.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public int getMinimumWidth(View view)
	{
		return view.getMinimumWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method int View.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public ViewParent getParentForAccessibility(View view)
	{
		return view.getParentForAccessibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method ViewParent View.getParentForAccessibility()>
	//    2    4:areturn         
	}

	public boolean hasOverlappingRendering(View view)
	{
		return view.hasOverlappingRendering();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #51  <Method boolean View.hasOverlappingRendering()>
	//    2    4:ireturn         
	}

	public boolean hasTransientState(View view)
	{
		return view.hasTransientState();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method boolean View.hasTransientState()>
	//    2    4:ireturn         
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		return view.performAccessibilityAction(i, bundle);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #59  <Method boolean View.performAccessibilityAction(int, Bundle)>
	//    4    6:ireturn         
	}

	public void postInvalidateOnAnimation(View view)
	{
		view.postInvalidateOnAnimation();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #63  <Method void View.postInvalidateOnAnimation()>
	//    2    4:return          
	}

	public void postInvalidateOnAnimation(View view, int i, int j, int k, int l)
	{
		view.postInvalidateOnAnimation(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #67  <Method void View.postInvalidateOnAnimation(int, int, int, int)>
	//    6   10:return          
	}

	public void postOnAnimation(View view, Runnable runnable)
	{
		view.postOnAnimation(runnable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #72  <Method void View.postOnAnimation(Runnable)>
	//    3    5:return          
	}

	public void postOnAnimationDelayed(View view, Runnable runnable, long l)
	{
		view.postOnAnimationDelayed(runnable, l);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:lload_3         
	//    3    3:invokevirtual   #77  <Method void View.postOnAnimationDelayed(Runnable, long)>
	//    4    6:return          
	}

	public void requestApplyInsets(View view)
	{
		view.requestFitSystemWindows();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #81  <Method void View.requestFitSystemWindows()>
	//    2    4:return          
	}

	public void setBackground(View view, Drawable drawable)
	{
		view.setBackground(drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #86  <Method void View.setBackground(Drawable)>
	//    3    5:return          
	}

	public void setHasTransientState(View view, boolean flag)
	{
		view.setHasTransientState(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #91  <Method void View.setHasTransientState(boolean)>
	//    3    5:return          
	}

	public void setImportantForAccessibility(View view, int i)
	{
		int j = i;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(i == 4)
	//*   2    2:iload_2         
	//*   3    3:iconst_4        
	//*   4    4:icmpne          9
			j = 2;
	//    5    7:iconst_2        
	//    6    8:istore_3        
		view.setImportantForAccessibility(j);
	//    7    9:aload_1         
	//    8   10:iload_3         
	//    9   11:invokevirtual   #96  <Method void View.setImportantForAccessibility(int)>
	//   10   14:return          
	}

	ViewCompat$ViewCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewCompat$ViewCompatApi15Impl()>
	//    2    4:return          
	}
}
