// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp.plugins;

import com.facebook.stetho.common.ExceptionUtil;

// Referenced classes of package com.facebook.stetho.dumpapp.plugins:
//			CrashDumperPlugin

private static class CrashDumperPlugin$ThrowRunnable
	implements Runnable
{

	public void run()
	{
		ExceptionUtil.sneakyThrow(mThrowable);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Throwable mThrowable>
	//    2    4:invokestatic    #25  <Method void ExceptionUtil.sneakyThrow(Throwable)>
	//    3    7:return          
	}

	private final Throwable mThrowable;

	public CrashDumperPlugin$ThrowRunnable(Throwable throwable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mThrowable = throwable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Throwable mThrowable>
	//    5    9:return          
	}
}
