// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy

private static class DownsampleStrategy$AtMost extends DownsampleStrategy
{

	public izeRounding getSampleSizeRounding(int i, int j, int k, int l)
	{
		return izeRounding.MEMORY;
	//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.MEMORY>
	//    1    3:areturn         
	}

	public float getScaleFactor(int i, int j, int k, int l)
	{
		k = (int)Math.ceil(Math.max((float)j / (float)l, (float)i / (float)k));
	//    0    0:iload_2         
	//    1    1:i2f             
	//    2    2:iload           4
	//    3    4:i2f             
	//    4    5:fdiv            
	//    5    6:iload_1         
	//    6    7:i2f             
	//    7    8:iload_3         
	//    8    9:i2f             
	//    9   10:fdiv            
	//   10   11:invokestatic    #26  <Method float Math.max(float, float)>
	//   11   14:f2d             
	//   12   15:invokestatic    #30  <Method double Math.ceil(double)>
	//   13   18:d2i             
	//   14   19:istore_3        
		j = Integer.highestOneBit(k);
	//   15   20:iload_3         
	//   16   21:invokestatic    #36  <Method int Integer.highestOneBit(int)>
	//   17   24:istore_2        
		i = 1;
	//   18   25:iconst_1        
	//   19   26:istore_1        
		j = Math.max(1, j);
	//   20   27:iconst_1        
	//   21   28:iload_2         
	//   22   29:invokestatic    #39  <Method int Math.max(int, int)>
	//   23   32:istore_2        
		if(j >= k)
	//*  24   33:iload_2         
	//*  25   34:iload_3         
	//*  26   35:icmpge          41
	//*  27   38:goto            43
			i = 0;
	//   28   41:iconst_0        
	//   29   42:istore_1        
		return 1.0F / (float)(j << i);
	//   30   43:fconst_1        
	//   31   44:iload_2         
	//   32   45:iload_1         
	//   33   46:ishl            
	//   34   47:i2f             
	//   35   48:fdiv            
	//   36   49:freturn         
	}

	DownsampleStrategy$AtMost()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
	//    2    4:return          
	}
}
