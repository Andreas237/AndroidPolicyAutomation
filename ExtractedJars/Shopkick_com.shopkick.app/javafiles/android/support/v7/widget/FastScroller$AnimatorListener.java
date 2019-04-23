// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.*;

// Referenced classes of package android.support.v7.widget:
//			FastScroller

private class FastScroller$AnimatorListener extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		mCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #20  <Field boolean mCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(mCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean mCanceled>
	//*   2    4:ifeq            13
		{
			mCanceled = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #20  <Field boolean mCanceled>
			return;
	//    6   12:return          
		}
		if(((Float)mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0F)
	//*   7   13:aload_0         
	//*   8   14:getfield        #15  <Field FastScroller this$0>
	//*   9   17:getfield        #28  <Field ValueAnimator FastScroller.mShowHideAnimator>
	//*  10   20:invokevirtual   #34  <Method Object ValueAnimator.getAnimatedValue()>
	//*  11   23:checkcast       #36  <Class Float>
	//*  12   26:invokevirtual   #40  <Method float Float.floatValue()>
	//*  13   29:fconst_0        
	//*  14   30:fcmpl           
	//*  15   31:ifne            50
		{
			animator = ((Animator) (FastScroller.this));
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field FastScroller this$0>
	//   18   38:astore_1        
			animator.mAnimationState = 0;
	//   19   39:aload_1         
	//   20   40:iconst_0        
	//   21   41:putfield        #44  <Field int FastScroller.mAnimationState>
			((FastScroller) (animator)).setState(0);
	//   22   44:aload_1         
	//   23   45:iconst_0        
	//   24   46:invokevirtual   #48  <Method void FastScroller.setState(int)>
			return;
	//   25   49:return          
		} else
		{
			animator = ((Animator) (FastScroller.this));
	//   26   50:aload_0         
	//   27   51:getfield        #15  <Field FastScroller this$0>
	//   28   54:astore_1        
			animator.mAnimationState = 2;
	//   29   55:aload_1         
	//   30   56:iconst_2        
	//   31   57:putfield        #44  <Field int FastScroller.mAnimationState>
			((FastScroller) (animator)).requestRedraw();
	//   32   60:aload_1         
	//   33   61:invokevirtual   #51  <Method void FastScroller.requestRedraw()>
			return;
	//   34   64:return          
		}
	}

	private boolean mCanceled;
	final FastScroller this$0;

	FastScroller$AnimatorListener()
	{
		this$0 = FastScroller.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FastScroller this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
		mCanceled = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #20  <Field boolean mCanceled>
	//    8   14:return          
	}
}
