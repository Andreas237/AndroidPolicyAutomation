// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.Collections;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			ModifierContent, TransformKeyframeAnimation, AnimatablePathValue, AnimatableIntegerValue, 
//			AnimatableValue, AnimatableFloatValue, AnimatableScaleValue, ScaleXY, 
//			LottieComposition

class AnimatableTransform
	implements ModifierContent
{
	static class Factory
	{

		static AnimatableTransform newInstance()
		{
			return new AnimatableTransform(new AnimatablePathValue(), ((AnimatableValue) (new AnimatablePathValue())), AnimatableScaleValue.Factory.newInstance(), AnimatableFloatValue.Factory.newInstance(), AnimatableIntegerValue.Factory.newInstance());
		//    0    0:new             #6   <Class AnimatableTransform>
		//    1    3:dup             
		//    2    4:new             #11  <Class AnimatablePathValue>
		//    3    7:dup             
		//    4    8:invokespecial   #15  <Method void AnimatablePathValue()>
		//    5   11:new             #11  <Class AnimatablePathValue>
		//    6   14:dup             
		//    7   15:invokespecial   #15  <Method void AnimatablePathValue()>
		//    8   18:invokestatic    #20  <Method AnimatableScaleValue AnimatableScaleValue$Factory.newInstance()>
		//    9   21:invokestatic    #25  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance()>
		//   10   24:invokestatic    #30  <Method AnimatableIntegerValue AnimatableIntegerValue$Factory.newInstance()>
		//   11   27:aconst_null     
		//   12   28:invokespecial   #33  <Method void AnimatableTransform(AnimatablePathValue, AnimatableValue, AnimatableScaleValue, AnimatableFloatValue, AnimatableIntegerValue, AnimatableTransform$1)>
		//   13   31:areturn         
		}

		static AnimatableTransform newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			Object obj = ((Object) (jsonobject.optJSONObject("a")));
		//    0    0:aload_0         
		//    1    1:ldc1            #37  <String "a">
		//    2    3:invokevirtual   #43  <Method JSONObject JSONObject.optJSONObject(String)>
		//    3    6:astore_2        
			if(obj != null)
		//*   4    7:aload_2         
		//*   5    8:ifnull          29
			{
				obj = ((Object) (new AnimatablePathValue(((JSONObject) (obj)).opt("k"), lottiecomposition)));
		//    6   11:new             #11  <Class AnimatablePathValue>
		//    7   14:dup             
		//    8   15:aload_2         
		//    9   16:ldc1            #45  <String "k">
		//   10   18:invokevirtual   #49  <Method Object JSONObject.opt(String)>
		//   11   21:aload_1         
		//   12   22:invokespecial   #52  <Method void AnimatablePathValue(Object, LottieComposition)>
		//   13   25:astore_2        
			} else
		//*  14   26:goto            36
			{
				throwMissingTransform("anchor");
		//   15   29:ldc1            #54  <String "anchor">
		//   16   31:invokestatic    #58  <Method void throwMissingTransform(String)>
				obj = null;
		//   17   34:aconst_null     
		//   18   35:astore_2        
			}
			Object obj1 = ((Object) (jsonobject.optJSONObject("p")));
		//   19   36:aload_0         
		//   20   37:ldc1            #60  <String "p">
		//   21   39:invokevirtual   #43  <Method JSONObject JSONObject.optJSONObject(String)>
		//   22   42:astore_3        
			if(obj1 != null)
		//*  23   43:aload_3         
		//*  24   44:ifnull          56
			{
				obj1 = ((Object) (AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(((JSONObject) (obj1)), lottiecomposition)));
		//   25   47:aload_3         
		//   26   48:aload_1         
		//   27   49:invokestatic    #64  <Method AnimatableValue AnimatablePathValue.createAnimatablePathOrSplitDimensionPath(JSONObject, LottieComposition)>
		//   28   52:astore_3        
			} else
		//*  29   53:goto            63
			{
				throwMissingTransform("position");
		//   30   56:ldc1            #66  <String "position">
		//   31   58:invokestatic    #58  <Method void throwMissingTransform(String)>
				obj1 = null;
		//   32   61:aconst_null     
		//   33   62:astore_3        
			}
			Object obj2 = ((Object) (jsonobject.optJSONObject("s")));
		//   34   63:aload_0         
		//   35   64:ldc1            #68  <String "s">
		//   36   66:invokevirtual   #43  <Method JSONObject JSONObject.optJSONObject(String)>
		//   37   69:astore          4
			if(obj2 != null)
		//*  38   71:aload           4
		//*  39   73:ifnull          87
				obj2 = ((Object) (AnimatableScaleValue.Factory.newInstance(((JSONObject) (obj2)), lottiecomposition)));
		//   40   76:aload           4
		//   41   78:aload_1         
		//   42   79:invokestatic    #71  <Method AnimatableScaleValue AnimatableScaleValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   43   82:astore          4
			else
		//*  44   84:goto            106
				obj2 = ((Object) (new AnimatableScaleValue(Collections.emptyList(), new ScaleXY())));
		//   45   87:new             #73  <Class AnimatableScaleValue>
		//   46   90:dup             
		//   47   91:invokestatic    #79  <Method java.util.List Collections.emptyList()>
		//   48   94:new             #81  <Class ScaleXY>
		//   49   97:dup             
		//   50   98:invokespecial   #82  <Method void ScaleXY()>
		//   51  101:invokespecial   #85  <Method void AnimatableScaleValue(java.util.List, ScaleXY)>
		//   52  104:astore          4
			JSONObject jsonobject1 = jsonobject.optJSONObject("r");
		//   53  106:aload_0         
		//   54  107:ldc1            #87  <String "r">
		//   55  109:invokevirtual   #43  <Method JSONObject JSONObject.optJSONObject(String)>
		//   56  112:astore          6
			Object obj3 = ((Object) (jsonobject1));
		//   57  114:aload           6
		//   58  116:astore          5
			if(jsonobject1 == null)
		//*  59  118:aload           6
		//*  60  120:ifnonnull       131
				obj3 = ((Object) (jsonobject.optJSONObject("rz")));
		//   61  123:aload_0         
		//   62  124:ldc1            #89  <String "rz">
		//   63  126:invokevirtual   #43  <Method JSONObject JSONObject.optJSONObject(String)>
		//   64  129:astore          5
			if(obj3 != null)
		//*  65  131:aload           5
		//*  66  133:ifnull          148
			{
				obj3 = ((Object) (AnimatableFloatValue.Factory.newInstance(((JSONObject) (obj3)), lottiecomposition, false)));
		//   67  136:aload           5
		//   68  138:aload_1         
		//   69  139:iconst_0        
		//   70  140:invokestatic    #92  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
		//   71  143:astore          5
			} else
		//*  72  145:goto            156
			{
				throwMissingTransform("rotation");
		//   73  148:ldc1            #94  <String "rotation">
		//   74  150:invokestatic    #58  <Method void throwMissingTransform(String)>
				obj3 = null;
		//   75  153:aconst_null     
		//   76  154:astore          5
			}
			jsonobject = jsonobject.optJSONObject("o");
		//   77  156:aload_0         
		//   78  157:ldc1            #96  <String "o">
		//   79  159:invokevirtual   #43  <Method JSONObject JSONObject.optJSONObject(String)>
		//   80  162:astore_0        
			if(jsonobject != null)
		//*  81  163:aload_0         
		//*  82  164:ifnull          176
				jsonobject = ((JSONObject) (AnimatableIntegerValue.Factory.newInstance(jsonobject, lottiecomposition)));
		//   83  167:aload_0         
		//   84  168:aload_1         
		//   85  169:invokestatic    #99  <Method AnimatableIntegerValue AnimatableIntegerValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   86  172:astore_0        
			else
		//*  87  173:goto            192
				jsonobject = ((JSONObject) (new AnimatableIntegerValue(Collections.emptyList(), Integer.valueOf(100))));
		//   88  176:new             #101 <Class AnimatableIntegerValue>
		//   89  179:dup             
		//   90  180:invokestatic    #79  <Method java.util.List Collections.emptyList()>
		//   91  183:bipush          100
		//   92  185:invokestatic    #107 <Method Integer Integer.valueOf(int)>
		//   93  188:invokespecial   #110 <Method void AnimatableIntegerValue(java.util.List, Integer)>
		//   94  191:astore_0        
			return new AnimatableTransform(((AnimatablePathValue) (obj)), ((AnimatableValue) (obj1)), ((AnimatableScaleValue) (obj2)), ((AnimatableFloatValue) (obj3)), ((AnimatableIntegerValue) (jsonobject)));
		//   95  192:new             #6   <Class AnimatableTransform>
		//   96  195:dup             
		//   97  196:aload_2         
		//   98  197:aload_3         
		//   99  198:aload           4
		//  100  200:aload           5
		//  101  202:aload_0         
		//  102  203:aconst_null     
		//  103  204:invokespecial   #33  <Method void AnimatableTransform(AnimatablePathValue, AnimatableValue, AnimatableScaleValue, AnimatableFloatValue, AnimatableIntegerValue, AnimatableTransform$1)>
		//  104  207:areturn         
		}

		private static void throwMissingTransform(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #112 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #113 <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Missing transform for ");
		//    4    8:aload_1         
		//    5    9:ldc1            #115 <String "Missing transform for ">
		//    6   11:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(s);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
		//   11   20:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
		//   12   21:new             #121 <Class IllegalArgumentException>
		//   13   24:dup             
		//   14   25:aload_1         
		//   15   26:invokevirtual   #125 <Method String StringBuilder.toString()>
		//   16   29:invokespecial   #127 <Method void IllegalArgumentException(String)>
		//   17   32:athrow          
		}
	}


	private AnimatableTransform(AnimatablePathValue animatablepathvalue, AnimatableValue animatablevalue, AnimatableScaleValue animatablescalevalue, AnimatableFloatValue animatablefloatvalue, AnimatableIntegerValue animatableintegervalue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		anchorPoint = animatablepathvalue;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field AnimatablePathValue anchorPoint>
		position = animatablevalue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field AnimatableValue position>
		scale = animatablescalevalue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #33  <Field AnimatableScaleValue scale>
		rotation = animatablefloatvalue;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field AnimatableFloatValue rotation>
		opacity = animatableintegervalue;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #37  <Field AnimatableIntegerValue opacity>
	//   17   31:return          
	}


	public TransformKeyframeAnimation createAnimation()
	{
		return new TransformKeyframeAnimation(this);
	//    0    0:new             #47  <Class TransformKeyframeAnimation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method void TransformKeyframeAnimation(AnimatableTransform)>
	//    4    8:areturn         
	}

	AnimatablePathValue getAnchorPoint()
	{
		return anchorPoint;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field AnimatablePathValue anchorPoint>
	//    2    4:areturn         
	}

	AnimatableIntegerValue getOpacity()
	{
		return opacity;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnimatableIntegerValue opacity>
	//    2    4:areturn         
	}

	AnimatableValue getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnimatableValue position>
	//    2    4:areturn         
	}

	AnimatableFloatValue getRotation()
	{
		return rotation;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AnimatableFloatValue rotation>
	//    2    4:areturn         
	}

	AnimatableScaleValue getScale()
	{
		return scale;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnimatableScaleValue scale>
	//    2    4:areturn         
	}

	private final AnimatablePathValue anchorPoint;
	private final AnimatableIntegerValue opacity;
	private final AnimatableValue position;
	private final AnimatableFloatValue rotation;
	private final AnimatableScaleValue scale;
}
