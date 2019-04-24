// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser
	implements ImageHeaderParser
{
	static final class ByteBufferReader
		implements Reader
	{

		public int getByte()
			throws IOException
		{
			if(byteBuffer.remaining() < 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #38  <Method int ByteBuffer.remaining()>
		//*   3    7:iconst_1        
		//*   4    8:icmpge          13
				return -1;
		//    5   11:iconst_m1       
		//    6   12:ireturn         
			else
				return ((int) (byteBuffer.get()));
		//    7   13:aload_0         
		//    8   14:getfield        #18  <Field ByteBuffer byteBuffer>
		//    9   17:invokevirtual   #42  <Method byte ByteBuffer.get()>
		//   10   20:ireturn         
		}

		public int getUInt16()
			throws IOException
		{
			return getByte() << 8 & 0xff00 | getByte() & 0xff;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #46  <Method int getByte()>
		//    2    4:bipush          8
		//    3    6:ishl            
		//    4    7:ldc1            #47  <Int 65280>
		//    5    9:iand            
		//    6   10:aload_0         
		//    7   11:invokevirtual   #46  <Method int getByte()>
		//    8   14:sipush          255
		//    9   17:iand            
		//   10   18:ior             
		//   11   19:ireturn         
		}

		public short getUInt8()
			throws IOException
		{
			return (short)(getByte() & 0xff);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #46  <Method int getByte()>
		//    2    4:sipush          255
		//    3    7:iand            
		//    4    8:int2short       
		//    5    9:ireturn         
		}

		public int read(byte abyte0[], int i)
			throws IOException
		{
			i = Math.min(i, byteBuffer.remaining());
		//    0    0:iload_2         
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field ByteBuffer byteBuffer>
		//    3    5:invokevirtual   #38  <Method int ByteBuffer.remaining()>
		//    4    8:invokestatic    #57  <Method int Math.min(int, int)>
		//    5   11:istore_2        
			if(i == 0)
		//*   6   12:iload_2         
		//*   7   13:ifne            18
			{
				return -1;
		//    8   16:iconst_m1       
		//    9   17:ireturn         
			} else
			{
				byteBuffer.get(abyte0, 0, i);
		//   10   18:aload_0         
		//   11   19:getfield        #18  <Field ByteBuffer byteBuffer>
		//   12   22:aload_1         
		//   13   23:iconst_0        
		//   14   24:iload_2         
		//   15   25:invokevirtual   #60  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//   16   28:pop             
				return i;
		//   17   29:iload_2         
		//   18   30:ireturn         
			}
		}

		public long skip(long l)
			throws IOException
		{
			int i = (int)Math.min(byteBuffer.remaining(), l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ByteBuffer byteBuffer>
		//    2    4:invokevirtual   #38  <Method int ByteBuffer.remaining()>
		//    3    7:i2l             
		//    4    8:lload_1         
		//    5    9:invokestatic    #65  <Method long Math.min(long, long)>
		//    6   12:l2i             
		//    7   13:istore_3        
			byteBuffer.position(byteBuffer.position() + i);
		//    8   14:aload_0         
		//    9   15:getfield        #18  <Field ByteBuffer byteBuffer>
		//   10   18:aload_0         
		//   11   19:getfield        #18  <Field ByteBuffer byteBuffer>
		//   12   22:invokevirtual   #68  <Method int ByteBuffer.position()>
		//   13   25:iload_3         
		//   14   26:iadd            
		//   15   27:invokevirtual   #71  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   16   30:pop             
			return (long)i;
		//   17   31:iload_3         
		//   18   32:i2l             
		//   19   33:lreturn         
		}

		private final ByteBuffer byteBuffer;

		ByteBufferReader(ByteBuffer bytebuffer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			byteBuffer = bytebuffer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ByteBuffer byteBuffer>
			bytebuffer.order(ByteOrder.BIG_ENDIAN);
		//    5    9:aload_1         
		//    6   10:getstatic       #24  <Field ByteOrder ByteOrder.BIG_ENDIAN>
		//    7   13:invokevirtual   #30  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//    8   16:pop             
		//    9   17:return          
		}
	}

	static final class RandomAccessReader
	{

		private boolean isAvailable(int i, int j)
		{
			return data.remaining() - i >= j;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ByteBuffer data>
		//    2    4:invokevirtual   #43  <Method int ByteBuffer.remaining()>
		//    3    7:iload_1         
		//    4    8:isub            
		//    5    9:iload_2         
		//    6   10:icmplt          15
		//    7   13:iconst_1        
		//    8   14:ireturn         
		//    9   15:iconst_0        
		//   10   16:ireturn         
		}

		short getInt16(int i)
		{
			if(isAvailable(i, 2))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:iconst_2        
		//*   3    3:invokespecial   #47  <Method boolean isAvailable(int, int)>
		//*   4    6:ifeq            18
				return data.getShort(i);
		//    5    9:aload_0         
		//    6   10:getfield        #36  <Field ByteBuffer data>
		//    7   13:iload_1         
		//    8   14:invokevirtual   #50  <Method short ByteBuffer.getShort(int)>
		//    9   17:ireturn         
			else
				return -1;
		//   10   18:iconst_m1       
		//   11   19:ireturn         
		}

		int getInt32(int i)
		{
			if(isAvailable(i, 4))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:iconst_4        
		//*   3    3:invokespecial   #47  <Method boolean isAvailable(int, int)>
		//*   4    6:ifeq            18
				return data.getInt(i);
		//    5    9:aload_0         
		//    6   10:getfield        #36  <Field ByteBuffer data>
		//    7   13:iload_1         
		//    8   14:invokevirtual   #55  <Method int ByteBuffer.getInt(int)>
		//    9   17:ireturn         
			else
				return -1;
		//   10   18:iconst_m1       
		//   11   19:ireturn         
		}

		int length()
		{
			return data.remaining();
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ByteBuffer data>
		//    2    4:invokevirtual   #43  <Method int ByteBuffer.remaining()>
		//    3    7:ireturn         
		}

		void order(ByteOrder byteorder)
		{
			data.order(byteorder);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ByteBuffer data>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #30  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//    4    8:pop             
		//    5    9:return          
		}

		private final ByteBuffer data;

		RandomAccessReader(byte abyte0[], int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			data = (ByteBuffer)ByteBuffer.wrap(abyte0).order(ByteOrder.BIG_ENDIAN).limit(i);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #20  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//    5    9:getstatic       #26  <Field ByteOrder ByteOrder.BIG_ENDIAN>
		//    6   12:invokevirtual   #30  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//    7   15:iload_2         
		//    8   16:invokevirtual   #34  <Method java.nio.Buffer ByteBuffer.limit(int)>
		//    9   19:checkcast       #16  <Class ByteBuffer>
		//   10   22:putfield        #36  <Field ByteBuffer data>
		//   11   25:return          
		}
	}

	static interface Reader
	{

		public abstract int getByte()
			throws IOException;

		public abstract int getUInt16()
			throws IOException;

		public abstract short getUInt8()
			throws IOException;

		public abstract int read(byte abyte0[], int i)
			throws IOException;

		public abstract long skip(long l)
			throws IOException;
	}

	static final class StreamReader
		implements Reader
	{

		public int getByte()
			throws IOException
		{
			return is.read();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream is>
		//    2    4:invokevirtual   #28  <Method int InputStream.read()>
		//    3    7:ireturn         
		}

		public int getUInt16()
			throws IOException
		{
			return is.read() << 8 & 0xff00 | is.read() & 0xff;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream is>
		//    2    4:invokevirtual   #28  <Method int InputStream.read()>
		//    3    7:bipush          8
		//    4    9:ishl            
		//    5   10:ldc1            #31  <Int 65280>
		//    6   12:iand            
		//    7   13:aload_0         
		//    8   14:getfield        #18  <Field InputStream is>
		//    9   17:invokevirtual   #28  <Method int InputStream.read()>
		//   10   20:sipush          255
		//   11   23:iand            
		//   12   24:ior             
		//   13   25:ireturn         
		}

		public short getUInt8()
			throws IOException
		{
			return (short)(is.read() & 0xff);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field InputStream is>
		//    2    4:invokevirtual   #28  <Method int InputStream.read()>
		//    3    7:sipush          255
		//    4   10:iand            
		//    5   11:int2short       
		//    6   12:ireturn         
		}

		public int read(byte abyte0[], int i)
			throws IOException
		{
			int j = i;
		//    0    0:iload_2         
		//    1    1:istore_3        
			do
			{
				if(j <= 0)
					break;
		//    2    2:iload_3         
		//    3    3:ifle            34
				int k = is.read(abyte0, i - j, j);
		//    4    6:aload_0         
		//    5    7:getfield        #18  <Field InputStream is>
		//    6   10:aload_1         
		//    7   11:iload_2         
		//    8   12:iload_3         
		//    9   13:isub            
		//   10   14:iload_3         
		//   11   15:invokevirtual   #37  <Method int InputStream.read(byte[], int, int)>
		//   12   18:istore          4
				if(k == -1)
					break;
		//   13   20:iload           4
		//   14   22:iconst_m1       
		//   15   23:icmpeq          34
				j -= k;
		//   16   26:iload_3         
		//   17   27:iload           4
		//   18   29:isub            
		//   19   30:istore_3        
			} while(true);
		//   20   31:goto            2
			return i - j;
		//   21   34:iload_2         
		//   22   35:iload_3         
		//   23   36:isub            
		//   24   37:ireturn         
		}

		public long skip(long l)
			throws IOException
		{
			if(l < 0L)
		//*   0    0:lload_1         
		//*   1    1:lconst_0        
		//*   2    2:lcmp            
		//*   3    3:ifge            8
				return 0L;
		//    4    6:lconst_0        
		//    5    7:lreturn         
			long l1 = l;
		//    6    8:lload_1         
		//    7    9:lstore_3        
			do
			{
				if(l1 <= 0L)
					break;
		//    8   10:lload_3         
		//    9   11:lconst_0        
		//   10   12:lcmp            
		//   11   13:ifle            62
				long l2 = is.skip(l1);
		//   12   16:aload_0         
		//   13   17:getfield        #18  <Field InputStream is>
		//   14   20:lload_3         
		//   15   21:invokevirtual   #41  <Method long InputStream.skip(long)>
		//   16   24:lstore          5
				if(l2 > 0L)
		//*  17   26:lload           5
		//*  18   28:lconst_0        
		//*  19   29:lcmp            
		//*  20   30:ifle            41
				{
					l1 -= l2;
		//   21   33:lload_3         
		//   22   34:lload           5
		//   23   36:lsub            
		//   24   37:lstore_3        
					continue;
		//   25   38:goto            59
				}
				if(is.read() == -1)
		//*  26   41:aload_0         
		//*  27   42:getfield        #18  <Field InputStream is>
		//*  28   45:invokevirtual   #28  <Method int InputStream.read()>
		//*  29   48:iconst_m1       
		//*  30   49:icmpne          55
					break;
		//   31   52:goto            62
				l1--;
		//   32   55:lload_3         
		//   33   56:lconst_1        
		//   34   57:lsub            
		//   35   58:lstore_3        
			} while(true);
		//   36   59:goto            10
			return l - l1;
		//   37   62:lload_1         
		//   38   63:lload_3         
		//   39   64:lsub            
		//   40   65:lreturn         
		}

		private final InputStream is;

		StreamReader(InputStream inputstream)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			is = inputstream;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field InputStream is>
		//    5    9:return          
		}
	}


	public DefaultImageHeaderParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void Object()>
	//    2    4:return          
	}

	private static int calcTagOffset(int i, int j)
	{
		return i + 2 + j * 12;
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:iadd            
	//    3    3:iload_1         
	//    4    4:bipush          12
	//    5    6:imul            
	//    6    7:iadd            
	//    7    8:ireturn         
	}

	private int getOrientation(Reader reader, ArrayPool arraypool)
		throws IOException
	{
		int i;
		byte abyte0[];
		i = reader.getUInt16();
	//    0    0:aload_1         
	//    1    1:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//    2    6:istore_3        
		if(!handles(i))
	//*   3    7:iload_3         
	//*   4    8:invokestatic    #105 <Method boolean handles(int)>
	//*   5   11:ifne            50
		{
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*   6   14:ldc1            #52  <String "DfltImageHeaderParser">
	//*   7   16:iconst_3        
	//*   8   17:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*   9   20:ifeq            48
				Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Parser doesn't handle magic number: ").append(i).toString());
	//   10   23:ldc1            #52  <String "DfltImageHeaderParser">
	//   11   25:new             #113 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #114 <Method void StringBuilder()>
	//   14   32:ldc1            #116 <String "Parser doesn't handle magic number: ">
	//   15   34:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:iload_3         
	//   17   38:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   18   41:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   19   44:invokestatic    #131 <Method int Log.d(String, String)>
	//   20   47:pop             
			return -1;
	//   21   48:iconst_m1       
	//   22   49:ireturn         
		}
		i = moveToExifSegmentAndGetLength(reader);
	//   23   50:aload_0         
	//   24   51:aload_1         
	//   25   52:invokespecial   #135 <Method int moveToExifSegmentAndGetLength(DefaultImageHeaderParser$Reader)>
	//   26   55:istore_3        
		if(i == -1)
	//*  27   56:iload_3         
	//*  28   57:iconst_m1       
	//*  29   58:icmpne          80
		{
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  30   61:ldc1            #52  <String "DfltImageHeaderParser">
	//*  31   63:iconst_3        
	//*  32   64:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  33   67:ifeq            78
				Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
	//   34   70:ldc1            #52  <String "DfltImageHeaderParser">
	//   35   72:ldc1            #137 <String "Failed to parse exif segment length, or exif segment not found">
	//   36   74:invokestatic    #131 <Method int Log.d(String, String)>
	//   37   77:pop             
			return -1;
	//   38   78:iconst_m1       
	//   39   79:ireturn         
		}
		abyte0 = (byte[])arraypool.get(i, [B);
	//   40   80:aload_2         
	//   41   81:iload_3         
	//   42   82:ldc1            #138 <Class byte[]>
	//   43   84:invokeinterface #144 <Method Object ArrayPool.get(int, Class)>
	//   44   89:checkcast       #138 <Class byte[]>
	//   45   92:astore          4
		i = parseExifSegment(reader, abyte0, i);
	//   46   94:aload_0         
	//   47   95:aload_1         
	//   48   96:aload           4
	//   49   98:iload_3         
	//   50   99:invokespecial   #148 <Method int parseExifSegment(DefaultImageHeaderParser$Reader, byte[], int)>
	//   51  102:istore_3        
		arraypool.put(((Object) (abyte0)), [B);
	//   52  103:aload_2         
	//   53  104:aload           4
	//   54  106:ldc1            #138 <Class byte[]>
	//   55  108:invokeinterface #152 <Method void ArrayPool.put(Object, Class)>
		return i;
	//   56  113:iload_3         
	//   57  114:ireturn         
		reader;
	//   58  115:astore_1        
		arraypool.put(((Object) (abyte0)), [B);
	//   59  116:aload_2         
	//   60  117:aload           4
	//   61  119:ldc1            #138 <Class byte[]>
	//   62  121:invokeinterface #152 <Method void ArrayPool.put(Object, Class)>
		throw reader;
	//   63  126:aload_1         
	//   64  127:athrow          
	}

	private com.bumptech.glide.load.ImageHeaderParser.ImageType getType(Reader reader)
		throws IOException
	{
		int i = reader.getUInt16();
	//    0    0:aload_1         
	//    1    1:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//    2    6:istore_2        
		if(i == 65496)
	//*   3    7:iload_2         
	//*   4    8:ldc1            #23  <Int 65496>
	//*   5   10:icmpne          17
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG;
	//    6   13:getstatic       #161 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG>
	//    7   16:areturn         
		i = i << 16 & 0xffff0000 | reader.getUInt16() & 0xffff;
	//    8   17:iload_2         
	//    9   18:bipush          16
	//   10   20:ishl            
	//   11   21:ldc1            #162 <Int 0xffff0000>
	//   12   23:iand            
	//   13   24:aload_1         
	//   14   25:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   15   30:ldc1            #163 <Int 65535>
	//   16   32:iand            
	//   17   33:ior             
	//   18   34:istore_2        
		if(i == 0x89504e47)
	//*  19   35:iload_2         
	//*  20   36:ldc1            #43  <Int 0x89504e47>
	//*  21   38:icmpne          69
		{
			reader.skip(21L);
	//   22   41:aload_1         
	//   23   42:ldc2w           #164 <Long 21L>
	//   24   45:invokeinterface #169 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   25   50:pop2            
			if(reader.getByte() >= 3)
	//*  26   51:aload_1         
	//*  27   52:invokeinterface #172 <Method int DefaultImageHeaderParser$Reader.getByte()>
	//*  28   57:iconst_3        
	//*  29   58:icmplt          65
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A;
	//   30   61:getstatic       #175 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A>
	//   31   64:areturn         
			else
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
	//   32   65:getstatic       #178 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG>
	//   33   68:areturn         
		}
		if(i >> 8 == 0x474946)
	//*  34   69:iload_2         
	//*  35   70:bipush          8
	//*  36   72:ishr            
	//*  37   73:ldc1            #27  <Int 0x474946>
	//*  38   75:icmpne          82
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF;
	//   39   78:getstatic       #181 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF>
	//   40   81:areturn         
		if(i != 0x52494646)
	//*  41   82:iload_2         
	//*  42   83:ldc1            #45  <Int 0x52494646>
	//*  43   85:icmpeq          92
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
	//   44   88:getstatic       #184 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//   45   91:areturn         
		reader.skip(4L);
	//   46   92:aload_1         
	//   47   93:ldc2w           #185 <Long 4L>
	//   48   96:invokeinterface #169 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   49  101:pop2            
		if((reader.getUInt16() << 16 & 0xffff0000 | reader.getUInt16() & 0xffff) != 0x57454250)
	//*  50  102:aload_1         
	//*  51  103:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//*  52  108:bipush          16
	//*  53  110:ishl            
	//*  54  111:ldc1            #162 <Int 0xffff0000>
	//*  55  113:iand            
	//*  56  114:aload_1         
	//*  57  115:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//*  58  120:ldc1            #163 <Int 65535>
	//*  59  122:iand            
	//*  60  123:ior             
	//*  61  124:ldc1            #65  <Int 0x57454250>
	//*  62  126:icmpeq          133
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
	//   63  129:getstatic       #184 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//   64  132:areturn         
		i = reader.getUInt16() << 16 & 0xffff0000 | reader.getUInt16() & 0xffff;
	//   65  133:aload_1         
	//   66  134:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   67  139:bipush          16
	//   68  141:ishl            
	//   69  142:ldc1            #162 <Int 0xffff0000>
	//   70  144:iand            
	//   71  145:aload_1         
	//   72  146:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   73  151:ldc1            #163 <Int 65535>
	//   74  153:iand            
	//   75  154:ior             
	//   76  155:istore_2        
		if((i & 0xffffff00) != 0x56503800)
	//*  77  156:iload_2         
	//*  78  157:sipush          -256
	//*  79  160:iand            
	//*  80  161:ldc1            #54  <Int 0x56503800>
	//*  81  163:icmpeq          170
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
	//   82  166:getstatic       #184 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//   83  169:areturn         
		if((i & 0xff) == 88)
	//*  84  170:iload_2         
	//*  85  171:sipush          255
	//*  86  174:iand            
	//*  87  175:bipush          88
	//*  88  177:icmpne          210
		{
			reader.skip(4L);
	//   89  180:aload_1         
	//   90  181:ldc2w           #185 <Long 4L>
	//   91  184:invokeinterface #169 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   92  189:pop2            
			if((reader.getByte() & 0x10) != 0)
	//*  93  190:aload_1         
	//*  94  191:invokeinterface #172 <Method int DefaultImageHeaderParser$Reader.getByte()>
	//*  95  196:bipush          16
	//*  96  198:iand            
	//*  97  199:ifeq            206
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A;
	//   98  202:getstatic       #189 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A>
	//   99  205:areturn         
			else
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;
	//  100  206:getstatic       #192 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP>
	//  101  209:areturn         
		}
		if((i & 0xff) == 76)
	//* 102  210:iload_2         
	//* 103  211:sipush          255
	//* 104  214:iand            
	//* 105  215:bipush          76
	//* 106  217:icmpne          250
		{
			reader.skip(4L);
	//  107  220:aload_1         
	//  108  221:ldc2w           #185 <Long 4L>
	//  109  224:invokeinterface #169 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//  110  229:pop2            
			if((reader.getByte() & 8) != 0)
	//* 111  230:aload_1         
	//* 112  231:invokeinterface #172 <Method int DefaultImageHeaderParser$Reader.getByte()>
	//* 113  236:bipush          8
	//* 114  238:iand            
	//* 115  239:ifeq            246
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A;
	//  116  242:getstatic       #189 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A>
	//  117  245:areturn         
			else
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;
	//  118  246:getstatic       #192 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP>
	//  119  249:areturn         
		} else
		{
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;
	//  120  250:getstatic       #192 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP>
	//  121  253:areturn         
		}
	}

	private static boolean handles(int i)
	{
		return (0xffd8 & i) == 65496 || i == 19789 || i == 18761;
	//    0    0:ldc1            #23  <Int 65496>
	//    1    2:iload_0         
	//    2    3:iand            
	//    3    4:ldc1            #23  <Int 65496>
	//    4    6:icmpeq          23
	//    5    9:iload_0         
	//    6   10:sipush          19789
	//    7   13:icmpeq          23
	//    8   16:iload_0         
	//    9   17:sipush          18761
	//   10   20:icmpne          25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private boolean hasJpegExifPreamble(byte abyte0[], int i)
	{
		boolean flag;
		if(abyte0 != null && i > JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length)
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:iload_2         
	//*   3    5:getstatic       #85  <Field byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES>
	//*   4    8:arraylength     
	//*   5    9:icmple          17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		if(flag)
	//*  11   19:iload_3         
	//*  12   20:ifeq            53
			for(i = 0; i < JPEG_EXIF_SEGMENT_PREAMBLE_BYTES.length; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_2        
	//*  15   25:iload_2         
	//*  16   26:getstatic       #85  <Field byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES>
	//*  17   29:arraylength     
	//*  18   30:icmpge          53
				if(abyte0[i] != JPEG_EXIF_SEGMENT_PREAMBLE_BYTES[i])
	//*  19   33:aload_1         
	//*  20   34:iload_2         
	//*  21   35:baload          
	//*  22   36:getstatic       #85  <Field byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES>
	//*  23   39:iload_2         
	//*  24   40:baload          
	//*  25   41:icmpeq          46
					return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         

	//   28   46:iload_2         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:istore_2        
	//*  32   50:goto            25
		return flag;
	//   33   53:iload_3         
	//   34   54:ireturn         
	}

	private int moveToExifSegmentAndGetLength(Reader reader)
		throws IOException
	{
		do
		{
			short word0 = reader.getUInt8();
	//    0    0:aload_1         
	//    1    1:invokeinterface #198 <Method short DefaultImageHeaderParser$Reader.getUInt8()>
	//    2    6:istore_2        
			if(word0 != 255)
	//*   3    7:iload_2         
	//*   4    8:sipush          255
	//*   5   11:icmpeq          50
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*   6   14:ldc1            #52  <String "DfltImageHeaderParser">
	//*   7   16:iconst_3        
	//*   8   17:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*   9   20:ifeq            48
					Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Unknown segmentId=").append(((int) (word0))).toString());
	//   10   23:ldc1            #52  <String "DfltImageHeaderParser">
	//   11   25:new             #113 <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #114 <Method void StringBuilder()>
	//   14   32:ldc1            #200 <String "Unknown segmentId=">
	//   15   34:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:iload_2         
	//   17   38:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   18   41:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   19   44:invokestatic    #131 <Method int Log.d(String, String)>
	//   20   47:pop             
				return -1;
	//   21   48:iconst_m1       
	//   22   49:ireturn         
			}
			word0 = reader.getUInt8();
	//   23   50:aload_1         
	//   24   51:invokeinterface #198 <Method short DefaultImageHeaderParser$Reader.getUInt8()>
	//   25   56:istore_2        
			if(word0 == 218)
	//*  26   57:iload_2         
	//*  27   58:sipush          218
	//*  28   61:icmpne          66
				return -1;
	//   29   64:iconst_m1       
	//   30   65:ireturn         
			if(word0 == 217)
	//*  31   66:iload_2         
	//*  32   67:sipush          217
	//*  33   70:icmpne          92
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  34   73:ldc1            #52  <String "DfltImageHeaderParser">
	//*  35   75:iconst_3        
	//*  36   76:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  37   79:ifeq            90
					Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
	//   38   82:ldc1            #52  <String "DfltImageHeaderParser">
	//   39   84:ldc1            #202 <String "Found MARKER_EOI in exif segment">
	//   40   86:invokestatic    #131 <Method int Log.d(String, String)>
	//   41   89:pop             
				return -1;
	//   42   90:iconst_m1       
	//   43   91:ireturn         
			}
			int i = reader.getUInt16() - 2;
	//   44   92:aload_1         
	//   45   93:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   46   98:iconst_2        
	//   47   99:isub            
	//   48  100:istore_3        
			if(word0 != 225)
	//*  49  101:iload_2         
	//*  50  102:sipush          225
	//*  51  105:icmpeq          184
			{
				long l = reader.skip(i);
	//   52  108:aload_1         
	//   53  109:iload_3         
	//   54  110:i2l             
	//   55  111:invokeinterface #169 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   56  116:lstore          4
				if(l != (long)i)
	//*  57  118:lload           4
	//*  58  120:iload_3         
	//*  59  121:i2l             
	//*  60  122:lcmp            
	//*  61  123:ifeq            181
				{
					if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  62  126:ldc1            #52  <String "DfltImageHeaderParser">
	//*  63  128:iconst_3        
	//*  64  129:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  65  132:ifeq            179
						Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Unable to skip enough data, type: ").append(((int) (word0))).append(", wanted to skip: ").append(i).append(", but actually skipped: ").append(l).toString());
	//   66  135:ldc1            #52  <String "DfltImageHeaderParser">
	//   67  137:new             #113 <Class StringBuilder>
	//   68  140:dup             
	//   69  141:invokespecial   #114 <Method void StringBuilder()>
	//   70  144:ldc1            #204 <String "Unable to skip enough data, type: ">
	//   71  146:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   72  149:iload_2         
	//   73  150:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   74  153:ldc1            #206 <String ", wanted to skip: ">
	//   75  155:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   76  158:iload_3         
	//   77  159:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   78  162:ldc1            #208 <String ", but actually skipped: ">
	//   79  164:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   80  167:lload           4
	//   81  169:invokevirtual   #211 <Method StringBuilder StringBuilder.append(long)>
	//   82  172:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   83  175:invokestatic    #131 <Method int Log.d(String, String)>
	//   84  178:pop             
					return -1;
	//   85  179:iconst_m1       
	//   86  180:ireturn         
				}
			} else
	//*  87  181:goto            0
			{
				return i;
	//   88  184:iload_3         
	//   89  185:ireturn         
			}
		} while(true);
	}

	private static int parseExifSegment(RandomAccessReader randomaccessreader)
	{
		int i = "Exif\000\0".length();
	//    0    0:ldc1            #33  <String "Exif\000\0">
	//    1    2:invokevirtual   #215 <Method int String.length()>
	//    2    5:istore_1        
		int k = ((int) (randomaccessreader.getInt16(i)));
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokevirtual   #219 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//    6   11:istore_2        
		ByteOrder byteorder;
		if(k == 19789)
	//*   7   12:iload_2         
	//*   8   13:sipush          19789
	//*   9   16:icmpne          27
			byteorder = ByteOrder.BIG_ENDIAN;
	//   10   19:getstatic       #225 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   11   22:astore          8
		else
	//*  12   24:goto            81
		if(k == 18761)
	//*  13   27:iload_2         
	//*  14   28:sipush          18761
	//*  15   31:icmpne          42
		{
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   16   34:getstatic       #228 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   17   37:astore          8
		} else
	//*  18   39:goto            81
		{
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  19   42:ldc1            #52  <String "DfltImageHeaderParser">
	//*  20   44:iconst_3        
	//*  21   45:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  22   48:ifeq            76
				Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Unknown endianness = ").append(k).toString());
	//   23   51:ldc1            #52  <String "DfltImageHeaderParser">
	//   24   53:new             #113 <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #114 <Method void StringBuilder()>
	//   27   60:ldc1            #230 <String "Unknown endianness = ">
	//   28   62:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   29   65:iload_2         
	//   30   66:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   31   69:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   32   72:invokestatic    #131 <Method int Log.d(String, String)>
	//   33   75:pop             
			byteorder = ByteOrder.BIG_ENDIAN;
	//   34   76:getstatic       #225 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   35   79:astore          8
		}
		randomaccessreader.order(byteorder);
	//   36   81:aload_0         
	//   37   82:aload           8
	//   38   84:invokevirtual   #234 <Method void DefaultImageHeaderParser$RandomAccessReader.order(ByteOrder)>
		k = randomaccessreader.getInt32(i + 4) + i;
	//   39   87:aload_0         
	//   40   88:iload_1         
	//   41   89:iconst_4        
	//   42   90:iadd            
	//   43   91:invokevirtual   #238 <Method int DefaultImageHeaderParser$RandomAccessReader.getInt32(int)>
	//   44   94:iload_1         
	//   45   95:iadd            
	//   46   96:istore_2        
		short word0 = randomaccessreader.getInt16(k);
	//   47   97:aload_0         
	//   48   98:iload_2         
	//   49   99:invokevirtual   #219 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//   50  102:istore_3        
		for(int j = 0; j < word0; j++)
	//*  51  103:iconst_0        
	//*  52  104:istore_1        
	//*  53  105:iload_1         
	//*  54  106:iload_3         
	//*  55  107:icmpge          491
		{
			int l = calcTagOffset(k, j);
	//   56  110:iload_2         
	//   57  111:iload_1         
	//   58  112:invokestatic    #240 <Method int calcTagOffset(int, int)>
	//   59  115:istore          5
			short word1 = randomaccessreader.getInt16(l);
	//   60  117:aload_0         
	//   61  118:iload           5
	//   62  120:invokevirtual   #219 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//   63  123:istore          4
			if(word1 != 274)
	//*  64  125:iload           4
	//*  65  127:sipush          274
	//*  66  130:icmpeq          136
				continue;
	//   67  133:goto            484
			short word2 = randomaccessreader.getInt16(l + 2);
	//   68  136:aload_0         
	//   69  137:iload           5
	//   70  139:iconst_2        
	//   71  140:iadd            
	//   72  141:invokevirtual   #219 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//   73  144:istore          6
			if(word2 < 1 || word2 > 12)
	//*  74  146:iload           6
	//*  75  148:iconst_1        
	//*  76  149:icmplt          159
	//*  77  152:iload           6
	//*  78  154:bipush          12
	//*  79  156:icmple          197
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  80  159:ldc1            #52  <String "DfltImageHeaderParser">
	//*  81  161:iconst_3        
	//*  82  162:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  83  165:ifeq            484
					Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Got invalid format code = ").append(((int) (word2))).toString());
	//   84  168:ldc1            #52  <String "DfltImageHeaderParser">
	//   85  170:new             #113 <Class StringBuilder>
	//   86  173:dup             
	//   87  174:invokespecial   #114 <Method void StringBuilder()>
	//   88  177:ldc1            #242 <String "Got invalid format code = ">
	//   89  179:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   90  182:iload           6
	//   91  184:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   92  187:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   93  190:invokestatic    #131 <Method int Log.d(String, String)>
	//   94  193:pop             
				continue;
	//   95  194:goto            484
			}
			int i1 = randomaccessreader.getInt32(l + 4);
	//   96  197:aload_0         
	//   97  198:iload           5
	//   98  200:iconst_4        
	//   99  201:iadd            
	//  100  202:invokevirtual   #238 <Method int DefaultImageHeaderParser$RandomAccessReader.getInt32(int)>
	//  101  205:istore          7
			if(i1 < 0)
	//* 102  207:iload           7
	//* 103  209:ifge            232
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 104  212:ldc1            #52  <String "DfltImageHeaderParser">
	//* 105  214:iconst_3        
	//* 106  215:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 107  218:ifeq            484
					Log.d("DfltImageHeaderParser", "Negative tiff component count");
	//  108  221:ldc1            #52  <String "DfltImageHeaderParser">
	//  109  223:ldc1            #244 <String "Negative tiff component count">
	//  110  225:invokestatic    #131 <Method int Log.d(String, String)>
	//  111  228:pop             
				continue;
	//  112  229:goto            484
			}
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 113  232:ldc1            #52  <String "DfltImageHeaderParser">
	//* 114  234:iconst_3        
	//* 115  235:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 116  238:ifeq            296
				Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Got tagIndex=").append(j).append(" tagType=").append(((int) (word1))).append(" formatCode=").append(((int) (word2))).append(" componentCount=").append(i1).toString());
	//  117  241:ldc1            #52  <String "DfltImageHeaderParser">
	//  118  243:new             #113 <Class StringBuilder>
	//  119  246:dup             
	//  120  247:invokespecial   #114 <Method void StringBuilder()>
	//  121  250:ldc1            #246 <String "Got tagIndex=">
	//  122  252:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  123  255:iload_1         
	//  124  256:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  125  259:ldc1            #248 <String " tagType=">
	//  126  261:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  127  264:iload           4
	//  128  266:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  129  269:ldc1            #250 <String " formatCode=">
	//  130  271:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  131  274:iload           6
	//  132  276:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  133  279:ldc1            #252 <String " componentCount=">
	//  134  281:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  135  284:iload           7
	//  136  286:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  137  289:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  138  292:invokestatic    #131 <Method int Log.d(String, String)>
	//  139  295:pop             
			i1 += BYTES_PER_FORMAT[word2];
	//  140  296:iload           7
	//  141  298:getstatic       #87  <Field int[] BYTES_PER_FORMAT>
	//  142  301:iload           6
	//  143  303:iaload          
	//  144  304:iadd            
	//  145  305:istore          7
			if(i1 > 4)
	//* 146  307:iload           7
	//* 147  309:iconst_4        
	//* 148  310:icmple          351
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 149  313:ldc1            #52  <String "DfltImageHeaderParser">
	//* 150  315:iconst_3        
	//* 151  316:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 152  319:ifeq            484
					Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Got byte count > 4, not orientation, continuing, formatCode=").append(((int) (word2))).toString());
	//  153  322:ldc1            #52  <String "DfltImageHeaderParser">
	//  154  324:new             #113 <Class StringBuilder>
	//  155  327:dup             
	//  156  328:invokespecial   #114 <Method void StringBuilder()>
	//  157  331:ldc1            #254 <String "Got byte count > 4, not orientation, continuing, formatCode=">
	//  158  333:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  159  336:iload           6
	//  160  338:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  161  341:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  162  344:invokestatic    #131 <Method int Log.d(String, String)>
	//  163  347:pop             
				continue;
	//  164  348:goto            484
			}
			l += 8;
	//  165  351:iload           5
	//  166  353:bipush          8
	//  167  355:iadd            
	//  168  356:istore          5
			if(l < 0 || l > randomaccessreader.length())
	//* 169  358:iload           5
	//* 170  360:iflt            372
	//* 171  363:iload           5
	//* 172  365:aload_0         
	//* 173  366:invokevirtual   #255 <Method int DefaultImageHeaderParser$RandomAccessReader.length()>
	//* 174  369:icmple          421
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 175  372:ldc1            #52  <String "DfltImageHeaderParser">
	//* 176  374:iconst_3        
	//* 177  375:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 178  378:ifeq            484
					Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Illegal tagValueOffset=").append(l).append(" tagType=").append(((int) (word1))).toString());
	//  179  381:ldc1            #52  <String "DfltImageHeaderParser">
	//  180  383:new             #113 <Class StringBuilder>
	//  181  386:dup             
	//  182  387:invokespecial   #114 <Method void StringBuilder()>
	//  183  390:ldc2            #257 <String "Illegal tagValueOffset=">
	//  184  393:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  185  396:iload           5
	//  186  398:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  187  401:ldc1            #248 <String " tagType=">
	//  188  403:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  189  406:iload           4
	//  190  408:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  191  411:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  192  414:invokestatic    #131 <Method int Log.d(String, String)>
	//  193  417:pop             
				continue;
	//  194  418:goto            484
			}
			if(i1 < 0 || l + i1 > randomaccessreader.length())
	//* 195  421:iload           7
	//* 196  423:iflt            438
	//* 197  426:iload           5
	//* 198  428:iload           7
	//* 199  430:iadd            
	//* 200  431:aload_0         
	//* 201  432:invokevirtual   #255 <Method int DefaultImageHeaderParser$RandomAccessReader.length()>
	//* 202  435:icmple          477
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 203  438:ldc1            #52  <String "DfltImageHeaderParser">
	//* 204  440:iconst_3        
	//* 205  441:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 206  444:ifeq            484
					Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Illegal number of bytes for TI tag data tagType=").append(((int) (word1))).toString());
	//  207  447:ldc1            #52  <String "DfltImageHeaderParser">
	//  208  449:new             #113 <Class StringBuilder>
	//  209  452:dup             
	//  210  453:invokespecial   #114 <Method void StringBuilder()>
	//  211  456:ldc2            #259 <String "Illegal number of bytes for TI tag data tagType=">
	//  212  459:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  213  462:iload           4
	//  214  464:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  215  467:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  216  470:invokestatic    #131 <Method int Log.d(String, String)>
	//  217  473:pop             
			} else
	//* 218  474:goto            484
			{
				return ((int) (randomaccessreader.getInt16(l)));
	//  219  477:aload_0         
	//  220  478:iload           5
	//  221  480:invokevirtual   #219 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//  222  483:ireturn         
			}
		}

	//  223  484:iload_1         
	//  224  485:iconst_1        
	//  225  486:iadd            
	//  226  487:istore_1        
	//* 227  488:goto            105
		return -1;
	//  228  491:iconst_m1       
	//  229  492:ireturn         
	}

	private int parseExifSegment(Reader reader, byte abyte0[], int i)
		throws IOException
	{
		int j = reader.read(abyte0, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokeinterface #263 <Method int DefaultImageHeaderParser$Reader.read(byte[], int)>
	//    4    8:istore          4
		if(j != i)
	//*   5   10:iload           4
	//*   6   12:iload_3         
	//*   7   13:icmpeq          64
		{
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*   8   16:ldc1            #52  <String "DfltImageHeaderParser">
	//*   9   18:iconst_3        
	//*  10   19:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            62
				Log.d("DfltImageHeaderParser", (new StringBuilder()).append("Unable to read exif segment data, length: ").append(i).append(", actually read: ").append(j).toString());
	//   12   25:ldc1            #52  <String "DfltImageHeaderParser">
	//   13   27:new             #113 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #114 <Method void StringBuilder()>
	//   16   34:ldc2            #265 <String "Unable to read exif segment data, length: ">
	//   17   37:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:iload_3         
	//   19   41:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   20   44:ldc2            #267 <String ", actually read: ">
	//   21   47:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:iload           4
	//   23   52:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   24   55:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   25   58:invokestatic    #131 <Method int Log.d(String, String)>
	//   26   61:pop             
			return -1;
	//   27   62:iconst_m1       
	//   28   63:ireturn         
		}
		if(hasJpegExifPreamble(abyte0, i))
	//*  29   64:aload_0         
	//*  30   65:aload_2         
	//*  31   66:iload_3         
	//*  32   67:invokespecial   #269 <Method boolean hasJpegExifPreamble(byte[], int)>
	//*  33   70:ifeq            86
			return parseExifSegment(new RandomAccessReader(abyte0, i));
	//   34   73:new             #11  <Class DefaultImageHeaderParser$RandomAccessReader>
	//   35   76:dup             
	//   36   77:aload_2         
	//   37   78:iload_3         
	//   38   79:invokespecial   #272 <Method void DefaultImageHeaderParser$RandomAccessReader(byte[], int)>
	//   39   82:invokestatic    #274 <Method int parseExifSegment(DefaultImageHeaderParser$RandomAccessReader)>
	//   40   85:ireturn         
		if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  41   86:ldc1            #52  <String "DfltImageHeaderParser">
	//*  42   88:iconst_3        
	//*  43   89:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  44   92:ifeq            104
			Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
	//   45   95:ldc1            #52  <String "DfltImageHeaderParser">
	//   46   97:ldc2            #276 <String "Missing jpeg exif preamble">
	//   47  100:invokestatic    #131 <Method int Log.d(String, String)>
	//   48  103:pop             
		return -1;
	//   49  104:iconst_m1       
	//   50  105:ireturn         
	}

	public int getOrientation(InputStream inputstream, ArrayPool arraypool)
		throws IOException
	{
		return getOrientation(((Reader) (new StreamReader((InputStream)Preconditions.checkNotNull(((Object) (inputstream)))))), (ArrayPool)Preconditions.checkNotNull(((Object) (arraypool))));
	//    0    0:aload_0         
	//    1    1:new             #17  <Class DefaultImageHeaderParser$StreamReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #283 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #285 <Class InputStream>
	//    6   12:invokespecial   #288 <Method void DefaultImageHeaderParser$StreamReader(InputStream)>
	//    7   15:aload_2         
	//    8   16:invokestatic    #283 <Method Object Preconditions.checkNotNull(Object)>
	//    9   19:checkcast       #140 <Class ArrayPool>
	//   10   22:invokespecial   #290 <Method int getOrientation(DefaultImageHeaderParser$Reader, ArrayPool)>
	//   11   25:ireturn         
	}

	public int getOrientation(ByteBuffer bytebuffer, ArrayPool arraypool)
		throws IOException
	{
		return getOrientation(((Reader) (new ByteBufferReader((ByteBuffer)Preconditions.checkNotNull(((Object) (bytebuffer)))))), (ArrayPool)Preconditions.checkNotNull(((Object) (arraypool))));
	//    0    0:aload_0         
	//    1    1:new             #8   <Class DefaultImageHeaderParser$ByteBufferReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #283 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #293 <Class ByteBuffer>
	//    6   12:invokespecial   #296 <Method void DefaultImageHeaderParser$ByteBufferReader(ByteBuffer)>
	//    7   15:aload_2         
	//    8   16:invokestatic    #283 <Method Object Preconditions.checkNotNull(Object)>
	//    9   19:checkcast       #140 <Class ArrayPool>
	//   10   22:invokespecial   #290 <Method int getOrientation(DefaultImageHeaderParser$Reader, ArrayPool)>
	//   11   25:ireturn         
	}

	public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(InputStream inputstream)
		throws IOException
	{
		return getType(((Reader) (new StreamReader((InputStream)Preconditions.checkNotNull(((Object) (inputstream)))))));
	//    0    0:aload_0         
	//    1    1:new             #17  <Class DefaultImageHeaderParser$StreamReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #283 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #285 <Class InputStream>
	//    6   12:invokespecial   #288 <Method void DefaultImageHeaderParser$StreamReader(InputStream)>
	//    7   15:invokespecial   #299 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType getType(DefaultImageHeaderParser$Reader)>
	//    8   18:areturn         
	}

	public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(ByteBuffer bytebuffer)
		throws IOException
	{
		return getType(((Reader) (new ByteBufferReader((ByteBuffer)Preconditions.checkNotNull(((Object) (bytebuffer)))))));
	//    0    0:aload_0         
	//    1    1:new             #8   <Class DefaultImageHeaderParser$ByteBufferReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #283 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #293 <Class ByteBuffer>
	//    6   12:invokespecial   #296 <Method void DefaultImageHeaderParser$ByteBufferReader(ByteBuffer)>
	//    7   15:invokespecial   #299 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType getType(DefaultImageHeaderParser$Reader)>
	//    8   18:areturn         
	}

	private static final int BYTES_PER_FORMAT[] = {
		0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
		8, 4, 8
	};
	static final int EXIF_MAGIC_NUMBER = 65496;
	static final int EXIF_SEGMENT_TYPE = 225;
	private static final int GIF_HEADER = 0x474946;
	private static final int INTEL_TIFF_MAGIC_NUMBER = 18761;
	static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\000\0";
	static final byte JPEG_EXIF_SEGMENT_PREAMBLE_BYTES[] = "Exif\000\0".getBytes(Charset.forName("UTF-8"));
	private static final int MARKER_EOI = 217;
	private static final int MOTOROLA_TIFF_MAGIC_NUMBER = 19789;
	private static final int ORIENTATION_TAG_TYPE = 274;
	private static final int PNG_HEADER = 0x89504e47;
	private static final int RIFF_HEADER = 0x52494646;
	private static final int SEGMENT_SOS = 218;
	static final int SEGMENT_START_ID = 255;
	private static final String TAG = "DfltImageHeaderParser";
	private static final int VP8_HEADER = 0x56503800;
	private static final int VP8_HEADER_MASK = -256;
	private static final int VP8_HEADER_TYPE_EXTENDED = 88;
	private static final int VP8_HEADER_TYPE_LOSSLESS = 76;
	private static final int VP8_HEADER_TYPE_MASK = 255;
	private static final int WEBP_EXTENDED_ALPHA_FLAG = 16;
	private static final int WEBP_HEADER = 0x57454250;
	private static final int WEBP_LOSSLESS_ALPHA_FLAG = 8;

	static 
	{
	//    0    0:ldc1            #33  <String "Exif\000\0">
	//    1    2:ldc1            #71  <String "UTF-8">
	//    2    4:invokestatic    #77  <Method Charset Charset.forName(String)>
	//    3    7:invokevirtual   #83  <Method byte[] String.getBytes(Charset)>
	//    4   10:putstatic       #85  <Field byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES>
	//    5   13:bipush          13
	//    6   15:newarray        int[]
	//    7   17:dup             
	//    8   18:iconst_0        
	//    9   19:iconst_0        
	//   10   20:iastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:iconst_1        
	//   14   24:iastore         
	//   15   25:dup             
	//   16   26:iconst_2        
	//   17   27:iconst_1        
	//   18   28:iastore         
	//   19   29:dup             
	//   20   30:iconst_3        
	//   21   31:iconst_2        
	//   22   32:iastore         
	//   23   33:dup             
	//   24   34:iconst_4        
	//   25   35:iconst_4        
	//   26   36:iastore         
	//   27   37:dup             
	//   28   38:iconst_5        
	//   29   39:bipush          8
	//   30   41:iastore         
	//   31   42:dup             
	//   32   43:bipush          6
	//   33   45:iconst_1        
	//   34   46:iastore         
	//   35   47:dup             
	//   36   48:bipush          7
	//   37   50:iconst_1        
	//   38   51:iastore         
	//   39   52:dup             
	//   40   53:bipush          8
	//   41   55:iconst_2        
	//   42   56:iastore         
	//   43   57:dup             
	//   44   58:bipush          9
	//   45   60:iconst_4        
	//   46   61:iastore         
	//   47   62:dup             
	//   48   63:bipush          10
	//   49   65:bipush          8
	//   50   67:iastore         
	//   51   68:dup             
	//   52   69:bipush          11
	//   53   71:iconst_4        
	//   54   72:iastore         
	//   55   73:dup             
	//   56   74:bipush          12
	//   57   76:bipush          8
	//   58   78:iastore         
	//   59   79:putstatic       #87  <Field int[] BYTES_PER_FORMAT>
	//*  60   82:return          
	}
}
