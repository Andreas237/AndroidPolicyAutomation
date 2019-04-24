// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.amap.api.maps:
//			SwipeDismissTouchListener

class SwipeDismissTouchListener$3
	implements android.animation.Listener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		a.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method Object ValueAnimator.getAnimatedValue()>
	//    4    8:checkcast       #33  <Class Integer>
	//    5   11:invokevirtual   #37  <Method int Integer.intValue()>
	//    6   14:putfield        #43  <Field int android.view.ViewGroup$LayoutParams.height>
		SwipeDismissTouchListener.b(b).setLayoutParams(a);
	//    7   17:aload_0         
	//    8   18:getfield        #18  <Field SwipeDismissTouchListener b>
	//    9   21:invokestatic    #46  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
	//   10   24:aload_0         
	//   11   25:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
	//   12   28:invokevirtual   #52  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   31:return          
	}

	final android.view.ViewGroup.LayoutParams a;
	final SwipeDismissTouchListener b;

	SwipeDismissTouchListener$3(SwipeDismissTouchListener swipedismisstouchlistener, android.view.ViewGroup.LayoutParams layoutparams)
	{
		b = swipedismisstouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SwipeDismissTouchListener b>
		a = layoutparams;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field android.view.ViewGroup$LayoutParams a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Object()>
	//    8   14:return          
	}
}
