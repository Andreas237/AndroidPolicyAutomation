// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.stetho.inspector.helper:
//			PeerRegistrationListener

public abstract class PeersRegisteredListener
	implements PeerRegistrationListener
{

	public PeersRegisteredListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mPeers = new AtomicInteger(0);
	//    2    4:aload_0         
	//    3    5:new             #14  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #17  <Method void AtomicInteger(int)>
	//    7   13:putfield        #19  <Field AtomicInteger mPeers>
	//    8   16:return          
	}

	protected abstract void onFirstPeerRegistered();

	protected abstract void onLastPeerUnregistered();

	protected void onPeerAdded(JsonRpcPeer jsonrpcpeer)
	{
	//    0    0:return          
	}

	public final void onPeerRegistered(JsonRpcPeer jsonrpcpeer)
	{
		if(mPeers.incrementAndGet() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field AtomicInteger mPeers>
	//*   2    4:invokevirtual   #29  <Method int AtomicInteger.incrementAndGet()>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          15
			onFirstPeerRegistered();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #31  <Method void onFirstPeerRegistered()>
		onPeerAdded(jsonrpcpeer);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #33  <Method void onPeerAdded(JsonRpcPeer)>
	//   10   20:return          
	}

	protected void onPeerRemoved(JsonRpcPeer jsonrpcpeer)
	{
	//    0    0:return          
	}

	public final void onPeerUnregistered(JsonRpcPeer jsonrpcpeer)
	{
		if(mPeers.decrementAndGet() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field AtomicInteger mPeers>
	//*   2    4:invokevirtual   #38  <Method int AtomicInteger.decrementAndGet()>
	//*   3    7:ifne            14
			onLastPeerUnregistered();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #40  <Method void onLastPeerUnregistered()>
		onPeerRemoved(jsonrpcpeer);
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:invokevirtual   #42  <Method void onPeerRemoved(JsonRpcPeer)>
	//    9   19:return          
	}

	private AtomicInteger mPeers;
}
