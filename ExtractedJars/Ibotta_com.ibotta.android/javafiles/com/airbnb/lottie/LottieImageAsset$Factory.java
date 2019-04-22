// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			LottieImageAsset

static class LottieImageAsset$Factory
{

	static LottieImageAsset newInstance(JSONObject jsonobject)
	{
		return new LottieImageAsset(jsonobject.optInt("w"), jsonobject.optInt("h"), jsonobject.optString("id"), jsonobject.optString("p"), ((LottieImageAsset._cls1) (null)));
	//    0    0:new             #6   <Class LottieImageAsset>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #11  <String "w">
	//    4    7:invokevirtual   #17  <Method int JSONObject.optInt(String)>
	//    5   10:aload_0         
	//    6   11:ldc1            #19  <String "h">
	//    7   13:invokevirtual   #17  <Method int JSONObject.optInt(String)>
	//    8   16:aload_0         
	//    9   17:ldc1            #21  <String "id">
	//   10   19:invokevirtual   #25  <Method String JSONObject.optString(String)>
	//   11   22:aload_0         
	//   12   23:ldc1            #27  <String "p">
	//   13   25:invokevirtual   #25  <Method String JSONObject.optString(String)>
	//   14   28:aconst_null     
	//   15   29:invokespecial   #31  <Method void LottieImageAsset(int, int, String, String, LottieImageAsset$1)>
	//   16   32:areturn         
	}
}
