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
	private static class AsyncTaskResult
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

	private static class InternalHandler extends Handler
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
		//*   6   12:tableswitch     1 2: default 36
		//		               1 49
		//		               2 37
			default:
				return;
		//    7   36:return          

			case 2: // '\002'
				asynctaskresult.mTask.onProgressUpdate(asynctaskresult.mData);
		//    8   37:aload_2         
		//    9   38:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
		//   10   41:aload_2         
		//   11   42:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
		//   12   45:invokevirtual   #45  <Method void ModernAsyncTask.onProgressUpdate(Object[])>
				return;
		//   13   48:return          

			case 1: // '\001'
				asynctaskresult.mTask.finish(asynctaskresult.mData[0]);
		//   14   49:aload_2         
		//   15   50:getfield        #37  <Field ModernAsyncTask ModernAsyncTask$AsyncTaskResult.mTask>
		//   16   53:aload_2         
		//   17   54:getfield        #41  <Field Object[] ModernAsyncTask$AsyncTaskResult.mData>
		//   18   57:iconst_0        
		//   19   58:aaload          
		//   20   59:invokevirtual   #49  <Method void ModernAsyncTask.finish(Object)>
				return;
		//   21   62:return          
			}
		}

		InternalHandler()
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

	private static abstract class WorkerRunnable
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


	ModernAsyncTask()
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
				CancellationException cancellationexception;
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
			//*   8   14:astore_1        
			//*   9   15:new             #38  <Class RuntimeException>
			//*  10   18:dup             
			//*  11   19:ldc1            #40  <String "An error occurred while executing doInBackground()">
			//*  12   21:aload_1         
			//*  13   22:invokespecial   #43  <Method void RuntimeException(String, Throwable)>
			//*  14   25:athrow          
			//*  15   26:aload_0         
			//*  16   27:getfield        #15  <Field ModernAsyncTask this$0>
			//*  17   30:aconst_null     
			//*  18   31:invokevirtual   #36  <Method void ModernAsyncTask.postResultIfNotInvoked(Object)>
			//*  19   34:return          
			//*  20   35:astore_1        
			//*  21   36:new             #38  <Class RuntimeException>
			//*  22   39:dup             
			//*  23   40:ldc1            #40  <String "An error occurred while executing doInBackground()">
			//*  24   42:aload_1         
			//*  25   43:invokevirtual   #47  <Method Throwable ExecutionException.getCause()>
			//*  26   46:invokespecial   #43  <Method void RuntimeException(String, Throwable)>
			//*  27   49:athrow          
				catch(InterruptedException interruptedexception)
			//*  28   50:astore_1        
				{
					Log.w("AsyncTask", ((Throwable) (interruptedexception)));
			//   29   51:ldc1            #49  <String "AsyncTask">
			//   30   53:aload_1         
			//   31   54:invokestatic    #55  <Method int Log.w(String, Throwable)>
			//   32   57:pop             
				}
				catch(ExecutionException executionexception)
				{
					throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
				}
			//*  33   58:return          
				// Misplaced declaration of an exception variable
				catch(CancellationException cancellationexception)
				{
					postResultIfNotInvoked(((Object) (null)));
					return;
				}
				catch(Throwable throwable)
				{
					throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
				}
			//*  34   59:astore_1        
			//*  35   60:goto            26
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
		android/support/v4/content/ModernAsyncTask;
	//   15   29:ldc1            #2   <Class ModernAsyncTask>
		JVM INSTR monitorexit ;
	//   16   31:monitorexit     
		throw exception;
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
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
			//*  10   23:getstatic       #31  <Field ModernAsyncTask$Status ModernAsyncTask$Status.FINISHED>
			//*  11   26:invokevirtual   #28  <Method int ModernAsyncTask$Status.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$android$support$v4$content$ModernAsyncTask$Status[Status.FINISHED.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		if(mStatus != Status.PENDING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field ModernAsyncTask$Status mStatus>
	//*   2    4:getstatic       #94  <Field ModernAsyncTask$Status ModernAsyncTask$Status.PENDING>
	//*   3    7:if_acmpeq       74
		{
			switch(_cls4..SwitchMap.android.support.v4.content.ModernAsyncTask.Status[mStatus.ordinal()])
	//*   4   10:getstatic       #157 <Field int[] ModernAsyncTask$4.$SwitchMap$android$support$v4$content$ModernAsyncTask$Status>
	//*   5   13:aload_0         
	//*   6   14:getfield        #96  <Field ModernAsyncTask$Status mStatus>
	//*   7   17:invokevirtual   #161 <Method int ModernAsyncTask$Status.ordinal()>
	//*   8   20:iaload          
			{
	//*   9   21:tableswitch     1 2: default 44
	//	               1 64
	//	               2 54
			default:
				throw new IllegalStateException("We should never reach this state");
	//   10   44:new             #163 <Class IllegalStateException>
	//   11   47:dup             
	//   12   48:ldc1            #165 <String "We should never reach this state">
	//   13   50:invokespecial   #168 <Method void IllegalStateException(String)>
	//   14   53:athrow          

			case 2: // '\002'
				throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
	//   15   54:new             #163 <Class IllegalStateException>
	//   16   57:dup             
	//   17   58:ldc1            #170 <String "Cannot execute task: the task has already been executed (a task can be executed only once)">
	//   18   60:invokespecial   #168 <Method void IllegalStateException(String)>
	//   19   63:athrow          

			case 1: // '\001'
				throw new IllegalStateException("Cannot execute task: the task is already running.");
	//   20   64:new             #163 <Class IllegalStateException>
	//   21   67:dup             
	//   22   68:ldc1            #172 <String "Cannot execute task: the task is already running.">
	//   23   70:invokespecial   #168 <Method void IllegalStateException(String)>
	//   24   73:athrow          
			}
		} else
		{
			mStatus = Status.RUNNING;
	//   25   74:aload_0         
	//   26   75:getstatic       #175 <Field ModernAsyncTask$Status ModernAsyncTask$Status.RUNNING>
	//   27   78:putfield        #96  <Field ModernAsyncTask$Status mStatus>
			onPreExecute();
	//   28   81:aload_0         
	//   29   82:invokevirtual   #178 <Method void onPreExecute()>
			mWorker.mParams = aobj;
	//   30   85:aload_0         
	//   31   86:getfield        #108 <Field ModernAsyncTask$WorkerRunnable mWorker>
	//   32   89:aload_2         
	//   33   90:putfield        #182 <Field Object[] ModernAsyncTask$WorkerRunnable.mParams>
			executor.execute(((Runnable) (mFuture)));
	//   34   93:aload_1         
	//   35   94:aload_0         
	//   36   95:getfield        #113 <Field FutureTask mFuture>
	//   37   98:invokeinterface #122 <Method void Executor.execute(Runnable)>
			return this;
	//   38  103:aload_0         
	//   39  104:areturn         
		}
	}

	void finish(Object obj)
	{
		if(isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method boolean isCancelled()>
	//*   2    4:ifeq            15
			onCancelled(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #192 <Method void onCancelled(Object)>
		else
	//*   6   12:goto            20
			onPostExecute(obj);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #195 <Method void onPostExecute(Object)>
		mStatus = Status.FINISHED;
	//   10   20:aload_0         
	//   11   21:getstatic       #198 <Field ModernAsyncTask$Status ModernAsyncTask$Status.FINISHED>
	//   12   24:putfield        #96  <Field ModernAsyncTask$Status mStatus>
	//   13   27:return          
	}

	public final Object get()
		throws InterruptedException, ExecutionException
	{
		return mFuture.get();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field FutureTask mFuture>
	//    2    4:invokevirtual   #207 <Method Object FutureTask.get()>
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
	//    4    6:invokevirtual   #214 <Method Object FutureTask.get(long, TimeUnit)>
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
	//    2    4:invokevirtual   #219 <Method boolean AtomicBoolean.get()>
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
	//    1    1:invokevirtual   #221 <Method void onCancelled()>
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
	//    0    0:invokestatic    #228 <Method Handler getHandler()>
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
	//   11   17:invokespecial   #231 <Method void ModernAsyncTask$AsyncTaskResult(ModernAsyncTask, Object[])>
	//   12   20:invokevirtual   #237 <Method Message Handler.obtainMessage(int, Object)>
	//   13   23:invokevirtual   #242 <Method void Message.sendToTarget()>
		return obj;
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	void postResultIfNotInvoked(Object obj)
	{
		if(!mTaskInvoked.get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field AtomicBoolean mTaskInvoked>
	//*   2    4:invokevirtual   #219 <Method boolean AtomicBoolean.get()>
	//*   3    7:ifne            16
			postResult(obj);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #246 <Method Object postResult(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected final transient void publishProgress(Object aobj[])
	{
		if(!isCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #189 <Method boolean isCancelled()>
	//*   2    4:ifne            26
			getHandler().obtainMessage(2, ((Object) (new AsyncTaskResult(this, aobj)))).sendToTarget();
	//    3    7:invokestatic    #228 <Method Handler getHandler()>
	//    4   10:iconst_2        
	//    5   11:new             #15  <Class ModernAsyncTask$AsyncTaskResult>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #231 <Method void ModernAsyncTask$AsyncTaskResult(ModernAsyncTask, Object[])>
	//   10   20:invokevirtual   #237 <Method Message Handler.obtainMessage(int, Object)>
	//   11   23:invokevirtual   #242 <Method void Message.sendToTarget()>
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
			mTaskInvoked.set(true);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ModernAsyncTask this$0>
		//    2    4:invokestatic    #27  <Method AtomicBoolean ModernAsyncTask.access$000(ModernAsyncTask)>
		//    3    7:iconst_1        
		//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
			obj2 = null;
		//    5   11:aconst_null     
		//    6   12:astore_3        
			obj1 = null;
		//    7   13:aconst_null     
		//    8   14:astore_2        
			obj = obj1;
		//    9   15:aload_2         
		//   10   16:astore_1        
			Process.setThreadPriority(10);
		//   11   17:bipush          10
		//   12   19:invokestatic    #39  <Method void Process.setThreadPriority(int)>
			obj = obj1;
		//   13   22:aload_2         
		//   14   23:astore_1        
			obj1 = doInBackground(mParams);
		//   15   24:aload_0         
		//   16   25:getfield        #15  <Field ModernAsyncTask this$0>
		//   17   28:aload_0         
		//   18   29:getfield        #43  <Field Object[] mParams>
		//   19   32:invokevirtual   #47  <Method Object ModernAsyncTask.doInBackground(Object[])>
		//   20   35:astore_2        
			try
			{
				Binder.flushPendingCommands();
		//   21   36:invokestatic    #52  <Method void Binder.flushPendingCommands()>
			}
		//*  22   39:aload_0         
		//*  23   40:getfield        #15  <Field ModernAsyncTask this$0>
		//*  24   43:aload_2         
		//*  25   44:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
		//*  26   47:pop             
		//*  27   48:aload_2         
		//*  28   49:areturn         
		//*  29   50:astore_3        
		//*  30   51:aload_2         
		//*  31   52:astore_1        
		//*  32   53:aload_3         
		//*  33   54:astore_2        
		//*  34   55:goto            88
			// Misplaced declaration of an exception variable
			catch(Object obj2)
		//*  35   58:astore_3        
			{
				break MISSING_BLOCK_LABEL_71;
		//   36   59:goto            71
			}
			postResult(obj1);
			return obj1;
			obj2;
			obj = obj1;
			obj1 = obj2;
			break MISSING_BLOCK_LABEL_88;
			obj1;
		//   37   62:astore_2        
			break MISSING_BLOCK_LABEL_88;
		//   38   63:goto            88
			obj;
		//   39   66:astore_1        
			obj1 = obj2;
		//   40   67:aload_3         
		//   41   68:astore_2        
			obj2 = obj;
		//   42   69:aload_1         
		//   43   70:astore_3        
			obj = obj1;
		//   44   71:aload_2         
		//   45   72:astore_1        
			mCancelled.set(true);
		//   46   73:aload_0         
		//   47   74:getfield        #15  <Field ModernAsyncTask this$0>
		//   48   77:invokestatic    #59  <Method AtomicBoolean ModernAsyncTask.access$100(ModernAsyncTask)>
		//   49   80:iconst_1        
		//   50   81:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
			obj = obj1;
		//   51   84:aload_2         
		//   52   85:astore_1        
			throw obj2;
		//   53   86:aload_3         
		//   54   87:athrow          
			postResult(obj);
		//   55   88:aload_0         
		//   56   89:getfield        #15  <Field ModernAsyncTask this$0>
		//   57   92:aload_1         
		//   58   93:invokevirtual   #56  <Method Object ModernAsyncTask.postResult(Object)>
		//   59   96:pop             
			throw obj1;
		//   60   97:aload_2         
		//   61   98:athrow          
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
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #26  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #27  <Method void StringBuilder()>
			//    3    7:astore_2        
				stringbuilder.append("ModernAsyncTask #");
			//    4    8:aload_2         
			//    5    9:ldc1            #29  <String "ModernAsyncTask #">
			//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(mCount.getAndIncrement());
			//    8   15:aload_2         
			//    9   16:aload_0         
			//   10   17:getfield        #21  <Field AtomicInteger mCount>
			//   11   20:invokevirtual   #37  <Method int AtomicInteger.getAndIncrement()>
			//   12   23:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
			//   13   26:pop             
				return new Thread(runnable, stringbuilder.toString());
			//   14   27:new             #42  <Class Thread>
			//   15   30:dup             
			//   16   31:aload_1         
			//   17   32:aload_2         
			//   18   33:invokevirtual   #46  <Method String StringBuilder.toString()>
			//   19   36:invokespecial   #49  <Method void Thread(Runnable, String)>
			//   20   39:areturn         
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
