// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.Collections;

// Referenced classes of package com.airbnb.lottie:
//			KeyframeAnimation, Keyframe

class StaticKeyframeAnimation extends KeyframeAnimation
{

	StaticKeyframeAnimation(Object obj)
	{
		super(Collections.emptyList());
	//    0    0:aload_0         
	//    1    1:invokestatic    #16  <Method java.util.List Collections.emptyList()>
	//    2    4:invokespecial   #19  <Method void KeyframeAnimation(java.util.List)>
		initialValue = obj;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #21  <Field Object initialValue>
	//    6   12:return          
	}

	public Object getValue()
	{
		return initialValue;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object initialValue>
	//    2    4:areturn         
	}

	public Object getValue(Keyframe keyframe, float f)
	{
		return initialValue;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object initialValue>
	//    2    4:areturn         
	}

	public void setProgress(float f)
	{
	//    0    0:return          
	}

	private final Object initialValue;
}
