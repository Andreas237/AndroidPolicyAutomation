// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			BaseAnimatableValue, StaticKeyframeAnimation, IntegerKeyframeAnimation, BaseKeyframeAnimation, 
//			KeyframeAnimation, AnimatableValueParser, LottieComposition, JsonUtils

class AnimatableIntegerValue extends BaseAnimatableValue
{
	static final class Factory
	{

		static AnimatableIntegerValue newInstance()
		{
			return new AnimatableIntegerValue();
		//    0    0:new             #6   <Class AnimatableIntegerValue>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #13  <Method void AnimatableIntegerValue(AnimatableIntegerValue$1)>
		//    4    8:areturn         
		}

		static AnimatableIntegerValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, 1.0F, lottiecomposition, ((AnimatableValue.Factory) (ValueFactory.INSTANCE))).parseJson()));
		//    0    0:aload_0         
		//    1    1:fconst_1        
		//    2    2:aload_1         
		//    3    3:invokestatic    #21  <Method AnimatableIntegerValue$ValueFactory AnimatableIntegerValue$ValueFactory.access$100()>
		//    4    6:invokestatic    #26  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
		//    5    9:invokevirtual   #30  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
		//    6   12:astore_0        
			lottiecomposition = ((LottieComposition) ((Integer)((AnimatableValueParser.Result) (jsonobject)).initialValue));
		//    7   13:aload_0         
		//    8   14:getfield        #36  <Field Object AnimatableValueParser$Result.initialValue>
		//    9   17:checkcast       #38  <Class Integer>
		//   10   20:astore_1        
			return new AnimatableIntegerValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, ((Integer) (lottiecomposition)));
		//   11   21:new             #6   <Class AnimatableIntegerValue>
		//   12   24:dup             
		//   13   25:aload_0         
		//   14   26:getfield        #42  <Field List AnimatableValueParser$Result.keyframes>
		//   15   29:aload_1         
		//   16   30:invokespecial   #45  <Method void AnimatableIntegerValue(List, Integer)>
		//   17   33:areturn         
		}
	}

	private static class ValueFactory
		implements AnimatableValue.Factory
	{

		public Integer valueFromObject(Object obj, float f)
		{
			return Integer.valueOf(Math.round(JsonUtils.valueFromObject(obj) * f));
		//    0    0:aload_1         
		//    1    1:invokestatic    #30  <Method float JsonUtils.valueFromObject(Object)>
		//    2    4:fload_2         
		//    3    5:fmul            
		//    4    6:invokestatic    #36  <Method int Math.round(float)>
		//    5    9:invokestatic    #42  <Method Integer Integer.valueOf(int)>
		//    6   12:areturn         
		}

		public volatile Object valueFromObject(Object obj, float f)
		{
			return ((Object) (valueFromObject(obj, f)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:fload_2         
		//    3    3:invokevirtual   #45  <Method Integer valueFromObject(Object, float)>
		//    4    6:areturn         
		}

		private static final ValueFactory INSTANCE = new ValueFactory();

		static 
		{
		//    0    0:new             #2   <Class AnimatableIntegerValue$ValueFactory>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AnimatableIntegerValue$ValueFactory()>
		//    3    7:putstatic       #19  <Field AnimatableIntegerValue$ValueFactory INSTANCE>
		//*   4   10:return          
		}


/*
		static ValueFactory access$100()
		{
			return INSTANCE;
		//    0    0:getstatic       #19  <Field AnimatableIntegerValue$ValueFactory INSTANCE>
		//    1    3:areturn         
		}

*/

		private ValueFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	private AnimatableIntegerValue()
	{
		super(((Object) (Integer.valueOf(100))));
	//    0    0:aload_0         
	//    1    1:bipush          100
	//    2    3:invokestatic    #21  <Method Integer Integer.valueOf(int)>
	//    3    6:invokespecial   #24  <Method void BaseAnimatableValue(Object)>
	//    4    9:return          
	}


	AnimatableIntegerValue(List list, Integer integer)
	{
		super(list, ((Object) (integer)));
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
	//    1    1:invokevirtual   #39  <Method KeyframeAnimation createAnimation()>
	//    2    4:areturn         
	}

	public KeyframeAnimation createAnimation()
	{
		if(!hasAnimation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #43  <Method boolean hasAnimation()>
	//*   2    4:ifne            19
			return ((KeyframeAnimation) (new StaticKeyframeAnimation(initialValue)));
	//    3    7:new             #45  <Class StaticKeyframeAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field Object initialValue>
	//    7   15:invokespecial   #50  <Method void StaticKeyframeAnimation(Object)>
	//    8   18:areturn         
		else
			return ((KeyframeAnimation) (new IntegerKeyframeAnimation(keyframes)));
	//    9   19:new             #52  <Class IntegerKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #56  <Field List keyframes>
	//   13   27:invokespecial   #59  <Method void IntegerKeyframeAnimation(List)>
	//   14   30:areturn         
	}

	public Integer getInitialValue()
	{
		return (Integer)initialValue;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Object initialValue>
	//    2    4:checkcast       #17  <Class Integer>
	//    3    7:areturn         
	}

	public volatile Object getInitialValue()
	{
		return ((Object) (getInitialValue()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method Integer getInitialValue()>
	//    2    4:areturn         
	}
}
