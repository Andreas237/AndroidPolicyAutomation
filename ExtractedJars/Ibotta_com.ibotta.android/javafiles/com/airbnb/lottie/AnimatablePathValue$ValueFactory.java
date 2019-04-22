// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.PointF;
import org.json.JSONArray;

// Referenced classes of package com.airbnb.lottie:
//			AnimatablePathValue, JsonUtils

private static class AnimatablePathValue$ValueFactory
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

	private static final AnimatableValue.Factory INSTANCE = new AnimatablePathValue$ValueFactory();

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

	private AnimatablePathValue$ValueFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}
}
