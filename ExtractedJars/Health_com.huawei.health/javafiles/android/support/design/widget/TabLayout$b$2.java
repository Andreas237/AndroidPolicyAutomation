// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import o.p;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$b$2
	implements android.animation.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		float f = valueanimator.getAnimatedFraction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method float ValueAnimator.getAnimatedFraction()>
	//    2    4:fstore_2        
		e.c(p.d(c, d, f), p.d(b, a, f));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field TabLayout$b e>
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field int c>
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field int d>
	//    9   17:fload_2         
	//   10   18:invokestatic    #48  <Method int p.d(int, int, float)>
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field int b>
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field int a>
	//   15   29:fload_2         
	//   16   30:invokestatic    #48  <Method int p.d(int, int, float)>
	//   17   33:invokevirtual   #50  <Method void TabLayout$b.c(int, int)>
	//   18   36:return          
	}

	final int a;
	final int b;
	final int c;
	final int d;
	final TabLayout.b e;

	TabLayout$b$2(TabLayout.b b1, int i, int j, int k, int l)
	{
		e = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field TabLayout$b e>
		c = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int c>
		d = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int d>
		b = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int b>
		a = l;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #31  <Field int a>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void Object()>
	//   17   31:return          
	}
}
