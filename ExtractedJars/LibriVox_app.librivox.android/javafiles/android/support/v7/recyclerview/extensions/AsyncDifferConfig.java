// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import java.util.concurrent.Executor;

public final class AsyncDifferConfig
{

	AsyncDifferConfig(Executor executor, Executor executor1, android.support.v7.util.DiffUtil.ItemCallback itemcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mMainThreadExecutor = executor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Executor mMainThreadExecutor>
		mBackgroundThreadExecutor = executor1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #18  <Field Executor mBackgroundThreadExecutor>
		mDiffCallback = itemcallback;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #20  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//   11   19:return          
	}

	public Executor getBackgroundThreadExecutor()
	{
		return mBackgroundThreadExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Executor mBackgroundThreadExecutor>
	//    2    4:areturn         
	}

	public android.support.v7.util.DiffUtil.ItemCallback getDiffCallback()
	{
		return mDiffCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.support.v7.util.DiffUtil$ItemCallback mDiffCallback>
	//    2    4:areturn         
	}

	public Executor getMainThreadExecutor()
	{
		return mMainThreadExecutor;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Executor mMainThreadExecutor>
	//    2    4:areturn         
	}

	private final Executor mBackgroundThreadExecutor;
	private final android.support.v7.util.DiffUtil.ItemCallback mDiffCallback;
	private final Executor mMainThreadExecutor;
}
