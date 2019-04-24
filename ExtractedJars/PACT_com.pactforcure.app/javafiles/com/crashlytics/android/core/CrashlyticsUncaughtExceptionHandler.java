// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import com.crashlytics.android.core.internal.models.SessionEventData;
import com.crashlytics.android.core.internal.models.SignalData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.persistence.FileStore;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//			UnityVersionProvider, CrashlyticsCore, LogFileManager, DevicePowerStateListener, 
//			MiddleOutFallbackStrategy, StackTraceTrimmingStrategy, RemoveRepeatsStrategy, ClsFileOutputStream, 
//			CodedOutputStream, CLSUUID, MetaDataStore, NativeCrashWriter, 
//			UserMetaData, CrashlyticsExecutorServiceWrapper, Utils, SessionProtobufHelper, 
//			TrimmedThrowableData, ReportUploader, SessionReport

class CrashlyticsUncaughtExceptionHandler
	implements Thread.UncaughtExceptionHandler
{
	private static class AnySessionPartFileFilter
		implements FilenameFilter
	{

		public boolean accept(File file, String s)
		{
			return !CrashlyticsUncaughtExceptionHandler.SESSION_FILE_FILTER.accept(file, s) && CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(((CharSequence) (s))).matches();
		//    0    0:getstatic       #22  <Field FilenameFilter CrashlyticsUncaughtExceptionHandler.SESSION_FILE_FILTER>
		//    1    3:aload_1         
		//    2    4:aload_2         
		//    3    5:invokeinterface #24  <Method boolean FilenameFilter.accept(File, String)>
		//    4   10:ifne            28
		//    5   13:invokestatic    #28  <Method Pattern CrashlyticsUncaughtExceptionHandler.access$000()>
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
		//    4   10:ifne            22
		//    5   13:aload_2         
		//    6   14:ldc1            #26  <String "SessionMissingBinaryImages">
		//    7   16:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
		//    8   19:ifeq            24
		//    9   22:iconst_1        
		//   10   23:ireturn         
		//   11   24:iconst_0        
		//   12   25:ireturn         
		}

		InvalidPartFileFilter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class SendSessionRunnable
		implements Runnable
	{

		public void run()
		{
			if(CommonUtils.canTryConnection(crashlyticsCore.getContext()))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field CrashlyticsCore crashlyticsCore>
		//*   2    4:invokevirtual   #30  <Method Context CrashlyticsCore.getContext()>
		//*   3    7:invokestatic    #36  <Method boolean CommonUtils.canTryConnection(Context)>
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
					(new ReportUploader(crashlyticsCore.getApiKey(), ((CreateReportSpiCall) (obj)))).forceUpload(((Report) (new SessionReport(fileToSend, CrashlyticsUncaughtExceptionHandler.SEND_AT_CRASHTIME_HEADER))));
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
		//   31   69:invokestatic    #81  <Method Map CrashlyticsUncaughtExceptionHandler.access$1200()>
		//   32   72:invokespecial   #84  <Method void SessionReport(File, Map)>
		//   33   75:invokevirtual   #88  <Method boolean ReportUploader.forceUpload(Report)>
		//   34   78:pop             
					return;
		//   35   79:return          
				}
			}
		}

		private final CrashlyticsCore crashlyticsCore;
		private final File fileToSend;

		public SendSessionRunnable(CrashlyticsCore crashlyticscore, File file)
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

	static class SessionPartFileFilter
		implements FilenameFilter
	{

		public boolean accept(File file, String s)
		{
			while(s.equals(((Object) ((new StringBuilder()).append(sessionId).append(".cls").toString()))) || !s.contains(((CharSequence) (sessionId))) || s.endsWith(".cls_temp")) 
		//*   0    0:aload_2         
		//*   1    1:new             #23  <Class StringBuilder>
		//*   2    4:dup             
		//*   3    5:invokespecial   #24  <Method void StringBuilder()>
		//*   4    8:aload_0         
		//*   5    9:getfield        #18  <Field String sessionId>
		//*   6   12:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
		//*   7   15:ldc1            #30  <String ".cls">
		//*   8   17:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
		//*   9   20:invokevirtual   #34  <Method String StringBuilder.toString()>
		//*  10   23:invokevirtual   #40  <Method boolean String.equals(Object)>
		//*  11   26:ifeq            31
				return false;
		//   12   29:iconst_0        
		//   13   30:ireturn         
		//   14   31:aload_2         
		//   15   32:aload_0         
		//   16   33:getfield        #18  <Field String sessionId>
		//   17   36:invokevirtual   #44  <Method boolean String.contains(CharSequence)>
		//   18   39:ifeq            29
		//   19   42:aload_2         
		//   20   43:ldc1            #46  <String ".cls_temp">
		//   21   45:invokevirtual   #50  <Method boolean String.endsWith(String)>
		//   22   48:ifne            29
			return true;
		//   23   51:iconst_1        
		//   24   52:ireturn         
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


	CrashlyticsUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, IdManager idmanager, UnityVersionProvider unityversionprovider, FileStore filestore, CrashlyticsCore crashlyticscore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #184 <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #187 <Method void AtomicInteger(int)>
	//    7   13:putfield        #189 <Field AtomicInteger eventCounter>
		defaultHandler = uncaughtexceptionhandler;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #191 <Field Thread$UncaughtExceptionHandler defaultHandler>
		executorServiceWrapper = crashlyticsexecutorservicewrapper;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
		idManager = idmanager;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #195 <Field IdManager idManager>
		crashlyticsCore = crashlyticscore;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #197 <Field CrashlyticsCore crashlyticsCore>
		unityVersion = unityversionprovider.getUnityVersion();
	//   20   37:aload_0         
	//   21   38:aload           4
	//   22   40:invokeinterface #203 <Method String UnityVersionProvider.getUnityVersion()>
	//   23   45:putfield        #205 <Field String unityVersion>
		fileStore = filestore;
	//   24   48:aload_0         
	//   25   49:aload           5
	//   26   51:putfield        #207 <Field FileStore fileStore>
	//   27   54:aload_0         
	//   28   55:new             #209 <Class AtomicBoolean>
	//   29   58:dup             
	//   30   59:iconst_0        
	//   31   60:invokespecial   #212 <Method void AtomicBoolean(boolean)>
	//   32   63:putfield        #214 <Field AtomicBoolean isHandlingException>
		uncaughtexceptionhandler = ((Thread.UncaughtExceptionHandler) (crashlyticscore.getContext()));
	//   33   66:aload           6
	//   34   68:invokevirtual   #220 <Method Context CrashlyticsCore.getContext()>
	//   35   71:astore_1        
		logFileManager = new LogFileManager(((Context) (uncaughtexceptionhandler)), filestore);
	//   36   72:aload_0         
	//   37   73:new             #222 <Class LogFileManager>
	//   38   76:dup             
	//   39   77:aload_1         
	//   40   78:aload           5
	//   41   80:invokespecial   #225 <Method void LogFileManager(Context, FileStore)>
	//   42   83:putfield        #227 <Field LogFileManager logFileManager>
		devicePowerStateListener = new DevicePowerStateListener(((Context) (uncaughtexceptionhandler)));
	//   43   86:aload_0         
	//   44   87:new             #229 <Class DevicePowerStateListener>
	//   45   90:dup             
	//   46   91:aload_1         
	//   47   92:invokespecial   #232 <Method void DevicePowerStateListener(Context)>
	//   48   95:putfield        #234 <Field DevicePowerStateListener devicePowerStateListener>
	//   49   98:aload_0         
	//   50   99:new             #236 <Class MiddleOutFallbackStrategy>
	//   51  102:dup             
	//   52  103:sipush          1024
	//   53  106:iconst_1        
	//   54  107:anewarray       StackTraceTrimmingStrategy[]
	//   55  110:dup             
	//   56  111:iconst_0        
	//   57  112:new             #240 <Class RemoveRepeatsStrategy>
	//   58  115:dup             
	//   59  116:bipush          10
	//   60  118:invokespecial   #241 <Method void RemoveRepeatsStrategy(int)>
	//   61  121:aastore         
	//   62  122:invokespecial   #244 <Method void MiddleOutFallbackStrategy(int, StackTraceTrimmingStrategy[])>
	//   63  125:putfield        #246 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//   64  128:return          
	}

	private void closeOpenSessions(File afile[], int i, int j)
	{
		Fabric.getLogger().d("CrashlyticsCore", "Closing open sessions.");
	//    0    0:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//    1    3:ldc2            #312 <String "CrashlyticsCore">
	//    2    6:ldc2            #314 <String "Closing open sessions.">
	//    3    9:invokeinterface #320 <Method void Logger.d(String, String)>
		for(; i < afile.length; i++)
	//*   4   14:iload_2         
	//*   5   15:aload_1         
	//*   6   16:arraylength     
	//*   7   17:icmpge          80
		{
			File file = afile[i];
	//    8   20:aload_1         
	//    9   21:iload_2         
	//   10   22:aaload          
	//   11   23:astore          4
			String s = getSessionIdFromSessionFile(file);
	//   12   25:aload           4
	//   13   27:invokestatic    #324 <Method String getSessionIdFromSessionFile(File)>
	//   14   30:astore          5
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Closing session: ").append(s).toString());
	//   15   32:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   16   35:ldc2            #312 <String "CrashlyticsCore">
	//   17   38:new             #326 <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #327 <Method void StringBuilder()>
	//   20   45:ldc2            #329 <String "Closing session: ">
	//   21   48:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   22   51:aload           5
	//   23   53:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   24   56:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   25   59:invokeinterface #320 <Method void Logger.d(String, String)>
			writeSessionPartsToSessionFile(file, s, j);
	//   26   64:aload_0         
	//   27   65:aload           4
	//   28   67:aload           5
	//   29   69:iload_3         
	//   30   70:invokespecial   #340 <Method void writeSessionPartsToSessionFile(File, String, int)>
		}

	//   31   73:iload_2         
	//   32   74:iconst_1        
	//   33   75:iadd            
	//   34   76:istore_2        
	//*  35   77:goto            14
	//   36   80:return          
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
	//    4    6:invokevirtual   #347 <Method void ClsFileOutputStream.closeInProgressStream()>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ClsFileOutputStream clsfileoutputstream)
	//*   6   10:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (clsfileoutputstream)));
	//    7   11:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//    8   14:ldc2            #312 <String "CrashlyticsCore">
	//    9   17:ldc2            #349 <String "Error closing session file stream in the presence of an exception">
	//   10   20:aload_1         
	//   11   21:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
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
	//   16   23:invokevirtual   #361 <Method int InputStream.read(byte[], int, int)>
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
	//   27   41:invokevirtual   #367 <Method void CodedOutputStream.writeRawBytes(byte[])>
	//   28   44:return          
	}

	private void deleteSessionPartFilesFor(String s)
	{
		s = ((String) (listSessionPartFilesFor(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #373 <Method File[] listSessionPartFilesFor(String)>
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
	//   15   19:invokevirtual   #379 <Method boolean File.delete()>
	//   16   22:pop             

	//   17   23:iload_2         
	//   18   24:iconst_1        
	//   19   25:iadd            
	//   20   26:istore_2        
	//*  21   27:goto            11
	//   22   30:return          
	}

	private void doCloseSessions(boolean flag)
		throws Exception
	{
		int i;
		File afile[];
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            40
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:bipush          8
	//*   7   10:iadd            
	//*   8   11:invokespecial   #382 <Method void trimOpenSessions(int)>
	//*   9   14:aload_0         
	//*  10   15:invokespecial   #386 <Method File[] listSortedSessionBeginFiles()>
	//*  11   18:astore_3        
	//*  12   19:aload_3         
	//*  13   20:arraylength     
	//*  14   21:iload_2         
	//*  15   22:icmpgt          45
	//*  16   25:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//*  17   28:ldc2            #312 <String "CrashlyticsCore">
	//*  18   31:ldc2            #388 <String "No open sessions to be closed.">
	//*  19   34:invokeinterface #320 <Method void Logger.d(String, String)>
	//*  20   39:return          
			i = 0;
	//   21   40:iconst_0        
	//   22   41:istore_2        
		trimOpenSessions(i + 8);
		afile = listSortedSessionBeginFiles();
		if(afile.length <= i)
		{
			Fabric.getLogger().d("CrashlyticsCore", "No open sessions to be closed.");
			return;
		}
	//*  23   42:goto            6
		writeSessionUser(getSessionIdFromSessionFile(afile[i]));
	//   24   45:aload_0         
	//   25   46:aload_3         
	//   26   47:iload_2         
	//   27   48:aaload          
	//   28   49:invokestatic    #324 <Method String getSessionIdFromSessionFile(File)>
	//   29   52:invokespecial   #391 <Method void writeSessionUser(String)>
		Object obj = ((Object) (crashlyticsCore));
	//   30   55:aload_0         
	//   31   56:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   32   59:astore          4
		obj = ((Object) (CrashlyticsCore.getSessionSettingsData()));
	//   33   61:invokestatic    #395 <Method SessionSettingsData CrashlyticsCore.getSessionSettingsData()>
	//   34   64:astore          4
		if(obj == null)
	//*  35   66:aload           4
	//*  36   68:ifnonnull       86
		{
			Fabric.getLogger().d("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
	//   37   71:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   38   74:ldc2            #312 <String "CrashlyticsCore">
	//   39   77:ldc2            #397 <String "Unable to close session. Settings are not loaded.">
	//   40   80:invokeinterface #320 <Method void Logger.d(String, String)>
			return;
	//   41   85:return          
		} else
		{
			closeOpenSessions(afile, i, ((SessionSettingsData) (obj)).maxCustomExceptionEvents);
	//   42   86:aload_0         
	//   43   87:aload_3         
	//   44   88:iload_2         
	//   45   89:aload           4
	//   46   91:getfield        #402 <Field int SessionSettingsData.maxCustomExceptionEvents>
	//   47   94:invokespecial   #404 <Method void closeOpenSessions(File[], int, int)>
			return;
	//   48   97:return          
		}
	}

	private void doOpenSession()
		throws Exception
	{
		Date date = new Date();
	//    0    0:new             #406 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #407 <Method void Date()>
	//    3    7:astore_1        
		String s = (new CLSUUID(idManager)).toString();
	//    4    8:new             #409 <Class CLSUUID>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #195 <Field IdManager idManager>
	//    8   16:invokespecial   #412 <Method void CLSUUID(IdManager)>
	//    9   19:invokevirtual   #413 <Method String CLSUUID.toString()>
	//   10   22:astore_2        
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Opening an new session with ID ").append(s).toString());
	//   11   23:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   12   26:ldc2            #312 <String "CrashlyticsCore">
	//   13   29:new             #326 <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #327 <Method void StringBuilder()>
	//   16   36:ldc2            #415 <String "Opening an new session with ID ">
	//   17   39:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   21   49:invokeinterface #320 <Method void Logger.d(String, String)>
		writeBeginSession(s, date);
	//   22   54:aload_0         
	//   23   55:aload_2         
	//   24   56:aload_1         
	//   25   57:invokespecial   #419 <Method void writeBeginSession(String, Date)>
		writeSessionApp(s);
	//   26   60:aload_0         
	//   27   61:aload_2         
	//   28   62:invokespecial   #422 <Method void writeSessionApp(String)>
		writeSessionOS(s);
	//   29   65:aload_0         
	//   30   66:aload_2         
	//   31   67:invokespecial   #425 <Method void writeSessionOS(String)>
		writeSessionDevice(s);
	//   32   70:aload_0         
	//   33   71:aload_2         
	//   34   72:invokespecial   #428 <Method void writeSessionDevice(String)>
		logFileManager.setCurrentSession(s);
	//   35   75:aload_0         
	//   36   76:getfield        #227 <Field LogFileManager logFileManager>
	//   37   79:aload_2         
	//   38   80:invokevirtual   #431 <Method void LogFileManager.setCurrentSession(String)>
	//   39   83:return          
	}

	private void doWriteExternalCrashEvent(SessionEventData sessioneventdata)
		throws IOException
	{
		Object obj;
		Object obj1;
		Object obj3;
		Map map;
		Object obj4;
		Object obj5;
		Object obj6;
		Object obj7;
		obj6 = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		obj3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          6
		obj7 = null;
	//    4    6:aconst_null     
	//    5    7:astore          11
		obj5 = null;
	//    6    9:aconst_null     
	//    7   10:astore          9
		obj4 = null;
	//    8   12:aconst_null     
	//    9   13:astore          8
		map = null;
	//   10   15:aconst_null     
	//   11   16:astore          7
		obj = ((Object) (obj7));
	//   12   18:aload           11
	//   13   20:astore_3        
		obj1 = ((Object) (obj6));
	//   14   21:aload           10
	//   15   23:astore          4
		String s = getPreviousSessionId();
	//   16   25:aload_0         
	//   17   26:invokespecial   #434 <Method String getPreviousSessionId()>
	//   18   29:astore          12
		if(s != null)
			break MISSING_BLOCK_LABEL_73;
	//   19   31:aload           12
	//   20   33:ifnonnull       73
		obj = ((Object) (obj7));
	//   21   36:aload           11
	//   22   38:astore_3        
		obj1 = ((Object) (obj6));
	//   23   39:aload           10
	//   24   41:astore          4
		Fabric.getLogger().e("CrashlyticsCore", "Tried to write a native crash while no session was open.", ((Throwable) (null)));
	//   25   43:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   26   46:ldc2            #312 <String "CrashlyticsCore">
	//   27   49:ldc2            #436 <String "Tried to write a native crash while no session was open.">
	//   28   52:aconst_null     
	//   29   53:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   30   58:aconst_null     
	//   31   59:ldc2            #438 <String "Failed to flush to session begin file.">
	//   32   62:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   33   65:aconst_null     
	//   34   66:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//   35   69:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   36   72:return          
		obj = ((Object) (obj7));
	//   37   73:aload           11
	//   38   75:astore_3        
		obj1 = ((Object) (obj6));
	//   39   76:aload           10
	//   40   78:astore          4
		CrashlyticsCore.recordFatalExceptionEvent(s, String.format(Locale.US, "<native-crash [%s (%s)]>", new Object[] {
			sessioneventdata.signal.code, sessioneventdata.signal.name
		}));
	//   41   80:aload           12
	//   42   82:getstatic       #456 <Field Locale Locale.US>
	//   43   85:ldc2            #458 <String "<native-crash [%s (%s)]>">
	//   44   88:iconst_2        
	//   45   89:anewarray       Object[]
	//   46   92:dup             
	//   47   93:iconst_0        
	//   48   94:aload_1         
	//   49   95:getfield        #464 <Field SignalData SessionEventData.signal>
	//   50   98:getfield        #469 <Field String SignalData.code>
	//   51  101:aastore         
	//   52  102:dup             
	//   53  103:iconst_1        
	//   54  104:aload_1         
	//   55  105:getfield        #464 <Field SignalData SessionEventData.signal>
	//   56  108:getfield        #472 <Field String SignalData.name>
	//   57  111:aastore         
	//   58  112:invokestatic    #476 <Method String String.format(Locale, String, Object[])>
	//   59  115:invokestatic    #479 <Method void CrashlyticsCore.recordFatalExceptionEvent(String, String)>
		obj = ((Object) (obj7));
	//   60  118:aload           11
	//   61  120:astore_3        
		obj1 = ((Object) (obj6));
	//   62  121:aload           10
	//   63  123:astore          4
		if(sessioneventdata.binaryImages == null) goto _L2; else goto _L1
	//   64  125:aload_1         
	//   65  126:getfield        #483 <Field com.crashlytics.android.core.internal.models.BinaryImageData[] SessionEventData.binaryImages>
	//   66  129:ifnull          283
_L1:
		obj = ((Object) (obj7));
	//   67  132:aload           11
	//   68  134:astore_3        
		obj1 = ((Object) (obj6));
	//   69  135:aload           10
	//   70  137:astore          4
		if(sessioneventdata.binaryImages.length <= 0) goto _L2; else goto _L3
	//   71  139:aload_1         
	//   72  140:getfield        #483 <Field com.crashlytics.android.core.internal.models.BinaryImageData[] SessionEventData.binaryImages>
	//   73  143:arraylength     
	//   74  144:ifle            283
_L3:
		boolean flag = true;
	//   75  147:iconst_1        
	//   76  148:istore_2        
		  goto _L4
	//*  77  149:goto            378
_L11:
		obj = ((Object) (obj7));
	//   78  152:aload           11
	//   79  154:astore_3        
		obj1 = ((Object) (obj6));
	//   80  155:aload           10
	//   81  157:astore          4
		Object obj2;
		obj2 = ((Object) (new ClsFileOutputStream(getFilesDir(), (new StringBuilder()).append(s).append(((String) (obj2))).toString())));
	//   82  159:new             #344 <Class ClsFileOutputStream>
	//   83  162:dup             
	//   84  163:aload_0         
	//   85  164:invokespecial   #292 <Method File getFilesDir()>
	//   86  167:new             #326 <Class StringBuilder>
	//   87  170:dup             
	//   88  171:invokespecial   #327 <Method void StringBuilder()>
	//   89  174:aload           12
	//   90  176:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   91  179:aload           5
	//   92  181:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   93  184:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   94  187:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   95  190:astore          5
		obj = ((Object) (obj5));
	//   96  192:aload           9
	//   97  194:astore_3        
		obj1 = ((Object) (obj4));
	//   98  195:aload           8
	//   99  197:astore          4
		obj3 = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)))));
	//  100  199:aload           5
	//  101  201:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//  102  204:astore          6
		obj = obj3;
	//  103  206:aload           6
	//  104  208:astore_3        
		obj1 = obj3;
	//  105  209:aload           6
	//  106  211:astore          4
		map = (new MetaDataStore(getFilesDir())).readKeyData(s);
	//  107  213:new             #492 <Class MetaDataStore>
	//  108  216:dup             
	//  109  217:aload_0         
	//  110  218:invokespecial   #292 <Method File getFilesDir()>
	//  111  221:invokespecial   #495 <Method void MetaDataStore(File)>
	//  112  224:aload           12
	//  113  226:invokevirtual   #499 <Method Map MetaDataStore.readKeyData(String)>
	//  114  229:astore          7
		obj = obj3;
	//  115  231:aload           6
	//  116  233:astore_3        
		obj1 = obj3;
	//  117  234:aload           6
	//  118  236:astore          4
		NativeCrashWriter.writeNativeCrash(sessioneventdata, new LogFileManager(crashlyticsCore.getContext(), fileStore, s), map, ((CodedOutputStream) (obj3)));
	//  119  238:aload_1         
	//  120  239:new             #222 <Class LogFileManager>
	//  121  242:dup             
	//  122  243:aload_0         
	//  123  244:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//  124  247:invokevirtual   #220 <Method Context CrashlyticsCore.getContext()>
	//  125  250:aload_0         
	//  126  251:getfield        #207 <Field FileStore fileStore>
	//  127  254:aload           12
	//  128  256:invokespecial   #502 <Method void LogFileManager(Context, FileStore, String)>
	//  129  259:aload           7
	//  130  261:aload           6
	//  131  263:invokestatic    #508 <Method void NativeCrashWriter.writeNativeCrash(SessionEventData, LogFileManager, Map, CodedOutputStream)>
		CommonUtils.flushOrLog(((java.io.Flushable) (obj3)), "Failed to flush to session begin file.");
	//  132  266:aload           6
	//  133  268:ldc2            #438 <String "Failed to flush to session begin file.">
	//  134  271:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close fatal exception file output stream.");
	//  135  274:aload           5
	//  136  276:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//  137  279:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  138  282:return          
_L2:
		flag = false;
	//  139  283:iconst_0        
	//  140  284:istore_2        
		  goto _L4
	//* 141  285:goto            378
_L9:
		obj2 = "SessionMissingBinaryImages";
	//  142  288:ldc1            #98  <String "SessionMissingBinaryImages">
	//  143  290:astore          5
		continue; /* Loop/switch isn't completed */
	//  144  292:goto            152
		sessioneventdata;
	//  145  295:astore_1        
		obj2 = obj3;
	//  146  296:aload           6
	//  147  298:astore          5
		obj3 = ((Object) (sessioneventdata));
	//  148  300:aload_1         
	//  149  301:astore          6
		sessioneventdata = ((SessionEventData) (map));
	//  150  303:aload           7
	//  151  305:astore_1        
_L7:
		obj = ((Object) (sessioneventdata));
	//  152  306:aload_1         
	//  153  307:astore_3        
		obj1 = obj2;
	//  154  308:aload           5
	//  155  310:astore          4
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the native crash logger", ((Throwable) (obj3)));
	//  156  312:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//  157  315:ldc2            #312 <String "CrashlyticsCore">
	//  158  318:ldc2            #510 <String "An error occurred in the native crash logger">
	//  159  321:aload           6
	//  160  323:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (sessioneventdata)), "Failed to flush to session begin file.");
	//  161  328:aload_1         
	//  162  329:ldc2            #438 <String "Failed to flush to session begin file.">
	//  163  332:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close fatal exception file output stream.");
	//  164  335:aload           5
	//  165  337:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//  166  340:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  167  343:return          
		sessioneventdata;
	//  168  344:astore_1        
_L6:
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
	//  169  345:aload_3         
	//  170  346:ldc2            #438 <String "Failed to flush to session begin file.">
	//  171  349:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
	//  172  352:aload           4
	//  173  354:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//  174  357:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw sessioneventdata;
	//  175  360:aload_1         
	//  176  361:athrow          
		sessioneventdata;
	//  177  362:astore_1        
		obj1 = obj2;
	//  178  363:aload           5
	//  179  365:astore          4
		if(true) goto _L6; else goto _L5
	//  180  367:goto            345
_L5:
		obj3;
	//  181  370:astore          6
		sessioneventdata = ((SessionEventData) (obj1));
	//  182  372:aload           4
	//  183  374:astore_1        
		if(true) goto _L7; else goto _L4
	//  184  375:goto            306
_L4:
		if(!flag) goto _L9; else goto _L8
	//  185  378:iload_2         
	//  186  379:ifeq            288
_L8:
		obj2 = "SessionCrash";
	//  187  382:ldc1            #101 <String "SessionCrash">
	//  188  384:astore          5
		if(true) goto _L11; else goto _L10
	//  189  386:goto            152
_L10:
	}

	private void doWriteNonFatal(Date date, Thread thread, Throwable throwable)
	{
		Object obj;
		Object obj1;
		ClsFileOutputStream clsfileoutputstream;
		CodedOutputStream codedoutputstream;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		String s;
		s = getCurrentSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #286 <Method String getCurrentSessionId()>
	//    2    4:astore          12
		if(s == null)
	//*   3    6:aload           12
	//*   4    8:ifnonnull       27
		{
			Fabric.getLogger().e("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", ((Throwable) (null)));
	//    5   11:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//    6   14:ldc2            #312 <String "CrashlyticsCore">
	//    7   17:ldc2            #512 <String "Tried to write a non-fatal exception while no session was open.">
	//    8   20:aconst_null     
	//    9   21:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
			return;
	//   10   26:return          
		}
		CrashlyticsCore.recordLoggedExceptionEvent(s, ((Object) (throwable)).getClass().getName());
	//   11   27:aload           12
	//   12   29:aload_3         
	//   13   30:invokevirtual   #516 <Method Class Object.getClass()>
	//   14   33:invokevirtual   #521 <Method String Class.getName()>
	//   15   36:invokestatic    #524 <Method void CrashlyticsCore.recordLoggedExceptionEvent(String, String)>
		clsfileoutputstream = null;
	//   16   39:aconst_null     
	//   17   40:astore          6
		obj2 = null;
	//   18   42:aconst_null     
	//   19   43:astore          8
		obj5 = null;
	//   20   45:aconst_null     
	//   21   46:astore          11
		obj4 = null;
	//   22   48:aconst_null     
	//   23   49:astore          10
		obj3 = null;
	//   24   51:aconst_null     
	//   25   52:astore          9
		codedoutputstream = null;
	//   26   54:aconst_null     
	//   27   55:astore          7
		obj = ((Object) (obj5));
	//   28   57:aload           11
	//   29   59:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   30   61:aload           6
	//   31   63:astore          5
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Crashlytics is logging non-fatal exception \"").append(((Object) (throwable))).append("\" from thread ").append(thread.getName()).toString());
	//   32   65:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   33   68:ldc2            #312 <String "CrashlyticsCore">
	//   34   71:new             #326 <Class StringBuilder>
	//   35   74:dup             
	//   36   75:invokespecial   #327 <Method void StringBuilder()>
	//   37   78:ldc2            #526 <String "Crashlytics is logging non-fatal exception \"">
	//   38   81:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:aload_3         
	//   40   85:invokevirtual   #529 <Method StringBuilder StringBuilder.append(Object)>
	//   41   88:ldc2            #531 <String "\" from thread ">
	//   42   91:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   43   94:aload_2         
	//   44   95:invokevirtual   #534 <Method String Thread.getName()>
	//   45   98:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   46  101:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   47  104:invokeinterface #320 <Method void Logger.d(String, String)>
		obj = ((Object) (obj5));
	//   48  109:aload           11
	//   49  111:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   50  113:aload           6
	//   51  115:astore          5
		String s1 = CommonUtils.padWithZerosToMaxIntWidth(eventCounter.getAndIncrement());
	//   52  117:aload_0         
	//   53  118:getfield        #189 <Field AtomicInteger eventCounter>
	//   54  121:invokevirtual   #538 <Method int AtomicInteger.getAndIncrement()>
	//   55  124:invokestatic    #542 <Method String CommonUtils.padWithZerosToMaxIntWidth(int)>
	//   56  127:astore          13
		obj = ((Object) (obj5));
	//   57  129:aload           11
	//   58  131:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   59  133:aload           6
	//   60  135:astore          5
		s1 = (new StringBuilder()).append(s).append("SessionEvent").append(s1).toString();
	//   61  137:new             #326 <Class StringBuilder>
	//   62  140:dup             
	//   63  141:invokespecial   #327 <Method void StringBuilder()>
	//   64  144:aload           12
	//   65  146:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   66  149:ldc1            #109 <String "SessionEvent">
	//   67  151:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   68  154:aload           13
	//   69  156:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   70  159:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   71  162:astore          13
		obj = ((Object) (obj5));
	//   72  164:aload           11
	//   73  166:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   74  168:aload           6
	//   75  170:astore          5
		clsfileoutputstream = new ClsFileOutputStream(getFilesDir(), s1);
	//   76  172:new             #344 <Class ClsFileOutputStream>
	//   77  175:dup             
	//   78  176:aload_0         
	//   79  177:invokespecial   #292 <Method File getFilesDir()>
	//   80  180:aload           13
	//   81  182:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   82  185:astore          6
		obj = ((Object) (obj4));
	//   83  187:aload           10
	//   84  189:astore          4
		obj1 = ((Object) (obj3));
	//   85  191:aload           9
	//   86  193:astore          5
		codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (clsfileoutputstream)));
	//   87  195:aload           6
	//   88  197:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   89  200:astore          7
		obj = ((Object) (codedoutputstream));
	//   90  202:aload           7
	//   91  204:astore          4
		obj1 = ((Object) (codedoutputstream));
	//   92  206:aload           7
	//   93  208:astore          5
		writeSessionEvent(codedoutputstream, date, thread, throwable, "error", false);
	//   94  210:aload_0         
	//   95  211:aload           7
	//   96  213:aload_1         
	//   97  214:aload_2         
	//   98  215:aload_3         
	//   99  216:ldc1            #61  <String "error">
	//  100  218:iconst_0        
	//  101  219:invokespecial   #546 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to non-fatal file.");
	//  102  222:aload           7
	//  103  224:ldc2            #548 <String "Failed to flush to non-fatal file.">
	//  104  227:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (clsfileoutputstream)), "Failed to close non-fatal file output stream.");
	//  105  230:aload           6
	//  106  232:ldc2            #550 <String "Failed to close non-fatal file output stream.">
	//  107  235:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
_L1:
		try
		{
			trimSessionEventFiles(s, 64);
	//  108  238:aload_0         
	//  109  239:aload           12
	//  110  241:bipush          64
	//  111  243:invokespecial   #554 <Method void trimSessionEventFiles(String, int)>
			return;
	//  112  246:return          
		}
		// Misplaced declaration of an exception variable
		catch(Date date)
	//* 113  247:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "An error occurred when trimming non-fatal files.", ((Throwable) (date)));
	//  114  248:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//  115  251:ldc2            #312 <String "CrashlyticsCore">
	//  116  254:ldc2            #556 <String "An error occurred when trimming non-fatal files.">
	//  117  257:aload_1         
	//  118  258:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		}
		return;
	//  119  263:return          
		throwable;
	//  120  264:astore_3        
		thread = ((Thread) (obj2));
	//  121  265:aload           8
	//  122  267:astore_2        
		date = ((Date) (codedoutputstream));
	//  123  268:aload           7
	//  124  270:astore_1        
_L4:
		obj = ((Object) (date));
	//  125  271:aload_1         
	//  126  272:astore          4
		obj1 = ((Object) (thread));
	//  127  274:aload_2         
	//  128  275:astore          5
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the non-fatal exception logger", throwable);
	//  129  277:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//  130  280:ldc2            #312 <String "CrashlyticsCore">
	//  131  283:ldc2            #558 <String "An error occurred in the non-fatal exception logger">
	//  132  286:aload_3         
	//  133  287:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to non-fatal file.");
	//  134  292:aload_1         
	//  135  293:ldc2            #548 <String "Failed to flush to non-fatal file.">
	//  136  296:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (thread)), "Failed to close non-fatal file output stream.");
	//  137  299:aload_2         
	//  138  300:ldc2            #550 <String "Failed to close non-fatal file output stream.">
	//  139  303:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		  goto _L1
	//* 140  306:goto            238
		date;
	//  141  309:astore_1        
_L3:
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to non-fatal file.");
	//  142  310:aload           4
	//  143  312:ldc2            #548 <String "Failed to flush to non-fatal file.">
	//  144  315:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close non-fatal file output stream.");
	//  145  318:aload           5
	//  146  320:ldc2            #550 <String "Failed to close non-fatal file output stream.">
	//  147  323:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw date;
	//  148  326:aload_1         
	//  149  327:athrow          
		date;
	//  150  328:astore_1        
		obj1 = ((Object) (clsfileoutputstream));
	//  151  329:aload           6
	//  152  331:astore          5
		if(true) goto _L3; else goto _L2
	//  153  333:goto            310
_L2:
		throwable;
	//  154  336:astore_3        
		thread = ((Thread) (clsfileoutputstream));
	//  155  337:aload           6
	//  156  339:astore_2        
		date = ((Date) (obj1));
	//  157  340:aload           5
	//  158  342:astore_1        
		  goto _L4
	//* 159  343:goto            271
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

	private String getCurrentSessionId()
	{
		File afile[] = listSortedSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #386 <Method File[] listSortedSessionBeginFiles()>
	//    2    4:astore_1        
		if(afile.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            17
			return getSessionIdFromSessionFile(afile[0]);
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:invokestatic    #324 <Method String getSessionIdFromSessionFile(File)>
	//   10   16:areturn         
		else
			return null;
	//   11   17:aconst_null     
	//   12   18:areturn         
	}

	private File getFilesDir()
	{
		return fileStore.getFilesDir();
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field FileStore fileStore>
	//    2    4:invokeinterface #563 <Method File FileStore.getFilesDir()>
	//    3    9:areturn         
	}

	private String getPreviousSessionId()
	{
		File afile[] = listSortedSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #386 <Method File[] listSortedSessionBeginFiles()>
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
	//   10   14:invokestatic    #324 <Method String getSessionIdFromSessionFile(File)>
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
	//    1    1:invokevirtual   #564 <Method String File.getName()>
	//    2    4:iconst_0        
	//    3    5:bipush          35
	//    4    7:invokevirtual   #568 <Method String String.substring(int, int)>
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
	//*   5    6:icmple          78
		{
			Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
				Integer.valueOf(i)
			}));
	//    6    9:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//    7   12:ldc2            #312 <String "CrashlyticsCore">
	//    8   15:getstatic       #456 <Field Locale Locale.US>
	//    9   18:ldc2            #572 <String "Trimming down to %d logged exceptions.">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:iload_3         
	//   15   28:invokestatic    #578 <Method Integer Integer.valueOf(int)>
	//   16   31:aastore         
	//   17   32:invokestatic    #476 <Method String String.format(Locale, String, Object[])>
	//   18   35:invokeinterface #320 <Method void Logger.d(String, String)>
			trimSessionEventFiles(s, i);
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:iload_3         
	//   22   43:invokespecial   #554 <Method void trimSessionEventFiles(String, int)>
			afile1 = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()))));
	//   23   46:aload_0         
	//   24   47:new             #39  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   25   50:dup             
	//   26   51:new             #326 <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #327 <Method void StringBuilder()>
	//   29   58:aload_1         
	//   30   59:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:ldc1            #109 <String "SessionEvent">
	//   32   64:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   34   70:invokespecial   #580 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   35   73:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//   36   76:astore          4
		}
		return afile1;
	//   37   78:aload           4
	//   38   80:areturn         
	}

	private UserMetaData getUserMetaData(String s)
	{
		if(isHandlingException())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #584 <Method boolean isHandlingException()>
	//*   2    4:ifeq            36
			return new UserMetaData(crashlyticsCore.getUserIdentifier(), crashlyticsCore.getUserName(), crashlyticsCore.getUserEmail());
	//    3    7:new             #586 <Class UserMetaData>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//    7   15:invokevirtual   #589 <Method String CrashlyticsCore.getUserIdentifier()>
	//    8   18:aload_0         
	//    9   19:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   10   22:invokevirtual   #592 <Method String CrashlyticsCore.getUserName()>
	//   11   25:aload_0         
	//   12   26:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   13   29:invokevirtual   #595 <Method String CrashlyticsCore.getUserEmail()>
	//   14   32:invokespecial   #598 <Method void UserMetaData(String, String, String)>
	//   15   35:areturn         
		else
			return (new MetaDataStore(getFilesDir())).readUserData(s);
	//   16   36:new             #492 <Class MetaDataStore>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokespecial   #292 <Method File getFilesDir()>
	//   20   44:invokespecial   #495 <Method void MetaDataStore(File)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #601 <Method UserMetaData MetaDataStore.readUserData(String)>
	//   23   51:areturn         
	}

	private void handleUncaughtException(Date date, Thread thread, Throwable throwable)
		throws Exception
	{
		crashlyticsCore.createCrashMarker();
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #604 <Method void CrashlyticsCore.createCrashMarker()>
		writeFatal(date, thread, throwable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #607 <Method void writeFatal(Date, Thread, Throwable)>
		doCloseSessions();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #609 <Method void doCloseSessions()>
		doOpenSession();
	//   10   18:aload_0         
	//   11   19:invokespecial   #297 <Method void doOpenSession()>
		trimSessionFiles();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #612 <Method void trimSessionFiles()>
		if(!crashlyticsCore.shouldPromptUserBeforeSendingCrashReports())
	//*  14   26:aload_0         
	//*  15   27:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//*  16   30:invokevirtual   #615 <Method boolean CrashlyticsCore.shouldPromptUserBeforeSendingCrashReports()>
	//*  17   33:ifne            40
			sendSessionReports();
	//   18   36:aload_0         
	//   19   37:invokespecial   #618 <Method void sendSessionReports()>
	//   20   40:return          
	}

	private File[] listCompleteSessionFiles()
	{
		return listFilesMatching(SESSION_FILE_FILTER);
	//    0    0:aload_0         
	//    1    1:getstatic       #144 <Field FilenameFilter SESSION_FILE_FILTER>
	//    2    4:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    7:areturn         
	}

	private File[] listFiles(File file)
	{
		return ensureFileArrayNotNull(file.listFiles());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #623 <Method File[] File.listFiles()>
	//    3    5:invokespecial   #625 <Method File[] ensureFileArrayNotNull(File[])>
	//    4    8:areturn         
	}

	private File[] listFilesMatching(File file, FilenameFilter filenamefilter)
	{
		return ensureFileArrayNotNull(file.listFiles(filenamefilter));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #628 <Method File[] File.listFiles(FilenameFilter)>
	//    4    6:invokespecial   #625 <Method File[] ensureFileArrayNotNull(File[])>
	//    5    9:areturn         
	}

	private File[] listFilesMatching(FilenameFilter filenamefilter)
	{
		return listFilesMatching(getFilesDir(), filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #292 <Method File getFilesDir()>
	//    3    5:aload_1         
	//    4    6:invokespecial   #630 <Method File[] listFilesMatching(File, FilenameFilter)>
	//    5    9:areturn         
	}

	private File[] listSessionPartFilesFor(String s)
	{
		return listFilesMatching(((FilenameFilter) (new SessionPartFileFilter(s))));
	//    0    0:aload_0         
	//    1    1:new             #48  <Class CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #631 <Method void CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter(String)>
	//    5    9:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//    6   12:areturn         
	}

	private File[] listSortedSessionBeginFiles()
	{
		File afile[] = listSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #634 <Method File[] listSessionBeginFiles()>
	//    2    4:astore_1        
		Arrays.sort(((Object []) (afile)), LARGEST_FILE_NAME_FIRST);
	//    3    5:aload_1         
	//    4    6:getstatic       #147 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #640 <Method void Arrays.sort(Object[], Comparator)>
		return afile;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	private void retainSessions(File afile[], Set set)
	{
		int j = afile.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		int i = 0;
	//    3    4:iconst_0        
	//    4    5:istore_3        
		do
		{
			File file;
			String s;
			Matcher matcher;
label0:
			{
				if(i < j)
	//*   5    6:iload_3         
	//*   6    7:iload           4
	//*   7    9:icmpge          80
				{
					file = afile[i];
	//    8   12:aload_1         
	//    9   13:iload_3         
	//   10   14:aaload          
	//   11   15:astore          5
					s = file.getName();
	//   12   17:aload           5
	//   13   19:invokevirtual   #564 <Method String File.getName()>
	//   14   22:astore          6
					matcher = SESSION_FILE_PATTERN.matcher(((CharSequence) (s)));
	//   15   24:getstatic       #163 <Field Pattern SESSION_FILE_PATTERN>
	//   16   27:aload           6
	//   17   29:invokevirtual   #646 <Method Matcher Pattern.matcher(CharSequence)>
	//   18   32:astore          7
					if(matcher.matches())
						break label0;
	//   19   34:aload           7
	//   20   36:invokevirtual   #651 <Method boolean Matcher.matches()>
	//   21   39:ifne            81
					Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Deleting unknown file: ").append(s).toString());
	//   22   42:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   23   45:ldc2            #312 <String "CrashlyticsCore">
	//   24   48:new             #326 <Class StringBuilder>
	//   25   51:dup             
	//   26   52:invokespecial   #327 <Method void StringBuilder()>
	//   27   55:ldc2            #653 <String "Deleting unknown file: ">
	//   28   58:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   29   61:aload           6
	//   30   63:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   31   66:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   32   69:invokeinterface #320 <Method void Logger.d(String, String)>
					file.delete();
	//   33   74:aload           5
	//   34   76:invokevirtual   #379 <Method boolean File.delete()>
	//   35   79:pop             
				}
				return;
	//   36   80:return          
			}
			if(!set.contains(((Object) (matcher.group(1)))))
	//*  37   81:aload_2         
	//*  38   82:aload           7
	//*  39   84:iconst_1        
	//*  40   85:invokevirtual   #656 <Method String Matcher.group(int)>
	//*  41   88:invokeinterface #662 <Method boolean Set.contains(Object)>
	//*  42   93:ifne            134
			{
				Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Trimming session file: ").append(s).toString());
	//   43   96:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   44   99:ldc2            #312 <String "CrashlyticsCore">
	//   45  102:new             #326 <Class StringBuilder>
	//   46  105:dup             
	//   47  106:invokespecial   #327 <Method void StringBuilder()>
	//   48  109:ldc2            #664 <String "Trimming session file: ">
	//   49  112:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   50  115:aload           6
	//   51  117:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   52  120:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   53  123:invokeinterface #320 <Method void Logger.d(String, String)>
				file.delete();
	//   54  128:aload           5
	//   55  130:invokevirtual   #379 <Method boolean File.delete()>
	//   56  133:pop             
			}
			i++;
	//   57  134:iload_3         
	//   58  135:iconst_1        
	//   59  136:iadd            
	//   60  137:istore_3        
		} while(true);
	//   61  138:goto            6
	}

	private void sendSessionReports()
	{
		File afile[] = listCompleteSessionFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #668 <Method File[] listCompleteSessionFiles()>
	//    2    4:astore_3        
		int j = afile.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          48
		{
			File file = afile[i];
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:astore          4
			executorServiceWrapper.executeAsync(((Runnable) (new SendSessionRunnable(crashlyticsCore, file))));
	//   15   20:aload_0         
	//   16   21:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//   17   24:new             #45  <Class CrashlyticsUncaughtExceptionHandler$SendSessionRunnable>
	//   18   27:dup             
	//   19   28:aload_0         
	//   20   29:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   21   32:aload           4
	//   22   34:invokespecial   #671 <Method void CrashlyticsUncaughtExceptionHandler$SendSessionRunnable(CrashlyticsCore, File)>
	//   23   37:invokevirtual   #677 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Runnable)>
	//   24   40:pop             
		}

	//   25   41:iload_1         
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore_1        
	//*  29   45:goto            10
	//   30   48:return          
	}

	private void synthesizeSessionFile(File file, String s, File afile[], File file1)
	{
		Object obj;
		Object obj1;
		ClsFileOutputStream clsfileoutputstream;
		CodedOutputStream codedoutputstream;
		Object obj2;
		boolean flag;
		Object obj3;
		Object obj4;
		if(file1 != null)
	//*   0    0:aload           4
	//*   1    2:ifnull          253
			flag = true;
	//    2    5:iconst_1        
	//    3    6:istore          5
		else
	//*   4    8:aconst_null     
	//*   5    9:astore          7
	//*   6   11:aconst_null     
	//*   7   12:astore          10
	//*   8   14:aconst_null     
	//*   9   15:astore          6
	//*  10   17:aconst_null     
	//*  11   18:astore          12
	//*  12   20:aconst_null     
	//*  13   21:astore          11
	//*  14   23:aconst_null     
	//*  15   24:astore          9
	//*  16   26:new             #344 <Class ClsFileOutputStream>
	//*  17   29:dup             
	//*  18   30:aload_0         
	//*  19   31:invokespecial   #292 <Method File getFilesDir()>
	//*  20   34:aload_2         
	//*  21   35:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//*  22   38:astore          8
	//*  23   40:aload           12
	//*  24   42:astore          6
	//*  25   44:aload           11
	//*  26   46:astore          7
	//*  27   48:aload           8
	//*  28   50:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//*  29   53:astore          9
	//*  30   55:aload           9
	//*  31   57:astore          6
	//*  32   59:aload           9
	//*  33   61:astore          7
	//*  34   63:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//*  35   66:ldc2            #312 <String "CrashlyticsCore">
	//*  36   69:new             #326 <Class StringBuilder>
	//*  37   72:dup             
	//*  38   73:invokespecial   #327 <Method void StringBuilder()>
	//*  39   76:ldc2            #681 <String "Collecting SessionStart data for session ID ">
	//*  40   79:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//*  41   82:aload_2         
	//*  42   83:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//*  43   86:invokevirtual   #336 <Method String StringBuilder.toString()>
	//*  44   89:invokeinterface #320 <Method void Logger.d(String, String)>
	//*  45   94:aload           9
	//*  46   96:astore          6
	//*  47   98:aload           9
	//*  48  100:astore          7
	//*  49  102:aload           9
	//*  50  104:aload_1         
	//*  51  105:invokestatic    #685 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//*  52  108:aload           9
	//*  53  110:astore          6
	//*  54  112:aload           9
	//*  55  114:astore          7
	//*  56  116:aload           9
	//*  57  118:iconst_4        
	//*  58  119:new             #406 <Class Date>
	//*  59  122:dup             
	//*  60  123:invokespecial   #407 <Method void Date()>
	//*  61  126:invokevirtual   #689 <Method long Date.getTime()>
	//*  62  129:ldc2w           #690 <Long 1000L>
	//*  63  132:ldiv            
	//*  64  133:invokevirtual   #695 <Method void CodedOutputStream.writeUInt64(int, long)>
	//*  65  136:aload           9
	//*  66  138:astore          6
	//*  67  140:aload           9
	//*  68  142:astore          7
	//*  69  144:aload           9
	//*  70  146:iconst_5        
	//*  71  147:iload           5
	//*  72  149:invokevirtual   #699 <Method void CodedOutputStream.writeBool(int, boolean)>
	//*  73  152:aload           9
	//*  74  154:astore          6
	//*  75  156:aload           9
	//*  76  158:astore          7
	//*  77  160:aload           9
	//*  78  162:bipush          11
	//*  79  164:iconst_1        
	//*  80  165:invokevirtual   #703 <Method void CodedOutputStream.writeUInt32(int, int)>
	//*  81  168:aload           9
	//*  82  170:astore          6
	//*  83  172:aload           9
	//*  84  174:astore          7
	//*  85  176:aload           9
	//*  86  178:bipush          12
	//*  87  180:iconst_3        
	//*  88  181:invokevirtual   #706 <Method void CodedOutputStream.writeEnum(int, int)>
	//*  89  184:aload           9
	//*  90  186:astore          6
	//*  91  188:aload           9
	//*  92  190:astore          7
	//*  93  192:aload_0         
	//*  94  193:aload           9
	//*  95  195:aload_2         
	//*  96  196:invokespecial   #710 <Method void writeInitialPartsTo(CodedOutputStream, String)>
	//*  97  199:aload           9
	//*  98  201:astore          6
	//*  99  203:aload           9
	//* 100  205:astore          7
	//* 101  207:aload           9
	//* 102  209:aload_3         
	//* 103  210:aload_2         
	//* 104  211:invokestatic    #714 <Method void writeNonFatalEventsTo(CodedOutputStream, File[], String)>
	//* 105  214:iload           5
	//* 106  216:ifeq            234
	//* 107  219:aload           9
	//* 108  221:astore          6
	//* 109  223:aload           9
	//* 110  225:astore          7
	//* 111  227:aload           9
	//* 112  229:aload           4
	//* 113  231:invokestatic    #685 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//* 114  234:aload           9
	//* 115  236:ldc2            #716 <String "Error flushing session file stream">
	//* 116  239:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//* 117  242:iconst_0        
	//* 118  243:ifeq            259
	//* 119  246:aload_0         
	//* 120  247:aload           8
	//* 121  249:invokespecial   #718 <Method void closeWithoutRenamingOrLog(ClsFileOutputStream)>
	//* 122  252:return          
			flag = false;
	//  123  253:iconst_0        
	//  124  254:istore          5
		obj1 = null;
		obj2 = null;
		obj = null;
		obj4 = null;
		obj3 = null;
		codedoutputstream = null;
		clsfileoutputstream = new ClsFileOutputStream(getFilesDir(), s);
		obj = ((Object) (obj4));
		obj1 = ((Object) (obj3));
		codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (clsfileoutputstream)));
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Collecting SessionStart data for session ID ").append(s).toString());
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		writeToCosFromFile(codedoutputstream, file);
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		codedoutputstream.writeUInt64(4, (new Date()).getTime() / 1000L);
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		codedoutputstream.writeBool(5, flag);
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		codedoutputstream.writeUInt32(11, 1);
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		codedoutputstream.writeEnum(12, 3);
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		writeInitialPartsTo(codedoutputstream, s);
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		writeNonFatalEventsTo(codedoutputstream, afile, s);
		if(!flag)
			break MISSING_BLOCK_LABEL_234;
		obj = ((Object) (codedoutputstream));
		obj1 = ((Object) (codedoutputstream));
		writeToCosFromFile(codedoutputstream, file1);
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Error flushing session file stream");
		if(false)
		{
			closeWithoutRenamingOrLog(clsfileoutputstream);
			return;
		} else
	//* 125  256:goto            8
		{
			CommonUtils.closeOrLog(((java.io.Closeable) (clsfileoutputstream)), "Failed to close CLS file");
	//  126  259:aload           8
	//  127  261:ldc2            #720 <String "Failed to close CLS file">
	//  128  264:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
			return;
	//  129  267:return          
		}
		file1;
	//  130  268:astore          4
		afile = ((File []) (obj2));
	//  131  270:aload           10
	//  132  272:astore_3        
		file = ((File) (codedoutputstream));
	//  133  273:aload           9
	//  134  275:astore_1        
_L4:
		obj = ((Object) (file));
	//  135  276:aload_1         
	//  136  277:astore          6
		obj1 = ((Object) (afile));
	//  137  279:aload_3         
	//  138  280:astore          7
		Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Failed to write session file for session ID: ").append(s).toString(), ((Throwable) (file1)));
	//  139  282:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//  140  285:ldc2            #312 <String "CrashlyticsCore">
	//  141  288:new             #326 <Class StringBuilder>
	//  142  291:dup             
	//  143  292:invokespecial   #327 <Method void StringBuilder()>
	//  144  295:ldc2            #722 <String "Failed to write session file for session ID: ">
	//  145  298:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//  146  301:aload_2         
	//  147  302:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//  148  305:invokevirtual   #336 <Method String StringBuilder.toString()>
	//  149  308:aload           4
	//  150  310:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (file)), "Error flushing session file stream");
	//  151  315:aload_1         
	//  152  316:ldc2            #716 <String "Error flushing session file stream">
	//  153  319:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		if(true)
	//* 154  322:iconst_1        
	//* 155  323:ifeq            332
		{
			closeWithoutRenamingOrLog(((ClsFileOutputStream) (afile)));
	//  156  326:aload_0         
	//  157  327:aload_3         
	//  158  328:invokespecial   #718 <Method void closeWithoutRenamingOrLog(ClsFileOutputStream)>
			return;
	//  159  331:return          
		} else
		{
			CommonUtils.closeOrLog(((java.io.Closeable) (afile)), "Failed to close CLS file");
	//  160  332:aload_3         
	//  161  333:ldc2            #720 <String "Failed to close CLS file">
	//  162  336:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
			return;
	//  163  339:return          
		}
		file;
	//  164  340:astore_1        
_L2:
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Error flushing session file stream");
	//  165  341:aload           6
	//  166  343:ldc2            #716 <String "Error flushing session file stream">
	//  167  346:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		if(false)
	//* 168  349:iconst_0        
	//* 169  350:ifeq            361
			closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj1)));
	//  170  353:aload_0         
	//  171  354:aload           7
	//  172  356:invokespecial   #718 <Method void closeWithoutRenamingOrLog(ClsFileOutputStream)>
		else
	//* 173  359:aload_1         
	//* 174  360:athrow          
			CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close CLS file");
	//  175  361:aload           7
	//  176  363:ldc2            #720 <String "Failed to close CLS file">
	//  177  366:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//* 178  369:goto            359
		file;
	//  179  372:astore_1        
		obj1 = ((Object) (clsfileoutputstream));
	//  180  373:aload           8
	//  181  375:astore          7
		if(true) goto _L2; else goto _L1
	//  182  377:goto            341
_L1:
		file1;
	//  183  380:astore          4
		afile = ((File []) (clsfileoutputstream));
	//  184  382:aload           8
	//  185  384:astore_3        
		file = ((File) (obj1));
	//  186  385:aload           7
	//  187  387:astore_1        
		if(true) goto _L4; else goto _L3
	//  188  388:goto            276
_L3:
	}

	private void trimInvalidSessionFiles()
	{
		File file = getInvalidFilesDir();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #726 <Method File getInvalidFilesDir()>
	//    2    4:astore_2        
		if(!file.exists())
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #729 <Method boolean File.exists()>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		File afile[] = listFilesMatching(file, ((FilenameFilter) (new InvalidPartFileFilter())));
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:new             #42  <Class CrashlyticsUncaughtExceptionHandler$InvalidPartFileFilter>
	//   10   18:dup             
	//   11   19:invokespecial   #730 <Method void CrashlyticsUncaughtExceptionHandler$InvalidPartFileFilter()>
	//   12   22:invokespecial   #630 <Method File[] listFilesMatching(File, FilenameFilter)>
	//   13   25:astore_3        
		Arrays.sort(((Object []) (afile)), Collections.reverseOrder());
	//   14   26:aload_3         
	//   15   27:invokestatic    #734 <Method Comparator Collections.reverseOrder()>
	//   16   30:invokestatic    #640 <Method void Arrays.sort(Object[], Comparator)>
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
	//*  28   52:invokeinterface #740 <Method int Set.size()>
	//*  29   57:iconst_4        
	//*  30   58:icmpge          82
			((Set) (hashset)).add(((Object) (getSessionIdFromSessionFile(afile[i]))));
	//   31   61:aload           4
	//   32   63:aload_3         
	//   33   64:iload_1         
	//   34   65:aaload          
	//   35   66:invokestatic    #324 <Method String getSessionIdFromSessionFile(File)>
	//   36   69:invokeinterface #743 <Method boolean Set.add(Object)>
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
	//   46   85:invokespecial   #745 <Method File[] listFiles(File)>
	//   47   88:aload           4
	//   48   90:invokespecial   #747 <Method void retainSessions(File[], Set)>
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
	//    5    9:invokespecial   #386 <Method File[] listSortedSessionBeginFiles()>
	//    6   12:astore          4
		int j = Math.min(i, afile.length);
	//    7   14:iload_1         
	//    8   15:aload           4
	//    9   17:arraylength     
	//   10   18:invokestatic    #753 <Method int Math.min(int, int)>
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
	//   21   34:invokestatic    #324 <Method String getSessionIdFromSessionFile(File)>
	//   22   37:invokeinterface #743 <Method boolean Set.add(Object)>
	//   23   42:pop             

	//   24   43:iload_1         
	//   25   44:iconst_1        
	//   26   45:iadd            
	//   27   46:istore_1        
	//*  28   47:goto            24
		logFileManager.discardOldLogFiles(((Set) (hashset)));
	//   29   50:aload_0         
	//   30   51:getfield        #227 <Field LogFileManager logFileManager>
	//   31   54:aload_3         
	//   32   55:invokevirtual   #757 <Method void LogFileManager.discardOldLogFiles(Set)>
		retainSessions(listFilesMatching(((FilenameFilter) (new AnySessionPartFileFilter()))), ((Set) (hashset)));
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:new             #36  <Class CrashlyticsUncaughtExceptionHandler$AnySessionPartFileFilter>
	//   36   63:dup             
	//   37   64:aconst_null     
	//   38   65:invokespecial   #760 <Method void CrashlyticsUncaughtExceptionHandler$AnySessionPartFileFilter(CrashlyticsUncaughtExceptionHandler$1)>
	//   39   68:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//   40   71:aload_3         
	//   41   72:invokespecial   #747 <Method void retainSessions(File[], Set)>
	//   42   75:return          
	}

	private void trimSessionEventFiles(String s, int i)
	{
		Utils.capFileCount(getFilesDir(), ((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()))), i, SMALLEST_FILE_NAME_FIRST);
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method File getFilesDir()>
	//    2    4:new             #39  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//    3    7:dup             
	//    4    8:new             #326 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #327 <Method void StringBuilder()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #109 <String "SessionEvent">
	//   10   21:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #580 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   13   30:iload_2         
	//   14   31:getstatic       #150 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   15   34:invokestatic    #766 <Method void Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   16   37:return          
	}

	private void writeBeginSession(String s, Date date)
		throws Exception
	{
		CodedOutputStream codedoutputstream;
		CodedOutputStream codedoutputstream1;
		Object obj;
		codedoutputstream1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          6
		codedoutputstream = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		ClsFileOutputStream clsfileoutputstream = new ClsFileOutputStream(getFilesDir(), (new StringBuilder()).append(s).append("BeginSession").toString());
	//    6    8:new             #344 <Class ClsFileOutputStream>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #292 <Method File getFilesDir()>
	//   10   16:new             #326 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #327 <Method void StringBuilder()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:ldc1            #92  <String "BeginSession">
	//   16   29:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   19   38:astore          4
		codedoutputstream = ((CodedOutputStream) (obj));
	//   20   40:aload           6
	//   21   42:astore_3        
		codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (clsfileoutputstream)));
	//   22   43:aload           4
	//   23   45:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   48:astore          5
		codedoutputstream = codedoutputstream1;
	//   25   50:aload           5
	//   26   52:astore_3        
		SessionProtobufHelper.writeBeginSession(codedoutputstream1, s, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
			crashlyticsCore.getVersion()
		}), date.getTime() / 1000L);
	//   27   53:aload           5
	//   28   55:aload_1         
	//   29   56:getstatic       #456 <Field Locale Locale.US>
	//   30   59:ldc1            #64  <String "Crashlytics Android SDK/%s">
	//   31   61:iconst_1        
	//   32   62:anewarray       Object[]
	//   33   65:dup             
	//   34   66:iconst_0        
	//   35   67:aload_0         
	//   36   68:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   37   71:invokevirtual   #769 <Method String CrashlyticsCore.getVersion()>
	//   38   74:aastore         
	//   39   75:invokestatic    #476 <Method String String.format(Locale, String, Object[])>
	//   40   78:aload_2         
	//   41   79:invokevirtual   #689 <Method long Date.getTime()>
	//   42   82:ldc2w           #690 <Long 1000L>
	//   43   85:ldiv            
	//   44   86:invokestatic    #774 <Method void SessionProtobufHelper.writeBeginSession(CodedOutputStream, String, String, long)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream1)), "Failed to flush to session begin file.");
	//   45   89:aload           5
	//   46   91:ldc2            #438 <String "Failed to flush to session begin file.">
	//   47   94:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (clsfileoutputstream)), "Failed to close begin session file.");
	//   48   97:aload           4
	//   49   99:ldc2            #776 <String "Failed to close begin session file.">
	//   50  102:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   51  105:return          
		date;
	//   52  106:astore_2        
		s = ((String) (codedoutputstream1));
	//   53  107:aload           5
	//   54  109:astore_1        
_L2:
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to session begin file.");
	//   55  110:aload_3         
	//   56  111:ldc2            #438 <String "Failed to flush to session begin file.">
	//   57  114:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close begin session file.");
	//   58  117:aload_1         
	//   59  118:ldc2            #776 <String "Failed to close begin session file.">
	//   60  121:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw date;
	//   61  124:aload_2         
	//   62  125:athrow          
		date;
	//   63  126:astore_2        
		s = ((String) (clsfileoutputstream));
	//   64  127:aload           4
	//   65  129:astore_1        
		if(true) goto _L2; else goto _L1
	//   66  130:goto            110
_L1:
	}

	private void writeFatal(Date date, Thread thread, Throwable throwable)
	{
		Object obj;
		Object obj1;
		ClsFileOutputStream clsfileoutputstream;
		CodedOutputStream codedoutputstream;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		clsfileoutputstream = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		obj5 = null;
	//    4    6:aconst_null     
	//    5    7:astore          11
		obj4 = null;
	//    6    9:aconst_null     
	//    7   10:astore          10
		obj3 = null;
	//    8   12:aconst_null     
	//    9   13:astore          9
		codedoutputstream = null;
	//   10   15:aconst_null     
	//   11   16:astore          7
		obj = ((Object) (obj5));
	//   12   18:aload           11
	//   13   20:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   14   22:aload           6
	//   15   24:astore          5
		String s = getCurrentSessionId();
	//   16   26:aload_0         
	//   17   27:invokespecial   #286 <Method String getCurrentSessionId()>
	//   18   30:astore          12
		if(s != null)
			break MISSING_BLOCK_LABEL_75;
	//   19   32:aload           12
	//   20   34:ifnonnull       75
		obj = ((Object) (obj5));
	//   21   37:aload           11
	//   22   39:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   23   41:aload           6
	//   24   43:astore          5
		Fabric.getLogger().e("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", ((Throwable) (null)));
	//   25   45:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   26   48:ldc2            #312 <String "CrashlyticsCore">
	//   27   51:ldc2            #778 <String "Tried to write a fatal exception while no session was open.">
	//   28   54:aconst_null     
	//   29   55:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   30   60:aconst_null     
	//   31   61:ldc2            #438 <String "Failed to flush to session begin file.">
	//   32   64:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   33   67:aconst_null     
	//   34   68:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//   35   71:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   36   74:return          
		obj = ((Object) (obj5));
	//   37   75:aload           11
	//   38   77:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   39   79:aload           6
	//   40   81:astore          5
		CrashlyticsCore.recordFatalExceptionEvent(s, ((Object) (throwable)).getClass().getName());
	//   41   83:aload           12
	//   42   85:aload_3         
	//   43   86:invokevirtual   #516 <Method Class Object.getClass()>
	//   44   89:invokevirtual   #521 <Method String Class.getName()>
	//   45   92:invokestatic    #479 <Method void CrashlyticsCore.recordFatalExceptionEvent(String, String)>
		obj = ((Object) (obj5));
	//   46   95:aload           11
	//   47   97:astore          4
		obj1 = ((Object) (clsfileoutputstream));
	//   48   99:aload           6
	//   49  101:astore          5
		clsfileoutputstream = new ClsFileOutputStream(getFilesDir(), (new StringBuilder()).append(s).append("SessionCrash").toString());
	//   50  103:new             #344 <Class ClsFileOutputStream>
	//   51  106:dup             
	//   52  107:aload_0         
	//   53  108:invokespecial   #292 <Method File getFilesDir()>
	//   54  111:new             #326 <Class StringBuilder>
	//   55  114:dup             
	//   56  115:invokespecial   #327 <Method void StringBuilder()>
	//   57  118:aload           12
	//   58  120:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   59  123:ldc1            #101 <String "SessionCrash">
	//   60  125:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   61  128:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   62  131:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   63  134:astore          6
		obj = ((Object) (obj4));
	//   64  136:aload           10
	//   65  138:astore          4
		obj1 = ((Object) (obj3));
	//   66  140:aload           9
	//   67  142:astore          5
		codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (clsfileoutputstream)));
	//   68  144:aload           6
	//   69  146:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   70  149:astore          7
		obj = ((Object) (codedoutputstream));
	//   71  151:aload           7
	//   72  153:astore          4
		obj1 = ((Object) (codedoutputstream));
	//   73  155:aload           7
	//   74  157:astore          5
		writeSessionEvent(codedoutputstream, date, thread, throwable, "crash", true);
	//   75  159:aload_0         
	//   76  160:aload           7
	//   77  162:aload_1         
	//   78  163:aload_2         
	//   79  164:aload_3         
	//   80  165:ldc1            #58  <String "crash">
	//   81  167:iconst_1        
	//   82  168:invokespecial   #546 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to session begin file.");
	//   83  171:aload           7
	//   84  173:ldc2            #438 <String "Failed to flush to session begin file.">
	//   85  176:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (clsfileoutputstream)), "Failed to close fatal exception file output stream.");
	//   86  179:aload           6
	//   87  181:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//   88  184:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   89  187:return          
		throwable;
	//   90  188:astore_3        
		thread = ((Thread) (obj2));
	//   91  189:aload           8
	//   92  191:astore_2        
		date = ((Date) (codedoutputstream));
	//   93  192:aload           7
	//   94  194:astore_1        
_L4:
		obj = ((Object) (date));
	//   95  195:aload_1         
	//   96  196:astore          4
		obj1 = ((Object) (thread));
	//   97  198:aload_2         
	//   98  199:astore          5
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the fatal exception logger", throwable);
	//   99  201:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//  100  204:ldc2            #312 <String "CrashlyticsCore">
	//  101  207:ldc2            #780 <String "An error occurred in the fatal exception logger">
	//  102  210:aload_3         
	//  103  211:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to session begin file.");
	//  104  216:aload_1         
	//  105  217:ldc2            #438 <String "Failed to flush to session begin file.">
	//  106  220:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (thread)), "Failed to close fatal exception file output stream.");
	//  107  223:aload_2         
	//  108  224:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//  109  227:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  110  230:return          
		date;
	//  111  231:astore_1        
_L2:
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
	//  112  232:aload           4
	//  113  234:ldc2            #438 <String "Failed to flush to session begin file.">
	//  114  237:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
	//  115  240:aload           5
	//  116  242:ldc2            #446 <String "Failed to close fatal exception file output stream.">
	//  117  245:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw date;
	//  118  248:aload_1         
	//  119  249:athrow          
		date;
	//  120  250:astore_1        
		obj1 = ((Object) (clsfileoutputstream));
	//  121  251:aload           6
	//  122  253:astore          5
		if(true) goto _L2; else goto _L1
	//  123  255:goto            232
_L1:
		throwable;
	//  124  258:astore_3        
		thread = ((Thread) (clsfileoutputstream));
	//  125  259:aload           6
	//  126  261:astore_2        
		date = ((Date) (obj1));
	//  127  262:aload           5
	//  128  264:astore_1        
		if(true) goto _L4; else goto _L3
	//  129  265:goto            195
_L3:
	}

	private void writeInitialPartsTo(CodedOutputStream codedoutputstream, String s)
		throws IOException
	{
		String as[] = INITIAL_SESSION_PART_TAGS;
	//    0    0:getstatic       #179 <Field String[] INITIAL_SESSION_PART_TAGS>
	//    1    3:astore          5
		int j = as.length;
	//    2    5:aload           5
	//    3    7:arraylength     
	//    4    8:istore          4
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		while(i < j) 
	//*   7   12:iload_3         
	//*   8   13:iload           4
	//*   9   15:icmpge          165
		{
			String s1 = as[i];
	//   10   18:aload           5
	//   11   20:iload_3         
	//   12   21:aaload          
	//   13   22:astore          6
			File afile[] = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s).append(s1).toString()))));
	//   14   24:aload_0         
	//   15   25:new             #39  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   16   28:dup             
	//   17   29:new             #326 <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #327 <Method void StringBuilder()>
	//   20   36:aload_2         
	//   21   37:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:aload           6
	//   23   42:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   25   48:invokespecial   #580 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   26   51:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//   27   54:astore          7
			if(afile.length == 0)
	//*  28   56:aload           7
	//*  29   58:arraylength     
	//*  30   59:ifne            112
			{
				Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Can't find ").append(s1).append(" data for session ID ").append(s).toString(), ((Throwable) (null)));
	//   31   62:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   32   65:ldc2            #312 <String "CrashlyticsCore">
	//   33   68:new             #326 <Class StringBuilder>
	//   34   71:dup             
	//   35   72:invokespecial   #327 <Method void StringBuilder()>
	//   36   75:ldc2            #782 <String "Can't find ">
	//   37   78:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:aload           6
	//   39   83:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   40   86:ldc2            #784 <String " data for session ID ">
	//   41   89:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:aload_2         
	//   43   93:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   44   96:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   45   99:aconst_null     
	//   46  100:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
			} else
	//*  47  105:iload_3         
	//*  48  106:iconst_1        
	//*  49  107:iadd            
	//*  50  108:istore_3        
	//*  51  109:goto            12
			{
				Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Collecting ").append(s1).append(" data for session ID ").append(s).toString());
	//   52  112:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   53  115:ldc2            #312 <String "CrashlyticsCore">
	//   54  118:new             #326 <Class StringBuilder>
	//   55  121:dup             
	//   56  122:invokespecial   #327 <Method void StringBuilder()>
	//   57  125:ldc2            #786 <String "Collecting ">
	//   58  128:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   59  131:aload           6
	//   60  133:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   61  136:ldc2            #784 <String " data for session ID ">
	//   62  139:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   63  142:aload_2         
	//   64  143:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   65  146:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   66  149:invokeinterface #320 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, afile[0]);
	//   67  154:aload_1         
	//   68  155:aload           7
	//   69  157:iconst_0        
	//   70  158:aaload          
	//   71  159:invokestatic    #685 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
			i++;
		}
	//*  72  162:goto            105
	//   73  165:return          
	}

	private static void writeNonFatalEventsTo(CodedOutputStream codedoutputstream, File afile[], String s)
	{
		Arrays.sort(((Object []) (afile)), CommonUtils.FILE_MODIFIED_COMPARATOR);
	//    0    0:aload_1         
	//    1    1:getstatic       #789 <Field Comparator CommonUtils.FILE_MODIFIED_COMPARATOR>
	//    2    4:invokestatic    #640 <Method void Arrays.sort(Object[], Comparator)>
		int j = afile.length;
	//    3    7:aload_1         
	//    4    8:arraylength     
	//    5    9:istore          4
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		while(i < j) 
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
	//   15   24:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   16   27:ldc2            #312 <String "CrashlyticsCore">
	//   17   30:getstatic       #456 <Field Locale Locale.US>
	//   18   33:ldc2            #791 <String "Found Non Fatal for session ID %s in %s ">
	//   19   36:iconst_2        
	//   20   37:anewarray       Object[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:aload_2         
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_1        
	//   27   46:aload           5
	//   28   48:invokevirtual   #564 <Method String File.getName()>
	//   29   51:aastore         
	//   30   52:invokestatic    #476 <Method String String.format(Locale, String, Object[])>
	//   31   55:invokeinterface #320 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, file);
	//   32   60:aload_0         
	//   33   61:aload           5
	//   34   63:invokestatic    #685 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
	//*  35   66:iload_3         
	//*  36   67:iconst_1        
	//*  37   68:iadd            
	//*  38   69:istore_3        
	//*  39   70:goto            13
			catch(Exception exception)
	//*  40   73:astore          5
			{
				Fabric.getLogger().e("CrashlyticsCore", "Error writting non-fatal to session.", ((Throwable) (exception)));
	//   41   75:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   42   78:ldc2            #312 <String "CrashlyticsCore">
	//   43   81:ldc2            #793 <String "Error writting non-fatal to session.">
	//   44   84:aload           5
	//   45   86:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
			}
			i++;
		}
	//*  46   91:goto            66
	//   47   94:return          
	}

	private void writeSessionApp(String s)
		throws Exception
	{
		Object obj;
		Object obj2;
		Object obj3;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		obj3 = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		obj2 = null;
	//    4    5:aconst_null     
	//    5    6:astore          4
		Object obj1 = ((Object) (new ClsFileOutputStream(getFilesDir(), (new StringBuilder()).append(s).append("SessionApp").toString())));
	//    6    8:new             #344 <Class ClsFileOutputStream>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #292 <Method File getFilesDir()>
	//   10   16:new             #326 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #327 <Method void StringBuilder()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:ldc1            #89  <String "SessionApp">
	//   16   29:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   19   38:astore_3        
		s = ((String) (obj3));
	//   20   39:aload           5
	//   21   41:astore_1        
		obj = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   22   42:aload_3         
	//   23   43:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   46:astore_2        
		s = ((String) (obj));
	//   25   47:aload_2         
	//   26   48:astore_1        
		SessionProtobufHelper.writeSessionApp(((CodedOutputStream) (obj)), idManager.getAppIdentifier(), crashlyticsCore.getApiKey(), crashlyticsCore.getVersionCode(), crashlyticsCore.getVersionName(), idManager.getAppInstallIdentifier(), DeliveryMechanism.determineFrom(crashlyticsCore.getInstallerPackageName()).getId(), unityVersion);
	//   27   49:aload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #195 <Field IdManager idManager>
	//   30   54:invokevirtual   #798 <Method String IdManager.getAppIdentifier()>
	//   31   57:aload_0         
	//   32   58:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   33   61:invokevirtual   #801 <Method String CrashlyticsCore.getApiKey()>
	//   34   64:aload_0         
	//   35   65:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   36   68:invokevirtual   #804 <Method String CrashlyticsCore.getVersionCode()>
	//   37   71:aload_0         
	//   38   72:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   39   75:invokevirtual   #807 <Method String CrashlyticsCore.getVersionName()>
	//   40   78:aload_0         
	//   41   79:getfield        #195 <Field IdManager idManager>
	//   42   82:invokevirtual   #810 <Method String IdManager.getAppInstallIdentifier()>
	//   43   85:aload_0         
	//   44   86:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   45   89:invokevirtual   #813 <Method String CrashlyticsCore.getInstallerPackageName()>
	//   46   92:invokestatic    #819 <Method DeliveryMechanism DeliveryMechanism.determineFrom(String)>
	//   47   95:invokevirtual   #822 <Method int DeliveryMechanism.getId()>
	//   48   98:aload_0         
	//   49   99:getfield        #205 <Field String unityVersion>
	//   50  102:invokestatic    #825 <Method void SessionProtobufHelper.writeSessionApp(CodedOutputStream, String, String, String, String, String, int, String)>
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session app file.");
	//   51  105:aload_2         
	//   52  106:ldc2            #827 <String "Failed to flush to session app file.">
	//   53  109:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session app file.");
	//   54  112:aload_3         
	//   55  113:ldc2            #829 <String "Failed to close session app file.">
	//   56  116:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   57  119:return          
		s;
	//   58  120:astore_1        
		obj1 = obj;
	//   59  121:aload_2         
	//   60  122:astore_3        
		obj = ((Object) (s));
	//   61  123:aload_1         
	//   62  124:astore_2        
		s = ((String) (obj2));
	//   63  125:aload           4
	//   64  127:astore_1        
_L2:
		CommonUtils.flushOrLog(((java.io.Flushable) (s)), "Failed to flush to session app file.");
	//   65  128:aload_1         
	//   66  129:ldc2            #827 <String "Failed to flush to session app file.">
	//   67  132:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session app file.");
	//   68  135:aload_3         
	//   69  136:ldc2            #829 <String "Failed to close session app file.">
	//   70  139:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//   71  142:aload_2         
	//   72  143:athrow          
		obj;
	//   73  144:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  74  145:goto            128
	}

	private void writeSessionDevice(String s)
		throws Exception
	{
		Object obj;
		Context context;
		String s1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          12
		s1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          15
		context = null;
	//    4    6:aconst_null     
	//    5    7:astore          14
		Object obj1 = ((Object) (new ClsFileOutputStream(getFilesDir(), (new StringBuilder()).append(s).append("SessionDevice").toString())));
	//    6    9:new             #344 <Class ClsFileOutputStream>
	//    7   12:dup             
	//    8   13:aload_0         
	//    9   14:invokespecial   #292 <Method File getFilesDir()>
	//   10   17:new             #326 <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #327 <Method void StringBuilder()>
	//   13   24:aload_1         
	//   14   25:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:ldc1            #95  <String "SessionDevice">
	//   16   30:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   18   36:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   19   39:astore          13
		s = s1;
	//   20   41:aload           15
	//   21   43:astore_1        
		obj = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   22   44:aload           13
	//   23   46:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   49:astore          12
		s = ((String) (obj));
	//   25   51:aload           12
	//   26   53:astore_1        
		context = crashlyticsCore.getContext();
	//   27   54:aload_0         
	//   28   55:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   29   58:invokevirtual   #220 <Method Context CrashlyticsCore.getContext()>
	//   30   61:astore          14
		s = ((String) (obj));
	//   31   63:aload           12
	//   32   65:astore_1        
		Object obj2 = ((Object) (new StatFs(Environment.getDataDirectory().getPath())));
	//   33   66:new             #831 <Class StatFs>
	//   34   69:dup             
	//   35   70:invokestatic    #836 <Method File Environment.getDataDirectory()>
	//   36   73:invokevirtual   #839 <Method String File.getPath()>
	//   37   76:invokespecial   #840 <Method void StatFs(String)>
	//   38   79:astore          16
		s = ((String) (obj));
	//   39   81:aload           12
	//   40   83:astore_1        
		s1 = idManager.getDeviceUUID();
	//   41   84:aload_0         
	//   42   85:getfield        #195 <Field IdManager idManager>
	//   43   88:invokevirtual   #843 <Method String IdManager.getDeviceUUID()>
	//   44   91:astore          15
		s = ((String) (obj));
	//   45   93:aload           12
	//   46   95:astore_1        
		int i = CommonUtils.getCpuArchitectureInt();
	//   47   96:invokestatic    #846 <Method int CommonUtils.getCpuArchitectureInt()>
	//   48   99:istore_2        
		s = ((String) (obj));
	//   49  100:aload           12
	//   50  102:astore_1        
		int j = Runtime.getRuntime().availableProcessors();
	//   51  103:invokestatic    #852 <Method Runtime Runtime.getRuntime()>
	//   52  106:invokevirtual   #855 <Method int Runtime.availableProcessors()>
	//   53  109:istore_3        
		s = ((String) (obj));
	//   54  110:aload           12
	//   55  112:astore_1        
		long l = CommonUtils.getTotalRamInBytes();
	//   56  113:invokestatic    #858 <Method long CommonUtils.getTotalRamInBytes()>
	//   57  116:lstore          5
		s = ((String) (obj));
	//   58  118:aload           12
	//   59  120:astore_1        
		long l1 = ((StatFs) (obj2)).getBlockCount();
	//   60  121:aload           16
	//   61  123:invokevirtual   #861 <Method int StatFs.getBlockCount()>
	//   62  126:i2l             
	//   63  127:lstore          7
		s = ((String) (obj));
	//   64  129:aload           12
	//   65  131:astore_1        
		long l2 = ((StatFs) (obj2)).getBlockSize();
	//   66  132:aload           16
	//   67  134:invokevirtual   #864 <Method int StatFs.getBlockSize()>
	//   68  137:i2l             
	//   69  138:lstore          9
		s = ((String) (obj));
	//   70  140:aload           12
	//   71  142:astore_1        
		boolean flag = CommonUtils.isEmulator(context);
	//   72  143:aload           14
	//   73  145:invokestatic    #868 <Method boolean CommonUtils.isEmulator(Context)>
	//   74  148:istore          11
		s = ((String) (obj));
	//   75  150:aload           12
	//   76  152:astore_1        
		obj2 = ((Object) (idManager.getDeviceIdentifiers()));
	//   77  153:aload_0         
	//   78  154:getfield        #195 <Field IdManager idManager>
	//   79  157:invokevirtual   #871 <Method Map IdManager.getDeviceIdentifiers()>
	//   80  160:astore          16
		s = ((String) (obj));
	//   81  162:aload           12
	//   82  164:astore_1        
		int k = CommonUtils.getDeviceState(context);
	//   83  165:aload           14
	//   84  167:invokestatic    #875 <Method int CommonUtils.getDeviceState(Context)>
	//   85  170:istore          4
		s = ((String) (obj));
	//   86  172:aload           12
	//   87  174:astore_1        
		SessionProtobufHelper.writeSessionDevice(((CodedOutputStream) (obj)), s1, i, Build.MODEL, j, l, l1 * l2, flag, ((Map) (obj2)), k, Build.MANUFACTURER, Build.PRODUCT);
	//   88  175:aload           12
	//   89  177:aload           15
	//   90  179:iload_2         
	//   91  180:getstatic       #880 <Field String Build.MODEL>
	//   92  183:iload_3         
	//   93  184:lload           5
	//   94  186:lload           7
	//   95  188:lload           9
	//   96  190:lmul            
	//   97  191:iload           11
	//   98  193:aload           16
	//   99  195:iload           4
	//  100  197:getstatic       #883 <Field String Build.MANUFACTURER>
	//  101  200:getstatic       #886 <Field String Build.PRODUCT>
	//  102  203:invokestatic    #889 <Method void SessionProtobufHelper.writeSessionDevice(CodedOutputStream, String, int, String, int, long, long, boolean, Map, int, String, String)>
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush session device info.");
	//  103  206:aload           12
	//  104  208:ldc2            #891 <String "Failed to flush session device info.">
	//  105  211:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session device file.");
	//  106  214:aload           13
	//  107  216:ldc2            #893 <String "Failed to close session device file.">
	//  108  219:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  109  222:return          
		s;
	//  110  223:astore_1        
		obj1 = obj;
	//  111  224:aload           12
	//  112  226:astore          13
		obj = ((Object) (s));
	//  113  228:aload_1         
	//  114  229:astore          12
		s = ((String) (context));
	//  115  231:aload           14
	//  116  233:astore_1        
_L2:
		CommonUtils.flushOrLog(((java.io.Flushable) (s)), "Failed to flush session device info.");
	//  117  234:aload_1         
	//  118  235:ldc2            #891 <String "Failed to flush session device info.">
	//  119  238:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session device file.");
	//  120  241:aload           13
	//  121  243:ldc2            #893 <String "Failed to close session device file.">
	//  122  246:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//  123  249:aload           12
	//  124  251:athrow          
		obj;
	//  125  252:astore          12
		if(true) goto _L2; else goto _L1
	//  126  254:goto            234
_L1:
	}

	private void writeSessionEvent(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
		throws Exception
	{
		int j;
		int k;
		boolean flag1;
		long l;
		long l1;
		long l2;
		long l3;
		Context context;
		TrimmedThrowableData trimmedthrowabledata;
		Float float1;
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
		LinkedList linkedlist;
		StackTraceElement astacktraceelement[];
		String s1;
		String s2;
		trimmedthrowabledata = new TrimmedThrowableData(throwable, stackTraceTrimmingStrategy);
	//    0    0:new             #895 <Class TrimmedThrowableData>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_0         
	//    4    7:getfield        #246 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//    5   10:invokespecial   #898 <Method void TrimmedThrowableData(Throwable, StackTraceTrimmingStrategy)>
	//    6   13:astore          20
		context = crashlyticsCore.getContext();
	//    7   15:aload_0         
	//    8   16:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//    9   19:invokevirtual   #220 <Method Context CrashlyticsCore.getContext()>
	//   10   22:astore          19
		l = date.getTime() / 1000L;
	//   11   24:aload_2         
	//   12   25:invokevirtual   #689 <Method long Date.getTime()>
	//   13   28:ldc2w           #690 <Long 1000L>
	//   14   31:ldiv            
	//   15   32:lstore          11
		float1 = CommonUtils.getBatteryLevel(context);
	//   16   34:aload           19
	//   17   36:invokestatic    #902 <Method Float CommonUtils.getBatteryLevel(Context)>
	//   18   39:astore          21
		j = CommonUtils.getBatteryVelocity(context, devicePowerStateListener.isPowerConnected());
	//   19   41:aload           19
	//   20   43:aload_0         
	//   21   44:getfield        #234 <Field DevicePowerStateListener devicePowerStateListener>
	//   22   47:invokevirtual   #905 <Method boolean DevicePowerStateListener.isPowerConnected()>
	//   23   50:invokestatic    #909 <Method int CommonUtils.getBatteryVelocity(Context, boolean)>
	//   24   53:istore          8
		flag1 = CommonUtils.getProximitySensorEnabled(context);
	//   25   55:aload           19
	//   26   57:invokestatic    #912 <Method boolean CommonUtils.getProximitySensorEnabled(Context)>
	//   27   60:istore          10
		k = context.getResources().getConfiguration().orientation;
	//   28   62:aload           19
	//   29   64:invokevirtual   #918 <Method Resources Context.getResources()>
	//   30   67:invokevirtual   #924 <Method Configuration Resources.getConfiguration()>
	//   31   70:getfield        #929 <Field int Configuration.orientation>
	//   32   73:istore          9
		l1 = CommonUtils.getTotalRamInBytes();
	//   33   75:invokestatic    #858 <Method long CommonUtils.getTotalRamInBytes()>
	//   34   78:lstore          13
		l2 = CommonUtils.calculateFreeRamInBytes(context);
	//   35   80:aload           19
	//   36   82:invokestatic    #933 <Method long CommonUtils.calculateFreeRamInBytes(Context)>
	//   37   85:lstore          15
		l3 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
	//   38   87:invokestatic    #836 <Method File Environment.getDataDirectory()>
	//   39   90:invokevirtual   #839 <Method String File.getPath()>
	//   40   93:invokestatic    #937 <Method long CommonUtils.calculateUsedDiskSpaceInBytes(String)>
	//   41   96:lstore          17
		runningappprocessinfo = CommonUtils.getAppProcessInfo(context.getPackageName(), context);
	//   42   98:aload           19
	//   43  100:invokevirtual   #940 <Method String Context.getPackageName()>
	//   44  103:aload           19
	//   45  105:invokestatic    #944 <Method android.app.ActivityManager$RunningAppProcessInfo CommonUtils.getAppProcessInfo(String, Context)>
	//   46  108:astore          22
		linkedlist = new LinkedList();
	//   47  110:new             #946 <Class LinkedList>
	//   48  113:dup             
	//   49  114:invokespecial   #947 <Method void LinkedList()>
	//   50  117:astore          23
		astacktraceelement = trimmedthrowabledata.stacktrace;
	//   51  119:aload           20
	//   52  121:getfield        #951 <Field StackTraceElement[] TrimmedThrowableData.stacktrace>
	//   53  124:astore          24
		s1 = crashlyticsCore.getBuildId();
	//   54  126:aload_0         
	//   55  127:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   56  130:invokevirtual   #954 <Method String CrashlyticsCore.getBuildId()>
	//   57  133:astore          25
		s2 = idManager.getAppIdentifier();
	//   58  135:aload_0         
	//   59  136:getfield        #195 <Field IdManager idManager>
	//   60  139:invokevirtual   #798 <Method String IdManager.getAppIdentifier()>
	//   61  142:astore          26
		if(flag)
	//*  62  144:iload           6
	//*  63  146:ifeq            257
		{
			throwable = ((Throwable) (Thread.getAllStackTraces()));
	//   64  149:invokestatic    #957 <Method Map Thread.getAllStackTraces()>
	//   65  152:astore          4
			date = ((Date) (new Thread[((Map) (throwable)).size()]));
	//   66  154:aload           4
	//   67  156:invokeinterface #960 <Method int Map.size()>
	//   68  161:anewarray       Thread[]
	//   69  164:astore_2        
			int i = 0;
	//   70  165:iconst_0        
	//   71  166:istore          7
			Iterator iterator = ((Map) (throwable)).entrySet().iterator();
	//   72  168:aload           4
	//   73  170:invokeinterface #964 <Method Set Map.entrySet()>
	//   74  175:invokeinterface #968 <Method Iterator Set.iterator()>
	//   75  180:astore          27
			do
			{
				throwable = ((Throwable) (date));
	//   76  182:aload_2         
	//   77  183:astore          4
				if(!iterator.hasNext())
					break;
	//   78  185:aload           27
	//   79  187:invokeinterface #973 <Method boolean Iterator.hasNext()>
	//   80  192:ifeq            263
				throwable = ((Throwable) ((java.util.Map.Entry)iterator.next()));
	//   81  195:aload           27
	//   82  197:invokeinterface #977 <Method Object Iterator.next()>
	//   83  202:checkcast       #979 <Class java.util.Map$Entry>
	//   84  205:astore          4
				date[i] = ((/*<invalid signature>*/java.lang.Object) ((Thread)((java.util.Map.Entry) (throwable)).getKey()));
	//   85  207:aload_2         
	//   86  208:iload           7
	//   87  210:aload           4
	//   88  212:invokeinterface #982 <Method Object java.util.Map$Entry.getKey()>
	//   89  217:checkcast       #533 <Class Thread>
	//   90  220:aastore         
				((List) (linkedlist)).add(((Object) (stackTraceTrimmingStrategy.getTrimmedStackTrace((StackTraceElement[])((java.util.Map.Entry) (throwable)).getValue()))));
	//   91  221:aload           23
	//   92  223:aload_0         
	//   93  224:getfield        #246 <Field StackTraceTrimmingStrategy stackTraceTrimmingStrategy>
	//   94  227:aload           4
	//   95  229:invokeinterface #985 <Method Object java.util.Map$Entry.getValue()>
	//   96  234:checkcast       #986 <Class StackTraceElement[]>
	//   97  237:invokeinterface #990 <Method StackTraceElement[] StackTraceTrimmingStrategy.getTrimmedStackTrace(StackTraceElement[])>
	//   98  242:invokeinterface #993 <Method boolean List.add(Object)>
	//   99  247:pop             
				i++;
	//  100  248:iload           7
	//  101  250:iconst_1        
	//  102  251:iadd            
	//  103  252:istore          7
			} while(true);
	//  104  254:goto            182
		} else
		{
			throwable = ((Throwable) (new Thread[0]));
	//  105  257:iconst_0        
	//  106  258:anewarray       Thread[]
	//  107  261:astore          4
		}
		if(CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
	//  108  263:aload           19
	//  109  265:ldc2            #995 <String "com.crashlytics.CollectCustomKeys">
	//  110  268:iconst_1        
	//  111  269:invokestatic    #999 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//  112  272:ifne            327
_L1:
		date = ((Date) (new TreeMap()));
	//  113  275:new             #1001 <Class TreeMap>
	//  114  278:dup             
	//  115  279:invokespecial   #1002 <Method void TreeMap()>
	//  116  282:astore_2        
_L4:
		SessionProtobufHelper.writeSessionEvent(codedoutputstream, l, s, trimmedthrowabledata, thread, astacktraceelement, ((Thread []) (throwable)), ((List) (linkedlist)), ((Map) (date)), logFileManager, runningappprocessinfo, k, s2, s1, float1, j, flag1, l1 - l2, l3);
	//  117  283:aload_1         
	//  118  284:lload           11
	//  119  286:aload           5
	//  120  288:aload           20
	//  121  290:aload_3         
	//  122  291:aload           24
	//  123  293:aload           4
	//  124  295:aload           23
	//  125  297:aload_2         
	//  126  298:aload_0         
	//  127  299:getfield        #227 <Field LogFileManager logFileManager>
	//  128  302:aload           22
	//  129  304:iload           9
	//  130  306:aload           26
	//  131  308:aload           25
	//  132  310:aload           21
	//  133  312:iload           8
	//  134  314:iload           10
	//  135  316:lload           13
	//  136  318:lload           15
	//  137  320:lsub            
	//  138  321:lload           17
	//  139  323:invokestatic    #1005 <Method void SessionProtobufHelper.writeSessionEvent(CodedOutputStream, long, String, TrimmedThrowableData, Thread, StackTraceElement[], Thread[], List, Map, LogFileManager, android.app.ActivityManager$RunningAppProcessInfo, int, String, String, Float, int, boolean, long, long)>
		return;
	//  140  326:return          
_L2:
		Map map = crashlyticsCore.getAttributes();
	//  141  327:aload_0         
	//  142  328:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//  143  331:invokevirtual   #1008 <Method Map CrashlyticsCore.getAttributes()>
	//  144  334:astore          19
		date = ((Date) (map));
	//  145  336:aload           19
	//  146  338:astore_2        
		if(map != null)
	//* 147  339:aload           19
	//* 148  341:ifnull          283
		{
			date = ((Date) (map));
	//  149  344:aload           19
	//  150  346:astore_2        
			if(map.size() > 1)
	//* 151  347:aload           19
	//* 152  349:invokeinterface #960 <Method int Map.size()>
	//* 153  354:iconst_1        
	//* 154  355:icmple          283
				date = ((Date) (new TreeMap(map)));
	//  155  358:new             #1001 <Class TreeMap>
	//  156  361:dup             
	//  157  362:aload           19
	//  158  364:invokespecial   #1011 <Method void TreeMap(Map)>
	//  159  367:astore_2        
		}
		if(true) goto _L4; else goto _L3
	//  160  368:goto            283
_L3:
	}

	private void writeSessionOS(String s)
		throws Exception
	{
		Object obj;
		Object obj2;
		Object obj3;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		obj3 = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		obj2 = null;
	//    4    5:aconst_null     
	//    5    6:astore          4
		Object obj1 = ((Object) (new ClsFileOutputStream(getFilesDir(), (new StringBuilder()).append(s).append("SessionOS").toString())));
	//    6    8:new             #344 <Class ClsFileOutputStream>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #292 <Method File getFilesDir()>
	//   10   16:new             #326 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #327 <Method void StringBuilder()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:ldc1            #112 <String "SessionOS">
	//   16   29:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   19   38:astore_3        
		s = ((String) (obj3));
	//   20   39:aload           5
	//   21   41:astore_1        
		obj = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   22   42:aload_3         
	//   23   43:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   46:astore_2        
		s = ((String) (obj));
	//   25   47:aload_2         
	//   26   48:astore_1        
		SessionProtobufHelper.writeSessionOS(((CodedOutputStream) (obj)), CommonUtils.isRooted(crashlyticsCore.getContext()));
	//   27   49:aload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #197 <Field CrashlyticsCore crashlyticsCore>
	//   30   54:invokevirtual   #220 <Method Context CrashlyticsCore.getContext()>
	//   31   57:invokestatic    #1014 <Method boolean CommonUtils.isRooted(Context)>
	//   32   60:invokestatic    #1017 <Method void SessionProtobufHelper.writeSessionOS(CodedOutputStream, boolean)>
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session OS file.");
	//   33   63:aload_2         
	//   34   64:ldc2            #1019 <String "Failed to flush to session OS file.">
	//   35   67:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
	//   36   70:aload_3         
	//   37   71:ldc2            #1021 <String "Failed to close session OS file.">
	//   38   74:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   39   77:return          
		obj1;
	//   40   78:astore_3        
		s = ((String) (obj2));
	//   41   79:aload           4
	//   42   81:astore_1        
_L2:
		CommonUtils.flushOrLog(((java.io.Flushable) (s)), "Failed to flush to session OS file.");
	//   43   82:aload_1         
	//   44   83:ldc2            #1019 <String "Failed to flush to session OS file.">
	//   45   86:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session OS file.");
	//   46   89:aload_2         
	//   47   90:ldc2            #1021 <String "Failed to close session OS file.">
	//   48   93:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj1;
	//   49   96:aload_3         
	//   50   97:athrow          
		Exception exception;
		exception;
	//   51   98:astore          4
		obj = obj1;
	//   52  100:aload_3         
	//   53  101:astore_2        
		obj1 = ((Object) (exception));
	//   54  102:aload           4
	//   55  104:astore_3        
		if(true) goto _L2; else goto _L1
	//   56  105:goto            82
_L1:
	}

	private void writeSessionPartsToSessionFile(File file, String s, int i)
	{
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Collecting session parts for ID ").append(s).toString());
	//    0    0:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//    1    3:ldc2            #312 <String "CrashlyticsCore">
	//    2    6:new             #326 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #327 <Method void StringBuilder()>
	//    5   13:ldc2            #1023 <String "Collecting session parts for ID ">
	//    6   16:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    7   19:aload_2         
	//    8   20:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   10   26:invokeinterface #320 <Method void Logger.d(String, String)>
		File afile[] = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionCrash").toString()))));
	//   11   31:aload_0         
	//   12   32:new             #39  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   13   35:dup             
	//   14   36:new             #326 <Class StringBuilder>
	//   15   39:dup             
	//   16   40:invokespecial   #327 <Method void StringBuilder()>
	//   17   43:aload_2         
	//   18   44:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   19   47:ldc1            #101 <String "SessionCrash">
	//   20   49:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   21   52:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   22   55:invokespecial   #580 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   23   58:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//   24   61:astore          6
		boolean flag;
		boolean flag1;
		File afile1[];
		if(afile != null && afile.length > 0)
	//*  25   63:aload           6
	//*  26   65:ifnull          273
	//*  27   68:aload           6
	//*  28   70:arraylength     
	//*  29   71:ifle            273
			flag = true;
	//   30   74:iconst_1        
	//   31   75:istore          4
		else
	//*  32   77:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//*  33   80:ldc2            #312 <String "CrashlyticsCore">
	//*  34   83:getstatic       #456 <Field Locale Locale.US>
	//*  35   86:ldc2            #1025 <String "Session %s has fatal exception: %s">
	//*  36   89:iconst_2        
	//*  37   90:anewarray       Object[]
	//*  38   93:dup             
	//*  39   94:iconst_0        
	//*  40   95:aload_2         
	//*  41   96:aastore         
	//*  42   97:dup             
	//*  43   98:iconst_1        
	//*  44   99:iload           4
	//*  45  101:invokestatic    #1030 <Method Boolean Boolean.valueOf(boolean)>
	//*  46  104:aastore         
	//*  47  105:invokestatic    #476 <Method String String.format(Locale, String, Object[])>
	//*  48  108:invokeinterface #320 <Method void Logger.d(String, String)>
	//*  49  113:aload_0         
	//*  50  114:new             #39  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//*  51  117:dup             
	//*  52  118:new             #326 <Class StringBuilder>
	//*  53  121:dup             
	//*  54  122:invokespecial   #327 <Method void StringBuilder()>
	//*  55  125:aload_2         
	//*  56  126:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//*  57  129:ldc1            #109 <String "SessionEvent">
	//*  58  131:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//*  59  134:invokevirtual   #336 <Method String StringBuilder.toString()>
	//*  60  137:invokespecial   #580 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//*  61  140:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//*  62  143:astore          7
	//*  63  145:aload           7
	//*  64  147:ifnull          279
	//*  65  150:aload           7
	//*  66  152:arraylength     
	//*  67  153:ifle            279
	//*  68  156:iconst_1        
	//*  69  157:istore          5
	//*  70  159:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//*  71  162:ldc2            #312 <String "CrashlyticsCore">
	//*  72  165:getstatic       #456 <Field Locale Locale.US>
	//*  73  168:ldc2            #1032 <String "Session %s has non-fatal exceptions: %s">
	//*  74  171:iconst_2        
	//*  75  172:anewarray       Object[]
	//*  76  175:dup             
	//*  77  176:iconst_0        
	//*  78  177:aload_2         
	//*  79  178:aastore         
	//*  80  179:dup             
	//*  81  180:iconst_1        
	//*  82  181:iload           5
	//*  83  183:invokestatic    #1030 <Method Boolean Boolean.valueOf(boolean)>
	//*  84  186:aastore         
	//*  85  187:invokestatic    #476 <Method String String.format(Locale, String, Object[])>
	//*  86  190:invokeinterface #320 <Method void Logger.d(String, String)>
	//*  87  195:iload           4
	//*  88  197:ifne            205
	//*  89  200:iload           5
	//*  90  202:ifeq            291
	//*  91  205:aload_0         
	//*  92  206:aload_2         
	//*  93  207:aload           7
	//*  94  209:iload_3         
	//*  95  210:invokespecial   #1034 <Method File[] getTrimmedNonFatalFiles(String, File[], int)>
	//*  96  213:astore          7
	//*  97  215:iload           4
	//*  98  217:ifeq            285
	//*  99  220:aload           6
	//* 100  222:iconst_0        
	//* 101  223:aaload          
	//* 102  224:astore          6
	//* 103  226:aload_0         
	//* 104  227:aload_1         
	//* 105  228:aload_2         
	//* 106  229:aload           7
	//* 107  231:aload           6
	//* 108  233:invokespecial   #1036 <Method void synthesizeSessionFile(File, String, File[], File)>
	//* 109  236:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//* 110  239:ldc2            #312 <String "CrashlyticsCore">
	//* 111  242:new             #326 <Class StringBuilder>
	//* 112  245:dup             
	//* 113  246:invokespecial   #327 <Method void StringBuilder()>
	//* 114  249:ldc2            #1038 <String "Removing session part files for ID ">
	//* 115  252:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//* 116  255:aload_2         
	//* 117  256:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//* 118  259:invokevirtual   #336 <Method String StringBuilder.toString()>
	//* 119  262:invokeinterface #320 <Method void Logger.d(String, String)>
	//* 120  267:aload_0         
	//* 121  268:aload_2         
	//* 122  269:invokespecial   #1040 <Method void deleteSessionPartFilesFor(String)>
	//* 123  272:return          
			flag = false;
	//  124  273:iconst_0        
	//  125  274:istore          4
		Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
			s, Boolean.valueOf(flag)
		}));
		afile1 = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()))));
		if(afile1 != null && afile1.length > 0)
			flag1 = true;
		else
	//* 126  276:goto            77
			flag1 = false;
	//  127  279:iconst_0        
	//  128  280:istore          5
		Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
			s, Boolean.valueOf(flag1)
		}));
		if(flag || flag1)
		{
			afile1 = getTrimmedNonFatalFiles(s, afile1, i);
			File file1;
			if(flag)
				file1 = afile[0];
			else
	//* 129  282:goto            159
				file1 = null;
	//  130  285:aconst_null     
	//  131  286:astore          6
			synthesizeSessionFile(file, s, afile1, file1);
		} else
	//* 132  288:goto            226
		{
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("No events present for session ID ").append(s).toString());
	//  133  291:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//  134  294:ldc2            #312 <String "CrashlyticsCore">
	//  135  297:new             #326 <Class StringBuilder>
	//  136  300:dup             
	//  137  301:invokespecial   #327 <Method void StringBuilder()>
	//  138  304:ldc2            #1042 <String "No events present for session ID ">
	//  139  307:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//  140  310:aload_2         
	//  141  311:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//  142  314:invokevirtual   #336 <Method String StringBuilder.toString()>
	//  143  317:invokeinterface #320 <Method void Logger.d(String, String)>
		}
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Removing session part files for ID ").append(s).toString());
		deleteSessionPartFilesFor(s);
	//* 144  322:goto            236
	}

	private void writeSessionUser(String s)
		throws Exception
	{
		CodedOutputStream codedoutputstream;
		CodedOutputStream codedoutputstream1;
		Object obj1;
		codedoutputstream1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          6
		codedoutputstream = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		Object obj = ((Object) (new ClsFileOutputStream(getFilesDir(), (new StringBuilder()).append(s).append("SessionUser").toString())));
	//    6    8:new             #344 <Class ClsFileOutputStream>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #292 <Method File getFilesDir()>
	//   10   16:new             #326 <Class StringBuilder>
	//   11   19:dup             
	//   12   20:invokespecial   #327 <Method void StringBuilder()>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:ldc1            #115 <String "SessionUser">
	//   16   29:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   32:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #486 <Method void ClsFileOutputStream(File, String)>
	//   19   38:astore          4
		codedoutputstream = ((CodedOutputStream) (obj1));
	//   20   40:aload           6
	//   21   42:astore_3        
		codedoutputstream1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   22   43:aload           4
	//   23   45:invokestatic    #490 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   48:astore          5
		codedoutputstream = codedoutputstream1;
	//   25   50:aload           5
	//   26   52:astore_3        
		s = ((String) (getUserMetaData(s)));
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokespecial   #1044 <Method UserMetaData getUserMetaData(String)>
	//   30   58:astore_1        
		codedoutputstream = codedoutputstream1;
	//   31   59:aload           5
	//   32   61:astore_3        
		boolean flag = ((UserMetaData) (s)).isEmpty();
	//   33   62:aload_1         
	//   34   63:invokevirtual   #1047 <Method boolean UserMetaData.isEmpty()>
	//   35   66:istore_2        
		if(flag)
	//*  36   67:iload_2         
	//*  37   68:ifeq            88
		{
			CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream1)), "Failed to flush session user file.");
	//   38   71:aload           5
	//   39   73:ldc2            #1049 <String "Failed to flush session user file.">
	//   40   76:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
			CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session user file.");
	//   41   79:aload           4
	//   42   81:ldc2            #1051 <String "Failed to close session user file.">
	//   43   84:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
			return;
	//   44   87:return          
		}
		codedoutputstream = codedoutputstream1;
	//   45   88:aload           5
	//   46   90:astore_3        
		SessionProtobufHelper.writeSessionUser(codedoutputstream1, ((UserMetaData) (s)).id, ((UserMetaData) (s)).name, ((UserMetaData) (s)).email);
	//   47   91:aload           5
	//   48   93:aload_1         
	//   49   94:getfield        #1054 <Field String UserMetaData.id>
	//   50   97:aload_1         
	//   51   98:getfield        #1055 <Field String UserMetaData.name>
	//   52  101:aload_1         
	//   53  102:getfield        #1058 <Field String UserMetaData.email>
	//   54  105:invokestatic    #1061 <Method void SessionProtobufHelper.writeSessionUser(CodedOutputStream, String, String, String)>
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream1)), "Failed to flush session user file.");
	//   55  108:aload           5
	//   56  110:ldc2            #1049 <String "Failed to flush session user file.">
	//   57  113:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session user file.");
	//   58  116:aload           4
	//   59  118:ldc2            #1051 <String "Failed to close session user file.">
	//   60  121:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   61  124:return          
		obj;
	//   62  125:astore          4
		s = ((String) (codedoutputstream1));
	//   63  127:aload           5
	//   64  129:astore_1        
_L2:
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush session user file.");
	//   65  130:aload_3         
	//   66  131:ldc2            #1049 <String "Failed to flush session user file.">
	//   67  134:invokestatic    #444 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close session user file.");
	//   68  137:aload_1         
	//   69  138:ldc2            #1051 <String "Failed to close session user file.">
	//   70  141:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//   71  144:aload           4
	//   72  146:athrow          
		Exception exception;
		exception;
	//   73  147:astore          5
		s = ((String) (obj));
	//   74  149:aload           4
	//   75  151:astore_1        
		obj = ((Object) (exception));
	//   76  152:aload           5
	//   77  154:astore          4
		if(true) goto _L2; else goto _L1
	//   78  156:goto            130
_L1:
	}

	private static void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
		throws IOException
	{
		Object obj;
		if(!file.exists())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #729 <Method boolean File.exists()>
	//*   2    4:ifne            43
		{
			Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Tried to include a file that doesn't exist: ").append(file.getName()).toString(), ((Throwable) (null)));
	//    3    7:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//    4   10:ldc2            #312 <String "CrashlyticsCore">
	//    5   13:new             #326 <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #327 <Method void StringBuilder()>
	//    8   20:ldc2            #1063 <String "Tried to include a file that doesn't exist: ">
	//    9   23:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   10   26:aload_1         
	//   11   27:invokevirtual   #564 <Method String File.getName()>
	//   12   30:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   13   33:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   14   36:aconst_null     
	//   15   37:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
			return;
	//   16   42:return          
		}
		obj = null;
	//   17   43:aconst_null     
	//   18   44:astore_2        
		FileInputStream fileinputstream = new FileInputStream(file);
	//   19   45:new             #1065 <Class FileInputStream>
	//   20   48:dup             
	//   21   49:aload_1         
	//   22   50:invokespecial   #1066 <Method void FileInputStream(File)>
	//   23   53:astore_3        
		copyToCodedOutputStream(((InputStream) (fileinputstream)), codedoutputstream, (int)file.length());
	//   24   54:aload_3         
	//   25   55:aload_0         
	//   26   56:aload_1         
	//   27   57:invokevirtual   #1069 <Method long File.length()>
	//   28   60:l2i             
	//   29   61:invokestatic    #1071 <Method void copyToCodedOutputStream(InputStream, CodedOutputStream, int)>
		CommonUtils.closeOrLog(((java.io.Closeable) (fileinputstream)), "Failed to close file input stream.");
	//   30   64:aload_3         
	//   31   65:ldc2            #1073 <String "Failed to close file input stream.">
	//   32   68:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   33   71:return          
		file;
	//   34   72:astore_1        
		codedoutputstream = ((CodedOutputStream) (obj));
	//   35   73:aload_2         
	//   36   74:astore_0        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (codedoutputstream)), "Failed to close file input stream.");
	//   37   75:aload_0         
	//   38   76:ldc2            #1073 <String "Failed to close file input stream.">
	//   39   79:invokestatic    #450 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//   40   82:aload_1         
	//   41   83:athrow          
		file;
	//   42   84:astore_1        
		codedoutputstream = ((CodedOutputStream) (fileinputstream));
	//   43   85:aload_3         
	//   44   86:astore_0        
		if(true) goto _L2; else goto _L1
	//   45   87:goto            75
_L1:
	}

	void cacheKeyData(final Map keyData)
	{
		executorServiceWrapper.executeAsync(new Callable() {

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
			//    1    1:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    2    4:invokestatic    #38  <Method String CrashlyticsUncaughtExceptionHandler.access$500(CrashlyticsUncaughtExceptionHandler)>
			//    3    7:astore_1        
				(new MetaDataStore(getFilesDir())).writeKeyData(s, keyData);
			//    4    8:new             #40  <Class MetaDataStore>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    8   16:invokestatic    #44  <Method File CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler)>
			//    9   19:invokespecial   #47  <Method void MetaDataStore(File)>
			//   10   22:aload_1         
			//   11   23:aload_0         
			//   12   24:getfield        #22  <Field Map val$keyData>
			//   13   27:invokevirtual   #51  <Method void MetaDataStore.writeKeyData(String, Map)>
				return null;
			//   14   30:aconst_null     
			//   15   31:areturn         
			}

			final CrashlyticsUncaughtExceptionHandler this$0;
			final Map val$keyData;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
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
	//    1    1:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #34  <Class CrashlyticsUncaughtExceptionHandler$9>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1077 <Method void CrashlyticsUncaughtExceptionHandler$9(CrashlyticsUncaughtExceptionHandler, Map)>
	//    7   13:invokevirtual   #1080 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//    8   16:pop             
	//    9   17:return          
	}

	void cacheUserData(final String userId, final String userName, final String userEmail)
	{
		executorServiceWrapper.executeAsync(new Callable() {

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
			//    1    1:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    2    4:invokestatic    #44  <Method String CrashlyticsUncaughtExceptionHandler.access$500(CrashlyticsUncaughtExceptionHandler)>
			//    3    7:astore_1        
				(new MetaDataStore(getFilesDir())).writeUserData(s, new UserMetaData(userId, userName, userEmail));
			//    4    8:new             #46  <Class MetaDataStore>
			//    5   11:dup             
			//    6   12:aload_0         
			//    7   13:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    8   16:invokestatic    #50  <Method File CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler)>
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

			final CrashlyticsUncaughtExceptionHandler this$0;
			final String val$userEmail;
			final String val$userId;
			final String val$userName;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
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
	//    1    1:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #32  <Class CrashlyticsUncaughtExceptionHandler$8>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #1085 <Method void CrashlyticsUncaughtExceptionHandler$8(CrashlyticsUncaughtExceptionHandler, String, String, String)>
	//    9   15:invokevirtual   #1080 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//   10   18:pop             
	//   11   19:return          
	}

	void cleanInvalidTempFiles()
	{
		executorServiceWrapper.executeAsync(new Runnable() {

			public void run()
			{
				doCleanInvalidTempFiles(listFilesMatching(((FilenameFilter) (new InvalidPartFileFilter()))));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    4    8:new             #23  <Class CrashlyticsUncaughtExceptionHandler$InvalidPartFileFilter>
			//    5   11:dup             
			//    6   12:invokespecial   #24  <Method void CrashlyticsUncaughtExceptionHandler$InvalidPartFileFilter()>
			//    7   15:invokestatic    #28  <Method File[] CrashlyticsUncaughtExceptionHandler.access$1000(CrashlyticsUncaughtExceptionHandler, FilenameFilter)>
			//    8   18:invokevirtual   #32  <Method void CrashlyticsUncaughtExceptionHandler.doCleanInvalidTempFiles(File[])>
			//    9   21:return          
			}

			final CrashlyticsUncaughtExceptionHandler this$0;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #14  <Class CrashlyticsUncaughtExceptionHandler$12>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1088 <Method void CrashlyticsUncaughtExceptionHandler$12(CrashlyticsUncaughtExceptionHandler)>
	//    6   12:invokevirtual   #677 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Runnable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void doCleanInvalidTempFiles(File afile[])
	{
		final HashSet invalidSessionIds = new HashSet();
	//    0    0:new             #736 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #737 <Method void HashSet()>
	//    3    7:astore          4
		int k = afile.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore_3        
		for(int i = 0; i < k; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_2        
	//*   9   14:iload_2         
	//*  10   15:iload_3         
	//*  11   16:icmpge          76
		{
			File file = afile[i];
	//   12   19:aload_1         
	//   13   20:iload_2         
	//   14   21:aaload          
	//   15   22:astore          5
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Found invalid session part file: ").append(((Object) (file))).toString());
	//   16   24:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   17   27:ldc2            #312 <String "CrashlyticsCore">
	//   18   30:new             #326 <Class StringBuilder>
	//   19   33:dup             
	//   20   34:invokespecial   #327 <Method void StringBuilder()>
	//   21   37:ldc2            #1092 <String "Found invalid session part file: ">
	//   22   40:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:aload           5
	//   24   45:invokevirtual   #529 <Method StringBuilder StringBuilder.append(Object)>
	//   25   48:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   26   51:invokeinterface #320 <Method void Logger.d(String, String)>
			((Set) (invalidSessionIds)).add(((Object) (getSessionIdFromSessionFile(file))));
	//   27   56:aload           4
	//   28   58:aload           5
	//   29   60:invokestatic    #324 <Method String getSessionIdFromSessionFile(File)>
	//   30   63:invokeinterface #743 <Method boolean Set.add(Object)>
	//   31   68:pop             
		}

	//   32   69:iload_2         
	//   33   70:iconst_1        
	//   34   71:iadd            
	//   35   72:istore_2        
	//*  36   73:goto            14
		if(((Set) (invalidSessionIds)).isEmpty())
	//*  37   76:aload           4
	//*  38   78:invokeinterface #1093 <Method boolean Set.isEmpty()>
	//*  39   83:ifeq            87
			return;
	//   40   86:return          
		afile = ((File []) (getInvalidFilesDir()));
	//   41   87:aload_0         
	//   42   88:invokevirtual   #726 <Method File getInvalidFilesDir()>
	//   43   91:astore_1        
		if(!((File) (afile)).exists())
	//*  44   92:aload_1         
	//*  45   93:invokevirtual   #729 <Method boolean File.exists()>
	//*  46   96:ifne            104
			((File) (afile)).mkdir();
	//   47   99:aload_1         
	//   48  100:invokevirtual   #1096 <Method boolean File.mkdir()>
	//   49  103:pop             
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

			final CrashlyticsUncaughtExceptionHandler this$0;
			final Set val$invalidSessionIds;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashlyticsUncaughtExceptionHandler this$0>
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
	//   50  104:aload_0         
	//   51  105:new             #16  <Class CrashlyticsUncaughtExceptionHandler$13>
	//   52  108:dup             
	//   53  109:aload_0         
	//   54  110:aload           4
	//   55  112:invokespecial   #1099 <Method void CrashlyticsUncaughtExceptionHandler$13(CrashlyticsUncaughtExceptionHandler, Set)>
	//   56  115:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//   57  118:astore          4
		k = afile1.length;
	//   58  120:aload           4
	//   59  122:arraylength     
	//   60  123:istore_3        
		for(int j = 0; j < k; j++)
	//*  61  124:iconst_0        
	//*  62  125:istore_2        
	//*  63  126:iload_2         
	//*  64  127:iload_3         
	//*  65  128:icmpge          235
		{
			File file1 = afile1[j];
	//   66  131:aload           4
	//   67  133:iload_2         
	//   68  134:aaload          
	//   69  135:astore          5
			Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Moving session file: ").append(((Object) (file1))).toString());
	//   70  137:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   71  140:ldc2            #312 <String "CrashlyticsCore">
	//   72  143:new             #326 <Class StringBuilder>
	//   73  146:dup             
	//   74  147:invokespecial   #327 <Method void StringBuilder()>
	//   75  150:ldc2            #1101 <String "Moving session file: ">
	//   76  153:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   77  156:aload           5
	//   78  158:invokevirtual   #529 <Method StringBuilder StringBuilder.append(Object)>
	//   79  161:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   80  164:invokeinterface #320 <Method void Logger.d(String, String)>
			if(!file1.renameTo(new File(((File) (afile)), file1.getName())))
	//*  81  169:aload           5
	//*  82  171:new             #375 <Class File>
	//*  83  174:dup             
	//*  84  175:aload_1         
	//*  85  176:aload           5
	//*  86  178:invokevirtual   #564 <Method String File.getName()>
	//*  87  181:invokespecial   #1102 <Method void File(File, String)>
	//*  88  184:invokevirtual   #1106 <Method boolean File.renameTo(File)>
	//*  89  187:ifne            228
			{
				Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Could not move session file. Deleting ").append(((Object) (file1))).toString());
	//   90  190:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   91  193:ldc2            #312 <String "CrashlyticsCore">
	//   92  196:new             #326 <Class StringBuilder>
	//   93  199:dup             
	//   94  200:invokespecial   #327 <Method void StringBuilder()>
	//   95  203:ldc2            #1108 <String "Could not move session file. Deleting ">
	//   96  206:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   97  209:aload           5
	//   98  211:invokevirtual   #529 <Method StringBuilder StringBuilder.append(Object)>
	//   99  214:invokevirtual   #336 <Method String StringBuilder.toString()>
	//  100  217:invokeinterface #320 <Method void Logger.d(String, String)>
				file1.delete();
	//  101  222:aload           5
	//  102  224:invokevirtual   #379 <Method boolean File.delete()>
	//  103  227:pop             
			}
		}

	//  104  228:iload_2         
	//  105  229:iconst_1        
	//  106  230:iadd            
	//  107  231:istore_2        
	//* 108  232:goto            126
		trimInvalidSessionFiles();
	//  109  235:aload_0         
	//  110  236:invokespecial   #1110 <Method void trimInvalidSessionFiles()>
	//  111  239:return          
	}

	void doCloseSessions()
		throws Exception
	{
		doCloseSessions(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #302 <Method void doCloseSessions(boolean)>
	//    3    5:return          
	}

	boolean finalizeSessions()
	{
		return ((Boolean)executorServiceWrapper.executeSyncLoggingException(new Callable() {

			public Boolean call()
				throws Exception
			{
				if(isHandlingException.get())
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
					doCloseSessions(true);
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
)).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #12  <Class CrashlyticsUncaughtExceptionHandler$11>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1112 <Method void CrashlyticsUncaughtExceptionHandler$11(CrashlyticsUncaughtExceptionHandler)>
	//    6   12:invokevirtual   #1116 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    7   15:checkcast       #1027 <Class Boolean>
	//    8   18:invokevirtual   #1119 <Method boolean Boolean.booleanValue()>
	//    9   21:ireturn         
	}

	File getInvalidFilesDir()
	{
		return new File(getFilesDir(), "invalidClsFiles");
	//    0    0:new             #375 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #292 <Method File getFilesDir()>
	//    4    8:ldc1            #69  <String "invalidClsFiles">
	//    5   10:invokespecial   #1102 <Method void File(File, String)>
	//    6   13:areturn         
	}

	boolean hasOpenSession()
	{
		return listSessionBeginFiles().length > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #634 <Method File[] listSessionBeginFiles()>
	//    2    4:arraylength     
	//    3    5:ifle            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	boolean isHandlingException()
	{
		return isHandlingException.get();
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field AtomicBoolean isHandlingException>
	//    2    4:invokevirtual   #1123 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	File[] listSessionBeginFiles()
	{
		return listFilesMatching(((FilenameFilter) (new FileNameContainsFilter("BeginSession"))));
	//    0    0:aload_0         
	//    1    1:new             #39  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//    2    4:dup             
	//    3    5:ldc1            #92  <String "BeginSession">
	//    4    7:invokespecial   #580 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//    5   10:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//    6   13:areturn         
	}

	void openSession()
	{
		executorServiceWrapper.executeAsync(new Callable() {

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
			//    1    1:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    2    4:invokestatic    #32  <Method void CrashlyticsUncaughtExceptionHandler.access$700(CrashlyticsUncaughtExceptionHandler)>
				return null;
			//    3    7:aconst_null     
			//    4    8:areturn         
			}

			final CrashlyticsUncaughtExceptionHandler this$0;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #10  <Class CrashlyticsUncaughtExceptionHandler$10>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1125 <Method void CrashlyticsUncaughtExceptionHandler$10(CrashlyticsUncaughtExceptionHandler)>
	//    6   12:invokevirtual   #1080 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void trimSessionFiles()
	{
		Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, 4, SMALLEST_FILE_NAME_FIRST);
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method File getFilesDir()>
	//    2    4:getstatic       #144 <Field FilenameFilter SESSION_FILE_FILTER>
	//    3    7:iconst_4        
	//    4    8:getstatic       #150 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//    5   11:invokestatic    #766 <Method void Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//    6   14:return          
	}

	public void uncaughtException(final Thread thread, final Throwable ex)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		isHandlingException.set(true);
	//    2    2:aload_0         
	//    3    3:getfield        #214 <Field AtomicBoolean isHandlingException>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #1130 <Method void AtomicBoolean.set(boolean)>
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Crashlytics is handling uncaught exception \"").append(((Object) (ex))).append("\" from thread ").append(thread.getName()).toString());
	//    6   10:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//    7   13:ldc2            #312 <String "CrashlyticsCore">
	//    8   16:new             #326 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #327 <Method void StringBuilder()>
	//   11   23:ldc2            #1132 <String "Crashlytics is handling uncaught exception \"">
	//   12   26:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #529 <Method StringBuilder StringBuilder.append(Object)>
	//   15   33:ldc2            #531 <String "\" from thread ">
	//   16   36:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:aload_1         
	//   18   40:invokevirtual   #534 <Method String Thread.getName()>
	//   19   43:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   20   46:invokevirtual   #336 <Method String StringBuilder.toString()>
	//   21   49:invokeinterface #320 <Method void Logger.d(String, String)>
		devicePowerStateListener.dispose();
	//   22   54:aload_0         
	//   23   55:getfield        #234 <Field DevicePowerStateListener devicePowerStateListener>
	//   24   58:invokevirtual   #1135 <Method void DevicePowerStateListener.dispose()>
		final Date now = new Date();
	//   25   61:new             #406 <Class Date>
	//   26   64:dup             
	//   27   65:invokespecial   #407 <Method void Date()>
	//   28   68:astore_3        
		executorServiceWrapper.executeSyncLoggingException(new Callable() {

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
				handleUncaughtException(now, thread, ex);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field Date val$now>
			//    4    8:aload_0         
			//    5    9:getfield        #28  <Field Thread val$thread>
			//    6   12:aload_0         
			//    7   13:getfield        #30  <Field Throwable val$ex>
			//    8   16:invokestatic    #45  <Method void CrashlyticsUncaughtExceptionHandler.access$100(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
				return null;
			//    9   19:aconst_null     
			//   10   20:areturn         
			}

			final CrashlyticsUncaughtExceptionHandler this$0;
			final Throwable val$ex;
			final Date val$now;
			final Thread val$thread;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field CrashlyticsUncaughtExceptionHandler this$0>
				now = date;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field Date val$now>
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
	//   29   69:aload_0         
	//   30   70:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//   31   73:new             #26  <Class CrashlyticsUncaughtExceptionHandler$5>
	//   32   76:dup             
	//   33   77:aload_0         
	//   34   78:aload_3         
	//   35   79:aload_1         
	//   36   80:aload_2         
	//   37   81:invokespecial   #1137 <Method void CrashlyticsUncaughtExceptionHandler$5(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
	//   38   84:invokevirtual   #1116 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//   39   87:pop             
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   40   88:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   41   91:ldc2            #312 <String "CrashlyticsCore">
	//   42   94:ldc2            #1139 <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   43   97:invokeinterface #320 <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, ex);
	//   44  102:aload_0         
	//   45  103:getfield        #191 <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   46  106:aload_1         
	//   47  107:aload_2         
	//   48  108:invokeinterface #1141 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//   49  113:aload_0         
	//   50  114:getfield        #214 <Field AtomicBoolean isHandlingException>
	//   51  117:iconst_0        
	//   52  118:invokevirtual   #1130 <Method void AtomicBoolean.set(boolean)>
_L1:
		this;
	//   53  121:aload_0         
		JVM INSTR monitorexit ;
	//   54  122:monitorexit     
		return;
	//   55  123:return          
		Object obj;
		obj;
	//   56  124:astore_3        
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
	//   57  125:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   58  128:ldc2            #312 <String "CrashlyticsCore">
	//   59  131:ldc2            #1143 <String "An error occurred in the uncaught exception handler">
	//   60  134:aload_3         
	//   61  135:invokeinterface #353 <Method void Logger.e(String, String, Throwable)>
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   62  140:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   63  143:ldc2            #312 <String "CrashlyticsCore">
	//   64  146:ldc2            #1139 <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   65  149:invokeinterface #320 <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, ex);
	//   66  154:aload_0         
	//   67  155:getfield        #191 <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   68  158:aload_1         
	//   69  159:aload_2         
	//   70  160:invokeinterface #1141 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//   71  165:aload_0         
	//   72  166:getfield        #214 <Field AtomicBoolean isHandlingException>
	//   73  169:iconst_0        
	//   74  170:invokevirtual   #1130 <Method void AtomicBoolean.set(boolean)>
		  goto _L1
	//*  75  173:goto            121
		thread;
	//   76  176:astore_1        
	//*  77  177:aload_0         
		throw thread;
	//   78  178:monitorexit     
	//   79  179:aload_1         
	//   80  180:athrow          
		obj;
	//   81  181:astore_3        
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   82  182:invokestatic    #310 <Method Logger Fabric.getLogger()>
	//   83  185:ldc2            #312 <String "CrashlyticsCore">
	//   84  188:ldc2            #1139 <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   85  191:invokeinterface #320 <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, ex);
	//   86  196:aload_0         
	//   87  197:getfield        #191 <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   88  200:aload_1         
	//   89  201:aload_2         
	//   90  202:invokeinterface #1141 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//   91  207:aload_0         
	//   92  208:getfield        #214 <Field AtomicBoolean isHandlingException>
	//   93  211:iconst_0        
	//   94  212:invokevirtual   #1130 <Method void AtomicBoolean.set(boolean)>
		throw obj;
	//   95  215:aload_3         
	//   96  216:athrow          
	}

	void writeExternalCrashEvent(final SessionEventData crashEventData)
	{
		executorServiceWrapper.executeAsync(new Callable() {

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
				if(!isHandlingException.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//*   2    4:invokestatic    #38  <Method AtomicBoolean CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler)>
			//*   3    7:invokevirtual   #44  <Method boolean AtomicBoolean.get()>
			//*   4   10:ifne            24
					doWriteExternalCrashEvent(crashEventData);
			//    5   13:aload_0         
			//    6   14:getfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    7   17:aload_0         
			//    8   18:getfield        #22  <Field SessionEventData val$crashEventData>
			//    9   21:invokestatic    #47  <Method void CrashlyticsUncaughtExceptionHandler.access$1100(CrashlyticsUncaughtExceptionHandler, SessionEventData)>
				return null;
			//   10   24:aconst_null     
			//   11   25:areturn         
			}

			final CrashlyticsUncaughtExceptionHandler this$0;
			final SessionEventData val$crashEventData;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field CrashlyticsUncaughtExceptionHandler this$0>
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
	//    1    1:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #18  <Class CrashlyticsUncaughtExceptionHandler$14>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #1146 <Method void CrashlyticsUncaughtExceptionHandler$14(CrashlyticsUncaughtExceptionHandler, SessionEventData)>
	//    7   13:invokevirtual   #1080 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//    8   16:pop             
	//    9   17:return          
	}

	void writeNonFatalException(final Thread thread, final Throwable ex)
	{
		final Date now = new Date();
	//    0    0:new             #406 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #407 <Method void Date()>
	//    3    7:astore_3        
		executorServiceWrapper.executeAsync(new Runnable() {

			public void run()
			{
				if(!isHandlingException.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #23  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//*   2    4:invokestatic    #38  <Method AtomicBoolean CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler)>
			//*   3    7:invokevirtual   #44  <Method boolean AtomicBoolean.get()>
			//*   4   10:ifne            32
					doWriteNonFatal(now, thread, ex);
			//    5   13:aload_0         
			//    6   14:getfield        #23  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    7   17:aload_0         
			//    8   18:getfield        #25  <Field Date val$now>
			//    9   21:aload_0         
			//   10   22:getfield        #27  <Field Thread val$thread>
			//   11   25:aload_0         
			//   12   26:getfield        #29  <Field Throwable val$ex>
			//   13   29:invokestatic    #47  <Method void CrashlyticsUncaughtExceptionHandler.access$400(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
			//   14   32:return          
			}

			final CrashlyticsUncaughtExceptionHandler this$0;
			final Throwable val$ex;
			final Date val$now;
			final Thread val$thread;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CrashlyticsUncaughtExceptionHandler this$0>
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
	//    5    9:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    6   12:new             #30  <Class CrashlyticsUncaughtExceptionHandler$7>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #1148 <Method void CrashlyticsUncaughtExceptionHandler$7(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
	//   13   23:invokevirtual   #677 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Runnable)>
	//   14   26:pop             
	//   15   27:return          
	}

	void writeToLog(final long timestamp, final String msg)
	{
		executorServiceWrapper.executeAsync(new Callable() {

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
				if(!isHandlingException.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//*   2    4:invokestatic    #42  <Method AtomicBoolean CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler)>
			//*   3    7:invokevirtual   #48  <Method boolean AtomicBoolean.get()>
			//*   4   10:ifne            31
					logFileManager.writeToLog(timestamp, msg);
			//    5   13:aload_0         
			//    6   14:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    7   17:invokestatic    #52  <Method LogFileManager CrashlyticsUncaughtExceptionHandler.access$300(CrashlyticsUncaughtExceptionHandler)>
			//    8   20:aload_0         
			//    9   21:getfield        #24  <Field long val$timestamp>
			//   10   24:aload_0         
			//   11   25:getfield        #26  <Field String val$msg>
			//   12   28:invokevirtual   #55  <Method void LogFileManager.writeToLog(long, String)>
				return null;
			//   13   31:aconst_null     
			//   14   32:areturn         
			}

			final CrashlyticsUncaughtExceptionHandler this$0;
			final String val$msg;
			final long val$timestamp;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field CrashlyticsUncaughtExceptionHandler this$0>
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
	//    1    1:getfield        #193 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #28  <Class CrashlyticsUncaughtExceptionHandler$6>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:aload_3         
	//    7   11:invokespecial   #1153 <Method void CrashlyticsUncaughtExceptionHandler$6(CrashlyticsUncaughtExceptionHandler, long, String)>
	//    8   14:invokevirtual   #1080 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//    9   17:pop             
	//   10   18:return          
	}

	private static final int ANALYZER_VERSION = 1;
	static final FilenameFilter ANY_SESSION_FILENAME_FILTER = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(((CharSequence) (s))).matches();
		//    0    0:invokestatic    #19  <Method Pattern CrashlyticsUncaughtExceptionHandler.access$000()>
		//    1    3:aload_2         
		//    2    4:invokevirtual   #25  <Method Matcher Pattern.matcher(CharSequence)>
		//    3    7:invokevirtual   #31  <Method boolean Matcher.matches()>
		//    4   10:ireturn         
		}

	}
;
	private static final String EVENT_TYPE_CRASH = "crash";
	private static final String EVENT_TYPE_LOGGED = "error";
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
	private static final int MAX_COMPLETE_SESSIONS_COUNT = 4;
	static final int MAX_INVALID_SESSIONS = 4;
	private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
	static final int MAX_OPEN_SESSIONS = 8;
	static final int MAX_STACK_SIZE = 1024;
	static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
	private static final Map SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
	static final String SESSION_APP_TAG = "SessionApp";
	static final String SESSION_BEGIN_TAG = "BeginSession";
	static final String SESSION_DEVICE_TAG = "SessionDevice";
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
	static final String SESSION_NON_FATAL_TAG = "SessionEvent";
	static final String SESSION_OS_TAG = "SessionOS";
	static final String SESSION_USER_TAG = "SessionUser";
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
	private final CrashlyticsCore crashlyticsCore;
	private final Thread.UncaughtExceptionHandler defaultHandler;
	private final DevicePowerStateListener devicePowerStateListener;
	private final AtomicInteger eventCounter = new AtomicInteger(0);
	private final CrashlyticsExecutorServiceWrapper executorServiceWrapper;
	private final FileStore fileStore;
	private final IdManager idManager;
	private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
	private final LogFileManager logFileManager;
	private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new StackTraceTrimmingStrategy[] {
		new RemoveRepeatsStrategy(10)
	});
	private final String unityVersion;

	static 
	{
	//    0    0:new             #8   <Class CrashlyticsUncaughtExceptionHandler$1>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void CrashlyticsUncaughtExceptionHandler$1()>
	//    3    7:putstatic       #144 <Field FilenameFilter SESSION_FILE_FILTER>
	//    4   10:new             #20  <Class CrashlyticsUncaughtExceptionHandler$2>
	//    5   13:dup             
	//    6   14:invokespecial   #145 <Method void CrashlyticsUncaughtExceptionHandler$2()>
	//    7   17:putstatic       #147 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    8   20:new             #22  <Class CrashlyticsUncaughtExceptionHandler$3>
	//    9   23:dup             
	//   10   24:invokespecial   #148 <Method void CrashlyticsUncaughtExceptionHandler$3()>
	//   11   27:putstatic       #150 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   12   30:new             #24  <Class CrashlyticsUncaughtExceptionHandler$4>
	//   13   33:dup             
	//   14   34:invokespecial   #151 <Method void CrashlyticsUncaughtExceptionHandler$4()>
	//   15   37:putstatic       #153 <Field FilenameFilter ANY_SESSION_FILENAME_FILTER>
	//   16   40:ldc1            #155 <String "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+">
	//   17   42:invokestatic    #161 <Method Pattern Pattern.compile(String)>
	//   18   45:putstatic       #163 <Field Pattern SESSION_FILE_PATTERN>
	//   19   48:ldc1            #165 <String "X-CRASHLYTICS-SEND-FLAGS">
	//   20   50:ldc1            #167 <String "1">
	//   21   52:invokestatic    #173 <Method Map Collections.singletonMap(Object, Object)>
	//   22   55:putstatic       #175 <Field Map SEND_AT_CRASHTIME_HEADER>
	//   23   58:iconst_4        
	//   24   59:anewarray       String[]
	//   25   62:dup             
	//   26   63:iconst_0        
	//   27   64:ldc1            #115 <String "SessionUser">
	//   28   66:aastore         
	//   29   67:dup             
	//   30   68:iconst_1        
	//   31   69:ldc1            #89  <String "SessionApp">
	//   32   71:aastore         
	//   33   72:dup             
	//   34   73:iconst_2        
	//   35   74:ldc1            #112 <String "SessionOS">
	//   36   76:aastore         
	//   37   77:dup             
	//   38   78:iconst_3        
	//   39   79:ldc1            #95  <String "SessionDevice">
	//   40   81:aastore         
	//   41   82:putstatic       #179 <Field String[] INITIAL_SESSION_PART_TAGS>
	//*  42   85:return          
	}


/*
	static Pattern access$000()
	{
		return SESSION_FILE_PATTERN;
	//    0    0:getstatic       #163 <Field Pattern SESSION_FILE_PATTERN>
	//    1    3:areturn         
	}

*/


/*
	static void access$100(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, Date date, Thread thread, Throwable throwable)
		throws Exception
	{
		crashlyticsuncaughtexceptionhandler.handleUncaughtException(date, thread, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #256 <Method void handleUncaughtException(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static File[] access$1000(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, FilenameFilter filenamefilter)
	{
		return crashlyticsuncaughtexceptionhandler.listFilesMatching(filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #263 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    5:areturn         
	}

*/


/*
	static void access$1100(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, SessionEventData sessioneventdata)
		throws IOException
	{
		crashlyticsuncaughtexceptionhandler.doWriteExternalCrashEvent(sessioneventdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #271 <Method void doWriteExternalCrashEvent(SessionEventData)>
		return;
	//    3    5:return          
	}

*/


/*
	static Map access$1200()
	{
		return SEND_AT_CRASHTIME_HEADER;
	//    0    0:getstatic       #175 <Field Map SEND_AT_CRASHTIME_HEADER>
	//    1    3:areturn         
	}

*/


/*
	static AtomicBoolean access$200(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.isHandlingException;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field AtomicBoolean isHandlingException>
	//    2    4:areturn         
	}

*/


/*
	static LogFileManager access$300(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.logFileManager;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field LogFileManager logFileManager>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, Date date, Thread thread, Throwable throwable)
	{
		crashlyticsuncaughtexceptionhandler.doWriteNonFatal(date, thread, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #281 <Method void doWriteNonFatal(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static String access$500(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.getCurrentSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #286 <Method String getCurrentSessionId()>
	//    2    4:areturn         
	}

*/


/*
	static File access$600(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method File getFilesDir()>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
		throws Exception
	{
		crashlyticsuncaughtexceptionhandler.doOpenSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #297 <Method void doOpenSession()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$800(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, boolean flag)
		throws Exception
	{
		crashlyticsuncaughtexceptionhandler.doCloseSessions(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #302 <Method void doCloseSessions(boolean)>
		return;
	//    3    5:return          
	}

*/
}
