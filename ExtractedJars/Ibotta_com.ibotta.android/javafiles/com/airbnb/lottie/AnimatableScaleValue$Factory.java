// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableScaleValue, AnimatableValueParser, ScaleXY, LottieComposition

static final class AnimatableScaleValue$Factory
{

	static AnimatableScaleValue newInstance()
	{
		return new AnimatableScaleValue(((AnimatableScaleValue._cls1) (null)));
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
		return new AnimatableScaleValue(((AnimatableValueParser$Result) (jsonobject)).keyframes, (ScaleXY)((AnimatableValueParser$Result) (jsonobject)).initialValue);
	//    7   13:new             #6   <Class AnimatableScaleValue>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field java.util.List AnimatableValueParser$Result.keyframes>
	//   11   21:aload_0         
	//   12   22:getfield        #40  <Field Object AnimatableValueParser$Result.initialValue>
	//   13   25:checkcast       #42  <Class ScaleXY>
	//   14   28:invokespecial   #45  <Method void AnimatableScaleValue(java.util.List, ScaleXY)>
	//   15   31:areturn         
	}
}
