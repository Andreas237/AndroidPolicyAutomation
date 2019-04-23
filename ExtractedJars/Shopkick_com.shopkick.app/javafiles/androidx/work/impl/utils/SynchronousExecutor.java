// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import java.util.concurrent.Executor;

public class SynchronousExecutor
	implements Executor
{

	public SynchronousExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public void execute(Runnable runnable)
	{
		runnable.run();
	//    0    0:aload_1         
	//    1    1:invokeinterface #23  <Method void Runnable.run()>
	//    2    6:return          
	}
}
