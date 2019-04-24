// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;

import java.io.Serializable;

// Referenced classes of package ch.qos.logback.core.net.server:
//			ClientVisitor, ServerSocketAppenderBase, RemoteReceiverClient, Client

class ServerSocketAppenderBase$1
	implements ClientVisitor
{

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
		remotereceiverclient.offer(val$serEvent);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Serializable val$serEvent>
	//    3    5:invokeinterface #37  <Method boolean RemoteReceiverClient.offer(Serializable)>
	//    4   10:pop             
	//    5   11:return          
	}

	final ServerSocketAppenderBase this$0;
	final Serializable val$serEvent;

	ServerSocketAppenderBase$1()
	{
		this$0 = final_serversocketappenderbase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ServerSocketAppenderBase this$0>
		val$serEvent = Serializable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Serializable val$serEvent>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
