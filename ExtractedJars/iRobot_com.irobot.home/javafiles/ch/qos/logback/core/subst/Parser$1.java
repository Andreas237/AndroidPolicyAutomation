// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.subst;


// Referenced classes of package ch.qos.logback.core.subst:
//			Parser

static class Parser$1
{

	static final int $SwitchMap$ch$qos$logback$core$subst$Token$Type[];

	static 
	{
		$SwitchMap$ch$qos$logback$core$subst$Token$Type = new int[e.values().length];
	//    0    0:invokestatic    #18  <Method Token$Type[] Token$Type.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Token$Type>
		try
		{
			$SwitchMap$ch$qos$logback$core$subst$Token$Type[e.LITERAL.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Token$Type>
	//    5   12:getstatic       #24  <Field Token$Type Token$Type.LITERAL>
	//    6   15:invokevirtual   #28  <Method int Token$Type.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Token$Type>
	//*  10   23:getstatic       #31  <Field Token$Type Token$Type.CURLY_LEFT>
	//*  11   26:invokevirtual   #28  <Method int Token$Type.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$subst$Token$Type>
	//*  15   34:getstatic       #34  <Field Token$Type Token$Type.START>
	//*  16   37:invokevirtual   #28  <Method int Token$Type.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$subst$Token$Type[e.CURLY_LEFT.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$subst$Token$Type[e.START.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
