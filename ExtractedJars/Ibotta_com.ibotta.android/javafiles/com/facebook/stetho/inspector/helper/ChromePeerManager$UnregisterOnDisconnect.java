// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;

// Referenced classes of package com.facebook.stetho.inspector.helper:
//			ChromePeerManager

private class ChromePeerManager$UnregisterOnDisconnect
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

	public ChromePeerManager$UnregisterOnDisconnect(JsonRpcPeer jsonrpcpeer)
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
