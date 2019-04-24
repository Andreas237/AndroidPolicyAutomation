// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.amap.api.maps:
//			SwipeDismissTouchListener

class SwipeDismissTouchListener$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		SwipeDismissTouchListener.b(c).setAlpha(0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SwipeDismissTouchListener c>
	//    2    4:invokestatic    #30  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
	//    3    7:fconst_0        
	//    4    8:invokevirtual   #36  <Method void View.setAlpha(float)>
		SwipeDismissTouchListener.b(c).setTranslationX(0.0F);
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field SwipeDismissTouchListener c>
	//    7   15:invokestatic    #30  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
	//    8   18:fconst_0        
	//    9   19:invokevirtual   #39  <Method void View.setTranslationX(float)>
		a.height = b;
	//   10   22:aload_0         
	//   11   23:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
	//   12   26:aload_0         
	//   13   27:getfield        #22  <Field int b>
	//   14   30:putfield        #44  <Field int android.view.ViewGroup$LayoutParams.height>
		SwipeDismissTouchListener.b(c).setLayoutParams(a);
	//   15   33:aload_0         
	//   16   34:getfield        #18  <Field SwipeDismissTouchListener c>
	//   17   37:invokestatic    #30  <Method View SwipeDismissTouchListener.b(SwipeDismissTouchListener)>
	//   18   40:aload_0         
	//   19   41:getfield        #20  <Field android.view.ViewGroup$LayoutParams a>
	//   20   44:invokevirtual   #48  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   21   47:return          
	}

	final android.view.ViewGroup.LayoutParams a;
	final int b;
	final SwipeDismissTouchListener c;

	SwipeDismissTouchListener$2(SwipeDismissTouchListener swipedismisstouchlistener, android.view.ViewGroup.LayoutParams layoutparams, int i)
	{
		c = swipedismisstouchlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SwipeDismissTouchListener c>
		a = layoutparams;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field android.view.ViewGroup$LayoutParams a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #22  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
