// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			ShapeFill, LottieComposition

static class ShapeFill$Factory
{

	static ShapeFill newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		String s = jsonobject.optString("nm");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "nm">
	//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//    3    6:astore          4
		Object obj = ((Object) (jsonobject.optJSONObject("c")));
	//    4    8:aload_0         
	//    5    9:ldc1            #19  <String "c">
	//    6   11:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//    7   14:astore_3        
		if(obj != null)
	//*   8   15:aload_3         
	//*   9   16:ifnull          28
			obj = ((Object) (ue.Factory.newInstance(((JSONObject) (obj)), lottiecomposition)));
	//   10   19:aload_3         
	//   11   20:aload_1         
	//   12   21:invokestatic    #28  <Method AnimatableColorValue AnimatableColorValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   13   24:astore_3        
		else
	//*  14   25:goto            30
			obj = null;
	//   15   28:aconst_null     
	//   16   29:astore_3        
		JSONObject jsonobject1 = jsonobject.optJSONObject("o");
	//   17   30:aload_0         
	//   18   31:ldc1            #30  <String "o">
	//   19   33:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//   20   36:astore          5
		if(jsonobject1 != null)
	//*  21   38:aload           5
	//*  22   40:ifnull          53
			lottiecomposition = ((LottieComposition) (alue.Factory.newInstance(jsonobject1, lottiecomposition)));
	//   23   43:aload           5
	//   24   45:aload_1         
	//   25   46:invokestatic    #35  <Method AnimatableIntegerValue AnimatableIntegerValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   26   49:astore_1        
		else
	//*  27   50:goto            55
			lottiecomposition = null;
	//   28   53:aconst_null     
	//   29   54:astore_1        
		boolean flag = jsonobject.optBoolean("fillEnabled");
	//   30   55:aload_0         
	//   31   56:ldc1            #37  <String "fillEnabled">
	//   32   58:invokevirtual   #41  <Method boolean JSONObject.optBoolean(String)>
	//   33   61:istore_2        
		if(jsonobject.optInt("r", 1) == 1)
	//*  34   62:aload_0         
	//*  35   63:ldc1            #43  <String "r">
	//*  36   65:iconst_1        
	//*  37   66:invokevirtual   #47  <Method int JSONObject.optInt(String, int)>
	//*  38   69:iconst_1        
	//*  39   70:icmpne          80
			jsonobject = ((JSONObject) (android.graphics.Path.FillType.WINDING));
	//   40   73:getstatic       #53  <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
	//   41   76:astore_0        
		else
	//*  42   77:goto            84
			jsonobject = ((JSONObject) (android.graphics.Path.FillType.EVEN_ODD));
	//   43   80:getstatic       #56  <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   44   83:astore_0        
		return new ShapeFill(s, flag, ((android.graphics.Path.FillType) (jsonobject)), ((AnimatableColorValue) (obj)), ((AnimatableIntegerValue) (lottiecomposition)), ((ShapeFill._cls1) (null)));
	//   45   84:new             #6   <Class ShapeFill>
	//   46   87:dup             
	//   47   88:aload           4
	//   48   90:iload_2         
	//   49   91:aload_0         
	//   50   92:aload_3         
	//   51   93:aload_1         
	//   52   94:aconst_null     
	//   53   95:invokespecial   #60  <Method void ShapeFill(String, boolean, android.graphics.Path$FillType, AnimatableColorValue, AnimatableIntegerValue, ShapeFill$1)>
	//   54   98:areturn         
	}
}
