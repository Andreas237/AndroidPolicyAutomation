// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import android.util.DisplayMetrics;

// Referenced classes of package com.bumptech.glide.load.engine.cache:
//			MemorySizeCalculator

static final class MemorySizeCalculator$DisplayMetricsScreenDimensions
	implements MemorySizeCalculator.ScreenDimensions
{

	public int getHeightPixels()
	{
		return displayMetrics.heightPixels;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field DisplayMetrics displayMetrics>
	//    2    4:getfield        #27  <Field int DisplayMetrics.heightPixels>
	//    3    7:ireturn         
	}

	public int getWidthPixels()
	{
		return displayMetrics.widthPixels;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field DisplayMetrics displayMetrics>
	//    2    4:getfield        #31  <Field int DisplayMetrics.widthPixels>
	//    3    7:ireturn         
	}

	private final DisplayMetrics displayMetrics;

	public MemorySizeCalculator$DisplayMetricsScreenDimensions(DisplayMetrics displaymetrics)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		displayMetrics = displaymetrics;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field DisplayMetrics displayMetrics>
	//    5    9:return          
	}
}
