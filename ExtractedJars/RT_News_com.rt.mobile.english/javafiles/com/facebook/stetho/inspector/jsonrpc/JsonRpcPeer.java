// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc;

import android.database.Observable;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcRequest;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.websocket.SimpleSession;
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
			for(Iterator iterator = mObservers.iterator(); iterator.hasNext(); ((DisconnectReceiver)iterator.next()).onDisconnect());
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field ArrayList mObservers>
		//    2    4:invokevirtual   #26  <Method Iterator ArrayList.iterator()>
		//    3    7:astore_1        
		//    4    8:aload_1         
		//    5    9:invokeinterface #32  <Method boolean Iterator.hasNext()>
		//    6   14:ifeq            34
		//    7   17:aload_1         
		//    8   18:invokeinterface #36  <Method Object Iterator.next()>
		//    9   23:checkcast       #38  <Class DisconnectReceiver>
		//   10   26:invokeinterface #40  <Method void DisconnectReceiver.onDisconnect()>
		//*  11   31:goto            8
		//   12   34:return          
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
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void HashMap()>
	//    6   12:putfield        #34  <Field Map mPendingRequests>
	//    7   15:aload_0         
	//    8   16:new             #8   <Class JsonRpcPeer$DisconnectObservable>
	//    9   19:dup             
	//   10   20:aconst_null     
	//   11   21:invokespecial   #37  <Method void JsonRpcPeer$DisconnectObservable(JsonRpcPeer$1)>
	//   12   24:putfield        #39  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
		mObjectMapper = objectmapper;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #41  <Field ObjectMapper mObjectMapper>
		mPeer = (SimpleSession)Util.throwIfNull(((Object) (simplesession)));
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokestatic    #47  <Method Object Util.throwIfNull(Object)>
	//   19   37:checkcast       #49  <Class SimpleSession>
	//   20   40:putfield        #51  <Field SimpleSession mPeer>
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
	//    3    3:getfield        #56  <Field long mNextRequestId>
	//    4    6:lstore_2        
		mNextRequestId = l + 1L;
	//    5    7:aload_0         
	//    6    8:lload_2         
	//    7    9:lconst_1        
	//    8   10:ladd            
	//    9   11:putfield        #56  <Field long mNextRequestId>
		mPendingRequests.put(((Object) (Long.valueOf(l))), ((Object) (new PendingRequest(l, pendingrequestcallback))));
	//   10   14:aload_0         
	//   11   15:getfield        #34  <Field Map mPendingRequests>
	//   12   18:lload_2         
	//   13   19:invokestatic    #62  <Method Long Long.valueOf(long)>
	//   14   22:new             #64  <Class PendingRequest>
	//   15   25:dup             
	//   16   26:lload_2         
	//   17   27:aload_1         
	//   18   28:invokespecial   #67  <Method void PendingRequest(long, PendingRequestCallback)>
	//   19   31:invokeinterface #73  <Method Object Map.put(Object, Object)>
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
	//    3    3:getfield        #34  <Field Map mPendingRequests>
	//    4    6:lload_1         
	//    5    7:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    6   10:invokeinterface #78  <Method Object Map.remove(Object)>
	//    7   15:checkcast       #64  <Class PendingRequest>
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
	//    1    1:getfield        #51  <Field SimpleSession mPeer>
	//    2    4:areturn         
	}

	public void invokeDisconnectReceivers()
	{
		mDisconnectObservable.onDisconnect();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
	//    2    4:invokevirtual   #84  <Method void JsonRpcPeer$DisconnectObservable.onDisconnect()>
	//    3    7:return          
	}

	public void invokeMethod(String s, Object obj, PendingRequestCallback pendingrequestcallback)
		throws NotYetConnectedException
	{
		Util.throwIfNull(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		if(pendingrequestcallback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          21
			pendingrequestcallback = ((PendingRequestCallback) (Long.valueOf(preparePendingRequest(pendingrequestcallback))));
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokespecial   #91  <Method long preparePendingRequest(PendingRequestCallback)>
	//    8   14:invokestatic    #62  <Method Long Long.valueOf(long)>
	//    9   17:astore_3        
		else
	//*  10   18:goto            23
			pendingrequestcallback = null;
	//   11   21:aconst_null     
	//   12   22:astore_3        
		s = ((String) (new JsonRpcRequest(((Long) (pendingrequestcallback)), s, (JSONObject)mObjectMapper.convertValue(obj, org/json/JSONObject))));
	//   13   23:new             #93  <Class JsonRpcRequest>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #41  <Field ObjectMapper mObjectMapper>
	//   19   33:aload_2         
	//   20   34:ldc1            #95  <Class JSONObject>
	//   21   36:invokevirtual   #101 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   22   39:checkcast       #95  <Class JSONObject>
	//   23   42:invokespecial   #104 <Method void JsonRpcRequest(Long, String, JSONObject)>
	//   24   45:astore_1        
		s = ((JSONObject)mObjectMapper.convertValue(((Object) (s)), org/json/JSONObject)).toString();
	//   25   46:aload_0         
	//   26   47:getfield        #41  <Field ObjectMapper mObjectMapper>
	//   27   50:aload_1         
	//   28   51:ldc1            #95  <Class JSONObject>
	//   29   53:invokevirtual   #101 <Method Object ObjectMapper.convertValue(Object, Class)>
	//   30   56:checkcast       #95  <Class JSONObject>
	//   31   59:invokevirtual   #108 <Method String JSONObject.toString()>
	//   32   62:astore_1        
		mPeer.sendText(s);
	//   33   63:aload_0         
	//   34   64:getfield        #51  <Field SimpleSession mPeer>
	//   35   67:aload_1         
	//   36   68:invokeinterface #112 <Method void SimpleSession.sendText(String)>
	//   37   73:return          
	}

	public void registerDisconnectReceiver(DisconnectReceiver disconnectreceiver)
	{
		mDisconnectObservable.registerObserver(((Object) (disconnectreceiver)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #120 <Method void JsonRpcPeer$DisconnectObservable.registerObserver(Object)>
	//    4    8:return          
	}

	public void unregisterDisconnectReceiver(DisconnectReceiver disconnectreceiver)
	{
		mDisconnectObservable.unregisterObserver(((Object) (disconnectreceiver)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonRpcPeer$DisconnectObservable mDisconnectObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method void JsonRpcPeer$DisconnectObservable.unregisterObserver(Object)>
	//    4    8:return          
	}

	private final DisconnectObservable mDisconnectObservable = new DisconnectObservable();
	private long mNextRequestId;
	private final ObjectMapper mObjectMapper;
	private final SimpleSession mPeer;
	private final Map mPendingRequests = new HashMap();
}
