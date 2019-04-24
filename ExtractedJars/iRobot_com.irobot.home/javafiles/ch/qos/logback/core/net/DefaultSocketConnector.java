// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import ch.qos.logback.core.util.DelayStrategy;
import ch.qos.logback.core.util.FixedDelay;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

// Referenced classes of package ch.qos.logback.core.net:
//			SocketConnector

public class DefaultSocketConnector
	implements SocketConnector
{
	private static class ConsoleExceptionHandler
		implements SocketConnector.ExceptionHandler
	{

		public void connectionFailed(SocketConnector socketconnector, Exception exception)
		{
			System.out.println(((Object) (exception)));
		//    0    0:getstatic       #24  <Field PrintStream System.out>
		//    1    3:aload_2         
		//    2    4:invokevirtual   #30  <Method void PrintStream.println(Object)>
		//    3    7:return          
		}

		private ConsoleExceptionHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public DefaultSocketConnector(InetAddress inetaddress, int i, long l, long l1)
	{
		this(inetaddress, i, ((DelayStrategy) (new FixedDelay(l, l1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:new             #25  <Class FixedDelay>
	//    4    6:dup             
	//    5    7:lload_3         
	//    6    8:lload           5
	//    7   10:invokespecial   #28  <Method void FixedDelay(long, long)>
	//    8   13:invokespecial   #31  <Method void DefaultSocketConnector(InetAddress, int, DelayStrategy)>
	//    9   16:return          
	}

	public DefaultSocketConnector(InetAddress inetaddress, int i, DelayStrategy delaystrategy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		address = inetaddress;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field InetAddress address>
		port = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #39  <Field int port>
		delayStrategy = delaystrategy;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field DelayStrategy delayStrategy>
	//   11   19:return          
	}

	private Socket createSocket()
	{
		Socket socket;
		try
		{
			socket = socketFactory.createSocket(address, port);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field SocketFactory socketFactory>
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field InetAddress address>
	//    4    8:aload_0         
	//    5    9:getfield        #39  <Field int port>
	//    6   12:invokevirtual   #52  <Method Socket SocketFactory.createSocket(InetAddress, int)>
	//    7   15:astore_1        
		}
	//*   8   16:aload_1         
	//*   9   17:areturn         
		catch(IOException ioexception)
	//*  10   18:astore_1        
		{
			exceptionHandler.connectionFailed(((SocketConnector) (this)), ((Exception) (ioexception)));
	//   11   19:aload_0         
	//   12   20:getfield        #54  <Field SocketConnector$ExceptionHandler exceptionHandler>
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokeinterface #60  <Method void SocketConnector$ExceptionHandler.connectionFailed(SocketConnector, Exception)>
			return null;
	//   16   30:aconst_null     
	//   17   31:areturn         
		}
		return socket;
	}

	private void useDefaultsForMissingFields()
	{
		if(exceptionHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field SocketConnector$ExceptionHandler exceptionHandler>
	//*   2    4:ifnonnull       19
			exceptionHandler = ((SocketConnector.ExceptionHandler) (new ConsoleExceptionHandler()));
	//    3    7:aload_0         
	//    4    8:new             #10  <Class DefaultSocketConnector$ConsoleExceptionHandler>
	//    5   11:dup             
	//    6   12:aconst_null     
	//    7   13:invokespecial   #64  <Method void DefaultSocketConnector$ConsoleExceptionHandler(DefaultSocketConnector$1)>
	//    8   16:putfield        #54  <Field SocketConnector$ExceptionHandler exceptionHandler>
		if(socketFactory == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #47  <Field SocketFactory socketFactory>
	//*  11   23:ifnonnull       33
			socketFactory = SocketFactory.getDefault();
	//   12   26:aload_0         
	//   13   27:invokestatic    #68  <Method SocketFactory SocketFactory.getDefault()>
	//   14   30:putfield        #47  <Field SocketFactory socketFactory>
	//   15   33:return          
	}

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method Socket call()>
	//    2    4:areturn         
	}

	public Socket call()
	{
		useDefaultsForMissingFields();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void useDefaultsForMissingFields()>
		do
		{
			Socket socket = createSocket();
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method Socket createSocket()>
	//    4    8:astore_1        
			if(socket == null && !Thread.currentThread().isInterrupted())
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       37
	//*   7   13:invokestatic    #82  <Method Thread Thread.currentThread()>
	//*   8   16:invokevirtual   #86  <Method boolean Thread.isInterrupted()>
	//*   9   19:ifne            37
				Thread.sleep(delayStrategy.nextDelay());
	//   10   22:aload_0         
	//   11   23:getfield        #41  <Field DelayStrategy delayStrategy>
	//   12   26:invokeinterface #92  <Method long DelayStrategy.nextDelay()>
	//   13   31:invokestatic    #96  <Method void Thread.sleep(long)>
			else
	//*  14   34:goto            4
				return socket;
	//   15   37:aload_1         
	//   16   38:areturn         
		} while(true);
	}

	public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionhandler)
	{
		exceptionHandler = exceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field SocketConnector$ExceptionHandler exceptionHandler>
	//    3    5:return          
	}

	public void setSocketFactory(SocketFactory socketfactory)
	{
		socketFactory = socketfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field SocketFactory socketFactory>
	//    3    5:return          
	}

	private final InetAddress address;
	private final DelayStrategy delayStrategy;
	private SocketConnector.ExceptionHandler exceptionHandler;
	private final int port;
	private SocketFactory socketFactory;
}
