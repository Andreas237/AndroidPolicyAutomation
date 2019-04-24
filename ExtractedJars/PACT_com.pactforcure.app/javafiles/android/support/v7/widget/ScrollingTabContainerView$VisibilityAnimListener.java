// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView

protected class ScrollingTabContainerView$VisibilityAnimListener extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		mCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #22  <Field boolean mCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean mCanceled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			mVisibilityAnim = null;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field ScrollingTabContainerView this$0>
	//    6   12:aconst_null     
	//    7   13:putfield        #30  <Field ViewPropertyAnimator ScrollingTabContainerView.mVisibilityAnim>
			setVisibility(mFinalVisibility);
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field ScrollingTabContainerView this$0>
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field int mFinalVisibility>
	//   12   24:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
			return;
	//   13   27:return          
		}
	}

	public void onAnimationStart(Animator animator)
	{
		setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ScrollingTabContainerView this$0>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
		mCanceled = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #22  <Field boolean mCanceled>
	//    7   13:return          
	}

	public ScrollingTabContainerView$VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator viewpropertyanimator, int i)
	{
		mFinalVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #32  <Field int mFinalVisibility>
		mVisibilityAnim = viewpropertyanimator;
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field ScrollingTabContainerView this$0>
	//    5    9:aload_1         
	//    6   10:putfield        #30  <Field ViewPropertyAnimator ScrollingTabContainerView.mVisibilityAnim>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	private boolean mCanceled;
	private int mFinalVisibility;
	final ScrollingTabContainerView this$0;

	protected ScrollingTabContainerView$VisibilityAnimListener()
	{
		this$0 = ScrollingTabContainerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ScrollingTabContainerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void AnimatorListenerAdapter()>
		mCanceled = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field boolean mCanceled>
	//    8   14:return          
	}
}
