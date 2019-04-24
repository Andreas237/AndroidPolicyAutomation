// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.f.a;
import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			Transition

class Transition$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		a.remove(((Object) (animator)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field a a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method Object a.remove(Object)>
	//    4    8:pop             
		android.support.transition.Transition.a(b).remove(((Object) (animator)));
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field Transition b>
	//    7   13:invokestatic    #33  <Method ArrayList android.support.transition.Transition.a(Transition)>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #38  <Method boolean ArrayList.remove(Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void onAnimationStart(Animator animator)
	{
		android.support.transition.Transition.a(b).add(((Object) (animator)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Transition b>
	//    2    4:invokestatic    #33  <Method ArrayList android.support.transition.Transition.a(Transition)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #42  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	final a a;
	final Transition b;

	Transition$2(Transition transition, a a1)
	{
		b = transition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field Transition b>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
