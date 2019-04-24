// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.helper;

import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;

public interface PeerRegistrationListener
{

	public abstract void onPeerRegistered(JsonRpcPeer jsonrpcpeer);

	public abstract void onPeerUnregistered(JsonRpcPeer jsonrpcpeer);
}
