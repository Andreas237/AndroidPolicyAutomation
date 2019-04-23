// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig
{
	public static final class Builder
	{

		public AsyncDifferConfig build()
		{
			if(mBackgroundThreadExecutor == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field Executor mBackgroundThreadExecutor>
		//*   2    4:ifnonnull       43
			{
				synchronized(sExecutorLock)
		//*   3    7:getstatic       #24  <Field Object sExecutorLock>
		//*   4   10:astore_1        
		//*   5   11:aload_1         
		//*   6   12:monitorenter    
				{
					if(sDiffExecutor == null)
		//*   7   13:getstatic       #26  <Field Executor sDiffExecutor>
		//*   8   16:ifnonnull       26
						sDiffExecutor = ((Executor) (Executors.newFixedThreadPool(2)));
		//    9   19:iconst_2        
		//   10   20:invokestatic    #44  <Method java.util.concurrent.ExecutorService Executors.newFixedThreadPool(int)>
		//   11   23:putstatic       #26  <Field Executor sDiffExecutor>
				}
		//   12   26:aload_1         
		//   13   27:monitorexit     
				mBackgroundThreadExecutor = sDiffExecutor;
		//   14   28:aload_0         
		//   15   29:getstatic       #26  <Field Executor sDiffExecutor>
		//   16   32:putfield        #38  <Field Executor mBackgroundThreadExecutor>
			}
			break MISSING_BLOCK_LABEL_43;
		//   17   35:goto            43
			exception;
		//   18   38:astore_2        
			obj;
		//   19   39:aload_1         
			JVM INSTR monitorexit ;
		//   20   40:monitorexit     
			throw exception;
		//   21   41:aload_2         
		//   22   42:athrow          
			return new AsyncDifferConfig(mMainThreadExecutor, mBackgroundThreadExecutor, mDiffCallback);
		//   23   43:new             #7   <Class AsyncDifferConfig>
		//   24   46:dup             
		//   25   47:aload_0         
		//   26   48:getfield        #46  <Field Executor mMainThreadExecutor>
		//   27   51:aload_0         
		//   28   52:getfield        #38  <Field Executor mBackgroundThreadExecutor>
		//   29   55:aload_0         
		//   30   56:getfield        #31  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
		//   31   59:invokespecial   #49  <Method void AsyncDifferConfig(Executor, Executor, android.support.v7.util.DiffUtil$ItemCallback)>
		//   32   62:areturn         
		}

		public Builder setBackgroundThreadExecutor(Executor executor)
		{
			mBackgroundThreadExecutor = executor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #38  <Field Executor mBackgroundThreadExecutor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setMainThreadExecutor(Executor executor)
		{
			mMainThreadExecutor = executor;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field Executor mMainThreadExecutor>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private static Executor sDiffExecutor = null;
		private static final Object sExecutorLock = new Object();
		private Executor mBackgroundThreadExecutor;
		private final android.support.v7.util.DiffUtil.ItemCallback mDiffCallback;
		private Executor mMainThreadExecutor;

		static 
		{
		//    0    0:new             #5   <Class Object>
		//    1    3:dup             
		//    2    4:invokespecial   #22  <Method void Object()>
		//    3    7:putstatic       #24  <Field Object sExecutorLock>
		//    4   10:aconst_null     
		//    5   11:putstatic       #26  <Field Executor sDiffExecutor>
		//*   6   14:return          
		}

		public Builder(android.support.v7.util.DiffUtil.ItemCallback itemcallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mDiffCallback = itemcallback;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #31  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
		//    5    9:return          
		}
	}


	AsyncDifferConfig(Executor executor, Executor executor1, android.support.v7.util.DiffUtil.ItemCallback itemcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mMainThreadExecutor = executor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Executor mMainThreadExecutor>
		mBackgroundThreadExecutor = executor1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Executor mBackgroundThreadExecutor>
		mDiffCallback = itemcallback;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//   11   19:return          
	}

	public Executor getBackgroundThreadExecutor()
	{
		return mBackgroundThreadExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Executor mBackgroundThreadExecutor>
	//    2    4:areturn         
	}

	public android.support.v7.util.DiffUtil.ItemCallback getDiffCallback()
	{
		return mDiffCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//    2    4:areturn         
	}

	public Executor getMainThreadExecutor()
	{
		return mMainThreadExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Executor mMainThreadExecutor>
	//    2    4:areturn         
	}

	private final Executor mBackgroundThreadExecutor;
	private final android.support.v7.util.DiffUtil.ItemCallback mDiffCallback;
	private final Executor mMainThreadExecutor;
}
