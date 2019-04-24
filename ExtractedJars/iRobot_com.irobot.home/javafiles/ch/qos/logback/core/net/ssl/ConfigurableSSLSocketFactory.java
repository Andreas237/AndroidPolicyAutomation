// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package ch.qos.logback.core.net.ssl:
//			SSLConfigurableSocket, SSLParametersConfiguration

public class ConfigurableSSLSocketFactory extends SocketFactory
{

	public ConfigurableSSLSocketFactory(SSLParametersConfiguration sslparametersconfiguration, SSLSocketFactory sslsocketfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void SocketFactory()>
		parameters = sslparametersconfiguration;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SSLParametersConfiguration parameters>
		_flddelegate = sslsocketfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field SSLSocketFactory _flddelegate>
	//    8   14:return          
	}

	public Socket createSocket(String s, int i)
	{
		s = ((String) ((SSLSocket)_flddelegate.createSocket(s, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SSLSocketFactory _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #24  <Method Socket SSLSocketFactory.createSocket(String, int)>
	//    5    9:checkcast       #26  <Class SSLSocket>
	//    6   12:astore_1        
		parameters.configure(((SSLConfigurable) (new SSLConfigurableSocket(((SSLSocket) (s))))));
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field SSLParametersConfiguration parameters>
	//    9   17:new             #28  <Class SSLConfigurableSocket>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #31  <Method void SSLConfigurableSocket(SSLSocket)>
	//   13   25:invokevirtual   #37  <Method void SSLParametersConfiguration.configure(SSLConfigurable)>
		return ((Socket) (s));
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public Socket createSocket(String s, int i, InetAddress inetaddress, int j)
	{
		s = ((String) ((SSLSocket)_flddelegate.createSocket(s, i, inetaddress, j)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SSLSocketFactory _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #40  <Method Socket SSLSocketFactory.createSocket(String, int, InetAddress, int)>
	//    7   12:checkcast       #26  <Class SSLSocket>
	//    8   15:astore_1        
		parameters.configure(((SSLConfigurable) (new SSLConfigurableSocket(((SSLSocket) (s))))));
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field SSLParametersConfiguration parameters>
	//   11   20:new             #28  <Class SSLConfigurableSocket>
	//   12   23:dup             
	//   13   24:aload_1         
	//   14   25:invokespecial   #31  <Method void SSLConfigurableSocket(SSLSocket)>
	//   15   28:invokevirtual   #37  <Method void SSLParametersConfiguration.configure(SSLConfigurable)>
		return ((Socket) (s));
	//   16   31:aload_1         
	//   17   32:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i)
	{
		inetaddress = ((InetAddress) ((SSLSocket)_flddelegate.createSocket(inetaddress, i)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SSLSocketFactory _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #43  <Method Socket SSLSocketFactory.createSocket(InetAddress, int)>
	//    5    9:checkcast       #26  <Class SSLSocket>
	//    6   12:astore_1        
		parameters.configure(((SSLConfigurable) (new SSLConfigurableSocket(((SSLSocket) (inetaddress))))));
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field SSLParametersConfiguration parameters>
	//    9   17:new             #28  <Class SSLConfigurableSocket>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #31  <Method void SSLConfigurableSocket(SSLSocket)>
	//   13   25:invokevirtual   #37  <Method void SSLParametersConfiguration.configure(SSLConfigurable)>
		return ((Socket) (inetaddress));
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
	{
		inetaddress = ((InetAddress) ((SSLSocket)_flddelegate.createSocket(inetaddress, i, inetaddress1, j)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SSLSocketFactory _flddelegate>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #46  <Method Socket SSLSocketFactory.createSocket(InetAddress, int, InetAddress, int)>
	//    7   12:checkcast       #26  <Class SSLSocket>
	//    8   15:astore_1        
		parameters.configure(((SSLConfigurable) (new SSLConfigurableSocket(((SSLSocket) (inetaddress))))));
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field SSLParametersConfiguration parameters>
	//   11   20:new             #28  <Class SSLConfigurableSocket>
	//   12   23:dup             
	//   13   24:aload_1         
	//   14   25:invokespecial   #31  <Method void SSLConfigurableSocket(SSLSocket)>
	//   15   28:invokevirtual   #37  <Method void SSLParametersConfiguration.configure(SSLConfigurable)>
		return ((Socket) (inetaddress));
	//   16   31:aload_1         
	//   17   32:areturn         
	}

	private final SSLSocketFactory _flddelegate;
	private final SSLParametersConfiguration parameters;
}
