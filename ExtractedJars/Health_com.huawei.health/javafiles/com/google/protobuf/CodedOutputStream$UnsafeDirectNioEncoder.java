// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.*;

// Referenced classes of package com.google.protobuf:
//			CodedOutputStream, UnsafeUtil, ByteString, MessageLite, 
//			Utf8, WireFormat

static final class CodedOutputStream$UnsafeDirectNioEncoder extends CodedOutputStream
{

	private int bufferPos(long l)
	{
		return (int)(l - address);
	//    0    0:lload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field long address>
	//    3    5:lsub            
	//    4    6:l2i             
	//    5    7:ireturn         
	}

	static boolean isSupported()
	{
		return UnsafeUtil.hasUnsafeByteBufferOperations();
	//    0    0:invokestatic    #70  <Method boolean UnsafeUtil.hasUnsafeByteBufferOperations()>
	//    1    3:ireturn         
	}

	private void repositionBuffer(long l)
	{
		buffer.position(bufferPos(l));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer buffer>
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #74  <Method int bufferPos(long)>
	//    5    9:invokevirtual   #77  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void flush()
	{
		originalBuffer.position(bufferPos(position));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ByteBuffer originalBuffer>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field long position>
	//    5    9:invokespecial   #74  <Method int bufferPos(long)>
	//    6   12:invokevirtual   #77  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    7   15:pop             
	//    8   16:return          
	}

	public int getTotalBytesWritten()
	{
		return (int)(position - initialPosition);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field long position>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field long initialPosition>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	public int spaceLeft()
	{
		return (int)(limit - position);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field long limit>
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field long position>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	public void write(byte byte0)
		throws IOException
	{
		if(position >= limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field long position>
	//*   2    4:aload_0         
	//*   3    5:getfield        #56  <Field long limit>
	//*   4    8:lcmp            
	//*   5    9:iflt            56
		{
			throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(1)
			}));
	//    6   12:new             #87  <Class CodedOutputStream$OutOfSpaceException>
	//    7   15:dup             
	//    8   16:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//    9   18:iconst_3        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_0         
	//   14   25:getfield        #62  <Field long position>
	//   15   28:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_1        
	//   19   34:aload_0         
	//   20   35:getfield        #56  <Field long limit>
	//   21   38:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_2        
	//   25   44:iconst_1        
	//   26   45:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   27   48:aastore         
	//   28   49:invokestatic    #108 <Method String String.format(String, Object[])>
	//   29   52:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
	//   30   55:athrow          
		} else
		{
			long l = position;
	//   31   56:aload_0         
	//   32   57:getfield        #62  <Field long position>
	//   33   60:lstore_2        
			position = 1L + l;
	//   34   61:aload_0         
	//   35   62:lconst_1        
	//   36   63:lload_2         
	//   37   64:ladd            
	//   38   65:putfield        #62  <Field long position>
			UnsafeUtil.putByte(l, byte0);
	//   39   68:lload_2         
	//   40   69:iload_1         
	//   41   70:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
			return;
	//   42   73:return          
		}
	}

	public void write(ByteBuffer bytebuffer)
		throws IOException
	{
		try
		{
			int i = bytebuffer.remaining();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #121 <Method int ByteBuffer.remaining()>
	//    2    4:istore_2        
			repositionBuffer(position);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #62  <Field long position>
	//    6   10:invokespecial   #123 <Method void repositionBuffer(long)>
			buffer.put(bytebuffer);
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field ByteBuffer buffer>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #127 <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//   11   21:pop             
			position = position + (long)i;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #62  <Field long position>
	//   15   27:iload_2         
	//   16   28:i2l             
	//   17   29:ladd            
	//   18   30:putfield        #62  <Field long position>
			return;
	//   19   33:return          
		}
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*  20   34:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (bytebuffer)));
	//   21   35:new             #87  <Class CodedOutputStream$OutOfSpaceException>
	//   22   38:dup             
	//   23   39:aload_1         
	//   24   40:invokespecial   #130 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   25   43:athrow          
		}
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(abyte0 == null || i < 0 || j < 0 || abyte0.length - j < i || limit - (long)j < position)
	//*   0    0:aload_1         
	//*   1    1:ifnull          35
	//*   2    4:iload_2         
	//*   3    5:iflt            35
	//*   4    8:iload_3         
	//*   5    9:iflt            35
	//*   6   12:aload_1         
	//*   7   13:arraylength     
	//*   8   14:iload_3         
	//*   9   15:isub            
	//*  10   16:iload_2         
	//*  11   17:icmplt          35
	//*  12   20:aload_0         
	//*  13   21:getfield        #56  <Field long limit>
	//*  14   24:iload_3         
	//*  15   25:i2l             
	//*  16   26:lsub            
	//*  17   27:aload_0         
	//*  18   28:getfield        #62  <Field long position>
	//*  19   31:lcmp            
	//*  20   32:ifge            93
		{
			if(abyte0 == null)
	//*  21   35:aload_1         
	//*  22   36:ifnonnull       49
				throw new NullPointerException("value");
	//   23   39:new             #133 <Class NullPointerException>
	//   24   42:dup             
	//   25   43:ldc1            #135 <String "value">
	//   26   45:invokespecial   #136 <Method void NullPointerException(String)>
	//   27   48:athrow          
			else
				throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(j)
				}));
	//   28   49:new             #87  <Class CodedOutputStream$OutOfSpaceException>
	//   29   52:dup             
	//   30   53:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//   31   55:iconst_3        
	//   32   56:anewarray       Object[]
	//   33   59:dup             
	//   34   60:iconst_0        
	//   35   61:aload_0         
	//   36   62:getfield        #62  <Field long position>
	//   37   65:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   38   68:aastore         
	//   39   69:dup             
	//   40   70:iconst_1        
	//   41   71:aload_0         
	//   42   72:getfield        #56  <Field long limit>
	//   43   75:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   44   78:aastore         
	//   45   79:dup             
	//   46   80:iconst_2        
	//   47   81:iload_3         
	//   48   82:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   49   85:aastore         
	//   50   86:invokestatic    #108 <Method String String.format(String, Object[])>
	//   51   89:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
	//   52   92:athrow          
		} else
		{
			UnsafeUtil.copyMemory(abyte0, i, position, j);
	//   53   93:aload_1         
	//   54   94:iload_2         
	//   55   95:i2l             
	//   56   96:aload_0         
	//   57   97:getfield        #62  <Field long position>
	//   58  100:iload_3         
	//   59  101:i2l             
	//   60  102:invokestatic    #140 <Method void UnsafeUtil.copyMemory(byte[], long, long, long)>
			position = position + (long)j;
	//   61  105:aload_0         
	//   62  106:aload_0         
	//   63  107:getfield        #62  <Field long position>
	//   64  110:iload_3         
	//   65  111:i2l             
	//   66  112:ladd            
	//   67  113:putfield        #62  <Field long position>
			return;
	//   68  116:return          
		}
	}

	public void writeBool(int i, boolean flag)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		if(flag)
	//*   4    6:iload_2         
	//*   5    7:ifeq            15
			i = 1;
	//    6   10:iconst_1        
	//    7   11:istore_1        
		else
	//*   8   12:goto            17
			i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_1        
		write((byte)i);
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:int2byte        
	//   14   20:invokevirtual   #148 <Method void write(byte)>
	//   15   23:return          
	}

	public void writeByteArray(int i, byte abyte0[])
		throws IOException
	{
		writeByteArray(i, abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:aload_2         
	//    5    5:arraylength     
	//    6    6:invokevirtual   #153 <Method void writeByteArray(int, byte[], int, int)>
	//    7    9:return          
	}

	public void writeByteArray(int i, byte abyte0[], int j, int k)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeByteArrayNoTag(abyte0, j, k);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokevirtual   #156 <Method void writeByteArrayNoTag(byte[], int, int)>
	//    9   14:return          
	}

	public void writeByteArrayNoTag(byte abyte0[], int i, int j)
		throws IOException
	{
		writeUInt32NoTag(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		write(abyte0, i, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #162 <Method void write(byte[], int, int)>
	//    8   12:return          
	}

	public void writeByteBuffer(int i, ByteBuffer bytebuffer)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeUInt32NoTag(bytebuffer.capacity());
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #167 <Method int ByteBuffer.capacity()>
	//    7   11:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		writeRawBytes(bytebuffer);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #170 <Method void writeRawBytes(ByteBuffer)>
	//   11   19:return          
	}

	public void writeBytes(int i, ByteString bytestring)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeBytesNoTag(bytestring);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #176 <Method void writeBytesNoTag(ByteString)>
	//    7   11:return          
	}

	public void writeBytesNoTag(ByteString bytestring)
		throws IOException
	{
		writeUInt32NoTag(bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #181 <Method int ByteString.size()>
	//    3    5:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		bytestring.writeTo(((ByteOutput) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #185 <Method void ByteString.writeTo(ByteOutput)>
	//    7   13:return          
	}

	public void writeFixed32(int i, int j)
		throws IOException
	{
		writeTag(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeFixed32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #189 <Method void writeFixed32NoTag(int)>
	//    7   11:return          
	}

	public void writeFixed32NoTag(int i)
		throws IOException
	{
		buffer.putInt(bufferPos(position), i);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer buffer>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field long position>
	//    5    9:invokespecial   #74  <Method int bufferPos(long)>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #193 <Method ByteBuffer ByteBuffer.putInt(int, int)>
	//    8   16:pop             
		position = position + 4L;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field long position>
	//   12   22:ldc2w           #194 <Long 4L>
	//   13   25:ladd            
	//   14   26:putfield        #62  <Field long position>
	//   15   29:return          
	}

	public void writeFixed64(int i, long l)
		throws IOException
	{
		writeTag(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeFixed64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #200 <Method void writeFixed64NoTag(long)>
	//    7   11:return          
	}

	public void writeFixed64NoTag(long l)
		throws IOException
	{
		buffer.putLong(bufferPos(position), l);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer buffer>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field long position>
	//    5    9:invokespecial   #74  <Method int bufferPos(long)>
	//    6   12:lload_1         
	//    7   13:invokevirtual   #204 <Method ByteBuffer ByteBuffer.putLong(int, long)>
	//    8   16:pop             
		position = position + 8L;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #62  <Field long position>
	//   12   22:ldc2w           #205 <Long 8L>
	//   13   25:ladd            
	//   14   26:putfield        #62  <Field long position>
	//   15   29:return          
	}

	public void writeInt32(int i, int j)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #210 <Method void writeInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeInt32NoTag(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			writeUInt32NoTag(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
			return;
	//    5    9:return          
		} else
		{
			writeUInt64NoTag(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #213 <Method void writeUInt64NoTag(long)>
			return;
	//   10   16:return          
		}
	}

	public void writeLazy(ByteBuffer bytebuffer)
		throws IOException
	{
		write(bytebuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #216 <Method void write(ByteBuffer)>
	//    3    5:return          
	}

	public void writeLazy(byte abyte0[], int i, int j)
		throws IOException
	{
		write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #162 <Method void write(byte[], int, int)>
	//    5    7:return          
	}

	public void writeMessage(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeMessageNoTag(messagelite);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #222 <Method void writeMessageNoTag(MessageLite)>
	//    7   11:return          
	}

	public void writeMessageNoTag(MessageLite messagelite)
		throws IOException
	{
		writeUInt32NoTag(messagelite.getSerializedSize());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #227 <Method int MessageLite.getSerializedSize()>
	//    3    7:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
		messagelite.writeTo(((CodedOutputStream) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #230 <Method void MessageLite.writeTo(CodedOutputStream)>
	//    7   17:return          
	}

	public void writeMessageSetExtension(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #234 <Method void writeUInt32(int, int)>
		writeMessage(3, messagelite);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #236 <Method void writeMessage(int, MessageLite)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #146 <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeRawBytes(ByteBuffer bytebuffer)
		throws IOException
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #239 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            24
		{
			write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #243 <Method byte[] ByteBuffer.array()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #246 <Method int ByteBuffer.arrayOffset()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #167 <Method int ByteBuffer.capacity()>
	//   10   20:invokevirtual   #162 <Method void write(byte[], int, int)>
			return;
	//   11   23:return          
		} else
		{
			bytebuffer = bytebuffer.duplicate();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
	//   14   28:astore_1        
			bytebuffer.clear();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #250 <Method java.nio.Buffer ByteBuffer.clear()>
	//   17   33:pop             
			write(bytebuffer);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #216 <Method void write(ByteBuffer)>
			return;
	//   21   39:return          
		}
	}

	public void writeRawMessageSetExtension(int i, ByteString bytestring)
		throws IOException
	{
		writeTag(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #234 <Method void writeUInt32(int, int)>
		writeBytes(3, bytestring);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #253 <Method void writeBytes(int, ByteString)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #146 <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeString(int i, String s)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeStringNoTag(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #258 <Method void writeStringNoTag(String)>
	//    7   11:return          
	}

	public void writeStringNoTag(String s)
		throws IOException
	{
		long l = position;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field long position>
	//    2    4:lstore          4
		int i;
		int j;
		try
		{
			i = computeUInt32SizeNoTag(s.length() * 3);
	//    3    6:aload_1         
	//    4    7:invokevirtual   #267 <Method int String.length()>
	//    5   10:iconst_3        
	//    6   11:imul            
	//    7   12:invokestatic    #271 <Method int computeUInt32SizeNoTag(int)>
	//    8   15:istore_2        
			j = computeUInt32SizeNoTag(s.length());
	//    9   16:aload_1         
	//   10   17:invokevirtual   #267 <Method int String.length()>
	//   11   20:invokestatic    #271 <Method int computeUInt32SizeNoTag(int)>
	//   12   23:istore_3        
		}
	//*  13   24:iload_3         
	//*  14   25:iload_2         
	//*  15   26:icmpne          86
	//*  16   29:aload_0         
	//*  17   30:aload_0         
	//*  18   31:getfield        #62  <Field long position>
	//*  19   34:invokespecial   #74  <Method int bufferPos(long)>
	//*  20   37:iload_3         
	//*  21   38:iadd            
	//*  22   39:istore_2        
	//*  23   40:aload_0         
	//*  24   41:getfield        #39  <Field ByteBuffer buffer>
	//*  25   44:iload_2         
	//*  26   45:invokevirtual   #77  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  27   48:pop             
	//*  28   49:aload_1         
	//*  29   50:aload_0         
	//*  30   51:getfield        #39  <Field ByteBuffer buffer>
	//*  31   54:invokestatic    #277 <Method void Utf8.encodeUtf8(CharSequence, ByteBuffer)>
	//*  32   57:aload_0         
	//*  33   58:getfield        #39  <Field ByteBuffer buffer>
	//*  34   61:invokevirtual   #50  <Method int ByteBuffer.position()>
	//*  35   64:iload_2         
	//*  36   65:isub            
	//*  37   66:istore_2        
	//*  38   67:aload_0         
	//*  39   68:iload_2         
	//*  40   69:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
	//*  41   72:aload_0         
	//*  42   73:aload_0         
	//*  43   74:getfield        #62  <Field long position>
	//*  44   77:iload_2         
	//*  45   78:i2l             
	//*  46   79:ladd            
	//*  47   80:putfield        #62  <Field long position>
	//*  48   83:goto            123
	//*  49   86:aload_1         
	//*  50   87:invokestatic    #281 <Method int Utf8.encodedLength(CharSequence)>
	//*  51   90:istore_2        
	//*  52   91:aload_0         
	//*  53   92:iload_2         
	//*  54   93:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
	//*  55   96:aload_0         
	//*  56   97:aload_0         
	//*  57   98:getfield        #62  <Field long position>
	//*  58  101:invokespecial   #123 <Method void repositionBuffer(long)>
	//*  59  104:aload_1         
	//*  60  105:aload_0         
	//*  61  106:getfield        #39  <Field ByteBuffer buffer>
	//*  62  109:invokestatic    #277 <Method void Utf8.encodeUtf8(CharSequence, ByteBuffer)>
	//*  63  112:aload_0         
	//*  64  113:aload_0         
	//*  65  114:getfield        #62  <Field long position>
	//*  66  117:iload_2         
	//*  67  118:i2l             
	//*  68  119:ladd            
	//*  69  120:putfield        #62  <Field long position>
	//*  70  123:return          
		catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
	//*  71  124:astore          6
		{
			position = l;
	//   72  126:aload_0         
	//   73  127:lload           4
	//   74  129:putfield        #62  <Field long position>
			repositionBuffer(position);
	//   75  132:aload_0         
	//   76  133:aload_0         
	//   77  134:getfield        #62  <Field long position>
	//   78  137:invokespecial   #123 <Method void repositionBuffer(long)>
			inefficientWriteStringNoTag(s, unpairedsurrogateexception);
	//   79  140:aload_0         
	//   80  141:aload_1         
	//   81  142:aload           6
	//   82  144:invokevirtual   #285 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
			return;
	//   83  147:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  84  148:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (s)));
	//   85  149:new             #87  <Class CodedOutputStream$OutOfSpaceException>
	//   86  152:dup             
	//   87  153:aload_1         
	//   88  154:invokespecial   #130 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   89  157:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  90  158:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (s)));
	//   91  159:new             #87  <Class CodedOutputStream$OutOfSpaceException>
	//   92  162:dup             
	//   93  163:aload_1         
	//   94  164:invokespecial   #130 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   95  167:athrow          
		}
		if(j != i)
			break MISSING_BLOCK_LABEL_86;
		i = bufferPos(position) + j;
		buffer.position(i);
		Utf8.encodeUtf8(((CharSequence) (s)), buffer);
		i = buffer.position() - i;
		writeUInt32NoTag(i);
		position = position + (long)i;
		break MISSING_BLOCK_LABEL_123;
		i = Utf8.encodedLength(((CharSequence) (s)));
		writeUInt32NoTag(i);
		repositionBuffer(position);
		Utf8.encodeUtf8(((CharSequence) (s)), buffer);
		position = position + (long)i;
	}

	public void writeTag(int i, int j)
		throws IOException
	{
		writeUInt32NoTag(WireFormat.makeTag(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #291 <Method int WireFormat.makeTag(int, int)>
	//    4    6:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
	//    5    9:return          
	}

	public void writeUInt32(int i, int j)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeUInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #160 <Method void writeUInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeUInt32NoTag(int i)
		throws IOException
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(position <= oneVarintLimit)
	//*   2    2:aload_0         
	//*   3    3:getfield        #62  <Field long position>
	//*   4    6:aload_0         
	//*   5    7:getfield        #60  <Field long oneVarintLimit>
	//*   6   10:lcmp            
	//*   7   11:ifgt            73
			do
			{
				if((i & 0xffffff80) == 0)
	//*   8   14:iload_1         
	//*   9   15:bipush          -128
	//*  10   17:iand            
	//*  11   18:ifne            40
				{
					long l = position;
	//   12   21:aload_0         
	//   13   22:getfield        #62  <Field long position>
	//   14   25:lstore_3        
					position = 1L + l;
	//   15   26:aload_0         
	//   16   27:lconst_1        
	//   17   28:lload_3         
	//   18   29:ladd            
	//   19   30:putfield        #62  <Field long position>
					UnsafeUtil.putByte(l, (byte)i);
	//   20   33:lload_3         
	//   21   34:iload_1         
	//   22   35:int2byte        
	//   23   36:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
					return;
	//   24   39:return          
				}
				long l1 = position;
	//   25   40:aload_0         
	//   26   41:getfield        #62  <Field long position>
	//   27   44:lstore_3        
				position = 1L + l1;
	//   28   45:aload_0         
	//   29   46:lconst_1        
	//   30   47:lload_3         
	//   31   48:ladd            
	//   32   49:putfield        #62  <Field long position>
				UnsafeUtil.putByte(l1, (byte)(i & 0x7f | 0x80));
	//   33   52:lload_3         
	//   34   53:iload_1         
	//   35   54:bipush          127
	//   36   56:iand            
	//   37   57:sipush          128
	//   38   60:ior             
	//   39   61:int2byte        
	//   40   62:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
				i >>>= 7;
	//   41   65:iload_1         
	//   42   66:bipush          7
	//   43   68:iushr           
	//   44   69:istore_1        
			} while(true);
	//   45   70:goto            14
		while(position < limit) 
	//*  46   73:aload_0         
	//*  47   74:getfield        #62  <Field long position>
	//*  48   77:aload_0         
	//*  49   78:getfield        #56  <Field long limit>
	//*  50   81:lcmp            
	//*  51   82:ifge            144
		{
			if((j & 0xffffff80) == 0)
	//*  52   85:iload_2         
	//*  53   86:bipush          -128
	//*  54   88:iand            
	//*  55   89:ifne            111
			{
				long l2 = position;
	//   56   92:aload_0         
	//   57   93:getfield        #62  <Field long position>
	//   58   96:lstore_3        
				position = 1L + l2;
	//   59   97:aload_0         
	//   60   98:lconst_1        
	//   61   99:lload_3         
	//   62  100:ladd            
	//   63  101:putfield        #62  <Field long position>
				UnsafeUtil.putByte(l2, (byte)j);
	//   64  104:lload_3         
	//   65  105:iload_2         
	//   66  106:int2byte        
	//   67  107:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
				return;
	//   68  110:return          
			}
			long l3 = position;
	//   69  111:aload_0         
	//   70  112:getfield        #62  <Field long position>
	//   71  115:lstore_3        
			position = 1L + l3;
	//   72  116:aload_0         
	//   73  117:lconst_1        
	//   74  118:lload_3         
	//   75  119:ladd            
	//   76  120:putfield        #62  <Field long position>
			UnsafeUtil.putByte(l3, (byte)(j & 0x7f | 0x80));
	//   77  123:lload_3         
	//   78  124:iload_2         
	//   79  125:bipush          127
	//   80  127:iand            
	//   81  128:sipush          128
	//   82  131:ior             
	//   83  132:int2byte        
	//   84  133:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
			j >>>= 7;
	//   85  136:iload_2         
	//   86  137:bipush          7
	//   87  139:iushr           
	//   88  140:istore_2        
		}
	//*  89  141:goto            73
		throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
			Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(1)
		}));
	//   90  144:new             #87  <Class CodedOutputStream$OutOfSpaceException>
	//   91  147:dup             
	//   92  148:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//   93  150:iconst_3        
	//   94  151:anewarray       Object[]
	//   95  154:dup             
	//   96  155:iconst_0        
	//   97  156:aload_0         
	//   98  157:getfield        #62  <Field long position>
	//   99  160:invokestatic    #97  <Method Long Long.valueOf(long)>
	//  100  163:aastore         
	//  101  164:dup             
	//  102  165:iconst_1        
	//  103  166:aload_0         
	//  104  167:getfield        #56  <Field long limit>
	//  105  170:invokestatic    #97  <Method Long Long.valueOf(long)>
	//  106  173:aastore         
	//  107  174:dup             
	//  108  175:iconst_2        
	//  109  176:iconst_1        
	//  110  177:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//  111  180:aastore         
	//  112  181:invokestatic    #108 <Method String String.format(String, Object[])>
	//  113  184:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
	//  114  187:athrow          
	}

	public void writeUInt64(int i, long l)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #146 <Method void writeTag(int, int)>
		writeUInt64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #213 <Method void writeUInt64NoTag(long)>
	//    7   11:return          
	}

	public void writeUInt64NoTag(long l)
		throws IOException
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(position <= oneVarintLimit)
	//*   2    2:aload_0         
	//*   3    3:getfield        #62  <Field long position>
	//*   4    6:aload_0         
	//*   5    7:getfield        #60  <Field long oneVarintLimit>
	//*   6   10:lcmp            
	//*   7   11:ifgt            78
			do
			{
				if((-128L & l) == 0L)
	//*   8   14:ldc2w           #293 <Long -128L>
	//*   9   17:lload_1         
	//*  10   18:land            
	//*  11   19:lconst_0        
	//*  12   20:lcmp            
	//*  13   21:ifne            44
				{
					l1 = position;
	//   14   24:aload_0         
	//   15   25:getfield        #62  <Field long position>
	//   16   28:lstore_3        
					position = 1L + l1;
	//   17   29:aload_0         
	//   18   30:lconst_1        
	//   19   31:lload_3         
	//   20   32:ladd            
	//   21   33:putfield        #62  <Field long position>
					UnsafeUtil.putByte(l1, (byte)(int)l);
	//   22   36:lload_3         
	//   23   37:lload_1         
	//   24   38:l2i             
	//   25   39:int2byte        
	//   26   40:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
					return;
	//   27   43:return          
				}
				l1 = position;
	//   28   44:aload_0         
	//   29   45:getfield        #62  <Field long position>
	//   30   48:lstore_3        
				position = 1L + l1;
	//   31   49:aload_0         
	//   32   50:lconst_1        
	//   33   51:lload_3         
	//   34   52:ladd            
	//   35   53:putfield        #62  <Field long position>
				UnsafeUtil.putByte(l1, (byte)((int)l & 0x7f | 0x80));
	//   36   56:lload_3         
	//   37   57:lload_1         
	//   38   58:l2i             
	//   39   59:bipush          127
	//   40   61:iand            
	//   41   62:sipush          128
	//   42   65:ior             
	//   43   66:int2byte        
	//   44   67:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
				l >>>= 7;
	//   45   70:lload_1         
	//   46   71:bipush          7
	//   47   73:lushr           
	//   48   74:lstore_1        
			} while(true);
	//   49   75:goto            14
		while(position < limit) 
	//*  50   78:aload_0         
	//*  51   79:getfield        #62  <Field long position>
	//*  52   82:aload_0         
	//*  53   83:getfield        #56  <Field long limit>
	//*  54   86:lcmp            
	//*  55   87:ifge            154
		{
			if((-128L & l1) == 0L)
	//*  56   90:ldc2w           #293 <Long -128L>
	//*  57   93:lload_3         
	//*  58   94:land            
	//*  59   95:lconst_0        
	//*  60   96:lcmp            
	//*  61   97:ifne            120
			{
				l = position;
	//   62  100:aload_0         
	//   63  101:getfield        #62  <Field long position>
	//   64  104:lstore_1        
				position = 1L + l;
	//   65  105:aload_0         
	//   66  106:lconst_1        
	//   67  107:lload_1         
	//   68  108:ladd            
	//   69  109:putfield        #62  <Field long position>
				UnsafeUtil.putByte(l, (byte)(int)l1);
	//   70  112:lload_1         
	//   71  113:lload_3         
	//   72  114:l2i             
	//   73  115:int2byte        
	//   74  116:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
				return;
	//   75  119:return          
			}
			l = position;
	//   76  120:aload_0         
	//   77  121:getfield        #62  <Field long position>
	//   78  124:lstore_1        
			position = 1L + l;
	//   79  125:aload_0         
	//   80  126:lconst_1        
	//   81  127:lload_1         
	//   82  128:ladd            
	//   83  129:putfield        #62  <Field long position>
			UnsafeUtil.putByte(l, (byte)((int)l1 & 0x7f | 0x80));
	//   84  132:lload_1         
	//   85  133:lload_3         
	//   86  134:l2i             
	//   87  135:bipush          127
	//   88  137:iand            
	//   89  138:sipush          128
	//   90  141:ior             
	//   91  142:int2byte        
	//   92  143:invokestatic    #115 <Method void UnsafeUtil.putByte(long, byte)>
			l1 >>>= 7;
	//   93  146:lload_3         
	//   94  147:bipush          7
	//   95  149:lushr           
	//   96  150:lstore_3        
		}
	//*  97  151:goto            78
		throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
			Long.valueOf(position), Long.valueOf(limit), Integer.valueOf(1)
		}));
	//   98  154:new             #87  <Class CodedOutputStream$OutOfSpaceException>
	//   99  157:dup             
	//  100  158:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//  101  160:iconst_3        
	//  102  161:anewarray       Object[]
	//  103  164:dup             
	//  104  165:iconst_0        
	//  105  166:aload_0         
	//  106  167:getfield        #62  <Field long position>
	//  107  170:invokestatic    #97  <Method Long Long.valueOf(long)>
	//  108  173:aastore         
	//  109  174:dup             
	//  110  175:iconst_1        
	//  111  176:aload_0         
	//  112  177:getfield        #56  <Field long limit>
	//  113  180:invokestatic    #97  <Method Long Long.valueOf(long)>
	//  114  183:aastore         
	//  115  184:dup             
	//  116  185:iconst_2        
	//  117  186:iconst_1        
	//  118  187:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//  119  190:aastore         
	//  120  191:invokestatic    #108 <Method String String.format(String, Object[])>
	//  121  194:invokespecial   #111 <Method void CodedOutputStream$OutOfSpaceException(String)>
	//  122  197:athrow          
	}

	private final long address;
	private final ByteBuffer buffer;
	private final long initialPosition;
	private final long limit;
	private final long oneVarintLimit;
	private final ByteBuffer originalBuffer;
	private long position;

	CodedOutputStream$UnsafeDirectNioEncoder(ByteBuffer bytebuffer)
	{
		super(((CodedOutputStream._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #19  <Method void CodedOutputStream(CodedOutputStream$1)>
		originalBuffer = bytebuffer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field ByteBuffer originalBuffer>
		buffer = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
	//    9   15:getstatic       #33  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   18:invokevirtual   #37  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   21:putfield        #39  <Field ByteBuffer buffer>
		address = UnsafeUtil.addressOffset(bytebuffer);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokestatic    #45  <Method long UnsafeUtil.addressOffset(ByteBuffer)>
	//   15   29:putfield        #47  <Field long address>
		initialPosition = address + (long)bytebuffer.position();
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field long address>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #50  <Method int ByteBuffer.position()>
	//   21   41:i2l             
	//   22   42:ladd            
	//   23   43:putfield        #52  <Field long initialPosition>
		limit = address + (long)bytebuffer.limit();
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #47  <Field long address>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #54  <Method int ByteBuffer.limit()>
	//   29   55:i2l             
	//   30   56:ladd            
	//   31   57:putfield        #56  <Field long limit>
		oneVarintLimit = limit - 10L;
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getfield        #56  <Field long limit>
	//   35   65:ldc2w           #57  <Long 10L>
	//   36   68:lsub            
	//   37   69:putfield        #60  <Field long oneVarintLimit>
		position = initialPosition;
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #52  <Field long initialPosition>
	//   41   77:putfield        #62  <Field long position>
	//   42   80:return          
	}
}
