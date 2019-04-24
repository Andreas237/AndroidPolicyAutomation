// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import ch.qos.logback.core.net.ssl.ConfigurableSSLSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

// Referenced classes of package ch.qos.logback.core.net:
//			AbstractSocketAppender

public abstract class AbstractSSLSocketAppender extends AbstractSocketAppender
	implements SSLComponent
{

	protected AbstractSSLSocketAppender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AbstractSocketAppender()>
	//    2    4:return          
	}

	protected AbstractSSLSocketAppender(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #20  <Method void AbstractSocketAppender(String, int)>
	//    4    6:return          
	}

	protected SocketFactory getSocketFactory()
	{
		return socketFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field SocketFactory socketFactory>
	//    2    4:areturn         
	}

	public SSLConfiguration getSsl()
	{
		if(ssl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field SSLConfiguration ssl>
	//*   2    4:ifnonnull       18
			ssl = new SSLConfiguration();
	//    3    7:aload_0         
	//    4    8:new             #31  <Class SSLConfiguration>
	//    5   11:dup             
	//    6   12:invokespecial   #32  <Method void SSLConfiguration()>
	//    7   15:putfield        #29  <Field SSLConfiguration ssl>
		return ssl;
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field SSLConfiguration ssl>
	//   10   22:areturn         
	}

	public void setSsl(SSLConfiguration sslconfiguration)
	{
		ssl = sslconfiguration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field SSLConfiguration ssl>
	//    3    5:return          
	}

	public void start()
	{
		try
		{
			SSLContext sslcontext = getSsl().createContext(((ch.qos.logback.core.spi.ContextAware) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method SSLConfiguration getSsl()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #43  <Method SSLContext SSLConfiguration.createContext(ch.qos.logback.core.spi.ContextAware)>
	//    4    8:astore_1        
			SSLParametersConfiguration sslparametersconfiguration = getSsl().getParameters();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #39  <Method SSLConfiguration getSsl()>
	//    7   13:invokevirtual   #47  <Method SSLParametersConfiguration SSLConfiguration.getParameters()>
	//    8   16:astore_2        
			sslparametersconfiguration.setContext(getContext());
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #51  <Method ch.qos.logback.core.Context getContext()>
	//   12   22:invokevirtual   #57  <Method void SSLParametersConfiguration.setContext(ch.qos.logback.core.Context)>
			socketFactory = ((SocketFactory) (new ConfigurableSSLSocketFactory(sslparametersconfiguration, sslcontext.getSocketFactory())));
	//   13   25:aload_0         
	//   14   26:new             #59  <Class ConfigurableSSLSocketFactory>
	//   15   29:dup             
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #64  <Method javax.net.ssl.SSLSocketFactory SSLContext.getSocketFactory()>
	//   19   35:invokespecial   #67  <Method void ConfigurableSSLSocketFactory(SSLParametersConfiguration, javax.net.ssl.SSLSocketFactory)>
	//   20   38:putfield        #25  <Field SocketFactory socketFactory>
			super.start();
	//   21   41:aload_0         
	//   22   42:invokespecial   #69  <Method void AbstractSocketAppender.start()>
			return;
	//   23   45:return          
		}
		catch(Exception exception)
	//*  24   46:astore_1        
		{
			addError(exception.getMessage(), ((Throwable) (exception)));
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #73  <Method String Exception.getMessage()>
	//   28   52:aload_1         
	//   29   53:invokevirtual   #77  <Method void addError(String, Throwable)>
		}
	//   30   56:return          
	}

	private SocketFactory socketFactory;
	private SSLConfiguration ssl;
}
