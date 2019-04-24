// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.amap.api.maps:
//			SwipeDismissTouchListener

class SwipeDismissTouchListener$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		SwipeDismissTouchListener.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SwipeDismissTouchListener a>
	//    2    4:invokestatic    #23  <Method void SwipeDismissTouchListener.a(SwipeDismissTouchListener)>
	//    3    7:return          
	}

	final SwipeDismissTouchListener a;

	SwipeDismissTouchListener$1(SwipeDismissTouchListener swipedismisstouchlistener)
	{
		a = swipedismisstouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SwipeDismissTouchListener a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
