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

class w$4 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		b.setListener(((android.animation.ator.AnimatorListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewPropertyAnimator b>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #39  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		c.setAlpha(1.0F);
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field View c>
	//    7   13:fconst_1        
	//    8   14:invokevirtual   #45  <Method void View.setAlpha(float)>
		d.i(a);
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field w d>
	//   11   21:aload_0         
	//   12   22:getfield        #23  <Field RecyclerView$u a>
	//   13   25:invokevirtual   #48  <Method void w.i(RecyclerView$u)>
		d.f.remove(((Object) (a)));
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field w d>
	//   16   32:getfield        #52  <Field ArrayList w.f>
	//   17   35:aload_0         
	//   18   36:getfield        #23  <Field RecyclerView$u a>
	//   19   39:invokevirtual   #58  <Method boolean ArrayList.remove(Object)>
	//   20   42:pop             
		d.c();
	//   21   43:aload_0         
	//   22   44:getfield        #21  <Field w d>
	//   23   47:invokevirtual   #60  <Method void w.c()>
	//   24   50:return          
	}

	public void onAnimationStart(Animator animator)
	{
		d.l(a);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field w d>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field RecyclerView$u a>
	//    4    8:invokevirtual   #64  <Method void w.l(RecyclerView$u)>
	//    5   11:return          
	}

	final clerView.u a;
	final ViewPropertyAnimator b;
	final View c;
	final w d;

	w$4(w w1, clerView.u u, ViewPropertyAnimator viewpropertyanimator, View view)
	{
		d = w1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field w d>
		a = u;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field RecyclerView$u a>
		b = viewpropertyanimator;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field ViewPropertyAnimator b>
		c = view;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field View c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
