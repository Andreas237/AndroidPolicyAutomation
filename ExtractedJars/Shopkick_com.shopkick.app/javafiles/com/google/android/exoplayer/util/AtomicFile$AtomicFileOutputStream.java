// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.util.Log;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer.util:
//			AtomicFile

private static final class AtomicFile$AtomicFileOutputStream extends OutputStream
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
	//    3    5:invokevirtual   #63  <Method void FileOutputStream.write(byte[])>
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
	//    5    7:invokevirtual   #66  <Method void FileOutputStream.write(byte[], int, int)>
	//    6   10:return          
	}

	private boolean closed;
	private final FileOutputStream fileOutputStream;

	public AtomicFile$AtomicFileOutputStream(File file)
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
