// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.ScheduledFuture;

// Referenced classes of package bolts:
//			Task, TaskCompletionSource

static final class Task$2
	implements Runnable
{

	public void run()
	{
		val$scheduled.cancel(true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ScheduledFuture val$scheduled>
	//    2    4:iconst_1        
	//    3    5:invokeinterface #32  <Method boolean ScheduledFuture.cancel(boolean)>
	//    4   10:pop             
		val$tcs.trySetCancelled();
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field TaskCompletionSource val$tcs>
	//    7   15:invokevirtual   #38  <Method boolean TaskCompletionSource.trySetCancelled()>
	//    8   18:pop             
	//    9   19:return          
	}

	final ScheduledFuture val$scheduled;
	final TaskCompletionSource val$tcs;

	Task$2(ScheduledFuture scheduledfuture, TaskCompletionSource taskcompletionsource)
	{
		val$scheduled = scheduledfuture;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ScheduledFuture val$scheduled>
		val$tcs = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TaskCompletionSource val$tcs>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
