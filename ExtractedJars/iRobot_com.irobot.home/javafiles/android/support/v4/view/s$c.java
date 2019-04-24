// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			s

static class s$c extends s$b
{

	public void a(View view, Paint paint)
	{
		view.setLayerPaint(paint);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method void View.setLayerPaint(Paint)>
	//    3    5:return          
	}

	public void b(View view, int i, int j, int i1, int j1)
	{
		view.setPaddingRelative(i, j, i1, j1);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #26  <Method void View.setPaddingRelative(int, int, int, int)>
	//    6   10:return          
	}

	public int k(View view)
	{
		return view.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method int View.getLayoutDirection()>
	//    2    4:ireturn         
	}

	public int l(View view)
	{
		return view.getPaddingStart();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method int View.getPaddingStart()>
	//    2    4:ireturn         
	}

	public int m(View view)
	{
		return view.getPaddingEnd();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method int View.getPaddingEnd()>
	//    2    4:ireturn         
	}

	public int n(View view)
	{
		return view.getWindowSystemUiVisibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #44  <Method int View.getWindowSystemUiVisibility()>
	//    2    4:ireturn         
	}

	public boolean o(View view)
	{
		return view.isPaddingRelative();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method boolean View.isPaddingRelative()>
	//    2    4:ireturn         
	}

	public Display p(View view)
	{
		return view.getDisplay();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method Display View.getDisplay()>
	//    2    4:areturn         
	}

	s$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void s$b()>
	//    2    4:return          
	}
}
