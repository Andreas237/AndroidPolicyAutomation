// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessageFactory;
import com.birbit.android.jobqueue.messaging.MessagePredicate;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.messaging.MessageQueueConsumer;
import com.birbit.android.jobqueue.messaging.SafeMessageQueue;
import com.birbit.android.jobqueue.messaging.Type;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;
import com.birbit.android.jobqueue.messaging.message.JobConsumerIdleMessage;
import com.birbit.android.jobqueue.messaging.message.RunJobMessage;
import com.birbit.android.jobqueue.messaging.message.RunJobResultMessage;
import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.birbit.android.jobqueue:
//			RunningJobSet, JobManagerThread, JobHolder, Job, 
//			TagConstraint, RetryConstraint

class ConsumerManager
{
	static class Consumer
		implements Runnable
	{

		private void handleCommand(CommandMessage commandmessage)
		{
			switch(commandmessage.getWhat())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #82  <Method int CommandMessage.getWhat()>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 29
		//		               2 37
			default:
				return;
		//    3   28:return          

			case 1: // '\001'
				messageQueue.stop();
		//    4   29:aload_0         
		//    5   30:getfield        #46  <Field SafeMessageQueue messageQueue>
		//    6   33:invokevirtual   #87  <Method void SafeMessageQueue.stop()>
				return;
		//    7   36:return          

			case 2: // '\002'
				JqLog.d("Consumer has been poked.", new Object[0]);
		//    8   37:ldc1            #89  <String "Consumer has been poked.">
		//    9   39:iconst_0        
		//   10   40:anewarray       Object[]
		//   11   43:invokestatic    #95  <Method void JqLog.d(String, Object[])>
				break;
			}
		//   12   46:return          
		}

		private void handleRunJob(RunJobMessage runjobmessage)
		{
			JqLog.d("running job %s", new Object[] {
				((Object) (runjobmessage.getJobHolder())).getClass().getSimpleName()
			});
		//    0    0:ldc1            #97  <String "running job %s">
		//    1    2:iconst_1        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_1         
		//    6    9:invokevirtual   #103 <Method JobHolder RunJobMessage.getJobHolder()>
		//    7   12:invokevirtual   #107 <Method Class Object.getClass()>
		//    8   15:invokevirtual   #113 <Method String Class.getSimpleName()>
		//    9   18:aastore         
		//   10   19:invokestatic    #95  <Method void JqLog.d(String, Object[])>
			runjobmessage = ((RunJobMessage) (runjobmessage.getJobHolder()));
		//   11   22:aload_1         
		//   12   23:invokevirtual   #103 <Method JobHolder RunJobMessage.getJobHolder()>
		//   13   26:astore_1        
			int i = ((JobHolder) (runjobmessage)).safeRun(((JobHolder) (runjobmessage)).getRunCount(), timer);
		//   14   27:aload_1         
		//   15   28:aload_1         
		//   16   29:invokevirtual   #118 <Method int JobHolder.getRunCount()>
		//   17   32:aload_0         
		//   18   33:getfield        #52  <Field Timer timer>
		//   19   36:invokevirtual   #122 <Method int JobHolder.safeRun(int, Timer)>
		//   20   39:istore_2        
			RunJobResultMessage runjobresultmessage = (RunJobResultMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/RunJobResultMessage);
		//   21   40:aload_0         
		//   22   41:getfield        #48  <Field MessageFactory factory>
		//   23   44:ldc1            #124 <Class RunJobResultMessage>
		//   24   46:invokevirtual   #130 <Method Message MessageFactory.obtain(Class)>
		//   25   49:checkcast       #124 <Class RunJobResultMessage>
		//   26   52:astore_3        
			runjobresultmessage.setJobHolder(((JobHolder) (runjobmessage)));
		//   27   53:aload_3         
		//   28   54:aload_1         
		//   29   55:invokevirtual   #134 <Method void RunJobResultMessage.setJobHolder(JobHolder)>
			runjobresultmessage.setResult(i);
		//   30   58:aload_3         
		//   31   59:iload_2         
		//   32   60:invokevirtual   #138 <Method void RunJobResultMessage.setResult(int)>
			runjobresultmessage.setWorker(((Object) (this)));
		//   33   63:aload_3         
		//   34   64:aload_0         
		//   35   65:invokevirtual   #142 <Method void RunJobResultMessage.setWorker(Object)>
			parentMessageQueue.post(((Message) (runjobresultmessage)));
		//   36   68:aload_0         
		//   37   69:getfield        #50  <Field MessageQueue parentMessageQueue>
		//   38   72:aload_3         
		//   39   73:invokeinterface #148 <Method void MessageQueue.post(Message)>
		//   40   78:return          
		}

		private void removePokeMessages()
		{
			messageQueue.cancelMessages(pokeMessagePredicate);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field SafeMessageQueue messageQueue>
		//    2    4:getstatic       #36  <Field MessagePredicate pokeMessagePredicate>
		//    3    7:invokevirtual   #152 <Method void SafeMessageQueue.cancelMessages(MessagePredicate)>
		//    4   10:return          
		}

		public void run()
		{
			messageQueue.consume(queueConsumer);
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field SafeMessageQueue messageQueue>
		//    2    4:aload_0         
		//    3    5:getfield        #44  <Field MessageQueueConsumer queueConsumer>
		//    4    8:invokevirtual   #157 <Method void SafeMessageQueue.consume(MessageQueueConsumer)>
		//    5   11:return          
		}

		static final MessagePredicate pokeMessagePredicate = new MessagePredicate() {

			public boolean onMessage(Message message)
			{
				return message.type == Type.COMMAND && ((CommandMessage)message).getWhat() == 2;
			//    0    0:aload_1         
			//    1    1:getfield        #24  <Field Type Message.type>
			//    2    4:getstatic       #29  <Field Type Type.COMMAND>
			//    3    7:if_acmpne       23
			//    4   10:aload_1         
			//    5   11:checkcast       #31  <Class CommandMessage>
			//    6   14:invokevirtual   #35  <Method int CommandMessage.getWhat()>
			//    7   17:iconst_2        
			//    8   18:icmpne          23
			//    9   21:iconst_1        
			//   10   22:ireturn         
			//   11   23:iconst_0        
			//   12   24:ireturn         
			}

		}
;
		final MessageFactory factory;
		boolean hasJob;
		long lastJobCompleted;
		final SafeMessageQueue messageQueue;
		final MessageQueue parentMessageQueue;
		final MessageQueueConsumer queueConsumer = new _cls2();
		final Timer timer;

		static 
		{
		//    0    0:new             #11  <Class ConsumerManager$Consumer$1>
		//    1    3:dup             
		//    2    4:invokespecial   #34  <Method void ConsumerManager$Consumer$1()>
		//    3    7:putstatic       #36  <Field MessagePredicate pokeMessagePredicate>
		//*   4   10:return          
		}


/*
		static void access$000(Consumer consumer, RunJobMessage runjobmessage)
		{
			consumer.handleRunJob(runjobmessage);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #66  <Method void handleRunJob(RunJobMessage)>
			return;
		//    3    5:return          
		}

*/


/*
		static void access$100(Consumer consumer)
		{
			consumer.removePokeMessages();
		//    0    0:aload_0         
		//    1    1:invokespecial   #70  <Method void removePokeMessages()>
			return;
		//    2    4:return          
		}

*/


/*
		static void access$200(Consumer consumer, CommandMessage commandmessage)
		{
			consumer.handleCommand(commandmessage);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #76  <Method void handleCommand(CommandMessage)>
			return;
		//    3    5:return          
		}

*/

		public Consumer(MessageQueue messagequeue, SafeMessageQueue safemessagequeue, MessageFactory messagefactory, Timer timer1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #13  <Class ConsumerManager$Consumer$2>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #42  <Method void ConsumerManager$Consumer$2(ConsumerManager$Consumer)>
		//    7   13:putfield        #44  <Field MessageQueueConsumer queueConsumer>
			messageQueue = safemessagequeue;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #46  <Field SafeMessageQueue messageQueue>
			factory = messagefactory;
		//   11   21:aload_0         
		//   12   22:aload_3         
		//   13   23:putfield        #48  <Field MessageFactory factory>
			parentMessageQueue = messagequeue;
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:putfield        #50  <Field MessageQueue parentMessageQueue>
			timer = timer1;
		//   17   31:aload_0         
		//   18   32:aload           4
		//   19   34:putfield        #52  <Field Timer timer>
			lastJobCompleted = timer1.nanoTime();
		//   20   37:aload_0         
		//   21   38:aload           4
		//   22   40:invokeinterface #58  <Method long Timer.nanoTime()>
		//   23   45:putfield        #60  <Field long lastJobCompleted>
		//   24   48:return          
		}
	}


	ConsumerManager(JobManagerThread jobmanagerthread, Timer timer1, MessageFactory messagefactory, Configuration configuration)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		waitingConsumers = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #49  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #50  <Method void ArrayList()>
	//    6   12:putfield        #52  <Field List waitingConsumers>
	//    7   15:aload_0         
	//    8   16:new             #49  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #50  <Method void ArrayList()>
	//   11   23:putfield        #54  <Field List consumers>
	//   12   26:aload_0         
	//   13   27:new             #56  <Class CopyOnWriteArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #57  <Method void CopyOnWriteArrayList()>
	//   16   34:putfield        #59  <Field CopyOnWriteArrayList internalZeroConsumersListeners>
		jobManagerThread = jobmanagerthread;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #61  <Field JobManagerThread jobManagerThread>
		timer = timer1;
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:putfield        #63  <Field Timer timer>
		factory = messagefactory;
	//   23   47:aload_0         
	//   24   48:aload_3         
	//   25   49:putfield        #65  <Field MessageFactory factory>
		loadFactor = configuration.getLoadFactor();
	//   26   52:aload_0         
	//   27   53:aload           4
	//   28   55:invokevirtual   #71  <Method int Configuration.getLoadFactor()>
	//   29   58:putfield        #73  <Field int loadFactor>
		minConsumerCount = configuration.getMinConsumerCount();
	//   30   61:aload_0         
	//   31   62:aload           4
	//   32   64:invokevirtual   #76  <Method int Configuration.getMinConsumerCount()>
	//   33   67:putfield        #78  <Field int minConsumerCount>
		maxConsumerCount = configuration.getMaxConsumerCount();
	//   34   70:aload_0         
	//   35   71:aload           4
	//   36   73:invokevirtual   #81  <Method int Configuration.getMaxConsumerCount()>
	//   37   76:putfield        #83  <Field int maxConsumerCount>
		consumerKeepAliveNs = (long)(configuration.getConsumerKeepAlive() * 1000) * 0xf4240L;
	//   38   79:aload_0         
	//   39   80:aload           4
	//   40   82:invokevirtual   #86  <Method int Configuration.getConsumerKeepAlive()>
	//   41   85:sipush          1000
	//   42   88:imul            
	//   43   89:i2l             
	//   44   90:ldc2w           #87  <Long 0xf4240L>
	//   45   93:lmul            
	//   46   94:putfield        #90  <Field long consumerKeepAliveNs>
		threadPriority = configuration.getThreadPriority();
	//   47   97:aload_0         
	//   48   98:aload           4
	//   49  100:invokevirtual   #93  <Method int Configuration.getThreadPriority()>
	//   50  103:putfield        #95  <Field int threadPriority>
		threadFactory = configuration.getThreadFactory();
	//   51  106:aload_0         
	//   52  107:aload           4
	//   53  109:invokevirtual   #99  <Method ThreadFactory Configuration.getThreadFactory()>
	//   54  112:putfield        #101 <Field ThreadFactory threadFactory>
	//   55  115:aload_0         
	//   56  116:new             #103 <Class HashMap>
	//   57  119:dup             
	//   58  120:invokespecial   #104 <Method void HashMap()>
	//   59  123:putfield        #106 <Field Map runningJobHolders>
		runningJobGroups = new RunningJobSet(timer1);
	//   60  126:aload_0         
	//   61  127:new             #108 <Class RunningJobSet>
	//   62  130:dup             
	//   63  131:aload_2         
	//   64  132:invokespecial   #111 <Method void RunningJobSet(Timer)>
	//   65  135:putfield        #113 <Field RunningJobSet runningJobGroups>
	//   66  138:aload_0         
	//   67  139:new             #115 <Class ThreadGroup>
	//   68  142:dup             
	//   69  143:ldc1            #117 <String "JobConsumers">
	//   70  145:invokespecial   #120 <Method void ThreadGroup(String)>
	//   71  148:putfield        #122 <Field ThreadGroup threadGroup>
	//   72  151:return          
	}

	private void addWorker()
	{
		JqLog.d("adding another consumer", new Object[0]);
	//    0    0:ldc1            #126 <String "adding another consumer">
	//    1    2:iconst_0        
	//    2    3:anewarray       Object[]
	//    3    6:invokestatic    #132 <Method void JqLog.d(String, Object[])>
		Consumer consumer = new Consumer(((MessageQueue) (jobManagerThread.messageQueue)), new SafeMessageQueue(timer, factory, "consumer"), factory, timer);
	//    4    9:new             #8   <Class ConsumerManager$Consumer>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:getfield        #61  <Field JobManagerThread jobManagerThread>
	//    8   17:getfield        #138 <Field com.birbit.android.jobqueue.messaging.PriorityMessageQueue JobManagerThread.messageQueue>
	//    9   20:new             #140 <Class SafeMessageQueue>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:getfield        #63  <Field Timer timer>
	//   13   28:aload_0         
	//   14   29:getfield        #65  <Field MessageFactory factory>
	//   15   32:ldc1            #142 <String "consumer">
	//   16   34:invokespecial   #145 <Method void SafeMessageQueue(Timer, MessageFactory, String)>
	//   17   37:aload_0         
	//   18   38:getfield        #65  <Field MessageFactory factory>
	//   19   41:aload_0         
	//   20   42:getfield        #63  <Field Timer timer>
	//   21   45:invokespecial   #148 <Method void ConsumerManager$Consumer(MessageQueue, SafeMessageQueue, MessageFactory, Timer)>
	//   22   48:astore_2        
		Thread thread;
		if(threadFactory != null)
	//*  23   49:aload_0         
	//*  24   50:getfield        #101 <Field ThreadFactory threadFactory>
	//*  25   53:ifnull          83
		{
			thread = threadFactory.newThread(((Runnable) (consumer)));
	//   26   56:aload_0         
	//   27   57:getfield        #101 <Field ThreadFactory threadFactory>
	//   28   60:aload_2         
	//   29   61:invokeinterface #154 <Method Thread ThreadFactory.newThread(Runnable)>
	//   30   66:astore_1        
		} else
	//*  31   67:aload_0         
	//*  32   68:getfield        #54  <Field List consumers>
	//*  33   71:aload_2         
	//*  34   72:invokeinterface #160 <Method boolean List.add(Object)>
	//*  35   77:pop             
	//*  36   78:aload_1         
	//*  37   79:invokevirtual   #165 <Method void Thread.start()>
	//*  38   82:return          
		{
			thread = new Thread(threadGroup, ((Runnable) (consumer)), (new StringBuilder()).append("job-queue-worker-").append(((Object) (UUID.randomUUID()))).toString());
	//   39   83:new             #162 <Class Thread>
	//   40   86:dup             
	//   41   87:aload_0         
	//   42   88:getfield        #122 <Field ThreadGroup threadGroup>
	//   43   91:aload_2         
	//   44   92:new             #167 <Class StringBuilder>
	//   45   95:dup             
	//   46   96:invokespecial   #168 <Method void StringBuilder()>
	//   47   99:ldc1            #170 <String "job-queue-worker-">
	//   48  101:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
	//   49  104:invokestatic    #180 <Method UUID UUID.randomUUID()>
	//   50  107:invokevirtual   #183 <Method StringBuilder StringBuilder.append(Object)>
	//   51  110:invokevirtual   #187 <Method String StringBuilder.toString()>
	//   52  113:invokespecial   #190 <Method void Thread(ThreadGroup, Runnable, String)>
	//   53  116:astore_1        
			thread.setPriority(threadPriority);
	//   54  117:aload_1         
	//   55  118:aload_0         
	//   56  119:getfield        #95  <Field int threadPriority>
	//   57  122:invokevirtual   #194 <Method void Thread.setPriority(int)>
		}
		consumers.add(((Object) (consumer)));
		thread.start();
	//*  58  125:goto            67
	}

	private boolean considerAddingConsumers(boolean flag)
	{
		JqLog.d("considering adding a new consumer. Should poke all waiting? %s isRunning? %s waiting workers? %d", new Object[] {
			Boolean.valueOf(flag), Boolean.valueOf(jobManagerThread.isRunning()), Integer.valueOf(waitingConsumers.size())
		});
	//    0    0:ldc1            #198 <String "considering adding a new consumer. Should poke all waiting? %s isRunning? %s waiting workers? %d">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:iload_1         
	//    6    9:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #61  <Field JobManagerThread jobManagerThread>
	//   12   19:invokevirtual   #208 <Method boolean JobManagerThread.isRunning()>
	//   13   22:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_0         
	//   18   29:getfield        #52  <Field List waitingConsumers>
	//   19   32:invokeinterface #211 <Method int List.size()>
	//   20   37:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//   21   40:aastore         
	//   22   41:invokestatic    #132 <Method void JqLog.d(String, Object[])>
		if(jobManagerThread.isRunning()) goto _L2; else goto _L1
	//   23   44:aload_0         
	//   24   45:getfield        #61  <Field JobManagerThread jobManagerThread>
	//   25   48:invokevirtual   #208 <Method boolean JobManagerThread.isRunning()>
	//   26   51:ifne            65
_L1:
		JqLog.d("jobqueue is not running, no consumers will be added", new Object[0]);
	//   27   54:ldc1            #218 <String "jobqueue is not running, no consumers will be added">
	//   28   56:iconst_0        
	//   29   57:anewarray       Object[]
	//   30   60:invokestatic    #132 <Method void JqLog.d(String, Object[])>
_L4:
		return false;
	//   31   63:iconst_0        
	//   32   64:ireturn         
_L2:
		if(waitingConsumers.size() > 0)
	//*  33   65:aload_0         
	//*  34   66:getfield        #52  <Field List waitingConsumers>
	//*  35   69:invokeinterface #211 <Method int List.size()>
	//*  36   74:ifle            167
		{
			JqLog.d("there are waiting workers, will poke them instead", new Object[0]);
	//   37   77:ldc1            #220 <String "there are waiting workers, will poke them instead">
	//   38   79:iconst_0        
	//   39   80:anewarray       Object[]
	//   40   83:invokestatic    #132 <Method void JqLog.d(String, Object[])>
			int i = waitingConsumers.size() - 1;
	//   41   86:aload_0         
	//   42   87:getfield        #52  <Field List waitingConsumers>
	//   43   90:invokeinterface #211 <Method int List.size()>
	//   44   95:iconst_1        
	//   45   96:isub            
	//   46   97:istore_2        
			do
			{
label0:
				{
					if(i >= 0)
	//*  47   98:iload_2         
	//*  48   99:iflt            149
					{
						Consumer consumer = (Consumer)waitingConsumers.remove(i);
	//   49  102:aload_0         
	//   50  103:getfield        #52  <Field List waitingConsumers>
	//   51  106:iload_2         
	//   52  107:invokeinterface #224 <Method Object List.remove(int)>
	//   53  112:checkcast       #8   <Class ConsumerManager$Consumer>
	//   54  115:astore_3        
						CommandMessage commandmessage = (CommandMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CommandMessage);
	//   55  116:aload_0         
	//   56  117:getfield        #65  <Field MessageFactory factory>
	//   57  120:ldc1            #226 <Class CommandMessage>
	//   58  122:invokevirtual   #232 <Method Message MessageFactory.obtain(Class)>
	//   59  125:checkcast       #226 <Class CommandMessage>
	//   60  128:astore          4
						commandmessage.set(2);
	//   61  130:aload           4
	//   62  132:iconst_2        
	//   63  133:invokevirtual   #235 <Method void CommandMessage.set(int)>
						consumer.messageQueue.post(((Message) (commandmessage)));
	//   64  136:aload_3         
	//   65  137:getfield        #238 <Field SafeMessageQueue ConsumerManager$Consumer.messageQueue>
	//   66  140:aload           4
	//   67  142:invokevirtual   #242 <Method void SafeMessageQueue.post(Message)>
						if(flag)
							break label0;
	//   68  145:iload_1         
	//   69  146:ifne            160
					}
					JqLog.d("there were waiting workers, poked them and I'm done", new Object[0]);
	//   70  149:ldc1            #244 <String "there were waiting workers, poked them and I'm done">
	//   71  151:iconst_0        
	//   72  152:anewarray       Object[]
	//   73  155:invokestatic    #132 <Method void JqLog.d(String, Object[])>
					return true;
	//   74  158:iconst_1        
	//   75  159:ireturn         
				}
				i--;
	//   76  160:iload_2         
	//   77  161:iconst_1        
	//   78  162:isub            
	//   79  163:istore_2        
			} while(true);
	//   80  164:goto            98
		}
		flag = isAboveLoadFactor();
	//   81  167:aload_0         
	//   82  168:invokespecial   #247 <Method boolean isAboveLoadFactor()>
	//   83  171:istore_1        
		JqLog.d("nothing has been poked. are we above load factor? %s", new Object[] {
			Boolean.valueOf(flag)
		});
	//   84  172:ldc1            #249 <String "nothing has been poked. are we above load factor? %s">
	//   85  174:iconst_1        
	//   86  175:anewarray       Object[]
	//   87  178:dup             
	//   88  179:iconst_0        
	//   89  180:iload_1         
	//   90  181:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//   91  184:aastore         
	//   92  185:invokestatic    #132 <Method void JqLog.d(String, Object[])>
		if(flag)
	//*  93  188:iload_1         
	//*  94  189:ifeq            63
		{
			addWorker();
	//   95  192:aload_0         
	//   96  193:invokespecial   #251 <Method void addWorker()>
			return true;
	//   97  196:iconst_1        
	//   98  197:ireturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	private boolean isAboveLoadFactor()
	{
		int i = consumers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List consumers>
	//    2    4:invokeinterface #211 <Method int List.size()>
	//    3    9:istore_1        
		if(i >= maxConsumerCount)
	//*   4   10:iload_1         
	//*   5   11:aload_0         
	//*   6   12:getfield        #83  <Field int maxConsumerCount>
	//*   7   15:icmplt          36
		{
			JqLog.d("too many consumers, clearly above load factor %s", new Object[] {
				Integer.valueOf(i)
			});
	//    8   18:ldc1            #253 <String "too many consumers, clearly above load factor %s">
	//    9   20:iconst_1        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:iload_1         
	//   14   27:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//   15   30:aastore         
	//   16   31:invokestatic    #132 <Method void JqLog.d(String, Object[])>
			return false;
	//   17   34:iconst_0        
	//   18   35:ireturn         
		}
		int j = jobManagerThread.countRemainingReadyJobs();
	//   19   36:aload_0         
	//   20   37:getfield        #61  <Field JobManagerThread jobManagerThread>
	//   21   40:invokevirtual   #256 <Method int JobManagerThread.countRemainingReadyJobs()>
	//   22   43:istore_2        
		int k = runningJobHolders.size();
	//   23   44:aload_0         
	//   24   45:getfield        #106 <Field Map runningJobHolders>
	//   25   48:invokeinterface #259 <Method int Map.size()>
	//   26   53:istore_3        
		boolean flag;
		if(loadFactor * i < j + k || i < minConsumerCount && i < j + k)
	//*  27   54:aload_0         
	//*  28   55:getfield        #73  <Field int loadFactor>
	//*  29   58:iload_1         
	//*  30   59:imul            
	//*  31   60:iload_2         
	//*  32   61:iload_3         
	//*  33   62:iadd            
	//*  34   63:icmplt          81
	//*  35   66:iload_1         
	//*  36   67:aload_0         
	//*  37   68:getfield        #78  <Field int minConsumerCount>
	//*  38   71:icmpge          158
	//*  39   74:iload_1         
	//*  40   75:iload_2         
	//*  41   76:iload_3         
	//*  42   77:iadd            
	//*  43   78:icmpge          158
			flag = true;
	//   44   81:iconst_1        
	//   45   82:istore          4
		else
	//*  46   84:ldc2            #261 <String "check above load factor: totalCons:%s minCons:%s maxConsCount: %s, loadFactor %s remainingJobs: %s running holders: %s. isAbove:%s">
	//*  47   87:bipush          7
	//*  48   89:anewarray       Object[]
	//*  49   92:dup             
	//*  50   93:iconst_0        
	//*  51   94:iload_1         
	//*  52   95:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//*  53   98:aastore         
	//*  54   99:dup             
	//*  55  100:iconst_1        
	//*  56  101:aload_0         
	//*  57  102:getfield        #78  <Field int minConsumerCount>
	//*  58  105:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//*  59  108:aastore         
	//*  60  109:dup             
	//*  61  110:iconst_2        
	//*  62  111:aload_0         
	//*  63  112:getfield        #83  <Field int maxConsumerCount>
	//*  64  115:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//*  65  118:aastore         
	//*  66  119:dup             
	//*  67  120:iconst_3        
	//*  68  121:aload_0         
	//*  69  122:getfield        #73  <Field int loadFactor>
	//*  70  125:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//*  71  128:aastore         
	//*  72  129:dup             
	//*  73  130:iconst_4        
	//*  74  131:iload_2         
	//*  75  132:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//*  76  135:aastore         
	//*  77  136:dup             
	//*  78  137:iconst_5        
	//*  79  138:iload_3         
	//*  80  139:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//*  81  142:aastore         
	//*  82  143:dup             
	//*  83  144:bipush          6
	//*  84  146:iload           4
	//*  85  148:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//*  86  151:aastore         
	//*  87  152:invokestatic    #132 <Method void JqLog.d(String, Object[])>
	//*  88  155:iload           4
	//*  89  157:ireturn         
			flag = false;
	//   90  158:iconst_0        
	//   91  159:istore          4
		JqLog.d("check above load factor: totalCons:%s minCons:%s maxConsCount: %s, loadFactor %s remainingJobs: %s running holders: %s. isAbove:%s", new Object[] {
			Integer.valueOf(i), Integer.valueOf(minConsumerCount), Integer.valueOf(maxConsumerCount), Integer.valueOf(loadFactor), Integer.valueOf(j), Integer.valueOf(k), Boolean.valueOf(flag)
		});
		return flag;
	//*  92  161:goto            84
	}

	private Set markJobsCancelled(TagConstraint tagconstraint, String as[], boolean flag)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #265 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #266 <Method void HashSet()>
	//    3    7:astore          4
		Iterator iterator = runningJobHolders.values().iterator();
	//    4    9:aload_0         
	//    5   10:getfield        #106 <Field Map runningJobHolders>
	//    6   13:invokeinterface #270 <Method Collection Map.values()>
	//    7   18:invokeinterface #276 <Method Iterator Collection.iterator()>
	//    8   23:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   25:aload           5
	//   10   27:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//   11   32:ifeq            138
			JobHolder jobholder = (JobHolder)iterator.next();
	//   12   35:aload           5
	//   13   37:invokeinterface #285 <Method Object Iterator.next()>
	//   14   42:checkcast       #287 <Class JobHolder>
	//   15   45:astore          6
			JqLog.d("checking job tag %s. tags of job: %s", new Object[] {
				jobholder.getJob(), jobholder.getJob().getTags()
			});
	//   16   47:ldc2            #289 <String "checking job tag %s. tags of job: %s">
	//   17   50:iconst_2        
	//   18   51:anewarray       Object[]
	//   19   54:dup             
	//   20   55:iconst_0        
	//   21   56:aload           6
	//   22   58:invokevirtual   #293 <Method Job JobHolder.getJob()>
	//   23   61:aastore         
	//   24   62:dup             
	//   25   63:iconst_1        
	//   26   64:aload           6
	//   27   66:invokevirtual   #293 <Method Job JobHolder.getJob()>
	//   28   69:invokevirtual   #299 <Method Set Job.getTags()>
	//   29   72:aastore         
	//   30   73:invokestatic    #132 <Method void JqLog.d(String, Object[])>
			if(jobholder.hasTags() && !jobholder.isCancelled() && tagconstraint.matches(as, jobholder.getTags()))
	//*  31   76:aload           6
	//*  32   78:invokevirtual   #302 <Method boolean JobHolder.hasTags()>
	//*  33   81:ifeq            25
	//*  34   84:aload           6
	//*  35   86:invokevirtual   #305 <Method boolean JobHolder.isCancelled()>
	//*  36   89:ifne            25
	//*  37   92:aload_1         
	//*  38   93:aload_2         
	//*  39   94:aload           6
	//*  40   96:invokevirtual   #306 <Method Set JobHolder.getTags()>
	//*  41   99:invokevirtual   #312 <Method boolean TagConstraint.matches(String[], Set)>
	//*  42  102:ifeq            25
			{
				((Set) (hashset)).add(((Object) (jobholder.getId())));
	//   43  105:aload           4
	//   44  107:aload           6
	//   45  109:invokevirtual   #315 <Method String JobHolder.getId()>
	//   46  112:invokeinterface #318 <Method boolean Set.add(Object)>
	//   47  117:pop             
				if(flag)
	//*  48  118:iload_3         
	//*  49  119:ifeq            130
					jobholder.markAsCancelledSingleId();
	//   50  122:aload           6
	//   51  124:invokevirtual   #321 <Method void JobHolder.markAsCancelledSingleId()>
				else
	//*  52  127:goto            25
					jobholder.markAsCancelled();
	//   53  130:aload           6
	//   54  132:invokevirtual   #324 <Method void JobHolder.markAsCancelled()>
			}
		} while(true);
	//   55  135:goto            25
		return ((Set) (hashset));
	//   56  138:aload           4
	//   57  140:areturn         
	}

	void addNoConsumersListener(Runnable runnable)
	{
		internalZeroConsumersListeners.add(((Object) (runnable)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field CopyOnWriteArrayList internalZeroConsumersListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #329 <Method boolean CopyOnWriteArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public boolean areAllConsumersIdle()
	{
		return waitingConsumers.size() == consumers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field List waitingConsumers>
	//    2    4:invokeinterface #211 <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #54  <Field List consumers>
	//    5   13:invokeinterface #211 <Method int List.size()>
	//    6   18:icmpne          23
	//    7   21:iconst_1        
	//    8   22:ireturn         
	//    9   23:iconst_0        
	//   10   24:ireturn         
	}

	public int getWorkerCount()
	{
		return consumers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field List consumers>
	//    2    4:invokeinterface #211 <Method int List.size()>
	//    3    9:ireturn         
	}

	boolean handleConstraintChange()
	{
		return considerAddingConsumers(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #334 <Method boolean considerAddingConsumers(boolean)>
	//    3    5:ireturn         
	}

	boolean handleIdle(JobConsumerIdleMessage jobconsumeridlemessage)
	{
		Consumer consumer = (Consumer)jobconsumeridlemessage.getWorker();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #342 <Method Object JobConsumerIdleMessage.getWorker()>
	//    2    4:checkcast       #8   <Class ConsumerManager$Consumer>
	//    3    7:astore          8
		if(consumer.hasJob)
	//*   4    9:aload           8
	//*   5   11:getfield        #346 <Field boolean ConsumerManager$Consumer.hasJob>
	//*   6   14:ifeq            19
			return true;
	//    7   17:iconst_1        
	//    8   18:ireturn         
		JobHolder jobholder = null;
	//    9   19:aconst_null     
	//   10   20:astore          7
		boolean flag2 = jobManagerThread.isRunning();
	//   11   22:aload_0         
	//   12   23:getfield        #61  <Field JobManagerThread jobManagerThread>
	//   13   26:invokevirtual   #208 <Method boolean JobManagerThread.isRunning()>
	//   14   29:istore          4
		if(flag2)
	//*  15   31:iload           4
	//*  16   33:ifeq            52
			jobholder = jobManagerThread.getNextJob(runningJobGroups.getSafe());
	//   17   36:aload_0         
	//   18   37:getfield        #61  <Field JobManagerThread jobManagerThread>
	//   19   40:aload_0         
	//   20   41:getfield        #113 <Field RunningJobSet runningJobGroups>
	//   21   44:invokevirtual   #349 <Method Collection RunningJobSet.getSafe()>
	//   22   47:invokevirtual   #353 <Method JobHolder JobManagerThread.getNextJob(Collection)>
	//   23   50:astore          7
		if(jobholder != null)
	//*  24   52:aload           7
	//*  25   54:ifnull          146
		{
			consumer.hasJob = true;
	//   26   57:aload           8
	//   27   59:iconst_1        
	//   28   60:putfield        #346 <Field boolean ConsumerManager$Consumer.hasJob>
			runningJobGroups.add(jobholder.getGroupId());
	//   29   63:aload_0         
	//   30   64:getfield        #113 <Field RunningJobSet runningJobGroups>
	//   31   67:aload           7
	//   32   69:invokevirtual   #356 <Method String JobHolder.getGroupId()>
	//   33   72:invokevirtual   #358 <Method void RunningJobSet.add(String)>
			jobconsumeridlemessage = ((JobConsumerIdleMessage) ((RunJobMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/RunJobMessage)));
	//   34   75:aload_0         
	//   35   76:getfield        #65  <Field MessageFactory factory>
	//   36   79:ldc2            #360 <Class RunJobMessage>
	//   37   82:invokevirtual   #232 <Method Message MessageFactory.obtain(Class)>
	//   38   85:checkcast       #360 <Class RunJobMessage>
	//   39   88:astore_1        
			((RunJobMessage) (jobconsumeridlemessage)).setJobHolder(jobholder);
	//   40   89:aload_1         
	//   41   90:aload           7
	//   42   92:invokevirtual   #364 <Method void RunJobMessage.setJobHolder(JobHolder)>
			runningJobHolders.put(((Object) (jobholder.getJob().getId())), ((Object) (jobholder)));
	//   43   95:aload_0         
	//   44   96:getfield        #106 <Field Map runningJobHolders>
	//   45   99:aload           7
	//   46  101:invokevirtual   #293 <Method Job JobHolder.getJob()>
	//   47  104:invokevirtual   #365 <Method String Job.getId()>
	//   48  107:aload           7
	//   49  109:invokeinterface #369 <Method Object Map.put(Object, Object)>
	//   50  114:pop             
			if(jobholder.getGroupId() != null)
	//*  51  115:aload           7
	//*  52  117:invokevirtual   #356 <Method String JobHolder.getGroupId()>
	//*  53  120:ifnull          135
				runningJobGroups.add(jobholder.getGroupId());
	//   54  123:aload_0         
	//   55  124:getfield        #113 <Field RunningJobSet runningJobGroups>
	//   56  127:aload           7
	//   57  129:invokevirtual   #356 <Method String JobHolder.getGroupId()>
	//   58  132:invokevirtual   #358 <Method void RunningJobSet.add(String)>
			consumer.messageQueue.post(((Message) (jobconsumeridlemessage)));
	//   59  135:aload           8
	//   60  137:getfield        #238 <Field SafeMessageQueue ConsumerManager$Consumer.messageQueue>
	//   61  140:aload_1         
	//   62  141:invokevirtual   #242 <Method void SafeMessageQueue.post(Message)>
			return true;
	//   63  144:iconst_1        
	//   64  145:ireturn         
		}
		long l = jobconsumeridlemessage.getLastJobCompleted() + consumerKeepAliveNs;
	//   65  146:aload_1         
	//   66  147:invokevirtual   #373 <Method long JobConsumerIdleMessage.getLastJobCompleted()>
	//   67  150:aload_0         
	//   68  151:getfield        #90  <Field long consumerKeepAliveNs>
	//   69  154:ladd            
	//   70  155:lstore          5
		JqLog.d("keep alive: %s", new Object[] {
			Long.valueOf(l)
		});
	//   71  157:ldc2            #375 <String "keep alive: %s">
	//   72  160:iconst_1        
	//   73  161:anewarray       Object[]
	//   74  164:dup             
	//   75  165:iconst_0        
	//   76  166:lload           5
	//   77  168:invokestatic    #380 <Method Long Long.valueOf(long)>
	//   78  171:aastore         
	//   79  172:invokestatic    #132 <Method void JqLog.d(String, Object[])>
		boolean flag;
		boolean flag1;
		if(consumers.size() > minConsumerCount)
	//*  80  175:aload_0         
	//*  81  176:getfield        #54  <Field List consumers>
	//*  82  179:invokeinterface #211 <Method int List.size()>
	//*  83  184:aload_0         
	//*  84  185:getfield        #78  <Field int minConsumerCount>
	//*  85  188:icmple          377
			flag = true;
	//   86  191:iconst_1        
	//   87  192:istore_2        
		else
	//*  88  193:iload           4
	//*  89  195:ifeq            217
	//*  90  198:iload_2         
	//*  91  199:ifeq            382
	//*  92  202:lload           5
	//*  93  204:aload_0         
	//*  94  205:getfield        #63  <Field Timer timer>
	//*  95  208:invokeinterface #385 <Method long Timer.nanoTime()>
	//*  96  213:lcmp            
	//*  97  214:ifge            382
	//*  98  217:iconst_1        
	//*  99  218:istore_3        
	//* 100  219:ldc2            #387 <String "Consumer idle, will kill? %s . isRunning: %s">
	//* 101  222:iconst_2        
	//* 102  223:anewarray       Object[]
	//* 103  226:dup             
	//* 104  227:iconst_0        
	//* 105  228:iload_3         
	//* 106  229:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//* 107  232:aastore         
	//* 108  233:dup             
	//* 109  234:iconst_1        
	//* 110  235:iload           4
	//* 111  237:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//* 112  240:aastore         
	//* 113  241:invokestatic    #132 <Method void JqLog.d(String, Object[])>
	//* 114  244:iload_3         
	//* 115  245:ifeq            387
	//* 116  248:aload_0         
	//* 117  249:getfield        #65  <Field MessageFactory factory>
	//* 118  252:ldc1            #226 <Class CommandMessage>
	//* 119  254:invokevirtual   #232 <Method Message MessageFactory.obtain(Class)>
	//* 120  257:checkcast       #226 <Class CommandMessage>
	//* 121  260:astore_1        
	//* 122  261:aload_1         
	//* 123  262:iconst_1        
	//* 124  263:invokevirtual   #235 <Method void CommandMessage.set(int)>
	//* 125  266:aload           8
	//* 126  268:getfield        #238 <Field SafeMessageQueue ConsumerManager$Consumer.messageQueue>
	//* 127  271:aload_1         
	//* 128  272:invokevirtual   #242 <Method void SafeMessageQueue.post(Message)>
	//* 129  275:aload_0         
	//* 130  276:getfield        #52  <Field List waitingConsumers>
	//* 131  279:aload           8
	//* 132  281:invokeinterface #389 <Method boolean List.remove(Object)>
	//* 133  286:pop             
	//* 134  287:aload_0         
	//* 135  288:getfield        #54  <Field List consumers>
	//* 136  291:aload           8
	//* 137  293:invokeinterface #389 <Method boolean List.remove(Object)>
	//* 138  298:pop             
	//* 139  299:ldc2            #391 <String "killed consumers. remaining consumers %d">
	//* 140  302:iconst_1        
	//* 141  303:anewarray       Object[]
	//* 142  306:dup             
	//* 143  307:iconst_0        
	//* 144  308:aload_0         
	//* 145  309:getfield        #54  <Field List consumers>
	//* 146  312:invokeinterface #211 <Method int List.size()>
	//* 147  317:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//* 148  320:aastore         
	//* 149  321:invokestatic    #132 <Method void JqLog.d(String, Object[])>
	//* 150  324:aload_0         
	//* 151  325:getfield        #54  <Field List consumers>
	//* 152  328:invokeinterface #394 <Method boolean List.isEmpty()>
	//* 153  333:ifeq            494
	//* 154  336:aload_0         
	//* 155  337:getfield        #59  <Field CopyOnWriteArrayList internalZeroConsumersListeners>
	//* 156  340:ifnull          494
	//* 157  343:aload_0         
	//* 158  344:getfield        #59  <Field CopyOnWriteArrayList internalZeroConsumersListeners>
	//* 159  347:invokevirtual   #395 <Method Iterator CopyOnWriteArrayList.iterator()>
	//* 160  350:astore_1        
	//* 161  351:aload_1         
	//* 162  352:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//* 163  357:ifeq            494
	//* 164  360:aload_1         
	//* 165  361:invokeinterface #285 <Method Object Iterator.next()>
	//* 166  366:checkcast       #397 <Class Runnable>
	//* 167  369:invokeinterface #400 <Method void Runnable.run()>
	//* 168  374:goto            351
			flag = false;
	//  169  377:iconst_0        
	//  170  378:istore_2        
		if(!flag2 || flag && l < timer.nanoTime())
			flag1 = true;
		else
	//* 171  379:goto            193
			flag1 = false;
	//  172  382:iconst_0        
	//  173  383:istore_3        
		JqLog.d("Consumer idle, will kill? %s . isRunning: %s", new Object[] {
			Boolean.valueOf(flag1), Boolean.valueOf(flag2)
		});
		if(flag1)
		{
			jobconsumeridlemessage = ((JobConsumerIdleMessage) ((CommandMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CommandMessage)));
			((CommandMessage) (jobconsumeridlemessage)).set(1);
			consumer.messageQueue.post(((Message) (jobconsumeridlemessage)));
			waitingConsumers.remove(((Object) (consumer)));
			consumers.remove(((Object) (consumer)));
			JqLog.d("killed consumers. remaining consumers %d", new Object[] {
				Integer.valueOf(consumers.size())
			});
			if(consumers.isEmpty() && internalZeroConsumersListeners != null)
				for(jobconsumeridlemessage = ((JobConsumerIdleMessage) (internalZeroConsumersListeners.iterator())); ((Iterator) (jobconsumeridlemessage)).hasNext(); ((Runnable)((Iterator) (jobconsumeridlemessage)).next()).run());
		} else
	//* 174  384:goto            219
		{
			if(!waitingConsumers.contains(((Object) (consumer))))
	//* 175  387:aload_0         
	//* 176  388:getfield        #52  <Field List waitingConsumers>
	//* 177  391:aload           8
	//* 178  393:invokeinterface #403 <Method boolean List.contains(Object)>
	//* 179  398:ifne            413
				waitingConsumers.add(((Object) (consumer)));
	//  180  401:aload_0         
	//  181  402:getfield        #52  <Field List waitingConsumers>
	//  182  405:aload           8
	//  183  407:invokeinterface #160 <Method boolean List.add(Object)>
	//  184  412:pop             
			if(flag || !jobManagerThread.canListenToNetwork())
	//* 185  413:iload_2         
	//* 186  414:ifne            427
	//* 187  417:aload_0         
	//* 188  418:getfield        #61  <Field JobManagerThread jobManagerThread>
	//* 189  421:invokevirtual   #406 <Method boolean JobManagerThread.canListenToNetwork()>
	//* 190  424:ifne            494
			{
				jobconsumeridlemessage = ((JobConsumerIdleMessage) ((CommandMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CommandMessage)));
	//  191  427:aload_0         
	//  192  428:getfield        #65  <Field MessageFactory factory>
	//  193  431:ldc1            #226 <Class CommandMessage>
	//  194  433:invokevirtual   #232 <Method Message MessageFactory.obtain(Class)>
	//  195  436:checkcast       #226 <Class CommandMessage>
	//  196  439:astore_1        
				((CommandMessage) (jobconsumeridlemessage)).set(2);
	//  197  440:aload_1         
	//  198  441:iconst_2        
	//  199  442:invokevirtual   #235 <Method void CommandMessage.set(int)>
				if(!flag)
	//* 200  445:iload_2         
	//* 201  446:ifne            465
					l = timer.nanoTime() + consumerKeepAliveNs;
	//  202  449:aload_0         
	//  203  450:getfield        #63  <Field Timer timer>
	//  204  453:invokeinterface #385 <Method long Timer.nanoTime()>
	//  205  458:aload_0         
	//  206  459:getfield        #90  <Field long consumerKeepAliveNs>
	//  207  462:ladd            
	//  208  463:lstore          5
				consumer.messageQueue.postAt(((Message) (jobconsumeridlemessage)), l);
	//  209  465:aload           8
	//  210  467:getfield        #238 <Field SafeMessageQueue ConsumerManager$Consumer.messageQueue>
	//  211  470:aload_1         
	//  212  471:lload           5
	//  213  473:invokevirtual   #410 <Method void SafeMessageQueue.postAt(Message, long)>
				JqLog.d("poke consumer manager at %s", new Object[] {
					Long.valueOf(l)
				});
	//  214  476:ldc2            #412 <String "poke consumer manager at %s">
	//  215  479:iconst_1        
	//  216  480:anewarray       Object[]
	//  217  483:dup             
	//  218  484:iconst_0        
	//  219  485:lload           5
	//  220  487:invokestatic    #380 <Method Long Long.valueOf(long)>
	//  221  490:aastore         
	//  222  491:invokestatic    #132 <Method void JqLog.d(String, Object[])>
			}
		}
		return false;
	//  223  494:iconst_0        
	//  224  495:ireturn         
	}

	void handleRunJobResult(RunJobResultMessage runjobresultmessage, JobHolder jobholder, RetryConstraint retryconstraint)
	{
		runjobresultmessage = ((RunJobResultMessage) ((Consumer)runjobresultmessage.getWorker()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #418 <Method Object RunJobResultMessage.getWorker()>
	//    2    4:checkcast       #8   <Class ConsumerManager$Consumer>
	//    3    7:astore_1        
		if(!((Consumer) (runjobresultmessage)).hasJob)
	//*   4    8:aload_1         
	//*   5    9:getfield        #346 <Field boolean ConsumerManager$Consumer.hasJob>
	//*   6   12:ifne            26
			throw new IllegalStateException("this worker should not have a job");
	//    7   15:new             #420 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc2            #422 <String "this worker should not have a job">
	//   10   22:invokespecial   #423 <Method void IllegalStateException(String)>
	//   11   25:athrow          
		runjobresultmessage.hasJob = false;
	//   12   26:aload_1         
	//   13   27:iconst_0        
	//   14   28:putfield        #346 <Field boolean ConsumerManager$Consumer.hasJob>
		runningJobHolders.remove(((Object) (jobholder.getJob().getId())));
	//   15   31:aload_0         
	//   16   32:getfield        #106 <Field Map runningJobHolders>
	//   17   35:aload_2         
	//   18   36:invokevirtual   #293 <Method Job JobHolder.getJob()>
	//   19   39:invokevirtual   #365 <Method String Job.getId()>
	//   20   42:invokeinterface #426 <Method Object Map.remove(Object)>
	//   21   47:pop             
		if(jobholder.getGroupId() != null)
	//*  22   48:aload_2         
	//*  23   49:invokevirtual   #356 <Method String JobHolder.getGroupId()>
	//*  24   52:ifnull          121
		{
			runningJobGroups.remove(jobholder.getGroupId());
	//   25   55:aload_0         
	//   26   56:getfield        #113 <Field RunningJobSet runningJobGroups>
	//   27   59:aload_2         
	//   28   60:invokevirtual   #356 <Method String JobHolder.getGroupId()>
	//   29   63:invokevirtual   #428 <Method void RunningJobSet.remove(String)>
			if(retryconstraint != null && retryconstraint.willApplyNewDelayToGroup() && retryconstraint.getNewDelayInMs().longValue() > 0L)
	//*  30   66:aload_3         
	//*  31   67:ifnull          121
	//*  32   70:aload_3         
	//*  33   71:invokevirtual   #433 <Method boolean RetryConstraint.willApplyNewDelayToGroup()>
	//*  34   74:ifeq            121
	//*  35   77:aload_3         
	//*  36   78:invokevirtual   #437 <Method Long RetryConstraint.getNewDelayInMs()>
	//*  37   81:invokevirtual   #440 <Method long Long.longValue()>
	//*  38   84:lconst_0        
	//*  39   85:lcmp            
	//*  40   86:ifle            121
				runningJobGroups.addGroupUntil(jobholder.getGroupId(), timer.nanoTime() + retryconstraint.getNewDelayInMs().longValue() * 0xf4240L);
	//   41   89:aload_0         
	//   42   90:getfield        #113 <Field RunningJobSet runningJobGroups>
	//   43   93:aload_2         
	//   44   94:invokevirtual   #356 <Method String JobHolder.getGroupId()>
	//   45   97:aload_0         
	//   46   98:getfield        #63  <Field Timer timer>
	//   47  101:invokeinterface #385 <Method long Timer.nanoTime()>
	//   48  106:aload_3         
	//   49  107:invokevirtual   #437 <Method Long RetryConstraint.getNewDelayInMs()>
	//   50  110:invokevirtual   #440 <Method long Long.longValue()>
	//   51  113:ldc2w           #87  <Long 0xf4240L>
	//   52  116:lmul            
	//   53  117:ladd            
	//   54  118:invokevirtual   #444 <Method void RunningJobSet.addGroupUntil(String, long)>
		}
	//   55  121:return          
	}

	void handleStop()
	{
		SafeMessageQueue safemessagequeue;
		CommandMessage commandmessage;
		for(Iterator iterator = consumers.iterator(); iterator.hasNext(); safemessagequeue.post(((Message) (commandmessage))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field List consumers>
	//*   2    4:invokeinterface #446 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            58
		{
			safemessagequeue = ((Consumer)iterator.next()).messageQueue;
	//    7   19:aload_1         
	//    8   20:invokeinterface #285 <Method Object Iterator.next()>
	//    9   25:checkcast       #8   <Class ConsumerManager$Consumer>
	//   10   28:getfield        #238 <Field SafeMessageQueue ConsumerManager$Consumer.messageQueue>
	//   11   31:astore_2        
			commandmessage = (CommandMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/CommandMessage);
	//   12   32:aload_0         
	//   13   33:getfield        #65  <Field MessageFactory factory>
	//   14   36:ldc1            #226 <Class CommandMessage>
	//   15   38:invokevirtual   #232 <Method Message MessageFactory.obtain(Class)>
	//   16   41:checkcast       #226 <Class CommandMessage>
	//   17   44:astore_3        
			commandmessage.set(2);
	//   18   45:aload_3         
	//   19   46:iconst_2        
	//   20   47:invokevirtual   #235 <Method void CommandMessage.set(int)>
		}

	//   21   50:aload_2         
	//   22   51:aload_3         
	//   23   52:invokevirtual   #242 <Method void SafeMessageQueue.post(Message)>
	//*  24   55:goto            10
		if(consumers.isEmpty())
	//*  25   58:aload_0         
	//*  26   59:getfield        #54  <Field List consumers>
	//*  27   62:invokeinterface #394 <Method boolean List.isEmpty()>
	//*  28   67:ifeq            104
		{
			for(Iterator iterator1 = internalZeroConsumersListeners.iterator(); iterator1.hasNext(); ((Runnable)iterator1.next()).run());
	//   29   70:aload_0         
	//   30   71:getfield        #59  <Field CopyOnWriteArrayList internalZeroConsumersListeners>
	//   31   74:invokevirtual   #395 <Method Iterator CopyOnWriteArrayList.iterator()>
	//   32   77:astore_1        
	//   33   78:aload_1         
	//   34   79:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//   35   84:ifeq            104
	//   36   87:aload_1         
	//   37   88:invokeinterface #285 <Method Object Iterator.next()>
	//   38   93:checkcast       #397 <Class Runnable>
	//   39   96:invokeinterface #400 <Method void Runnable.run()>
		}
	//*  40  101:goto            78
	//   41  104:return          
	}

	public boolean hasJobsWithSchedulerConstraint(SchedulerConstraint schedulerconstraint)
	{
		for(Iterator iterator = runningJobHolders.values().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field Map runningJobHolders>
	//*   2    4:invokeinterface #270 <Method Collection Map.values()>
	//*   3    9:invokeinterface #276 <Method Iterator Collection.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            57
		{
			JobHolder jobholder = (JobHolder)iterator.next();
	//    8   24:aload_2         
	//    9   25:invokeinterface #285 <Method Object Iterator.next()>
	//   10   30:checkcast       #287 <Class JobHolder>
	//   11   33:astore_3        
			if(jobholder.getJob().isPersistent() && schedulerconstraint.getNetworkStatus() >= jobholder.requiredNetworkType)
	//*  12   34:aload_3         
	//*  13   35:invokevirtual   #293 <Method Job JobHolder.getJob()>
	//*  14   38:invokevirtual   #451 <Method boolean Job.isPersistent()>
	//*  15   41:ifeq            15
	//*  16   44:aload_1         
	//*  17   45:invokevirtual   #456 <Method int SchedulerConstraint.getNetworkStatus()>
	//*  18   48:aload_3         
	//*  19   49:getfield        #459 <Field int JobHolder.requiredNetworkType>
	//*  20   52:icmplt          15
				return true;
	//   21   55:iconst_1        
	//   22   56:ireturn         
		}

		return false;
	//   23   57:iconst_0        
	//   24   58:ireturn         
	}

	boolean isJobRunning(String s)
	{
		return runningJobHolders.get(((Object) (s))) != null;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field Map runningJobHolders>
	//    2    4:aload_1         
	//    3    5:invokeinterface #464 <Method Object Map.get(Object)>
	//    4   10:ifnull          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	Set markJobsCancelled(TagConstraint tagconstraint, String as[])
	{
		return markJobsCancelled(tagconstraint, as, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #467 <Method Set markJobsCancelled(TagConstraint, String[], boolean)>
	//    5    7:areturn         
	}

	Set markJobsCancelledSingleId(TagConstraint tagconstraint, String as[])
	{
		return markJobsCancelled(tagconstraint, as, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #467 <Method Set markJobsCancelled(TagConstraint, String[], boolean)>
	//    5    7:areturn         
	}

	void onJobAdded()
	{
		considerAddingConsumers(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #334 <Method boolean considerAddingConsumers(boolean)>
	//    3    5:pop             
	//    4    6:return          
	}

	boolean removeNoConsumersListener(Runnable runnable)
	{
		return internalZeroConsumersListeners.remove(((Object) (runnable)));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field CopyOnWriteArrayList internalZeroConsumersListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #473 <Method boolean CopyOnWriteArrayList.remove(Object)>
	//    4    8:ireturn         
	}

	private final long consumerKeepAliveNs;
	private final List consumers = new ArrayList();
	private final MessageFactory factory;
	private final CopyOnWriteArrayList internalZeroConsumersListeners = new CopyOnWriteArrayList();
	private final JobManagerThread jobManagerThread;
	private final int loadFactor;
	private final int maxConsumerCount;
	private final int minConsumerCount;
	final RunningJobSet runningJobGroups;
	private final Map runningJobHolders = new HashMap();
	private final ThreadFactory threadFactory;
	private final ThreadGroup threadGroup = new ThreadGroup("JobConsumers");
	private final int threadPriority;
	private final Timer timer;
	private List waitingConsumers;

	// Unreferenced inner class com/birbit/android/jobqueue/ConsumerManager$1

/* anonymous class */
	static class _cls1
	{

		static final int $SwitchMap$com$birbit$android$jobqueue$messaging$Type[];

		static 
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type = new int[Type.values().length];
		//    0    0:invokestatic    #18  <Method Type[] Type.values()>
		//    1    3:arraylength     
		//    2    4:newarray        int[]
		//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
			try
			{
				$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.RUN_JOB.ordinal()] = 1;
		//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
		//    5   12:getstatic       #24  <Field Type Type.RUN_JOB>
		//    6   15:invokevirtual   #28  <Method int Type.ordinal()>
		//    7   18:iconst_1        
		//    8   19:iastore         
			}
		//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
		//*  10   23:getstatic       #31  <Field Type Type.COMMAND>
		//*  11   26:invokevirtual   #28  <Method int Type.ordinal()>
		//*  12   29:iconst_2        
		//*  13   30:iastore         
		//*  14   31:return          
		//*  15   32:astore_0        
		//*  16   33:return          
			catch(NoSuchFieldError nosuchfielderror1) { }
		//   17   34:astore_0        
			try
			{
				$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.COMMAND.ordinal()] = 2;
			}
			catch(NoSuchFieldError nosuchfielderror)
			{
				return;
			}
		//*  18   35:goto            20
		}
	}


	// Unreferenced inner class com/birbit/android/jobqueue/ConsumerManager$Consumer$2

/* anonymous class */
	class Consumer._cls2 extends MessageQueueConsumer
	{

		public void handleMessage(Message message)
		{
	static class _cls1
	{

		static final int $SwitchMap$com$birbit$android$jobqueue$messaging$Type[];

		static 
		{
			$SwitchMap$com$birbit$android$jobqueue$messaging$Type = new int[Type.values().length];
		//    0    0:invokestatic    #18  <Method Type[] Type.values()>
		//    1    3:arraylength     
		//    2    4:newarray        int[]
		//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
			try
			{
				$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.RUN_JOB.ordinal()] = 1;
		//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
		//    5   12:getstatic       #24  <Field Type Type.RUN_JOB>
		//    6   15:invokevirtual   #28  <Method int Type.ordinal()>
		//    7   18:iconst_1        
		//    8   19:iastore         
			}
		//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
		//*  10   23:getstatic       #31  <Field Type Type.COMMAND>
		//*  11   26:invokevirtual   #28  <Method int Type.ordinal()>
		//*  12   29:iconst_2        
		//*  13   30:iastore         
		//*  14   31:return          
		//*  15   32:astore_0        
		//*  16   33:return          
			catch(NoSuchFieldError nosuchfielderror1) { }
		//   17   34:astore_0        
			try
			{
				$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.COMMAND.ordinal()] = 2;
			}
			catch(NoSuchFieldError nosuchfielderror)
			{
				return;
			}
		//*  18   35:goto            20
		}
	}

			switch(_cls1..SwitchMap.com.birbit.android.jobqueue.messaging.Type[message.type.ordinal()])
		//*   0    0:getstatic       #27  <Field int[] ConsumerManager$1.$SwitchMap$com$birbit$android$jobqueue$messaging$Type>
		//*   1    3:aload_1         
		//*   2    4:getfield        #33  <Field Type Message.type>
		//*   3    7:invokevirtual   #39  <Method int Type.ordinal()>
		//*   4   10:iaload          
			{
		//*   5   11:tableswitch     1 2: default 32
		//		               1 33
		//		               2 71
			default:
				return;
		//    6   32:return          

			case 1: // '\001'
				handleRunJob((RunJobMessage)message);
		//    7   33:aload_0         
		//    8   34:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//    9   37:aload_1         
		//   10   38:checkcast       #41  <Class RunJobMessage>
		//   11   41:invokestatic    #45  <Method void ConsumerManager$Consumer.access$000(ConsumerManager$Consumer, RunJobMessage)>
				lastJobCompleted = timer.nanoTime();
		//   12   44:aload_0         
		//   13   45:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//   14   48:aload_0         
		//   15   49:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//   16   52:getfield        #49  <Field Timer ConsumerManager$Consumer.timer>
		//   17   55:invokeinterface #55  <Method long Timer.nanoTime()>
		//   18   60:putfield        #59  <Field long ConsumerManager$Consumer.lastJobCompleted>
				removePokeMessages();
		//   19   63:aload_0         
		//   20   64:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//   21   67:invokestatic    #62  <Method void ConsumerManager$Consumer.access$100(ConsumerManager$Consumer)>
				return;
		//   22   70:return          

			case 2: // '\002'
				handleCommand((CommandMessage)message);
		//   23   71:aload_0         
		//   24   72:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//   25   75:aload_1         
		//   26   76:checkcast       #64  <Class CommandMessage>
		//   27   79:invokestatic    #68  <Method void ConsumerManager$Consumer.access$200(ConsumerManager$Consumer, CommandMessage)>
				break;
			}
		//   28   82:return          
		}

		public void onIdle()
		{
			JqLog.d("consumer manager on idle", new Object[0]);
		//    0    0:ldc1            #71  <String "consumer manager on idle">
		//    1    2:iconst_0        
		//    2    3:anewarray       Object[]
		//    3    6:invokestatic    #79  <Method void JqLog.d(String, Object[])>
			JobConsumerIdleMessage jobconsumeridlemessage = (JobConsumerIdleMessage)factory.obtain(com/birbit/android/jobqueue/messaging/message/JobConsumerIdleMessage);
		//    4    9:aload_0         
		//    5   10:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//    6   13:getfield        #83  <Field MessageFactory ConsumerManager$Consumer.factory>
		//    7   16:ldc1            #85  <Class JobConsumerIdleMessage>
		//    8   18:invokevirtual   #91  <Method Message MessageFactory.obtain(Class)>
		//    9   21:checkcast       #85  <Class JobConsumerIdleMessage>
		//   10   24:astore_1        
			jobconsumeridlemessage.setWorker(((Object) (Consumer.this)));
		//   11   25:aload_1         
		//   12   26:aload_0         
		//   13   27:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//   14   30:invokevirtual   #95  <Method void JobConsumerIdleMessage.setWorker(Object)>
			jobconsumeridlemessage.setLastJobCompleted(lastJobCompleted);
		//   15   33:aload_1         
		//   16   34:aload_0         
		//   17   35:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//   18   38:getfield        #59  <Field long ConsumerManager$Consumer.lastJobCompleted>
		//   19   41:invokevirtual   #99  <Method void JobConsumerIdleMessage.setLastJobCompleted(long)>
			parentMessageQueue.post(((Message) (jobconsumeridlemessage)));
		//   20   44:aload_0         
		//   21   45:getfield        #15  <Field ConsumerManager$Consumer this$0>
		//   22   48:getfield        #103 <Field MessageQueue ConsumerManager$Consumer.parentMessageQueue>
		//   23   51:aload_1         
		//   24   52:invokeinterface #108 <Method void MessageQueue.post(Message)>
		//   25   57:return          
		}

		final Consumer this$0;

			
			{
				this$0 = Consumer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ConsumerManager$Consumer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MessageQueueConsumer()>
			//    5    9:return          
			}
	}

}
