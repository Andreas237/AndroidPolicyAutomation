// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;


public final class LogLevel extends Enum
{

	private LogLevel(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		androidLogLevel = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #48  <Field int androidLogLevel>
	//    7   11:return          
	}

	public static LogLevel valueOf(String s)
	{
		return (LogLevel)Enum.valueOf(com/adjust/sdk/LogLevel, s);
	//    0    0:ldc1            #2   <Class LogLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #55  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class LogLevel>
	//    4    9:areturn         
	}

	public static LogLevel[] values()
	{
		return (LogLevel[])((LogLevel []) ($VALUES)).clone();
	//    0    0:getstatic       #42  <Field LogLevel[] $VALUES>
	//    1    3:invokevirtual   #62  <Method Object _5B_Lcom.adjust.sdk.LogLevel_3B_.clone()>
	//    2    6:checkcast       #58  <Class LogLevel[]>
	//    3    9:areturn         
	}

	public int getAndroidLogLevel()
	{
		return androidLogLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int androidLogLevel>
	//    2    4:ireturn         
	}

	private static final LogLevel $VALUES[];
	public static final LogLevel ASSERT;
	public static final LogLevel DEBUG;
	public static final LogLevel ERROR;
	public static final LogLevel INFO;
	public static final LogLevel VERBOSE;
	public static final LogLevel WARN;
	final int androidLogLevel;

	static 
	{
		VERBOSE = new LogLevel("VERBOSE", 0, 2);
	//    0    0:new             #2   <Class LogLevel>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "VERBOSE">
	//    3    6:iconst_0        
	//    4    7:iconst_2        
	//    5    8:invokespecial   #23  <Method void LogLevel(String, int, int)>
	//    6   11:putstatic       #25  <Field LogLevel VERBOSE>
		DEBUG = new LogLevel("DEBUG", 1, 3);
	//    7   14:new             #2   <Class LogLevel>
	//    8   17:dup             
	//    9   18:ldc1            #26  <String "DEBUG">
	//   10   20:iconst_1        
	//   11   21:iconst_3        
	//   12   22:invokespecial   #23  <Method void LogLevel(String, int, int)>
	//   13   25:putstatic       #28  <Field LogLevel DEBUG>
		INFO = new LogLevel("INFO", 2, 4);
	//   14   28:new             #2   <Class LogLevel>
	//   15   31:dup             
	//   16   32:ldc1            #29  <String "INFO">
	//   17   34:iconst_2        
	//   18   35:iconst_4        
	//   19   36:invokespecial   #23  <Method void LogLevel(String, int, int)>
	//   20   39:putstatic       #31  <Field LogLevel INFO>
		WARN = new LogLevel("WARN", 3, 5);
	//   21   42:new             #2   <Class LogLevel>
	//   22   45:dup             
	//   23   46:ldc1            #32  <String "WARN">
	//   24   48:iconst_3        
	//   25   49:iconst_5        
	//   26   50:invokespecial   #23  <Method void LogLevel(String, int, int)>
	//   27   53:putstatic       #34  <Field LogLevel WARN>
		ERROR = new LogLevel("ERROR", 4, 6);
	//   28   56:new             #2   <Class LogLevel>
	//   29   59:dup             
	//   30   60:ldc1            #35  <String "ERROR">
	//   31   62:iconst_4        
	//   32   63:bipush          6
	//   33   65:invokespecial   #23  <Method void LogLevel(String, int, int)>
	//   34   68:putstatic       #37  <Field LogLevel ERROR>
		ASSERT = new LogLevel("ASSERT", 5, 7);
	//   35   71:new             #2   <Class LogLevel>
	//   36   74:dup             
	//   37   75:ldc1            #38  <String "ASSERT">
	//   38   77:iconst_5        
	//   39   78:bipush          7
	//   40   80:invokespecial   #23  <Method void LogLevel(String, int, int)>
	//   41   83:putstatic       #40  <Field LogLevel ASSERT>
		$VALUES = (new LogLevel[] {
			VERBOSE, DEBUG, INFO, WARN, ERROR, ASSERT
		});
	//   42   86:bipush          6
	//   43   88:anewarray       LogLevel[]
	//   44   91:dup             
	//   45   92:iconst_0        
	//   46   93:getstatic       #25  <Field LogLevel VERBOSE>
	//   47   96:aastore         
	//   48   97:dup             
	//   49   98:iconst_1        
	//   50   99:getstatic       #28  <Field LogLevel DEBUG>
	//   51  102:aastore         
	//   52  103:dup             
	//   53  104:iconst_2        
	//   54  105:getstatic       #31  <Field LogLevel INFO>
	//   55  108:aastore         
	//   56  109:dup             
	//   57  110:iconst_3        
	//   58  111:getstatic       #34  <Field LogLevel WARN>
	//   59  114:aastore         
	//   60  115:dup             
	//   61  116:iconst_4        
	//   62  117:getstatic       #37  <Field LogLevel ERROR>
	//   63  120:aastore         
	//   64  121:dup             
	//   65  122:iconst_5        
	//   66  123:getstatic       #40  <Field LogLevel ASSERT>
	//   67  126:aastore         
	//   68  127:putstatic       #42  <Field LogLevel[] $VALUES>
	//*  69  130:return          
	}
}
