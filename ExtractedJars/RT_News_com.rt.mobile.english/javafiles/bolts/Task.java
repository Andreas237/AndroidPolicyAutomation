// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package bolts:
//			BoltsExecutors, AndroidExecutors, Continuation, Capture, 
//			CancellationToken, AggregateException

public class Task
{
	public class TaskCompletionSource
	{

		public Task getTask()
		{
			return Task.this;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field Task this$0>
		//    2    4:areturn         
		}

		public void setCancelled()
		{
			if(!trySetCancelled())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #29  <Method boolean trySetCancelled()>
		//*   2    4:ifne            17
				throw new IllegalStateException("Cannot cancel a completed task.");
		//    3    7:new             #31  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:ldc1            #33  <String "Cannot cancel a completed task.">
		//    6   13:invokespecial   #36  <Method void IllegalStateException(String)>
		//    7   16:athrow          
			else
				return;
		//    8   17:return          
		}

		public void setError(Exception exception)
		{
			if(!trySetError(exception))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #42  <Method boolean trySetError(Exception)>
		//*   3    5:ifne            18
				throw new IllegalStateException("Cannot set the error on a completed task.");
		//    4    8:new             #31  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #44  <String "Cannot set the error on a completed task.">
		//    7   14:invokespecial   #36  <Method void IllegalStateException(String)>
		//    8   17:athrow          
			else
				return;
		//    9   18:return          
		}

		public void setResult(Object obj)
		{
			if(!trySetResult(obj))
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:invokevirtual   #50  <Method boolean trySetResult(Object)>
		//*   3    5:ifne            18
				throw new IllegalStateException("Cannot set the result of a completed task.");
		//    4    8:new             #31  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #52  <String "Cannot set the result of a completed task.">
		//    7   14:invokespecial   #36  <Method void IllegalStateException(String)>
		//    8   17:athrow          
			else
				return;
		//    9   18:return          
		}

		public boolean trySetCancelled()
		{
label0:
			{
				synchronized(lock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field Task this$0>
		//*   2    4:invokestatic    #57  <Method Object Task.access$300(Task)>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
				{
					if(!complete)
						break label0;
		//    6   10:aload_0         
		//    7   11:getfield        #13  <Field Task this$0>
		//    8   14:invokestatic    #61  <Method boolean Task.access$400(Task)>
		//    9   17:ifeq            24
				}
		//   10   20:aload_1         
		//   11   21:monitorexit     
				return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			}
			complete = true;
		//   14   24:aload_0         
		//   15   25:getfield        #13  <Field Task this$0>
		//   16   28:iconst_1        
		//   17   29:invokestatic    #65  <Method boolean Task.access$402(Task, boolean)>
		//   18   32:pop             
			cancelled = true;
		//   19   33:aload_0         
		//   20   34:getfield        #13  <Field Task this$0>
		//   21   37:iconst_1        
		//   22   38:invokestatic    #68  <Method boolean Task.access$502(Task, boolean)>
		//   23   41:pop             
			lock.notifyAll();
		//   24   42:aload_0         
		//   25   43:getfield        #13  <Field Task this$0>
		//   26   46:invokestatic    #57  <Method Object Task.access$300(Task)>
		//   27   49:invokevirtual   #71  <Method void Object.notifyAll()>
			runContinuations();
		//   28   52:aload_0         
		//   29   53:getfield        #13  <Field Task this$0>
		//   30   56:invokestatic    #74  <Method void Task.access$600(Task)>
			obj;
		//   31   59:aload_1         
			JVM INSTR monitorexit ;
		//   32   60:monitorexit     
			return true;
		//   33   61:iconst_1        
		//   34   62:ireturn         
			exception;
		//   35   63:astore_2        
			obj;
		//   36   64:aload_1         
			JVM INSTR monitorexit ;
		//   37   65:monitorexit     
			throw exception;
		//   38   66:aload_2         
		//   39   67:athrow          
		}

		public boolean trySetError(Exception exception)
		{
label0:
			{
				synchronized(lock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field Task this$0>
		//*   2    4:invokestatic    #57  <Method Object Task.access$300(Task)>
		//*   3    7:astore_2        
		//*   4    8:aload_2         
		//*   5    9:monitorenter    
				{
					if(!complete)
						break label0;
		//    6   10:aload_0         
		//    7   11:getfield        #13  <Field Task this$0>
		//    8   14:invokestatic    #61  <Method boolean Task.access$400(Task)>
		//    9   17:ifeq            24
				}
		//   10   20:aload_2         
		//   11   21:monitorexit     
				return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			}
			complete = true;
		//   14   24:aload_0         
		//   15   25:getfield        #13  <Field Task this$0>
		//   16   28:iconst_1        
		//   17   29:invokestatic    #65  <Method boolean Task.access$402(Task, boolean)>
		//   18   32:pop             
			error = exception;
		//   19   33:aload_0         
		//   20   34:getfield        #13  <Field Task this$0>
		//   21   37:aload_1         
		//   22   38:invokestatic    #78  <Method Exception Task.access$802(Task, Exception)>
		//   23   41:pop             
			lock.notifyAll();
		//   24   42:aload_0         
		//   25   43:getfield        #13  <Field Task this$0>
		//   26   46:invokestatic    #57  <Method Object Task.access$300(Task)>
		//   27   49:invokevirtual   #71  <Method void Object.notifyAll()>
			runContinuations();
		//   28   52:aload_0         
		//   29   53:getfield        #13  <Field Task this$0>
		//   30   56:invokestatic    #74  <Method void Task.access$600(Task)>
			obj;
		//   31   59:aload_2         
			JVM INSTR monitorexit ;
		//   32   60:monitorexit     
			return true;
		//   33   61:iconst_1        
		//   34   62:ireturn         
			exception;
		//   35   63:astore_1        
			obj;
		//   36   64:aload_2         
			JVM INSTR monitorexit ;
		//   37   65:monitorexit     
			throw exception;
		//   38   66:aload_1         
		//   39   67:athrow          
		}

		public boolean trySetResult(Object obj)
		{
label0:
			{
				synchronized(lock)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field Task this$0>
		//*   2    4:invokestatic    #57  <Method Object Task.access$300(Task)>
		//*   3    7:astore_2        
		//*   4    8:aload_2         
		//*   5    9:monitorenter    
				{
					if(!complete)
						break label0;
		//    6   10:aload_0         
		//    7   11:getfield        #13  <Field Task this$0>
		//    8   14:invokestatic    #61  <Method boolean Task.access$400(Task)>
		//    9   17:ifeq            24
				}
		//   10   20:aload_2         
		//   11   21:monitorexit     
				return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
			}
			complete = true;
		//   14   24:aload_0         
		//   15   25:getfield        #13  <Field Task this$0>
		//   16   28:iconst_1        
		//   17   29:invokestatic    #65  <Method boolean Task.access$402(Task, boolean)>
		//   18   32:pop             
			result = obj;
		//   19   33:aload_0         
		//   20   34:getfield        #13  <Field Task this$0>
		//   21   37:aload_1         
		//   22   38:invokestatic    #82  <Method Object Task.access$702(Task, Object)>
		//   23   41:pop             
			lock.notifyAll();
		//   24   42:aload_0         
		//   25   43:getfield        #13  <Field Task this$0>
		//   26   46:invokestatic    #57  <Method Object Task.access$300(Task)>
		//   27   49:invokevirtual   #71  <Method void Object.notifyAll()>
			runContinuations();
		//   28   52:aload_0         
		//   29   53:getfield        #13  <Field Task this$0>
		//   30   56:invokestatic    #74  <Method void Task.access$600(Task)>
			obj1;
		//   31   59:aload_2         
			JVM INSTR monitorexit ;
		//   32   60:monitorexit     
			return true;
		//   33   61:iconst_1        
		//   34   62:ireturn         
			obj;
		//   35   63:astore_1        
			obj1;
		//   36   64:aload_2         
			JVM INSTR monitorexit ;
		//   37   65:monitorexit     
			throw obj;
		//   38   66:aload_1         
		//   39   67:athrow          
		}

		final Task this$0;

		private TaskCompletionSource()
		{
			this$0 = Task.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field Task this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Object()>
		//    5    9:return          
		}

	}


	private Task()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #82  <Method void Object()>
	//    6   12:putfield        #84  <Field Object lock>
		continuations = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #86  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #87  <Method void ArrayList()>
	//   11   23:putfield        #89  <Field List continuations>
	//   12   26:return          
	}

	public static Task call(Callable callable)
	{
		return call(callable, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #127 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task call(Callable callable, CancellationToken cancellationtoken)
	{
		return call(callable, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    2    4:aload_1         
	//    3    5:invokestatic    #127 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task call(Callable callable, Executor executor)
	{
		return call(callable, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #127 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    6:areturn         
	}

	public static Task call(Callable callable, Executor executor, CancellationToken cancellationtoken)
	{
		TaskCompletionSource taskcompletionsource = create();
	//    0    0:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    1    3:astore_3        
		executor.execute(new Runnable(cancellationtoken, taskcompletionsource, callable) {

			public void run()
			{
				CancellationException cancellationexception;
				if(ct != null && ct.isCancellationRequested())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field CancellationToken val$ct>
			//*   2    4:ifnull          25
			//*   3    7:aload_0         
			//*   4    8:getfield        #21  <Field CancellationToken val$ct>
			//*   5   11:invokevirtual   #40  <Method boolean CancellationToken.isCancellationRequested()>
			//*   6   14:ifeq            25
				{
					tcs.setCancelled();
			//    7   17:aload_0         
			//    8   18:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
			//    9   21:invokevirtual   #45  <Method void Task$TaskCompletionSource.setCancelled()>
					return;
			//   10   24:return          
				}
				try
				{
					tcs.setResult(callable.call());
			//   11   25:aload_0         
			//   12   26:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
			//   13   29:aload_0         
			//   14   30:getfield        #25  <Field Callable val$callable>
			//   15   33:invokeinterface #50  <Method Object Callable.call()>
			//   16   38:invokevirtual   #54  <Method void Task$TaskCompletionSource.setResult(Object)>
					return;
			//   17   41:return          
				}
			//*  18   42:astore_1        
			//*  19   43:aload_0         
			//*  20   44:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
			//*  21   47:aload_1         
			//*  22   48:invokevirtual   #58  <Method void Task$TaskCompletionSource.setError(Exception)>
			//*  23   51:return          
			//*  24   52:aload_0         
			//*  25   53:getfield        #23  <Field Task$TaskCompletionSource val$tcs>
			//*  26   56:invokevirtual   #45  <Method void Task$TaskCompletionSource.setCancelled()>
			//*  27   59:return          
				// Misplaced declaration of an exception variable
				catch(CancellationException cancellationexception)
				{
					tcs.setCancelled();
				}
				catch(Exception exception)
				{
					tcs.setError(exception);
					return;
				}
			//*  28   60:astore_1        
			//*  29   61:goto            52
			}

			final Callable val$callable;
			final CancellationToken val$ct;
			final TaskCompletionSource val$tcs;

			
			{
				ct = cancellationtoken;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CancellationToken val$ct>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Task$TaskCompletionSource val$tcs>
				callable = callable1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Callable val$callable>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    2    4:aload_1         
	//    3    5:new             #23  <Class Task$3>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload_0         
	//    8   12:invokespecial   #140 <Method void Task$3(CancellationToken, Task$TaskCompletionSource, Callable)>
	//    9   15:invokeinterface #146 <Method void Executor.execute(Runnable)>
		return taskcompletionsource.getTask();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//   12   24:areturn         
	}

	public static Task callInBackground(Callable callable)
	{
		return call(callable, ((Executor) (BACKGROUND_EXECUTOR)), ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #65  <Field ExecutorService BACKGROUND_EXECUTOR>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #127 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task callInBackground(Callable callable, CancellationToken cancellationtoken)
	{
		return call(callable, ((Executor) (BACKGROUND_EXECUTOR)), cancellationtoken);
	//    0    0:aload_0         
	//    1    1:getstatic       #65  <Field ExecutorService BACKGROUND_EXECUTOR>
	//    2    4:aload_1         
	//    3    5:invokestatic    #127 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task cancelled()
	{
		TaskCompletionSource taskcompletionsource = create();
	//    0    0:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    1    3:astore_0        
		taskcompletionsource.setCancelled();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #155 <Method void Task$TaskCompletionSource.setCancelled()>
		return taskcompletionsource.getTask();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//    6   12:areturn         
	}

	private static void completeAfterTask(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

			public void run()
			{
				if(ct != null && ct.isCancellationRequested())
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field CancellationToken val$ct>
			//*   2    4:ifnull          25
			//*   3    7:aload_0         
			//*   4    8:getfield        #25  <Field CancellationToken val$ct>
			//*   5   11:invokevirtual   #46  <Method boolean CancellationToken.isCancellationRequested()>
			//*   6   14:ifeq            25
				{
					tcs.setCancelled();
			//    7   17:aload_0         
			//    8   18:getfield        #27  <Field Task$TaskCompletionSource val$tcs>
			//    9   21:invokevirtual   #51  <Method void Task$TaskCompletionSource.setCancelled()>
					return;
			//   10   24:return          
				}
				Task task1 = (Task)continuation.then(task);
			//   11   25:aload_0         
			//   12   26:getfield        #29  <Field Continuation val$continuation>
			//   13   29:aload_0         
			//   14   30:getfield        #31  <Field Task val$task>
			//   15   33:invokeinterface #57  <Method Object Continuation.then(Task)>
			//   16   38:checkcast       #8   <Class Task>
			//   17   41:astore_1        
				if(task1 == null)
			//*  18   42:aload_1         
			//*  19   43:ifnonnull       55
				{
					try
					{
						tcs.setResult(((Object) (null)));
			//   20   46:aload_0         
			//   21   47:getfield        #27  <Field Task$TaskCompletionSource val$tcs>
			//   22   50:aconst_null     
			//   23   51:invokevirtual   #61  <Method void Task$TaskCompletionSource.setResult(Object)>
						return;
			//   24   54:return          
					}
			//*  25   55:aload_1         
			//*  26   56:new             #13  <Class Task$14$1>
			//*  27   59:dup             
			//*  28   60:aload_0         
			//*  29   61:invokespecial   #64  <Method void Task$14$1(Task$14)>
			//*  30   64:invokevirtual   #68  <Method Task Task.continueWith(Continuation)>
			//*  31   67:pop             
			//*  32   68:return          
			//*  33   69:astore_1        
			//*  34   70:aload_0         
			//*  35   71:getfield        #27  <Field Task$TaskCompletionSource val$tcs>
			//*  36   74:aload_1         
			//*  37   75:invokevirtual   #72  <Method void Task$TaskCompletionSource.setError(Exception)>
			//*  38   78:return          
			//*  39   79:aload_0         
			//*  40   80:getfield        #27  <Field Task$TaskCompletionSource val$tcs>
			//*  41   83:invokevirtual   #51  <Method void Task$TaskCompletionSource.setCancelled()>
			//*  42   86:return          
					// Misplaced declaration of an exception variable
					catch(CancellationException cancellationexception)
					{
						tcs.setCancelled();
					}
					catch(Exception exception)
					{
						tcs.setError(exception);
						return;
					}
					break MISSING_BLOCK_LABEL_86;
				}
				task1.continueWith(new Continuation() {

					public volatile Object then(Task task)
						throws Exception
					{
						return ((Object) (then(task)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:invokevirtual   #28  <Method Void then(Task)>
					//    3    5:areturn         
					}

					public Void then(Task task)
					{
						if(ct != null && ct.isCancellationRequested())
					//*   0    0:aload_0         
					//*   1    1:getfield        #18  <Field Task$14 this$0>
					//*   2    4:getfield        #33  <Field CancellationToken Task$14.val$ct>
					//*   3    7:ifnull          35
					//*   4   10:aload_0         
					//*   5   11:getfield        #18  <Field Task$14 this$0>
					//*   6   14:getfield        #33  <Field CancellationToken Task$14.val$ct>
					//*   7   17:invokevirtual   #39  <Method boolean CancellationToken.isCancellationRequested()>
					//*   8   20:ifeq            35
						{
							tcs.setCancelled();
					//    9   23:aload_0         
					//   10   24:getfield        #18  <Field Task$14 this$0>
					//   11   27:getfield        #43  <Field Task$TaskCompletionSource Task$14.val$tcs>
					//   12   30:invokevirtual   #48  <Method void Task$TaskCompletionSource.setCancelled()>
							return null;
					//   13   33:aconst_null     
					//   14   34:areturn         
						}
						if(task.isCancelled())
					//*  15   35:aload_1         
					//*  16   36:invokevirtual   #53  <Method boolean Task.isCancelled()>
					//*  17   39:ifeq            54
						{
							tcs.setCancelled();
					//   18   42:aload_0         
					//   19   43:getfield        #18  <Field Task$14 this$0>
					//   20   46:getfield        #43  <Field Task$TaskCompletionSource Task$14.val$tcs>
					//   21   49:invokevirtual   #48  <Method void Task$TaskCompletionSource.setCancelled()>
							return null;
					//   22   52:aconst_null     
					//   23   53:areturn         
						}
						if(task.isFaulted())
					//*  24   54:aload_1         
					//*  25   55:invokevirtual   #56  <Method boolean Task.isFaulted()>
					//*  26   58:ifeq            77
						{
							tcs.setError(task.getError());
					//   27   61:aload_0         
					//   28   62:getfield        #18  <Field Task$14 this$0>
					//   29   65:getfield        #43  <Field Task$TaskCompletionSource Task$14.val$tcs>
					//   30   68:aload_1         
					//   31   69:invokevirtual   #60  <Method Exception Task.getError()>
					//   32   72:invokevirtual   #64  <Method void Task$TaskCompletionSource.setError(Exception)>
							return null;
					//   33   75:aconst_null     
					//   34   76:areturn         
						} else
						{
							tcs.setResult(task.getResult());
					//   35   77:aload_0         
					//   36   78:getfield        #18  <Field Task$14 this$0>
					//   37   81:getfield        #43  <Field Task$TaskCompletionSource Task$14.val$tcs>
					//   38   84:aload_1         
					//   39   85:invokevirtual   #68  <Method Object Task.getResult()>
					//   40   88:invokevirtual   #72  <Method void Task$TaskCompletionSource.setResult(Object)>
							return null;
					//   41   91:aconst_null     
					//   42   92:areturn         
						}
					}

					final _cls14 this$0;

			
			{
				this$0 = _cls14.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Task$14 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
				return;
				CancellationException cancellationexception;
			//*  43   87:astore_1        
			//*  44   88:goto            79
			}

			final Continuation val$continuation;
			final CancellationToken val$ct;
			final Task val$task;
			final TaskCompletionSource val$tcs;

			
			{
				ct = cancellationtoken;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field CancellationToken val$ct>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Task$TaskCompletionSource val$tcs>
				continuation = continuation1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field Continuation val$continuation>
				task = task1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field Task val$task>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_3         
	//    1    1:new             #17  <Class Task$14>
	//    2    4:dup             
	//    3    5:aload           4
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #159 <Method void Task$14(CancellationToken, Task$TaskCompletionSource, Continuation, Task)>
	//    8   13:invokeinterface #146 <Method void Executor.execute(Runnable)>
	//    9   18:return          
	}

	private static void completeImmediately(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

			public void run()
			{
				CancellationException cancellationexception;
				if(ct != null && ct.isCancellationRequested())
			//*   0    0:aload_0         
			//*   1    1:getfield        #23  <Field CancellationToken val$ct>
			//*   2    4:ifnull          25
			//*   3    7:aload_0         
			//*   4    8:getfield        #23  <Field CancellationToken val$ct>
			//*   5   11:invokevirtual   #44  <Method boolean CancellationToken.isCancellationRequested()>
			//*   6   14:ifeq            25
				{
					tcs.setCancelled();
			//    7   17:aload_0         
			//    8   18:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
			//    9   21:invokevirtual   #49  <Method void Task$TaskCompletionSource.setCancelled()>
					return;
			//   10   24:return          
				}
				try
				{
					Object obj = continuation.then(task);
			//   11   25:aload_0         
			//   12   26:getfield        #27  <Field Continuation val$continuation>
			//   13   29:aload_0         
			//   14   30:getfield        #29  <Field Task val$task>
			//   15   33:invokeinterface #55  <Method Object Continuation.then(Task)>
			//   16   38:astore_1        
					tcs.setResult(obj);
			//   17   39:aload_0         
			//   18   40:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
			//   19   43:aload_1         
			//   20   44:invokevirtual   #59  <Method void Task$TaskCompletionSource.setResult(Object)>
					return;
			//   21   47:return          
				}
			//*  22   48:astore_1        
			//*  23   49:aload_0         
			//*  24   50:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
			//*  25   53:aload_1         
			//*  26   54:invokevirtual   #63  <Method void Task$TaskCompletionSource.setError(Exception)>
			//*  27   57:return          
			//*  28   58:aload_0         
			//*  29   59:getfield        #25  <Field Task$TaskCompletionSource val$tcs>
			//*  30   62:invokevirtual   #49  <Method void Task$TaskCompletionSource.setCancelled()>
			//*  31   65:return          
				// Misplaced declaration of an exception variable
				catch(CancellationException cancellationexception)
				{
					tcs.setCancelled();
				}
				catch(Exception exception)
				{
					tcs.setError(exception);
					return;
				}
			//*  32   66:astore_1        
			//*  33   67:goto            58
			}

			final Continuation val$continuation;
			final CancellationToken val$ct;
			final Task val$task;
			final TaskCompletionSource val$tcs;

			
			{
				ct = cancellationtoken;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CancellationToken val$ct>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Task$TaskCompletionSource val$tcs>
				continuation = continuation1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Continuation val$continuation>
				task = task1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field Task val$task>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_3         
	//    1    1:new             #15  <Class Task$13>
	//    2    4:dup             
	//    3    5:aload           4
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #161 <Method void Task$13(CancellationToken, Task$TaskCompletionSource, Continuation, Task)>
	//    8   13:invokeinterface #146 <Method void Executor.execute(Runnable)>
	//    9   18:return          
	}

	public static TaskCompletionSource create()
	{
		Task task = new Task();
	//    0    0:new             #2   <Class Task>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void Task()>
	//    3    7:astore_0        
		((Object) (task)).getClass();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #167 <Method Class Object.getClass()>
	//    6   12:pop             
		return ((TaskCompletionSource) (task)). new TaskCompletionSource();
	//    7   13:new             #37  <Class Task$TaskCompletionSource>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:invokespecial   #170 <Method void Task$TaskCompletionSource(Task, Task$1)>
	//   12   22:areturn         
	}

	public static Task delay(long l)
	{
		return delay(l, BoltsExecutors.scheduled());
	//    0    0:lload_0         
	//    1    1:invokestatic    #177 <Method ScheduledExecutorService BoltsExecutors.scheduled()>
	//    2    4:invokestatic    #180 <Method Task delay(long, ScheduledExecutorService)>
	//    3    7:areturn         
	}

	static Task delay(long l, ScheduledExecutorService scheduledexecutorservice)
	{
		if(l <= 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifgt            11
		{
			return forResult(((Object) (null)));
	//    4    6:aconst_null     
	//    5    7:invokestatic    #185 <Method Task forResult(Object)>
	//    6   10:areturn         
		} else
		{
			TaskCompletionSource taskcompletionsource = create();
	//    7   11:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    8   14:astore_3        
			scheduledexecutorservice.schedule(new Runnable(taskcompletionsource) {

				public void run()
				{
					tcs.setResult(((Object) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field Task$TaskCompletionSource val$tcs>
				//    2    4:aconst_null     
				//    3    5:invokevirtual   #28  <Method void Task$TaskCompletionSource.setResult(Object)>
				//    4    8:return          
				}

				final TaskCompletionSource val$tcs;

			
			{
				tcs = taskcompletionsource;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field Task$TaskCompletionSource val$tcs>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, l, TimeUnit.MILLISECONDS);
	//    9   15:aload_2         
	//   10   16:new             #7   <Class Task$1>
	//   11   19:dup             
	//   12   20:aload_3         
	//   13   21:invokespecial   #188 <Method void Task$1(Task$TaskCompletionSource)>
	//   14   24:lload_0         
	//   15   25:getstatic       #194 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   16   28:invokeinterface #200 <Method java.util.concurrent.ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   17   33:pop             
			return taskcompletionsource.getTask();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//   20   38:areturn         
		}
	}

	public static Task forError(Exception exception)
	{
		TaskCompletionSource taskcompletionsource = create();
	//    0    0:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    1    3:astore_1        
		taskcompletionsource.setError(exception);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #207 <Method void Task$TaskCompletionSource.setError(Exception)>
		return taskcompletionsource.getTask();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//    7   13:areturn         
	}

	public static Task forResult(Object obj)
	{
		TaskCompletionSource taskcompletionsource = create();
	//    0    0:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    1    3:astore_1        
		taskcompletionsource.setResult(obj);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #212 <Method void Task$TaskCompletionSource.setResult(Object)>
		return taskcompletionsource.getTask();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//    7   13:areturn         
	}

	private void runContinuations()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Object lock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = continuations.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #89  <Field List continuations>
	//    7   11:invokeinterface #223 <Method Iterator List.iterator()>
	//    8   16:astore_2        
_L1:
		Continuation continuation;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_60;
	//    9   17:aload_2         
	//   10   18:invokeinterface #229 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            60
		continuation = (Continuation)iterator.next();
	//   12   26:aload_2         
	//   13   27:invokeinterface #233 <Method Object Iterator.next()>
	//   14   32:checkcast       #235 <Class Continuation>
	//   15   35:astore_3        
		continuation.then(this);
	//   16   36:aload_3         
	//   17   37:aload_0         
	//   18   38:invokeinterface #238 <Method Object Continuation.then(Task)>
	//   19   43:pop             
		  goto _L1
	//*  20   44:goto            17
		Object obj1;
		obj1;
	//   21   47:astore_2        
		throw new RuntimeException(((Throwable) (obj1)));
	//   22   48:new             #215 <Class RuntimeException>
	//   23   51:dup             
	//   24   52:aload_2         
	//   25   53:invokespecial   #241 <Method void RuntimeException(Throwable)>
	//   26   56:athrow          
		obj1;
	//   27   57:astore_2        
		throw obj1;
	//   28   58:aload_2         
	//   29   59:athrow          
		continuations = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #89  <Field List continuations>
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

	public static Task whenAll(Collection collection)
	{
		if(collection.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #249 <Method int Collection.size()>
	//*   2    6:ifne            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #185 <Method Task forResult(Object)>
	//    5   13:areturn         
		TaskCompletionSource taskcompletionsource = create();
	//    6   14:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    7   17:astore_1        
		ArrayList arraylist = new ArrayList();
	//    8   18:new             #86  <Class ArrayList>
	//    9   21:dup             
	//   10   22:invokespecial   #87  <Method void ArrayList()>
	//   11   25:astore_2        
		Object obj = new Object();
	//   12   26:new             #5   <Class Object>
	//   13   29:dup             
	//   14   30:invokespecial   #82  <Method void Object()>
	//   15   33:astore_3        
		AtomicInteger atomicinteger = new AtomicInteger(collection.size());
	//   16   34:new             #251 <Class AtomicInteger>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokeinterface #249 <Method int Collection.size()>
	//   20   44:invokespecial   #254 <Method void AtomicInteger(int)>
	//   21   47:astore          4
		AtomicBoolean atomicboolean = new AtomicBoolean(false);
	//   22   49:new             #256 <Class AtomicBoolean>
	//   23   52:dup             
	//   24   53:iconst_0        
	//   25   54:invokespecial   #259 <Method void AtomicBoolean(boolean)>
	//   26   57:astore          5
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((Task)((Iterator) (collection)).next()).continueWith(new Continuation(obj, arraylist, atomicboolean, atomicinteger, taskcompletionsource) {

		public volatile Object then(Task task)
			throws Exception
		{
			return ((Object) (then(task)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #45  <Method Void then(Task)>
		//    3    5:areturn         
		}

		public Void then(Task task)
		{
			if(task.isFaulted())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #50  <Method boolean Task.isFaulted()>
		//*   2    4:ifeq            36
				synchronized(errorLock)
		//*   3    7:aload_0         
		//*   4    8:getfield        #26  <Field Object val$errorLock>
		//*   5   11:astore_2        
		//*   6   12:aload_2         
		//*   7   13:monitorenter    
				{
					causes.add(((Object) (task.getError())));
		//    8   14:aload_0         
		//    9   15:getfield        #28  <Field ArrayList val$causes>
		//   10   18:aload_1         
		//   11   19:invokevirtual   #54  <Method Exception Task.getError()>
		//   12   22:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
		//   13   25:pop             
				}
		//   14   26:aload_2         
		//   15   27:monitorexit     
			break MISSING_BLOCK_LABEL_36;
		//   16   28:goto            36
			task;
		//   17   31:astore_1        
			obj1;
		//   18   32:aload_2         
			JVM INSTR monitorexit ;
		//   19   33:monitorexit     
			throw task;
		//   20   34:aload_1         
		//   21   35:athrow          
			if(task.isCancelled())
		//*  22   36:aload_1         
		//*  23   37:invokevirtual   #63  <Method boolean Task.isCancelled()>
		//*  24   40:ifeq            51
				isCancelled.set(true);
		//   25   43:aload_0         
		//   26   44:getfield        #30  <Field AtomicBoolean val$isCancelled>
		//   27   47:iconst_1        
		//   28   48:invokevirtual   #69  <Method void AtomicBoolean.set(boolean)>
			if(count.decrementAndGet() == 0)
		//*  29   51:aload_0         
		//*  30   52:getfield        #32  <Field AtomicInteger val$count>
		//*  31   55:invokevirtual   #75  <Method int AtomicInteger.decrementAndGet()>
		//*  32   58:ifne            173
			{
				if(causes.size() != 0)
		//*  33   61:aload_0         
		//*  34   62:getfield        #28  <Field ArrayList val$causes>
		//*  35   65:invokevirtual   #78  <Method int ArrayList.size()>
		//*  36   68:ifeq            146
					if(causes.size() == 1)
		//*  37   71:aload_0         
		//*  38   72:getfield        #28  <Field ArrayList val$causes>
		//*  39   75:invokevirtual   #78  <Method int ArrayList.size()>
		//*  40   78:iconst_1        
		//*  41   79:icmpne          102
					{
						allFinished.setError((Exception)causes.get(0));
		//   42   82:aload_0         
		//   43   83:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
		//   44   86:aload_0         
		//   45   87:getfield        #28  <Field ArrayList val$causes>
		//   46   90:iconst_0        
		//   47   91:invokevirtual   #82  <Method Object ArrayList.get(int)>
		//   48   94:checkcast       #42  <Class Exception>
		//   49   97:invokevirtual   #88  <Method void Task$TaskCompletionSource.setError(Exception)>
						return null;
		//   50  100:aconst_null     
		//   51  101:areturn         
					} else
					{
						task = ((Task) (new AggregateException(String.format("There were %d exceptions.", new Object[] {
							Integer.valueOf(causes.size())
						}), ((List) (causes)))));
		//   52  102:new             #90  <Class AggregateException>
		//   53  105:dup             
		//   54  106:ldc1            #92  <String "There were %d exceptions.">
		//   55  108:iconst_1        
		//   56  109:anewarray       Object[]
		//   57  112:dup             
		//   58  113:iconst_0        
		//   59  114:aload_0         
		//   60  115:getfield        #28  <Field ArrayList val$causes>
		//   61  118:invokevirtual   #78  <Method int ArrayList.size()>
		//   62  121:invokestatic    #98  <Method Integer Integer.valueOf(int)>
		//   63  124:aastore         
		//   64  125:invokestatic    #104 <Method String String.format(String, Object[])>
		//   65  128:aload_0         
		//   66  129:getfield        #28  <Field ArrayList val$causes>
		//   67  132:invokespecial   #107 <Method void AggregateException(String, List)>
		//   68  135:astore_1        
						allFinished.setError(((Exception) (task)));
		//   69  136:aload_0         
		//   70  137:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
		//   71  140:aload_1         
		//   72  141:invokevirtual   #88  <Method void Task$TaskCompletionSource.setError(Exception)>
						return null;
		//   73  144:aconst_null     
		//   74  145:areturn         
					}
				if(isCancelled.get())
		//*  75  146:aload_0         
		//*  76  147:getfield        #30  <Field AtomicBoolean val$isCancelled>
		//*  77  150:invokevirtual   #109 <Method boolean AtomicBoolean.get()>
		//*  78  153:ifeq            165
				{
					allFinished.setCancelled();
		//   79  156:aload_0         
		//   80  157:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
		//   81  160:invokevirtual   #112 <Method void Task$TaskCompletionSource.setCancelled()>
					return null;
		//   82  163:aconst_null     
		//   83  164:areturn         
				}
				allFinished.setResult(((Object) (null)));
		//   84  165:aload_0         
		//   85  166:getfield        #34  <Field Task$TaskCompletionSource val$allFinished>
		//   86  169:aconst_null     
		//   87  170:invokevirtual   #116 <Method void Task$TaskCompletionSource.setResult(Object)>
			}
			return null;
		//   88  173:aconst_null     
		//   89  174:areturn         
		}

		final TaskCompletionSource val$allFinished;
		final ArrayList val$causes;
		final AtomicInteger val$count;
		final Object val$errorLock;
		final AtomicBoolean val$isCancelled;

			
			{
				errorLock = obj;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Object val$errorLock>
				causes = arraylist;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field ArrayList val$causes>
				isCancelled = atomicboolean;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field AtomicBoolean val$isCancelled>
				count = atomicinteger;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field AtomicInteger val$count>
				allFinished = taskcompletionsource;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field Task$TaskCompletionSource val$allFinished>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
	}
));
	//   27   59:aload_0         
	//   28   60:invokeinterface #260 <Method Iterator Collection.iterator()>
	//   29   65:astore_0        
	//   30   66:aload_0         
	//   31   67:invokeinterface #229 <Method boolean Iterator.hasNext()>
	//   32   72:ifeq            105
	//   33   75:aload_0         
	//   34   76:invokeinterface #233 <Method Object Iterator.next()>
	//   35   81:checkcast       #2   <Class Task>
	//   36   84:new             #31  <Class Task$7>
	//   37   87:dup             
	//   38   88:aload_3         
	//   39   89:aload_2         
	//   40   90:aload           5
	//   41   92:aload           4
	//   42   94:aload_1         
	//   43   95:invokespecial   #263 <Method void Task$7(Object, ArrayList, AtomicBoolean, AtomicInteger, Task$TaskCompletionSource)>
	//   44   98:invokevirtual   #267 <Method Task continueWith(Continuation)>
	//   45  101:pop             
	//*  46  102:goto            66
		return taskcompletionsource.getTask();
	//   47  105:aload_1         
	//   48  106:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//   49  109:areturn         
	}

	public static Task whenAllResult(Collection collection)
	{
		return whenAll(collection).onSuccess(new Continuation(collection) {

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method List then(Task)>
			//    3    5:areturn         
			}

			public List then(Task task)
				throws Exception
			{
				if(tasks.size() == 0)
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field Collection val$tasks>
			//*   2    4:invokeinterface #36  <Method int Collection.size()>
			//*   3    9:ifne            16
					return Collections.emptyList();
			//    4   12:invokestatic    #42  <Method List Collections.emptyList()>
			//    5   15:areturn         
				task = ((Task) (new ArrayList()));
			//    6   16:new             #44  <Class ArrayList>
			//    7   19:dup             
			//    8   20:invokespecial   #45  <Method void ArrayList()>
			//    9   23:astore_1        
				for(Iterator iterator = tasks.iterator(); iterator.hasNext(); ((List) (task)).add(((Task)iterator.next()).getResult()));
			//   10   24:aload_0         
			//   11   25:getfield        #18  <Field Collection val$tasks>
			//   12   28:invokeinterface #49  <Method Iterator Collection.iterator()>
			//   13   33:astore_2        
			//   14   34:aload_2         
			//   15   35:invokeinterface #55  <Method boolean Iterator.hasNext()>
			//   16   40:ifeq            65
			//   17   43:aload_1         
			//   18   44:aload_2         
			//   19   45:invokeinterface #59  <Method Object Iterator.next()>
			//   20   50:checkcast       #9   <Class Task>
			//   21   53:invokevirtual   #62  <Method Object Task.getResult()>
			//   22   56:invokeinterface #68  <Method boolean List.add(Object)>
			//   23   61:pop             
			//*  24   62:goto            34
				return ((List) (task));
			//   25   65:aload_1         
			//   26   66:areturn         
			}

			final Collection val$tasks;

			
			{
				tasks = collection;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Collection val$tasks>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:invokestatic    #271 <Method Task whenAll(Collection)>
	//    2    4:new             #29  <Class Task$6>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #274 <Method void Task$6(Collection)>
	//    6   12:invokevirtual   #277 <Method Task onSuccess(Continuation)>
	//    7   15:areturn         
	}

	public static Task whenAny(Collection collection)
	{
		if(collection.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #249 <Method int Collection.size()>
	//*   2    6:ifne            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #185 <Method Task forResult(Object)>
	//    5   13:areturn         
		TaskCompletionSource taskcompletionsource = create();
	//    6   14:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    7   17:astore_1        
		AtomicBoolean atomicboolean = new AtomicBoolean(false);
	//    8   18:new             #256 <Class AtomicBoolean>
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:invokespecial   #259 <Method void AtomicBoolean(boolean)>
	//   12   26:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((Task)((Iterator) (collection)).next()).continueWith(new Continuation(atomicboolean, taskcompletionsource) {

		public volatile Object then(Task task)
			throws Exception
		{
			return ((Object) (then(task)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #33  <Method Void then(Task)>
		//    3    5:areturn         
		}

		public Void then(Task task)
		{
			if(isAnyTaskComplete.compareAndSet(false, true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
		//*   2    4:iconst_0        
		//*   3    5:iconst_1        
		//*   4    6:invokevirtual   #40  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
		//*   5    9:ifeq            20
				firstCompleted.setResult(((Object) (task)));
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field Task$TaskCompletionSource val$firstCompleted>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #46  <Method void Task$TaskCompletionSource.setResult(Object)>
			return null;
		//   10   20:aconst_null     
		//   11   21:areturn         
		}

		final TaskCompletionSource val$firstCompleted;
		final AtomicBoolean val$isAnyTaskComplete;

			
			{
				isAnyTaskComplete = atomicboolean;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
				firstCompleted = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Task$TaskCompletionSource val$firstCompleted>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
	}
));
	//   13   27:aload_0         
	//   14   28:invokeinterface #260 <Method Iterator Collection.iterator()>
	//   15   33:astore_0        
	//   16   34:aload_0         
	//   17   35:invokeinterface #229 <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            68
	//   19   43:aload_0         
	//   20   44:invokeinterface #233 <Method Object Iterator.next()>
	//   21   49:checkcast       #2   <Class Task>
	//   22   52:new             #27  <Class Task$5>
	//   23   55:dup             
	//   24   56:aload_2         
	//   25   57:aload_1         
	//   26   58:invokespecial   #282 <Method void Task$5(AtomicBoolean, Task$TaskCompletionSource)>
	//   27   61:invokevirtual   #267 <Method Task continueWith(Continuation)>
	//   28   64:pop             
	//*  29   65:goto            34
		return taskcompletionsource.getTask();
	//   30   68:aload_1         
	//   31   69:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//   32   72:areturn         
	}

	public static Task whenAnyResult(Collection collection)
	{
		if(collection.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #249 <Method int Collection.size()>
	//*   2    6:ifne            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #185 <Method Task forResult(Object)>
	//    5   13:areturn         
		TaskCompletionSource taskcompletionsource = create();
	//    6   14:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    7   17:astore_1        
		AtomicBoolean atomicboolean = new AtomicBoolean(false);
	//    8   18:new             #256 <Class AtomicBoolean>
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:invokespecial   #259 <Method void AtomicBoolean(boolean)>
	//   12   26:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((Task)((Iterator) (collection)).next()).continueWith(new Continuation(atomicboolean, taskcompletionsource) {

		public volatile Object then(Task task)
			throws Exception
		{
			return ((Object) (then(task)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #33  <Method Void then(Task)>
		//    3    5:areturn         
		}

		public Void then(Task task)
		{
			if(isAnyTaskComplete.compareAndSet(false, true))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
		//*   2    4:iconst_0        
		//*   3    5:iconst_1        
		//*   4    6:invokevirtual   #40  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
		//*   5    9:ifeq            20
				firstCompleted.setResult(((Object) (task)));
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field Task$TaskCompletionSource val$firstCompleted>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #46  <Method void Task$TaskCompletionSource.setResult(Object)>
			return null;
		//   10   20:aconst_null     
		//   11   21:areturn         
		}

		final TaskCompletionSource val$firstCompleted;
		final AtomicBoolean val$isAnyTaskComplete;

			
			{
				isAnyTaskComplete = atomicboolean;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
				firstCompleted = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Task$TaskCompletionSource val$firstCompleted>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
	}
));
	//   13   27:aload_0         
	//   14   28:invokeinterface #260 <Method Iterator Collection.iterator()>
	//   15   33:astore_0        
	//   16   34:aload_0         
	//   17   35:invokeinterface #229 <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            68
	//   19   43:aload_0         
	//   20   44:invokeinterface #233 <Method Object Iterator.next()>
	//   21   49:checkcast       #2   <Class Task>
	//   22   52:new             #25  <Class Task$4>
	//   23   55:dup             
	//   24   56:aload_2         
	//   25   57:aload_1         
	//   26   58:invokespecial   #285 <Method void Task$4(AtomicBoolean, Task$TaskCompletionSource)>
	//   27   61:invokevirtual   #267 <Method Task continueWith(Continuation)>
	//   28   64:pop             
	//*  29   65:goto            34
		return taskcompletionsource.getTask();
	//   30   68:aload_1         
	//   31   69:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//   32   72:areturn         
	}

	public Task cast()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Task continueWhile(Callable callable, Continuation continuation)
	{
		return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #293 <Method Task continueWhile(Callable, Continuation, Executor, CancellationToken)>
	//    6   10:areturn         
	}

	public Task continueWhile(Callable callable, Continuation continuation, CancellationToken cancellationtoken)
	{
		return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #293 <Method Task continueWhile(Callable, Continuation, Executor, CancellationToken)>
	//    6   10:areturn         
	}

	public Task continueWhile(Callable callable, Continuation continuation, Executor executor)
	{
		return continueWhile(callable, continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #293 <Method Task continueWhile(Callable, Continuation, Executor, CancellationToken)>
	//    6    8:areturn         
	}

	public Task continueWhile(final Callable predicate, final Continuation continuation, final Executor executor, final CancellationToken ct)
	{
		final Capture predicateContinuation = new Capture();
	//    0    0:new             #300 <Class Capture>
	//    1    3:dup             
	//    2    4:invokespecial   #301 <Method void Capture()>
	//    3    7:astore          5
		predicateContinuation.set(((Object) (new Continuation() {

			public Task then(Task task)
				throws Exception
			{
				if(ct != null && ct.isCancellationRequested())
			//*   0    0:aload_0         
			//*   1    1:getfield        #30  <Field CancellationToken val$ct>
			//*   2    4:ifnull          21
			//*   3    7:aload_0         
			//*   4    8:getfield        #30  <Field CancellationToken val$ct>
			//*   5   11:invokevirtual   #52  <Method boolean CancellationToken.isCancellationRequested()>
			//*   6   14:ifeq            21
					return Task.cancelled();
			//    7   17:invokestatic    #56  <Method Task Task.cancelled()>
			//    8   20:areturn         
				if(((Boolean)predicate.call()).booleanValue())
			//*   9   21:aload_0         
			//*  10   22:getfield        #32  <Field Callable val$predicate>
			//*  11   25:invokeinterface #62  <Method Object Callable.call()>
			//*  12   30:checkcast       #64  <Class Boolean>
			//*  13   33:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
			//*  14   36:ifeq            72
					return Task.forResult(((Object) (null))).onSuccessTask(continuation, executor).onSuccessTask((Continuation)predicateContinuation.get(), executor);
			//   15   39:aconst_null     
			//   16   40:invokestatic    #71  <Method Task Task.forResult(Object)>
			//   17   43:aload_0         
			//   18   44:getfield        #34  <Field Continuation val$continuation>
			//   19   47:aload_0         
			//   20   48:getfield        #36  <Field Executor val$executor>
			//   21   51:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
			//   22   54:aload_0         
			//   23   55:getfield        #38  <Field Capture val$predicateContinuation>
			//   24   58:invokevirtual   #80  <Method Object Capture.get()>
			//   25   61:checkcast       #7   <Class Continuation>
			//   26   64:aload_0         
			//   27   65:getfield        #36  <Field Executor val$executor>
			//   28   68:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
			//   29   71:areturn         
				else
					return Task.forResult(((Object) (null)));
			//   30   72:aconst_null     
			//   31   73:invokestatic    #71  <Method Task Task.forResult(Object)>
			//   32   76:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #86  <Method Task then(Task)>
			//    3    5:areturn         
			}

			final Task this$0;
			final Continuation val$continuation;
			final CancellationToken val$ct;
			final Executor val$executor;
			final Callable val$predicate;
			final Capture val$predicateContinuation;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field Task this$0>
				ct = cancellationtoken;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field CancellationToken val$ct>
				predicate = callable;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field Callable val$predicate>
				continuation = continuation1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Continuation val$continuation>
				executor = executor1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field Executor val$executor>
				predicateContinuation = capture;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #38  <Field Capture val$predicateContinuation>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #41  <Method void Object()>
			//   20   37:return          
			}
		}
)));
	//    4    9:aload           5
	//    5   11:new             #33  <Class Task$8>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload           4
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:aload           5
	//   13   23:invokespecial   #304 <Method void Task$8(Task, CancellationToken, Callable, Continuation, Executor, Capture)>
	//   14   26:invokevirtual   #307 <Method void Capture.set(Object)>
		return makeVoid().continueWithTask((Continuation)predicateContinuation.get(), executor);
	//   15   29:aload_0         
	//   16   30:invokevirtual   #310 <Method Task makeVoid()>
	//   17   33:aload           5
	//   18   35:invokevirtual   #313 <Method Object Capture.get()>
	//   19   38:checkcast       #235 <Class Continuation>
	//   20   41:aload_3         
	//   21   42:invokevirtual   #317 <Method Task continueWithTask(Continuation, Executor)>
	//   22   45:areturn         
	}

	public Task continueWith(Continuation continuation)
	{
		return continueWith(continuation, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #321 <Method Task continueWith(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWith(Continuation continuation, CancellationToken cancellationtoken)
	{
		return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #321 <Method Task continueWith(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWith(Continuation continuation, Executor executor)
	{
		return continueWith(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #321 <Method Task continueWith(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task continueWith(final Continuation continuation, final Executor executor, final CancellationToken ct)
	{
		final TaskCompletionSource tcs = create();
	//    0    0:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    1    3:astore          6
		Object obj = lock;
	//    2    5:aload_0         
	//    3    6:getfield        #84  <Field Object lock>
	//    4    9:astore          5
		obj;
	//    5   11:aload           5
		JVM INSTR monitorenter ;
	//    6   13:monitorenter    
		boolean flag = isCompleted();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #328 <Method boolean isCompleted()>
	//    9   18:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_48;
	//   10   20:iload           4
	//   11   22:ifne            48
		continuations.add(((Object) (new Continuation() {

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #45  <Method Void then(Task)>
			//    3    5:areturn         
			}

			public Void then(Task task)
			{
				Task.completeImmediately(tcs, continuation, task, executor, ct);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field Task$TaskCompletionSource val$tcs>
			//    2    4:aload_0         
			//    3    5:getfield        #30  <Field Continuation val$continuation>
			//    4    8:aload_1         
			//    5    9:aload_0         
			//    6   10:getfield        #32  <Field Executor val$executor>
			//    7   13:aload_0         
			//    8   14:getfield        #34  <Field CancellationToken val$ct>
			//    9   17:invokestatic    #50  <Method void Task.access$100(Task$TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
				return null;
			//   10   20:aconst_null     
			//   11   21:areturn         
			}

			final Task this$0;
			final Continuation val$continuation;
			final CancellationToken val$ct;
			final Executor val$executor;
			final TaskCompletionSource val$tcs;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Task this$0>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field Task$TaskCompletionSource val$tcs>
				continuation = continuation1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field Continuation val$continuation>
				executor = executor1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Executor val$executor>
				ct = cancellationtoken;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field CancellationToken val$ct>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
		}
)));
	//   12   25:aload_0         
	//   13   26:getfield        #89  <Field List continuations>
	//   14   29:new             #35  <Class Task$9>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:aload           6
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:invokespecial   #331 <Method void Task$9(Task, Task$TaskCompletionSource, Continuation, Executor, CancellationToken)>
	//   22   42:invokeinterface #335 <Method boolean List.add(Object)>
	//   23   47:pop             
		obj;
	//   24   48:aload           5
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		if(flag)
	//*  26   51:iload           4
	//*  27   53:ifeq            65
			completeImmediately(tcs, continuation, this, executor, ct);
	//   28   56:aload           6
	//   29   58:aload_1         
	//   30   59:aload_0         
	//   31   60:aload_2         
	//   32   61:aload_3         
	//   33   62:invokestatic    #94  <Method void completeImmediately(Task$TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return tcs.getTask();
	//   34   65:aload           6
	//   35   67:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//   36   70:areturn         
		continuation;
	//   37   71:astore_1        
		obj;
	//   38   72:aload           5
		JVM INSTR monitorexit ;
	//   39   74:monitorexit     
		throw continuation;
	//   40   75:aload_1         
	//   41   76:athrow          
	}

	public Task continueWithTask(Continuation continuation)
	{
		return continueWithTask(continuation, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #338 <Method Task continueWithTask(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWithTask(Continuation continuation, CancellationToken cancellationtoken)
	{
		return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #338 <Method Task continueWithTask(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWithTask(Continuation continuation, Executor executor)
	{
		return continueWithTask(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #338 <Method Task continueWithTask(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task continueWithTask(final Continuation continuation, final Executor executor, final CancellationToken ct)
	{
		final TaskCompletionSource tcs = create();
	//    0    0:invokestatic    #137 <Method Task$TaskCompletionSource create()>
	//    1    3:astore          6
		Object obj = lock;
	//    2    5:aload_0         
	//    3    6:getfield        #84  <Field Object lock>
	//    4    9:astore          5
		obj;
	//    5   11:aload           5
		JVM INSTR monitorenter ;
	//    6   13:monitorenter    
		boolean flag = isCompleted();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #328 <Method boolean isCompleted()>
	//    9   18:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_48;
	//   10   20:iload           4
	//   11   22:ifne            48
		continuations.add(((Object) (new Continuation() {

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #45  <Method Void then(Task)>
			//    3    5:areturn         
			}

			public Void then(Task task)
			{
				Task.completeAfterTask(tcs, continuation, task, executor, ct);
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field Task$TaskCompletionSource val$tcs>
			//    2    4:aload_0         
			//    3    5:getfield        #30  <Field Continuation val$continuation>
			//    4    8:aload_1         
			//    5    9:aload_0         
			//    6   10:getfield        #32  <Field Executor val$executor>
			//    7   13:aload_0         
			//    8   14:getfield        #34  <Field CancellationToken val$ct>
			//    9   17:invokestatic    #50  <Method void Task.access$200(Task$TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
				return null;
			//   10   20:aconst_null     
			//   11   21:areturn         
			}

			final Task this$0;
			final Continuation val$continuation;
			final CancellationToken val$ct;
			final Executor val$executor;
			final TaskCompletionSource val$tcs;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Task this$0>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field Task$TaskCompletionSource val$tcs>
				continuation = continuation1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field Continuation val$continuation>
				executor = executor1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field Executor val$executor>
				ct = cancellationtoken;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field CancellationToken val$ct>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
		}
)));
	//   12   25:aload_0         
	//   13   26:getfield        #89  <Field List continuations>
	//   14   29:new             #9   <Class Task$10>
	//   15   32:dup             
	//   16   33:aload_0         
	//   17   34:aload           6
	//   18   36:aload_1         
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:invokespecial   #342 <Method void Task$10(Task, Task$TaskCompletionSource, Continuation, Executor, CancellationToken)>
	//   22   42:invokeinterface #335 <Method boolean List.add(Object)>
	//   23   47:pop             
		obj;
	//   24   48:aload           5
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		if(flag)
	//*  26   51:iload           4
	//*  27   53:ifeq            65
			completeAfterTask(tcs, continuation, this, executor, ct);
	//   28   56:aload           6
	//   29   58:aload_1         
	//   30   59:aload_0         
	//   31   60:aload_2         
	//   32   61:aload_3         
	//   33   62:invokestatic    #98  <Method void completeAfterTask(Task$TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return tcs.getTask();
	//   34   65:aload           6
	//   35   67:invokevirtual   #150 <Method Task Task$TaskCompletionSource.getTask()>
	//   36   70:areturn         
		continuation;
	//   37   71:astore_1        
		obj;
	//   38   72:aload           5
		JVM INSTR monitorexit ;
	//   39   74:monitorexit     
		throw continuation;
	//   40   75:aload_1         
	//   41   76:athrow          
	}

	public Exception getError()
	{
		Exception exception;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			exception = error;
	//    5    7:aload_0         
	//    6    8:getfield        #122 <Field Exception error>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return exception;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception1;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception1;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public Object getResult()
	{
		Object obj1;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			obj1 = result;
	//    5    7:aload_0         
	//    6    8:getfield        #118 <Field Object result>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return obj1;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public boolean isCancelled()
	{
		boolean flag;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = cancelled;
	//    5    7:aload_0         
	//    6    8:getfield        #109 <Field boolean cancelled>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public boolean isCompleted()
	{
		boolean flag;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = complete;
	//    5    7:aload_0         
	//    6    8:getfield        #104 <Field boolean complete>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public boolean isFaulted()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(error != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #122 <Field Exception error>
	//*   7   11:ifnull          28
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:aload_2         
	//*  12   20:monitorexit     
	//*  13   21:iload_1         
	//*  14   22:ireturn         
	//*  15   23:astore_3        
	//*  16   24:aload_2         
	//*  17   25:monitorexit     
	//*  18   26:aload_3         
	//*  19   27:athrow          
			flag = false;
	//   20   28:iconst_0        
	//   21   29:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   30:goto            19
	}

	public Task makeVoid()
	{
		return continueWithTask(new Continuation() {

			public Task then(Task task)
				throws Exception
			{
				if(task.isCancelled())
			//*   0    0:aload_1         
			//*   1    1:invokevirtual   #30  <Method boolean Task.isCancelled()>
			//*   2    4:ifeq            11
					return Task.cancelled();
			//    3    7:invokestatic    #33  <Method Task Task.cancelled()>
			//    4   10:areturn         
				if(task.isFaulted())
			//*   5   11:aload_1         
			//*   6   12:invokevirtual   #36  <Method boolean Task.isFaulted()>
			//*   7   15:ifeq            26
					return Task.forError(task.getError());
			//    8   18:aload_1         
			//    9   19:invokevirtual   #40  <Method Exception Task.getError()>
			//   10   22:invokestatic    #44  <Method Task Task.forError(Exception)>
			//   11   25:areturn         
				else
					return Task.forResult(((Object) (null)));
			//   12   26:aconst_null     
			//   13   27:invokestatic    #48  <Method Task Task.forResult(Object)>
			//   14   30:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #54  <Method Task then(Task)>
			//    3    5:areturn         
			}

			final Task this$0;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Task this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #21  <Class Task$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #351 <Method void Task$2(Task)>
	//    5    9:invokevirtual   #353 <Method Task continueWithTask(Continuation)>
	//    6   12:areturn         
	}

	public Task onSuccess(Continuation continuation)
	{
		return onSuccess(continuation, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #356 <Method Task onSuccess(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task onSuccess(Continuation continuation, CancellationToken cancellationtoken)
	{
		return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #356 <Method Task onSuccess(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task onSuccess(Continuation continuation, Executor executor)
	{
		return onSuccess(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #356 <Method Task onSuccess(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task onSuccess(final Continuation continuation, Executor executor, final CancellationToken ct)
	{
		return continueWithTask(new Continuation() {

			public Task then(Task task)
			{
				if(ct != null && ct.isCancellationRequested())
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field CancellationToken val$ct>
			//*   2    4:ifnull          21
			//*   3    7:aload_0         
			//*   4    8:getfield        #24  <Field CancellationToken val$ct>
			//*   5   11:invokevirtual   #38  <Method boolean CancellationToken.isCancellationRequested()>
			//*   6   14:ifeq            21
					return Task.cancelled();
			//    7   17:invokestatic    #42  <Method Task Task.cancelled()>
			//    8   20:areturn         
				if(task.isFaulted())
			//*   9   21:aload_1         
			//*  10   22:invokevirtual   #45  <Method boolean Task.isFaulted()>
			//*  11   25:ifeq            36
					return Task.forError(task.getError());
			//   12   28:aload_1         
			//   13   29:invokevirtual   #49  <Method Exception Task.getError()>
			//   14   32:invokestatic    #53  <Method Task Task.forError(Exception)>
			//   15   35:areturn         
				if(task.isCancelled())
			//*  16   36:aload_1         
			//*  17   37:invokevirtual   #56  <Method boolean Task.isCancelled()>
			//*  18   40:ifeq            47
					return Task.cancelled();
			//   19   43:invokestatic    #42  <Method Task Task.cancelled()>
			//   20   46:areturn         
				else
					return task.continueWith(continuation);
			//   21   47:aload_1         
			//   22   48:aload_0         
			//   23   49:getfield        #26  <Field Continuation val$continuation>
			//   24   52:invokevirtual   #60  <Method Task Task.continueWith(Continuation)>
			//   25   55:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #67  <Method Task then(Task)>
			//    3    5:areturn         
			}

			final Task this$0;
			final Continuation val$continuation;
			final CancellationToken val$ct;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field Task this$0>
				ct = cancellationtoken;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field CancellationToken val$ct>
				continuation = continuation1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Continuation val$continuation>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
, executor);
	//    0    0:aload_0         
	//    1    1:new             #11  <Class Task$11>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokespecial   #359 <Method void Task$11(Task, CancellationToken, Continuation)>
	//    7   11:aload_2         
	//    8   12:invokevirtual   #317 <Method Task continueWithTask(Continuation, Executor)>
	//    9   15:areturn         
	}

	public Task onSuccessTask(Continuation continuation)
	{
		return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:invokevirtual   #362 <Method Task onSuccessTask(Continuation, Executor)>
	//    4    8:areturn         
	}

	public Task onSuccessTask(Continuation continuation, CancellationToken cancellationtoken)
	{
		return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #364 <Method Task onSuccessTask(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task onSuccessTask(Continuation continuation, Executor executor)
	{
		return onSuccessTask(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #364 <Method Task onSuccessTask(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task onSuccessTask(final Continuation continuation, Executor executor, final CancellationToken ct)
	{
		return continueWithTask(new Continuation() {

			public Task then(Task task)
			{
				if(ct != null && ct.isCancellationRequested())
			//*   0    0:aload_0         
			//*   1    1:getfield        #24  <Field CancellationToken val$ct>
			//*   2    4:ifnull          21
			//*   3    7:aload_0         
			//*   4    8:getfield        #24  <Field CancellationToken val$ct>
			//*   5   11:invokevirtual   #38  <Method boolean CancellationToken.isCancellationRequested()>
			//*   6   14:ifeq            21
					return Task.cancelled();
			//    7   17:invokestatic    #42  <Method Task Task.cancelled()>
			//    8   20:areturn         
				if(task.isFaulted())
			//*   9   21:aload_1         
			//*  10   22:invokevirtual   #45  <Method boolean Task.isFaulted()>
			//*  11   25:ifeq            36
					return Task.forError(task.getError());
			//   12   28:aload_1         
			//   13   29:invokevirtual   #49  <Method Exception Task.getError()>
			//   14   32:invokestatic    #53  <Method Task Task.forError(Exception)>
			//   15   35:areturn         
				if(task.isCancelled())
			//*  16   36:aload_1         
			//*  17   37:invokevirtual   #56  <Method boolean Task.isCancelled()>
			//*  18   40:ifeq            47
					return Task.cancelled();
			//   19   43:invokestatic    #42  <Method Task Task.cancelled()>
			//   20   46:areturn         
				else
					return task.continueWithTask(continuation);
			//   21   47:aload_1         
			//   22   48:aload_0         
			//   23   49:getfield        #26  <Field Continuation val$continuation>
			//   24   52:invokevirtual   #60  <Method Task Task.continueWithTask(Continuation)>
			//   25   55:areturn         
			}

			public volatile Object then(Task task)
				throws Exception
			{
				return ((Object) (then(task)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #67  <Method Task then(Task)>
			//    3    5:areturn         
			}

			final Task this$0;
			final Continuation val$continuation;
			final CancellationToken val$ct;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field Task this$0>
				ct = cancellationtoken;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field CancellationToken val$ct>
				continuation = continuation1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field Continuation val$continuation>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
, executor);
	//    0    0:aload_0         
	//    1    1:new             #13  <Class Task$12>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokespecial   #365 <Method void Task$12(Task, CancellationToken, Continuation)>
	//    7   11:aload_2         
	//    8   12:invokevirtual   #317 <Method Task continueWithTask(Continuation, Executor)>
	//    9   15:areturn         
	}

	public void waitForCompletion()
		throws InterruptedException
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(!isCompleted())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #328 <Method boolean isCompleted()>
	//*   7   11:ifne            21
				lock.wait();
	//    8   14:aload_0         
	//    9   15:getfield        #84  <Field Object lock>
	//   10   18:invokevirtual   #371 <Method void Object.wait()>
		}
	//   11   21:aload_1         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		exception;
	//   14   24:astore_2        
		obj;
	//   15   25:aload_1         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw exception;
	//   17   27:aload_2         
	//   18   28:athrow          
	}

	public static final ExecutorService BACKGROUND_EXECUTOR = BoltsExecutors.background();
	private static final Executor IMMEDIATE_EXECUTOR = BoltsExecutors.immediate();
	public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.uiThread();
	private boolean cancelled;
	private boolean complete;
	private List continuations;
	private Exception error;
	private final Object lock = new Object();
	private Object result;

	static 
	{
	//    0    0:invokestatic    #63  <Method ExecutorService BoltsExecutors.background()>
	//    1    3:putstatic       #65  <Field ExecutorService BACKGROUND_EXECUTOR>
	//    2    6:invokestatic    #69  <Method Executor BoltsExecutors.immediate()>
	//    3    9:putstatic       #71  <Field Executor IMMEDIATE_EXECUTOR>
	//    4   12:invokestatic    #76  <Method Executor AndroidExecutors.uiThread()>
	//    5   15:putstatic       #78  <Field Executor UI_THREAD_EXECUTOR>
	//*   6   18:return          
	}


/*
	static void access$100(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		completeImmediately(taskcompletionsource, continuation, task, executor, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #94  <Method void completeImmediately(Task$TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return;
	//    6    9:return          
	}

*/


/*
	static void access$200(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		completeAfterTask(taskcompletionsource, continuation, task, executor, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #98  <Method void completeAfterTask(Task$TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return;
	//    6    9:return          
	}

*/


/*
	static Object access$300(Task task)
	{
		return task.lock;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Object lock>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$400(Task task)
	{
		return task.complete;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field boolean complete>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$402(Task task, boolean flag)
	{
		task.complete = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #104 <Field boolean complete>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static boolean access$502(Task task, boolean flag)
	{
		task.cancelled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean cancelled>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$600(Task task)
	{
		task.runContinuations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #114 <Method void runContinuations()>
		return;
	//    2    4:return          
	}

*/


/*
	static Object access$702(Task task, Object obj)
	{
		task.result = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field Object result>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Exception access$802(Task task, Exception exception)
	{
		task.error = exception;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field Exception error>
		return exception;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
