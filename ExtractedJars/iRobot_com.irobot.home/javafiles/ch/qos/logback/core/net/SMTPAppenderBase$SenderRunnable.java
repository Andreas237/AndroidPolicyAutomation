// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.net;

import ch.qos.logback.core.helpers.CyclicBuffer;

// Referenced classes of package ch.qos.logback.core.net:
//			SMTPAppenderBase

class SMTPAppenderBase$SenderRunnable
	implements Runnable
{

	public void run()
	{
		sendBuffer(cyclicBuffer, e);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SMTPAppenderBase this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field CyclicBuffer cyclicBuffer>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field Object e>
	//    6   12:invokevirtual   #36  <Method void SMTPAppenderBase.sendBuffer(CyclicBuffer, Object)>
	//    7   15:return          
	}

	final CyclicBuffer cyclicBuffer;
	final Object e;
	final SMTPAppenderBase this$0;

	SMTPAppenderBase$SenderRunnable(CyclicBuffer cyclicbuffer, Object obj)
	{
		this$0 = SMTPAppenderBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field SMTPAppenderBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		cyclicBuffer = cyclicbuffer;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field CyclicBuffer cyclicBuffer>
		e = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Object e>
	//   11   19:return          
	}
}
