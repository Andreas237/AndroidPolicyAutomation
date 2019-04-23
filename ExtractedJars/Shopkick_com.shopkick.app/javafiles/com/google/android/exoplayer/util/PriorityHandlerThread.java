// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.os.HandlerThread;
import android.os.Process;

public final class PriorityHandlerThread extends HandlerThread
{

	public PriorityHandlerThread(String s, int i)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void HandlerThread(String)>
		priority = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #13  <Field int priority>
	//    6   10:return          
	}

	public void run()
	{
		Process.setThreadPriority(priority);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int priority>
	//    2    4:invokestatic    #22  <Method void Process.setThreadPriority(int)>
		super.run();
	//    3    7:aload_0         
	//    4    8:invokespecial   #24  <Method void HandlerThread.run()>
	//    5   11:return          
	}

	private final int priority;
}
