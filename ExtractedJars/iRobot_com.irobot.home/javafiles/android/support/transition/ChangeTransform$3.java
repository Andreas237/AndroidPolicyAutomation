// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeTransform, au

class ChangeTransform$3 extends AnimatorListenerAdapter
{

	private void a(Matrix matrix)
	{
		h.set(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Matrix h>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void Matrix.set(Matrix)>
		c.setTag(y.a.transition_transform, ((Object) (h)));
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field View c>
	//    6   12:getstatic       #55  <Field int y$a.transition_transform>
	//    7   15:aload_0         
	//    8   16:getfield        #44  <Field Matrix h>
	//    9   19:invokevirtual   #61  <Method void View.setTag(int, Object)>
		d.a(c);
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field ChangeTransform$c d>
	//   12   26:aload_0         
	//   13   27:getfield        #32  <Field View c>
	//   14   30:invokevirtual   #66  <Method void ChangeTransform$c.a(View)>
	//   15   33:return          
	}

	public void onAnimationCancel(Animator animator)
	{
		g = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #70  <Field boolean g>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean g>
	//*   2    4:ifne            57
			if(a && ChangeTransform.a(f))
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field boolean a>
	//*   5   11:ifeq            35
	//*   6   14:aload_0         
	//*   7   15:getfield        #26  <Field ChangeTransform f>
	//*   8   18:invokestatic    #74  <Method boolean ChangeTransform.a(ChangeTransform)>
	//*   9   21:ifeq            35
			{
				a(b);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #30  <Field Matrix b>
	//   13   29:invokespecial   #76  <Method void a(Matrix)>
			} else
	//*  14   32:goto            57
			{
				c.setTag(y.a.transition_transform, ((Object) (null)));
	//   15   35:aload_0         
	//   16   36:getfield        #32  <Field View c>
	//   17   39:getstatic       #55  <Field int y$a.transition_transform>
	//   18   42:aconst_null     
	//   19   43:invokevirtual   #61  <Method void View.setTag(int, Object)>
				c.setTag(y.a.parent_matrix, ((Object) (null)));
	//   20   46:aload_0         
	//   21   47:getfield        #32  <Field View c>
	//   22   50:getstatic       #79  <Field int y$a.parent_matrix>
	//   23   53:aconst_null     
	//   24   54:invokevirtual   #61  <Method void View.setTag(int, Object)>
			}
		au.c(c, ((Matrix) (null)));
	//   25   57:aload_0         
	//   26   58:getfield        #32  <Field View c>
	//   27   61:aconst_null     
	//   28   62:invokestatic    #84  <Method void au.c(View, Matrix)>
		d.a(c);
	//   29   65:aload_0         
	//   30   66:getfield        #34  <Field ChangeTransform$c d>
	//   31   69:aload_0         
	//   32   70:getfield        #32  <Field View c>
	//   33   73:invokevirtual   #66  <Method void ChangeTransform$c.a(View)>
	//   34   76:return          
	}

	public void onAnimationPause(Animator animator)
	{
		a(e.a());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field ChangeTransform$b e>
	//    3    5:invokevirtual   #90  <Method Matrix ChangeTransform$b.a()>
	//    4    8:invokespecial   #76  <Method void a(Matrix)>
	//    5   11:return          
	}

	public void onAnimationResume(Animator animator)
	{
		ChangeTransform.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field View c>
	//    2    4:invokestatic    #92  <Method void ChangeTransform.a(View)>
	//    3    7:return          
	}

	final boolean a;
	final Matrix b;
	final View c;
	final ChangeTransform$c d;
	final ChangeTransform$b e;
	final ChangeTransform f;
	private boolean g;
	private Matrix h;

	ChangeTransform$3(ChangeTransform changetransform, boolean flag, Matrix matrix, View view, ChangeTransform$c changetransform$c, ChangeTransform$b changetransform$b)
	{
		f = changetransform;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ChangeTransform f>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field boolean a>
		b = matrix;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field Matrix b>
		c = view;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #32  <Field View c>
		d = changetransform$c;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #34  <Field ChangeTransform$c d>
		e = changetransform$b;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #36  <Field ChangeTransform$b e>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #39  <Method void AnimatorListenerAdapter()>
		h = new Matrix();
	//   20   37:aload_0         
	//   21   38:new             #41  <Class Matrix>
	//   22   41:dup             
	//   23   42:invokespecial   #42  <Method void Matrix()>
	//   24   45:putfield        #44  <Field Matrix h>
	//   25   48:return          
	}
}
