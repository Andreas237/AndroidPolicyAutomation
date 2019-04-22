// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.tubesock;


// Referenced classes of package com.firebase.tubesock:
//			WebSocketException, WebSocketMessage

public interface WebSocketEventHandler
{

	public abstract void onClose();

	public abstract void onError(WebSocketException websocketexception);

	public abstract void onLogMessage(String s);

	public abstract void onMessage(WebSocketMessage websocketmessage);

	public abstract void onOpen();
}
