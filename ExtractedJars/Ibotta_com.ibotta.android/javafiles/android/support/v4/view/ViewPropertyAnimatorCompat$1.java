// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener

class ViewPropertyAnimatorCompat$1 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		val$listener.onAnimationCancel(val$view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewPropertyAnimatorListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field View val$view>
	//    4    8:invokeinterface #34  <Method void ViewPropertyAnimatorListener.onAnimationCancel(View)>
	//    5   13:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		val$listener.onAnimationEnd(val$view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewPropertyAnimatorListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field View val$view>
	//    4    8:invokeinterface #37  <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
	//    5   13:return          
	}

	public void onAnimationStart(Animator animator)
	{
		val$listener.onAnimationStart(val$view);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewPropertyAnimatorListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field View val$view>
	//    4    8:invokeinterface #40  <Method void ViewPropertyAnimatorListener.onAnimationStart(View)>
	//    5   13:return          
	}

	final ViewPropertyAnimatorCompat this$0;
	final ViewPropertyAnimatorListener val$listener;
	final View val$view;

	ViewPropertyAnimatorCompat$1()
	{
		this$0 = final_viewpropertyanimatorcompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewPropertyAnimatorCompat this$0>
		val$listener = viewpropertyanimatorlistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ViewPropertyAnimatorListener val$listener>
		val$view = View.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field View val$view>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
