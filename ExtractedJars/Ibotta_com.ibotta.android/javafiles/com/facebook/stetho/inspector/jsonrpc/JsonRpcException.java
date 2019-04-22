// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc;

import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;

public class JsonRpcException extends Exception
{

	public JsonRpcException(JsonRpcError jsonrpcerror)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #10  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(((Object) (jsonrpcerror.code)));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:getfield        #19  <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode JsonRpcError.code>
	//    7   13:invokevirtual   #23  <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(": ");
	//    9   17:aload_2         
	//   10   18:ldc1            #25  <String ": ">
	//   11   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(jsonrpcerror.message);
	//   13   24:aload_2         
	//   14   25:aload_1         
	//   15   26:getfield        #32  <Field String JsonRpcError.message>
	//   16   29:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		super(stringbuilder.toString());
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   21   38:invokespecial   #39  <Method void Exception(String)>
		mErrorMessage = (JsonRpcError)Util.throwIfNull(((Object) (jsonrpcerror)));
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:invokestatic    #45  <Method Object Util.throwIfNull(Object)>
	//   25   46:checkcast       #15  <Class JsonRpcError>
	//   26   49:putfield        #47  <Field JsonRpcError mErrorMessage>
	//   27   52:return          
	}

	public JsonRpcError getErrorMessage()
	{
		return mErrorMessage;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field JsonRpcError mErrorMessage>
	//    2    4:areturn         
	}

	private final JsonRpcError mErrorMessage;
}
