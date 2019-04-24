// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.pdf.fonts.otf.Language;

// Referenced classes of package com.itextpdf.text.pdf:
//			FontDetails

static class FontDetails$1
{

	static final int $SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language[];

	static 
	{
		$SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language = new int[Language.values().length];
	//    0    0:invokestatic    #18  <Method Language[] Language.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language>
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language[Language.BENGALI.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$fonts$otf$Language>
	//    5   12:getstatic       #24  <Field Language Language.BENGALI>
	//    6   15:invokevirtual   #28  <Method int Language.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
	//    9   20:return          
		}
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   21:astore_0        
	//*  11   22:return          
	}
}
