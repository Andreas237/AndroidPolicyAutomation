// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			BackgroundPriorityRunnable, ExecutorUtils

class ExecutorUtils$1$1 extends BackgroundPriorityRunnable
{

	public void onRun()
	{
		val$runnable.run();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Runnable val$runnable>
	//    2    4:invokeinterface #29  <Method void Runnable.run()>
	//    3    9:return          
	}

	final ExecutorUtils._cls1 this$0;
	final Runnable val$runnable;

	ExecutorUtils$1$1()
	{
		this$0 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ExecutorUtils$1 this$0>
		val$runnable = Runnable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Runnable val$runnable>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void BackgroundPriorityRunnable()>
	//    8   14:return          
	}

	// Unreferenced inner class io/fabric/sdk/android/services/common/ExecutorUtils$1

/* anonymous class */
	static final class ExecutorUtils._cls1
		implements ThreadFactory
	{

		public Thread newThread(Runnable runnable1)
		{
			runnable1 = ((Runnable) (Executors.defaultThreadFactory().newThread(((Runnable) (((ExecutorUtils._cls1._cls1) (runnable1)). new ExecutorUtils._cls1._cls1())))));
		//    0    0:invokestatic    #35  <Method ThreadFactory Executors.defaultThreadFactory()>
		//    1    3:new             #13  <Class ExecutorUtils$1$1>
		//    2    6:dup             
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:invokespecial   #38  <Method void ExecutorUtils$1$1(ExecutorUtils$1, Runnable)>
		//    6   12:invokeinterface #40  <Method Thread ThreadFactory.newThread(Runnable)>
		//    7   17:astore_1        
			((Thread) (runnable1)).setName((new StringBuilder()).append(threadNameTemplate).append(count.getAndIncrement()).toString());
		//    8   18:aload_1         
		//    9   19:new             #42  <Class StringBuilder>
		//   10   22:dup             
		//   11   23:invokespecial   #43  <Method void StringBuilder()>
		//   12   26:aload_0         
		//   13   27:getfield        #21  <Field String val$threadNameTemplate>
		//   14   30:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   15   33:aload_0         
		//   16   34:getfield        #23  <Field AtomicLong val$count>
		//   17   37:invokevirtual   #53  <Method long AtomicLong.getAndIncrement()>
		//   18   40:invokevirtual   #56  <Method StringBuilder StringBuilder.append(long)>
		//   19   43:invokevirtual   #60  <Method String StringBuilder.toString()>
		//   20   46:invokevirtual   #66  <Method void Thread.setName(String)>
			return ((Thread) (runnable1));
		//   21   49:aload_1         
		//   22   50:areturn         
		}

		final AtomicLong val$count;
		final String val$threadNameTemplate;

			
			{
				threadNameTemplate = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field String val$threadNameTemplate>
				count = atomiclong;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field AtomicLong val$count>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
	}

}
