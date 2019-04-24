// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

private static class FragmentManagerImpl$AnimationListenerWrapper
	implements android.view.animation.Animation.AnimationListener
{

	public void onAnimationEnd(Animation animation)
	{
		if(mWrapped != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//*   2    4:ifnull          17
			mWrapped.onAnimationEnd(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    5   11:aload_1         
	//    6   12:invokeinterface #26  <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(Animation)>
	//    7   17:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
		if(mWrapped != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//*   2    4:ifnull          17
			mWrapped.onAnimationRepeat(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    5   11:aload_1         
	//    6   12:invokeinterface #29  <Method void android.view.animation.Animation$AnimationListener.onAnimationRepeat(Animation)>
	//    7   17:return          
	}

	public void onAnimationStart(Animation animation)
	{
		if(mWrapped != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//*   2    4:ifnull          17
			mWrapped.onAnimationStart(animation);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    5   11:aload_1         
	//    6   12:invokeinterface #32  <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(Animation)>
	//    7   17:return          
	}

	private final android.view.animation.Animation.AnimationListener mWrapped;

	private FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation.AnimationListener animationlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mWrapped = animationlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    5    9:return          
	}

	FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation.AnimationListener animationlistener, FragmentManagerImpl._cls1 _pcls1)
	{
		this(animationlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation$AnimationListener)>
	//    3    5:return          
	}
}
