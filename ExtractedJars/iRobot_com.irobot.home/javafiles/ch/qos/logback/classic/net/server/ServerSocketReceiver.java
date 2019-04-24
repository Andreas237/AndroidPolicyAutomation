// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.net.server.ServerListener;
import ch.qos.logback.core.net.server.ServerRunner;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

// Referenced classes of package ch.qos.logback.classic.net.server:
//			RemoteAppenderServerListener, RemoteAppenderServerRunner

public class ServerSocketReceiver extends ReceiverBase
{

	public ServerSocketReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ReceiverBase()>
		port = 4560;
	//    2    4:aload_0         
	//    3    5:sipush          4560
	//    4    8:putfield        #21  <Field int port>
		backlog = 50;
	//    5   11:aload_0         
	//    6   12:bipush          50
	//    7   14:putfield        #23  <Field int backlog>
	//    8   17:return          
	}

	protected ServerListener createServerListener(ServerSocket serversocket)
	{
		return ((ServerListener) (new RemoteAppenderServerListener(serversocket)));
	//    0    0:new             #28  <Class RemoteAppenderServerListener>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #31  <Method void RemoteAppenderServerListener(ServerSocket)>
	//    4    8:areturn         
	}

	protected ServerRunner createServerRunner(ServerListener serverlistener, Executor executor)
	{
		return ((ServerRunner) (new RemoteAppenderServerRunner(serverlistener, executor)));
	//    0    0:new             #37  <Class RemoteAppenderServerRunner>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #40  <Method void RemoteAppenderServerRunner(ServerListener, Executor)>
	//    5    9:areturn         
	}

	public String getAddress()
	{
		return address;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String address>
	//    2    4:areturn         
	}

	public int getBacklog()
	{
		return backlog;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int backlog>
	//    2    4:ireturn         
	}

	protected InetAddress getInetAddress()
	{
		if(getAddress() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #51  <Method String getAddress()>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return InetAddress.getByName(getAddress());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #51  <Method String getAddress()>
	//    7   13:invokestatic    #57  <Method InetAddress InetAddress.getByName(String)>
	//    8   16:areturn         
	}

	public int getPort()
	{
		return port;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int port>
	//    2    4:ireturn         
	}

	protected Runnable getRunnableTask()
	{
		return ((Runnable) (runner));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field ServerRunner runner>
	//    2    4:areturn         
	}

	protected ServerSocketFactory getServerSocketFactory()
	{
		return ServerSocketFactory.getDefault();
	//    0    0:invokestatic    #69  <Method ServerSocketFactory ServerSocketFactory.getDefault()>
	//    1    3:areturn         
	}

	protected void onStop()
	{
		try
		{
			if(runner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field ServerRunner runner>
	//*   2    4:ifnonnull       8
				return;
	//    3    7:return          
		}
	//*   4    8:aload_0         
	//*   5    9:getfield        #62  <Field ServerRunner runner>
	//*   6   12:invokeinterface #77  <Method void ServerRunner.stop()>
	//*   7   17:return          
		catch(IOException ioexception)
	//*   8   18:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   19:new             #79  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #80  <Method void StringBuilder()>
	//   12   26:astore_2        
			stringbuilder.append("server shutdown error: ");
	//   13   27:aload_2         
	//   14   28:ldc1            #82  <String "server shutdown error: ">
	//   15   30:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			stringbuilder.append(((Object) (ioexception)));
	//   17   34:aload_2         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #89  <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
			addError(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   21   40:aload_0         
	//   22   41:aload_2         
	//   23   42:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   24   45:aload_1         
	//   25   46:invokevirtual   #96  <Method void addError(String, Throwable)>
			return;
	//   26   49:return          
		}
		runner.stop();
		return;
	}

	public void setAddress(String s)
	{
		address = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field String address>
	//    3    5:return          
	}

	public void setBacklog(int i)
	{
		backlog = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #23  <Field int backlog>
	//    3    5:return          
	}

	public void setPort(int i)
	{
		port = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int port>
	//    3    5:return          
	}

	protected boolean shouldStart()
	{
		try
		{
			runner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog(), getInetAddress())), ((Executor) (getContext().getExecutorService())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #107 <Method ServerSocketFactory getServerSocketFactory()>
	//    5    7:aload_0         
	//    6    8:invokevirtual   #109 <Method int getPort()>
	//    7   11:aload_0         
	//    8   12:invokevirtual   #111 <Method int getBacklog()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #113 <Method InetAddress getInetAddress()>
	//   11   19:invokevirtual   #117 <Method ServerSocket ServerSocketFactory.createServerSocket(int, int, InetAddress)>
	//   12   22:invokevirtual   #119 <Method ServerListener createServerListener(ServerSocket)>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #123 <Method Context getContext()>
	//   15   29:invokeinterface #129 <Method java.util.concurrent.ExecutorService Context.getExecutorService()>
	//   16   34:invokevirtual   #131 <Method ServerRunner createServerRunner(ServerListener, Executor)>
	//   17   37:putfield        #62  <Field ServerRunner runner>
			runner.setContext(getContext());
	//   18   40:aload_0         
	//   19   41:getfield        #62  <Field ServerRunner runner>
	//   20   44:aload_0         
	//   21   45:invokevirtual   #123 <Method Context getContext()>
	//   22   48:invokeinterface #135 <Method void ServerRunner.setContext(Context)>
		}
	//*  23   53:iconst_1        
	//*  24   54:ireturn         
		catch(Exception exception)
	//*  25   55:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   26   56:new             #79  <Class StringBuilder>
	//   27   59:dup             
	//   28   60:invokespecial   #80  <Method void StringBuilder()>
	//   29   63:astore_2        
			stringbuilder.append("server startup error: ");
	//   30   64:aload_2         
	//   31   65:ldc1            #137 <String "server startup error: ">
	//   32   67:invokevirtual   #86  <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
			stringbuilder.append(((Object) (exception)));
	//   34   71:aload_2         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #89  <Method StringBuilder StringBuilder.append(Object)>
	//   37   76:pop             
			addError(stringbuilder.toString(), ((Throwable) (exception)));
	//   38   77:aload_0         
	//   39   78:aload_2         
	//   40   79:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   41   82:aload_1         
	//   42   83:invokevirtual   #96  <Method void addError(String, Throwable)>
			CloseUtil.closeQuietly(serverSocket);
	//   43   86:aload_0         
	//   44   87:getfield        #139 <Field ServerSocket serverSocket>
	//   45   90:invokestatic    #144 <Method void CloseUtil.closeQuietly(ServerSocket)>
			return false;
	//   46   93:iconst_0        
	//   47   94:ireturn         
		}
		return true;
	}

	public static final int DEFAULT_BACKLOG = 50;
	private String address;
	private int backlog;
	private int port;
	private ServerRunner runner;
	private ServerSocket serverSocket;
}
