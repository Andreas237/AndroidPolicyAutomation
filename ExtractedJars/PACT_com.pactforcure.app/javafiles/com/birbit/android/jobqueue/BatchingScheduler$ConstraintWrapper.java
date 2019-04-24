// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.scheduling.SchedulerConstraint;

// Referenced classes of package com.birbit.android.jobqueue:
//			BatchingScheduler

private static class BatchingScheduler$ConstraintWrapper
{

	final SchedulerConstraint constraint;
	final Long deadlineNs;
	final long delayUntilNs;

	public BatchingScheduler$ConstraintWrapper(long l, Long long1, SchedulerConstraint schedulerconstraint)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		delayUntilNs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #21  <Field long delayUntilNs>
		deadlineNs = long1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #23  <Field Long deadlineNs>
		constraint = schedulerconstraint;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #25  <Field SchedulerConstraint constraint>
	//   11   20:return          
	}
}
