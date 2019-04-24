// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.view.animation.Animation;

// Referenced classes of package android.databinding.adapters:
//			ViewGroupBindingAdapter

static final class ViewGroupBindingAdapter$2
	implements android.view.animation.r
{

	public void onAnimationEnd(Animation animation)
	{
		if(val$end != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ViewGroupBindingAdapter$OnAnimationEnd val$end>
	//*   2    4:ifnull          17
			val$end.onAnimationEnd(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field ViewGroupBindingAdapter$OnAnimationEnd val$end>
	//    5   11:aload_1         
	//    6   12:invokeinterface #35  <Method void ViewGroupBindingAdapter$OnAnimationEnd.onAnimationEnd(Animation)>
	//    7   17:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
		if(val$repeat != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field ViewGroupBindingAdapter$OnAnimationRepeat val$repeat>
	//*   2    4:ifnull          17
			val$repeat.onAnimationRepeat(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field ViewGroupBindingAdapter$OnAnimationRepeat val$repeat>
	//    5   11:aload_1         
	//    6   12:invokeinterface #40  <Method void ViewGroupBindingAdapter$OnAnimationRepeat.onAnimationRepeat(Animation)>
	//    7   17:return          
	}

	public void onAnimationStart(Animation animation)
	{
		if(val$start != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ViewGroupBindingAdapter$OnAnimationStart val$start>
	//*   2    4:ifnull          17
			val$start.onAnimationStart(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field ViewGroupBindingAdapter$OnAnimationStart val$start>
	//    5   11:aload_1         
	//    6   12:invokeinterface #45  <Method void ViewGroupBindingAdapter$OnAnimationStart.onAnimationStart(Animation)>
	//    7   17:return          
	}

	final AnimationEnd val$end;
	final AnimationRepeat val$repeat;
	final AnimationStart val$start;

	ViewGroupBindingAdapter$2(AnimationStart animationstart, AnimationEnd animationend, AnimationRepeat animationrepeat)
	{
		val$start = animationstart;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ViewGroupBindingAdapter$OnAnimationStart val$start>
		val$end = animationend;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ViewGroupBindingAdapter$OnAnimationEnd val$end>
		val$repeat = animationrepeat;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field ViewGroupBindingAdapter$OnAnimationRepeat val$repeat>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
