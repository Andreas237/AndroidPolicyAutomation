// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.v7.widget:
//			ActionBarOverlayLayout

class ActionBarOverlayLayout$1 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		animator = ((Animator) (ActionBarOverlayLayout.this));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ActionBarOverlayLayout this$0>
	//    2    4:astore_1        
		animator.mCurrentActionBarTopAnimator = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #22  <Field android.view.ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
		animator.mAnimatingForFling = false;
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:putfield        #26  <Field boolean ActionBarOverlayLayout.mAnimatingForFling>
	//    9   15:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		animator = ((Animator) (ActionBarOverlayLayout.this));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field ActionBarOverlayLayout this$0>
	//    2    4:astore_1        
		animator.mCurrentActionBarTopAnimator = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #22  <Field android.view.ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
		animator.mAnimatingForFling = false;
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:putfield        #26  <Field boolean ActionBarOverlayLayout.mAnimatingForFling>
	//    9   15:return          
	}

	final ActionBarOverlayLayout this$0;

	ActionBarOverlayLayout$1()
	{
		this$0 = ActionBarOverlayLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field ActionBarOverlayLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
