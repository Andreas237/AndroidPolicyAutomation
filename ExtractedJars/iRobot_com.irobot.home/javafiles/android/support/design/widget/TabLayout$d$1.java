// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//			TabLayout, a

class TabLayout$d$1
	implements android.animation.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		float f = valueanimator.getAnimatedFraction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method float ValueAnimator.getAnimatedFraction()>
	//    2    4:fstore_2        
		e.a(android.support.design.widget.a.a(a, b, f), android.support.design.widget.a.a(c, d, f));
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field TabLayout$d e>
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field int a>
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field int b>
	//    9   17:fload_2         
	//   10   18:invokestatic    #48  <Method int a.a(int, int, float)>
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field int c>
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field int d>
	//   15   29:fload_2         
	//   16   30:invokestatic    #48  <Method int a.a(int, int, float)>
	//   17   33:invokevirtual   #50  <Method void TabLayout$d.a(int, int)>
	//   18   36:return          
	}

	final int a;
	final int b;
	final int c;
	final int d;
	final TabLayout.d e;

	TabLayout$d$1(TabLayout.d d1, int i, int j, int k, int l)
	{
		e = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field TabLayout$d e>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int b>
		c = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int c>
		d = l;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #31  <Field int d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void Object()>
	//   17   31:return          
	}
}
