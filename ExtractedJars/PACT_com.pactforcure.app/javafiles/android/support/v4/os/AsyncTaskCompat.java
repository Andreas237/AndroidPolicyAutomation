// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.AsyncTask;

public final class AsyncTaskCompat
{

	private AsyncTaskCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static transient AsyncTask executeParallel(AsyncTask asynctask, Object aobj[])
	{
		if(asynctask == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("task can not be null");
	//    2    4:new             #14  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #16  <String "task can not be null">
	//    5   10:invokespecial   #19  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
	//    7   14:aload_0         
	//    8   15:getstatic       #25  <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #29  <Method AsyncTask AsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   11   22:pop             
			return asynctask;
	//   12   23:aload_0         
	//   13   24:areturn         
		}
	}
}
