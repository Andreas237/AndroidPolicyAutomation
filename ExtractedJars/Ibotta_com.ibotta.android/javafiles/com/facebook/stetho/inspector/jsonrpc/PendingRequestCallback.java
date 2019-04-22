// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.jsonrpc;

import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcResponse;

// Referenced classes of package com.facebook.stetho.inspector.jsonrpc:
//			JsonRpcPeer

public interface PendingRequestCallback
{

	public abstract void onResponse(JsonRpcPeer jsonrpcpeer, JsonRpcResponse jsonrpcresponse);
}
