// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			zzt

public final class TaskExecutors
{
	private static final class zza
		implements Executor
	{

		public final void execute(Runnable runnable)
		{
			mHandler.post(runnable);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Handler mHandler>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #35  <Method boolean Handler.post(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		private final Handler mHandler = new Handler(Looper.getMainLooper());

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #17  <Class Handler>
		//    4    8:dup             
		//    5    9:invokestatic    #23  <Method Looper Looper.getMainLooper()>
		//    6   12:invokespecial   #26  <Method void Handler(Looper)>
		//    7   15:putfield        #28  <Field Handler mHandler>
		//    8   18:return          
		}
	}


	private TaskExecutors()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	public static final Executor MAIN_THREAD = new zza();
	static final Executor zzw = new zzt();

	static 
	{
	//    0    0:new             #6   <Class TaskExecutors$zza>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void TaskExecutors$zza()>
	//    3    7:putstatic       #17  <Field Executor MAIN_THREAD>
	//    4   10:new             #19  <Class zzt>
	//    5   13:dup             
	//    6   14:invokespecial   #20  <Method void zzt()>
	//    7   17:putstatic       #22  <Field Executor zzw>
	//*   8   20:return          
	}
}
