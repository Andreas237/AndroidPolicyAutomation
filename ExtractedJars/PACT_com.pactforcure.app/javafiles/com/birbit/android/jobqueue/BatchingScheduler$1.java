// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;

// Referenced classes of package com.birbit.android.jobqueue:
//			BatchingScheduler

class BatchingScheduler$1
	implements com.birbit.android.jobqueue.scheduling.Scheduler.Callback
{

	public boolean start(SchedulerConstraint schedulerconstraint)
	{
		BatchingScheduler.access$000(BatchingScheduler.this, schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BatchingScheduler this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void BatchingScheduler.access$000(BatchingScheduler, SchedulerConstraint)>
		return BatchingScheduler.this.start(schedulerconstraint);
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field BatchingScheduler this$0>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #29  <Method boolean BatchingScheduler.start(SchedulerConstraint)>
	//    8   16:ireturn         
	}

	public boolean stop(SchedulerConstraint schedulerconstraint)
	{
		return BatchingScheduler.this.stop(schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BatchingScheduler this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method boolean BatchingScheduler.stop(SchedulerConstraint)>
	//    4    8:ireturn         
	}

	final BatchingScheduler this$0;

	BatchingScheduler$1()
	{
		this$0 = BatchingScheduler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BatchingScheduler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
