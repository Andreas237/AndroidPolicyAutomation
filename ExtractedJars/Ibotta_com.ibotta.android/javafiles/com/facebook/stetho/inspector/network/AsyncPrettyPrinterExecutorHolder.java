// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class AsyncPrettyPrinterExecutorHolder
{

	private AsyncPrettyPrinterExecutorHolder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static void ensureInitialized()
	{
		if(sExecutorService == null)
	//*   0    0:getstatic       #14  <Field ExecutorService sExecutorService>
	//*   1    3:ifnonnull       12
			sExecutorService = Executors.newCachedThreadPool();
	//    2    6:invokestatic    #20  <Method ExecutorService Executors.newCachedThreadPool()>
	//    3    9:putstatic       #14  <Field ExecutorService sExecutorService>
	//    4   12:return          
	}

	public static ExecutorService getExecutorService()
	{
		return sExecutorService;
	//    0    0:getstatic       #14  <Field ExecutorService sExecutorService>
	//    1    3:areturn         
	}

	public static void shutdown()
	{
		sExecutorService.shutdown();
	//    0    0:getstatic       #14  <Field ExecutorService sExecutorService>
	//    1    3:invokeinterface #28  <Method void ExecutorService.shutdown()>
		sExecutorService = null;
	//    2    8:aconst_null     
	//    3    9:putstatic       #14  <Field ExecutorService sExecutorService>
	//    4   12:return          
	}

	private static ExecutorService sExecutorService;
}
