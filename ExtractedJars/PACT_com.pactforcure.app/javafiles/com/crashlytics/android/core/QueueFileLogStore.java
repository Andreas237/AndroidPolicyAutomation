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
		if(logFile != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field QueueFile logFile>
	//    2    4:ifnonnull       8
_L1:
		return;
	//    3    7:return          
_L2:
		String s1 = s;
	//    4    8:aload_3         
	//    5    9:astore          5
		if(s == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       19
			s1 = "null";
	//    8   15:ldc1            #32  <String "null">
	//    9   17:astore          5
		int i;
		try
		{
			i = maxLogSize / 4;
	//   10   19:aload_0         
	//   11   20:getfield        #23  <Field int maxLogSize>
	//   12   23:iconst_4        
	//   13   24:idiv            
	//   14   25:istore          4
		}
	//*  15   27:aload           5
	//*  16   29:astore_3        
	//*  17   30:aload           5
	//*  18   32:invokevirtual   #38  <Method int String.length()>
	//*  19   35:iload           4
	//*  20   37:icmple          72
	//*  21   40:new             #40  <Class StringBuilder>
	//*  22   43:dup             
	//*  23   44:invokespecial   #41  <Method void StringBuilder()>
	//*  24   47:ldc1            #43  <String "...">
	//*  25   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  26   52:aload           5
	//*  27   54:aload           5
	//*  28   56:invokevirtual   #38  <Method int String.length()>
	//*  29   59:iload           4
	//*  30   61:isub            
	//*  31   62:invokevirtual   #51  <Method String String.substring(int)>
	//*  32   65:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//*  33   68:invokevirtual   #55  <Method String StringBuilder.toString()>
	//*  34   71:astore_3        
	//*  35   72:aload_3         
	//*  36   73:ldc1            #57  <String "\r">
	//*  37   75:ldc1            #59  <String " ">
	//*  38   77:invokevirtual   #63  <Method String String.replaceAll(String, String)>
	//*  39   80:ldc1            #65  <String "\n">
	//*  40   82:ldc1            #59  <String " ">
	//*  41   84:invokevirtual   #63  <Method String String.replaceAll(String, String)>
	//*  42   87:astore_3        
	//*  43   88:getstatic       #71  <Field Locale Locale.US>
	//*  44   91:ldc1            #73  <String "%d %s%n">
	//*  45   93:iconst_2        
	//*  46   94:anewarray       Object[]
	//*  47   97:dup             
	//*  48   98:iconst_0        
	//*  49   99:lload_1         
	//*  50  100:invokestatic    #79  <Method Long Long.valueOf(long)>
	//*  51  103:aastore         
	//*  52  104:dup             
	//*  53  105:iconst_1        
	//*  54  106:aload_3         
	//*  55  107:aastore         
	//*  56  108:invokestatic    #83  <Method String String.format(Locale, String, Object[])>
	//*  57  111:ldc1            #85  <String "UTF-8">
	//*  58  113:invokevirtual   #89  <Method byte[] String.getBytes(String)>
	//*  59  116:astore_3        
	//*  60  117:aload_0         
	//*  61  118:getfield        #30  <Field QueueFile logFile>
	//*  62  121:aload_3         
	//*  63  122:invokevirtual   #95  <Method void QueueFile.add(byte[])>
	//*  64  125:aload_0         
	//*  65  126:getfield        #30  <Field QueueFile logFile>
	//*  66  129:invokevirtual   #99  <Method boolean QueueFile.isEmpty()>
	//*  67  132:ifne            7
	//*  68  135:aload_0         
	//*  69  136:getfield        #30  <Field QueueFile logFile>
	//*  70  139:invokevirtual   #102 <Method int QueueFile.usedBytes()>
	//*  71  142:aload_0         
	//*  72  143:getfield        #23  <Field int maxLogSize>
	//*  73  146:icmple          7
	//*  74  149:aload_0         
	//*  75  150:getfield        #30  <Field QueueFile logFile>
	//*  76  153:invokevirtual   #105 <Method void QueueFile.remove()>
	//*  77  156:goto            125
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  78  159:astore_3        
		{
			Fabric.getLogger().e("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", ((Throwable) (s)));
	//   79  160:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   80  163:ldc1            #113 <String "CrashlyticsCore">
	//   81  165:ldc1            #115 <String "There was a problem writing to the Crashlytics log.">
	//   82  167:aload_3         
	//   83  168:invokeinterface #121 <Method void Logger.e(String, String, Throwable)>
			return;
	//   84  173:return          
		}
		s = s1;
		if(s1.length() > i)
			s = (new StringBuilder()).append("...").append(s1.substring(s1.length() - i)).toString();
		s = s.replaceAll("\r", " ").replaceAll("\n", " ");
		s = ((String) (String.format(Locale.US, "%d %s%n", new Object[] {
			Long.valueOf(l), s
		}).getBytes("UTF-8")));
		logFile.add(((byte []) (s)));
		while(!logFile.isEmpty() && logFile.usedBytes() > maxLogSize) 
			logFile.remove();
		if(true) goto _L1; else goto _L3
_L3:
	}

	private void openLogFile()
	{
		if(logFile != null)
			break MISSING_BLOCK_LABEL_22;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field QueueFile logFile>
	//    2    4:ifnonnull       22
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
		IOException ioexception;
		ioexception;
	//   11   23:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Could not open log file: ").append(((Object) (workingFile))).toString(), ((Throwable) (ioexception)));
	//   12   24:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   13   27:ldc1            #113 <String "CrashlyticsCore">
	//   14   29:new             #40  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #41  <Method void StringBuilder()>
	//   17   36:ldc1            #127 <String "Could not open log file: ">
	//   18   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:aload_0         
	//   20   42:getfield        #21  <Field File workingFile>
	//   21   45:invokevirtual   #130 <Method StringBuilder StringBuilder.append(Object)>
	//   22   48:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   23   51:aload_1         
	//   24   52:invokeinterface #121 <Method void Logger.e(String, String, Throwable)>
		return;
	//   25   57:return          
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
		if(workingFile.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field File workingFile>
	//*   2    4:invokevirtual   #152 <Method boolean File.exists()>
	//*   3    7:ifne            12
	//*   4   10:aconst_null     
	//*   5   11:areturn         
		{
			openLogFile();
	//    6   12:aload_0         
	//    7   13:invokespecial   #154 <Method void openLogFile()>
			if(logFile != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #30  <Field QueueFile logFile>
	//*  10   20:ifnull          10
			{
				final int offsetHolder[] = new int[1];
	//   11   23:iconst_1        
	//   12   24:newarray        int[]
	//   13   26:astore_1        
				offsetHolder[0] = 0;
	//   14   27:aload_1         
	//   15   28:iconst_0        
	//   16   29:iconst_0        
	//   17   30:iastore         
				final byte logBytes[] = new byte[logFile.usedBytes()];
	//   18   31:aload_0         
	//   19   32:getfield        #30  <Field QueueFile logFile>
	//   20   35:invokevirtual   #102 <Method int QueueFile.usedBytes()>
	//   21   38:newarray        byte[]
	//   22   40:astore_2        
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
	//   23   41:aload_0         
	//   24   42:getfield        #30  <Field QueueFile logFile>
	//   25   45:new             #8   <Class QueueFileLogStore$1>
	//   26   48:dup             
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:aload_1         
	//   30   52:invokespecial   #157 <Method void QueueFileLogStore$1(QueueFileLogStore, byte[], int[])>
	//   31   55:invokevirtual   #161 <Method void QueueFile.forEach(io.fabric.sdk.android.services.common.QueueFile$ElementReader)>
				}
	//*  32   58:aload_2         
	//*  33   59:iconst_0        
	//*  34   60:aload_1         
	//*  35   61:iconst_0        
	//*  36   62:iaload          
	//*  37   63:invokestatic    #167 <Method ByteString ByteString.copyFrom(byte[], int, int)>
	//*  38   66:areturn         
				catch(IOException ioexception)
	//*  39   67:astore_3        
				{
					Fabric.getLogger().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", ((Throwable) (ioexception)));
	//   40   68:invokestatic    #111 <Method Logger Fabric.getLogger()>
	//   41   71:ldc1            #113 <String "CrashlyticsCore">
	//   42   73:ldc1            #169 <String "A problem occurred while reading the Crashlytics log file.">
	//   43   75:aload_3         
	//   44   76:invokeinterface #121 <Method void Logger.e(String, String, Throwable)>
				}
				return ByteString.copyFrom(logBytes, 0, offsetHolder[0]);
			}
		}
		return null;
	//*  45   81:goto            58
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
