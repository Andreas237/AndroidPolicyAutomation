// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Visibility, au, an, Transition

private static class Visibility$a extends AnimatorListenerAdapter
	implements Transition$c, b.a
{

	private void a()
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean a>
	//*   2    4:ifne            32
		{
			au.a(b, c);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field View b>
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field int c>
	//    7   15:invokestatic    #52  <Method void au.a(View, int)>
			if(d != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #41  <Field ViewGroup d>
	//*  10   22:ifnull          32
				d.invalidate();
	//   11   25:aload_0         
	//   12   26:getfield        #41  <Field ViewGroup d>
	//   13   29:invokevirtual   #55  <Method void ViewGroup.invalidate()>
		}
		a(false);
	//   14   32:aload_0         
	//   15   33:iconst_0        
	//   16   34:invokespecial   #46  <Method void a(boolean)>
	//   17   37:return          
	}

	private void a(boolean flag)
	{
		if(e && f != flag && d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field boolean e>
	//*   2    4:ifeq            35
	//*   3    7:aload_0         
	//*   4    8:getfield        #57  <Field boolean f>
	//*   5   11:iload_1         
	//*   6   12:icmpeq          35
	//*   7   15:aload_0         
	//*   8   16:getfield        #41  <Field ViewGroup d>
	//*   9   19:ifnull          35
		{
			f = flag;
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:putfield        #57  <Field boolean f>
			an.a(d, flag);
	//   13   27:aload_0         
	//   14   28:getfield        #41  <Field ViewGroup d>
	//   15   31:iload_1         
	//   16   32:invokestatic    #62  <Method void an.a(ViewGroup, boolean)>
		}
	//   17   35:return          
	}

	public void a(Transition transition)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void a()>
		transition.b(((Transition$c) (this)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #70  <Method Transition Transition.b(Transition$c)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void b(Transition transition)
	{
		a(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #46  <Method void a(boolean)>
	//    3    5:return          
	}

	public void c(Transition transition)
	{
		a(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #46  <Method void a(boolean)>
	//    3    5:return          
	}

	public void d(Transition transition)
	{
	//    0    0:return          
	}

	public void onAnimationCancel(Animator animator)
	{
		a = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #27  <Field boolean a>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void a()>
	//    2    4:return          
	}

	public void onAnimationPause(Animator animator)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean a>
	//*   2    4:ifne            18
			au.a(b, c);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field View b>
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field int c>
	//    7   15:invokestatic    #52  <Method void au.a(View, int)>
	//    8   18:return          
	}

	public void onAnimationRepeat(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationResume(Animator animator)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean a>
	//*   2    4:ifne            15
			au.a(b, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field View b>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #52  <Method void au.a(View, int)>
	//    7   15:return          
	}

	public void onAnimationStart(Animator animator)
	{
	//    0    0:return          
	}

	boolean a;
	private final View b;
	private final int c;
	private final ViewGroup d;
	private final boolean e;
	private boolean f;

	Visibility$a(View view, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AnimatorListenerAdapter()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #27  <Field boolean a>
		b = view;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field View b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #31  <Field int c>
		d = (ViewGroup)view.getParent();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #37  <Method android.view.ViewParent View.getParent()>
	//   14   24:checkcast       #39  <Class ViewGroup>
	//   15   27:putfield        #41  <Field ViewGroup d>
		e = flag;
	//   16   30:aload_0         
	//   17   31:iload_3         
	//   18   32:putfield        #43  <Field boolean e>
		a(true);
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:invokespecial   #46  <Method void a(boolean)>
	//   22   40:return          
	}
}
