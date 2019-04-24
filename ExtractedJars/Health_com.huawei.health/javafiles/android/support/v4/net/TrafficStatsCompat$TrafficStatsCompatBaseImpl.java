// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.TrafficStats;
import android.os.ParcelFileDescriptor;
import java.net.DatagramSocket;
import java.net.SocketException;

// Referenced classes of package android.support.v4.net:
//			TrafficStatsCompat, DatagramSocketWrapper

static class TrafficStatsCompat$TrafficStatsCompatBaseImpl
{

	public void tagDatagramSocket(DatagramSocket datagramsocket)
		throws SocketException
	{
		ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.fromDatagramSocket(datagramsocket);
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method ParcelFileDescriptor ParcelFileDescriptor.fromDatagramSocket(DatagramSocket)>
	//    2    4:astore_2        
		TrafficStats.tagSocket(((java.net.Socket) (new DatagramSocketWrapper(datagramsocket, parcelfiledescriptor.getFileDescriptor()))));
	//    3    5:new             #24  <Class DatagramSocketWrapper>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #28  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//    8   14:invokespecial   #31  <Method void DatagramSocketWrapper(DatagramSocket, java.io.FileDescriptor)>
	//    9   17:invokestatic    #37  <Method void TrafficStats.tagSocket(java.net.Socket)>
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
		TrafficStats.untagSocket(((java.net.Socket) (new DatagramSocketWrapper(datagramsocket, parcelfiledescriptor.getFileDescriptor()))));
	//    3    5:new             #24  <Class DatagramSocketWrapper>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #28  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//    8   14:invokespecial   #31  <Method void DatagramSocketWrapper(DatagramSocket, java.io.FileDescriptor)>
	//    9   17:invokestatic    #46  <Method void TrafficStats.untagSocket(java.net.Socket)>
		parcelfiledescriptor.detachFd();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #41  <Method int ParcelFileDescriptor.detachFd()>
	//   12   24:pop             
	//   13   25:return          
	}

	TrafficStatsCompat$TrafficStatsCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
