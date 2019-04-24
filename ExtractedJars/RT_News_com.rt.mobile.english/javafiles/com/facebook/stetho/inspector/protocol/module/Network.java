// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import android.content.Context;
import com.facebook.stetho.inspector.jsonrpc.*;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
import com.facebook.stetho.inspector.network.*;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Network
	implements ChromeDevtoolsDomain
{
	public static class DataReceivedParams
	{

		public int dataLength;
		public int encodedDataLength;
		public String requestId;
		public double timestamp;

		public DataReceivedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetResponseBodyResponse
		implements JsonRpcResult
	{

		public boolean base64Encoded;
		public String body;

		private GetResponseBodyResponse()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}

	}

	public static class Initiator
	{

		public List stackTrace;
		public InitiatorType type;

		public Initiator()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class InitiatorType extends Enum
	{

		public static InitiatorType valueOf(String s)
		{
			return (InitiatorType)Enum.valueOf(com/facebook/stetho/inspector/protocol/module/Network$InitiatorType, s);
		//    0    0:ldc1            #2   <Class Network$InitiatorType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Network$InitiatorType>
		//    4    9:areturn         
		}

		public static InitiatorType[] values()
		{
			return (InitiatorType[])((InitiatorType []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field Network$InitiatorType[] $VALUES>
		//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.facebook.stetho.inspector.protocol.module.Network$InitiatorType_3B_.clone()>
		//    2    6:checkcast       #55  <Class Network$InitiatorType[]>
		//    3    9:areturn         
		}

		public String getProtocolValue()
		{
			return mProtocolValue;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field String mProtocolValue>
		//    2    4:areturn         
		}

		private static final InitiatorType $VALUES[];
		public static final InitiatorType OTHER;
		public static final InitiatorType PARSER;
		public static final InitiatorType SCRIPT;
		private final String mProtocolValue;

		static 
		{
			PARSER = new InitiatorType("PARSER", 0, "parser");
		//    0    0:new             #2   <Class Network$InitiatorType>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "PARSER">
		//    3    6:iconst_0        
		//    4    7:ldc1            #21  <String "parser">
		//    5    9:invokespecial   #25  <Method void Network$InitiatorType(String, int, String)>
		//    6   12:putstatic       #27  <Field Network$InitiatorType PARSER>
			SCRIPT = new InitiatorType("SCRIPT", 1, "script");
		//    7   15:new             #2   <Class Network$InitiatorType>
		//    8   18:dup             
		//    9   19:ldc1            #28  <String "SCRIPT">
		//   10   21:iconst_1        
		//   11   22:ldc1            #30  <String "script">
		//   12   24:invokespecial   #25  <Method void Network$InitiatorType(String, int, String)>
		//   13   27:putstatic       #32  <Field Network$InitiatorType SCRIPT>
			OTHER = new InitiatorType("OTHER", 2, "other");
		//   14   30:new             #2   <Class Network$InitiatorType>
		//   15   33:dup             
		//   16   34:ldc1            #33  <String "OTHER">
		//   17   36:iconst_2        
		//   18   37:ldc1            #35  <String "other">
		//   19   39:invokespecial   #25  <Method void Network$InitiatorType(String, int, String)>
		//   20   42:putstatic       #37  <Field Network$InitiatorType OTHER>
			$VALUES = (new InitiatorType[] {
				PARSER, SCRIPT, OTHER
			});
		//   21   45:iconst_3        
		//   22   46:anewarray       InitiatorType[]
		//   23   49:dup             
		//   24   50:iconst_0        
		//   25   51:getstatic       #27  <Field Network$InitiatorType PARSER>
		//   26   54:aastore         
		//   27   55:dup             
		//   28   56:iconst_1        
		//   29   57:getstatic       #32  <Field Network$InitiatorType SCRIPT>
		//   30   60:aastore         
		//   31   61:dup             
		//   32   62:iconst_2        
		//   33   63:getstatic       #37  <Field Network$InitiatorType OTHER>
		//   34   66:aastore         
		//   35   67:putstatic       #39  <Field Network$InitiatorType[] $VALUES>
		//*  36   70:return          
		}

		private InitiatorType(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #43  <Method void Enum(String, int)>
			mProtocolValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #45  <Field String mProtocolValue>
		//    7   11:return          
		}
	}

	public static class LoadingFailedParams
	{

		public String errorText;
		public String requestId;
		public double timestamp;
		public Page.ResourceType type;

		public LoadingFailedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class LoadingFinishedParams
	{

		public String requestId;
		public double timestamp;

		public LoadingFinishedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class Request
	{

		public JSONObject headers;
		public String method;
		public String postData;
		public String url;

		public Request()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class RequestWillBeSentParams
	{

		public String documentURL;
		public String frameId;
		public Initiator initiator;
		public String loaderId;
		public Response redirectResponse;
		public Request request;
		public String requestId;
		public double timestamp;
		public Page.ResourceType type;

		public RequestWillBeSentParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #29  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class ResourceTiming
	{

		public double connectionEnd;
		public double connectionStart;
		public double dnsEnd;
		public double dnsStart;
		public double proxyEnd;
		public double proxyStart;
		public double receivedHeadersEnd;
		public double requestTime;
		public double sendEnd;
		public double sendStart;
		public double sslEnd;
		public double sslStart;

		public ResourceTiming()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class Response
	{

		public int connectionId;
		public boolean connectionReused;
		public Boolean fromDiskCache;
		public JSONObject headers;
		public String headersText;
		public String mimeType;
		public JSONObject requestHeaders;
		public String requestHeadersTest;
		public int status;
		public String statusText;
		public ResourceTiming timing;
		public String url;

		public Response()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class ResponseReceivedParams
	{

		public String frameId;
		public String loaderId;
		public String requestId;
		public Response response;
		public double timestamp;
		public Page.ResourceType type;

		public ResponseReceivedParams()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}
	}


	public Network(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		mNetworkPeerManager = NetworkPeerManager.getOrCreateInstance(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #56  <Method NetworkPeerManager NetworkPeerManager.getOrCreateInstance(Context)>
	//    5    9:putfield        #58  <Field NetworkPeerManager mNetworkPeerManager>
		mResponseBodyFileManager = mNetworkPeerManager.getResponseBodyFileManager();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field NetworkPeerManager mNetworkPeerManager>
	//    9   17:invokevirtual   #62  <Method ResponseBodyFileManager NetworkPeerManager.getResponseBodyFileManager()>
	//   10   20:putfield        #64  <Field ResponseBodyFileManager mResponseBodyFileManager>
	//   11   23:return          
	}

	private GetResponseBodyResponse readResponseBody(String s)
		throws IOException
	{
		GetResponseBodyResponse getresponsebodyresponse = new GetResponseBodyResponse();
	//    0    0:new             #13  <Class Network$GetResponseBodyResponse>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #72  <Method void Network$GetResponseBodyResponse(Network$1)>
	//    4    8:astore_2        
		s = ((String) (mResponseBodyFileManager.readFile(s)));
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field ResponseBodyFileManager mResponseBodyFileManager>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #78  <Method ResponseBodyData ResponseBodyFileManager.readFile(String)>
	//    9   17:astore_1        
		getresponsebodyresponse.body = ((ResponseBodyData) (s)).data;
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:getfield        #84  <Field String ResponseBodyData.data>
	//   13   23:putfield        #87  <Field String Network$GetResponseBodyResponse.body>
		getresponsebodyresponse.base64Encoded = ((ResponseBodyData) (s)).base64Encoded;
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:getfield        #91  <Field boolean ResponseBodyData.base64Encoded>
	//   17   31:putfield        #92  <Field boolean Network$GetResponseBodyResponse.base64Encoded>
		return getresponsebodyresponse;
	//   18   34:aload_2         
	//   19   35:areturn         
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mNetworkPeerManager.removePeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NetworkPeerManager mNetworkPeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #100 <Method void NetworkPeerManager.removePeer(JsonRpcPeer)>
	//    4    8:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
		mNetworkPeerManager.addPeer(jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NetworkPeerManager mNetworkPeerManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method boolean NetworkPeerManager.addPeer(JsonRpcPeer)>
	//    4    8:pop             
	//    5    9:return          
	}

	public JsonRpcResult getResponseBody(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
		throws JsonRpcException
	{
		try
		{
			jsonrpcpeer = ((JsonRpcPeer) (readResponseBody(jsonobject.getString("requestId"))));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc1            #114 <String "requestId">
	//    3    4:invokevirtual   #120 <Method String JSONObject.getString(String)>
	//    4    7:invokespecial   #122 <Method Network$GetResponseBodyResponse readResponseBody(String)>
	//    5   10:astore_1        
		}
	//*   6   11:aload_1         
	//*   7   12:areturn         
	//*   8   13:astore_1        
	//*   9   14:new             #110 <Class JsonRpcException>
	//*  10   17:dup             
	//*  11   18:new             #124 <Class JsonRpcError>
	//*  12   21:dup             
	//*  13   22:getstatic       #130 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.INTERNAL_ERROR>
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #134 <Method String JSONException.toString()>
	//*  16   29:aconst_null     
	//*  17   30:invokespecial   #137 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//*  18   33:invokespecial   #140 <Method void JsonRpcException(JsonRpcError)>
	//*  19   36:athrow          
		// Misplaced declaration of an exception variable
		catch(JsonRpcPeer jsonrpcpeer)
	//*  20   37:astore_1        
		{
			throw new JsonRpcException(new JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.INTERNAL_ERROR, ((IOException) (jsonrpcpeer)).toString(), ((JSONObject) (null))));
	//   21   38:new             #110 <Class JsonRpcException>
	//   22   41:dup             
	//   23   42:new             #124 <Class JsonRpcError>
	//   24   45:dup             
	//   25   46:getstatic       #130 <Field com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode.INTERNAL_ERROR>
	//   26   49:aload_1         
	//   27   50:invokevirtual   #141 <Method String IOException.toString()>
	//   28   53:aconst_null     
	//   29   54:invokespecial   #137 <Method void JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode, String, JSONObject)>
	//   30   57:invokespecial   #140 <Method void JsonRpcException(JsonRpcError)>
	//   31   60:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JsonRpcPeer jsonrpcpeer)
		{
			throw new JsonRpcException(new JsonRpcError(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError.ErrorCode.INTERNAL_ERROR, ((JSONException) (jsonrpcpeer)).toString(), ((JSONObject) (null))));
		}
		return ((JsonRpcResult) (jsonrpcpeer));
	}

	public void setUserAgentOverride(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	private final NetworkPeerManager mNetworkPeerManager;
	private final ResponseBodyFileManager mResponseBodyFileManager;
}
