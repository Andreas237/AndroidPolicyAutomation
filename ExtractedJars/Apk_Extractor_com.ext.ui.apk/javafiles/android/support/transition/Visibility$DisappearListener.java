// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			Visibility, ViewUtils, ViewGroupUtils, Transition

private static class Visibility$DisappearListener extends AnimatorListenerAdapter
	implements useListenerCompat, 
{

	private void hideViewWhenNotCanceled()
	{
		if(!mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mCanceled>
	//*   2    4:ifne            32
		{
			ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field View mView>
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field int mFinalVisibility>
	//    7   15:invokestatic    #56  <Method void ViewUtils.setTransitionVisibility(View, int)>
			if(mParent != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #42  <Field ViewGroup mParent>
	//*  10   22:ifnull          32
				mParent.invalidate();
	//   11   25:aload_0         
	//   12   26:getfield        #42  <Field ViewGroup mParent>
	//   13   29:invokevirtual   #59  <Method void ViewGroup.invalidate()>
		}
		suppressLayout(false);
	//   14   32:aload_0         
	//   15   33:iconst_0        
	//   16   34:invokespecial   #48  <Method void suppressLayout(boolean)>
	//   17   37:return          
	}

	private void suppressLayout(boolean flag)
	{
		if(mSuppressLayout && mLayoutSuppressed != flag && mParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean mSuppressLayout>
	//*   2    4:ifeq            35
	//*   3    7:aload_0         
	//*   4    8:getfield        #61  <Field boolean mLayoutSuppressed>
	//*   5   11:iload_1         
	//*   6   12:icmpeq          35
	//*   7   15:aload_0         
	//*   8   16:getfield        #42  <Field ViewGroup mParent>
	//*   9   19:ifnull          35
		{
			mLayoutSuppressed = flag;
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:putfield        #61  <Field boolean mLayoutSuppressed>
			ViewGroupUtils.suppressLayout(mParent, flag);
	//   13   27:aload_0         
	//   14   28:getfield        #42  <Field ViewGroup mParent>
	//   15   31:iload_1         
	//   16   32:invokestatic    #66  <Method void ViewGroupUtils.suppressLayout(ViewGroup, boolean)>
		}
	//   17   35:return          
	}

	public void onAnimationCancel(Animator animator)
	{
		mCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #28  <Field boolean mCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		hideViewWhenNotCanceled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void hideViewWhenNotCanceled()>
	//    2    4:return          
	}

	public void onAnimationPause(Animator animator)
	{
		if(!mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mCanceled>
	//*   2    4:ifne            18
			ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field View mView>
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field int mFinalVisibility>
	//    7   15:invokestatic    #56  <Method void ViewUtils.setTransitionVisibility(View, int)>
	//    8   18:return          
	}

	public void onAnimationRepeat(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationResume(Animator animator)
	{
		if(!mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean mCanceled>
	//*   2    4:ifne            15
			ViewUtils.setTransitionVisibility(mView, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field View mView>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #56  <Method void ViewUtils.setTransitionVisibility(View, int)>
	//    7   15:return          
	}

	public void onAnimationStart(Animator animator)
	{
	//    0    0:return          
	}

	public void onTransitionCancel(Transition transition)
	{
	//    0    0:return          
	}

	public void onTransitionEnd(Transition transition)
	{
		hideViewWhenNotCanceled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void hideViewWhenNotCanceled()>
		transition.removeListener((() (this)));
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #86  <Method Transition Transition.removeListener(Transition$TransitionListener)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void onTransitionPause(Transition transition)
	{
		suppressLayout(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #48  <Method void suppressLayout(boolean)>
	//    3    5:return          
	}

	public void onTransitionResume(Transition transition)
	{
		suppressLayout(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #48  <Method void suppressLayout(boolean)>
	//    3    5:return          
	}

	public void onTransitionStart(Transition transition)
	{
	//    0    0:return          
	}

	boolean mCanceled;
	private final int mFinalVisibility;
	private boolean mLayoutSuppressed;
	private final ViewGroup mParent;
	private final boolean mSuppressLayout;
	private final View mView;

	Visibility$DisappearListener(View view, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void AnimatorListenerAdapter()>
		mCanceled = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean mCanceled>
		mView = view;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field View mView>
		mFinalVisibility = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #32  <Field int mFinalVisibility>
		mParent = (ViewGroup)view.getParent();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #38  <Method android.view.ViewParent View.getParent()>
	//   14   24:checkcast       #40  <Class ViewGroup>
	//   15   27:putfield        #42  <Field ViewGroup mParent>
		mSuppressLayout = flag;
	//   16   30:aload_0         
	//   17   31:iload_3         
	//   18   32:putfield        #44  <Field boolean mSuppressLayout>
		suppressLayout(true);
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:invokespecial   #48  <Method void suppressLayout(boolean)>
	//   22   40:return          
	}
}
