// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

static class ViewCompat$ViewCompatApi19Impl extends ViewCompat$ViewCompatApi18Impl
{

	public int getAccessibilityLiveRegion(View view)
	{
		return view.getAccessibilityLiveRegion();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int View.getAccessibilityLiveRegion()>
	//    2    4:ireturn         
	}

	public boolean isAttachedToWindow(View view)
	{
		return view.isAttachedToWindow();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method boolean View.isAttachedToWindow()>
	//    2    4:ireturn         
	}

	public boolean isLaidOut(View view)
	{
		return view.isLaidOut();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method boolean View.isLaidOut()>
	//    2    4:ireturn         
	}

	public boolean isLayoutDirectionResolved(View view)
	{
		return view.isLayoutDirectionResolved();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method boolean View.isLayoutDirectionResolved()>
	//    2    4:ireturn         
	}

	public void setAccessibilityLiveRegion(View view, int i)
	{
		view.setAccessibilityLiveRegion(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #38  <Method void View.setAccessibilityLiveRegion(int)>
	//    3    5:return          
	}

	public void setImportantForAccessibility(View view, int i)
	{
		view.setImportantForAccessibility(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #41  <Method void View.setImportantForAccessibility(int)>
	//    3    5:return          
	}

	ViewCompat$ViewCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewCompat$ViewCompatApi18Impl()>
	//    2    4:return          
	}
}
