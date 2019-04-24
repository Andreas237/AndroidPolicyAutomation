// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;

// Referenced classes of package kotlinx.coroutines:
//			CoroutineDispatcher

public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher
	implements Closeable
{

	public ExecutorCoroutineDispatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void CoroutineDispatcher()>
	//    2    4:return          
	}

	public abstract void close();

	public abstract Executor getExecutor();
}
