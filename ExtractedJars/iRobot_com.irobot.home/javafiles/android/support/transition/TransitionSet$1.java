// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


// Referenced classes of package android.support.transition:
//			ad, TransitionSet, Transition

class TransitionSet$1 extends ad
{

	public void a(Transition transition)
	{
		a.e();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Transition a>
	//    2    4:invokevirtual   #26  <Method void Transition.e()>
		transition.b(((Transition.c) (this)));
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #29  <Method Transition Transition.b(Transition$c)>
	//    6   12:pop             
	//    7   13:return          
	}

	final Transition a;
	final TransitionSet b;

	TransitionSet$1(TransitionSet transitionset, Transition transition)
	{
		b = transitionset;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TransitionSet b>
		a = transition;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Transition a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void ad()>
	//    8   14:return          
	}
}
