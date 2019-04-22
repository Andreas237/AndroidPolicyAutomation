// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			ThreadInitializer

static final class ThreadInitializer$1
	implements ThreadInitializer
{

	public void setDaemon(Thread thread, boolean flag)
	{
		thread.setDaemon(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #18  <Method void Thread.setDaemon(boolean)>
	//    3    5:return          
	}

	public void setName(Thread thread, String s)
	{
		thread.setName(s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #23  <Method void Thread.setName(String)>
	//    3    5:return          
	}

	public void setUncaughtExceptionHandler(Thread thread, tionHandler tionhandler)
	{
		thread.setUncaughtExceptionHandler(tionhandler);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #28  <Method void Thread.setUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//    3    5:return          
	}

	ThreadInitializer$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}
}
