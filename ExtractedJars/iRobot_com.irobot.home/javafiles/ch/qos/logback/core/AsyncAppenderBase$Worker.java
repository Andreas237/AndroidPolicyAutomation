// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachableImpl;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package ch.qos.logback.core:
//			AsyncAppenderBase

class AsyncAppenderBase$Worker extends Thread
{

	public void run()
	{
		AppenderAttachableImpl appenderattachableimpl;
		Object obj;
		obj = ((Object) (AsyncAppenderBase.this));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AsyncAppenderBase this$0>
	//    2    4:astore_2        
		appenderattachableimpl = ((AsyncAppenderBase) (obj)).aai;
	//    3    5:aload_2         
	//    4    6:getfield        #24  <Field AppenderAttachableImpl AsyncAppenderBase.aai>
	//    5    9:astore_1        
_L2:
		if(!((AsyncAppenderBase) (obj)).isStarted())
			break; /* Loop/switch isn't completed */
	//    6   10:aload_2         
	//    7   11:invokevirtual   #28  <Method boolean AsyncAppenderBase.isStarted()>
	//    8   14:ifeq            34
		appenderattachableimpl.appendLoopOnAppenders(((AsyncAppenderBase) (obj)).blockingQueue.take());
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:getfield        #32  <Field BlockingQueue AsyncAppenderBase.blockingQueue>
	//   12   22:invokeinterface #38  <Method Object BlockingQueue.take()>
	//   13   27:invokevirtual   #44  <Method int AppenderAttachableImpl.appendLoopOnAppenders(Object)>
	//   14   30:pop             
		if(true) goto _L2; else goto _L1
	//   15   31:goto            10
_L1:
		addInfo("Worker thread will flush remaining events before exiting.");
	//   16   34:aload_0         
	//   17   35:getfield        #13  <Field AsyncAppenderBase this$0>
	//   18   38:ldc1            #46  <String "Worker thread will flush remaining events before exiting.">
	//   19   40:invokevirtual   #50  <Method void AsyncAppenderBase.addInfo(String)>
		for(obj = ((Object) (((AsyncAppenderBase) (obj)).blockingQueue.iterator())); ((Iterator) (obj)).hasNext(); appenderattachableimpl.appendLoopOnAppenders(((Iterator) (obj)).next()));
	//   20   43:aload_2         
	//   21   44:getfield        #32  <Field BlockingQueue AsyncAppenderBase.blockingQueue>
	//   22   47:invokeinterface #54  <Method Iterator BlockingQueue.iterator()>
	//   23   52:astore_2        
	//   24   53:aload_2         
	//   25   54:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//   26   59:ifeq            76
	//   27   62:aload_1         
	//   28   63:aload_2         
	//   29   64:invokeinterface #62  <Method Object Iterator.next()>
	//   30   69:invokevirtual   #44  <Method int AppenderAttachableImpl.appendLoopOnAppenders(Object)>
	//   31   72:pop             
	//*  32   73:goto            53
		appenderattachableimpl.detachAndStopAllAppenders();
	//   33   76:aload_1         
	//   34   77:invokevirtual   #65  <Method void AppenderAttachableImpl.detachAndStopAllAppenders()>
		return;
	//   35   80:return          
		InterruptedException interruptedexception;
		interruptedexception;
	//   36   81:astore_3        
		if(true) goto _L1; else goto _L3
_L3:
	//*  37   82:goto            34
	}

	final AsyncAppenderBase this$0;

	AsyncAppenderBase$Worker()
	{
		this$0 = AsyncAppenderBase.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AsyncAppenderBase this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Thread()>
	//    5    9:return          
	}
}
