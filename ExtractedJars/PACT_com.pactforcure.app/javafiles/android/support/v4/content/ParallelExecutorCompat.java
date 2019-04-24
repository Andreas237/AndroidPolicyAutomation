// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

public final class ParallelExecutorCompat
{

	private ParallelExecutorCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static Executor getParallelExecutor()
	{
		return AsyncTask.THREAD_POOL_EXECUTOR;
	//    0    0:getstatic       #18  <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//    1    3:areturn         
	}
}
