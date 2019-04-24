// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			Transition

class Transition$4 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		e.remove(((Object) (animator)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayMap e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method Object ArrayMap.remove(Object)>
	//    4    8:pop             
		Transition.access$000(a).remove(((Object) (animator)));
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field Transition a>
	//    7   13:invokestatic    #35  <Method ArrayList Transition.access$000(Transition)>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #40  <Method boolean ArrayList.remove(Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void onAnimationStart(Animator animator)
	{
		Transition.access$000(a).add(((Object) (animator)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Transition a>
	//    2    4:invokestatic    #35  <Method ArrayList Transition.access$000(Transition)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #44  <Method boolean ArrayList.add(Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	final Transition a;
	final ArrayMap e;

	Transition$4(Transition transition, ArrayMap arraymap)
	{
		a = transition;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Transition a>
		e = arraymap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field ArrayMap e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
