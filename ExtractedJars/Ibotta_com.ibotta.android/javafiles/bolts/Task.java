// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bolts:
//			BoltsExecutors, AndroidExecutors, Continuation, UnobservedTaskException

public class Task
{
	public static interface UnobservedExceptionHandler
	{

		public abstract void unobservedException(Task task, UnobservedTaskException unobservedtaskexception);
	}


	Task()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #77  <Method void Object()>
	//    6   12:putfield        #79  <Field Object lock>
		continuations = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #81  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #82  <Method void ArrayList()>
	//   11   23:putfield        #84  <Field List continuations>
	//   12   26:return          
	}

	private Task(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #77  <Method void Object()>
	//    6   12:putfield        #79  <Field Object lock>
		continuations = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #81  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #82  <Method void ArrayList()>
	//   11   23:putfield        #84  <Field List continuations>
		trySetResult(obj);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #88  <Method boolean trySetResult(Object)>
	//   15   31:pop             
	//   16   32:return          
	}

	private Task(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #77  <Method void Object()>
	//    6   12:putfield        #79  <Field Object lock>
		continuations = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #81  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #82  <Method void ArrayList()>
	//   11   23:putfield        #84  <Field List continuations>
		if(flag)
	//*  12   26:iload_1         
	//*  13   27:ifeq            36
		{
			trySetCancelled();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #94  <Method boolean trySetCancelled()>
	//   16   34:pop             
			return;
	//   17   35:return          
		} else
		{
			trySetResult(((Object) (null)));
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:invokevirtual   #88  <Method boolean trySetResult(Object)>
	//   21   41:pop             
			return;
	//   22   42:return          
		}
	}

	private void runContinuations()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Object lock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = continuations.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #84  <Field List continuations>
	//    7   11:invokeinterface #105 <Method Iterator List.iterator()>
	//    8   16:astore_2        
_L1:
		Continuation continuation;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_60;
	//    9   17:aload_2         
	//   10   18:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            60
		continuation = (Continuation)iterator.next();
	//   12   26:aload_2         
	//   13   27:invokeinterface #114 <Method Object Iterator.next()>
	//   14   32:checkcast       #116 <Class Continuation>
	//   15   35:astore_3        
		continuation.then(this);
	//   16   36:aload_3         
	//   17   37:aload_0         
	//   18   38:invokeinterface #120 <Method Object Continuation.then(Task)>
	//   19   43:pop             
		  goto _L1
	//*  20   44:goto            17
		Object obj1;
		obj1;
	//   21   47:astore_2        
		throw new RuntimeException(((Throwable) (obj1)));
	//   22   48:new             #97  <Class RuntimeException>
	//   23   51:dup             
	//   24   52:aload_2         
	//   25   53:invokespecial   #123 <Method void RuntimeException(Throwable)>
	//   26   56:athrow          
		obj1;
	//   27   57:astore_2        
		throw obj1;
	//   28   58:aload_2         
	//   29   59:athrow          
		continuations = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #84  <Field List continuations>
		obj;
	//   33   65:aload_1         
		JVM INSTR monitorexit ;
	//   34   66:monitorexit     
		return;
	//   35   67:return          
		obj1;
	//   36   68:astore_2        
		obj;
	//   37   69:aload_1         
		JVM INSTR monitorexit ;
	//   38   70:monitorexit     
		throw obj1;
	//   39   71:aload_2         
	//   40   72:athrow          
	}

	boolean trySetCancelled()
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!complete)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #125 <Field boolean complete>
	//    7   11:ifeq            18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		complete = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #125 <Field boolean complete>
		cancelled = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #127 <Field boolean cancelled>
		lock.notifyAll();
	//   18   28:aload_0         
	//   19   29:getfield        #79  <Field Object lock>
	//   20   32:invokevirtual   #130 <Method void Object.notifyAll()>
		runContinuations();
	//   21   35:aload_0         
	//   22   36:invokespecial   #132 <Method void runContinuations()>
		obj;
	//   23   39:aload_1         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return true;
	//   25   41:iconst_1        
	//   26   42:ireturn         
		exception;
	//   27   43:astore_2        
		obj;
	//   28   44:aload_1         
		JVM INSTR monitorexit ;
	//   29   45:monitorexit     
		throw exception;
	//   30   46:aload_2         
	//   31   47:athrow          
	}

	boolean trySetResult(Object obj)
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!complete)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #125 <Field boolean complete>
	//    7   11:ifeq            18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
		}
		complete = true;
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:putfield        #125 <Field boolean complete>
		result = obj;
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:putfield        #134 <Field Object result>
		lock.notifyAll();
	//   18   28:aload_0         
	//   19   29:getfield        #79  <Field Object lock>
	//   20   32:invokevirtual   #130 <Method void Object.notifyAll()>
		runContinuations();
	//   21   35:aload_0         
	//   22   36:invokespecial   #132 <Method void runContinuations()>
		obj1;
	//   23   39:aload_2         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return true;
	//   25   41:iconst_1        
	//   26   42:ireturn         
		obj;
	//   27   43:astore_1        
		obj1;
	//   28   44:aload_2         
		JVM INSTR monitorexit ;
	//   29   45:monitorexit     
		throw obj;
	//   30   46:aload_1         
	//   31   47:athrow          
	}

	public static final ExecutorService BACKGROUND_EXECUTOR = BoltsExecutors.background();
	private static final Executor IMMEDIATE_EXECUTOR = BoltsExecutors.immediate();
	private static Task TASK_CANCELLED = new Task(true);
	private static Task TASK_FALSE = new Task(((Object) (Boolean.valueOf(false))));
	private static Task TASK_NULL = new Task(((Object) (null)));
	private static Task TASK_TRUE = new Task(((Object) (Boolean.valueOf(true))));
	public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.uiThread();
	private boolean cancelled;
	private boolean complete;
	private List continuations;
	private final Object lock;
	private Object result;

	static 
	{
	//    0    0:invokestatic    #38  <Method ExecutorService BoltsExecutors.background()>
	//    1    3:putstatic       #40  <Field ExecutorService BACKGROUND_EXECUTOR>
	//    2    6:invokestatic    #44  <Method Executor BoltsExecutors.immediate()>
	//    3    9:putstatic       #46  <Field Executor IMMEDIATE_EXECUTOR>
	//    4   12:invokestatic    #51  <Method Executor AndroidExecutors.uiThread()>
	//    5   15:putstatic       #53  <Field Executor UI_THREAD_EXECUTOR>
	//    6   18:new             #2   <Class Task>
	//    7   21:dup             
	//    8   22:aconst_null     
	//    9   23:invokespecial   #57  <Method void Task(Object)>
	//   10   26:putstatic       #59  <Field Task TASK_NULL>
	//   11   29:new             #2   <Class Task>
	//   12   32:dup             
	//   13   33:iconst_1        
	//   14   34:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
	//   15   37:invokespecial   #57  <Method void Task(Object)>
	//   16   40:putstatic       #67  <Field Task TASK_TRUE>
	//   17   43:new             #2   <Class Task>
	//   18   46:dup             
	//   19   47:iconst_0        
	//   20   48:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
	//   21   51:invokespecial   #57  <Method void Task(Object)>
	//   22   54:putstatic       #69  <Field Task TASK_FALSE>
	//   23   57:new             #2   <Class Task>
	//   24   60:dup             
	//   25   61:iconst_1        
	//   26   62:invokespecial   #72  <Method void Task(boolean)>
	//   27   65:putstatic       #74  <Field Task TASK_CANCELLED>
	//*  28   68:return          
	}
}
