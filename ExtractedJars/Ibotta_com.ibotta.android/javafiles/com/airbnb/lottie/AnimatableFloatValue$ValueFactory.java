// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			AnimatableFloatValue, JsonUtils

private static class AnimatableFloatValue$ValueFactory
	implements AnimatableValue.Factory
{

	public Float valueFromObject(Object obj, float f)
	{
		return Float.valueOf(JsonUtils.valueFromObject(obj) * f);
	//    0    0:aload_1         
	//    1    1:invokestatic    #28  <Method float JsonUtils.valueFromObject(Object)>
	//    2    4:fload_2         
	//    3    5:fmul            
	//    4    6:invokestatic    #34  <Method Float Float.valueOf(float)>
	//    5    9:areturn         
	}

	public volatile Object valueFromObject(Object obj, float f)
	{
		return ((Object) (valueFromObject(obj, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #37  <Method Float valueFromObject(Object, float)>
	//    4    6:areturn         
	}

	static final AnimatableFloatValue$ValueFactory INSTANCE = new AnimatableFloatValue$ValueFactory();

	static 
	{
	//    0    0:new             #2   <Class AnimatableFloatValue$ValueFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void AnimatableFloatValue$ValueFactory()>
	//    3    7:putstatic       #19  <Field AnimatableFloatValue$ValueFactory INSTANCE>
	//*   4   10:return          
	}

	private AnimatableFloatValue$ValueFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
