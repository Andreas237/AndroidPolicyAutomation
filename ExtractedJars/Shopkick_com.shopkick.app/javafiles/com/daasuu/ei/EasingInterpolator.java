// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.daasuu.ei;

import android.animation.TimeInterpolator;

// Referenced classes of package com.daasuu.ei:
//			EasingProvider, Ease

public class EasingInterpolator
	implements TimeInterpolator
{

	public EasingInterpolator(Ease ease1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		ease = ease1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Ease ease>
	//    5    9:return          
	}

	public Ease getEase()
	{
		return ease;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Ease ease>
	//    2    4:areturn         
	}

	public float getInterpolation(float f)
	{
		return EasingProvider.get(ease, f);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Ease ease>
	//    2    4:fload_1         
	//    3    5:invokestatic    #28  <Method float EasingProvider.get(Ease, float)>
	//    4    8:freturn         
	}

	private final Ease ease;
}
