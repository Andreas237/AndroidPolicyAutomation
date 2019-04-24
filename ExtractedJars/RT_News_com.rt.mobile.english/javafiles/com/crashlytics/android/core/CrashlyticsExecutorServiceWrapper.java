// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.os.Looper;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.*;

class CrashlyticsExecutorServiceWrapper
{

	public CrashlyticsExecutorServiceWrapper(ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		executorService = executorservice;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ExecutorService executorService>
	//    5    9:return          
	}

	Future executeAsync(final Runnable runnable)
	{
		try
		{
			runnable = ((Runnable) (executorService.submit(new Runnable() {

				public void run()
				{
					try
					{
						runnable.run();
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field Runnable val$runnable>
				//    2    4:invokeinterface #30  <Method void Runnable.run()>
						return;
				//    3    9:return          
					}
					catch(Exception exception)
				//*   4   10:astore_1        
					{
						Fabric.getLogger().e("CrashlyticsCore", "Failed to execute task.", ((Throwable) (exception)));
				//    5   11:invokestatic    #36  <Method Logger Fabric.getLogger()>
				//    6   14:ldc1            #38  <String "CrashlyticsCore">
				//    7   16:ldc1            #40  <String "Failed to execute task.">
				//    8   18:aload_1         
				//    9   19:invokeinterface #46  <Method void Logger.e(String, String, Throwable)>
					}
				//   10   24:return          
				}

				final CrashlyticsExecutorServiceWrapper this$0;
				final Runnable val$runnable;

			
			{
				this$0 = CrashlyticsExecutorServiceWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashlyticsExecutorServiceWrapper this$0>
				runnable = runnable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Runnable val$runnable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ExecutorService executorService>
	//    2    4:new             #6   <Class CrashlyticsExecutorServiceWrapper$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #25  <Method void CrashlyticsExecutorServiceWrapper$1(CrashlyticsExecutorServiceWrapper, Runnable)>
	//    7   13:invokeinterface #30  <Method Future ExecutorService.submit(Runnable)>
	//    8   18:astore_1        
		}
	//*   9   19:aload_1         
	//*  10   20:areturn         
	//*  11   21:invokestatic    #36  <Method Logger Fabric.getLogger()>
	//*  12   24:ldc1            #38  <String "CrashlyticsCore">
	//*  13   26:ldc1            #40  <String "Executor is shut down because we're handling a fatal crash.">
	//*  14   28:invokeinterface #46  <Method void Logger.d(String, String)>
	//*  15   33:aconst_null     
	//*  16   34:areturn         
		// Misplaced declaration of an exception variable
		catch(final Runnable runnable)
		{
			Fabric.getLogger().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
			return null;
		}
		return ((Future) (runnable));
	//*  17   35:astore_1        
	//*  18   36:goto            21
	}

	Future executeAsync(final Callable callable)
	{
		try
		{
			callable = ((Callable) (executorService.submit(new Callable() {

				public Object call()
					throws Exception
				{
					Object obj;
					try
					{
						obj = callable.call();
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field Callable val$callable>
				//    2    4:invokeinterface #32  <Method Object Callable.call()>
				//    3    9:astore_1        
					}
				//*   4   10:aload_1         
				//*   5   11:areturn         
					catch(Exception exception)
				//*   6   12:astore_1        
					{
						Fabric.getLogger().e("CrashlyticsCore", "Failed to execute task.", ((Throwable) (exception)));
				//    7   13:invokestatic    #38  <Method Logger Fabric.getLogger()>
				//    8   16:ldc1            #40  <String "CrashlyticsCore">
				//    9   18:ldc1            #42  <String "Failed to execute task.">
				//   10   20:aload_1         
				//   11   21:invokeinterface #48  <Method void Logger.e(String, String, Throwable)>
						return ((Object) (null));
				//   12   26:aconst_null     
				//   13   27:areturn         
					}
					return obj;
				}

				final CrashlyticsExecutorServiceWrapper this$0;
				final Callable val$callable;

			
			{
				this$0 = CrashlyticsExecutorServiceWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsExecutorServiceWrapper this$0>
				callable = callable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Callable val$callable>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ExecutorService executorService>
	//    2    4:new             #8   <Class CrashlyticsExecutorServiceWrapper$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #52  <Method void CrashlyticsExecutorServiceWrapper$2(CrashlyticsExecutorServiceWrapper, Callable)>
	//    7   13:invokeinterface #54  <Method Future ExecutorService.submit(Callable)>
	//    8   18:astore_1        
		}
	//*   9   19:aload_1         
	//*  10   20:areturn         
	//*  11   21:invokestatic    #36  <Method Logger Fabric.getLogger()>
	//*  12   24:ldc1            #38  <String "CrashlyticsCore">
	//*  13   26:ldc1            #40  <String "Executor is shut down because we're handling a fatal crash.">
	//*  14   28:invokeinterface #46  <Method void Logger.d(String, String)>
	//*  15   33:aconst_null     
	//*  16   34:areturn         
		// Misplaced declaration of an exception variable
		catch(final Callable callable)
		{
			Fabric.getLogger().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
			return null;
		}
		return ((Future) (callable));
	//*  17   35:astore_1        
	//*  18   36:goto            21
	}

	Object executeSyncLoggingException(Callable callable)
	{
		try
		{
			if(Looper.getMainLooper() == Looper.myLooper())
	//*   0    0:invokestatic    #65  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #68  <Method Looper Looper.myLooper()>
	//*   2    6:if_acmpne       31
				return executorService.submit(callable).get(4L, TimeUnit.SECONDS);
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field ExecutorService executorService>
	//    5   13:aload_1         
	//    6   14:invokeinterface #54  <Method Future ExecutorService.submit(Callable)>
	//    7   19:ldc2w           #69  <Long 4L>
	//    8   22:getstatic       #76  <Field TimeUnit TimeUnit.SECONDS>
	//    9   25:invokeinterface #82  <Method Object Future.get(long, TimeUnit)>
	//   10   30:areturn         
			callable = ((Callable) (executorService.submit(callable).get()));
	//   11   31:aload_0         
	//   12   32:getfield        #17  <Field ExecutorService executorService>
	//   13   35:aload_1         
	//   14   36:invokeinterface #54  <Method Future ExecutorService.submit(Callable)>
	//   15   41:invokeinterface #85  <Method Object Future.get()>
	//   16   46:astore_1        
		}
	//*  17   47:aload_1         
	//*  18   48:areturn         
	//*  19   49:astore_1        
	//*  20   50:invokestatic    #36  <Method Logger Fabric.getLogger()>
	//*  21   53:ldc1            #38  <String "CrashlyticsCore">
	//*  22   55:ldc1            #87  <String "Failed to execute task.">
	//*  23   57:aload_1         
	//*  24   58:invokeinterface #91  <Method void Logger.e(String, String, Throwable)>
	//*  25   63:aconst_null     
	//*  26   64:areturn         
	//*  27   65:invokestatic    #36  <Method Logger Fabric.getLogger()>
	//*  28   68:ldc1            #38  <String "CrashlyticsCore">
	//*  29   70:ldc1            #40  <String "Executor is shut down because we're handling a fatal crash.">
	//*  30   72:invokeinterface #46  <Method void Logger.d(String, String)>
	//*  31   77:aconst_null     
	//*  32   78:areturn         
		// Misplaced declaration of an exception variable
		catch(Callable callable)
		{
			Fabric.getLogger().d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
			return ((Object) (null));
		}
		// Misplaced declaration of an exception variable
		catch(Callable callable)
		{
			Fabric.getLogger().e("CrashlyticsCore", "Failed to execute task.", ((Throwable) (callable)));
			return ((Object) (null));
		}
		return ((Object) (callable));
	//*  33   79:astore_1        
	//*  34   80:goto            65
	}

	private final ExecutorService executorService;
}
