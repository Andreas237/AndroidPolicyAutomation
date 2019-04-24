// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

static class ViewCompat$ViewCompatApi23Impl extends ViewCompat$ViewCompatApi21Impl
{

	public int getScrollIndicators(View view)
	{
		return view.getScrollIndicators();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int View.getScrollIndicators()>
	//    2    4:ireturn         
	}

	public void offsetLeftAndRight(View view, int i)
	{
		view.offsetLeftAndRight(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #27  <Method void View.offsetLeftAndRight(int)>
	//    3    5:return          
	}

	public void offsetTopAndBottom(View view, int i)
	{
		view.offsetTopAndBottom(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #30  <Method void View.offsetTopAndBottom(int)>
	//    3    5:return          
	}

	public void setScrollIndicators(View view, int i)
	{
		view.setScrollIndicators(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #33  <Method void View.setScrollIndicators(int)>
	//    3    5:return          
	}

	public void setScrollIndicators(View view, int i, int j)
	{
		view.setScrollIndicators(i, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #37  <Method void View.setScrollIndicators(int, int)>
	//    4    6:return          
	}

	ViewCompat$ViewCompatApi23Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewCompat$ViewCompatApi21Impl()>
	//    2    4:return          
	}
}
