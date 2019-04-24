// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			Internal, IterableByteBufferInputStream, InvalidProtocolBufferException, ByteString, 
//			Parser, ExtensionRegistryLite, MessageLite, CodedOutputStream, 
//			WireFormat, Utf8, UnsafeUtil

public abstract class CodedInputStream
{
	static final class ArrayDecoder extends CodedInputStream
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
		//		               0 47
		//		               1 53
		//		               2 61
		//		               3 71
		//		               4 89
		//		               5 91
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
		//		               0 47
		//		               1 66
		//		               2 85
		//		               3 104
		//		               4 135
		//		               5 137
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

		private ArrayDecoder(byte abyte0[], int i, int j, boolean flag)
		{
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

	}

	static final class IterableDirectByteBufferDecoder extends CodedInputStream
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
		//		               0 47
		//		               1 53
		//		               2 61
		//		               3 71
		//		               4 89
		//		               5 91
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
		//		               0 47
		//		               1 66
		//		               2 85
		//		               3 104
		//		               4 135
		//		               5 137
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

		private IterableDirectByteBufferDecoder(Iterable iterable, int i, boolean flag)
		{
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

	}

	static final class StreamDecoder extends CodedInputStream
	{

		private ByteString readBytesSlowPath(int i)
			throws IOException
		{
			byte abyte0[] = readRawBytesSlowPathOneChunk(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #67  <Method byte[] readRawBytesSlowPathOneChunk(int)>
		//    3    5:astore          4
			if(abyte0 != null)
		//*   4    7:aload           4
		//*   5    9:ifnull          18
				return ByteString.wrap(abyte0);
		//    6   12:aload           4
		//    7   14:invokestatic    #73  <Method ByteString ByteString.wrap(byte[])>
		//    8   17:areturn         
			int j = pos;
		//    9   18:aload_0         
		//   10   19:getfield        #49  <Field int pos>
		//   11   22:istore_2        
			int k = bufferSize - pos;
		//   12   23:aload_0         
		//   13   24:getfield        #47  <Field int bufferSize>
		//   14   27:aload_0         
		//   15   28:getfield        #49  <Field int pos>
		//   16   31:isub            
		//   17   32:istore_3        
			totalBytesRetired = totalBytesRetired + bufferSize;
		//   18   33:aload_0         
		//   19   34:aload_0         
		//   20   35:getfield        #51  <Field int totalBytesRetired>
		//   21   38:aload_0         
		//   22   39:getfield        #47  <Field int bufferSize>
		//   23   42:iadd            
		//   24   43:putfield        #51  <Field int totalBytesRetired>
			pos = 0;
		//   25   46:aload_0         
		//   26   47:iconst_0        
		//   27   48:putfield        #49  <Field int pos>
			bufferSize = 0;
		//   28   51:aload_0         
		//   29   52:iconst_0        
		//   30   53:putfield        #47  <Field int bufferSize>
			Object obj = ((Object) (readRawBytesSlowPathRemainingChunks(i - k)));
		//   31   56:aload_0         
		//   32   57:iload_1         
		//   33   58:iload_3         
		//   34   59:isub            
		//   35   60:invokespecial   #77  <Method List readRawBytesSlowPathRemainingChunks(int)>
		//   36   63:astore          5
			ArrayList arraylist = new ArrayList(((List) (obj)).size() + 1);
		//   37   65:new             #79  <Class ArrayList>
		//   38   68:dup             
		//   39   69:aload           5
		//   40   71:invokeinterface #85  <Method int List.size()>
		//   41   76:iconst_1        
		//   42   77:iadd            
		//   43   78:invokespecial   #88  <Method void ArrayList(int)>
		//   44   81:astore          4
			((List) (arraylist)).add(((Object) (ByteString.copyFrom(buffer, j, k))));
		//   45   83:aload           4
		//   46   85:aload_0         
		//   47   86:getfield        #45  <Field byte[] buffer>
		//   48   89:iload_2         
		//   49   90:iload_3         
		//   50   91:invokestatic    #92  <Method ByteString ByteString.copyFrom(byte[], int, int)>
		//   51   94:invokeinterface #96  <Method boolean List.add(Object)>
		//   52   99:pop             
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((List) (arraylist)).add(((Object) (ByteString.wrap((byte[])((Iterator) (obj)).next())))));
		//   53  100:aload           5
		//   54  102:invokeinterface #100 <Method Iterator List.iterator()>
		//   55  107:astore          5
		//   56  109:aload           5
		//   57  111:invokeinterface #106 <Method boolean Iterator.hasNext()>
		//   58  116:ifeq            143
		//   59  119:aload           4
		//   60  121:aload           5
		//   61  123:invokeinterface #110 <Method Object Iterator.next()>
		//   62  128:checkcast       #111 <Class byte[]>
		//   63  131:invokestatic    #73  <Method ByteString ByteString.wrap(byte[])>
		//   64  134:invokeinterface #96  <Method boolean List.add(Object)>
		//   65  139:pop             
		//*  66  140:goto            109
			return ByteString.copyFrom(((Iterable) (arraylist)));
		//   67  143:aload           4
		//   68  145:invokestatic    #114 <Method ByteString ByteString.copyFrom(Iterable)>
		//   69  148:areturn         
		}

		private byte[] readRawBytesSlowPath(int i)
			throws IOException
		{
			byte abyte0[] = readRawBytesSlowPathOneChunk(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #67  <Method byte[] readRawBytesSlowPathOneChunk(int)>
		//    3    5:astore          4
			if(abyte0 != null)
		//*   4    7:aload           4
		//*   5    9:ifnull          15
				return abyte0;
		//    6   12:aload           4
		//    7   14:areturn         
			int k = pos;
		//    8   15:aload_0         
		//    9   16:getfield        #49  <Field int pos>
		//   10   19:istore_3        
			int j = bufferSize - pos;
		//   11   20:aload_0         
		//   12   21:getfield        #47  <Field int bufferSize>
		//   13   24:aload_0         
		//   14   25:getfield        #49  <Field int pos>
		//   15   28:isub            
		//   16   29:istore_2        
			totalBytesRetired = totalBytesRetired + bufferSize;
		//   17   30:aload_0         
		//   18   31:aload_0         
		//   19   32:getfield        #51  <Field int totalBytesRetired>
		//   20   35:aload_0         
		//   21   36:getfield        #47  <Field int bufferSize>
		//   22   39:iadd            
		//   23   40:putfield        #51  <Field int totalBytesRetired>
			pos = 0;
		//   24   43:aload_0         
		//   25   44:iconst_0        
		//   26   45:putfield        #49  <Field int pos>
			bufferSize = 0;
		//   27   48:aload_0         
		//   28   49:iconst_0        
		//   29   50:putfield        #47  <Field int bufferSize>
			Object obj = ((Object) (readRawBytesSlowPathRemainingChunks(i - j)));
		//   30   53:aload_0         
		//   31   54:iload_1         
		//   32   55:iload_2         
		//   33   56:isub            
		//   34   57:invokespecial   #77  <Method List readRawBytesSlowPathRemainingChunks(int)>
		//   35   60:astore          5
			abyte0 = new byte[i];
		//   36   62:iload_1         
		//   37   63:newarray        byte[]
		//   38   65:astore          4
			System.arraycopy(((Object) (buffer)), k, ((Object) (abyte0)), 0, j);
		//   39   67:aload_0         
		//   40   68:getfield        #45  <Field byte[] buffer>
		//   41   71:iload_3         
		//   42   72:aload           4
		//   43   74:iconst_0        
		//   44   75:iload_2         
		//   45   76:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
			i = j;
		//   46   79:iload_2         
		//   47   80:istore_1        
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
		//*  48   81:aload           5
		//*  49   83:invokeinterface #100 <Method Iterator List.iterator()>
		//*  50   88:astore          5
		//*  51   90:aload           5
		//*  52   92:invokeinterface #106 <Method boolean Iterator.hasNext()>
		//*  53   97:ifeq            133
			{
				byte abyte1[] = (byte[])((Iterator) (obj)).next();
		//   54  100:aload           5
		//   55  102:invokeinterface #110 <Method Object Iterator.next()>
		//   56  107:checkcast       #111 <Class byte[]>
		//   57  110:astore          6
				System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, abyte1.length);
		//   58  112:aload           6
		//   59  114:iconst_0        
		//   60  115:aload           4
		//   61  117:iload_1         
		//   62  118:aload           6
		//   63  120:arraylength     
		//   64  121:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
				i += abyte1.length;
		//   65  124:iload_1         
		//   66  125:aload           6
		//   67  127:arraylength     
		//   68  128:iadd            
		//   69  129:istore_1        
			}

		//*  70  130:goto            90
			return abyte0;
		//   71  133:aload           4
		//   72  135:areturn         
		}

		private byte[] readRawBytesSlowPathOneChunk(int i)
			throws IOException
		{
			if(i == 0)
		//*   0    0:iload_1         
		//*   1    1:ifne            8
				return Internal.EMPTY_BYTE_ARRAY;
		//    2    4:getstatic       #125 <Field byte[] Internal.EMPTY_BYTE_ARRAY>
		//    3    7:areturn         
			if(i < 0)
		//*   4    8:iload_1         
		//*   5    9:ifge            16
				throw InvalidProtocolBufferException.negativeSize();
		//    6   12:invokestatic    #131 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
		//    7   15:athrow          
			int j = totalBytesRetired + pos + i;
		//    8   16:aload_0         
		//    9   17:getfield        #51  <Field int totalBytesRetired>
		//   10   20:aload_0         
		//   11   21:getfield        #49  <Field int pos>
		//   12   24:iadd            
		//   13   25:iload_1         
		//   14   26:iadd            
		//   15   27:istore_2        
			if(j - sizeLimit > 0)
		//*  16   28:iload_2         
		//*  17   29:aload_0         
		//*  18   30:getfield        #134 <Field int sizeLimit>
		//*  19   33:isub            
		//*  20   34:ifle            41
				throw InvalidProtocolBufferException.sizeLimitExceeded();
		//   21   37:invokestatic    #137 <Method InvalidProtocolBufferException InvalidProtocolBufferException.sizeLimitExceeded()>
		//   22   40:athrow          
			if(j > currentLimit)
		//*  23   41:iload_2         
		//*  24   42:aload_0         
		//*  25   43:getfield        #32  <Field int currentLimit>
		//*  26   46:icmple          71
			{
				skipRawBytes(currentLimit - totalBytesRetired - pos);
		//   27   49:aload_0         
		//   28   50:aload_0         
		//   29   51:getfield        #32  <Field int currentLimit>
		//   30   54:aload_0         
		//   31   55:getfield        #51  <Field int totalBytesRetired>
		//   32   58:isub            
		//   33   59:aload_0         
		//   34   60:getfield        #49  <Field int pos>
		//   35   63:isub            
		//   36   64:invokevirtual   #140 <Method void skipRawBytes(int)>
				throw InvalidProtocolBufferException.truncatedMessage();
		//   37   67:invokestatic    #143 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
		//   38   70:athrow          
			}
			j = bufferSize - pos;
		//   39   71:aload_0         
		//   40   72:getfield        #47  <Field int bufferSize>
		//   41   75:aload_0         
		//   42   76:getfield        #49  <Field int pos>
		//   43   79:isub            
		//   44   80:istore_2        
			int k = i - j;
		//   45   81:iload_1         
		//   46   82:iload_2         
		//   47   83:isub            
		//   48   84:istore_3        
			if(k < 4096 || k <= input.available())
		//*  49   85:iload_3         
		//*  50   86:sipush          4096
		//*  51   89:icmplt          103
		//*  52   92:iload_3         
		//*  53   93:aload_0         
		//*  54   94:getfield        #43  <Field InputStream input>
		//*  55   97:invokevirtual   #148 <Method int InputStream.available()>
		//*  56  100:icmpgt          196
			{
				byte abyte0[] = new byte[i];
		//   57  103:iload_1         
		//   58  104:newarray        byte[]
		//   59  106:astore          4
				System.arraycopy(((Object) (buffer)), pos, ((Object) (abyte0)), 0, j);
		//   60  108:aload_0         
		//   61  109:getfield        #45  <Field byte[] buffer>
		//   62  112:aload_0         
		//   63  113:getfield        #49  <Field int pos>
		//   64  116:aload           4
		//   65  118:iconst_0        
		//   66  119:iload_2         
		//   67  120:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
				totalBytesRetired = totalBytesRetired + bufferSize;
		//   68  123:aload_0         
		//   69  124:aload_0         
		//   70  125:getfield        #51  <Field int totalBytesRetired>
		//   71  128:aload_0         
		//   72  129:getfield        #47  <Field int bufferSize>
		//   73  132:iadd            
		//   74  133:putfield        #51  <Field int totalBytesRetired>
				pos = 0;
		//   75  136:aload_0         
		//   76  137:iconst_0        
		//   77  138:putfield        #49  <Field int pos>
				bufferSize = 0;
		//   78  141:aload_0         
		//   79  142:iconst_0        
		//   80  143:putfield        #47  <Field int bufferSize>
				int l;
				for(; j < abyte0.length; j += l)
		//*  81  146:iload_2         
		//*  82  147:aload           4
		//*  83  149:arraylength     
		//*  84  150:icmpge          193
				{
					l = input.read(abyte0, j, i - j);
		//   85  153:aload_0         
		//   86  154:getfield        #43  <Field InputStream input>
		//   87  157:aload           4
		//   88  159:iload_2         
		//   89  160:iload_1         
		//   90  161:iload_2         
		//   91  162:isub            
		//   92  163:invokevirtual   #152 <Method int InputStream.read(byte[], int, int)>
		//   93  166:istore_3        
					if(l == -1)
		//*  94  167:iload_3         
		//*  95  168:iconst_m1       
		//*  96  169:icmpne          176
						throw InvalidProtocolBufferException.truncatedMessage();
		//   97  172:invokestatic    #143 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
		//   98  175:athrow          
					totalBytesRetired = totalBytesRetired + l;
		//   99  176:aload_0         
		//  100  177:aload_0         
		//  101  178:getfield        #51  <Field int totalBytesRetired>
		//  102  181:iload_3         
		//  103  182:iadd            
		//  104  183:putfield        #51  <Field int totalBytesRetired>
				}

		//  105  186:iload_2         
		//  106  187:iload_3         
		//  107  188:iadd            
		//  108  189:istore_2        
		//* 109  190:goto            146
				return abyte0;
		//  110  193:aload           4
		//  111  195:areturn         
			} else
			{
				return null;
		//  112  196:aconst_null     
		//  113  197:areturn         
			}
		}

		private List readRawBytesSlowPathRemainingChunks(int i)
			throws IOException
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #79  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #155 <Method void ArrayList()>
		//    3    7:astore          4
			while(i > 0) 
		//*   4    9:iload_1         
		//*   5   10:ifle            94
			{
				byte abyte0[] = new byte[Math.min(i, 4096)];
		//    6   13:iload_1         
		//    7   14:sipush          4096
		//    8   17:invokestatic    #161 <Method int Math.min(int, int)>
		//    9   20:newarray        byte[]
		//   10   22:astore          5
				int k;
				for(int j = 0; j < abyte0.length; j += k)
		//*  11   24:iconst_0        
		//*  12   25:istore_2        
		//*  13   26:iload_2         
		//*  14   27:aload           5
		//*  15   29:arraylength     
		//*  16   30:icmpge          75
				{
					k = input.read(abyte0, j, abyte0.length - j);
		//   17   33:aload_0         
		//   18   34:getfield        #43  <Field InputStream input>
		//   19   37:aload           5
		//   20   39:iload_2         
		//   21   40:aload           5
		//   22   42:arraylength     
		//   23   43:iload_2         
		//   24   44:isub            
		//   25   45:invokevirtual   #152 <Method int InputStream.read(byte[], int, int)>
		//   26   48:istore_3        
					if(k == -1)
		//*  27   49:iload_3         
		//*  28   50:iconst_m1       
		//*  29   51:icmpne          58
						throw InvalidProtocolBufferException.truncatedMessage();
		//   30   54:invokestatic    #143 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
		//   31   57:athrow          
					totalBytesRetired = totalBytesRetired + k;
		//   32   58:aload_0         
		//   33   59:aload_0         
		//   34   60:getfield        #51  <Field int totalBytesRetired>
		//   35   63:iload_3         
		//   36   64:iadd            
		//   37   65:putfield        #51  <Field int totalBytesRetired>
				}

		//   38   68:iload_2         
		//   39   69:iload_3         
		//   40   70:iadd            
		//   41   71:istore_2        
		//*  42   72:goto            26
				i -= abyte0.length;
		//   43   75:iload_1         
		//   44   76:aload           5
		//   45   78:arraylength     
		//   46   79:isub            
		//   47   80:istore_1        
				((List) (arraylist)).add(((Object) (abyte0)));
		//   48   81:aload           4
		//   49   83:aload           5
		//   50   85:invokeinterface #96  <Method boolean List.add(Object)>
		//   51   90:pop             
			}
		//*  52   91:goto            9
			return ((List) (arraylist));
		//   53   94:aload           4
		//   54   96:areturn         
		}

		private void recomputeBufferSizeAfterLimit()
		{
			bufferSize = bufferSize + bufferSizeAfterLimit;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #47  <Field int bufferSize>
		//    3    5:aload_0         
		//    4    6:getfield        #166 <Field int bufferSizeAfterLimit>
		//    5    9:iadd            
		//    6   10:putfield        #47  <Field int bufferSize>
			int i = totalBytesRetired + bufferSize;
		//    7   13:aload_0         
		//    8   14:getfield        #51  <Field int totalBytesRetired>
		//    9   17:aload_0         
		//   10   18:getfield        #47  <Field int bufferSize>
		//   11   21:iadd            
		//   12   22:istore_1        
			if(i > currentLimit)
		//*  13   23:iload_1         
		//*  14   24:aload_0         
		//*  15   25:getfield        #32  <Field int currentLimit>
		//*  16   28:icmple          55
			{
				bufferSizeAfterLimit = i - currentLimit;
		//   17   31:aload_0         
		//   18   32:iload_1         
		//   19   33:aload_0         
		//   20   34:getfield        #32  <Field int currentLimit>
		//   21   37:isub            
		//   22   38:putfield        #166 <Field int bufferSizeAfterLimit>
				bufferSize = bufferSize - bufferSizeAfterLimit;
		//   23   41:aload_0         
		//   24   42:aload_0         
		//   25   43:getfield        #47  <Field int bufferSize>
		//   26   46:aload_0         
		//   27   47:getfield        #166 <Field int bufferSizeAfterLimit>
		//   28   50:isub            
		//   29   51:putfield        #47  <Field int bufferSize>
				return;
		//   30   54:return          
			} else
			{
				bufferSizeAfterLimit = 0;
		//   31   55:aload_0         
		//   32   56:iconst_0        
		//   33   57:putfield        #166 <Field int bufferSizeAfterLimit>
				return;
		//   34   60:return          
			}
		}

		private void refillBuffer(int i)
			throws IOException
		{
			if(!tryRefillBuffer(i))
		//*   0    0:aload_0         
		//*   1    1:iload_1         
		//*   2    2:invokespecial   #171 <Method boolean tryRefillBuffer(int)>
		//*   3    5:ifne            34
			{
				if(i > sizeLimit - totalBytesRetired - pos)
		//*   4    8:iload_1         
		//*   5    9:aload_0         
		//*   6   10:getfield        #134 <Field int sizeLimit>
		//*   7   13:aload_0         
		//*   8   14:getfield        #51  <Field int totalBytesRetired>
		//*   9   17:isub            
		//*  10   18:aload_0         
		//*  11   19:getfield        #49  <Field int pos>
		//*  12   22:isub            
		//*  13   23:icmple          30
					throw InvalidProtocolBufferException.sizeLimitExceeded();
		//   14   26:invokestatic    #137 <Method InvalidProtocolBufferException InvalidProtocolBufferException.sizeLimitExceeded()>
		//   15   29:athrow          
				else
					throw InvalidProtocolBufferException.truncatedMessage();
		//   16   30:invokestatic    #143 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
		//   17   33:athrow          
			} else
			{
				return;
		//   18   34:return          
			}
		}

		private void skipRawBytesSlowPath(int i)
			throws IOException
		{
			if(i < 0)
		//*   0    0:iload_1         
		//*   1    1:ifge            8
				throw InvalidProtocolBufferException.negativeSize();
		//    2    4:invokestatic    #131 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
		//    3    7:athrow          
			if(totalBytesRetired + pos + i > currentLimit)
		//*   4    8:aload_0         
		//*   5    9:getfield        #51  <Field int totalBytesRetired>
		//*   6   12:aload_0         
		//*   7   13:getfield        #49  <Field int pos>
		//*   8   16:iadd            
		//*   9   17:iload_1         
		//*  10   18:iadd            
		//*  11   19:aload_0         
		//*  12   20:getfield        #32  <Field int currentLimit>
		//*  13   23:icmple          48
			{
				skipRawBytes(currentLimit - totalBytesRetired - pos);
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #32  <Field int currentLimit>
		//   17   31:aload_0         
		//   18   32:getfield        #51  <Field int totalBytesRetired>
		//   19   35:isub            
		//   20   36:aload_0         
		//   21   37:getfield        #49  <Field int pos>
		//   22   40:isub            
		//   23   41:invokevirtual   #140 <Method void skipRawBytes(int)>
				throw InvalidProtocolBufferException.truncatedMessage();
		//   24   44:invokestatic    #143 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
		//   25   47:athrow          
			}
			int j = bufferSize - pos;
		//   26   48:aload_0         
		//   27   49:getfield        #47  <Field int bufferSize>
		//   28   52:aload_0         
		//   29   53:getfield        #49  <Field int pos>
		//   30   56:isub            
		//   31   57:istore_2        
			pos = bufferSize;
		//   32   58:aload_0         
		//   33   59:aload_0         
		//   34   60:getfield        #47  <Field int bufferSize>
		//   35   63:putfield        #49  <Field int pos>
			refillBuffer(1);
		//   36   66:aload_0         
		//   37   67:iconst_1        
		//   38   68:invokespecial   #174 <Method void refillBuffer(int)>
			while(i - j > bufferSize) 
		//*  39   71:iload_1         
		//*  40   72:iload_2         
		//*  41   73:isub            
		//*  42   74:aload_0         
		//*  43   75:getfield        #47  <Field int bufferSize>
		//*  44   78:icmple          104
			{
				j += bufferSize;
		//   45   81:iload_2         
		//   46   82:aload_0         
		//   47   83:getfield        #47  <Field int bufferSize>
		//   48   86:iadd            
		//   49   87:istore_2        
				pos = bufferSize;
		//   50   88:aload_0         
		//   51   89:aload_0         
		//   52   90:getfield        #47  <Field int bufferSize>
		//   53   93:putfield        #49  <Field int pos>
				refillBuffer(1);
		//   54   96:aload_0         
		//   55   97:iconst_1        
		//   56   98:invokespecial   #174 <Method void refillBuffer(int)>
			}
		//*  57  101:goto            71
			pos = i - j;
		//   58  104:aload_0         
		//   59  105:iload_1         
		//   60  106:iload_2         
		//   61  107:isub            
		//   62  108:putfield        #49  <Field int pos>
		//   63  111:return          
		}

		private void skipRawVarint()
			throws IOException
		{
			if(bufferSize - pos >= 10)
		//*   0    0:aload_0         
		//*   1    1:getfield        #47  <Field int bufferSize>
		//*   2    4:aload_0         
		//*   3    5:getfield        #49  <Field int pos>
		//*   4    8:isub            
		//*   5    9:bipush          10
		//*   6   11:icmplt          19
			{
				skipRawVarintFastPath();
		//    7   14:aload_0         
		//    8   15:invokespecial   #178 <Method void skipRawVarintFastPath()>
				return;
		//    9   18:return          
			} else
			{
				skipRawVarintSlowPath();
		//   10   19:aload_0         
		//   11   20:invokespecial   #181 <Method void skipRawVarintSlowPath()>
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
		//    6    9:getfield        #45  <Field byte[] buffer>
		//    7   12:astore_3        
				int j = pos;
		//    8   13:aload_0         
		//    9   14:getfield        #49  <Field int pos>
		//   10   17:istore_2        
				pos = j + 1;
		//   11   18:aload_0         
		//   12   19:iload_2         
		//   13   20:iconst_1        
		//   14   21:iadd            
		//   15   22:putfield        #49  <Field int pos>
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
		//   26   39:invokestatic    #184 <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
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
		//*   6    9:invokevirtual   #188 <Method byte readRawByte()>
		//*   7   12:iflt            16
					return;
		//    8   15:return          

		//    9   16:iload_1         
		//   10   17:iconst_1        
		//   11   18:iadd            
		//   12   19:istore_1        
		//*  13   20:goto            2
			throw InvalidProtocolBufferException.malformedVarint();
		//   14   23:invokestatic    #184 <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
		//   15   26:athrow          
		}

		private boolean tryRefillBuffer(int i)
			throws IOException
		{
			if(pos + i <= bufferSize)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field int pos>
		//*   2    4:iload_1         
		//*   3    5:iadd            
		//*   4    6:aload_0         
		//*   5    7:getfield        #47  <Field int bufferSize>
		//*   6   10:icmpgt          45
				throw new IllegalStateException((new StringBuilder()).append("refillBuffer() called when ").append(i).append(" bytes were already available in buffer").toString());
		//    7   13:new             #190 <Class IllegalStateException>
		//    8   16:dup             
		//    9   17:new             #192 <Class StringBuilder>
		//   10   20:dup             
		//   11   21:invokespecial   #193 <Method void StringBuilder()>
		//   12   24:ldc1            #195 <String "refillBuffer() called when ">
		//   13   26:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
		//   14   29:iload_1         
		//   15   30:invokevirtual   #202 <Method StringBuilder StringBuilder.append(int)>
		//   16   33:ldc1            #204 <String " bytes were already available in buffer">
		//   17   35:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
		//   18   38:invokevirtual   #208 <Method String StringBuilder.toString()>
		//   19   41:invokespecial   #211 <Method void IllegalStateException(String)>
		//   20   44:athrow          
			if(i > sizeLimit - totalBytesRetired - pos)
		//*  21   45:iload_1         
		//*  22   46:aload_0         
		//*  23   47:getfield        #134 <Field int sizeLimit>
		//*  24   50:aload_0         
		//*  25   51:getfield        #51  <Field int totalBytesRetired>
		//*  26   54:isub            
		//*  27   55:aload_0         
		//*  28   56:getfield        #49  <Field int pos>
		//*  29   59:isub            
		//*  30   60:icmple          65
				return false;
		//   31   63:iconst_0        
		//   32   64:ireturn         
			if(totalBytesRetired + pos + i > currentLimit)
		//*  33   65:aload_0         
		//*  34   66:getfield        #51  <Field int totalBytesRetired>
		//*  35   69:aload_0         
		//*  36   70:getfield        #49  <Field int pos>
		//*  37   73:iadd            
		//*  38   74:iload_1         
		//*  39   75:iadd            
		//*  40   76:aload_0         
		//*  41   77:getfield        #32  <Field int currentLimit>
		//*  42   80:icmple          85
				return false;
		//   43   83:iconst_0        
		//   44   84:ireturn         
			if(refillCallback != null)
		//*  45   85:aload_0         
		//*  46   86:getfield        #34  <Field CodedInputStream$StreamDecoder$RefillCallback refillCallback>
		//*  47   89:ifnull          101
				refillCallback.onRefill();
		//   48   92:aload_0         
		//   49   93:getfield        #34  <Field CodedInputStream$StreamDecoder$RefillCallback refillCallback>
		//   50   96:invokeinterface #214 <Method void CodedInputStream$StreamDecoder$RefillCallback.onRefill()>
			int j = pos;
		//   51  101:aload_0         
		//   52  102:getfield        #49  <Field int pos>
		//   53  105:istore_2        
			if(j > 0)
		//*  54  106:iload_2         
		//*  55  107:ifle            162
			{
				if(bufferSize > j)
		//*  56  110:aload_0         
		//*  57  111:getfield        #47  <Field int bufferSize>
		//*  58  114:iload_2         
		//*  59  115:icmple          137
					System.arraycopy(((Object) (buffer)), j, ((Object) (buffer)), 0, bufferSize - j);
		//   60  118:aload_0         
		//   61  119:getfield        #45  <Field byte[] buffer>
		//   62  122:iload_2         
		//   63  123:aload_0         
		//   64  124:getfield        #45  <Field byte[] buffer>
		//   65  127:iconst_0        
		//   66  128:aload_0         
		//   67  129:getfield        #47  <Field int bufferSize>
		//   68  132:iload_2         
		//   69  133:isub            
		//   70  134:invokestatic    #122 <Method void System.arraycopy(Object, int, Object, int, int)>
				totalBytesRetired = totalBytesRetired + j;
		//   71  137:aload_0         
		//   72  138:aload_0         
		//   73  139:getfield        #51  <Field int totalBytesRetired>
		//   74  142:iload_2         
		//   75  143:iadd            
		//   76  144:putfield        #51  <Field int totalBytesRetired>
				bufferSize = bufferSize - j;
		//   77  147:aload_0         
		//   78  148:aload_0         
		//   79  149:getfield        #47  <Field int bufferSize>
		//   80  152:iload_2         
		//   81  153:isub            
		//   82  154:putfield        #47  <Field int bufferSize>
				pos = 0;
		//   83  157:aload_0         
		//   84  158:iconst_0        
		//   85  159:putfield        #49  <Field int pos>
			}
			j = input.read(buffer, bufferSize, Math.min(buffer.length - bufferSize, sizeLimit - totalBytesRetired - bufferSize));
		//   86  162:aload_0         
		//   87  163:getfield        #43  <Field InputStream input>
		//   88  166:aload_0         
		//   89  167:getfield        #45  <Field byte[] buffer>
		//   90  170:aload_0         
		//   91  171:getfield        #47  <Field int bufferSize>
		//   92  174:aload_0         
		//   93  175:getfield        #45  <Field byte[] buffer>
		//   94  178:arraylength     
		//   95  179:aload_0         
		//   96  180:getfield        #47  <Field int bufferSize>
		//   97  183:isub            
		//   98  184:aload_0         
		//   99  185:getfield        #134 <Field int sizeLimit>
		//  100  188:aload_0         
		//  101  189:getfield        #51  <Field int totalBytesRetired>
		//  102  192:isub            
		//  103  193:aload_0         
		//  104  194:getfield        #47  <Field int bufferSize>
		//  105  197:isub            
		//  106  198:invokestatic    #161 <Method int Math.min(int, int)>
		//  107  201:invokevirtual   #152 <Method int InputStream.read(byte[], int, int)>
		//  108  204:istore_2        
			if(j == 0 || j < -1 || j > buffer.length)
		//* 109  205:iload_2         
		//* 110  206:ifeq            223
		//* 111  209:iload_2         
		//* 112  210:iconst_m1       
		//* 113  211:icmplt          223
		//* 114  214:iload_2         
		//* 115  215:aload_0         
		//* 116  216:getfield        #45  <Field byte[] buffer>
		//* 117  219:arraylength     
		//* 118  220:icmple          255
				throw new IllegalStateException((new StringBuilder()).append("InputStream#read(byte[]) returned invalid result: ").append(j).append("\nThe InputStream implementation is buggy.").toString());
		//  119  223:new             #190 <Class IllegalStateException>
		//  120  226:dup             
		//  121  227:new             #192 <Class StringBuilder>
		//  122  230:dup             
		//  123  231:invokespecial   #193 <Method void StringBuilder()>
		//  124  234:ldc1            #216 <String "InputStream#read(byte[]) returned invalid result: ">
		//  125  236:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
		//  126  239:iload_2         
		//  127  240:invokevirtual   #202 <Method StringBuilder StringBuilder.append(int)>
		//  128  243:ldc1            #218 <String "\nThe InputStream implementation is buggy.">
		//  129  245:invokevirtual   #199 <Method StringBuilder StringBuilder.append(String)>
		//  130  248:invokevirtual   #208 <Method String StringBuilder.toString()>
		//  131  251:invokespecial   #211 <Method void IllegalStateException(String)>
		//  132  254:athrow          
			if(j > 0)
		//* 133  255:iload_2         
		//* 134  256:ifle            289
			{
				bufferSize = bufferSize + j;
		//  135  259:aload_0         
		//  136  260:aload_0         
		//  137  261:getfield        #47  <Field int bufferSize>
		//  138  264:iload_2         
		//  139  265:iadd            
		//  140  266:putfield        #47  <Field int bufferSize>
				recomputeBufferSizeAfterLimit();
		//  141  269:aload_0         
		//  142  270:invokespecial   #220 <Method void recomputeBufferSizeAfterLimit()>
				if(bufferSize >= i)
		//* 143  273:aload_0         
		//* 144  274:getfield        #47  <Field int bufferSize>
		//* 145  277:iload_1         
		//* 146  278:icmplt          283
					return true;
		//  147  281:iconst_1        
		//  148  282:ireturn         
				else
					return tryRefillBuffer(i);
		//  149  283:aload_0         
		//  150  284:iload_1         
		//  151  285:invokespecial   #171 <Method boolean tryRefillBuffer(int)>
		//  152  288:ireturn         
			} else
			{
				return false;
		//  153  289:iconst_0        
		//  154  290:ireturn         
			}
		}

		public void checkLastTagWas(int i)
			throws InvalidProtocolBufferException
		{
			if(lastTag != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #223 <Field int lastTag>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          12
				throw InvalidProtocolBufferException.invalidEndTag();
		//    4    8:invokestatic    #226 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidEndTag()>
		//    5   11:athrow          
			else
				return;
		//    6   12:return          
		}

		public void enableAliasing(boolean flag)
		{
		//    0    0:return          
		}

		public int getBytesUntilLimit()
		{
			if(currentLimit == 0x7fffffff)
		//*   0    0:aload_0         
		//*   1    1:getfield        #32  <Field int currentLimit>
		//*   2    4:ldc1            #30  <Int 0x7fffffff>
		//*   3    6:icmpne          11
			{
				return -1;
		//    4    9:iconst_m1       
		//    5   10:ireturn         
			} else
			{
				int i = totalBytesRetired;
		//    6   11:aload_0         
		//    7   12:getfield        #51  <Field int totalBytesRetired>
		//    8   15:istore_1        
				int j = pos;
		//    9   16:aload_0         
		//   10   17:getfield        #49  <Field int pos>
		//   11   20:istore_2        
				return currentLimit - (i + j);
		//   12   21:aload_0         
		//   13   22:getfield        #32  <Field int currentLimit>
		//   14   25:iload_1         
		//   15   26:iload_2         
		//   16   27:iadd            
		//   17   28:isub            
		//   18   29:ireturn         
			}
		}

		public int getLastTag()
		{
			return lastTag;
		//    0    0:aload_0         
		//    1    1:getfield        #223 <Field int lastTag>
		//    2    4:ireturn         
		}

		public int getTotalBytesRead()
		{
			return totalBytesRetired + pos;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int totalBytesRetired>
		//    2    4:aload_0         
		//    3    5:getfield        #49  <Field int pos>
		//    4    8:iadd            
		//    5    9:ireturn         
		}

		public boolean isAtEnd()
			throws IOException
		{
			return pos == bufferSize && !tryRefillBuffer(1);
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int pos>
		//    2    4:aload_0         
		//    3    5:getfield        #47  <Field int bufferSize>
		//    4    8:icmpne          21
		//    5   11:aload_0         
		//    6   12:iconst_1        
		//    7   13:invokespecial   #171 <Method boolean tryRefillBuffer(int)>
		//    8   16:ifne            21
		//    9   19:iconst_1        
		//   10   20:ireturn         
		//   11   21:iconst_0        
		//   12   22:ireturn         
		}

		public void popLimit(int i)
		{
			currentLimit = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #32  <Field int currentLimit>
			recomputeBufferSizeAfterLimit();
		//    3    5:aload_0         
		//    4    6:invokespecial   #220 <Method void recomputeBufferSizeAfterLimit()>
		//    5    9:return          
		}

		public int pushLimit(int i)
			throws InvalidProtocolBufferException
		{
			if(i < 0)
		//*   0    0:iload_1         
		//*   1    1:ifge            8
				throw InvalidProtocolBufferException.negativeSize();
		//    2    4:invokestatic    #131 <Method InvalidProtocolBufferException InvalidProtocolBufferException.negativeSize()>
		//    3    7:athrow          
			i += totalBytesRetired + pos;
		//    4    8:iload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #51  <Field int totalBytesRetired>
		//    7   13:aload_0         
		//    8   14:getfield        #49  <Field int pos>
		//    9   17:iadd            
		//   10   18:iadd            
		//   11   19:istore_1        
			int j = currentLimit;
		//   12   20:aload_0         
		//   13   21:getfield        #32  <Field int currentLimit>
		//   14   24:istore_2        
			if(i > j)
		//*  15   25:iload_1         
		//*  16   26:iload_2         
		//*  17   27:icmple          34
			{
				throw InvalidProtocolBufferException.truncatedMessage();
		//   18   30:invokestatic    #143 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
		//   19   33:athrow          
			} else
			{
				currentLimit = i;
		//   20   34:aload_0         
		//   21   35:iload_1         
		//   22   36:putfield        #32  <Field int currentLimit>
				recomputeBufferSizeAfterLimit();
		//   23   39:aload_0         
		//   24   40:invokespecial   #220 <Method void recomputeBufferSizeAfterLimit()>
				return j;
		//   25   43:iload_2         
		//   26   44:ireturn         
			}
		}

		public boolean readBool()
			throws IOException
		{
			return readRawVarint64() != 0L;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #240 <Method long readRawVarint64()>
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
			int i = readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:istore_1        
			if(i <= bufferSize - pos && i > 0)
		//*   3    5:iload_1         
		//*   4    6:aload_0         
		//*   5    7:getfield        #47  <Field int bufferSize>
		//*   6   10:aload_0         
		//*   7   11:getfield        #49  <Field int pos>
		//*   8   14:isub            
		//*   9   15:icmpgt          52
		//*  10   18:iload_1         
		//*  11   19:ifle            52
			{
				byte abyte0[] = Arrays.copyOfRange(buffer, pos, pos + i);
		//   12   22:aload_0         
		//   13   23:getfield        #45  <Field byte[] buffer>
		//   14   26:aload_0         
		//   15   27:getfield        #49  <Field int pos>
		//   16   30:aload_0         
		//   17   31:getfield        #49  <Field int pos>
		//   18   34:iload_1         
		//   19   35:iadd            
		//   20   36:invokestatic    #251 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
		//   21   39:astore_2        
				pos = pos + i;
		//   22   40:aload_0         
		//   23   41:aload_0         
		//   24   42:getfield        #49  <Field int pos>
		//   25   45:iload_1         
		//   26   46:iadd            
		//   27   47:putfield        #49  <Field int pos>
				return abyte0;
		//   28   50:aload_2         
		//   29   51:areturn         
			} else
			{
				return readRawBytesSlowPath(i);
		//   30   52:aload_0         
		//   31   53:iload_1         
		//   32   54:invokespecial   #253 <Method byte[] readRawBytesSlowPath(int)>
		//   33   57:areturn         
			}
		}

		public ByteBuffer readByteBuffer()
			throws IOException
		{
			int i = readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:istore_1        
			if(i <= bufferSize - pos && i > 0)
		//*   3    5:iload_1         
		//*   4    6:aload_0         
		//*   5    7:getfield        #47  <Field int bufferSize>
		//*   6   10:aload_0         
		//*   7   11:getfield        #49  <Field int pos>
		//*   8   14:isub            
		//*   9   15:icmpgt          55
		//*  10   18:iload_1         
		//*  11   19:ifle            55
			{
				ByteBuffer bytebuffer = ByteBuffer.wrap(Arrays.copyOfRange(buffer, pos, pos + i));
		//   12   22:aload_0         
		//   13   23:getfield        #45  <Field byte[] buffer>
		//   14   26:aload_0         
		//   15   27:getfield        #49  <Field int pos>
		//   16   30:aload_0         
		//   17   31:getfield        #49  <Field int pos>
		//   18   34:iload_1         
		//   19   35:iadd            
		//   20   36:invokestatic    #251 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
		//   21   39:invokestatic    #260 <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//   22   42:astore_2        
				pos = pos + i;
		//   23   43:aload_0         
		//   24   44:aload_0         
		//   25   45:getfield        #49  <Field int pos>
		//   26   48:iload_1         
		//   27   49:iadd            
		//   28   50:putfield        #49  <Field int pos>
				return bytebuffer;
		//   29   53:aload_2         
		//   30   54:areturn         
			}
			if(i == 0)
		//*  31   55:iload_1         
		//*  32   56:ifne            63
				return Internal.EMPTY_BYTE_BUFFER;
		//   33   59:getstatic       #264 <Field ByteBuffer Internal.EMPTY_BYTE_BUFFER>
		//   34   62:areturn         
			else
				return ByteBuffer.wrap(readRawBytesSlowPath(i));
		//   35   63:aload_0         
		//   36   64:iload_1         
		//   37   65:invokespecial   #253 <Method byte[] readRawBytesSlowPath(int)>
		//   38   68:invokestatic    #260 <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//   39   71:areturn         
		}

		public ByteString readBytes()
			throws IOException
		{
			int i = readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:istore_1        
			if(i <= bufferSize - pos && i > 0)
		//*   3    5:iload_1         
		//*   4    6:aload_0         
		//*   5    7:getfield        #47  <Field int bufferSize>
		//*   6   10:aload_0         
		//*   7   11:getfield        #49  <Field int pos>
		//*   8   14:isub            
		//*   9   15:icmpgt          47
		//*  10   18:iload_1         
		//*  11   19:ifle            47
			{
				ByteString bytestring = ByteString.copyFrom(buffer, pos, i);
		//   12   22:aload_0         
		//   13   23:getfield        #45  <Field byte[] buffer>
		//   14   26:aload_0         
		//   15   27:getfield        #49  <Field int pos>
		//   16   30:iload_1         
		//   17   31:invokestatic    #92  <Method ByteString ByteString.copyFrom(byte[], int, int)>
		//   18   34:astore_2        
				pos = pos + i;
		//   19   35:aload_0         
		//   20   36:aload_0         
		//   21   37:getfield        #49  <Field int pos>
		//   22   40:iload_1         
		//   23   41:iadd            
		//   24   42:putfield        #49  <Field int pos>
				return bytestring;
		//   25   45:aload_2         
		//   26   46:areturn         
			}
			if(i == 0)
		//*  27   47:iload_1         
		//*  28   48:ifne            55
				return ByteString.EMPTY;
		//   29   51:getstatic       #270 <Field ByteString ByteString.EMPTY>
		//   30   54:areturn         
			else
				return readBytesSlowPath(i);
		//   31   55:aload_0         
		//   32   56:iload_1         
		//   33   57:invokespecial   #272 <Method ByteString readBytesSlowPath(int)>
		//   34   60:areturn         
		}

		public double readDouble()
			throws IOException
		{
			return Double.longBitsToDouble(readRawLittleEndian64());
		//    0    0:aload_0         
		//    1    1:invokevirtual   #277 <Method long readRawLittleEndian64()>
		//    2    4:invokestatic    #283 <Method double Double.longBitsToDouble(long)>
		//    3    7:dreturn         
		}

		public int readEnum()
			throws IOException
		{
			return readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:ireturn         
		}

		public int readFixed32()
			throws IOException
		{
			return readRawLittleEndian32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #288 <Method int readRawLittleEndian32()>
		//    2    4:ireturn         
		}

		public long readFixed64()
			throws IOException
		{
			return readRawLittleEndian64();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #277 <Method long readRawLittleEndian64()>
		//    2    4:lreturn         
		}

		public float readFloat()
			throws IOException
		{
			return Float.intBitsToFloat(readRawLittleEndian32());
		//    0    0:aload_0         
		//    1    1:invokevirtual   #288 <Method int readRawLittleEndian32()>
		//    2    4:invokestatic    #297 <Method float Float.intBitsToFloat(int)>
		//    3    7:freturn         
		}

		public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			if(recursionDepth >= recursionLimit)
		//*   0    0:aload_0         
		//*   1    1:getfield        #302 <Field int recursionDepth>
		//*   2    4:aload_0         
		//*   3    5:getfield        #305 <Field int recursionLimit>
		//*   4    8:icmplt          15
			{
				throw InvalidProtocolBufferException.recursionLimitExceeded();
		//    5   11:invokestatic    #308 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
		//    6   14:athrow          
			} else
			{
				recursionDepth = recursionDepth + 1;
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:getfield        #302 <Field int recursionDepth>
		//   10   20:iconst_1        
		//   11   21:iadd            
		//   12   22:putfield        #302 <Field int recursionDepth>
				parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
		//   13   25:aload_2         
		//   14   26:aload_0         
		//   15   27:aload_3         
		//   16   28:invokeinterface #314 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//   17   33:checkcast       #316 <Class MessageLite>
		//   18   36:astore_2        
				checkLastTagWas(WireFormat.makeTag(i, 4));
		//   19   37:aload_0         
		//   20   38:iload_1         
		//   21   39:iconst_4        
		//   22   40:invokestatic    #321 <Method int WireFormat.makeTag(int, int)>
		//   23   43:invokevirtual   #323 <Method void checkLastTagWas(int)>
				recursionDepth = recursionDepth - 1;
		//   24   46:aload_0         
		//   25   47:aload_0         
		//   26   48:getfield        #302 <Field int recursionDepth>
		//   27   51:iconst_1        
		//   28   52:isub            
		//   29   53:putfield        #302 <Field int recursionDepth>
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
		//*   1    1:getfield        #302 <Field int recursionDepth>
		//*   2    4:aload_0         
		//*   3    5:getfield        #305 <Field int recursionLimit>
		//*   4    8:icmplt          15
			{
				throw InvalidProtocolBufferException.recursionLimitExceeded();
		//    5   11:invokestatic    #308 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
		//    6   14:athrow          
			} else
			{
				recursionDepth = recursionDepth + 1;
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:getfield        #302 <Field int recursionDepth>
		//   10   20:iconst_1        
		//   11   21:iadd            
		//   12   22:putfield        #302 <Field int recursionDepth>
				builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
		//   13   25:aload_2         
		//   14   26:aload_0         
		//   15   27:aload_3         
		//   16   28:invokeinterface #331 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//   17   33:pop             
				checkLastTagWas(WireFormat.makeTag(i, 4));
		//   18   34:aload_0         
		//   19   35:iload_1         
		//   20   36:iconst_4        
		//   21   37:invokestatic    #321 <Method int WireFormat.makeTag(int, int)>
		//   22   40:invokevirtual   #323 <Method void checkLastTagWas(int)>
				recursionDepth = recursionDepth - 1;
		//   23   43:aload_0         
		//   24   44:aload_0         
		//   25   45:getfield        #302 <Field int recursionDepth>
		//   26   48:iconst_1        
		//   27   49:isub            
		//   28   50:putfield        #302 <Field int recursionDepth>
				return;
		//   29   53:return          
			}
		}

		public int readInt32()
			throws IOException
		{
			return readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:ireturn         
		}

		public long readInt64()
			throws IOException
		{
			return readRawVarint64();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #240 <Method long readRawVarint64()>
		//    2    4:lreturn         
		}

		public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			int i = readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:istore_3        
			if(recursionDepth >= recursionLimit)
		//*   3    5:aload_0         
		//*   4    6:getfield        #302 <Field int recursionDepth>
		//*   5    9:aload_0         
		//*   6   10:getfield        #305 <Field int recursionLimit>
		//*   7   13:icmplt          20
			{
				throw InvalidProtocolBufferException.recursionLimitExceeded();
		//    8   16:invokestatic    #308 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
		//    9   19:athrow          
			} else
			{
				i = pushLimit(i);
		//   10   20:aload_0         
		//   11   21:iload_3         
		//   12   22:invokevirtual   #337 <Method int pushLimit(int)>
		//   13   25:istore_3        
				recursionDepth = recursionDepth + 1;
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #302 <Field int recursionDepth>
		//   17   31:iconst_1        
		//   18   32:iadd            
		//   19   33:putfield        #302 <Field int recursionDepth>
				parser = ((Parser) ((MessageLite)parser.parsePartialFrom(((CodedInputStream) (this)), extensionregistrylite)));
		//   20   36:aload_1         
		//   21   37:aload_0         
		//   22   38:aload_2         
		//   23   39:invokeinterface #314 <Method Object Parser.parsePartialFrom(CodedInputStream, ExtensionRegistryLite)>
		//   24   44:checkcast       #316 <Class MessageLite>
		//   25   47:astore_1        
				checkLastTagWas(0);
		//   26   48:aload_0         
		//   27   49:iconst_0        
		//   28   50:invokevirtual   #323 <Method void checkLastTagWas(int)>
				recursionDepth = recursionDepth - 1;
		//   29   53:aload_0         
		//   30   54:aload_0         
		//   31   55:getfield        #302 <Field int recursionDepth>
		//   32   58:iconst_1        
		//   33   59:isub            
		//   34   60:putfield        #302 <Field int recursionDepth>
				popLimit(i);
		//   35   63:aload_0         
		//   36   64:iload_3         
		//   37   65:invokevirtual   #339 <Method void popLimit(int)>
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
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:istore_3        
			if(recursionDepth >= recursionLimit)
		//*   3    5:aload_0         
		//*   4    6:getfield        #302 <Field int recursionDepth>
		//*   5    9:aload_0         
		//*   6   10:getfield        #305 <Field int recursionLimit>
		//*   7   13:icmplt          20
			{
				throw InvalidProtocolBufferException.recursionLimitExceeded();
		//    8   16:invokestatic    #308 <Method InvalidProtocolBufferException InvalidProtocolBufferException.recursionLimitExceeded()>
		//    9   19:athrow          
			} else
			{
				i = pushLimit(i);
		//   10   20:aload_0         
		//   11   21:iload_3         
		//   12   22:invokevirtual   #337 <Method int pushLimit(int)>
		//   13   25:istore_3        
				recursionDepth = recursionDepth + 1;
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #302 <Field int recursionDepth>
		//   17   31:iconst_1        
		//   18   32:iadd            
		//   19   33:putfield        #302 <Field int recursionDepth>
				builder.mergeFrom(((CodedInputStream) (this)), extensionregistrylite);
		//   20   36:aload_1         
		//   21   37:aload_0         
		//   22   38:aload_2         
		//   23   39:invokeinterface #331 <Method MessageLite$Builder MessageLite$Builder.mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//   24   44:pop             
				checkLastTagWas(0);
		//   25   45:aload_0         
		//   26   46:iconst_0        
		//   27   47:invokevirtual   #323 <Method void checkLastTagWas(int)>
				recursionDepth = recursionDepth - 1;
		//   28   50:aload_0         
		//   29   51:aload_0         
		//   30   52:getfield        #302 <Field int recursionDepth>
		//   31   55:iconst_1        
		//   32   56:isub            
		//   33   57:putfield        #302 <Field int recursionDepth>
				popLimit(i);
		//   34   60:aload_0         
		//   35   61:iload_3         
		//   36   62:invokevirtual   #339 <Method void popLimit(int)>
				return;
		//   37   65:return          
			}
		}

		public byte readRawByte()
			throws IOException
		{
			if(pos == bufferSize)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field int pos>
		//*   2    4:aload_0         
		//*   3    5:getfield        #47  <Field int bufferSize>
		//*   4    8:icmpne          16
				refillBuffer(1);
		//    5   11:aload_0         
		//    6   12:iconst_1        
		//    7   13:invokespecial   #174 <Method void refillBuffer(int)>
			byte abyte0[] = buffer;
		//    8   16:aload_0         
		//    9   17:getfield        #45  <Field byte[] buffer>
		//   10   20:astore_2        
			int i = pos;
		//   11   21:aload_0         
		//   12   22:getfield        #49  <Field int pos>
		//   13   25:istore_1        
			pos = i + 1;
		//   14   26:aload_0         
		//   15   27:iload_1         
		//   16   28:iconst_1        
		//   17   29:iadd            
		//   18   30:putfield        #49  <Field int pos>
			return abyte0[i];
		//   19   33:aload_2         
		//   20   34:iload_1         
		//   21   35:baload          
		//   22   36:ireturn         
		}

		public byte[] readRawBytes(int i)
			throws IOException
		{
			int j = pos;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int pos>
		//    2    4:istore_2        
			if(i <= bufferSize - j && i > 0)
		//*   3    5:iload_1         
		//*   4    6:aload_0         
		//*   5    7:getfield        #47  <Field int bufferSize>
		//*   6   10:iload_2         
		//*   7   11:isub            
		//*   8   12:icmpgt          38
		//*   9   15:iload_1         
		//*  10   16:ifle            38
			{
				pos = j + i;
		//   11   19:aload_0         
		//   12   20:iload_2         
		//   13   21:iload_1         
		//   14   22:iadd            
		//   15   23:putfield        #49  <Field int pos>
				return Arrays.copyOfRange(buffer, j, j + i);
		//   16   26:aload_0         
		//   17   27:getfield        #45  <Field byte[] buffer>
		//   18   30:iload_2         
		//   19   31:iload_2         
		//   20   32:iload_1         
		//   21   33:iadd            
		//   22   34:invokestatic    #251 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
		//   23   37:areturn         
			} else
			{
				return readRawBytesSlowPath(i);
		//   24   38:aload_0         
		//   25   39:iload_1         
		//   26   40:invokespecial   #253 <Method byte[] readRawBytesSlowPath(int)>
		//   27   43:areturn         
			}
		}

		public int readRawLittleEndian32()
			throws IOException
		{
			int j = pos;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int pos>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(bufferSize - j < 4)
		//*   5    7:aload_0         
		//*   6    8:getfield        #47  <Field int bufferSize>
		//*   7   11:iload_2         
		//*   8   12:isub            
		//*   9   13:iconst_4        
		//*  10   14:icmpge          27
			{
				refillBuffer(4);
		//   11   17:aload_0         
		//   12   18:iconst_4        
		//   13   19:invokespecial   #174 <Method void refillBuffer(int)>
				i = pos;
		//   14   22:aload_0         
		//   15   23:getfield        #49  <Field int pos>
		//   16   26:istore_1        
			}
			byte abyte0[] = buffer;
		//   17   27:aload_0         
		//   18   28:getfield        #45  <Field byte[] buffer>
		//   19   31:astore_3        
			pos = i + 4;
		//   20   32:aload_0         
		//   21   33:iload_1         
		//   22   34:iconst_4        
		//   23   35:iadd            
		//   24   36:putfield        #49  <Field int pos>
			return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
		//   25   39:aload_3         
		//   26   40:iload_1         
		//   27   41:baload          
		//   28   42:sipush          255
		//   29   45:iand            
		//   30   46:aload_3         
		//   31   47:iload_1         
		//   32   48:iconst_1        
		//   33   49:iadd            
		//   34   50:baload          
		//   35   51:sipush          255
		//   36   54:iand            
		//   37   55:bipush          8
		//   38   57:ishl            
		//   39   58:ior             
		//   40   59:aload_3         
		//   41   60:iload_1         
		//   42   61:iconst_2        
		//   43   62:iadd            
		//   44   63:baload          
		//   45   64:sipush          255
		//   46   67:iand            
		//   47   68:bipush          16
		//   48   70:ishl            
		//   49   71:ior             
		//   50   72:aload_3         
		//   51   73:iload_1         
		//   52   74:iconst_3        
		//   53   75:iadd            
		//   54   76:baload          
		//   55   77:sipush          255
		//   56   80:iand            
		//   57   81:bipush          24
		//   58   83:ishl            
		//   59   84:ior             
		//   60   85:ireturn         
		}

		public long readRawLittleEndian64()
			throws IOException
		{
			int j = pos;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int pos>
		//    2    4:istore_2        
			int i = j;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(bufferSize - j < 8)
		//*   5    7:aload_0         
		//*   6    8:getfield        #47  <Field int bufferSize>
		//*   7   11:iload_2         
		//*   8   12:isub            
		//*   9   13:bipush          8
		//*  10   15:icmpge          29
			{
				refillBuffer(8);
		//   11   18:aload_0         
		//   12   19:bipush          8
		//   13   21:invokespecial   #174 <Method void refillBuffer(int)>
				i = pos;
		//   14   24:aload_0         
		//   15   25:getfield        #49  <Field int pos>
		//   16   28:istore_1        
			}
			byte abyte0[] = buffer;
		//   17   29:aload_0         
		//   18   30:getfield        #45  <Field byte[] buffer>
		//   19   33:astore_3        
			pos = i + 8;
		//   20   34:aload_0         
		//   21   35:iload_1         
		//   22   36:bipush          8
		//   23   38:iadd            
		//   24   39:putfield        #49  <Field int pos>
			return (long)abyte0[i] & 255L | ((long)abyte0[i + 1] & 255L) << 8 | ((long)abyte0[i + 2] & 255L) << 16 | ((long)abyte0[i + 3] & 255L) << 24 | ((long)abyte0[i + 4] & 255L) << 32 | ((long)abyte0[i + 5] & 255L) << 40 | ((long)abyte0[i + 6] & 255L) << 48 | ((long)abyte0[i + 7] & 255L) << 56;
		//   25   42:aload_3         
		//   26   43:iload_1         
		//   27   44:baload          
		//   28   45:i2l             
		//   29   46:ldc2w           #343 <Long 255L>
		//   30   49:land            
		//   31   50:aload_3         
		//   32   51:iload_1         
		//   33   52:iconst_1        
		//   34   53:iadd            
		//   35   54:baload          
		//   36   55:i2l             
		//   37   56:ldc2w           #343 <Long 255L>
		//   38   59:land            
		//   39   60:bipush          8
		//   40   62:lshl            
		//   41   63:lor             
		//   42   64:aload_3         
		//   43   65:iload_1         
		//   44   66:iconst_2        
		//   45   67:iadd            
		//   46   68:baload          
		//   47   69:i2l             
		//   48   70:ldc2w           #343 <Long 255L>
		//   49   73:land            
		//   50   74:bipush          16
		//   51   76:lshl            
		//   52   77:lor             
		//   53   78:aload_3         
		//   54   79:iload_1         
		//   55   80:iconst_3        
		//   56   81:iadd            
		//   57   82:baload          
		//   58   83:i2l             
		//   59   84:ldc2w           #343 <Long 255L>
		//   60   87:land            
		//   61   88:bipush          24
		//   62   90:lshl            
		//   63   91:lor             
		//   64   92:aload_3         
		//   65   93:iload_1         
		//   66   94:iconst_4        
		//   67   95:iadd            
		//   68   96:baload          
		//   69   97:i2l             
		//   70   98:ldc2w           #343 <Long 255L>
		//   71  101:land            
		//   72  102:bipush          32
		//   73  104:lshl            
		//   74  105:lor             
		//   75  106:aload_3         
		//   76  107:iload_1         
		//   77  108:iconst_5        
		//   78  109:iadd            
		//   79  110:baload          
		//   80  111:i2l             
		//   81  112:ldc2w           #343 <Long 255L>
		//   82  115:land            
		//   83  116:bipush          40
		//   84  118:lshl            
		//   85  119:lor             
		//   86  120:aload_3         
		//   87  121:iload_1         
		//   88  122:bipush          6
		//   89  124:iadd            
		//   90  125:baload          
		//   91  126:i2l             
		//   92  127:ldc2w           #343 <Long 255L>
		//   93  130:land            
		//   94  131:bipush          48
		//   95  133:lshl            
		//   96  134:lor             
		//   97  135:aload_3         
		//   98  136:iload_1         
		//   99  137:bipush          7
		//  100  139:iadd            
		//  101  140:baload          
		//  102  141:i2l             
		//  103  142:ldc2w           #343 <Long 255L>
		//  104  145:land            
		//  105  146:bipush          56
		//  106  148:lshl            
		//  107  149:lor             
		//  108  150:lreturn         
		}

		public int readRawVarint32()
			throws IOException
		{
label0:
			{
				int i = pos;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int pos>
		//    2    4:istore_1        
				if(bufferSize == i)
		//*   3    5:aload_0         
		//*   4    6:getfield        #47  <Field int bufferSize>
		//*   5    9:iload_1         
		//*   6   10:icmpne          16
					break label0;
		//    7   13:goto            274
				byte abyte0[] = buffer;
		//    8   16:aload_0         
		//    9   17:getfield        #45  <Field byte[] buffer>
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
		//   23   37:putfield        #49  <Field int pos>
					return k;
		//   24   40:iload_3         
		//   25   41:ireturn         
				}
				if(bufferSize - j < 9)
		//*  26   42:aload_0         
		//*  27   43:getfield        #47  <Field int bufferSize>
		//*  28   46:iload_2         
		//*  29   47:isub            
		//*  30   48:bipush          9
		//*  31   50:icmpge          56
					break label0;
		//   32   53:goto            274
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
		//*  51   79:goto            267
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
		//*  74  110:goto            267
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
		//*  88  128:ifge            140
						{
							j ^= 0xffe03f80;
		//   89  131:iload_2         
		//   90  132:ldc2            #345 <Int 0xffe03f80>
		//   91  135:ixor            
		//   92  136:istore_2        
						} else
		//*  93  137:goto            267
						{
							int i1 = i + 1;
		//   94  140:iload_1         
		//   95  141:iconst_1        
		//   96  142:iadd            
		//   97  143:istore          4
							byte byte0 = abyte0[i];
		//   98  145:aload           6
		//   99  147:iload_1         
		//  100  148:baload          
		//  101  149:istore          5
							int l = j ^ byte0 << 28 ^ 0xfe03f80;
		//  102  151:iload_2         
		//  103  152:iload           5
		//  104  154:bipush          28
		//  105  156:ishl            
		//  106  157:ixor            
		//  107  158:ldc2            #346 <Int 0xfe03f80>
		//  108  161:ixor            
		//  109  162:istore_3        
							i = i1;
		//  110  163:iload           4
		//  111  165:istore_1        
							j = l;
		//  112  166:iload_3         
		//  113  167:istore_2        
							if(byte0 < 0)
		//* 114  168:iload           5
		//* 115  170:ifge            267
							{
								int l1 = i1 + 1;
		//  116  173:iload           4
		//  117  175:iconst_1        
		//  118  176:iadd            
		//  119  177:istore          5
								i = l1;
		//  120  179:iload           5
		//  121  181:istore_1        
								j = l;
		//  122  182:iload_3         
		//  123  183:istore_2        
								if(abyte0[i1] < 0)
		//* 124  184:aload           6
		//* 125  186:iload           4
		//* 126  188:baload          
		//* 127  189:ifge            267
								{
									int j1 = l1 + 1;
		//  128  192:iload           5
		//  129  194:iconst_1        
		//  130  195:iadd            
		//  131  196:istore          4
									i = j1;
		//  132  198:iload           4
		//  133  200:istore_1        
									j = l;
		//  134  201:iload_3         
		//  135  202:istore_2        
									if(abyte0[l1] < 0)
		//* 136  203:aload           6
		//* 137  205:iload           5
		//* 138  207:baload          
		//* 139  208:ifge            267
									{
										int i2 = j1 + 1;
		//  140  211:iload           4
		//  141  213:iconst_1        
		//  142  214:iadd            
		//  143  215:istore          5
										i = i2;
		//  144  217:iload           5
		//  145  219:istore_1        
										j = l;
		//  146  220:iload_3         
		//  147  221:istore_2        
										if(abyte0[j1] < 0)
		//* 148  222:aload           6
		//* 149  224:iload           4
		//* 150  226:baload          
		//* 151  227:ifge            267
										{
											int k1 = i2 + 1;
		//  152  230:iload           5
		//  153  232:iconst_1        
		//  154  233:iadd            
		//  155  234:istore          4
											i = k1;
		//  156  236:iload           4
		//  157  238:istore_1        
											j = l;
		//  158  239:iload_3         
		//  159  240:istore_2        
											if(abyte0[i2] < 0)
		//* 160  241:aload           6
		//* 161  243:iload           5
		//* 162  245:baload          
		//* 163  246:ifge            267
											{
												i = k1 + 1;
		//  164  249:iload           4
		//  165  251:iconst_1        
		//  166  252:iadd            
		//  167  253:istore_1        
												j = l;
		//  168  254:iload_3         
		//  169  255:istore_2        
												if(abyte0[k1] < 0)
		//* 170  256:aload           6
		//* 171  258:iload           4
		//* 172  260:baload          
		//* 173  261:ifge            267
													break label0;
		//  174  264:goto            274
											}
										}
									}
								}
							}
						}
					}
				}
				pos = i;
		//  175  267:aload_0         
		//  176  268:iload_1         
		//  177  269:putfield        #49  <Field int pos>
				return j;
		//  178  272:iload_2         
		//  179  273:ireturn         
			}
			return (int)readRawVarint64SlowPath();
		//  180  274:aload_0         
		//  181  275:invokevirtual   #349 <Method long readRawVarint64SlowPath()>
		//  182  278:l2i             
		//  183  279:ireturn         
		}

		public long readRawVarint64()
			throws IOException
		{
label0:
			{
				int i = pos;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int pos>
		//    2    4:istore_1        
				if(bufferSize == i)
		//*   3    5:aload_0         
		//*   4    6:getfield        #47  <Field int bufferSize>
		//*   5    9:iload_1         
		//*   6   10:icmpne          16
					break label0;
		//    7   13:goto            356
				byte abyte0[] = buffer;
		//    8   16:aload_0         
		//    9   17:getfield        #45  <Field byte[] buffer>
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
		//   23   37:putfield        #49  <Field int pos>
					return (long)j1;
		//   24   40:iload_3         
		//   25   41:i2l             
		//   26   42:lreturn         
				}
				if(bufferSize - j < 9)
		//*  27   43:aload_0         
		//*  28   44:getfield        #47  <Field int bufferSize>
		//*  29   47:iload_2         
		//*  30   48:isub            
		//*  31   49:bipush          9
		//*  32   51:icmpge          57
					break label0;
		//   33   54:goto            356
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
		//*  53   82:goto            348
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
		//*  75  113:goto            348
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
		//*  89  131:ifge            145
						{
							l1 = 0xffe03f80 ^ k;
		//   90  134:ldc2            #345 <Int 0xffe03f80>
		//   91  137:iload_2         
		//   92  138:ixor            
		//   93  139:i2l             
		//   94  140:lstore          4
						} else
		//*  95  142:goto            348
						{
							l1 = k;
		//   96  145:iload_2         
		//   97  146:i2l             
		//   98  147:lstore          4
							k = i + 1;
		//   99  149:iload_1         
		//  100  150:iconst_1        
		//  101  151:iadd            
		//  102  152:istore_2        
							l1 ^= (long)abyte0[i] << 28;
		//  103  153:lload           4
		//  104  155:aload           8
		//  105  157:iload_1         
		//  106  158:baload          
		//  107  159:i2l             
		//  108  160:bipush          28
		//  109  162:lshl            
		//  110  163:lxor            
		//  111  164:lstore          4
							if(l1 >= 0L)
		//* 112  166:lload           4
		//* 113  168:lconst_0        
		//* 114  169:lcmp            
		//* 115  170:iflt            186
							{
								l1 ^= 0xfe03f80L;
		//  116  173:lload           4
		//  117  175:ldc2w           #350 <Long 0xfe03f80L>
		//  118  178:lxor            
		//  119  179:lstore          4
								i = k;
		//  120  181:iload_2         
		//  121  182:istore_1        
							} else
		//* 122  183:goto            348
							{
								i = k + 1;
		//  123  186:iload_2         
		//  124  187:iconst_1        
		//  125  188:iadd            
		//  126  189:istore_1        
								l1 = (long)abyte0[k] << 35 ^ l1;
		//  127  190:aload           8
		//  128  192:iload_2         
		//  129  193:baload          
		//  130  194:i2l             
		//  131  195:bipush          35
		//  132  197:lshl            
		//  133  198:lload           4
		//  134  200:lxor            
		//  135  201:lstore          4
								if(l1 < 0L)
		//* 136  203:lload           4
		//* 137  205:lconst_0        
		//* 138  206:lcmp            
		//* 139  207:ifge            221
								{
									l1 ^= 0xfe03f80L;
		//  140  210:lload           4
		//  141  212:ldc2w           #352 <Long 0xfe03f80L>
		//  142  215:lxor            
		//  143  216:lstore          4
								} else
		//* 144  218:goto            348
								{
									int l = i + 1;
		//  145  221:iload_1         
		//  146  222:iconst_1        
		//  147  223:iadd            
		//  148  224:istore_2        
									l1 = (long)abyte0[i] << 42 ^ l1;
		//  149  225:aload           8
		//  150  227:iload_1         
		//  151  228:baload          
		//  152  229:i2l             
		//  153  230:bipush          42
		//  154  232:lshl            
		//  155  233:lload           4
		//  156  235:lxor            
		//  157  236:lstore          4
									if(l1 >= 0L)
		//* 158  238:lload           4
		//* 159  240:lconst_0        
		//* 160  241:lcmp            
		//* 161  242:iflt            258
									{
										l1 ^= 0xfe03f80L;
		//  162  245:lload           4
		//  163  247:ldc2w           #354 <Long 0xfe03f80L>
		//  164  250:lxor            
		//  165  251:lstore          4
										i = l;
		//  166  253:iload_2         
		//  167  254:istore_1        
									} else
		//* 168  255:goto            348
									{
										i = l + 1;
		//  169  258:iload_2         
		//  170  259:iconst_1        
		//  171  260:iadd            
		//  172  261:istore_1        
										l1 = (long)abyte0[l] << 49 ^ l1;
		//  173  262:aload           8
		//  174  264:iload_2         
		//  175  265:baload          
		//  176  266:i2l             
		//  177  267:bipush          49
		//  178  269:lshl            
		//  179  270:lload           4
		//  180  272:lxor            
		//  181  273:lstore          4
										if(l1 < 0L)
		//* 182  275:lload           4
		//* 183  277:lconst_0        
		//* 184  278:lcmp            
		//* 185  279:ifge            293
										{
											l1 ^= 0xfe03f80L;
		//  186  282:lload           4
		//  187  284:ldc2w           #356 <Long 0xfe03f80L>
		//  188  287:lxor            
		//  189  288:lstore          4
										} else
		//* 190  290:goto            348
										{
											int i1 = i + 1;
		//  191  293:iload_1         
		//  192  294:iconst_1        
		//  193  295:iadd            
		//  194  296:istore_2        
											long l2 = l1 ^ (long)abyte0[i] << 56 ^ 0xfe03f80L;
		//  195  297:lload           4
		//  196  299:aload           8
		//  197  301:iload_1         
		//  198  302:baload          
		//  199  303:i2l             
		//  200  304:bipush          56
		//  201  306:lshl            
		//  202  307:lxor            
		//  203  308:ldc2w           #358 <Long 0xfe03f80L>
		//  204  311:lxor            
		//  205  312:lstore          6
											i = i1;
		//  206  314:iload_2         
		//  207  315:istore_1        
											l1 = l2;
		//  208  316:lload           6
		//  209  318:lstore          4
											if(l2 < 0L)
		//* 210  320:lload           6
		//* 211  322:lconst_0        
		//* 212  323:lcmp            
		//* 213  324:ifge            348
											{
												i = i1 + 1;
		//  214  327:iload_2         
		//  215  328:iconst_1        
		//  216  329:iadd            
		//  217  330:istore_1        
												l1 = l2;
		//  218  331:lload           6
		//  219  333:lstore          4
												if((long)abyte0[i1] < 0L)
		//* 220  335:aload           8
		//* 221  337:iload_2         
		//* 222  338:baload          
		//* 223  339:i2l             
		//* 224  340:lconst_0        
		//* 225  341:lcmp            
		//* 226  342:ifge            348
													break label0;
		//  227  345:goto            356
											}
										}
									}
								}
							}
						}
					}
				}
				pos = i;
		//  228  348:aload_0         
		//  229  349:iload_1         
		//  230  350:putfield        #49  <Field int pos>
				return l1;
		//  231  353:lload           4
		//  232  355:lreturn         
			}
			return readRawVarint64SlowPath();
		//  233  356:aload_0         
		//  234  357:invokevirtual   #349 <Method long readRawVarint64SlowPath()>
		//  235  360:lreturn         
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
		//    8   11:invokevirtual   #188 <Method byte readRawByte()>
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
		//   30   43:invokestatic    #184 <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
		//   31   46:athrow          
		}

		public int readSFixed32()
			throws IOException
		{
			return readRawLittleEndian32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #288 <Method int readRawLittleEndian32()>
		//    2    4:ireturn         
		}

		public long readSFixed64()
			throws IOException
		{
			return readRawLittleEndian64();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #277 <Method long readRawLittleEndian64()>
		//    2    4:lreturn         
		}

		public int readSInt32()
			throws IOException
		{
			return decodeZigZag32(readRawVarint32());
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:invokestatic    #365 <Method int decodeZigZag32(int)>
		//    3    7:ireturn         
		}

		public long readSInt64()
			throws IOException
		{
			return decodeZigZag64(readRawVarint64());
		//    0    0:aload_0         
		//    1    1:invokevirtual   #240 <Method long readRawVarint64()>
		//    2    4:invokestatic    #370 <Method long decodeZigZag64(long)>
		//    3    7:lreturn         
		}

		public String readString()
			throws IOException
		{
			int i = readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:istore_1        
			if(i > 0 && i <= bufferSize - pos)
		//*   3    5:iload_1         
		//*   4    6:ifle            54
		//*   5    9:iload_1         
		//*   6   10:aload_0         
		//*   7   11:getfield        #47  <Field int bufferSize>
		//*   8   14:aload_0         
		//*   9   15:getfield        #49  <Field int pos>
		//*  10   18:isub            
		//*  11   19:icmpgt          54
			{
				String s = new String(buffer, pos, i, Internal.UTF_8);
		//   12   22:new             #373 <Class String>
		//   13   25:dup             
		//   14   26:aload_0         
		//   15   27:getfield        #45  <Field byte[] buffer>
		//   16   30:aload_0         
		//   17   31:getfield        #49  <Field int pos>
		//   18   34:iload_1         
		//   19   35:getstatic       #377 <Field java.nio.charset.Charset Internal.UTF_8>
		//   20   38:invokespecial   #380 <Method void String(byte[], int, int, java.nio.charset.Charset)>
		//   21   41:astore_2        
				pos = pos + i;
		//   22   42:aload_0         
		//   23   43:aload_0         
		//   24   44:getfield        #49  <Field int pos>
		//   25   47:iload_1         
		//   26   48:iadd            
		//   27   49:putfield        #49  <Field int pos>
				return s;
		//   28   52:aload_2         
		//   29   53:areturn         
			}
			if(i == 0)
		//*  30   54:iload_1         
		//*  31   55:ifne            62
				return "";
		//   32   58:ldc2            #382 <String "">
		//   33   61:areturn         
			if(i <= bufferSize)
		//*  34   62:iload_1         
		//*  35   63:aload_0         
		//*  36   64:getfield        #47  <Field int bufferSize>
		//*  37   67:icmpgt          107
			{
				refillBuffer(i);
		//   38   70:aload_0         
		//   39   71:iload_1         
		//   40   72:invokespecial   #174 <Method void refillBuffer(int)>
				String s1 = new String(buffer, pos, i, Internal.UTF_8);
		//   41   75:new             #373 <Class String>
		//   42   78:dup             
		//   43   79:aload_0         
		//   44   80:getfield        #45  <Field byte[] buffer>
		//   45   83:aload_0         
		//   46   84:getfield        #49  <Field int pos>
		//   47   87:iload_1         
		//   48   88:getstatic       #377 <Field java.nio.charset.Charset Internal.UTF_8>
		//   49   91:invokespecial   #380 <Method void String(byte[], int, int, java.nio.charset.Charset)>
		//   50   94:astore_2        
				pos = pos + i;
		//   51   95:aload_0         
		//   52   96:aload_0         
		//   53   97:getfield        #49  <Field int pos>
		//   54  100:iload_1         
		//   55  101:iadd            
		//   56  102:putfield        #49  <Field int pos>
				return s1;
		//   57  105:aload_2         
		//   58  106:areturn         
			} else
			{
				return new String(readRawBytesSlowPath(i), Internal.UTF_8);
		//   59  107:new             #373 <Class String>
		//   60  110:dup             
		//   61  111:aload_0         
		//   62  112:iload_1         
		//   63  113:invokespecial   #253 <Method byte[] readRawBytesSlowPath(int)>
		//   64  116:getstatic       #377 <Field java.nio.charset.Charset Internal.UTF_8>
		//   65  119:invokespecial   #385 <Method void String(byte[], java.nio.charset.Charset)>
		//   66  122:areturn         
			}
		}

		public String readStringRequireUtf8()
			throws IOException
		{
			int j = readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:istore_2        
			int i = pos;
		//    3    5:aload_0         
		//    4    6:getfield        #49  <Field int pos>
		//    5    9:istore_1        
			byte abyte0[];
			if(j <= bufferSize - i && j > 0)
		//*   6   10:iload_2         
		//*   7   11:aload_0         
		//*   8   12:getfield        #47  <Field int bufferSize>
		//*   9   15:iload_1         
		//*  10   16:isub            
		//*  11   17:icmpgt          39
		//*  12   20:iload_2         
		//*  13   21:ifle            39
			{
				abyte0 = buffer;
		//   14   24:aload_0         
		//   15   25:getfield        #45  <Field byte[] buffer>
		//   16   28:astore_3        
				pos = i + j;
		//   17   29:aload_0         
		//   18   30:iload_1         
		//   19   31:iload_2         
		//   20   32:iadd            
		//   21   33:putfield        #49  <Field int pos>
			} else
		//*  22   36:goto            85
			{
				if(j == 0)
		//*  23   39:iload_2         
		//*  24   40:ifne            47
					return "";
		//   25   43:ldc2            #382 <String "">
		//   26   46:areturn         
				if(j <= bufferSize)
		//*  27   47:iload_2         
		//*  28   48:aload_0         
		//*  29   49:getfield        #47  <Field int bufferSize>
		//*  30   52:icmpgt          77
				{
					refillBuffer(j);
		//   31   55:aload_0         
		//   32   56:iload_2         
		//   33   57:invokespecial   #174 <Method void refillBuffer(int)>
					abyte0 = buffer;
		//   34   60:aload_0         
		//   35   61:getfield        #45  <Field byte[] buffer>
		//   36   64:astore_3        
					i = 0;
		//   37   65:iconst_0        
		//   38   66:istore_1        
					pos = j + 0;
		//   39   67:aload_0         
		//   40   68:iload_2         
		//   41   69:iconst_0        
		//   42   70:iadd            
		//   43   71:putfield        #49  <Field int pos>
				} else
		//*  44   74:goto            85
				{
					abyte0 = readRawBytesSlowPath(j);
		//   45   77:aload_0         
		//   46   78:iload_2         
		//   47   79:invokespecial   #253 <Method byte[] readRawBytesSlowPath(int)>
		//   48   82:astore_3        
					i = 0;
		//   49   83:iconst_0        
		//   50   84:istore_1        
				}
			}
			if(!Utf8.isValidUtf8(abyte0, i, i + j))
		//*  51   85:aload_3         
		//*  52   86:iload_1         
		//*  53   87:iload_1         
		//*  54   88:iload_2         
		//*  55   89:iadd            
		//*  56   90:invokestatic    #392 <Method boolean Utf8.isValidUtf8(byte[], int, int)>
		//*  57   93:ifne            100
				throw InvalidProtocolBufferException.invalidUtf8();
		//   58   96:invokestatic    #395 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidUtf8()>
		//   59   99:athrow          
			else
				return new String(abyte0, i, j, Internal.UTF_8);
		//   60  100:new             #373 <Class String>
		//   61  103:dup             
		//   62  104:aload_3         
		//   63  105:iload_1         
		//   64  106:iload_2         
		//   65  107:getstatic       #377 <Field java.nio.charset.Charset Internal.UTF_8>
		//   66  110:invokespecial   #380 <Method void String(byte[], int, int, java.nio.charset.Charset)>
		//   67  113:areturn         
		}

		public int readTag()
			throws IOException
		{
			if(isAtEnd())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #398 <Method boolean isAtEnd()>
		//*   2    4:ifeq            14
			{
				lastTag = 0;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #223 <Field int lastTag>
				return 0;
		//    6   12:iconst_0        
		//    7   13:ireturn         
			}
			lastTag = readRawVarint32();
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:invokevirtual   #245 <Method int readRawVarint32()>
		//   11   19:putfield        #223 <Field int lastTag>
			if(WireFormat.getTagFieldNumber(lastTag) == 0)
		//*  12   22:aload_0         
		//*  13   23:getfield        #223 <Field int lastTag>
		//*  14   26:invokestatic    #401 <Method int WireFormat.getTagFieldNumber(int)>
		//*  15   29:ifne            36
				throw InvalidProtocolBufferException.invalidTag();
		//   16   32:invokestatic    #404 <Method InvalidProtocolBufferException InvalidProtocolBufferException.invalidTag()>
		//   17   35:athrow          
			else
				return lastTag;
		//   18   36:aload_0         
		//   19   37:getfield        #223 <Field int lastTag>
		//   20   40:ireturn         
		}

		public int readUInt32()
			throws IOException
		{
			return readRawVarint32();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #245 <Method int readRawVarint32()>
		//    2    4:ireturn         
		}

		public long readUInt64()
			throws IOException
		{
			return readRawVarint64();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #240 <Method long readRawVarint64()>
		//    2    4:lreturn         
		}

		public void readUnknownGroup(int i, MessageLite.Builder builder)
			throws IOException
		{
			readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokestatic    #415 <Method ExtensionRegistryLite ExtensionRegistryLite.getEmptyRegistry()>
		//    4    6:invokevirtual   #417 <Method void readGroup(int, MessageLite$Builder, ExtensionRegistryLite)>
		//    5    9:return          
		}

		public void resetSizeCounter()
		{
			totalBytesRetired = -pos;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #49  <Field int pos>
		//    3    5:ineg            
		//    4    6:putfield        #51  <Field int totalBytesRetired>
		//    5    9:return          
		}

		public boolean skipField(int i)
			throws IOException
		{
			switch(WireFormat.getTagWireType(i))
		//*   0    0:iload_1         
		//*   1    1:invokestatic    #423 <Method int WireFormat.getTagWireType(int)>
			{
		//*   2    4:tableswitch     0 5: default 44
		//		               0 47
		//		               1 53
		//		               2 61
		//		               3 71
		//		               4 89
		//		               5 91
		//*   3   44:goto            98
			case 0: // '\0'
				skipRawVarint();
		//    4   47:aload_0         
		//    5   48:invokespecial   #425 <Method void skipRawVarint()>
				return true;
		//    6   51:iconst_1        
		//    7   52:ireturn         

			case 1: // '\001'
				skipRawBytes(8);
		//    8   53:aload_0         
		//    9   54:bipush          8
		//   10   56:invokevirtual   #140 <Method void skipRawBytes(int)>
				return true;
		//   11   59:iconst_1        
		//   12   60:ireturn         

			case 2: // '\002'
				skipRawBytes(readRawVarint32());
		//   13   61:aload_0         
		//   14   62:aload_0         
		//   15   63:invokevirtual   #245 <Method int readRawVarint32()>
		//   16   66:invokevirtual   #140 <Method void skipRawBytes(int)>
				return true;
		//   17   69:iconst_1        
		//   18   70:ireturn         

			case 3: // '\003'
				skipMessage();
		//   19   71:aload_0         
		//   20   72:invokevirtual   #428 <Method void skipMessage()>
				checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
		//   21   75:aload_0         
		//   22   76:iload_1         
		//   23   77:invokestatic    #401 <Method int WireFormat.getTagFieldNumber(int)>
		//   24   80:iconst_4        
		//   25   81:invokestatic    #321 <Method int WireFormat.makeTag(int, int)>
		//   26   84:invokevirtual   #323 <Method void checkLastTagWas(int)>
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
		//   33   93:invokevirtual   #140 <Method void skipRawBytes(int)>
				return true;
		//   34   96:iconst_1        
		//   35   97:ireturn         
			}
			throw InvalidProtocolBufferException.invalidWireType();
		//   36   98:invokestatic    #432 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
		//   37  101:athrow          
		}

		public boolean skipField(int i, CodedOutputStream codedoutputstream)
			throws IOException
		{
			switch(WireFormat.getTagWireType(i))
		//*   0    0:iload_1         
		//*   1    1:invokestatic    #423 <Method int WireFormat.getTagWireType(int)>
			{
		//*   2    4:tableswitch     0 5: default 44
		//		               0 47
		//		               1 66
		//		               2 85
		//		               3 104
		//		               4 135
		//		               5 137
		//*   3   44:goto            154
			case 0: // '\0'
				long l = readInt64();
		//    4   47:aload_0         
		//    5   48:invokevirtual   #435 <Method long readInt64()>
		//    6   51:lstore          4
				codedoutputstream.writeRawVarint32(i);
		//    7   53:aload_2         
		//    8   54:iload_1         
		//    9   55:invokevirtual   #440 <Method void CodedOutputStream.writeRawVarint32(int)>
				codedoutputstream.writeUInt64NoTag(l);
		//   10   58:aload_2         
		//   11   59:lload           4
		//   12   61:invokevirtual   #444 <Method void CodedOutputStream.writeUInt64NoTag(long)>
				return true;
		//   13   64:iconst_1        
		//   14   65:ireturn         

			case 1: // '\001'
				long l1 = readRawLittleEndian64();
		//   15   66:aload_0         
		//   16   67:invokevirtual   #277 <Method long readRawLittleEndian64()>
		//   17   70:lstore          4
				codedoutputstream.writeRawVarint32(i);
		//   18   72:aload_2         
		//   19   73:iload_1         
		//   20   74:invokevirtual   #440 <Method void CodedOutputStream.writeRawVarint32(int)>
				codedoutputstream.writeFixed64NoTag(l1);
		//   21   77:aload_2         
		//   22   78:lload           4
		//   23   80:invokevirtual   #447 <Method void CodedOutputStream.writeFixed64NoTag(long)>
				return true;
		//   24   83:iconst_1        
		//   25   84:ireturn         

			case 2: // '\002'
				ByteString bytestring = readBytes();
		//   26   85:aload_0         
		//   27   86:invokevirtual   #449 <Method ByteString readBytes()>
		//   28   89:astore          6
				codedoutputstream.writeRawVarint32(i);
		//   29   91:aload_2         
		//   30   92:iload_1         
		//   31   93:invokevirtual   #440 <Method void CodedOutputStream.writeRawVarint32(int)>
				codedoutputstream.writeBytesNoTag(bytestring);
		//   32   96:aload_2         
		//   33   97:aload           6
		//   34   99:invokevirtual   #453 <Method void CodedOutputStream.writeBytesNoTag(ByteString)>
				return true;
		//   35  102:iconst_1        
		//   36  103:ireturn         

			case 3: // '\003'
				codedoutputstream.writeRawVarint32(i);
		//   37  104:aload_2         
		//   38  105:iload_1         
		//   39  106:invokevirtual   #440 <Method void CodedOutputStream.writeRawVarint32(int)>
				skipMessage(codedoutputstream);
		//   40  109:aload_0         
		//   41  110:aload_2         
		//   42  111:invokevirtual   #456 <Method void skipMessage(CodedOutputStream)>
				i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
		//   43  114:iload_1         
		//   44  115:invokestatic    #401 <Method int WireFormat.getTagFieldNumber(int)>
		//   45  118:iconst_4        
		//   46  119:invokestatic    #321 <Method int WireFormat.makeTag(int, int)>
		//   47  122:istore_1        
				checkLastTagWas(i);
		//   48  123:aload_0         
		//   49  124:iload_1         
		//   50  125:invokevirtual   #323 <Method void checkLastTagWas(int)>
				codedoutputstream.writeRawVarint32(i);
		//   51  128:aload_2         
		//   52  129:iload_1         
		//   53  130:invokevirtual   #440 <Method void CodedOutputStream.writeRawVarint32(int)>
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
		//   59  138:invokevirtual   #288 <Method int readRawLittleEndian32()>
		//   60  141:istore_3        
				codedoutputstream.writeRawVarint32(i);
		//   61  142:aload_2         
		//   62  143:iload_1         
		//   63  144:invokevirtual   #440 <Method void CodedOutputStream.writeRawVarint32(int)>
				codedoutputstream.writeFixed32NoTag(j);
		//   64  147:aload_2         
		//   65  148:iload_3         
		//   66  149:invokevirtual   #459 <Method void CodedOutputStream.writeFixed32NoTag(int)>
				return true;
		//   67  152:iconst_1        
		//   68  153:ireturn         
			}
			throw InvalidProtocolBufferException.invalidWireType();
		//   69  154:invokestatic    #432 <Method InvalidProtocolBufferException$InvalidWireTypeException InvalidProtocolBufferException.invalidWireType()>
		//   70  157:athrow          
		}

		public void skipMessage()
			throws IOException
		{
			int i;
			do
				i = readTag();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #461 <Method int readTag()>
		//    2    4:istore_1        
			while(i != 0 && skipField(i));
		//    3    5:iload_1         
		//    4    6:ifeq            17
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:invokevirtual   #463 <Method boolean skipField(int)>
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
		//    1    1:invokevirtual   #461 <Method int readTag()>
		//    2    4:istore_2        
			while(i != 0 && skipField(i, codedoutputstream));
		//    3    5:iload_2         
		//    4    6:ifeq            18
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #465 <Method boolean skipField(int, CodedOutputStream)>
		//    9   15:ifne            19
		//   10   18:return          
		//*  11   19:goto            0
		}

		public void skipRawBytes(int i)
			throws IOException
		{
			if(i <= bufferSize - pos && i >= 0)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #47  <Field int bufferSize>
		//*   3    5:aload_0         
		//*   4    6:getfield        #49  <Field int pos>
		//*   5    9:isub            
		//*   6   10:icmpgt          28
		//*   7   13:iload_1         
		//*   8   14:iflt            28
			{
				pos = pos + i;
		//    9   17:aload_0         
		//   10   18:aload_0         
		//   11   19:getfield        #49  <Field int pos>
		//   12   22:iload_1         
		//   13   23:iadd            
		//   14   24:putfield        #49  <Field int pos>
				return;
		//   15   27:return          
			} else
			{
				skipRawBytesSlowPath(i);
		//   16   28:aload_0         
		//   17   29:iload_1         
		//   18   30:invokespecial   #467 <Method void skipRawBytesSlowPath(int)>
				return;
		//   19   33:return          
			}
		}

		private final byte buffer[];
		private int bufferSize;
		private int bufferSizeAfterLimit;
		private int currentLimit;
		private final InputStream input;
		private int lastTag;
		private int pos;
		private RefillCallback refillCallback;
		private int totalBytesRetired;


/*
		static int access$500(StreamDecoder streamdecoder)
		{
			return streamdecoder.pos;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field int pos>
		//    2    4:ireturn         
		}

*/


/*
		static byte[] access$600(StreamDecoder streamdecoder)
		{
			return streamdecoder.buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field byte[] buffer>
		//    2    4:areturn         
		}

*/

		private StreamDecoder(InputStream inputstream, int i)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #29  <Method void CodedInputStream(CodedInputStream$1)>
			currentLimit = 0x7fffffff;
		//    3    5:aload_0         
		//    4    6:ldc1            #30  <Int 0x7fffffff>
		//    5    8:putfield        #32  <Field int currentLimit>
			refillCallback = null;
		//    6   11:aload_0         
		//    7   12:aconst_null     
		//    8   13:putfield        #34  <Field CodedInputStream$StreamDecoder$RefillCallback refillCallback>
			Internal.checkNotNull(((Object) (inputstream)), "input");
		//    9   16:aload_1         
		//   10   17:ldc1            #35  <String "input">
		//   11   19:invokestatic    #41  <Method Object Internal.checkNotNull(Object, String)>
		//   12   22:pop             
			input = inputstream;
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:putfield        #43  <Field InputStream input>
			buffer = new byte[i];
		//   16   28:aload_0         
		//   17   29:iload_2         
		//   18   30:newarray        byte[]
		//   19   32:putfield        #45  <Field byte[] buffer>
			bufferSize = 0;
		//   20   35:aload_0         
		//   21   36:iconst_0        
		//   22   37:putfield        #47  <Field int bufferSize>
			pos = 0;
		//   23   40:aload_0         
		//   24   41:iconst_0        
		//   25   42:putfield        #49  <Field int pos>
			totalBytesRetired = 0;
		//   26   45:aload_0         
		//   27   46:iconst_0        
		//   28   47:putfield        #51  <Field int totalBytesRetired>
		//   29   50:return          
		}

	}

	static interface StreamDecoder.RefillCallback
	{

		public abstract void onRefill();
	}

	class StreamDecoder.SkippedDataSink
		implements StreamDecoder.RefillCallback
	{

		ByteBuffer getSkippedData()
		{
			if(byteArrayStream == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
		//*   2    4:ifnonnull       34
			{
				return ByteBuffer.wrap(buffer, lastPos, pos - lastPos);
		//    3    7:aload_0         
		//    4    8:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		//    5   11:invokestatic    #40  <Method byte[] CodedInputStream$StreamDecoder.access$600(CodedInputStream$StreamDecoder)>
		//    6   14:aload_0         
		//    7   15:getfield        #31  <Field int lastPos>
		//    8   18:aload_0         
		//    9   19:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		//   10   22:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
		//   11   25:aload_0         
		//   12   26:getfield        #31  <Field int lastPos>
		//   13   29:isub            
		//   14   30:invokestatic    #46  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
		//   15   33:areturn         
			} else
			{
				byteArrayStream.write(buffer, lastPos, pos);
		//   16   34:aload_0         
		//   17   35:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
		//   18   38:aload_0         
		//   19   39:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		//   20   42:invokestatic    #40  <Method byte[] CodedInputStream$StreamDecoder.access$600(CodedInputStream$StreamDecoder)>
		//   21   45:aload_0         
		//   22   46:getfield        #31  <Field int lastPos>
		//   23   49:aload_0         
		//   24   50:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		//   25   53:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
		//   26   56:invokevirtual   #52  <Method void ByteArrayOutputStream.write(byte[], int, int)>
				return ByteBuffer.wrap(byteArrayStream.toByteArray());
		//   27   59:aload_0         
		//   28   60:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
		//   29   63:invokevirtual   #56  <Method byte[] ByteArrayOutputStream.toByteArray()>
		//   30   66:invokestatic    #59  <Method ByteBuffer ByteBuffer.wrap(byte[])>
		//   31   69:areturn         
			}
		}

		public void onRefill()
		{
			if(byteArrayStream == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
		//*   2    4:ifnonnull       18
				byteArrayStream = new ByteArrayOutputStream();
		//    3    7:aload_0         
		//    4    8:new             #48  <Class ByteArrayOutputStream>
		//    5   11:dup             
		//    6   12:invokespecial   #61  <Method void ByteArrayOutputStream()>
		//    7   15:putfield        #36  <Field ByteArrayOutputStream byteArrayStream>
			byteArrayStream.write(buffer, lastPos, pos - lastPos);
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field ByteArrayOutputStream byteArrayStream>
		//   10   22:aload_0         
		//   11   23:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		//   12   26:invokestatic    #40  <Method byte[] CodedInputStream$StreamDecoder.access$600(CodedInputStream$StreamDecoder)>
		//   13   29:aload_0         
		//   14   30:getfield        #31  <Field int lastPos>
		//   15   33:aload_0         
		//   16   34:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		//   17   37:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
		//   18   40:aload_0         
		//   19   41:getfield        #31  <Field int lastPos>
		//   20   44:isub            
		//   21   45:invokevirtual   #52  <Method void ByteArrayOutputStream.write(byte[], int, int)>
			lastPos = 0;
		//   22   48:aload_0         
		//   23   49:iconst_0        
		//   24   50:putfield        #31  <Field int lastPos>
		//   25   53:return          
		}

		private ByteArrayOutputStream byteArrayStream;
		private int lastPos;
		final StreamDecoder this$0;

		private StreamDecoder.SkippedDataSink()
		{
			this$0 = StreamDecoder.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field CodedInputStream$StreamDecoder this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			lastPos = pos;
		//    5    9:aload_0         
		//    6   10:aload_0         
		//    7   11:getfield        #22  <Field CodedInputStream$StreamDecoder this$0>
		//    8   14:invokestatic    #29  <Method int CodedInputStream$StreamDecoder.access$500(CodedInputStream$StreamDecoder)>
		//    9   17:putfield        #31  <Field int lastPos>
		//   10   20:return          
		}
	}

	static final class UnsafeDirectNioDecoder extends CodedInputStream
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
		//		               0 47
		//		               1 53
		//		               2 61
		//		               3 71
		//		               4 89
		//		               5 91
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
		//		               0 47
		//		               1 66
		//		               2 85
		//		               3 104
		//		               4 135
		//		               5 137
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

		private UnsafeDirectNioDecoder(ByteBuffer bytebuffer, boolean flag)
		{
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

	}


	private CodedInputStream()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void Object()>
		recursionLimit = 100;
	//    2    4:aload_0         
	//    3    5:bipush          100
	//    4    7:putfield        #48  <Field int recursionLimit>
		sizeLimit = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #31  <Int 0x7fffffff>
	//    7   13:putfield        #50  <Field int sizeLimit>
		explicitDiscardUnknownFields = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #52  <Field boolean explicitDiscardUnknownFields>
	//   11   21:return          
	}


	public static int decodeZigZag32(int i)
	{
		return i >>> 1 ^ -(i & 1);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:iushr           
	//    3    3:iload_0         
	//    4    4:iconst_1        
	//    5    5:iand            
	//    6    6:ineg            
	//    7    7:ixor            
	//    8    8:ireturn         
	}

	public static long decodeZigZag64(long l)
	{
		return l >>> 1 ^ -(1L & l);
	//    0    0:lload_0         
	//    1    1:iconst_1        
	//    2    2:lushr           
	//    3    3:lconst_1        
	//    4    4:lload_0         
	//    5    5:land            
	//    6    6:lneg            
	//    7    7:lxor            
	//    8    8:lreturn         
	}

	static boolean getProto3DiscardUnknownFieldsDefault()
	{
		return proto3DiscardUnknownFieldsDefault;
	//    0    0:getstatic       #42  <Field boolean proto3DiscardUnknownFieldsDefault>
	//    1    3:ireturn         
	}

	public static CodedInputStream newInstance(InputStream inputstream)
	{
		return newInstance(inputstream, 4096);
	//    0    0:aload_0         
	//    1    1:sipush          4096
	//    2    4:invokestatic    #65  <Method CodedInputStream newInstance(InputStream, int)>
	//    3    7:areturn         
	}

	static CodedInputStream newInstance(InputStream inputstream, int i)
	{
		if(inputstream == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       11
			return newInstance(Internal.EMPTY_BYTE_ARRAY);
	//    2    4:getstatic       #71  <Field byte[] Internal.EMPTY_BYTE_ARRAY>
	//    3    7:invokestatic    #74  <Method CodedInputStream newInstance(byte[])>
	//    4   10:areturn         
		else
			return ((CodedInputStream) (new StreamDecoder(inputstream, i)));
	//    5   11:new             #14  <Class CodedInputStream$StreamDecoder>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aconst_null     
	//   10   18:invokespecial   #77  <Method void CodedInputStream$StreamDecoder(InputStream, int, CodedInputStream$1)>
	//   11   21:areturn         
	}

	public static CodedInputStream newInstance(Iterable iterable)
	{
		if(!UnsafeDirectNioDecoder.isSupported())
	//*   0    0:invokestatic    #81  <Method boolean CodedInputStream$UnsafeDirectNioDecoder.isSupported()>
	//*   1    3:ifne            18
			return newInstance(((InputStream) (new IterableByteBufferInputStream(iterable))));
	//    2    6:new             #83  <Class IterableByteBufferInputStream>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #86  <Method void IterableByteBufferInputStream(Iterable)>
	//    6   14:invokestatic    #88  <Method CodedInputStream newInstance(InputStream)>
	//    7   17:areturn         
		else
			return newInstance(iterable, false);
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:invokestatic    #91  <Method CodedInputStream newInstance(Iterable, boolean)>
	//   11   23:areturn         
	}

	static CodedInputStream newInstance(Iterable iterable, boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		for(Iterator iterator = iterable.iterator(); iterator.hasNext();)
	//*   4    4:aload_0         
	//*   5    5:invokeinterface #99  <Method Iterator Iterable.iterator()>
	//*   6   10:astore          4
	//*   7   12:aload           4
	//*   8   14:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//*   9   19:ifeq            79
		{
			ByteBuffer bytebuffer = (ByteBuffer)iterator.next();
	//   10   22:aload           4
	//   11   24:invokeinterface #108 <Method Object Iterator.next()>
	//   12   29:checkcast       #110 <Class ByteBuffer>
	//   13   32:astore          5
			j += bytebuffer.remaining();
	//   14   34:iload_3         
	//   15   35:aload           5
	//   16   37:invokevirtual   #114 <Method int ByteBuffer.remaining()>
	//   17   40:iadd            
	//   18   41:istore_3        
			if(bytebuffer.hasArray())
	//*  19   42:aload           5
	//*  20   44:invokevirtual   #117 <Method boolean ByteBuffer.hasArray()>
	//*  21   47:ifeq            57
				i |= 1;
	//   22   50:iload_2         
	//   23   51:iconst_1        
	//   24   52:ior             
	//   25   53:istore_2        
			else
	//*  26   54:goto            76
			if(bytebuffer.isDirect())
	//*  27   57:aload           5
	//*  28   59:invokevirtual   #120 <Method boolean ByteBuffer.isDirect()>
	//*  29   62:ifeq            72
				i |= 2;
	//   30   65:iload_2         
	//   31   66:iconst_2        
	//   32   67:ior             
	//   33   68:istore_2        
			else
	//*  34   69:goto            76
				i |= 4;
	//   35   72:iload_2         
	//   36   73:iconst_4        
	//   37   74:ior             
	//   38   75:istore_2        
		}

	//*  39   76:goto            12
		if(i == 2)
	//*  40   79:iload_2         
	//*  41   80:iconst_2        
	//*  42   81:icmpne          96
			return ((CodedInputStream) (new IterableDirectByteBufferDecoder(iterable, j, flag)));
	//   43   84:new             #11  <Class CodedInputStream$IterableDirectByteBufferDecoder>
	//   44   87:dup             
	//   45   88:aload_0         
	//   46   89:iload_3         
	//   47   90:iload_1         
	//   48   91:aconst_null     
	//   49   92:invokespecial   #123 <Method void CodedInputStream$IterableDirectByteBufferDecoder(Iterable, int, boolean, CodedInputStream$1)>
	//   50   95:areturn         
		else
			return newInstance(((InputStream) (new IterableByteBufferInputStream(iterable))));
	//   51   96:new             #83  <Class IterableByteBufferInputStream>
	//   52   99:dup             
	//   53  100:aload_0         
	//   54  101:invokespecial   #86  <Method void IterableByteBufferInputStream(Iterable)>
	//   55  104:invokestatic    #88  <Method CodedInputStream newInstance(InputStream)>
	//   56  107:areturn         
	}

	public static CodedInputStream newInstance(ByteBuffer bytebuffer)
	{
		return newInstance(bytebuffer, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #128 <Method CodedInputStream newInstance(ByteBuffer, boolean)>
	//    3    5:areturn         
	}

	static CodedInputStream newInstance(ByteBuffer bytebuffer, boolean flag)
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #117 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            29
			return newInstance(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining(), flag);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #132 <Method byte[] ByteBuffer.array()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #135 <Method int ByteBuffer.arrayOffset()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #138 <Method int ByteBuffer.position()>
	//    9   19:iadd            
	//   10   20:aload_0         
	//   11   21:invokevirtual   #114 <Method int ByteBuffer.remaining()>
	//   12   24:iload_1         
	//   13   25:invokestatic    #141 <Method CodedInputStream newInstance(byte[], int, int, boolean)>
	//   14   28:areturn         
		if(bytebuffer.isDirect() && UnsafeDirectNioDecoder.isSupported())
	//*  15   29:aload_0         
	//*  16   30:invokevirtual   #120 <Method boolean ByteBuffer.isDirect()>
	//*  17   33:ifeq            53
	//*  18   36:invokestatic    #81  <Method boolean CodedInputStream$UnsafeDirectNioDecoder.isSupported()>
	//*  19   39:ifeq            53
		{
			return ((CodedInputStream) (new UnsafeDirectNioDecoder(bytebuffer, flag)));
	//   20   42:new             #23  <Class CodedInputStream$UnsafeDirectNioDecoder>
	//   21   45:dup             
	//   22   46:aload_0         
	//   23   47:iload_1         
	//   24   48:aconst_null     
	//   25   49:invokespecial   #144 <Method void CodedInputStream$UnsafeDirectNioDecoder(ByteBuffer, boolean, CodedInputStream$1)>
	//   26   52:areturn         
		} else
		{
			byte abyte0[] = new byte[bytebuffer.remaining()];
	//   27   53:aload_0         
	//   28   54:invokevirtual   #114 <Method int ByteBuffer.remaining()>
	//   29   57:newarray        byte[]
	//   30   59:astore_2        
			bytebuffer.duplicate().get(abyte0);
	//   31   60:aload_0         
	//   32   61:invokevirtual   #148 <Method ByteBuffer ByteBuffer.duplicate()>
	//   33   64:aload_2         
	//   34   65:invokevirtual   #152 <Method ByteBuffer ByteBuffer.get(byte[])>
	//   35   68:pop             
			return newInstance(abyte0, 0, abyte0.length, true);
	//   36   69:aload_2         
	//   37   70:iconst_0        
	//   38   71:aload_2         
	//   39   72:arraylength     
	//   40   73:iconst_1        
	//   41   74:invokestatic    #141 <Method CodedInputStream newInstance(byte[], int, int, boolean)>
	//   42   77:areturn         
		}
	}

	public static CodedInputStream newInstance(byte abyte0[])
	{
		return newInstance(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #155 <Method CodedInputStream newInstance(byte[], int, int)>
	//    5    7:areturn         
	}

	public static CodedInputStream newInstance(byte abyte0[], int i, int j)
	{
		return newInstance(abyte0, i, j, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #141 <Method CodedInputStream newInstance(byte[], int, int, boolean)>
	//    5    7:areturn         
	}

	static CodedInputStream newInstance(byte abyte0[], int i, int j, boolean flag)
	{
		abyte0 = ((byte []) (new ArrayDecoder(abyte0, i, j, flag)));
	//    0    0:new             #8   <Class CodedInputStream$ArrayDecoder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:aconst_null     
	//    7    9:invokespecial   #160 <Method void CodedInputStream$ArrayDecoder(byte[], int, int, boolean, CodedInputStream$1)>
	//    8   12:astore_0        
		try
		{
			((ArrayDecoder) (abyte0)).pushLimit(j);
	//    9   13:aload_0         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #163 <Method int CodedInputStream$ArrayDecoder.pushLimit(int)>
	//   12   18:pop             
		}
	//*  13   19:aload_0         
	//*  14   20:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  15   21:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (abyte0)));
	//   16   22:new             #165 <Class IllegalArgumentException>
	//   17   25:dup             
	//   18   26:aload_0         
	//   19   27:invokespecial   #168 <Method void IllegalArgumentException(Throwable)>
	//   20   30:athrow          
		}
		return ((CodedInputStream) (abyte0));
	}

	public static int readRawVarint32(int i, InputStream inputstream)
		throws IOException
	{
		if((i & 0x80) == 0)
	//*   0    0:iload_0         
	//*   1    1:sipush          128
	//*   2    4:iand            
	//*   3    5:ifne            10
			return i;
	//    4    8:iload_0         
	//    5    9:ireturn         
		int j = i & 0x7f;
	//    6   10:iload_0         
	//    7   11:bipush          127
	//    8   13:iand            
	//    9   14:istore_2        
		i = 7;
	//   10   15:bipush          7
	//   11   17:istore_0        
		int k;
		do
		{
			k = i;
	//   12   18:iload_0         
	//   13   19:istore_3        
			if(i >= 32)
				break;
	//   14   20:iload_0         
	//   15   21:bipush          32
	//   16   23:icmpge          67
			k = inputstream.read();
	//   17   26:aload_1         
	//   18   27:invokevirtual   #177 <Method int InputStream.read()>
	//   19   30:istore_3        
			if(k == -1)
	//*  20   31:iload_3         
	//*  21   32:iconst_m1       
	//*  22   33:icmpne          40
				throw InvalidProtocolBufferException.truncatedMessage();
	//   23   36:invokestatic    #181 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   24   39:athrow          
			j |= (k & 0x7f) << i;
	//   25   40:iload_2         
	//   26   41:iload_3         
	//   27   42:bipush          127
	//   28   44:iand            
	//   29   45:iload_0         
	//   30   46:ishl            
	//   31   47:ior             
	//   32   48:istore_2        
			if((k & 0x80) == 0)
	//*  33   49:iload_3         
	//*  34   50:sipush          128
	//*  35   53:iand            
	//*  36   54:ifne            59
				return j;
	//   37   57:iload_2         
	//   38   58:ireturn         
			i += 7;
	//   39   59:iload_0         
	//   40   60:bipush          7
	//   41   62:iadd            
	//   42   63:istore_0        
		} while(true);
	//   43   64:goto            18
		for(; k < 64; k += 7)
	//*  44   67:iload_3         
	//*  45   68:bipush          64
	//*  46   70:icmpge          105
		{
			i = inputstream.read();
	//   47   73:aload_1         
	//   48   74:invokevirtual   #177 <Method int InputStream.read()>
	//   49   77:istore_0        
			if(i == -1)
	//*  50   78:iload_0         
	//*  51   79:iconst_m1       
	//*  52   80:icmpne          87
				throw InvalidProtocolBufferException.truncatedMessage();
	//   53   83:invokestatic    #181 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//   54   86:athrow          
			if((i & 0x80) == 0)
	//*  55   87:iload_0         
	//*  56   88:sipush          128
	//*  57   91:iand            
	//*  58   92:ifne            97
				return j;
	//   59   95:iload_2         
	//   60   96:ireturn         
		}

	//   61   97:iload_3         
	//   62   98:bipush          7
	//   63  100:iadd            
	//   64  101:istore_3        
	//*  65  102:goto            67
		throw InvalidProtocolBufferException.malformedVarint();
	//   66  105:invokestatic    #184 <Method InvalidProtocolBufferException InvalidProtocolBufferException.malformedVarint()>
	//   67  108:athrow          
	}

	static int readRawVarint32(InputStream inputstream)
		throws IOException
	{
		int i = inputstream.read();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method int InputStream.read()>
	//    2    4:istore_1        
		if(i == -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          14
			throw InvalidProtocolBufferException.truncatedMessage();
	//    6   10:invokestatic    #181 <Method InvalidProtocolBufferException InvalidProtocolBufferException.truncatedMessage()>
	//    7   13:athrow          
		else
			return readRawVarint32(i, inputstream);
	//    8   14:iload_1         
	//    9   15:aload_0         
	//   10   16:invokestatic    #188 <Method int readRawVarint32(int, InputStream)>
	//   11   19:ireturn         
	}

	static void setProto3DiscardUnknownsByDefaultForTest()
	{
		proto3DiscardUnknownFieldsDefault = true;
	//    0    0:iconst_1        
	//    1    1:putstatic       #42  <Field boolean proto3DiscardUnknownFieldsDefault>
	//    2    4:return          
	}

	static void setProto3KeepUnknownsByDefaultForTest()
	{
		proto3DiscardUnknownFieldsDefault = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #42  <Field boolean proto3DiscardUnknownFieldsDefault>
	//    2    4:return          
	}

	public abstract void checkLastTagWas(int i)
		throws InvalidProtocolBufferException;

	final void discardUnknownFields()
	{
		explicitDiscardUnknownFields = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #52  <Field boolean explicitDiscardUnknownFields>
	//    3    5:return          
	}

	public abstract void enableAliasing(boolean flag);

	public abstract int getBytesUntilLimit();

	public abstract int getLastTag();

	public abstract int getTotalBytesRead();

	public abstract boolean isAtEnd()
		throws IOException;

	public abstract void popLimit(int i);

	public abstract int pushLimit(int i)
		throws InvalidProtocolBufferException;

	public abstract boolean readBool()
		throws IOException;

	public abstract byte[] readByteArray()
		throws IOException;

	public abstract ByteBuffer readByteBuffer()
		throws IOException;

	public abstract ByteString readBytes()
		throws IOException;

	public abstract double readDouble()
		throws IOException;

	public abstract int readEnum()
		throws IOException;

	public abstract int readFixed32()
		throws IOException;

	public abstract long readFixed64()
		throws IOException;

	public abstract float readFloat()
		throws IOException;

	public abstract MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException;

	public abstract void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionregistrylite)
		throws IOException;

	public abstract int readInt32()
		throws IOException;

	public abstract long readInt64()
		throws IOException;

	public abstract MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionregistrylite)
		throws IOException;

	public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionregistrylite)
		throws IOException;

	public abstract byte readRawByte()
		throws IOException;

	public abstract byte[] readRawBytes(int i)
		throws IOException;

	public abstract int readRawLittleEndian32()
		throws IOException;

	public abstract long readRawLittleEndian64()
		throws IOException;

	public abstract int readRawVarint32()
		throws IOException;

	public abstract long readRawVarint64()
		throws IOException;

	abstract long readRawVarint64SlowPath()
		throws IOException;

	public abstract int readSFixed32()
		throws IOException;

	public abstract long readSFixed64()
		throws IOException;

	public abstract int readSInt32()
		throws IOException;

	public abstract long readSInt64()
		throws IOException;

	public abstract String readString()
		throws IOException;

	public abstract String readStringRequireUtf8()
		throws IOException;

	public abstract int readTag()
		throws IOException;

	public abstract int readUInt32()
		throws IOException;

	public abstract long readUInt64()
		throws IOException;

	public abstract void readUnknownGroup(int i, MessageLite.Builder builder)
		throws IOException;

	public abstract void resetSizeCounter();

	public final int setRecursionLimit(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            31
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Recursion limit cannot be negative: ").append(i).toString());
	//    2    4:new             #165 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #246 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #247 <Method void StringBuilder()>
	//    7   15:ldc1            #249 <String "Recursion limit cannot be negative: ">
	//    8   17:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:iload_1         
	//   10   21:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   12   27:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   13   30:athrow          
		} else
		{
			int j = recursionLimit;
	//   14   31:aload_0         
	//   15   32:getfield        #48  <Field int recursionLimit>
	//   16   35:istore_2        
			recursionLimit = i;
	//   17   36:aload_0         
	//   18   37:iload_1         
	//   19   38:putfield        #48  <Field int recursionLimit>
			return j;
	//   20   41:iload_2         
	//   21   42:ireturn         
		}
	}

	public final int setSizeLimit(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            32
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Size limit cannot be negative: ").append(i).toString());
	//    2    4:new             #165 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:new             #246 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #247 <Method void StringBuilder()>
	//    7   15:ldc2            #265 <String "Size limit cannot be negative: ">
	//    8   18:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:iload_1         
	//   10   22:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #259 <Method String StringBuilder.toString()>
	//   12   28:invokespecial   #262 <Method void IllegalArgumentException(String)>
	//   13   31:athrow          
		} else
		{
			int j = sizeLimit;
	//   14   32:aload_0         
	//   15   33:getfield        #50  <Field int sizeLimit>
	//   16   36:istore_2        
			sizeLimit = i;
	//   17   37:aload_0         
	//   18   38:iload_1         
	//   19   39:putfield        #50  <Field int sizeLimit>
			return j;
	//   20   42:iload_2         
	//   21   43:ireturn         
		}
	}

	final boolean shouldDiscardUnknownFields()
	{
		return explicitDiscardUnknownFields;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean explicitDiscardUnknownFields>
	//    2    4:ireturn         
	}

	final boolean shouldDiscardUnknownFieldsProto3()
	{
		if(explicitDiscardUnknownFields)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean explicitDiscardUnknownFields>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		else
			return proto3DiscardUnknownFieldsDefault;
	//    5    9:getstatic       #42  <Field boolean proto3DiscardUnknownFieldsDefault>
	//    6   12:ireturn         
	}

	public abstract boolean skipField(int i)
		throws IOException;

	public abstract boolean skipField(int i, CodedOutputStream codedoutputstream)
		throws IOException;

	public abstract void skipMessage()
		throws IOException;

	public abstract void skipMessage(CodedOutputStream codedoutputstream)
		throws IOException;

	public abstract void skipRawBytes(int i)
		throws IOException;

	final void unsetDiscardUnknownFields()
	{
		explicitDiscardUnknownFields = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #52  <Field boolean explicitDiscardUnknownFields>
	//    3    5:return          
	}

	private static final int DEFAULT_BUFFER_SIZE = 4096;
	private static final int DEFAULT_RECURSION_LIMIT = 100;
	private static final int DEFAULT_SIZE_LIMIT = 0x7fffffff;
	private static volatile boolean proto3DiscardUnknownFieldsDefault = false;
	private boolean explicitDiscardUnknownFields;
	int recursionDepth;
	int recursionLimit;
	int sizeLimit;

	static 
	{
		proto3DiscardUnknownFieldsDefault = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #42  <Field boolean proto3DiscardUnknownFieldsDefault>
	//*   2    4:return          
	}
}
