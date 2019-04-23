// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

class AnimatorUtils
{
	static interface AnimatorPauseListenerCompat
	{

		public abstract void onAnimationPause(Animator animator);

		public abstract void onAnimationResume(Animator animator);
	}


	private AnimatorUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	static void addPauseListener(Animator animator, AnimatorListenerAdapter animatorlisteneradapter)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			animator.addPauseListener(((android.animation.Animator.AnimatorPauseListener) (animatorlisteneradapter)));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #26  <Method void Animator.addPauseListener(android.animation.Animator$AnimatorPauseListener)>
	//    6   13:return          
	}

	static void pause(Animator animator)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
		{
			animator.pause();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #31  <Method void Animator.pause()>
			return;
	//    5   12:return          
		}
		ArrayList arraylist = animator.getListeners();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #35  <Method ArrayList Animator.getListeners()>
	//    8   17:astore_3        
		if(arraylist != null)
	//*   9   18:aload_3         
	//*  10   19:ifnull          70
		{
			int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_1        
			for(int j = arraylist.size(); i < j; i++)
	//*  13   24:aload_3         
	//*  14   25:invokevirtual   #41  <Method int ArrayList.size()>
	//*  15   28:istore_2        
	//*  16   29:iload_1         
	//*  17   30:iload_2         
	//*  18   31:icmpge          70
			{
				android.animation.Animator.AnimatorListener animatorlistener = (android.animation.Animator.AnimatorListener)arraylist.get(i);
	//   19   34:aload_3         
	//   20   35:iload_1         
	//   21   36:invokevirtual   #45  <Method Object ArrayList.get(int)>
	//   22   39:checkcast       #47  <Class android.animation.Animator$AnimatorListener>
	//   23   42:astore          4
				if(animatorlistener instanceof AnimatorPauseListenerCompat)
	//*  24   44:aload           4
	//*  25   46:instanceof      #6   <Class AnimatorUtils$AnimatorPauseListenerCompat>
	//*  26   49:ifeq            63
					((AnimatorPauseListenerCompat)animatorlistener).onAnimationPause(animator);
	//   27   52:aload           4
	//   28   54:checkcast       #6   <Class AnimatorUtils$AnimatorPauseListenerCompat>
	//   29   57:aload_0         
	//   30   58:invokeinterface #50  <Method void AnimatorUtils$AnimatorPauseListenerCompat.onAnimationPause(Animator)>
			}

	//   31   63:iload_1         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_1        
		}
	//*  35   67:goto            29
	//   36   70:return          
	}

	static void resume(Animator animator)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
		{
			animator.resume();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #53  <Method void Animator.resume()>
			return;
	//    5   12:return          
		}
		ArrayList arraylist = animator.getListeners();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #35  <Method ArrayList Animator.getListeners()>
	//    8   17:astore_3        
		if(arraylist != null)
	//*   9   18:aload_3         
	//*  10   19:ifnull          70
		{
			int i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_1        
			for(int j = arraylist.size(); i < j; i++)
	//*  13   24:aload_3         
	//*  14   25:invokevirtual   #41  <Method int ArrayList.size()>
	//*  15   28:istore_2        
	//*  16   29:iload_1         
	//*  17   30:iload_2         
	//*  18   31:icmpge          70
			{
				android.animation.Animator.AnimatorListener animatorlistener = (android.animation.Animator.AnimatorListener)arraylist.get(i);
	//   19   34:aload_3         
	//   20   35:iload_1         
	//   21   36:invokevirtual   #45  <Method Object ArrayList.get(int)>
	//   22   39:checkcast       #47  <Class android.animation.Animator$AnimatorListener>
	//   23   42:astore          4
				if(animatorlistener instanceof AnimatorPauseListenerCompat)
	//*  24   44:aload           4
	//*  25   46:instanceof      #6   <Class AnimatorUtils$AnimatorPauseListenerCompat>
	//*  26   49:ifeq            63
					((AnimatorPauseListenerCompat)animatorlistener).onAnimationResume(animator);
	//   27   52:aload           4
	//   28   54:checkcast       #6   <Class AnimatorUtils$AnimatorPauseListenerCompat>
	//   29   57:aload_0         
	//   30   58:invokeinterface #56  <Method void AnimatorUtils$AnimatorPauseListenerCompat.onAnimationResume(Animator)>
			}

	//   31   63:iload_1         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_1        
		}
	//*  35   67:goto            29
	//   36   70:return          
	}
}
