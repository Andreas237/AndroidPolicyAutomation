// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc;

import android.database.Observable;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.SimpleSession;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.nio.channels.NotYetConnectedException;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector.jsonrpc:
//			PendingRequest, PendingRequestCallback, DisconnectReceiver

public class JsonRpcPeer
{
	private static class DisconnectObservable extends Observable
	{

		public void onDisconnect()
		{
			int j = mObservers.size();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ArrayList mObservers>
		//    2    4:invokevirtual   #26  <Method int ArrayList.size()>
		//    3    7:istore_2        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iload_2         
		//*   8   12:icmpge          38
				((DisconnectReceiver)mObservers.get(i)).onDisconnect();
		//    9   15:aload_0         
		//   10   16:getfield        #20  <Field ArrayList mObservers>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #30  <Method Object ArrayList.get(int)>
		//   13   23:checkcast       #32  <Class DisconnectReceiver>
		//   14   26:invokeinterface #34  <Method void DisconnectReceiver.onDisconnect()>

		//   15   31:iload_1         
		//   16   32:iconst_1        
		//   17   33:iadd            
		//   18   34:istore_1        
		//*  19   35:goto            10
		//   20   38:return          
		}

		private DisconnectObservable()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Observable()>
		//    2    4:return          
		}

	}


	public JsonRpcPeer(ObjectMapper objectmapper, SimpleSession simplesession)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void HashMap()>
	//    6   12:putfield        #35  <Field Map mPendingRequests>
	//    7   15:aload_0         
	//    8   16:new             #8   <Class JsonRpcPeer$DisconnectObservable>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #38  <Method void JsonRpcPeer$DisconnectObservable(JsonRpcPeer$1)>
	//   12   24:putfield        #40  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
		mObjectMapper = objectmapper;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #42  <Field ObjectMapper mObjectMapper>
		mPeer = (SimpleSession)Util.throwIfNull(((Object) (simplesession)));
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokestatic    #48  <Method Object Util.throwIfNull(Object)>
	//   19   37:checkcast       #50  <Class SimpleSession>
	//   20   40:putfield        #52  <Field SimpleSession mPeer>
	//   21   43:return          
	}

	private long preparePendingRequest(PendingRequestCallback pendingrequestcallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l;
		l = mNextRequestId;
	//    2    2:aload_0         
	//    3    3:getfield        #57  <Field long mNextRequestId>
	//    4    6:lstore_2        
		mNextRequestId = 1L + l;
	//    5    7:aload_0         
	//    6    8:lconst_1        
	//    7    9:lload_2         
	//    8   10:ladd            
	//    9   11:putfield        #57  <Field long mNextRequestId>
		mPendingRequests.put(((Object) (Long.valueOf(l))), ((Object) (new PendingRequest(l, pendingrequestcallback))));
	//   10   14:aload_0         
	//   11   15:getfield        #35  <Field Map mPendingRequests>
	//   12   18:lload_2         
	//   13   19:invokestatic    #63  <Method Long Long.valueOf(long)>
	//   14   22:new             #65  <Class PendingRequest>
	//   15   25:dup             
	//   16   26:lload_2         
	//   17   27:aload_1         
	//   18   28:invokespecial   #68  <Method void PendingRequest(long, PendingRequestCallback)>
	//   19   31:invokeinterface #74  <Method Object Map.put(Object, Object)>
	//   20   36:pop             
		this;
	//   21   37:aload_0         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		return l;
	//   23   39:lload_2         
	//   24   40:lreturn         
		pendingrequestcallback;
	//   25   41:astore_1        
	//*  26   42:aload_0         
		throw pendingrequestcallback;
	//   27   43:monitorexit     
	//   28   44:aload_1         
	//   29   45:athrow          
	}

	public PendingRequest getAndRemovePendingRequest(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		PendingRequest pendingrequest = (PendingRequest)mPendingRequests.remove(((Object) (Long.valueOf(l))));
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field Map mPendingRequests>
	//    4    6:lload_1         
	//    5    7:invokestatic    #63  <Method Long Long.valueOf(long)>
	//    6   10:invokeinterface #79  <Method Object Map.remove(Object)>
	//    7   15:checkcast       #65  <Class PendingRequest>
	//    8   18:astore_3        
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return pendingrequest;
	//   11   21:aload_3         
	//   12   22:areturn         
		Exception exception;
		exception;
	//   13   23:astore_3        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_3         
	//   17   27:athrow          
	}

	public SimpleSession getWebSocket()
	{
		return mPeer;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SimpleSession mPeer>
	//    2    4:areturn         
	}

	public void invokeDisconnectReceivers()
	{
		mDisconnectObservable.onDisconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
	//    2    4:invokevirtual   #85  <Method void JsonRpcPeer$DisconnectObservable.onDisconnect()>
	//    3    7:return          
	}

	public void invokeMethod(String s, Object obj, PendingRequestCallback pendingrequestcallback)
		throws NotYetConnectedException
	{
		Util.throwIfNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		if(pendingrequestcallback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          21
			pendingrequestcallback = ((PendingRequestCallback) (Long.valueOf(preparePendingRequest(pendingrequestcallback))));
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokespecial   #92  <Method long preparePendingRequest(PendingRequestCallback)>
	//    8   14:invokestatic    #63  <Method Long Long.valueOf(long)>
	//    9   17:astore_3        
		else
	//*  10   18:goto            23
			pendingrequestcallback = null;
	//   11   21:aconst_null     
	//   12   22:astore_3        
		s = ((String) (new JsonRpcRequest(((Long) (pendingrequestcallback)), s, (JSONObject)mObjectMapper.convertValue(obj, org/json/JSONObject))));
	//   13   23:new             #94  <Class JsonRpcRequest>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #42  <Field ObjectMapper mObjectMapper>
	//   19   33:aload_2         
	//   20   34:ldc1            #96  <Class JSONObject>
	//   21   36:invokevirtual   #102 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   22   39:checkcast       #96  <Class JSONObject>
	//   23   42:invokespecial   #105 <Method void JsonRpcRequest(Long, String, JSONObject)>
	//   24   45:astore_1        
		s = ((String) ((JSONObject)mObjectMapper.convertValue(((Object) (s)), org/json/JSONObject)));
	//   25   46:aload_0         
	//   26   47:getfield        #42  <Field ObjectMapper mObjectMapper>
	//   27   50:aload_1         
	//   28   51:ldc1            #96  <Class JSONObject>
	//   29   53:invokevirtual   #102 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   30   56:checkcast       #96  <Class JSONObject>
	//   31   59:astore_1        
		if(!(s instanceof JSONObject))
	//*  32   60:aload_1         
	//*  33   61:instanceof      #96  <Class JSONObject>
	//*  34   64:ifne            75
			s = ((JSONObject) (s)).toString();
	//   35   67:aload_1         
	//   36   68:invokevirtual   #109 <Method String JSONObject.toString()>
	//   37   71:astore_1        
		else
	//*  38   72:goto            83
			s = JSONObjectInstrumentation.toString((JSONObject)s);
	//   39   75:aload_1         
	//   40   76:checkcast       #96  <Class JSONObject>
	//   41   79:invokestatic    #114 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   42   82:astore_1        
		mPeer.sendText(s);
	//   43   83:aload_0         
	//   44   84:getfield        #52  <Field SimpleSession mPeer>
	//   45   87:aload_1         
	//   46   88:invokeinterface #118 <Method void SimpleSession.sendText(String)>
	//   47   93:return          
	}

	public void registerDisconnectReceiver(DisconnectReceiver disconnectreceiver)
	{
		mDisconnectObservable.registerObserver(((Object) (disconnectreceiver)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #126 <Method void JsonRpcPeer$DisconnectObservable.registerObserver(Object)>
	//    4    8:return          
	}

	public void unregisterDisconnectReceiver(DisconnectReceiver disconnectreceiver)
	{
		mDisconnectObservable.unregisterObserver(((Object) (disconnectreceiver)));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method void JsonRpcPeer$DisconnectObservable.unregisterObserver(Object)>
	//    4    8:return          
	}

	private final DisconnectObservable mDisconnectObservable = new DisconnectObservable();
	private long mNextRequestId;
	private final ObjectMapper mObjectMapper;
	private final SimpleSession mPeer;
	private final Map mPendingRequests = new HashMap();
}
