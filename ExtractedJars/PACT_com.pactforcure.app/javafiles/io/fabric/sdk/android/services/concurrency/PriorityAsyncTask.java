// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask, Dependency, PriorityProvider, Task, 
//			DelegateProvider, PriorityTask, Priority, PriorityFutureTask

public abstract class PriorityAsyncTask extends AsyncTask
	implements Dependency, PriorityProvider, Task, DelegateProvider
{
	private static class ProxyExecutor
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

				final ProxyExecutor this$0;

			
			{
				this$0 = ProxyExecutor.this;
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
		static PriorityAsyncTask access$000(ProxyExecutor proxyexecutor)
		{
			return proxyexecutor.task;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field PriorityAsyncTask task>
		//    2    4:areturn         
		}

*/

		public ProxyExecutor(Executor executor1, PriorityAsyncTask priorityasynctask)
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


	public PriorityAsyncTask()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AsyncTask()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class PriorityTask>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void PriorityTask()>
	//    6   12:putfield        #29  <Field PriorityTask priorityTask>
	//    7   15:return          
	}

	public void addDependency(Task task)
	{
		if(getStatus() != AsyncTask.Status.PENDING)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #36  <Method AsyncTask$Status getStatus()>
	//*   2    4:getstatic       #42  <Field AsyncTask$Status AsyncTask$Status.PENDING>
	//*   3    7:if_acmpeq       20
		{
			throw new IllegalStateException("Must not add Dependency after task is running");
	//    4   10:new             #44  <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:ldc1            #46  <String "Must not add Dependency after task is running">
	//    7   16:invokespecial   #49  <Method void IllegalStateException(String)>
	//    8   19:athrow          
		} else
		{
			((Dependency)(PriorityProvider)getDelegate()).addDependency(((Object) (task)));
	//    9   20:aload_0         
	//   10   21:invokevirtual   #53  <Method Dependency getDelegate()>
	//   11   24:checkcast       #9   <Class PriorityProvider>
	//   12   27:checkcast       #7   <Class Dependency>
	//   13   30:aload_1         
	//   14   31:invokeinterface #56  <Method void Dependency.addDependency(Object)>
			return;
	//   15   36:return          
		}
	}

	public volatile void addDependency(Object obj)
	{
		addDependency((Task)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #11  <Class Task>
	//    3    5:invokevirtual   #58  <Method void addDependency(Task)>
	//    4    8:return          
	}

	public boolean areDependenciesMet()
	{
		return ((Dependency)(PriorityProvider)getDelegate()).areDependenciesMet();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #7   <Class Dependency>
	//    4   10:invokeinterface #62  <Method boolean Dependency.areDependenciesMet()>
	//    5   15:ireturn         
	}

	public int compareTo(Object obj)
	{
		return Priority.compareTo(((PriorityProvider) (this)), obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #69  <Method int Priority.compareTo(PriorityProvider, Object)>
	//    3    5:ireturn         
	}

	public final transient void executeOnExecutor(ExecutorService executorservice, Object aobj[])
	{
		super.executeOnExecutor(((Executor) (new ProxyExecutor(((Executor) (executorservice)), this))), aobj);
	//    0    0:aload_0         
	//    1    1:new             #15  <Class PriorityAsyncTask$ProxyExecutor>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokespecial   #74  <Method void PriorityAsyncTask$ProxyExecutor(Executor, PriorityAsyncTask)>
	//    6   10:aload_2         
	//    7   11:invokespecial   #77  <Method AsyncTask AsyncTask.executeOnExecutor(Executor, Object[])>
	//    8   14:pop             
	//    9   15:return          
	}

	public Dependency getDelegate()
	{
		return ((Dependency) (priorityTask));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field PriorityTask priorityTask>
	//    2    4:areturn         
	}

	public Collection getDependencies()
	{
		return ((Dependency)(PriorityProvider)getDelegate()).getDependencies();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #7   <Class Dependency>
	//    4   10:invokeinterface #84  <Method Collection Dependency.getDependencies()>
	//    5   15:areturn         
	}

	public Throwable getError()
	{
		return ((Task)(PriorityProvider)getDelegate()).getError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:invokeinterface #89  <Method Throwable Task.getError()>
	//    5   15:areturn         
	}

	public Priority getPriority()
	{
		return ((PriorityProvider)getDelegate()).getPriority();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:invokeinterface #93  <Method Priority PriorityProvider.getPriority()>
	//    4   12:areturn         
	}

	public boolean isFinished()
	{
		return ((Task)(PriorityProvider)getDelegate()).isFinished();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:invokeinterface #96  <Method boolean Task.isFinished()>
	//    5   15:ireturn         
	}

	public void setError(Throwable throwable)
	{
		((Task)(PriorityProvider)getDelegate()).setError(throwable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:aload_1         
	//    5   11:invokeinterface #100 <Method void Task.setError(Throwable)>
	//    6   16:return          
	}

	public void setFinished(boolean flag)
	{
		((Task)(PriorityProvider)getDelegate()).setFinished(flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:iload_1         
	//    5   11:invokeinterface #104 <Method void Task.setFinished(boolean)>
	//    6   16:return          
	}

	private final PriorityTask priorityTask = new PriorityTask();
}
