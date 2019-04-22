// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableGradientColorValue, AnimatableValueParser, GradientColor, LottieComposition

static final class AnimatableGradientColorValue$Factory
{

	static AnimatableGradientColorValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, 1.0F, lottiecomposition, ((AnimatableValue.Factory) (tory.access._mth000()))).parseJson()));
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:aload_1         
	//    3    3:invokestatic    #15  <Method AnimatableGradientColorValue$ValueFactory AnimatableGradientColorValue$ValueFactory.access$000()>
	//    4    6:invokestatic    #20  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
	//    5    9:invokevirtual   #24  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
	//    6   12:astore_0        
		lottiecomposition = ((LottieComposition) ((GradientColor)((AnimatableValueParser.Result) (jsonobject)).initialValue));
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field Object AnimatableValueParser$Result.initialValue>
	//    9   17:checkcast       #32  <Class GradientColor>
	//   10   20:astore_1        
		return new AnimatableGradientColorValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, ((GradientColor) (lottiecomposition)), ((AnimatableGradientColorValue._cls1) (null)));
	//   11   21:new             #6   <Class AnimatableGradientColorValue>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:getfield        #36  <Field java.util.List AnimatableValueParser$Result.keyframes>
	//   15   29:aload_1         
	//   16   30:aconst_null     
	//   17   31:invokespecial   #40  <Method void AnimatableGradientColorValue(java.util.List, GradientColor, AnimatableGradientColorValue$1)>
	//   18   34:areturn         
	}
}
