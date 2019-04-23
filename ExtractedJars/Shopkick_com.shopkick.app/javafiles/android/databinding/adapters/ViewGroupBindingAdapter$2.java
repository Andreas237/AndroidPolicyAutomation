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
		AnimationEnd animationend = val$end;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewGroupBindingAdapter$OnAnimationEnd val$end>
	//    2    4:astore_2        
		if(animationend != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			animationend.onAnimationEnd(animation);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #35  <Method void ViewGroupBindingAdapter$OnAnimationEnd.onAnimationEnd(Animation)>
	//    8   16:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
		AnimationRepeat animationrepeat = val$repeat;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupBindingAdapter$OnAnimationRepeat val$repeat>
	//    2    4:astore_2        
		if(animationrepeat != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			animationrepeat.onAnimationRepeat(animation);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #40  <Method void ViewGroupBindingAdapter$OnAnimationRepeat.onAnimationRepeat(Animation)>
	//    8   16:return          
	}

	public void onAnimationStart(Animation animation)
	{
		AnimationStart animationstart = val$start;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroupBindingAdapter$OnAnimationStart val$start>
	//    2    4:astore_2        
		if(animationstart != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			animationstart.onAnimationStart(animation);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #45  <Method void ViewGroupBindingAdapter$OnAnimationStart.onAnimationStart(Animation)>
	//    8   16:return          
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
