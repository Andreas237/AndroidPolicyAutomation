// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.Executor;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			PriorityAsyncTask, PriorityFutureTask, Dependency

private static class PriorityAsyncTask$ProxyExecutor
	implements Executor
{

	public void execute(Runnable runnable)
	{
		executor.execute(((Runnable) (new PriorityFutureTask(runnable, ((Object) (null))) {

			public Dependency getDelegate()
			{
				return ((Dependency) (task));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field PriorityAsyncTask$ProxyExecutor this$0>
			//    2    4:invokestatic    #29  <Method PriorityAsyncTask PriorityAsyncTask$ProxyExecutor.access$000(PriorityAsyncTask$ProxyExecutor)>
			//    3    7:areturn         
			}

			final PriorityAsyncTask.ProxyExecutor this$0;

			
			{
				this$0 = PriorityAsyncTask.ProxyExecutor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field PriorityAsyncTask$ProxyExecutor this$0>
				super(runnable, obj);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:aload_3         
			//    6    8:invokespecial   #22  <Method void PriorityFutureTask(Runnable, Object)>
			//    7   11:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Executor executor>
	//    2    4:new             #12  <Class PriorityAsyncTask$ProxyExecutor$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #33  <Method void PriorityAsyncTask$ProxyExecutor$1(PriorityAsyncTask$ProxyExecutor, Runnable, Object)>
	//    8   14:invokeinterface #35  <Method void Executor.execute(Runnable)>
	//    9   19:return          
	}

	private final Executor executor;
	private final PriorityAsyncTask task;


/*
	static PriorityAsyncTask access$000(PriorityAsyncTask$ProxyExecutor priorityasynctask$proxyexecutor)
	{
		return priorityasynctask$proxyexecutor.task;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PriorityAsyncTask task>
	//    2    4:areturn         
	}

*/

	public PriorityAsyncTask$ProxyExecutor(Executor executor1, PriorityAsyncTask priorityasynctask)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		executor = executor1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Executor executor>
		task = priorityasynctask;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field PriorityAsyncTask task>
	//    8   14:return          
	}
}
