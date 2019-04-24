// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManager, JobManagerThread, ConsumerManager

class JobManager$2
	implements Runnable
{

	public void run()
	{
		val$latch.countDown();
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

	JobManager$2()
	{
		this$0 = final_jobmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field JobManager this$0>
		val$latch = CountDownLatch.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CountDownLatch val$latch>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
