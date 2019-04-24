// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import java.io.PrintStream;

// Referenced classes of package ch.qos.logback.core.net:
//			SocketConnectorBase, SocketConnector

private static class SocketConnectorBase$ConsoleExceptionHandler
	implements SocketConnector.ExceptionHandler
{

	public void connectionFailed(SocketConnector socketconnector, Exception exception)
	{
		System.out.println(((Object) (exception)));
	//    0    0:getstatic       #24  <Field PrintStream System.out>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #30  <Method void PrintStream.println(Object)>
	//    3    7:return          
	}

	private SocketConnectorBase$ConsoleExceptionHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	SocketConnectorBase$ConsoleExceptionHandler(SocketConnectorBase._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void SocketConnectorBase$ConsoleExceptionHandler()>
	//    2    4:return          
	}
}
