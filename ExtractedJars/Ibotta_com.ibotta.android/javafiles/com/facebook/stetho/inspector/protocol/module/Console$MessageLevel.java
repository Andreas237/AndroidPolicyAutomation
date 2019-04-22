// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Console

public static final class Console$MessageLevel extends Enum
{

	public static Console$MessageLevel valueOf(String s)
	{
		return (Console$MessageLevel)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Console$MessageLevel, s);
	//    0    0:ldc1            #2   <Class Console$MessageLevel>
	//    1    2:aload_0         
	//    2    3:invokestatic    #58  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Console$MessageLevel>
	//    4    9:areturn         
	}

	public static Console$MessageLevel[] values()
	{
		return (Console$MessageLevel[])((Console$MessageLevel []) ($VALUES)).clone();
	//    0    0:getstatic       #45  <Field Console$MessageLevel[] $VALUES>
	//    1    3:invokevirtual   #65  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Console$MessageLevel_3B_.clone()>
	//    2    6:checkcast       #61  <Class Console$MessageLevel[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String mProtocolValue>
	//    2    4:areturn         
	}

	private static final Console$MessageLevel $VALUES[];
	public static final Console$MessageLevel DEBUG;
	public static final Console$MessageLevel ERROR;
	public static final Console$MessageLevel LOG;
	public static final Console$MessageLevel WARNING;
	private final String mProtocolValue;

	static 
	{
		LOG = new Console$MessageLevel("LOG", 0, "log");
	//    0    0:new             #2   <Class Console$MessageLevel>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "LOG">
	//    3    6:iconst_0        
	//    4    7:ldc1            #22  <String "log">
	//    5    9:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
	//    6   12:putstatic       #28  <Field Console$MessageLevel LOG>
		WARNING = new Console$MessageLevel("WARNING", 1, "warning");
	//    7   15:new             #2   <Class Console$MessageLevel>
	//    8   18:dup             
	//    9   19:ldc1            #29  <String "WARNING">
	//   10   21:iconst_1        
	//   11   22:ldc1            #31  <String "warning">
	//   12   24:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
	//   13   27:putstatic       #33  <Field Console$MessageLevel WARNING>
		ERROR = new Console$MessageLevel("ERROR", 2, "error");
	//   14   30:new             #2   <Class Console$MessageLevel>
	//   15   33:dup             
	//   16   34:ldc1            #34  <String "ERROR">
	//   17   36:iconst_2        
	//   18   37:ldc1            #36  <String "error">
	//   19   39:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
	//   20   42:putstatic       #38  <Field Console$MessageLevel ERROR>
		DEBUG = new Console$MessageLevel("DEBUG", 3, "debug");
	//   21   45:new             #2   <Class Console$MessageLevel>
	//   22   48:dup             
	//   23   49:ldc1            #39  <String "DEBUG">
	//   24   51:iconst_3        
	//   25   52:ldc1            #41  <String "debug">
	//   26   54:invokespecial   #26  <Method void Console$MessageLevel(String, int, String)>
	//   27   57:putstatic       #43  <Field Console$MessageLevel DEBUG>
		$VALUES = (new Console$MessageLevel[] {
			LOG, WARNING, ERROR, DEBUG
		});
	//   28   60:iconst_4        
	//   29   61:anewarray       Console$MessageLevel[]
	//   30   64:dup             
	//   31   65:iconst_0        
	//   32   66:getstatic       #28  <Field Console$MessageLevel LOG>
	//   33   69:aastore         
	//   34   70:dup             
	//   35   71:iconst_1        
	//   36   72:getstatic       #33  <Field Console$MessageLevel WARNING>
	//   37   75:aastore         
	//   38   76:dup             
	//   39   77:iconst_2        
	//   40   78:getstatic       #38  <Field Console$MessageLevel ERROR>
	//   41   81:aastore         
	//   42   82:dup             
	//   43   83:iconst_3        
	//   44   84:getstatic       #43  <Field Console$MessageLevel DEBUG>
	//   45   87:aastore         
	//   46   88:putstatic       #45  <Field Console$MessageLevel[] $VALUES>
	//*  47   91:return          
	}

	private Console$MessageLevel(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #49  <Method void Enum(String, int)>
		mProtocolValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #51  <Field String mProtocolValue>
	//    7   11:return          
	}
}
