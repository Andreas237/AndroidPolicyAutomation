// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatablePointValue, AnimatableGradientColorValue, GradientType, AnimatableFloatValue, 
//			AnimatableIntegerValue, LottieComposition

class GradientFill
{
	static class Factory
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
				obj = ((Object) (AnimatableGradientColorValue.Factory.newInstance(((JSONObject) (obj)), lottiecomposition)));
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
				obj1 = ((Object) (AnimatableIntegerValue.Factory.newInstance(((JSONObject) (obj1)), lottiecomposition)));
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
				obj2 = ((Object) (AnimatablePointValue.Factory.newInstance(((JSONObject) (obj2)), lottiecomposition)));
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
				jsonobject = ((JSONObject) (AnimatablePointValue.Factory.newInstance(jsonobject, lottiecomposition)));
		//   85  162:aload_0         
		//   86  163:aload_1         
		//   87  164:invokestatic    #74  <Method AnimatablePointValue AnimatablePointValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   88  167:astore_0        
			else
		//*  89  168:goto            173
				jsonobject = null;
		//   90  171:aconst_null     
		//   91  172:astore_0        
			return new GradientFill(s, gradienttype, filltype, ((AnimatableGradientColorValue) (obj)), ((AnimatableIntegerValue) (obj1)), ((AnimatablePointValue) (obj2)), ((AnimatablePointValue) (jsonobject)), ((AnimatableFloatValue) (null)), ((AnimatableFloatValue) (null)));
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


	private GradientFill(String s, GradientType gradienttype, android.graphics.Path.FillType filltype, AnimatableGradientColorValue animatablegradientcolorvalue, AnimatableIntegerValue animatableintegervalue, AnimatablePointValue animatablepointvalue, AnimatablePointValue animatablepointvalue1, 
			AnimatableFloatValue animatablefloatvalue, AnimatableFloatValue animatablefloatvalue1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		gradientType = gradienttype;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #33  <Field GradientType gradientType>
		fillType = filltype;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #35  <Field android.graphics.Path$FillType fillType>
		gradientColor = animatablegradientcolorvalue;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #37  <Field AnimatableGradientColorValue gradientColor>
		opacity = animatableintegervalue;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #39  <Field AnimatableIntegerValue opacity>
		startPoint = animatablepointvalue;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #41  <Field AnimatablePointValue startPoint>
		endPoint = animatablepointvalue1;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #43  <Field AnimatablePointValue endPoint>
		name = s;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:putfield        #45  <Field String name>
		highlightLength = animatablefloatvalue;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #47  <Field AnimatableFloatValue highlightLength>
		highlightAngle = animatablefloatvalue1;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #49  <Field AnimatableFloatValue highlightAngle>
	//   29   55:return          
	}


	AnimatablePointValue getEndPoint()
	{
		return endPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AnimatablePointValue endPoint>
	//    2    4:areturn         
	}

	android.graphics.Path.FillType getFillType()
	{
		return fillType;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field android.graphics.Path$FillType fillType>
	//    2    4:areturn         
	}

	AnimatableGradientColorValue getGradientColor()
	{
		return gradientColor;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnimatableGradientColorValue gradientColor>
	//    2    4:areturn         
	}

	GradientType getGradientType()
	{
		return gradientType;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field GradientType gradientType>
	//    2    4:areturn         
	}

	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String name>
	//    2    4:areturn         
	}

	AnimatableIntegerValue getOpacity()
	{
		return opacity;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AnimatableIntegerValue opacity>
	//    2    4:areturn         
	}

	AnimatablePointValue getStartPoint()
	{
		return startPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AnimatablePointValue startPoint>
	//    2    4:areturn         
	}

	private final AnimatablePointValue endPoint;
	private final android.graphics.Path.FillType fillType;
	private final AnimatableGradientColorValue gradientColor;
	private final GradientType gradientType;
	private final AnimatableFloatValue highlightAngle;
	private final AnimatableFloatValue highlightLength;
	private final String name;
	private final AnimatableIntegerValue opacity;
	private final AnimatablePointValue startPoint;
}
