// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;


// Referenced classes of package bolts:
//			Task, TaskCompletionSource

static final class Task$1
	implements Runnable
{

	public void run()
	{
		val$tcs.trySetResult(((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TaskCompletionSource val$tcs>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #28  <Method boolean TaskCompletionSource.trySetResult(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	final TaskCompletionSource val$tcs;

	Task$1(TaskCompletionSource taskcompletionsource)
	{
		val$tcs = taskcompletionsource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TaskCompletionSource val$tcs>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
