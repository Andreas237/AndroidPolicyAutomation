// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatablePointValue, LottieComposition, PointFFactory, AnimatableValueParser

static final class AnimatablePointValue$Factory
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
		return new AnimatablePointValue(((AnimatableValueParser$Result) (jsonobject)).keyframes, (PointF)((AnimatableValueParser$Result) (jsonobject)).initialValue, ((AnimatablePointValue._cls1) (null)));
	//    8   16:new             #6   <Class AnimatablePointValue>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field java.util.List AnimatableValueParser$Result.keyframes>
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field Object AnimatableValueParser$Result.initialValue>
	//   14   28:checkcast       #42  <Class PointF>
	//   15   31:aconst_null     
	//   16   32:invokespecial   #46  <Method void AnimatablePointValue(java.util.List, PointF, AnimatablePointValue$1)>
	//   17   35:areturn         
	}
}
