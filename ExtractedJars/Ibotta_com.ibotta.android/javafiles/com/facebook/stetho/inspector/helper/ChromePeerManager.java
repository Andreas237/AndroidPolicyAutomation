// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.common.LogRedirector;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.*;
import java.nio.channels.NotYetConnectedException;
import java.util.*;

// Referenced classes of package com.facebook.stetho.inspector.helper:
//			PeerRegistrationListener

public class ChromePeerManager
{
	private class UnregisterOnDisconnect
		implements DisconnectReceiver
	{

		public void onDisconnect()
		{
			removePeer(mPeer);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ChromePeerManager this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field JsonRpcPeer mPeer>
		//    4    8:invokevirtual   #28  <Method void ChromePeerManager.removePeer(JsonRpcPeer)>
		//    5   11:return          
		}

		private final JsonRpcPeer mPeer;
		final ChromePeerManager this$0;

		public UnregisterOnDisconnect(JsonRpcPeer jsonrpcpeer)
		{
			this$0 = ChromePeerManager.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field ChromePeerManager this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			mPeer = jsonrpcpeer;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field JsonRpcPeer mPeer>
		//    8   14:return          
		}
	}


	public ChromePeerManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #27  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void HashMap()>
	//    6   12:putfield        #30  <Field Map mReceivingPeers>
	//    7   15:return          
	}

	private JsonRpcPeer[] getReceivingPeersSnapshot()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		JsonRpcPeer ajsonrpcpeer[];
		if(mReceivingPeersSnapshot == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #35  <Field JsonRpcPeer[] mReceivingPeersSnapshot>
	//*   4    6:ifnonnull       42
			mReceivingPeersSnapshot = (JsonRpcPeer[])mReceivingPeers.keySet().toArray(((Object []) (new JsonRpcPeer[mReceivingPeers.size()])));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field Map mReceivingPeers>
	//    8   14:invokeinterface #41  <Method Set Map.keySet()>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field Map mReceivingPeers>
	//   11   23:invokeinterface #45  <Method int Map.size()>
	//   12   28:anewarray       JsonRpcPeer[]
	//   13   31:invokeinterface #53  <Method Object[] Set.toArray(Object[])>
	//   14   36:checkcast       #54  <Class JsonRpcPeer[]>
	//   15   39:putfield        #35  <Field JsonRpcPeer[] mReceivingPeersSnapshot>
		ajsonrpcpeer = mReceivingPeersSnapshot;
	//   16   42:aload_0         
	//   17   43:getfield        #35  <Field JsonRpcPeer[] mReceivingPeersSnapshot>
	//   18   46:astore_1        
		this;
	//   19   47:aload_0         
		JVM INSTR monitorexit ;
	//   20   48:monitorexit     
		return ajsonrpcpeer;
	//   21   49:aload_1         
	//   22   50:areturn         
		Exception exception;
		exception;
	//   23   51:astore_1        
	//*  24   52:aload_0         
		throw exception;
	//   25   53:monitorexit     
	//   26   54:aload_1         
	//   27   55:athrow          
	}

	private void sendMessageToPeers(String s, Object obj, PendingRequestCallback pendingrequestcallback)
	{
		JsonRpcPeer ajsonrpcpeer[] = getReceivingPeersSnapshot();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method JsonRpcPeer[] getReceivingPeersSnapshot()>
	//    2    4:astore          6
		int j = ajsonrpcpeer.length;
	//    3    6:aload           6
	//    4    8:arraylength     
	//    5    9:istore          5
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore          4
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          59
		{
			JsonRpcPeer jsonrpcpeer = ajsonrpcpeer[i];
	//   11   21:aload           6
	//   12   23:iload           4
	//   13   25:aaload          
	//   14   26:astore          7
			try
			{
				jsonrpcpeer.invokeMethod(s, obj, pendingrequestcallback);
	//   15   28:aload           7
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:aload_3         
	//   19   33:invokevirtual   #64  <Method void JsonRpcPeer.invokeMethod(String, Object, PendingRequestCallback)>
			}
	//*  20   36:goto            50
			catch(NotYetConnectedException notyetconnectedexception)
	//*  21   39:astore          7
			{
				LogRedirector.e("ChromePeerManager", "Error delivering data to Chrome", ((Throwable) (notyetconnectedexception)));
	//   22   41:ldc1            #11  <String "ChromePeerManager">
	//   23   43:ldc1            #66  <String "Error delivering data to Chrome">
	//   24   45:aload           7
	//   25   47:invokestatic    #72  <Method void LogRedirector.e(String, String, Throwable)>
			}
		}

	//   26   50:iload           4
	//   27   52:iconst_1        
	//   28   53:iadd            
	//   29   54:istore          4
	//*  30   56:goto            14
	//   31   59:return          
	}

	public boolean addPeer(JsonRpcPeer jsonrpcpeer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mReceivingPeers.containsKey(((Object) (jsonrpcpeer)));
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field Map mReceivingPeers>
	//    4    6:aload_1         
	//    5    7:invokeinterface #79  <Method boolean Map.containsKey(Object)>
	//    6   12:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_21;
	//    7   13:iload_2         
	//    8   14:ifeq            21
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		UnregisterOnDisconnect unregisterondisconnect = new UnregisterOnDisconnect(jsonrpcpeer);
	//   13   21:new             #6   <Class ChromePeerManager$UnregisterOnDisconnect>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokespecial   #82  <Method void ChromePeerManager$UnregisterOnDisconnect(ChromePeerManager, JsonRpcPeer)>
	//   18   30:astore_3        
		jsonrpcpeer.registerDisconnectReceiver(((DisconnectReceiver) (unregisterondisconnect)));
	//   19   31:aload_1         
	//   20   32:aload_3         
	//   21   33:invokevirtual   #86  <Method void JsonRpcPeer.registerDisconnectReceiver(DisconnectReceiver)>
		mReceivingPeers.put(((Object) (jsonrpcpeer)), ((Object) (unregisterondisconnect)));
	//   22   36:aload_0         
	//   23   37:getfield        #30  <Field Map mReceivingPeers>
	//   24   40:aload_1         
	//   25   41:aload_3         
	//   26   42:invokeinterface #90  <Method Object Map.put(Object, Object)>
	//   27   47:pop             
		mReceivingPeersSnapshot = null;
	//   28   48:aload_0         
	//   29   49:aconst_null     
	//   30   50:putfield        #35  <Field JsonRpcPeer[] mReceivingPeersSnapshot>
		if(mListener != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #92  <Field PeerRegistrationListener mListener>
	//*  33   57:ifnull          70
			mListener.onPeerRegistered(jsonrpcpeer);
	//   34   60:aload_0         
	//   35   61:getfield        #92  <Field PeerRegistrationListener mListener>
	//   36   64:aload_1         
	//   37   65:invokeinterface #98  <Method void PeerRegistrationListener.onPeerRegistered(JsonRpcPeer)>
		this;
	//   38   70:aload_0         
		JVM INSTR monitorexit ;
	//   39   71:monitorexit     
		return true;
	//   40   72:iconst_1        
	//   41   73:ireturn         
		jsonrpcpeer;
	//   42   74:astore_1        
	//*  43   75:aload_0         
		throw jsonrpcpeer;
	//   44   76:monitorexit     
	//   45   77:aload_1         
	//   46   78:athrow          
	}

	public boolean hasRegisteredPeers()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mReceivingPeers.isEmpty();
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field Map mReceivingPeers>
	//    4    6:invokeinterface #103 <Method boolean Map.isEmpty()>
	//    5   11:istore_1        
		this;
	//    6   12:aload_0         
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return flag ^ true;
	//    8   14:iload_1         
	//    9   15:iconst_1        
	//   10   16:ixor            
	//   11   17:ireturn         
		Exception exception;
		exception;
	//   12   18:astore_2        
	//*  13   19:aload_0         
		throw exception;
	//   14   20:monitorexit     
	//   15   21:aload_2         
	//   16   22:athrow          
	}

	public void invokeMethodOnPeers(String s, Object obj, PendingRequestCallback pendingrequestcallback)
	{
		Util.throwIfNull(((Object) (pendingrequestcallback)));
	//    0    0:aload_3         
	//    1    1:invokestatic    #110 <Method Object Util.throwIfNull(Object)>
	//    2    4:pop             
		sendMessageToPeers(s, obj, pendingrequestcallback);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #112 <Method void sendMessageToPeers(String, Object, PendingRequestCallback)>
	//    8   12:return          
	}

	public void removePeer(JsonRpcPeer jsonrpcpeer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mReceivingPeers.remove(((Object) (jsonrpcpeer))) != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #30  <Field Map mReceivingPeers>
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #116 <Method Object Map.remove(Object)>
	//*   6   12:ifnull          37
		{
			mReceivingPeersSnapshot = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #35  <Field JsonRpcPeer[] mReceivingPeersSnapshot>
			if(mListener != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #92  <Field PeerRegistrationListener mListener>
	//*  12   24:ifnull          37
				mListener.onPeerUnregistered(jsonrpcpeer);
	//   13   27:aload_0         
	//   14   28:getfield        #92  <Field PeerRegistrationListener mListener>
	//   15   31:aload_1         
	//   16   32:invokeinterface #119 <Method void PeerRegistrationListener.onPeerUnregistered(JsonRpcPeer)>
		}
		this;
	//   17   37:aload_0         
		JVM INSTR monitorexit ;
	//   18   38:monitorexit     
		return;
	//   19   39:return          
		jsonrpcpeer;
	//   20   40:astore_1        
	//*  21   41:aload_0         
		throw jsonrpcpeer;
	//   22   42:monitorexit     
	//   23   43:aload_1         
	//   24   44:athrow          
	}

	public void sendNotificationToPeers(String s, Object obj)
	{
		sendMessageToPeers(s, obj, ((PendingRequestCallback) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #112 <Method void sendMessageToPeers(String, Object, PendingRequestCallback)>
	//    5    7:return          
	}

	public void setListener(PeerRegistrationListener peerregistrationlistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mListener = peerregistrationlistener;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #92  <Field PeerRegistrationListener mListener>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		peerregistrationlistener;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw peerregistrationlistener;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	private static final String TAG = "ChromePeerManager";
	private PeerRegistrationListener mListener;
	private final Map mReceivingPeers = new HashMap();
	private JsonRpcPeer mReceivingPeersSnapshot[];
}
