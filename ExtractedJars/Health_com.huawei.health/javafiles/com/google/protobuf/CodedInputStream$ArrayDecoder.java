// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

// Referenced classes of package com.google.protobuf:
//			CodedInputStream, InvalidProtocolBufferException, Internal, ByteString, 
//			Parser, MessageLite, WireFormat, Utf8, 
//			ExtensionRegistryLite, CodedOutputStream

static final class CodedInputStream$ArrayDecoder extends CodedInputStream
{

	private void recomputeBufferSizeAfterLimit()
	{
		limit = limit + bufferSizeAfterLimit;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field int limit>
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int bufferSizeAfterLimit>
	//    5    9:iadd            
	//    6   10:putfield        #29  <Field int limit>
		int i = limit - startPos;
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field int limit>
	//    9   17:aload_0         
	//   10   18:getfield        #33  <Field int startPos>
	//   11   21:isub            
	//   12   22:istore_1        
		if(i > currentLimit)
	//*  13   23:iload_1         
	//*  14   24:aload_0         
	//*  15   25:getfield        #25  <Field int currentLimit>
	//*  16   28:icmple          55
		{
			bufferSizeAfterLimit = i - currentLimit;
	//   17   31:aload_0         
	//   18   32:iload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #25  <Field int currentLimit>
	//   21   37:isub            
	//   22   38:putfield        #43  <Field int bufferSizeAfterLimit>
			limit = limit - bufferSizeAfterLimit;
	//   23   41:aload_0         
	//   24   42:aload_0         
	//   25   43:getfield        #29  <Field int limit>
	//   26   46:aload_0         
	//   27   47:getfield        #43  <Field int bufferSizeAfterLimit>
	//   28   50:isub            
	//   29   51:putfield        #29  <Field int limit>
			return;
	//   30   54:return          
		} else
		{
			bufferSizeAfterLimit = 0;
	//   31   55:aload_0         
	//   32   56:iconst_0        
	//   33   57:putfield        #43  <Field int bufferSizeAfterLimit>
			return;
	//   34   60:return          
		}
	}

	private void skipRawVarint()
		throws IOException
	{
		if(limit - pos >= 10)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field int limit>
	//*   2    4:aload_0         
	//*   3    5:getfield        #31  <Field int pos>
	//*   4    8:isub            
	//*   5    9:bipush          10
	//*   6   11:icmplt          19
		{
			skipRawVarintFastPath();
	//    7   14:aload_0         
	//    8   15:invokespecial   #49  <Method void skipRawVarintFastPath()>
			return;
	//    9   18:return          
		} else
		{
			skipRawVarintSlowPath();
	//   10   19:aload_0         
	//   11   20:invokespecial   #52  <Method void skipRawVarintSlowPath()>
			return;
	//   12   23:return          
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
	//*   4    5:icmpge          39
		{
			byte abyte0[] = buffer;
	//    5    8:aload_0         
	//    6    9:getfield        #27  <Field byte[] buffer>
	//    7   12:astore_3        
			int j = pos;
	//    8   13:aload_0         
	//    9   14:getfield        #31  <Field int pos>
	//   10   17:istore_2        
			pos = j + 1;
	//   11   18:aload_0         
	//   12   19:iload_2         
	//   13   20:iconst_1        
	//   14   21:iadd            
	//   15   22:putfield        #31  <Field int pos>
			if(abyte0[j] >= 0)
	//*  16   25:aload_3         
	//*  17   26:iload_2         
	//*  18   27:baload          
	//*  19   28:iflt            32
				return;
	//   20   31:return          
		}

	//   21   32:iload_1         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_1        
	//*  25   36:goto            2
		throw InvalidProtocolBufferException.malformedVarint();
	//   26   39:invokestatic    #59  <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   27   42:athrow          
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
	//*   6    9:invokevirtual   #63  <Method byte readRawByte()>
	//*   7   12:iflt            16
				return;
	//    8   15:return          

	//    9   16:iload_1         
	//   10   17:iconst_1        
	//   11   18:iadd            
	//   12   19:istore_1        
	//*  13   20:goto            2
		throw InvalidProtocolBufferException.malformedVarint();
	//   14   23:invokestatic    #59  <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   15   26:athrow          
	}

	public void checkLastTagWas(int i)
		throws InvalidProtocolBufferException
	{
		if(lastTag != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #67  <Field int lastTag>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          12
			throw InvalidProtocolBufferException.invalidEndTag();
	//    4    8:invokestatic    #70  <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidEndTag()>
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
	//    2    2:putfield        #73  <Field boolean enableAliasing>
	//    3    5:return          
	}

	public int getBytesUntilLimit()
	{
		if(currentLimit == 0x7fffffff)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field int currentLimit>
	//*   2    4:ldc1            #23  <Int 0x7fffffff>
	//*   3    6:icmpne          11
			return -1;
	//    4    9:iconst_m1       
	//    5   10:ireturn         
		else
			return currentLimit - getTotalBytesRead();
	//    6   11:aload_0         
	//    7   12:getfield        #25  <Field int currentLimit>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #78  <Method int getTotalBytesRead()>
	//   10   19:isub            
	//   11   20:ireturn         
	}

	public int getLastTag()
	{
		return lastTag;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int lastTag>
	//    2    4:ireturn         
	}

	public int getTotalBytesRead()
	{
		return pos - startPos;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field int startPos>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public boolean isAtEnd()
		throws IOException
	{
		return pos == limit;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int pos>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field int limit>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void popLimit(int i)
	{
		currentLimit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int currentLimit>
		recomputeBufferSizeAfterLimit();
	//    3    5:aload_0         
	//    4    6:invokespecial   #84  <Method void recomputeBufferSizeAfterLimit()>
	//    5    9:return          
	}

	public int pushLimit(int i)
		throws InvalidProtocolBufferException
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			throw InvalidProtocolBufferException.negativeSize();
	//    2    4:invokestatic    #89  <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//    3    7:athrow          
		i += getTotalBytesRead();
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #78  <Method int getTotalBytesRead()>
	//    7   13:iadd            
	//    8   14:istore_1        
		int j = currentLimit;
	//    9   15:aload_0         
	//   10   16:getfield        #25  <Field int currentLimit>
	//   11   19:istore_2        
		if(i > j)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmple          29
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   15   25:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   16   28:athrow          
		} else
		{
			currentLimit = i;
	//   17   29:aload_0         
	//   18   30:iload_1         
	//   19   31:putfield        #25  <Field int currentLimit>
			recomputeBufferSizeAfterLimit();
	//   20   34:aload_0         
	//   21   35:invokespecial   #84  <Method void recomputeBufferSizeAfterLimit()>
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
	//    1    1:invokevirtual   #97  <Method long readRawVarint64()>
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
	//    2    2:invokevirtual   #102 <Method int readRawVarint32()>
	//    3    5:invokevirtual   #106 <Method byte[] readRawBytes(int)>
	//    4    8:areturn         
	}

	public ByteBuffer readByteBuffer()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            88
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #29  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          88
		{
			ByteBuffer bytebuffer;
			if(!immutable && enableAliasing)
	//*  12   22:aload_0         
	//*  13   23:getfield        #35  <Field boolean immutable>
	//*  14   26:ifne            55
	//*  15   29:aload_0         
	//*  16   30:getfield        #73  <Field boolean enableAliasing>
	//*  17   33:ifeq            55
				bytebuffer = ByteBuffer.wrap(buffer, pos, i).slice();
	//   18   36:aload_0         
	//   19   37:getfield        #27  <Field byte[] buffer>
	//   20   40:aload_0         
	//   21   41:getfield        #31  <Field int pos>
	//   22   44:iload_1         
	//   23   45:invokestatic    #114 <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//   24   48:invokevirtual   #117 <Method ByteBuffer ByteBuffer.slice()>
	//   25   51:astore_2        
			else
	//*  26   52:goto            76
				bytebuffer = ByteBuffer.wrap(Arrays.copyOfRange(buffer, pos, pos + i));
	//   27   55:aload_0         
	//   28   56:getfield        #27  <Field byte[] buffer>
	//   29   59:aload_0         
	//   30   60:getfield        #31  <Field int pos>
	//   31   63:aload_0         
	//   32   64:getfield        #31  <Field int pos>
	//   33   67:iload_1         
	//   34   68:iadd            
	//   35   69:invokestatic    #123 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   36   72:invokestatic    #126 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   37   75:astore_2        
			pos = pos + i;
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:getfield        #31  <Field int pos>
	//   41   81:iload_1         
	//   42   82:iadd            
	//   43   83:putfield        #31  <Field int pos>
			return bytebuffer;
	//   44   86:aload_2         
	//   45   87:areturn         
		}
		if(i == 0)
	//*  46   88:iload_1         
	//*  47   89:ifne            96
			return Internal.EMPTY_BYTE_BUFFER;
	//   48   92:getstatic       #132 <Field ByteBuffer Internal.EMPTY_BYTE_BUFFER>
	//   49   95:areturn         
		if(i < 0)
	//*  50   96:iload_1         
	//*  51   97:ifge            104
			throw InvalidProtocolBufferException.negativeSize();
	//   52  100:invokestatic    #89  <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   53  103:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   54  104:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   55  107:athrow          
	}

	public ByteString readBytes()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            77
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #29  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          77
		{
			ByteString bytestring;
			if(immutable && enableAliasing)
	//*  12   22:aload_0         
	//*  13   23:getfield        #35  <Field boolean immutable>
	//*  14   26:ifeq            52
	//*  15   29:aload_0         
	//*  16   30:getfield        #73  <Field boolean enableAliasing>
	//*  17   33:ifeq            52
				bytestring = ByteString.wrap(buffer, pos, i);
	//   18   36:aload_0         
	//   19   37:getfield        #27  <Field byte[] buffer>
	//   20   40:aload_0         
	//   21   41:getfield        #31  <Field int pos>
	//   22   44:iload_1         
	//   23   45:invokestatic    #139 <Method ByteString ByteString.wrap(byte[], int, int)>
	//   24   48:astore_2        
			else
	//*  25   49:goto            65
				bytestring = ByteString.copyFrom(buffer, pos, i);
	//   26   52:aload_0         
	//   27   53:getfield        #27  <Field byte[] buffer>
	//   28   56:aload_0         
	//   29   57:getfield        #31  <Field int pos>
	//   30   60:iload_1         
	//   31   61:invokestatic    #142 <Method ByteString ByteString.copyFrom(byte[], int, int)>
	//   32   64:astore_2        
			pos = pos + i;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #31  <Field int pos>
	//   36   70:iload_1         
	//   37   71:iadd            
	//   38   72:putfield        #31  <Field int pos>
			return bytestring;
	//   39   75:aload_2         
	//   40   76:areturn         
		}
		if(i == 0)
	//*  41   77:iload_1         
	//*  42   78:ifne            85
			return ByteString.EMPTY;
	//   43   81:getstatic       #146 <Field ByteString ByteString.EMPTY>
	//   44   84:areturn         
		else
			return ByteString.wrap(readRawBytes(i));
	//   45   85:aload_0         
	//   46   86:iload_1         
	//   47   87:invokevirtual   #106 <Method byte[] readRawBytes(int)>
	//   48   90:invokestatic    #149 <Method ByteString ByteString.wrap(byte[])>
	//   49   93:areturn         
	}

	public double readDouble()
		throws IOException
	{
		return Double.longBitsToDouble(readRawLittleEndian64());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method long readRawLittleEndian64()>
	//    2    4:invokestatic    #160 <Method double Double.longBitsToDouble(long)>
	//    3    7:dreturn         
	}

	public int readEnum()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public int readFixed32()
		throws IOException
	{
		return readRawLittleEndian32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method int readRawLittleEndian32()>
	//    2    4:ireturn         
	}

	public long readFixed64()
		throws IOException
	{
		return readRawLittleEndian64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method long readRawLittleEndian64()>
	//    2    4:lreturn         
	}

	public float readFloat()
		throws IOException
	{
		return Float.intBitsToFloat(readRawLittleEndian32());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method int readRawLittleEndian32()>
	//    2    4:invokestatic    #174 <Method float Float.intBitsToFloat(int)>
	//    3    7:freturn         
	}

	public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		if(recursionDepth >= recursionLimit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field int recursionDepth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #182 <Field int recursionLimit>
	//*   4    8:icmplt          15
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    5   11:invokestatic    #185 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    6   14:athrow          
		} else
		{
			recursionDepth = recursionDepth + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #179 <Field int recursionDepth>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #179 <Field int recursionDepth>
			parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokeinterface #191 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//   17   33:checkcast       #193 <Class MessageLite>
	//   18   36:astore_2        
			checkLastTagWas(WireFormat.makeTag(i, 4));
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:iconst_4        
	//   22   40:invokestatic    #199 <Method int WireFormat.makeTag(int, int)>
	//   23   43:invokevirtual   #201 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #179 <Field int recursionDepth>
	//   27   51:iconst_1        
	//   28   52:isub            
	//   29   53:putfield        #179 <Field int recursionDepth>
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
	//*   1    1:getfield        #179 <Field int recursionDepth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #182 <Field int recursionLimit>
	//*   4    8:icmplt          15
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    5   11:invokestatic    #185 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    6   14:athrow          
		} else
		{
			recursionDepth = recursionDepth + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #179 <Field int recursionDepth>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #179 <Field int recursionDepth>
			builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokeinterface #210 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//   17   33:pop             
			checkLastTagWas(WireFormat.makeTag(i, 4));
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:iconst_4        
	//   21   37:invokestatic    #199 <Method int WireFormat.makeTag(int, int)>
	//   22   40:invokevirtual   #201 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #179 <Field int recursionDepth>
	//   26   48:iconst_1        
	//   27   49:isub            
	//   28   50:putfield        #179 <Field int recursionDepth>
			return;
	//   29   53:return          
		}
	}

	public int readInt32()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public long readInt64()
		throws IOException
	{
		return readRawVarint64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method long readRawVarint64()>
	//    2    4:lreturn         
	}

	public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:istore_3        
		if(recursionDepth >= recursionLimit)
	//*   3    5:aload_0         
	//*   4    6:getfield        #179 <Field int recursionDepth>
	//*   5    9:aload_0         
	//*   6   10:getfield        #182 <Field int recursionLimit>
	//*   7   13:icmplt          20
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    8   16:invokestatic    #185 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    9   19:athrow          
		} else
		{
			i = pushLimit(i);
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #216 <Method int pushLimit(int)>
	//   13   25:istore_3        
			recursionDepth = recursionDepth + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #179 <Field int recursionDepth>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #179 <Field int recursionDepth>
			parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokeinterface #191 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
	//   24   44:checkcast       #193 <Class MessageLite>
	//   25   47:astore_1        
			checkLastTagWas(0);
	//   26   48:aload_0         
	//   27   49:iconst_0        
	//   28   50:invokevirtual   #201 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #179 <Field int recursionDepth>
	//   32   58:iconst_1        
	//   33   59:isub            
	//   34   60:putfield        #179 <Field int recursionDepth>
			popLimit(i);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:invokevirtual   #218 <Method void popLimit(int)>
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
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:istore_3        
		if(recursionDepth >= recursionLimit)
	//*   3    5:aload_0         
	//*   4    6:getfield        #179 <Field int recursionDepth>
	//*   5    9:aload_0         
	//*   6   10:getfield        #182 <Field int recursionLimit>
	//*   7   13:icmplt          20
		{
			throw InvalidProtocolBufferException.recursionLimitExceeded();
	//    8   16:invokestatic    #185 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
	//    9   19:athrow          
		} else
		{
			i = pushLimit(i);
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:invokevirtual   #216 <Method int pushLimit(int)>
	//   13   25:istore_3        
			recursionDepth = recursionDepth + 1;
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #179 <Field int recursionDepth>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:putfield        #179 <Field int recursionDepth>
			builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
	//   20   36:aload_1         
	//   21   37:aload_0         
	//   22   38:aload_2         
	//   23   39:invokeinterface #210 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
	//   24   44:pop             
			checkLastTagWas(0);
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #201 <Method void checkLastTagWas(int)>
			recursionDepth = recursionDepth - 1;
	//   28   50:aload_0         
	//   29   51:aload_0         
	//   30   52:getfield        #179 <Field int recursionDepth>
	//   31   55:iconst_1        
	//   32   56:isub            
	//   33   57:putfield        #179 <Field int recursionDepth>
			popLimit(i);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:invokevirtual   #218 <Method void popLimit(int)>
			return;
	//   37   65:return          
		}
	}

	public byte readRawByte()
		throws IOException
	{
		if(pos == limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int pos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field int limit>
	//*   4    8:icmpne          15
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//    5   11:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//    6   14:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//    7   15:aload_0         
	//    8   16:getfield        #27  <Field byte[] buffer>
	//    9   19:astore_2        
			int i = pos;
	//   10   20:aload_0         
	//   11   21:getfield        #31  <Field int pos>
	//   12   24:istore_1        
			pos = i + 1;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iconst_1        
	//   16   28:iadd            
	//   17   29:putfield        #31  <Field int pos>
			return abyte0[i];
	//   18   32:aload_2         
	//   19   33:iload_1         
	//   20   34:baload          
	//   21   35:ireturn         
		}
	}

	public byte[] readRawBytes(int i)
		throws IOException
	{
		if(i > 0 && i <= limit - pos)
	//*   0    0:iload_1         
	//*   1    1:ifle            45
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field int limit>
	//*   5    9:aload_0         
	//*   6   10:getfield        #31  <Field int pos>
	//*   7   13:isub            
	//*   8   14:icmpgt          45
		{
			int j = pos;
	//    9   17:aload_0         
	//   10   18:getfield        #31  <Field int pos>
	//   11   21:istore_2        
			pos = pos + i;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #31  <Field int pos>
	//   15   27:iload_1         
	//   16   28:iadd            
	//   17   29:putfield        #31  <Field int pos>
			return Arrays.copyOfRange(buffer, j, pos);
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field byte[] buffer>
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #31  <Field int pos>
	//   23   41:invokestatic    #123 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   24   44:areturn         
		}
		if(i <= 0)
	//*  25   45:iload_1         
	//*  26   46:ifgt            61
		{
			if(i == 0)
	//*  27   49:iload_1         
	//*  28   50:ifne            57
				return Internal.EMPTY_BYTE_ARRAY;
	//   29   53:getstatic       #223 <Field byte[] Internal.EMPTY_BYTE_ARRAY>
	//   30   56:areturn         
			else
				throw InvalidProtocolBufferException.negativeSize();
	//   31   57:invokestatic    #89  <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   32   60:athrow          
		} else
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//   33   61:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   34   64:athrow          
		}
	}

	public int readRawLittleEndian32()
		throws IOException
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int pos>
	//    2    4:istore_1        
		if(limit - i < 4)
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:iconst_4        
	//*   8   12:icmpge          19
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//    9   15:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   10   18:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//   11   19:aload_0         
	//   12   20:getfield        #27  <Field byte[] buffer>
	//   13   23:astore_2        
			pos = i + 4;
	//   14   24:aload_0         
	//   15   25:iload_1         
	//   16   26:iconst_4        
	//   17   27:iadd            
	//   18   28:putfield        #31  <Field int pos>
			return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
	//   19   31:aload_2         
	//   20   32:iload_1         
	//   21   33:baload          
	//   22   34:sipush          255
	//   23   37:iand            
	//   24   38:aload_2         
	//   25   39:iload_1         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:baload          
	//   29   43:sipush          255
	//   30   46:iand            
	//   31   47:bipush          8
	//   32   49:ishl            
	//   33   50:ior             
	//   34   51:aload_2         
	//   35   52:iload_1         
	//   36   53:iconst_2        
	//   37   54:iadd            
	//   38   55:baload          
	//   39   56:sipush          255
	//   40   59:iand            
	//   41   60:bipush          16
	//   42   62:ishl            
	//   43   63:ior             
	//   44   64:aload_2         
	//   45   65:iload_1         
	//   46   66:iconst_3        
	//   47   67:iadd            
	//   48   68:baload          
	//   49   69:sipush          255
	//   50   72:iand            
	//   51   73:bipush          24
	//   52   75:ishl            
	//   53   76:ior             
	//   54   77:ireturn         
		}
	}

	public long readRawLittleEndian64()
		throws IOException
	{
		int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int pos>
	//    2    4:istore_1        
		if(limit - i < 8)
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:isub            
	//*   7   11:bipush          8
	//*   8   13:icmpge          20
		{
			throw InvalidProtocolBufferException.truncatedMessage();
	//    9   16:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   10   19:athrow          
		} else
		{
			byte abyte0[] = buffer;
	//   11   20:aload_0         
	//   12   21:getfield        #27  <Field byte[] buffer>
	//   13   24:astore_2        
			pos = i + 8;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:bipush          8
	//   17   29:iadd            
	//   18   30:putfield        #31  <Field int pos>
			return (long)abyte0[i] & 255L | ((long)abyte0[i + 1] & 255L) << 8 | ((long)abyte0[i + 2] & 255L) << 16 | ((long)abyte0[i + 3] & 255L) << 24 | ((long)abyte0[i + 4] & 255L) << 32 | ((long)abyte0[i + 5] & 255L) << 40 | ((long)abyte0[i + 6] & 255L) << 48 | ((long)abyte0[i + 7] & 255L) << 56;
	//   19   33:aload_2         
	//   20   34:iload_1         
	//   21   35:baload          
	//   22   36:i2l             
	//   23   37:ldc2w           #224 <Long 255L>
	//   24   40:land            
	//   25   41:aload_2         
	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:baload          
	//   30   46:i2l             
	//   31   47:ldc2w           #224 <Long 255L>
	//   32   50:land            
	//   33   51:bipush          8
	//   34   53:lshl            
	//   35   54:lor             
	//   36   55:aload_2         
	//   37   56:iload_1         
	//   38   57:iconst_2        
	//   39   58:iadd            
	//   40   59:baload          
	//   41   60:i2l             
	//   42   61:ldc2w           #224 <Long 255L>
	//   43   64:land            
	//   44   65:bipush          16
	//   45   67:lshl            
	//   46   68:lor             
	//   47   69:aload_2         
	//   48   70:iload_1         
	//   49   71:iconst_3        
	//   50   72:iadd            
	//   51   73:baload          
	//   52   74:i2l             
	//   53   75:ldc2w           #224 <Long 255L>
	//   54   78:land            
	//   55   79:bipush          24
	//   56   81:lshl            
	//   57   82:lor             
	//   58   83:aload_2         
	//   59   84:iload_1         
	//   60   85:iconst_4        
	//   61   86:iadd            
	//   62   87:baload          
	//   63   88:i2l             
	//   64   89:ldc2w           #224 <Long 255L>
	//   65   92:land            
	//   66   93:bipush          32
	//   67   95:lshl            
	//   68   96:lor             
	//   69   97:aload_2         
	//   70   98:iload_1         
	//   71   99:iconst_5        
	//   72  100:iadd            
	//   73  101:baload          
	//   74  102:i2l             
	//   75  103:ldc2w           #224 <Long 255L>
	//   76  106:land            
	//   77  107:bipush          40
	//   78  109:lshl            
	//   79  110:lor             
	//   80  111:aload_2         
	//   81  112:iload_1         
	//   82  113:bipush          6
	//   83  115:iadd            
	//   84  116:baload          
	//   85  117:i2l             
	//   86  118:ldc2w           #224 <Long 255L>
	//   87  121:land            
	//   88  122:bipush          48
	//   89  124:lshl            
	//   90  125:lor             
	//   91  126:aload_2         
	//   92  127:iload_1         
	//   93  128:bipush          7
	//   94  130:iadd            
	//   95  131:baload          
	//   96  132:i2l             
	//   97  133:ldc2w           #224 <Long 255L>
	//   98  136:land            
	//   99  137:bipush          56
	//  100  139:lshl            
	//  101  140:lor             
	//  102  141:lreturn         
		}
	}

	public int readRawVarint32()
		throws IOException
	{
label0:
		{
			int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int pos>
	//    2    4:istore_1        
			if(limit == i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:icmpne          16
				break label0;
	//    7   13:goto            272
			byte abyte0[] = buffer;
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field byte[] buffer>
	//   10   20:astore          6
			int j = i + 1;
	//   11   22:iload_1         
	//   12   23:iconst_1        
	//   13   24:iadd            
	//   14   25:istore_2        
			int k = ((int) (abyte0[i]));
	//   15   26:aload           6
	//   16   28:iload_1         
	//   17   29:baload          
	//   18   30:istore_3        
			if(k >= 0)
	//*  19   31:iload_3         
	//*  20   32:iflt            42
			{
				pos = j;
	//   21   35:aload_0         
	//   22   36:iload_2         
	//   23   37:putfield        #31  <Field int pos>
				return k;
	//   24   40:iload_3         
	//   25   41:ireturn         
			}
			if(limit - j < 9)
	//*  26   42:aload_0         
	//*  27   43:getfield        #29  <Field int limit>
	//*  28   46:iload_2         
	//*  29   47:isub            
	//*  30   48:bipush          9
	//*  31   50:icmpge          56
				break label0;
	//   32   53:goto            272
			i = j + 1;
	//   33   56:iload_2         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_1        
			k = abyte0[j] << 7 ^ k;
	//   37   60:aload           6
	//   38   62:iload_2         
	//   39   63:baload          
	//   40   64:bipush          7
	//   41   66:ishl            
	//   42   67:iload_3         
	//   43   68:ixor            
	//   44   69:istore_3        
			if(k < 0)
	//*  45   70:iload_3         
	//*  46   71:ifge            82
			{
				j = k ^ 0xffffff80;
	//   47   74:iload_3         
	//   48   75:bipush          -128
	//   49   77:ixor            
	//   50   78:istore_2        
			} else
	//*  51   79:goto            265
			{
				j = i + 1;
	//   52   82:iload_1         
	//   53   83:iconst_1        
	//   54   84:iadd            
	//   55   85:istore_2        
				k = abyte0[i] << 14 ^ k;
	//   56   86:aload           6
	//   57   88:iload_1         
	//   58   89:baload          
	//   59   90:bipush          14
	//   60   92:ishl            
	//   61   93:iload_3         
	//   62   94:ixor            
	//   63   95:istore_3        
				if(k >= 0)
	//*  64   96:iload_3         
	//*  65   97:iflt            113
				{
					k ^= 0x3f80;
	//   66  100:iload_3         
	//   67  101:sipush          16256
	//   68  104:ixor            
	//   69  105:istore_3        
					i = j;
	//   70  106:iload_2         
	//   71  107:istore_1        
					j = k;
	//   72  108:iload_3         
	//   73  109:istore_2        
				} else
	//*  74  110:goto            265
				{
					i = j + 1;
	//   75  113:iload_2         
	//   76  114:iconst_1        
	//   77  115:iadd            
	//   78  116:istore_1        
					j = abyte0[j] << 21 ^ k;
	//   79  117:aload           6
	//   80  119:iload_2         
	//   81  120:baload          
	//   82  121:bipush          21
	//   83  123:ishl            
	//   84  124:iload_3         
	//   85  125:ixor            
	//   86  126:istore_2        
					if(j < 0)
	//*  87  127:iload_2         
	//*  88  128:ifge            139
					{
						j ^= 0xffe03f80;
	//   89  131:iload_2         
	//   90  132:ldc1            #226 <Int 0xffe03f80>
	//   91  134:ixor            
	//   92  135:istore_2        
					} else
	//*  93  136:goto            265
					{
						int i1 = i + 1;
	//   94  139:iload_1         
	//   95  140:iconst_1        
	//   96  141:iadd            
	//   97  142:istore          4
						byte byte0 = abyte0[i];
	//   98  144:aload           6
	//   99  146:iload_1         
	//  100  147:baload          
	//  101  148:istore          5
						int l = j ^ byte0 << 28 ^ 0xfe03f80;
	//  102  150:iload_2         
	//  103  151:iload           5
	//  104  153:bipush          28
	//  105  155:ishl            
	//  106  156:ixor            
	//  107  157:ldc1            #227 <Int 0xfe03f80>
	//  108  159:ixor            
	//  109  160:istore_3        
						i = i1;
	//  110  161:iload           4
	//  111  163:istore_1        
						j = l;
	//  112  164:iload_3         
	//  113  165:istore_2        
						if(byte0 < 0)
	//* 114  166:iload           5
	//* 115  168:ifge            265
						{
							int l1 = i1 + 1;
	//  116  171:iload           4
	//  117  173:iconst_1        
	//  118  174:iadd            
	//  119  175:istore          5
							i = l1;
	//  120  177:iload           5
	//  121  179:istore_1        
							j = l;
	//  122  180:iload_3         
	//  123  181:istore_2        
							if(abyte0[i1] < 0)
	//* 124  182:aload           6
	//* 125  184:iload           4
	//* 126  186:baload          
	//* 127  187:ifge            265
							{
								int j1 = l1 + 1;
	//  128  190:iload           5
	//  129  192:iconst_1        
	//  130  193:iadd            
	//  131  194:istore          4
								i = j1;
	//  132  196:iload           4
	//  133  198:istore_1        
								j = l;
	//  134  199:iload_3         
	//  135  200:istore_2        
								if(abyte0[l1] < 0)
	//* 136  201:aload           6
	//* 137  203:iload           5
	//* 138  205:baload          
	//* 139  206:ifge            265
								{
									int i2 = j1 + 1;
	//  140  209:iload           4
	//  141  211:iconst_1        
	//  142  212:iadd            
	//  143  213:istore          5
									i = i2;
	//  144  215:iload           5
	//  145  217:istore_1        
									j = l;
	//  146  218:iload_3         
	//  147  219:istore_2        
									if(abyte0[j1] < 0)
	//* 148  220:aload           6
	//* 149  222:iload           4
	//* 150  224:baload          
	//* 151  225:ifge            265
									{
										int k1 = i2 + 1;
	//  152  228:iload           5
	//  153  230:iconst_1        
	//  154  231:iadd            
	//  155  232:istore          4
										i = k1;
	//  156  234:iload           4
	//  157  236:istore_1        
										j = l;
	//  158  237:iload_3         
	//  159  238:istore_2        
										if(abyte0[i2] < 0)
	//* 160  239:aload           6
	//* 161  241:iload           5
	//* 162  243:baload          
	//* 163  244:ifge            265
										{
											i = k1 + 1;
	//  164  247:iload           4
	//  165  249:iconst_1        
	//  166  250:iadd            
	//  167  251:istore_1        
											j = l;
	//  168  252:iload_3         
	//  169  253:istore_2        
											if(abyte0[k1] < 0)
	//* 170  254:aload           6
	//* 171  256:iload           4
	//* 172  258:baload          
	//* 173  259:ifge            265
												break label0;
	//  174  262:goto            272
										}
									}
								}
							}
						}
					}
				}
			}
			pos = i;
	//  175  265:aload_0         
	//  176  266:iload_1         
	//  177  267:putfield        #31  <Field int pos>
			return j;
	//  178  270:iload_2         
	//  179  271:ireturn         
		}
		return (int)readRawVarint64SlowPath();
	//  180  272:aload_0         
	//  181  273:invokevirtual   #230 <Method long readRawVarint64SlowPath()>
	//  182  276:l2i             
	//  183  277:ireturn         
	}

	public long readRawVarint64()
		throws IOException
	{
label0:
		{
			int i = pos;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int pos>
	//    2    4:istore_1        
			if(limit == i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field int limit>
	//*   5    9:iload_1         
	//*   6   10:icmpne          16
				break label0;
	//    7   13:goto            355
			byte abyte0[] = buffer;
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field byte[] buffer>
	//   10   20:astore          8
			int j = i + 1;
	//   11   22:iload_1         
	//   12   23:iconst_1        
	//   13   24:iadd            
	//   14   25:istore_2        
			int j1 = ((int) (abyte0[i]));
	//   15   26:aload           8
	//   16   28:iload_1         
	//   17   29:baload          
	//   18   30:istore_3        
			if(j1 >= 0)
	//*  19   31:iload_3         
	//*  20   32:iflt            43
			{
				pos = j;
	//   21   35:aload_0         
	//   22   36:iload_2         
	//   23   37:putfield        #31  <Field int pos>
				return (long)j1;
	//   24   40:iload_3         
	//   25   41:i2l             
	//   26   42:lreturn         
			}
			if(limit - j < 9)
	//*  27   43:aload_0         
	//*  28   44:getfield        #29  <Field int limit>
	//*  29   47:iload_2         
	//*  30   48:isub            
	//*  31   49:bipush          9
	//*  32   51:icmpge          57
				break label0;
	//   33   54:goto            355
			i = j + 1;
	//   34   57:iload_2         
	//   35   58:iconst_1        
	//   36   59:iadd            
	//   37   60:istore_1        
			j1 = abyte0[j] << 7 ^ j1;
	//   38   61:aload           8
	//   39   63:iload_2         
	//   40   64:baload          
	//   41   65:bipush          7
	//   42   67:ishl            
	//   43   68:iload_3         
	//   44   69:ixor            
	//   45   70:istore_3        
			long l1;
			if(j1 < 0)
	//*  46   71:iload_3         
	//*  47   72:ifge            85
			{
				l1 = j1 ^ 0xffffff80;
	//   48   75:iload_3         
	//   49   76:bipush          -128
	//   50   78:ixor            
	//   51   79:i2l             
	//   52   80:lstore          4
			} else
	//*  53   82:goto            347
			{
				int k = i + 1;
	//   54   85:iload_1         
	//   55   86:iconst_1        
	//   56   87:iadd            
	//   57   88:istore_2        
				j1 = abyte0[i] << 14 ^ j1;
	//   58   89:aload           8
	//   59   91:iload_1         
	//   60   92:baload          
	//   61   93:bipush          14
	//   62   95:ishl            
	//   63   96:iload_3         
	//   64   97:ixor            
	//   65   98:istore_3        
				if(j1 >= 0)
	//*  66   99:iload_3         
	//*  67  100:iflt            116
				{
					l1 = j1 ^ 0x3f80;
	//   68  103:iload_3         
	//   69  104:sipush          16256
	//   70  107:ixor            
	//   71  108:i2l             
	//   72  109:lstore          4
					i = k;
	//   73  111:iload_2         
	//   74  112:istore_1        
				} else
	//*  75  113:goto            347
				{
					i = k + 1;
	//   76  116:iload_2         
	//   77  117:iconst_1        
	//   78  118:iadd            
	//   79  119:istore_1        
					k = abyte0[k] << 21 ^ j1;
	//   80  120:aload           8
	//   81  122:iload_2         
	//   82  123:baload          
	//   83  124:bipush          21
	//   84  126:ishl            
	//   85  127:iload_3         
	//   86  128:ixor            
	//   87  129:istore_2        
					if(k < 0)
	//*  88  130:iload_2         
	//*  89  131:ifge            144
					{
						l1 = 0xffe03f80 ^ k;
	//   90  134:ldc1            #226 <Int 0xffe03f80>
	//   91  136:iload_2         
	//   92  137:ixor            
	//   93  138:i2l             
	//   94  139:lstore          4
					} else
	//*  95  141:goto            347
					{
						l1 = k;
	//   96  144:iload_2         
	//   97  145:i2l             
	//   98  146:lstore          4
						k = i + 1;
	//   99  148:iload_1         
	//  100  149:iconst_1        
	//  101  150:iadd            
	//  102  151:istore_2        
						l1 ^= (long)abyte0[i] << 28;
	//  103  152:lload           4
	//  104  154:aload           8
	//  105  156:iload_1         
	//  106  157:baload          
	//  107  158:i2l             
	//  108  159:bipush          28
	//  109  161:lshl            
	//  110  162:lxor            
	//  111  163:lstore          4
						if(l1 >= 0L)
	//* 112  165:lload           4
	//* 113  167:lconst_0        
	//* 114  168:lcmp            
	//* 115  169:iflt            185
						{
							l1 ^= 0xfe03f80L;
	//  116  172:lload           4
	//  117  174:ldc2w           #231 <Long 0xfe03f80L>
	//  118  177:lxor            
	//  119  178:lstore          4
							i = k;
	//  120  180:iload_2         
	//  121  181:istore_1        
						} else
	//* 122  182:goto            347
						{
							i = k + 1;
	//  123  185:iload_2         
	//  124  186:iconst_1        
	//  125  187:iadd            
	//  126  188:istore_1        
							l1 = (long)abyte0[k] << 35 ^ l1;
	//  127  189:aload           8
	//  128  191:iload_2         
	//  129  192:baload          
	//  130  193:i2l             
	//  131  194:bipush          35
	//  132  196:lshl            
	//  133  197:lload           4
	//  134  199:lxor            
	//  135  200:lstore          4
							if(l1 < 0L)
	//* 136  202:lload           4
	//* 137  204:lconst_0        
	//* 138  205:lcmp            
	//* 139  206:ifge            220
							{
								l1 ^= 0xfe03f80L;
	//  140  209:lload           4
	//  141  211:ldc2w           #233 <Long 0xfe03f80L>
	//  142  214:lxor            
	//  143  215:lstore          4
							} else
	//* 144  217:goto            347
							{
								int l = i + 1;
	//  145  220:iload_1         
	//  146  221:iconst_1        
	//  147  222:iadd            
	//  148  223:istore_2        
								l1 = (long)abyte0[i] << 42 ^ l1;
	//  149  224:aload           8
	//  150  226:iload_1         
	//  151  227:baload          
	//  152  228:i2l             
	//  153  229:bipush          42
	//  154  231:lshl            
	//  155  232:lload           4
	//  156  234:lxor            
	//  157  235:lstore          4
								if(l1 >= 0L)
	//* 158  237:lload           4
	//* 159  239:lconst_0        
	//* 160  240:lcmp            
	//* 161  241:iflt            257
								{
									l1 ^= 0xfe03f80L;
	//  162  244:lload           4
	//  163  246:ldc2w           #235 <Long 0xfe03f80L>
	//  164  249:lxor            
	//  165  250:lstore          4
									i = l;
	//  166  252:iload_2         
	//  167  253:istore_1        
								} else
	//* 168  254:goto            347
								{
									i = l + 1;
	//  169  257:iload_2         
	//  170  258:iconst_1        
	//  171  259:iadd            
	//  172  260:istore_1        
									l1 = (long)abyte0[l] << 49 ^ l1;
	//  173  261:aload           8
	//  174  263:iload_2         
	//  175  264:baload          
	//  176  265:i2l             
	//  177  266:bipush          49
	//  178  268:lshl            
	//  179  269:lload           4
	//  180  271:lxor            
	//  181  272:lstore          4
									if(l1 < 0L)
	//* 182  274:lload           4
	//* 183  276:lconst_0        
	//* 184  277:lcmp            
	//* 185  278:ifge            292
									{
										l1 ^= 0xfe03f80L;
	//  186  281:lload           4
	//  187  283:ldc2w           #237 <Long 0xfe03f80L>
	//  188  286:lxor            
	//  189  287:lstore          4
									} else
	//* 190  289:goto            347
									{
										int i1 = i + 1;
	//  191  292:iload_1         
	//  192  293:iconst_1        
	//  193  294:iadd            
	//  194  295:istore_2        
										long l2 = l1 ^ (long)abyte0[i] << 56 ^ 0xfe03f80L;
	//  195  296:lload           4
	//  196  298:aload           8
	//  197  300:iload_1         
	//  198  301:baload          
	//  199  302:i2l             
	//  200  303:bipush          56
	//  201  305:lshl            
	//  202  306:lxor            
	//  203  307:ldc2w           #239 <Long 0xfe03f80L>
	//  204  310:lxor            
	//  205  311:lstore          6
										i = i1;
	//  206  313:iload_2         
	//  207  314:istore_1        
										l1 = l2;
	//  208  315:lload           6
	//  209  317:lstore          4
										if(l2 < 0L)
	//* 210  319:lload           6
	//* 211  321:lconst_0        
	//* 212  322:lcmp            
	//* 213  323:ifge            347
										{
											i = i1 + 1;
	//  214  326:iload_2         
	//  215  327:iconst_1        
	//  216  328:iadd            
	//  217  329:istore_1        
											l1 = l2;
	//  218  330:lload           6
	//  219  332:lstore          4
											if((long)abyte0[i1] < 0L)
	//* 220  334:aload           8
	//* 221  336:iload_2         
	//* 222  337:baload          
	//* 223  338:i2l             
	//* 224  339:lconst_0        
	//* 225  340:lcmp            
	//* 226  341:ifge            347
												break label0;
	//  227  344:goto            355
										}
									}
								}
							}
						}
					}
				}
			}
			pos = i;
	//  228  347:aload_0         
	//  229  348:iload_1         
	//  230  349:putfield        #31  <Field int pos>
			return l1;
	//  231  352:lload           4
	//  232  354:lreturn         
		}
		return readRawVarint64SlowPath();
	//  233  355:aload_0         
	//  234  356:invokevirtual   #230 <Method long readRawVarint64SlowPath()>
	//  235  359:lreturn         
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
	//    8   11:invokevirtual   #63  <Method byte readRawByte()>
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
	//   30   43:invokestatic    #59  <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   31   46:athrow          
	}

	public int readSFixed32()
		throws IOException
	{
		return readRawLittleEndian32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #165 <Method int readRawLittleEndian32()>
	//    2    4:ireturn         
	}

	public long readSFixed64()
		throws IOException
	{
		return readRawLittleEndian64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #154 <Method long readRawLittleEndian64()>
	//    2    4:lreturn         
	}

	public int readSInt32()
		throws IOException
	{
		return decodeZigZag32(readRawVarint32());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:invokestatic    #246 <Method int decodeZigZag32(int)>
	//    3    7:ireturn         
	}

	public long readSInt64()
		throws IOException
	{
		return decodeZigZag64(readRawVarint64());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method long readRawVarint64()>
	//    2    4:invokestatic    #251 <Method long decodeZigZag64(long)>
	//    3    7:lreturn         
	}

	public String readString()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            54
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #29  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          54
		{
			String s = new String(buffer, pos, i, Internal.UTF_8);
	//   12   22:new             #255 <Class String>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:getfield        #27  <Field byte[] buffer>
	//   16   30:aload_0         
	//   17   31:getfield        #31  <Field int pos>
	//   18   34:iload_1         
	//   19   35:getstatic       #259 <Field java.nio.charset.Charset Internal.UTF_8>
	//   20   38:invokespecial   #262 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   21   41:astore_2        
			pos = pos + i;
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #31  <Field int pos>
	//   25   47:iload_1         
	//   26   48:iadd            
	//   27   49:putfield        #31  <Field int pos>
			return s;
	//   28   52:aload_2         
	//   29   53:areturn         
		}
		if(i == 0)
	//*  30   54:iload_1         
	//*  31   55:ifne            62
			return "";
	//   32   58:ldc2            #264 <String "">
	//   33   61:areturn         
		if(i < 0)
	//*  34   62:iload_1         
	//*  35   63:ifge            70
			throw InvalidProtocolBufferException.negativeSize();
	//   36   66:invokestatic    #89  <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   37   69:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   38   70:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   39   73:athrow          
	}

	public String readStringRequireUtf8()
		throws IOException
	{
		int i = readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:istore_1        
		if(i > 0 && i <= limit - pos)
	//*   3    5:iload_1         
	//*   4    6:ifle            78
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #29  <Field int limit>
	//*   8   14:aload_0         
	//*   9   15:getfield        #31  <Field int pos>
	//*  10   18:isub            
	//*  11   19:icmpgt          78
			if(!Utf8.isValidUtf8(buffer, pos, pos + i))
	//*  12   22:aload_0         
	//*  13   23:getfield        #27  <Field byte[] buffer>
	//*  14   26:aload_0         
	//*  15   27:getfield        #31  <Field int pos>
	//*  16   30:aload_0         
	//*  17   31:getfield        #31  <Field int pos>
	//*  18   34:iload_1         
	//*  19   35:iadd            
	//*  20   36:invokestatic    #271 <Method boolean Utf8.isValidUtf8(byte[], int, int)>
	//*  21   39:ifne            46
			{
				throw InvalidProtocolBufferException.invalidUtf8();
	//   22   42:invokestatic    #274 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidUtf8()>
	//   23   45:athrow          
			} else
			{
				int j = pos;
	//   24   46:aload_0         
	//   25   47:getfield        #31  <Field int pos>
	//   26   50:istore_2        
				pos = pos + i;
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:getfield        #31  <Field int pos>
	//   30   56:iload_1         
	//   31   57:iadd            
	//   32   58:putfield        #31  <Field int pos>
				return new String(buffer, j, i, Internal.UTF_8);
	//   33   61:new             #255 <Class String>
	//   34   64:dup             
	//   35   65:aload_0         
	//   36   66:getfield        #27  <Field byte[] buffer>
	//   37   69:iload_2         
	//   38   70:iload_1         
	//   39   71:getstatic       #259 <Field java.nio.charset.Charset Internal.UTF_8>
	//   40   74:invokespecial   #262 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   41   77:areturn         
			}
		if(i == 0)
	//*  42   78:iload_1         
	//*  43   79:ifne            86
			return "";
	//   44   82:ldc2            #264 <String "">
	//   45   85:areturn         
		if(i <= 0)
	//*  46   86:iload_1         
	//*  47   87:ifgt            94
			throw InvalidProtocolBufferException.negativeSize();
	//   48   90:invokestatic    #89  <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   49   93:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   50   94:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   51   97:athrow          
	}

	public int readTag()
		throws IOException
	{
		if(isAtEnd())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #277 <Method boolean isAtEnd()>
	//*   2    4:ifeq            14
		{
			lastTag = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #67  <Field int lastTag>
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		}
		lastTag = readRawVarint32();
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #102 <Method int readRawVarint32()>
	//   11   19:putfield        #67  <Field int lastTag>
		if(WireFormat.getTagFieldNumber(lastTag) == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #67  <Field int lastTag>
	//*  14   26:invokestatic    #280 <Method int WireFormat.getTagFieldNumber(int)>
	//*  15   29:ifne            36
			throw InvalidProtocolBufferException.invalidTag();
	//   16   32:invokestatic    #283 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidTag()>
	//   17   35:athrow          
		else
			return lastTag;
	//   18   36:aload_0         
	//   19   37:getfield        #67  <Field int lastTag>
	//   20   40:ireturn         
	}

	public int readUInt32()
		throws IOException
	{
		return readRawVarint32();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method int readRawVarint32()>
	//    2    4:ireturn         
	}

	public long readUInt64()
		throws IOException
	{
		return readRawVarint64();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method long readRawVarint64()>
	//    2    4:lreturn         
	}

	public void readUnknownGroup(int i, MessageLite.Builder builder)
		throws IOException
	{
		readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #294 <Method ExtensionRegistryLite ExtensionRegistryLite.getEmptyRegistry()>
	//    4    6:invokevirtual   #296 <Method void readGroup(int, MessageLite$Builder, ExtensionRegistryLite)>
	//    5    9:return          
	}

	public void resetSizeCounter()
	{
		startPos = pos;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field int pos>
	//    3    5:putfield        #33  <Field int startPos>
	//    4    8:return          
	}

	public boolean skipField(int i)
		throws IOException
	{
		switch(WireFormat.getTagWireType(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #303 <Method int WireFormat.getTagWireType(int)>
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
	//    5   48:invokespecial   #305 <Method void skipRawVarint()>
			return true;
	//    6   51:iconst_1        
	//    7   52:ireturn         

		case 1: // '\001'
			skipRawBytes(8);
	//    8   53:aload_0         
	//    9   54:bipush          8
	//   10   56:invokevirtual   #308 <Method void skipRawBytes(int)>
			return true;
	//   11   59:iconst_1        
	//   12   60:ireturn         

		case 2: // '\002'
			skipRawBytes(readRawVarint32());
	//   13   61:aload_0         
	//   14   62:aload_0         
	//   15   63:invokevirtual   #102 <Method int readRawVarint32()>
	//   16   66:invokevirtual   #308 <Method void skipRawBytes(int)>
			return true;
	//   17   69:iconst_1        
	//   18   70:ireturn         

		case 3: // '\003'
			skipMessage();
	//   19   71:aload_0         
	//   20   72:invokevirtual   #311 <Method void skipMessage()>
			checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
	//   21   75:aload_0         
	//   22   76:iload_1         
	//   23   77:invokestatic    #280 <Method int WireFormat.getTagFieldNumber(int)>
	//   24   80:iconst_4        
	//   25   81:invokestatic    #199 <Method int WireFormat.makeTag(int, int)>
	//   26   84:invokevirtual   #201 <Method void checkLastTagWas(int)>
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
	//   33   93:invokevirtual   #308 <Method void skipRawBytes(int)>
			return true;
	//   34   96:iconst_1        
	//   35   97:ireturn         
		}
		throw InvalidProtocolBufferException.invalidWireType();
	//   36   98:invokestatic    #315 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
	//   37  101:athrow          
	}

	public boolean skipField(int i, CodedOutputStream codedoutputstream)
		throws IOException
	{
		switch(WireFormat.getTagWireType(i))
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #303 <Method int WireFormat.getTagWireType(int)>
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
	//    5   48:invokevirtual   #318 <Method long readInt64()>
	//    6   51:lstore          4
			codedoutputstream.writeRawVarint32(i);
	//    7   53:aload_2         
	//    8   54:iload_1         
	//    9   55:invokevirtual   #323 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeUInt64NoTag(l);
	//   10   58:aload_2         
	//   11   59:lload           4
	//   12   61:invokevirtual   #327 <Method void CodedOutputStream.writeUInt64NoTag(long)>
			return true;
	//   13   64:iconst_1        
	//   14   65:ireturn         

		case 1: // '\001'
			long l1 = readRawLittleEndian64();
	//   15   66:aload_0         
	//   16   67:invokevirtual   #154 <Method long readRawLittleEndian64()>
	//   17   70:lstore          4
			codedoutputstream.writeRawVarint32(i);
	//   18   72:aload_2         
	//   19   73:iload_1         
	//   20   74:invokevirtual   #323 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeFixed64NoTag(l1);
	//   21   77:aload_2         
	//   22   78:lload           4
	//   23   80:invokevirtual   #330 <Method void CodedOutputStream.writeFixed64NoTag(long)>
			return true;
	//   24   83:iconst_1        
	//   25   84:ireturn         

		case 2: // '\002'
			ByteString bytestring = readBytes();
	//   26   85:aload_0         
	//   27   86:invokevirtual   #332 <Method ByteString readBytes()>
	//   28   89:astore          6
			codedoutputstream.writeRawVarint32(i);
	//   29   91:aload_2         
	//   30   92:iload_1         
	//   31   93:invokevirtual   #323 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeBytesNoTag(bytestring);
	//   32   96:aload_2         
	//   33   97:aload           6
	//   34   99:invokevirtual   #336 <Method void CodedOutputStream.writeBytesNoTag(ByteString)>
			return true;
	//   35  102:iconst_1        
	//   36  103:ireturn         

		case 3: // '\003'
			codedoutputstream.writeRawVarint32(i);
	//   37  104:aload_2         
	//   38  105:iload_1         
	//   39  106:invokevirtual   #323 <Method void CodedOutputStream.writeRawVarint32(int)>
			skipMessage(codedoutputstream);
	//   40  109:aload_0         
	//   41  110:aload_2         
	//   42  111:invokevirtual   #339 <Method void skipMessage(CodedOutputStream)>
			i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
	//   43  114:iload_1         
	//   44  115:invokestatic    #280 <Method int WireFormat.getTagFieldNumber(int)>
	//   45  118:iconst_4        
	//   46  119:invokestatic    #199 <Method int WireFormat.makeTag(int, int)>
	//   47  122:istore_1        
			checkLastTagWas(i);
	//   48  123:aload_0         
	//   49  124:iload_1         
	//   50  125:invokevirtual   #201 <Method void checkLastTagWas(int)>
			codedoutputstream.writeRawVarint32(i);
	//   51  128:aload_2         
	//   52  129:iload_1         
	//   53  130:invokevirtual   #323 <Method void CodedOutputStream.writeRawVarint32(int)>
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
	//   59  138:invokevirtual   #165 <Method int readRawLittleEndian32()>
	//   60  141:istore_3        
			codedoutputstream.writeRawVarint32(i);
	//   61  142:aload_2         
	//   62  143:iload_1         
	//   63  144:invokevirtual   #323 <Method void CodedOutputStream.writeRawVarint32(int)>
			codedoutputstream.writeFixed32NoTag(j);
	//   64  147:aload_2         
	//   65  148:iload_3         
	//   66  149:invokevirtual   #342 <Method void CodedOutputStream.writeFixed32NoTag(int)>
			return true;
	//   67  152:iconst_1        
	//   68  153:ireturn         
		}
		throw InvalidProtocolBufferException.invalidWireType();
	//   69  154:invokestatic    #315 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
	//   70  157:athrow          
	}

	public void skipMessage()
		throws IOException
	{
		int i;
		do
			i = readTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #344 <Method int readTag()>
	//    2    4:istore_1        
		while(i != 0 && skipField(i));
	//    3    5:iload_1         
	//    4    6:ifeq            17
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #346 <Method boolean skipField(int)>
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
	//    1    1:invokevirtual   #344 <Method int readTag()>
	//    2    4:istore_2        
		while(i != 0 && skipField(i, codedoutputstream));
	//    3    5:iload_2         
	//    4    6:ifeq            18
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #348 <Method boolean skipField(int, CodedOutputStream)>
	//    9   15:ifne            19
	//   10   18:return          
	//*  11   19:goto            0
	}

	public void skipRawBytes(int i)
		throws IOException
	{
		if(i >= 0 && i <= limit - pos)
	//*   0    0:iload_1         
	//*   1    1:iflt            28
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #29  <Field int limit>
	//*   5    9:aload_0         
	//*   6   10:getfield        #31  <Field int pos>
	//*   7   13:isub            
	//*   8   14:icmpgt          28
		{
			pos = pos + i;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #31  <Field int pos>
	//   12   22:iload_1         
	//   13   23:iadd            
	//   14   24:putfield        #31  <Field int pos>
			return;
	//   15   27:return          
		}
		if(i < 0)
	//*  16   28:iload_1         
	//*  17   29:ifge            36
			throw InvalidProtocolBufferException.negativeSize();
	//   18   32:invokestatic    #89  <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
	//   19   35:athrow          
		else
			throw InvalidProtocolBufferException.truncatedMessage();
	//   20   36:invokestatic    #92  <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   21   39:athrow          
	}

	private final byte buffer[];
	private int bufferSizeAfterLimit;
	private int currentLimit;
	private boolean enableAliasing;
	private final boolean immutable;
	private int lastTag;
	private int limit;
	private int pos;
	private int startPos;

	private CodedInputStream$ArrayDecoder(byte abyte0[], int i, int j, boolean flag)
	{
		super(((CodedInputStream._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #22  <Method void CodedInputStream(CodedInputStream$1)>
		currentLimit = 0x7fffffff;
	//    3    5:aload_0         
	//    4    6:ldc1            #23  <Int 0x7fffffff>
	//    5    8:putfield        #25  <Field int currentLimit>
		buffer = abyte0;
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:putfield        #27  <Field byte[] buffer>
		limit = i + j;
	//    9   16:aload_0         
	//   10   17:iload_2         
	//   11   18:iload_3         
	//   12   19:iadd            
	//   13   20:putfield        #29  <Field int limit>
		pos = i;
	//   14   23:aload_0         
	//   15   24:iload_2         
	//   16   25:putfield        #31  <Field int pos>
		startPos = pos;
	//   17   28:aload_0         
	//   18   29:aload_0         
	//   19   30:getfield        #31  <Field int pos>
	//   20   33:putfield        #33  <Field int startPos>
		immutable = flag;
	//   21   36:aload_0         
	//   22   37:iload           4
	//   23   39:putfield        #35  <Field boolean immutable>
	//   24   42:return          
	}

	CodedInputStream$ArrayDecoder(byte abyte0[], int i, int j, boolean flag, CodedInputStream._cls1 _pcls1)
	{
		this(abyte0, i, j, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #39  <Method void CodedInputStream$ArrayDecoder(byte[], int, int, boolean)>
	//    6    9:return          
	}
}
