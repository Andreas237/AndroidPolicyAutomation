// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			ShapeTrimPath, LottieComposition

static class ShapeTrimPath$Factory
{

	static ShapeTrimPath newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		return new ShapeTrimPath(jsonobject.optString("nm"), ShapeTrimPath.Type.forId(jsonobject.optInt("m", 1)), actory.newInstance(jsonobject.optJSONObject("s"), lottiecomposition, false), actory.newInstance(jsonobject.optJSONObject("e"), lottiecomposition, false), actory.newInstance(jsonobject.optJSONObject("o"), lottiecomposition, false), ((ShapeTrimPath._cls1) (null)));
	//    0    0:new             #6   <Class ShapeTrimPath>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #11  <String "nm">
	//    4    7:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <String "m">
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #23  <Method int JSONObject.optInt(String, int)>
	//    9   17:invokestatic    #29  <Method ShapeTrimPath$Type ShapeTrimPath$Type.forId(int)>
	//   10   20:aload_0         
	//   11   21:ldc1            #31  <String "s">
	//   12   23:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   13   26:aload_1         
	//   14   27:iconst_0        
	//   15   28:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
	//   16   31:aload_0         
	//   17   32:ldc1            #42  <String "e">
	//   18   34:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   19   37:aload_1         
	//   20   38:iconst_0        
	//   21   39:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
	//   22   42:aload_0         
	//   23   43:ldc1            #44  <String "o">
	//   24   45:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   25   48:aload_1         
	//   26   49:iconst_0        
	//   27   50:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
	//   28   53:aconst_null     
	//   29   54:invokespecial   #48  <Method void ShapeTrimPath(String, ShapeTrimPath$Type, AnimatableFloatValue, AnimatableFloatValue, AnimatableFloatValue, ShapeTrimPath$1)>
	//   30   57:areturn         
	}
}
