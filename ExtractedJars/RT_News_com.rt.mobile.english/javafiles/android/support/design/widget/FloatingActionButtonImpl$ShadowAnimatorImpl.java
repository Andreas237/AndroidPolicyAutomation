// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;

// Referenced classes of package android.support.design.widget:
//			FloatingActionButtonImpl, ShadowDrawableWrapper

private abstract class FloatingActionButtonImpl$ShadowAnimatorImpl extends AnimatorListenerAdapter
	implements android.animation.ValueAnimator.AnimatorUpdateListener
{

	protected abstract float getTargetShadowSize();

	public void onAnimationEnd(Animator animator)
	{
		mShadowDrawable.setShadowSize(mShadowSizeEnd);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    2    4:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.mShadowDrawable>
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field float mShadowSizeEnd>
	//    5   11:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
		mValidValues = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #45  <Field boolean mValidValues>
	//    9   19:return          
	}

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		if(!mValidValues)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mValidValues>
	//*   2    4:ifne            34
		{
			mShadowSizeStart = mShadowDrawable.getShadowSize();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    6   12:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.mShadowDrawable>
	//    7   15:invokevirtual   #50  <Method float ShadowDrawableWrapper.getShadowSize()>
	//    8   18:putfield        #52  <Field float mShadowSizeStart>
			mShadowSizeEnd = getTargetShadowSize();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #54  <Method float getTargetShadowSize()>
	//   12   26:putfield        #37  <Field float mShadowSizeEnd>
			mValidValues = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #45  <Field boolean mValidValues>
		}
		mShadowDrawable.setShadowSize(mShadowSizeStart + (mShadowSizeEnd - mShadowSizeStart) * valueanimator.getAnimatedFraction());
	//   16   34:aload_0         
	//   17   35:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//   18   38:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.mShadowDrawable>
	//   19   41:aload_0         
	//   20   42:getfield        #52  <Field float mShadowSizeStart>
	//   21   45:aload_0         
	//   22   46:getfield        #37  <Field float mShadowSizeEnd>
	//   23   49:aload_0         
	//   24   50:getfield        #52  <Field float mShadowSizeStart>
	//   25   53:fsub            
	//   26   54:aload_1         
	//   27   55:invokevirtual   #59  <Method float ValueAnimator.getAnimatedFraction()>
	//   28   58:fmul            
	//   29   59:fadd            
	//   30   60:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
	//   31   63:return          
	}

	private float mShadowSizeEnd;
	private float mShadowSizeStart;
	private boolean mValidValues;
	final FloatingActionButtonImpl this$0;

	private FloatingActionButtonImpl$ShadowAnimatorImpl()
	{
		this$0 = FloatingActionButtonImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field FloatingActionButtonImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}

	FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void FloatingActionButtonImpl$ShadowAnimatorImpl(FloatingActionButtonImpl)>
	//    3    5:return          
	}
}
