// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.os.Process;

public abstract class BackgroundPriorityRunnable
	implements Runnable
{

	public BackgroundPriorityRunnable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	protected abstract void onRun();

	public final void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #19  <Method void Process.setThreadPriority(int)>
		onRun();
	//    2    5:aload_0         
	//    3    6:invokevirtual   #21  <Method void onRun()>
	//    4    9:return          
	}
}
