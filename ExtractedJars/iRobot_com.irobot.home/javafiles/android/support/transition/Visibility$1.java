// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.transition:
//			Visibility, am

class Visibility$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		a.b(b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field am a>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field View b>
	//    4    8:invokeinterface #33  <Method void am.b(View)>
	//    5   13:return          
	}

	final am a;
	final View b;
	final Visibility c;

	Visibility$1(Visibility visibility, am am1, View view)
	{
		c = visibility;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Visibility c>
		a = am1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field am a>
		b = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field View b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
