// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ServerSocketFactory;

// Referenced classes of package ch.qos.logback.core.net.server:
//			ServerRunner, RemoteReceiverServerListener, RemoteReceiverServerRunner, ServerListener, 
//			ClientVisitor, RemoteReceiverClient, Client

public abstract class ServerSocketAppenderBase extends AppenderBase
{

	public ServerSocketAppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AppenderBase()>
		port = 4560;
	//    2    4:aload_0         
	//    3    5:sipush          4560
	//    4    8:putfield        #26  <Field int port>
		backlog = 50;
	//    5   11:aload_0         
	//    6   12:bipush          50
	//    7   14:putfield        #28  <Field int backlog>
		clientQueueSize = 100;
	//    8   17:aload_0         
	//    9   18:bipush          100
	//   10   20:putfield        #30  <Field int clientQueueSize>
	//   11   23:return          
	}

	protected void append(final Object serEvent)
	{
		if(serEvent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			postProcessEvent(serEvent);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method void postProcessEvent(Object)>
			serEvent = ((Object) (getPST().transform(serEvent)));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #40  <Method PreSerializationTransformer getPST()>
	//    8   14:aload_1         
	//    9   15:invokeinterface #46  <Method Serializable PreSerializationTransformer.transform(Object)>
	//   10   20:astore_1        
			runner.accept(new ClientVisitor() {

				public volatile void visit(Client client)
				{
					visit((RemoteReceiverClient)client);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #30  <Class RemoteReceiverClient>
				//    3    5:invokevirtual   #33  <Method void visit(RemoteReceiverClient)>
				//    4    8:return          
				}

				public void visit(RemoteReceiverClient remotereceiverclient)
				{
					remotereceiverclient.offer(serEvent);
				//    0    0:aload_1         
				//    1    1:aload_0         
				//    2    2:getfield        #22  <Field Serializable val$serEvent>
				//    3    5:invokeinterface #37  <Method boolean RemoteReceiverClient.offer(Serializable)>
				//    4   10:pop             
				//    5   11:return          
				}

				final ServerSocketAppenderBase this$0;
				final Serializable val$serEvent;

			
			{
				this$0 = ServerSocketAppenderBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ServerSocketAppenderBase this$0>
				serEvent = serializable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Serializable val$serEvent>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   11   21:aload_0         
	//   12   22:getfield        #48  <Field ServerRunner runner>
	//   13   25:new             #7   <Class ServerSocketAppenderBase$1>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokespecial   #51  <Method void ServerSocketAppenderBase$1(ServerSocketAppenderBase, Serializable)>
	//   18   34:invokeinterface #57  <Method void ServerRunner.accept(ClientVisitor)>
			return;
	//   19   39:return          
		}
	}

	protected ServerListener createServerListener(ServerSocket serversocket)
	{
		return ((ServerListener) (new RemoteReceiverServerListener(serversocket)));
	//    0    0:new             #63  <Class RemoteReceiverServerListener>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #66  <Method void RemoteReceiverServerListener(ServerSocket)>
	//    4    8:areturn         
	}

	protected ServerRunner createServerRunner(ServerListener serverlistener, Executor executor)
	{
		return ((ServerRunner) (new RemoteReceiverServerRunner(serverlistener, executor, getClientQueueSize())));
	//    0    0:new             #71  <Class RemoteReceiverServerRunner>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #75  <Method int getClientQueueSize()>
	//    6   10:invokespecial   #78  <Method void RemoteReceiverServerRunner(ServerListener, Executor, int)>
	//    7   13:areturn         
	}

	public String getAddress()
	{
		return address;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String address>
	//    2    4:areturn         
	}

	public Integer getBacklog()
	{
		return Integer.valueOf(backlog);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int backlog>
	//    2    4:invokestatic    #91  <Method Integer Integer.valueOf(int)>
	//    3    7:areturn         
	}

	public int getClientQueueSize()
	{
		return clientQueueSize;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int clientQueueSize>
	//    2    4:ireturn         
	}

	protected InetAddress getInetAddress()
	{
		if(getAddress() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #95  <Method String getAddress()>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return InetAddress.getByName(getAddress());
	//    5    9:aload_0         
	//    6   10:invokevirtual   #95  <Method String getAddress()>
	//    7   13:invokestatic    #101 <Method InetAddress InetAddress.getByName(String)>
	//    8   16:areturn         
	}

	protected abstract PreSerializationTransformer getPST();

	public int getPort()
	{
		return port;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int port>
	//    2    4:ireturn         
	}

	protected ServerSocketFactory getServerSocketFactory()
	{
		return ServerSocketFactory.getDefault();
	//    0    0:invokestatic    #109 <Method ServerSocketFactory ServerSocketFactory.getDefault()>
	//    1    3:areturn         
	}

	protected abstract void postProcessEvent(Object obj);

	public void setAddress(String s)
	{
		address = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field String address>
	//    3    5:return          
	}

	public void setBacklog(Integer integer)
	{
		backlog = integer.intValue();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method int Integer.intValue()>
	//    3    5:putfield        #28  <Field int backlog>
	//    4    8:return          
	}

	public void setClientQueueSize(int i)
	{
		clientQueueSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int clientQueueSize>
	//    3    5:return          
	}

	public void setPort(int i)
	{
		port = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int port>
	//    3    5:return          
	}

	public void start()
	{
		if(isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean isStarted()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			runner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog().intValue(), getInetAddress())), ((Executor) (getContext().getExecutorService())));
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #128 <Method ServerSocketFactory getServerSocketFactory()>
	//    9   15:aload_0         
	//   10   16:invokevirtual   #130 <Method int getPort()>
	//   11   19:aload_0         
	//   12   20:invokevirtual   #132 <Method Integer getBacklog()>
	//   13   23:invokevirtual   #116 <Method int Integer.intValue()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #134 <Method InetAddress getInetAddress()>
	//   16   30:invokevirtual   #138 <Method ServerSocket ServerSocketFactory.createServerSocket(int, int, InetAddress)>
	//   17   33:invokevirtual   #140 <Method ServerListener createServerListener(ServerSocket)>
	//   18   36:aload_0         
	//   19   37:invokevirtual   #144 <Method Context getContext()>
	//   20   40:invokeinterface #150 <Method ExecutorService Context.getExecutorService()>
	//   21   45:invokevirtual   #152 <Method ServerRunner createServerRunner(ServerListener, Executor)>
	//   22   48:putfield        #48  <Field ServerRunner runner>
			runner.setContext(getContext());
	//   23   51:aload_0         
	//   24   52:getfield        #48  <Field ServerRunner runner>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #144 <Method Context getContext()>
	//   27   59:invokeinterface #156 <Method void ServerRunner.setContext(Context)>
			getContext().getExecutorService().execute(((Runnable) (runner)));
	//   28   64:aload_0         
	//   29   65:invokevirtual   #144 <Method Context getContext()>
	//   30   68:invokeinterface #150 <Method ExecutorService Context.getExecutorService()>
	//   31   73:aload_0         
	//   32   74:getfield        #48  <Field ServerRunner runner>
	//   33   77:invokeinterface #162 <Method void ExecutorService.execute(Runnable)>
			super.start();
	//   34   82:aload_0         
	//   35   83:invokespecial   #164 <Method void AppenderBase.start()>
			return;
	//   36   86:return          
		}
		catch(Exception exception)
	//*  37   87:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   38   88:new             #166 <Class StringBuilder>
	//   39   91:dup             
	//   40   92:invokespecial   #167 <Method void StringBuilder()>
	//   41   95:astore_2        
			stringbuilder.append("server startup error: ");
	//   42   96:aload_2         
	//   43   97:ldc1            #169 <String "server startup error: ">
	//   44   99:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   45  102:pop             
			stringbuilder.append(((Object) (exception)));
	//   46  103:aload_2         
	//   47  104:aload_1         
	//   48  105:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   49  108:pop             
			addError(stringbuilder.toString(), ((Throwable) (exception)));
	//   50  109:aload_0         
	//   51  110:aload_2         
	//   52  111:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   53  114:aload_1         
	//   54  115:invokevirtual   #182 <Method void addError(String, Throwable)>
			return;
	//   55  118:return          
		}
	}

	public void stop()
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #126 <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		try
		{
			runner.stop();
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field ServerRunner runner>
	//    6   12:invokeinterface #187 <Method void ServerRunner.stop()>
			super.stop();
	//    7   17:aload_0         
	//    8   18:invokespecial   #188 <Method void AppenderBase.stop()>
			return;
	//    9   21:return          
		}
		catch(IOException ioexception)
	//*  10   22:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #166 <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #167 <Method void StringBuilder()>
	//   14   30:astore_2        
			stringbuilder.append("server shutdown error: ");
	//   15   31:aload_2         
	//   16   32:ldc1            #190 <String "server shutdown error: ">
	//   17   34:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(((Object) (ioexception)));
	//   19   38:aload_2         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   22   43:pop             
			addError(stringbuilder.toString(), ((Throwable) (ioexception)));
	//   23   44:aload_0         
	//   24   45:aload_2         
	//   25   46:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   26   49:aload_1         
	//   27   50:invokevirtual   #182 <Method void addError(String, Throwable)>
			return;
	//   28   53:return          
		}
	}

	public static final int DEFAULT_BACKLOG = 50;
	public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;
	private String address;
	private int backlog;
	private int clientQueueSize;
	private int port;
	private ServerRunner runner;
}
