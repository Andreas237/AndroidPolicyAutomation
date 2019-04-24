// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			Dependency, PriorityProvider, Task, DelegateProvider, 
//			PriorityTask, Priority

public class PriorityFutureTask extends FutureTask
	implements Dependency, PriorityProvider, Task, DelegateProvider
{

	public PriorityFutureTask(Runnable runnable, Object obj)
	{
		super(runnable, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void FutureTask(Runnable, Object)>
		_flddelegate = ((Object) (checkAndInitDelegate(((Object) (runnable)))));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #23  <Method Dependency checkAndInitDelegate(Object)>
	//    8   12:putfield        #25  <Field Object _flddelegate>
	//    9   15:return          
	}

	public PriorityFutureTask(Callable callable)
	{
		super(callable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void FutureTask(Callable)>
		_flddelegate = ((Object) (checkAndInitDelegate(((Object) (callable)))));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #23  <Method Dependency checkAndInitDelegate(Object)>
	//    7   11:putfield        #25  <Field Object _flddelegate>
	//    8   14:return          
	}

	public void addDependency(Task task)
	{
		((Dependency)(PriorityProvider)getDelegate()).addDependency(((Object) (task)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #7   <Class Dependency>
	//    4   10:aload_1         
	//    5   11:invokeinterface #41  <Method void Dependency.addDependency(Object)>
	//    6   16:return          
	}

	public volatile void addDependency(Object obj)
	{
		addDependency((Task)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #11  <Class Task>
	//    3    5:invokevirtual   #43  <Method void addDependency(Task)>
	//    4    8:return          
	}

	public boolean areDependenciesMet()
	{
		return ((Dependency)(PriorityProvider)getDelegate()).areDependenciesMet();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #7   <Class Dependency>
	//    4   10:invokeinterface #47  <Method boolean Dependency.areDependenciesMet()>
	//    5   15:ireturn         
	}

	protected Dependency checkAndInitDelegate(Object obj)
	{
		if(PriorityTask.isProperDelegate(obj))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #53  <Method boolean PriorityTask.isProperDelegate(Object)>
	//*   2    4:ifeq            12
			return (Dependency)obj;
	//    3    7:aload_1         
	//    4    8:checkcast       #7   <Class Dependency>
	//    5   11:areturn         
		else
			return ((Dependency) (new PriorityTask()));
	//    6   12:new             #49  <Class PriorityTask>
	//    7   15:dup             
	//    8   16:invokespecial   #56  <Method void PriorityTask()>
	//    9   19:areturn         
	}

	public int compareTo(Object obj)
	{
		return ((PriorityProvider)getDelegate()).compareTo(obj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:aload_1         
	//    4    8:invokeinterface #61  <Method int PriorityProvider.compareTo(Object)>
	//    5   13:ireturn         
	}

	public Dependency getDelegate()
	{
		return (Dependency)_flddelegate;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object _flddelegate>
	//    2    4:checkcast       #7   <Class Dependency>
	//    3    7:areturn         
	}

	public Collection getDependencies()
	{
		return ((Dependency)(PriorityProvider)getDelegate()).getDependencies();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #7   <Class Dependency>
	//    4   10:invokeinterface #66  <Method Collection Dependency.getDependencies()>
	//    5   15:areturn         
	}

	public Throwable getError()
	{
		return ((Task)(PriorityProvider)getDelegate()).getError();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:invokeinterface #71  <Method Throwable Task.getError()>
	//    5   15:areturn         
	}

	public Priority getPriority()
	{
		return ((PriorityProvider)getDelegate()).getPriority();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:invokeinterface #75  <Method Priority PriorityProvider.getPriority()>
	//    4   12:areturn         
	}

	public boolean isFinished()
	{
		return ((Task)(PriorityProvider)getDelegate()).isFinished();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:invokeinterface #78  <Method boolean Task.isFinished()>
	//    5   15:ireturn         
	}

	public void setError(Throwable throwable)
	{
		((Task)(PriorityProvider)getDelegate()).setError(throwable);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:aload_1         
	//    5   11:invokeinterface #82  <Method void Task.setError(Throwable)>
	//    6   16:return          
	}

	public void setFinished(boolean flag)
	{
		((Task)(PriorityProvider)getDelegate()).setFinished(flag);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Dependency getDelegate()>
	//    2    4:checkcast       #9   <Class PriorityProvider>
	//    3    7:checkcast       #11  <Class Task>
	//    4   10:iload_1         
	//    5   11:invokeinterface #86  <Method void Task.setFinished(boolean)>
	//    6   16:return          
	}

	final Object _flddelegate;
}
