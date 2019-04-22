// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			GradientFill, GradientType, LottieComposition

static class GradientFill$Factory
{

	static GradientFill newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		String s = jsonobject.optString("nm");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "nm">
	//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//    3    6:astore          7
		Object obj1 = ((Object) (jsonobject.optJSONObject("g")));
	//    4    8:aload_0         
	//    5    9:ldc1            #19  <String "g">
	//    6   11:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//    7   14:astore_3        
		Object obj = obj1;
	//    8   15:aload_3         
	//    9   16:astore_2        
		if(obj1 != null)
	//*  10   17:aload_3         
	//*  11   18:ifnull          39
		{
			obj = obj1;
	//   12   21:aload_3         
	//   13   22:astore_2        
			if(((JSONObject) (obj1)).has("k"))
	//*  14   23:aload_3         
	//*  15   24:ldc1            #25  <String "k">
	//*  16   26:invokevirtual   #29  <Method boolean JSONObject.has(String)>
	//*  17   29:ifeq            39
				obj = ((Object) (((JSONObject) (obj1)).optJSONObject("k")));
	//   18   32:aload_3         
	//   19   33:ldc1            #25  <String "k">
	//   20   35:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//   21   38:astore_2        
		}
		if(obj != null)
	//*  22   39:aload_2         
	//*  23   40:ifnull          52
			obj = ((Object) (orValue.Factory.newInstance(((JSONObject) (obj)), lottiecomposition)));
	//   24   43:aload_2         
	//   25   44:aload_1         
	//   26   45:invokestatic    #34  <Method AnimatableGradientColorValue AnimatableGradientColorValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   27   48:astore_2        
		else
	//*  28   49:goto            54
			obj = null;
	//   29   52:aconst_null     
	//   30   53:astore_2        
		obj1 = ((Object) (jsonobject.optJSONObject("o")));
	//   31   54:aload_0         
	//   32   55:ldc1            #36  <String "o">
	//   33   57:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//   34   60:astore_3        
		if(obj1 != null)
	//*  35   61:aload_3         
	//*  36   62:ifnull          74
			obj1 = ((Object) (e.Factory.newInstance(((JSONObject) (obj1)), lottiecomposition)));
	//   37   65:aload_3         
	//   38   66:aload_1         
	//   39   67:invokestatic    #41  <Method AnimatableIntegerValue AnimatableIntegerValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   40   70:astore_3        
		else
	//*  41   71:goto            76
			obj1 = null;
	//   42   74:aconst_null     
	//   43   75:astore_3        
		android.graphics.Path.FillType filltype;
		if(jsonobject.optInt("r", 1) == 1)
	//*  44   76:aload_0         
	//*  45   77:ldc1            #43  <String "r">
	//*  46   79:iconst_1        
	//*  47   80:invokevirtual   #47  <Method int JSONObject.optInt(String, int)>
	//*  48   83:iconst_1        
	//*  49   84:icmpne          95
			filltype = android.graphics.Path.FillType.WINDING;
	//   50   87:getstatic       #53  <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
	//   51   90:astore          4
		else
	//*  52   92:goto            100
			filltype = android.graphics.Path.FillType.EVEN_ODD;
	//   53   95:getstatic       #56  <Field android.graphics.Path$FillType android.graphics.Path$FillType.EVEN_ODD>
	//   54   98:astore          4
		GradientType gradienttype;
		if(jsonobject.optInt("t", 1) == 1)
	//*  55  100:aload_0         
	//*  56  101:ldc1            #58  <String "t">
	//*  57  103:iconst_1        
	//*  58  104:invokevirtual   #47  <Method int JSONObject.optInt(String, int)>
	//*  59  107:iconst_1        
	//*  60  108:icmpne          119
			gradienttype = GradientType.Linear;
	//   61  111:getstatic       #64  <Field GradientType GradientType.Linear>
	//   62  114:astore          5
		else
	//*  63  116:goto            124
			gradienttype = GradientType.Radial;
	//   64  119:getstatic       #67  <Field GradientType GradientType.Radial>
	//   65  122:astore          5
		Object obj2 = ((Object) (jsonobject.optJSONObject("s")));
	//   66  124:aload_0         
	//   67  125:ldc1            #69  <String "s">
	//   68  127:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//   69  130:astore          6
		if(obj2 != null)
	//*  70  132:aload           6
	//*  71  134:ifnull          148
			obj2 = ((Object) (com.airbnb.lottie.Factory.newInstance(((JSONObject) (obj2)), lottiecomposition)));
	//   72  137:aload           6
	//   73  139:aload_1         
	//   74  140:invokestatic    #74  <Method AnimatablePointValue AnimatablePointValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   75  143:astore          6
		else
	//*  76  145:goto            151
			obj2 = null;
	//   77  148:aconst_null     
	//   78  149:astore          6
		jsonobject = jsonobject.optJSONObject("e");
	//   79  151:aload_0         
	//   80  152:ldc1            #76  <String "e">
	//   81  154:invokevirtual   #23  <Method JSONObject JSONObject.optJSONObject(String)>
	//   82  157:astore_0        
		if(jsonobject != null)
	//*  83  158:aload_0         
	//*  84  159:ifnull          171
			jsonobject = ((JSONObject) (com.airbnb.lottie.Factory.newInstance(jsonobject, lottiecomposition)));
	//   85  162:aload_0         
	//   86  163:aload_1         
	//   87  164:invokestatic    #74  <Method AnimatablePointValue AnimatablePointValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   88  167:astore_0        
		else
	//*  89  168:goto            173
			jsonobject = null;
	//   90  171:aconst_null     
	//   91  172:astore_0        
		return new GradientFill(s, gradienttype, filltype, ((AnimatableGradientColorValue) (obj)), ((AnimatableIntegerValue) (obj1)), ((AnimatablePointValue) (obj2)), ((AnimatablePointValue) (jsonobject)), ((AnimatableFloatValue) (null)), ((AnimatableFloatValue) (null)), ((GradientFill._cls1) (null)));
	//   92  173:new             #6   <Class GradientFill>
	//   93  176:dup             
	//   94  177:aload           7
	//   95  179:aload           5
	//   96  181:aload           4
	//   97  183:aload_2         
	//   98  184:aload_3         
	//   99  185:aload           6
	//  100  187:aload_0         
	//  101  188:aconst_null     
	//  102  189:aconst_null     
	//  103  190:aconst_null     
	//  104  191:invokespecial   #80  <Method void GradientFill(String, GradientType, android.graphics.Path$FillType, AnimatableGradientColorValue, AnimatableIntegerValue, AnimatablePointValue, AnimatablePointValue, AnimatableFloatValue, AnimatableFloatValue, GradientFill$1)>
	//  105  194:areturn         
	}
}
