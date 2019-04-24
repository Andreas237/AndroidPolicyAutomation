// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.*;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.persistence.FileStore;
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
//			ClsFileOutputStream, CodedOutputStream, CLSUUID, ExceptionUtils, 
//			UserMetaData, MetaDataStore, CrashlyticsExecutorServiceWrapper, Utils, 
//			SessionProtobufHelper, NativeCrashWriter, ReportUploader, SessionReport

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

	private static final class SendSessionRunnable
		implements Runnable
	{

		public void run()
		{
			if(!CommonUtils.canTryConnection(crashlyticsCore.getContext()))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field CrashlyticsCore crashlyticsCore>
		//*   2    4:invokevirtual   #30  <Method Context CrashlyticsCore.getContext()>
		//*   3    7:invokestatic    #36  <Method boolean CommonUtils.canTryConnection(Context)>
		//*   4   10:ifne            14
				return;
		//    5   13:return          
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
		//*  19   43:ifnull          72
				(new ReportUploader(((CreateReportSpiCall) (obj)))).forceUpload(((Report) (new SessionReport(fileToSend, CrashlyticsUncaughtExceptionHandler.SEND_AT_CRASHTIME_HEADER))));
		//   20   46:new             #68  <Class ReportUploader>
		//   21   49:dup             
		//   22   50:aload_1         
		//   23   51:invokespecial   #71  <Method void ReportUploader(CreateReportSpiCall)>
		//   24   54:new             #73  <Class SessionReport>
		//   25   57:dup             
		//   26   58:aload_0         
		//   27   59:getfield        #22  <Field File fileToSend>
		//   28   62:invokestatic    #77  <Method Map CrashlyticsUncaughtExceptionHandler.access$1300()>
		//   29   65:invokespecial   #80  <Method void SessionReport(File, Map)>
		//   30   68:invokevirtual   #84  <Method boolean ReportUploader.forceUpload(Report)>
		//   31   71:pop             
		//   32   72:return          
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


	CrashlyticsUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, IdManager idmanager, UnityVersionProvider unityversionprovider, FileStore filestore, CrashlyticsCore crashlyticscore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #167 <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #169 <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #172 <Method void AtomicInteger(int)>
	//    7   13:putfield        #174 <Field AtomicInteger eventCounter>
		defaultHandler = uncaughtexceptionhandler;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #176 <Field Thread$UncaughtExceptionHandler defaultHandler>
		executorServiceWrapper = crashlyticsexecutorservicewrapper;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
		idManager = idmanager;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #180 <Field IdManager idManager>
		crashlyticsCore = crashlyticscore;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #182 <Field CrashlyticsCore crashlyticsCore>
		unityVersion = unityversionprovider.getUnityVersion();
	//   20   37:aload_0         
	//   21   38:aload           4
	//   22   40:invokeinterface #188 <Method String UnityVersionProvider.getUnityVersion()>
	//   23   45:putfield        #190 <Field String unityVersion>
		fileStore = filestore;
	//   24   48:aload_0         
	//   25   49:aload           5
	//   26   51:putfield        #192 <Field FileStore fileStore>
	//   27   54:aload_0         
	//   28   55:new             #194 <Class AtomicBoolean>
	//   29   58:dup             
	//   30   59:iconst_0        
	//   31   60:invokespecial   #197 <Method void AtomicBoolean(boolean)>
	//   32   63:putfield        #199 <Field AtomicBoolean isHandlingException>
		uncaughtexceptionhandler = ((Thread.UncaughtExceptionHandler) (crashlyticscore.getContext()));
	//   33   66:aload           6
	//   34   68:invokevirtual   #205 <Method Context CrashlyticsCore.getContext()>
	//   35   71:astore_1        
		logFileManager = new LogFileManager(((Context) (uncaughtexceptionhandler)), filestore);
	//   36   72:aload_0         
	//   37   73:new             #207 <Class LogFileManager>
	//   38   76:dup             
	//   39   77:aload_1         
	//   40   78:aload           5
	//   41   80:invokespecial   #210 <Method void LogFileManager(Context, FileStore)>
	//   42   83:putfield        #212 <Field LogFileManager logFileManager>
		devicePowerStateListener = new DevicePowerStateListener(((Context) (uncaughtexceptionhandler)));
	//   43   86:aload_0         
	//   44   87:new             #214 <Class DevicePowerStateListener>
	//   45   90:dup             
	//   46   91:aload_1         
	//   47   92:invokespecial   #217 <Method void DevicePowerStateListener(Context)>
	//   48   95:putfield        #219 <Field DevicePowerStateListener devicePowerStateListener>
	//   49   98:return          
	}

	private void closeOpenSessions(File afile[], int i, int j)
	{
		Fabric.getLogger().d("CrashlyticsCore", "Closing open sessions.");
	//    0    0:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//    1    3:ldc2            #287 <String "CrashlyticsCore">
	//    2    6:ldc2            #289 <String "Closing open sessions.">
	//    3    9:invokeinterface #295 <Method void Logger.d(String, String)>
		for(; i < afile.length; i++)
	//*   4   14:iload_2         
	//*   5   15:aload_1         
	//*   6   16:arraylength     
	//*   7   17:icmpge          95
		{
			File file = afile[i];
	//    8   20:aload_1         
	//    9   21:iload_2         
	//   10   22:aaload          
	//   11   23:astore          4
			String s = getSessionIdFromSessionFile(file);
	//   12   25:aload_0         
	//   13   26:aload           4
	//   14   28:invokespecial   #299 <Method String getSessionIdFromSessionFile(File)>
	//   15   31:astore          5
			Logger logger = Fabric.getLogger();
	//   16   33:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   17   36:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   18   38:new             #301 <Class StringBuilder>
	//   19   41:dup             
	//   20   42:invokespecial   #302 <Method void StringBuilder()>
	//   21   45:astore          7
			stringbuilder.append("Closing session: ");
	//   22   47:aload           7
	//   23   49:ldc2            #304 <String "Closing session: ">
	//   24   52:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
			stringbuilder.append(s);
	//   26   56:aload           7
	//   27   58:aload           5
	//   28   60:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			logger.d("CrashlyticsCore", stringbuilder.toString());
	//   30   64:aload           6
	//   31   66:ldc2            #287 <String "CrashlyticsCore">
	//   32   69:aload           7
	//   33   71:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   34   74:invokeinterface #295 <Method void Logger.d(String, String)>
			writeSessionPartsToSessionFile(file, s, j);
	//   35   79:aload_0         
	//   36   80:aload           4
	//   37   82:aload           5
	//   38   84:iload_3         
	//   39   85:invokespecial   #315 <Method void writeSessionPartsToSessionFile(File, String, int)>
		}

	//   40   88:iload_2         
	//   41   89:iconst_1        
	//   42   90:iadd            
	//   43   91:istore_2        
	//*  44   92:goto            14
	//   45   95:return          
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
	//    4    6:invokevirtual   #322 <Method void ClsFileOutputStream.closeInProgressStream()>
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ClsFileOutputStream clsfileoutputstream)
	//*   6   10:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (clsfileoutputstream)));
	//    7   11:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//    8   14:ldc2            #287 <String "CrashlyticsCore">
	//    9   17:ldc2            #324 <String "Error closing session file stream in the presence of an exception">
	//   10   20:aload_1         
	//   11   21:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
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
	//   16   23:invokevirtual   #336 <Method int InputStream.read(byte[], int, int)>
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
	//   27   41:invokevirtual   #342 <Method void CodedOutputStream.writeRawBytes(byte[])>
	//   28   44:return          
	}

	private void deleteLegacyInvalidCacheDir()
	{
		File file = new File(crashlyticsCore.getSdkDirectory(), "invalidClsFiles");
	//    0    0:new             #345 <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//    4    8:invokevirtual   #348 <Method File CrashlyticsCore.getSdkDirectory()>
	//    5   11:ldc1            #64  <String "invalidClsFiles">
	//    6   13:invokespecial   #351 <Method void File(File, String)>
	//    7   16:astore_3        
		if(!file.exists())
	//*   8   17:aload_3         
	//*   9   18:invokevirtual   #355 <Method boolean File.exists()>
	//*  10   21:ifne            25
			return;
	//   11   24:return          
		if(file.isDirectory())
	//*  12   25:aload_3         
	//*  13   26:invokevirtual   #358 <Method boolean File.isDirectory()>
	//*  14   29:ifeq            64
		{
			File afile[] = file.listFiles();
	//   15   32:aload_3         
	//   16   33:invokevirtual   #362 <Method File[] File.listFiles()>
	//   17   36:astore          4
			int j = afile.length;
	//   18   38:aload           4
	//   19   40:arraylength     
	//   20   41:istore_2        
			for(int i = 0; i < j; i++)
	//*  21   42:iconst_0        
	//*  22   43:istore_1        
	//*  23   44:iload_1         
	//*  24   45:iload_2         
	//*  25   46:icmpge          64
				afile[i].delete();
	//   26   49:aload           4
	//   27   51:iload_1         
	//   28   52:aaload          
	//   29   53:invokevirtual   #365 <Method boolean File.delete()>
	//   30   56:pop             

	//   31   57:iload_1         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_1        
		}
	//*  35   61:goto            44
		file.delete();
	//   36   64:aload_3         
	//   37   65:invokevirtual   #365 <Method boolean File.delete()>
	//   38   68:pop             
	//   39   69:return          
	}

	private void deleteSessionPartFilesFor(String s)
	{
		s = ((String) (listSessionPartFilesFor(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #371 <Method File[] listSessionPartFilesFor(String)>
	//    3    5:astore_1        
		int i = 0;
	//    4    6:iconst_0        
	//    5    7:istore_2        
		for(int j = s.length; i < j; i++)
	//*   6    8:aload_1         
	//*   7    9:arraylength     
	//*   8   10:istore_3        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          30
			((File) (s[i])).delete();
	//   12   16:aload_1         
	//   13   17:iload_2         
	//   14   18:aaload          
	//   15   19:invokevirtual   #365 <Method boolean File.delete()>
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
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #373 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #375 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #379 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void doOpenSession()
		throws Exception
	{
		Date date = new Date();
	//    0    0:new             #381 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #382 <Method void Date()>
	//    3    7:astore_1        
		String s = (new CLSUUID(idManager)).toString();
	//    4    8:new             #384 <Class CLSUUID>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #180 <Field IdManager idManager>
	//    8   16:invokespecial   #387 <Method void CLSUUID(IdManager)>
	//    9   19:invokevirtual   #388 <Method String CLSUUID.toString()>
	//   10   22:astore_2        
		Logger logger = Fabric.getLogger();
	//   11   23:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   12   26:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #301 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #302 <Method void StringBuilder()>
	//   16   34:astore          4
		stringbuilder.append("Opening an new session with ID ");
	//   17   36:aload           4
	//   18   38:ldc2            #390 <String "Opening an new session with ID ">
	//   19   41:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
		stringbuilder.append(s);
	//   21   45:aload           4
	//   22   47:aload_2         
	//   23   48:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		logger.d("CrashlyticsCore", stringbuilder.toString());
	//   25   52:aload_3         
	//   26   53:ldc2            #287 <String "CrashlyticsCore">
	//   27   56:aload           4
	//   28   58:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   29   61:invokeinterface #295 <Method void Logger.d(String, String)>
		writeBeginSession(s, date);
	//   30   66:aload_0         
	//   31   67:aload_2         
	//   32   68:aload_1         
	//   33   69:invokespecial   #394 <Method void writeBeginSession(String, Date)>
		writeSessionApp(s);
	//   34   72:aload_0         
	//   35   73:aload_2         
	//   36   74:invokespecial   #397 <Method void writeSessionApp(String)>
		writeSessionOS(s);
	//   37   77:aload_0         
	//   38   78:aload_2         
	//   39   79:invokespecial   #400 <Method void writeSessionOS(String)>
		writeSessionDevice(s);
	//   40   82:aload_0         
	//   41   83:aload_2         
	//   42   84:invokespecial   #403 <Method void writeSessionDevice(String)>
		logFileManager.setCurrentSession(s);
	//   43   87:aload_0         
	//   44   88:getfield        #212 <Field LogFileManager logFileManager>
	//   45   91:aload_2         
	//   46   92:invokevirtual   #406 <Method void LogFileManager.setCurrentSession(String)>
	//   47   95:return          
	}

	private void doWriteNonFatal(Date date, Thread thread, Throwable throwable)
	{
		CodedOutputStream codedoutputstream;
		Object obj1;
		String s;
		s = getCurrentSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #256 <Method String getCurrentSessionId()>
	//    2    4:astore          7
		obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		codedoutputstream = null;
	//    5    9:aconst_null     
	//    6   10:astore          5
		if(s == null)
	//*   7   12:aload           7
	//*   8   14:ifnonnull       33
		{
			Fabric.getLogger().e("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", ((Throwable) (null)));
	//    9   17:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   10   20:ldc2            #287 <String "CrashlyticsCore">
	//   11   23:ldc2            #408 <String "Tried to write a non-fatal exception while no session was open.">
	//   12   26:aconst_null     
	//   13   27:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
			return;
	//   14   32:return          
		}
		CrashlyticsCore.recordLoggedExceptionEvent(s);
	//   15   33:aload           7
	//   16   35:invokestatic    #411 <Method void CrashlyticsCore.recordLoggedExceptionEvent(String)>
		Object obj;
		obj = ((Object) (Fabric.getLogger()));
	//   17   38:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   18   41:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//   19   43:new             #301 <Class StringBuilder>
	//   20   46:dup             
	//   21   47:invokespecial   #302 <Method void StringBuilder()>
	//   22   50:astore          8
		stringbuilder.append("Crashlytics is logging non-fatal exception \"");
	//   23   52:aload           8
	//   24   54:ldc2            #413 <String "Crashlytics is logging non-fatal exception \"">
	//   25   57:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
		stringbuilder.append(((Object) (throwable)));
	//   27   61:aload           8
	//   28   63:aload_3         
	//   29   64:invokevirtual   #416 <Method StringBuilder StringBuilder.append(Object)>
	//   30   67:pop             
		stringbuilder.append("\" from thread ");
	//   31   68:aload           8
	//   32   70:ldc2            #418 <String "\" from thread ">
	//   33   73:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   34   76:pop             
		stringbuilder.append(thread.getName());
	//   35   77:aload           8
	//   36   79:aload_2         
	//   37   80:invokevirtual   #423 <Method String Thread.getName()>
	//   38   83:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   39   86:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   40   87:aload           4
	//   41   89:ldc2            #287 <String "CrashlyticsCore">
	//   42   92:aload           8
	//   43   94:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   44   97:invokeinterface #295 <Method void Logger.d(String, String)>
		obj = ((Object) (CommonUtils.padWithZerosToMaxIntWidth(eventCounter.getAndIncrement())));
	//   45  102:aload_0         
	//   46  103:getfield        #174 <Field AtomicInteger eventCounter>
	//   47  106:invokevirtual   #427 <Method int AtomicInteger.getAndIncrement()>
	//   48  109:invokestatic    #433 <Method String CommonUtils.padWithZerosToMaxIntWidth(int)>
	//   49  112:astore          4
		stringbuilder = new StringBuilder();
	//   50  114:new             #301 <Class StringBuilder>
	//   51  117:dup             
	//   52  118:invokespecial   #302 <Method void StringBuilder()>
	//   53  121:astore          8
		stringbuilder.append(s);
	//   54  123:aload           8
	//   55  125:aload           7
	//   56  127:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   57  130:pop             
		stringbuilder.append("SessionEvent");
	//   58  131:aload           8
	//   59  133:ldc1            #96  <String "SessionEvent">
	//   60  135:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   61  138:pop             
		stringbuilder.append(((String) (obj)));
	//   62  139:aload           8
	//   63  141:aload           4
	//   64  143:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   65  146:pop             
		obj = ((Object) (stringbuilder.toString()));
	//   66  147:aload           8
	//   67  149:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   68  152:astore          4
		obj = ((Object) (new ClsFileOutputStream(getFilesDir(), ((String) (obj)))));
	//   69  154:new             #319 <Class ClsFileOutputStream>
	//   70  157:dup             
	//   71  158:aload_0         
	//   72  159:invokespecial   #262 <Method File getFilesDir()>
	//   73  162:aload           4
	//   74  164:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   75  167:astore          4
		codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   76  169:aload           4
	//   77  171:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   78  174:astore          5
		try
		{
			writeSessionEvent(codedoutputstream, date, thread, throwable, "error", false);
	//   79  176:aload_0         
	//   80  177:aload           5
	//   81  179:aload_1         
	//   82  180:aload_2         
	//   83  181:aload_3         
	//   84  182:ldc1            #56  <String "error">
	//   85  184:iconst_0        
	//   86  185:invokespecial   #442 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
		}
	//*  87  188:aload           5
	//*  88  190:ldc2            #444 <String "Failed to flush to non-fatal file.">
	//*  89  193:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  90  196:aload           4
	//*  91  198:ldc2            #450 <String "Failed to close non-fatal file output stream.">
	//*  92  201:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  93  204:goto            287
	//*  94  207:astore_2        
	//*  95  208:aload           5
	//*  96  210:astore_1        
	//*  97  211:goto            317
		// Misplaced declaration of an exception variable
		catch(Thread thread)
	//*  98  214:astore_2        
		{
			date = ((Date) (codedoutputstream));
	//   99  215:aload           5
	//  100  217:astore_1        
			break MISSING_BLOCK_LABEL_231;
	//  101  218:goto            231
		}
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to non-fatal file.");
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
		break MISSING_BLOCK_LABEL_287;
		thread;
		date = ((Date) (codedoutputstream));
		break MISSING_BLOCK_LABEL_317;
		thread;
	//  102  221:astore_2        
		date = ((Date) (obj1));
	//  103  222:aload           6
	//  104  224:astore_1        
		break MISSING_BLOCK_LABEL_317;
	//  105  225:goto            317
		thread;
	//  106  228:astore_2        
		date = null;
	//  107  229:aconst_null     
	//  108  230:astore_1        
		throwable = ((Throwable) (obj));
	//  109  231:aload           4
	//  110  233:astore_3        
		break MISSING_BLOCK_LABEL_253;
	//  111  234:goto            253
		thread;
	//  112  237:astore_2        
		obj = null;
	//  113  238:aconst_null     
	//  114  239:astore          4
		date = ((Date) (obj1));
	//  115  241:aload           6
	//  116  243:astore_1        
		break MISSING_BLOCK_LABEL_317;
	//  117  244:goto            317
		thread;
	//  118  247:astore_2        
		date = null;
	//  119  248:aconst_null     
	//  120  249:astore_1        
		throwable = ((Throwable) (codedoutputstream));
	//  121  250:aload           5
	//  122  252:astore_3        
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the non-fatal exception logger", ((Throwable) (thread)));
	//  123  253:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//  124  256:ldc2            #287 <String "CrashlyticsCore">
	//  125  259:ldc2            #456 <String "An error occurred in the non-fatal exception logger">
	//  126  262:aload_2         
	//  127  263:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (thread)), ((java.io.OutputStream) (throwable)));
	//  128  268:aload_2         
	//  129  269:aload_3         
	//  130  270:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to non-fatal file.");
	//  131  273:aload_1         
	//  132  274:ldc2            #444 <String "Failed to flush to non-fatal file.">
	//  133  277:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (throwable)), "Failed to close non-fatal file output stream.");
	//  134  280:aload_3         
	//  135  281:ldc2            #450 <String "Failed to close non-fatal file output stream.">
	//  136  284:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		try
		{
			trimSessionEventFiles(s, 64);
	//  137  287:aload_0         
	//  138  288:aload           7
	//  139  290:bipush          64
	//  140  292:invokespecial   #466 <Method void trimSessionEventFiles(String, int)>
			return;
	//  141  295:return          
		}
		// Misplaced declaration of an exception variable
		catch(Date date)
	//* 142  296:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "An error occurred when trimming non-fatal files.", ((Throwable) (date)));
	//  143  297:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//  144  300:ldc2            #287 <String "CrashlyticsCore">
	//  145  303:ldc2            #468 <String "An error occurred when trimming non-fatal files.">
	//  146  306:aload_1         
	//  147  307:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		}
		return;
	//  148  312:return          
		thread;
	//  149  313:astore_2        
		obj = ((Object) (throwable));
	//  150  314:aload_3         
	//  151  315:astore          4
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to non-fatal file.");
	//  152  317:aload_1         
	//  153  318:ldc2            #444 <String "Failed to flush to non-fatal file.">
	//  154  321:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
	//  155  324:aload           4
	//  156  326:ldc2            #450 <String "Failed to close non-fatal file output stream.">
	//  157  329:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw thread;
	//  158  332:aload_2         
	//  159  333:athrow          
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
	//    1    1:invokespecial   #473 <Method File[] listSortedSessionBeginFiles()>
	//    2    4:astore_1        
		if(afile.length > 0)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:ifle            18
			return getSessionIdFromSessionFile(afile[0]);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:aaload          
	//   10   14:invokespecial   #299 <Method String getSessionIdFromSessionFile(File)>
	//   11   17:areturn         
		else
			return null;
	//   12   18:aconst_null     
	//   13   19:areturn         
	}

	private File getFilesDir()
	{
		return fileStore.getFilesDir();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field FileStore fileStore>
	//    2    4:invokeinterface #476 <Method File FileStore.getFilesDir()>
	//    3    9:areturn         
	}

	private String getPreviousSessionId()
	{
		File afile[] = listSortedSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #473 <Method File[] listSortedSessionBeginFiles()>
	//    2    4:astore_1        
		if(afile.length > 1)
	//*   3    5:aload_1         
	//*   4    6:arraylength     
	//*   5    7:iconst_1        
	//*   6    8:icmple          19
			return getSessionIdFromSessionFile(afile[1]);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:iconst_1        
	//   10   14:aaload          
	//   11   15:invokespecial   #299 <Method String getSessionIdFromSessionFile(File)>
	//   12   18:areturn         
		else
			return null;
	//   13   19:aconst_null     
	//   14   20:areturn         
	}

	private String getSessionIdFromSessionFile(File file)
	{
		return file.getName().substring(0, 35);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #478 <Method String File.getName()>
	//    2    4:iconst_0        
	//    3    5:bipush          35
	//    4    7:invokevirtual   #482 <Method String String.substring(int, int)>
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
	//    6    9:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//    7   12:ldc2            #287 <String "CrashlyticsCore">
	//    8   15:getstatic       #490 <Field Locale Locale.US>
	//    9   18:ldc2            #492 <String "Trimming down to %d logged exceptions.">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:iload_3         
	//   15   28:invokestatic    #498 <Method Integer Integer.valueOf(int)>
	//   16   31:aastore         
	//   17   32:invokestatic    #502 <Method String String.format(Locale, String, Object[])>
	//   18   35:invokeinterface #295 <Method void Logger.d(String, String)>
			trimSessionEventFiles(s, i);
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:iload_3         
	//   22   43:invokespecial   #466 <Method void trimSessionEventFiles(String, int)>
			afile = ((File []) (new StringBuilder()));
	//   23   46:new             #301 <Class StringBuilder>
	//   24   49:dup             
	//   25   50:invokespecial   #302 <Method void StringBuilder()>
	//   26   53:astore_2        
			((StringBuilder) (afile)).append(s);
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			((StringBuilder) (afile)).append("SessionEvent");
	//   31   60:aload_2         
	//   32   61:ldc1            #96  <String "SessionEvent">
	//   33   63:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
			afile1 = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (afile)).toString()))));
	//   35   67:aload_0         
	//   36   68:new             #37  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   37   71:dup             
	//   38   72:aload_2         
	//   39   73:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   40   76:invokespecial   #503 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   41   79:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
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
	//*   1    1:invokevirtual   #507 <Method boolean isHandlingException()>
	//*   2    4:ifeq            36
			return new UserMetaData(crashlyticsCore.getUserIdentifier(), crashlyticsCore.getUserName(), crashlyticsCore.getUserEmail());
	//    3    7:new             #509 <Class UserMetaData>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//    7   15:invokevirtual   #512 <Method String CrashlyticsCore.getUserIdentifier()>
	//    8   18:aload_0         
	//    9   19:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//   10   22:invokevirtual   #515 <Method String CrashlyticsCore.getUserName()>
	//   11   25:aload_0         
	//   12   26:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//   13   29:invokevirtual   #518 <Method String CrashlyticsCore.getUserEmail()>
	//   14   32:invokespecial   #521 <Method void UserMetaData(String, String, String)>
	//   15   35:areturn         
		else
			return (new MetaDataStore(getFilesDir())).readUserData(s);
	//   16   36:new             #523 <Class MetaDataStore>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokespecial   #262 <Method File getFilesDir()>
	//   20   44:invokespecial   #526 <Method void MetaDataStore(File)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #529 <Method UserMetaData MetaDataStore.readUserData(String)>
	//   23   51:areturn         
	}

	private void handleUncaughtException(Date date, Thread thread, Throwable throwable)
		throws Exception
	{
		crashlyticsCore.createCrashMarker();
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #532 <Method void CrashlyticsCore.createCrashMarker()>
		writeFatal(date, thread, throwable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #535 <Method void writeFatal(Date, Thread, Throwable)>
		doCloseSessions();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #537 <Method void doCloseSessions()>
		doOpenSession();
	//   10   18:aload_0         
	//   11   19:invokespecial   #267 <Method void doOpenSession()>
		trimSessionFiles();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #540 <Method void trimSessionFiles()>
		if(!crashlyticsCore.shouldPromptUserBeforeSendingCrashReports())
	//*  14   26:aload_0         
	//*  15   27:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  16   30:invokevirtual   #543 <Method boolean CrashlyticsCore.shouldPromptUserBeforeSendingCrashReports()>
	//*  17   33:ifne            40
			sendSessionReports();
	//   18   36:aload_0         
	//   19   37:invokespecial   #546 <Method void sendSessionReports()>
	//   20   40:return          
	}

	private File[] listCompleteSessionFiles()
	{
		return listFilesMatching(SESSION_FILE_FILTER);
	//    0    0:aload_0         
	//    1    1:getstatic       #129 <Field FilenameFilter SESSION_FILE_FILTER>
	//    2    4:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    7:areturn         
	}

	private File[] listFilesMatching(FilenameFilter filenamefilter)
	{
		return ensureFileArrayNotNull(getFilesDir().listFiles(filenamefilter));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #262 <Method File getFilesDir()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #549 <Method File[] File.listFiles(FilenameFilter)>
	//    5    9:invokespecial   #551 <Method File[] ensureFileArrayNotNull(File[])>
	//    6   12:areturn         
	}

	private File[] listSessionPartFilesFor(String s)
	{
		return listFilesMatching(((FilenameFilter) (new SessionPartFileFilter(s))));
	//    0    0:aload_0         
	//    1    1:new             #43  <Class CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #552 <Method void CrashlyticsUncaughtExceptionHandler$SessionPartFileFilter(String)>
	//    5    9:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
	//    6   12:areturn         
	}

	private File[] listSortedSessionBeginFiles()
	{
		File afile[] = listSessionBeginFiles();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #555 <Method File[] listSessionBeginFiles()>
	//    2    4:astore_1        
		Arrays.sort(((Object []) (afile)), LARGEST_FILE_NAME_FIRST);
	//    3    5:aload_1         
	//    4    6:getstatic       #132 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    5    9:invokestatic    #561 <Method void Arrays.sort(Object[], Comparator)>
		return afile;
	//    6   12:aload_1         
	//    7   13:areturn         
	}

	private void sendSessionReports()
	{
		File afile[] = listCompleteSessionFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #563 <Method File[] listCompleteSessionFiles()>
	//    2    4:astore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		for(int j = afile.length; i < j; i++)
	//*   5    7:aload_3         
	//*   6    8:arraylength     
	//*   7    9:istore_2        
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
	//   16   21:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//   17   24:new             #40  <Class CrashlyticsUncaughtExceptionHandler$SendSessionRunnable>
	//   18   27:dup             
	//   19   28:aload_0         
	//   20   29:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//   21   32:aload           4
	//   22   34:invokespecial   #566 <Method void CrashlyticsUncaughtExceptionHandler$SendSessionRunnable(CrashlyticsCore, File)>
	//   23   37:invokevirtual   #572 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Runnable)>
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
		boolean flag;
		CodedOutputStream codedoutputstream;
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
		codedoutputstream = null;
	//    7   14:aconst_null     
	//    8   15:astore          7
		ClsFileOutputStream clsfileoutputstream = new ClsFileOutputStream(getFilesDir(), s);
	//    9   17:new             #319 <Class ClsFileOutputStream>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #262 <Method File getFilesDir()>
	//   13   25:aload_2         
	//   14   26:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   15   29:astore          6
		codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (clsfileoutputstream)));
	//   16   31:aload           6
	//   17   33:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   18   36:astore          7
		try
		{
			Logger logger1 = Fabric.getLogger();
	//   19   38:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   20   41:astore          8
			StringBuilder stringbuilder1 = new StringBuilder();
	//   21   43:new             #301 <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #302 <Method void StringBuilder()>
	//   24   50:astore          9
			stringbuilder1.append("Collecting SessionStart data for session ID ");
	//   25   52:aload           9
	//   26   54:ldc2            #576 <String "Collecting SessionStart data for session ID ">
	//   27   57:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
			stringbuilder1.append(s);
	//   29   61:aload           9
	//   30   63:aload_2         
	//   31   64:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:pop             
			logger1.d("CrashlyticsCore", stringbuilder1.toString());
	//   33   68:aload           8
	//   34   70:ldc2            #287 <String "CrashlyticsCore">
	//   35   73:aload           9
	//   36   75:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   37   78:invokeinterface #295 <Method void Logger.d(String, String)>
			writeToCosFromFile(codedoutputstream, file);
	//   38   83:aload           7
	//   39   85:aload_1         
	//   40   86:invokestatic    #580 <Method void writeToCosFromFile(CodedOutputStream, File)>
			codedoutputstream.writeUInt64(4, (new Date()).getTime() / 1000L);
	//   41   89:aload           7
	//   42   91:iconst_4        
	//   43   92:new             #381 <Class Date>
	//   44   95:dup             
	//   45   96:invokespecial   #382 <Method void Date()>
	//   46   99:invokevirtual   #584 <Method long Date.getTime()>
	//   47  102:ldc2w           #585 <Long 1000L>
	//   48  105:ldiv            
	//   49  106:invokevirtual   #590 <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeBool(5, flag);
	//   50  109:aload           7
	//   51  111:iconst_5        
	//   52  112:iload           5
	//   53  114:invokevirtual   #594 <Method void CodedOutputStream.writeBool(int, boolean)>
			writeInitialPartsTo(codedoutputstream, s);
	//   54  117:aload_0         
	//   55  118:aload           7
	//   56  120:aload_2         
	//   57  121:invokespecial   #598 <Method void writeInitialPartsTo(CodedOutputStream, String)>
			writeNonFatalEventsTo(codedoutputstream, afile, s);
	//   58  124:aload           7
	//   59  126:aload_3         
	//   60  127:aload_2         
	//   61  128:invokestatic    #602 <Method void writeNonFatalEventsTo(CodedOutputStream, File[], String)>
		}
	//*  62  131:iload           5
	//*  63  133:ifeq            143
	//*  64  136:aload           7
	//*  65  138:aload           4
	//*  66  140:invokestatic    #580 <Method void writeToCosFromFile(CodedOutputStream, File)>
	//*  67  143:aload           7
	//*  68  145:bipush          11
	//*  69  147:iconst_1        
	//*  70  148:invokevirtual   #606 <Method void CodedOutputStream.writeUInt32(int, int)>
	//*  71  151:aload           7
	//*  72  153:bipush          12
	//*  73  155:iconst_3        
	//*  74  156:invokevirtual   #609 <Method void CodedOutputStream.writeEnum(int, int)>
	//*  75  159:aload           7
	//*  76  161:ldc2            #611 <String "Error flushing session file stream">
	//*  77  164:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  78  167:aload           6
	//*  79  169:ldc2            #613 <String "Failed to close CLS file">
	//*  80  172:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  81  175:return          
	//*  82  176:astore_2        
	//*  83  177:aload           6
	//*  84  179:astore_3        
	//*  85  180:aload           7
	//*  86  182:astore_1        
	//*  87  183:goto            295
		// Misplaced declaration of an exception variable
		catch(File file1)
	//*  88  186:astore          4
		{
			file = ((File) (codedoutputstream));
	//   89  188:aload           7
	//   90  190:astore_1        
			break MISSING_BLOCK_LABEL_207;
	//   91  191:goto            207
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_143;
		writeToCosFromFile(codedoutputstream, file1);
		codedoutputstream.writeUInt32(11, 1);
		codedoutputstream.writeEnum(12, 3);
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Error flushing session file stream");
		CommonUtils.closeOrLog(((java.io.Closeable) (clsfileoutputstream)), "Failed to close CLS file");
		return;
		s;
		afile = ((File []) (clsfileoutputstream));
		file = ((File) (codedoutputstream));
		break MISSING_BLOCK_LABEL_295;
		s;
	//   92  194:astore_2        
		file = null;
	//   93  195:aconst_null     
	//   94  196:astore_1        
		afile = ((File []) (clsfileoutputstream));
	//   95  197:aload           6
	//   96  199:astore_3        
		break MISSING_BLOCK_LABEL_295;
	//   97  200:goto            295
		file1;
	//   98  203:astore          4
		file = null;
	//   99  205:aconst_null     
	//  100  206:astore_1        
		afile = ((File []) (clsfileoutputstream));
	//  101  207:aload           6
	//  102  209:astore_3        
		break MISSING_BLOCK_LABEL_228;
	//  103  210:goto            228
		s;
	//  104  213:astore_2        
		afile = null;
	//  105  214:aconst_null     
	//  106  215:astore_3        
		file = ((File) (afile));
	//  107  216:aload_3         
	//  108  217:astore_1        
		break MISSING_BLOCK_LABEL_295;
	//  109  218:goto            295
		file1;
	//  110  221:astore          4
		file = null;
	//  111  223:aconst_null     
	//  112  224:astore_1        
		afile = ((File []) (codedoutputstream));
	//  113  225:aload           7
	//  114  227:astore_3        
		Logger logger = Fabric.getLogger();
	//  115  228:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//  116  231:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//  117  233:new             #301 <Class StringBuilder>
	//  118  236:dup             
	//  119  237:invokespecial   #302 <Method void StringBuilder()>
	//  120  240:astore          7
		stringbuilder.append("Failed to write session file for session ID: ");
	//  121  242:aload           7
	//  122  244:ldc2            #615 <String "Failed to write session file for session ID: ">
	//  123  247:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//  124  250:pop             
		stringbuilder.append(s);
	//  125  251:aload           7
	//  126  253:aload_2         
	//  127  254:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//  128  257:pop             
		logger.e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (file1)));
	//  129  258:aload           6
	//  130  260:ldc2            #287 <String "CrashlyticsCore">
	//  131  263:aload           7
	//  132  265:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  133  268:aload           4
	//  134  270:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (file1)), ((java.io.OutputStream) (afile)));
	//  135  275:aload           4
	//  136  277:aload_3         
	//  137  278:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		CommonUtils.flushOrLog(((java.io.Flushable) (file)), "Error flushing session file stream");
	//  138  281:aload_1         
	//  139  282:ldc2            #611 <String "Error flushing session file stream">
	//  140  285:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		closeWithoutRenamingOrLog(((ClsFileOutputStream) (afile)));
	//  141  288:aload_0         
	//  142  289:aload_3         
	//  143  290:invokespecial   #617 <Method void closeWithoutRenamingOrLog(ClsFileOutputStream)>
		return;
	//  144  293:return          
		s;
	//  145  294:astore_2        
		CommonUtils.flushOrLog(((java.io.Flushable) (file)), "Error flushing session file stream");
	//  146  295:aload_1         
	//  147  296:ldc2            #611 <String "Error flushing session file stream">
	//  148  299:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (afile)), "Failed to close CLS file");
	//  149  302:aload_3         
	//  150  303:ldc2            #613 <String "Failed to close CLS file">
	//  151  306:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw s;
	//  152  309:aload_2         
	//  153  310:athrow          
	}

	private void trimOpenSessions(int i)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #620 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #621 <Method void HashSet()>
	//    3    7:astore          4
		File afile[] = listSortedSessionBeginFiles();
	//    4    9:aload_0         
	//    5   10:invokespecial   #473 <Method File[] listSortedSessionBeginFiles()>
	//    6   13:astore          5
		boolean flag = false;
	//    7   15:iconst_0        
	//    8   16:istore_2        
		int j = Math.min(i, afile.length);
	//    9   17:iload_1         
	//   10   18:aload           5
	//   11   20:arraylength     
	//   12   21:invokestatic    #627 <Method int Math.min(int, int)>
	//   13   24:istore_3        
		for(i = 0; i < j; i++)
	//*  14   25:iconst_0        
	//*  15   26:istore_1        
	//*  16   27:iload_1         
	//*  17   28:iload_3         
	//*  18   29:icmpge          55
			((Set) (hashset)).add(((Object) (getSessionIdFromSessionFile(afile[i]))));
	//   19   32:aload           4
	//   20   34:aload_0         
	//   21   35:aload           5
	//   22   37:iload_1         
	//   23   38:aaload          
	//   24   39:invokespecial   #299 <Method String getSessionIdFromSessionFile(File)>
	//   25   42:invokeinterface #633 <Method boolean Set.add(Object)>
	//   26   47:pop             

	//   27   48:iload_1         
	//   28   49:iconst_1        
	//   29   50:iadd            
	//   30   51:istore_1        
	//*  31   52:goto            27
		logFileManager.discardOldLogFiles(((Set) (hashset)));
	//   32   55:aload_0         
	//   33   56:getfield        #212 <Field LogFileManager logFileManager>
	//   34   59:aload           4
	//   35   61:invokevirtual   #637 <Method void LogFileManager.discardOldLogFiles(Set)>
		afile = listFilesMatching(((FilenameFilter) (new AnySessionPartFileFilter())));
	//   36   64:aload_0         
	//   37   65:new             #34  <Class CrashlyticsUncaughtExceptionHandler$AnySessionPartFileFilter>
	//   38   68:dup             
	//   39   69:aconst_null     
	//   40   70:invokespecial   #640 <Method void CrashlyticsUncaughtExceptionHandler$AnySessionPartFileFilter(CrashlyticsUncaughtExceptionHandler$1)>
	//   41   73:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
	//   42   76:astore          5
		j = afile.length;
	//   43   78:aload           5
	//   44   80:arraylength     
	//   45   81:istore_3        
		for(i = ((int) (flag)); i < j; i++)
	//*  46   82:iload_2         
	//*  47   83:istore_1        
	//*  48   84:iload_1         
	//*  49   85:iload_3         
	//*  50   86:icmpge          193
		{
			File file = afile[i];
	//   51   89:aload           5
	//   52   91:iload_1         
	//   53   92:aaload          
	//   54   93:astore          6
			String s = file.getName();
	//   55   95:aload           6
	//   56   97:invokevirtual   #478 <Method String File.getName()>
	//   57  100:astore          7
			Matcher matcher = SESSION_FILE_PATTERN.matcher(((CharSequence) (s)));
	//   58  102:getstatic       #148 <Field Pattern SESSION_FILE_PATTERN>
	//   59  105:aload           7
	//   60  107:invokevirtual   #644 <Method Matcher Pattern.matcher(CharSequence)>
	//   61  110:astore          8
			matcher.matches();
	//   62  112:aload           8
	//   63  114:invokevirtual   #649 <Method boolean Matcher.matches()>
	//   64  117:pop             
			if(!((Set) (hashset)).contains(((Object) (matcher.group(1)))))
	//*  65  118:aload           4
	//*  66  120:aload           8
	//*  67  122:iconst_1        
	//*  68  123:invokevirtual   #652 <Method String Matcher.group(int)>
	//*  69  126:invokeinterface #655 <Method boolean Set.contains(Object)>
	//*  70  131:ifne            186
			{
				Logger logger = Fabric.getLogger();
	//   71  134:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   72  137:astore          8
				StringBuilder stringbuilder = new StringBuilder();
	//   73  139:new             #301 <Class StringBuilder>
	//   74  142:dup             
	//   75  143:invokespecial   #302 <Method void StringBuilder()>
	//   76  146:astore          9
				stringbuilder.append("Trimming open session file: ");
	//   77  148:aload           9
	//   78  150:ldc2            #657 <String "Trimming open session file: ">
	//   79  153:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   80  156:pop             
				stringbuilder.append(s);
	//   81  157:aload           9
	//   82  159:aload           7
	//   83  161:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   84  164:pop             
				logger.d("CrashlyticsCore", stringbuilder.toString());
	//   85  165:aload           8
	//   86  167:ldc2            #287 <String "CrashlyticsCore">
	//   87  170:aload           9
	//   88  172:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   89  175:invokeinterface #295 <Method void Logger.d(String, String)>
				file.delete();
	//   90  180:aload           6
	//   91  182:invokevirtual   #365 <Method boolean File.delete()>
	//   92  185:pop             
			}
		}

	//   93  186:iload_1         
	//   94  187:iconst_1        
	//   95  188:iadd            
	//   96  189:istore_1        
	//*  97  190:goto            84
	//   98  193:return          
	}

	private void trimSessionEventFiles(String s, int i)
	{
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method File getFilesDir()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #301 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #302 <Method void StringBuilder()>
	//    6   12:astore          4
		stringbuilder.append(s);
	//    7   14:aload           4
	//    8   16:aload_1         
	//    9   17:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   10   20:pop             
		stringbuilder.append("SessionEvent");
	//   11   21:aload           4
	//   12   23:ldc1            #96  <String "SessionEvent">
	//   13   25:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
		Utils.capFileCount(file, ((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))), i, SMALLEST_FILE_NAME_FIRST);
	//   15   29:aload_3         
	//   16   30:new             #37  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   17   33:dup             
	//   18   34:aload           4
	//   19   36:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   20   39:invokespecial   #503 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   21   42:iload_2         
	//   22   43:getstatic       #135 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   23   46:invokestatic    #663 <Method void Utils.capFileCount(File, FilenameFilter, int, Comparator)>
	//   24   49:return          
	}

	private void writeBeginSession(String s, Date date)
		throws Exception
	{
		Object obj;
		Object obj2;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj2 = null;
	//    2    2:aconst_null     
	//    3    3:astore          5
		Object obj1;
		obj1 = ((Object) (getFilesDir()));
	//    4    5:aload_0         
	//    5    6:invokespecial   #262 <Method File getFilesDir()>
	//    6    9:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #301 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #302 <Method void StringBuilder()>
	//   10   18:astore          6
		stringbuilder.append(s);
	//   11   20:aload           6
	//   12   22:aload_1         
	//   13   23:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		stringbuilder.append("BeginSession");
	//   15   27:aload           6
	//   16   29:ldc1            #82  <String "BeginSession">
	//   17   31:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		obj1 = ((Object) (new ClsFileOutputStream(((File) (obj1)), stringbuilder.toString())));
	//   19   35:new             #319 <Class ClsFileOutputStream>
	//   20   38:dup             
	//   21   39:aload           4
	//   22   41:aload           6
	//   23   43:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   25   49:astore          4
		obj = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   26   51:aload           4
	//   27   53:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   28   56:astore_3        
		try
		{
			SessionProtobufHelper.writeBeginSession(((CodedOutputStream) (obj)), s, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
				crashlyticsCore.getVersion()
			}), date.getTime() / 1000L);
	//   29   57:aload_3         
	//   30   58:aload_1         
	//   31   59:getstatic       #490 <Field Locale Locale.US>
	//   32   62:ldc1            #59  <String "Crashlytics Android SDK/%s">
	//   33   64:iconst_1        
	//   34   65:anewarray       Object[]
	//   35   68:dup             
	//   36   69:iconst_0        
	//   37   70:aload_0         
	//   38   71:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//   39   74:invokevirtual   #666 <Method String CrashlyticsCore.getVersion()>
	//   40   77:aastore         
	//   41   78:invokestatic    #502 <Method String String.format(Locale, String, Object[])>
	//   42   81:aload_2         
	//   43   82:invokevirtual   #584 <Method long Date.getTime()>
	//   44   85:ldc2w           #585 <Long 1000L>
	//   45   88:ldiv            
	//   46   89:invokestatic    #671 <Method void SessionProtobufHelper.writeBeginSession(CodedOutputStream, String, String, long)>
		}
	//*  47   92:aload_3         
	//*  48   93:ldc2            #673 <String "Failed to flush to session begin file.">
	//*  49   96:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  50   99:aload           4
	//*  51  101:ldc2            #675 <String "Failed to close begin session file.">
	//*  52  104:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  53  107:return          
	//*  54  108:astore_1        
	//*  55  109:goto            119
		// Misplaced declaration of an exception variable
		catch(Date date)
	//*  56  112:astore_2        
		{
			break MISSING_BLOCK_LABEL_131;
	//   57  113:goto            131
		}
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close begin session file.");
		return;
		s;
		break MISSING_BLOCK_LABEL_119;
		s;
	//   58  116:astore_1        
		obj = null;
	//   59  117:aconst_null     
	//   60  118:astore_3        
		date = ((Date) (obj1));
	//   61  119:aload           4
	//   62  121:astore_2        
		obj1 = ((Object) (s));
	//   63  122:aload_1         
	//   64  123:astore          4
		break MISSING_BLOCK_LABEL_165;
	//   65  125:goto            165
		date;
	//   66  128:astore_2        
		obj = null;
	//   67  129:aconst_null     
	//   68  130:astore_3        
		s = ((String) (obj1));
	//   69  131:aload           4
	//   70  133:astore_1        
		break MISSING_BLOCK_LABEL_154;
	//   71  134:goto            154
		Exception exception;
		exception;
	//   72  137:astore          4
		s = null;
	//   73  139:aconst_null     
	//   74  140:astore_1        
		date = ((Date) (obj));
	//   75  141:aload_3         
	//   76  142:astore_2        
		obj = ((Object) (s));
	//   77  143:aload_1         
	//   78  144:astore_3        
		break MISSING_BLOCK_LABEL_165;
	//   79  145:goto            165
		date;
	//   80  148:astore_2        
		obj = null;
	//   81  149:aconst_null     
	//   82  150:astore_3        
		s = ((String) (obj2));
	//   83  151:aload           5
	//   84  153:astore_1        
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (date)), ((java.io.OutputStream) (s)));
	//   85  154:aload_2         
	//   86  155:aload_1         
	//   87  156:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		throw date;
	//   88  159:aload_2         
	//   89  160:athrow          
		exception;
	//   90  161:astore          4
		date = ((Date) (s));
	//   91  163:aload_1         
	//   92  164:astore_2        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
	//   93  165:aload_3         
	//   94  166:ldc2            #673 <String "Failed to flush to session begin file.">
	//   95  169:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (date)), "Failed to close begin session file.");
	//   96  172:aload_2         
	//   97  173:ldc2            #675 <String "Failed to close begin session file.">
	//   98  176:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw exception;
	//   99  179:aload           4
	//  100  181:athrow          
	}

	private void writeExternalCrashEvent(SessionEventData sessioneventdata)
		throws IOException
	{
		Object obj3;
		Object obj4;
		obj4 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		obj3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		String s = getPreviousSessionId();
	//    4    6:aload_0         
	//    5    7:invokespecial   #677 <Method String getPreviousSessionId()>
	//    6   10:astore          6
		if(s != null)
			break MISSING_BLOCK_LABEL_47;
	//    7   12:aload           6
	//    8   14:ifnonnull       47
		Fabric.getLogger().e("CrashlyticsCore", "Tried to write a native crash while no session was open.", ((Throwable) (null)));
	//    9   17:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   10   20:ldc2            #287 <String "CrashlyticsCore">
	//   11   23:ldc2            #679 <String "Tried to write a native crash while no session was open.">
	//   12   26:aconst_null     
	//   13   27:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   14   32:aconst_null     
	//   15   33:ldc2            #673 <String "Failed to flush to session begin file.">
	//   16   36:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   17   39:aconst_null     
	//   18   40:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//   19   43:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   20   46:return          
		Object obj;
		CrashlyticsCore.recordFatalExceptionEvent(s);
	//   21   47:aload           6
	//   22   49:invokestatic    #684 <Method void CrashlyticsCore.recordFatalExceptionEvent(String)>
		obj = ((Object) (getFilesDir()));
	//   23   52:aload_0         
	//   24   53:invokespecial   #262 <Method File getFilesDir()>
	//   25   56:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   26   57:new             #301 <Class StringBuilder>
	//   27   60:dup             
	//   28   61:invokespecial   #302 <Method void StringBuilder()>
	//   29   64:astore_3        
		stringbuilder.append(s);
	//   30   65:aload_3         
	//   31   66:aload           6
	//   32   68:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
		stringbuilder.append("SessionCrash");
	//   34   72:aload_3         
	//   35   73:ldc1            #88  <String "SessionCrash">
	//   36   75:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   37   78:pop             
		obj = ((Object) (new ClsFileOutputStream(((File) (obj)), stringbuilder.toString())));
	//   38   79:new             #319 <Class ClsFileOutputStream>
	//   39   82:dup             
	//   40   83:aload_2         
	//   41   84:aload_3         
	//   42   85:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   43   88:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   44   91:astore_2        
		Object obj1;
		Object obj2;
		try
		{
			obj1 = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj)))));
	//   45   92:aload_2         
	//   46   93:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   47   96:astore_3        
		}
	//*  48   97:new             #523 <Class MetaDataStore>
	//*  49  100:dup             
	//*  50  101:aload_0         
	//*  51  102:invokespecial   #262 <Method File getFilesDir()>
	//*  52  105:invokespecial   #526 <Method void MetaDataStore(File)>
	//*  53  108:aload           6
	//*  54  110:invokevirtual   #688 <Method Map MetaDataStore.readKeyData(String)>
	//*  55  113:astore          4
	//*  56  115:aload_1         
	//*  57  116:new             #207 <Class LogFileManager>
	//*  58  119:dup             
	//*  59  120:aload_0         
	//*  60  121:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  61  124:invokevirtual   #205 <Method Context CrashlyticsCore.getContext()>
	//*  62  127:aload_0         
	//*  63  128:getfield        #192 <Field FileStore fileStore>
	//*  64  131:aload           6
	//*  65  133:invokespecial   #691 <Method void LogFileManager(Context, FileStore, String)>
	//*  66  136:aload           4
	//*  67  138:aload_3         
	//*  68  139:invokestatic    #697 <Method void NativeCrashWriter.writeNativeCrash(SessionEventData, LogFileManager, Map, CodedOutputStream)>
	//*  69  142:aload_3         
	//*  70  143:ldc2            #673 <String "Failed to flush to session begin file.">
	//*  71  146:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  72  149:aload_2         
	//*  73  150:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//*  74  153:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  75  156:return          
	//*  76  157:astore          4
	//*  77  159:aload_3         
	//*  78  160:astore_1        
	//*  79  161:aload           4
	//*  80  163:astore_3        
	//*  81  164:goto            241
	//*  82  167:astore          4
	//*  83  169:aload_3         
	//*  84  170:astore_1        
	//*  85  171:aload           4
	//*  86  173:astore_3        
	//*  87  174:goto            187
	//*  88  177:astore_3        
	//*  89  178:aload           5
	//*  90  180:astore_1        
	//*  91  181:goto            241
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//*  92  184:astore_3        
		{
			sessioneventdata = null;
	//   93  185:aconst_null     
	//   94  186:astore_1        
			break MISSING_BLOCK_LABEL_205;
	//   95  187:goto            205
		}
		try
		{
			obj3 = ((Object) ((new MetaDataStore(getFilesDir())).readKeyData(s)));
			NativeCrashWriter.writeNativeCrash(sessioneventdata, new LogFileManager(crashlyticsCore.getContext(), fileStore, s), ((Map) (obj3)), ((CodedOutputStream) (obj1)));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj3)
		{
			sessioneventdata = ((SessionEventData) (obj1));
			obj2 = obj3;
			break MISSING_BLOCK_LABEL_205;
		}
		CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
		return;
		obj3;
		sessioneventdata = ((SessionEventData) (obj1));
		obj1 = obj3;
		break MISSING_BLOCK_LABEL_241;
		obj2;
		sessioneventdata = ((SessionEventData) (obj4));
		break MISSING_BLOCK_LABEL_241;
		obj2;
	//   96  190:astore_3        
		obj = null;
	//   97  191:aconst_null     
	//   98  192:astore_2        
		sessioneventdata = ((SessionEventData) (obj4));
	//   99  193:aload           5
	//  100  195:astore_1        
		break MISSING_BLOCK_LABEL_241;
	//  101  196:goto            241
		obj2;
	//  102  199:astore_3        
		sessioneventdata = null;
	//  103  200:aconst_null     
	//  104  201:astore_1        
		obj = obj3;
	//  105  202:aload           4
	//  106  204:astore_2        
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the native crash logger", ((Throwable) (obj2)));
	//  107  205:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//  108  208:ldc2            #287 <String "CrashlyticsCore">
	//  109  211:ldc2            #699 <String "An error occurred in the native crash logger">
	//  110  214:aload_3         
	//  111  215:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
	//  112  220:aload_3         
	//  113  221:aload_2         
	//  114  222:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		CommonUtils.flushOrLog(((java.io.Flushable) (sessioneventdata)), "Failed to flush to session begin file.");
	//  115  225:aload_1         
	//  116  226:ldc2            #673 <String "Failed to flush to session begin file.">
	//  117  229:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
	//  118  232:aload_2         
	//  119  233:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//  120  236:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  121  239:return          
		obj2;
	//  122  240:astore_3        
		CommonUtils.flushOrLog(((java.io.Flushable) (sessioneventdata)), "Failed to flush to session begin file.");
	//  123  241:aload_1         
	//  124  242:ldc2            #673 <String "Failed to flush to session begin file.">
	//  125  245:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
	//  126  248:aload_2         
	//  127  249:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//  128  252:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj2;
	//  129  255:aload_3         
	//  130  256:athrow          
	}

	private void writeFatal(Date date, Thread thread, Throwable throwable)
	{
		CodedOutputStream codedoutputstream;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		codedoutputstream = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		Object obj = ((Object) (getCurrentSessionId()));
	//    4    6:aload_0         
	//    5    7:invokespecial   #256 <Method String getCurrentSessionId()>
	//    6   10:astore          4
		if(obj != null)
			break MISSING_BLOCK_LABEL_47;
	//    7   12:aload           4
	//    8   14:ifnonnull       47
		Fabric.getLogger().e("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", ((Throwable) (null)));
	//    9   17:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   10   20:ldc2            #287 <String "CrashlyticsCore">
	//   11   23:ldc2            #701 <String "Tried to write a fatal exception while no session was open.">
	//   12   26:aconst_null     
	//   13   27:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		CommonUtils.flushOrLog(((java.io.Flushable) (null)), "Failed to flush to session begin file.");
	//   14   32:aconst_null     
	//   15   33:ldc2            #673 <String "Failed to flush to session begin file.">
	//   16   36:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (null)), "Failed to close fatal exception file output stream.");
	//   17   39:aconst_null     
	//   18   40:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//   19   43:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//   20   46:return          
		CrashlyticsCore.recordFatalExceptionEvent(((String) (obj)));
	//   21   47:aload           4
	//   22   49:invokestatic    #684 <Method void CrashlyticsCore.recordFatalExceptionEvent(String)>
		File file = getFilesDir();
	//   23   52:aload_0         
	//   24   53:invokespecial   #262 <Method File getFilesDir()>
	//   25   56:astore          7
		StringBuilder stringbuilder = new StringBuilder();
	//   26   58:new             #301 <Class StringBuilder>
	//   27   61:dup             
	//   28   62:invokespecial   #302 <Method void StringBuilder()>
	//   29   65:astore          8
		stringbuilder.append(((String) (obj)));
	//   30   67:aload           8
	//   31   69:aload           4
	//   32   71:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   33   74:pop             
		stringbuilder.append("SessionCrash");
	//   34   75:aload           8
	//   35   77:ldc1            #88  <String "SessionCrash">
	//   36   79:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   37   82:pop             
		obj = ((Object) (new ClsFileOutputStream(file, stringbuilder.toString())));
	//   38   83:new             #319 <Class ClsFileOutputStream>
	//   39   86:dup             
	//   40   87:aload           7
	//   41   89:aload           8
	//   42   91:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   43   94:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   44   97:astore          4
		codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
	//   45   99:aload           4
	//   46  101:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   47  104:astore          5
		try
		{
			writeSessionEvent(codedoutputstream, date, thread, throwable, "crash", true);
	//   48  106:aload_0         
	//   49  107:aload           5
	//   50  109:aload_1         
	//   51  110:aload_2         
	//   52  111:aload_3         
	//   53  112:ldc1            #53  <String "crash">
	//   54  114:iconst_1        
	//   55  115:invokespecial   #442 <Method void writeSessionEvent(CodedOutputStream, Date, Thread, Throwable, String, boolean)>
		}
	//*  56  118:aload           5
	//*  57  120:ldc2            #673 <String "Failed to flush to session begin file.">
	//*  58  123:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  59  126:aload           4
	//*  60  128:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//*  61  131:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  62  134:return          
	//*  63  135:astore_2        
	//*  64  136:aload           5
	//*  65  138:astore_1        
	//*  66  139:goto            220
		// Misplaced declaration of an exception variable
		catch(Thread thread)
	//*  67  142:astore_2        
		{
			date = ((Date) (codedoutputstream));
	//   68  143:aload           5
	//   69  145:astore_1        
			break MISSING_BLOCK_LABEL_159;
	//   70  146:goto            159
		}
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to session begin file.");
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
		return;
		thread;
		date = ((Date) (codedoutputstream));
		break MISSING_BLOCK_LABEL_220;
		thread;
	//   71  149:astore_2        
		date = ((Date) (obj1));
	//   72  150:aload           6
	//   73  152:astore_1        
		break MISSING_BLOCK_LABEL_220;
	//   74  153:goto            220
		thread;
	//   75  156:astore_2        
		date = null;
	//   76  157:aconst_null     
	//   77  158:astore_1        
		throwable = ((Throwable) (obj));
	//   78  159:aload           4
	//   79  161:astore_3        
		break MISSING_BLOCK_LABEL_181;
	//   80  162:goto            181
		thread;
	//   81  165:astore_2        
		obj = null;
	//   82  166:aconst_null     
	//   83  167:astore          4
		date = ((Date) (obj1));
	//   84  169:aload           6
	//   85  171:astore_1        
		break MISSING_BLOCK_LABEL_220;
	//   86  172:goto            220
		thread;
	//   87  175:astore_2        
		date = null;
	//   88  176:aconst_null     
	//   89  177:astore_1        
		throwable = ((Throwable) (codedoutputstream));
	//   90  178:aload           5
	//   91  180:astore_3        
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the fatal exception logger", ((Throwable) (thread)));
	//   92  181:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   93  184:ldc2            #287 <String "CrashlyticsCore">
	//   94  187:ldc2            #703 <String "An error occurred in the fatal exception logger">
	//   95  190:aload_2         
	//   96  191:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (thread)), ((java.io.OutputStream) (throwable)));
	//   97  196:aload_2         
	//   98  197:aload_3         
	//   99  198:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to session begin file.");
	//  100  201:aload_1         
	//  101  202:ldc2            #673 <String "Failed to flush to session begin file.">
	//  102  205:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (throwable)), "Failed to close fatal exception file output stream.");
	//  103  208:aload_3         
	//  104  209:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//  105  212:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		return;
	//  106  215:return          
		thread;
	//  107  216:astore_2        
		obj = ((Object) (throwable));
	//  108  217:aload_3         
	//  109  218:astore          4
		CommonUtils.flushOrLog(((java.io.Flushable) (date)), "Failed to flush to session begin file.");
	//  110  220:aload_1         
	//  111  221:ldc2            #673 <String "Failed to flush to session begin file.">
	//  112  224:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
	//  113  227:aload           4
	//  114  229:ldc2            #681 <String "Failed to close fatal exception file output stream.">
	//  115  232:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw thread;
	//  116  235:aload_2         
	//  117  236:athrow          
	}

	private void writeInitialPartsTo(CodedOutputStream codedoutputstream, String s)
		throws IOException
	{
		String as[] = INITIAL_SESSION_PART_TAGS;
	//    0    0:getstatic       #164 <Field String[] INITIAL_SESSION_PART_TAGS>
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
	//   14   24:new             #301 <Class StringBuilder>
	//   15   27:dup             
	//   16   28:invokespecial   #302 <Method void StringBuilder()>
	//   17   31:astore          7
			((StringBuilder) (obj)).append(s);
	//   18   33:aload           7
	//   19   35:aload_2         
	//   20   36:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
			((StringBuilder) (obj)).append(s1);
	//   22   40:aload           7
	//   23   42:aload           6
	//   24   44:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   26   48:aload_0         
	//   27   49:new             #37  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   28   52:dup             
	//   29   53:aload           7
	//   30   55:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   31   58:invokespecial   #503 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   32   61:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
	//   33   64:astore          7
			if(obj.length == 0)
	//*  34   66:aload           7
	//*  35   68:arraylength     
	//*  36   69:ifne            138
			{
				obj = ((Object) (Fabric.getLogger()));
	//   37   72:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   38   75:astore          7
				StringBuilder stringbuilder = new StringBuilder();
	//   39   77:new             #301 <Class StringBuilder>
	//   40   80:dup             
	//   41   81:invokespecial   #302 <Method void StringBuilder()>
	//   42   84:astore          8
				stringbuilder.append("Can't find ");
	//   43   86:aload           8
	//   44   88:ldc2            #705 <String "Can't find ">
	//   45   91:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
				stringbuilder.append(s1);
	//   47   95:aload           8
	//   48   97:aload           6
	//   49   99:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   50  102:pop             
				stringbuilder.append(" data for session ID ");
	//   51  103:aload           8
	//   52  105:ldc2            #707 <String " data for session ID ">
	//   53  108:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:pop             
				stringbuilder.append(s);
	//   55  112:aload           8
	//   56  114:aload_2         
	//   57  115:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
				((Logger) (obj)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   59  119:aload           7
	//   60  121:ldc2            #287 <String "CrashlyticsCore">
	//   61  124:aload           8
	//   62  126:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   63  129:aconst_null     
	//   64  130:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
			} else
	//*  65  135:goto            208
			{
				Logger logger = Fabric.getLogger();
	//   66  138:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   67  141:astore          8
				StringBuilder stringbuilder1 = new StringBuilder();
	//   68  143:new             #301 <Class StringBuilder>
	//   69  146:dup             
	//   70  147:invokespecial   #302 <Method void StringBuilder()>
	//   71  150:astore          9
				stringbuilder1.append("Collecting ");
	//   72  152:aload           9
	//   73  154:ldc2            #709 <String "Collecting ">
	//   74  157:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   75  160:pop             
				stringbuilder1.append(s1);
	//   76  161:aload           9
	//   77  163:aload           6
	//   78  165:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   79  168:pop             
				stringbuilder1.append(" data for session ID ");
	//   80  169:aload           9
	//   81  171:ldc2            #707 <String " data for session ID ">
	//   82  174:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   83  177:pop             
				stringbuilder1.append(s);
	//   84  178:aload           9
	//   85  180:aload_2         
	//   86  181:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   87  184:pop             
				logger.d("CrashlyticsCore", stringbuilder1.toString());
	//   88  185:aload           8
	//   89  187:ldc2            #287 <String "CrashlyticsCore">
	//   90  190:aload           9
	//   91  192:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   92  195:invokeinterface #295 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, ((File) (obj[0])));
	//   93  200:aload_1         
	//   94  201:aload           7
	//   95  203:iconst_0        
	//   96  204:aaload          
	//   97  205:invokestatic    #580 <Method void writeToCosFromFile(CodedOutputStream, File)>
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
	//    1    1:getstatic       #712 <Field Comparator CommonUtils.FILE_MODIFIED_COMPARATOR>
	//    2    4:invokestatic    #561 <Method void Arrays.sort(Object[], Comparator)>
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
	//   15   24:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   16   27:ldc2            #287 <String "CrashlyticsCore">
	//   17   30:getstatic       #490 <Field Locale Locale.US>
	//   18   33:ldc2            #714 <String "Found Non Fatal for session ID %s in %s ">
	//   19   36:iconst_2        
	//   20   37:anewarray       Object[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:aload_2         
	//   24   43:aastore         
	//   25   44:dup             
	//   26   45:iconst_1        
	//   27   46:aload           5
	//   28   48:invokevirtual   #478 <Method String File.getName()>
	//   29   51:aastore         
	//   30   52:invokestatic    #502 <Method String String.format(Locale, String, Object[])>
	//   31   55:invokeinterface #295 <Method void Logger.d(String, String)>
				writeToCosFromFile(codedoutputstream, file);
	//   32   60:aload_0         
	//   33   61:aload           5
	//   34   63:invokestatic    #580 <Method void writeToCosFromFile(CodedOutputStream, File)>
			}
	//*  35   66:goto            87
			catch(Exception exception)
	//*  36   69:astore          5
			{
				Fabric.getLogger().e("CrashlyticsCore", "Error writting non-fatal to session.", ((Throwable) (exception)));
	//   37   71:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   38   74:ldc2            #287 <String "CrashlyticsCore">
	//   39   77:ldc2            #716 <String "Error writting non-fatal to session.">
	//   40   80:aload           5
	//   41   82:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
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
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method File getFilesDir()>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #301 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #302 <Method void StringBuilder()>
	//    6   12:astore_3        
		stringbuilder.append(s);
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   10   18:pop             
		stringbuilder.append("SessionApp");
	//   11   19:aload_3         
	//   12   20:ldc1            #79  <String "SessionApp">
	//   13   22:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		s = ((String) (new ClsFileOutputStream(file, stringbuilder.toString())));
	//   15   26:new             #319 <Class ClsFileOutputStream>
	//   16   29:dup             
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   20   35:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   21   38:astore_1        
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		CodedOutputStream codedoutputstream;
		try
		{
			codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (s)));
	//   22   39:aload_1         
	//   23   40:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   43:astore          6
		}
	//*  25   45:aload_1         
	//*  26   46:astore_2        
	//*  27   47:aload           6
	//*  28   49:astore          5
	//*  29   51:aload           6
	//*  30   53:aload_0         
	//*  31   54:getfield        #180 <Field IdManager idManager>
	//*  32   57:invokevirtual   #721 <Method String IdManager.getAppIdentifier()>
	//*  33   60:aload_0         
	//*  34   61:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  35   64:invokevirtual   #724 <Method String CrashlyticsCore.getApiKey()>
	//*  36   67:aload_0         
	//*  37   68:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  38   71:invokevirtual   #727 <Method String CrashlyticsCore.getVersionCode()>
	//*  39   74:aload_0         
	//*  40   75:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  41   78:invokevirtual   #730 <Method String CrashlyticsCore.getVersionName()>
	//*  42   81:aload_0         
	//*  43   82:getfield        #180 <Field IdManager idManager>
	//*  44   85:invokevirtual   #733 <Method String IdManager.getAppInstallIdentifier()>
	//*  45   88:aload_0         
	//*  46   89:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  47   92:invokevirtual   #736 <Method String CrashlyticsCore.getInstallerPackageName()>
	//*  48   95:invokestatic    #742 <Method DeliveryMechanism DeliveryMechanism.determineFrom(String)>
	//*  49   98:invokevirtual   #745 <Method int DeliveryMechanism.getId()>
	//*  50  101:aload_0         
	//*  51  102:getfield        #190 <Field String unityVersion>
	//*  52  105:invokestatic    #748 <Method void SessionProtobufHelper.writeSessionApp(CodedOutputStream, String, String, String, String, String, int, String)>
	//*  53  108:aload           6
	//*  54  110:ldc2            #750 <String "Failed to flush to session app file.">
	//*  55  113:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  56  116:aload_1         
	//*  57  117:ldc2            #752 <String "Failed to close session app file.">
	//*  58  120:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  59  123:return          
	//*  60  124:astore_3        
	//*  61  125:aload_1         
	//*  62  126:astore          4
	//*  63  128:aload           6
	//*  64  130:astore_1        
	//*  65  131:goto            168
	//*  66  134:astore_2        
	//*  67  135:aconst_null     
	//*  68  136:astore          5
	//*  69  138:goto            193
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  70  141:astore_3        
		{
			obj = null;
	//   71  142:aconst_null     
	//   72  143:astore_2        
			obj2 = ((Object) (s));
	//   73  144:aload_1         
	//   74  145:astore          4
			s = ((String) (obj));
	//   75  147:aload_2         
	//   76  148:astore_1        
			break MISSING_BLOCK_LABEL_168;
	//   77  149:goto            168
		}
		obj = ((Object) (s));
		obj3 = ((Object) (codedoutputstream));
		SessionProtobufHelper.writeSessionApp(codedoutputstream, idManager.getAppIdentifier(), crashlyticsCore.getApiKey(), crashlyticsCore.getVersionCode(), crashlyticsCore.getVersionName(), idManager.getAppInstallIdentifier(), DeliveryMechanism.determineFrom(crashlyticsCore.getInstallerPackageName()).getId(), unityVersion);
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush to session app file.");
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close session app file.");
		return;
		obj1;
		obj2 = ((Object) (s));
		s = ((String) (codedoutputstream));
		break MISSING_BLOCK_LABEL_168;
		obj;
		obj3 = null;
		break MISSING_BLOCK_LABEL_193;
		obj;
	//   78  152:astore_2        
		s = null;
	//   79  153:aconst_null     
	//   80  154:astore_1        
		obj3 = ((Object) (s));
	//   81  155:aload_1         
	//   82  156:astore          5
		break MISSING_BLOCK_LABEL_193;
	//   83  158:goto            193
		obj1;
	//   84  161:astore_3        
		obj2 = null;
	//   85  162:aconst_null     
	//   86  163:astore          4
		s = ((String) (obj2));
	//   87  165:aload           4
	//   88  167:astore_1        
		obj = obj2;
	//   89  168:aload           4
	//   90  170:astore_2        
		obj3 = ((Object) (s));
	//   91  171:aload_1         
	//   92  172:astore          5
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj1)), ((java.io.OutputStream) (obj2)));
	//   93  174:aload_3         
	//   94  175:aload           4
	//   95  177:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		obj = obj2;
	//   96  180:aload           4
	//   97  182:astore_2        
		obj3 = ((Object) (s));
	//   98  183:aload_1         
	//   99  184:astore          5
		throw obj1;
	//  100  186:aload_3         
	//  101  187:athrow          
		obj1;
	//  102  188:astore_3        
		s = ((String) (obj));
	//  103  189:aload_2         
	//  104  190:astore_1        
		obj = obj1;
	//  105  191:aload_3         
	//  106  192:astore_2        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj3)), "Failed to flush to session app file.");
	//  107  193:aload           5
	//  108  195:ldc2            #750 <String "Failed to flush to session app file.">
	//  109  198:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close session app file.");
	//  110  201:aload_1         
	//  111  202:ldc2            #752 <String "Failed to close session app file.">
	//  112  205:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj;
	//  113  208:aload_2         
	//  114  209:athrow          
	}

	private void writeSessionDevice(String s)
		throws Exception
	{
		File file = getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method File getFilesDir()>
	//    2    4:astore          12
		StringBuilder stringbuilder = new StringBuilder();
	//    3    6:new             #301 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #302 <Method void StringBuilder()>
	//    6   13:astore          13
		stringbuilder.append(s);
	//    7   15:aload           13
	//    8   17:aload_1         
	//    9   18:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
		stringbuilder.append("SessionDevice");
	//   11   22:aload           13
	//   12   24:ldc1            #85  <String "SessionDevice">
	//   13   26:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		s = ((String) (new ClsFileOutputStream(file, stringbuilder.toString())));
	//   15   30:new             #319 <Class ClsFileOutputStream>
	//   16   33:dup             
	//   17   34:aload           12
	//   18   36:aload           13
	//   19   38:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   20   41:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   21   44:astore_1        
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		int i;
		int j;
		int k;
		long l;
		long l1;
		long l2;
		boolean flag;
		Context context;
		CodedOutputStream codedoutputstream;
		Object obj4;
		try
		{
			codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (s)));
	//   22   45:aload_1         
	//   23   46:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   24   49:astore          16
		}
	//*  25   51:aload_1         
	//*  26   52:astore          13
	//*  27   54:aload           16
	//*  28   56:astore          12
	//*  29   58:aload_0         
	//*  30   59:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  31   62:invokevirtual   #205 <Method Context CrashlyticsCore.getContext()>
	//*  32   65:astore          14
	//*  33   67:aload_1         
	//*  34   68:astore          13
	//*  35   70:aload           16
	//*  36   72:astore          12
	//*  37   74:new             #754 <Class StatFs>
	//*  38   77:dup             
	//*  39   78:invokestatic    #759 <Method File Environment.getDataDirectory()>
	//*  40   81:invokevirtual   #762 <Method String File.getPath()>
	//*  41   84:invokespecial   #763 <Method void StatFs(String)>
	//*  42   87:astore          17
	//*  43   89:aload_1         
	//*  44   90:astore          13
	//*  45   92:aload           16
	//*  46   94:astore          12
	//*  47   96:aload_0         
	//*  48   97:getfield        #180 <Field IdManager idManager>
	//*  49  100:invokevirtual   #766 <Method String IdManager.getDeviceUUID()>
	//*  50  103:astore          15
	//*  51  105:aload_1         
	//*  52  106:astore          13
	//*  53  108:aload           16
	//*  54  110:astore          12
	//*  55  112:invokestatic    #769 <Method int CommonUtils.getCpuArchitectureInt()>
	//*  56  115:istore_2        
	//*  57  116:aload_1         
	//*  58  117:astore          13
	//*  59  119:aload           16
	//*  60  121:astore          12
	//*  61  123:invokestatic    #773 <Method Runtime Runtime.getRuntime()>
	//*  62  126:invokevirtual   #776 <Method int Runtime.availableProcessors()>
	//*  63  129:istore_3        
	//*  64  130:aload_1         
	//*  65  131:astore          13
	//*  66  133:aload           16
	//*  67  135:astore          12
	//*  68  137:invokestatic    #779 <Method long CommonUtils.getTotalRamInBytes()>
	//*  69  140:lstore          5
	//*  70  142:aload_1         
	//*  71  143:astore          13
	//*  72  145:aload           16
	//*  73  147:astore          12
	//*  74  149:aload           17
	//*  75  151:invokevirtual   #782 <Method int StatFs.getBlockCount()>
	//*  76  154:i2l             
	//*  77  155:lstore          7
	//*  78  157:aload_1         
	//*  79  158:astore          13
	//*  80  160:aload           16
	//*  81  162:astore          12
	//*  82  164:aload           17
	//*  83  166:invokevirtual   #785 <Method int StatFs.getBlockSize()>
	//*  84  169:i2l             
	//*  85  170:lstore          9
	//*  86  172:aload_1         
	//*  87  173:astore          13
	//*  88  175:aload           16
	//*  89  177:astore          12
	//*  90  179:aload           14
	//*  91  181:invokestatic    #789 <Method boolean CommonUtils.isEmulator(Context)>
	//*  92  184:istore          11
	//*  93  186:aload_1         
	//*  94  187:astore          13
	//*  95  189:aload           16
	//*  96  191:astore          12
	//*  97  193:aload_0         
	//*  98  194:getfield        #180 <Field IdManager idManager>
	//*  99  197:invokevirtual   #792 <Method Map IdManager.getDeviceIdentifiers()>
	//* 100  200:astore          17
	//* 101  202:aload_1         
	//* 102  203:astore          13
	//* 103  205:aload           16
	//* 104  207:astore          12
	//* 105  209:aload           14
	//* 106  211:invokestatic    #796 <Method int CommonUtils.getDeviceState(Context)>
	//* 107  214:istore          4
	//* 108  216:aload_1         
	//* 109  217:astore          13
	//* 110  219:aload           16
	//* 111  221:astore          12
	//* 112  223:aload           16
	//* 113  225:aload           15
	//* 114  227:iload_2         
	//* 115  228:getstatic       #801 <Field String Build.MODEL>
	//* 116  231:iload_3         
	//* 117  232:lload           5
	//* 118  234:lload           7
	//* 119  236:lload           9
	//* 120  238:lmul            
	//* 121  239:iload           11
	//* 122  241:aload           17
	//* 123  243:iload           4
	//* 124  245:getstatic       #804 <Field String Build.MANUFACTURER>
	//* 125  248:getstatic       #807 <Field String Build.PRODUCT>
	//* 126  251:invokestatic    #810 <Method void SessionProtobufHelper.writeSessionDevice(CodedOutputStream, String, int, String, int, long, long, boolean, Map, int, String, String)>
	//* 127  254:aload           16
	//* 128  256:ldc2            #812 <String "Failed to flush session device info.">
	//* 129  259:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//* 130  262:aload_1         
	//* 131  263:ldc2            #814 <String "Failed to close session device file.">
	//* 132  266:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//* 133  269:return          
	//* 134  270:astore          14
	//* 135  272:aload_1         
	//* 136  273:astore          15
	//* 137  275:aload           16
	//* 138  277:astore_1        
	//* 139  278:goto            321
	//* 140  281:astore          14
	//* 141  283:aconst_null     
	//* 142  284:astore          12
	//* 143  286:goto            310
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//* 144  289:astore          14
		{
			obj = null;
	//  145  291:aconst_null     
	//  146  292:astore          12
			obj3 = ((Object) (s));
	//  147  294:aload_1         
	//  148  295:astore          15
			s = ((String) (obj));
	//  149  297:aload           12
	//  150  299:astore_1        
			break MISSING_BLOCK_LABEL_321;
	//  151  300:goto            321
		}
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		context = crashlyticsCore.getContext();
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		obj4 = ((Object) (new StatFs(Environment.getDataDirectory().getPath())));
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		obj3 = ((Object) (idManager.getDeviceUUID()));
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		i = CommonUtils.getCpuArchitectureInt();
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		j = Runtime.getRuntime().availableProcessors();
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		l = CommonUtils.getTotalRamInBytes();
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		l1 = ((StatFs) (obj4)).getBlockCount();
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		l2 = ((StatFs) (obj4)).getBlockSize();
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		flag = CommonUtils.isEmulator(context);
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		obj4 = ((Object) (idManager.getDeviceIdentifiers()));
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		k = CommonUtils.getDeviceState(context);
		obj1 = ((Object) (s));
		obj = ((Object) (codedoutputstream));
		SessionProtobufHelper.writeSessionDevice(codedoutputstream, ((String) (obj3)), i, Build.MODEL, j, l, l1 * l2, flag, ((Map) (obj4)), k, Build.MANUFACTURER, Build.PRODUCT);
		CommonUtils.flushOrLog(((java.io.Flushable) (codedoutputstream)), "Failed to flush session device info.");
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close session device file.");
		return;
		obj2;
		obj3 = ((Object) (s));
		s = ((String) (codedoutputstream));
		break MISSING_BLOCK_LABEL_321;
		obj2;
		obj = null;
		break MISSING_BLOCK_LABEL_353;
		obj2;
	//  152  303:astore          14
		s = null;
	//  153  305:aconst_null     
	//  154  306:astore_1        
		obj = ((Object) (s));
	//  155  307:aload_1         
	//  156  308:astore          12
		break MISSING_BLOCK_LABEL_353;
	//  157  310:goto            353
		obj2;
	//  158  313:astore          14
		obj3 = null;
	//  159  315:aconst_null     
	//  160  316:astore          15
		s = ((String) (obj3));
	//  161  318:aload           15
	//  162  320:astore_1        
		obj1 = obj3;
	//  163  321:aload           15
	//  164  323:astore          13
		obj = ((Object) (s));
	//  165  325:aload_1         
	//  166  326:astore          12
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj2)), ((java.io.OutputStream) (obj3)));
	//  167  328:aload           14
	//  168  330:aload           15
	//  169  332:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		obj1 = obj3;
	//  170  335:aload           15
	//  171  337:astore          13
		obj = ((Object) (s));
	//  172  339:aload_1         
	//  173  340:astore          12
		throw obj2;
	//  174  342:aload           14
	//  175  344:athrow          
		obj2;
	//  176  345:astore          14
		s = ((String) (obj1));
	//  177  347:aload           13
	//  178  349:astore_1        
	//* 179  350:goto            310
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush session device info.");
	//  180  353:aload           12
	//  181  355:ldc2            #812 <String "Failed to flush session device info.">
	//  182  358:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (s)), "Failed to close session device file.");
	//  183  361:aload_1         
	//  184  362:ldc2            #814 <String "Failed to close session device file.">
	//  185  365:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj2;
	//  186  368:aload           14
	//  187  370:athrow          
	}

	private void writeSessionEvent(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
		throws Exception
	{
		Context context = crashlyticsCore.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #205 <Method Context CrashlyticsCore.getContext()>
	//    3    7:astore          21
		long l = date.getTime() / 1000L;
	//    4    9:aload_2         
	//    5   10:invokevirtual   #584 <Method long Date.getTime()>
	//    6   13:ldc2w           #585 <Long 1000L>
	//    7   16:ldiv            
	//    8   17:lstore          12
		float f = CommonUtils.getBatteryLevel(context);
	//    9   19:aload           21
	//   10   21:invokestatic    #818 <Method float CommonUtils.getBatteryLevel(Context)>
	//   11   24:fstore          7
		int j = CommonUtils.getBatteryVelocity(context, devicePowerStateListener.isPowerConnected());
	//   12   26:aload           21
	//   13   28:aload_0         
	//   14   29:getfield        #219 <Field DevicePowerStateListener devicePowerStateListener>
	//   15   32:invokevirtual   #821 <Method boolean DevicePowerStateListener.isPowerConnected()>
	//   16   35:invokestatic    #825 <Method int CommonUtils.getBatteryVelocity(Context, boolean)>
	//   17   38:istore          9
		boolean flag1 = CommonUtils.getProximitySensorEnabled(context);
	//   18   40:aload           21
	//   19   42:invokestatic    #828 <Method boolean CommonUtils.getProximitySensorEnabled(Context)>
	//   20   45:istore          11
		int k = context.getResources().getConfiguration().orientation;
	//   21   47:aload           21
	//   22   49:invokevirtual   #834 <Method Resources Context.getResources()>
	//   23   52:invokevirtual   #840 <Method Configuration Resources.getConfiguration()>
	//   24   55:getfield        #845 <Field int Configuration.orientation>
	//   25   58:istore          10
		long l1 = CommonUtils.getTotalRamInBytes();
	//   26   60:invokestatic    #779 <Method long CommonUtils.getTotalRamInBytes()>
	//   27   63:lstore          14
		long l2 = CommonUtils.calculateFreeRamInBytes(context);
	//   28   65:aload           21
	//   29   67:invokestatic    #849 <Method long CommonUtils.calculateFreeRamInBytes(Context)>
	//   30   70:lstore          16
		long l3 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
	//   31   72:invokestatic    #759 <Method File Environment.getDataDirectory()>
	//   32   75:invokevirtual   #762 <Method String File.getPath()>
	//   33   78:invokestatic    #853 <Method long CommonUtils.calculateUsedDiskSpaceInBytes(String)>
	//   34   81:lstore          18
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = CommonUtils.getAppProcessInfo(context.getPackageName(), context);
	//   35   83:aload           21
	//   36   85:invokevirtual   #856 <Method String Context.getPackageName()>
	//   37   88:aload           21
	//   38   90:invokestatic    #860 <Method android.app.ActivityManager$RunningAppProcessInfo CommonUtils.getAppProcessInfo(String, Context)>
	//   39   93:astore          22
		LinkedList linkedlist = new LinkedList();
	//   40   95:new             #862 <Class LinkedList>
	//   41   98:dup             
	//   42   99:invokespecial   #863 <Method void LinkedList()>
	//   43  102:astore          23
		StackTraceElement astacktraceelement[] = throwable.getStackTrace();
	//   44  104:aload           4
	//   45  106:invokevirtual   #869 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   46  109:astore          24
		String s1 = crashlyticsCore.getBuildId();
	//   47  111:aload_0         
	//   48  112:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//   49  115:invokevirtual   #872 <Method String CrashlyticsCore.getBuildId()>
	//   50  118:astore          25
		String s2 = idManager.getAppIdentifier();
	//   51  120:aload_0         
	//   52  121:getfield        #180 <Field IdManager idManager>
	//   53  124:invokevirtual   #721 <Method String IdManager.getAppIdentifier()>
	//   54  127:astore          26
		int i = 0;
	//   55  129:iconst_0        
	//   56  130:istore          8
		Thread athread[];
		if(flag)
	//*  57  132:iload           6
	//*  58  134:ifeq            226
		{
			date = ((Date) (Thread.getAllStackTraces()));
	//   59  137:invokestatic    #875 <Method Map Thread.getAllStackTraces()>
	//   60  140:astore_2        
			athread = new Thread[((Map) (date)).size()];
	//   61  141:aload_2         
	//   62  142:invokeinterface #880 <Method int Map.size()>
	//   63  147:anewarray       Thread[]
	//   64  150:astore          20
			for(date = ((Date) (((Map) (date)).entrySet().iterator())); ((Iterator) (date)).hasNext();)
	//*  65  152:aload_2         
	//*  66  153:invokeinterface #884 <Method Set Map.entrySet()>
	//*  67  158:invokeinterface #888 <Method Iterator Set.iterator()>
	//*  68  163:astore_2        
	//*  69  164:aload_2         
	//*  70  165:invokeinterface #893 <Method boolean Iterator.hasNext()>
	//*  71  170:ifeq            223
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (date)).next();
	//   72  173:aload_2         
	//   73  174:invokeinterface #897 <Method Object Iterator.next()>
	//   74  179:checkcast       #899 <Class java.util.Map$Entry>
	//   75  182:astore          27
				athread[i] = (Thread)entry.getKey();
	//   76  184:aload           20
	//   77  186:iload           8
	//   78  188:aload           27
	//   79  190:invokeinterface #902 <Method Object java.util.Map$Entry.getKey()>
	//   80  195:checkcast       #420 <Class Thread>
	//   81  198:aastore         
				((List) (linkedlist)).add(entry.getValue());
	//   82  199:aload           23
	//   83  201:aload           27
	//   84  203:invokeinterface #905 <Method Object java.util.Map$Entry.getValue()>
	//   85  208:invokeinterface #908 <Method boolean List.add(Object)>
	//   86  213:pop             
				i++;
	//   87  214:iload           8
	//   88  216:iconst_1        
	//   89  217:iadd            
	//   90  218:istore          8
			}

		} else
	//*  91  220:goto            164
	//*  92  223:goto            232
		{
			athread = new Thread[0];
	//   93  226:iconst_0        
	//   94  227:anewarray       Thread[]
	//   95  230:astore          20
		}
		if(!CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectCustomKeys", true))
	//*  96  232:aload           21
	//*  97  234:ldc2            #910 <String "com.crashlytics.CollectCustomKeys">
	//*  98  237:iconst_1        
	//*  99  238:invokestatic    #914 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//* 100  241:ifne            255
		{
			date = ((Date) (new TreeMap()));
	//  101  244:new             #916 <Class TreeMap>
	//  102  247:dup             
	//  103  248:invokespecial   #917 <Method void TreeMap()>
	//  104  251:astore_2        
		} else
	//* 105  252:goto            296
		{
			Map map = crashlyticsCore.getAttributes();
	//  106  255:aload_0         
	//  107  256:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//  108  259:invokevirtual   #920 <Method Map CrashlyticsCore.getAttributes()>
	//  109  262:astore          21
			date = ((Date) (map));
	//  110  264:aload           21
	//  111  266:astore_2        
			if(map != null)
	//* 112  267:aload           21
	//* 113  269:ifnull          252
			{
				date = ((Date) (map));
	//  114  272:aload           21
	//  115  274:astore_2        
				if(map.size() > 1)
	//* 116  275:aload           21
	//* 117  277:invokeinterface #880 <Method int Map.size()>
	//* 118  282:iconst_1        
	//* 119  283:icmple          252
					date = ((Date) (new TreeMap(map)));
	//  120  286:new             #916 <Class TreeMap>
	//  121  289:dup             
	//  122  290:aload           21
	//  123  292:invokespecial   #923 <Method void TreeMap(Map)>
	//  124  295:astore_2        
			}
		}
		SessionProtobufHelper.writeSessionEvent(codedoutputstream, l, s, throwable, thread, astacktraceelement, athread, ((List) (linkedlist)), ((Map) (date)), logFileManager, runningappprocessinfo, k, s2, s1, f, j, flag1, l1 - l2, l3);
	//  125  296:aload_1         
	//  126  297:lload           12
	//  127  299:aload           5
	//  128  301:aload           4
	//  129  303:aload_3         
	//  130  304:aload           24
	//  131  306:aload           20
	//  132  308:aload           23
	//  133  310:aload_2         
	//  134  311:aload_0         
	//  135  312:getfield        #212 <Field LogFileManager logFileManager>
	//  136  315:aload           22
	//  137  317:iload           10
	//  138  319:aload           26
	//  139  321:aload           25
	//  140  323:fload           7
	//  141  325:iload           9
	//  142  327:iload           11
	//  143  329:lload           14
	//  144  331:lload           16
	//  145  333:lsub            
	//  146  334:lload           18
	//  147  336:invokestatic    #926 <Method void SessionProtobufHelper.writeSessionEvent(CodedOutputStream, long, String, Throwable, Thread, StackTraceElement[], Thread[], List, Map, LogFileManager, android.app.ActivityManager$RunningAppProcessInfo, int, String, String, float, int, boolean, long, long)>
	//  148  339:return          
	}

	private void writeSessionOS(String s)
		throws Exception
	{
		Object obj;
		Object obj2;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		obj2 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		Object obj1;
		obj1 = ((Object) (getFilesDir()));
	//    4    5:aload_0         
	//    5    6:invokespecial   #262 <Method File getFilesDir()>
	//    6    9:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   10:new             #301 <Class StringBuilder>
	//    8   13:dup             
	//    9   14:invokespecial   #302 <Method void StringBuilder()>
	//   10   17:astore          5
		stringbuilder.append(s);
	//   11   19:aload           5
	//   12   21:aload_1         
	//   13   22:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append("SessionOS");
	//   15   26:aload           5
	//   16   28:ldc1            #99  <String "SessionOS">
	//   17   30:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		obj1 = ((Object) (new ClsFileOutputStream(((File) (obj1)), stringbuilder.toString())));
	//   19   34:new             #319 <Class ClsFileOutputStream>
	//   20   37:dup             
	//   21   38:aload_3         
	//   22   39:aload           5
	//   23   41:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   24   44:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   25   47:astore_3        
		try
		{
			s = ((String) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj1)))));
	//   26   48:aload_3         
	//   27   49:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   28   52:astore_1        
		}
	//*  29   53:aload_1         
	//*  30   54:aload_0         
	//*  31   55:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//*  32   58:invokevirtual   #205 <Method Context CrashlyticsCore.getContext()>
	//*  33   61:invokestatic    #929 <Method boolean CommonUtils.isRooted(Context)>
	//*  34   64:invokestatic    #932 <Method void SessionProtobufHelper.writeSessionOS(CodedOutputStream, boolean)>
	//*  35   67:aload_1         
	//*  36   68:ldc2            #934 <String "Failed to flush to session OS file.">
	//*  37   71:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  38   74:aload_3         
	//*  39   75:ldc2            #936 <String "Failed to close session OS file.">
	//*  40   78:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  41   81:return          
	//*  42   82:astore          4
	//*  43   84:aload_1         
	//*  44   85:astore_2        
	//*  45   86:aload           4
	//*  46   88:astore_1        
	//*  47   89:goto            132
	//*  48   92:astore          4
	//*  49   94:aload_1         
	//*  50   95:astore_2        
	//*  51   96:aload           4
	//*  52   98:astore_1        
	//*  53   99:goto            109
	//*  54  102:astore_1        
	//*  55  103:goto            132
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  56  106:astore_1        
		{
			obj = null;
	//   57  107:aconst_null     
	//   58  108:astore_2        
			break MISSING_BLOCK_LABEL_124;
	//   59  109:goto            124
		}
		try
		{
			SessionProtobufHelper.writeSessionOS(((CodedOutputStream) (s)), CommonUtils.isRooted(crashlyticsCore.getContext()));
		}
		// Misplaced declaration of an exception variable
		catch(Object obj2)
		{
			obj = ((Object) (s));
			s = ((String) (obj2));
			break MISSING_BLOCK_LABEL_124;
		}
		CommonUtils.flushOrLog(((java.io.Flushable) (s)), "Failed to flush to session OS file.");
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
		return;
		obj2;
		obj = ((Object) (s));
		s = ((String) (obj2));
		break MISSING_BLOCK_LABEL_132;
		s;
		break MISSING_BLOCK_LABEL_132;
		s;
	//   60  112:astore_1        
		obj1 = null;
	//   61  113:aconst_null     
	//   62  114:astore_3        
		break MISSING_BLOCK_LABEL_132;
	//   63  115:goto            132
		s;
	//   64  118:astore_1        
		obj = null;
	//   65  119:aconst_null     
	//   66  120:astore_2        
		obj1 = obj2;
	//   67  121:aload           4
	//   68  123:astore_3        
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (s)), ((java.io.OutputStream) (obj1)));
	//   69  124:aload_1         
	//   70  125:aload_3         
	//   71  126:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		throw s;
	//   72  129:aload_1         
	//   73  130:athrow          
		s;
	//   74  131:astore_1        
		CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session OS file.");
	//   75  132:aload_2         
	//   76  133:ldc2            #934 <String "Failed to flush to session OS file.">
	//   77  136:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
	//   78  139:aload_3         
	//   79  140:ldc2            #936 <String "Failed to close session OS file.">
	//   80  143:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw s;
	//   81  146:aload_1         
	//   82  147:athrow          
	}

	private void writeSessionPartsToSessionFile(File file, String s, int i)
	{
		Object obj = ((Object) (Fabric.getLogger()));
	//    0    0:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//    1    3:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//    2    5:new             #301 <Class StringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #302 <Method void StringBuilder()>
	//    5   12:astore          7
		stringbuilder.append("Collecting session parts for ID ");
	//    6   14:aload           7
	//    7   16:ldc2            #938 <String "Collecting session parts for ID ">
	//    8   19:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:pop             
		stringbuilder.append(s);
	//   10   23:aload           7
	//   11   25:aload_2         
	//   12   26:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   14   30:aload           6
	//   15   32:ldc2            #287 <String "CrashlyticsCore">
	//   16   35:aload           7
	//   17   37:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   18   40:invokeinterface #295 <Method void Logger.d(String, String)>
		obj = ((Object) (new StringBuilder()));
	//   19   45:new             #301 <Class StringBuilder>
	//   20   48:dup             
	//   21   49:invokespecial   #302 <Method void StringBuilder()>
	//   22   52:astore          6
		((StringBuilder) (obj)).append(s);
	//   23   54:aload           6
	//   24   56:aload_2         
	//   25   57:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:pop             
		((StringBuilder) (obj)).append("SessionCrash");
	//   27   61:aload           6
	//   28   63:ldc1            #88  <String "SessionCrash">
	//   29   65:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
		obj = ((Object) (listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(((StringBuilder) (obj)).toString()))))));
	//   31   69:aload_0         
	//   32   70:new             #37  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   33   73:dup             
	//   34   74:aload           6
	//   35   76:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   36   79:invokespecial   #503 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   37   82:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
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
	//   49  107:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   50  110:ldc2            #287 <String "CrashlyticsCore">
	//   51  113:getstatic       #490 <Field Locale Locale.US>
	//   52  116:ldc2            #940 <String "Session %s has fatal exception: %s">
	//   53  119:iconst_2        
	//   54  120:anewarray       Object[]
	//   55  123:dup             
	//   56  124:iconst_0        
	//   57  125:aload_2         
	//   58  126:aastore         
	//   59  127:dup             
	//   60  128:iconst_1        
	//   61  129:iload           4
	//   62  131:invokestatic    #945 <Method Boolean Boolean.valueOf(boolean)>
	//   63  134:aastore         
	//   64  135:invokestatic    #502 <Method String String.format(Locale, String, Object[])>
	//   65  138:invokeinterface #295 <Method void Logger.d(String, String)>
		stringbuilder = new StringBuilder();
	//   66  143:new             #301 <Class StringBuilder>
	//   67  146:dup             
	//   68  147:invokespecial   #302 <Method void StringBuilder()>
	//   69  150:astore          7
		stringbuilder.append(s);
	//   70  152:aload           7
	//   71  154:aload_2         
	//   72  155:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   73  158:pop             
		stringbuilder.append("SessionEvent");
	//   74  159:aload           7
	//   75  161:ldc1            #96  <String "SessionEvent">
	//   76  163:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   77  166:pop             
		File afile[] = listFilesMatching(((FilenameFilter) (new FileNameContainsFilter(stringbuilder.toString()))));
	//   78  167:aload_0         
	//   79  168:new             #37  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//   80  171:dup             
	//   81  172:aload           7
	//   82  174:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   83  177:invokespecial   #503 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//   84  180:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
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
	//   96  205:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   97  208:ldc2            #287 <String "CrashlyticsCore">
	//   98  211:getstatic       #490 <Field Locale Locale.US>
	//   99  214:ldc2            #947 <String "Session %s has non-fatal exceptions: %s">
	//  100  217:iconst_2        
	//  101  218:anewarray       Object[]
	//  102  221:dup             
	//  103  222:iconst_0        
	//  104  223:aload_2         
	//  105  224:aastore         
	//  106  225:dup             
	//  107  226:iconst_1        
	//  108  227:iload           5
	//  109  229:invokestatic    #945 <Method Boolean Boolean.valueOf(boolean)>
	//  110  232:aastore         
	//  111  233:invokestatic    #502 <Method String String.format(Locale, String, Object[])>
	//  112  236:invokeinterface #295 <Method void Logger.d(String, String)>
		if(!flag && !flag1)
	//* 113  241:iload           4
	//* 114  243:ifne            300
	//* 115  246:iload           5
	//* 116  248:ifeq            254
	//* 117  251:goto            300
		{
			file = ((File) (Fabric.getLogger()));
	//  118  254:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//  119  257:astore_1        
			obj = ((Object) (new StringBuilder()));
	//  120  258:new             #301 <Class StringBuilder>
	//  121  261:dup             
	//  122  262:invokespecial   #302 <Method void StringBuilder()>
	//  123  265:astore          6
			((StringBuilder) (obj)).append("No events present for session ID ");
	//  124  267:aload           6
	//  125  269:ldc2            #949 <String "No events present for session ID ">
	//  126  272:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//  127  275:pop             
			((StringBuilder) (obj)).append(s);
	//  128  276:aload           6
	//  129  278:aload_2         
	//  130  279:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//  131  282:pop             
			((Logger) (file)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  132  283:aload_1         
	//  133  284:ldc2            #287 <String "CrashlyticsCore">
	//  134  287:aload           6
	//  135  289:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  136  292:invokeinterface #295 <Method void Logger.d(String, String)>
		} else
	//* 137  297:goto            337
		{
			afile = getTrimmedNonFatalFiles(s, afile, i);
	//  138  300:aload_0         
	//  139  301:aload_2         
	//  140  302:aload           7
	//  141  304:iload_3         
	//  142  305:invokespecial   #951 <Method File[] getTrimmedNonFatalFiles(String, File[], int)>
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
	//  158  334:invokespecial   #953 <Method void synthesizeSessionFile(File, String, File[], File)>
		}
		file = ((File) (Fabric.getLogger()));
	//  159  337:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//  160  340:astore_1        
		obj = ((Object) (new StringBuilder()));
	//  161  341:new             #301 <Class StringBuilder>
	//  162  344:dup             
	//  163  345:invokespecial   #302 <Method void StringBuilder()>
	//  164  348:astore          6
		((StringBuilder) (obj)).append("Removing session part files for ID ");
	//  165  350:aload           6
	//  166  352:ldc2            #955 <String "Removing session part files for ID ">
	//  167  355:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//  168  358:pop             
		((StringBuilder) (obj)).append(s);
	//  169  359:aload           6
	//  170  361:aload_2         
	//  171  362:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//  172  365:pop             
		((Logger) (file)).d("CrashlyticsCore", ((StringBuilder) (obj)).toString());
	//  173  366:aload_1         
	//  174  367:ldc2            #287 <String "CrashlyticsCore">
	//  175  370:aload           6
	//  176  372:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  177  375:invokeinterface #295 <Method void Logger.d(String, String)>
		deleteSessionPartFilesFor(s);
	//  178  380:aload_0         
	//  179  381:aload_2         
	//  180  382:invokespecial   #957 <Method void deleteSessionPartFilesFor(String)>
	//  181  385:return          
	}

	private void writeSessionUser(String s)
		throws Exception
	{
		Object obj3;
		Object obj4;
		obj4 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		Object obj;
		obj = ((Object) (getFilesDir()));
	//    4    6:aload_0         
	//    5    7:invokespecial   #262 <Method File getFilesDir()>
	//    6   10:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #301 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #302 <Method void StringBuilder()>
	//   10   18:astore          4
		stringbuilder.append(s);
	//   11   20:aload           4
	//   12   22:aload_1         
	//   13   23:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   14   26:pop             
		stringbuilder.append("SessionUser");
	//   15   27:aload           4
	//   16   29:ldc1            #102 <String "SessionUser">
	//   17   31:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		obj = ((Object) (new ClsFileOutputStream(((File) (obj)), stringbuilder.toString())));
	//   19   35:new             #319 <Class ClsFileOutputStream>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:aload           4
	//   23   42:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   24   45:invokespecial   #434 <Method void ClsFileOutputStream(File, String)>
	//   25   48:astore_3        
		boolean flag;
		Object obj1;
		Object obj2;
		try
		{
			obj1 = ((Object) (CodedOutputStream.newInstance(((java.io.OutputStream) (obj)))));
	//   26   49:aload_3         
	//   27   50:invokestatic    #438 <Method CodedOutputStream CodedOutputStream.newInstance(java.io.OutputStream)>
	//   28   53:astore          4
		}
	//*  29   55:aload_0         
	//*  30   56:aload_1         
	//*  31   57:invokespecial   #960 <Method UserMetaData getUserMetaData(String)>
	//*  32   60:astore_1        
	//*  33   61:aload_1         
	//*  34   62:invokevirtual   #963 <Method boolean UserMetaData.isEmpty()>
	//*  35   65:istore_2        
	//*  36   66:iload_2         
	//*  37   67:ifeq            86
	//*  38   70:aload           4
	//*  39   72:ldc2            #965 <String "Failed to flush session user file.">
	//*  40   75:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  41   78:aload_3         
	//*  42   79:ldc2            #967 <String "Failed to close session user file.">
	//*  43   82:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  44   85:return          
	//*  45   86:aload           4
	//*  46   88:aload_1         
	//*  47   89:getfield        #970 <Field String UserMetaData.id>
	//*  48   92:aload_1         
	//*  49   93:getfield        #973 <Field String UserMetaData.name>
	//*  50   96:aload_1         
	//*  51   97:getfield        #976 <Field String UserMetaData.email>
	//*  52  100:invokestatic    #979 <Method void SessionProtobufHelper.writeSessionUser(CodedOutputStream, String, String, String)>
	//*  53  103:aload           4
	//*  54  105:ldc2            #965 <String "Failed to flush session user file.">
	//*  55  108:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
	//*  56  111:aload_3         
	//*  57  112:ldc2            #967 <String "Failed to close session user file.">
	//*  58  115:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
	//*  59  118:return          
	//*  60  119:astore          5
	//*  61  121:aload           4
	//*  62  123:astore_1        
	//*  63  124:aload           5
	//*  64  126:astore          4
	//*  65  128:goto            186
	//*  66  131:astore          5
	//*  67  133:aload           4
	//*  68  135:astore_1        
	//*  69  136:aload           5
	//*  70  138:astore          4
	//*  71  140:goto            155
	//*  72  143:astore          4
	//*  73  145:aload           6
	//*  74  147:astore_1        
	//*  75  148:goto            186
		// Misplaced declaration of an exception variable
		catch(Object obj2)
	//*  76  151:astore          4
		{
			s = null;
	//   77  153:aconst_null     
	//   78  154:astore_1        
			break MISSING_BLOCK_LABEL_175;
	//   79  155:goto            175
		}
		try
		{
			s = ((String) (getUserMetaData(s)));
			flag = ((UserMetaData) (s)).isEmpty();
		}
		// Misplaced declaration of an exception variable
		catch(Object obj3)
		{
			s = ((String) (obj1));
			obj2 = obj3;
			break MISSING_BLOCK_LABEL_175;
		}
		if(flag)
		{
			CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
			CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session user file.");
			return;
		}
		SessionProtobufHelper.writeSessionUser(((CodedOutputStream) (obj1)), ((UserMetaData) (s)).id, ((UserMetaData) (s)).name, ((UserMetaData) (s)).email);
		CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session user file.");
		return;
		obj3;
		s = ((String) (obj1));
		obj1 = obj3;
		break MISSING_BLOCK_LABEL_186;
		obj2;
		s = ((String) (obj4));
		break MISSING_BLOCK_LABEL_186;
		obj2;
	//   80  158:astore          4
		obj = null;
	//   81  160:aconst_null     
	//   82  161:astore_3        
		s = ((String) (obj4));
	//   83  162:aload           6
	//   84  164:astore_1        
		break MISSING_BLOCK_LABEL_186;
	//   85  165:goto            186
		obj2;
	//   86  168:astore          4
		s = null;
	//   87  170:aconst_null     
	//   88  171:astore_1        
		obj = obj3;
	//   89  172:aload           5
	//   90  174:astore_3        
		ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
	//   91  175:aload           4
	//   92  177:aload_3         
	//   93  178:invokestatic    #462 <Method void ExceptionUtils.writeStackTraceIfNotNull(Throwable, java.io.OutputStream)>
		throw obj2;
	//   94  181:aload           4
	//   95  183:athrow          
		obj2;
	//   96  184:astore          4
		CommonUtils.flushOrLog(((java.io.Flushable) (s)), "Failed to flush session user file.");
	//   97  186:aload_1         
	//   98  187:ldc2            #965 <String "Failed to flush session user file.">
	//   99  190:invokestatic    #448 <Method void CommonUtils.flushOrLog(java.io.Flushable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close session user file.");
	//  100  193:aload_3         
	//  101  194:ldc2            #967 <String "Failed to close session user file.">
	//  102  197:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw obj2;
	//  103  200:aload           4
	//  104  202:athrow          
	}

	private static void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
		throws IOException
	{
		if(!file.exists())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #355 <Method boolean File.exists()>
	//*   2    4:ifne            51
		{
			codedoutputstream = ((CodedOutputStream) (Fabric.getLogger()));
	//    3    7:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//    4   10:astore_0        
			StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #301 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #302 <Method void StringBuilder()>
	//    8   18:astore_2        
			stringbuilder.append("Tried to include a file that doesn't exist: ");
	//    9   19:aload_2         
	//   10   20:ldc2            #981 <String "Tried to include a file that doesn't exist: ">
	//   11   23:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
			stringbuilder.append(file.getName());
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #478 <Method String File.getName()>
	//   16   32:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((Logger) (codedoutputstream)).e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   18   36:aload_0         
	//   19   37:ldc2            #287 <String "CrashlyticsCore">
	//   20   40:aload_2         
	//   21   41:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   22   44:aconst_null     
	//   23   45:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
			return;
	//   24   50:return          
		}
		FileInputStream fileinputstream = new FileInputStream(file);
	//   25   51:new             #983 <Class FileInputStream>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:invokespecial   #984 <Method void FileInputStream(File)>
	//   29   59:astore_2        
		copyToCodedOutputStream(((InputStream) (fileinputstream)), codedoutputstream, (int)file.length());
	//   30   60:aload_2         
	//   31   61:aload_0         
	//   32   62:aload_1         
	//   33   63:invokevirtual   #987 <Method long File.length()>
	//   34   66:l2i             
	//   35   67:invokestatic    #989 <Method void copyToCodedOutputStream(InputStream, CodedOutputStream, int)>
		CommonUtils.closeOrLog(((java.io.Closeable) (fileinputstream)), "Failed to close file input stream.");
	//   36   70:aload_2         
	//   37   71:ldc2            #991 <String "Failed to close file input stream.">
	//   38   74:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
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
	//   48   88:ldc2            #991 <String "Failed to close file input stream.">
	//   49   91:invokestatic    #454 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		throw file;
	//   50   94:aload_1         
	//   51   95:athrow          
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
	//    1    1:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #32  <Class CrashlyticsUncaughtExceptionHandler$9>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #995 <Method void CrashlyticsUncaughtExceptionHandler$9(CrashlyticsUncaughtExceptionHandler, Map)>
	//    7   13:invokevirtual   #998 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
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
	//    1    1:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #30  <Class CrashlyticsUncaughtExceptionHandler$8>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #1004 <Method void CrashlyticsUncaughtExceptionHandler$8(CrashlyticsUncaughtExceptionHandler, String, String, String)>
	//    9   15:invokevirtual   #998 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//   10   18:pop             
	//   11   19:return          
	}

	void cleanInvalidTempFiles()
	{
		executorServiceWrapper.executeAsync(new Runnable() {

			public void run()
			{
				doCleanInvalidTempFiles(listFilesMatching(ClsFileOutputStream.TEMP_FILENAME_FILTER));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//    4    8:getstatic       #27  <Field FilenameFilter ClsFileOutputStream.TEMP_FILENAME_FILTER>
			//    5   11:invokestatic    #31  <Method File[] CrashlyticsUncaughtExceptionHandler.access$1200(CrashlyticsUncaughtExceptionHandler, FilenameFilter)>
			//    6   14:invokevirtual   #35  <Method void CrashlyticsUncaughtExceptionHandler.doCleanInvalidTempFiles(File[])>
			//    7   17:return          
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
	//    1    1:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #14  <Class CrashlyticsUncaughtExceptionHandler$12>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1007 <Method void CrashlyticsUncaughtExceptionHandler$12(CrashlyticsUncaughtExceptionHandler)>
	//    6   12:invokevirtual   #572 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Runnable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void doCleanInvalidTempFiles(File afile[])
	{
		deleteLegacyInvalidCacheDir();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1011 <Method void deleteLegacyInvalidCacheDir()>
		int k = afile.length;
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:istore          4
		for(int i = 0; i < k; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_2        
	//*   7   10:iload_2         
	//*   8   11:iload           4
	//*   9   13:icmpge          226
		{
			final String sessionId = ((String) (afile[i]));
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore          6
			Object obj = ((Object) (Fabric.getLogger()));
	//   14   21:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   15   24:astore          7
			Object obj1 = ((Object) (new StringBuilder()));
	//   16   26:new             #301 <Class StringBuilder>
	//   17   29:dup             
	//   18   30:invokespecial   #302 <Method void StringBuilder()>
	//   19   33:astore          8
			((StringBuilder) (obj1)).append("Found invalid session part file: ");
	//   20   35:aload           8
	//   21   37:ldc2            #1013 <String "Found invalid session part file: ">
	//   22   40:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			((StringBuilder) (obj1)).append(((Object) (sessionId)));
	//   24   44:aload           8
	//   25   46:aload           6
	//   26   48:invokevirtual   #416 <Method StringBuilder StringBuilder.append(Object)>
	//   27   51:pop             
			((Logger) (obj)).d("CrashlyticsCore", ((StringBuilder) (obj1)).toString());
	//   28   52:aload           7
	//   29   54:ldc2            #287 <String "CrashlyticsCore">
	//   30   57:aload           8
	//   31   59:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   32   62:invokeinterface #295 <Method void Logger.d(String, String)>
			sessionId = getSessionIdFromSessionFile(((File) (sessionId)));
	//   33   67:aload_0         
	//   34   68:aload           6
	//   35   70:invokespecial   #299 <Method String getSessionIdFromSessionFile(File)>
	//   36   73:astore          6
			obj = ((Object) (new FilenameFilter() {

				public boolean accept(File file1, String s)
				{
					return s.startsWith(sessionId);
				//    0    0:aload_2         
				//    1    1:aload_0         
				//    2    2:getfield        #21  <Field String val$sessionId>
				//    3    5:invokevirtual   #33  <Method boolean String.startsWith(String)>
				//    4    8:ireturn         
				}

				final CrashlyticsUncaughtExceptionHandler this$0;
				final String val$sessionId;

			
			{
				this$0 = CrashlyticsUncaughtExceptionHandler.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashlyticsUncaughtExceptionHandler this$0>
				sessionId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$sessionId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
));
	//   37   75:new             #16  <Class CrashlyticsUncaughtExceptionHandler$13>
	//   38   78:dup             
	//   39   79:aload_0         
	//   40   80:aload           6
	//   41   82:invokespecial   #1016 <Method void CrashlyticsUncaughtExceptionHandler$13(CrashlyticsUncaughtExceptionHandler, String)>
	//   42   85:astore          7
			obj1 = ((Object) (Fabric.getLogger()));
	//   43   87:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   44   90:astore          8
			StringBuilder stringbuilder = new StringBuilder();
	//   45   92:new             #301 <Class StringBuilder>
	//   46   95:dup             
	//   47   96:invokespecial   #302 <Method void StringBuilder()>
	//   48   99:astore          9
			stringbuilder.append("Deleting all part files for invalid session: ");
	//   49  101:aload           9
	//   50  103:ldc2            #1018 <String "Deleting all part files for invalid session: ">
	//   51  106:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   52  109:pop             
			stringbuilder.append(sessionId);
	//   53  110:aload           9
	//   54  112:aload           6
	//   55  114:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   56  117:pop             
			((Logger) (obj1)).d("CrashlyticsCore", stringbuilder.toString());
	//   57  118:aload           8
	//   58  120:ldc2            #287 <String "CrashlyticsCore">
	//   59  123:aload           9
	//   60  125:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   61  128:invokeinterface #295 <Method void Logger.d(String, String)>
			File afile1[] = listFilesMatching(((FilenameFilter) (obj)));
	//   62  133:aload_0         
	//   63  134:aload           7
	//   64  136:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
	//   65  139:astore          6
			int l = afile1.length;
	//   66  141:aload           6
	//   67  143:arraylength     
	//   68  144:istore          5
			for(int j = 0; j < l; j++)
	//*  69  146:iconst_0        
	//*  70  147:istore_3        
	//*  71  148:iload_3         
	//*  72  149:iload           5
	//*  73  151:icmpge          219
			{
				File file = afile1[j];
	//   74  154:aload           6
	//   75  156:iload_3         
	//   76  157:aaload          
	//   77  158:astore          7
				Logger logger = Fabric.getLogger();
	//   78  160:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   79  163:astore          8
				StringBuilder stringbuilder1 = new StringBuilder();
	//   80  165:new             #301 <Class StringBuilder>
	//   81  168:dup             
	//   82  169:invokespecial   #302 <Method void StringBuilder()>
	//   83  172:astore          9
				stringbuilder1.append("Deleting session file: ");
	//   84  174:aload           9
	//   85  176:ldc2            #1020 <String "Deleting session file: ">
	//   86  179:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   87  182:pop             
				stringbuilder1.append(((Object) (file)));
	//   88  183:aload           9
	//   89  185:aload           7
	//   90  187:invokevirtual   #416 <Method StringBuilder StringBuilder.append(Object)>
	//   91  190:pop             
				logger.d("CrashlyticsCore", stringbuilder1.toString());
	//   92  191:aload           8
	//   93  193:ldc2            #287 <String "CrashlyticsCore">
	//   94  196:aload           9
	//   95  198:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   96  201:invokeinterface #295 <Method void Logger.d(String, String)>
				file.delete();
	//   97  206:aload           7
	//   98  208:invokevirtual   #365 <Method boolean File.delete()>
	//   99  211:pop             
			}

	//  100  212:iload_3         
	//  101  213:iconst_1        
	//  102  214:iadd            
	//  103  215:istore_3        
		}

	//  104  216:goto            148
	//  105  219:iload_2         
	//  106  220:iconst_1        
	//  107  221:iadd            
	//  108  222:istore_2        
	//* 109  223:goto            10
	//  110  226:return          
	}

	void doCloseSessions()
		throws Exception
	{
		doCloseSessions(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #235 <Method void doCloseSessions(boolean)>
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
				}
				Fabric.getLogger().d("CrashlyticsCore", "Finalizing previously open sessions.");
			//   11   29:invokestatic    #41  <Method Logger Fabric.getLogger()>
			//   12   32:ldc1            #43  <String "CrashlyticsCore">
			//   13   34:ldc1            #59  <String "Finalizing previously open sessions.">
			//   14   36:invokeinterface #51  <Method void Logger.d(String, String)>
				SessionEventData sessioneventdata = crashlyticsCore.getExternalCrashEventData();
			//   15   41:aload_0         
			//   16   42:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//   17   45:invokestatic    #63  <Method CrashlyticsCore CrashlyticsUncaughtExceptionHandler.access$800(CrashlyticsUncaughtExceptionHandler)>
			//   18   48:invokevirtual   #69  <Method SessionEventData CrashlyticsCore.getExternalCrashEventData()>
			//   19   51:astore_1        
				if(sessioneventdata != null)
			//*  20   52:aload_1         
			//*  21   53:ifnull          64
					writeExternalCrashEvent(sessioneventdata);
			//   22   56:aload_0         
			//   23   57:getfield        #18  <Field CrashlyticsUncaughtExceptionHandler this$0>
			//   24   60:aload_1         
			//   25   61:invokestatic    #73  <Method void CrashlyticsUncaughtExceptionHandler.access$900(CrashlyticsUncaughtExceptionHandler, SessionEventData)>
				doCloseSessions(true);
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
	//    1    1:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #12  <Class CrashlyticsUncaughtExceptionHandler$11>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1022 <Method void CrashlyticsUncaughtExceptionHandler$11(CrashlyticsUncaughtExceptionHandler)>
	//    6   12:invokevirtual   #1026 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    7   15:checkcast       #942 <Class Boolean>
	//    8   18:invokevirtual   #1029 <Method boolean Boolean.booleanValue()>
	//    9   21:ireturn         
	}

	boolean hasOpenSession()
	{
		return listSessionBeginFiles().length > 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #555 <Method File[] listSessionBeginFiles()>
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
	//    1    1:getfield        #199 <Field AtomicBoolean isHandlingException>
	//    2    4:invokevirtual   #1033 <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	File[] listSessionBeginFiles()
	{
		return listFilesMatching(((FilenameFilter) (new FileNameContainsFilter("BeginSession"))));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter>
	//    2    4:dup             
	//    3    5:ldc1            #82  <String "BeginSession">
	//    4    7:invokespecial   #503 <Method void CrashlyticsUncaughtExceptionHandler$FileNameContainsFilter(String)>
	//    5   10:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
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
	//    1    1:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #10  <Class CrashlyticsUncaughtExceptionHandler$10>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #1035 <Method void CrashlyticsUncaughtExceptionHandler$10(CrashlyticsUncaughtExceptionHandler)>
	//    6   12:invokevirtual   #998 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void trimSessionFiles()
	{
		Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, 4, SMALLEST_FILE_NAME_FIRST);
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method File getFilesDir()>
	//    2    4:getstatic       #129 <Field FilenameFilter SESSION_FILE_FILTER>
	//    3    7:iconst_4        
	//    4    8:getstatic       #135 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//    5   11:invokestatic    #663 <Method void Utils.capFileCount(File, FilenameFilter, int, Comparator)>
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
	//    3    3:getfield        #199 <Field AtomicBoolean isHandlingException>
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #1040 <Method void AtomicBoolean.set(boolean)>
		final Date now = ((Date) (Fabric.getLogger()));
	//    6   10:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//    7   13:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   14:new             #301 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #302 <Method void StringBuilder()>
	//   11   21:astore          4
		stringbuilder.append("Crashlytics is handling uncaught exception \"");
	//   12   23:aload           4
	//   13   25:ldc2            #1042 <String "Crashlytics is handling uncaught exception \"">
	//   14   28:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(((Object) (ex)));
	//   16   32:aload           4
	//   17   34:aload_2         
	//   18   35:invokevirtual   #416 <Method StringBuilder StringBuilder.append(Object)>
	//   19   38:pop             
		stringbuilder.append("\" from thread ");
	//   20   39:aload           4
	//   21   41:ldc2            #418 <String "\" from thread ">
	//   22   44:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(thread.getName());
	//   24   48:aload           4
	//   25   50:aload_1         
	//   26   51:invokevirtual   #423 <Method String Thread.getName()>
	//   27   54:invokevirtual   #308 <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
		((Logger) (now)).d("CrashlyticsCore", stringbuilder.toString());
	//   29   58:aload_3         
	//   30   59:ldc2            #287 <String "CrashlyticsCore">
	//   31   62:aload           4
	//   32   64:invokevirtual   #311 <Method String StringBuilder.toString()>
	//   33   67:invokeinterface #295 <Method void Logger.d(String, String)>
		devicePowerStateListener.dispose();
	//   34   72:aload_0         
	//   35   73:getfield        #219 <Field DevicePowerStateListener devicePowerStateListener>
	//   36   76:invokevirtual   #1045 <Method void DevicePowerStateListener.dispose()>
		now = new Date();
	//   37   79:new             #381 <Class Date>
	//   38   82:dup             
	//   39   83:invokespecial   #382 <Method void Date()>
	//   40   86:astore_3        
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
	//   41   87:aload_0         
	//   42   88:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//   43   91:new             #24  <Class CrashlyticsUncaughtExceptionHandler$5>
	//   44   94:dup             
	//   45   95:aload_0         
	//   46   96:aload_3         
	//   47   97:aload_1         
	//   48   98:aload_2         
	//   49   99:invokespecial   #1047 <Method void CrashlyticsUncaughtExceptionHandler$5(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
	//   50  102:invokevirtual   #1026 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//   51  105:pop             
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   52  106:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   53  109:ldc2            #287 <String "CrashlyticsCore">
	//   54  112:ldc2            #1049 <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   55  115:invokeinterface #295 <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, ex);
	//   56  120:aload_0         
	//   57  121:getfield        #176 <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   58  124:aload_1         
	//   59  125:aload_2         
	//   60  126:invokeinterface #1051 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		thread = ((Thread) (isHandlingException));
	//   61  131:aload_0         
	//   62  132:getfield        #199 <Field AtomicBoolean isHandlingException>
	//   63  135:astore_1        
_L2:
		((AtomicBoolean) (thread)).set(false);
	//   64  136:aload_1         
	//   65  137:iconst_0        
	//   66  138:invokevirtual   #1040 <Method void AtomicBoolean.set(boolean)>
		break MISSING_BLOCK_LABEL_197;
	//   67  141:goto            197
		Object obj;
		obj;
	//   68  144:astore_3        
		break MISSING_BLOCK_LABEL_200;
	//   69  145:goto            200
		obj;
	//   70  148:astore_3        
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
	//   71  149:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   72  152:ldc2            #287 <String "CrashlyticsCore">
	//   73  155:ldc2            #1053 <String "An error occurred in the uncaught exception handler">
	//   74  158:aload_3         
	//   75  159:invokeinterface #328 <Method void Logger.e(String, String, Throwable)>
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   76  164:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   77  167:ldc2            #287 <String "CrashlyticsCore">
	//   78  170:ldc2            #1049 <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   79  173:invokeinterface #295 <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, ex);
	//   80  178:aload_0         
	//   81  179:getfield        #176 <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   82  182:aload_1         
	//   83  183:aload_2         
	//   84  184:invokeinterface #1051 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		thread = ((Thread) (isHandlingException));
	//   85  189:aload_0         
	//   86  190:getfield        #199 <Field AtomicBoolean isHandlingException>
	//   87  193:astore_1        
		if(true) goto _L2; else goto _L1
	//   88  194:goto            136
_L1:
		this;
	//   89  197:aload_0         
		JVM INSTR monitorexit ;
	//   90  198:monitorexit     
		return;
	//   91  199:return          
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   92  200:invokestatic    #285 <Method Logger Fabric.getLogger()>
	//   93  203:ldc2            #287 <String "CrashlyticsCore">
	//   94  206:ldc2            #1049 <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   95  209:invokeinterface #295 <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, ex);
	//   96  214:aload_0         
	//   97  215:getfield        #176 <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   98  218:aload_1         
	//   99  219:aload_2         
	//  100  220:invokeinterface #1051 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//  101  225:aload_0         
	//  102  226:getfield        #199 <Field AtomicBoolean isHandlingException>
	//  103  229:iconst_0        
	//  104  230:invokevirtual   #1040 <Method void AtomicBoolean.set(boolean)>
		throw obj;
	//  105  233:aload_3         
	//  106  234:athrow          
		thread;
	//  107  235:astore_1        
		this;
	//  108  236:aload_0         
		JVM INSTR monitorexit ;
	//  109  237:monitorexit     
		throw thread;
	//  110  238:aload_1         
	//  111  239:athrow          
	}

	void writeNonFatalException(final Thread thread, final Throwable ex)
	{
		final Date now = new Date();
	//    0    0:new             #381 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #382 <Method void Date()>
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
	//    5    9:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    6   12:new             #28  <Class CrashlyticsUncaughtExceptionHandler$7>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #1055 <Method void CrashlyticsUncaughtExceptionHandler$7(CrashlyticsUncaughtExceptionHandler, Date, Thread, Throwable)>
	//   13   23:invokevirtual   #572 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Runnable)>
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
	//    1    1:getfield        #178 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #26  <Class CrashlyticsUncaughtExceptionHandler$6>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:aload_3         
	//    7   11:invokespecial   #1060 <Method void CrashlyticsUncaughtExceptionHandler$6(CrashlyticsUncaughtExceptionHandler, long, String)>
	//    8   14:invokevirtual   #998 <Method java.util.concurrent.Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
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
	private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
	static final int MAX_OPEN_SESSIONS = 8;
	private static final Map SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
	static final String SESSION_APP_TAG = "SessionApp";
	static final String SESSION_BEGIN_TAG = "BeginSession";
	static final String SESSION_DEVICE_TAG = "SessionDevice";
	static final String SESSION_FATAL_TAG = "SessionCrash";
	static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {

		public boolean accept(File file, String s)
		{
			return s.length() == 35 + ".cls".length() && s.endsWith(".cls");
		//    0    0:aload_2         
		//    1    1:invokevirtual   #21  <Method int String.length()>
		//    2    4:bipush          35
		//    3    6:ldc1            #23  <String ".cls">
		//    4    8:invokevirtual   #21  <Method int String.length()>
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
	private final String unityVersion;

	static 
	{
	//    0    0:new             #8   <Class CrashlyticsUncaughtExceptionHandler$1>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void CrashlyticsUncaughtExceptionHandler$1()>
	//    3    7:putstatic       #129 <Field FilenameFilter SESSION_FILE_FILTER>
	//    4   10:new             #18  <Class CrashlyticsUncaughtExceptionHandler$2>
	//    5   13:dup             
	//    6   14:invokespecial   #130 <Method void CrashlyticsUncaughtExceptionHandler$2()>
	//    7   17:putstatic       #132 <Field Comparator LARGEST_FILE_NAME_FIRST>
	//    8   20:new             #20  <Class CrashlyticsUncaughtExceptionHandler$3>
	//    9   23:dup             
	//   10   24:invokespecial   #133 <Method void CrashlyticsUncaughtExceptionHandler$3()>
	//   11   27:putstatic       #135 <Field Comparator SMALLEST_FILE_NAME_FIRST>
	//   12   30:new             #22  <Class CrashlyticsUncaughtExceptionHandler$4>
	//   13   33:dup             
	//   14   34:invokespecial   #136 <Method void CrashlyticsUncaughtExceptionHandler$4()>
	//   15   37:putstatic       #138 <Field FilenameFilter ANY_SESSION_FILENAME_FILTER>
	//   16   40:ldc1            #140 <String "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+">
	//   17   42:invokestatic    #146 <Method Pattern Pattern.compile(String)>
	//   18   45:putstatic       #148 <Field Pattern SESSION_FILE_PATTERN>
	//   19   48:ldc1            #150 <String "X-CRASHLYTICS-SEND-FLAGS">
	//   20   50:ldc1            #152 <String "1">
	//   21   52:invokestatic    #158 <Method Map Collections.singletonMap(Object, Object)>
	//   22   55:putstatic       #160 <Field Map SEND_AT_CRASHTIME_HEADER>
	//   23   58:iconst_4        
	//   24   59:anewarray       String[]
	//   25   62:dup             
	//   26   63:iconst_0        
	//   27   64:ldc1            #102 <String "SessionUser">
	//   28   66:aastore         
	//   29   67:dup             
	//   30   68:iconst_1        
	//   31   69:ldc1            #79  <String "SessionApp">
	//   32   71:aastore         
	//   33   72:dup             
	//   34   73:iconst_2        
	//   35   74:ldc1            #99  <String "SessionOS">
	//   36   76:aastore         
	//   37   77:dup             
	//   38   78:iconst_3        
	//   39   79:ldc1            #85  <String "SessionDevice">
	//   40   81:aastore         
	//   41   82:putstatic       #164 <Field String[] INITIAL_SESSION_PART_TAGS>
	//*  42   85:return          
	}


/*
	static Pattern access$000()
	{
		return SESSION_FILE_PATTERN;
	//    0    0:getstatic       #148 <Field Pattern SESSION_FILE_PATTERN>
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
	//    4    4:invokespecial   #229 <Method void handleUncaughtException(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static void access$1000(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, boolean flag)
		throws Exception
	{
		crashlyticsuncaughtexceptionhandler.doCloseSessions(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #235 <Method void doCloseSessions(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static File[] access$1200(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, FilenameFilter filenamefilter)
	{
		return crashlyticsuncaughtexceptionhandler.listFilesMatching(filenamefilter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method File[] listFilesMatching(FilenameFilter)>
	//    3    5:areturn         
	}

*/


/*
	static Map access$1300()
	{
		return SEND_AT_CRASHTIME_HEADER;
	//    0    0:getstatic       #160 <Field Map SEND_AT_CRASHTIME_HEADER>
	//    1    3:areturn         
	}

*/


/*
	static AtomicBoolean access$200(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.isHandlingException;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field AtomicBoolean isHandlingException>
	//    2    4:areturn         
	}

*/


/*
	static LogFileManager access$300(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.logFileManager;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field LogFileManager logFileManager>
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
	//    4    4:invokespecial   #251 <Method void doWriteNonFatal(Date, Thread, Throwable)>
		return;
	//    5    7:return          
	}

*/


/*
	static String access$500(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.getCurrentSessionId();
	//    0    0:aload_0         
	//    1    1:invokespecial   #256 <Method String getCurrentSessionId()>
	//    2    4:areturn         
	}

*/


/*
	static File access$600(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.getFilesDir();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method File getFilesDir()>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
		throws Exception
	{
		crashlyticsuncaughtexceptionhandler.doOpenSession();
	//    0    0:aload_0         
	//    1    1:invokespecial   #267 <Method void doOpenSession()>
		return;
	//    2    4:return          
	}

*/


/*
	static CrashlyticsCore access$800(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
	{
		return crashlyticsuncaughtexceptionhandler.crashlyticsCore;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field CrashlyticsCore crashlyticsCore>
	//    2    4:areturn         
	}

*/


/*
	static void access$900(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, SessionEventData sessioneventdata)
		throws IOException
	{
		crashlyticsuncaughtexceptionhandler.writeExternalCrashEvent(sessioneventdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #277 <Method void writeExternalCrashEvent(SessionEventData)>
		return;
	//    3    5:return          
	}

*/
}
