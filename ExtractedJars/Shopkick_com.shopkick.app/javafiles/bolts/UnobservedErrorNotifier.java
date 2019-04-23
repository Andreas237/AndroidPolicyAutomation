// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			Task, UnobservedTaskException

class UnobservedErrorNotifier
{

	public UnobservedErrorNotifier(Task task1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		task = task1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Task task>
	//    5    9:return          
	}

	protected void finalize()
		throws Throwable
	{
		Task task1 = task;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Task task>
	//    2    4:astore_1        
		if(task1 == null)
			break MISSING_BLOCK_LABEL_35;
	//    3    5:aload_1         
	//    4    6:ifnull          35
		Task.UnobservedExceptionHandler unobservedexceptionhandler = Task.getUnobservedExceptionHandler();
	//    5    9:invokestatic    #26  <Method Task$UnobservedExceptionHandler Task.getUnobservedExceptionHandler()>
	//    6   12:astore_2        
		if(unobservedexceptionhandler == null)
			break MISSING_BLOCK_LABEL_35;
	//    7   13:aload_2         
	//    8   14:ifnull          35
		unobservedexceptionhandler.unobservedException(task1, new UnobservedTaskException(((Throwable) (task1.getError()))));
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:new             #28  <Class UnobservedTaskException>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokevirtual   #32  <Method Exception Task.getError()>
	//   15   27:invokespecial   #35  <Method void UnobservedTaskException(Throwable)>
	//   16   30:invokeinterface #41  <Method void Task$UnobservedExceptionHandler.unobservedException(Task, UnobservedTaskException)>
		super.finalize();
	//   17   35:aload_0         
	//   18   36:invokespecial   #43  <Method void Object.finalize()>
		return;
	//   19   39:return          
		Exception exception;
		exception;
	//   20   40:astore_1        
		super.finalize();
	//   21   41:aload_0         
	//   22   42:invokespecial   #43  <Method void Object.finalize()>
		throw exception;
	//   23   45:aload_1         
	//   24   46:athrow          
	}

	public void setObserved()
	{
		task = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #14  <Field Task task>
	//    3    5:return          
	}

	private Task task;
}
