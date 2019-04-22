// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			Keyframe, LottieComposition

class AnimatableValueParser
{
	static class Result
	{

		final Object initialValue;
		final List keyframes;

		Result(List list, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			keyframes = list;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field List keyframes>
			initialValue = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Object initialValue>
		//    8   14:return          
		}
	}


	private AnimatableValueParser(JSONObject jsonobject, float f, LottieComposition lottiecomposition, AnimatableValue.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		json = jsonobject;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field JSONObject json>
		scale = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #27  <Field float scale>
		composition = lottiecomposition;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field LottieComposition composition>
		valueFactory = factory;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #31  <Field AnimatableValue$Factory valueFactory>
	//   14   25:return          
	}

	private static boolean hasKeyframes(Object obj)
	{
		boolean flag = obj instanceof JSONArray;
	//    0    0:aload_0         
	//    1    1:instanceof      #39  <Class JSONArray>
	//    2    4:istore_1        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(!flag)
	//*   5    7:iload_1         
	//*   6    8:ifne            13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		obj = ((JSONArray)obj).opt(0);
	//    9   13:aload_0         
	//   10   14:checkcast       #39  <Class JSONArray>
	//   11   17:iconst_0        
	//   12   18:invokevirtual   #43  <Method Object JSONArray.opt(int)>
	//   13   21:astore_0        
		flag = flag1;
	//   14   22:iload_2         
	//   15   23:istore_1        
		if(obj instanceof JSONObject)
	//*  16   24:aload_0         
	//*  17   25:instanceof      #45  <Class JSONObject>
	//*  18   28:ifeq            47
		{
			flag = flag1;
	//   19   31:iload_2         
	//   20   32:istore_1        
			if(((JSONObject)obj).has("t"))
	//*  21   33:aload_0         
	//*  22   34:checkcast       #45  <Class JSONObject>
	//*  23   37:ldc1            #47  <String "t">
	//*  24   39:invokevirtual   #51  <Method boolean JSONObject.has(String)>
	//*  25   42:ifeq            47
				flag = true;
	//   26   45:iconst_1        
	//   27   46:istore_1        
		}
		return flag;
	//   28   47:iload_1         
	//   29   48:ireturn         
	}

	static AnimatableValueParser newInstance(JSONObject jsonobject, float f, LottieComposition lottiecomposition, AnimatableValue.Factory factory)
	{
		return new AnimatableValueParser(jsonobject, f, lottiecomposition, factory);
	//    0    0:new             #2   <Class AnimatableValueParser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #55  <Method void AnimatableValueParser(JSONObject, float, LottieComposition, AnimatableValue$Factory)>
	//    7   11:areturn         
	}

	private Object parseInitialValue(List list)
	{
		if(json != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field JSONObject json>
	//*   2    4:ifnull          53
		{
			if(!list.isEmpty())
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #64  <Method boolean List.isEmpty()>
	//*   5   13:ifne            30
				return ((Keyframe)list.get(0)).startValue;
	//    6   16:aload_1         
	//    7   17:iconst_0        
	//    8   18:invokeinterface #67  <Method Object List.get(int)>
	//    9   23:checkcast       #69  <Class Keyframe>
	//   10   26:getfield        #73  <Field Object Keyframe.startValue>
	//   11   29:areturn         
			else
				return valueFactory.valueFromObject(json.opt("k"), scale);
	//   12   30:aload_0         
	//   13   31:getfield        #31  <Field AnimatableValue$Factory valueFactory>
	//   14   34:aload_0         
	//   15   35:getfield        #25  <Field JSONObject json>
	//   16   38:ldc1            #75  <String "k">
	//   17   40:invokevirtual   #78  <Method Object JSONObject.opt(String)>
	//   18   43:aload_0         
	//   19   44:getfield        #27  <Field float scale>
	//   20   47:invokeinterface #84  <Method Object AnimatableValue$Factory.valueFromObject(Object, float)>
	//   21   52:areturn         
		} else
		{
			return ((Object) (null));
	//   22   53:aconst_null     
	//   23   54:areturn         
		}
	}

	private List parseKeyframes()
	{
		Object obj = ((Object) (json));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field JSONObject json>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          47
		{
			obj = ((JSONObject) (obj)).opt("k");
	//    5    9:aload_1         
	//    6   10:ldc1            #75  <String "k">
	//    7   12:invokevirtual   #78  <Method Object JSONObject.opt(String)>
	//    8   15:astore_1        
			if(hasKeyframes(obj))
	//*   9   16:aload_1         
	//*  10   17:invokestatic    #90  <Method boolean hasKeyframes(Object)>
	//*  11   20:ifeq            43
				return Keyframe.Factory.parseKeyframes((JSONArray)obj, composition, scale, valueFactory);
	//   12   23:aload_1         
	//   13   24:checkcast       #39  <Class JSONArray>
	//   14   27:aload_0         
	//   15   28:getfield        #29  <Field LottieComposition composition>
	//   16   31:aload_0         
	//   17   32:getfield        #27  <Field float scale>
	//   18   35:aload_0         
	//   19   36:getfield        #31  <Field AnimatableValue$Factory valueFactory>
	//   20   39:invokestatic    #95  <Method List Keyframe$Factory.parseKeyframes(JSONArray, LottieComposition, float, AnimatableValue$Factory)>
	//   21   42:areturn         
			else
				return Collections.emptyList();
	//   22   43:invokestatic    #100 <Method List Collections.emptyList()>
	//   23   46:areturn         
		} else
		{
			return Collections.emptyList();
	//   24   47:invokestatic    #100 <Method List Collections.emptyList()>
	//   25   50:areturn         
		}
	}

	Result parseJson()
	{
		List list = parseKeyframes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #105 <Method List parseKeyframes()>
	//    2    4:astore_1        
		return new Result(list, parseInitialValue(list));
	//    3    5:new             #7   <Class AnimatableValueParser$Result>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #107 <Method Object parseInitialValue(List)>
	//    9   15:invokespecial   #110 <Method void AnimatableValueParser$Result(List, Object)>
	//   10   18:areturn         
	}

	private final LottieComposition composition;
	private final JSONObject json;
	private final float scale;
	private final AnimatableValue.Factory valueFactory;
}
