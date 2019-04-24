// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy

static class DownsampleStrategy$None extends DownsampleStrategy
{

	public eSizeRounding getSampleSizeRounding(int i, int j, int k, int l)
	{
		return eSizeRounding.QUALITY;
	//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.QUALITY>
	//    1    3:areturn         
	}

	public float getScaleFactor(int i, int j, int k, int l)
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	DownsampleStrategy$None()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
	//    2    4:return          
	}
}
