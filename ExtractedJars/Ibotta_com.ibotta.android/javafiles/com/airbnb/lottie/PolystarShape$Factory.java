// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			PolystarShape, AnimatablePathValue, LottieComposition

static class PolystarShape$Factory
{

	static PolystarShape newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		String s = jsonobject.optString("nm");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "nm">
	//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
	//    3    6:astore_3        
		PolystarShape.Type type = PolystarShape.Type.forValue(jsonobject.optInt("sy"));
	//    4    7:aload_0         
	//    5    8:ldc1            #19  <String "sy">
	//    6   10:invokevirtual   #23  <Method int JSONObject.optInt(String)>
	//    7   13:invokestatic    #29  <Method PolystarShape$Type PolystarShape$Type.forValue(int)>
	//    8   16:astore          4
		AnimatableFloatValue animatablefloatvalue1 = actory.newInstance(jsonobject.optJSONObject("pt"), lottiecomposition, false);
	//    9   18:aload_0         
	//   10   19:ldc1            #31  <String "pt">
	//   11   21:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
	//   15   29:astore          5
		AnimatableValue animatablevalue = AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(jsonobject.optJSONObject("p"), lottiecomposition);
	//   16   31:aload_0         
	//   17   32:ldc1            #42  <String "p">
	//   18   34:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   19   37:aload_1         
	//   20   38:invokestatic    #48  <Method AnimatableValue AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(JSONObject, LottieComposition)>
	//   21   41:astore          6
		AnimatableFloatValue animatablefloatvalue2 = actory.newInstance(jsonobject.optJSONObject("r"), lottiecomposition, false);
	//   22   43:aload_0         
	//   23   44:ldc1            #50  <String "r">
	//   24   46:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   25   49:aload_1         
	//   26   50:iconst_0        
	//   27   51:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
	//   28   54:astore          7
		AnimatableFloatValue animatablefloatvalue3 = actory.newInstance(jsonobject.optJSONObject("or"), lottiecomposition);
	//   29   56:aload_0         
	//   30   57:ldc1            #52  <String "or">
	//   31   59:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   32   62:aload_1         
	//   33   63:invokestatic    #55  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   34   66:astore          8
		AnimatableFloatValue animatablefloatvalue4 = actory.newInstance(jsonobject.optJSONObject("os"), lottiecomposition, false);
	//   35   68:aload_0         
	//   36   69:ldc1            #57  <String "os">
	//   37   71:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   38   74:aload_1         
	//   39   75:iconst_0        
	//   40   76:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
	//   41   79:astore          9
		PolystarShape.Type type1 = PolystarShape.Type.Star;
	//   42   81:getstatic       #61  <Field PolystarShape$Type PolystarShape$Type.Star>
	//   43   84:astore          10
		AnimatableFloatValue animatablefloatvalue = null;
	//   44   86:aconst_null     
	//   45   87:astore_2        
		if(type == type1)
	//*  46   88:aload           4
	//*  47   90:aload           10
	//*  48   92:if_acmpne       123
		{
			animatablefloatvalue = actory.newInstance(jsonobject.optJSONObject("ir"), lottiecomposition);
	//   49   95:aload_0         
	//   50   96:ldc1            #63  <String "ir">
	//   51   98:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   52  101:aload_1         
	//   53  102:invokestatic    #55  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   54  105:astore_2        
			lottiecomposition = ((LottieComposition) (actory.newInstance(jsonobject.optJSONObject("is"), lottiecomposition, false)));
	//   55  106:aload_0         
	//   56  107:ldc1            #65  <String "is">
	//   57  109:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
	//   58  112:aload_1         
	//   59  113:iconst_0        
	//   60  114:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
	//   61  117:astore_1        
			jsonobject = ((JSONObject) (animatablefloatvalue));
	//   62  118:aload_2         
	//   63  119:astore_0        
		} else
	//*  64  120:goto            127
		{
			lottiecomposition = null;
	//   65  123:aconst_null     
	//   66  124:astore_1        
			jsonobject = ((JSONObject) (animatablefloatvalue));
	//   67  125:aload_2         
	//   68  126:astore_0        
		}
		return new PolystarShape(s, type, animatablefloatvalue1, animatablevalue, animatablefloatvalue2, ((AnimatableFloatValue) (jsonobject)), animatablefloatvalue3, ((AnimatableFloatValue) (lottiecomposition)), animatablefloatvalue4, ((PolystarShape._cls1) (null)));
	//   69  127:new             #6   <Class PolystarShape>
	//   70  130:dup             
	//   71  131:aload_3         
	//   72  132:aload           4
	//   73  134:aload           5
	//   74  136:aload           6
	//   75  138:aload           7
	//   76  140:aload_0         
	//   77  141:aload           8
	//   78  143:aload_1         
	//   79  144:aload           9
	//   80  146:aconst_null     
	//   81  147:invokespecial   #69  <Method void PolystarShape(String, PolystarShape$Type, AnimatableFloatValue, AnimatableValue, AnimatableFloatValue, AnimatableFloatValue, AnimatableFloatValue, AnimatableFloatValue, AnimatableFloatValue, PolystarShape$1)>
	//   82  150:areturn         
	}
}
