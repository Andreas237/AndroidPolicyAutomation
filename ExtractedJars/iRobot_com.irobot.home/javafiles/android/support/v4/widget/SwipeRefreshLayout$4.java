// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout, c

class SwipeRefreshLayout$4 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		c.j.setAlpha((int)((float)a + (float)(b - a) * f));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SwipeRefreshLayout c>
	//    2    4:getfield        #31  <Field c SwipeRefreshLayout.j>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field int a>
	//    5   11:i2f             
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field int b>
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field int a>
	//   10   20:isub            
	//   11   21:i2f             
	//   12   22:fload_1         
	//   13   23:fmul            
	//   14   24:fadd            
	//   15   25:f2i             
	//   16   26:invokevirtual   #37  <Method void c.setAlpha(int)>
	//   17   29:return          
	}

	final int a;
	final int b;
	final SwipeRefreshLayout c;

	SwipeRefreshLayout$4(SwipeRefreshLayout swiperefreshlayout, int i, int j)
	{
		c = swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SwipeRefreshLayout c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #21  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void Animation()>
	//   11   19:return          
	}
}
