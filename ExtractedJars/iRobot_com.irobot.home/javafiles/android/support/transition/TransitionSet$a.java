// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


// Referenced classes of package android.support.transition:
//			ad, TransitionSet, Transition

static class TransitionSet$a extends ad
{

	public void a(Transition transition)
	{
		TransitionSet.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TransitionSet a>
	//    2    4:invokestatic    #21  <Method int TransitionSet.b(TransitionSet)>
	//    3    7:pop             
		if(TransitionSet.c(a) == 0)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field TransitionSet a>
	//*   6   12:invokestatic    #24  <Method int TransitionSet.c(TransitionSet)>
	//*   7   15:ifne            34
		{
			TransitionSet.a(a, false);
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field TransitionSet a>
	//   10   22:iconst_0        
	//   11   23:invokestatic    #27  <Method boolean TransitionSet.a(TransitionSet, boolean)>
	//   12   26:pop             
			a.g();
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field TransitionSet a>
	//   15   31:invokevirtual   #30  <Method void TransitionSet.g()>
		}
		transition.b(((Transition.c) (this)));
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #35  <Method Transition Transition.b(Transition$c)>
	//   19   39:pop             
	//   20   40:return          
	}

	public void d(Transition transition)
	{
		if(!TransitionSet.a(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field TransitionSet a>
	//*   2    4:invokestatic    #39  <Method boolean TransitionSet.a(TransitionSet)>
	//*   3    7:ifne            26
		{
			a.f();
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field TransitionSet a>
	//    6   14:invokevirtual   #42  <Method void TransitionSet.f()>
			TransitionSet.a(a, true);
	//    7   17:aload_0         
	//    8   18:getfield        #15  <Field TransitionSet a>
	//    9   21:iconst_1        
	//   10   22:invokestatic    #27  <Method boolean TransitionSet.a(TransitionSet, boolean)>
	//   11   25:pop             
		}
	//   12   26:return          
	}

	TransitionSet a;

	TransitionSet$a(TransitionSet transitionset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ad()>
		a = transitionset;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field TransitionSet a>
	//    5    9:return          
	}
}
