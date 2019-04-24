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
		j = mTuples.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ArrayList mTuples>
	//    2    4:invokevirtual   #71  <Method int ArrayList.size()>
	//    3    7:istore_3        
		i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_2        
_L5:
		Tuple tuple;
		if(i >= j)
			break MISSING_BLOCK_LABEL_85;
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:icmpge          85
		tuple = (Tuple)mTuples.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field ArrayList mTuples>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #75  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #8   <Class StateListAnimator$Tuple>
	//   14   26:astore          4
		if(!StateSet.stateSetMatches(tuple.mSpecs, ai)) goto _L2; else goto _L1
	//   15   28:aload           4
	//   16   30:getfield        #79  <Field int[] StateListAnimator$Tuple.mSpecs>
	//   17   33:aload_1         
	//   18   34:invokestatic    #85  <Method boolean StateSet.stateSetMatches(int[], int[])>
	//   19   37:ifeq            52
_L1:
		ai = ((int []) (tuple));
	//   20   40:aload           4
	//   21   42:astore_1        
_L7:
		if(ai != mLastMatch) goto _L4; else goto _L3
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #29  <Field StateListAnimator$Tuple mLastMatch>
	//   25   48:if_acmpne       59
_L3:
		return;
	//   26   51:return          
_L2:
		i++;
	//   27   52:iload_2         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_2        
		  goto _L5
	//*  31   56:goto            10
_L4:
		if(mLastMatch != null)
	//*  32   59:aload_0         
	//*  33   60:getfield        #29  <Field StateListAnimator$Tuple mLastMatch>
	//*  34   63:ifnull          70
			cancel();
	//   35   66:aload_0         
	//   36   67:invokespecial   #86  <Method void cancel()>
		mLastMatch = ((Tuple) (ai));
	//   37   70:aload_0         
	//   38   71:aload_1         
	//   39   72:putfield        #29  <Field StateListAnimator$Tuple mLastMatch>
		if(ai == null) goto _L3; else goto _L6
	//   40   75:aload_1         
	//   41   76:ifnull          51
_L6:
		start(((Tuple) (ai)));
	//   42   79:aload_0         
	//   43   80:aload_1         
	//   44   81:invokespecial   #88  <Method void start(StateListAnimator$Tuple)>
		return;
	//   45   84:return          
		ai = null;
	//   46   85:aconst_null     
	//   47   86:astore_1        
		  goto _L7
	//*  48   87:goto            43
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
