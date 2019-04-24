// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			ClipperOffset

static class ClipperOffset$1
{

	static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[];

	static 
	{
		$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType = new int[.values().length];
	//    0    0:invokestatic    #18  <Method Clipper$JoinType[] Clipper$JoinType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[.MITER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
	//    5   12:getstatic       #24  <Field Clipper$JoinType Clipper$JoinType.MITER>
	//    6   15:invokevirtual   #28  <Method int Clipper$JoinType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
	//*  10   23:getstatic       #31  <Field Clipper$JoinType Clipper$JoinType.BEVEL>
	//*  11   26:invokevirtual   #28  <Method int Clipper$JoinType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType>
	//*  15   34:getstatic       #34  <Field Clipper$JoinType Clipper$JoinType.ROUND>
	//*  16   37:invokevirtual   #28  <Method int Clipper$JoinType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
	//*  20   43:astore_0        
	//*  21   44:return          
	//*  22   45:astore_0        
	//*  23   46:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   49:astore_0        
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[.BEVEL.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$Clipper$JoinType[.ROUND.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  25   50:goto            20
	}
}
