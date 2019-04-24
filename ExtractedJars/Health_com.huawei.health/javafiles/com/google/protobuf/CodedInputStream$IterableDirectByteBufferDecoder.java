// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

// Referenced classes of package com.google.protobuf:
//			CodedInputStream, Internal, InvalidProtocolBufferException, UnsafeUtil, 
//			ByteString, Parser, MessageLite, WireFormat, 
//			Utf8, ExtensionRegistryLite, CodedOutputStream

static final class CodedInputStream$IterableDirectByteBufferDecoder extends CodedInputStream
{

	private long currentRemaining()
	{
		return currentByteBufferLimit - currentByteBufferPos;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field long currentByteBufferLimit>
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field long currentByteBufferPos>
	//    4    8:lsub            
	//    5    9:lreturn         
	}

	private void getNextByteBuffer()
		throws InvalidProtocolBufferException
	{
		if(!iterator.hasNext())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Iterator iterator>
	//*   2    4:invokeinterface #89  <Method boolean Iterator.hasNext()>
	//*   3    9:ifne            16
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//    4   12:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//    5   15:athrow          
		} else
		{
			tryGetNextByteBuffer();
	//    6   16:aload_0         
	//    7   17:invokespecial   #72  <Method void tryGetNextByteBuffer()>
			return;
	//    8   20:return          
		}
	}

	private void readRawBytesTo(byte abyte0[], int i, int j)
		throws IOException
	{
		if(j >= 0 && j <= remaining())
	//*   0    0:iload_3         
	//*   1    1:iflt            86
	//*   2    4:iload_3         
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #102 <Method int remaining()>
	//*   5    9:icmpgt          86
		{
			for(int k = j; k > 0;)
	//*   6   12:iload_3         
	//*   7   13:istore          4
	//*   8   15:iload           4
	//*   9   17:ifle            85
			{
				if(currentRemaining() == 0L)
	//*  10   20:aload_0         
	//*  11   21:invokespecial   #104 <Method long currentRemaining()>
	//*  12   24:lconst_0        
	//*  13   25:lcmp            
	//*  14   26:ifne            33
					getNextByteBuffer();
	//   15   29:aload_0         
	//   16   30:invokespecial   #106 <Method void getNextByteBuffer()>
				int l = Math.min(k, (int)currentRemaining());
	//   17   33:iload           4
	//   18   35:aload_0         
	//   19   36:invokespecial   #104 <Method long currentRemaining()>
	//   20   39:l2i             
	//   21   40:invokestatic    #112 <Method int Math.min(int, int)>
	//   22   43:istore          5
				UnsafeUtil.copyMemory(currentByteBufferPos, abyte0, (j - k) + i, l);
	//   23   45:aload_0         
	//   24   46:getfield        #62  <Field long currentByteBufferPos>
	//   25   49:aload_1         
	//   26   50:iload_3         
	//   27   51:iload           4
	//   28   53:isub            
	//   29   54:iload_2         
	//   30   55:iadd            
	//   31   56:i2l             
	//   32   57:iload           5
	//   33   59:i2l             
	//   34   60:invokestatic    #118 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
				k -= l;
	//   35   63:iload           4
	//   36   65:iload           5
	//   37   67:isub            
	//   38   68:istore          4
				currentByteBufferPos = currentByteBufferPos + (long)l;
	//   39   70:aload_0         
	//   40   71:aload_0         
	//   41   72:getfield        #62  <Field long currentByteBufferPos>
	//   42   75:iload           5
	//   43   77:i2l             
	//   44   78:ladd            
	//   45   79:putfield        #62  <Field long currentByteBufferPos>
			}

	//*  46   82:goto            15
			return;
	//   47   85:return          
		}
		if(j <= 0)
	//*  48   86:iload_3         
	//*  49   87:ifgt            99
		{
			if(j == 0)
	//*  50   90:iload_3         
	//*  51   91:ifne            95
				return;
	//   52   94:return          
			else
				throw InvalidProtocolBufferException.negativeSize();
	//   53   95:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   54   98:athrow          
		} else
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   55   99:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   56  102:athrow          
		}
	}

	private void recomputeBufferSizeAfterLimit()
	{
		totalBufferSize = totalBufferSize + bufferSizeAfterCurrentLimit;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int totalBufferSize>
	//    3    5:aload_0         
	//    4    6:getfield        #124 <Field int bufferSizeAfterCurrentLimit>
	//    5    9:iadd            
	//    6   10:putfield        #38  <Field int totalBufferSize>
		int i = totalBufferSize - startOffset;
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field int totalBufferSize>
	//    9   17:aload_0         
	//   10   18:getfield        #53  <Field int startOffset>
	//   11   21:isub            
	//   12   22:istore_1        
		if(i > currentLimit)
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #36  <Field int currentLimit>
	//*  16   28:icmple          55
		{
			bufferSizeAfterCurrentLimit = i - currentLimit;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #36  <Field int currentLimit>
	//   21   37:isub            
	//   22   38:putfield        #124 <Field int bufferSizeAfterCurrentLimit>
			totalBufferSize = totalBufferSize - bufferSizeAfterCurrentLimit;
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #38  <Field int totalBufferSize>
	//   26   46:aload_0         
	//   27   47:getfield        #124 <Field int bufferSizeAfterCurrentLimit>
	//   28   50:isub            
	//   29   51:putfield        #38  <Field int totalBufferSize>
			return;
	//   30   54:return          
		} else
		{
			bufferSizeAfterCurrentLimit = 0;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #124 <Field int bufferSizeAfterCurrentLimit>
			return;
	//   34   60:return          
		}
	}

	private int remaining()
	{
		return (int)(((long)(totalBufferSize - totalBytesRead) - currentByteBufferPos) + currentByteBufferStartPos);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int totalBufferSize>
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field int totalBytesRead>
	//    4    8:isub            
	//    5    9:i2l             
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field long currentByteBufferPos>
	//    8   14:lsub            
	//    9   15:aload_0         
	//   10   16:getfield        #64  <Field long currentByteBufferStartPos>
	//   11   19:ladd            
	//   12   20:l2i             
	//   13   21:ireturn         
	}

	private void skipRawVarint()
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
	//*   6    9:invokevirtual   #129 <Method byte readRawByte()>
	//*   7   12:iflt            16
				return;
	//    8   15:return          

	//    9   16:iload_1         
	//   10   17:iconst_1        
	//   11   18:iadd            
	//   12   19:istore_1        
	//*  13   20:goto            2
		throw InvalidProtocolBufferException.malformedVarint();
	//   14   23:invokestatic    #132 <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   15   26:athrow          
	}

	private ByteBuffer slice(int i, int j)
		throws IOException
	{
		int k;
		int l;
		k = currentByteBuffer.position();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//    2    4:invokevirtual   #141 <Method int ByteBuffer.position()>
	//    3    7:istore_3        
		l = currentByteBuffer.limit();
	//    4    8:aload_0         
	//    5    9:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//    6   12:invokevirtual   #144 <Method int ByteBuffer.limit()>
	//    7   15:istore          4
		ByteBuffer bytebuffer;
		currentByteBuffer.position(i);
	//    8   17:aload_0         
	//    9   18:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #147 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   12   25:pop             
		currentByteBuffer.limit(j);
	//   13   26:aload_0         
	//   14   27:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   15   30:iload_2         
	//   16   31:invokevirtual   #149 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   17   34:pop             
		bytebuffer = currentByteBuffer.slice();
	//   18   35:aload_0         
	//   19   36:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   20   39:invokevirtual   #152 <Method ByteBuffer ByteBuffer.slice()>
	//   21   42:astore          5
		currentByteBuffer.position(k);
	//   22   44:aload_0         
	//   23   45:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   24   48:iload_3         
	//   25   49:invokevirtual   #147 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   26   52:pop             
		currentByteBuffer.limit(l);
	//   27   53:aload_0         
	//   28   54:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   29   57:iload           4
	//   30   59:invokevirtual   #149 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   31   62:pop             
		return bytebuffer;
	//   32   63:aload           5
	//   33   65:areturn         
		Object obj;
		obj;
	//   34   66:astore          5
		throw InvalidProtocolBufferException.truncatedMessage();
	//   35   68:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   36   71:athrow          
		obj;
	//   37   72:astore          5
		currentByteBuffer.position(k);
	//   38   74:aload_0         
	//   39   75:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   40   78:iload_3         
	//   41   79:invokevirtual   #147 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   42   82:pop             
		currentByteBuffer.limit(l);
	//   43   83:aload_0         
	//   44   84:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   45   87:iload           4
	//   46   89:invokevirtual   #149 <Method java.nio.Buffer ByteBuffer.limit(int)>
	//   47   92:pop             
		throw obj;
	//   48   93:aload           5
	//   49   95:athrow          
	}

	private void tryGetNextByteBuffer()
	{
		currentByteBuffer = (ByteBuffer)iterator.next();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field Iterator iterator>
	//    3    5:invokeinterface #156 <Method Object Iterator.next()>
	//    4   10:checkcast       #138 <Class ByteBuffer>
	//    5   13:putfield        #60  <Field ByteBuffer currentByteBuffer>
		totalBytesRead = totalBytesRead + (int)(currentByteBufferPos - currentByteBufferStartPos);
	//    6   16:aload_0         
	//    7   17:aload_0         
	//    8   18:getfield        #51  <Field int totalBytesRead>
	//    9   21:aload_0         
	//   10   22:getfield        #62  <Field long currentByteBufferPos>
	//   11   25:aload_0         
	//   12   26:getfield        #64  <Field long currentByteBufferStartPos>
	//   13   29:lsub            
	//   14   30:l2i             
	//   15   31:iadd            
	//   16   32:putfield        #51  <Field int totalBytesRead>
		currentByteBufferPos = currentByteBuffer.position();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   20   40:invokevirtual   #141 <Method int ByteBuffer.position()>
	//   21   43:i2l             
	//   22   44:putfield        #62  <Field long currentByteBufferPos>
		currentByteBufferStartPos = currentByteBufferPos;
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #62  <Field long currentByteBufferPos>
	//   26   52:putfield        #64  <Field long currentByteBufferStartPos>
		currentByteBufferLimit = currentByteBuffer.limit();
	//   27   55:aload_0         
	//   28   56:aload_0         
	//   29   57:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   30   60:invokevirtual   #144 <Method int ByteBuffer.limit()>
	//   31   63:i2l             
	//   32   64:putfield        #66  <Field long currentByteBufferLimit>
		currentAddress = UnsafeUtil.addressOffset(currentByteBuffer);
	//   33   67:aload_0         
	//   34   68:aload_0         
	//   35   69:getfield        #60  <Field ByteBuffer currentByteBuffer>
	//   36   72:invokestatic    #160 <Method long UnsafeUtil.addressOffset(ByteBuffer)>
	//   37   75:putfield        #68  <Field long currentAddress>
		currentByteBufferPos = currentByteBufferPos + currentAddress;
	//   38   78:aload_0         
	//   39   79:aload_0         
	//   40   80:getfield        #62  <Field long currentByteBufferPos>
	//   41   83:aload_0         
	//   42   84:getfield        #68  <Field long currentAddress>
	//   43   87:ladd            
	//   44   88:putfield        #62  <Field long currentByteBufferPos>
		currentByteBufferStartPos = currentByteBufferStartPos + currentAddress;
	//   45   91:aload_0         
	//   46   92:aload_0         
	//   47   93:getfield        #64  <Field long currentByteBufferStartPos>
	//   48   96:aload_0         
	//   49   97:getfield        #68  <Field long currentAddress>
	//   50  100:ladd            
	//   51  101:putfield        #64  <Field long currentByteBufferStartPos>
		currentByteBufferLimit = currentByteBufferLimit + currentAddress;
	//   52  104:aload_0         
	//   53  105:aload_0         
	//   54  106:getfield        #66  <Field long currentByteBufferLimit>
	//   55  109:aload_0         
	//   56  110:getfield        #68  <Field long currentAddress>
	//   57  113:ladd            
	//   58  114:putfield        #66  <Field long currentByteBufferLimit>
	//   59  117:return          
	}

	public void checkLastTagWas(int i)
		throws InvalidProtocolBufferException
	{
		if(lastTag != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #164 <Field int lastTag>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			throw InvalidProtocolBufferException.invalidEndTag();
	//    4    8:invokestatic    #167 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidEndTag()>
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
	//    2    2:putfield        #170 <Field boolean enableAliasing>
	//    3    5:return          
	}

	public int getBytesUntilLimit()
	{
		if(currentLimit == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field int currentLimit>
	//*   2    4:ldc1            #34  <Int 0x7fffffff>
	//*   3    6:icmpne          11
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		else
			return currentLimit - getTotalBytesRead();
	//    6   11:aload_0         
	//    7   12:getfield        #36  <Field int currentLimit>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #174 <Method int getTotalBytesRead()>
	//   10   19:isub            
	//   11   20:ireturn         
	}

	public int getLastTag()
	{
		return lastTag;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int lastTag>
	//    2    4:ireturn         
	}

	public int getTotalBytesRead()
	{
		return (int)(((long)(totalBytesRead - startOffset) + currentByteBufferPos) - currentByteBufferStartPos);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int totalBytesRead>
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field int startOffset>
	//    4    8:isub            
	//    5    9:i2l             
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field long currentByteBufferPos>
	//    8   14:ladd            
	//    9   15:aload_0         
	//   10   16:getfield        #64  <Field long currentByteBufferStartPos>
	//   11   19:lsub            
	//   12   20:l2i             
	//   13   21:ireturn         
	}

	public boolean isAtEnd()
		throws IOException
	{
		return ((long)totalBytesRead + currentByteBufferPos) - currentByteBufferStartPos == (long)totalBufferSize;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int totalBytesRead>
	//    2    4:i2l             
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field long currentByteBufferPos>
	//    5    9:ladd            
	//    6   10:aload_0         
	//    7   11:getfield        #64  <Field long currentByteBufferStartPos>
	//    8   14:lsub            
	//    9   15:aload_0         
	//   10   16:getfield        #38  <Field int totalBufferSize>
	//   11   19:i2l             
	//   12   20:lcmp            
	//   13   21:ifne            26
	//   14   24:iconst_1        
	//   15   25:ireturn         
	//   16   26:iconst_0        
	//   17   27:ireturn         
	}

	public void popLimit(int i)
	{
		currentLimit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int currentLimit>
		recomputeBufferSizeAfterLimit();
	//    3    5:aload_0         
	//    4    6:invokespecial   #179 <Method void recomputeBufferSizeAfterLimit()>
	//    5    9:return          
	}

	public int pushLimit(int i)
		throws InvalidProtocolBufferException
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw InvalidProtocolBufferException.negativeSize();
	//    2    4:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//    3    7:athrow          
		i += getTotalBytesRead();
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #174 <Method int getTotalBytesRead()>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = currentLimit;
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field int currentLimit>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   15   25:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   16   28:athrow          
		} else
		{
			currentLimit = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #36  <Field int currentLimit>
			recomputeBufferSizeAfterLimit();
	//   20   34:aload_0         
	//   21   35:invokespecial   #179 <Method void recomputeBufferSizeAfterLimit()>
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
	//    1    1:invokevirtual   #185 <Method long readRawVarint64()>
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
	//    2    2:invokevirtual   #190 <Method int readRawVarint32()>
	//    3    5:invokevirtual   #194 <Method byte[] readRawBytes(int)>
	//    4    8:areturn         
	}

	public ByteBuffer readByteBuffer()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && (long)i <= currentRemaining())
	//*   3    5:iload_1         
	//*   4    6:ifle            103
	//*   5    9:iload_1         
	//*   6   10:i2l             
	//*   7   11:aload_0         
	//*   8   12:invokespecial   #104 <Method long currentRemaining()>
	//*   9   15:lcmp            
	//*  10   16:ifgt            103
			if(!immutable && enableAliasing)
	//*  11   19:aload_0         
	//*  12   20:getfield        #49  <Field boolean immutable>
	//*  13   23:ifne            72
	//*  14   26:aload_0         
	//*  15   27:getfield        #170 <Field boolean enableAliasing>
	//*  16   30:ifeq            72
			{
				currentByteBufferPos = currentByteBufferPos + (long)i;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #62  <Field long currentByteBufferPos>
	//   20   38:iload_1         
	//   21   39:i2l             
	//   22   40:ladd            
	//   23   41:putfield        #62  <Field long currentByteBufferPos>
				return slice((int)(currentByteBufferPos - currentAddress - (long)i), (int)(currentByteBufferPos - currentAddress));
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:getfield        #62  <Field long currentByteBufferPos>
	//   27   49:aload_0         
	//   28   50:getfield        #68  <Field long currentAddress>
	//   29   53:lsub            
	//   30   54:iload_1         
	//   31   55:i2l             
	//   32   56:lsub            
	//   33   57:l2i             
	//   34   58:aload_0         
	//   35   59:getfield        #62  <Field long currentByteBufferPos>
	//   36   62:aload_0         
	//   37   63:getfield        #68  <Field long currentAddress>
	//   38   66:lsub            
	//   39   67:l2i             
	//   40   68:invokespecial   #197 <Method ByteBuffer slice(int, int)>
	//   41   71:areturn         
			} else
			{
				byte abyte0[] = new byte[i];
	//   42   72:iload_1         
	//   43   73:newarray        byte[]
	//   44   75:astore_2        
				UnsafeUtil.copyMemory(currentByteBufferPos, abyte0, 0L, i);
	//   45   76:aload_0         
	//   46   77:getfield        #62  <Field long currentByteBufferPos>
	//   47   80:aload_2         
	//   48   81:lconst_0        
	//   49   82:iload_1         
	//   50   83:i2l             
	//   51   84:invokestatic    #118 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
				currentByteBufferPos = currentByteBufferPos + (long)i;
	//   52   87:aload_0         
	//   53   88:aload_0         
	//   54   89:getfield        #62  <Field long currentByteBufferPos>
	//   55   92:iload_1         
	//   56   93:i2l             
	//   57   94:ladd            
	//   58   95:putfield        #62  <Field long currentByteBufferPos>
				return ByteBuffer.wrap(abyte0);
	//   59   98:aload_2         
	//   60   99:invokestatic    #201 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   61  102:areturn         
			}
		if(i > 0 && i <= remaining())
	//*  62  103:iload_1         
	//*  63  104:ifle            131
	//*  64  107:iload_1         
	//*  65  108:aload_0         
	//*  66  109:invokespecial   #102 <Method int remaining()>
	//*  67  112:icmpgt          131
		{
			byte abyte1[] = new byte[i];
	//   68  115:iload_1         
	//   69  116:newarray        byte[]
	//   70  118:astore_2        
			readRawBytesTo(abyte1, 0, i);
	//   71  119:aload_0         
	//   72  120:aload_2         
	//   73  121:iconst_0        
	//   74  122:iload_1         
	//   75  123:invokespecial   #203 <Method void readRawBytesTo(byte[], int, int)>
			return ByteBuffer.wrap(abyte1);
	//   76  126:aload_2         
	//   77  127:invokestatic    #201 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   78  130:areturn         
		}
		if(i == 0)
	//*  79  131:iload_1         
	//*  80  132:ifne            139
			return Internal.EMPTY_BYTE_BUFFER;
	//   81  135:getstatic       #58  <Field ByteBuffer Internal.EMPTY_BYTE_BUFFER>
	//   82  138:areturn         
		if(i < 0)
	//*  83  139:iload_1         
	//*  84  140:ifge            147
			throw InvalidProtocolBufferException.negativeSize();
	//   85  143:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   86  146:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   87  147:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   88  150:athrow          
	}

	public ByteString readBytes()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && (long)i <= currentByteBufferLimit - currentByteBufferPos)
	//*   3    5:iload_1         
	//*   4    6:ifle            105
	//*   5    9:iload_1         
	//*   6   10:i2l             
	//*   7   11:aload_0         
	//*   8   12:getfield        #66  <Field long currentByteBufferLimit>
	//*   9   15:aload_0         
	//*  10   16:getfield        #62  <Field long currentByteBufferPos>
	//*  11   19:lsub            
	//*  12   20:lcmp            
	//*  13   21:ifgt            105
			if(immutable && enableAliasing)
	//*  14   24:aload_0         
	//*  15   25:getfield        #49  <Field boolean immutable>
	//*  16   28:ifeq            74
	//*  17   31:aload_0         
	//*  18   32:getfield        #170 <Field boolean enableAliasing>
	//*  19   35:ifeq            74
			{
				int j = (int)(currentByteBufferPos - currentAddress);
	//   20   38:aload_0         
	//   21   39:getfield        #62  <Field long currentByteBufferPos>
	//   22   42:aload_0         
	//   23   43:getfield        #68  <Field long currentAddress>
	//   24   46:lsub            
	//   25   47:l2i             
	//   26   48:istore_2        
				ByteString bytestring = ByteString.wrap(slice(j, j + i));
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:iload_2         
	//   30   52:iload_1         
	//   31   53:iadd            
	//   32   54:invokespecial   #197 <Method ByteBuffer slice(int, int)>
	//   33   57:invokestatic    #210 <Method ByteString ByteString.wrap(ByteBuffer)>
	//   34   60:astore_3        
				currentByteBufferPos = currentByteBufferPos + (long)i;
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #62  <Field long currentByteBufferPos>
	//   38   66:iload_1         
	//   39   67:i2l             
	//   40   68:ladd            
	//   41   69:putfield        #62  <Field long currentByteBufferPos>
				return bytestring;
	//   42   72:aload_3         
	//   43   73:areturn         
			} else
			{
				byte abyte0[] = new byte[i];
	//   44   74:iload_1         
	//   45   75:newarray        byte[]
	//   46   77:astore_3        
				UnsafeUtil.copyMemory(currentByteBufferPos, abyte0, 0L, i);
	//   47   78:aload_0         
	//   48   79:getfield        #62  <Field long currentByteBufferPos>
	//   49   82:aload_3         
	//   50   83:lconst_0        
	//   51   84:iload_1         
	//   52   85:i2l             
	//   53   86:invokestatic    #118 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
				currentByteBufferPos = currentByteBufferPos + (long)i;
	//   54   89:aload_0         
	//   55   90:aload_0         
	//   56   91:getfield        #62  <Field long currentByteBufferPos>
	//   57   94:iload_1         
	//   58   95:i2l             
	//   59   96:ladd            
	//   60   97:putfield        #62  <Field long currentByteBufferPos>
				return ByteString.wrap(abyte0);
	//   61  100:aload_3         
	//   62  101:invokestatic    #213 <Method ByteString ByteString.wrap(byte[])>
	//   63  104:areturn         
			}
		if(i > 0 && i <= remaining())
	//*  64  105:iload_1         
	//*  65  106:ifle            133
	//*  66  109:iload_1         
	//*  67  110:aload_0         
	//*  68  111:invokespecial   #102 <Method int remaining()>
	//*  69  114:icmpgt          133
		{
			byte abyte1[] = new byte[i];
	//   70  117:iload_1         
	//   71  118:newarray        byte[]
	//   72  120:astore_3        
			readRawBytesTo(abyte1, 0, i);
	//   73  121:aload_0         
	//   74  122:aload_3         
	//   75  123:iconst_0        
	//   76  124:iload_1         
	//   77  125:invokespecial   #203 <Method void readRawBytesTo(byte[], int, int)>
			return ByteString.wrap(abyte1);
	//   78  128:aload_3         
	//   79  129:invokestatic    #213 <Method ByteString ByteString.wrap(byte[])>
	//   80  132:areturn         
		}
		if(i == 0)
	//*  81  133:iload_1         
	//*  82  134:ifne            141
			return ByteString.EMPTY;
	//   83  137:getstatic       #217 <Field ByteString ByteString.EMPTY>
	//   84  140:areturn         
		if(i < 0)
	//*  85  141:iload_1         
	//*  86  142:ifge            149
			throw InvalidProtocolBufferException.negativeSize();
	//   87  145:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   88  148:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   89  149:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   90  152:athrow          
	}

	public double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(readRawLittleEndian64());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method long readRawLittleEndian64()>
	//    2    4:invokestatic    #228 <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public int readEnum()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public int readFixed32()
		throws IOException
	{
		return readRawLittleEndian32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method int readRawLittleEndian32()>
	//    2    4:ireturn         
	}

	public long readFixed64()
		throws IOException
	{
		return readRawLittleEndian64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method long readRawLittleEndian64()>
	//    2    4:lreturn         
	}

	public float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(readRawLittleEndian32());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method int readRawLittleEndian32()>
	//    2    4:invokestatic    #242 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		if(recursionDepth >= recursionLimit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field int recursionDepth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #250 <Field int recursionLimit>
	//*   4    8:icmplt          15
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    5   11:invokestatic    #253 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    6   14:athrow          
		} else
		{
			recursionDepth = recursionDepth + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #247 <Field int recursionDepth>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #247 <Field int recursionDepth>
			parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokeinterface #259 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//   17   33:checkcast       #261 <Class MessageLite>
	//   18   36:astore_2        
			checkLastTagWas(WireFormat.makeTag(i, 4));
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:iconst_4        
	//   22   40:invokestatic    #266 <Method int WireFormat.makeTag(int, int)>
	//   23   43:invokevirtual   #268 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #247 <Field int recursionDepth>
	//   27   51:iconst_1        
	//   28   52:isub            
	//   29   53:putfield        #247 <Field int recursionDepth>
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
	//*   1    1:getfield        #247 <Field int recursionDepth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #250 <Field int recursionLimit>
	//*   4    8:icmplt          15
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    5   11:invokestatic    #253 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    6   14:athrow          
		} else
		{
			recursionDepth = recursionDepth + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #247 <Field int recursionDepth>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #247 <Field int recursionDepth>
			builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokeinterface #276 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//   17   33:pop             
			checkLastTagWas(WireFormat.makeTag(i, 4));
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:iconst_4        
	//   21   37:invokestatic    #266 <Method int WireFormat.makeTag(int, int)>
	//   22   40:invokevirtual   #268 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #247 <Field int recursionDepth>
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:putfield        #247 <Field int recursionDepth>
			return;
	//   29   53:return          
		}
	}

	public int readInt32()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public long readInt64()
		throws IOException
	{
		return readRawVarint64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method long readRawVarint64()>
	//    2    4:lreturn         
	}

	public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:istore_3        
		if(recursionDepth >= recursionLimit)
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field int recursionDepth>
	//*   5    9:aload_0         
	//*   6   10:getfield        #250 <Field int recursionLimit>
	//*   7   13:icmplt          20
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    8   16:invokestatic    #253 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    9   19:athrow          
		} else
		{
			i = pushLimit(i);
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #282 <Method int pushLimit(int)>
	//   13   25:istore_3        
			recursionDepth = recursionDepth + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #247 <Field int recursionDepth>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #247 <Field int recursionDepth>
			parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokeinterface #259 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//   24   44:checkcast       #261 <Class MessageLite>
	//   25   47:astore_1        
			checkLastTagWas(0);
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #268 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #247 <Field int recursionDepth>
	//   32   58:iconst_1        
	//   33   59:isub            
	//   34   60:putfield        #247 <Field int recursionDepth>
			popLimit(i);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:invokevirtual   #284 <Method void popLimit(int)>
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
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:istore_3        
		if(recursionDepth >= recursionLimit)
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field int recursionDepth>
	//*   5    9:aload_0         
	//*   6   10:getfield        #250 <Field int recursionLimit>
	//*   7   13:icmplt          20
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    8   16:invokestatic    #253 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    9   19:athrow          
		} else
		{
			i = pushLimit(i);
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #282 <Method int pushLimit(int)>
	//   13   25:istore_3        
			recursionDepth = recursionDepth + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #247 <Field int recursionDepth>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #247 <Field int recursionDepth>
			builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokeinterface #276 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//   24   44:pop             
			checkLastTagWas(0);
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #268 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   28   50:aload_0         
	//   29   51:aload_0         
	//   30   52:getfield        #247 <Field int recursionDepth>
	//   31   55:iconst_1        
	//   32   56:isub            
	//   33   57:putfield        #247 <Field int recursionDepth>
			popLimit(i);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:invokevirtual   #284 <Method void popLimit(int)>
			return;
	//   37   65:return          
		}
	}

	public byte readRawByte()
		throws IOException
	{
		if(currentRemaining() == 0L)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #104 <Method long currentRemaining()>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifne            13
			getNextByteBuffer();
	//    5    9:aload_0         
	//    6   10:invokespecial   #106 <Method void getNextByteBuffer()>
		long l = currentByteBufferPos;
	//    7   13:aload_0         
	//    8   14:getfield        #62  <Field long currentByteBufferPos>
	//    9   17:lstore_1        
		currentByteBufferPos = 1L + l;
	//   10   18:aload_0         
	//   11   19:lconst_1        
	//   12   20:lload_1         
	//   13   21:ladd            
	//   14   22:putfield        #62  <Field long currentByteBufferPos>
		return UnsafeUtil.getByte(l);
	//   15   25:lload_1         
	//   16   26:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   17   29:ireturn         
	}

	public byte[] readRawBytes(int i)
		throws IOException
	{
		if(i >= 0 && (long)i <= currentRemaining())
	//*   0    0:iload_1         
	//*   1    1:iflt            42
	//*   2    4:iload_1         
	//*   3    5:i2l             
	//*   4    6:aload_0         
	//*   5    7:invokespecial   #104 <Method long currentRemaining()>
	//*   6   10:lcmp            
	//*   7   11:ifgt            42
		{
			byte abyte0[] = new byte[i];
	//    8   14:iload_1         
	//    9   15:newarray        byte[]
	//   10   17:astore_2        
			UnsafeUtil.copyMemory(currentByteBufferPos, abyte0, 0L, i);
	//   11   18:aload_0         
	//   12   19:getfield        #62  <Field long currentByteBufferPos>
	//   13   22:aload_2         
	//   14   23:lconst_0        
	//   15   24:iload_1         
	//   16   25:i2l             
	//   17   26:invokestatic    #118 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
			currentByteBufferPos = currentByteBufferPos + (long)i;
	//   18   29:aload_0         
	//   19   30:aload_0         
	//   20   31:getfield        #62  <Field long currentByteBufferPos>
	//   21   34:iload_1         
	//   22   35:i2l             
	//   23   36:ladd            
	//   24   37:putfield        #62  <Field long currentByteBufferPos>
			return abyte0;
	//   25   40:aload_2         
	//   26   41:areturn         
		}
		if(i >= 0 && i <= remaining())
	//*  27   42:iload_1         
	//*  28   43:iflt            67
	//*  29   46:iload_1         
	//*  30   47:aload_0         
	//*  31   48:invokespecial   #102 <Method int remaining()>
	//*  32   51:icmpgt          67
		{
			byte abyte1[] = new byte[i];
	//   33   54:iload_1         
	//   34   55:newarray        byte[]
	//   35   57:astore_2        
			readRawBytesTo(abyte1, 0, i);
	//   36   58:aload_0         
	//   37   59:aload_2         
	//   38   60:iconst_0        
	//   39   61:iload_1         
	//   40   62:invokespecial   #203 <Method void readRawBytesTo(byte[], int, int)>
			return abyte1;
	//   41   65:aload_2         
	//   42   66:areturn         
		}
		if(i <= 0)
	//*  43   67:iload_1         
	//*  44   68:ifgt            83
		{
			if(i == 0)
	//*  45   71:iload_1         
	//*  46   72:ifne            79
				return Internal.EMPTY_BYTE_ARRAY;
	//   47   75:getstatic       #294 <Field byte[] Internal.EMPTY_BYTE_ARRAY>
	//   48   78:areturn         
			else
				throw InvalidProtocolBufferException.negativeSize();
	//   49   79:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   50   82:athrow          
		} else
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   51   83:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   52   86:athrow          
		}
	}

	public int readRawLittleEndian32()
		throws IOException
	{
		if(currentRemaining() >= 4L)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #104 <Method long currentRemaining()>
	//*   2    4:ldc2w           #295 <Long 4L>
	//*   3    7:lcmp            
	//*   4    8:iflt            83
		{
			long l = currentByteBufferPos;
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field long currentByteBufferPos>
	//    7   15:lstore_1        
			currentByteBufferPos = currentByteBufferPos + 4L;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field long currentByteBufferPos>
	//   11   21:ldc2w           #295 <Long 4L>
	//   12   24:ladd            
	//   13   25:putfield        #62  <Field long currentByteBufferPos>
			return UnsafeUtil.getByte(l) & 0xff | (UnsafeUtil.getByte(1L + l) & 0xff) << 8 | (UnsafeUtil.getByte(2L + l) & 0xff) << 16 | (UnsafeUtil.getByte(3L + l) & 0xff) << 24;
	//   14   28:lload_1         
	//   15   29:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   16   32:sipush          255
	//   17   35:iand            
	//   18   36:lconst_1        
	//   19   37:lload_1         
	//   20   38:ladd            
	//   21   39:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   22   42:sipush          255
	//   23   45:iand            
	//   24   46:bipush          8
	//   25   48:ishl            
	//   26   49:ior             
	//   27   50:ldc2w           #297 <Long 2L>
	//   28   53:lload_1         
	//   29   54:ladd            
	//   30   55:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   31   58:sipush          255
	//   32   61:iand            
	//   33   62:bipush          16
	//   34   64:ishl            
	//   35   65:ior             
	//   36   66:ldc2w           #299 <Long 3L>
	//   37   69:lload_1         
	//   38   70:ladd            
	//   39   71:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   40   74:sipush          255
	//   41   77:iand            
	//   42   78:bipush          24
	//   43   80:ishl            
	//   44   81:ior             
	//   45   82:ireturn         
		} else
		{
			return readRawByte() & 0xff | (readRawByte() & 0xff) << 8 | (readRawByte() & 0xff) << 16 | (readRawByte() & 0xff) << 24;
	//   46   83:aload_0         
	//   47   84:invokevirtual   #129 <Method byte readRawByte()>
	//   48   87:sipush          255
	//   49   90:iand            
	//   50   91:aload_0         
	//   51   92:invokevirtual   #129 <Method byte readRawByte()>
	//   52   95:sipush          255
	//   53   98:iand            
	//   54   99:bipush          8
	//   55  101:ishl            
	//   56  102:ior             
	//   57  103:aload_0         
	//   58  104:invokevirtual   #129 <Method byte readRawByte()>
	//   59  107:sipush          255
	//   60  110:iand            
	//   61  111:bipush          16
	//   62  113:ishl            
	//   63  114:ior             
	//   64  115:aload_0         
	//   65  116:invokevirtual   #129 <Method byte readRawByte()>
	//   66  119:sipush          255
	//   67  122:iand            
	//   68  123:bipush          24
	//   69  125:ishl            
	//   70  126:ior             
	//   71  127:ireturn         
		}
	}

	public long readRawLittleEndian64()
		throws IOException
	{
		if(currentRemaining() >= 8L)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #104 <Method long currentRemaining()>
	//*   2    4:ldc2w           #301 <Long 8L>
	//*   3    7:lcmp            
	//*   4    8:iflt            155
		{
			long l = currentByteBufferPos;
	//    5   11:aload_0         
	//    6   12:getfield        #62  <Field long currentByteBufferPos>
	//    7   15:lstore_1        
			currentByteBufferPos = currentByteBufferPos + 8L;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field long currentByteBufferPos>
	//   11   21:ldc2w           #301 <Long 8L>
	//   12   24:ladd            
	//   13   25:putfield        #62  <Field long currentByteBufferPos>
			return (long)UnsafeUtil.getByte(l) & 255L | ((long)UnsafeUtil.getByte(1L + l) & 255L) << 8 | ((long)UnsafeUtil.getByte(2L + l) & 255L) << 16 | ((long)UnsafeUtil.getByte(3L + l) & 255L) << 24 | ((long)UnsafeUtil.getByte(4L + l) & 255L) << 32 | ((long)UnsafeUtil.getByte(5L + l) & 255L) << 40 | ((long)UnsafeUtil.getByte(6L + l) & 255L) << 48 | ((long)UnsafeUtil.getByte(7L + l) & 255L) << 56;
	//   14   28:lload_1         
	//   15   29:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   16   32:i2l             
	//   17   33:ldc2w           #303 <Long 255L>
	//   18   36:land            
	//   19   37:lconst_1        
	//   20   38:lload_1         
	//   21   39:ladd            
	//   22   40:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   23   43:i2l             
	//   24   44:ldc2w           #303 <Long 255L>
	//   25   47:land            
	//   26   48:bipush          8
	//   27   50:lshl            
	//   28   51:lor             
	//   29   52:ldc2w           #297 <Long 2L>
	//   30   55:lload_1         
	//   31   56:ladd            
	//   32   57:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   33   60:i2l             
	//   34   61:ldc2w           #303 <Long 255L>
	//   35   64:land            
	//   36   65:bipush          16
	//   37   67:lshl            
	//   38   68:lor             
	//   39   69:ldc2w           #299 <Long 3L>
	//   40   72:lload_1         
	//   41   73:ladd            
	//   42   74:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   43   77:i2l             
	//   44   78:ldc2w           #303 <Long 255L>
	//   45   81:land            
	//   46   82:bipush          24
	//   47   84:lshl            
	//   48   85:lor             
	//   49   86:ldc2w           #295 <Long 4L>
	//   50   89:lload_1         
	//   51   90:ladd            
	//   52   91:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   53   94:i2l             
	//   54   95:ldc2w           #303 <Long 255L>
	//   55   98:land            
	//   56   99:bipush          32
	//   57  101:lshl            
	//   58  102:lor             
	//   59  103:ldc2w           #305 <Long 5L>
	//   60  106:lload_1         
	//   61  107:ladd            
	//   62  108:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   63  111:i2l             
	//   64  112:ldc2w           #303 <Long 255L>
	//   65  115:land            
	//   66  116:bipush          40
	//   67  118:lshl            
	//   68  119:lor             
	//   69  120:ldc2w           #307 <Long 6L>
	//   70  123:lload_1         
	//   71  124:ladd            
	//   72  125:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   73  128:i2l             
	//   74  129:ldc2w           #303 <Long 255L>
	//   75  132:land            
	//   76  133:bipush          48
	//   77  135:lshl            
	//   78  136:lor             
	//   79  137:ldc2w           #309 <Long 7L>
	//   80  140:lload_1         
	//   81  141:ladd            
	//   82  142:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   83  145:i2l             
	//   84  146:ldc2w           #303 <Long 255L>
	//   85  149:land            
	//   86  150:bipush          56
	//   87  152:lshl            
	//   88  153:lor             
	//   89  154:lreturn         
		} else
		{
			return (long)readRawByte() & 255L | ((long)readRawByte() & 255L) << 8 | ((long)readRawByte() & 255L) << 16 | ((long)readRawByte() & 255L) << 24 | ((long)readRawByte() & 255L) << 32 | ((long)readRawByte() & 255L) << 40 | ((long)readRawByte() & 255L) << 48 | ((long)readRawByte() & 255L) << 56;
	//   90  155:aload_0         
	//   91  156:invokevirtual   #129 <Method byte readRawByte()>
	//   92  159:i2l             
	//   93  160:ldc2w           #303 <Long 255L>
	//   94  163:land            
	//   95  164:aload_0         
	//   96  165:invokevirtual   #129 <Method byte readRawByte()>
	//   97  168:i2l             
	//   98  169:ldc2w           #303 <Long 255L>
	//   99  172:land            
	//  100  173:bipush          8
	//  101  175:lshl            
	//  102  176:lor             
	//  103  177:aload_0         
	//  104  178:invokevirtual   #129 <Method byte readRawByte()>
	//  105  181:i2l             
	//  106  182:ldc2w           #303 <Long 255L>
	//  107  185:land            
	//  108  186:bipush          16
	//  109  188:lshl            
	//  110  189:lor             
	//  111  190:aload_0         
	//  112  191:invokevirtual   #129 <Method byte readRawByte()>
	//  113  194:i2l             
	//  114  195:ldc2w           #303 <Long 255L>
	//  115  198:land            
	//  116  199:bipush          24
	//  117  201:lshl            
	//  118  202:lor             
	//  119  203:aload_0         
	//  120  204:invokevirtual   #129 <Method byte readRawByte()>
	//  121  207:i2l             
	//  122  208:ldc2w           #303 <Long 255L>
	//  123  211:land            
	//  124  212:bipush          32
	//  125  214:lshl            
	//  126  215:lor             
	//  127  216:aload_0         
	//  128  217:invokevirtual   #129 <Method byte readRawByte()>
	//  129  220:i2l             
	//  130  221:ldc2w           #303 <Long 255L>
	//  131  224:land            
	//  132  225:bipush          40
	//  133  227:lshl            
	//  134  228:lor             
	//  135  229:aload_0         
	//  136  230:invokevirtual   #129 <Method byte readRawByte()>
	//  137  233:i2l             
	//  138  234:ldc2w           #303 <Long 255L>
	//  139  237:land            
	//  140  238:bipush          48
	//  141  240:lshl            
	//  142  241:lor             
	//  143  242:aload_0         
	//  144  243:invokevirtual   #129 <Method byte readRawByte()>
	//  145  246:i2l             
	//  146  247:ldc2w           #303 <Long 255L>
	//  147  250:land            
	//  148  251:bipush          56
	//  149  253:lshl            
	//  150  254:lor             
	//  151  255:lreturn         
		}
	}

	public int readRawVarint32()
		throws IOException
	{
label0:
		{
			long l = currentByteBufferPos;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field long currentByteBufferPos>
	//    2    4:lstore          4
			if(currentByteBufferLimit == currentByteBufferPos)
	//*   3    6:aload_0         
	//*   4    7:getfield        #66  <Field long currentByteBufferLimit>
	//*   5   10:aload_0         
	//*   6   11:getfield        #62  <Field long currentByteBufferPos>
	//*   7   14:lcmp            
	//*   8   15:ifne            21
				break label0;
	//    9   18:goto            301
			long l1 = 1L + l;
	//   10   21:lconst_1        
	//   11   22:lload           4
	//   12   24:ladd            
	//   13   25:lstore          6
			int i = ((int) (UnsafeUtil.getByte(l)));
	//   14   27:lload           4
	//   15   29:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   16   32:istore_1        
			if(i >= 0)
	//*  17   33:iload_1         
	//*  18   34:iflt            49
			{
				currentByteBufferPos = currentByteBufferPos + 1L;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #62  <Field long currentByteBufferPos>
	//   22   42:lconst_1        
	//   23   43:ladd            
	//   24   44:putfield        #62  <Field long currentByteBufferPos>
				return i;
	//   25   47:iload_1         
	//   26   48:ireturn         
			}
			if(currentByteBufferLimit - currentByteBufferPos < 10L)
	//*  27   49:aload_0         
	//*  28   50:getfield        #66  <Field long currentByteBufferLimit>
	//*  29   53:aload_0         
	//*  30   54:getfield        #62  <Field long currentByteBufferPos>
	//*  31   57:lsub            
	//*  32   58:ldc2w           #311 <Long 10L>
	//*  33   61:lcmp            
	//*  34   62:ifge            68
				break label0;
	//   35   65:goto            301
			l = 1L + l1;
	//   36   68:lconst_1        
	//   37   69:lload           6
	//   38   71:ladd            
	//   39   72:lstore          4
			i = UnsafeUtil.getByte(l1) << 7 ^ i;
	//   40   74:lload           6
	//   41   76:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   42   79:bipush          7
	//   43   81:ishl            
	//   44   82:iload_1         
	//   45   83:ixor            
	//   46   84:istore_1        
			if(i < 0)
	//*  47   85:iload_1         
	//*  48   86:ifge            97
			{
				i ^= 0xffffff80;
	//   49   89:iload_1         
	//   50   90:bipush          -128
	//   51   92:ixor            
	//   52   93:istore_1        
			} else
	//*  53   94:goto            293
			{
				long l2 = 1L + l;
	//   54   97:lconst_1        
	//   55   98:lload           4
	//   56  100:ladd            
	//   57  101:lstore          6
				i = UnsafeUtil.getByte(l) << 14 ^ i;
	//   58  103:lload           4
	//   59  105:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   60  108:bipush          14
	//   61  110:ishl            
	//   62  111:iload_1         
	//   63  112:ixor            
	//   64  113:istore_1        
				if(i >= 0)
	//*  65  114:iload_1         
	//*  66  115:iflt            131
				{
					i ^= 0x3f80;
	//   67  118:iload_1         
	//   68  119:sipush          16256
	//   69  122:ixor            
	//   70  123:istore_1        
					l = l2;
	//   71  124:lload           6
	//   72  126:lstore          4
				} else
	//*  73  128:goto            293
				{
					l = 1L + l2;
	//   74  131:lconst_1        
	//   75  132:lload           6
	//   76  134:ladd            
	//   77  135:lstore          4
					i = UnsafeUtil.getByte(l2) << 21 ^ i;
	//   78  137:lload           6
	//   79  139:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   80  142:bipush          21
	//   81  144:ishl            
	//   82  145:iload_1         
	//   83  146:ixor            
	//   84  147:istore_1        
					if(i < 0)
	//*  85  148:iload_1         
	//*  86  149:ifge            161
					{
						i ^= 0xffe03f80;
	//   87  152:iload_1         
	//   88  153:ldc2            #313 <Int 0xffe03f80>
	//   89  156:ixor            
	//   90  157:istore_1        
					} else
	//*  91  158:goto            293
					{
						long l3 = 1L + l;
	//   92  161:lconst_1        
	//   93  162:lload           4
	//   94  164:ladd            
	//   95  165:lstore          6
						byte byte0 = UnsafeUtil.getByte(l);
	//   96  167:lload           4
	//   97  169:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   98  172:istore_3        
						int j = i ^ byte0 << 28 ^ 0xfe03f80;
	//   99  173:iload_1         
	//  100  174:iload_3         
	//  101  175:bipush          28
	//  102  177:ishl            
	//  103  178:ixor            
	//  104  179:ldc2            #314 <Int 0xfe03f80>
	//  105  182:ixor            
	//  106  183:istore_2        
						l = l3;
	//  107  184:lload           6
	//  108  186:lstore          4
						i = j;
	//  109  188:iload_2         
	//  110  189:istore_1        
						if(byte0 < 0)
	//* 111  190:iload_3         
	//* 112  191:ifge            293
						{
							long l6 = 1L + l3;
	//  113  194:lconst_1        
	//  114  195:lload           6
	//  115  197:ladd            
	//  116  198:lstore          8
							l = l6;
	//  117  200:lload           8
	//  118  202:lstore          4
							i = j;
	//  119  204:iload_2         
	//  120  205:istore_1        
							if(UnsafeUtil.getByte(l3) < 0)
	//* 121  206:lload           6
	//* 122  208:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//* 123  211:ifge            293
							{
								long l4 = 1L + l6;
	//  124  214:lconst_1        
	//  125  215:lload           8
	//  126  217:ladd            
	//  127  218:lstore          6
								l = l4;
	//  128  220:lload           6
	//  129  222:lstore          4
								i = j;
	//  130  224:iload_2         
	//  131  225:istore_1        
								if(UnsafeUtil.getByte(l6) < 0)
	//* 132  226:lload           8
	//* 133  228:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//* 134  231:ifge            293
								{
									long l7 = 1L + l4;
	//  135  234:lconst_1        
	//  136  235:lload           6
	//  137  237:ladd            
	//  138  238:lstore          8
									l = l7;
	//  139  240:lload           8
	//  140  242:lstore          4
									i = j;
	//  141  244:iload_2         
	//  142  245:istore_1        
									if(UnsafeUtil.getByte(l4) < 0)
	//* 143  246:lload           6
	//* 144  248:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//* 145  251:ifge            293
									{
										long l5 = 1L + l7;
	//  146  254:lconst_1        
	//  147  255:lload           8
	//  148  257:ladd            
	//  149  258:lstore          6
										l = l5;
	//  150  260:lload           6
	//  151  262:lstore          4
										i = j;
	//  152  264:iload_2         
	//  153  265:istore_1        
										if(UnsafeUtil.getByte(l7) < 0)
	//* 154  266:lload           8
	//* 155  268:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//* 156  271:ifge            293
										{
											l = 1L + l5;
	//  157  274:lconst_1        
	//  158  275:lload           6
	//  159  277:ladd            
	//  160  278:lstore          4
											i = j;
	//  161  280:iload_2         
	//  162  281:istore_1        
											if(UnsafeUtil.getByte(l5) < 0)
	//* 163  282:lload           6
	//* 164  284:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//* 165  287:ifge            293
												break label0;
	//  166  290:goto            301
										}
									}
								}
							}
						}
					}
				}
			}
			currentByteBufferPos = l;
	//  167  293:aload_0         
	//  168  294:lload           4
	//  169  296:putfield        #62  <Field long currentByteBufferPos>
			return i;
	//  170  299:iload_1         
	//  171  300:ireturn         
		}
		return (int)readRawVarint64SlowPath();
	//  172  301:aload_0         
	//  173  302:invokevirtual   #317 <Method long readRawVarint64SlowPath()>
	//  174  305:l2i             
	//  175  306:ireturn         
	}

	public long readRawVarint64()
		throws IOException
	{
label0:
		{
			long l = currentByteBufferPos;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field long currentByteBufferPos>
	//    2    4:lstore_2        
			if(currentByteBufferLimit == currentByteBufferPos)
	//*   3    5:aload_0         
	//*   4    6:getfield        #66  <Field long currentByteBufferLimit>
	//*   5    9:aload_0         
	//*   6   10:getfield        #62  <Field long currentByteBufferPos>
	//*   7   13:lcmp            
	//*   8   14:ifne            20
				break label0;
	//    9   17:goto            397
			long l1 = 1L + l;
	//   10   20:lconst_1        
	//   11   21:lload_2         
	//   12   22:ladd            
	//   13   23:lstore          4
			int i = ((int) (UnsafeUtil.getByte(l)));
	//   14   25:lload_2         
	//   15   26:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   16   29:istore_1        
			if(i >= 0)
	//*  17   30:iload_1         
	//*  18   31:iflt            47
			{
				currentByteBufferPos = currentByteBufferPos + 1L;
	//   19   34:aload_0         
	//   20   35:aload_0         
	//   21   36:getfield        #62  <Field long currentByteBufferPos>
	//   22   39:lconst_1        
	//   23   40:ladd            
	//   24   41:putfield        #62  <Field long currentByteBufferPos>
				return (long)i;
	//   25   44:iload_1         
	//   26   45:i2l             
	//   27   46:lreturn         
			}
			if(currentByteBufferLimit - currentByteBufferPos < 10L)
	//*  28   47:aload_0         
	//*  29   48:getfield        #66  <Field long currentByteBufferLimit>
	//*  30   51:aload_0         
	//*  31   52:getfield        #62  <Field long currentByteBufferPos>
	//*  32   55:lsub            
	//*  33   56:ldc2w           #311 <Long 10L>
	//*  34   59:lcmp            
	//*  35   60:ifge            66
				break label0;
	//   36   63:goto            397
			l = 1L + l1;
	//   37   66:lconst_1        
	//   38   67:lload           4
	//   39   69:ladd            
	//   40   70:lstore_2        
			i = UnsafeUtil.getByte(l1) << 7 ^ i;
	//   41   71:lload           4
	//   42   73:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   43   76:bipush          7
	//   44   78:ishl            
	//   45   79:iload_1         
	//   46   80:ixor            
	//   47   81:istore_1        
			if(i < 0)
	//*  48   82:iload_1         
	//*  49   83:ifge            96
			{
				l1 = i ^ 0xffffff80;
	//   50   86:iload_1         
	//   51   87:bipush          -128
	//   52   89:ixor            
	//   53   90:i2l             
	//   54   91:lstore          4
			} else
	//*  55   93:goto            389
			{
				long l2 = 1L + l;
	//   56   96:lconst_1        
	//   57   97:lload_2         
	//   58   98:ladd            
	//   59   99:lstore          6
				i = UnsafeUtil.getByte(l) << 14 ^ i;
	//   60  101:lload_2         
	//   61  102:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   62  105:bipush          14
	//   63  107:ishl            
	//   64  108:iload_1         
	//   65  109:ixor            
	//   66  110:istore_1        
				if(i >= 0)
	//*  67  111:iload_1         
	//*  68  112:iflt            129
				{
					l1 = i ^ 0x3f80;
	//   69  115:iload_1         
	//   70  116:sipush          16256
	//   71  119:ixor            
	//   72  120:i2l             
	//   73  121:lstore          4
					l = l2;
	//   74  123:lload           6
	//   75  125:lstore_2        
				} else
	//*  76  126:goto            389
				{
					l1 = 1L + l2;
	//   77  129:lconst_1        
	//   78  130:lload           6
	//   79  132:ladd            
	//   80  133:lstore          4
					i = UnsafeUtil.getByte(l2) << 21 ^ i;
	//   81  135:lload           6
	//   82  137:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//   83  140:bipush          21
	//   84  142:ishl            
	//   85  143:iload_1         
	//   86  144:ixor            
	//   87  145:istore_1        
					if(i < 0)
	//*  88  146:iload_1         
	//*  89  147:ifge            168
					{
						long l3 = 0xffe03f80 ^ i;
	//   90  150:ldc2            #313 <Int 0xffe03f80>
	//   91  153:iload_1         
	//   92  154:ixor            
	//   93  155:i2l             
	//   94  156:lstore          6
						l = l1;
	//   95  158:lload           4
	//   96  160:lstore_2        
						l1 = l3;
	//   97  161:lload           6
	//   98  163:lstore          4
					} else
	//*  99  165:goto            389
					{
						long l4 = i;
	//  100  168:iload_1         
	//  101  169:i2l             
	//  102  170:lstore          6
						l = 1L + l1;
	//  103  172:lconst_1        
	//  104  173:lload           4
	//  105  175:ladd            
	//  106  176:lstore_2        
						l4 ^= (long)UnsafeUtil.getByte(l1) << 28;
	//  107  177:lload           6
	//  108  179:lload           4
	//  109  181:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//  110  184:i2l             
	//  111  185:bipush          28
	//  112  187:lshl            
	//  113  188:lxor            
	//  114  189:lstore          6
						if(l4 >= 0L)
	//* 115  191:lload           6
	//* 116  193:lconst_0        
	//* 117  194:lcmp            
	//* 118  195:iflt            209
						{
							l1 = l4 ^ 0xfe03f80L;
	//  119  198:lload           6
	//  120  200:ldc2w           #318 <Long 0xfe03f80L>
	//  121  203:lxor            
	//  122  204:lstore          4
						} else
	//* 123  206:goto            389
						{
							l1 = 1L + l;
	//  124  209:lconst_1        
	//  125  210:lload_2         
	//  126  211:ladd            
	//  127  212:lstore          4
							l4 = (long)UnsafeUtil.getByte(l) << 35 ^ l4;
	//  128  214:lload_2         
	//  129  215:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//  130  218:i2l             
	//  131  219:bipush          35
	//  132  221:lshl            
	//  133  222:lload           6
	//  134  224:lxor            
	//  135  225:lstore          6
							if(l4 < 0L)
	//* 136  227:lload           6
	//* 137  229:lconst_0        
	//* 138  230:lcmp            
	//* 139  231:ifge            252
							{
								l4 ^= 0xfe03f80L;
	//  140  234:lload           6
	//  141  236:ldc2w           #320 <Long 0xfe03f80L>
	//  142  239:lxor            
	//  143  240:lstore          6
								l = l1;
	//  144  242:lload           4
	//  145  244:lstore_2        
								l1 = l4;
	//  146  245:lload           6
	//  147  247:lstore          4
							} else
	//* 148  249:goto            389
							{
								l = 1L + l1;
	//  149  252:lconst_1        
	//  150  253:lload           4
	//  151  255:ladd            
	//  152  256:lstore_2        
								l4 = (long)UnsafeUtil.getByte(l1) << 42 ^ l4;
	//  153  257:lload           4
	//  154  259:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//  155  262:i2l             
	//  156  263:bipush          42
	//  157  265:lshl            
	//  158  266:lload           6
	//  159  268:lxor            
	//  160  269:lstore          6
								if(l4 >= 0L)
	//* 161  271:lload           6
	//* 162  273:lconst_0        
	//* 163  274:lcmp            
	//* 164  275:iflt            289
								{
									l1 = l4 ^ 0xfe03f80L;
	//  165  278:lload           6
	//  166  280:ldc2w           #322 <Long 0xfe03f80L>
	//  167  283:lxor            
	//  168  284:lstore          4
								} else
	//* 169  286:goto            389
								{
									l1 = 1L + l;
	//  170  289:lconst_1        
	//  171  290:lload_2         
	//  172  291:ladd            
	//  173  292:lstore          4
									l = (long)UnsafeUtil.getByte(l) << 49 ^ l4;
	//  174  294:lload_2         
	//  175  295:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//  176  298:i2l             
	//  177  299:bipush          49
	//  178  301:lshl            
	//  179  302:lload           6
	//  180  304:lxor            
	//  181  305:lstore_2        
									if(l < 0L)
	//* 182  306:lload_2         
	//* 183  307:lconst_0        
	//* 184  308:lcmp            
	//* 185  309:ifge            329
									{
										long l5 = l ^ 0xfe03f80L;
	//  186  312:lload_2         
	//  187  313:ldc2w           #324 <Long 0xfe03f80L>
	//  188  316:lxor            
	//  189  317:lstore          6
										l = l1;
	//  190  319:lload           4
	//  191  321:lstore_2        
										l1 = l5;
	//  192  322:lload           6
	//  193  324:lstore          4
									} else
	//* 194  326:goto            389
									{
										long l6 = 1L + l1;
	//  195  329:lconst_1        
	//  196  330:lload           4
	//  197  332:ladd            
	//  198  333:lstore          6
										long l7 = l ^ (long)UnsafeUtil.getByte(l1) << 56 ^ 0xfe03f80L;
	//  199  335:lload_2         
	//  200  336:lload           4
	//  201  338:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//  202  341:i2l             
	//  203  342:bipush          56
	//  204  344:lshl            
	//  205  345:lxor            
	//  206  346:ldc2w           #326 <Long 0xfe03f80L>
	//  207  349:lxor            
	//  208  350:lstore          8
										l = l6;
	//  209  352:lload           6
	//  210  354:lstore_2        
										l1 = l7;
	//  211  355:lload           8
	//  212  357:lstore          4
										if(l7 < 0L)
	//* 213  359:lload           8
	//* 214  361:lconst_0        
	//* 215  362:lcmp            
	//* 216  363:ifge            389
										{
											l = 1L + l6;
	//  217  366:lconst_1        
	//  218  367:lload           6
	//  219  369:ladd            
	//  220  370:lstore_2        
											l1 = l7;
	//  221  371:lload           8
	//  222  373:lstore          4
											if((long)UnsafeUtil.getByte(l6) < 0L)
	//* 223  375:lload           6
	//* 224  377:invokestatic    #290 <Method byte UnsafeUtil.getByte(long)>
	//* 225  380:i2l             
	//* 226  381:lconst_0        
	//* 227  382:lcmp            
	//* 228  383:ifge            389
												break label0;
	//  229  386:goto            397
										}
									}
								}
							}
						}
					}
				}
			}
			currentByteBufferPos = l;
	//  230  389:aload_0         
	//  231  390:lload_2         
	//  232  391:putfield        #62  <Field long currentByteBufferPos>
			return l1;
	//  233  394:lload           4
	//  234  396:lreturn         
		}
		return readRawVarint64SlowPath();
	//  235  397:aload_0         
	//  236  398:invokevirtual   #317 <Method long readRawVarint64SlowPath()>
	//  237  401:lreturn         
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
	//    8   11:invokevirtual   #129 <Method byte readRawByte()>
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
	//   30   43:invokestatic    #132 <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   31   46:athrow          
	}

	public int readSFixed32()
		throws IOException
	{
		return readRawLittleEndian32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method int readRawLittleEndian32()>
	//    2    4:ireturn         
	}

	public long readSFixed64()
		throws IOException
	{
		return readRawLittleEndian64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #222 <Method long readRawLittleEndian64()>
	//    2    4:lreturn         
	}

	public int readSInt32()
		throws IOException
	{
		return decodeZigZag32(readRawVarint32());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:invokestatic    #333 <Method int decodeZigZag32(int)>
	//    3    7:ireturn         
	}

	public long readSInt64()
		throws IOException
	{
		return decodeZigZag64(readRawVarint64());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method long readRawVarint64()>
	//    2    4:invokestatic    #338 <Method long decodeZigZag64(long)>
	//    3    7:lreturn         
	}

	public String readString()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && (long)i <= currentByteBufferLimit - currentByteBufferPos)
	//*   3    5:iload_1         
	//*   4    6:ifle            64
	//*   5    9:iload_1         
	//*   6   10:i2l             
	//*   7   11:aload_0         
	//*   8   12:getfield        #66  <Field long currentByteBufferLimit>
	//*   9   15:aload_0         
	//*  10   16:getfield        #62  <Field long currentByteBufferPos>
	//*  11   19:lsub            
	//*  12   20:lcmp            
	//*  13   21:ifgt            64
		{
			byte abyte0[] = new byte[i];
	//   14   24:iload_1         
	//   15   25:newarray        byte[]
	//   16   27:astore_2        
			UnsafeUtil.copyMemory(currentByteBufferPos, abyte0, 0L, i);
	//   17   28:aload_0         
	//   18   29:getfield        #62  <Field long currentByteBufferPos>
	//   19   32:aload_2         
	//   20   33:lconst_0        
	//   21   34:iload_1         
	//   22   35:i2l             
	//   23   36:invokestatic    #118 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
			String s = new String(abyte0, Internal.UTF_8);
	//   24   39:new             #342 <Class String>
	//   25   42:dup             
	//   26   43:aload_2         
	//   27   44:getstatic       #346 <Field java.nio.charset.Charset Internal.UTF_8>
	//   28   47:invokespecial   #349 <Method void String(byte[], java.nio.charset.Charset)>
	//   29   50:astore_2        
			currentByteBufferPos = currentByteBufferPos + (long)i;
	//   30   51:aload_0         
	//   31   52:aload_0         
	//   32   53:getfield        #62  <Field long currentByteBufferPos>
	//   33   56:iload_1         
	//   34   57:i2l             
	//   35   58:ladd            
	//   36   59:putfield        #62  <Field long currentByteBufferPos>
			return s;
	//   37   62:aload_2         
	//   38   63:areturn         
		}
		if(i > 0 && i <= remaining())
	//*  39   64:iload_1         
	//*  40   65:ifle            99
	//*  41   68:iload_1         
	//*  42   69:aload_0         
	//*  43   70:invokespecial   #102 <Method int remaining()>
	//*  44   73:icmpgt          99
		{
			byte abyte1[] = new byte[i];
	//   45   76:iload_1         
	//   46   77:newarray        byte[]
	//   47   79:astore_2        
			readRawBytesTo(abyte1, 0, i);
	//   48   80:aload_0         
	//   49   81:aload_2         
	//   50   82:iconst_0        
	//   51   83:iload_1         
	//   52   84:invokespecial   #203 <Method void readRawBytesTo(byte[], int, int)>
			return new String(abyte1, Internal.UTF_8);
	//   53   87:new             #342 <Class String>
	//   54   90:dup             
	//   55   91:aload_2         
	//   56   92:getstatic       #346 <Field java.nio.charset.Charset Internal.UTF_8>
	//   57   95:invokespecial   #349 <Method void String(byte[], java.nio.charset.Charset)>
	//   58   98:areturn         
		}
		if(i == 0)
	//*  59   99:iload_1         
	//*  60  100:ifne            107
			return "";
	//   61  103:ldc2            #351 <String "">
	//   62  106:areturn         
		if(i < 0)
	//*  63  107:iload_1         
	//*  64  108:ifge            115
			throw InvalidProtocolBufferException.negativeSize();
	//   65  111:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   66  114:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   67  115:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   68  118:athrow          
	}

	public String readStringRequireUtf8()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && (long)i <= currentByteBufferLimit - currentByteBufferPos)
	//*   3    5:iload_1         
	//*   4    6:ifle            75
	//*   5    9:iload_1         
	//*   6   10:i2l             
	//*   7   11:aload_0         
	//*   8   12:getfield        #66  <Field long currentByteBufferLimit>
	//*   9   15:aload_0         
	//*  10   16:getfield        #62  <Field long currentByteBufferPos>
	//*  11   19:lsub            
	//*  12   20:lcmp            
	//*  13   21:ifgt            75
		{
			byte abyte0[] = new byte[i];
	//   14   24:iload_1         
	//   15   25:newarray        byte[]
	//   16   27:astore_2        
			UnsafeUtil.copyMemory(currentByteBufferPos, abyte0, 0L, i);
	//   17   28:aload_0         
	//   18   29:getfield        #62  <Field long currentByteBufferPos>
	//   19   32:aload_2         
	//   20   33:lconst_0        
	//   21   34:iload_1         
	//   22   35:i2l             
	//   23   36:invokestatic    #118 <Method void UnsafeUtil.copyMemory(long, byte[], long, long)>
			if(!Utf8.isValidUtf8(abyte0))
	//*  24   39:aload_2         
	//*  25   40:invokestatic    #358 <Method boolean Utf8.isValidUtf8(byte[])>
	//*  26   43:ifne            50
			{
				throw InvalidProtocolBufferException.invalidUtf8();
	//   27   46:invokestatic    #361 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidUtf8()>
	//   28   49:athrow          
			} else
			{
				String s = new String(abyte0, Internal.UTF_8);
	//   29   50:new             #342 <Class String>
	//   30   53:dup             
	//   31   54:aload_2         
	//   32   55:getstatic       #346 <Field java.nio.charset.Charset Internal.UTF_8>
	//   33   58:invokespecial   #349 <Method void String(byte[], java.nio.charset.Charset)>
	//   34   61:astore_2        
				currentByteBufferPos = currentByteBufferPos + (long)i;
	//   35   62:aload_0         
	//   36   63:aload_0         
	//   37   64:getfield        #62  <Field long currentByteBufferPos>
	//   38   67:iload_1         
	//   39   68:i2l             
	//   40   69:ladd            
	//   41   70:putfield        #62  <Field long currentByteBufferPos>
				return s;
	//   42   73:aload_2         
	//   43   74:areturn         
			}
		}
		if(i >= 0 && i <= remaining())
	//*  44   75:iload_1         
	//*  45   76:iflt            121
	//*  46   79:iload_1         
	//*  47   80:aload_0         
	//*  48   81:invokespecial   #102 <Method int remaining()>
	//*  49   84:icmpgt          121
		{
			byte abyte1[] = new byte[i];
	//   50   87:iload_1         
	//   51   88:newarray        byte[]
	//   52   90:astore_2        
			readRawBytesTo(abyte1, 0, i);
	//   53   91:aload_0         
	//   54   92:aload_2         
	//   55   93:iconst_0        
	//   56   94:iload_1         
	//   57   95:invokespecial   #203 <Method void readRawBytesTo(byte[], int, int)>
			if(!Utf8.isValidUtf8(abyte1))
	//*  58   98:aload_2         
	//*  59   99:invokestatic    #358 <Method boolean Utf8.isValidUtf8(byte[])>
	//*  60  102:ifne            109
				throw InvalidProtocolBufferException.invalidUtf8();
	//   61  105:invokestatic    #361 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidUtf8()>
	//   62  108:athrow          
			else
				return new String(abyte1, Internal.UTF_8);
	//   63  109:new             #342 <Class String>
	//   64  112:dup             
	//   65  113:aload_2         
	//   66  114:getstatic       #346 <Field java.nio.charset.Charset Internal.UTF_8>
	//   67  117:invokespecial   #349 <Method void String(byte[], java.nio.charset.Charset)>
	//   68  120:areturn         
		}
		if(i == 0)
	//*  69  121:iload_1         
	//*  70  122:ifne            129
			return "";
	//   71  125:ldc2            #351 <String "">
	//   72  128:areturn         
		if(i <= 0)
	//*  73  129:iload_1         
	//*  74  130:ifgt            137
			throw InvalidProtocolBufferException.negativeSize();
	//   75  133:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   76  136:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   77  137:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   78  140:athrow          
	}

	public int readTag()
		throws IOException
	{
		if(isAtEnd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #364 <Method boolean isAtEnd()>
	//*   2    4:ifeq            14
		{
			lastTag = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #164 <Field int lastTag>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		lastTag = readRawVarint32();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #190 <Method int readRawVarint32()>
	//   11   19:putfield        #164 <Field int lastTag>
		if(WireFormat.getTagFieldNumber(lastTag) == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #164 <Field int lastTag>
	//*  14   26:invokestatic    #367 <Method int WireFormat.getTagFieldNumber(int)>
	//*  15   29:ifne            36
			throw InvalidProtocolBufferException.invalidTag();
	//   16   32:invokestatic    #370 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidTag()>
	//   17   35:athrow          
		else
			return lastTag;
	//   18   36:aload_0         
	//   19   37:getfield        #164 <Field int lastTag>
	//   20   40:ireturn         
	}

	public int readUInt32()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #190 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public long readUInt64()
		throws IOException
	{
		return readRawVarint64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method long readRawVarint64()>
	//    2    4:lreturn         
	}

	public void readUnknownGroup(int i, MessageLite.Builder builder)
		throws IOException
	{
		readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #381 <Method ExtensionRegistryLite ExtensionRegistryLite.getEmptyRegistry()>
	//    4    6:invokevirtual   #383 <Method void readGroup(int, MessageLite$Builder, ExtensionRegistryLite)>
	//    5    9:return          
	}

	public void resetSizeCounter()
	{
		startOffset = (int)(((long)totalBytesRead + currentByteBufferPos) - currentByteBufferStartPos);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field int totalBytesRead>
	//    3    5:i2l             
	//    4    6:aload_0         
	//    5    7:getfield        #62  <Field long currentByteBufferPos>
	//    6   10:ladd            
	//    7   11:aload_0         
	//    8   12:getfield        #64  <Field long currentByteBufferStartPos>
	//    9   15:lsub            
	//   10   16:l2i             
	//   11   17:putfield        #53  <Field int startOffset>
	//   12   20:return          
	}

	public boolean skipField(int i)
		throws IOException
	{
		switch(WireFormat.getTagWireType(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #390 <Method int WireFormat.getTagWireType(int)>
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
	//    5   48:invokespecial   #392 <Method void skipRawVarint()>
			return true;
	//    6   51:iconst_1        
	//    7   52:ireturn         

		case 1: // '\001'
			skipRawBytes(8);
	//    8   53:aload_0         
	//    9   54:bipush          8
	//   10   56:invokevirtual   #395 <Method void skipRawBytes(int)>
			return true;
	//   11   59:iconst_1        
	//   12   60:ireturn         

		case 2: // '\002'
			skipRawBytes(readRawVarint32());
	//   13   61:aload_0         
	//   14   62:aload_0         
	//   15   63:invokevirtual   #190 <Method int readRawVarint32()>
	//   16   66:invokevirtual   #395 <Method void skipRawBytes(int)>
			return true;
	//   17   69:iconst_1        
	//   18   70:ireturn         

		case 3: // '\003'
			skipMessage();
	//   19   71:aload_0         
	//   20   72:invokevirtual   #398 <Method void skipMessage()>
			checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
	//   21   75:aload_0         
	//   22   76:iload_1         
	//   23   77:invokestatic    #367 <Method int WireFormat.getTagFieldNumber(int)>
	//   24   80:iconst_4        
	//   25   81:invokestatic    #266 <Method int WireFormat.makeTag(int, int)>
	//   26   84:invokevirtual   #268 <Method void checkLastTagWas(int)>
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
	//   33   93:invokevirtual   #395 <Method void skipRawBytes(int)>
			return true;
	//   34   96:iconst_1        
	//   35   97:ireturn         
		}
		throw InvalidProtocolBufferException.invalidWireType();
	//   36   98:invokestatic    #402 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
	//   37  101:athrow          
	}

	public boolean skipField(int i, CodedOutputStream codedoutputstream)
		throws IOException
	{
		switch(WireFormat.getTagWireType(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #390 <Method int WireFormat.getTagWireType(int)>
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
	//    5   48:invokevirtual   #405 <Method long readInt64()>
	//    6   51:lstore          4
			codedoutputstream.writeRawVarint32(i);
	//    7   53:aload_2         
	//    8   54:iload_1         
	//    9   55:invokevirtual   #410 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeUInt64NoTag(l);
	//   10   58:aload_2         
	//   11   59:lload           4
	//   12   61:invokevirtual   #414 <Method void CodedOutputStream.writeUInt64NoTag(long)>
			return true;
	//   13   64:iconst_1        
	//   14   65:ireturn         

		case 1: // '\001'
			long l1 = readRawLittleEndian64();
	//   15   66:aload_0         
	//   16   67:invokevirtual   #222 <Method long readRawLittleEndian64()>
	//   17   70:lstore          4
			codedoutputstream.writeRawVarint32(i);
	//   18   72:aload_2         
	//   19   73:iload_1         
	//   20   74:invokevirtual   #410 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeFixed64NoTag(l1);
	//   21   77:aload_2         
	//   22   78:lload           4
	//   23   80:invokevirtual   #417 <Method void CodedOutputStream.writeFixed64NoTag(long)>
			return true;
	//   24   83:iconst_1        
	//   25   84:ireturn         

		case 2: // '\002'
			ByteString bytestring = readBytes();
	//   26   85:aload_0         
	//   27   86:invokevirtual   #419 <Method ByteString readBytes()>
	//   28   89:astore          6
			codedoutputstream.writeRawVarint32(i);
	//   29   91:aload_2         
	//   30   92:iload_1         
	//   31   93:invokevirtual   #410 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytesNoTag(bytestring);
	//   32   96:aload_2         
	//   33   97:aload           6
	//   34   99:invokevirtual   #423 <Method void CodedOutputStream.writeBytesNoTag(ByteString)>
			return true;
	//   35  102:iconst_1        
	//   36  103:ireturn         

		case 3: // '\003'
			codedoutputstream.writeRawVarint32(i);
	//   37  104:aload_2         
	//   38  105:iload_1         
	//   39  106:invokevirtual   #410 <Method void CodedOutputStream.writeRawVarint32(int)>
			skipMessage(codedoutputstream);
	//   40  109:aload_0         
	//   41  110:aload_2         
	//   42  111:invokevirtual   #426 <Method void skipMessage(CodedOutputStream)>
			i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
	//   43  114:iload_1         
	//   44  115:invokestatic    #367 <Method int WireFormat.getTagFieldNumber(int)>
	//   45  118:iconst_4        
	//   46  119:invokestatic    #266 <Method int WireFormat.makeTag(int, int)>
	//   47  122:istore_1        
			checkLastTagWas(i);
	//   48  123:aload_0         
	//   49  124:iload_1         
	//   50  125:invokevirtual   #268 <Method void checkLastTagWas(int)>
			codedoutputstream.writeRawVarint32(i);
	//   51  128:aload_2         
	//   52  129:iload_1         
	//   53  130:invokevirtual   #410 <Method void CodedOutputStream.writeRawVarint32(int)>
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
	//   59  138:invokevirtual   #233 <Method int readRawLittleEndian32()>
	//   60  141:istore_3        
			codedoutputstream.writeRawVarint32(i);
	//   61  142:aload_2         
	//   62  143:iload_1         
	//   63  144:invokevirtual   #410 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeFixed32NoTag(j);
	//   64  147:aload_2         
	//   65  148:iload_3         
	//   66  149:invokevirtual   #429 <Method void CodedOutputStream.writeFixed32NoTag(int)>
			return true;
	//   67  152:iconst_1        
	//   68  153:ireturn         
		}
		throw InvalidProtocolBufferException.invalidWireType();
	//   69  154:invokestatic    #402 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
	//   70  157:athrow          
	}

	public void skipMessage()
		throws IOException
	{
		int i;
		do
			i = readTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #431 <Method int readTag()>
	//    2    4:istore_1        
		while(i != 0 && skipField(i));
	//    3    5:iload_1         
	//    4    6:ifeq            17
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #433 <Method boolean skipField(int)>
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
	//    1    1:invokevirtual   #431 <Method int readTag()>
	//    2    4:istore_2        
		while(i != 0 && skipField(i, codedoutputstream));
	//    3    5:iload_2         
	//    4    6:ifeq            18
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #435 <Method boolean skipField(int, CodedOutputStream)>
	//    9   15:ifne            19
	//   10   18:return          
	//*  11   19:goto            0
	}

	public void skipRawBytes(int i)
		throws IOException
	{
		if(i >= 0 && (long)i <= ((long)(totalBufferSize - totalBytesRead) - currentByteBufferPos) + currentByteBufferStartPos)
	//*   0    0:iload_1         
	//*   1    1:iflt            76
	//*   2    4:iload_1         
	//*   3    5:i2l             
	//*   4    6:aload_0         
	//*   5    7:getfield        #38  <Field int totalBufferSize>
	//*   6   10:aload_0         
	//*   7   11:getfield        #51  <Field int totalBytesRead>
	//*   8   14:isub            
	//*   9   15:i2l             
	//*  10   16:aload_0         
	//*  11   17:getfield        #62  <Field long currentByteBufferPos>
	//*  12   20:lsub            
	//*  13   21:aload_0         
	//*  14   22:getfield        #64  <Field long currentByteBufferStartPos>
	//*  15   25:ladd            
	//*  16   26:lcmp            
	//*  17   27:ifgt            76
		{
			while(i > 0) 
	//*  18   30:iload_1         
	//*  19   31:ifle            75
			{
				if(currentRemaining() == 0L)
	//*  20   34:aload_0         
	//*  21   35:invokespecial   #104 <Method long currentRemaining()>
	//*  22   38:lconst_0        
	//*  23   39:lcmp            
	//*  24   40:ifne            47
					getNextByteBuffer();
	//   25   43:aload_0         
	//   26   44:invokespecial   #106 <Method void getNextByteBuffer()>
				int j = Math.min(i, (int)currentRemaining());
	//   27   47:iload_1         
	//   28   48:aload_0         
	//   29   49:invokespecial   #104 <Method long currentRemaining()>
	//   30   52:l2i             
	//   31   53:invokestatic    #112 <Method int Math.min(int, int)>
	//   32   56:istore_2        
				i -= j;
	//   33   57:iload_1         
	//   34   58:iload_2         
	//   35   59:isub            
	//   36   60:istore_1        
				currentByteBufferPos = currentByteBufferPos + (long)j;
	//   37   61:aload_0         
	//   38   62:aload_0         
	//   39   63:getfield        #62  <Field long currentByteBufferPos>
	//   40   66:iload_2         
	//   41   67:i2l             
	//   42   68:ladd            
	//   43   69:putfield        #62  <Field long currentByteBufferPos>
			}
	//*  44   72:goto            30
			return;
	//   45   75:return          
		}
		if(i < 0)
	//*  46   76:iload_1         
	//*  47   77:ifge            84
			throw InvalidProtocolBufferException.negativeSize();
	//   48   80:invokestatic    #121 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   49   83:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   50   84:invokestatic    #93  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   51   87:athrow          
	}

	private int bufferSizeAfterCurrentLimit;
	private long currentAddress;
	private ByteBuffer currentByteBuffer;
	private long currentByteBufferLimit;
	private long currentByteBufferPos;
	private long currentByteBufferStartPos;
	private int currentLimit;
	private boolean enableAliasing;
	private boolean immutable;
	private Iterable input;
	private Iterator iterator;
	private int lastTag;
	private int startOffset;
	private int totalBufferSize;
	private int totalBytesRead;

	private CodedInputStream$IterableDirectByteBufferDecoder(Iterable iterable, int i, boolean flag)
	{
		super(((CodedInputStream._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #33  <Method void CodedInputStream(CodedInputStream$1)>
		currentLimit = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #34  <Int 0x7fffffff>
	//    5    8:putfield        #36  <Field int currentLimit>
		totalBufferSize = i;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:putfield        #38  <Field int totalBufferSize>
		input = iterable;
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:putfield        #40  <Field Iterable input>
		iterator = input.iterator();
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #40  <Field Iterable input>
	//   15   26:invokeinterface #45  <Method Iterator Iterable.iterator()>
	//   16   31:putfield        #47  <Field Iterator iterator>
		immutable = flag;
	//   17   34:aload_0         
	//   18   35:iload_3         
	//   19   36:putfield        #49  <Field boolean immutable>
		totalBytesRead = 0;
	//   20   39:aload_0         
	//   21   40:iconst_0        
	//   22   41:putfield        #51  <Field int totalBytesRead>
		startOffset = 0;
	//   23   44:aload_0         
	//   24   45:iconst_0        
	//   25   46:putfield        #53  <Field int startOffset>
		if(i == 0)
	//*  26   49:iload_2         
	//*  27   50:ifne            81
		{
			currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
	//   28   53:aload_0         
	//   29   54:getstatic       #58  <Field ByteBuffer Internal.EMPTY_BYTE_BUFFER>
	//   30   57:putfield        #60  <Field ByteBuffer currentByteBuffer>
			currentByteBufferPos = 0L;
	//   31   60:aload_0         
	//   32   61:lconst_0        
	//   33   62:putfield        #62  <Field long currentByteBufferPos>
			currentByteBufferStartPos = 0L;
	//   34   65:aload_0         
	//   35   66:lconst_0        
	//   36   67:putfield        #64  <Field long currentByteBufferStartPos>
			currentByteBufferLimit = 0L;
	//   37   70:aload_0         
	//   38   71:lconst_0        
	//   39   72:putfield        #66  <Field long currentByteBufferLimit>
			currentAddress = 0L;
	//   40   75:aload_0         
	//   41   76:lconst_0        
	//   42   77:putfield        #68  <Field long currentAddress>
			return;
	//   43   80:return          
		} else
		{
			tryGetNextByteBuffer();
	//   44   81:aload_0         
	//   45   82:invokespecial   #72  <Method void tryGetNextByteBuffer()>
			return;
	//   46   85:return          
		}
	}

	CodedInputStream$IterableDirectByteBufferDecoder(Iterable iterable, int i, boolean flag, CodedInputStream._cls1 _pcls1)
	{
		this(iterable, i, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #78  <Method void CodedInputStream$IterableDirectByteBufferDecoder(Iterable, int, boolean)>
	//    5    7:return          
	}
}
