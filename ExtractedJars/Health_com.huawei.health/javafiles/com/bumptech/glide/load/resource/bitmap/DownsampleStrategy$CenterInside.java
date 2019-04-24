// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy

static class DownsampleStrategy$CenterInside extends DownsampleStrategy
{

	public nding getSampleSizeRounding(int i, int j, int k, int l)
	{
		return nding.QUALITY;
	//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.QUALITY>
	//    1    3:areturn         
	}

	public float getScaleFactor(int i, int j, int k, int l)
	{
		return Math.min(1.0F, FIT_CENTER.getScaleFactor(i, j, k, l));
	//    0    0:fconst_1        
	//    1    1:getstatic       #24  <Field DownsampleStrategy FIT_CENTER>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #26  <Method float DownsampleStrategy.getScaleFactor(int, int, int, int)>
	//    7   12:invokestatic    #32  <Method float Math.min(float, float)>
	//    8   15:freturn         
	}

	DownsampleStrategy$CenterInside()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
	//    2    4:return          
	}
}
