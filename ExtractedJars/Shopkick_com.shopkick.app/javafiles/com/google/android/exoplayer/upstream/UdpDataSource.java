// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.*;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			UriDataSource, TransferListener, DataSpec

public final class UdpDataSource
	implements UriDataSource
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

		public UdpDataSourceException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void IOException(String)>
		//    3    5:return          
		}
	}


	public UdpDataSource(TransferListener transferlistener)
	{
		this(transferlistener, 2000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          2000
	//    3    5:invokespecial   #39  <Method void UdpDataSource(TransferListener, int)>
	//    4    8:return          
	}

	public UdpDataSource(TransferListener transferlistener, int i)
	{
		this(transferlistener, i, 8000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:sipush          8000
	//    4    6:invokespecial   #43  <Method void UdpDataSource(TransferListener, int, int)>
	//    5    9:return          
	}

	public UdpDataSource(TransferListener transferlistener, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		listener = transferlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field TransferListener listener>
		socketTimeoutMillis = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #50  <Field int socketTimeoutMillis>
		packetBuffer = new byte[i];
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:newarray        byte[]
	//   11   18:putfield        #52  <Field byte[] packetBuffer>
		packet = new DatagramPacket(packetBuffer, 0, i);
	//   12   21:aload_0         
	//   13   22:new             #54  <Class DatagramPacket>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:getfield        #52  <Field byte[] packetBuffer>
	//   17   30:iconst_0        
	//   18   31:iload_2         
	//   19   32:invokespecial   #57  <Method void DatagramPacket(byte[], int, int)>
	//   20   35:putfield        #59  <Field DatagramPacket packet>
	//   21   38:return          
	}

	public void close()
	{
		Object obj = ((Object) (multicastSocket));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field MulticastSocket multicastSocket>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          22
		{
			try
			{
				((MulticastSocket) (obj)).leaveGroup(address);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #66  <Field InetAddress address>
	//    8   14:invokevirtual   #72  <Method void MulticastSocket.leaveGroup(InetAddress)>
			}
	//*   9   17:aload_0         
	//*  10   18:aconst_null     
	//*  11   19:putfield        #64  <Field MulticastSocket multicastSocket>
	//*  12   22:aload_0         
	//*  13   23:getfield        #74  <Field DatagramSocket socket>
	//*  14   26:astore_1        
	//*  15   27:aload_1         
	//*  16   28:ifnull          40
	//*  17   31:aload_1         
	//*  18   32:invokevirtual   #78  <Method void DatagramSocket.close()>
	//*  19   35:aload_0         
	//*  20   36:aconst_null     
	//*  21   37:putfield        #74  <Field DatagramSocket socket>
	//*  22   40:aload_0         
	//*  23   41:aconst_null     
	//*  24   42:putfield        #66  <Field InetAddress address>
	//*  25   45:aload_0         
	//*  26   46:aconst_null     
	//*  27   47:putfield        #80  <Field InetSocketAddress socketAddress>
	//*  28   50:aload_0         
	//*  29   51:iconst_0        
	//*  30   52:putfield        #82  <Field int packetRemaining>
	//*  31   55:aload_0         
	//*  32   56:getfield        #84  <Field boolean opened>
	//*  33   59:ifeq            82
	//*  34   62:aload_0         
	//*  35   63:iconst_0        
	//*  36   64:putfield        #84  <Field boolean opened>
	//*  37   67:aload_0         
	//*  38   68:getfield        #48  <Field TransferListener listener>
	//*  39   71:astore_1        
	//*  40   72:aload_1         
	//*  41   73:ifnull          82
	//*  42   76:aload_1         
	//*  43   77:invokeinterface #89  <Method void TransferListener.onTransferEnd()>
	//*  44   82:return          
			catch(IOException ioexception) { }
	//   45   83:astore_1        
			multicastSocket = null;
		}
		obj = ((Object) (socket));
		if(obj != null)
		{
			((DatagramSocket) (obj)).close();
			socket = null;
		}
		address = null;
		socketAddress = null;
		packetRemaining = 0;
		if(opened)
		{
			opened = false;
			obj = ((Object) (listener));
			if(obj != null)
				((TransferListener) (obj)).onTransferEnd();
		}
	//*  46   84:goto            17
	}

	public String getUri()
	{
		DataSpec dataspec = dataSpec;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field DataSpec dataSpec>
	//    2    4:astore_1        
		if(dataspec == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return dataspec.uri.toString();
	//    7   11:aload_1         
	//    8   12:getfield        #99  <Field Uri DataSpec.uri>
	//    9   15:invokevirtual   #104 <Method String Uri.toString()>
	//   10   18:areturn         
	}

	public long open(DataSpec dataspec)
		throws UdpDataSourceException
	{
		int i;
		String s;
		dataSpec = dataspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field DataSpec dataSpec>
		s = dataspec.uri.getHost();
	//    3    5:aload_1         
	//    4    6:getfield        #99  <Field Uri DataSpec.uri>
	//    5    9:invokevirtual   #111 <Method String Uri.getHost()>
	//    6   12:astore_3        
		i = dataspec.uri.getPort();
	//    7   13:aload_1         
	//    8   14:getfield        #99  <Field Uri DataSpec.uri>
	//    9   17:invokevirtual   #115 <Method int Uri.getPort()>
	//   10   20:istore_2        
label0:
		{
			address = InetAddress.getByName(s);
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:invokestatic    #121 <Method InetAddress InetAddress.getByName(String)>
	//   14   26:putfield        #66  <Field InetAddress address>
			socketAddress = new InetSocketAddress(address, i);
	//   15   29:aload_0         
	//   16   30:new             #123 <Class InetSocketAddress>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:getfield        #66  <Field InetAddress address>
	//   20   38:iload_2         
	//   21   39:invokespecial   #126 <Method void InetSocketAddress(InetAddress, int)>
	//   22   42:putfield        #80  <Field InetSocketAddress socketAddress>
			if(address.isMulticastAddress())
	//*  23   45:aload_0         
	//*  24   46:getfield        #66  <Field InetAddress address>
	//*  25   49:invokevirtual   #130 <Method boolean InetAddress.isMulticastAddress()>
	//*  26   52:ifeq            92
			{
				multicastSocket = new MulticastSocket(((java.net.SocketAddress) (socketAddress)));
	//   27   55:aload_0         
	//   28   56:new             #68  <Class MulticastSocket>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:getfield        #80  <Field InetSocketAddress socketAddress>
	//   32   64:invokespecial   #133 <Method void MulticastSocket(java.net.SocketAddress)>
	//   33   67:putfield        #64  <Field MulticastSocket multicastSocket>
				multicastSocket.joinGroup(address);
	//   34   70:aload_0         
	//   35   71:getfield        #64  <Field MulticastSocket multicastSocket>
	//   36   74:aload_0         
	//   37   75:getfield        #66  <Field InetAddress address>
	//   38   78:invokevirtual   #136 <Method void MulticastSocket.joinGroup(InetAddress)>
				socket = ((DatagramSocket) (multicastSocket));
	//   39   81:aload_0         
	//   40   82:aload_0         
	//   41   83:getfield        #64  <Field MulticastSocket multicastSocket>
	//   42   86:putfield        #74  <Field DatagramSocket socket>
				break label0;
	//   43   89:goto            107
			}
			try
			{
				socket = new DatagramSocket(((java.net.SocketAddress) (socketAddress)));
	//   44   92:aload_0         
	//   45   93:new             #76  <Class DatagramSocket>
	//   46   96:dup             
	//   47   97:aload_0         
	//   48   98:getfield        #80  <Field InetSocketAddress socketAddress>
	//   49  101:invokespecial   #137 <Method void DatagramSocket(java.net.SocketAddress)>
	//   50  104:putfield        #74  <Field DatagramSocket socket>
			}
	//*  51  107:aload_0         
	//*  52  108:getfield        #74  <Field DatagramSocket socket>
	//*  53  111:aload_0         
	//*  54  112:getfield        #50  <Field int socketTimeoutMillis>
	//*  55  115:invokevirtual   #141 <Method void DatagramSocket.setSoTimeout(int)>
	//*  56  118:aload_0         
	//*  57  119:iconst_1        
	//*  58  120:putfield        #84  <Field boolean opened>
	//*  59  123:aload_0         
	//*  60  124:getfield        #48  <Field TransferListener listener>
	//*  61  127:astore_1        
	//*  62  128:aload_1         
	//*  63  129:ifnull          138
	//*  64  132:aload_1         
	//*  65  133:invokeinterface #144 <Method void TransferListener.onTransferStart()>
	//*  66  138:ldc2w           #145 <Long -1L>
	//*  67  141:lreturn         
	//*  68  142:astore_1        
	//*  69  143:new             #8   <Class UdpDataSource$UdpDataSourceException>
	//*  70  146:dup             
	//*  71  147:aload_1         
	//*  72  148:invokespecial   #149 <Method void UdpDataSource$UdpDataSourceException(IOException)>
	//*  73  151:athrow          
			// Misplaced declaration of an exception variable
			catch(DataSpec dataspec)
	//*  74  152:astore_1        
			{
				throw new UdpDataSourceException(((IOException) (dataspec)));
	//   75  153:new             #8   <Class UdpDataSource$UdpDataSourceException>
	//   76  156:dup             
	//   77  157:aload_1         
	//   78  158:invokespecial   #149 <Method void UdpDataSource$UdpDataSourceException(IOException)>
	//   79  161:athrow          
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
		dataspec = ((DataSpec) (listener));
		if(dataspec != null)
			((TransferListener) (dataspec)).onTransferStart();
		return -1L;
	}

	public int read(byte abyte0[], int i, int j)
		throws UdpDataSourceException
	{
		if(packetRemaining == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field int packetRemaining>
	//*   2    4:ifne            64
		{
			TransferListener transferlistener;
			try
			{
				socket.receive(packet);
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field DatagramSocket socket>
	//    5   11:aload_0         
	//    6   12:getfield        #59  <Field DatagramPacket packet>
	//    7   15:invokevirtual   #156 <Method void DatagramSocket.receive(DatagramPacket)>
			}
	//*   8   18:aload_0         
	//*   9   19:aload_0         
	//*  10   20:getfield        #59  <Field DatagramPacket packet>
	//*  11   23:invokevirtual   #159 <Method int DatagramPacket.getLength()>
	//*  12   26:putfield        #82  <Field int packetRemaining>
	//*  13   29:aload_0         
	//*  14   30:getfield        #48  <Field TransferListener listener>
	//*  15   33:astore          6
	//*  16   35:aload           6
	//*  17   37:ifnull          64
	//*  18   40:aload           6
	//*  19   42:aload_0         
	//*  20   43:getfield        #82  <Field int packetRemaining>
	//*  21   46:invokeinterface #162 <Method void TransferListener.onBytesTransferred(int)>
	//*  22   51:goto            64
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  23   54:astore_1        
			{
				throw new UdpDataSourceException(((IOException) (abyte0)));
	//   24   55:new             #8   <Class UdpDataSource$UdpDataSourceException>
	//   25   58:dup             
	//   26   59:aload_1         
	//   27   60:invokespecial   #149 <Method void UdpDataSource$UdpDataSourceException(IOException)>
	//   28   63:athrow          
			}
			packetRemaining = packet.getLength();
			transferlistener = listener;
			if(transferlistener != null)
				transferlistener.onBytesTransferred(packetRemaining);
		}
		int k = packet.getLength();
	//   29   64:aload_0         
	//   30   65:getfield        #59  <Field DatagramPacket packet>
	//   31   68:invokevirtual   #159 <Method int DatagramPacket.getLength()>
	//   32   71:istore          4
		int l = packetRemaining;
	//   33   73:aload_0         
	//   34   74:getfield        #82  <Field int packetRemaining>
	//   35   77:istore          5
		j = Math.min(l, j);
	//   36   79:iload           5
	//   37   81:iload_3         
	//   38   82:invokestatic    #168 <Method int Math.min(int, int)>
	//   39   85:istore_3        
		System.arraycopy(((Object) (packetBuffer)), k - l, ((Object) (abyte0)), i, j);
	//   40   86:aload_0         
	//   41   87:getfield        #52  <Field byte[] packetBuffer>
	//   42   90:iload           4
	//   43   92:iload           5
	//   44   94:isub            
	//   45   95:aload_1         
	//   46   96:iload_2         
	//   47   97:iload_3         
	//   48   98:invokestatic    #174 <Method void System.arraycopy(Object, int, Object, int, int)>
		packetRemaining = packetRemaining - j;
	//   49  101:aload_0         
	//   50  102:aload_0         
	//   51  103:getfield        #82  <Field int packetRemaining>
	//   52  106:iload_3         
	//   53  107:isub            
	//   54  108:putfield        #82  <Field int packetRemaining>
		return j;
	//   55  111:iload_3         
	//   56  112:ireturn         
	}

	public static final int DEAFULT_SOCKET_TIMEOUT_MILLIS = 8000;
	public static final int DEFAULT_MAX_PACKET_SIZE = 2000;
	private InetAddress address;
	private DataSpec dataSpec;
	private final TransferListener listener;
	private MulticastSocket multicastSocket;
	private boolean opened;
	private final DatagramPacket packet;
	private byte packetBuffer[];
	private int packetRemaining;
	private DatagramSocket socket;
	private InetSocketAddress socketAddress;
	private final int socketTimeoutMillis;
}
