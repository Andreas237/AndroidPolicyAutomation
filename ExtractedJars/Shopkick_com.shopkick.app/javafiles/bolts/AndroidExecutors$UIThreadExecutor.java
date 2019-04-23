// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

// Referenced classes of package bolts:
//			AndroidExecutors

private static class AndroidExecutors$UIThreadExecutor
	implements Executor
{

	public void execute(Runnable runnable)
	{
		(new Handler(Looper.getMainLooper())).post(runnable);
	//    0    0:new             #20  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #26  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #29  <Method void Handler(Looper)>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #33  <Method boolean Handler.post(Runnable)>
	//    6   14:pop             
	//    7   15:return          
	}

	private AndroidExecutors$UIThreadExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	AndroidExecutors$UIThreadExecutor(AndroidExecutors._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AndroidExecutors$UIThreadExecutor()>
	//    2    4:return          
	}
}
