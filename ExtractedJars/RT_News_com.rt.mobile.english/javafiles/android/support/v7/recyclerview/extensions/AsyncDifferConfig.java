// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig
{
	public static final class Builder
	{

		public AsyncDifferConfig build()
		{
			if(mMainThreadExecutor == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #45  <Field Executor mMainThreadExecutor>
		//*   2    4:ifnonnull       14
				mMainThreadExecutor = sMainThreadExecutor;
		//    3    7:aload_0         
		//    4    8:getstatic       #33  <Field Executor sMainThreadExecutor>
		//    5   11:putfield        #45  <Field Executor mMainThreadExecutor>
			if(mBackgroundThreadExecutor == null)
		//*   6   14:aload_0         
		//*   7   15:getfield        #47  <Field Executor mBackgroundThreadExecutor>
		//*   8   18:ifnonnull       57
			{
				synchronized(sExecutorLock)
		//*   9   21:getstatic       #28  <Field Object sExecutorLock>
		//*  10   24:astore_1        
		//*  11   25:aload_1         
		//*  12   26:monitorenter    
				{
					if(sDiffExecutor == null)
		//*  13   27:getstatic       #49  <Field Executor sDiffExecutor>
		//*  14   30:ifnonnull       40
						sDiffExecutor = ((Executor) (Executors.newFixedThreadPool(2)));
		//   15   33:iconst_2        
		//   16   34:invokestatic    #55  <Method java.util.concurrent.ExecutorService Executors.newFixedThreadPool(int)>
		//   17   37:putstatic       #49  <Field Executor sDiffExecutor>
				}
		//   18   40:aload_1         
		//   19   41:monitorexit     
				mBackgroundThreadExecutor = sDiffExecutor;
		//   20   42:aload_0         
		//   21   43:getstatic       #49  <Field Executor sDiffExecutor>
		//   22   46:putfield        #47  <Field Executor mBackgroundThreadExecutor>
			}
			break MISSING_BLOCK_LABEL_57;
		//   23   49:goto            57
			exception;
		//   24   52:astore_2        
			obj;
		//   25   53:aload_1         
			JVM INSTR monitorexit ;
		//   26   54:monitorexit     
			throw exception;
		//   27   55:aload_2         
		//   28   56:athrow          
			return new AsyncDifferConfig(mMainThreadExecutor, mBackgroundThreadExecutor, mDiffCallback);
		//   29   57:new             #7   <Class AsyncDifferConfig>
		//   30   60:dup             
		//   31   61:aload_0         
		//   32   62:getfield        #45  <Field Executor mMainThreadExecutor>
		//   33   65:aload_0         
		//   34   66:getfield        #47  <Field Executor mBackgroundThreadExecutor>
		//   35   69:aload_0         
		//   36   70:getfield        #38  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
		//   37   73:aconst_null     
		//   38   74:invokespecial   #58  <Method void AsyncDifferConfig(Executor, Executor, android.support.v7.util.DiffUtil$ItemCallback, AsyncDifferConfig$1)>
		//   39   77:areturn         
		}

		public Builder setBackgroundThreadExecutor(Executor executor)
		{
			mBackgroundThreadExecutor = executor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #47  <Field Executor mBackgroundThreadExecutor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMainThreadExecutor(Executor executor)
		{
			mMainThreadExecutor = executor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Executor mMainThreadExecutor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private static Executor sDiffExecutor;
		private static final Object sExecutorLock = new Object();
		private static final Executor sMainThreadExecutor = new MainThreadExecutor();
		private Executor mBackgroundThreadExecutor;
		private final android.support.v7.util.DiffUtil.ItemCallback mDiffCallback;
		private Executor mMainThreadExecutor;

		static 
		{
		//    0    0:new             #5   <Class Object>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void Object()>
		//    3    7:putstatic       #28  <Field Object sExecutorLock>
		//    4   10:new             #10  <Class AsyncDifferConfig$Builder$MainThreadExecutor>
		//    5   13:dup             
		//    6   14:aconst_null     
		//    7   15:invokespecial   #31  <Method void AsyncDifferConfig$Builder$MainThreadExecutor(AsyncDifferConfig$1)>
		//    8   18:putstatic       #33  <Field Executor sMainThreadExecutor>
		//*   9   21:return          
		}

		public Builder(android.support.v7.util.DiffUtil.ItemCallback itemcallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			mDiffCallback = itemcallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #38  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
		//    5    9:return          
		}
	}

	private static class Builder.MainThreadExecutor
		implements Executor
	{

		public void execute(Runnable runnable)
		{
			mHandler.post(runnable);
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Handler mHandler>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		final Handler mHandler;

		private Builder.MainThreadExecutor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mHandler = new Handler(Looper.getMainLooper());
		//    2    4:aload_0         
		//    3    5:new             #20  <Class Handler>
		//    4    8:dup             
		//    5    9:invokestatic    #26  <Method Looper Looper.getMainLooper()>
		//    6   12:invokespecial   #29  <Method void Handler(Looper)>
		//    7   15:putfield        #31  <Field Handler mHandler>
		//    8   18:return          
		}

	}


	private AsyncDifferConfig(Executor executor, Executor executor1, android.support.v7.util.DiffUtil.ItemCallback itemcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mMainThreadExecutor = executor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Executor mMainThreadExecutor>
		mBackgroundThreadExecutor = executor1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Executor mBackgroundThreadExecutor>
		mDiffCallback = itemcallback;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #31  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//   11   19:return          
	}


	public Executor getBackgroundThreadExecutor()
	{
		return mBackgroundThreadExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Executor mBackgroundThreadExecutor>
	//    2    4:areturn         
	}

	public android.support.v7.util.DiffUtil.ItemCallback getDiffCallback()
	{
		return mDiffCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//    2    4:areturn         
	}

	public Executor getMainThreadExecutor()
	{
		return mMainThreadExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Executor mMainThreadExecutor>
	//    2    4:areturn         
	}

	private final Executor mBackgroundThreadExecutor;
	private final android.support.v7.util.DiffUtil.ItemCallback mDiffCallback;
	private final Executor mMainThreadExecutor;
}
