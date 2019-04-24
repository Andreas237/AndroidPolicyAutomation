// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.field;


// Referenced classes of package co.touchlab.squeaky.field:
//			FieldType, SqlType

static class FieldType$1
{

	static final int $SwitchMap$co$touchlab$squeaky$field$SqlType[];

	static 
	{
		$SwitchMap$co$touchlab$squeaky$field$SqlType = new int[SqlType.values().length];
	//    0    0:invokestatic    #18  <Method SqlType[] SqlType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.DATE.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//    5   12:getstatic       #24  <Field SqlType SqlType.DATE>
	//    6   15:invokevirtual   #28  <Method int SqlType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  10   23:getstatic       #31  <Field SqlType SqlType.BOOLEAN>
	//*  11   26:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$co$touchlab$squeaky$field$SqlType>
	//*  15   34:getstatic       #34  <Field SqlType SqlType.BIG_DECIMAL>
	//*  16   37:invokevirtual   #28  <Method int SqlType.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:return          
	//*  20   43:astore_0        
	//*  21   44:return          
	//*  22   45:astore_0        
	//*  23   46:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   49:astore_0        
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BOOLEAN.ordinal()] = 2;
		}
		catch(NoSuchFieldError nosuchfielderror1) { }
		try
		{
			$SwitchMap$co$touchlab$squeaky$field$SqlType[SqlType.BIG_DECIMAL.ordinal()] = 3;
		}
		catch(NoSuchFieldError nosuchfielderror)
		{
			return;
		}
	//*  25   50:goto            20
	}
}
