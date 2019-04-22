// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			SwipeDismissTouchListener

class SwipeDismissTouchListener$3
	implements android.animation.Listener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		val$lp.height = ((Integer)valueanimator.getAnimatedValue()).intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method Object ValueAnimator.getAnimatedValue()>
	//    4    8:checkcast       #34  <Class Integer>
	//    5   11:invokevirtual   #38  <Method int Integer.intValue()>
	//    6   14:putfield        #44  <Field int android.view.ViewGroup$LayoutParams.height>
		SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setLayoutParams(val$lp);
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field SwipeDismissTouchListener this$0>
	//    9   21:invokestatic    #48  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
	//   10   24:aload_0         
	//   11   25:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
	//   12   28:invokevirtual   #54  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   13   31:return          
	}

	final SwipeDismissTouchListener this$0;
	final android.view.ViewGroup.LayoutParams val$lp;

	SwipeDismissTouchListener$3()
	{
		this$0 = final_swipedismisstouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SwipeDismissTouchListener this$0>
		val$lp = android.view.ViewGroup.LayoutParams.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
