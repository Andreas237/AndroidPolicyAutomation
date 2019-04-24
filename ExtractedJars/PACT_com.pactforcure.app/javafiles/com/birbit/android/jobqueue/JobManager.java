// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import android.os.Looper;
import com.birbit.android.jobqueue.callback.JobManagerCallback;
import com.birbit.android.jobqueue.callback.JobManagerCallbackAdapter;
import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessageFactory;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.messaging.PriorityMessageQueue;
import com.birbit.android.jobqueue.messaging.message.AddJobMessage;
import com.birbit.android.jobqueue.messaging.message.CancelMessage;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;
import com.birbit.android.jobqueue.messaging.message.PublicQueryMessage;
import com.birbit.android.jobqueue.messaging.message.SchedulerMessage;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;
import java.util.concurrent.*;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManagerThread, WrongThreadException, ConsumerManager, CallbackManager, 
//			Job, CancelResult, JobStatus, AsyncAddCallback, 
//			TagConstraint, IntCallback

public class JobManager
{
	static class IntQueryFuture
		implements Future, IntCallback
	{

		public boolean cancel(boolean flag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Integer get()
			throws InterruptedException, ExecutionException
		{
			messageQueue.post(message);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field MessageQueue messageQueue>
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field Message message>
		//    4    8:invokeinterface #62  <Method void MessageQueue.post(Message)>
			latch.await();
		//    5   13:aload_0         
		//    6   14:getfield        #35  <Field CountDownLatch latch>
		//    7   17:invokevirtual   #65  <Method void CountDownLatch.await()>
			return result;
		//    8   20:aload_0         
		//    9   21:getfield        #28  <Field Integer result>
		//   10   24:areturn         
		}

		public Integer get(long l, TimeUnit timeunit)
			throws InterruptedException, ExecutionException, TimeoutException
		{
			messageQueue.post(message);
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field MessageQueue messageQueue>
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field Message message>
		//    4    8:invokeinterface #62  <Method void MessageQueue.post(Message)>
			latch.await(l, timeunit);
		//    5   13:aload_0         
		//    6   14:getfield        #35  <Field CountDownLatch latch>
		//    7   17:lload_1         
		//    8   18:aload_3         
		//    9   19:invokevirtual   #73  <Method boolean CountDownLatch.await(long, TimeUnit)>
		//   10   22:pop             
			return result;
		//   11   23:aload_0         
		//   12   24:getfield        #28  <Field Integer result>
		//   13   27:areturn         
		}

		public volatile Object get()
			throws InterruptedException, ExecutionException
		{
			return ((Object) (get()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #77  <Method Integer get()>
		//    2    4:areturn         
		}

		public volatile Object get(long l, TimeUnit timeunit)
			throws InterruptedException, ExecutionException, TimeoutException
		{
			return ((Object) (get(l, timeunit)));
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:aload_3         
		//    3    3:invokevirtual   #80  <Method Integer get(long, TimeUnit)>
		//    4    6:areturn         
		}

		Integer getSafe()
		{
			Integer integer;
			try
			{
				integer = get();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #77  <Method Integer get()>
		//    2    4:astore_1        
			}
		//*   3    5:aload_1         
		//*   4    6:areturn         
			catch(Throwable throwable)
		//*   5    7:astore_1        
			{
				JqLog.e(throwable, "message is not complete", new Object[0]);
		//    6    8:aload_1         
		//    7    9:ldc1            #85  <String "message is not complete">
		//    8   11:iconst_0        
		//    9   12:anewarray       Object[]
		//   10   15:invokestatic    #91  <Method void JqLog.e(Throwable, String, Object[])>
				throw new RuntimeException("cannot get the result of the JobManager query");
		//   11   18:new             #93  <Class RuntimeException>
		//   12   21:dup             
		//   13   22:ldc1            #95  <String "cannot get the result of the JobManager query">
		//   14   24:invokespecial   #98  <Method void RuntimeException(String)>
		//   15   27:athrow          
			}
			return integer;
		}

		public boolean isCancelled()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isDone()
		{
			return latch.getCount() == 0L;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field CountDownLatch latch>
		//    2    4:invokevirtual   #105 <Method long CountDownLatch.getCount()>
		//    3    7:lconst_0        
		//    4    8:lcmp            
		//    5    9:ifne            14
		//    6   12:iconst_1        
		//    7   13:ireturn         
		//    8   14:iconst_0        
		//    9   15:ireturn         
		}

		public void onResult(int i)
		{
			result = Integer.valueOf(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokestatic    #112 <Method Integer Integer.valueOf(int)>
		//    3    5:putfield        #28  <Field Integer result>
			latch.countDown();
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field CountDownLatch latch>
		//    6   12:invokevirtual   #115 <Method void CountDownLatch.countDown()>
		//    7   15:return          
		}

		final CountDownLatch latch = new CountDownLatch(1);
		final Message message;
		final MessageQueue messageQueue;
		volatile Integer result;

		IntQueryFuture(MessageQueue messagequeue, Message message1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			result = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #28  <Field Integer result>
		//    5    9:aload_0         
		//    6   10:new             #30  <Class CountDownLatch>
		//    7   13:dup             
		//    8   14:iconst_1        
		//    9   15:invokespecial   #33  <Method void CountDownLatch(int)>
		//   10   18:putfield        #35  <Field CountDownLatch latch>
			messageQueue = messagequeue;
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:putfield        #37  <Field MessageQueue messageQueue>
			message = message1;
		//   14   26:aload_0         
		//   15   27:aload_2         
		//   16   28:putfield        #39  <Field Message message>
			((IntCallback.MessageWithCallback)message1).setCallback(((IntCallback) (this)));
		//   17   31:aload_2         
		//   18   32:checkcast       #41  <Class IntCallback$MessageWithCallback>
		//   19   35:aload_0         
		//   20   36:invokeinterface #45  <Method void IntCallback$MessageWithCallback.setCallback(IntCallback)>
		//   21   41:return          
		}
	}


	public JobManager(Configuration configuration)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #65  <Class MessageFactory>
	//    4    8:dup             
	//    5    9:invokespecial   #66  <Method void MessageFactory()>
	//    6   12:putfield        #68  <Field MessageFactory messageFactory>
		messageQueue = new PriorityMessageQueue(configuration.getTimer(), messageFactory);
	//    7   15:aload_0         
	//    8   16:new             #70  <Class PriorityMessageQueue>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokevirtual   #76  <Method com.birbit.android.jobqueue.timer.Timer Configuration.getTimer()>
	//   12   24:aload_0         
	//   13   25:getfield        #68  <Field MessageFactory messageFactory>
	//   14   28:invokespecial   #79  <Method void PriorityMessageQueue(com.birbit.android.jobqueue.timer.Timer, MessageFactory)>
	//   15   31:putfield        #81  <Field PriorityMessageQueue messageQueue>
		jobManagerThread = new JobManagerThread(configuration, messageQueue, messageFactory);
	//   16   34:aload_0         
	//   17   35:new             #83  <Class JobManagerThread>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   22   44:aload_0         
	//   23   45:getfield        #68  <Field MessageFactory messageFactory>
	//   24   48:invokespecial   #86  <Method void JobManagerThread(Configuration, PriorityMessageQueue, MessageFactory)>
	//   25   51:putfield        #88  <Field JobManagerThread jobManagerThread>
		chefThread = new Thread(((Runnable) (jobManagerThread)), "job-manager");
	//   26   54:aload_0         
	//   27   55:new             #90  <Class Thread>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:getfield        #88  <Field JobManagerThread jobManagerThread>
	//   31   63:ldc1            #92  <String "job-manager">
	//   32   65:invokespecial   #95  <Method void Thread(Runnable, String)>
	//   33   68:putfield        #97  <Field Thread chefThread>
		if(configuration.getScheduler() != null)
	//*  34   71:aload_1         
	//*  35   72:invokevirtual   #101 <Method Scheduler Configuration.getScheduler()>
	//*  36   75:ifnull          103
		{
			scheduler = configuration.getScheduler();
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:invokevirtual   #101 <Method Scheduler Configuration.getScheduler()>
	//   40   83:putfield        #103 <Field Scheduler scheduler>
			com.birbit.android.jobqueue.scheduling.Scheduler.Callback callback = createSchedulerCallback();
	//   41   86:aload_0         
	//   42   87:invokespecial   #107 <Method com.birbit.android.jobqueue.scheduling.Scheduler$Callback createSchedulerCallback()>
	//   43   90:astore_2        
			configuration.getScheduler().init(configuration.getAppContext(), callback);
	//   44   91:aload_1         
	//   45   92:invokevirtual   #101 <Method Scheduler Configuration.getScheduler()>
	//   46   95:aload_1         
	//   47   96:invokevirtual   #111 <Method android.content.Context Configuration.getAppContext()>
	//   48   99:aload_2         
	//   49  100:invokevirtual   #117 <Method void Scheduler.init(android.content.Context, com.birbit.android.jobqueue.scheduling.Scheduler$Callback)>
		}
		chefThread.start();
	//   50  103:aload_0         
	//   51  104:getfield        #97  <Field Thread chefThread>
	//   52  107:invokevirtual   #120 <Method void Thread.start()>
	//   53  110:return          
	}

	private void assertNotInJobManagerThread(String s)
	{
		if(Thread.currentThread() == chefThread)
	//*   0    0:invokestatic    #136 <Method Thread Thread.currentThread()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #97  <Field Thread chefThread>
	//*   3    7:if_acmpne       19
			throw new WrongThreadException(s);
	//    4   10:new             #138 <Class WrongThreadException>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokespecial   #140 <Method void WrongThreadException(String)>
	//    8   18:athrow          
		else
			return;
	//    9   19:return          
	}

	private void assertNotInMainThread()
	{
		assertNotInMainThread("Cannot call this method on main thread.");
	//    0    0:aload_0         
	//    1    1:ldc1            #143 <String "Cannot call this method on main thread.">
	//    2    3:invokespecial   #145 <Method void assertNotInMainThread(String)>
	//    3    6:return          
	}

	private void assertNotInMainThread(String s)
	{
		if(Looper.getMainLooper().getThread() == Thread.currentThread())
	//*   0    0:invokestatic    #151 <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #154 <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #136 <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpne       21
			throw new WrongThreadException(s);
	//    4   12:new             #138 <Class WrongThreadException>
	//    5   15:dup             
	//    6   16:aload_1         
	//    7   17:invokespecial   #140 <Method void WrongThreadException(String)>
	//    8   20:athrow          
		else
			return;
	//    9   21:return          
	}

	private com.birbit.android.jobqueue.scheduling.Scheduler.Callback createSchedulerCallback()
	{
		return new com.birbit.android.jobqueue.scheduling.Scheduler.Callback() {

			public boolean start(SchedulerConstraint schedulerconstraint)
			{
				dispatchSchedulerStart(schedulerconstraint);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field JobManager this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #27  <Method void JobManager.access$000(JobManager, SchedulerConstraint)>
				return true;
			//    4    8:iconst_1        
			//    5    9:ireturn         
			}

			public boolean stop(SchedulerConstraint schedulerconstraint)
			{
				dispatchSchedulerStop(schedulerconstraint);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field JobManager this$0>
			//    2    4:aload_1         
			//    3    5:invokestatic    #31  <Method void JobManager.access$100(JobManager, SchedulerConstraint)>
				return false;
			//    4    8:iconst_0        
			//    5    9:ireturn         
			}

			final JobManager this$0;

			
			{
				this$0 = JobManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field JobManager this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class JobManager$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #157 <Method void JobManager$1(JobManager)>
	//    4    8:areturn         
	}

	private void dispatchSchedulerStart(SchedulerConstraint schedulerconstraint)
	{
		SchedulerMessage schedulermessage = (SchedulerMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/SchedulerMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field MessageFactory messageFactory>
	//    2    4:ldc1            #159 <Class SchedulerMessage>
	//    3    6:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    4    9:checkcast       #159 <Class SchedulerMessage>
	//    5   12:astore_2        
		schedulermessage.set(1, schedulerconstraint);
	//    6   13:aload_2         
	//    7   14:iconst_1        
	//    8   15:aload_1         
	//    9   16:invokevirtual   #167 <Method void SchedulerMessage.set(int, SchedulerConstraint)>
		messageQueue.post(((Message) (schedulermessage)));
	//   10   19:aload_0         
	//   11   20:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   12   23:aload_2         
	//   13   24:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
	//   14   27:return          
	}

	private void dispatchSchedulerStop(SchedulerConstraint schedulerconstraint)
	{
		SchedulerMessage schedulermessage = (SchedulerMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/SchedulerMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field MessageFactory messageFactory>
	//    2    4:ldc1            #159 <Class SchedulerMessage>
	//    3    6:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    4    9:checkcast       #159 <Class SchedulerMessage>
	//    5   12:astore_2        
		schedulermessage.set(2, schedulerconstraint);
	//    6   13:aload_2         
	//    7   14:iconst_2        
	//    8   15:aload_1         
	//    9   16:invokevirtual   #167 <Method void SchedulerMessage.set(int, SchedulerConstraint)>
		messageQueue.post(((Message) (schedulermessage)));
	//   10   19:aload_0         
	//   11   20:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   12   23:aload_2         
	//   13   24:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
	//   14   27:return          
	}

	private void waitUntilConsumersAreFinished(boolean flag)
	{
		assertNotInMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void assertNotInMainThread()>
		final CountDownLatch latch = new CountDownLatch(1);
	//    2    4:new             #179 <Class CountDownLatch>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:invokespecial   #182 <Method void CountDownLatch(int)>
	//    6   12:astore_2        
		jobManagerThread.consumerManager.addNoConsumersListener(new Runnable() {

			public void run()
			{
				latch.countDown();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CountDownLatch val$latch>
			//    2    4:invokevirtual   #31  <Method void CountDownLatch.countDown()>
				jobManagerThread.consumerManager.removeNoConsumersListener(((Runnable) (this)));
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field JobManager this$0>
			//    5   11:getfield        #35  <Field JobManagerThread JobManager.jobManagerThread>
			//    6   14:getfield        #41  <Field ConsumerManager JobManagerThread.consumerManager>
			//    7   17:aload_0         
			//    8   18:invokevirtual   #47  <Method boolean ConsumerManager.removeNoConsumersListener(Runnable)>
			//    9   21:pop             
			//   10   22:return          
			}

			final JobManager this$0;
			final CountDownLatch val$latch;

			
			{
				this$0 = JobManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field JobManager this$0>
				latch = countdownlatch;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CountDownLatch val$latch>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    7   13:aload_0         
	//    8   14:getfield        #88  <Field JobManagerThread jobManagerThread>
	//    9   17:getfield        #186 <Field ConsumerManager JobManagerThread.consumerManager>
	//   10   20:new             #8   <Class JobManager$2>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokespecial   #189 <Method void JobManager$2(JobManager, CountDownLatch)>
	//   15   29:invokevirtual   #195 <Method void ConsumerManager.addNoConsumersListener(Runnable)>
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            40
			stop();
	//   18   36:aload_0         
	//   19   37:invokevirtual   #198 <Method void stop()>
		if(jobManagerThread.consumerManager.getWorkerCount() == 0)
	//*  20   40:aload_0         
	//*  21   41:getfield        #88  <Field JobManagerThread jobManagerThread>
	//*  22   44:getfield        #186 <Field ConsumerManager JobManagerThread.consumerManager>
	//*  23   47:invokevirtual   #202 <Method int ConsumerManager.getWorkerCount()>
	//*  24   50:ifne            54
			return;
	//   25   53:return          
		try
		{
			latch.await();
	//   26   54:aload_2         
	//   27   55:invokevirtual   #205 <Method void CountDownLatch.await()>
		}
	//*  28   58:aload_0         
	//*  29   59:getfield        #68  <Field MessageFactory messageFactory>
	//*  30   62:ldc1            #207 <Class PublicQueryMessage>
	//*  31   64:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//*  32   67:checkcast       #207 <Class PublicQueryMessage>
	//*  33   70:astore_2        
	//*  34   71:aload_2         
	//*  35   72:iconst_5        
	//*  36   73:aconst_null     
	//*  37   74:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
	//*  38   77:new             #18  <Class JobManager$IntQueryFuture>
	//*  39   80:dup             
	//*  40   81:aload_0         
	//*  41   82:getfield        #88  <Field JobManagerThread jobManagerThread>
	//*  42   85:getfield        #214 <Field CallbackManager JobManagerThread.callbackManager>
	//*  43   88:getfield        #219 <Field com.birbit.android.jobqueue.messaging.SafeMessageQueue CallbackManager.messageQueue>
	//*  44   91:aload_2         
	//*  45   92:invokespecial   #222 <Method void JobManager$IntQueryFuture(MessageQueue, Message)>
	//*  46   95:invokevirtual   #226 <Method Integer JobManager$IntQueryFuture.getSafe()>
	//*  47   98:pop             
	//*  48   99:return          
		catch(InterruptedException interruptedexception) { }
	//   49  100:astore_2        
		latch = ((CountDownLatch) ((PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage)));
		((PublicQueryMessage) (latch)).set(5, ((IntCallback) (null)));
		(new IntQueryFuture(((MessageQueue) (jobManagerThread.callbackManager.messageQueue)), ((Message) (latch)))).getSafe();
	//*  50  101:goto            58
	}

	public void addCallback(JobManagerCallback jobmanagercallback)
	{
		jobManagerThread.addCallback(jobmanagercallback);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field JobManagerThread jobManagerThread>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #230 <Method void JobManagerThread.addCallback(JobManagerCallback)>
	//    4    8:return          
	}

	public void addJob(Job job)
	{
		assertNotInMainThread("Cannot call this method on main thread. Use addJobInBackground instead.");
	//    0    0:aload_0         
	//    1    1:ldc1            #234 <String "Cannot call this method on main thread. Use addJobInBackground instead.">
	//    2    3:invokespecial   #145 <Method void assertNotInMainThread(String)>
		assertNotInJobManagerThread("Cannot call sync methods in JobManager's callback thread.Use addJobInBackground instead");
	//    3    6:aload_0         
	//    4    7:ldc1            #236 <String "Cannot call sync methods in JobManager's callback thread.Use addJobInBackground instead">
	//    5    9:invokespecial   #238 <Method void assertNotInJobManagerThread(String)>
		CountDownLatch countdownlatch = new CountDownLatch(1);
	//    6   12:new             #179 <Class CountDownLatch>
	//    7   15:dup             
	//    8   16:iconst_1        
	//    9   17:invokespecial   #182 <Method void CountDownLatch(int)>
	//   10   20:astore_2        
		addCallback(((JobManagerCallback) (new JobManagerCallbackAdapter() {

			public void onJobAdded(Job job1)
			{
				if(uuid.equals(((Object) (job1.getId()))))
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field String val$uuid>
			//*   2    4:aload_1         
			//*   3    5:invokevirtual   #35  <Method String Job.getId()>
			//*   4    8:invokevirtual   #41  <Method boolean String.equals(Object)>
			//*   5   11:ifeq            30
				{
					latch.countDown();
			//    6   14:aload_0         
			//    7   15:getfield        #23  <Field CountDownLatch val$latch>
			//    8   18:invokevirtual   #46  <Method void CountDownLatch.countDown()>
					removeCallback(((JobManagerCallback) (this)));
			//    9   21:aload_0         
			//   10   22:getfield        #19  <Field JobManager this$0>
			//   11   25:aload_0         
			//   12   26:invokevirtual   #50  <Method boolean JobManager.removeCallback(JobManagerCallback)>
			//   13   29:pop             
				}
			//   14   30:return          
			}

			final JobManager this$0;
			final CountDownLatch val$latch;
			final String val$uuid;

			
			{
				this$0 = JobManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field JobManager this$0>
				uuid = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$uuid>
				latch = countdownlatch;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field CountDownLatch val$latch>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void JobManagerCallbackAdapter()>
			//   11   19:return          
			}
		}
)));
	//   11   21:aload_0         
	//   12   22:new             #10  <Class JobManager$3>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #244 <Method String Job.getId()>
	//   17   31:aload_2         
	//   18   32:invokespecial   #247 <Method void JobManager$3(JobManager, String, CountDownLatch)>
	//   19   35:invokevirtual   #248 <Method void addCallback(JobManagerCallback)>
		addJobInBackground(job);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #251 <Method void addJobInBackground(Job)>
		try
		{
			countdownlatch.await();
	//   23   43:aload_2         
	//   24   44:invokevirtual   #205 <Method void CountDownLatch.await()>
			return;
	//   25   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(Job job)
	//*  26   48:astore_1        
		{
			return;
	//   27   49:return          
		}
	}

	public void addJobInBackground(Job job)
	{
		AddJobMessage addjobmessage = (AddJobMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/AddJobMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field MessageFactory messageFactory>
	//    2    4:ldc1            #253 <Class AddJobMessage>
	//    3    6:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    4    9:checkcast       #253 <Class AddJobMessage>
	//    5   12:astore_2        
		addjobmessage.setJob(job);
	//    6   13:aload_2         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #256 <Method void AddJobMessage.setJob(Job)>
		messageQueue.post(((Message) (addjobmessage)));
	//    9   18:aload_0         
	//   10   19:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   11   22:aload_2         
	//   12   23:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
	//   13   26:return          
	}

	public void addJobInBackground(Job job, AsyncAddCallback asyncaddcallback)
	{
		if(asyncaddcallback == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			addJobInBackground(job);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #251 <Method void addJobInBackground(Job)>
			return;
	//    5    9:return          
		} else
		{
			addCallback(((JobManagerCallback) (new JobManagerCallbackAdapter() {

				public void onJobAdded(Job job1)
				{
					if(!uuid.equals(((Object) (job1.getId()))))
						break MISSING_BLOCK_LABEL_32;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field String val$uuid>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #36  <Method String Job.getId()>
				//    4    8:invokevirtual   #42  <Method boolean String.equals(Object)>
				//    5   11:ifeq            32
					callback.onAdded();
				//    6   14:aload_0         
				//    7   15:getfield        #23  <Field AsyncAddCallback val$callback>
				//    8   18:invokeinterface #47  <Method void AsyncAddCallback.onAdded()>
					removeCallback(((JobManagerCallback) (this)));
				//    9   23:aload_0         
				//   10   24:getfield        #19  <Field JobManager this$0>
				//   11   27:aload_0         
				//   12   28:invokevirtual   #51  <Method boolean JobManager.removeCallback(JobManagerCallback)>
				//   13   31:pop             
					return;
				//   14   32:return          
					job1;
				//   15   33:astore_1        
					removeCallback(((JobManagerCallback) (this)));
				//   16   34:aload_0         
				//   17   35:getfield        #19  <Field JobManager this$0>
				//   18   38:aload_0         
				//   19   39:invokevirtual   #51  <Method boolean JobManager.removeCallback(JobManagerCallback)>
				//   20   42:pop             
					throw job1;
				//   21   43:aload_1         
				//   22   44:athrow          
				}

				final JobManager this$0;
				final AsyncAddCallback val$callback;
				final String val$uuid;

			
			{
				this$0 = JobManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field JobManager this$0>
				uuid = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$uuid>
				callback = asyncaddcallback;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #23  <Field AsyncAddCallback val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #26  <Method void JobManagerCallbackAdapter()>
			//   11   19:return          
			}
			}
)));
	//    6   10:aload_0         
	//    7   11:new             #12  <Class JobManager$4>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #244 <Method String Job.getId()>
	//   12   20:aload_2         
	//   13   21:invokespecial   #260 <Method void JobManager$4(JobManager, String, AsyncAddCallback)>
	//   14   24:invokevirtual   #248 <Method void addCallback(JobManagerCallback)>
			addJobInBackground(job);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #251 <Method void addJobInBackground(Job)>
			return;
	//   18   32:return          
		}
	}

	public transient CancelResult cancelJobs(TagConstraint tagconstraint, String as[])
	{
		assertNotInMainThread("Cannot call this method on main thread. Use cancelJobsInBackground instead");
	//    0    0:aload_0         
	//    1    1:ldc2            #264 <String "Cannot call this method on main thread. Use cancelJobsInBackground instead">
	//    2    4:invokespecial   #145 <Method void assertNotInMainThread(String)>
		assertNotInJobManagerThread("Cannot call this method on JobManager's thread. UsecancelJobsInBackground instead");
	//    3    7:aload_0         
	//    4    8:ldc2            #266 <String "Cannot call this method on JobManager's thread. UsecancelJobsInBackground instead">
	//    5   11:invokespecial   #238 <Method void assertNotInJobManagerThread(String)>
		if(tagconstraint == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       29
			throw new IllegalArgumentException("must provide a TagConstraint");
	//    8   18:new             #268 <Class IllegalArgumentException>
	//    9   21:dup             
	//   10   22:ldc2            #270 <String "must provide a TagConstraint">
	//   11   25:invokespecial   #271 <Method void IllegalArgumentException(String)>
	//   12   28:athrow          
		final CountDownLatch latch = new CountDownLatch(1);
	//   13   29:new             #179 <Class CountDownLatch>
	//   14   32:dup             
	//   15   33:iconst_1        
	//   16   34:invokespecial   #182 <Method void CountDownLatch(int)>
	//   17   37:astore          4
		final CancelResult result[] = new CancelResult[1];
	//   18   39:iconst_1        
	//   19   40:anewarray       CancelResult[]
	//   20   43:astore_3        
		CancelResult.AsyncCancelCallback asynccancelcallback = new CancelResult.AsyncCancelCallback() {

			public void onCancelled(CancelResult cancelresult)
			{
				result[0] = cancelresult;
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CancelResult[] val$result>
			//    2    4:iconst_0        
			//    3    5:aload_1         
			//    4    6:aastore         
				latch.countDown();
			//    5    7:aload_0         
			//    6    8:getfield        #25  <Field CountDownLatch val$latch>
			//    7   11:invokevirtual   #36  <Method void CountDownLatch.countDown()>
			//    8   14:return          
			}

			final JobManager this$0;
			final CountDownLatch val$latch;
			final CancelResult val$result[];

			
			{
				this$0 = JobManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field JobManager this$0>
				result = acancelresult;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field CancelResult[] val$result>
				latch = countdownlatch;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field CountDownLatch val$latch>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
;
	//   21   44:new             #14  <Class JobManager$5>
	//   22   47:dup             
	//   23   48:aload_0         
	//   24   49:aload_3         
	//   25   50:aload           4
	//   26   52:invokespecial   #276 <Method void JobManager$5(JobManager, CancelResult[], CountDownLatch)>
	//   27   55:astore          5
		CancelMessage cancelmessage = (CancelMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/CancelMessage);
	//   28   57:aload_0         
	//   29   58:getfield        #68  <Field MessageFactory messageFactory>
	//   30   61:ldc2            #278 <Class CancelMessage>
	//   31   64:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//   32   67:checkcast       #278 <Class CancelMessage>
	//   33   70:astore          6
		cancelmessage.setConstraint(tagconstraint);
	//   34   72:aload           6
	//   35   74:aload_1         
	//   36   75:invokevirtual   #282 <Method void CancelMessage.setConstraint(TagConstraint)>
		cancelmessage.setTags(as);
	//   37   78:aload           6
	//   38   80:aload_2         
	//   39   81:invokevirtual   #286 <Method void CancelMessage.setTags(String[])>
		cancelmessage.setCallback(asynccancelcallback);
	//   40   84:aload           6
	//   41   86:aload           5
	//   42   88:invokevirtual   #290 <Method void CancelMessage.setCallback(CancelResult$AsyncCancelCallback)>
		messageQueue.post(((Message) (cancelmessage)));
	//   43   91:aload_0         
	//   44   92:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   45   95:aload           6
	//   46   97:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
		try
		{
			latch.await();
	//   47  100:aload           4
	//   48  102:invokevirtual   #205 <Method void CountDownLatch.await()>
		}
	//*  49  105:aload_3         
	//*  50  106:iconst_0        
	//*  51  107:aaload          
	//*  52  108:areturn         
		// Misplaced declaration of an exception variable
		catch(TagConstraint tagconstraint) { }
	//   53  109:astore_1        
		return result[0];
	//*  54  110:goto            105
	}

	public transient void cancelJobsInBackground(CancelResult.AsyncCancelCallback asynccancelcallback, TagConstraint tagconstraint, String as[])
	{
		if(tagconstraint == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("must provide a TagConstraint");
	//    2    4:new             #268 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #270 <String "must provide a TagConstraint">
	//    5   11:invokespecial   #271 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			CancelMessage cancelmessage = (CancelMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/CancelMessage);
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field MessageFactory messageFactory>
	//    9   19:ldc2            #278 <Class CancelMessage>
	//   10   22:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//   11   25:checkcast       #278 <Class CancelMessage>
	//   12   28:astore          4
			cancelmessage.setCallback(asynccancelcallback);
	//   13   30:aload           4
	//   14   32:aload_1         
	//   15   33:invokevirtual   #290 <Method void CancelMessage.setCallback(CancelResult$AsyncCancelCallback)>
			cancelmessage.setConstraint(tagconstraint);
	//   16   36:aload           4
	//   17   38:aload_2         
	//   18   39:invokevirtual   #282 <Method void CancelMessage.setConstraint(TagConstraint)>
			cancelmessage.setTags(as);
	//   19   42:aload           4
	//   20   44:aload_3         
	//   21   45:invokevirtual   #286 <Method void CancelMessage.setTags(String[])>
			messageQueue.post(((Message) (cancelmessage)));
	//   22   48:aload_0         
	//   23   49:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   24   52:aload           4
	//   25   54:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
			return;
	//   26   57:return          
		}
	}

	public void clear()
	{
		assertNotInMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void assertNotInMainThread()>
		assertNotInJobManagerThread("Cannot call clear on JobManager's thread");
	//    2    4:aload_0         
	//    3    5:ldc2            #295 <String "Cannot call clear on JobManager's thread">
	//    4    8:invokespecial   #238 <Method void assertNotInJobManagerThread(String)>
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field MessageFactory messageFactory>
	//    7   15:ldc1            #207 <Class PublicQueryMessage>
	//    8   17:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    9   20:checkcast       #207 <Class PublicQueryMessage>
	//   10   23:astore_1        
		publicquerymessage.set(5, ((IntCallback) (null)));
	//   11   24:aload_1         
	//   12   25:iconst_5        
	//   13   26:aconst_null     
	//   14   27:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
		(new IntQueryFuture(((MessageQueue) (messageQueue)), ((Message) (publicquerymessage)))).getSafe();
	//   15   30:new             #18  <Class JobManager$IntQueryFuture>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   19   38:aload_1         
	//   20   39:invokespecial   #222 <Method void JobManager$IntQueryFuture(MessageQueue, Message)>
	//   21   42:invokevirtual   #226 <Method Integer JobManager$IntQueryFuture.getSafe()>
	//   22   45:pop             
	//   23   46:return          
	}

	public int count()
	{
		assertNotInMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void assertNotInMainThread()>
		assertNotInJobManagerThread("Cannot call count sync method in JobManager's thread");
	//    2    4:aload_0         
	//    3    5:ldc2            #298 <String "Cannot call count sync method in JobManager's thread">
	//    4    8:invokespecial   #238 <Method void assertNotInJobManagerThread(String)>
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field MessageFactory messageFactory>
	//    7   15:ldc1            #207 <Class PublicQueryMessage>
	//    8   17:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    9   20:checkcast       #207 <Class PublicQueryMessage>
	//   10   23:astore_1        
		publicquerymessage.set(0, ((IntCallback) (null)));
	//   11   24:aload_1         
	//   12   25:iconst_0        
	//   13   26:aconst_null     
	//   14   27:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
		return (new IntQueryFuture(((MessageQueue) (messageQueue)), ((Message) (publicquerymessage)))).getSafe().intValue();
	//   15   30:new             #18  <Class JobManager$IntQueryFuture>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   19   38:aload_1         
	//   20   39:invokespecial   #222 <Method void JobManager$IntQueryFuture(MessageQueue, Message)>
	//   21   42:invokevirtual   #226 <Method Integer JobManager$IntQueryFuture.getSafe()>
	//   22   45:invokevirtual   #303 <Method int Integer.intValue()>
	//   23   48:ireturn         
	}

	public int countReadyJobs()
	{
		assertNotInMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void assertNotInMainThread()>
		assertNotInJobManagerThread("Cannot call countReadyJobs sync method on JobManager's thread");
	//    2    4:aload_0         
	//    3    5:ldc2            #306 <String "Cannot call countReadyJobs sync method on JobManager's thread">
	//    4    8:invokespecial   #238 <Method void assertNotInJobManagerThread(String)>
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field MessageFactory messageFactory>
	//    7   15:ldc1            #207 <Class PublicQueryMessage>
	//    8   17:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    9   20:checkcast       #207 <Class PublicQueryMessage>
	//   10   23:astore_1        
		publicquerymessage.set(1, ((IntCallback) (null)));
	//   11   24:aload_1         
	//   12   25:iconst_1        
	//   13   26:aconst_null     
	//   14   27:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
		return (new IntQueryFuture(((MessageQueue) (messageQueue)), ((Message) (publicquerymessage)))).getSafe().intValue();
	//   15   30:new             #18  <Class JobManager$IntQueryFuture>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   19   38:aload_1         
	//   20   39:invokespecial   #222 <Method void JobManager$IntQueryFuture(MessageQueue, Message)>
	//   21   42:invokevirtual   #226 <Method Integer JobManager$IntQueryFuture.getSafe()>
	//   22   45:invokevirtual   #303 <Method int Integer.intValue()>
	//   23   48:ireturn         
	}

	public void destroy()
	{
		JqLog.d("destroying job queue", new Object[0]);
	//    0    0:ldc2            #309 <String "destroying job queue">
	//    1    3:iconst_0        
	//    2    4:anewarray       Object[]
	//    3    7:invokestatic    #315 <Method void JqLog.d(String, Object[])>
		stopAndWaitUntilConsumersAreFinished();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #318 <Method void stopAndWaitUntilConsumersAreFinished()>
		CommandMessage commandmessage = (CommandMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/CommandMessage);
	//    6   14:aload_0         
	//    7   15:getfield        #68  <Field MessageFactory messageFactory>
	//    8   18:ldc2            #320 <Class CommandMessage>
	//    9   21:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//   10   24:checkcast       #320 <Class CommandMessage>
	//   11   27:astore_1        
		commandmessage.set(1);
	//   12   28:aload_1         
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #322 <Method void CommandMessage.set(int)>
		messageQueue.post(((Message) (commandmessage)));
	//   15   33:aload_0         
	//   16   34:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   17   37:aload_1         
	//   18   38:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
		jobManagerThread.callbackManager.destroy();
	//   19   41:aload_0         
	//   20   42:getfield        #88  <Field JobManagerThread jobManagerThread>
	//   21   45:getfield        #214 <Field CallbackManager JobManagerThread.callbackManager>
	//   22   48:invokevirtual   #324 <Method void CallbackManager.destroy()>
	//   23   51:return          
	}

	public int getActiveConsumerCount()
	{
		assertNotInMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void assertNotInMainThread()>
		assertNotInJobManagerThread("Cannot call sync methods in JobManager's callback thread.");
	//    2    4:aload_0         
	//    3    5:ldc2            #327 <String "Cannot call sync methods in JobManager's callback thread.">
	//    4    8:invokespecial   #238 <Method void assertNotInJobManagerThread(String)>
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field MessageFactory messageFactory>
	//    7   15:ldc1            #207 <Class PublicQueryMessage>
	//    8   17:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    9   20:checkcast       #207 <Class PublicQueryMessage>
	//   10   23:astore_1        
		publicquerymessage.set(6, ((IntCallback) (null)));
	//   11   24:aload_1         
	//   12   25:bipush          6
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
		return (new IntQueryFuture(((MessageQueue) (messageQueue)), ((Message) (publicquerymessage)))).getSafe().intValue();
	//   15   31:new             #18  <Class JobManager$IntQueryFuture>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   19   39:aload_1         
	//   20   40:invokespecial   #222 <Method void JobManager$IntQueryFuture(MessageQueue, Message)>
	//   21   43:invokevirtual   #226 <Method Integer JobManager$IntQueryFuture.getSafe()>
	//   22   46:invokevirtual   #303 <Method int Integer.intValue()>
	//   23   49:ireturn         
	}

	public Thread getJobManagerExecutionThread()
	{
		return chefThread;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Thread chefThread>
	//    2    4:areturn         
	}

	public JobStatus getJobStatus(String s)
	{
		assertNotInMainThread();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void assertNotInMainThread()>
		assertNotInJobManagerThread("Cannot call getJobStatus on JobManager's thread");
	//    2    4:aload_0         
	//    3    5:ldc2            #332 <String "Cannot call getJobStatus on JobManager's thread">
	//    4    8:invokespecial   #238 <Method void assertNotInJobManagerThread(String)>
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field MessageFactory messageFactory>
	//    7   15:ldc1            #207 <Class PublicQueryMessage>
	//    8   17:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    9   20:checkcast       #207 <Class PublicQueryMessage>
	//   10   23:astore_2        
		publicquerymessage.set(4, s, ((IntCallback) (null)));
	//   11   24:aload_2         
	//   12   25:iconst_4        
	//   13   26:aload_1         
	//   14   27:aconst_null     
	//   15   28:invokevirtual   #335 <Method void PublicQueryMessage.set(int, String, IntCallback)>
		s = ((String) ((new IntQueryFuture(((MessageQueue) (messageQueue)), ((Message) (publicquerymessage)))).getSafe()));
	//   16   31:new             #18  <Class JobManager$IntQueryFuture>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   20   39:aload_2         
	//   21   40:invokespecial   #222 <Method void JobManager$IntQueryFuture(MessageQueue, Message)>
	//   22   43:invokevirtual   #226 <Method Integer JobManager$IntQueryFuture.getSafe()>
	//   23   46:astore_1        
		return JobStatus.values()[((Integer) (s)).intValue()];
	//   24   47:invokestatic    #341 <Method JobStatus[] JobStatus.values()>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #303 <Method int Integer.intValue()>
	//   27   54:aaload          
	//   28   55:areturn         
	}

	public Scheduler getScheduler()
	{
		return scheduler;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Scheduler scheduler>
	//    2    4:areturn         
	}

	void internalRunInJobManagerThread(Runnable runnable)
		throws Throwable
	{
		Throwable athrowable[] = new Throwable[1];
	//    0    0:iconst_1        
	//    1    1:anewarray       Throwable[]
	//    2    4:astore_2        
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field MessageFactory messageFactory>
	//    5    9:ldc1            #207 <Class PublicQueryMessage>
	//    6   11:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    7   14:checkcast       #207 <Class PublicQueryMessage>
	//    8   17:astore_3        
		publicquerymessage.set(101, ((IntCallback) (null)));
	//    9   18:aload_3         
	//   10   19:bipush          101
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
		((_cls6) (new IntQueryFuture(runnable, athrowable) {

			public void onResult(int i)
			{
				try
				{
					runnable.run();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field Runnable val$runnable>
			//    2    4:invokeinterface #38  <Method void Runnable.run()>
				}
			//*   3    9:aload_0         
			//*   4   10:iload_1         
			//*   5   11:invokespecial   #40  <Method void JobManager$IntQueryFuture.onResult(int)>
			//*   6   14:return          
				catch(Throwable throwable)
			//*   7   15:astore_2        
				{
					error[0] = throwable;
			//    8   16:aload_0         
			//    9   17:getfield        #24  <Field Throwable[] val$error>
			//   10   20:iconst_0        
			//   11   21:aload_2         
			//   12   22:aastore         
				}
				super.onResult(i);
			//*  13   23:goto            9
			}

			final JobManager this$0;
			final Throwable val$error[];
			final Runnable val$runnable;

			
			{
				this$0 = JobManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field JobManager this$0>
				runnable = runnable1;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #22  <Field Runnable val$runnable>
				error = athrowable;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #24  <Field Throwable[] val$error>
				super(final_messagequeue, ((Message) (final_publicquerymessage)));
			//    9   17:aload_0         
			//   10   18:aload_2         
			//   11   19:aload_3         
			//   12   20:invokespecial   #27  <Method void JobManager$IntQueryFuture(MessageQueue, Message)>
			//   13   23:return          
			}
		}
)).getSafe();
	//   13   25:new             #16  <Class JobManager$6>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   18   34:aload_3         
	//   19   35:aload_1         
	//   20   36:aload_2         
	//   21   37:invokespecial   #348 <Method void JobManager$6(JobManager, MessageQueue, PublicQueryMessage, Runnable, Throwable[])>
	//   22   40:invokevirtual   #349 <Method Integer JobManager$6.getSafe()>
	//   23   43:pop             
		if(athrowable[0] != null)
	//*  24   44:aload_2         
	//*  25   45:iconst_0        
	//*  26   46:aaload          
	//*  27   47:ifnull          54
			throw athrowable[0];
	//   28   50:aload_2         
	//   29   51:iconst_0        
	//   30   52:aaload          
	//   31   53:athrow          
		else
			return;
	//   32   54:return          
	}

	public boolean removeCallback(JobManagerCallback jobmanagercallback)
	{
		return jobManagerThread.removeCallback(jobmanagercallback);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field JobManagerThread jobManagerThread>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #354 <Method boolean JobManagerThread.removeCallback(JobManagerCallback)>
	//    4    8:ireturn         
	}

	public void start()
	{
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field MessageFactory messageFactory>
	//    2    4:ldc1            #207 <Class PublicQueryMessage>
	//    3    6:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    4    9:checkcast       #207 <Class PublicQueryMessage>
	//    5   12:astore_1        
		publicquerymessage.set(2, ((IntCallback) (null)));
	//    6   13:aload_1         
	//    7   14:iconst_2        
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
		messageQueue.post(((Message) (publicquerymessage)));
	//   10   19:aload_0         
	//   11   20:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
	//   14   27:return          
	}

	public void stop()
	{
		PublicQueryMessage publicquerymessage = (PublicQueryMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/PublicQueryMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field MessageFactory messageFactory>
	//    2    4:ldc1            #207 <Class PublicQueryMessage>
	//    3    6:invokevirtual   #163 <Method Message MessageFactory.obtain(Class)>
	//    4    9:checkcast       #207 <Class PublicQueryMessage>
	//    5   12:astore_1        
		publicquerymessage.set(3, ((IntCallback) (null)));
	//    6   13:aload_1         
	//    7   14:iconst_3        
	//    8   15:aconst_null     
	//    9   16:invokevirtual   #210 <Method void PublicQueryMessage.set(int, IntCallback)>
		messageQueue.post(((Message) (publicquerymessage)));
	//   10   19:aload_0         
	//   11   20:getfield        #81  <Field PriorityMessageQueue messageQueue>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #171 <Method void PriorityMessageQueue.post(Message)>
	//   14   27:return          
	}

	public void stopAndWaitUntilConsumersAreFinished()
	{
		waitUntilConsumersAreFinished(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #356 <Method void waitUntilConsumersAreFinished(boolean)>
	//    3    5:return          
	}

	public void waitUntilConsumersAreFinished()
	{
		waitUntilConsumersAreFinished(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #356 <Method void waitUntilConsumersAreFinished(boolean)>
	//    3    5:return          
	}

	public static final long MIN_DELAY_TO_USE_SCHEDULER_IN_MS = 30000L;
	public static final long NETWORK_CHECK_INTERVAL;
	public static final long NOT_DELAYED_JOB_DELAY = 0x0L;
	public static final long NOT_RUNNING_SESSION_ID = 0x0L;
	public static final long NS_PER_MS = 0xf4240L;
	private Thread chefThread;
	final JobManagerThread jobManagerThread;
	private final MessageFactory messageFactory = new MessageFactory();
	private final PriorityMessageQueue messageQueue;
	private Scheduler scheduler;

	static 
	{
		NETWORK_CHECK_INTERVAL = TimeUnit.MILLISECONDS.toNanos(10000L);
	//    0    0:getstatic       #50  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    1    3:ldc2w           #51  <Long 10000L>
	//    2    6:invokevirtual   #56  <Method long TimeUnit.toNanos(long)>
	//    3    9:putstatic       #58  <Field long NETWORK_CHECK_INTERVAL>
	//*   4   12:return          
	}


/*
	static void access$000(JobManager jobmanager, SchedulerConstraint schedulerconstraint)
	{
		jobmanager.dispatchSchedulerStart(schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method void dispatchSchedulerStart(SchedulerConstraint)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(JobManager jobmanager, SchedulerConstraint schedulerconstraint)
	{
		jobmanager.dispatchSchedulerStop(schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void dispatchSchedulerStop(SchedulerConstraint)>
		return;
	//    3    5:return          
	}

*/
}
