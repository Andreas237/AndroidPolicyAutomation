// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.transition.Transition;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			FragmentTransitionCompat21

static final class FragmentTransitionCompat21$5
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
	//*   1    1:getfield        #23  <Field Object val$enterTransition>
	//*   2    4:ifnull          19
			FragmentTransitionCompat21.replaceTargets(val$enterTransition, val$enteringViews, ((ArrayList) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field Object val$enterTransition>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field ArrayList val$enteringViews>
	//    7   15:aconst_null     
	//    8   16:invokestatic    #47  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
		if(val$exitTransition != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #27  <Field Object val$exitTransition>
	//*  11   23:ifnull          38
			FragmentTransitionCompat21.replaceTargets(val$exitTransition, val$exitingViews, ((ArrayList) (null)));
	//   12   26:aload_0         
	//   13   27:getfield        #27  <Field Object val$exitTransition>
	//   14   30:aload_0         
	//   15   31:getfield        #29  <Field ArrayList val$exitingViews>
	//   16   34:aconst_null     
	//   17   35:invokestatic    #47  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
		if(val$sharedElementTransition != null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #31  <Field Object val$sharedElementTransition>
	//*  20   42:ifnull          57
			FragmentTransitionCompat21.replaceTargets(val$sharedElementTransition, val$sharedElementsIn, ((ArrayList) (null)));
	//   21   45:aload_0         
	//   22   46:getfield        #31  <Field Object val$sharedElementTransition>
	//   23   49:aload_0         
	//   24   50:getfield        #33  <Field ArrayList val$sharedElementsIn>
	//   25   53:aconst_null     
	//   26   54:invokestatic    #47  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
	//   27   57:return          
	}

	final Object val$enterTransition;
	final ArrayList val$enteringViews;
	final Object val$exitTransition;
	final ArrayList val$exitingViews;
	final Object val$sharedElementTransition;
	final ArrayList val$sharedElementsIn;

	FragmentTransitionCompat21$5(Object obj, ArrayList arraylist, Object obj1, ArrayList arraylist1, Object obj2, ArrayList arraylist2)
	{
		val$enterTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Object val$enterTransition>
		val$enteringViews = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field ArrayList val$enteringViews>
		val$exitTransition = obj1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field Object val$exitTransition>
		val$exitingViews = arraylist1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field ArrayList val$exitingViews>
		val$sharedElementTransition = obj2;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #31  <Field Object val$sharedElementTransition>
		val$sharedElementsIn = arraylist2;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #33  <Field ArrayList val$sharedElementsIn>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #36  <Method void Object()>
	//   20   37:return          
	}
}
