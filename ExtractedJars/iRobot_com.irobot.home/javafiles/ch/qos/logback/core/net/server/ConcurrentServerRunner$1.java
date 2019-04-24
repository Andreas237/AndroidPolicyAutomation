// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;


// Referenced classes of package ch.qos.logback.core.net.server:
//			ClientVisitor, ConcurrentServerRunner, Client

class ConcurrentServerRunner$1
	implements ClientVisitor
{

	public void visit(Client client)
	{
		client.close();
	//    0    0:aload_1         
	//    1    1:invokeinterface #28  <Method void Client.close()>
	//    2    6:return          
	}

	final ConcurrentServerRunner this$0;

	ConcurrentServerRunner$1()
	{
		this$0 = ConcurrentServerRunner.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ConcurrentServerRunner this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
