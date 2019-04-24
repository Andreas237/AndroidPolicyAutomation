// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.transition.Transition;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21

class FragmentTransitionCompat21$3
	implements android.transition.
{

	public void onTransitionCancel(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionEnd(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionPause(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionResume(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionStart(Transition transition)
	{
		if(val$enterTransition != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object val$enterTransition>
	//*   2    4:ifnull          23
			replaceTargets(val$enterTransition, val$enteringViews, ((ArrayList) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field FragmentTransitionCompat21 this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field Object val$enterTransition>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field ArrayList val$enteringViews>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
		if(val$exitTransition != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #31  <Field Object val$exitTransition>
	//*  13   27:ifnull          46
			replaceTargets(val$exitTransition, val$exitingViews, ((ArrayList) (null)));
	//   14   30:aload_0         
	//   15   31:getfield        #25  <Field FragmentTransitionCompat21 this$0>
	//   16   34:aload_0         
	//   17   35:getfield        #31  <Field Object val$exitTransition>
	//   18   38:aload_0         
	//   19   39:getfield        #33  <Field ArrayList val$exitingViews>
	//   20   42:aconst_null     
	//   21   43:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
		if(val$sharedElementTransition != null)
	//*  22   46:aload_0         
	//*  23   47:getfield        #35  <Field Object val$sharedElementTransition>
	//*  24   50:ifnull          69
			replaceTargets(val$sharedElementTransition, val$sharedElementsIn, ((ArrayList) (null)));
	//   25   53:aload_0         
	//   26   54:getfield        #25  <Field FragmentTransitionCompat21 this$0>
	//   27   57:aload_0         
	//   28   58:getfield        #35  <Field Object val$sharedElementTransition>
	//   29   61:aload_0         
	//   30   62:getfield        #37  <Field ArrayList val$sharedElementsIn>
	//   31   65:aconst_null     
	//   32   66:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
	//   33   69:return          
	}

	final FragmentTransitionCompat21 this$0;
	final Object val$enterTransition;
	final ArrayList val$enteringViews;
	final Object val$exitTransition;
	final ArrayList val$exitingViews;
	final Object val$sharedElementTransition;
	final ArrayList val$sharedElementsIn;

	FragmentTransitionCompat21$3()
	{
		this$0 = final_fragmenttransitioncompat21;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field FragmentTransitionCompat21 this$0>
		val$enterTransition = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field Object val$enterTransition>
		val$enteringViews = arraylist;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field ArrayList val$enteringViews>
		val$exitTransition = obj1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #31  <Field Object val$exitTransition>
		val$exitingViews = arraylist1;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #33  <Field ArrayList val$exitingViews>
		val$sharedElementTransition = obj2;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #35  <Field Object val$sharedElementTransition>
		val$sharedElementsIn = ArrayList.this;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #37  <Field ArrayList val$sharedElementsIn>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #40  <Method void Object()>
	//   23   43:return          
	}
}
