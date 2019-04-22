// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			BaseAnimatableValue, ScaleXY, StaticKeyframeAnimation, ScaleKeyframeAnimation, 
//			BaseKeyframeAnimation, KeyframeAnimation, AnimatableValueParser, LottieComposition

class AnimatableScaleValue extends BaseAnimatableValue
{
	static final class Factory
	{

		static AnimatableScaleValue newInstance()
		{
			return new AnimatableScaleValue();
		//    0    0:new             #6   <Class AnimatableScaleValue>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #13  <Method void AnimatableScaleValue(AnimatableScaleValue$1)>
		//    4    8:areturn         
		}

		static AnimatableScaleValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, 1.0F, lottiecomposition, ((AnimatableValue.Factory) (ScaleXY.Factory.INSTANCE))).parseJson()));
		//    0    0:aload_0         
		//    1    1:fconst_1        
		//    2    2:aload_1         
		//    3    3:getstatic       #21  <Field ScaleXY$Factory ScaleXY$Factory.INSTANCE>
		//    4    6:invokestatic    #26  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
		//    5    9:invokevirtual   #30  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
		//    6   12:astore_0        
			return new AnimatableScaleValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, (ScaleXY)((AnimatableValueParser.Result) (jsonobject)).initialValue);
		//    7   13:new             #6   <Class AnimatableScaleValue>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #36  <Field List AnimatableValueParser$Result.keyframes>
		//   11   21:aload_0         
		//   12   22:getfield        #40  <Field Object AnimatableValueParser$Result.initialValue>
		//   13   25:checkcast       #42  <Class ScaleXY>
		//   14   28:invokespecial   #45  <Method void AnimatableScaleValue(List, ScaleXY)>
		//   15   31:areturn         
		}
	}


	private AnimatableScaleValue()
	{
		super(((Object) (new ScaleXY())));
	//    0    0:aload_0         
	//    1    1:new             #14  <Class ScaleXY>
	//    2    4:dup             
	//    3    5:invokespecial   #16  <Method void ScaleXY()>
	//    4    8:invokespecial   #19  <Method void BaseAnimatableValue(Object)>
	//    5   11:return          
	}


	AnimatableScaleValue(List list, ScaleXY scalexy)
	{
		super(list, ((Object) (scalexy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void BaseAnimatableValue(List, Object)>
	//    4    6:return          
	}

	public volatile BaseKeyframeAnimation createAnimation()
	{
		return ((BaseKeyframeAnimation) (createAnimation()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method KeyframeAnimation createAnimation()>
	//    2    4:areturn         
	}

	public KeyframeAnimation createAnimation()
	{
		if(!hasAnimation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method boolean hasAnimation()>
	//*   2    4:ifne            19
			return ((KeyframeAnimation) (new StaticKeyframeAnimation(initialValue)));
	//    3    7:new             #39  <Class StaticKeyframeAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #43  <Field Object initialValue>
	//    7   15:invokespecial   #44  <Method void StaticKeyframeAnimation(Object)>
	//    8   18:areturn         
		else
			return ((KeyframeAnimation) (new ScaleKeyframeAnimation(keyframes)));
	//    9   19:new             #46  <Class ScaleKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field List keyframes>
	//   13   27:invokespecial   #53  <Method void ScaleKeyframeAnimation(List)>
	//   14   30:areturn         
	}
}
