// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net.server;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.net.server.ServerSocketListener;
import java.net.ServerSocket;
import java.net.Socket;

// Referenced classes of package ch.qos.logback.classic.net.server:
//			RemoteAppenderStreamClient, RemoteAppenderClient

class RemoteAppenderServerListener extends ServerSocketListener
{

	public RemoteAppenderServerListener(ServerSocket serversocket)
	{
		super(serversocket);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ServerSocketListener(ServerSocket)>
	//    3    5:return          
	}

	protected RemoteAppenderClient createClient(String s, Socket socket)
	{
		return ((RemoteAppenderClient) (new RemoteAppenderStreamClient(s, socket)));
	//    0    0:new             #14  <Class RemoteAppenderStreamClient>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #17  <Method void RemoteAppenderStreamClient(String, Socket)>
	//    5    9:areturn         
	}

	protected volatile Client createClient(String s, Socket socket)
	{
		return ((Client) (createClient(s, socket)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method RemoteAppenderClient createClient(String, Socket)>
	//    4    6:areturn         
	}
}
