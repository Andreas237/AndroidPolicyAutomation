// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;


// Referenced classes of package com.firebase.client:
//			Logger

public static final class Logger$Level extends Enum
{

	public static Logger$Level valueOf(String s)
	{
		return (Logger$Level)Enum.valueOf(com/firebase/client/Logger$Level, s);
	//    0    0:ldc1            #2   <Class Logger$Level>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Logger$Level>
	//    4    9:areturn         
	}

	public static Logger$Level[] values()
	{
		return (Logger$Level[])((Logger$Level []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field Logger$Level[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.firebase.client.Logger$Level_3B_.clone()>
	//    2    6:checkcast       #50  <Class Logger$Level[]>
	//    3    9:areturn         
	}

	private static final Logger$Level $VALUES[];
	public static final Logger$Level DEBUG;
	public static final Logger$Level ERROR;
	public static final Logger$Level INFO;
	public static final Logger$Level NONE;
	public static final Logger$Level WARN;

	static 
	{
		DEBUG = new Logger$Level("DEBUG", 0);
	//    0    0:new             #2   <Class Logger$Level>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "DEBUG">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void Logger$Level(String, int)>
	//    5   10:putstatic       #25  <Field Logger$Level DEBUG>
		INFO = new Logger$Level("INFO", 1);
	//    6   13:new             #2   <Class Logger$Level>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "INFO">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void Logger$Level(String, int)>
	//   11   23:putstatic       #28  <Field Logger$Level INFO>
		WARN = new Logger$Level("WARN", 2);
	//   12   26:new             #2   <Class Logger$Level>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "WARN">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void Logger$Level(String, int)>
	//   17   36:putstatic       #31  <Field Logger$Level WARN>
		ERROR = new Logger$Level("ERROR", 3);
	//   18   39:new             #2   <Class Logger$Level>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "ERROR">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void Logger$Level(String, int)>
	//   23   49:putstatic       #34  <Field Logger$Level ERROR>
		NONE = new Logger$Level("NONE", 4);
	//   24   52:new             #2   <Class Logger$Level>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "NONE">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void Logger$Level(String, int)>
	//   29   62:putstatic       #37  <Field Logger$Level NONE>
		$VALUES = (new Logger$Level[] {
			DEBUG, INFO, WARN, ERROR, NONE
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       Logger$Level[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field Logger$Level DEBUG>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field Logger$Level INFO>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field Logger$Level WARN>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field Logger$Level ERROR>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field Logger$Level NONE>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field Logger$Level[] $VALUES>
	//*  53  102:return          
	}

	private Logger$Level(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
