// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//			FileLogStore, QueueFileLogStore, ByteString

class LogFileManager
{
	private static final class NoopLogStore
		implements FileLogStore
	{

		public void closeLogFile()
		{
		//    0    0:return          
		}

		public void deleteLogFile()
		{
		//    0    0:return          
		}

		public ByteString getLogAsByteString()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void writeToLog(long l, String s)
		{
		//    0    0:return          
		}

		private NoopLogStore()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public LogFileManager(Context context1, FileStore filestore)
	{
		this(context1, filestore, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #43  <Method void LogFileManager(Context, FileStore, String)>
	//    5    7:return          
	}

	public LogFileManager(Context context1, FileStore filestore, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field Context context>
		fileStore = filestore;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #49  <Field FileStore fileStore>
		currentLog = ((FileLogStore) (NOOP_LOG_STORE));
	//    8   14:aload_0         
	//    9   15:getstatic       #38  <Field LogFileManager$NoopLogStore NOOP_LOG_STORE>
	//   10   18:putfield        #51  <Field FileLogStore currentLog>
		setCurrentSession(s);
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #55  <Method void setCurrentSession(String)>
	//   14   26:return          
	}

	private File getLogFileDir()
	{
		File file = new File(fileStore.getFilesDir(), "log-files");
	//    0    0:new             #59  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field FileStore fileStore>
	//    4    8:invokeinterface #64  <Method File FileStore.getFilesDir()>
	//    5   13:ldc1            #13  <String "log-files">
	//    6   15:invokespecial   #67  <Method void File(File, String)>
	//    7   18:astore_1        
		if(!file.exists())
	//*   8   19:aload_1         
	//*   9   20:invokevirtual   #71  <Method boolean File.exists()>
	//*  10   23:ifne            31
			file.mkdirs();
	//   11   26:aload_1         
	//   12   27:invokevirtual   #74  <Method boolean File.mkdirs()>
	//   13   30:pop             
		return file;
	//   14   31:aload_1         
	//   15   32:areturn         
	}

	private String getSessionIdForFile(File file)
	{
		file = ((File) (file.getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #80  <Method String File.getName()>
	//    2    4:astore_1        
		int i = ((String) (file)).lastIndexOf(".temp");
	//    3    5:aload_1         
	//    4    6:ldc1            #16  <String ".temp">
	//    5    8:invokevirtual   #86  <Method int String.lastIndexOf(String)>
	//    6   11:istore_2        
		if(i == -1)
	//*   7   12:iload_2         
	//*   8   13:iconst_m1       
	//*   9   14:icmpne          19
			return ((String) (file));
	//   10   17:aload_1         
	//   11   18:areturn         
		else
			return ((String) (file)).substring("crashlytics-userlog-".length(), i);
	//   12   19:aload_1         
	//   13   20:ldc1            #19  <String "crashlytics-userlog-">
	//   14   22:invokevirtual   #90  <Method int String.length()>
	//   15   25:iload_2         
	//   16   26:invokevirtual   #94  <Method String String.substring(int, int)>
	//   17   29:areturn         
	}

	private File getWorkingFileForSession(String s)
	{
		s = (new StringBuilder()).append("crashlytics-userlog-").append(s).append(".temp").toString();
	//    0    0:new             #98  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void StringBuilder()>
	//    3    7:ldc1            #19  <String "crashlytics-userlog-">
	//    4    9:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:ldc1            #16  <String ".temp">
	//    8   18:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #106 <Method String StringBuilder.toString()>
	//   10   24:astore_1        
		return new File(getLogFileDir(), s);
	//   11   25:new             #59  <Class File>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #108 <Method File getLogFileDir()>
	//   15   33:aload_1         
	//   16   34:invokespecial   #67  <Method void File(File, String)>
	//   17   37:areturn         
	}

	private boolean isLoggingEnabled()
	{
		return CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectCustomLogs", true);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Context context>
	//    2    4:ldc1            #111 <String "com.crashlytics.CollectCustomLogs">
	//    3    6:iconst_1        
	//    4    7:invokestatic    #117 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//    5   10:ireturn         
	}

	public void clearLog()
	{
		currentLog.deleteLogFile();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field FileLogStore currentLog>
	//    2    4:invokeinterface #123 <Method void FileLogStore.deleteLogFile()>
	//    3    9:return          
	}

	public void discardOldLogFiles(Set set)
	{
		File afile[] = getLogFileDir().listFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method File getLogFileDir()>
	//    2    4:invokevirtual   #129 <Method File[] File.listFiles()>
	//    3    7:astore          4
		if(afile != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          59
		{
			int j = afile.length;
	//    6   14:aload           4
	//    7   16:arraylength     
	//    8   17:istore_3        
			for(int i = 0; i < j; i++)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_2         
	//*  12   21:iload_3         
	//*  13   22:icmpge          59
			{
				File file = afile[i];
	//   14   25:aload           4
	//   15   27:iload_2         
	//   16   28:aaload          
	//   17   29:astore          5
				if(!set.contains(((Object) (getSessionIdForFile(file)))))
	//*  18   31:aload_1         
	//*  19   32:aload_0         
	//*  20   33:aload           5
	//*  21   35:invokespecial   #131 <Method String getSessionIdForFile(File)>
	//*  22   38:invokeinterface #137 <Method boolean Set.contains(Object)>
	//*  23   43:ifne            52
					file.delete();
	//   24   46:aload           5
	//   25   48:invokevirtual   #140 <Method boolean File.delete()>
	//   26   51:pop             
			}

	//   27   52:iload_2         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_2        
		}
	//*  31   56:goto            20
	//   32   59:return          
	}

	public ByteString getByteStringForLog()
	{
		return currentLog.getLogAsByteString();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field FileLogStore currentLog>
	//    2    4:invokeinterface #147 <Method ByteString FileLogStore.getLogAsByteString()>
	//    3    9:areturn         
	}

	public final void setCurrentSession(String s)
	{
		currentLog.closeLogFile();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field FileLogStore currentLog>
	//    2    4:invokeinterface #150 <Method void FileLogStore.closeLogFile()>
		currentLog = ((FileLogStore) (NOOP_LOG_STORE));
	//    3    9:aload_0         
	//    4   10:getstatic       #38  <Field LogFileManager$NoopLogStore NOOP_LOG_STORE>
	//    5   13:putfield        #51  <Field FileLogStore currentLog>
		if(s == null)
	//*   6   16:aload_1         
	//*   7   17:ifnonnull       21
			return;
	//    8   20:return          
		if(!isLoggingEnabled())
	//*   9   21:aload_0         
	//*  10   22:invokespecial   #152 <Method boolean isLoggingEnabled()>
	//*  11   25:ifne            41
		{
			Fabric.getLogger().d("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
	//   12   28:invokestatic    #158 <Method Logger Fabric.getLogger()>
	//   13   31:ldc1            #160 <String "CrashlyticsCore">
	//   14   33:ldc1            #162 <String "Preferences requested no custom logs. Aborting log file creation.">
	//   15   35:invokeinterface #168 <Method void Logger.d(String, String)>
			return;
	//   16   40:return          
		} else
		{
			setLogFile(getWorkingFileForSession(s), 0x10000);
	//   17   41:aload_0         
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:invokespecial   #170 <Method File getWorkingFileForSession(String)>
	//   21   47:ldc1            #22  <Int 0x10000>
	//   22   49:invokevirtual   #174 <Method void setLogFile(File, int)>
			return;
	//   23   52:return          
		}
	}

	void setLogFile(File file, int i)
	{
		currentLog = ((FileLogStore) (new QueueFileLogStore(file, i)));
	//    0    0:aload_0         
	//    1    1:new             #176 <Class QueueFileLogStore>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #178 <Method void QueueFileLogStore(File, int)>
	//    6   10:putfield        #51  <Field FileLogStore currentLog>
	//    7   13:return          
	}

	public void writeToLog(long l, String s)
	{
		currentLog.writeToLog(l, s);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field FileLogStore currentLog>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokeinterface #182 <Method void FileLogStore.writeToLog(long, String)>
	//    5   11:return          
	}

	private static final String DIRECTORY_NAME = "log-files";
	private static final String LOGFILE_EXT = ".temp";
	private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
	static final int MAX_LOG_SIZE = 0x10000;
	private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
	private final Context context;
	private FileLogStore currentLog;
	private final FileStore fileStore;

	static 
	{
	//    0    0:new             #8   <Class LogFileManager$NoopLogStore>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #36  <Method void LogFileManager$NoopLogStore(LogFileManager$1)>
	//    4    8:putstatic       #38  <Field LogFileManager$NoopLogStore NOOP_LOG_STORE>
	//*   5   11:return          
	}
}
