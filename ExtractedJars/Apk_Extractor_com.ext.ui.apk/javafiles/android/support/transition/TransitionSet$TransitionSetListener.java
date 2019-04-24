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
		int _tmp = TransitionSet.access$106(mTransitionSet);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TransitionSet mTransitionSet>
	//    2    4:invokestatic    #24  <Method int TransitionSet.access$106(TransitionSet)>
	//    3    7:pop             
		if(TransitionSet.access$100(mTransitionSet) == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field TransitionSet mTransitionSet>
	//*   6   12:invokestatic    #27  <Method int TransitionSet.access$100(TransitionSet)>
	//*   7   15:ifne            34
		{
			TransitionSet.access$002(mTransitionSet, false);
	//    8   18:aload_0         
	//    9   19:getfield        #16  <Field TransitionSet mTransitionSet>
	//   10   22:iconst_0        
	//   11   23:invokestatic    #31  <Method boolean TransitionSet.access$002(TransitionSet, boolean)>
	//   12   26:pop             
			mTransitionSet.end();
	//   13   27:aload_0         
	//   14   28:getfield        #16  <Field TransitionSet mTransitionSet>
	//   15   31:invokevirtual   #34  <Method void TransitionSet.end()>
		}
		transition.removeListener(((Transition.TransitionListener) (this)));
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #40  <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//   19   39:pop             
	//   20   40:return          
	}

	public void onTransitionStart(Transition transition)
	{
		if(!TransitionSet.access$000(mTransitionSet))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field TransitionSet mTransitionSet>
	//*   2    4:invokestatic    #46  <Method boolean TransitionSet.access$000(TransitionSet)>
	//*   3    7:ifne            26
		{
			mTransitionSet.start();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field TransitionSet mTransitionSet>
	//    6   14:invokevirtual   #49  <Method void TransitionSet.start()>
			TransitionSet.access$002(mTransitionSet, true);
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field TransitionSet mTransitionSet>
	//    9   21:iconst_1        
	//   10   22:invokestatic    #31  <Method boolean TransitionSet.access$002(TransitionSet, boolean)>
	//   11   25:pop             
		}
	//   12   26:return          
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
