// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.v4.widget:
//			CircularProgressDrawable

class CircularProgressDrawable$1
	implements android.animation.eListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method Object ValueAnimator.getAnimatedValue()>
	//    2    4:checkcast       #34  <Class Float>
	//    3    7:invokevirtual   #38  <Method float Float.floatValue()>
	//    4   10:fstore_2        
		updateRingColor(f, val$ring);
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field CircularProgressDrawable this$0>
	//    7   15:fload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//   10   20:invokevirtual   #42  <Method void CircularProgressDrawable.updateRingColor(float, CircularProgressDrawable$Ring)>
		applyTransformation(f, val$ring, false);
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field CircularProgressDrawable this$0>
	//   13   27:fload_2         
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field CircularProgressDrawable$Ring val$ring>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #46  <Method void CircularProgressDrawable.applyTransformation(float, CircularProgressDrawable$Ring, boolean)>
		invalidateSelf();
	//   18   36:aload_0         
	//   19   37:getfield        #19  <Field CircularProgressDrawable this$0>
	//   20   40:invokevirtual   #49  <Method void CircularProgressDrawable.invalidateSelf()>
	//   21   43:return          
	}

	final CircularProgressDrawable this$0;
	final ng val$ring;

	CircularProgressDrawable$1()
	{
		this$0 = final_circularprogressdrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CircularProgressDrawable this$0>
		val$ring = ng.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CircularProgressDrawable$Ring val$ring>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
