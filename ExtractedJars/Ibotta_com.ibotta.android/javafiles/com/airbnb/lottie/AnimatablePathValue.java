// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableValue, Keyframe, LottieComposition, JsonUtils, 
//			AnimatableSplitDimensionPathValue, StaticKeyframeAnimation, PathKeyframeAnimation, BaseKeyframeAnimation

class AnimatablePathValue
	implements AnimatableValue
{
	private static class ValueFactory
		implements AnimatableValue.Factory
	{

		public PointF valueFromObject(Object obj, float f)
		{
			return JsonUtils.pointFromJsonArray((JSONArray)obj, f);
		//    0    0:aload_1         
		//    1    1:checkcast       #28  <Class JSONArray>
		//    2    4:fload_2         
		//    3    5:invokestatic    #34  <Method PointF JsonUtils.pointFromJsonArray(JSONArray, float)>
		//    4    8:areturn         
		}

		public volatile Object valueFromObject(Object obj, float f)
		{
			return ((Object) (valueFromObject(obj, f)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:fload_2         
		//    3    3:invokevirtual   #37  <Method PointF valueFromObject(Object, float)>
		//    4    6:areturn         
		}

		private static final AnimatableValue.Factory INSTANCE = new ValueFactory();

		static 
		{
		//    0    0:new             #2   <Class AnimatablePathValue$ValueFactory>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void AnimatablePathValue$ValueFactory()>
		//    3    7:putstatic       #20  <Field AnimatableValue$Factory INSTANCE>
		//*   4   10:return          
		}


/*
		static AnimatableValue.Factory access$000()
		{
			return INSTANCE;
		//    0    0:getstatic       #20  <Field AnimatableValue$Factory INSTANCE>
		//    1    3:areturn         
		}

*/

		private ValueFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}
	}


	AnimatablePathValue()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		keyframes = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List keyframes>
		initialPoint = new PointF(0.0F, 0.0F);
	//    7   15:aload_0         
	//    8   16:new             #26  <Class PointF>
	//    9   19:dup             
	//   10   20:fconst_0        
	//   11   21:fconst_0        
	//   12   22:invokespecial   #29  <Method void PointF(float, float)>
	//   13   25:putfield        #31  <Field PointF initialPoint>
	//   14   28:return          
	}

	AnimatablePathValue(Object obj, LottieComposition lottiecomposition)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		keyframes = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayList()>
	//    6   12:putfield        #24  <Field List keyframes>
		if(hasKeyframes(obj))
	//*   7   15:aload_0         
	//*   8   16:aload_1         
	//*   9   17:invokespecial   #37  <Method boolean hasKeyframes(Object)>
	//*  10   20:ifeq            83
		{
			obj = ((Object) ((JSONArray)obj));
	//   11   23:aload_1         
	//   12   24:checkcast       #39  <Class JSONArray>
	//   13   27:astore_1        
			int j = ((JSONArray) (obj)).length();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #43  <Method int JSONArray.length()>
	//   16   32:istore          4
			for(int i = 0; i < j; i++)
	//*  17   34:iconst_0        
	//*  18   35:istore_3        
	//*  19   36:iload_3         
	//*  20   37:iload           4
	//*  21   39:icmpge          75
			{
				PathKeyframe pathkeyframe = PathKeyframe.Factory.newInstance(((JSONArray) (obj)).optJSONObject(i), lottiecomposition, ValueFactory.INSTANCE);
	//   22   42:aload_1         
	//   23   43:iload_3         
	//   24   44:invokevirtual   #47  <Method JSONObject JSONArray.optJSONObject(int)>
	//   25   47:aload_2         
	//   26   48:invokestatic    #51  <Method AnimatableValue$Factory AnimatablePathValue$ValueFactory.access$000()>
	//   27   51:invokestatic    #57  <Method PathKeyframe PathKeyframe$Factory.newInstance(JSONObject, LottieComposition, AnimatableValue$Factory)>
	//   28   54:astore          5
				keyframes.add(((Object) (pathkeyframe)));
	//   29   56:aload_0         
	//   30   57:getfield        #24  <Field List keyframes>
	//   31   60:aload           5
	//   32   62:invokeinterface #62  <Method boolean List.add(Object)>
	//   33   67:pop             
			}

	//   34   68:iload_3         
	//   35   69:iconst_1        
	//   36   70:iadd            
	//   37   71:istore_3        
	//*  38   72:goto            36
			Keyframe.setEndFrames(keyframes);
	//   39   75:aload_0         
	//   40   76:getfield        #24  <Field List keyframes>
	//   41   79:invokestatic    #68  <Method void Keyframe.setEndFrames(List)>
			return;
	//   42   82:return          
		} else
		{
			initialPoint = JsonUtils.pointFromJsonArray((JSONArray)obj, lottiecomposition.getDpScale());
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:checkcast       #39  <Class JSONArray>
	//   46   88:aload_2         
	//   47   89:invokevirtual   #74  <Method float LottieComposition.getDpScale()>
	//   48   92:invokestatic    #80  <Method PointF JsonUtils.pointFromJsonArray(JSONArray, float)>
	//   49   95:putfield        #31  <Field PointF initialPoint>
			return;
	//   50   98:return          
		}
	}

	static AnimatableValue createAnimatablePathOrSplitDimensionPath(JSONObject jsonobject, LottieComposition lottiecomposition)
	{
		if(jsonobject.has("k"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #84  <String "k">
	//*   2    3:invokevirtual   #90  <Method boolean JSONObject.has(String)>
	//*   3    6:ifeq            24
			return ((AnimatableValue) (new AnimatablePathValue(jsonobject.opt("k"), lottiecomposition)));
	//    4    9:new             #2   <Class AnimatablePathValue>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:ldc1            #84  <String "k">
	//    8   16:invokevirtual   #94  <Method Object JSONObject.opt(String)>
	//    9   19:aload_1         
	//   10   20:invokespecial   #96  <Method void AnimatablePathValue(Object, LottieComposition)>
	//   11   23:areturn         
		else
			return ((AnimatableValue) (new AnimatableSplitDimensionPathValue(AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("x"), lottiecomposition), AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("y"), lottiecomposition))));
	//   12   24:new             #98  <Class AnimatableSplitDimensionPathValue>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:ldc1            #100 <String "x">
	//   16   31:invokevirtual   #103 <Method JSONObject JSONObject.optJSONObject(String)>
	//   17   34:aload_1         
	//   18   35:invokestatic    #108 <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   19   38:aload_0         
	//   20   39:ldc1            #110 <String "y">
	//   21   41:invokevirtual   #103 <Method JSONObject JSONObject.optJSONObject(String)>
	//   22   44:aload_1         
	//   23   45:invokestatic    #108 <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
	//   24   48:invokespecial   #113 <Method void AnimatableSplitDimensionPathValue(AnimatableFloatValue, AnimatableFloatValue)>
	//   25   51:areturn         
	}

	private boolean hasKeyframes(Object obj)
	{
		boolean flag = obj instanceof JSONArray;
	//    0    0:aload_1         
	//    1    1:instanceof      #39  <Class JSONArray>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((JSONArray)obj).opt(0);
	//    9   13:aload_1         
	//   10   14:checkcast       #39  <Class JSONArray>
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #118 <Method Object JSONArray.opt(int)>
	//   13   21:astore_1        
		flag = flag1;
	//   14   22:iload_3         
	//   15   23:istore_2        
		if(obj instanceof JSONObject)
	//*  16   24:aload_1         
	//*  17   25:instanceof      #86  <Class JSONObject>
	//*  18   28:ifeq            47
		{
			flag = flag1;
	//   19   31:iload_3         
	//   20   32:istore_2        
			if(((JSONObject)obj).has("t"))
	//*  21   33:aload_1         
	//*  22   34:checkcast       #86  <Class JSONObject>
	//*  23   37:ldc1            #120 <String "t">
	//*  24   39:invokevirtual   #90  <Method boolean JSONObject.has(String)>
	//*  25   42:ifeq            47
				flag = true;
	//   26   45:iconst_1        
	//   27   46:istore_2        
		}
		return flag;
	//   28   47:iload_2         
	//   29   48:ireturn         
	}

	public BaseKeyframeAnimation createAnimation()
	{
		if(!hasAnimation())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean hasAnimation()>
	//*   2    4:ifne            19
			return ((BaseKeyframeAnimation) (new StaticKeyframeAnimation(((Object) (initialPoint)))));
	//    3    7:new             #128 <Class StaticKeyframeAnimation>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field PointF initialPoint>
	//    7   15:invokespecial   #131 <Method void StaticKeyframeAnimation(Object)>
	//    8   18:areturn         
		else
			return ((BaseKeyframeAnimation) (new PathKeyframeAnimation(keyframes)));
	//    9   19:new             #133 <Class PathKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #24  <Field List keyframes>
	//   13   27:invokespecial   #135 <Method void PathKeyframeAnimation(List)>
	//   14   30:areturn         
	}

	public boolean hasAnimation()
	{
		return keyframes.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List keyframes>
	//    2    4:invokeinterface #139 <Method boolean List.isEmpty()>
	//    3    9:iconst_1        
	//    4   10:ixor            
	//    5   11:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #143 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #144 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("initialPoint=");
	//    4    8:aload_1         
	//    5    9:ldc1            #146 <String "initialPoint=">
	//    6   11:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (initialPoint)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field PointF initialPoint>
	//   11   20:invokevirtual   #153 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #155 <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	private PointF initialPoint;
	private final List keyframes;
}
