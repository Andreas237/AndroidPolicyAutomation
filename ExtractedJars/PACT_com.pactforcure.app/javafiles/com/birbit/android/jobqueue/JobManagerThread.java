// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import android.content.Context;
import com.birbit.android.jobqueue.callback.JobManagerCallback;
import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.di.DependencyInjector;
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
import com.birbit.android.jobqueue.network.NetworkEventProvider;
import com.birbit.android.jobqueue.network.NetworkUtil;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.birbit.android.jobqueue:
//			Constraint, BatchingScheduler, QueueFactory, ConsumerManager, 
//			CallbackManager, JobHolder, JobQueue, RunningJobSet, 
//			TagConstraint, JobStatus, Job, CancelHandler, 
//			IntCallback, RetryConstraint, JobManager

class JobManagerThread
	implements Runnable, com.birbit.android.jobqueue.network.NetworkEventProvider.Listener
{

	JobManagerThread(Configuration configuration, PriorityMessageQueue prioritymessagequeue, MessageFactory messagefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #61  <Class Constraint>
	//    4    8:dup             
	//    5    9:invokespecial   #62  <Method void Constraint()>
	//    6   12:putfield        #64  <Field Constraint queryConstraint>
		running = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #66  <Field boolean running>
		shouldCancelAllScheduledWhenEmpty = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #68  <Field boolean shouldCancelAllScheduledWhenEmpty>
		canScheduleConstraintChangeOnIdle = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #70  <Field boolean canScheduleConstraintChangeOnIdle>
		messageQueue = prioritymessagequeue;
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:putfield        #72  <Field PriorityMessageQueue messageQueue>
		if(configuration.getCustomLogger() != null)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #78  <Method com.birbit.android.jobqueue.log.CustomLogger Configuration.getCustomLogger()>
	//*  21   39:ifnull          49
			JqLog.setCustomLogger(configuration.getCustomLogger());
	//   22   42:aload_1         
	//   23   43:invokevirtual   #78  <Method com.birbit.android.jobqueue.log.CustomLogger Configuration.getCustomLogger()>
	//   24   46:invokestatic    #84  <Method void JqLog.setCustomLogger(com.birbit.android.jobqueue.log.CustomLogger)>
		messageFactory = messagefactory;
	//   25   49:aload_0         
	//   26   50:aload_3         
	//   27   51:putfield        #86  <Field MessageFactory messageFactory>
		timer = configuration.getTimer();
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:invokevirtual   #90  <Method Timer Configuration.getTimer()>
	//   31   59:putfield        #92  <Field Timer timer>
		appContext = configuration.getAppContext();
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokevirtual   #96  <Method Context Configuration.getAppContext()>
	//   35   67:putfield        #98  <Field Context appContext>
		sessionId = timer.nanoTime();
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #92  <Field Timer timer>
	//   39   75:invokeinterface #104 <Method long Timer.nanoTime()>
	//   40   80:putfield        #106 <Field long sessionId>
		scheduler = configuration.getScheduler();
	//   41   83:aload_0         
	//   42   84:aload_1         
	//   43   85:invokevirtual   #110 <Method Scheduler Configuration.getScheduler()>
	//   44   88:putfield        #112 <Field Scheduler scheduler>
		if(scheduler != null && configuration.batchSchedulerRequests() && !(scheduler instanceof BatchingScheduler))
	//*  45   91:aload_0         
	//*  46   92:getfield        #112 <Field Scheduler scheduler>
	//*  47   95:ifnull          134
	//*  48   98:aload_1         
	//*  49   99:invokevirtual   #116 <Method boolean Configuration.batchSchedulerRequests()>
	//*  50  102:ifeq            134
	//*  51  105:aload_0         
	//*  52  106:getfield        #112 <Field Scheduler scheduler>
	//*  53  109:instanceof      #118 <Class BatchingScheduler>
	//*  54  112:ifne            134
			scheduler = ((Scheduler) (new BatchingScheduler(scheduler, timer)));
	//   55  115:aload_0         
	//   56  116:new             #118 <Class BatchingScheduler>
	//   57  119:dup             
	//   58  120:aload_0         
	//   59  121:getfield        #112 <Field Scheduler scheduler>
	//   60  124:aload_0         
	//   61  125:getfield        #92  <Field Timer timer>
	//   62  128:invokespecial   #121 <Method void BatchingScheduler(Scheduler, Timer)>
	//   63  131:putfield        #112 <Field Scheduler scheduler>
		persistentJobQueue = configuration.getQueueFactory().createPersistentQueue(configuration, sessionId);
	//   64  134:aload_0         
	//   65  135:aload_1         
	//   66  136:invokevirtual   #125 <Method QueueFactory Configuration.getQueueFactory()>
	//   67  139:aload_1         
	//   68  140:aload_0         
	//   69  141:getfield        #106 <Field long sessionId>
	//   70  144:invokeinterface #131 <Method JobQueue QueueFactory.createPersistentQueue(Configuration, long)>
	//   71  149:putfield        #133 <Field JobQueue persistentJobQueue>
		nonPersistentJobQueue = configuration.getQueueFactory().createNonPersistent(configuration, sessionId);
	//   72  152:aload_0         
	//   73  153:aload_1         
	//   74  154:invokevirtual   #125 <Method QueueFactory Configuration.getQueueFactory()>
	//   75  157:aload_1         
	//   76  158:aload_0         
	//   77  159:getfield        #106 <Field long sessionId>
	//   78  162:invokeinterface #136 <Method JobQueue QueueFactory.createNonPersistent(Configuration, long)>
	//   79  167:putfield        #138 <Field JobQueue nonPersistentJobQueue>
		networkUtil = configuration.getNetworkUtil();
	//   80  170:aload_0         
	//   81  171:aload_1         
	//   82  172:invokevirtual   #142 <Method NetworkUtil Configuration.getNetworkUtil()>
	//   83  175:putfield        #144 <Field NetworkUtil networkUtil>
		dependencyInjector = configuration.getDependencyInjector();
	//   84  178:aload_0         
	//   85  179:aload_1         
	//   86  180:invokevirtual   #148 <Method DependencyInjector Configuration.getDependencyInjector()>
	//   87  183:putfield        #150 <Field DependencyInjector dependencyInjector>
		if(networkUtil instanceof NetworkEventProvider)
	//*  88  186:aload_0         
	//*  89  187:getfield        #144 <Field NetworkUtil networkUtil>
	//*  90  190:instanceof      #152 <Class NetworkEventProvider>
	//*  91  193:ifeq            209
			((NetworkEventProvider)networkUtil).setListener(((com.birbit.android.jobqueue.network.NetworkEventProvider.Listener) (this)));
	//   92  196:aload_0         
	//   93  197:getfield        #144 <Field NetworkUtil networkUtil>
	//   94  200:checkcast       #152 <Class NetworkEventProvider>
	//   95  203:aload_0         
	//   96  204:invokeinterface #156 <Method void NetworkEventProvider.setListener(com.birbit.android.jobqueue.network.NetworkEventProvider$Listener)>
		consumerManager = new ConsumerManager(this, timer, messagefactory, configuration);
	//   97  209:aload_0         
	//   98  210:new             #158 <Class ConsumerManager>
	//   99  213:dup             
	//  100  214:aload_0         
	//  101  215:aload_0         
	//  102  216:getfield        #92  <Field Timer timer>
	//  103  219:aload_3         
	//  104  220:aload_1         
	//  105  221:invokespecial   #161 <Method void ConsumerManager(JobManagerThread, Timer, MessageFactory, Configuration)>
	//  106  224:putfield        #163 <Field ConsumerManager consumerManager>
		callbackManager = new CallbackManager(messagefactory, timer);
	//  107  227:aload_0         
	//  108  228:new             #165 <Class CallbackManager>
	//  109  231:dup             
	//  110  232:aload_3         
	//  111  233:aload_0         
	//  112  234:getfield        #92  <Field Timer timer>
	//  113  237:invokespecial   #168 <Method void CallbackManager(MessageFactory, Timer)>
	//  114  240:putfield        #170 <Field CallbackManager callbackManager>
	//  115  243:return          
	}

	private void cancelSafely(JobHolder jobholder, int i)
	{
		try
		{
			jobholder.onCancel(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #231 <Method void JobHolder.onCancel(int)>
		}
	//*   3    5:aload_0         
	//*   4    6:getfield        #170 <Field CallbackManager callbackManager>
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//*   7   13:iconst_0        
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #239 <Method Throwable JobHolder.getThrowable()>
	//*  10   18:invokevirtual   #243 <Method void CallbackManager.notifyOnCancel(Job, boolean, Throwable)>
	//*  11   21:return          
		catch(Throwable throwable)
	//*  12   22:astore_3        
		{
			JqLog.e(throwable, "job's onCancel did throw an exception, ignoring...", new Object[0]);
	//   13   23:aload_3         
	//   14   24:ldc1            #245 <String "job's onCancel did throw an exception, ignoring...">
	//   15   26:iconst_0        
	//   16   27:anewarray       Object[]
	//   17   30:invokestatic    #249 <Method void JqLog.e(Throwable, String, Object[])>
		}
		callbackManager.notifyOnCancel(jobholder.getJob(), false, jobholder.getThrowable());
	//*  18   33:goto            5
	}

	private void clear()
	{
		nonPersistentJobQueue.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//    2    4:invokeinterface #254 <Method void JobQueue.clear()>
		persistentJobQueue.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #133 <Field JobQueue persistentJobQueue>
	//    5   13:invokeinterface #254 <Method void JobQueue.clear()>
	//    6   18:return          
	}

	private int countReadyJobs(int i)
	{
		Collection collection = consumerManager.runningJobGroups.getSafe();
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field ConsumerManager consumerManager>
	//    2    4:getfield        #260 <Field RunningJobSet ConsumerManager.runningJobGroups>
	//    3    7:invokevirtual   #266 <Method Collection RunningJobSet.getSafe()>
	//    4   10:astore_2        
		queryConstraint.clear();
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field Constraint queryConstraint>
	//    7   15:invokevirtual   #267 <Method void Constraint.clear()>
		queryConstraint.setNowInNs(timer.nanoTime());
	//    8   18:aload_0         
	//    9   19:getfield        #64  <Field Constraint queryConstraint>
	//   10   22:aload_0         
	//   11   23:getfield        #92  <Field Timer timer>
	//   12   26:invokeinterface #104 <Method long Timer.nanoTime()>
	//   13   31:invokevirtual   #271 <Method void Constraint.setNowInNs(long)>
		queryConstraint.setMaxNetworkType(i);
	//   14   34:aload_0         
	//   15   35:getfield        #64  <Field Constraint queryConstraint>
	//   16   38:iload_1         
	//   17   39:invokevirtual   #274 <Method void Constraint.setMaxNetworkType(int)>
		queryConstraint.setExcludeGroups(collection);
	//   18   42:aload_0         
	//   19   43:getfield        #64  <Field Constraint queryConstraint>
	//   20   46:aload_2         
	//   21   47:invokevirtual   #278 <Method void Constraint.setExcludeGroups(Collection)>
		queryConstraint.setExcludeRunning(true);
	//   22   50:aload_0         
	//   23   51:getfield        #64  <Field Constraint queryConstraint>
	//   24   54:iconst_1        
	//   25   55:invokevirtual   #282 <Method void Constraint.setExcludeRunning(boolean)>
		queryConstraint.setTimeLimit(Long.valueOf(timer.nanoTime()));
	//   26   58:aload_0         
	//   27   59:getfield        #64  <Field Constraint queryConstraint>
	//   28   62:aload_0         
	//   29   63:getfield        #92  <Field Timer timer>
	//   30   66:invokeinterface #104 <Method long Timer.nanoTime()>
	//   31   71:invokestatic    #288 <Method Long Long.valueOf(long)>
	//   32   74:invokevirtual   #292 <Method void Constraint.setTimeLimit(Long)>
		return 0 + nonPersistentJobQueue.countReadyJobs(queryConstraint) + persistentJobQueue.countReadyJobs(queryConstraint);
	//   33   77:iconst_0        
	//   34   78:aload_0         
	//   35   79:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//   36   82:aload_0         
	//   37   83:getfield        #64  <Field Constraint queryConstraint>
	//   38   86:invokeinterface #295 <Method int JobQueue.countReadyJobs(Constraint)>
	//   39   91:iadd            
	//   40   92:aload_0         
	//   41   93:getfield        #133 <Field JobQueue persistentJobQueue>
	//   42   96:aload_0         
	//   43   97:getfield        #64  <Field Constraint queryConstraint>
	//   44  100:invokeinterface #295 <Method int JobQueue.countReadyJobs(Constraint)>
	//   45  105:iadd            
	//   46  106:ireturn         
	}

	private JobHolder findJobBySingleId(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          144
		{
			queryConstraint.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field Constraint queryConstraint>
	//    4    8:invokevirtual   #267 <Method void Constraint.clear()>
			queryConstraint.setTags(new String[] {
				s
			});
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field Constraint queryConstraint>
	//    7   15:iconst_1        
	//    8   16:anewarray       String[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_1         
	//   12   22:aastore         
	//   13   23:invokevirtual   #303 <Method void Constraint.setTags(String[])>
			queryConstraint.setTagConstraint(TagConstraint.ANY);
	//   14   26:aload_0         
	//   15   27:getfield        #64  <Field Constraint queryConstraint>
	//   16   30:getstatic       #309 <Field TagConstraint TagConstraint.ANY>
	//   17   33:invokevirtual   #313 <Method void Constraint.setTagConstraint(TagConstraint)>
			queryConstraint.setMaxNetworkType(2);
	//   18   36:aload_0         
	//   19   37:getfield        #64  <Field Constraint queryConstraint>
	//   20   40:iconst_2        
	//   21   41:invokevirtual   #274 <Method void Constraint.setMaxNetworkType(int)>
			s = ((String) (nonPersistentJobQueue.findJobs(queryConstraint)));
	//   22   44:aload_0         
	//   23   45:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//   24   48:aload_0         
	//   25   49:getfield        #64  <Field Constraint queryConstraint>
	//   26   52:invokeinterface #317 <Method Set JobQueue.findJobs(Constraint)>
	//   27   57:astore_1        
			((Set) (s)).addAll(((Collection) (persistentJobQueue.findJobs(queryConstraint))));
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:getfield        #133 <Field JobQueue persistentJobQueue>
	//   31   63:aload_0         
	//   32   64:getfield        #64  <Field Constraint queryConstraint>
	//   33   67:invokeinterface #317 <Method Set JobQueue.findJobs(Constraint)>
	//   34   72:invokeinterface #323 <Method boolean Set.addAll(Collection)>
	//   35   77:pop             
			if(!((Set) (s)).isEmpty())
	//*  36   78:aload_1         
	//*  37   79:invokeinterface #326 <Method boolean Set.isEmpty()>
	//*  38   84:ifne            144
			{
				for(Iterator iterator = ((Set) (s)).iterator(); iterator.hasNext();)
	//*  39   87:aload_1         
	//*  40   88:invokeinterface #330 <Method Iterator Set.iterator()>
	//*  41   93:astore_2        
	//*  42   94:aload_2         
	//*  43   95:invokeinterface #335 <Method boolean Iterator.hasNext()>
	//*  44  100:ifeq            129
				{
					JobHolder jobholder = (JobHolder)iterator.next();
	//   45  103:aload_2         
	//   46  104:invokeinterface #339 <Method Object Iterator.next()>
	//   47  109:checkcast       #227 <Class JobHolder>
	//   48  112:astore_3        
					if(!consumerManager.isJobRunning(jobholder.getId()))
	//*  49  113:aload_0         
	//*  50  114:getfield        #163 <Field ConsumerManager consumerManager>
	//*  51  117:aload_3         
	//*  52  118:invokevirtual   #343 <Method String JobHolder.getId()>
	//*  53  121:invokevirtual   #347 <Method boolean ConsumerManager.isJobRunning(String)>
	//*  54  124:ifne            94
						return jobholder;
	//   55  127:aload_3         
	//   56  128:areturn         
				}

				return (JobHolder)((Set) (s)).iterator().next();
	//   57  129:aload_1         
	//   58  130:invokeinterface #330 <Method Iterator Set.iterator()>
	//   59  135:invokeinterface #339 <Method Object Iterator.next()>
	//   60  140:checkcast       #227 <Class JobHolder>
	//   61  143:areturn         
			}
		}
		return null;
	//   62  144:aconst_null     
	//   63  145:areturn         
	}

	private JobStatus getJobStatus(String s)
	{
		if(consumerManager.isJobRunning(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field ConsumerManager consumerManager>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #347 <Method boolean ConsumerManager.isJobRunning(String)>
	//*   4    8:ifeq            15
			return JobStatus.RUNNING;
	//    5   11:getstatic       #355 <Field JobStatus JobStatus.RUNNING>
	//    6   14:areturn         
		JobHolder jobholder1 = nonPersistentJobQueue.findJobById(s);
	//    7   15:aload_0         
	//    8   16:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//    9   19:aload_1         
	//   10   20:invokeinterface #358 <Method JobHolder JobQueue.findJobById(String)>
	//   11   25:astore          6
		JobHolder jobholder = jobholder1;
	//   12   27:aload           6
	//   13   29:astore          5
		if(jobholder1 == null)
	//*  14   31:aload           6
	//*  15   33:ifnonnull       48
			jobholder = persistentJobQueue.findJobById(s);
	//   16   36:aload_0         
	//   17   37:getfield        #133 <Field JobQueue persistentJobQueue>
	//   18   40:aload_1         
	//   19   41:invokeinterface #358 <Method JobHolder JobQueue.findJobById(String)>
	//   20   46:astore          5
		if(jobholder == null)
	//*  21   48:aload           5
	//*  22   50:ifnonnull       57
			return JobStatus.UNKNOWN;
	//   23   53:getstatic       #361 <Field JobStatus JobStatus.UNKNOWN>
	//   24   56:areturn         
		int i = getNetworkStatus();
	//   25   57:aload_0         
	//   26   58:invokespecial   #365 <Method int getNetworkStatus()>
	//   27   61:istore_2        
		long l = timer.nanoTime();
	//   28   62:aload_0         
	//   29   63:getfield        #92  <Field Timer timer>
	//   30   66:invokeinterface #104 <Method long Timer.nanoTime()>
	//   31   71:lstore_3        
		if(i < jobholder.requiredNetworkType)
	//*  32   72:iload_2         
	//*  33   73:aload           5
	//*  34   75:getfield        #369 <Field int JobHolder.requiredNetworkType>
	//*  35   78:icmpge          85
			return JobStatus.WAITING_NOT_READY;
	//   36   81:getstatic       #372 <Field JobStatus JobStatus.WAITING_NOT_READY>
	//   37   84:areturn         
		if(jobholder.getDelayUntilNs() > l)
	//*  38   85:aload           5
	//*  39   87:invokevirtual   #375 <Method long JobHolder.getDelayUntilNs()>
	//*  40   90:lload_3         
	//*  41   91:lcmp            
	//*  42   92:ifle            99
			return JobStatus.WAITING_NOT_READY;
	//   43   95:getstatic       #372 <Field JobStatus JobStatus.WAITING_NOT_READY>
	//   44   98:areturn         
		else
			return JobStatus.WAITING_READY;
	//   45   99:getstatic       #378 <Field JobStatus JobStatus.WAITING_READY>
	//   46  102:areturn         
	}

	private int getNetworkStatus()
	{
		if(networkUtil == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field NetworkUtil networkUtil>
	//*   2    4:ifnonnull       9
			return 2;
	//    3    7:iconst_2        
	//    4    8:ireturn         
		else
			return networkUtil.getNetworkStatus(appContext);
	//    5    9:aload_0         
	//    6   10:getfield        #144 <Field NetworkUtil networkUtil>
	//    7   13:aload_0         
	//    8   14:getfield        #98  <Field Context appContext>
	//    9   17:invokeinterface #383 <Method int NetworkUtil.getNetworkStatus(Context)>
	//   10   22:ireturn         
	}

	private void handleAddJob(AddJobMessage addjobmessage)
	{
		Job job = addjobmessage.getJob();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #386 <Method Job AddJobMessage.getJob()>
	//    2    4:astore          9
		long l2 = timer.nanoTime();
	//    3    6:aload_0         
	//    4    7:getfield        #92  <Field Timer timer>
	//    5   10:invokeinterface #104 <Method long Timer.nanoTime()>
	//    6   15:lstore          7
		boolean flag;
		long l;
		long l1;
		JobHolder jobholder;
		JobHolder jobholder1;
		if(job.getDelayInMs() > 0L)
	//*   7   17:aload           9
	//*   8   19:invokevirtual   #391 <Method long Job.getDelayInMs()>
	//*   9   22:lconst_0        
	//*  10   23:lcmp            
	//*  11   24:ifle            389
			l = l2 + job.getDelayInMs() * 0xf4240L;
	//   12   27:lload           7
	//   13   29:aload           9
	//   14   31:invokevirtual   #391 <Method long Job.getDelayInMs()>
	//   15   34:ldc2w           #19  <Long 0xf4240L>
	//   16   37:lmul            
	//   17   38:ladd            
	//   18   39:lstore_3        
		else
	//*  19   40:aload           9
	//*  20   42:invokevirtual   #394 <Method long Job.getDeadlineInMs()>
	//*  21   45:lconst_0        
	//*  22   46:lcmp            
	//*  23   47:ifle            396
	//*  24   50:lload           7
	//*  25   52:aload           9
	//*  26   54:invokevirtual   #394 <Method long Job.getDeadlineInMs()>
	//*  27   57:ldc2w           #19  <Long 0xf4240L>
	//*  28   60:lmul            
	//*  29   61:ladd            
	//*  30   62:lstore          5
	//*  31   64:new             #396 <Class JobHolder$Builder>
	//*  32   67:dup             
	//*  33   68:invokespecial   #397 <Method void JobHolder$Builder()>
	//*  34   71:aload           9
	//*  35   73:invokevirtual   #400 <Method int Job.getPriority()>
	//*  36   76:invokevirtual   #404 <Method JobHolder$Builder JobHolder$Builder.priority(int)>
	//*  37   79:aload           9
	//*  38   81:invokevirtual   #408 <Method JobHolder$Builder JobHolder$Builder.job(Job)>
	//*  39   84:aload           9
	//*  40   86:invokevirtual   #411 <Method String Job.getRunGroupId()>
	//*  41   89:invokevirtual   #415 <Method JobHolder$Builder JobHolder$Builder.groupId(String)>
	//*  42   92:lload           7
	//*  43   94:invokevirtual   #419 <Method JobHolder$Builder JobHolder$Builder.createdNs(long)>
	//*  44   97:lload_3         
	//*  45   98:invokevirtual   #422 <Method JobHolder$Builder JobHolder$Builder.delayUntilNs(long)>
	//*  46  101:aload           9
	//*  47  103:invokevirtual   #423 <Method String Job.getId()>
	//*  48  106:invokevirtual   #426 <Method JobHolder$Builder JobHolder$Builder.id(String)>
	//*  49  109:aload           9
	//*  50  111:invokevirtual   #430 <Method Set Job.getTags()>
	//*  51  114:invokevirtual   #434 <Method JobHolder$Builder JobHolder$Builder.tags(Set)>
	//*  52  117:aload           9
	//*  53  119:invokevirtual   #437 <Method boolean Job.isPersistent()>
	//*  54  122:invokevirtual   #441 <Method JobHolder$Builder JobHolder$Builder.persistent(boolean)>
	//*  55  125:iconst_0        
	//*  56  126:invokevirtual   #444 <Method JobHolder$Builder JobHolder$Builder.runCount(int)>
	//*  57  129:lload           5
	//*  58  131:aload           9
	//*  59  133:invokevirtual   #447 <Method boolean Job.shouldCancelOnDeadline()>
	//*  60  136:invokevirtual   #451 <Method JobHolder$Builder JobHolder$Builder.deadline(long, boolean)>
	//*  61  139:aload           9
	//*  62  141:getfield        #452 <Field int Job.requiredNetworkType>
	//*  63  144:invokevirtual   #454 <Method JobHolder$Builder JobHolder$Builder.requiredNetworkType(int)>
	//*  64  147:ldc2w           #15  <Long 0x0L>
	//*  65  150:invokevirtual   #457 <Method JobHolder$Builder JobHolder$Builder.runningSessionId(long)>
	//*  66  153:invokevirtual   #461 <Method JobHolder JobHolder$Builder.build()>
	//*  67  156:astore          10
	//*  68  158:aload_0         
	//*  69  159:aload           9
	//*  70  161:invokevirtual   #464 <Method String Job.getSingleInstanceId()>
	//*  71  164:invokespecial   #466 <Method JobHolder findJobBySingleId(String)>
	//*  72  167:astore          11
	//*  73  169:aload           11
	//*  74  171:ifnull          189
	//*  75  174:aload_0         
	//*  76  175:getfield        #163 <Field ConsumerManager consumerManager>
	//*  77  178:aload           11
	//*  78  180:invokevirtual   #343 <Method String JobHolder.getId()>
	//*  79  183:invokevirtual   #347 <Method boolean ConsumerManager.isJobRunning(String)>
	//*  80  186:ifeq            404
	//*  81  189:iconst_1        
	//*  82  190:istore_2        
	//*  83  191:iload_2         
	//*  84  192:ifeq            429
	//*  85  195:aload           9
	//*  86  197:invokevirtual   #437 <Method boolean Job.isPersistent()>
	//*  87  200:ifeq            409
	//*  88  203:aload_0         
	//*  89  204:getfield        #133 <Field JobQueue persistentJobQueue>
	//*  90  207:astore_1        
	//*  91  208:aload           11
	//*  92  210:ifnull          417
	//*  93  213:aload_0         
	//*  94  214:getfield        #163 <Field ConsumerManager consumerManager>
	//*  95  217:getstatic       #309 <Field TagConstraint TagConstraint.ANY>
	//*  96  220:iconst_1        
	//*  97  221:anewarray       String[]
	//*  98  224:dup             
	//*  99  225:iconst_0        
	//* 100  226:aload           9
	//* 101  228:invokevirtual   #464 <Method String Job.getSingleInstanceId()>
	//* 102  231:aastore         
	//* 103  232:invokevirtual   #470 <Method Set ConsumerManager.markJobsCancelledSingleId(TagConstraint, String[])>
	//* 104  235:pop             
	//* 105  236:aload_1         
	//* 106  237:aload           10
	//* 107  239:aload           11
	//* 108  241:invokeinterface #474 <Method void JobQueue.substitute(JobHolder, JobHolder)>
	//* 109  246:invokestatic    #477 <Method boolean JqLog.isDebugEnabled()>
	//* 110  249:ifeq            314
	//* 111  252:ldc2            #479 <String "added job class: %s priority: %d delay: %d group : %s persistent: %s">
	//* 112  255:iconst_5        
	//* 113  256:anewarray       Object[]
	//* 114  259:dup             
	//* 115  260:iconst_0        
	//* 116  261:aload           9
	//* 117  263:invokevirtual   #483 <Method Class Object.getClass()>
	//* 118  266:invokevirtual   #488 <Method String Class.getSimpleName()>
	//* 119  269:aastore         
	//* 120  270:dup             
	//* 121  271:iconst_1        
	//* 122  272:aload           9
	//* 123  274:invokevirtual   #400 <Method int Job.getPriority()>
	//* 124  277:invokestatic    #493 <Method Integer Integer.valueOf(int)>
	//* 125  280:aastore         
	//* 126  281:dup             
	//* 127  282:iconst_2        
	//* 128  283:aload           9
	//* 129  285:invokevirtual   #391 <Method long Job.getDelayInMs()>
	//* 130  288:invokestatic    #288 <Method Long Long.valueOf(long)>
	//* 131  291:aastore         
	//* 132  292:dup             
	//* 133  293:iconst_3        
	//* 134  294:aload           9
	//* 135  296:invokevirtual   #411 <Method String Job.getRunGroupId()>
	//* 136  299:aastore         
	//* 137  300:dup             
	//* 138  301:iconst_4        
	//* 139  302:aload           9
	//* 140  304:invokevirtual   #437 <Method boolean Job.isPersistent()>
	//* 141  307:invokestatic    #498 <Method Boolean Boolean.valueOf(boolean)>
	//* 142  310:aastore         
	//* 143  311:invokestatic    #502 <Method void JqLog.d(String, Object[])>
	//* 144  314:aload_0         
	//* 145  315:getfield        #150 <Field DependencyInjector dependencyInjector>
	//* 146  318:ifnull          332
	//* 147  321:aload_0         
	//* 148  322:getfield        #150 <Field DependencyInjector dependencyInjector>
	//* 149  325:aload           9
	//* 150  327:invokeinterface #508 <Method void DependencyInjector.inject(Job)>
	//* 151  332:aload           10
	//* 152  334:aload_0         
	//* 153  335:getfield        #98  <Field Context appContext>
	//* 154  338:invokevirtual   #512 <Method void JobHolder.setApplicationContext(Context)>
	//* 155  341:aload           10
	//* 156  343:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//* 157  346:invokevirtual   #515 <Method void Job.onAdded()>
	//* 158  349:aload_0         
	//* 159  350:getfield        #170 <Field CallbackManager callbackManager>
	//* 160  353:aload           10
	//* 161  355:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//* 162  358:invokevirtual   #518 <Method void CallbackManager.notifyOnAdded(Job)>
	//* 163  361:iload_2         
	//* 164  362:ifeq            450
	//* 165  365:aload_0         
	//* 166  366:getfield        #163 <Field ConsumerManager consumerManager>
	//* 167  369:invokevirtual   #521 <Method void ConsumerManager.onJobAdded()>
	//* 168  372:aload           9
	//* 169  374:invokevirtual   #437 <Method boolean Job.isPersistent()>
	//* 170  377:ifeq            388
	//* 171  380:aload_0         
	//* 172  381:aload           10
	//* 173  383:lload           7
	//* 174  385:invokespecial   #525 <Method void scheduleWakeUpFor(JobHolder, long)>
	//* 175  388:return          
			l = 0x0L;
	//  176  389:ldc2w           #15  <Long 0x0L>
	//  177  392:lstore_3        
		if(job.getDeadlineInMs() > 0L)
			l1 = l2 + job.getDeadlineInMs() * 0xf4240L;
		else
	//* 178  393:goto            40
			l1 = 0xffffffffL;
	//  179  396:ldc2w           #526 <Long 0xffffffffL>
	//  180  399:lstore          5
		jobholder = (new JobHolder.Builder()).priority(job.getPriority()).job(job).groupId(job.getRunGroupId()).createdNs(l2).delayUntilNs(l).id(job.getId()).tags(job.getTags()).persistent(job.isPersistent()).runCount(0).deadline(l1, job.shouldCancelOnDeadline()).requiredNetworkType(job.requiredNetworkType).runningSessionId(0x0L).build();
		jobholder1 = findJobBySingleId(job.getSingleInstanceId());
		if(jobholder1 == null || consumerManager.isJobRunning(jobholder1.getId()))
			flag = true;
		else
	//* 181  401:goto            64
			flag = false;
	//  182  404:iconst_0        
	//  183  405:istore_2        
		if(flag)
		{
			if(job.isPersistent())
				addjobmessage = ((AddJobMessage) (persistentJobQueue));
			else
	//* 184  406:goto            191
				addjobmessage = ((AddJobMessage) (nonPersistentJobQueue));
	//  185  409:aload_0         
	//  186  410:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//  187  413:astore_1        
			if(jobholder1 != null)
			{
				consumerManager.markJobsCancelledSingleId(TagConstraint.ANY, new String[] {
					job.getSingleInstanceId()
				});
				((JobQueue) (addjobmessage)).substitute(jobholder, jobholder1);
			} else
	//* 188  414:goto            208
			{
				((JobQueue) (addjobmessage)).insert(jobholder);
	//  189  417:aload_1         
	//  190  418:aload           10
	//  191  420:invokeinterface #531 <Method boolean JobQueue.insert(JobHolder)>
	//  192  425:pop             
			}
			if(JqLog.isDebugEnabled())
				JqLog.d("added job class: %s priority: %d delay: %d group : %s persistent: %s", new Object[] {
					((Object) (job)).getClass().getSimpleName(), Integer.valueOf(job.getPriority()), Long.valueOf(job.getDelayInMs()), job.getRunGroupId(), Boolean.valueOf(job.isPersistent())
				});
		} else
	//* 193  426:goto            246
		{
			JqLog.d("another job with same singleId: %s was already queued", new Object[] {
				job.getSingleInstanceId()
			});
	//  194  429:ldc2            #533 <String "another job with same singleId: %s was already queued">
	//  195  432:iconst_1        
	//  196  433:anewarray       Object[]
	//  197  436:dup             
	//  198  437:iconst_0        
	//  199  438:aload           9
	//  200  440:invokevirtual   #464 <Method String Job.getSingleInstanceId()>
	//  201  443:aastore         
	//  202  444:invokestatic    #502 <Method void JqLog.d(String, Object[])>
		}
		if(dependencyInjector != null)
			dependencyInjector.inject(job);
		jobholder.setApplicationContext(appContext);
		jobholder.getJob().onAdded();
		callbackManager.notifyOnAdded(jobholder.getJob());
		if(flag)
		{
			consumerManager.onJobAdded();
			if(job.isPersistent())
				scheduleWakeUpFor(jobholder, l2);
			return;
		} else
	//* 203  447:goto            314
		{
			cancelSafely(jobholder, 1);
	//  204  450:aload_0         
	//  205  451:aload           10
	//  206  453:iconst_1        
	//  207  454:invokespecial   #535 <Method void cancelSafely(JobHolder, int)>
			callbackManager.notifyOnDone(jobholder.getJob());
	//  208  457:aload_0         
	//  209  458:getfield        #170 <Field CallbackManager callbackManager>
	//  210  461:aload           10
	//  211  463:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//  212  466:invokevirtual   #538 <Method void CallbackManager.notifyOnDone(Job)>
			return;
	//  213  469:return          
		}
	}

	private void handleCancel(CancelMessage cancelmessage)
	{
		cancelmessage = ((CancelMessage) (new CancelHandler(cancelmessage.getConstraint(), cancelmessage.getTags(), cancelmessage.getCallback())));
	//    0    0:new             #540 <Class CancelHandler>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokevirtual   #546 <Method TagConstraint CancelMessage.getConstraint()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #549 <Method String[] CancelMessage.getTags()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #553 <Method CancelResult$AsyncCancelCallback CancelMessage.getCallback()>
	//    8   16:invokespecial   #556 <Method void CancelHandler(TagConstraint, String[], CancelResult$AsyncCancelCallback)>
	//    9   19:astore_1        
		((CancelHandler) (cancelmessage)).query(this, consumerManager);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #163 <Field ConsumerManager consumerManager>
	//   14   26:invokevirtual   #560 <Method void CancelHandler.query(JobManagerThread, ConsumerManager)>
		if(((CancelHandler) (cancelmessage)).isDone())
	//*  15   29:aload_1         
	//*  16   30:invokevirtual   #563 <Method boolean CancelHandler.isDone()>
	//*  17   33:ifeq            42
		{
			((CancelHandler) (cancelmessage)).commit(this);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:invokevirtual   #566 <Method void CancelHandler.commit(JobManagerThread)>
			return;
	//   21   41:return          
		}
		if(pendingCancelHandlers == null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #568 <Field List pendingCancelHandlers>
	//*  24   46:ifnonnull       60
			pendingCancelHandlers = ((List) (new ArrayList()));
	//   25   49:aload_0         
	//   26   50:new             #570 <Class ArrayList>
	//   27   53:dup             
	//   28   54:invokespecial   #571 <Method void ArrayList()>
	//   29   57:putfield        #568 <Field List pendingCancelHandlers>
		pendingCancelHandlers.add(((Object) (cancelmessage)));
	//   30   60:aload_0         
	//   31   61:getfield        #568 <Field List pendingCancelHandlers>
	//   32   64:aload_1         
	//   33   65:invokeinterface #577 <Method boolean List.add(Object)>
	//   34   70:pop             
	//   35   71:return          
	}

	private void handleCommand(CommandMessage commandmessage)
	{
		if(commandmessage.getWhat() == 1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #582 <Method int CommandMessage.getWhat()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          22
		{
			messageQueue.stop();
	//    4    8:aload_0         
	//    5    9:getfield        #72  <Field PriorityMessageQueue messageQueue>
	//    6   12:invokevirtual   #587 <Method void PriorityMessageQueue.stop()>
			messageQueue.clear();
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field PriorityMessageQueue messageQueue>
	//    9   19:invokevirtual   #588 <Method void PriorityMessageQueue.clear()>
		}
	//   10   22:return          
	}

	private void handlePublicQuery(PublicQueryMessage publicquerymessage)
	{
		publicquerymessage.getWhat();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #591 <Method int PublicQueryMessage.getWhat()>
		JVM INSTR lookupswitch 8: default 80
	//	               0: 111
	//	               1: 125
	//	               2: 143
	//	               3: 174
	//	               4: 197
	//	               5: 220
	//	               6: 242
	//	               101: 259;
	//    2    4:lookupswitch    8: default 80
	//	               0: 111
	//	               1: 125
	//	               2: 143
	//	               3: 174
	//	               4: 197
	//	               5: 220
	//	               6: 242
	//	               101: 259
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
		throw new IllegalArgumentException((new StringBuilder()).append("cannot handle public query with type ").append(publicquerymessage.getWhat()).toString());
	//    3   80:new             #593 <Class IllegalArgumentException>
	//    4   83:dup             
	//    5   84:new             #595 <Class StringBuilder>
	//    6   87:dup             
	//    7   88:invokespecial   #596 <Method void StringBuilder()>
	//    8   91:ldc2            #598 <String "cannot handle public query with type ">
	//    9   94:invokevirtual   #602 <Method StringBuilder StringBuilder.append(String)>
	//   10   97:aload_1         
	//   11   98:invokevirtual   #591 <Method int PublicQueryMessage.getWhat()>
	//   12  101:invokevirtual   #605 <Method StringBuilder StringBuilder.append(int)>
	//   13  104:invokevirtual   #608 <Method String StringBuilder.toString()>
	//   14  107:invokespecial   #611 <Method void IllegalArgumentException(String)>
	//   15  110:athrow          
_L2:
		publicquerymessage.getCallback().onResult(count());
	//   16  111:aload_1         
	//   17  112:invokevirtual   #614 <Method IntCallback PublicQueryMessage.getCallback()>
	//   18  115:aload_0         
	//   19  116:invokevirtual   #617 <Method int count()>
	//   20  119:invokeinterface #622 <Method void IntCallback.onResult(int)>
_L11:
		return;
	//   21  124:return          
_L3:
		publicquerymessage.getCallback().onResult(countReadyJobs(getNetworkStatus()));
	//   22  125:aload_1         
	//   23  126:invokevirtual   #614 <Method IntCallback PublicQueryMessage.getCallback()>
	//   24  129:aload_0         
	//   25  130:aload_0         
	//   26  131:invokespecial   #365 <Method int getNetworkStatus()>
	//   27  134:invokespecial   #624 <Method int countReadyJobs(int)>
	//   28  137:invokeinterface #622 <Method void IntCallback.onResult(int)>
		return;
	//   29  142:return          
_L4:
		JqLog.d("handling start request...", new Object[0]);
	//   30  143:ldc2            #626 <String "handling start request...">
	//   31  146:iconst_0        
	//   32  147:anewarray       Object[]
	//   33  150:invokestatic    #502 <Method void JqLog.d(String, Object[])>
		if(running) goto _L11; else goto _L10
	//   34  153:aload_0         
	//   35  154:getfield        #66  <Field boolean running>
	//   36  157:ifne            124
_L10:
		running = true;
	//   37  160:aload_0         
	//   38  161:iconst_1        
	//   39  162:putfield        #66  <Field boolean running>
		consumerManager.handleConstraintChange();
	//   40  165:aload_0         
	//   41  166:getfield        #163 <Field ConsumerManager consumerManager>
	//   42  169:invokevirtual   #629 <Method boolean ConsumerManager.handleConstraintChange()>
	//   43  172:pop             
		return;
	//   44  173:return          
_L5:
		JqLog.d("handling stop request...", new Object[0]);
	//   45  174:ldc2            #631 <String "handling stop request...">
	//   46  177:iconst_0        
	//   47  178:anewarray       Object[]
	//   48  181:invokestatic    #502 <Method void JqLog.d(String, Object[])>
		running = false;
	//   49  184:aload_0         
	//   50  185:iconst_0        
	//   51  186:putfield        #66  <Field boolean running>
		consumerManager.handleStop();
	//   52  189:aload_0         
	//   53  190:getfield        #163 <Field ConsumerManager consumerManager>
	//   54  193:invokevirtual   #634 <Method void ConsumerManager.handleStop()>
		return;
	//   55  196:return          
_L6:
		JobStatus jobstatus = getJobStatus(publicquerymessage.getStringArg());
	//   56  197:aload_0         
	//   57  198:aload_1         
	//   58  199:invokevirtual   #637 <Method String PublicQueryMessage.getStringArg()>
	//   59  202:invokespecial   #639 <Method JobStatus getJobStatus(String)>
	//   60  205:astore_2        
		publicquerymessage.getCallback().onResult(jobstatus.ordinal());
	//   61  206:aload_1         
	//   62  207:invokevirtual   #614 <Method IntCallback PublicQueryMessage.getCallback()>
	//   63  210:aload_2         
	//   64  211:invokevirtual   #642 <Method int JobStatus.ordinal()>
	//   65  214:invokeinterface #622 <Method void IntCallback.onResult(int)>
		return;
	//   66  219:return          
_L7:
		clear();
	//   67  220:aload_0         
	//   68  221:invokespecial   #643 <Method void clear()>
		if(publicquerymessage.getCallback() == null) goto _L11; else goto _L12
	//   69  224:aload_1         
	//   70  225:invokevirtual   #614 <Method IntCallback PublicQueryMessage.getCallback()>
	//   71  228:ifnull          124
_L12:
		publicquerymessage.getCallback().onResult(0);
	//   72  231:aload_1         
	//   73  232:invokevirtual   #614 <Method IntCallback PublicQueryMessage.getCallback()>
	//   74  235:iconst_0        
	//   75  236:invokeinterface #622 <Method void IntCallback.onResult(int)>
		return;
	//   76  241:return          
_L8:
		publicquerymessage.getCallback().onResult(consumerManager.getWorkerCount());
	//   77  242:aload_1         
	//   78  243:invokevirtual   #614 <Method IntCallback PublicQueryMessage.getCallback()>
	//   79  246:aload_0         
	//   80  247:getfield        #163 <Field ConsumerManager consumerManager>
	//   81  250:invokevirtual   #646 <Method int ConsumerManager.getWorkerCount()>
	//   82  253:invokeinterface #622 <Method void IntCallback.onResult(int)>
		return;
	//   83  258:return          
_L9:
		publicquerymessage.getCallback().onResult(0);
	//   84  259:aload_1         
	//   85  260:invokevirtual   #614 <Method IntCallback PublicQueryMessage.getCallback()>
	//   86  263:iconst_0        
	//   87  264:invokeinterface #622 <Method void IntCallback.onResult(int)>
		return;
	//   88  269:return          
	}

	private void handleRunJobResult(RunJobResultMessage runjobresultmessage)
	{
		int i1;
		RetryConstraint retryconstraint;
		JobHolder jobholder;
		i1 = runjobresultmessage.getResult();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #651 <Method int RunJobResultMessage.getResult()>
	//    2    4:istore          6
		jobholder = runjobresultmessage.getJobHolder();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #654 <Method JobHolder RunJobResultMessage.getJobHolder()>
	//    5   10:astore          8
		callbackManager.notifyOnRun(jobholder.getJob(), i1);
	//    6   12:aload_0         
	//    7   13:getfield        #170 <Field CallbackManager callbackManager>
	//    8   16:aload           8
	//    9   18:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//   10   21:iload           6
	//   11   23:invokevirtual   #658 <Method void CallbackManager.notifyOnRun(Job, int)>
		retryconstraint = null;
	//   12   26:aconst_null     
	//   13   27:astore          7
		i1;
	//   14   29:iload           6
		JVM INSTR tableswitch 1 7: default 72
	//	               1 83
	//	               2 211
	//	               3 293
	//	               4 277
	//	               5 227
	//	               6 243
	//	               7 260;
	//   15   31:tableswitch     1 7: default 72
	//	               1 83
	//	               2 211
	//	               3 293
	//	               4 277
	//	               5 227
	//	               6 243
	//	               7 260
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new IllegalArgumentException("unknown job holder result");
	//   16   72:new             #593 <Class IllegalArgumentException>
	//   17   75:dup             
	//   18   76:ldc2            #660 <String "unknown job holder result">
	//   19   79:invokespecial   #611 <Method void IllegalArgumentException(String)>
	//   20   82:athrow          
_L2:
		removeJob(jobholder);
	//   21   83:aload_0         
	//   22   84:aload           8
	//   23   86:invokespecial   #664 <Method void removeJob(JobHolder)>
_L10:
		consumerManager.handleRunJobResult(runjobresultmessage, jobholder, retryconstraint);
	//   24   89:aload_0         
	//   25   90:getfield        #163 <Field ConsumerManager consumerManager>
	//   26   93:aload_1         
	//   27   94:aload           8
	//   28   96:aload           7
	//   29   98:invokevirtual   #667 <Method void ConsumerManager.handleRunJobResult(RunJobResultMessage, JobHolder, RetryConstraint)>
		callbackManager.notifyAfterRun(jobholder.getJob(), i1);
	//   30  101:aload_0         
	//   31  102:getfield        #170 <Field CallbackManager callbackManager>
	//   32  105:aload           8
	//   33  107:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//   34  110:iload           6
	//   35  112:invokevirtual   #670 <Method void CallbackManager.notifyAfterRun(Job, int)>
		if(pendingCancelHandlers != null)
	//*  36  115:aload_0         
	//*  37  116:getfield        #568 <Field List pendingCancelHandlers>
	//*  38  119:ifnull          306
		{
			int j = pendingCancelHandlers.size();
	//   39  122:aload_0         
	//   40  123:getfield        #568 <Field List pendingCancelHandlers>
	//   41  126:invokeinterface #673 <Method int List.size()>
	//   42  131:istore_3        
			int k;
			for(int i = 0; i < j; j = k)
	//*  43  132:iconst_0        
	//*  44  133:istore_2        
	//*  45  134:iload_2         
	//*  46  135:iload_3         
	//*  47  136:icmpge          306
			{
				runjobresultmessage = ((RunJobResultMessage) ((CancelHandler)pendingCancelHandlers.get(i)));
	//   48  139:aload_0         
	//   49  140:getfield        #568 <Field List pendingCancelHandlers>
	//   50  143:iload_2         
	//   51  144:invokeinterface #677 <Method Object List.get(int)>
	//   52  149:checkcast       #540 <Class CancelHandler>
	//   53  152:astore_1        
				((CancelHandler) (runjobresultmessage)).onJobRun(jobholder, i1);
	//   54  153:aload_1         
	//   55  154:aload           8
	//   56  156:iload           6
	//   57  158:invokevirtual   #680 <Method void CancelHandler.onJobRun(JobHolder, int)>
				int l = i;
	//   58  161:iload_2         
	//   59  162:istore          5
				k = j;
	//   60  164:iload_3         
	//   61  165:istore          4
				if(((CancelHandler) (runjobresultmessage)).isDone())
	//*  62  167:aload_1         
	//*  63  168:invokevirtual   #563 <Method boolean CancelHandler.isDone()>
	//*  64  171:ifeq            200
				{
					((CancelHandler) (runjobresultmessage)).commit(this);
	//   65  174:aload_1         
	//   66  175:aload_0         
	//   67  176:invokevirtual   #566 <Method void CancelHandler.commit(JobManagerThread)>
					pendingCancelHandlers.remove(i);
	//   68  179:aload_0         
	//   69  180:getfield        #568 <Field List pendingCancelHandlers>
	//   70  183:iload_2         
	//   71  184:invokeinterface #683 <Method Object List.remove(int)>
	//   72  189:pop             
					l = i - 1;
	//   73  190:iload_2         
	//   74  191:iconst_1        
	//   75  192:isub            
	//   76  193:istore          5
					k = j - 1;
	//   77  195:iload_3         
	//   78  196:iconst_1        
	//   79  197:isub            
	//   80  198:istore          4
				}
				i = l + 1;
	//   81  200:iload           5
	//   82  202:iconst_1        
	//   83  203:iadd            
	//   84  204:istore_2        
			}

	//   85  205:iload           4
	//   86  207:istore_3        
		}
		break; /* Loop/switch isn't completed */
	//   87  208:goto            134
_L3:
		cancelSafely(jobholder, 2);
	//   88  211:aload_0         
	//   89  212:aload           8
	//   90  214:iconst_2        
	//   91  215:invokespecial   #535 <Method void cancelSafely(JobHolder, int)>
		removeJob(jobholder);
	//   92  218:aload_0         
	//   93  219:aload           8
	//   94  221:invokespecial   #664 <Method void removeJob(JobHolder)>
		continue; /* Loop/switch isn't completed */
	//   95  224:goto            89
_L6:
		cancelSafely(jobholder, 5);
	//   96  227:aload_0         
	//   97  228:aload           8
	//   98  230:iconst_5        
	//   99  231:invokespecial   #535 <Method void cancelSafely(JobHolder, int)>
		removeJob(jobholder);
	//  100  234:aload_0         
	//  101  235:aload           8
	//  102  237:invokespecial   #664 <Method void removeJob(JobHolder)>
		continue; /* Loop/switch isn't completed */
	//  103  240:goto            89
_L7:
		cancelSafely(jobholder, 6);
	//  104  243:aload_0         
	//  105  244:aload           8
	//  106  246:bipush          6
	//  107  248:invokespecial   #535 <Method void cancelSafely(JobHolder, int)>
		removeJob(jobholder);
	//  108  251:aload_0         
	//  109  252:aload           8
	//  110  254:invokespecial   #664 <Method void removeJob(JobHolder)>
		continue; /* Loop/switch isn't completed */
	//  111  257:goto            89
_L8:
		cancelSafely(jobholder, 7);
	//  112  260:aload_0         
	//  113  261:aload           8
	//  114  263:bipush          7
	//  115  265:invokespecial   #535 <Method void cancelSafely(JobHolder, int)>
		removeJob(jobholder);
	//  116  268:aload_0         
	//  117  269:aload           8
	//  118  271:invokespecial   #664 <Method void removeJob(JobHolder)>
		continue; /* Loop/switch isn't completed */
	//  119  274:goto            89
_L5:
		retryconstraint = jobholder.getRetryConstraint();
	//  120  277:aload           8
	//  121  279:invokevirtual   #687 <Method RetryConstraint JobHolder.getRetryConstraint()>
	//  122  282:astore          7
		insertOrReplace(jobholder);
	//  123  284:aload_0         
	//  124  285:aload           8
	//  125  287:invokespecial   #690 <Method void insertOrReplace(JobHolder)>
		continue; /* Loop/switch isn't completed */
	//  126  290:goto            89
_L4:
		JqLog.d("running job failed and cancelled, doing nothing. Will be removed after it's onCancel is called by the CancelHandler", new Object[0]);
	//  127  293:ldc2            #692 <String "running job failed and cancelled, doing nothing. Will be removed after it's onCancel is called by the CancelHandler">
	//  128  296:iconst_0        
	//  129  297:anewarray       Object[]
	//  130  300:invokestatic    #502 <Method void JqLog.d(String, Object[])>
		if(true) goto _L10; else goto _L9
	//  131  303:goto            89
_L9:
	//  132  306:return          
	}

	private void handleSchedulerMessage(SchedulerMessage schedulermessage)
	{
		int i = schedulermessage.getWhat();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #695 <Method int SchedulerMessage.getWhat()>
	//    2    4:istore_2        
		if(i == 1)
	//*   3    5:iload_2         
	//*   4    6:iconst_1        
	//*   5    7:icmpne          19
		{
			handleSchedulerStart(schedulermessage.getConstraint());
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #698 <Method SchedulerConstraint SchedulerMessage.getConstraint()>
	//    9   15:invokespecial   #702 <Method void handleSchedulerStart(SchedulerConstraint)>
			return;
	//   10   18:return          
		}
		if(i == 2)
	//*  11   19:iload_2         
	//*  12   20:iconst_2        
	//*  13   21:icmpne          33
		{
			handleSchedulerStop(schedulermessage.getConstraint());
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #698 <Method SchedulerConstraint SchedulerMessage.getConstraint()>
	//   17   29:invokespecial   #705 <Method void handleSchedulerStop(SchedulerConstraint)>
			return;
	//   18   32:return          
		} else
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Unknown scheduler message with what ").append(i).toString());
	//   19   33:new             #593 <Class IllegalArgumentException>
	//   20   36:dup             
	//   21   37:new             #595 <Class StringBuilder>
	//   22   40:dup             
	//   23   41:invokespecial   #596 <Method void StringBuilder()>
	//   24   44:ldc2            #707 <String "Unknown scheduler message with what ">
	//   25   47:invokevirtual   #602 <Method StringBuilder StringBuilder.append(String)>
	//   26   50:iload_2         
	//   27   51:invokevirtual   #605 <Method StringBuilder StringBuilder.append(int)>
	//   28   54:invokevirtual   #608 <Method String StringBuilder.toString()>
	//   29   57:invokespecial   #611 <Method void IllegalArgumentException(String)>
	//   30   60:athrow          
		}
	}

	private void handleSchedulerStart(SchedulerConstraint schedulerconstraint)
	{
		if(!isRunning())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #710 <Method boolean isRunning()>
	//*   2    4:ifne            24
		{
			if(scheduler != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #112 <Field Scheduler scheduler>
	//*   5   11:ifnull          23
				scheduler.onFinished(schedulerconstraint, true);
	//    6   14:aload_0         
	//    7   15:getfield        #112 <Field Scheduler scheduler>
	//    8   18:aload_1         
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #716 <Method void Scheduler.onFinished(SchedulerConstraint, boolean)>
		} else
	//*  11   23:return          
		if(!hasJobsWithSchedulerConstraint(schedulerconstraint))
	//*  12   24:aload_0         
	//*  13   25:aload_1         
	//*  14   26:invokespecial   #720 <Method boolean hasJobsWithSchedulerConstraint(SchedulerConstraint)>
	//*  15   29:ifne            49
		{
			if(scheduler != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #112 <Field Scheduler scheduler>
	//*  18   36:ifnull          23
			{
				scheduler.onFinished(schedulerconstraint, false);
	//   19   39:aload_0         
	//   20   40:getfield        #112 <Field Scheduler scheduler>
	//   21   43:aload_1         
	//   22   44:iconst_0        
	//   23   45:invokevirtual   #716 <Method void Scheduler.onFinished(SchedulerConstraint, boolean)>
				return;
	//   24   48:return          
			}
		} else
		{
			if(pendingSchedulerCallbacks == null)
	//*  25   49:aload_0         
	//*  26   50:getfield        #722 <Field List pendingSchedulerCallbacks>
	//*  27   53:ifnonnull       67
				pendingSchedulerCallbacks = ((List) (new ArrayList()));
	//   28   56:aload_0         
	//   29   57:new             #570 <Class ArrayList>
	//   30   60:dup             
	//   31   61:invokespecial   #571 <Method void ArrayList()>
	//   32   64:putfield        #722 <Field List pendingSchedulerCallbacks>
			pendingSchedulerCallbacks.add(((Object) (schedulerconstraint)));
	//   33   67:aload_0         
	//   34   68:getfield        #722 <Field List pendingSchedulerCallbacks>
	//   35   71:aload_1         
	//   36   72:invokeinterface #577 <Method boolean List.add(Object)>
	//   37   77:pop             
			consumerManager.handleConstraintChange();
	//   38   78:aload_0         
	//   39   79:getfield        #163 <Field ConsumerManager consumerManager>
	//   40   82:invokevirtual   #629 <Method boolean ConsumerManager.handleConstraintChange()>
	//   41   85:pop             
			return;
	//   42   86:return          
		}
	}

	private void handleSchedulerStop(SchedulerConstraint schedulerconstraint)
	{
		List list = pendingSchedulerCallbacks;
	//    0    0:aload_0         
	//    1    1:getfield        #722 <Field List pendingSchedulerCallbacks>
	//    2    4:astore_3        
		if(list != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          60
		{
			for(int i = list.size() - 1; i >= 0; i--)
	//*   5    9:aload_3         
	//*   6   10:invokeinterface #673 <Method int List.size()>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iflt            60
				if(((SchedulerConstraint)list.get(i)).getUuid().equals(((Object) (schedulerconstraint.getUuid()))))
	//*  12   22:aload_3         
	//*  13   23:iload_2         
	//*  14   24:invokeinterface #677 <Method Object List.get(int)>
	//*  15   29:checkcast       #724 <Class SchedulerConstraint>
	//*  16   32:invokevirtual   #727 <Method String SchedulerConstraint.getUuid()>
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #727 <Method String SchedulerConstraint.getUuid()>
	//*  19   39:invokevirtual   #730 <Method boolean String.equals(Object)>
	//*  20   42:ifeq            53
					list.remove(i);
	//   21   45:aload_3         
	//   22   46:iload_2         
	//   23   47:invokeinterface #683 <Method Object List.remove(int)>
	//   24   52:pop             

	//   25   53:iload_2         
	//   26   54:iconst_1        
	//   27   55:isub            
	//   28   56:istore_2        
		}
	//*  29   57:goto            18
		while(scheduler == null || !hasJobsWithSchedulerConstraint(schedulerconstraint)) 
	//*  30   60:aload_0         
	//*  31   61:getfield        #112 <Field Scheduler scheduler>
	//*  32   64:ifnonnull       68
			return;
	//   33   67:return          
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:invokespecial   #720 <Method boolean hasJobsWithSchedulerConstraint(SchedulerConstraint)>
	//   37   73:ifeq            67
		scheduler.request(schedulerconstraint);
	//   38   76:aload_0         
	//   39   77:getfield        #112 <Field Scheduler scheduler>
	//   40   80:aload_1         
	//   41   81:invokevirtual   #733 <Method void Scheduler.request(SchedulerConstraint)>
	//   42   84:return          
	}

	private boolean hasJobsWithSchedulerConstraint(SchedulerConstraint schedulerconstraint)
	{
		if(!consumerManager.hasJobsWithSchedulerConstraint(schedulerconstraint))
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field ConsumerManager consumerManager>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #734 <Method boolean ConsumerManager.hasJobsWithSchedulerConstraint(SchedulerConstraint)>
	//*   4    8:ifeq            13
	//*   5   11:iconst_1        
	//*   6   12:ireturn         
		{
			queryConstraint.clear();
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field Constraint queryConstraint>
	//    9   17:invokevirtual   #267 <Method void Constraint.clear()>
			queryConstraint.setNowInNs(timer.nanoTime());
	//   10   20:aload_0         
	//   11   21:getfield        #64  <Field Constraint queryConstraint>
	//   12   24:aload_0         
	//   13   25:getfield        #92  <Field Timer timer>
	//   14   28:invokeinterface #104 <Method long Timer.nanoTime()>
	//   15   33:invokevirtual   #271 <Method void Constraint.setNowInNs(long)>
			queryConstraint.setMaxNetworkType(schedulerconstraint.getNetworkStatus());
	//   16   36:aload_0         
	//   17   37:getfield        #64  <Field Constraint queryConstraint>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #735 <Method int SchedulerConstraint.getNetworkStatus()>
	//   20   44:invokevirtual   #274 <Method void Constraint.setMaxNetworkType(int)>
			if(persistentJobQueue.countReadyJobs(queryConstraint) <= 0)
	//*  21   47:aload_0         
	//*  22   48:getfield        #133 <Field JobQueue persistentJobQueue>
	//*  23   51:aload_0         
	//*  24   52:getfield        #64  <Field Constraint queryConstraint>
	//*  25   55:invokeinterface #295 <Method int JobQueue.countReadyJobs(Constraint)>
	//*  26   60:ifgt            11
				return false;
	//   27   63:iconst_0        
	//   28   64:ireturn         
		}
		return true;
	}

	private void insertOrReplace(JobHolder jobholder)
	{
		RetryConstraint retryconstraint = jobholder.getRetryConstraint();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #687 <Method RetryConstraint JobHolder.getRetryConstraint()>
	//    2    4:astore          4
		if(retryconstraint == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       17
		{
			reAddJob(jobholder);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #738 <Method void reAddJob(JobHolder)>
			return;
	//    8   16:return          
		}
		if(retryconstraint.getNewPriority() != null)
	//*   9   17:aload           4
	//*  10   19:invokevirtual   #744 <Method Integer RetryConstraint.getNewPriority()>
	//*  11   22:ifnull          37
			jobholder.setPriority(retryconstraint.getNewPriority().intValue());
	//   12   25:aload_1         
	//   13   26:aload           4
	//   14   28:invokevirtual   #744 <Method Integer RetryConstraint.getNewPriority()>
	//   15   31:invokevirtual   #747 <Method int Integer.intValue()>
	//   16   34:invokevirtual   #750 <Method void JobHolder.setPriority(int)>
		long l = -1L;
	//   17   37:ldc2w           #751 <Long -1L>
	//   18   40:lstore_2        
		if(retryconstraint.getNewDelayInMs() != null)
	//*  19   41:aload           4
	//*  20   43:invokevirtual   #756 <Method Long RetryConstraint.getNewDelayInMs()>
	//*  21   46:ifnull          58
			l = retryconstraint.getNewDelayInMs().longValue();
	//   22   49:aload           4
	//   23   51:invokevirtual   #756 <Method Long RetryConstraint.getNewDelayInMs()>
	//   24   54:invokevirtual   #759 <Method long Long.longValue()>
	//   25   57:lstore_2        
		if(l > 0L)
	//*  26   58:lload_2         
	//*  27   59:lconst_0        
	//*  28   60:lcmp            
	//*  29   61:ifle            91
			l = timer.nanoTime() + 0xf4240L * l;
	//   30   64:aload_0         
	//   31   65:getfield        #92  <Field Timer timer>
	//   32   68:invokeinterface #104 <Method long Timer.nanoTime()>
	//   33   73:ldc2w           #19  <Long 0xf4240L>
	//   34   76:lload_2         
	//   35   77:lmul            
	//   36   78:ladd            
	//   37   79:lstore_2        
		else
	//*  38   80:aload_1         
	//*  39   81:lload_2         
	//*  40   82:invokevirtual   #762 <Method void JobHolder.setDelayUntilNs(long)>
	//*  41   85:aload_0         
	//*  42   86:aload_1         
	//*  43   87:invokespecial   #738 <Method void reAddJob(JobHolder)>
	//*  44   90:return          
			l = 0x0L;
	//   45   91:ldc2w           #15  <Long 0x0L>
	//   46   94:lstore_2        
		jobholder.setDelayUntilNs(l);
		reAddJob(jobholder);
	//*  47   95:goto            80
	}

	private void invokeSchedulersIfIdle()
	{
		if(scheduler != null && pendingSchedulerCallbacks != null && !pendingSchedulerCallbacks.isEmpty() && consumerManager.areAllConsumersIdle())
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field Scheduler scheduler>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #722 <Field List pendingSchedulerCallbacks>
	//*   5   11:ifnull          36
	//*   6   14:aload_0         
	//*   7   15:getfield        #722 <Field List pendingSchedulerCallbacks>
	//*   8   18:invokeinterface #763 <Method boolean List.isEmpty()>
	//*   9   23:ifne            36
	//*  10   26:aload_0         
	//*  11   27:getfield        #163 <Field ConsumerManager consumerManager>
	//*  12   30:invokevirtual   #766 <Method boolean ConsumerManager.areAllConsumersIdle()>
	//*  13   33:ifne            37
	//*  14   36:return          
		{
			int i = pendingSchedulerCallbacks.size() - 1;
	//   15   37:aload_0         
	//   16   38:getfield        #722 <Field List pendingSchedulerCallbacks>
	//   17   41:invokeinterface #673 <Method int List.size()>
	//   18   46:iconst_1        
	//   19   47:isub            
	//   20   48:istore_1        
			while(i >= 0) 
	//*  21   49:iload_1         
	//*  22   50:iflt            36
			{
				SchedulerConstraint schedulerconstraint = (SchedulerConstraint)pendingSchedulerCallbacks.remove(i);
	//   23   53:aload_0         
	//   24   54:getfield        #722 <Field List pendingSchedulerCallbacks>
	//   25   57:iload_1         
	//   26   58:invokeinterface #683 <Method Object List.remove(int)>
	//   27   63:checkcast       #724 <Class SchedulerConstraint>
	//   28   66:astore_3        
				boolean flag = hasJobsWithSchedulerConstraint(schedulerconstraint);
	//   29   67:aload_0         
	//   30   68:aload_3         
	//   31   69:invokespecial   #720 <Method boolean hasJobsWithSchedulerConstraint(SchedulerConstraint)>
	//   32   72:istore_2        
				scheduler.onFinished(schedulerconstraint, flag);
	//   33   73:aload_0         
	//   34   74:getfield        #112 <Field Scheduler scheduler>
	//   35   77:aload_3         
	//   36   78:iload_2         
	//   37   79:invokevirtual   #716 <Method void Scheduler.onFinished(SchedulerConstraint, boolean)>
				i--;
	//   38   82:iload_1         
	//   39   83:iconst_1        
	//   40   84:isub            
	//   41   85:istore_1        
			}
		}
	//*  42   86:goto            49
	}

	private void reAddJob(JobHolder jobholder)
	{
		if(!jobholder.isCancelled())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #769 <Method boolean JobHolder.isCancelled()>
	//*   2    4:ifne            41
		{
			if(jobholder.getJob().isPersistent())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//*   5   11:invokevirtual   #437 <Method boolean Job.isPersistent()>
	//*   6   14:ifeq            29
			{
				persistentJobQueue.insertOrReplace(jobholder);
	//    7   17:aload_0         
	//    8   18:getfield        #133 <Field JobQueue persistentJobQueue>
	//    9   21:aload_1         
	//   10   22:invokeinterface #771 <Method boolean JobQueue.insertOrReplace(JobHolder)>
	//   11   27:pop             
				return;
	//   12   28:return          
			} else
			{
				nonPersistentJobQueue.insertOrReplace(jobholder);
	//   13   29:aload_0         
	//   14   30:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//   15   33:aload_1         
	//   16   34:invokeinterface #771 <Method boolean JobQueue.insertOrReplace(JobHolder)>
	//   17   39:pop             
				return;
	//   18   40:return          
			}
		} else
		{
			JqLog.d((new StringBuilder()).append("not re-adding cancelled job ").append(((Object) (jobholder))).toString(), new Object[0]);
	//   19   41:new             #595 <Class StringBuilder>
	//   20   44:dup             
	//   21   45:invokespecial   #596 <Method void StringBuilder()>
	//   22   48:ldc2            #773 <String "not re-adding cancelled job ">
	//   23   51:invokevirtual   #602 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:aload_1         
	//   25   55:invokevirtual   #776 <Method StringBuilder StringBuilder.append(Object)>
	//   26   58:invokevirtual   #608 <Method String StringBuilder.toString()>
	//   27   61:iconst_0        
	//   28   62:anewarray       Object[]
	//   29   65:invokestatic    #502 <Method void JqLog.d(String, Object[])>
			return;
	//   30   68:return          
		}
	}

	private void removeJob(JobHolder jobholder)
	{
		if(jobholder.getJob().isPersistent())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//*   2    4:invokevirtual   #437 <Method boolean Job.isPersistent()>
	//*   3    7:ifeq            32
			persistentJobQueue.remove(jobholder);
	//    4   10:aload_0         
	//    5   11:getfield        #133 <Field JobQueue persistentJobQueue>
	//    6   14:aload_1         
	//    7   15:invokeinterface #778 <Method void JobQueue.remove(JobHolder)>
		else
	//*   8   20:aload_0         
	//*   9   21:getfield        #170 <Field CallbackManager callbackManager>
	//*  10   24:aload_1         
	//*  11   25:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//*  12   28:invokevirtual   #538 <Method void CallbackManager.notifyOnDone(Job)>
	//*  13   31:return          
			nonPersistentJobQueue.remove(jobholder);
	//   14   32:aload_0         
	//   15   33:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//   16   36:aload_1         
	//   17   37:invokeinterface #778 <Method void JobQueue.remove(JobHolder)>
		callbackManager.notifyOnDone(jobholder.getJob());
	//*  18   42:goto            20
	}

	private void scheduleWakeUpFor(JobHolder jobholder, long l)
	{
		if(scheduler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field Scheduler scheduler>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			int i = jobholder.requiredNetworkType;
	//    4    8:aload_1         
	//    5    9:getfield        #369 <Field int JobHolder.requiredNetworkType>
	//    6   12:istore          6
			long l2 = jobholder.getDelayUntilNs();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #375 <Method long JobHolder.getDelayUntilNs()>
	//    9   18:lstore          9
			long l3 = jobholder.getDeadlineNs();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #781 <Method long JobHolder.getDeadlineNs()>
	//   12   24:lstore          11
			boolean flag;
			boolean flag1;
			long l1;
			if(l2 > l)
	//*  13   26:lload           9
	//*  14   28:lload_2         
	//*  15   29:lcmp            
	//*  16   30:ifle            170
				l1 = TimeUnit.NANOSECONDS.toMillis(l2 - l);
	//   17   33:getstatic       #787 <Field TimeUnit TimeUnit.NANOSECONDS>
	//   18   36:lload           9
	//   19   38:lload_2         
	//   20   39:lsub            
	//   21   40:invokevirtual   #791 <Method long TimeUnit.toMillis(long)>
	//   22   43:lstore          7
			else
	//*  23   45:lload           11
	//*  24   47:ldc2w           #526 <Long 0xffffffffL>
	//*  25   50:lcmp            
	//*  26   51:ifeq            176
	//*  27   54:getstatic       #787 <Field TimeUnit TimeUnit.NANOSECONDS>
	//*  28   57:lload           11
	//*  29   59:lload_2         
	//*  30   60:lsub            
	//*  31   61:invokevirtual   #791 <Method long TimeUnit.toMillis(long)>
	//*  32   64:invokestatic    #288 <Method Long Long.valueOf(long)>
	//*  33   67:astore_1        
	//*  34   68:lload           9
	//*  35   70:lload_2         
	//*  36   71:lcmp            
	//*  37   72:ifle            181
	//*  38   75:lload           7
	//*  39   77:ldc2w           #792 <Long 30000L>
	//*  40   80:lcmp            
	//*  41   81:iflt            181
	//*  42   84:iconst_1        
	//*  43   85:istore          4
	//*  44   87:aload_1         
	//*  45   88:ifnull          187
	//*  46   91:aload_1         
	//*  47   92:invokevirtual   #759 <Method long Long.longValue()>
	//*  48   95:ldc2w           #792 <Long 30000L>
	//*  49   98:lcmp            
	//*  50   99:iflt            187
	//*  51  102:iconst_1        
	//*  52  103:istore          5
	//*  53  105:iload           6
	//*  54  107:ifne            120
	//*  55  110:iload           4
	//*  56  112:ifne            120
	//*  57  115:iload           5
	//*  58  117:ifeq            7
	//*  59  120:new             #724 <Class SchedulerConstraint>
	//*  60  123:dup             
	//*  61  124:invokestatic    #799 <Method UUID UUID.randomUUID()>
	//*  62  127:invokevirtual   #800 <Method String UUID.toString()>
	//*  63  130:invokespecial   #801 <Method void SchedulerConstraint(String)>
	//*  64  133:astore          13
	//*  65  135:aload           13
	//*  66  137:iload           6
	//*  67  139:invokevirtual   #804 <Method void SchedulerConstraint.setNetworkStatus(int)>
	//*  68  142:aload           13
	//*  69  144:lload           7
	//*  70  146:invokevirtual   #807 <Method void SchedulerConstraint.setDelayInMs(long)>
	//*  71  149:aload           13
	//*  72  151:aload_1         
	//*  73  152:invokevirtual   #810 <Method void SchedulerConstraint.setOverrideDeadlineInMs(Long)>
	//*  74  155:aload_0         
	//*  75  156:getfield        #112 <Field Scheduler scheduler>
	//*  76  159:aload           13
	//*  77  161:invokevirtual   #733 <Method void Scheduler.request(SchedulerConstraint)>
	//*  78  164:aload_0         
	//*  79  165:iconst_1        
	//*  80  166:putfield        #68  <Field boolean shouldCancelAllScheduledWhenEmpty>
	//*  81  169:return          
				l1 = 0L;
	//   82  170:lconst_0        
	//   83  171:lstore          7
			if(l3 != 0xffffffffL)
				jobholder = ((JobHolder) (Long.valueOf(TimeUnit.NANOSECONDS.toMillis(l3 - l))));
			else
	//*  84  173:goto            45
				jobholder = null;
	//   85  176:aconst_null     
	//   86  177:astore_1        
			if(l2 > l && l1 >= 30000L)
				flag = true;
			else
	//*  87  178:goto            68
				flag = false;
	//   88  181:iconst_0        
	//   89  182:istore          4
			if(jobholder != null && ((Long) (jobholder)).longValue() >= 30000L)
				flag1 = true;
			else
	//*  90  184:goto            87
				flag1 = false;
	//   91  187:iconst_0        
	//   92  188:istore          5
			if(i != 0 || flag || flag1)
			{
				SchedulerConstraint schedulerconstraint = new SchedulerConstraint(UUID.randomUUID().toString());
				schedulerconstraint.setNetworkStatus(i);
				schedulerconstraint.setDelayInMs(l1);
				schedulerconstraint.setOverrideDeadlineInMs(((Long) (jobholder)));
				scheduler.request(schedulerconstraint);
				shouldCancelAllScheduledWhenEmpty = true;
				return;
			}
		}
	//*  93  190:goto            105
	}

	void addCallback(JobManagerCallback jobmanagercallback)
	{
		callbackManager.addCallback(jobmanagercallback);
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field CallbackManager callbackManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #814 <Method void CallbackManager.addCallback(JobManagerCallback)>
	//    4    8:return          
	}

	boolean canListenToNetwork()
	{
		return networkUtil instanceof NetworkEventProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field NetworkUtil networkUtil>
	//    2    4:instanceof      #152 <Class NetworkEventProvider>
	//    3    7:ireturn         
	}

	int count()
	{
		return persistentJobQueue.count() + nonPersistentJobQueue.count();
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field JobQueue persistentJobQueue>
	//    2    4:invokeinterface #816 <Method int JobQueue.count()>
	//    3    9:aload_0         
	//    4   10:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//    5   13:invokeinterface #816 <Method int JobQueue.count()>
	//    6   18:iadd            
	//    7   19:ireturn         
	}

	int countRemainingReadyJobs()
	{
		return countReadyJobs(getNetworkStatus());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #365 <Method int getNetworkStatus()>
	//    3    5:invokespecial   #624 <Method int countReadyJobs(int)>
	//    4    8:ireturn         
	}

	JobHolder getNextJob(Collection collection)
	{
		return getNextJob(collection, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #822 <Method JobHolder getNextJob(Collection, boolean)>
	//    4    6:areturn         
	}

	JobHolder getNextJob(Collection collection, boolean flag)
	{
		if(running || flag) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean running>
	//    2    4:ifne            17
	//    3    7:iload_2         
	//    4    8:ifne            17
_L1:
		JobHolder jobholder1 = null;
	//    5   11:aconst_null     
	//    6   12:astore          8
_L4:
		return jobholder1;
	//    7   14:aload           8
	//    8   16:areturn         
_L2:
		JobHolder jobholder = null;
	//    9   17:aconst_null     
	//   10   18:astore          7
		do
		{
			jobholder1 = jobholder;
	//   11   20:aload           7
	//   12   22:astore          8
			if(jobholder != null)
				continue;
	//   13   24:aload           7
	//   14   26:ifnonnull       14
			int i = getNetworkStatus();
	//   15   29:aload_0         
	//   16   30:invokespecial   #365 <Method int getNetworkStatus()>
	//   17   33:istore          4
			boolean flag1 = false;
	//   18   35:iconst_0        
	//   19   36:istore_3        
			JqLog.v("looking for next job", new Object[0]);
	//   20   37:ldc2            #826 <String "looking for next job">
	//   21   40:iconst_0        
	//   22   41:anewarray       Object[]
	//   23   44:invokestatic    #829 <Method void JqLog.v(String, Object[])>
			queryConstraint.clear();
	//   24   47:aload_0         
	//   25   48:getfield        #64  <Field Constraint queryConstraint>
	//   26   51:invokevirtual   #267 <Method void Constraint.clear()>
			long l = timer.nanoTime();
	//   27   54:aload_0         
	//   28   55:getfield        #92  <Field Timer timer>
	//   29   58:invokeinterface #104 <Method long Timer.nanoTime()>
	//   30   63:lstore          5
			queryConstraint.setNowInNs(l);
	//   31   65:aload_0         
	//   32   66:getfield        #64  <Field Constraint queryConstraint>
	//   33   69:lload           5
	//   34   71:invokevirtual   #271 <Method void Constraint.setNowInNs(long)>
			queryConstraint.setMaxNetworkType(i);
	//   35   74:aload_0         
	//   36   75:getfield        #64  <Field Constraint queryConstraint>
	//   37   78:iload           4
	//   38   80:invokevirtual   #274 <Method void Constraint.setMaxNetworkType(int)>
			queryConstraint.setExcludeGroups(collection);
	//   39   83:aload_0         
	//   40   84:getfield        #64  <Field Constraint queryConstraint>
	//   41   87:aload_1         
	//   42   88:invokevirtual   #278 <Method void Constraint.setExcludeGroups(Collection)>
			queryConstraint.setExcludeRunning(true);
	//   43   91:aload_0         
	//   44   92:getfield        #64  <Field Constraint queryConstraint>
	//   45   95:iconst_1        
	//   46   96:invokevirtual   #282 <Method void Constraint.setExcludeRunning(boolean)>
			queryConstraint.setTimeLimit(Long.valueOf(l));
	//   47   99:aload_0         
	//   48  100:getfield        #64  <Field Constraint queryConstraint>
	//   49  103:lload           5
	//   50  105:invokestatic    #288 <Method Long Long.valueOf(long)>
	//   51  108:invokevirtual   #292 <Method void Constraint.setTimeLimit(Long)>
			jobholder = nonPersistentJobQueue.nextJobAndIncRunCount(queryConstraint);
	//   52  111:aload_0         
	//   53  112:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//   54  115:aload_0         
	//   55  116:getfield        #64  <Field Constraint queryConstraint>
	//   56  119:invokeinterface #833 <Method JobHolder JobQueue.nextJobAndIncRunCount(Constraint)>
	//   57  124:astore          7
			JqLog.v("non persistent result %s", new Object[] {
				jobholder
			});
	//   58  126:ldc2            #835 <String "non persistent result %s">
	//   59  129:iconst_1        
	//   60  130:anewarray       Object[]
	//   61  133:dup             
	//   62  134:iconst_0        
	//   63  135:aload           7
	//   64  137:aastore         
	//   65  138:invokestatic    #829 <Method void JqLog.v(String, Object[])>
			jobholder1 = jobholder;
	//   66  141:aload           7
	//   67  143:astore          8
			if(jobholder == null)
	//*  68  145:aload           7
	//*  69  147:ifnonnull       182
			{
				jobholder1 = persistentJobQueue.nextJobAndIncRunCount(queryConstraint);
	//   70  150:aload_0         
	//   71  151:getfield        #133 <Field JobQueue persistentJobQueue>
	//   72  154:aload_0         
	//   73  155:getfield        #64  <Field Constraint queryConstraint>
	//   74  158:invokeinterface #833 <Method JobHolder JobQueue.nextJobAndIncRunCount(Constraint)>
	//   75  163:astore          8
				flag1 = true;
	//   76  165:iconst_1        
	//   77  166:istore_3        
				JqLog.v("persistent result %s", new Object[] {
					jobholder1
				});
	//   78  167:ldc2            #837 <String "persistent result %s">
	//   79  170:iconst_1        
	//   80  171:anewarray       Object[]
	//   81  174:dup             
	//   82  175:iconst_0        
	//   83  176:aload           8
	//   84  178:aastore         
	//   85  179:invokestatic    #829 <Method void JqLog.v(String, Object[])>
			}
			if(jobholder1 == null)
	//*  86  182:aload           8
	//*  87  184:ifnonnull       189
				return null;
	//   88  187:aconst_null     
	//   89  188:areturn         
			if(flag1 && dependencyInjector != null)
	//*  90  189:iload_3         
	//*  91  190:ifeq            214
	//*  92  193:aload_0         
	//*  93  194:getfield        #150 <Field DependencyInjector dependencyInjector>
	//*  94  197:ifnull          214
				dependencyInjector.inject(jobholder1.getJob());
	//   95  200:aload_0         
	//   96  201:getfield        #150 <Field DependencyInjector dependencyInjector>
	//   97  204:aload           8
	//   98  206:invokevirtual   #235 <Method Job JobHolder.getJob()>
	//   99  209:invokeinterface #508 <Method void DependencyInjector.inject(Job)>
			jobholder1.setApplicationContext(appContext);
	//  100  214:aload           8
	//  101  216:aload_0         
	//  102  217:getfield        #98  <Field Context appContext>
	//  103  220:invokevirtual   #512 <Method void JobHolder.setApplicationContext(Context)>
			if(jobholder1.getDeadlineNs() <= l)
	//* 104  223:aload           8
	//* 105  225:invokevirtual   #781 <Method long JobHolder.getDeadlineNs()>
	//* 106  228:lload           5
	//* 107  230:lcmp            
	//* 108  231:ifgt            289
				flag = true;
	//  109  234:iconst_1        
	//  110  235:istore_2        
			else
	//* 111  236:aload           8
	//* 112  238:iload_2         
	//* 113  239:invokevirtual   #840 <Method void JobHolder.setDeadlineIsReached(boolean)>
	//* 114  242:aload           8
	//* 115  244:astore          7
	//* 116  246:aload           8
	//* 117  248:invokevirtual   #781 <Method long JobHolder.getDeadlineNs()>
	//* 118  251:lload           5
	//* 119  253:lcmp            
	//* 120  254:ifgt            20
	//* 121  257:aload           8
	//* 122  259:astore          7
	//* 123  261:aload           8
	//* 124  263:invokevirtual   #841 <Method boolean JobHolder.shouldCancelOnDeadline()>
	//* 125  266:ifeq            20
	//* 126  269:aload_0         
	//* 127  270:aload           8
	//* 128  272:bipush          7
	//* 129  274:invokespecial   #535 <Method void cancelSafely(JobHolder, int)>
	//* 130  277:aload_0         
	//* 131  278:aload           8
	//* 132  280:invokespecial   #664 <Method void removeJob(JobHolder)>
	//* 133  283:aconst_null     
	//* 134  284:astore          7
	//* 135  286:goto            20
				flag = false;
	//  136  289:iconst_0        
	//  137  290:istore_2        
			jobholder1.setDeadlineIsReached(flag);
			jobholder = jobholder1;
			if(jobholder1.getDeadlineNs() <= l)
			{
				jobholder = jobholder1;
				if(jobholder1.shouldCancelOnDeadline())
				{
					cancelSafely(jobholder1, 7);
					removeJob(jobholder1);
					jobholder = null;
				}
			}
		} while(true);
	//  138  291:goto            236
		if(true) goto _L4; else goto _L3
_L3:
	}

	JobHolder getNextJobForTesting()
	{
		return getNextJobForTesting(((Collection) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #845 <Method JobHolder getNextJobForTesting(Collection)>
	//    3    5:areturn         
	}

	JobHolder getNextJobForTesting(Collection collection)
	{
		return getNextJob(collection, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #822 <Method JobHolder getNextJob(Collection, boolean)>
	//    4    6:areturn         
	}

	Long getNextWakeUpNs(boolean flag)
	{
		Long long1 = consumerManager.runningJobGroups.getNextDelayForGroups();
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field ConsumerManager consumerManager>
	//    2    4:getfield        #260 <Field RunningJobSet ConsumerManager.runningJobGroups>
	//    3    7:invokevirtual   #850 <Method Long RunningJobSet.getNextDelayForGroups()>
	//    4   10:astore          6
		int i = getNetworkStatus();
	//    5   12:aload_0         
	//    6   13:invokespecial   #365 <Method int getNetworkStatus()>
	//    7   16:istore_2        
		Object obj = ((Object) (consumerManager.runningJobGroups.getSafe()));
	//    8   17:aload_0         
	//    9   18:getfield        #163 <Field ConsumerManager consumerManager>
	//   10   21:getfield        #260 <Field RunningJobSet ConsumerManager.runningJobGroups>
	//   11   24:invokevirtual   #266 <Method Collection RunningJobSet.getSafe()>
	//   12   27:astore          5
		queryConstraint.clear();
	//   13   29:aload_0         
	//   14   30:getfield        #64  <Field Constraint queryConstraint>
	//   15   33:invokevirtual   #267 <Method void Constraint.clear()>
		queryConstraint.setNowInNs(timer.nanoTime());
	//   16   36:aload_0         
	//   17   37:getfield        #64  <Field Constraint queryConstraint>
	//   18   40:aload_0         
	//   19   41:getfield        #92  <Field Timer timer>
	//   20   44:invokeinterface #104 <Method long Timer.nanoTime()>
	//   21   49:invokevirtual   #271 <Method void Constraint.setNowInNs(long)>
		queryConstraint.setMaxNetworkType(i);
	//   22   52:aload_0         
	//   23   53:getfield        #64  <Field Constraint queryConstraint>
	//   24   56:iload_2         
	//   25   57:invokevirtual   #274 <Method void Constraint.setMaxNetworkType(int)>
		queryConstraint.setExcludeGroups(((Collection) (obj)));
	//   26   60:aload_0         
	//   27   61:getfield        #64  <Field Constraint queryConstraint>
	//   28   64:aload           5
	//   29   66:invokevirtual   #278 <Method void Constraint.setExcludeGroups(Collection)>
		queryConstraint.setExcludeRunning(true);
	//   30   69:aload_0         
	//   31   70:getfield        #64  <Field Constraint queryConstraint>
	//   32   73:iconst_1        
	//   33   74:invokevirtual   #282 <Method void Constraint.setExcludeRunning(boolean)>
		Long long3 = nonPersistentJobQueue.getNextJobDelayUntilNs(queryConstraint);
	//   34   77:aload_0         
	//   35   78:getfield        #138 <Field JobQueue nonPersistentJobQueue>
	//   36   81:aload_0         
	//   37   82:getfield        #64  <Field Constraint queryConstraint>
	//   38   85:invokeinterface #854 <Method Long JobQueue.getNextJobDelayUntilNs(Constraint)>
	//   39   90:astore          8
		Long long2 = persistentJobQueue.getNextJobDelayUntilNs(queryConstraint);
	//   40   92:aload_0         
	//   41   93:getfield        #133 <Field JobQueue persistentJobQueue>
	//   42   96:aload_0         
	//   43   97:getfield        #64  <Field Constraint queryConstraint>
	//   44  100:invokeinterface #854 <Method Long JobQueue.getNextJobDelayUntilNs(Constraint)>
	//   45  105:astore          7
		obj = null;
	//   46  107:aconst_null     
	//   47  108:astore          5
		if(long1 != null)
	//*  48  110:aload           6
	//*  49  112:ifnull          119
			obj = ((Object) (long1));
	//   50  115:aload           6
	//   51  117:astore          5
		long1 = ((Long) (obj));
	//   52  119:aload           5
	//   53  121:astore          6
		long l;
		if(long3 != null)
	//*  54  123:aload           8
	//*  55  125:ifnull          145
		{
			if(obj == null)
	//*  56  128:aload           5
	//*  57  130:ifnonnull       221
				l = long3.longValue();
	//   58  133:aload           8
	//   59  135:invokevirtual   #759 <Method long Long.longValue()>
	//   60  138:lstore_3        
			else
	//*  61  139:lload_3         
	//*  62  140:invokestatic    #288 <Method Long Long.valueOf(long)>
	//*  63  143:astore          6
	//*  64  145:aload           6
	//*  65  147:astore          5
	//*  66  149:aload           7
	//*  67  151:ifnull          171
	//*  68  154:aload           6
	//*  69  156:ifnonnull       238
	//*  70  159:aload           7
	//*  71  161:invokevirtual   #759 <Method long Long.longValue()>
	//*  72  164:lstore_3        
	//*  73  165:lload_3         
	//*  74  166:invokestatic    #288 <Method Long Long.valueOf(long)>
	//*  75  169:astore          5
	//*  76  171:aload           5
	//*  77  173:astore          6
	//*  78  175:iload_1         
	//*  79  176:ifeq            218
	//*  80  179:aload           5
	//*  81  181:astore          6
	//*  82  183:aload_0         
	//*  83  184:getfield        #144 <Field NetworkUtil networkUtil>
	//*  84  187:instanceof      #152 <Class NetworkEventProvider>
	//*  85  190:ifne            218
	//*  86  193:aload_0         
	//*  87  194:getfield        #92  <Field Timer timer>
	//*  88  197:invokeinterface #104 <Method long Timer.nanoTime()>
	//*  89  202:getstatic       #859 <Field long JobManager.NETWORK_CHECK_INTERVAL>
	//*  90  205:ladd            
	//*  91  206:lstore_3        
	//*  92  207:aload           5
	//*  93  209:ifnonnull       255
	//*  94  212:lload_3         
	//*  95  213:invokestatic    #288 <Method Long Long.valueOf(long)>
	//*  96  216:astore          6
	//*  97  218:aload           6
	//*  98  220:areturn         
				l = Math.min(long3.longValue(), ((Long) (obj)).longValue());
	//   99  221:aload           8
	//  100  223:invokevirtual   #759 <Method long Long.longValue()>
	//  101  226:aload           5
	//  102  228:invokevirtual   #759 <Method long Long.longValue()>
	//  103  231:invokestatic    #865 <Method long Math.min(long, long)>
	//  104  234:lstore_3        
			long1 = Long.valueOf(l);
		}
		obj = ((Object) (long1));
		if(long2 != null)
		{
			if(long1 == null)
				l = long2.longValue();
			else
	//* 105  235:goto            139
				l = Math.min(long2.longValue(), long1.longValue());
	//  106  238:aload           7
	//  107  240:invokevirtual   #759 <Method long Long.longValue()>
	//  108  243:aload           6
	//  109  245:invokevirtual   #759 <Method long Long.longValue()>
	//  110  248:invokestatic    #865 <Method long Math.min(long, long)>
	//  111  251:lstore_3        
			obj = ((Object) (Long.valueOf(l)));
		}
		long1 = ((Long) (obj));
		if(flag)
		{
			long1 = ((Long) (obj));
			if(!(networkUtil instanceof NetworkEventProvider))
			{
				l = timer.nanoTime() + JobManager.NETWORK_CHECK_INTERVAL;
				if(obj != null)
	//* 112  252:goto            165
					l = Math.min(l, ((Long) (obj)).longValue());
	//  113  255:lload_3         
	//  114  256:aload           5
	//  115  258:invokevirtual   #759 <Method long Long.longValue()>
	//  116  261:invokestatic    #865 <Method long Math.min(long, long)>
	//  117  264:lstore_3        
				long1 = Long.valueOf(l);
			}
		}
		return long1;
	//* 118  265:goto            212
	}

	boolean isRunning()
	{
		return running;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean running>
	//    2    4:ireturn         
	}

	public void onNetworkChange(int i)
	{
		ConstraintChangeMessage constraintchangemessage = (ConstraintChangeMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/ConstraintChangeMessage);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field MessageFactory messageFactory>
	//    2    4:ldc2            #868 <Class ConstraintChangeMessage>
	//    3    7:invokevirtual   #874 <Method Message MessageFactory.obtain(Class)>
	//    4   10:checkcast       #868 <Class ConstraintChangeMessage>
	//    5   13:astore_2        
		messageQueue.post(((Message) (constraintchangemessage)));
	//    6   14:aload_0         
	//    7   15:getfield        #72  <Field PriorityMessageQueue messageQueue>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #878 <Method void PriorityMessageQueue.post(Message)>
	//   10   22:return          
	}

	boolean removeCallback(JobManagerCallback jobmanagercallback)
	{
		return callbackManager.removeCallback(jobmanagercallback);
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field CallbackManager callbackManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #882 <Method boolean CallbackManager.removeCallback(JobManagerCallback)>
	//    4    8:ireturn         
	}

	public void run()
	{
		messageQueue.consume(((MessageQueueConsumer) (new MessageQueueConsumer() {

			public void handleMessage(Message message)
			{
				boolean flag1;
				flag1 = true;
			//    0    0:iconst_1        
			//    1    1:istore_3        
				canScheduleConstraintChangeOnIdle = true;
			//    2    2:aload_0         
			//    3    3:getfield        #15  <Field JobManagerThread this$0>
			//    4    6:iconst_1        
			//    5    7:invokestatic    #24  <Method boolean JobManagerThread.access$002(JobManagerThread, boolean)>
			//    6   10:pop             
				static class _cls2
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
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.ADD_JOB.ordinal()] = 1;
					//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//    5   12:getstatic       #24  <Field Type Type.ADD_JOB>
					//    6   15:invokevirtual   #28  <Method int Type.ordinal()>
					//    7   18:iconst_1        
					//    8   19:iastore         
						}
					//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//*  10   23:getstatic       #31  <Field Type Type.JOB_CONSUMER_IDLE>
					//*  11   26:invokevirtual   #28  <Method int Type.ordinal()>
					//*  12   29:iconst_2        
					//*  13   30:iastore         
					//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//*  15   34:getstatic       #34  <Field Type Type.RUN_JOB_RESULT>
					//*  16   37:invokevirtual   #28  <Method int Type.ordinal()>
					//*  17   40:iconst_3        
					//*  18   41:iastore         
					//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//*  20   45:getstatic       #37  <Field Type Type.CONSTRAINT_CHANGE>
					//*  21   48:invokevirtual   #28  <Method int Type.ordinal()>
					//*  22   51:iconst_4        
					//*  23   52:iastore         
					//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//*  25   56:getstatic       #40  <Field Type Type.CANCEL>
					//*  26   59:invokevirtual   #28  <Method int Type.ordinal()>
					//*  27   62:iconst_5        
					//*  28   63:iastore         
					//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//*  30   67:getstatic       #43  <Field Type Type.PUBLIC_QUERY>
					//*  31   70:invokevirtual   #28  <Method int Type.ordinal()>
					//*  32   73:bipush          6
					//*  33   75:iastore         
					//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//*  35   79:getstatic       #46  <Field Type Type.COMMAND>
					//*  36   82:invokevirtual   #28  <Method int Type.ordinal()>
					//*  37   85:bipush          7
					//*  38   87:iastore         
					//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$birbit$android$jobqueue$messaging$Type>
					//*  40   91:getstatic       #49  <Field Type Type.SCHEDULER>
					//*  41   94:invokevirtual   #28  <Method int Type.ordinal()>
					//*  42   97:bipush          8
					//*  43   99:iastore         
					//*  44  100:return          
					//*  45  101:astore_0        
					//*  46  102:return          
					//*  47  103:astore_0        
					//*  48  104:goto            88
					//*  49  107:astore_0        
					//*  50  108:goto            76
					//*  51  111:astore_0        
					//*  52  112:goto            64
					//*  53  115:astore_0        
					//*  54  116:goto            53
					//*  55  119:astore_0        
					//*  56  120:goto            42
					//*  57  123:astore_0        
					//*  58  124:goto            31
						catch(NoSuchFieldError nosuchfielderror7) { }
					//   59  127:astore_0        
						try
						{
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.JOB_CONSUMER_IDLE.ordinal()] = 2;
						}
						catch(NoSuchFieldError nosuchfielderror6) { }
						try
						{
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.RUN_JOB_RESULT.ordinal()] = 3;
						}
						catch(NoSuchFieldError nosuchfielderror5) { }
						try
						{
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.CONSTRAINT_CHANGE.ordinal()] = 4;
						}
						catch(NoSuchFieldError nosuchfielderror4) { }
						try
						{
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.CANCEL.ordinal()] = 5;
						}
						catch(NoSuchFieldError nosuchfielderror3) { }
						try
						{
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.PUBLIC_QUERY.ordinal()] = 6;
						}
						catch(NoSuchFieldError nosuchfielderror2) { }
						try
						{
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.COMMAND.ordinal()] = 7;
						}
						catch(NoSuchFieldError nosuchfielderror1) { }
						try
						{
							$SwitchMap$com$birbit$android$jobqueue$messaging$Type[Type.SCHEDULER.ordinal()] = 8;
						}
						catch(NoSuchFieldError nosuchfielderror)
						{
							return;
						}
					//*  60  128:goto            20
					}
				}

				_cls2..SwitchMap.com.birbit.android.jobqueue.messaging.Type[message.type.ordinal()];
			//    7   11:getstatic       #30  <Field int[] JobManagerThread$2.$SwitchMap$com$birbit$android$jobqueue$messaging$Type>
			//    8   14:aload_1         
			//    9   15:getfield        #36  <Field Type Message.type>
			//   10   18:invokevirtual   #42  <Method int Type.ordinal()>
			//   11   21:iaload          
				JVM INSTR tableswitch 1 8: default 68
			//			               1 69
			//			               2 81
			//			               3 106
			//			               4 118
			//			               5 170
			//			               6 182
			//			               7 194
			//			               8 206;
			//   12   22:tableswitch     1 8: default 68
			//			               1 69
			//			               2 81
			//			               3 106
			//			               4 118
			//			               5 170
			//			               6 182
			//			               7 194
			//			               8 206
				   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
				return;
			//   13   68:return          
_L2:
				handleAddJob((AddJobMessage)message);
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
					invokeSchedulersIfIdle();
			//   27   98:aload_0         
			//   28   99:getfield        #15  <Field JobManagerThread this$0>
			//   29  102:invokestatic    #63  <Method void JobManagerThread.access$200(JobManagerThread)>
					return;
			//   30  105:return          
				}
				  goto _L1
_L4:
				handleRunJobResult((RunJobResultMessage)message);
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
				jobmanagerthread.canScheduleConstraintChangeOnIdle = flag;
				return;
			//*  64  167:goto            157
_L6:
				handleCancel((CancelMessage)message);
			//   65  170:aload_0         
			//   66  171:getfield        #15  <Field JobManagerThread this$0>
			//   67  174:aload_1         
			//   68  175:checkcast       #80  <Class CancelMessage>
			//   69  178:invokestatic    #84  <Method void JobManagerThread.access$400(JobManagerThread, CancelMessage)>
				return;
			//   70  181:return          
_L7:
				handlePublicQuery((PublicQueryMessage)message);
			//   71  182:aload_0         
			//   72  183:getfield        #15  <Field JobManagerThread this$0>
			//   73  186:aload_1         
			//   74  187:checkcast       #86  <Class PublicQueryMessage>
			//   75  190:invokestatic    #90  <Method void JobManagerThread.access$500(JobManagerThread, PublicQueryMessage)>
				return;
			//   76  193:return          
_L8:
				handleCommand((CommandMessage)message);
			//   77  194:aload_0         
			//   78  195:getfield        #15  <Field JobManagerThread this$0>
			//   79  198:aload_1         
			//   80  199:checkcast       #92  <Class CommandMessage>
			//   81  202:invokestatic    #96  <Method void JobManagerThread.access$600(JobManagerThread, CommandMessage)>
				return;
			//   82  205:return          
_L9:
				handleSchedulerMessage((SchedulerMessage)message);
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
					Boolean.valueOf(running)
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
				if(running)
			//*  11   22:aload_0         
			//*  12   23:getfield        #15  <Field JobManagerThread this$0>
			//*  13   26:invokestatic    #111 <Method boolean JobManagerThread.access$800(JobManagerThread)>
			//*  14   29:ifne            33
			//*  15   32:return          
				{
					if(!canScheduleConstraintChangeOnIdle)
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
						ConstraintChangeMessage constraintchangemessage = (ConstraintChangeMessage)messageFactory.obtain(com/birbit/android/jobqueue/messaging/message/ConstraintChangeMessage);
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
					if(scheduler != null && shouldCancelAllScheduledWhenEmpty && persistentJobQueue.count() == 0)
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
						shouldCancelAllScheduledWhenEmpty = false;
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
)));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field PriorityMessageQueue messageQueue>
	//    2    4:new             #10  <Class JobManagerThread$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #885 <Method void JobManagerThread$1(JobManagerThread)>
	//    6   12:invokevirtual   #889 <Method void PriorityMessageQueue.consume(MessageQueueConsumer)>
	//    7   15:return          
	}

	public static final long NOT_DELAYED_JOB_DELAY = 0x0L;
	public static final long NOT_RUNNING_SESSION_ID = 0x0L;
	public static final long NS_PER_MS = 0xf4240L;
	private final Context appContext;
	final CallbackManager callbackManager;
	private boolean canScheduleConstraintChangeOnIdle;
	final ConsumerManager consumerManager;
	private final DependencyInjector dependencyInjector;
	private final MessageFactory messageFactory;
	final PriorityMessageQueue messageQueue;
	private final NetworkUtil networkUtil;
	final JobQueue nonPersistentJobQueue;
	private List pendingCancelHandlers;
	private List pendingSchedulerCallbacks;
	final JobQueue persistentJobQueue;
	final Constraint queryConstraint = new Constraint();
	private boolean running;
	Scheduler scheduler;
	private final long sessionId;
	private boolean shouldCancelAllScheduledWhenEmpty;
	final Timer timer;


/*
	static boolean access$000(JobManagerThread jobmanagerthread)
	{
		return jobmanagerthread.canScheduleConstraintChangeOnIdle;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean canScheduleConstraintChangeOnIdle>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(JobManagerThread jobmanagerthread, boolean flag)
	{
		jobmanagerthread.canScheduleConstraintChangeOnIdle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field boolean canScheduleConstraintChangeOnIdle>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$100(JobManagerThread jobmanagerthread, AddJobMessage addjobmessage)
	{
		jobmanagerthread.handleAddJob(addjobmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method void handleAddJob(AddJobMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$1000(JobManagerThread jobmanagerthread)
	{
		return jobmanagerthread.shouldCancelAllScheduledWhenEmpty;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean shouldCancelAllScheduledWhenEmpty>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1002(JobManagerThread jobmanagerthread, boolean flag)
	{
		jobmanagerthread.shouldCancelAllScheduledWhenEmpty = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field boolean shouldCancelAllScheduledWhenEmpty>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$200(JobManagerThread jobmanagerthread)
	{
		jobmanagerthread.invokeSchedulersIfIdle();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method void invokeSchedulersIfIdle()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(JobManagerThread jobmanagerthread, RunJobResultMessage runjobresultmessage)
	{
		jobmanagerthread.handleRunJobResult(runjobresultmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #194 <Method void handleRunJobResult(RunJobResultMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$400(JobManagerThread jobmanagerthread, CancelMessage cancelmessage)
	{
		jobmanagerthread.handleCancel(cancelmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #200 <Method void handleCancel(CancelMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$500(JobManagerThread jobmanagerthread, PublicQueryMessage publicquerymessage)
	{
		jobmanagerthread.handlePublicQuery(publicquerymessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #206 <Method void handlePublicQuery(PublicQueryMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(JobManagerThread jobmanagerthread, CommandMessage commandmessage)
	{
		jobmanagerthread.handleCommand(commandmessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #212 <Method void handleCommand(CommandMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(JobManagerThread jobmanagerthread, SchedulerMessage schedulermessage)
	{
		jobmanagerthread.handleSchedulerMessage(schedulermessage);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #218 <Method void handleSchedulerMessage(SchedulerMessage)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$800(JobManagerThread jobmanagerthread)
	{
		return jobmanagerthread.running;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean running>
	//    2    4:ireturn         
	}

*/


/*
	static MessageFactory access$900(JobManagerThread jobmanagerthread)
	{
		return jobmanagerthread.messageFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field MessageFactory messageFactory>
	//    2    4:areturn         
	}

*/
}
