// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableColorValue, ColorFactory, AnimatableValueParser, LottieComposition

static final class AnimatableColorValue$Factory
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
		return new AnimatableColorValue(((AnimatableValueParser$Result) (jsonobject)).keyframes, (Integer)((AnimatableValueParser$Result) (jsonobject)).initialValue, ((AnimatableColorValue._cls1) (null)));
	//    7   13:new             #6   <Class AnimatableColorValue>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field java.util.List AnimatableValueParser$Result.keyframes>
	//   11   21:aload_0         
	//   12   22:getfield        #34  <Field Object AnimatableValueParser$Result.initialValue>
	//   13   25:checkcast       #36  <Class Integer>
	//   14   28:aconst_null     
	//   15   29:invokespecial   #40  <Method void AnimatableColorValue(java.util.List, Integer, AnimatableColorValue$1)>
	//   16   32:areturn         
	}
}
