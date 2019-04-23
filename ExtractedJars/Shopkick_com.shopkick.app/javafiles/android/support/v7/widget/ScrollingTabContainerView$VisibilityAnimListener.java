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
			animator = ((Animator) (ScrollingTabContainerView.this));
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field ScrollingTabContainerView this$0>
	//    6   12:astore_1        
			animator.mVisibilityAnim = null;
	//    7   13:aload_1         
	//    8   14:aconst_null     
	//    9   15:putfield        #30  <Field ViewPropertyAnimator ScrollingTabContainerView.mVisibilityAnim>
			((ScrollingTabContainerView) (animator)).setVisibility(mFinalVisibility);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #32  <Field int mFinalVisibility>
	//   13   23:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
			return;
	//   14   26:return          
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
