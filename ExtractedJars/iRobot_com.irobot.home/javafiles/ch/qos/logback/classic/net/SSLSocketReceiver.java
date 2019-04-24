// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.core.net.ssl.*;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

// Referenced classes of package ch.qos.logback.classic.net:
//			SocketReceiver

public class SSLSocketReceiver extends SocketReceiver
	implements SSLComponent
{

	public SSLSocketReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void SocketReceiver()>
	//    2    4:return          
	}

	protected SocketFactory getSocketFactory()
	{
		return socketFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field SocketFactory socketFactory>
	//    2    4:areturn         
	}

	public SSLConfiguration getSsl()
	{
		if(ssl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SSLConfiguration ssl>
	//*   2    4:ifnonnull       18
			ssl = new SSLConfiguration();
	//    3    7:aload_0         
	//    4    8:new             #25  <Class SSLConfiguration>
	//    5   11:dup             
	//    6   12:invokespecial   #26  <Method void SSLConfiguration()>
	//    7   15:putfield        #23  <Field SSLConfiguration ssl>
		return ssl;
	//    8   18:aload_0         
	//    9   19:getfield        #23  <Field SSLConfiguration ssl>
	//   10   22:areturn         
	}

	public void setSsl(SSLConfiguration sslconfiguration)
	{
		ssl = sslconfiguration;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field SSLConfiguration ssl>
	//    3    5:return          
	}

	protected boolean shouldStart()
	{
		boolean flag;
		try
		{
			SSLContext sslcontext = getSsl().createContext(((ch.qos.logback.core.spi.ContextAware) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method SSLConfiguration getSsl()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #38  <Method SSLContext SSLConfiguration.createContext(ch.qos.logback.core.spi.ContextAware)>
	//    4    8:astore_2        
			SSLParametersConfiguration sslparametersconfiguration = getSsl().getParameters();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #34  <Method SSLConfiguration getSsl()>
	//    7   13:invokevirtual   #42  <Method SSLParametersConfiguration SSLConfiguration.getParameters()>
	//    8   16:astore_3        
			sslparametersconfiguration.setContext(getContext());
	//    9   17:aload_3         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #46  <Method ch.qos.logback.core.Context getContext()>
	//   12   22:invokevirtual   #52  <Method void SSLParametersConfiguration.setContext(ch.qos.logback.core.Context)>
			socketFactory = ((SocketFactory) (new ConfigurableSSLSocketFactory(sslparametersconfiguration, sslcontext.getSocketFactory())));
	//   13   25:aload_0         
	//   14   26:new             #54  <Class ConfigurableSSLSocketFactory>
	//   15   29:dup             
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #59  <Method javax.net.ssl.SSLSocketFactory SSLContext.getSocketFactory()>
	//   19   35:invokespecial   #62  <Method void ConfigurableSSLSocketFactory(SSLParametersConfiguration, javax.net.ssl.SSLSocketFactory)>
	//   20   38:putfield        #19  <Field SocketFactory socketFactory>
			flag = super.shouldStart();
	//   21   41:aload_0         
	//   22   42:invokespecial   #64  <Method boolean SocketReceiver.shouldStart()>
	//   23   45:istore_1        
		}
	//*  24   46:iload_1         
	//*  25   47:ireturn         
		catch(Exception exception)
	//*  26   48:astore_2        
		{
			addError(exception.getMessage(), ((Throwable) (exception)));
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:invokevirtual   #68  <Method String Exception.getMessage()>
	//   30   54:aload_2         
	//   31   55:invokevirtual   #72  <Method void addError(String, Throwable)>
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
		return flag;
	}

	private SocketFactory socketFactory;
	private SSLConfiguration ssl;
}
