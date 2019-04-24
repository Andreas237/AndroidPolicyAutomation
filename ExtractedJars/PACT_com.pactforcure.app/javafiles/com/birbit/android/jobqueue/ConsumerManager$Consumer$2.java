// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessageFactory;
import com.birbit.android.jobqueue.messaging.MessageQueue;
import com.birbit.android.jobqueue.messaging.MessageQueueConsumer;
import com.birbit.android.jobqueue.messaging.Type;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;
import com.birbit.android.jobqueue.messaging.message.JobConsumerIdleMessage;
import com.birbit.android.jobqueue.messaging.message.RunJobMessage;
import com.birbit.android.jobqueue.timer.Timer;

// Referenced classes of package com.birbit.android.jobqueue:
//			ConsumerManager

class ConsumerManager$Consumer$2 extends MessageQueueConsumer
{

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
	//	               1 33
	//	               2 71
		default:
			return;
	//    6   32:return          

		case 1: // '\001'
			ConsumerManager.Consumer.access$000(ConsumerManager.Consumer.this, (RunJobMessage)message);
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
			ConsumerManager.Consumer.access$100(ConsumerManager.Consumer.this);
	//   19   63:aload_0         
	//   20   64:getfield        #15  <Field ConsumerManager$Consumer this$0>
	//   21   67:invokestatic    #62  <Method void ConsumerManager$Consumer.access$100(ConsumerManager$Consumer)>
			return;
	//   22   70:return          

		case 2: // '\002'
			ConsumerManager.Consumer.access$200(ConsumerManager.Consumer.this, (CommandMessage)message);
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

	ConsumerManager$Consumer$2()
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
