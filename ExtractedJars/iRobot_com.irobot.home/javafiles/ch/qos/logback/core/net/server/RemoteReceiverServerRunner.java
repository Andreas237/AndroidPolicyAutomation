// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

// Referenced classes of package ch.qos.logback.core.net.server:
//			ConcurrentServerRunner, RemoteReceiverClient, ServerListener, Client

class RemoteReceiverServerRunner extends ConcurrentServerRunner
{

	public RemoteReceiverServerRunner(ServerListener serverlistener, Executor executor, int i)
	{
		super(serverlistener, executor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void ConcurrentServerRunner(ServerListener, Executor)>
		clientQueueSize = i;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #14  <Field int clientQueueSize>
	//    7   11:return          
	}

	protected volatile boolean configureClient(Client client)
	{
		return configureClient((RemoteReceiverClient)client);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class RemoteReceiverClient>
	//    3    5:invokevirtual   #24  <Method boolean configureClient(RemoteReceiverClient)>
	//    4    8:ireturn         
	}

	protected boolean configureClient(RemoteReceiverClient remotereceiverclient)
	{
		remotereceiverclient.setContext(getContext());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #28  <Method ch.qos.logback.core.Context getContext()>
	//    3    5:invokeinterface #32  <Method void RemoteReceiverClient.setContext(ch.qos.logback.core.Context)>
		remotereceiverclient.setQueue(((java.util.concurrent.BlockingQueue) (new ArrayBlockingQueue(clientQueueSize))));
	//    4   10:aload_1         
	//    5   11:new             #34  <Class ArrayBlockingQueue>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #14  <Field int clientQueueSize>
	//    9   19:invokespecial   #37  <Method void ArrayBlockingQueue(int)>
	//   10   22:invokeinterface #41  <Method void RemoteReceiverClient.setQueue(java.util.concurrent.BlockingQueue)>
		return true;
	//   11   27:iconst_1        
	//   12   28:ireturn         
	}

	private final int clientQueueSize;
}
