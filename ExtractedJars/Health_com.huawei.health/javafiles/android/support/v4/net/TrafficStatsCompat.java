// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.TrafficStats;
import android.os.ParcelFileDescriptor;
import java.net.*;

// Referenced classes of package android.support.v4.net:
//			DatagramSocketWrapper

public final class TrafficStatsCompat
{
	static class TrafficStatsCompatApi24Impl extends TrafficStatsCompatBaseImpl
	{

		public void tagDatagramSocket(DatagramSocket datagramsocket)
			throws SocketException
		{
			TrafficStats.tagDatagramSocket(datagramsocket);
		//    0    0:aload_1         
		//    1    1:invokestatic    #23  <Method void TrafficStats.tagDatagramSocket(DatagramSocket)>
		//    2    4:return          
		}

		public void untagDatagramSocket(DatagramSocket datagramsocket)
			throws SocketException
		{
			TrafficStats.untagDatagramSocket(datagramsocket);
		//    0    0:aload_1         
		//    1    1:invokestatic    #27  <Method void TrafficStats.untagDatagramSocket(DatagramSocket)>
		//    2    4:return          
		}

		TrafficStatsCompatApi24Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void TrafficStatsCompat$TrafficStatsCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class TrafficStatsCompatBaseImpl
	{

		public void tagDatagramSocket(DatagramSocket datagramsocket)
			throws SocketException
		{
			ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.fromDatagramSocket(datagramsocket);
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method ParcelFileDescriptor ParcelFileDescriptor.fromDatagramSocket(DatagramSocket)>
		//    2    4:astore_2        
			TrafficStats.tagSocket(((Socket) (new DatagramSocketWrapper(datagramsocket, parcelfiledescriptor.getFileDescriptor()))));
		//    3    5:new             #24  <Class DatagramSocketWrapper>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #28  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
		//    8   14:invokespecial   #31  <Method void DatagramSocketWrapper(DatagramSocket, java.io.FileDescriptor)>
		//    9   17:invokestatic    #37  <Method void TrafficStats.tagSocket(Socket)>
			parcelfiledescriptor.detachFd();
		//   10   20:aload_2         
		//   11   21:invokevirtual   #41  <Method int ParcelFileDescriptor.detachFd()>
		//   12   24:pop             
		//   13   25:return          
		}

		public void untagDatagramSocket(DatagramSocket datagramsocket)
			throws SocketException
		{
			ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.fromDatagramSocket(datagramsocket);
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method ParcelFileDescriptor ParcelFileDescriptor.fromDatagramSocket(DatagramSocket)>
		//    2    4:astore_2        
			TrafficStats.untagSocket(((Socket) (new DatagramSocketWrapper(datagramsocket, parcelfiledescriptor.getFileDescriptor()))));
		//    3    5:new             #24  <Class DatagramSocketWrapper>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #28  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
		//    8   14:invokespecial   #31  <Method void DatagramSocketWrapper(DatagramSocket, java.io.FileDescriptor)>
		//    9   17:invokestatic    #46  <Method void TrafficStats.untagSocket(Socket)>
			parcelfiledescriptor.detachFd();
		//   10   20:aload_2         
		//   11   21:invokevirtual   #41  <Method int ParcelFileDescriptor.detachFd()>
		//   12   24:pop             
		//   13   25:return          
		}

		TrafficStatsCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private TrafficStatsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	public static void clearThreadStatsTag()
	{
		TrafficStats.clearThreadStatsTag();
	//    0    0:invokestatic    #34  <Method void TrafficStats.clearThreadStatsTag()>
	//    1    3:return          
	}

	public static int getThreadStatsTag()
	{
		return TrafficStats.getThreadStatsTag();
	//    0    0:invokestatic    #39  <Method int TrafficStats.getThreadStatsTag()>
	//    1    3:ireturn         
	}

	public static void incrementOperationCount(int i)
	{
		TrafficStats.incrementOperationCount(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #43  <Method void TrafficStats.incrementOperationCount(int)>
	//    2    4:return          
	}

	public static void incrementOperationCount(int i, int j)
	{
		TrafficStats.incrementOperationCount(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #46  <Method void TrafficStats.incrementOperationCount(int, int)>
	//    3    5:return          
	}

	public static void setThreadStatsTag(int i)
	{
		TrafficStats.setThreadStatsTag(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #49  <Method void TrafficStats.setThreadStatsTag(int)>
	//    2    4:return          
	}

	public static void tagDatagramSocket(DatagramSocket datagramsocket)
		throws SocketException
	{
		IMPL.tagDatagramSocket(datagramsocket);
	//    0    0:getstatic       #25  <Field TrafficStatsCompat$TrafficStatsCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #55  <Method void TrafficStatsCompat$TrafficStatsCompatBaseImpl.tagDatagramSocket(DatagramSocket)>
	//    3    7:return          
	}

	public static void tagSocket(Socket socket)
		throws SocketException
	{
		TrafficStats.tagSocket(socket);
	//    0    0:aload_0         
	//    1    1:invokestatic    #60  <Method void TrafficStats.tagSocket(Socket)>
	//    2    4:return          
	}

	public static void untagDatagramSocket(DatagramSocket datagramsocket)
		throws SocketException
	{
		IMPL.untagDatagramSocket(datagramsocket);
	//    0    0:getstatic       #25  <Field TrafficStatsCompat$TrafficStatsCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #63  <Method void TrafficStatsCompat$TrafficStatsCompatBaseImpl.untagDatagramSocket(DatagramSocket)>
	//    3    7:return          
	}

	public static void untagSocket(Socket socket)
		throws SocketException
	{
		TrafficStats.untagSocket(socket);
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method void TrafficStats.untagSocket(Socket)>
	//    2    4:return          
	}

	private static final TrafficStatsCompatBaseImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			IMPL = ((TrafficStatsCompatBaseImpl) (new TrafficStatsCompatApi24Impl()));
	//    3    8:new             #6   <Class TrafficStatsCompat$TrafficStatsCompatApi24Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #23  <Method void TrafficStatsCompat$TrafficStatsCompatApi24Impl()>
	//    6   15:putstatic       #25  <Field TrafficStatsCompat$TrafficStatsCompatBaseImpl IMPL>
	//    7   18:return          
		else
			IMPL = new TrafficStatsCompatBaseImpl();
	//    8   19:new             #9   <Class TrafficStatsCompat$TrafficStatsCompatBaseImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #26  <Method void TrafficStatsCompat$TrafficStatsCompatBaseImpl()>
	//   11   26:putstatic       #25  <Field TrafficStatsCompat$TrafficStatsCompatBaseImpl IMPL>
	//*  12   29:return          
	}
}
