// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;


// Referenced classes of package com.airbnb.lottie:
//			AnimatableIntegerValue, JsonUtils

private static class AnimatableIntegerValue$ValueFactory
	implements AnimatableValue.Factory
{

	public Integer valueFromObject(Object obj, float f)
	{
		return Integer.valueOf(Math.round(JsonUtils.valueFromObject(obj) * f));
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method float JsonUtils.valueFromObject(Object)>
	//    2    4:fload_2         
	//    3    5:fmul            
	//    4    6:invokestatic    #36  <Method int Math.round(float)>
	//    5    9:invokestatic    #42  <Method Integer Integer.valueOf(int)>
	//    6   12:areturn         
	}

	public volatile Object valueFromObject(Object obj, float f)
	{
		return ((Object) (valueFromObject(obj, f)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #45  <Method Integer valueFromObject(Object, float)>
	//    4    6:areturn         
	}

	private static final AnimatableIntegerValue$ValueFactory INSTANCE = new AnimatableIntegerValue$ValueFactory();

	static 
	{
	//    0    0:new             #2   <Class AnimatableIntegerValue$ValueFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void AnimatableIntegerValue$ValueFactory()>
	//    3    7:putstatic       #19  <Field AnimatableIntegerValue$ValueFactory INSTANCE>
	//*   4   10:return          
	}


/*
	static AnimatableIntegerValue$ValueFactory access$100()
	{
		return INSTANCE;
	//    0    0:getstatic       #19  <Field AnimatableIntegerValue$ValueFactory INSTANCE>
	//    1    3:areturn         
	}

*/

	private AnimatableIntegerValue$ValueFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
