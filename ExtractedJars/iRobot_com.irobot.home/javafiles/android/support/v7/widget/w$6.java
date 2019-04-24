// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			w

class w$6 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		if(b != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int b>
	//*   2    4:ifeq            15
			c.setTranslationX(0.0F);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field View c>
	//    5   11:fconst_0        
	//    6   12:invokevirtual   #45  <Method void View.setTranslationX(float)>
		if(d != 0)
	//*   7   15:aload_0         
	//*   8   16:getfield        #31  <Field int d>
	//*   9   19:ifeq            30
			c.setTranslationY(0.0F);
	//   10   22:aload_0         
	//   11   23:getfield        #29  <Field View c>
	//   12   26:fconst_0        
	//   13   27:invokevirtual   #48  <Method void View.setTranslationY(float)>
	//   14   30:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		e.setListener(((android.animation.ator.AnimatorListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ViewPropertyAnimator e>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #55  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		f.j(a);
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field w f>
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field RecyclerView$u a>
	//    9   17:invokevirtual   #59  <Method void w.j(RecyclerView$u)>
		f.e.remove(((Object) (a)));
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field w f>
	//   12   24:getfield        #62  <Field ArrayList w.e>
	//   13   27:aload_0         
	//   14   28:getfield        #25  <Field RecyclerView$u a>
	//   15   31:invokevirtual   #68  <Method boolean ArrayList.remove(Object)>
	//   16   34:pop             
		f.c();
	//   17   35:aload_0         
	//   18   36:getfield        #23  <Field w f>
	//   19   39:invokevirtual   #70  <Method void w.c()>
	//   20   42:return          
	}

	public void onAnimationStart(Animator animator)
	{
		f.m(a);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field w f>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field RecyclerView$u a>
	//    4    8:invokevirtual   #74  <Method void w.m(RecyclerView$u)>
	//    5   11:return          
	}

	final clerView.u a;
	final int b;
	final View c;
	final int d;
	final ViewPropertyAnimator e;
	final w f;

	w$6(w w1, clerView.u u, int i, View view, int j, ViewPropertyAnimator viewpropertyanimator)
	{
		f = w1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field w f>
		a = u;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field RecyclerView$u a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int b>
		c = view;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field View c>
		d = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #31  <Field int d>
		e = viewpropertyanimator;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #33  <Field ViewPropertyAnimator e>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #36  <Method void AnimatorListenerAdapter()>
	//   20   37:return          
	}
}
