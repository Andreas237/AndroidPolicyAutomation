// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.util.Log;
import java.io.*;

public final class AtomicFile
{
	private static final class AtomicFileOutputStream extends OutputStream
	{

		public void close()
			throws IOException
		{
			if(closed)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field boolean closed>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			closed = true;
		//    4    8:aload_0         
		//    5    9:iconst_1        
		//    6   10:putfield        #20  <Field boolean closed>
			flush();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #34  <Method void flush()>
			try
			{
				fileOutputStream.getFD().sync();
		//    9   17:aload_0         
		//   10   18:getfield        #26  <Field FileOutputStream fileOutputStream>
		//   11   21:invokevirtual   #38  <Method FileDescriptor FileOutputStream.getFD()>
		//   12   24:invokevirtual   #43  <Method void FileDescriptor.sync()>
			}
		//*  13   27:goto            40
			catch(IOException ioexception)
		//*  14   30:astore_1        
			{
				Log.w("AtomicFile", "Failed to sync file descriptor:", ((Throwable) (ioexception)));
		//   15   31:ldc1            #45  <String "AtomicFile">
		//   16   33:ldc1            #47  <String "Failed to sync file descriptor:">
		//   17   35:aload_1         
		//   18   36:invokestatic    #53  <Method int Log.w(String, String, Throwable)>
		//   19   39:pop             
			}
			fileOutputStream.close();
		//   20   40:aload_0         
		//   21   41:getfield        #26  <Field FileOutputStream fileOutputStream>
		//   22   44:invokevirtual   #55  <Method void FileOutputStream.close()>
		//   23   47:return          
		}

		public void flush()
			throws IOException
		{
			fileOutputStream.flush();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field FileOutputStream fileOutputStream>
		//    2    4:invokevirtual   #56  <Method void FileOutputStream.flush()>
		//    3    7:return          
		}

		public void write(int i)
			throws IOException
		{
			fileOutputStream.write(i);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field FileOutputStream fileOutputStream>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #60  <Method void FileOutputStream.write(int)>
		//    4    8:return          
		}

		public void write(byte abyte0[])
			throws IOException
		{
			fileOutputStream.write(abyte0);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field FileOutputStream fileOutputStream>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #64  <Method void FileOutputStream.write(byte[])>
		//    4    8:return          
		}

		public void write(byte abyte0[], int i, int j)
			throws IOException
		{
			fileOutputStream.write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field FileOutputStream fileOutputStream>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #68  <Method void FileOutputStream.write(byte[], int, int)>
		//    6   10:return          
		}

		private boolean closed;
		private final FileOutputStream fileOutputStream;

		public AtomicFileOutputStream(File file)
			throws FileNotFoundException
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void OutputStream()>
			closed = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #20  <Field boolean closed>
			fileOutputStream = new FileOutputStream(file);
		//    5    9:aload_0         
		//    6   10:new             #22  <Class FileOutputStream>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:invokespecial   #24  <Method void FileOutputStream(File)>
		//   10   18:putfield        #26  <Field FileOutputStream fileOutputStream>
		//   11   21:return          
		}
	}


	public AtomicFile(File file)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		baseName = file;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field File baseName>
		StringBuilder stringbuilder = new StringBuilder();
	//    5    9:new             #23  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #24  <Method void StringBuilder()>
	//    8   16:astore_2        
		stringbuilder.append(file.getPath());
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #30  <Method String File.getPath()>
	//   12   22:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(".bak");
	//   14   26:aload_2         
	//   15   27:ldc1            #36  <String ".bak">
	//   16   29:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		backupName = new File(stringbuilder.toString());
	//   18   33:aload_0         
	//   19   34:new             #26  <Class File>
	//   20   37:dup             
	//   21   38:aload_2         
	//   22   39:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   23   42:invokespecial   #42  <Method void File(String)>
	//   24   45:putfield        #44  <Field File backupName>
	//   25   48:return          
	}

	private void restoreBackup()
	{
		if(backupName.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field File backupName>
	//*   2    4:invokevirtual   #50  <Method boolean File.exists()>
	//*   3    7:ifeq            30
		{
			baseName.delete();
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field File baseName>
	//    6   14:invokevirtual   #53  <Method boolean File.delete()>
	//    7   17:pop             
			backupName.renameTo(baseName);
	//    8   18:aload_0         
	//    9   19:getfield        #44  <Field File backupName>
	//   10   22:aload_0         
	//   11   23:getfield        #21  <Field File baseName>
	//   12   26:invokevirtual   #57  <Method boolean File.renameTo(File)>
	//   13   29:pop             
		}
	//   14   30:return          
	}

	public void delete()
	{
		baseName.delete();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field File baseName>
	//    2    4:invokevirtual   #53  <Method boolean File.delete()>
	//    3    7:pop             
		backupName.delete();
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field File backupName>
	//    6   12:invokevirtual   #53  <Method boolean File.delete()>
	//    7   15:pop             
	//    8   16:return          
	}

	public void endWrite(OutputStream outputstream)
		throws IOException
	{
		outputstream.close();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #66  <Method void OutputStream.close()>
		backupName.delete();
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field File backupName>
	//    4    8:invokevirtual   #53  <Method boolean File.delete()>
	//    5   11:pop             
	//    6   12:return          
	}

	public InputStream openRead()
		throws FileNotFoundException
	{
		restoreBackup();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void restoreBackup()>
		return ((InputStream) (new FileInputStream(baseName)));
	//    2    4:new             #75  <Class FileInputStream>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field File baseName>
	//    6   12:invokespecial   #77  <Method void FileInputStream(File)>
	//    7   15:areturn         
	}

	public OutputStream startWrite()
		throws IOException
	{
		if(baseName.exists())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field File baseName>
	//*   2    4:invokevirtual   #50  <Method boolean File.exists()>
	//*   3    7:ifeq            95
			if(!backupName.exists())
	//*   4   10:aload_0         
	//*   5   11:getfield        #44  <Field File backupName>
	//*   6   14:invokevirtual   #50  <Method boolean File.exists()>
	//*   7   17:ifne            87
			{
				if(!baseName.renameTo(backupName))
	//*   8   20:aload_0         
	//*   9   21:getfield        #21  <Field File baseName>
	//*  10   24:aload_0         
	//*  11   25:getfield        #44  <Field File backupName>
	//*  12   28:invokevirtual   #57  <Method boolean File.renameTo(File)>
	//*  13   31:ifne            95
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   14   34:new             #23  <Class StringBuilder>
	//   15   37:dup             
	//   16   38:invokespecial   #24  <Method void StringBuilder()>
	//   17   41:astore_1        
					stringbuilder.append("Couldn't rename file ");
	//   18   42:aload_1         
	//   19   43:ldc1            #81  <String "Couldn't rename file ">
	//   20   45:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   21   48:pop             
					stringbuilder.append(((Object) (baseName)));
	//   22   49:aload_1         
	//   23   50:aload_0         
	//   24   51:getfield        #21  <Field File baseName>
	//   25   54:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//   26   57:pop             
					stringbuilder.append(" to backup file ");
	//   27   58:aload_1         
	//   28   59:ldc1            #86  <String " to backup file ">
	//   29   61:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   30   64:pop             
					stringbuilder.append(((Object) (backupName)));
	//   31   65:aload_1         
	//   32   66:aload_0         
	//   33   67:getfield        #44  <Field File backupName>
	//   34   70:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//   35   73:pop             
					Log.w("AtomicFile", stringbuilder.toString());
	//   36   74:ldc1            #11  <String "AtomicFile">
	//   37   76:aload_1         
	//   38   77:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   39   80:invokestatic    #92  <Method int Log.w(String, String)>
	//   40   83:pop             
				}
			} else
	//*  41   84:goto            95
			{
				baseName.delete();
	//   42   87:aload_0         
	//   43   88:getfield        #21  <Field File baseName>
	//   44   91:invokevirtual   #53  <Method boolean File.delete()>
	//   45   94:pop             
			}
		AtomicFileOutputStream atomicfileoutputstream;
		try
		{
			atomicfileoutputstream = new AtomicFileOutputStream(baseName);
	//   46   95:new             #6   <Class AtomicFile$AtomicFileOutputStream>
	//   47   98:dup             
	//   48   99:aload_0         
	//   49  100:getfield        #21  <Field File baseName>
	//   50  103:invokespecial   #93  <Method void AtomicFile$AtomicFileOutputStream(File)>
	//   51  106:astore_1        
		}
	//*  52  107:aload_1         
	//*  53  108:areturn         
		catch(FileNotFoundException filenotfoundexception)
	//*  54  109:astore_1        
		{
			if(!baseName.getParentFile().mkdirs())
	//*  55  110:aload_0         
	//*  56  111:getfield        #21  <Field File baseName>
	//*  57  114:invokevirtual   #97  <Method File File.getParentFile()>
	//*  58  117:invokevirtual   #100 <Method boolean File.mkdirs()>
	//*  59  120:ifne            160
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   60  123:new             #23  <Class StringBuilder>
	//   61  126:dup             
	//   62  127:invokespecial   #24  <Method void StringBuilder()>
	//   63  130:astore_2        
				stringbuilder1.append("Couldn't create directory ");
	//   64  131:aload_2         
	//   65  132:ldc1            #102 <String "Couldn't create directory ">
	//   66  134:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   67  137:pop             
				stringbuilder1.append(((Object) (baseName)));
	//   68  138:aload_2         
	//   69  139:aload_0         
	//   70  140:getfield        #21  <Field File baseName>
	//   71  143:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//   72  146:pop             
				throw new IOException(stringbuilder1.toString(), ((Throwable) (filenotfoundexception)));
	//   73  147:new             #61  <Class IOException>
	//   74  150:dup             
	//   75  151:aload_2         
	//   76  152:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   77  155:aload_1         
	//   78  156:invokespecial   #105 <Method void IOException(String, Throwable)>
	//   79  159:athrow          
			}
			AtomicFileOutputStream atomicfileoutputstream1;
			try
			{
				atomicfileoutputstream1 = new AtomicFileOutputStream(baseName);
	//   80  160:new             #6   <Class AtomicFile$AtomicFileOutputStream>
	//   81  163:dup             
	//   82  164:aload_0         
	//   83  165:getfield        #21  <Field File baseName>
	//   84  168:invokespecial   #93  <Method void AtomicFile$AtomicFileOutputStream(File)>
	//   85  171:astore_1        
			}
	//*  86  172:aload_1         
	//*  87  173:areturn         
			catch(FileNotFoundException filenotfoundexception1)
	//*  88  174:astore_1        
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//   89  175:new             #23  <Class StringBuilder>
	//   90  178:dup             
	//   91  179:invokespecial   #24  <Method void StringBuilder()>
	//   92  182:astore_2        
				stringbuilder2.append("Couldn't create ");
	//   93  183:aload_2         
	//   94  184:ldc1            #107 <String "Couldn't create ">
	//   95  186:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
				stringbuilder2.append(((Object) (baseName)));
	//   97  190:aload_2         
	//   98  191:aload_0         
	//   99  192:getfield        #21  <Field File baseName>
	//  100  195:invokevirtual   #84  <Method StringBuilder StringBuilder.append(Object)>
	//  101  198:pop             
				throw new IOException(stringbuilder2.toString(), ((Throwable) (filenotfoundexception1)));
	//  102  199:new             #61  <Class IOException>
	//  103  202:dup             
	//  104  203:aload_2         
	//  105  204:invokevirtual   #39  <Method String StringBuilder.toString()>
	//  106  207:aload_1         
	//  107  208:invokespecial   #105 <Method void IOException(String, Throwable)>
	//  108  211:athrow          
			}
			return ((OutputStream) (atomicfileoutputstream1));
		}
		return ((OutputStream) (atomicfileoutputstream));
	}

	private static final String TAG = "AtomicFile";
	private final File backupName;
	private final File baseName;
}
