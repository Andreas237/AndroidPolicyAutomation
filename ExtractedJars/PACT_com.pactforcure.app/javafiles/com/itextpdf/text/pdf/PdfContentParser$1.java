// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			PdfContentParser

static class PdfContentParser$1
{

	static final int $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[];

	static 
	{
		$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType = new int[pe.values().length];
	//    0    0:invokestatic    #18  <Method PRTokeniser$TokenType[] PRTokeniser$TokenType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[pe.START_DIC.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//    5   12:getstatic       #24  <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_DIC>
	//    6   15:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//*  10   23:getstatic       #31  <Field PRTokeniser$TokenType PRTokeniser$TokenType.START_ARRAY>
	//*  11   26:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//*  15   34:getstatic       #34  <Field PRTokeniser$TokenType PRTokeniser$TokenType.STRING>
	//*  16   37:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//*  20   45:getstatic       #37  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NAME>
	//*  21   48:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//*  25   56:getstatic       #40  <Field PRTokeniser$TokenType PRTokeniser$TokenType.NUMBER>
	//*  26   59:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType>
	//*  30   67:getstatic       #43  <Field PRTokeniser$TokenType PRTokeniser$TokenType.OTHER>
	//*  31   70:invokevirtual   #28  <Method int PRTokeniser$TokenType.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:return          
	//*  35   77:astore_0        
	//*  36   78:return          
	//*  37   79:astore_0        
	//*  38   80:goto            64
	//*  39   83:astore_0        
	//*  40   84:goto            53
	//*  41   87:astore_0        
	//*  42   88:goto            42
	//*  43   91:astore_0        
	//*  44   92:goto            31
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   95:astore_0        
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[pe.START_ARRAY.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror4) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[pe.STRING.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[pe.NAME.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[pe.NUMBER.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$itextpdf$text$pdf$PRTokeniser$TokenType[pe.OTHER.ordinal()] = 6;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  46   96:goto            20
	}
}
