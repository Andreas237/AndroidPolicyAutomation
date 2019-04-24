// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.transition:
//			Visibility, ViewGroupOverlayImpl

class Visibility$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		val$overlay.remove(val$finalOverlayView);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroupOverlayImpl val$overlay>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field View val$finalOverlayView>
	//    4    8:invokeinterface #35  <Method void ViewGroupOverlayImpl.remove(View)>
	//    5   13:return          
	}

	final Visibility this$0;
	final View val$finalOverlayView;
	final ViewGroupOverlayImpl val$overlay;

	Visibility$1()
	{
		this$0 = final_visibility;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Visibility this$0>
		val$overlay = viewgroupoverlayimpl;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ViewGroupOverlayImpl val$overlay>
		val$finalOverlayView = View.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field View val$finalOverlayView>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void AnimatorListenerAdapter()>
	//   11   19:return          
	}
}
