// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


// Referenced classes of package android.support.transition:
//			TransitionListenerAdapter, TransitionSet, Transition

class TransitionSet$1 extends TransitionListenerAdapter
{

	public void onTransitionEnd(Transition transition)
	{
		val$nextTransition.runAnimators();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Transition val$nextTransition>
	//    2    4:invokevirtual   #28  <Method void Transition.runAnimators()>
		transition.removeListener(((itionListener) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #32  <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//    6   12:pop             
	//    7   13:return          
	}

	final TransitionSet this$0;
	final Transition val$nextTransition;

	TransitionSet$1()
	{
		this$0 = final_transitionset;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TransitionSet this$0>
		val$nextTransition = Transition.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Transition val$nextTransition>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void TransitionListenerAdapter()>
	//    8   14:return          
	}
}
