// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			CodedInputStream, Internal, ByteString, InvalidProtocolBufferException, 
//			Parser, MessageLite, WireFormat, Utf8, 
//			ExtensionRegistryLite, CodedOutputStream

static final class CodedInputStream$StreamDecoder extends CodedInputStream
{
	static interface RefillCallback
	{

		public abstract void onRefill();
	}

	class SkippedDataSink
		implements RefillCallback
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
		final CodedInputStream.StreamDecoder this$0;

		private SkippedDataSink()
		{
			this$0 = CodedInputStream.StreamDecoder.this;
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
	static int access$500(CodedInputStream$StreamDecoder codedinputstream$streamdecoder)
	{
		return codedinputstream$streamdecoder.pos;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int pos>
	//    2    4:ireturn         
	}

*/


/*
	static byte[] access$600(CodedInputStream$StreamDecoder codedinputstream$streamdecoder)
	{
		return codedinputstream$streamdecoder.buffer;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field byte[] buffer>
	//    2    4:areturn         
	}

*/

	private CodedInputStream$StreamDecoder(InputStream inputstream, int i)
	{
		super(((CodedInputStream._cls1) (null)));
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

	CodedInputStream$StreamDecoder(InputStream inputstream, int i, CodedInputStream._cls1 _pcls1)
	{
		this(inputstream, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #55  <Method void CodedInputStream$StreamDecoder(InputStream, int)>
	//    4    6:return          
	}
}
