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
	static class ByteBufferStream extends InputStream
	{

		public int available()
			throws IOException
		{
			return byteBuffer.remaining();
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field ByteBuffer byteBuffer>
		//    2    4:invokevirtual   #32  <Method int ByteBuffer.remaining()>
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
		//    4    4:getfield        #22  <Field ByteBuffer byteBuffer>
		//    5    7:invokevirtual   #38  <Method int ByteBuffer.position()>
		//    6   10:putfield        #20  <Field int markPos>
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
			throws IOException
		{
			if(!byteBuffer.hasRemaining())
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #44  <Method boolean ByteBuffer.hasRemaining()>
		//*   3    7:ifne            12
				return -1;
		//    4   10:iconst_m1       
		//    5   11:ireturn         
			else
				return ((int) (byteBuffer.get()));
		//    6   12:aload_0         
		//    7   13:getfield        #22  <Field ByteBuffer byteBuffer>
		//    8   16:invokevirtual   #48  <Method byte ByteBuffer.get()>
		//    9   19:ireturn         
		}

		public int read(byte abyte0[], int i, int j)
			throws IOException
		{
			if(!byteBuffer.hasRemaining())
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #44  <Method boolean ByteBuffer.hasRemaining()>
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
		//    8   14:invokevirtual   #51  <Method int available()>
		//    9   17:invokestatic    #57  <Method int Math.min(int, int)>
		//   10   20:istore_3        
				byteBuffer.get(abyte0, i, j);
		//   11   21:aload_0         
		//   12   22:getfield        #22  <Field ByteBuffer byteBuffer>
		//   13   25:aload_1         
		//   14   26:iload_2         
		//   15   27:iload_3         
		//   16   28:invokevirtual   #60  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
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
		//*   2    2:aload_0         
		//*   3    3:getfield        #20  <Field int markPos>
		//*   4    6:iconst_m1       
		//*   5    7:icmpne          20
				throw new IOException("Cannot reset to unset mark position");
		//    6   10:new             #27  <Class IOException>
		//    7   13:dup             
		//    8   14:ldc1            #63  <String "Cannot reset to unset mark position">
		//    9   16:invokespecial   #66  <Method void IOException(String)>
		//   10   19:athrow          
			byteBuffer.position(markPos);
		//   11   20:aload_0         
		//   12   21:getfield        #22  <Field ByteBuffer byteBuffer>
		//   13   24:aload_0         
		//   14   25:getfield        #20  <Field int markPos>
		//   15   28:invokevirtual   #69  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   16   31:pop             
			this;
		//   17   32:aload_0         
			JVM INSTR monitorexit ;
		//   18   33:monitorexit     
			return;
		//   19   34:return          
			Exception exception;
			exception;
		//   20   35:astore_1        
		//*  21   36:aload_0         
			throw exception;
		//   22   37:monitorexit     
		//   23   38:aload_1         
		//   24   39:athrow          
		}

		public long skip(long l)
			throws IOException
		{
			if(!byteBuffer.hasRemaining())
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #44  <Method boolean ByteBuffer.hasRemaining()>
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
		//    8   16:invokevirtual   #51  <Method int available()>
		//    9   19:i2l             
		//   10   20:invokestatic    #76  <Method long Math.min(long, long)>
		//   11   23:lstore_1        
				byteBuffer.position((int)((long)byteBuffer.position() + l));
		//   12   24:aload_0         
		//   13   25:getfield        #22  <Field ByteBuffer byteBuffer>
		//   14   28:aload_0         
		//   15   29:getfield        #22  <Field ByteBuffer byteBuffer>
		//   16   32:invokevirtual   #38  <Method int ByteBuffer.position()>
		//   17   35:i2l             
		//   18   36:lload_1         
		//   19   37:ladd            
		//   20   38:l2i             
		//   21   39:invokevirtual   #69  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   22   42:pop             
				return l;
		//   23   43:lload_1         
		//   24   44:lreturn         
			}
		}

		private static final int UNSET = -1;
		private final ByteBuffer byteBuffer;
		private int markPos;

		public ByteBufferStream(ByteBuffer bytebuffer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void InputStream()>
			markPos = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #20  <Field int markPos>
			byteBuffer = bytebuffer;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #22  <Field ByteBuffer byteBuffer>
		//    8   14:return          
		}
	}

	static final class SafeArray
	{

		final byte data[];
		final int limit;
		final int offset;

		public SafeArray(byte abyte0[], int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			data = abyte0;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field byte[] data>
			offset = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int offset>
			limit = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #23  <Field int limit>
		//   11   19:return          
		}
	}


	private ByteBufferUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static ByteBuffer fromFile(File file)
		throws IOException
	{
		Object obj;
		FileChannel filechannel;
		FileChannel filechannel1;
		MappedByteBuffer mappedbytebuffer;
		mappedbytebuffer = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		filechannel1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		obj = ((Object) (mappedbytebuffer));
	//    4    6:aload           6
	//    5    8:astore_3        
		filechannel = filechannel1;
	//    6    9:aload           5
	//    7   11:astore          4
		long l = file.length();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #37  <Method long File.length()>
	//   10   17:lstore_1        
		if(l <= 0x7fffffffL)
			break MISSING_BLOCK_LABEL_43;
	//   11   18:lload_1         
	//   12   19:ldc2w           #38  <Long 0x7fffffffL>
	//   13   22:lcmp            
	//   14   23:ifle            43
		obj = ((Object) (mappedbytebuffer));
	//   15   26:aload           6
	//   16   28:astore_3        
		filechannel = filechannel1;
	//   17   29:aload           5
	//   18   31:astore          4
		throw new IOException("File too large to map into memory");
	//   19   33:new             #31  <Class IOException>
	//   20   36:dup             
	//   21   37:ldc1            #41  <String "File too large to map into memory">
	//   22   39:invokespecial   #44  <Method void IOException(String)>
	//   23   42:athrow          
		obj = ((Object) (mappedbytebuffer));
	//   24   43:aload           6
	//   25   45:astore_3        
		filechannel = filechannel1;
	//   26   46:aload           5
	//   27   48:astore          4
		file = ((File) (new RandomAccessFile(file, "r")));
	//   28   50:new             #46  <Class RandomAccessFile>
	//   29   53:dup             
	//   30   54:aload_0         
	//   31   55:ldc1            #48  <String "r">
	//   32   57:invokespecial   #51  <Method void RandomAccessFile(File, String)>
	//   33   60:astore_0        
		obj = ((Object) (file));
	//   34   61:aload_0         
	//   35   62:astore_3        
		filechannel = filechannel1;
	//   36   63:aload           5
	//   37   65:astore          4
		filechannel1 = ((RandomAccessFile) (file)).getChannel();
	//   38   67:aload_0         
	//   39   68:invokevirtual   #55  <Method FileChannel RandomAccessFile.getChannel()>
	//   40   71:astore          5
		obj = ((Object) (file));
	//   41   73:aload_0         
	//   42   74:astore_3        
		filechannel = filechannel1;
	//   43   75:aload           5
	//   44   77:astore          4
		mappedbytebuffer = filechannel1.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, l).load();
	//   45   79:aload           5
	//   46   81:getstatic       #61  <Field java.nio.channels.FileChannel$MapMode java.nio.channels.FileChannel$MapMode.READ_ONLY>
	//   47   84:lconst_0        
	//   48   85:lload_1         
	//   49   86:invokevirtual   #67  <Method MappedByteBuffer FileChannel.map(java.nio.channels.FileChannel$MapMode, long, long)>
	//   50   89:invokevirtual   #73  <Method MappedByteBuffer MappedByteBuffer.load()>
	//   51   92:astore          6
		if(filechannel1 != null)
	//*  52   94:aload           5
	//*  53   96:ifnull          108
			try
			{
				filechannel1.close();
	//   54   99:aload           5
	//   55  101:invokevirtual   #76  <Method void FileChannel.close()>
			}
	//*  56  104:goto            108
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   57  107:astore_3        
		if(file == null)
			break MISSING_BLOCK_LABEL_120;
	//   58  108:aload_0         
	//   59  109:ifnull          120
		((RandomAccessFile) (file)).close();
	//   60  112:aload_0         
	//   61  113:invokevirtual   #77  <Method void RandomAccessFile.close()>
		return ((ByteBuffer) (mappedbytebuffer));
	//   62  116:aload           6
	//   63  118:areturn         
		file;
	//   64  119:astore_0        
		return ((ByteBuffer) (mappedbytebuffer));
	//   65  120:aload           6
	//   66  122:areturn         
		file;
	//   67  123:astore_0        
		if(filechannel != null)
	//*  68  124:aload           4
	//*  69  126:ifnull          139
			try
			{
				filechannel.close();
	//   70  129:aload           4
	//   71  131:invokevirtual   #76  <Method void FileChannel.close()>
			}
	//*  72  134:goto            139
			catch(IOException ioexception1) { }
	//   73  137:astore          4
		if(obj != null)
	//*  74  139:aload_3         
	//*  75  140:ifnull          151
			try
			{
				((RandomAccessFile) (obj)).close();
	//   76  143:aload_3         
	//   77  144:invokevirtual   #77  <Method void RandomAccessFile.close()>
			}
	//*  78  147:goto            151
			catch(IOException ioexception) { }
	//   79  150:astore_3        
		throw file;
	//   80  151:aload_0         
	//   81  152:athrow          
	}

	public static ByteBuffer fromStream(InputStream inputstream)
		throws IOException
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(16384);
	//    0    0:new             #82  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:sipush          16384
	//    3    7:invokespecial   #85  <Method void ByteArrayOutputStream(int)>
	//    4   10:astore          4
		byte abyte1[] = (byte[])BUFFER_REF.getAndSet(((Object) (null)));
	//    5   12:getstatic       #25  <Field AtomicReference BUFFER_REF>
	//    6   15:aconst_null     
	//    7   16:invokevirtual   #89  <Method Object AtomicReference.getAndSet(Object)>
	//    8   19:checkcast       #91  <Class byte[]>
	//    9   22:astore_3        
		byte abyte0[] = abyte1;
	//   10   23:aload_3         
	//   11   24:astore_2        
		if(abyte1 == null)
	//*  12   25:aload_3         
	//*  13   26:ifnonnull       35
			abyte0 = new byte[16384];
	//   14   29:sipush          16384
	//   15   32:newarray        byte[]
	//   16   34:astore_2        
		do
		{
			int i = inputstream.read(abyte0);
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #97  <Method int InputStream.read(byte[])>
	//   20   40:istore_1        
			if(i >= 0)
	//*  21   41:iload_1         
	//*  22   42:iflt            56
			{
				bytearrayoutputstream.write(abyte0, 0, i);
	//   23   45:aload           4
	//   24   47:aload_2         
	//   25   48:iconst_0        
	//   26   49:iload_1         
	//   27   50:invokevirtual   #101 <Method void ByteArrayOutputStream.write(byte[], int, int)>
			} else
	//*  28   53:goto            35
			{
				BUFFER_REF.set(((Object) (abyte0)));
	//   29   56:getstatic       #25  <Field AtomicReference BUFFER_REF>
	//   30   59:aload_2         
	//   31   60:invokevirtual   #105 <Method void AtomicReference.set(Object)>
				inputstream = ((InputStream) (bytearrayoutputstream.toByteArray()));
	//   32   63:aload           4
	//   33   65:invokevirtual   #109 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   34   68:astore_0        
				return (ByteBuffer)ByteBuffer.allocateDirect(inputstream.length).put(((byte []) (inputstream))).position(0);
	//   35   69:aload_0         
	//   36   70:arraylength     
	//   37   71:invokestatic    #115 <Method ByteBuffer ByteBuffer.allocateDirect(int)>
	//   38   74:aload_0         
	//   39   75:invokevirtual   #119 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   40   78:iconst_0        
	//   41   79:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   42   82:checkcast       #111 <Class ByteBuffer>
	//   43   85:areturn         
			}
		} while(true);
	}

	private static SafeArray getSafeArray(ByteBuffer bytebuffer)
	{
		if(!bytebuffer.isReadOnly() && bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #129 <Method boolean ByteBuffer.isReadOnly()>
	//*   2    4:ifne            34
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #132 <Method boolean ByteBuffer.hasArray()>
	//*   5   11:ifeq            34
			return new SafeArray(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.limit());
	//    6   14:new             #9   <Class ByteBufferUtil$SafeArray>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokevirtual   #135 <Method byte[] ByteBuffer.array()>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #139 <Method int ByteBuffer.arrayOffset()>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #142 <Method int ByteBuffer.limit()>
	//   14   30:invokespecial   #144 <Method void ByteBufferUtil$SafeArray(byte[], int, int)>
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
	//    1    1:invokestatic    #148 <Method ByteBufferUtil$SafeArray getSafeArray(ByteBuffer)>
	//    2    4:astore_1        
		if(safearray != null && safearray.offset == 0 && safearray.limit == safearray.data.length)
	//*   3    5:aload_1         
	//*   4    6:ifnull          33
	//*   5    9:aload_1         
	//*   6   10:getfield        #151 <Field int ByteBufferUtil$SafeArray.offset>
	//*   7   13:ifne            33
	//*   8   16:aload_1         
	//*   9   17:getfield        #153 <Field int ByteBufferUtil$SafeArray.limit>
	//*  10   20:aload_1         
	//*  11   21:getfield        #156 <Field byte[] ByteBufferUtil$SafeArray.data>
	//*  12   24:arraylength     
	//*  13   25:icmpne          33
		{
			return bytebuffer.array();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #135 <Method byte[] ByteBuffer.array()>
	//   16   32:areturn         
		} else
		{
			bytebuffer = bytebuffer.asReadOnlyBuffer();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #160 <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//   19   37:astore_0        
			byte abyte0[] = new byte[bytebuffer.limit()];
	//   20   38:aload_0         
	//   21   39:invokevirtual   #142 <Method int ByteBuffer.limit()>
	//   22   42:newarray        byte[]
	//   23   44:astore_1        
			bytebuffer.position(0);
	//   24   45:aload_0         
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   27   50:pop             
			bytebuffer.get(abyte0);
	//   28   51:aload_0         
	//   29   52:aload_1         
	//   30   53:invokevirtual   #163 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   31   56:pop             
			return abyte0;
	//   32   57:aload_1         
	//   33   58:areturn         
		}
	}

	public static void toFile(ByteBuffer bytebuffer, File file)
		throws IOException
	{
		File file1;
		FileChannel filechannel;
		FileChannel filechannel1;
		bytebuffer.position(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #123 <Method java.nio.Buffer ByteBuffer.position(int)>
	//    3    5:pop             
		file1 = null;
	//    4    6:aconst_null     
	//    5    7:astore_2        
		filechannel1 = null;
	//    6    8:aconst_null     
	//    7    9:astore          4
		filechannel = filechannel1;
	//    8   11:aload           4
	//    9   13:astore_3        
		file = ((File) (new RandomAccessFile(file, "rw")));
	//   10   14:new             #46  <Class RandomAccessFile>
	//   11   17:dup             
	//   12   18:aload_1         
	//   13   19:ldc1            #167 <String "rw">
	//   14   21:invokespecial   #51  <Method void RandomAccessFile(File, String)>
	//   15   24:astore_1        
		file1 = file;
	//   16   25:aload_1         
	//   17   26:astore_2        
		filechannel = filechannel1;
	//   18   27:aload           4
	//   19   29:astore_3        
		filechannel1 = ((RandomAccessFile) (file)).getChannel();
	//   20   30:aload_1         
	//   21   31:invokevirtual   #55  <Method FileChannel RandomAccessFile.getChannel()>
	//   22   34:astore          4
		file1 = file;
	//   23   36:aload_1         
	//   24   37:astore_2        
		filechannel = filechannel1;
	//   25   38:aload           4
	//   26   40:astore_3        
		filechannel1.write(bytebuffer);
	//   27   41:aload           4
	//   28   43:aload_0         
	//   29   44:invokevirtual   #170 <Method int FileChannel.write(ByteBuffer)>
	//   30   47:pop             
		file1 = file;
	//   31   48:aload_1         
	//   32   49:astore_2        
		filechannel = filechannel1;
	//   33   50:aload           4
	//   34   52:astore_3        
		filechannel1.force(false);
	//   35   53:aload           4
	//   36   55:iconst_0        
	//   37   56:invokevirtual   #174 <Method void FileChannel.force(boolean)>
		file1 = file;
	//   38   59:aload_1         
	//   39   60:astore_2        
		filechannel = filechannel1;
	//   40   61:aload           4
	//   41   63:astore_3        
		filechannel1.close();
	//   42   64:aload           4
	//   43   66:invokevirtual   #76  <Method void FileChannel.close()>
		file1 = file;
	//   44   69:aload_1         
	//   45   70:astore_2        
		filechannel = filechannel1;
	//   46   71:aload           4
	//   47   73:astore_3        
		((RandomAccessFile) (file)).close();
	//   48   74:aload_1         
	//   49   75:invokevirtual   #77  <Method void RandomAccessFile.close()>
		if(filechannel1 != null)
	//*  50   78:aload           4
	//*  51   80:ifnull          92
			try
			{
				filechannel1.close();
	//   52   83:aload           4
	//   53   85:invokevirtual   #76  <Method void FileChannel.close()>
			}
	//*  54   88:goto            92
			// Misplaced declaration of an exception variable
			catch(ByteBuffer bytebuffer) { }
	//   55   91:astore_0        
		if(file != null)
	//*  56   92:aload_1         
	//*  57   93:ifnull          130
			try
			{
				((RandomAccessFile) (file)).close();
	//   58   96:aload_1         
	//   59   97:invokevirtual   #77  <Method void RandomAccessFile.close()>
				return;
	//   60  100:return          
			}
			// Misplaced declaration of an exception variable
			catch(ByteBuffer bytebuffer)
	//*  61  101:astore_0        
			{
				return;
	//   62  102:return          
			}
		else
	//*  63  103:astore_0        
	//*  64  104:aload_3         
	//*  65  105:ifnull          116
	//*  66  108:aload_3         
	//*  67  109:invokevirtual   #76  <Method void FileChannel.close()>
	//*  68  112:goto            116
	//*  69  115:astore_1        
	//*  70  116:aload_2         
	//*  71  117:ifnull          128
	//*  72  120:aload_2         
	//*  73  121:invokevirtual   #77  <Method void RandomAccessFile.close()>
	//*  74  124:goto            128
	//*  75  127:astore_1        
	//*  76  128:aload_0         
	//*  77  129:athrow          
			return;
	//   78  130:return          
		bytebuffer;
		if(filechannel != null)
			try
			{
				filechannel.close();
			}
			// Misplaced declaration of an exception variable
			catch(File file) { }
		if(file1 != null)
			try
			{
				((RandomAccessFile) (file1)).close();
			}
			// Misplaced declaration of an exception variable
			catch(File file) { }
		throw bytebuffer;
	}

	public static InputStream toStream(ByteBuffer bytebuffer)
	{
		return ((InputStream) (new ByteBufferStream(bytebuffer)));
	//    0    0:new             #6   <Class ByteBufferUtil$ByteBufferStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #179 <Method void ByteBufferUtil$ByteBufferStream(ByteBuffer)>
	//    4    8:areturn         
	}

	public static void toStream(ByteBuffer bytebuffer, OutputStream outputstream)
		throws IOException
	{
		SafeArray safearray = getSafeArray(bytebuffer);
	//    0    0:aload_0         
	//    1    1:invokestatic    #148 <Method ByteBufferUtil$SafeArray getSafeArray(ByteBuffer)>
	//    2    4:astore_3        
		if(safearray != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          31
		{
			outputstream.write(safearray.data, safearray.offset, safearray.offset + safearray.limit);
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:getfield        #156 <Field byte[] ByteBufferUtil$SafeArray.data>
	//    8   14:aload_3         
	//    9   15:getfield        #151 <Field int ByteBufferUtil$SafeArray.offset>
	//   10   18:aload_3         
	//   11   19:getfield        #151 <Field int ByteBufferUtil$SafeArray.offset>
	//   12   22:aload_3         
	//   13   23:getfield        #153 <Field int ByteBufferUtil$SafeArray.limit>
	//   14   26:iadd            
	//   15   27:invokevirtual   #183 <Method void OutputStream.write(byte[], int, int)>
			return;
	//   16   30:return          
		}
		byte abyte1[] = (byte[])BUFFER_REF.getAndSet(((Object) (null)));
	//   17   31:getstatic       #25  <Field AtomicReference BUFFER_REF>
	//   18   34:aconst_null     
	//   19   35:invokevirtual   #89  <Method Object AtomicReference.getAndSet(Object)>
	//   20   38:checkcast       #91  <Class byte[]>
	//   21   41:astore          4
		byte abyte0[] = abyte1;
	//   22   43:aload           4
	//   23   45:astore_3        
		if(abyte1 == null)
	//*  24   46:aload           4
	//*  25   48:ifnonnull       57
			abyte0 = new byte[16384];
	//   26   51:sipush          16384
	//   27   54:newarray        byte[]
	//   28   56:astore_3        
		int i;
		for(; bytebuffer.remaining() > 0; outputstream.write(abyte0, 0, i))
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #186 <Method int ByteBuffer.remaining()>
	//*  31   61:ifle            92
		{
			i = Math.min(bytebuffer.remaining(), abyte0.length);
	//   32   64:aload_0         
	//   33   65:invokevirtual   #186 <Method int ByteBuffer.remaining()>
	//   34   68:aload_3         
	//   35   69:arraylength     
	//   36   70:invokestatic    #192 <Method int Math.min(int, int)>
	//   37   73:istore_2        
			bytebuffer.get(abyte0, 0, i);
	//   38   74:aload_0         
	//   39   75:aload_3         
	//   40   76:iconst_0        
	//   41   77:iload_2         
	//   42   78:invokevirtual   #195 <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   43   81:pop             
		}

	//   44   82:aload_1         
	//   45   83:aload_3         
	//   46   84:iconst_0        
	//   47   85:iload_2         
	//   48   86:invokevirtual   #183 <Method void OutputStream.write(byte[], int, int)>
	//*  49   89:goto            57
		BUFFER_REF.set(((Object) (abyte0)));
	//   50   92:getstatic       #25  <Field AtomicReference BUFFER_REF>
	//   51   95:aload_3         
	//   52   96:invokevirtual   #105 <Method void AtomicReference.set(Object)>
	//   53   99:return          
	}

	private static final AtomicReference BUFFER_REF = new AtomicReference();
	private static final int BUFFER_SIZE = 16384;

	static 
	{
	//    0    0:new             #20  <Class AtomicReference>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void AtomicReference()>
	//    3    7:putstatic       #25  <Field AtomicReference BUFFER_REF>
	//*   4   10:return          
	}
}
