// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.transition:
//			AnimatorUtilsImpl

class AnimatorUtilsApi19
	implements AnimatorUtilsImpl
{

	AnimatorUtilsApi19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public void addPauseListener(Animator animator, AnimatorListenerAdapter animatorlisteneradapter)
	{
		animator.addPauseListener(((android.animation.Animator.AnimatorPauseListener) (animatorlisteneradapter)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #22  <Method void Animator.addPauseListener(android.animation.Animator$AnimatorPauseListener)>
	//    3    5:return          
	}

	public void pause(Animator animator)
	{
		animator.pause();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method void Animator.pause()>
	//    2    4:return          
	}

	public void resume(Animator animator)
	{
		animator.resume();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method void Animator.resume()>
	//    2    4:return          
	}
}
