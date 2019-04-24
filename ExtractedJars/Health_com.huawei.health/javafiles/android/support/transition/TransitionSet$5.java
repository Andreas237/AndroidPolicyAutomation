// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


// Referenced classes of package android.support.transition:
//			TransitionSet, Transition

class TransitionSet$5 extends itionListenerAdapter
{

	public void onTransitionEnd(Transition transition)
	{
		d.runAnimators();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Transition d>
	//    2    4:invokevirtual   #28  <Method void Transition.runAnimators()>
		transition.removeListener(((itionListener) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #32  <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//    6   12:pop             
	//    7   13:return          
	}

	final TransitionSet c;
	final Transition d;

	TransitionSet$5(TransitionSet transitionset, Transition transition)
	{
		c = transitionset;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TransitionSet c>
		d = transition;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Transition d>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Transition$TransitionListenerAdapter()>
	//    8   14:return          
	}
}
