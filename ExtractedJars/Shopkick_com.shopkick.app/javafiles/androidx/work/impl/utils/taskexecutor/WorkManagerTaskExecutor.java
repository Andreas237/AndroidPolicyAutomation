// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.*;

// Referenced classes of package androidx.work.impl.utils.taskexecutor:
//			TaskExecutor

public class WorkManagerTaskExecutor
	implements TaskExecutor
{

	public WorkManagerTaskExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #30  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #36  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #39  <Method void Handler(Looper)>
	//    7   15:putfield        #41  <Field Handler mMainThreadHandler>
	//    8   18:aload_0         
	//    9   19:new             #8   <Class WorkManagerTaskExecutor$1>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #44  <Method void WorkManagerTaskExecutor$1(WorkManagerTaskExecutor)>
	//   13   27:putfield        #46  <Field Executor mMainThreadExecutor>
	//   14   30:aload_0         
	//   15   31:new             #10  <Class WorkManagerTaskExecutor$2>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:invokespecial   #47  <Method void WorkManagerTaskExecutor$2(WorkManagerTaskExecutor)>
	//   19   39:putfield        #49  <Field ThreadFactory mBackgroundThreadFactory>
		mBackgroundExecutor = Executors.newSingleThreadExecutor(mBackgroundThreadFactory);
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #49  <Field ThreadFactory mBackgroundThreadFactory>
	//   23   47:invokestatic    #55  <Method ExecutorService Executors.newSingleThreadExecutor(ThreadFactory)>
	//   24   50:putfield        #57  <Field ExecutorService mBackgroundExecutor>
	//   25   53:return          
	}

	public void executeOnBackgroundThread(Runnable runnable)
	{
		mBackgroundExecutor.execute(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ExecutorService mBackgroundExecutor>
	//    2    4:aload_1         
	//    3    5:invokeinterface #65  <Method void ExecutorService.execute(Runnable)>
	//    4   10:return          
	}

	public Executor getBackgroundExecutor()
	{
		return ((Executor) (mBackgroundExecutor));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ExecutorService mBackgroundExecutor>
	//    2    4:areturn         
	}

	public Thread getBackgroundExecutorThread()
	{
		return mCurrentBackgroundExecutorThread;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field Thread mCurrentBackgroundExecutorThread>
	//    2    4:areturn         
	}

	public Executor getMainThreadExecutor()
	{
		return mMainThreadExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Executor mMainThreadExecutor>
	//    2    4:areturn         
	}

	public void postToMainThread(Runnable runnable)
	{
		mMainThreadHandler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Handler mMainThreadHandler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private final ExecutorService mBackgroundExecutor;
	private final ThreadFactory mBackgroundThreadFactory = new ThreadFactory() {

		public Thread newThread(Runnable runnable)
		{
			runnable = ((Runnable) (Executors.defaultThreadFactory().newThread(runnable)));
		//    0    0:invokestatic    #31  <Method ThreadFactory Executors.defaultThreadFactory()>
		//    1    3:aload_1         
		//    2    4:invokeinterface #33  <Method Thread ThreadFactory.newThread(Runnable)>
		//    3    9:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
		//    4   10:new             #35  <Class StringBuilder>
		//    5   13:dup             
		//    6   14:invokespecial   #36  <Method void StringBuilder()>
		//    7   17:astore_2        
			stringbuilder.append("WorkManager-WorkManagerTaskExecutor-thread-");
		//    8   18:aload_2         
		//    9   19:ldc1            #38  <String "WorkManager-WorkManagerTaskExecutor-thread-">
		//   10   21:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			stringbuilder.append(mThreadsCreated);
		//   12   25:aload_2         
		//   13   26:aload_0         
		//   14   27:getfield        #21  <Field int mThreadsCreated>
		//   15   30:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
		//   16   33:pop             
			((Thread) (runnable)).setName(stringbuilder.toString());
		//   17   34:aload_1         
		//   18   35:aload_2         
		//   19   36:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   20   39:invokevirtual   #55  <Method void Thread.setName(String)>
			mThreadsCreated = mThreadsCreated + 1;
		//   21   42:aload_0         
		//   22   43:aload_0         
		//   23   44:getfield        #21  <Field int mThreadsCreated>
		//   24   47:iconst_1        
		//   25   48:iadd            
		//   26   49:putfield        #21  <Field int mThreadsCreated>
			mCurrentBackgroundExecutorThread = ((Thread) (runnable));
		//   27   52:aload_0         
		//   28   53:getfield        #16  <Field WorkManagerTaskExecutor this$0>
		//   29   56:aload_1         
		//   30   57:putfield        #59  <Field Thread WorkManagerTaskExecutor.mCurrentBackgroundExecutorThread>
			return ((Thread) (runnable));
		//   31   60:aload_1         
		//   32   61:areturn         
		}

		private int mThreadsCreated;
		final WorkManagerTaskExecutor this$0;

			
			{
				this$0 = WorkManagerTaskExecutor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field WorkManagerTaskExecutor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
				mThreadsCreated = 0;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #21  <Field int mThreadsCreated>
			//    8   14:return          
			}
	}
;
	volatile Thread mCurrentBackgroundExecutorThread;
	private final Executor mMainThreadExecutor = new Executor() {

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
;
	private final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
}
