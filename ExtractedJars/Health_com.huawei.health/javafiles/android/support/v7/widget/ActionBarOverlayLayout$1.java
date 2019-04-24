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
		mCurrentActionBarTopAnimator = null;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//    2    4:aconst_null     
	//    3    5:putfield        #22  <Field android.view.ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
		mAnimatingForFling = false;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//    6   12:iconst_0        
	//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.mAnimatingForFling>
	//    8   16:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		mCurrentActionBarTopAnimator = null;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//    2    4:aconst_null     
	//    3    5:putfield        #22  <Field android.view.ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
		mAnimatingForFling = false;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//    6   12:iconst_0        
	//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.mAnimatingForFling>
	//    8   16:return          
	}

	final ActionBarOverlayLayout this$0;

	ActionBarOverlayLayout$1()
	{
		this$0 = ActionBarOverlayLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ActionBarOverlayLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
