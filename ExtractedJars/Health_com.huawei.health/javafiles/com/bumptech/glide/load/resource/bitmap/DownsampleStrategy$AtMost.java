// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy

static class DownsampleStrategy$AtMost extends DownsampleStrategy
{

	public izeRounding getSampleSizeRounding(int i, int j, int k, int l)
	{
		return izeRounding.MEMORY;
	//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.MEMORY>
	//    1    3:areturn         
	}

	public float getScaleFactor(int i, int j, int k, int l)
	{
		i = (int)Math.ceil(Math.max((float)j / (float)l, (float)i / (float)k));
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
	//   14   19:istore_1        
		j = Math.max(1, Integer.highestOneBit(i));
	//   15   20:iconst_1        
	//   16   21:iload_1         
	//   17   22:invokestatic    #36  <Method int Integer.highestOneBit(int)>
	//   18   25:invokestatic    #39  <Method int Math.max(int, int)>
	//   19   28:istore_2        
		if(j < i)
	//*  20   29:iload_2         
	//*  21   30:iload_1         
	//*  22   31:icmpge          39
			i = 1;
	//   23   34:iconst_1        
	//   24   35:istore_1        
		else
	//*  25   36:goto            41
			i = 0;
	//   26   39:iconst_0        
	//   27   40:istore_1        
		return 1.0F / (float)(j << i);
	//   28   41:fconst_1        
	//   29   42:iload_2         
	//   30   43:iload_1         
	//   31   44:ishl            
	//   32   45:i2f             
	//   33   46:fdiv            
	//   34   47:freturn         
	}

	DownsampleStrategy$AtMost()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
	//    2    4:return          
	}
}
