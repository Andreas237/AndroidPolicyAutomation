// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.callback.JobManagerCallbackAdapter;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManager, Job, AsyncAddCallback

class JobManager$4 extends JobManagerCallbackAdapter
{

	public void onJobAdded(Job job)
	{
		if(!val$uuid.equals(((Object) (job.getId()))))
			break MISSING_BLOCK_LABEL_32;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String val$uuid>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method String Job.getId()>
	//    4    8:invokevirtual   #42  <Method boolean String.equals(Object)>
	//    5   11:ifeq            32
		val$callback.onAdded();
	//    6   14:aload_0         
	//    7   15:getfield        #23  <Field AsyncAddCallback val$callback>
	//    8   18:invokeinterface #47  <Method void AsyncAddCallback.onAdded()>
		removeCallback(((com.birbit.android.jobqueue.callback.JobManagerCallback) (this)));
	//    9   23:aload_0         
	//   10   24:getfield        #19  <Field JobManager this$0>
	//   11   27:aload_0         
	//   12   28:invokevirtual   #51  <Method boolean JobManager.removeCallback(com.birbit.android.jobqueue.callback.JobManagerCallback)>
	//   13   31:pop             
		return;
	//   14   32:return          
		job;
	//   15   33:astore_1        
		removeCallback(((com.birbit.android.jobqueue.callback.JobManagerCallback) (this)));
	//   16   34:aload_0         
	//   17   35:getfield        #19  <Field JobManager this$0>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #51  <Method boolean JobManager.removeCallback(com.birbit.android.jobqueue.callback.JobManagerCallback)>
	//   20   42:pop             
		throw job;
	//   21   43:aload_1         
	//   22   44:athrow          
	}

	final JobManager this$0;
	final AsyncAddCallback val$callback;
	final String val$uuid;

	JobManager$4()
	{
		this$0 = final_jobmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field JobManager this$0>
		val$uuid = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$uuid>
		val$callback = AsyncAddCallback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field AsyncAddCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void JobManagerCallbackAdapter()>
	//   11   19:return          
	}
}
