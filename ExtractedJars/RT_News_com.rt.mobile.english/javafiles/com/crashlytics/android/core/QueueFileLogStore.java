// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.*;
import java.util.Locale;

// Referenced classes of package com.crashlytics.android.core:
//			FileLogStore, ByteString

class QueueFileLogStore
	implements FileLogStore
{

	public QueueFileLogStore(File file, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		workingFile = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field File workingFile>
		maxLogSize = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int maxLogSize>
	//    8   14:return          
	}

	private void doWriteToLog(long l, String s)
	{
		String s1;
		if(logFile == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field QueueFile logFile>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		s1 = s;
	//    4    8:aload_3         
	//    5    9:astore          5
		if(s == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       19
			s1 = "null";
	//    8   15:ldc1            #32  <String "null">
	//    9   17:astore          5
		int i = maxLogSize / 4;
	//   10   19:aload_0         
	//   11   20:getfield        #23  <Field int maxLogSize>
	//   12   23:iconst_4        
	//   13   24:idiv            
	//   14   25:istore          4
		s = s1;
	//   15   27:aload           5
	//   16   29:astore_3        
		try
		{
			if(s1.length() > i)
	//*  17   30:aload           5
	//*  18   32:invokevirtual   #38  <Method int String.length()>
	//*  19   35:iload           4
	//*  20   37:icmple          78
			{
				s = ((String) (new StringBuilder()));
	//   21   40:new             #40  <Class StringBuilder>
	//   22   43:dup             
	//   23   44:invokespecial   #41  <Method void StringBuilder()>
	//   24   47:astore_3        
				((StringBuilder) (s)).append("...");
	//   25   48:aload_3         
	//   26   49:ldc1            #43  <String "...">
	//   27   51:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
				((StringBuilder) (s)).append(s1.substring(s1.length() - i));
	//   29   55:aload_3         
	//   30   56:aload           5
	//   31   58:aload           5
	//   32   60:invokevirtual   #38  <Method int String.length()>
	//   33   63:iload           4
	//   34   65:isub            
	//   35   66:invokevirtual   #51  <Method String String.substring(int)>
	//   36   69:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
				s = ((StringBuilder) (s)).toString();
	//   38   73:aload_3         
	//   39   74:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   40   77:astore_3        
			}
			s = s.replaceAll("\r", " ").replaceAll("\n", " ");
	//   41   78:aload_3         
	//   42   79:ldc1            #57  <String "\r">
	//   43   81:ldc1            #59  <String " ">
	//   44   83:invokevirtual   #63  <Method String String.replaceAll(String, String)>
	//   45   86:ldc1            #65  <String "\n">
	//   46   88:ldc1            #59  <String " ">
	//   47   90:invokevirtual   #63  <Method String String.replaceAll(String, String)>
	//   48   93:astore_3        
			s = ((String) (String.format(Locale.US, "%d %s%n", new Object[] {
				Long.valueOf(l), s
			}).getBytes("UTF-8")));
	//   49   94:getstatic       #71  <Field Locale Locale.US>
	//   50   97:ldc1            #73  <String "%d %s%n">
	//   51   99:iconst_2        
	//   52  100:anewarray       Object[]
	//   53  103:dup             
	//   54  104:iconst_0        
	//   55  105:lload_1         
	//   56  106:invokestatic    #79  <Method Long Long.valueOf(long)>
	//   57  109:aastore         
	//   58  110:dup             
	//   59  111:iconst_1        
	//   60  112:aload_3         
	//   61  113:aastore         
	//   62  114:invokestatic    #83  <Method String String.format(Locale, String, Object[])>
	//   63  117:ldc1            #85  <String "UTF-8">
	//   64  119:invokevirtual   #89  <Method byte[] String.getBytes(String)>
	//   65  122:astore_3        
			logFile.add(((byte []) (s)));
	//   66  123:aload_0         
	//   67  124:getfield        #30  <Field QueueFile logFile>
	//   68  127:aload_3         
	//   69  128:invokevirtual   #95  <Method void QueueFile.add(byte[])>
			for(; !logFile.isEmpty() && logFile.usedBytes() > maxLogSize; logFile.remove());
	//   70  131:aload_0         
	//   71  132:getfield        #30  <Field QueueFile logFile>
	//   72  135:invokevirtual   #99  <Method boolean QueueFile.isEmpty()>
	//   73  138:ifne            179
	//   74  141:aload_0         
	//   75  142:getfield        #30  <Field QueueFile logFile>
	//   76  145:invokevirtual   #102 <Method int QueueFile.usedBytes()>
	//   77  148:aload_0         
	//   78  149:getfield        #23  <Field int maxLogSize>
	//   79  152:icmple          179
	//   80  155:aload_0         
	//   81  156:getfield        #30  <Field QueueFile logFile>
	//   82  159:invokevirtual   #105 <Method void QueueFile.remove()>
		}
	//*  83  162:goto            131
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  84  165:astore_3        
		{
			Fabric.getLogger().e("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", ((Throwable) (s)));
	//   85  166:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   86  169:ldc1            #113 <String "CrashlyticsCore">
	//   87  171:ldc1            #115 <String "There was a problem writing to the Crashlytics log.">
	//   88  173:aload_3         
	//   89  174:invokeinterface #121 <Method void Logger.e(String, String, Throwable)>
		}
		return;
	//   90  179:return          
	}

	private void openLogFile()
	{
		if(logFile == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field QueueFile logFile>
	//*   2    4:ifnonnull       65
			try
			{
				logFile = new QueueFile(workingFile);
	//    3    7:aload_0         
	//    4    8:new             #91  <Class QueueFile>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field File workingFile>
	//    8   16:invokespecial   #125 <Method void QueueFile(File)>
	//    9   19:putfield        #30  <Field QueueFile logFile>
				return;
	//   10   22:return          
			}
			catch(IOException ioexception)
	//*  11   23:astore_1        
			{
				Logger logger = Fabric.getLogger();
	//   12   24:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   13   27:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #40  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #41  <Method void StringBuilder()>
	//   17   35:astore_3        
				stringbuilder.append("Could not open log file: ");
	//   18   36:aload_3         
	//   19   37:ldc1            #127 <String "Could not open log file: ">
	//   20   39:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
				stringbuilder.append(((Object) (workingFile)));
	//   22   43:aload_3         
	//   23   44:aload_0         
	//   24   45:getfield        #21  <Field File workingFile>
	//   25   48:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//   26   51:pop             
				logger.e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (ioexception)));
	//   27   52:aload_2         
	//   28   53:ldc1            #113 <String "CrashlyticsCore">
	//   29   55:aload_3         
	//   30   56:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   31   59:aload_1         
	//   32   60:invokeinterface #121 <Method void Logger.e(String, String, Throwable)>
			}
	//   33   65:return          
	}

	public void closeLogFile()
	{
		CommonUtils.closeOrLog(((java.io.Closeable) (logFile)), "There was a problem closing the Crashlytics log file.");
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field QueueFile logFile>
	//    2    4:ldc1            #133 <String "There was a problem closing the Crashlytics log file.">
	//    3    6:invokestatic    #139 <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		logFile = null;
	//    4    9:aload_0         
	//    5   10:aconst_null     
	//    6   11:putfield        #30  <Field QueueFile logFile>
	//    7   14:return          
	}

	public void deleteLogFile()
	{
		closeLogFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #142 <Method void closeLogFile()>
		workingFile.delete();
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field File workingFile>
	//    4    8:invokevirtual   #147 <Method boolean File.delete()>
	//    5   11:pop             
	//    6   12:return          
	}

	public ByteString getLogAsByteString()
	{
		if(!workingFile.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field File workingFile>
	//*   2    4:invokevirtual   #152 <Method boolean File.exists()>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		openLogFile();
	//    6   12:aload_0         
	//    7   13:invokespecial   #154 <Method void openLogFile()>
		if(logFile == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #30  <Field QueueFile logFile>
	//*  10   20:ifnonnull       25
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
		final int offsetHolder[] = new int[1];
	//   13   25:iconst_1        
	//   14   26:newarray        int[]
	//   15   28:astore_1        
		offsetHolder[0] = 0;
	//   16   29:aload_1         
	//   17   30:iconst_0        
	//   18   31:iconst_0        
	//   19   32:iastore         
		final byte logBytes[] = new byte[logFile.usedBytes()];
	//   20   33:aload_0         
	//   21   34:getfield        #30  <Field QueueFile logFile>
	//   22   37:invokevirtual   #102 <Method int QueueFile.usedBytes()>
	//   23   40:newarray        byte[]
	//   24   42:astore_2        
		try
		{
			logFile.forEach(new io.fabric.sdk.android.services.common.QueueFile.ElementReader() {

				public void read(InputStream inputstream, int i)
					throws IOException
				{
					int ai[];
					inputstream.read(logBytes, offsetHolder[0], i);
				//    0    0:aload_1         
				//    1    1:aload_0         
				//    2    2:getfield        #23  <Field byte[] val$logBytes>
				//    3    5:aload_0         
				//    4    6:getfield        #25  <Field int[] val$offsetHolder>
				//    5    9:iconst_0        
				//    6   10:iaload          
				//    7   11:iload_2         
				//    8   12:invokevirtual   #38  <Method int InputStream.read(byte[], int, int)>
				//    9   15:pop             
					ai = offsetHolder;
				//   10   16:aload_0         
				//   11   17:getfield        #25  <Field int[] val$offsetHolder>
				//   12   20:astore_3        
					ai[0] = ai[0] + i;
				//   13   21:aload_3         
				//   14   22:iconst_0        
				//   15   23:aload_3         
				//   16   24:iconst_0        
				//   17   25:iaload          
				//   18   26:iload_2         
				//   19   27:iadd            
				//   20   28:iastore         
					inputstream.close();
				//   21   29:aload_1         
				//   22   30:invokevirtual   #41  <Method void InputStream.close()>
					return;
				//   23   33:return          
					Exception exception;
					exception;
				//   24   34:astore_3        
					inputstream.close();
				//   25   35:aload_1         
				//   26   36:invokevirtual   #41  <Method void InputStream.close()>
					throw exception;
				//   27   39:aload_3         
				//   28   40:athrow          
				}

				final QueueFileLogStore this$0;
				final byte val$logBytes[];
				final int val$offsetHolder[];

			
			{
				this$0 = QueueFileLogStore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field QueueFileLogStore this$0>
				logBytes = abyte0;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field byte[] val$logBytes>
				offsetHolder = ai;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field int[] val$offsetHolder>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   25   43:aload_0         
	//   26   44:getfield        #30  <Field QueueFile logFile>
	//   27   47:new             #8   <Class QueueFileLogStore$1>
	//   28   50:dup             
	//   29   51:aload_0         
	//   30   52:aload_2         
	//   31   53:aload_1         
	//   32   54:invokespecial   #157 <Method void QueueFileLogStore$1(QueueFileLogStore, byte[], int[])>
	//   33   57:invokevirtual   #161 <Method void QueueFile.forEach(io.fabric.sdk.android.services.common.QueueFile$ElementReader)>
		}
	//*  34   60:goto            77
		catch(IOException ioexception)
	//*  35   63:astore_3        
		{
			Fabric.getLogger().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", ((Throwable) (ioexception)));
	//   36   64:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   37   67:ldc1            #113 <String "CrashlyticsCore">
	//   38   69:ldc1            #163 <String "A problem occurred while reading the Crashlytics log file.">
	//   39   71:aload_3         
	//   40   72:invokeinterface #121 <Method void Logger.e(String, String, Throwable)>
		}
		return ByteString.copyFrom(logBytes, 0, offsetHolder[0]);
	//   41   77:aload_2         
	//   42   78:iconst_0        
	//   43   79:aload_1         
	//   44   80:iconst_0        
	//   45   81:iaload          
	//   46   82:invokestatic    #169 <Method ByteString ByteString.copyFrom(byte[], int, int)>
	//   47   85:areturn         
	}

	public void writeToLog(long l, String s)
	{
		openLogFile();
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void openLogFile()>
		doWriteToLog(l, s);
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:invokespecial   #172 <Method void doWriteToLog(long, String)>
	//    6   10:return          
	}

	private QueueFile logFile;
	private final int maxLogSize;
	private final File workingFile;
}
