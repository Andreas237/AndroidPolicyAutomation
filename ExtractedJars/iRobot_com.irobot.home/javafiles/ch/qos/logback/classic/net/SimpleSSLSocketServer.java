// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

// Referenced classes of package ch.qos.logback.classic.net:
//			SimpleSocketServer

public class SimpleSSLSocketServer extends SimpleSocketServer
{

	public SimpleSSLSocketServer(LoggerContext loggercontext, int i)
	{
		this(loggercontext, i, SSLContext.getDefault());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #14  <Method SSLContext SSLContext.getDefault()>
	//    4    6:invokespecial   #17  <Method void SimpleSSLSocketServer(LoggerContext, int, SSLContext)>
	//    5    9:return          
	}

	public SimpleSSLSocketServer(LoggerContext loggercontext, int i, SSLContext sslcontext)
	{
		super(loggercontext, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #20  <Method void SimpleSocketServer(LoggerContext, int)>
		if(sslcontext == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       20
		{
			throw new NullPointerException("SSL context required");
	//    6   10:new             #22  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:ldc1            #24  <String "SSL context required">
	//    9   16:invokespecial   #27  <Method void NullPointerException(String)>
	//   10   19:athrow          
		} else
		{
			SSLParametersConfiguration sslparametersconfiguration = new SSLParametersConfiguration();
	//   11   20:new             #29  <Class SSLParametersConfiguration>
	//   12   23:dup             
	//   13   24:invokespecial   #32  <Method void SSLParametersConfiguration()>
	//   14   27:astore          4
			sslparametersconfiguration.setContext(((ch.qos.logback.core.Context) (loggercontext)));
	//   15   29:aload           4
	//   16   31:aload_1         
	//   17   32:invokevirtual   #36  <Method void SSLParametersConfiguration.setContext(ch.qos.logback.core.Context)>
			socketFactory = ((ServerSocketFactory) (new ConfigurableSSLServerSocketFactory(sslparametersconfiguration, sslcontext.getServerSocketFactory())));
	//   18   35:aload_0         
	//   19   36:new             #38  <Class ConfigurableSSLServerSocketFactory>
	//   20   39:dup             
	//   21   40:aload           4
	//   22   42:aload_3         
	//   23   43:invokevirtual   #42  <Method javax.net.ssl.SSLServerSocketFactory SSLContext.getServerSocketFactory()>
	//   24   46:invokespecial   #45  <Method void ConfigurableSSLServerSocketFactory(SSLParametersConfiguration, javax.net.ssl.SSLServerSocketFactory)>
	//   25   49:putfield        #47  <Field ServerSocketFactory socketFactory>
			return;
	//   26   52:return          
		}
	}

	public static void main(String args[])
	{
		doMain(ch/qos/logback/classic/net/SimpleSSLSocketServer, args);
	//    0    0:ldc1            #2   <Class SimpleSSLSocketServer>
	//    1    2:aload_0         
	//    2    3:invokestatic    #53  <Method void doMain(Class, String[])>
	//    3    6:return          
	}

	protected ServerSocketFactory getServerSocketFactory()
	{
		return socketFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ServerSocketFactory socketFactory>
	//    2    4:areturn         
	}

	private final ServerSocketFactory socketFactory;
}
