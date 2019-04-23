// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package bolts:
//			BoltsExecutors, AndroidExecutors, TaskCompletionSource, ExecutorException, 
//			CancellationToken, Continuation, Capture, UnobservedErrorNotifier, 
//			UnobservedTaskException, AggregateException

public class Task
{
	public class TaskCompletionSource extends bolts.TaskCompletionSource
	{

		final Task this$0;

		TaskCompletionSource()
		{
			this$0 = Task.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field Task this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void TaskCompletionSource()>
		//    5    9:return          
		}
	}

	public static interface UnobservedExceptionHandler
	{

		public abstract void unobservedException(Task task, UnobservedTaskException unobservedtaskexception);
	}


	Task()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #119 <Method void Object()>
	//    6   12:putfield        #121 <Field Object lock>
		continuations = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #123 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #124 <Method void ArrayList()>
	//   11   23:putfield        #126 <Field List continuations>
	//   12   26:return          
	}

	private Task(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #119 <Method void Object()>
	//    6   12:putfield        #121 <Field Object lock>
		continuations = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #123 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #124 <Method void ArrayList()>
	//   11   23:putfield        #126 <Field List continuations>
		trySetResult(obj);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #130 <Method boolean trySetResult(Object)>
	//   15   31:pop             
	//   16   32:return          
	}

	private Task(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #119 <Method void Object()>
	//    6   12:putfield        #121 <Field Object lock>
		continuations = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #123 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #124 <Method void ArrayList()>
	//   11   23:putfield        #126 <Field List continuations>
		if(flag)
	//*  12   26:iload_1         
	//*  13   27:ifeq            36
		{
			trySetCancelled();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #136 <Method boolean trySetCancelled()>
	//   16   34:pop             
			return;
	//   17   35:return          
		} else
		{
			trySetResult(((Object) (null)));
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:invokevirtual   #130 <Method boolean trySetResult(Object)>
	//   21   41:pop             
			return;
	//   22   42:return          
		}
	}

	public static Task call(Callable callable)
	{
		return call(callable, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #150 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task call(Callable callable, CancellationToken cancellationtoken)
	{
		return call(callable, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    2    4:aload_1         
	//    3    5:invokestatic    #150 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task call(Callable callable, Executor executor)
	{
		return call(callable, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #150 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    6:areturn         
	}

	public static Task call(Callable callable, Executor executor, CancellationToken cancellationtoken)
	{
		bolts.TaskCompletionSource taskcompletionsource = new bolts.TaskCompletionSource();
	//    0    0:new             #159 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void TaskCompletionSource()>
	//    3    7:astore_3        
		try
		{
			executor.execute(new Runnable(cancellationtoken, taskcompletionsource, callable) {

				public void run()
				{
					CancellationException cancellationexception;
					CancellationToken cancellationtoken1 = ct;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field CancellationToken val$ct>
				//    2    4:astore_1        
					if(cancellationtoken1 != null && cancellationtoken1.isCancellationRequested())
				//*   3    5:aload_1         
				//*   4    6:ifnull          24
				//*   5    9:aload_1         
				//*   6   10:invokevirtual   #40  <Method boolean CancellationToken.isCancellationRequested()>
				//*   7   13:ifeq            24
					{
						tcs.setCancelled();
				//    8   16:aload_0         
				//    9   17:getfield        #23  <Field TaskCompletionSource val$tcs>
				//   10   20:invokevirtual   #45  <Method void TaskCompletionSource.setCancelled()>
						return;
				//   11   23:return          
					}
					try
					{
						tcs.setResult(callable.call());
				//   12   24:aload_0         
				//   13   25:getfield        #23  <Field TaskCompletionSource val$tcs>
				//   14   28:aload_0         
				//   15   29:getfield        #25  <Field Callable val$callable>
				//   16   32:invokeinterface #50  <Method Object Callable.call()>
				//   17   37:invokevirtual   #54  <Method void TaskCompletionSource.setResult(Object)>
						return;
				//   18   40:return          
					}
				//*  19   41:astore_1        
				//*  20   42:aload_0         
				//*  21   43:getfield        #23  <Field TaskCompletionSource val$tcs>
				//*  22   46:aload_1         
				//*  23   47:invokevirtual   #58  <Method void TaskCompletionSource.setError(Exception)>
				//*  24   50:return          
				//*  25   51:aload_0         
				//*  26   52:getfield        #23  <Field TaskCompletionSource val$tcs>
				//*  27   55:invokevirtual   #45  <Method void TaskCompletionSource.setCancelled()>
				//*  28   58:return          
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
				//*  29   59:astore_1        
				//*  30   60:goto            51
				}

				final Callable val$callable;
				final CancellationToken val$ct;
				final bolts.TaskCompletionSource val$tcs;

			
			{
				ct = cancellationtoken;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CancellationToken val$ct>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field TaskCompletionSource val$tcs>
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
	//    4    8:aload_1         
	//    5    9:new             #27  <Class Task$4>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:aload_0         
	//   10   16:invokespecial   #163 <Method void Task$4(CancellationToken, TaskCompletionSource, Callable)>
	//   11   19:invokeinterface #169 <Method void Executor.execute(Runnable)>
		}
	//*  12   24:goto            40
		// Misplaced declaration of an exception variable
		catch(Callable callable)
	//*  13   27:astore_0        
		{
			taskcompletionsource.setError(((Exception) (new ExecutorException(((Exception) (callable))))));
	//   14   28:aload_3         
	//   15   29:new             #171 <Class ExecutorException>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:invokespecial   #174 <Method void ExecutorException(Exception)>
	//   19   37:invokevirtual   #177 <Method void TaskCompletionSource.setError(Exception)>
		}
		return taskcompletionsource.getTask();
	//   20   40:aload_3         
	//   21   41:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   22   44:areturn         
	}

	public static Task callInBackground(Callable callable)
	{
		return call(callable, ((Executor) (BACKGROUND_EXECUTOR)), ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #82  <Field ExecutorService BACKGROUND_EXECUTOR>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #150 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task callInBackground(Callable callable, CancellationToken cancellationtoken)
	{
		return call(callable, ((Executor) (BACKGROUND_EXECUTOR)), cancellationtoken);
	//    0    0:aload_0         
	//    1    1:getstatic       #82  <Field ExecutorService BACKGROUND_EXECUTOR>
	//    2    4:aload_1         
	//    3    5:invokestatic    #150 <Method Task call(Callable, Executor, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task cancelled()
	{
		return TASK_CANCELLED;
	//    0    0:getstatic       #116 <Field Task TASK_CANCELLED>
	//    1    3:areturn         
	}

	private static void completeAfterTask(bolts.TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		try
		{
			executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

				public void run()
				{
					CancellationToken cancellationtoken1 = ct;
				//    0    0:aload_0         
				//    1    1:getfield        #25  <Field CancellationToken val$ct>
				//    2    4:astore_1        
					if(cancellationtoken1 != null && cancellationtoken1.isCancellationRequested())
				//*   3    5:aload_1         
				//*   4    6:ifnull          24
				//*   5    9:aload_1         
				//*   6   10:invokevirtual   #46  <Method boolean CancellationToken.isCancellationRequested()>
				//*   7   13:ifeq            24
					{
						tcs.setCancelled();
				//    8   16:aload_0         
				//    9   17:getfield        #27  <Field TaskCompletionSource val$tcs>
				//   10   20:invokevirtual   #51  <Method void TaskCompletionSource.setCancelled()>
						return;
				//   11   23:return          
					}
					Task task1 = (Task)continuation.then(task);
				//   12   24:aload_0         
				//   13   25:getfield        #29  <Field Continuation val$continuation>
				//   14   28:aload_0         
				//   15   29:getfield        #31  <Field Task val$task>
				//   16   32:invokeinterface #57  <Method Object Continuation.then(Task)>
				//   17   37:checkcast       #8   <Class Task>
				//   18   40:astore_1        
					if(task1 == null)
				//*  19   41:aload_1         
				//*  20   42:ifnonnull       54
					{
						try
						{
							tcs.setResult(((Object) (null)));
				//   21   45:aload_0         
				//   22   46:getfield        #27  <Field TaskCompletionSource val$tcs>
				//   23   49:aconst_null     
				//   24   50:invokevirtual   #61  <Method void TaskCompletionSource.setResult(Object)>
							return;
				//   25   53:return          
						}
				//*  26   54:aload_1         
				//*  27   55:new             #13  <Class Task$15$1>
				//*  28   58:dup             
				//*  29   59:aload_0         
				//*  30   60:invokespecial   #64  <Method void Task$15$1(Task$15)>
				//*  31   63:invokevirtual   #68  <Method Task Task.continueWith(Continuation)>
				//*  32   66:pop             
				//*  33   67:return          
				//*  34   68:astore_1        
				//*  35   69:aload_0         
				//*  36   70:getfield        #27  <Field TaskCompletionSource val$tcs>
				//*  37   73:aload_1         
				//*  38   74:invokevirtual   #72  <Method void TaskCompletionSource.setError(Exception)>
				//*  39   77:return          
				//*  40   78:aload_0         
				//*  41   79:getfield        #27  <Field TaskCompletionSource val$tcs>
				//*  42   82:invokevirtual   #51  <Method void TaskCompletionSource.setCancelled()>
				//*  43   85:return          
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
						break MISSING_BLOCK_LABEL_85;
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
						//*   1    1:getfield        #18  <Field Task$15 this$0>
						//*   2    4:getfield        #33  <Field CancellationToken Task$15.val$ct>
						//*   3    7:ifnull          35
						//*   4   10:aload_0         
						//*   5   11:getfield        #18  <Field Task$15 this$0>
						//*   6   14:getfield        #33  <Field CancellationToken Task$15.val$ct>
						//*   7   17:invokevirtual   #39  <Method boolean CancellationToken.isCancellationRequested()>
						//*   8   20:ifeq            35
							{
								tcs.setCancelled();
						//    9   23:aload_0         
						//   10   24:getfield        #18  <Field Task$15 this$0>
						//   11   27:getfield        #43  <Field TaskCompletionSource Task$15.val$tcs>
						//   12   30:invokevirtual   #48  <Method void TaskCompletionSource.setCancelled()>
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
						//   19   43:getfield        #18  <Field Task$15 this$0>
						//   20   46:getfield        #43  <Field TaskCompletionSource Task$15.val$tcs>
						//   21   49:invokevirtual   #48  <Method void TaskCompletionSource.setCancelled()>
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
						//   28   62:getfield        #18  <Field Task$15 this$0>
						//   29   65:getfield        #43  <Field TaskCompletionSource Task$15.val$tcs>
						//   30   68:aload_1         
						//   31   69:invokevirtual   #60  <Method Exception Task.getError()>
						//   32   72:invokevirtual   #64  <Method void TaskCompletionSource.setError(Exception)>
								return null;
						//   33   75:aconst_null     
						//   34   76:areturn         
							} else
							{
								tcs.setResult(task.getResult());
						//   35   77:aload_0         
						//   36   78:getfield        #18  <Field Task$15 this$0>
						//   37   81:getfield        #43  <Field TaskCompletionSource Task$15.val$tcs>
						//   38   84:aload_1         
						//   39   85:invokevirtual   #68  <Method Object Task.getResult()>
						//   40   88:invokevirtual   #72  <Method void TaskCompletionSource.setResult(Object)>
								return null;
						//   41   91:aconst_null     
						//   42   92:areturn         
							}
						}

						final _cls15 this$0;

			
			{
				this$0 = _cls15.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Task$15 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
					return;
					CancellationException cancellationexception;
				//*  44   86:astore_1        
				//*  45   87:goto            78
				}

				final Continuation val$continuation;
				final CancellationToken val$ct;
				final Task val$task;
				final bolts.TaskCompletionSource val$tcs;

			
			{
				ct = cancellationtoken;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field CancellationToken val$ct>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field TaskCompletionSource val$tcs>
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
	//    1    1:new             #19  <Class Task$15>
	//    2    4:dup             
	//    3    5:aload           4
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #187 <Method void Task$15(CancellationToken, TaskCompletionSource, Continuation, Task)>
	//    8   13:invokeinterface #169 <Method void Executor.execute(Runnable)>
			return;
	//    9   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(Continuation continuation)
	//*  10   19:astore_1        
		{
			taskcompletionsource.setError(((Exception) (new ExecutorException(((Exception) (continuation))))));
	//   11   20:aload_0         
	//   12   21:new             #171 <Class ExecutorException>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:invokespecial   #174 <Method void ExecutorException(Exception)>
	//   16   29:invokevirtual   #177 <Method void TaskCompletionSource.setError(Exception)>
		}
	//   17   32:return          
	}

	private static void completeImmediately(bolts.TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		try
		{
			executor.execute(new Runnable(cancellationtoken, taskcompletionsource, continuation, task) {

				public void run()
				{
					CancellationException cancellationexception;
					CancellationToken cancellationtoken1 = ct;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field CancellationToken val$ct>
				//    2    4:astore_1        
					if(cancellationtoken1 != null && cancellationtoken1.isCancellationRequested())
				//*   3    5:aload_1         
				//*   4    6:ifnull          24
				//*   5    9:aload_1         
				//*   6   10:invokevirtual   #44  <Method boolean CancellationToken.isCancellationRequested()>
				//*   7   13:ifeq            24
					{
						tcs.setCancelled();
				//    8   16:aload_0         
				//    9   17:getfield        #25  <Field TaskCompletionSource val$tcs>
				//   10   20:invokevirtual   #49  <Method void TaskCompletionSource.setCancelled()>
						return;
				//   11   23:return          
					}
					try
					{
						Object obj = continuation.then(task);
				//   12   24:aload_0         
				//   13   25:getfield        #27  <Field Continuation val$continuation>
				//   14   28:aload_0         
				//   15   29:getfield        #29  <Field Task val$task>
				//   16   32:invokeinterface #55  <Method Object Continuation.then(Task)>
				//   17   37:astore_1        
						tcs.setResult(obj);
				//   18   38:aload_0         
				//   19   39:getfield        #25  <Field TaskCompletionSource val$tcs>
				//   20   42:aload_1         
				//   21   43:invokevirtual   #59  <Method void TaskCompletionSource.setResult(Object)>
						return;
				//   22   46:return          
					}
				//*  23   47:astore_1        
				//*  24   48:aload_0         
				//*  25   49:getfield        #25  <Field TaskCompletionSource val$tcs>
				//*  26   52:aload_1         
				//*  27   53:invokevirtual   #63  <Method void TaskCompletionSource.setError(Exception)>
				//*  28   56:return          
				//*  29   57:aload_0         
				//*  30   58:getfield        #25  <Field TaskCompletionSource val$tcs>
				//*  31   61:invokevirtual   #49  <Method void TaskCompletionSource.setCancelled()>
				//*  32   64:return          
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
				//*  33   65:astore_1        
				//*  34   66:goto            57
				}

				final Continuation val$continuation;
				final CancellationToken val$ct;
				final Task val$task;
				final bolts.TaskCompletionSource val$tcs;

			
			{
				ct = cancellationtoken;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CancellationToken val$ct>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field TaskCompletionSource val$tcs>
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
	//    1    1:new             #17  <Class Task$14>
	//    2    4:dup             
	//    3    5:aload           4
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokespecial   #189 <Method void Task$14(CancellationToken, TaskCompletionSource, Continuation, Task)>
	//    8   13:invokeinterface #169 <Method void Executor.execute(Runnable)>
			return;
	//    9   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(Continuation continuation)
	//*  10   19:astore_1        
		{
			taskcompletionsource.setError(((Exception) (new ExecutorException(((Exception) (continuation))))));
	//   11   20:aload_0         
	//   12   21:new             #171 <Class ExecutorException>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:invokespecial   #174 <Method void ExecutorException(Exception)>
	//   16   29:invokevirtual   #177 <Method void TaskCompletionSource.setError(Exception)>
		}
	//   17   32:return          
	}

	public static TaskCompletionSource create()
	{
		Task task = new Task();
	//    0    0:new             #2   <Class Task>
	//    1    3:dup             
	//    2    4:invokespecial   #193 <Method void Task()>
	//    3    7:astore_0        
		((Object) (task)).getClass();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #197 <Method Class Object.getClass()>
	//    6   12:pop             
		return ((TaskCompletionSource) (task)). new TaskCompletionSource();
	//    7   13:new             #39  <Class Task$TaskCompletionSource>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #200 <Method void Task$TaskCompletionSource(Task)>
	//   11   21:areturn         
	}

	public static Task delay(long l)
	{
		return delay(l, BoltsExecutors.scheduled(), ((CancellationToken) (null)));
	//    0    0:lload_0         
	//    1    1:invokestatic    #207 <Method ScheduledExecutorService BoltsExecutors.scheduled()>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #210 <Method Task delay(long, ScheduledExecutorService, CancellationToken)>
	//    4    8:areturn         
	}

	public static Task delay(long l, CancellationToken cancellationtoken)
	{
		return delay(l, BoltsExecutors.scheduled(), cancellationtoken);
	//    0    0:lload_0         
	//    1    1:invokestatic    #207 <Method ScheduledExecutorService BoltsExecutors.scheduled()>
	//    2    4:aload_2         
	//    3    5:invokestatic    #210 <Method Task delay(long, ScheduledExecutorService, CancellationToken)>
	//    4    8:areturn         
	}

	static Task delay(long l, ScheduledExecutorService scheduledexecutorservice, CancellationToken cancellationtoken)
	{
		if(cancellationtoken != null && cancellationtoken.isCancellationRequested())
	//*   0    0:aload_3         
	//*   1    1:ifnull          15
	//*   2    4:aload_3         
	//*   3    5:invokevirtual   #218 <Method boolean CancellationToken.isCancellationRequested()>
	//*   4    8:ifeq            15
			return cancelled();
	//    5   11:invokestatic    #220 <Method Task cancelled()>
	//    6   14:areturn         
		if(l <= 0L)
	//*   7   15:lload_0         
	//*   8   16:lconst_0        
	//*   9   17:lcmp            
	//*  10   18:ifgt            26
			return forResult(((Object) (null)));
	//   11   21:aconst_null     
	//   12   22:invokestatic    #224 <Method Task forResult(Object)>
	//   13   25:areturn         
		bolts.TaskCompletionSource taskcompletionsource = new bolts.TaskCompletionSource();
	//   14   26:new             #159 <Class TaskCompletionSource>
	//   15   29:dup             
	//   16   30:invokespecial   #160 <Method void TaskCompletionSource()>
	//   17   33:astore          4
		scheduledexecutorservice = ((ScheduledExecutorService) (scheduledexecutorservice.schedule(new Runnable(taskcompletionsource) {

			public void run()
			{
				tcs.trySetResult(((Object) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field TaskCompletionSource val$tcs>
			//    2    4:aconst_null     
			//    3    5:invokevirtual   #28  <Method boolean TaskCompletionSource.trySetResult(Object)>
			//    4    8:pop             
			//    5    9:return          
			}

			final bolts.TaskCompletionSource val$tcs;

			
			{
				tcs = taskcompletionsource;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TaskCompletionSource val$tcs>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, l, TimeUnit.MILLISECONDS)));
	//   18   35:aload_2         
	//   19   36:new             #7   <Class Task$1>
	//   20   39:dup             
	//   21   40:aload           4
	//   22   42:invokespecial   #227 <Method void Task$1(TaskCompletionSource)>
	//   23   45:lload_0         
	//   24   46:getstatic       #233 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   25   49:invokeinterface #239 <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   26   54:astore_2        
		if(cancellationtoken != null)
	//*  27   55:aload_3         
	//*  28   56:ifnull          74
			cancellationtoken.register(new Runnable(((ScheduledFuture) (scheduledexecutorservice)), taskcompletionsource) {

				public void run()
				{
					scheduled.cancel(true);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ScheduledFuture val$scheduled>
				//    2    4:iconst_1        
				//    3    5:invokeinterface #32  <Method boolean ScheduledFuture.cancel(boolean)>
				//    4   10:pop             
					tcs.trySetCancelled();
				//    5   11:aload_0         
				//    6   12:getfield        #21  <Field TaskCompletionSource val$tcs>
				//    7   15:invokevirtual   #38  <Method boolean TaskCompletionSource.trySetCancelled()>
				//    8   18:pop             
				//    9   19:return          
				}

				final ScheduledFuture val$scheduled;
				final bolts.TaskCompletionSource val$tcs;

			
			{
				scheduled = scheduledfuture;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ScheduledFuture val$scheduled>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field TaskCompletionSource val$tcs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   29   59:aload_3         
	//   30   60:new             #23  <Class Task$2>
	//   31   63:dup             
	//   32   64:aload_2         
	//   33   65:aload           4
	//   34   67:invokespecial   #242 <Method void Task$2(ScheduledFuture, TaskCompletionSource)>
	//   35   70:invokevirtual   #246 <Method CancellationTokenRegistration CancellationToken.register(Runnable)>
	//   36   73:pop             
		return taskcompletionsource.getTask();
	//   37   74:aload           4
	//   38   76:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   39   79:areturn         
	}

	public static Task forError(Exception exception)
	{
		bolts.TaskCompletionSource taskcompletionsource = new bolts.TaskCompletionSource();
	//    0    0:new             #159 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void TaskCompletionSource()>
	//    3    7:astore_1        
		taskcompletionsource.setError(exception);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #177 <Method void TaskCompletionSource.setError(Exception)>
		return taskcompletionsource.getTask();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//    9   17:areturn         
	}

	public static Task forResult(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return TASK_NULL;
	//    2    4:getstatic       #101 <Field Task TASK_NULL>
	//    3    7:areturn         
		if(obj instanceof Boolean)
	//*   4    8:aload_0         
	//*   5    9:instanceof      #103 <Class Boolean>
	//*   6   12:ifeq            33
		{
			if(((Boolean)obj).booleanValue())
	//*   7   15:aload_0         
	//*   8   16:checkcast       #103 <Class Boolean>
	//*   9   19:invokevirtual   #253 <Method boolean Boolean.booleanValue()>
	//*  10   22:ifeq            29
				return TASK_TRUE;
	//   11   25:getstatic       #109 <Field Task TASK_TRUE>
	//   12   28:areturn         
			else
				return TASK_FALSE;
	//   13   29:getstatic       #111 <Field Task TASK_FALSE>
	//   14   32:areturn         
		} else
		{
			bolts.TaskCompletionSource taskcompletionsource = new bolts.TaskCompletionSource();
	//   15   33:new             #159 <Class TaskCompletionSource>
	//   16   36:dup             
	//   17   37:invokespecial   #160 <Method void TaskCompletionSource()>
	//   18   40:astore_1        
			taskcompletionsource.setResult(obj);
	//   19   41:aload_1         
	//   20   42:aload_0         
	//   21   43:invokevirtual   #256 <Method void TaskCompletionSource.setResult(Object)>
			return taskcompletionsource.getTask();
	//   22   46:aload_1         
	//   23   47:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   24   50:areturn         
		}
	}

	public static UnobservedExceptionHandler getUnobservedExceptionHandler()
	{
		return unobservedExceptionHandler;
	//    0    0:getstatic       #261 <Field Task$UnobservedExceptionHandler unobservedExceptionHandler>
	//    1    3:areturn         
	}

	private void runContinuations()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Object lock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = continuations.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #126 <Field List continuations>
	//    7   11:invokeinterface #270 <Method Iterator List.iterator()>
	//    8   16:astore_2        
_L1:
		Continuation continuation;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_60;
	//    9   17:aload_2         
	//   10   18:invokeinterface #275 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            60
		continuation = (Continuation)iterator.next();
	//   12   26:aload_2         
	//   13   27:invokeinterface #279 <Method Object Iterator.next()>
	//   14   32:checkcast       #281 <Class Continuation>
	//   15   35:astore_3        
		continuation.then(this);
	//   16   36:aload_3         
	//   17   37:aload_0         
	//   18   38:invokeinterface #285 <Method Object Continuation.then(Task)>
	//   19   43:pop             
		  goto _L1
	//*  20   44:goto            17
		Object obj1;
		obj1;
	//   21   47:astore_2        
		throw new RuntimeException(((Throwable) (obj1)));
	//   22   48:new             #264 <Class RuntimeException>
	//   23   51:dup             
	//   24   52:aload_2         
	//   25   53:invokespecial   #288 <Method void RuntimeException(Throwable)>
	//   26   56:athrow          
		obj1;
	//   27   57:astore_2        
		throw obj1;
	//   28   58:aload_2         
	//   29   59:athrow          
		continuations = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #126 <Field List continuations>
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

	public static void setUnobservedExceptionHandler(UnobservedExceptionHandler unobservedexceptionhandler)
	{
		unobservedExceptionHandler = unobservedexceptionhandler;
	//    0    0:aload_0         
	//    1    1:putstatic       #261 <Field Task$UnobservedExceptionHandler unobservedExceptionHandler>
	//    2    4:return          
	}

	public static Task whenAll(Collection collection)
	{
		if(collection.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #298 <Method int Collection.size()>
	//*   2    6:ifne            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #224 <Method Task forResult(Object)>
	//    5   13:areturn         
		bolts.TaskCompletionSource taskcompletionsource = new bolts.TaskCompletionSource();
	//    6   14:new             #159 <Class TaskCompletionSource>
	//    7   17:dup             
	//    8   18:invokespecial   #160 <Method void TaskCompletionSource()>
	//    9   21:astore_1        
		ArrayList arraylist = new ArrayList();
	//   10   22:new             #123 <Class ArrayList>
	//   11   25:dup             
	//   12   26:invokespecial   #124 <Method void ArrayList()>
	//   13   29:astore_2        
		Object obj = new Object();
	//   14   30:new             #5   <Class Object>
	//   15   33:dup             
	//   16   34:invokespecial   #119 <Method void Object()>
	//   17   37:astore_3        
		AtomicInteger atomicinteger = new AtomicInteger(collection.size());
	//   18   38:new             #300 <Class AtomicInteger>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:invokeinterface #298 <Method int Collection.size()>
	//   22   48:invokespecial   #303 <Method void AtomicInteger(int)>
	//   23   51:astore          4
		AtomicBoolean atomicboolean = new AtomicBoolean(false);
	//   24   53:new             #305 <Class AtomicBoolean>
	//   25   56:dup             
	//   26   57:iconst_0        
	//   27   58:invokespecial   #306 <Method void AtomicBoolean(boolean)>
	//   28   61:astore          5
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
		//   43   83:getfield        #34  <Field TaskCompletionSource val$allFinished>
		//   44   86:aload_0         
		//   45   87:getfield        #28  <Field ArrayList val$causes>
		//   46   90:iconst_0        
		//   47   91:invokevirtual   #82  <Method Object ArrayList.get(int)>
		//   48   94:checkcast       #42  <Class Exception>
		//   49   97:invokevirtual   #88  <Method void TaskCompletionSource.setError(Exception)>
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
		//   70  137:getfield        #34  <Field TaskCompletionSource val$allFinished>
		//   71  140:aload_1         
		//   72  141:invokevirtual   #88  <Method void TaskCompletionSource.setError(Exception)>
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
		//   80  157:getfield        #34  <Field TaskCompletionSource val$allFinished>
		//   81  160:invokevirtual   #112 <Method void TaskCompletionSource.setCancelled()>
					return null;
		//   82  163:aconst_null     
		//   83  164:areturn         
				}
				allFinished.setResult(((Object) (null)));
		//   84  165:aload_0         
		//   85  166:getfield        #34  <Field TaskCompletionSource val$allFinished>
		//   86  169:aconst_null     
		//   87  170:invokevirtual   #116 <Method void TaskCompletionSource.setResult(Object)>
			}
			return null;
		//   88  173:aconst_null     
		//   89  174:areturn         
		}

		final bolts.TaskCompletionSource val$allFinished;
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
			//   14   24:putfield        #34  <Field TaskCompletionSource val$allFinished>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #37  <Method void Object()>
			//   17   31:return          
			}
	}
));
	//   29   63:aload_0         
	//   30   64:invokeinterface #307 <Method Iterator Collection.iterator()>
	//   31   69:astore_0        
	//   32   70:aload_0         
	//   33   71:invokeinterface #275 <Method boolean Iterator.hasNext()>
	//   34   76:ifeq            109
	//   35   79:aload_0         
	//   36   80:invokeinterface #279 <Method Object Iterator.next()>
	//   37   85:checkcast       #2   <Class Task>
	//   38   88:new             #35  <Class Task$8>
	//   39   91:dup             
	//   40   92:aload_3         
	//   41   93:aload_2         
	//   42   94:aload           5
	//   43   96:aload           4
	//   44   98:aload_1         
	//   45   99:invokespecial   #310 <Method void Task$8(Object, ArrayList, AtomicBoolean, AtomicInteger, TaskCompletionSource)>
	//   46  102:invokevirtual   #314 <Method Task continueWith(Continuation)>
	//   47  105:pop             
	//*  48  106:goto            70
		return taskcompletionsource.getTask();
	//   49  109:aload_1         
	//   50  110:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   51  113:areturn         
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
	//    1    1:invokestatic    #318 <Method Task whenAll(Collection)>
	//    2    4:new             #33  <Class Task$7>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #321 <Method void Task$7(Collection)>
	//    6   12:invokevirtual   #324 <Method Task onSuccess(Continuation)>
	//    7   15:areturn         
	}

	public static Task whenAny(Collection collection)
	{
		if(collection.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #298 <Method int Collection.size()>
	//*   2    6:ifne            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #224 <Method Task forResult(Object)>
	//    5   13:areturn         
		bolts.TaskCompletionSource taskcompletionsource = new bolts.TaskCompletionSource();
	//    6   14:new             #159 <Class TaskCompletionSource>
	//    7   17:dup             
	//    8   18:invokespecial   #160 <Method void TaskCompletionSource()>
	//    9   21:astore_1        
		AtomicBoolean atomicboolean = new AtomicBoolean(false);
	//   10   22:new             #305 <Class AtomicBoolean>
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:invokespecial   #306 <Method void AtomicBoolean(boolean)>
	//   14   30:astore_2        
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
		//*   5    9:ifeq            23
				firstCompleted.setResult(((Object) (task)));
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field TaskCompletionSource val$firstCompleted>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #46  <Method void TaskCompletionSource.setResult(Object)>
			else
		//*  10   20:goto            28
				task.getError();
		//   11   23:aload_1         
		//   12   24:invokevirtual   #50  <Method Exception Task.getError()>
		//   13   27:pop             
			return null;
		//   14   28:aconst_null     
		//   15   29:areturn         
		}

		final bolts.TaskCompletionSource val$firstCompleted;
		final AtomicBoolean val$isAnyTaskComplete;

			
			{
				isAnyTaskComplete = atomicboolean;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
				firstCompleted = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field TaskCompletionSource val$firstCompleted>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
	}
));
	//   15   31:aload_0         
	//   16   32:invokeinterface #307 <Method Iterator Collection.iterator()>
	//   17   37:astore_0        
	//   18   38:aload_0         
	//   19   39:invokeinterface #275 <Method boolean Iterator.hasNext()>
	//   20   44:ifeq            72
	//   21   47:aload_0         
	//   22   48:invokeinterface #279 <Method Object Iterator.next()>
	//   23   53:checkcast       #2   <Class Task>
	//   24   56:new             #31  <Class Task$6>
	//   25   59:dup             
	//   26   60:aload_2         
	//   27   61:aload_1         
	//   28   62:invokespecial   #329 <Method void Task$6(AtomicBoolean, TaskCompletionSource)>
	//   29   65:invokevirtual   #314 <Method Task continueWith(Continuation)>
	//   30   68:pop             
	//*  31   69:goto            38
		return taskcompletionsource.getTask();
	//   32   72:aload_1         
	//   33   73:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   34   76:areturn         
	}

	public static Task whenAnyResult(Collection collection)
	{
		if(collection.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #298 <Method int Collection.size()>
	//*   2    6:ifne            14
			return forResult(((Object) (null)));
	//    3    9:aconst_null     
	//    4   10:invokestatic    #224 <Method Task forResult(Object)>
	//    5   13:areturn         
		bolts.TaskCompletionSource taskcompletionsource = new bolts.TaskCompletionSource();
	//    6   14:new             #159 <Class TaskCompletionSource>
	//    7   17:dup             
	//    8   18:invokespecial   #160 <Method void TaskCompletionSource()>
	//    9   21:astore_1        
		AtomicBoolean atomicboolean = new AtomicBoolean(false);
	//   10   22:new             #305 <Class AtomicBoolean>
	//   11   25:dup             
	//   12   26:iconst_0        
	//   13   27:invokespecial   #306 <Method void AtomicBoolean(boolean)>
	//   14   30:astore_2        
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
		//*   5    9:ifeq            23
				firstCompleted.setResult(((Object) (task)));
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field TaskCompletionSource val$firstCompleted>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #46  <Method void TaskCompletionSource.setResult(Object)>
			else
		//*  10   20:goto            28
				task.getError();
		//   11   23:aload_1         
		//   12   24:invokevirtual   #50  <Method Exception Task.getError()>
		//   13   27:pop             
			return null;
		//   14   28:aconst_null     
		//   15   29:areturn         
		}

		final bolts.TaskCompletionSource val$firstCompleted;
		final AtomicBoolean val$isAnyTaskComplete;

			
			{
				isAnyTaskComplete = atomicboolean;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AtomicBoolean val$isAnyTaskComplete>
				firstCompleted = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field TaskCompletionSource val$firstCompleted>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
	}
));
	//   15   31:aload_0         
	//   16   32:invokeinterface #307 <Method Iterator Collection.iterator()>
	//   17   37:astore_0        
	//   18   38:aload_0         
	//   19   39:invokeinterface #275 <Method boolean Iterator.hasNext()>
	//   20   44:ifeq            72
	//   21   47:aload_0         
	//   22   48:invokeinterface #279 <Method Object Iterator.next()>
	//   23   53:checkcast       #2   <Class Task>
	//   24   56:new             #29  <Class Task$5>
	//   25   59:dup             
	//   26   60:aload_2         
	//   27   61:aload_1         
	//   28   62:invokespecial   #332 <Method void Task$5(AtomicBoolean, TaskCompletionSource)>
	//   29   65:invokevirtual   #314 <Method Task continueWith(Continuation)>
	//   30   68:pop             
	//*  31   69:goto            38
		return taskcompletionsource.getTask();
	//   32   72:aload_1         
	//   33   73:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   34   76:areturn         
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
	//    3    3:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #340 <Method Task continueWhile(Callable, Continuation, Executor, CancellationToken)>
	//    6   10:areturn         
	}

	public Task continueWhile(Callable callable, Continuation continuation, CancellationToken cancellationtoken)
	{
		return continueWhile(callable, continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #340 <Method Task continueWhile(Callable, Continuation, Executor, CancellationToken)>
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
	//    5    5:invokevirtual   #340 <Method Task continueWhile(Callable, Continuation, Executor, CancellationToken)>
	//    6    8:areturn         
	}

	public Task continueWhile(final Callable predicate, final Continuation continuation, final Executor executor, final CancellationToken ct)
	{
		final Capture predicateContinuation = new Capture();
	//    0    0:new             #347 <Class Capture>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void Capture()>
	//    3    7:astore          5
		predicateContinuation.set(((Object) (new Continuation() {

			public Task then(Task task)
				throws Exception
			{
				task = ((Task) (ct));
			//    0    0:aload_0         
			//    1    1:getfield        #30  <Field CancellationToken val$ct>
			//    2    4:astore_1        
				if(task != null && ((CancellationToken) (task)).isCancellationRequested())
			//*   3    5:aload_1         
			//*   4    6:ifnull          20
			//*   5    9:aload_1         
			//*   6   10:invokevirtual   #52  <Method boolean CancellationToken.isCancellationRequested()>
			//*   7   13:ifeq            20
					return Task.cancelled();
			//    8   16:invokestatic    #56  <Method Task Task.cancelled()>
			//    9   19:areturn         
				if(((Boolean)predicate.call()).booleanValue())
			//*  10   20:aload_0         
			//*  11   21:getfield        #32  <Field Callable val$predicate>
			//*  12   24:invokeinterface #62  <Method Object Callable.call()>
			//*  13   29:checkcast       #64  <Class Boolean>
			//*  14   32:invokevirtual   #67  <Method boolean Boolean.booleanValue()>
			//*  15   35:ifeq            71
					return Task.forResult(((Object) (null))).onSuccessTask(continuation, executor).onSuccessTask((Continuation)predicateContinuation.get(), executor);
			//   16   38:aconst_null     
			//   17   39:invokestatic    #71  <Method Task Task.forResult(Object)>
			//   18   42:aload_0         
			//   19   43:getfield        #34  <Field Continuation val$continuation>
			//   20   46:aload_0         
			//   21   47:getfield        #36  <Field Executor val$executor>
			//   22   50:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
			//   23   53:aload_0         
			//   24   54:getfield        #38  <Field Capture val$predicateContinuation>
			//   25   57:invokevirtual   #80  <Method Object Capture.get()>
			//   26   60:checkcast       #7   <Class Continuation>
			//   27   63:aload_0         
			//   28   64:getfield        #36  <Field Executor val$executor>
			//   29   67:invokevirtual   #75  <Method Task Task.onSuccessTask(Continuation, Executor)>
			//   30   70:areturn         
				else
					return Task.forResult(((Object) (null)));
			//   31   71:aconst_null     
			//   32   72:invokestatic    #71  <Method Task Task.forResult(Object)>
			//   33   75:areturn         
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
	//    5   11:new             #37  <Class Task$9>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload           4
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:aload           5
	//   13   23:invokespecial   #351 <Method void Task$9(Task, CancellationToken, Callable, Continuation, Executor, Capture)>
	//   14   26:invokevirtual   #354 <Method void Capture.set(Object)>
		return makeVoid().continueWithTask((Continuation)predicateContinuation.get(), executor);
	//   15   29:aload_0         
	//   16   30:invokevirtual   #357 <Method Task makeVoid()>
	//   17   33:aload           5
	//   18   35:invokevirtual   #360 <Method Object Capture.get()>
	//   19   38:checkcast       #281 <Class Continuation>
	//   20   41:aload_3         
	//   21   42:invokevirtual   #364 <Method Task continueWithTask(Continuation, Executor)>
	//   22   45:areturn         
	}

	public Task continueWith(Continuation continuation)
	{
		return continueWith(continuation, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #368 <Method Task continueWith(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWith(Continuation continuation, CancellationToken cancellationtoken)
	{
		return continueWith(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #368 <Method Task continueWith(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWith(Continuation continuation, Executor executor)
	{
		return continueWith(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #368 <Method Task continueWith(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task continueWith(final Continuation continuation, final Executor executor, final CancellationToken ct)
	{
		final bolts.TaskCompletionSource tcs = new bolts.TaskCompletionSource();
	//    0    0:new             #159 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void TaskCompletionSource()>
	//    3    7:astore          6
		Object obj = lock;
	//    4    9:aload_0         
	//    5   10:getfield        #121 <Field Object lock>
	//    6   13:astore          5
		obj;
	//    7   15:aload           5
		JVM INSTR monitorenter ;
	//    8   17:monitorenter    
		boolean flag = isCompleted();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #375 <Method boolean isCompleted()>
	//   11   22:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_52;
	//   12   24:iload           4
	//   13   26:ifne            52
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
			//    1    1:getfield        #28  <Field TaskCompletionSource val$tcs>
			//    2    4:aload_0         
			//    3    5:getfield        #30  <Field Continuation val$continuation>
			//    4    8:aload_1         
			//    5    9:aload_0         
			//    6   10:getfield        #32  <Field Executor val$executor>
			//    7   13:aload_0         
			//    8   14:getfield        #34  <Field CancellationToken val$ct>
			//    9   17:invokestatic    #50  <Method void Task.access$000(TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
				return null;
			//   10   20:aconst_null     
			//   11   21:areturn         
			}

			final Task this$0;
			final Continuation val$continuation;
			final CancellationToken val$ct;
			final Executor val$executor;
			final bolts.TaskCompletionSource val$tcs;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Task this$0>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field TaskCompletionSource val$tcs>
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
	//   14   29:aload_0         
	//   15   30:getfield        #126 <Field List continuations>
	//   16   33:new             #9   <Class Task$10>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:aload           6
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:invokespecial   #378 <Method void Task$10(Task, TaskCompletionSource, Continuation, Executor, CancellationToken)>
	//   24   46:invokeinterface #381 <Method boolean List.add(Object)>
	//   25   51:pop             
		obj;
	//   26   52:aload           5
		JVM INSTR monitorexit ;
	//   27   54:monitorexit     
		if(flag)
	//*  28   55:iload           4
	//*  29   57:ifeq            69
			completeImmediately(tcs, continuation, this, executor, ct);
	//   30   60:aload           6
	//   31   62:aload_1         
	//   32   63:aload_0         
	//   33   64:aload_2         
	//   34   65:aload_3         
	//   35   66:invokestatic    #141 <Method void completeImmediately(TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return tcs.getTask();
	//   36   69:aload           6
	//   37   71:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   38   74:areturn         
		continuation;
	//   39   75:astore_1        
		obj;
	//   40   76:aload           5
		JVM INSTR monitorexit ;
	//   41   78:monitorexit     
		throw continuation;
	//   42   79:aload_1         
	//   43   80:athrow          
	}

	public Task continueWithTask(Continuation continuation)
	{
		return continueWithTask(continuation, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #384 <Method Task continueWithTask(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWithTask(Continuation continuation, CancellationToken cancellationtoken)
	{
		return continueWithTask(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #384 <Method Task continueWithTask(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task continueWithTask(Continuation continuation, Executor executor)
	{
		return continueWithTask(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #384 <Method Task continueWithTask(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task continueWithTask(final Continuation continuation, final Executor executor, final CancellationToken ct)
	{
		final bolts.TaskCompletionSource tcs = new bolts.TaskCompletionSource();
	//    0    0:new             #159 <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void TaskCompletionSource()>
	//    3    7:astore          6
		Object obj = lock;
	//    4    9:aload_0         
	//    5   10:getfield        #121 <Field Object lock>
	//    6   13:astore          5
		obj;
	//    7   15:aload           5
		JVM INSTR monitorenter ;
	//    8   17:monitorenter    
		boolean flag = isCompleted();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #375 <Method boolean isCompleted()>
	//   11   22:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_52;
	//   12   24:iload           4
	//   13   26:ifne            52
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
			//    1    1:getfield        #28  <Field TaskCompletionSource val$tcs>
			//    2    4:aload_0         
			//    3    5:getfield        #30  <Field Continuation val$continuation>
			//    4    8:aload_1         
			//    5    9:aload_0         
			//    6   10:getfield        #32  <Field Executor val$executor>
			//    7   13:aload_0         
			//    8   14:getfield        #34  <Field CancellationToken val$ct>
			//    9   17:invokestatic    #50  <Method void Task.access$100(TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
				return null;
			//   10   20:aconst_null     
			//   11   21:areturn         
			}

			final Task this$0;
			final Continuation val$continuation;
			final CancellationToken val$ct;
			final Executor val$executor;
			final bolts.TaskCompletionSource val$tcs;

			
			{
				this$0 = Task.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field Task this$0>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field TaskCompletionSource val$tcs>
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
	//   14   29:aload_0         
	//   15   30:getfield        #126 <Field List continuations>
	//   16   33:new             #11  <Class Task$11>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:aload           6
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:aload_3         
	//   23   43:invokespecial   #388 <Method void Task$11(Task, TaskCompletionSource, Continuation, Executor, CancellationToken)>
	//   24   46:invokeinterface #381 <Method boolean List.add(Object)>
	//   25   51:pop             
		obj;
	//   26   52:aload           5
		JVM INSTR monitorexit ;
	//   27   54:monitorexit     
		if(flag)
	//*  28   55:iload           4
	//*  29   57:ifeq            69
			completeAfterTask(tcs, continuation, this, executor, ct);
	//   30   60:aload           6
	//   31   62:aload_1         
	//   32   63:aload_0         
	//   33   64:aload_2         
	//   34   65:aload_3         
	//   35   66:invokestatic    #145 <Method void completeAfterTask(TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return tcs.getTask();
	//   36   69:aload           6
	//   37   71:invokevirtual   #181 <Method Task TaskCompletionSource.getTask()>
	//   38   74:areturn         
		continuation;
	//   39   75:astore_1        
		obj;
	//   40   76:aload           5
		JVM INSTR monitorexit ;
	//   41   78:monitorexit     
		throw continuation;
	//   42   79:aload_1         
	//   43   80:athrow          
	}

	public Exception getError()
	{
		Exception exception;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(error != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #393 <Field Exception error>
	//*   7   11:ifnull          38
			{
				errorHasBeenObserved = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #395 <Field boolean errorHasBeenObserved>
				if(unobservedErrorNotifier != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #397 <Field UnobservedErrorNotifier unobservedErrorNotifier>
	//*  13   23:ifnull          38
				{
					unobservedErrorNotifier.setObserved();
	//   14   26:aload_0         
	//   15   27:getfield        #397 <Field UnobservedErrorNotifier unobservedErrorNotifier>
	//   16   30:invokevirtual   #402 <Method void UnobservedErrorNotifier.setObserved()>
					unobservedErrorNotifier = null;
	//   17   33:aload_0         
	//   18   34:aconst_null     
	//   19   35:putfield        #397 <Field UnobservedErrorNotifier unobservedErrorNotifier>
				}
			}
			exception = error;
	//   20   38:aload_0         
	//   21   39:getfield        #393 <Field Exception error>
	//   22   42:astore_2        
		}
	//   23   43:aload_1         
	//   24   44:monitorexit     
		return exception;
	//   25   45:aload_2         
	//   26   46:areturn         
		exception1;
	//   27   47:astore_2        
		obj;
	//   28   48:aload_1         
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		throw exception1;
	//   30   50:aload_2         
	//   31   51:athrow          
	}

	public Object getResult()
	{
		Object obj1;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			obj1 = result;
	//    5    7:aload_0         
	//    6    8:getfield        #405 <Field Object result>
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
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = cancelled;
	//    5    7:aload_0         
	//    6    8:getfield        #409 <Field boolean cancelled>
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
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = complete;
	//    5    7:aload_0         
	//    6    8:getfield        #411 <Field boolean complete>
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
	//    1    1:getfield        #121 <Field Object lock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(getError() != null)
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #414 <Method Exception getError()>
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
	//    1    1:new             #25  <Class Task$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #415 <Method void Task$3(Task)>
	//    5    9:invokevirtual   #417 <Method Task continueWithTask(Continuation)>
	//    6   12:areturn         
	}

	public Task onSuccess(Continuation continuation)
	{
		return onSuccess(continuation, IMMEDIATE_EXECUTOR, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #420 <Method Task onSuccess(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task onSuccess(Continuation continuation, CancellationToken cancellationtoken)
	{
		return onSuccess(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #420 <Method Task onSuccess(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task onSuccess(Continuation continuation, Executor executor)
	{
		return onSuccess(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #420 <Method Task onSuccess(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task onSuccess(final Continuation continuation, Executor executor, final CancellationToken ct)
	{
		return continueWithTask(new Continuation() {

			public Task then(Task task)
			{
				CancellationToken cancellationtoken = ct;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field CancellationToken val$ct>
			//    2    4:astore_2        
				if(cancellationtoken != null && cancellationtoken.isCancellationRequested())
			//*   3    5:aload_2         
			//*   4    6:ifnull          20
			//*   5    9:aload_2         
			//*   6   10:invokevirtual   #38  <Method boolean CancellationToken.isCancellationRequested()>
			//*   7   13:ifeq            20
					return Task.cancelled();
			//    8   16:invokestatic    #42  <Method Task Task.cancelled()>
			//    9   19:areturn         
				if(task.isFaulted())
			//*  10   20:aload_1         
			//*  11   21:invokevirtual   #45  <Method boolean Task.isFaulted()>
			//*  12   24:ifeq            35
					return Task.forError(task.getError());
			//   13   27:aload_1         
			//   14   28:invokevirtual   #49  <Method Exception Task.getError()>
			//   15   31:invokestatic    #53  <Method Task Task.forError(Exception)>
			//   16   34:areturn         
				if(task.isCancelled())
			//*  17   35:aload_1         
			//*  18   36:invokevirtual   #56  <Method boolean Task.isCancelled()>
			//*  19   39:ifeq            46
					return Task.cancelled();
			//   20   42:invokestatic    #42  <Method Task Task.cancelled()>
			//   21   45:areturn         
				else
					return task.continueWith(continuation);
			//   22   46:aload_1         
			//   23   47:aload_0         
			//   24   48:getfield        #26  <Field Continuation val$continuation>
			//   25   51:invokevirtual   #60  <Method Task Task.continueWith(Continuation)>
			//   26   54:areturn         
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
	//    6    8:invokespecial   #423 <Method void Task$12(Task, CancellationToken, Continuation)>
	//    7   11:aload_2         
	//    8   12:invokevirtual   #364 <Method Task continueWithTask(Continuation, Executor)>
	//    9   15:areturn         
	}

	public Task onSuccessTask(Continuation continuation)
	{
		return onSuccessTask(continuation, IMMEDIATE_EXECUTOR);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:invokevirtual   #426 <Method Task onSuccessTask(Continuation, Executor)>
	//    4    8:areturn         
	}

	public Task onSuccessTask(Continuation continuation, CancellationToken cancellationtoken)
	{
		return onSuccessTask(continuation, IMMEDIATE_EXECUTOR, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #428 <Method Task onSuccessTask(Continuation, Executor, CancellationToken)>
	//    5    9:areturn         
	}

	public Task onSuccessTask(Continuation continuation, Executor executor)
	{
		return onSuccessTask(continuation, executor, ((CancellationToken) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #428 <Method Task onSuccessTask(Continuation, Executor, CancellationToken)>
	//    5    7:areturn         
	}

	public Task onSuccessTask(final Continuation continuation, Executor executor, final CancellationToken ct)
	{
		return continueWithTask(new Continuation() {

			public Task then(Task task)
			{
				CancellationToken cancellationtoken = ct;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field CancellationToken val$ct>
			//    2    4:astore_2        
				if(cancellationtoken != null && cancellationtoken.isCancellationRequested())
			//*   3    5:aload_2         
			//*   4    6:ifnull          20
			//*   5    9:aload_2         
			//*   6   10:invokevirtual   #38  <Method boolean CancellationToken.isCancellationRequested()>
			//*   7   13:ifeq            20
					return Task.cancelled();
			//    8   16:invokestatic    #42  <Method Task Task.cancelled()>
			//    9   19:areturn         
				if(task.isFaulted())
			//*  10   20:aload_1         
			//*  11   21:invokevirtual   #45  <Method boolean Task.isFaulted()>
			//*  12   24:ifeq            35
					return Task.forError(task.getError());
			//   13   27:aload_1         
			//   14   28:invokevirtual   #49  <Method Exception Task.getError()>
			//   15   31:invokestatic    #53  <Method Task Task.forError(Exception)>
			//   16   34:areturn         
				if(task.isCancelled())
			//*  17   35:aload_1         
			//*  18   36:invokevirtual   #56  <Method boolean Task.isCancelled()>
			//*  19   39:ifeq            46
					return Task.cancelled();
			//   20   42:invokestatic    #42  <Method Task Task.cancelled()>
			//   21   45:areturn         
				else
					return task.continueWithTask(continuation);
			//   22   46:aload_1         
			//   23   47:aload_0         
			//   24   48:getfield        #26  <Field Continuation val$continuation>
			//   25   51:invokevirtual   #60  <Method Task Task.continueWithTask(Continuation)>
			//   26   54:areturn         
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
	//    1    1:new             #15  <Class Task$13>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokespecial   #429 <Method void Task$13(Task, CancellationToken, Continuation)>
	//    7   11:aload_2         
	//    8   12:invokevirtual   #364 <Method Task continueWithTask(Continuation, Executor)>
	//    9   15:areturn         
	}

	boolean trySetCancelled()
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!complete)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #411 <Field boolean complete>
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
	//   14   20:putfield        #411 <Field boolean complete>
		cancelled = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #409 <Field boolean cancelled>
		lock.notifyAll();
	//   18   28:aload_0         
	//   19   29:getfield        #121 <Field Object lock>
	//   20   32:invokevirtual   #432 <Method void Object.notifyAll()>
		runContinuations();
	//   21   35:aload_0         
	//   22   36:invokespecial   #434 <Method void runContinuations()>
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

	boolean trySetError(Exception exception)
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!complete)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #411 <Field boolean complete>
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
	//   14   20:putfield        #411 <Field boolean complete>
		error = exception;
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:putfield        #393 <Field Exception error>
		errorHasBeenObserved = false;
	//   18   28:aload_0         
	//   19   29:iconst_0        
	//   20   30:putfield        #395 <Field boolean errorHasBeenObserved>
		lock.notifyAll();
	//   21   33:aload_0         
	//   22   34:getfield        #121 <Field Object lock>
	//   23   37:invokevirtual   #432 <Method void Object.notifyAll()>
		runContinuations();
	//   24   40:aload_0         
	//   25   41:invokespecial   #434 <Method void runContinuations()>
		if(!errorHasBeenObserved && getUnobservedExceptionHandler() != null)
	//*  26   44:aload_0         
	//*  27   45:getfield        #395 <Field boolean errorHasBeenObserved>
	//*  28   48:ifne            69
	//*  29   51:invokestatic    #438 <Method Task$UnobservedExceptionHandler getUnobservedExceptionHandler()>
	//*  30   54:ifnull          69
			unobservedErrorNotifier = new UnobservedErrorNotifier(this);
	//   31   57:aload_0         
	//   32   58:new             #399 <Class UnobservedErrorNotifier>
	//   33   61:dup             
	//   34   62:aload_0         
	//   35   63:invokespecial   #439 <Method void UnobservedErrorNotifier(Task)>
	//   36   66:putfield        #397 <Field UnobservedErrorNotifier unobservedErrorNotifier>
		obj;
	//   37   69:aload_2         
		JVM INSTR monitorexit ;
	//   38   70:monitorexit     
		return true;
	//   39   71:iconst_1        
	//   40   72:ireturn         
		exception;
	//   41   73:astore_1        
		obj;
	//   42   74:aload_2         
		JVM INSTR monitorexit ;
	//   43   75:monitorexit     
		throw exception;
	//   44   76:aload_1         
	//   45   77:athrow          
	}

	boolean trySetResult(Object obj)
	{
label0:
		{
			synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!complete)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #411 <Field boolean complete>
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
	//   14   20:putfield        #411 <Field boolean complete>
		result = obj;
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:putfield        #405 <Field Object result>
		lock.notifyAll();
	//   18   28:aload_0         
	//   19   29:getfield        #121 <Field Object lock>
	//   20   32:invokevirtual   #432 <Method void Object.notifyAll()>
		runContinuations();
	//   21   35:aload_0         
	//   22   36:invokespecial   #434 <Method void runContinuations()>
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

	public void waitForCompletion()
		throws InterruptedException
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(!isCompleted())
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #375 <Method boolean isCompleted()>
	//*   7   11:ifne            21
				lock.wait();
	//    8   14:aload_0         
	//    9   15:getfield        #121 <Field Object lock>
	//   10   18:invokevirtual   #446 <Method void Object.wait()>
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

	public boolean waitForCompletion(long l, TimeUnit timeunit)
		throws InterruptedException
	{
		boolean flag;
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field Object lock>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
		{
			if(!isCompleted())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #375 <Method boolean isCompleted()>
	//*   7   13:ifne            28
				lock.wait(timeunit.toMillis(l));
	//    8   16:aload_0         
	//    9   17:getfield        #121 <Field Object lock>
	//   10   20:aload_3         
	//   11   21:lload_1         
	//   12   22:invokevirtual   #452 <Method long TimeUnit.toMillis(long)>
	//   13   25:invokevirtual   #455 <Method void Object.wait(long)>
			flag = isCompleted();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #375 <Method boolean isCompleted()>
	//   16   32:istore          4
		}
	//   17   34:aload           5
	//   18   36:monitorexit     
		return flag;
	//   19   37:iload           4
	//   20   39:ireturn         
		timeunit;
	//   21   40:astore_3        
		obj;
	//   22   41:aload           5
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		throw timeunit;
	//   24   44:aload_3         
	//   25   45:athrow          
	}

	public static final ExecutorService BACKGROUND_EXECUTOR = BoltsExecutors.background();
	private static final Executor IMMEDIATE_EXECUTOR = BoltsExecutors.immediate();
	private static Task TASK_CANCELLED = new Task(true);
	private static Task TASK_FALSE = new Task(((Object) (Boolean.valueOf(false))));
	private static Task TASK_NULL = new Task(((Object) (null)));
	private static Task TASK_TRUE = new Task(((Object) (Boolean.valueOf(true))));
	public static final Executor UI_THREAD_EXECUTOR = AndroidExecutors.uiThread();
	private static volatile UnobservedExceptionHandler unobservedExceptionHandler;
	private boolean cancelled;
	private boolean complete;
	private List continuations;
	private Exception error;
	private boolean errorHasBeenObserved;
	private final Object lock;
	private Object result;
	private UnobservedErrorNotifier unobservedErrorNotifier;

	static 
	{
	//    0    0:invokestatic    #80  <Method ExecutorService BoltsExecutors.background()>
	//    1    3:putstatic       #82  <Field ExecutorService BACKGROUND_EXECUTOR>
	//    2    6:invokestatic    #86  <Method Executor BoltsExecutors.immediate()>
	//    3    9:putstatic       #88  <Field Executor IMMEDIATE_EXECUTOR>
	//    4   12:invokestatic    #93  <Method Executor AndroidExecutors.uiThread()>
	//    5   15:putstatic       #95  <Field Executor UI_THREAD_EXECUTOR>
	//    6   18:new             #2   <Class Task>
	//    7   21:dup             
	//    8   22:aconst_null     
	//    9   23:invokespecial   #99  <Method void Task(Object)>
	//   10   26:putstatic       #101 <Field Task TASK_NULL>
	//   11   29:new             #2   <Class Task>
	//   12   32:dup             
	//   13   33:iconst_1        
	//   14   34:invokestatic    #107 <Method Boolean Boolean.valueOf(boolean)>
	//   15   37:invokespecial   #99  <Method void Task(Object)>
	//   16   40:putstatic       #109 <Field Task TASK_TRUE>
	//   17   43:new             #2   <Class Task>
	//   18   46:dup             
	//   19   47:iconst_0        
	//   20   48:invokestatic    #107 <Method Boolean Boolean.valueOf(boolean)>
	//   21   51:invokespecial   #99  <Method void Task(Object)>
	//   22   54:putstatic       #111 <Field Task TASK_FALSE>
	//   23   57:new             #2   <Class Task>
	//   24   60:dup             
	//   25   61:iconst_1        
	//   26   62:invokespecial   #114 <Method void Task(boolean)>
	//   27   65:putstatic       #116 <Field Task TASK_CANCELLED>
	//*  28   68:return          
	}


/*
	static void access$000(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		completeImmediately(taskcompletionsource, continuation, task, executor, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #141 <Method void completeImmediately(TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return;
	//    6    9:return          
	}

*/


/*
	static void access$100(TaskCompletionSource taskcompletionsource, Continuation continuation, Task task, Executor executor, CancellationToken cancellationtoken)
	{
		completeAfterTask(taskcompletionsource, continuation, task, executor, cancellationtoken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokestatic    #145 <Method void completeAfterTask(TaskCompletionSource, Continuation, Task, Executor, CancellationToken)>
		return;
	//    6    9:return          
	}

*/
}
