// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;

// Referenced classes of package android.support.transition:
//			TransitionListenerAdapter, Fade, ViewUtils, Transition

class Fade$1 extends TransitionListenerAdapter
{

	public void onTransitionEnd(Transition transition)
	{
		ViewUtils.setTransitionAlpha(val$view, 1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field View val$view>
	//    2    4:fconst_1        
	//    3    5:invokestatic    #32  <Method void ViewUtils.setTransitionAlpha(View, float)>
		ViewUtils.clearNonTransitionAlpha(val$view);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field View val$view>
	//    6   12:invokestatic    #36  <Method void ViewUtils.clearNonTransitionAlpha(View)>
		transition.removeListener(((ion.TransitionListener) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #42  <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//   10   20:pop             
	//   11   21:return          
	}

	final Fade this$0;
	final View val$view;

	Fade$1()
	{
		this$0 = final_fade;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Fade this$0>
		val$view = View.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field View val$view>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void TransitionListenerAdapter()>
	//    8   14:return          
	}
}
