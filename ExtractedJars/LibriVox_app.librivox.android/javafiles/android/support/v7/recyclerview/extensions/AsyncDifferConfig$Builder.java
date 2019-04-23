// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncDifferConfig

public final class AsyncDifferConfig$Builder
{

	public AsyncDifferConfig build()
	{
		if(mBackgroundThreadExecutor == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field Executor mBackgroundThreadExecutor>
	//*   2    4:ifnonnull       43
		{
			synchronized(sExecutorLock)
	//*   3    7:getstatic       #19  <Field Object sExecutorLock>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
			{
				if(sDiffExecutor == null)
	//*   7   13:getstatic       #21  <Field Executor sDiffExecutor>
	//*   8   16:ifnonnull       26
					sDiffExecutor = ((Executor) (Executors.newFixedThreadPool(2)));
	//    9   19:iconst_2        
	//   10   20:invokestatic    #35  <Method java.util.concurrent.ExecutorService Executors.newFixedThreadPool(int)>
	//   11   23:putstatic       #21  <Field Executor sDiffExecutor>
			}
	//   12   26:aload_1         
	//   13   27:monitorexit     
			mBackgroundThreadExecutor = sDiffExecutor;
	//   14   28:aload_0         
	//   15   29:getstatic       #21  <Field Executor sDiffExecutor>
	//   16   32:putfield        #29  <Field Executor mBackgroundThreadExecutor>
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
	//   23   43:new             #37  <Class AsyncDifferConfig>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:getfield        #39  <Field Executor mMainThreadExecutor>
	//   27   51:aload_0         
	//   28   52:getfield        #29  <Field Executor mBackgroundThreadExecutor>
	//   29   55:aload_0         
	//   30   56:getfield        #25  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//   31   59:invokespecial   #42  <Method void AsyncDifferConfig(Executor, Executor, android.support.v7.util.DiffUtil$ItemCallback)>
	//   32   62:areturn         
	}

	public AsyncDifferConfig$Builder setBackgroundThreadExecutor(Executor executor)
	{
		mBackgroundThreadExecutor = executor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field Executor mBackgroundThreadExecutor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AsyncDifferConfig$Builder setMainThreadExecutor(Executor executor)
	{
		mMainThreadExecutor = executor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field Executor mMainThreadExecutor>
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
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Object()>
	//    3    7:putstatic       #19  <Field Object sExecutorLock>
	//    4   10:aconst_null     
	//    5   11:putstatic       #21  <Field Executor sDiffExecutor>
	//*   6   14:return          
	}

	public AsyncDifferConfig$Builder(android.support.v7.util.DiffUtil.ItemCallback itemcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mDiffCallback = itemcallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//    5    9:return          
	}
}
