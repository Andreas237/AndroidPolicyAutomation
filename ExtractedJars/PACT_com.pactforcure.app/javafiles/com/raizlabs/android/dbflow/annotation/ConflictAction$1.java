// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;


// Referenced classes of package com.raizlabs.android.dbflow.annotation:
//			ConflictAction

static class ConflictAction$1
{

	static final int $SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction[];

	static 
	{
		$SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction = new int[ConflictAction.values().length];
	//    0    0:invokestatic    #16  <Method ConflictAction[] ConflictAction.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] $SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction>
		try
		{
			$SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction[ConflictAction.ROLLBACK.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] $SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction>
	//    5   12:getstatic       #22  <Field ConflictAction ConflictAction.ROLLBACK>
	//    6   15:invokevirtual   #26  <Method int ConflictAction.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] $SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction>
	//*  10   23:getstatic       #29  <Field ConflictAction ConflictAction.ABORT>
	//*  11   26:invokevirtual   #26  <Method int ConflictAction.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] $SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction>
	//*  15   34:getstatic       #32  <Field ConflictAction ConflictAction.FAIL>
	//*  16   37:invokevirtual   #26  <Method int ConflictAction.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] $SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction>
	//*  20   45:getstatic       #35  <Field ConflictAction ConflictAction.IGNORE>
	//*  21   48:invokevirtual   #26  <Method int ConflictAction.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #18  <Field int[] $SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction>
	//*  25   56:getstatic       #38  <Field ConflictAction ConflictAction.REPLACE>
	//*  26   59:invokevirtual   #26  <Method int ConflictAction.ordinal()>
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
			$SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction[ConflictAction.ABORT.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
		try
		{
			$SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction[ConflictAction.FAIL.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror2) { }
		try
		{
			$SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction[ConflictAction.IGNORE.ordinal()] = 4;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction[ConflictAction.REPLACE.ordinal()] = 5;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  39   80:goto            20
	}
}
