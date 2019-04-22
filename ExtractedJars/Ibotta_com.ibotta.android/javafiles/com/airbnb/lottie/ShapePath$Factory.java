// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			ShapePath, LottieComposition

static class ShapePath$Factory
{

	static ShapePath newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		lottiecomposition = ((LottieComposition) (ue.Factory.newInstance(jsonobject.optJSONObject("ks"), lottiecomposition)));
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "ks">
	//    2    3:invokevirtual   #17  <Method JSONObject JSONObject.optJSONObject(String)>
	//    3    6:aload_1         
	//    4    7:invokestatic    #22  <Method AnimatableShapeValue AnimatableShapeValue$Factory.newInstance(JSONObject, LottieComposition)>
	//    5   10:astore_1        
		return new ShapePath(jsonobject.optString("nm"), jsonobject.optInt("ind"), ((AnimatableShapeValue) (lottiecomposition)), ((ShapePath._cls1) (null)));
	//    6   11:new             #6   <Class ShapePath>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:ldc1            #24  <String "nm">
	//   10   18:invokevirtual   #28  <Method String JSONObject.optString(String)>
	//   11   21:aload_0         
	//   12   22:ldc1            #30  <String "ind">
	//   13   24:invokevirtual   #34  <Method int JSONObject.optInt(String)>
	//   14   27:aload_1         
	//   15   28:aconst_null     
	//   16   29:invokespecial   #38  <Method void ShapePath(String, int, AnimatableShapeValue, ShapePath$1)>
	//   17   32:areturn         
	}
}
