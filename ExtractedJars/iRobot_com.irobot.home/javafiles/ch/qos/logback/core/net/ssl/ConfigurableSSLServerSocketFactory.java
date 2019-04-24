// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.ssl;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

// Referenced classes of package ch.qos.logback.core.net.ssl:
//			SSLConfigurableServerSocket, SSLParametersConfiguration

public class ConfigurableSSLServerSocketFactory extends ServerSocketFactory
{

	public ConfigurableSSLServerSocketFactory(SSLParametersConfiguration sslparametersconfiguration, SSLServerSocketFactory sslserversocketfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ServerSocketFactory()>
		parameters = sslparametersconfiguration;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SSLParametersConfiguration parameters>
		_flddelegate = sslserversocketfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field SSLServerSocketFactory _flddelegate>
	//    8   14:return          
	}

	public ServerSocket createServerSocket(int i)
	{
		SSLServerSocket sslserversocket = (SSLServerSocket)_flddelegate.createServerSocket(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SSLServerSocketFactory _flddelegate>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #24  <Method ServerSocket SSLServerSocketFactory.createServerSocket(int)>
	//    4    8:checkcast       #26  <Class SSLServerSocket>
	//    5   11:astore_2        
		parameters.configure(((SSLConfigurable) (new SSLConfigurableServerSocket(sslserversocket))));
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field SSLParametersConfiguration parameters>
	//    8   16:new             #28  <Class SSLConfigurableServerSocket>
	//    9   19:dup             
	//   10   20:aload_2         
	//   11   21:invokespecial   #31  <Method void SSLConfigurableServerSocket(SSLServerSocket)>
	//   12   24:invokevirtual   #37  <Method void SSLParametersConfiguration.configure(SSLConfigurable)>
		return ((ServerSocket) (sslserversocket));
	//   13   27:aload_2         
	//   14   28:areturn         
	}

	public ServerSocket createServerSocket(int i, int j)
	{
		SSLServerSocket sslserversocket = (SSLServerSocket)_flddelegate.createServerSocket(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SSLServerSocketFactory _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #40  <Method ServerSocket SSLServerSocketFactory.createServerSocket(int, int)>
	//    5    9:checkcast       #26  <Class SSLServerSocket>
	//    6   12:astore_3        
		parameters.configure(((SSLConfigurable) (new SSLConfigurableServerSocket(sslserversocket))));
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field SSLParametersConfiguration parameters>
	//    9   17:new             #28  <Class SSLConfigurableServerSocket>
	//   10   20:dup             
	//   11   21:aload_3         
	//   12   22:invokespecial   #31  <Method void SSLConfigurableServerSocket(SSLServerSocket)>
	//   13   25:invokevirtual   #37  <Method void SSLParametersConfiguration.configure(SSLConfigurable)>
		return ((ServerSocket) (sslserversocket));
	//   14   28:aload_3         
	//   15   29:areturn         
	}

	public ServerSocket createServerSocket(int i, int j, InetAddress inetaddress)
	{
		inetaddress = ((InetAddress) ((SSLServerSocket)_flddelegate.createServerSocket(i, j, inetaddress)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SSLServerSocketFactory _flddelegate>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #43  <Method ServerSocket SSLServerSocketFactory.createServerSocket(int, int, InetAddress)>
	//    6   10:checkcast       #26  <Class SSLServerSocket>
	//    7   13:astore_3        
		parameters.configure(((SSLConfigurable) (new SSLConfigurableServerSocket(((SSLServerSocket) (inetaddress))))));
	//    8   14:aload_0         
	//    9   15:getfield        #15  <Field SSLParametersConfiguration parameters>
	//   10   18:new             #28  <Class SSLConfigurableServerSocket>
	//   11   21:dup             
	//   12   22:aload_3         
	//   13   23:invokespecial   #31  <Method void SSLConfigurableServerSocket(SSLServerSocket)>
	//   14   26:invokevirtual   #37  <Method void SSLParametersConfiguration.configure(SSLConfigurable)>
		return ((ServerSocket) (inetaddress));
	//   15   29:aload_3         
	//   16   30:areturn         
	}

	private final SSLServerSocketFactory _flddelegate;
	private final SSLParametersConfiguration parameters;
}
