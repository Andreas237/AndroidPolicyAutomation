// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

public interface TaskExecutor
{

	public abstract void executeOnBackgroundThread(Runnable runnable);

	public abstract Executor getBackgroundExecutor();

	public abstract Thread getBackgroundExecutorThread();

	public abstract Executor getMainThreadExecutor();

	public abstract void postToMainThread(Runnable runnable);
}
