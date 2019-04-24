// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.*;

// Referenced classes of package com.google.protobuf:
//			CodedOutputStream, Utf8, ByteString, MessageLite, 
//			WireFormat

static final class CodedOutputStream$SafeDirectNioEncoder extends CodedOutputStream
{

	private void encode(String s)
		throws IOException
	{
		try
		{
			Utf8.encodeUtf8(((CharSequence) (s)), buffer);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field ByteBuffer buffer>
	//    3    5:invokestatic    #54  <Method void Utf8.encodeUtf8(CharSequence, ByteBuffer)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    9:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (s)));
	//    6   10:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   10   18:athrow          
		}
	}

	public void flush()
	{
		originalBuffer.position(buffer.position());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ByteBuffer originalBuffer>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field ByteBuffer buffer>
	//    4    8:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    5   11:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    6   14:pop             
	//    7   15:return          
	}

	public int getTotalBytesWritten()
	{
		return buffer.position() - initialPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field int initialPosition>
	//    5   11:isub            
	//    6   12:ireturn         
	}

	public int spaceLeft()
	{
		return buffer.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:invokevirtual   #70  <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	public void write(byte byte0)
		throws IOException
	{
		try
		{
			buffer.put(byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   11   19:athrow          
		}
	}

	public void write(ByteBuffer bytebuffer)
		throws IOException
	{
		try
		{
			buffer.put(bytebuffer);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method ByteBuffer ByteBuffer.put(ByteBuffer)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*   6   10:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (bytebuffer)));
	//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   11   19:athrow          
		}
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		try
		{
			buffer.put(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #85  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    6   10:pop             
			return;
	//    7   11:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   8   12:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (abyte0)));
	//    9   13:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//   10   16:dup             
	//   11   17:aload_1         
	//   12   18:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   13   21:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  14   22:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (abyte0)));
	//   15   23:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//   16   26:dup             
	//   17   27:aload_1         
	//   18   28:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   19   31:athrow          
		}
	}

	public void writeBool(int i, boolean flag)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
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
	//   14   20:invokevirtual   #93  <Method void write(byte)>
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
	//    6    6:invokevirtual   #98  <Method void writeByteArray(int, byte[], int, int)>
	//    7    9:return          
	}

	public void writeByteArray(int i, byte abyte0[], int j, int k)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeByteArrayNoTag(abyte0, j, k);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokevirtual   #101 <Method void writeByteArrayNoTag(byte[], int, int)>
	//    9   14:return          
	}

	public void writeByteArrayNoTag(byte abyte0[], int i, int j)
		throws IOException
	{
		writeUInt32NoTag(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		write(abyte0, i, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #107 <Method void write(byte[], int, int)>
	//    8   12:return          
	}

	public void writeByteBuffer(int i, ByteBuffer bytebuffer)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeUInt32NoTag(bytebuffer.capacity());
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #112 <Method int ByteBuffer.capacity()>
	//    7   11:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		writeRawBytes(bytebuffer);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #115 <Method void writeRawBytes(ByteBuffer)>
	//   11   19:return          
	}

	public void writeBytes(int i, ByteString bytestring)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeBytesNoTag(bytestring);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #121 <Method void writeBytesNoTag(ByteString)>
	//    7   11:return          
	}

	public void writeBytesNoTag(ByteString bytestring)
		throws IOException
	{
		writeUInt32NoTag(bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #126 <Method int ByteString.size()>
	//    3    5:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		bytestring.writeTo(((ByteOutput) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #130 <Method void ByteString.writeTo(ByteOutput)>
	//    7   13:return          
	}

	public void writeFixed32(int i, int j)
		throws IOException
	{
		writeTag(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeFixed32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #134 <Method void writeFixed32NoTag(int)>
	//    7   11:return          
	}

	public void writeFixed32NoTag(int i)
		throws IOException
	{
		try
		{
			buffer.putInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #138 <Method ByteBuffer ByteBuffer.putInt(int)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   11   19:athrow          
		}
	}

	public void writeFixed64(int i, long l)
		throws IOException
	{
		writeTag(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeFixed64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #144 <Method void writeFixed64NoTag(long)>
	//    7   11:return          
	}

	public void writeFixed64NoTag(long l)
		throws IOException
	{
		try
		{
			buffer.putLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #148 <Method ByteBuffer ByteBuffer.putLong(long)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_3        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   11   19:athrow          
		}
	}

	public void writeInt32(int i, int j)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #152 <Method void writeInt32NoTag(int)>
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
	//    4    6:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
			return;
	//    5    9:return          
		} else
		{
			writeUInt64NoTag(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #155 <Method void writeUInt64NoTag(long)>
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
	//    2    2:invokevirtual   #158 <Method void write(ByteBuffer)>
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
	//    4    4:invokevirtual   #107 <Method void write(byte[], int, int)>
	//    5    7:return          
	}

	public void writeMessage(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeMessageNoTag(messagelite);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #164 <Method void writeMessageNoTag(MessageLite)>
	//    7   11:return          
	}

	public void writeMessageNoTag(MessageLite messagelite)
		throws IOException
	{
		writeUInt32NoTag(messagelite.getSerializedSize());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #169 <Method int MessageLite.getSerializedSize()>
	//    3    7:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		messagelite.writeTo(((CodedOutputStream) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #172 <Method void MessageLite.writeTo(CodedOutputStream)>
	//    7   17:return          
	}

	public void writeMessageSetExtension(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #176 <Method void writeUInt32(int, int)>
		writeMessage(3, messagelite);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #178 <Method void writeMessage(int, MessageLite)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeRawBytes(ByteBuffer bytebuffer)
		throws IOException
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #182 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            24
		{
			write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #186 <Method byte[] ByteBuffer.array()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #189 <Method int ByteBuffer.arrayOffset()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #112 <Method int ByteBuffer.capacity()>
	//   10   20:invokevirtual   #107 <Method void write(byte[], int, int)>
			return;
	//   11   23:return          
		} else
		{
			bytebuffer = bytebuffer.duplicate();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
	//   14   28:astore_1        
			bytebuffer.clear();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #193 <Method java.nio.Buffer ByteBuffer.clear()>
	//   17   33:pop             
			write(bytebuffer);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #158 <Method void write(ByteBuffer)>
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
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #176 <Method void writeUInt32(int, int)>
		writeBytes(3, bytestring);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #196 <Method void writeBytes(int, ByteString)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeString(int i, String s)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeStringNoTag(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #201 <Method void writeStringNoTag(String)>
	//    7   11:return          
	}

	public void writeStringNoTag(String s)
		throws IOException
	{
		int i = buffer.position();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer buffer>
	//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    3    7:istore_2        
		int j;
		int k;
		try
		{
			j = computeUInt32SizeNoTag(s.length() * 3);
	//    4    8:aload_1         
	//    5    9:invokevirtual   #210 <Method int String.length()>
	//    6   12:iconst_3        
	//    7   13:imul            
	//    8   14:invokestatic    #214 <Method int computeUInt32SizeNoTag(int)>
	//    9   17:istore_3        
			k = computeUInt32SizeNoTag(s.length());
	//   10   18:aload_1         
	//   11   19:invokevirtual   #210 <Method int String.length()>
	//   12   22:invokestatic    #214 <Method int computeUInt32SizeNoTag(int)>
	//   13   25:istore          4
		}
	//*  14   27:iload           4
	//*  15   29:iload_3         
	//*  16   30:icmpne          97
	//*  17   33:aload_0         
	//*  18   34:getfield        #35  <Field ByteBuffer buffer>
	//*  19   37:invokevirtual   #39  <Method int ByteBuffer.position()>
	//*  20   40:iload           4
	//*  21   42:iadd            
	//*  22   43:istore_3        
	//*  23   44:aload_0         
	//*  24   45:getfield        #35  <Field ByteBuffer buffer>
	//*  25   48:iload_3         
	//*  26   49:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  27   52:pop             
	//*  28   53:aload_0         
	//*  29   54:aload_1         
	//*  30   55:invokespecial   #216 <Method void encode(String)>
	//*  31   58:aload_0         
	//*  32   59:getfield        #35  <Field ByteBuffer buffer>
	//*  33   62:invokevirtual   #39  <Method int ByteBuffer.position()>
	//*  34   65:istore          4
	//*  35   67:aload_0         
	//*  36   68:getfield        #35  <Field ByteBuffer buffer>
	//*  37   71:iload_2         
	//*  38   72:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  39   75:pop             
	//*  40   76:aload_0         
	//*  41   77:iload           4
	//*  42   79:iload_3         
	//*  43   80:isub            
	//*  44   81:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
	//*  45   84:aload_0         
	//*  46   85:getfield        #35  <Field ByteBuffer buffer>
	//*  47   88:iload           4
	//*  48   90:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  49   93:pop             
	//*  50   94:goto            110
	//*  51   97:aload_0         
	//*  52   98:aload_1         
	//*  53   99:invokestatic    #220 <Method int Utf8.encodedLength(CharSequence)>
	//*  54  102:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
	//*  55  105:aload_0         
	//*  56  106:aload_1         
	//*  57  107:invokespecial   #216 <Method void encode(String)>
	//*  58  110:return          
		catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
	//*  59  111:astore          5
		{
			buffer.position(i);
	//   60  113:aload_0         
	//   61  114:getfield        #35  <Field ByteBuffer buffer>
	//   62  117:iload_2         
	//   63  118:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   64  121:pop             
			inefficientWriteStringNoTag(s, unpairedsurrogateexception);
	//   65  122:aload_0         
	//   66  123:aload_1         
	//   67  124:aload           5
	//   68  126:invokevirtual   #224 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
			return;
	//   69  129:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  70  130:astore_1        
		{
			throw new CodedOutputStream.OutOfSpaceException(((Throwable) (s)));
	//   71  131:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//   72  134:dup             
	//   73  135:aload_1         
	//   74  136:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   75  139:athrow          
		}
		if(k != j)
			break MISSING_BLOCK_LABEL_97;
		j = buffer.position() + k;
		buffer.position(j);
		encode(s);
		k = buffer.position();
		buffer.position(i);
		writeUInt32NoTag(k - j);
		buffer.position(k);
		break MISSING_BLOCK_LABEL_110;
		writeUInt32NoTag(Utf8.encodedLength(((CharSequence) (s))));
		encode(s);
	}

	public void writeTag(int i, int j)
		throws IOException
	{
		writeUInt32NoTag(WireFormat.makeTag(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #230 <Method int WireFormat.makeTag(int, int)>
	//    4    6:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
	//    5    9:return          
	}

	public void writeUInt32(int i, int j)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeUInt32NoTag(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
	//    7   11:return          
	}

	public void writeUInt32NoTag(int i)
		throws IOException
	{
_L1:
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            18
			try
			{
				buffer.put((byte)i);
	//    4    7:aload_0         
	//    5    8:getfield        #35  <Field ByteBuffer buffer>
	//    6   11:iload_1         
	//    7   12:int2byte        
	//    8   13:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
	//    9   16:pop             
				return;
	//   10   17:return          
			}
	//*  11   18:aload_0         
	//*  12   19:getfield        #35  <Field ByteBuffer buffer>
	//*  13   22:iload_1         
	//*  14   23:bipush          127
	//*  15   25:iand            
	//*  16   26:sipush          128
	//*  17   29:ior             
	//*  18   30:int2byte        
	//*  19   31:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
	//*  20   34:pop             
	//*  21   35:iload_1         
	//*  22   36:bipush          7
	//*  23   38:iushr           
	//*  24   39:istore_1        
	//*  25   40:goto            0
			catch(BufferOverflowException bufferoverflowexception)
	//*  26   43:astore_2        
			{
				throw new CodedOutputStream.OutOfSpaceException(((Throwable) (bufferoverflowexception)));
	//   27   44:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//   28   47:dup             
	//   29   48:aload_2         
	//   30   49:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   31   52:athrow          
			}
		buffer.put((byte)(i & 0x7f | 0x80));
		i >>>= 7;
		  goto _L1
	}

	public void writeUInt64(int i, long l)
		throws IOException
	{
		writeTag(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #91  <Method void writeTag(int, int)>
		writeUInt64NoTag(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #155 <Method void writeUInt64NoTag(long)>
	//    7   11:return          
	}

	public void writeUInt64NoTag(long l)
		throws IOException
	{
_L1:
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #232 <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            22
			try
			{
				buffer.put((byte)(int)l);
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field ByteBuffer buffer>
	//    8   14:lload_1         
	//    9   15:l2i             
	//   10   16:int2byte        
	//   11   17:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
	//   12   20:pop             
				return;
	//   13   21:return          
			}
	//*  14   22:aload_0         
	//*  15   23:getfield        #35  <Field ByteBuffer buffer>
	//*  16   26:lload_1         
	//*  17   27:l2i             
	//*  18   28:bipush          127
	//*  19   30:iand            
	//*  20   31:sipush          128
	//*  21   34:ior             
	//*  22   35:int2byte        
	//*  23   36:invokevirtual   #78  <Method ByteBuffer ByteBuffer.put(byte)>
	//*  24   39:pop             
	//*  25   40:lload_1         
	//*  26   41:bipush          7
	//*  27   43:lushr           
	//*  28   44:lstore_1        
	//*  29   45:goto            0
			catch(BufferOverflowException bufferoverflowexception)
	//*  30   48:astore_3        
			{
				throw new CodedOutputStream.OutOfSpaceException(((Throwable) (bufferoverflowexception)));
	//   31   49:new             #56  <Class CodedOutputStream$OutOfSpaceException>
	//   32   52:dup             
	//   33   53:aload_3         
	//   34   54:invokespecial   #59  <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   35   57:athrow          
			}
		buffer.put((byte)((int)l & 0x7f | 0x80));
		l >>>= 7;
		  goto _L1
	}

	private final ByteBuffer buffer;
	private final int initialPosition;
	private final ByteBuffer originalBuffer;

	CodedOutputStream$SafeDirectNioEncoder(ByteBuffer bytebuffer)
	{
		super(((CodedOutputStream._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void CodedOutputStream(CodedOutputStream$1)>
		originalBuffer = bytebuffer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #17  <Field ByteBuffer originalBuffer>
		buffer = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
	//    9   15:getstatic       #29  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   18:invokevirtual   #33  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   21:putfield        #35  <Field ByteBuffer buffer>
		initialPosition = bytebuffer.position();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #39  <Method int ByteBuffer.position()>
	//   15   29:putfield        #41  <Field int initialPosition>
	//   16   32:return          
	}
}
