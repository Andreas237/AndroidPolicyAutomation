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

public abstract class ChromePeerManager
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
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void HashMap()>
	//    6   12:putfield        #28  <Field Map mReceivingPeers>
	//    7   15:return          
	}

	private ArrayList getReceivingPeersCopy()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ArrayList arraylist = new ArrayList(((java.util.Collection) (mReceivingPeers.keySet())));
	//    2    2:new             #33  <Class ArrayList>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field Map mReceivingPeers>
	//    6   10:invokeinterface #39  <Method java.util.Set Map.keySet()>
	//    7   15:invokespecial   #42  <Method void ArrayList(java.util.Collection)>
	//    8   18:astore_1        
		this;
	//    9   19:aload_0         
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return arraylist;
	//   11   21:aload_1         
	//   12   22:areturn         
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	private void sendMessageToPeers(String s, Object obj, PendingRequestCallback pendingrequestcallback)
	{
		ArrayList arraylist = getReceivingPeersCopy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method ArrayList getReceivingPeersCopy()>
	//    2    4:astore          6
		int j = arraylist.size();
	//    3    6:aload           6
	//    4    8:invokevirtual   #55  <Method int ArrayList.size()>
	//    5   11:istore          5
		for(int i = 0; i < j; i++)
	//*   6   13:iconst_0        
	//*   7   14:istore          4
	//*   8   16:iload           4
	//*   9   18:iload           5
	//*  10   20:icmpge          66
		{
			JsonRpcPeer jsonrpcpeer = (JsonRpcPeer)arraylist.get(i);
	//   11   23:aload           6
	//   12   25:iload           4
	//   13   27:invokevirtual   #59  <Method Object ArrayList.get(int)>
	//   14   30:checkcast       #61  <Class JsonRpcPeer>
	//   15   33:astore          7
			try
			{
				jsonrpcpeer.invokeMethod(s, obj, pendingrequestcallback);
	//   16   35:aload           7
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:aload_3         
	//   20   40:invokevirtual   #64  <Method void JsonRpcPeer.invokeMethod(String, Object, PendingRequestCallback)>
			}
	//*  21   43:goto            57
			catch(NotYetConnectedException notyetconnectedexception)
	//*  22   46:astore          7
			{
				LogRedirector.e("ChromePeerManager", "Error delivering data to Chrome", ((Throwable) (notyetconnectedexception)));
	//   23   48:ldc1            #11  <String "ChromePeerManager">
	//   24   50:ldc1            #66  <String "Error delivering data to Chrome">
	//   25   52:aload           7
	//   26   54:invokestatic    #72  <Method void LogRedirector.e(String, String, Throwable)>
			}
		}

	//   27   57:iload           4
	//   28   59:iconst_1        
	//   29   60:iadd            
	//   30   61:istore          4
	//*  31   63:goto            16
	//   32   66:return          
	}

	public boolean addPeer(JsonRpcPeer jsonrpcpeer)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mReceivingPeers.containsKey(((Object) (jsonrpcpeer)));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field Map mReceivingPeers>
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
	//   23   37:getfield        #28  <Field Map mReceivingPeers>
	//   24   40:aload_1         
	//   25   41:aload_3         
	//   26   42:invokeinterface #90  <Method Object Map.put(Object, Object)>
	//   27   47:pop             
		if(mListener != null)
	//*  28   48:aload_0         
	//*  29   49:getfield        #92  <Field PeerRegistrationListener mListener>
	//*  30   52:ifnull          65
			mListener.onPeerRegistered(jsonrpcpeer);
	//   31   55:aload_0         
	//   32   56:getfield        #92  <Field PeerRegistrationListener mListener>
	//   33   59:aload_1         
	//   34   60:invokeinterface #98  <Method void PeerRegistrationListener.onPeerRegistered(JsonRpcPeer)>
		this;
	//   35   65:aload_0         
		JVM INSTR monitorexit ;
	//   36   66:monitorexit     
		return true;
	//   37   67:iconst_1        
	//   38   68:ireturn         
		jsonrpcpeer;
	//   39   69:astore_1        
	//*  40   70:aload_0         
		throw jsonrpcpeer;
	//   41   71:monitorexit     
	//   42   72:aload_1         
	//   43   73:athrow          
	}

	public boolean hasRegisteredPeers()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mReceivingPeers.isEmpty();
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field Map mReceivingPeers>
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
		if(mReceivingPeers.remove(((Object) (jsonrpcpeer))) != null && mListener != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #28  <Field Map mReceivingPeers>
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #116 <Method Object Map.remove(Object)>
	//*   6   12:ifnull          32
	//*   7   15:aload_0         
	//*   8   16:getfield        #92  <Field PeerRegistrationListener mListener>
	//*   9   19:ifnull          32
			mListener.onPeerUnregistered(jsonrpcpeer);
	//   10   22:aload_0         
	//   11   23:getfield        #92  <Field PeerRegistrationListener mListener>
	//   12   26:aload_1         
	//   13   27:invokeinterface #119 <Method void PeerRegistrationListener.onPeerUnregistered(JsonRpcPeer)>
		this;
	//   14   32:aload_0         
		JVM INSTR monitorexit ;
	//   15   33:monitorexit     
		return;
	//   16   34:return          
		jsonrpcpeer;
	//   17   35:astore_1        
	//*  18   36:aload_0         
		throw jsonrpcpeer;
	//   19   37:monitorexit     
	//   20   38:aload_1         
	//   21   39:athrow          
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
}
