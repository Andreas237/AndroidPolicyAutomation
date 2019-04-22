// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


// Referenced classes of package android.support.transition:
//			TransitionSet, Fade, ChangeBounds

public class AutoTransition extends TransitionSet
{

	public AutoTransition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void TransitionSet()>
		init();
	//    2    4:aload_0         
	//    3    5:invokespecial   #11  <Method void init()>
	//    4    8:return          
	}

	private void init()
	{
		setOrdering(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #16  <Method TransitionSet setOrdering(int)>
	//    3    5:pop             
		addTransition(((Transition) (new Fade(2)))).addTransition(((Transition) (new ChangeBounds()))).addTransition(((Transition) (new Fade(1))));
	//    4    6:aload_0         
	//    5    7:new             #18  <Class Fade>
	//    6   10:dup             
	//    7   11:iconst_2        
	//    8   12:invokespecial   #21  <Method void Fade(int)>
	//    9   15:invokevirtual   #25  <Method TransitionSet addTransition(Transition)>
	//   10   18:new             #27  <Class ChangeBounds>
	//   11   21:dup             
	//   12   22:invokespecial   #28  <Method void ChangeBounds()>
	//   13   25:invokevirtual   #29  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   14   28:new             #18  <Class Fade>
	//   15   31:dup             
	//   16   32:iconst_1        
	//   17   33:invokespecial   #21  <Method void Fade(int)>
	//   18   36:invokevirtual   #29  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   19   39:pop             
	//   20   40:return          
	}
}
