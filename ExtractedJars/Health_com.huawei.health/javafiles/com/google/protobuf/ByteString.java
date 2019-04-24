// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			Internal, NioByteString, RopeByteString, CodedInputStream, 
//			ByteOutput, Utf8, CodedOutputStream

public abstract class ByteString
	implements Iterable, Serializable
{
	static final class ArraysByteArrayCopier
		implements ByteArrayCopier
	{

		public byte[] copyFrom(byte abyte0[], int i, int j)
		{
			return Arrays.copyOfRange(abyte0, i, i + j);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:iadd            
		//    5    5:invokestatic    #23  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
		//    6    8:areturn         
		}

		private ArraysByteArrayCopier()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	static final class BoundedByteString extends LiteralByteString
	{

		private void readObject(ObjectInputStream objectinputstream)
			throws IOException
		{
			throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
		//    0    0:new             #34  <Class InvalidObjectException>
		//    1    3:dup             
		//    2    4:ldc1            #36  <String "BoundedByteStream instances are not to be serialized directly">
		//    3    6:invokespecial   #39  <Method void InvalidObjectException(String)>
		//    4    9:athrow          
		}

		public byte byteAt(int i)
		{
			checkIndex(i, size());
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #46  <Method int size()>
		//    3    5:invokestatic    #50  <Method void checkIndex(int, int)>
			return bytes[bytesOffset + i];
		//    4    8:aload_0         
		//    5    9:getfield        #54  <Field byte[] bytes>
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field int bytesOffset>
		//    8   16:iload_1         
		//    9   17:iadd            
		//   10   18:baload          
		//   11   19:ireturn         
		}

		protected void copyToInternal(byte abyte0[], int i, int j, int k)
		{
			System.arraycopy(((Object) (bytes)), getOffsetIntoBytes() + i, ((Object) (abyte0)), j, k);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field byte[] bytes>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #59  <Method int getOffsetIntoBytes()>
		//    4    8:iload_2         
		//    5    9:iadd            
		//    6   10:aload_1         
		//    7   11:iload_3         
		//    8   12:iload           4
		//    9   14:invokestatic    #65  <Method void System.arraycopy(Object, int, Object, int, int)>
		//   10   17:return          
		}

		protected int getOffsetIntoBytes()
		{
			return bytesOffset;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int bytesOffset>
		//    2    4:ireturn         
		}

		public int size()
		{
			return bytesLength;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field int bytesLength>
		//    2    4:ireturn         
		}

		Object writeReplace()
		{
			return ((Object) (ByteString.wrap(toByteArray())));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #71  <Method byte[] toByteArray()>
		//    2    4:invokestatic    #75  <Method ByteString ByteString.wrap(byte[])>
		//    3    7:areturn         
		}

		private static final long serialVersionUID = 1L;
		private final int bytesLength;
		private final int bytesOffset;

		BoundedByteString(byte abyte0[], int i, int j)
		{
			super(abyte0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #19  <Method void ByteString$LiteralByteString(byte[])>
			checkRange(i, i + j, abyte0.length);
		//    3    5:iload_2         
		//    4    6:iload_2         
		//    5    7:iload_3         
		//    6    8:iadd            
		//    7    9:aload_1         
		//    8   10:arraylength     
		//    9   11:invokestatic    #23  <Method int checkRange(int, int, int)>
		//   10   14:pop             
			bytesOffset = i;
		//   11   15:aload_0         
		//   12   16:iload_2         
		//   13   17:putfield        #25  <Field int bytesOffset>
			bytesLength = j;
		//   14   20:aload_0         
		//   15   21:iload_3         
		//   16   22:putfield        #27  <Field int bytesLength>
		//   17   25:return          
		}
	}

	static interface ByteArrayCopier
	{

		public abstract byte[] copyFrom(byte abyte0[], int i, int j);
	}

	public static interface ByteIterator
		extends Iterator
	{

		public abstract byte nextByte();
	}

	static final class CodedBuilder
	{

		public ByteString build()
		{
			output.checkNoSpaceLeft();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CodedOutputStream output>
		//    2    4:invokevirtual   #35  <Method void CodedOutputStream.checkNoSpaceLeft()>
			return ((ByteString) (new LiteralByteString(buffer)));
		//    3    7:new             #37  <Class ByteString$LiteralByteString>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:getfield        #18  <Field byte[] buffer>
		//    7   15:invokespecial   #40  <Method void ByteString$LiteralByteString(byte[])>
		//    8   18:areturn         
		}

		public CodedOutputStream getCodedOutput()
		{
			return output;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field CodedOutputStream output>
		//    2    4:areturn         
		}

		private final byte buffer[];
		private final CodedOutputStream output;

		private CodedBuilder(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			buffer = new byte[i];
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:newarray        byte[]
		//    5    8:putfield        #18  <Field byte[] buffer>
			output = CodedOutputStream.newInstance(buffer);
		//    6   11:aload_0         
		//    7   12:aload_0         
		//    8   13:getfield        #18  <Field byte[] buffer>
		//    9   16:invokestatic    #24  <Method CodedOutputStream CodedOutputStream.newInstance(byte[])>
		//   10   19:putfield        #26  <Field CodedOutputStream output>
		//   11   22:return          
		}

	}

	static abstract class LeafByteString extends ByteString
	{

		abstract boolean equalsRange(ByteString bytestring, int i, int j);

		protected final int getTreeDepth()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		protected final boolean isBalanced()
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public volatile Iterator iterator()
		{
			return ((Iterator) (iterator()));
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method ByteString$ByteIterator ByteString.iterator()>
		//    2    4:areturn         
		}

		LeafByteString()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void ByteString()>
		//    2    4:return          
		}
	}

	static class LiteralByteString extends LeafByteString
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
			if(obj instanceof LiteralByteString)
		//*  23   41:aload_1         
		//*  24   42:instanceof      #2   <Class ByteString$LiteralByteString>
		//*  25   45:ifeq            94
			{
				LiteralByteString literalbytestring = (LiteralByteString)obj;
		//   26   48:aload_1         
		//   27   49:checkcast       #2   <Class ByteString$LiteralByteString>
		//   28   52:astore          4
				int i = peekCachedHashCode();
		//   29   54:aload_0         
		//   30   55:invokevirtual   #72  <Method int peekCachedHashCode()>
		//   31   58:istore_2        
				int j = literalbytestring.peekCachedHashCode();
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
					return equalsRange(((ByteString) ((LiteralByteString)obj)), 0, size());
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
			if(bytestring instanceof LiteralByteString)
		//*  46  100:aload_1         
		//*  47  101:instanceof      #2   <Class ByteString$LiteralByteString>
		//*  48  104:ifeq            181
			{
				bytestring = ((ByteString) ((LiteralByteString)bytestring));
		//   49  107:aload_1         
		//   50  108:checkcast       #2   <Class ByteString$LiteralByteString>
		//   51  111:astore_1        
				byte abyte0[] = bytes;
		//   52  112:aload_0         
		//   53  113:getfield        #20  <Field byte[] bytes>
		//   54  116:astore          6
				byte abyte1[] = ((LiteralByteString) (bytestring)).bytes;
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
				for(i = ((LiteralByteString) (bytestring)).getOffsetIntoBytes() + i; k < l + j; i++)
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
				return ((ByteString) (new BoundedByteString(bytes, getOffsetIntoBytes() + i, j)));
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

		LiteralByteString(byte abyte0[])
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

	public static final class Output extends OutputStream
	{

		private byte[] copyArray(byte abyte0[], int i)
		{
			byte abyte1[] = new byte[i];
		//    0    0:iload_2         
		//    1    1:newarray        byte[]
		//    2    3:astore_3        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, Math.min(abyte0.length, i));
		//    3    4:aload_1         
		//    4    5:iconst_0        
		//    5    6:aload_3         
		//    6    7:iconst_0        
		//    7    8:aload_1         
		//    8    9:arraylength     
		//    9   10:iload_2         
		//   10   11:invokestatic    #50  <Method int Math.min(int, int)>
		//   11   14:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte1;
		//   12   17:aload_3         
		//   13   18:areturn         
		}

		private void flushFullBuffer(int i)
		{
			flushedBuffers.add(((Object) (new LiteralByteString(buffer))));
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field ArrayList flushedBuffers>
		//    2    4:new             #59  <Class ByteString$LiteralByteString>
		//    3    7:dup             
		//    4    8:aload_0         
		//    5    9:getfield        #42  <Field byte[] buffer>
		//    6   12:invokespecial   #62  <Method void ByteString$LiteralByteString(byte[])>
		//    7   15:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
		//    8   18:pop             
			flushedBuffersTotalBytes = flushedBuffersTotalBytes + buffer.length;
		//    9   19:aload_0         
		//   10   20:aload_0         
		//   11   21:getfield        #68  <Field int flushedBuffersTotalBytes>
		//   12   24:aload_0         
		//   13   25:getfield        #42  <Field byte[] buffer>
		//   14   28:arraylength     
		//   15   29:iadd            
		//   16   30:putfield        #68  <Field int flushedBuffersTotalBytes>
			buffer = new byte[Math.max(initialCapacity, Math.max(i, flushedBuffersTotalBytes >>> 1))];
		//   17   33:aload_0         
		//   18   34:aload_0         
		//   19   35:getfield        #35  <Field int initialCapacity>
		//   20   38:iload_1         
		//   21   39:aload_0         
		//   22   40:getfield        #68  <Field int flushedBuffersTotalBytes>
		//   23   43:iconst_1        
		//   24   44:iushr           
		//   25   45:invokestatic    #71  <Method int Math.max(int, int)>
		//   26   48:invokestatic    #71  <Method int Math.max(int, int)>
		//   27   51:newarray        byte[]
		//   28   53:putfield        #42  <Field byte[] buffer>
			bufferPos = 0;
		//   29   56:aload_0         
		//   30   57:iconst_0        
		//   31   58:putfield        #73  <Field int bufferPos>
		//   32   61:return          
		}

		private void flushLastBuffer()
		{
			if(bufferPos < buffer.length)
		//*   0    0:aload_0         
		//*   1    1:getfield        #73  <Field int bufferPos>
		//*   2    4:aload_0         
		//*   3    5:getfield        #42  <Field byte[] buffer>
		//*   4    8:arraylength     
		//*   5    9:icmpge          51
			{
				if(bufferPos > 0)
		//*   6   12:aload_0         
		//*   7   13:getfield        #73  <Field int bufferPos>
		//*   8   16:ifle            77
				{
					byte abyte0[] = copyArray(buffer, bufferPos);
		//    9   19:aload_0         
		//   10   20:aload_0         
		//   11   21:getfield        #42  <Field byte[] buffer>
		//   12   24:aload_0         
		//   13   25:getfield        #73  <Field int bufferPos>
		//   14   28:invokespecial   #76  <Method byte[] copyArray(byte[], int)>
		//   15   31:astore_1        
					flushedBuffers.add(((Object) (new LiteralByteString(abyte0))));
		//   16   32:aload_0         
		//   17   33:getfield        #40  <Field ArrayList flushedBuffers>
		//   18   36:new             #59  <Class ByteString$LiteralByteString>
		//   19   39:dup             
		//   20   40:aload_1         
		//   21   41:invokespecial   #62  <Method void ByteString$LiteralByteString(byte[])>
		//   22   44:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
		//   23   47:pop             
				}
			} else
		//*  24   48:goto            77
			{
				flushedBuffers.add(((Object) (new LiteralByteString(buffer))));
		//   25   51:aload_0         
		//   26   52:getfield        #40  <Field ArrayList flushedBuffers>
		//   27   55:new             #59  <Class ByteString$LiteralByteString>
		//   28   58:dup             
		//   29   59:aload_0         
		//   30   60:getfield        #42  <Field byte[] buffer>
		//   31   63:invokespecial   #62  <Method void ByteString$LiteralByteString(byte[])>
		//   32   66:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
		//   33   69:pop             
				buffer = EMPTY_BYTE_ARRAY;
		//   34   70:aload_0         
		//   35   71:getstatic       #21  <Field byte[] EMPTY_BYTE_ARRAY>
		//   36   74:putfield        #42  <Field byte[] buffer>
			}
			flushedBuffersTotalBytes = flushedBuffersTotalBytes + bufferPos;
		//   37   77:aload_0         
		//   38   78:aload_0         
		//   39   79:getfield        #68  <Field int flushedBuffersTotalBytes>
		//   40   82:aload_0         
		//   41   83:getfield        #73  <Field int bufferPos>
		//   42   86:iadd            
		//   43   87:putfield        #68  <Field int flushedBuffersTotalBytes>
			bufferPos = 0;
		//   44   90:aload_0         
		//   45   91:iconst_0        
		//   46   92:putfield        #73  <Field int bufferPos>
		//   47   95:return          
		}

		public void reset()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			flushedBuffers.clear();
		//    2    2:aload_0         
		//    3    3:getfield        #40  <Field ArrayList flushedBuffers>
		//    4    6:invokevirtual   #80  <Method void ArrayList.clear()>
			flushedBuffersTotalBytes = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #68  <Field int flushedBuffersTotalBytes>
			bufferPos = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #73  <Field int bufferPos>
			this;
		//   11   19:aload_0         
			JVM INSTR monitorexit ;
		//   12   20:monitorexit     
			return;
		//   13   21:return          
			Exception exception;
			exception;
		//   14   22:astore_1        
		//*  15   23:aload_0         
			throw exception;
		//   16   24:monitorexit     
		//   17   25:aload_1         
		//   18   26:athrow          
		}

		public int size()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			int i;
			int j;
			i = flushedBuffersTotalBytes;
		//    2    2:aload_0         
		//    3    3:getfield        #68  <Field int flushedBuffersTotalBytes>
		//    4    6:istore_1        
			j = bufferPos;
		//    5    7:aload_0         
		//    6    8:getfield        #73  <Field int bufferPos>
		//    7   11:istore_2        
			this;
		//    8   12:aload_0         
			JVM INSTR monitorexit ;
		//    9   13:monitorexit     
			return i + j;
		//   10   14:iload_1         
		//   11   15:iload_2         
		//   12   16:iadd            
		//   13   17:ireturn         
			Exception exception;
			exception;
		//   14   18:astore_3        
		//*  15   19:aload_0         
			throw exception;
		//   16   20:monitorexit     
		//   17   21:aload_3         
		//   18   22:athrow          
		}

		public ByteString toByteString()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			ByteString bytestring;
			flushLastBuffer();
		//    2    2:aload_0         
		//    3    3:invokespecial   #86  <Method void flushLastBuffer()>
			bytestring = ByteString.copyFrom(((Iterable) (flushedBuffers)));
		//    4    6:aload_0         
		//    5    7:getfield        #40  <Field ArrayList flushedBuffers>
		//    6   10:invokestatic    #90  <Method ByteString ByteString.copyFrom(Iterable)>
		//    7   13:astore_1        
			this;
		//    8   14:aload_0         
			JVM INSTR monitorexit ;
		//    9   15:monitorexit     
			return bytestring;
		//   10   16:aload_1         
		//   11   17:areturn         
			Exception exception;
			exception;
		//   12   18:astore_1        
		//*  13   19:aload_0         
			throw exception;
		//   14   20:monitorexit     
		//   15   21:aload_1         
		//   16   22:athrow          
		}

		public String toString()
		{
			return String.format("<ByteString.Output@%s size=%d>", new Object[] {
				Integer.toHexString(System.identityHashCode(((Object) (this)))), Integer.valueOf(size())
			});
		//    0    0:ldc1            #94  <String "<ByteString.Output@%s size=%d>">
		//    1    2:iconst_2        
		//    2    3:anewarray       Object[]
		//    3    6:dup             
		//    4    7:iconst_0        
		//    5    8:aload_0         
		//    6    9:invokestatic    #100 <Method int System.identityHashCode(Object)>
		//    7   12:invokestatic    #106 <Method String Integer.toHexString(int)>
		//    8   15:aastore         
		//    9   16:dup             
		//   10   17:iconst_1        
		//   11   18:aload_0         
		//   12   19:invokevirtual   #108 <Method int size()>
		//   13   22:invokestatic    #112 <Method Integer Integer.valueOf(int)>
		//   14   25:aastore         
		//   15   26:invokestatic    #118 <Method String String.format(String, Object[])>
		//   16   29:areturn         
		}

		public void write(int i)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			int j;
			byte abyte0[];
			if(bufferPos == buffer.length)
		//*   2    2:aload_0         
		//*   3    3:getfield        #73  <Field int bufferPos>
		//*   4    6:aload_0         
		//*   5    7:getfield        #42  <Field byte[] buffer>
		//*   6   10:arraylength     
		//*   7   11:icmpne          19
				flushFullBuffer(1);
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:invokespecial   #121 <Method void flushFullBuffer(int)>
			abyte0 = buffer;
		//   11   19:aload_0         
		//   12   20:getfield        #42  <Field byte[] buffer>
		//   13   23:astore_3        
			j = bufferPos;
		//   14   24:aload_0         
		//   15   25:getfield        #73  <Field int bufferPos>
		//   16   28:istore_2        
			bufferPos = j + 1;
		//   17   29:aload_0         
		//   18   30:iload_2         
		//   19   31:iconst_1        
		//   20   32:iadd            
		//   21   33:putfield        #73  <Field int bufferPos>
			abyte0[j] = (byte)i;
		//   22   36:aload_3         
		//   23   37:iload_2         
		//   24   38:iload_1         
		//   25   39:int2byte        
		//   26   40:bastore         
			this;
		//   27   41:aload_0         
			JVM INSTR monitorexit ;
		//   28   42:monitorexit     
			return;
		//   29   43:return          
			Exception exception;
			exception;
		//   30   44:astore_3        
		//*  31   45:aload_0         
			throw exception;
		//   32   46:monitorexit     
		//   33   47:aload_3         
		//   34   48:athrow          
		}

		public void write(byte abyte0[], int i, int j)
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			if(j <= buffer.length - bufferPos)
		//*   2    2:iload_3         
		//*   3    3:aload_0         
		//*   4    4:getfield        #42  <Field byte[] buffer>
		//*   5    7:arraylength     
		//*   6    8:aload_0         
		//*   7    9:getfield        #73  <Field int bufferPos>
		//*   8   12:isub            
		//*   9   13:icmpgt          43
			{
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), bufferPos, j);
		//   10   16:aload_1         
		//   11   17:iload_2         
		//   12   18:aload_0         
		//   13   19:getfield        #42  <Field byte[] buffer>
		//   14   22:aload_0         
		//   15   23:getfield        #73  <Field int bufferPos>
		//   16   26:iload_3         
		//   17   27:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
				bufferPos = bufferPos + j;
		//   18   30:aload_0         
		//   19   31:aload_0         
		//   20   32:getfield        #73  <Field int bufferPos>
		//   21   35:iload_3         
		//   22   36:iadd            
		//   23   37:putfield        #73  <Field int bufferPos>
				break MISSING_BLOCK_LABEL_99;
		//   24   40:goto            99
			}
			int k;
			k = buffer.length - bufferPos;
		//   25   43:aload_0         
		//   26   44:getfield        #42  <Field byte[] buffer>
		//   27   47:arraylength     
		//   28   48:aload_0         
		//   29   49:getfield        #73  <Field int bufferPos>
		//   30   52:isub            
		//   31   53:istore          4
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), bufferPos, k);
		//   32   55:aload_1         
		//   33   56:iload_2         
		//   34   57:aload_0         
		//   35   58:getfield        #42  <Field byte[] buffer>
		//   36   61:aload_0         
		//   37   62:getfield        #73  <Field int bufferPos>
		//   38   65:iload           4
		//   39   67:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			j -= k;
		//   40   70:iload_3         
		//   41   71:iload           4
		//   42   73:isub            
		//   43   74:istore_3        
			flushFullBuffer(j);
		//   44   75:aload_0         
		//   45   76:iload_3         
		//   46   77:invokespecial   #121 <Method void flushFullBuffer(int)>
			System.arraycopy(((Object) (abyte0)), i + k, ((Object) (buffer)), 0, j);
		//   47   80:aload_1         
		//   48   81:iload_2         
		//   49   82:iload           4
		//   50   84:iadd            
		//   51   85:aload_0         
		//   52   86:getfield        #42  <Field byte[] buffer>
		//   53   89:iconst_0        
		//   54   90:iload_3         
		//   55   91:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			bufferPos = j;
		//   56   94:aload_0         
		//   57   95:iload_3         
		//   58   96:putfield        #73  <Field int bufferPos>
			this;
		//   59   99:aload_0         
			JVM INSTR monitorexit ;
		//   60  100:monitorexit     
			return;
		//   61  101:return          
			abyte0;
		//   62  102:astore_1        
		//*  63  103:aload_0         
			throw abyte0;
		//   64  104:monitorexit     
		//   65  105:aload_1         
		//   66  106:athrow          
		}

		public void writeTo(OutputStream outputstream)
			throws IOException
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			int j;
			ByteString abytestring[];
			byte abyte0[];
			abytestring = (ByteString[])flushedBuffers.toArray(((Object []) (new ByteString[flushedBuffers.size()])));
		//    2    2:aload_0         
		//    3    3:getfield        #40  <Field ArrayList flushedBuffers>
		//    4    6:aload_0         
		//    5    7:getfield        #40  <Field ArrayList flushedBuffers>
		//    6   10:invokevirtual   #127 <Method int ArrayList.size()>
		//    7   13:anewarray       ByteString[]
		//    8   16:invokevirtual   #131 <Method Object[] ArrayList.toArray(Object[])>
		//    9   19:checkcast       #133 <Class ByteString[]>
		//   10   22:astore          5
			abyte0 = buffer;
		//   11   24:aload_0         
		//   12   25:getfield        #42  <Field byte[] buffer>
		//   13   28:astore          6
			j = bufferPos;
		//   14   30:aload_0         
		//   15   31:getfield        #73  <Field int bufferPos>
		//   16   34:istore_3        
			this;
		//   17   35:aload_0         
			JVM INSTR monitorexit ;
		//   18   36:monitorexit     
			  goto _L1
		//*  19   37:goto            45
			outputstream;
		//   20   40:astore_1        
		//*  21   41:aload_0         
			throw outputstream;
		//   22   42:monitorexit     
		//   23   43:aload_1         
		//   24   44:athrow          
_L1:
			int k = abytestring.length;
		//   25   45:aload           5
		//   26   47:arraylength     
		//   27   48:istore          4
			for(int i = 0; i < k; i++)
		//*  28   50:iconst_0        
		//*  29   51:istore_2        
		//*  30   52:iload_2         
		//*  31   53:iload           4
		//*  32   55:icmpge          73
				abytestring[i].writeTo(outputstream);
		//   33   58:aload           5
		//   34   60:iload_2         
		//   35   61:aaload          
		//   36   62:aload_1         
		//   37   63:invokevirtual   #135 <Method void ByteString.writeTo(OutputStream)>

		//   38   66:iload_2         
		//   39   67:iconst_1        
		//   40   68:iadd            
		//   41   69:istore_2        
		//*  42   70:goto            52
			outputstream.write(copyArray(abyte0, j));
		//   43   73:aload_1         
		//   44   74:aload_0         
		//   45   75:aload           6
		//   46   77:iload_3         
		//   47   78:invokespecial   #76  <Method byte[] copyArray(byte[], int)>
		//   48   81:invokevirtual   #137 <Method void OutputStream.write(byte[])>
			return;
		//   49   84:return          
		}

		private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
		private byte buffer[];
		private int bufferPos;
		private final ArrayList flushedBuffers;
		private int flushedBuffersTotalBytes;
		private final int initialCapacity;

		static 
		{
		//    0    0:iconst_0        
		//    1    1:newarray        byte[]
		//    2    3:putstatic       #21  <Field byte[] EMPTY_BYTE_ARRAY>
		//*   3    6:return          
		}

		Output(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void OutputStream()>
			if(i < 0)
		//*   2    4:iload_1         
		//*   3    5:ifge            18
			{
				throw new IllegalArgumentException("Buffer size < 0");
		//    4    8:new             #28  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #30  <String "Buffer size < 0">
		//    7   14:invokespecial   #33  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			} else
			{
				initialCapacity = i;
		//    9   18:aload_0         
		//   10   19:iload_1         
		//   11   20:putfield        #35  <Field int initialCapacity>
				flushedBuffers = new ArrayList();
		//   12   23:aload_0         
		//   13   24:new             #37  <Class ArrayList>
		//   14   27:dup             
		//   15   28:invokespecial   #38  <Method void ArrayList()>
		//   16   31:putfield        #40  <Field ArrayList flushedBuffers>
				buffer = new byte[i];
		//   17   34:aload_0         
		//   18   35:iload_1         
		//   19   36:newarray        byte[]
		//   20   38:putfield        #42  <Field byte[] buffer>
				return;
		//   21   41:return          
			}
		}
	}

	static final class SystemByteArrayCopier
		implements ByteArrayCopier
	{

		public byte[] copyFrom(byte abyte0[], int i, int j)
		{
			byte abyte1[] = new byte[j];
		//    0    0:iload_3         
		//    1    1:newarray        byte[]
		//    2    3:astore          4
			System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte1)), 0, j);
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:aload           4
		//    6    9:iconst_0        
		//    7   10:iload_3         
		//    8   11:invokestatic    #24  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte1;
		//    9   14:aload           4
		//   10   16:areturn         
		}

		private SystemByteArrayCopier()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	ByteString()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void Object()>
		hash = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #85  <Field int hash>
	//    5    9:return          
	}

	private static ByteString balancedConcat(Iterator iterator1, int i)
	{
		if(i < 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          29
			throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[] {
				Integer.valueOf(i)
			}));
	//    3    5:new             #89  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #91  <String "length (%s) must be >= 1">
	//    6   11:iconst_1        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:iload_1         
	//   11   18:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   12   21:aastore         
	//   13   22:invokestatic    #103 <Method String String.format(String, Object[])>
	//   14   25:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   15   28:athrow          
		if(i == 1)
	//*  16   29:iload_1         
	//*  17   30:iconst_1        
	//*  18   31:icmpne          44
		{
			return (ByteString)iterator1.next();
	//   19   34:aload_0         
	//   20   35:invokeinterface #112 <Method Object Iterator.next()>
	//   21   40:checkcast       #2   <Class ByteString>
	//   22   43:areturn         
		} else
		{
			int j = i >>> 1;
	//   23   44:iload_1         
	//   24   45:iconst_1        
	//   25   46:iushr           
	//   26   47:istore_2        
			return balancedConcat(iterator1, j).concat(balancedConcat(iterator1, i - j));
	//   27   48:aload_0         
	//   28   49:iload_2         
	//   29   50:invokestatic    #114 <Method ByteString balancedConcat(Iterator, int)>
	//   30   53:aload_0         
	//   31   54:iload_1         
	//   32   55:iload_2         
	//   33   56:isub            
	//   34   57:invokestatic    #114 <Method ByteString balancedConcat(Iterator, int)>
	//   35   60:invokevirtual   #118 <Method ByteString concat(ByteString)>
	//   36   63:areturn         
		}
	}

	static void checkIndex(int i, int j)
	{
		if((j - (i + 1) | i) < 0)
	//*   0    0:iload_1         
	//*   1    1:iload_0         
	//*   2    2:iconst_1        
	//*   3    3:iadd            
	//*   4    4:isub            
	//*   5    5:iload_0         
	//*   6    6:ior             
	//*   7    7:ifge            77
		{
			if(i < 0)
	//*   8   10:iload_0         
	//*   9   11:ifge            41
				throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("Index < 0: ").append(i).toString());
	//   10   14:new             #124 <Class ArrayIndexOutOfBoundsException>
	//   11   17:dup             
	//   12   18:new             #126 <Class StringBuilder>
	//   13   21:dup             
	//   14   22:invokespecial   #127 <Method void StringBuilder()>
	//   15   25:ldc1            #129 <String "Index < 0: ">
	//   16   27:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   17   30:iload_0         
	//   18   31:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   19   34:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   20   37:invokespecial   #141 <Method void ArrayIndexOutOfBoundsException(String)>
	//   21   40:athrow          
			else
				throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("Index > length: ").append(i).append(", ").append(j).toString());
	//   22   41:new             #124 <Class ArrayIndexOutOfBoundsException>
	//   23   44:dup             
	//   24   45:new             #126 <Class StringBuilder>
	//   25   48:dup             
	//   26   49:invokespecial   #127 <Method void StringBuilder()>
	//   27   52:ldc1            #143 <String "Index > length: ">
	//   28   54:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:iload_0         
	//   30   58:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   31   61:ldc1            #145 <String ", ">
	//   32   63:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   33   66:iload_1         
	//   34   67:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   35   70:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   36   73:invokespecial   #141 <Method void ArrayIndexOutOfBoundsException(String)>
	//   37   76:athrow          
		} else
		{
			return;
	//   38   77:return          
		}
	}

	static int checkRange(int i, int j, int k)
	{
		int l = j - i;
	//    0    0:iload_1         
	//    1    1:iload_0         
	//    2    2:isub            
	//    3    3:istore_3        
		if((i | j | l | k - j) < 0)
	//*   4    4:iload_0         
	//*   5    5:iload_1         
	//*   6    6:ior             
	//*   7    7:iload_3         
	//*   8    8:ior             
	//*   9    9:iload_2         
	//*  10   10:iload_1         
	//*  11   11:isub            
	//*  12   12:ior             
	//*  13   13:ifge            129
		{
			if(i < 0)
	//*  14   16:iload_0         
	//*  15   17:ifge            52
				throw new IndexOutOfBoundsException((new StringBuilder()).append("Beginning index: ").append(i).append(" < 0").toString());
	//   16   20:new             #149 <Class IndexOutOfBoundsException>
	//   17   23:dup             
	//   18   24:new             #126 <Class StringBuilder>
	//   19   27:dup             
	//   20   28:invokespecial   #127 <Method void StringBuilder()>
	//   21   31:ldc1            #151 <String "Beginning index: ">
	//   22   33:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   23   36:iload_0         
	//   24   37:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   25   40:ldc1            #153 <String " < 0">
	//   26   42:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   27   45:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   28   48:invokespecial   #154 <Method void IndexOutOfBoundsException(String)>
	//   29   51:athrow          
			if(j < i)
	//*  30   52:iload_1         
	//*  31   53:iload_0         
	//*  32   54:icmpge          93
				throw new IndexOutOfBoundsException((new StringBuilder()).append("Beginning index larger than ending index: ").append(i).append(", ").append(j).toString());
	//   33   57:new             #149 <Class IndexOutOfBoundsException>
	//   34   60:dup             
	//   35   61:new             #126 <Class StringBuilder>
	//   36   64:dup             
	//   37   65:invokespecial   #127 <Method void StringBuilder()>
	//   38   68:ldc1            #156 <String "Beginning index larger than ending index: ">
	//   39   70:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   40   73:iload_0         
	//   41   74:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   42   77:ldc1            #145 <String ", ">
	//   43   79:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   44   82:iload_1         
	//   45   83:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   46   86:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   47   89:invokespecial   #154 <Method void IndexOutOfBoundsException(String)>
	//   48   92:athrow          
			else
				throw new IndexOutOfBoundsException((new StringBuilder()).append("End index: ").append(j).append(" >= ").append(k).toString());
	//   49   93:new             #149 <Class IndexOutOfBoundsException>
	//   50   96:dup             
	//   51   97:new             #126 <Class StringBuilder>
	//   52  100:dup             
	//   53  101:invokespecial   #127 <Method void StringBuilder()>
	//   54  104:ldc1            #158 <String "End index: ">
	//   55  106:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   56  109:iload_1         
	//   57  110:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   58  113:ldc1            #160 <String " >= ">
	//   59  115:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   60  118:iload_2         
	//   61  119:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   62  122:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   63  125:invokespecial   #154 <Method void IndexOutOfBoundsException(String)>
	//   64  128:athrow          
		} else
		{
			return l;
	//   65  129:iload_3         
	//   66  130:ireturn         
		}
	}

	public static ByteString copyFrom(Iterable iterable)
	{
		int i;
		if(!(iterable instanceof Collection))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #164 <Class Collection>
	//*   2    4:ifne            42
		{
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
			for(Iterator iterator1 = iterable.iterator(); iterator1.hasNext();)
	//*   5    9:aload_0         
	//*   6   10:invokeinterface #168 <Method Iterator Iterable.iterator()>
	//*   7   15:astore_2        
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #172 <Method boolean Iterator.hasNext()>
	//*  10   22:ifeq            39
			{
				iterator1.next();
	//   11   25:aload_2         
	//   12   26:invokeinterface #112 <Method Object Iterator.next()>
	//   13   31:pop             
				i++;
	//   14   32:iload_1         
	//   15   33:iconst_1        
	//   16   34:iadd            
	//   17   35:istore_1        
			}

		} else
	//*  18   36:goto            16
	//*  19   39:goto            52
		{
			i = ((Collection)iterable).size();
	//   20   42:aload_0         
	//   21   43:checkcast       #164 <Class Collection>
	//   22   46:invokeinterface #176 <Method int Collection.size()>
	//   23   51:istore_1        
		}
		if(i == 0)
	//*  24   52:iload_1         
	//*  25   53:ifne            60
			return EMPTY;
	//   26   56:getstatic       #66  <Field ByteString EMPTY>
	//   27   59:areturn         
		else
			return balancedConcat(iterable.iterator(), i);
	//   28   60:aload_0         
	//   29   61:invokeinterface #168 <Method Iterator Iterable.iterator()>
	//   30   66:iload_1         
	//   31   67:invokestatic    #114 <Method ByteString balancedConcat(Iterator, int)>
	//   32   70:areturn         
	}

	public static ByteString copyFrom(String s, String s1)
		throws UnsupportedEncodingException
	{
		return ((ByteString) (new LiteralByteString(s.getBytes(s1))));
	//    0    0:new             #31  <Class ByteString$LiteralByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #184 <Method byte[] String.getBytes(String)>
	//    5    9:invokespecial   #64  <Method void ByteString$LiteralByteString(byte[])>
	//    6   12:areturn         
	}

	public static ByteString copyFrom(String s, Charset charset)
	{
		return ((ByteString) (new LiteralByteString(s.getBytes(charset))));
	//    0    0:new             #31  <Class ByteString$LiteralByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #189 <Method byte[] String.getBytes(Charset)>
	//    5    9:invokespecial   #64  <Method void ByteString$LiteralByteString(byte[])>
	//    6   12:areturn         
	}

	public static ByteString copyFrom(ByteBuffer bytebuffer)
	{
		return copyFrom(bytebuffer, bytebuffer.remaining());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #195 <Method int ByteBuffer.remaining()>
	//    3    5:invokestatic    #198 <Method ByteString copyFrom(ByteBuffer, int)>
	//    4    8:areturn         
	}

	public static ByteString copyFrom(ByteBuffer bytebuffer, int i)
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore_2        
		bytebuffer.get(abyte0);
	//    3    4:aload_0         
	//    4    5:aload_2         
	//    5    6:invokevirtual   #202 <Method ByteBuffer ByteBuffer.get(byte[])>
	//    6    9:pop             
		return ((ByteString) (new LiteralByteString(abyte0)));
	//    7   10:new             #31  <Class ByteString$LiteralByteString>
	//    8   13:dup             
	//    9   14:aload_2         
	//   10   15:invokespecial   #64  <Method void ByteString$LiteralByteString(byte[])>
	//   11   18:areturn         
	}

	public static ByteString copyFrom(byte abyte0[])
	{
		return copyFrom(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:arraylength     
	//    4    4:invokestatic    #206 <Method ByteString copyFrom(byte[], int, int)>
	//    5    7:areturn         
	}

	public static ByteString copyFrom(byte abyte0[], int i, int j)
	{
		return ((ByteString) (new LiteralByteString(byteArrayCopier.copyFrom(abyte0, i, j))));
	//    0    0:new             #31  <Class ByteString$LiteralByteString>
	//    1    3:dup             
	//    2    4:getstatic       #80  <Field ByteString$ByteArrayCopier byteArrayCopier>
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokeinterface #209 <Method byte[] ByteString$ByteArrayCopier.copyFrom(byte[], int, int)>
	//    7   15:invokespecial   #64  <Method void ByteString$LiteralByteString(byte[])>
	//    8   18:areturn         
	}

	public static ByteString copyFromUtf8(String s)
	{
		return ((ByteString) (new LiteralByteString(s.getBytes(Internal.UTF_8))));
	//    0    0:new             #31  <Class ByteString$LiteralByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #215 <Field Charset Internal.UTF_8>
	//    4    8:invokevirtual   #189 <Method byte[] String.getBytes(Charset)>
	//    5   11:invokespecial   #64  <Method void ByteString$LiteralByteString(byte[])>
	//    6   14:areturn         
	}

	static CodedBuilder newCodedBuilder(int i)
	{
		return new CodedBuilder(i);
	//    0    0:new             #25  <Class ByteString$CodedBuilder>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #220 <Method void ByteString$CodedBuilder(int, ByteString$1)>
	//    5    9:areturn         
	}

	public static Output newOutput()
	{
		return new Output(128);
	//    0    0:new             #34  <Class ByteString$Output>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #225 <Method void ByteString$Output(int)>
	//    4   10:areturn         
	}

	public static Output newOutput(int i)
	{
		return new Output(i);
	//    0    0:new             #34  <Class ByteString$Output>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #225 <Method void ByteString$Output(int)>
	//    4    8:areturn         
	}

	private static ByteString readChunk(InputStream inputstream, int i)
		throws IOException
	{
		byte abyte0[] = new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:astore          4
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
		{
			if(j >= i)
				break;
	//    5    7:iload_2         
	//    6    8:iload_1         
	//    7    9:icmpge          38
			int k = inputstream.read(abyte0, j, i - j);
	//    8   12:aload_0         
	//    9   13:aload           4
	//   10   15:iload_2         
	//   11   16:iload_1         
	//   12   17:iload_2         
	//   13   18:isub            
	//   14   19:invokevirtual   #236 <Method int InputStream.read(byte[], int, int)>
	//   15   22:istore_3        
			if(k == -1)
	//*  16   23:iload_3         
	//*  17   24:iconst_m1       
	//*  18   25:icmpne          31
				break;
	//   19   28:goto            38
			j += k;
	//   20   31:iload_2         
	//   21   32:iload_3         
	//   22   33:iadd            
	//   23   34:istore_2        
		} while(true);
	//   24   35:goto            7
		if(j == 0)
	//*  25   38:iload_2         
	//*  26   39:ifne            44
			return null;
	//   27   42:aconst_null     
	//   28   43:areturn         
		else
			return copyFrom(abyte0, 0, j);
	//   29   44:aload           4
	//   30   46:iconst_0        
	//   31   47:iload_2         
	//   32   48:invokestatic    #206 <Method ByteString copyFrom(byte[], int, int)>
	//   33   51:areturn         
	}

	public static ByteString readFrom(InputStream inputstream)
		throws IOException
	{
		return readFrom(inputstream, 256, 8192);
	//    0    0:aload_0         
	//    1    1:sipush          256
	//    2    4:sipush          8192
	//    3    7:invokestatic    #241 <Method ByteString readFrom(InputStream, int, int)>
	//    4   10:areturn         
	}

	public static ByteString readFrom(InputStream inputstream, int i)
		throws IOException
	{
		return readFrom(inputstream, i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:invokestatic    #241 <Method ByteString readFrom(InputStream, int, int)>
	//    4    6:areturn         
	}

	public static ByteString readFrom(InputStream inputstream, int i, int j)
		throws IOException
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #243 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #244 <Method void ArrayList()>
	//    3    7:astore_3        
		do
		{
			ByteString bytestring = readChunk(inputstream, i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokestatic    #246 <Method ByteString readChunk(InputStream, int)>
	//    7   13:astore          4
			if(bytestring != null)
	//*   8   15:aload           4
	//*   9   17:ifnonnull       23
	//*  10   20:goto            43
			{
				((Collection) (arraylist)).add(((Object) (bytestring)));
	//   11   23:aload_3         
	//   12   24:aload           4
	//   13   26:invokeinterface #250 <Method boolean Collection.add(Object)>
	//   14   31:pop             
				i = Math.min(i * 2, j);
	//   15   32:iload_1         
	//   16   33:iconst_2        
	//   17   34:imul            
	//   18   35:iload_2         
	//   19   36:invokestatic    #256 <Method int Math.min(int, int)>
	//   20   39:istore_1        
			} else
	//*  21   40:goto            8
			{
				return copyFrom(((Iterable) (arraylist)));
	//   22   43:aload_3         
	//   23   44:invokestatic    #258 <Method ByteString copyFrom(Iterable)>
	//   24   47:areturn         
			}
		} while(true);
	}

	static ByteString wrap(ByteBuffer bytebuffer)
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #262 <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            30
		{
			int i = bytebuffer.arrayOffset();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #265 <Method int ByteBuffer.arrayOffset()>
	//    5   11:istore_1        
			return wrap(bytebuffer.array(), bytebuffer.position() + i, bytebuffer.remaining());
	//    6   12:aload_0         
	//    7   13:invokevirtual   #269 <Method byte[] ByteBuffer.array()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #272 <Method int ByteBuffer.position()>
	//   10   20:iload_1         
	//   11   21:iadd            
	//   12   22:aload_0         
	//   13   23:invokevirtual   #195 <Method int ByteBuffer.remaining()>
	//   14   26:invokestatic    #274 <Method ByteString wrap(byte[], int, int)>
	//   15   29:areturn         
		} else
		{
			return ((ByteString) (new NioByteString(bytebuffer)));
	//   16   30:new             #276 <Class NioByteString>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #279 <Method void NioByteString(ByteBuffer)>
	//   20   38:areturn         
		}
	}

	static ByteString wrap(byte abyte0[])
	{
		return ((ByteString) (new LiteralByteString(abyte0)));
	//    0    0:new             #31  <Class ByteString$LiteralByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #64  <Method void ByteString$LiteralByteString(byte[])>
	//    4    8:areturn         
	}

	static ByteString wrap(byte abyte0[], int i, int j)
	{
		return ((ByteString) (new BoundedByteString(abyte0, i, j)));
	//    0    0:new             #16  <Class ByteString$BoundedByteString>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #282 <Method void ByteString$BoundedByteString(byte[], int, int)>
	//    6   10:areturn         
	}

	public abstract ByteBuffer asReadOnlyByteBuffer();

	public abstract List asReadOnlyByteBufferList();

	public abstract byte byteAt(int i);

	public final ByteString concat(ByteString bytestring)
	{
		if(0x7fffffff - size() < bytestring.size())
	//*   0    0:ldc2            #289 <Int 0x7fffffff>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #290 <Method int size()>
	//*   3    7:isub            
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #290 <Method int size()>
	//*   6   12:icmpge          59
			throw new IllegalArgumentException((new StringBuilder()).append("ByteString would be too long: ").append(size()).append("+").append(bytestring.size()).toString());
	//    7   15:new             #89  <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #126 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #127 <Method void StringBuilder()>
	//   12   26:ldc2            #292 <String "ByteString would be too long: ">
	//   13   29:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #290 <Method int size()>
	//   16   36:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   17   39:ldc2            #294 <String "+">
	//   18   42:invokevirtual   #133 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:aload_1         
	//   20   46:invokevirtual   #290 <Method int size()>
	//   21   49:invokevirtual   #136 <Method StringBuilder StringBuilder.append(int)>
	//   22   52:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   23   55:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   24   58:athrow          
		else
			return RopeByteString.concatenate(this, bytestring);
	//   25   59:aload_0         
	//   26   60:aload_1         
	//   27   61:invokestatic    #300 <Method ByteString RopeByteString.concatenate(ByteString, ByteString)>
	//   28   64:areturn         
	}

	public abstract void copyTo(ByteBuffer bytebuffer);

	public void copyTo(byte abyte0[], int i)
	{
		copyTo(abyte0, 0, i, size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iload_2         
	//    4    4:aload_0         
	//    5    5:invokevirtual   #290 <Method int size()>
	//    6    8:invokevirtual   #305 <Method void copyTo(byte[], int, int, int)>
	//    7   11:return          
	}

	public final void copyTo(byte abyte0[], int i, int j, int k)
	{
		checkRange(i, i + k, size());
	//    0    0:iload_2         
	//    1    1:iload_2         
	//    2    2:iload           4
	//    3    4:iadd            
	//    4    5:aload_0         
	//    5    6:invokevirtual   #290 <Method int size()>
	//    6    9:invokestatic    #307 <Method int checkRange(int, int, int)>
	//    7   12:pop             
		checkRange(j, j + k, abyte0.length);
	//    8   13:iload_3         
	//    9   14:iload_3         
	//   10   15:iload           4
	//   11   17:iadd            
	//   12   18:aload_1         
	//   13   19:arraylength     
	//   14   20:invokestatic    #307 <Method int checkRange(int, int, int)>
	//   15   23:pop             
		if(k > 0)
	//*  16   24:iload           4
	//*  17   26:ifle            38
			copyToInternal(abyte0, i, j, k);
	//   18   29:aload_0         
	//   19   30:aload_1         
	//   20   31:iload_2         
	//   21   32:iload_3         
	//   22   33:iload           4
	//   23   35:invokevirtual   #310 <Method void copyToInternal(byte[], int, int, int)>
	//   24   38:return          
	}

	protected abstract void copyToInternal(byte abyte0[], int i, int j, int k);

	public final boolean endsWith(ByteString bytestring)
	{
		return size() >= bytestring.size() && substring(size() - bytestring.size()).equals(((Object) (bytestring)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method int size()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #290 <Method int size()>
	//    4    8:icmplt          33
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #290 <Method int size()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #290 <Method int size()>
	//   10   20:isub            
	//   11   21:invokevirtual   #316 <Method ByteString substring(int)>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #319 <Method boolean equals(Object)>
	//   14   28:ifeq            33
	//   15   31:iconst_1        
	//   16   32:ireturn         
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	public abstract boolean equals(Object obj);

	protected abstract int getTreeDepth();

	public final int hashCode()
	{
		int j = hash;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int hash>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            37
		{
			i = size();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #290 <Method int size()>
	//    9   15:istore_1        
			int k = partialHash(i, 0, i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iconst_0        
	//   13   19:iload_1         
	//   14   20:invokevirtual   #324 <Method int partialHash(int, int, int)>
	//   15   23:istore_2        
			i = k;
	//   16   24:iload_2         
	//   17   25:istore_1        
			if(k == 0)
	//*  18   26:iload_2         
	//*  19   27:ifne            32
				i = 1;
	//   20   30:iconst_1        
	//   21   31:istore_1        
			hash = i;
	//   22   32:aload_0         
	//   23   33:iload_1         
	//   24   34:putfield        #85  <Field int hash>
		}
		return i;
	//   25   37:iload_1         
	//   26   38:ireturn         
	}

	protected abstract boolean isBalanced();

	public final boolean isEmpty()
	{
		return size() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method int size()>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract boolean isValidUtf8();

	public final ByteIterator iterator()
	{
		return new ByteIterator() {

			public boolean hasNext()
			{
				return position < limit;
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field int position>
			//    2    4:aload_0         
			//    3    5:getfield        #31  <Field int limit>
			//    4    8:icmpge          13
			//    5   11:iconst_1        
			//    6   12:ireturn         
			//    7   13:iconst_0        
			//    8   14:ireturn         
			}

			public Byte next()
			{
				return Byte.valueOf(nextByte());
			//    0    0:aload_0         
			//    1    1:invokevirtual   #40  <Method byte nextByte()>
			//    2    4:invokestatic    #46  <Method Byte Byte.valueOf(byte)>
			//    3    7:areturn         
			}

			public volatile Object next()
			{
				return ((Object) (next()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #49  <Method Byte next()>
			//    2    4:areturn         
			}

			public byte nextByte()
			{
				byte byte0;
				try
				{
					ByteString bytestring = ByteString.this;
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field ByteString this$0>
			//    2    4:astore_3        
					int i = position;
			//    3    5:aload_0         
			//    4    6:getfield        #25  <Field int position>
			//    5    9:istore_2        
					position = i + 1;
			//    6   10:aload_0         
			//    7   11:iload_2         
			//    8   12:iconst_1        
			//    9   13:iadd            
			//   10   14:putfield        #25  <Field int position>
					byte0 = bytestring.byteAt(i);
			//   11   17:aload_3         
			//   12   18:iload_2         
			//   13   19:invokevirtual   #55  <Method byte ByteString.byteAt(int)>
			//   14   22:istore_1        
				}
			//*  15   23:iload_1         
			//*  16   24:ireturn         
				catch(IndexOutOfBoundsException indexoutofboundsexception)
			//*  17   25:astore_3        
				{
					throw new NoSuchElementException(indexoutofboundsexception.getMessage());
			//   18   26:new             #57  <Class NoSuchElementException>
			//   19   29:dup             
			//   20   30:aload_3         
			//   21   31:invokevirtual   #61  <Method String IndexOutOfBoundsException.getMessage()>
			//   22   34:invokespecial   #64  <Method void NoSuchElementException(String)>
			//   23   37:athrow          
				}
				return byte0;
			}

			public void remove()
			{
				throw new UnsupportedOperationException();
			//    0    0:new             #67  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:invokespecial   #68  <Method void UnsupportedOperationException()>
			//    3    7:athrow          
			}

			private final int limit;
			private int position;
			final ByteString this$0;

			
			{
				this$0 = ByteString.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field ByteString this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
				position = 0;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #25  <Field int position>
				limit = size();
			//    8   14:aload_0         
			//    9   15:aload_0         
			//   10   16:getfield        #20  <Field ByteString this$0>
			//   11   19:invokevirtual   #29  <Method int ByteString.size()>
			//   12   22:putfield        #31  <Field int limit>
			//   13   25:return          
			}
		}
;
	//    0    0:new             #11  <Class ByteString$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #331 <Method void ByteString$1(ByteString)>
	//    4    8:areturn         
	}

	public volatile Iterator iterator()
	{
		return ((Iterator) (iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #333 <Method ByteString$ByteIterator iterator()>
	//    2    4:areturn         
	}

	public abstract CodedInputStream newCodedInput();

	public abstract InputStream newInput();

	protected abstract int partialHash(int i, int j, int k);

	protected abstract int partialIsValidUtf8(int i, int j, int k);

	protected final int peekCachedHashCode()
	{
		return hash;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int hash>
	//    2    4:ireturn         
	}

	public abstract int size();

	public final boolean startsWith(ByteString bytestring)
	{
		return size() >= bytestring.size() && substring(0, bytestring.size()).equals(((Object) (bytestring)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method int size()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #290 <Method int size()>
	//    4    8:icmplt          29
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:invokevirtual   #290 <Method int size()>
	//    9   17:invokevirtual   #343 <Method ByteString substring(int, int)>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #319 <Method boolean equals(Object)>
	//   12   24:ifeq            29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public final ByteString substring(int i)
	{
		return substring(i, size());
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #290 <Method int size()>
	//    4    6:invokevirtual   #343 <Method ByteString substring(int, int)>
	//    5    9:areturn         
	}

	public abstract ByteString substring(int i, int j);

	public final byte[] toByteArray()
	{
		int i = size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #290 <Method int size()>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
		{
			return Internal.EMPTY_BYTE_ARRAY;
	//    5    9:getstatic       #60  <Field byte[] Internal.EMPTY_BYTE_ARRAY>
	//    6   12:areturn         
		} else
		{
			byte abyte0[] = new byte[i];
	//    7   13:iload_1         
	//    8   14:newarray        byte[]
	//    9   16:astore_2        
			copyToInternal(abyte0, 0, 0, i);
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:iconst_0        
	//   13   20:iconst_0        
	//   14   21:iload_1         
	//   15   22:invokevirtual   #310 <Method void copyToInternal(byte[], int, int, int)>
			return abyte0;
	//   16   25:aload_2         
	//   17   26:areturn         
		}
	}

	public final String toString()
	{
		return String.format("<ByteString@%s size=%d>", new Object[] {
			Integer.toHexString(System.identityHashCode(((Object) (this)))), Integer.valueOf(size())
		});
	//    0    0:ldc2            #346 <String "<ByteString@%s size=%d>">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:invokestatic    #352 <Method int System.identityHashCode(Object)>
	//    7   13:invokestatic    #356 <Method String Integer.toHexString(int)>
	//    8   16:aastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:aload_0         
	//   12   20:invokevirtual   #290 <Method int size()>
	//   13   23:invokestatic    #97  <Method Integer Integer.valueOf(int)>
	//   14   26:aastore         
	//   15   27:invokestatic    #103 <Method String String.format(String, Object[])>
	//   16   30:areturn         
	}

	public final String toString(String s)
		throws UnsupportedEncodingException
	{
		String s1;
		try
		{
			s1 = toString(Charset.forName(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #364 <Method Charset Charset.forName(String)>
	//    3    5:invokevirtual   #367 <Method String toString(Charset)>
	//    4    8:astore_2        
		}
	//*   5    9:aload_2         
	//*   6   10:areturn         
		catch(UnsupportedCharsetException unsupportedcharsetexception)
	//*   7   11:astore_2        
		{
			s = ((String) (new UnsupportedEncodingException(s)));
	//    8   12:new             #180 <Class UnsupportedEncodingException>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #368 <Method void UnsupportedEncodingException(String)>
	//   12   20:astore_1        
			((UnsupportedEncodingException) (s)).initCause(((Throwable) (unsupportedcharsetexception)));
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #372 <Method Throwable UnsupportedEncodingException.initCause(Throwable)>
	//   16   26:pop             
			throw s;
	//   17   27:aload_1         
	//   18   28:athrow          
		}
		return s1;
	}

	public final String toString(Charset charset)
	{
		if(size() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #290 <Method int size()>
	//*   2    4:ifne            11
			return "";
	//    3    7:ldc2            #374 <String "">
	//    4   10:areturn         
		else
			return toStringInternal(charset);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #377 <Method String toStringInternal(Charset)>
	//    8   16:areturn         
	}

	protected abstract String toStringInternal(Charset charset);

	public final String toStringUtf8()
	{
		return toString(Internal.UTF_8);
	//    0    0:aload_0         
	//    1    1:getstatic       #215 <Field Charset Internal.UTF_8>
	//    2    4:invokevirtual   #367 <Method String toString(Charset)>
	//    3    7:areturn         
	}

	abstract void writeTo(ByteOutput byteoutput)
		throws IOException;

	public abstract void writeTo(OutputStream outputstream)
		throws IOException;

	final void writeTo(OutputStream outputstream, int i, int j)
		throws IOException
	{
		checkRange(i, i + j, size());
	//    0    0:iload_2         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iadd            
	//    4    4:aload_0         
	//    5    5:invokevirtual   #290 <Method int size()>
	//    6    8:invokestatic    #307 <Method int checkRange(int, int, int)>
	//    7   11:pop             
		if(j > 0)
	//*   8   12:iload_3         
	//*   9   13:ifle            23
			writeToInternal(outputstream, i, j);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:iload_3         
	//   14   20:invokevirtual   #385 <Method void writeToInternal(OutputStream, int, int)>
	//   15   23:return          
	}

	abstract void writeToInternal(OutputStream outputstream, int i, int j)
		throws IOException;

	static final int CONCATENATE_BY_COPY_SIZE = 128;
	public static final ByteString EMPTY;
	static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
	static final int MIN_READ_FROM_CHUNK_SIZE = 256;
	private static final ByteArrayCopier byteArrayCopier;
	private int hash;

	static 
	{
		EMPTY = ((ByteString) (new LiteralByteString(Internal.EMPTY_BYTE_ARRAY)));
	//    0    0:new             #31  <Class ByteString$LiteralByteString>
	//    1    3:dup             
	//    2    4:getstatic       #60  <Field byte[] Internal.EMPTY_BYTE_ARRAY>
	//    3    7:invokespecial   #64  <Method void ByteString$LiteralByteString(byte[])>
	//    4   10:putstatic       #66  <Field ByteString EMPTY>
		boolean flag = true;
	//    5   13:iconst_1        
	//    6   14:istore_0        
		try
		{
			Class.forName("android.content.Context");
	//    7   15:ldc1            #68  <String "android.content.Context">
	//    8   17:invokestatic    #74  <Method Class Class.forName(String)>
	//    9   20:pop             
		}
	//*  10   21:goto            27
		catch(ClassNotFoundException classnotfoundexception)
	//*  11   24:astore_1        
		{
			flag = false;
	//   12   25:iconst_0        
	//   13   26:istore_0        
		}
		Object obj;
		if(flag)
	//*  14   27:iload_0         
	//*  15   28:ifeq            43
			obj = ((Object) (new SystemByteArrayCopier()));
	//   16   31:new             #37  <Class ByteString$SystemByteArrayCopier>
	//   17   34:dup             
	//   18   35:aconst_null     
	//   19   36:invokespecial   #77  <Method void ByteString$SystemByteArrayCopier(ByteString$1)>
	//   20   39:astore_1        
		else
	//*  21   40:goto            52
			obj = ((Object) (new ArraysByteArrayCopier()));
	//   22   43:new             #13  <Class ByteString$ArraysByteArrayCopier>
	//   23   46:dup             
	//   24   47:aconst_null     
	//   25   48:invokespecial   #78  <Method void ByteString$ArraysByteArrayCopier(ByteString$1)>
	//   26   51:astore_1        
		byteArrayCopier = ((ByteArrayCopier) (obj));
	//   27   52:aload_1         
	//   28   53:putstatic       #80  <Field ByteString$ByteArrayCopier byteArrayCopier>
	//*  29   56:return          
	}
}
