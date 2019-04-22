// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			BaseAnimatableValue, StaticKeyframeAnimation, ColorKeyframeAnimation, BaseKeyframeAnimation, 
//			KeyframeAnimation, ColorFactory, AnimatableValueParser, LottieComposition

class AnimatableColorValue extends BaseAnimatableValue
{
	static final class Factory
	{

		static AnimatableColorValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, 1.0F, lottiecomposition, ((AnimatableValue.Factory) (ColorFactory.INSTANCE))).parseJson()));
		//    0    0:aload_0         
		//    1    1:fconst_1        
		//    2    2:aload_1         
		//    3    3:getstatic       #15  <Field ColorFactory ColorFactory.INSTANCE>
		//    4    6:invokestatic    #20  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
		//    5    9:invokevirtual   #24  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
		//    6   12:astore_0        
			return new AnimatableColorValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, (Integer)((AnimatableValueParser.Result) (jsonobject)).initialValue);
		//    7   13:new             #6   <Class AnimatableColorValue>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:getfield        #30  <Field List AnimatableValueParser$Result.keyframes>
		//   11   21:aload_0         
		//   12   22:getfield        #34  <Field Object AnimatableValueParser$Result.initialValue>
		//   13   25:checkcast       #36  <Class Integer>
		//   14   28:aconst_null     
		//   15   29:invokespecial   #40  <Method void AnimatableColorValue(List, Integer, AnimatableColorValue$1)>
		//   16   32:areturn         
		}
	}


	private AnimatableColorValue(List list, Integer integer)
	{
		super(list, ((Object) (integer)));
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
			return ((KeyframeAnimation) (new ColorKeyframeAnimation(keyframes)));
	//    9   19:new             #41  <Class ColorKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #45  <Field List keyframes>
	//   13   27:invokespecial   #48  <Method void ColorKeyframeAnimation(List)>
	//   14   30:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("AnimatableColorValue{initialValue=");
	//    4    8:aload_1         
	//    5    9:ldc1            #58  <String "AnimatableColorValue{initialValue=">
	//    6   11:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(initialValue);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #36  <Field Object initialValue>
	//   11   20:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append('}');
	//   13   24:aload_1         
	//   14   25:bipush          125
	//   15   27:invokevirtual   #68  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		return stringbuilder.toString();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   19   35:areturn         
	}
}
