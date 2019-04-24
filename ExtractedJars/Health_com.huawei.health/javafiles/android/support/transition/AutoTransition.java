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
		setOrdering(1);
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #12  <Method TransitionSet setOrdering(int)>
	//    5    9:pop             
		addTransition(((Transition) (new Fade(2)))).addTransition(((Transition) (new ChangeBounds()))).addTransition(((Transition) (new Fade(1))));
	//    6   10:aload_0         
	//    7   11:new             #14  <Class Fade>
	//    8   14:dup             
	//    9   15:iconst_2        
	//   10   16:invokespecial   #17  <Method void Fade(int)>
	//   11   19:invokevirtual   #21  <Method TransitionSet addTransition(Transition)>
	//   12   22:new             #23  <Class ChangeBounds>
	//   13   25:dup             
	//   14   26:invokespecial   #24  <Method void ChangeBounds()>
	//   15   29:invokevirtual   #25  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   16   32:new             #14  <Class Fade>
	//   17   35:dup             
	//   18   36:iconst_1        
	//   19   37:invokespecial   #17  <Method void Fade(int)>
	//   20   40:invokevirtual   #25  <Method TransitionSet TransitionSet.addTransition(Transition)>
	//   21   43:pop             
	//   22   44:return          
	}
}
