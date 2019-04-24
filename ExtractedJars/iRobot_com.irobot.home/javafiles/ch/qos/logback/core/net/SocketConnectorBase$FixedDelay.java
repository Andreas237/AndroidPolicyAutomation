// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;


// Referenced classes of package ch.qos.logback.core.net:
//			SocketConnectorBase

private static class SocketConnectorBase$FixedDelay
	implements gy
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

	public SocketConnectorBase$FixedDelay(int i, int j)
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
