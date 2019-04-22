// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			BaseAnimatableValue, StaticKeyframeAnimation, PointKeyframeAnimation, BaseKeyframeAnimation, 
//			KeyframeAnimation, LottieComposition, PointFFactory, AnimatableValueParser

class AnimatablePointValue extends BaseAnimatableValue
{
	static final class Factory
	{

		static AnimatablePointValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, lottiecomposition.getDpScale(), lottiecomposition, ((AnimatableValue.Factory) (PointFFactory.INSTANCE))).parseJson()));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #15  <Method float LottieComposition.getDpScale()>
		//    3    5:aload_1         
		//    4    6:getstatic       #21  <Field PointFFactory PointFFactory.INSTANCE>
		//    5    9:invokestatic    #26  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
		//    6   12:invokevirtual   #30  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
		//    7   15:astore_0        
			return new AnimatablePointValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, (PointF)((AnimatableValueParser.Result) (jsonobject)).initialValue);
		//    8   16:new             #6   <Class AnimatablePointValue>
		//    9   19:dup             
		//   10   20:aload_0         
		//   11   21:getfield        #36  <Field List AnimatableValueParser$Result.keyframes>
		//   12   24:aload_0         
		//   13   25:getfield        #40  <Field Object AnimatableValueParser$Result.initialValue>
		//   14   28:checkcast       #42  <Class PointF>
		//   15   31:aconst_null     
		//   16   32:invokespecial   #46  <Method void AnimatablePointValue(List, PointF, AnimatablePointValue$1)>
		//   17   35:areturn         
		}
	}


	private AnimatablePointValue(List list, PointF pointf)
	{
		super(list, ((Object) (pointf)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void BaseAnimatableValue(List, Object)>
	//    4    6:return          
	}


	public volatile BaseKeyframeAnimation createAnimation()
	{
		return ((BaseKeyframeAnimation) (createAnimation()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method KeyframeAnimation createAnimation()>
	//    2    4:areturn         
	}

	public KeyframeAnimation createAnimation()
	{
		if(!hasAnimation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #30  <Method boolean hasAnimation()>
	//*   2    4:ifne            19
			return ((KeyframeAnimation) (new StaticKeyframeAnimation(initialValue)));
	//    3    7:new             #32  <Class StaticKeyframeAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field Object initialValue>
	//    7   15:invokespecial   #39  <Method void StaticKeyframeAnimation(Object)>
	//    8   18:areturn         
		else
			return ((KeyframeAnimation) (new PointKeyframeAnimation(keyframes)));
	//    9   19:new             #41  <Class PointKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #45  <Field List keyframes>
	//   13   27:invokespecial   #48  <Method void PointKeyframeAnimation(List)>
	//   14   30:areturn         
	}
}
