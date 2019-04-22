// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;


// Referenced classes of package com.facebook.stetho.websocket:
//			SimpleSession

public interface SimpleEndpoint
{

	public abstract void onClose(SimpleSession simplesession, int i, String s);

	public abstract void onError(SimpleSession simplesession, Throwable throwable);

	public abstract void onMessage(SimpleSession simplesession, String s);

	public abstract void onMessage(SimpleSession simplesession, byte abyte0[], int i);

	public abstract void onOpen(SimpleSession simplesession);
}
