// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.tasks:
//			TaskExecutors

final class TaskExecutors$1
	implements Executor
{

	public void execute(Runnable runnable)
	{
		runnable.run();
	//    0    0:aload_1         
	//    1    1:invokeinterface #21  <Method void Runnable.run()>
	//    2    6:return          
	}

	TaskExecutors$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
