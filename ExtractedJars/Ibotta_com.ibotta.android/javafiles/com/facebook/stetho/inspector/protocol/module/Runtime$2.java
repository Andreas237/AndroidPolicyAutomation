// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.inspector.jsonrpc.DisconnectReceiver;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import java.util.Map;

// Referenced classes of package com.facebook.stetho.inspector.protocol.module:
//			Runtime

static final class Runtime$2
	implements DisconnectReceiver
{

	public void onDisconnect()
	{
		Runtime.access$100().remove(((Object) (val$peer)));
	//    0    0:invokestatic    #26  <Method Map Runtime.access$100()>
	//    1    3:aload_0         
	//    2    4:getfield        #17  <Field JsonRpcPeer val$peer>
	//    3    7:invokeinterface #32  <Method Object Map.remove(Object)>
	//    4   12:pop             
	//    5   13:return          
	}

	final JsonRpcPeer val$peer;

	Runtime$2(JsonRpcPeer jsonrpcpeer)
	{
		val$peer = jsonrpcpeer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field JsonRpcPeer val$peer>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
