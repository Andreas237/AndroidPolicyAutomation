// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class Executors
{

	public static Executor directExecutor()
	{
		return DIRECT_EXECUTOR;
	//    0    0:getstatic       #21  <Field Executor DIRECT_EXECUTOR>
	//    1    3:areturn         
	}

	public static Executor mainThreadExecutor()
	{
		return MAIN_THREAD_EXECUTOR;
	//    0    0:getstatic       #18  <Field Executor MAIN_THREAD_EXECUTOR>
	//    1    3:areturn         
	}

	private static final Executor DIRECT_EXECUTOR = new Executor() {

		public void execute(Runnable runnable)
		{
			runnable.run();
		//    0    0:aload_1         
		//    1    1:invokeinterface #21  <Method void Runnable.run()>
		//    2    6:return          
		}

	}
;
	private static final Executor MAIN_THREAD_EXECUTOR = new Executor() {

		public void execute(Runnable runnable)
		{
			handler.post(runnable);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Handler handler>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method boolean Handler.post(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		private final Handler handler = new Handler(Looper.getMainLooper());

			
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #14  <Method void Object()>
			//    2    4:aload_0         
			//    3    5:new             #16  <Class Handler>
			//    4    8:dup             
			//    5    9:invokestatic    #22  <Method Looper Looper.getMainLooper()>
			//    6   12:invokespecial   #25  <Method void Handler(Looper)>
			//    7   15:putfield        #27  <Field Handler handler>
			//    8   18:return          
			}
	}
;

	static 
	{
	//    0    0:new             #6   <Class Executors$1>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Executors$1()>
	//    3    7:putstatic       #18  <Field Executor MAIN_THREAD_EXECUTOR>
	//    4   10:new             #8   <Class Executors$2>
	//    5   13:dup             
	//    6   14:invokespecial   #19  <Method void Executors$2()>
	//    7   17:putstatic       #21  <Field Executor DIRECT_EXECUTOR>
	//*   8   20:return          
	}
}
