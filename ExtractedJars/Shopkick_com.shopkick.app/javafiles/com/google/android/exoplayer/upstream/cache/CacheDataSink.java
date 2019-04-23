// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream.cache;

import com.google.android.exoplayer.upstream.DataSink;
import com.google.android.exoplayer.upstream.DataSpec;
import com.google.android.exoplayer.util.*;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//			Cache

public final class CacheDataSink
	implements DataSink
{
	public static class CacheDataSinkException extends Cache.CacheException
	{

		public CacheDataSinkException(IOException ioexception)
		{
			super(ioexception);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Cache$CacheException(IOException)>
		//    3    5:return          
		}
	}


	public CacheDataSink(Cache cache1, long l)
	{
		this(cache1, l, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #32  <Method void CacheDataSink(Cache, long, int)>
	//    5    7:return          
	}

	public CacheDataSink(Cache cache1, long l, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		cache = (Cache)Assertions.checkNotNull(((Object) (cache1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #42  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #44  <Class Cache>
	//    6   12:putfield        #46  <Field Cache cache>
		maxCacheFileSize = l;
	//    7   15:aload_0         
	//    8   16:lload_2         
	//    9   17:putfield        #48  <Field long maxCacheFileSize>
		bufferSize = i;
	//   10   20:aload_0         
	//   11   21:iload           4
	//   12   23:putfield        #50  <Field int bufferSize>
	//   13   26:return          
	}

	private void closeCurrentOutputStream()
		throws IOException
	{
		OutputStream outputstream;
		outputstream = outputStream;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field OutputStream outputStream>
	//    2    4:astore_1        
		if(outputstream == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		outputstream.flush();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #60  <Method void OutputStream.flush()>
		underlyingFileOutputStream.getFD().sync();
	//    8   14:aload_0         
	//    9   15:getfield        #62  <Field FileOutputStream underlyingFileOutputStream>
	//   10   18:invokevirtual   #68  <Method FileDescriptor FileOutputStream.getFD()>
	//   11   21:invokevirtual   #73  <Method void FileDescriptor.sync()>
		Util.closeQuietly(((java.io.Closeable) (outputStream)));
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field OutputStream outputStream>
	//   14   28:invokestatic    #79  <Method void Util.closeQuietly(java.io.Closeable)>
		outputStream = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #55  <Field OutputStream outputStream>
		File file1 = file;
	//   18   36:aload_0         
	//   19   37:getfield        #81  <Field File file>
	//   20   40:astore_1        
		file = null;
	//   21   41:aload_0         
	//   22   42:aconst_null     
	//   23   43:putfield        #81  <Field File file>
		cache.commitFile(file1);
	//   24   46:aload_0         
	//   25   47:getfield        #46  <Field Cache cache>
	//   26   50:aload_1         
	//   27   51:invokeinterface #85  <Method void Cache.commitFile(File)>
		return;
	//   28   56:return          
		Exception exception;
		exception;
	//   29   57:astore_1        
		Util.closeQuietly(((java.io.Closeable) (outputStream)));
	//   30   58:aload_0         
	//   31   59:getfield        #55  <Field OutputStream outputStream>
	//   32   62:invokestatic    #79  <Method void Util.closeQuietly(java.io.Closeable)>
		outputStream = null;
	//   33   65:aload_0         
	//   34   66:aconst_null     
	//   35   67:putfield        #55  <Field OutputStream outputStream>
		File file2 = file;
	//   36   70:aload_0         
	//   37   71:getfield        #81  <Field File file>
	//   38   74:astore_2        
		file = null;
	//   39   75:aload_0         
	//   40   76:aconst_null     
	//   41   77:putfield        #81  <Field File file>
		file2.delete();
	//   42   80:aload_2         
	//   43   81:invokevirtual   #91  <Method boolean File.delete()>
	//   44   84:pop             
		throw exception;
	//   45   85:aload_1         
	//   46   86:athrow          
	}

	private void openNextOutputStream()
		throws IOException
	{
		file = cache.startFile(dataSpec.key, dataSpec.absoluteStreamPosition + dataSpecBytesWritten, Math.min(dataSpec.length - dataSpecBytesWritten, maxCacheFileSize));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #46  <Field Cache cache>
	//    3    5:aload_0         
	//    4    6:getfield        #95  <Field DataSpec dataSpec>
	//    5    9:getfield        #101 <Field String DataSpec.key>
	//    6   12:aload_0         
	//    7   13:getfield        #95  <Field DataSpec dataSpec>
	//    8   16:getfield        #104 <Field long DataSpec.absoluteStreamPosition>
	//    9   19:aload_0         
	//   10   20:getfield        #106 <Field long dataSpecBytesWritten>
	//   11   23:ladd            
	//   12   24:aload_0         
	//   13   25:getfield        #95  <Field DataSpec dataSpec>
	//   14   28:getfield        #109 <Field long DataSpec.length>
	//   15   31:aload_0         
	//   16   32:getfield        #106 <Field long dataSpecBytesWritten>
	//   17   35:lsub            
	//   18   36:aload_0         
	//   19   37:getfield        #48  <Field long maxCacheFileSize>
	//   20   40:invokestatic    #115 <Method long Math.min(long, long)>
	//   21   43:invokeinterface #119 <Method File Cache.startFile(String, long, long)>
	//   22   48:putfield        #81  <Field File file>
		underlyingFileOutputStream = new FileOutputStream(file);
	//   23   51:aload_0         
	//   24   52:new             #64  <Class FileOutputStream>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:getfield        #81  <Field File file>
	//   28   60:invokespecial   #121 <Method void FileOutputStream(File)>
	//   29   63:putfield        #62  <Field FileOutputStream underlyingFileOutputStream>
		int i = bufferSize;
	//   30   66:aload_0         
	//   31   67:getfield        #50  <Field int bufferSize>
	//   32   70:istore_1        
		if(i > 0)
	//*  33   71:iload_1         
	//*  34   72:ifle            122
		{
			ReusableBufferedOutputStream reusablebufferedoutputstream = bufferedOutputStream;
	//   35   75:aload_0         
	//   36   76:getfield        #123 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//   37   79:astore_2        
			if(reusablebufferedoutputstream == null)
	//*  38   80:aload_2         
	//*  39   81:ifnonnull       103
				bufferedOutputStream = new ReusableBufferedOutputStream(((OutputStream) (underlyingFileOutputStream)), i);
	//   40   84:aload_0         
	//   41   85:new             #125 <Class ReusableBufferedOutputStream>
	//   42   88:dup             
	//   43   89:aload_0         
	//   44   90:getfield        #62  <Field FileOutputStream underlyingFileOutputStream>
	//   45   93:iload_1         
	//   46   94:invokespecial   #128 <Method void ReusableBufferedOutputStream(OutputStream, int)>
	//   47   97:putfield        #123 <Field ReusableBufferedOutputStream bufferedOutputStream>
			else
	//*  48  100:goto            111
				reusablebufferedoutputstream.reset(((OutputStream) (underlyingFileOutputStream)));
	//   49  103:aload_2         
	//   50  104:aload_0         
	//   51  105:getfield        #62  <Field FileOutputStream underlyingFileOutputStream>
	//   52  108:invokevirtual   #132 <Method void ReusableBufferedOutputStream.reset(OutputStream)>
			outputStream = ((OutputStream) (bufferedOutputStream));
	//   53  111:aload_0         
	//   54  112:aload_0         
	//   55  113:getfield        #123 <Field ReusableBufferedOutputStream bufferedOutputStream>
	//   56  116:putfield        #55  <Field OutputStream outputStream>
		} else
	//*  57  119:goto            130
		{
			outputStream = ((OutputStream) (underlyingFileOutputStream));
	//   58  122:aload_0         
	//   59  123:aload_0         
	//   60  124:getfield        #62  <Field FileOutputStream underlyingFileOutputStream>
	//   61  127:putfield        #55  <Field OutputStream outputStream>
		}
		outputStreamBytesWritten = 0L;
	//   62  130:aload_0         
	//   63  131:lconst_0        
	//   64  132:putfield        #134 <Field long outputStreamBytesWritten>
	//   65  135:return          
	}

	public void close()
		throws CacheDataSinkException
	{
		try
		{
			closeCurrentOutputStream();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method void closeCurrentOutputStream()>
			return;
	//    2    4:return          
		}
		catch(IOException ioexception)
	//*   3    5:astore_1        
		{
			throw new CacheDataSinkException(ioexception);
	//    4    6:new             #8   <Class CacheDataSink$CacheDataSinkException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #140 <Method void CacheDataSink$CacheDataSinkException(IOException)>
	//    8   14:athrow          
		}
	}

	public DataSink open(DataSpec dataspec)
		throws CacheDataSinkException
	{
		boolean flag;
		if(dataspec.length != -1L)
	//*   0    0:aload_1         
	//*   1    1:getfield        #109 <Field long DataSpec.length>
	//*   2    4:ldc2w           #143 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            16
			flag = true;
	//    5   11:iconst_1        
	//    6   12:istore_2        
		else
	//*   7   13:goto            18
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		Assertions.checkState(flag);
	//   10   18:iload_2         
	//   11   19:invokestatic    #148 <Method void Assertions.checkState(boolean)>
		try
		{
			dataSpec = dataspec;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #95  <Field DataSpec dataSpec>
			dataSpecBytesWritten = 0L;
	//   15   27:aload_0         
	//   16   28:lconst_0        
	//   17   29:putfield        #106 <Field long dataSpecBytesWritten>
			openNextOutputStream();
	//   18   32:aload_0         
	//   19   33:invokespecial   #150 <Method void openNextOutputStream()>
		}
	//*  20   36:aload_0         
	//*  21   37:areturn         
		// Misplaced declaration of an exception variable
		catch(DataSpec dataspec)
	//*  22   38:astore_1        
		{
			throw new CacheDataSinkException(((IOException) (dataspec)));
	//   23   39:new             #8   <Class CacheDataSink$CacheDataSinkException>
	//   24   42:dup             
	//   25   43:aload_1         
	//   26   44:invokespecial   #140 <Method void CacheDataSink$CacheDataSinkException(IOException)>
	//   27   47:athrow          
		}
		return ((DataSink) (this));
	}

	public void write(byte abyte0[], int i, int j)
		throws CacheDataSinkException
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
_L2:
		if(k >= j)
			break; /* Loop/switch isn't completed */
	//    2    3:iload           4
	//    3    5:iload_3         
	//    4    6:icmpge          114
		int l;
		long l1;
		long l2;
		try
		{
			if(outputStreamBytesWritten == maxCacheFileSize)
	//*   5    9:aload_0         
	//*   6   10:getfield        #134 <Field long outputStreamBytesWritten>
	//*   7   13:aload_0         
	//*   8   14:getfield        #48  <Field long maxCacheFileSize>
	//*   9   17:lcmp            
	//*  10   18:ifne            29
			{
				closeCurrentOutputStream();
	//   11   21:aload_0         
	//   12   22:invokespecial   #137 <Method void closeCurrentOutputStream()>
				openNextOutputStream();
	//   13   25:aload_0         
	//   14   26:invokespecial   #150 <Method void openNextOutputStream()>
			}
			l = (int)Math.min(j - k, maxCacheFileSize - outputStreamBytesWritten);
	//   15   29:iload_3         
	//   16   30:iload           4
	//   17   32:isub            
	//   18   33:i2l             
	//   19   34:aload_0         
	//   20   35:getfield        #48  <Field long maxCacheFileSize>
	//   21   38:aload_0         
	//   22   39:getfield        #134 <Field long outputStreamBytesWritten>
	//   23   42:lsub            
	//   24   43:invokestatic    #115 <Method long Math.min(long, long)>
	//   25   46:l2i             
	//   26   47:istore          5
			outputStream.write(abyte0, i + k, l);
	//   27   49:aload_0         
	//   28   50:getfield        #55  <Field OutputStream outputStream>
	//   29   53:aload_1         
	//   30   54:iload_2         
	//   31   55:iload           4
	//   32   57:iadd            
	//   33   58:iload           5
	//   34   60:invokevirtual   #154 <Method void OutputStream.write(byte[], int, int)>
		}
	//*  35   63:iload           4
	//*  36   65:iload           5
	//*  37   67:iadd            
	//*  38   68:istore          4
	//*  39   70:aload_0         
	//*  40   71:getfield        #134 <Field long outputStreamBytesWritten>
	//*  41   74:lstore          6
	//*  42   76:iload           5
	//*  43   78:i2l             
	//*  44   79:lstore          8
	//*  45   81:aload_0         
	//*  46   82:lload           6
	//*  47   84:lload           8
	//*  48   86:ladd            
	//*  49   87:putfield        #134 <Field long outputStreamBytesWritten>
	//*  50   90:aload_0         
	//*  51   91:aload_0         
	//*  52   92:getfield        #106 <Field long dataSpecBytesWritten>
	//*  53   95:lload           8
	//*  54   97:ladd            
	//*  55   98:putfield        #106 <Field long dataSpecBytesWritten>
	//*  56  101:goto            3
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  57  104:astore_1        
		{
			throw new CacheDataSinkException(((IOException) (abyte0)));
	//   58  105:new             #8   <Class CacheDataSink$CacheDataSinkException>
	//   59  108:dup             
	//   60  109:aload_1         
	//   61  110:invokespecial   #140 <Method void CacheDataSink$CacheDataSinkException(IOException)>
	//   62  113:athrow          
		}
		k += l;
		l1 = outputStreamBytesWritten;
		l2 = l;
		outputStreamBytesWritten = l1 + l2;
		dataSpecBytesWritten = dataSpecBytesWritten + l2;
		if(true) goto _L2; else goto _L1
_L1:
	//   63  114:return          
	}

	private final int bufferSize;
	private ReusableBufferedOutputStream bufferedOutputStream;
	private final Cache cache;
	private DataSpec dataSpec;
	private long dataSpecBytesWritten;
	private File file;
	private final long maxCacheFileSize;
	private OutputStream outputStream;
	private long outputStreamBytesWritten;
	private FileOutputStream underlyingFileOutputStream;
}
