// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			b

class b$10 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		a.f();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field b a>
	//    2    4:invokevirtual   #23  <Method void b.f()>
	//    3    7:return          
	}

	public void onAnimationStart(Animator animator)
	{
		b.a(a).a(70, 180);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field b a>
	//    2    4:invokestatic    #27  <Method b$c b.a(b)>
	//    3    7:bipush          70
	//    4    9:sipush          180
	//    5   12:invokeinterface #32  <Method void b$c.a(int, int)>
	//    6   17:return          
	}

	final b a;

	b$10(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
