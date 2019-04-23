// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

// Referenced classes of package androidx.work.impl.utils.taskexecutor:
//			WorkManagerTaskExecutor

class WorkManagerTaskExecutor$1
	implements Executor
{

	public void execute(Runnable runnable)
	{
		postToMainThread(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field WorkManagerTaskExecutor this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void WorkManagerTaskExecutor.postToMainThread(Runnable)>
	//    4    8:return          
	}

	final WorkManagerTaskExecutor this$0;

	WorkManagerTaskExecutor$1()
	{
		this$0 = WorkManagerTaskExecutor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field WorkManagerTaskExecutor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
