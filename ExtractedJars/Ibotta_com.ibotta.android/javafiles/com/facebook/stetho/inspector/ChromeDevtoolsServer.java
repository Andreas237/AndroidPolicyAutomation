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
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
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
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void HashMap()>
	//    6   12:invokestatic    #37  <Method Map Collections.synchronizedMap(Map)>
	//    7   15:putfield        #39  <Field Map mPeers>
	//    8   18:aload_0         
	//    9   19:new             #41  <Class ObjectMapper>
	//   10   22:dup             
	//   11   23:invokespecial   #42  <Method void ObjectMapper()>
	//   12   26:putfield        #44  <Field ObjectMapper mObjectMapper>
		mMethodDispatcher = new MethodDispatcher(mObjectMapper, iterable);
	//   13   29:aload_0         
	//   14   30:new             #46  <Class MethodDispatcher>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #44  <Field ObjectMapper mObjectMapper>
	//   18   38:aload_1         
	//   19   39:invokespecial   #49  <Method void MethodDispatcher(ObjectMapper, Iterable)>
	//   20   42:putfield        #51  <Field MethodDispatcher mMethodDispatcher>
	//   21   45:return          
	}

	private void closeSafely(SimpleSession simplesession, int i, String s)
	{
		simplesession.close(i, s);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #62  <Method void SimpleSession.close(int, String)>
	//    4    8:return          
	}

	private void handleRemoteMessage(JsonRpcPeer jsonrpcpeer, String s)
		throws IOException, MessageHandlingException, JSONException
	{
		JSONObject jsonobject = JSONObjectInstrumentation.init(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #76  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:astore_3        
		if(jsonobject.has("method"))
	//*   3    5:aload_3         
	//*   4    6:ldc1            #78  <String "method">
	//*   5    8:invokevirtual   #84  <Method boolean JSONObject.has(String)>
	//*   6   11:ifeq            21
		{
			handleRemoteRequest(jsonrpcpeer, jsonobject);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_3         
	//   10   17:invokespecial   #88  <Method void handleRemoteRequest(JsonRpcPeer, JSONObject)>
			return;
	//   11   20:return          
		}
		if(jsonobject.has("result"))
	//*  12   21:aload_3         
	//*  13   22:ldc1            #90  <String "result">
	//*  14   24:invokevirtual   #84  <Method boolean JSONObject.has(String)>
	//*  15   27:ifeq            37
		{
			handleRemoteResponse(jsonrpcpeer, jsonobject);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:invokespecial   #93  <Method void handleRemoteResponse(JsonRpcPeer, JSONObject)>
			return;
	//   20   36:return          
		} else
		{
			jsonrpcpeer = ((JsonRpcPeer) (new StringBuilder()));
	//   21   37:new             #95  <Class StringBuilder>
	//   22   40:dup             
	//   23   41:invokespecial   #96  <Method void StringBuilder()>
	//   24   44:astore_1        
			((StringBuilder) (jsonrpcpeer)).append("Improper JSON-RPC message: ");
	//   25   45:aload_1         
	//   26   46:ldc1            #98  <String "Improper JSON-RPC message: ">
	//   27   48:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   28   51:pop             
			((StringBuilder) (jsonrpcpeer)).append(s);
	//   29   52:aload_1         
	//   30   53:aload_2         
	//   31   54:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   32   57:pop             
			throw new MessageHandlingException(((StringBuilder) (jsonrpcpeer)).toString());
	//   33   58:new             #68  <Class MessageHandlingException>
	//   34   61:dup             
	//   35   62:aload_1         
	//   36   63:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   37   66:invokespecial   #109 <Method void MessageHandlingException(String)>
	//   38   69:athrow          
		}
	}

	private void handleRemoteRequest(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws MessageHandlingException
	{
		JsonRpcRequest jsonrpcrequest = (JsonRpcRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/jsonrpc/protocol/JsonRpcRequest);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #116 <Class JsonRpcRequest>
	//    4    7:invokevirtual   #120 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #116 <Class JsonRpcRequest>
	//    6   13:astore          4
		jsonobject = mMethodDispatcher.dispatch(jsonrpcpeer, jsonrpcrequest.method, jsonrpcrequest.params);
	//    7   15:aload_0         
	//    8   16:getfield        #51  <Field MethodDispatcher mMethodDispatcher>
	//    9   19:aload_1         
	//   10   20:aload           4
	//   11   22:getfield        #122 <Field String JsonRpcRequest.method>
	//   12   25:aload           4
	//   13   27:getfield        #126 <Field JSONObject JsonRpcRequest.params>
	//   14   30:invokevirtual   #130 <Method JSONObject MethodDispatcher.dispatch(JsonRpcPeer, String, JSONObject)>
	//   15   33:astore_2        
		JSONObject jsonobject1;
		jsonobject1 = null;
	//   16   34:aconst_null     
	//   17   35:astore_3        
		break MISSING_BLOCK_LABEL_63;
	//   18   36:goto            63
		jsonobject;
	//   19   39:astore_2        
		logDispatchException(((JsonRpcException) (jsonobject)));
	//   20   40:aload_2         
	//   21   41:invokestatic    #134 <Method void logDispatchException(JsonRpcException)>
		jsonobject1 = (JSONObject)mObjectMapper.convertValue(((Object) (((JsonRpcException) (jsonobject)).getErrorMessage())), org/json/JSONObject);
	//   22   44:aload_0         
	//   23   45:getfield        #44  <Field ObjectMapper mObjectMapper>
	//   24   48:aload_2         
	//   25   49:invokevirtual   #138 <Method JsonRpcError JsonRpcException.getErrorMessage()>
	//   26   52:ldc1            #80  <Class JSONObject>
	//   27   54:invokevirtual   #120 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   28   57:checkcast       #80  <Class JSONObject>
	//   29   60:astore_3        
		jsonobject = null;
	//   30   61:aconst_null     
	//   31   62:astore_2        
		JsonRpcResponse jsonrpcresponse;
		if(jsonrpcrequest.id == null)
			break MISSING_BLOCK_LABEL_222;
	//   32   63:aload           4
	//   33   65:getfield        #142 <Field Long JsonRpcRequest.id>
	//   34   68:ifnull          222
		jsonrpcresponse = new JsonRpcResponse();
	//   35   71:new             #144 <Class JsonRpcResponse>
	//   36   74:dup             
	//   37   75:invokespecial   #145 <Method void JsonRpcResponse()>
	//   38   78:astore          5
		jsonrpcresponse.id = jsonrpcrequest.id.longValue();
	//   39   80:aload           5
	//   40   82:aload           4
	//   41   84:getfield        #142 <Field Long JsonRpcRequest.id>
	//   42   87:invokevirtual   #151 <Method long Long.longValue()>
	//   43   90:putfield        #154 <Field long JsonRpcResponse.id>
		jsonrpcresponse.result = jsonobject;
	//   44   93:aload           5
	//   45   95:aload_2         
	//   46   96:putfield        #156 <Field JSONObject JsonRpcResponse.result>
		jsonrpcresponse.error = jsonobject1;
	//   47   99:aload           5
	//   48  101:aload_3         
	//   49  102:putfield        #159 <Field JSONObject JsonRpcResponse.error>
		jsonobject = (JSONObject)mObjectMapper.convertValue(((Object) (jsonrpcresponse)), org/json/JSONObject);
	//   50  105:aload_0         
	//   51  106:getfield        #44  <Field ObjectMapper mObjectMapper>
	//   52  109:aload           5
	//   53  111:ldc1            #80  <Class JSONObject>
	//   54  113:invokevirtual   #120 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   55  116:checkcast       #80  <Class JSONObject>
	//   56  119:astore_2        
label0:
		{
			if(!(jsonobject instanceof JSONObject))
	//*  57  120:aload_2         
	//*  58  121:instanceof      #80  <Class JSONObject>
	//*  59  124:ifne            135
			{
				jsonobject = ((JSONObject) (jsonobject.toString()));
	//   60  127:aload_2         
	//   61  128:invokevirtual   #160 <Method String JSONObject.toString()>
	//   62  131:astore_2        
				break label0;
	//   63  132:goto            212
			}
			try
			{
				jsonobject = ((JSONObject) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   64  135:aload_2         
	//   65  136:checkcast       #80  <Class JSONObject>
	//   66  139:invokestatic    #163 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   67  142:astore_2        
			}
	//*  68  143:goto            212
			// Misplaced declaration of an exception variable
			catch(JSONObject jsonobject)
	//*  69  146:astore_2        
			{
				jsonrpcresponse.result = null;
	//   70  147:aload           5
	//   71  149:aconst_null     
	//   72  150:putfield        #156 <Field JSONObject JsonRpcResponse.result>
				jsonrpcresponse.error = (JSONObject)mObjectMapper.convertValue(((Object) (((OutOfMemoryError) (jsonobject)).getMessage())), org/json/JSONObject);
	//   73  153:aload           5
	//   74  155:aload_0         
	//   75  156:getfield        #44  <Field ObjectMapper mObjectMapper>
	//   76  159:aload_2         
	//   77  160:invokevirtual   #166 <Method String OutOfMemoryError.getMessage()>
	//   78  163:ldc1            #80  <Class JSONObject>
	//   79  165:invokevirtual   #120 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   80  168:checkcast       #80  <Class JSONObject>
	//   81  171:putfield        #159 <Field JSONObject JsonRpcResponse.error>
				jsonobject = (JSONObject)mObjectMapper.convertValue(((Object) (jsonrpcresponse)), org/json/JSONObject);
	//   82  174:aload_0         
	//   83  175:getfield        #44  <Field ObjectMapper mObjectMapper>
	//   84  178:aload           5
	//   85  180:ldc1            #80  <Class JSONObject>
	//   86  182:invokevirtual   #120 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   87  185:checkcast       #80  <Class JSONObject>
	//   88  188:astore_2        
				if(!(jsonobject instanceof JSONObject))
	//*  89  189:aload_2         
	//*  90  190:instanceof      #80  <Class JSONObject>
	//*  91  193:ifne            204
					jsonobject = ((JSONObject) (jsonobject.toString()));
	//   92  196:aload_2         
	//   93  197:invokevirtual   #160 <Method String JSONObject.toString()>
	//   94  200:astore_2        
				else
	//*  95  201:goto            212
					jsonobject = ((JSONObject) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   96  204:aload_2         
	//   97  205:checkcast       #80  <Class JSONObject>
	//   98  208:invokestatic    #163 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   99  211:astore_2        
			}
		}
		jsonrpcpeer.getWebSocket().sendText(((String) (jsonobject)));
	//  100  212:aload_1         
	//  101  213:invokevirtual   #172 <Method SimpleSession JsonRpcPeer.getWebSocket()>
	//  102  216:aload_2         
	//  103  217:invokeinterface #175 <Method void SimpleSession.sendText(String)>
	//  104  222:return          
	}

	private void handleRemoteResponse(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws MismatchedResponseException
	{
		jsonobject = ((JSONObject) ((JsonRpcResponse)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/jsonrpc/protocol/JsonRpcResponse)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #144 <Class JsonRpcResponse>
	//    4    7:invokevirtual   #120 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #144 <Class JsonRpcResponse>
	//    6   13:astore_2        
		PendingRequest pendingrequest = jsonrpcpeer.getAndRemovePendingRequest(((JsonRpcResponse) (jsonobject)).id);
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:getfield        #154 <Field long JsonRpcResponse.id>
	//   10   19:invokevirtual   #181 <Method PendingRequest JsonRpcPeer.getAndRemovePendingRequest(long)>
	//   11   22:astore_3        
		if(pendingrequest != null)
	//*  12   23:aload_3         
	//*  13   24:ifnull          46
		{
			if(pendingrequest.callback != null)
	//*  14   27:aload_3         
	//*  15   28:getfield        #187 <Field PendingRequestCallback PendingRequest.callback>
	//*  16   31:ifnull          45
				pendingrequest.callback.onResponse(jsonrpcpeer, ((JsonRpcResponse) (jsonobject)));
	//   17   34:aload_3         
	//   18   35:getfield        #187 <Field PendingRequestCallback PendingRequest.callback>
	//   19   38:aload_1         
	//   20   39:aload_2         
	//   21   40:invokeinterface #193 <Method void PendingRequestCallback.onResponse(JsonRpcPeer, JsonRpcResponse)>
			return;
	//   22   45:return          
		} else
		{
			throw new MismatchedResponseException(((JsonRpcResponse) (jsonobject)).id);
	//   23   46:new             #177 <Class MismatchedResponseException>
	//   24   49:dup             
	//   25   50:aload_2         
	//   26   51:getfield        #154 <Field long JsonRpcResponse.id>
	//   27   54:invokespecial   #196 <Method void MismatchedResponseException(long)>
	//   28   57:athrow          
		}
	}

	private static void logDispatchException(JsonRpcException jsonrpcexception)
	{
		JsonRpcError jsonrpcerror = jsonrpcexception.getErrorMessage();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method JsonRpcError JsonRpcException.getErrorMessage()>
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
	//*   3    5:getstatic       #200 <Field int[] ChromeDevtoolsServer$1.$SwitchMap$com$facebook$stetho$inspector$jsonrpc$protocol$JsonRpcError$ErrorCode>
	//*   4    8:aload_1         
	//*   5    9:getfield        #206 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode JsonRpcError.code>
	//*   6   12:invokevirtual   #212 <Method int com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.ordinal()>
	//*   7   15:iaload          
	//*   8   16:iconst_1        
	//*   9   17:icmpeq          29
		{
			LogRedirector.w("ChromeDevtoolsServer", "Error processing remote message", ((Throwable) (jsonrpcexception)));
	//   10   20:ldc1            #16  <String "ChromeDevtoolsServer">
	//   11   22:ldc1            #214 <String "Error processing remote message">
	//   12   24:aload_0         
	//   13   25:invokestatic    #220 <Method void LogRedirector.w(String, String, Throwable)>
			return;
	//   14   28:return          
		} else
		{
			jsonrpcexception = ((JsonRpcException) (new StringBuilder()));
	//   15   29:new             #95  <Class StringBuilder>
	//   16   32:dup             
	//   17   33:invokespecial   #96  <Method void StringBuilder()>
	//   18   36:astore_0        
			((StringBuilder) (jsonrpcexception)).append("Method not implemented: ");
	//   19   37:aload_0         
	//   20   38:ldc1            #222 <String "Method not implemented: ">
	//   21   40:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			((StringBuilder) (jsonrpcexception)).append(jsonrpcerror.message);
	//   23   44:aload_0         
	//   24   45:aload_1         
	//   25   46:getfield        #225 <Field String JsonRpcError.message>
	//   26   49:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			LogRedirector.d("ChromeDevtoolsServer", ((StringBuilder) (jsonrpcexception)).toString());
	//   28   53:ldc1            #16  <String "ChromeDevtoolsServer">
	//   29   55:aload_0         
	//   30   56:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   31   59:invokestatic    #229 <Method void LogRedirector.d(String, String)>
			return;
	//   32   62:return          
		}
	}

	public void onClose(SimpleSession simplesession, int i, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #95  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("onClose: reason=");
	//    4    9:aload           4
	//    5   11:ldc1            #232 <String "onClose: reason=">
	//    6   13:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           4
	//    9   19:iload_2         
	//   10   20:invokevirtual   #235 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(" ");
	//   12   24:aload           4
	//   13   26:ldc1            #237 <String " ">
	//   14   28:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(s);
	//   16   32:aload           4
	//   17   34:aload_3         
	//   18   35:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		LogRedirector.d("ChromeDevtoolsServer", stringbuilder.toString());
	//   20   39:ldc1            #16  <String "ChromeDevtoolsServer">
	//   21   41:aload           4
	//   22   43:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   23   46:invokestatic    #229 <Method void LogRedirector.d(String, String)>
		simplesession = ((SimpleSession) ((JsonRpcPeer)mPeers.remove(((Object) (simplesession)))));
	//   24   49:aload_0         
	//   25   50:getfield        #39  <Field Map mPeers>
	//   26   53:aload_1         
	//   27   54:invokeinterface #243 <Method Object Map.remove(Object)>
	//   28   59:checkcast       #168 <Class JsonRpcPeer>
	//   29   62:astore_1        
		if(simplesession != null)
	//*  30   63:aload_1         
	//*  31   64:ifnull          71
			((JsonRpcPeer) (simplesession)).invokeDisconnectReceivers();
	//   32   67:aload_1         
	//   33   68:invokevirtual   #246 <Method void JsonRpcPeer.invokeDisconnectReceivers()>
	//   34   71:return          
	}

	public void onError(SimpleSession simplesession, Throwable throwable)
	{
		simplesession = ((SimpleSession) (new StringBuilder()));
	//    0    0:new             #95  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (simplesession)).append("onError: ex=");
	//    4    8:aload_1         
	//    5    9:ldc1            #250 <String "onError: ex=">
	//    6   11:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (simplesession)).append(throwable.toString());
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #253 <Method String Throwable.toString()>
	//   11   20:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		LogRedirector.e("ChromeDevtoolsServer", ((StringBuilder) (simplesession)).toString());
	//   13   24:ldc1            #16  <String "ChromeDevtoolsServer">
	//   14   26:aload_1         
	//   15   27:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #256 <Method void LogRedirector.e(String, String)>
	//   17   33:return          
	}

	public void onMessage(SimpleSession simplesession, String s)
	{
		if(LogRedirector.isLoggable("ChromeDevtoolsServer", 2))
	//*   0    0:ldc1            #16  <String "ChromeDevtoolsServer">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #262 <Method boolean LogRedirector.isLoggable(String, int)>
	//*   3    6:ifeq            40
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #95  <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #96  <Method void StringBuilder()>
	//    7   16:astore_3        
			stringbuilder.append("onMessage: message=");
	//    8   17:aload_3         
	//    9   18:ldc2            #264 <String "onMessage: message=">
	//   10   21:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(s);
	//   12   25:aload_3         
	//   13   26:aload_2         
	//   14   27:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			LogRedirector.v("ChromeDevtoolsServer", stringbuilder.toString());
	//   16   31:ldc1            #16  <String "ChromeDevtoolsServer">
	//   17   33:aload_3         
	//   18   34:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   19   37:invokestatic    #267 <Method void LogRedirector.v(String, String)>
		}
		try
		{
			JsonRpcPeer jsonrpcpeer = (JsonRpcPeer)mPeers.get(((Object) (simplesession)));
	//   20   40:aload_0         
	//   21   41:getfield        #39  <Field Map mPeers>
	//   22   44:aload_1         
	//   23   45:invokeinterface #270 <Method Object Map.get(Object)>
	//   24   50:checkcast       #168 <Class JsonRpcPeer>
	//   25   53:astore_3        
			Util.throwIfNull(((Object) (jsonrpcpeer)));
	//   26   54:aload_3         
	//   27   55:invokestatic    #275 <Method Object Util.throwIfNull(Object)>
	//   28   58:pop             
			handleRemoteMessage(jsonrpcpeer, s);
	//   29   59:aload_0         
	//   30   60:aload_3         
	//   31   61:aload_2         
	//   32   62:invokespecial   #277 <Method void handleRemoteMessage(JsonRpcPeer, String)>
			return;
	//   33   65:return          
		}
	//*  34   66:astore_2        
	//*  35   67:ldc1            #16  <String "ChromeDevtoolsServer">
	//*  36   69:ldc2            #279 <String "Unexpected JSON exception processing message">
	//*  37   72:aload_2         
	//*  38   73:invokestatic    #281 <Method void LogRedirector.v(String, String, Throwable)>
	//*  39   76:aload_0         
	//*  40   77:aload_1         
	//*  41   78:sipush          1011
	//*  42   81:aload_2         
	//*  43   82:invokevirtual   #285 <Method Class Object.getClass()>
	//*  44   85:invokevirtual   #290 <Method String Class.getSimpleName()>
	//*  45   88:invokespecial   #292 <Method void closeSafely(SimpleSession, int, String)>
	//*  46   91:return          
	//*  47   92:astore_2        
	//*  48   93:new             #95  <Class StringBuilder>
	//*  49   96:dup             
	//*  50   97:invokespecial   #96  <Method void StringBuilder()>
	//*  51  100:astore_3        
	//*  52  101:aload_3         
	//*  53  102:ldc2            #294 <String "Message could not be processed by implementation: ">
	//*  54  105:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//*  55  108:pop             
	//*  56  109:aload_3         
	//*  57  110:aload_2         
	//*  58  111:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//*  59  114:pop             
	//*  60  115:ldc1            #16  <String "ChromeDevtoolsServer">
	//*  61  117:aload_3         
	//*  62  118:invokevirtual   #106 <Method String StringBuilder.toString()>
	//*  63  121:invokestatic    #300 <Method void LogRedirector.i(String, String)>
	//*  64  124:aload_0         
	//*  65  125:aload_1         
	//*  66  126:sipush          1011
	//*  67  129:aload_2         
	//*  68  130:invokevirtual   #285 <Method Class Object.getClass()>
	//*  69  133:invokevirtual   #290 <Method String Class.getSimpleName()>
	//*  70  136:invokespecial   #292 <Method void closeSafely(SimpleSession, int, String)>
	//*  71  139:return          
		// Misplaced declaration of an exception variable
		catch(String s) { }
	//   72  140:astore_2        
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
	//*  73  141:ldc1            #16  <String "ChromeDevtoolsServer">
	//*  74  143:iconst_2        
	//*  75  144:invokestatic    #262 <Method boolean LogRedirector.isLoggable(String, int)>
	//*  76  147:ifeq            181
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   77  150:new             #95  <Class StringBuilder>
	//   78  153:dup             
	//   79  154:invokespecial   #96  <Method void StringBuilder()>
	//   80  157:astore_3        
			stringbuilder2.append("Unexpected I/O exception processing message: ");
	//   81  158:aload_3         
	//   82  159:ldc2            #302 <String "Unexpected I/O exception processing message: ">
	//   83  162:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   84  165:pop             
			stringbuilder2.append(((Object) (s)));
	//   85  166:aload_3         
	//   86  167:aload_2         
	//   87  168:invokevirtual   #297 <Method StringBuilder StringBuilder.append(Object)>
	//   88  171:pop             
			LogRedirector.v("ChromeDevtoolsServer", stringbuilder2.toString());
	//   89  172:ldc1            #16  <String "ChromeDevtoolsServer">
	//   90  174:aload_3         
	//   91  175:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   92  178:invokestatic    #267 <Method void LogRedirector.v(String, String)>
		}
		closeSafely(simplesession, 1011, ((Object) (s)).getClass().getSimpleName());
	//   93  181:aload_0         
	//   94  182:aload_1         
	//   95  183:sipush          1011
	//   96  186:aload_2         
	//   97  187:invokevirtual   #285 <Method Class Object.getClass()>
	//   98  190:invokevirtual   #290 <Method String Class.getSimpleName()>
	//   99  193:invokespecial   #292 <Method void closeSafely(SimpleSession, int, String)>
	//  100  196:return          
	}

	public void onMessage(SimpleSession simplesession, byte abyte0[], int i)
	{
		simplesession = ((SimpleSession) (new StringBuilder()));
	//    0    0:new             #95  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (simplesession)).append("Ignoring binary message of length ");
	//    4    8:aload_1         
	//    5    9:ldc2            #305 <String "Ignoring binary message of length ">
	//    6   12:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (simplesession)).append(i);
	//    8   16:aload_1         
	//    9   17:iload_3         
	//   10   18:invokevirtual   #235 <Method StringBuilder StringBuilder.append(int)>
	//   11   21:pop             
		LogRedirector.d("ChromeDevtoolsServer", ((StringBuilder) (simplesession)).toString());
	//   12   22:ldc1            #16  <String "ChromeDevtoolsServer">
	//   13   24:aload_1         
	//   14   25:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #229 <Method void LogRedirector.d(String, String)>
	//   16   31:return          
	}

	public void onOpen(SimpleSession simplesession)
	{
		LogRedirector.d("ChromeDevtoolsServer", "onOpen");
	//    0    0:ldc1            #16  <String "ChromeDevtoolsServer">
	//    1    2:ldc2            #308 <String "onOpen">
	//    2    5:invokestatic    #229 <Method void LogRedirector.d(String, String)>
		mPeers.put(((Object) (simplesession)), ((Object) (new JsonRpcPeer(mObjectMapper, simplesession))));
	//    3    8:aload_0         
	//    4    9:getfield        #39  <Field Map mPeers>
	//    5   12:aload_1         
	//    6   13:new             #168 <Class JsonRpcPeer>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:getfield        #44  <Field ObjectMapper mObjectMapper>
	//   10   21:aload_1         
	//   11   22:invokespecial   #311 <Method void JsonRpcPeer(ObjectMapper, SimpleSession)>
	//   12   25:invokeinterface #315 <Method Object Map.put(Object, Object)>
	//   13   30:pop             
	//   14   31:return          
	}

	public static final String PATH = "/inspector";
	private static final String TAG = "ChromeDevtoolsServer";
	private final MethodDispatcher mMethodDispatcher;
	private final ObjectMapper mObjectMapper = new ObjectMapper();
	private final Map mPeers = Collections.synchronizedMap(((Map) (new HashMap())));
}
