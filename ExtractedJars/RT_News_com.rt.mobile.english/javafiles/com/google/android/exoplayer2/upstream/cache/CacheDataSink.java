// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.*;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			Cache

public final class CacheDataSink
	implements DataSink
{
	public static class CacheDataSinkException extends Cache.CacheException
	{

		public CacheDataSinkException(IOException ioexception)
		{
			super(((Throwable) (ioexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void Cache$CacheException(Throwable)>
		//    3    5:return          
		}
	}


	public CacheDataSink(Cache cache1, long l)
	{
		this(cache1, l, 20480, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:sipush          20480
	//    4    6:iconst_1        
	//    5    7:invokespecial   #36  <Method void CacheDataSink(Cache, long, int, boolean)>
	//    6   10:return          
	}

	public CacheDataSink(Cache cache1, long l, int i)
	{
		this(cache1, l, i, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iload           4
	//    4    5:iconst_1        
	//    5    6:invokespecial   #36  <Method void CacheDataSink(Cache, long, int, boolean)>
	//    6    9:return          
	}

	public CacheDataSink(Cache cache1, long l, int i, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		cache = (Cache)Assertions.checkNotNull(((Object) (cache1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #49  <Class Cache>
	//    6   12:putfield        #51  <Field Cache cache>
		maxCacheFileSize = l;
	//    7   15:aload_0         
	//    8   16:lload_2         
	//    9   17:putfield        #53  <Field long maxCacheFileSize>
		bufferSize = i;
	//   10   20:aload_0         
	//   11   21:iload           4
	//   12   23:putfield        #55  <Field int bufferSize>
		syncFileDescriptor = flag;
	//   13   26:aload_0         
	//   14   27:iload           5
	//   15   29:putfield        #57  <Field boolean syncFileDescriptor>
	//   16   32:return          
	}

	public CacheDataSink(Cache cache1, long l, boolean flag)
	{
		this(cache1, l, 20480, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:sipush          20480
	//    4    6:iload           4
	//    5    8:invokespecial   #36  <Method void CacheDataSink(Cache, long, int, boolean)>
	//    6   11:return          
	}

	private void closeCurrentOutputStream()
		throws IOException
	{
		if(outputStream == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field OutputStream outputStream>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		outputStream.flush();
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field OutputStream outputStream>
	//    6   12:invokevirtual   #68  <Method void OutputStream.flush()>
		if(syncFileDescriptor)
	//*   7   15:aload_0         
	//*   8   16:getfield        #57  <Field boolean syncFileDescriptor>
	//*   9   19:ifeq            32
			underlyingFileOutputStream.getFD().sync();
	//   10   22:aload_0         
	//   11   23:getfield        #70  <Field FileOutputStream underlyingFileOutputStream>
	//   12   26:invokevirtual   #76  <Method FileDescriptor FileOutputStream.getFD()>
	//   13   29:invokevirtual   #81  <Method void FileDescriptor.sync()>
		Util.closeQuietly(((java.io.Closeable) (outputStream)));
	//   14   32:aload_0         
	//   15   33:getfield        #63  <Field OutputStream outputStream>
	//   16   36:invokestatic    #87  <Method void Util.closeQuietly(java.io.Closeable)>
		outputStream = null;
	//   17   39:aload_0         
	//   18   40:aconst_null     
	//   19   41:putfield        #63  <Field OutputStream outputStream>
		File file1 = file;
	//   20   44:aload_0         
	//   21   45:getfield        #89  <Field File file>
	//   22   48:astore_1        
		file = null;
	//   23   49:aload_0         
	//   24   50:aconst_null     
	//   25   51:putfield        #89  <Field File file>
		cache.commitFile(file1);
	//   26   54:aload_0         
	//   27   55:getfield        #51  <Field Cache cache>
	//   28   58:aload_1         
	//   29   59:invokeinterface #93  <Method void Cache.commitFile(File)>
		return;
	//   30   64:return          
		Exception exception;
		exception;
	//   31   65:astore_1        
		Util.closeQuietly(((java.io.Closeable) (outputStream)));
	//   32   66:aload_0         
	//   33   67:getfield        #63  <Field OutputStream outputStream>
	//   34   70:invokestatic    #87  <Method void Util.closeQuietly(java.io.Closeable)>
		outputStream = null;
	//   35   73:aload_0         
	//   36   74:aconst_null     
	//   37   75:putfield        #63  <Field OutputStream outputStream>
		File file2 = file;
	//   38   78:aload_0         
	//   39   79:getfield        #89  <Field File file>
	//   40   82:astore_2        
		file = null;
	//   41   83:aload_0         
	//   42   84:aconst_null     
	//   43   85:putfield        #89  <Field File file>
		file2.delete();
	//   44   88:aload_2         
	//   45   89:invokevirtual   #99  <Method boolean File.delete()>
	//   46   92:pop             
		throw exception;
	//   47   93:aload_1         
	//   48   94:athrow          
	}

	private void openNextOutputStream()
		throws IOException
	{
		long l;
		if(dataSpec.length == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field DataSpec dataSpec>
	//*   2    4:getfield        #108 <Field long DataSpec.length>
	//*   3    7:ldc2w           #109 <Long -1L>
	//*   4   10:lcmp            
	//*   5   11:ifne            22
			l = maxCacheFileSize;
	//    6   14:aload_0         
	//    7   15:getfield        #53  <Field long maxCacheFileSize>
	//    8   18:lstore_1        
		else
	//*   9   19:goto            45
			l = Math.min(dataSpec.length - dataSpecBytesWritten, maxCacheFileSize);
	//   10   22:aload_0         
	//   11   23:getfield        #103 <Field DataSpec dataSpec>
	//   12   26:getfield        #108 <Field long DataSpec.length>
	//   13   29:aload_0         
	//   14   30:getfield        #112 <Field long dataSpecBytesWritten>
	//   15   33:lsub            
	//   16   34:aload_0         
	//   17   35:getfield        #53  <Field long maxCacheFileSize>
	//   18   38:invokestatic    #118 <Method long Math.min(long, long)>
	//   19   41:lstore_1        
	//*  20   42:goto            19
		file = cache.startFile(dataSpec.key, dataSpec.absoluteStreamPosition + dataSpecBytesWritten, l);
	//   21   45:aload_0         
	//   22   46:aload_0         
	//   23   47:getfield        #51  <Field Cache cache>
	//   24   50:aload_0         
	//   25   51:getfield        #103 <Field DataSpec dataSpec>
	//   26   54:getfield        #122 <Field String DataSpec.key>
	//   27   57:aload_0         
	//   28   58:getfield        #103 <Field DataSpec dataSpec>
	//   29   61:getfield        #125 <Field long DataSpec.absoluteStreamPosition>
	//   30   64:aload_0         
	//   31   65:getfield        #112 <Field long dataSpecBytesWritten>
	//   32   68:ladd            
	//   33   69:lload_1         
	//   34   70:invokeinterface #129 <Method File Cache.startFile(String, long, long)>
	//   35   75:putfield        #89  <Field File file>
		underlyingFileOutputStream = new FileOutputStream(file);
	//   36   78:aload_0         
	//   37   79:new             #72  <Class FileOutputStream>
	//   38   82:dup             
	//   39   83:aload_0         
	//   40   84:getfield        #89  <Field File file>
	//   41   87:invokespecial   #131 <Method void FileOutputStream(File)>
	//   42   90:putfield        #70  <Field FileOutputStream underlyingFileOutputStream>
		if(bufferSize > 0)
	//*  43   93:aload_0         
	//*  44   94:getfield        #55  <Field int bufferSize>
	//*  45   97:ifle            151
		{
			if(bufferedOutputStream == null)
	//*  46  100:aload_0         
	//*  47  101:getfield        #133 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//*  48  104:ifnonnull       129
				bufferedOutputStream = new ReusableBufferedOutputStream(((OutputStream) (underlyingFileOutputStream)), bufferSize);
	//   49  107:aload_0         
	//   50  108:new             #135 <Class ReusableBufferedOutputStream>
	//   51  111:dup             
	//   52  112:aload_0         
	//   53  113:getfield        #70  <Field FileOutputStream underlyingFileOutputStream>
	//   54  116:aload_0         
	//   55  117:getfield        #55  <Field int bufferSize>
	//   56  120:invokespecial   #138 <Method void ReusableBufferedOutputStream(OutputStream, int)>
	//   57  123:putfield        #133 <Field ReusableBufferedOutputStream bufferedOutputStream>
			else
	//*  58  126:goto            140
				bufferedOutputStream.reset(((OutputStream) (underlyingFileOutputStream)));
	//   59  129:aload_0         
	//   60  130:getfield        #133 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//   61  133:aload_0         
	//   62  134:getfield        #70  <Field FileOutputStream underlyingFileOutputStream>
	//   63  137:invokevirtual   #142 <Method void ReusableBufferedOutputStream.reset(OutputStream)>
			outputStream = ((OutputStream) (bufferedOutputStream));
	//   64  140:aload_0         
	//   65  141:aload_0         
	//   66  142:getfield        #133 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//   67  145:putfield        #63  <Field OutputStream outputStream>
		} else
	//*  68  148:goto            159
		{
			outputStream = ((OutputStream) (underlyingFileOutputStream));
	//   69  151:aload_0         
	//   70  152:aload_0         
	//   71  153:getfield        #70  <Field FileOutputStream underlyingFileOutputStream>
	//   72  156:putfield        #63  <Field OutputStream outputStream>
		}
		outputStreamBytesWritten = 0L;
	//   73  159:aload_0         
	//   74  160:lconst_0        
	//   75  161:putfield        #144 <Field long outputStreamBytesWritten>
	//   76  164:return          
	}

	public void close()
		throws CacheDataSinkException
	{
		if(dataSpec == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field DataSpec dataSpec>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		try
		{
			closeCurrentOutputStream();
	//    4    8:aload_0         
	//    5    9:invokespecial   #147 <Method void closeCurrentOutputStream()>
			return;
	//    6   12:return          
		}
		catch(IOException ioexception)
	//*   7   13:astore_1        
		{
			throw new CacheDataSinkException(ioexception);
	//    8   14:new             #8   <Class CacheDataSink$CacheDataSinkException>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:invokespecial   #150 <Method void CacheDataSink$CacheDataSinkException(IOException)>
	//   12   22:athrow          
		}
	}

	public void open(DataSpec dataspec)
		throws CacheDataSinkException
	{
		if(dataspec.length == -1L && !dataspec.isFlagSet(2))
	//*   0    0:aload_1         
	//*   1    1:getfield        #108 <Field long DataSpec.length>
	//*   2    4:ldc2w           #109 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            25
	//*   5   11:aload_1         
	//*   6   12:iconst_2        
	//*   7   13:invokevirtual   #156 <Method boolean DataSpec.isFlagSet(int)>
	//*   8   16:ifne            25
		{
			dataSpec = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #103 <Field DataSpec dataSpec>
			return;
	//   12   24:return          
		}
		dataSpec = dataspec;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #103 <Field DataSpec dataSpec>
		dataSpecBytesWritten = 0L;
	//   16   30:aload_0         
	//   17   31:lconst_0        
	//   18   32:putfield        #112 <Field long dataSpecBytesWritten>
		try
		{
			openNextOutputStream();
	//   19   35:aload_0         
	//   20   36:invokespecial   #158 <Method void openNextOutputStream()>
			return;
	//   21   39:return          
		}
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  22   40:astore_1        
		{
			throw new CacheDataSinkException(((IOException) (dataspec)));
	//   23   41:new             #8   <Class CacheDataSink$CacheDataSinkException>
	//   24   44:dup             
	//   25   45:aload_1         
	//   26   46:invokespecial   #150 <Method void CacheDataSink$CacheDataSinkException(IOException)>
	//   27   49:athrow          
		}
	}

	public void write(byte abyte0[], int i, int j)
		throws CacheDataSinkException
	{
		int k;
		if(dataSpec == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field DataSpec dataSpec>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		k = 0;
	//    4    8:iconst_0        
	//    5    9:istore          4
_L2:
		if(k >= j)
			break; /* Loop/switch isn't completed */
	//    6   11:iload           4
	//    7   13:iload_3         
	//    8   14:icmpge          122
		int l;
		long l1;
		long l2;
		try
		{
			if(outputStreamBytesWritten == maxCacheFileSize)
	//*   9   17:aload_0         
	//*  10   18:getfield        #144 <Field long outputStreamBytesWritten>
	//*  11   21:aload_0         
	//*  12   22:getfield        #53  <Field long maxCacheFileSize>
	//*  13   25:lcmp            
	//*  14   26:ifne            37
			{
				closeCurrentOutputStream();
	//   15   29:aload_0         
	//   16   30:invokespecial   #147 <Method void closeCurrentOutputStream()>
				openNextOutputStream();
	//   17   33:aload_0         
	//   18   34:invokespecial   #158 <Method void openNextOutputStream()>
			}
			l = (int)Math.min(j - k, maxCacheFileSize - outputStreamBytesWritten);
	//   19   37:iload_3         
	//   20   38:iload           4
	//   21   40:isub            
	//   22   41:i2l             
	//   23   42:aload_0         
	//   24   43:getfield        #53  <Field long maxCacheFileSize>
	//   25   46:aload_0         
	//   26   47:getfield        #144 <Field long outputStreamBytesWritten>
	//   27   50:lsub            
	//   28   51:invokestatic    #118 <Method long Math.min(long, long)>
	//   29   54:l2i             
	//   30   55:istore          5
			outputStream.write(abyte0, i + k, l);
	//   31   57:aload_0         
	//   32   58:getfield        #63  <Field OutputStream outputStream>
	//   33   61:aload_1         
	//   34   62:iload_2         
	//   35   63:iload           4
	//   36   65:iadd            
	//   37   66:iload           5
	//   38   68:invokevirtual   #162 <Method void OutputStream.write(byte[], int, int)>
		}
	//*  39   71:iload           4
	//*  40   73:iload           5
	//*  41   75:iadd            
	//*  42   76:istore          4
	//*  43   78:aload_0         
	//*  44   79:getfield        #144 <Field long outputStreamBytesWritten>
	//*  45   82:lstore          6
	//*  46   84:iload           5
	//*  47   86:i2l             
	//*  48   87:lstore          8
	//*  49   89:aload_0         
	//*  50   90:lload           6
	//*  51   92:lload           8
	//*  52   94:ladd            
	//*  53   95:putfield        #144 <Field long outputStreamBytesWritten>
	//*  54   98:aload_0         
	//*  55   99:aload_0         
	//*  56  100:getfield        #112 <Field long dataSpecBytesWritten>
	//*  57  103:lload           8
	//*  58  105:ladd            
	//*  59  106:putfield        #112 <Field long dataSpecBytesWritten>
	//*  60  109:goto            11
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  61  112:astore_1        
		{
			throw new CacheDataSinkException(((IOException) (abyte0)));
	//   62  113:new             #8   <Class CacheDataSink$CacheDataSinkException>
	//   63  116:dup             
	//   64  117:aload_1         
	//   65  118:invokespecial   #150 <Method void CacheDataSink$CacheDataSinkException(IOException)>
	//   66  121:athrow          
		}
		k += l;
		l1 = outputStreamBytesWritten;
		l2 = l;
		outputStreamBytesWritten = l1 + l2;
		dataSpecBytesWritten = dataSpecBytesWritten + l2;
		if(true) goto _L2; else goto _L1
_L1:
	//   67  122:return          
	}

	public static final int DEFAULT_BUFFER_SIZE = 20480;
	private final int bufferSize;
	private ReusableBufferedOutputStream bufferedOutputStream;
	private final Cache cache;
	private DataSpec dataSpec;
	private long dataSpecBytesWritten;
	private File file;
	private final long maxCacheFileSize;
	private OutputStream outputStream;
	private long outputStreamBytesWritten;
	private final boolean syncFileDescriptor;
	private FileOutputStream underlyingFileOutputStream;
}
