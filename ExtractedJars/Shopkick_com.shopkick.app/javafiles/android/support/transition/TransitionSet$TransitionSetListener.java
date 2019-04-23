// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


// Referenced classes of package android.support.transition:
//			TransitionListenerAdapter, TransitionSet, Transition

static class TransitionSet$TransitionSetListener extends TransitionListenerAdapter
{

	public void onTransitionEnd(Transition transition)
	{
		TransitionSet transitionset = mTransitionSet;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TransitionSet mTransitionSet>
	//    2    4:astore_2        
		transitionset.mCurrentListeners = transitionset.mCurrentListeners - 1;
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:getfield        #24  <Field int TransitionSet.mCurrentListeners>
	//    6   10:iconst_1        
	//    7   11:isub            
	//    8   12:putfield        #24  <Field int TransitionSet.mCurrentListeners>
		if(mTransitionSet.mCurrentListeners == 0)
	//*   9   15:aload_0         
	//*  10   16:getfield        #16  <Field TransitionSet mTransitionSet>
	//*  11   19:getfield        #24  <Field int TransitionSet.mCurrentListeners>
	//*  12   22:ifne            39
		{
			TransitionSet transitionset1 = mTransitionSet;
	//   13   25:aload_0         
	//   14   26:getfield        #16  <Field TransitionSet mTransitionSet>
	//   15   29:astore_2        
			transitionset1.mStarted = false;
	//   16   30:aload_2         
	//   17   31:iconst_0        
	//   18   32:putfield        #28  <Field boolean TransitionSet.mStarted>
			transitionset1.end();
	//   19   35:aload_2         
	//   20   36:invokevirtual   #31  <Method void TransitionSet.end()>
		}
		transition.removeListener(((Transition.TransitionListener) (this)));
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:invokevirtual   #37  <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//   24   44:pop             
	//   25   45:return          
	}

	public void onTransitionStart(Transition transition)
	{
		if(!mTransitionSet.mStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field TransitionSet mTransitionSet>
	//*   2    4:getfield        #28  <Field boolean TransitionSet.mStarted>
	//*   3    7:ifne            25
		{
			mTransitionSet.start();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field TransitionSet mTransitionSet>
	//    6   14:invokevirtual   #42  <Method void TransitionSet.start()>
			mTransitionSet.mStarted = true;
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field TransitionSet mTransitionSet>
	//    9   21:iconst_1        
	//   10   22:putfield        #28  <Field boolean TransitionSet.mStarted>
		}
	//   11   25:return          
	}

	TransitionSet mTransitionSet;

	TransitionSet$TransitionSetListener(TransitionSet transitionset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TransitionListenerAdapter()>
		mTransitionSet = transitionset;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field TransitionSet mTransitionSet>
	//    5    9:return          
	}
}
