// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.util.StateSet;
import java.util.ArrayList;

final class StateListAnimator
{
	static class Tuple
	{

		final ValueAnimator mAnimator;
		final int mSpecs[];

		Tuple(int ai[], ValueAnimator valueanimator)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mSpecs = ai;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field int[] mSpecs>
			mAnimator = valueanimator;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field ValueAnimator mAnimator>
		//    8   14:return          
		}
	}


	StateListAnimator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void ArrayList()>
	//    6   12:putfield        #27  <Field ArrayList mTuples>
		mLastMatch = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #29  <Field StateListAnimator$Tuple mLastMatch>
		mRunningAnimator = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #31  <Field ValueAnimator mRunningAnimator>
	//   13   25:aload_0         
	//   14   26:new             #6   <Class StateListAnimator$1>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokespecial   #34  <Method void StateListAnimator$1(StateListAnimator)>
	//   18   34:putfield        #36  <Field android.animation.Animator$AnimatorListener mAnimationListener>
	//   19   37:return          
	}

	private void cancel()
	{
		if(mRunningAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field ValueAnimator mRunningAnimator>
	//*   2    4:ifnull          19
		{
			mRunningAnimator.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field ValueAnimator mRunningAnimator>
	//    5   11:invokevirtual   #42  <Method void ValueAnimator.cancel()>
			mRunningAnimator = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #31  <Field ValueAnimator mRunningAnimator>
		}
	//    9   19:return          
	}

	private void start(Tuple tuple)
	{
		mRunningAnimator = tuple.mAnimator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #47  <Field ValueAnimator StateListAnimator$Tuple.mAnimator>
	//    3    5:putfield        #31  <Field ValueAnimator mRunningAnimator>
		mRunningAnimator.start();
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field ValueAnimator mRunningAnimator>
	//    6   12:invokevirtual   #49  <Method void ValueAnimator.start()>
	//    7   15:return          
	}

	public void addState(int ai[], ValueAnimator valueanimator)
	{
		ai = ((int []) (new Tuple(ai, valueanimator)));
	//    0    0:new             #8   <Class StateListAnimator$Tuple>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #53  <Method void StateListAnimator$Tuple(int[], ValueAnimator)>
	//    5    9:astore_1        
		valueanimator.addListener(mAnimationListener);
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #36  <Field android.animation.Animator$AnimatorListener mAnimationListener>
	//    9   15:invokevirtual   #57  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		mTuples.add(((Object) (ai)));
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field ArrayList mTuples>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #61  <Method boolean ArrayList.add(Object)>
	//   14   26:pop             
	//   15   27:return          
	}

	public void jumpToCurrentState()
	{
		if(mRunningAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field ValueAnimator mRunningAnimator>
	//*   2    4:ifnull          19
		{
			mRunningAnimator.end();
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field ValueAnimator mRunningAnimator>
	//    5   11:invokevirtual   #65  <Method void ValueAnimator.end()>
			mRunningAnimator = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #31  <Field ValueAnimator mRunningAnimator>
		}
	//    9   19:return          
	}

	void setState(int ai[])
	{
		int i;
		int j;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		j = mTuples.size();
	//    2    3:aload_0         
	//    3    4:getfield        #27  <Field ArrayList mTuples>
	//    4    7:invokevirtual   #71  <Method int ArrayList.size()>
	//    5   10:istore_3        
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
_L8:
		Tuple tuple = ((Tuple) (obj));
	//    8   13:aload           5
	//    9   15:astore          4
		if(i >= j) goto _L2; else goto _L1
	//   10   17:iload_2         
	//   11   18:iload_3         
	//   12   19:icmpge          47
_L1:
		tuple = (Tuple)mTuples.get(i);
	//   13   22:aload_0         
	//   14   23:getfield        #27  <Field ArrayList mTuples>
	//   15   26:iload_2         
	//   16   27:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//   17   30:checkcast       #8   <Class StateListAnimator$Tuple>
	//   18   33:astore          4
		if(!StateSet.stateSetMatches(tuple.mSpecs, ai)) goto _L3; else goto _L2
	//   19   35:aload           4
	//   20   37:getfield        #79  <Field int[] StateListAnimator$Tuple.mSpecs>
	//   21   40:aload_1         
	//   22   41:invokestatic    #85  <Method boolean StateSet.stateSetMatches(int[], int[])>
	//   23   44:ifeq            57
_L2:
		if(tuple != mLastMatch) goto _L5; else goto _L4
	//   24   47:aload           4
	//   25   49:aload_0         
	//   26   50:getfield        #29  <Field StateListAnimator$Tuple mLastMatch>
	//   27   53:if_acmpne       64
_L4:
		return;
	//   28   56:return          
_L3:
		i++;
	//   29   57:iload_2         
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore_2        
		continue; /* Loop/switch isn't completed */
	//   33   61:goto            13
_L5:
		if(mLastMatch != null)
	//*  34   64:aload_0         
	//*  35   65:getfield        #29  <Field StateListAnimator$Tuple mLastMatch>
	//*  36   68:ifnull          75
			cancel();
	//   37   71:aload_0         
	//   38   72:invokespecial   #86  <Method void cancel()>
		mLastMatch = tuple;
	//   39   75:aload_0         
	//   40   76:aload           4
	//   41   78:putfield        #29  <Field StateListAnimator$Tuple mLastMatch>
		if(tuple == null) goto _L4; else goto _L6
	//   42   81:aload           4
	//   43   83:ifnull          56
_L6:
		start(tuple);
	//   44   86:aload_0         
	//   45   87:aload           4
	//   46   89:invokespecial   #88  <Method void start(StateListAnimator$Tuple)>
		return;
	//   47   92:return          
		if(true) goto _L8; else goto _L7
_L7:
	}

	private final android.animation.Animator.AnimatorListener mAnimationListener = new AnimatorListenerAdapter() {

		public void onAnimationEnd(Animator animator)
		{
			if(mRunningAnimator == animator)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field StateListAnimator this$0>
		//*   2    4:getfield        #22  <Field ValueAnimator StateListAnimator.mRunningAnimator>
		//*   3    7:aload_1         
		//*   4    8:if_acmpne       19
				mRunningAnimator = null;
		//    5   11:aload_0         
		//    6   12:getfield        #12  <Field StateListAnimator this$0>
		//    7   15:aconst_null     
		//    8   16:putfield        #22  <Field ValueAnimator StateListAnimator.mRunningAnimator>
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
	private Tuple mLastMatch;
	ValueAnimator mRunningAnimator;
	private final ArrayList mTuples = new ArrayList();
}
