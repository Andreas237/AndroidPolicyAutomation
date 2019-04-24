// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.callback.JobManagerCallbackAdapter;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManager, Job

class JobManager$3 extends JobManagerCallbackAdapter
{

	public void onJobAdded(Job job)
	{
		if(val$uuid.equals(((Object) (job.getId()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field String val$uuid>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #35  <Method String Job.getId()>
	//*   4    8:invokevirtual   #41  <Method boolean String.equals(Object)>
	//*   5   11:ifeq            30
		{
			val$latch.countDown();
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field CountDownLatch val$latch>
	//    8   18:invokevirtual   #46  <Method void CountDownLatch.countDown()>
			removeCallback(((com.birbit.android.jobqueue.callback.JobManagerCallback) (this)));
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field JobManager this$0>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #50  <Method boolean JobManager.removeCallback(com.birbit.android.jobqueue.callback.JobManagerCallback)>
	//   13   29:pop             
		}
	//   14   30:return          
	}

	final JobManager this$0;
	final CountDownLatch val$latch;
	final String val$uuid;

	JobManager$3()
	{
		this$0 = final_jobmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field JobManager this$0>
		val$uuid = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$uuid>
		val$latch = CountDownLatch.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field CountDownLatch val$latch>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void JobManagerCallbackAdapter()>
	//   11   19:return          
	}
}
