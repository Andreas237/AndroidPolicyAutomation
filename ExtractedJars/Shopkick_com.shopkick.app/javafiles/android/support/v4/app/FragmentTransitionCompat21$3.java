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
		transition = ((Transition) (val$enterTransition));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object val$enterTransition>
	//    2    4:astore_1        
		if(transition != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
			replaceTargets(((Object) (transition)), val$enteringViews, ((ArrayList) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field FragmentTransitionCompat21 this$0>
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #29  <Field ArrayList val$enteringViews>
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
		transition = ((Transition) (val$exitTransition));
	//   12   22:aload_0         
	//   13   23:getfield        #31  <Field Object val$exitTransition>
	//   14   26:astore_1        
		if(transition != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          44
			replaceTargets(((Object) (transition)), val$exitingViews, ((ArrayList) (null)));
	//   17   31:aload_0         
	//   18   32:getfield        #25  <Field FragmentTransitionCompat21 this$0>
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #33  <Field ArrayList val$exitingViews>
	//   22   40:aconst_null     
	//   23   41:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
		transition = ((Transition) (val$sharedElementTransition));
	//   24   44:aload_0         
	//   25   45:getfield        #35  <Field Object val$sharedElementTransition>
	//   26   48:astore_1        
		if(transition != null)
	//*  27   49:aload_1         
	//*  28   50:ifnull          66
			replaceTargets(((Object) (transition)), val$sharedElementsIn, ((ArrayList) (null)));
	//   29   53:aload_0         
	//   30   54:getfield        #25  <Field FragmentTransitionCompat21 this$0>
	//   31   57:aload_1         
	//   32   58:aload_0         
	//   33   59:getfield        #37  <Field ArrayList val$sharedElementsIn>
	//   34   62:aconst_null     
	//   35   63:invokevirtual   #51  <Method void FragmentTransitionCompat21.replaceTargets(Object, ArrayList, ArrayList)>
	//   36   66:return          
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
