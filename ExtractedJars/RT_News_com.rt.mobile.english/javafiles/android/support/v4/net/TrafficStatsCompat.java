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

	private TrafficStatsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void clearThreadStatsTag()
	{
		TrafficStats.clearThreadStatsTag();
	//    0    0:invokestatic    #15  <Method void TrafficStats.clearThreadStatsTag()>
	//    1    3:return          
	}

	public static int getThreadStatsTag()
	{
		return TrafficStats.getThreadStatsTag();
	//    0    0:invokestatic    #20  <Method int TrafficStats.getThreadStatsTag()>
	//    1    3:ireturn         
	}

	public static void incrementOperationCount(int i)
	{
		TrafficStats.incrementOperationCount(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #24  <Method void TrafficStats.incrementOperationCount(int)>
	//    2    4:return          
	}

	public static void incrementOperationCount(int i, int j)
	{
		TrafficStats.incrementOperationCount(i, j);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #27  <Method void TrafficStats.incrementOperationCount(int, int)>
	//    3    5:return          
	}

	public static void setThreadStatsTag(int i)
	{
		TrafficStats.setThreadStatsTag(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #30  <Method void TrafficStats.setThreadStatsTag(int)>
	//    2    4:return          
	}

	public static void tagDatagramSocket(DatagramSocket datagramsocket)
		throws SocketException
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
		{
			TrafficStats.tagDatagramSocket(datagramsocket);
	//    3    8:aload_0         
	//    4    9:invokestatic    #43  <Method void TrafficStats.tagDatagramSocket(DatagramSocket)>
			return;
	//    5   12:return          
		} else
		{
			ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.fromDatagramSocket(datagramsocket);
	//    6   13:aload_0         
	//    7   14:invokestatic    #49  <Method ParcelFileDescriptor ParcelFileDescriptor.fromDatagramSocket(DatagramSocket)>
	//    8   17:astore_1        
			TrafficStats.tagSocket(((Socket) (new DatagramSocketWrapper(datagramsocket, parcelfiledescriptor.getFileDescriptor()))));
	//    9   18:new             #51  <Class DatagramSocketWrapper>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #55  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//   14   27:invokespecial   #58  <Method void DatagramSocketWrapper(DatagramSocket, java.io.FileDescriptor)>
	//   15   30:invokestatic    #62  <Method void TrafficStats.tagSocket(Socket)>
			parcelfiledescriptor.detachFd();
	//   16   33:aload_1         
	//   17   34:invokevirtual   #65  <Method int ParcelFileDescriptor.detachFd()>
	//   18   37:pop             
			return;
	//   19   38:return          
		}
	}

	public static void tagSocket(Socket socket)
		throws SocketException
	{
		TrafficStats.tagSocket(socket);
	//    0    0:aload_0         
	//    1    1:invokestatic    #62  <Method void TrafficStats.tagSocket(Socket)>
	//    2    4:return          
	}

	public static void untagDatagramSocket(DatagramSocket datagramsocket)
		throws SocketException
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
		{
			TrafficStats.untagDatagramSocket(datagramsocket);
	//    3    8:aload_0         
	//    4    9:invokestatic    #70  <Method void TrafficStats.untagDatagramSocket(DatagramSocket)>
			return;
	//    5   12:return          
		} else
		{
			ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.fromDatagramSocket(datagramsocket);
	//    6   13:aload_0         
	//    7   14:invokestatic    #49  <Method ParcelFileDescriptor ParcelFileDescriptor.fromDatagramSocket(DatagramSocket)>
	//    8   17:astore_1        
			TrafficStats.untagSocket(((Socket) (new DatagramSocketWrapper(datagramsocket, parcelfiledescriptor.getFileDescriptor()))));
	//    9   18:new             #51  <Class DatagramSocketWrapper>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #55  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//   14   27:invokespecial   #58  <Method void DatagramSocketWrapper(DatagramSocket, java.io.FileDescriptor)>
	//   15   30:invokestatic    #73  <Method void TrafficStats.untagSocket(Socket)>
			parcelfiledescriptor.detachFd();
	//   16   33:aload_1         
	//   17   34:invokevirtual   #65  <Method int ParcelFileDescriptor.detachFd()>
	//   18   37:pop             
			return;
	//   19   38:return          
		}
	}

	public static void untagSocket(Socket socket)
		throws SocketException
	{
		TrafficStats.untagSocket(socket);
	//    0    0:aload_0         
	//    1    1:invokestatic    #73  <Method void TrafficStats.untagSocket(Socket)>
	//    2    4:return          
	}
}
