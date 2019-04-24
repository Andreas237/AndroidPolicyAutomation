// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CloseUtil
{

	public CloseUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void closeQuietly(Closeable closeable)
	{
		if(closeable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			closeable.close();
	//    3    5:aload_0         
	//    4    6:invokeinterface #18  <Method void Closeable.close()>
			return;
	//    5   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   6   12:astore_0        
		{
			return;
	//    7   13:return          
		}
	}

	public static void closeQuietly(ServerSocket serversocket)
	{
		if(serversocket == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			serversocket.close();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #22  <Method void ServerSocket.close()>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ServerSocket serversocket)
	//*   6   10:astore_0        
		{
			return;
	//    7   11:return          
		}
	}

	public static void closeQuietly(Socket socket)
	{
		if(socket == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			socket.close();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #26  <Method void Socket.close()>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(Socket socket)
	//*   6   10:astore_0        
		{
			return;
	//    7   11:return          
		}
	}
}
