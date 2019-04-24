// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import java.net.ServerSocket;
import java.net.Socket;

// Referenced classes of package ch.qos.logback.core.net.server:
//			ServerSocketListener, RemoteReceiverStreamClient, Client, RemoteReceiverClient

class RemoteReceiverServerListener extends ServerSocketListener
{

	public RemoteReceiverServerListener(ServerSocket serversocket)
	{
		super(serversocket);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ServerSocketListener(ServerSocket)>
	//    3    5:return          
	}

	protected volatile Client createClient(String s, Socket socket)
	{
		return ((Client) (createClient(s, socket)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #15  <Method RemoteReceiverClient createClient(String, Socket)>
	//    4    6:areturn         
	}

	protected RemoteReceiverClient createClient(String s, Socket socket)
	{
		return ((RemoteReceiverClient) (new RemoteReceiverStreamClient(s, socket)));
	//    0    0:new             #17  <Class RemoteReceiverStreamClient>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #20  <Method void RemoteReceiverStreamClient(String, Socket)>
	//    5    9:areturn         
	}
}
