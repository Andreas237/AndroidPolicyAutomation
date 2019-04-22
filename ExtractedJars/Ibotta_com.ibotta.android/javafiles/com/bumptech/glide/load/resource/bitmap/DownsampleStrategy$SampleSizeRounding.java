// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DownsampleStrategy

public static final class DownsampleStrategy$SampleSizeRounding extends Enum
{

	public static DownsampleStrategy$SampleSizeRounding valueOf(String s)
	{
		return (DownsampleStrategy$SampleSizeRounding)Enum.valueOf(com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding, s);
	//    0    0:ldc1            #2   <Class DownsampleStrategy$SampleSizeRounding>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DownsampleStrategy$SampleSizeRounding>
	//    4    9:areturn         
	}

	public static DownsampleStrategy$SampleSizeRounding[] values()
	{
		return (DownsampleStrategy$SampleSizeRounding[])((DownsampleStrategy$SampleSizeRounding []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field DownsampleStrategy$SampleSizeRounding[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding_3B_.clone()>
	//    2    6:checkcast       #38  <Class DownsampleStrategy$SampleSizeRounding[]>
	//    3    9:areturn         
	}

	private static final DownsampleStrategy$SampleSizeRounding $VALUES[];
	public static final DownsampleStrategy$SampleSizeRounding MEMORY;
	public static final DownsampleStrategy$SampleSizeRounding QUALITY;

	static 
	{
		MEMORY = new DownsampleStrategy$SampleSizeRounding("MEMORY", 0);
	//    0    0:new             #2   <Class DownsampleStrategy$SampleSizeRounding>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "MEMORY">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void DownsampleStrategy$SampleSizeRounding(String, int)>
	//    5   10:putstatic       #22  <Field DownsampleStrategy$SampleSizeRounding MEMORY>
		QUALITY = new DownsampleStrategy$SampleSizeRounding("QUALITY", 1);
	//    6   13:new             #2   <Class DownsampleStrategy$SampleSizeRounding>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "QUALITY">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void DownsampleStrategy$SampleSizeRounding(String, int)>
	//   11   23:putstatic       #25  <Field DownsampleStrategy$SampleSizeRounding QUALITY>
		$VALUES = (new DownsampleStrategy$SampleSizeRounding[] {
			MEMORY, QUALITY
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       DownsampleStrategy$SampleSizeRounding[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field DownsampleStrategy$SampleSizeRounding MEMORY>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field DownsampleStrategy$SampleSizeRounding QUALITY>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field DownsampleStrategy$SampleSizeRounding[] $VALUES>
	//*  23   45:return          
	}

	private DownsampleStrategy$SampleSizeRounding(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
