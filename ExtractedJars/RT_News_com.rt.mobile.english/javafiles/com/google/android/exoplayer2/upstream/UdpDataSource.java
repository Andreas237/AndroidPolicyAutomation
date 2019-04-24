// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.*;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, TransferListener, DataSpec

public final class UdpDataSource
	implements DataSource
{
	public static final class UdpDataSourceException extends IOException
	{

		public UdpDataSourceException(IOException ioexception)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void IOException(Throwable)>
		//    3    5:return          
		}
	}


	public UdpDataSource(TransferListener transferlistener)
	{
		this(transferlistener, 2000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          2000
	//    3    5:invokespecial   #40  <Method void UdpDataSource(TransferListener, int)>
	//    4    8:return          
	}

	public UdpDataSource(TransferListener transferlistener, int i)
	{
		this(transferlistener, i, 8000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:sipush          8000
	//    4    6:invokespecial   #46  <Method void UdpDataSource(TransferListener, int, int)>
	//    5    9:return          
	}

	public UdpDataSource(TransferListener transferlistener, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		listener = transferlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field TransferListener listener>
		socketTimeoutMillis = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #54  <Field int socketTimeoutMillis>
		packetBuffer = new byte[i];
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:newarray        byte[]
	//   11   18:putfield        #56  <Field byte[] packetBuffer>
		packet = new DatagramPacket(packetBuffer, 0, i);
	//   12   21:aload_0         
	//   13   22:new             #58  <Class DatagramPacket>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:getfield        #56  <Field byte[] packetBuffer>
	//   17   30:iconst_0        
	//   18   31:iload_2         
	//   19   32:invokespecial   #61  <Method void DatagramPacket(byte[], int, int)>
	//   20   35:putfield        #63  <Field DatagramPacket packet>
	//   21   38:return          
	}

	public void close()
	{
		uri = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #69  <Field Uri uri>
		if(multicastSocket != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #71  <Field MulticastSocket multicastSocket>
	//*   5    9:ifnull          28
		{
			try
			{
				multicastSocket.leaveGroup(address);
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field MulticastSocket multicastSocket>
	//    8   16:aload_0         
	//    9   17:getfield        #73  <Field InetAddress address>
	//   10   20:invokevirtual   #79  <Method void MulticastSocket.leaveGroup(InetAddress)>
			}
	//*  11   23:aload_0         
	//*  12   24:aconst_null     
	//*  13   25:putfield        #71  <Field MulticastSocket multicastSocket>
	//*  14   28:aload_0         
	//*  15   29:getfield        #81  <Field DatagramSocket socket>
	//*  16   32:ifnull          47
	//*  17   35:aload_0         
	//*  18   36:getfield        #81  <Field DatagramSocket socket>
	//*  19   39:invokevirtual   #85  <Method void DatagramSocket.close()>
	//*  20   42:aload_0         
	//*  21   43:aconst_null     
	//*  22   44:putfield        #81  <Field DatagramSocket socket>
	//*  23   47:aload_0         
	//*  24   48:aconst_null     
	//*  25   49:putfield        #73  <Field InetAddress address>
	//*  26   52:aload_0         
	//*  27   53:aconst_null     
	//*  28   54:putfield        #87  <Field InetSocketAddress socketAddress>
	//*  29   57:aload_0         
	//*  30   58:iconst_0        
	//*  31   59:putfield        #89  <Field int packetRemaining>
	//*  32   62:aload_0         
	//*  33   63:getfield        #91  <Field boolean opened>
	//*  34   66:ifeq            91
	//*  35   69:aload_0         
	//*  36   70:iconst_0        
	//*  37   71:putfield        #91  <Field boolean opened>
	//*  38   74:aload_0         
	//*  39   75:getfield        #52  <Field TransferListener listener>
	//*  40   78:ifnull          91
	//*  41   81:aload_0         
	//*  42   82:getfield        #52  <Field TransferListener listener>
	//*  43   85:aload_0         
	//*  44   86:invokeinterface #97  <Method void TransferListener.onTransferEnd(Object)>
	//*  45   91:return          
			catch(IOException ioexception) { }
	//   46   92:astore_1        
			multicastSocket = null;
		}
		if(socket != null)
		{
			socket.close();
			socket = null;
		}
		address = null;
		socketAddress = null;
		packetRemaining = 0;
		if(opened)
		{
			opened = false;
			if(listener != null)
				listener.onTransferEnd(((Object) (this)));
		}
	//*  47   93:goto            23
	}

	public Uri getUri()
	{
		return uri;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Uri uri>
	//    2    4:areturn         
	}

	public long open(DataSpec dataspec)
		throws UdpDataSourceException
	{
		int i;
		String s;
		uri = dataspec.uri;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #106 <Field Uri DataSpec.uri>
	//    3    5:putfield        #69  <Field Uri uri>
		s = uri.getHost();
	//    4    8:aload_0         
	//    5    9:getfield        #69  <Field Uri uri>
	//    6   12:invokevirtual   #112 <Method String Uri.getHost()>
	//    7   15:astore_3        
		i = uri.getPort();
	//    8   16:aload_0         
	//    9   17:getfield        #69  <Field Uri uri>
	//   10   20:invokevirtual   #116 <Method int Uri.getPort()>
	//   11   23:istore_2        
label0:
		{
			address = InetAddress.getByName(s);
	//   12   24:aload_0         
	//   13   25:aload_3         
	//   14   26:invokestatic    #122 <Method InetAddress InetAddress.getByName(String)>
	//   15   29:putfield        #73  <Field InetAddress address>
			socketAddress = new InetSocketAddress(address, i);
	//   16   32:aload_0         
	//   17   33:new             #124 <Class InetSocketAddress>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #73  <Field InetAddress address>
	//   21   41:iload_2         
	//   22   42:invokespecial   #127 <Method void InetSocketAddress(InetAddress, int)>
	//   23   45:putfield        #87  <Field InetSocketAddress socketAddress>
			if(address.isMulticastAddress())
	//*  24   48:aload_0         
	//*  25   49:getfield        #73  <Field InetAddress address>
	//*  26   52:invokevirtual   #131 <Method boolean InetAddress.isMulticastAddress()>
	//*  27   55:ifeq            95
			{
				multicastSocket = new MulticastSocket(((java.net.SocketAddress) (socketAddress)));
	//   28   58:aload_0         
	//   29   59:new             #75  <Class MulticastSocket>
	//   30   62:dup             
	//   31   63:aload_0         
	//   32   64:getfield        #87  <Field InetSocketAddress socketAddress>
	//   33   67:invokespecial   #134 <Method void MulticastSocket(java.net.SocketAddress)>
	//   34   70:putfield        #71  <Field MulticastSocket multicastSocket>
				multicastSocket.joinGroup(address);
	//   35   73:aload_0         
	//   36   74:getfield        #71  <Field MulticastSocket multicastSocket>
	//   37   77:aload_0         
	//   38   78:getfield        #73  <Field InetAddress address>
	//   39   81:invokevirtual   #137 <Method void MulticastSocket.joinGroup(InetAddress)>
				socket = ((DatagramSocket) (multicastSocket));
	//   40   84:aload_0         
	//   41   85:aload_0         
	//   42   86:getfield        #71  <Field MulticastSocket multicastSocket>
	//   43   89:putfield        #81  <Field DatagramSocket socket>
				break label0;
	//   44   92:goto            110
			}
			try
			{
				socket = new DatagramSocket(((java.net.SocketAddress) (socketAddress)));
	//   45   95:aload_0         
	//   46   96:new             #83  <Class DatagramSocket>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:getfield        #87  <Field InetSocketAddress socketAddress>
	//   50  104:invokespecial   #138 <Method void DatagramSocket(java.net.SocketAddress)>
	//   51  107:putfield        #81  <Field DatagramSocket socket>
			}
	//*  52  110:aload_0         
	//*  53  111:getfield        #81  <Field DatagramSocket socket>
	//*  54  114:aload_0         
	//*  55  115:getfield        #54  <Field int socketTimeoutMillis>
	//*  56  118:invokevirtual   #142 <Method void DatagramSocket.setSoTimeout(int)>
	//*  57  121:aload_0         
	//*  58  122:iconst_1        
	//*  59  123:putfield        #91  <Field boolean opened>
	//*  60  126:aload_0         
	//*  61  127:getfield        #52  <Field TransferListener listener>
	//*  62  130:ifnull          144
	//*  63  133:aload_0         
	//*  64  134:getfield        #52  <Field TransferListener listener>
	//*  65  137:aload_0         
	//*  66  138:aload_1         
	//*  67  139:invokeinterface #146 <Method void TransferListener.onTransferStart(Object, DataSpec)>
	//*  68  144:ldc2w           #147 <Long -1L>
	//*  69  147:lreturn         
	//*  70  148:astore_1        
	//*  71  149:new             #8   <Class UdpDataSource$UdpDataSourceException>
	//*  72  152:dup             
	//*  73  153:aload_1         
	//*  74  154:invokespecial   #151 <Method void UdpDataSource$UdpDataSourceException(IOException)>
	//*  75  157:athrow          
			// Misplaced declaration of an exception variable
			catch(DataSpec dataspec)
	//*  76  158:astore_1        
			{
				throw new UdpDataSourceException(((IOException) (dataspec)));
	//   77  159:new             #8   <Class UdpDataSource$UdpDataSourceException>
	//   78  162:dup             
	//   79  163:aload_1         
	//   80  164:invokespecial   #151 <Method void UdpDataSource$UdpDataSourceException(IOException)>
	//   81  167:athrow          
			}
		}
		try
		{
			socket.setSoTimeout(socketTimeoutMillis);
		}
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
		{
			throw new UdpDataSourceException(((IOException) (dataspec)));
		}
		opened = true;
		if(listener != null)
			listener.onTransferStart(((Object) (this)), dataspec);
		return -1L;
	}

	public int read(byte abyte0[], int i, int j)
		throws UdpDataSourceException
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(packetRemaining == 0)
	//*   4    6:aload_0         
	//*   5    7:getfield        #89  <Field int packetRemaining>
	//*   6   10:ifne            69
		{
			try
			{
				socket.receive(packet);
	//    7   13:aload_0         
	//    8   14:getfield        #81  <Field DatagramSocket socket>
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field DatagramPacket packet>
	//   11   21:invokevirtual   #158 <Method void DatagramSocket.receive(DatagramPacket)>
			}
	//*  12   24:aload_0         
	//*  13   25:aload_0         
	//*  14   26:getfield        #63  <Field DatagramPacket packet>
	//*  15   29:invokevirtual   #161 <Method int DatagramPacket.getLength()>
	//*  16   32:putfield        #89  <Field int packetRemaining>
	//*  17   35:aload_0         
	//*  18   36:getfield        #52  <Field TransferListener listener>
	//*  19   39:ifnull          69
	//*  20   42:aload_0         
	//*  21   43:getfield        #52  <Field TransferListener listener>
	//*  22   46:aload_0         
	//*  23   47:aload_0         
	//*  24   48:getfield        #89  <Field int packetRemaining>
	//*  25   51:invokeinterface #165 <Method void TransferListener.onBytesTransferred(Object, int)>
	//*  26   56:goto            69
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  27   59:astore_1        
			{
				throw new UdpDataSourceException(((IOException) (abyte0)));
	//   28   60:new             #8   <Class UdpDataSource$UdpDataSourceException>
	//   29   63:dup             
	//   30   64:aload_1         
	//   31   65:invokespecial   #151 <Method void UdpDataSource$UdpDataSourceException(IOException)>
	//   32   68:athrow          
			}
			packetRemaining = packet.getLength();
			if(listener != null)
				listener.onBytesTransferred(((Object) (this)), packetRemaining);
		}
		int k = packet.getLength();
	//   33   69:aload_0         
	//   34   70:getfield        #63  <Field DatagramPacket packet>
	//   35   73:invokevirtual   #161 <Method int DatagramPacket.getLength()>
	//   36   76:istore          4
		int l = packetRemaining;
	//   37   78:aload_0         
	//   38   79:getfield        #89  <Field int packetRemaining>
	//   39   82:istore          5
		j = Math.min(packetRemaining, j);
	//   40   84:aload_0         
	//   41   85:getfield        #89  <Field int packetRemaining>
	//   42   88:iload_3         
	//   43   89:invokestatic    #171 <Method int Math.min(int, int)>
	//   44   92:istore_3        
		System.arraycopy(((Object) (packetBuffer)), k - l, ((Object) (abyte0)), i, j);
	//   45   93:aload_0         
	//   46   94:getfield        #56  <Field byte[] packetBuffer>
	//   47   97:iload           4
	//   48   99:iload           5
	//   49  101:isub            
	//   50  102:aload_1         
	//   51  103:iload_2         
	//   52  104:iload_3         
	//   53  105:invokestatic    #177 <Method void System.arraycopy(Object, int, Object, int, int)>
		packetRemaining = packetRemaining - j;
	//   54  108:aload_0         
	//   55  109:aload_0         
	//   56  110:getfield        #89  <Field int packetRemaining>
	//   57  113:iload_3         
	//   58  114:isub            
	//   59  115:putfield        #89  <Field int packetRemaining>
		return j;
	//   60  118:iload_3         
	//   61  119:ireturn         
	}

	public static final int DEAFULT_SOCKET_TIMEOUT_MILLIS = 8000;
	public static final int DEFAULT_MAX_PACKET_SIZE = 2000;
	private InetAddress address;
	private final TransferListener listener;
	private MulticastSocket multicastSocket;
	private boolean opened;
	private final DatagramPacket packet;
	private final byte packetBuffer[];
	private int packetRemaining;
	private DatagramSocket socket;
	private InetSocketAddress socketAddress;
	private final int socketTimeoutMillis;
	private Uri uri;
}
