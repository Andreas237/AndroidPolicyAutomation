// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.messaging.Message;
import com.birbit.android.jobqueue.messaging.MessageFactory;
import com.birbit.android.jobqueue.messaging.MessageQueueConsumer;
import com.birbit.android.jobqueue.messaging.PriorityMessageQueue;
import com.birbit.android.jobqueue.messaging.Type;
import com.birbit.android.jobqueue.messaging.message.AddJobMessage;
import com.birbit.android.jobqueue.messaging.message.CancelMessage;
import com.birbit.android.jobqueue.messaging.message.CommandMessage;
import com.birbit.android.jobqueue.messaging.message.ConstraintChangeMessage;
import com.birbit.android.jobqueue.messaging.message.JobConsumerIdleMessage;
import com.birbit.android.jobqueue.messaging.message.PublicQueryMessage;
import com.birbit.android.jobqueue.messaging.message.RunJobResultMessage;
import com.birbit.android.jobqueue.messaging.message.SchedulerMessage;
import com.birbit.android.jobqueue.scheduling.Scheduler;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManagerThread, ConsumerManager, JobQueue

class JobManagerThread$1 extends MessageQueueConsumer
{

	public void handleMessage(Message message)
	{
		boolean flag1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		JobManagerThread.access$002(JobManagerThread.this, true);
	//    2    2:aload_0         
	//    3    3:getfield        #15  <Field JobManagerThread this$0>
	//    4    6:iconst_1        
	//    5    7:invokestatic    #24  <Method boolean JobManagerThread.access$002(JobManagerThread, boolean)>
	//    6   10:pop             
		JobManagerThread$2.$SwitchMap$com$birbit$android$jobqueue$messaging$Type[message.type.ordinal()];
	//    7   11:getstatic       #30  <Field int[] JobManagerThread$2.$SwitchMap$com$birbit$android$jobqueue$messaging$Type>
	//    8   14:aload_1         
	//    9   15:getfield        #36  <Field Type Message.type>
	//   10   18:invokevirtual   #42  <Method int Type.ordinal()>
	//   11   21:iaload          
		JVM INSTR tableswitch 1 8: default 68
	//	               1 69
	//	               2 81
	//	               3 106
	//	               4 118
	//	               5 170
	//	               6 182
	//	               7 194
	//	               8 206;
	//   12   22:tableswitch     1 8: default 68
	//	               1 69
	//	               2 81
	//	               3 106
	//	               4 118
	//	               5 170
	//	               6 182
	//	               7 194
	//	               8 206
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
		return;
	//   13   68:return          
_L2:
		JobManagerThread.access$100(JobManagerThread.this, (AddJobMessage)message);
	//   14   69:aload_0         
	//   15   70:getfield        #15  <Field JobManagerThread this$0>
	//   16   73:aload_1         
	//   17   74:checkcast       #44  <Class AddJobMessage>
	//   18   77:invokestatic    #48  <Method void JobManagerThread.access$100(JobManagerThread, AddJobMessage)>
		return;
	//   19   80:return          
_L3:
		if(!consumerManager.handleIdle((JobConsumerIdleMessage)message))
	//*  20   81:aload_0         
	//*  21   82:getfield        #15  <Field JobManagerThread this$0>
	//*  22   85:getfield        #52  <Field ConsumerManager JobManagerThread.consumerManager>
	//*  23   88:aload_1         
	//*  24   89:checkcast       #54  <Class JobConsumerIdleMessage>
	//*  25   92:invokevirtual   #60  <Method boolean ConsumerManager.handleIdle(JobConsumerIdleMessage)>
	//*  26   95:ifne            68
		{
			JobManagerThread.access$200(JobManagerThread.this);
	//   27   98:aload_0         
	//   28   99:getfield        #15  <Field JobManagerThread this$0>
	//   29  102:invokestatic    #63  <Method void JobManagerThread.access$200(JobManagerThread)>
			return;
	//   30  105:return          
		}
		  goto _L1
_L4:
		JobManagerThread.access$300(JobManagerThread.this, (RunJobResultMessage)message);
	//   31  106:aload_0         
	//   32  107:getfield        #15  <Field JobManagerThread this$0>
	//   33  110:aload_1         
	//   34  111:checkcast       #65  <Class RunJobResultMessage>
	//   35  114:invokestatic    #69  <Method void JobManagerThread.access$300(JobManagerThread, RunJobResultMessage)>
		return;
	//   36  117:return          
_L5:
		boolean flag2 = consumerManager.handleConstraintChange();
	//   37  118:aload_0         
	//   38  119:getfield        #15  <Field JobManagerThread this$0>
	//   39  122:getfield        #52  <Field ConsumerManager JobManagerThread.consumerManager>
	//   40  125:invokevirtual   #73  <Method boolean ConsumerManager.handleConstraintChange()>
	//   41  128:istore          4
		message = ((Message) ((ConstraintChangeMessage)message));
	//   42  130:aload_1         
	//   43  131:checkcast       #75  <Class ConstraintChangeMessage>
	//   44  134:astore_1        
		JobManagerThread jobmanagerthread = JobManagerThread.this;
	//   45  135:aload_0         
	//   46  136:getfield        #15  <Field JobManagerThread this$0>
	//   47  139:astore          5
		boolean flag = flag1;
	//   48  141:iload_3         
	//   49  142:istore_2        
		if(!flag2)
	//*  50  143:iload           4
	//*  51  145:ifne            157
			if(!((ConstraintChangeMessage) (message)).isForNextJob())
	//*  52  148:aload_1         
	//*  53  149:invokevirtual   #78  <Method boolean ConstraintChangeMessage.isForNextJob()>
	//*  54  152:ifne            165
				flag = flag1;
	//   55  155:iload_3         
	//   56  156:istore_2        
			else
	//*  57  157:aload           5
	//*  58  159:iload_2         
	//*  59  160:invokestatic    #24  <Method boolean JobManagerThread.access$002(JobManagerThread, boolean)>
	//*  60  163:pop             
	//*  61  164:return          
				flag = false;
	//   62  165:iconst_0        
	//   63  166:istore_2        
		JobManagerThread.access$002(jobmanagerthread, flag);
		return;
	//*  64  167:goto            157
_L6:
		JobManagerThread.access$400(JobManagerThread.this, (CancelMessage)message);
	//   65  170:aload_0         
	//   66  171:getfield        #15  <Field JobManagerThread this$0>
	//   67  174:aload_1         
	//   68  175:checkcast       #80  <Class CancelMessage>
	//   69  178:invokestatic    #84  <Method void JobManagerThread.access$400(JobManagerThread, CancelMessage)>
		return;
	//   70  181:return          
_L7:
		JobManagerThread.access$500(JobManagerThread.this, (PublicQueryMessage)message);
	//   71  182:aload_0         
	//   72  183:getfield        #15  <Field JobManagerThread this$0>
	//   73  186:aload_1         
	//   74  187:checkcast       #86  <Class PublicQueryMessage>
	//   75  190:invokestatic    #90  <Method void JobManagerThread.access$500(JobManagerThread, PublicQueryMessage)>
		return;
	//   76  193:return          
_L8:
		JobManagerThread.access$600(JobManagerThread.this, (CommandMessage)message);
	//   77  194:aload_0         
	//   78  195:getfield        #15  <Field JobManagerThread this$0>
	//   79  198:aload_1         
	//   80  199:checkcast       #92  <Class CommandMessage>
	//   81  202:invokestatic    #96  <Method void JobManagerThread.access$600(JobManagerThread, CommandMessage)>
		return;
	//   82  205:return          
_L9:
		JobManagerThread.access$700(JobManagerThread.this, (SchedulerMessage)message);
	//   83  206:aload_0         
	//   84  207:getfield        #15  <Field JobManagerThread this$0>
	//   85  210:aload_1         
	//   86  211:checkcast       #98  <Class SchedulerMessage>
	//   87  214:invokestatic    #102 <Method void JobManagerThread.access$700(JobManagerThread, SchedulerMessage)>
		return;
	//   88  217:return          
	}

	public void onIdle()
	{
		JqLog.v("joq idle. running:? %s", new Object[] {
			Boolean.valueOf(JobManagerThread.access$800(JobManagerThread.this))
		});
	//    0    0:ldc1            #105 <String "joq idle. running:? %s">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #15  <Field JobManagerThread this$0>
	//    7   12:invokestatic    #111 <Method boolean JobManagerThread.access$800(JobManagerThread)>
	//    8   15:invokestatic    #117 <Method Boolean Boolean.valueOf(boolean)>
	//    9   18:aastore         
	//   10   19:invokestatic    #123 <Method void JqLog.v(String, Object[])>
		if(JobManagerThread.access$800(JobManagerThread.this))
	//*  11   22:aload_0         
	//*  12   23:getfield        #15  <Field JobManagerThread this$0>
	//*  13   26:invokestatic    #111 <Method boolean JobManagerThread.access$800(JobManagerThread)>
	//*  14   29:ifne            33
	//*  15   32:return          
		{
			if(!JobManagerThread.access$000(JobManagerThread.this))
	//*  16   33:aload_0         
	//*  17   34:getfield        #15  <Field JobManagerThread this$0>
	//*  18   37:invokestatic    #126 <Method boolean JobManagerThread.access$000(JobManagerThread)>
	//*  19   40:ifne            53
			{
				JqLog.v("skipping scheduling a new idle callback because looks like last one did not do anything", new Object[0]);
	//   20   43:ldc1            #128 <String "skipping scheduling a new idle callback because looks like last one did not do anything">
	//   21   45:iconst_0        
	//   22   46:anewarray       Object[]
	//   23   49:invokestatic    #123 <Method void JqLog.v(String, Object[])>
				return;
	//   24   52:return          
			}
			Long long1 = getNextWakeUpNs(true);
	//   25   53:aload_0         
	//   26   54:getfield        #15  <Field JobManagerThread this$0>
	//   27   57:iconst_1        
	//   28   58:invokevirtual   #132 <Method Long JobManagerThread.getNextWakeUpNs(boolean)>
	//   29   61:astore_1        
			JqLog.d("Job queue idle. next job at: %s", new Object[] {
				long1
			});
	//   30   62:ldc1            #134 <String "Job queue idle. next job at: %s">
	//   31   64:iconst_1        
	//   32   65:anewarray       Object[]
	//   33   68:dup             
	//   34   69:iconst_0        
	//   35   70:aload_1         
	//   36   71:aastore         
	//   37   72:invokestatic    #137 <Method void JqLog.d(String, Object[])>
			if(long1 != null)
	//*  38   75:aload_1         
	//*  39   76:ifnull          116
			{
				ConstraintChangeMessage constraintchangemessage = (ConstraintChangeMessage)JobManagerThread.access$900(JobManagerThread.this).obtain(com/birbit/android/jobqueue/messaging/message/ConstraintChangeMessage);
	//   40   79:aload_0         
	//   41   80:getfield        #15  <Field JobManagerThread this$0>
	//   42   83:invokestatic    #141 <Method MessageFactory JobManagerThread.access$900(JobManagerThread)>
	//   43   86:ldc1            #75  <Class ConstraintChangeMessage>
	//   44   88:invokevirtual   #147 <Method Message MessageFactory.obtain(Class)>
	//   45   91:checkcast       #75  <Class ConstraintChangeMessage>
	//   46   94:astore_2        
				constraintchangemessage.setForNextJob(true);
	//   47   95:aload_2         
	//   48   96:iconst_1        
	//   49   97:invokevirtual   #151 <Method void ConstraintChangeMessage.setForNextJob(boolean)>
				messageQueue.postAt(((Message) (constraintchangemessage)), long1.longValue());
	//   50  100:aload_0         
	//   51  101:getfield        #15  <Field JobManagerThread this$0>
	//   52  104:getfield        #155 <Field PriorityMessageQueue JobManagerThread.messageQueue>
	//   53  107:aload_2         
	//   54  108:aload_1         
	//   55  109:invokevirtual   #161 <Method long Long.longValue()>
	//   56  112:invokevirtual   #167 <Method void PriorityMessageQueue.postAt(Message, long)>
				return;
	//   57  115:return          
			}
			if(scheduler != null && JobManagerThread.access$1000(JobManagerThread.this) && persistentJobQueue.count() == 0)
	//*  58  116:aload_0         
	//*  59  117:getfield        #15  <Field JobManagerThread this$0>
	//*  60  120:getfield        #171 <Field Scheduler JobManagerThread.scheduler>
	//*  61  123:ifnull          32
	//*  62  126:aload_0         
	//*  63  127:getfield        #15  <Field JobManagerThread this$0>
	//*  64  130:invokestatic    #174 <Method boolean JobManagerThread.access$1000(JobManagerThread)>
	//*  65  133:ifeq            32
	//*  66  136:aload_0         
	//*  67  137:getfield        #15  <Field JobManagerThread this$0>
	//*  68  140:getfield        #178 <Field JobQueue JobManagerThread.persistentJobQueue>
	//*  69  143:invokeinterface #183 <Method int JobQueue.count()>
	//*  70  148:ifne            32
			{
				JobManagerThread.access$1002(JobManagerThread.this, false);
	//   71  151:aload_0         
	//   72  152:getfield        #15  <Field JobManagerThread this$0>
	//   73  155:iconst_0        
	//   74  156:invokestatic    #186 <Method boolean JobManagerThread.access$1002(JobManagerThread, boolean)>
	//   75  159:pop             
				scheduler.cancelAll();
	//   76  160:aload_0         
	//   77  161:getfield        #15  <Field JobManagerThread this$0>
	//   78  164:getfield        #171 <Field Scheduler JobManagerThread.scheduler>
	//   79  167:invokevirtual   #191 <Method void Scheduler.cancelAll()>
				return;
	//   80  170:return          
			}
		}
	}

	final JobManagerThread this$0;

	JobManagerThread$1()
	{
		this$0 = JobManagerThread.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field JobManagerThread this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void MessageQueueConsumer()>
	//    5    9:return          
	}
}
