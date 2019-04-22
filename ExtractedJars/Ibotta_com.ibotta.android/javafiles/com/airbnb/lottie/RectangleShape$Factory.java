// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			RectangleShape, AnimatablePathValue, LottieComposition

static class RectangleShape$Factory
{

	static RectangleShape newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		return new RectangleShape(jsonobject.optString("nm"), AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(jsonobject.optJSONObject("p"), lottiecomposition), ctory.newInstance(jsonobject.optJSONObject("s"), lottiecomposition), ctory.newInstance(jsonobject.optJSONObject("r"), lottiecomposition), ((RectangleShape._cls1) (null)));
	//    0    0:new             #6   <Class RectangleShape>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #11  <String "nm">
	//    4    7:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <String "p">
	//    7   13:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//    8   16:aload_1         
	//    9   17:invokestatic    #29  <Method AnimatableValue AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(JSONObject, LottieComposition)>
	//   10   20:aload_0         
	//   11   21:ldc1            #31  <String "s">
	//   12   23:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//   13   26:aload_1         
	//   14   27:invokestatic    #36  <Method AnimatablePointValue AnimatablePointValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   15   30:aload_0         
	//   16   31:ldc1            #38  <String "r">
	//   17   33:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//   18   36:aload_1         
	//   19   37:invokestatic    #43  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   20   40:aconst_null     
	//   21   41:invokespecial   #47  <Method void RectangleShape(String, AnimatableValue, AnimatablePointValue, AnimatableFloatValue, RectangleShape$1)>
	//   22   44:areturn         
	}
}
