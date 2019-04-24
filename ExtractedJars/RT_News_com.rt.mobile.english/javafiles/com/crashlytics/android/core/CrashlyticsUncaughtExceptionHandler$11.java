// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler, CrashlyticsCore

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
		}
		Fabric.getLogger().d("CrashlyticsCore", "Finalizing previously open sessions.");
	//   11   29:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//   12   32:ldc1            #43  <String "CrashlyticsCore">
	//   13   34:ldc1            #59  <String "Finalizing previously open sessions.">
	//   14   36:invokeinterface #51  <Method void Logger.d(String, String)>
		com.crashlytics.android.core.internal.models.SessionEventData sessioneventdata = CrashlyticsUncaughtExceptionHandler.access$800(CrashlyticsUncaughtExceptionHandler.this).getExternalCrashEventData();
	//   15   41:aload_0         
	//   16   42:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//   17   45:invokestatic    #63  <Method CrashlyticsCore CrashlyticsUncaughtExceptionHandler.access$800(CrashlyticsUncaughtExceptionHandler)>
	//   18   48:invokevirtual   #69  <Method com.crashlytics.android.core.internal.models.SessionEventData CrashlyticsCore.getExternalCrashEventData()>
	//   19   51:astore_1        
		if(sessioneventdata != null)
	//*  20   52:aload_1         
	//*  21   53:ifnull          64
			CrashlyticsUncaughtExceptionHandler.access$900(CrashlyticsUncaughtExceptionHandler.this, sessioneventdata);
	//   22   56:aload_0         
	//   23   57:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//   24   60:aload_1         
	//   25   61:invokestatic    #73  <Method void CrashlyticsUncaughtExceptionHandler.access$900(CrashlyticsUncaughtExceptionHandler, com.crashlytics.android.core.internal.models.SessionEventData)>
		CrashlyticsUncaughtExceptionHandler.access$1000(CrashlyticsUncaughtExceptionHandler.this, true);
	//   26   64:aload_0         
	//   27   65:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
	//   28   68:iconst_1        
	//   29   69:invokestatic    #77  <Method void CrashlyticsUncaughtExceptionHandler.access$1000(CrashlyticsUncaughtExceptionHandler, boolean)>
		Fabric.getLogger().d("CrashlyticsCore", "Closed all previously open sessions");
	//   30   72:invokestatic    #41  <Method Logger Fabric.getLogger()>
	//   31   75:ldc1            #43  <String "CrashlyticsCore">
	//   32   77:ldc1            #79  <String "Closed all previously open sessions">
	//   33   79:invokeinterface #51  <Method void Logger.d(String, String)>
		return Boolean.TRUE;
	//   34   84:getstatic       #82  <Field Boolean Boolean.TRUE>
	//   35   87:areturn         
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method Boolean call()>
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
