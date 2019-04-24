// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.*;
import java.util.*;

// Referenced classes of package io.fabric.sdk.android.services.events:
//			EventsStorage

public class QueueFileEventStorage
	implements EventsStorage
{

	public QueueFileEventStorage(Context context1, File file, String s, String s1)
		throws IOException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field Context context>
		workingDirectory = file;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field File workingDirectory>
		targetDirectoryName = s1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #29  <Field String targetDirectoryName>
		workingFile = new File(workingDirectory, s);
	//   11   20:aload_0         
	//   12   21:new             #31  <Class File>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:getfield        #27  <Field File workingDirectory>
	//   16   29:aload_3         
	//   17   30:invokespecial   #34  <Method void File(File, String)>
	//   18   33:putfield        #36  <Field File workingFile>
		queueFile = new QueueFile(workingFile);
	//   19   36:aload_0         
	//   20   37:new             #38  <Class QueueFile>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:getfield        #36  <Field File workingFile>
	//   24   45:invokespecial   #41  <Method void QueueFile(File)>
	//   25   48:putfield        #43  <Field QueueFile queueFile>
		createTargetDirectory();
	//   26   51:aload_0         
	//   27   52:invokespecial   #46  <Method void createTargetDirectory()>
	//   28   55:return          
	}

	private void createTargetDirectory()
	{
		targetDirectory = new File(workingDirectory, targetDirectoryName);
	//    0    0:aload_0         
	//    1    1:new             #31  <Class File>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field File workingDirectory>
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field String targetDirectoryName>
	//    7   13:invokespecial   #34  <Method void File(File, String)>
	//    8   16:putfield        #50  <Field File targetDirectory>
		if(!targetDirectory.exists())
	//*   9   19:aload_0         
	//*  10   20:getfield        #50  <Field File targetDirectory>
	//*  11   23:invokevirtual   #54  <Method boolean File.exists()>
	//*  12   26:ifne            37
			targetDirectory.mkdirs();
	//   13   29:aload_0         
	//   14   30:getfield        #50  <Field File targetDirectory>
	//   15   33:invokevirtual   #57  <Method boolean File.mkdirs()>
	//   16   36:pop             
	//   17   37:return          
	}

	private void move(File file, File file1)
		throws IOException
	{
		File file2;
		Object obj1;
		Object obj2;
		obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		file2 = null;
	//    2    3:aconst_null     
	//    3    4:astore_3        
		obj1 = null;
	//    4    5:aconst_null     
	//    5    6:astore          5
		Object obj = ((Object) (new FileInputStream(file)));
	//    6    8:new             #61  <Class FileInputStream>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:invokespecial   #62  <Method void FileInputStream(File)>
	//   10   16:astore          4
		file2 = ((File) (obj2));
	//   11   18:aload           6
	//   12   20:astore_3        
		file1 = ((File) (getMoveOutputStream(file1)));
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #66  <Method OutputStream getMoveOutputStream(File)>
	//   16   26:astore_2        
		file2 = file1;
	//   17   27:aload_2         
	//   18   28:astore_3        
		CommonUtils.copyStream(((java.io.InputStream) (obj)), ((OutputStream) (file1)), new byte[1024]);
	//   19   29:aload           4
	//   20   31:aload_2         
	//   21   32:sipush          1024
	//   22   35:newarray        byte[]
	//   23   37:invokestatic    #72  <Method void CommonUtils.copyStream(java.io.InputStream, OutputStream, byte[])>
		CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close file input stream");
	//   24   40:aload           4
	//   25   42:ldc1            #74  <String "Failed to close file input stream">
	//   26   44:invokestatic    #78  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (file1)), "Failed to close output stream");
	//   27   47:aload_2         
	//   28   48:ldc1            #80  <String "Failed to close output stream">
	//   29   50:invokestatic    #78  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		file.delete();
	//   30   53:aload_1         
	//   31   54:invokevirtual   #83  <Method boolean File.delete()>
	//   32   57:pop             
		return;
	//   33   58:return          
		obj;
	//   34   59:astore          4
		file1 = ((File) (obj1));
	//   35   61:aload           5
	//   36   63:astore_2        
_L2:
		CommonUtils.closeOrLog(((java.io.Closeable) (file1)), "Failed to close file input stream");
	//   37   64:aload_2         
	//   38   65:ldc1            #74  <String "Failed to close file input stream">
	//   39   67:invokestatic    #78  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		CommonUtils.closeOrLog(((java.io.Closeable) (file2)), "Failed to close output stream");
	//   40   70:aload_3         
	//   41   71:ldc1            #80  <String "Failed to close output stream">
	//   42   73:invokestatic    #78  <Method void CommonUtils.closeOrLog(java.io.Closeable, String)>
		file.delete();
	//   43   76:aload_1         
	//   44   77:invokevirtual   #83  <Method boolean File.delete()>
	//   45   80:pop             
		throw obj;
	//   46   81:aload           4
	//   47   83:athrow          
		Exception exception;
		exception;
	//   48   84:astore          5
		file1 = ((File) (obj));
	//   49   86:aload           4
	//   50   88:astore_2        
		obj = ((Object) (exception));
	//   51   89:aload           5
	//   52   91:astore          4
		if(true) goto _L2; else goto _L1
	//   53   93:goto            64
_L1:
	}

	public void add(byte abyte0[])
		throws IOException
	{
		queueFile.add(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field QueueFile queueFile>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method void QueueFile.add(byte[])>
	//    4    8:return          
	}

	public boolean canWorkingFileStore(int i, int j)
	{
		return queueFile.hasSpaceFor(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field QueueFile queueFile>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #92  <Method boolean QueueFile.hasSpaceFor(int, int)>
	//    5    9:ireturn         
	}

	public void deleteFilesInRollOverDirectory(List list)
	{
		File file;
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); file.delete())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #100 <Method Iterator List.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            57
		{
			file = (File)((Iterator) (list)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #109 <Method Object Iterator.next()>
	//    8   22:checkcast       #31  <Class File>
	//    9   25:astore_2        
			CommonUtils.logControlled(context, String.format("deleting sent analytics file %s", new Object[] {
				file.getName()
			}));
	//   10   26:aload_0         
	//   11   27:getfield        #25  <Field Context context>
	//   12   30:ldc1            #111 <String "deleting sent analytics file %s">
	//   13   32:iconst_1        
	//   14   33:anewarray       Object[]
	//   15   36:dup             
	//   16   37:iconst_0        
	//   17   38:aload_2         
	//   18   39:invokevirtual   #115 <Method String File.getName()>
	//   19   42:aastore         
	//   20   43:invokestatic    #121 <Method String String.format(String, Object[])>
	//   21   46:invokestatic    #125 <Method void CommonUtils.logControlled(Context, String)>
		}

	//   22   49:aload_2         
	//   23   50:invokevirtual   #83  <Method boolean File.delete()>
	//   24   53:pop             
	//*  25   54:goto            7
	//   26   57:return          
	}

	public void deleteWorkingFile()
	{
		try
		{
			queueFile.close();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field QueueFile queueFile>
	//    2    4:invokevirtual   #131 <Method void QueueFile.close()>
		}
	//*   3    7:aload_0         
	//*   4    8:getfield        #36  <Field File workingFile>
	//*   5   11:invokevirtual   #83  <Method boolean File.delete()>
	//*   6   14:pop             
	//*   7   15:return          
		catch(IOException ioexception) { }
	//    8   16:astore_1        
		workingFile.delete();
	//*   9   17:goto            7
	}

	public List getAllFilesInRollOverDirectory()
	{
		return Arrays.asList(((Object []) (targetDirectory.listFiles())));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field File targetDirectory>
	//    2    4:invokevirtual   #137 <Method File[] File.listFiles()>
	//    3    7:invokestatic    #143 <Method List Arrays.asList(Object[])>
	//    4   10:areturn         
	}

	public List getBatchOfFilesToSend(int i)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #148 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #149 <Method void ArrayList()>
	//    3    7:astore          4
		File afile[] = targetDirectory.listFiles();
	//    4    9:aload_0         
	//    5   10:getfield        #50  <Field File targetDirectory>
	//    6   13:invokevirtual   #137 <Method File[] File.listFiles()>
	//    7   16:astore          5
		int k = afile.length;
	//    8   18:aload           5
	//    9   20:arraylength     
	//   10   21:istore_3        
		int j = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
		do
		{
label0:
			{
				if(j < k)
	//*  13   24:iload_2         
	//*  14   25:iload_3         
	//*  15   26:icmpge          52
				{
					((List) (arraylist)).add(((Object) (afile[j])));
	//   16   29:aload           4
	//   17   31:aload           5
	//   18   33:iload_2         
	//   19   34:aaload          
	//   20   35:invokeinterface #152 <Method boolean List.add(Object)>
	//   21   40:pop             
					if(((List) (arraylist)).size() < i)
						break label0;
	//   22   41:aload           4
	//   23   43:invokeinterface #156 <Method int List.size()>
	//   24   48:iload_1         
	//   25   49:icmplt          55
				}
				return ((List) (arraylist));
	//   26   52:aload           4
	//   27   54:areturn         
			}
			j++;
	//   28   55:iload_2         
	//   29   56:iconst_1        
	//   30   57:iadd            
	//   31   58:istore_2        
		} while(true);
	//   32   59:goto            24
	}

	public OutputStream getMoveOutputStream(File file)
		throws IOException
	{
		return ((OutputStream) (new FileOutputStream(file)));
	//    0    0:new             #159 <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #160 <Method void FileOutputStream(File)>
	//    4    8:areturn         
	}

	public File getRollOverDirectory()
	{
		return targetDirectory;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field File targetDirectory>
	//    2    4:areturn         
	}

	public File getWorkingDirectory()
	{
		return workingDirectory;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field File workingDirectory>
	//    2    4:areturn         
	}

	public int getWorkingFileUsedSizeInBytes()
	{
		return queueFile.usedBytes();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field QueueFile queueFile>
	//    2    4:invokevirtual   #167 <Method int QueueFile.usedBytes()>
	//    3    7:ireturn         
	}

	public boolean isWorkingFileEmpty()
	{
		return queueFile.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field QueueFile queueFile>
	//    2    4:invokevirtual   #171 <Method boolean QueueFile.isEmpty()>
	//    3    7:ireturn         
	}

	public void rollOver(String s)
		throws IOException
	{
		queueFile.close();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field QueueFile queueFile>
	//    2    4:invokevirtual   #131 <Method void QueueFile.close()>
		move(workingFile, new File(targetDirectory, s));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field File workingFile>
	//    6   12:new             #31  <Class File>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #50  <Field File targetDirectory>
	//   10   20:aload_1         
	//   11   21:invokespecial   #34  <Method void File(File, String)>
	//   12   24:invokespecial   #175 <Method void move(File, File)>
		queueFile = new QueueFile(workingFile);
	//   13   27:aload_0         
	//   14   28:new             #38  <Class QueueFile>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:getfield        #36  <Field File workingFile>
	//   18   36:invokespecial   #41  <Method void QueueFile(File)>
	//   19   39:putfield        #43  <Field QueueFile queueFile>
	//   20   42:return          
	}

	private final Context context;
	private QueueFile queueFile;
	private File targetDirectory;
	private final String targetDirectoryName;
	private final File workingDirectory;
	private final File workingFile;
}
