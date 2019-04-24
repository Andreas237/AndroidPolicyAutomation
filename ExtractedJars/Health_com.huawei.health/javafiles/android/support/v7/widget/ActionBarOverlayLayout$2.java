// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v7.widget:
//			ActionBarOverlayLayout, ActionBarContainer

class ActionBarOverlayLayout$2
	implements Runnable
{

	public void run()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ActionBarOverlayLayout this$0>
	//    2    4:invokevirtual   #22  <Method void ActionBarOverlayLayout.haltActionBarHideOffsetAnimations()>
		mCurrentActionBarTopAnimator = mActionBarTop.animate().translationY(0.0F).setListener(((android.animation.) (mTopAnimatorListener)));
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ActionBarOverlayLayout this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field ActionBarOverlayLayout this$0>
	//    7   15:getfield        #26  <Field ActionBarContainer ActionBarOverlayLayout.mActionBarTop>
	//    8   18:invokevirtual   #32  <Method ViewPropertyAnimator ActionBarContainer.animate()>
	//    9   21:fconst_0        
	//   10   22:invokevirtual   #38  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   11   25:aload_0         
	//   12   26:getfield        #14  <Field ActionBarOverlayLayout this$0>
	//   13   29:getfield        #42  <Field android.animation.AnimatorListenerAdapter ActionBarOverlayLayout.mTopAnimatorListener>
	//   14   32:invokevirtual   #46  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   15   35:putfield        #50  <Field ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
	//   16   38:return          
	}

	final ActionBarOverlayLayout this$0;

	ActionBarOverlayLayout$2()
	{
		this$0 = ActionBarOverlayLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActionBarOverlayLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
