// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.*;

public class ExecutorServiceUtil
{

	public ExecutorServiceUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ExecutorService newExecutorService()
	{
		return ((ExecutorService) (new ThreadPoolExecutor(CoreConstants.CORE_POOL_SIZE, 32, 0L, TimeUnit.MILLISECONDS, ((java.util.concurrent.BlockingQueue) (new SynchronousQueue())))));
	//    0    0:new             #13  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:getstatic       #19  <Field int CoreConstants.CORE_POOL_SIZE>
	//    3    7:bipush          32
	//    4    9:lconst_0        
	//    5   10:getstatic       #25  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    6   13:new             #27  <Class SynchronousQueue>
	//    7   16:dup             
	//    8   17:invokespecial   #28  <Method void SynchronousQueue()>
	//    9   20:invokespecial   #31  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue)>
	//   10   23:areturn         
	}

	public static void shutdown(ExecutorService executorservice)
	{
		executorservice.shutdownNow();
	//    0    0:aload_0         
	//    1    1:invokeinterface #39  <Method java.util.List ExecutorService.shutdownNow()>
	//    2    6:pop             
	//    3    7:return          
	}
}
