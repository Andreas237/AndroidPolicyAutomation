// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.b.i;
import b.a.a.a.a.b.r;
import b.a.a.a.c;
import b.a.a.a.l;
import java.io.*;
import java.util.Locale;

// Referenced classes of package com.crashlytics.android.core:
//			FileLogStore, ByteString

class QueueFileLogStore
	implements FileLogStore
{
	public class LogBytes
	{

		public final byte bytes[];
		public final int offset;
		final QueueFileLogStore this$0;

		public LogBytes(byte abyte0[], int j)
		{
			this$0 = QueueFileLogStore.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field QueueFileLogStore this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			bytes = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field byte[] bytes>
			offset = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int offset>
		//   11   19:return          
		}
	}


	public QueueFileLogStore(File file, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		workingFile = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field File workingFile>
		maxLogSize = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int maxLogSize>
	//    8   14:return          
	}

	private void doWriteToLog(long l1, String s)
	{
		String s1;
		if(logFile == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field r logFile>
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
	//    8   15:ldc1            #35  <String "null">
	//    9   17:astore          5
		int j = maxLogSize / 4;
	//   10   19:aload_0         
	//   11   20:getfield        #26  <Field int maxLogSize>
	//   12   23:iconst_4        
	//   13   24:idiv            
	//   14   25:istore          4
		s = s1;
	//   15   27:aload           5
	//   16   29:astore_3        
		try
		{
			if(s1.length() > j)
	//*  17   30:aload           5
	//*  18   32:invokevirtual   #41  <Method int String.length()>
	//*  19   35:iload           4
	//*  20   37:icmple          78
			{
				s = ((String) (new StringBuilder()));
	//   21   40:new             #43  <Class StringBuilder>
	//   22   43:dup             
	//   23   44:invokespecial   #44  <Method void StringBuilder()>
	//   24   47:astore_3        
				((StringBuilder) (s)).append("...");
	//   25   48:aload_3         
	//   26   49:ldc1            #46  <String "...">
	//   27   51:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   28   54:pop             
				((StringBuilder) (s)).append(s1.substring(s1.length() - j));
	//   29   55:aload_3         
	//   30   56:aload           5
	//   31   58:aload           5
	//   32   60:invokevirtual   #41  <Method int String.length()>
	//   33   63:iload           4
	//   34   65:isub            
	//   35   66:invokevirtual   #54  <Method String String.substring(int)>
	//   36   69:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
				s = ((StringBuilder) (s)).toString();
	//   38   73:aload_3         
	//   39   74:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   40   77:astore_3        
			}
			s = s.replaceAll("\r", " ").replaceAll("\n", " ");
	//   41   78:aload_3         
	//   42   79:ldc1            #60  <String "\r">
	//   43   81:ldc1            #62  <String " ">
	//   44   83:invokevirtual   #66  <Method String String.replaceAll(String, String)>
	//   45   86:ldc1            #68  <String "\n">
	//   46   88:ldc1            #62  <String " ">
	//   47   90:invokevirtual   #66  <Method String String.replaceAll(String, String)>
	//   48   93:astore_3        
			s = ((String) (String.format(Locale.US, "%d %s%n", new Object[] {
				Long.valueOf(l1), s
			}).getBytes("UTF-8")));
	//   49   94:getstatic       #74  <Field Locale Locale.US>
	//   50   97:ldc1            #76  <String "%d %s%n">
	//   51   99:iconst_2        
	//   52  100:anewarray       Object[]
	//   53  103:dup             
	//   54  104:iconst_0        
	//   55  105:lload_1         
	//   56  106:invokestatic    #82  <Method Long Long.valueOf(long)>
	//   57  109:aastore         
	//   58  110:dup             
	//   59  111:iconst_1        
	//   60  112:aload_3         
	//   61  113:aastore         
	//   62  114:invokestatic    #86  <Method String String.format(Locale, String, Object[])>
	//   63  117:ldc1            #88  <String "UTF-8">
	//   64  119:invokevirtual   #92  <Method byte[] String.getBytes(String)>
	//   65  122:astore_3        
			logFile.a(((byte []) (s)));
	//   66  123:aload_0         
	//   67  124:getfield        #33  <Field r logFile>
	//   68  127:aload_3         
	//   69  128:invokevirtual   #98  <Method void r.a(byte[])>
			for(; !logFile.b() && logFile.a() > maxLogSize; logFile.c());
	//   70  131:aload_0         
	//   71  132:getfield        #33  <Field r logFile>
	//   72  135:invokevirtual   #102 <Method boolean r.b()>
	//   73  138:ifne            179
	//   74  141:aload_0         
	//   75  142:getfield        #33  <Field r logFile>
	//   76  145:invokevirtual   #104 <Method int r.a()>
	//   77  148:aload_0         
	//   78  149:getfield        #26  <Field int maxLogSize>
	//   79  152:icmple          179
	//   80  155:aload_0         
	//   81  156:getfield        #33  <Field r logFile>
	//   82  159:invokevirtual   #107 <Method void r.c()>
		}
	//*  83  162:goto            131
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  84  165:astore_3        
		{
			c.g().e("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", ((Throwable) (s)));
	//   85  166:invokestatic    #113 <Method l c.g()>
	//   86  169:ldc1            #115 <String "CrashlyticsCore">
	//   87  171:ldc1            #117 <String "There was a problem writing to the Crashlytics log.">
	//   88  173:aload_3         
	//   89  174:invokeinterface #123 <Method void l.e(String, String, Throwable)>
		}
		return;
	//   90  179:return          
	}

	private LogBytes getLogBytes()
	{
		if(!workingFile.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field File workingFile>
	//*   2    4:invokevirtual   #130 <Method boolean File.exists()>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		openLogFile();
	//    6   12:aload_0         
	//    7   13:invokespecial   #133 <Method void openLogFile()>
		if(logFile == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #33  <Field r logFile>
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
		final byte logBytes[] = new byte[logFile.a()];
	//   20   33:aload_0         
	//   21   34:getfield        #33  <Field r logFile>
	//   22   37:invokevirtual   #104 <Method int r.a()>
	//   23   40:newarray        byte[]
	//   24   42:astore_2        
		try
		{
			logFile.a(new b.a.a.a.a.b.r.c() {

				public void read(InputStream inputstream, int j)
				{
					int ai[];
					inputstream.read(logBytes, offsetHolder[0], j);
				//    0    0:aload_1         
				//    1    1:aload_0         
				//    2    2:getfield        #23  <Field byte[] val$logBytes>
				//    3    5:aload_0         
				//    4    6:getfield        #25  <Field int[] val$offsetHolder>
				//    5    9:iconst_0        
				//    6   10:iaload          
				//    7   11:iload_2         
				//    8   12:invokevirtual   #36  <Method int InputStream.read(byte[], int, int)>
				//    9   15:pop             
					ai = offsetHolder;
				//   10   16:aload_0         
				//   11   17:getfield        #25  <Field int[] val$offsetHolder>
				//   12   20:astore_3        
					ai[0] = ai[0] + j;
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
				//   22   30:invokevirtual   #39  <Method void InputStream.close()>
					return;
				//   23   33:return          
					Exception exception;
					exception;
				//   24   34:astore_3        
					inputstream.close();
				//   25   35:aload_1         
				//   26   36:invokevirtual   #39  <Method void InputStream.close()>
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
	//   26   44:getfield        #33  <Field r logFile>
	//   27   47:new             #8   <Class QueueFileLogStore$1>
	//   28   50:dup             
	//   29   51:aload_0         
	//   30   52:aload_2         
	//   31   53:aload_1         
	//   32   54:invokespecial   #136 <Method void QueueFileLogStore$1(QueueFileLogStore, byte[], int[])>
	//   33   57:invokevirtual   #139 <Method void r.a(b.a.a.a.a.b.r$c)>
		}
	//*  34   60:goto            77
		catch(IOException ioexception)
	//*  35   63:astore_3        
		{
			c.g().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", ((Throwable) (ioexception)));
	//   36   64:invokestatic    #113 <Method l c.g()>
	//   37   67:ldc1            #115 <String "CrashlyticsCore">
	//   38   69:ldc1            #141 <String "A problem occurred while reading the Crashlytics log file.">
	//   39   71:aload_3         
	//   40   72:invokeinterface #123 <Method void l.e(String, String, Throwable)>
		}
		return new LogBytes(logBytes, offsetHolder[0]);
	//   41   77:new             #10  <Class QueueFileLogStore$LogBytes>
	//   42   80:dup             
	//   43   81:aload_0         
	//   44   82:aload_2         
	//   45   83:aload_1         
	//   46   84:iconst_0        
	//   47   85:iaload          
	//   48   86:invokespecial   #144 <Method void QueueFileLogStore$LogBytes(QueueFileLogStore, byte[], int)>
	//   49   89:areturn         
	}

	private void openLogFile()
	{
		if(logFile == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field r logFile>
	//*   2    4:ifnonnull       65
			try
			{
				logFile = new r(workingFile);
	//    3    7:aload_0         
	//    4    8:new             #94  <Class r>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field File workingFile>
	//    8   16:invokespecial   #147 <Method void r(File)>
	//    9   19:putfield        #33  <Field r logFile>
				return;
	//   10   22:return          
			}
			catch(IOException ioexception)
	//*  11   23:astore_1        
			{
				l l1 = c.g();
	//   12   24:invokestatic    #113 <Method l c.g()>
	//   13   27:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #43  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #44  <Method void StringBuilder()>
	//   17   35:astore_3        
				stringbuilder.append("Could not open log file: ");
	//   18   36:aload_3         
	//   19   37:ldc1            #149 <String "Could not open log file: ">
	//   20   39:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
				stringbuilder.append(((Object) (workingFile)));
	//   22   43:aload_3         
	//   23   44:aload_0         
	//   24   45:getfield        #24  <Field File workingFile>
	//   25   48:invokevirtual   #152 <Method StringBuilder StringBuilder.append(Object)>
	//   26   51:pop             
				l1.e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (ioexception)));
	//   27   52:aload_2         
	//   28   53:ldc1            #115 <String "CrashlyticsCore">
	//   29   55:aload_3         
	//   30   56:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   31   59:aload_1         
	//   32   60:invokeinterface #123 <Method void l.e(String, String, Throwable)>
			}
	//   33   65:return          
	}

	public void closeLogFile()
	{
		i.a(((java.io.Closeable) (logFile)), "There was a problem closing the Crashlytics log file.");
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field r logFile>
	//    2    4:ldc1            #155 <String "There was a problem closing the Crashlytics log file.">
	//    3    6:invokestatic    #160 <Method void i.a(java.io.Closeable, String)>
		logFile = null;
	//    4    9:aload_0         
	//    5   10:aconst_null     
	//    6   11:putfield        #33  <Field r logFile>
	//    7   14:return          
	}

	public void deleteLogFile()
	{
		closeLogFile();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method void closeLogFile()>
		workingFile.delete();
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field File workingFile>
	//    4    8:invokevirtual   #166 <Method boolean File.delete()>
	//    5   11:pop             
	//    6   12:return          
	}

	public ByteString getLogAsByteString()
	{
		LogBytes logbytes = getLogBytes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method QueueFileLogStore$LogBytes getLogBytes()>
	//    2    4:astore_1        
		if(logbytes == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ByteString.copyFrom(logbytes.bytes, 0, logbytes.offset);
	//    7   11:aload_1         
	//    8   12:getfield        #174 <Field byte[] QueueFileLogStore$LogBytes.bytes>
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:getfield        #177 <Field int QueueFileLogStore$LogBytes.offset>
	//   12   20:invokestatic    #183 <Method ByteString ByteString.copyFrom(byte[], int, int)>
	//   13   23:areturn         
	}

	public byte[] getLogAsBytes()
	{
		LogBytes logbytes = getLogBytes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #170 <Method QueueFileLogStore$LogBytes getLogBytes()>
	//    2    4:astore_1        
		if(logbytes == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return logbytes.bytes;
	//    7   11:aload_1         
	//    8   12:getfield        #174 <Field byte[] QueueFileLogStore$LogBytes.bytes>
	//    9   15:areturn         
	}

	public void writeToLog(long l1, String s)
	{
		openLogFile();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void openLogFile()>
		doWriteToLog(l1, s);
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:aload_3         
	//    5    7:invokespecial   #188 <Method void doWriteToLog(long, String)>
	//    6   10:return          
	}

	private r logFile;
	private final int maxLogSize;
	private final File workingFile;
}
