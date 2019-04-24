// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

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
import com.birbit.android.jobqueue.timer.Timer;

// Referenced classes of package com.birbit.android.jobqueue:
//			ConsumerManager, JobHolder

static class ConsumerManager$Consumer
	implements Runnable
{

	private void handleCommand(CommandMessage commandmessage)
	{
		switch(commandmessage.getWhat())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #82  <Method int CommandMessage.getWhat()>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 29
	//	               2 37
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
	final MessageQueueConsumer queueConsumer = new MessageQueueConsumer() {

		public void handleMessage(Message message)
		{
			switch(ConsumerManager._cls1.$SwitchMap$com$birbit$android$jobqueue$messaging$Type[message.type.ordinal()])
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
			jobconsumeridlemessage.setWorker(((Object) (ConsumerManager.Consumer.this)));
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

		final ConsumerManager.Consumer this$0;

			
			{
				this$0 = ConsumerManager.Consumer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ConsumerManager$Consumer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MessageQueueConsumer()>
			//    5    9:return          
			}
	}
;
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
	static void access$000(ConsumerManager$Consumer consumermanager$consumer, RunJobMessage runjobmessage)
	{
		consumermanager$consumer.handleRunJob(runjobmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void handleRunJob(RunJobMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(ConsumerManager$Consumer consumermanager$consumer)
	{
		consumermanager$consumer.removePokeMessages();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void removePokeMessages()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$200(ConsumerManager$Consumer consumermanager$consumer, CommandMessage commandmessage)
	{
		consumermanager$consumer.handleCommand(commandmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void handleCommand(CommandMessage)>
		return;
	//    3    5:return          
	}

*/

	public ConsumerManager$Consumer(MessageQueue messagequeue, SafeMessageQueue safemessagequeue, MessageFactory messagefactory, Timer timer1)
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
