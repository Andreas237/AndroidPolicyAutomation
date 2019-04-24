// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import java.io.*;
import java.net.*;

class DatagramSocketWrapper extends Socket
{
	private static class DatagramSocketImplWrapper extends SocketImpl
	{

		protected void accept(SocketImpl socketimpl)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected int available()
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void bind(InetAddress inetaddress, int i)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void close()
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void connect(String s, int i)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void connect(InetAddress inetaddress, int i)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void connect(SocketAddress socketaddress, int i)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void create(boolean flag)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected InputStream getInputStream()
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public Object getOption(int i)
			throws SocketException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected OutputStream getOutputStream()
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void listen(int i)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		protected void sendUrgentData(int i)
			throws IOException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public void setOption(int i, Object obj)
			throws SocketException
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #33  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public DatagramSocketImplWrapper(DatagramSocket datagramsocket, FileDescriptor filedescriptor)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void SocketImpl()>
			localport = datagramsocket.getLocalPort();
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #18  <Method int DatagramSocket.getLocalPort()>
		//    5    9:putfield        #22  <Field int localport>
			fd = filedescriptor;
		//    6   12:aload_0         
		//    7   13:aload_2         
		//    8   14:putfield        #26  <Field FileDescriptor fd>
		//    9   17:return          
		}
	}


	public DatagramSocketWrapper(DatagramSocket datagramsocket, FileDescriptor filedescriptor)
		throws SocketException
	{
		super(((SocketImpl) (new DatagramSocketImplWrapper(datagramsocket, filedescriptor))));
	//    0    0:aload_0         
	//    1    1:new             #6   <Class DatagramSocketWrapper$DatagramSocketImplWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void DatagramSocketWrapper$DatagramSocketImplWrapper(DatagramSocket, FileDescriptor)>
	//    6   10:invokespecial   #16  <Method void Socket(SocketImpl)>
	//    7   13:return          
	}
}
