// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//			s

static class s$b extends s$a
{

	public void a(View view, int k)
	{
		int l = k;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(k == 4)
	//*   2    2:iload_2         
	//*   3    3:iconst_4        
	//*   4    4:icmpne          9
			l = 2;
	//    5    7:iconst_2        
	//    6    8:istore_3        
		view.setImportantForAccessibility(l);
	//    7    9:aload_1         
	//    8   10:iload_3         
	//    9   11:invokevirtual   #20  <Method void View.setImportantForAccessibility(int)>
	//   10   14:return          
	}

	public void a(View view, int k, int l, int i1, int j1)
	{
		view.postInvalidateOnAnimation(k, l, i1, j1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #25  <Method void View.postInvalidateOnAnimation(int, int, int, int)>
	//    6   10:return          
	}

	public void a(View view, Drawable drawable)
	{
		view.setBackground(drawable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #30  <Method void View.setBackground(Drawable)>
	//    3    5:return          
	}

	public void a(View view, Runnable runnable)
	{
		view.postOnAnimation(runnable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #35  <Method void View.postOnAnimation(Runnable)>
	//    3    5:return          
	}

	public void a(View view, Runnable runnable, long l)
	{
		view.postOnAnimationDelayed(runnable, l);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:lload_3         
	//    3    3:invokevirtual   #40  <Method void View.postOnAnimationDelayed(Runnable, long)>
	//    4    6:return          
	}

	public void a(View view, boolean flag)
	{
		view.setHasTransientState(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #45  <Method void View.setHasTransientState(boolean)>
	//    3    5:return          
	}

	public boolean b(View view)
	{
		return view.hasTransientState();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method boolean View.hasTransientState()>
	//    2    4:ireturn         
	}

	public void c(View view)
	{
		view.postInvalidateOnAnimation();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method void View.postInvalidateOnAnimation()>
	//    2    4:return          
	}

	public int d(View view)
	{
		return view.getImportantForAccessibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method int View.getImportantForAccessibility()>
	//    2    4:ireturn         
	}

	public ViewParent e(View view)
	{
		return view.getParentForAccessibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method ViewParent View.getParentForAccessibility()>
	//    2    4:areturn         
	}

	public int f(View view)
	{
		return view.getMinimumWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #70  <Method int View.getMinimumWidth()>
	//    2    4:ireturn         
	}

	public int g(View view)
	{
		return view.getMinimumHeight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #74  <Method int View.getMinimumHeight()>
	//    2    4:ireturn         
	}

	public void h(View view)
	{
		view.requestFitSystemWindows();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #78  <Method void View.requestFitSystemWindows()>
	//    2    4:return          
	}

	public boolean i(View view)
	{
		return view.getFitsSystemWindows();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #82  <Method boolean View.getFitsSystemWindows()>
	//    2    4:ireturn         
	}

	public boolean j(View view)
	{
		return view.hasOverlappingRendering();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #86  <Method boolean View.hasOverlappingRendering()>
	//    2    4:ireturn         
	}

	s$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void s$a()>
	//    2    4:return          
	}
}
