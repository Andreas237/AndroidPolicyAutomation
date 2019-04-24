// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import ch.qos.logback.core.util.CloseUtil;
import java.net.*;

// Referenced classes of package ch.qos.logback.core.net.server:
//			ServerListener, Client

public abstract class ServerSocketListener
	implements ServerListener
{

	public ServerSocketListener(ServerSocket serversocket)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		serverSocket = serversocket;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ServerSocket serverSocket>
	//    5    9:return          
	}

	private String socketAddressToString(SocketAddress socketaddress)
	{
		String s = ((Object) (socketaddress)).toString();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #23  <Method String Object.toString()>
	//    2    4:astore_3        
		int i = s.indexOf("/");
	//    3    5:aload_3         
	//    4    6:ldc1            #25  <String "/">
	//    5    8:invokevirtual   #31  <Method int String.indexOf(String)>
	//    6   11:istore_2        
		socketaddress = ((SocketAddress) (s));
	//    7   12:aload_3         
	//    8   13:astore_1        
		if(i >= 0)
	//*   9   14:iload_2         
	//*  10   15:iflt            26
			socketaddress = ((SocketAddress) (s.substring(i + 1)));
	//   11   18:aload_3         
	//   12   19:iload_2         
	//   13   20:iconst_1        
	//   14   21:iadd            
	//   15   22:invokevirtual   #35  <Method String String.substring(int)>
	//   16   25:astore_1        
		return ((String) (socketaddress));
	//   17   26:aload_1         
	//   18   27:areturn         
	}

	public Client acceptClient()
	{
		Socket socket = serverSocket.accept();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ServerSocket serverSocket>
	//    2    4:invokevirtual   #43  <Method Socket ServerSocket.accept()>
	//    3    7:astore_1        
		return createClient(socketAddressToString(socket.getRemoteSocketAddress()), socket);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #49  <Method SocketAddress Socket.getRemoteSocketAddress()>
	//    8   14:invokespecial   #51  <Method String socketAddressToString(SocketAddress)>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #55  <Method Client createClient(String, Socket)>
	//   11   21:areturn         
	}

	public void close()
	{
		CloseUtil.closeQuietly(serverSocket);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ServerSocket serverSocket>
	//    2    4:invokestatic    #63  <Method void CloseUtil.closeQuietly(ServerSocket)>
	//    3    7:return          
	}

	protected abstract Client createClient(String s, Socket socket);

	public String toString()
	{
		return socketAddressToString(serverSocket.getLocalSocketAddress());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field ServerSocket serverSocket>
	//    3    5:invokevirtual   #66  <Method SocketAddress ServerSocket.getLocalSocketAddress()>
	//    4    8:invokespecial   #51  <Method String socketAddressToString(SocketAddress)>
	//    5   11:areturn         
	}

	private final ServerSocket serverSocket;
}
