// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			SwipeDismissTouchListener

class SwipeDismissTouchListener$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		performDismiss();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SwipeDismissTouchListener this$0>
	//    2    4:invokevirtual   #24  <Method void SwipeDismissTouchListener.performDismiss()>
	//    3    7:return          
	}

	final SwipeDismissTouchListener this$0;

	SwipeDismissTouchListener$1()
	{
		this$0 = SwipeDismissTouchListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SwipeDismissTouchListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
