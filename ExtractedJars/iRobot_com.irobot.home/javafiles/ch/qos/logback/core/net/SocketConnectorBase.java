// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;
import javax.net.SocketFactory;

// Referenced classes of package ch.qos.logback.core.net:
//			SocketConnector

public class SocketConnectorBase
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

	public static interface DelayStrategy
	{

		public abstract int nextDelay();
	}

	private static class FixedDelay
		implements DelayStrategy
	{

		public int nextDelay()
		{
			int i = nextDelay;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int nextDelay>
		//    2    4:istore_1        
			nextDelay = retryDelay;
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #21  <Field int retryDelay>
		//    6   10:putfield        #19  <Field int nextDelay>
			return i;
		//    7   13:iload_1         
		//    8   14:ireturn         
		}

		private int nextDelay;
		private final int retryDelay;

		public FixedDelay(int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			nextDelay = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int nextDelay>
			retryDelay = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int retryDelay>
		//    8   14:return          
		}
	}


	public SocketConnectorBase(InetAddress inetaddress, int i, int j, int k)
	{
		this(inetaddress, i, ((DelayStrategy) (new FixedDelay(j, k))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:new             #16  <Class SocketConnectorBase$FixedDelay>
	//    4    6:dup             
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #38  <Method void SocketConnectorBase$FixedDelay(int, int)>
	//    8   13:invokespecial   #41  <Method void SocketConnectorBase(InetAddress, int, SocketConnectorBase$DelayStrategy)>
	//    9   16:return          
	}

	public SocketConnectorBase(InetAddress inetaddress, int i, DelayStrategy delaystrategy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		lock = ((Lock) (new ReentrantLock()));
	//    2    4:aload_0         
	//    3    5:new             #47  <Class ReentrantLock>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void ReentrantLock()>
	//    6   12:putfield        #50  <Field Lock lock>
		connectCondition = lock.newCondition();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #50  <Field Lock lock>
	//   10   20:invokeinterface #56  <Method Condition Lock.newCondition()>
	//   11   25:putfield        #58  <Field Condition connectCondition>
		address = inetaddress;
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:putfield        #60  <Field InetAddress address>
		port = i;
	//   15   33:aload_0         
	//   16   34:iload_2         
	//   17   35:putfield        #62  <Field int port>
		delayStrategy = delaystrategy;
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:putfield        #64  <Field SocketConnectorBase$DelayStrategy delayStrategy>
	//   21   43:return          
	}

	private void signalConnected()
	{
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Lock lock>
	//    2    4:invokeinterface #67  <Method void Lock.lock()>
		connectCondition.signalAll();
	//    3    9:aload_0         
	//    4   10:getfield        #58  <Field Condition connectCondition>
	//    5   13:invokeinterface #72  <Method void Condition.signalAll()>
		lock.unlock();
	//    6   18:aload_0         
	//    7   19:getfield        #50  <Field Lock lock>
	//    8   22:invokeinterface #75  <Method void Lock.unlock()>
		return;
	//    9   27:return          
		Exception exception;
		exception;
	//   10   28:astore_1        
		lock.unlock();
	//   11   29:aload_0         
	//   12   30:getfield        #50  <Field Lock lock>
	//   13   33:invokeinterface #75  <Method void Lock.unlock()>
		throw exception;
	//   14   38:aload_1         
	//   15   39:athrow          
	}

	public Socket awaitConnection()
	{
		return awaitConnection(0xffffffffL);
	//    0    0:aload_0         
	//    1    1:ldc2w           #78  <Long 0xffffffffL>
	//    2    4:invokevirtual   #82  <Method Socket awaitConnection(long)>
	//    3    7:areturn         
	}

	public Socket awaitConnection(long l)
	{
		boolean flag;
		lock.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field Lock lock>
	//    2    4:invokeinterface #67  <Method void Lock.lock()>
		flag = false;
	//    3    9:iconst_0        
	//    4   10:istore_3        
_L1:
		if(socket != null || flag)
			break MISSING_BLOCK_LABEL_41;
	//    5   11:aload_0         
	//    6   12:getfield        #84  <Field Socket socket>
	//    7   15:ifnonnull       41
	//    8   18:iload_3         
	//    9   19:ifne            41
		flag = connectCondition.await(l, TimeUnit.MILLISECONDS) ^ true;
	//   10   22:aload_0         
	//   11   23:getfield        #58  <Field Condition connectCondition>
	//   12   26:lload_1         
	//   13   27:getstatic       #90  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   14   30:invokeinterface #94  <Method boolean Condition.await(long, TimeUnit)>
	//   15   35:iconst_1        
	//   16   36:ixor            
	//   17   37:istore_3        
		  goto _L1
	//*  18   38:goto            11
		Socket socket1 = socket;
	//   19   41:aload_0         
	//   20   42:getfield        #84  <Field Socket socket>
	//   21   45:astore          4
		lock.unlock();
	//   22   47:aload_0         
	//   23   48:getfield        #50  <Field Lock lock>
	//   24   51:invokeinterface #75  <Method void Lock.unlock()>
		return socket1;
	//   25   56:aload           4
	//   26   58:areturn         
		Exception exception;
		exception;
	//   27   59:astore          4
		lock.unlock();
	//   28   61:aload_0         
	//   29   62:getfield        #50  <Field Lock lock>
	//   30   65:invokeinterface #75  <Method void Lock.unlock()>
		throw exception;
	//   31   70:aload           4
	//   32   72:athrow          
	}

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method Socket call()>
	//    2    4:areturn         
	}

	public Socket call()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void run()
	{
		if(socket != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Socket socket>
	//*   2    4:ifnull          17
			throw new IllegalStateException("connector cannot be reused");
	//    3    7:new             #105 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #107 <String "connector cannot be reused">
	//    6   13:invokespecial   #110 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(exceptionHandler == null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #112 <Field SocketConnector$ExceptionHandler exceptionHandler>
	//*  10   21:ifnonnull       36
			exceptionHandler = ((SocketConnector.ExceptionHandler) (new ConsoleExceptionHandler()));
	//   11   24:aload_0         
	//   12   25:new             #10  <Class SocketConnectorBase$ConsoleExceptionHandler>
	//   13   28:dup             
	//   14   29:aconst_null     
	//   15   30:invokespecial   #115 <Method void SocketConnectorBase$ConsoleExceptionHandler(SocketConnectorBase$1)>
	//   16   33:putfield        #112 <Field SocketConnector$ExceptionHandler exceptionHandler>
		if(socketFactory == null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #117 <Field SocketFactory socketFactory>
	//*  19   40:ifnonnull       50
			socketFactory = SocketFactory.getDefault();
	//   20   43:aload_0         
	//   21   44:invokestatic    #123 <Method SocketFactory SocketFactory.getDefault()>
	//   22   47:putfield        #117 <Field SocketFactory socketFactory>
_L1:
		if(Thread.currentThread().isInterrupted())
			break MISSING_BLOCK_LABEL_123;
	//   23   50:invokestatic    #129 <Method Thread Thread.currentThread()>
	//   24   53:invokevirtual   #133 <Method boolean Thread.isInterrupted()>
	//   25   56:ifne            123
		Thread.sleep(delayStrategy.nextDelay());
	//   26   59:aload_0         
	//   27   60:getfield        #64  <Field SocketConnectorBase$DelayStrategy delayStrategy>
	//   28   63:invokeinterface #137 <Method int SocketConnectorBase$DelayStrategy.nextDelay()>
	//   29   68:i2l             
	//   30   69:invokestatic    #141 <Method void Thread.sleep(long)>
		socket = socketFactory.createSocket(address, port);
	//   31   72:aload_0         
	//   32   73:aload_0         
	//   33   74:getfield        #117 <Field SocketFactory socketFactory>
	//   34   77:aload_0         
	//   35   78:getfield        #60  <Field InetAddress address>
	//   36   81:aload_0         
	//   37   82:getfield        #62  <Field int port>
	//   38   85:invokevirtual   #145 <Method Socket SocketFactory.createSocket(InetAddress, int)>
	//   39   88:putfield        #84  <Field Socket socket>
		signalConnected();
	//   40   91:aload_0         
	//   41   92:invokespecial   #147 <Method void signalConnected()>
		return;
	//   42   95:return          
		Object obj;
		obj;
	//   43   96:astore_1        
		exceptionHandler.connectionFailed(((SocketConnector) (this)), ((Exception) (obj)));
	//   44   97:aload_0         
	//   45   98:getfield        #112 <Field SocketConnector$ExceptionHandler exceptionHandler>
	//   46  101:aload_0         
	//   47  102:aload_1         
	//   48  103:invokeinterface #153 <Method void SocketConnector$ExceptionHandler.connectionFailed(SocketConnector, Exception)>
		  goto _L1
	//*  49  108:goto            50
		obj;
	//   50  111:astore_1        
		exceptionHandler.connectionFailed(((SocketConnector) (this)), ((Exception) (obj)));
	//   51  112:aload_0         
	//   52  113:getfield        #112 <Field SocketConnector$ExceptionHandler exceptionHandler>
	//   53  116:aload_0         
	//   54  117:aload_1         
	//   55  118:invokeinterface #153 <Method void SocketConnector$ExceptionHandler.connectionFailed(SocketConnector, Exception)>
	//   56  123:return          
	}

	public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionhandler)
	{
		exceptionHandler = exceptionhandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field SocketConnector$ExceptionHandler exceptionHandler>
	//    3    5:return          
	}

	public void setSocketFactory(SocketFactory socketfactory)
	{
		socketFactory = socketfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field SocketFactory socketFactory>
	//    3    5:return          
	}

	private final InetAddress address;
	private final Condition connectCondition;
	private DelayStrategy delayStrategy;
	private SocketConnector.ExceptionHandler exceptionHandler;
	private final Lock lock;
	private final int port;
	private Socket socket;
	private SocketFactory socketFactory;
}
