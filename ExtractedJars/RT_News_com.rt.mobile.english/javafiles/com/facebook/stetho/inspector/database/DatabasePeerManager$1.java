// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;

// Referenced classes of package com.facebook.stetho.inspector.database:
//			DatabasePeerManager

class DatabasePeerManager$1
	implements PeerRegistrationListener
{

	public void onPeerRegistered(JsonRpcPeer jsonrpcpeer)
	{
		DatabasePeerManager.access$000(DatabasePeerManager.this, jsonrpcpeer);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field DatabasePeerManager this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method void DatabasePeerManager.access$000(DatabasePeerManager, JsonRpcPeer)>
	//    4    8:return          
	}

	public void onPeerUnregistered(JsonRpcPeer jsonrpcpeer)
	{
	//    0    0:return          
	}

	final DatabasePeerManager this$0;

	DatabasePeerManager$1()
	{
		this$0 = DatabasePeerManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DatabasePeerManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
