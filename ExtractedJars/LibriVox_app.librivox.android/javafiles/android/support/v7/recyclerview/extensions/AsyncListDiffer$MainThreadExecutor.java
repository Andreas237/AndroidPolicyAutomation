// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

class AsyncListDiffer$MainThreadExecutor
	implements Executor
{

	public void execute(Runnable runnable)
	{
		mHandler.post(runnable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Handler mHandler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method boolean Handler.post(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	final Handler mHandler = new Handler(Looper.getMainLooper());

	AsyncListDiffer$MainThreadExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #20  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #23  <Method void Handler(Looper)>
	//    7   15:putfield        #25  <Field Handler mHandler>
	//    8   18:return          
	}
}
