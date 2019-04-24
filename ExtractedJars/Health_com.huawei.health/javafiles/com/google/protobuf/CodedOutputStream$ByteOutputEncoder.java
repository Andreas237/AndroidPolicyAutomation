// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			CodedOutputStream, ByteOutput, ByteString, MessageLite, 
//			Utf8, WireFormat

static final class CodedOutputStream$ByteOutputEncoder extends coder
{

	private void doFlush()
		throws IOException
	{
		out.write(buffer, 0, position);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ByteOutput out>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field byte[] buffer>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int position>
	//    7   13:invokevirtual   #41  <Method void ByteOutput.write(byte[], int, int)>
		position = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #35  <Field int position>
	//   11   21:return          
	}

	private void flushIfNotAvailable(int i)
		throws IOException
	{
		if(limit - position < i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field int limit>
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field int position>
	//*   4    8:isub            
	//*   5    9:iload_1         
	//*   6   10:icmpge          17
			doFlush();
	//    7   13:aload_0         
	//    8   14:invokespecial   #48  <Method void doFlush()>
	//    9   17:return          
	}

	public void flush()
		throws IOException
	{
		if(position > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int position>
	//*   2    4:ifle            11
			doFlush();
	//    3    7:aload_0         
	//    4    8:invokespecial   #48  <Method void doFlush()>
	//    5   11:return          
	}

	public void write(byte byte0)
		throws IOException
	{
		if(position == limit)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int position>
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field int limit>
	//*   4    8:icmpne          15
			doFlush();
	//    5   11:aload_0         
	//    6   12:invokespecial   #48  <Method void doFlush()>
		buffer(byte0);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokevirtual   #52  <Method void buffer(byte)>
	//   10   20:return          
	}

	public void write(ByteBuffer bytebuffer)
		throws IOException
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method void flush()>
		int i = bytebuffer.remaining();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method int ByteBuffer.remaining()>
	//    4    8:istore_2        
		out.write(bytebuffer);
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field ByteOutput out>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #63  <Method void ByteOutput.write(ByteBuffer)>
		totalBytesWritten = totalBytesWritten + i;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #66  <Field int totalBytesWritten>
	//   12   22:iload_2         
	//   13   23:iadd            
	//   14   24:putfield        #66  <Field int totalBytesWritten>
	//   15   27:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method void flush()>
		out.write(abyte0, i, j);
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ByteOutput out>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #41  <Method void ByteOutput.write(byte[], int, int)>
		totalBytesWritten = totalBytesWritten + j;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #66  <Field int totalBytesWritten>
	//   11   19:iload_3         
	//   12   20:iadd            
	//   13   21:putfield        #66  <Field int totalBytesWritten>
	//   14   24:return          
	}

	public void writeBool(int i, boolean flag)
		throws IOException
	{
		flushIfNotAvailable(11);
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
		if(flag)
	//*   7   12:iload_2         
	//*   8   13:ifeq            21
			i = 1;
	//    9   16:iconst_1        
	//   10   17:istore_1        
		else
	//*  11   18:goto            23
			i = 0;
	//   12   21:iconst_0        
	//   13   22:istore_1        
		buffer((byte)i);
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:int2byte        
	//   17   26:invokevirtual   #52  <Method void buffer(byte)>
	//   18   29:return          
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
	//    6    6:invokevirtual   #79  <Method void writeByteArray(int, byte[], int, int)>
	//    7    9:return          
	}

	public void writeByteArray(int i, byte abyte0[], int j, int k)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
		writeByteArrayNoTag(abyte0, j, k);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokevirtual   #85  <Method void writeByteArrayNoTag(byte[], int, int)>
	//    9   14:return          
	}

	public void writeByteArrayNoTag(byte abyte0[], int i, int j)
		throws IOException
	{
		writeUInt32NoTag(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
		write(abyte0, i, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #89  <Method void write(byte[], int, int)>
	//    8   12:return          
	}

	public void writeByteBuffer(int i, ByteBuffer bytebuffer)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
		writeUInt32NoTag(bytebuffer.capacity());
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #94  <Method int ByteBuffer.capacity()>
	//    7   11:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
		writeRawBytes(bytebuffer);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #97  <Method void writeRawBytes(ByteBuffer)>
	//   11   19:return          
	}

	public void writeBytes(int i, ByteString bytestring)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
		writeBytesNoTag(bytestring);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #103 <Method void writeBytesNoTag(ByteString)>
	//    7   11:return          
	}

	public void writeBytesNoTag(ByteString bytestring)
		throws IOException
	{
		writeUInt32NoTag(bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #108 <Method int ByteString.size()>
	//    3    5:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
		bytestring.writeTo(((ByteOutput) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #112 <Method void ByteString.writeTo(ByteOutput)>
	//    7   13:return          
	}

	public void writeFixed32(int i, int j)
		throws IOException
	{
		flushIfNotAvailable(14);
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 5);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_5        
	//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
		bufferFixed32NoTag(j);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokevirtual   #116 <Method void bufferFixed32NoTag(int)>
	//   10   17:return          
	}

	public void writeFixed32NoTag(int i)
		throws IOException
	{
		flushIfNotAvailable(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferFixed32NoTag(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #116 <Method void bufferFixed32NoTag(int)>
	//    6   10:return          
	}

	public void writeFixed64(int i, long l)
		throws IOException
	{
		flushIfNotAvailable(18);
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 1);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_1        
	//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
		bufferFixed64NoTag(l);
	//    7   12:aload_0         
	//    8   13:lload_2         
	//    9   14:invokevirtual   #123 <Method void bufferFixed64NoTag(long)>
	//   10   17:return          
	}

	public void writeFixed64NoTag(long l)
		throws IOException
	{
		flushIfNotAvailable(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferFixed64NoTag(l);
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:invokevirtual   #123 <Method void bufferFixed64NoTag(long)>
	//    6   11:return          
	}

	public void writeInt32(int i, int j)
		throws IOException
	{
		flushIfNotAvailable(20);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
		bufferInt32NoTag(j);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokevirtual   #128 <Method void bufferInt32NoTag(int)>
	//   10   17:return          
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
	//    4    6:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
			return;
	//    5    9:return          
		} else
		{
			writeUInt64NoTag(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #132 <Method void writeUInt64NoTag(long)>
			return;
	//   10   16:return          
		}
	}

	public void writeLazy(ByteBuffer bytebuffer)
		throws IOException
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method void flush()>
		int i = bytebuffer.remaining();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #61  <Method int ByteBuffer.remaining()>
	//    4    8:istore_2        
		out.writeLazy(bytebuffer);
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field ByteOutput out>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #135 <Method void ByteOutput.writeLazy(ByteBuffer)>
		totalBytesWritten = totalBytesWritten + i;
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #66  <Field int totalBytesWritten>
	//   12   22:iload_2         
	//   13   23:iadd            
	//   14   24:putfield        #66  <Field int totalBytesWritten>
	//   15   27:return          
	}

	public void writeLazy(byte abyte0[], int i, int j)
		throws IOException
	{
		flush();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method void flush()>
		out.writeLazy(abyte0, i, j);
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field ByteOutput out>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #137 <Method void ByteOutput.writeLazy(byte[], int, int)>
		totalBytesWritten = totalBytesWritten + j;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #66  <Field int totalBytesWritten>
	//   11   19:iload_3         
	//   12   20:iadd            
	//   13   21:putfield        #66  <Field int totalBytesWritten>
	//   14   24:return          
	}

	public void writeMessage(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
		writeMessageNoTag(messagelite);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #143 <Method void writeMessageNoTag(MessageLite)>
	//    7   11:return          
	}

	public void writeMessageNoTag(MessageLite messagelite)
		throws IOException
	{
		writeUInt32NoTag(messagelite.getSerializedSize());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #148 <Method int MessageLite.getSerializedSize()>
	//    3    7:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
		messagelite.writeTo(((CodedOutputStream) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #151 <Method void MessageLite.writeTo(CodedOutputStream)>
	//    7   17:return          
	}

	public void writeMessageSetExtension(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #155 <Method void writeUInt32(int, int)>
		writeMessage(3, messagelite);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #157 <Method void writeMessage(int, MessageLite)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #82  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeRawBytes(ByteBuffer bytebuffer)
		throws IOException
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #161 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            24
		{
			write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #165 <Method byte[] ByteBuffer.array()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #168 <Method int ByteBuffer.arrayOffset()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #94  <Method int ByteBuffer.capacity()>
	//   10   20:invokevirtual   #89  <Method void write(byte[], int, int)>
			return;
	//   11   23:return          
		} else
		{
			bytebuffer = bytebuffer.duplicate();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #172 <Method ByteBuffer ByteBuffer.duplicate()>
	//   14   28:astore_1        
			bytebuffer.clear();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #176 <Method java.nio.Buffer ByteBuffer.clear()>
	//   17   33:pop             
			write(bytebuffer);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #177 <Method void write(ByteBuffer)>
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
	//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #155 <Method void writeUInt32(int, int)>
		writeBytes(3, bytestring);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #180 <Method void writeBytes(int, ByteString)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #82  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeString(int i, String s)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #82  <Method void writeTag(int, int)>
		writeStringNoTag(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #185 <Method void writeStringNoTag(String)>
	//    7   11:return          
	}

	public void writeStringNoTag(String s)
		throws IOException
	{
		int i = s.length() * 3;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #194 <Method int String.length()>
	//    2    4:iconst_3        
	//    3    5:imul            
	//    4    6:istore_2        
		int j = computeUInt32SizeNoTag(i);
	//    5    7:iload_2         
	//    6    8:invokestatic    #198 <Method int computeUInt32SizeNoTag(int)>
	//    7   11:istore_3        
		if(j + i > limit)
	//*   8   12:iload_3         
	//*   9   13:iload_2         
	//*  10   14:iadd            
	//*  11   15:aload_0         
	//*  12   16:getfield        #46  <Field int limit>
	//*  13   19:icmple          50
		{
			byte abyte0[] = new byte[i];
	//   14   22:iload_2         
	//   15   23:newarray        byte[]
	//   16   25:astore          5
			i = Utf8.encode(((CharSequence) (s)), abyte0, 0, i);
	//   17   27:aload_1         
	//   18   28:aload           5
	//   19   30:iconst_0        
	//   20   31:iload_2         
	//   21   32:invokestatic    #204 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//   22   35:istore_2        
			writeUInt32NoTag(i);
	//   23   36:aload_0         
	//   24   37:iload_2         
	//   25   38:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
			writeLazy(abyte0, 0, i);
	//   26   41:aload_0         
	//   27   42:aload           5
	//   28   44:iconst_0        
	//   29   45:iload_2         
	//   30   46:invokevirtual   #205 <Method void writeLazy(byte[], int, int)>
			return;
	//   31   49:return          
		}
		if(j + i > limit - position)
	//*  32   50:iload_3         
	//*  33   51:iload_2         
	//*  34   52:iadd            
	//*  35   53:aload_0         
	//*  36   54:getfield        #46  <Field int limit>
	//*  37   57:aload_0         
	//*  38   58:getfield        #35  <Field int position>
	//*  39   61:isub            
	//*  40   62:icmple          69
			doFlush();
	//   41   65:aload_0         
	//   42   66:invokespecial   #48  <Method void doFlush()>
		i = position;
	//   43   69:aload_0         
	//   44   70:getfield        #35  <Field int position>
	//   45   73:istore_2        
		int k;
		try
		{
			k = computeUInt32SizeNoTag(s.length());
	//   46   74:aload_1         
	//   47   75:invokevirtual   #194 <Method int String.length()>
	//   48   78:invokestatic    #198 <Method int computeUInt32SizeNoTag(int)>
	//   49   81:istore          4
		}
	//*  50   83:iload           4
	//*  51   85:iload_3         
	//*  52   86:icmpne          157
	//*  53   89:aload_0         
	//*  54   90:iload_2         
	//*  55   91:iload           4
	//*  56   93:iadd            
	//*  57   94:putfield        #35  <Field int position>
	//*  58   97:aload_1         
	//*  59   98:aload_0         
	//*  60   99:getfield        #31  <Field byte[] buffer>
	//*  61  102:aload_0         
	//*  62  103:getfield        #35  <Field int position>
	//*  63  106:aload_0         
	//*  64  107:getfield        #46  <Field int limit>
	//*  65  110:aload_0         
	//*  66  111:getfield        #35  <Field int position>
	//*  67  114:isub            
	//*  68  115:invokestatic    #204 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//*  69  118:istore_3        
	//*  70  119:aload_0         
	//*  71  120:iload_2         
	//*  72  121:putfield        #35  <Field int position>
	//*  73  124:iload_3         
	//*  74  125:iload_2         
	//*  75  126:isub            
	//*  76  127:iload           4
	//*  77  129:isub            
	//*  78  130:istore          4
	//*  79  132:aload_0         
	//*  80  133:iload           4
	//*  81  135:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
	//*  82  138:aload_0         
	//*  83  139:iload_3         
	//*  84  140:putfield        #35  <Field int position>
	//*  85  143:aload_0         
	//*  86  144:aload_0         
	//*  87  145:getfield        #66  <Field int totalBytesWritten>
	//*  88  148:iload           4
	//*  89  150:iadd            
	//*  90  151:putfield        #66  <Field int totalBytesWritten>
	//*  91  154:goto            194
	//*  92  157:aload_1         
	//*  93  158:invokestatic    #212 <Method int Utf8.encodedLength(CharSequence)>
	//*  94  161:istore_3        
	//*  95  162:aload_0         
	//*  96  163:iload_3         
	//*  97  164:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
	//*  98  167:aload_0         
	//*  99  168:aload_1         
	//* 100  169:aload_0         
	//* 101  170:getfield        #31  <Field byte[] buffer>
	//* 102  173:aload_0         
	//* 103  174:getfield        #35  <Field int position>
	//* 104  177:iload_3         
	//* 105  178:invokestatic    #204 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//* 106  181:putfield        #35  <Field int position>
	//* 107  184:aload_0         
	//* 108  185:aload_0         
	//* 109  186:getfield        #66  <Field int totalBytesWritten>
	//* 110  189:iload_3         
	//* 111  190:iadd            
	//* 112  191:putfield        #66  <Field int totalBytesWritten>
	//* 113  194:return          
		catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
	//* 114  195:astore          5
		{
			totalBytesWritten = totalBytesWritten - (position - i);
	//  115  197:aload_0         
	//  116  198:aload_0         
	//  117  199:getfield        #66  <Field int totalBytesWritten>
	//  118  202:aload_0         
	//  119  203:getfield        #35  <Field int position>
	//  120  206:iload_2         
	//  121  207:isub            
	//  122  208:isub            
	//  123  209:putfield        #66  <Field int totalBytesWritten>
			position = i;
	//  124  212:aload_0         
	//  125  213:iload_2         
	//  126  214:putfield        #35  <Field int position>
			inefficientWriteStringNoTag(s, unpairedsurrogateexception);
	//  127  217:aload_0         
	//  128  218:aload_1         
	//  129  219:aload           5
	//  130  221:invokevirtual   #216 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
			return;
	//  131  224:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 132  225:astore_1        
		{
			throw new n(((Throwable) (s)));
	//  133  226:new             #218 <Class CodedOutputStream$OutOfSpaceException>
	//  134  229:dup             
	//  135  230:aload_1         
	//  136  231:invokespecial   #221 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//  137  234:athrow          
		}
		if(k != j)
			break MISSING_BLOCK_LABEL_157;
		position = i + k;
		j = Utf8.encode(((CharSequence) (s)), buffer, position, limit - position);
		position = i;
		k = j - i - k;
		bufferUInt32NoTag(k);
		position = j;
		totalBytesWritten = totalBytesWritten + k;
		break MISSING_BLOCK_LABEL_194;
		j = Utf8.encodedLength(((CharSequence) (s)));
		bufferUInt32NoTag(j);
		position = Utf8.encode(((CharSequence) (s)), buffer, position, j);
		totalBytesWritten = totalBytesWritten + j;
	}

	public void writeTag(int i, int j)
		throws IOException
	{
		writeUInt32NoTag(WireFormat.makeTag(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #227 <Method int WireFormat.makeTag(int, int)>
	//    4    6:invokevirtual   #88  <Method void writeUInt32NoTag(int)>
	//    5    9:return          
	}

	public void writeUInt32(int i, int j)
		throws IOException
	{
		flushIfNotAvailable(20);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
		bufferUInt32NoTag(j);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
	//   10   17:return          
	}

	public void writeUInt32NoTag(int i)
		throws IOException
	{
		flushIfNotAvailable(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferUInt32NoTag(i);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokevirtual   #208 <Method void bufferUInt32NoTag(int)>
	//    6   11:return          
	}

	public void writeUInt64(int i, long l)
		throws IOException
	{
		flushIfNotAvailable(20);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #74  <Method void bufferTag(int, int)>
		bufferUInt64NoTag(l);
	//    7   12:aload_0         
	//    8   13:lload_2         
	//    9   14:invokevirtual   #231 <Method void bufferUInt64NoTag(long)>
	//   10   17:return          
	}

	public void writeUInt64NoTag(long l)
		throws IOException
	{
		flushIfNotAvailable(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #70  <Method void flushIfNotAvailable(int)>
		bufferUInt64NoTag(l);
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:invokevirtual   #231 <Method void bufferUInt64NoTag(long)>
	//    6   11:return          
	}

	private final ByteOutput out;

	CodedOutputStream$ByteOutputEncoder(ByteOutput byteoutput, int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #14  <Method void CodedOutputStream$AbstractBufferedEncoder(int)>
		if(byteoutput == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
		{
			throw new NullPointerException("out");
	//    5    9:new             #16  <Class NullPointerException>
	//    6   12:dup             
	//    7   13:ldc1            #17  <String "out">
	//    8   15:invokespecial   #20  <Method void NullPointerException(String)>
	//    9   18:athrow          
		} else
		{
			out = byteoutput;
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:putfield        #22  <Field ByteOutput out>
			return;
	//   13   24:return          
		}
	}
}
