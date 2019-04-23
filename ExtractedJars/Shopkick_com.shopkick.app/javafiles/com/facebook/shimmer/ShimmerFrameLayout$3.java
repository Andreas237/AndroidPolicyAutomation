// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.shimmer;


// Referenced classes of package com.facebook.shimmer:
//			ShimmerFrameLayout

static class ShimmerFrameLayout$3
{

	static final int $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[];
	static final int $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[];

	static 
	{
		$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle = new int[skAngle.values().length];
	//    0    0:invokestatic    #19  <Method ShimmerFrameLayout$MaskAngle[] ShimmerFrameLayout$MaskAngle.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
		try
		{
			$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[skAngle.CW_0.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
	//    5   12:getstatic       #25  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_0>
	//    6   15:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
	//*  10   23:getstatic       #32  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_90>
	//*  11   26:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
	//*  15   34:getstatic       #35  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_180>
	//*  16   37:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle>
	//*  20   45:getstatic       #38  <Field ShimmerFrameLayout$MaskAngle ShimmerFrameLayout$MaskAngle.CW_270>
	//*  21   48:invokevirtual   #29  <Method int ShimmerFrameLayout$MaskAngle.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #43  <Method ShimmerFrameLayout$MaskShape[] ShimmerFrameLayout$MaskShape.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #45  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
	//*  28   62:getstatic       #45  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
	//*  29   65:getstatic       #49  <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$MaskShape.LINEAR>
	//*  30   68:invokevirtual   #50  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #45  <Field int[] $SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape>
	//*  34   76:getstatic       #53  <Field ShimmerFrameLayout$MaskShape ShimmerFrameLayout$MaskShape.RADIAL>
	//*  35   79:invokevirtual   #50  <Method int ShimmerFrameLayout$MaskShape.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   39   85:astore_0        
		try
		{
			$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[skAngle.CW_90.ordinal()] = 2;
		}
	//*  40   86:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   41   89:astore_0        
		try
		{
			$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[skAngle.CW_180.ordinal()] = 3;
		}
	//*  42   90:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   43   93:astore_0        
		try
		{
			$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskAngle[skAngle.CW_270.ordinal()] = 4;
		}
	//*  44   94:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   45   97:astore_0        
		$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape = new int[skShape.values().length];
		try
		{
			$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[skShape.LINEAR.ordinal()] = 1;
		}
	//*  46   98:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   47  101:astore_0        
		try
		{
			$SwitchMap$com$facebook$shimmer$ShimmerFrameLayout$MaskShape[skShape.RADIAL.ordinal()] = 2;
		}
	//*  48  102:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  105:astore_0        
	//*  50  106:return          
	}
}
