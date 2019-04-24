// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			AnimatorUtilsImpl

class AnimatorUtilsApi14
	implements AnimatorUtilsImpl
{
	static interface AnimatorPauseListenerCompat
	{

		public abstract void onAnimationPause(Animator animator);

		public abstract void onAnimationResume(Animator animator);
	}


	AnimatorUtilsApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public void addPauseListener(Animator animator, AnimatorListenerAdapter animatorlisteneradapter)
	{
	//    0    0:return          
	}

	public void pause(Animator animator)
	{
		ArrayList arraylist = animator.getListeners();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method ArrayList Animator.getListeners()>
	//    2    4:astore          4
		if(arraylist != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          61
		{
			int i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_2        
			for(int j = arraylist.size(); i < j; i++)
	//*   7   13:aload           4
	//*   8   15:invokevirtual   #35  <Method int ArrayList.size()>
	//*   9   18:istore_3        
	//*  10   19:iload_2         
	//*  11   20:iload_3         
	//*  12   21:icmpge          61
			{
				android.animation.Animator.AnimatorListener animatorlistener = (android.animation.Animator.AnimatorListener)arraylist.get(i);
	//   13   24:aload           4
	//   14   26:iload_2         
	//   15   27:invokevirtual   #39  <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #41  <Class android.animation.Animator$AnimatorListener>
	//   17   33:astore          5
				if(animatorlistener instanceof AnimatorPauseListenerCompat)
	//*  18   35:aload           5
	//*  19   37:instanceof      #8   <Class AnimatorUtilsApi14$AnimatorPauseListenerCompat>
	//*  20   40:ifeq            54
					((AnimatorPauseListenerCompat)animatorlistener).onAnimationPause(animator);
	//   21   43:aload           5
	//   22   45:checkcast       #8   <Class AnimatorUtilsApi14$AnimatorPauseListenerCompat>
	//   23   48:aload_1         
	//   24   49:invokeinterface #44  <Method void AnimatorUtilsApi14$AnimatorPauseListenerCompat.onAnimationPause(Animator)>
			}

	//   25   54:iload_2         
	//   26   55:iconst_1        
	//   27   56:iadd            
	//   28   57:istore_2        
		}
	//*  29   58:goto            19
	//   30   61:return          
	}

	public void resume(Animator animator)
	{
		ArrayList arraylist = animator.getListeners();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method ArrayList Animator.getListeners()>
	//    2    4:astore          4
		if(arraylist != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          61
		{
			int i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_2        
			for(int j = arraylist.size(); i < j; i++)
	//*   7   13:aload           4
	//*   8   15:invokevirtual   #35  <Method int ArrayList.size()>
	//*   9   18:istore_3        
	//*  10   19:iload_2         
	//*  11   20:iload_3         
	//*  12   21:icmpge          61
			{
				android.animation.Animator.AnimatorListener animatorlistener = (android.animation.Animator.AnimatorListener)arraylist.get(i);
	//   13   24:aload           4
	//   14   26:iload_2         
	//   15   27:invokevirtual   #39  <Method Object ArrayList.get(int)>
	//   16   30:checkcast       #41  <Class android.animation.Animator$AnimatorListener>
	//   17   33:astore          5
				if(animatorlistener instanceof AnimatorPauseListenerCompat)
	//*  18   35:aload           5
	//*  19   37:instanceof      #8   <Class AnimatorUtilsApi14$AnimatorPauseListenerCompat>
	//*  20   40:ifeq            54
					((AnimatorPauseListenerCompat)animatorlistener).onAnimationResume(animator);
	//   21   43:aload           5
	//   22   45:checkcast       #8   <Class AnimatorUtilsApi14$AnimatorPauseListenerCompat>
	//   23   48:aload_1         
	//   24   49:invokeinterface #48  <Method void AnimatorUtilsApi14$AnimatorPauseListenerCompat.onAnimationResume(Animator)>
			}

	//   25   54:iload_2         
	//   26   55:iconst_1        
	//   27   56:iadd            
	//   28   57:istore_2        
		}
	//*  29   58:goto            19
	//   30   61:return          
	}
}
