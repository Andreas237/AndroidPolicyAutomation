// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			DefaultClipper

static class DefaultClipper$2
{

	static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[];
	static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[];

	static 
	{
		$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType = new int[Clipper$ClipType.values().length];
	//    0    0:invokestatic    #19  <Method Clipper$ClipType[] Clipper$ClipType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType>
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper$ClipType.INTERSECTION.ordinal()] = 1;
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
	//*  29   65:getstatic       #49  <Field Clipper$PolyFillType Clipper$PolyFillType.POSITIVE>
	//*  30   68:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
	//*  31   71:iconst_1        
	//*  32   72:iastore         
	//*  33   73:getstatic       #45  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType>
	//*  34   76:getstatic       #53  <Field Clipper$PolyFillType Clipper$PolyFillType.NEGATIVE>
	//*  35   79:invokevirtual   #50  <Method int Clipper$PolyFillType.ordinal()>
	//*  36   82:iconst_2        
	//*  37   83:iastore         
	//*  38   84:return          
	//*  39   85:astore_0        
	//*  40   86:return          
	//*  41   87:astore_0        
	//*  42   88:goto            73
	//*  43   91:astore_0        
	//*  44   92:goto            53
	//*  45   95:astore_0        
	//*  46   96:goto            42
	//*  47   99:astore_0        
	//*  48  100:goto            31
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  103:astore_0        
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper$ClipType.UNION.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper$ClipType.DIFFERENCE.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$ClipType[Clipper$ClipType.XOR.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType = new int[ype.values().length];
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[ype.POSITIVE.ordinal()] = 1;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$PolyFillType[ype.NEGATIVE.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  50  104:goto            20
	}
}
