// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableFloatValue, AnimatableValue, AnimatablePathValue, LottieComposition

class PolystarShape
{
	static class Factory
	{

		static PolystarShape newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			String s = jsonobject.optString("nm");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "nm">
		//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//    3    6:astore_3        
			Type type1 = Type.forValue(jsonobject.optInt("sy"));
		//    4    7:aload_0         
		//    5    8:ldc1            #19  <String "sy">
		//    6   10:invokevirtual   #23  <Method int JSONObject.optInt(String)>
		//    7   13:invokestatic    #29  <Method PolystarShape$Type PolystarShape$Type.forValue(int)>
		//    8   16:astore          4
			AnimatableFloatValue animatablefloatvalue1 = AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("pt"), lottiecomposition, false);
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
			AnimatableFloatValue animatablefloatvalue2 = AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("r"), lottiecomposition, false);
		//   22   43:aload_0         
		//   23   44:ldc1            #50  <String "r">
		//   24   46:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
		//   25   49:aload_1         
		//   26   50:iconst_0        
		//   27   51:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
		//   28   54:astore          7
			AnimatableFloatValue animatablefloatvalue3 = AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("or"), lottiecomposition);
		//   29   56:aload_0         
		//   30   57:ldc1            #52  <String "or">
		//   31   59:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
		//   32   62:aload_1         
		//   33   63:invokestatic    #55  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   34   66:astore          8
			AnimatableFloatValue animatablefloatvalue4 = AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("os"), lottiecomposition, false);
		//   35   68:aload_0         
		//   36   69:ldc1            #57  <String "os">
		//   37   71:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
		//   38   74:aload_1         
		//   39   75:iconst_0        
		//   40   76:invokestatic    #40  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition, boolean)>
		//   41   79:astore          9
			Type type2 = Type.Star;
		//   42   81:getstatic       #61  <Field PolystarShape$Type PolystarShape$Type.Star>
		//   43   84:astore          10
			AnimatableFloatValue animatablefloatvalue = null;
		//   44   86:aconst_null     
		//   45   87:astore_2        
			if(type1 == type2)
		//*  46   88:aload           4
		//*  47   90:aload           10
		//*  48   92:if_acmpne       123
			{
				animatablefloatvalue = AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("ir"), lottiecomposition);
		//   49   95:aload_0         
		//   50   96:ldc1            #63  <String "ir">
		//   51   98:invokevirtual   #35  <Method JSONObject JSONObject.optJSONObject(String)>
		//   52  101:aload_1         
		//   53  102:invokestatic    #55  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   54  105:astore_2        
				lottiecomposition = ((LottieComposition) (AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("is"), lottiecomposition, false)));
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
			return new PolystarShape(s, type1, animatablefloatvalue1, animatablevalue, animatablefloatvalue2, ((AnimatableFloatValue) (jsonobject)), animatablefloatvalue3, ((AnimatableFloatValue) (lottiecomposition)), animatablefloatvalue4);
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

	static final class Type extends Enum
	{

		static Type forValue(int i)
		{
			Type atype[] = values();
		//    0    0:invokestatic    #43  <Method PolystarShape$Type[] values()>
		//    1    3:astore_3        
			int k = atype.length;
		//    2    4:aload_3         
		//    3    5:arraylength     
		//    4    6:istore_2        
			for(int j = 0; j < k; j++)
		//*   5    7:iconst_0        
		//*   6    8:istore_1        
		//*   7    9:iload_1         
		//*   8   10:iload_2         
		//*   9   11:icmpge          38
			{
				Type type1 = atype[j];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(type1.value == i)
		//*  14   19:aload           4
		//*  15   21:getfield        #35  <Field int value>
		//*  16   24:iload_0         
		//*  17   25:icmpne          31
					return type1;
		//   18   28:aload           4
		//   19   30:areturn         
			}

		//   20   31:iload_1         
		//   21   32:iconst_1        
		//   22   33:iadd            
		//   23   34:istore_1        
		//*  24   35:goto            9
			return null;
		//   25   38:aconst_null     
		//   26   39:areturn         
		}

		public static Type valueOf(String s)
		{
			return (Type)Enum.valueOf(com/airbnb/lottie/PolystarShape$Type, s);
		//    0    0:ldc1            #2   <Class PolystarShape$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class PolystarShape$Type>
		//    4    9:areturn         
		}

		public static Type[] values()
		{
			return (Type[])((Type []) ($VALUES)).clone();
		//    0    0:getstatic       #29  <Field PolystarShape$Type[] $VALUES>
		//    1    3:invokevirtual   #53  <Method Object _5B_Lcom.airbnb.lottie.PolystarShape$Type_3B_.clone()>
		//    2    6:checkcast       #49  <Class PolystarShape$Type[]>
		//    3    9:areturn         
		}

		private static final Type $VALUES[];
		public static final Type Polygon;
		public static final Type Star;
		private final int value;

		static 
		{
			Star = new Type("Star", 0, 1);
		//    0    0:new             #2   <Class PolystarShape$Type>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "Star">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #22  <Method void PolystarShape$Type(String, int, int)>
		//    6   11:putstatic       #24  <Field PolystarShape$Type Star>
			Polygon = new Type("Polygon", 1, 2);
		//    7   14:new             #2   <Class PolystarShape$Type>
		//    8   17:dup             
		//    9   18:ldc1            #25  <String "Polygon">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #22  <Method void PolystarShape$Type(String, int, int)>
		//   13   25:putstatic       #27  <Field PolystarShape$Type Polygon>
			$VALUES = (new Type[] {
				Star, Polygon
			});
		//   14   28:iconst_2        
		//   15   29:anewarray       Type[]
		//   16   32:dup             
		//   17   33:iconst_0        
		//   18   34:getstatic       #24  <Field PolystarShape$Type Star>
		//   19   37:aastore         
		//   20   38:dup             
		//   21   39:iconst_1        
		//   22   40:getstatic       #27  <Field PolystarShape$Type Polygon>
		//   23   43:aastore         
		//   24   44:putstatic       #29  <Field PolystarShape$Type[] $VALUES>
		//*  25   47:return          
		}

		private Type(String s, int i, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
			value = j;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #35  <Field int value>
		//    7   11:return          
		}
	}


	private PolystarShape(String s, Type type1, AnimatableFloatValue animatablefloatvalue, AnimatableValue animatablevalue, AnimatableFloatValue animatablefloatvalue1, AnimatableFloatValue animatablefloatvalue2, AnimatableFloatValue animatablefloatvalue3, 
			AnimatableFloatValue animatablefloatvalue4, AnimatableFloatValue animatablefloatvalue5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field String name>
		type = type1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field PolystarShape$Type type>
		points = animatablefloatvalue;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field AnimatableFloatValue points>
		position = animatablevalue;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #39  <Field AnimatableValue position>
		rotation = animatablefloatvalue1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #41  <Field AnimatableFloatValue rotation>
		innerRadius = animatablefloatvalue2;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #43  <Field AnimatableFloatValue innerRadius>
		outerRadius = animatablefloatvalue3;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #45  <Field AnimatableFloatValue outerRadius>
		innerRoundedness = animatablefloatvalue4;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #47  <Field AnimatableFloatValue innerRoundedness>
		outerRoundedness = animatablefloatvalue5;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #49  <Field AnimatableFloatValue outerRoundedness>
	//   29   55:return          
	}


	AnimatableFloatValue getInnerRadius()
	{
		return innerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field AnimatableFloatValue innerRadius>
	//    2    4:areturn         
	}

	AnimatableFloatValue getInnerRoundedness()
	{
		return innerRoundedness;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field AnimatableFloatValue innerRoundedness>
	//    2    4:areturn         
	}

	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String name>
	//    2    4:areturn         
	}

	AnimatableFloatValue getOuterRadius()
	{
		return outerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AnimatableFloatValue outerRadius>
	//    2    4:areturn         
	}

	AnimatableFloatValue getOuterRoundedness()
	{
		return outerRoundedness;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field AnimatableFloatValue outerRoundedness>
	//    2    4:areturn         
	}

	AnimatableFloatValue getPoints()
	{
		return points;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnimatableFloatValue points>
	//    2    4:areturn         
	}

	AnimatableValue getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field AnimatableValue position>
	//    2    4:areturn         
	}

	AnimatableFloatValue getRotation()
	{
		return rotation;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AnimatableFloatValue rotation>
	//    2    4:areturn         
	}

	Type getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PolystarShape$Type type>
	//    2    4:areturn         
	}

	private final AnimatableFloatValue innerRadius;
	private final AnimatableFloatValue innerRoundedness;
	private final String name;
	private final AnimatableFloatValue outerRadius;
	private final AnimatableFloatValue outerRoundedness;
	private final AnimatableFloatValue points;
	private final AnimatableValue position;
	private final AnimatableFloatValue rotation;
	private final Type type;
}
