// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.io.*;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.*;

// Referenced classes of package com.facebook.internal:
//			Utility, Logger

public final class FileLruCache
{
	private static class BufferFile
	{

		static void deleteAll(File file)
		{
			file = ((File) (file.listFiles(excludeNonBufferFiles())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #36  <Method FilenameFilter excludeNonBufferFiles()>
		//    2    4:invokevirtual   #42  <Method File[] File.listFiles(FilenameFilter)>
		//    3    7:astore_0        
			if(file != null)
		//*   4    8:aload_0         
		//*   5    9:ifnull          36
			{
				int j = file.length;
		//    6   12:aload_0         
		//    7   13:arraylength     
		//    8   14:istore_2        
				for(int i = 0; i < j; i++)
		//*   9   15:iconst_0        
		//*  10   16:istore_1        
		//*  11   17:iload_1         
		//*  12   18:iload_2         
		//*  13   19:icmpge          36
					((File) (file[i])).delete();
		//   14   22:aload_0         
		//   15   23:iload_1         
		//   16   24:aaload          
		//   17   25:invokevirtual   #46  <Method boolean File.delete()>
		//   18   28:pop             

		//   19   29:iload_1         
		//   20   30:iconst_1        
		//   21   31:iadd            
		//   22   32:istore_1        
			}
		//*  23   33:goto            17
		//   24   36:return          
		}

		static FilenameFilter excludeBufferFiles()
		{
			return filterExcludeBufferFiles;
		//    0    0:getstatic       #25  <Field FilenameFilter filterExcludeBufferFiles>
		//    1    3:areturn         
		}

		static FilenameFilter excludeNonBufferFiles()
		{
			return filterExcludeNonBufferFiles;
		//    0    0:getstatic       #28  <Field FilenameFilter filterExcludeNonBufferFiles>
		//    1    3:areturn         
		}

		static File newFile(File file)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #51  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #52  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("buffer");
		//    4    8:aload_1         
		//    5    9:ldc1            #15  <String "buffer">
		//    6   11:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(Long.valueOf(FileLruCache.bufferIndex.incrementAndGet()).toString());
		//    8   15:aload_1         
		//    9   16:invokestatic    #60  <Method AtomicLong FileLruCache.access$300()>
		//   10   19:invokevirtual   #66  <Method long AtomicLong.incrementAndGet()>
		//   11   22:invokestatic    #72  <Method Long Long.valueOf(long)>
		//   12   25:invokevirtual   #76  <Method String Long.toString()>
		//   13   28:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   14   31:pop             
			return new File(file, stringbuilder.toString());
		//   15   32:new             #38  <Class File>
		//   16   35:dup             
		//   17   36:aload_0         
		//   18   37:aload_1         
		//   19   38:invokevirtual   #77  <Method String StringBuilder.toString()>
		//   20   41:invokespecial   #80  <Method void File(File, String)>
		//   21   44:areturn         
		}

		private static final String FILE_NAME_PREFIX = "buffer";
		private static final FilenameFilter filterExcludeBufferFiles = new FilenameFilter() {

			public boolean accept(File file, String s)
			{
				return s.startsWith("buffer") ^ true;
			//    0    0:aload_2         
			//    1    1:ldc1            #20  <String "buffer">
			//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
			//    3    6:iconst_1        
			//    4    7:ixor            
			//    5    8:ireturn         
			}

		}
;
		private static final FilenameFilter filterExcludeNonBufferFiles = new FilenameFilter() {

			public boolean accept(File file, String s)
			{
				return s.startsWith("buffer");
			//    0    0:aload_2         
			//    1    1:ldc1            #20  <String "buffer">
			//    2    3:invokevirtual   #26  <Method boolean String.startsWith(String)>
			//    3    6:ireturn         
			}

		}
;

		static 
		{
		//    0    0:new             #9   <Class FileLruCache$BufferFile$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void FileLruCache$BufferFile$1()>
		//    3    7:putstatic       #25  <Field FilenameFilter filterExcludeBufferFiles>
		//    4   10:new             #11  <Class FileLruCache$BufferFile$2>
		//    5   13:dup             
		//    6   14:invokespecial   #26  <Method void FileLruCache$BufferFile$2()>
		//    7   17:putstatic       #28  <Field FilenameFilter filterExcludeNonBufferFiles>
		//*   8   20:return          
		}

		private BufferFile()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class CloseCallbackOutputStream extends OutputStream
	{

		public void close()
			throws IOException
		{
			innerStream.close();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream innerStream>
		//    2    4:invokevirtual   #26  <Method void OutputStream.close()>
			callback.onClose();
		//    3    7:aload_0         
		//    4    8:getfield        #20  <Field FileLruCache$StreamCloseCallback callback>
		//    5   11:invokeinterface #31  <Method void FileLruCache$StreamCloseCallback.onClose()>
			return;
		//    6   16:return          
			Exception exception;
			exception;
		//    7   17:astore_1        
			callback.onClose();
		//    8   18:aload_0         
		//    9   19:getfield        #20  <Field FileLruCache$StreamCloseCallback callback>
		//   10   22:invokeinterface #31  <Method void FileLruCache$StreamCloseCallback.onClose()>
			throw exception;
		//   11   27:aload_1         
		//   12   28:athrow          
		}

		public void flush()
			throws IOException
		{
			innerStream.flush();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream innerStream>
		//    2    4:invokevirtual   #35  <Method void OutputStream.flush()>
		//    3    7:return          
		}

		public void write(int i)
			throws IOException
		{
			innerStream.write(i);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream innerStream>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #39  <Method void OutputStream.write(int)>
		//    4    8:return          
		}

		public void write(byte abyte0[])
			throws IOException
		{
			innerStream.write(abyte0);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream innerStream>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #42  <Method void OutputStream.write(byte[])>
		//    4    8:return          
		}

		public void write(byte abyte0[], int i, int j)
			throws IOException
		{
			innerStream.write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field OutputStream innerStream>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #45  <Method void OutputStream.write(byte[], int, int)>
		//    6   10:return          
		}

		final StreamCloseCallback callback;
		final OutputStream innerStream;

		CloseCallbackOutputStream(OutputStream outputstream, StreamCloseCallback streamclosecallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void OutputStream()>
			innerStream = outputstream;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field OutputStream innerStream>
			callback = streamclosecallback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field FileLruCache$StreamCloseCallback callback>
		//    8   14:return          
		}
	}

	private static final class CopyingInputStream extends InputStream
	{

		public int available()
			throws IOException
		{
			return input.available();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream input>
		//    2    4:invokevirtual   #27  <Method int InputStream.available()>
		//    3    7:ireturn         
		}

		public void close()
			throws IOException
		{
			input.close();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream input>
		//    2    4:invokevirtual   #31  <Method void InputStream.close()>
			output.close();
		//    3    7:aload_0         
		//    4    8:getfield        #20  <Field OutputStream output>
		//    5   11:invokevirtual   #34  <Method void OutputStream.close()>
			return;
		//    6   14:return          
			Exception exception;
			exception;
		//    7   15:astore_1        
			output.close();
		//    8   16:aload_0         
		//    9   17:getfield        #20  <Field OutputStream output>
		//   10   20:invokevirtual   #34  <Method void OutputStream.close()>
			throw exception;
		//   11   23:aload_1         
		//   12   24:athrow          
		}

		public void mark(int i)
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #38  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #39  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public boolean markSupported()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int read()
			throws IOException
		{
			int i = input.read();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream input>
		//    2    4:invokevirtual   #44  <Method int InputStream.read()>
		//    3    7:istore_1        
			if(i >= 0)
		//*   4    8:iload_1         
		//*   5    9:iflt            20
				output.write(i);
		//    6   12:aload_0         
		//    7   13:getfield        #20  <Field OutputStream output>
		//    8   16:iload_1         
		//    9   17:invokevirtual   #47  <Method void OutputStream.write(int)>
			return i;
		//   10   20:iload_1         
		//   11   21:ireturn         
		}

		public int read(byte abyte0[])
			throws IOException
		{
			int i = input.read(abyte0);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream input>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #50  <Method int InputStream.read(byte[])>
		//    4    8:istore_2        
			if(i > 0)
		//*   5    9:iload_2         
		//*   6   10:ifle            23
				output.write(abyte0, 0, i);
		//    7   13:aload_0         
		//    8   14:getfield        #20  <Field OutputStream output>
		//    9   17:aload_1         
		//   10   18:iconst_0        
		//   11   19:iload_2         
		//   12   20:invokevirtual   #53  <Method void OutputStream.write(byte[], int, int)>
			return i;
		//   13   23:iload_2         
		//   14   24:ireturn         
		}

		public int read(byte abyte0[], int i, int j)
			throws IOException
		{
			j = input.read(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream input>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #56  <Method int InputStream.read(byte[], int, int)>
		//    6   10:istore_3        
			if(j > 0)
		//*   7   11:iload_3         
		//*   8   12:ifle            25
				output.write(abyte0, i, j);
		//    9   15:aload_0         
		//   10   16:getfield        #20  <Field OutputStream output>
		//   11   19:aload_1         
		//   12   20:iload_2         
		//   13   21:iload_3         
		//   14   22:invokevirtual   #53  <Method void OutputStream.write(byte[], int, int)>
			return j;
		//   15   25:iload_3         
		//   16   26:ireturn         
		}

		public void reset()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			throw new UnsupportedOperationException();
		//    2    2:new             #38  <Class UnsupportedOperationException>
		//    3    5:dup             
		//    4    6:invokespecial   #39  <Method void UnsupportedOperationException()>
		//    5    9:athrow          
			Exception exception;
			exception;
		//    6   10:astore_1        
			this;
		//    7   11:aload_0         
			JVM INSTR monitorexit ;
		//    8   12:monitorexit     
			throw exception;
		//    9   13:aload_1         
		//   10   14:athrow          
		}

		public long skip(long l)
			throws IOException
		{
			byte abyte0[] = new byte[1024];
		//    0    0:sipush          1024
		//    1    3:newarray        byte[]
		//    2    5:astore          6
			int i;
			long l1;
			for(l1 = 0L; l1 < l; l1 += i)
		//*   3    7:lconst_0        
		//*   4    8:lstore          4
		//*   5   10:lload           4
		//*   6   12:lload_1         
		//*   7   13:lcmp            
		//*   8   14:ifge            54
			{
				i = read(abyte0, 0, (int)Math.min(l - l1, abyte0.length));
		//    9   17:aload_0         
		//   10   18:aload           6
		//   11   20:iconst_0        
		//   12   21:lload_1         
		//   13   22:lload           4
		//   14   24:lsub            
		//   15   25:aload           6
		//   16   27:arraylength     
		//   17   28:i2l             
		//   18   29:invokestatic    #65  <Method long Math.min(long, long)>
		//   19   32:l2i             
		//   20   33:invokevirtual   #66  <Method int read(byte[], int, int)>
		//   21   36:istore_3        
				if(i < 0)
		//*  22   37:iload_3         
		//*  23   38:ifge            44
					return l1;
		//   24   41:lload           4
		//   25   43:lreturn         
			}

		//   26   44:lload           4
		//   27   46:iload_3         
		//   28   47:i2l             
		//   29   48:ladd            
		//   30   49:lstore          4
		//*  31   51:goto            10
			return l1;
		//   32   54:lload           4
		//   33   56:lreturn         
		}

		final InputStream input;
		final OutputStream output;

		CopyingInputStream(InputStream inputstream, OutputStream outputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void InputStream()>
			input = inputstream;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field InputStream input>
			output = outputstream;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field OutputStream output>
		//    8   14:return          
		}
	}

	public static final class Limits
	{

		int getByteCount()
		{
			return byteCount;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field int byteCount>
		//    2    4:ireturn         
		}

		int getFileCount()
		{
			return fileCount;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int fileCount>
		//    2    4:ireturn         
		}

		void setByteCount(int i)
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				byteCount = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #19  <Field int byteCount>
				return;
		//    5    9:return          
			} else
			{
				throw new InvalidParameterException("Cache byte-count limit must be >= 0");
		//    6   10:new             #27  <Class InvalidParameterException>
		//    7   13:dup             
		//    8   14:ldc1            #29  <String "Cache byte-count limit must be >= 0">
		//    9   16:invokespecial   #32  <Method void InvalidParameterException(String)>
		//   10   19:athrow          
			}
		}

		void setFileCount(int i)
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				fileCount = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #16  <Field int fileCount>
				return;
		//    5    9:return          
			} else
			{
				throw new InvalidParameterException("Cache file count limit must be >= 0");
		//    6   10:new             #27  <Class InvalidParameterException>
		//    7   13:dup             
		//    8   14:ldc1            #35  <String "Cache file count limit must be >= 0">
		//    9   16:invokespecial   #32  <Method void InvalidParameterException(String)>
		//   10   19:athrow          
			}
		}

		private int byteCount;
		private int fileCount;

		public Limits()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			fileCount = 1024;
		//    2    4:aload_0         
		//    3    5:sipush          1024
		//    4    8:putfield        #16  <Field int fileCount>
			byteCount = 0x100000;
		//    5   11:aload_0         
		//    6   12:ldc1            #17  <Int 0x100000>
		//    7   14:putfield        #19  <Field int byteCount>
		//    8   17:return          
		}
	}

	private static final class ModifiedFile
		implements Comparable
	{

		public int compareTo(ModifiedFile modifiedfile)
		{
			if(getModified() < modifiedfile.getModified())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #40  <Method long getModified()>
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #40  <Method long getModified()>
		//*   4    8:lcmp            
		//*   5    9:ifge            14
				return -1;
		//    6   12:iconst_m1       
		//    7   13:ireturn         
			if(getModified() > modifiedfile.getModified())
		//*   8   14:aload_0         
		//*   9   15:invokevirtual   #40  <Method long getModified()>
		//*  10   18:aload_1         
		//*  11   19:invokevirtual   #40  <Method long getModified()>
		//*  12   22:lcmp            
		//*  13   23:ifle            28
				return 1;
		//   14   26:iconst_1        
		//   15   27:ireturn         
			else
				return getFile().compareTo(modifiedfile.getFile());
		//   16   28:aload_0         
		//   17   29:invokevirtual   #44  <Method File getFile()>
		//   18   32:aload_1         
		//   19   33:invokevirtual   #44  <Method File getFile()>
		//   20   36:invokevirtual   #47  <Method int File.compareTo(File)>
		//   21   39:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((ModifiedFile)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class FileLruCache$ModifiedFile>
		//    3    5:invokevirtual   #50  <Method int compareTo(FileLruCache$ModifiedFile)>
		//    4    8:ireturn         
		}

		public boolean equals(Object obj)
		{
			return (obj instanceof ModifiedFile) && compareTo((ModifiedFile)obj) == 0;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class FileLruCache$ModifiedFile>
		//    2    4:ifeq            20
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:checkcast       #2   <Class FileLruCache$ModifiedFile>
		//    6   12:invokevirtual   #50  <Method int compareTo(FileLruCache$ModifiedFile)>
		//    7   15:ifne            20
		//    8   18:iconst_1        
		//    9   19:ireturn         
		//   10   20:iconst_0        
		//   11   21:ireturn         
		}

		File getFile()
		{
			return file;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field File file>
		//    2    4:areturn         
		}

		long getModified()
		{
			return modified;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field long modified>
		//    2    4:lreturn         
		}

		public int hashCode()
		{
			return (1073 + file.hashCode()) * 37 + (int)(modified % 0x7fffffffL);
		//    0    0:sipush          1073
		//    1    3:aload_0         
		//    2    4:getfield        #26  <Field File file>
		//    3    7:invokevirtual   #56  <Method int File.hashCode()>
		//    4   10:iadd            
		//    5   11:bipush          37
		//    6   13:imul            
		//    7   14:aload_0         
		//    8   15:getfield        #34  <Field long modified>
		//    9   18:ldc2w           #57  <Long 0x7fffffffL>
		//   10   21:lrem            
		//   11   22:l2i             
		//   12   23:iadd            
		//   13   24:ireturn         
		}

		private static final int HASH_MULTIPLIER = 37;
		private static final int HASH_SEED = 29;
		private final File file;
		private final long modified;

		ModifiedFile(File file1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			file = file1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #26  <Field File file>
			modified = file1.lastModified();
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #32  <Method long File.lastModified()>
		//    8   14:putfield        #34  <Field long modified>
		//    9   17:return          
		}
	}

	private static interface StreamCloseCallback
	{

		public abstract void onClose();
	}

	private static final class StreamHeader
	{

		static JSONObject readHeader(InputStream inputstream)
			throws IOException
		{
			if(inputstream.read() != 0)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #27  <Method int InputStream.read()>
		//*   2    4:ifeq            9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			boolean flag = false;
		//    5    9:iconst_0        
		//    6   10:istore_3        
			int i = 0;
		//    7   11:iconst_0        
		//    8   12:istore_1        
			int k = i;
		//    9   13:iload_1         
		//   10   14:istore_2        
			for(; i < 3; i++)
		//*  11   15:iload_1         
		//*  12   16:iconst_3        
		//*  13   17:icmpge          64
			{
				int i1 = inputstream.read();
		//   14   20:aload_0         
		//   15   21:invokevirtual   #27  <Method int InputStream.read()>
		//   16   24:istore          4
				if(i1 == -1)
		//*  17   26:iload           4
		//*  18   28:iconst_m1       
		//*  19   29:icmpne          45
				{
					Logger.log(LoggingBehavior.CACHE, FileLruCache.TAG, "readHeader: stream.read returned -1 while reading header size");
		//   20   32:getstatic       #33  <Field LoggingBehavior LoggingBehavior.CACHE>
		//   21   35:getstatic       #37  <Field String FileLruCache.TAG>
		//   22   38:ldc1            #39  <String "readHeader: stream.read returned -1 while reading header size">
		//   23   40:invokestatic    #45  <Method void Logger.log(LoggingBehavior, String, String)>
					return null;
		//   24   43:aconst_null     
		//   25   44:areturn         
				}
				k = (k << 8) + (i1 & 0xff);
		//   26   45:iload_2         
		//   27   46:bipush          8
		//   28   48:ishl            
		//   29   49:iload           4
		//   30   51:sipush          255
		//   31   54:iand            
		//   32   55:iadd            
		//   33   56:istore_2        
			}

		//   34   57:iload_1         
		//   35   58:iconst_1        
		//   36   59:iadd            
		//   37   60:istore_1        
		//*  38   61:goto            15
			byte abyte0[] = new byte[k];
		//   39   64:iload_2         
		//   40   65:newarray        byte[]
		//   41   67:astore          5
			int l;
			for(int j = ((int) (flag)); j < abyte0.length; j += l)
		//*  42   69:iload_3         
		//*  43   70:istore_1        
		//*  44   71:iload_1         
		//*  45   72:aload           5
		//*  46   74:arraylength     
		//*  47   75:icmpge          169
			{
				l = inputstream.read(abyte0, j, abyte0.length - j);
		//   48   78:aload_0         
		//   49   79:aload           5
		//   50   81:iload_1         
		//   51   82:aload           5
		//   52   84:arraylength     
		//   53   85:iload_1         
		//   54   86:isub            
		//   55   87:invokevirtual   #48  <Method int InputStream.read(byte[], int, int)>
		//   56   90:istore_2        
				if(l < 1)
		//*  57   91:iload_2         
		//*  58   92:iconst_1        
		//*  59   93:icmpge          162
				{
					inputstream = ((InputStream) (LoggingBehavior.CACHE));
		//   60   96:getstatic       #33  <Field LoggingBehavior LoggingBehavior.CACHE>
		//   61   99:astore_0        
					String s = FileLruCache.TAG;
		//   62  100:getstatic       #37  <Field String FileLruCache.TAG>
		//   63  103:astore          6
					StringBuilder stringbuilder = new StringBuilder();
		//   64  105:new             #50  <Class StringBuilder>
		//   65  108:dup             
		//   66  109:invokespecial   #51  <Method void StringBuilder()>
		//   67  112:astore          7
					stringbuilder.append("readHeader: stream.read stopped at ");
		//   68  114:aload           7
		//   69  116:ldc1            #53  <String "readHeader: stream.read stopped at ">
		//   70  118:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   71  121:pop             
					stringbuilder.append(((Object) (Integer.valueOf(j))));
		//   72  122:aload           7
		//   73  124:iload_1         
		//   74  125:invokestatic    #63  <Method Integer Integer.valueOf(int)>
		//   75  128:invokevirtual   #66  <Method StringBuilder StringBuilder.append(Object)>
		//   76  131:pop             
					stringbuilder.append(" when expected ");
		//   77  132:aload           7
		//   78  134:ldc1            #68  <String " when expected ">
		//   79  136:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//   80  139:pop             
					stringbuilder.append(abyte0.length);
		//   81  140:aload           7
		//   82  142:aload           5
		//   83  144:arraylength     
		//   84  145:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
		//   85  148:pop             
					Logger.log(((LoggingBehavior) (inputstream)), s, stringbuilder.toString());
		//   86  149:aload_0         
		//   87  150:aload           6
		//   88  152:aload           7
		//   89  154:invokevirtual   #75  <Method String StringBuilder.toString()>
		//   90  157:invokestatic    #45  <Method void Logger.log(LoggingBehavior, String, String)>
					return null;
		//   91  160:aconst_null     
		//   92  161:areturn         
				}
			}

		//   93  162:iload_1         
		//   94  163:iload_2         
		//   95  164:iadd            
		//   96  165:istore_1        
		//*  97  166:goto            71
			inputstream = ((InputStream) (new JSONTokener(new String(abyte0))));
		//   98  169:new             #77  <Class JSONTokener>
		//   99  172:dup             
		//  100  173:new             #79  <Class String>
		//  101  176:dup             
		//  102  177:aload           5
		//  103  179:invokespecial   #82  <Method void String(byte[])>
		//  104  182:invokespecial   #85  <Method void JSONTokener(String)>
		//  105  185:astore_0        
			inputstream = ((InputStream) (((JSONTokener) (inputstream)).nextValue()));
		//  106  186:aload_0         
		//  107  187:invokevirtual   #89  <Method Object JSONTokener.nextValue()>
		//  108  190:astore_0        
			if(inputstream instanceof JSONObject)
				break MISSING_BLOCK_LABEL_252;
		//  109  191:aload_0         
		//  110  192:instanceof      #91  <Class JSONObject>
		//  111  195:ifne            252
			LoggingBehavior loggingbehavior = LoggingBehavior.CACHE;
		//  112  198:getstatic       #33  <Field LoggingBehavior LoggingBehavior.CACHE>
		//  113  201:astore          5
			String s1 = FileLruCache.TAG;
		//  114  203:getstatic       #37  <Field String FileLruCache.TAG>
		//  115  206:astore          6
			StringBuilder stringbuilder1 = new StringBuilder();
		//  116  208:new             #50  <Class StringBuilder>
		//  117  211:dup             
		//  118  212:invokespecial   #51  <Method void StringBuilder()>
		//  119  215:astore          7
			stringbuilder1.append("readHeader: expected JSONObject, got ");
		//  120  217:aload           7
		//  121  219:ldc1            #93  <String "readHeader: expected JSONObject, got ">
		//  122  221:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//  123  224:pop             
			stringbuilder1.append(((Object) (inputstream)).getClass().getCanonicalName());
		//  124  225:aload           7
		//  125  227:aload_0         
		//  126  228:invokevirtual   #97  <Method Class Object.getClass()>
		//  127  231:invokevirtual   #102 <Method String Class.getCanonicalName()>
		//  128  234:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
		//  129  237:pop             
			Logger.log(loggingbehavior, s1, stringbuilder1.toString());
		//  130  238:aload           5
		//  131  240:aload           6
		//  132  242:aload           7
		//  133  244:invokevirtual   #75  <Method String StringBuilder.toString()>
		//  134  247:invokestatic    #45  <Method void Logger.log(LoggingBehavior, String, String)>
			return null;
		//  135  250:aconst_null     
		//  136  251:areturn         
			try
			{
				inputstream = ((InputStream) ((JSONObject)inputstream));
		//  137  252:aload_0         
		//  138  253:checkcast       #91  <Class JSONObject>
		//  139  256:astore_0        
			}
		//* 140  257:aload_0         
		//* 141  258:areturn         
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
		//* 142  259:astore_0        
			{
				throw new IOException(((JSONException) (inputstream)).getMessage());
		//  143  260:new             #19  <Class IOException>
		//  144  263:dup             
		//  145  264:aload_0         
		//  146  265:invokevirtual   #105 <Method String JSONException.getMessage()>
		//  147  268:invokespecial   #106 <Method void IOException(String)>
		//  148  271:athrow          
			}
			return ((JSONObject) (inputstream));
		}

		static void writeHeader(OutputStream outputstream, JSONObject jsonobject)
			throws IOException
		{
			jsonobject = ((JSONObject) (jsonobject.toString().getBytes()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #110 <Method String JSONObject.toString()>
		//    2    4:invokevirtual   #114 <Method byte[] String.getBytes()>
		//    3    7:astore_1        
			outputstream.write(0);
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:invokevirtual   #120 <Method void OutputStream.write(int)>
			outputstream.write(jsonobject.length >> 16 & 0xff);
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:arraylength     
		//   10   16:bipush          16
		//   11   18:ishr            
		//   12   19:sipush          255
		//   13   22:iand            
		//   14   23:invokevirtual   #120 <Method void OutputStream.write(int)>
			outputstream.write(jsonobject.length >> 8 & 0xff);
		//   15   26:aload_0         
		//   16   27:aload_1         
		//   17   28:arraylength     
		//   18   29:bipush          8
		//   19   31:ishr            
		//   20   32:sipush          255
		//   21   35:iand            
		//   22   36:invokevirtual   #120 <Method void OutputStream.write(int)>
			outputstream.write(jsonobject.length >> 0 & 0xff);
		//   23   39:aload_0         
		//   24   40:aload_1         
		//   25   41:arraylength     
		//   26   42:iconst_0        
		//   27   43:ishr            
		//   28   44:sipush          255
		//   29   47:iand            
		//   30   48:invokevirtual   #120 <Method void OutputStream.write(int)>
			outputstream.write(((byte []) (jsonobject)));
		//   31   51:aload_0         
		//   32   52:aload_1         
		//   33   53:invokevirtual   #122 <Method void OutputStream.write(byte[])>
		//   34   56:return          
		}

		private static final int HEADER_VERSION = 0;

		private StreamHeader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public FileLruCache(String s, Limits limits1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void Object()>
		lastClearCacheTime = new AtomicLong(0L);
	//    2    4:aload_0         
	//    3    5:new             #61  <Class AtomicLong>
	//    4    8:dup             
	//    5    9:lconst_0        
	//    6   10:invokespecial   #72  <Method void AtomicLong(long)>
	//    7   13:putfield        #74  <Field AtomicLong lastClearCacheTime>
		tag = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #76  <Field String tag>
		limits = limits1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #78  <Field FileLruCache$Limits limits>
		directory = new File(FacebookSdk.getCacheDir(), s);
	//   14   26:aload_0         
	//   15   27:new             #80  <Class File>
	//   16   30:dup             
	//   17   31:invokestatic    #86  <Method File FacebookSdk.getCacheDir()>
	//   18   34:aload_1         
	//   19   35:invokespecial   #89  <Method void File(File, String)>
	//   20   38:putfield        #91  <Field File directory>
	//   21   41:aload_0         
	//   22   42:new             #4   <Class Object>
	//   23   45:dup             
	//   24   46:invokespecial   #69  <Method void Object()>
	//   25   49:putfield        #93  <Field Object lock>
		if(directory.mkdirs() || directory.isDirectory())
	//*  26   52:aload_0         
	//*  27   53:getfield        #91  <Field File directory>
	//*  28   56:invokevirtual   #97  <Method boolean File.mkdirs()>
	//*  29   59:ifne            72
	//*  30   62:aload_0         
	//*  31   63:getfield        #91  <Field File directory>
	//*  32   66:invokevirtual   #100 <Method boolean File.isDirectory()>
	//*  33   69:ifeq            79
			BufferFile.deleteAll(directory);
	//   34   72:aload_0         
	//   35   73:getfield        #91  <Field File directory>
	//   36   76:invokestatic    #104 <Method void FileLruCache$BufferFile.deleteAll(File)>
	//   37   79:return          
	}

	private void postTrim()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(!isTrimPending)
	//*   5    7:aload_0         
	//*   6    8:getfield        #122 <Field boolean isTrimPending>
	//*   7   11:ifne            35
			{
				isTrimPending = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #122 <Field boolean isTrimPending>
				FacebookSdk.getExecutor().execute(new Runnable() {

					public void run()
					{
						trim();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field FileLruCache this$0>
					//    2    4:invokestatic    #24  <Method void FileLruCache.access$200(FileLruCache)>
					//    3    7:return          
					}

					final FileLruCache this$0;

			
			{
				this$0 = FileLruCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FileLruCache this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   11   19:invokestatic    #126 <Method Executor FacebookSdk.getExecutor()>
	//   12   22:new             #10  <Class FileLruCache$3>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #128 <Method void FileLruCache$3(FileLruCache)>
	//   16   30:invokeinterface #134 <Method void Executor.execute(Runnable)>
			}
		}
	//   17   35:aload_1         
	//   18   36:monitorexit     
		return;
	//   19   37:return          
		exception;
	//   20   38:astore_2        
		obj;
	//   21   39:aload_1         
		JVM INSTR monitorexit ;
	//   22   40:monitorexit     
		throw exception;
	//   23   41:aload_2         
	//   24   42:athrow          
	}

	private void renameToTargetAndTrim(String s, File file)
	{
		if(!file.renameTo(new File(directory, Utility.md5hash(s))))
	//*   0    0:aload_2         
	//*   1    1:new             #80  <Class File>
	//*   2    4:dup             
	//*   3    5:aload_0         
	//*   4    6:getfield        #91  <Field File directory>
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #140 <Method String Utility.md5hash(String)>
	//*   7   13:invokespecial   #89  <Method void File(File, String)>
	//*   8   16:invokevirtual   #144 <Method boolean File.renameTo(File)>
	//*   9   19:ifne            27
			file.delete();
	//   10   22:aload_2         
	//   11   23:invokevirtual   #147 <Method boolean File.delete()>
	//   12   26:pop             
		postTrim();
	//   13   27:aload_0         
	//   14   28:invokespecial   #149 <Method void postTrim()>
	//   15   31:return          
	}

	private void trim()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field Object lock>
	//*   2    4:astore          7
	//*   3    6:aload           7
	//*   4    8:monitorenter    
		{
			isTrimPending = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #122 <Field boolean isTrimPending>
			isTrimInProgress = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #151 <Field boolean isTrimInProgress>
		}
	//   11   19:aload           7
	//   12   21:monitorexit     
		File afile[];
		Logger.log(LoggingBehavior.CACHE, TAG, "trim started");
	//   13   22:getstatic       #157 <Field LoggingBehavior LoggingBehavior.CACHE>
	//   14   25:getstatic       #159 <Field String TAG>
	//   15   28:ldc1            #161 <String "trim started">
	//   16   30:invokestatic    #167 <Method void Logger.log(LoggingBehavior, String, String)>
		obj = ((Object) (new PriorityQueue()));
	//   17   33:new             #169 <Class PriorityQueue>
	//   18   36:dup             
	//   19   37:invokespecial   #170 <Method void PriorityQueue()>
	//   20   40:astore          7
		afile = directory.listFiles(BufferFile.excludeBufferFiles());
	//   21   42:aload_0         
	//   22   43:getfield        #91  <Field File directory>
	//   23   46:invokestatic    #174 <Method FilenameFilter FileLruCache$BufferFile.excludeBufferFiles()>
	//   24   49:invokevirtual   #178 <Method File[] File.listFiles(FilenameFilter)>
	//   25   52:astore          8
		long l1 = 0L;
	//   26   54:lconst_0        
	//   27   55:lstore          5
		if(afile == null) goto _L2; else goto _L1
	//   28   57:aload           8
	//   29   59:ifnull          399
_L1:
		int j = afile.length;
	//   30   62:aload           8
	//   31   64:arraylength     
	//   32   65:istore_2        
		int i;
		long l;
		l1 = 0L;
	//   33   66:lconst_0        
	//   34   67:lstore          5
		l = l1;
	//   35   69:lload           5
	//   36   71:lstore_3        
		i = 0;
	//   37   72:iconst_0        
	//   38   73:istore_1        
_L4:
		File file1;
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   39   74:iload_1         
	//   40   75:iload_2         
	//   41   76:icmpge          396
		file1 = afile[i];
	//   42   79:aload           8
	//   43   81:iload_1         
	//   44   82:aaload          
	//   45   83:astore          9
		ModifiedFile modifiedfile = new ModifiedFile(file1);
	//   46   85:new             #28  <Class FileLruCache$ModifiedFile>
	//   47   88:dup             
	//   48   89:aload           9
	//   49   91:invokespecial   #180 <Method void FileLruCache$ModifiedFile(File)>
	//   50   94:astore          10
		((PriorityQueue) (obj)).add(((Object) (modifiedfile)));
	//   51   96:aload           7
	//   52   98:aload           10
	//   53  100:invokevirtual   #184 <Method boolean PriorityQueue.add(Object)>
	//   54  103:pop             
		LoggingBehavior loggingbehavior1 = LoggingBehavior.CACHE;
	//   55  104:getstatic       #157 <Field LoggingBehavior LoggingBehavior.CACHE>
	//   56  107:astore          11
		String s1 = TAG;
	//   57  109:getstatic       #159 <Field String TAG>
	//   58  112:astore          12
		StringBuilder stringbuilder1 = new StringBuilder();
	//   59  114:new             #186 <Class StringBuilder>
	//   60  117:dup             
	//   61  118:invokespecial   #187 <Method void StringBuilder()>
	//   62  121:astore          13
		stringbuilder1.append("  trim considering time=");
	//   63  123:aload           13
	//   64  125:ldc1            #189 <String "  trim considering time=">
	//   65  127:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   66  130:pop             
		stringbuilder1.append(((Object) (Long.valueOf(modifiedfile.getModified()))));
	//   67  131:aload           13
	//   68  133:aload           10
	//   69  135:invokevirtual   #197 <Method long FileLruCache$ModifiedFile.getModified()>
	//   70  138:invokestatic    #203 <Method Long Long.valueOf(long)>
	//   71  141:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//   72  144:pop             
		stringbuilder1.append(" name=");
	//   73  145:aload           13
	//   74  147:ldc1            #208 <String " name=">
	//   75  149:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   76  152:pop             
		stringbuilder1.append(modifiedfile.getFile().getName());
	//   77  153:aload           13
	//   78  155:aload           10
	//   79  157:invokevirtual   #211 <Method File FileLruCache$ModifiedFile.getFile()>
	//   80  160:invokevirtual   #215 <Method String File.getName()>
	//   81  163:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   82  166:pop             
		Logger.log(loggingbehavior1, s1, stringbuilder1.toString());
	//   83  167:aload           11
	//   84  169:aload           12
	//   85  171:aload           13
	//   86  173:invokevirtual   #218 <Method String StringBuilder.toString()>
	//   87  176:invokestatic    #167 <Method void Logger.log(LoggingBehavior, String, String)>
		l1 += file1.length();
	//   88  179:lload           5
	//   89  181:aload           9
	//   90  183:invokevirtual   #221 <Method long File.length()>
	//   91  186:ladd            
	//   92  187:lstore          5
		l++;
	//   93  189:lload_3         
	//   94  190:lconst_1        
	//   95  191:ladd            
	//   96  192:lstore_3        
		i++;
	//   97  193:iload_1         
	//   98  194:iconst_1        
	//   99  195:iadd            
	//  100  196:istore_1        
		if(true) goto _L4; else goto _L3
	//  101  197:goto            74
_L3:
		if(l1 > (long)limits.getByteCount())
			break MISSING_BLOCK_LABEL_265;
	//  102  200:lload           5
	//  103  202:aload_0         
	//  104  203:getfield        #78  <Field FileLruCache$Limits limits>
	//  105  206:invokevirtual   #225 <Method int FileLruCache$Limits.getByteCount()>
	//  106  209:i2l             
	//  107  210:lcmp            
	//  108  211:ifgt            265
		i = limits.getFileCount();
	//  109  214:aload_0         
	//  110  215:getfield        #78  <Field FileLruCache$Limits limits>
	//  111  218:invokevirtual   #228 <Method int FileLruCache$Limits.getFileCount()>
	//  112  221:istore_1        
		if(l <= (long)i)
	//* 113  222:lload_3         
	//* 114  223:iload_1         
	//* 115  224:i2l             
	//* 116  225:lcmp            
	//* 117  226:ifle            232
	//* 118  229:goto            265
		{
			synchronized(lock)
	//* 119  232:aload_0         
	//* 120  233:getfield        #93  <Field Object lock>
	//* 121  236:astore          7
	//* 122  238:aload           7
	//* 123  240:monitorenter    
			{
				isTrimInProgress = false;
	//  124  241:aload_0         
	//  125  242:iconst_0        
	//  126  243:putfield        #151 <Field boolean isTrimInProgress>
				lock.notifyAll();
	//  127  246:aload_0         
	//  128  247:getfield        #93  <Field Object lock>
	//  129  250:invokevirtual   #231 <Method void Object.notifyAll()>
			}
	//  130  253:aload           7
	//  131  255:monitorexit     
			return;
	//  132  256:return          
		}
		break MISSING_BLOCK_LABEL_265;
		exception;
	//  133  257:astore          8
		obj;
	//  134  259:aload           7
		JVM INSTR monitorexit ;
	//  135  261:monitorexit     
		throw exception;
	//  136  262:aload           8
	//  137  264:athrow          
		File file;
		file = ((ModifiedFile)((PriorityQueue) (obj)).remove()).getFile();
	//  138  265:aload           7
	//  139  267:invokevirtual   #235 <Method Object PriorityQueue.remove()>
	//  140  270:checkcast       #28  <Class FileLruCache$ModifiedFile>
	//  141  273:invokevirtual   #211 <Method File FileLruCache$ModifiedFile.getFile()>
	//  142  276:astore          8
		LoggingBehavior loggingbehavior = LoggingBehavior.CACHE;
	//  143  278:getstatic       #157 <Field LoggingBehavior LoggingBehavior.CACHE>
	//  144  281:astore          9
		String s = TAG;
	//  145  283:getstatic       #159 <Field String TAG>
	//  146  286:astore          10
		StringBuilder stringbuilder = new StringBuilder();
	//  147  288:new             #186 <Class StringBuilder>
	//  148  291:dup             
	//  149  292:invokespecial   #187 <Method void StringBuilder()>
	//  150  295:astore          11
		stringbuilder.append("  trim removing ");
	//  151  297:aload           11
	//  152  299:ldc1            #237 <String "  trim removing ">
	//  153  301:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  154  304:pop             
		stringbuilder.append(file.getName());
	//  155  305:aload           11
	//  156  307:aload           8
	//  157  309:invokevirtual   #215 <Method String File.getName()>
	//  158  312:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  159  315:pop             
		Logger.log(loggingbehavior, s, stringbuilder.toString());
	//  160  316:aload           9
	//  161  318:aload           10
	//  162  320:aload           11
	//  163  322:invokevirtual   #218 <Method String StringBuilder.toString()>
	//  164  325:invokestatic    #167 <Method void Logger.log(LoggingBehavior, String, String)>
		l1 -= file.length();
	//  165  328:lload           5
	//  166  330:aload           8
	//  167  332:invokevirtual   #221 <Method long File.length()>
	//  168  335:lsub            
	//  169  336:lstore          5
		l--;
	//  170  338:lload_3         
	//  171  339:lconst_1        
	//  172  340:lsub            
	//  173  341:lstore_3        
		file.delete();
	//  174  342:aload           8
	//  175  344:invokevirtual   #147 <Method boolean File.delete()>
	//  176  347:pop             
		continue; /* Loop/switch isn't completed */
	//  177  348:goto            200
		Exception exception1;
		exception1;
	//  178  351:astore          8
		synchronized(lock)
	//* 179  353:aload_0         
	//* 180  354:getfield        #93  <Field Object lock>
	//* 181  357:astore          7
	//* 182  359:aload           7
	//* 183  361:monitorenter    
		{
			isTrimInProgress = false;
	//  184  362:aload_0         
	//  185  363:iconst_0        
	//  186  364:putfield        #151 <Field boolean isTrimInProgress>
			lock.notifyAll();
	//  187  367:aload_0         
	//  188  368:getfield        #93  <Field Object lock>
	//  189  371:invokevirtual   #231 <Method void Object.notifyAll()>
		}
	//  190  374:aload           7
	//  191  376:monitorexit     
		throw exception1;
	//  192  377:aload           8
	//  193  379:athrow          
		exception2;
	//  194  380:astore          8
		obj;
	//  195  382:aload           7
		JVM INSTR monitorexit ;
	//  196  384:monitorexit     
		throw exception2;
	//  197  385:aload           8
	//  198  387:athrow          
		exception3;
	//  199  388:astore          8
		obj;
	//  200  390:aload           7
		JVM INSTR monitorexit ;
	//  201  392:monitorexit     
		throw exception3;
	//  202  393:aload           8
	//  203  395:athrow          
	//* 204  396:goto            200
_L2:
		l = 0L;
	//  205  399:lconst_0        
	//  206  400:lstore_3        
		if(true) goto _L3; else goto _L5
	//  207  401:goto            200
_L5:
	}

	public void clearCache()
	{
		final File filesToDelete[] = directory.listFiles(BufferFile.excludeBufferFiles());
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field File directory>
	//    2    4:invokestatic    #174 <Method FilenameFilter FileLruCache$BufferFile.excludeBufferFiles()>
	//    3    7:invokevirtual   #178 <Method File[] File.listFiles(FilenameFilter)>
	//    4   10:astore_1        
		lastClearCacheTime.set(System.currentTimeMillis());
	//    5   11:aload_0         
	//    6   12:getfield        #74  <Field AtomicLong lastClearCacheTime>
	//    7   15:invokestatic    #243 <Method long System.currentTimeMillis()>
	//    8   18:invokevirtual   #246 <Method void AtomicLong.set(long)>
		if(filesToDelete != null)
	//*   9   21:aload_1         
	//*  10   22:ifnull          42
			FacebookSdk.getExecutor().execute(new Runnable() {

				public void run()
				{
					File afile[] = filesToDelete;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field File[] val$filesToDelete>
				//    2    4:astore_3        
					int j = afile.length;
				//    3    5:aload_3         
				//    4    6:arraylength     
				//    5    7:istore_2        
					for(int i = 0; i < j; i++)
				//*   6    8:iconst_0        
				//*   7    9:istore_1        
				//*   8   10:iload_1         
				//*   9   11:iload_2         
				//*  10   12:icmpge          29
						afile[i].delete();
				//   11   15:aload_3         
				//   12   16:iload_1         
				//   13   17:aaload          
				//   14   18:invokevirtual   #31  <Method boolean File.delete()>
				//   15   21:pop             

				//   16   22:iload_1         
				//   17   23:iconst_1        
				//   18   24:iadd            
				//   19   25:istore_1        
				//*  20   26:goto            10
				//   21   29:return          
				}

				final FileLruCache this$0;
				final File val$filesToDelete[];

			
			{
				this$0 = FileLruCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FileLruCache this$0>
				filesToDelete = afile;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field File[] val$filesToDelete>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   11   25:invokestatic    #126 <Method Executor FacebookSdk.getExecutor()>
	//   12   28:new             #8   <Class FileLruCache$2>
	//   13   31:dup             
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokespecial   #249 <Method void FileLruCache$2(FileLruCache, File[])>
	//   17   37:invokeinterface #134 <Method void Executor.execute(Runnable)>
	//   18   42:return          
	}

	public InputStream get(String s)
		throws IOException
	{
		return get(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #256 <Method InputStream get(String, String)>
	//    4    6:areturn         
	}

	public InputStream get(String s, String s1)
		throws IOException
	{
		File file = new File(directory, Utility.md5hash(s));
	//    0    0:new             #80  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #91  <Field File directory>
	//    4    8:aload_1         
	//    5    9:invokestatic    #140 <Method String Utility.md5hash(String)>
	//    6   12:invokespecial   #89  <Method void File(File, String)>
	//    7   15:astore          6
		boolean flag;
		long l;
		Object obj;
		Object obj1;
		String s2;
		try
		{
			obj = ((Object) (new FileInputStream(file)));
	//    8   17:new             #259 <Class FileInputStream>
	//    9   20:dup             
	//   10   21:aload           6
	//   11   23:invokespecial   #260 <Method void FileInputStream(File)>
	//   12   26:astore          7
		}
	//*  13   28:new             #262 <Class BufferedInputStream>
	//*  14   31:dup             
	//*  15   32:aload           7
	//*  16   34:sipush          8192
	//*  17   37:invokespecial   #265 <Method void BufferedInputStream(InputStream, int)>
	//*  18   40:astore          7
	//*  19   42:aload           7
	//*  20   44:invokestatic    #269 <Method JSONObject FileLruCache$StreamHeader.readHeader(InputStream)>
	//*  21   47:astore          8
	//*  22   49:aload           8
	//*  23   51:ifnonnull       61
	//*  24   54:aload           7
	//*  25   56:invokevirtual   #272 <Method void BufferedInputStream.close()>
	//*  26   59:aconst_null     
	//*  27   60:areturn         
	//*  28   61:aload           8
	//*  29   63:ldc1            #39  <String "key">
	//*  30   65:invokevirtual   #277 <Method String JSONObject.optString(String)>
	//*  31   68:astore          9
	//*  32   70:aload           9
	//*  33   72:ifnull          215
	//*  34   75:aload           9
	//*  35   77:aload_1         
	//*  36   78:invokevirtual   #282 <Method boolean String.equals(Object)>
	//*  37   81:ifne            87
	//*  38   84:goto            215
	//*  39   87:aload           8
	//*  40   89:ldc1            #42  <String "tag">
	//*  41   91:aconst_null     
	//*  42   92:invokevirtual   #285 <Method String JSONObject.optString(String, String)>
	//*  43   95:astore_1        
	//*  44   96:aload_2         
	//*  45   97:ifnonnull       104
	//*  46  100:aload_1         
	//*  47  101:ifnonnull       118
	//*  48  104:aload_2         
	//*  49  105:ifnull          125
	//*  50  108:aload_2         
	//*  51  109:aload_1         
	//*  52  110:invokevirtual   #282 <Method boolean String.equals(Object)>
	//*  53  113:istore_3        
	//*  54  114:iload_3         
	//*  55  115:ifne            125
	//*  56  118:aload           7
	//*  57  120:invokevirtual   #272 <Method void BufferedInputStream.close()>
	//*  58  123:aconst_null     
	//*  59  124:areturn         
	//*  60  125:new             #287 <Class Date>
	//*  61  128:dup             
	//*  62  129:invokespecial   #288 <Method void Date()>
	//*  63  132:invokevirtual   #291 <Method long Date.getTime()>
	//*  64  135:lstore          4
	//*  65  137:getstatic       #157 <Field LoggingBehavior LoggingBehavior.CACHE>
	//*  66  140:astore_1        
	//*  67  141:getstatic       #159 <Field String TAG>
	//*  68  144:astore_2        
	//*  69  145:new             #186 <Class StringBuilder>
	//*  70  148:dup             
	//*  71  149:invokespecial   #187 <Method void StringBuilder()>
	//*  72  152:astore          8
	//*  73  154:aload           8
	//*  74  156:ldc2            #293 <String "Setting lastModified to ">
	//*  75  159:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//*  76  162:pop             
	//*  77  163:aload           8
	//*  78  165:lload           4
	//*  79  167:invokestatic    #203 <Method Long Long.valueOf(long)>
	//*  80  170:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//*  81  173:pop             
	//*  82  174:aload           8
	//*  83  176:ldc2            #295 <String " for ">
	//*  84  179:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//*  85  182:pop             
	//*  86  183:aload           8
	//*  87  185:aload           6
	//*  88  187:invokevirtual   #215 <Method String File.getName()>
	//*  89  190:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//*  90  193:pop             
	//*  91  194:aload_1         
	//*  92  195:aload_2         
	//*  93  196:aload           8
	//*  94  198:invokevirtual   #218 <Method String StringBuilder.toString()>
	//*  95  201:invokestatic    #167 <Method void Logger.log(LoggingBehavior, String, String)>
	//*  96  204:aload           6
	//*  97  206:lload           4
	//*  98  208:invokevirtual   #299 <Method boolean File.setLastModified(long)>
	//*  99  211:pop             
	//* 100  212:aload           7
	//* 101  214:areturn         
	//* 102  215:aload           7
	//* 103  217:invokevirtual   #272 <Method void BufferedInputStream.close()>
	//* 104  220:aconst_null     
	//* 105  221:areturn         
	//* 106  222:astore_1        
	//* 107  223:aload           7
	//* 108  225:invokevirtual   #272 <Method void BufferedInputStream.close()>
	//* 109  228:aload_1         
	//* 110  229:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 111  230:astore_1        
		{
			return null;
	//  112  231:aconst_null     
	//  113  232:areturn         
		}
		obj = ((Object) (new BufferedInputStream(((InputStream) (obj)), 8192)));
		obj1 = ((Object) (StreamHeader.readHeader(((InputStream) (obj)))));
		if(obj1 == null)
		{
			((BufferedInputStream) (obj)).close();
			return null;
		}
		s2 = ((JSONObject) (obj1)).optString("key");
		if(s2 == null)
			break MISSING_BLOCK_LABEL_215;
		if(!s2.equals(((Object) (s))))
			break MISSING_BLOCK_LABEL_215;
		s = ((JSONObject) (obj1)).optString("tag", ((String) (null)));
		if(s1 == null && s != null)
			break MISSING_BLOCK_LABEL_118;
		if(s1 == null)
			break MISSING_BLOCK_LABEL_125;
		flag = s1.equals(((Object) (s)));
		if(flag)
			break MISSING_BLOCK_LABEL_125;
		((BufferedInputStream) (obj)).close();
		return null;
		l = (new Date()).getTime();
		s = ((String) (LoggingBehavior.CACHE));
		s1 = TAG;
		obj1 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj1)).append("Setting lastModified to ");
		((StringBuilder) (obj1)).append(((Object) (Long.valueOf(l))));
		((StringBuilder) (obj1)).append(" for ");
		((StringBuilder) (obj1)).append(file.getName());
		Logger.log(((LoggingBehavior) (s)), s1, ((StringBuilder) (obj1)).toString());
		file.setLastModified(l);
		return ((InputStream) (obj));
		((BufferedInputStream) (obj)).close();
		return null;
		s;
		((BufferedInputStream) (obj)).close();
		throw s;
	}

	public String getLocation()
	{
		return directory.getPath();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field File directory>
	//    2    4:invokevirtual   #303 <Method String File.getPath()>
	//    3    7:areturn         
	}

	public InputStream interceptAndPut(String s, InputStream inputstream)
		throws IOException
	{
		return ((InputStream) (new CopyingInputStream(inputstream, openPutStream(s))));
	//    0    0:new             #22  <Class FileLruCache$CopyingInputStream>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #309 <Method OutputStream openPutStream(String)>
	//    6   10:invokespecial   #312 <Method void FileLruCache$CopyingInputStream(InputStream, OutputStream)>
	//    7   13:areturn         
	}

	public OutputStream openPutStream(String s)
		throws IOException
	{
		return openPutStream(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #315 <Method OutputStream openPutStream(String, String)>
	//    4    6:areturn         
	}

	public OutputStream openPutStream(String s, String s1)
		throws IOException
	{
		Object obj;
		obj = ((Object) (BufferFile.newFile(directory)));
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field File directory>
	//    2    4:invokestatic    #323 <Method File FileLruCache$BufferFile.newFile(File)>
	//    3    7:astore_3        
		((File) (obj)).delete();
	//    4    8:aload_3         
	//    5    9:invokevirtual   #147 <Method boolean File.delete()>
	//    6   12:pop             
		if(!((File) (obj)).createNewFile())
			break MISSING_BLOCK_LABEL_231;
	//    7   13:aload_3         
	//    8   14:invokevirtual   #326 <Method boolean File.createNewFile()>
	//    9   17:ifeq            231
		Object obj1;
		StringBuilder stringbuilder1;
		try
		{
			obj1 = ((Object) (new FileOutputStream(((File) (obj)))));
	//   10   20:new             #328 <Class FileOutputStream>
	//   11   23:dup             
	//   12   24:aload_3         
	//   13   25:invokespecial   #329 <Method void FileOutputStream(File)>
	//   14   28:astore          4
		}
	//*  15   30:new             #331 <Class BufferedOutputStream>
	//*  16   33:dup             
	//*  17   34:new             #19  <Class FileLruCache$CloseCallbackOutputStream>
	//*  18   37:dup             
	//*  19   38:aload           4
	//*  20   40:new             #6   <Class FileLruCache$1>
	//*  21   43:dup             
	//*  22   44:aload_0         
	//*  23   45:invokestatic    #243 <Method long System.currentTimeMillis()>
	//*  24   48:aload_3         
	//*  25   49:aload_1         
	//*  26   50:invokespecial   #334 <Method void FileLruCache$1(FileLruCache, long, File, String)>
	//*  27   53:invokespecial   #337 <Method void FileLruCache$CloseCallbackOutputStream(OutputStream, FileLruCache$StreamCloseCallback)>
	//*  28   56:sipush          8192
	//*  29   59:invokespecial   #340 <Method void BufferedOutputStream(OutputStream, int)>
	//*  30   62:astore_3        
	//*  31   63:new             #274 <Class JSONObject>
	//*  32   66:dup             
	//*  33   67:invokespecial   #341 <Method void JSONObject()>
	//*  34   70:astore          4
	//*  35   72:aload           4
	//*  36   74:ldc1            #39  <String "key">
	//*  37   76:aload_1         
	//*  38   77:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//*  39   80:pop             
	//*  40   81:aload_2         
	//*  41   82:invokestatic    #349 <Method boolean Utility.isNullOrEmpty(String)>
	//*  42   85:ifne            97
	//*  43   88:aload           4
	//*  44   90:ldc1            #42  <String "tag">
	//*  45   92:aload_2         
	//*  46   93:invokevirtual   #345 <Method JSONObject JSONObject.put(String, Object)>
	//*  47   96:pop             
	//*  48   97:aload_3         
	//*  49   98:aload           4
	//*  50  100:invokestatic    #353 <Method void FileLruCache$StreamHeader.writeHeader(OutputStream, JSONObject)>
	//*  51  103:aload_3         
	//*  52  104:areturn         
	//*  53  105:astore_1        
	//*  54  106:goto            168
	//*  55  109:astore_1        
	//*  56  110:getstatic       #157 <Field LoggingBehavior LoggingBehavior.CACHE>
	//*  57  113:astore_2        
	//*  58  114:getstatic       #159 <Field String TAG>
	//*  59  117:astore          4
	//*  60  119:new             #186 <Class StringBuilder>
	//*  61  122:dup             
	//*  62  123:invokespecial   #187 <Method void StringBuilder()>
	//*  63  126:astore          5
	//*  64  128:aload           5
	//*  65  130:ldc2            #355 <String "Error creating JSON header for cache file: ">
	//*  66  133:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//*  67  136:pop             
	//*  68  137:aload           5
	//*  69  139:aload_1         
	//*  70  140:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//*  71  143:pop             
	//*  72  144:aload_2         
	//*  73  145:iconst_5        
	//*  74  146:aload           4
	//*  75  148:aload           5
	//*  76  150:invokevirtual   #218 <Method String StringBuilder.toString()>
	//*  77  153:invokestatic    #358 <Method void Logger.log(LoggingBehavior, int, String, String)>
	//*  78  156:new             #253 <Class IOException>
	//*  79  159:dup             
	//*  80  160:aload_1         
	//*  81  161:invokevirtual   #361 <Method String JSONException.getMessage()>
	//*  82  164:invokespecial   #364 <Method void IOException(String)>
	//*  83  167:athrow          
	//*  84  168:aload_3         
	//*  85  169:invokevirtual   #365 <Method void BufferedOutputStream.close()>
	//*  86  172:aload_1         
	//*  87  173:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  88  174:astore_1        
		{
			s1 = ((String) (LoggingBehavior.CACHE));
	//   89  175:getstatic       #157 <Field LoggingBehavior LoggingBehavior.CACHE>
	//   90  178:astore_2        
			obj = ((Object) (TAG));
	//   91  179:getstatic       #159 <Field String TAG>
	//   92  182:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   93  183:new             #186 <Class StringBuilder>
	//   94  186:dup             
	//   95  187:invokespecial   #187 <Method void StringBuilder()>
	//   96  190:astore          4
			stringbuilder.append("Error creating buffer output stream: ");
	//   97  192:aload           4
	//   98  194:ldc2            #367 <String "Error creating buffer output stream: ">
	//   99  197:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  100  200:pop             
			stringbuilder.append(((Object) (s)));
	//  101  201:aload           4
	//  102  203:aload_1         
	//  103  204:invokevirtual   #206 <Method StringBuilder StringBuilder.append(Object)>
	//  104  207:pop             
			Logger.log(((LoggingBehavior) (s1)), 5, ((String) (obj)), stringbuilder.toString());
	//  105  208:aload_2         
	//  106  209:iconst_5        
	//  107  210:aload_3         
	//  108  211:aload           4
	//  109  213:invokevirtual   #218 <Method String StringBuilder.toString()>
	//  110  216:invokestatic    #358 <Method void Logger.log(LoggingBehavior, int, String, String)>
			throw new IOException(((FileNotFoundException) (s)).getMessage());
	//  111  219:new             #253 <Class IOException>
	//  112  222:dup             
	//  113  223:aload_1         
	//  114  224:invokevirtual   #368 <Method String FileNotFoundException.getMessage()>
	//  115  227:invokespecial   #364 <Method void IOException(String)>
	//  116  230:athrow          
		}
		obj = ((Object) (new BufferedOutputStream(((OutputStream) (new CloseCallbackOutputStream(((OutputStream) (obj1)), new StreamCloseCallback() {

			public void onClose()
			{
				if(bufferFileCreateTime < lastClearCacheTime.get())
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field long val$bufferFileCreateTime>
			//*   2    4:aload_0         
			//*   3    5:getfield        #23  <Field FileLruCache this$0>
			//*   4    8:invokestatic    #38  <Method AtomicLong FileLruCache.access$000(FileLruCache)>
			//*   5   11:invokevirtual   #44  <Method long AtomicLong.get()>
			//*   6   14:lcmp            
			//*   7   15:ifge            27
				{
					buffer.delete();
			//    8   18:aload_0         
			//    9   19:getfield        #27  <Field File val$buffer>
			//   10   22:invokevirtual   #50  <Method boolean File.delete()>
			//   11   25:pop             
					return;
			//   12   26:return          
				} else
				{
					renameToTargetAndTrim(key, buffer);
			//   13   27:aload_0         
			//   14   28:getfield        #23  <Field FileLruCache this$0>
			//   15   31:aload_0         
			//   16   32:getfield        #29  <Field String val$key>
			//   17   35:aload_0         
			//   18   36:getfield        #27  <Field File val$buffer>
			//   19   39:invokestatic    #54  <Method void FileLruCache.access$100(FileLruCache, String, File)>
					return;
			//   20   42:return          
				}
			}

			final FileLruCache this$0;
			final File val$buffer;
			final long val$bufferFileCreateTime;
			final String val$key;

			
			{
				this$0 = FileLruCache.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field FileLruCache this$0>
				bufferFileCreateTime = l;
			//    3    5:aload_0         
			//    4    6:lload_2         
			//    5    7:putfield        #25  <Field long val$bufferFileCreateTime>
				buffer = file;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #27  <Field File val$buffer>
				key = s;
			//    9   16:aload_0         
			//   10   17:aload           5
			//   11   19:putfield        #29  <Field String val$key>
				super();
			//   12   22:aload_0         
			//   13   23:invokespecial   #32  <Method void Object()>
			//   14   26:return          
			}
		}
))), 8192)));
		obj1 = ((Object) (new JSONObject()));
		((JSONObject) (obj1)).put("key", ((Object) (s)));
		if(!Utility.isNullOrEmpty(s1))
			((JSONObject) (obj1)).put("tag", ((Object) (s1)));
		StreamHeader.writeHeader(((OutputStream) (obj)), ((JSONObject) (obj1)));
		return ((OutputStream) (obj));
		s;
		break MISSING_BLOCK_LABEL_168;
		s;
		s1 = ((String) (LoggingBehavior.CACHE));
		obj1 = ((Object) (TAG));
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Error creating JSON header for cache file: ");
		stringbuilder1.append(((Object) (s)));
		Logger.log(((LoggingBehavior) (s1)), 5, ((String) (obj1)), stringbuilder1.toString());
		throw new IOException(((JSONException) (s)).getMessage());
		((BufferedOutputStream) (obj)).close();
		throw s;
		s = ((String) (new StringBuilder()));
	//  117  231:new             #186 <Class StringBuilder>
	//  118  234:dup             
	//  119  235:invokespecial   #187 <Method void StringBuilder()>
	//  120  238:astore_1        
		((StringBuilder) (s)).append("Could not create file at ");
	//  121  239:aload_1         
	//  122  240:ldc2            #370 <String "Could not create file at ">
	//  123  243:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  124  246:pop             
		((StringBuilder) (s)).append(((File) (obj)).getAbsolutePath());
	//  125  247:aload_1         
	//  126  248:aload_3         
	//  127  249:invokevirtual   #373 <Method String File.getAbsolutePath()>
	//  128  252:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//  129  255:pop             
		throw new IOException(((StringBuilder) (s)).toString());
	//  130  256:new             #253 <Class IOException>
	//  131  259:dup             
	//  132  260:aload_1         
	//  133  261:invokevirtual   #218 <Method String StringBuilder.toString()>
	//  134  264:invokespecial   #364 <Method void IOException(String)>
	//  135  267:athrow          
	}

	long sizeInBytesForTest()
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Object lock>
	//    2    4:astore          7
		obj;
	//    3    6:aload           7
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
_L2:
		if(isTrimPending || isTrimInProgress)
	//*   5    9:aload_0         
	//*   6   10:getfield        #122 <Field boolean isTrimPending>
	//*   7   13:ifne            82
	//*   8   16:aload_0         
	//*   9   17:getfield        #151 <Field boolean isTrimInProgress>
	//*  10   20:ifeq            26
			break MISSING_BLOCK_LABEL_82;
	//   11   23:goto            82
		obj;
	//   12   26:aload           7
		JVM INSTR monitorexit ;
	//   13   28:monitorexit     
		obj = ((Object) (directory.listFiles()));
	//   14   29:aload_0         
	//   15   30:getfield        #91  <Field File directory>
	//   16   33:invokevirtual   #379 <Method File[] File.listFiles()>
	//   17   36:astore          7
		long l = 0L;
	//   18   38:lconst_0        
	//   19   39:lstore_3        
		long l1 = l;
	//   20   40:lload_3         
	//   21   41:lstore          5
		if(obj != null)
	//*  22   43:aload           7
	//*  23   45:ifnull          79
		{
			int j = obj.length;
	//   24   48:aload           7
	//   25   50:arraylength     
	//   26   51:istore_2        
			int i = 0;
	//   27   52:iconst_0        
	//   28   53:istore_1        
			do
			{
				l1 = l;
	//   29   54:lload_3         
	//   30   55:lstore          5
				if(i >= j)
					break;
	//   31   57:iload_1         
	//   32   58:iload_2         
	//   33   59:icmpge          79
				l += ((File) (obj[i])).length();
	//   34   62:lload_3         
	//   35   63:aload           7
	//   36   65:iload_1         
	//   37   66:aaload          
	//   38   67:invokevirtual   #221 <Method long File.length()>
	//   39   70:ladd            
	//   40   71:lstore_3        
				i++;
	//   41   72:iload_1         
	//   42   73:iconst_1        
	//   43   74:iadd            
	//   44   75:istore_1        
			} while(true);
	//   45   76:goto            54
		}
		return l1;
	//   46   79:lload           5
	//   47   81:lreturn         
		Exception exception;
		try
		{
			lock.wait();
	//   48   82:aload_0         
	//   49   83:getfield        #93  <Field Object lock>
	//   50   86:invokevirtual   #382 <Method void Object.wait()>
		}
	//*  51   89:goto            9
	//*  52   92:astore          8
	//*  53   94:aload           7
	//*  54   96:monitorexit     
	//*  55   97:aload           8
	//*  56   99:athrow          
		catch(InterruptedException interruptedexception) { }
	//   57  100:astore          8
		if(true) goto _L2; else goto _L1
	//   58  102:goto            9
_L1:
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #186 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #187 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{FileLruCache: tag:");
	//    4    8:aload_1         
	//    5    9:ldc2            #384 <String "{FileLruCache: tag:">
	//    6   12:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(tag);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field String tag>
	//   11   21:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(" file:");
	//   13   25:aload_1         
	//   14   26:ldc2            #386 <String " file:">
	//   15   29:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(directory.getName());
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #91  <Field File directory>
	//   20   38:invokevirtual   #215 <Method String File.getName()>
	//   21   41:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
		stringbuilder.append("}");
	//   23   45:aload_1         
	//   24   46:ldc2            #388 <String "}">
	//   25   49:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
		return stringbuilder.toString();
	//   27   53:aload_1         
	//   28   54:invokevirtual   #218 <Method String StringBuilder.toString()>
	//   29   57:areturn         
	}

	private static final String HEADER_CACHEKEY_KEY = "key";
	private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
	static final String TAG = "FileLruCache";
	private static final AtomicLong bufferIndex = new AtomicLong();
	private final File directory;
	private boolean isTrimInProgress;
	private boolean isTrimPending;
	private AtomicLong lastClearCacheTime;
	private final Limits limits;
	private final Object lock = new Object();
	private final String tag;

	static 
	{
	//    0    0:new             #61  <Class AtomicLong>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void AtomicLong()>
	//    3    7:putstatic       #66  <Field AtomicLong bufferIndex>
	//*   4   10:return          
	}


/*
	static AtomicLong access$000(FileLruCache filelrucache)
	{
		return filelrucache.lastClearCacheTime;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field AtomicLong lastClearCacheTime>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(FileLruCache filelrucache, String s, File file)
	{
		filelrucache.renameToTargetAndTrim(s, file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #112 <Method void renameToTargetAndTrim(String, File)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$200(FileLruCache filelrucache)
	{
		filelrucache.trim();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void trim()>
		return;
	//    2    4:return          
	}

*/


/*
	static AtomicLong access$300()
	{
		return bufferIndex;
	//    0    0:getstatic       #66  <Field AtomicLong bufferIndex>
	//    1    3:areturn         
	}

*/
}
