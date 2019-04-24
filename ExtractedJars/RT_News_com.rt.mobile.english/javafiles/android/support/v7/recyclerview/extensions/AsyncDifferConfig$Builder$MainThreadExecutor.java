// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncDifferConfig

private static class AsyncDifferConfig$Builder$MainThreadExecutor
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

	private AsyncDifferConfig$Builder$MainThreadExecutor()
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

	AsyncDifferConfig$Builder$MainThreadExecutor(AsyncDifferConfig._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void AsyncDifferConfig$Builder$MainThreadExecutor()>
	//    2    4:return          
	}
}
