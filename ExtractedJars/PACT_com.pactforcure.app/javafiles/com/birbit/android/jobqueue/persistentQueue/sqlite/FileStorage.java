// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.content.Context;
import com.birbit.android.jobqueue.log.JqLog;
import java.io.*;
import java.util.Set;
import okio.*;

class FileStorage
{

	FileStorage(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		folder = new File(context.getDir("com_birbit_jobqueue_jobs", 0), (new StringBuilder()).append("files_").append(s).toString());
	//    2    4:aload_0         
	//    3    5:new             #17  <Class File>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:ldc1            #19  <String "com_birbit_jobqueue_jobs">
	//    7   12:iconst_0        
	//    8   13:invokevirtual   #25  <Method File Context.getDir(String, int)>
	//    9   16:new             #27  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #28  <Method void StringBuilder()>
	//   12   23:ldc1            #30  <String "files_">
	//   13   25:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   17   35:invokespecial   #41  <Method void File(File, String)>
	//   18   38:putfield        #43  <Field File folder>
		folder.mkdirs();
	//   19   41:aload_0         
	//   20   42:getfield        #43  <Field File folder>
	//   21   45:invokevirtual   #47  <Method boolean File.mkdirs()>
	//   22   48:pop             
	//   23   49:return          
	}

	private static void closeQuitely(Closeable closeable)
	{
		try
		{
			closeable.close();
	//    0    0:aload_0         
	//    1    1:invokeinterface #57  <Method void Closeable.close()>
			return;
	//    2    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(Closeable closeable)
	//*   3    7:astore_0        
		{
			return;
	//    4    8:return          
		}
	}

	private static String filename(String s)
	{
		return (new StringBuilder()).append(s).append(".jobs").toString();
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    5   11:ldc1            #8   <String ".jobs">
	//    6   13:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:invokevirtual   #38  <Method String StringBuilder.toString()>
	//    8   19:areturn         
	}

	private static String filenameToId(String s)
	{
		if(s.length() < ".jobs".length() + 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #67  <Method int String.length()>
	//*   2    4:ldc1            #8   <String ".jobs">
	//*   3    6:invokevirtual   #67  <Method int String.length()>
	//*   4    9:iconst_1        
	//*   5   10:iadd            
	//*   6   11:icmpge          16
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
		else
			return s.substring(0, s.length() - ".jobs".length());
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #67  <Method int String.length()>
	//   13   22:ldc1            #8   <String ".jobs">
	//   14   24:invokevirtual   #67  <Method int String.length()>
	//   15   27:isub            
	//   16   28:invokevirtual   #71  <Method String String.substring(int, int)>
	//   17   31:areturn         
	}

	private File toFile(String s)
	{
		return new File(folder, filename(s));
	//    0    0:new             #17  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #43  <Field File folder>
	//    4    8:aload_1         
	//    5    9:invokestatic    #76  <Method String filename(String)>
	//    6   12:invokespecial   #41  <Method void File(File, String)>
	//    7   15:areturn         
	}

	void delete(String s)
	{
		s = ((String) (toFile(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method File toFile(String)>
	//    3    5:astore_1        
		if(((File) (s)).exists())
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #83  <Method boolean File.exists()>
	//*   6   10:ifeq            18
			((File) (s)).delete();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #85  <Method boolean File.delete()>
	//    9   17:pop             
	//   10   18:return          
	}

	byte[] load(String s)
		throws IOException
	{
		s = ((String) (toFile(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method File toFile(String)>
	//    3    5:astore_1        
		if(!((File) (s)).exists() || !((File) (s)).canRead())
			break MISSING_BLOCK_LABEL_48;
	//    4    6:aload_1         
	//    5    7:invokevirtual   #83  <Method boolean File.exists()>
	//    6   10:ifeq            48
	//    7   13:aload_1         
	//    8   14:invokevirtual   #90  <Method boolean File.canRead()>
	//    9   17:ifeq            48
		s = ((String) (Okio.buffer(Okio.source(((File) (s))))));
	//   10   20:aload_1         
	//   11   21:invokestatic    #96  <Method okio.Source Okio.source(File)>
	//   12   24:invokestatic    #100 <Method BufferedSource Okio.buffer(okio.Source)>
	//   13   27:astore_1        
		byte abyte0[] = ((BufferedSource) (s)).readByteArray();
	//   14   28:aload_1         
	//   15   29:invokeinterface #106 <Method byte[] BufferedSource.readByteArray()>
	//   16   34:astore_2        
		closeQuitely(((Closeable) (s)));
	//   17   35:aload_1         
	//   18   36:invokestatic    #108 <Method void closeQuitely(Closeable)>
		return abyte0;
	//   19   39:aload_2         
	//   20   40:areturn         
		Exception exception;
		exception;
	//   21   41:astore_2        
		closeQuitely(((Closeable) (s)));
	//   22   42:aload_1         
	//   23   43:invokestatic    #108 <Method void closeQuitely(Closeable)>
		throw exception;
	//   24   46:aload_2         
	//   25   47:athrow          
		return null;
	//   26   48:aconst_null     
	//   27   49:areturn         
	}

	void save(String s, byte abyte0[])
		throws IOException
	{
		s = ((String) (Okio.buffer(Okio.sink(toFile(s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method File toFile(String)>
	//    3    5:invokestatic    #115 <Method okio.Sink Okio.sink(File)>
	//    4    8:invokestatic    #118 <Method BufferedSink Okio.buffer(okio.Sink)>
	//    5   11:astore_1        
		((BufferedSink) (s)).write(abyte0).flush();
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokeinterface #124 <Method BufferedSink BufferedSink.write(byte[])>
	//    9   19:invokeinterface #127 <Method void BufferedSink.flush()>
		closeQuitely(((Closeable) (s)));
	//   10   24:aload_1         
	//   11   25:invokestatic    #108 <Method void closeQuitely(Closeable)>
		return;
	//   12   28:return          
		abyte0;
	//   13   29:astore_2        
		closeQuitely(((Closeable) (s)));
	//   14   30:aload_1         
	//   15   31:invokestatic    #108 <Method void closeQuitely(Closeable)>
		throw abyte0;
	//   16   34:aload_2         
	//   17   35:athrow          
	}

	void truncateExcept(Set set)
	{
		String as[] = folder.list();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field File folder>
	//    2    4:invokevirtual   #133 <Method String[] File.list()>
	//    3    7:astore          4
		int j = as.length;
	//    4    9:aload           4
	//    5   11:arraylength     
	//    6   12:istore_3        
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		do
		{
			if(i >= j)
				break;
	//    9   15:iload_2         
	//   10   16:iload_3         
	//   11   17:icmpge          113
			Object obj = ((Object) (as[i]));
	//   12   20:aload           4
	//   13   22:iload_2         
	//   14   23:aaload          
	//   15   24:astore          5
			if(((String) (obj)).endsWith(".jobs") && !set.contains(((Object) (filenameToId(((String) (obj)))))))
	//*  16   26:aload           5
	//*  17   28:ldc1            #8   <String ".jobs">
	//*  18   30:invokevirtual   #137 <Method boolean String.endsWith(String)>
	//*  19   33:ifne            43
	//*  20   36:iload_2         
	//*  21   37:iconst_1        
	//*  22   38:iadd            
	//*  23   39:istore_2        
	//*  24   40:goto            15
	//*  25   43:aload_1         
	//*  26   44:aload           5
	//*  27   46:invokestatic    #139 <Method String filenameToId(String)>
	//*  28   49:invokeinterface #145 <Method boolean Set.contains(Object)>
	//*  29   54:ifne            36
			{
				obj = ((Object) (new File(folder, ((String) (obj)))));
	//   30   57:new             #17  <Class File>
	//   31   60:dup             
	//   32   61:aload_0         
	//   33   62:getfield        #43  <Field File folder>
	//   34   65:aload           5
	//   35   67:invokespecial   #41  <Method void File(File, String)>
	//   36   70:astore          5
				if(!((File) (obj)).delete())
	//*  37   72:aload           5
	//*  38   74:invokevirtual   #85  <Method boolean File.delete()>
	//*  39   77:ifne            36
					JqLog.d((new StringBuilder()).append("cannot delete unused job toFile ").append(((File) (obj)).getAbsolutePath()).toString(), new Object[0]);
	//   40   80:new             #27  <Class StringBuilder>
	//   41   83:dup             
	//   42   84:invokespecial   #28  <Method void StringBuilder()>
	//   43   87:ldc1            #147 <String "cannot delete unused job toFile ">
	//   44   89:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   45   92:aload           5
	//   46   94:invokevirtual   #150 <Method String File.getAbsolutePath()>
	//   47   97:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   48  100:invokevirtual   #38  <Method String StringBuilder.toString()>
	//   49  103:iconst_0        
	//   50  104:anewarray       Object[]
	//   51  107:invokestatic    #156 <Method void JqLog.d(String, Object[])>
			}
			i++;
		} while(true);
	//*  52  110:goto            36
	//   53  113:return          
	}

	private static final String EXT = ".jobs";
	private final File folder;
}
