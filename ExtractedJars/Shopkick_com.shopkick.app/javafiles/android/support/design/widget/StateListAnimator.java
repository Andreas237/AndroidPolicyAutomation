// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.util.StateSet;
import java.util.ArrayList;

public final class StateListAnimator
{
	static class Tuple
	{

		final ValueAnimator animator;
		final int specs[];

		Tuple(int ai[], ValueAnimator valueanimator)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			specs = ai;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field int[] specs>
			animator = valueanimator;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field ValueAnimator animator>
		//    8   14:return          
		}
	}


	public StateListAnimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field ArrayList tuples>
		lastMatch = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #33  <Field StateListAnimator$Tuple lastMatch>
		runningAnimator = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #35  <Field ValueAnimator runningAnimator>
	//   13   25:aload_0         
	//   14   26:new             #6   <Class StateListAnimator$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #38  <Method void StateListAnimator$1(StateListAnimator)>
	//   18   34:putfield        #40  <Field android.animation.Animator$AnimatorListener animationListener>
	//   19   37:return          
	}

	private void cancel()
	{
		ValueAnimator valueanimator = runningAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ValueAnimator runningAnimator>
	//    2    4:astore_1        
		if(valueanimator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			valueanimator.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #46  <Method void ValueAnimator.cancel()>
			runningAnimator = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #35  <Field ValueAnimator runningAnimator>
		}
	//   10   18:return          
	}

	private void start(Tuple tuple)
	{
		runningAnimator = tuple.animator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #51  <Field ValueAnimator StateListAnimator$Tuple.animator>
	//    3    5:putfield        #35  <Field ValueAnimator runningAnimator>
		runningAnimator.start();
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field ValueAnimator runningAnimator>
	//    6   12:invokevirtual   #53  <Method void ValueAnimator.start()>
	//    7   15:return          
	}

	public void addState(int ai[], ValueAnimator valueanimator)
	{
		ai = ((int []) (new Tuple(ai, valueanimator)));
	//    0    0:new             #8   <Class StateListAnimator$Tuple>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #57  <Method void StateListAnimator$Tuple(int[], ValueAnimator)>
	//    5    9:astore_1        
		valueanimator.addListener(animationListener);
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #40  <Field android.animation.Animator$AnimatorListener animationListener>
	//    9   15:invokevirtual   #61  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		tuples.add(((Object) (ai)));
	//   10   18:aload_0         
	//   11   19:getfield        #31  <Field ArrayList tuples>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #65  <Method boolean ArrayList.add(Object)>
	//   14   26:pop             
	//   15   27:return          
	}

	public void jumpToCurrentState()
	{
		ValueAnimator valueanimator = runningAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ValueAnimator runningAnimator>
	//    2    4:astore_1        
		if(valueanimator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			valueanimator.end();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #69  <Method void ValueAnimator.end()>
			runningAnimator = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #35  <Field ValueAnimator runningAnimator>
		}
	//   10   18:return          
	}

	public void setState(int ai[])
	{
label0:
		{
			int j = tuples.size();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList tuples>
	//    2    4:invokevirtual   #75  <Method int ArrayList.size()>
	//    3    7:istore_3        
			int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
			do
			{
				if(i >= j)
					break;
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:icmpge          53
				Tuple tuple = (Tuple)tuples.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field ArrayList tuples>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #79  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #8   <Class StateListAnimator$Tuple>
	//   14   26:astore          4
				if(StateSet.stateSetMatches(tuple.specs, ai))
	//*  15   28:aload           4
	//*  16   30:getfield        #83  <Field int[] StateListAnimator$Tuple.specs>
	//*  17   33:aload_1         
	//*  18   34:invokestatic    #89  <Method boolean StateSet.stateSetMatches(int[], int[])>
	//*  19   37:ifeq            46
				{
					ai = ((int []) (tuple));
	//   20   40:aload           4
	//   21   42:astore_1        
					break label0;
	//   22   43:goto            55
				}
				i++;
	//   23   46:iload_2         
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:istore_2        
			} while(true);
	//   27   50:goto            10
			ai = null;
	//   28   53:aconst_null     
	//   29   54:astore_1        
		}
		Tuple tuple1 = lastMatch;
	//   30   55:aload_0         
	//   31   56:getfield        #33  <Field StateListAnimator$Tuple lastMatch>
	//   32   59:astore          4
		if(ai == tuple1)
	//*  33   61:aload_1         
	//*  34   62:aload           4
	//*  35   64:if_acmpne       68
			return;
	//   36   67:return          
		if(tuple1 != null)
	//*  37   68:aload           4
	//*  38   70:ifnull          77
			cancel();
	//   39   73:aload_0         
	//   40   74:invokespecial   #90  <Method void cancel()>
		lastMatch = ((Tuple) (ai));
	//   41   77:aload_0         
	//   42   78:aload_1         
	//   43   79:putfield        #33  <Field StateListAnimator$Tuple lastMatch>
		if(ai != null)
	//*  44   82:aload_1         
	//*  45   83:ifnull          91
			start(((Tuple) (ai)));
	//   46   86:aload_0         
	//   47   87:aload_1         
	//   48   88:invokespecial   #92  <Method void start(StateListAnimator$Tuple)>
	//   49   91:return          
	}

	private final android.animation.Animator.AnimatorListener animationListener = new AnimatorListenerAdapter() {

		public void onAnimationEnd(Animator animator)
		{
			if(runningAnimator == animator)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field StateListAnimator this$0>
		//*   2    4:getfield        #22  <Field ValueAnimator StateListAnimator.runningAnimator>
		//*   3    7:aload_1         
		//*   4    8:if_acmpne       19
				runningAnimator = null;
		//    5   11:aload_0         
		//    6   12:getfield        #12  <Field StateListAnimator this$0>
		//    7   15:aconst_null     
		//    8   16:putfield        #22  <Field ValueAnimator StateListAnimator.runningAnimator>
		//    9   19:return          
		}

		final StateListAnimator this$0;

			
			{
				this$0 = StateListAnimator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field StateListAnimator this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
	}
;
	private Tuple lastMatch;
	ValueAnimator runningAnimator;
	private final ArrayList tuples = new ArrayList();
}
