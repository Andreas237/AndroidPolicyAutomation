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

class w$7 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		b.setListener(((android.animation.ator.AnimatorListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ViewPropertyAnimator b>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #38  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//    4    8:pop             
		c.setAlpha(1.0F);
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field View c>
	//    7   13:fconst_1        
	//    8   14:invokevirtual   #44  <Method void View.setAlpha(float)>
		c.setTranslationX(0.0F);
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field View c>
	//   11   21:fconst_0        
	//   12   22:invokevirtual   #47  <Method void View.setTranslationX(float)>
		c.setTranslationY(0.0F);
	//   13   25:aload_0         
	//   14   26:getfield        #26  <Field View c>
	//   15   29:fconst_0        
	//   16   30:invokevirtual   #50  <Method void View.setTranslationY(float)>
		d.a(a.a, true);
	//   17   33:aload_0         
	//   18   34:getfield        #20  <Field w d>
	//   19   37:aload_0         
	//   20   38:getfield        #22  <Field w$a a>
	//   21   41:getfield        #55  <Field RecyclerView$u w$a.a>
	//   22   44:iconst_1        
	//   23   45:invokevirtual   #58  <Method void w.a(RecyclerView$u, boolean)>
		d.g.remove(((Object) (a.a)));
	//   24   48:aload_0         
	//   25   49:getfield        #20  <Field w d>
	//   26   52:getfield        #62  <Field ArrayList w.g>
	//   27   55:aload_0         
	//   28   56:getfield        #22  <Field w$a a>
	//   29   59:getfield        #55  <Field RecyclerView$u w$a.a>
	//   30   62:invokevirtual   #68  <Method boolean ArrayList.remove(Object)>
	//   31   65:pop             
		d.c();
	//   32   66:aload_0         
	//   33   67:getfield        #20  <Field w d>
	//   34   70:invokevirtual   #70  <Method void w.c()>
	//   35   73:return          
	}

	public void onAnimationStart(Animator animator)
	{
		d.b(a.a, true);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field w d>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field w$a a>
	//    4    8:getfield        #55  <Field RecyclerView$u w$a.a>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #73  <Method void w.b(RecyclerView$u, boolean)>
	//    7   15:return          
	}

	final w$a a;
	final ViewPropertyAnimator b;
	final View c;
	final w d;

	w$7(w w1, w$a w$a1, ViewPropertyAnimator viewpropertyanimator, View view)
	{
		d = w1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field w d>
		a = w$a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field w$a a>
		b = viewpropertyanimator;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field ViewPropertyAnimator b>
		c = view;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #26  <Field View c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #29  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
