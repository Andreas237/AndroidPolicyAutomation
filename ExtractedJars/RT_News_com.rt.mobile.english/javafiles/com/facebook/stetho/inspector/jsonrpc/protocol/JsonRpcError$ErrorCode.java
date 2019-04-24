// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc.protocol;


// Referenced classes of package com.facebook.stetho.inspector.jsonrpc.protocol:
//			JsonRpcError

public static final class JsonRpcError$ErrorCode extends Enum
{

	public static JsonRpcError$ErrorCode valueOf(String s)
	{
		return (JsonRpcError$ErrorCode)Enum.valueOf(com/facebook/stetho/inspector/jsonrpc/protocol/JsonRpcError$ErrorCode, s);
	//    0    0:ldc1            #2   <Class JsonRpcError$ErrorCode>
	//    1    2:aload_0         
	//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class JsonRpcError$ErrorCode>
	//    4    9:areturn         
	}

	public static JsonRpcError$ErrorCode[] values()
	{
		return (JsonRpcError$ErrorCode[])((JsonRpcError$ErrorCode []) ($VALUES)).clone();
	//    0    0:getstatic       #41  <Field JsonRpcError$ErrorCode[] $VALUES>
	//    1    3:invokevirtual   #61  <Method Object _5B_Lcom.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode_3B_.clone()>
	//    2    6:checkcast       #57  <Class JsonRpcError$ErrorCode[]>
	//    3    9:areturn         
	}

	public int getProtocolValue()
	{
		return mProtocolValue;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mProtocolValue>
	//    2    4:ireturn         
	}

	private static final JsonRpcError$ErrorCode $VALUES[];
	public static final JsonRpcError$ErrorCode INTERNAL_ERROR;
	public static final JsonRpcError$ErrorCode INVALID_PARAMS;
	public static final JsonRpcError$ErrorCode INVALID_REQUEST;
	public static final JsonRpcError$ErrorCode METHOD_NOT_FOUND;
	public static final JsonRpcError$ErrorCode PARSER_ERROR;
	private final int mProtocolValue;

	static 
	{
		PARSER_ERROR = new JsonRpcError$ErrorCode("PARSER_ERROR", 0, -32700);
	//    0    0:new             #2   <Class JsonRpcError$ErrorCode>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "PARSER_ERROR">
	//    3    6:iconst_0        
	//    4    7:sipush          -32700
	//    5   10:invokespecial   #25  <Method void JsonRpcError$ErrorCode(String, int, int)>
	//    6   13:putstatic       #27  <Field JsonRpcError$ErrorCode PARSER_ERROR>
		INVALID_REQUEST = new JsonRpcError$ErrorCode("INVALID_REQUEST", 1, -32600);
	//    7   16:new             #2   <Class JsonRpcError$ErrorCode>
	//    8   19:dup             
	//    9   20:ldc1            #28  <String "INVALID_REQUEST">
	//   10   22:iconst_1        
	//   11   23:sipush          -32600
	//   12   26:invokespecial   #25  <Method void JsonRpcError$ErrorCode(String, int, int)>
	//   13   29:putstatic       #30  <Field JsonRpcError$ErrorCode INVALID_REQUEST>
		METHOD_NOT_FOUND = new JsonRpcError$ErrorCode("METHOD_NOT_FOUND", 2, -32601);
	//   14   32:new             #2   <Class JsonRpcError$ErrorCode>
	//   15   35:dup             
	//   16   36:ldc1            #31  <String "METHOD_NOT_FOUND">
	//   17   38:iconst_2        
	//   18   39:sipush          -32601
	//   19   42:invokespecial   #25  <Method void JsonRpcError$ErrorCode(String, int, int)>
	//   20   45:putstatic       #33  <Field JsonRpcError$ErrorCode METHOD_NOT_FOUND>
		INVALID_PARAMS = new JsonRpcError$ErrorCode("INVALID_PARAMS", 3, -32602);
	//   21   48:new             #2   <Class JsonRpcError$ErrorCode>
	//   22   51:dup             
	//   23   52:ldc1            #34  <String "INVALID_PARAMS">
	//   24   54:iconst_3        
	//   25   55:sipush          -32602
	//   26   58:invokespecial   #25  <Method void JsonRpcError$ErrorCode(String, int, int)>
	//   27   61:putstatic       #36  <Field JsonRpcError$ErrorCode INVALID_PARAMS>
		INTERNAL_ERROR = new JsonRpcError$ErrorCode("INTERNAL_ERROR", 4, -32603);
	//   28   64:new             #2   <Class JsonRpcError$ErrorCode>
	//   29   67:dup             
	//   30   68:ldc1            #37  <String "INTERNAL_ERROR">
	//   31   70:iconst_4        
	//   32   71:sipush          -32603
	//   33   74:invokespecial   #25  <Method void JsonRpcError$ErrorCode(String, int, int)>
	//   34   77:putstatic       #39  <Field JsonRpcError$ErrorCode INTERNAL_ERROR>
		$VALUES = (new JsonRpcError$ErrorCode[] {
			PARSER_ERROR, INVALID_REQUEST, METHOD_NOT_FOUND, INVALID_PARAMS, INTERNAL_ERROR
		});
	//   35   80:iconst_5        
	//   36   81:anewarray       JsonRpcError$ErrorCode[]
	//   37   84:dup             
	//   38   85:iconst_0        
	//   39   86:getstatic       #27  <Field JsonRpcError$ErrorCode PARSER_ERROR>
	//   40   89:aastore         
	//   41   90:dup             
	//   42   91:iconst_1        
	//   43   92:getstatic       #30  <Field JsonRpcError$ErrorCode INVALID_REQUEST>
	//   44   95:aastore         
	//   45   96:dup             
	//   46   97:iconst_2        
	//   47   98:getstatic       #33  <Field JsonRpcError$ErrorCode METHOD_NOT_FOUND>
	//   48  101:aastore         
	//   49  102:dup             
	//   50  103:iconst_3        
	//   51  104:getstatic       #36  <Field JsonRpcError$ErrorCode INVALID_PARAMS>
	//   52  107:aastore         
	//   53  108:dup             
	//   54  109:iconst_4        
	//   55  110:getstatic       #39  <Field JsonRpcError$ErrorCode INTERNAL_ERROR>
	//   56  113:aastore         
	//   57  114:putstatic       #41  <Field JsonRpcError$ErrorCode[] $VALUES>
	//*  58  117:return          
	}

	private JsonRpcError$ErrorCode(String s, int i, int j)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #45  <Method void Enum(String, int)>
		mProtocolValue = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #47  <Field int mProtocolValue>
	//    7   11:return          
	}
}
