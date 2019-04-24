// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Edge

static class Edge$1
{

	static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[];
	static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[];

	static 
	{
		$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType = new int[.ClipType.values().length];
	//    0    0:invokestatic    #19  <Method Clipper$ClipType[] Clipper$ClipType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[.ClipType.INTERSECTION.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
	//    5   12:getstatic       #25  <Field Clipper$ClipType Clipper$ClipType.INTERSECTION>
	//    6   15:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
	//*  10   23:getstatic       #32  <Field Clipper$ClipType Clipper$ClipType.UNION>
	//*  11   26:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
	//*  15   34:getstatic       #35  <Field Clipper$ClipType Clipper$ClipType.DIFFERENCE>
	//*  16   37:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
	//*  20   45:getstatic       #38  <Field Clipper$ClipType Clipper$ClipType.XOR>
	//*  21   48:invokevirtual   #29  <Method int Clipper$ClipType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:invokestatic    #43  <Method Clipper$PolyFillType[] Clipper$PolyFillType.values()>
	//*  25   56:arraylength     
	//*  26   57:newarray        int[]
	//*  27   59:putstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  28   62:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  29   65:getstatic       #49  <Field Clipper$PolyFillType Clipper$PolyFillType.EVEN_ODD>
	//*  30   68:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  34   76:getstatic       #53  <Field Clipper$PolyFillType Clipper$PolyFillType.NON_ZERO>
	//*  35   79:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  39   87:getstatic       #56  <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
	//*  40   90:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
	//*  41   93:iconst_3        
	//*  42   94:iastore         
	//*  43   95:return          
	//*  44   96:astore_0        
	//*  45   97:return          
	//*  46   98:astore_0        
	//*  47   99:goto            84
	//*  48  102:astore_0        
	//*  49  103:goto            73
	//*  50  106:astore_0        
	//*  51  107:goto            53
	//*  52  110:astore_0        
	//*  53  111:goto            42
	//*  54  114:astore_0        
	//*  55  115:goto            31
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  118:astore_0        
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[.ClipType.UNION.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror5) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[.ClipType.DIFFERENCE.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[.ClipType.XOR.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType = new int[.PolyFillType.values().length];
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[.PolyFillType.EVEN_ODD.ordinal()] = 1;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[.PolyFillType.NON_ZERO.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[.PolyFillType.POSITIVE.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  57  119:goto            20
	}
}
