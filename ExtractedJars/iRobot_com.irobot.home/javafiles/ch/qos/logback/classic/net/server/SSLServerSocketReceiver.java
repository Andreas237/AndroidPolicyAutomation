// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net.server;

import ch.qos.logback.core.net.ssl.*;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

// Referenced classes of package ch.qos.logback.classic.net.server:
//			ServerSocketReceiver

public class SSLServerSocketReceiver extends ServerSocketReceiver
	implements SSLComponent
{

	public SSLServerSocketReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ServerSocketReceiver()>
	//    2    4:return          
	}

	protected ServerSocketFactory getServerSocketFactory()
	{
		if(socketFactory == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ServerSocketFactory socketFactory>
	//*   2    4:ifnonnull       48
		{
			SSLContext sslcontext = getSsl().createContext(((ch.qos.logback.core.spi.ContextAware) (this)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #23  <Method SSLConfiguration getSsl()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #29  <Method SSLContext SSLConfiguration.createContext(ch.qos.logback.core.spi.ContextAware)>
	//    7   15:astore_1        
			SSLParametersConfiguration sslparametersconfiguration = getSsl().getParameters();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #23  <Method SSLConfiguration getSsl()>
	//   10   20:invokevirtual   #33  <Method SSLParametersConfiguration SSLConfiguration.getParameters()>
	//   11   23:astore_2        
			sslparametersconfiguration.setContext(getContext());
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #37  <Method ch.qos.logback.core.Context getContext()>
	//   15   29:invokevirtual   #43  <Method void SSLParametersConfiguration.setContext(ch.qos.logback.core.Context)>
			socketFactory = ((ServerSocketFactory) (new ConfigurableSSLServerSocketFactory(sslparametersconfiguration, sslcontext.getServerSocketFactory())));
	//   16   32:aload_0         
	//   17   33:new             #45  <Class ConfigurableSSLServerSocketFactory>
	//   18   36:dup             
	//   19   37:aload_2         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #50  <Method javax.net.ssl.SSLServerSocketFactory SSLContext.getServerSocketFactory()>
	//   22   42:invokespecial   #53  <Method void ConfigurableSSLServerSocketFactory(SSLParametersConfiguration, javax.net.ssl.SSLServerSocketFactory)>
	//   23   45:putfield        #19  <Field ServerSocketFactory socketFactory>
		}
		return socketFactory;
	//   24   48:aload_0         
	//   25   49:getfield        #19  <Field ServerSocketFactory socketFactory>
	//   26   52:areturn         
	}

	public SSLConfiguration getSsl()
	{
		if(ssl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field SSLConfiguration ssl>
	//*   2    4:ifnonnull       18
			ssl = new SSLConfiguration();
	//    3    7:aload_0         
	//    4    8:new             #25  <Class SSLConfiguration>
	//    5   11:dup             
	//    6   12:invokespecial   #56  <Method void SSLConfiguration()>
	//    7   15:putfield        #55  <Field SSLConfiguration ssl>
		return ssl;
	//    8   18:aload_0         
	//    9   19:getfield        #55  <Field SSLConfiguration ssl>
	//   10   22:areturn         
	}

	public void setSsl(SSLConfiguration sslconfiguration)
	{
		ssl = sslconfiguration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field SSLConfiguration ssl>
	//    3    5:return          
	}

	private ServerSocketFactory socketFactory;
	private SSLConfiguration ssl;
}
