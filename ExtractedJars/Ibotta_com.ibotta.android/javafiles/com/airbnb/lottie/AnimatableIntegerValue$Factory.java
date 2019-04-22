// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableIntegerValue, AnimatableValueParser, LottieComposition

static final class AnimatableIntegerValue$Factory
{

	static AnimatableIntegerValue newInstance()
	{
		return new AnimatableIntegerValue(((AnimatableIntegerValue._cls1) (null)));
	//    0    0:new             #6   <Class AnimatableIntegerValue>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #13  <Method void AnimatableIntegerValue(AnimatableIntegerValue$1)>
	//    4    8:areturn         
	}

	static AnimatableIntegerValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, 1.0F, lottiecomposition, ((AnimatableValue.Factory) (tory.access._mth100()))).parseJson()));
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
	//   14   26:getfield        #42  <Field java.util.List AnimatableValueParser$Result.keyframes>
	//   15   29:aload_1         
	//   16   30:invokespecial   #45  <Method void AnimatableIntegerValue(java.util.List, Integer)>
	//   17   33:areturn         
	}
}
