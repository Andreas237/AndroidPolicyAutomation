// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core;


// Referenced classes of package com.firebase.client.core:
//			ThreadInitializer, GaePlatform

static final class GaePlatform$1
	implements ThreadInitializer
{

	public void setDaemon(Thread thread, boolean flag)
	{
	//    0    0:return          
	}

	public void setName(Thread thread, String s)
	{
	//    0    0:return          
	}

	public void setUncaughtExceptionHandler(Thread thread, tExceptionHandler texceptionhandler)
	{
		thread.setUncaughtExceptionHandler(texceptionhandler);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #24  <Method void Thread.setUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//    3    5:return          
	}

	GaePlatform$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
