// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsBackgroundWorker

class CrashlyticsBackgroundWorker$1
	implements Runnable
{

	public void run()
	{
		try
		{
			val$runnable.run();
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

	final CrashlyticsBackgroundWorker this$0;
	final Runnable val$runnable;

	CrashlyticsBackgroundWorker$1()
	{
		this$0 = final_crashlyticsbackgroundworker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CrashlyticsBackgroundWorker this$0>
		val$runnable = Runnable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Runnable val$runnable>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
