// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.concurrency;

import java.util.LinkedList;
import java.util.concurrent.Executor;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//			AsyncTask

private static class AsyncTask$SerialExecutor
	implements Executor
{

	public void execute(final Runnable r)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		tasks.offer(((Object) (new Runnable() {

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

			final AsyncTask.SerialExecutor this$0;
			final Runnable val$r;

			
			{
				this$0 = AsyncTask.SerialExecutor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AsyncTask$SerialExecutor this$0>
				r = runnable;
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
		r;
	//   19   33:astore_1        
	//*  20   34:aload_0         
		throw r;
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

	private AsyncTask$SerialExecutor()
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

	AsyncTask$SerialExecutor(AsyncTask._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void AsyncTask$SerialExecutor()>
	//    2    4:return          
	}
}
