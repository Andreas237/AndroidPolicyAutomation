// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.core.internal.models.SessionEventData;
import com.crashlytics.android.core.internal.models.SignalData;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.settings.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//			UnityVersionProvider, CrashlyticsCore, LogFileManager, DevicePowerStateListener, 
//			MiddleOutFallbackStrategy, StackTraceTrimmingStrategy, RemoveRepeatsStrategy, ClsFileOutputStream, 
//			CodedOutputStream, CLSUUID, MetaDataStore, NativeCrashWriter, 
//			DefaultCreateReportSpiCall, UserMetaData, ReportUploader, AppData, 
//			SessionReport, CrashlyticsBackgroundWorker, PreferenceManager, Utils, 
//			SessionProtobufHelper, TrimmedThrowableData, CrashlyticsUncaughtExceptionHandler, CreateReportSpiCall, 
//			CrashPromptDialog, Report

class CrashlyticsController
{
	private static class AnySessionPartFileFilter
		implements FilenameFilter
	{

		public boolean accept(File file, String s)
		{
			return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, s) && CrashlyticsController.SESSION_FILE_PATTERN.matcher(((CharSequence) (s))).matches();
		//    0    0:getstatic       #22  <Field FilenameFilter CrashlyticsController.SESSION_FILE_FILTER>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:invokeinterface #24  <Method boolean FilenameFilter.accept(File, String)>
		//    4   10:ifne            28
		//    5   13:invokestatic    #28  <Method Pattern CrashlyticsController.access$000()>
		//    6   16:aload_2         
		//    7   17:invokevirtual   #34  <Method Matcher Pattern.matcher(CharSequence)>
		//    8   20:invokevirtual   #40  <Method boolean Matcher.matches()>
		//    9   23:ifeq            28
		//   10   26:iconst_1        
		//   11   27:ireturn         
		//   12   28:iconst_0        
		//   13   29:ireturn         
		}

		private AnySessionPartFileFilter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	static class FileNameContainsFilter
		implements FilenameFilter
	{

		public boolean accept(File file, String s)
		{
			return s.contains(((CharSequence) (string))) && !s.endsWith(".cls_temp");
		//    0    0:aload_2         
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field String string>
		//    3    5:invokevirtual   #27  <Method boolean String.contains(CharSequence)>
		//    4    8:ifeq            22
		//    5   11:aload_2         
		//    6   12:ldc1            #29  <String ".cls_temp">
		//    7   14:invokevirtual   #33  <Method boolean String.endsWith(String)>
		//    8   17:ifne            22
		//    9   20:iconst_1        
		//   10   21:ireturn         
		//   11   22:iconst_0        
		//   12   23:ireturn         
		}

		private final String string;

		public FileNameContainsFilter(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			string = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String string>
		//    5    9:return          
		}
	}

	static class InvalidPartFileFilter
		implements FilenameFilter
	{

		public boolean accept(File file, String s)
		{
			return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, s) || s.contains("SessionMissingBinaryImages");
		//    0    0:getstatic       #22  <Field FilenameFilter ClsFileOutputStream.TEMP_FILENAME_FILTER>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:invokeinterface #24  <Method boolean FilenameFilter.accept(File, String)>
		//    4   10:ifne            27
		//    5   13:aload_2         
		//    6   14:ldc1            #26  <String "SessionMissingBinaryImages">
		//    7   16:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
		//    8   19:ifeq            25
		//    9   22:goto            27
		//   10   25:iconst_0        
		//   11   26:ireturn         
		//   12   27:iconst_1        
		//   13   28:ireturn         
		}

		InvalidPartFileFilter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class LogFileDirectoryProvider
		implements LogFileManager.DirectoryProvider
	{

		public File getLogFileDir()
		{
			File file = new File(rootFileStore.getFilesDir(), "log-files");
		//    0    0:new             #23  <Class File>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field FileStore rootFileStore>
		//    4    8:invokeinterface #28  <Method File FileStore.getFilesDir()>
		//    5   13:ldc1            #30  <String "log-files">
		//    6   15:invokespecial   #33  <Method void File(File, String)>
		//    7   18:astore_1        
			if(!file.exists())
		//*   8   19:aload_1         
		//*   9   20:invokevirtual   #37  <Method boolean File.exists()>
		//*  10   23:ifne            31
				file.mkdirs();
		//   11   26:aload_1         
		//   12   27:invokevirtual   #40  <Method boolean File.mkdirs()>
		//   13   30:pop             
			return file;
		//   14   31:aload_1         
		//   15   32:areturn         
		}

		private final FileStore rootFileStore;

		public LogFileDirectoryProvider(FileStore filestore)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			rootFileStore = filestore;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field FileStore rootFileStore>
		//    5    9:return          
		}
	}

	private static final class PrivacyDialogCheck
		implements ReportUploader.SendCheck
	{

		public boolean canSendReports()
		{
			Activity activity = kit.getFabric().getCurrentActivity();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field Kit kit>
		//    2    4:invokevirtual   #41  <Method Fabric Kit.getFabric()>
		//    3    7:invokevirtual   #47  <Method Activity Fabric.getCurrentActivity()>
		//    4   10:astore_1        
			if(activity != null && !activity.isFinishing())
		//*   5   11:aload_1         
		//*   6   12:ifnull          78
		//*   7   15:aload_1         
		//*   8   16:invokevirtual   #52  <Method boolean Activity.isFinishing()>
		//*   9   19:ifeq            25
		//*  10   22:goto            78
			{
				Object obj = ((Object) (new CrashPromptDialog.AlwaysSendCallback() {

					public void sendUserReportsWithoutPrompting(boolean flag)
					{
						preferenceManager.setShouldAlwaysSendReports(flag);
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field CrashlyticsController$PrivacyDialogCheck this$0>
					//    2    4:invokestatic    #30  <Method PreferenceManager CrashlyticsController$PrivacyDialogCheck.access$1500(CrashlyticsController$PrivacyDialogCheck)>
					//    3    7:iload_1         
					//    4    8:invokevirtual   #35  <Method void PreferenceManager.setShouldAlwaysSendReports(boolean)>
					//    5   11:return          
					}

					final PrivacyDialogCheck this$0;

			
			{
				this$0 = PrivacyDialogCheck.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsController$PrivacyDialogCheck this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
				}
));
		//   11   25:new             #11  <Class CrashlyticsController$PrivacyDialogCheck$1>
		//   12   28:dup             
		//   13   29:aload_0         
		//   14   30:invokespecial   #55  <Method void CrashlyticsController$PrivacyDialogCheck$1(CrashlyticsController$PrivacyDialogCheck)>
		//   15   33:astore_2        
				obj = ((Object) (CrashPromptDialog.create(activity, promptData, ((CrashPromptDialog.AlwaysSendCallback) (obj)))));
		//   16   34:aload_1         
		//   17   35:aload_0         
		//   18   36:getfield        #30  <Field PromptSettingsData promptData>
		//   19   39:aload_2         
		//   20   40:invokestatic    #61  <Method CrashPromptDialog CrashPromptDialog.create(Activity, PromptSettingsData, CrashPromptDialog$AlwaysSendCallback)>
		//   21   43:astore_2        
				activity.runOnUiThread(((_cls2) (obj)). new Runnable() {

					public void run()
					{
						dialog.show();
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field CrashPromptDialog val$dialog>
					//    2    4:invokevirtual   #34  <Method void CrashPromptDialog.show()>
					//    3    7:return          
					}

					final PrivacyDialogCheck this$0;
					final CrashPromptDialog val$dialog;

			
			{
				this$0 = final_privacydialogcheck;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CrashlyticsController$PrivacyDialogCheck this$0>
				dialog = CrashPromptDialog.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field CrashPromptDialog val$dialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//   22   44:aload_1         
		//   23   45:new             #13  <Class CrashlyticsController$PrivacyDialogCheck$2>
		//   24   48:dup             
		//   25   49:aload_0         
		//   26   50:aload_2         
		//   27   51:invokespecial   #64  <Method void CrashlyticsController$PrivacyDialogCheck$2(CrashlyticsController$PrivacyDialogCheck, CrashPromptDialog)>
		//   28   54:invokevirtual   #68  <Method void Activity.runOnUiThread(Runnable)>
				Fabric.getLogger().d("CrashlyticsCore", "Waiting for user opt-in.");
		//   29   57:invokestatic    #72  <Method Logger Fabric.getLogger()>
		//   30   60:ldc1            #74  <String "CrashlyticsCore">
		//   31   62:ldc1            #76  <String "Waiting for user opt-in.">
		//   32   64:invokeinterface #82  <Method void Logger.d(String, String)>
				((CrashPromptDialog) (obj)).await();
		//   33   69:aload_2         
		//   34   70:invokevirtual   #85  <Method void CrashPromptDialog.await()>
				return ((CrashPromptDialog) (obj)).getOptIn();
		//   35   73:aload_2         
		//   36   74:invokevirtual   #88  <Method boolean CrashPromptDialog.getOptIn()>
		//   37   77:ireturn         
			} else
			{
				return true;
		//   38   78:iconst_1        
		//   39   79:ireturn         
			}
		}

		private final Kit kit;
		private final PreferenceManager preferenceManager;
		private final PromptSettingsData promptData;


/*
		static PreferenceManager access$1500(PrivacyDialogCheck privacydialogcheck)
		{
			return privacydialogcheck.preferenceManager;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field PreferenceManager preferenceManager>
		//    2    4:areturn         
		}

*/

		public PrivacyDialogCheck(Kit kit1, PreferenceManager preferencemanager, PromptSettingsData promptsettingsdata)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			kit = kit1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field Kit kit>
			preferenceManager = preferencemanager;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field PreferenceManager preferenceManager>
			promptData = promptsettingsdata;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field PromptSettingsData promptData>
		//   11   19:return          
		}
	}

	private final class ReportUploaderFilesProvider
		implements ReportUploader.ReportFilesProvider
	{

		public File[] getCompleteSessionFiles()
		{
			return listCompleteSessionFiles();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CrashlyticsController this$0>
		//    2    4:invokevirtual   #27  <Method File[] CrashlyticsController.listCompleteSessionFiles()>
		//    3    7:areturn         
		}

		public File[] getInvalidSessionFiles()
		{
			return getInvalidFilesDir().listFiles();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CrashlyticsController this$0>
		//    2    4:invokevirtual   #32  <Method File CrashlyticsController.getInvalidFilesDir()>
		//    3    7:invokevirtual   #37  <Method File[] File.listFiles()>
		//    4   10:areturn         
		}

		final CrashlyticsController this$0;

		private ReportUploaderFilesProvider()
		{
			this$0 = CrashlyticsController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CrashlyticsController this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private final class ReportUploaderHandlingExceptionCheck
		implements ReportUploader.HandlingExceptionCheck
	{

		public boolean isHandlingException()
		{
			return CrashlyticsController.this.isHandlingException();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CrashlyticsController this$0>
		//    2    4:invokevirtual   #26  <Method boolean CrashlyticsController.isHandlingException()>
		//    3    7:ireturn         
		}

		final CrashlyticsController this$0;

		private ReportUploaderHandlingExceptionCheck()
		{
			this$0 = CrashlyticsController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CrashlyticsController this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private static final class SendReportRunnable
		implements Runnable
	{

		public void run()
		{
			if(!CommonUtils.canTryConnection(context))
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field Context context>
		//*   2    4:invokestatic    #34  <Method boolean CommonUtils.canTryConnection(Context)>
		//*   3    7:ifne            11
			{
				return;
		//    4   10:return          
			} else
			{
				Fabric.getLogger().d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
		//    5   11:invokestatic    #40  <Method Logger Fabric.getLogger()>
		//    6   14:ldc1            #42  <String "CrashlyticsCore">
		//    7   16:ldc1            #44  <String "Attempting to send crash report at time of crash...">
		//    8   18:invokeinterface #50  <Method void Logger.d(String, String)>
				reportUploader.forceUpload(report);
		//    9   23:aload_0         
		//   10   24:getfield        #26  <Field ReportUploader reportUploader>
		//   11   27:aload_0         
		//   12   28:getfield        #24  <Field Report report>
		//   13   31:invokevirtual   #56  <Method boolean ReportUploader.forceUpload(Report)>
		//   14   34:pop             
				return;
		//   15   35:return          
			}
		}

		private final Context context;
		private final Report report;
		private final ReportUploader reportUploader;

		public SendReportRunnable(Context context1, Report report1, ReportUploader reportuploader)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			context = context1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field Context context>
			report = report1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Report report>
			reportUploader = reportuploader;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field ReportUploader reportUploader>
		//   11   19:return          
		}
	}

	static class SessionPartFileFilter
		implements FilenameFilter
	{

		public boolean accept(File file, String s)
		{
			file = ((File) (new StringBuilder()));
		//    0    0:new             #23  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #24  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (file)).append(sessionId);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field String sessionId>
		//    7   13:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			((StringBuilder) (file)).append(".cls");
		//    9   17:aload_1         
		//   10   18:ldc1            #30  <String ".cls">
		//   11   20:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
		//   12   23:pop             
			boolean flag = s.equals(((Object) (((StringBuilder) (file)).toString())));
		//   13   24:aload_2         
		//   14   25:aload_1         
		//   15   26:invokevirtual   #34  <Method String StringBuilder.toString()>
		//   16   29:invokevirtual   #40  <Method boolean String.equals(Object)>
		//   17   32:istore_3        
			boolean flag1 = false;
		//   18   33:iconst_0        
		//   19   34:istore          4
			if(flag)
		//*  20   36:iload_3         
		//*  21   37:ifeq            42
				return false;
		//   22   40:iconst_0        
		//   23   41:ireturn         
			flag = flag1;
		//   24   42:iload           4
		//   25   44:istore_3        
			if(s.contains(((CharSequence) (sessionId))))
		//*  26   45:aload_2         
		//*  27   46:aload_0         
		//*  28   47:getfield        #18  <Field String sessionId>
		//*  29   50:invokevirtual   #44  <Method boolean String.contains(CharSequence)>
		//*  30   53:ifeq            70
			{
				flag = flag1;
		//   31   56:iload           4
		//   32   58:istore_3        
				if(!s.endsWith(".cls_temp"))
		//*  33   59:aload_2         
		//*  34   60:ldc1            #46  <String ".cls_temp">
		//*  35   62:invokevirtual   #50  <Method boolean String.endsWith(String)>
		//*  36   65:ifne            70
					flag = true;
		//   37   68:iconst_1        
		//   38   69:istore_3        
			}
			return flag;
		//   39   70:iload_3         
		//   40   71:ireturn         
		}

		private final String sessionId;

		public SessionPartFileFilter(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			sessionId = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String sessionId>
		//    5    9:return          
		}
	}


	CrashlyticsController(CrashlyticsCore crashlyticscore, CrashlyticsBackgroundWorker crashlyticsbackgroundworker, HttpRequestFactory httprequestfactory, IdManager idmanager, PreferenceManager preferencemanager, FileStore filestore, AppData appdata, 
			UnityVersionProvider unityversionprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #158 <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #161 <Method void AtomicInteger(int)>
	//    7   13:putfield        #163 <Field AtomicInteger eventCounter>
		crashlyticsCore = crashlyticscore;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #165 <Field CrashlyticsCore crashlyticsCore>
		backgroundWorker = crashlyticsbackgroundworker;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #167 <Field CrashlyticsBackgroundWorker backgroundWorker>
		httpRequestFactory = httprequestfactory;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #169 <Field HttpRequestFactory httpRequestFactory>
		idManager = idmanager;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #171 <Field IdManager idManager>
		preferenceManager = preferencemanager;
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:putfield        #173 <Field PreferenceManager preferenceManager>
		fileStore = filestore;
	//   23   43:aload_0         
	//   24   44:aload           6
	//   25   46:putfield        #175 <Field FileStore fileStore>
		appData = appdata;
	//   26   49:aload_0         
	//   27   50:aload           7
	//   28   52:putfield        #177 <Field AppData appData>
		unityVersion = unityversionprovider.getUnityVersion();
	//   29   55:aload_0         
	//   30   56:aload           8
	//   31   58:invokeinterface #183 <Method String UnityVersionProvider.getUnityVersion()>
	//   32   63:putfield        #185 <Field String unityVersion>
		crashlyticscore = ((CrashlyticsCore) (crashlyticscore.getContext()));
	//   33   66:aload_1         
	//   34   67:invokevirtual   #191 <Method Context CrashlyticsCore.getContext()>
	//   35   70:astore_1        
		logFileDirectoryProvider = new LogFileDirectoryProvider(filestore);
	//   36   71:aload_0         
	//   37   72:new             #37  <Class CrashlyticsController$LogFileDirectoryProvider>
	//   38   75:dup             
	//   39   76:aload           6
	//   40   78:invokespecial   #194 <Method void CrashlyticsController$LogFileDirectoryProvider(FileStore)>
	//   41   81:putfield        #196 <Field CrashlyticsController$LogFileDirectoryProvider logFileDirectoryProvider>
		logFileManager = new LogFileManager(((Context) (crashlyticscore)), ((LogFileManager.DirectoryProvider) (logFileDirectoryProvider)));
	//   42   84:aload_0         
	//   43   85:new             #198 <Class LogFileManager>
	//   44   88:dup             
	//   45   89:aload_1         
	//   46   90:aload_0         
	//   47   91:getfield        #196 <Field CrashlyticsController$LogFileDirectoryProvider logFileDirectoryProvider>
	//   48   94:invokespecial   #201 <Method void LogFileManager(Context, LogFileManager$DirectoryProvider)>
	//   49   97:putfield        #203 <Field LogFileManager logFileManager>
	//   50  100:aload_0         
	//   51  101:new             #47  <Class CrashlyticsController$ReportUploaderFilesProvider>
	//   52  104:dup             
	//   53  105:aload_0         
	//   54  106:aconst_null     
	//   55  107:invokespecial   #206 <Method void CrashlyticsController$ReportUploaderFilesProvider(CrashlyticsController, CrashlyticsController$1)>
	//   56  110:putfield        #208 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   57  113:aload_0         
	//   58  114:new             #50  <Class CrashlyticsController$ReportUploaderHandlingExceptionCheck>
	//   59  117:dup             
	//   60  118:aload_0         
	//   61  119:aconst_null     
	//   62  120:invokespecial   #209 <Method void CrashlyticsController$ReportUploaderHandlingExceptionCheck(CrashlyticsController, CrashlyticsController$1)>
	//   63  123:putfield        #211 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
		devicePowerStateListener = new DevicePowerStateListener(((Context) (crashlyticscore)));
	//   64  126:aload_0         
	//   65  127:new             #213 <Class DevicePowerStateListener>
	//   66  130:dup             
	//   67  131:aload_1         
	//   68  132:invokespecial   #216 <Method void DevicePowerStateListener(Context)>
	//   69  135:putfield        #218 <Field DevicePowerStateListener devicePowerStateListener>
	//   70  138:aload_0         
	//   71  139:new             #220 <Class MiddleOutFallbackStrategy>
	//   72  142:dup             
	//   73  143:sipush          1024
	//   74  146:iconst_1        
	//   75  147:anewarray       StackTraceTrimmingStrategy[]
	//   76  150:dup             
	//   77  151:iconst_0        
	//   78  152:new             #224 <Class RemoveRepeatsStrategy>
	//   79  155:dup             
	//   80  156:bipush          10
	//   81  158:invokespecial   #225 <Method void RemoveRepeatsStrategy(int)>
	//   82  161:aastore         
	//   83  162:invokespecial   #228 <Method void MiddleOutFallbackStrategy(int, StackTraceTrimmingStrategy[])>
	//   84  165:putfield        #230 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//   85  168:return          
	}

	private void closeOpenSessions(File afile[], int i, int j)
	{
		Fabric.getLogger().d("CrashlyticsCore", "Closing open sessions.");
	//    0    0:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    1    3:ldc2            #290 <String "CrashlyticsCore">
	//    2    6:ldc2            #292 <String "Closing open sessions.">
	//    3    9:invokeinterface #298 <Method void Logger.d(String, String)>
		for(; i < afile.length; i++)
	//*   4   14:iload_2         
	//*   5   15:aload_1         
	//*   6   16:arraylength     
	//*   7   17:icmpge          94
		{
			File file = afile[i];
	//    8   20:aload_1         
	//    9   21:iload_2         
	//   10   22:aaload          
	//   11   23:astore          4
			String s = getSessionIdFromSessionFile(file);
	//   12   25:aload           4
	//   13   27:invokestatic    #302 <Method String getSessionIdFromSessionFile(File)>
	//   14   30:astore          5
			Logger logger = Fabric.getLogger();
	//   15   32:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   16   35:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #304 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #305 <Method void StringBuilder()>
	//   20   44:astore          7
			stringbuilder.append("Closing session: ");
	//   21   46:aload           7
	//   22   48:ldc2            #307 <String "Closing session: ">
	//   23   51:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			stringbuilder.append(s);
	//   25   55:aload           7
	//   26   57:aload           5
	//   27   59:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
			logger.d("CrashlyticsCore", stringbuilder.toString());
	//   29   63:aload           6
	//   30   65:ldc2            #290 <String "CrashlyticsCore">
	//   31   68:aload           7
	//   32   70:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   33   73:invokeinterface #298 <Method void Logger.d(String, String)>
			writeSessionPartsToSessionFile(file, s, j);
	//   34   78:aload_0         
	//   35   79:aload           4
	//   36   81:aload           5
	//   37   83:iload_3         
	//   38   84:invokespecial   #318 <Method void writeSessionPartsToSessionFile(File, String, int)>
		}

	//   39   87:iload_2         
	//   40   88:iconst_1        
	//   41   89:iadd            
	//   42   90:istore_2        
	//*  43   91:goto            14
	//   44   94:return          
	}

	private void closeWithoutRenamingOrLog(ClsFileOutputStream clsfileoutputstream)
	{
		if(clsfileoutputstream == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		try
		{
			clsfileoutputstream.closeInProgressStream();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #325 <Method void ClsFileOutputStream.closeInProgressStream()>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ClsFileOutputStream clsfileoutputstream)
	//*   6   10:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (clsfileoutputstream)));
	//    7   11:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    8   14:ldc2            #290 <String "CrashlyticsCore">
	//    9   17:ldc2            #327 <String "Error closing session file stream in the presence of an exception">
	//   10   20:aload_1         
	//   11   21:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
		}
	//   12   26:return          
	}

	private static void copyToCodedOutputStream(InputStream inputstream, CodedOutputStream codedoutputstream, int i)
		throws IOException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_2         
	//    1    1:newarray        byte[]
	//    2    3:astore          4
		i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
		{
			if(i >= abyte0.length)
				break;
	//    5    7:iload_2         
	//    6    8:aload           4
	//    7   10:arraylength     
	//    8   11:icmpge          38
			int j = inputstream.read(abyte0, i, abyte0.length - i);
	//    9   14:aload_0         
	//   10   15:aload           4
	//   11   17:iload_2         
	//   12   18:aload           4
	//   13   20:arraylength     
	//   14   21:iload_2         
	//   15   22:isub            
	//   16   23:invokevirtual   #339 <Method int InputStream.read(byte[], int, int)>
	//   17   26:istore_3        
			if(j < 0)
				break;
	//   18   27:iload_3         
	//   19   28:iflt            38
			i += j;
	//   20   31:iload_2         
	//   21   32:iload_3         
	//   22   33:iadd            
	//   23   34:istore_2        
		} while(true);
	//   24   35:goto            7
		codedoutputstream.writeRawBytes(abyte0);
	//   25   38:aload_1         
	//   26   39:aload           4
	//   27   41:invokevirtual   #345 <Method void CodedOutputStream.writeRawBytes(byte[])>
	//   28   44:return          
	}

	private void deleteSessionPartFilesFor(String s)
	{
		s = ((String) (listSessionPartFilesFor(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #351 <Method File[] listSessionPartFilesFor(String)>
	//    3    5:astore_1        
		int j = s.length;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          30
			((File) (s[i])).delete();
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:aaload          
	//   15   19:invokevirtual   #357 <Method boolean File.delete()>
	//   16   22:pop             

	//   17   23:iload_2         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_2        
	//*  21   27:goto            11
	//   22   30:return          
	}

	private void doCloseSessions(SessionSettingsData sessionsettingsdata, boolean flag)
		throws Exception
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #359 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #361 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #365 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void doOpenSession()
		throws Exception
	{
		Date date = new Date();
	//    0    0:new             #367 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #368 <Method void Date()>
	//    3    7:astore_1        
		String s = (new CLSUUID(idManager)).toString();
	//    4    8:new             #370 <Class CLSUUID>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #171 <Field IdManager idManager>
	//    8   16:invokespecial   #373 <Method void CLSUUID(IdManager)>
	//    9   19:invokevirtual   #374 <Method String CLSUUID.toString()>
	//   10   22:astore_2        
		Logger logger = Fabric.getLogger();
	//   11   23:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   12   26:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #304 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #305 <Method void StringBuilder()>
	//   16   34:astore          4
		stringbuilder.append("Opening a new session with ID ");
	//   17   36:aload           4
	//   18   38:ldc2            #376 <String "Opening a new session with ID ">
	//   19   41:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(s);
	//   21   45:aload           4
	//   22   47:aload_2         
	//   23   48:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		logger.d("CrashlyticsCore", stringbuilder.toString());
	//   25   52:aload_3         
	//   26   53:ldc2            #290 <String "CrashlyticsCore">
	//   27   56:aload           4
	//   28   58:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   29   61:invokeinterface #298 <Method void Logger.d(String, String)>
		writeBeginSession(s, date);
	//   30   66:aload_0         
	//   31   67:aload_2         
	//   32   68:aload_1         
	//   33   69:invokespecial   #380 <Method void writeBeginSession(String, Date)>
		writeSessionApp(s);
	//   34   72:aload_0         
	//   35   73:aload_2         
	//   36   74:invokespecial   #383 <Method void writeSessionApp(String)>
		writeSessionOS(s);
	//   37   77:aload_0         
	//   38   78:aload_2         
	//   39   79:invokespecial   #386 <Method void writeSessionOS(String)>
		writeSessionDevice(s);
	//   40   82:aload_0         
	//   41   83:aload_2         
	//   42   84:invokespecial   #389 <Method void writeSessionDevice(String)>
		logFileManager.setCurrentSession(s);
	//   43   87:aload_0         
	//   44   88:getfield        #203 <Field LogFileManager logFileManager>
	//   45   91:aload_2         
	//   46   92:invokevirtual   #392 <Method void LogFileManager.setCurrentSession(String)>
	//   47   95:return          
	}

	private void doWriteExternalCrashEvent(SessionEventData sessioneventdata)
		throws IOException
	{
		ClsFileOutputStream clsfileoutputstream;
		Object obj2;
		Object obj3;
		Object obj4;
		clsfileoutputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          7
		obj4 = null;
	//    6    9:aconst_null     
	//    7   10:astore          9
		String s = getPreviousSessionId();
	//    8   12:aload_0         
	//    9   13:invokespecial   #395 <Method String getPreviousSessionId()>
	//   10   16:astore          10
		if(s != null)
			break MISSING_BLOCK_LABEL_53;
	//   11   18:aload           10
	//   12   20:ifnonnull       53
		Fabric.getLogger().e("CrashlyticsCore", "Tried to write a native crash while no session was open.", ((Throwable) (null)));
	//   13   23:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   14   26:ldc2            #290 <String "CrashlyticsCore">
	//   15   29:ldc2            #397 <String "Tried to write a native crash while no session was open.">
	//   16   32:aconst_null     
	//   17   33:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   18   38:aconst_null     
	//   19   39:ldc2            #399 <String "Failed to flush to session begin file.">
	//   20   42:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   21   45:aconst_null     
	//   22   46:ldc2            #407 <String "Failed to close fatal exception file output stream.">
	//   23   49:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   24   52:return          
		Object obj;
		Object obj1;
		obj = ((Object) (Locale.US));
	//   25   53:getstatic       #417 <Field Locale Locale.US>
	//   26   56:astore          4
		obj1 = ((Object) (sessioneventdata.signal.code));
	//   27   58:aload_1         
	//   28   59:getfield        #423 <Field SignalData SessionEventData.signal>
	//   29   62:getfield        #428 <Field String SignalData.code>
	//   30   65:astore          5
		boolean flag1 = false;
	//   31   67:iconst_0        
	//   32   68:istore_3        
		recordFatalExceptionAnswersEvent(s, String.format(((Locale) (obj)), "<native-crash [%s (%s)]>", new Object[] {
			obj1, sessioneventdata.signal.name
		}));
	//   33   69:aload           10
	//   34   71:aload           4
	//   35   73:ldc2            #430 <String "<native-crash [%s (%s)]>">
	//   36   76:iconst_2        
	//   37   77:anewarray       Object[]
	//   38   80:dup             
	//   39   81:iconst_0        
	//   40   82:aload           5
	//   41   84:aastore         
	//   42   85:dup             
	//   43   86:iconst_1        
	//   44   87:aload_1         
	//   45   88:getfield        #423 <Field SignalData SessionEventData.signal>
	//   46   91:getfield        #433 <Field String SignalData.name>
	//   47   94:aastore         
	//   48   95:invokestatic    #437 <Method String String.format(Locale, String, Object[])>
	//   49   98:invokestatic    #440 <Method void recordFatalExceptionAnswersEvent(String, String)>
		boolean flag = flag1;
	//   50  101:iload_3         
	//   51  102:istore_2        
		if(sessioneventdata.binaryImages == null) goto _L2; else goto _L1
	//   52  103:aload_1         
	//   53  104:getfield        #444 <Field com.crashlytics.android.core.internal.models.BinaryImageData[] SessionEventData.binaryImages>
	//   54  107:ifnull          356
_L1:
		flag = flag1;
	//   55  110:iload_3         
	//   56  111:istore_2        
		if(sessioneventdata.binaryImages.length > 0)
	//*  57  112:aload_1         
	//*  58  113:getfield        #444 <Field com.crashlytics.android.core.internal.models.BinaryImageData[] SessionEventData.binaryImages>
	//*  59  116:arraylength     
	//*  60  117:ifle            356
			flag = true;
	//   61  120:iconst_1        
	//   62  121:istore_2        
		  goto _L2
	//*  63  122:goto            356
_L4:
		obj1 = ((Object) (getFilesDir()));
	//   64  125:aload_0         
	//   65  126:invokevirtual   #448 <Method File getFilesDir()>
	//   66  129:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   67  131:new             #304 <Class StringBuilder>
	//   68  134:dup             
	//   69  135:invokespecial   #305 <Method void StringBuilder()>
	//   70  138:astore          11
		stringbuilder.append(s);
	//   71  140:aload           11
	//   72  142:aload           10
	//   73  144:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   74  147:pop             
		stringbuilder.append(((String) (obj)));
	//   75  148:aload           11
	//   76  150:aload           4
	//   77  152:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   78  155:pop             
		obj1 = ((Object) (new ClsFileOutputStream(((File) (obj1)), stringbuilder.toString())));
	//   79  156:new             #322 <Class ClsFileOutputStream>
	//   80  159:dup             
	//   81  160:aload           5
	//   82  162:aload           11
	//   83  164:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   84  167:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   85  170:astore          5
		obj2 = ((Object) (obj4));
	//   86  172:aload           9
	//   87  174:astore          7
		obj = ((Object) (obj3));
	//   88  176:aload           8
	//   89  178:astore          4
		clsfileoutputstream = ((ClsFileOutputStream) (obj1));
	//   90  180:aload           5
	//   91  182:astore          6
		CodedOutputStream codedoutputstream;
		Map map;
		try
		{
			codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)));
	//   92  184:aload           5
	//   93  186:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   94  189:astore          8
		}
	//*  95  191:aload           8
	//*  96  193:astore          7
	//*  97  195:aload           8
	//*  98  197:astore          4
	//*  99  199:aload           5
	//* 100  201:astore          6
	//* 101  203:new             #457 <Class MetaDataStore>
	//* 102  206:dup             
	//* 103  207:aload_0         
	//* 104  208:invokevirtual   #448 <Method File getFilesDir()>
	//* 105  211:invokespecial   #460 <Method void MetaDataStore(File)>
	//* 106  214:aload           10
	//* 107  216:invokevirtual   #464 <Method Map MetaDataStore.readKeyData(String)>
	//* 108  219:astore          9
	//* 109  221:aload           8
	//* 110  223:astore          7
	//* 111  225:aload           8
	//* 112  227:astore          4
	//* 113  229:aload           5
	//* 114  231:astore          6
	//* 115  233:aload_1         
	//* 116  234:new             #198 <Class LogFileManager>
	//* 117  237:dup             
	//* 118  238:aload_0         
	//* 119  239:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//* 120  242:invokevirtual   #191 <Method Context CrashlyticsCore.getContext()>
	//* 121  245:aload_0         
	//* 122  246:getfield        #196 <Field CrashlyticsController$LogFileDirectoryProvider logFileDirectoryProvider>
	//* 123  249:aload           10
	//* 124  251:invokespecial   #467 <Method void LogFileManager(Context, LogFileManager$DirectoryProvider, String)>
	//* 125  254:aload           9
	//* 126  256:aload           8
	//* 127  258:invokestatic    #473 <Method void NativeCrashWriter.writeNativeCrash(SessionEventData, LogFileManager, Map, CodedOutputStream)>
	//* 128  261:aload           8
	//* 129  263:astore_1        
	//* 130  264:goto            321
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 131  267:astore          4
		{
			sessioneventdata = ((SessionEventData) (obj2));
	//  132  269:aload           7
	//  133  271:astore_1        
			obj2 = obj;
	//  134  272:aload           4
	//  135  274:astore          7
			break MISSING_BLOCK_LABEL_298;
	//  136  276:goto            298
		}
		obj2 = ((Object) (codedoutputstream));
		obj = ((Object) (codedoutputstream));
		clsfileoutputstream = ((ClsFileOutputStream) (obj1));
		map = (new MetaDataStore(getFilesDir())).readKeyData(s);
		obj2 = ((Object) (codedoutputstream));
		obj = ((Object) (codedoutputstream));
		clsfileoutputstream = ((ClsFileOutputStream) (obj1));
		NativeCrashWriter.writeNativeCrash(sessioneventdata, new LogFileManager(crashlyticsCore.getContext(), ((LogFileManager.DirectoryProvider) (logFileDirectoryProvider)), s), map, codedoutputstream);
		sessioneventdata = ((SessionEventData) (codedoutputstream));
		break MISSING_BLOCK_LABEL_321;
		sessioneventdata;
	//  137  279:astore_1        
		clsfileoutputstream = null;
	//  138  280:aconst_null     
	//  139  281:astore          6
		obj = obj2;
	//  140  283:aload           7
	//  141  285:astore          4
		break MISSING_BLOCK_LABEL_338;
	//  142  287:goto            338
		Exception exception;
		exception;
	//  143  290:astore          7
		obj1 = null;
	//  144  292:aconst_null     
	//  145  293:astore          5
		sessioneventdata = ((SessionEventData) (clsfileoutputstream));
	//  146  295:aload           6
	//  147  297:astore_1        
		obj = ((Object) (sessioneventdata));
	//  148  298:aload_1         
	//  149  299:astore          4
		clsfileoutputstream = ((ClsFileOutputStream) (obj1));
	//  150  301:aload           5
	//  151  303:astore          6
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the native crash logger", ((Throwable) (exception)));
	//  152  305:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//  153  308:ldc2            #290 <String "CrashlyticsCore">
	//  154  311:ldc2            #475 <String "An error occurred in the native crash logger">
	//  155  314:aload           7
	//  156  316:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (sessioneventdata)), "Failed to flush to session begin file.");
	//  157  321:aload_1         
	//  158  322:ldc2            #399 <String "Failed to flush to session begin file.">
	//  159  325:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
	//  160  328:aload           5
	//  161  330:ldc2            #407 <String "Failed to close fatal exception file output stream.">
	//  162  333:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  163  336:return          
		sessioneventdata;
	//  164  337:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
	//  165  338:aload           4
	//  166  340:ldc2            #399 <String "Failed to flush to session begin file.">
	//  167  343:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (clsfileoutputstream)), "Failed to close fatal exception file output stream.");
	//  168  346:aload           6
	//  169  348:ldc2            #407 <String "Failed to close fatal exception file output stream.">
	//  170  351:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw sessioneventdata;
	//  171  354:aload_1         
	//  172  355:athrow          
_L2:
		if(flag)
	//* 173  356:iload_2         
	//* 174  357:ifeq            368
			obj = "SessionCrash";
	//  175  360:ldc2            #477 <String "SessionCrash">
	//  176  363:astore          4
		else
	//* 177  365:goto            125
			obj = "SessionMissingBinaryImages";
	//  178  368:ldc2            #479 <String "SessionMissingBinaryImages">
	//  179  371:astore          4
		if(true) goto _L4; else goto _L3
	//  180  373:goto            125
_L3:
	}

	private File[] ensureFileArrayNotNull(File afile[])
	{
		File afile1[] = afile;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(afile == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       11
			afile1 = new File[0];
	//    4    6:iconst_0        
	//    5    7:anewarray       File[]
	//    6   10:astore_2        
		return afile1;
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	private CreateReportSpiCall getCreateReportSpiCall(String s)
	{
		String s1 = CommonUtils.getStringsFileValue(crashlyticsCore.getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #191 <Method Context CrashlyticsCore.getContext()>
	//    3    7:ldc2            #485 <String "com.crashlytics.ApiEndpoint">
	//    4   10:invokestatic    #489 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    5   13:astore_2        
		return ((CreateReportSpiCall) (new DefaultCreateReportSpiCall(((Kit) (crashlyticsCore)), s1, s, httpRequestFactory)));
	//    6   14:new             #491 <Class DefaultCreateReportSpiCall>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #169 <Field HttpRequestFactory httpRequestFactory>
	//   14   28:invokespecial   #494 <Method void DefaultCreateReportSpiCall(Kit, String, String, HttpRequestFactory)>
	//   15   31:areturn         
	}

	private String getCurrentSessionId()
	{
		File afile[] = listSortedSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #499 <Method File[] listSortedSessionBeginFiles()>
	//    2    4:astore_1        
		if(afile.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            17
			return getSessionIdFromSessionFile(afile[0]);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:invokestatic    #302 <Method String getSessionIdFromSessionFile(File)>
	//   10   16:areturn         
		else
			return null;
	//   11   17:aconst_null     
	//   12   18:areturn         
	}

	private String getPreviousSessionId()
	{
		File afile[] = listSortedSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #499 <Method File[] listSortedSessionBeginFiles()>
	//    2    4:astore_1        
		if(afile.length > 1)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:iconst_1        
	//*   6    8:icmple          18
			return getSessionIdFromSessionFile(afile[1]);
	//    7   11:aload_1         
	//    8   12:iconst_1        
	//    9   13:aaload          
	//   10   14:invokestatic    #302 <Method String getSessionIdFromSessionFile(File)>
	//   11   17:areturn         
		else
			return null;
	//   12   18:aconst_null     
	//   13   19:areturn         
	}

	static String getSessionIdFromSessionFile(File file)
	{
		return file.getName().substring(0, 35);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #502 <Method String File.getName()>
	//    2    4:iconst_0        
	//    3    5:bipush          35
	//    4    7:invokevirtual   #506 <Method String String.substring(int, int)>
	//    5   10:areturn         
	}

	private File[] getTrimmedNonFatalFiles(String s, File afile[], int i)
	{
		File afile1[] = afile;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(afile.length > i)
	//*   2    3:aload_2         
	//*   3    4:arraylength     
	//*   4    5:iload_3         
	//*   5    6:icmple          85
		{
			Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
				Integer.valueOf(i)
			}));
	//    6    9:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    7   12:ldc2            #290 <String "CrashlyticsCore">
	//    8   15:getstatic       #417 <Field Locale Locale.US>
	//    9   18:ldc2            #510 <String "Trimming down to %d logged exceptions.">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:iload_3         
	//   15   28:invokestatic    #516 <Method Integer Integer.valueOf(int)>
	//   16   31:aastore         
	//   17   32:invokestatic    #437 <Method String String.format(Locale, String, Object[])>
	//   18   35:invokeinterface #298 <Method void Logger.d(String, String)>
			trimSessionEventFiles(s, i);
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:iload_3         
	//   22   43:invokespecial   #520 <Method void trimSessionEventFiles(String, int)>
			afile = ((File []) (new StringBuilder()));
	//   23   46:new             #304 <Class StringBuilder>
	//   24   49:dup             
	//   25   50:invokespecial   #305 <Method void StringBuilder()>
	//   26   53:astore_2        
			((StringBuilder) (afile)).append(s);
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			((StringBuilder) (afile)).append("SessionEvent");
	//   31   60:aload_2         
	//   32   61:ldc2            #522 <String "SessionEvent">
	//   33   64:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
			afile1 = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (afile)).toString()))));
	//   35   68:aload_0         
	//   36   69:new             #31  <Class CrashlyticsController$FileNameContainsFilter>
	//   37   72:dup             
	//   38   73:aload_2         
	//   39   74:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   40   77:invokespecial   #523 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   41   80:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//   42   83:astore          4
		}
		return afile1;
	//   43   85:aload           4
	//   44   87:areturn         
	}

	private UserMetaData getUserMetaData(String s)
	{
		if(isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #528 <Method boolean isHandlingException()>
	//*   2    4:ifeq            36
			return new UserMetaData(crashlyticsCore.getUserIdentifier(), crashlyticsCore.getUserName(), crashlyticsCore.getUserEmail());
	//    3    7:new             #530 <Class UserMetaData>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//    7   15:invokevirtual   #533 <Method String CrashlyticsCore.getUserIdentifier()>
	//    8   18:aload_0         
	//    9   19:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//   10   22:invokevirtual   #536 <Method String CrashlyticsCore.getUserName()>
	//   11   25:aload_0         
	//   12   26:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//   13   29:invokevirtual   #539 <Method String CrashlyticsCore.getUserEmail()>
	//   14   32:invokespecial   #542 <Method void UserMetaData(String, String, String)>
	//   15   35:areturn         
		else
			return (new MetaDataStore(getFilesDir())).readUserData(s);
	//   16   36:new             #457 <Class MetaDataStore>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokevirtual   #448 <Method File getFilesDir()>
	//   20   44:invokespecial   #460 <Method void MetaDataStore(File)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #545 <Method UserMetaData MetaDataStore.readUserData(String)>
	//   23   51:areturn         
	}

	private File[] listFiles(File file)
	{
		return ensureFileArrayNotNull(file.listFiles());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #549 <Method File[] File.listFiles()>
	//    3    5:invokespecial   #551 <Method File[] ensureFileArrayNotNull(File[])>
	//    4    8:areturn         
	}

	private File[] listFilesMatching(File file, FilenameFilter filenamefilter)
	{
		return ensureFileArrayNotNull(file.listFiles(filenamefilter));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #554 <Method File[] File.listFiles(FilenameFilter)>
	//    4    6:invokespecial   #551 <Method File[] ensureFileArrayNotNull(File[])>
	//    5    9:areturn         
	}

	private File[] listFilesMatching(FilenameFilter filenamefilter)
	{
		return listFilesMatching(getFilesDir(), filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #448 <Method File getFilesDir()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #556 <Method File[] listFilesMatching(File, FilenameFilter)>
	//    5    9:areturn         
	}

	private File[] listSessionPartFilesFor(String s)
	{
		return listFilesMatching(((FilenameFilter) (new SessionPartFileFilter(s))));
	//    0    0:aload_0         
	//    1    1:new             #56  <Class CrashlyticsController$SessionPartFileFilter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #557 <Method void CrashlyticsController$SessionPartFileFilter(String)>
	//    5    9:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//    6   12:areturn         
	}

	private File[] listSortedSessionBeginFiles()
	{
		File afile[] = listSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #560 <Method File[] listSessionBeginFiles()>
	//    2    4:astore_1        
		Arrays.sort(((Object []) (afile)), LARGEST_FILE_NAME_FIRST);
	//    3    5:aload_1         
	//    4    6:getstatic       #113 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #566 <Method void Arrays.sort(Object[], Comparator)>
		return afile;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	private static void recordFatalExceptionAnswersEvent(String s, String s1)
	{
		Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #568 <Class Answers>
	//    1    3:invokestatic    #572 <Method Kit Fabric.getKit(Class)>
	//    2    6:checkcast       #568 <Class Answers>
	//    3    9:astore_2        
		if(answers == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       29
		{
			Fabric.getLogger().d("CrashlyticsCore", "Answers is not available");
	//    6   14:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    7   17:ldc2            #290 <String "CrashlyticsCore">
	//    8   20:ldc2            #574 <String "Answers is not available">
	//    9   23:invokeinterface #298 <Method void Logger.d(String, String)>
			return;
	//   10   28:return          
		} else
		{
			answers.onException(new io.fabric.sdk.android.services.common.Crash.FatalException(s, s1));
	//   11   29:aload_2         
	//   12   30:new             #576 <Class io.fabric.sdk.android.services.common.Crash$FatalException>
	//   13   33:dup             
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #578 <Method void io.fabric.sdk.android.services.common.Crash$FatalException(String, String)>
	//   17   39:invokevirtual   #582 <Method void Answers.onException(io.fabric.sdk.android.services.common.Crash$FatalException)>
			return;
	//   18   42:return          
		}
	}

	private void retainSessions(File afile[], Set set)
	{
		int j = afile.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          163
		{
			File file = afile[i];
	//    8   12:aload_1         
	//    9   13:iload_3         
	//   10   14:aaload          
	//   11   15:astore          5
			String s = file.getName();
	//   12   17:aload           5
	//   13   19:invokevirtual   #502 <Method String File.getName()>
	//   14   22:astore          6
			Matcher matcher = SESSION_FILE_PATTERN.matcher(((CharSequence) (s)));
	//   15   24:getstatic       #129 <Field Pattern SESSION_FILE_PATTERN>
	//   16   27:aload           6
	//   17   29:invokevirtual   #588 <Method Matcher Pattern.matcher(CharSequence)>
	//   18   32:astore          7
			if(!matcher.matches())
	//*  19   34:aload           7
	//*  20   36:invokevirtual   #593 <Method boolean Matcher.matches()>
	//*  21   39:ifne            89
			{
				afile = ((File []) (Fabric.getLogger()));
	//   22   42:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   23   45:astore_1        
				set = ((Set) (new StringBuilder()));
	//   24   46:new             #304 <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #305 <Method void StringBuilder()>
	//   27   53:astore_2        
				((StringBuilder) (set)).append("Deleting unknown file: ");
	//   28   54:aload_2         
	//   29   55:ldc2            #595 <String "Deleting unknown file: ">
	//   30   58:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
				((StringBuilder) (set)).append(s);
	//   32   62:aload_2         
	//   33   63:aload           6
	//   34   65:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
				((Logger) (afile)).d("CrashlyticsCore", ((StringBuilder) (set)).toString());
	//   36   69:aload_1         
	//   37   70:ldc2            #290 <String "CrashlyticsCore">
	//   38   73:aload_2         
	//   39   74:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   40   77:invokeinterface #298 <Method void Logger.d(String, String)>
				file.delete();
	//   41   82:aload           5
	//   42   84:invokevirtual   #357 <Method boolean File.delete()>
	//   43   87:pop             
				return;
	//   44   88:return          
			}
			if(!set.contains(((Object) (matcher.group(1)))))
	//*  45   89:aload_2         
	//*  46   90:aload           7
	//*  47   92:iconst_1        
	//*  48   93:invokevirtual   #599 <Method String Matcher.group(int)>
	//*  49   96:invokeinterface #605 <Method boolean Set.contains(Object)>
	//*  50  101:ifne            156
			{
				Logger logger = Fabric.getLogger();
	//   51  104:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   52  107:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   53  109:new             #304 <Class StringBuilder>
	//   54  112:dup             
	//   55  113:invokespecial   #305 <Method void StringBuilder()>
	//   56  116:astore          8
				stringbuilder.append("Trimming session file: ");
	//   57  118:aload           8
	//   58  120:ldc2            #607 <String "Trimming session file: ">
	//   59  123:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   60  126:pop             
				stringbuilder.append(s);
	//   61  127:aload           8
	//   62  129:aload           6
	//   63  131:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   64  134:pop             
				logger.d("CrashlyticsCore", stringbuilder.toString());
	//   65  135:aload           7
	//   66  137:ldc2            #290 <String "CrashlyticsCore">
	//   67  140:aload           8
	//   68  142:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   69  145:invokeinterface #298 <Method void Logger.d(String, String)>
				file.delete();
	//   70  150:aload           5
	//   71  152:invokevirtual   #357 <Method boolean File.delete()>
	//   72  155:pop             
			}
		}

	//   73  156:iload_3         
	//   74  157:iconst_1        
	//   75  158:iadd            
	//   76  159:istore_3        
	//*  77  160:goto            6
	//   78  163:return          
	}

	private void sendSessionReports(SettingsData settingsdata)
	{
		if(settingsdata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			Fabric.getLogger().w("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
	//    2    4:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    3    7:ldc2            #290 <String "CrashlyticsCore">
	//    4   10:ldc2            #611 <String "Cannot send reports. Settings are unavailable.">
	//    5   13:invokeinterface #614 <Method void Logger.w(String, String)>
			return;
	//    6   18:return          
		}
		Context context = crashlyticsCore.getContext();
	//    7   19:aload_0         
	//    8   20:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//    9   23:invokevirtual   #191 <Method Context CrashlyticsCore.getContext()>
	//   10   26:astore          4
		settingsdata = ((SettingsData) (getCreateReportSpiCall(settingsdata.appData.reportsUrl)));
	//   11   28:aload_0         
	//   12   29:aload_1         
	//   13   30:getfield        #619 <Field AppSettingsData SettingsData.appData>
	//   14   33:getfield        #624 <Field String AppSettingsData.reportsUrl>
	//   15   36:invokespecial   #626 <Method CreateReportSpiCall getCreateReportSpiCall(String)>
	//   16   39:astore_1        
		settingsdata = ((SettingsData) (new ReportUploader(appData.apiKey, ((CreateReportSpiCall) (settingsdata)), reportFilesProvider, handlingExceptionCheck)));
	//   17   40:new             #628 <Class ReportUploader>
	//   18   43:dup             
	//   19   44:aload_0         
	//   20   45:getfield        #177 <Field AppData appData>
	//   21   48:getfield        #633 <Field String AppData.apiKey>
	//   22   51:aload_1         
	//   23   52:aload_0         
	//   24   53:getfield        #208 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   25   56:aload_0         
	//   26   57:getfield        #211 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
	//   27   60:invokespecial   #636 <Method void ReportUploader(String, CreateReportSpiCall, ReportUploader$ReportFilesProvider, ReportUploader$HandlingExceptionCheck)>
	//   28   63:astore_1        
		File afile[] = listCompleteSessionFiles();
	//   29   64:aload_0         
	//   30   65:invokevirtual   #639 <Method File[] listCompleteSessionFiles()>
	//   31   68:astore          5
		int j = afile.length;
	//   32   70:aload           5
	//   33   72:arraylength     
	//   34   73:istore_3        
		for(int i = 0; i < j; i++)
	//*  35   74:iconst_0        
	//*  36   75:istore_2        
	//*  37   76:iload_2         
	//*  38   77:iload_3         
	//*  39   78:icmpge          124
		{
			SessionReport sessionreport = new SessionReport(afile[i], SEND_AT_CRASHTIME_HEADER);
	//   40   81:new             #641 <Class SessionReport>
	//   41   84:dup             
	//   42   85:aload           5
	//   43   87:iload_2         
	//   44   88:aaload          
	//   45   89:getstatic       #141 <Field Map SEND_AT_CRASHTIME_HEADER>
	//   46   92:invokespecial   #644 <Method void SessionReport(File, Map)>
	//   47   95:astore          6
			backgroundWorker.submit(((Runnable) (new SendReportRunnable(context, ((Report) (sessionreport)), ((ReportUploader) (settingsdata))))));
	//   48   97:aload_0         
	//   49   98:getfield        #167 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//   50  101:new             #53  <Class CrashlyticsController$SendReportRunnable>
	//   51  104:dup             
	//   52  105:aload           4
	//   53  107:aload           6
	//   54  109:aload_1         
	//   55  110:invokespecial   #647 <Method void CrashlyticsController$SendReportRunnable(Context, Report, ReportUploader)>
	//   56  113:invokevirtual   #653 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//   57  116:pop             
		}

	//   58  117:iload_2         
	//   59  118:iconst_1        
	//   60  119:iadd            
	//   61  120:istore_2        
	//*  62  121:goto            76
	//   63  124:return          
	}

	private boolean shouldPromptUserBeforeSendingCrashReports(SettingsData settingsdata)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(settingsdata == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		boolean flag = flag1;
	//    6    8:iload_3         
	//    7    9:istore_2        
		if(settingsdata.featuresData.promptEnabled)
	//*   8   10:aload_1         
	//*   9   11:getfield        #657 <Field FeaturesSettingsData SettingsData.featuresData>
	//*  10   14:getfield        #663 <Field boolean FeaturesSettingsData.promptEnabled>
	//*  11   17:ifeq            34
		{
			flag = flag1;
	//   12   20:iload_3         
	//   13   21:istore_2        
			if(!preferenceManager.shouldAlwaysSendReports())
	//*  14   22:aload_0         
	//*  15   23:getfield        #173 <Field PreferenceManager preferenceManager>
	//*  16   26:invokevirtual   #668 <Method boolean PreferenceManager.shouldAlwaysSendReports()>
	//*  17   29:ifne            34
				flag = true;
	//   18   32:iconst_1        
	//   19   33:istore_2        
		}
		return flag;
	//   20   34:iload_2         
	//   21   35:ireturn         
	}

	private void synthesizeSessionFile(File file, String s, File afile[], File file1)
	{
		boolean flag;
		Object obj;
		Object obj1;
		CodedOutputStream codedoutputstream;
		Object obj3;
		Object obj4;
		if(file1 != null)
	//*   0    0:aload           4
	//*   1    2:ifnull          11
			flag = true;
	//    2    5:iconst_1        
	//    3    6:istore          5
		else
	//*   4    8:goto            14
			flag = false;
	//    5   11:iconst_0        
	//    6   12:istore          5
		if(flag)
	//*   7   14:iload           5
	//*   8   16:ifeq            28
			obj = ((Object) (getFatalSessionFilesDir()));
	//    9   19:aload_0         
	//   10   20:invokevirtual   #673 <Method File getFatalSessionFilesDir()>
	//   11   23:astore          6
		else
	//*  12   25:goto            34
			obj = ((Object) (getNonFatalSessionFilesDir()));
	//   13   28:aload_0         
	//   14   29:invokevirtual   #676 <Method File getNonFatalSessionFilesDir()>
	//   15   32:astore          6
		if(!((File) (obj)).exists())
	//*  16   34:aload           6
	//*  17   36:invokevirtual   #679 <Method boolean File.exists()>
	//*  18   39:ifne            48
			((File) (obj)).mkdirs();
	//   19   42:aload           6
	//   20   44:invokevirtual   #682 <Method boolean File.mkdirs()>
	//   21   47:pop             
		codedoutputstream = null;
	//   22   48:aconst_null     
	//   23   49:astore          8
		obj3 = null;
	//   24   51:aconst_null     
	//   25   52:astore          10
		obj1 = null;
	//   26   54:aconst_null     
	//   27   55:astore          7
		obj4 = null;
	//   28   57:aconst_null     
	//   29   58:astore          11
		Object obj2 = ((Object) (new ClsFileOutputStream(((File) (obj)), s)));
	//   30   60:new             #322 <Class ClsFileOutputStream>
	//   31   63:dup             
	//   32   64:aload           6
	//   33   66:aload_2         
	//   34   67:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   35   70:astore          9
		codedoutputstream = ((CodedOutputStream) (obj4));
	//   36   72:aload           11
	//   37   74:astore          8
		obj = ((Object) (obj3));
	//   38   76:aload           10
	//   39   78:astore          6
		obj1 = obj2;
	//   40   80:aload           9
	//   41   82:astore          7
		CodedOutputStream codedoutputstream1;
		Logger logger;
		StringBuilder stringbuilder;
		try
		{
			codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
	//   42   84:aload           9
	//   43   86:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   44   89:astore          10
		}
	//*  45   91:aload           10
	//*  46   93:astore          8
	//*  47   95:aload           10
	//*  48   97:astore          6
	//*  49   99:aload           9
	//*  50  101:astore          7
	//*  51  103:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//*  52  106:astore          11
	//*  53  108:aload           10
	//*  54  110:astore          8
	//*  55  112:aload           10
	//*  56  114:astore          6
	//*  57  116:aload           9
	//*  58  118:astore          7
	//*  59  120:new             #304 <Class StringBuilder>
	//*  60  123:dup             
	//*  61  124:invokespecial   #305 <Method void StringBuilder()>
	//*  62  127:astore          12
	//*  63  129:aload           10
	//*  64  131:astore          8
	//*  65  133:aload           10
	//*  66  135:astore          6
	//*  67  137:aload           9
	//*  68  139:astore          7
	//*  69  141:aload           12
	//*  70  143:ldc2            #684 <String "Collecting SessionStart data for session ID ">
	//*  71  146:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//*  72  149:pop             
	//*  73  150:aload           10
	//*  74  152:astore          8
	//*  75  154:aload           10
	//*  76  156:astore          6
	//*  77  158:aload           9
	//*  78  160:astore          7
	//*  79  162:aload           12
	//*  80  164:aload_2         
	//*  81  165:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//*  82  168:pop             
	//*  83  169:aload           10
	//*  84  171:astore          8
	//*  85  173:aload           10
	//*  86  175:astore          6
	//*  87  177:aload           9
	//*  88  179:astore          7
	//*  89  181:aload           11
	//*  90  183:ldc2            #290 <String "CrashlyticsCore">
	//*  91  186:aload           12
	//*  92  188:invokevirtual   #314 <Method String StringBuilder.toString()>
	//*  93  191:invokeinterface #298 <Method void Logger.d(String, String)>
	//*  94  196:aload           10
	//*  95  198:astore          8
	//*  96  200:aload           10
	//*  97  202:astore          6
	//*  98  204:aload           9
	//*  99  206:astore          7
	//* 100  208:aload           10
	//* 101  210:aload_1         
	//* 102  211:invokestatic    #688 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//* 103  214:aload           10
	//* 104  216:astore          8
	//* 105  218:aload           10
	//* 106  220:astore          6
	//* 107  222:aload           9
	//* 108  224:astore          7
	//* 109  226:aload           10
	//* 110  228:iconst_4        
	//* 111  229:new             #367 <Class Date>
	//* 112  232:dup             
	//* 113  233:invokespecial   #368 <Method void Date()>
	//* 114  236:invokevirtual   #692 <Method long Date.getTime()>
	//* 115  239:ldc2w           #693 <Long 1000L>
	//* 116  242:ldiv            
	//* 117  243:invokevirtual   #698 <Method void CodedOutputStream.writeUInt64(int, long)>
	//* 118  246:aload           10
	//* 119  248:astore          8
	//* 120  250:aload           10
	//* 121  252:astore          6
	//* 122  254:aload           9
	//* 123  256:astore          7
	//* 124  258:aload           10
	//* 125  260:iconst_5        
	//* 126  261:iload           5
	//* 127  263:invokevirtual   #702 <Method void CodedOutputStream.writeBool(int, boolean)>
	//* 128  266:aload           10
	//* 129  268:astore          8
	//* 130  270:aload           10
	//* 131  272:astore          6
	//* 132  274:aload           9
	//* 133  276:astore          7
	//* 134  278:aload           10
	//* 135  280:bipush          11
	//* 136  282:iconst_1        
	//* 137  283:invokevirtual   #706 <Method void CodedOutputStream.writeUInt32(int, int)>
	//* 138  286:aload           10
	//* 139  288:astore          8
	//* 140  290:aload           10
	//* 141  292:astore          6
	//* 142  294:aload           9
	//* 143  296:astore          7
	//* 144  298:aload           10
	//* 145  300:bipush          12
	//* 146  302:iconst_3        
	//* 147  303:invokevirtual   #709 <Method void CodedOutputStream.writeEnum(int, int)>
	//* 148  306:aload           10
	//* 149  308:astore          8
	//* 150  310:aload           10
	//* 151  312:astore          6
	//* 152  314:aload           9
	//* 153  316:astore          7
	//* 154  318:aload_0         
	//* 155  319:aload           10
	//* 156  321:aload_2         
	//* 157  322:invokespecial   #713 <Method void writeInitialPartsTo(CodedOutputStream, String)>
	//* 158  325:aload           10
	//* 159  327:astore          8
	//* 160  329:aload           10
	//* 161  331:astore          6
	//* 162  333:aload           9
	//* 163  335:astore          7
	//* 164  337:aload           10
	//* 165  339:aload_3         
	//* 166  340:aload_2         
	//* 167  341:invokestatic    #717 <Method void writeNonFatalEventsTo(CodedOutputStream, File[], String)>
	//* 168  344:iload           5
	//* 169  346:ifeq            368
	//* 170  349:aload           10
	//* 171  351:astore          8
	//* 172  353:aload           10
	//* 173  355:astore          6
	//* 174  357:aload           9
	//* 175  359:astore          7
	//* 176  361:aload           10
	//* 177  363:aload           4
	//* 178  365:invokestatic    #688 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//* 179  368:aload           10
	//* 180  370:ldc2            #719 <String "Error flushing session file stream">
	//* 181  373:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//* 182  376:aload           9
	//* 183  378:ldc2            #721 <String "Failed to close CLS file">
	//* 184  381:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//* 185  384:return          
		// Misplaced declaration of an exception variable
		catch(File afile[])
	//* 186  385:astore_3        
		{
			file = ((File) (obj2));
	//  187  386:aload           9
	//  188  388:astore_1        
			break MISSING_BLOCK_LABEL_408;
	//  189  389:goto            408
		}
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		logger = Fabric.getLogger();
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		stringbuilder = new StringBuilder();
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		stringbuilder.append("Collecting SessionStart data for session ID ");
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		stringbuilder.append(s);
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		logger.d("CrashlyticsCore", stringbuilder.toString());
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		writeToCosFromFile(codedoutputstream1, file);
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		codedoutputstream1.writeUInt64(4, (new Date()).getTime() / 1000L);
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		codedoutputstream1.writeBool(5, flag);
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		codedoutputstream1.writeUInt32(11, 1);
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		codedoutputstream1.writeEnum(12, 3);
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		writeInitialPartsTo(codedoutputstream1, s);
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		writeNonFatalEventsTo(codedoutputstream1, afile, s);
		if(!flag)
			break MISSING_BLOCK_LABEL_368;
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj1 = obj2;
		writeToCosFromFile(codedoutputstream1, file1);
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream1)), "Error flushing session file stream");
		CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close CLS file");
		return;
		file;
	//  190  392:astore_1        
		s = null;
	//  191  393:aconst_null     
	//  192  394:astore_2        
		obj = obj1;
	//  193  395:aload           7
	//  194  397:astore          6
		obj1 = ((Object) (s));
	//  195  399:aload_2         
	//  196  400:astore          7
		break MISSING_BLOCK_LABEL_504;
	//  197  402:goto            504
		afile;
	//  198  405:astore_3        
		file = null;
	//  199  406:aconst_null     
	//  200  407:astore_1        
		obj = ((Object) (codedoutputstream));
	//  201  408:aload           8
	//  202  410:astore          6
		obj1 = ((Object) (file));
	//  203  412:aload_1         
	//  204  413:astore          7
		file1 = ((File) (Fabric.getLogger()));
	//  205  415:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//  206  418:astore          4
		obj = ((Object) (codedoutputstream));
	//  207  420:aload           8
	//  208  422:astore          6
		obj1 = ((Object) (file));
	//  209  424:aload_1         
	//  210  425:astore          7
		obj2 = ((Object) (new StringBuilder()));
	//  211  427:new             #304 <Class StringBuilder>
	//  212  430:dup             
	//  213  431:invokespecial   #305 <Method void StringBuilder()>
	//  214  434:astore          9
		obj = ((Object) (codedoutputstream));
	//  215  436:aload           8
	//  216  438:astore          6
		obj1 = ((Object) (file));
	//  217  440:aload_1         
	//  218  441:astore          7
		((StringBuilder) (obj2)).append("Failed to write session file for session ID: ");
	//  219  443:aload           9
	//  220  445:ldc2            #723 <String "Failed to write session file for session ID: ">
	//  221  448:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  222  451:pop             
		obj = ((Object) (codedoutputstream));
	//  223  452:aload           8
	//  224  454:astore          6
		obj1 = ((Object) (file));
	//  225  456:aload_1         
	//  226  457:astore          7
		((StringBuilder) (obj2)).append(s);
	//  227  459:aload           9
	//  228  461:aload_2         
	//  229  462:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  230  465:pop             
		obj = ((Object) (codedoutputstream));
	//  231  466:aload           8
	//  232  468:astore          6
		obj1 = ((Object) (file));
	//  233  470:aload_1         
	//  234  471:astore          7
		((Logger) (file1)).e("CrashlyticsCore", ((StringBuilder) (obj2)).toString(), ((Throwable) (afile)));
	//  235  473:aload           4
	//  236  475:ldc2            #290 <String "CrashlyticsCore">
	//  237  478:aload           9
	//  238  480:invokevirtual   #314 <Method String StringBuilder.toString()>
	//  239  483:aload_3         
	//  240  484:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Error flushing session file stream");
	//  241  489:aload           8
	//  242  491:ldc2            #719 <String "Error flushing session file stream">
	//  243  494:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		closeWithoutRenamingOrLog(((ClsFileOutputStream) (file)));
	//  244  497:aload_0         
	//  245  498:aload_1         
	//  246  499:invokespecial   #725 <Method void closeWithoutRenamingOrLog(ClsFileOutputStream)>
		return;
	//  247  502:return          
		file;
	//  248  503:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Error flushing session file stream");
	//  249  504:aload           6
	//  250  506:ldc2            #719 <String "Error flushing session file stream">
	//  251  509:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close CLS file");
	//  252  512:aload           7
	//  253  514:ldc2            #721 <String "Failed to close CLS file">
	//  254  517:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//  255  520:aload_1         
	//  256  521:athrow          
	}

	private void trimInvalidSessionFiles()
	{
		File file = getInvalidFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #729 <Method File getInvalidFilesDir()>
	//    2    4:astore_2        
		if(!file.exists())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #679 <Method boolean File.exists()>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		File afile[] = listFilesMatching(file, ((FilenameFilter) (new InvalidPartFileFilter())));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:new             #34  <Class CrashlyticsController$InvalidPartFileFilter>
	//   10   18:dup             
	//   11   19:invokespecial   #730 <Method void CrashlyticsController$InvalidPartFileFilter()>
	//   12   22:invokespecial   #556 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   13   25:astore_3        
		Arrays.sort(((Object []) (afile)), Collections.reverseOrder());
	//   14   26:aload_3         
	//   15   27:invokestatic    #734 <Method Comparator Collections.reverseOrder()>
	//   16   30:invokestatic    #566 <Method void Arrays.sort(Object[], Comparator)>
		HashSet hashset = new HashSet();
	//   17   33:new             #736 <Class HashSet>
	//   18   36:dup             
	//   19   37:invokespecial   #737 <Method void HashSet()>
	//   20   40:astore          4
		for(int i = 0; i < afile.length && ((Set) (hashset)).size() < 4; i++)
	//*  21   42:iconst_0        
	//*  22   43:istore_1        
	//*  23   44:iload_1         
	//*  24   45:aload_3         
	//*  25   46:arraylength     
	//*  26   47:icmpge          82
	//*  27   50:aload           4
	//*  28   52:invokeinterface #741 <Method int Set.size()>
	//*  29   57:iconst_4        
	//*  30   58:icmpge          82
			((Set) (hashset)).add(((Object) (getSessionIdFromSessionFile(afile[i]))));
	//   31   61:aload           4
	//   32   63:aload_3         
	//   33   64:iload_1         
	//   34   65:aaload          
	//   35   66:invokestatic    #302 <Method String getSessionIdFromSessionFile(File)>
	//   36   69:invokeinterface #744 <Method boolean Set.add(Object)>
	//   37   74:pop             

	//   38   75:iload_1         
	//   39   76:iconst_1        
	//   40   77:iadd            
	//   41   78:istore_1        
	//*  42   79:goto            44
		retainSessions(listFiles(file), ((Set) (hashset)));
	//   43   82:aload_0         
	//   44   83:aload_0         
	//   45   84:aload_2         
	//   46   85:invokespecial   #746 <Method File[] listFiles(File)>
	//   47   88:aload           4
	//   48   90:invokespecial   #748 <Method void retainSessions(File[], Set)>
	//   49   93:return          
	}

	private void trimOpenSessions(int i)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #736 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #737 <Method void HashSet()>
	//    3    7:astore_3        
		File afile[] = listSortedSessionBeginFiles();
	//    4    8:aload_0         
	//    5    9:invokespecial   #499 <Method File[] listSortedSessionBeginFiles()>
	//    6   12:astore          4
		int j = Math.min(i, afile.length);
	//    7   14:iload_1         
	//    8   15:aload           4
	//    9   17:arraylength     
	//   10   18:invokestatic    #755 <Method int Math.min(int, int)>
	//   11   21:istore_2        
		for(i = 0; i < j; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_1        
	//*  14   24:iload_1         
	//*  15   25:iload_2         
	//*  16   26:icmpge          50
			((Set) (hashset)).add(((Object) (getSessionIdFromSessionFile(afile[i]))));
	//   17   29:aload_3         
	//   18   30:aload           4
	//   19   32:iload_1         
	//   20   33:aaload          
	//   21   34:invokestatic    #302 <Method String getSessionIdFromSessionFile(File)>
	//   22   37:invokeinterface #744 <Method boolean Set.add(Object)>
	//   23   42:pop             

	//   24   43:iload_1         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_1        
	//*  28   47:goto            24
		logFileManager.discardOldLogFiles(((Set) (hashset)));
	//   29   50:aload_0         
	//   30   51:getfield        #203 <Field LogFileManager logFileManager>
	//   31   54:aload_3         
	//   32   55:invokevirtual   #759 <Method void LogFileManager.discardOldLogFiles(Set)>
		retainSessions(listFilesMatching(((FilenameFilter) (new AnySessionPartFileFilter()))), ((Set) (hashset)));
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:new             #28  <Class CrashlyticsController$AnySessionPartFileFilter>
	//   36   63:dup             
	//   37   64:aconst_null     
	//   38   65:invokespecial   #762 <Method void CrashlyticsController$AnySessionPartFileFilter(CrashlyticsController$1)>
	//   39   68:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//   40   71:aload_3         
	//   41   72:invokespecial   #748 <Method void retainSessions(File[], Set)>
	//   42   75:return          
	}

	private void trimSessionEventFiles(String s, int i)
	{
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #448 <Method File getFilesDir()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #304 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #305 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append(s);
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append("SessionEvent");
	//   11   21:aload           4
	//   12   23:ldc2            #522 <String "SessionEvent">
	//   13   26:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		Utils.capFileCount(file, ((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))), i, SMALLEST_FILE_NAME_FIRST);
	//   15   30:aload_3         
	//   16   31:new             #31  <Class CrashlyticsController$FileNameContainsFilter>
	//   17   34:dup             
	//   18   35:aload           4
	//   19   37:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   20   40:invokespecial   #523 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   21   43:iload_2         
	//   22   44:getstatic       #116 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   23   47:invokestatic    #768 <Method int Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   24   50:pop             
	//   25   51:return          
	}

	private void writeBeginSession(String s, Date date)
		throws Exception
	{
		CodedOutputStream codedoutputstream;
		CodedOutputStream codedoutputstream1;
		codedoutputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		codedoutputstream1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		Object obj;
		obj = ((Object) (getFilesDir()));
	//    4    5:aload_0         
	//    5    6:invokevirtual   #448 <Method File getFilesDir()>
	//    6    9:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #304 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #305 <Method void StringBuilder()>
	//   10   18:astore          6
		stringbuilder.append(s);
	//   11   20:aload           6
	//   12   22:aload_1         
	//   13   23:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		stringbuilder.append("BeginSession");
	//   15   27:aload           6
	//   16   29:ldc2            #770 <String "BeginSession">
	//   17   32:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		obj = ((Object) (new ClsFileOutputStream(((File) (obj)), stringbuilder.toString())));
	//   19   36:new             #322 <Class ClsFileOutputStream>
	//   20   39:dup             
	//   21   40:aload           4
	//   22   42:aload           6
	//   23   44:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   24   47:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   25   50:astore          4
		codedoutputstream = codedoutputstream1;
	//   26   52:aload           5
	//   27   54:astore_3        
		codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   28   55:aload           4
	//   29   57:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   30   60:astore          5
		codedoutputstream = codedoutputstream1;
	//   31   62:aload           5
	//   32   64:astore_3        
		SessionProtobufHelper.writeBeginSession(codedoutputstream1, s, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
			crashlyticsCore.getVersion()
		}), date.getTime() / 1000L);
	//   33   65:aload           5
	//   34   67:aload_1         
	//   35   68:getstatic       #417 <Field Locale Locale.US>
	//   36   71:ldc2            #772 <String "Crashlytics Android SDK/%s">
	//   37   74:iconst_1        
	//   38   75:anewarray       Object[]
	//   39   78:dup             
	//   40   79:iconst_0        
	//   41   80:aload_0         
	//   42   81:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//   43   84:invokevirtual   #775 <Method String CrashlyticsCore.getVersion()>
	//   44   87:aastore         
	//   45   88:invokestatic    #437 <Method String String.format(Locale, String, Object[])>
	//   46   91:aload_2         
	//   47   92:invokevirtual   #692 <Method long Date.getTime()>
	//   48   95:ldc2w           #693 <Long 1000L>
	//   49   98:ldiv            
	//   50   99:invokestatic    #780 <Method void SessionProtobufHelper.writeBeginSession(CodedOutputStream, String, String, long)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream1)), "Failed to flush to session begin file.");
	//   51  102:aload           5
	//   52  104:ldc2            #399 <String "Failed to flush to session begin file.">
	//   53  107:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close begin session file.");
	//   54  110:aload           4
	//   55  112:ldc2            #782 <String "Failed to close begin session file.">
	//   56  115:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   57  118:return          
		date;
	//   58  119:astore_2        
		s = ((String) (obj));
	//   59  120:aload           4
	//   60  122:astore_1        
		break MISSING_BLOCK_LABEL_129;
	//   61  123:goto            129
		date;
	//   62  126:astore_2        
		s = null;
	//   63  127:aconst_null     
	//   64  128:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to session begin file.");
	//   65  129:aload_3         
	//   66  130:ldc2            #399 <String "Failed to flush to session begin file.">
	//   67  133:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close begin session file.");
	//   68  136:aload_1         
	//   69  137:ldc2            #782 <String "Failed to close begin session file.">
	//   70  140:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw date;
	//   71  143:aload_2         
	//   72  144:athrow          
	}

	private void writeFatal(Date date, Thread thread, Throwable throwable)
	{
		Object obj;
		Object obj2;
		CodedOutputStream codedoutputstream;
		Object obj3;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		codedoutputstream = null;
	//    6    9:aconst_null     
	//    7   10:astore          7
		Object obj1 = ((Object) (getCurrentSessionId()));
	//    8   12:aload_0         
	//    9   13:invokespecial   #784 <Method String getCurrentSessionId()>
	//   10   16:astore          5
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_53;
	//   11   18:aload           5
	//   12   20:ifnonnull       53
		Fabric.getLogger().e("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", ((Throwable) (null)));
	//   13   23:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   14   26:ldc2            #290 <String "CrashlyticsCore">
	//   15   29:ldc2            #786 <String "Tried to write a fatal exception while no session was open.">
	//   16   32:aconst_null     
	//   17   33:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   18   38:aconst_null     
	//   19   39:ldc2            #399 <String "Failed to flush to session begin file.">
	//   20   42:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   21   45:aconst_null     
	//   22   46:ldc2            #407 <String "Failed to close fatal exception file output stream.">
	//   23   49:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   24   52:return          
		recordFatalExceptionAnswersEvent(((String) (obj1)), ((Object) (throwable)).getClass().getName());
	//   25   53:aload           5
	//   26   55:aload_3         
	//   27   56:invokevirtual   #790 <Method Class Object.getClass()>
	//   28   59:invokevirtual   #793 <Method String Class.getName()>
	//   29   62:invokestatic    #440 <Method void recordFatalExceptionAnswersEvent(String, String)>
		File file = getFilesDir();
	//   30   65:aload_0         
	//   31   66:invokevirtual   #448 <Method File getFilesDir()>
	//   32   69:astore          9
		StringBuilder stringbuilder = new StringBuilder();
	//   33   71:new             #304 <Class StringBuilder>
	//   34   74:dup             
	//   35   75:invokespecial   #305 <Method void StringBuilder()>
	//   36   78:astore          10
		stringbuilder.append(((String) (obj1)));
	//   37   80:aload           10
	//   38   82:aload           5
	//   39   84:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   40   87:pop             
		stringbuilder.append("SessionCrash");
	//   41   88:aload           10
	//   42   90:ldc2            #477 <String "SessionCrash">
	//   43   93:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
		obj1 = ((Object) (new ClsFileOutputStream(file, stringbuilder.toString())));
	//   45   97:new             #322 <Class ClsFileOutputStream>
	//   46  100:dup             
	//   47  101:aload           9
	//   48  103:aload           10
	//   49  105:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   50  108:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   51  111:astore          5
		obj = ((Object) (obj3));
	//   52  113:aload           8
	//   53  115:astore          4
		obj2 = obj1;
	//   54  117:aload           5
	//   55  119:astore          6
		CodedOutputStream codedoutputstream1;
		try
		{
			codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)));
	//   56  121:aload           5
	//   57  123:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   58  126:astore          8
		}
	//*  59  128:aload           8
	//*  60  130:astore          7
	//*  61  132:aload           8
	//*  62  134:astore          4
	//*  63  136:aload           5
	//*  64  138:astore          6
	//*  65  140:aload_0         
	//*  66  141:aload           8
	//*  67  143:aload_1         
	//*  68  144:aload_2         
	//*  69  145:aload_3         
	//*  70  146:ldc2            #795 <String "crash">
	//*  71  149:iconst_1        
	//*  72  150:invokespecial   #799 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
	//*  73  153:aload           8
	//*  74  155:astore_1        
	//*  75  156:aload           5
	//*  76  158:astore_2        
	//*  77  159:goto            212
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*  78  162:astore_3        
		{
			date = ((Date) (codedoutputstream));
	//   79  163:aload           7
	//   80  165:astore_1        
			thread = ((Thread) (obj1));
	//   81  166:aload           5
	//   82  168:astore_2        
			break MISSING_BLOCK_LABEL_191;
	//   83  169:goto            191
		}
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj2 = obj1;
		writeSessionEvent(codedoutputstream1, date, thread, throwable, "crash", true);
		date = ((Date) (codedoutputstream1));
		thread = ((Thread) (obj1));
		break MISSING_BLOCK_LABEL_212;
		date;
	//   84  172:astore_1        
		thread = null;
	//   85  173:aconst_null     
	//   86  174:astore_2        
		obj = obj2;
	//   87  175:aload           6
	//   88  177:astore          4
		obj2 = ((Object) (thread));
	//   89  179:aload_2         
	//   90  180:astore          6
		break MISSING_BLOCK_LABEL_228;
	//   91  182:goto            228
		throwable;
	//   92  185:astore_3        
		thread = null;
	//   93  186:aconst_null     
	//   94  187:astore_2        
		date = ((Date) (obj));
	//   95  188:aload           4
	//   96  190:astore_1        
		obj = ((Object) (date));
	//   97  191:aload_1         
	//   98  192:astore          4
		obj2 = ((Object) (thread));
	//   99  194:aload_2         
	//  100  195:astore          6
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the fatal exception logger", throwable);
	//  101  197:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//  102  200:ldc2            #290 <String "CrashlyticsCore">
	//  103  203:ldc2            #801 <String "An error occurred in the fatal exception logger">
	//  104  206:aload_3         
	//  105  207:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to session begin file.");
	//  106  212:aload_1         
	//  107  213:ldc2            #399 <String "Failed to flush to session begin file.">
	//  108  216:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (thread)), "Failed to close fatal exception file output stream.");
	//  109  219:aload_2         
	//  110  220:ldc2            #407 <String "Failed to close fatal exception file output stream.">
	//  111  223:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  112  226:return          
		date;
	//  113  227:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
	//  114  228:aload           4
	//  115  230:ldc2            #399 <String "Failed to flush to session begin file.">
	//  116  233:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close fatal exception file output stream.");
	//  117  236:aload           6
	//  118  238:ldc2            #407 <String "Failed to close fatal exception file output stream.">
	//  119  241:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw date;
	//  120  244:aload_1         
	//  121  245:athrow          
	}

	private void writeInitialPartsTo(CodedOutputStream codedoutputstream, String s)
		throws IOException
	{
		String as[] = INITIAL_SESSION_PART_TAGS;
	//    0    0:getstatic       #153 <Field String[] INITIAL_SESSION_PART_TAGS>
	//    1    3:astore          5
		int j = as.length;
	//    2    5:aload           5
	//    3    7:arraylength     
	//    4    8:istore          4
		for(int i = 0; i < j; i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_3        
	//*   7   12:iload_3         
	//*   8   13:iload           4
	//*   9   15:icmpge          215
		{
			String s1 = as[i];
	//   10   18:aload           5
	//   11   20:iload_3         
	//   12   21:aaload          
	//   13   22:astore          6
			Object obj = ((Object) (new StringBuilder()));
	//   14   24:new             #304 <Class StringBuilder>
	//   15   27:dup             
	//   16   28:invokespecial   #305 <Method void StringBuilder()>
	//   17   31:astore          7
			((StringBuilder) (obj)).append(s);
	//   18   33:aload           7
	//   19   35:aload_2         
	//   20   36:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			((StringBuilder) (obj)).append(s1);
	//   22   40:aload           7
	//   23   42:aload           6
	//   24   44:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   26   48:aload_0         
	//   27   49:new             #31  <Class CrashlyticsController$FileNameContainsFilter>
	//   28   52:dup             
	//   29   53:aload           7
	//   30   55:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   31   58:invokespecial   #523 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   32   61:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//   33   64:astore          7
			if(obj.length == 0)
	//*  34   66:aload           7
	//*  35   68:arraylength     
	//*  36   69:ifne            138
			{
				obj = ((Object) (Fabric.getLogger()));
	//   37   72:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   38   75:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   39   77:new             #304 <Class StringBuilder>
	//   40   80:dup             
	//   41   81:invokespecial   #305 <Method void StringBuilder()>
	//   42   84:astore          8
				stringbuilder.append("Can't find ");
	//   43   86:aload           8
	//   44   88:ldc2            #803 <String "Can't find ">
	//   45   91:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
				stringbuilder.append(s1);
	//   47   95:aload           8
	//   48   97:aload           6
	//   49   99:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
				stringbuilder.append(" data for session ID ");
	//   51  103:aload           8
	//   52  105:ldc2            #805 <String " data for session ID ">
	//   53  108:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:pop             
				stringbuilder.append(s);
	//   55  112:aload           8
	//   56  114:aload_2         
	//   57  115:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
				((Logger) (obj)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   59  119:aload           7
	//   60  121:ldc2            #290 <String "CrashlyticsCore">
	//   61  124:aload           8
	//   62  126:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   63  129:aconst_null     
	//   64  130:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
			} else
	//*  65  135:goto            208
			{
				Logger logger = Fabric.getLogger();
	//   66  138:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   67  141:astore          8
				StringBuilder stringbuilder1 = new StringBuilder();
	//   68  143:new             #304 <Class StringBuilder>
	//   69  146:dup             
	//   70  147:invokespecial   #305 <Method void StringBuilder()>
	//   71  150:astore          9
				stringbuilder1.append("Collecting ");
	//   72  152:aload           9
	//   73  154:ldc2            #807 <String "Collecting ">
	//   74  157:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   75  160:pop             
				stringbuilder1.append(s1);
	//   76  161:aload           9
	//   77  163:aload           6
	//   78  165:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   79  168:pop             
				stringbuilder1.append(" data for session ID ");
	//   80  169:aload           9
	//   81  171:ldc2            #805 <String " data for session ID ">
	//   82  174:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   83  177:pop             
				stringbuilder1.append(s);
	//   84  178:aload           9
	//   85  180:aload_2         
	//   86  181:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   87  184:pop             
				logger.d("CrashlyticsCore", stringbuilder1.toString());
	//   88  185:aload           8
	//   89  187:ldc2            #290 <String "CrashlyticsCore">
	//   90  190:aload           9
	//   91  192:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   92  195:invokeinterface #298 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, ((File) (obj[0])));
	//   93  200:aload_1         
	//   94  201:aload           7
	//   95  203:iconst_0        
	//   96  204:aaload          
	//   97  205:invokestatic    #688 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
		}

	//   98  208:iload_3         
	//   99  209:iconst_1        
	//  100  210:iadd            
	//  101  211:istore_3        
	//* 102  212:goto            12
	//  103  215:return          
	}

	private static void writeNonFatalEventsTo(CodedOutputStream codedoutputstream, File afile[], String s)
	{
		Arrays.sort(((Object []) (afile)), CommonUtils.FILE_MODIFIED_COMPARATOR);
	//    0    0:aload_1         
	//    1    1:getstatic       #810 <Field Comparator CommonUtils.FILE_MODIFIED_COMPARATOR>
	//    2    4:invokestatic    #566 <Method void Arrays.sort(Object[], Comparator)>
		int j = afile.length;
	//    3    7:aload_1         
	//    4    8:arraylength     
	//    5    9:istore          4
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          94
		{
			File file = afile[i];
	//   11   19:aload_1         
	//   12   20:iload_3         
	//   13   21:aaload          
	//   14   22:astore          5
			try
			{
				Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
					s, file.getName()
				}));
	//   15   24:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   16   27:ldc2            #290 <String "CrashlyticsCore">
	//   17   30:getstatic       #417 <Field Locale Locale.US>
	//   18   33:ldc2            #812 <String "Found Non Fatal for session ID %s in %s ">
	//   19   36:iconst_2        
	//   20   37:anewarray       Object[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:aload_2         
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_1        
	//   27   46:aload           5
	//   28   48:invokevirtual   #502 <Method String File.getName()>
	//   29   51:aastore         
	//   30   52:invokestatic    #437 <Method String String.format(Locale, String, Object[])>
	//   31   55:invokeinterface #298 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, file);
	//   32   60:aload_0         
	//   33   61:aload           5
	//   34   63:invokestatic    #688 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
	//*  35   66:goto            87
			catch(Exception exception)
	//*  36   69:astore          5
			{
				Fabric.getLogger().e("CrashlyticsCore", "Error writting non-fatal to session.", ((Throwable) (exception)));
	//   37   71:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   38   74:ldc2            #290 <String "CrashlyticsCore">
	//   39   77:ldc2            #814 <String "Error writting non-fatal to session.">
	//   40   80:aload           5
	//   41   82:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
			}
		}

	//   42   87:iload_3         
	//   43   88:iconst_1        
	//   44   89:iadd            
	//   45   90:istore_3        
	//*  46   91:goto            13
	//   47   94:return          
	}

	private void writeSessionApp(String s)
		throws Exception
	{
		Object obj1;
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #448 <Method File getFilesDir()>
	//    2    4:astore_3        
		obj1 = ((Object) (new StringBuilder()));
	//    3    5:new             #304 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #305 <Method void StringBuilder()>
	//    6   12:astore          4
		((StringBuilder) (obj1)).append(s);
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		((StringBuilder) (obj1)).append("SessionApp");
	//   11   21:aload           4
	//   12   23:ldc1            #147 <String "SessionApp">
	//   13   25:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		obj1 = ((Object) (new ClsFileOutputStream(file, ((StringBuilder) (obj1)).toString())));
	//   15   29:new             #322 <Class ClsFileOutputStream>
	//   16   32:dup             
	//   17   33:aload_3         
	//   18   34:aload           4
	//   19   36:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   20   39:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   21   42:astore          4
		Object obj = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   22   44:aload           4
	//   23   46:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   49:astore_3        
		s = idManager.getAppIdentifier();
	//   25   50:aload_0         
	//   26   51:getfield        #171 <Field IdManager idManager>
	//   27   54:invokevirtual   #819 <Method String IdManager.getAppIdentifier()>
	//   28   57:astore_1        
		String s1 = appData.versionCode;
	//   29   58:aload_0         
	//   30   59:getfield        #177 <Field AppData appData>
	//   31   62:getfield        #822 <Field String AppData.versionCode>
	//   32   65:astore          5
		String s2 = appData.versionName;
	//   33   67:aload_0         
	//   34   68:getfield        #177 <Field AppData appData>
	//   35   71:getfield        #825 <Field String AppData.versionName>
	//   36   74:astore          6
		String s3 = idManager.getAppInstallIdentifier();
	//   37   76:aload_0         
	//   38   77:getfield        #171 <Field IdManager idManager>
	//   39   80:invokevirtual   #828 <Method String IdManager.getAppInstallIdentifier()>
	//   40   83:astore          7
		int i = DeliveryMechanism.determineFrom(appData.installerPackageName).getId();
	//   41   85:aload_0         
	//   42   86:getfield        #177 <Field AppData appData>
	//   43   89:getfield        #831 <Field String AppData.installerPackageName>
	//   44   92:invokestatic    #837 <Method DeliveryMechanism DeliveryMechanism.determineFrom(String)>
	//   45   95:invokevirtual   #840 <Method int DeliveryMechanism.getId()>
	//   46   98:istore_2        
		SessionProtobufHelper.writeSessionApp(((CodedOutputStream) (obj)), s, appData.apiKey, s1, s2, s3, i, unityVersion);
	//   47   99:aload_3         
	//   48  100:aload_1         
	//   49  101:aload_0         
	//   50  102:getfield        #177 <Field AppData appData>
	//   51  105:getfield        #633 <Field String AppData.apiKey>
	//   52  108:aload           5
	//   53  110:aload           6
	//   54  112:aload           7
	//   55  114:iload_2         
	//   56  115:aload_0         
	//   57  116:getfield        #185 <Field String unityVersion>
	//   58  119:invokestatic    #843 <Method void SessionProtobufHelper.writeSessionApp(CodedOutputStream, String, String, String, String, String, int, String)>
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session app file.");
	//   59  122:aload_3         
	//   60  123:ldc2            #845 <String "Failed to flush to session app file.">
	//   61  126:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session app file.");
	//   62  129:aload           4
	//   63  131:ldc2            #847 <String "Failed to close session app file.">
	//   64  134:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   65  137:return          
		s;
	//   66  138:astore_1        
		break MISSING_BLOCK_LABEL_155;
	//   67  139:goto            155
		s;
	//   68  142:astore_1        
		obj = null;
	//   69  143:aconst_null     
	//   70  144:astore_3        
		break MISSING_BLOCK_LABEL_155;
	//   71  145:goto            155
		s;
	//   72  148:astore_1        
		obj1 = null;
	//   73  149:aconst_null     
	//   74  150:astore          4
		obj = obj1;
	//   75  152:aload           4
	//   76  154:astore_3        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session app file.");
	//   77  155:aload_3         
	//   78  156:ldc2            #845 <String "Failed to flush to session app file.">
	//   79  159:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session app file.");
	//   80  162:aload           4
	//   81  164:ldc2            #847 <String "Failed to close session app file.">
	//   82  167:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw s;
	//   83  170:aload_1         
	//   84  171:athrow          
	}

	private void writeSessionDevice(String s)
		throws Exception
	{
		Object obj;
		Context context;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          12
		context = null;
	//    2    3:aconst_null     
	//    3    4:astore          14
		Object obj1;
		obj1 = ((Object) (getFilesDir()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #448 <Method File getFilesDir()>
	//    6   10:astore          13
		StringBuilder stringbuilder = new StringBuilder();
	//    7   12:new             #304 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #305 <Method void StringBuilder()>
	//   10   19:astore          15
		stringbuilder.append(s);
	//   11   21:aload           15
	//   12   23:aload_1         
	//   13   24:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append("SessionDevice");
	//   15   28:aload           15
	//   16   30:ldc1            #151 <String "SessionDevice">
	//   17   32:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		obj1 = ((Object) (new ClsFileOutputStream(((File) (obj1)), stringbuilder.toString())));
	//   19   36:new             #322 <Class ClsFileOutputStream>
	//   20   39:dup             
	//   21   40:aload           13
	//   22   42:aload           15
	//   23   44:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   24   47:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   25   50:astore          13
		s = ((String) (context));
	//   26   52:aload           14
	//   27   54:astore_1        
		obj = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   28   55:aload           13
	//   29   57:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   30   60:astore          12
		s = ((String) (obj));
	//   31   62:aload           12
	//   32   64:astore_1        
		context = crashlyticsCore.getContext();
	//   33   65:aload_0         
	//   34   66:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//   35   69:invokevirtual   #191 <Method Context CrashlyticsCore.getContext()>
	//   36   72:astore          14
		s = ((String) (obj));
	//   37   74:aload           12
	//   38   76:astore_1        
		Object obj2 = ((Object) (new StatFs(Environment.getDataDirectory().getPath())));
	//   39   77:new             #849 <Class StatFs>
	//   40   80:dup             
	//   41   81:invokestatic    #854 <Method File Environment.getDataDirectory()>
	//   42   84:invokevirtual   #857 <Method String File.getPath()>
	//   43   87:invokespecial   #858 <Method void StatFs(String)>
	//   44   90:astore          16
		s = ((String) (obj));
	//   45   92:aload           12
	//   46   94:astore_1        
		String s1 = idManager.getDeviceUUID();
	//   47   95:aload_0         
	//   48   96:getfield        #171 <Field IdManager idManager>
	//   49   99:invokevirtual   #861 <Method String IdManager.getDeviceUUID()>
	//   50  102:astore          15
		s = ((String) (obj));
	//   51  104:aload           12
	//   52  106:astore_1        
		int i = CommonUtils.getCpuArchitectureInt();
	//   53  107:invokestatic    #864 <Method int CommonUtils.getCpuArchitectureInt()>
	//   54  110:istore_2        
		s = ((String) (obj));
	//   55  111:aload           12
	//   56  113:astore_1        
		int j = Runtime.getRuntime().availableProcessors();
	//   57  114:invokestatic    #868 <Method Runtime Runtime.getRuntime()>
	//   58  117:invokevirtual   #871 <Method int Runtime.availableProcessors()>
	//   59  120:istore_3        
		s = ((String) (obj));
	//   60  121:aload           12
	//   61  123:astore_1        
		long l = CommonUtils.getTotalRamInBytes();
	//   62  124:invokestatic    #874 <Method long CommonUtils.getTotalRamInBytes()>
	//   63  127:lstore          5
		s = ((String) (obj));
	//   64  129:aload           12
	//   65  131:astore_1        
		long l1 = ((StatFs) (obj2)).getBlockCount();
	//   66  132:aload           16
	//   67  134:invokevirtual   #877 <Method int StatFs.getBlockCount()>
	//   68  137:i2l             
	//   69  138:lstore          7
		s = ((String) (obj));
	//   70  140:aload           12
	//   71  142:astore_1        
		long l2 = ((StatFs) (obj2)).getBlockSize();
	//   72  143:aload           16
	//   73  145:invokevirtual   #880 <Method int StatFs.getBlockSize()>
	//   74  148:i2l             
	//   75  149:lstore          9
		s = ((String) (obj));
	//   76  151:aload           12
	//   77  153:astore_1        
		boolean flag = CommonUtils.isEmulator(context);
	//   78  154:aload           14
	//   79  156:invokestatic    #884 <Method boolean CommonUtils.isEmulator(Context)>
	//   80  159:istore          11
		s = ((String) (obj));
	//   81  161:aload           12
	//   82  163:astore_1        
		obj2 = ((Object) (idManager.getDeviceIdentifiers()));
	//   83  164:aload_0         
	//   84  165:getfield        #171 <Field IdManager idManager>
	//   85  168:invokevirtual   #888 <Method Map IdManager.getDeviceIdentifiers()>
	//   86  171:astore          16
		s = ((String) (obj));
	//   87  173:aload           12
	//   88  175:astore_1        
		int k = CommonUtils.getDeviceState(context);
	//   89  176:aload           14
	//   90  178:invokestatic    #892 <Method int CommonUtils.getDeviceState(Context)>
	//   91  181:istore          4
		s = ((String) (obj));
	//   92  183:aload           12
	//   93  185:astore_1        
		SessionProtobufHelper.writeSessionDevice(((CodedOutputStream) (obj)), s1, i, Build.MODEL, j, l, l1 * l2, flag, ((Map) (obj2)), k, Build.MANUFACTURER, Build.PRODUCT);
	//   94  186:aload           12
	//   95  188:aload           15
	//   96  190:iload_2         
	//   97  191:getstatic       #897 <Field String Build.MODEL>
	//   98  194:iload_3         
	//   99  195:lload           5
	//  100  197:lload           7
	//  101  199:lload           9
	//  102  201:lmul            
	//  103  202:iload           11
	//  104  204:aload           16
	//  105  206:iload           4
	//  106  208:getstatic       #900 <Field String Build.MANUFACTURER>
	//  107  211:getstatic       #903 <Field String Build.PRODUCT>
	//  108  214:invokestatic    #906 <Method void SessionProtobufHelper.writeSessionDevice(CodedOutputStream, String, int, String, int, long, long, boolean, Map, int, String, String)>
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush session device info.");
	//  109  217:aload           12
	//  110  219:ldc2            #908 <String "Failed to flush session device info.">
	//  111  222:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session device file.");
	//  112  225:aload           13
	//  113  227:ldc2            #910 <String "Failed to close session device file.">
	//  114  230:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  115  233:return          
		obj;
	//  116  234:astore          12
		break MISSING_BLOCK_LABEL_251;
	//  117  236:goto            251
		Exception exception;
		exception;
	//  118  239:astore          14
		obj1 = null;
	//  119  241:aconst_null     
	//  120  242:astore          13
		s = ((String) (obj));
	//  121  244:aload           12
	//  122  246:astore_1        
		obj = ((Object) (exception));
	//  123  247:aload           14
	//  124  249:astore          12
		CommonUtils.flushOrLog(((java.io.Flushable) (s)), "Failed to flush session device info.");
	//  125  251:aload_1         
	//  126  252:ldc2            #908 <String "Failed to flush session device info.">
	//  127  255:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session device file.");
	//  128  258:aload           13
	//  129  260:ldc2            #910 <String "Failed to close session device file.">
	//  130  263:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//  131  266:aload           12
	//  132  268:athrow          
	}

	private void writeSessionEvent(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
		throws Exception
	{
		TrimmedThrowableData trimmedthrowabledata = new TrimmedThrowableData(throwable, stackTraceTrimmingStrategy);
	//    0    0:new             #912 <Class TrimmedThrowableData>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_0         
	//    4    7:getfield        #230 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//    5   10:invokespecial   #915 <Method void TrimmedThrowableData(Throwable, StackTraceTrimmingStrategy)>
	//    6   13:astore          19
		Context context = crashlyticsCore.getContext();
	//    7   15:aload_0         
	//    8   16:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//    9   19:invokevirtual   #191 <Method Context CrashlyticsCore.getContext()>
	//   10   22:astore          26
		long l = date.getTime() / 1000L;
	//   11   24:aload_2         
	//   12   25:invokevirtual   #692 <Method long Date.getTime()>
	//   13   28:ldc2w           #693 <Long 1000L>
	//   14   31:ldiv            
	//   15   32:lstore          11
		Float float1 = CommonUtils.getBatteryLevel(context);
	//   16   34:aload           26
	//   17   36:invokestatic    #919 <Method Float CommonUtils.getBatteryLevel(Context)>
	//   18   39:astore          20
		int j = CommonUtils.getBatteryVelocity(context, devicePowerStateListener.isPowerConnected());
	//   19   41:aload           26
	//   20   43:aload_0         
	//   21   44:getfield        #218 <Field DevicePowerStateListener devicePowerStateListener>
	//   22   47:invokevirtual   #922 <Method boolean DevicePowerStateListener.isPowerConnected()>
	//   23   50:invokestatic    #926 <Method int CommonUtils.getBatteryVelocity(Context, boolean)>
	//   24   53:istore          8
		boolean flag1 = CommonUtils.getProximitySensorEnabled(context);
	//   25   55:aload           26
	//   26   57:invokestatic    #929 <Method boolean CommonUtils.getProximitySensorEnabled(Context)>
	//   27   60:istore          10
		int k = context.getResources().getConfiguration().orientation;
	//   28   62:aload           26
	//   29   64:invokevirtual   #935 <Method Resources Context.getResources()>
	//   30   67:invokevirtual   #941 <Method Configuration Resources.getConfiguration()>
	//   31   70:getfield        #947 <Field int Configuration.orientation>
	//   32   73:istore          9
		long l1 = CommonUtils.getTotalRamInBytes();
	//   33   75:invokestatic    #874 <Method long CommonUtils.getTotalRamInBytes()>
	//   34   78:lstore          13
		long l2 = CommonUtils.calculateFreeRamInBytes(context);
	//   35   80:aload           26
	//   36   82:invokestatic    #951 <Method long CommonUtils.calculateFreeRamInBytes(Context)>
	//   37   85:lstore          15
		long l3 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
	//   38   87:invokestatic    #854 <Method File Environment.getDataDirectory()>
	//   39   90:invokevirtual   #857 <Method String File.getPath()>
	//   40   93:invokestatic    #955 <Method long CommonUtils.calculateUsedDiskSpaceInBytes(String)>
	//   41   96:lstore          17
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = CommonUtils.getAppProcessInfo(context.getPackageName(), context);
	//   42   98:aload           26
	//   43  100:invokevirtual   #958 <Method String Context.getPackageName()>
	//   44  103:aload           26
	//   45  105:invokestatic    #962 <Method android.app.ActivityManager$RunningAppProcessInfo CommonUtils.getAppProcessInfo(String, Context)>
	//   46  108:astore          21
		LinkedList linkedlist = new LinkedList();
	//   47  110:new             #964 <Class LinkedList>
	//   48  113:dup             
	//   49  114:invokespecial   #965 <Method void LinkedList()>
	//   50  117:astore          22
		StackTraceElement astacktraceelement[] = trimmedthrowabledata.stacktrace;
	//   51  119:aload           19
	//   52  121:getfield        #969 <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   53  124:astore          23
		String s1 = appData.buildId;
	//   54  126:aload_0         
	//   55  127:getfield        #177 <Field AppData appData>
	//   56  130:getfield        #972 <Field String AppData.buildId>
	//   57  133:astore          24
		String s2 = idManager.getAppIdentifier();
	//   58  135:aload_0         
	//   59  136:getfield        #171 <Field IdManager idManager>
	//   60  139:invokevirtual   #819 <Method String IdManager.getAppIdentifier()>
	//   61  142:astore          25
		int i = 0;
	//   62  144:iconst_0        
	//   63  145:istore          7
		if(flag)
	//*  64  147:iload           6
	//*  65  149:ifeq            253
		{
			date = ((Date) (Thread.getAllStackTraces()));
	//   66  152:invokestatic    #977 <Method Map Thread.getAllStackTraces()>
	//   67  155:astore_2        
			throwable = ((Throwable) (new Thread[((Map) (date)).size()]));
	//   68  156:aload_2         
	//   69  157:invokeinterface #980 <Method int Map.size()>
	//   70  162:anewarray       Thread[]
	//   71  165:astore          4
			for(date = ((Date) (((Map) (date)).entrySet().iterator())); ((Iterator) (date)).hasNext();)
	//*  72  167:aload_2         
	//*  73  168:invokeinterface #984 <Method Set Map.entrySet()>
	//*  74  173:invokeinterface #988 <Method Iterator Set.iterator()>
	//*  75  178:astore_2        
	//*  76  179:aload_2         
	//*  77  180:invokeinterface #993 <Method boolean Iterator.hasNext()>
	//*  78  185:ifeq            250
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (date)).next();
	//   79  188:aload_2         
	//   80  189:invokeinterface #997 <Method Object Iterator.next()>
	//   81  194:checkcast       #999 <Class java.util.Map$Entry>
	//   82  197:astore          27
				throwable[i] = ((/*<invalid signature>*/java.lang.Object) ((Thread)entry.getKey()));
	//   83  199:aload           4
	//   84  201:iload           7
	//   85  203:aload           27
	//   86  205:invokeinterface #1002 <Method Object java.util.Map$Entry.getKey()>
	//   87  210:checkcast       #974 <Class Thread>
	//   88  213:aastore         
				((List) (linkedlist)).add(((Object) (stackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[])entry.getValue()))));
	//   89  214:aload           22
	//   90  216:aload_0         
	//   91  217:getfield        #230 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//   92  220:aload           27
	//   93  222:invokeinterface #1005 <Method Object java.util.Map$Entry.getValue()>
	//   94  227:checkcast       #1006 <Class StackTraceElement[]>
	//   95  230:invokeinterface #1010 <Method StackTraceElement[] StackTraceTrimmingStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   96  235:invokeinterface #1013 <Method boolean List.add(Object)>
	//   97  240:pop             
				i++;
	//   98  241:iload           7
	//   99  243:iconst_1        
	//  100  244:iadd            
	//  101  245:istore          7
			}

		} else
	//* 102  247:goto            179
	//* 103  250:goto            259
		{
			throwable = ((Throwable) (new Thread[0]));
	//  104  253:iconst_0        
	//  105  254:anewarray       Thread[]
	//  106  257:astore          4
		}
		if(!CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectCustomKeys", true))
	//* 107  259:aload           26
	//* 108  261:ldc2            #1015 <String "com.crashlytics.CollectCustomKeys">
	//* 109  264:iconst_1        
	//* 110  265:invokestatic    #1019 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//* 111  268:ifne            282
		{
			date = ((Date) (new TreeMap()));
	//  112  271:new             #1021 <Class TreeMap>
	//  113  274:dup             
	//  114  275:invokespecial   #1022 <Method void TreeMap()>
	//  115  278:astore_2        
		} else
	//* 116  279:goto            316
		{
			date = ((Date) (crashlyticsCore.getAttributes()));
	//  117  282:aload_0         
	//  118  283:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//  119  286:invokevirtual   #1025 <Method Map CrashlyticsCore.getAttributes()>
	//  120  289:astore_2        
			if(date != null && ((Map) (date)).size() > 1)
	//* 121  290:aload_2         
	//* 122  291:ifnull          316
	//* 123  294:aload_2         
	//* 124  295:invokeinterface #980 <Method int Map.size()>
	//* 125  300:iconst_1        
	//* 126  301:icmple          316
				date = ((Date) (new TreeMap(((Map) (date)))));
	//  127  304:new             #1021 <Class TreeMap>
	//  128  307:dup             
	//  129  308:aload_2         
	//  130  309:invokespecial   #1028 <Method void TreeMap(Map)>
	//  131  312:astore_2        
		}
	//* 132  313:goto            316
		SessionProtobufHelper.writeSessionEvent(codedoutputstream, l, s, trimmedthrowabledata, thread, astacktraceelement, ((Thread []) (throwable)), ((List) (linkedlist)), ((Map) (date)), logFileManager, runningappprocessinfo, k, s2, s1, float1, j, flag1, l1 - l2, l3);
	//  133  316:aload_1         
	//  134  317:lload           11
	//  135  319:aload           5
	//  136  321:aload           19
	//  137  323:aload_3         
	//  138  324:aload           23
	//  139  326:aload           4
	//  140  328:aload           22
	//  141  330:aload_2         
	//  142  331:aload_0         
	//  143  332:getfield        #203 <Field LogFileManager logFileManager>
	//  144  335:aload           21
	//  145  337:iload           9
	//  146  339:aload           25
	//  147  341:aload           24
	//  148  343:aload           20
	//  149  345:iload           8
	//  150  347:iload           10
	//  151  349:lload           13
	//  152  351:lload           15
	//  153  353:lsub            
	//  154  354:lload           17
	//  155  356:invokestatic    #1031 <Method void SessionProtobufHelper.writeSessionEvent(CodedOutputStream, long, String, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, Map, LogFileManager, android.app.ActivityManager$RunningAppProcessInfo, int, String, String, Float, int, boolean, long, long)>
	//  156  359:return          
	}

	private void writeSessionOS(String s)
		throws Exception
	{
		CodedOutputStream codedoutputstream;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		codedoutputstream = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		Object obj;
		obj = ((Object) (getFilesDir()));
	//    4    5:aload_0         
	//    5    6:invokevirtual   #448 <Method File getFilesDir()>
	//    6    9:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   10:new             #304 <Class StringBuilder>
	//    8   13:dup             
	//    9   14:invokespecial   #305 <Method void StringBuilder()>
	//   10   17:astore          5
		stringbuilder.append(s);
	//   11   19:aload           5
	//   12   21:aload_1         
	//   13   22:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append("SessionOS");
	//   15   26:aload           5
	//   16   28:ldc1            #149 <String "SessionOS">
	//   17   30:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		obj = ((Object) (new ClsFileOutputStream(((File) (obj)), stringbuilder.toString())));
	//   19   34:new             #322 <Class ClsFileOutputStream>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:aload           5
	//   23   41:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   24   44:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   25   47:astore_2        
		s = ((String) (codedoutputstream));
	//   26   48:aload_3         
	//   27   49:astore_1        
		codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   28   50:aload_2         
	//   29   51:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   30   54:astore_3        
		s = ((String) (codedoutputstream));
	//   31   55:aload_3         
	//   32   56:astore_1        
		SessionProtobufHelper.writeSessionOS(codedoutputstream, CommonUtils.isRooted(crashlyticsCore.getContext()));
	//   33   57:aload_3         
	//   34   58:aload_0         
	//   35   59:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//   36   62:invokevirtual   #191 <Method Context CrashlyticsCore.getContext()>
	//   37   65:invokestatic    #1034 <Method boolean CommonUtils.isRooted(Context)>
	//   38   68:invokestatic    #1037 <Method void SessionProtobufHelper.writeSessionOS(CodedOutputStream, boolean)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to session OS file.");
	//   39   71:aload_3         
	//   40   72:ldc2            #1039 <String "Failed to flush to session OS file.">
	//   41   75:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session OS file.");
	//   42   78:aload_2         
	//   43   79:ldc2            #1041 <String "Failed to close session OS file.">
	//   44   82:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   45   85:return          
		Exception exception;
		exception;
	//   46   86:astore_3        
		break MISSING_BLOCK_LABEL_96;
	//   47   87:goto            96
		exception;
	//   48   90:astore_3        
		obj = null;
	//   49   91:aconst_null     
	//   50   92:astore_2        
		s = ((String) (obj1));
	//   51   93:aload           4
	//   52   95:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (s)), "Failed to flush to session OS file.");
	//   53   96:aload_1         
	//   54   97:ldc2            #1039 <String "Failed to flush to session OS file.">
	//   55  100:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session OS file.");
	//   56  103:aload_2         
	//   57  104:ldc2            #1041 <String "Failed to close session OS file.">
	//   58  107:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw exception;
	//   59  110:aload_3         
	//   60  111:athrow          
	}

	private void writeSessionPartsToSessionFile(File file, String s, int i)
	{
		Object obj = ((Object) (Fabric.getLogger()));
	//    0    0:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    1    3:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #304 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #305 <Method void StringBuilder()>
	//    5   12:astore          7
		stringbuilder.append("Collecting session parts for ID ");
	//    6   14:aload           7
	//    7   16:ldc2            #1043 <String "Collecting session parts for ID ">
	//    8   19:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:pop             
		stringbuilder.append(s);
	//   10   23:aload           7
	//   11   25:aload_2         
	//   12   26:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   14   30:aload           6
	//   15   32:ldc2            #290 <String "CrashlyticsCore">
	//   16   35:aload           7
	//   17   37:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   18   40:invokeinterface #298 <Method void Logger.d(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   19   45:new             #304 <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #305 <Method void StringBuilder()>
	//   22   52:astore          6
		((StringBuilder) (obj)).append(s);
	//   23   54:aload           6
	//   24   56:aload_2         
	//   25   57:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
		((StringBuilder) (obj)).append("SessionCrash");
	//   27   61:aload           6
	//   28   63:ldc2            #477 <String "SessionCrash">
	//   29   66:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   30   69:pop             
		obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   31   70:aload_0         
	//   32   71:new             #31  <Class CrashlyticsController$FileNameContainsFilter>
	//   33   74:dup             
	//   34   75:aload           6
	//   35   77:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   36   80:invokespecial   #523 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   37   83:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//   38   86:astore          6
		boolean flag;
		if(obj != null && obj.length > 0)
	//*  39   88:aload           6
	//*  40   90:ifnull          105
	//*  41   93:aload           6
	//*  42   95:arraylength     
	//*  43   96:ifle            105
			flag = true;
	//   44   99:iconst_1        
	//   45  100:istore          4
		else
	//*  46  102:goto            108
			flag = false;
	//   47  105:iconst_0        
	//   48  106:istore          4
		Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
			s, Boolean.valueOf(flag)
		}));
	//   49  108:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   50  111:ldc2            #290 <String "CrashlyticsCore">
	//   51  114:getstatic       #417 <Field Locale Locale.US>
	//   52  117:ldc2            #1045 <String "Session %s has fatal exception: %s">
	//   53  120:iconst_2        
	//   54  121:anewarray       Object[]
	//   55  124:dup             
	//   56  125:iconst_0        
	//   57  126:aload_2         
	//   58  127:aastore         
	//   59  128:dup             
	//   60  129:iconst_1        
	//   61  130:iload           4
	//   62  132:invokestatic    #1050 <Method Boolean Boolean.valueOf(boolean)>
	//   63  135:aastore         
	//   64  136:invokestatic    #437 <Method String String.format(Locale, String, Object[])>
	//   65  139:invokeinterface #298 <Method void Logger.d(String, String)>
		stringbuilder = new StringBuilder();
	//   66  144:new             #304 <Class StringBuilder>
	//   67  147:dup             
	//   68  148:invokespecial   #305 <Method void StringBuilder()>
	//   69  151:astore          7
		stringbuilder.append(s);
	//   70  153:aload           7
	//   71  155:aload_2         
	//   72  156:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   73  159:pop             
		stringbuilder.append("SessionEvent");
	//   74  160:aload           7
	//   75  162:ldc2            #522 <String "SessionEvent">
	//   76  165:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   77  168:pop             
		File afile[] = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))));
	//   78  169:aload_0         
	//   79  170:new             #31  <Class CrashlyticsController$FileNameContainsFilter>
	//   80  173:dup             
	//   81  174:aload           7
	//   82  176:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   83  179:invokespecial   #523 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   84  182:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//   85  185:astore          7
		boolean flag1;
		if(afile != null && afile.length > 0)
	//*  86  187:aload           7
	//*  87  189:ifnull          204
	//*  88  192:aload           7
	//*  89  194:arraylength     
	//*  90  195:ifle            204
			flag1 = true;
	//   91  198:iconst_1        
	//   92  199:istore          5
		else
	//*  93  201:goto            207
			flag1 = false;
	//   94  204:iconst_0        
	//   95  205:istore          5
		Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
			s, Boolean.valueOf(flag1)
		}));
	//   96  207:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   97  210:ldc2            #290 <String "CrashlyticsCore">
	//   98  213:getstatic       #417 <Field Locale Locale.US>
	//   99  216:ldc2            #1052 <String "Session %s has non-fatal exceptions: %s">
	//  100  219:iconst_2        
	//  101  220:anewarray       Object[]
	//  102  223:dup             
	//  103  224:iconst_0        
	//  104  225:aload_2         
	//  105  226:aastore         
	//  106  227:dup             
	//  107  228:iconst_1        
	//  108  229:iload           5
	//  109  231:invokestatic    #1050 <Method Boolean Boolean.valueOf(boolean)>
	//  110  234:aastore         
	//  111  235:invokestatic    #437 <Method String String.format(Locale, String, Object[])>
	//  112  238:invokeinterface #298 <Method void Logger.d(String, String)>
		if(!flag && !flag1)
	//* 113  243:iload           4
	//* 114  245:ifne            302
	//* 115  248:iload           5
	//* 116  250:ifeq            256
	//* 117  253:goto            302
		{
			file = ((File) (Fabric.getLogger()));
	//  118  256:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//  119  259:astore_1        
			obj = ((Object) (new StringBuilder()));
	//  120  260:new             #304 <Class StringBuilder>
	//  121  263:dup             
	//  122  264:invokespecial   #305 <Method void StringBuilder()>
	//  123  267:astore          6
			((StringBuilder) (obj)).append("No events present for session ID ");
	//  124  269:aload           6
	//  125  271:ldc2            #1054 <String "No events present for session ID ">
	//  126  274:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  127  277:pop             
			((StringBuilder) (obj)).append(s);
	//  128  278:aload           6
	//  129  280:aload_2         
	//  130  281:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  131  284:pop             
			((Logger) (file)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  132  285:aload_1         
	//  133  286:ldc2            #290 <String "CrashlyticsCore">
	//  134  289:aload           6
	//  135  291:invokevirtual   #314 <Method String StringBuilder.toString()>
	//  136  294:invokeinterface #298 <Method void Logger.d(String, String)>
		} else
	//* 137  299:goto            339
		{
			afile = getTrimmedNonFatalFiles(s, afile, i);
	//  138  302:aload_0         
	//  139  303:aload_2         
	//  140  304:aload           7
	//  141  306:iload_3         
	//  142  307:invokespecial   #1056 <Method File[] getTrimmedNonFatalFiles(String, File[], int)>
	//  143  310:astore          7
			if(flag)
	//* 144  312:iload           4
	//* 145  314:ifeq            326
				obj = ((Object) (obj[0]));
	//  146  317:aload           6
	//  147  319:iconst_0        
	//  148  320:aaload          
	//  149  321:astore          6
			else
	//* 150  323:goto            329
				obj = null;
	//  151  326:aconst_null     
	//  152  327:astore          6
			synthesizeSessionFile(file, s, afile, ((File) (obj)));
	//  153  329:aload_0         
	//  154  330:aload_1         
	//  155  331:aload_2         
	//  156  332:aload           7
	//  157  334:aload           6
	//  158  336:invokespecial   #1058 <Method void synthesizeSessionFile(File, String, File[], File)>
		}
		file = ((File) (Fabric.getLogger()));
	//  159  339:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//  160  342:astore_1        
		obj = ((Object) (new StringBuilder()));
	//  161  343:new             #304 <Class StringBuilder>
	//  162  346:dup             
	//  163  347:invokespecial   #305 <Method void StringBuilder()>
	//  164  350:astore          6
		((StringBuilder) (obj)).append("Removing session part files for ID ");
	//  165  352:aload           6
	//  166  354:ldc2            #1060 <String "Removing session part files for ID ">
	//  167  357:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  168  360:pop             
		((StringBuilder) (obj)).append(s);
	//  169  361:aload           6
	//  170  363:aload_2         
	//  171  364:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  172  367:pop             
		((Logger) (file)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  173  368:aload_1         
	//  174  369:ldc2            #290 <String "CrashlyticsCore">
	//  175  372:aload           6
	//  176  374:invokevirtual   #314 <Method String StringBuilder.toString()>
	//  177  377:invokeinterface #298 <Method void Logger.d(String, String)>
		deleteSessionPartFilesFor(s);
	//  178  382:aload_0         
	//  179  383:aload_2         
	//  180  384:invokespecial   #1062 <Method void deleteSessionPartFilesFor(String)>
	//  181  387:return          
	}

	private void writeSessionUser(String s)
		throws Exception
	{
		CodedOutputStream codedoutputstream;
		CodedOutputStream codedoutputstream1;
		codedoutputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		codedoutputstream1 = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		Object obj;
		obj = ((Object) (getFilesDir()));
	//    4    5:aload_0         
	//    5    6:invokevirtual   #448 <Method File getFilesDir()>
	//    6    9:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #304 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #305 <Method void StringBuilder()>
	//   10   18:astore          6
		stringbuilder.append(s);
	//   11   20:aload           6
	//   12   22:aload_1         
	//   13   23:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		stringbuilder.append("SessionUser");
	//   15   27:aload           6
	//   16   29:ldc1            #145 <String "SessionUser">
	//   17   31:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		obj = ((Object) (new ClsFileOutputStream(((File) (obj)), stringbuilder.toString())));
	//   19   35:new             #322 <Class ClsFileOutputStream>
	//   20   38:dup             
	//   21   39:aload           4
	//   22   41:aload           6
	//   23   43:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #451 <Method void ClsFileOutputStream(File, String)>
	//   25   49:astore          4
		codedoutputstream = codedoutputstream1;
	//   26   51:aload           5
	//   27   53:astore_3        
		codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   28   54:aload           4
	//   29   56:invokestatic    #455 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   30   59:astore          5
		codedoutputstream = codedoutputstream1;
	//   31   61:aload           5
	//   32   63:astore_3        
		s = ((String) (getUserMetaData(s)));
	//   33   64:aload_0         
	//   34   65:aload_1         
	//   35   66:invokespecial   #1065 <Method UserMetaData getUserMetaData(String)>
	//   36   69:astore_1        
		codedoutputstream = codedoutputstream1;
	//   37   70:aload           5
	//   38   72:astore_3        
		boolean flag = ((UserMetaData) (s)).isEmpty();
	//   39   73:aload_1         
	//   40   74:invokevirtual   #1068 <Method boolean UserMetaData.isEmpty()>
	//   41   77:istore_2        
		if(flag)
	//*  42   78:iload_2         
	//*  43   79:ifeq            99
		{
			CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream1)), "Failed to flush session user file.");
	//   44   82:aload           5
	//   45   84:ldc2            #1070 <String "Failed to flush session user file.">
	//   46   87:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
			CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session user file.");
	//   47   90:aload           4
	//   48   92:ldc2            #1072 <String "Failed to close session user file.">
	//   49   95:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
			return;
	//   50   98:return          
		}
		codedoutputstream = codedoutputstream1;
	//   51   99:aload           5
	//   52  101:astore_3        
		SessionProtobufHelper.writeSessionUser(codedoutputstream1, ((UserMetaData) (s)).id, ((UserMetaData) (s)).name, ((UserMetaData) (s)).email);
	//   53  102:aload           5
	//   54  104:aload_1         
	//   55  105:getfield        #1075 <Field String UserMetaData.id>
	//   56  108:aload_1         
	//   57  109:getfield        #1076 <Field String UserMetaData.name>
	//   58  112:aload_1         
	//   59  113:getfield        #1079 <Field String UserMetaData.email>
	//   60  116:invokestatic    #1082 <Method void SessionProtobufHelper.writeSessionUser(CodedOutputStream, String, String, String)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream1)), "Failed to flush session user file.");
	//   61  119:aload           5
	//   62  121:ldc2            #1070 <String "Failed to flush session user file.">
	//   63  124:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session user file.");
	//   64  127:aload           4
	//   65  129:ldc2            #1072 <String "Failed to close session user file.">
	//   66  132:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   67  135:return          
		Exception exception1;
		exception1;
	//   68  136:astore          5
		Exception exception;
		s = ((String) (obj));
	//   69  138:aload           4
	//   70  140:astore_1        
		exception = exception1;
	//   71  141:aload           5
	//   72  143:astore          4
		break MISSING_BLOCK_LABEL_152;
	//   73  145:goto            152
		exception;
	//   74  148:astore          4
		s = null;
	//   75  150:aconst_null     
	//   76  151:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush session user file.");
	//   77  152:aload_3         
	//   78  153:ldc2            #1070 <String "Failed to flush session user file.">
	//   79  156:invokestatic    #405 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close session user file.");
	//   80  159:aload_1         
	//   81  160:ldc2            #1072 <String "Failed to close session user file.">
	//   82  163:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw exception;
	//   83  166:aload           4
	//   84  168:athrow          
	}

	private static void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
		throws IOException
	{
		if(!file.exists())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #679 <Method boolean File.exists()>
	//*   2    4:ifne            51
		{
			codedoutputstream = ((CodedOutputStream) (Fabric.getLogger()));
	//    3    7:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    4   10:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #304 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #305 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("Tried to include a file that doesn't exist: ");
	//    9   19:aload_2         
	//   10   20:ldc2            #1084 <String "Tried to include a file that doesn't exist: ">
	//   11   23:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append(file.getName());
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #502 <Method String File.getName()>
	//   16   32:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((Logger) (codedoutputstream)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   18   36:aload_0         
	//   19   37:ldc2            #290 <String "CrashlyticsCore">
	//   20   40:aload_2         
	//   21   41:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   22   44:aconst_null     
	//   23   45:invokeinterface #331 <Method void Logger.e(String, String, Throwable)>
			return;
	//   24   50:return          
		}
		FileInputStream fileinputstream = new FileInputStream(file);
	//   25   51:new             #1086 <Class FileInputStream>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:invokespecial   #1087 <Method void FileInputStream(File)>
	//   29   59:astore_2        
		copyToCodedOutputStream(((InputStream) (fileinputstream)), codedoutputstream, (int)file.length());
	//   30   60:aload_2         
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #1090 <Method long File.length()>
	//   34   66:l2i             
	//   35   67:invokestatic    #1092 <Method void copyToCodedOutputStream(InputStream, CodedOutputStream, int)>
		CommonUtils.closeOrLog(((java.io.Closeable) (fileinputstream)), "Failed to close file input stream.");
	//   36   70:aload_2         
	//   37   71:ldc2            #1094 <String "Failed to close file input stream.">
	//   38   74:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   39   77:return          
		file;
	//   40   78:astore_1        
		codedoutputstream = ((CodedOutputStream) (fileinputstream));
	//   41   79:aload_2         
	//   42   80:astore_0        
		break MISSING_BLOCK_LABEL_87;
	//   43   81:goto            87
		file;
	//   44   84:astore_1        
		codedoutputstream = null;
	//   45   85:aconst_null     
	//   46   86:astore_0        
		CommonUtils.closeOrLog(((java.io.Closeable) (codedoutputstream)), "Failed to close file input stream.");
	//   47   87:aload_0         
	//   48   88:ldc2            #1094 <String "Failed to close file input stream.">
	//   49   91:invokestatic    #411 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//   50   94:aload_1         
	//   51   95:athrow          
	}

	void cleanInvalidTempFiles()
	{
		backgroundWorker.submit(new Runnable() {

			public void run()
			{
				CrashlyticsController crashlyticscontroller = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsController this$0>
			//    2    4:astore_1        
				crashlyticscontroller.doCleanInvalidTempFiles(crashlyticscontroller.listFilesMatching(((FilenameFilter) (new InvalidPartFileFilter()))));
			//    3    5:aload_1         
			//    4    6:aload_1         
			//    5    7:new             #23  <Class CrashlyticsController$InvalidPartFileFilter>
			//    6   10:dup             
			//    7   11:invokespecial   #24  <Method void CrashlyticsController$InvalidPartFileFilter()>
			//    8   14:invokestatic    #28  <Method File[] CrashlyticsController.access$1300(CrashlyticsController, FilenameFilter)>
			//    9   17:invokevirtual   #32  <Method void CrashlyticsController.doCleanInvalidTempFiles(File[])>
			//   10   20:return          
			}

			final CrashlyticsController this$0;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashlyticsController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #12  <Class CrashlyticsController$13>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1097 <Method void CrashlyticsController$13(CrashlyticsController)>
	//    6   12:invokevirtual   #653 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void doCleanInvalidTempFiles(File afile[])
	{
		final HashSet invalidSessionIds = new HashSet();
	//    0    0:new             #736 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #737 <Method void HashSet()>
	//    3    7:astore          5
		int k = afile.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		for(int i = 0; i < k; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload           4
	//*  13   20:icmpge          94
		{
			File file = afile[i];
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:astore          6
			Logger logger = Fabric.getLogger();
	//   18   28:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   19   31:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   20   33:new             #304 <Class StringBuilder>
	//   21   36:dup             
	//   22   37:invokespecial   #305 <Method void StringBuilder()>
	//   23   40:astore          8
			stringbuilder.append("Found invalid session part file: ");
	//   24   42:aload           8
	//   25   44:ldc2            #1101 <String "Found invalid session part file: ">
	//   26   47:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			stringbuilder.append(((Object) (file)));
	//   28   51:aload           8
	//   29   53:aload           6
	//   30   55:invokevirtual   #1104 <Method StringBuilder StringBuilder.append(Object)>
	//   31   58:pop             
			logger.d("CrashlyticsCore", stringbuilder.toString());
	//   32   59:aload           7
	//   33   61:ldc2            #290 <String "CrashlyticsCore">
	//   34   64:aload           8
	//   35   66:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   36   69:invokeinterface #298 <Method void Logger.d(String, String)>
			((Set) (invalidSessionIds)).add(((Object) (getSessionIdFromSessionFile(file))));
	//   37   74:aload           5
	//   38   76:aload           6
	//   39   78:invokestatic    #302 <Method String getSessionIdFromSessionFile(File)>
	//   40   81:invokeinterface #744 <Method boolean Set.add(Object)>
	//   41   86:pop             
		}

	//   42   87:iload_2         
	//   43   88:iconst_1        
	//   44   89:iadd            
	//   45   90:istore_2        
	//*  46   91:goto            17
		if(((Set) (invalidSessionIds)).isEmpty())
	//*  47   94:aload           5
	//*  48   96:invokeinterface #1105 <Method boolean Set.isEmpty()>
	//*  49  101:ifeq            105
			return;
	//   50  104:return          
		afile = ((File []) (getInvalidFilesDir()));
	//   51  105:aload_0         
	//   52  106:invokevirtual   #729 <Method File getInvalidFilesDir()>
	//   53  109:astore_1        
		if(!((File) (afile)).exists())
	//*  54  110:aload_1         
	//*  55  111:invokevirtual   #679 <Method boolean File.exists()>
	//*  56  114:ifne            122
			((File) (afile)).mkdir();
	//   57  117:aload_1         
	//   58  118:invokevirtual   #1108 <Method boolean File.mkdir()>
	//   59  121:pop             
		File afile1[] = listFilesMatching(new FilenameFilter() {

			public boolean accept(File file2, String s)
			{
				if(s.length() < 35)
			//*   0    0:aload_2         
			//*   1    1:invokevirtual   #33  <Method int String.length()>
			//*   2    4:bipush          35
			//*   3    6:icmpge          11
					return false;
			//    4    9:iconst_0        
			//    5   10:ireturn         
				else
					return invalidSessionIds.contains(((Object) (s.substring(0, 35))));
			//    6   11:aload_0         
			//    7   12:getfield        #21  <Field Set val$invalidSessionIds>
			//    8   15:aload_2         
			//    9   16:iconst_0        
			//   10   17:bipush          35
			//   11   19:invokevirtual   #37  <Method String String.substring(int, int)>
			//   12   22:invokeinterface #43  <Method boolean Set.contains(Object)>
			//   13   27:ireturn         
			}

			final CrashlyticsController this$0;
			final Set val$invalidSessionIds;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashlyticsController this$0>
				invalidSessionIds = set;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Set val$invalidSessionIds>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   60  122:aload_0         
	//   61  123:new             #14  <Class CrashlyticsController$14>
	//   62  126:dup             
	//   63  127:aload_0         
	//   64  128:aload           5
	//   65  130:invokespecial   #1111 <Method void CrashlyticsController$14(CrashlyticsController, Set)>
	//   66  133:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//   67  136:astore          5
		k = afile1.length;
	//   68  138:aload           5
	//   69  140:arraylength     
	//   70  141:istore          4
		for(int j = ((int) (flag)); j < k; j++)
	//*  71  143:iload_3         
	//*  72  144:istore_2        
	//*  73  145:iload_2         
	//*  74  146:iload           4
	//*  75  148:icmpge          283
		{
			File file1 = afile1[j];
	//   76  151:aload           5
	//   77  153:iload_2         
	//   78  154:aaload          
	//   79  155:astore          6
			Logger logger1 = Fabric.getLogger();
	//   80  157:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//   81  160:astore          7
			StringBuilder stringbuilder1 = new StringBuilder();
	//   82  162:new             #304 <Class StringBuilder>
	//   83  165:dup             
	//   84  166:invokespecial   #305 <Method void StringBuilder()>
	//   85  169:astore          8
			stringbuilder1.append("Moving session file: ");
	//   86  171:aload           8
	//   87  173:ldc2            #1113 <String "Moving session file: ">
	//   88  176:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   89  179:pop             
			stringbuilder1.append(((Object) (file1)));
	//   90  180:aload           8
	//   91  182:aload           6
	//   92  184:invokevirtual   #1104 <Method StringBuilder StringBuilder.append(Object)>
	//   93  187:pop             
			logger1.d("CrashlyticsCore", stringbuilder1.toString());
	//   94  188:aload           7
	//   95  190:ldc2            #290 <String "CrashlyticsCore">
	//   96  193:aload           8
	//   97  195:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   98  198:invokeinterface #298 <Method void Logger.d(String, String)>
			if(!file1.renameTo(new File(((File) (afile)), file1.getName())))
	//*  99  203:aload           6
	//* 100  205:new             #353 <Class File>
	//* 101  208:dup             
	//* 102  209:aload_1         
	//* 103  210:aload           6
	//* 104  212:invokevirtual   #502 <Method String File.getName()>
	//* 105  215:invokespecial   #1114 <Method void File(File, String)>
	//* 106  218:invokevirtual   #1118 <Method boolean File.renameTo(File)>
	//* 107  221:ifne            276
			{
				Logger logger2 = Fabric.getLogger();
	//  108  224:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//  109  227:astore          7
				StringBuilder stringbuilder2 = new StringBuilder();
	//  110  229:new             #304 <Class StringBuilder>
	//  111  232:dup             
	//  112  233:invokespecial   #305 <Method void StringBuilder()>
	//  113  236:astore          8
				stringbuilder2.append("Could not move session file. Deleting ");
	//  114  238:aload           8
	//  115  240:ldc2            #1120 <String "Could not move session file. Deleting ">
	//  116  243:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//  117  246:pop             
				stringbuilder2.append(((Object) (file1)));
	//  118  247:aload           8
	//  119  249:aload           6
	//  120  251:invokevirtual   #1104 <Method StringBuilder StringBuilder.append(Object)>
	//  121  254:pop             
				logger2.d("CrashlyticsCore", stringbuilder2.toString());
	//  122  255:aload           7
	//  123  257:ldc2            #290 <String "CrashlyticsCore">
	//  124  260:aload           8
	//  125  262:invokevirtual   #314 <Method String StringBuilder.toString()>
	//  126  265:invokeinterface #298 <Method void Logger.d(String, String)>
				file1.delete();
	//  127  270:aload           6
	//  128  272:invokevirtual   #357 <Method boolean File.delete()>
	//  129  275:pop             
			}
		}

	//  130  276:iload_2         
	//  131  277:iconst_1        
	//  132  278:iadd            
	//  133  279:istore_2        
	//* 134  280:goto            145
		trimInvalidSessionFiles();
	//  135  283:aload_0         
	//  136  284:invokespecial   #1122 <Method void trimInvalidSessionFiles()>
	//  137  287:return          
	}

	void doCloseSessions(SessionSettingsData sessionsettingsdata)
		throws Exception
	{
		doCloseSessions(sessionsettingsdata, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #240 <Method void doCloseSessions(SessionSettingsData, boolean)>
	//    4    6:return          
	}

	void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
	{
		openSession();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1128 <Method void openSession()>
		crashHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {

			public void onUncaughtException(Thread thread, Throwable throwable)
			{
				handleUncaughtException(thread, throwable);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsController this$0>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokevirtual   #26  <Method void CrashlyticsController.handleUncaughtException(Thread, Throwable)>
			//    5    9:return          
			}

			final CrashlyticsController this$0;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashlyticsController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, uncaughtexceptionhandler);
	//    2    4:aload_0         
	//    3    5:new             #1130 <Class CrashlyticsUncaughtExceptionHandler>
	//    4    8:dup             
	//    5    9:new             #24  <Class CrashlyticsController$5>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #1131 <Method void CrashlyticsController$5(CrashlyticsController)>
	//    9   17:aload_1         
	//   10   18:invokespecial   #1134 <Method void CrashlyticsUncaughtExceptionHandler(CrashlyticsUncaughtExceptionHandler$CrashListener, Thread$UncaughtExceptionHandler)>
	//   11   21:putfield        #1136 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (crashHandler)));
	//   12   24:aload_0         
	//   13   25:getfield        #1136 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
	//   14   28:invokestatic    #1139 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//   15   31:return          
	}

	boolean finalizeSessions(final SessionSettingsData sessionSettingsData)
	{
		return ((Boolean)backgroundWorker.submitAndWait(new Callable() {

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
					doCloseSessions(sessionSettingsData, true);
			//   14   38:aload_0         
			//   15   39:getfield        #20  <Field CrashlyticsController this$0>
			//   16   42:aload_0         
			//   17   43:getfield        #22  <Field SessionSettingsData val$sessionSettingsData>
			//   18   46:iconst_1        
			//   19   47:invokestatic    #62  <Method void CrashlyticsController.access$1100(CrashlyticsController, SessionSettingsData, boolean)>
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

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsController this$0>
				sessionSettingsData = sessionsettingsdata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field SessionSettingsData val$sessionSettingsData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
)).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #10  <Class CrashlyticsController$12>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1144 <Method void CrashlyticsController$12(CrashlyticsController, SessionSettingsData)>
	//    7   13:invokevirtual   #1148 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    8   16:checkcast       #1047 <Class Boolean>
	//    9   19:invokevirtual   #1151 <Method boolean Boolean.booleanValue()>
	//   10   22:ireturn         
	}

	File getFatalSessionFilesDir()
	{
		return new File(getFilesDir(), "fatal-sessions");
	//    0    0:new             #353 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #448 <Method File getFilesDir()>
	//    4    8:ldc2            #1153 <String "fatal-sessions">
	//    5   11:invokespecial   #1114 <Method void File(File, String)>
	//    6   14:areturn         
	}

	File getFilesDir()
	{
		return fileStore.getFilesDir();
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field FileStore fileStore>
	//    2    4:invokeinterface #1156 <Method File FileStore.getFilesDir()>
	//    3    9:areturn         
	}

	File getInvalidFilesDir()
	{
		return new File(getFilesDir(), "invalidClsFiles");
	//    0    0:new             #353 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #448 <Method File getFilesDir()>
	//    4    8:ldc2            #1158 <String "invalidClsFiles">
	//    5   11:invokespecial   #1114 <Method void File(File, String)>
	//    6   14:areturn         
	}

	File getNonFatalSessionFilesDir()
	{
		return new File(getFilesDir(), "nonfatal-sessions");
	//    0    0:new             #353 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #448 <Method File getFilesDir()>
	//    4    8:ldc2            #1160 <String "nonfatal-sessions">
	//    5   11:invokespecial   #1114 <Method void File(File, String)>
	//    6   14:areturn         
	}

	void handleUncaughtException(final Thread thread, final Throwable ex)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		final Date time = ((Date) (Fabric.getLogger()));
	//    2    2:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    3    5:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #304 <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #305 <Method void StringBuilder()>
	//    7   13:astore          4
		stringbuilder.append("Crashlytics is handling uncaught exception \"");
	//    8   15:aload           4
	//    9   17:ldc2            #1164 <String "Crashlytics is handling uncaught exception \"">
	//   10   20:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(((Object) (ex)));
	//   12   24:aload           4
	//   13   26:aload_2         
	//   14   27:invokevirtual   #1104 <Method StringBuilder StringBuilder.append(Object)>
	//   15   30:pop             
		stringbuilder.append("\" from thread ");
	//   16   31:aload           4
	//   17   33:ldc2            #1166 <String "\" from thread ">
	//   18   36:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(thread.getName());
	//   20   40:aload           4
	//   21   42:aload_1         
	//   22   43:invokevirtual   #1167 <Method String Thread.getName()>
	//   23   46:invokevirtual   #311 <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		((Logger) (time)).d("CrashlyticsCore", stringbuilder.toString());
	//   25   50:aload_3         
	//   26   51:ldc2            #290 <String "CrashlyticsCore">
	//   27   54:aload           4
	//   28   56:invokevirtual   #314 <Method String StringBuilder.toString()>
	//   29   59:invokeinterface #298 <Method void Logger.d(String, String)>
		devicePowerStateListener.dispose();
	//   30   64:aload_0         
	//   31   65:getfield        #218 <Field DevicePowerStateListener devicePowerStateListener>
	//   32   68:invokevirtual   #1170 <Method void DevicePowerStateListener.dispose()>
		time = new Date();
	//   33   71:new             #367 <Class Date>
	//   34   74:dup             
	//   35   75:invokespecial   #368 <Method void Date()>
	//   36   78:astore_3        
		backgroundWorker.submitAndWait(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #41  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				crashlyticsCore.createCrashMarker();
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #46  <Method CrashlyticsCore CrashlyticsController.access$300(CrashlyticsController)>
			//    3    7:invokevirtual   #51  <Method void CrashlyticsCore.createCrashMarker()>
				writeFatal(time, thread, ex);
			//    4   10:aload_0         
			//    5   11:getfield        #24  <Field CrashlyticsController this$0>
			//    6   14:aload_0         
			//    7   15:getfield        #26  <Field Date val$time>
			//    8   18:aload_0         
			//    9   19:getfield        #28  <Field Thread val$thread>
			//   10   22:aload_0         
			//   11   23:getfield        #30  <Field Throwable val$ex>
			//   12   26:invokestatic    #54  <Method void CrashlyticsController.access$400(CrashlyticsController, Date, Thread, Throwable)>
				SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
			//   13   29:invokestatic    #60  <Method Settings Settings.getInstance()>
			//   14   32:invokevirtual   #64  <Method SettingsData Settings.awaitSettingsData()>
			//   15   35:astore_2        
				SessionSettingsData sessionsettingsdata;
				if(settingsdata != null)
			//*  16   36:aload_2         
			//*  17   37:ifnull          48
					sessionsettingsdata = settingsdata.sessionData;
			//   18   40:aload_2         
			//   19   41:getfield        #70  <Field SessionSettingsData SettingsData.sessionData>
			//   20   44:astore_1        
				else
			//*  21   45:goto            50
					sessionsettingsdata = null;
			//   22   48:aconst_null     
			//   23   49:astore_1        
				doCloseSessions(sessionsettingsdata);
			//   24   50:aload_0         
			//   25   51:getfield        #24  <Field CrashlyticsController this$0>
			//   26   54:aload_1         
			//   27   55:invokevirtual   #74  <Method void CrashlyticsController.doCloseSessions(SessionSettingsData)>
				doOpenSession();
			//   28   58:aload_0         
			//   29   59:getfield        #24  <Field CrashlyticsController this$0>
			//   30   62:invokestatic    #78  <Method void CrashlyticsController.access$500(CrashlyticsController)>
				if(sessionsettingsdata != null)
			//*  31   65:aload_1         
			//*  32   66:ifnull          80
					trimSessionFiles(sessionsettingsdata.maxCompleteSessionsCount);
			//   33   69:aload_0         
			//   34   70:getfield        #24  <Field CrashlyticsController this$0>
			//   35   73:aload_1         
			//   36   74:getfield        #84  <Field int SessionSettingsData.maxCompleteSessionsCount>
			//   37   77:invokevirtual   #88  <Method void CrashlyticsController.trimSessionFiles(int)>
				if(!shouldPromptUserBeforeSendingCrashReports(settingsdata))
			//*  38   80:aload_0         
			//*  39   81:getfield        #24  <Field CrashlyticsController this$0>
			//*  40   84:aload_2         
			//*  41   85:invokestatic    #92  <Method boolean CrashlyticsController.access$600(CrashlyticsController, SettingsData)>
			//*  42   88:ifne            99
					sendSessionReports(settingsdata);
			//   43   91:aload_0         
			//   44   92:getfield        #24  <Field CrashlyticsController this$0>
			//   45   95:aload_2         
			//   46   96:invokestatic    #96  <Method void CrashlyticsController.access$700(CrashlyticsController, SettingsData)>
				return null;
			//   47   99:aconst_null     
			//   48  100:areturn         
			}

			final CrashlyticsController this$0;
			final Throwable val$ex;
			final Thread val$thread;
			final Date val$time;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CrashlyticsController this$0>
				time = date;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Date val$time>
				thread = thread1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field Thread val$thread>
				ex = throwable;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field Throwable val$ex>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   37   79:aload_0         
	//   38   80:getfield        #167 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//   39   83:new             #26  <Class CrashlyticsController$6>
	//   40   86:dup             
	//   41   87:aload_0         
	//   42   88:aload_3         
	//   43   89:aload_1         
	//   44   90:aload_2         
	//   45   91:invokespecial   #1172 <Method void CrashlyticsController$6(CrashlyticsController, Date, Thread, Throwable)>
	//   46   94:invokevirtual   #1148 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//   47   97:pop             
		this;
	//   48   98:aload_0         
		JVM INSTR monitorexit ;
	//   49   99:monitorexit     
		return;
	//   50  100:return          
		thread;
	//   51  101:astore_1        
	//*  52  102:aload_0         
		throw thread;
	//   53  103:monitorexit     
	//   54  104:aload_1         
	//   55  105:athrow          
	}

	boolean isHandlingException()
	{
		CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = crashHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #1136 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
	//    2    4:astore_1        
		return crashlyticsuncaughtexceptionhandler != null && crashlyticsuncaughtexceptionhandler.isHandlingException();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1173 <Method boolean CrashlyticsUncaughtExceptionHandler.isHandlingException()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	File[] listCompleteSessionFiles()
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #964 <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #965 <Method void LinkedList()>
	//    3    7:astore_1        
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #673 <Method File getFatalSessionFilesDir()>
	//    8   14:getstatic       #110 <Field FilenameFilter SESSION_FILE_FILTER>
	//    9   17:invokespecial   #556 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   10   20:invokestatic    #1177 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   11   23:pop             
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER))));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #676 <Method File getNonFatalSessionFilesDir()>
	//   16   30:getstatic       #110 <Field FilenameFilter SESSION_FILE_FILTER>
	//   17   33:invokespecial   #556 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   18   36:invokestatic    #1177 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   19   39:pop             
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getFilesDir(), SESSION_FILE_FILTER))));
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #448 <Method File getFilesDir()>
	//   24   46:getstatic       #110 <Field FilenameFilter SESSION_FILE_FILTER>
	//   25   49:invokespecial   #556 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   26   52:invokestatic    #1177 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   27   55:pop             
		return (File[])((List) (linkedlist)).toArray(((Object []) (new File[((List) (linkedlist)).size()])));
	//   28   56:aload_1         
	//   29   57:aload_1         
	//   30   58:invokeinterface #1178 <Method int List.size()>
	//   31   63:anewarray       File[]
	//   32   66:invokeinterface #1182 <Method Object[] List.toArray(Object[])>
	//   33   71:checkcast       #1184 <Class File[]>
	//   34   74:areturn         
	}

	File[] listSessionBeginFiles()
	{
		return listFilesMatching(((FilenameFilter) (new FileNameContainsFilter("BeginSession"))));
	//    0    0:aload_0         
	//    1    1:new             #31  <Class CrashlyticsController$FileNameContainsFilter>
	//    2    4:dup             
	//    3    5:ldc2            #770 <String "BeginSession">
	//    4    8:invokespecial   #523 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//    5   11:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//    6   14:areturn         
	}

	void openSession()
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #28  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				doOpenSession();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #32  <Method void CrashlyticsController.access$500(CrashlyticsController)>
				return null;
			//    3    7:aconst_null     
			//    4    8:areturn         
			}

			final CrashlyticsController this$0;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashlyticsController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #8   <Class CrashlyticsController$11>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1185 <Method void CrashlyticsController$11(CrashlyticsController)>
	//    6   12:invokevirtual   #1188 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void submitAllReports(float f, SettingsData settingsdata)
	{
		if(settingsdata == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       19
		{
			Fabric.getLogger().w("CrashlyticsCore", "Could not send reports. Settings are not available.");
	//    2    4:invokestatic    #288 <Method Logger Fabric.getLogger()>
	//    3    7:ldc2            #290 <String "CrashlyticsCore">
	//    4   10:ldc2            #1192 <String "Could not send reports. Settings are not available.">
	//    5   13:invokeinterface #614 <Method void Logger.w(String, String)>
			return;
	//    6   18:return          
		}
		CreateReportSpiCall createreportspicall = getCreateReportSpiCall(settingsdata.appData.reportsUrl);
	//    7   19:aload_0         
	//    8   20:aload_2         
	//    9   21:getfield        #619 <Field AppSettingsData SettingsData.appData>
	//   10   24:getfield        #624 <Field String AppSettingsData.reportsUrl>
	//   11   27:invokespecial   #626 <Method CreateReportSpiCall getCreateReportSpiCall(String)>
	//   12   30:astore_3        
		if(shouldPromptUserBeforeSendingCrashReports(settingsdata))
	//*  13   31:aload_0         
	//*  14   32:aload_2         
	//*  15   33:invokespecial   #274 <Method boolean shouldPromptUserBeforeSendingCrashReports(SettingsData)>
	//*  16   36:ifeq            62
			settingsdata = ((SettingsData) (new PrivacyDialogCheck(((Kit) (crashlyticsCore)), preferenceManager, settingsdata.promptData)));
	//   17   39:new             #40  <Class CrashlyticsController$PrivacyDialogCheck>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//   21   47:aload_0         
	//   22   48:getfield        #173 <Field PreferenceManager preferenceManager>
	//   23   51:aload_2         
	//   24   52:getfield        #1196 <Field PromptSettingsData SettingsData.promptData>
	//   25   55:invokespecial   #1199 <Method void CrashlyticsController$PrivacyDialogCheck(Kit, PreferenceManager, PromptSettingsData)>
	//   26   58:astore_2        
		else
	//*  27   59:goto            70
			settingsdata = ((SettingsData) (new ReportUploader.AlwaysSendCheck()));
	//   28   62:new             #1201 <Class ReportUploader$AlwaysSendCheck>
	//   29   65:dup             
	//   30   66:invokespecial   #1202 <Method void ReportUploader$AlwaysSendCheck()>
	//   31   69:astore_2        
		(new ReportUploader(appData.apiKey, createreportspicall, reportFilesProvider, handlingExceptionCheck)).uploadReports(f, ((ReportUploader.SendCheck) (settingsdata)));
	//   32   70:new             #628 <Class ReportUploader>
	//   33   73:dup             
	//   34   74:aload_0         
	//   35   75:getfield        #177 <Field AppData appData>
	//   36   78:getfield        #633 <Field String AppData.apiKey>
	//   37   81:aload_3         
	//   38   82:aload_0         
	//   39   83:getfield        #208 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   40   86:aload_0         
	//   41   87:getfield        #211 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
	//   42   90:invokespecial   #636 <Method void ReportUploader(String, CreateReportSpiCall, ReportUploader$ReportFilesProvider, ReportUploader$HandlingExceptionCheck)>
	//   43   93:fload_1         
	//   44   94:aload_2         
	//   45   95:invokevirtual   #1206 <Method void ReportUploader.uploadReports(float, ReportUploader$SendCheck)>
	//   46   98:return          
	}

	void trimSessionFiles(int i)
	{
		i -= Utils.capFileCount(getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #673 <Method File getFatalSessionFilesDir()>
	//    3    5:iload_1         
	//    4    6:getstatic       #116 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #1210 <Method int Utils.capFileCount(File, int, Comparator)>
	//    6   12:isub            
	//    7   13:istore_1        
		int j = Utils.capFileCount(getNonFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
	//    8   14:aload_0         
	//    9   15:invokevirtual   #676 <Method File getNonFatalSessionFilesDir()>
	//   10   18:iload_1         
	//   11   19:getstatic       #116 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   12   22:invokestatic    #1210 <Method int Utils.capFileCount(File, int, Comparator)>
	//   13   25:istore_2        
		Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, i - j, SMALLEST_FILE_NAME_FIRST);
	//   14   26:aload_0         
	//   15   27:invokevirtual   #448 <Method File getFilesDir()>
	//   16   30:getstatic       #110 <Field FilenameFilter SESSION_FILE_FILTER>
	//   17   33:iload_1         
	//   18   34:iload_2         
	//   19   35:isub            
	//   20   36:getstatic       #116 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   21   39:invokestatic    #768 <Method int Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   22   42:pop             
	//   23   43:return          
	}

	void writeExternalCrashEvent(final SessionEventData crashEventData)
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #33  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				if(!isHandlingException())
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field CrashlyticsController this$0>
			//*   2    4:invokevirtual   #38  <Method boolean CrashlyticsController.isHandlingException()>
			//*   3    7:ifne            21
					doWriteExternalCrashEvent(crashEventData);
			//    4   10:aload_0         
			//    5   11:getfield        #20  <Field CrashlyticsController this$0>
			//    6   14:aload_0         
			//    7   15:getfield        #22  <Field SessionEventData val$crashEventData>
			//    8   18:invokestatic    #41  <Method void CrashlyticsController.access$1400(CrashlyticsController, SessionEventData)>
				return null;
			//    9   21:aconst_null     
			//   10   22:areturn         
			}

			final CrashlyticsController this$0;
			final SessionEventData val$crashEventData;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsController this$0>
				crashEventData = sessioneventdata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field SessionEventData val$crashEventData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #16  <Class CrashlyticsController$15>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1213 <Method void CrashlyticsController$15(CrashlyticsController, SessionEventData)>
	//    7   13:invokevirtual   #1188 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    8   16:pop             
	//    9   17:return          
	}

	static final FilenameFilter ANY_SESSION_FILENAME_FILTER = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return CrashlyticsController.SESSION_FILE_PATTERN.matcher(((CharSequence) (s))).matches();
		//    0    0:invokestatic    #19  <Method Pattern CrashlyticsController.access$000()>
		//    1    3:aload_2         
		//    2    4:invokevirtual   #25  <Method Matcher Pattern.matcher(CharSequence)>
		//    3    7:invokevirtual   #31  <Method boolean Matcher.matches()>
		//    4   10:ireturn         
		}

	}
;
	private static final String INITIAL_SESSION_PART_TAGS[] = {
		"SessionUser", "SessionApp", "SessionOS", "SessionDevice"
	};
	static final Comparator LARGEST_FILE_NAME_FIRST = new Comparator() {

		public int compare(File file, File file1)
		{
			return file1.getName().compareTo(file.getName());
		//    0    0:aload_2         
		//    1    1:invokevirtual   #22  <Method String File.getName()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method String File.getName()>
		//    4    8:invokevirtual   #28  <Method int String.compareTo(String)>
		//    5   11:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((File)obj, (File)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class File>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class File>
		//    5    9:invokevirtual   #31  <Method int compare(File, File)>
		//    6   12:ireturn         
		}

	}
;
	private static final Map SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
	static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return s.length() == 39 && s.endsWith(".cls");
		//    0    0:aload_2         
		//    1    1:invokevirtual   #21  <Method int String.length()>
		//    2    4:bipush          39
		//    3    6:icmpne          20
		//    4    9:aload_2         
		//    5   10:ldc1            #23  <String ".cls">
		//    6   12:invokevirtual   #27  <Method boolean String.endsWith(String)>
		//    7   15:ifeq            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

	}
;
	private static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
	static final Comparator SMALLEST_FILE_NAME_FIRST = new Comparator() {

		public int compare(File file, File file1)
		{
			return file.getName().compareTo(file1.getName());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method String File.getName()>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #22  <Method String File.getName()>
		//    4    8:invokevirtual   #28  <Method int String.compareTo(String)>
		//    5   11:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((File)obj, (File)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class File>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class File>
		//    5    9:invokevirtual   #31  <Method int compare(File, File)>
		//    6   12:ireturn         
		}

	}
;
	private final AppData appData;
	private final CrashlyticsBackgroundWorker backgroundWorker;
	private CrashlyticsUncaughtExceptionHandler crashHandler;
	private final CrashlyticsCore crashlyticsCore;
	private final DevicePowerStateListener devicePowerStateListener;
	private final AtomicInteger eventCounter = new AtomicInteger(0);
	private final FileStore fileStore;
	private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
	private final HttpRequestFactory httpRequestFactory;
	private final IdManager idManager;
	private final LogFileDirectoryProvider logFileDirectoryProvider;
	private final LogFileManager logFileManager;
	private final PreferenceManager preferenceManager;
	private final ReportUploader.ReportFilesProvider reportFilesProvider = new ReportUploaderFilesProvider();
	private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new StackTraceTrimmingStrategy[] {
		new RemoveRepeatsStrategy(10)
	});
	private final String unityVersion;

	static 
	{
	//    0    0:new             #6   <Class CrashlyticsController$1>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void CrashlyticsController$1()>
	//    3    7:putstatic       #110 <Field FilenameFilter SESSION_FILE_FILTER>
	//    4   10:new             #18  <Class CrashlyticsController$2>
	//    5   13:dup             
	//    6   14:invokespecial   #111 <Method void CrashlyticsController$2()>
	//    7   17:putstatic       #113 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    8   20:new             #20  <Class CrashlyticsController$3>
	//    9   23:dup             
	//   10   24:invokespecial   #114 <Method void CrashlyticsController$3()>
	//   11   27:putstatic       #116 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   12   30:new             #22  <Class CrashlyticsController$4>
	//   13   33:dup             
	//   14   34:invokespecial   #117 <Method void CrashlyticsController$4()>
	//   15   37:putstatic       #119 <Field FilenameFilter ANY_SESSION_FILENAME_FILTER>
	//   16   40:ldc1            #121 <String "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+">
	//   17   42:invokestatic    #127 <Method Pattern Pattern.compile(String)>
	//   18   45:putstatic       #129 <Field Pattern SESSION_FILE_PATTERN>
	//   19   48:ldc1            #131 <String "X-CRASHLYTICS-SEND-FLAGS">
	//   20   50:ldc1            #133 <String "1">
	//   21   52:invokestatic    #139 <Method Map Collections.singletonMap(Object, Object)>
	//   22   55:putstatic       #141 <Field Map SEND_AT_CRASHTIME_HEADER>
	//   23   58:iconst_4        
	//   24   59:anewarray       String[]
	//   25   62:dup             
	//   26   63:iconst_0        
	//   27   64:ldc1            #145 <String "SessionUser">
	//   28   66:aastore         
	//   29   67:dup             
	//   30   68:iconst_1        
	//   31   69:ldc1            #147 <String "SessionApp">
	//   32   71:aastore         
	//   33   72:dup             
	//   34   73:iconst_2        
	//   35   74:ldc1            #149 <String "SessionOS">
	//   36   76:aastore         
	//   37   77:dup             
	//   38   78:iconst_3        
	//   39   79:ldc1            #151 <String "SessionDevice">
	//   40   81:aastore         
	//   41   82:putstatic       #153 <Field String[] INITIAL_SESSION_PART_TAGS>
	//*  42   85:return          
	}


/*
	static Pattern access$000()
	{
		return SESSION_FILE_PATTERN;
	//    0    0:getstatic       #129 <Field Pattern SESSION_FILE_PATTERN>
	//    1    3:areturn         
	}

*/


/*
	static void access$1100(CrashlyticsController crashlyticscontroller, SessionSettingsData sessionsettingsdata, boolean flag)
		throws Exception
	{
		crashlyticscontroller.doCloseSessions(sessionsettingsdata, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #240 <Method void doCloseSessions(SessionSettingsData, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static File[] access$1300(CrashlyticsController crashlyticscontroller, FilenameFilter filenamefilter)
	{
		return crashlyticscontroller.listFilesMatching(filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #247 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    5:areturn         
	}

*/


/*
	static void access$1400(CrashlyticsController crashlyticscontroller, SessionEventData sessioneventdata)
		throws IOException
	{
		crashlyticscontroller.doWriteExternalCrashEvent(sessioneventdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #255 <Method void doWriteExternalCrashEvent(SessionEventData)>
		return;
	//    3    5:return          
	}

*/


/*
	static CrashlyticsCore access$300(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.crashlyticsCore;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(CrashlyticsController crashlyticscontroller, Date date, Thread thread, Throwable throwable)
	{
		crashlyticscontroller.writeFatal(date, thread, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #263 <Method void writeFatal(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$500(CrashlyticsController crashlyticscontroller)
		throws Exception
	{
		crashlyticscontroller.doOpenSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #268 <Method void doOpenSession()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$600(CrashlyticsController crashlyticscontroller, SettingsData settingsdata)
	{
		return crashlyticscontroller.shouldPromptUserBeforeSendingCrashReports(settingsdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #274 <Method boolean shouldPromptUserBeforeSendingCrashReports(SettingsData)>
	//    3    5:ireturn         
	}

*/


/*
	static void access$700(CrashlyticsController crashlyticscontroller, SettingsData settingsdata)
	{
		crashlyticscontroller.sendSessionReports(settingsdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #280 <Method void sendSessionReports(SettingsData)>
		return;
	//    3    5:return          
	}

*/
}
