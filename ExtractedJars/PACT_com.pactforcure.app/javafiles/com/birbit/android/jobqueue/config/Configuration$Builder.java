// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.config;

import android.content.Context;
import com.birbit.android.jobqueue.DefaultQueueFactory;
import com.birbit.android.jobqueue.QueueFactory;
import com.birbit.android.jobqueue.di.DependencyInjector;
import com.birbit.android.jobqueue.log.CustomLogger;
import com.birbit.android.jobqueue.network.NetworkUtil;
import com.birbit.android.jobqueue.network.NetworkUtilImpl;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.timer.SystemTimer;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.birbit.android.jobqueue.config:
//			Configuration

public static final class Configuration$Builder
{

	public Configuration build()
	{
		if(configuration.queueFactory == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Configuration configuration>
	//*   2    4:getfield        #50  <Field QueueFactory Configuration.queueFactory>
	//*   3    7:ifnonnull       24
			configuration.queueFactory = ((QueueFactory) (new DefaultQueueFactory()));
	//    4   10:aload_0         
	//    5   11:getfield        #32  <Field Configuration configuration>
	//    6   14:new             #52  <Class DefaultQueueFactory>
	//    7   17:dup             
	//    8   18:invokespecial   #53  <Method void DefaultQueueFactory()>
	//    9   21:putfield        #50  <Field QueueFactory Configuration.queueFactory>
		if(configuration.networkUtil == null)
	//*  10   24:aload_0         
	//*  11   25:getfield        #32  <Field Configuration configuration>
	//*  12   28:getfield        #57  <Field NetworkUtil Configuration.networkUtil>
	//*  13   31:ifnonnull       55
			configuration.networkUtil = ((NetworkUtil) (new NetworkUtilImpl(configuration.appContext)));
	//   14   34:aload_0         
	//   15   35:getfield        #32  <Field Configuration configuration>
	//   16   38:new             #59  <Class NetworkUtilImpl>
	//   17   41:dup             
	//   18   42:aload_0         
	//   19   43:getfield        #32  <Field Configuration configuration>
	//   20   46:getfield        #42  <Field Context Configuration.appContext>
	//   21   49:invokespecial   #61  <Method void NetworkUtilImpl(Context)>
	//   22   52:putfield        #57  <Field NetworkUtil Configuration.networkUtil>
		if(configuration.timer == null)
	//*  23   55:aload_0         
	//*  24   56:getfield        #32  <Field Configuration configuration>
	//*  25   59:getfield        #65  <Field Timer Configuration.timer>
	//*  26   62:ifnonnull       79
			configuration.timer = ((Timer) (new SystemTimer()));
	//   27   65:aload_0         
	//   28   66:getfield        #32  <Field Configuration configuration>
	//   29   69:new             #67  <Class SystemTimer>
	//   30   72:dup             
	//   31   73:invokespecial   #68  <Method void SystemTimer()>
	//   32   76:putfield        #65  <Field Timer Configuration.timer>
		return configuration;
	//   33   79:aload_0         
	//   34   80:getfield        #32  <Field Configuration configuration>
	//   35   83:areturn         
	}

	public Configuration$Builder consumerKeepAlive(int i)
	{
		configuration.consumerKeepAlive = i;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:iload_1         
	//    3    5:putfield        #74  <Field int Configuration.consumerKeepAlive>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder consumerThreadPriority(int i)
	{
		configuration.threadPriority = i;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:iload_1         
	//    3    5:putfield        #78  <Field int Configuration.threadPriority>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder customLogger(CustomLogger customlogger)
	{
		configuration.customLogger = customlogger;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:aload_1         
	//    3    5:putfield        #84  <Field CustomLogger Configuration.customLogger>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder id(String s)
	{
		if(s == null || !idRegex.matcher(((CharSequence) (s))).matches())
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_0         
	//*   3    5:getfield        #27  <Field Pattern idRegex>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #90  <Method Matcher Pattern.matcher(CharSequence)>
	//*   6   12:invokevirtual   #96  <Method boolean Matcher.matches()>
	//*   7   15:ifne            28
		{
			throw new IllegalArgumentException("id cannot be null or empty and can only include alphanumeric characters, - or _ .");
	//    8   18:new             #98  <Class IllegalArgumentException>
	//    9   21:dup             
	//   10   22:ldc1            #100 <String "id cannot be null or empty and can only include alphanumeric characters, - or _ .">
	//   11   24:invokespecial   #103 <Method void IllegalArgumentException(String)>
	//   12   27:athrow          
		} else
		{
			configuration.id = s;
	//   13   28:aload_0         
	//   14   29:getfield        #32  <Field Configuration configuration>
	//   15   32:aload_1         
	//   16   33:putfield        #106 <Field String Configuration.id>
			return this;
	//   17   36:aload_0         
	//   18   37:areturn         
		}
	}

	public Configuration$Builder inTestMode()
	{
		configuration.inTestMode = true;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:iconst_1        
	//    3    5:putfield        #111 <Field boolean Configuration.inTestMode>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder injector(DependencyInjector dependencyinjector)
	{
		configuration.dependencyInjector = dependencyinjector;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:aload_1         
	//    3    5:putfield        #117 <Field DependencyInjector Configuration.dependencyInjector>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder jobSerializer(com.birbit.android.jobqueue.persistentQueue.sqlite.alizer alizer)
	{
		configuration.queueFactory = ((QueueFactory) (new DefaultQueueFactory(alizer)));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:new             #52  <Class DefaultQueueFactory>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #122 <Method void DefaultQueueFactory(com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue$JobSerializer)>
	//    6   12:putfield        #50  <Field QueueFactory Configuration.queueFactory>
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public Configuration$Builder loadFactor(int i)
	{
		configuration.loadFactor = i;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:iload_1         
	//    3    5:putfield        #125 <Field int Configuration.loadFactor>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder maxConsumerCount(int i)
	{
		configuration.maxConsumerCount = i;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:iload_1         
	//    3    5:putfield        #128 <Field int Configuration.maxConsumerCount>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder minConsumerCount(int i)
	{
		configuration.minConsumerCount = i;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:iload_1         
	//    3    5:putfield        #131 <Field int Configuration.minConsumerCount>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder networkUtil(NetworkUtil networkutil)
	{
		configuration.networkUtil = networkutil;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:aload_1         
	//    3    5:putfield        #57  <Field NetworkUtil Configuration.networkUtil>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder queueFactory(QueueFactory queuefactory)
	{
		if(configuration.queueFactory != null && queuefactory != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Configuration configuration>
	//*   2    4:getfield        #50  <Field QueueFactory Configuration.queueFactory>
	//*   3    7:ifnull          24
	//*   4   10:aload_1         
	//*   5   11:ifnull          24
		{
			throw new RuntimeException("already set a queue factory. This might happen ifyou've provided a custom job serializer");
	//    6   14:new             #135 <Class RuntimeException>
	//    7   17:dup             
	//    8   18:ldc1            #137 <String "already set a queue factory. This might happen ifyou've provided a custom job serializer">
	//    9   20:invokespecial   #138 <Method void RuntimeException(String)>
	//   10   23:athrow          
		} else
		{
			configuration.queueFactory = queuefactory;
	//   11   24:aload_0         
	//   12   25:getfield        #32  <Field Configuration configuration>
	//   13   28:aload_1         
	//   14   29:putfield        #50  <Field QueueFactory Configuration.queueFactory>
			return this;
	//   15   32:aload_0         
	//   16   33:areturn         
		}
	}

	public Configuration$Builder resetDelaysOnRestart()
	{
		configuration.resetDelaysOnRestart = true;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:iconst_1        
	//    3    5:putfield        #141 <Field boolean Configuration.resetDelaysOnRestart>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder scheduler(Scheduler scheduler1)
	{
		return scheduler(scheduler1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #146 <Method Configuration$Builder scheduler(Scheduler, boolean)>
	//    4    6:areturn         
	}

	public Configuration$Builder scheduler(Scheduler scheduler1, boolean flag)
	{
		configuration.scheduler = scheduler1;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:aload_1         
	//    3    5:putfield        #149 <Field Scheduler Configuration.scheduler>
		configuration.batchSchedulerRequests = flag;
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field Configuration configuration>
	//    6   12:iload_2         
	//    7   13:putfield        #152 <Field boolean Configuration.batchSchedulerRequests>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public Configuration$Builder threadFactory(ThreadFactory threadfactory)
	{
		configuration.threadFactory = threadfactory;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:aload_1         
	//    3    5:putfield        #157 <Field ThreadFactory Configuration.threadFactory>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public Configuration$Builder timer(Timer timer1)
	{
		configuration.timer = timer1;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Configuration configuration>
	//    2    4:aload_1         
	//    3    5:putfield        #65  <Field Timer Configuration.timer>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private Configuration configuration;
	private Pattern idRegex;

	public Configuration$Builder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		idRegex = Pattern.compile("^([A-Za-z]|[0-9]|_|-)+$");
	//    2    4:aload_0         
	//    3    5:ldc1            #19  <String "^([A-Za-z]|[0-9]|_|-)+$">
	//    4    7:invokestatic    #25  <Method Pattern Pattern.compile(String)>
	//    5   10:putfield        #27  <Field Pattern idRegex>
		configuration = new Configuration(((Configuration._cls1) (null)));
	//    6   13:aload_0         
	//    7   14:new             #6   <Class Configuration>
	//    8   17:dup             
	//    9   18:aconst_null     
	//   10   19:invokespecial   #30  <Method void Configuration(Configuration$1)>
	//   11   22:putfield        #32  <Field Configuration configuration>
		configuration.appContext = context.getApplicationContext();
	//   12   25:aload_0         
	//   13   26:getfield        #32  <Field Configuration configuration>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//   16   33:putfield        #42  <Field Context Configuration.appContext>
	//   17   36:return          
	}
}
