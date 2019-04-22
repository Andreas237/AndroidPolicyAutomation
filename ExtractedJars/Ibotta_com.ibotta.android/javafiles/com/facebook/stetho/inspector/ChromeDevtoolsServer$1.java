// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;


// Referenced classes of package com.facebook.stetho.inspector:
//			ChromeDevtoolsServer

static class ChromeDevtoolsServer$1
{

	static final int $SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode[];

	static 
	{
		$SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode = new int[com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.values().length];
	//    0    0:invokestatic    #18  <Method com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode[] com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode>
		try
		{
			$SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode[com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.METHOD_NOT_FOUND.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode>
	//    5   12:getstatic       #24  <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.METHOD_NOT_FOUND>
	//    6   15:invokevirtual   #28  <Method int com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
	//    9   20:return          
		}
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   21:astore_0        
	//*  11   22:return          
	}
}
