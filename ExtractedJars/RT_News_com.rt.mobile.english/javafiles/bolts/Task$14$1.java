// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//			Continuation, CancellationToken, Task

class Task$14$1
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
	//*   1    1:getfield        #18  <Field Task$14 this$0>
	//*   2    4:getfield        #33  <Field CancellationToken Task$14.val$ct>
	//*   3    7:ifnull          35
	//*   4   10:aload_0         
	//*   5   11:getfield        #18  <Field Task$14 this$0>
	//*   6   14:getfield        #33  <Field CancellationToken Task$14.val$ct>
	//*   7   17:invokevirtual   #39  <Method boolean CancellationToken.isCancellationRequested()>
	//*   8   20:ifeq            35
		{
			val$tcs.setCancelled();
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
			val$tcs.setCancelled();
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
			val$tcs.setError(task.getError());
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
			val$tcs.setResult(task.getResult());
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

	final Task._cls14 this$0;

	Task$14$1()
	{
		this$0 = Task._cls14.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Task$14 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class bolts/Task$14

/* anonymous class */
	static final class Task._cls14
		implements Runnable
	{

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
			task1.continueWith(((Continuation) (new Task._cls14._cls1())));
			return;
			CancellationException cancellationexception;
		//*  43   87:astore_1        
		//*  44   88:goto            79
		}

		final Continuation val$continuation;
		final CancellationToken val$ct;
		final Task val$task;
		final Task.TaskCompletionSource val$tcs;

			
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

}
