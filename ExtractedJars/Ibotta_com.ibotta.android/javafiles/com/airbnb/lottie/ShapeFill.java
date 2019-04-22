// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableColorValue, AnimatableIntegerValue, LottieComposition

class ShapeFill
{
	static class Factory
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
				obj = ((Object) (AnimatableColorValue.Factory.newInstance(((JSONObject) (obj)), lottiecomposition)));
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
				lottiecomposition = ((LottieComposition) (AnimatableIntegerValue.Factory.newInstance(jsonobject1, lottiecomposition)));
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
			return new ShapeFill(s, flag, ((android.graphics.Path.FillType) (jsonobject)), ((AnimatableColorValue) (obj)), ((AnimatableIntegerValue) (lottiecomposition)));
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


	private ShapeFill(String s, boolean flag, android.graphics.Path.FillType filltype, AnimatableColorValue animatablecolorvalue, AnimatableIntegerValue animatableintegervalue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field String name>
		fillEnabled = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field boolean fillEnabled>
		fillType = filltype;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field android.graphics.Path$FillType fillType>
		color = animatablecolorvalue;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field AnimatableColorValue color>
		opacity = animatableintegervalue;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #35  <Field AnimatableIntegerValue opacity>
	//   17   31:return          
	}


	AnimatableColorValue getColor()
	{
		return color;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnimatableColorValue color>
	//    2    4:areturn         
	}

	android.graphics.Path.FillType getFillType()
	{
		return fillType;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field android.graphics.Path$FillType fillType>
	//    2    4:areturn         
	}

	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String name>
	//    2    4:areturn         
	}

	AnimatableIntegerValue getOpacity()
	{
		return opacity;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AnimatableIntegerValue opacity>
	//    2    4:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #52  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("ShapeFill{color=");
	//    4    8:aload_2         
	//    5    9:ldc1            #55  <String "ShapeFill{color=">
	//    6   11:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		Object obj = ((Object) (color));
	//    8   15:aload_0         
	//    9   16:getfield        #33  <Field AnimatableColorValue color>
	//   10   19:astore_1        
		if(obj == null)
	//*  11   20:aload_1         
	//*  12   21:ifnonnull       30
			obj = "null";
	//   13   24:ldc1            #61  <String "null">
	//   14   26:astore_1        
		else
	//*  15   27:goto            44
			obj = ((Object) (Integer.toHexString(((Integer)((AnimatableColorValue) (obj)).getInitialValue()).intValue())));
	//   16   30:aload_1         
	//   17   31:invokevirtual   #67  <Method Object AnimatableColorValue.getInitialValue()>
	//   18   34:checkcast       #69  <Class Integer>
	//   19   37:invokevirtual   #73  <Method int Integer.intValue()>
	//   20   40:invokestatic    #77  <Method String Integer.toHexString(int)>
	//   21   43:astore_1        
		stringbuilder.append(((String) (obj)));
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(", fillEnabled=");
	//   26   50:aload_2         
	//   27   51:ldc1            #79  <String ", fillEnabled=">
	//   28   53:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
		stringbuilder.append(fillEnabled);
	//   30   57:aload_2         
	//   31   58:aload_0         
	//   32   59:getfield        #29  <Field boolean fillEnabled>
	//   33   62:invokevirtual   #82  <Method StringBuilder StringBuilder.append(boolean)>
	//   34   65:pop             
		stringbuilder.append(", opacity=");
	//   35   66:aload_2         
	//   36   67:ldc1            #84  <String ", opacity=">
	//   37   69:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:pop             
		obj = ((Object) (opacity));
	//   39   73:aload_0         
	//   40   74:getfield        #35  <Field AnimatableIntegerValue opacity>
	//   41   77:astore_1        
		if(obj == null)
	//*  42   78:aload_1         
	//*  43   79:ifnonnull       88
			obj = "null";
	//   44   82:ldc1            #61  <String "null">
	//   45   84:astore_1        
		else
	//*  46   85:goto            93
			obj = ((Object) (((AnimatableIntegerValue) (obj)).getInitialValue()));
	//   47   88:aload_1         
	//   48   89:invokevirtual   #89  <Method Integer AnimatableIntegerValue.getInitialValue()>
	//   49   92:astore_1        
		stringbuilder.append(obj);
	//   50   93:aload_2         
	//   51   94:aload_1         
	//   52   95:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
	//   53   98:pop             
		stringbuilder.append('}');
	//   54   99:aload_2         
	//   55  100:bipush          125
	//   56  102:invokevirtual   #95  <Method StringBuilder StringBuilder.append(char)>
	//   57  105:pop             
		return stringbuilder.toString();
	//   58  106:aload_2         
	//   59  107:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   60  110:areturn         
	}

	private final AnimatableColorValue color;
	private final boolean fillEnabled;
	private final android.graphics.Path.FillType fillType;
	private final String name;
	private final AnimatableIntegerValue opacity;
}
