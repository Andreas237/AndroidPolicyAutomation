// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package o:
//			u, ah

class u$5 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		c.a = 0;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field u c>
	//    2    4:iconst_0        
	//    3    5:putfield        #31  <Field int u.a>
		if(a != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #22  <Field u$b a>
	//*   6   12:ifnull          24
			a.d();
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field u$b a>
	//    9   19:invokeinterface #35  <Method void u$b.d()>
	//   10   24:return          
	}

	public void onAnimationStart(Animator animator)
	{
		c.l.internalSetVisibility(0, d);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field u c>
	//    2    4:getfield        #40  <Field ah u.l>
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field boolean d>
	//    6   12:invokevirtual   #46  <Method void ah.internalSetVisibility(int, boolean)>
	//    7   15:return          
	}

	final u$b a;
	final u c;
	final boolean d;

	u$5(u u1, boolean flag, u$b u$b1)
	{
		c = u1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field u c>
		d = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field boolean d>
		a = u$b1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field u$b a>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
