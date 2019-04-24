// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler

class CrashlyticsUncaughtExceptionHandler$11
	implements Callable
{

	public Boolean call()
		throws Exception
	{
		if(CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//*   2    4:invokestatic    #30  <Method AtomicBoolean CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler)>
	//*   3    7:invokevirtual   #35  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifeq            29
		{
			Fabric.getLogger().d("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
	//    5   13:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//    6   16:ldc1            #43  <String "CrashlyticsCore">
	//    7   18:ldc1            #45  <String "Skipping session finalization because a crash has already occurred.">
	//    8   20:invokeinterface #51  <Method void Logger.d(String, String)>
			return Boolean.FALSE;
	//    9   25:getstatic       #57  <Field Boolean Boolean.FALSE>
	//   10   28:areturn         
		} else
		{
			Fabric.getLogger().d("CrashlyticsCore", "Finalizing previously open sessions.");
	//   11   29:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//   12   32:ldc1            #43  <String "CrashlyticsCore">
	//   13   34:ldc1            #59  <String "Finalizing previously open sessions.">
	//   14   36:invokeinterface #51  <Method void Logger.d(String, String)>
			CrashlyticsUncaughtExceptionHandler.access$800(CrashlyticsUncaughtExceptionHandler.this, true);
	//   15   41:aload_0         
	//   16   42:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//   17   45:iconst_1        
	//   18   46:invokestatic    #63  <Method void CrashlyticsUncaughtExceptionHandler.access$800(CrashlyticsUncaughtExceptionHandler, boolean)>
			Fabric.getLogger().d("CrashlyticsCore", "Closed all previously open sessions");
	//   19   49:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//   20   52:ldc1            #43  <String "CrashlyticsCore">
	//   21   54:ldc1            #65  <String "Closed all previously open sessions">
	//   22   56:invokeinterface #51  <Method void Logger.d(String, String)>
			return Boolean.TRUE;
	//   23   61:getstatic       #68  <Field Boolean Boolean.TRUE>
	//   24   64:areturn         
		}
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method Boolean call()>
	//    2    4:areturn         
	}

	final CrashlyticsUncaughtExceptionHandler this$0;

	CrashlyticsUncaughtExceptionHandler$11()
	{
		this$0 = CrashlyticsUncaughtExceptionHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
