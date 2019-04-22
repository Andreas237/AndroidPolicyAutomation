// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;


// Referenced classes of package com.appsflyer:
//			AFLogger

public static final class AFLogger$LogLevel extends Enum
{

	public static AFLogger$LogLevel valueOf(String s)
	{
		return (AFLogger$LogLevel)Enum.valueOf(com/appsflyer/AFLogger$LogLevel, s);
	//    0    0:ldc1            #2   <Class AFLogger$LogLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AFLogger$LogLevel>
	//    4    9:areturn         
	}

	public static AFLogger$LogLevel[] values()
	{
		return (AFLogger$LogLevel[])((AFLogger$LogLevel []) (_fld02CF)).clone();
	//    0    0:getstatic       #45  <Field AFLogger$LogLevel[] _fld02CF>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.appsflyer.AFLogger$LogLevel_3B_.clone()>
	//    2    6:checkcast       #61  <Class AFLogger$LogLevel[]>
	//    3    9:areturn         
	}

	public final int getLevel()
	{
		return _fld02CE;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int _fld02CE>
	//    2    4:ireturn         
	}

	public static final AFLogger$LogLevel DEBUG;
	public static final AFLogger$LogLevel ERROR;
	public static final AFLogger$LogLevel INFO;
	public static final AFLogger$LogLevel NONE;
	public static final AFLogger$LogLevel VERBOSE;
	public static final AFLogger$LogLevel WARNING;
	private static final AFLogger$LogLevel _fld02CF[];
	private int _fld02CE;

	static 
	{
		NONE = new AFLogger$LogLevel("NONE", 0, 0);
	//    0    0:new             #2   <Class AFLogger$LogLevel>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:iconst_0        
	//    5    8:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
	//    6   11:putstatic       #28  <Field AFLogger$LogLevel NONE>
		ERROR = new AFLogger$LogLevel("ERROR", 1, 1);
	//    7   14:new             #2   <Class AFLogger$LogLevel>
	//    8   17:dup             
	//    9   18:ldc1            #29  <String "ERROR">
	//   10   20:iconst_1        
	//   11   21:iconst_1        
	//   12   22:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
	//   13   25:putstatic       #31  <Field AFLogger$LogLevel ERROR>
		WARNING = new AFLogger$LogLevel("WARNING", 2, 2);
	//   14   28:new             #2   <Class AFLogger$LogLevel>
	//   15   31:dup             
	//   16   32:ldc1            #32  <String "WARNING">
	//   17   34:iconst_2        
	//   18   35:iconst_2        
	//   19   36:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
	//   20   39:putstatic       #34  <Field AFLogger$LogLevel WARNING>
		INFO = new AFLogger$LogLevel("INFO", 3, 3);
	//   21   42:new             #2   <Class AFLogger$LogLevel>
	//   22   45:dup             
	//   23   46:ldc1            #35  <String "INFO">
	//   24   48:iconst_3        
	//   25   49:iconst_3        
	//   26   50:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
	//   27   53:putstatic       #37  <Field AFLogger$LogLevel INFO>
		DEBUG = new AFLogger$LogLevel("DEBUG", 4, 4);
	//   28   56:new             #2   <Class AFLogger$LogLevel>
	//   29   59:dup             
	//   30   60:ldc1            #38  <String "DEBUG">
	//   31   62:iconst_4        
	//   32   63:iconst_4        
	//   33   64:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
	//   34   67:putstatic       #40  <Field AFLogger$LogLevel DEBUG>
		VERBOSE = new AFLogger$LogLevel("VERBOSE", 5, 5);
	//   35   70:new             #2   <Class AFLogger$LogLevel>
	//   36   73:dup             
	//   37   74:ldc1            #41  <String "VERBOSE">
	//   38   76:iconst_5        
	//   39   77:iconst_5        
	//   40   78:invokespecial   #26  <Method void AFLogger$LogLevel(String, int, int)>
	//   41   81:putstatic       #43  <Field AFLogger$LogLevel VERBOSE>
		_fld02CF = (new AFLogger$LogLevel[] {
			NONE, ERROR, WARNING, INFO, DEBUG, VERBOSE
		});
	//   42   84:bipush          6
	//   43   86:anewarray       AFLogger$LogLevel[]
	//   44   89:dup             
	//   45   90:iconst_0        
	//   46   91:getstatic       #28  <Field AFLogger$LogLevel NONE>
	//   47   94:aastore         
	//   48   95:dup             
	//   49   96:iconst_1        
	//   50   97:getstatic       #31  <Field AFLogger$LogLevel ERROR>
	//   51  100:aastore         
	//   52  101:dup             
	//   53  102:iconst_2        
	//   54  103:getstatic       #34  <Field AFLogger$LogLevel WARNING>
	//   55  106:aastore         
	//   56  107:dup             
	//   57  108:iconst_3        
	//   58  109:getstatic       #37  <Field AFLogger$LogLevel INFO>
	//   59  112:aastore         
	//   60  113:dup             
	//   61  114:iconst_4        
	//   62  115:getstatic       #40  <Field AFLogger$LogLevel DEBUG>
	//   63  118:aastore         
	//   64  119:dup             
	//   65  120:iconst_5        
	//   66  121:getstatic       #43  <Field AFLogger$LogLevel VERBOSE>
	//   67  124:aastore         
	//   68  125:putstatic       #45  <Field AFLogger$LogLevel[] _fld02CF>
	//*  69  128:return          
	}

	private AFLogger$LogLevel(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		_fld02CE = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #51  <Field int _fld02CE>
	//    7   11:return          
	}
}
