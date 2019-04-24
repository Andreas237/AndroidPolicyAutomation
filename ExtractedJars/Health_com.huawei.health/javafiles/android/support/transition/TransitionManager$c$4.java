// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

// Referenced classes of package android.support.transition:
//			TransitionManager, Transition

class TransitionManager$c$4 extends istenerAdapter
{

	public void onTransitionEnd(Transition transition)
	{
		((ArrayList)a.get(((Object) (e.c)))).remove(((Object) (transition)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ArrayMap a>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field TransitionManager$c e>
	//    4    8:getfield        #32  <Field android.view.ViewGroup TransitionManager$c.c>
	//    5   11:invokevirtual   #38  <Method Object ArrayMap.get(Object)>
	//    6   14:checkcast       #40  <Class ArrayList>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #44  <Method boolean ArrayList.remove(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	final ArrayMap a;
	final TransitionManager.c e;

	TransitionManager$c$4(TransitionManager.c c1, ArrayMap arraymap)
	{
		e = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field TransitionManager$c e>
		a = arraymap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field ArrayMap a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Transition$TransitionListenerAdapter()>
	//    8   14:return          
	}
}
