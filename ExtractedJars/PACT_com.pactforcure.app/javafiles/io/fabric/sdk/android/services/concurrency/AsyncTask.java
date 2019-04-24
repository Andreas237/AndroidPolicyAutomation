// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import android.os.*;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AsyncTask
{
	private static class AsyncTaskResult
	{

		final Object data[];
		final AsyncTask task;

		transient AsyncTaskResult(AsyncTask asynctask, Object aobj[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			task = asynctask;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field AsyncTask task>
			data = aobj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Object[] data>
		//    8   14:return          
		}
	}

	private static class InternalHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			AsyncTaskResult asynctaskresult = (AsyncTaskResult)message.obj;
		//    0    0:aload_1         
		//    1    1:getfield        #27  <Field Object Message.obj>
		//    2    4:checkcast       #29  <Class AsyncTask$AsyncTaskResult>
		//    3    7:astore_2        
			switch(message.what)
		//*   4    8:aload_1         
		//*   5    9:getfield        #33  <Field int Message.what>
			{
		//*   6   12:tableswitch     1 2: default 36
		//		               1 37
		//		               2 51
			default:
				return;
		//    7   36:return          

			case 1: // '\001'
				asynctaskresult.task.finish(asynctaskresult.data[0]);
		//    8   37:aload_2         
		//    9   38:getfield        #37  <Field AsyncTask AsyncTask$AsyncTaskResult.task>
		//   10   41:aload_2         
		//   11   42:getfield        #41  <Field Object[] AsyncTask$AsyncTaskResult.data>
		//   12   45:iconst_0        
		//   13   46:aaload          
		//   14   47:invokestatic    #45  <Method void AsyncTask.access$500(AsyncTask, Object)>
				return;
		//   15   50:return          

			case 2: // '\002'
				asynctaskresult.task.onProgressUpdate(asynctaskresult.data);
		//   16   51:aload_2         
		//   17   52:getfield        #37  <Field AsyncTask AsyncTask$AsyncTaskResult.task>
		//   18   55:aload_2         
		//   19   56:getfield        #41  <Field Object[] AsyncTask$AsyncTaskResult.data>
		//   20   59:invokevirtual   #49  <Method void AsyncTask.onProgressUpdate(Object[])>
				break;
			}
		//   21   62:return          
		}

		public InternalHandler()
		{
			super(Looper.getMainLooper());
		//    0    0:aload_0         
		//    1    1:invokestatic    #15  <Method Looper Looper.getMainLooper()>
		//    2    4:invokespecial   #18  <Method void Handler(Looper)>
		//    3    7:return          
		}
	}

	private static class SerialExecutor
		implements Executor
	{

		public void execute(Runnable runnable)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			tasks.offer(((Object) (((_cls1) (runnable)). new Runnable() {

				public void run()
				{
					r.run();
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field Runnable val$r>
				//    2    4:invokeinterface #31  <Method void Runnable.run()>
					scheduleNext();
				//    3    9:aload_0         
				//    4   10:getfield        #22  <Field AsyncTask$SerialExecutor this$0>
				//    5   13:invokevirtual   #34  <Method void AsyncTask$SerialExecutor.scheduleNext()>
					return;
				//    6   16:return          
					Exception exception;
					exception;
				//    7   17:astore_1        
					scheduleNext();
				//    8   18:aload_0         
				//    9   19:getfield        #22  <Field AsyncTask$SerialExecutor this$0>
				//   10   22:invokevirtual   #34  <Method void AsyncTask$SerialExecutor.scheduleNext()>
					throw exception;
				//   11   25:aload_1         
				//   12   26:athrow          
				}

				final SerialExecutor this$0;
				final Runnable val$r;

			
			{
				this$0 = final_serialexecutor;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AsyncTask$SerialExecutor this$0>
				r = Runnable.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Runnable val$r>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
)));
		//    2    2:aload_0         
		//    3    3:getfield        #25  <Field LinkedList tasks>
		//    4    6:new             #11  <Class AsyncTask$SerialExecutor$1>
		//    5    9:dup             
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokespecial   #33  <Method void AsyncTask$SerialExecutor$1(AsyncTask$SerialExecutor, Runnable)>
		//    9   15:invokevirtual   #37  <Method boolean LinkedList.offer(Object)>
		//   10   18:pop             
			if(active == null)
		//*  11   19:aload_0         
		//*  12   20:getfield        #39  <Field Runnable active>
		//*  13   23:ifnonnull       30
				scheduleNext();
		//   14   26:aload_0         
		//   15   27:invokevirtual   #42  <Method void scheduleNext()>
			this;
		//   16   30:aload_0         
			JVM INSTR monitorexit ;
		//   17   31:monitorexit     
			return;
		//   18   32:return          
			runnable;
		//   19   33:astore_1        
		//*  20   34:aload_0         
			throw runnable;
		//   21   35:monitorexit     
		//   22   36:aload_1         
		//   23   37:athrow          
		}

		protected void scheduleNext()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			Runnable runnable;
			runnable = (Runnable)tasks.poll();
		//    2    2:aload_0         
		//    3    3:getfield        #25  <Field LinkedList tasks>
		//    4    6:invokevirtual   #46  <Method Object LinkedList.poll()>
		//    5    9:checkcast       #48  <Class Runnable>
		//    6   12:astore_1        
			active = runnable;
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:putfield        #39  <Field Runnable active>
			if(runnable == null)
				break MISSING_BLOCK_LABEL_34;
		//   10   18:aload_1         
		//   11   19:ifnull          34
			AsyncTask.THREAD_POOL_EXECUTOR.execute(active);
		//   12   22:getstatic       #52  <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
		//   13   25:aload_0         
		//   14   26:getfield        #39  <Field Runnable active>
		//   15   29:invokeinterface #54  <Method void Executor.execute(Runnable)>
			this;
		//   16   34:aload_0         
			JVM INSTR monitorexit ;
		//   17   35:monitorexit     
			return;
		//   18   36:return          
			Exception exception;
			exception;
		//   19   37:astore_1        
		//*  20   38:aload_0         
			throw exception;
		//   21   39:monitorexit     
		//   22   40:aload_1         
		//   23   41:athrow          
		}

		Runnable active;
		final LinkedList tasks;

		private SerialExecutor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			tasks = new LinkedList();
		//    2    4:aload_0         
		//    3    5:new             #22  <Class LinkedList>
		//    4    8:dup             
		//    5    9:invokespecial   #23  <Method void LinkedList()>
		//    6   12:putfield        #25  <Field LinkedList tasks>
		//    7   15:return          
		}

	}

	public static final class Status extends Enum
	{

		public static Status valueOf(String s)
		{
			return (Status)Enum.valueOf(io/fabric/sdk/android/services/concurrency/AsyncTask$Status, s);
		//    0    0:ldc1            #2   <Class AsyncTask$Status>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AsyncTask$Status>
		//    4    9:areturn         
		}

		public static Status[] values()
		{
			return (Status[])((Status []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field AsyncTask$Status[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lio.fabric.sdk.android.services.concurrency.AsyncTask$Status_3B_.clone()>
		//    2    6:checkcast       #42  <Class AsyncTask$Status[]>
		//    3    9:areturn         
		}

		private static final Status $VALUES[];
		public static final Status FINISHED;
		public static final Status PENDING;
		public static final Status RUNNING;

		static 
		{
			PENDING = new Status("PENDING", 0);
		//    0    0:new             #2   <Class AsyncTask$Status>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "PENDING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void AsyncTask$Status(String, int)>
		//    5   10:putstatic       #23  <Field AsyncTask$Status PENDING>
			RUNNING = new Status("RUNNING", 1);
		//    6   13:new             #2   <Class AsyncTask$Status>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "RUNNING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void AsyncTask$Status(String, int)>
		//   11   23:putstatic       #26  <Field AsyncTask$Status RUNNING>
			FINISHED = new Status("FINISHED", 2);
		//   12   26:new             #2   <Class AsyncTask$Status>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "FINISHED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void AsyncTask$Status(String, int)>
		//   17   36:putstatic       #29  <Field AsyncTask$Status FINISHED>
			$VALUES = (new Status[] {
				PENDING, RUNNING, FINISHED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Status[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field AsyncTask$Status PENDING>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field AsyncTask$Status RUNNING>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field AsyncTask$Status FINISHED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field AsyncTask$Status[] $VALUES>
		//*  33   64:return          
		}

		private Status(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	private static abstract class WorkerRunnable
		implements Callable
	{

		Object params[];

		private WorkerRunnable()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}


	public AsyncTask()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method void Object()>
		status = Status.PENDING;
	//    2    4:aload_0         
	//    3    5:getstatic       #123 <Field AsyncTask$Status AsyncTask$Status.PENDING>
	//    4    8:putfield        #125 <Field AsyncTask$Status status>
	//    5   11:aload_0         
	//    6   12:new             #127 <Class AtomicBoolean>
	//    7   15:dup             
	//    8   16:invokespecial   #128 <Method void AtomicBoolean()>
	//    9   19:putfield        #130 <Field AtomicBoolean cancelled>
	//   10   22:aload_0         
	//   11   23:new             #127 <Class AtomicBoolean>
	//   12   26:dup             
	//   13   27:invokespecial   #128 <Method void AtomicBoolean()>
	//   14   30:putfield        #132 <Field AtomicBoolean taskInvoked>
	//   15   33:aload_0         
	//   16   34:new             #9   <Class AsyncTask$2>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #135 <Method void AsyncTask$2(AsyncTask)>
	//   20   42:putfield        #137 <Field AsyncTask$WorkerRunnable worker>
		future = ((FutureTask) (new FutureTask(((Callable) (worker))) {

			protected void done()
			{
				try
				{
					postResultIfNotInvoked(get());
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field AsyncTask this$0>
			//    2    4:aload_0         
			//    3    5:invokevirtual   #30  <Method Object get()>
			//    4    8:invokestatic    #34  <Method void AsyncTask.access$400(AsyncTask, Object)>
					return;
			//    5   11:return          
				}
				catch(InterruptedException interruptedexception)
			//*   6   12:astore_1        
				{
					Log.w("AsyncTask", ((Throwable) (interruptedexception)));
			//    7   13:ldc1            #36  <String "AsyncTask">
			//    8   15:aload_1         
			//    9   16:invokestatic    #42  <Method int Log.w(String, Throwable)>
			//   10   19:pop             
					return;
			//   11   20:return          
				}
				catch(ExecutionException executionexception)
			//*  12   21:astore_1        
				{
					throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
			//   13   22:new             #44  <Class RuntimeException>
			//   14   25:dup             
			//   15   26:ldc1            #46  <String "An error occured while executing doInBackground()">
			//   16   28:aload_1         
			//   17   29:invokevirtual   #50  <Method Throwable ExecutionException.getCause()>
			//   18   32:invokespecial   #53  <Method void RuntimeException(String, Throwable)>
			//   19   35:athrow          
				}
				catch(CancellationException cancellationexception)
			//*  20   36:astore_1        
				{
					postResultIfNotInvoked(((Object) (null)));
			//   21   37:aload_0         
			//   22   38:getfield        #15  <Field AsyncTask this$0>
			//   23   41:aconst_null     
			//   24   42:invokestatic    #34  <Method void AsyncTask.access$400(AsyncTask, Object)>
				}
			//   25   45:return          
			}

			final AsyncTask this$0;

			
			{
				this$0 = AsyncTask.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AsyncTask this$0>
				super(callable);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void FutureTask(Callable)>
			//    6   10:return          
			}
		}
));
	//   21   45:aload_0         
	//   22   46:new             #11  <Class AsyncTask$3>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:aload_0         
	//   26   52:getfield        #137 <Field AsyncTask$WorkerRunnable worker>
	//   27   55:invokespecial   #140 <Method void AsyncTask$3(AsyncTask, Callable)>
	//   28   58:putfield        #142 <Field FutureTask future>
	//   29   61:return          
	}

	public static void execute(Runnable runnable)
	{
		defaultExecutor.execute(runnable);
	//    0    0:getstatic       #118 <Field Executor defaultExecutor>
	//    1    3:aload_0         
	//    2    4:invokeinterface #166 <Method void Executor.execute(Runnable)>
	//    3    9:return          
	}

	private void finish(Object obj)
	{
		if(isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #170 <Method boolean isCancelled()>
	//*   2    4:ifeq            20
			onCancelled(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #173 <Method void onCancelled(Object)>
		else
	//*   6   12:aload_0         
	//*   7   13:getstatic       #176 <Field AsyncTask$Status AsyncTask$Status.FINISHED>
	//*   8   16:putfield        #125 <Field AsyncTask$Status status>
	//*   9   19:return          
			onPostExecute(obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #179 <Method void onPostExecute(Object)>
		status = Status.FINISHED;
	//*  13   25:goto            12
	}

	public static void init()
	{
		handler.getLooper();
	//    0    0:getstatic       #116 <Field AsyncTask$InternalHandler handler>
	//    1    3:invokevirtual   #186 <Method Looper AsyncTask$InternalHandler.getLooper()>
	//    2    6:pop             
	//    3    7:return          
	}

	private Object postResult(Object obj)
	{
		handler.obtainMessage(1, ((Object) (new AsyncTaskResult(this, new Object[] {
			obj
		})))).sendToTarget();
	//    0    0:getstatic       #116 <Field AsyncTask$InternalHandler handler>
	//    1    3:iconst_1        
	//    2    4:new             #15  <Class AsyncTask$AsyncTaskResult>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:aastore         
	//   11   17:invokespecial   #189 <Method void AsyncTask$AsyncTaskResult(AsyncTask, Object[])>
	//   12   20:invokevirtual   #193 <Method Message AsyncTask$InternalHandler.obtainMessage(int, Object)>
	//   13   23:invokevirtual   #198 <Method void Message.sendToTarget()>
		return obj;
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	private void postResultIfNotInvoked(Object obj)
	{
		if(!taskInvoked.get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #132 <Field AtomicBoolean taskInvoked>
	//*   2    4:invokevirtual   #202 <Method boolean AtomicBoolean.get()>
	//*   3    7:ifne            16
			postResult(obj);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #150 <Method Object postResult(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	public static void setDefaultExecutor(Executor executor)
	{
		defaultExecutor = executor;
	//    0    0:aload_0         
	//    1    1:putstatic       #118 <Field Executor defaultExecutor>
	//    2    4:return          
	}

	public final boolean cancel(boolean flag)
	{
		cancelled.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field AtomicBoolean cancelled>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #210 <Method void AtomicBoolean.set(boolean)>
		return future.cancel(flag);
	//    4    8:aload_0         
	//    5    9:getfield        #142 <Field FutureTask future>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #214 <Method boolean FutureTask.cancel(boolean)>
	//    8   16:ireturn         
	}

	protected transient abstract Object doInBackground(Object aobj[]);

	public final transient AsyncTask execute(Object aobj[])
	{
		return executeOnExecutor(defaultExecutor, aobj);
	//    0    0:aload_0         
	//    1    1:getstatic       #118 <Field Executor defaultExecutor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #221 <Method AsyncTask executeOnExecutor(Executor, Object[])>
	//    4    8:areturn         
	}

	public final transient AsyncTask executeOnExecutor(Executor executor, Object aobj[])
	{
		if(status == Status.PENDING) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field AsyncTask$Status status>
	//    2    4:getstatic       #123 <Field AsyncTask$Status AsyncTask$Status.PENDING>
	//    3    7:if_acmpeq       44
_L1:
		static class _cls4
		{

			static final int $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[];

			static 
			{
				$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status = new int[Status.values().length];
			//    0    0:invokestatic    #18  <Method AsyncTask$Status[] AsyncTask$Status.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status>
				try
				{
					$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[Status.RUNNING.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status>
			//    5   12:getstatic       #24  <Field AsyncTask$Status AsyncTask$Status.RUNNING>
			//    6   15:invokevirtual   #28  <Method int AsyncTask$Status.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status>
			//*  10   23:getstatic       #31  <Field AsyncTask$Status AsyncTask$Status.FINISHED>
			//*  11   26:invokevirtual   #28  <Method int AsyncTask$Status.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
			//*  15   32:astore_0        
			//*  16   33:return          
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   34:astore_0        
				try
				{
					$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status[Status.FINISHED.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  18   35:goto            20
			}
		}

		_cls4..SwitchMap.io.fabric.sdk.android.services.concurrency.AsyncTask.Status[status.ordinal()];
	//    4   10:getstatic       #226 <Field int[] AsyncTask$4.$SwitchMap$io$fabric$sdk$android$services$concurrency$AsyncTask$Status>
	//    5   13:aload_0         
	//    6   14:getfield        #125 <Field AsyncTask$Status status>
	//    7   17:invokevirtual   #229 <Method int AsyncTask$Status.ordinal()>
	//    8   20:iaload          
		JVM INSTR tableswitch 1 2: default 44
	//	               1 75
	//	               2 85;
	//    9   21:tableswitch     1 2: default 44
	//	               1 75
	//	               2 85
		   goto _L2 _L3 _L4
_L2:
		status = Status.RUNNING;
	//   10   44:aload_0         
	//   11   45:getstatic       #232 <Field AsyncTask$Status AsyncTask$Status.RUNNING>
	//   12   48:putfield        #125 <Field AsyncTask$Status status>
		onPreExecute();
	//   13   51:aload_0         
	//   14   52:invokevirtual   #235 <Method void onPreExecute()>
		worker.params = aobj;
	//   15   55:aload_0         
	//   16   56:getfield        #137 <Field AsyncTask$WorkerRunnable worker>
	//   17   59:aload_2         
	//   18   60:putfield        #239 <Field Object[] AsyncTask$WorkerRunnable.params>
		executor.execute(((Runnable) (future)));
	//   19   63:aload_1         
	//   20   64:aload_0         
	//   21   65:getfield        #142 <Field FutureTask future>
	//   22   68:invokeinterface #166 <Method void Executor.execute(Runnable)>
		return this;
	//   23   73:aload_0         
	//   24   74:areturn         
_L3:
		throw new IllegalStateException("Cannot execute task: the task is already running.");
	//   25   75:new             #241 <Class IllegalStateException>
	//   26   78:dup             
	//   27   79:ldc1            #243 <String "Cannot execute task: the task is already running.">
	//   28   81:invokespecial   #246 <Method void IllegalStateException(String)>
	//   29   84:athrow          
_L4:
		throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
	//   30   85:new             #241 <Class IllegalStateException>
	//   31   88:dup             
	//   32   89:ldc1            #248 <String "Cannot execute task: the task has already been executed (a task can be executed only once)">
	//   33   91:invokespecial   #246 <Method void IllegalStateException(String)>
	//   34   94:athrow          
	}

	public final Object get()
		throws InterruptedException, ExecutionException
	{
		return future.get();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field FutureTask future>
	//    2    4:invokevirtual   #256 <Method Object FutureTask.get()>
	//    3    7:areturn         
	}

	public final Object get(long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		return future.get(l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field FutureTask future>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #263 <Method Object FutureTask.get(long, TimeUnit)>
	//    5    9:areturn         
	}

	public final Status getStatus()
	{
		return status;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field AsyncTask$Status status>
	//    2    4:areturn         
	}

	public final boolean isCancelled()
	{
		return cancelled.get();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field AtomicBoolean cancelled>
	//    2    4:invokevirtual   #202 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	protected void onCancelled()
	{
	//    0    0:return          
	}

	protected void onCancelled(Object obj)
	{
		onCancelled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #268 <Method void onCancelled()>
	//    2    4:return          
	}

	protected void onPostExecute(Object obj)
	{
	//    0    0:return          
	}

	protected void onPreExecute()
	{
	//    0    0:return          
	}

	protected transient void onProgressUpdate(Object aobj[])
	{
	//    0    0:return          
	}

	protected final transient void publishProgress(Object aobj[])
	{
		if(!isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #170 <Method boolean isCancelled()>
	//*   2    4:ifne            26
			handler.obtainMessage(2, ((Object) (new AsyncTaskResult(this, aobj)))).sendToTarget();
	//    3    7:getstatic       #116 <Field AsyncTask$InternalHandler handler>
	//    4   10:iconst_2        
	//    5   11:new             #15  <Class AsyncTask$AsyncTaskResult>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #189 <Method void AsyncTask$AsyncTaskResult(AsyncTask, Object[])>
	//   10   20:invokevirtual   #193 <Method Message AsyncTask$InternalHandler.obtainMessage(int, Object)>
	//   11   23:invokevirtual   #198 <Method void Message.sendToTarget()>
	//   12   26:return          
	}

	private static final int CORE_POOL_SIZE;
	private static final int CPU_COUNT;
	private static final int KEEP_ALIVE = 1;
	private static final String LOG_TAG = "AsyncTask";
	private static final int MAXIMUM_POOL_SIZE;
	private static final int MESSAGE_POST_PROGRESS = 2;
	private static final int MESSAGE_POST_RESULT = 1;
	public static final Executor SERIAL_EXECUTOR;
	public static final Executor THREAD_POOL_EXECUTOR;
	private static volatile Executor defaultExecutor;
	private static final InternalHandler handler = new InternalHandler();
	private static final BlockingQueue poolWorkQueue;
	private static final ThreadFactory threadFactory;
	private final AtomicBoolean cancelled = new AtomicBoolean();
	private final FutureTask future;
	private volatile Status status;
	private final AtomicBoolean taskInvoked = new AtomicBoolean();
	private final WorkerRunnable worker = new WorkerRunnable() {

		public Object call()
			throws Exception
		{
			taskInvoked.set(true);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AsyncTask this$0>
		//    2    4:invokestatic    #27  <Method AtomicBoolean AsyncTask.access$200(AsyncTask)>
		//    3    7:iconst_1        
		//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
			Process.setThreadPriority(10);
		//    5   11:bipush          10
		//    6   13:invokestatic    #39  <Method void Process.setThreadPriority(int)>
			return postResult(doInBackground(params));
		//    7   16:aload_0         
		//    8   17:getfield        #15  <Field AsyncTask this$0>
		//    9   20:aload_0         
		//   10   21:getfield        #15  <Field AsyncTask this$0>
		//   11   24:aload_0         
		//   12   25:getfield        #43  <Field Object[] params>
		//   13   28:invokevirtual   #47  <Method Object AsyncTask.doInBackground(Object[])>
		//   14   31:invokestatic    #51  <Method Object AsyncTask.access$300(AsyncTask, Object)>
		//   15   34:areturn         
		}

		final AsyncTask this$0;

			
			{
				this$0 = AsyncTask.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AsyncTask this$0>
				super();
			//    3    5:aload_0         
			//    4    6:aconst_null     
			//    5    7:invokespecial   #18  <Method void AsyncTask$WorkerRunnable(AsyncTask$1)>
			//    6   10:return          
			}
	}
;

	static 
	{
		CPU_COUNT = Runtime.getRuntime().availableProcessors();
	//    0    0:invokestatic    #73  <Method Runtime Runtime.getRuntime()>
	//    1    3:invokevirtual   #77  <Method int Runtime.availableProcessors()>
	//    2    6:putstatic       #79  <Field int CPU_COUNT>
		CORE_POOL_SIZE = CPU_COUNT + 1;
	//    3    9:getstatic       #79  <Field int CPU_COUNT>
	//    4   12:iconst_1        
	//    5   13:iadd            
	//    6   14:putstatic       #81  <Field int CORE_POOL_SIZE>
		MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
	//    7   17:getstatic       #79  <Field int CPU_COUNT>
	//    8   20:iconst_2        
	//    9   21:imul            
	//   10   22:iconst_1        
	//   11   23:iadd            
	//   12   24:putstatic       #83  <Field int MAXIMUM_POOL_SIZE>
		threadFactory = new ThreadFactory() {

			public Thread newThread(Runnable runnable)
			{
				return new Thread(runnable, (new StringBuilder()).append("AsyncTask #").append(count.getAndIncrement()).toString());
			//    0    0:new             #26  <Class Thread>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:new             #28  <Class StringBuilder>
			//    4    8:dup             
			//    5    9:invokespecial   #29  <Method void StringBuilder()>
			//    6   12:ldc1            #31  <String "AsyncTask #">
			//    7   14:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
			//    8   17:aload_0         
			//    9   18:getfield        #21  <Field AtomicInteger count>
			//   10   21:invokevirtual   #39  <Method int AtomicInteger.getAndIncrement()>
			//   11   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
			//   12   27:invokevirtual   #46  <Method String StringBuilder.toString()>
			//   13   30:invokespecial   #49  <Method void Thread(Runnable, String)>
			//   14   33:areturn         
			}

			private final AtomicInteger count = new AtomicInteger(1);

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void Object()>
			//    2    4:aload_0         
			//    3    5:new             #16  <Class AtomicInteger>
			//    4    8:dup             
			//    5    9:iconst_1        
			//    6   10:invokespecial   #19  <Method void AtomicInteger(int)>
			//    7   13:putfield        #21  <Field AtomicInteger count>
			//    8   16:return          
			}
		}
;
	//   13   27:new             #7   <Class AsyncTask$1>
	//   14   30:dup             
	//   15   31:invokespecial   #86  <Method void AsyncTask$1()>
	//   16   34:putstatic       #88  <Field ThreadFactory threadFactory>
		poolWorkQueue = ((BlockingQueue) (new LinkedBlockingQueue(128)));
	//   17   37:new             #90  <Class LinkedBlockingQueue>
	//   18   40:dup             
	//   19   41:sipush          128
	//   20   44:invokespecial   #93  <Method void LinkedBlockingQueue(int)>
	//   21   47:putstatic       #95  <Field BlockingQueue poolWorkQueue>
		THREAD_POOL_EXECUTOR = ((Executor) (new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, poolWorkQueue, threadFactory)));
	//   22   50:new             #97  <Class ThreadPoolExecutor>
	//   23   53:dup             
	//   24   54:getstatic       #81  <Field int CORE_POOL_SIZE>
	//   25   57:getstatic       #83  <Field int MAXIMUM_POOL_SIZE>
	//   26   60:lconst_1        
	//   27   61:getstatic       #103 <Field TimeUnit TimeUnit.SECONDS>
	//   28   64:getstatic       #95  <Field BlockingQueue poolWorkQueue>
	//   29   67:getstatic       #88  <Field ThreadFactory threadFactory>
	//   30   70:invokespecial   #106 <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, ThreadFactory)>
	//   31   73:putstatic       #108 <Field Executor THREAD_POOL_EXECUTOR>
		SERIAL_EXECUTOR = ((Executor) (new SerialExecutor()));
	//   32   76:new             #21  <Class AsyncTask$SerialExecutor>
	//   33   79:dup             
	//   34   80:aconst_null     
	//   35   81:invokespecial   #111 <Method void AsyncTask$SerialExecutor(AsyncTask$1)>
	//   36   84:putstatic       #113 <Field Executor SERIAL_EXECUTOR>
	//   37   87:new             #18  <Class AsyncTask$InternalHandler>
	//   38   90:dup             
	//   39   91:invokespecial   #114 <Method void AsyncTask$InternalHandler()>
	//   40   94:putstatic       #116 <Field AsyncTask$InternalHandler handler>
		defaultExecutor = SERIAL_EXECUTOR;
	//   41   97:getstatic       #113 <Field Executor SERIAL_EXECUTOR>
	//   42  100:putstatic       #118 <Field Executor defaultExecutor>
	//*  43  103:return          
	}


/*
	static AtomicBoolean access$200(AsyncTask asynctask)
	{
		return asynctask.taskInvoked;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field AtomicBoolean taskInvoked>
	//    2    4:areturn         
	}

*/


/*
	static Object access$300(AsyncTask asynctask, Object obj)
	{
		return asynctask.postResult(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method Object postResult(Object)>
	//    3    5:areturn         
	}

*/


/*
	static void access$400(AsyncTask asynctask, Object obj)
	{
		asynctask.postResultIfNotInvoked(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method void postResultIfNotInvoked(Object)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$500(AsyncTask asynctask, Object obj)
	{
		asynctask.finish(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #160 <Method void finish(Object)>
		return;
	//    3    5:return          
	}

*/
}
