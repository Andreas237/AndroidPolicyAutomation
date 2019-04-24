// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import o.al;
import o.as;

// Referenced classes of package android.support.transition:
//			Fade

class Fade$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		c.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field View c>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #45  <Method void View.setAlpha(float)>
		if(b != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #27  <Field View b>
	//*   6   12:ifnull          26
			b.setVisibility(e);
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field View b>
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field int e>
	//   11   23:invokevirtual   #49  <Method void View.setVisibility(int)>
		if(d != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #31  <Field View d>
	//*  14   30:ifnull          49
			as.e(a).c(d);
	//   15   33:aload_0         
	//   16   34:getfield        #33  <Field ViewGroup a>
	//   17   37:invokestatic    #54  <Method al as.e(ViewGroup)>
	//   18   40:aload_0         
	//   19   41:getfield        #31  <Field View d>
	//   20   44:invokeinterface #59  <Method void al.c(View)>
	//   21   49:return          
	}

	final ViewGroup a;
	final View b;
	final View c;
	final View d;
	final int e;
	final Fade h;

	Fade$1(Fade fade, View view, View view1, int i, View view2, ViewGroup viewgroup)
	{
		h = fade;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Fade h>
		c = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field View c>
		b = view1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field View b>
		e = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #29  <Field int e>
		d = view2;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #31  <Field View d>
		a = viewgroup;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #33  <Field ViewGroup a>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #36  <Method void AnimatorListenerAdapter()>
	//   20   37:return          
	}
}
