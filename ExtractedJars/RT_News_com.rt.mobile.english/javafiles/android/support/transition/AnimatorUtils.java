// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.transition:
//			AnimatorUtilsApi19, AnimatorUtilsApi14, AnimatorUtilsImpl

class AnimatorUtils
{

	AnimatorUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static void addPauseListener(Animator animator, AnimatorListenerAdapter animatorlisteneradapter)
	{
		IMPL.addPauseListener(animator, animatorlisteneradapter);
	//    0    0:getstatic       #21  <Field AnimatorUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #33  <Method void AnimatorUtilsImpl.addPauseListener(Animator, AnimatorListenerAdapter)>
	//    4   10:return          
	}

	static void pause(Animator animator)
	{
		IMPL.pause(animator);
	//    0    0:getstatic       #21  <Field AnimatorUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #38  <Method void AnimatorUtilsImpl.pause(Animator)>
	//    3    9:return          
	}

	static void resume(Animator animator)
	{
		IMPL.resume(animator);
	//    0    0:getstatic       #21  <Field AnimatorUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #41  <Method void AnimatorUtilsImpl.resume(Animator)>
	//    3    9:return          
	}

	private static final AnimatorUtilsImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((AnimatorUtilsImpl) (new AnimatorUtilsApi19()));
	//    3    8:new             #16  <Class AnimatorUtilsApi19>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void AnimatorUtilsApi19()>
	//    6   15:putstatic       #21  <Field AnimatorUtilsImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((AnimatorUtilsImpl) (new AnimatorUtilsApi14()));
	//    8   19:new             #23  <Class AnimatorUtilsApi14>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void AnimatorUtilsApi14()>
	//   11   26:putstatic       #21  <Field AnimatorUtilsImpl IMPL>
	//*  12   29:return          
	}
}
