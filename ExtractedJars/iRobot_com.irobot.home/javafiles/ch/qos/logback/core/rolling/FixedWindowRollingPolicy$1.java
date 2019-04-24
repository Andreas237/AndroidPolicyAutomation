// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.CompressionMode;

// Referenced classes of package ch.qos.logback.core.rolling:
//			FixedWindowRollingPolicy

static class FixedWindowRollingPolicy$1
{

	static final int $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[];

	static 
	{
		$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode = new int[CompressionMode.values().length];
	//    0    0:invokestatic    #18  <Method CompressionMode[] CompressionMode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
		try
		{
			$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.NONE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
	//    5   12:getstatic       #24  <Field CompressionMode CompressionMode.NONE>
	//    6   15:invokevirtual   #28  <Method int CompressionMode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
	//*  10   23:getstatic       #31  <Field CompressionMode CompressionMode.GZ>
	//*  11   26:invokevirtual   #28  <Method int CompressionMode.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode>
	//*  15   34:getstatic       #34  <Field CompressionMode CompressionMode.ZIP>
	//*  16   37:invokevirtual   #28  <Method int CompressionMode.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.GZ.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$rolling$helper$CompressionMode[CompressionMode.ZIP.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
