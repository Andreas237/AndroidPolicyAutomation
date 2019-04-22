// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			AnimatableValue, SplitDimensionPathKeyframeAnimation, AnimatableFloatValue, BaseKeyframeAnimation, 
//			KeyframeAnimation

class AnimatableSplitDimensionPathValue
	implements AnimatableValue
{

	AnimatableSplitDimensionPathValue(AnimatableFloatValue animatablefloatvalue, AnimatableFloatValue animatablefloatvalue1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		animatableXDimension = animatablefloatvalue;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field AnimatableFloatValue animatableXDimension>
		animatableYDimension = animatablefloatvalue1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field AnimatableFloatValue animatableYDimension>
	//    8   14:return          
	}

	public volatile BaseKeyframeAnimation createAnimation()
	{
		return ((BaseKeyframeAnimation) (createAnimation()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #25  <Method KeyframeAnimation createAnimation()>
	//    2    4:areturn         
	}

	public KeyframeAnimation createAnimation()
	{
		return ((KeyframeAnimation) (new SplitDimensionPathKeyframeAnimation(animatableXDimension.createAnimation(), animatableYDimension.createAnimation())));
	//    0    0:new             #27  <Class SplitDimensionPathKeyframeAnimation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field AnimatableFloatValue animatableXDimension>
	//    4    8:invokevirtual   #30  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field AnimatableFloatValue animatableYDimension>
	//    7   15:invokevirtual   #30  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//    8   18:invokespecial   #33  <Method void SplitDimensionPathKeyframeAnimation(KeyframeAnimation, KeyframeAnimation)>
	//    9   21:areturn         
	}

	public boolean hasAnimation()
	{
		return animatableXDimension.hasAnimation() || animatableYDimension.hasAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AnimatableFloatValue animatableXDimension>
	//    2    4:invokevirtual   #39  <Method boolean AnimatableFloatValue.hasAnimation()>
	//    3    7:ifne            25
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field AnimatableFloatValue animatableYDimension>
	//    6   14:invokevirtual   #39  <Method boolean AnimatableFloatValue.hasAnimation()>
	//    7   17:ifeq            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	private final AnimatableFloatValue animatableXDimension;
	private final AnimatableFloatValue animatableYDimension;
}
