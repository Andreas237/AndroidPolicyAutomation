// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.util.Collection;

public class CancelResult
{
	public static interface AsyncCancelCallback
	{

		public abstract void onCancelled(CancelResult cancelresult);
	}


	public CancelResult(Collection collection, Collection collection1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		cancelledJobs = collection;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Collection cancelledJobs>
		failedToCancel = collection1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Collection failedToCancel>
	//    8   14:return          
	}

	public Collection getCancelledJobs()
	{
		return cancelledJobs;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Collection cancelledJobs>
	//    2    4:areturn         
	}

	public Collection getFailedToCancel()
	{
		return failedToCancel;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Collection failedToCancel>
	//    2    4:areturn         
	}

	private Collection cancelledJobs;
	private Collection failedToCancel;
}
