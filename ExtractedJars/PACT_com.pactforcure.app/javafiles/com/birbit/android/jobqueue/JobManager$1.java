// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobManager

class JobManager$1
	implements com.birbit.android.jobqueue.scheduling.lback
{

	public boolean start(SchedulerConstraint schedulerconstraint)
	{
		JobManager.access$000(JobManager.this, schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JobManager this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #27  <Method void JobManager.access$000(JobManager, SchedulerConstraint)>
		return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
	}

	public boolean stop(SchedulerConstraint schedulerconstraint)
	{
		JobManager.access$100(JobManager.this, schedulerconstraint);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field JobManager this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #31  <Method void JobManager.access$100(JobManager, SchedulerConstraint)>
		return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
	}

	final JobManager this$0;

	JobManager$1()
	{
		this$0 = JobManager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field JobManager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
