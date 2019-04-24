// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			Continuation, Task

class Task$2
	implements Continuation
{

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

	Task$2()
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
