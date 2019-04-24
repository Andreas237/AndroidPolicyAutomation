// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.protobuf:
//			ByteString, Utf8, CodedInputStream, Internal, 
//			ByteOutput

static class ByteString$LiteralByteString extends ByteString.LeafByteString
{

	public final ByteBuffer asReadOnlyByteBuffer()
	{
		return ByteBuffer.wrap(bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] bytes>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #30  <Method int size()>
	//    6   12:invokestatic    #36  <Method ByteBuffer ByteBuffer.wrap(byte[], int, int)>
	//    7   15:invokevirtual   #39  <Method ByteBuffer ByteBuffer.asReadOnlyBuffer()>
	//    8   18:areturn         
	}

	public final List asReadOnlyByteBufferList()
	{
		return Collections.singletonList(((Object) (asReadOnlyByteBuffer())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method ByteBuffer asReadOnlyByteBuffer()>
	//    2    4:invokestatic    #49  <Method List Collections.singletonList(Object)>
	//    3    7:areturn         
	}

	public byte byteAt(int i)
	{
		return bytes[i];
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] bytes>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public final void copyTo(ByteBuffer bytebuffer)
	{
		bytebuffer.put(bytes, getOffsetIntoBytes(), size());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field byte[] bytes>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #30  <Method int size()>
	//    7   13:invokevirtual   #58  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    8   16:pop             
	//    9   17:return          
	}

	protected void copyToInternal(byte abyte0[], int i, int j, int k)
	{
		System.arraycopy(((Object) (bytes)), i, ((Object) (abyte0)), j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] bytes>
	//    2    4:iload_2         
	//    3    5:aload_1         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokestatic    #66  <Method void System.arraycopy(Object, int, Object, int, int)>
	//    7   12:return          
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof ByteString))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #6   <Class ByteString>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		if(size() != ((ByteString)obj).size())
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #30  <Method int size()>
	//*  12   20:aload_1         
	//*  13   21:checkcast       #6   <Class ByteString>
	//*  14   24:invokevirtual   #69  <Method int ByteString.size()>
	//*  15   27:icmpeq          32
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		if(size() == 0)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #30  <Method int size()>
	//*  20   36:ifne            41
			return true;
	//   21   39:iconst_1        
	//   22   40:ireturn         
		if(obj instanceof ByteString$LiteralByteString)
	//*  23   41:aload_1         
	//*  24   42:instanceof      #2   <Class ByteString$LiteralByteString>
	//*  25   45:ifeq            94
		{
			ByteString$LiteralByteString bytestring$literalbytestring = (ByteString$LiteralByteString)obj;
	//   26   48:aload_1         
	//   27   49:checkcast       #2   <Class ByteString$LiteralByteString>
	//   28   52:astore          4
			int i = peekCachedHashCode();
	//   29   54:aload_0         
	//   30   55:invokevirtual   #72  <Method int peekCachedHashCode()>
	//   31   58:istore_2        
			int j = bytestring$literalbytestring.peekCachedHashCode();
	//   32   59:aload           4
	//   33   61:invokevirtual   #72  <Method int peekCachedHashCode()>
	//   34   64:istore_3        
			if(i != 0 && j != 0 && i != j)
	//*  35   65:iload_2         
	//*  36   66:ifeq            80
	//*  37   69:iload_3         
	//*  38   70:ifeq            80
	//*  39   73:iload_2         
	//*  40   74:iload_3         
	//*  41   75:icmpeq          80
				return false;
	//   42   78:iconst_0        
	//   43   79:ireturn         
			else
				return equalsRange(((ByteString) ((ByteString$LiteralByteString)obj)), 0, size());
	//   44   80:aload_0         
	//   45   81:aload_1         
	//   46   82:checkcast       #2   <Class ByteString$LiteralByteString>
	//   47   85:iconst_0        
	//   48   86:aload_0         
	//   49   87:invokevirtual   #30  <Method int size()>
	//   50   90:invokevirtual   #76  <Method boolean equalsRange(ByteString, int, int)>
	//   51   93:ireturn         
		} else
		{
			return obj.equals(((Object) (this)));
	//   52   94:aload_1         
	//   53   95:aload_0         
	//   54   96:invokevirtual   #80  <Method boolean Object.equals(Object)>
	//   55   99:ireturn         
		}
	}

	final boolean equalsRange(ByteString bytestring, int i, int j)
	{
		if(j > bytestring.size())
	//*   0    0:iload_3         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #69  <Method int ByteString.size()>
	//*   3    5:icmple          42
			throw new IllegalArgumentException((new StringBuilder()).append("Length too large: ").append(j).append(size()).toString());
	//    4    8:new             #82  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #84  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #85  <Method void StringBuilder()>
	//    9   19:ldc1            #87  <String "Length too large: ">
	//   10   21:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:iload_3         
	//   12   25:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   13   28:aload_0         
	//   14   29:invokevirtual   #30  <Method int size()>
	//   15   32:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   16   35:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   17   38:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   18   41:athrow          
		if(i + j > bytestring.size())
	//*  19   42:iload_2         
	//*  20   43:iload_3         
	//*  21   44:iadd            
	//*  22   45:aload_1         
	//*  23   46:invokevirtual   #69  <Method int ByteString.size()>
	//*  24   49:icmple          100
			throw new IllegalArgumentException((new StringBuilder()).append("Ran off end of other: ").append(i).append(", ").append(j).append(", ").append(bytestring.size()).toString());
	//   25   52:new             #82  <Class IllegalArgumentException>
	//   26   55:dup             
	//   27   56:new             #84  <Class StringBuilder>
	//   28   59:dup             
	//   29   60:invokespecial   #85  <Method void StringBuilder()>
	//   30   63:ldc1            #103 <String "Ran off end of other: ">
	//   31   65:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   32   68:iload_2         
	//   33   69:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   34   72:ldc1            #105 <String ", ">
	//   35   74:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   36   77:iload_3         
	//   37   78:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   38   81:ldc1            #105 <String ", ">
	//   39   83:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:aload_1         
	//   41   87:invokevirtual   #69  <Method int ByteString.size()>
	//   42   90:invokevirtual   #94  <Method StringBuilder StringBuilder.append(int)>
	//   43   93:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   44   96:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   45   99:athrow          
		if(bytestring instanceof ByteString$LiteralByteString)
	//*  46  100:aload_1         
	//*  47  101:instanceof      #2   <Class ByteString$LiteralByteString>
	//*  48  104:ifeq            181
		{
			bytestring = ((ByteString) ((ByteString$LiteralByteString)bytestring));
	//   49  107:aload_1         
	//   50  108:checkcast       #2   <Class ByteString$LiteralByteString>
	//   51  111:astore_1        
			byte abyte0[] = bytes;
	//   52  112:aload_0         
	//   53  113:getfield        #20  <Field byte[] bytes>
	//   54  116:astore          6
			byte abyte1[] = ((ByteString$LiteralByteString) (bytestring)).bytes;
	//   55  118:aload_1         
	//   56  119:getfield        #20  <Field byte[] bytes>
	//   57  122:astore          7
			int l = getOffsetIntoBytes();
	//   58  124:aload_0         
	//   59  125:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//   60  128:istore          5
			int k = getOffsetIntoBytes();
	//   61  130:aload_0         
	//   62  131:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//   63  134:istore          4
			for(i = ((ByteString$LiteralByteString) (bytestring)).getOffsetIntoBytes() + i; k < l + j; i++)
	//*  64  136:aload_1         
	//*  65  137:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//*  66  140:iload_2         
	//*  67  141:iadd            
	//*  68  142:istore_2        
	//*  69  143:iload           4
	//*  70  145:iload           5
	//*  71  147:iload_3         
	//*  72  148:iadd            
	//*  73  149:icmpge          179
			{
				if(abyte0[k] != abyte1[i])
	//*  74  152:aload           6
	//*  75  154:iload           4
	//*  76  156:baload          
	//*  77  157:aload           7
	//*  78  159:iload_2         
	//*  79  160:baload          
	//*  80  161:icmpeq          166
					return false;
	//   81  164:iconst_0        
	//   82  165:ireturn         
				k++;
	//   83  166:iload           4
	//   84  168:iconst_1        
	//   85  169:iadd            
	//   86  170:istore          4
			}

	//   87  172:iload_2         
	//   88  173:iconst_1        
	//   89  174:iadd            
	//   90  175:istore_2        
	//*  91  176:goto            143
			return true;
	//   92  179:iconst_1        
	//   93  180:ireturn         
		} else
		{
			return bytestring.substring(i, i + j).equals(((Object) (substring(0, j))));
	//   94  181:aload_1         
	//   95  182:iload_2         
	//   96  183:iload_2         
	//   97  184:iload_3         
	//   98  185:iadd            
	//   99  186:invokevirtual   #109 <Method ByteString ByteString.substring(int, int)>
	//  100  189:aload_0         
	//  101  190:iconst_0        
	//  102  191:iload_3         
	//  103  192:invokevirtual   #110 <Method ByteString substring(int, int)>
	//  104  195:invokevirtual   #111 <Method boolean ByteString.equals(Object)>
	//  105  198:ireturn         
		}
	}

	protected int getOffsetIntoBytes()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isValidUtf8()
	{
		int i = getOffsetIntoBytes();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    2    4:istore_1        
		return Utf8.isValidUtf8(bytes, i, size() + i);
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field byte[] bytes>
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #30  <Method int size()>
	//    8   14:iload_1         
	//    9   15:iadd            
	//   10   16:invokestatic    #118 <Method boolean Utf8.isValidUtf8(byte[], int, int)>
	//   11   19:ireturn         
	}

	public final CodedInputStream newCodedInput()
	{
		return CodedInputStream.newInstance(bytes, getOffsetIntoBytes(), size(), true);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] bytes>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #30  <Method int size()>
	//    6   12:iconst_1        
	//    7   13:invokestatic    #126 <Method CodedInputStream CodedInputStream.newInstance(byte[], int, int, boolean)>
	//    8   16:areturn         
	}

	public final InputStream newInput()
	{
		return ((InputStream) (new ByteArrayInputStream(bytes, getOffsetIntoBytes(), size())));
	//    0    0:new             #130 <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field byte[] bytes>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #30  <Method int size()>
	//    8   16:invokespecial   #133 <Method void ByteArrayInputStream(byte[], int, int)>
	//    9   19:areturn         
	}

	protected final int partialHash(int i, int j, int k)
	{
		return Internal.partialHash(i, bytes, getOffsetIntoBytes() + j, k);
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field byte[] bytes>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    5    9:iload_2         
	//    6   10:iadd            
	//    7   11:iload_3         
	//    8   12:invokestatic    #140 <Method int Internal.partialHash(int, byte[], int, int)>
	//    9   15:ireturn         
	}

	protected final int partialIsValidUtf8(int i, int j, int k)
	{
		j = getOffsetIntoBytes() + j;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    2    4:iload_2         
	//    3    5:iadd            
	//    4    6:istore_2        
		return Utf8.partialIsValidUtf8(i, bytes, j, j + k);
	//    5    7:iload_1         
	//    6    8:aload_0         
	//    7    9:getfield        #20  <Field byte[] bytes>
	//    8   12:iload_2         
	//    9   13:iload_2         
	//   10   14:iload_3         
	//   11   15:iadd            
	//   12   16:invokestatic    #143 <Method int Utf8.partialIsValidUtf8(int, byte[], int, int)>
	//   13   19:ireturn         
	}

	public int size()
	{
		return bytes.length;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field byte[] bytes>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public final ByteString substring(int i, int j)
	{
		j = checkRange(i, j, size());
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #30  <Method int size()>
	//    4    6:invokestatic    #146 <Method int checkRange(int, int, int)>
	//    5    9:istore_2        
		if(j == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            18
			return ByteString.EMPTY;
	//    8   14:getstatic       #150 <Field ByteString ByteString.EMPTY>
	//    9   17:areturn         
		else
			return ((ByteString) (new ByteString$BoundedByteString(bytes, getOffsetIntoBytes() + i, j)));
	//   10   18:new             #152 <Class ByteString$BoundedByteString>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #20  <Field byte[] bytes>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//   16   30:iload_1         
	//   17   31:iadd            
	//   18   32:iload_2         
	//   19   33:invokespecial   #153 <Method void ByteString$BoundedByteString(byte[], int, int)>
	//   20   36:areturn         
	}

	protected final String toStringInternal(Charset charset)
	{
		return new String(bytes, getOffsetIntoBytes(), size(), charset);
	//    0    0:new             #157 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field byte[] bytes>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #30  <Method int size()>
	//    8   16:aload_1         
	//    9   17:invokespecial   #160 <Method void String(byte[], int, int, Charset)>
	//   10   20:areturn         
	}

	final void writeTo(ByteOutput byteoutput)
		throws IOException
	{
		byteoutput.writeLazy(bytes, getOffsetIntoBytes(), size());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field byte[] bytes>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #30  <Method int size()>
	//    7   13:invokevirtual   #169 <Method void ByteOutput.writeLazy(byte[], int, int)>
	//    8   16:return          
	}

	public final void writeTo(OutputStream outputstream)
		throws IOException
	{
		outputstream.write(toByteArray());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #175 <Method byte[] toByteArray()>
	//    3    5:invokevirtual   #180 <Method void OutputStream.write(byte[])>
	//    4    8:return          
	}

	final void writeToInternal(OutputStream outputstream, int i, int j)
		throws IOException
	{
		outputstream.write(bytes, getOffsetIntoBytes() + i, j);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field byte[] bytes>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #27  <Method int getOffsetIntoBytes()>
	//    5    9:iload_2         
	//    6   10:iadd            
	//    7   11:iload_3         
	//    8   12:invokevirtual   #184 <Method void OutputStream.write(byte[], int, int)>
	//    9   15:return          
	}

	private static final long serialVersionUID = 1L;
	protected final byte bytes[];

	ByteString$LiteralByteString(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ByteString$LeafByteString()>
		bytes = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field byte[] bytes>
	//    5    9:return          
	}
}
