// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.callback;

import com.birbit.android.jobqueue.Job;

public interface JobManagerCallback
{

	public abstract void onAfterJobRun(Job job, int i);

	public abstract void onDone(Job job);

	public abstract void onJobAdded(Job job);

	public abstract void onJobCancelled(Job job, boolean flag, Throwable throwable);

	public abstract void onJobRun(Job job, int i);

	public static final int RESULT_CANCEL_CANCELLED_VIA_SHOULD_RE_RUN = 5;
	public static final int RESULT_CANCEL_CANCELLED_WHILE_RUNNING = 3;
	public static final int RESULT_CANCEL_REACHED_RETRY_LIMIT = 2;
	public static final int RESULT_CANCEL_SINGLE_INSTANCE_WHILE_RUNNING = 6;
	public static final int RESULT_FAIL_WILL_RETRY = 4;
	public static final int RESULT_SUCCEED = 1;
}
