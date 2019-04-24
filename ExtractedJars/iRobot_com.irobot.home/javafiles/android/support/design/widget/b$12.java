// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//			b

class b$12
	implements android.view.animation.tion.AnimationListener
{

	public void onAnimationEnd(Animation animation)
	{
		a.f();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field b a>
	//    2    4:invokevirtual   #25  <Method void b.f()>
	//    3    7:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
	//    0    0:return          
	}

	final b a;

	b$12(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
