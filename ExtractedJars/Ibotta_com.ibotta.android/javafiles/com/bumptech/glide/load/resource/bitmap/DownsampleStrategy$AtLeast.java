// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy

private static class DownsampleStrategy$AtLeast extends DownsampleStrategy
{

	public zeRounding getSampleSizeRounding(int i, int j, int k, int l)
	{
		return zeRounding.QUALITY;
	//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.QUALITY>
	//    1    3:areturn         
	}

	public float getScaleFactor(int i, int j, int k, int l)
	{
		i = Math.min(j / l, i / k);
	//    0    0:iload_2         
	//    1    1:iload           4
	//    2    3:idiv            
	//    3    4:iload_1         
	//    4    5:iload_3         
	//    5    6:idiv            
	//    6    7:invokestatic    #26  <Method int Math.min(int, int)>
	//    7   10:istore_1        
		if(i == 0)
	//*   8   11:iload_1         
	//*   9   12:ifne            17
			return 1.0F;
	//   10   15:fconst_1        
	//   11   16:freturn         
		else
			return 1.0F / (float)Integer.highestOneBit(i);
	//   12   17:fconst_1        
	//   13   18:iload_1         
	//   14   19:invokestatic    #32  <Method int Integer.highestOneBit(int)>
	//   15   22:i2f             
	//   16   23:fdiv            
	//   17   24:freturn         
	}

	DownsampleStrategy$AtLeast()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
	//    2    4:return          
	}
}
