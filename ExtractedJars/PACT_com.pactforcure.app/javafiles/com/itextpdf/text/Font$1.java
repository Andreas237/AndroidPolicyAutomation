// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;


// Referenced classes of package com.itextpdf.text:
//			Font

static class Font$1
{

	static final int $SwitchMap$com$itextpdf$text$Font$FontFamily[];

	static 
	{
		$SwitchMap$com$itextpdf$text$Font$FontFamily = new int[ntFamily.values().length];
	//    0    0:invokestatic    #18  <Method Font$FontFamily[] Font$FontFamily.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
		try
		{
			$SwitchMap$com$itextpdf$text$Font$FontFamily[ntFamily.COURIER.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
	//    5   12:getstatic       #24  <Field Font$FontFamily Font$FontFamily.COURIER>
	//    6   15:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
	//*  10   23:getstatic       #31  <Field Font$FontFamily Font$FontFamily.HELVETICA>
	//*  11   26:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
	//*  15   34:getstatic       #34  <Field Font$FontFamily Font$FontFamily.TIMES_ROMAN>
	//*  16   37:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
	//*  20   45:getstatic       #37  <Field Font$FontFamily Font$FontFamily.SYMBOL>
	//*  21   48:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$itextpdf$text$Font$FontFamily>
	//*  25   56:getstatic       #40  <Field Font$FontFamily Font$FontFamily.ZAPFDINGBATS>
	//*  26   59:invokevirtual   #28  <Method int Font$FontFamily.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:return          
	//*  30   65:astore_0        
	//*  31   66:return          
	//*  32   67:astore_0        
	//*  33   68:goto            53
	//*  34   71:astore_0        
	//*  35   72:goto            42
	//*  36   75:astore_0        
	//*  37   76:goto            31
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   79:astore_0        
		try
		{
			$SwitchMap$com$itextpdf$text$Font$FontFamily[ntFamily.HELVETICA.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$itextpdf$text$Font$FontFamily[ntFamily.TIMES_ROMAN.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$itextpdf$text$Font$FontFamily[ntFamily.SYMBOL.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$itextpdf$text$Font$FontFamily[ntFamily.ZAPFDINGBATS.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  39   80:goto            20
	}
}
