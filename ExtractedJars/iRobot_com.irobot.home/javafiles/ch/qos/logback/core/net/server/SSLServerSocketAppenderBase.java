// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.ssl.*;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

// Referenced classes of package ch.qos.logback.core.net.server:
//			AbstractServerSocketAppender

public abstract class SSLServerSocketAppenderBase extends AbstractServerSocketAppender
	implements SSLComponent
{

	public SSLServerSocketAppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AbstractServerSocketAppender()>
	//    2    4:return          
	}

	protected ServerSocketFactory getServerSocketFactory()
	{
		return socketFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ServerSocketFactory socketFactory>
	//    2    4:areturn         
	}

	public SSLConfiguration getSsl()
	{
		if(ssl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field SSLConfiguration ssl>
	//*   2    4:ifnonnull       18
			ssl = new SSLConfiguration();
	//    3    7:aload_0         
	//    4    8:new             #26  <Class SSLConfiguration>
	//    5   11:dup             
	//    6   12:invokespecial   #27  <Method void SSLConfiguration()>
	//    7   15:putfield        #24  <Field SSLConfiguration ssl>
		return ssl;
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field SSLConfiguration ssl>
	//   10   22:areturn         
	}

	public void setSsl(SSLConfiguration sslconfiguration)
	{
		ssl = sslconfiguration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field SSLConfiguration ssl>
	//    3    5:return          
	}

	public void start()
	{
		try
		{
			SSLContext sslcontext = getSsl().createContext(((ch.qos.logback.core.spi.ContextAware) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method SSLConfiguration getSsl()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #38  <Method SSLContext SSLConfiguration.createContext(ch.qos.logback.core.spi.ContextAware)>
	//    4    8:astore_1        
			SSLParametersConfiguration sslparametersconfiguration = getSsl().getParameters();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method SSLConfiguration getSsl()>
	//    7   13:invokevirtual   #42  <Method SSLParametersConfiguration SSLConfiguration.getParameters()>
	//    8   16:astore_2        
			sslparametersconfiguration.setContext(getContext());
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #46  <Method ch.qos.logback.core.Context getContext()>
	//   12   22:invokevirtual   #52  <Method void SSLParametersConfiguration.setContext(ch.qos.logback.core.Context)>
			socketFactory = ((ServerSocketFactory) (new ConfigurableSSLServerSocketFactory(sslparametersconfiguration, sslcontext.getServerSocketFactory())));
	//   13   25:aload_0         
	//   14   26:new             #54  <Class ConfigurableSSLServerSocketFactory>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #59  <Method javax.net.ssl.SSLServerSocketFactory SSLContext.getServerSocketFactory()>
	//   19   35:invokespecial   #62  <Method void ConfigurableSSLServerSocketFactory(SSLParametersConfiguration, javax.net.ssl.SSLServerSocketFactory)>
	//   20   38:putfield        #20  <Field ServerSocketFactory socketFactory>
			super.start();
	//   21   41:aload_0         
	//   22   42:invokespecial   #64  <Method void AbstractServerSocketAppender.start()>
			return;
	//   23   45:return          
		}
		catch(Exception exception)
	//*  24   46:astore_1        
		{
			addError(exception.getMessage(), ((Throwable) (exception)));
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #68  <Method String Exception.getMessage()>
	//   28   52:aload_1         
	//   29   53:invokevirtual   #72  <Method void addError(String, Throwable)>
		}
	//   30   56:return          
	}

	private ServerSocketFactory socketFactory;
	private SSLConfiguration ssl;
}
