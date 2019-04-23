// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

class CrashlyticsController$13
	implements Callable
{

	public Boolean call()
		throws Exception
	{
		if(isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CrashlyticsController this$0>
	//*   2    4:invokevirtual   #34  <Method boolean CrashlyticsController.isHandlingException()>
	//*   3    7:ifeq            26
		{
			Fabric.getLogger().d("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
	//    4   10:invokestatic    #40  <Method Logger Fabric.getLogger()>
	//    5   13:ldc1            #42  <String "CrashlyticsCore">
	//    6   15:ldc1            #44  <String "Skipping session finalization because a crash has already occurred.">
	//    7   17:invokeinterface #50  <Method void Logger.d(String, String)>
			return Boolean.FALSE;
	//    8   22:getstatic       #56  <Field Boolean Boolean.FALSE>
	//    9   25:areturn         
		} else
		{
			Fabric.getLogger().d("CrashlyticsCore", "Finalizing previously open sessions.");
	//   10   26:invokestatic    #40  <Method Logger Fabric.getLogger()>
	//   11   29:ldc1            #42  <String "CrashlyticsCore">
	//   12   31:ldc1            #58  <String "Finalizing previously open sessions.">
	//   13   33:invokeinterface #50  <Method void Logger.d(String, String)>
			CrashlyticsController.access$1300(CrashlyticsController.this, val$sessionSettingsData, true);
	//   14   38:aload_0         
	//   15   39:getfield        #20  <Field CrashlyticsController this$0>
	//   16   42:aload_0         
	//   17   43:getfield        #22  <Field SessionSettingsData val$sessionSettingsData>
	//   18   46:iconst_1        
	//   19   47:invokestatic    #62  <Method void CrashlyticsController.access$1300(CrashlyticsController, SessionSettingsData, boolean)>
			Fabric.getLogger().d("CrashlyticsCore", "Closed all previously open sessions");
	//   20   50:invokestatic    #40  <Method Logger Fabric.getLogger()>
	//   21   53:ldc1            #42  <String "CrashlyticsCore">
	//   22   55:ldc1            #64  <String "Closed all previously open sessions">
	//   23   57:invokeinterface #50  <Method void Logger.d(String, String)>
			return Boolean.TRUE;
	//   24   62:getstatic       #67  <Field Boolean Boolean.TRUE>
	//   25   65:areturn         
		}
	}

	public volatile Object call()
		throws Exception
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method Boolean call()>
	//    2    4:areturn         
	}

	final CrashlyticsController this$0;
	final SessionSettingsData val$sessionSettingsData;

	CrashlyticsController$13()
	{
		this$0 = final_crashlyticscontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field CrashlyticsController this$0>
		val$sessionSettingsData = SessionSettingsData.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field SessionSettingsData val$sessionSettingsData>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
