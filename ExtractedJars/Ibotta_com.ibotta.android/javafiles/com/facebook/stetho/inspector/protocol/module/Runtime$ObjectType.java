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
	//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Runtime$ObjectType>
	//    4    9:areturn         
	}

	public static Runtime$ObjectType[] values()
	{
		return (Runtime$ObjectType[])((Runtime$ObjectType []) ($VALUES)).clone();
	//    0    0:getstatic       #63  <Field Runtime$ObjectType[] $VALUES>
	//    1    3:invokevirtual   #83  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Runtime$ObjectType_3B_.clone()>
	//    2    6:checkcast       #79  <Class Runtime$ObjectType[]>
	//    3    9:areturn         
	}

	public String getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String mProtocolValue>
	//    2    4:areturn         
	}

	private static final Runtime$ObjectType $VALUES[];
	public static final Runtime$ObjectType BOOLEAN;
	public static final Runtime$ObjectType FUNCTION;
	public static final Runtime$ObjectType NUMBER;
	public static final Runtime$ObjectType OBJECT;
	public static final Runtime$ObjectType STRING;
	public static final Runtime$ObjectType SYMBOL;
	public static final Runtime$ObjectType UNDEFINED;
	private final String mProtocolValue;

	static 
	{
		OBJECT = new Runtime$ObjectType("OBJECT", 0, "object");
	//    0    0:new             #2   <Class Runtime$ObjectType>
	//    1    3:dup             
	//    2    4:ldc1            #23  <String "OBJECT">
	//    3    6:iconst_0        
	//    4    7:ldc1            #25  <String "object">
	//    5    9:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
	//    6   12:putstatic       #31  <Field Runtime$ObjectType OBJECT>
		FUNCTION = new Runtime$ObjectType("FUNCTION", 1, "function");
	//    7   15:new             #2   <Class Runtime$ObjectType>
	//    8   18:dup             
	//    9   19:ldc1            #32  <String "FUNCTION">
	//   10   21:iconst_1        
	//   11   22:ldc1            #34  <String "function">
	//   12   24:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
	//   13   27:putstatic       #36  <Field Runtime$ObjectType FUNCTION>
		UNDEFINED = new Runtime$ObjectType("UNDEFINED", 2, "undefined");
	//   14   30:new             #2   <Class Runtime$ObjectType>
	//   15   33:dup             
	//   16   34:ldc1            #37  <String "UNDEFINED">
	//   17   36:iconst_2        
	//   18   37:ldc1            #39  <String "undefined">
	//   19   39:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
	//   20   42:putstatic       #41  <Field Runtime$ObjectType UNDEFINED>
		STRING = new Runtime$ObjectType("STRING", 3, "string");
	//   21   45:new             #2   <Class Runtime$ObjectType>
	//   22   48:dup             
	//   23   49:ldc1            #42  <String "STRING">
	//   24   51:iconst_3        
	//   25   52:ldc1            #44  <String "string">
	//   26   54:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
	//   27   57:putstatic       #46  <Field Runtime$ObjectType STRING>
		NUMBER = new Runtime$ObjectType("NUMBER", 4, "number");
	//   28   60:new             #2   <Class Runtime$ObjectType>
	//   29   63:dup             
	//   30   64:ldc1            #47  <String "NUMBER">
	//   31   66:iconst_4        
	//   32   67:ldc1            #49  <String "number">
	//   33   69:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
	//   34   72:putstatic       #51  <Field Runtime$ObjectType NUMBER>
		BOOLEAN = new Runtime$ObjectType("BOOLEAN", 5, "boolean");
	//   35   75:new             #2   <Class Runtime$ObjectType>
	//   36   78:dup             
	//   37   79:ldc1            #52  <String "BOOLEAN">
	//   38   81:iconst_5        
	//   39   82:ldc1            #54  <String "boolean">
	//   40   84:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
	//   41   87:putstatic       #56  <Field Runtime$ObjectType BOOLEAN>
		SYMBOL = new Runtime$ObjectType("SYMBOL", 6, "symbol");
	//   42   90:new             #2   <Class Runtime$ObjectType>
	//   43   93:dup             
	//   44   94:ldc1            #57  <String "SYMBOL">
	//   45   96:bipush          6
	//   46   98:ldc1            #59  <String "symbol">
	//   47  100:invokespecial   #29  <Method void Runtime$ObjectType(String, int, String)>
	//   48  103:putstatic       #61  <Field Runtime$ObjectType SYMBOL>
		$VALUES = (new Runtime$ObjectType[] {
			OBJECT, FUNCTION, UNDEFINED, STRING, NUMBER, BOOLEAN, SYMBOL
		});
	//   49  106:bipush          7
	//   50  108:anewarray       Runtime$ObjectType[]
	//   51  111:dup             
	//   52  112:iconst_0        
	//   53  113:getstatic       #31  <Field Runtime$ObjectType OBJECT>
	//   54  116:aastore         
	//   55  117:dup             
	//   56  118:iconst_1        
	//   57  119:getstatic       #36  <Field Runtime$ObjectType FUNCTION>
	//   58  122:aastore         
	//   59  123:dup             
	//   60  124:iconst_2        
	//   61  125:getstatic       #41  <Field Runtime$ObjectType UNDEFINED>
	//   62  128:aastore         
	//   63  129:dup             
	//   64  130:iconst_3        
	//   65  131:getstatic       #46  <Field Runtime$ObjectType STRING>
	//   66  134:aastore         
	//   67  135:dup             
	//   68  136:iconst_4        
	//   69  137:getstatic       #51  <Field Runtime$ObjectType NUMBER>
	//   70  140:aastore         
	//   71  141:dup             
	//   72  142:iconst_5        
	//   73  143:getstatic       #56  <Field Runtime$ObjectType BOOLEAN>
	//   74  146:aastore         
	//   75  147:dup             
	//   76  148:bipush          6
	//   77  150:getstatic       #61  <Field Runtime$ObjectType SYMBOL>
	//   78  153:aastore         
	//   79  154:putstatic       #63  <Field Runtime$ObjectType[] $VALUES>
	//*  80  157:return          
	}

	private Runtime$ObjectType(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #67  <Method void Enum(String, int)>
		mProtocolValue = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #69  <Field String mProtocolValue>
	//    7   11:return          
	}
}
