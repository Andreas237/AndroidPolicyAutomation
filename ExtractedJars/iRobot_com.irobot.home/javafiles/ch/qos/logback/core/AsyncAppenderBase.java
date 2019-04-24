// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.AppenderAttachableImpl;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package ch.qos.logback.core:
//			UnsynchronizedAppenderBase, Appender

public class AsyncAppenderBase extends UnsynchronizedAppenderBase
	implements AppenderAttachable
{
	class Worker extends Thread
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

		Worker()
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


	public AsyncAppenderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void UnsynchronizedAppenderBase()>
		aai = new AppenderAttachableImpl();
	//    2    4:aload_0         
	//    3    5:new             #33  <Class AppenderAttachableImpl>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void AppenderAttachableImpl()>
	//    6   12:putfield        #36  <Field AppenderAttachableImpl aai>
		queueSize = 256;
	//    7   15:aload_0         
	//    8   16:sipush          256
	//    9   19:putfield        #38  <Field int queueSize>
		appenderCount = 0;
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:putfield        #40  <Field int appenderCount>
		discardingThreshold = -1;
	//   13   27:aload_0         
	//   14   28:iconst_m1       
	//   15   29:putfield        #42  <Field int discardingThreshold>
		worker = new Worker();
	//   16   32:aload_0         
	//   17   33:new             #9   <Class AsyncAppenderBase$Worker>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #45  <Method void AsyncAppenderBase$Worker(AsyncAppenderBase)>
	//   21   41:putfield        #47  <Field AsyncAppenderBase$Worker worker>
	//   22   44:return          
	}

	private boolean isQueueBelowDiscardingThreshold()
	{
		return blockingQueue.remainingCapacity() < discardingThreshold;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field BlockingQueue blockingQueue>
	//    2    4:invokeinterface #58  <Method int BlockingQueue.remainingCapacity()>
	//    3    9:aload_0         
	//    4   10:getfield        #42  <Field int discardingThreshold>
	//    5   13:icmpge          18
	//    6   16:iconst_1        
	//    7   17:ireturn         
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	private void put(Object obj)
	{
		try
		{
			blockingQueue.put(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field BlockingQueue blockingQueue>
	//    2    4:aload_1         
	//    3    5:invokeinterface #64  <Method void BlockingQueue.put(Object)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   5   11:astore_1        
		{
			return;
	//    6   12:return          
		}
	}

	public void addAppender(Appender appender)
	{
		if(appenderCount == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field int appenderCount>
	//*   2    4:ifne            67
		{
			appenderCount = appenderCount + 1;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field int appenderCount>
	//    6   12:iconst_1        
	//    7   13:iadd            
	//    8   14:putfield        #40  <Field int appenderCount>
			StringBuilder stringbuilder = new StringBuilder();
	//    9   17:new             #70  <Class StringBuilder>
	//   10   20:dup             
	//   11   21:invokespecial   #71  <Method void StringBuilder()>
	//   12   24:astore_2        
			stringbuilder.append("Attaching appender named [");
	//   13   25:aload_2         
	//   14   26:ldc1            #73  <String "Attaching appender named [">
	//   15   28:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(appender.getName());
	//   17   32:aload_2         
	//   18   33:aload_1         
	//   19   34:invokeinterface #83  <Method String Appender.getName()>
	//   20   39:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			stringbuilder.append("] to AsyncAppender.");
	//   22   43:aload_2         
	//   23   44:ldc1            #85  <String "] to AsyncAppender.">
	//   24   46:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			addInfo(stringbuilder.toString());
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   29   55:invokevirtual   #92  <Method void addInfo(String)>
			aai.addAppender(appender);
	//   30   58:aload_0         
	//   31   59:getfield        #36  <Field AppenderAttachableImpl aai>
	//   32   62:aload_1         
	//   33   63:invokevirtual   #94  <Method void AppenderAttachableImpl.addAppender(Appender)>
			return;
	//   34   66:return          
		} else
		{
			addWarn("One and only one appender may be attached to AsyncAppender.");
	//   35   67:aload_0         
	//   36   68:ldc1            #96  <String "One and only one appender may be attached to AsyncAppender.">
	//   37   70:invokevirtual   #99  <Method void addWarn(String)>
			StringBuilder stringbuilder1 = new StringBuilder();
	//   38   73:new             #70  <Class StringBuilder>
	//   39   76:dup             
	//   40   77:invokespecial   #71  <Method void StringBuilder()>
	//   41   80:astore_2        
			stringbuilder1.append("Ignoring additional appender named [");
	//   42   81:aload_2         
	//   43   82:ldc1            #101 <String "Ignoring additional appender named [">
	//   44   84:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   45   87:pop             
			stringbuilder1.append(appender.getName());
	//   46   88:aload_2         
	//   47   89:aload_1         
	//   48   90:invokeinterface #83  <Method String Appender.getName()>
	//   49   95:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   50   98:pop             
			stringbuilder1.append("]");
	//   51   99:aload_2         
	//   52  100:ldc1            #103 <String "]">
	//   53  102:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   54  105:pop             
			addWarn(stringbuilder1.toString());
	//   55  106:aload_0         
	//   56  107:aload_2         
	//   57  108:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   58  111:invokevirtual   #99  <Method void addWarn(String)>
			return;
	//   59  114:return          
		}
	}

	protected void append(Object obj)
	{
		if(isQueueBelowDiscardingThreshold() && isDiscardable(obj))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #106 <Method boolean isQueueBelowDiscardingThreshold()>
	//*   2    4:ifeq            16
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #110 <Method boolean isDiscardable(Object)>
	//*   6   12:ifeq            16
		{
			return;
	//    7   15:return          
		} else
		{
			preprocess(obj);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #113 <Method void preprocess(Object)>
			put(obj);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #114 <Method void put(Object)>
			return;
	//   14   26:return          
		}
	}

	public void detachAndStopAllAppenders()
	{
		aai.detachAndStopAllAppenders();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppenderAttachableImpl aai>
	//    2    4:invokevirtual   #117 <Method void AppenderAttachableImpl.detachAndStopAllAppenders()>
	//    3    7:return          
	}

	public boolean detachAppender(Appender appender)
	{
		return aai.detachAppender(appender);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppenderAttachableImpl aai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #121 <Method boolean AppenderAttachableImpl.detachAppender(Appender)>
	//    4    8:ireturn         
	}

	public boolean detachAppender(String s)
	{
		return aai.detachAppender(s);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppenderAttachableImpl aai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method boolean AppenderAttachableImpl.detachAppender(String)>
	//    4    8:ireturn         
	}

	public Appender getAppender(String s)
	{
		return aai.getAppender(s);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppenderAttachableImpl aai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #129 <Method Appender AppenderAttachableImpl.getAppender(String)>
	//    4    8:areturn         
	}

	public int getDiscardingThreshold()
	{
		return discardingThreshold;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int discardingThreshold>
	//    2    4:ireturn         
	}

	public int getNumberOfElementsInQueue()
	{
		return blockingQueue.size();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field BlockingQueue blockingQueue>
	//    2    4:invokeinterface #135 <Method int BlockingQueue.size()>
	//    3    9:ireturn         
	}

	public int getQueueSize()
	{
		return queueSize;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int queueSize>
	//    2    4:ireturn         
	}

	public int getRemainingCapacity()
	{
		return blockingQueue.remainingCapacity();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field BlockingQueue blockingQueue>
	//    2    4:invokeinterface #58  <Method int BlockingQueue.remainingCapacity()>
	//    3    9:ireturn         
	}

	public boolean isAttached(Appender appender)
	{
		return aai.isAttached(appender);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppenderAttachableImpl aai>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #140 <Method boolean AppenderAttachableImpl.isAttached(Appender)>
	//    4    8:ireturn         
	}

	protected boolean isDiscardable(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Iterator iteratorForAppenders()
	{
		return aai.iteratorForAppenders();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppenderAttachableImpl aai>
	//    2    4:invokevirtual   #145 <Method Iterator AppenderAttachableImpl.iteratorForAppenders()>
	//    3    7:areturn         
	}

	protected void preprocess(Object obj)
	{
	//    0    0:return          
	}

	public void setDiscardingThreshold(int i)
	{
		discardingThreshold = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int discardingThreshold>
	//    3    5:return          
	}

	public void setQueueSize(int i)
	{
		queueSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field int queueSize>
	//    3    5:return          
	}

	public void start()
	{
		if(appenderCount == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field int appenderCount>
	//*   2    4:ifne            14
		{
			addError("No attached appenders found.");
	//    3    7:aload_0         
	//    4    8:ldc1            #152 <String "No attached appenders found.">
	//    5   10:invokevirtual   #155 <Method void addError(String)>
			return;
	//    6   13:return          
		}
		if(queueSize < 1)
	//*   7   14:aload_0         
	//*   8   15:getfield        #38  <Field int queueSize>
	//*   9   18:iconst_1        
	//*  10   19:icmpge          62
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   22:new             #70  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:invokespecial   #71  <Method void StringBuilder()>
	//   14   29:astore_1        
			stringbuilder.append("Invalid queue size [");
	//   15   30:aload_1         
	//   16   31:ldc1            #157 <String "Invalid queue size [">
	//   17   33:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(queueSize);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #38  <Field int queueSize>
	//   22   42:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
			stringbuilder.append("]");
	//   24   46:aload_1         
	//   25   47:ldc1            #103 <String "]">
	//   26   49:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			addError(stringbuilder.toString());
	//   28   53:aload_0         
	//   29   54:aload_1         
	//   30   55:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   31   58:invokevirtual   #155 <Method void addError(String)>
			return;
	//   32   61:return          
		}
		blockingQueue = ((BlockingQueue) (new ArrayBlockingQueue(queueSize)));
	//   33   62:aload_0         
	//   34   63:new             #162 <Class ArrayBlockingQueue>
	//   35   66:dup             
	//   36   67:aload_0         
	//   37   68:getfield        #38  <Field int queueSize>
	//   38   71:invokespecial   #164 <Method void ArrayBlockingQueue(int)>
	//   39   74:putfield        #52  <Field BlockingQueue blockingQueue>
		if(discardingThreshold == -1)
	//*  40   77:aload_0         
	//*  41   78:getfield        #42  <Field int discardingThreshold>
	//*  42   81:iconst_m1       
	//*  43   82:icmpne          95
			discardingThreshold = queueSize / 5;
	//   44   85:aload_0         
	//   45   86:aload_0         
	//   46   87:getfield        #38  <Field int queueSize>
	//   47   90:iconst_5        
	//   48   91:idiv            
	//   49   92:putfield        #42  <Field int discardingThreshold>
		Object obj = ((Object) (new StringBuilder()));
	//   50   95:new             #70  <Class StringBuilder>
	//   51   98:dup             
	//   52   99:invokespecial   #71  <Method void StringBuilder()>
	//   53  102:astore_1        
		((StringBuilder) (obj)).append("Setting discardingThreshold to ");
	//   54  103:aload_1         
	//   55  104:ldc1            #166 <String "Setting discardingThreshold to ">
	//   56  106:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   57  109:pop             
		((StringBuilder) (obj)).append(discardingThreshold);
	//   58  110:aload_1         
	//   59  111:aload_0         
	//   60  112:getfield        #42  <Field int discardingThreshold>
	//   61  115:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   62  118:pop             
		addInfo(((StringBuilder) (obj)).toString());
	//   63  119:aload_0         
	//   64  120:aload_1         
	//   65  121:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   66  124:invokevirtual   #92  <Method void addInfo(String)>
		worker.setDaemon(true);
	//   67  127:aload_0         
	//   68  128:getfield        #47  <Field AsyncAppenderBase$Worker worker>
	//   69  131:iconst_1        
	//   70  132:invokevirtual   #170 <Method void AsyncAppenderBase$Worker.setDaemon(boolean)>
		obj = ((Object) (worker));
	//   71  135:aload_0         
	//   72  136:getfield        #47  <Field AsyncAppenderBase$Worker worker>
	//   73  139:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   74  140:new             #70  <Class StringBuilder>
	//   75  143:dup             
	//   76  144:invokespecial   #71  <Method void StringBuilder()>
	//   77  147:astore_2        
		stringbuilder1.append("AsyncAppender-Worker-");
	//   78  148:aload_2         
	//   79  149:ldc1            #172 <String "AsyncAppender-Worker-">
	//   80  151:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   81  154:pop             
		stringbuilder1.append(worker.getName());
	//   82  155:aload_2         
	//   83  156:aload_0         
	//   84  157:getfield        #47  <Field AsyncAppenderBase$Worker worker>
	//   85  160:invokevirtual   #173 <Method String AsyncAppenderBase$Worker.getName()>
	//   86  163:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
	//   87  166:pop             
		((Worker) (obj)).setName(stringbuilder1.toString());
	//   88  167:aload_1         
	//   89  168:aload_2         
	//   90  169:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   91  172:invokevirtual   #176 <Method void AsyncAppenderBase$Worker.setName(String)>
		super.start();
	//   92  175:aload_0         
	//   93  176:invokespecial   #178 <Method void UnsynchronizedAppenderBase.start()>
		worker.start();
	//   94  179:aload_0         
	//   95  180:getfield        #47  <Field AsyncAppenderBase$Worker worker>
	//   96  183:invokevirtual   #179 <Method void AsyncAppenderBase$Worker.start()>
	//   97  186:return          
	}

	public void stop()
	{
		if(!isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #183 <Method boolean isStarted()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		super.stop();
	//    4    8:aload_0         
	//    5    9:invokespecial   #185 <Method void UnsynchronizedAppenderBase.stop()>
		worker.interrupt();
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field AsyncAppenderBase$Worker worker>
	//    8   16:invokevirtual   #188 <Method void AsyncAppenderBase$Worker.interrupt()>
		try
		{
			worker.join(1000L);
	//    9   19:aload_0         
	//   10   20:getfield        #47  <Field AsyncAppenderBase$Worker worker>
	//   11   23:ldc2w           #189 <Long 1000L>
	//   12   26:invokevirtual   #194 <Method void AsyncAppenderBase$Worker.join(long)>
			return;
	//   13   29:return          
		}
		catch(InterruptedException interruptedexception)
	//*  14   30:astore_1        
		{
			addError("Failed to join worker thread", ((Throwable) (interruptedexception)));
	//   15   31:aload_0         
	//   16   32:ldc1            #196 <String "Failed to join worker thread">
	//   17   34:aload_1         
	//   18   35:invokevirtual   #199 <Method void addError(String, Throwable)>
		}
	//   19   38:return          
	}

	public static final int DEFAULT_QUEUE_SIZE = 256;
	static final int UNDEFINED = -1;
	AppenderAttachableImpl aai;
	int appenderCount;
	BlockingQueue blockingQueue;
	int discardingThreshold;
	int queueSize;
	Worker worker;
}
