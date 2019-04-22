// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;


// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

private static interface WebsocketConnection$WSClient
{

	public abstract void close();

	public abstract void connect();

	public abstract void send(String s);
}
