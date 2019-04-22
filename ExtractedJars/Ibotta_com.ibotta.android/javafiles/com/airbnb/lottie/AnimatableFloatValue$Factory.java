// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableFloatValue, LottieComposition, AnimatableValueParser

static final class AnimatableFloatValue$Factory
{

	static AnimatableFloatValue newInstance()
	{
		return new AnimatableFloatValue(((AnimatableFloatValue._cls1) (null)));
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
		jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, f, lottiecomposition, ((AnimatableValue.Factory) (tory.INSTANCE))).parseJson()));
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:aload_1         
	//   11   17:getstatic       #30  <Field AnimatableFloatValue$ValueFactory AnimatableFloatValue$ValueFactory.INSTANCE>
	//   12   20:invokestatic    #35  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
	//   13   23:invokevirtual   #39  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
	//   14   26:astore_0        
		return new AnimatableFloatValue(((AnimatableValueParser$Result) (jsonobject)).keyframes, (Float)((AnimatableValueParser$Result) (jsonobject)).initialValue, ((AnimatableFloatValue._cls1) (null)));
	//   15   27:new             #6   <Class AnimatableFloatValue>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:getfield        #45  <Field java.util.List AnimatableValueParser$Result.keyframes>
	//   19   35:aload_0         
	//   20   36:getfield        #49  <Field Object AnimatableValueParser$Result.initialValue>
	//   21   39:checkcast       #51  <Class Float>
	//   22   42:aconst_null     
	//   23   43:invokespecial   #54  <Method void AnimatableFloatValue(java.util.List, Float, AnimatableFloatValue$1)>
	//   24   46:areturn         
	}
}
