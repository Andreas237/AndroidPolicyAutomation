// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat, ViewPropertyAnimatorUpdateListener

class ViewPropertyAnimatorCompat$2
	implements android.animation.istener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		val$listener.onAnimationUpdate(val$view);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewPropertyAnimatorUpdateListener val$listener>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field View val$view>
	//    4    8:invokeinterface #36  <Method void ViewPropertyAnimatorUpdateListener.onAnimationUpdate(View)>
	//    5   13:return          
	}

	final ViewPropertyAnimatorCompat this$0;
	final ViewPropertyAnimatorUpdateListener val$listener;
	final View val$view;

	ViewPropertyAnimatorCompat$2()
	{
		this$0 = final_viewpropertyanimatorcompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ViewPropertyAnimatorCompat this$0>
		val$listener = viewpropertyanimatorupdatelistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ViewPropertyAnimatorUpdateListener val$listener>
		val$view = View.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field View val$view>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
