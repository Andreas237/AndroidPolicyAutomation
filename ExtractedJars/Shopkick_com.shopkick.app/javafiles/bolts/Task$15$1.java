// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//			Continuation, CancellationToken, TaskCompletionSource, Task

class Task$15$1
	implements Continuation
{

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
		if(val$ct != null && val$ct.isCancellationRequested())
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
			val$tcs.setCancelled();
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
			val$tcs.setCancelled();
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
			val$tcs.setError(task.getError());
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
			val$tcs.setResult(task.getResult());
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

	final Task._cls15 this$0;

	Task$15$1()
	{
		this$0 = Task._cls15.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Task$15 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class bolts/Task$15

/* anonymous class */
	static final class Task._cls15
		implements Runnable
	{

		public void run()
		{
			CancellationToken cancellationtoken = ct;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field CancellationToken val$ct>
		//    2    4:astore_1        
			if(cancellationtoken != null && cancellationtoken.isCancellationRequested())
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
			task1.continueWith(((Continuation) (new Task._cls15._cls1())));
			return;
			CancellationException cancellationexception;
		//*  44   86:astore_1        
		//*  45   87:goto            78
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

}
