// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.Set;

// Referenced classes of package com.birbit.android.jobqueue:
//			Constraint, JobHolder

public interface JobQueue
{

	public abstract void clear();

	public abstract int count();

	public abstract int countReadyJobs(Constraint constraint);

	public abstract JobHolder findJobById(String s);

	public abstract Set findJobs(Constraint constraint);

	public abstract Long getNextJobDelayUntilNs(Constraint constraint);

	public abstract boolean insert(JobHolder jobholder);

	public abstract boolean insertOrReplace(JobHolder jobholder);

	public abstract JobHolder nextJobAndIncRunCount(Constraint constraint);

	public abstract void onJobCancelled(JobHolder jobholder);

	public abstract void remove(JobHolder jobholder);

	public abstract void substitute(JobHolder jobholder, JobHolder jobholder1);
}
