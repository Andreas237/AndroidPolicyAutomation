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

class Fade$4 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		e = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #42  <Field boolean e>
		if(b >= 0.0F)
	//*   3    5:aload_0         
	//*   4    6:getfield        #45  <Field float b>
	//*   5    9:fconst_0        
	//*   6   10:fcmpl           
	//*   7   11:iflt            25
			a.setAlpha(b);
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field View a>
	//   10   18:aload_0         
	//   11   19:getfield        #45  <Field float b>
	//   12   22:invokevirtual   #54  <Method void View.setAlpha(float)>
	//   13   25:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean e>
	//*   2    4:ifne            15
			a.setAlpha(1.0F);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field View a>
	//    5   11:fconst_1        
	//    6   12:invokevirtual   #54  <Method void View.setAlpha(float)>
		if(d != null && !e)
	//*   7   15:aload_0         
	//*   8   16:getfield        #31  <Field View d>
	//*   9   19:ifnull          40
	//*  10   22:aload_0         
	//*  11   23:getfield        #42  <Field boolean e>
	//*  12   26:ifne            40
			d.setVisibility(c);
	//   13   29:aload_0         
	//   14   30:getfield        #31  <Field View d>
	//   15   33:aload_0         
	//   16   34:getfield        #33  <Field int c>
	//   17   37:invokevirtual   #59  <Method void View.setVisibility(int)>
		if(g != null)
	//*  18   40:aload_0         
	//*  19   41:getfield        #35  <Field View g>
	//*  20   44:ifnull          63
			as.e(f).c(g);
	//   21   47:aload_0         
	//   22   48:getfield        #37  <Field ViewGroup f>
	//   23   51:invokestatic    #64  <Method al as.e(ViewGroup)>
	//   24   54:aload_0         
	//   25   55:getfield        #35  <Field View g>
	//   26   58:invokeinterface #69  <Method void al.c(View)>
	//   27   63:return          
	}

	final View a;
	float b;
	final int c;
	final View d;
	boolean e;
	final ViewGroup f;
	final View g;
	final Fade h;

	Fade$4(Fade fade, View view, View view1, int i, View view2, ViewGroup viewgroup)
	{
		h = fade;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Fade h>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field View a>
		d = view1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field View d>
		c = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #33  <Field int c>
		g = view2;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #35  <Field View g>
		f = viewgroup;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #37  <Field ViewGroup f>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #40  <Method void AnimatorListenerAdapter()>
		e = false;
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:putfield        #42  <Field boolean e>
		b = -1F;
	//   23   42:aload_0         
	//   24   43:ldc1            #43  <Float -1F>
	//   25   45:putfield        #45  <Field float b>
	//   26   48:return          
	}
}
