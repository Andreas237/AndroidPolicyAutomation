// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.server.*;
import java.util.concurrent.Executor;

// Referenced classes of package ch.qos.logback.classic.net.server:
//			RemoteAppenderClient

class RemoteAppenderServerRunner extends ConcurrentServerRunner
{

	public RemoteAppenderServerRunner(ServerListener serverlistener, Executor executor)
	{
		super(serverlistener, executor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #9   <Method void ConcurrentServerRunner(ServerListener, Executor)>
	//    4    6:return          
	}

	protected boolean configureClient(RemoteAppenderClient remoteappenderclient)
	{
		remoteappenderclient.setLoggerContext((LoggerContext)getContext());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #18  <Method ch.qos.logback.core.Context getContext()>
	//    3    5:checkcast       #20  <Class LoggerContext>
	//    4    8:invokeinterface #26  <Method void RemoteAppenderClient.setLoggerContext(LoggerContext)>
		return true;
	//    5   13:iconst_1        
	//    6   14:ireturn         
	}

	protected volatile boolean configureClient(Client client)
	{
		return configureClient((RemoteAppenderClient)client);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class RemoteAppenderClient>
	//    3    5:invokevirtual   #29  <Method boolean configureClient(RemoteAppenderClient)>
	//    4    8:ireturn         
	}
}
