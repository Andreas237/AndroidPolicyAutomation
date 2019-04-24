// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.protobuf:
//			CodedOutputStream, ByteString, MessageLite, Utf8, 
//			WireFormat, UnsafeUtil

static class CodedOutputStream$ArrayEncoder extends CodedOutputStream
{

	public void flush()
	{
	//    0    0:return          
	}

	public final int getTotalBytesWritten()
	{
		return position - offset;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int position>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field int offset>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final int spaceLeft()
	{
		return limit - position;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int limit>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int position>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public final void write(byte byte0)
		throws IOException
	{
		int i;
		byte abyte0[];
		try
		{
			abyte0 = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] buffer>
	//    2    4:astore_3        
			i = position;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field int position>
	//    5    9:istore_2        
			position = i + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #47  <Field int position>
		}
	//*  11   17:aload_3         
	//*  12   18:iload_2         
	//*  13   19:iload_1         
	//*  14   20:bastore         
	//*  15   21:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  16   22:astore_3        
		{
			throw new eption(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//   17   23:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//   18   26:dup             
	//   19   27:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//   20   29:iconst_3        
	//   21   30:anewarray       Object[]
	//   22   33:dup             
	//   23   34:iconst_0        
	//   24   35:aload_0         
	//   25   36:getfield        #47  <Field int position>
	//   26   39:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   27   42:aastore         
	//   28   43:dup             
	//   29   44:iconst_1        
	//   30   45:aload_0         
	//   31   46:getfield        #49  <Field int limit>
	//   32   49:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:iconst_2        
	//   36   55:iconst_1        
	//   37   56:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   38   59:aastore         
	//   39   60:invokestatic    #40  <Method String String.format(String, Object[])>
	//   40   63:aload_3         
	//   41   64:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
	//   42   67:athrow          
		}
		abyte0[i] = byte0;
	}

	public final void write(ByteBuffer bytebuffer)
		throws IOException
	{
		int i = bytebuffer.remaining();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method int ByteBuffer.remaining()>
	//    2    4:istore_2        
		try
		{
			bytebuffer.get(buffer, position, i);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #43  <Field byte[] buffer>
	//    6   10:aload_0         
	//    7   11:getfield        #47  <Field int position>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #79  <Method ByteBuffer ByteBuffer.get(byte[], int, int)>
	//   10   18:pop             
			position = position + i;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #47  <Field int position>
	//   14   24:iload_2         
	//   15   25:iadd            
	//   16   26:putfield        #47  <Field int position>
			return;
	//   17   29:return          
		}
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*  18   30:astore_1        
		{
			throw new eption(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(i)
			}), ((Throwable) (bytebuffer)));
	//   19   31:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//   20   34:dup             
	//   21   35:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//   22   37:iconst_3        
	//   23   38:anewarray       Object[]
	//   24   41:dup             
	//   25   42:iconst_0        
	//   26   43:aload_0         
	//   27   44:getfield        #47  <Field int position>
	//   28   47:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   29   50:aastore         
	//   30   51:dup             
	//   31   52:iconst_1        
	//   32   53:aload_0         
	//   33   54:getfield        #49  <Field int limit>
	//   34   57:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   35   60:aastore         
	//   36   61:dup             
	//   37   62:iconst_2        
	//   38   63:iload_2         
	//   39   64:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   40   67:aastore         
	//   41   68:invokestatic    #40  <Method String String.format(String, Object[])>
	//   42   71:aload_1         
	//   43   72:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
	//   44   75:athrow          
		}
	}

	public final void write(byte abyte0[], int i, int j)
		throws IOException
	{
		try
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #43  <Field byte[] buffer>
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field int position>
	//    6   10:iload_3         
	//    7   11:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
			position = position + j;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #47  <Field int position>
	//   11   19:iload_3         
	//   12   20:iadd            
	//   13   21:putfield        #47  <Field int position>
			return;
	//   14   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  15   25:astore_1        
		{
			throw new eption(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(j)
			}), ((Throwable) (abyte0)));
	//   16   26:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//   17   29:dup             
	//   18   30:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//   19   32:iconst_3        
	//   20   33:anewarray       Object[]
	//   21   36:dup             
	//   22   37:iconst_0        
	//   23   38:aload_0         
	//   24   39:getfield        #47  <Field int position>
	//   25   42:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   26   45:aastore         
	//   27   46:dup             
	//   28   47:iconst_1        
	//   29   48:aload_0         
	//   30   49:getfield        #49  <Field int limit>
	//   31   52:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   32   55:aastore         
	//   33   56:dup             
	//   34   57:iconst_2        
	//   35   58:iload_3         
	//   36   59:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   37   62:aastore         
	//   38   63:invokestatic    #40  <Method String String.format(String, Object[])>
	//   39   66:aload_1         
	//   40   67:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
	//   41   70:athrow          
		}
	}

	public final void writeBool(int i, boolean flag)
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

	public final void writeByteArray(int i, byte abyte0[])
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

	public final void writeByteArray(int i, byte abyte0[], int j, int k)
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

	public final void writeByteArrayNoTag(byte abyte0[], int i, int j)
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

	public final void writeByteBuffer(int i, ByteBuffer bytebuffer)
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

	public final void writeBytes(int i, ByteString bytestring)
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

	public final void writeBytesNoTag(ByteString bytestring)
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

	public final void writeFixed32(int i, int j)
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

	public final void writeFixed32NoTag(int i)
		throws IOException
	{
		int j;
		byte abyte0[];
		try
		{
			abyte0 = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] buffer>
	//    2    4:astore_3        
			j = position;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field int position>
	//    5    9:istore_2        
			position = j + 1;
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:putfield        #47  <Field int position>
		}
	//*  11   17:aload_3         
	//*  12   18:iload_2         
	//*  13   19:iload_1         
	//*  14   20:sipush          255
	//*  15   23:iand            
	//*  16   24:int2byte        
	//*  17   25:bastore         
	//*  18   26:aload_0         
	//*  19   27:getfield        #43  <Field byte[] buffer>
	//*  20   30:astore_3        
	//*  21   31:aload_0         
	//*  22   32:getfield        #47  <Field int position>
	//*  23   35:istore_2        
	//*  24   36:aload_0         
	//*  25   37:iload_2         
	//*  26   38:iconst_1        
	//*  27   39:iadd            
	//*  28   40:putfield        #47  <Field int position>
	//*  29   43:aload_3         
	//*  30   44:iload_2         
	//*  31   45:iload_1         
	//*  32   46:bipush          8
	//*  33   48:ishr            
	//*  34   49:sipush          255
	//*  35   52:iand            
	//*  36   53:int2byte        
	//*  37   54:bastore         
	//*  38   55:aload_0         
	//*  39   56:getfield        #43  <Field byte[] buffer>
	//*  40   59:astore_3        
	//*  41   60:aload_0         
	//*  42   61:getfield        #47  <Field int position>
	//*  43   64:istore_2        
	//*  44   65:aload_0         
	//*  45   66:iload_2         
	//*  46   67:iconst_1        
	//*  47   68:iadd            
	//*  48   69:putfield        #47  <Field int position>
	//*  49   72:aload_3         
	//*  50   73:iload_2         
	//*  51   74:iload_1         
	//*  52   75:bipush          16
	//*  53   77:ishr            
	//*  54   78:sipush          255
	//*  55   81:iand            
	//*  56   82:int2byte        
	//*  57   83:bastore         
	//*  58   84:aload_0         
	//*  59   85:getfield        #43  <Field byte[] buffer>
	//*  60   88:astore_3        
	//*  61   89:aload_0         
	//*  62   90:getfield        #47  <Field int position>
	//*  63   93:istore_2        
	//*  64   94:aload_0         
	//*  65   95:iload_2         
	//*  66   96:iconst_1        
	//*  67   97:iadd            
	//*  68   98:putfield        #47  <Field int position>
	//*  69  101:aload_3         
	//*  70  102:iload_2         
	//*  71  103:iload_1         
	//*  72  104:bipush          24
	//*  73  106:ishr            
	//*  74  107:sipush          255
	//*  75  110:iand            
	//*  76  111:int2byte        
	//*  77  112:bastore         
	//*  78  113:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  79  114:astore_3        
		{
			throw new eption(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//   80  115:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//   81  118:dup             
	//   82  119:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//   83  121:iconst_3        
	//   84  122:anewarray       Object[]
	//   85  125:dup             
	//   86  126:iconst_0        
	//   87  127:aload_0         
	//   88  128:getfield        #47  <Field int position>
	//   89  131:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   90  134:aastore         
	//   91  135:dup             
	//   92  136:iconst_1        
	//   93  137:aload_0         
	//   94  138:getfield        #49  <Field int limit>
	//   95  141:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   96  144:aastore         
	//   97  145:dup             
	//   98  146:iconst_2        
	//   99  147:iconst_1        
	//  100  148:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  101  151:aastore         
	//  102  152:invokestatic    #40  <Method String String.format(String, Object[])>
	//  103  155:aload_3         
	//  104  156:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
	//  105  159:athrow          
		}
		abyte0[j] = (byte)(i & 0xff);
		abyte0 = buffer;
		j = position;
		position = j + 1;
		abyte0[j] = (byte)(i >> 8 & 0xff);
		abyte0 = buffer;
		j = position;
		position = j + 1;
		abyte0[j] = (byte)(i >> 16 & 0xff);
		abyte0 = buffer;
		j = position;
		position = j + 1;
		abyte0[j] = (byte)(i >> 24 & 0xff);
		return;
	}

	public final void writeFixed64(int i, long l)
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
	//    6    8:invokevirtual   #140 <Method void writeFixed64NoTag(long)>
	//    7   11:return          
	}

	public final void writeFixed64NoTag(long l)
		throws IOException
	{
		int i;
		byte abyte0[];
		try
		{
			abyte0 = buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field byte[] buffer>
	//    2    4:astore          4
			i = position;
	//    3    6:aload_0         
	//    4    7:getfield        #47  <Field int position>
	//    5   10:istore_3        
			position = i + 1;
	//    6   11:aload_0         
	//    7   12:iload_3         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:putfield        #47  <Field int position>
		}
	//*  11   18:aload           4
	//*  12   20:iload_3         
	//*  13   21:lload_1         
	//*  14   22:l2i             
	//*  15   23:sipush          255
	//*  16   26:iand            
	//*  17   27:int2byte        
	//*  18   28:bastore         
	//*  19   29:aload_0         
	//*  20   30:getfield        #43  <Field byte[] buffer>
	//*  21   33:astore          4
	//*  22   35:aload_0         
	//*  23   36:getfield        #47  <Field int position>
	//*  24   39:istore_3        
	//*  25   40:aload_0         
	//*  26   41:iload_3         
	//*  27   42:iconst_1        
	//*  28   43:iadd            
	//*  29   44:putfield        #47  <Field int position>
	//*  30   47:aload           4
	//*  31   49:iload_3         
	//*  32   50:lload_1         
	//*  33   51:bipush          8
	//*  34   53:lshr            
	//*  35   54:l2i             
	//*  36   55:sipush          255
	//*  37   58:iand            
	//*  38   59:int2byte        
	//*  39   60:bastore         
	//*  40   61:aload_0         
	//*  41   62:getfield        #43  <Field byte[] buffer>
	//*  42   65:astore          4
	//*  43   67:aload_0         
	//*  44   68:getfield        #47  <Field int position>
	//*  45   71:istore_3        
	//*  46   72:aload_0         
	//*  47   73:iload_3         
	//*  48   74:iconst_1        
	//*  49   75:iadd            
	//*  50   76:putfield        #47  <Field int position>
	//*  51   79:aload           4
	//*  52   81:iload_3         
	//*  53   82:lload_1         
	//*  54   83:bipush          16
	//*  55   85:lshr            
	//*  56   86:l2i             
	//*  57   87:sipush          255
	//*  58   90:iand            
	//*  59   91:int2byte        
	//*  60   92:bastore         
	//*  61   93:aload_0         
	//*  62   94:getfield        #43  <Field byte[] buffer>
	//*  63   97:astore          4
	//*  64   99:aload_0         
	//*  65  100:getfield        #47  <Field int position>
	//*  66  103:istore_3        
	//*  67  104:aload_0         
	//*  68  105:iload_3         
	//*  69  106:iconst_1        
	//*  70  107:iadd            
	//*  71  108:putfield        #47  <Field int position>
	//*  72  111:aload           4
	//*  73  113:iload_3         
	//*  74  114:lload_1         
	//*  75  115:bipush          24
	//*  76  117:lshr            
	//*  77  118:l2i             
	//*  78  119:sipush          255
	//*  79  122:iand            
	//*  80  123:int2byte        
	//*  81  124:bastore         
	//*  82  125:aload_0         
	//*  83  126:getfield        #43  <Field byte[] buffer>
	//*  84  129:astore          4
	//*  85  131:aload_0         
	//*  86  132:getfield        #47  <Field int position>
	//*  87  135:istore_3        
	//*  88  136:aload_0         
	//*  89  137:iload_3         
	//*  90  138:iconst_1        
	//*  91  139:iadd            
	//*  92  140:putfield        #47  <Field int position>
	//*  93  143:aload           4
	//*  94  145:iload_3         
	//*  95  146:lload_1         
	//*  96  147:bipush          32
	//*  97  149:lshr            
	//*  98  150:l2i             
	//*  99  151:sipush          255
	//* 100  154:iand            
	//* 101  155:int2byte        
	//* 102  156:bastore         
	//* 103  157:aload_0         
	//* 104  158:getfield        #43  <Field byte[] buffer>
	//* 105  161:astore          4
	//* 106  163:aload_0         
	//* 107  164:getfield        #47  <Field int position>
	//* 108  167:istore_3        
	//* 109  168:aload_0         
	//* 110  169:iload_3         
	//* 111  170:iconst_1        
	//* 112  171:iadd            
	//* 113  172:putfield        #47  <Field int position>
	//* 114  175:aload           4
	//* 115  177:iload_3         
	//* 116  178:lload_1         
	//* 117  179:bipush          40
	//* 118  181:lshr            
	//* 119  182:l2i             
	//* 120  183:sipush          255
	//* 121  186:iand            
	//* 122  187:int2byte        
	//* 123  188:bastore         
	//* 124  189:aload_0         
	//* 125  190:getfield        #43  <Field byte[] buffer>
	//* 126  193:astore          4
	//* 127  195:aload_0         
	//* 128  196:getfield        #47  <Field int position>
	//* 129  199:istore_3        
	//* 130  200:aload_0         
	//* 131  201:iload_3         
	//* 132  202:iconst_1        
	//* 133  203:iadd            
	//* 134  204:putfield        #47  <Field int position>
	//* 135  207:aload           4
	//* 136  209:iload_3         
	//* 137  210:lload_1         
	//* 138  211:bipush          48
	//* 139  213:lshr            
	//* 140  214:l2i             
	//* 141  215:sipush          255
	//* 142  218:iand            
	//* 143  219:int2byte        
	//* 144  220:bastore         
	//* 145  221:aload_0         
	//* 146  222:getfield        #43  <Field byte[] buffer>
	//* 147  225:astore          4
	//* 148  227:aload_0         
	//* 149  228:getfield        #47  <Field int position>
	//* 150  231:istore_3        
	//* 151  232:aload_0         
	//* 152  233:iload_3         
	//* 153  234:iconst_1        
	//* 154  235:iadd            
	//* 155  236:putfield        #47  <Field int position>
	//* 156  239:aload           4
	//* 157  241:iload_3         
	//* 158  242:lload_1         
	//* 159  243:bipush          56
	//* 160  245:lshr            
	//* 161  246:l2i             
	//* 162  247:sipush          255
	//* 163  250:iand            
	//* 164  251:int2byte        
	//* 165  252:bastore         
	//* 166  253:return          
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 167  254:astore          4
		{
			throw new eption(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
			}), ((Throwable) (indexoutofboundsexception)));
	//  168  256:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//  169  259:dup             
	//  170  260:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//  171  262:iconst_3        
	//  172  263:anewarray       Object[]
	//  173  266:dup             
	//  174  267:iconst_0        
	//  175  268:aload_0         
	//  176  269:getfield        #47  <Field int position>
	//  177  272:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  178  275:aastore         
	//  179  276:dup             
	//  180  277:iconst_1        
	//  181  278:aload_0         
	//  182  279:getfield        #49  <Field int limit>
	//  183  282:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  184  285:aastore         
	//  185  286:dup             
	//  186  287:iconst_2        
	//  187  288:iconst_1        
	//  188  289:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  189  292:aastore         
	//  190  293:invokestatic    #40  <Method String String.format(String, Object[])>
	//  191  296:aload           4
	//  192  298:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
	//  193  301:athrow          
		}
		abyte0[i] = (byte)((int)l & 0xff);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)((int)(l >> 8) & 0xff);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)((int)(l >> 16) & 0xff);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)((int)(l >> 24) & 0xff);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)((int)(l >> 32) & 0xff);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)((int)(l >> 40) & 0xff);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)((int)(l >> 48) & 0xff);
		abyte0 = buffer;
		i = position;
		position = i + 1;
		abyte0[i] = (byte)((int)(l >> 56) & 0xff);
		return;
	}

	public final void writeInt32(int i, int j)
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
	//    6    8:invokevirtual   #144 <Method void writeInt32NoTag(int)>
	//    7   11:return          
	}

	public final void writeInt32NoTag(int i)
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
	//    9   13:invokevirtual   #147 <Method void writeUInt64NoTag(long)>
			return;
	//   10   16:return          
		}
	}

	public final void writeLazy(ByteBuffer bytebuffer)
		throws IOException
	{
		write(bytebuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #150 <Method void write(ByteBuffer)>
	//    3    5:return          
	}

	public final void writeLazy(byte abyte0[], int i, int j)
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

	public final void writeMessage(int i, MessageLite messagelite)
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
	//    6    8:invokevirtual   #156 <Method void writeMessageNoTag(MessageLite)>
	//    7   11:return          
	}

	public final void writeMessageNoTag(MessageLite messagelite)
		throws IOException
	{
		writeUInt32NoTag(messagelite.getSerializedSize());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #161 <Method int MessageLite.getSerializedSize()>
	//    3    7:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
		messagelite.writeTo(((CodedOutputStream) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #164 <Method void MessageLite.writeTo(CodedOutputStream)>
	//    7   17:return          
	}

	public final void writeMessageSetExtension(int i, MessageLite messagelite)
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
	//    7    9:invokevirtual   #168 <Method void writeUInt32(int, int)>
		writeMessage(3, messagelite);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #170 <Method void writeMessage(int, MessageLite)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public final void writeRawBytes(ByteBuffer bytebuffer)
		throws IOException
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #174 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            24
		{
			write(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.capacity());
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #178 <Method byte[] ByteBuffer.array()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #181 <Method int ByteBuffer.arrayOffset()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #112 <Method int ByteBuffer.capacity()>
	//   10   20:invokevirtual   #107 <Method void write(byte[], int, int)>
			return;
	//   11   23:return          
		} else
		{
			bytebuffer = bytebuffer.duplicate();
	//   12   24:aload_1         
	//   13   25:invokevirtual   #185 <Method ByteBuffer ByteBuffer.duplicate()>
	//   14   28:astore_1        
			bytebuffer.clear();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #189 <Method java.nio.Buffer ByteBuffer.clear()>
	//   17   33:pop             
			write(bytebuffer);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #150 <Method void write(ByteBuffer)>
			return;
	//   21   39:return          
		}
	}

	public final void writeRawMessageSetExtension(int i, ByteString bytestring)
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
	//    7    9:invokevirtual   #168 <Method void writeUInt32(int, int)>
		writeBytes(3, bytestring);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #192 <Method void writeBytes(int, ByteString)>
		writeTag(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #91  <Method void writeTag(int, int)>
	//   16   24:return          
	}

	public final void writeString(int i, String s)
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
	//    6    8:invokevirtual   #197 <Method void writeStringNoTag(String)>
	//    7   11:return          
	}

	public final void writeStringNoTag(String s)
		throws IOException
	{
		int i = position;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int position>
	//    2    4:istore_2        
		int j;
		int k;
		try
		{
			k = computeUInt32SizeNoTag(s.length() * 3);
	//    3    5:aload_1         
	//    4    6:invokevirtual   #202 <Method int String.length()>
	//    5    9:iconst_3        
	//    6   10:imul            
	//    7   11:invokestatic    #206 <Method int computeUInt32SizeNoTag(int)>
	//    8   14:istore          4
			j = computeUInt32SizeNoTag(s.length());
	//    9   16:aload_1         
	//   10   17:invokevirtual   #202 <Method int String.length()>
	//   11   20:invokestatic    #206 <Method int computeUInt32SizeNoTag(int)>
	//   12   23:istore_3        
		}
	//*  13   24:iload_3         
	//*  14   25:iload           4
	//*  15   27:icmpne          79
	//*  16   30:aload_0         
	//*  17   31:iload_2         
	//*  18   32:iload_3         
	//*  19   33:iadd            
	//*  20   34:putfield        #47  <Field int position>
	//*  21   37:aload_1         
	//*  22   38:aload_0         
	//*  23   39:getfield        #43  <Field byte[] buffer>
	//*  24   42:aload_0         
	//*  25   43:getfield        #47  <Field int position>
	//*  26   46:aload_0         
	//*  27   47:invokevirtual   #208 <Method int spaceLeft()>
	//*  28   50:invokestatic    #214 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//*  29   53:istore          4
	//*  30   55:aload_0         
	//*  31   56:iload_2         
	//*  32   57:putfield        #47  <Field int position>
	//*  33   60:aload_0         
	//*  34   61:iload           4
	//*  35   63:iload_2         
	//*  36   64:isub            
	//*  37   65:iload_3         
	//*  38   66:isub            
	//*  39   67:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
	//*  40   70:aload_0         
	//*  41   71:iload           4
	//*  42   73:putfield        #47  <Field int position>
	//*  43   76:goto            107
	//*  44   79:aload_0         
	//*  45   80:aload_1         
	//*  46   81:invokestatic    #218 <Method int Utf8.encodedLength(CharSequence)>
	//*  47   84:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
	//*  48   87:aload_0         
	//*  49   88:aload_1         
	//*  50   89:aload_0         
	//*  51   90:getfield        #43  <Field byte[] buffer>
	//*  52   93:aload_0         
	//*  53   94:getfield        #47  <Field int position>
	//*  54   97:aload_0         
	//*  55   98:invokevirtual   #208 <Method int spaceLeft()>
	//*  56  101:invokestatic    #214 <Method int Utf8.encode(CharSequence, byte[], int, int)>
	//*  57  104:putfield        #47  <Field int position>
	//*  58  107:return          
		catch( )
	//*  59  108:astore          5
		{
			position = i;
	//   60  110:aload_0         
	//   61  111:iload_2         
	//   62  112:putfield        #47  <Field int position>
			inefficientWriteStringNoTag(s, );
	//   63  115:aload_0         
	//   64  116:aload_1         
	//   65  117:aload           5
	//   66  119:invokevirtual   #222 <Method void inefficientWriteStringNoTag(String, Utf8$UnpairedSurrogateException)>
			return;
	//   67  122:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  68  123:astore_1        
		{
			throw new eption(((Throwable) (s)));
	//   69  124:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//   70  127:dup             
	//   71  128:aload_1         
	//   72  129:invokespecial   #225 <Method void CodedOutputStream$OutOfSpaceException(Throwable)>
	//   73  132:athrow          
		}
		if(j != k)
			break MISSING_BLOCK_LABEL_79;
		position = i + j;
		k = Utf8.encode(((CharSequence) (s)), buffer, position, spaceLeft());
		position = i;
		writeUInt32NoTag(k - i - j);
		position = k;
		break MISSING_BLOCK_LABEL_107;
		writeUInt32NoTag(Utf8.encodedLength(((CharSequence) (s))));
		position = Utf8.encode(((CharSequence) (s)), buffer, position, spaceLeft());
	}

	public final void writeTag(int i, int j)
		throws IOException
	{
		writeUInt32NoTag(WireFormat.makeTag(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #231 <Method int WireFormat.makeTag(int, int)>
	//    4    6:invokevirtual   #105 <Method void writeUInt32NoTag(int)>
	//    5    9:return          
	}

	public final void writeUInt32(int i, int j)
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

	public final void writeUInt32NoTag(int i)
		throws IOException
	{
		int j;
		j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(CodedOutputStream.access$100())
	//*   2    2:invokestatic    #234 <Method boolean CodedOutputStream.access$100()>
	//*   3    5:ifeq            92
		{
			j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if(spaceLeft() >= 10)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #208 <Method int spaceLeft()>
	//*   8   14:bipush          10
	//*   9   16:icmplt          92
				do
				{
					if((i & 0xffffff80) == 0)
	//*  10   19:iload_1         
	//*  11   20:bipush          -128
	//*  12   22:iand            
	//*  13   23:ifne            52
					{
						byte abyte0[] = buffer;
	//   14   26:aload_0         
	//   15   27:getfield        #43  <Field byte[] buffer>
	//   16   30:astore_3        
						j = position;
	//   17   31:aload_0         
	//   18   32:getfield        #47  <Field int position>
	//   19   35:istore_2        
						position = j + 1;
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:putfield        #47  <Field int position>
						UnsafeUtil.putByte(abyte0, j, (byte)i);
	//   25   43:aload_3         
	//   26   44:iload_2         
	//   27   45:i2l             
	//   28   46:iload_1         
	//   29   47:int2byte        
	//   30   48:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
						return;
	//   31   51:return          
					}
					byte abyte1[] = buffer;
	//   32   52:aload_0         
	//   33   53:getfield        #43  <Field byte[] buffer>
	//   34   56:astore_3        
					j = position;
	//   35   57:aload_0         
	//   36   58:getfield        #47  <Field int position>
	//   37   61:istore_2        
					position = j + 1;
	//   38   62:aload_0         
	//   39   63:iload_2         
	//   40   64:iconst_1        
	//   41   65:iadd            
	//   42   66:putfield        #47  <Field int position>
					UnsafeUtil.putByte(abyte1, j, (byte)(i & 0x7f | 0x80));
	//   43   69:aload_3         
	//   44   70:iload_2         
	//   45   71:i2l             
	//   46   72:iload_1         
	//   47   73:bipush          127
	//   48   75:iand            
	//   49   76:sipush          128
	//   50   79:ior             
	//   51   80:int2byte        
	//   52   81:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
					i >>>= 7;
	//   53   84:iload_1         
	//   54   85:bipush          7
	//   55   87:iushr           
	//   56   88:istore_1        
				} while(true);
	//   57   89:goto            19
		}
_L1:
		if((j & 0xffffff80) == 0)
	//*  58   92:iload_2         
	//*  59   93:bipush          -128
	//*  60   95:iand            
	//*  61   96:ifne            122
		{
			byte abyte2[];
			try
			{
				abyte2 = buffer;
	//   62   99:aload_0         
	//   63  100:getfield        #43  <Field byte[] buffer>
	//   64  103:astore_3        
				i = position;
	//   65  104:aload_0         
	//   66  105:getfield        #47  <Field int position>
	//   67  108:istore_1        
				position = i + 1;
	//   68  109:aload_0         
	//   69  110:iload_1         
	//   70  111:iconst_1        
	//   71  112:iadd            
	//   72  113:putfield        #47  <Field int position>
			}
	//*  73  116:aload_3         
	//*  74  117:iload_1         
	//*  75  118:iload_2         
	//*  76  119:int2byte        
	//*  77  120:bastore         
	//*  78  121:return          
	//*  79  122:aload_0         
	//*  80  123:getfield        #43  <Field byte[] buffer>
	//*  81  126:astore_3        
	//*  82  127:aload_0         
	//*  83  128:getfield        #47  <Field int position>
	//*  84  131:istore_1        
	//*  85  132:aload_0         
	//*  86  133:iload_1         
	//*  87  134:iconst_1        
	//*  88  135:iadd            
	//*  89  136:putfield        #47  <Field int position>
	//*  90  139:aload_3         
	//*  91  140:iload_1         
	//*  92  141:iload_2         
	//*  93  142:bipush          127
	//*  94  144:iand            
	//*  95  145:sipush          128
	//*  96  148:ior             
	//*  97  149:int2byte        
	//*  98  150:bastore         
	//*  99  151:iload_2         
	//* 100  152:bipush          7
	//* 101  154:iushr           
	//* 102  155:istore_2        
	//* 103  156:goto            92
			catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 104  159:astore_3        
			{
				throw new eption(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
	//  105  160:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//  106  163:dup             
	//  107  164:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//  108  166:iconst_3        
	//  109  167:anewarray       Object[]
	//  110  170:dup             
	//  111  171:iconst_0        
	//  112  172:aload_0         
	//  113  173:getfield        #47  <Field int position>
	//  114  176:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  115  179:aastore         
	//  116  180:dup             
	//  117  181:iconst_1        
	//  118  182:aload_0         
	//  119  183:getfield        #49  <Field int limit>
	//  120  186:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  121  189:aastore         
	//  122  190:dup             
	//  123  191:iconst_2        
	//  124  192:iconst_1        
	//  125  193:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  126  196:aastore         
	//  127  197:invokestatic    #40  <Method String String.format(String, Object[])>
	//  128  200:aload_3         
	//  129  201:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
	//  130  204:athrow          
			}
			abyte2[i] = (byte)j;
			return;
		}
		abyte2 = buffer;
		i = position;
		position = i + 1;
		abyte2[i] = (byte)(j & 0x7f | 0x80);
		j >>>= 7;
		  goto _L1
	}

	public final void writeUInt64(int i, long l)
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
	//    6    8:invokevirtual   #147 <Method void writeUInt64NoTag(long)>
	//    7   11:return          
	}

	public final void writeUInt64NoTag(long l)
		throws IOException
	{
		long l1;
		l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore          4
		if(CodedOutputStream.access$100())
	//*   2    3:invokestatic    #234 <Method boolean CodedOutputStream.access$100()>
	//*   3    6:ifeq            103
		{
			l1 = l;
	//    4    9:lload_1         
	//    5   10:lstore          4
			if(spaceLeft() >= 10)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #208 <Method int spaceLeft()>
	//*   8   16:bipush          10
	//*   9   18:icmplt          103
				do
				{
					if((-128L & l) == 0L)
	//*  10   21:ldc2w           #242 <Long -128L>
	//*  11   24:lload_1         
	//*  12   25:land            
	//*  13   26:lconst_0        
	//*  14   27:lcmp            
	//*  15   28:ifne            60
					{
						byte abyte0[] = buffer;
	//   16   31:aload_0         
	//   17   32:getfield        #43  <Field byte[] buffer>
	//   18   35:astore          6
						int i = position;
	//   19   37:aload_0         
	//   20   38:getfield        #47  <Field int position>
	//   21   41:istore_3        
						position = i + 1;
	//   22   42:aload_0         
	//   23   43:iload_3         
	//   24   44:iconst_1        
	//   25   45:iadd            
	//   26   46:putfield        #47  <Field int position>
						UnsafeUtil.putByte(abyte0, i, (byte)(int)l);
	//   27   49:aload           6
	//   28   51:iload_3         
	//   29   52:i2l             
	//   30   53:lload_1         
	//   31   54:l2i             
	//   32   55:int2byte        
	//   33   56:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
						return;
	//   34   59:return          
					}
					byte abyte1[] = buffer;
	//   35   60:aload_0         
	//   36   61:getfield        #43  <Field byte[] buffer>
	//   37   64:astore          6
					int j = position;
	//   38   66:aload_0         
	//   39   67:getfield        #47  <Field int position>
	//   40   70:istore_3        
					position = j + 1;
	//   41   71:aload_0         
	//   42   72:iload_3         
	//   43   73:iconst_1        
	//   44   74:iadd            
	//   45   75:putfield        #47  <Field int position>
					UnsafeUtil.putByte(abyte1, j, (byte)((int)l & 0x7f | 0x80));
	//   46   78:aload           6
	//   47   80:iload_3         
	//   48   81:i2l             
	//   49   82:lload_1         
	//   50   83:l2i             
	//   51   84:bipush          127
	//   52   86:iand            
	//   53   87:sipush          128
	//   54   90:ior             
	//   55   91:int2byte        
	//   56   92:invokestatic    #240 <Method void UnsafeUtil.putByte(byte[], long, byte)>
					l >>>= 7;
	//   57   95:lload_1         
	//   58   96:bipush          7
	//   59   98:lushr           
	//   60   99:lstore_1        
				} while(true);
	//   61  100:goto            21
		}
_L1:
		if((-128L & l1) == 0L)
	//*  62  103:ldc2w           #242 <Long -128L>
	//*  63  106:lload           4
	//*  64  108:land            
	//*  65  109:lconst_0        
	//*  66  110:lcmp            
	//*  67  111:ifne            141
		{
			int k;
			byte abyte2[];
			try
			{
				abyte2 = buffer;
	//   68  114:aload_0         
	//   69  115:getfield        #43  <Field byte[] buffer>
	//   70  118:astore          6
				k = position;
	//   71  120:aload_0         
	//   72  121:getfield        #47  <Field int position>
	//   73  124:istore_3        
				position = k + 1;
	//   74  125:aload_0         
	//   75  126:iload_3         
	//   76  127:iconst_1        
	//   77  128:iadd            
	//   78  129:putfield        #47  <Field int position>
			}
	//*  79  132:aload           6
	//*  80  134:iload_3         
	//*  81  135:lload           4
	//*  82  137:l2i             
	//*  83  138:int2byte        
	//*  84  139:bastore         
	//*  85  140:return          
	//*  86  141:aload_0         
	//*  87  142:getfield        #43  <Field byte[] buffer>
	//*  88  145:astore          6
	//*  89  147:aload_0         
	//*  90  148:getfield        #47  <Field int position>
	//*  91  151:istore_3        
	//*  92  152:aload_0         
	//*  93  153:iload_3         
	//*  94  154:iconst_1        
	//*  95  155:iadd            
	//*  96  156:putfield        #47  <Field int position>
	//*  97  159:aload           6
	//*  98  161:iload_3         
	//*  99  162:lload           4
	//* 100  164:l2i             
	//* 101  165:bipush          127
	//* 102  167:iand            
	//* 103  168:sipush          128
	//* 104  171:ior             
	//* 105  172:int2byte        
	//* 106  173:bastore         
	//* 107  174:lload           4
	//* 108  176:bipush          7
	//* 109  178:lushr           
	//* 110  179:lstore          4
	//* 111  181:goto            103
			catch(IndexOutOfBoundsException indexoutofboundsexception)
	//* 112  184:astore          6
			{
				throw new eption(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
	//  113  186:new             #63  <Class CodedOutputStream$OutOfSpaceException>
	//  114  189:dup             
	//  115  190:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
	//  116  192:iconst_3        
	//  117  193:anewarray       Object[]
	//  118  196:dup             
	//  119  197:iconst_0        
	//  120  198:aload_0         
	//  121  199:getfield        #47  <Field int position>
	//  122  202:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  123  205:aastore         
	//  124  206:dup             
	//  125  207:iconst_1        
	//  126  208:aload_0         
	//  127  209:getfield        #49  <Field int limit>
	//  128  212:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  129  215:aastore         
	//  130  216:dup             
	//  131  217:iconst_2        
	//  132  218:iconst_1        
	//  133  219:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//  134  222:aastore         
	//  135  223:invokestatic    #40  <Method String String.format(String, Object[])>
	//  136  226:aload           6
	//  137  228:invokespecial   #68  <Method void CodedOutputStream$OutOfSpaceException(String, Throwable)>
	//  138  231:athrow          
			}
			abyte2[k] = (byte)(int)l1;
			return;
		}
		abyte2 = buffer;
		k = position;
		position = k + 1;
		abyte2[k] = (byte)((int)l1 & 0x7f | 0x80);
		l1 >>>= 7;
		  goto _L1
	}

	private final byte buffer[];
	private final int limit;
	private final int offset;
	private int position;

	CodedOutputStream$ArrayEncoder(byte abyte0[], int i, int j)
	{
		super(((CodedOutputStream._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #16  <Method void CodedOutputStream(CodedOutputStream$1)>
		if(abyte0 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			throw new NullPointerException("buffer");
	//    5    9:new             #18  <Class NullPointerException>
	//    6   12:dup             
	//    7   13:ldc1            #19  <String "buffer">
	//    8   15:invokespecial   #22  <Method void NullPointerException(String)>
	//    9   18:athrow          
		if((i | j | abyte0.length - (i + j)) < 0)
	//*  10   19:iload_2         
	//*  11   20:iload_3         
	//*  12   21:ior             
	//*  13   22:aload_1         
	//*  14   23:arraylength     
	//*  15   24:iload_2         
	//*  16   25:iload_3         
	//*  17   26:iadd            
	//*  18   27:isub            
	//*  19   28:ior             
	//*  20   29:ifge            71
		{
			throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] {
				Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
			}));
	//   21   32:new             #24  <Class IllegalArgumentException>
	//   22   35:dup             
	//   23   36:ldc1            #26  <String "Array range is invalid. Buffer.length=%d, offset=%d, length=%d">
	//   24   38:iconst_3        
	//   25   39:anewarray       Object[]
	//   26   42:dup             
	//   27   43:iconst_0        
	//   28   44:aload_1         
	//   29   45:arraylength     
	//   30   46:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   31   49:aastore         
	//   32   50:dup             
	//   33   51:iconst_1        
	//   34   52:iload_2         
	//   35   53:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   36   56:aastore         
	//   37   57:dup             
	//   38   58:iconst_2        
	//   39   59:iload_3         
	//   40   60:invokestatic    #34  <Method Integer Integer.valueOf(int)>
	//   41   63:aastore         
	//   42   64:invokestatic    #40  <Method String String.format(String, Object[])>
	//   43   67:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   44   70:athrow          
		} else
		{
			buffer = abyte0;
	//   45   71:aload_0         
	//   46   72:aload_1         
	//   47   73:putfield        #43  <Field byte[] buffer>
			offset = i;
	//   48   76:aload_0         
	//   49   77:iload_2         
	//   50   78:putfield        #45  <Field int offset>
			position = i;
	//   51   81:aload_0         
	//   52   82:iload_2         
	//   53   83:putfield        #47  <Field int position>
			limit = i + j;
	//   54   86:aload_0         
	//   55   87:iload_2         
	//   56   88:iload_3         
	//   57   89:iadd            
	//   58   90:putfield        #49  <Field int limit>
			return;
	//   59   93:return          
		}
	}
}
