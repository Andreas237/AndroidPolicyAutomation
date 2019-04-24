// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.scheduling;


// Referenced classes of package com.birbit.android.jobqueue.scheduling:
//			Scheduler, SchedulerConstraint

public static interface Scheduler$Callback
{

	public abstract boolean start(SchedulerConstraint schedulerconstraint);

	public abstract boolean stop(SchedulerConstraint schedulerconstraint);
}
