// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			BaseAnimatableValue, StaticKeyframeAnimation, FloatKeyframeAnimation, BaseKeyframeAnimation, 
//			KeyframeAnimation, LottieComposition, AnimatableValueParser, JsonUtils

class AnimatableFloatValue extends BaseAnimatableValue
{
	static final class Factory
	{

		static AnimatableFloatValue newInstance()
		{
			return new AnimatableFloatValue();
		//    0    0:new             #6   <Class AnimatableFloatValue>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #13  <Method void AnimatableFloatValue(AnimatableFloatValue$1)>
		//    4    8:areturn         
		}

		static AnimatableFloatValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			return newInstance(jsonobject, lottiecomposition, true);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_1        
		//    3    3:invokestatic    #18  <Method AnimatableFloatValue newInstance(JSONObject, LottieComposition, boolean)>
		//    4    6:areturn         
		}

		static AnimatableFloatValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition, boolean flag)
		{
			float f;
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            12
				f = lottiecomposition.getDpScale();
		//    2    4:aload_1         
		//    3    5:invokevirtual   #24  <Method float LottieComposition.getDpScale()>
		//    4    8:fstore_3        
			else
		//*   5    9:goto            14
				f = 1.0F;
		//    6   12:fconst_1        
		//    7   13:fstore_3        
			jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, f, lottiecomposition, ((AnimatableValue.Factory) (ValueFactory.INSTANCE))).parseJson()));
		//    8   14:aload_0         
		//    9   15:fload_3         
		//   10   16:aload_1         
		//   11   17:getstatic       #30  <Field AnimatableFloatValue$ValueFactory AnimatableFloatValue$ValueFactory.INSTANCE>
		//   12   20:invokestatic    #35  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
		//   13   23:invokevirtual   #39  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
		//   14   26:astore_0        
			return new AnimatableFloatValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, (Float)((AnimatableValueParser.Result) (jsonobject)).initialValue);
		//   15   27:new             #6   <Class AnimatableFloatValue>
		//   16   30:dup             
		//   17   31:aload_0         
		//   18   32:getfield        #45  <Field List AnimatableValueParser$Result.keyframes>
		//   19   35:aload_0         
		//   20   36:getfield        #49  <Field Object AnimatableValueParser$Result.initialValue>
		//   21   39:checkcast       #51  <Class Float>
		//   22   42:aconst_null     
		//   23   43:invokespecial   #54  <Method void AnimatableFloatValue(List, Float, AnimatableFloatValue$1)>
		//   24   46:areturn         
		}
	}

	private static class ValueFactory
		implements AnimatableValue.Factory
	{

		public Float valueFromObject(Object obj, float f)
		{
			return Float.valueOf(JsonUtils.valueFromObject(obj) * f);
		//    0    0:aload_1         
		//    1    1:invokestatic    #28  <Method float JsonUtils.valueFromObject(Object)>
		//    2    4:fload_2         
		//    3    5:fmul            
		//    4    6:invokestatic    #34  <Method Float Float.valueOf(float)>
		//    5    9:areturn         
		}

		public volatile Object valueFromObject(Object obj, float f)
		{
			return ((Object) (valueFromObject(obj, f)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:fload_2         
		//    3    3:invokevirtual   #37  <Method Float valueFromObject(Object, float)>
		//    4    6:areturn         
		}

		static final ValueFactory INSTANCE = new ValueFactory();

		static 
		{
		//    0    0:new             #2   <Class AnimatableFloatValue$ValueFactory>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AnimatableFloatValue$ValueFactory()>
		//    3    7:putstatic       #19  <Field AnimatableFloatValue$ValueFactory INSTANCE>
		//*   4   10:return          
		}

		private ValueFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	private AnimatableFloatValue()
	{
		super(((Object) (Float.valueOf(0.0F))));
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:invokestatic    #21  <Method Float Float.valueOf(float)>
	//    3    5:invokespecial   #24  <Method void BaseAnimatableValue(Object)>
	//    4    8:return          
	}


	private AnimatableFloatValue(List list, Float float1)
	{
		super(list, ((Object) (float1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void BaseAnimatableValue(List, Object)>
	//    4    6:return          
	}


	public volatile BaseKeyframeAnimation createAnimation()
	{
		return ((BaseKeyframeAnimation) (createAnimation()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method KeyframeAnimation createAnimation()>
	//    2    4:areturn         
	}

	public KeyframeAnimation createAnimation()
	{
		if(!hasAnimation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #46  <Method boolean hasAnimation()>
	//*   2    4:ifne            19
			return ((KeyframeAnimation) (new StaticKeyframeAnimation(initialValue)));
	//    3    7:new             #48  <Class StaticKeyframeAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #52  <Field Object initialValue>
	//    7   15:invokespecial   #53  <Method void StaticKeyframeAnimation(Object)>
	//    8   18:areturn         
		else
			return ((KeyframeAnimation) (new FloatKeyframeAnimation(keyframes)));
	//    9   19:new             #55  <Class FloatKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #59  <Field List keyframes>
	//   13   27:invokespecial   #62  <Method void FloatKeyframeAnimation(List)>
	//   14   30:areturn         
	}

	public Float getInitialValue()
	{
		return (Float)initialValue;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Object initialValue>
	//    2    4:checkcast       #17  <Class Float>
	//    3    7:areturn         
	}

	public volatile Object getInitialValue()
	{
		return ((Object) (getInitialValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method Float getInitialValue()>
	//    2    4:areturn         
	}
}
