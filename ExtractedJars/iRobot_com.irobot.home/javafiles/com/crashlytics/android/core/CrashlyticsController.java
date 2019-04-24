// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import b.a.a.a.a.b.i;
import b.a.a.a.a.b.p;
import b.a.a.a.a.f.a;
import b.a.a.a.a.g.e;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.o;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.t;
import b.a.a.a.c;
import b.a.a.a.l;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
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

		public abstract void writeTo(CodedOutputStream codedoutputstream);
	}

	private static final class DefaultSettingsDataProvider
		implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider
	{

		public t getSettingsData()
		{
			return q.a().b();
		//    0    0:invokestatic    #24  <Method q q.a()>
		//    1    3:invokevirtual   #27  <Method t q.b()>
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

		public abstract void writeTo(FileOutputStream fileoutputstream);
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
			File file = new File(rootFileStore.a(), "log-files");
		//    0    0:new             #27  <Class File>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field a rootFileStore>
		//    4    8:invokeinterface #32  <Method File a.a()>
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
		private final a rootFileStore;

		public LogFileDirectoryProvider(a a1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			rootFileStore = a1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field a rootFileStore>
		//    5    9:return          
		}
	}

	private static final class PrivacyDialogCheck
		implements ReportUploader.SendCheck
	{

		public boolean canSendReports()
		{
			Activity activity = kit.getFabric().b();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field b.a.a.a.i kit>
		//    2    4:invokevirtual   #41  <Method c b.a.a.a.i.getFabric()>
		//    3    7:invokevirtual   #47  <Method Activity c.b()>
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
		//   18   36:getfield        #30  <Field o promptData>
		//   19   39:aload_2         
		//   20   40:invokestatic    #61  <Method CrashPromptDialog CrashPromptDialog.create(Activity, o, CrashPromptDialog$AlwaysSendCallback)>
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
				c.g().a("CrashlyticsCore", "Waiting for user opt-in.");
		//   29   57:invokestatic    #72  <Method l c.g()>
		//   30   60:ldc1            #74  <String "CrashlyticsCore">
		//   31   62:ldc1            #76  <String "Waiting for user opt-in.">
		//   32   64:invokeinterface #82  <Method void l.a(String, String)>
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

		private final b.a.a.a.i kit;
		private final PreferenceManager preferenceManager;
		private final o promptData;


/*
		static PreferenceManager access$2100(PrivacyDialogCheck privacydialogcheck)
		{
			return privacydialogcheck.preferenceManager;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field PreferenceManager preferenceManager>
		//    2    4:areturn         
		}

*/

		public PrivacyDialogCheck(b.a.a.a.i j, PreferenceManager preferencemanager, o o)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			kit = j;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field b.a.a.a.i kit>
			preferenceManager = preferencemanager;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #28  <Field PreferenceManager preferenceManager>
			promptData = o;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #30  <Field o promptData>
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
			if(!i.n(context))
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field Context context>
		//*   2    4:invokestatic    #34  <Method boolean i.n(Context)>
		//*   3    7:ifne            11
			{
				return;
		//    4   10:return          
			} else
			{
				c.g().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
		//    5   11:invokestatic    #40  <Method l c.g()>
		//    6   14:ldc1            #42  <String "CrashlyticsCore">
		//    7   16:ldc1            #44  <String "Attempting to send crash report at time of crash...">
		//    8   18:invokeinterface #50  <Method void l.a(String, String)>
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


	CrashlyticsController(CrashlyticsCore crashlyticscore, CrashlyticsBackgroundWorker crashlyticsbackgroundworker, b.a.a.a.a.e.e e1, p p1, PreferenceManager preferencemanager, a a1, AppData appdata, 
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
		httpRequestFactory = e1;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #302 <Field b.a.a.a.a.e.e httpRequestFactory>
		idManager = p1;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #304 <Field p idManager>
		preferenceManager = preferencemanager;
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:putfield        #306 <Field PreferenceManager preferenceManager>
		fileStore = a1;
	//   23   43:aload_0         
	//   24   44:aload           6
	//   25   46:putfield        #308 <Field a fileStore>
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
		logFileDirectoryProvider = new LogFileDirectoryProvider(a1);
	//   42   83:aload_0         
	//   43   84:new             #82  <Class CrashlyticsController$LogFileDirectoryProvider>
	//   44   87:dup             
	//   45   88:aload           6
	//   46   90:invokespecial   #331 <Method void CrashlyticsController$LogFileDirectoryProvider(a)>
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

	private void closeOpenSessions(File afile[], int j, int k)
	{
		c.g().a("CrashlyticsCore", "Closing open sessions.");
	//    0    0:invokestatic    #450 <Method l c.g()>
	//    1    3:ldc2            #452 <String "CrashlyticsCore">
	//    2    6:ldc2            #454 <String "Closing open sessions.">
	//    3    9:invokeinterface #460 <Method void l.a(String, String)>
		for(; j < afile.length; j++)
	//*   4   14:iload_2         
	//*   5   15:aload_1         
	//*   6   16:arraylength     
	//*   7   17:icmpge          94
		{
			File file = afile[j];
	//    8   20:aload_1         
	//    9   21:iload_2         
	//   10   22:aaload          
	//   11   23:astore          4
			String s = getSessionIdFromSessionFile(file);
	//   12   25:aload           4
	//   13   27:invokestatic    #464 <Method String getSessionIdFromSessionFile(File)>
	//   14   30:astore          5
			l l1 = c.g();
	//   15   32:invokestatic    #450 <Method l c.g()>
	//   16   35:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #466 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #467 <Method void StringBuilder()>
	//   20   44:astore          7
			stringbuilder.append("Closing session: ");
	//   21   46:aload           7
	//   22   48:ldc2            #469 <String "Closing session: ">
	//   23   51:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			stringbuilder.append(s);
	//   25   55:aload           7
	//   26   57:aload           5
	//   27   59:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   28   62:pop             
			l1.a("CrashlyticsCore", stringbuilder.toString());
	//   29   63:aload           6
	//   30   65:ldc2            #452 <String "CrashlyticsCore">
	//   31   68:aload           7
	//   32   70:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   33   73:invokeinterface #460 <Method void l.a(String, String)>
			writeSessionPartsToSessionFile(file, s, k);
	//   34   78:aload_0         
	//   35   79:aload           4
	//   36   81:aload           5
	//   37   83:iload_3         
	//   38   84:invokespecial   #480 <Method void writeSessionPartsToSessionFile(File, String, int)>
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
	//    4    6:invokevirtual   #489 <Method void ClsFileOutputStream.closeInProgressStream()>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ClsFileOutputStream clsfileoutputstream)
	//*   6   10:astore_1        
		{
			c.g().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (clsfileoutputstream)));
	//    7   11:invokestatic    #450 <Method l c.g()>
	//    8   14:ldc2            #452 <String "CrashlyticsCore">
	//    9   17:ldc2            #491 <String "Error closing session file stream in the presence of an exception">
	//   10   20:aload_1         
	//   11   21:invokeinterface #495 <Method void l.e(String, String, Throwable)>
		}
	//   12   26:return          
	}

	private static void copyToCodedOutputStream(InputStream inputstream, CodedOutputStream codedoutputstream, int j)
	{
		byte abyte0[] = new byte[j];
	//    0    0:iload_2         
	//    1    1:newarray        byte[]
	//    2    3:astore          4
		j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
		{
			if(j >= abyte0.length)
				break;
	//    5    7:iload_2         
	//    6    8:aload           4
	//    7   10:arraylength     
	//    8   11:icmpge          38
			int k = inputstream.read(abyte0, j, abyte0.length - j);
	//    9   14:aload_0         
	//   10   15:aload           4
	//   11   17:iload_2         
	//   12   18:aload           4
	//   13   20:arraylength     
	//   14   21:iload_2         
	//   15   22:isub            
	//   16   23:invokevirtual   #503 <Method int InputStream.read(byte[], int, int)>
	//   17   26:istore_3        
			if(k < 0)
				break;
	//   18   27:iload_3         
	//   19   28:iflt            38
			j += k;
	//   20   31:iload_2         
	//   21   32:iload_3         
	//   22   33:iadd            
	//   23   34:istore_2        
		} while(true);
	//   24   35:goto            7
		codedoutputstream.writeRawBytes(abyte0);
	//   25   38:aload_1         
	//   26   39:aload           4
	//   27   41:invokevirtual   #509 <Method void CodedOutputStream.writeRawBytes(byte[])>
	//   28   44:return          
	}

	private void deleteSessionPartFilesFor(String s)
	{
		s = ((String) (listSessionPartFilesFor(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #514 <Method File[] listSessionPartFilesFor(String)>
	//    3    5:astore_1        
		int k = s.length;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int j = 0; j < k; j++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          30
			((File) (s[j])).delete();
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:aaload          
	//   15   19:invokevirtual   #520 <Method boolean File.delete()>
	//   16   22:pop             

	//   17   23:iload_2         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_2        
	//*  21   27:goto            11
	//   22   30:return          
	}

	private void doCloseSessions(b.a.a.a.a.g.p p1, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #522 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #524 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #527 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void doOpenSession()
	{
		Date date = new Date();
	//    0    0:new             #529 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #530 <Method void Date()>
	//    3    7:astore_1        
		String s = (new CLSUUID(idManager)).toString();
	//    4    8:new             #532 <Class CLSUUID>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #304 <Field p idManager>
	//    8   16:invokespecial   #535 <Method void CLSUUID(p)>
	//    9   19:invokevirtual   #536 <Method String CLSUUID.toString()>
	//   10   22:astore_2        
		l l1 = c.g();
	//   11   23:invokestatic    #450 <Method l c.g()>
	//   12   26:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #466 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #467 <Method void StringBuilder()>
	//   16   34:astore          4
		stringbuilder.append("Opening a new session with ID ");
	//   17   36:aload           4
	//   18   38:ldc2            #538 <String "Opening a new session with ID ">
	//   19   41:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(s);
	//   21   45:aload           4
	//   22   47:aload_2         
	//   23   48:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		l1.a("CrashlyticsCore", stringbuilder.toString());
	//   25   52:aload_3         
	//   26   53:ldc2            #452 <String "CrashlyticsCore">
	//   27   56:aload           4
	//   28   58:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   29   61:invokeinterface #460 <Method void l.a(String, String)>
		writeBeginSession(s, date);
	//   30   66:aload_0         
	//   31   67:aload_2         
	//   32   68:aload_1         
	//   33   69:invokespecial   #542 <Method void writeBeginSession(String, Date)>
		writeSessionApp(s);
	//   34   72:aload_0         
	//   35   73:aload_2         
	//   36   74:invokespecial   #545 <Method void writeSessionApp(String)>
		writeSessionOS(s);
	//   37   77:aload_0         
	//   38   78:aload_2         
	//   39   79:invokespecial   #548 <Method void writeSessionOS(String)>
		writeSessionDevice(s);
	//   40   82:aload_0         
	//   41   83:aload_2         
	//   42   84:invokespecial   #551 <Method void writeSessionDevice(String)>
		logFileManager.setCurrentSession(s);
	//   43   87:aload_0         
	//   44   88:getfield        #340 <Field LogFileManager logFileManager>
	//   45   91:aload_2         
	//   46   92:invokevirtual   #554 <Method void LogFileManager.setCurrentSession(String)>
	//   47   95:return          
	}

	private void doWriteNonFatal(Date date, Thread thread, Throwable throwable)
	{
		Object obj1;
		ClsFileOutputStream clsfileoutputstream;
		Object obj2;
		String s;
		s = getCurrentSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #382 <Method String getCurrentSessionId()>
	//    2    4:astore          9
		clsfileoutputstream = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		obj1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		obj2 = null;
	//    7   12:aconst_null     
	//    8   13:astore          8
		if(s == null)
	//*   9   15:aload           9
	//*  10   17:ifnonnull       36
		{
			c.g().e("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", ((Throwable) (null)));
	//   11   20:invokestatic    #450 <Method l c.g()>
	//   12   23:ldc2            #452 <String "CrashlyticsCore">
	//   13   26:ldc2            #558 <String "Tried to write a non-fatal exception while no session was open.">
	//   14   29:aconst_null     
	//   15   30:invokeinterface #495 <Method void l.e(String, String, Throwable)>
			return;
	//   16   35:return          
		}
		recordLoggedExceptionAnswersEvent(s, ((Object) (throwable)).getClass().getName());
	//   17   36:aload           9
	//   18   38:aload_3         
	//   19   39:invokevirtual   #562 <Method Class Object.getClass()>
	//   20   42:invokevirtual   #567 <Method String Class.getName()>
	//   21   45:invokestatic    #570 <Method void recordLoggedExceptionAnswersEvent(String, String)>
		Object obj;
		obj = ((Object) (c.g()));
	//   22   48:invokestatic    #450 <Method l c.g()>
	//   23   51:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   24   53:new             #466 <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #467 <Method void StringBuilder()>
	//   27   60:astore          7
		stringbuilder.append("Crashlytics is logging non-fatal exception \"");
	//   28   62:aload           7
	//   29   64:ldc2            #572 <String "Crashlytics is logging non-fatal exception \"">
	//   30   67:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   31   70:pop             
		stringbuilder.append(((Object) (throwable)));
	//   32   71:aload           7
	//   33   73:aload_3         
	//   34   74:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//   35   77:pop             
		stringbuilder.append("\" from thread ");
	//   36   78:aload           7
	//   37   80:ldc2            #577 <String "\" from thread ">
	//   38   83:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   39   86:pop             
		stringbuilder.append(thread.getName());
	//   40   87:aload           7
	//   41   89:aload_2         
	//   42   90:invokevirtual   #580 <Method String Thread.getName()>
	//   43   93:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:pop             
		((l) (obj)).a("CrashlyticsCore", stringbuilder.toString());
	//   45   97:aload           4
	//   46   99:ldc2            #452 <String "CrashlyticsCore">
	//   47  102:aload           7
	//   48  104:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   49  107:invokeinterface #460 <Method void l.a(String, String)>
		obj = ((Object) (i.a(eventCounter.getAndIncrement())));
	//   50  112:aload_0         
	//   51  113:getfield        #296 <Field AtomicInteger eventCounter>
	//   52  116:invokevirtual   #584 <Method int AtomicInteger.getAndIncrement()>
	//   53  119:invokestatic    #589 <Method String i.a(int)>
	//   54  122:astore          4
		stringbuilder = new StringBuilder();
	//   55  124:new             #466 <Class StringBuilder>
	//   56  127:dup             
	//   57  128:invokespecial   #467 <Method void StringBuilder()>
	//   58  131:astore          7
		stringbuilder.append(s);
	//   59  133:aload           7
	//   60  135:aload           9
	//   61  137:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   62  140:pop             
		stringbuilder.append("SessionEvent");
	//   63  141:aload           7
	//   64  143:ldc1            #194 <String "SessionEvent">
	//   65  145:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   66  148:pop             
		stringbuilder.append(((String) (obj)));
	//   67  149:aload           7
	//   68  151:aload           4
	//   69  153:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   70  156:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   71  157:aload           7
	//   72  159:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   73  162:astore          4
		obj = ((Object) (new ClsFileOutputStream(getFilesDir(), ((String) (obj)))));
	//   74  164:new             #486 <Class ClsFileOutputStream>
	//   75  167:dup             
	//   76  168:aload_0         
	//   77  169:invokevirtual   #593 <Method File getFilesDir()>
	//   78  172:aload           4
	//   79  174:invokespecial   #596 <Method void ClsFileOutputStream(File, String)>
	//   80  177:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   81  179:aload           6
	//   82  181:astore          5
		clsfileoutputstream = ((ClsFileOutputStream) (obj));
	//   83  183:aload           4
	//   84  185:astore          6
		CodedOutputStream codedoutputstream;
		try
		{
			codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   85  187:aload           4
	//   86  189:invokestatic    #600 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   87  192:astore          7
		}
	//*  88  194:aload_0         
	//*  89  195:aload           7
	//*  90  197:aload_1         
	//*  91  198:aload_2         
	//*  92  199:aload_3         
	//*  93  200:ldc1            #118 <String "error">
	//*  94  202:iconst_0        
	//*  95  203:invokespecial   #604 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
	//*  96  206:aload           7
	//*  97  208:ldc2            #606 <String "Failed to flush to non-fatal file.">
	//*  98  211:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
	//*  99  214:goto            282
	//* 100  217:astore_1        
	//* 101  218:aload           7
	//* 102  220:astore          5
	//* 103  222:goto            321
	//* 104  225:astore_2        
	//* 105  226:aload           7
	//* 106  228:astore_1        
	//* 107  229:goto            253
		// Misplaced declaration of an exception variable
		catch(Thread thread)
	//* 108  232:astore_2        
		{
			date = ((Date) (obj2));
	//  109  233:aload           8
	//  110  235:astore_1        
			break MISSING_BLOCK_LABEL_253;
	//  111  236:goto            253
		}
		try
		{
			writeSessionEvent(codedoutputstream, date, thread, throwable, "error", false);
		}
		// Misplaced declaration of an exception variable
		catch(Thread thread)
		{
			date = ((Date) (codedoutputstream));
			break MISSING_BLOCK_LABEL_253;
		}
		i.a(((java.io.Flushable) (codedoutputstream)), "Failed to flush to non-fatal file.");
		break MISSING_BLOCK_LABEL_282;
		date;
		obj1 = ((Object) (codedoutputstream));
		break MISSING_BLOCK_LABEL_321;
		date;
	//  112  239:astore_1        
		obj = null;
	//  113  240:aconst_null     
	//  114  241:astore          4
		break MISSING_BLOCK_LABEL_321;
	//  115  243:goto            321
		thread;
	//  116  246:astore_2        
		obj = null;
	//  117  247:aconst_null     
	//  118  248:astore          4
		date = ((Date) (obj2));
	//  119  250:aload           8
	//  120  252:astore_1        
		obj1 = ((Object) (date));
	//  121  253:aload_1         
	//  122  254:astore          5
		clsfileoutputstream = ((ClsFileOutputStream) (obj));
	//  123  256:aload           4
	//  124  258:astore          6
		c.g().e("CrashlyticsCore", "An error occurred in the non-fatal exception logger", ((Throwable) (thread)));
	//  125  260:invokestatic    #450 <Method l c.g()>
	//  126  263:ldc2            #452 <String "CrashlyticsCore">
	//  127  266:ldc2            #611 <String "An error occurred in the non-fatal exception logger">
	//  128  269:aload_2         
	//  129  270:invokeinterface #495 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Flushable) (date)), "Failed to flush to non-fatal file.");
	//  130  275:aload_1         
	//  131  276:ldc2            #606 <String "Failed to flush to non-fatal file.">
	//  132  279:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		i.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
	//  133  282:aload           4
	//  134  284:ldc2            #613 <String "Failed to close non-fatal file output stream.">
	//  135  287:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		try
		{
			trimSessionEventFiles(s, 64);
	//  136  290:aload_0         
	//  137  291:aload           9
	//  138  293:bipush          64
	//  139  295:invokespecial   #620 <Method void trimSessionEventFiles(String, int)>
			return;
	//  140  298:return          
		}
		// Misplaced declaration of an exception variable
		catch(Date date)
	//* 141  299:astore_1        
		{
			c.g().e("CrashlyticsCore", "An error occurred when trimming non-fatal files.", ((Throwable) (date)));
	//  142  300:invokestatic    #450 <Method l c.g()>
	//  143  303:ldc2            #452 <String "CrashlyticsCore">
	//  144  306:ldc2            #622 <String "An error occurred when trimming non-fatal files.">
	//  145  309:aload_1         
	//  146  310:invokeinterface #495 <Method void l.e(String, String, Throwable)>
		}
		return;
	//  147  315:return          
		date;
	//  148  316:astore_1        
		obj = ((Object) (clsfileoutputstream));
	//  149  317:aload           6
	//  150  319:astore          4
		i.a(((java.io.Flushable) (obj1)), "Failed to flush to non-fatal file.");
	//  151  321:aload           5
	//  152  323:ldc2            #606 <String "Failed to flush to non-fatal file.">
	//  153  326:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		i.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
	//  154  329:aload           4
	//  155  331:ldc2            #613 <String "Failed to close non-fatal file output stream.">
	//  156  334:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		throw date;
	//  157  337:aload_1         
	//  158  338:athrow          
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
	{
		byte abyte0[] = NativeFileUtils.minidumpFromDirectory(file);
	//    0    0:aload_2         
	//    1    1:invokestatic    #630 <Method byte[] NativeFileUtils.minidumpFromDirectory(File)>
	//    2    4:astore          4
		byte abyte1[] = NativeFileUtils.metadataJsonFromDirectory(file);
	//    3    6:aload_2         
	//    4    7:invokestatic    #633 <Method byte[] NativeFileUtils.metadataJsonFromDirectory(File)>
	//    5   10:astore          5
		context = ((Context) (NativeFileUtils.binaryImagesJsonFromDirectory(file, context)));
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokestatic    #637 <Method byte[] NativeFileUtils.binaryImagesJsonFromDirectory(File, Context)>
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
	//   17   33:ldc2            #639 <String "<native-crash: minidump>">
	//   18   36:invokestatic    #642 <Method void recordFatalExceptionAnswersEvent(String, String)>
			file = ((File) (readFile(s, "BeginSession.json")));
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:ldc2            #644 <String "BeginSession.json">
	//   22   44:invokespecial   #648 <Method byte[] readFile(String, String)>
	//   23   47:astore_2        
			byte abyte2[] = readFile(s, "SessionApp.json");
	//   24   48:aload_0         
	//   25   49:aload_3         
	//   26   50:ldc2            #650 <String "SessionApp.json">
	//   27   53:invokespecial   #648 <Method byte[] readFile(String, String)>
	//   28   56:astore          6
			byte abyte3[] = readFile(s, "SessionDevice.json");
	//   29   58:aload_0         
	//   30   59:aload_3         
	//   31   60:ldc2            #652 <String "SessionDevice.json">
	//   32   63:invokespecial   #648 <Method byte[] readFile(String, String)>
	//   33   66:astore          7
			byte abyte4[] = readFile(s, "SessionOS.json");
	//   34   68:aload_0         
	//   35   69:aload_3         
	//   36   70:ldc2            #654 <String "SessionOS.json">
	//   37   73:invokespecial   #648 <Method byte[] readFile(String, String)>
	//   38   76:astore          8
			byte abyte5[] = NativeFileUtils.readFile((new MetaDataStore(getFilesDir())).getUserDataFileForSession(s));
	//   39   78:new             #656 <Class MetaDataStore>
	//   40   81:dup             
	//   41   82:aload_0         
	//   42   83:invokevirtual   #593 <Method File getFilesDir()>
	//   43   86:invokespecial   #659 <Method void MetaDataStore(File)>
	//   44   89:aload_3         
	//   45   90:invokevirtual   #663 <Method File MetaDataStore.getUserDataFileForSession(String)>
	//   46   93:invokestatic    #665 <Method byte[] NativeFileUtils.readFile(File)>
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
	//   56  114:invokespecial   #668 <Method void LogFileManager(Context, LogFileManager$DirectoryProvider, String)>
	//   57  117:astore          11
			byte abyte6[] = logfilemanager.getBytesForLog();
	//   58  119:aload           11
	//   59  121:invokevirtual   #672 <Method byte[] LogFileManager.getBytesForLog()>
	//   60  124:astore          10
			logfilemanager.clearLog();
	//   61  126:aload           11
	//   62  128:invokevirtual   #675 <Method void LogFileManager.clearLog()>
			byte abyte7[] = NativeFileUtils.readFile((new MetaDataStore(getFilesDir())).getKeysFileForSession(s));
	//   63  131:new             #656 <Class MetaDataStore>
	//   64  134:dup             
	//   65  135:aload_0         
	//   66  136:invokevirtual   #593 <Method File getFilesDir()>
	//   67  139:invokespecial   #659 <Method void MetaDataStore(File)>
	//   68  142:aload_3         
	//   69  143:invokevirtual   #678 <Method File MetaDataStore.getKeysFileForSession(String)>
	//   70  146:invokestatic    #665 <Method byte[] NativeFileUtils.readFile(File)>
	//   71  149:astore          11
			s = ((String) (new File(fileStore.a(), s)));
	//   72  151:new             #516 <Class File>
	//   73  154:dup             
	//   74  155:aload_0         
	//   75  156:getfield        #308 <Field a fileStore>
	//   76  159:invokeinterface #682 <Method File a.a()>
	//   77  164:aload_3         
	//   78  165:invokespecial   #683 <Method void File(File, String)>
	//   79  168:astore_3        
			if(!((File) (s)).mkdir())
	//*  80  169:aload_3         
	//*  81  170:invokevirtual   #686 <Method boolean File.mkdir()>
	//*  82  173:ifne            191
			{
				c.g().a("CrashlyticsCore", "Couldn't create native sessions directory");
	//   83  176:invokestatic    #450 <Method l c.g()>
	//   84  179:ldc2            #452 <String "CrashlyticsCore">
	//   85  182:ldc2            #688 <String "Couldn't create native sessions directory">
	//   86  185:invokeinterface #460 <Method void l.a(String, String)>
				return;
	//   87  190:return          
			} else
			{
				gzipIfNotEmpty(abyte0, new File(((File) (s)), "minidump"));
	//   88  191:aload_0         
	//   89  192:aload           4
	//   90  194:new             #516 <Class File>
	//   91  197:dup             
	//   92  198:aload_3         
	//   93  199:ldc2            #690 <String "minidump">
	//   94  202:invokespecial   #683 <Method void File(File, String)>
	//   95  205:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte1, new File(((File) (s)), "metadata"));
	//   96  208:aload_0         
	//   97  209:aload           5
	//   98  211:new             #516 <Class File>
	//   99  214:dup             
	//  100  215:aload_3         
	//  101  216:ldc2            #696 <String "metadata">
	//  102  219:invokespecial   #683 <Method void File(File, String)>
	//  103  222:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(((byte []) (context)), new File(((File) (s)), "binaryImages"));
	//  104  225:aload_0         
	//  105  226:aload_1         
	//  106  227:new             #516 <Class File>
	//  107  230:dup             
	//  108  231:aload_3         
	//  109  232:ldc2            #698 <String "binaryImages">
	//  110  235:invokespecial   #683 <Method void File(File, String)>
	//  111  238:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(((byte []) (file)), new File(((File) (s)), "session"));
	//  112  241:aload_0         
	//  113  242:aload_2         
	//  114  243:new             #516 <Class File>
	//  115  246:dup             
	//  116  247:aload_3         
	//  117  248:ldc2            #700 <String "session">
	//  118  251:invokespecial   #683 <Method void File(File, String)>
	//  119  254:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte2, new File(((File) (s)), "app"));
	//  120  257:aload_0         
	//  121  258:aload           6
	//  122  260:new             #516 <Class File>
	//  123  263:dup             
	//  124  264:aload_3         
	//  125  265:ldc2            #702 <String "app">
	//  126  268:invokespecial   #683 <Method void File(File, String)>
	//  127  271:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte3, new File(((File) (s)), "device"));
	//  128  274:aload_0         
	//  129  275:aload           7
	//  130  277:new             #516 <Class File>
	//  131  280:dup             
	//  132  281:aload_3         
	//  133  282:ldc2            #704 <String "device">
	//  134  285:invokespecial   #683 <Method void File(File, String)>
	//  135  288:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte4, new File(((File) (s)), "os"));
	//  136  291:aload_0         
	//  137  292:aload           8
	//  138  294:new             #516 <Class File>
	//  139  297:dup             
	//  140  298:aload_3         
	//  141  299:ldc2            #706 <String "os">
	//  142  302:invokespecial   #683 <Method void File(File, String)>
	//  143  305:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte5, new File(((File) (s)), "user"));
	//  144  308:aload_0         
	//  145  309:aload           9
	//  146  311:new             #516 <Class File>
	//  147  314:dup             
	//  148  315:aload_3         
	//  149  316:ldc2            #708 <String "user">
	//  150  319:invokespecial   #683 <Method void File(File, String)>
	//  151  322:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte6, new File(((File) (s)), "logs"));
	//  152  325:aload_0         
	//  153  326:aload           10
	//  154  328:new             #516 <Class File>
	//  155  331:dup             
	//  156  332:aload_3         
	//  157  333:ldc2            #710 <String "logs">
	//  158  336:invokespecial   #683 <Method void File(File, String)>
	//  159  339:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				gzipIfNotEmpty(abyte7, new File(((File) (s)), "keys"));
	//  160  342:aload_0         
	//  161  343:aload           11
	//  162  345:new             #516 <Class File>
	//  163  348:dup             
	//  164  349:aload_3         
	//  165  350:ldc2            #712 <String "keys">
	//  166  353:invokespecial   #683 <Method void File(File, String)>
	//  167  356:invokespecial   #694 <Method void gzipIfNotEmpty(byte[], File)>
				return;
	//  168  359:return          
			}
		} else
		{
			context = ((Context) (c.g()));
	//  169  360:invokestatic    #450 <Method l c.g()>
	//  170  363:astore_1        
			s = ((String) (new StringBuilder()));
	//  171  364:new             #466 <Class StringBuilder>
	//  172  367:dup             
	//  173  368:invokespecial   #467 <Method void StringBuilder()>
	//  174  371:astore_3        
			((StringBuilder) (s)).append("No minidump data found in directory ");
	//  175  372:aload_3         
	//  176  373:ldc2            #714 <String "No minidump data found in directory ">
	//  177  376:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  178  379:pop             
			((StringBuilder) (s)).append(((Object) (file)));
	//  179  380:aload_3         
	//  180  381:aload_2         
	//  181  382:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//  182  385:pop             
			((l) (context)).d("CrashlyticsCore", ((StringBuilder) (s)).toString());
	//  183  386:aload_1         
	//  184  387:ldc2            #452 <String "CrashlyticsCore">
	//  185  390:aload_3         
	//  186  391:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  187  394:invokeinterface #717 <Method void l.d(String, String)>
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
	//    0    0:ldc2            #722 <String "com.google.firebase.crash.FirebaseCrash">
	//    1    3:invokestatic    #726 <Method Class Class.forName(String)>
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
		String s2 = i.b(crashlyticsCore.getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//    3    7:ldc1            #112 <String "com.crashlytics.ApiEndpoint">
	//    4    9:invokestatic    #732 <Method String i.b(Context, String)>
	//    5   12:astore_3        
		return ((CreateReportSpiCall) (new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(((b.a.a.a.i) (crashlyticsCore)), s2, s, httpRequestFactory), new NativeCreateReportSpiCall(((b.a.a.a.i) (crashlyticsCore)), s2, s1, httpRequestFactory))));
	//    6   13:new             #734 <Class CompositeCreateReportSpiCall>
	//    7   16:dup             
	//    8   17:new             #736 <Class DefaultCreateReportSpiCall>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   12   25:aload_3         
	//   13   26:aload_1         
	//   14   27:aload_0         
	//   15   28:getfield        #302 <Field b.a.a.a.a.e.e httpRequestFactory>
	//   16   31:invokespecial   #739 <Method void DefaultCreateReportSpiCall(b.a.a.a.i, String, String, b.a.a.a.a.e.e)>
	//   17   34:new             #741 <Class NativeCreateReportSpiCall>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   21   42:aload_3         
	//   22   43:aload_2         
	//   23   44:aload_0         
	//   24   45:getfield        #302 <Field b.a.a.a.a.e.e httpRequestFactory>
	//   25   48:invokespecial   #742 <Method void NativeCreateReportSpiCall(b.a.a.a.i, String, String, b.a.a.a.a.e.e)>
	//   26   51:invokespecial   #745 <Method void CompositeCreateReportSpiCall(DefaultCreateReportSpiCall, NativeCreateReportSpiCall)>
	//   27   54:areturn         
	}

	private String getCurrentSessionId()
	{
		File afile[] = listSortedSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #749 <Method File[] listSortedSessionBeginFiles()>
	//    2    4:astore_1        
		if(afile.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            17
			return getSessionIdFromSessionFile(afile[0]);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:invokestatic    #464 <Method String getSessionIdFromSessionFile(File)>
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
	//    1    1:invokespecial   #749 <Method File[] listSortedSessionBeginFiles()>
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
	//   10   14:invokestatic    #464 <Method String getSessionIdFromSessionFile(File)>
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
	//    1    1:invokevirtual   #750 <Method String File.getName()>
	//    2    4:iconst_0        
	//    3    5:bipush          35
	//    4    7:invokevirtual   #754 <Method String String.substring(int, int)>
	//    5   10:areturn         
	}

	private File[] getTrimmedNonFatalFiles(String s, File afile[], int j)
	{
		File afile1[] = afile;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(afile.length > j)
	//*   2    3:aload_2         
	//*   3    4:arraylength     
	//*   4    5:iload_3         
	//*   5    6:icmple          84
		{
			c.g().a("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
				Integer.valueOf(j)
			}));
	//    6    9:invokestatic    #450 <Method l c.g()>
	//    7   12:ldc2            #452 <String "CrashlyticsCore">
	//    8   15:getstatic       #762 <Field Locale Locale.US>
	//    9   18:ldc2            #764 <String "Trimming down to %d logged exceptions.">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:iload_3         
	//   15   28:invokestatic    #770 <Method Integer Integer.valueOf(int)>
	//   16   31:aastore         
	//   17   32:invokestatic    #774 <Method String String.format(Locale, String, Object[])>
	//   18   35:invokeinterface #460 <Method void l.a(String, String)>
			trimSessionEventFiles(s, j);
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:iload_3         
	//   22   43:invokespecial   #620 <Method void trimSessionEventFiles(String, int)>
			afile = ((File []) (new StringBuilder()));
	//   23   46:new             #466 <Class StringBuilder>
	//   24   49:dup             
	//   25   50:invokespecial   #467 <Method void StringBuilder()>
	//   26   53:astore_2        
			((StringBuilder) (afile)).append(s);
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			((StringBuilder) (afile)).append("SessionEvent");
	//   31   60:aload_2         
	//   32   61:ldc1            #194 <String "SessionEvent">
	//   33   63:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			afile1 = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (afile)).toString()))));
	//   35   67:aload_0         
	//   36   68:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   37   71:dup             
	//   38   72:aload_2         
	//   39   73:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   40   76:invokespecial   #775 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   41   79:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
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
	//*   1    1:invokevirtual   #780 <Method boolean isHandlingException()>
	//*   2    4:ifeq            36
			return new UserMetaData(crashlyticsCore.getUserIdentifier(), crashlyticsCore.getUserName(), crashlyticsCore.getUserEmail());
	//    3    7:new             #782 <Class UserMetaData>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    7   15:invokevirtual   #785 <Method String CrashlyticsCore.getUserIdentifier()>
	//    8   18:aload_0         
	//    9   19:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   10   22:invokevirtual   #788 <Method String CrashlyticsCore.getUserName()>
	//   11   25:aload_0         
	//   12   26:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   13   29:invokevirtual   #791 <Method String CrashlyticsCore.getUserEmail()>
	//   14   32:invokespecial   #794 <Method void UserMetaData(String, String, String)>
	//   15   35:areturn         
		else
			return (new MetaDataStore(getFilesDir())).readUserData(s);
	//   16   36:new             #656 <Class MetaDataStore>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokevirtual   #593 <Method File getFilesDir()>
	//   20   44:invokespecial   #659 <Method void MetaDataStore(File)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #797 <Method UserMetaData MetaDataStore.readUserData(String)>
	//   23   51:areturn         
	}

	private void gzip(byte abyte0[], File file)
	{
		Exception exception = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		file = ((File) (new GZIPOutputStream(((java.io.OutputStream) (new FileOutputStream(file))))));
	//    2    2:new             #800 <Class GZIPOutputStream>
	//    3    5:dup             
	//    4    6:new             #802 <Class FileOutputStream>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #803 <Method void FileOutputStream(File)>
	//    8   14:invokespecial   #806 <Method void GZIPOutputStream(java.io.OutputStream)>
	//    9   17:astore_2        
		((GZIPOutputStream) (file)).write(abyte0);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #809 <Method void GZIPOutputStream.write(byte[])>
		((GZIPOutputStream) (file)).finish();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #812 <Method void GZIPOutputStream.finish()>
		i.a(((java.io.Closeable) (file)));
	//   15   27:aload_2         
	//   16   28:invokestatic    #815 <Method void i.a(java.io.Closeable)>
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
		i.a(((java.io.Closeable) (abyte0)));
	//   27   43:aload_1         
	//   28   44:invokestatic    #815 <Method void i.a(java.io.Closeable)>
		throw file;
	//   29   47:aload_2         
	//   30   48:athrow          
	}

	private void gzipIfNotEmpty(byte abyte0[], File file)
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
	//    8   12:invokespecial   #817 <Method void gzip(byte[], File)>
	//    9   15:return          
	}

	private File[] listFiles(File file)
	{
		return ensureFileArrayNotNull(file.listFiles());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #821 <Method File[] File.listFiles()>
	//    3    5:invokespecial   #823 <Method File[] ensureFileArrayNotNull(File[])>
	//    4    8:areturn         
	}

	private File[] listFilesMatching(File file, FilenameFilter filenamefilter)
	{
		return ensureFileArrayNotNull(file.listFiles(filenamefilter));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #826 <Method File[] File.listFiles(FilenameFilter)>
	//    4    6:invokespecial   #823 <Method File[] ensureFileArrayNotNull(File[])>
	//    5    9:areturn         
	}

	private File[] listFilesMatching(FileFilter filefilter)
	{
		return ensureFileArrayNotNull(getFilesDir().listFiles(filefilter));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #593 <Method File getFilesDir()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #829 <Method File[] File.listFiles(FileFilter)>
	//    5    9:invokespecial   #823 <Method File[] ensureFileArrayNotNull(File[])>
	//    6   12:areturn         
	}

	private File[] listFilesMatching(FilenameFilter filenamefilter)
	{
		return listFilesMatching(getFilesDir(), filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #593 <Method File getFilesDir()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #831 <Method File[] listFilesMatching(File, FilenameFilter)>
	//    5    9:areturn         
	}

	private File[] listSessionPartFilesFor(String s)
	{
		return listFilesMatching(((FilenameFilter) (new SessionPartFileFilter(s))));
	//    0    0:aload_0         
	//    1    1:new             #101 <Class CrashlyticsController$SessionPartFileFilter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #832 <Method void CrashlyticsController$SessionPartFileFilter(String)>
	//    5    9:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
	//    6   12:areturn         
	}

	private File[] listSortedSessionBeginFiles()
	{
		File afile[] = listSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #835 <Method File[] listSessionBeginFiles()>
	//    2    4:astore_1        
		Arrays.sort(((Object []) (afile)), LARGEST_FILE_NAME_FIRST);
	//    3    5:aload_1         
	//    4    6:getstatic       #257 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #841 <Method void Arrays.sort(Object[], Comparator)>
		return afile;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	private byte[] readFile(String s, String s1)
	{
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #593 <Method File getFilesDir()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #466 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #467 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append(s);
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append(s1);
	//   11   21:aload           4
	//   12   23:aload_2         
	//   13   24:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		return NativeFileUtils.readFile(new File(file, stringbuilder.toString()));
	//   15   28:new             #516 <Class File>
	//   16   31:dup             
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   20   38:invokespecial   #683 <Method void File(File, String)>
	//   21   41:invokestatic    #665 <Method byte[] NativeFileUtils.readFile(File)>
	//   22   44:areturn         
	}

	private static void recordFatalExceptionAnswersEvent(String s, String s1)
	{
		Answers answers = (Answers)c.a(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #843 <Class Answers>
	//    1    3:invokestatic    #846 <Method b.a.a.a.i c.a(Class)>
	//    2    6:checkcast       #843 <Class Answers>
	//    3    9:astore_2        
		if(answers == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       29
		{
			c.g().a("CrashlyticsCore", "Answers is not available");
	//    6   14:invokestatic    #450 <Method l c.g()>
	//    7   17:ldc2            #452 <String "CrashlyticsCore">
	//    8   20:ldc2            #848 <String "Answers is not available">
	//    9   23:invokeinterface #460 <Method void l.a(String, String)>
			return;
	//   10   28:return          
		} else
		{
			answers.onException(new b.a.a.a.a.b.j.a(s, s1));
	//   11   29:aload_2         
	//   12   30:new             #850 <Class b.a.a.a.a.b.j$a>
	//   13   33:dup             
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #852 <Method void b.a.a.a.a.b.j$a(String, String)>
	//   17   39:invokevirtual   #856 <Method void Answers.onException(b.a.a.a.a.b.j$a)>
			return;
	//   18   42:return          
		}
	}

	private void recordFatalFirebaseEvent(long l1)
	{
		if(firebaseCrashExists())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #858 <Method boolean firebaseCrashExists()>
	//*   2    4:ifeq            22
		{
			c.g().a("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
	//    3    7:invokestatic    #450 <Method l c.g()>
	//    4   10:ldc2            #452 <String "CrashlyticsCore">
	//    5   13:ldc2            #860 <String "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists">
	//    6   16:invokeinterface #460 <Method void l.a(String, String)>
			return;
	//    7   21:return          
		}
		if(firebaseAnalyticsLogger != null)
	//*   8   22:aload_0         
	//*   9   23:getfield        #322 <Field EventLogger firebaseAnalyticsLogger>
	//*  10   26:ifnull          87
		{
			c.g().a("CrashlyticsCore", "Logging Crashlytics event to Firebase");
	//   11   29:invokestatic    #450 <Method l c.g()>
	//   12   32:ldc2            #452 <String "CrashlyticsCore">
	//   13   35:ldc2            #862 <String "Logging Crashlytics event to Firebase">
	//   14   38:invokeinterface #460 <Method void l.a(String, String)>
			Bundle bundle = new Bundle();
	//   15   43:new             #864 <Class Bundle>
	//   16   46:dup             
	//   17   47:invokespecial   #865 <Method void Bundle()>
	//   18   50:astore_3        
			bundle.putInt("_r", 1);
	//   19   51:aload_3         
	//   20   52:ldc1            #134 <String "_r">
	//   21   54:iconst_1        
	//   22   55:invokevirtual   #868 <Method void Bundle.putInt(String, int)>
			bundle.putInt("fatal", 1);
	//   23   58:aload_3         
	//   24   59:ldc1            #130 <String "fatal">
	//   25   61:iconst_1        
	//   26   62:invokevirtual   #868 <Method void Bundle.putInt(String, int)>
			bundle.putLong("timestamp", l1);
	//   27   65:aload_3         
	//   28   66:ldc1            #137 <String "timestamp">
	//   29   68:lload_1         
	//   30   69:invokevirtual   #872 <Method void Bundle.putLong(String, long)>
			firebaseAnalyticsLogger.logEvent("clx", "_ae", bundle);
	//   31   72:aload_0         
	//   32   73:getfield        #322 <Field EventLogger firebaseAnalyticsLogger>
	//   33   76:ldc1            #124 <String "clx">
	//   34   78:ldc1            #127 <String "_ae">
	//   35   80:aload_3         
	//   36   81:invokeinterface #878 <Method void EventLogger.logEvent(String, String, Bundle)>
			return;
	//   37   86:return          
		} else
		{
			c.g().a("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
	//   38   87:invokestatic    #450 <Method l c.g()>
	//   39   90:ldc2            #452 <String "CrashlyticsCore">
	//   40   93:ldc2            #880 <String "Skipping logging Crashlytics event to Firebase, no Firebase Analytics">
	//   41   96:invokeinterface #460 <Method void l.a(String, String)>
			return;
	//   42  101:return          
		}
	}

	private static void recordLoggedExceptionAnswersEvent(String s, String s1)
	{
		Answers answers = (Answers)c.a(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #843 <Class Answers>
	//    1    3:invokestatic    #846 <Method b.a.a.a.i c.a(Class)>
	//    2    6:checkcast       #843 <Class Answers>
	//    3    9:astore_2        
		if(answers == null)
	//*   4   10:aload_2         
	//*   5   11:ifnonnull       29
		{
			c.g().a("CrashlyticsCore", "Answers is not available");
	//    6   14:invokestatic    #450 <Method l c.g()>
	//    7   17:ldc2            #452 <String "CrashlyticsCore">
	//    8   20:ldc2            #848 <String "Answers is not available">
	//    9   23:invokeinterface #460 <Method void l.a(String, String)>
			return;
	//   10   28:return          
		} else
		{
			answers.onException(new b.a.a.a.a.b.j.b(s, s1));
	//   11   29:aload_2         
	//   12   30:new             #882 <Class b.a.a.a.a.b.j$b>
	//   13   33:dup             
	//   14   34:aload_0         
	//   15   35:aload_1         
	//   16   36:invokespecial   #883 <Method void b.a.a.a.a.b.j$b(String, String)>
	//   17   39:invokevirtual   #886 <Method void Answers.onException(b.a.a.a.a.b.j$b)>
			return;
	//   18   42:return          
		}
	}

	private void recursiveDelete(File file)
	{
		if(file.isDirectory())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #889 <Method boolean File.isDirectory()>
	//*   2    4:ifeq            39
		{
			File afile[] = file.listFiles();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #821 <Method File[] File.listFiles()>
	//    5   11:astore          4
			int k = afile.length;
	//    6   13:aload           4
	//    7   15:arraylength     
	//    8   16:istore_3        
			for(int j = 0; j < k; j++)
	//*   9   17:iconst_0        
	//*  10   18:istore_2        
	//*  11   19:iload_2         
	//*  12   20:iload_3         
	//*  13   21:icmpge          39
				recursiveDelete(afile[j]);
	//   14   24:aload_0         
	//   15   25:aload           4
	//   16   27:iload_2         
	//   17   28:aaload          
	//   18   29:invokespecial   #891 <Method void recursiveDelete(File)>

	//   19   32:iload_2         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_2        
		}
	//*  23   36:goto            19
		file.delete();
	//   24   39:aload_1         
	//   25   40:invokevirtual   #520 <Method boolean File.delete()>
	//   26   43:pop             
	//   27   44:return          
	}

	private void recursiveDelete(Set set)
	{
		for(set = ((Set) (set.iterator())); ((Iterator) (set)).hasNext(); recursiveDelete((File)((Iterator) (set)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #897 <Method Iterator Set.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #902 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            32
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #906 <Method Object Iterator.next()>
	//    9   23:checkcast       #516 <Class File>
	//   10   26:invokespecial   #891 <Method void recursiveDelete(File)>
	//*  11   29:goto            7
	//   12   32:return          
	}

	private void retainSessions(File afile[], Set set)
	{
		int k = afile.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int j = 0; j < k; j++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          145
		{
			File file = afile[j];
	//    8   12:aload_1         
	//    9   13:iload_3         
	//   10   14:aaload          
	//   11   15:astore          8
			String s1 = file.getName();
	//   12   17:aload           8
	//   13   19:invokevirtual   #750 <Method String File.getName()>
	//   14   22:astore          9
			Object obj = ((Object) (SESSION_FILE_PATTERN.matcher(((CharSequence) (s1)))));
	//   15   24:getstatic       #270 <Field Pattern SESSION_FILE_PATTERN>
	//   16   27:aload           9
	//   17   29:invokevirtual   #914 <Method Matcher Pattern.matcher(CharSequence)>
	//   18   32:astore          5
			StringBuilder stringbuilder;
			String s;
			if(!((Matcher) (obj)).matches())
	//*  19   34:aload           5
	//*  20   36:invokevirtual   #919 <Method boolean Matcher.matches()>
	//*  21   39:ifne            101
			{
				obj = ((Object) (c.g()));
	//   22   42:invokestatic    #450 <Method l c.g()>
	//   23   45:astore          5
				stringbuilder = new StringBuilder();
	//   24   47:new             #466 <Class StringBuilder>
	//   25   50:dup             
	//   26   51:invokespecial   #467 <Method void StringBuilder()>
	//   27   54:astore          6
				s = "Deleting unknown file: ";
	//   28   56:ldc2            #921 <String "Deleting unknown file: ">
	//   29   59:astore          7
			} else
	//*  30   61:aload           6
	//*  31   63:aload           7
	//*  32   65:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//*  33   68:pop             
	//*  34   69:aload           6
	//*  35   71:aload           9
	//*  36   73:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//*  37   76:pop             
	//*  38   77:aload           5
	//*  39   79:ldc2            #452 <String "CrashlyticsCore">
	//*  40   82:aload           6
	//*  41   84:invokevirtual   #476 <Method String StringBuilder.toString()>
	//*  42   87:invokeinterface #460 <Method void l.a(String, String)>
	//*  43   92:aload           8
	//*  44   94:invokevirtual   #520 <Method boolean File.delete()>
	//*  45   97:pop             
	//*  46   98:goto            138
			{
				if(set.contains(((Object) (((Matcher) (obj)).group(1)))))
					continue;
	//   47  101:aload_2         
	//   48  102:aload           5
	//   49  104:iconst_1        
	//   50  105:invokevirtual   #924 <Method String Matcher.group(int)>
	//   51  108:invokeinterface #928 <Method boolean Set.contains(Object)>
	//   52  113:ifne            138
				obj = ((Object) (c.g()));
	//   53  116:invokestatic    #450 <Method l c.g()>
	//   54  119:astore          5
				stringbuilder = new StringBuilder();
	//   55  121:new             #466 <Class StringBuilder>
	//   56  124:dup             
	//   57  125:invokespecial   #467 <Method void StringBuilder()>
	//   58  128:astore          6
				s = "Trimming session file: ";
	//   59  130:ldc2            #930 <String "Trimming session file: ">
	//   60  133:astore          7
			}
			stringbuilder.append(s);
			stringbuilder.append(s1);
			((l) (obj)).a("CrashlyticsCore", stringbuilder.toString());
			file.delete();
		}

	//   61  135:goto            61
	//   62  138:iload_3         
	//   63  139:iconst_1        
	//   64  140:iadd            
	//   65  141:istore_3        
	//*  66  142:goto            6
	//   67  145:return          
	}

	private void sendSessionReports(t t1)
	{
		if(t1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       19
		{
			c.g().d("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
	//    2    4:invokestatic    #450 <Method l c.g()>
	//    3    7:ldc2            #452 <String "CrashlyticsCore">
	//    4   10:ldc2            #933 <String "Cannot send reports. Settings are unavailable.">
	//    5   13:invokeinterface #717 <Method void l.d(String, String)>
			return;
	//    6   18:return          
		}
		Context context = crashlyticsCore.getContext();
	//    7   19:aload_0         
	//    8   20:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    9   23:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//   10   26:astore          4
		t1 = ((t) (getCreateReportSpiCall(t1.a.d, t1.a.e)));
	//   11   28:aload_0         
	//   12   29:aload_1         
	//   13   30:getfield        #938 <Field e t.a>
	//   14   33:getfield        #942 <Field String e.d>
	//   15   36:aload_1         
	//   16   37:getfield        #938 <Field e t.a>
	//   17   40:getfield        #944 <Field String e.e>
	//   18   43:invokespecial   #946 <Method CreateReportSpiCall getCreateReportSpiCall(String, String)>
	//   19   46:astore_1        
		t1 = ((t) (new ReportUploader(appData.apiKey, ((CreateReportSpiCall) (t1)), reportFilesProvider, handlingExceptionCheck)));
	//   20   47:new             #948 <Class ReportUploader>
	//   21   50:dup             
	//   22   51:aload_0         
	//   23   52:getfield        #310 <Field AppData appData>
	//   24   55:getfield        #953 <Field String AppData.apiKey>
	//   25   58:aload_1         
	//   26   59:aload_0         
	//   27   60:getfield        #345 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   28   63:aload_0         
	//   29   64:getfield        #348 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
	//   30   67:invokespecial   #956 <Method void ReportUploader(String, CreateReportSpiCall, ReportUploader$ReportFilesProvider, ReportUploader$HandlingExceptionCheck)>
	//   31   70:astore_1        
		File afile[] = listCompleteSessionFiles();
	//   32   71:aload_0         
	//   33   72:invokevirtual   #959 <Method File[] listCompleteSessionFiles()>
	//   34   75:astore          5
		int k = afile.length;
	//   35   77:aload           5
	//   36   79:arraylength     
	//   37   80:istore_3        
		for(int j = 0; j < k; j++)
	//*  38   81:iconst_0        
	//*  39   82:istore_2        
	//*  40   83:iload_2         
	//*  41   84:iload_3         
	//*  42   85:icmpge          131
		{
			SessionReport sessionreport = new SessionReport(afile[j], SEND_AT_CRASHTIME_HEADER);
	//   43   88:new             #961 <Class SessionReport>
	//   44   91:dup             
	//   45   92:aload           5
	//   46   94:iload_2         
	//   47   95:aaload          
	//   48   96:getstatic       #282 <Field Map SEND_AT_CRASHTIME_HEADER>
	//   49   99:invokespecial   #964 <Method void SessionReport(File, Map)>
	//   50  102:astore          6
			backgroundWorker.submit(((Runnable) (new SendReportRunnable(context, ((Report) (sessionreport)), ((ReportUploader) (t1))))));
	//   51  104:aload_0         
	//   52  105:getfield        #300 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//   53  108:new             #98  <Class CrashlyticsController$SendReportRunnable>
	//   54  111:dup             
	//   55  112:aload           4
	//   56  114:aload           6
	//   57  116:aload_1         
	//   58  117:invokespecial   #967 <Method void CrashlyticsController$SendReportRunnable(Context, Report, ReportUploader)>
	//   59  120:invokevirtual   #973 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//   60  123:pop             
		}

	//   61  124:iload_2         
	//   62  125:iconst_1        
	//   63  126:iadd            
	//   64  127:istore_2        
	//*  65  128:goto            83
	//   66  131:return          
	}

	private boolean shouldPromptUserBeforeSendingCrashReports(t t1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(t1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		boolean flag = flag1;
	//    6    8:iload_3         
	//    7    9:istore_2        
		if(t1.d.a)
	//*   8   10:aload_1         
	//*   9   11:getfield        #976 <Field m t.d>
	//*  10   14:getfield        #980 <Field boolean m.a>
	//*  11   17:ifeq            34
		{
			flag = flag1;
	//   12   20:iload_3         
	//   13   21:istore_2        
			if(!preferenceManager.shouldAlwaysSendReports())
	//*  14   22:aload_0         
	//*  15   23:getfield        #306 <Field PreferenceManager preferenceManager>
	//*  16   26:invokevirtual   #985 <Method boolean PreferenceManager.shouldAlwaysSendReports()>
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
		Object obj2;
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
	//   10   20:invokevirtual   #990 <Method File getFatalSessionFilesDir()>
	//   11   23:astore          6
		else
	//*  12   25:goto            34
			obj = ((Object) (getNonFatalSessionFilesDir()));
	//   13   28:aload_0         
	//   14   29:invokevirtual   #993 <Method File getNonFatalSessionFilesDir()>
	//   15   32:astore          6
		if(!((File) (obj)).exists())
	//*  16   34:aload           6
	//*  17   36:invokevirtual   #996 <Method boolean File.exists()>
	//*  18   39:ifne            48
			((File) (obj)).mkdirs();
	//   19   42:aload           6
	//   20   44:invokevirtual   #999 <Method boolean File.mkdirs()>
	//   21   47:pop             
		obj2 = null;
	//   22   48:aconst_null     
	//   23   49:astore          8
		obj4 = null;
	//   24   51:aconst_null     
	//   25   52:astore          10
		obj = ((Object) (new ClsFileOutputStream(((File) (obj)), s)));
	//   26   54:new             #486 <Class ClsFileOutputStream>
	//   27   57:dup             
	//   28   58:aload           6
	//   29   60:aload_2         
	//   30   61:invokespecial   #596 <Method void ClsFileOutputStream(File, String)>
	//   31   64:astore          6
		Object obj1 = obj;
	//   32   66:aload           6
	//   33   68:astore          7
		Object obj3;
		try
		{
			obj3 = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj)))));
	//   34   70:aload           6
	//   35   72:invokestatic    #600 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   36   75:astore          9
		}
	//*  37   77:invokestatic    #450 <Method l c.g()>
	//*  38   80:astore          7
	//*  39   82:new             #466 <Class StringBuilder>
	//*  40   85:dup             
	//*  41   86:invokespecial   #467 <Method void StringBuilder()>
	//*  42   89:astore          8
	//*  43   91:aload           8
	//*  44   93:ldc2            #1001 <String "Collecting SessionStart data for session ID ">
	//*  45   96:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//*  46   99:pop             
	//*  47  100:aload           8
	//*  48  102:aload_2         
	//*  49  103:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//*  50  106:pop             
	//*  51  107:aload           7
	//*  52  109:ldc2            #452 <String "CrashlyticsCore">
	//*  53  112:aload           8
	//*  54  114:invokevirtual   #476 <Method String StringBuilder.toString()>
	//*  55  117:invokeinterface #460 <Method void l.a(String, String)>
	//*  56  122:aload           9
	//*  57  124:aload_1         
	//*  58  125:invokestatic    #1005 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//*  59  128:aload           9
	//*  60  130:iconst_4        
	//*  61  131:new             #529 <Class Date>
	//*  62  134:dup             
	//*  63  135:invokespecial   #530 <Method void Date()>
	//*  64  138:invokevirtual   #1009 <Method long Date.getTime()>
	//*  65  141:ldc2w           #1010 <Long 1000L>
	//*  66  144:ldiv            
	//*  67  145:invokevirtual   #1015 <Method void CodedOutputStream.writeUInt64(int, long)>
	//*  68  148:aload           9
	//*  69  150:iconst_5        
	//*  70  151:iload           5
	//*  71  153:invokevirtual   #1019 <Method void CodedOutputStream.writeBool(int, boolean)>
	//*  72  156:aload           9
	//*  73  158:bipush          11
	//*  74  160:iconst_1        
	//*  75  161:invokevirtual   #1023 <Method void CodedOutputStream.writeUInt32(int, int)>
	//*  76  164:aload           9
	//*  77  166:bipush          12
	//*  78  168:iconst_3        
	//*  79  169:invokevirtual   #1026 <Method void CodedOutputStream.writeEnum(int, int)>
	//*  80  172:aload_0         
	//*  81  173:aload           9
	//*  82  175:aload_2         
	//*  83  176:invokespecial   #1030 <Method void writeInitialPartsTo(CodedOutputStream, String)>
	//*  84  179:aload           9
	//*  85  181:aload_3         
	//*  86  182:aload_2         
	//*  87  183:invokestatic    #1034 <Method void writeNonFatalEventsTo(CodedOutputStream, File[], String)>
	//*  88  186:iload           5
	//*  89  188:ifeq            198
	//*  90  191:aload           9
	//*  91  193:aload           4
	//*  92  195:invokestatic    #1005 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//*  93  198:aload           9
	//*  94  200:ldc2            #1036 <String "Error flushing session file stream">
	//*  95  203:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
	//*  96  206:aload           6
	//*  97  208:ldc2            #1038 <String "Failed to close CLS file">
	//*  98  211:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
	//*  99  214:return          
	//* 100  215:astore_2        
	//* 101  216:aload           9
	//* 102  218:astore_1        
	//* 103  219:goto            355
	//* 104  222:astore_3        
	//* 105  223:aload           9
	//* 106  225:astore_1        
	//* 107  226:goto            252
		// Misplaced declaration of an exception variable
		catch(File afile[])
	//* 108  229:astore_3        
		{
			file = ((File) (obj4));
	//  109  230:aload           10
	//  110  232:astore_1        
			break MISSING_BLOCK_LABEL_252;
	//  111  233:goto            252
		}
		try
		{
			obj1 = ((Object) (c.g()));
			obj2 = ((Object) (new StringBuilder()));
			((StringBuilder) (obj2)).append("Collecting SessionStart data for session ID ");
			((StringBuilder) (obj2)).append(s);
			((l) (obj1)).a("CrashlyticsCore", ((StringBuilder) (obj2)).toString());
			writeToCosFromFile(((CodedOutputStream) (obj3)), file);
			((CodedOutputStream) (obj3)).writeUInt64(4, (new Date()).getTime() / 1000L);
			((CodedOutputStream) (obj3)).writeBool(5, flag);
			((CodedOutputStream) (obj3)).writeUInt32(11, 1);
			((CodedOutputStream) (obj3)).writeEnum(12, 3);
			writeInitialPartsTo(((CodedOutputStream) (obj3)), s);
			writeNonFatalEventsTo(((CodedOutputStream) (obj3)), afile, s);
		}
		// Misplaced declaration of an exception variable
		catch(File afile[])
		{
			file = ((File) (obj3));
			break MISSING_BLOCK_LABEL_252;
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_198;
		writeToCosFromFile(((CodedOutputStream) (obj3)), file1);
		i.a(((java.io.Flushable) (obj3)), "Error flushing session file stream");
		i.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
		return;
		s;
		file = ((File) (obj3));
		break MISSING_BLOCK_LABEL_355;
		s;
	//  112  236:astore_2        
		file = null;
	//  113  237:aconst_null     
	//  114  238:astore_1        
		obj = ((Object) (file));
	//  115  239:aload_1         
	//  116  240:astore          6
		break MISSING_BLOCK_LABEL_355;
	//  117  242:goto            355
		afile;
	//  118  245:astore_3        
		obj = null;
	//  119  246:aconst_null     
	//  120  247:astore          6
		file = ((File) (obj4));
	//  121  249:aload           10
	//  122  251:astore_1        
		obj2 = ((Object) (file));
	//  123  252:aload_1         
	//  124  253:astore          8
		obj1 = obj;
	//  125  255:aload           6
	//  126  257:astore          7
		file1 = ((File) (c.g()));
	//  127  259:invokestatic    #450 <Method l c.g()>
	//  128  262:astore          4
		obj2 = ((Object) (file));
	//  129  264:aload_1         
	//  130  265:astore          8
		obj1 = obj;
	//  131  267:aload           6
	//  132  269:astore          7
		obj3 = ((Object) (new StringBuilder()));
	//  133  271:new             #466 <Class StringBuilder>
	//  134  274:dup             
	//  135  275:invokespecial   #467 <Method void StringBuilder()>
	//  136  278:astore          9
		obj2 = ((Object) (file));
	//  137  280:aload_1         
	//  138  281:astore          8
		obj1 = obj;
	//  139  283:aload           6
	//  140  285:astore          7
		((StringBuilder) (obj3)).append("Failed to write session file for session ID: ");
	//  141  287:aload           9
	//  142  289:ldc2            #1040 <String "Failed to write session file for session ID: ">
	//  143  292:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  144  295:pop             
		obj2 = ((Object) (file));
	//  145  296:aload_1         
	//  146  297:astore          8
		obj1 = obj;
	//  147  299:aload           6
	//  148  301:astore          7
		((StringBuilder) (obj3)).append(s);
	//  149  303:aload           9
	//  150  305:aload_2         
	//  151  306:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  152  309:pop             
		obj2 = ((Object) (file));
	//  153  310:aload_1         
	//  154  311:astore          8
		obj1 = obj;
	//  155  313:aload           6
	//  156  315:astore          7
		((l) (file1)).e("CrashlyticsCore", ((StringBuilder) (obj3)).toString(), ((Throwable) (afile)));
	//  157  317:aload           4
	//  158  319:ldc2            #452 <String "CrashlyticsCore">
	//  159  322:aload           9
	//  160  324:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  161  327:aload_3         
	//  162  328:invokeinterface #495 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Flushable) (file)), "Error flushing session file stream");
	//  163  333:aload_1         
	//  164  334:ldc2            #1036 <String "Error flushing session file stream">
	//  165  337:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj)));
	//  166  340:aload_0         
	//  167  341:aload           6
	//  168  343:invokespecial   #1042 <Method void closeWithoutRenamingOrLog(ClsFileOutputStream)>
		return;
	//  169  346:return          
		s;
	//  170  347:astore_2        
		file = ((File) (obj2));
	//  171  348:aload           8
	//  172  350:astore_1        
		obj = obj1;
	//  173  351:aload           7
	//  174  353:astore          6
		i.a(((java.io.Flushable) (file)), "Error flushing session file stream");
	//  175  355:aload_1         
	//  176  356:ldc2            #1036 <String "Error flushing session file stream">
	//  177  359:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		i.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
	//  178  362:aload           6
	//  179  364:ldc2            #1038 <String "Failed to close CLS file">
	//  180  367:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		throw s;
	//  181  370:aload_2         
	//  182  371:athrow          
	}

	private void trimInvalidSessionFiles()
	{
		File file = getInvalidFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1046 <Method File getInvalidFilesDir()>
	//    2    4:astore_2        
		if(!file.exists())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #996 <Method boolean File.exists()>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		File afile[] = listFilesMatching(file, ((FilenameFilter) (new InvalidPartFileFilter())));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:new             #79  <Class CrashlyticsController$InvalidPartFileFilter>
	//   10   18:dup             
	//   11   19:invokespecial   #1047 <Method void CrashlyticsController$InvalidPartFileFilter()>
	//   12   22:invokespecial   #831 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   13   25:astore_3        
		Arrays.sort(((Object []) (afile)), Collections.reverseOrder());
	//   14   26:aload_3         
	//   15   27:invokestatic    #1051 <Method Comparator Collections.reverseOrder()>
	//   16   30:invokestatic    #841 <Method void Arrays.sort(Object[], Comparator)>
		HashSet hashset = new HashSet();
	//   17   33:new             #1053 <Class HashSet>
	//   18   36:dup             
	//   19   37:invokespecial   #1054 <Method void HashSet()>
	//   20   40:astore          4
		for(int j = 0; j < afile.length && ((Set) (hashset)).size() < 4; j++)
	//*  21   42:iconst_0        
	//*  22   43:istore_1        
	//*  23   44:iload_1         
	//*  24   45:aload_3         
	//*  25   46:arraylength     
	//*  26   47:icmpge          82
	//*  27   50:aload           4
	//*  28   52:invokeinterface #1057 <Method int Set.size()>
	//*  29   57:iconst_4        
	//*  30   58:icmpge          82
			((Set) (hashset)).add(((Object) (getSessionIdFromSessionFile(afile[j]))));
	//   31   61:aload           4
	//   32   63:aload_3         
	//   33   64:iload_1         
	//   34   65:aaload          
	//   35   66:invokestatic    #464 <Method String getSessionIdFromSessionFile(File)>
	//   36   69:invokeinterface #1060 <Method boolean Set.add(Object)>
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
	//   46   85:invokespecial   #1062 <Method File[] listFiles(File)>
	//   47   88:aload           4
	//   48   90:invokespecial   #1064 <Method void retainSessions(File[], Set)>
	//   49   93:return          
	}

	private void trimOpenSessions(int j)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #1053 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #1054 <Method void HashSet()>
	//    3    7:astore_3        
		File afile[] = listSortedSessionBeginFiles();
	//    4    8:aload_0         
	//    5    9:invokespecial   #749 <Method File[] listSortedSessionBeginFiles()>
	//    6   12:astore          4
		int k = Math.min(j, afile.length);
	//    7   14:iload_1         
	//    8   15:aload           4
	//    9   17:arraylength     
	//   10   18:invokestatic    #1071 <Method int Math.min(int, int)>
	//   11   21:istore_2        
		for(j = 0; j < k; j++)
	//*  12   22:iconst_0        
	//*  13   23:istore_1        
	//*  14   24:iload_1         
	//*  15   25:iload_2         
	//*  16   26:icmpge          50
			((Set) (hashset)).add(((Object) (getSessionIdFromSessionFile(afile[j]))));
	//   17   29:aload_3         
	//   18   30:aload           4
	//   19   32:iload_1         
	//   20   33:aaload          
	//   21   34:invokestatic    #464 <Method String getSessionIdFromSessionFile(File)>
	//   22   37:invokeinterface #1060 <Method boolean Set.add(Object)>
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
	//   32   55:invokevirtual   #1074 <Method void LogFileManager.discardOldLogFiles(Set)>
		retainSessions(listFilesMatching(((FilenameFilter) (new AnySessionPartFileFilter()))), ((Set) (hashset)));
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:new             #64  <Class CrashlyticsController$AnySessionPartFileFilter>
	//   36   63:dup             
	//   37   64:aconst_null     
	//   38   65:invokespecial   #1077 <Method void CrashlyticsController$AnySessionPartFileFilter(CrashlyticsController$1)>
	//   39   68:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
	//   40   71:aload_3         
	//   41   72:invokespecial   #1064 <Method void retainSessions(File[], Set)>
	//   42   75:return          
	}

	private void trimSessionEventFiles(String s, int j)
	{
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #593 <Method File getFilesDir()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #466 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #467 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append(s);
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append("SessionEvent");
	//   11   21:aload           4
	//   12   23:ldc1            #194 <String "SessionEvent">
	//   13   25:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		Utils.capFileCount(file, ((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))), j, SMALLEST_FILE_NAME_FIRST);
	//   15   29:aload_3         
	//   16   30:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   17   33:dup             
	//   18   34:aload           4
	//   19   36:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   20   39:invokespecial   #775 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   21   42:iload_2         
	//   22   43:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   23   46:invokestatic    #1083 <Method int Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   24   49:pop             
	//   25   50:return          
	}

	private void writeBeginSession(final String sessionId, Date date)
	{
		final String generator = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
			crashlyticsCore.getVersion()
		});
	//    0    0:getstatic       #762 <Field Locale Locale.US>
	//    1    3:ldc1            #140 <String "Crashlytics Android SDK/%s">
	//    2    5:iconst_1        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    8   15:invokevirtual   #1086 <Method String CrashlyticsCore.getVersion()>
	//    9   18:aastore         
	//   10   19:invokestatic    #774 <Method String String.format(Locale, String, Object[])>
	//   11   22:astore          5
		final long startedAtSeconds = date.getTime() / 1000L;
	//   12   24:aload_2         
	//   13   25:invokevirtual   #1009 <Method long Date.getTime()>
	//   14   28:ldc2w           #1010 <Long 1000L>
	//   15   31:ldiv            
	//   16   32:lstore_3        
		writeSessionPartFile(sessionId, "BeginSession", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
			{
				SessionProtobufHelper.writeBeginSession(codedoutputstream, sessionId, generator, startedAtSeconds);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #24  <Field String val$sessionId>
			//    3    5:aload_0         
			//    4    6:getfield        #26  <Field String val$generator>
			//    5    9:aload_0         
			//    6   10:getfield        #28  <Field long val$startedAtSeconds>
			//    7   13:invokestatic    #39  <Method void SessionProtobufHelper.writeBeginSession(CodedOutputStream, String, String, long)>
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
				startedAtSeconds = l1;
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
	//   26   46:invokespecial   #1089 <Method void CrashlyticsController$17(CrashlyticsController, String, String, long)>
	//   27   49:invokespecial   #1093 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(sessionId, "BeginSession.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
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
			//    1    1:new             #38  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$18$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #41  <Method void CrashlyticsController$18$1(CrashlyticsController$18)>
			//    7   13:invokespecial   #44  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #48  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #54  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #60  <Method void FileOutputStream.write(byte[])>
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
				startedAtSeconds = l1;
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
	//   30   54:ldc2            #644 <String "BeginSession.json">
	//   31   57:new             #24  <Class CrashlyticsController$18>
	//   32   60:dup             
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:aload           5
	//   36   65:lload_3         
	//   37   66:invokespecial   #1094 <Method void CrashlyticsController$18(CrashlyticsController, String, String, long)>
	//   38   69:invokespecial   #1098 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   39   72:return          
	}

	private void writeFatal(Date date, Thread thread, Throwable throwable)
	{
		Object obj1;
		ClsFileOutputStream clsfileoutputstream;
		Object obj2;
		clsfileoutputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          8
		Object obj = ((Object) (getCurrentSessionId()));
	//    6    9:aload_0         
	//    7   10:invokespecial   #382 <Method String getCurrentSessionId()>
	//    8   13:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_50;
	//    9   15:aload           4
	//   10   17:ifnonnull       50
		c.g().e("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", ((Throwable) (null)));
	//   11   20:invokestatic    #450 <Method l c.g()>
	//   12   23:ldc2            #452 <String "CrashlyticsCore">
	//   13   26:ldc2            #1100 <String "Tried to write a fatal exception while no session was open.">
	//   14   29:aconst_null     
	//   15   30:invokeinterface #495 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   16   35:aconst_null     
	//   17   36:ldc2            #1102 <String "Failed to flush to session begin file.">
	//   18   39:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		i.a(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   19   42:aconst_null     
	//   20   43:ldc2            #1104 <String "Failed to close fatal exception file output stream.">
	//   21   46:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		return;
	//   22   49:return          
		recordFatalExceptionAnswersEvent(((String) (obj)), ((Object) (throwable)).getClass().getName());
	//   23   50:aload           4
	//   24   52:aload_3         
	//   25   53:invokevirtual   #562 <Method Class Object.getClass()>
	//   26   56:invokevirtual   #567 <Method String Class.getName()>
	//   27   59:invokestatic    #642 <Method void recordFatalExceptionAnswersEvent(String, String)>
		File file = getFilesDir();
	//   28   62:aload_0         
	//   29   63:invokevirtual   #593 <Method File getFilesDir()>
	//   30   66:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   31   68:new             #466 <Class StringBuilder>
	//   32   71:dup             
	//   33   72:invokespecial   #467 <Method void StringBuilder()>
	//   34   75:astore          9
		stringbuilder.append(((String) (obj)));
	//   35   77:aload           9
	//   36   79:aload           4
	//   37   81:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   38   84:pop             
		stringbuilder.append("SessionCrash");
	//   39   85:aload           9
	//   40   87:ldc1            #183 <String "SessionCrash">
	//   41   89:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
		obj = ((Object) (new ClsFileOutputStream(file, stringbuilder.toString())));
	//   43   93:new             #486 <Class ClsFileOutputStream>
	//   44   96:dup             
	//   45   97:aload           7
	//   46   99:aload           9
	//   47  101:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   48  104:invokespecial   #596 <Method void ClsFileOutputStream(File, String)>
	//   49  107:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   50  109:aload           6
	//   51  111:astore          5
		clsfileoutputstream = ((ClsFileOutputStream) (obj));
	//   52  113:aload           4
	//   53  115:astore          6
		CodedOutputStream codedoutputstream;
		try
		{
			codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   54  117:aload           4
	//   55  119:invokestatic    #600 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   56  122:astore          7
		}
	//*  57  124:aload_0         
	//*  58  125:aload           7
	//*  59  127:aload_1         
	//*  60  128:aload_2         
	//*  61  129:aload_3         
	//*  62  130:ldc1            #115 <String "crash">
	//*  63  132:iconst_1        
	//*  64  133:invokespecial   #604 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
	//*  65  136:aload           7
	//*  66  138:ldc2            #1102 <String "Failed to flush to session begin file.">
	//*  67  141:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
	//*  68  144:goto            212
	//*  69  147:astore_1        
	//*  70  148:aload           7
	//*  71  150:astore          5
	//*  72  152:goto            226
	//*  73  155:astore_2        
	//*  74  156:aload           7
	//*  75  158:astore_1        
	//*  76  159:goto            183
		// Misplaced declaration of an exception variable
		catch(Thread thread)
	//*  77  162:astore_2        
		{
			date = ((Date) (obj2));
	//   78  163:aload           8
	//   79  165:astore_1        
			break MISSING_BLOCK_LABEL_183;
	//   80  166:goto            183
		}
		try
		{
			writeSessionEvent(codedoutputstream, date, thread, throwable, "crash", true);
		}
		// Misplaced declaration of an exception variable
		catch(Thread thread)
		{
			date = ((Date) (codedoutputstream));
			break MISSING_BLOCK_LABEL_183;
		}
		i.a(((java.io.Flushable) (codedoutputstream)), "Failed to flush to session begin file.");
		break MISSING_BLOCK_LABEL_212;
		date;
		obj1 = ((Object) (codedoutputstream));
		break MISSING_BLOCK_LABEL_226;
		date;
	//   81  169:astore_1        
		obj = null;
	//   82  170:aconst_null     
	//   83  171:astore          4
		break MISSING_BLOCK_LABEL_226;
	//   84  173:goto            226
		thread;
	//   85  176:astore_2        
		obj = null;
	//   86  177:aconst_null     
	//   87  178:astore          4
		date = ((Date) (obj2));
	//   88  180:aload           8
	//   89  182:astore_1        
		obj1 = ((Object) (date));
	//   90  183:aload_1         
	//   91  184:astore          5
		clsfileoutputstream = ((ClsFileOutputStream) (obj));
	//   92  186:aload           4
	//   93  188:astore          6
		c.g().e("CrashlyticsCore", "An error occurred in the fatal exception logger", ((Throwable) (thread)));
	//   94  190:invokestatic    #450 <Method l c.g()>
	//   95  193:ldc2            #452 <String "CrashlyticsCore">
	//   96  196:ldc2            #1106 <String "An error occurred in the fatal exception logger">
	//   97  199:aload_2         
	//   98  200:invokeinterface #495 <Method void l.e(String, String, Throwable)>
		i.a(((java.io.Flushable) (date)), "Failed to flush to session begin file.");
	//   99  205:aload_1         
	//  100  206:ldc2            #1102 <String "Failed to flush to session begin file.">
	//  101  209:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		i.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
	//  102  212:aload           4
	//  103  214:ldc2            #1104 <String "Failed to close fatal exception file output stream.">
	//  104  217:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		return;
	//  105  220:return          
		date;
	//  106  221:astore_1        
		obj = ((Object) (clsfileoutputstream));
	//  107  222:aload           6
	//  108  224:astore          4
		i.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
	//  109  226:aload           5
	//  110  228:ldc2            #1102 <String "Failed to flush to session begin file.">
	//  111  231:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		i.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
	//  112  234:aload           4
	//  113  236:ldc2            #1104 <String "Failed to close fatal exception file output stream.">
	//  114  239:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		throw date;
	//  115  242:aload_1         
	//  116  243:athrow          
	}

	private void writeFile(String s, String s1, FileOutputStreamWriteAction fileoutputstreamwriteaction)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		File file = getFilesDir();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #593 <Method File getFilesDir()>
	//    4    7:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//    5    9:new             #466 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #467 <Method void StringBuilder()>
	//    8   16:astore          6
		stringbuilder1.append(s);
	//    9   18:aload           6
	//   10   20:aload_1         
	//   11   21:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder1.append(s1);
	//   13   25:aload           6
	//   14   27:aload_2         
	//   15   28:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		s = ((String) (new FileOutputStream(new File(file, stringbuilder1.toString()))));
	//   17   32:new             #802 <Class FileOutputStream>
	//   18   35:dup             
	//   19   36:new             #516 <Class File>
	//   20   39:dup             
	//   21   40:aload           5
	//   22   42:aload           6
	//   23   44:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   24   47:invokespecial   #683 <Method void File(File, String)>
	//   25   50:invokespecial   #803 <Method void FileOutputStream(File)>
	//   26   53:astore_1        
		fileoutputstreamwriteaction.writeTo(((FileOutputStream) (s)));
	//   27   54:aload_3         
	//   28   55:aload_1         
	//   29   56:invokeinterface #1110 <Method void CrashlyticsController$FileOutputStreamWriteAction.writeTo(FileOutputStream)>
		fileoutputstreamwriteaction = ((FileOutputStreamWriteAction) (new StringBuilder()));
	//   30   61:new             #466 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #467 <Method void StringBuilder()>
	//   33   68:astore_3        
		((StringBuilder) (fileoutputstreamwriteaction)).append("Failed to close ");
	//   34   69:aload_3         
	//   35   70:ldc2            #1112 <String "Failed to close ">
	//   36   73:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
		((StringBuilder) (fileoutputstreamwriteaction)).append(s1);
	//   38   77:aload_3         
	//   39   78:aload_2         
	//   40   79:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
		((StringBuilder) (fileoutputstreamwriteaction)).append(" file.");
	//   42   83:aload_3         
	//   43   84:ldc2            #1114 <String " file.">
	//   44   87:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
		i.a(((java.io.Closeable) (s)), ((StringBuilder) (fileoutputstreamwriteaction)).toString());
	//   46   91:aload_1         
	//   47   92:aload_3         
	//   48   93:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   49   96:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
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
	//   56  108:new             #466 <Class StringBuilder>
	//   57  111:dup             
	//   58  112:invokespecial   #467 <Method void StringBuilder()>
	//   59  115:astore          4
		stringbuilder.append("Failed to close ");
	//   60  117:aload           4
	//   61  119:ldc2            #1112 <String "Failed to close ">
	//   62  122:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   63  125:pop             
		stringbuilder.append(s1);
	//   64  126:aload           4
	//   65  128:aload_2         
	//   66  129:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   67  132:pop             
		stringbuilder.append(" file.");
	//   68  133:aload           4
	//   69  135:ldc2            #1114 <String " file.">
	//   70  138:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   71  141:pop             
		i.a(((java.io.Closeable) (s)), stringbuilder.toString());
	//   72  142:aload_1         
	//   73  143:aload           4
	//   74  145:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   75  148:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		throw fileoutputstreamwriteaction;
	//   76  151:aload_3         
	//   77  152:athrow          
	}

	private void writeInitialPartsTo(CodedOutputStream codedoutputstream, String s)
	{
		String as[] = INITIAL_SESSION_PART_TAGS;
	//    0    0:getstatic       #286 <Field String[] INITIAL_SESSION_PART_TAGS>
	//    1    3:astore          5
		int k = as.length;
	//    2    5:aload           5
	//    3    7:arraylength     
	//    4    8:istore          4
		for(int j = 0; j < k; j++)
	//*   5   10:iconst_0        
	//*   6   11:istore_3        
	//*   7   12:iload_3         
	//*   8   13:iload           4
	//*   9   15:icmpge          224
		{
			String s1 = as[j];
	//   10   18:aload           5
	//   11   20:iload_3         
	//   12   21:aaload          
	//   13   22:astore          6
			Object obj = ((Object) (new StringBuilder()));
	//   14   24:new             #466 <Class StringBuilder>
	//   15   27:dup             
	//   16   28:invokespecial   #467 <Method void StringBuilder()>
	//   17   31:astore          7
			((StringBuilder) (obj)).append(s);
	//   18   33:aload           7
	//   19   35:aload_2         
	//   20   36:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			((StringBuilder) (obj)).append(s1);
	//   22   40:aload           7
	//   23   42:aload           6
	//   24   44:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			((StringBuilder) (obj)).append(".cls");
	//   26   48:aload           7
	//   27   50:ldc2            #1116 <String ".cls">
	//   28   53:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   30   57:aload_0         
	//   31   58:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   32   61:dup             
	//   33   62:aload           7
	//   34   64:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   35   67:invokespecial   #775 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   36   70:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
	//   37   73:astore          7
			if(obj.length == 0)
	//*  38   75:aload           7
	//*  39   77:arraylength     
	//*  40   78:ifne            147
			{
				obj = ((Object) (c.g()));
	//   41   81:invokestatic    #450 <Method l c.g()>
	//   42   84:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   43   86:new             #466 <Class StringBuilder>
	//   44   89:dup             
	//   45   90:invokespecial   #467 <Method void StringBuilder()>
	//   46   93:astore          8
				stringbuilder.append("Can't find ");
	//   47   95:aload           8
	//   48   97:ldc2            #1118 <String "Can't find ">
	//   49  100:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
				stringbuilder.append(s1);
	//   51  104:aload           8
	//   52  106:aload           6
	//   53  108:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:pop             
				stringbuilder.append(" data for session ID ");
	//   55  112:aload           8
	//   56  114:ldc2            #1120 <String " data for session ID ">
	//   57  117:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
				stringbuilder.append(s);
	//   59  121:aload           8
	//   60  123:aload_2         
	//   61  124:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   62  127:pop             
				((l) (obj)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   63  128:aload           7
	//   64  130:ldc2            #452 <String "CrashlyticsCore">
	//   65  133:aload           8
	//   66  135:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   67  138:aconst_null     
	//   68  139:invokeinterface #495 <Method void l.e(String, String, Throwable)>
			} else
	//*  69  144:goto            217
			{
				l l1 = c.g();
	//   70  147:invokestatic    #450 <Method l c.g()>
	//   71  150:astore          8
				StringBuilder stringbuilder1 = new StringBuilder();
	//   72  152:new             #466 <Class StringBuilder>
	//   73  155:dup             
	//   74  156:invokespecial   #467 <Method void StringBuilder()>
	//   75  159:astore          9
				stringbuilder1.append("Collecting ");
	//   76  161:aload           9
	//   77  163:ldc2            #1122 <String "Collecting ">
	//   78  166:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   79  169:pop             
				stringbuilder1.append(s1);
	//   80  170:aload           9
	//   81  172:aload           6
	//   82  174:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   83  177:pop             
				stringbuilder1.append(" data for session ID ");
	//   84  178:aload           9
	//   85  180:ldc2            #1120 <String " data for session ID ">
	//   86  183:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   87  186:pop             
				stringbuilder1.append(s);
	//   88  187:aload           9
	//   89  189:aload_2         
	//   90  190:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   91  193:pop             
				l1.a("CrashlyticsCore", stringbuilder1.toString());
	//   92  194:aload           8
	//   93  196:ldc2            #452 <String "CrashlyticsCore">
	//   94  199:aload           9
	//   95  201:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   96  204:invokeinterface #460 <Method void l.a(String, String)>
				writeToCosFromFile(codedoutputstream, ((File) (obj[0])));
	//   97  209:aload_1         
	//   98  210:aload           7
	//   99  212:iconst_0        
	//  100  213:aaload          
	//  101  214:invokestatic    #1005 <Method void writeToCosFromFile(CodedOutputStream, File)>
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
		Arrays.sort(((Object []) (afile)), i.a);
	//    0    0:aload_1         
	//    1    1:getstatic       #1124 <Field Comparator i.a>
	//    2    4:invokestatic    #841 <Method void Arrays.sort(Object[], Comparator)>
		int k = afile.length;
	//    3    7:aload_1         
	//    4    8:arraylength     
	//    5    9:istore          4
		for(int j = 0; j < k; j++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          94
		{
			File file = afile[j];
	//   11   19:aload_1         
	//   12   20:iload_3         
	//   13   21:aaload          
	//   14   22:astore          5
			try
			{
				c.g().a("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
					s, file.getName()
				}));
	//   15   24:invokestatic    #450 <Method l c.g()>
	//   16   27:ldc2            #452 <String "CrashlyticsCore">
	//   17   30:getstatic       #762 <Field Locale Locale.US>
	//   18   33:ldc2            #1126 <String "Found Non Fatal for session ID %s in %s ">
	//   19   36:iconst_2        
	//   20   37:anewarray       Object[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:aload_2         
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_1        
	//   27   46:aload           5
	//   28   48:invokevirtual   #750 <Method String File.getName()>
	//   29   51:aastore         
	//   30   52:invokestatic    #774 <Method String String.format(Locale, String, Object[])>
	//   31   55:invokeinterface #460 <Method void l.a(String, String)>
				writeToCosFromFile(codedoutputstream, file);
	//   32   60:aload_0         
	//   33   61:aload           5
	//   34   63:invokestatic    #1005 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
	//*  35   66:goto            87
			catch(Exception exception)
	//*  36   69:astore          5
			{
				c.g().e("CrashlyticsCore", "Error writting non-fatal to session.", ((Throwable) (exception)));
	//   37   71:invokestatic    #450 <Method l c.g()>
	//   38   74:ldc2            #452 <String "CrashlyticsCore">
	//   39   77:ldc2            #1128 <String "Error writting non-fatal to session.">
	//   40   80:aload           5
	//   41   82:invokeinterface #495 <Method void l.e(String, String, Throwable)>
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
	{
		final String appIdentifier = idManager.c();
	//    0    0:aload_0         
	//    1    1:getfield        #304 <Field p idManager>
	//    2    4:invokevirtual   #1133 <Method String p.c()>
	//    3    7:astore_3        
		final String versionCode = appData.versionCode;
	//    4    8:aload_0         
	//    5    9:getfield        #310 <Field AppData appData>
	//    6   12:getfield        #1136 <Field String AppData.versionCode>
	//    7   15:astore          4
		final String versionName = appData.versionName;
	//    8   17:aload_0         
	//    9   18:getfield        #310 <Field AppData appData>
	//   10   21:getfield        #1139 <Field String AppData.versionName>
	//   11   24:astore          5
		final String installUuid = idManager.b();
	//   12   26:aload_0         
	//   13   27:getfield        #304 <Field p idManager>
	//   14   30:invokevirtual   #1141 <Method String p.b()>
	//   15   33:astore          6
		final int deliveryMechanism = b.a.a.a.a.b.l.determineFrom(appData.installerPackageName).getId();
	//   16   35:aload_0         
	//   17   36:getfield        #310 <Field AppData appData>
	//   18   39:getfield        #1144 <Field String AppData.installerPackageName>
	//   19   42:invokestatic    #1150 <Method b.a.a.a.a.b.l b.a.a.a.a.b.l.determineFrom(String)>
	//   20   45:invokevirtual   #1153 <Method int b.a.a.a.a.b.l.getId()>
	//   21   48:istore_2        
		writeSessionPartFile(s, "SessionApp", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
			{
				SessionProtobufHelper.writeSessionApp(codedoutputstream, appIdentifier, appData.apiKey, versionCode, versionName, installUuid, deliveryMechanism, unityVersion);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #26  <Field String val$appIdentifier>
			//    3    5:aload_0         
			//    4    6:getfield        #24  <Field CrashlyticsController this$0>
			//    5    9:invokestatic    #44  <Method AppData CrashlyticsController.access$1900(CrashlyticsController)>
			//    6   12:getfield        #49  <Field String AppData.apiKey>
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
			//   17   35:invokestatic    #53  <Method String CrashlyticsController.access$2000(CrashlyticsController)>
			//   18   38:invokestatic    #58  <Method void SessionProtobufHelper.writeSessionApp(CodedOutputStream, String, String, String, String, String, int, String)>
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
				deliveryMechanism = j;
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
	//   33   66:invokespecial   #1156 <Method void CrashlyticsController$19(CrashlyticsController, String, String, String, String, int)>
	//   34   69:invokespecial   #1093 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(s, "SessionApp.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
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
			//    1    1:new             #44  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$20$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #47  <Method void CrashlyticsController$20$1(CrashlyticsController$20)>
			//    7   13:invokespecial   #50  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #54  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #60  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #66  <Method void FileOutputStream.write(byte[])>
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
				deliveryMechanism = j;
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
	//   37   74:ldc2            #650 <String "SessionApp.json">
	//   38   77:new             #32  <Class CrashlyticsController$20>
	//   39   80:dup             
	//   40   81:aload_0         
	//   41   82:aload_3         
	//   42   83:aload           4
	//   43   85:aload           5
	//   44   87:aload           6
	//   45   89:iload_2         
	//   46   90:invokespecial   #1157 <Method void CrashlyticsController$20(CrashlyticsController, String, String, String, String, int)>
	//   47   93:invokespecial   #1098 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   48   96:return          
	}

	private void writeSessionDevice(String s)
	{
		Context context = crashlyticsCore.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//    3    7:astore          10
		final Map ids = ((Map) (new StatFs(Environment.getDataDirectory().getPath())));
	//    4    9:new             #1159 <Class StatFs>
	//    5   12:dup             
	//    6   13:invokestatic    #1164 <Method File Environment.getDataDirectory()>
	//    7   16:invokevirtual   #1167 <Method String File.getPath()>
	//    8   19:invokespecial   #1168 <Method void StatFs(String)>
	//    9   22:astore          11
		final int arch = i.a();
	//   10   24:invokestatic    #1170 <Method int i.a()>
	//   11   27:istore_2        
		final int availableProcessors = Runtime.getRuntime().availableProcessors();
	//   12   28:invokestatic    #1174 <Method Runtime Runtime.getRuntime()>
	//   13   31:invokevirtual   #1177 <Method int Runtime.availableProcessors()>
	//   14   34:istore_3        
		final long totalRam = i.b();
	//   15   35:invokestatic    #1179 <Method long i.b()>
	//   16   38:lstore          5
		final long diskSpace = (long)((StatFs) (ids)).getBlockCount() * (long)((StatFs) (ids)).getBlockSize();
	//   17   40:aload           11
	//   18   42:invokevirtual   #1182 <Method int StatFs.getBlockCount()>
	//   19   45:i2l             
	//   20   46:aload           11
	//   21   48:invokevirtual   #1185 <Method int StatFs.getBlockSize()>
	//   22   51:i2l             
	//   23   52:lmul            
	//   24   53:lstore          7
		final boolean isEmulator = i.f(context);
	//   25   55:aload           10
	//   26   57:invokestatic    #1189 <Method boolean i.f(Context)>
	//   27   60:istore          9
		ids = idManager.h();
	//   28   62:aload_0         
	//   29   63:getfield        #304 <Field p idManager>
	//   30   66:invokevirtual   #1193 <Method Map p.h()>
	//   31   69:astore          11
		final int state = i.h(context);
	//   32   71:aload           10
	//   33   73:invokestatic    #1196 <Method int i.h(Context)>
	//   34   76:istore          4
		writeSessionPartFile(s, "SessionDevice", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
			{
				SessionProtobufHelper.writeSessionDevice(codedoutputstream, arch, Build.MODEL, availableProcessors, totalRam, diskSpace, isEmulator, ids, state, Build.MANUFACTURER, Build.PRODUCT);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #30  <Field int val$arch>
			//    3    5:getstatic       #54  <Field String Build.MODEL>
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
			//   16   32:getstatic       #57  <Field String Build.MANUFACTURER>
			//   17   35:getstatic       #60  <Field String Build.PRODUCT>
			//   18   38:invokestatic    #65  <Method void SessionProtobufHelper.writeSessionDevice(CodedOutputStream, int, String, int, long, long, boolean, Map, int, String, String)>
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
				arch = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #30  <Field int val$arch>
				availableProcessors = k;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #32  <Field int val$availableProcessors>
				totalRam = l1;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #34  <Field long val$totalRam>
				diskSpace = l2;
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
				state = i1;
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
	//   48   99:invokespecial   #1199 <Method void CrashlyticsController$23(CrashlyticsController, int, int, long, long, boolean, Map, int)>
	//   49  102:invokespecial   #1093 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(s, "SessionDevice.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
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
			//    1    1:new             #52  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$24$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #55  <Method void CrashlyticsController$24$1(CrashlyticsController$24)>
			//    7   13:invokespecial   #58  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #62  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #68  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #74  <Method void FileOutputStream.write(byte[])>
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
				arch = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #32  <Field int val$arch>
				availableProcessors = k;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #34  <Field int val$availableProcessors>
				totalRam = l1;
			//    9   15:aload_0         
			//   10   16:lload           4
			//   11   18:putfield        #36  <Field long val$totalRam>
				diskSpace = l2;
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
				state = i1;
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
	//   52  107:ldc2            #652 <String "SessionDevice.json">
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
	//   63  127:invokespecial   #1200 <Method void CrashlyticsController$24(CrashlyticsController, int, int, long, long, boolean, Map, int)>
	//   64  130:invokespecial   #1098 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   65  133:return          
	}

	private void writeSessionEvent(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
	{
		TrimmedThrowableData trimmedthrowabledata = new TrimmedThrowableData(throwable, stackTraceTrimmingStrategy);
	//    0    0:new             #1202 <Class TrimmedThrowableData>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_0         
	//    4    7:getfield        #367 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//    5   10:invokespecial   #1205 <Method void TrimmedThrowableData(Throwable, StackTraceTrimmingStrategy)>
	//    6   13:astore          20
		Context context = crashlyticsCore.getContext();
	//    7   15:aload_0         
	//    8   16:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    9   19:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//   10   22:astore          19
		long l1 = date.getTime() / 1000L;
	//   11   24:aload_2         
	//   12   25:invokevirtual   #1009 <Method long Date.getTime()>
	//   13   28:ldc2w           #1010 <Long 1000L>
	//   14   31:ldiv            
	//   15   32:lstore          11
		Float float1 = i.c(context);
	//   16   34:aload           19
	//   17   36:invokestatic    #1208 <Method Float i.c(Context)>
	//   18   39:astore          21
		int k = i.a(context, devicePowerStateListener.isPowerConnected());
	//   19   41:aload           19
	//   20   43:aload_0         
	//   21   44:getfield        #355 <Field DevicePowerStateListener devicePowerStateListener>
	//   22   47:invokevirtual   #1211 <Method boolean DevicePowerStateListener.isPowerConnected()>
	//   23   50:invokestatic    #1214 <Method int i.a(Context, boolean)>
	//   24   53:istore          8
		boolean flag1 = i.d(context);
	//   25   55:aload           19
	//   26   57:invokestatic    #1216 <Method boolean i.d(Context)>
	//   27   60:istore          10
		int i1 = context.getResources().getConfiguration().orientation;
	//   28   62:aload           19
	//   29   64:invokevirtual   #1222 <Method Resources Context.getResources()>
	//   30   67:invokevirtual   #1228 <Method Configuration Resources.getConfiguration()>
	//   31   70:getfield        #1233 <Field int Configuration.orientation>
	//   32   73:istore          9
		long l2 = i.b();
	//   33   75:invokestatic    #1179 <Method long i.b()>
	//   34   78:lstore          13
		long l3 = i.b(context);
	//   35   80:aload           19
	//   36   82:invokestatic    #1236 <Method long i.b(Context)>
	//   37   85:lstore          15
		long l4 = i.c(Environment.getDataDirectory().getPath());
	//   38   87:invokestatic    #1164 <Method File Environment.getDataDirectory()>
	//   39   90:invokevirtual   #1167 <Method String File.getPath()>
	//   40   93:invokestatic    #1239 <Method long i.c(String)>
	//   41   96:lstore          17
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = i.a(context.getPackageName(), context);
	//   42   98:aload           19
	//   43  100:invokevirtual   #1242 <Method String Context.getPackageName()>
	//   44  103:aload           19
	//   45  105:invokestatic    #1245 <Method android.app.ActivityManager$RunningAppProcessInfo i.a(String, Context)>
	//   46  108:astore          22
		LinkedList linkedlist = new LinkedList();
	//   47  110:new             #1247 <Class LinkedList>
	//   48  113:dup             
	//   49  114:invokespecial   #1248 <Method void LinkedList()>
	//   50  117:astore          23
		StackTraceElement astacktraceelement[] = trimmedthrowabledata.stacktrace;
	//   51  119:aload           20
	//   52  121:getfield        #1252 <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   53  124:astore          24
		String s1 = appData.buildId;
	//   54  126:aload_0         
	//   55  127:getfield        #310 <Field AppData appData>
	//   56  130:getfield        #1255 <Field String AppData.buildId>
	//   57  133:astore          25
		String s2 = idManager.c();
	//   58  135:aload_0         
	//   59  136:getfield        #304 <Field p idManager>
	//   60  139:invokevirtual   #1133 <Method String p.c()>
	//   61  142:astore          26
		int j = 0;
	//   62  144:iconst_0        
	//   63  145:istore          7
		if(flag)
	//*  64  147:iload           6
	//*  65  149:ifeq            253
		{
			date = ((Date) (Thread.getAllStackTraces()));
	//   66  152:invokestatic    #1258 <Method Map Thread.getAllStackTraces()>
	//   67  155:astore_2        
			throwable = ((Throwable) (new Thread[((Map) (date)).size()]));
	//   68  156:aload_2         
	//   69  157:invokeinterface #1261 <Method int Map.size()>
	//   70  162:anewarray       Thread[]
	//   71  165:astore          4
			for(date = ((Date) (((Map) (date)).entrySet().iterator())); ((Iterator) (date)).hasNext();)
	//*  72  167:aload_2         
	//*  73  168:invokeinterface #1265 <Method Set Map.entrySet()>
	//*  74  173:invokeinterface #897 <Method Iterator Set.iterator()>
	//*  75  178:astore_2        
	//*  76  179:aload_2         
	//*  77  180:invokeinterface #902 <Method boolean Iterator.hasNext()>
	//*  78  185:ifeq            250
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (date)).next();
	//   79  188:aload_2         
	//   80  189:invokeinterface #906 <Method Object Iterator.next()>
	//   81  194:checkcast       #1267 <Class java.util.Map$Entry>
	//   82  197:astore          27
				throwable[j] = ((/*<invalid signature>*/java.lang.Object) ((Thread)entry.getKey()));
	//   83  199:aload           4
	//   84  201:iload           7
	//   85  203:aload           27
	//   86  205:invokeinterface #1270 <Method Object java.util.Map$Entry.getKey()>
	//   87  210:checkcast       #579 <Class Thread>
	//   88  213:aastore         
				((List) (linkedlist)).add(((Object) (stackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[])entry.getValue()))));
	//   89  214:aload           23
	//   90  216:aload_0         
	//   91  217:getfield        #367 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//   92  220:aload           27
	//   93  222:invokeinterface #1273 <Method Object java.util.Map$Entry.getValue()>
	//   94  227:checkcast       #1274 <Class StackTraceElement[]>
	//   95  230:invokeinterface #1278 <Method StackTraceElement[] StackTraceTrimmingStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   96  235:invokeinterface #1281 <Method boolean List.add(Object)>
	//   97  240:pop             
				j++;
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
		if(!i.a(context, "com.crashlytics.CollectCustomKeys", true))
	//* 107  259:aload           19
	//* 108  261:ldc1            #109 <String "com.crashlytics.CollectCustomKeys">
	//* 109  263:iconst_1        
	//* 110  264:invokestatic    #1284 <Method boolean i.a(Context, String, boolean)>
	//* 111  267:ifne            281
		{
			date = ((Date) (new TreeMap()));
	//  112  270:new             #1286 <Class TreeMap>
	//  113  273:dup             
	//  114  274:invokespecial   #1287 <Method void TreeMap()>
	//  115  277:astore_2        
		} else
	//* 116  278:goto            322
		{
			Map map = crashlyticsCore.getAttributes();
	//  117  281:aload_0         
	//  118  282:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//  119  285:invokevirtual   #1290 <Method Map CrashlyticsCore.getAttributes()>
	//  120  288:astore          19
			date = ((Date) (map));
	//  121  290:aload           19
	//  122  292:astore_2        
			if(map != null)
	//* 123  293:aload           19
	//* 124  295:ifnull          278
			{
				date = ((Date) (map));
	//  125  298:aload           19
	//  126  300:astore_2        
				if(map.size() > 1)
	//* 127  301:aload           19
	//* 128  303:invokeinterface #1261 <Method int Map.size()>
	//* 129  308:iconst_1        
	//* 130  309:icmple          278
					date = ((Date) (new TreeMap(map)));
	//  131  312:new             #1286 <Class TreeMap>
	//  132  315:dup             
	//  133  316:aload           19
	//  134  318:invokespecial   #1293 <Method void TreeMap(Map)>
	//  135  321:astore_2        
			}
		}
		SessionProtobufHelper.writeSessionEvent(codedoutputstream, l1, s, trimmedthrowabledata, thread, astacktraceelement, ((Thread []) (throwable)), ((List) (linkedlist)), ((Map) (date)), logFileManager, runningappprocessinfo, i1, s2, s1, float1, k, flag1, l2 - l3, l4);
	//  136  322:aload_1         
	//  137  323:lload           11
	//  138  325:aload           5
	//  139  327:aload           20
	//  140  329:aload_3         
	//  141  330:aload           24
	//  142  332:aload           4
	//  143  334:aload           23
	//  144  336:aload_2         
	//  145  337:aload_0         
	//  146  338:getfield        #340 <Field LogFileManager logFileManager>
	//  147  341:aload           22
	//  148  343:iload           9
	//  149  345:aload           26
	//  150  347:aload           25
	//  151  349:aload           21
	//  152  351:iload           8
	//  153  353:iload           10
	//  154  355:lload           13
	//  155  357:lload           15
	//  156  359:lsub            
	//  157  360:lload           17
	//  158  362:invokestatic    #1298 <Method void SessionProtobufHelper.writeSessionEvent(CodedOutputStream, long, String, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, Map, LogFileManager, android.app.ActivityManager$RunningAppProcessInfo, int, String, String, Float, int, boolean, long, long)>
	//  159  365:return          
	}

	private void writeSessionOS(String s)
	{
		final boolean isRooted = i.g(crashlyticsCore.getContext());
	//    0    0:aload_0         
	//    1    1:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #328 <Method Context CrashlyticsCore.getContext()>
	//    3    7:invokestatic    #1300 <Method boolean i.g(Context)>
	//    4   10:istore_2        
		writeSessionPartFile(s, "SessionOS", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
			{
				SessionProtobufHelper.writeSessionOS(codedoutputstream, android.os.Build.VERSION.RELEASE, android.os.Build.VERSION.CODENAME, isRooted);
			//    0    0:aload_1         
			//    1    1:getstatic       #33  <Field String android.os.Build$VERSION.RELEASE>
			//    2    4:getstatic       #36  <Field String android.os.Build$VERSION.CODENAME>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field boolean val$isRooted>
			//    5   11:invokestatic    #41  <Method void SessionProtobufHelper.writeSessionOS(CodedOutputStream, String, String, boolean)>
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
	//   12   21:invokespecial   #1303 <Method void CrashlyticsController$21(CrashlyticsController, boolean)>
	//   13   24:invokespecial   #1093 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
		writeFile(s, "SessionOS.json", new FileOutputStreamWriteAction() {

			public void writeTo(FileOutputStream fileoutputstream)
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
			//    1    1:new             #31  <Class JSONObject>
			//    2    4:dup             
			//    3    5:new             #13  <Class CrashlyticsController$22$1>
			//    4    8:dup             
			//    5    9:aload_0         
			//    6   10:invokespecial   #34  <Method void CrashlyticsController$22$1(CrashlyticsController$22)>
			//    7   13:invokespecial   #37  <Method void JSONObject(Map)>
			//    8   16:invokevirtual   #41  <Method String JSONObject.toString()>
			//    9   19:invokevirtual   #47  <Method byte[] String.getBytes()>
			//   10   22:invokevirtual   #53  <Method void FileOutputStream.write(byte[])>
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
	//   16   29:ldc2            #654 <String "SessionOS.json">
	//   17   32:new             #38  <Class CrashlyticsController$22>
	//   18   35:dup             
	//   19   36:aload_0         
	//   20   37:iload_2         
	//   21   38:invokespecial   #1304 <Method void CrashlyticsController$22(CrashlyticsController, boolean)>
	//   22   41:invokespecial   #1098 <Method void writeFile(String, String, CrashlyticsController$FileOutputStreamWriteAction)>
	//   23   44:return          
	}

	private void writeSessionPartFile(String s, String s1, CodedOutputStreamWriteAction codedoutputstreamwriteaction)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		File file = getFilesDir();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #593 <Method File getFilesDir()>
	//    4    7:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//    5    9:new             #466 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #467 <Method void StringBuilder()>
	//    8   16:astore          6
		stringbuilder1.append(s);
	//    9   18:aload           6
	//   10   20:aload_1         
	//   11   21:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder1.append(s1);
	//   13   25:aload           6
	//   14   27:aload_2         
	//   15   28:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		s = ((String) (new ClsFileOutputStream(file, stringbuilder1.toString())));
	//   17   32:new             #486 <Class ClsFileOutputStream>
	//   18   35:dup             
	//   19   36:aload           5
	//   20   38:aload           6
	//   21   40:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   22   43:invokespecial   #596 <Method void ClsFileOutputStream(File, String)>
	//   23   46:astore_1        
		CodedOutputStream codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (s)));
	//   24   47:aload_1         
	//   25   48:invokestatic    #600 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   26   51:astore          5
		codedoutputstreamwriteaction.writeTo(codedoutputstream);
	//   27   53:aload_3         
	//   28   54:aload           5
	//   29   56:invokeinterface #1307 <Method void CrashlyticsController$CodedOutputStreamWriteAction.writeTo(CodedOutputStream)>
		codedoutputstreamwriteaction = ((CodedOutputStreamWriteAction) (new StringBuilder()));
	//   30   61:new             #466 <Class StringBuilder>
	//   31   64:dup             
	//   32   65:invokespecial   #467 <Method void StringBuilder()>
	//   33   68:astore_3        
		((StringBuilder) (codedoutputstreamwriteaction)).append("Failed to flush to session ");
	//   34   69:aload_3         
	//   35   70:ldc2            #1309 <String "Failed to flush to session ">
	//   36   73:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   37   76:pop             
		((StringBuilder) (codedoutputstreamwriteaction)).append(s1);
	//   38   77:aload_3         
	//   39   78:aload_2         
	//   40   79:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
		((StringBuilder) (codedoutputstreamwriteaction)).append(" file.");
	//   42   83:aload_3         
	//   43   84:ldc2            #1114 <String " file.">
	//   44   87:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
		i.a(((java.io.Flushable) (codedoutputstream)), ((StringBuilder) (codedoutputstreamwriteaction)).toString());
	//   46   91:aload           5
	//   47   93:aload_3         
	//   48   94:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   49   97:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		codedoutputstreamwriteaction = ((CodedOutputStreamWriteAction) (new StringBuilder()));
	//   50  100:new             #466 <Class StringBuilder>
	//   51  103:dup             
	//   52  104:invokespecial   #467 <Method void StringBuilder()>
	//   53  107:astore_3        
		((StringBuilder) (codedoutputstreamwriteaction)).append("Failed to close session ");
	//   54  108:aload_3         
	//   55  109:ldc2            #1311 <String "Failed to close session ">
	//   56  112:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
		((StringBuilder) (codedoutputstreamwriteaction)).append(s1);
	//   58  116:aload_3         
	//   59  117:aload_2         
	//   60  118:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   61  121:pop             
		((StringBuilder) (codedoutputstreamwriteaction)).append(" file.");
	//   62  122:aload_3         
	//   63  123:ldc2            #1114 <String " file.">
	//   64  126:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   65  129:pop             
		i.a(((java.io.Closeable) (s)), ((StringBuilder) (codedoutputstreamwriteaction)).toString());
	//   66  130:aload_1         
	//   67  131:aload_3         
	//   68  132:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   69  135:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		return;
	//   70  138:return          
		Exception exception1;
		exception1;
	//   71  139:astore          6
		obj = ((Object) (codedoutputstream));
	//   72  141:aload           5
	//   73  143:astore          4
		codedoutputstreamwriteaction = ((CodedOutputStreamWriteAction) (s));
	//   74  145:aload_1         
	//   75  146:astore_3        
		s = ((String) (exception1));
	//   76  147:aload           6
	//   77  149:astore_1        
		break MISSING_BLOCK_LABEL_166;
	//   78  150:goto            166
		Exception exception;
		exception;
	//   79  153:astore          5
		codedoutputstreamwriteaction = ((CodedOutputStreamWriteAction) (s));
	//   80  155:aload_1         
	//   81  156:astore_3        
		s = ((String) (exception));
	//   82  157:aload           5
	//   83  159:astore_1        
		break MISSING_BLOCK_LABEL_166;
	//   84  160:goto            166
		s;
	//   85  163:astore_1        
		codedoutputstreamwriteaction = null;
	//   86  164:aconst_null     
	//   87  165:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   88  166:new             #466 <Class StringBuilder>
	//   89  169:dup             
	//   90  170:invokespecial   #467 <Method void StringBuilder()>
	//   91  173:astore          5
		stringbuilder.append("Failed to flush to session ");
	//   92  175:aload           5
	//   93  177:ldc2            #1309 <String "Failed to flush to session ">
	//   94  180:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   95  183:pop             
		stringbuilder.append(s1);
	//   96  184:aload           5
	//   97  186:aload_2         
	//   98  187:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   99  190:pop             
		stringbuilder.append(" file.");
	//  100  191:aload           5
	//  101  193:ldc2            #1114 <String " file.">
	//  102  196:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  103  199:pop             
		i.a(((java.io.Flushable) (obj)), stringbuilder.toString());
	//  104  200:aload           4
	//  105  202:aload           5
	//  106  204:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  107  207:invokestatic    #609 <Method void i.a(java.io.Flushable, String)>
		obj = ((Object) (new StringBuilder()));
	//  108  210:new             #466 <Class StringBuilder>
	//  109  213:dup             
	//  110  214:invokespecial   #467 <Method void StringBuilder()>
	//  111  217:astore          4
		((StringBuilder) (obj)).append("Failed to close session ");
	//  112  219:aload           4
	//  113  221:ldc2            #1311 <String "Failed to close session ">
	//  114  224:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  115  227:pop             
		((StringBuilder) (obj)).append(s1);
	//  116  228:aload           4
	//  117  230:aload_2         
	//  118  231:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  119  234:pop             
		((StringBuilder) (obj)).append(" file.");
	//  120  235:aload           4
	//  121  237:ldc2            #1114 <String " file.">
	//  122  240:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  123  243:pop             
		i.a(((java.io.Closeable) (codedoutputstreamwriteaction)), ((StringBuilder) (obj)).toString());
	//  124  244:aload_3         
	//  125  245:aload           4
	//  126  247:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  127  250:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		throw s;
	//  128  253:aload_1         
	//  129  254:athrow          
	}

	private void writeSessionPartsToSessionFile(File file, String s, int j)
	{
		Object obj = ((Object) (c.g()));
	//    0    0:invokestatic    #450 <Method l c.g()>
	//    1    3:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #466 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #467 <Method void StringBuilder()>
	//    5   12:astore          7
		stringbuilder.append("Collecting session parts for ID ");
	//    6   14:aload           7
	//    7   16:ldc2            #1313 <String "Collecting session parts for ID ">
	//    8   19:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:pop             
		stringbuilder.append(s);
	//   10   23:aload           7
	//   11   25:aload_2         
	//   12   26:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		((l) (obj)).a("CrashlyticsCore", stringbuilder.toString());
	//   14   30:aload           6
	//   15   32:ldc2            #452 <String "CrashlyticsCore">
	//   16   35:aload           7
	//   17   37:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   18   40:invokeinterface #460 <Method void l.a(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   19   45:new             #466 <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #467 <Method void StringBuilder()>
	//   22   52:astore          6
		((StringBuilder) (obj)).append(s);
	//   23   54:aload           6
	//   24   56:aload_2         
	//   25   57:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
		((StringBuilder) (obj)).append("SessionCrash");
	//   27   61:aload           6
	//   28   63:ldc1            #183 <String "SessionCrash">
	//   29   65:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
		obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   31   69:aload_0         
	//   32   70:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   33   73:dup             
	//   34   74:aload           6
	//   35   76:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   36   79:invokespecial   #775 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   37   82:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
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
		c.g().a("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
			s, Boolean.valueOf(flag)
		}));
	//   49  107:invokestatic    #450 <Method l c.g()>
	//   50  110:ldc2            #452 <String "CrashlyticsCore">
	//   51  113:getstatic       #762 <Field Locale Locale.US>
	//   52  116:ldc2            #1315 <String "Session %s has fatal exception: %s">
	//   53  119:iconst_2        
	//   54  120:anewarray       Object[]
	//   55  123:dup             
	//   56  124:iconst_0        
	//   57  125:aload_2         
	//   58  126:aastore         
	//   59  127:dup             
	//   60  128:iconst_1        
	//   61  129:iload           4
	//   62  131:invokestatic    #1320 <Method Boolean Boolean.valueOf(boolean)>
	//   63  134:aastore         
	//   64  135:invokestatic    #774 <Method String String.format(Locale, String, Object[])>
	//   65  138:invokeinterface #460 <Method void l.a(String, String)>
		stringbuilder = new StringBuilder();
	//   66  143:new             #466 <Class StringBuilder>
	//   67  146:dup             
	//   68  147:invokespecial   #467 <Method void StringBuilder()>
	//   69  150:astore          7
		stringbuilder.append(s);
	//   70  152:aload           7
	//   71  154:aload_2         
	//   72  155:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   73  158:pop             
		stringbuilder.append("SessionEvent");
	//   74  159:aload           7
	//   75  161:ldc1            #194 <String "SessionEvent">
	//   76  163:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   77  166:pop             
		File afile[] = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))));
	//   78  167:aload_0         
	//   79  168:new             #73  <Class CrashlyticsController$FileNameContainsFilter>
	//   80  171:dup             
	//   81  172:aload           7
	//   82  174:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   83  177:invokespecial   #775 <Method void CrashlyticsController$FileNameContainsFilter(String)>
	//   84  180:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
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
		c.g().a("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
			s, Boolean.valueOf(flag1)
		}));
	//   96  205:invokestatic    #450 <Method l c.g()>
	//   97  208:ldc2            #452 <String "CrashlyticsCore">
	//   98  211:getstatic       #762 <Field Locale Locale.US>
	//   99  214:ldc2            #1322 <String "Session %s has non-fatal exceptions: %s">
	//  100  217:iconst_2        
	//  101  218:anewarray       Object[]
	//  102  221:dup             
	//  103  222:iconst_0        
	//  104  223:aload_2         
	//  105  224:aastore         
	//  106  225:dup             
	//  107  226:iconst_1        
	//  108  227:iload           5
	//  109  229:invokestatic    #1320 <Method Boolean Boolean.valueOf(boolean)>
	//  110  232:aastore         
	//  111  233:invokestatic    #774 <Method String String.format(Locale, String, Object[])>
	//  112  236:invokeinterface #460 <Method void l.a(String, String)>
		if(!flag && !flag1)
	//* 113  241:iload           4
	//* 114  243:ifne            300
	//* 115  246:iload           5
	//* 116  248:ifeq            254
	//* 117  251:goto            300
		{
			file = ((File) (c.g()));
	//  118  254:invokestatic    #450 <Method l c.g()>
	//  119  257:astore_1        
			obj = ((Object) (new StringBuilder()));
	//  120  258:new             #466 <Class StringBuilder>
	//  121  261:dup             
	//  122  262:invokespecial   #467 <Method void StringBuilder()>
	//  123  265:astore          6
			((StringBuilder) (obj)).append("No events present for session ID ");
	//  124  267:aload           6
	//  125  269:ldc2            #1324 <String "No events present for session ID ">
	//  126  272:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  127  275:pop             
			((StringBuilder) (obj)).append(s);
	//  128  276:aload           6
	//  129  278:aload_2         
	//  130  279:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  131  282:pop             
			((l) (file)).a("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  132  283:aload_1         
	//  133  284:ldc2            #452 <String "CrashlyticsCore">
	//  134  287:aload           6
	//  135  289:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  136  292:invokeinterface #460 <Method void l.a(String, String)>
		} else
	//* 137  297:goto            337
		{
			afile = getTrimmedNonFatalFiles(s, afile, j);
	//  138  300:aload_0         
	//  139  301:aload_2         
	//  140  302:aload           7
	//  141  304:iload_3         
	//  142  305:invokespecial   #1326 <Method File[] getTrimmedNonFatalFiles(String, File[], int)>
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
	//  158  334:invokespecial   #1328 <Method void synthesizeSessionFile(File, String, File[], File)>
		}
		file = ((File) (c.g()));
	//  159  337:invokestatic    #450 <Method l c.g()>
	//  160  340:astore_1        
		obj = ((Object) (new StringBuilder()));
	//  161  341:new             #466 <Class StringBuilder>
	//  162  344:dup             
	//  163  345:invokespecial   #467 <Method void StringBuilder()>
	//  164  348:astore          6
		((StringBuilder) (obj)).append("Removing session part files for ID ");
	//  165  350:aload           6
	//  166  352:ldc2            #1330 <String "Removing session part files for ID ">
	//  167  355:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  168  358:pop             
		((StringBuilder) (obj)).append(s);
	//  169  359:aload           6
	//  170  361:aload_2         
	//  171  362:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  172  365:pop             
		((l) (file)).a("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  173  366:aload_1         
	//  174  367:ldc2            #452 <String "CrashlyticsCore">
	//  175  370:aload           6
	//  176  372:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  177  375:invokeinterface #460 <Method void l.a(String, String)>
		deleteSessionPartFilesFor(s);
	//  178  380:aload_0         
	//  179  381:aload_2         
	//  180  382:invokespecial   #1332 <Method void deleteSessionPartFilesFor(String)>
	//  181  385:return          
	}

	private void writeSessionUser(String s)
	{
		writeSessionPartFile(s, "SessionUser", new CodedOutputStreamWriteAction() {

			public void writeTo(CodedOutputStream codedoutputstream)
			{
				SessionProtobufHelper.writeSessionUser(codedoutputstream, userMetaData.id, userMetaData.name, userMetaData.email);
			//    0    0:aload_1         
			//    1    1:aload_0         
			//    2    2:getfield        #21  <Field UserMetaData val$userMetaData>
			//    3    5:getfield        #33  <Field String UserMetaData.id>
			//    4    8:aload_0         
			//    5    9:getfield        #21  <Field UserMetaData val$userMetaData>
			//    6   12:getfield        #36  <Field String UserMetaData.name>
			//    7   15:aload_0         
			//    8   16:getfield        #21  <Field UserMetaData val$userMetaData>
			//    9   19:getfield        #39  <Field String UserMetaData.email>
			//   10   22:invokestatic    #44  <Method void SessionProtobufHelper.writeSessionUser(CodedOutputStream, String, String, String)>
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
	//    8   11:invokespecial   #1335 <Method UserMetaData getUserMetaData(String)>
	//    9   14:invokespecial   #1338 <Method void CrashlyticsController$25(CrashlyticsController, UserMetaData)>
	//   10   17:invokespecial   #1093 <Method void writeSessionPartFile(String, String, CrashlyticsController$CodedOutputStreamWriteAction)>
	//   11   20:return          
	}

	private static void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
	{
		if(!file.exists())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #996 <Method boolean File.exists()>
	//*   2    4:ifne            51
		{
			codedoutputstream = ((CodedOutputStream) (c.g()));
	//    3    7:invokestatic    #450 <Method l c.g()>
	//    4   10:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #466 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #467 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("Tried to include a file that doesn't exist: ");
	//    9   19:aload_2         
	//   10   20:ldc2            #1340 <String "Tried to include a file that doesn't exist: ">
	//   11   23:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append(file.getName());
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #750 <Method String File.getName()>
	//   16   32:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((l) (codedoutputstream)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   18   36:aload_0         
	//   19   37:ldc2            #452 <String "CrashlyticsCore">
	//   20   40:aload_2         
	//   21   41:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   22   44:aconst_null     
	//   23   45:invokeinterface #495 <Method void l.e(String, String, Throwable)>
			return;
	//   24   50:return          
		}
		FileInputStream fileinputstream = new FileInputStream(file);
	//   25   51:new             #1342 <Class FileInputStream>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:invokespecial   #1343 <Method void FileInputStream(File)>
	//   29   59:astore_2        
		copyToCodedOutputStream(((InputStream) (fileinputstream)), codedoutputstream, (int)file.length());
	//   30   60:aload_2         
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #1346 <Method long File.length()>
	//   34   66:l2i             
	//   35   67:invokestatic    #1348 <Method void copyToCodedOutputStream(InputStream, CodedOutputStream, int)>
		i.a(((java.io.Closeable) (fileinputstream)), "Failed to close file input stream.");
	//   36   70:aload_2         
	//   37   71:ldc2            #1350 <String "Failed to close file input stream.">
	//   38   74:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
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
		i.a(((java.io.Closeable) (codedoutputstream)), "Failed to close file input stream.");
	//   47   87:aload_0         
	//   48   88:ldc2            #1350 <String "Failed to close file input stream.">
	//   49   91:invokestatic    #616 <Method void i.a(java.io.Closeable, String)>
		throw file;
	//   50   94:aload_1         
	//   51   95:athrow          
	}

	void cacheKeyData(final Map keyData)
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #31  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
			{
				String s = getCurrentSessionId();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #35  <Method String CrashlyticsController.access$1200(CrashlyticsController)>
			//    3    7:astore_1        
				(new MetaDataStore(getFilesDir())).writeKeyData(s, keyData);
			//    4    8:new             #37  <Class MetaDataStore>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:getfield        #20  <Field CrashlyticsController this$0>
			//    8   16:invokevirtual   #41  <Method File CrashlyticsController.getFilesDir()>
			//    9   19:invokespecial   #44  <Method void MetaDataStore(File)>
			//   10   22:aload_1         
			//   11   23:aload_0         
			//   12   24:getfield        #22  <Field Map val$keyData>
			//   13   27:invokevirtual   #48  <Method void MetaDataStore.writeKeyData(String, Map)>
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
	//    6   10:invokespecial   #1354 <Method void CrashlyticsController$11(CrashlyticsController, Map)>
	//    7   13:invokevirtual   #1357 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    8   16:pop             
	//    9   17:return          
	}

	void cacheUserData(final String userId, final String userName, final String userEmail)
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #37  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
			{
				String s = getCurrentSessionId();
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #41  <Method String CrashlyticsController.access$1200(CrashlyticsController)>
			//    3    7:astore_1        
				(new MetaDataStore(getFilesDir())).writeUserData(s, new UserMetaData(userId, userName, userEmail));
			//    4    8:new             #43  <Class MetaDataStore>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:getfield        #22  <Field CrashlyticsController this$0>
			//    8   16:invokevirtual   #47  <Method File CrashlyticsController.getFilesDir()>
			//    9   19:invokespecial   #50  <Method void MetaDataStore(File)>
			//   10   22:aload_1         
			//   11   23:new             #52  <Class UserMetaData>
			//   12   26:dup             
			//   13   27:aload_0         
			//   14   28:getfield        #24  <Field String val$userId>
			//   15   31:aload_0         
			//   16   32:getfield        #26  <Field String val$userName>
			//   17   35:aload_0         
			//   18   36:getfield        #28  <Field String val$userEmail>
			//   19   39:invokespecial   #54  <Method void UserMetaData(String, String, String)>
			//   20   42:invokevirtual   #58  <Method void MetaDataStore.writeUserData(String, UserMetaData)>
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
	//    8   12:invokespecial   #1362 <Method void CrashlyticsController$10(CrashlyticsController, String, String, String)>
	//    9   15:invokevirtual   #1357 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//   10   18:pop             
	//   11   19:return          
	}

	void cleanInvalidTempFiles()
	{
		backgroundWorker.submit(new Runnable() {

			public void run()
			{
				doCleanInvalidTempFiles(listFilesMatching(((FilenameFilter) (new InvalidPartFileFilter()))));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsController this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field CrashlyticsController this$0>
			//    4    8:new             #23  <Class CrashlyticsController$InvalidPartFileFilter>
			//    5   11:dup             
			//    6   12:invokespecial   #24  <Method void CrashlyticsController$InvalidPartFileFilter()>
			//    7   15:invokestatic    #28  <Method File[] CrashlyticsController.access$1500(CrashlyticsController, FilenameFilter)>
			//    8   18:invokevirtual   #32  <Method void CrashlyticsController.doCleanInvalidTempFiles(File[])>
			//    9   21:return          
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
	//    5    9:invokespecial   #1365 <Method void CrashlyticsController$14(CrashlyticsController)>
	//    6   12:invokevirtual   #973 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void doCleanInvalidTempFiles(File afile[])
	{
		final HashSet invalidSessionIds = new HashSet();
	//    0    0:new             #1053 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #1054 <Method void HashSet()>
	//    3    7:astore          5
		int i1 = afile.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		boolean flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		for(int j = 0; j < i1; j++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload           4
	//*  13   20:icmpge          94
		{
			File file = afile[j];
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:astore          6
			l l1 = c.g();
	//   18   28:invokestatic    #450 <Method l c.g()>
	//   19   31:astore          7
			StringBuilder stringbuilder = new StringBuilder();
	//   20   33:new             #466 <Class StringBuilder>
	//   21   36:dup             
	//   22   37:invokespecial   #467 <Method void StringBuilder()>
	//   23   40:astore          8
			stringbuilder.append("Found invalid session part file: ");
	//   24   42:aload           8
	//   25   44:ldc2            #1369 <String "Found invalid session part file: ">
	//   26   47:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
			stringbuilder.append(((Object) (file)));
	//   28   51:aload           8
	//   29   53:aload           6
	//   30   55:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//   31   58:pop             
			l1.a("CrashlyticsCore", stringbuilder.toString());
	//   32   59:aload           7
	//   33   61:ldc2            #452 <String "CrashlyticsCore">
	//   34   64:aload           8
	//   35   66:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   36   69:invokeinterface #460 <Method void l.a(String, String)>
			((Set) (invalidSessionIds)).add(((Object) (getSessionIdFromSessionFile(file))));
	//   37   74:aload           5
	//   38   76:aload           6
	//   39   78:invokestatic    #464 <Method String getSessionIdFromSessionFile(File)>
	//   40   81:invokeinterface #1060 <Method boolean Set.add(Object)>
	//   41   86:pop             
		}

	//   42   87:iload_2         
	//   43   88:iconst_1        
	//   44   89:iadd            
	//   45   90:istore_2        
	//*  46   91:goto            17
		if(((Set) (invalidSessionIds)).isEmpty())
	//*  47   94:aload           5
	//*  48   96:invokeinterface #1372 <Method boolean Set.isEmpty()>
	//*  49  101:ifeq            105
			return;
	//   50  104:return          
		afile = ((File []) (getInvalidFilesDir()));
	//   51  105:aload_0         
	//   52  106:invokevirtual   #1046 <Method File getInvalidFilesDir()>
	//   53  109:astore_1        
		if(!((File) (afile)).exists())
	//*  54  110:aload_1         
	//*  55  111:invokevirtual   #996 <Method boolean File.exists()>
	//*  56  114:ifne            122
			((File) (afile)).mkdir();
	//   57  117:aload_1         
	//   58  118:invokevirtual   #686 <Method boolean File.mkdir()>
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
	//   65  130:invokespecial   #1374 <Method void CrashlyticsController$15(CrashlyticsController, Set)>
	//   66  133:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
	//   67  136:astore          5
		i1 = afile1.length;
	//   68  138:aload           5
	//   69  140:arraylength     
	//   70  141:istore          4
		for(int k = ((int) (flag)); k < i1; k++)
	//*  71  143:iload_3         
	//*  72  144:istore_2        
	//*  73  145:iload_2         
	//*  74  146:iload           4
	//*  75  148:icmpge          283
		{
			File file1 = afile1[k];
	//   76  151:aload           5
	//   77  153:iload_2         
	//   78  154:aaload          
	//   79  155:astore          6
			l l2 = c.g();
	//   80  157:invokestatic    #450 <Method l c.g()>
	//   81  160:astore          7
			StringBuilder stringbuilder1 = new StringBuilder();
	//   82  162:new             #466 <Class StringBuilder>
	//   83  165:dup             
	//   84  166:invokespecial   #467 <Method void StringBuilder()>
	//   85  169:astore          8
			stringbuilder1.append("Moving session file: ");
	//   86  171:aload           8
	//   87  173:ldc2            #1376 <String "Moving session file: ">
	//   88  176:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   89  179:pop             
			stringbuilder1.append(((Object) (file1)));
	//   90  180:aload           8
	//   91  182:aload           6
	//   92  184:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//   93  187:pop             
			l2.a("CrashlyticsCore", stringbuilder1.toString());
	//   94  188:aload           7
	//   95  190:ldc2            #452 <String "CrashlyticsCore">
	//   96  193:aload           8
	//   97  195:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   98  198:invokeinterface #460 <Method void l.a(String, String)>
			if(!file1.renameTo(new File(((File) (afile)), file1.getName())))
	//*  99  203:aload           6
	//* 100  205:new             #516 <Class File>
	//* 101  208:dup             
	//* 102  209:aload_1         
	//* 103  210:aload           6
	//* 104  212:invokevirtual   #750 <Method String File.getName()>
	//* 105  215:invokespecial   #683 <Method void File(File, String)>
	//* 106  218:invokevirtual   #1380 <Method boolean File.renameTo(File)>
	//* 107  221:ifne            276
			{
				l l3 = c.g();
	//  108  224:invokestatic    #450 <Method l c.g()>
	//  109  227:astore          7
				StringBuilder stringbuilder2 = new StringBuilder();
	//  110  229:new             #466 <Class StringBuilder>
	//  111  232:dup             
	//  112  233:invokespecial   #467 <Method void StringBuilder()>
	//  113  236:astore          8
				stringbuilder2.append("Could not move session file. Deleting ");
	//  114  238:aload           8
	//  115  240:ldc2            #1382 <String "Could not move session file. Deleting ">
	//  116  243:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//  117  246:pop             
				stringbuilder2.append(((Object) (file1)));
	//  118  247:aload           8
	//  119  249:aload           6
	//  120  251:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//  121  254:pop             
				l3.a("CrashlyticsCore", stringbuilder2.toString());
	//  122  255:aload           7
	//  123  257:ldc2            #452 <String "CrashlyticsCore">
	//  124  260:aload           8
	//  125  262:invokevirtual   #476 <Method String StringBuilder.toString()>
	//  126  265:invokeinterface #460 <Method void l.a(String, String)>
				file1.delete();
	//  127  270:aload           6
	//  128  272:invokevirtual   #520 <Method boolean File.delete()>
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
	//  136  284:invokespecial   #1384 <Method void trimInvalidSessionFiles()>
	//  137  287:return          
	}

	void doCloseSessions(b.a.a.a.a.g.p p1)
	{
		doCloseSessions(p1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #388 <Method void doCloseSessions(b.a.a.a.a.g.p, boolean)>
	//    4    6:return          
	}

	void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, boolean flag)
	{
		openSession();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1390 <Method void openSession()>
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
	//    3    5:new             #1392 <Class CrashlyticsUncaughtExceptionHandler>
	//    4    8:dup             
	//    5    9:new             #56  <Class CrashlyticsController$6>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #1393 <Method void CrashlyticsController$6(CrashlyticsController)>
	//    9   17:new             #70  <Class CrashlyticsController$DefaultSettingsDataProvider>
	//   10   20:dup             
	//   11   21:aconst_null     
	//   12   22:invokespecial   #1394 <Method void CrashlyticsController$DefaultSettingsDataProvider(CrashlyticsController$1)>
	//   13   25:iload_2         
	//   14   26:aload_1         
	//   15   27:invokespecial   #1397 <Method void CrashlyticsUncaughtExceptionHandler(CrashlyticsUncaughtExceptionHandler$CrashListener, CrashlyticsUncaughtExceptionHandler$SettingsDataProvider, boolean, Thread$UncaughtExceptionHandler)>
	//   16   30:putfield        #1399 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
		Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (crashHandler)));
	//   17   33:aload_0         
	//   18   34:getfield        #1399 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
	//   19   37:invokestatic    #1403 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
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
				{
					TreeSet treeset = ndkData.timestampedDirectories;
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field CrashlyticsNdkData val$ndkData>
				//    2    4:getfield        #34  <Field TreeSet CrashlyticsNdkData.timestampedDirectories>
				//    3    7:astore_1        
					String s = getPreviousSessionId();
				//    4    8:aload_0         
				//    5    9:getfield        #20  <Field CrashlyticsController this$0>
				//    6   12:invokestatic    #38  <Method String CrashlyticsController.access$1600(CrashlyticsController)>
				//    7   15:astore_2        
					if(s != null && !treeset.isEmpty())
				//*   8   16:aload_2         
				//*   9   17:ifnull          58
				//*  10   20:aload_1         
				//*  11   21:invokevirtual   #44  <Method boolean TreeSet.isEmpty()>
				//*  12   24:ifne            58
					{
						File file = (File)treeset.first();
				//   13   27:aload_1         
				//   14   28:invokevirtual   #48  <Method Object TreeSet.first()>
				//   15   31:checkcast       #50  <Class File>
				//   16   34:astore_3        
						if(file != null)
				//*  17   35:aload_3         
				//*  18   36:ifnull          58
							finalizeMostRecentNativeCrash(crashlyticsCore.getContext(), file, s);
				//   19   39:aload_0         
				//   20   40:getfield        #20  <Field CrashlyticsController this$0>
				//   21   43:aload_0         
				//   22   44:getfield        #20  <Field CrashlyticsController this$0>
				//   23   47:invokestatic    #54  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
				//   24   50:invokevirtual   #60  <Method Context CrashlyticsCore.getContext()>
				//   25   53:aload_3         
				//   26   54:aload_2         
				//   27   55:invokestatic    #64  <Method void CrashlyticsController.access$1700(CrashlyticsController, Context, File, String)>
					}
					recursiveDelete(((Set) (treeset)));
				//   28   58:aload_0         
				//   29   59:getfield        #20  <Field CrashlyticsController this$0>
				//   30   62:aload_1         
				//   31   63:invokestatic    #68  <Method void CrashlyticsController.access$1800(CrashlyticsController, Set)>
					return Boolean.TRUE;
				//   32   66:getstatic       #74  <Field Boolean Boolean.TRUE>
				//   33   69:areturn         
				}

				public volatile Object call()
				{
					return ((Object) (call()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #76  <Method Boolean call()>
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
	//   10   16:invokespecial   #1408 <Method void CrashlyticsController$16(CrashlyticsController, CrashlyticsNdkData)>
	//   11   19:invokevirtual   #1412 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//   12   22:checkcast       #1317 <Class Boolean>
	//   13   25:invokevirtual   #1415 <Method boolean Boolean.booleanValue()>
	//   14   28:ireturn         
	}

	boolean finalizeSessions(final b.a.a.a.a.g.p sessionSettingsData)
	{
		return ((Boolean)backgroundWorker.submitAndWait(new Callable() {

			public Boolean call()
			{
				if(isHandlingException())
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field CrashlyticsController this$0>
			//*   2    4:invokevirtual   #32  <Method boolean CrashlyticsController.isHandlingException()>
			//*   3    7:ifeq            26
				{
					c.g().a("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
			//    4   10:invokestatic    #38  <Method l c.g()>
			//    5   13:ldc1            #40  <String "CrashlyticsCore">
			//    6   15:ldc1            #42  <String "Skipping session finalization because a crash has already occurred.">
			//    7   17:invokeinterface #48  <Method void l.a(String, String)>
					return Boolean.FALSE;
			//    8   22:getstatic       #54  <Field Boolean Boolean.FALSE>
			//    9   25:areturn         
				} else
				{
					c.g().a("CrashlyticsCore", "Finalizing previously open sessions.");
			//   10   26:invokestatic    #38  <Method l c.g()>
			//   11   29:ldc1            #40  <String "CrashlyticsCore">
			//   12   31:ldc1            #56  <String "Finalizing previously open sessions.">
			//   13   33:invokeinterface #48  <Method void l.a(String, String)>
					doCloseSessions(sessionSettingsData, true);
			//   14   38:aload_0         
			//   15   39:getfield        #20  <Field CrashlyticsController this$0>
			//   16   42:aload_0         
			//   17   43:getfield        #22  <Field b.a.a.a.a.g.p val$sessionSettingsData>
			//   18   46:iconst_1        
			//   19   47:invokestatic    #60  <Method void CrashlyticsController.access$1300(CrashlyticsController, b.a.a.a.a.g.p, boolean)>
					c.g().a("CrashlyticsCore", "Closed all previously open sessions");
			//   20   50:invokestatic    #38  <Method l c.g()>
			//   21   53:ldc1            #40  <String "CrashlyticsCore">
			//   22   55:ldc1            #62  <String "Closed all previously open sessions">
			//   23   57:invokeinterface #48  <Method void l.a(String, String)>
					return Boolean.TRUE;
			//   24   62:getstatic       #65  <Field Boolean Boolean.TRUE>
			//   25   65:areturn         
				}
			}

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #68  <Method Boolean call()>
			//    2    4:areturn         
			}

			final CrashlyticsController this$0;
			final b.a.a.a.a.g.p val$sessionSettingsData;

			
			{
				this$0 = CrashlyticsController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsController this$0>
				sessionSettingsData = p1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field b.a.a.a.a.g.p val$sessionSettingsData>
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
	//    6   10:invokespecial   #1420 <Method void CrashlyticsController$13(CrashlyticsController, b.a.a.a.a.g.p)>
	//    7   13:invokevirtual   #1412 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    8   16:checkcast       #1317 <Class Boolean>
	//    9   19:invokevirtual   #1415 <Method boolean Boolean.booleanValue()>
	//   10   22:ireturn         
	}

	File getFatalSessionFilesDir()
	{
		return new File(getFilesDir(), "fatal-sessions");
	//    0    0:new             #516 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #593 <Method File getFilesDir()>
	//    4    8:ldc1            #121 <String "fatal-sessions">
	//    5   10:invokespecial   #683 <Method void File(File, String)>
	//    6   13:areturn         
	}

	File getFilesDir()
	{
		return fileStore.a();
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field a fileStore>
	//    2    4:invokeinterface #682 <Method File a.a()>
	//    3    9:areturn         
	}

	File getInvalidFilesDir()
	{
		return new File(getFilesDir(), "invalidClsFiles");
	//    0    0:new             #516 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #593 <Method File getFilesDir()>
	//    4    8:ldc1            #145 <String "invalidClsFiles">
	//    5   10:invokespecial   #683 <Method void File(File, String)>
	//    6   13:areturn         
	}

	File getNonFatalSessionFilesDir()
	{
		return new File(getFilesDir(), "nonfatal-sessions");
	//    0    0:new             #516 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #593 <Method File getFilesDir()>
	//    4    8:ldc1            #159 <String "nonfatal-sessions">
	//    5   10:invokespecial   #683 <Method void File(File, String)>
	//    6   13:areturn         
	}

	void handleUncaughtException(final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, final Thread thread, final Throwable ex, final boolean firebaseCrashlyticsClientFlag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		final Date time = ((Date) (c.g()));
	//    2    2:invokestatic    #450 <Method l c.g()>
	//    3    5:astore          5
		StringBuilder stringbuilder = new StringBuilder();
	//    4    7:new             #466 <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #467 <Method void StringBuilder()>
	//    7   14:astore          6
		stringbuilder.append("Crashlytics is handling uncaught exception \"");
	//    8   16:aload           6
	//    9   18:ldc2            #1424 <String "Crashlytics is handling uncaught exception \"">
	//   10   21:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append(((Object) (ex)));
	//   12   25:aload           6
	//   13   27:aload_3         
	//   14   28:invokevirtual   #575 <Method StringBuilder StringBuilder.append(Object)>
	//   15   31:pop             
		stringbuilder.append("\" from thread ");
	//   16   32:aload           6
	//   17   34:ldc2            #577 <String "\" from thread ">
	//   18   37:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append(thread.getName());
	//   20   41:aload           6
	//   21   43:aload_2         
	//   22   44:invokevirtual   #580 <Method String Thread.getName()>
	//   23   47:invokevirtual   #473 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		((l) (time)).a("CrashlyticsCore", stringbuilder.toString());
	//   25   51:aload           5
	//   26   53:ldc2            #452 <String "CrashlyticsCore">
	//   27   56:aload           6
	//   28   58:invokevirtual   #476 <Method String StringBuilder.toString()>
	//   29   61:invokeinterface #460 <Method void l.a(String, String)>
		devicePowerStateListener.dispose();
	//   30   66:aload_0         
	//   31   67:getfield        #355 <Field DevicePowerStateListener devicePowerStateListener>
	//   32   70:invokevirtual   #1427 <Method void DevicePowerStateListener.dispose()>
		time = new Date();
	//   33   73:new             #529 <Class Date>
	//   34   76:dup             
	//   35   77:invokespecial   #530 <Method void Date()>
	//   36   80:astore          5
		backgroundWorker.submitAndWait(new Callable() {

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #47  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
			{
				crashlyticsCore.createCrashMarker();
			//    0    0:aload_0         
			//    1    1:getfield        #28  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #51  <Method CrashlyticsCore CrashlyticsController.access$400(CrashlyticsController)>
			//    3    7:invokevirtual   #56  <Method void CrashlyticsCore.createCrashMarker()>
				writeFatal(time, thread, ex);
			//    4   10:aload_0         
			//    5   11:getfield        #28  <Field CrashlyticsController this$0>
			//    6   14:aload_0         
			//    7   15:getfield        #30  <Field Date val$time>
			//    8   18:aload_0         
			//    9   19:getfield        #32  <Field Thread val$thread>
			//   10   22:aload_0         
			//   11   23:getfield        #34  <Field Throwable val$ex>
			//   12   26:invokestatic    #60  <Method void CrashlyticsController.access$500(CrashlyticsController, Date, Thread, Throwable)>
				t t1 = settingsDataProvider.getSettingsData();
			//   13   29:aload_0         
			//   14   30:getfield        #36  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider val$settingsDataProvider>
			//   15   33:invokeinterface #66  <Method t CrashlyticsUncaughtExceptionHandler$SettingsDataProvider.getSettingsData()>
			//   16   38:astore          4
				b.a.a.a.a.g.p p1;
				Object obj;
				if(t1 != null)
			//*  17   40:aload           4
			//*  18   42:ifnull          60
				{
					p1 = t1.b;
			//   19   45:aload           4
			//   20   47:getfield        #72  <Field b.a.a.a.a.g.p t.b>
			//   21   50:astore_2        
					obj = ((Object) (t1.d));
			//   22   51:aload           4
			//   23   53:getfield        #76  <Field m t.d>
			//   24   56:astore_3        
				} else
			//*  25   57:goto            64
				{
					p1 = null;
			//   26   60:aconst_null     
			//   27   61:astore_2        
					obj = ((Object) (p1));
			//   28   62:aload_2         
			//   29   63:astore_3        
				}
				boolean flag;
				if(obj != null && !((m) (obj)).e)
			//*  30   64:aload_3         
			//*  31   65:ifnull          83
			//*  32   68:aload_3         
			//*  33   69:getfield        #81  <Field boolean m.e>
			//*  34   72:ifeq            78
			//*  35   75:goto            83
					flag = false;
			//   36   78:iconst_0        
			//   37   79:istore_1        
				else
			//*  38   80:goto            85
					flag = true;
			//   39   83:iconst_1        
			//   40   84:istore_1        
				if(flag || firebaseCrashlyticsClientFlag)
			//*  41   85:iload_1         
			//*  42   86:ifne            96
			//*  43   89:aload_0         
			//*  44   90:getfield        #38  <Field boolean val$firebaseCrashlyticsClientFlag>
			//*  45   93:ifeq            110
					recordFatalFirebaseEvent(time.getTime());
			//   46   96:aload_0         
			//   47   97:getfield        #28  <Field CrashlyticsController this$0>
			//   48  100:aload_0         
			//   49  101:getfield        #30  <Field Date val$time>
			//   50  104:invokevirtual   #87  <Method long Date.getTime()>
			//   51  107:invokestatic    #91  <Method void CrashlyticsController.access$600(CrashlyticsController, long)>
				doCloseSessions(p1);
			//   52  110:aload_0         
			//   53  111:getfield        #28  <Field CrashlyticsController this$0>
			//   54  114:aload_2         
			//   55  115:invokevirtual   #95  <Method void CrashlyticsController.doCloseSessions(b.a.a.a.a.g.p)>
				doOpenSession();
			//   56  118:aload_0         
			//   57  119:getfield        #28  <Field CrashlyticsController this$0>
			//   58  122:invokestatic    #99  <Method void CrashlyticsController.access$700(CrashlyticsController)>
				if(p1 != null)
			//*  59  125:aload_2         
			//*  60  126:ifnull          140
					trimSessionFiles(p1.g);
			//   61  129:aload_0         
			//   62  130:getfield        #28  <Field CrashlyticsController this$0>
			//   63  133:aload_2         
			//   64  134:getfield        #105 <Field int b.a.a.a.a.g.p.g>
			//   65  137:invokevirtual   #109 <Method void CrashlyticsController.trimSessionFiles(int)>
				if(!shouldPromptUserBeforeSendingCrashReports(t1))
			//*  66  140:aload_0         
			//*  67  141:getfield        #28  <Field CrashlyticsController this$0>
			//*  68  144:aload           4
			//*  69  146:invokestatic    #113 <Method boolean CrashlyticsController.access$800(CrashlyticsController, t)>
			//*  70  149:ifne            161
					sendSessionReports(t1);
			//   71  152:aload_0         
			//   72  153:getfield        #28  <Field CrashlyticsController this$0>
			//   73  156:aload           4
			//   74  158:invokestatic    #117 <Method void CrashlyticsController.access$900(CrashlyticsController, t)>
				return null;
			//   75  161:aconst_null     
			//   76  162:areturn         
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
	//   47   98:invokespecial   #1430 <Method void CrashlyticsController$7(CrashlyticsController, Date, Thread, Throwable, CrashlyticsUncaughtExceptionHandler$SettingsDataProvider, boolean)>
	//   48  101:invokevirtual   #1412 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
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
	//    1    1:invokevirtual   #835 <Method File[] listSessionBeginFiles()>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	boolean isHandlingException()
	{
		return crashHandler != null && crashHandler.isHandlingException();
	//    0    0:aload_0         
	//    1    1:getfield        #1399 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #1399 <Field CrashlyticsUncaughtExceptionHandler crashHandler>
	//    5   11:invokevirtual   #1432 <Method boolean CrashlyticsUncaughtExceptionHandler.isHandlingException()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	File[] listCompleteSessionFiles()
	{
		LinkedList linkedlist = new LinkedList();
	//    0    0:new             #1247 <Class LinkedList>
	//    1    3:dup             
	//    2    4:invokespecial   #1248 <Method void LinkedList()>
	//    3    7:astore_1        
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER))));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #990 <Method File getFatalSessionFilesDir()>
	//    8   14:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//    9   17:invokespecial   #831 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   10   20:invokestatic    #1436 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   11   23:pop             
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER))));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #993 <Method File getNonFatalSessionFilesDir()>
	//   16   30:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//   17   33:invokespecial   #831 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   18   36:invokestatic    #1436 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   19   39:pop             
		Collections.addAll(((java.util.Collection) (linkedlist)), ((Object []) (listFilesMatching(getFilesDir(), SESSION_FILE_FILTER))));
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:invokevirtual   #593 <Method File getFilesDir()>
	//   24   46:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//   25   49:invokespecial   #831 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   26   52:invokestatic    #1436 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   27   55:pop             
		return (File[])((List) (linkedlist)).toArray(((Object []) (new File[((List) (linkedlist)).size()])));
	//   28   56:aload_1         
	//   29   57:aload_1         
	//   30   58:invokeinterface #1437 <Method int List.size()>
	//   31   63:anewarray       File[]
	//   32   66:invokeinterface #1441 <Method Object[] List.toArray(Object[])>
	//   33   71:checkcast       #1443 <Class File[]>
	//   34   74:areturn         
	}

	File[] listNativeSessionFileDirectories()
	{
		return listFilesMatching(SESSION_DIRECTORY_FILTER);
	//    0    0:aload_0         
	//    1    1:getstatic       #254 <Field FileFilter SESSION_DIRECTORY_FILTER>
	//    2    4:invokespecial   #1446 <Method File[] listFilesMatching(FileFilter)>
	//    3    7:areturn         
	}

	File[] listSessionBeginFiles()
	{
		return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
	//    0    0:aload_0         
	//    1    1:getstatic       #247 <Field FilenameFilter SESSION_BEGIN_FILE_FILTER>
	//    2    4:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    7:areturn         
	}

	void openSession()
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #26  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
			{
				doOpenSession();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CrashlyticsController this$0>
			//    2    4:invokestatic    #29  <Method void CrashlyticsController.access$700(CrashlyticsController)>
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
	//    5    9:invokespecial   #1447 <Method void CrashlyticsController$12(CrashlyticsController)>
	//    6   12:invokevirtual   #1357 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void registerAnalyticsEventListener(t t1)
	{
		if(t1.d.e && appMeasurementEventListenerRegistrar.register())
	//*   0    0:aload_1         
	//*   1    1:getfield        #976 <Field m t.d>
	//*   2    4:getfield        #1450 <Field boolean m.e>
	//*   3    7:ifeq            36
	//*   4   10:aload_0         
	//*   5   11:getfield        #320 <Field AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar>
	//*   6   14:invokeinterface #1455 <Method boolean AppMeasurementEventListenerRegistrar.register()>
	//*   7   19:ifeq            36
			c.g().a("CrashlyticsCore", "Registered Firebase Analytics event listener");
	//    8   22:invokestatic    #450 <Method l c.g()>
	//    9   25:ldc2            #452 <String "CrashlyticsCore">
	//   10   28:ldc2            #1457 <String "Registered Firebase Analytics event listener">
	//   11   31:invokeinterface #460 <Method void l.a(String, String)>
	//   12   36:return          
	}

	void registerDevicePowerStateListener()
	{
		devicePowerStateListener.initialize();
	//    0    0:aload_0         
	//    1    1:getfield        #355 <Field DevicePowerStateListener devicePowerStateListener>
	//    2    4:invokevirtual   #1461 <Method void DevicePowerStateListener.initialize()>
	//    3    7:return          
	}

	void submitAllReports(float f, t t1)
	{
		if(t1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       19
		{
			c.g().d("CrashlyticsCore", "Could not send reports. Settings are not available.");
	//    2    4:invokestatic    #450 <Method l c.g()>
	//    3    7:ldc2            #452 <String "CrashlyticsCore">
	//    4   10:ldc2            #1465 <String "Could not send reports. Settings are not available.">
	//    5   13:invokeinterface #717 <Method void l.d(String, String)>
			return;
	//    6   18:return          
		}
		CreateReportSpiCall createreportspicall = getCreateReportSpiCall(t1.a.d, t1.a.e);
	//    7   19:aload_0         
	//    8   20:aload_2         
	//    9   21:getfield        #938 <Field e t.a>
	//   10   24:getfield        #942 <Field String e.d>
	//   11   27:aload_2         
	//   12   28:getfield        #938 <Field e t.a>
	//   13   31:getfield        #944 <Field String e.e>
	//   14   34:invokespecial   #946 <Method CreateReportSpiCall getCreateReportSpiCall(String, String)>
	//   15   37:astore_3        
		if(shouldPromptUserBeforeSendingCrashReports(t1))
	//*  16   38:aload_0         
	//*  17   39:aload_2         
	//*  18   40:invokespecial   #436 <Method boolean shouldPromptUserBeforeSendingCrashReports(t)>
	//*  19   43:ifeq            69
			t1 = ((t) (new PrivacyDialogCheck(((b.a.a.a.i) (crashlyticsCore)), preferenceManager, t1.c)));
	//   20   46:new             #85  <Class CrashlyticsController$PrivacyDialogCheck>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:getfield        #298 <Field CrashlyticsCore crashlyticsCore>
	//   24   54:aload_0         
	//   25   55:getfield        #306 <Field PreferenceManager preferenceManager>
	//   26   58:aload_2         
	//   27   59:getfield        #1468 <Field o t.c>
	//   28   62:invokespecial   #1471 <Method void CrashlyticsController$PrivacyDialogCheck(b.a.a.a.i, PreferenceManager, o)>
	//   29   65:astore_2        
		else
	//*  30   66:goto            77
			t1 = ((t) (new ReportUploader.AlwaysSendCheck()));
	//   31   69:new             #1473 <Class ReportUploader$AlwaysSendCheck>
	//   32   72:dup             
	//   33   73:invokespecial   #1474 <Method void ReportUploader$AlwaysSendCheck()>
	//   34   76:astore_2        
		(new ReportUploader(appData.apiKey, createreportspicall, reportFilesProvider, handlingExceptionCheck)).uploadReports(f, ((ReportUploader.SendCheck) (t1)));
	//   35   77:new             #948 <Class ReportUploader>
	//   36   80:dup             
	//   37   81:aload_0         
	//   38   82:getfield        #310 <Field AppData appData>
	//   39   85:getfield        #953 <Field String AppData.apiKey>
	//   40   88:aload_3         
	//   41   89:aload_0         
	//   42   90:getfield        #345 <Field ReportUploader$ReportFilesProvider reportFilesProvider>
	//   43   93:aload_0         
	//   44   94:getfield        #348 <Field ReportUploader$HandlingExceptionCheck handlingExceptionCheck>
	//   45   97:invokespecial   #956 <Method void ReportUploader(String, CreateReportSpiCall, ReportUploader$ReportFilesProvider, ReportUploader$HandlingExceptionCheck)>
	//   46  100:fload_1         
	//   47  101:aload_2         
	//   48  102:invokevirtual   #1478 <Method void ReportUploader.uploadReports(float, ReportUploader$SendCheck)>
	//   49  105:return          
	}

	void trimSessionFiles(int j)
	{
		j -= Utils.capFileCount(getFatalSessionFilesDir(), j, SMALLEST_FILE_NAME_FIRST);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #990 <Method File getFatalSessionFilesDir()>
	//    3    5:iload_1         
	//    4    6:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #1482 <Method int Utils.capFileCount(File, int, Comparator)>
	//    6   12:isub            
	//    7   13:istore_1        
		int k = Utils.capFileCount(getNonFatalSessionFilesDir(), j, SMALLEST_FILE_NAME_FIRST);
	//    8   14:aload_0         
	//    9   15:invokevirtual   #993 <Method File getNonFatalSessionFilesDir()>
	//   10   18:iload_1         
	//   11   19:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   12   22:invokestatic    #1482 <Method int Utils.capFileCount(File, int, Comparator)>
	//   13   25:istore_2        
		Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, j - k, SMALLEST_FILE_NAME_FIRST);
	//   14   26:aload_0         
	//   15   27:invokevirtual   #593 <Method File getFilesDir()>
	//   16   30:getstatic       #251 <Field FilenameFilter SESSION_FILE_FILTER>
	//   17   33:iload_1         
	//   18   34:iload_2         
	//   19   35:isub            
	//   20   36:getstatic       #260 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   21   39:invokestatic    #1083 <Method int Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   22   42:pop             
	//   23   43:return          
	}

	void writeNonFatalException(final Thread thread, final Throwable ex)
	{
		final Date now = new Date();
	//    0    0:new             #529 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #530 <Method void Date()>
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
	//   12   20:invokespecial   #1486 <Method void CrashlyticsController$9(CrashlyticsController, Date, Thread, Throwable)>
	//   13   23:invokevirtual   #973 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Runnable)>
	//   14   26:pop             
	//   15   27:return          
	}

	void writeToLog(final long timestamp, final String msg)
	{
		backgroundWorker.submit(new Callable() {

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #35  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
			{
				if(!isHandlingException())
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field CrashlyticsController this$0>
			//*   2    4:invokevirtual   #39  <Method boolean CrashlyticsController.isHandlingException()>
			//*   3    7:ifne            28
					logFileManager.writeToLog(timestamp, msg);
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field CrashlyticsController this$0>
			//    6   14:invokestatic    #43  <Method LogFileManager CrashlyticsController.access$1000(CrashlyticsController)>
			//    7   17:aload_0         
			//    8   18:getfield        #24  <Field long val$timestamp>
			//    9   21:aload_0         
			//   10   22:getfield        #26  <Field String val$msg>
			//   11   25:invokevirtual   #46  <Method void LogFileManager.writeToLog(long, String)>
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
				timestamp = l1;
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
	//    7   11:invokespecial   #1491 <Method void CrashlyticsController$8(CrashlyticsController, long, String)>
	//    8   14:invokevirtual   #1357 <Method java.util.concurrent.Future CrashlyticsBackgroundWorker.submit(Callable)>
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
			return s.length() == ".cls".length() + 35 && s.endsWith(".cls");
		//    0    0:aload_2         
		//    1    1:invokevirtual   #21  <Method int String.length()>
		//    2    4:ldc1            #23  <String ".cls">
		//    3    6:invokevirtual   #21  <Method int String.length()>
		//    4    9:bipush          35
		//    5   11:iadd            
		//    6   12:icmpne          26
		//    7   15:aload_2         
		//    8   16:ldc1            #23  <String ".cls">
		//    9   18:invokevirtual   #27  <Method boolean String.endsWith(String)>
		//   10   21:ifeq            26
		//   11   24:iconst_1        
		//   12   25:ireturn         
		//   13   26:iconst_0        
		//   14   27:ireturn         
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
	private final a fileStore;
	private final EventLogger firebaseAnalyticsLogger;
	private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
	private final b.a.a.a.a.e.e httpRequestFactory;
	private final p idManager;
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
	static void access$1300(CrashlyticsController crashlyticscontroller, b.a.a.a.a.g.p p1, boolean flag)
	{
		crashlyticscontroller.doCloseSessions(p1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #388 <Method void doCloseSessions(b.a.a.a.a.g.p, boolean)>
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
	//    2    2:invokespecial   #394 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    5:areturn         
	}

*/


/*
	static String access$1600(CrashlyticsController crashlyticscontroller)
	{
		return crashlyticscontroller.getPreviousSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #398 <Method String getPreviousSessionId()>
	//    2    4:areturn         
	}

*/


/*
	static void access$1700(CrashlyticsController crashlyticscontroller, Context context, File file, String s)
	{
		crashlyticscontroller.finalizeMostRecentNativeCrash(context, file, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #404 <Method void finalizeMostRecentNativeCrash(Context, File, String)>
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
	//    2    2:invokespecial   #410 <Method void recursiveDelete(Set)>
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
	//    4    4:invokespecial   #419 <Method void writeFatal(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$600(CrashlyticsController crashlyticscontroller, long l1)
	{
		crashlyticscontroller.recordFatalFirebaseEvent(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #425 <Method void recordFatalFirebaseEvent(long)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$700(CrashlyticsController crashlyticscontroller)
	{
		crashlyticscontroller.doOpenSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #430 <Method void doOpenSession()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$800(CrashlyticsController crashlyticscontroller, t t1)
	{
		return crashlyticscontroller.shouldPromptUserBeforeSendingCrashReports(t1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #436 <Method boolean shouldPromptUserBeforeSendingCrashReports(t)>
	//    3    5:ireturn         
	}

*/


/*
	static void access$900(CrashlyticsController crashlyticscontroller, t t1)
	{
		crashlyticscontroller.sendSessionReports(t1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #442 <Method void sendSessionReports(t)>
		return;
	//    3    5:return          
	}

*/
}
