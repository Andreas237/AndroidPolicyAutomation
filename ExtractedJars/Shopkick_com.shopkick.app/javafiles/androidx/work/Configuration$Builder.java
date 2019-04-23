// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import java.util.concurrent.Executor;

// Referenced classes of package androidx.work:
//			Configuration, WorkerFactory

public static final class Configuration$Builder
{

	public Configuration build()
	{
		return new Configuration(this);
	//    0    0:new             #6   <Class Configuration>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method void Configuration(Configuration$Builder)>
	//    4    8:areturn         
	}

	public Configuration$Builder setExecutor(Executor executor)
	{
		mExecutor = executor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field Executor mExecutor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Configuration$Builder setJobSchedulerJobIdRange(int i, int j)
	{
		if(j - i >= 1000)
	//*   0    0:iload_2         
	//*   1    1:iload_1         
	//*   2    2:isub            
	//*   3    3:sipush          1000
	//*   4    6:icmplt          21
		{
			mMinJobSchedulerId = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #24  <Field int mMinJobSchedulerId>
			mMaxJobSchedulerId = j;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #27  <Field int mMaxJobSchedulerId>
			return this;
	//   11   19:aload_0         
	//   12   20:areturn         
		} else
		{
			throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
	//   13   21:new             #46  <Class IllegalArgumentException>
	//   14   24:dup             
	//   15   25:ldc1            #48  <String "WorkManager needs a range of at least 1000 job ids.">
	//   16   27:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   17   30:athrow          
		}
	}

	public Configuration$Builder setMaxSchedulerLimit(int i)
	{
		if(i >= 20)
	//*   0    0:iload_1         
	//*   1    1:bipush          20
	//*   2    3:icmplt          18
		{
			mMaxSchedulerLimit = Math.min(i, 50);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:bipush          50
	//    6   10:invokestatic    #59  <Method int Math.min(int, int)>
	//    7   13:putfield        #29  <Field int mMaxSchedulerLimit>
			return this;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
	//   10   18:new             #46  <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc1            #61  <String "WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.">
	//   13   24:invokespecial   #51  <Method void IllegalArgumentException(String)>
	//   14   27:athrow          
		}
	}

	public Configuration$Builder setMinimumLoggingLevel(int i)
	{
		mLoggingLevel = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int mLoggingLevel>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Configuration$Builder setWorkerFactory(WorkerFactory workerfactory)
	{
		mWorkerFactory = workerfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field WorkerFactory mWorkerFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	Executor mExecutor;
	int mLoggingLevel;
	int mMaxJobSchedulerId;
	int mMaxSchedulerLimit;
	int mMinJobSchedulerId;
	WorkerFactory mWorkerFactory;

	public Configuration$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mLoggingLevel = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #22  <Field int mLoggingLevel>
		mMinJobSchedulerId = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field int mMinJobSchedulerId>
		mMaxJobSchedulerId = 0x7fffffff;
	//    8   14:aload_0         
	//    9   15:ldc1            #25  <Int 0x7fffffff>
	//   10   17:putfield        #27  <Field int mMaxJobSchedulerId>
		mMaxSchedulerLimit = 20;
	//   11   20:aload_0         
	//   12   21:bipush          20
	//   13   23:putfield        #29  <Field int mMaxSchedulerLimit>
	//   14   26:return          
	}
}
