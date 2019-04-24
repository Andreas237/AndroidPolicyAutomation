// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.TrafficStats;
import java.net.DatagramSocket;
import java.net.SocketException;

// Referenced classes of package android.support.v4.net:
//			TrafficStatsCompat

static class TrafficStatsCompat$TrafficStatsCompatApi24Impl extends TrafficStatsCompat.TrafficStatsCompatBaseImpl
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

	TrafficStatsCompat$TrafficStatsCompatApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void TrafficStatsCompat$TrafficStatsCompatBaseImpl()>
	//    2    4:return          
	}
}
