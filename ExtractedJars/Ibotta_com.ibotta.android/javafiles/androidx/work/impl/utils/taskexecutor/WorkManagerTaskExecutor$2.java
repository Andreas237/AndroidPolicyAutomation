// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package androidx.work.impl.utils.taskexecutor:
//			WorkManagerTaskExecutor

class WorkManagerTaskExecutor$2
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		runnable = ((Runnable) (Executors.defaultThreadFactory().newThread(runnable)));
	//    0    0:invokestatic    #27  <Method ThreadFactory Executors.defaultThreadFactory()>
	//    1    3:aload_1         
	//    2    4:invokeinterface #29  <Method Thread ThreadFactory.newThread(Runnable)>
	//    3    9:astore_1        
		mCurrentBackgroundExecutorThread = ((Thread) (runnable));
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field WorkManagerTaskExecutor this$0>
	//    6   14:aload_1         
	//    7   15:putfield        #33  <Field Thread WorkManagerTaskExecutor.mCurrentBackgroundExecutorThread>
		return ((Thread) (runnable));
	//    8   18:aload_1         
	//    9   19:areturn         
	}

	final WorkManagerTaskExecutor this$0;

	WorkManagerTaskExecutor$2()
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
