// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			TransitionListenerAdapter, ChangeBounds, ViewGroupUtils, Transition

class ChangeBounds$9 extends TransitionListenerAdapter
{

	public void onTransitionCancel(Transition transition)
	{
		ViewGroupUtils.suppressLayout(val$parent, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroup val$parent>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
		mCanceled = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #26  <Field boolean mCanceled>
	//    7   13:return          
	}

	public void onTransitionEnd(Transition transition)
	{
		if(!mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean mCanceled>
	//*   2    4:ifne            15
			ViewGroupUtils.suppressLayout(val$parent, false);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field ViewGroup val$parent>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
		transition.removeListener(((sitionListener) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #44  <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void onTransitionPause(Transition transition)
	{
		ViewGroupUtils.suppressLayout(val$parent, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroup val$parent>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
	//    4    8:return          
	}

	public void onTransitionResume(Transition transition)
	{
		ViewGroupUtils.suppressLayout(val$parent, true);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroup val$parent>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #36  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
	//    4    8:return          
	}

	boolean mCanceled;
	final ChangeBounds this$0;
	final ViewGroup val$parent;

	ChangeBounds$9()
	{
		this$0 = final_changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ChangeBounds this$0>
		val$parent = ViewGroup.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ViewGroup val$parent>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void TransitionListenerAdapter()>
		mCanceled = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean mCanceled>
	//   11   19:return          
	}
}
