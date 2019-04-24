// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import b.a.a.a.a.b.i;
import b.a.a.a.c;
import b.a.a.a.l;
import java.io.File;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//			FileLogStore, QueueFileLogStore, ByteString

class LogFileManager
{
	public static interface DirectoryProvider
	{

		public abstract File getLogFileDir();
	}

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

		public byte[] getLogAsBytes()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void writeToLog(long l1, String s)
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


	LogFileManager(Context context1, DirectoryProvider directoryprovider)
	{
		this(context1, directoryprovider, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #46  <Method void LogFileManager(Context, LogFileManager$DirectoryProvider, String)>
	//    5    7:return          
	}

	LogFileManager(Context context1, DirectoryProvider directoryprovider, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field Context context>
		directoryProvider = directoryprovider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #52  <Field LogFileManager$DirectoryProvider directoryProvider>
		currentLog = ((FileLogStore) (NOOP_LOG_STORE));
	//    8   14:aload_0         
	//    9   15:getstatic       #41  <Field LogFileManager$NoopLogStore NOOP_LOG_STORE>
	//   10   18:putfield        #54  <Field FileLogStore currentLog>
		setCurrentSession(s);
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #58  <Method void setCurrentSession(String)>
	//   14   26:return          
	}

	private String getSessionIdForFile(File file)
	{
		file = ((File) (file.getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method String File.getName()>
	//    2    4:astore_1        
		int j = ((String) (file)).lastIndexOf(".temp");
	//    3    5:aload_1         
	//    4    6:ldc1            #19  <String ".temp">
	//    5    8:invokevirtual   #72  <Method int String.lastIndexOf(String)>
	//    6   11:istore_2        
		if(j == -1)
	//*   7   12:iload_2         
	//*   8   13:iconst_m1       
	//*   9   14:icmpne          19
			return ((String) (file));
	//   10   17:aload_1         
	//   11   18:areturn         
		else
			return ((String) (file)).substring("crashlytics-userlog-".length(), j);
	//   12   19:aload_1         
	//   13   20:ldc1            #22  <String "crashlytics-userlog-">
	//   14   22:invokevirtual   #76  <Method int String.length()>
	//   15   25:iload_2         
	//   16   26:invokevirtual   #80  <Method String String.substring(int, int)>
	//   17   29:areturn         
	}

	private File getWorkingFileForSession(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("crashlytics-userlog-");
	//    4    8:aload_2         
	//    5    9:ldc1            #22  <String "crashlytics-userlog-">
	//    6   11:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append(".temp");
	//   12   21:aload_2         
	//   13   22:ldc1            #19  <String ".temp">
	//   14   24:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		s = stringbuilder.toString();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   18   32:astore_1        
		return new File(directoryProvider.getLogFileDir(), s);
	//   19   33:new             #62  <Class File>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:getfield        #52  <Field LogFileManager$DirectoryProvider directoryProvider>
	//   23   41:invokeinterface #96  <Method File LogFileManager$DirectoryProvider.getLogFileDir()>
	//   24   46:aload_1         
	//   25   47:invokespecial   #99  <Method void File(File, String)>
	//   26   50:areturn         
	}

	void clearLog()
	{
		currentLog.deleteLogFile();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field FileLogStore currentLog>
	//    2    4:invokeinterface #105 <Method void FileLogStore.deleteLogFile()>
	//    3    9:return          
	}

	void discardOldLogFiles(Set set)
	{
		File afile[] = directoryProvider.getLogFileDir().listFiles();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field LogFileManager$DirectoryProvider directoryProvider>
	//    2    4:invokeinterface #96  <Method File LogFileManager$DirectoryProvider.getLogFileDir()>
	//    3    9:invokevirtual   #111 <Method File[] File.listFiles()>
	//    4   12:astore          4
		if(afile != null)
	//*   5   14:aload           4
	//*   6   16:ifnull          64
		{
			int k = afile.length;
	//    7   19:aload           4
	//    8   21:arraylength     
	//    9   22:istore_3        
			for(int j = 0; j < k; j++)
	//*  10   23:iconst_0        
	//*  11   24:istore_2        
	//*  12   25:iload_2         
	//*  13   26:iload_3         
	//*  14   27:icmpge          64
			{
				File file = afile[j];
	//   15   30:aload           4
	//   16   32:iload_2         
	//   17   33:aaload          
	//   18   34:astore          5
				if(!set.contains(((Object) (getSessionIdForFile(file)))))
	//*  19   36:aload_1         
	//*  20   37:aload_0         
	//*  21   38:aload           5
	//*  22   40:invokespecial   #113 <Method String getSessionIdForFile(File)>
	//*  23   43:invokeinterface #119 <Method boolean Set.contains(Object)>
	//*  24   48:ifne            57
					file.delete();
	//   25   51:aload           5
	//   26   53:invokevirtual   #123 <Method boolean File.delete()>
	//   27   56:pop             
			}

	//   28   57:iload_2         
	//   29   58:iconst_1        
	//   30   59:iadd            
	//   31   60:istore_2        
		}
	//*  32   61:goto            25
	//   33   64:return          
	}

	ByteString getByteStringForLog()
	{
		return currentLog.getLogAsByteString();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field FileLogStore currentLog>
	//    2    4:invokeinterface #130 <Method ByteString FileLogStore.getLogAsByteString()>
	//    3    9:areturn         
	}

	byte[] getBytesForLog()
	{
		return currentLog.getLogAsBytes();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field FileLogStore currentLog>
	//    2    4:invokeinterface #135 <Method byte[] FileLogStore.getLogAsBytes()>
	//    3    9:areturn         
	}

	final void setCurrentSession(String s)
	{
		currentLog.closeLogFile();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field FileLogStore currentLog>
	//    2    4:invokeinterface #138 <Method void FileLogStore.closeLogFile()>
		currentLog = ((FileLogStore) (NOOP_LOG_STORE));
	//    3    9:aload_0         
	//    4   10:getstatic       #41  <Field LogFileManager$NoopLogStore NOOP_LOG_STORE>
	//    5   13:putfield        #54  <Field FileLogStore currentLog>
		if(s == null)
	//*   6   16:aload_1         
	//*   7   17:ifnonnull       21
			return;
	//    8   20:return          
		if(!i.a(context, "com.crashlytics.CollectCustomLogs", true))
	//*   9   21:aload_0         
	//*  10   22:getfield        #50  <Field Context context>
	//*  11   25:ldc1            #16  <String "com.crashlytics.CollectCustomLogs">
	//*  12   27:iconst_1        
	//*  13   28:invokestatic    #144 <Method boolean i.a(Context, String, boolean)>
	//*  14   31:ifne            47
		{
			c.g().a("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
	//   15   34:invokestatic    #150 <Method l c.g()>
	//   16   37:ldc1            #152 <String "CrashlyticsCore">
	//   17   39:ldc1            #154 <String "Preferences requested no custom logs. Aborting log file creation.">
	//   18   41:invokeinterface #159 <Method void l.a(String, String)>
			return;
	//   19   46:return          
		} else
		{
			setLogFile(getWorkingFileForSession(s), 0x10000);
	//   20   47:aload_0         
	//   21   48:aload_0         
	//   22   49:aload_1         
	//   23   50:invokespecial   #161 <Method File getWorkingFileForSession(String)>
	//   24   53:ldc1            #25  <Int 0x10000>
	//   25   55:invokevirtual   #165 <Method void setLogFile(File, int)>
			return;
	//   26   58:return          
		}
	}

	void setLogFile(File file, int j)
	{
		currentLog = ((FileLogStore) (new QueueFileLogStore(file, j)));
	//    0    0:aload_0         
	//    1    1:new             #167 <Class QueueFileLogStore>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #169 <Method void QueueFileLogStore(File, int)>
	//    6   10:putfield        #54  <Field FileLogStore currentLog>
	//    7   13:return          
	}

	void writeToLog(long l1, String s)
	{
		currentLog.writeToLog(l1, s);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field FileLogStore currentLog>
	//    2    4:lload_1         
	//    3    5:aload_3         
	//    4    6:invokeinterface #173 <Method void FileLogStore.writeToLog(long, String)>
	//    5   11:return          
	}

	private static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
	private static final String LOGFILE_EXT = ".temp";
	private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
	static final int MAX_LOG_SIZE = 0x10000;
	private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
	private final Context context;
	private FileLogStore currentLog;
	private final DirectoryProvider directoryProvider;

	static 
	{
	//    0    0:new             #11  <Class LogFileManager$NoopLogStore>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #39  <Method void LogFileManager$NoopLogStore(LogFileManager$1)>
	//    4    8:putstatic       #41  <Field LogFileManager$NoopLogStore NOOP_LOG_STORE>
	//*   5   11:return          
	}
}
