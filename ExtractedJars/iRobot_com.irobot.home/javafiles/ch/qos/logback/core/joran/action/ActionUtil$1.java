// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;


// Referenced classes of package ch.qos.logback.core.joran.action:
//			ActionUtil

static class ActionUtil$1
{

	static final int $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[];

	static 
	{
		$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope = new int[ope.values().length];
	//    0    0:invokestatic    #18  <Method ActionUtil$Scope[] ActionUtil$Scope.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
		try
		{
			$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[ope.LOCAL.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
	//    5   12:getstatic       #24  <Field ActionUtil$Scope ActionUtil$Scope.LOCAL>
	//    6   15:invokevirtual   #28  <Method int ActionUtil$Scope.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
	//*  10   23:getstatic       #31  <Field ActionUtil$Scope ActionUtil$Scope.CONTEXT>
	//*  11   26:invokevirtual   #28  <Method int ActionUtil$Scope.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope>
	//*  15   34:getstatic       #34  <Field ActionUtil$Scope ActionUtil$Scope.SYSTEM>
	//*  16   37:invokevirtual   #28  <Method int ActionUtil$Scope.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   20   43:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[ope.CONTEXT.ordinal()] = 2;
		}
	//*  21   44:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   22   47:astore_0        
		try
		{
			$SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[ope.SYSTEM.ordinal()] = 3;
		}
	//*  23   48:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   51:astore_0        
	//*  25   52:return          
	}
}
