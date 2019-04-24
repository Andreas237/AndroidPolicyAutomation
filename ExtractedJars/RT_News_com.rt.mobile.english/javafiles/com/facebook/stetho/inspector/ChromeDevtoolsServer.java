// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;

import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcException;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.PendingRequest;
import com.facebook.stetho.inspector.jsonrpc.PendingRequestCallback;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcResponse;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.SimpleEndpoint;
import com.facebook.stetho.websocket.SimpleSession;
import java.io.IOException;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector:
//			MethodDispatcher, MessageHandlingException, MismatchedResponseException

public class ChromeDevtoolsServer
	implements SimpleEndpoint
{

	public ChromeDevtoolsServer(Iterable iterable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void HashMap()>
	//    6   12:invokestatic    #36  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #38  <Field Map mPeers>
	//    8   18:aload_0         
	//    9   19:new             #40  <Class ObjectMapper>
	//   10   22:dup             
	//   11   23:invokespecial   #41  <Method void ObjectMapper()>
	//   12   26:putfield        #43  <Field ObjectMapper mObjectMapper>
		mMethodDispatcher = new MethodDispatcher(mObjectMapper, iterable);
	//   13   29:aload_0         
	//   14   30:new             #45  <Class MethodDispatcher>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #43  <Field ObjectMapper mObjectMapper>
	//   18   38:aload_1         
	//   19   39:invokespecial   #48  <Method void MethodDispatcher(ObjectMapper, Iterable)>
	//   20   42:putfield        #50  <Field MethodDispatcher mMethodDispatcher>
	//   21   45:return          
	}

	private void closeSafely(SimpleSession simplesession, int i, String s)
	{
		simplesession.close(i, s);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #61  <Method void SimpleSession.close(int, String)>
	//    4    8:return          
	}

	private void handleRemoteMessage(JsonRpcPeer jsonrpcpeer, String s)
		throws IOException, MessageHandlingException, JSONException
	{
		JSONObject jsonobject = new JSONObject(s);
	//    0    0:new             #71  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #74  <Method void JSONObject(String)>
	//    4    8:astore_3        
		if(jsonobject.has("method"))
	//*   5    9:aload_3         
	//*   6   10:ldc1            #76  <String "method">
	//*   7   12:invokevirtual   #80  <Method boolean JSONObject.has(String)>
	//*   8   15:ifeq            25
		{
			handleRemoteRequest(jsonrpcpeer, jsonobject);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_3         
	//   12   21:invokespecial   #84  <Method void handleRemoteRequest(JsonRpcPeer, JSONObject)>
			return;
	//   13   24:return          
		}
		if(jsonobject.has("result"))
	//*  14   25:aload_3         
	//*  15   26:ldc1            #86  <String "result">
	//*  16   28:invokevirtual   #80  <Method boolean JSONObject.has(String)>
	//*  17   31:ifeq            41
		{
			handleRemoteResponse(jsonrpcpeer, jsonobject);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:aload_3         
	//   21   37:invokespecial   #89  <Method void handleRemoteResponse(JsonRpcPeer, JSONObject)>
			return;
	//   22   40:return          
		} else
		{
			jsonrpcpeer = ((JsonRpcPeer) (new StringBuilder()));
	//   23   41:new             #91  <Class StringBuilder>
	//   24   44:dup             
	//   25   45:invokespecial   #92  <Method void StringBuilder()>
	//   26   48:astore_1        
			((StringBuilder) (jsonrpcpeer)).append("Improper JSON-RPC message: ");
	//   27   49:aload_1         
	//   28   50:ldc1            #94  <String "Improper JSON-RPC message: ">
	//   29   52:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
			((StringBuilder) (jsonrpcpeer)).append(s);
	//   31   56:aload_1         
	//   32   57:aload_2         
	//   33   58:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
			throw new MessageHandlingException(((StringBuilder) (jsonrpcpeer)).toString());
	//   35   62:new             #67  <Class MessageHandlingException>
	//   36   65:dup             
	//   37   66:aload_1         
	//   38   67:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   39   70:invokespecial   #103 <Method void MessageHandlingException(String)>
	//   40   73:athrow          
		}
	}

	private void handleRemoteRequest(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws MessageHandlingException
	{
		JsonRpcRequest jsonrpcrequest;
		jsonrpcrequest = (JsonRpcRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/jsonrpc/protocol/JsonRpcRequest);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #108 <Class JsonRpcRequest>
	//    4    7:invokevirtual   #112 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #108 <Class JsonRpcRequest>
	//    6   13:astore          5
		jsonobject = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
		JSONObject jsonobject1 = mMethodDispatcher.dispatch(jsonrpcpeer, jsonrpcrequest.method, jsonrpcrequest.params);
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field MethodDispatcher mMethodDispatcher>
	//   11   21:aload_1         
	//   12   22:aload           5
	//   13   24:getfield        #114 <Field String JsonRpcRequest.method>
	//   14   27:aload           5
	//   15   29:getfield        #118 <Field JSONObject JsonRpcRequest.params>
	//   16   32:invokevirtual   #122 <Method JSONObject MethodDispatcher.dispatch(JsonRpcPeer, String, JSONObject)>
	//   17   35:astore          4
		Object obj;
		obj = null;
	//   18   37:aconst_null     
	//   19   38:astore_3        
		jsonobject = jsonobject1;
	//   20   39:aload           4
	//   21   41:astore_2        
		break MISSING_BLOCK_LABEL_67;
	//   22   42:goto            67
		obj;
	//   23   45:astore_3        
		logDispatchException(((JsonRpcException) (obj)));
	//   24   46:aload_3         
	//   25   47:invokestatic    #126 <Method void logDispatchException(JsonRpcException)>
		obj = ((Object) ((JSONObject)mObjectMapper.convertValue(((Object) (((JsonRpcException) (obj)).getErrorMessage())), org/json/JSONObject)));
	//   26   50:aload_0         
	//   27   51:getfield        #43  <Field ObjectMapper mObjectMapper>
	//   28   54:aload_3         
	//   29   55:invokevirtual   #130 <Method JsonRpcError JsonRpcException.getErrorMessage()>
	//   30   58:ldc1            #71  <Class JSONObject>
	//   31   60:invokevirtual   #112 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   32   63:checkcast       #71  <Class JSONObject>
	//   33   66:astore_3        
		if(jsonrpcrequest.id != null)
	//*  34   67:aload           5
	//*  35   69:getfield        #134 <Field Long JsonRpcRequest.id>
	//*  36   72:ifnull          137
		{
			JsonRpcResponse jsonrpcresponse = new JsonRpcResponse();
	//   37   75:new             #136 <Class JsonRpcResponse>
	//   38   78:dup             
	//   39   79:invokespecial   #137 <Method void JsonRpcResponse()>
	//   40   82:astore          4
			jsonrpcresponse.id = jsonrpcrequest.id.longValue();
	//   41   84:aload           4
	//   42   86:aload           5
	//   43   88:getfield        #134 <Field Long JsonRpcRequest.id>
	//   44   91:invokevirtual   #143 <Method long Long.longValue()>
	//   45   94:putfield        #146 <Field long JsonRpcResponse.id>
			jsonrpcresponse.result = jsonobject;
	//   46   97:aload           4
	//   47   99:aload_2         
	//   48  100:putfield        #148 <Field JSONObject JsonRpcResponse.result>
			jsonrpcresponse.error = ((JSONObject) (obj));
	//   49  103:aload           4
	//   50  105:aload_3         
	//   51  106:putfield        #151 <Field JSONObject JsonRpcResponse.error>
			jsonobject = ((JSONObject) (((JSONObject)mObjectMapper.convertValue(((Object) (jsonrpcresponse)), org/json/JSONObject)).toString()));
	//   52  109:aload_0         
	//   53  110:getfield        #43  <Field ObjectMapper mObjectMapper>
	//   54  113:aload           4
	//   55  115:ldc1            #71  <Class JSONObject>
	//   56  117:invokevirtual   #112 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   57  120:checkcast       #71  <Class JSONObject>
	//   58  123:invokevirtual   #152 <Method String JSONObject.toString()>
	//   59  126:astore_2        
			jsonrpcpeer.getWebSocket().sendText(((String) (jsonobject)));
	//   60  127:aload_1         
	//   61  128:invokevirtual   #158 <Method SimpleSession JsonRpcPeer.getWebSocket()>
	//   62  131:aload_2         
	//   63  132:invokeinterface #161 <Method void SimpleSession.sendText(String)>
		}
		return;
	//   64  137:return          
	}

	private void handleRemoteResponse(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws MismatchedResponseException
	{
		jsonobject = ((JSONObject) ((JsonRpcResponse)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/jsonrpc/protocol/JsonRpcResponse)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #136 <Class JsonRpcResponse>
	//    4    7:invokevirtual   #112 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #136 <Class JsonRpcResponse>
	//    6   13:astore_2        
		PendingRequest pendingrequest = jsonrpcpeer.getAndRemovePendingRequest(((JsonRpcResponse) (jsonobject)).id);
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:getfield        #146 <Field long JsonRpcResponse.id>
	//   10   19:invokevirtual   #167 <Method PendingRequest JsonRpcPeer.getAndRemovePendingRequest(long)>
	//   11   22:astore_3        
		if(pendingrequest == null)
	//*  12   23:aload_3         
	//*  13   24:ifnonnull       39
			throw new MismatchedResponseException(((JsonRpcResponse) (jsonobject)).id);
	//   14   27:new             #163 <Class MismatchedResponseException>
	//   15   30:dup             
	//   16   31:aload_2         
	//   17   32:getfield        #146 <Field long JsonRpcResponse.id>
	//   18   35:invokespecial   #170 <Method void MismatchedResponseException(long)>
	//   19   38:athrow          
		if(pendingrequest.callback != null)
	//*  20   39:aload_3         
	//*  21   40:getfield        #176 <Field PendingRequestCallback PendingRequest.callback>
	//*  22   43:ifnull          57
			pendingrequest.callback.onResponse(jsonrpcpeer, ((JsonRpcResponse) (jsonobject)));
	//   23   46:aload_3         
	//   24   47:getfield        #176 <Field PendingRequestCallback PendingRequest.callback>
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:invokeinterface #182 <Method void PendingRequestCallback.onResponse(JsonRpcPeer, JsonRpcResponse)>
	//   28   57:return          
	}

	private static void logDispatchException(JsonRpcException jsonrpcexception)
	{
		JsonRpcError jsonrpcerror = jsonrpcexception.getErrorMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method JsonRpcError JsonRpcException.getErrorMessage()>
	//    2    4:astore_1        
		static class _cls1
		{

			static final int $SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode[];

			static 
			{
				$SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode = new int[com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.values().length];
			//    0    0:invokestatic    #18  <Method com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode[] com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode>
				try
				{
					$SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode[com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.METHOD_NOT_FOUND.ordinal()] = 1;
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

		if(_cls1..SwitchMap.com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode[jsonrpcerror.code.ordinal()] != 1)
	//*   3    5:getstatic       #186 <Field int[] ChromeDevtoolsServer$1.$SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode>
	//*   4    8:aload_1         
	//*   5    9:getfield        #192 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode JsonRpcError.code>
	//*   6   12:invokevirtual   #198 <Method int com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.ordinal()>
	//*   7   15:iaload          
	//*   8   16:iconst_1        
	//*   9   17:icmpeq          29
		{
			LogRedirector.w("ChromeDevtoolsServer", "Error processing remote message", ((Throwable) (jsonrpcexception)));
	//   10   20:ldc1            #15  <String "ChromeDevtoolsServer">
	//   11   22:ldc1            #200 <String "Error processing remote message">
	//   12   24:aload_0         
	//   13   25:invokestatic    #206 <Method void LogRedirector.w(String, String, Throwable)>
			return;
	//   14   28:return          
		} else
		{
			jsonrpcexception = ((JsonRpcException) (new StringBuilder()));
	//   15   29:new             #91  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #92  <Method void StringBuilder()>
	//   18   36:astore_0        
			((StringBuilder) (jsonrpcexception)).append("Method not implemented: ");
	//   19   37:aload_0         
	//   20   38:ldc1            #208 <String "Method not implemented: ">
	//   21   40:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			((StringBuilder) (jsonrpcexception)).append(jsonrpcerror.message);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:getfield        #211 <Field String JsonRpcError.message>
	//   26   49:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			LogRedirector.d("ChromeDevtoolsServer", ((StringBuilder) (jsonrpcexception)).toString());
	//   28   53:ldc1            #15  <String "ChromeDevtoolsServer">
	//   29   55:aload_0         
	//   30   56:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   31   59:invokestatic    #215 <Method void LogRedirector.d(String, String)>
			return;
	//   32   62:return          
		}
	}

	public void onClose(SimpleSession simplesession, int i, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #91  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("onClose: reason=");
	//    4    9:aload           4
	//    5   11:ldc1            #218 <String "onClose: reason=">
	//    6   13:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           4
	//    9   19:iload_2         
	//   10   20:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(" ");
	//   12   24:aload           4
	//   13   26:ldc1            #223 <String " ">
	//   14   28:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(s);
	//   16   32:aload           4
	//   17   34:aload_3         
	//   18   35:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		LogRedirector.d("ChromeDevtoolsServer", stringbuilder.toString());
	//   20   39:ldc1            #15  <String "ChromeDevtoolsServer">
	//   21   41:aload           4
	//   22   43:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   23   46:invokestatic    #215 <Method void LogRedirector.d(String, String)>
		simplesession = ((SimpleSession) ((JsonRpcPeer)mPeers.remove(((Object) (simplesession)))));
	//   24   49:aload_0         
	//   25   50:getfield        #38  <Field Map mPeers>
	//   26   53:aload_1         
	//   27   54:invokeinterface #229 <Method Object Map.remove(Object)>
	//   28   59:checkcast       #154 <Class JsonRpcPeer>
	//   29   62:astore_1        
		if(simplesession != null)
	//*  30   63:aload_1         
	//*  31   64:ifnull          71
			((JsonRpcPeer) (simplesession)).invokeDisconnectReceivers();
	//   32   67:aload_1         
	//   33   68:invokevirtual   #232 <Method void JsonRpcPeer.invokeDisconnectReceivers()>
	//   34   71:return          
	}

	public void onError(SimpleSession simplesession, Throwable throwable)
	{
		simplesession = ((SimpleSession) (new StringBuilder()));
	//    0    0:new             #91  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (simplesession)).append("onError: ex=");
	//    4    8:aload_1         
	//    5    9:ldc1            #236 <String "onError: ex=">
	//    6   11:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (simplesession)).append(throwable.toString());
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #239 <Method String Throwable.toString()>
	//   11   20:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		LogRedirector.e("ChromeDevtoolsServer", ((StringBuilder) (simplesession)).toString());
	//   13   24:ldc1            #15  <String "ChromeDevtoolsServer">
	//   14   26:aload_1         
	//   15   27:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #242 <Method void LogRedirector.e(String, String)>
	//   17   33:return          
	}

	public void onMessage(SimpleSession simplesession, String s)
	{
		if(LogRedirector.isLoggable("ChromeDevtoolsServer", 2))
	//*   0    0:ldc1            #15  <String "ChromeDevtoolsServer">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #248 <Method boolean LogRedirector.isLoggable(String, int)>
	//*   3    6:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #91  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #92  <Method void StringBuilder()>
	//    7   16:astore_3        
			stringbuilder.append("onMessage: message=");
	//    8   17:aload_3         
	//    9   18:ldc1            #250 <String "onMessage: message=">
	//   10   20:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(s);
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			LogRedirector.v("ChromeDevtoolsServer", stringbuilder.toString());
	//   16   30:ldc1            #15  <String "ChromeDevtoolsServer">
	//   17   32:aload_3         
	//   18   33:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   19   36:invokestatic    #253 <Method void LogRedirector.v(String, String)>
		}
		try
		{
			JsonRpcPeer jsonrpcpeer = (JsonRpcPeer)mPeers.get(((Object) (simplesession)));
	//   20   39:aload_0         
	//   21   40:getfield        #38  <Field Map mPeers>
	//   22   43:aload_1         
	//   23   44:invokeinterface #256 <Method Object Map.get(Object)>
	//   24   49:checkcast       #154 <Class JsonRpcPeer>
	//   25   52:astore_3        
			Util.throwIfNull(((Object) (jsonrpcpeer)));
	//   26   53:aload_3         
	//   27   54:invokestatic    #261 <Method Object Util.throwIfNull(Object)>
	//   28   57:pop             
			handleRemoteMessage(jsonrpcpeer, s);
	//   29   58:aload_0         
	//   30   59:aload_3         
	//   31   60:aload_2         
	//   32   61:invokespecial   #263 <Method void handleRemoteMessage(JsonRpcPeer, String)>
			return;
	//   33   64:return          
		}
	//*  34   65:astore_2        
	//*  35   66:ldc1            #15  <String "ChromeDevtoolsServer">
	//*  36   68:ldc2            #265 <String "Unexpected JSON exception processing message">
	//*  37   71:aload_2         
	//*  38   72:invokestatic    #267 <Method void LogRedirector.v(String, String, Throwable)>
	//*  39   75:aload_0         
	//*  40   76:aload_1         
	//*  41   77:sipush          1011
	//*  42   80:aload_2         
	//*  43   81:invokevirtual   #271 <Method Class Object.getClass()>
	//*  44   84:invokevirtual   #276 <Method String Class.getSimpleName()>
	//*  45   87:invokespecial   #278 <Method void closeSafely(SimpleSession, int, String)>
	//*  46   90:return          
	//*  47   91:astore_2        
	//*  48   92:new             #91  <Class StringBuilder>
	//*  49   95:dup             
	//*  50   96:invokespecial   #92  <Method void StringBuilder()>
	//*  51   99:astore_3        
	//*  52  100:aload_3         
	//*  53  101:ldc2            #280 <String "Message could not be processed by implementation: ">
	//*  54  104:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//*  55  107:pop             
	//*  56  108:aload_3         
	//*  57  109:aload_2         
	//*  58  110:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//*  59  113:pop             
	//*  60  114:ldc1            #15  <String "ChromeDevtoolsServer">
	//*  61  116:aload_3         
	//*  62  117:invokevirtual   #102 <Method String StringBuilder.toString()>
	//*  63  120:invokestatic    #286 <Method void LogRedirector.i(String, String)>
	//*  64  123:aload_0         
	//*  65  124:aload_1         
	//*  66  125:sipush          1011
	//*  67  128:aload_2         
	//*  68  129:invokevirtual   #271 <Method Class Object.getClass()>
	//*  69  132:invokevirtual   #276 <Method String Class.getSimpleName()>
	//*  70  135:invokespecial   #278 <Method void closeSafely(SimpleSession, int, String)>
	//*  71  138:return          
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   72  139:astore_2        
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Message could not be processed by implementation: ");
			stringbuilder1.append(((Object) (s)));
			LogRedirector.i("ChromeDevtoolsServer", stringbuilder1.toString());
			closeSafely(simplesession, 1011, ((Object) (s)).getClass().getSimpleName());
			return;
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			LogRedirector.v("ChromeDevtoolsServer", "Unexpected JSON exception processing message", ((Throwable) (s)));
			closeSafely(simplesession, 1011, ((Object) (s)).getClass().getSimpleName());
			return;
		}
		if(LogRedirector.isLoggable("ChromeDevtoolsServer", 2))
	//*  73  140:ldc1            #15  <String "ChromeDevtoolsServer">
	//*  74  142:iconst_2        
	//*  75  143:invokestatic    #248 <Method boolean LogRedirector.isLoggable(String, int)>
	//*  76  146:ifeq            180
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   77  149:new             #91  <Class StringBuilder>
	//   78  152:dup             
	//   79  153:invokespecial   #92  <Method void StringBuilder()>
	//   80  156:astore_3        
			stringbuilder2.append("Unexpected I/O exception processing message: ");
	//   81  157:aload_3         
	//   82  158:ldc2            #288 <String "Unexpected I/O exception processing message: ">
	//   83  161:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   84  164:pop             
			stringbuilder2.append(((Object) (s)));
	//   85  165:aload_3         
	//   86  166:aload_2         
	//   87  167:invokevirtual   #283 <Method StringBuilder StringBuilder.append(Object)>
	//   88  170:pop             
			LogRedirector.v("ChromeDevtoolsServer", stringbuilder2.toString());
	//   89  171:ldc1            #15  <String "ChromeDevtoolsServer">
	//   90  173:aload_3         
	//   91  174:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   92  177:invokestatic    #253 <Method void LogRedirector.v(String, String)>
		}
		closeSafely(simplesession, 1011, ((Object) (s)).getClass().getSimpleName());
	//   93  180:aload_0         
	//   94  181:aload_1         
	//   95  182:sipush          1011
	//   96  185:aload_2         
	//   97  186:invokevirtual   #271 <Method Class Object.getClass()>
	//   98  189:invokevirtual   #276 <Method String Class.getSimpleName()>
	//   99  192:invokespecial   #278 <Method void closeSafely(SimpleSession, int, String)>
	//  100  195:return          
	}

	public void onMessage(SimpleSession simplesession, byte abyte0[], int i)
	{
		simplesession = ((SimpleSession) (new StringBuilder()));
	//    0    0:new             #91  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (simplesession)).append("Ignoring binary message of length ");
	//    4    8:aload_1         
	//    5    9:ldc2            #291 <String "Ignoring binary message of length ">
	//    6   12:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (simplesession)).append(i);
	//    8   16:aload_1         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #221 <Method StringBuilder StringBuilder.append(int)>
	//   11   21:pop             
		LogRedirector.d("ChromeDevtoolsServer", ((StringBuilder) (simplesession)).toString());
	//   12   22:ldc1            #15  <String "ChromeDevtoolsServer">
	//   13   24:aload_1         
	//   14   25:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #215 <Method void LogRedirector.d(String, String)>
	//   16   31:return          
	}

	public void onOpen(SimpleSession simplesession)
	{
		LogRedirector.d("ChromeDevtoolsServer", "onOpen");
	//    0    0:ldc1            #15  <String "ChromeDevtoolsServer">
	//    1    2:ldc2            #294 <String "onOpen">
	//    2    5:invokestatic    #215 <Method void LogRedirector.d(String, String)>
		mPeers.put(((Object) (simplesession)), ((Object) (new JsonRpcPeer(mObjectMapper, simplesession))));
	//    3    8:aload_0         
	//    4    9:getfield        #38  <Field Map mPeers>
	//    5   12:aload_1         
	//    6   13:new             #154 <Class JsonRpcPeer>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:getfield        #43  <Field ObjectMapper mObjectMapper>
	//   10   21:aload_1         
	//   11   22:invokespecial   #297 <Method void JsonRpcPeer(ObjectMapper, SimpleSession)>
	//   12   25:invokeinterface #301 <Method Object Map.put(Object, Object)>
	//   13   30:pop             
	//   14   31:return          
	}

	public static final String PATH = "/inspector";
	private static final String TAG = "ChromeDevtoolsServer";
	private final MethodDispatcher mMethodDispatcher;
	private final ObjectMapper mObjectMapper = new ObjectMapper();
	private final Map mPeers = Collections.synchronizedMap(((Map) (new HashMap())));
}
