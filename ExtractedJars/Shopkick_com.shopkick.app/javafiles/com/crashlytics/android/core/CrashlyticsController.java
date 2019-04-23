// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import android.text.TextUtils;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
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
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			UnityVersionProvider, CrashlyticsCore, LogFileManager, DevicePowerStateListener, 
//			MiddleOutFallbackStrategy, StackTraceTrimmingStrategy, RemoveRepeatsStrategy, ClsFileOutputStream, 
//			CodedOutputStream, CLSUUID, NativeFileUtils, MetaDataStore, 
//			CompositeCreateReportSpiCall, DefaultCreateReportSpiCall, NativeCreateReportSpiCall, UserMetaData, 
//			ReportUploader, AppData, SessionReport, CrashlyticsBackgroundWorker, 
//			PreferenceManager, Utils, TrimmedThrowableData, SessionProtobufHelper, 
//			CrashlyticsUncaughtExceptionHandler, AppMeasurementEventListenerRegistrar, CreateReportSpiCall, CrashlyticsNdkData, 
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

	private static interface CodedOutputStreamWriteAction
	{

		public abstract void writeTo(CodedOutputStream codedoutputstream)
			throws Exception;
	}

	private static final class DefaultSettingsDataProvider
		implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider
	{

		public SettingsData getSettingsData()
		{
			return Settings.getInstance().awaitSettingsData();
		//    0    0:invokestatic    #24  <Method Settings Settings.getInstance()>
		//    1    3:invokevirtual   #27  <Method SettingsData Settings.awaitSettingsData()>
		//    2    6:areturn         
		}

		private DefaultSettingsDataProvider()
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

	private static interface FileOutputStreamWriteAction
	{

		public abstract void writeTo(FileOutputStream fileoutputstream)
			throws Exception;
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
		//    0    0:new             #27  <Class File>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field FileStore rootFileStore>
		//    4    8:invokeinterface #32  <Method File FileStore.getFilesDir()>
		//    5   13:ldc1            #13  <String "log-files">
		//    6   15:invokespecial   #35  <Method void File(File, String)>
		//    7   18:astore_1        
			if(!file.exists())
		//*   8   19:aload_1         
		//*   9   20:invokevirtual   #39  <Method boolean File.exists()>
		//*  10   23:ifne            31
				file.mkdirs();
		//   11   26:aload_1         
		//   12   27:invokevirtual   #42  <Method boolean File.mkdirs()>
		//   13   30:pop             
			return file;
		//   14   31:aload_1         
		//   15   32:areturn         
		}

		private static final String LOG_FILES_DIR = "log-files";
		private final FileStore rootFileStore;

		public LogFileDirectoryProvider(FileStore filestore)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			rootFileStore = filestore;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field FileStore rootFileStore>
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
					//    2    4:invokestatic    #30  <Method PreferenceManager CrashlyticsController$PrivacyDialogCheck.access$2100(CrashlyticsController$PrivacyDialogCheck)>
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
		static PreferenceManager access$2100(PrivacyDialogCheck privacydialogcheck)
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

		public File[] getNativeReportFiles()
		{
			return listNativeSessionFileDirectories();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CrashlyticsController this$0>
		//    2    4:invokevirtual   #41  <Method File[] CrashlyticsController.listNativeSessionFileDirectories()>
		//    3    7:areturn         
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
			UnityVersionProvider unityversionprovider, AppMeasurementEventListenerRegistrar appmeasurementeventlistenerregistrar, EventLogger eventlogger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #289 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #291 <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #294 <Method void AtomicInteger(int)>
	//    7   13:putfield        #296 <Field AtomicInteger eventCounter>
		crashlyticsCore = crashlyticscore;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #298 <Field CrashlyticsCore crashlyticsCore>
		backgroundWorker = crashlyticsbackgroundworker;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
		httpRequestFactory = httprequestfactory;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #302 <Field HttpRequestFactory httpRequestFactory>
		idManager = idmanager;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #304 <Field IdManager idManager>
		preferenceManager = preferencemanager;
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:putfield        #306 <Field PreferenceManager preferenceManager>
		fileStore = filestore;
	//   23   43:aload_0         
	//   24   44:aload           6
	//   25   46:putfield        #308 <Field FileStore fileStore>
		appData = appdata;
	//   26   49:aload_0         
	//   27   50:aload           7
	//   28   52:putfield        #310 <Field AppData appData>
		unityVersion = unityversionprovider.getUnityVersion();
	//   29   55:aload_0         
	//   30   56:aload           8
	//   31   58:invokeinterface #316 <Method String UnityVersionProvider.getUnityVersion()>
	//   32   63:putfield        #318 <Field String unityVersion>
		appMeasurementEventListenerRegistrar = appmeasurementeventlistenerregistrar;
	//   33   66:aload_0         
	//   34   67:aload           9
	//   35   69:putfield        #320 <Field AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar>
		firebaseAnalyticsLogger = eventlogger;
	//   36   72:aload_0         
	//   37   73:aload           10
	//   38   75:putfield        #322 <Field EventLogger firebaseAnalyticsLogger>
		crashlyticscore = ((CrashlyticsCore) (crashlyticscore.getContext()));
	//   39   78:aload_1         
	//   40   79:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//   41   82:astore_1        
		logFileDirectoryProvider = new LogFileDirectoryProvider(filestore);
	//   42   83:aload_0         
	//   43   84:new             #82  <Class CrashlyticsController$LogFileDirectoryProvider>
	//   44   87:dup             
	//   45   88:aload           6
	//   46   90:invokespecial   #331 <Method void CrashlyticsController$LogFileDirectoryProvider(FileStore)>
	//   47   93:putfield        #333 <Field CrashlyticsController$LogFileDirectoryProvider logFileDirectoryProvider>
		logFileManager = new LogFileManager(((Context) (crashlyticscore)), ((LogFileManager.DirectoryProvider) (logFileDirectoryProvider)));
	//   48   96:aload_0         
	//   49   97:new             #335 <Class LogFileManager>
	//   50  100:dup             
	//   51  101:aload_1         
	//   52  102:aload_0         
	//   53  103:getfield        #333 <Field CrashlyticsController$LogFileDirectoryProvider logFileDirectoryProvider>
	//   54  106:invokespecial   #338 <Method void LogFileManager(Context, LogFileManager$DirectoryProvider)>
	//   55  109:putfield        #340 <Field LogFileManager logFileManager>
	//   56  112:aload_0         
	//   57  113:new             #92  <Class CrashlyticsController$ReportUploaderFilesProvider>
	//   58  116:dup             
	//   59  117:aload_0         
	//   60  118:aconst_null     
	//   61  119:invokespecial   #343 <Method void CrashlyticsController$ReportUploaderFilesProvider(CrashlyticsController, CrashlyticsController$1)>
	//   62  122:putfield        #345 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   63  125:aload_0         
	//   64  126:new             #95  <Class CrashlyticsController$ReportUploaderHandlingExceptionCheck>
	//   65  129:dup             
	//   66  130:aload_0         
	//   67  131:aconst_null     
	//   68  132:invokespecial   #346 <Method void CrashlyticsController$ReportUploaderHandlingExceptionCheck(CrashlyticsController, CrashlyticsController$1)>
	//   69  135:putfield        #348 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
		devicePowerStateListener = new DevicePowerStateListener(((Context) (crashlyticscore)));
	//   70  138:aload_0         
	//   71  139:new             #350 <Class DevicePowerStateListener>
	//   72  142:dup             
	//   73  143:aload_1         
	//   74  144:invokespecial   #353 <Method void DevicePowerStateListener(Context)>
	//   75  147:putfield        #355 <Field DevicePowerStateListener devicePowerStateListener>
	//   76  150:aload_0         
	//   77  151:new             #357 <Class MiddleOutFallbackStrategy>
	//   78  154:dup             
	//   79  155:sipush          1024
	//   80  158:iconst_1        
	//   81  159:anewarray       StackTraceTrimmingStrategy[]
	//   82  162:dup             
	//   83  163:iconst_0        
	//   84  164:new             #361 <Class RemoveRepeatsStrategy>
	//   85  167:dup             
	//   86  168:bipush          10
	//   87  170:invokespecial   #362 <Method void RemoveRepeatsStrategy(int)>
	//   88  173:aastore         
	//   89  174:invokespecial   #365 <Method void MiddleOutFallbackStrategy(int, StackTraceTrimmingStrategy[])>
	//   90  177:putfield        #367 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//   91  180:return          
	}

	private void closeOpenSessions(File afile[], int i, int j)
	{
		Fabric.getLogger().d("CrashlyticsCore", "Closing open sessions.");
	//    0    0:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    1    3:ldc2            #457 <String "CrashlyticsCore">
	//    2    6:ldc2            #459 <String "Closing open sessions.">
	//    3    9:invokeinterface #465 <Method void Logger.d(String, String)>
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
	//   13   27:invokestatic    #469 <Method String getSessionIdFromSessionFile(File)>
	//   14   30:astore          5
			Logger logger = Fabric.getLogger();
	//   15   32:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   16   35:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #471 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #472 <Method void StringBuilder()>
	//   20   44:astore          7
			stringbuilder.append("Closing session: ");
	//   21   46:aload           7
	//   22   48:ldc2            #474 <String "Closing session: ">
	//   23   51:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			stringbuilder.append(s);
	//   25   55:aload           7
	//   26   57:aload           5
	//   27   59:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
			logger.d("CrashlyticsCore", stringbuilder.toString());
	//   29   63:aload           6
	//   30   65:ldc2            #457 <String "CrashlyticsCore">
	//   31   68:aload           7
	//   32   70:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   33   73:invokeinterface #465 <Method void Logger.d(String, String)>
			writeSessionPartsToSessionFile(file, s, j);
	//   34   78:aload_0         
	//   35   79:aload           4
	//   36   81:aload           5
	//   37   83:iload_3         
	//   38   84:invokespecial   #485 <Method void writeSessionPartsToSessionFile(File, String, int)>
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
	//    4    6:invokevirtual   #492 <Method void ClsFileOutputStream.closeInProgressStream()>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ClsFileOutputStream clsfileoutputstream)
	//*   6   10:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (clsfileoutputstream)));
	//    7   11:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    8   14:ldc2            #457 <String "CrashlyticsCore">
	//    9   17:ldc2            #494 <String "Error closing session file stream in the presence of an exception">
	//   10   20:aload_1         
	//   11   21:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
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
	//   16   23:invokevirtual   #506 <Method int InputStream.read(byte[], int, int)>
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
	//   27   41:invokevirtual   #512 <Method void CodedOutputStream.writeRawBytes(byte[])>
	//   28   44:return          
	}

	private void deleteSessionPartFilesFor(String s)
	{
		s = ((String) (listSessionPartFilesFor(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #517 <Method File[] listSessionPartFilesFor(String)>
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
	//   15   19:invokevirtual   #523 <Method boolean File.delete()>
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
	//    0    0:new             #525 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #527 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #530 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void doOpenSession()
		throws Exception
	{
		Date date = new Date();
	//    0    0:new             #532 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #533 <Method void Date()>
	//    3    7:astore_1        
		String s = (new CLSUUID(idManager)).toString();
	//    4    8:new             #535 <Class CLSUUID>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #304 <Field IdManager idManager>
	//    8   16:invokespecial   #538 <Method void CLSUUID(IdManager)>
	//    9   19:invokevirtual   #539 <Method String CLSUUID.toString()>
	//   10   22:astore_2        
		Logger logger = Fabric.getLogger();
	//   11   23:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   12   26:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #471 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #472 <Method void StringBuilder()>
	//   16   34:astore          4
		stringbuilder.append("Opening a new session with ID ");
	//   17   36:aload           4
	//   18   38:ldc2            #541 <String "Opening a new session with ID ">
	//   19   41:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(s);
	//   21   45:aload           4
	//   22   47:aload_2         
	//   23   48:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		logger.d("CrashlyticsCore", stringbuilder.toString());
	//   25   52:aload_3         
	//   26   53:ldc2            #457 <String "CrashlyticsCore">
	//   27   56:aload           4
	//   28   58:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   29   61:invokeinterface #465 <Method void Logger.d(String, String)>
		writeBeginSession(s, date);
	//   30   66:aload_0         
	//   31   67:aload_2         
	//   32   68:aload_1         
	//   33   69:invokespecial   #545 <Method void writeBeginSession(String, Date)>
		writeSessionApp(s);
	//   34   72:aload_0         
	//   35   73:aload_2         
	//   36   74:invokespecial   #548 <Method void writeSessionApp(String)>
		writeSessionOS(s);
	//   37   77:aload_0         
	//   38   78:aload_2         
	//   39   79:invokespecial   #551 <Method void writeSessionOS(String)>
		writeSessionDevice(s);
	//   40   82:aload_0         
	//   41   83:aload_2         
	//   42   84:invokespecial   #554 <Method void writeSessionDevice(String)>
		logFileManager.setCurrentSession(s);
	//   43   87:aload_0         
	//   44   88:getfield        #340 <Field LogFileManager logFileManager>
	//   45   91:aload_2         
	//   46   92:invokevirtual   #557 <Method void LogFileManager.setCurrentSession(String)>
	//   47   95:return          
	}

	private void doWriteNonFatal(Date date, Thread thread, Throwable throwable)
	{
		Object obj;
		Object obj2;
		CodedOutputStream codedoutputstream;
		Object obj3;
		String s;
		s = getCurrentSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #382 <Method String getCurrentSessionId()>
	//    2    4:astore          9
		obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          4
		obj3 = null;
	//    5    9:aconst_null     
	//    6   10:astore          8
		obj2 = null;
	//    7   12:aconst_null     
	//    8   13:astore          6
		codedoutputstream = null;
	//    9   15:aconst_null     
	//   10   16:astore          7
		if(s == null)
	//*  11   18:aload           9
	//*  12   20:ifnonnull       39
		{
			Fabric.getLogger().e("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", ((Throwable) (null)));
	//   13   23:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   14   26:ldc2            #457 <String "CrashlyticsCore">
	//   15   29:ldc2            #559 <String "Tried to write a non-fatal exception while no session was open.">
	//   16   32:aconst_null     
	//   17   33:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
			return;
	//   18   38:return          
		}
		recordLoggedExceptionAnswersEvent(s, ((Object) (throwable)).getClass().getName());
	//   19   39:aload           9
	//   20   41:aload_3         
	//   21   42:invokevirtual   #563 <Method Class Object.getClass()>
	//   22   45:invokevirtual   #568 <Method String Class.getName()>
	//   23   48:invokestatic    #571 <Method void recordLoggedExceptionAnswersEvent(String, String)>
		Object obj1;
		obj1 = ((Object) (Fabric.getLogger()));
	//   24   51:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   25   54:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//   26   56:new             #471 <Class StringBuilder>
	//   27   59:dup             
	//   28   60:invokespecial   #472 <Method void StringBuilder()>
	//   29   63:astore          10
		stringbuilder.append("Crashlytics is logging non-fatal exception \"");
	//   30   65:aload           10
	//   31   67:ldc2            #573 <String "Crashlytics is logging non-fatal exception \"">
	//   32   70:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:pop             
		stringbuilder.append(((Object) (throwable)));
	//   34   74:aload           10
	//   35   76:aload_3         
	//   36   77:invokevirtual   #576 <Method StringBuilder StringBuilder.append(Object)>
	//   37   80:pop             
		stringbuilder.append("\" from thread ");
	//   38   81:aload           10
	//   39   83:ldc2            #578 <String "\" from thread ">
	//   40   86:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   41   89:pop             
		stringbuilder.append(thread.getName());
	//   42   90:aload           10
	//   43   92:aload_2         
	//   44   93:invokevirtual   #581 <Method String Thread.getName()>
	//   45   96:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   46   99:pop             
		((Logger) (obj1)).d("CrashlyticsCore", stringbuilder.toString());
	//   47  100:aload           5
	//   48  102:ldc2            #457 <String "CrashlyticsCore">
	//   49  105:aload           10
	//   50  107:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   51  110:invokeinterface #465 <Method void Logger.d(String, String)>
		obj1 = ((Object) (CommonUtils.padWithZerosToMaxIntWidth(eventCounter.getAndIncrement())));
	//   52  115:aload_0         
	//   53  116:getfield        #296 <Field AtomicInteger eventCounter>
	//   54  119:invokevirtual   #585 <Method int AtomicInteger.getAndIncrement()>
	//   55  122:invokestatic    #591 <Method String CommonUtils.padWithZerosToMaxIntWidth(int)>
	//   56  125:astore          5
		stringbuilder = new StringBuilder();
	//   57  127:new             #471 <Class StringBuilder>
	//   58  130:dup             
	//   59  131:invokespecial   #472 <Method void StringBuilder()>
	//   60  134:astore          10
		stringbuilder.append(s);
	//   61  136:aload           10
	//   62  138:aload           9
	//   63  140:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   64  143:pop             
		stringbuilder.append("SessionEvent");
	//   65  144:aload           10
	//   66  146:ldc1            #194 <String "SessionEvent">
	//   67  148:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   68  151:pop             
		stringbuilder.append(((String) (obj1)));
	//   69  152:aload           10
	//   70  154:aload           5
	//   71  156:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   72  159:pop             
		obj1 = ((Object) (stringbuilder.toString()));
	//   73  160:aload           10
	//   74  162:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   75  165:astore          5
		obj1 = ((Object) (new ClsFileOutputStream(getFilesDir(), ((String) (obj1)))));
	//   76  167:new             #489 <Class ClsFileOutputStream>
	//   77  170:dup             
	//   78  171:aload_0         
	//   79  172:invokevirtual   #595 <Method File getFilesDir()>
	//   80  175:aload           5
	//   81  177:invokespecial   #598 <Method void ClsFileOutputStream(File, String)>
	//   82  180:astore          5
		obj = ((Object) (obj3));
	//   83  182:aload           8
	//   84  184:astore          4
		obj2 = obj1;
	//   85  186:aload           5
	//   86  188:astore          6
		CodedOutputStream codedoutputstream1;
		try
		{
			codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)));
	//   87  190:aload           5
	//   88  192:invokestatic    #602 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   89  195:astore          8
		}
	//*  90  197:aload           8
	//*  91  199:astore          7
	//*  92  201:aload           8
	//*  93  203:astore          4
	//*  94  205:aload           5
	//*  95  207:astore          6
	//*  96  209:aload_0         
	//*  97  210:aload           8
	//*  98  212:aload_1         
	//*  99  213:aload_2         
	//* 100  214:aload_3         
	//* 101  215:ldc1            #118 <String "error">
	//* 102  217:iconst_0        
	//* 103  218:invokespecial   #606 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
	//* 104  221:aload           8
	//* 105  223:astore_1        
	//* 106  224:aload           5
	//* 107  226:astore_2        
	//* 108  227:goto            280
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//* 109  230:astore_3        
		{
			date = ((Date) (codedoutputstream));
	//  110  231:aload           7
	//  111  233:astore_1        
			thread = ((Thread) (obj1));
	//  112  234:aload           5
	//  113  236:astore_2        
			break MISSING_BLOCK_LABEL_259;
	//  114  237:goto            259
		}
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj2 = obj1;
		writeSessionEvent(codedoutputstream1, date, thread, throwable, "error", false);
		date = ((Date) (codedoutputstream1));
		thread = ((Thread) (obj1));
		break MISSING_BLOCK_LABEL_280;
		date;
	//  115  240:astore_1        
		thread = null;
	//  116  241:aconst_null     
	//  117  242:astore_2        
		obj = obj2;
	//  118  243:aload           6
	//  119  245:astore          4
		obj2 = ((Object) (thread));
	//  120  247:aload_2         
	//  121  248:astore          6
		break MISSING_BLOCK_LABEL_321;
	//  122  250:goto            321
		throwable;
	//  123  253:astore_3        
		thread = null;
	//  124  254:aconst_null     
	//  125  255:astore_2        
		date = ((Date) (obj));
	//  126  256:aload           4
	//  127  258:astore_1        
		obj = ((Object) (date));
	//  128  259:aload_1         
	//  129  260:astore          4
		obj2 = ((Object) (thread));
	//  130  262:aload_2         
	//  131  263:astore          6
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the non-fatal exception logger", throwable);
	//  132  265:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  133  268:ldc2            #457 <String "CrashlyticsCore">
	//  134  271:ldc2            #608 <String "An error occurred in the non-fatal exception logger">
	//  135  274:aload_3         
	//  136  275:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to non-fatal file.");
	//  137  280:aload_1         
	//  138  281:ldc2            #610 <String "Failed to flush to non-fatal file.">
	//  139  284:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (thread)), "Failed to close non-fatal file output stream.");
	//  140  287:aload_2         
	//  141  288:ldc2            #616 <String "Failed to close non-fatal file output stream.">
	//  142  291:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		try
		{
			trimSessionEventFiles(s, 64);
	//  143  294:aload_0         
	//  144  295:aload           9
	//  145  297:bipush          64
	//  146  299:invokespecial   #624 <Method void trimSessionEventFiles(String, int)>
			return;
	//  147  302:return          
		}
		// Misplaced declaration of an exception variable
		catch(Date date)
	//* 148  303:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "An error occurred when trimming non-fatal files.", ((Throwable) (date)));
	//  149  304:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  150  307:ldc2            #457 <String "CrashlyticsCore">
	//  151  310:ldc2            #626 <String "An error occurred when trimming non-fatal files.">
	//  152  313:aload_1         
	//  153  314:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
		}
		return;
	//  154  319:return          
		date;
	//  155  320:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to non-fatal file.");
	//  156  321:aload           4
	//  157  323:ldc2            #610 <String "Failed to flush to non-fatal file.">
	//  158  326:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close non-fatal file output stream.");
	//  159  329:aload           6
	//  160  331:ldc2            #616 <String "Failed to close non-fatal file output stream.">
	//  161  334:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw date;
	//  162  337:aload_1         
	//  163  338:athrow          
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

	private void finalizeMostRecentNativeCrash(Context context, File file, String s)
		throws IOException
	{
		byte abyte0[] = NativeFileUtils.minidumpFromDirectory(file);
	//    0    0:aload_2         
	//    1    1:invokestatic    #634 <Method byte[] NativeFileUtils.minidumpFromDirectory(File)>
	//    2    4:astore          4
		byte abyte1[] = NativeFileUtils.metadataJsonFromDirectory(file);
	//    3    6:aload_2         
	//    4    7:invokestatic    #637 <Method byte[] NativeFileUtils.metadataJsonFromDirectory(File)>
	//    5   10:astore          5
		context = ((Context) (NativeFileUtils.binaryImagesJsonFromDirectory(file, context)));
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokestatic    #641 <Method byte[] NativeFileUtils.binaryImagesJsonFromDirectory(File, Context)>
	//    9   17:astore_1        
		if(abyte0 != null && abyte0.length != 0)
	//*  10   18:aload           4
	//*  11   20:ifnull          360
	//*  12   23:aload           4
	//*  13   25:arraylength     
	//*  14   26:ifne            32
	//*  15   29:goto            360
		{
			recordFatalExceptionAnswersEvent(s, "<native-crash: minidump>");
	//   16   32:aload_3         
	//   17   33:ldc2            #643 <String "<native-crash: minidump>">
	//   18   36:invokestatic    #646 <Method void recordFatalExceptionAnswersEvent(String, String)>
			file = ((File) (readFile(s, "BeginSession.json")));
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:ldc2            #648 <String "BeginSession.json">
	//   22   44:invokespecial   #652 <Method byte[] readFile(String, String)>
	//   23   47:astore_2        
			byte abyte2[] = readFile(s, "SessionApp.json");
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:ldc2            #654 <String "SessionApp.json">
	//   27   53:invokespecial   #652 <Method byte[] readFile(String, String)>
	//   28   56:astore          6
			byte abyte3[] = readFile(s, "SessionDevice.json");
	//   29   58:aload_0         
	//   30   59:aload_3         
	//   31   60:ldc2            #656 <String "SessionDevice.json">
	//   32   63:invokespecial   #652 <Method byte[] readFile(String, String)>
	//   33   66:astore          7
			byte abyte4[] = readFile(s, "SessionOS.json");
	//   34   68:aload_0         
	//   35   69:aload_3         
	//   36   70:ldc2            #658 <String "SessionOS.json">
	//   37   73:invokespecial   #652 <Method byte[] readFile(String, String)>
	//   38   76:astore          8
			byte abyte5[] = NativeFileUtils.readFile((new MetaDataStore(getFilesDir())).getUserDataFileForSession(s));
	//   39   78:new             #660 <Class MetaDataStore>
	//   40   81:dup             
	//   41   82:aload_0         
	//   42   83:invokevirtual   #595 <Method File getFilesDir()>
	//   43   86:invokespecial   #663 <Method void MetaDataStore(File)>
	//   44   89:aload_3         
	//   45   90:invokevirtual   #667 <Method File MetaDataStore.getUserDataFileForSession(String)>
	//   46   93:invokestatic    #669 <Method byte[] NativeFileUtils.readFile(File)>
	//   47   96:astore          9
			LogFileManager logfilemanager = new LogFileManager(crashlyticsCore.getContext(), ((LogFileManager.DirectoryProvider) (logFileDirectoryProvider)), s);
	//   48   98:new             #335 <Class LogFileManager>
	//   49  101:dup             
	//   50  102:aload_0         
	//   51  103:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   52  106:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//   53  109:aload_0         
	//   54  110:getfield        #333 <Field CrashlyticsController$LogFileDirectoryProvider logFileDirectoryProvider>
	//   55  113:aload_3         
	//   56  114:invokespecial   #672 <Method void LogFileManager(Context, LogFileManager$DirectoryProvider, String)>
	//   57  117:astore          11
			byte abyte6[] = logfilemanager.getBytesForLog();
	//   58  119:aload           11
	//   59  121:invokevirtual   #676 <Method byte[] LogFileManager.getBytesForLog()>
	//   60  124:astore          10
			logfilemanager.clearLog();
	//   61  126:aload           11
	//   62  128:invokevirtual   #679 <Method void LogFileManager.clearLog()>
			byte abyte7[] = NativeFileUtils.readFile((new MetaDataStore(getFilesDir())).getKeysFileForSession(s));
	//   63  131:new             #660 <Class MetaDataStore>
	//   64  134:dup             
	//   65  135:aload_0         
	//   66  136:invokevirtual   #595 <Method File getFilesDir()>
	//   67  139:invokespecial   #663 <Method void MetaDataStore(File)>
	//   68  142:aload_3         
	//   69  143:invokevirtual   #682 <Method File MetaDataStore.getKeysFileForSession(String)>
	//   70  146:invokestatic    #669 <Method byte[] NativeFileUtils.readFile(File)>
	//   71  149:astore          11
			s = ((String) (new File(fileStore.getFilesDir(), s)));
	//   72  151:new             #519 <Class File>
	//   73  154:dup             
	//   74  155:aload_0         
	//   75  156:getfield        #308 <Field FileStore fileStore>
	//   76  159:invokeinterface #685 <Method File FileStore.getFilesDir()>
	//   77  164:aload_3         
	//   78  165:invokespecial   #686 <Method void File(File, String)>
	//   79  168:astore_3        
			if(!((File) (s)).mkdir())
	//*  80  169:aload_3         
	//*  81  170:invokevirtual   #689 <Method boolean File.mkdir()>
	//*  82  173:ifne            191
			{
				Fabric.getLogger().d("CrashlyticsCore", "Couldn't create native sessions directory");
	//   83  176:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   84  179:ldc2            #457 <String "CrashlyticsCore">
	//   85  182:ldc2            #691 <String "Couldn't create native sessions directory">
	//   86  185:invokeinterface #465 <Method void Logger.d(String, String)>
				return;
	//   87  190:return          
			} else
			{
				gzipIfNotEmpty(abyte0, new File(((File) (s)), "minidump"));
	//   88  191:aload_0         
	//   89  192:aload           4
	//   90  194:new             #519 <Class File>
	//   91  197:dup             
	//   92  198:aload_3         
	//   93  199:ldc2            #693 <String "minidump">
	//   94  202:invokespecial   #686 <Method void File(File, String)>
	//   95  205:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte1, new File(((File) (s)), "metadata"));
	//   96  208:aload_0         
	//   97  209:aload           5
	//   98  211:new             #519 <Class File>
	//   99  214:dup             
	//  100  215:aload_3         
	//  101  216:ldc2            #699 <String "metadata">
	//  102  219:invokespecial   #686 <Method void File(File, String)>
	//  103  222:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(((byte []) (context)), new File(((File) (s)), "binaryImages"));
	//  104  225:aload_0         
	//  105  226:aload_1         
	//  106  227:new             #519 <Class File>
	//  107  230:dup             
	//  108  231:aload_3         
	//  109  232:ldc2            #701 <String "binaryImages">
	//  110  235:invokespecial   #686 <Method void File(File, String)>
	//  111  238:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(((byte []) (file)), new File(((File) (s)), "session"));
	//  112  241:aload_0         
	//  113  242:aload_2         
	//  114  243:new             #519 <Class File>
	//  115  246:dup             
	//  116  247:aload_3         
	//  117  248:ldc2            #703 <String "session">
	//  118  251:invokespecial   #686 <Method void File(File, String)>
	//  119  254:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte2, new File(((File) (s)), "app"));
	//  120  257:aload_0         
	//  121  258:aload           6
	//  122  260:new             #519 <Class File>
	//  123  263:dup             
	//  124  264:aload_3         
	//  125  265:ldc2            #705 <String "app">
	//  126  268:invokespecial   #686 <Method void File(File, String)>
	//  127  271:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte3, new File(((File) (s)), "device"));
	//  128  274:aload_0         
	//  129  275:aload           7
	//  130  277:new             #519 <Class File>
	//  131  280:dup             
	//  132  281:aload_3         
	//  133  282:ldc2            #707 <String "device">
	//  134  285:invokespecial   #686 <Method void File(File, String)>
	//  135  288:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte4, new File(((File) (s)), "os"));
	//  136  291:aload_0         
	//  137  292:aload           8
	//  138  294:new             #519 <Class File>
	//  139  297:dup             
	//  140  298:aload_3         
	//  141  299:ldc2            #709 <String "os">
	//  142  302:invokespecial   #686 <Method void File(File, String)>
	//  143  305:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte5, new File(((File) (s)), "user"));
	//  144  308:aload_0         
	//  145  309:aload           9
	//  146  311:new             #519 <Class File>
	//  147  314:dup             
	//  148  315:aload_3         
	//  149  316:ldc2            #711 <String "user">
	//  150  319:invokespecial   #686 <Method void File(File, String)>
	//  151  322:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte6, new File(((File) (s)), "logs"));
	//  152  325:aload_0         
	//  153  326:aload           10
	//  154  328:new             #519 <Class File>
	//  155  331:dup             
	//  156  332:aload_3         
	//  157  333:ldc2            #713 <String "logs">
	//  158  336:invokespecial   #686 <Method void File(File, String)>
	//  159  339:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte7, new File(((File) (s)), "keys"));
	//  160  342:aload_0         
	//  161  343:aload           11
	//  162  345:new             #519 <Class File>
	//  163  348:dup             
	//  164  349:aload_3         
	//  165  350:ldc2            #715 <String "keys">
	//  166  353:invokespecial   #686 <Method void File(File, String)>
	//  167  356:invokespecial   #697 <Method void gzipIfNotEmpty(byte[], File)>
				return;
	//  168  359:return          
			}
		} else
		{
			context = ((Context) (Fabric.getLogger()));
	//  169  360:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  170  363:astore_1        
			s = ((String) (new StringBuilder()));
	//  171  364:new             #471 <Class StringBuilder>
	//  172  367:dup             
	//  173  368:invokespecial   #472 <Method void StringBuilder()>
	//  174  371:astore_3        
			((StringBuilder) (s)).append("No minidump data found in directory ");
	//  175  372:aload_3         
	//  176  373:ldc2            #717 <String "No minidump data found in directory ">
	//  177  376:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  178  379:pop             
			((StringBuilder) (s)).append(((Object) (file)));
	//  179  380:aload_3         
	//  180  381:aload_2         
	//  181  382:invokevirtual   #576 <Method StringBuilder StringBuilder.append(Object)>
	//  182  385:pop             
			((Logger) (context)).w("CrashlyticsCore", ((StringBuilder) (s)).toString());
	//  183  386:aload_1         
	//  184  387:ldc2            #457 <String "CrashlyticsCore">
	//  185  390:aload_3         
	//  186  391:invokevirtual   #481 <Method String StringBuilder.toString()>
	//  187  394:invokeinterface #720 <Method void Logger.w(String, String)>
			return;
	//  188  399:return          
		}
	}

	private boolean firebaseCrashExists()
	{
		ClassNotFoundException classnotfoundexception;
		try
		{
			Class.forName("com.google.firebase.crash.FirebaseCrash");
	//    0    0:ldc2            #725 <String "com.google.firebase.crash.FirebaseCrash">
	//    1    3:invokestatic    #729 <Method Class Class.forName(String)>
	//    2    6:pop             
		}
	//*   3    7:iconst_1        
	//*   4    8:ireturn         
	//*   5    9:iconst_0        
	//*   6   10:ireturn         
		// Misplaced declaration of an exception variable
		catch(ClassNotFoundException classnotfoundexception)
		{
			return false;
		}
		return true;
	//*   7   11:astore_1        
	//*   8   12:goto            9
	}

	private CreateReportSpiCall getCreateReportSpiCall(String s, String s1)
	{
		String s2 = CommonUtils.getStringsFileValue(crashlyticsCore.getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//    3    7:ldc1            #112 <String "com.crashlytics.ApiEndpoint">
	//    4    9:invokestatic    #735 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    5   12:astore_3        
		return ((CreateReportSpiCall) (new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(((Kit) (crashlyticsCore)), s2, s, httpRequestFactory), new NativeCreateReportSpiCall(((Kit) (crashlyticsCore)), s2, s1, httpRequestFactory))));
	//    6   13:new             #737 <Class CompositeCreateReportSpiCall>
	//    7   16:dup             
	//    8   17:new             #739 <Class DefaultCreateReportSpiCall>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   12   25:aload_3         
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #302 <Field HttpRequestFactory httpRequestFactory>
	//   16   31:invokespecial   #742 <Method void DefaultCreateReportSpiCall(Kit, String, String, HttpRequestFactory)>
	//   17   34:new             #744 <Class NativeCreateReportSpiCall>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   21   42:aload_3         
	//   22   43:aload_2         
	//   23   44:aload_0         
	//   24   45:getfield        #302 <Field HttpRequestFactory httpRequestFactory>
	//   25   48:invokespecial   #745 <Method void NativeCreateReportSpiCall(Kit, String, String, HttpRequestFactory)>
	//   26   51:invokespecial   #748 <Method void CompositeCreateReportSpiCall(DefaultCreateReportSpiCall, NativeCreateReportSpiCall)>
	//   27   54:areturn         
	}

	private String getCurrentSessionId()
	{
		File afile[] = listSortedSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #752 <Method File[] listSortedSessionBeginFiles()>
	//    2    4:astore_1        
		if(afile.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            17
			return getSessionIdFromSessionFile(afile[0]);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:invokestatic    #469 <Method String getSessionIdFromSessionFile(File)>
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
	//    1    1:invokespecial   #752 <Method File[] listSortedSessionBeginFiles()>
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
	//   10   14:invokestatic    #469 <Method String getSessionIdFromSessionFile(File)>
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
	//    1    1:invokevirtual   #753 <Method String File.getName()>
	//    2    4:iconst_0        
	//    3    5:bipush          35
	//    4    7:invokevirtual   #757 <Method String String.substring(int, int)>
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
	//*   5    6:icmple          84
		{
			Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
				Integer.valueOf(i)
			}));
	//    6    9:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    7   12:ldc2            #457 <String "CrashlyticsCore">
	//    8   15:getstatic       #765 <Field Locale Locale.US>
	//    9   18:ldc2            #767 <String "Trimming down to %d logged exceptions.">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:iload_3         
	//   15   28:invokestatic    #773 <Method Integer Integer.valueOf(int)>
	//   16   31:aastore         
	//   17   32:invokestatic    #777 <Method String String.format(Locale, String, Object[])>
	//   18   35:invokeinterface #465 <Method void Logger.d(String, String)>
			trimSessionEventFiles(s, i);
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:iload_3         
	//   22   43:invokespecial   #624 <Method void trimSessionEventFiles(String, int)>
			afile = ((File []) (new StringBuilder()));
	//   23   46:new             #471 <Class StringBuilder>
	//   24   49:dup             
	//   25   50:invokespecial   #472 <Method void StringBuilder()>
	//   26   53:astore_2        
			((StringBuilder) (afile)).append(s);
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			((StringBuilder) (afile)).append("SessionEvent");
	//   31   60:aload_2         
	//   32   61:ldc1            #194 <String "SessionEvent">
	//   33   63:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			afile1 = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (afile)).toString()))));
	//   35   67:aload_0         
	//   36   68:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   37   71:dup             
	//   38   72:aload_2         
	//   39   73:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   40   76:invokespecial   #778 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   41   79:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//   42   82:astore          4
		}
		return afile1;
	//   43   84:aload           4
	//   44   86:areturn         
	}

	private UserMetaData getUserMetaData(String s)
	{
		if(isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #783 <Method boolean isHandlingException()>
	//*   2    4:ifeq            36
			return new UserMetaData(crashlyticsCore.getUserIdentifier(), crashlyticsCore.getUserName(), crashlyticsCore.getUserEmail());
	//    3    7:new             #785 <Class UserMetaData>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    7   15:invokevirtual   #788 <Method String CrashlyticsCore.getUserIdentifier()>
	//    8   18:aload_0         
	//    9   19:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   10   22:invokevirtual   #791 <Method String CrashlyticsCore.getUserName()>
	//   11   25:aload_0         
	//   12   26:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   13   29:invokevirtual   #794 <Method String CrashlyticsCore.getUserEmail()>
	//   14   32:invokespecial   #797 <Method void UserMetaData(String, String, String)>
	//   15   35:areturn         
		else
			return (new MetaDataStore(getFilesDir())).readUserData(s);
	//   16   36:new             #660 <Class MetaDataStore>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokevirtual   #595 <Method File getFilesDir()>
	//   20   44:invokespecial   #663 <Method void MetaDataStore(File)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #800 <Method UserMetaData MetaDataStore.readUserData(String)>
	//   23   51:areturn         
	}

	private void gzip(byte abyte0[], File file)
		throws IOException
	{
		Exception exception = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		file = ((File) (new GZIPOutputStream(((java.io.OutputStream) (new FileOutputStream(file))))));
	//    2    2:new             #803 <Class GZIPOutputStream>
	//    3    5:dup             
	//    4    6:new             #805 <Class FileOutputStream>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #806 <Method void FileOutputStream(File)>
	//    8   14:invokespecial   #809 <Method void GZIPOutputStream(java.io.OutputStream)>
	//    9   17:astore_2        
		((GZIPOutputStream) (file)).write(abyte0);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #812 <Method void GZIPOutputStream.write(byte[])>
		((GZIPOutputStream) (file)).finish();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #815 <Method void GZIPOutputStream.finish()>
		CommonUtils.closeQuietly(((java.io.Closeable) (file)));
	//   15   27:aload_2         
	//   16   28:invokestatic    #819 <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		return;
	//   17   31:return          
		exception;
	//   18   32:astore_3        
		abyte0 = ((byte []) (file));
	//   19   33:aload_2         
	//   20   34:astore_1        
		file = ((File) (exception));
	//   21   35:aload_3         
	//   22   36:astore_2        
		break MISSING_BLOCK_LABEL_43;
	//   23   37:goto            43
		file;
	//   24   40:astore_2        
		abyte0 = ((byte []) (exception));
	//   25   41:aload_3         
	//   26   42:astore_1        
		CommonUtils.closeQuietly(((java.io.Closeable) (abyte0)));
	//   27   43:aload_1         
	//   28   44:invokestatic    #819 <Method void CommonUtils.closeQuietly(java.io.Closeable)>
		throw file;
	//   29   47:aload_2         
	//   30   48:athrow          
	}

	private void gzipIfNotEmpty(byte abyte0[], File file)
		throws IOException
	{
		if(abyte0 != null && abyte0.length > 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          15
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifle            15
			gzip(abyte0, file);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #821 <Method void gzip(byte[], File)>
	//    9   15:return          
	}

	private File[] listFiles(File file)
	{
		return ensureFileArrayNotNull(file.listFiles());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #825 <Method File[] File.listFiles()>
	//    3    5:invokespecial   #827 <Method File[] ensureFileArrayNotNull(File[])>
	//    4    8:areturn         
	}

	private File[] listFilesMatching(File file, FilenameFilter filenamefilter)
	{
		return ensureFileArrayNotNull(file.listFiles(filenamefilter));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #830 <Method File[] File.listFiles(FilenameFilter)>
	//    4    6:invokespecial   #827 <Method File[] ensureFileArrayNotNull(File[])>
	//    5    9:areturn         
	}

	private File[] listFilesMatching(FileFilter filefilter)
	{
		return ensureFileArrayNotNull(getFilesDir().listFiles(filefilter));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #595 <Method File getFilesDir()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #833 <Method File[] File.listFiles(FileFilter)>
	//    5    9:invokespecial   #827 <Method File[] ensureFileArrayNotNull(File[])>
	//    6   12:areturn         
	}

	private File[] listFilesMatching(FilenameFilter filenamefilter)
	{
		return listFilesMatching(getFilesDir(), filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #595 <Method File getFilesDir()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #835 <Method File[] listFilesMatching(File, FilenameFilter)>
	//    5    9:areturn         
	}

	private File[] listSessionPartFilesFor(String s)
	{
		return listFilesMatching(((FilenameFilter) (new SessionPartFileFilter(s))));
	//    0    0:aload_0         
	//    1    1:new             #101 <Class CrashlyticsController$SessionPartFileFilter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #836 <Method void CrashlyticsController$SessionPartFileFilter(String)>
	//    5    9:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//    6   12:areturn         
	}

	private File[] listSortedSessionBeginFiles()
	{
		File afile[] = listSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #839 <Method File[] listSessionBeginFiles()>
	//    2    4:astore_1        
		Arrays.sort(((Object []) (afile)), LARGEST_FILE_NAME_FIRST);
	//    3    5:aload_1         
	//    4    6:getstatic       #257 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #845 <Method void Arrays.sort(Object[], Comparator)>
		return afile;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	private byte[] readFile(String s, String s1)
	{
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #595 <Method File getFilesDir()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #471 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #472 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append(s);
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(s1);
	//   11   21:aload           4
	//   12   23:aload_2         
	//   13   24:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		return NativeFileUtils.readFile(new File(file, stringbuilder.toString()));
	//   15   28:new             #519 <Class File>
	//   16   31:dup             
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   20   38:invokespecial   #686 <Method void File(File, String)>
	//   21   41:invokestatic    #669 <Method byte[] NativeFileUtils.readFile(File)>
	//   22   44:areturn         
	}

	private static void recordFatalExceptionAnswersEvent(String s, String s1)
	{
		Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #847 <Class Answers>
	//    1    3:invokestatic    #851 <Method Kit Fabric.getKit(Class)>
	//    2    6:checkcast       #847 <Class Answers>
	//    3    9:astore_2        
		if(answers == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       29
		{
			Fabric.getLogger().d("CrashlyticsCore", "Answers is not available");
	//    6   14:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    7   17:ldc2            #457 <String "CrashlyticsCore">
	//    8   20:ldc2            #853 <String "Answers is not available">
	//    9   23:invokeinterface #465 <Method void Logger.d(String, String)>
			return;
	//   10   28:return          
		} else
		{
			answers.onException(new io.fabric.sdk.android.services.common.Crash.FatalException(s, s1));
	//   11   29:aload_2         
	//   12   30:new             #855 <Class io.fabric.sdk.android.services.common.Crash$FatalException>
	//   13   33:dup             
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #857 <Method void io.fabric.sdk.android.services.common.Crash$FatalException(String, String)>
	//   17   39:invokevirtual   #861 <Method void Answers.onException(io.fabric.sdk.android.services.common.Crash$FatalException)>
			return;
	//   18   42:return          
		}
	}

	private void recordFatalFirebaseEvent(long l)
	{
		if(firebaseCrashExists())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #863 <Method boolean firebaseCrashExists()>
	//*   2    4:ifeq            22
		{
			Fabric.getLogger().d("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
	//    3    7:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    4   10:ldc2            #457 <String "CrashlyticsCore">
	//    5   13:ldc2            #865 <String "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists">
	//    6   16:invokeinterface #465 <Method void Logger.d(String, String)>
			return;
	//    7   21:return          
		}
		if(firebaseAnalyticsLogger != null)
	//*   8   22:aload_0         
	//*   9   23:getfield        #322 <Field EventLogger firebaseAnalyticsLogger>
	//*  10   26:ifnull          87
		{
			Fabric.getLogger().d("CrashlyticsCore", "Logging Crashlytics event to Firebase");
	//   11   29:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   12   32:ldc2            #457 <String "CrashlyticsCore">
	//   13   35:ldc2            #867 <String "Logging Crashlytics event to Firebase">
	//   14   38:invokeinterface #465 <Method void Logger.d(String, String)>
			Bundle bundle = new Bundle();
	//   15   43:new             #869 <Class Bundle>
	//   16   46:dup             
	//   17   47:invokespecial   #870 <Method void Bundle()>
	//   18   50:astore_3        
			bundle.putInt("_r", 1);
	//   19   51:aload_3         
	//   20   52:ldc1            #134 <String "_r">
	//   21   54:iconst_1        
	//   22   55:invokevirtual   #873 <Method void Bundle.putInt(String, int)>
			bundle.putInt("fatal", 1);
	//   23   58:aload_3         
	//   24   59:ldc1            #130 <String "fatal">
	//   25   61:iconst_1        
	//   26   62:invokevirtual   #873 <Method void Bundle.putInt(String, int)>
			bundle.putLong("timestamp", l);
	//   27   65:aload_3         
	//   28   66:ldc1            #137 <String "timestamp">
	//   29   68:lload_1         
	//   30   69:invokevirtual   #877 <Method void Bundle.putLong(String, long)>
			firebaseAnalyticsLogger.logEvent("clx", "_ae", bundle);
	//   31   72:aload_0         
	//   32   73:getfield        #322 <Field EventLogger firebaseAnalyticsLogger>
	//   33   76:ldc1            #124 <String "clx">
	//   34   78:ldc1            #127 <String "_ae">
	//   35   80:aload_3         
	//   36   81:invokeinterface #883 <Method void EventLogger.logEvent(String, String, Bundle)>
			return;
	//   37   86:return          
		} else
		{
			Fabric.getLogger().d("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
	//   38   87:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   39   90:ldc2            #457 <String "CrashlyticsCore">
	//   40   93:ldc2            #885 <String "Skipping logging Crashlytics event to Firebase, no Firebase Analytics">
	//   41   96:invokeinterface #465 <Method void Logger.d(String, String)>
			return;
	//   42  101:return          
		}
	}

	private static void recordLoggedExceptionAnswersEvent(String s, String s1)
	{
		Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #847 <Class Answers>
	//    1    3:invokestatic    #851 <Method Kit Fabric.getKit(Class)>
	//    2    6:checkcast       #847 <Class Answers>
	//    3    9:astore_2        
		if(answers == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       29
		{
			Fabric.getLogger().d("CrashlyticsCore", "Answers is not available");
	//    6   14:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    7   17:ldc2            #457 <String "CrashlyticsCore">
	//    8   20:ldc2            #853 <String "Answers is not available">
	//    9   23:invokeinterface #465 <Method void Logger.d(String, String)>
			return;
	//   10   28:return          
		} else
		{
			answers.onException(new io.fabric.sdk.android.services.common.Crash.LoggedException(s, s1));
	//   11   29:aload_2         
	//   12   30:new             #887 <Class io.fabric.sdk.android.services.common.Crash$LoggedException>
	//   13   33:dup             
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #888 <Method void io.fabric.sdk.android.services.common.Crash$LoggedException(String, String)>
	//   17   39:invokevirtual   #891 <Method void Answers.onException(io.fabric.sdk.android.services.common.Crash$LoggedException)>
			return;
	//   18   42:return          
		}
	}

	private void recursiveDelete(File file)
	{
		if(file.isDirectory())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #894 <Method boolean File.isDirectory()>
	//*   2    4:ifeq            39
		{
			File afile[] = file.listFiles();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #825 <Method File[] File.listFiles()>
	//    5   11:astore          4
			int j = afile.length;
	//    6   13:aload           4
	//    7   15:arraylength     
	//    8   16:istore_3        
			for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iload_3         
	//*  13   21:icmpge          39
				recursiveDelete(afile[i]);
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:iload_2         
	//   17   28:aaload          
	//   18   29:invokespecial   #896 <Method void recursiveDelete(File)>

	//   19   32:iload_2         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_2        
		}
	//*  23   36:goto            19
		file.delete();
	//   24   39:aload_1         
	//   25   40:invokevirtual   #523 <Method boolean File.delete()>
	//   26   43:pop             
	//   27   44:return          
	}

	private void recursiveDelete(Set set)
	{
		for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext(); recursiveDelete((File)((Iterator) (set)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #902 <Method Iterator Set.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #907 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            32
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #911 <Method Object Iterator.next()>
	//    9   23:checkcast       #519 <Class File>
	//   10   26:invokespecial   #896 <Method void recursiveDelete(File)>
	//*  11   29:goto            7
	//   12   32:return          
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
	//*   7    9:icmpge          171
		{
			File file = afile[i];
	//    8   12:aload_1         
	//    9   13:iload_3         
	//   10   14:aaload          
	//   11   15:astore          5
			String s = file.getName();
	//   12   17:aload           5
	//   13   19:invokevirtual   #753 <Method String File.getName()>
	//   14   22:astore          6
			Object obj = ((Object) (SESSION_FILE_PATTERN.matcher(((CharSequence) (s)))));
	//   15   24:getstatic       #270 <Field Pattern SESSION_FILE_PATTERN>
	//   16   27:aload           6
	//   17   29:invokevirtual   #919 <Method Matcher Pattern.matcher(CharSequence)>
	//   18   32:astore          7
			if(!((Matcher) (obj)).matches())
	//*  19   34:aload           7
	//*  20   36:invokevirtual   #924 <Method boolean Matcher.matches()>
	//*  21   39:ifne            97
			{
				obj = ((Object) (Fabric.getLogger()));
	//   22   42:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   23   45:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   24   47:new             #471 <Class StringBuilder>
	//   25   50:dup             
	//   26   51:invokespecial   #472 <Method void StringBuilder()>
	//   27   54:astore          8
				stringbuilder.append("Deleting unknown file: ");
	//   28   56:aload           8
	//   29   58:ldc2            #926 <String "Deleting unknown file: ">
	//   30   61:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
				stringbuilder.append(s);
	//   32   65:aload           8
	//   33   67:aload           6
	//   34   69:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
				((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   36   73:aload           7
	//   37   75:ldc2            #457 <String "CrashlyticsCore">
	//   38   78:aload           8
	//   39   80:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   40   83:invokeinterface #465 <Method void Logger.d(String, String)>
				file.delete();
	//   41   88:aload           5
	//   42   90:invokevirtual   #523 <Method boolean File.delete()>
	//   43   93:pop             
				continue;
	//   44   94:goto            164
			}
			if(!set.contains(((Object) (((Matcher) (obj)).group(1)))))
	//*  45   97:aload_2         
	//*  46   98:aload           7
	//*  47  100:iconst_1        
	//*  48  101:invokevirtual   #929 <Method String Matcher.group(int)>
	//*  49  104:invokeinterface #933 <Method boolean Set.contains(Object)>
	//*  50  109:ifne            164
			{
				Logger logger = Fabric.getLogger();
	//   51  112:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   52  115:astore          7
				StringBuilder stringbuilder1 = new StringBuilder();
	//   53  117:new             #471 <Class StringBuilder>
	//   54  120:dup             
	//   55  121:invokespecial   #472 <Method void StringBuilder()>
	//   56  124:astore          8
				stringbuilder1.append("Trimming session file: ");
	//   57  126:aload           8
	//   58  128:ldc2            #935 <String "Trimming session file: ">
	//   59  131:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   60  134:pop             
				stringbuilder1.append(s);
	//   61  135:aload           8
	//   62  137:aload           6
	//   63  139:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   64  142:pop             
				logger.d("CrashlyticsCore", stringbuilder1.toString());
	//   65  143:aload           7
	//   66  145:ldc2            #457 <String "CrashlyticsCore">
	//   67  148:aload           8
	//   68  150:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   69  153:invokeinterface #465 <Method void Logger.d(String, String)>
				file.delete();
	//   70  158:aload           5
	//   71  160:invokevirtual   #523 <Method boolean File.delete()>
	//   72  163:pop             
			}
		}

	//   73  164:iload_3         
	//   74  165:iconst_1        
	//   75  166:iadd            
	//   76  167:istore_3        
	//*  77  168:goto            6
	//   78  171:return          
	}

	private void sendSessionReports(SettingsData settingsdata)
	{
		if(settingsdata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			Fabric.getLogger().w("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
	//    2    4:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    3    7:ldc2            #457 <String "CrashlyticsCore">
	//    4   10:ldc2            #938 <String "Cannot send reports. Settings are unavailable.">
	//    5   13:invokeinterface #720 <Method void Logger.w(String, String)>
			return;
	//    6   18:return          
		}
		Context context = crashlyticsCore.getContext();
	//    7   19:aload_0         
	//    8   20:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    9   23:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//   10   26:astore          4
		settingsdata = ((SettingsData) (getCreateReportSpiCall(settingsdata.appData.reportsUrl, settingsdata.appData.ndkReportsUrl)));
	//   11   28:aload_0         
	//   12   29:aload_1         
	//   13   30:getfield        #943 <Field AppSettingsData SettingsData.appData>
	//   14   33:getfield        #948 <Field String AppSettingsData.reportsUrl>
	//   15   36:aload_1         
	//   16   37:getfield        #943 <Field AppSettingsData SettingsData.appData>
	//   17   40:getfield        #951 <Field String AppSettingsData.ndkReportsUrl>
	//   18   43:invokespecial   #953 <Method CreateReportSpiCall getCreateReportSpiCall(String, String)>
	//   19   46:astore_1        
		settingsdata = ((SettingsData) (new ReportUploader(appData.apiKey, ((CreateReportSpiCall) (settingsdata)), reportFilesProvider, handlingExceptionCheck)));
	//   20   47:new             #955 <Class ReportUploader>
	//   21   50:dup             
	//   22   51:aload_0         
	//   23   52:getfield        #310 <Field AppData appData>
	//   24   55:getfield        #960 <Field String AppData.apiKey>
	//   25   58:aload_1         
	//   26   59:aload_0         
	//   27   60:getfield        #345 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   28   63:aload_0         
	//   29   64:getfield        #348 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
	//   30   67:invokespecial   #963 <Method void ReportUploader(String, CreateReportSpiCall, ReportUploader$ReportFilesProvider, ReportUploader$HandlingExceptionCheck)>
	//   31   70:astore_1        
		File afile[] = listCompleteSessionFiles();
	//   32   71:aload_0         
	//   33   72:invokevirtual   #966 <Method File[] listCompleteSessionFiles()>
	//   34   75:astore          5
		int j = afile.length;
	//   35   77:aload           5
	//   36   79:arraylength     
	//   37   80:istore_3        
		for(int i = 0; i < j; i++)
	//*  38   81:iconst_0        
	//*  39   82:istore_2        
	//*  40   83:iload_2         
	//*  41   84:iload_3         
	//*  42   85:icmpge          131
		{
			SessionReport sessionreport = new SessionReport(afile[i], SEND_AT_CRASHTIME_HEADER);
	//   43   88:new             #968 <Class SessionReport>
	//   44   91:dup             
	//   45   92:aload           5
	//   46   94:iload_2         
	//   47   95:aaload          
	//   48   96:getstatic       #282 <Field Map SEND_AT_CRASHTIME_HEADER>
	//   49   99:invokespecial   #971 <Method void SessionReport(File, Map)>
	//   50  102:astore          6
			backgroundWorker.submit(((Runnable) (new SendReportRunnable(context, ((Report) (sessionreport)), ((ReportUploader) (settingsdata))))));
	//   51  104:aload_0         
	//   52  105:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//   53  108:new             #98  <Class CrashlyticsController$SendReportRunnable>
	//   54  111:dup             
	//   55  112:aload           4
	//   56  114:aload           6
	//   57  116:aload_1         
	//   58  117:invokespecial   #974 <Method void CrashlyticsController$SendReportRunnable(Context, Report, ReportUploader)>
	//   59  120:invokevirtual   #980 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//   60  123:pop             
		}

	//   61  124:iload_2         
	//   62  125:iconst_1        
	//   63  126:iadd            
	//   64  127:istore_2        
	//*  65  128:goto            83
	//   66  131:return          
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
	//*   9   11:getfield        #984 <Field FeaturesSettingsData SettingsData.featuresData>
	//*  10   14:getfield        #989 <Field boolean FeaturesSettingsData.promptEnabled>
	//*  11   17:ifeq            34
		{
			flag = flag1;
	//   12   20:iload_3         
	//   13   21:istore_2        
			if(!preferenceManager.shouldAlwaysSendReports())
	//*  14   22:aload_0         
	//*  15   23:getfield        #306 <Field PreferenceManager preferenceManager>
	//*  16   26:invokevirtual   #994 <Method boolean PreferenceManager.shouldAlwaysSendReports()>
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
	//   10   20:invokevirtual   #999 <Method File getFatalSessionFilesDir()>
	//   11   23:astore          6
		else
	//*  12   25:goto            34
			obj = ((Object) (getNonFatalSessionFilesDir()));
	//   13   28:aload_0         
	//   14   29:invokevirtual   #1002 <Method File getNonFatalSessionFilesDir()>
	//   15   32:astore          6
		if(!((File) (obj)).exists())
	//*  16   34:aload           6
	//*  17   36:invokevirtual   #1005 <Method boolean File.exists()>
	//*  18   39:ifne            48
			((File) (obj)).mkdirs();
	//   19   42:aload           6
	//   20   44:invokevirtual   #1008 <Method boolean File.mkdirs()>
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
	//   30   60:new             #489 <Class ClsFileOutputStream>
	//   31   63:dup             
	//   32   64:aload           6
	//   33   66:aload_2         
	//   34   67:invokespecial   #598 <Method void ClsFileOutputStream(File, String)>
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
	//   43   86:invokestatic    #602 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   44   89:astore          10
		}
	//*  45   91:aload           10
	//*  46   93:astore          8
	//*  47   95:aload           10
	//*  48   97:astore          6
	//*  49   99:aload           9
	//*  50  101:astore          7
	//*  51  103:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//*  52  106:astore          11
	//*  53  108:aload           10
	//*  54  110:astore          8
	//*  55  112:aload           10
	//*  56  114:astore          6
	//*  57  116:aload           9
	//*  58  118:astore          7
	//*  59  120:new             #471 <Class StringBuilder>
	//*  60  123:dup             
	//*  61  124:invokespecial   #472 <Method void StringBuilder()>
	//*  62  127:astore          12
	//*  63  129:aload           10
	//*  64  131:astore          8
	//*  65  133:aload           10
	//*  66  135:astore          6
	//*  67  137:aload           9
	//*  68  139:astore          7
	//*  69  141:aload           12
	//*  70  143:ldc2            #1010 <String "Collecting SessionStart data for session ID ">
	//*  71  146:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//*  72  149:pop             
	//*  73  150:aload           10
	//*  74  152:astore          8
	//*  75  154:aload           10
	//*  76  156:astore          6
	//*  77  158:aload           9
	//*  78  160:astore          7
	//*  79  162:aload           12
	//*  80  164:aload_2         
	//*  81  165:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//*  82  168:pop             
	//*  83  169:aload           10
	//*  84  171:astore          8
	//*  85  173:aload           10
	//*  86  175:astore          6
	//*  87  177:aload           9
	//*  88  179:astore          7
	//*  89  181:aload           11
	//*  90  183:ldc2            #457 <String "CrashlyticsCore">
	//*  91  186:aload           12
	//*  92  188:invokevirtual   #481 <Method String StringBuilder.toString()>
	//*  93  191:invokeinterface #465 <Method void Logger.d(String, String)>
	//*  94  196:aload           10
	//*  95  198:astore          8
	//*  96  200:aload           10
	//*  97  202:astore          6
	//*  98  204:aload           9
	//*  99  206:astore          7
	//* 100  208:aload           10
	//* 101  210:aload_1         
	//* 102  211:invokestatic    #1014 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//* 103  214:aload           10
	//* 104  216:astore          8
	//* 105  218:aload           10
	//* 106  220:astore          6
	//* 107  222:aload           9
	//* 108  224:astore          7
	//* 109  226:aload           10
	//* 110  228:iconst_4        
	//* 111  229:new             #532 <Class Date>
	//* 112  232:dup             
	//* 113  233:invokespecial   #533 <Method void Date()>
	//* 114  236:invokevirtual   #1018 <Method long Date.getTime()>
	//* 115  239:ldc2w           #1019 <Long 1000L>
	//* 116  242:ldiv            
	//* 117  243:invokevirtual   #1024 <Method void CodedOutputStream.writeUInt64(int, long)>
	//* 118  246:aload           10
	//* 119  248:astore          8
	//* 120  250:aload           10
	//* 121  252:astore          6
	//* 122  254:aload           9
	//* 123  256:astore          7
	//* 124  258:aload           10
	//* 125  260:iconst_5        
	//* 126  261:iload           5
	//* 127  263:invokevirtual   #1028 <Method void CodedOutputStream.writeBool(int, boolean)>
	//* 128  266:aload           10
	//* 129  268:astore          8
	//* 130  270:aload           10
	//* 131  272:astore          6
	//* 132  274:aload           9
	//* 133  276:astore          7
	//* 134  278:aload           10
	//* 135  280:bipush          11
	//* 136  282:iconst_1        
	//* 137  283:invokevirtual   #1032 <Method void CodedOutputStream.writeUInt32(int, int)>
	//* 138  286:aload           10
	//* 139  288:astore          8
	//* 140  290:aload           10
	//* 141  292:astore          6
	//* 142  294:aload           9
	//* 143  296:astore          7
	//* 144  298:aload           10
	//* 145  300:bipush          12
	//* 146  302:iconst_3        
	//* 147  303:invokevirtual   #1035 <Method void CodedOutputStream.writeEnum(int, int)>
	//* 148  306:aload           10
	//* 149  308:astore          8
	//* 150  310:aload           10
	//* 151  312:astore          6
	//* 152  314:aload           9
	//* 153  316:astore          7
	//* 154  318:aload_0         
	//* 155  319:aload           10
	//* 156  321:aload_2         
	//* 157  322:invokespecial   #1039 <Method void writeInitialPartsTo(CodedOutputStream, String)>
	//* 158  325:aload           10
	//* 159  327:astore          8
	//* 160  329:aload           10
	//* 161  331:astore          6
	//* 162  333:aload           9
	//* 163  335:astore          7
	//* 164  337:aload           10
	//* 165  339:aload_3         
	//* 166  340:aload_2         
	//* 167  341:invokestatic    #1043 <Method void writeNonFatalEventsTo(CodedOutputStream, File[], String)>
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
	//* 178  365:invokestatic    #1014 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//* 179  368:aload           10
	//* 180  370:ldc2            #1045 <String "Error flushing session file stream">
	//* 181  373:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//* 182  376:aload           9
	//* 183  378:ldc2            #1047 <String "Failed to close CLS file">
	//* 184  381:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
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
	//  205  415:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  206  418:astore          4
		obj = ((Object) (codedoutputstream));
	//  207  420:aload           8
	//  208  422:astore          6
		obj1 = ((Object) (file));
	//  209  424:aload_1         
	//  210  425:astore          7
		obj2 = ((Object) (new StringBuilder()));
	//  211  427:new             #471 <Class StringBuilder>
	//  212  430:dup             
	//  213  431:invokespecial   #472 <Method void StringBuilder()>
	//  214  434:astore          9
		obj = ((Object) (codedoutputstream));
	//  215  436:aload           8
	//  216  438:astore          6
		obj1 = ((Object) (file));
	//  217  440:aload_1         
	//  218  441:astore          7
		((StringBuilder) (obj2)).append("Failed to write session file for session ID: ");
	//  219  443:aload           9
	//  220  445:ldc2            #1049 <String "Failed to write session file for session ID: ">
	//  221  448:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
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
	//  229  462:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  230  465:pop             
		obj = ((Object) (codedoutputstream));
	//  231  466:aload           8
	//  232  468:astore          6
		obj1 = ((Object) (file));
	//  233  470:aload_1         
	//  234  471:astore          7
		((Logger) (file1)).e("CrashlyticsCore", ((StringBuilder) (obj2)).toString(), ((Throwable) (afile)));
	//  235  473:aload           4
	//  236  475:ldc2            #457 <String "CrashlyticsCore">
	//  237  478:aload           9
	//  238  480:invokevirtual   #481 <Method String StringBuilder.toString()>
	//  239  483:aload_3         
	//  240  484:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Error flushing session file stream");
	//  241  489:aload           8
	//  242  491:ldc2            #1045 <String "Error flushing session file stream">
	//  243  494:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		closeWithoutRenamingOrLog(((ClsFileOutputStream) (file)));
	//  244  497:aload_0         
	//  245  498:aload_1         
	//  246  499:invokespecial   #1051 <Method void closeWithoutRenamingOrLog(ClsFileOutputStream)>
		return;
	//  247  502:return          
		file;
	//  248  503:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Error flushing session file stream");
	//  249  504:aload           6
	//  250  506:ldc2            #1045 <String "Error flushing session file stream">
	//  251  509:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close CLS file");
	//  252  512:aload           7
	//  253  514:ldc2            #1047 <String "Failed to close CLS file">
	//  254  517:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//  255  520:aload_1         
	//  256  521:athrow          
	}

	private void trimInvalidSessionFiles()
	{
		File file = getInvalidFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1055 <Method File getInvalidFilesDir()>
	//    2    4:astore_2        
		if(!file.exists())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #1005 <Method boolean File.exists()>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		File afile[] = listFilesMatching(file, ((FilenameFilter) (new InvalidPartFileFilter())));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:new             #79  <Class CrashlyticsController$InvalidPartFileFilter>
	//   10   18:dup             
	//   11   19:invokespecial   #1056 <Method void CrashlyticsController$InvalidPartFileFilter()>
	//   12   22:invokespecial   #835 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   13   25:astore_3        
		Arrays.sort(((Object []) (afile)), Collections.reverseOrder());
	//   14   26:aload_3         
	//   15   27:invokestatic    #1060 <Method Comparator Collections.reverseOrder()>
	//   16   30:invokestatic    #845 <Method void Arrays.sort(Object[], Comparator)>
		HashSet hashset = new HashSet();
	//   17   33:new             #1062 <Class HashSet>
	//   18   36:dup             
	//   19   37:invokespecial   #1063 <Method void HashSet()>
	//   20   40:astore          4
		for(int i = 0; i < afile.length && ((Set) (hashset)).size() < 4; i++)
	//*  21   42:iconst_0        
	//*  22   43:istore_1        
	//*  23   44:iload_1         
	//*  24   45:aload_3         
	//*  25   46:arraylength     
	//*  26   47:icmpge          82
	//*  27   50:aload           4
	//*  28   52:invokeinterface #1066 <Method int Set.size()>
	//*  29   57:iconst_4        
	//*  30   58:icmpge          82
			((Set) (hashset)).add(((Object) (getSessionIdFromSessionFile(afile[i]))));
	//   31   61:aload           4
	//   32   63:aload_3         
	//   33   64:iload_1         
	//   34   65:aaload          
	//   35   66:invokestatic    #469 <Method String getSessionIdFromSessionFile(File)>
	//   36   69:invokeinterface #1069 <Method boolean Set.add(Object)>
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
	//   46   85:invokespecial   #1071 <Method File[] listFiles(File)>
	//   47   88:aload           4
	//   48   90:invokespecial   #1073 <Method void retainSessions(File[], Set)>
	//   49   93:return          
	}

	private void trimOpenSessions(int i)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #1062 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #1063 <Method void HashSet()>
	//    3    7:astore_3        
		File afile[] = listSortedSessionBeginFiles();
	//    4    8:aload_0         
	//    5    9:invokespecial   #752 <Method File[] listSortedSessionBeginFiles()>
	//    6   12:astore          4
		int j = Math.min(i, afile.length);
	//    7   14:iload_1         
	//    8   15:aload           4
	//    9   17:arraylength     
	//   10   18:invokestatic    #1080 <Method int Math.min(int, int)>
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
	//   21   34:invokestatic    #469 <Method String getSessionIdFromSessionFile(File)>
	//   22   37:invokeinterface #1069 <Method boolean Set.add(Object)>
	//   23   42:pop             

	//   24   43:iload_1         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_1        
	//*  28   47:goto            24
		logFileManager.discardOldLogFiles(((Set) (hashset)));
	//   29   50:aload_0         
	//   30   51:getfield        #340 <Field LogFileManager logFileManager>
	//   31   54:aload_3         
	//   32   55:invokevirtual   #1083 <Method void LogFileManager.discardOldLogFiles(Set)>
		retainSessions(listFilesMatching(((FilenameFilter) (new AnySessionPartFileFilter()))), ((Set) (hashset)));
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:new             #64  <Class CrashlyticsController$AnySessionPartFileFilter>
	//   36   63:dup             
	//   37   64:aconst_null     
	//   38   65:invokespecial   #1086 <Method void CrashlyticsController$AnySessionPartFileFilter(CrashlyticsController$1)>
	//   39   68:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//   40   71:aload_3         
	//   41   72:invokespecial   #1073 <Method void retainSessions(File[], Set)>
	//   42   75:return          
	}

	private void trimSessionEventFiles(String s, int i)
	{
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #595 <Method File getFilesDir()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #471 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #472 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append(s);
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append("SessionEvent");
	//   11   21:aload           4
	//   12   23:ldc1            #194 <String "SessionEvent">
	//   13   25:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		Utils.capFileCount(file, ((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))), i, SMALLEST_FILE_NAME_FIRST);
	//   15   29:aload_3         
	//   16   30:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   17   33:dup             
	//   18   34:aload           4
	//   19   36:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   20   39:invokespecial   #778 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   21   42:iload_2         
	//   22   43:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   23   46:invokestatic    #1092 <Method int Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   24   49:pop             
	//   25   50:return          
	}

	private void writeBeginSession(final String sessionId, Date date)
		throws Exception
	{
		final String generator = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
			crashlyticsCore.getVersion()
		});
	//    0    0:getstatic       #765 <Field Locale Locale.US>
	//    1    3:ldc1            #140 <String "Crashlytics Android SDK/%s">
	//    2    5:iconst_1        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    8   15:invokevirtual   #1095 <Method String CrashlyticsCore.getVersion()>
	//    9   18:aastore         
	//   10   19:invokestatic    #777 <Method String String.format(Locale, String, Object[])>
	//   11   22:astore          5
		final long startedAtSeconds = date.getTime() / 1000L;
	//   12   24:aload_2         
	//   13   25:invokevirtual   #1018 <Method long Date.getTime()>
	//   14   28:ldc2w           #1019 <Long 1000L>
	//   15   31:ldiv            
	//   16   32:lstore_3        
		writeSessionPartFile(sessionId, "BeginSession", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
				throws Exception
			{
				SessionProtobufHelper.writeBeginSession(codedoutputstream, sessionId, generator, startedAtSeconds);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #24  <Field String val$sessionId>
			//    3    5:aload_0         
			//    4    6:getfield        #26  <Field String val$generator>
			//    5    9:aload_0         
			//    6   10:getfield        #28  <Field long val$startedAtSeconds>
			//    7   13:invokestatic    #41  <Method void SessionProtobufHelper.writeBeginSession(CodedOutputStream, String, String, long)>
			//    8   16:return          
			}

			final CrashlyticsController this$0;
			final String val$generator;
			final String val$sessionId;
			final long val$startedAtSeconds;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CrashlyticsController this$0>
				sessionId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$sessionId>
				generator = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String val$generator>
				startedAtSeconds = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #28  <Field long val$startedAtSeconds>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:ldc1            #172 <String "BeginSession">
	//   20   37:new             #22  <Class CrashlyticsController$17>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:aload_1         
	//   24   43:aload           5
	//   25   45:lload_3         
	//   26   46:invokespecial   #1098 <Method void CrashlyticsController$17(CrashlyticsController, String, String, long)>
	//   27   49:invokespecial   #1102 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(sessionId, "BeginSession.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
				throws Exception
			{
				fileoutputstream.write((new JSONObject(((Map) (new HashMap() {

					final _cls18 this$1;

			
			{
				this$1 = _cls18.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CrashlyticsController$18 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HashMap()>
				put("session_id", ((Object) (sessionId)));
			//    5    9:aload_0         
			//    6   10:ldc1            #21  <String "session_id">
			//    7   12:aload_0         
			//    8   13:getfield        #16  <Field CrashlyticsController$18 this$1>
			//    9   16:getfield        #25  <Field String CrashlyticsController$18.val$sessionId>
			//   10   19:invokevirtual   #29  <Method Object put(Object, Object)>
			//   11   22:pop             
				put("generator", ((Object) (generator)));
			//   12   23:aload_0         
			//   13   24:ldc1            #31  <String "generator">
			//   14   26:aload_0         
			//   15   27:getfield        #16  <Field CrashlyticsController$18 this$1>
			//   16   30:getfield        #34  <Field String CrashlyticsController$18.val$generator>
			//   17   33:invokevirtual   #29  <Method Object put(Object, Object)>
			//   18   36:pop             
				put("started_at_seconds", ((Object) (Long.valueOf(startedAtSeconds))));
			//   19   37:aload_0         
			//   20   38:ldc1            #36  <String "started_at_seconds">
			//   21   40:aload_0         
			//   22   41:getfield        #16  <Field CrashlyticsController$18 this$1>
			//   23   44:getfield        #40  <Field long CrashlyticsController$18.val$startedAtSeconds>
			//   24   47:invokestatic    #46  <Method Long Long.valueOf(long)>
			//   25   50:invokevirtual   #29  <Method Object put(Object, Object)>
			//   26   53:pop             
			//   27   54:return          
			}
				}
)))).toString().getBytes());
			//    0    0:aload_1         
			//    1    1:new             #40  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$18$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #43  <Method void CrashlyticsController$18$1(CrashlyticsController$18)>
			//    7   13:invokespecial   #46  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #50  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #56  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #62  <Method void FileOutputStream.write(byte[])>
			//   11   25:return          
			}

			final CrashlyticsController this$0;
			final String val$generator;
			final String val$sessionId;
			final long val$startedAtSeconds;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CrashlyticsController this$0>
				sessionId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$sessionId>
				generator = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$generator>
				startedAtSeconds = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #30  <Field long val$startedAtSeconds>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   28   52:aload_0         
	//   29   53:aload_1         
	//   30   54:ldc2            #648 <String "BeginSession.json">
	//   31   57:new             #24  <Class CrashlyticsController$18>
	//   32   60:dup             
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:aload           5
	//   36   65:lload_3         
	//   37   66:invokespecial   #1103 <Method void CrashlyticsController$18(CrashlyticsController, String, String, long)>
	//   38   69:invokespecial   #1107 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   39   72:return          
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
	//    9   13:invokespecial   #382 <Method String getCurrentSessionId()>
	//   10   16:astore          5
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_53;
	//   11   18:aload           5
	//   12   20:ifnonnull       53
		Fabric.getLogger().e("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", ((Throwable) (null)));
	//   13   23:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   14   26:ldc2            #457 <String "CrashlyticsCore">
	//   15   29:ldc2            #1109 <String "Tried to write a fatal exception while no session was open.">
	//   16   32:aconst_null     
	//   17   33:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   18   38:aconst_null     
	//   19   39:ldc2            #1111 <String "Failed to flush to session begin file.">
	//   20   42:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   21   45:aconst_null     
	//   22   46:ldc2            #1113 <String "Failed to close fatal exception file output stream.">
	//   23   49:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   24   52:return          
		recordFatalExceptionAnswersEvent(((String) (obj1)), ((Object) (throwable)).getClass().getName());
	//   25   53:aload           5
	//   26   55:aload_3         
	//   27   56:invokevirtual   #563 <Method Class Object.getClass()>
	//   28   59:invokevirtual   #568 <Method String Class.getName()>
	//   29   62:invokestatic    #646 <Method void recordFatalExceptionAnswersEvent(String, String)>
		File file = getFilesDir();
	//   30   65:aload_0         
	//   31   66:invokevirtual   #595 <Method File getFilesDir()>
	//   32   69:astore          9
		StringBuilder stringbuilder = new StringBuilder();
	//   33   71:new             #471 <Class StringBuilder>
	//   34   74:dup             
	//   35   75:invokespecial   #472 <Method void StringBuilder()>
	//   36   78:astore          10
		stringbuilder.append(((String) (obj1)));
	//   37   80:aload           10
	//   38   82:aload           5
	//   39   84:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   40   87:pop             
		stringbuilder.append("SessionCrash");
	//   41   88:aload           10
	//   42   90:ldc1            #183 <String "SessionCrash">
	//   43   92:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   44   95:pop             
		obj1 = ((Object) (new ClsFileOutputStream(file, stringbuilder.toString())));
	//   45   96:new             #489 <Class ClsFileOutputStream>
	//   46   99:dup             
	//   47  100:aload           9
	//   48  102:aload           10
	//   49  104:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   50  107:invokespecial   #598 <Method void ClsFileOutputStream(File, String)>
	//   51  110:astore          5
		obj = ((Object) (obj3));
	//   52  112:aload           8
	//   53  114:astore          4
		obj2 = obj1;
	//   54  116:aload           5
	//   55  118:astore          6
		CodedOutputStream codedoutputstream1;
		try
		{
			codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)));
	//   56  120:aload           5
	//   57  122:invokestatic    #602 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   58  125:astore          8
		}
	//*  59  127:aload           8
	//*  60  129:astore          7
	//*  61  131:aload           8
	//*  62  133:astore          4
	//*  63  135:aload           5
	//*  64  137:astore          6
	//*  65  139:aload_0         
	//*  66  140:aload           8
	//*  67  142:aload_1         
	//*  68  143:aload_2         
	//*  69  144:aload_3         
	//*  70  145:ldc1            #115 <String "crash">
	//*  71  147:iconst_1        
	//*  72  148:invokespecial   #606 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
	//*  73  151:aload           8
	//*  74  153:astore_1        
	//*  75  154:aload           5
	//*  76  156:astore_2        
	//*  77  157:goto            210
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
	//*  78  160:astore_3        
		{
			date = ((Date) (codedoutputstream));
	//   79  161:aload           7
	//   80  163:astore_1        
			thread = ((Thread) (obj1));
	//   81  164:aload           5
	//   82  166:astore_2        
			break MISSING_BLOCK_LABEL_189;
	//   83  167:goto            189
		}
		codedoutputstream = codedoutputstream1;
		obj = ((Object) (codedoutputstream1));
		obj2 = obj1;
		writeSessionEvent(codedoutputstream1, date, thread, throwable, "crash", true);
		date = ((Date) (codedoutputstream1));
		thread = ((Thread) (obj1));
		break MISSING_BLOCK_LABEL_210;
		date;
	//   84  170:astore_1        
		thread = null;
	//   85  171:aconst_null     
	//   86  172:astore_2        
		obj = obj2;
	//   87  173:aload           6
	//   88  175:astore          4
		obj2 = ((Object) (thread));
	//   89  177:aload_2         
	//   90  178:astore          6
		break MISSING_BLOCK_LABEL_226;
	//   91  180:goto            226
		throwable;
	//   92  183:astore_3        
		thread = null;
	//   93  184:aconst_null     
	//   94  185:astore_2        
		date = ((Date) (obj));
	//   95  186:aload           4
	//   96  188:astore_1        
		obj = ((Object) (date));
	//   97  189:aload_1         
	//   98  190:astore          4
		obj2 = ((Object) (thread));
	//   99  192:aload_2         
	//  100  193:astore          6
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the fatal exception logger", throwable);
	//  101  195:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  102  198:ldc2            #457 <String "CrashlyticsCore">
	//  103  201:ldc2            #1115 <String "An error occurred in the fatal exception logger">
	//  104  204:aload_3         
	//  105  205:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to session begin file.");
	//  106  210:aload_1         
	//  107  211:ldc2            #1111 <String "Failed to flush to session begin file.">
	//  108  214:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (thread)), "Failed to close fatal exception file output stream.");
	//  109  217:aload_2         
	//  110  218:ldc2            #1113 <String "Failed to close fatal exception file output stream.">
	//  111  221:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  112  224:return          
		date;
	//  113  225:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
	//  114  226:aload           4
	//  115  228:ldc2            #1111 <String "Failed to flush to session begin file.">
	//  116  231:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close fatal exception file output stream.");
	//  117  234:aload           6
	//  118  236:ldc2            #1113 <String "Failed to close fatal exception file output stream.">
	//  119  239:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw date;
	//  120  242:aload_1         
	//  121  243:athrow          
	}

	private void writeFile(String s, String s1, FileOutputStreamWriteAction fileoutputstreamwriteaction)
		throws Exception
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		File file = getFilesDir();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #595 <Method File getFilesDir()>
	//    4    7:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//    5    9:new             #471 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #472 <Method void StringBuilder()>
	//    8   16:astore          6
		stringbuilder1.append(s);
	//    9   18:aload           6
	//   10   20:aload_1         
	//   11   21:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder1.append(s1);
	//   13   25:aload           6
	//   14   27:aload_2         
	//   15   28:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		s = ((String) (new FileOutputStream(new File(file, stringbuilder1.toString()))));
	//   17   32:new             #805 <Class FileOutputStream>
	//   18   35:dup             
	//   19   36:new             #519 <Class File>
	//   20   39:dup             
	//   21   40:aload           5
	//   22   42:aload           6
	//   23   44:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   24   47:invokespecial   #686 <Method void File(File, String)>
	//   25   50:invokespecial   #806 <Method void FileOutputStream(File)>
	//   26   53:astore_1        
		fileoutputstreamwriteaction.writeTo(((FileOutputStream) (s)));
	//   27   54:aload_3         
	//   28   55:aload_1         
	//   29   56:invokeinterface #1119 <Method void CrashlyticsController$FileOutputStreamWriteAction.writeTo(FileOutputStream)>
		fileoutputstreamwriteaction = ((FileOutputStreamWriteAction) (new StringBuilder()));
	//   30   61:new             #471 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #472 <Method void StringBuilder()>
	//   33   68:astore_3        
		((StringBuilder) (fileoutputstreamwriteaction)).append("Failed to close ");
	//   34   69:aload_3         
	//   35   70:ldc2            #1121 <String "Failed to close ">
	//   36   73:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
		((StringBuilder) (fileoutputstreamwriteaction)).append(s1);
	//   38   77:aload_3         
	//   39   78:aload_2         
	//   40   79:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
		((StringBuilder) (fileoutputstreamwriteaction)).append(" file.");
	//   42   83:aload_3         
	//   43   84:ldc2            #1123 <String " file.">
	//   44   87:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), ((StringBuilder) (fileoutputstreamwriteaction)).toString());
	//   46   91:aload_1         
	//   47   92:aload_3         
	//   48   93:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   49   96:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   50   99:return          
		fileoutputstreamwriteaction;
	//   51  100:astore_3        
		break MISSING_BLOCK_LABEL_108;
	//   52  101:goto            108
		fileoutputstreamwriteaction;
	//   53  104:astore_3        
		s = ((String) (obj));
	//   54  105:aload           4
	//   55  107:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   56  108:new             #471 <Class StringBuilder>
	//   57  111:dup             
	//   58  112:invokespecial   #472 <Method void StringBuilder()>
	//   59  115:astore          4
		stringbuilder.append("Failed to close ");
	//   60  117:aload           4
	//   61  119:ldc2            #1121 <String "Failed to close ">
	//   62  122:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   63  125:pop             
		stringbuilder.append(s1);
	//   64  126:aload           4
	//   65  128:aload_2         
	//   66  129:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   67  132:pop             
		stringbuilder.append(" file.");
	//   68  133:aload           4
	//   69  135:ldc2            #1123 <String " file.">
	//   70  138:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   71  141:pop             
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), stringbuilder.toString());
	//   72  142:aload_1         
	//   73  143:aload           4
	//   74  145:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   75  148:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw fileoutputstreamwriteaction;
	//   76  151:aload_3         
	//   77  152:athrow          
	}

	private void writeInitialPartsTo(CodedOutputStream codedoutputstream, String s)
		throws IOException
	{
		String as[] = INITIAL_SESSION_PART_TAGS;
	//    0    0:getstatic       #286 <Field String[] INITIAL_SESSION_PART_TAGS>
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
	//*   9   15:icmpge          224
		{
			String s1 = as[i];
	//   10   18:aload           5
	//   11   20:iload_3         
	//   12   21:aaload          
	//   13   22:astore          6
			Object obj = ((Object) (new StringBuilder()));
	//   14   24:new             #471 <Class StringBuilder>
	//   15   27:dup             
	//   16   28:invokespecial   #472 <Method void StringBuilder()>
	//   17   31:astore          7
			((StringBuilder) (obj)).append(s);
	//   18   33:aload           7
	//   19   35:aload_2         
	//   20   36:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			((StringBuilder) (obj)).append(s1);
	//   22   40:aload           7
	//   23   42:aload           6
	//   24   44:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			((StringBuilder) (obj)).append(".cls");
	//   26   48:aload           7
	//   27   50:ldc2            #1125 <String ".cls">
	//   28   53:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   30   57:aload_0         
	//   31   58:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   32   61:dup             
	//   33   62:aload           7
	//   34   64:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   35   67:invokespecial   #778 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   36   70:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//   37   73:astore          7
			if(obj.length == 0)
	//*  38   75:aload           7
	//*  39   77:arraylength     
	//*  40   78:ifne            147
			{
				obj = ((Object) (Fabric.getLogger()));
	//   41   81:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   42   84:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   43   86:new             #471 <Class StringBuilder>
	//   44   89:dup             
	//   45   90:invokespecial   #472 <Method void StringBuilder()>
	//   46   93:astore          8
				stringbuilder.append("Can't find ");
	//   47   95:aload           8
	//   48   97:ldc2            #1127 <String "Can't find ">
	//   49  100:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
				stringbuilder.append(s1);
	//   51  104:aload           8
	//   52  106:aload           6
	//   53  108:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:pop             
				stringbuilder.append(" data for session ID ");
	//   55  112:aload           8
	//   56  114:ldc2            #1129 <String " data for session ID ">
	//   57  117:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
				stringbuilder.append(s);
	//   59  121:aload           8
	//   60  123:aload_2         
	//   61  124:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   62  127:pop             
				((Logger) (obj)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   63  128:aload           7
	//   64  130:ldc2            #457 <String "CrashlyticsCore">
	//   65  133:aload           8
	//   66  135:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   67  138:aconst_null     
	//   68  139:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
			} else
	//*  69  144:goto            217
			{
				Logger logger = Fabric.getLogger();
	//   70  147:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   71  150:astore          8
				StringBuilder stringbuilder1 = new StringBuilder();
	//   72  152:new             #471 <Class StringBuilder>
	//   73  155:dup             
	//   74  156:invokespecial   #472 <Method void StringBuilder()>
	//   75  159:astore          9
				stringbuilder1.append("Collecting ");
	//   76  161:aload           9
	//   77  163:ldc2            #1131 <String "Collecting ">
	//   78  166:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   79  169:pop             
				stringbuilder1.append(s1);
	//   80  170:aload           9
	//   81  172:aload           6
	//   82  174:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   83  177:pop             
				stringbuilder1.append(" data for session ID ");
	//   84  178:aload           9
	//   85  180:ldc2            #1129 <String " data for session ID ">
	//   86  183:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   87  186:pop             
				stringbuilder1.append(s);
	//   88  187:aload           9
	//   89  189:aload_2         
	//   90  190:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   91  193:pop             
				logger.d("CrashlyticsCore", stringbuilder1.toString());
	//   92  194:aload           8
	//   93  196:ldc2            #457 <String "CrashlyticsCore">
	//   94  199:aload           9
	//   95  201:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   96  204:invokeinterface #465 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, ((File) (obj[0])));
	//   97  209:aload_1         
	//   98  210:aload           7
	//   99  212:iconst_0        
	//  100  213:aaload          
	//  101  214:invokestatic    #1014 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
		}

	//  102  217:iload_3         
	//  103  218:iconst_1        
	//  104  219:iadd            
	//  105  220:istore_3        
	//* 106  221:goto            12
	//  107  224:return          
	}

	private static void writeNonFatalEventsTo(CodedOutputStream codedoutputstream, File afile[], String s)
	{
		Arrays.sort(((Object []) (afile)), CommonUtils.FILE_MODIFIED_COMPARATOR);
	//    0    0:aload_1         
	//    1    1:getstatic       #1134 <Field Comparator CommonUtils.FILE_MODIFIED_COMPARATOR>
	//    2    4:invokestatic    #845 <Method void Arrays.sort(Object[], Comparator)>
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
	//   15   24:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   16   27:ldc2            #457 <String "CrashlyticsCore">
	//   17   30:getstatic       #765 <Field Locale Locale.US>
	//   18   33:ldc2            #1136 <String "Found Non Fatal for session ID %s in %s ">
	//   19   36:iconst_2        
	//   20   37:anewarray       Object[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:aload_2         
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_1        
	//   27   46:aload           5
	//   28   48:invokevirtual   #753 <Method String File.getName()>
	//   29   51:aastore         
	//   30   52:invokestatic    #777 <Method String String.format(Locale, String, Object[])>
	//   31   55:invokeinterface #465 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, file);
	//   32   60:aload_0         
	//   33   61:aload           5
	//   34   63:invokestatic    #1014 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
	//*  35   66:goto            87
			catch(Exception exception)
	//*  36   69:astore          5
			{
				Fabric.getLogger().e("CrashlyticsCore", "Error writting non-fatal to session.", ((Throwable) (exception)));
	//   37   71:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   38   74:ldc2            #457 <String "CrashlyticsCore">
	//   39   77:ldc2            #1138 <String "Error writting non-fatal to session.">
	//   40   80:aload           5
	//   41   82:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
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
		final String appIdentifier = idManager.getAppIdentifier();
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field IdManager idManager>
	//    2    4:invokevirtual   #1143 <Method String IdManager.getAppIdentifier()>
	//    3    7:astore_3        
		final String versionCode = appData.versionCode;
	//    4    8:aload_0         
	//    5    9:getfield        #310 <Field AppData appData>
	//    6   12:getfield        #1146 <Field String AppData.versionCode>
	//    7   15:astore          4
		final String versionName = appData.versionName;
	//    8   17:aload_0         
	//    9   18:getfield        #310 <Field AppData appData>
	//   10   21:getfield        #1149 <Field String AppData.versionName>
	//   11   24:astore          5
		final String installUuid = idManager.getAppInstallIdentifier();
	//   12   26:aload_0         
	//   13   27:getfield        #304 <Field IdManager idManager>
	//   14   30:invokevirtual   #1152 <Method String IdManager.getAppInstallIdentifier()>
	//   15   33:astore          6
		final int deliveryMechanism = DeliveryMechanism.determineFrom(appData.installerPackageName).getId();
	//   16   35:aload_0         
	//   17   36:getfield        #310 <Field AppData appData>
	//   18   39:getfield        #1155 <Field String AppData.installerPackageName>
	//   19   42:invokestatic    #1161 <Method DeliveryMechanism DeliveryMechanism.determineFrom(String)>
	//   20   45:invokevirtual   #1164 <Method int DeliveryMechanism.getId()>
	//   21   48:istore_2        
		writeSessionPartFile(s, "SessionApp", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
				throws Exception
			{
				SessionProtobufHelper.writeSessionApp(codedoutputstream, appIdentifier, appData.apiKey, versionCode, versionName, installUuid, deliveryMechanism, unityVersion);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #26  <Field String val$appIdentifier>
			//    3    5:aload_0         
			//    4    6:getfield        #24  <Field CrashlyticsController this$0>
			//    5    9:invokestatic    #46  <Method AppData CrashlyticsController.access$1900(CrashlyticsController)>
			//    6   12:getfield        #51  <Field String AppData.apiKey>
			//    7   15:aload_0         
			//    8   16:getfield        #28  <Field String val$versionCode>
			//    9   19:aload_0         
			//   10   20:getfield        #30  <Field String val$versionName>
			//   11   23:aload_0         
			//   12   24:getfield        #32  <Field String val$installUuid>
			//   13   27:aload_0         
			//   14   28:getfield        #34  <Field int val$deliveryMechanism>
			//   15   31:aload_0         
			//   16   32:getfield        #24  <Field CrashlyticsController this$0>
			//   17   35:invokestatic    #55  <Method String CrashlyticsController.access$2000(CrashlyticsController)>
			//   18   38:invokestatic    #60  <Method void SessionProtobufHelper.writeSessionApp(CodedOutputStream, String, String, String, String, String, int, String)>
			//   19   41:return          
			}

			final CrashlyticsController this$0;
			final String val$appIdentifier;
			final int val$deliveryMechanism;
			final String val$installUuid;
			final String val$versionCode;
			final String val$versionName;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CrashlyticsController this$0>
				appIdentifier = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field String val$appIdentifier>
				versionCode = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field String val$versionCode>
				versionName = s2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field String val$versionName>
				installUuid = s3;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #32  <Field String val$installUuid>
				deliveryMechanism = i;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #34  <Field int val$deliveryMechanism>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #37  <Method void Object()>
			//   20   37:return          
			}
		}
);
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:ldc1            #167 <String "SessionApp">
	//   25   53:new             #28  <Class CrashlyticsController$19>
	//   26   56:dup             
	//   27   57:aload_0         
	//   28   58:aload_3         
	//   29   59:aload           4
	//   30   61:aload           5
	//   31   63:aload           6
	//   32   65:iload_2         
	//   33   66:invokespecial   #1167 <Method void CrashlyticsController$19(CrashlyticsController, String, String, String, String, int)>
	//   34   69:invokespecial   #1102 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(s, "SessionApp.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
				throws Exception
			{
				fileoutputstream.write((new JSONObject(((Map) (new HashMap() {

					final _cls20 this$1;

			
			{
				this$1 = _cls20.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CrashlyticsController$20 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HashMap()>
				put("app_identifier", ((Object) (appIdentifier)));
			//    5    9:aload_0         
			//    6   10:ldc1            #21  <String "app_identifier">
			//    7   12:aload_0         
			//    8   13:getfield        #16  <Field CrashlyticsController$20 this$1>
			//    9   16:getfield        #25  <Field String CrashlyticsController$20.val$appIdentifier>
			//   10   19:invokevirtual   #29  <Method Object put(Object, Object)>
			//   11   22:pop             
				put("api_key", ((Object) (appData.apiKey)));
			//   12   23:aload_0         
			//   13   24:ldc1            #31  <String "api_key">
			//   14   26:aload_0         
			//   15   27:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   16   30:getfield        #35  <Field CrashlyticsController CrashlyticsController$20.this$0>
			//   17   33:invokestatic    #41  <Method AppData CrashlyticsController.access$1900(CrashlyticsController)>
			//   18   36:getfield        #46  <Field String AppData.apiKey>
			//   19   39:invokevirtual   #29  <Method Object put(Object, Object)>
			//   20   42:pop             
				put("version_code", ((Object) (versionCode)));
			//   21   43:aload_0         
			//   22   44:ldc1            #48  <String "version_code">
			//   23   46:aload_0         
			//   24   47:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   25   50:getfield        #51  <Field String CrashlyticsController$20.val$versionCode>
			//   26   53:invokevirtual   #29  <Method Object put(Object, Object)>
			//   27   56:pop             
				put("version_name", ((Object) (versionName)));
			//   28   57:aload_0         
			//   29   58:ldc1            #53  <String "version_name">
			//   30   60:aload_0         
			//   31   61:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   32   64:getfield        #56  <Field String CrashlyticsController$20.val$versionName>
			//   33   67:invokevirtual   #29  <Method Object put(Object, Object)>
			//   34   70:pop             
				put("install_uuid", ((Object) (installUuid)));
			//   35   71:aload_0         
			//   36   72:ldc1            #58  <String "install_uuid">
			//   37   74:aload_0         
			//   38   75:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   39   78:getfield        #61  <Field String CrashlyticsController$20.val$installUuid>
			//   40   81:invokevirtual   #29  <Method Object put(Object, Object)>
			//   41   84:pop             
				put("delivery_mechanism", ((Object) (Integer.valueOf(deliveryMechanism))));
			//   42   85:aload_0         
			//   43   86:ldc1            #63  <String "delivery_mechanism">
			//   44   88:aload_0         
			//   45   89:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   46   92:getfield        #67  <Field int CrashlyticsController$20.val$deliveryMechanism>
			//   47   95:invokestatic    #73  <Method Integer Integer.valueOf(int)>
			//   48   98:invokevirtual   #29  <Method Object put(Object, Object)>
			//   49  101:pop             
				if(TextUtils.isEmpty(((CharSequence) (unityVersion))))
			//*  50  102:aload_0         
			//*  51  103:getfield        #16  <Field CrashlyticsController$20 this$1>
			//*  52  106:getfield        #35  <Field CrashlyticsController CrashlyticsController$20.this$0>
			//*  53  109:invokestatic    #77  <Method String CrashlyticsController.access$2000(CrashlyticsController)>
			//*  54  112:invokestatic    #83  <Method boolean TextUtils.isEmpty(CharSequence)>
			//*  55  115:ifeq            124
					_pcls20 = "";
			//   56  118:ldc1            #85  <String "">
			//   57  120:astore_1        
				else
			//*  58  121:goto            135
					_pcls20 = ((_cls20) (unityVersion));
			//   59  124:aload_0         
			//   60  125:getfield        #16  <Field CrashlyticsController$20 this$1>
			//   61  128:getfield        #35  <Field CrashlyticsController CrashlyticsController$20.this$0>
			//   62  131:invokestatic    #77  <Method String CrashlyticsController.access$2000(CrashlyticsController)>
			//   63  134:astore_1        
				put("unity_version", ((Object) (_cls20.this)));
			//   64  135:aload_0         
			//   65  136:ldc1            #87  <String "unity_version">
			//   66  138:aload_1         
			//   67  139:invokevirtual   #29  <Method Object put(Object, Object)>
			//   68  142:pop             
			//   69  143:return          
			}
				}
)))).toString().getBytes());
			//    0    0:aload_1         
			//    1    1:new             #46  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$20$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #49  <Method void CrashlyticsController$20$1(CrashlyticsController$20)>
			//    7   13:invokespecial   #52  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #56  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #62  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #68  <Method void FileOutputStream.write(byte[])>
			//   11   25:return          
			}

			final CrashlyticsController this$0;
			final String val$appIdentifier;
			final int val$deliveryMechanism;
			final String val$installUuid;
			final String val$versionCode;
			final String val$versionName;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field CrashlyticsController this$0>
				appIdentifier = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field String val$appIdentifier>
				versionCode = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field String val$versionCode>
				versionName = s2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field String val$versionName>
				installUuid = s3;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #34  <Field String val$installUuid>
				deliveryMechanism = i;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #36  <Field int val$deliveryMechanism>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #39  <Method void Object()>
			//   20   37:return          
			}
		}
);
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:ldc2            #654 <String "SessionApp.json">
	//   38   77:new             #32  <Class CrashlyticsController$20>
	//   39   80:dup             
	//   40   81:aload_0         
	//   41   82:aload_3         
	//   42   83:aload           4
	//   43   85:aload           5
	//   44   87:aload           6
	//   45   89:iload_2         
	//   46   90:invokespecial   #1168 <Method void CrashlyticsController$20(CrashlyticsController, String, String, String, String, int)>
	//   47   93:invokespecial   #1107 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   48   96:return          
	}

	private void writeSessionDevice(String s)
		throws Exception
	{
		Context context = crashlyticsCore.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//    3    7:astore          10
		final Map ids = ((Map) (new StatFs(Environment.getDataDirectory().getPath())));
	//    4    9:new             #1170 <Class StatFs>
	//    5   12:dup             
	//    6   13:invokestatic    #1175 <Method File Environment.getDataDirectory()>
	//    7   16:invokevirtual   #1178 <Method String File.getPath()>
	//    8   19:invokespecial   #1179 <Method void StatFs(String)>
	//    9   22:astore          11
		final int arch = CommonUtils.getCpuArchitectureInt();
	//   10   24:invokestatic    #1182 <Method int CommonUtils.getCpuArchitectureInt()>
	//   11   27:istore_2        
		final int availableProcessors = Runtime.getRuntime().availableProcessors();
	//   12   28:invokestatic    #1186 <Method Runtime Runtime.getRuntime()>
	//   13   31:invokevirtual   #1189 <Method int Runtime.availableProcessors()>
	//   14   34:istore_3        
		final long totalRam = CommonUtils.getTotalRamInBytes();
	//   15   35:invokestatic    #1192 <Method long CommonUtils.getTotalRamInBytes()>
	//   16   38:lstore          5
		final long diskSpace = (long)((StatFs) (ids)).getBlockCount() * (long)((StatFs) (ids)).getBlockSize();
	//   17   40:aload           11
	//   18   42:invokevirtual   #1195 <Method int StatFs.getBlockCount()>
	//   19   45:i2l             
	//   20   46:aload           11
	//   21   48:invokevirtual   #1198 <Method int StatFs.getBlockSize()>
	//   22   51:i2l             
	//   23   52:lmul            
	//   24   53:lstore          7
		final boolean isEmulator = CommonUtils.isEmulator(context);
	//   25   55:aload           10
	//   26   57:invokestatic    #1202 <Method boolean CommonUtils.isEmulator(Context)>
	//   27   60:istore          9
		ids = idManager.getDeviceIdentifiers();
	//   28   62:aload_0         
	//   29   63:getfield        #304 <Field IdManager idManager>
	//   30   66:invokevirtual   #1206 <Method Map IdManager.getDeviceIdentifiers()>
	//   31   69:astore          11
		final int state = CommonUtils.getDeviceState(context);
	//   32   71:aload           10
	//   33   73:invokestatic    #1210 <Method int CommonUtils.getDeviceState(Context)>
	//   34   76:istore          4
		writeSessionPartFile(s, "SessionDevice", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
				throws Exception
			{
				SessionProtobufHelper.writeSessionDevice(codedoutputstream, arch, Build.MODEL, availableProcessors, totalRam, diskSpace, isEmulator, ids, state, Build.MANUFACTURER, Build.PRODUCT);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #30  <Field int val$arch>
			//    3    5:getstatic       #56  <Field String Build.MODEL>
			//    4    8:aload_0         
			//    5    9:getfield        #32  <Field int val$availableProcessors>
			//    6   12:aload_0         
			//    7   13:getfield        #34  <Field long val$totalRam>
			//    8   16:aload_0         
			//    9   17:getfield        #36  <Field long val$diskSpace>
			//   10   20:aload_0         
			//   11   21:getfield        #38  <Field boolean val$isEmulator>
			//   12   24:aload_0         
			//   13   25:getfield        #40  <Field Map val$ids>
			//   14   28:aload_0         
			//   15   29:getfield        #42  <Field int val$state>
			//   16   32:getstatic       #59  <Field String Build.MANUFACTURER>
			//   17   35:getstatic       #62  <Field String Build.PRODUCT>
			//   18   38:invokestatic    #67  <Method void SessionProtobufHelper.writeSessionDevice(CodedOutputStream, int, String, int, long, long, boolean, Map, int, String, String)>
			//   19   41:return          
			}

			final CrashlyticsController this$0;
			final int val$arch;
			final int val$availableProcessors;
			final long val$diskSpace;
			final Map val$ids;
			final boolean val$isEmulator;
			final int val$state;
			final long val$totalRam;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field CrashlyticsController this$0>
				arch = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #30  <Field int val$arch>
				availableProcessors = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #32  <Field int val$availableProcessors>
				totalRam = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #34  <Field long val$totalRam>
				diskSpace = l1;
			//   12   21:aload_0         
			//   13   22:lload           6
			//   14   24:putfield        #36  <Field long val$diskSpace>
				isEmulator = flag;
			//   15   27:aload_0         
			//   16   28:iload           8
			//   17   30:putfield        #38  <Field boolean val$isEmulator>
				ids = map;
			//   18   33:aload_0         
			//   19   34:aload           9
			//   20   36:putfield        #40  <Field Map val$ids>
				state = k;
			//   21   39:aload_0         
			//   22   40:iload           10
			//   23   42:putfield        #42  <Field int val$state>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #45  <Method void Object()>
			//   26   49:return          
			}
		}
);
	//   35   78:aload_0         
	//   36   79:aload_1         
	//   37   80:ldc1            #175 <String "SessionDevice">
	//   38   82:new             #42  <Class CrashlyticsController$23>
	//   39   85:dup             
	//   40   86:aload_0         
	//   41   87:iload_2         
	//   42   88:iload_3         
	//   43   89:lload           5
	//   44   91:lload           7
	//   45   93:iload           9
	//   46   95:aload           11
	//   47   97:iload           4
	//   48   99:invokespecial   #1213 <Method void CrashlyticsController$23(CrashlyticsController, int, int, long, long, boolean, Map, int)>
	//   49  102:invokespecial   #1102 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(s, "SessionDevice.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
				throws Exception
			{
				fileoutputstream.write((new JSONObject(((Map) (new HashMap() {

					final _cls24 this$1;

			
			{
				this$1 = _cls24.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CrashlyticsController$24 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HashMap()>
				put("arch", ((Object) (Integer.valueOf(arch))));
			//    5    9:aload_0         
			//    6   10:ldc1            #21  <String "arch">
			//    7   12:aload_0         
			//    8   13:getfield        #16  <Field CrashlyticsController$24 this$1>
			//    9   16:getfield        #25  <Field int CrashlyticsController$24.val$arch>
			//   10   19:invokestatic    #31  <Method Integer Integer.valueOf(int)>
			//   11   22:invokevirtual   #35  <Method Object put(Object, Object)>
			//   12   25:pop             
				put("build_model", ((Object) (Build.MODEL)));
			//   13   26:aload_0         
			//   14   27:ldc1            #37  <String "build_model">
			//   15   29:getstatic       #43  <Field String Build.MODEL>
			//   16   32:invokevirtual   #35  <Method Object put(Object, Object)>
			//   17   35:pop             
				put("available_processors", ((Object) (Integer.valueOf(availableProcessors))));
			//   18   36:aload_0         
			//   19   37:ldc1            #45  <String "available_processors">
			//   20   39:aload_0         
			//   21   40:getfield        #16  <Field CrashlyticsController$24 this$1>
			//   22   43:getfield        #48  <Field int CrashlyticsController$24.val$availableProcessors>
			//   23   46:invokestatic    #31  <Method Integer Integer.valueOf(int)>
			//   24   49:invokevirtual   #35  <Method Object put(Object, Object)>
			//   25   52:pop             
				put("total_ram", ((Object) (Long.valueOf(totalRam))));
			//   26   53:aload_0         
			//   27   54:ldc1            #50  <String "total_ram">
			//   28   56:aload_0         
			//   29   57:getfield        #16  <Field CrashlyticsController$24 this$1>
			//   30   60:getfield        #54  <Field long CrashlyticsController$24.val$totalRam>
			//   31   63:invokestatic    #59  <Method Long Long.valueOf(long)>
			//   32   66:invokevirtual   #35  <Method Object put(Object, Object)>
			//   33   69:pop             
				put("disk_space", ((Object) (Long.valueOf(diskSpace))));
			//   34   70:aload_0         
			//   35   71:ldc1            #61  <String "disk_space">
			//   36   73:aload_0         
			//   37   74:getfield        #16  <Field CrashlyticsController$24 this$1>
			//   38   77:getfield        #64  <Field long CrashlyticsController$24.val$diskSpace>
			//   39   80:invokestatic    #59  <Method Long Long.valueOf(long)>
			//   40   83:invokevirtual   #35  <Method Object put(Object, Object)>
			//   41   86:pop             
				put("is_emulator", ((Object) (Boolean.valueOf(isEmulator))));
			//   42   87:aload_0         
			//   43   88:ldc1            #66  <String "is_emulator">
			//   44   90:aload_0         
			//   45   91:getfield        #16  <Field CrashlyticsController$24 this$1>
			//   46   94:getfield        #70  <Field boolean CrashlyticsController$24.val$isEmulator>
			//   47   97:invokestatic    #75  <Method Boolean Boolean.valueOf(boolean)>
			//   48  100:invokevirtual   #35  <Method Object put(Object, Object)>
			//   49  103:pop             
				put("ids", ((Object) (ids)));
			//   50  104:aload_0         
			//   51  105:ldc1            #77  <String "ids">
			//   52  107:aload_0         
			//   53  108:getfield        #16  <Field CrashlyticsController$24 this$1>
			//   54  111:getfield        #81  <Field Map CrashlyticsController$24.val$ids>
			//   55  114:invokevirtual   #35  <Method Object put(Object, Object)>
			//   56  117:pop             
				put("state", ((Object) (Integer.valueOf(state))));
			//   57  118:aload_0         
			//   58  119:ldc1            #83  <String "state">
			//   59  121:aload_0         
			//   60  122:getfield        #16  <Field CrashlyticsController$24 this$1>
			//   61  125:getfield        #86  <Field int CrashlyticsController$24.val$state>
			//   62  128:invokestatic    #31  <Method Integer Integer.valueOf(int)>
			//   63  131:invokevirtual   #35  <Method Object put(Object, Object)>
			//   64  134:pop             
				put("build_manufacturer", ((Object) (Build.MANUFACTURER)));
			//   65  135:aload_0         
			//   66  136:ldc1            #88  <String "build_manufacturer">
			//   67  138:getstatic       #91  <Field String Build.MANUFACTURER>
			//   68  141:invokevirtual   #35  <Method Object put(Object, Object)>
			//   69  144:pop             
				put("build_product", ((Object) (Build.PRODUCT)));
			//   70  145:aload_0         
			//   71  146:ldc1            #93  <String "build_product">
			//   72  148:getstatic       #96  <Field String Build.PRODUCT>
			//   73  151:invokevirtual   #35  <Method Object put(Object, Object)>
			//   74  154:pop             
			//   75  155:return          
			}
				}
)))).toString().getBytes());
			//    0    0:aload_1         
			//    1    1:new             #54  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$24$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #57  <Method void CrashlyticsController$24$1(CrashlyticsController$24)>
			//    7   13:invokespecial   #60  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #64  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #70  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #76  <Method void FileOutputStream.write(byte[])>
			//   11   25:return          
			}

			final CrashlyticsController this$0;
			final int val$arch;
			final int val$availableProcessors;
			final long val$diskSpace;
			final Map val$ids;
			final boolean val$isEmulator;
			final int val$state;
			final long val$totalRam;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #30  <Field CrashlyticsController this$0>
				arch = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #32  <Field int val$arch>
				availableProcessors = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #34  <Field int val$availableProcessors>
				totalRam = l;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #36  <Field long val$totalRam>
				diskSpace = l1;
			//   12   21:aload_0         
			//   13   22:lload           6
			//   14   24:putfield        #38  <Field long val$diskSpace>
				isEmulator = flag;
			//   15   27:aload_0         
			//   16   28:iload           8
			//   17   30:putfield        #40  <Field boolean val$isEmulator>
				ids = map;
			//   18   33:aload_0         
			//   19   34:aload           9
			//   20   36:putfield        #42  <Field Map val$ids>
				state = k;
			//   21   39:aload_0         
			//   22   40:iload           10
			//   23   42:putfield        #44  <Field int val$state>
				super();
			//   24   45:aload_0         
			//   25   46:invokespecial   #47  <Method void Object()>
			//   26   49:return          
			}
		}
);
	//   50  105:aload_0         
	//   51  106:aload_1         
	//   52  107:ldc2            #656 <String "SessionDevice.json">
	//   53  110:new             #44  <Class CrashlyticsController$24>
	//   54  113:dup             
	//   55  114:aload_0         
	//   56  115:iload_2         
	//   57  116:iload_3         
	//   58  117:lload           5
	//   59  119:lload           7
	//   60  121:iload           9
	//   61  123:aload           11
	//   62  125:iload           4
	//   63  127:invokespecial   #1214 <Method void CrashlyticsController$24(CrashlyticsController, int, int, long, long, boolean, Map, int)>
	//   64  130:invokespecial   #1107 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   65  133:return          
	}

	private void writeSessionEvent(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
		throws Exception
	{
		TrimmedThrowableData trimmedthrowabledata = new TrimmedThrowableData(throwable, stackTraceTrimmingStrategy);
	//    0    0:new             #1216 <Class TrimmedThrowableData>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_0         
	//    4    7:getfield        #367 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//    5   10:invokespecial   #1219 <Method void TrimmedThrowableData(Throwable, StackTraceTrimmingStrategy)>
	//    6   13:astore          19
		Context context = crashlyticsCore.getContext();
	//    7   15:aload_0         
	//    8   16:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    9   19:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//   10   22:astore          26
		long l = date.getTime() / 1000L;
	//   11   24:aload_2         
	//   12   25:invokevirtual   #1018 <Method long Date.getTime()>
	//   13   28:ldc2w           #1019 <Long 1000L>
	//   14   31:ldiv            
	//   15   32:lstore          11
		Float float1 = CommonUtils.getBatteryLevel(context);
	//   16   34:aload           26
	//   17   36:invokestatic    #1223 <Method Float CommonUtils.getBatteryLevel(Context)>
	//   18   39:astore          20
		int j = CommonUtils.getBatteryVelocity(context, devicePowerStateListener.isPowerConnected());
	//   19   41:aload           26
	//   20   43:aload_0         
	//   21   44:getfield        #355 <Field DevicePowerStateListener devicePowerStateListener>
	//   22   47:invokevirtual   #1226 <Method boolean DevicePowerStateListener.isPowerConnected()>
	//   23   50:invokestatic    #1230 <Method int CommonUtils.getBatteryVelocity(Context, boolean)>
	//   24   53:istore          8
		boolean flag1 = CommonUtils.getProximitySensorEnabled(context);
	//   25   55:aload           26
	//   26   57:invokestatic    #1233 <Method boolean CommonUtils.getProximitySensorEnabled(Context)>
	//   27   60:istore          10
		int k = context.getResources().getConfiguration().orientation;
	//   28   62:aload           26
	//   29   64:invokevirtual   #1239 <Method Resources Context.getResources()>
	//   30   67:invokevirtual   #1245 <Method Configuration Resources.getConfiguration()>
	//   31   70:getfield        #1250 <Field int Configuration.orientation>
	//   32   73:istore          9
		long l1 = CommonUtils.getTotalRamInBytes();
	//   33   75:invokestatic    #1192 <Method long CommonUtils.getTotalRamInBytes()>
	//   34   78:lstore          13
		long l2 = CommonUtils.calculateFreeRamInBytes(context);
	//   35   80:aload           26
	//   36   82:invokestatic    #1254 <Method long CommonUtils.calculateFreeRamInBytes(Context)>
	//   37   85:lstore          15
		long l3 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
	//   38   87:invokestatic    #1175 <Method File Environment.getDataDirectory()>
	//   39   90:invokevirtual   #1178 <Method String File.getPath()>
	//   40   93:invokestatic    #1258 <Method long CommonUtils.calculateUsedDiskSpaceInBytes(String)>
	//   41   96:lstore          17
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = CommonUtils.getAppProcessInfo(context.getPackageName(), context);
	//   42   98:aload           26
	//   43  100:invokevirtual   #1261 <Method String Context.getPackageName()>
	//   44  103:aload           26
	//   45  105:invokestatic    #1265 <Method android.app.ActivityManager$RunningAppProcessInfo CommonUtils.getAppProcessInfo(String, Context)>
	//   46  108:astore          21
		LinkedList linkedlist = new LinkedList();
	//   47  110:new             #1267 <Class LinkedList>
	//   48  113:dup             
	//   49  114:invokespecial   #1268 <Method void LinkedList()>
	//   50  117:astore          22
		StackTraceElement astacktraceelement[] = trimmedthrowabledata.stacktrace;
	//   51  119:aload           19
	//   52  121:getfield        #1272 <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   53  124:astore          23
		String s1 = appData.buildId;
	//   54  126:aload_0         
	//   55  127:getfield        #310 <Field AppData appData>
	//   56  130:getfield        #1275 <Field String AppData.buildId>
	//   57  133:astore          24
		String s2 = idManager.getAppIdentifier();
	//   58  135:aload_0         
	//   59  136:getfield        #304 <Field IdManager idManager>
	//   60  139:invokevirtual   #1143 <Method String IdManager.getAppIdentifier()>
	//   61  142:astore          25
		int i = 0;
	//   62  144:iconst_0        
	//   63  145:istore          7
		if(flag)
	//*  64  147:iload           6
	//*  65  149:ifeq            253
		{
			date = ((Date) (Thread.getAllStackTraces()));
	//   66  152:invokestatic    #1278 <Method Map Thread.getAllStackTraces()>
	//   67  155:astore_2        
			throwable = ((Throwable) (new Thread[((Map) (date)).size()]));
	//   68  156:aload_2         
	//   69  157:invokeinterface #1281 <Method int Map.size()>
	//   70  162:anewarray       Thread[]
	//   71  165:astore          4
			for(date = ((Date) (((Map) (date)).entrySet().iterator())); ((Iterator) (date)).hasNext();)
	//*  72  167:aload_2         
	//*  73  168:invokeinterface #1285 <Method Set Map.entrySet()>
	//*  74  173:invokeinterface #902 <Method Iterator Set.iterator()>
	//*  75  178:astore_2        
	//*  76  179:aload_2         
	//*  77  180:invokeinterface #907 <Method boolean Iterator.hasNext()>
	//*  78  185:ifeq            250
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (date)).next();
	//   79  188:aload_2         
	//   80  189:invokeinterface #911 <Method Object Iterator.next()>
	//   81  194:checkcast       #1287 <Class java.util.Map$Entry>
	//   82  197:astore          27
				throwable[i] = ((/*<invalid signature>*/java.lang.Object) ((Thread)entry.getKey()));
	//   83  199:aload           4
	//   84  201:iload           7
	//   85  203:aload           27
	//   86  205:invokeinterface #1290 <Method Object java.util.Map$Entry.getKey()>
	//   87  210:checkcast       #580 <Class Thread>
	//   88  213:aastore         
				((List) (linkedlist)).add(((Object) (stackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[])entry.getValue()))));
	//   89  214:aload           22
	//   90  216:aload_0         
	//   91  217:getfield        #367 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//   92  220:aload           27
	//   93  222:invokeinterface #1293 <Method Object java.util.Map$Entry.getValue()>
	//   94  227:checkcast       #1294 <Class StackTraceElement[]>
	//   95  230:invokeinterface #1298 <Method StackTraceElement[] StackTraceTrimmingStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   96  235:invokeinterface #1301 <Method boolean List.add(Object)>
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
	//* 108  261:ldc1            #109 <String "com.crashlytics.CollectCustomKeys">
	//* 109  263:iconst_1        
	//* 110  264:invokestatic    #1305 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//* 111  267:ifne            281
		{
			date = ((Date) (new TreeMap()));
	//  112  270:new             #1307 <Class TreeMap>
	//  113  273:dup             
	//  114  274:invokespecial   #1308 <Method void TreeMap()>
	//  115  277:astore_2        
		} else
	//* 116  278:goto            315
		{
			date = ((Date) (crashlyticsCore.getAttributes()));
	//  117  281:aload_0         
	//  118  282:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//  119  285:invokevirtual   #1311 <Method Map CrashlyticsCore.getAttributes()>
	//  120  288:astore_2        
			if(date != null && ((Map) (date)).size() > 1)
	//* 121  289:aload_2         
	//* 122  290:ifnull          315
	//* 123  293:aload_2         
	//* 124  294:invokeinterface #1281 <Method int Map.size()>
	//* 125  299:iconst_1        
	//* 126  300:icmple          315
				date = ((Date) (new TreeMap(((Map) (date)))));
	//  127  303:new             #1307 <Class TreeMap>
	//  128  306:dup             
	//  129  307:aload_2         
	//  130  308:invokespecial   #1314 <Method void TreeMap(Map)>
	//  131  311:astore_2        
		}
	//* 132  312:goto            315
		SessionProtobufHelper.writeSessionEvent(codedoutputstream, l, s, trimmedthrowabledata, thread, astacktraceelement, ((Thread []) (throwable)), ((List) (linkedlist)), ((Map) (date)), logFileManager, runningappprocessinfo, k, s2, s1, float1, j, flag1, l1 - l2, l3);
	//  133  315:aload_1         
	//  134  316:lload           11
	//  135  318:aload           5
	//  136  320:aload           19
	//  137  322:aload_3         
	//  138  323:aload           23
	//  139  325:aload           4
	//  140  327:aload           22
	//  141  329:aload_2         
	//  142  330:aload_0         
	//  143  331:getfield        #340 <Field LogFileManager logFileManager>
	//  144  334:aload           21
	//  145  336:iload           9
	//  146  338:aload           25
	//  147  340:aload           24
	//  148  342:aload           20
	//  149  344:iload           8
	//  150  346:iload           10
	//  151  348:lload           13
	//  152  350:lload           15
	//  153  352:lsub            
	//  154  353:lload           17
	//  155  355:invokestatic    #1319 <Method void SessionProtobufHelper.writeSessionEvent(CodedOutputStream, long, String, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, Map, LogFileManager, android.app.ActivityManager$RunningAppProcessInfo, int, String, String, Float, int, boolean, long, long)>
	//  156  358:return          
	}

	private void writeSessionOS(String s)
		throws Exception
	{
		final boolean isRooted = CommonUtils.isRooted(crashlyticsCore.getContext());
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//    3    7:invokestatic    #1322 <Method boolean CommonUtils.isRooted(Context)>
	//    4   10:istore_2        
		writeSessionPartFile(s, "SessionOS", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
				throws Exception
			{
				SessionProtobufHelper.writeSessionOS(codedoutputstream, android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.CODENAME, isRooted);
			//    0    0:aload_1         
			//    1    1:getstatic       #35  <Field String android.os.Build$VERSION.RELEASE>
			//    2    4:getstatic       #38  <Field String android.os.Build$VERSION.CODENAME>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field boolean val$isRooted>
			//    5   11:invokestatic    #43  <Method void SessionProtobufHelper.writeSessionOS(CodedOutputStream, String, String, boolean)>
			//    6   14:return          
			}

			final CrashlyticsController this$0;
			final boolean val$isRooted;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashlyticsController this$0>
				isRooted = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$isRooted>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:ldc1            #197 <String "SessionOS">
	//    8   15:new             #36  <Class CrashlyticsController$21>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:iload_2         
	//   12   21:invokespecial   #1325 <Method void CrashlyticsController$21(CrashlyticsController, boolean)>
	//   13   24:invokespecial   #1102 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(s, "SessionOS.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
				throws Exception
			{
				fileoutputstream.write((new JSONObject(((Map) (new HashMap() {

					final _cls22 this$1;

			
			{
				this$1 = _cls22.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CrashlyticsController$22 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HashMap()>
				put("version", ((Object) (android.os.Build.VERSION.RELEASE)));
			//    5    9:aload_0         
			//    6   10:ldc1            #21  <String "version">
			//    7   12:getstatic       #27  <Field String android.os.Build$VERSION.RELEASE>
			//    8   15:invokevirtual   #31  <Method Object put(Object, Object)>
			//    9   18:pop             
				put("build_version", ((Object) (android.os.Build.VERSION.CODENAME)));
			//   10   19:aload_0         
			//   11   20:ldc1            #33  <String "build_version">
			//   12   22:getstatic       #36  <Field String android.os.Build$VERSION.CODENAME>
			//   13   25:invokevirtual   #31  <Method Object put(Object, Object)>
			//   14   28:pop             
				put("is_rooted", ((Object) (Boolean.valueOf(isRooted))));
			//   15   29:aload_0         
			//   16   30:ldc1            #38  <String "is_rooted">
			//   17   32:aload_0         
			//   18   33:getfield        #16  <Field CrashlyticsController$22 this$1>
			//   19   36:getfield        #42  <Field boolean CrashlyticsController$22.val$isRooted>
			//   20   39:invokestatic    #48  <Method Boolean Boolean.valueOf(boolean)>
			//   21   42:invokevirtual   #31  <Method Object put(Object, Object)>
			//   22   45:pop             
			//   23   46:return          
			}
				}
)))).toString().getBytes());
			//    0    0:aload_1         
			//    1    1:new             #33  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$22$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #36  <Method void CrashlyticsController$22$1(CrashlyticsController$22)>
			//    7   13:invokespecial   #39  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #43  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #49  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #55  <Method void FileOutputStream.write(byte[])>
			//   11   25:return          
			}

			final CrashlyticsController this$0;
			final boolean val$isRooted;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field CrashlyticsController this$0>
				isRooted = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field boolean val$isRooted>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:ldc2            #658 <String "SessionOS.json">
	//   17   32:new             #38  <Class CrashlyticsController$22>
	//   18   35:dup             
	//   19   36:aload_0         
	//   20   37:iload_2         
	//   21   38:invokespecial   #1326 <Method void CrashlyticsController$22(CrashlyticsController, boolean)>
	//   22   41:invokespecial   #1107 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   23   44:return          
	}

	private void writeSessionPartFile(String s, String s1, CodedOutputStreamWriteAction codedoutputstreamwriteaction)
		throws Exception
	{
		Object obj;
		Object obj2;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          6
		Object obj1;
		obj1 = ((Object) (getFilesDir()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #595 <Method File getFilesDir()>
	//    6   10:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//    7   12:new             #471 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #472 <Method void StringBuilder()>
	//   10   19:astore          7
		stringbuilder1.append(s);
	//   11   21:aload           7
	//   12   23:aload_1         
	//   13   24:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder1.append(s1);
	//   15   28:aload           7
	//   16   30:aload_2         
	//   17   31:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		obj1 = ((Object) (new ClsFileOutputStream(((File) (obj1)), stringbuilder1.toString())));
	//   19   35:new             #489 <Class ClsFileOutputStream>
	//   20   38:dup             
	//   21   39:aload           5
	//   22   41:aload           7
	//   23   43:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #598 <Method void ClsFileOutputStream(File, String)>
	//   25   49:astore          5
		s = ((String) (obj2));
	//   26   51:aload           6
	//   27   53:astore_1        
		obj = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   28   54:aload           5
	//   29   56:invokestatic    #602 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   30   59:astore          4
		s = ((String) (obj));
	//   31   61:aload           4
	//   32   63:astore_1        
		codedoutputstreamwriteaction.writeTo(((CodedOutputStream) (obj)));
	//   33   64:aload_3         
	//   34   65:aload           4
	//   35   67:invokeinterface #1329 <Method void CrashlyticsController$CodedOutputStreamWriteAction.writeTo(CodedOutputStream)>
		s = ((String) (new StringBuilder()));
	//   36   72:new             #471 <Class StringBuilder>
	//   37   75:dup             
	//   38   76:invokespecial   #472 <Method void StringBuilder()>
	//   39   79:astore_1        
		((StringBuilder) (s)).append("Failed to flush to session ");
	//   40   80:aload_1         
	//   41   81:ldc2            #1331 <String "Failed to flush to session ">
	//   42   84:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		((StringBuilder) (s)).append(s1);
	//   44   88:aload_1         
	//   45   89:aload_2         
	//   46   90:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
		((StringBuilder) (s)).append(" file.");
	//   48   94:aload_1         
	//   49   95:ldc2            #1123 <String " file.">
	//   50   98:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   51  101:pop             
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), ((StringBuilder) (s)).toString());
	//   52  102:aload           4
	//   53  104:aload_1         
	//   54  105:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   55  108:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		s = ((String) (new StringBuilder()));
	//   56  111:new             #471 <Class StringBuilder>
	//   57  114:dup             
	//   58  115:invokespecial   #472 <Method void StringBuilder()>
	//   59  118:astore_1        
		((StringBuilder) (s)).append("Failed to close session ");
	//   60  119:aload_1         
	//   61  120:ldc2            #1333 <String "Failed to close session ">
	//   62  123:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   63  126:pop             
		((StringBuilder) (s)).append(s1);
	//   64  127:aload_1         
	//   65  128:aload_2         
	//   66  129:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   67  132:pop             
		((StringBuilder) (s)).append(" file.");
	//   68  133:aload_1         
	//   69  134:ldc2            #1123 <String " file.">
	//   70  137:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   71  140:pop             
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), ((StringBuilder) (s)).toString());
	//   72  141:aload           5
	//   73  143:aload_1         
	//   74  144:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   75  147:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   76  150:return          
		codedoutputstreamwriteaction;
	//   77  151:astore_3        
		obj = ((Object) (s));
	//   78  152:aload_1         
	//   79  153:astore          4
		s = ((String) (obj1));
	//   80  155:aload           5
	//   81  157:astore_1        
		break MISSING_BLOCK_LABEL_164;
	//   82  158:goto            164
		codedoutputstreamwriteaction;
	//   83  161:astore_3        
		s = null;
	//   84  162:aconst_null     
	//   85  163:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   86  164:new             #471 <Class StringBuilder>
	//   87  167:dup             
	//   88  168:invokespecial   #472 <Method void StringBuilder()>
	//   89  171:astore          5
		stringbuilder.append("Failed to flush to session ");
	//   90  173:aload           5
	//   91  175:ldc2            #1331 <String "Failed to flush to session ">
	//   92  178:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   93  181:pop             
		stringbuilder.append(s1);
	//   94  182:aload           5
	//   95  184:aload_2         
	//   96  185:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   97  188:pop             
		stringbuilder.append(" file.");
	//   98  189:aload           5
	//   99  191:ldc2            #1123 <String " file.">
	//  100  194:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  101  197:pop             
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), stringbuilder.toString());
	//  102  198:aload           4
	//  103  200:aload           5
	//  104  202:invokevirtual   #481 <Method String StringBuilder.toString()>
	//  105  205:invokestatic    #614 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		obj = ((Object) (new StringBuilder()));
	//  106  208:new             #471 <Class StringBuilder>
	//  107  211:dup             
	//  108  212:invokespecial   #472 <Method void StringBuilder()>
	//  109  215:astore          4
		((StringBuilder) (obj)).append("Failed to close session ");
	//  110  217:aload           4
	//  111  219:ldc2            #1333 <String "Failed to close session ">
	//  112  222:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  113  225:pop             
		((StringBuilder) (obj)).append(s1);
	//  114  226:aload           4
	//  115  228:aload_2         
	//  116  229:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  117  232:pop             
		((StringBuilder) (obj)).append(" file.");
	//  118  233:aload           4
	//  119  235:ldc2            #1123 <String " file.">
	//  120  238:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  121  241:pop             
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), ((StringBuilder) (obj)).toString());
	//  122  242:aload_1         
	//  123  243:aload           4
	//  124  245:invokevirtual   #481 <Method String StringBuilder.toString()>
	//  125  248:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw codedoutputstreamwriteaction;
	//  126  251:aload_3         
	//  127  252:athrow          
	}

	private void writeSessionPartsToSessionFile(File file, String s, int i)
	{
		Object obj = ((Object) (Fabric.getLogger()));
	//    0    0:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    1    3:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #471 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #472 <Method void StringBuilder()>
	//    5   12:astore          7
		stringbuilder.append("Collecting session parts for ID ");
	//    6   14:aload           7
	//    7   16:ldc2            #1335 <String "Collecting session parts for ID ">
	//    8   19:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:pop             
		stringbuilder.append(s);
	//   10   23:aload           7
	//   11   25:aload_2         
	//   12   26:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   14   30:aload           6
	//   15   32:ldc2            #457 <String "CrashlyticsCore">
	//   16   35:aload           7
	//   17   37:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   18   40:invokeinterface #465 <Method void Logger.d(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   19   45:new             #471 <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #472 <Method void StringBuilder()>
	//   22   52:astore          6
		((StringBuilder) (obj)).append(s);
	//   23   54:aload           6
	//   24   56:aload_2         
	//   25   57:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
		((StringBuilder) (obj)).append("SessionCrash");
	//   27   61:aload           6
	//   28   63:ldc1            #183 <String "SessionCrash">
	//   29   65:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
		obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   31   69:aload_0         
	//   32   70:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   33   73:dup             
	//   34   74:aload           6
	//   35   76:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   36   79:invokespecial   #778 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   37   82:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//   38   85:astore          6
		boolean flag;
		if(obj != null && obj.length > 0)
	//*  39   87:aload           6
	//*  40   89:ifnull          104
	//*  41   92:aload           6
	//*  42   94:arraylength     
	//*  43   95:ifle            104
			flag = true;
	//   44   98:iconst_1        
	//   45   99:istore          4
		else
	//*  46  101:goto            107
			flag = false;
	//   47  104:iconst_0        
	//   48  105:istore          4
		Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
			s, Boolean.valueOf(flag)
		}));
	//   49  107:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   50  110:ldc2            #457 <String "CrashlyticsCore">
	//   51  113:getstatic       #765 <Field Locale Locale.US>
	//   52  116:ldc2            #1337 <String "Session %s has fatal exception: %s">
	//   53  119:iconst_2        
	//   54  120:anewarray       Object[]
	//   55  123:dup             
	//   56  124:iconst_0        
	//   57  125:aload_2         
	//   58  126:aastore         
	//   59  127:dup             
	//   60  128:iconst_1        
	//   61  129:iload           4
	//   62  131:invokestatic    #1342 <Method Boolean Boolean.valueOf(boolean)>
	//   63  134:aastore         
	//   64  135:invokestatic    #777 <Method String String.format(Locale, String, Object[])>
	//   65  138:invokeinterface #465 <Method void Logger.d(String, String)>
		stringbuilder = new StringBuilder();
	//   66  143:new             #471 <Class StringBuilder>
	//   67  146:dup             
	//   68  147:invokespecial   #472 <Method void StringBuilder()>
	//   69  150:astore          7
		stringbuilder.append(s);
	//   70  152:aload           7
	//   71  154:aload_2         
	//   72  155:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   73  158:pop             
		stringbuilder.append("SessionEvent");
	//   74  159:aload           7
	//   75  161:ldc1            #194 <String "SessionEvent">
	//   76  163:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   77  166:pop             
		File afile[] = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))));
	//   78  167:aload_0         
	//   79  168:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   80  171:dup             
	//   81  172:aload           7
	//   82  174:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   83  177:invokespecial   #778 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   84  180:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//   85  183:astore          7
		boolean flag1;
		if(afile != null && afile.length > 0)
	//*  86  185:aload           7
	//*  87  187:ifnull          202
	//*  88  190:aload           7
	//*  89  192:arraylength     
	//*  90  193:ifle            202
			flag1 = true;
	//   91  196:iconst_1        
	//   92  197:istore          5
		else
	//*  93  199:goto            205
			flag1 = false;
	//   94  202:iconst_0        
	//   95  203:istore          5
		Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
			s, Boolean.valueOf(flag1)
		}));
	//   96  205:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   97  208:ldc2            #457 <String "CrashlyticsCore">
	//   98  211:getstatic       #765 <Field Locale Locale.US>
	//   99  214:ldc2            #1344 <String "Session %s has non-fatal exceptions: %s">
	//  100  217:iconst_2        
	//  101  218:anewarray       Object[]
	//  102  221:dup             
	//  103  222:iconst_0        
	//  104  223:aload_2         
	//  105  224:aastore         
	//  106  225:dup             
	//  107  226:iconst_1        
	//  108  227:iload           5
	//  109  229:invokestatic    #1342 <Method Boolean Boolean.valueOf(boolean)>
	//  110  232:aastore         
	//  111  233:invokestatic    #777 <Method String String.format(Locale, String, Object[])>
	//  112  236:invokeinterface #465 <Method void Logger.d(String, String)>
		if(!flag && !flag1)
	//* 113  241:iload           4
	//* 114  243:ifne            300
	//* 115  246:iload           5
	//* 116  248:ifeq            254
	//* 117  251:goto            300
		{
			file = ((File) (Fabric.getLogger()));
	//  118  254:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  119  257:astore_1        
			obj = ((Object) (new StringBuilder()));
	//  120  258:new             #471 <Class StringBuilder>
	//  121  261:dup             
	//  122  262:invokespecial   #472 <Method void StringBuilder()>
	//  123  265:astore          6
			((StringBuilder) (obj)).append("No events present for session ID ");
	//  124  267:aload           6
	//  125  269:ldc2            #1346 <String "No events present for session ID ">
	//  126  272:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  127  275:pop             
			((StringBuilder) (obj)).append(s);
	//  128  276:aload           6
	//  129  278:aload_2         
	//  130  279:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  131  282:pop             
			((Logger) (file)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  132  283:aload_1         
	//  133  284:ldc2            #457 <String "CrashlyticsCore">
	//  134  287:aload           6
	//  135  289:invokevirtual   #481 <Method String StringBuilder.toString()>
	//  136  292:invokeinterface #465 <Method void Logger.d(String, String)>
		} else
	//* 137  297:goto            337
		{
			afile = getTrimmedNonFatalFiles(s, afile, i);
	//  138  300:aload_0         
	//  139  301:aload_2         
	//  140  302:aload           7
	//  141  304:iload_3         
	//  142  305:invokespecial   #1348 <Method File[] getTrimmedNonFatalFiles(String, File[], int)>
	//  143  308:astore          7
			if(flag)
	//* 144  310:iload           4
	//* 145  312:ifeq            324
				obj = ((Object) (obj[0]));
	//  146  315:aload           6
	//  147  317:iconst_0        
	//  148  318:aaload          
	//  149  319:astore          6
			else
	//* 150  321:goto            327
				obj = null;
	//  151  324:aconst_null     
	//  152  325:astore          6
			synthesizeSessionFile(file, s, afile, ((File) (obj)));
	//  153  327:aload_0         
	//  154  328:aload_1         
	//  155  329:aload_2         
	//  156  330:aload           7
	//  157  332:aload           6
	//  158  334:invokespecial   #1350 <Method void synthesizeSessionFile(File, String, File[], File)>
		}
		file = ((File) (Fabric.getLogger()));
	//  159  337:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  160  340:astore_1        
		obj = ((Object) (new StringBuilder()));
	//  161  341:new             #471 <Class StringBuilder>
	//  162  344:dup             
	//  163  345:invokespecial   #472 <Method void StringBuilder()>
	//  164  348:astore          6
		((StringBuilder) (obj)).append("Removing session part files for ID ");
	//  165  350:aload           6
	//  166  352:ldc2            #1352 <String "Removing session part files for ID ">
	//  167  355:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  168  358:pop             
		((StringBuilder) (obj)).append(s);
	//  169  359:aload           6
	//  170  361:aload_2         
	//  171  362:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  172  365:pop             
		((Logger) (file)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  173  366:aload_1         
	//  174  367:ldc2            #457 <String "CrashlyticsCore">
	//  175  370:aload           6
	//  176  372:invokevirtual   #481 <Method String StringBuilder.toString()>
	//  177  375:invokeinterface #465 <Method void Logger.d(String, String)>
		deleteSessionPartFilesFor(s);
	//  178  380:aload_0         
	//  179  381:aload_2         
	//  180  382:invokespecial   #1354 <Method void deleteSessionPartFilesFor(String)>
	//  181  385:return          
	}

	private void writeSessionUser(String s)
		throws Exception
	{
		writeSessionPartFile(s, "SessionUser", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
				throws Exception
			{
				SessionProtobufHelper.writeSessionUser(codedoutputstream, userMetaData.id, userMetaData.name, userMetaData.email);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #21  <Field UserMetaData val$userMetaData>
			//    3    5:getfield        #35  <Field String UserMetaData.id>
			//    4    8:aload_0         
			//    5    9:getfield        #21  <Field UserMetaData val$userMetaData>
			//    6   12:getfield        #38  <Field String UserMetaData.name>
			//    7   15:aload_0         
			//    8   16:getfield        #21  <Field UserMetaData val$userMetaData>
			//    9   19:getfield        #41  <Field String UserMetaData.email>
			//   10   22:invokestatic    #46  <Method void SessionProtobufHelper.writeSessionUser(CodedOutputStream, String, String, String)>
			//   11   25:return          
			}

			final CrashlyticsController this$0;
			final UserMetaData val$userMetaData;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashlyticsController this$0>
				userMetaData = usermetadata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field UserMetaData val$userMetaData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #200 <String "SessionUser">
	//    3    4:new             #48  <Class CrashlyticsController$25>
	//    4    7:dup             
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:invokespecial   #1357 <Method UserMetaData getUserMetaData(String)>
	//    9   14:invokespecial   #1360 <Method void CrashlyticsController$25(CrashlyticsController, UserMetaData)>
	//   10   17:invokespecial   #1102 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
	//   11   20:return          
	}

	private static void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
		throws IOException
	{
		if(!file.exists())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #1005 <Method boolean File.exists()>
	//*   2    4:ifne            51
		{
			codedoutputstream = ((CodedOutputStream) (Fabric.getLogger()));
	//    3    7:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    4   10:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #471 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #472 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("Tried to include a file that doesn't exist: ");
	//    9   19:aload_2         
	//   10   20:ldc2            #1362 <String "Tried to include a file that doesn't exist: ">
	//   11   23:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append(file.getName());
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #753 <Method String File.getName()>
	//   16   32:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((Logger) (codedoutputstream)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   18   36:aload_0         
	//   19   37:ldc2            #457 <String "CrashlyticsCore">
	//   20   40:aload_2         
	//   21   41:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   22   44:aconst_null     
	//   23   45:invokeinterface #498 <Method void Logger.e(String, String, Throwable)>
			return;
	//   24   50:return          
		}
		FileInputStream fileinputstream = new FileInputStream(file);
	//   25   51:new             #1364 <Class FileInputStream>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:invokespecial   #1365 <Method void FileInputStream(File)>
	//   29   59:astore_2        
		copyToCodedOutputStream(((InputStream) (fileinputstream)), codedoutputstream, (int)file.length());
	//   30   60:aload_2         
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #1368 <Method long File.length()>
	//   34   66:l2i             
	//   35   67:invokestatic    #1370 <Method void copyToCodedOutputStream(InputStream, CodedOutputStream, int)>
		CommonUtils.closeOrLog(((java.io.Closeable) (fileinputstream)), "Failed to close file input stream.");
	//   36   70:aload_2         
	//   37   71:ldc2            #1372 <String "Failed to close file input stream.">
	//   38   74:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
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
	//   48   88:ldc2            #1372 <String "Failed to close file input stream.">
	//   49   91:invokestatic    #620 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//   50   94:aload_1         
	//   51   95:athrow          
	}

	void cacheKeyData(final Map keyData)
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
				String s = getCurrentSessionId();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #38  <Method String CrashlyticsController.access$1200(CrashlyticsController)>
			//    3    7:astore_1        
				(new MetaDataStore(getFilesDir())).writeKeyData(s, keyData);
			//    4    8:new             #40  <Class MetaDataStore>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:getfield        #20  <Field CrashlyticsController this$0>
			//    8   16:invokevirtual   #44  <Method File CrashlyticsController.getFilesDir()>
			//    9   19:invokespecial   #47  <Method void MetaDataStore(File)>
			//   10   22:aload_1         
			//   11   23:aload_0         
			//   12   24:getfield        #22  <Field Map val$keyData>
			//   13   27:invokevirtual   #51  <Method void MetaDataStore.writeKeyData(String, Map)>
				return null;
			//   14   30:aconst_null     
			//   15   31:areturn         
			}

			final CrashlyticsController this$0;
			final Map val$keyData;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsController this$0>
				keyData = map;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Map val$keyData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #10  <Class CrashlyticsController$11>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1376 <Method void CrashlyticsController$11(CrashlyticsController, Map)>
	//    7   13:invokevirtual   #1379 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    8   16:pop             
	//    9   17:return          
	}

	void cacheUserData(final String userId, final String userName, final String userEmail)
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #39  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				String s = getCurrentSessionId();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #44  <Method String CrashlyticsController.access$1200(CrashlyticsController)>
			//    3    7:astore_1        
				(new MetaDataStore(getFilesDir())).writeUserData(s, new UserMetaData(userId, userName, userEmail));
			//    4    8:new             #46  <Class MetaDataStore>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:getfield        #22  <Field CrashlyticsController this$0>
			//    8   16:invokevirtual   #50  <Method File CrashlyticsController.getFilesDir()>
			//    9   19:invokespecial   #53  <Method void MetaDataStore(File)>
			//   10   22:aload_1         
			//   11   23:new             #55  <Class UserMetaData>
			//   12   26:dup             
			//   13   27:aload_0         
			//   14   28:getfield        #24  <Field String val$userId>
			//   15   31:aload_0         
			//   16   32:getfield        #26  <Field String val$userName>
			//   17   35:aload_0         
			//   18   36:getfield        #28  <Field String val$userEmail>
			//   19   39:invokespecial   #57  <Method void UserMetaData(String, String, String)>
			//   20   42:invokevirtual   #61  <Method void MetaDataStore.writeUserData(String, UserMetaData)>
				return null;
			//   21   45:aconst_null     
			//   22   46:areturn         
			}

			final CrashlyticsController this$0;
			final String val$userEmail;
			final String val$userId;
			final String val$userName;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CrashlyticsController this$0>
				userId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$userId>
				userName = s1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field String val$userName>
				userEmail = s2;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field String val$userEmail>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #8   <Class CrashlyticsController$10>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #1384 <Method void CrashlyticsController$10(CrashlyticsController, String, String, String)>
	//    9   15:invokevirtual   #1379 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//   10   18:pop             
	//   11   19:return          
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
			//    8   14:invokestatic    #28  <Method File[] CrashlyticsController.access$1500(CrashlyticsController, FilenameFilter)>
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
	//    1    1:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #16  <Class CrashlyticsController$14>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1387 <Method void CrashlyticsController$14(CrashlyticsController)>
	//    6   12:invokevirtual   #980 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void doCleanInvalidTempFiles(File afile[])
	{
		final HashSet invalidSessionIds = new HashSet();
	//    0    0:new             #1062 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #1063 <Method void HashSet()>
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
	//   18   28:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   19   31:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   20   33:new             #471 <Class StringBuilder>
	//   21   36:dup             
	//   22   37:invokespecial   #472 <Method void StringBuilder()>
	//   23   40:astore          8
			stringbuilder.append("Found invalid session part file: ");
	//   24   42:aload           8
	//   25   44:ldc2            #1391 <String "Found invalid session part file: ">
	//   26   47:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			stringbuilder.append(((Object) (file)));
	//   28   51:aload           8
	//   29   53:aload           6
	//   30   55:invokevirtual   #576 <Method StringBuilder StringBuilder.append(Object)>
	//   31   58:pop             
			logger.d("CrashlyticsCore", stringbuilder.toString());
	//   32   59:aload           7
	//   33   61:ldc2            #457 <String "CrashlyticsCore">
	//   34   64:aload           8
	//   35   66:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   36   69:invokeinterface #465 <Method void Logger.d(String, String)>
			((Set) (invalidSessionIds)).add(((Object) (getSessionIdFromSessionFile(file))));
	//   37   74:aload           5
	//   38   76:aload           6
	//   39   78:invokestatic    #469 <Method String getSessionIdFromSessionFile(File)>
	//   40   81:invokeinterface #1069 <Method boolean Set.add(Object)>
	//   41   86:pop             
		}

	//   42   87:iload_2         
	//   43   88:iconst_1        
	//   44   89:iadd            
	//   45   90:istore_2        
	//*  46   91:goto            17
		if(((Set) (invalidSessionIds)).isEmpty())
	//*  47   94:aload           5
	//*  48   96:invokeinterface #1394 <Method boolean Set.isEmpty()>
	//*  49  101:ifeq            105
			return;
	//   50  104:return          
		afile = ((File []) (getInvalidFilesDir()));
	//   51  105:aload_0         
	//   52  106:invokevirtual   #1055 <Method File getInvalidFilesDir()>
	//   53  109:astore_1        
		if(!((File) (afile)).exists())
	//*  54  110:aload_1         
	//*  55  111:invokevirtual   #1005 <Method boolean File.exists()>
	//*  56  114:ifne            122
			((File) (afile)).mkdir();
	//   57  117:aload_1         
	//   58  118:invokevirtual   #689 <Method boolean File.mkdir()>
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
	//   61  123:new             #18  <Class CrashlyticsController$15>
	//   62  126:dup             
	//   63  127:aload_0         
	//   64  128:aload           5
	//   65  130:invokespecial   #1396 <Method void CrashlyticsController$15(CrashlyticsController, Set)>
	//   66  133:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
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
	//   80  157:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//   81  160:astore          7
			StringBuilder stringbuilder1 = new StringBuilder();
	//   82  162:new             #471 <Class StringBuilder>
	//   83  165:dup             
	//   84  166:invokespecial   #472 <Method void StringBuilder()>
	//   85  169:astore          8
			stringbuilder1.append("Moving session file: ");
	//   86  171:aload           8
	//   87  173:ldc2            #1398 <String "Moving session file: ">
	//   88  176:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   89  179:pop             
			stringbuilder1.append(((Object) (file1)));
	//   90  180:aload           8
	//   91  182:aload           6
	//   92  184:invokevirtual   #576 <Method StringBuilder StringBuilder.append(Object)>
	//   93  187:pop             
			logger1.d("CrashlyticsCore", stringbuilder1.toString());
	//   94  188:aload           7
	//   95  190:ldc2            #457 <String "CrashlyticsCore">
	//   96  193:aload           8
	//   97  195:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   98  198:invokeinterface #465 <Method void Logger.d(String, String)>
			if(!file1.renameTo(new File(((File) (afile)), file1.getName())))
	//*  99  203:aload           6
	//* 100  205:new             #519 <Class File>
	//* 101  208:dup             
	//* 102  209:aload_1         
	//* 103  210:aload           6
	//* 104  212:invokevirtual   #753 <Method String File.getName()>
	//* 105  215:invokespecial   #686 <Method void File(File, String)>
	//* 106  218:invokevirtual   #1402 <Method boolean File.renameTo(File)>
	//* 107  221:ifne            276
			{
				Logger logger2 = Fabric.getLogger();
	//  108  224:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//  109  227:astore          7
				StringBuilder stringbuilder2 = new StringBuilder();
	//  110  229:new             #471 <Class StringBuilder>
	//  111  232:dup             
	//  112  233:invokespecial   #472 <Method void StringBuilder()>
	//  113  236:astore          8
				stringbuilder2.append("Could not move session file. Deleting ");
	//  114  238:aload           8
	//  115  240:ldc2            #1404 <String "Could not move session file. Deleting ">
	//  116  243:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//  117  246:pop             
				stringbuilder2.append(((Object) (file1)));
	//  118  247:aload           8
	//  119  249:aload           6
	//  120  251:invokevirtual   #576 <Method StringBuilder StringBuilder.append(Object)>
	//  121  254:pop             
				logger2.d("CrashlyticsCore", stringbuilder2.toString());
	//  122  255:aload           7
	//  123  257:ldc2            #457 <String "CrashlyticsCore">
	//  124  260:aload           8
	//  125  262:invokevirtual   #481 <Method String StringBuilder.toString()>
	//  126  265:invokeinterface #465 <Method void Logger.d(String, String)>
				file1.delete();
	//  127  270:aload           6
	//  128  272:invokevirtual   #523 <Method boolean File.delete()>
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
	//  136  284:invokespecial   #1406 <Method void trimInvalidSessionFiles()>
	//  137  287:return          
	}

	void doCloseSessions(SessionSettingsData sessionsettingsdata)
		throws Exception
	{
		doCloseSessions(sessionsettingsdata, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #390 <Method void doCloseSessions(SessionSettingsData, boolean)>
	//    4    6:return          
	}

	void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, boolean flag)
	{
		openSession();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1412 <Method void openSession()>
		crashHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {

			public void onUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsdataprovider, Thread thread, Throwable throwable, boolean flag1)
			{
				handleUncaughtException(settingsdataprovider, thread, throwable, flag1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsController this$0>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:iload           4
			//    6    9:invokevirtual   #26  <Method void CrashlyticsController.handleUncaughtException(CrashlyticsUncaughtExceptionHandler$SettingsDataProvider, Thread, Throwable, boolean)>
			//    7   12:return          
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
, ((CrashlyticsUncaughtExceptionHandler.SettingsDataProvider) (new DefaultSettingsDataProvider())), flag, uncaughtexceptionhandler);
	//    2    4:aload_0         
	//    3    5:new             #1414 <Class CrashlyticsUncaughtExceptionHandler>
	//    4    8:dup             
	//    5    9:new             #56  <Class CrashlyticsController$6>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #1415 <Method void CrashlyticsController$6(CrashlyticsController)>
	//    9   17:new             #70  <Class CrashlyticsController$DefaultSettingsDataProvider>
	//   10   20:dup             
	//   11   21:aconst_null     
	//   12   22:invokespecial   #1416 <Method void CrashlyticsController$DefaultSettingsDataProvider(CrashlyticsController$1)>
	//   13   25:iload_2         
	//   14   26:aload_1         
	//   15   27:invokespecial   #1419 <Method void CrashlyticsUncaughtExceptionHandler(CrashlyticsUncaughtExceptionHandler$CrashListener, CrashlyticsUncaughtExceptionHandler$SettingsDataProvider, boolean, Thread$UncaughtExceptionHandler)>
	//   16   30:putfield        #1421 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (crashHandler)));
	//   17   33:aload_0         
	//   18   34:getfield        #1421 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
	//   19   37:invokestatic    #1425 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//   20   40:return          
	}

	boolean finalizeNativeReport(final CrashlyticsNdkData ndkData)
	{
		if(ndkData == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return ((Boolean)backgroundWorker.submitAndWait(new Callable() {

				public Boolean call()
					throws Exception
				{
					TreeSet treeset = ndkData.timestampedDirectories;
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field CrashlyticsNdkData val$ndkData>
				//    2    4:getfield        #36  <Field TreeSet CrashlyticsNdkData.timestampedDirectories>
				//    3    7:astore_1        
					String s = getPreviousSessionId();
				//    4    8:aload_0         
				//    5    9:getfield        #20  <Field CrashlyticsController this$0>
				//    6   12:invokestatic    #40  <Method String CrashlyticsController.access$1600(CrashlyticsController)>
				//    7   15:astore_2        
					if(s != null && !treeset.isEmpty())
				//*   8   16:aload_2         
				//*   9   17:ifnull          60
				//*  10   20:aload_1         
				//*  11   21:invokevirtual   #46  <Method boolean TreeSet.isEmpty()>
				//*  12   24:ifne            60
					{
						File file = (File)treeset.first();
				//   13   27:aload_1         
				//   14   28:invokevirtual   #50  <Method Object TreeSet.first()>
				//   15   31:checkcast       #52  <Class File>
				//   16   34:astore_3        
						if(file != null)
				//*  17   35:aload_3         
				//*  18   36:ifnull          60
						{
							CrashlyticsController crashlyticscontroller = CrashlyticsController.this;
				//   19   39:aload_0         
				//   20   40:getfield        #20  <Field CrashlyticsController this$0>
				//   21   43:astore          4
							crashlyticscontroller.finalizeMostRecentNativeCrash(crashlyticscontroller.crashlyticsCore.getContext(), file, s);
				//   22   45:aload           4
				//   23   47:aload           4
				//   24   49:invokestatic    #56  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
				//   25   52:invokevirtual   #62  <Method Context CrashlyticsCore.getContext()>
				//   26   55:aload_3         
				//   27   56:aload_2         
				//   28   57:invokestatic    #66  <Method void CrashlyticsController.access$1700(CrashlyticsController, Context, File, String)>
						}
					}
					recursiveDelete(((Set) (treeset)));
				//   29   60:aload_0         
				//   30   61:getfield        #20  <Field CrashlyticsController this$0>
				//   31   64:aload_1         
				//   32   65:invokestatic    #70  <Method void CrashlyticsController.access$1800(CrashlyticsController, Set)>
					return Boolean.TRUE;
				//   33   68:getstatic       #76  <Field Boolean Boolean.TRUE>
				//   34   71:areturn         
				}

				public volatile Object call()
					throws Exception
				{
					return ((Object) (call()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #79  <Method Boolean call()>
				//    2    4:areturn         
				}

				final CrashlyticsController this$0;
				final CrashlyticsNdkData val$ndkData;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsController this$0>
				ndkData = crashlyticsndkdata;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field CrashlyticsNdkData val$ndkData>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
)).booleanValue();
	//    4    6:aload_0         
	//    5    7:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    6   10:new             #20  <Class CrashlyticsController$16>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #1430 <Method void CrashlyticsController$16(CrashlyticsController, CrashlyticsNdkData)>
	//   11   19:invokevirtual   #1434 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//   12   22:checkcast       #1339 <Class Boolean>
	//   13   25:invokevirtual   #1437 <Method boolean Boolean.booleanValue()>
	//   14   28:ireturn         
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
	//    1    1:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #14  <Class CrashlyticsController$13>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1442 <Method void CrashlyticsController$13(CrashlyticsController, SessionSettingsData)>
	//    7   13:invokevirtual   #1434 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    8   16:checkcast       #1339 <Class Boolean>
	//    9   19:invokevirtual   #1437 <Method boolean Boolean.booleanValue()>
	//   10   22:ireturn         
	}

	File getFatalSessionFilesDir()
	{
		return new File(getFilesDir(), "fatal-sessions");
	//    0    0:new             #519 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #595 <Method File getFilesDir()>
	//    4    8:ldc1            #121 <String "fatal-sessions">
	//    5   10:invokespecial   #686 <Method void File(File, String)>
	//    6   13:areturn         
	}

	File getFilesDir()
	{
		return fileStore.getFilesDir();
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field FileStore fileStore>
	//    2    4:invokeinterface #685 <Method File FileStore.getFilesDir()>
	//    3    9:areturn         
	}

	File getInvalidFilesDir()
	{
		return new File(getFilesDir(), "invalidClsFiles");
	//    0    0:new             #519 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #595 <Method File getFilesDir()>
	//    4    8:ldc1            #145 <String "invalidClsFiles">
	//    5   10:invokespecial   #686 <Method void File(File, String)>
	//    6   13:areturn         
	}

	File getNonFatalSessionFilesDir()
	{
		return new File(getFilesDir(), "nonfatal-sessions");
	//    0    0:new             #519 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #595 <Method File getFilesDir()>
	//    4    8:ldc1            #159 <String "nonfatal-sessions">
	//    5   10:invokespecial   #686 <Method void File(File, String)>
	//    6   13:areturn         
	}

	void handleUncaughtException(final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, final Thread thread, final Throwable ex, final boolean firebaseCrashlyticsClientFlag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		final Date time = ((Date) (Fabric.getLogger()));
	//    2    2:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    3    5:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    4    7:new             #471 <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #472 <Method void StringBuilder()>
	//    7   14:astore          6
		stringbuilder.append("Crashlytics is handling uncaught exception \"");
	//    8   16:aload           6
	//    9   18:ldc2            #1446 <String "Crashlytics is handling uncaught exception \"">
	//   10   21:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(((Object) (ex)));
	//   12   25:aload           6
	//   13   27:aload_3         
	//   14   28:invokevirtual   #576 <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:pop             
		stringbuilder.append("\" from thread ");
	//   16   32:aload           6
	//   17   34:ldc2            #578 <String "\" from thread ">
	//   18   37:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append(thread.getName());
	//   20   41:aload           6
	//   21   43:aload_2         
	//   22   44:invokevirtual   #581 <Method String Thread.getName()>
	//   23   47:invokevirtual   #478 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		((Logger) (time)).d("CrashlyticsCore", stringbuilder.toString());
	//   25   51:aload           5
	//   26   53:ldc2            #457 <String "CrashlyticsCore">
	//   27   56:aload           6
	//   28   58:invokevirtual   #481 <Method String StringBuilder.toString()>
	//   29   61:invokeinterface #465 <Method void Logger.d(String, String)>
		devicePowerStateListener.dispose();
	//   30   66:aload_0         
	//   31   67:getfield        #355 <Field DevicePowerStateListener devicePowerStateListener>
	//   32   70:invokevirtual   #1449 <Method void DevicePowerStateListener.dispose()>
		time = new Date();
	//   33   73:new             #532 <Class Date>
	//   34   76:dup             
	//   35   77:invokespecial   #533 <Method void Date()>
	//   36   80:astore          5
		backgroundWorker.submitAndWait(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #49  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				crashlyticsCore.createCrashMarker();
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #54  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
			//    3    7:invokevirtual   #59  <Method void CrashlyticsCore.createCrashMarker()>
				writeFatal(time, thread, ex);
			//    4   10:aload_0         
			//    5   11:getfield        #28  <Field CrashlyticsController this$0>
			//    6   14:aload_0         
			//    7   15:getfield        #30  <Field Date val$time>
			//    8   18:aload_0         
			//    9   19:getfield        #32  <Field Thread val$thread>
			//   10   22:aload_0         
			//   11   23:getfield        #34  <Field Throwable val$ex>
			//   12   26:invokestatic    #63  <Method void CrashlyticsController.access$500(CrashlyticsController, Date, Thread, Throwable)>
				SettingsData settingsdata = settingsDataProvider.getSettingsData();
			//   13   29:aload_0         
			//   14   30:getfield        #36  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider val$settingsDataProvider>
			//   15   33:invokeinterface #69  <Method SettingsData CrashlyticsUncaughtExceptionHandler$SettingsDataProvider.getSettingsData()>
			//   16   38:astore          5
				SessionSettingsData sessionsettingsdata;
				Object obj;
				if(settingsdata != null)
			//*  17   40:aload           5
			//*  18   42:ifnull          61
				{
					sessionsettingsdata = settingsdata.sessionData;
			//   19   45:aload           5
			//   20   47:getfield        #75  <Field SessionSettingsData SettingsData.sessionData>
			//   21   50:astore_3        
					obj = ((Object) (settingsdata.featuresData));
			//   22   51:aload           5
			//   23   53:getfield        #79  <Field FeaturesSettingsData SettingsData.featuresData>
			//   24   56:astore          4
				} else
			//*  25   58:goto            66
				{
					sessionsettingsdata = null;
			//   26   61:aconst_null     
			//   27   62:astore_3        
					obj = ((Object) (sessionsettingsdata));
			//   28   63:aload_3         
			//   29   64:astore          4
				}
				boolean flag1 = false;
			//   30   66:iconst_0        
			//   31   67:istore_2        
				boolean flag;
				if(obj != null && !((FeaturesSettingsData) (obj)).firebaseCrashlyticsEnabled)
			//*  32   68:aload           4
			//*  33   70:ifnull          89
			//*  34   73:aload           4
			//*  35   75:getfield        #84  <Field boolean FeaturesSettingsData.firebaseCrashlyticsEnabled>
			//*  36   78:ifeq            84
			//*  37   81:goto            89
					flag = false;
			//   38   84:iconst_0        
			//   39   85:istore_1        
				else
			//*  40   86:goto            91
					flag = true;
			//   41   89:iconst_1        
			//   42   90:istore_1        
				if(flag || firebaseCrashlyticsClientFlag)
			//*  43   91:iload_1         
			//*  44   92:ifne            102
			//*  45   95:aload_0         
			//*  46   96:getfield        #38  <Field boolean val$firebaseCrashlyticsClientFlag>
			//*  47   99:ifeq            116
					recordFatalFirebaseEvent(time.getTime());
			//   48  102:aload_0         
			//   49  103:getfield        #28  <Field CrashlyticsController this$0>
			//   50  106:aload_0         
			//   51  107:getfield        #30  <Field Date val$time>
			//   52  110:invokevirtual   #90  <Method long Date.getTime()>
			//   53  113:invokestatic    #94  <Method void CrashlyticsController.access$600(CrashlyticsController, long)>
				doCloseSessions(sessionsettingsdata);
			//   54  116:aload_0         
			//   55  117:getfield        #28  <Field CrashlyticsController this$0>
			//   56  120:aload_3         
			//   57  121:invokevirtual   #98  <Method void CrashlyticsController.doCloseSessions(SessionSettingsData)>
				doOpenSession();
			//   58  124:aload_0         
			//   59  125:getfield        #28  <Field CrashlyticsController this$0>
			//   60  128:invokestatic    #102 <Method void CrashlyticsController.access$700(CrashlyticsController)>
				if(sessionsettingsdata != null)
			//*  61  131:aload_3         
			//*  62  132:ifnull          146
					trimSessionFiles(sessionsettingsdata.maxCompleteSessionsCount);
			//   63  135:aload_0         
			//   64  136:getfield        #28  <Field CrashlyticsController this$0>
			//   65  139:aload_3         
			//   66  140:getfield        #108 <Field int SessionSettingsData.maxCompleteSessionsCount>
			//   67  143:invokevirtual   #112 <Method void CrashlyticsController.trimSessionFiles(int)>
				flag = flag1;
			//   68  146:iload_2         
			//   69  147:istore_1        
				if(DataCollectionArbiter.getInstance(crashlyticsCore.getContext()).isDataCollectionEnabled())
			//*  70  148:aload_0         
			//*  71  149:getfield        #28  <Field CrashlyticsController this$0>
			//*  72  152:invokestatic    #54  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
			//*  73  155:invokevirtual   #116 <Method Context CrashlyticsCore.getContext()>
			//*  74  158:invokestatic    #122 <Method DataCollectionArbiter DataCollectionArbiter.getInstance(Context)>
			//*  75  161:invokevirtual   #126 <Method boolean DataCollectionArbiter.isDataCollectionEnabled()>
			//*  76  164:ifeq            183
				{
					flag = flag1;
			//   77  167:iload_2         
			//   78  168:istore_1        
					if(!shouldPromptUserBeforeSendingCrashReports(settingsdata))
			//*  79  169:aload_0         
			//*  80  170:getfield        #28  <Field CrashlyticsController this$0>
			//*  81  173:aload           5
			//*  82  175:invokestatic    #130 <Method boolean CrashlyticsController.access$800(CrashlyticsController, SettingsData)>
			//*  83  178:ifne            183
						flag = true;
			//   84  181:iconst_1        
			//   85  182:istore_1        
				}
				if(flag)
			//*  86  183:iload_1         
			//*  87  184:ifeq            196
					sendSessionReports(settingsdata);
			//   88  187:aload_0         
			//   89  188:getfield        #28  <Field CrashlyticsController this$0>
			//   90  191:aload           5
			//   91  193:invokestatic    #134 <Method void CrashlyticsController.access$900(CrashlyticsController, SettingsData)>
				return null;
			//   92  196:aconst_null     
			//   93  197:areturn         
			}

			final CrashlyticsController this$0;
			final Throwable val$ex;
			final boolean val$firebaseCrashlyticsClientFlag;
			final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider val$settingsDataProvider;
			final Thread val$thread;
			final Date val$time;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #28  <Field CrashlyticsController this$0>
				time = date;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #30  <Field Date val$time>
				thread = thread1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #32  <Field Thread val$thread>
				ex = throwable;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #34  <Field Throwable val$ex>
				settingsDataProvider = settingsdataprovider;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #36  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider val$settingsDataProvider>
				firebaseCrashlyticsClientFlag = flag;
			//   15   27:aload_0         
			//   16   28:iload           6
			//   17   30:putfield        #38  <Field boolean val$firebaseCrashlyticsClientFlag>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #41  <Method void Object()>
			//   20   37:return          
			}
		}
);
	//   37   82:aload_0         
	//   38   83:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//   39   86:new             #58  <Class CrashlyticsController$7>
	//   40   89:dup             
	//   41   90:aload_0         
	//   42   91:aload           5
	//   43   93:aload_2         
	//   44   94:aload_3         
	//   45   95:aload_1         
	//   46   96:iload           4
	//   47   98:invokespecial   #1452 <Method void CrashlyticsController$7(CrashlyticsController, Date, Thread, Throwable, CrashlyticsUncaughtExceptionHandler$SettingsDataProvider, boolean)>
	//   48  101:invokevirtual   #1434 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//   49  104:pop             
		this;
	//   50  105:aload_0         
		JVM INSTR monitorexit ;
	//   51  106:monitorexit     
		return;
	//   52  107:return          
		settingsDataProvider;
	//   53  108:astore_1        
	//*  54  109:aload_0         
		throw settingsDataProvider;
	//   55  110:monitorexit     
	//   56  111:aload_1         
	//   57  112:athrow          
	}

	boolean hasOpenSession()
	{
		return listSessionBeginFiles().length > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #839 <Method File[] listSessionBeginFiles()>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	boolean isHandlingException()
	{
		CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = crashHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #1421 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
	//    2    4:astore_1        
		return crashlyticsuncaughtexceptionhandler != null && crashlyticsuncaughtexceptionhandler.isHandlingException();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1454 <Method boolean CrashlyticsUncaughtExceptionHandler.isHandlingException()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	File[] listCompleteSessionFiles()
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #1267 <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #1268 <Method void LinkedList()>
	//    3    7:astore_1        
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #999 <Method File getFatalSessionFilesDir()>
	//    8   14:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//    9   17:invokespecial   #835 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   10   20:invokestatic    #1458 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   11   23:pop             
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER))));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #1002 <Method File getNonFatalSessionFilesDir()>
	//   16   30:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//   17   33:invokespecial   #835 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   18   36:invokestatic    #1458 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   19   39:pop             
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getFilesDir(), SESSION_FILE_FILTER))));
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #595 <Method File getFilesDir()>
	//   24   46:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//   25   49:invokespecial   #835 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   26   52:invokestatic    #1458 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   27   55:pop             
		return (File[])((List) (linkedlist)).toArray(((Object []) (new File[((List) (linkedlist)).size()])));
	//   28   56:aload_1         
	//   29   57:aload_1         
	//   30   58:invokeinterface #1459 <Method int List.size()>
	//   31   63:anewarray       File[]
	//   32   66:invokeinterface #1463 <Method Object[] List.toArray(Object[])>
	//   33   71:checkcast       #1465 <Class File[]>
	//   34   74:areturn         
	}

	File[] listNativeSessionFileDirectories()
	{
		return listFilesMatching(SESSION_DIRECTORY_FILTER);
	//    0    0:aload_0         
	//    1    1:getstatic       #254 <Field FileFilter SESSION_DIRECTORY_FILTER>
	//    2    4:invokespecial   #1468 <Method File[] listFilesMatching(FileFilter)>
	//    3    7:areturn         
	}

	File[] listSessionBeginFiles()
	{
		return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
	//    0    0:aload_0         
	//    1    1:getstatic       #247 <Field FilenameFilter SESSION_BEGIN_FILE_FILTER>
	//    2    4:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    7:areturn         
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
			//    2    4:invokestatic    #32  <Method void CrashlyticsController.access$700(CrashlyticsController)>
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
	//    1    1:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #12  <Class CrashlyticsController$12>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1469 <Method void CrashlyticsController$12(CrashlyticsController)>
	//    6   12:invokevirtual   #1379 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void registerAnalyticsEventListener(SettingsData settingsdata)
	{
		if(settingsdata.featuresData.firebaseCrashlyticsEnabled && appMeasurementEventListenerRegistrar.register())
	//*   0    0:aload_1         
	//*   1    1:getfield        #984 <Field FeaturesSettingsData SettingsData.featuresData>
	//*   2    4:getfield        #1473 <Field boolean FeaturesSettingsData.firebaseCrashlyticsEnabled>
	//*   3    7:ifeq            36
	//*   4   10:aload_0         
	//*   5   11:getfield        #320 <Field AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar>
	//*   6   14:invokeinterface #1478 <Method boolean AppMeasurementEventListenerRegistrar.register()>
	//*   7   19:ifeq            36
			Fabric.getLogger().d("CrashlyticsCore", "Registered Firebase Analytics event listener");
	//    8   22:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    9   25:ldc2            #457 <String "CrashlyticsCore">
	//   10   28:ldc2            #1480 <String "Registered Firebase Analytics event listener">
	//   11   31:invokeinterface #465 <Method void Logger.d(String, String)>
	//   12   36:return          
	}

	void registerDevicePowerStateListener()
	{
		devicePowerStateListener.initialize();
	//    0    0:aload_0         
	//    1    1:getfield        #355 <Field DevicePowerStateListener devicePowerStateListener>
	//    2    4:invokevirtual   #1484 <Method void DevicePowerStateListener.initialize()>
	//    3    7:return          
	}

	void submitAllReports(float f, SettingsData settingsdata)
	{
		if(settingsdata == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       19
		{
			Fabric.getLogger().w("CrashlyticsCore", "Could not send reports. Settings are not available.");
	//    2    4:invokestatic    #455 <Method Logger Fabric.getLogger()>
	//    3    7:ldc2            #457 <String "CrashlyticsCore">
	//    4   10:ldc2            #1488 <String "Could not send reports. Settings are not available.">
	//    5   13:invokeinterface #720 <Method void Logger.w(String, String)>
			return;
	//    6   18:return          
		}
		CreateReportSpiCall createreportspicall = getCreateReportSpiCall(settingsdata.appData.reportsUrl, settingsdata.appData.ndkReportsUrl);
	//    7   19:aload_0         
	//    8   20:aload_2         
	//    9   21:getfield        #943 <Field AppSettingsData SettingsData.appData>
	//   10   24:getfield        #948 <Field String AppSettingsData.reportsUrl>
	//   11   27:aload_2         
	//   12   28:getfield        #943 <Field AppSettingsData SettingsData.appData>
	//   13   31:getfield        #951 <Field String AppSettingsData.ndkReportsUrl>
	//   14   34:invokespecial   #953 <Method CreateReportSpiCall getCreateReportSpiCall(String, String)>
	//   15   37:astore_3        
		if(shouldPromptUserBeforeSendingCrashReports(settingsdata))
	//*  16   38:aload_0         
	//*  17   39:aload_2         
	//*  18   40:invokespecial   #441 <Method boolean shouldPromptUserBeforeSendingCrashReports(SettingsData)>
	//*  19   43:ifeq            69
			settingsdata = ((SettingsData) (new PrivacyDialogCheck(((Kit) (crashlyticsCore)), preferenceManager, settingsdata.promptData)));
	//   20   46:new             #85  <Class CrashlyticsController$PrivacyDialogCheck>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   24   54:aload_0         
	//   25   55:getfield        #306 <Field PreferenceManager preferenceManager>
	//   26   58:aload_2         
	//   27   59:getfield        #1492 <Field PromptSettingsData SettingsData.promptData>
	//   28   62:invokespecial   #1495 <Method void CrashlyticsController$PrivacyDialogCheck(Kit, PreferenceManager, PromptSettingsData)>
	//   29   65:astore_2        
		else
	//*  30   66:goto            77
			settingsdata = ((SettingsData) (new ReportUploader.AlwaysSendCheck()));
	//   31   69:new             #1497 <Class ReportUploader$AlwaysSendCheck>
	//   32   72:dup             
	//   33   73:invokespecial   #1498 <Method void ReportUploader$AlwaysSendCheck()>
	//   34   76:astore_2        
		(new ReportUploader(appData.apiKey, createreportspicall, reportFilesProvider, handlingExceptionCheck)).uploadReports(f, ((ReportUploader.SendCheck) (settingsdata)));
	//   35   77:new             #955 <Class ReportUploader>
	//   36   80:dup             
	//   37   81:aload_0         
	//   38   82:getfield        #310 <Field AppData appData>
	//   39   85:getfield        #960 <Field String AppData.apiKey>
	//   40   88:aload_3         
	//   41   89:aload_0         
	//   42   90:getfield        #345 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   43   93:aload_0         
	//   44   94:getfield        #348 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
	//   45   97:invokespecial   #963 <Method void ReportUploader(String, CreateReportSpiCall, ReportUploader$ReportFilesProvider, ReportUploader$HandlingExceptionCheck)>
	//   46  100:fload_1         
	//   47  101:aload_2         
	//   48  102:invokevirtual   #1502 <Method void ReportUploader.uploadReports(float, ReportUploader$SendCheck)>
	//   49  105:return          
	}

	void trimSessionFiles(int i)
	{
		i -= Utils.capFileCount(getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #999 <Method File getFatalSessionFilesDir()>
	//    3    5:iload_1         
	//    4    6:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #1506 <Method int Utils.capFileCount(File, int, Comparator)>
	//    6   12:isub            
	//    7   13:istore_1        
		int j = Utils.capFileCount(getNonFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
	//    8   14:aload_0         
	//    9   15:invokevirtual   #1002 <Method File getNonFatalSessionFilesDir()>
	//   10   18:iload_1         
	//   11   19:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   12   22:invokestatic    #1506 <Method int Utils.capFileCount(File, int, Comparator)>
	//   13   25:istore_2        
		Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, i - j, SMALLEST_FILE_NAME_FIRST);
	//   14   26:aload_0         
	//   15   27:invokevirtual   #595 <Method File getFilesDir()>
	//   16   30:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//   17   33:iload_1         
	//   18   34:iload_2         
	//   19   35:isub            
	//   20   36:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   21   39:invokestatic    #1092 <Method int Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   22   42:pop             
	//   23   43:return          
	}

	void writeNonFatalException(final Thread thread, final Throwable ex)
	{
		final Date now = new Date();
	//    0    0:new             #532 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #533 <Method void Date()>
	//    3    7:astore_3        
		backgroundWorker.submit(new Runnable() {

			public void run()
			{
				if(!isHandlingException())
			//*   0    0:aload_0         
			//*   1    1:getfield        #23  <Field CrashlyticsController this$0>
			//*   2    4:invokevirtual   #38  <Method boolean CrashlyticsController.isHandlingException()>
			//*   3    7:ifne            29
					doWriteNonFatal(now, thread, ex);
			//    4   10:aload_0         
			//    5   11:getfield        #23  <Field CrashlyticsController this$0>
			//    6   14:aload_0         
			//    7   15:getfield        #25  <Field Date val$now>
			//    8   18:aload_0         
			//    9   19:getfield        #27  <Field Thread val$thread>
			//   10   22:aload_0         
			//   11   23:getfield        #29  <Field Throwable val$ex>
			//   12   26:invokestatic    #41  <Method void CrashlyticsController.access$1100(CrashlyticsController, Date, Thread, Throwable)>
			//   13   29:return          
			}

			final CrashlyticsController this$0;
			final Throwable val$ex;
			final Date val$now;
			final Thread val$thread;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CrashlyticsController this$0>
				now = date;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Date val$now>
				thread = thread1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Thread val$thread>
				ex = throwable;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field Throwable val$ex>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    4    8:aload_0         
	//    5    9:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    6   12:new             #62  <Class CrashlyticsController$9>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #1510 <Method void CrashlyticsController$9(CrashlyticsController, Date, Thread, Throwable)>
	//   13   23:invokevirtual   #980 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//   14   26:pop             
	//   15   27:return          
	}

	void writeToLog(final long timestamp, final String msg)
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #37  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				if(!isHandlingException())
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field CrashlyticsController this$0>
			//*   2    4:invokevirtual   #42  <Method boolean CrashlyticsController.isHandlingException()>
			//*   3    7:ifne            28
					logFileManager.writeToLog(timestamp, msg);
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field CrashlyticsController this$0>
			//    6   14:invokestatic    #46  <Method LogFileManager CrashlyticsController.access$1000(CrashlyticsController)>
			//    7   17:aload_0         
			//    8   18:getfield        #24  <Field long val$timestamp>
			//    9   21:aload_0         
			//   10   22:getfield        #26  <Field String val$msg>
			//   11   25:invokevirtual   #49  <Method void LogFileManager.writeToLog(long, String)>
				return null;
			//   12   28:aconst_null     
			//   13   29:areturn         
			}

			final CrashlyticsController this$0;
			final String val$msg;
			final long val$timestamp;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CrashlyticsController this$0>
				timestamp = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #24  <Field long val$timestamp>
				msg = s;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #26  <Field String val$msg>
				super();
			//    9   16:aload_0         
			//   10   17:invokespecial   #29  <Method void Object()>
			//   11   20:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #60  <Class CrashlyticsController$8>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:aload_3         
	//    7   11:invokespecial   #1515 <Method void CrashlyticsController$8(CrashlyticsController, long, String)>
	//    8   14:invokevirtual   #1379 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    9   17:pop             
	//   10   18:return          
	}

	private static final int ANALYZER_VERSION = 1;
	private static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
	private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
	private static final String EVENT_TYPE_CRASH = "crash";
	private static final String EVENT_TYPE_LOGGED = "error";
	static final String FATAL_SESSION_DIR = "fatal-sessions";
	static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
	static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
	static final String FIREBASE_CRASH_TYPE = "fatal";
	static final int FIREBASE_CRASH_TYPE_FATAL = 1;
	static final String FIREBASE_REALTIME = "_r";
	static final String FIREBASE_TIMESTAMP = "timestamp";
	private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
	private static final String INITIAL_SESSION_PART_TAGS[] = {
		"SessionUser", "SessionApp", "SessionOS", "SessionDevice"
	};
	static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
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
	static final int MAX_INVALID_SESSIONS = 4;
	private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
	static final int MAX_OPEN_SESSIONS = 8;
	static final int MAX_STACK_SIZE = 1024;
	static final String NONFATAL_SESSION_DIR = "nonfatal-sessions";
	static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
	private static final Map SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
	static final String SESSION_APP_TAG = "SessionApp";
	static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter("BeginSession") {

		public boolean accept(File file, String s)
		{
			return super.accept(file, s) && s.endsWith(".cls");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method boolean CrashlyticsController$FileNameContainsFilter.accept(File, String)>
		//    4    6:ifeq            20
		//    5    9:aload_2         
		//    6   10:ldc1            #17  <String ".cls">
		//    7   12:invokevirtual   #23  <Method boolean String.endsWith(String)>
		//    8   15:ifeq            20
		//    9   18:iconst_1        
		//   10   19:ireturn         
		//   11   20:iconst_0        
		//   12   21:ireturn         
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokespecial   #10  <Method void CrashlyticsController$FileNameContainsFilter(String)>
			//    3    5:return          
			}
	}
;
	static final String SESSION_BEGIN_TAG = "BeginSession";
	static final String SESSION_DEVICE_TAG = "SessionDevice";
	static final FileFilter SESSION_DIRECTORY_FILTER = new FileFilter() {

		public boolean accept(File file)
		{
			return file.isDirectory() && file.getName().length() == 35;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #21  <Method boolean File.isDirectory()>
		//    2    4:ifeq            21
		//    3    7:aload_1         
		//    4    8:invokevirtual   #25  <Method String File.getName()>
		//    5   11:invokevirtual   #31  <Method int String.length()>
		//    6   14:bipush          35
		//    7   16:icmpne          21
		//    8   19:iconst_1        
		//    9   20:ireturn         
		//   10   21:iconst_0        
		//   11   22:ireturn         
		}

	}
;
	static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
	static final String SESSION_FATAL_TAG = "SessionCrash";
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
	private static final int SESSION_ID_LENGTH = 35;
	static final String SESSION_JSON_SUFFIX = ".json";
	static final String SESSION_NON_FATAL_TAG = "SessionEvent";
	static final String SESSION_OS_TAG = "SessionOS";
	static final String SESSION_USER_TAG = "SessionUser";
	private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
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
	private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
	private final CrashlyticsBackgroundWorker backgroundWorker;
	private CrashlyticsUncaughtExceptionHandler crashHandler;
	private final CrashlyticsCore crashlyticsCore;
	private final DevicePowerStateListener devicePowerStateListener;
	private final AtomicInteger eventCounter = new AtomicInteger(0);
	private final FileStore fileStore;
	private final EventLogger firebaseAnalyticsLogger;
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
	//    2    4:ldc1            #172 <String "BeginSession">
	//    3    6:invokespecial   #245 <Method void CrashlyticsController$1(String)>
	//    4    9:putstatic       #247 <Field FilenameFilter SESSION_BEGIN_FILE_FILTER>
	//    5   12:new             #30  <Class CrashlyticsController$2>
	//    6   15:dup             
	//    7   16:invokespecial   #249 <Method void CrashlyticsController$2()>
	//    8   19:putstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//    9   22:new             #50  <Class CrashlyticsController$3>
	//   10   25:dup             
	//   11   26:invokespecial   #252 <Method void CrashlyticsController$3()>
	//   12   29:putstatic       #254 <Field FileFilter SESSION_DIRECTORY_FILTER>
	//   13   32:new             #52  <Class CrashlyticsController$4>
	//   14   35:dup             
	//   15   36:invokespecial   #255 <Method void CrashlyticsController$4()>
	//   16   39:putstatic       #257 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//   17   42:new             #54  <Class CrashlyticsController$5>
	//   18   45:dup             
	//   19   46:invokespecial   #258 <Method void CrashlyticsController$5()>
	//   20   49:putstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   21   52:ldc2            #262 <String "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+">
	//   22   55:invokestatic    #268 <Method Pattern Pattern.compile(String)>
	//   23   58:putstatic       #270 <Field Pattern SESSION_FILE_PATTERN>
	//   24   61:ldc2            #272 <String "X-CRASHLYTICS-SEND-FLAGS">
	//   25   64:ldc2            #274 <String "1">
	//   26   67:invokestatic    #280 <Method Map Collections.singletonMap(Object, Object)>
	//   27   70:putstatic       #282 <Field Map SEND_AT_CRASHTIME_HEADER>
	//   28   73:iconst_4        
	//   29   74:anewarray       String[]
	//   30   77:dup             
	//   31   78:iconst_0        
	//   32   79:ldc1            #200 <String "SessionUser">
	//   33   81:aastore         
	//   34   82:dup             
	//   35   83:iconst_1        
	//   36   84:ldc1            #167 <String "SessionApp">
	//   37   86:aastore         
	//   38   87:dup             
	//   39   88:iconst_2        
	//   40   89:ldc1            #197 <String "SessionOS">
	//   41   91:aastore         
	//   42   92:dup             
	//   43   93:iconst_3        
	//   44   94:ldc1            #175 <String "SessionDevice">
	//   45   96:aastore         
	//   46   97:putstatic       #286 <Field String[] INITIAL_SESSION_PART_TAGS>
	//*  47  100:return          
	}


/*
	static Pattern access$000()
	{
		return SESSION_FILE_PATTERN;
	//    0    0:getstatic       #270 <Field Pattern SESSION_FILE_PATTERN>
	//    1    3:areturn         
	}

*/


/*
	static LogFileManager access$1000(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.logFileManager;
	//    0    0:aload_0         
	//    1    1:getfield        #340 <Field LogFileManager logFileManager>
	//    2    4:areturn         
	}

*/


/*
	static void access$1100(CrashlyticsController crashlyticscontroller, Date date, Thread thread, Throwable throwable)
	{
		crashlyticscontroller.doWriteNonFatal(date, thread, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #377 <Method void doWriteNonFatal(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static String access$1200(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.getCurrentSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #382 <Method String getCurrentSessionId()>
	//    2    4:areturn         
	}

*/


/*
	static void access$1300(CrashlyticsController crashlyticscontroller, SessionSettingsData sessionsettingsdata, boolean flag)
		throws Exception
	{
		crashlyticscontroller.doCloseSessions(sessionsettingsdata, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #390 <Method void doCloseSessions(SessionSettingsData, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static File[] access$1500(CrashlyticsController crashlyticscontroller, FilenameFilter filenamefilter)
	{
		return crashlyticscontroller.listFilesMatching(filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #397 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    5:areturn         
	}

*/


/*
	static String access$1600(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.getPreviousSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #401 <Method String getPreviousSessionId()>
	//    2    4:areturn         
	}

*/


/*
	static void access$1700(CrashlyticsController crashlyticscontroller, Context context, File file, String s)
		throws IOException
	{
		crashlyticscontroller.finalizeMostRecentNativeCrash(context, file, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #409 <Method void finalizeMostRecentNativeCrash(Context, File, String)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$1800(CrashlyticsController crashlyticscontroller, Set set)
	{
		crashlyticscontroller.recursiveDelete(set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #415 <Method void recursiveDelete(Set)>
		return;
	//    3    5:return          
	}

*/


/*
	static AppData access$1900(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.appData;
	//    0    0:aload_0         
	//    1    1:getfield        #310 <Field AppData appData>
	//    2    4:areturn         
	}

*/


/*
	static String access$2000(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.unityVersion;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field String unityVersion>
	//    2    4:areturn         
	}

*/


/*
	static CrashlyticsCore access$400(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.crashlyticsCore;
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:areturn         
	}

*/


/*
	static void access$500(CrashlyticsController crashlyticscontroller, Date date, Thread thread, Throwable throwable)
	{
		crashlyticscontroller.writeFatal(date, thread, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #424 <Method void writeFatal(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$600(CrashlyticsController crashlyticscontroller, long l)
	{
		crashlyticscontroller.recordFatalFirebaseEvent(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #430 <Method void recordFatalFirebaseEvent(long)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(CrashlyticsController crashlyticscontroller)
		throws Exception
	{
		crashlyticscontroller.doOpenSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #435 <Method void doOpenSession()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$800(CrashlyticsController crashlyticscontroller, SettingsData settingsdata)
	{
		return crashlyticscontroller.shouldPromptUserBeforeSendingCrashReports(settingsdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #441 <Method boolean shouldPromptUserBeforeSendingCrashReports(SettingsData)>
	//    3    5:ireturn         
	}

*/


/*
	static void access$900(CrashlyticsController crashlyticscontroller, SettingsData settingsdata)
	{
		crashlyticscontroller.sendSessionReports(settingsdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #447 <Method void sendSessionReports(SettingsData)>
		return;
	//    3    5:return          
	}

*/
}
