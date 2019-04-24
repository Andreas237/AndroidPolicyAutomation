// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			Dependency, PriorityProvider, Task, Priority

public class PriorityTask
	implements Dependency, PriorityProvider, Task
{

	public PriorityTask()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field List dependencies>
	//    7   15:aload_0         
	//    8   16:new             #30  <Class AtomicBoolean>
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:invokespecial   #33  <Method void AtomicBoolean(boolean)>
	//   12   24:putfield        #35  <Field AtomicBoolean hasRun>
	//   13   27:aload_0         
	//   14   28:new             #37  <Class AtomicReference>
	//   15   31:dup             
	//   16   32:aconst_null     
	//   17   33:invokespecial   #40  <Method void AtomicReference(Object)>
	//   18   36:putfield        #42  <Field AtomicReference throwable>
	//   19   39:return          
	}

	public static boolean isProperDelegate(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag;
		Dependency dependency;
		Task task;
		try
		{
			dependency = (Dependency)obj;
	//    2    2:aload_0         
	//    3    3:checkcast       #7   <Class Dependency>
	//    4    6:astore_3        
			task = (Task)obj;
	//    5    7:aload_0         
	//    6    8:checkcast       #11  <Class Task>
	//    7   11:astore          4
			obj = ((Object) ((PriorityProvider)obj));
	//    8   13:aload_0         
	//    9   14:checkcast       #9   <Class PriorityProvider>
	//   10   17:astore_0        
		}
	//*  11   18:iload_2         
	//*  12   19:istore_1        
	//*  13   20:aload_3         
	//*  14   21:ifnull          39
	//*  15   24:iload_2         
	//*  16   25:istore_1        
	//*  17   26:aload           4
	//*  18   28:ifnull          39
	//*  19   31:iload_2         
	//*  20   32:istore_1        
	//*  21   33:aload_0         
	//*  22   34:ifnull          39
	//*  23   37:iconst_1        
	//*  24   38:istore_1        
	//*  25   39:iload_1         
	//*  26   40:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  27   41:astore_0        
		{
			return false;
	//   28   42:iconst_0        
	//   29   43:ireturn         
		}
		flag = flag1;
		if(dependency != null)
		{
			flag = flag1;
			if(task != null)
			{
				flag = flag1;
				if(obj != null)
					flag = true;
			}
		}
		return flag;
	}

	public void addDependency(Task task)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		dependencies.add(((Object) (task)));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field List dependencies>
	//    4    6:aload_1         
	//    5    7:invokeinterface #54  <Method boolean List.add(Object)>
	//    6   12:pop             
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return;
	//    9   15:return          
		task;
	//   10   16:astore_1        
	//*  11   17:aload_0         
		throw task;
	//   12   18:monitorexit     
	//   13   19:aload_1         
	//   14   20:athrow          
	}

	public volatile void addDependency(Object obj)
	{
		addDependency((Task)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #11  <Class Task>
	//    3    5:invokevirtual   #56  <Method void addDependency(Task)>
	//    4    8:return          
	}

	public boolean areDependenciesMet()
	{
		for(Iterator iterator = getDependencies().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #62  <Method Collection getDependencies()>
	//*   2    4:invokeinterface #68  <Method Iterator Collection.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            38
			if(!((Task)iterator.next()).isFinished())
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #77  <Method Object Iterator.next()>
	//*   9   25:checkcast       #11  <Class Task>
	//*  10   28:invokeinterface #80  <Method boolean Task.isFinished()>
	//*  11   33:ifne            10
				return false;
	//   12   36:iconst_0        
	//   13   37:ireturn         

		return true;
	//   14   38:iconst_1        
	//   15   39:ireturn         
	}

	public int compareTo(Object obj)
	{
		return Priority.compareTo(((PriorityProvider) (this)), obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #87  <Method int Priority.compareTo(PriorityProvider, Object)>
	//    3    5:ireturn         
	}

	public Collection getDependencies()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Collection collection = Collections.unmodifiableCollection(((Collection) (dependencies)));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field List dependencies>
	//    4    6:invokestatic    #93  <Method Collection Collections.unmodifiableCollection(Collection)>
	//    5    9:astore_1        
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return collection;
	//    8   12:aload_1         
	//    9   13:areturn         
		Exception exception;
		exception;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public Throwable getError()
	{
		return (Throwable)throwable.get();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AtomicReference throwable>
	//    2    4:invokevirtual   #100 <Method Object AtomicReference.get()>
	//    3    7:checkcast       #102 <Class Throwable>
	//    4   10:areturn         
	}

	public Priority getPriority()
	{
		return Priority.NORMAL;
	//    0    0:getstatic       #108 <Field Priority Priority.NORMAL>
	//    1    3:areturn         
	}

	public boolean isFinished()
	{
		return hasRun.get();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field AtomicBoolean hasRun>
	//    2    4:invokevirtual   #110 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	public void setError(Throwable throwable1)
	{
		throwable.set(((Object) (throwable1)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AtomicReference throwable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	public void setFinished(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		hasRun.set(flag);
	//    2    2:aload_0         
	//    3    3:getfield        #35  <Field AtomicBoolean hasRun>
	//    4    6:iload_1         
	//    5    7:invokevirtual   #118 <Method void AtomicBoolean.set(boolean)>
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return;
	//    8   12:return          
		Exception exception;
		exception;
	//    9   13:astore_2        
	//*  10   14:aload_0         
		throw exception;
	//   11   15:monitorexit     
	//   12   16:aload_2         
	//   13   17:athrow          
	}

	private final List dependencies = new ArrayList();
	private final AtomicBoolean hasRun = new AtomicBoolean(false);
	private final AtomicReference throwable = new AtomicReference(((Object) (null)));
}
