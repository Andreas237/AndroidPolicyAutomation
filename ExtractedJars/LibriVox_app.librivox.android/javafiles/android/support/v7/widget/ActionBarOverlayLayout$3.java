// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v7.widget:
//			ActionBarOverlayLayout, ActionBarContainer

class ActionBarOverlayLayout$3
	implements Runnable
{

	public void run()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//    2    4:invokevirtual   #22  <Method void ActionBarOverlayLayout.haltActionBarHideOffsetAnimations()>
		ActionBarOverlayLayout actionbaroverlaylayout = ActionBarOverlayLayout.this;
	//    3    7:aload_0         
	//    4    8:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//    5   11:astore_1        
		actionbaroverlaylayout.mCurrentActionBarTopAnimator = actionbaroverlaylayout.mActionBarTop.animate().translationY(-mActionBarTop.getHeight()).setListener(((android.animation.) (mTopAnimatorListener)));
	//    6   12:aload_1         
	//    7   13:aload_1         
	//    8   14:getfield        #26  <Field ActionBarContainer ActionBarOverlayLayout.mActionBarTop>
	//    9   17:invokevirtual   #32  <Method ViewPropertyAnimator ActionBarContainer.animate()>
	//   10   20:aload_0         
	//   11   21:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//   12   24:getfield        #26  <Field ActionBarContainer ActionBarOverlayLayout.mActionBarTop>
	//   13   27:invokevirtual   #36  <Method int ActionBarContainer.getHeight()>
	//   14   30:ineg            
	//   15   31:i2f             
	//   16   32:invokevirtual   #42  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   17   35:aload_0         
	//   18   36:getfield        #12  <Field ActionBarOverlayLayout this$0>
	//   19   39:getfield        #46  <Field android.animation.AnimatorListenerAdapter ActionBarOverlayLayout.mTopAnimatorListener>
	//   20   42:invokevirtual   #50  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   21   45:putfield        #54  <Field ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
	//   22   48:return          
	}

	final ActionBarOverlayLayout this$0;

	ActionBarOverlayLayout$3()
	{
		this$0 = ActionBarOverlayLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ActionBarOverlayLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
