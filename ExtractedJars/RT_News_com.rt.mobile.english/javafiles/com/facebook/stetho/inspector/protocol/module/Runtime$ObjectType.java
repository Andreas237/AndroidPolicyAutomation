// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;


// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Runtime

public static final class Runtime$ObjectType extends Enum
{

	public static Runtime$ObjectType valueOf(String s)
	{
		return (Runtime$ObjectType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Runtime$ObjectType, s);
	//    0    0:ldc1            #2   <Class Runtime$ObjectType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Runtime$ObjectType>
	//    4    9:areturn         
	}

	public static Runtime$ObjectType[] values()
	{
		return (Runtime$ObjectType[])((Runtime$ObjectType []) ($VALUES)).clone();
	//    0    0:getstatic       #57  <Field Runtime$ObjectType[] $VALUES>
	//    1    3:invokevirtual   #77  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Runtime$ObjectType_3B_.clone()>
	//    2    6:checkcast       #73  <Class Runtime$ObjectType[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String mProtocolValue>
	//    2    4:areturn         
	}

	private static final Runtime$ObjectType $VALUES[];
	public static final Runtime$ObjectType BOOLEAN;
	public static final Runtime$ObjectType FUNCTION;
	public static final Runtime$ObjectType NUMBER;
	public static final Runtime$ObjectType OBJECT;
	public static final Runtime$ObjectType STRING;
	public static final Runtime$ObjectType UNDEFINED;
	private final String mProtocolValue;

	static 
	{
		BOOLEAN = new Runtime$ObjectType("BOOLEAN", 0, "boolean");
	//    0    0:new             #2   <Class Runtime$ObjectType>
	//    1    3:dup             
	//    2    4:ldc1            #22  <String "BOOLEAN">
	//    3    6:iconst_0        
	//    4    7:ldc1            #24  <String "boolean">
	//    5    9:invokespecial   #28  <Method void Runtime$ObjectType(String, int, String)>
	//    6   12:putstatic       #30  <Field Runtime$ObjectType BOOLEAN>
		FUNCTION = new Runtime$ObjectType("FUNCTION", 1, "function");
	//    7   15:new             #2   <Class Runtime$ObjectType>
	//    8   18:dup             
	//    9   19:ldc1            #31  <String "FUNCTION">
	//   10   21:iconst_1        
	//   11   22:ldc1            #33  <String "function">
	//   12   24:invokespecial   #28  <Method void Runtime$ObjectType(String, int, String)>
	//   13   27:putstatic       #35  <Field Runtime$ObjectType FUNCTION>
		NUMBER = new Runtime$ObjectType("NUMBER", 2, "number");
	//   14   30:new             #2   <Class Runtime$ObjectType>
	//   15   33:dup             
	//   16   34:ldc1            #36  <String "NUMBER">
	//   17   36:iconst_2        
	//   18   37:ldc1            #38  <String "number">
	//   19   39:invokespecial   #28  <Method void Runtime$ObjectType(String, int, String)>
	//   20   42:putstatic       #40  <Field Runtime$ObjectType NUMBER>
		OBJECT = new Runtime$ObjectType("OBJECT", 3, "object");
	//   21   45:new             #2   <Class Runtime$ObjectType>
	//   22   48:dup             
	//   23   49:ldc1            #41  <String "OBJECT">
	//   24   51:iconst_3        
	//   25   52:ldc1            #43  <String "object">
	//   26   54:invokespecial   #28  <Method void Runtime$ObjectType(String, int, String)>
	//   27   57:putstatic       #45  <Field Runtime$ObjectType OBJECT>
		STRING = new Runtime$ObjectType("STRING", 4, "string");
	//   28   60:new             #2   <Class Runtime$ObjectType>
	//   29   63:dup             
	//   30   64:ldc1            #46  <String "STRING">
	//   31   66:iconst_4        
	//   32   67:ldc1            #48  <String "string">
	//   33   69:invokespecial   #28  <Method void Runtime$ObjectType(String, int, String)>
	//   34   72:putstatic       #50  <Field Runtime$ObjectType STRING>
		UNDEFINED = new Runtime$ObjectType("UNDEFINED", 5, "undefined");
	//   35   75:new             #2   <Class Runtime$ObjectType>
	//   36   78:dup             
	//   37   79:ldc1            #51  <String "UNDEFINED">
	//   38   81:iconst_5        
	//   39   82:ldc1            #53  <String "undefined">
	//   40   84:invokespecial   #28  <Method void Runtime$ObjectType(String, int, String)>
	//   41   87:putstatic       #55  <Field Runtime$ObjectType UNDEFINED>
		$VALUES = (new Runtime$ObjectType[] {
			BOOLEAN, FUNCTION, NUMBER, OBJECT, STRING, UNDEFINED
		});
	//   42   90:bipush          6
	//   43   92:anewarray       Runtime$ObjectType[]
	//   44   95:dup             
	//   45   96:iconst_0        
	//   46   97:getstatic       #30  <Field Runtime$ObjectType BOOLEAN>
	//   47  100:aastore         
	//   48  101:dup             
	//   49  102:iconst_1        
	//   50  103:getstatic       #35  <Field Runtime$ObjectType FUNCTION>
	//   51  106:aastore         
	//   52  107:dup             
	//   53  108:iconst_2        
	//   54  109:getstatic       #40  <Field Runtime$ObjectType NUMBER>
	//   55  112:aastore         
	//   56  113:dup             
	//   57  114:iconst_3        
	//   58  115:getstatic       #45  <Field Runtime$ObjectType OBJECT>
	//   59  118:aastore         
	//   60  119:dup             
	//   61  120:iconst_4        
	//   62  121:getstatic       #50  <Field Runtime$ObjectType STRING>
	//   63  124:aastore         
	//   64  125:dup             
	//   65  126:iconst_5        
	//   66  127:getstatic       #55  <Field Runtime$ObjectType UNDEFINED>
	//   67  130:aastore         
	//   68  131:putstatic       #57  <Field Runtime$ObjectType[] $VALUES>
	//*  69  134:return          
	}

	private Runtime$ObjectType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		mProtocolValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #63  <Field String mProtocolValue>
	//    7   11:return          
	}
}
