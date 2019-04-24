// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;


public abstract class DownsampleStrategy
{
	static class AtLeast extends DownsampleStrategy
	{

		public SampleSizeRounding getSampleSizeRounding(int i, int j, int k, int l)
		{
			return SampleSizeRounding.QUALITY;
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

		AtLeast()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
		//    2    4:return          
		}
	}

	static class AtMost extends DownsampleStrategy
	{

		public SampleSizeRounding getSampleSizeRounding(int i, int j, int k, int l)
		{
			return SampleSizeRounding.MEMORY;
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

		AtMost()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
		//    2    4:return          
		}
	}

	static class CenterInside extends DownsampleStrategy
	{

		public SampleSizeRounding getSampleSizeRounding(int i, int j, int k, int l)
		{
			return SampleSizeRounding.QUALITY;
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

		CenterInside()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
		//    2    4:return          
		}
	}

	static class CenterOutside extends DownsampleStrategy
	{

		public SampleSizeRounding getSampleSizeRounding(int i, int j, int k, int l)
		{
			return SampleSizeRounding.QUALITY;
		//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.QUALITY>
		//    1    3:areturn         
		}

		public float getScaleFactor(int i, int j, int k, int l)
		{
			return Math.max((float)k / (float)i, (float)l / (float)j);
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
		//   10   11:invokestatic    #26  <Method float Math.max(float, float)>
		//   11   14:freturn         
		}

		CenterOutside()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
		//    2    4:return          
		}
	}

	static class FitCenter extends DownsampleStrategy
	{

		public SampleSizeRounding getSampleSizeRounding(int i, int j, int k, int l)
		{
			return SampleSizeRounding.QUALITY;
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

		FitCenter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
		//    2    4:return          
		}
	}

	static class None extends DownsampleStrategy
	{

		public SampleSizeRounding getSampleSizeRounding(int i, int j, int k, int l)
		{
			return SampleSizeRounding.QUALITY;
		//    0    0:getstatic       #18  <Field DownsampleStrategy$SampleSizeRounding DownsampleStrategy$SampleSizeRounding.QUALITY>
		//    1    3:areturn         
		}

		public float getScaleFactor(int i, int j, int k, int l)
		{
			return 1.0F;
		//    0    0:fconst_1        
		//    1    1:freturn         
		}

		None()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void DownsampleStrategy()>
		//    2    4:return          
		}
	}

	public static final class SampleSizeRounding extends Enum
	{

		public static SampleSizeRounding valueOf(String s)
		{
			return (SampleSizeRounding)Enum.valueOf(com/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding, s);
		//    0    0:ldc1            #2   <Class DownsampleStrategy$SampleSizeRounding>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class DownsampleStrategy$SampleSizeRounding>
		//    4    9:areturn         
		}

		public static SampleSizeRounding[] values()
		{
			return (SampleSizeRounding[])((SampleSizeRounding []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field DownsampleStrategy$SampleSizeRounding[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.bumptech.glide.load.resource.bitmap.DownsampleStrategy$SampleSizeRounding_3B_.clone()>
		//    2    6:checkcast       #38  <Class DownsampleStrategy$SampleSizeRounding[]>
		//    3    9:areturn         
		}

		private static final SampleSizeRounding $VALUES[];
		public static final SampleSizeRounding MEMORY;
		public static final SampleSizeRounding QUALITY;

		static 
		{
			MEMORY = new SampleSizeRounding("MEMORY", 0);
		//    0    0:new             #2   <Class DownsampleStrategy$SampleSizeRounding>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "MEMORY">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void DownsampleStrategy$SampleSizeRounding(String, int)>
		//    5   10:putstatic       #22  <Field DownsampleStrategy$SampleSizeRounding MEMORY>
			QUALITY = new SampleSizeRounding("QUALITY", 1);
		//    6   13:new             #2   <Class DownsampleStrategy$SampleSizeRounding>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "QUALITY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void DownsampleStrategy$SampleSizeRounding(String, int)>
		//   11   23:putstatic       #25  <Field DownsampleStrategy$SampleSizeRounding QUALITY>
			$VALUES = (new SampleSizeRounding[] {
				MEMORY, QUALITY
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       SampleSizeRounding[]
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

		private SampleSizeRounding(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public DownsampleStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
	//    2    4:return          
	}

	public abstract SampleSizeRounding getSampleSizeRounding(int i, int j, int k, int l);

	public abstract float getScaleFactor(int i, int j, int k, int l);

	public static final DownsampleStrategy AT_LEAST = new AtLeast();
	public static final DownsampleStrategy AT_MOST = new AtMost();
	public static final DownsampleStrategy CENTER_INSIDE = new CenterInside();
	public static final DownsampleStrategy CENTER_OUTSIDE;
	public static final DownsampleStrategy DEFAULT;
	public static final DownsampleStrategy FIT_CENTER = new FitCenter();
	public static final DownsampleStrategy NONE = new None();

	static 
	{
	//    0    0:new             #18  <Class DownsampleStrategy$FitCenter>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void DownsampleStrategy$FitCenter()>
	//    3    7:putstatic       #40  <Field DownsampleStrategy FIT_CENTER>
		CENTER_OUTSIDE = ((DownsampleStrategy) (new CenterOutside()));
	//    4   10:new             #15  <Class DownsampleStrategy$CenterOutside>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void DownsampleStrategy$CenterOutside()>
	//    7   17:putstatic       #43  <Field DownsampleStrategy CENTER_OUTSIDE>
	//    8   20:new             #6   <Class DownsampleStrategy$AtLeast>
	//    9   23:dup             
	//   10   24:invokespecial   #44  <Method void DownsampleStrategy$AtLeast()>
	//   11   27:putstatic       #46  <Field DownsampleStrategy AT_LEAST>
	//   12   30:new             #9   <Class DownsampleStrategy$AtMost>
	//   13   33:dup             
	//   14   34:invokespecial   #47  <Method void DownsampleStrategy$AtMost()>
	//   15   37:putstatic       #49  <Field DownsampleStrategy AT_MOST>
	//   16   40:new             #12  <Class DownsampleStrategy$CenterInside>
	//   17   43:dup             
	//   18   44:invokespecial   #50  <Method void DownsampleStrategy$CenterInside()>
	//   19   47:putstatic       #52  <Field DownsampleStrategy CENTER_INSIDE>
	//   20   50:new             #21  <Class DownsampleStrategy$None>
	//   21   53:dup             
	//   22   54:invokespecial   #53  <Method void DownsampleStrategy$None()>
	//   23   57:putstatic       #55  <Field DownsampleStrategy NONE>
		DEFAULT = CENTER_OUTSIDE;
	//   24   60:getstatic       #43  <Field DownsampleStrategy CENTER_OUTSIDE>
	//   25   63:putstatic       #57  <Field DownsampleStrategy DEFAULT>
	//*  26   66:return          
	}
}
