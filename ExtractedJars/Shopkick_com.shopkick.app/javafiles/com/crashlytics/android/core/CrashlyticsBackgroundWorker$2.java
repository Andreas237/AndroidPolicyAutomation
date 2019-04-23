// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsBackgroundWorker

class CrashlyticsBackgroundWorker$2
	implements Callable
{

	public Object call()
		throws Exception
	{
		Object obj;
		try
		{
			obj = val$callable.call();
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

	final CrashlyticsBackgroundWorker this$0;
	final Callable val$callable;

	CrashlyticsBackgroundWorker$2()
	{
		this$0 = final_crashlyticsbackgroundworker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsBackgroundWorker this$0>
		val$callable = Callable.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field Callable val$callable>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
