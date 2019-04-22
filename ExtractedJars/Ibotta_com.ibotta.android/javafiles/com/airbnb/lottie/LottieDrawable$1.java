// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.animation.ValueAnimator;

// Referenced classes of package com.airbnb.lottie:
//			LottieDrawable

class LottieDrawable$1
	implements android.animation.matorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		if(LottieDrawable.access$000(LottieDrawable.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field LottieDrawable this$0>
	//*   2    4:invokestatic    #24  <Method boolean LottieDrawable.access$000(LottieDrawable)>
	//*   3    7:ifeq            29
		{
			LottieDrawable.access$100(LottieDrawable.this).cancel();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field LottieDrawable this$0>
	//    6   14:invokestatic    #28  <Method ValueAnimator LottieDrawable.access$100(LottieDrawable)>
	//    7   17:invokevirtual   #33  <Method void ValueAnimator.cancel()>
			setProgress(1.0F);
	//    8   20:aload_0         
	//    9   21:getfield        #16  <Field LottieDrawable this$0>
	//   10   24:fconst_1        
	//   11   25:invokevirtual   #37  <Method void LottieDrawable.setProgress(float)>
			return;
	//   12   28:return          
		} else
		{
			setProgress(((Float)valueanimator.getAnimatedValue()).floatValue());
	//   13   29:aload_0         
	//   14   30:getfield        #16  <Field LottieDrawable this$0>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #41  <Method Object ValueAnimator.getAnimatedValue()>
	//   17   37:checkcast       #43  <Class Float>
	//   18   40:invokevirtual   #47  <Method float Float.floatValue()>
	//   19   43:invokevirtual   #37  <Method void LottieDrawable.setProgress(float)>
			return;
	//   20   46:return          
		}
	}

	final LottieDrawable this$0;

	LottieDrawable$1()
	{
		this$0 = LottieDrawable.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field LottieDrawable this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
