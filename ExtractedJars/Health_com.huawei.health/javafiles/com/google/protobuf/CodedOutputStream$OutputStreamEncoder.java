// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			CodedOutputStream, ByteString, MessageLite, Utf8, 
//			WireFormat

static final class CodedOutputStream$OutputStreamEncoder extends der
{

	private void doFlush()
		throws IOException
	{
		out.write(buffer, 0, position);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field OutputStream out>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field byte[] buffer>
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int position>
	//    7   13:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
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
		int i = bytebuffer.remaining();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #59  <Method int ByteBuffer.remaining()>
	//    2    4:istore_2        
		if(limit - position >= i)
	//*   3    5:aload_0         
	//*   4    6:getfield        #46  <Field int limit>
	//*   5    9:aload_0         
	//*   6   10:getfield        #35  <Field int position>
	//*   7   13:isub            
	//*   8   14:iload_2         
	//*   9   15:icmplt          53
		{
			bytebuffer.get(buffer, position, i);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #31  <Field byte[] buffer>
	//   13   23:aload_0         
	//   14   24:getfield        #35  <Field int position>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   17   31:pop             
			position = position + i;
	//   18   32:aload_0         
	//   19   33:aload_0         
	//   20   34:getfield        #35  <Field int position>
	//   21   37:iload_2         
	//   22   38:iadd            
	//   23   39:putfield        #35  <Field int position>
			totalBytesWritten = totalBytesWritten + i;
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:getfield        #66  <Field int totalBytesWritten>
	//   27   47:iload_2         
	//   28   48:iadd            
	//   29   49:putfield        #66  <Field int totalBytesWritten>
			return;
	//   30   52:return          
		}
		int j = limit - position;
	//   31   53:aload_0         
	//   32   54:getfield        #46  <Field int limit>
	//   33   57:aload_0         
	//   34   58:getfield        #35  <Field int position>
	//   35   61:isub            
	//   36   62:istore_3        
		bytebuffer.get(buffer, position, j);
	//   37   63:aload_1         
	//   38   64:aload_0         
	//   39   65:getfield        #31  <Field byte[] buffer>
	//   40   68:aload_0         
	//   41   69:getfield        #35  <Field int position>
	//   42   72:iload_3         
	//   43   73:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   44   76:pop             
		i -= j;
	//   45   77:iload_2         
	//   46   78:iload_3         
	//   47   79:isub            
	//   48   80:istore_2        
		position = limit;
	//   49   81:aload_0         
	//   50   82:aload_0         
	//   51   83:getfield        #46  <Field int limit>
	//   52   86:putfield        #35  <Field int position>
		totalBytesWritten = totalBytesWritten + j;
	//   53   89:aload_0         
	//   54   90:aload_0         
	//   55   91:getfield        #66  <Field int totalBytesWritten>
	//   56   94:iload_3         
	//   57   95:iadd            
	//   58   96:putfield        #66  <Field int totalBytesWritten>
		doFlush();
	//   59   99:aload_0         
	//   60  100:invokespecial   #48  <Method void doFlush()>
		while(i > limit) 
	//*  61  103:iload_2         
	//*  62  104:aload_0         
	//*  63  105:getfield        #46  <Field int limit>
	//*  64  108:icmple          164
		{
			bytebuffer.get(buffer, 0, limit);
	//   65  111:aload_1         
	//   66  112:aload_0         
	//   67  113:getfield        #31  <Field byte[] buffer>
	//   68  116:iconst_0        
	//   69  117:aload_0         
	//   70  118:getfield        #46  <Field int limit>
	//   71  121:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   72  124:pop             
			out.write(buffer, 0, limit);
	//   73  125:aload_0         
	//   74  126:getfield        #22  <Field OutputStream out>
	//   75  129:aload_0         
	//   76  130:getfield        #31  <Field byte[] buffer>
	//   77  133:iconst_0        
	//   78  134:aload_0         
	//   79  135:getfield        #46  <Field int limit>
	//   80  138:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
			i -= limit;
	//   81  141:iload_2         
	//   82  142:aload_0         
	//   83  143:getfield        #46  <Field int limit>
	//   84  146:isub            
	//   85  147:istore_2        
			totalBytesWritten = totalBytesWritten + limit;
	//   86  148:aload_0         
	//   87  149:aload_0         
	//   88  150:getfield        #66  <Field int totalBytesWritten>
	//   89  153:aload_0         
	//   90  154:getfield        #46  <Field int limit>
	//   91  157:iadd            
	//   92  158:putfield        #66  <Field int totalBytesWritten>
		}
	//*  93  161:goto            103
		bytebuffer.get(buffer, 0, i);
	//   94  164:aload_1         
	//   95  165:aload_0         
	//   96  166:getfield        #31  <Field byte[] buffer>
	//   97  169:iconst_0        
	//   98  170:iload_2         
	//   99  171:invokevirtual   #63  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//  100  174:pop             
		position = i;
	//  101  175:aload_0         
	//  102  176:iload_2         
	//  103  177:putfield        #35  <Field int position>
		totalBytesWritten = totalBytesWritten + i;
	//  104  180:aload_0         
	//  105  181:aload_0         
	//  106  182:getfield        #66  <Field int totalBytesWritten>
	//  107  185:iload_2         
	//  108  186:iadd            
	//  109  187:putfield        #66  <Field int totalBytesWritten>
	//  110  190:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(limit - position >= j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field int limit>
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field int position>
	//*   4    8:isub            
	//*   5    9:iload_3         
	//*   6   10:icmplt          48
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #31  <Field byte[] buffer>
	//   11   19:aload_0         
	//   12   20:getfield        #35  <Field int position>
	//   13   23:iload_3         
	//   14   24:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			position = position + j;
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #35  <Field int position>
	//   18   32:iload_3         
	//   19   33:iadd            
	//   20   34:putfield        #35  <Field int position>
			totalBytesWritten = totalBytesWritten + j;
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:getfield        #66  <Field int totalBytesWritten>
	//   24   42:iload_3         
	//   25   43:iadd            
	//   26   44:putfield        #66  <Field int totalBytesWritten>
			return;
	//   27   47:return          
		}
		int k = limit - position;
	//   28   48:aload_0         
	//   29   49:getfield        #46  <Field int limit>
	//   30   52:aload_0         
	//   31   53:getfield        #35  <Field int position>
	//   32   56:isub            
	//   33   57:istore          4
		System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, k);
	//   34   59:aload_1         
	//   35   60:iload_2         
	//   36   61:aload_0         
	//   37   62:getfield        #31  <Field byte[] buffer>
	//   38   65:aload_0         
	//   39   66:getfield        #35  <Field int position>
	//   40   69:iload           4
	//   41   71:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
		i += k;
	//   42   74:iload_2         
	//   43   75:iload           4
	//   44   77:iadd            
	//   45   78:istore_2        
		j -= k;
	//   46   79:iload_3         
	//   47   80:iload           4
	//   48   82:isub            
	//   49   83:istore_3        
		position = limit;
	//   50   84:aload_0         
	//   51   85:aload_0         
	//   52   86:getfield        #46  <Field int limit>
	//   53   89:putfield        #35  <Field int position>
		totalBytesWritten = totalBytesWritten + k;
	//   54   92:aload_0         
	//   55   93:aload_0         
	//   56   94:getfield        #66  <Field int totalBytesWritten>
	//   57   97:iload           4
	//   58   99:iadd            
	//   59  100:putfield        #66  <Field int totalBytesWritten>
		doFlush();
	//   60  103:aload_0         
	//   61  104:invokespecial   #48  <Method void doFlush()>
		if(j <= limit)
	//*  62  107:iload_3         
	//*  63  108:aload_0         
	//*  64  109:getfield        #46  <Field int limit>
	//*  65  112:icmpgt          134
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), 0, j);
	//   66  115:aload_1         
	//   67  116:iload_2         
	//   68  117:aload_0         
	//   69  118:getfield        #31  <Field byte[] buffer>
	//   70  121:iconst_0        
	//   71  122:iload_3         
	//   72  123:invokestatic    #72  <Method void System.arraycopy(Object, int, Object, int, int)>
			position = j;
	//   73  126:aload_0         
	//   74  127:iload_3         
	//   75  128:putfield        #35  <Field int position>
		} else
	//*  76  131:goto            144
		{
			out.write(abyte0, i, j);
	//   77  134:aload_0         
	//   78  135:getfield        #22  <Field OutputStream out>
	//   79  138:aload_1         
	//   80  139:iload_2         
	//   81  140:iload_3         
	//   82  141:invokevirtual   #41  <Method void OutputStream.write(byte[], int, int)>
		}
		totalBytesWritten = totalBytesWritten + j;
	//   83  144:aload_0         
	//   84  145:aload_0         
	//   85  146:getfield        #66  <Field int totalBytesWritten>
	//   86  149:iload_3         
	//   87  150:iadd            
	//   88  151:putfield        #66  <Field int totalBytesWritten>
	//   89  154:return          
	}

	public void writeBool(int i, boolean flag)
		throws IOException
	{
		flushIfNotAvailable(11);
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
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
	//    6    6:invokevirtual   #85  <Method void writeByteArray(int, byte[], int, int)>
	//    7    9:return          
	}

	public void writeByteArray(int i, byte abyte0[], int j, int k)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
		writeByteArrayNoTag(abyte0, j, k);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokevirtual   #91  <Method void writeByteArrayNoTag(byte[], int, int)>
	//    9   14:return          
	}

	public void writeByteArrayNoTag(byte abyte0[], int i, int j)
		throws IOException
	{
		writeUInt32NoTag(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
		write(abyte0, i, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:invokevirtual   #95  <Method void write(byte[], int, int)>
	//    8   12:return          
	}

	public void writeByteBuffer(int i, ByteBuffer bytebuffer)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
		writeUInt32NoTag(bytebuffer.capacity());
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #100 <Method int ByteBuffer.capacity()>
	//    7   11:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
		writeRawBytes(bytebuffer);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #103 <Method void writeRawBytes(ByteBuffer)>
	//   11   19:return          
	}

	public void writeBytes(int i, ByteString bytestring)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
		writeBytesNoTag(bytestring);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #109 <Method void writeBytesNoTag(ByteString)>
	//    7   11:return          
	}

	public void writeBytesNoTag(ByteString bytestring)
		throws IOException
	{
		writeUInt32NoTag(bytestring.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method int ByteString.size()>
	//    3    5:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
		bytestring.writeTo(((ByteOutput) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #118 <Method void ByteString.writeTo(ByteOutput)>
	//    7   13:return          
	}

	public void writeFixed32(int i, int j)
		throws IOException
	{
		flushIfNotAvailable(14);
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 5);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_5        
	//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
		bufferFixed32NoTag(j);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokevirtual   #122 <Method void bufferFixed32NoTag(int)>
	//   10   17:return          
	}

	public void writeFixed32NoTag(int i)
		throws IOException
	{
		flushIfNotAvailable(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferFixed32NoTag(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #122 <Method void bufferFixed32NoTag(int)>
	//    6   10:return          
	}

	public void writeFixed64(int i, long l)
		throws IOException
	{
		flushIfNotAvailable(18);
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 1);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_1        
	//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
		bufferFixed64NoTag(l);
	//    7   12:aload_0         
	//    8   13:lload_2         
	//    9   14:invokevirtual   #129 <Method void bufferFixed64NoTag(long)>
	//   10   17:return          
	}

	public void writeFixed64NoTag(long l)
		throws IOException
	{
		flushIfNotAvailable(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferFixed64NoTag(l);
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:invokevirtual   #129 <Method void bufferFixed64NoTag(long)>
	//    6   11:return          
	}

	public void writeInt32(int i, int j)
		throws IOException
	{
		flushIfNotAvailable(20);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
		bufferInt32NoTag(j);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokevirtual   #134 <Method void bufferInt32NoTag(int)>
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
	//    4    6:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
			return;
	//    5    9:return          
		} else
		{
			writeUInt64NoTag(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #138 <Method void writeUInt64NoTag(long)>
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
	//    2    2:invokevirtual   #141 <Method void write(ByteBuffer)>
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
	//    4    4:invokevirtual   #95  <Method void write(byte[], int, int)>
	//    5    7:return          
	}

	public void writeMessage(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
		writeMessageNoTag(messagelite);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #147 <Method void writeMessageNoTag(MessageLite)>
	//    7   11:return          
	}

	public void writeMessageNoTag(MessageLite messagelite)
		throws IOException
	{
		writeUInt32NoTag(messagelite.getSerializedSize());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #152 <Method int MessageLite.getSerializedSize()>
	//    3    7:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
		messagelite.writeTo(((CodedOutputStream) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #155 <Method void MessageLite.writeTo(CodedOutputStream)>
	//    7   17:return          
	}

	public void writeMessageSetExtension(int i, MessageLite messagelite)
		throws IOException
	{
		writeTag(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #159 <Method void writeUInt32(int, int)>
		writeMessage(3, messagelite);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #161 <Method void writeMessage(int, MessageLite)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #88  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeRawBytes(ByteBuffer bytebuffer)
		throws IOException
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #165 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            24
		{
			write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #169 <Method byte[] ByteBuffer.array()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #172 <Method int ByteBuffer.arrayOffset()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #100 <Method int ByteBuffer.capacity()>
	//   10   20:invokevirtual   #95  <Method void write(byte[], int, int)>
			return;
	//   11   23:return          
		} else
		{
			bytebuffer = bytebuffer.duplicate();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #176 <Method ByteBuffer ByteBuffer.duplicate()>
	//   14   28:astore_1        
			bytebuffer.clear();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #180 <Method java.nio.Buffer ByteBuffer.clear()>
	//   17   33:pop             
			write(bytebuffer);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #141 <Method void write(ByteBuffer)>
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
	//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
		writeUInt32(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #159 <Method void writeUInt32(int, int)>
		writeBytes(3, bytestring);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #183 <Method void writeBytes(int, ByteString)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #88  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public void writeString(int i, String s)
		throws IOException
	{
		writeTag(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #88  <Method void writeTag(int, int)>
		writeStringNoTag(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #188 <Method void writeStringNoTag(String)>
	//    7   11:return          
	}

	public void writeStringNoTag(String s)
		throws IOException
	{
		int i;
		int j;
		j = s.length() * 3;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #197 <Method int String.length()>
	//    2    4:iconst_3        
	//    3    5:imul            
	//    4    6:istore_3        
		i = computeUInt32SizeNoTag(j);
	//    5    7:iload_3         
	//    6    8:invokestatic    #201 <Method int computeUInt32SizeNoTag(int)>
	//    7   11:istore_2        
		if(i + j > limit)
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:iadd            
	//*  11   15:aload_0         
	//*  12   16:getfield        #46  <Field int limit>
	//*  13   19:icmple          50
		{
			byte abyte0[] = new byte[j];
	//   14   22:iload_3         
	//   15   23:newarray        byte[]
	//   16   25:astore          6
			i = Utf8.encode(((CharSequence) (s)), abyte0, 0, j);
	//   17   27:aload_1         
	//   18   28:aload           6
	//   19   30:iconst_0        
	//   20   31:iload_3         
	//   21   32:invokestatic    #207 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//   22   35:istore_2        
			writeUInt32NoTag(i);
	//   23   36:aload_0         
	//   24   37:iload_2         
	//   25   38:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
			writeLazy(abyte0, 0, i);
	//   26   41:aload_0         
	//   27   42:aload           6
	//   28   44:iconst_0        
	//   29   45:iload_2         
	//   30   46:invokevirtual   #209 <Method void writeLazy(byte[], int, int)>
			return;
	//   31   49:return          
		}
		int k;
		if(i + j > limit - position)
	//*  32   50:iload_2         
	//*  33   51:iload_3         
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
		k = computeUInt32SizeNoTag(s.length());
	//   43   69:aload_1         
	//   44   70:invokevirtual   #197 <Method int String.length()>
	//   45   73:invokestatic    #201 <Method int computeUInt32SizeNoTag(int)>
	//   46   76:istore          4
		j = position;
	//   47   78:aload_0         
	//   48   79:getfield        #35  <Field int position>
	//   49   82:istore_3        
		if(k != i)
			break MISSING_BLOCK_LABEL_147;
	//   50   83:iload           4
	//   51   85:iload_2         
	//   52   86:icmpne          147
		int l;
		position = j + k;
	//   53   89:aload_0         
	//   54   90:iload_3         
	//   55   91:iload           4
	//   56   93:iadd            
	//   57   94:putfield        #35  <Field int position>
		l = Utf8.encode(((CharSequence) (s)), buffer, position, limit - position);
	//   58   97:aload_1         
	//   59   98:aload_0         
	//   60   99:getfield        #31  <Field byte[] buffer>
	//   61  102:aload_0         
	//   62  103:getfield        #35  <Field int position>
	//   63  106:aload_0         
	//   64  107:getfield        #46  <Field int limit>
	//   65  110:aload_0         
	//   66  111:getfield        #35  <Field int position>
	//   67  114:isub            
	//   68  115:invokestatic    #207 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//   69  118:istore          5
		position = j;
	//   70  120:aload_0         
	//   71  121:iload_3         
	//   72  122:putfield        #35  <Field int position>
		i = l - j - k;
	//   73  125:iload           5
	//   74  127:iload_3         
	//   75  128:isub            
	//   76  129:iload           4
	//   77  131:isub            
	//   78  132:istore_2        
		bufferUInt32NoTag(i);
	//   79  133:aload_0         
	//   80  134:iload_2         
	//   81  135:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
		position = l;
	//   82  138:aload_0         
	//   83  139:iload           5
	//   84  141:putfield        #35  <Field int position>
		break MISSING_BLOCK_LABEL_174;
	//   85  144:goto            174
		i = Utf8.encodedLength(((CharSequence) (s)));
	//   86  147:aload_1         
	//   87  148:invokestatic    #216 <Method int Utf8.encodedLength(CharSequence)>
	//   88  151:istore_2        
		bufferUInt32NoTag(i);
	//   89  152:aload_0         
	//   90  153:iload_2         
	//   91  154:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
		position = Utf8.encode(((CharSequence) (s)), buffer, position, i);
	//   92  157:aload_0         
	//   93  158:aload_1         
	//   94  159:aload_0         
	//   95  160:getfield        #31  <Field byte[] buffer>
	//   96  163:aload_0         
	//   97  164:getfield        #35  <Field int position>
	//   98  167:iload_2         
	//   99  168:invokestatic    #207 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//  100  171:putfield        #35  <Field int position>
		totalBytesWritten = totalBytesWritten + i;
	//  101  174:aload_0         
	//  102  175:aload_0         
	//  103  176:getfield        #66  <Field int totalBytesWritten>
	//  104  179:iload_2         
	//  105  180:iadd            
	//  106  181:putfield        #66  <Field int totalBytesWritten>
		break MISSING_BLOCK_LABEL_224;
	//  107  184:goto            224
		Object obj;
		obj;
	//  108  187:astore          6
		try
		{
			totalBytesWritten = totalBytesWritten - (position - j);
	//  109  189:aload_0         
	//  110  190:aload_0         
	//  111  191:getfield        #66  <Field int totalBytesWritten>
	//  112  194:aload_0         
	//  113  195:getfield        #35  <Field int position>
	//  114  198:iload_3         
	//  115  199:isub            
	//  116  200:isub            
	//  117  201:putfield        #66  <Field int totalBytesWritten>
			position = j;
	//  118  204:aload_0         
	//  119  205:iload_3         
	//  120  206:putfield        #35  <Field int position>
			throw obj;
	//  121  209:aload           6
	//  122  211:athrow          
		}
	//* 123  212:astore          6
	//* 124  214:new             #218 <Class CodedOutputStream$OutOfSpaceException>
	//* 125  217:dup             
	//* 126  218:aload           6
	//* 127  220:invokespecial   #221 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//* 128  223:athrow          
	//* 129  224:return          
		catch(Utf8.UnpairedSurrogateException unpairedsurrogateexception)
	//* 130  225:astore          6
		{
			inefficientWriteStringNoTag(s, unpairedsurrogateexception);
	//  131  227:aload_0         
	//  132  228:aload_1         
	//  133  229:aload           6
	//  134  231:invokevirtual   #225 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
		}
		break MISSING_BLOCK_LABEL_234;
		obj;
		throw new CodedOutputStream$OutOfSpaceException(((Throwable) (obj)));
		return;
	//  135  234:return          
	}

	public void writeTag(int i, int j)
		throws IOException
	{
		writeUInt32NoTag(WireFormat.makeTag(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #231 <Method int WireFormat.makeTag(int, int)>
	//    4    6:invokevirtual   #94  <Method void writeUInt32NoTag(int)>
	//    5    9:return          
	}

	public void writeUInt32(int i, int j)
		throws IOException
	{
		flushIfNotAvailable(20);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
		bufferUInt32NoTag(j);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
	//   10   17:return          
	}

	public void writeUInt32NoTag(int i)
		throws IOException
	{
		flushIfNotAvailable(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferUInt32NoTag(i);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:invokevirtual   #212 <Method void bufferUInt32NoTag(int)>
	//    6   11:return          
	}

	public void writeUInt64(int i, long l)
		throws IOException
	{
		flushIfNotAvailable(20);
	//    0    0:aload_0         
	//    1    1:bipush          20
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferTag(i, 0);
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #80  <Method void bufferTag(int, int)>
		bufferUInt64NoTag(l);
	//    7   12:aload_0         
	//    8   13:lload_2         
	//    9   14:invokevirtual   #235 <Method void bufferUInt64NoTag(long)>
	//   10   17:return          
	}

	public void writeUInt64NoTag(long l)
		throws IOException
	{
		flushIfNotAvailable(10);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:invokespecial   #76  <Method void flushIfNotAvailable(int)>
		bufferUInt64NoTag(l);
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:invokevirtual   #235 <Method void bufferUInt64NoTag(long)>
	//    6   11:return          
	}

	private final OutputStream out;

	CodedOutputStream$OutputStreamEncoder(OutputStream outputstream, int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #14  <Method void CodedOutputStream$AbstractBufferedEncoder(int)>
		if(outputstream == null)
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
			out = outputstream;
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:putfield        #22  <Field OutputStream out>
			return;
	//   13   24:return          
		}
	}
}
