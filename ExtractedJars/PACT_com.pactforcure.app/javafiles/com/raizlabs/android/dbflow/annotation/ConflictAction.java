// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.annotation;


public final class ConflictAction extends Enum
{

	private ConflictAction(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #44  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static int getSQLiteDatabaseAlgorithmInt(ConflictAction conflictaction)
	{
		static class _cls1
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

		switch(_cls1..SwitchMap.com.raizlabs.android.dbflow.annotation.ConflictAction[conflictaction.ordinal()])
	//*   0    0:getstatic       #51  <Field int[] ConflictAction$1.$SwitchMap$com$raizlabs$android$dbflow$annotation$ConflictAction>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #55  <Method int ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 5: default 44
	//	               1 46
	//	               2 48
	//	               3 50
	//	               4 52
	//	               5 54
		default:
			return 0;
	//    5   44:iconst_0        
	//    6   45:ireturn         

		case 1: // '\001'
			return 1;
	//    7   46:iconst_1        
	//    8   47:ireturn         

		case 2: // '\002'
			return 2;
	//    9   48:iconst_2        
	//   10   49:ireturn         

		case 3: // '\003'
			return 3;
	//   11   50:iconst_3        
	//   12   51:ireturn         

		case 4: // '\004'
			return 4;
	//   13   52:iconst_4        
	//   14   53:ireturn         

		case 5: // '\005'
			return 5;
	//   15   54:iconst_5        
	//   16   55:ireturn         
		}
	}

	public static ConflictAction valueOf(String s)
	{
		return (ConflictAction)Enum.valueOf(com/raizlabs/android/dbflow/annotation/ConflictAction, s);
	//    0    0:ldc1            #2   <Class ConflictAction>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ConflictAction>
	//    4    9:areturn         
	}

	public static ConflictAction[] values()
	{
		return (ConflictAction[])((ConflictAction []) ($VALUES)).clone();
	//    0    0:getstatic       #42  <Field ConflictAction[] $VALUES>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.raizlabs.android.dbflow.annotation.ConflictAction_3B_.clone()>
	//    2    6:checkcast       #63  <Class ConflictAction[]>
	//    3    9:areturn         
	}

	private static final ConflictAction $VALUES[];
	public static final ConflictAction ABORT;
	public static final ConflictAction FAIL;
	public static final ConflictAction IGNORE;
	public static final ConflictAction NONE;
	public static final ConflictAction REPLACE;
	public static final ConflictAction ROLLBACK;

	static 
	{
		NONE = new ConflictAction("NONE", 0);
	//    0    0:new             #2   <Class ConflictAction>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void ConflictAction(String, int)>
	//    5   10:putstatic       #25  <Field ConflictAction NONE>
		ROLLBACK = new ConflictAction("ROLLBACK", 1);
	//    6   13:new             #2   <Class ConflictAction>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "ROLLBACK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void ConflictAction(String, int)>
	//   11   23:putstatic       #28  <Field ConflictAction ROLLBACK>
		ABORT = new ConflictAction("ABORT", 2);
	//   12   26:new             #2   <Class ConflictAction>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "ABORT">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void ConflictAction(String, int)>
	//   17   36:putstatic       #31  <Field ConflictAction ABORT>
		FAIL = new ConflictAction("FAIL", 3);
	//   18   39:new             #2   <Class ConflictAction>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "FAIL">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void ConflictAction(String, int)>
	//   23   49:putstatic       #34  <Field ConflictAction FAIL>
		IGNORE = new ConflictAction("IGNORE", 4);
	//   24   52:new             #2   <Class ConflictAction>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "IGNORE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void ConflictAction(String, int)>
	//   29   62:putstatic       #37  <Field ConflictAction IGNORE>
		REPLACE = new ConflictAction("REPLACE", 5);
	//   30   65:new             #2   <Class ConflictAction>
	//   31   68:dup             
	//   32   69:ldc1            #38  <String "REPLACE">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #23  <Method void ConflictAction(String, int)>
	//   35   75:putstatic       #40  <Field ConflictAction REPLACE>
		$VALUES = (new ConflictAction[] {
			NONE, ROLLBACK, ABORT, FAIL, IGNORE, REPLACE
		});
	//   36   78:bipush          6
	//   37   80:anewarray       ConflictAction[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #25  <Field ConflictAction NONE>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #28  <Field ConflictAction ROLLBACK>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #31  <Field ConflictAction ABORT>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #34  <Field ConflictAction FAIL>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #37  <Field ConflictAction IGNORE>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #40  <Field ConflictAction REPLACE>
	//   61  118:aastore         
	//   62  119:putstatic       #42  <Field ConflictAction[] $VALUES>
	//*  63  122:return          
	}
}
