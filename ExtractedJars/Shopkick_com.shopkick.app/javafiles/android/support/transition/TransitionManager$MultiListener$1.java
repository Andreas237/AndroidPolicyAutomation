// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			TransitionListenerAdapter, TransitionManager, Transition

class TransitionManager$MultiListener$1 extends TransitionListenerAdapter
{

	public void onTransitionEnd(Transition transition)
	{
		((ArrayList)val$runningTransitions.get(((Object) (mSceneRoot)))).remove(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ArrayMap val$runningTransitions>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field TransitionManager$MultiListener this$0>
	//    4    8:getfield        #33  <Field android.view.ViewGroup TransitionManager$MultiListener.mSceneRoot>
	//    5   11:invokevirtual   #39  <Method Object ArrayMap.get(Object)>
	//    6   14:checkcast       #41  <Class ArrayList>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #45  <Method boolean ArrayList.remove(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	final TransitionManager.MultiListener this$0;
	final ArrayMap val$runningTransitions;

	TransitionManager$MultiListener$1()
	{
		this$0 = final_multilistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field TransitionManager$MultiListener this$0>
		val$runningTransitions = ArrayMap.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ArrayMap val$runningTransitions>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void TransitionListenerAdapter()>
	//    8   14:return          
	}
}
