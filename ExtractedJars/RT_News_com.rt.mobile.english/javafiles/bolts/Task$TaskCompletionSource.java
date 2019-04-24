// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			Task

public class Task$TaskCompletionSource
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
			synchronized(Task.access$300(Task.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Task this$0>
	//*   2    4:invokestatic    #57  <Method Object Task.access$300(Task)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
			{
				if(!Task.access$400(Task.this))
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
		Task.access$402(Task.this, true);
	//   14   24:aload_0         
	//   15   25:getfield        #13  <Field Task this$0>
	//   16   28:iconst_1        
	//   17   29:invokestatic    #65  <Method boolean Task.access$402(Task, boolean)>
	//   18   32:pop             
		Task.access$502(Task.this, true);
	//   19   33:aload_0         
	//   20   34:getfield        #13  <Field Task this$0>
	//   21   37:iconst_1        
	//   22   38:invokestatic    #68  <Method boolean Task.access$502(Task, boolean)>
	//   23   41:pop             
		Task.access$300(Task.this).notifyAll();
	//   24   42:aload_0         
	//   25   43:getfield        #13  <Field Task this$0>
	//   26   46:invokestatic    #57  <Method Object Task.access$300(Task)>
	//   27   49:invokevirtual   #71  <Method void Object.notifyAll()>
		Task.access$600(Task.this);
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
			synchronized(Task.access$300(Task.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Task this$0>
	//*   2    4:invokestatic    #57  <Method Object Task.access$300(Task)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
			{
				if(!Task.access$400(Task.this))
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
		Task.access$402(Task.this, true);
	//   14   24:aload_0         
	//   15   25:getfield        #13  <Field Task this$0>
	//   16   28:iconst_1        
	//   17   29:invokestatic    #65  <Method boolean Task.access$402(Task, boolean)>
	//   18   32:pop             
		Task.access$802(Task.this, exception);
	//   19   33:aload_0         
	//   20   34:getfield        #13  <Field Task this$0>
	//   21   37:aload_1         
	//   22   38:invokestatic    #78  <Method Exception Task.access$802(Task, Exception)>
	//   23   41:pop             
		Task.access$300(Task.this).notifyAll();
	//   24   42:aload_0         
	//   25   43:getfield        #13  <Field Task this$0>
	//   26   46:invokestatic    #57  <Method Object Task.access$300(Task)>
	//   27   49:invokevirtual   #71  <Method void Object.notifyAll()>
		Task.access$600(Task.this);
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
			synchronized(Task.access$300(Task.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Task this$0>
	//*   2    4:invokestatic    #57  <Method Object Task.access$300(Task)>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
			{
				if(!Task.access$400(Task.this))
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
		Task.access$402(Task.this, true);
	//   14   24:aload_0         
	//   15   25:getfield        #13  <Field Task this$0>
	//   16   28:iconst_1        
	//   17   29:invokestatic    #65  <Method boolean Task.access$402(Task, boolean)>
	//   18   32:pop             
		Task.access$702(Task.this, obj);
	//   19   33:aload_0         
	//   20   34:getfield        #13  <Field Task this$0>
	//   21   37:aload_1         
	//   22   38:invokestatic    #82  <Method Object Task.access$702(Task, Object)>
	//   23   41:pop             
		Task.access$300(Task.this).notifyAll();
	//   24   42:aload_0         
	//   25   43:getfield        #13  <Field Task this$0>
	//   26   46:invokestatic    #57  <Method Object Task.access$300(Task)>
	//   27   49:invokevirtual   #71  <Method void Object.notifyAll()>
		Task.access$600(Task.this);
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

	private Task$TaskCompletionSource()
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

	Task$TaskCompletionSource(Task._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void Task$TaskCompletionSource(Task)>
	//    3    5:return          
	}
}
