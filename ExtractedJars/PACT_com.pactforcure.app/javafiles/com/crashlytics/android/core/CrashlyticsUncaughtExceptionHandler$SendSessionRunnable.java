// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.Settings;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsUncaughtExceptionHandler, CrashlyticsCore, ReportUploader, SessionReport

private static final class CrashlyticsUncaughtExceptionHandler$SendSessionRunnable
	implements Runnable
{

	public void run()
	{
		if(CommonUtils.canTryConnection(crashlyticsCore.getContext()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field CrashlyticsCore crashlyticsCore>
	//*   2    4:invokevirtual   #30  <Method android.content.Context CrashlyticsCore.getContext()>
	//*   3    7:invokestatic    #36  <Method boolean CommonUtils.canTryConnection(android.content.Context)>
	//*   4   10:ifne            14
	//*   5   13:return          
		{
			Fabric.getLogger().d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
	//    6   14:invokestatic    #42  <Method Logger Fabric.getLogger()>
	//    7   17:ldc1            #44  <String "CrashlyticsCore">
	//    8   19:ldc1            #46  <String "Attempting to send crash report at time of crash...">
	//    9   21:invokeinterface #52  <Method void Logger.d(String, String)>
			Object obj = ((Object) (Settings.getInstance().awaitSettingsData()));
	//   10   26:invokestatic    #58  <Method Settings Settings.getInstance()>
	//   11   29:invokevirtual   #62  <Method io.fabric.sdk.android.services.settings.SettingsData Settings.awaitSettingsData()>
	//   12   32:astore_1        
			obj = ((Object) (crashlyticsCore.getCreateReportSpiCall(((io.fabric.sdk.android.services.settings.SettingsData) (obj)))));
	//   13   33:aload_0         
	//   14   34:getfield        #20  <Field CrashlyticsCore crashlyticsCore>
	//   15   37:aload_1         
	//   16   38:invokevirtual   #66  <Method CreateReportSpiCall CrashlyticsCore.getCreateReportSpiCall(io.fabric.sdk.android.services.settings.SettingsData)>
	//   17   41:astore_1        
			if(obj != null)
	//*  18   42:aload_1         
	//*  19   43:ifnull          13
			{
				(new ReportUploader(crashlyticsCore.getApiKey(), ((CreateReportSpiCall) (obj)))).forceUpload(((Report) (new SessionReport(fileToSend, CrashlyticsUncaughtExceptionHandler.access$1200()))));
	//   20   46:new             #68  <Class ReportUploader>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:getfield        #20  <Field CrashlyticsCore crashlyticsCore>
	//   24   54:invokevirtual   #72  <Method String CrashlyticsCore.getApiKey()>
	//   25   57:aload_1         
	//   26   58:invokespecial   #75  <Method void ReportUploader(String, CreateReportSpiCall)>
	//   27   61:new             #77  <Class SessionReport>
	//   28   64:dup             
	//   29   65:aload_0         
	//   30   66:getfield        #22  <Field File fileToSend>
	//   31   69:invokestatic    #81  <Method java.util.Map CrashlyticsUncaughtExceptionHandler.access$1200()>
	//   32   72:invokespecial   #84  <Method void SessionReport(File, java.util.Map)>
	//   33   75:invokevirtual   #88  <Method boolean ReportUploader.forceUpload(Report)>
	//   34   78:pop             
				return;
	//   35   79:return          
			}
		}
	}

	private final CrashlyticsCore crashlyticsCore;
	private final File fileToSend;

	public CrashlyticsUncaughtExceptionHandler$SendSessionRunnable(CrashlyticsCore crashlyticscore, File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		crashlyticsCore = crashlyticscore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field CrashlyticsCore crashlyticsCore>
		fileToSend = file;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field File fileToSend>
	//    8   14:return          
	}
}
