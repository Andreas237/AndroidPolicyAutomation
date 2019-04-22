// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

public final class ByteBufferUtil
{
	private static class ByteBufferStream extends InputStream
	{

		public int available()
		{
			return byteBuffer.remaining();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ByteBuffer byteBuffer>
		//    2    4:invokevirtual   #30  <Method int ByteBuffer.remaining()>
		//    3    7:ireturn         
		}

		public void mark(int i)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			markPos = byteBuffer.position();
		//    2    2:aload_0         
		//    3    3:aload_0         
		//    4    4:getfield        #21  <Field ByteBuffer byteBuffer>
		//    5    7:invokevirtual   #35  <Method int ByteBuffer.position()>
		//    6   10:putfield        #19  <Field int markPos>
			this;
		//    7   13:aload_0         
			JVM INSTR monitorexit ;
		//    8   14:monitorexit     
			return;
		//    9   15:return          
			Exception exception;
			exception;
		//   10   16:astore_2        
		//*  11   17:aload_0         
			throw exception;
		//   12   18:monitorexit     
		//   13   19:aload_2         
		//   14   20:athrow          
		}

		public boolean markSupported()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public int read()
		{
			if(!byteBuffer.hasRemaining())
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #41  <Method boolean ByteBuffer.hasRemaining()>
		//*   3    7:ifne            12
				return -1;
		//    4   10:iconst_m1       
		//    5   11:ireturn         
			else
				return ((int) (byteBuffer.get()));
		//    6   12:aload_0         
		//    7   13:getfield        #21  <Field ByteBuffer byteBuffer>
		//    8   16:invokevirtual   #45  <Method byte ByteBuffer.get()>
		//    9   19:ireturn         
		}

		public int read(byte abyte0[], int i, int j)
			throws IOException
		{
			if(!byteBuffer.hasRemaining())
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #41  <Method boolean ByteBuffer.hasRemaining()>
		//*   3    7:ifne            12
			{
				return -1;
		//    4   10:iconst_m1       
		//    5   11:ireturn         
			} else
			{
				j = Math.min(j, available());
		//    6   12:iload_3         
		//    7   13:aload_0         
		//    8   14:invokevirtual   #50  <Method int available()>
		//    9   17:invokestatic    #56  <Method int Math.min(int, int)>
		//   10   20:istore_3        
				byteBuffer.get(abyte0, i, j);
		//   11   21:aload_0         
		//   12   22:getfield        #21  <Field ByteBuffer byteBuffer>
		//   13   25:aload_1         
		//   14   26:iload_2         
		//   15   27:iload_3         
		//   16   28:invokevirtual   #59  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//   17   31:pop             
				return j;
		//   18   32:iload_3         
		//   19   33:ireturn         
			}
		}

		public void reset()
			throws IOException
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(markPos == -1)
				break MISSING_BLOCK_LABEL_25;
		//    2    2:aload_0         
		//    3    3:getfield        #19  <Field int markPos>
		//    4    6:iconst_m1       
		//    5    7:icmpeq          25
			byteBuffer.position(markPos);
		//    6   10:aload_0         
		//    7   11:getfield        #21  <Field ByteBuffer byteBuffer>
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field int markPos>
		//   10   18:invokevirtual   #64  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   11   21:pop             
			this;
		//   12   22:aload_0         
			JVM INSTR monitorexit ;
		//   13   23:monitorexit     
			return;
		//   14   24:return          
			throw new IOException("Cannot reset to unset mark position");
		//   15   25:new             #48  <Class IOException>
		//   16   28:dup             
		//   17   29:ldc1            #66  <String "Cannot reset to unset mark position">
		//   18   31:invokespecial   #69  <Method void IOException(String)>
		//   19   34:athrow          
			Exception exception;
			exception;
		//   20   35:astore_1        
			this;
		//   21   36:aload_0         
			JVM INSTR monitorexit ;
		//   22   37:monitorexit     
			throw exception;
		//   23   38:aload_1         
		//   24   39:athrow          
		}

		public long skip(long l)
			throws IOException
		{
			if(!byteBuffer.hasRemaining())
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #41  <Method boolean ByteBuffer.hasRemaining()>
		//*   3    7:ifne            14
			{
				return -1L;
		//    4   10:ldc2w           #72  <Long -1L>
		//    5   13:lreturn         
			} else
			{
				l = Math.min(l, available());
		//    6   14:lload_1         
		//    7   15:aload_0         
		//    8   16:invokevirtual   #50  <Method int available()>
		//    9   19:i2l             
		//   10   20:invokestatic    #76  <Method long Math.min(long, long)>
		//   11   23:lstore_1        
				ByteBuffer bytebuffer = byteBuffer;
		//   12   24:aload_0         
		//   13   25:getfield        #21  <Field ByteBuffer byteBuffer>
		//   14   28:astore_3        
				bytebuffer.position((int)((long)bytebuffer.position() + l));
		//   15   29:aload_3         
		//   16   30:aload_3         
		//   17   31:invokevirtual   #35  <Method int ByteBuffer.position()>
		//   18   34:i2l             
		//   19   35:lload_1         
		//   20   36:ladd            
		//   21   37:l2i             
		//   22   38:invokevirtual   #64  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   23   41:pop             
				return l;
		//   24   42:lload_1         
		//   25   43:lreturn         
			}
		}

		private final ByteBuffer byteBuffer;
		private int markPos;

		ByteBufferStream(ByteBuffer bytebuffer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void InputStream()>
			markPos = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #19  <Field int markPos>
			byteBuffer = bytebuffer;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #21  <Field ByteBuffer byteBuffer>
		//    8   14:return          
		}
	}

	static final class SafeArray
	{

		final byte data[];
		final int limit;
		final int offset;

		SafeArray(byte abyte0[], int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			data = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field byte[] data>
			offset = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int offset>
			limit = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int limit>
		//   11   19:return          
		}
	}


	public static ByteBuffer fromFile(File file)
		throws IOException
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		long l = file.length();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #34  <Method long File.length()>
	//    4    7:lstore_1        
		if(l > 0x7fffffffL)
			break MISSING_BLOCK_LABEL_92;
	//    5    8:lload_1         
	//    6    9:ldc2w           #35  <Long 0x7fffffffL>
	//    7   12:lcmp            
	//    8   13:ifgt            92
		if(l == 0L)
			break MISSING_BLOCK_LABEL_82;
	//    9   16:lload_1         
	//   10   17:lconst_0        
	//   11   18:lcmp            
	//   12   19:ifeq            82
		RandomAccessFile randomaccessfile = new RandomAccessFile(file, "r");
	//   13   22:new             #38  <Class RandomAccessFile>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:ldc1            #40  <String "r">
	//   17   29:invokespecial   #43  <Method void RandomAccessFile(File, String)>
	//   18   32:astore_3        
		file = ((File) (randomaccessfile.getChannel()));
	//   19   33:aload_3         
	//   20   34:invokevirtual   #47  <Method FileChannel RandomAccessFile.getChannel()>
	//   21   37:astore_0        
		obj = ((Object) (((FileChannel) (file)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l).load()));
	//   22   38:aload_0         
	//   23   39:getstatic       #53  <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//   24   42:lconst_0        
	//   25   43:lload_1         
	//   26   44:invokevirtual   #59  <Method MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//   27   47:invokevirtual   #65  <Method MappedByteBuffer MappedByteBuffer.load()>
	//   28   50:astore          4
		Exception exception;
		if(file != null)
	//*  29   52:aload_0         
	//*  30   53:ifnull          60
			try
			{
				((FileChannel) (file)).close();
	//   31   56:aload_0         
	//   32   57:invokevirtual   #68  <Method void FileChannel.close()>
			}
	//*  33   60:aload_3         
	//*  34   61:invokevirtual   #69  <Method void RandomAccessFile.close()>
	//*  35   64:aload           4
	//*  36   66:areturn         
	//*  37   67:astore          5
	//*  38   69:aload_0         
	//*  39   70:astore          4
	//*  40   72:aload           5
	//*  41   74:astore_0        
	//*  42   75:goto            105
	//*  43   78:astore_0        
	//*  44   79:goto            105
	//*  45   82:new             #27  <Class IOException>
	//*  46   85:dup             
	//*  47   86:ldc1            #71  <String "File unsuitable for memory mapping">
	//*  48   88:invokespecial   #74  <Method void IOException(String)>
	//*  49   91:athrow          
	//*  50   92:new             #27  <Class IOException>
	//*  51   95:dup             
	//*  52   96:ldc1            #76  <String "File too large to map into memory">
	//*  53   98:invokespecial   #74  <Method void IOException(String)>
	//*  54  101:athrow          
	//*  55  102:astore_0        
	//*  56  103:aconst_null     
	//*  57  104:astore_3        
	//*  58  105:aload           4
	//*  59  107:ifnull          118
	//*  60  110:aload           4
	//*  61  112:invokevirtual   #68  <Method void FileChannel.close()>
	//*  62  115:goto            118
	//*  63  118:aload_3         
	//*  64  119:ifnull          126
	//*  65  122:aload_3         
	//*  66  123:invokevirtual   #69  <Method void RandomAccessFile.close()>
	//*  67  126:aload_0         
	//*  68  127:athrow          
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//   69  128:astore_0        
		try
		{
			randomaccessfile.close();
		}
	//*  70  129:goto            60
		// Misplaced declaration of an exception variable
		catch(File file)
	//*  71  132:astore_0        
		{
			return ((ByteBuffer) (obj));
	//   72  133:aload           4
	//   73  135:areturn         
		}
		return ((ByteBuffer) (obj));
		exception;
		obj = ((Object) (file));
		file = ((File) (exception));
		break MISSING_BLOCK_LABEL_105;
		file;
		break MISSING_BLOCK_LABEL_105;
		throw new IOException("File unsuitable for memory mapping");
		throw new IOException("File too large to map into memory");
		file;
		randomaccessfile = null;
		if(obj != null)
			try
			{
				((FileChannel) (obj)).close();
			}
			catch(IOException ioexception1) { }
	//   74  136:astore          4
		if(randomaccessfile != null)
			try
			{
				randomaccessfile.close();
			}
	//*  75  138:goto            118
			catch(IOException ioexception) { }
	//   76  141:astore_3        
		throw file;
	//*  77  142:goto            126
	}

	private static SafeArray getSafeArray(ByteBuffer bytebuffer)
	{
		if(!bytebuffer.isReadOnly() && bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #88  <Method boolean ByteBuffer.isReadOnly()>
	//*   2    4:ifne            34
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #91  <Method boolean ByteBuffer.hasArray()>
	//*   5   11:ifeq            34
			return new SafeArray(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.limit());
	//    6   14:new             #9   <Class ByteBufferUtil$SafeArray>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokevirtual   #95  <Method byte[] ByteBuffer.array()>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #99  <Method int ByteBuffer.arrayOffset()>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #102 <Method int ByteBuffer.limit()>
	//   14   30:invokespecial   #105 <Method void ByteBufferUtil$SafeArray(byte[], int, int)>
	//   15   33:areturn         
		else
			return null;
	//   16   34:aconst_null     
	//   17   35:areturn         
	}

	public static byte[] toBytes(ByteBuffer bytebuffer)
	{
		SafeArray safearray = getSafeArray(bytebuffer);
	//    0    0:aload_0         
	//    1    1:invokestatic    #109 <Method ByteBufferUtil$SafeArray getSafeArray(ByteBuffer)>
	//    2    4:astore_1        
		if(safearray != null && safearray.offset == 0 && safearray.limit == safearray.data.length)
	//*   3    5:aload_1         
	//*   4    6:ifnull          33
	//*   5    9:aload_1         
	//*   6   10:getfield        #113 <Field int ByteBufferUtil$SafeArray.offset>
	//*   7   13:ifne            33
	//*   8   16:aload_1         
	//*   9   17:getfield        #115 <Field int ByteBufferUtil$SafeArray.limit>
	//*  10   20:aload_1         
	//*  11   21:getfield        #119 <Field byte[] ByteBufferUtil$SafeArray.data>
	//*  12   24:arraylength     
	//*  13   25:icmpne          33
		{
			return bytebuffer.array();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #95  <Method byte[] ByteBuffer.array()>
	//   16   32:areturn         
		} else
		{
			bytebuffer = bytebuffer.asReadOnlyBuffer();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #123 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//   19   37:astore_0        
			byte abyte0[] = new byte[bytebuffer.limit()];
	//   20   38:aload_0         
	//   21   39:invokevirtual   #102 <Method int ByteBuffer.limit()>
	//   22   42:newarray        byte[]
	//   23   44:astore_1        
			bytebuffer.position(0);
	//   24   45:aload_0         
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #127 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   27   50:pop             
			bytebuffer.get(abyte0);
	//   28   51:aload_0         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #131 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   31   56:pop             
			return abyte0;
	//   32   57:aload_1         
	//   33   58:areturn         
		}
	}

	public static void toFile(ByteBuffer bytebuffer, File file)
		throws IOException
	{
		Object obj;
		Object obj1;
		bytebuffer.position(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #127 <Method java.nio.Buffer ByteBuffer.position(int)>
	//    3    5:pop             
		obj = null;
	//    4    6:aconst_null     
	//    5    7:astore_2        
		obj1 = null;
	//    6    8:aconst_null     
	//    7    9:astore          4
		RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
	//    8   11:new             #38  <Class RandomAccessFile>
	//    9   14:dup             
	//   10   15:aload_1         
	//   11   16:ldc1            #135 <String "rw">
	//   12   18:invokespecial   #43  <Method void RandomAccessFile(File, String)>
	//   13   21:astore_3        
		file = ((File) (obj1));
	//   14   22:aload           4
	//   15   24:astore_1        
		obj = ((Object) (randomaccessfile.getChannel()));
	//   16   25:aload_3         
	//   17   26:invokevirtual   #47  <Method FileChannel RandomAccessFile.getChannel()>
	//   18   29:astore_2        
		file = ((File) (obj));
	//   19   30:aload_2         
	//   20   31:astore_1        
		((FileChannel) (obj)).write(bytebuffer);
	//   21   32:aload_2         
	//   22   33:aload_0         
	//   23   34:invokevirtual   #139 <Method int FileChannel.write(ByteBuffer)>
	//   24   37:pop             
		file = ((File) (obj));
	//   25   38:aload_2         
	//   26   39:astore_1        
		((FileChannel) (obj)).force(false);
	//   27   40:aload_2         
	//   28   41:iconst_0        
	//   29   42:invokevirtual   #143 <Method void FileChannel.force(boolean)>
		file = ((File) (obj));
	//   30   45:aload_2         
	//   31   46:astore_1        
		((FileChannel) (obj)).close();
	//   32   47:aload_2         
	//   33   48:invokevirtual   #68  <Method void FileChannel.close()>
		file = ((File) (obj));
	//   34   51:aload_2         
	//   35   52:astore_1        
		randomaccessfile.close();
	//   36   53:aload_3         
	//   37   54:invokevirtual   #69  <Method void RandomAccessFile.close()>
		if(obj != null)
	//*  38   57:aload_2         
	//*  39   58:ifnull          65
			try
			{
				((FileChannel) (obj)).close();
	//   40   61:aload_2         
	//   41   62:invokevirtual   #68  <Method void FileChannel.close()>
			}
	//*  42   65:aload_3         
	//*  43   66:invokevirtual   #69  <Method void RandomAccessFile.close()>
	//*  44   69:return          
	//*  45   70:astore_0        
	//*  46   71:aload_1         
	//*  47   72:astore_2        
	//*  48   73:aload_3         
	//*  49   74:astore_1        
	//*  50   75:goto            81
	//*  51   78:astore_0        
	//*  52   79:aconst_null     
	//*  53   80:astore_1        
	//*  54   81:aload_2         
	//*  55   82:ifnull          92
	//*  56   85:aload_2         
	//*  57   86:invokevirtual   #68  <Method void FileChannel.close()>
	//*  58   89:goto            92
	//*  59   92:aload_1         
	//*  60   93:ifnull          100
	//*  61   96:aload_1         
	//*  62   97:invokevirtual   #69  <Method void RandomAccessFile.close()>
	//*  63  100:aload_0         
	//*  64  101:athrow          
			// Misplaced declaration of an exception variable
			catch(ByteBuffer bytebuffer) { }
	//   65  102:astore_0        
		try
		{
			randomaccessfile.close();
			return;
		}
	//*  66  103:goto            65
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*  67  106:astore_0        
		{
			return;
	//   68  107:return          
		}
		bytebuffer;
		obj = ((Object) (file));
		file = ((File) (randomaccessfile));
		break MISSING_BLOCK_LABEL_81;
		bytebuffer;
		file = null;
		if(obj != null)
			try
			{
				((FileChannel) (obj)).close();
			}
			catch(IOException ioexception) { }
	//   69  108:astore_2        
		if(file != null)
			try
			{
				((RandomAccessFile) (file)).close();
			}
	//*  70  109:goto            92
			// Misplaced declaration of an exception variable
			catch(File file) { }
	//   71  112:astore_1        
		throw bytebuffer;
	//*  72  113:goto            100
	}

	public static InputStream toStream(ByteBuffer bytebuffer)
	{
		return ((InputStream) (new ByteBufferStream(bytebuffer)));
	//    0    0:new             #6   <Class ByteBufferUtil$ByteBufferStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #148 <Method void ByteBufferUtil$ByteBufferStream(ByteBuffer)>
	//    4    8:areturn         
	}

	private static final AtomicReference BUFFER_REF = new AtomicReference();

	static 
	{
	//    0    0:new             #17  <Class AtomicReference>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void AtomicReference()>
	//    3    7:putstatic       #22  <Field AtomicReference BUFFER_REF>
	//*   4   10:return          
	}
}
