// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import com.linecorp.linesdk.LineApiResponseCode;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			LineProvider

static class LineProvider$2
{

	static final int $SwitchMap$com$linecorp$linesdk$LineApiResponseCode[];

	static 
	{
		$SwitchMap$com$linecorp$linesdk$LineApiResponseCode = new int[LineApiResponseCode.values().length];
	//    0    0:invokestatic    #18  <Method LineApiResponseCode[] LineApiResponseCode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode>
		try
		{
			$SwitchMap$com$linecorp$linesdk$LineApiResponseCode[LineApiResponseCode.SUCCESS.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode>
	//    5   12:getstatic       #24  <Field LineApiResponseCode LineApiResponseCode.SUCCESS>
	//    6   15:invokevirtual   #28  <Method int LineApiResponseCode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$linecorp$linesdk$LineApiResponseCode>
	//*  10   23:getstatic       #31  <Field LineApiResponseCode LineApiResponseCode.CANCEL>
	//*  11   26:invokevirtual   #28  <Method int LineApiResponseCode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			$SwitchMap$com$linecorp$linesdk$LineApiResponseCode[LineApiResponseCode.CANCEL.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
