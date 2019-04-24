// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;


// Referenced classes of package com.adjust.sdk:
//			ActivityKind

static class ActivityKind$1
{

	static final int $SwitchMap$com$adjust$sdk$ActivityKind[];

	static 
	{
		$SwitchMap$com$adjust$sdk$ActivityKind = new int[ActivityKind.values().length];
	//    0    0:invokestatic    #16  <Method ActivityKind[] ActivityKind.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
		try
		{
			$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.SESSION.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
	//    5   12:getstatic       #22  <Field ActivityKind ActivityKind.SESSION>
	//    6   15:invokevirtual   #26  <Method int ActivityKind.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
	//*  10   23:getstatic       #29  <Field ActivityKind ActivityKind.EVENT>
	//*  11   26:invokevirtual   #26  <Method int ActivityKind.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
	//*  15   34:getstatic       #32  <Field ActivityKind ActivityKind.CLICK>
	//*  16   37:invokevirtual   #26  <Method int ActivityKind.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] $SwitchMap$com$adjust$sdk$ActivityKind>
	//*  20   45:getstatic       #35  <Field ActivityKind ActivityKind.ATTRIBUTION>
	//*  21   48:invokevirtual   #26  <Method int ActivityKind.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   25   54:astore_0        
		try
		{
			$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.EVENT.ordinal()] = 2;
		}
	//*  26   55:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   27   58:astore_0        
		try
		{
			$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.CLICK.ordinal()] = 3;
		}
	//*  28   59:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   29   62:astore_0        
		try
		{
			$SwitchMap$com$adjust$sdk$ActivityKind[ActivityKind.ATTRIBUTION.ordinal()] = 4;
		}
	//*  30   63:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
