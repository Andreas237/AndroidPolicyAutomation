// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Color;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			BaseAnimatableValue, StaticKeyframeAnimation, GradientColorKeyframeAnimation, GradientColor, 
//			BaseKeyframeAnimation, KeyframeAnimation, AnimatableValueParser, LottieComposition

class AnimatableGradientColorValue extends BaseAnimatableValue
{
	static final class Factory
	{

		static AnimatableGradientColorValue newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			jsonobject = ((JSONObject) (AnimatableValueParser.newInstance(jsonobject, 1.0F, lottiecomposition, ((AnimatableValue.Factory) (ValueFactory.INSTANCE))).parseJson()));
		//    0    0:aload_0         
		//    1    1:fconst_1        
		//    2    2:aload_1         
		//    3    3:invokestatic    #15  <Method AnimatableGradientColorValue$ValueFactory AnimatableGradientColorValue$ValueFactory.access$000()>
		//    4    6:invokestatic    #20  <Method AnimatableValueParser AnimatableValueParser.newInstance(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
		//    5    9:invokevirtual   #24  <Method AnimatableValueParser$Result AnimatableValueParser.parseJson()>
		//    6   12:astore_0        
			lottiecomposition = ((LottieComposition) ((GradientColor)((AnimatableValueParser.Result) (jsonobject)).initialValue));
		//    7   13:aload_0         
		//    8   14:getfield        #30  <Field Object AnimatableValueParser$Result.initialValue>
		//    9   17:checkcast       #32  <Class GradientColor>
		//   10   20:astore_1        
			return new AnimatableGradientColorValue(((AnimatableValueParser.Result) (jsonobject)).keyframes, ((GradientColor) (lottiecomposition)));
		//   11   21:new             #6   <Class AnimatableGradientColorValue>
		//   12   24:dup             
		//   13   25:aload_0         
		//   14   26:getfield        #36  <Field List AnimatableValueParser$Result.keyframes>
		//   15   29:aload_1         
		//   16   30:aconst_null     
		//   17   31:invokespecial   #40  <Method void AnimatableGradientColorValue(List, GradientColor, AnimatableGradientColorValue$1)>
		//   18   34:areturn         
		}
	}

	private static class ValueFactory
		implements AnimatableValue.Factory
	{

		public GradientColor valueFromObject(Object obj, float f)
		{
			obj = ((Object) ((JSONArray)obj));
		//    0    0:aload_1         
		//    1    1:checkcast       #27  <Class JSONArray>
		//    2    4:astore_1        
			int i = ((JSONArray) (obj)).length() / 4;
		//    3    5:aload_1         
		//    4    6:invokevirtual   #31  <Method int JSONArray.length()>
		//    5    9:iconst_4        
		//    6   10:idiv            
		//    7   11:istore          5
			float af[] = new float[i];
		//    8   13:iload           5
		//    9   15:newarray        float[]
		//   10   17:astore          9
			int ai[] = new int[i];
		//   11   19:iload           5
		//   12   21:newarray        int[]
		//   13   23:astore          10
			GradientColor gradientcolor = new GradientColor(af, ai);
		//   14   25:new             #33  <Class GradientColor>
		//   15   28:dup             
		//   16   29:aload           9
		//   17   31:aload           10
		//   18   33:invokespecial   #36  <Method void GradientColor(float[], int[])>
		//   19   36:astore          11
			i = 0;
		//   20   38:iconst_0        
		//   21   39:istore          5
			int k = 0;
		//   22   41:iconst_0        
		//   23   42:istore          7
			int j = 0;
		//   24   44:iconst_0        
		//   25   45:istore          6
			for(; i < ((JSONArray) (obj)).length(); i++)
		//*  26   47:iload           5
		//*  27   49:aload_1         
		//*  28   50:invokevirtual   #31  <Method int JSONArray.length()>
		//*  29   53:icmpge          169
			{
				int l = i / 4;
		//   30   56:iload           5
		//   31   58:iconst_4        
		//   32   59:idiv            
		//   33   60:istore          8
				double d = ((JSONArray) (obj)).optDouble(i);
		//   34   62:aload_1         
		//   35   63:iload           5
		//   36   65:invokevirtual   #40  <Method double JSONArray.optDouble(int)>
		//   37   68:dstore_3        
				switch(i % 4)
		//*  38   69:iload           5
		//*  39   71:iconst_4        
		//*  40   72:irem            
				{
		//*  41   73:tableswitch     0 3: default 104
		//		               0 153
		//		               1 142
		//		               2 131
		//		               3 107
		//*  42  104:goto            160
				case 3: // '\003'
					ai[l] = Color.argb(255, k, j, (int)(d * 255D));
		//   43  107:aload           10
		//   44  109:iload           8
		//   45  111:sipush          255
		//   46  114:iload           7
		//   47  116:iload           6
		//   48  118:dload_3         
		//   49  119:ldc2w           #41  <Double 255D>
		//   50  122:dmul            
		//   51  123:d2i             
		//   52  124:invokestatic    #48  <Method int Color.argb(int, int, int, int)>
		//   53  127:iastore         
					break;

		//*  54  128:goto            160
				case 2: // '\002'
					j = (int)(d * 255D);
		//   55  131:dload_3         
		//   56  132:ldc2w           #41  <Double 255D>
		//   57  135:dmul            
		//   58  136:d2i             
		//   59  137:istore          6
					break;

		//*  60  139:goto            160
				case 1: // '\001'
					k = (int)(d * 255D);
		//   61  142:dload_3         
		//   62  143:ldc2w           #41  <Double 255D>
		//   63  146:dmul            
		//   64  147:d2i             
		//   65  148:istore          7
					break;

		//*  66  150:goto            160
				case 0: // '\0'
					af[l] = (float)d;
		//   67  153:aload           9
		//   68  155:iload           8
		//   69  157:dload_3         
		//   70  158:d2f             
		//   71  159:fastore         
					break;
				}
			}

		//   72  160:iload           5
		//   73  162:iconst_1        
		//   74  163:iadd            
		//   75  164:istore          5
		//*  76  166:goto            47
			return gradientcolor;
		//   77  169:aload           11
		//   78  171:areturn         
		}

		public volatile Object valueFromObject(Object obj, float f)
		{
			return ((Object) (valueFromObject(obj, f)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:fload_2         
		//    3    3:invokevirtual   #51  <Method GradientColor valueFromObject(Object, float)>
		//    4    6:areturn         
		}

		private static final ValueFactory INSTANCE = new ValueFactory();

		static 
		{
		//    0    0:new             #2   <Class AnimatableGradientColorValue$ValueFactory>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void AnimatableGradientColorValue$ValueFactory()>
		//    3    7:putstatic       #19  <Field AnimatableGradientColorValue$ValueFactory INSTANCE>
		//*   4   10:return          
		}


/*
		static ValueFactory access$000()
		{
			return INSTANCE;
		//    0    0:getstatic       #19  <Field AnimatableGradientColorValue$ValueFactory INSTANCE>
		//    1    3:areturn         
		}

*/

		private ValueFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	private AnimatableGradientColorValue(List list, GradientColor gradientcolor)
	{
		super(list, ((Object) (gradientcolor)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void BaseAnimatableValue(List, Object)>
	//    4    6:return          
	}


	public volatile BaseKeyframeAnimation createAnimation()
	{
		return ((BaseKeyframeAnimation) (createAnimation()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method KeyframeAnimation createAnimation()>
	//    2    4:areturn         
	}

	public KeyframeAnimation createAnimation()
	{
		if(!hasAnimation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #33  <Method boolean hasAnimation()>
	//*   2    4:ifne            19
			return ((KeyframeAnimation) (new StaticKeyframeAnimation(initialValue)));
	//    3    7:new             #35  <Class StaticKeyframeAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field Object initialValue>
	//    7   15:invokespecial   #42  <Method void StaticKeyframeAnimation(Object)>
	//    8   18:areturn         
		else
			return ((KeyframeAnimation) (new GradientColorKeyframeAnimation(keyframes)));
	//    9   19:new             #44  <Class GradientColorKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #48  <Field List keyframes>
	//   13   27:invokespecial   #51  <Method void GradientColorKeyframeAnimation(List)>
	//   14   30:areturn         
	}
}
