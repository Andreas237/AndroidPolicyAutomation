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
	private static final class ByteBufferReader
		implements Reader
	{

		public int getByte()
		{
			if(byteBuffer.remaining() < 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field ByteBuffer byteBuffer>
		//*   2    4:invokevirtual   #36  <Method int ByteBuffer.remaining()>
		//*   3    7:iconst_1        
		//*   4    8:icmpge          13
				return -1;
		//    5   11:iconst_m1       
		//    6   12:ireturn         
			else
				return ((int) (byteBuffer.get()));
		//    7   13:aload_0         
		//    8   14:getfield        #18  <Field ByteBuffer byteBuffer>
		//    9   17:invokevirtual   #40  <Method byte ByteBuffer.get()>
		//   10   20:ireturn         
		}

		public int getUInt16()
		{
			return getByte() << 8 & 0xff00 | getByte() & 0xff;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #43  <Method int getByte()>
		//    2    4:bipush          8
		//    3    6:ishl            
		//    4    7:ldc1            #44  <Int 65280>
		//    5    9:iand            
		//    6   10:aload_0         
		//    7   11:invokevirtual   #43  <Method int getByte()>
		//    8   14:sipush          255
		//    9   17:iand            
		//   10   18:ior             
		//   11   19:ireturn         
		}

		public short getUInt8()
		{
			return (short)(getByte() & 0xff);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #43  <Method int getByte()>
		//    2    4:sipush          255
		//    3    7:iand            
		//    4    8:int2short       
		//    5    9:ireturn         
		}

		public int read(byte abyte0[], int i)
		{
			i = Math.min(i, byteBuffer.remaining());
		//    0    0:iload_2         
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field ByteBuffer byteBuffer>
		//    3    5:invokevirtual   #36  <Method int ByteBuffer.remaining()>
		//    4    8:invokestatic    #54  <Method int Math.min(int, int)>
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
		//   15   25:invokevirtual   #57  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
		//   16   28:pop             
				return i;
		//   17   29:iload_2         
		//   18   30:ireturn         
			}
		}

		public long skip(long l)
		{
			int i = (int)Math.min(byteBuffer.remaining(), l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ByteBuffer byteBuffer>
		//    2    4:invokevirtual   #36  <Method int ByteBuffer.remaining()>
		//    3    7:i2l             
		//    4    8:lload_1         
		//    5    9:invokestatic    #62  <Method long Math.min(long, long)>
		//    6   12:l2i             
		//    7   13:istore_3        
			ByteBuffer bytebuffer = byteBuffer;
		//    8   14:aload_0         
		//    9   15:getfield        #18  <Field ByteBuffer byteBuffer>
		//   10   18:astore          4
			bytebuffer.position(bytebuffer.position() + i);
		//   11   20:aload           4
		//   12   22:aload           4
		//   13   24:invokevirtual   #65  <Method int ByteBuffer.position()>
		//   14   27:iload_3         
		//   15   28:iadd            
		//   16   29:invokevirtual   #68  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   17   32:pop             
			return (long)i;
		//   18   33:iload_3         
		//   19   34:i2l             
		//   20   35:lreturn         
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

	private static final class RandomAccessReader
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

	private static interface Reader
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

	private static final class StreamReader
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
		//   25   38:goto            10
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
	//*   5   11:ifne            56
		{
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*   6   14:ldc1            #52  <String "DfltImageHeaderParser">
	//*   7   16:iconst_3        
	//*   8   17:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*   9   20:ifeq            54
			{
				reader = ((Reader) (new StringBuilder()));
	//   10   23:new             #113 <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #114 <Method void StringBuilder()>
	//   13   30:astore_1        
				((StringBuilder) (reader)).append("Parser doesn't handle magic number: ");
	//   14   31:aload_1         
	//   15   32:ldc1            #116 <String "Parser doesn't handle magic number: ">
	//   16   34:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
				((StringBuilder) (reader)).append(i);
	//   18   38:aload_1         
	//   19   39:iload_3         
	//   20   40:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   21   43:pop             
				Log.d("DfltImageHeaderParser", ((StringBuilder) (reader)).toString());
	//   22   44:ldc1            #52  <String "DfltImageHeaderParser">
	//   23   46:aload_1         
	//   24   47:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   25   50:invokestatic    #131 <Method int Log.d(String, String)>
	//   26   53:pop             
			}
			return -1;
	//   27   54:iconst_m1       
	//   28   55:ireturn         
		}
		i = moveToExifSegmentAndGetLength(reader);
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:invokespecial   #135 <Method int moveToExifSegmentAndGetLength(DefaultImageHeaderParser$Reader)>
	//   32   61:istore_3        
		if(i == -1)
	//*  33   62:iload_3         
	//*  34   63:iconst_m1       
	//*  35   64:icmpne          86
		{
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  36   67:ldc1            #52  <String "DfltImageHeaderParser">
	//*  37   69:iconst_3        
	//*  38   70:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  39   73:ifeq            84
				Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
	//   40   76:ldc1            #52  <String "DfltImageHeaderParser">
	//   41   78:ldc1            #137 <String "Failed to parse exif segment length, or exif segment not found">
	//   42   80:invokestatic    #131 <Method int Log.d(String, String)>
	//   43   83:pop             
			return -1;
	//   44   84:iconst_m1       
	//   45   85:ireturn         
		}
		abyte0 = (byte[])arraypool.get(i, [B);
	//   46   86:aload_2         
	//   47   87:iload_3         
	//   48   88:ldc1            #138 <Class byte[]>
	//   49   90:invokeinterface #144 <Method Object ArrayPool.get(int, Class)>
	//   50   95:checkcast       #138 <Class byte[]>
	//   51   98:astore          4
		i = parseExifSegment(reader, abyte0, i);
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:aload           4
	//   55  104:iload_3         
	//   56  105:invokespecial   #148 <Method int parseExifSegment(DefaultImageHeaderParser$Reader, byte[], int)>
	//   57  108:istore_3        
		arraypool.put(((Object) (abyte0)));
	//   58  109:aload_2         
	//   59  110:aload           4
	//   60  112:invokeinterface #152 <Method void ArrayPool.put(Object)>
		return i;
	//   61  117:iload_3         
	//   62  118:ireturn         
		reader;
	//   63  119:astore_1        
		arraypool.put(((Object) (abyte0)));
	//   64  120:aload_2         
	//   65  121:aload           4
	//   66  123:invokeinterface #152 <Method void ArrayPool.put(Object)>
		throw reader;
	//   67  128:aload_1         
	//   68  129:athrow          
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
	//    6   13:getstatic       #162 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG>
	//    7   16:areturn         
		i = i << 16 & 0xffff0000 | reader.getUInt16() & 0xffff;
	//    8   17:iload_2         
	//    9   18:bipush          16
	//   10   20:ishl            
	//   11   21:ldc1            #163 <Int 0xffff0000>
	//   12   23:iand            
	//   13   24:aload_1         
	//   14   25:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   15   30:ldc1            #164 <Int 65535>
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
	//   23   42:ldc2w           #165 <Long 21L>
	//   24   45:invokeinterface #170 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   25   50:pop2            
			if(reader.getByte() >= 3)
	//*  26   51:aload_1         
	//*  27   52:invokeinterface #173 <Method int DefaultImageHeaderParser$Reader.getByte()>
	//*  28   57:iconst_3        
	//*  29   58:icmplt          65
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A;
	//   30   61:getstatic       #176 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A>
	//   31   64:areturn         
			else
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
	//   32   65:getstatic       #179 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG>
	//   33   68:areturn         
		}
		if(i >> 8 == 0x474946)
	//*  34   69:iload_2         
	//*  35   70:bipush          8
	//*  36   72:ishr            
	//*  37   73:ldc1            #27  <Int 0x474946>
	//*  38   75:icmpne          82
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF;
	//   39   78:getstatic       #182 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF>
	//   40   81:areturn         
		if(i != 0x52494646)
	//*  41   82:iload_2         
	//*  42   83:ldc1            #45  <Int 0x52494646>
	//*  43   85:icmpeq          92
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
	//   44   88:getstatic       #185 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//   45   91:areturn         
		reader.skip(4L);
	//   46   92:aload_1         
	//   47   93:ldc2w           #186 <Long 4L>
	//   48   96:invokeinterface #170 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   49  101:pop2            
		if((reader.getUInt16() << 16 & 0xffff0000 | reader.getUInt16() & 0xffff) != 0x57454250)
	//*  50  102:aload_1         
	//*  51  103:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//*  52  108:bipush          16
	//*  53  110:ishl            
	//*  54  111:ldc1            #163 <Int 0xffff0000>
	//*  55  113:iand            
	//*  56  114:aload_1         
	//*  57  115:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//*  58  120:ldc1            #164 <Int 65535>
	//*  59  122:iand            
	//*  60  123:ior             
	//*  61  124:ldc1            #65  <Int 0x57454250>
	//*  62  126:icmpeq          133
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
	//   63  129:getstatic       #185 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//   64  132:areturn         
		i = reader.getUInt16() << 16 & 0xffff0000 | reader.getUInt16() & 0xffff;
	//   65  133:aload_1         
	//   66  134:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   67  139:bipush          16
	//   68  141:ishl            
	//   69  142:ldc1            #163 <Int 0xffff0000>
	//   70  144:iand            
	//   71  145:aload_1         
	//   72  146:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   73  151:ldc1            #164 <Int 65535>
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
	//   82  166:getstatic       #185 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//   83  169:areturn         
		i &= 0xff;
	//   84  170:iload_2         
	//   85  171:sipush          255
	//   86  174:iand            
	//   87  175:istore_2        
		if(i == 88)
	//*  88  176:iload_2         
	//*  89  177:bipush          88
	//*  90  179:icmpne          212
		{
			reader.skip(4L);
	//   91  182:aload_1         
	//   92  183:ldc2w           #186 <Long 4L>
	//   93  186:invokeinterface #170 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   94  191:pop2            
			if((reader.getByte() & 0x10) != 0)
	//*  95  192:aload_1         
	//*  96  193:invokeinterface #173 <Method int DefaultImageHeaderParser$Reader.getByte()>
	//*  97  198:bipush          16
	//*  98  200:iand            
	//*  99  201:ifeq            208
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A;
	//  100  204:getstatic       #190 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A>
	//  101  207:areturn         
			else
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;
	//  102  208:getstatic       #193 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP>
	//  103  211:areturn         
		}
		if(i == 76)
	//* 104  212:iload_2         
	//* 105  213:bipush          76
	//* 106  215:icmpne          248
		{
			reader.skip(4L);
	//  107  218:aload_1         
	//  108  219:ldc2w           #186 <Long 4L>
	//  109  222:invokeinterface #170 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//  110  227:pop2            
			if((reader.getByte() & 8) != 0)
	//* 111  228:aload_1         
	//* 112  229:invokeinterface #173 <Method int DefaultImageHeaderParser$Reader.getByte()>
	//* 113  234:bipush          8
	//* 114  236:iand            
	//* 115  237:ifeq            244
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A;
	//  116  240:getstatic       #190 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A>
	//  117  243:areturn         
			else
				return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;
	//  118  244:getstatic       #193 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP>
	//  119  247:areturn         
		} else
		{
			return com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;
	//  120  248:getstatic       #193 <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP>
	//  121  251:areturn         
		}
	}

	private static boolean handles(int i)
	{
		return (i & 0xffd8) == 65496 || i == 19789 || i == 18761;
	//    0    0:iload_0         
	//    1    1:ldc1            #23  <Int 65496>
	//    2    3:iand            
	//    3    4:ldc1            #23  <Int 65496>
	//    4    6:icmpeq          28
	//    5    9:iload_0         
	//    6   10:sipush          19789
	//    7   13:icmpeq          28
	//    8   16:iload_0         
	//    9   17:sipush          18761
	//   10   20:icmpne          26
	//   11   23:goto            28
	//   12   26:iconst_0        
	//   13   27:ireturn         
	//   14   28:iconst_1        
	//   15   29:ireturn         
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
	//*  12   20:ifeq            56
		{
			i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_2        
			do
			{
				byte abyte1[] = JPEG_EXIF_SEGMENT_PREAMBLE_BYTES;
	//   15   25:getstatic       #85  <Field byte[] JPEG_EXIF_SEGMENT_PREAMBLE_BYTES>
	//   16   28:astore          4
				if(i >= abyte1.length)
					break;
	//   17   30:iload_2         
	//   18   31:aload           4
	//   19   33:arraylength     
	//   20   34:icmpge          56
				if(abyte0[i] != abyte1[i])
	//*  21   37:aload_1         
	//*  22   38:iload_2         
	//*  23   39:baload          
	//*  24   40:aload           4
	//*  25   42:iload_2         
	//*  26   43:baload          
	//*  27   44:icmpeq          49
					return false;
	//   28   47:iconst_0        
	//   29   48:ireturn         
				i++;
	//   30   49:iload_2         
	//   31   50:iconst_1        
	//   32   51:iadd            
	//   33   52:istore_2        
			} while(true);
	//   34   53:goto            25
		}
		return flag;
	//   35   56:iload_3         
	//   36   57:ireturn         
	}

	private int moveToExifSegmentAndGetLength(Reader reader)
		throws IOException
	{
		do
		{
			short word0 = reader.getUInt8();
	//    0    0:aload_1         
	//    1    1:invokeinterface #200 <Method short DefaultImageHeaderParser$Reader.getUInt8()>
	//    2    6:istore_2        
			if(word0 != 255)
	//*   3    7:iload_2         
	//*   4    8:sipush          255
	//*   5   11:icmpeq          56
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*   6   14:ldc1            #52  <String "DfltImageHeaderParser">
	//*   7   16:iconst_3        
	//*   8   17:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*   9   20:ifeq            54
				{
					reader = ((Reader) (new StringBuilder()));
	//   10   23:new             #113 <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #114 <Method void StringBuilder()>
	//   13   30:astore_1        
					((StringBuilder) (reader)).append("Unknown segmentId=");
	//   14   31:aload_1         
	//   15   32:ldc1            #202 <String "Unknown segmentId=">
	//   16   34:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
					((StringBuilder) (reader)).append(((int) (word0)));
	//   18   38:aload_1         
	//   19   39:iload_2         
	//   20   40:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   21   43:pop             
					Log.d("DfltImageHeaderParser", ((StringBuilder) (reader)).toString());
	//   22   44:ldc1            #52  <String "DfltImageHeaderParser">
	//   23   46:aload_1         
	//   24   47:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   25   50:invokestatic    #131 <Method int Log.d(String, String)>
	//   26   53:pop             
				}
				return -1;
	//   27   54:iconst_m1       
	//   28   55:ireturn         
			}
			word0 = reader.getUInt8();
	//   29   56:aload_1         
	//   30   57:invokeinterface #200 <Method short DefaultImageHeaderParser$Reader.getUInt8()>
	//   31   62:istore_2        
			if(word0 == 218)
	//*  32   63:iload_2         
	//*  33   64:sipush          218
	//*  34   67:icmpne          72
				return -1;
	//   35   70:iconst_m1       
	//   36   71:ireturn         
			if(word0 == 217)
	//*  37   72:iload_2         
	//*  38   73:sipush          217
	//*  39   76:icmpne          98
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  40   79:ldc1            #52  <String "DfltImageHeaderParser">
	//*  41   81:iconst_3        
	//*  42   82:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  43   85:ifeq            96
					Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
	//   44   88:ldc1            #52  <String "DfltImageHeaderParser">
	//   45   90:ldc1            #204 <String "Found MARKER_EOI in exif segment">
	//   46   92:invokestatic    #131 <Method int Log.d(String, String)>
	//   47   95:pop             
				return -1;
	//   48   96:iconst_m1       
	//   49   97:ireturn         
			}
			int i = reader.getUInt16() - 2;
	//   50   98:aload_1         
	//   51   99:invokeinterface #101 <Method int DefaultImageHeaderParser$Reader.getUInt16()>
	//   52  104:iconst_2        
	//   53  105:isub            
	//   54  106:istore_3        
			if(word0 != 225)
	//*  55  107:iload_2         
	//*  56  108:sipush          225
	//*  57  111:icmpeq          205
			{
				long l = i;
	//   58  114:iload_3         
	//   59  115:i2l             
	//   60  116:lstore          4
				long l1 = reader.skip(l);
	//   61  118:aload_1         
	//   62  119:lload           4
	//   63  121:invokeinterface #170 <Method long DefaultImageHeaderParser$Reader.skip(long)>
	//   64  126:lstore          6
				if(l1 != l)
	//*  65  128:lload           6
	//*  66  130:lload           4
	//*  67  132:lcmp            
	//*  68  133:ifeq            0
				{
					if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  69  136:ldc1            #52  <String "DfltImageHeaderParser">
	//*  70  138:iconst_3        
	//*  71  139:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  72  142:ifeq            203
					{
						reader = ((Reader) (new StringBuilder()));
	//   73  145:new             #113 <Class StringBuilder>
	//   74  148:dup             
	//   75  149:invokespecial   #114 <Method void StringBuilder()>
	//   76  152:astore_1        
						((StringBuilder) (reader)).append("Unable to skip enough data, type: ");
	//   77  153:aload_1         
	//   78  154:ldc1            #206 <String "Unable to skip enough data, type: ">
	//   79  156:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   80  159:pop             
						((StringBuilder) (reader)).append(((int) (word0)));
	//   81  160:aload_1         
	//   82  161:iload_2         
	//   83  162:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   84  165:pop             
						((StringBuilder) (reader)).append(", wanted to skip: ");
	//   85  166:aload_1         
	//   86  167:ldc1            #208 <String ", wanted to skip: ">
	//   87  169:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   88  172:pop             
						((StringBuilder) (reader)).append(i);
	//   89  173:aload_1         
	//   90  174:iload_3         
	//   91  175:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   92  178:pop             
						((StringBuilder) (reader)).append(", but actually skipped: ");
	//   93  179:aload_1         
	//   94  180:ldc1            #210 <String ", but actually skipped: ">
	//   95  182:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   96  185:pop             
						((StringBuilder) (reader)).append(l1);
	//   97  186:aload_1         
	//   98  187:lload           6
	//   99  189:invokevirtual   #213 <Method StringBuilder StringBuilder.append(long)>
	//  100  192:pop             
						Log.d("DfltImageHeaderParser", ((StringBuilder) (reader)).toString());
	//  101  193:ldc1            #52  <String "DfltImageHeaderParser">
	//  102  195:aload_1         
	//  103  196:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  104  199:invokestatic    #131 <Method int Log.d(String, String)>
	//  105  202:pop             
					}
					return -1;
	//  106  203:iconst_m1       
	//  107  204:ireturn         
				}
			} else
			{
				return i;
	//  108  205:iload_3         
	//  109  206:ireturn         
			}
		} while(true);
	}

	private static int parseExifSegment(RandomAccessReader randomaccessreader)
	{
		short word0 = randomaccessreader.getInt16(6);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:invokevirtual   #218 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//    3    6:istore_1        
		ByteOrder byteorder;
		if(word0 != 18761)
	//*   4    7:iload_1         
	//*   5    8:sipush          18761
	//*   6   11:icmpeq          81
		{
			if(word0 != 19789)
	//*   7   14:iload_1         
	//*   8   15:sipush          19789
	//*   9   18:icmpeq          73
			{
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  10   21:ldc1            #52  <String "DfltImageHeaderParser">
	//*  11   23:iconst_3        
	//*  12   24:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  13   27:ifeq            65
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   14   30:new             #113 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #114 <Method void StringBuilder()>
	//   17   37:astore          8
					stringbuilder.append("Unknown endianness = ");
	//   18   39:aload           8
	//   19   41:ldc1            #220 <String "Unknown endianness = ">
	//   20   43:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:pop             
					stringbuilder.append(((int) (word0)));
	//   22   47:aload           8
	//   23   49:iload_1         
	//   24   50:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   25   53:pop             
					Log.d("DfltImageHeaderParser", stringbuilder.toString());
	//   26   54:ldc1            #52  <String "DfltImageHeaderParser">
	//   27   56:aload           8
	//   28   58:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   29   61:invokestatic    #131 <Method int Log.d(String, String)>
	//   30   64:pop             
				}
				byteorder = ByteOrder.BIG_ENDIAN;
	//   31   65:getstatic       #226 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   32   68:astore          8
			} else
	//*  33   70:goto            86
			{
				byteorder = ByteOrder.BIG_ENDIAN;
	//   34   73:getstatic       #226 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   35   76:astore          8
			}
		} else
	//*  36   78:goto            86
		{
			byteorder = ByteOrder.LITTLE_ENDIAN;
	//   37   81:getstatic       #229 <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   38   84:astore          8
		}
		randomaccessreader.order(byteorder);
	//   39   86:aload_0         
	//   40   87:aload           8
	//   41   89:invokevirtual   #233 <Method void DefaultImageHeaderParser$RandomAccessReader.order(ByteOrder)>
		int j = randomaccessreader.getInt32(10) + 6;
	//   42   92:aload_0         
	//   43   93:bipush          10
	//   44   95:invokevirtual   #237 <Method int DefaultImageHeaderParser$RandomAccessReader.getInt32(int)>
	//   45   98:bipush          6
	//   46  100:iadd            
	//   47  101:istore_2        
		short word1 = randomaccessreader.getInt16(j);
	//   48  102:aload_0         
	//   49  103:iload_2         
	//   50  104:invokevirtual   #218 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//   51  107:istore_3        
		for(int i = 0; i < word1; i++)
	//*  52  108:iconst_0        
	//*  53  109:istore_1        
	//*  54  110:iload_1         
	//*  55  111:iload_3         
	//*  56  112:icmpge          577
		{
			int k = calcTagOffset(j, i);
	//   57  115:iload_2         
	//   58  116:iload_1         
	//   59  117:invokestatic    #239 <Method int calcTagOffset(int, int)>
	//   60  120:istore          5
			short word2 = randomaccessreader.getInt16(k);
	//   61  122:aload_0         
	//   62  123:iload           5
	//   63  125:invokevirtual   #218 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//   64  128:istore          4
			if(word2 != 274)
	//*  65  130:iload           4
	//*  66  132:sipush          274
	//*  67  135:icmpeq          141
				continue;
	//   68  138:goto            570
			short word3 = randomaccessreader.getInt16(k + 2);
	//   69  141:aload_0         
	//   70  142:iload           5
	//   71  144:iconst_2        
	//   72  145:iadd            
	//   73  146:invokevirtual   #218 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//   74  149:istore          6
			if(word3 >= 1 && word3 <= 12)
	//*  75  151:iload           6
	//*  76  153:iconst_1        
	//*  77  154:icmplt          524
	//*  78  157:iload           6
	//*  79  159:bipush          12
	//*  80  161:icmple          167
	//*  81  164:goto            524
			{
				int l = randomaccessreader.getInt32(k + 4);
	//   82  167:aload_0         
	//   83  168:iload           5
	//   84  170:iconst_4        
	//   85  171:iadd            
	//   86  172:invokevirtual   #237 <Method int DefaultImageHeaderParser$RandomAccessReader.getInt32(int)>
	//   87  175:istore          7
				if(l < 0)
	//*  88  177:iload           7
	//*  89  179:ifge            202
				{
					if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  90  182:ldc1            #52  <String "DfltImageHeaderParser">
	//*  91  184:iconst_3        
	//*  92  185:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  93  188:ifeq            570
						Log.d("DfltImageHeaderParser", "Negative tiff component count");
	//   94  191:ldc1            #52  <String "DfltImageHeaderParser">
	//   95  193:ldc1            #241 <String "Negative tiff component count">
	//   96  195:invokestatic    #131 <Method int Log.d(String, String)>
	//   97  198:pop             
					continue;
	//   98  199:goto            570
				}
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  99  202:ldc1            #52  <String "DfltImageHeaderParser">
	//* 100  204:iconst_3        
	//* 101  205:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 102  208:ifeq            294
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//  103  211:new             #113 <Class StringBuilder>
	//  104  214:dup             
	//  105  215:invokespecial   #114 <Method void StringBuilder()>
	//  106  218:astore          8
					stringbuilder1.append("Got tagIndex=");
	//  107  220:aload           8
	//  108  222:ldc1            #243 <String "Got tagIndex=">
	//  109  224:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  110  227:pop             
					stringbuilder1.append(i);
	//  111  228:aload           8
	//  112  230:iload_1         
	//  113  231:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  114  234:pop             
					stringbuilder1.append(" tagType=");
	//  115  235:aload           8
	//  116  237:ldc1            #245 <String " tagType=">
	//  117  239:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  118  242:pop             
					stringbuilder1.append(((int) (word2)));
	//  119  243:aload           8
	//  120  245:iload           4
	//  121  247:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  122  250:pop             
					stringbuilder1.append(" formatCode=");
	//  123  251:aload           8
	//  124  253:ldc1            #247 <String " formatCode=">
	//  125  255:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  126  258:pop             
					stringbuilder1.append(((int) (word3)));
	//  127  259:aload           8
	//  128  261:iload           6
	//  129  263:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  130  266:pop             
					stringbuilder1.append(" componentCount=");
	//  131  267:aload           8
	//  132  269:ldc1            #249 <String " componentCount=">
	//  133  271:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  134  274:pop             
					stringbuilder1.append(l);
	//  135  275:aload           8
	//  136  277:iload           7
	//  137  279:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  138  282:pop             
					Log.d("DfltImageHeaderParser", stringbuilder1.toString());
	//  139  283:ldc1            #52  <String "DfltImageHeaderParser">
	//  140  285:aload           8
	//  141  287:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  142  290:invokestatic    #131 <Method int Log.d(String, String)>
	//  143  293:pop             
				}
				l += BYTES_PER_FORMAT[word3];
	//  144  294:iload           7
	//  145  296:getstatic       #87  <Field int[] BYTES_PER_FORMAT>
	//  146  299:iload           6
	//  147  301:iaload          
	//  148  302:iadd            
	//  149  303:istore          7
				if(l > 4)
	//* 150  305:iload           7
	//* 151  307:iconst_4        
	//* 152  308:icmple          359
				{
					if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 153  311:ldc1            #52  <String "DfltImageHeaderParser">
	//* 154  313:iconst_3        
	//* 155  314:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 156  317:ifeq            570
					{
						StringBuilder stringbuilder2 = new StringBuilder();
	//  157  320:new             #113 <Class StringBuilder>
	//  158  323:dup             
	//  159  324:invokespecial   #114 <Method void StringBuilder()>
	//  160  327:astore          8
						stringbuilder2.append("Got byte count > 4, not orientation, continuing, formatCode=");
	//  161  329:aload           8
	//  162  331:ldc1            #251 <String "Got byte count > 4, not orientation, continuing, formatCode=">
	//  163  333:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  164  336:pop             
						stringbuilder2.append(((int) (word3)));
	//  165  337:aload           8
	//  166  339:iload           6
	//  167  341:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  168  344:pop             
						Log.d("DfltImageHeaderParser", stringbuilder2.toString());
	//  169  345:ldc1            #52  <String "DfltImageHeaderParser">
	//  170  347:aload           8
	//  171  349:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  172  352:invokestatic    #131 <Method int Log.d(String, String)>
	//  173  355:pop             
					}
					continue;
	//  174  356:goto            570
				}
				k += 8;
	//  175  359:iload           5
	//  176  361:bipush          8
	//  177  363:iadd            
	//  178  364:istore          5
				if(k >= 0 && k <= randomaccessreader.length())
	//* 179  366:iload           5
	//* 180  368:iflt            459
	//* 181  371:iload           5
	//* 182  373:aload_0         
	//* 183  374:invokevirtual   #254 <Method int DefaultImageHeaderParser$RandomAccessReader.length()>
	//* 184  377:icmple          383
	//* 185  380:goto            459
				{
					if(l >= 0 && l + k <= randomaccessreader.length())
	//* 186  383:iload           7
	//* 187  385:iflt            410
	//* 188  388:iload           7
	//* 189  390:iload           5
	//* 190  392:iadd            
	//* 191  393:aload_0         
	//* 192  394:invokevirtual   #254 <Method int DefaultImageHeaderParser$RandomAccessReader.length()>
	//* 193  397:icmple          403
	//* 194  400:goto            410
						return ((int) (randomaccessreader.getInt16(k)));
	//  195  403:aload_0         
	//  196  404:iload           5
	//  197  406:invokevirtual   #218 <Method short DefaultImageHeaderParser$RandomAccessReader.getInt16(int)>
	//  198  409:ireturn         
					if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 199  410:ldc1            #52  <String "DfltImageHeaderParser">
	//* 200  412:iconst_3        
	//* 201  413:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 202  416:ifeq            570
					{
						StringBuilder stringbuilder3 = new StringBuilder();
	//  203  419:new             #113 <Class StringBuilder>
	//  204  422:dup             
	//  205  423:invokespecial   #114 <Method void StringBuilder()>
	//  206  426:astore          8
						stringbuilder3.append("Illegal number of bytes for TI tag data tagType=");
	//  207  428:aload           8
	//  208  430:ldc2            #256 <String "Illegal number of bytes for TI tag data tagType=">
	//  209  433:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  210  436:pop             
						stringbuilder3.append(((int) (word2)));
	//  211  437:aload           8
	//  212  439:iload           4
	//  213  441:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  214  444:pop             
						Log.d("DfltImageHeaderParser", stringbuilder3.toString());
	//  215  445:ldc1            #52  <String "DfltImageHeaderParser">
	//  216  447:aload           8
	//  217  449:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  218  452:invokestatic    #131 <Method int Log.d(String, String)>
	//  219  455:pop             
					}
					continue;
	//  220  456:goto            570
				}
				if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 221  459:ldc1            #52  <String "DfltImageHeaderParser">
	//* 222  461:iconst_3        
	//* 223  462:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 224  465:ifeq            570
				{
					StringBuilder stringbuilder4 = new StringBuilder();
	//  225  468:new             #113 <Class StringBuilder>
	//  226  471:dup             
	//  227  472:invokespecial   #114 <Method void StringBuilder()>
	//  228  475:astore          8
					stringbuilder4.append("Illegal tagValueOffset=");
	//  229  477:aload           8
	//  230  479:ldc2            #258 <String "Illegal tagValueOffset=">
	//  231  482:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  232  485:pop             
					stringbuilder4.append(k);
	//  233  486:aload           8
	//  234  488:iload           5
	//  235  490:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  236  493:pop             
					stringbuilder4.append(" tagType=");
	//  237  494:aload           8
	//  238  496:ldc1            #245 <String " tagType=">
	//  239  498:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  240  501:pop             
					stringbuilder4.append(((int) (word2)));
	//  241  502:aload           8
	//  242  504:iload           4
	//  243  506:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  244  509:pop             
					Log.d("DfltImageHeaderParser", stringbuilder4.toString());
	//  245  510:ldc1            #52  <String "DfltImageHeaderParser">
	//  246  512:aload           8
	//  247  514:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  248  517:invokestatic    #131 <Method int Log.d(String, String)>
	//  249  520:pop             
				}
				continue;
	//  250  521:goto            570
			}
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//* 251  524:ldc1            #52  <String "DfltImageHeaderParser">
	//* 252  526:iconst_3        
	//* 253  527:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//* 254  530:ifeq            570
			{
				StringBuilder stringbuilder5 = new StringBuilder();
	//  255  533:new             #113 <Class StringBuilder>
	//  256  536:dup             
	//  257  537:invokespecial   #114 <Method void StringBuilder()>
	//  258  540:astore          8
				stringbuilder5.append("Got invalid format code = ");
	//  259  542:aload           8
	//  260  544:ldc2            #260 <String "Got invalid format code = ">
	//  261  547:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  262  550:pop             
				stringbuilder5.append(((int) (word3)));
	//  263  551:aload           8
	//  264  553:iload           6
	//  265  555:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//  266  558:pop             
				Log.d("DfltImageHeaderParser", stringbuilder5.toString());
	//  267  559:ldc1            #52  <String "DfltImageHeaderParser">
	//  268  561:aload           8
	//  269  563:invokevirtual   #127 <Method String StringBuilder.toString()>
	//  270  566:invokestatic    #131 <Method int Log.d(String, String)>
	//  271  569:pop             
			}
		}

	//  272  570:iload_1         
	//  273  571:iconst_1        
	//  274  572:iadd            
	//  275  573:istore_1        
	//* 276  574:goto            110
		return -1;
	//  277  577:iconst_m1       
	//  278  578:ireturn         
	}

	private int parseExifSegment(Reader reader, byte abyte0[], int i)
		throws IOException
	{
		int j = reader.read(abyte0, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokeinterface #264 <Method int DefaultImageHeaderParser$Reader.read(byte[], int)>
	//    4    8:istore          4
		if(j != i)
	//*   5   10:iload           4
	//*   6   12:iload_3         
	//*   7   13:icmpeq          74
		{
			if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*   8   16:ldc1            #52  <String "DfltImageHeaderParser">
	//*   9   18:iconst_3        
	//*  10   19:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  11   22:ifeq            72
			{
				reader = ((Reader) (new StringBuilder()));
	//   12   25:new             #113 <Class StringBuilder>
	//   13   28:dup             
	//   14   29:invokespecial   #114 <Method void StringBuilder()>
	//   15   32:astore_1        
				((StringBuilder) (reader)).append("Unable to read exif segment data, length: ");
	//   16   33:aload_1         
	//   17   34:ldc2            #266 <String "Unable to read exif segment data, length: ">
	//   18   37:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
				((StringBuilder) (reader)).append(i);
	//   20   41:aload_1         
	//   21   42:iload_3         
	//   22   43:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   23   46:pop             
				((StringBuilder) (reader)).append(", actually read: ");
	//   24   47:aload_1         
	//   25   48:ldc2            #268 <String ", actually read: ">
	//   26   51:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
				((StringBuilder) (reader)).append(j);
	//   28   55:aload_1         
	//   29   56:iload           4
	//   30   58:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   31   61:pop             
				Log.d("DfltImageHeaderParser", ((StringBuilder) (reader)).toString());
	//   32   62:ldc1            #52  <String "DfltImageHeaderParser">
	//   33   64:aload_1         
	//   34   65:invokevirtual   #127 <Method String StringBuilder.toString()>
	//   35   68:invokestatic    #131 <Method int Log.d(String, String)>
	//   36   71:pop             
			}
			return -1;
	//   37   72:iconst_m1       
	//   38   73:ireturn         
		}
		if(hasJpegExifPreamble(abyte0, i))
	//*  39   74:aload_0         
	//*  40   75:aload_2         
	//*  41   76:iload_3         
	//*  42   77:invokespecial   #270 <Method boolean hasJpegExifPreamble(byte[], int)>
	//*  43   80:ifeq            96
			return parseExifSegment(new RandomAccessReader(abyte0, i));
	//   44   83:new             #11  <Class DefaultImageHeaderParser$RandomAccessReader>
	//   45   86:dup             
	//   46   87:aload_2         
	//   47   88:iload_3         
	//   48   89:invokespecial   #273 <Method void DefaultImageHeaderParser$RandomAccessReader(byte[], int)>
	//   49   92:invokestatic    #275 <Method int parseExifSegment(DefaultImageHeaderParser$RandomAccessReader)>
	//   50   95:ireturn         
		if(Log.isLoggable("DfltImageHeaderParser", 3))
	//*  51   96:ldc1            #52  <String "DfltImageHeaderParser">
	//*  52   98:iconst_3        
	//*  53   99:invokestatic    #111 <Method boolean Log.isLoggable(String, int)>
	//*  54  102:ifeq            114
			Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
	//   55  105:ldc1            #52  <String "DfltImageHeaderParser">
	//   56  107:ldc2            #277 <String "Missing jpeg exif preamble">
	//   57  110:invokestatic    #131 <Method int Log.d(String, String)>
	//   58  113:pop             
		return -1;
	//   59  114:iconst_m1       
	//   60  115:ireturn         
	}

	public int getOrientation(InputStream inputstream, ArrayPool arraypool)
		throws IOException
	{
		return getOrientation(((Reader) (new StreamReader((InputStream)Preconditions.checkNotNull(((Object) (inputstream)))))), (ArrayPool)Preconditions.checkNotNull(((Object) (arraypool))));
	//    0    0:aload_0         
	//    1    1:new             #17  <Class DefaultImageHeaderParser$StreamReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokestatic    #284 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #286 <Class InputStream>
	//    6   12:invokespecial   #289 <Method void DefaultImageHeaderParser$StreamReader(InputStream)>
	//    7   15:aload_2         
	//    8   16:invokestatic    #284 <Method Object Preconditions.checkNotNull(Object)>
	//    9   19:checkcast       #140 <Class ArrayPool>
	//   10   22:invokespecial   #291 <Method int getOrientation(DefaultImageHeaderParser$Reader, ArrayPool)>
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
	//    4    6:invokestatic    #284 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #295 <Class ByteBuffer>
	//    6   12:invokespecial   #298 <Method void DefaultImageHeaderParser$ByteBufferReader(ByteBuffer)>
	//    7   15:aload_2         
	//    8   16:invokestatic    #284 <Method Object Preconditions.checkNotNull(Object)>
	//    9   19:checkcast       #140 <Class ArrayPool>
	//   10   22:invokespecial   #291 <Method int getOrientation(DefaultImageHeaderParser$Reader, ArrayPool)>
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
	//    4    6:invokestatic    #284 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #286 <Class InputStream>
	//    6   12:invokespecial   #289 <Method void DefaultImageHeaderParser$StreamReader(InputStream)>
	//    7   15:invokespecial   #301 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType getType(DefaultImageHeaderParser$Reader)>
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
	//    4    6:invokestatic    #284 <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #295 <Class ByteBuffer>
	//    6   12:invokespecial   #298 <Method void DefaultImageHeaderParser$ByteBufferReader(ByteBuffer)>
	//    7   15:invokespecial   #301 <Method com.bumptech.glide.load.ImageHeaderParser$ImageType getType(DefaultImageHeaderParser$Reader)>
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
	private static final String JPEG_EXIF_SEGMENT_PREAMBLE = "Exif\000\0";
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
