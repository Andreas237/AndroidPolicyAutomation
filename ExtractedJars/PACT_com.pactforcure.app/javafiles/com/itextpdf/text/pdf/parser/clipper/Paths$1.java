// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser.clipper;


// Referenced classes of package com.itextpdf.text.pdf.parser.clipper:
//			Paths

static class Paths$1
{

	static final int $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType[];

	static 
	{
		$SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType = new int[.NodeType.values().length];
	//    0    0:invokestatic    #18  <Method PolyNode$NodeType[] PolyNode$NodeType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType>
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType[.NodeType.OPEN.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType>
	//    5   12:getstatic       #24  <Field PolyNode$NodeType PolyNode$NodeType.OPEN>
	//    6   15:invokevirtual   #28  <Method int PolyNode$NodeType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType>
	//*  10   23:getstatic       #31  <Field PolyNode$NodeType PolyNode$NodeType.CLOSED>
	//*  11   26:invokevirtual   #28  <Method int PolyNode$NodeType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
	//*  15   32:astore_0        
	//*  16   33:return          
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   34:astore_0        
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$parser$clipper$PolyNode$NodeType[.NodeType.CLOSED.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  18   35:goto            20
	}
}
