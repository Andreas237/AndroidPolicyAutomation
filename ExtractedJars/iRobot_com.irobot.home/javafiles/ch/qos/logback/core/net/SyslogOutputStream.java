// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.*;

public class SyslogOutputStream extends OutputStream
{

	public SyslogOutputStream(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void OutputStream()>
		baos = new ByteArrayOutputStream();
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ByteArrayOutputStream()>
	//    6   12:putfield        #24  <Field ByteArrayOutputStream baos>
		address = InetAddress.getByName(s);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #30  <Method InetAddress InetAddress.getByName(String)>
	//   10   20:putfield        #32  <Field InetAddress address>
		port = i;
	//   11   23:aload_0         
	//   12   24:iload_2         
	//   13   25:putfield        #34  <Field int port>
		ds = new DatagramSocket();
	//   14   28:aload_0         
	//   15   29:new             #36  <Class DatagramSocket>
	//   16   32:dup             
	//   17   33:invokespecial   #37  <Method void DatagramSocket()>
	//   18   36:putfield        #39  <Field DatagramSocket ds>
	//   19   39:return          
	}

	public void close()
	{
		address = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #32  <Field InetAddress address>
		ds = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #39  <Field DatagramSocket ds>
	//    6   10:return          
	}

	public void flush()
	{
		byte abyte0[] = baos.toByteArray();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ByteArrayOutputStream baos>
	//    2    4:invokevirtual   #46  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//    3    7:astore_1        
		DatagramPacket datagrampacket = new DatagramPacket(abyte0, abyte0.length, address, port);
	//    4    8:new             #48  <Class DatagramPacket>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:aload_1         
	//    8   14:arraylength     
	//    9   15:aload_0         
	//   10   16:getfield        #32  <Field InetAddress address>
	//   11   19:aload_0         
	//   12   20:getfield        #34  <Field int port>
	//   13   23:invokespecial   #51  <Method void DatagramPacket(byte[], int, InetAddress, int)>
	//   14   26:astore_2        
		if(baos.size() > 1024)
	//*  15   27:aload_0         
	//*  16   28:getfield        #24  <Field ByteArrayOutputStream baos>
	//*  17   31:invokevirtual   #55  <Method int ByteArrayOutputStream.size()>
	//*  18   34:sipush          1024
	//*  19   37:icmple          54
			baos = new ByteArrayOutputStream();
	//   20   40:aload_0         
	//   21   41:new             #21  <Class ByteArrayOutputStream>
	//   22   44:dup             
	//   23   45:invokespecial   #22  <Method void ByteArrayOutputStream()>
	//   24   48:putfield        #24  <Field ByteArrayOutputStream baos>
		else
	//*  25   51:goto            61
			baos.reset();
	//   26   54:aload_0         
	//   27   55:getfield        #24  <Field ByteArrayOutputStream baos>
	//   28   58:invokevirtual   #58  <Method void ByteArrayOutputStream.reset()>
		if(abyte0.length == 0)
	//*  29   61:aload_1         
	//*  30   62:arraylength     
	//*  31   63:ifne            67
			return;
	//   32   66:return          
		if(ds != null)
	//*  33   67:aload_0         
	//*  34   68:getfield        #39  <Field DatagramSocket ds>
	//*  35   71:ifnull          82
			ds.send(datagrampacket);
	//   36   74:aload_0         
	//   37   75:getfield        #39  <Field DatagramSocket ds>
	//   38   78:aload_2         
	//   39   79:invokevirtual   #62  <Method void DatagramSocket.send(DatagramPacket)>
	//   40   82:return          
	}

	public int getPort()
	{
		return port;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int port>
	//    2    4:ireturn         
	}

	int getSendBufferSize()
	{
		return ds.getSendBufferSize();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field DatagramSocket ds>
	//    2    4:invokevirtual   #66  <Method int DatagramSocket.getSendBufferSize()>
	//    3    7:ireturn         
	}

	public void write(int i)
	{
		baos.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ByteArrayOutputStream baos>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #70  <Method void ByteArrayOutputStream.write(int)>
	//    4    8:return          
	}

	public void write(byte abyte0[], int i, int j)
	{
		baos.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ByteArrayOutputStream baos>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #73  <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//    6   10:return          
	}

	private static final int MAX_LEN = 1024;
	private InetAddress address;
	private ByteArrayOutputStream baos;
	private DatagramSocket ds;
	private final int port;
}
