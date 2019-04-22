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
		shadowDrawable.setShadowSize(shadowSizeEnd);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    2    4:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.shadowDrawable>
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field float shadowSizeEnd>
	//    5   11:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
		validValues = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #45  <Field boolean validValues>
	//    9   19:return          
	}

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		if(!validValues)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean validValues>
	//*   2    4:ifne            34
		{
			shadowSizeStart = shadowDrawable.getShadowSize();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//    6   12:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.shadowDrawable>
	//    7   15:invokevirtual   #50  <Method float ShadowDrawableWrapper.getShadowSize()>
	//    8   18:putfield        #52  <Field float shadowSizeStart>
			shadowSizeEnd = getTargetShadowSize();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #54  <Method float getTargetShadowSize()>
	//   12   26:putfield        #37  <Field float shadowSizeEnd>
			validValues = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #45  <Field boolean validValues>
		}
		ShadowDrawableWrapper shadowdrawablewrapper = shadowDrawable;
	//   16   34:aload_0         
	//   17   35:getfield        #20  <Field FloatingActionButtonImpl this$0>
	//   18   38:getfield        #35  <Field ShadowDrawableWrapper FloatingActionButtonImpl.shadowDrawable>
	//   19   41:astore_3        
		float f = shadowSizeStart;
	//   20   42:aload_0         
	//   21   43:getfield        #52  <Field float shadowSizeStart>
	//   22   46:fstore_2        
		shadowdrawablewrapper.setShadowSize(f + (shadowSizeEnd - f) * valueanimator.getAnimatedFraction());
	//   23   47:aload_3         
	//   24   48:fload_2         
	//   25   49:aload_0         
	//   26   50:getfield        #37  <Field float shadowSizeEnd>
	//   27   53:fload_2         
	//   28   54:fsub            
	//   29   55:aload_1         
	//   30   56:invokevirtual   #59  <Method float ValueAnimator.getAnimatedFraction()>
	//   31   59:fmul            
	//   32   60:fadd            
	//   33   61:invokevirtual   #43  <Method void ShadowDrawableWrapper.setShadowSize(float)>
	//   34   64:return          
	}

	private float shadowSizeEnd;
	private float shadowSizeStart;
	final FloatingActionButtonImpl this$0;
	private boolean validValues;

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
