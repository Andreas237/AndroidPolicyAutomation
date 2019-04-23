// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			SwipeDismissTouchListener

class SwipeDismissTouchListener$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		SwipeDismissTouchListener.access$200(SwipeDismissTouchListener.this).onDismiss(SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this), SwipeDismissTouchListener.access$100(SwipeDismissTouchListener.this));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SwipeDismissTouchListener this$0>
	//    2    4:invokestatic    #32  <Method SwipeDismissTouchListener$DismissCallbacks SwipeDismissTouchListener.access$200(SwipeDismissTouchListener)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field SwipeDismissTouchListener this$0>
	//    5   11:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field SwipeDismissTouchListener this$0>
	//    8   18:invokestatic    #40  <Method Object SwipeDismissTouchListener.access$100(SwipeDismissTouchListener)>
	//    9   21:invokeinterface #46  <Method void SwipeDismissTouchListener$DismissCallbacks.onDismiss(View, Object)>
		SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setAlpha(1.0F);
	//   10   26:aload_0         
	//   11   27:getfield        #19  <Field SwipeDismissTouchListener this$0>
	//   12   30:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
	//   13   33:fconst_1        
	//   14   34:invokevirtual   #52  <Method void View.setAlpha(float)>
		SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setTranslationX(0.0F);
	//   15   37:aload_0         
	//   16   38:getfield        #19  <Field SwipeDismissTouchListener this$0>
	//   17   41:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
	//   18   44:fconst_0        
	//   19   45:invokevirtual   #55  <Method void View.setTranslationX(float)>
		val$lp.height = val$originalHeight;
	//   20   48:aload_0         
	//   21   49:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
	//   22   52:aload_0         
	//   23   53:getfield        #23  <Field int val$originalHeight>
	//   24   56:putfield        #60  <Field int android.view.ViewGroup$LayoutParams.height>
		SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setLayoutParams(val$lp);
	//   25   59:aload_0         
	//   26   60:getfield        #19  <Field SwipeDismissTouchListener this$0>
	//   27   63:invokestatic    #36  <Method View SwipeDismissTouchListener.access$000(SwipeDismissTouchListener)>
	//   28   66:aload_0         
	//   29   67:getfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
	//   30   70:invokevirtual   #64  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   31   73:return          
	}

	final SwipeDismissTouchListener this$0;
	final android.view.ViewGroup.LayoutParams val$lp;
	final int val$originalHeight;

	SwipeDismissTouchListener$2()
	{
		this$0 = final_swipedismisstouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field SwipeDismissTouchListener this$0>
		val$lp = layoutparams;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field android.view.ViewGroup$LayoutParams val$lp>
		val$originalHeight = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #23  <Field int val$originalHeight>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
