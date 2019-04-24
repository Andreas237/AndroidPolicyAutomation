// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class LogLevel extends Enum
{

	private LogLevel(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static LogLevel valueOf(String s)
	{
		return (LogLevel)Enum.valueOf(com/irobot/core/LogLevel, s);
	//    0    0:ldc1            #2   <Class LogLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LogLevel>
	//    4    9:areturn         
	}

	public static LogLevel[] values()
	{
		return (LogLevel[])((LogLevel []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field LogLevel[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.irobot.core.LogLevel_3B_.clone()>
	//    2    6:checkcast       #51  <Class LogLevel[]>
	//    3    9:areturn         
	}

	private static final LogLevel $VALUES[];
	public static final LogLevel Debug;
	public static final LogLevel Error;
	public static final LogLevel Info;
	public static final LogLevel None;
	public static final LogLevel Verbose;
	public static final LogLevel Warning;

	static 
	{
		Verbose = new LogLevel("Verbose", 0);
	//    0    0:new             #2   <Class LogLevel>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Verbose">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void LogLevel(String, int)>
	//    5   10:putstatic       #23  <Field LogLevel Verbose>
		Debug = new LogLevel("Debug", 1);
	//    6   13:new             #2   <Class LogLevel>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "Debug">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void LogLevel(String, int)>
	//   11   23:putstatic       #26  <Field LogLevel Debug>
		Info = new LogLevel("Info", 2);
	//   12   26:new             #2   <Class LogLevel>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "Info">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void LogLevel(String, int)>
	//   17   36:putstatic       #29  <Field LogLevel Info>
		Warning = new LogLevel("Warning", 3);
	//   18   39:new             #2   <Class LogLevel>
	//   19   42:dup             
	//   20   43:ldc1            #30  <String "Warning">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void LogLevel(String, int)>
	//   23   49:putstatic       #32  <Field LogLevel Warning>
		Error = new LogLevel("Error", 4);
	//   24   52:new             #2   <Class LogLevel>
	//   25   55:dup             
	//   26   56:ldc1            #33  <String "Error">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #21  <Method void LogLevel(String, int)>
	//   29   62:putstatic       #35  <Field LogLevel Error>
		None = new LogLevel("None", 5);
	//   30   65:new             #2   <Class LogLevel>
	//   31   68:dup             
	//   32   69:ldc1            #36  <String "None">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #21  <Method void LogLevel(String, int)>
	//   35   75:putstatic       #38  <Field LogLevel None>
		$VALUES = (new LogLevel[] {
			Verbose, Debug, Info, Warning, Error, None
		});
	//   36   78:bipush          6
	//   37   80:anewarray       LogLevel[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #23  <Field LogLevel Verbose>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #26  <Field LogLevel Debug>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #29  <Field LogLevel Info>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #32  <Field LogLevel Warning>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #35  <Field LogLevel Error>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #38  <Field LogLevel None>
	//   61  118:aastore         
	//   62  119:putstatic       #40  <Field LogLevel[] $VALUES>
	//*  63  122:return          
	}
}
