// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;


// Referenced classes of package ch.qos.logback.core.net:
//			SocketConnector

public static interface SocketConnector$ExceptionHandler
{

	public abstract void connectionFailed(SocketConnector socketconnector, Exception exception);
}
