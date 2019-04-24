// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package o:
//			u, ah

class u$4 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		b = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #31  <Field boolean b>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		a.a = 0;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field u a>
	//    2    4:iconst_0        
	//    3    5:putfield        #35  <Field int u.a>
		if(!b)
	//*   4    8:aload_0         
	//*   5    9:getfield        #31  <Field boolean b>
	//*   6   12:ifne            63
		{
			animator = ((Animator) (a.l));
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field u a>
	//    9   19:getfield        #39  <Field ah u.l>
	//   10   22:astore_1        
			byte byte0;
			if(c)
	//*  11   23:aload_0         
	//*  12   24:getfield        #21  <Field boolean c>
	//*  13   27:ifeq            36
				byte0 = 8;
	//   14   30:bipush          8
	//   15   32:istore_2        
			else
	//*  16   33:goto            38
				byte0 = 4;
	//   17   36:iconst_4        
	//   18   37:istore_2        
			((ah) (animator)).internalSetVisibility(((int) (byte0)), c);
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field boolean c>
	//   23   44:invokevirtual   #45  <Method void ah.internalSetVisibility(int, boolean)>
			if(d != null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #23  <Field u$b d>
	//*  26   51:ifnull          63
				d.a();
	//   27   54:aload_0         
	//   28   55:getfield        #23  <Field u$b d>
	//   29   58:invokeinterface #49  <Method void u$b.a()>
		}
	//   30   63:return          
	}

	public void onAnimationStart(Animator animator)
	{
		a.l.internalSetVisibility(0, c);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field u a>
	//    2    4:getfield        #39  <Field ah u.l>
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field boolean c>
	//    6   12:invokevirtual   #45  <Method void ah.internalSetVisibility(int, boolean)>
		b = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #31  <Field boolean b>
	//   10   20:return          
	}

	final u a;
	private boolean b;
	final boolean c;
	final u$b d;

	u$4(u u1, boolean flag, u$b u$b1)
	{
		a = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field u a>
		c = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean c>
		d = u$b1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field u$b d>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
