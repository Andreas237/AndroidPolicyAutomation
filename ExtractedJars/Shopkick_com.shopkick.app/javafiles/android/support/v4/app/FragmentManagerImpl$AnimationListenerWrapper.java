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
		android.view.animation.Animation.AnimationListener animationlistener = mWrapped;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    2    4:astore_2        
		if(animationlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			animationlistener.onAnimationEnd(animation);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #24  <Method void android.view.animation.Animation$AnimationListener.onAnimationEnd(Animation)>
	//    8   16:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
		android.view.animation.Animation.AnimationListener animationlistener = mWrapped;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    2    4:astore_2        
		if(animationlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			animationlistener.onAnimationRepeat(animation);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #28  <Method void android.view.animation.Animation$AnimationListener.onAnimationRepeat(Animation)>
	//    8   16:return          
	}

	public void onAnimationStart(Animation animation)
	{
		android.view.animation.Animation.AnimationListener animationlistener = mWrapped;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    2    4:astore_2        
		if(animationlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			animationlistener.onAnimationStart(animation);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method void android.view.animation.Animation$AnimationListener.onAnimationStart(Animation)>
	//    8   16:return          
	}

	private final android.view.animation.Animation.AnimationListener mWrapped;

	FragmentManagerImpl$AnimationListenerWrapper(android.view.animation.Animation.AnimationListener animationlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mWrapped = animationlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field android.view.animation.Animation$AnimationListener mWrapped>
	//    5    9:return          
	}
}
