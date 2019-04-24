// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			CodedInputStream, UnsafeUtil, InvalidProtocolBufferException, Internal, 
//			ByteString, Parser, MessageLite, WireFormat, 
//			Utf8, ExtensionRegistryLite, CodedOutputStream

static final class CodedInputStream$UnsafeDirectNioDecoder extends CodedInputStream
{

	private int bufferPos(long l)
	{
		return (int)(l - address);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field long address>
	//    3    5:lsub            
	//    4    6:l2i             
	//    5    7:ireturn         
	}

	static boolean isSupported()
	{
		return UnsafeUtil.hasUnsafeByteBufferOperations();
	//    0    0:invokestatic    #64  <Method boolean UnsafeUtil.hasUnsafeByteBufferOperations()>
	//    1    3:ireturn         
	}

	private void recomputeBufferSizeAfterLimit()
	{
		limit = limit + (long)bufferSizeAfterLimit;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #44  <Field long limit>
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field int bufferSizeAfterLimit>
	//    5    9:i2l             
	//    6   10:ladd            
	//    7   11:putfield        #44  <Field long limit>
		int i = (int)(limit - startPos);
	//    8   14:aload_0         
	//    9   15:getfield        #44  <Field long limit>
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field long startPos>
	//   12   22:lsub            
	//   13   23:l2i             
	//   14   24:istore_1        
		if(i > currentLimit)
	//*  15   25:iload_1         
	//*  16   26:aload_0         
	//*  17   27:getfield        #27  <Field int currentLimit>
	//*  18   30:icmple          58
		{
			bufferSizeAfterLimit = i - currentLimit;
	//   19   33:aload_0         
	//   20   34:iload_1         
	//   21   35:aload_0         
	//   22   36:getfield        #27  <Field int currentLimit>
	//   23   39:isub            
	//   24   40:putfield        #68  <Field int bufferSizeAfterLimit>
			limit = limit - (long)bufferSizeAfterLimit;
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #44  <Field long limit>
	//   28   48:aload_0         
	//   29   49:getfield        #68  <Field int bufferSizeAfterLimit>
	//   30   52:i2l             
	//   31   53:lsub            
	//   32   54:putfield        #44  <Field long limit>
			return;
	//   33   57:return          
		} else
		{
			bufferSizeAfterLimit = 0;
	//   34   58:aload_0         
	//   35   59:iconst_0        
	//   36   60:putfield        #68  <Field int bufferSizeAfterLimit>
			return;
	//   37   63:return          
		}
	}

	private int remaining()
	{
		return (int)(limit - pos);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long limit>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field long pos>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	private void skipRawVarint()
		throws IOException
	{
		if(remaining() >= 10)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #74  <Method int remaining()>
	//*   2    4:bipush          10
	//*   3    6:icmplt          14
		{
			skipRawVarintFastPath();
	//    4    9:aload_0         
	//    5   10:invokespecial   #77  <Method void skipRawVarintFastPath()>
			return;
	//    6   13:return          
		} else
		{
			skipRawVarintSlowPath();
	//    7   14:aload_0         
	//    8   15:invokespecial   #80  <Method void skipRawVarintSlowPath()>
			return;
	//    9   18:return          
		}
	}

	private void skipRawVarintFastPath()
		throws IOException
	{
		for(int i = 0; i < 10; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          10
	//*   4    5:icmpge          35
		{
			long l = pos;
	//    5    8:aload_0         
	//    6    9:getfield        #49  <Field long pos>
	//    7   12:lstore_2        
			pos = 1L + l;
	//    8   13:aload_0         
	//    9   14:lconst_1        
	//   10   15:lload_2         
	//   11   16:ladd            
	//   12   17:putfield        #49  <Field long pos>
			if(UnsafeUtil.getByte(l) >= 0)
	//*  13   20:lload_2         
	//*  14   21:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//*  15   24:iflt            28
				return;
	//   16   27:return          
		}

	//   17   28:iload_1         
	//   18   29:iconst_1        
	//   19   30:iadd            
	//   20   31:istore_1        
	//*  21   32:goto            2
		throw InvalidProtocolBufferException.malformedVarint();
	//   22   35:invokestatic    #91  <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   23   38:athrow          
	}

	private void skipRawVarintSlowPath()
		throws IOException
	{
		for(int i = 0; i < 10; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          10
	//*   4    5:icmpge          23
			if(readRawByte() >= 0)
	//*   5    8:aload_0         
	//*   6    9:invokevirtual   #95  <Method byte readRawByte()>
	//*   7   12:iflt            16
				return;
	//    8   15:return          

	//    9   16:iload_1         
	//   10   17:iconst_1        
	//   11   18:iadd            
	//   12   19:istore_1        
	//*  13   20:goto            2
		throw InvalidProtocolBufferException.malformedVarint();
	//   14   23:invokestatic    #91  <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   15   26:athrow          
	}

	private ByteBuffer slice(long l, long l1)
		throws IOException
	{
		int i;
		int j;
		i = buffer.position();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ByteBuffer buffer>
	//    2    4:invokevirtual   #47  <Method int ByteBuffer.position()>
	//    3    7:istore          5
		j = buffer.limit();
	//    4    9:aload_0         
	//    5   10:getfield        #29  <Field ByteBuffer buffer>
	//    6   13:invokevirtual   #42  <Method int ByteBuffer.limit()>
	//    7   16:istore          6
		ByteBuffer bytebuffer;
		buffer.position(bufferPos(l));
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field ByteBuffer buffer>
	//   10   22:aload_0         
	//   11   23:lload_1         
	//   12   24:invokespecial   #101 <Method int bufferPos(long)>
	//   13   27:invokevirtual   #104 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   14   30:pop             
		buffer.limit(bufferPos(l1));
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field ByteBuffer buffer>
	//   17   35:aload_0         
	//   18   36:lload_3         
	//   19   37:invokespecial   #101 <Method int bufferPos(long)>
	//   20   40:invokevirtual   #106 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   21   43:pop             
		bytebuffer = buffer.slice();
	//   22   44:aload_0         
	//   23   45:getfield        #29  <Field ByteBuffer buffer>
	//   24   48:invokevirtual   #109 <Method ByteBuffer ByteBuffer.slice()>
	//   25   51:astore          7
		buffer.position(i);
	//   26   53:aload_0         
	//   27   54:getfield        #29  <Field ByteBuffer buffer>
	//   28   57:iload           5
	//   29   59:invokevirtual   #104 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   30   62:pop             
		buffer.limit(j);
	//   31   63:aload_0         
	//   32   64:getfield        #29  <Field ByteBuffer buffer>
	//   33   67:iload           6
	//   34   69:invokevirtual   #106 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   35   72:pop             
		return bytebuffer;
	//   36   73:aload           7
	//   37   75:areturn         
		Object obj;
		obj;
	//   38   76:astore          7
		throw InvalidProtocolBufferException.truncatedMessage();
	//   39   78:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   40   81:athrow          
		obj;
	//   41   82:astore          7
		buffer.position(i);
	//   42   84:aload_0         
	//   43   85:getfield        #29  <Field ByteBuffer buffer>
	//   44   88:iload           5
	//   45   90:invokevirtual   #104 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   46   93:pop             
		buffer.limit(j);
	//   47   94:aload_0         
	//   48   95:getfield        #29  <Field ByteBuffer buffer>
	//   49   98:iload           6
	//   50  100:invokevirtual   #106 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   51  103:pop             
		throw obj;
	//   52  104:aload           7
	//   53  106:athrow          
	}

	public void checkLastTagWas(int i)
		throws InvalidProtocolBufferException
	{
		if(lastTag != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field int lastTag>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			throw InvalidProtocolBufferException.invalidEndTag();
	//    4    8:invokestatic    #119 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidEndTag()>
	//    5   11:athrow          
		else
			return;
	//    6   12:return          
	}

	public void enableAliasing(boolean flag)
	{
		enableAliasing = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #122 <Field boolean enableAliasing>
	//    3    5:return          
	}

	public int getBytesUntilLimit()
	{
		if(currentLimit == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field int currentLimit>
	//*   2    4:ldc1            #25  <Int 0x7fffffff>
	//*   3    6:icmpne          11
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		else
			return currentLimit - getTotalBytesRead();
	//    6   11:aload_0         
	//    7   12:getfield        #27  <Field int currentLimit>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #126 <Method int getTotalBytesRead()>
	//   10   19:isub            
	//   11   20:ireturn         
	}

	public int getLastTag()
	{
		return lastTag;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int lastTag>
	//    2    4:ireturn         
	}

	public int getTotalBytesRead()
	{
		return (int)(pos - startPos);
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long pos>
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field long startPos>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	public boolean isAtEnd()
		throws IOException
	{
		return pos == limit;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long pos>
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field long limit>
	//    4    8:lcmp            
	//    5    9:ifne            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void popLimit(int i)
	{
		currentLimit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #27  <Field int currentLimit>
		recomputeBufferSizeAfterLimit();
	//    3    5:aload_0         
	//    4    6:invokespecial   #131 <Method void recomputeBufferSizeAfterLimit()>
	//    5    9:return          
	}

	public int pushLimit(int i)
		throws InvalidProtocolBufferException
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw InvalidProtocolBufferException.negativeSize();
	//    2    4:invokestatic    #136 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//    3    7:athrow          
		i += getTotalBytesRead();
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #126 <Method int getTotalBytesRead()>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = currentLimit;
	//    9   15:aload_0         
	//   10   16:getfield        #27  <Field int currentLimit>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   15   25:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   16   28:athrow          
		} else
		{
			currentLimit = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #27  <Field int currentLimit>
			recomputeBufferSizeAfterLimit();
	//   20   34:aload_0         
	//   21   35:invokespecial   #131 <Method void recomputeBufferSizeAfterLimit()>
			return j;
	//   22   38:iload_2         
	//   23   39:ireturn         
		}
	}

	public boolean readBool()
		throws IOException
	{
		return readRawVarint64() != 0L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method long readRawVarint64()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public byte[] readByteArray()
		throws IOException
	{
		return readRawBytes(readRawVarint32());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #146 <Method int readRawVarint32()>
	//    3    5:invokevirtual   #150 <Method byte[] readRawBytes(int)>
	//    4    8:areturn         
	}

	public ByteBuffer readByteBuffer()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && i <= remaining())
	//*   3    5:iload_1         
	//*   4    6:ifle            91
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #74  <Method int remaining()>
	//*   8   14:icmpgt          91
			if(!immutable && enableAliasing)
	//*   9   17:aload_0         
	//*  10   18:getfield        #53  <Field boolean immutable>
	//*  11   21:ifne            60
	//*  12   24:aload_0         
	//*  13   25:getfield        #122 <Field boolean enableAliasing>
	//*  14   28:ifeq            60
			{
				ByteBuffer bytebuffer = slice(pos, pos + (long)i);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #49  <Field long pos>
	//   18   36:aload_0         
	//   19   37:getfield        #49  <Field long pos>
	//   20   40:iload_1         
	//   21   41:i2l             
	//   22   42:ladd            
	//   23   43:invokespecial   #153 <Method ByteBuffer slice(long, long)>
	//   24   46:astore_2        
				pos = pos + (long)i;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #49  <Field long pos>
	//   28   52:iload_1         
	//   29   53:i2l             
	//   30   54:ladd            
	//   31   55:putfield        #49  <Field long pos>
				return bytebuffer;
	//   32   58:aload_2         
	//   33   59:areturn         
			} else
			{
				byte abyte0[] = new byte[i];
	//   34   60:iload_1         
	//   35   61:newarray        byte[]
	//   36   63:astore_2        
				UnsafeUtil.copyMemory(pos, abyte0, 0L, i);
	//   37   64:aload_0         
	//   38   65:getfield        #49  <Field long pos>
	//   39   68:aload_2         
	//   40   69:lconst_0        
	//   41   70:iload_1         
	//   42   71:i2l             
	//   43   72:invokestatic    #157 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
				pos = pos + (long)i;
	//   44   75:aload_0         
	//   45   76:aload_0         
	//   46   77:getfield        #49  <Field long pos>
	//   47   80:iload_1         
	//   48   81:i2l             
	//   49   82:ladd            
	//   50   83:putfield        #49  <Field long pos>
				return ByteBuffer.wrap(abyte0);
	//   51   86:aload_2         
	//   52   87:invokestatic    #161 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   53   90:areturn         
			}
		if(i == 0)
	//*  54   91:iload_1         
	//*  55   92:ifne            99
			return Internal.EMPTY_BYTE_BUFFER;
	//   56   95:getstatic       #166 <Field ByteBuffer Internal.EMPTY_BYTE_BUFFER>
	//   57   98:areturn         
		if(i < 0)
	//*  58   99:iload_1         
	//*  59  100:ifge            107
			throw InvalidProtocolBufferException.negativeSize();
	//   60  103:invokestatic    #136 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   61  106:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   62  107:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   63  110:athrow          
	}

	public ByteString readBytes()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && i <= remaining())
	//*   3    5:iload_1         
	//*   4    6:ifle            94
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #74  <Method int remaining()>
	//*   8   14:icmpgt          94
			if(immutable && enableAliasing)
	//*   9   17:aload_0         
	//*  10   18:getfield        #53  <Field boolean immutable>
	//*  11   21:ifeq            63
	//*  12   24:aload_0         
	//*  13   25:getfield        #122 <Field boolean enableAliasing>
	//*  14   28:ifeq            63
			{
				ByteBuffer bytebuffer = slice(pos, pos + (long)i);
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #49  <Field long pos>
	//   18   36:aload_0         
	//   19   37:getfield        #49  <Field long pos>
	//   20   40:iload_1         
	//   21   41:i2l             
	//   22   42:ladd            
	//   23   43:invokespecial   #153 <Method ByteBuffer slice(long, long)>
	//   24   46:astore_2        
				pos = pos + (long)i;
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #49  <Field long pos>
	//   28   52:iload_1         
	//   29   53:i2l             
	//   30   54:ladd            
	//   31   55:putfield        #49  <Field long pos>
				return ByteString.wrap(bytebuffer);
	//   32   58:aload_2         
	//   33   59:invokestatic    #173 <Method ByteString ByteString.wrap(ByteBuffer)>
	//   34   62:areturn         
			} else
			{
				byte abyte0[] = new byte[i];
	//   35   63:iload_1         
	//   36   64:newarray        byte[]
	//   37   66:astore_2        
				UnsafeUtil.copyMemory(pos, abyte0, 0L, i);
	//   38   67:aload_0         
	//   39   68:getfield        #49  <Field long pos>
	//   40   71:aload_2         
	//   41   72:lconst_0        
	//   42   73:iload_1         
	//   43   74:i2l             
	//   44   75:invokestatic    #157 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
				pos = pos + (long)i;
	//   45   78:aload_0         
	//   46   79:aload_0         
	//   47   80:getfield        #49  <Field long pos>
	//   48   83:iload_1         
	//   49   84:i2l             
	//   50   85:ladd            
	//   51   86:putfield        #49  <Field long pos>
				return ByteString.wrap(abyte0);
	//   52   89:aload_2         
	//   53   90:invokestatic    #176 <Method ByteString ByteString.wrap(byte[])>
	//   54   93:areturn         
			}
		if(i == 0)
	//*  55   94:iload_1         
	//*  56   95:ifne            102
			return ByteString.EMPTY;
	//   57   98:getstatic       #180 <Field ByteString ByteString.EMPTY>
	//   58  101:areturn         
		if(i < 0)
	//*  59  102:iload_1         
	//*  60  103:ifge            110
			throw InvalidProtocolBufferException.negativeSize();
	//   61  106:invokestatic    #136 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   62  109:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   63  110:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   64  113:athrow          
	}

	public double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(readRawLittleEndian64());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method long readRawLittleEndian64()>
	//    2    4:invokestatic    #191 <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public int readEnum()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public int readFixed32()
		throws IOException
	{
		return readRawLittleEndian32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #196 <Method int readRawLittleEndian32()>
	//    2    4:ireturn         
	}

	public long readFixed64()
		throws IOException
	{
		return readRawLittleEndian64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method long readRawLittleEndian64()>
	//    2    4:lreturn         
	}

	public float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(readRawLittleEndian32());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #196 <Method int readRawLittleEndian32()>
	//    2    4:invokestatic    #205 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		if(recursionDepth >= recursionLimit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field int recursionDepth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #213 <Field int recursionLimit>
	//*   4    8:icmplt          15
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    5   11:invokestatic    #216 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    6   14:athrow          
		} else
		{
			recursionDepth = recursionDepth + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #210 <Field int recursionDepth>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #210 <Field int recursionDepth>
			parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokeinterface #222 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//   17   33:checkcast       #224 <Class MessageLite>
	//   18   36:astore_2        
			checkLastTagWas(WireFormat.makeTag(i, 4));
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:iconst_4        
	//   22   40:invokestatic    #230 <Method int WireFormat.makeTag(int, int)>
	//   23   43:invokevirtual   #232 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #210 <Field int recursionDepth>
	//   27   51:iconst_1        
	//   28   52:isub            
	//   29   53:putfield        #210 <Field int recursionDepth>
			return ((MessageLite) (parser));
	//   30   56:aload_2         
	//   31   57:areturn         
		}
	}

	public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		if(recursionDepth >= recursionLimit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field int recursionDepth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #213 <Field int recursionLimit>
	//*   4    8:icmplt          15
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    5   11:invokestatic    #216 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    6   14:athrow          
		} else
		{
			recursionDepth = recursionDepth + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #210 <Field int recursionDepth>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #210 <Field int recursionDepth>
			builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokeinterface #241 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//   17   33:pop             
			checkLastTagWas(WireFormat.makeTag(i, 4));
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:iconst_4        
	//   21   37:invokestatic    #230 <Method int WireFormat.makeTag(int, int)>
	//   22   40:invokevirtual   #232 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #210 <Field int recursionDepth>
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:putfield        #210 <Field int recursionDepth>
			return;
	//   29   53:return          
		}
	}

	public int readInt32()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public long readInt64()
		throws IOException
	{
		return readRawVarint64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method long readRawVarint64()>
	//    2    4:lreturn         
	}

	public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:istore_3        
		if(recursionDepth >= recursionLimit)
	//*   3    5:aload_0         
	//*   4    6:getfield        #210 <Field int recursionDepth>
	//*   5    9:aload_0         
	//*   6   10:getfield        #213 <Field int recursionLimit>
	//*   7   13:icmplt          20
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    8   16:invokestatic    #216 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    9   19:athrow          
		} else
		{
			i = pushLimit(i);
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #247 <Method int pushLimit(int)>
	//   13   25:istore_3        
			recursionDepth = recursionDepth + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #210 <Field int recursionDepth>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #210 <Field int recursionDepth>
			parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokeinterface #222 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//   24   44:checkcast       #224 <Class MessageLite>
	//   25   47:astore_1        
			checkLastTagWas(0);
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #232 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #210 <Field int recursionDepth>
	//   32   58:iconst_1        
	//   33   59:isub            
	//   34   60:putfield        #210 <Field int recursionDepth>
			popLimit(i);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:invokevirtual   #249 <Method void popLimit(int)>
			return ((MessageLite) (parser));
	//   38   68:aload_1         
	//   39   69:areturn         
		}
	}

	public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:istore_3        
		if(recursionDepth >= recursionLimit)
	//*   3    5:aload_0         
	//*   4    6:getfield        #210 <Field int recursionDepth>
	//*   5    9:aload_0         
	//*   6   10:getfield        #213 <Field int recursionLimit>
	//*   7   13:icmplt          20
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    8   16:invokestatic    #216 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    9   19:athrow          
		} else
		{
			i = pushLimit(i);
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #247 <Method int pushLimit(int)>
	//   13   25:istore_3        
			recursionDepth = recursionDepth + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #210 <Field int recursionDepth>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #210 <Field int recursionDepth>
			builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokeinterface #241 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//   24   44:pop             
			checkLastTagWas(0);
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #232 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   28   50:aload_0         
	//   29   51:aload_0         
	//   30   52:getfield        #210 <Field int recursionDepth>
	//   31   55:iconst_1        
	//   32   56:isub            
	//   33   57:putfield        #210 <Field int recursionDepth>
			popLimit(i);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:invokevirtual   #249 <Method void popLimit(int)>
			return;
	//   37   65:return          
		}
	}

	public byte readRawByte()
		throws IOException
	{
		if(pos == limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field long pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #44  <Field long limit>
	//*   4    8:lcmp            
	//*   5    9:ifne            16
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//    6   12:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//    7   15:athrow          
		} else
		{
			long l = pos;
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field long pos>
	//   10   20:lstore_1        
			pos = 1L + l;
	//   11   21:aload_0         
	//   12   22:lconst_1        
	//   13   23:lload_1         
	//   14   24:ladd            
	//   15   25:putfield        #49  <Field long pos>
			return UnsafeUtil.getByte(l);
	//   16   28:lload_1         
	//   17   29:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   18   32:ireturn         
		}
	}

	public byte[] readRawBytes(int i)
		throws IOException
	{
		if(i >= 0 && i <= remaining())
	//*   0    0:iload_1         
	//*   1    1:iflt            49
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #74  <Method int remaining()>
	//*   5    9:icmpgt          49
		{
			byte abyte0[] = new byte[i];
	//    6   12:iload_1         
	//    7   13:newarray        byte[]
	//    8   15:astore_2        
			slice(pos, pos + (long)i).get(abyte0);
	//    9   16:aload_0         
	//   10   17:aload_0         
	//   11   18:getfield        #49  <Field long pos>
	//   12   21:aload_0         
	//   13   22:getfield        #49  <Field long pos>
	//   14   25:iload_1         
	//   15   26:i2l             
	//   16   27:ladd            
	//   17   28:invokespecial   #153 <Method ByteBuffer slice(long, long)>
	//   18   31:aload_2         
	//   19   32:invokevirtual   #254 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   20   35:pop             
			pos = pos + (long)i;
	//   21   36:aload_0         
	//   22   37:aload_0         
	//   23   38:getfield        #49  <Field long pos>
	//   24   41:iload_1         
	//   25   42:i2l             
	//   26   43:ladd            
	//   27   44:putfield        #49  <Field long pos>
			return abyte0;
	//   28   47:aload_2         
	//   29   48:areturn         
		}
		if(i <= 0)
	//*  30   49:iload_1         
	//*  31   50:ifgt            65
		{
			if(i == 0)
	//*  32   53:iload_1         
	//*  33   54:ifne            61
				return Internal.EMPTY_BYTE_ARRAY;
	//   34   57:getstatic       #258 <Field byte[] Internal.EMPTY_BYTE_ARRAY>
	//   35   60:areturn         
			else
				throw InvalidProtocolBufferException.negativeSize();
	//   36   61:invokestatic    #136 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   37   64:athrow          
		} else
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   38   65:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   39   68:athrow          
		}
	}

	public int readRawLittleEndian32()
		throws IOException
	{
		long l = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long pos>
	//    2    4:lstore_1        
		if(limit - l < 4L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field long limit>
	//*   5    9:lload_1         
	//*   6   10:lsub            
	//*   7   11:ldc2w           #259 <Long 4L>
	//*   8   14:lcmp            
	//*   9   15:ifge            22
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   10   18:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   11   21:athrow          
		} else
		{
			pos = 4L + l;
	//   12   22:aload_0         
	//   13   23:ldc2w           #259 <Long 4L>
	//   14   26:lload_1         
	//   15   27:ladd            
	//   16   28:putfield        #49  <Field long pos>
			return UnsafeUtil.getByte(l) & 0xff | (UnsafeUtil.getByte(1L + l) & 0xff) << 8 | (UnsafeUtil.getByte(2L + l) & 0xff) << 16 | (UnsafeUtil.getByte(3L + l) & 0xff) << 24;
	//   17   31:lload_1         
	//   18   32:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   19   35:sipush          255
	//   20   38:iand            
	//   21   39:lconst_1        
	//   22   40:lload_1         
	//   23   41:ladd            
	//   24   42:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   25   45:sipush          255
	//   26   48:iand            
	//   27   49:bipush          8
	//   28   51:ishl            
	//   29   52:ior             
	//   30   53:ldc2w           #261 <Long 2L>
	//   31   56:lload_1         
	//   32   57:ladd            
	//   33   58:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   34   61:sipush          255
	//   35   64:iand            
	//   36   65:bipush          16
	//   37   67:ishl            
	//   38   68:ior             
	//   39   69:ldc2w           #263 <Long 3L>
	//   40   72:lload_1         
	//   41   73:ladd            
	//   42   74:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   43   77:sipush          255
	//   44   80:iand            
	//   45   81:bipush          24
	//   46   83:ishl            
	//   47   84:ior             
	//   48   85:ireturn         
		}
	}

	public long readRawLittleEndian64()
		throws IOException
	{
		long l = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long pos>
	//    2    4:lstore_1        
		if(limit - l < 8L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field long limit>
	//*   5    9:lload_1         
	//*   6   10:lsub            
	//*   7   11:ldc2w           #265 <Long 8L>
	//*   8   14:lcmp            
	//*   9   15:ifge            22
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   10   18:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   11   21:athrow          
		} else
		{
			pos = 8L + l;
	//   12   22:aload_0         
	//   13   23:ldc2w           #265 <Long 8L>
	//   14   26:lload_1         
	//   15   27:ladd            
	//   16   28:putfield        #49  <Field long pos>
			return (long)UnsafeUtil.getByte(l) & 255L | ((long)UnsafeUtil.getByte(1L + l) & 255L) << 8 | ((long)UnsafeUtil.getByte(2L + l) & 255L) << 16 | ((long)UnsafeUtil.getByte(3L + l) & 255L) << 24 | ((long)UnsafeUtil.getByte(4L + l) & 255L) << 32 | ((long)UnsafeUtil.getByte(5L + l) & 255L) << 40 | ((long)UnsafeUtil.getByte(6L + l) & 255L) << 48 | ((long)UnsafeUtil.getByte(7L + l) & 255L) << 56;
	//   17   31:lload_1         
	//   18   32:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   19   35:i2l             
	//   20   36:ldc2w           #267 <Long 255L>
	//   21   39:land            
	//   22   40:lconst_1        
	//   23   41:lload_1         
	//   24   42:ladd            
	//   25   43:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   26   46:i2l             
	//   27   47:ldc2w           #267 <Long 255L>
	//   28   50:land            
	//   29   51:bipush          8
	//   30   53:lshl            
	//   31   54:lor             
	//   32   55:ldc2w           #261 <Long 2L>
	//   33   58:lload_1         
	//   34   59:ladd            
	//   35   60:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   36   63:i2l             
	//   37   64:ldc2w           #267 <Long 255L>
	//   38   67:land            
	//   39   68:bipush          16
	//   40   70:lshl            
	//   41   71:lor             
	//   42   72:ldc2w           #263 <Long 3L>
	//   43   75:lload_1         
	//   44   76:ladd            
	//   45   77:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   46   80:i2l             
	//   47   81:ldc2w           #267 <Long 255L>
	//   48   84:land            
	//   49   85:bipush          24
	//   50   87:lshl            
	//   51   88:lor             
	//   52   89:ldc2w           #259 <Long 4L>
	//   53   92:lload_1         
	//   54   93:ladd            
	//   55   94:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   56   97:i2l             
	//   57   98:ldc2w           #267 <Long 255L>
	//   58  101:land            
	//   59  102:bipush          32
	//   60  104:lshl            
	//   61  105:lor             
	//   62  106:ldc2w           #269 <Long 5L>
	//   63  109:lload_1         
	//   64  110:ladd            
	//   65  111:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   66  114:i2l             
	//   67  115:ldc2w           #267 <Long 255L>
	//   68  118:land            
	//   69  119:bipush          40
	//   70  121:lshl            
	//   71  122:lor             
	//   72  123:ldc2w           #271 <Long 6L>
	//   73  126:lload_1         
	//   74  127:ladd            
	//   75  128:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   76  131:i2l             
	//   77  132:ldc2w           #267 <Long 255L>
	//   78  135:land            
	//   79  136:bipush          48
	//   80  138:lshl            
	//   81  139:lor             
	//   82  140:ldc2w           #273 <Long 7L>
	//   83  143:lload_1         
	//   84  144:ladd            
	//   85  145:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   86  148:i2l             
	//   87  149:ldc2w           #267 <Long 255L>
	//   88  152:land            
	//   89  153:bipush          56
	//   90  155:lshl            
	//   91  156:lor             
	//   92  157:lreturn         
		}
	}

	public int readRawVarint32()
		throws IOException
	{
label0:
		{
			long l = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long pos>
	//    2    4:lstore          4
			if(limit == l)
	//*   3    6:aload_0         
	//*   4    7:getfield        #44  <Field long limit>
	//*   5   10:lload           4
	//*   6   12:lcmp            
	//*   7   13:ifne            19
				break label0;
	//    8   16:goto            293
			long l1 = 1L + l;
	//    9   19:lconst_1        
	//   10   20:lload           4
	//   11   22:ladd            
	//   12   23:lstore          6
			int i = ((int) (UnsafeUtil.getByte(l)));
	//   13   25:lload           4
	//   14   27:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   15   30:istore_1        
			if(i >= 0)
	//*  16   31:iload_1         
	//*  17   32:iflt            43
			{
				pos = l1;
	//   18   35:aload_0         
	//   19   36:lload           6
	//   20   38:putfield        #49  <Field long pos>
				return i;
	//   21   41:iload_1         
	//   22   42:ireturn         
			}
			if(limit - l1 < 9L)
	//*  23   43:aload_0         
	//*  24   44:getfield        #44  <Field long limit>
	//*  25   47:lload           6
	//*  26   49:lsub            
	//*  27   50:ldc2w           #275 <Long 9L>
	//*  28   53:lcmp            
	//*  29   54:ifge            60
				break label0;
	//   30   57:goto            293
			l = 1L + l1;
	//   31   60:lconst_1        
	//   32   61:lload           6
	//   33   63:ladd            
	//   34   64:lstore          4
			i = UnsafeUtil.getByte(l1) << 7 ^ i;
	//   35   66:lload           6
	//   36   68:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   37   71:bipush          7
	//   38   73:ishl            
	//   39   74:iload_1         
	//   40   75:ixor            
	//   41   76:istore_1        
			if(i < 0)
	//*  42   77:iload_1         
	//*  43   78:ifge            89
			{
				i ^= 0xffffff80;
	//   44   81:iload_1         
	//   45   82:bipush          -128
	//   46   84:ixor            
	//   47   85:istore_1        
			} else
	//*  48   86:goto            285
			{
				long l2 = 1L + l;
	//   49   89:lconst_1        
	//   50   90:lload           4
	//   51   92:ladd            
	//   52   93:lstore          6
				i = UnsafeUtil.getByte(l) << 14 ^ i;
	//   53   95:lload           4
	//   54   97:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   55  100:bipush          14
	//   56  102:ishl            
	//   57  103:iload_1         
	//   58  104:ixor            
	//   59  105:istore_1        
				if(i >= 0)
	//*  60  106:iload_1         
	//*  61  107:iflt            123
				{
					i ^= 0x3f80;
	//   62  110:iload_1         
	//   63  111:sipush          16256
	//   64  114:ixor            
	//   65  115:istore_1        
					l = l2;
	//   66  116:lload           6
	//   67  118:lstore          4
				} else
	//*  68  120:goto            285
				{
					l = 1L + l2;
	//   69  123:lconst_1        
	//   70  124:lload           6
	//   71  126:ladd            
	//   72  127:lstore          4
					i = UnsafeUtil.getByte(l2) << 21 ^ i;
	//   73  129:lload           6
	//   74  131:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   75  134:bipush          21
	//   76  136:ishl            
	//   77  137:iload_1         
	//   78  138:ixor            
	//   79  139:istore_1        
					if(i < 0)
	//*  80  140:iload_1         
	//*  81  141:ifge            153
					{
						i ^= 0xffe03f80;
	//   82  144:iload_1         
	//   83  145:ldc2            #277 <Int 0xffe03f80>
	//   84  148:ixor            
	//   85  149:istore_1        
					} else
	//*  86  150:goto            285
					{
						long l3 = 1L + l;
	//   87  153:lconst_1        
	//   88  154:lload           4
	//   89  156:ladd            
	//   90  157:lstore          6
						byte byte0 = UnsafeUtil.getByte(l);
	//   91  159:lload           4
	//   92  161:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   93  164:istore_3        
						int j = i ^ byte0 << 28 ^ 0xfe03f80;
	//   94  165:iload_1         
	//   95  166:iload_3         
	//   96  167:bipush          28
	//   97  169:ishl            
	//   98  170:ixor            
	//   99  171:ldc2            #278 <Int 0xfe03f80>
	//  100  174:ixor            
	//  101  175:istore_2        
						l = l3;
	//  102  176:lload           6
	//  103  178:lstore          4
						i = j;
	//  104  180:iload_2         
	//  105  181:istore_1        
						if(byte0 < 0)
	//* 106  182:iload_3         
	//* 107  183:ifge            285
						{
							long l6 = 1L + l3;
	//  108  186:lconst_1        
	//  109  187:lload           6
	//  110  189:ladd            
	//  111  190:lstore          8
							l = l6;
	//  112  192:lload           8
	//  113  194:lstore          4
							i = j;
	//  114  196:iload_2         
	//  115  197:istore_1        
							if(UnsafeUtil.getByte(l3) < 0)
	//* 116  198:lload           6
	//* 117  200:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//* 118  203:ifge            285
							{
								long l4 = 1L + l6;
	//  119  206:lconst_1        
	//  120  207:lload           8
	//  121  209:ladd            
	//  122  210:lstore          6
								l = l4;
	//  123  212:lload           6
	//  124  214:lstore          4
								i = j;
	//  125  216:iload_2         
	//  126  217:istore_1        
								if(UnsafeUtil.getByte(l6) < 0)
	//* 127  218:lload           8
	//* 128  220:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//* 129  223:ifge            285
								{
									long l7 = 1L + l4;
	//  130  226:lconst_1        
	//  131  227:lload           6
	//  132  229:ladd            
	//  133  230:lstore          8
									l = l7;
	//  134  232:lload           8
	//  135  234:lstore          4
									i = j;
	//  136  236:iload_2         
	//  137  237:istore_1        
									if(UnsafeUtil.getByte(l4) < 0)
	//* 138  238:lload           6
	//* 139  240:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//* 140  243:ifge            285
									{
										long l5 = 1L + l7;
	//  141  246:lconst_1        
	//  142  247:lload           8
	//  143  249:ladd            
	//  144  250:lstore          6
										l = l5;
	//  145  252:lload           6
	//  146  254:lstore          4
										i = j;
	//  147  256:iload_2         
	//  148  257:istore_1        
										if(UnsafeUtil.getByte(l7) < 0)
	//* 149  258:lload           8
	//* 150  260:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//* 151  263:ifge            285
										{
											l = 1L + l5;
	//  152  266:lconst_1        
	//  153  267:lload           6
	//  154  269:ladd            
	//  155  270:lstore          4
											i = j;
	//  156  272:iload_2         
	//  157  273:istore_1        
											if(UnsafeUtil.getByte(l5) < 0)
	//* 158  274:lload           6
	//* 159  276:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//* 160  279:ifge            285
												break label0;
	//  161  282:goto            293
										}
									}
								}
							}
						}
					}
				}
			}
			pos = l;
	//  162  285:aload_0         
	//  163  286:lload           4
	//  164  288:putfield        #49  <Field long pos>
			return i;
	//  165  291:iload_1         
	//  166  292:ireturn         
		}
		return (int)readRawVarint64SlowPath();
	//  167  293:aload_0         
	//  168  294:invokevirtual   #281 <Method long readRawVarint64SlowPath()>
	//  169  297:l2i             
	//  170  298:ireturn         
	}

	public long readRawVarint64()
		throws IOException
	{
label0:
		{
			long l = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field long pos>
	//    2    4:lstore_2        
			if(limit == l)
	//*   3    5:aload_0         
	//*   4    6:getfield        #44  <Field long limit>
	//*   5    9:lload_2         
	//*   6   10:lcmp            
	//*   7   11:ifne            17
				break label0;
	//    8   14:goto            388
			long l1 = 1L + l;
	//    9   17:lconst_1        
	//   10   18:lload_2         
	//   11   19:ladd            
	//   12   20:lstore          4
			int i = ((int) (UnsafeUtil.getByte(l)));
	//   13   22:lload_2         
	//   14   23:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   15   26:istore_1        
			if(i >= 0)
	//*  16   27:iload_1         
	//*  17   28:iflt            40
			{
				pos = l1;
	//   18   31:aload_0         
	//   19   32:lload           4
	//   20   34:putfield        #49  <Field long pos>
				return (long)i;
	//   21   37:iload_1         
	//   22   38:i2l             
	//   23   39:lreturn         
			}
			if(limit - l1 < 9L)
	//*  24   40:aload_0         
	//*  25   41:getfield        #44  <Field long limit>
	//*  26   44:lload           4
	//*  27   46:lsub            
	//*  28   47:ldc2w           #275 <Long 9L>
	//*  29   50:lcmp            
	//*  30   51:ifge            57
				break label0;
	//   31   54:goto            388
			l = 1L + l1;
	//   32   57:lconst_1        
	//   33   58:lload           4
	//   34   60:ladd            
	//   35   61:lstore_2        
			i = UnsafeUtil.getByte(l1) << 7 ^ i;
	//   36   62:lload           4
	//   37   64:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   38   67:bipush          7
	//   39   69:ishl            
	//   40   70:iload_1         
	//   41   71:ixor            
	//   42   72:istore_1        
			if(i < 0)
	//*  43   73:iload_1         
	//*  44   74:ifge            87
			{
				l1 = i ^ 0xffffff80;
	//   45   77:iload_1         
	//   46   78:bipush          -128
	//   47   80:ixor            
	//   48   81:i2l             
	//   49   82:lstore          4
			} else
	//*  50   84:goto            380
			{
				long l2 = 1L + l;
	//   51   87:lconst_1        
	//   52   88:lload_2         
	//   53   89:ladd            
	//   54   90:lstore          6
				i = UnsafeUtil.getByte(l) << 14 ^ i;
	//   55   92:lload_2         
	//   56   93:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   57   96:bipush          14
	//   58   98:ishl            
	//   59   99:iload_1         
	//   60  100:ixor            
	//   61  101:istore_1        
				if(i >= 0)
	//*  62  102:iload_1         
	//*  63  103:iflt            120
				{
					l1 = i ^ 0x3f80;
	//   64  106:iload_1         
	//   65  107:sipush          16256
	//   66  110:ixor            
	//   67  111:i2l             
	//   68  112:lstore          4
					l = l2;
	//   69  114:lload           6
	//   70  116:lstore_2        
				} else
	//*  71  117:goto            380
				{
					l1 = 1L + l2;
	//   72  120:lconst_1        
	//   73  121:lload           6
	//   74  123:ladd            
	//   75  124:lstore          4
					i = UnsafeUtil.getByte(l2) << 21 ^ i;
	//   76  126:lload           6
	//   77  128:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//   78  131:bipush          21
	//   79  133:ishl            
	//   80  134:iload_1         
	//   81  135:ixor            
	//   82  136:istore_1        
					if(i < 0)
	//*  83  137:iload_1         
	//*  84  138:ifge            159
					{
						long l3 = 0xffe03f80 ^ i;
	//   85  141:ldc2            #277 <Int 0xffe03f80>
	//   86  144:iload_1         
	//   87  145:ixor            
	//   88  146:i2l             
	//   89  147:lstore          6
						l = l1;
	//   90  149:lload           4
	//   91  151:lstore_2        
						l1 = l3;
	//   92  152:lload           6
	//   93  154:lstore          4
					} else
	//*  94  156:goto            380
					{
						long l4 = i;
	//   95  159:iload_1         
	//   96  160:i2l             
	//   97  161:lstore          6
						l = 1L + l1;
	//   98  163:lconst_1        
	//   99  164:lload           4
	//  100  166:ladd            
	//  101  167:lstore_2        
						l4 ^= (long)UnsafeUtil.getByte(l1) << 28;
	//  102  168:lload           6
	//  103  170:lload           4
	//  104  172:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//  105  175:i2l             
	//  106  176:bipush          28
	//  107  178:lshl            
	//  108  179:lxor            
	//  109  180:lstore          6
						if(l4 >= 0L)
	//* 110  182:lload           6
	//* 111  184:lconst_0        
	//* 112  185:lcmp            
	//* 113  186:iflt            200
						{
							l1 = l4 ^ 0xfe03f80L;
	//  114  189:lload           6
	//  115  191:ldc2w           #282 <Long 0xfe03f80L>
	//  116  194:lxor            
	//  117  195:lstore          4
						} else
	//* 118  197:goto            380
						{
							l1 = 1L + l;
	//  119  200:lconst_1        
	//  120  201:lload_2         
	//  121  202:ladd            
	//  122  203:lstore          4
							l4 = (long)UnsafeUtil.getByte(l) << 35 ^ l4;
	//  123  205:lload_2         
	//  124  206:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//  125  209:i2l             
	//  126  210:bipush          35
	//  127  212:lshl            
	//  128  213:lload           6
	//  129  215:lxor            
	//  130  216:lstore          6
							if(l4 < 0L)
	//* 131  218:lload           6
	//* 132  220:lconst_0        
	//* 133  221:lcmp            
	//* 134  222:ifge            243
							{
								l4 ^= 0xfe03f80L;
	//  135  225:lload           6
	//  136  227:ldc2w           #284 <Long 0xfe03f80L>
	//  137  230:lxor            
	//  138  231:lstore          6
								l = l1;
	//  139  233:lload           4
	//  140  235:lstore_2        
								l1 = l4;
	//  141  236:lload           6
	//  142  238:lstore          4
							} else
	//* 143  240:goto            380
							{
								l = 1L + l1;
	//  144  243:lconst_1        
	//  145  244:lload           4
	//  146  246:ladd            
	//  147  247:lstore_2        
								l4 = (long)UnsafeUtil.getByte(l1) << 42 ^ l4;
	//  148  248:lload           4
	//  149  250:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//  150  253:i2l             
	//  151  254:bipush          42
	//  152  256:lshl            
	//  153  257:lload           6
	//  154  259:lxor            
	//  155  260:lstore          6
								if(l4 >= 0L)
	//* 156  262:lload           6
	//* 157  264:lconst_0        
	//* 158  265:lcmp            
	//* 159  266:iflt            280
								{
									l1 = l4 ^ 0xfe03f80L;
	//  160  269:lload           6
	//  161  271:ldc2w           #286 <Long 0xfe03f80L>
	//  162  274:lxor            
	//  163  275:lstore          4
								} else
	//* 164  277:goto            380
								{
									l1 = 1L + l;
	//  165  280:lconst_1        
	//  166  281:lload_2         
	//  167  282:ladd            
	//  168  283:lstore          4
									l = (long)UnsafeUtil.getByte(l) << 49 ^ l4;
	//  169  285:lload_2         
	//  170  286:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//  171  289:i2l             
	//  172  290:bipush          49
	//  173  292:lshl            
	//  174  293:lload           6
	//  175  295:lxor            
	//  176  296:lstore_2        
									if(l < 0L)
	//* 177  297:lload_2         
	//* 178  298:lconst_0        
	//* 179  299:lcmp            
	//* 180  300:ifge            320
									{
										long l5 = l ^ 0xfe03f80L;
	//  181  303:lload_2         
	//  182  304:ldc2w           #288 <Long 0xfe03f80L>
	//  183  307:lxor            
	//  184  308:lstore          6
										l = l1;
	//  185  310:lload           4
	//  186  312:lstore_2        
										l1 = l5;
	//  187  313:lload           6
	//  188  315:lstore          4
									} else
	//* 189  317:goto            380
									{
										long l6 = 1L + l1;
	//  190  320:lconst_1        
	//  191  321:lload           4
	//  192  323:ladd            
	//  193  324:lstore          6
										long l7 = l ^ (long)UnsafeUtil.getByte(l1) << 56 ^ 0xfe03f80L;
	//  194  326:lload_2         
	//  195  327:lload           4
	//  196  329:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//  197  332:i2l             
	//  198  333:bipush          56
	//  199  335:lshl            
	//  200  336:lxor            
	//  201  337:ldc2w           #290 <Long 0xfe03f80L>
	//  202  340:lxor            
	//  203  341:lstore          8
										l = l6;
	//  204  343:lload           6
	//  205  345:lstore_2        
										l1 = l7;
	//  206  346:lload           8
	//  207  348:lstore          4
										if(l7 < 0L)
	//* 208  350:lload           8
	//* 209  352:lconst_0        
	//* 210  353:lcmp            
	//* 211  354:ifge            380
										{
											l = 1L + l6;
	//  212  357:lconst_1        
	//  213  358:lload           6
	//  214  360:ladd            
	//  215  361:lstore_2        
											l1 = l7;
	//  216  362:lload           8
	//  217  364:lstore          4
											if((long)UnsafeUtil.getByte(l6) < 0L)
	//* 218  366:lload           6
	//* 219  368:invokestatic    #85  <Method byte UnsafeUtil.getByte(long)>
	//* 220  371:i2l             
	//* 221  372:lconst_0        
	//* 222  373:lcmp            
	//* 223  374:ifge            380
												break label0;
	//  224  377:goto            388
										}
									}
								}
							}
						}
					}
				}
			}
			pos = l;
	//  225  380:aload_0         
	//  226  381:lload_2         
	//  227  382:putfield        #49  <Field long pos>
			return l1;
	//  228  385:lload           4
	//  229  387:lreturn         
		}
		return readRawVarint64SlowPath();
	//  230  388:aload_0         
	//  231  389:invokevirtual   #281 <Method long readRawVarint64SlowPath()>
	//  232  392:lreturn         
	}

	long readRawVarint64SlowPath()
		throws IOException
	{
		long l = 0L;
	//    0    0:lconst_0        
	//    1    1:lstore_3        
		for(int i = 0; i < 64; i += 7)
	//*   2    2:iconst_0        
	//*   3    3:istore_1        
	//*   4    4:iload_1         
	//*   5    5:bipush          64
	//*   6    7:icmpge          43
		{
			byte byte0 = readRawByte();
	//    7   10:aload_0         
	//    8   11:invokevirtual   #95  <Method byte readRawByte()>
	//    9   14:istore_2        
			l |= (long)(byte0 & 0x7f) << i;
	//   10   15:lload_3         
	//   11   16:iload_2         
	//   12   17:bipush          127
	//   13   19:iand            
	//   14   20:i2l             
	//   15   21:iload_1         
	//   16   22:lshl            
	//   17   23:lor             
	//   18   24:lstore_3        
			if((byte0 & 0x80) == 0)
	//*  19   25:iload_2         
	//*  20   26:sipush          128
	//*  21   29:iand            
	//*  22   30:ifne            35
				return l;
	//   23   33:lload_3         
	//   24   34:lreturn         
		}

	//   25   35:iload_1         
	//   26   36:bipush          7
	//   27   38:iadd            
	//   28   39:istore_1        
	//*  29   40:goto            4
		throw InvalidProtocolBufferException.malformedVarint();
	//   30   43:invokestatic    #91  <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   31   46:athrow          
	}

	public int readSFixed32()
		throws IOException
	{
		return readRawLittleEndian32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #196 <Method int readRawLittleEndian32()>
	//    2    4:ireturn         
	}

	public long readSFixed64()
		throws IOException
	{
		return readRawLittleEndian64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method long readRawLittleEndian64()>
	//    2    4:lreturn         
	}

	public int readSInt32()
		throws IOException
	{
		return decodeZigZag32(readRawVarint32());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:invokestatic    #297 <Method int decodeZigZag32(int)>
	//    3    7:ireturn         
	}

	public long readSInt64()
		throws IOException
	{
		return decodeZigZag64(readRawVarint64());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method long readRawVarint64()>
	//    2    4:invokestatic    #302 <Method long decodeZigZag64(long)>
	//    3    7:lreturn         
	}

	public String readString()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && i <= remaining())
	//*   3    5:iload_1         
	//*   4    6:ifle            57
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #74  <Method int remaining()>
	//*   8   14:icmpgt          57
		{
			byte abyte0[] = new byte[i];
	//    9   17:iload_1         
	//   10   18:newarray        byte[]
	//   11   20:astore_2        
			UnsafeUtil.copyMemory(pos, abyte0, 0L, i);
	//   12   21:aload_0         
	//   13   22:getfield        #49  <Field long pos>
	//   14   25:aload_2         
	//   15   26:lconst_0        
	//   16   27:iload_1         
	//   17   28:i2l             
	//   18   29:invokestatic    #157 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
			String s = new String(abyte0, Internal.UTF_8);
	//   19   32:new             #306 <Class String>
	//   20   35:dup             
	//   21   36:aload_2         
	//   22   37:getstatic       #310 <Field java.nio.charset.Charset Internal.UTF_8>
	//   23   40:invokespecial   #313 <Method void String(byte[], java.nio.charset.Charset)>
	//   24   43:astore_2        
			pos = pos + (long)i;
	//   25   44:aload_0         
	//   26   45:aload_0         
	//   27   46:getfield        #49  <Field long pos>
	//   28   49:iload_1         
	//   29   50:i2l             
	//   30   51:ladd            
	//   31   52:putfield        #49  <Field long pos>
			return s;
	//   32   55:aload_2         
	//   33   56:areturn         
		}
		if(i == 0)
	//*  34   57:iload_1         
	//*  35   58:ifne            65
			return "";
	//   36   61:ldc2            #315 <String "">
	//   37   64:areturn         
		if(i < 0)
	//*  38   65:iload_1         
	//*  39   66:ifge            73
			throw InvalidProtocolBufferException.negativeSize();
	//   40   69:invokestatic    #136 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   41   72:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   42   73:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   43   76:athrow          
	}

	public String readStringRequireUtf8()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i >= 0 && i <= remaining())
	//*   3    5:iload_1         
	//*   4    6:iflt            68
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokespecial   #74  <Method int remaining()>
	//*   8   14:icmpgt          68
		{
			byte abyte0[] = new byte[i];
	//    9   17:iload_1         
	//   10   18:newarray        byte[]
	//   11   20:astore_2        
			UnsafeUtil.copyMemory(pos, abyte0, 0L, i);
	//   12   21:aload_0         
	//   13   22:getfield        #49  <Field long pos>
	//   14   25:aload_2         
	//   15   26:lconst_0        
	//   16   27:iload_1         
	//   17   28:i2l             
	//   18   29:invokestatic    #157 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
			if(!Utf8.isValidUtf8(abyte0))
	//*  19   32:aload_2         
	//*  20   33:invokestatic    #322 <Method boolean Utf8.isValidUtf8(byte[])>
	//*  21   36:ifne            43
			{
				throw InvalidProtocolBufferException.invalidUtf8();
	//   22   39:invokestatic    #325 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidUtf8()>
	//   23   42:athrow          
			} else
			{
				String s = new String(abyte0, Internal.UTF_8);
	//   24   43:new             #306 <Class String>
	//   25   46:dup             
	//   26   47:aload_2         
	//   27   48:getstatic       #310 <Field java.nio.charset.Charset Internal.UTF_8>
	//   28   51:invokespecial   #313 <Method void String(byte[], java.nio.charset.Charset)>
	//   29   54:astore_2        
				pos = pos + (long)i;
	//   30   55:aload_0         
	//   31   56:aload_0         
	//   32   57:getfield        #49  <Field long pos>
	//   33   60:iload_1         
	//   34   61:i2l             
	//   35   62:ladd            
	//   36   63:putfield        #49  <Field long pos>
				return s;
	//   37   66:aload_2         
	//   38   67:areturn         
			}
		}
		if(i == 0)
	//*  39   68:iload_1         
	//*  40   69:ifne            76
			return "";
	//   41   72:ldc2            #315 <String "">
	//   42   75:areturn         
		if(i <= 0)
	//*  43   76:iload_1         
	//*  44   77:ifgt            84
			throw InvalidProtocolBufferException.negativeSize();
	//   45   80:invokestatic    #136 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   46   83:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   47   84:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   48   87:athrow          
	}

	public int readTag()
		throws IOException
	{
		if(isAtEnd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #328 <Method boolean isAtEnd()>
	//*   2    4:ifeq            14
		{
			lastTag = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #116 <Field int lastTag>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		lastTag = readRawVarint32();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #146 <Method int readRawVarint32()>
	//   11   19:putfield        #116 <Field int lastTag>
		if(WireFormat.getTagFieldNumber(lastTag) == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #116 <Field int lastTag>
	//*  14   26:invokestatic    #331 <Method int WireFormat.getTagFieldNumber(int)>
	//*  15   29:ifne            36
			throw InvalidProtocolBufferException.invalidTag();
	//   16   32:invokestatic    #334 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidTag()>
	//   17   35:athrow          
		else
			return lastTag;
	//   18   36:aload_0         
	//   19   37:getfield        #116 <Field int lastTag>
	//   20   40:ireturn         
	}

	public int readUInt32()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public long readUInt64()
		throws IOException
	{
		return readRawVarint64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #141 <Method long readRawVarint64()>
	//    2    4:lreturn         
	}

	public void readUnknownGroup(int i, MessageLite.Builder builder)
		throws IOException
	{
		readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #345 <Method ExtensionRegistryLite ExtensionRegistryLite.getEmptyRegistry()>
	//    4    6:invokevirtual   #347 <Method void readGroup(int, MessageLite$Builder, ExtensionRegistryLite)>
	//    5    9:return          
	}

	public void resetSizeCounter()
	{
		startPos = pos;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field long pos>
	//    3    5:putfield        #51  <Field long startPos>
	//    4    8:return          
	}

	public boolean skipField(int i)
		throws IOException
	{
		switch(WireFormat.getTagWireType(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #354 <Method int WireFormat.getTagWireType(int)>
		{
	//*   2    4:tableswitch     0 5: default 44
	//	               0 47
	//	               1 53
	//	               2 61
	//	               3 71
	//	               4 89
	//	               5 91
	//*   3   44:goto            98
		case 0: // '\0'
			skipRawVarint();
	//    4   47:aload_0         
	//    5   48:invokespecial   #356 <Method void skipRawVarint()>
			return true;
	//    6   51:iconst_1        
	//    7   52:ireturn         

		case 1: // '\001'
			skipRawBytes(8);
	//    8   53:aload_0         
	//    9   54:bipush          8
	//   10   56:invokevirtual   #359 <Method void skipRawBytes(int)>
			return true;
	//   11   59:iconst_1        
	//   12   60:ireturn         

		case 2: // '\002'
			skipRawBytes(readRawVarint32());
	//   13   61:aload_0         
	//   14   62:aload_0         
	//   15   63:invokevirtual   #146 <Method int readRawVarint32()>
	//   16   66:invokevirtual   #359 <Method void skipRawBytes(int)>
			return true;
	//   17   69:iconst_1        
	//   18   70:ireturn         

		case 3: // '\003'
			skipMessage();
	//   19   71:aload_0         
	//   20   72:invokevirtual   #362 <Method void skipMessage()>
			checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
	//   21   75:aload_0         
	//   22   76:iload_1         
	//   23   77:invokestatic    #331 <Method int WireFormat.getTagFieldNumber(int)>
	//   24   80:iconst_4        
	//   25   81:invokestatic    #230 <Method int WireFormat.makeTag(int, int)>
	//   26   84:invokevirtual   #232 <Method void checkLastTagWas(int)>
			return true;
	//   27   87:iconst_1        
	//   28   88:ireturn         

		case 4: // '\004'
			return false;
	//   29   89:iconst_0        
	//   30   90:ireturn         

		case 5: // '\005'
			skipRawBytes(4);
	//   31   91:aload_0         
	//   32   92:iconst_4        
	//   33   93:invokevirtual   #359 <Method void skipRawBytes(int)>
			return true;
	//   34   96:iconst_1        
	//   35   97:ireturn         
		}
		throw InvalidProtocolBufferException.invalidWireType();
	//   36   98:invokestatic    #366 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
	//   37  101:athrow          
	}

	public boolean skipField(int i, CodedOutputStream codedoutputstream)
		throws IOException
	{
		switch(WireFormat.getTagWireType(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #354 <Method int WireFormat.getTagWireType(int)>
		{
	//*   2    4:tableswitch     0 5: default 44
	//	               0 47
	//	               1 66
	//	               2 85
	//	               3 104
	//	               4 135
	//	               5 137
	//*   3   44:goto            154
		case 0: // '\0'
			long l = readInt64();
	//    4   47:aload_0         
	//    5   48:invokevirtual   #369 <Method long readInt64()>
	//    6   51:lstore          4
			codedoutputstream.writeRawVarint32(i);
	//    7   53:aload_2         
	//    8   54:iload_1         
	//    9   55:invokevirtual   #374 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeUInt64NoTag(l);
	//   10   58:aload_2         
	//   11   59:lload           4
	//   12   61:invokevirtual   #378 <Method void CodedOutputStream.writeUInt64NoTag(long)>
			return true;
	//   13   64:iconst_1        
	//   14   65:ireturn         

		case 1: // '\001'
			long l1 = readRawLittleEndian64();
	//   15   66:aload_0         
	//   16   67:invokevirtual   #185 <Method long readRawLittleEndian64()>
	//   17   70:lstore          4
			codedoutputstream.writeRawVarint32(i);
	//   18   72:aload_2         
	//   19   73:iload_1         
	//   20   74:invokevirtual   #374 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeFixed64NoTag(l1);
	//   21   77:aload_2         
	//   22   78:lload           4
	//   23   80:invokevirtual   #381 <Method void CodedOutputStream.writeFixed64NoTag(long)>
			return true;
	//   24   83:iconst_1        
	//   25   84:ireturn         

		case 2: // '\002'
			ByteString bytestring = readBytes();
	//   26   85:aload_0         
	//   27   86:invokevirtual   #383 <Method ByteString readBytes()>
	//   28   89:astore          6
			codedoutputstream.writeRawVarint32(i);
	//   29   91:aload_2         
	//   30   92:iload_1         
	//   31   93:invokevirtual   #374 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytesNoTag(bytestring);
	//   32   96:aload_2         
	//   33   97:aload           6
	//   34   99:invokevirtual   #387 <Method void CodedOutputStream.writeBytesNoTag(ByteString)>
			return true;
	//   35  102:iconst_1        
	//   36  103:ireturn         

		case 3: // '\003'
			codedoutputstream.writeRawVarint32(i);
	//   37  104:aload_2         
	//   38  105:iload_1         
	//   39  106:invokevirtual   #374 <Method void CodedOutputStream.writeRawVarint32(int)>
			skipMessage(codedoutputstream);
	//   40  109:aload_0         
	//   41  110:aload_2         
	//   42  111:invokevirtual   #390 <Method void skipMessage(CodedOutputStream)>
			i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
	//   43  114:iload_1         
	//   44  115:invokestatic    #331 <Method int WireFormat.getTagFieldNumber(int)>
	//   45  118:iconst_4        
	//   46  119:invokestatic    #230 <Method int WireFormat.makeTag(int, int)>
	//   47  122:istore_1        
			checkLastTagWas(i);
	//   48  123:aload_0         
	//   49  124:iload_1         
	//   50  125:invokevirtual   #232 <Method void checkLastTagWas(int)>
			codedoutputstream.writeRawVarint32(i);
	//   51  128:aload_2         
	//   52  129:iload_1         
	//   53  130:invokevirtual   #374 <Method void CodedOutputStream.writeRawVarint32(int)>
			return true;
	//   54  133:iconst_1        
	//   55  134:ireturn         

		case 4: // '\004'
			return false;
	//   56  135:iconst_0        
	//   57  136:ireturn         

		case 5: // '\005'
			int j = readRawLittleEndian32();
	//   58  137:aload_0         
	//   59  138:invokevirtual   #196 <Method int readRawLittleEndian32()>
	//   60  141:istore_3        
			codedoutputstream.writeRawVarint32(i);
	//   61  142:aload_2         
	//   62  143:iload_1         
	//   63  144:invokevirtual   #374 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeFixed32NoTag(j);
	//   64  147:aload_2         
	//   65  148:iload_3         
	//   66  149:invokevirtual   #393 <Method void CodedOutputStream.writeFixed32NoTag(int)>
			return true;
	//   67  152:iconst_1        
	//   68  153:ireturn         
		}
		throw InvalidProtocolBufferException.invalidWireType();
	//   69  154:invokestatic    #366 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
	//   70  157:athrow          
	}

	public void skipMessage()
		throws IOException
	{
		int i;
		do
			i = readTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method int readTag()>
	//    2    4:istore_1        
		while(i != 0 && skipField(i));
	//    3    5:iload_1         
	//    4    6:ifeq            17
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #397 <Method boolean skipField(int)>
	//    8   14:ifne            18
	//    9   17:return          
	//*  10   18:goto            0
	}

	public void skipMessage(CodedOutputStream codedoutputstream)
		throws IOException
	{
		int i;
		do
			i = readTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method int readTag()>
	//    2    4:istore_2        
		while(i != 0 && skipField(i, codedoutputstream));
	//    3    5:iload_2         
	//    4    6:ifeq            18
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #399 <Method boolean skipField(int, CodedOutputStream)>
	//    9   15:ifne            19
	//   10   18:return          
	//*  11   19:goto            0
	}

	public void skipRawBytes(int i)
		throws IOException
	{
		if(i >= 0 && i <= remaining())
	//*   0    0:iload_1         
	//*   1    1:iflt            24
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #74  <Method int remaining()>
	//*   5    9:icmpgt          24
		{
			pos = pos + (long)i;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field long pos>
	//    9   17:iload_1         
	//   10   18:i2l             
	//   11   19:ladd            
	//   12   20:putfield        #49  <Field long pos>
			return;
	//   13   23:return          
		}
		if(i < 0)
	//*  14   24:iload_1         
	//*  15   25:ifge            32
			throw InvalidProtocolBufferException.negativeSize();
	//   16   28:invokestatic    #136 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   17   31:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   18   32:invokestatic    #112 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   19   35:athrow          
	}

	private final long address;
	private final ByteBuffer buffer;
	private int bufferSizeAfterLimit;
	private int currentLimit;
	private boolean enableAliasing;
	private final boolean immutable;
	private int lastTag;
	private long limit;
	private long pos;
	private long startPos;

	private CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer bytebuffer, boolean flag)
	{
		super(((CodedInputStream._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #24  <Method void CodedInputStream(CodedInputStream$1)>
		currentLimit = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #25  <Int 0x7fffffff>
	//    5    8:putfield        #27  <Field int currentLimit>
		buffer = bytebuffer;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #29  <Field ByteBuffer buffer>
		address = UnsafeUtil.addressOffset(bytebuffer);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokestatic    #35  <Method long UnsafeUtil.addressOffset(ByteBuffer)>
	//   12   21:putfield        #37  <Field long address>
		limit = address + (long)bytebuffer.limit();
	//   13   24:aload_0         
	//   14   25:aload_0         
	//   15   26:getfield        #37  <Field long address>
	//   16   29:aload_1         
	//   17   30:invokevirtual   #42  <Method int ByteBuffer.limit()>
	//   18   33:i2l             
	//   19   34:ladd            
	//   20   35:putfield        #44  <Field long limit>
		pos = address + (long)bytebuffer.position();
	//   21   38:aload_0         
	//   22   39:aload_0         
	//   23   40:getfield        #37  <Field long address>
	//   24   43:aload_1         
	//   25   44:invokevirtual   #47  <Method int ByteBuffer.position()>
	//   26   47:i2l             
	//   27   48:ladd            
	//   28   49:putfield        #49  <Field long pos>
		startPos = pos;
	//   29   52:aload_0         
	//   30   53:aload_0         
	//   31   54:getfield        #49  <Field long pos>
	//   32   57:putfield        #51  <Field long startPos>
		immutable = flag;
	//   33   60:aload_0         
	//   34   61:iload_2         
	//   35   62:putfield        #53  <Field boolean immutable>
	//   36   65:return          
	}

	CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer bytebuffer, boolean flag, CodedInputStream._cls1 _pcls1)
	{
		this(bytebuffer, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer, boolean)>
	//    4    6:return          
	}
}
