// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			Task

public class TaskCompletionSource
{

	public TaskCompletionSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class Task>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void Task()>
	//    6   12:putfield        #17  <Field Task task>
	//    7   15:return          
	}

	public Task getTask()
	{
		return task;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Task task>
	//    2    4:areturn         
	}

	public void setCancelled()
	{
		if(trySetCancelled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #27  <Method boolean trySetCancelled()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Cannot cancel a completed task.");
	//    4    8:new             #29  <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #31  <String "Cannot cancel a completed task.">
	//    7   14:invokespecial   #34  <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public void setError(Exception exception)
	{
		if(trySetError(exception))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #40  <Method boolean trySetError(Exception)>
	//*   3    5:ifeq            9
			return;
	//    4    8:return          
		else
			throw new IllegalStateException("Cannot set the error on a completed task.");
	//    5    9:new             #29  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #42  <String "Cannot set the error on a completed task.">
	//    8   15:invokespecial   #34  <Method void IllegalStateException(String)>
	//    9   18:athrow          
	}

	public void setResult(Object obj)
	{
		if(trySetResult(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #48  <Method boolean trySetResult(Object)>
	//*   3    5:ifeq            9
			return;
	//    4    8:return          
		else
			throw new IllegalStateException("Cannot set the result of a completed task.");
	//    5    9:new             #29  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #50  <String "Cannot set the result of a completed task.">
	//    8   15:invokespecial   #34  <Method void IllegalStateException(String)>
	//    9   18:athrow          
	}

	public boolean trySetCancelled()
	{
		return task.trySetCancelled();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Task task>
	//    2    4:invokevirtual   #52  <Method boolean Task.trySetCancelled()>
	//    3    7:ireturn         
	}

	public boolean trySetError(Exception exception)
	{
		return task.trySetError(exception);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Task task>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method boolean Task.trySetError(Exception)>
	//    4    8:ireturn         
	}

	public boolean trySetResult(Object obj)
	{
		return task.trySetResult(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Task task>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #54  <Method boolean Task.trySetResult(Object)>
	//    4    8:ireturn         
	}

	private final Task task = new Task();
}
