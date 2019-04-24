// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.os.*;
import android.util.Log;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask
{
	static class AsyncTaskResult
	{

		final Object mData[];
		final ModernAsyncTask mTask;

		transient AsyncTaskResult(ModernAsyncTask modernasynctask, Object aobj[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mTask = modernasynctask;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field ModernAsyncTask mTask>
			mData = aobj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field Object[] mData>
		//    8   14:return          
		}
	}

	static class InternalHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			AsyncTaskResult asynctaskresult = (AsyncTaskResult)message.obj;
		//    0    0:aload_1         
		//    1    1:getfield        #27  <Field Object Message.obj>
		//    2    4:checkcast       #29  <Class ModernAsyncTask$AsyncTaskResult>
		//    3    7:astore_2        
			switch(message.what)
		//*   4    8:aload_1         
		//*   5    9:getfield        #33  <Field int Message.what>
			{
		//*   6   12:lookupswitch    2: default 40
		//		               1: 41
		//		               2: 55
			default:
				return;
		//    7   40:return          

			case 1: // '\001'
				asynctaskresult.mTask.finish(asynctaskresult.mData[0]);
		//    8   41:aload_2         
		//    9   42:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
		//   10   45:aload_2         
		//   11   46:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
		//   12   49:iconst_0        
		//   13   50:aaload          
		//   14   51:invokevirtual   #45  <Method void ModernAsyncTask.finish(Object)>
				return;
		//   15   54:return          

			case 2: // '\002'
				asynctaskresult.mTask.onProgressUpdate(asynctaskresult.mData);
		//   16   55:aload_2         
		//   17   56:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
		//   18   59:aload_2         
		//   19   60:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
		//   20   63:invokevirtual   #49  <Method void ModernAsyncTask.onProgressUpdate(Object[])>
				break;
			}
		//   21   66:return          
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

	public static final class Status extends Enum
	{

		public static Status valueOf(String s)
		{
			return (Status)Enum.valueOf(android/support/v4/content/ModernAsyncTask$Status, s);
		//    0    0:ldc1            #2   <Class ModernAsyncTask$Status>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ModernAsyncTask$Status>
		//    4    9:areturn         
		}

		public static Status[] values()
		{
			return (Status[])((Status []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field ModernAsyncTask$Status[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Landroid.support.v4.content.ModernAsyncTask$Status_3B_.clone()>
		//    2    6:checkcast       #42  <Class ModernAsyncTask$Status[]>
		//    3    9:areturn         
		}

		private static final Status $VALUES[];
		public static final Status FINISHED;
		public static final Status PENDING;
		public static final Status RUNNING;

		static 
		{
			PENDING = new Status("PENDING", 0);
		//    0    0:new             #2   <Class ModernAsyncTask$Status>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "PENDING">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void ModernAsyncTask$Status(String, int)>
		//    5   10:putstatic       #23  <Field ModernAsyncTask$Status PENDING>
			RUNNING = new Status("RUNNING", 1);
		//    6   13:new             #2   <Class ModernAsyncTask$Status>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "RUNNING">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void ModernAsyncTask$Status(String, int)>
		//   11   23:putstatic       #26  <Field ModernAsyncTask$Status RUNNING>
			FINISHED = new Status("FINISHED", 2);
		//   12   26:new             #2   <Class ModernAsyncTask$Status>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "FINISHED">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void ModernAsyncTask$Status(String, int)>
		//   17   36:putstatic       #29  <Field ModernAsyncTask$Status FINISHED>
			$VALUES = (new Status[] {
				PENDING, RUNNING, FINISHED
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Status[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field ModernAsyncTask$Status PENDING>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field ModernAsyncTask$Status RUNNING>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field ModernAsyncTask$Status FINISHED>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field ModernAsyncTask$Status[] $VALUES>
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

	static abstract class WorkerRunnable
		implements Callable
	{

		Object mParams[];

		WorkerRunnable()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}


	public ModernAsyncTask()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void Object()>
		mStatus = Status.PENDING;
	//    2    4:aload_0         
	//    3    5:getstatic       #94  <Field ModernAsyncTask$Status ModernAsyncTask$Status.PENDING>
	//    4    8:putfield        #96  <Field ModernAsyncTask$Status mStatus>
	//    5   11:aload_0         
	//    6   12:new             #98  <Class AtomicBoolean>
	//    7   15:dup             
	//    8   16:invokespecial   #99  <Method void AtomicBoolean()>
	//    9   19:putfield        #101 <Field AtomicBoolean mCancelled>
	//   10   22:aload_0         
	//   11   23:new             #98  <Class AtomicBoolean>
	//   12   26:dup             
	//   13   27:invokespecial   #99  <Method void AtomicBoolean()>
	//   14   30:putfield        #103 <Field AtomicBoolean mTaskInvoked>
	//   15   33:aload_0         
	//   16   34:new             #9   <Class ModernAsyncTask$2>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #106 <Method void ModernAsyncTask$2(ModernAsyncTask)>
	//   20   42:putfield        #108 <Field ModernAsyncTask$WorkerRunnable mWorker>
		mFuture = ((FutureTask) (new FutureTask(((Callable) (mWorker))) {

			protected void done()
			{
				try
				{
					Object obj = get();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #32  <Method Object get()>
			//    2    4:astore_1        
					postResultIfNotInvoked(obj);
			//    3    5:aload_0         
			//    4    6:getfield        #15  <Field ModernAsyncTask this$0>
			//    5    9:aload_1         
			//    6   10:invokevirtual   #36  <Method void ModernAsyncTask.postResultIfNotInvoked(Object)>
					return;
			//    7   13:return          
				}
				catch(InterruptedException interruptedexception)
			//*   8   14:astore_1        
				{
					Log.w("AsyncTask", ((Throwable) (interruptedexception)));
			//    9   15:ldc1            #38  <String "AsyncTask">
			//   10   17:aload_1         
			//   11   18:invokestatic    #44  <Method int Log.w(String, Throwable)>
			//   12   21:pop             
					return;
			//   13   22:return          
				}
				catch(ExecutionException executionexception)
			//*  14   23:astore_1        
				{
					throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
			//   15   24:new             #46  <Class RuntimeException>
			//   16   27:dup             
			//   17   28:ldc1            #48  <String "An error occurred while executing doInBackground()">
			//   18   30:aload_1         
			//   19   31:invokevirtual   #52  <Method Throwable ExecutionException.getCause()>
			//   20   34:invokespecial   #55  <Method void RuntimeException(String, Throwable)>
			//   21   37:athrow          
				}
				catch(CancellationException cancellationexception)
			//*  22   38:astore_1        
				{
					postResultIfNotInvoked(((Object) (null)));
			//   23   39:aload_0         
			//   24   40:getfield        #15  <Field ModernAsyncTask this$0>
			//   25   43:aconst_null     
			//   26   44:invokevirtual   #36  <Method void ModernAsyncTask.postResultIfNotInvoked(Object)>
				}
			//*  27   47:return          
				catch(Throwable throwable)
			//*  28   48:astore_1        
				{
					throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
			//   29   49:new             #46  <Class RuntimeException>
			//   30   52:dup             
			//   31   53:ldc1            #48  <String "An error occurred while executing doInBackground()">
			//   32   55:aload_1         
			//   33   56:invokespecial   #55  <Method void RuntimeException(String, Throwable)>
			//   34   59:athrow          
				}
			}

			final ModernAsyncTask this$0;

			
			{
				this$0 = ModernAsyncTask.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ModernAsyncTask this$0>
				super(callable);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #18  <Method void FutureTask(Callable)>
			//    6   10:return          
			}
		}
));
	//   21   45:aload_0         
	//   22   46:new             #11  <Class ModernAsyncTask$3>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:aload_0         
	//   26   52:getfield        #108 <Field ModernAsyncTask$WorkerRunnable mWorker>
	//   27   55:invokespecial   #111 <Method void ModernAsyncTask$3(ModernAsyncTask, Callable)>
	//   28   58:putfield        #113 <Field FutureTask mFuture>
	//   29   61:return          
	}

	public static void execute(Runnable runnable)
	{
		sDefaultExecutor.execute(runnable);
	//    0    0:getstatic       #89  <Field Executor sDefaultExecutor>
	//    1    3:aload_0         
	//    2    4:invokeinterface #122 <Method void Executor.execute(Runnable)>
	//    3    9:return          
	}

	private static Handler getHandler()
	{
		android/support/v4/content/ModernAsyncTask;
	//    0    0:ldc1            #2   <Class ModernAsyncTask>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		InternalHandler internalhandler;
		if(sHandler == null)
	//*   2    3:getstatic       #126 <Field ModernAsyncTask$InternalHandler sHandler>
	//*   3    6:ifnonnull       19
			sHandler = new InternalHandler();
	//    4    9:new             #18  <Class ModernAsyncTask$InternalHandler>
	//    5   12:dup             
	//    6   13:invokespecial   #127 <Method void ModernAsyncTask$InternalHandler()>
	//    7   16:putstatic       #126 <Field ModernAsyncTask$InternalHandler sHandler>
		internalhandler = sHandler;
	//    8   19:getstatic       #126 <Field ModernAsyncTask$InternalHandler sHandler>
	//    9   22:astore_0        
		android/support/v4/content/ModernAsyncTask;
	//   10   23:ldc1            #2   <Class ModernAsyncTask>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return ((Handler) (internalhandler));
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class ModernAsyncTask>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	public static void setDefaultExecutor(Executor executor)
	{
		sDefaultExecutor = executor;
	//    0    0:aload_0         
	//    1    1:putstatic       #89  <Field Executor sDefaultExecutor>
	//    2    4:return          
	}

	public final boolean cancel(boolean flag)
	{
		mCancelled.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field AtomicBoolean mCancelled>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #140 <Method void AtomicBoolean.set(boolean)>
		return mFuture.cancel(flag);
	//    4    8:aload_0         
	//    5    9:getfield        #113 <Field FutureTask mFuture>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #144 <Method boolean FutureTask.cancel(boolean)>
	//    8   16:ireturn         
	}

	protected transient abstract Object doInBackground(Object aobj[]);

	public final transient ModernAsyncTask execute(Object aobj[])
	{
		return executeOnExecutor(sDefaultExecutor, aobj);
	//    0    0:aload_0         
	//    1    1:getstatic       #89  <Field Executor sDefaultExecutor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #151 <Method ModernAsyncTask executeOnExecutor(Executor, Object[])>
	//    4    8:areturn         
	}

	public final transient ModernAsyncTask executeOnExecutor(Executor executor, Object aobj[])
	{
		static class _cls4
		{

			static final int $SwitchMap$android$support$v4$content$ModernAsyncTask$Status[];

			static 
			{
				$SwitchMap$android$support$v4$content$ModernAsyncTask$Status = new int[Status.values().length];
			//    0    0:invokestatic    #18  <Method ModernAsyncTask$Status[] ModernAsyncTask$Status.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
				try
				{
					$SwitchMap$android$support$v4$content$ModernAsyncTask$Status[Status.RUNNING.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
			//    5   12:getstatic       #24  <Field ModernAsyncTask$Status ModernAsyncTask$Status.RUNNING>
			//    6   15:invokevirtual   #28  <Method int ModernAsyncTask$Status.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					$SwitchMap$android$support$v4$content$ModernAsyncTask$Status[Status.FINISHED.ordinal()] = 2;
			//   11   24:getstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
			//   12   27:getstatic       #31  <Field ModernAsyncTask$Status ModernAsyncTask$Status.FINISHED>
			//   13   30:invokevirtual   #28  <Method int ModernAsyncTask$Status.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
			//   16   35:return          
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		if(mStatus != Status.PENDING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field ModernAsyncTask$Status mStatus>
	//*   2    4:getstatic       #94  <Field ModernAsyncTask$Status ModernAsyncTask$Status.PENDING>
	//*   3    7:if_acmpeq       71
			switch(_cls4..SwitchMap.android.support.v4.content.ModernAsyncTask.Status[mStatus.ordinal()])
	//*   4   10:getstatic       #157 <Field int[] ModernAsyncTask$4.$SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
	//*   5   13:aload_0         
	//*   6   14:getfield        #96  <Field ModernAsyncTask$Status mStatus>
	//*   7   17:invokevirtual   #161 <Method int ModernAsyncTask$Status.ordinal()>
	//*   8   20:iaload          
			{
	//*   9   21:lookupswitch    2: default 48
	//	               1: 51
	//	               2: 61
	//*  10   48:goto            71
			case 1: // '\001'
				throw new IllegalStateException("Cannot execute task: the task is already running.");
	//   11   51:new             #163 <Class IllegalStateException>
	//   12   54:dup             
	//   13   55:ldc1            #165 <String "Cannot execute task: the task is already running.">
	//   14   57:invokespecial   #168 <Method void IllegalStateException(String)>
	//   15   60:athrow          

			case 2: // '\002'
				throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
	//   16   61:new             #163 <Class IllegalStateException>
	//   17   64:dup             
	//   18   65:ldc1            #170 <String "Cannot execute task: the task has already been executed (a task can be executed only once)">
	//   19   67:invokespecial   #168 <Method void IllegalStateException(String)>
	//   20   70:athrow          
			}
		mStatus = Status.RUNNING;
	//   21   71:aload_0         
	//   22   72:getstatic       #173 <Field ModernAsyncTask$Status ModernAsyncTask$Status.RUNNING>
	//   23   75:putfield        #96  <Field ModernAsyncTask$Status mStatus>
		onPreExecute();
	//   24   78:aload_0         
	//   25   79:invokevirtual   #176 <Method void onPreExecute()>
		mWorker.mParams = aobj;
	//   26   82:aload_0         
	//   27   83:getfield        #108 <Field ModernAsyncTask$WorkerRunnable mWorker>
	//   28   86:aload_2         
	//   29   87:putfield        #180 <Field Object[] ModernAsyncTask$WorkerRunnable.mParams>
		executor.execute(((Runnable) (mFuture)));
	//   30   90:aload_1         
	//   31   91:aload_0         
	//   32   92:getfield        #113 <Field FutureTask mFuture>
	//   33   95:invokeinterface #122 <Method void Executor.execute(Runnable)>
		return this;
	//   34  100:aload_0         
	//   35  101:areturn         
	}

	void finish(Object obj)
	{
		if(isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #187 <Method boolean isCancelled()>
	//*   2    4:ifeq            15
			onCancelled(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #190 <Method void onCancelled(Object)>
		else
	//*   6   12:goto            20
			onPostExecute(obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #193 <Method void onPostExecute(Object)>
		mStatus = Status.FINISHED;
	//   10   20:aload_0         
	//   11   21:getstatic       #196 <Field ModernAsyncTask$Status ModernAsyncTask$Status.FINISHED>
	//   12   24:putfield        #96  <Field ModernAsyncTask$Status mStatus>
	//   13   27:return          
	}

	public final Object get()
		throws InterruptedException, ExecutionException
	{
		return mFuture.get();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field FutureTask mFuture>
	//    2    4:invokevirtual   #205 <Method Object FutureTask.get()>
	//    3    7:areturn         
	}

	public final Object get(long l, TimeUnit timeunit)
		throws InterruptedException, ExecutionException, TimeoutException
	{
		return mFuture.get(l, timeunit);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field FutureTask mFuture>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #212 <Method Object FutureTask.get(long, TimeUnit)>
	//    5    9:areturn         
	}

	public final Status getStatus()
	{
		return mStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ModernAsyncTask$Status mStatus>
	//    2    4:areturn         
	}

	public final boolean isCancelled()
	{
		return mCancelled.get();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field AtomicBoolean mCancelled>
	//    2    4:invokevirtual   #217 <Method boolean AtomicBoolean.get()>
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
	//    1    1:invokevirtual   #219 <Method void onCancelled()>
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

	Object postResult(Object obj)
	{
		getHandler().obtainMessage(1, ((Object) (new AsyncTaskResult(this, new Object[] {
			obj
		})))).sendToTarget();
	//    0    0:invokestatic    #226 <Method Handler getHandler()>
	//    1    3:iconst_1        
	//    2    4:new             #15  <Class ModernAsyncTask$AsyncTaskResult>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:aastore         
	//   11   17:invokespecial   #229 <Method void ModernAsyncTask$AsyncTaskResult(ModernAsyncTask, Object[])>
	//   12   20:invokevirtual   #235 <Method Message Handler.obtainMessage(int, Object)>
	//   13   23:invokevirtual   #240 <Method void Message.sendToTarget()>
		return obj;
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	void postResultIfNotInvoked(Object obj)
	{
		if(!mTaskInvoked.get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field AtomicBoolean mTaskInvoked>
	//*   2    4:invokevirtual   #217 <Method boolean AtomicBoolean.get()>
	//*   3    7:ifne            16
			postResult(obj);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #244 <Method Object postResult(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected final transient void publishProgress(Object aobj[])
	{
		if(!isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #187 <Method boolean isCancelled()>
	//*   2    4:ifne            26
			getHandler().obtainMessage(2, ((Object) (new AsyncTaskResult(this, aobj)))).sendToTarget();
	//    3    7:invokestatic    #226 <Method Handler getHandler()>
	//    4   10:iconst_2        
	//    5   11:new             #15  <Class ModernAsyncTask$AsyncTaskResult>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #229 <Method void ModernAsyncTask$AsyncTaskResult(ModernAsyncTask, Object[])>
	//   10   20:invokevirtual   #235 <Method Message Handler.obtainMessage(int, Object)>
	//   11   23:invokevirtual   #240 <Method void Message.sendToTarget()>
	//   12   26:return          
	}

	private static final int CORE_POOL_SIZE = 5;
	private static final int KEEP_ALIVE = 1;
	private static final String LOG_TAG = "AsyncTask";
	private static final int MAXIMUM_POOL_SIZE = 128;
	private static final int MESSAGE_POST_PROGRESS = 2;
	private static final int MESSAGE_POST_RESULT = 1;
	public static final Executor THREAD_POOL_EXECUTOR;
	private static volatile Executor sDefaultExecutor;
	private static InternalHandler sHandler;
	private static final BlockingQueue sPoolWorkQueue;
	private static final ThreadFactory sThreadFactory;
	private final AtomicBoolean mCancelled = new AtomicBoolean();
	private final FutureTask mFuture;
	private volatile Status mStatus;
	private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
	private final WorkerRunnable mWorker = new WorkerRunnable() {

		public Object call()
			throws Exception
		{
			Object obj;
			Object obj1;
			Object obj2;
			Object obj3;
			mTaskInvoked.set(true);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ModernAsyncTask this$0>
		//    2    4:invokestatic    #27  <Method AtomicBoolean ModernAsyncTask.access$000(ModernAsyncTask)>
		//    3    7:iconst_1        
		//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
			obj3 = null;
		//    5   11:aconst_null     
		//    6   12:astore          4
			obj2 = null;
		//    7   14:aconst_null     
		//    8   15:astore_3        
			obj1 = obj2;
		//    9   16:aload_3         
		//   10   17:astore_2        
			obj = ((Object) (obj3));
		//   11   18:aload           4
		//   12   20:astore_1        
			Process.setThreadPriority(10);
		//   13   21:bipush          10
		//   14   23:invokestatic    #39  <Method void Process.setThreadPriority(int)>
			obj1 = obj2;
		//   15   26:aload_3         
		//   16   27:astore_2        
			obj = ((Object) (obj3));
		//   17   28:aload           4
		//   18   30:astore_1        
			obj2 = doInBackground(mParams);
		//   19   31:aload_0         
		//   20   32:getfield        #15  <Field ModernAsyncTask this$0>
		//   21   35:aload_0         
		//   22   36:getfield        #43  <Field Object[] mParams>
		//   23   39:invokevirtual   #47  <Method Object ModernAsyncTask.doInBackground(Object[])>
		//   24   42:astore_3        
			obj1 = obj2;
		//   25   43:aload_3         
		//   26   44:astore_2        
			obj = obj2;
		//   27   45:aload_3         
		//   28   46:astore_1        
			Binder.flushPendingCommands();
		//   29   47:invokestatic    #52  <Method void Binder.flushPendingCommands()>
			postResult(obj2);
		//   30   50:aload_0         
		//   31   51:getfield        #15  <Field ModernAsyncTask this$0>
		//   32   54:aload_3         
		//   33   55:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
		//   34   58:pop             
			return obj2;
		//   35   59:aload_3         
		//   36   60:areturn         
			Throwable throwable;
			throwable;
		//   37   61:astore_3        
			obj = obj1;
		//   38   62:aload_2         
		//   39   63:astore_1        
			mCancelled.set(true);
		//   40   64:aload_0         
		//   41   65:getfield        #15  <Field ModernAsyncTask this$0>
		//   42   68:invokestatic    #59  <Method AtomicBoolean ModernAsyncTask.access$100(ModernAsyncTask)>
		//   43   71:iconst_1        
		//   44   72:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
			obj = obj1;
		//   45   75:aload_2         
		//   46   76:astore_1        
			throw throwable;
		//   47   77:aload_3         
		//   48   78:athrow          
			Exception exception;
			exception;
		//   49   79:astore_2        
			postResult(obj);
		//   50   80:aload_0         
		//   51   81:getfield        #15  <Field ModernAsyncTask this$0>
		//   52   84:aload_1         
		//   53   85:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
		//   54   88:pop             
			throw exception;
		//   55   89:aload_2         
		//   56   90:athrow          
		}

		final ModernAsyncTask this$0;

			
			{
				this$0 = ModernAsyncTask.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ModernAsyncTask this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #16  <Method void ModernAsyncTask$WorkerRunnable()>
			//    5    9:return          
			}
	}
;

	static 
	{
		sThreadFactory = new ThreadFactory() {

			public Thread newThread(Runnable runnable)
			{
				return new Thread(runnable, (new StringBuilder()).append("ModernAsyncTask #").append(mCount.getAndIncrement()).toString());
			//    0    0:new             #26  <Class Thread>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:new             #28  <Class StringBuilder>
			//    4    8:dup             
			//    5    9:invokespecial   #29  <Method void StringBuilder()>
			//    6   12:ldc1            #31  <String "ModernAsyncTask #">
			//    7   14:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
			//    8   17:aload_0         
			//    9   18:getfield        #21  <Field AtomicInteger mCount>
			//   10   21:invokevirtual   #39  <Method int AtomicInteger.getAndIncrement()>
			//   11   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
			//   12   27:invokevirtual   #46  <Method String StringBuilder.toString()>
			//   13   30:invokespecial   #49  <Method void Thread(Runnable, String)>
			//   14   33:areturn         
			}

			private final AtomicInteger mCount = new AtomicInteger(1);

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void Object()>
			//    2    4:aload_0         
			//    3    5:new             #16  <Class AtomicInteger>
			//    4    8:dup             
			//    5    9:iconst_1        
			//    6   10:invokespecial   #19  <Method void AtomicInteger(int)>
			//    7   13:putfield        #21  <Field AtomicInteger mCount>
			//    8   16:return          
			}
		}
;
	//    0    0:new             #7   <Class ModernAsyncTask$1>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void ModernAsyncTask$1()>
	//    3    7:putstatic       #67  <Field ThreadFactory sThreadFactory>
		sPoolWorkQueue = ((BlockingQueue) (new LinkedBlockingQueue(10)));
	//    4   10:new             #69  <Class LinkedBlockingQueue>
	//    5   13:dup             
	//    6   14:bipush          10
	//    7   16:invokespecial   #72  <Method void LinkedBlockingQueue(int)>
	//    8   19:putstatic       #74  <Field BlockingQueue sPoolWorkQueue>
		THREAD_POOL_EXECUTOR = ((Executor) (new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory)));
	//    9   22:new             #76  <Class ThreadPoolExecutor>
	//   10   25:dup             
	//   11   26:iconst_5        
	//   12   27:sipush          128
	//   13   30:lconst_1        
	//   14   31:getstatic       #82  <Field TimeUnit TimeUnit.SECONDS>
	//   15   34:getstatic       #74  <Field BlockingQueue sPoolWorkQueue>
	//   16   37:getstatic       #67  <Field ThreadFactory sThreadFactory>
	//   17   40:invokespecial   #85  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, BlockingQueue, ThreadFactory)>
	//   18   43:putstatic       #87  <Field Executor THREAD_POOL_EXECUTOR>
		sDefaultExecutor = THREAD_POOL_EXECUTOR;
	//   19   46:getstatic       #87  <Field Executor THREAD_POOL_EXECUTOR>
	//   20   49:putstatic       #89  <Field Executor sDefaultExecutor>
	//*  21   52:return          
	}


/*
	static AtomicBoolean access$000(ModernAsyncTask modernasynctask)
	{
		return modernasynctask.mTaskInvoked;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field AtomicBoolean mTaskInvoked>
	//    2    4:areturn         
	}

*/


/*
	static AtomicBoolean access$100(ModernAsyncTask modernasynctask)
	{
		return modernasynctask.mCancelled;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field AtomicBoolean mCancelled>
	//    2    4:areturn         
	}

*/
}
