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

class w$5 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		b.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field View b>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #38  <Method void View.setAlpha(float)>
	//    4    8:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		c.setListener(((android.animation.ator.AnimatorListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ViewPropertyAnimator c>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #45  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		d.k(a);
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field w d>
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field RecyclerView$u a>
	//    9   17:invokevirtual   #48  <Method void w.k(RecyclerView$u)>
		d.d.remove(((Object) (a)));
	//   10   20:aload_0         
	//   11   21:getfield        #20  <Field w d>
	//   12   24:getfield        #51  <Field ArrayList w.d>
	//   13   27:aload_0         
	//   14   28:getfield        #22  <Field RecyclerView$u a>
	//   15   31:invokevirtual   #57  <Method boolean ArrayList.remove(Object)>
	//   16   34:pop             
		d.c();
	//   17   35:aload_0         
	//   18   36:getfield        #20  <Field w d>
	//   19   39:invokevirtual   #59  <Method void w.c()>
	//   20   42:return          
	}

	public void onAnimationStart(Animator animator)
	{
		d.n(a);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field w d>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field RecyclerView$u a>
	//    4    8:invokevirtual   #63  <Method void w.n(RecyclerView$u)>
	//    5   11:return          
	}

	final clerView.u a;
	final View b;
	final ViewPropertyAnimator c;
	final w d;

	w$5(w w1, clerView.u u, View view, ViewPropertyAnimator viewpropertyanimator)
	{
		d = w1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field w d>
		a = u;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field RecyclerView$u a>
		b = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field View b>
		c = viewpropertyanimator;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #26  <Field ViewPropertyAnimator c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #29  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
