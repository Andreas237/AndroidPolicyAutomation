// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net.server;


// Referenced classes of package ch.qos.logback.core.net.server:
//			Client, ConcurrentServerRunner

private class ConcurrentServerRunner$ClientWrapper
	implements Client
{

	public void close()
	{
		_flddelegate.close();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Client _flddelegate>
	//    2    4:invokeinterface #29  <Method void Client.close()>
	//    3    9:return          
	}

	public void run()
	{
		ConcurrentServerRunner.access$000(ConcurrentServerRunner.this, _flddelegate);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ConcurrentServerRunner this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Client _flddelegate>
	//    4    8:invokestatic    #33  <Method void ConcurrentServerRunner.access$000(ConcurrentServerRunner, Client)>
		_flddelegate.run();
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field Client _flddelegate>
	//    7   15:invokeinterface #35  <Method void Client.run()>
		ConcurrentServerRunner.access$100(ConcurrentServerRunner.this, _flddelegate);
	//    8   20:aload_0         
	//    9   21:getfield        #18  <Field ConcurrentServerRunner this$0>
	//   10   24:aload_0         
	//   11   25:getfield        #23  <Field Client _flddelegate>
	//   12   28:invokestatic    #38  <Method void ConcurrentServerRunner.access$100(ConcurrentServerRunner, Client)>
		return;
	//   13   31:return          
		Exception exception;
		exception;
	//   14   32:astore_1        
		ConcurrentServerRunner.access$100(ConcurrentServerRunner.this, _flddelegate);
	//   15   33:aload_0         
	//   16   34:getfield        #18  <Field ConcurrentServerRunner this$0>
	//   17   37:aload_0         
	//   18   38:getfield        #23  <Field Client _flddelegate>
	//   19   41:invokestatic    #38  <Method void ConcurrentServerRunner.access$100(ConcurrentServerRunner, Client)>
		throw exception;
	//   20   44:aload_1         
	//   21   45:athrow          
	}

	private final Client _flddelegate;
	final ConcurrentServerRunner this$0;

	public ConcurrentServerRunner$ClientWrapper(Client client)
	{
		this$0 = ConcurrentServerRunner.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ConcurrentServerRunner this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		_flddelegate = client;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Client _flddelegate>
	//    8   14:return          
	}
}
