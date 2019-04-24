// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.*;

// Referenced classes of package o:
//			u, y

abstract class u$d extends AnimatorListenerAdapter
	implements android.animation.eAnimator.AnimatorUpdateListener
{

	protected abstract float c();

	public void onAnimationEnd(Animator animator)
	{
		c.b.d(e);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field u c>
	//    2    4:getfield        #33  <Field y u.b>
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field float e>
	//    5   11:invokevirtual   #40  <Method void y.d(float)>
		b = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #42  <Field boolean b>
	//    9   19:return          
	}

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		if(!b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field boolean b>
	//*   2    4:ifne            34
		{
			a = c.b.c();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field u c>
	//    6   12:getfield        #33  <Field y u.b>
	//    7   15:invokevirtual   #46  <Method float y.c()>
	//    8   18:putfield        #48  <Field float a>
			e = c();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #49  <Method float c()>
	//   12   26:putfield        #35  <Field float e>
			b = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #42  <Field boolean b>
		}
		c.b.d(a + (e - a) * valueanimator.getAnimatedFraction());
	//   16   34:aload_0         
	//   17   35:getfield        #20  <Field u c>
	//   18   38:getfield        #33  <Field y u.b>
	//   19   41:aload_0         
	//   20   42:getfield        #48  <Field float a>
	//   21   45:aload_0         
	//   22   46:getfield        #35  <Field float e>
	//   23   49:aload_0         
	//   24   50:getfield        #48  <Field float a>
	//   25   53:fsub            
	//   26   54:aload_1         
	//   27   55:invokevirtual   #54  <Method float ValueAnimator.getAnimatedFraction()>
	//   28   58:fmul            
	//   29   59:fadd            
	//   30   60:invokevirtual   #40  <Method void y.d(float)>
	//   31   63:return          
	}

	private float a;
	private boolean b;
	final u c;
	private float e;

	private u$d(u u1)
	{
		c = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field u c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}

	u$d(u u1, u$4 u$4)
	{
		this(u1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void u$d(u)>
	//    3    5:return          
	}
}
