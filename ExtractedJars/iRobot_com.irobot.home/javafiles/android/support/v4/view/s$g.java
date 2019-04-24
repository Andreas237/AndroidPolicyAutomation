// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			s

static class s$g extends s$f
{

	public void a(View view, int i, int j)
	{
		view.setScrollIndicators(i, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #20  <Method void View.setScrollIndicators(int, int)>
	//    4    6:return          
	}

	public void c(View view, int i)
	{
		view.offsetLeftAndRight(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #26  <Method void View.offsetLeftAndRight(int)>
	//    3    5:return          
	}

	public void d(View view, int i)
	{
		view.offsetTopAndBottom(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #30  <Method void View.offsetTopAndBottom(int)>
	//    3    5:return          
	}

	s$g()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void s$f()>
	//    2    4:return          
	}
}
