// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.lzyzsd.circleprogress;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class Utils
{

	public static float dp2px(Resources resources, float f)
	{
		return f * resources.getDisplayMetrics().density + 0.5F;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #12  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    5:getfield        #18  <Field float DisplayMetrics.density>
	//    4    8:fmul            
	//    5    9:ldc1            #19  <Float 0.5F>
	//    6   11:fadd            
	//    7   12:freturn         
	}

	public static float sp2px(Resources resources, float f)
	{
		return f * resources.getDisplayMetrics().scaledDensity;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #12  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    5:getfield        #24  <Field float DisplayMetrics.scaledDensity>
	//    4    8:fmul            
	//    5    9:freturn         
	}
}
