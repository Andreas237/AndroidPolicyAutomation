// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy

private static class DownsampleStrategy$FitCenter extends DownsampleStrategy
{

	public Rounding getSampleSizeRounding(int i, int j, int k, int l)
	{
		return Rounding.QUALITY;
	//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.QUALITY>
	//    1    3:areturn         
	}

	public float getScaleFactor(int i, int j, int k, int l)
	{
		return Math.min((float)k / (float)i, (float)l / (float)j);
	//    0    0:iload_3         
	//    1    1:i2f             
	//    2    2:iload_1         
	//    3    3:i2f             
	//    4    4:fdiv            
	//    5    5:iload           4
	//    6    7:i2f             
	//    7    8:iload_2         
	//    8    9:i2f             
	//    9   10:fdiv            
	//   10   11:invokestatic    #26  <Method float Math.min(float, float)>
	//   11   14:freturn         
	}

	DownsampleStrategy$FitCenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
	//    2    4:return          
	}
}
