// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.webvtt;


// Referenced classes of package com.google.android.exoplayer.text.webvtt:
//			WebvttCue

static class WebvttCue$1
{

	static final int $SwitchMap$android$text$Layout$Alignment[];

	static 
	{
		$SwitchMap$android$text$Layout$Alignment = new int[android.text.ment.values().length];
	//    0    0:invokestatic    #18  <Method android.text.Layout$Alignment[] android.text.Layout$Alignment.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
		try
		{
			$SwitchMap$android$text$Layout$Alignment[android.text.ment.ALIGN_NORMAL.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
	//    5   12:getstatic       #24  <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//    6   15:invokevirtual   #28  <Method int android.text.Layout$Alignment.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
	//*  10   23:getstatic       #31  <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//*  11   26:invokevirtual   #28  <Method int android.text.Layout$Alignment.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$text$Layout$Alignment>
	//*  15   34:getstatic       #34  <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
	//*  16   37:invokevirtual   #28  <Method int android.text.Layout$Alignment.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$android$text$Layout$Alignment[android.text.ment.ALIGN_CENTER.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$android$text$Layout$Alignment[android.text.ment.ALIGN_OPPOSITE.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
