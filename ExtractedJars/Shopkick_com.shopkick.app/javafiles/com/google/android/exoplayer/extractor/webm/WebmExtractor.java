// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//			DefaultEbmlReader, EbmlReader, VarintReader, Sniffer, 
//			EbmlReaderOutput

public final class WebmExtractor
	implements Extractor
{
	private final class InnerEbmlReaderOutput
		implements EbmlReaderOutput
	{

		public void binaryElement(int i, int j, ExtractorInput extractorinput)
			throws IOException, InterruptedException
		{
			WebmExtractor.this.binaryElement(i, j, extractorinput);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:iload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #30  <Method void WebmExtractor.binaryElement(int, int, ExtractorInput)>
		//    6   10:return          
		}

		public void endMasterElement(int i)
			throws ParserException
		{
			WebmExtractor.this.endMasterElement(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #37  <Method void WebmExtractor.endMasterElement(int)>
		//    4    8:return          
		}

		public void floatElement(int i, double d)
			throws ParserException
		{
			WebmExtractor.this.floatElement(i, d);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:dload_2         
		//    4    6:invokevirtual   #41  <Method void WebmExtractor.floatElement(int, double)>
		//    5    9:return          
		}

		public int getElementType(int i)
		{
			return WebmExtractor.this.getElementType(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #45  <Method int WebmExtractor.getElementType(int)>
		//    4    8:ireturn         
		}

		public void integerElement(int i, long l)
			throws ParserException
		{
			WebmExtractor.this.integerElement(i, l);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #49  <Method void WebmExtractor.integerElement(int, long)>
		//    5    9:return          
		}

		public boolean isLevel1Element(int i)
		{
			return WebmExtractor.this.isLevel1Element(i);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #53  <Method boolean WebmExtractor.isLevel1Element(int)>
		//    4    8:ireturn         
		}

		public void startMasterElement(int i, long l, long l1)
			throws ParserException
		{
			WebmExtractor.this.startMasterElement(i, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:lload_2         
		//    4    6:lload           4
		//    5    8:invokevirtual   #57  <Method void WebmExtractor.startMasterElement(int, long, long)>
		//    6   11:return          
		}

		public void stringElement(int i, String s)
			throws ParserException
		{
			WebmExtractor.this.stringElement(i, s);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field WebmExtractor this$0>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #61  <Method void WebmExtractor.stringElement(int, String)>
		//    5    9:return          
		}

		final WebmExtractor this$0;

		private InnerEbmlReaderOutput()
		{
			this$0 = WebmExtractor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field WebmExtractor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private static final class Track
	{

		private static Pair parseAvcCodecPrivate(ParsableByteArray parsablebytearray)
			throws ParserException
		{
			int i;
			boolean flag;
			int j;
			int k;
			ArrayList arraylist;
			try
			{
				parsablebytearray.setPosition(4);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
				j = (parsablebytearray.readUnsignedByte() & 3) + 1;
		//    3    5:aload_0         
		//    4    6:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
		//    5    9:iconst_3        
		//    6   10:iand            
		//    7   11:iconst_1        
		//    8   12:iadd            
		//    9   13:istore_3        
			}
		//*  10   14:iload_3         
		//*  11   15:iconst_3        
		//*  12   16:icmpeq          109
		//*  13   19:new             #93  <Class ArrayList>
		//*  14   22:dup             
		//*  15   23:invokespecial   #94  <Method void ArrayList()>
		//*  16   26:astore          5
		//*  17   28:aload_0         
		//*  18   29:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
		//*  19   32:istore          4
		//*  20   34:iconst_0        
		//*  21   35:istore_2        
		//*  22   36:iconst_0        
		//*  23   37:istore_1        
		//*  24   38:iload_1         
		//*  25   39:iload           4
		//*  26   41:bipush          31
		//*  27   43:iand            
		//*  28   44:icmpge          66
		//*  29   47:aload           5
		//*  30   49:aload_0         
		//*  31   50:invokestatic    #100 <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
		//*  32   53:invokeinterface #106 <Method boolean List.add(Object)>
		//*  33   58:pop             
		//*  34   59:iload_1         
		//*  35   60:iconst_1        
		//*  36   61:iadd            
		//*  37   62:istore_1        
		//*  38   63:goto            38
		//*  39   66:aload_0         
		//*  40   67:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
		//*  41   70:istore          4
		//*  42   72:iload_2         
		//*  43   73:istore_1        
		//*  44   74:iload_1         
		//*  45   75:iload           4
		//*  46   77:icmpge          99
		//*  47   80:aload           5
		//*  48   82:aload_0         
		//*  49   83:invokestatic    #100 <Method byte[] NalUnitUtil.parseChildNalUnit(ParsableByteArray)>
		//*  50   86:invokeinterface #106 <Method boolean List.add(Object)>
		//*  51   91:pop             
		//*  52   92:iload_1         
		//*  53   93:iconst_1        
		//*  54   94:iadd            
		//*  55   95:istore_1        
		//*  56   96:goto            74
		//*  57   99:aload           5
		//*  58  101:iload_3         
		//*  59  102:invokestatic    #112 <Method Integer Integer.valueOf(int)>
		//*  60  105:invokestatic    #118 <Method Pair Pair.create(Object, Object)>
		//*  61  108:areturn         
		//*  62  109:new             #79  <Class ParserException>
		//*  63  112:dup             
		//*  64  113:invokespecial   #119 <Method void ParserException()>
		//*  65  116:athrow          
		//*  66  117:new             #79  <Class ParserException>
		//*  67  120:dup             
		//*  68  121:ldc1            #121 <String "Error parsing AVC codec private">
		//*  69  123:invokespecial   #124 <Method void ParserException(String)>
		//*  70  126:athrow          
			// Misplaced declaration of an exception variable
			catch(ParsableByteArray parsablebytearray)
			{
				throw new ParserException("Error parsing AVC codec private");
			}
			if(j == 3)
				break MISSING_BLOCK_LABEL_109;
			arraylist = new ArrayList();
			k = parsablebytearray.readUnsignedByte();
			flag = false;
			i = 0;
_L2:
			if(i >= (k & 0x1f))
				break; /* Loop/switch isn't completed */
			((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
			i++;
			if(true) goto _L2; else goto _L1
_L1:
			k = parsablebytearray.readUnsignedByte();
			i = ((int) (flag));
_L4:
			if(i >= k)
				break; /* Loop/switch isn't completed */
			((List) (arraylist)).add(((Object) (NalUnitUtil.parseChildNalUnit(parsablebytearray))));
			i++;
			if(true) goto _L4; else goto _L3
_L3:
			return Pair.create(((Object) (arraylist)), ((Object) (Integer.valueOf(j))));
			throw new ParserException();
		//*  71  127:astore_0        
		//*  72  128:goto            117
		}

		private static List parseFourCcVc1Private(ParsableByteArray parsablebytearray)
			throws ParserException
		{
			int i;
			long l;
			try
			{
				parsablebytearray.skipBytes(16);
		//    0    0:aload_0         
		//    1    1:bipush          16
		//    2    3:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
				l = parsablebytearray.readLittleEndianUnsignedInt();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #136 <Method long ParsableByteArray.readLittleEndianUnsignedInt()>
		//    5   10:lstore_2        
			}
		//*   6   11:lload_2         
		//*   7   12:ldc2w           #137 <Long 0x31435657L>
		//*   8   15:lcmp            
		//*   9   16:ifne            94
		//*  10   19:aload_0         
		//*  11   20:invokevirtual   #141 <Method int ParsableByteArray.getPosition()>
		//*  12   23:bipush          20
		//*  13   25:iadd            
		//*  14   26:istore_1        
		//*  15   27:aload_0         
		//*  16   28:getfield        #144 <Field byte[] ParsableByteArray.data>
		//*  17   31:astore_0        
		//*  18   32:iload_1         
		//*  19   33:aload_0         
		//*  20   34:arraylength     
		//*  21   35:iconst_4        
		//*  22   36:isub            
		//*  23   37:icmpge          84
		//*  24   40:aload_0         
		//*  25   41:iload_1         
		//*  26   42:baload          
		//*  27   43:ifne            141
		//*  28   46:aload_0         
		//*  29   47:iload_1         
		//*  30   48:iconst_1        
		//*  31   49:iadd            
		//*  32   50:baload          
		//*  33   51:ifne            141
		//*  34   54:aload_0         
		//*  35   55:iload_1         
		//*  36   56:iconst_2        
		//*  37   57:iadd            
		//*  38   58:baload          
		//*  39   59:iconst_1        
		//*  40   60:icmpne          141
		//*  41   63:aload_0         
		//*  42   64:iload_1         
		//*  43   65:iconst_3        
		//*  44   66:iadd            
		//*  45   67:baload          
		//*  46   68:bipush          15
		//*  47   70:icmpne          141
		//*  48   73:aload_0         
		//*  49   74:iload_1         
		//*  50   75:aload_0         
		//*  51   76:arraylength     
		//*  52   77:invokestatic    #150 <Method byte[] Arrays.copyOfRange(byte[], int, int)>
		//*  53   80:invokestatic    #156 <Method List Collections.singletonList(Object)>
		//*  54   83:areturn         
		//*  55   84:new             #79  <Class ParserException>
		//*  56   87:dup             
		//*  57   88:ldc1            #158 <String "Failed to find FourCC VC1 initialization data">
		//*  58   90:invokespecial   #124 <Method void ParserException(String)>
		//*  59   93:athrow          
		//*  60   94:new             #160 <Class StringBuilder>
		//*  61   97:dup             
		//*  62   98:invokespecial   #161 <Method void StringBuilder()>
		//*  63  101:astore_0        
		//*  64  102:aload_0         
		//*  65  103:ldc1            #163 <String "Unsupported FourCC compression type: ">
		//*  66  105:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//*  67  108:pop             
		//*  68  109:aload_0         
		//*  69  110:lload_2         
		//*  70  111:invokevirtual   #170 <Method StringBuilder StringBuilder.append(long)>
		//*  71  114:pop             
		//*  72  115:new             #79  <Class ParserException>
		//*  73  118:dup             
		//*  74  119:aload_0         
		//*  75  120:invokevirtual   #174 <Method String StringBuilder.toString()>
		//*  76  123:invokespecial   #124 <Method void ParserException(String)>
		//*  77  126:athrow          
		//*  78  127:new             #79  <Class ParserException>
		//*  79  130:dup             
		//*  80  131:ldc1            #176 <String "Error parsing FourCC VC1 codec private">
		//*  81  133:invokespecial   #124 <Method void ParserException(String)>
		//*  82  136:athrow          
			// Misplaced declaration of an exception variable
			catch(ParsableByteArray parsablebytearray)
			{
				throw new ParserException("Error parsing FourCC VC1 codec private");
			}
			if(l != 0x31435657L) goto _L2; else goto _L1
_L1:
			i = parsablebytearray.getPosition() + 20;
			parsablebytearray = ((ParsableByteArray) (parsablebytearray.data));
_L5:
			if(i >= parsablebytearray.length - 4) goto _L4; else goto _L3
_L3:
			if(parsablebytearray[i] != 0 || parsablebytearray[i + 1] != 0 || parsablebytearray[i + 2] != 1 || parsablebytearray[i + 3] != 15)
				break MISSING_BLOCK_LABEL_141;
			return Collections.singletonList(((Object) (Arrays.copyOfRange(((byte []) (parsablebytearray)), i, parsablebytearray.length))));
_L4:
			throw new ParserException("Failed to find FourCC VC1 initialization data");
_L2:
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
			((StringBuilder) (parsablebytearray)).append("Unsupported FourCC compression type: ");
			((StringBuilder) (parsablebytearray)).append(l);
			throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
		//*  83  137:astore_0        
		//*  84  138:goto            127
			i++;
		//   85  141:iload_1         
		//   86  142:iconst_1        
		//   87  143:iadd            
		//   88  144:istore_1        
			  goto _L5
		//*  89  145:goto            32
		}

		private static Pair parseHevcCodecPrivate(ParsableByteArray parsablebytearray)
			throws ParserException
		{
			int i;
			int j;
			int k;
			int l;
			int i1;
			int j1;
			int k1;
			int l1;
			byte abyte0[];
			try
			{
				parsablebytearray.setPosition(21);
		//    0    0:aload_0         
		//    1    1:bipush          21
		//    2    3:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
				i1 = parsablebytearray.readUnsignedByte();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
		//    5   10:istore          5
				j1 = parsablebytearray.readUnsignedByte();
		//    6   12:aload_0         
		//    7   13:invokevirtual   #91  <Method int ParsableByteArray.readUnsignedByte()>
		//    8   16:istore          6
				l = parsablebytearray.getPosition();
		//    9   18:aload_0         
		//   10   19:invokevirtual   #141 <Method int ParsableByteArray.getPosition()>
		//   11   22:istore          4
			}
		//*  12   24:iconst_0        
		//*  13   25:istore_2        
		//*  14   26:iload_2         
		//*  15   27:istore_1        
		//*  16   28:iload_2         
		//*  17   29:iload           6
		//*  18   31:icmpge          79
		//*  19   34:aload_0         
		//*  20   35:iconst_1        
		//*  21   36:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
		//*  22   39:aload_0         
		//*  23   40:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
		//*  24   43:istore          7
		//*  25   45:iconst_0        
		//*  26   46:istore_3        
		//*  27   47:iload_3         
		//*  28   48:iload           7
		//*  29   50:icmpge          220
		//*  30   53:aload_0         
		//*  31   54:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
		//*  32   57:istore          8
		//*  33   59:iload_1         
		//*  34   60:iload           8
		//*  35   62:iconst_4        
		//*  36   63:iadd            
		//*  37   64:iadd            
		//*  38   65:istore_1        
		//*  39   66:aload_0         
		//*  40   67:iload           8
		//*  41   69:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
		//*  42   72:iload_3         
		//*  43   73:iconst_1        
		//*  44   74:iadd            
		//*  45   75:istore_3        
		//*  46   76:goto            47
		//*  47   79:aload_0         
		//*  48   80:iload           4
		//*  49   82:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
		//*  50   85:iload_1         
		//*  51   86:newarray        byte[]
		//*  52   88:astore          9
		//*  53   90:iconst_0        
		//*  54   91:istore_3        
		//*  55   92:iload_3         
		//*  56   93:istore_2        
		//*  57   94:iload_3         
		//*  58   95:iload           6
		//*  59   97:icmpge          234
		//*  60  100:aload_0         
		//*  61  101:iconst_1        
		//*  62  102:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
		//*  63  105:aload_0         
		//*  64  106:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
		//*  65  109:istore          7
		//*  66  111:iconst_0        
		//*  67  112:istore          4
		//*  68  114:iload           4
		//*  69  116:iload           7
		//*  70  118:icmpge          227
		//*  71  121:aload_0         
		//*  72  122:invokevirtual   #181 <Method int ParsableByteArray.readUnsignedShort()>
		//*  73  125:istore          8
		//*  74  127:getstatic       #184 <Field byte[] NalUnitUtil.NAL_START_CODE>
		//*  75  130:iconst_0        
		//*  76  131:aload           9
		//*  77  133:iload_2         
		//*  78  134:getstatic       #184 <Field byte[] NalUnitUtil.NAL_START_CODE>
		//*  79  137:arraylength     
		//*  80  138:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  81  141:iload_2         
		//*  82  142:getstatic       #184 <Field byte[] NalUnitUtil.NAL_START_CODE>
		//*  83  145:arraylength     
		//*  84  146:iadd            
		//*  85  147:istore_2        
		//*  86  148:aload_0         
		//*  87  149:getfield        #144 <Field byte[] ParsableByteArray.data>
		//*  88  152:aload_0         
		//*  89  153:invokevirtual   #141 <Method int ParsableByteArray.getPosition()>
		//*  90  156:aload           9
		//*  91  158:iload_2         
		//*  92  159:iload           8
		//*  93  161:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  94  164:iload_2         
		//*  95  165:iload           8
		//*  96  167:iadd            
		//*  97  168:istore_2        
		//*  98  169:aload_0         
		//*  99  170:iload           8
		//* 100  172:invokevirtual   #132 <Method void ParsableByteArray.skipBytes(int)>
		//* 101  175:iload           4
		//* 102  177:iconst_1        
		//* 103  178:iadd            
		//* 104  179:istore          4
		//* 105  181:goto            114
		//* 106  184:aload           9
		//* 107  186:invokestatic    #156 <Method List Collections.singletonList(Object)>
		//* 108  189:astore_0        
		//* 109  190:aload_0         
		//* 110  191:iload           5
		//* 111  193:iconst_3        
		//* 112  194:iand            
		//* 113  195:iconst_1        
		//* 114  196:iadd            
		//* 115  197:invokestatic    #112 <Method Integer Integer.valueOf(int)>
		//* 116  200:invokestatic    #118 <Method Pair Pair.create(Object, Object)>
		//* 117  203:astore_0        
		//* 118  204:aload_0         
		//* 119  205:areturn         
		//* 120  206:new             #79  <Class ParserException>
		//* 121  209:dup             
		//* 122  210:ldc1            #192 <String "Error parsing HEVC codec private">
		//* 123  212:invokespecial   #124 <Method void ParserException(String)>
		//* 124  215:athrow          
			// Misplaced declaration of an exception variable
			catch(ParsableByteArray parsablebytearray)
			{
				throw new ParserException("Error parsing HEVC codec private");
			}
			j = 0;
			i = j;
_L9:
			if(j >= j1) goto _L2; else goto _L1
_L1:
			parsablebytearray.skipBytes(1);
			k1 = parsablebytearray.readUnsignedShort();
			k = 0;
_L4:
			if(k >= k1)
				break; /* Loop/switch isn't completed */
			l1 = parsablebytearray.readUnsignedShort();
			i += l1 + 4;
			parsablebytearray.skipBytes(l1);
			k++;
			if(true) goto _L4; else goto _L3
_L2:
			parsablebytearray.setPosition(l);
			abyte0 = new byte[i];
			k = 0;
			j = k;
_L10:
			if(k >= j1) goto _L6; else goto _L5
_L5:
			parsablebytearray.skipBytes(1);
			k1 = parsablebytearray.readUnsignedShort();
			l = 0;
_L8:
			if(l >= k1)
				continue; /* Loop/switch isn't completed */
			l1 = parsablebytearray.readUnsignedShort();
			System.arraycopy(((Object) (NalUnitUtil.NAL_START_CODE)), 0, ((Object) (abyte0)), j, NalUnitUtil.NAL_START_CODE.length);
			j += NalUnitUtil.NAL_START_CODE.length;
			System.arraycopy(((Object) (parsablebytearray.data)), parsablebytearray.getPosition(), ((Object) (abyte0)), j, l1);
			j += l1;
			parsablebytearray.skipBytes(l1);
			l++;
			if(true) goto _L8; else goto _L7
_L7:
			continue; /* Loop/switch isn't completed */
_L12:
			parsablebytearray = ((ParsableByteArray) (Collections.singletonList(((Object) (abyte0)))));
_L13:
			parsablebytearray = ((ParsableByteArray) (Pair.create(((Object) (parsablebytearray)), ((Object) (Integer.valueOf((i1 & 3) + 1))))));
			return ((Pair) (parsablebytearray));
		//* 125  216:astore_0        
		//* 126  217:goto            206
_L3:
			j++;
		//  127  220:iload_2         
		//  128  221:iconst_1        
		//  129  222:iadd            
		//  130  223:istore_2        
			  goto _L9
		//* 131  224:goto            28
			k++;
		//  132  227:iload_3         
		//  133  228:iconst_1        
		//  134  229:iadd            
		//  135  230:istore_3        
			  goto _L10
		//* 136  231:goto            94
_L6:
			if(i != 0) goto _L12; else goto _L11
		//  137  234:iload_1         
		//  138  235:ifne            184
_L11:
			parsablebytearray = null;
		//  139  238:aconst_null     
		//  140  239:astore_0        
			  goto _L13
		//* 141  240:goto            190
		}

		private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsablebytearray)
			throws ParserException
		{
			int i;
			long l;
			long l1;
			try
			{
				i = parsablebytearray.readLittleEndianUnsignedShort();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #197 <Method int ParsableByteArray.readLittleEndianUnsignedShort()>
		//    2    4:istore_1        
			}
		//*   3    5:iload_1         
		//*   4    6:iconst_1        
		//*   5    7:icmpne          12
		//*   6   10:iconst_1        
		//*   7   11:ireturn         
		//*   8   12:iload_1         
		//*   9   13:ldc1            #198 <Int 65534>
		//*  10   15:icmpne          62
		//*  11   18:aload_0         
		//*  12   19:bipush          24
		//*  13   21:invokevirtual   #87  <Method void ParsableByteArray.setPosition(int)>
		//*  14   24:aload_0         
		//*  15   25:invokevirtual   #201 <Method long ParsableByteArray.readLong()>
		//*  16   28:invokestatic    #205 <Method UUID WebmExtractor.access$300()>
		//*  17   31:invokevirtual   #210 <Method long UUID.getMostSignificantBits()>
		//*  18   34:lcmp            
		//*  19   35:ifne            60
		//*  20   38:aload_0         
		//*  21   39:invokevirtual   #201 <Method long ParsableByteArray.readLong()>
		//*  22   42:lstore_2        
		//*  23   43:invokestatic    #205 <Method UUID WebmExtractor.access$300()>
		//*  24   46:invokevirtual   #213 <Method long UUID.getLeastSignificantBits()>
		//*  25   49:lstore          4
		//*  26   51:lload_2         
		//*  27   52:lload           4
		//*  28   54:lcmp            
		//*  29   55:ifne            60
		//*  30   58:iconst_1        
		//*  31   59:ireturn         
		//*  32   60:iconst_0        
		//*  33   61:ireturn         
		//*  34   62:iconst_0        
		//*  35   63:ireturn         
		//*  36   64:new             #79  <Class ParserException>
		//*  37   67:dup             
		//*  38   68:ldc1            #215 <String "Error parsing MS/ACM codec private">
		//*  39   70:invokespecial   #124 <Method void ParserException(String)>
		//*  40   73:athrow          
			// Misplaced declaration of an exception variable
			catch(ParsableByteArray parsablebytearray)
			{
				throw new ParserException("Error parsing MS/ACM codec private");
			}
			if(i == 1)
				return true;
			if(i != 65534)
				break MISSING_BLOCK_LABEL_62;
			parsablebytearray.setPosition(24);
			if(parsablebytearray.readLong() != WebmExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits())
				break MISSING_BLOCK_LABEL_60;
			l = parsablebytearray.readLong();
			l1 = WebmExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits();
			if(l == l1)
				return true;
			return false;
			return false;
		//*  41   74:astore_0        
		//*  42   75:goto            64
		}

		private static List parseVorbisCodecPrivate(byte abyte0[])
			throws ParserException
		{
			if(abyte0[0] != 2)
				break MISSING_BLOCK_LABEL_149;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:baload          
		//    3    3:iconst_2        
		//    4    4:icmpne          149
			int j = 0;
		//    5    7:iconst_0        
		//    6    8:istore_2        
			int i;
			int k;
			int i1;
			byte abyte1[];
			byte abyte2[];
			for(i = 1; abyte0[i] == -1; i++)
		//*   7    9:iconst_1        
		//*   8   10:istore_1        
		//*   9   11:goto            173
		//*  10   14:iload_2         
		//*  11   15:iconst_1        
		//*  12   16:iadd            
		//*  13   17:istore_3        
		//*  14   18:aload_0         
		//*  15   19:iload_2         
		//*  16   20:baload          
		//*  17   21:istore_2        
		//*  18   22:aload_0         
		//*  19   23:iload_3         
		//*  20   24:baload          
		//*  21   25:iconst_1        
		//*  22   26:icmpne          139
		//*  23   29:iload           4
		//*  24   31:newarray        byte[]
		//*  25   33:astore          5
		//*  26   35:aload_0         
		//*  27   36:iload_3         
		//*  28   37:aload           5
		//*  29   39:iconst_0        
		//*  30   40:iload           4
		//*  31   42:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  32   45:iload_3         
		//*  33   46:iload           4
		//*  34   48:iadd            
		//*  35   49:istore_3        
		//*  36   50:aload_0         
		//*  37   51:iload_3         
		//*  38   52:baload          
		//*  39   53:iconst_3        
		//*  40   54:icmpne          129
		//*  41   57:iload_3         
		//*  42   58:iload_1         
		//*  43   59:iload_2         
		//*  44   60:iadd            
		//*  45   61:iadd            
		//*  46   62:istore_1        
		//*  47   63:aload_0         
		//*  48   64:iload_1         
		//*  49   65:baload          
		//*  50   66:iconst_5        
		//*  51   67:icmpne          119
		//*  52   70:aload_0         
		//*  53   71:arraylength     
		//*  54   72:iload_1         
		//*  55   73:isub            
		//*  56   74:newarray        byte[]
		//*  57   76:astore          6
		//*  58   78:aload_0         
		//*  59   79:iload_1         
		//*  60   80:aload           6
		//*  61   82:iconst_0        
		//*  62   83:aload_0         
		//*  63   84:arraylength     
		//*  64   85:iload_1         
		//*  65   86:isub            
		//*  66   87:invokestatic    #190 <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  67   90:new             #93  <Class ArrayList>
		//*  68   93:dup             
		//*  69   94:iconst_2        
		//*  70   95:invokespecial   #219 <Method void ArrayList(int)>
		//*  71   98:astore_0        
		//*  72   99:aload_0         
		//*  73  100:aload           5
		//*  74  102:invokeinterface #106 <Method boolean List.add(Object)>
		//*  75  107:pop             
		//*  76  108:aload_0         
		//*  77  109:aload           6
		//*  78  111:invokeinterface #106 <Method boolean List.add(Object)>
		//*  79  116:pop             
		//*  80  117:aload_0         
		//*  81  118:areturn         
		//*  82  119:new             #79  <Class ParserException>
		//*  83  122:dup             
		//*  84  123:ldc1            #221 <String "Error parsing vorbis codec private">
		//*  85  125:invokespecial   #124 <Method void ParserException(String)>
		//*  86  128:athrow          
		//*  87  129:new             #79  <Class ParserException>
		//*  88  132:dup             
		//*  89  133:ldc1            #221 <String "Error parsing vorbis codec private">
		//*  90  135:invokespecial   #124 <Method void ParserException(String)>
		//*  91  138:athrow          
		//*  92  139:new             #79  <Class ParserException>
		//*  93  142:dup             
		//*  94  143:ldc1            #221 <String "Error parsing vorbis codec private">
		//*  95  145:invokespecial   #124 <Method void ParserException(String)>
		//*  96  148:athrow          
		//*  97  149:new             #79  <Class ParserException>
		//*  98  152:dup             
		//*  99  153:ldc1            #221 <String "Error parsing vorbis codec private">
		//* 100  155:invokespecial   #124 <Method void ParserException(String)>
		//* 101  158:athrow          
		//* 102  159:new             #79  <Class ParserException>
		//* 103  162:dup             
		//* 104  163:ldc1            #221 <String "Error parsing vorbis codec private">
		//* 105  165:invokespecial   #124 <Method void ParserException(String)>
		//* 106  168:athrow          
		//* 107  169:astore_0        
		//* 108  170:goto            159
		//* 109  173:aload_0         
		//* 110  174:iload_1         
		//* 111  175:baload          
		//* 112  176:iconst_m1       
		//* 113  177:icmpne          193
				j += 255;
		//  114  180:iload_2         
		//  115  181:sipush          255
		//  116  184:iadd            
		//  117  185:istore_2        

		//  118  186:iload_1         
		//  119  187:iconst_1        
		//  120  188:iadd            
		//  121  189:istore_1        
		//* 122  190:goto            173
			int l = i + 1;
		//  123  193:iload_1         
		//  124  194:iconst_1        
		//  125  195:iadd            
		//  126  196:istore_3        
			i1 = j + abyte0[i];
		//  127  197:iload_2         
		//  128  198:aload_0         
		//  129  199:iload_1         
		//  130  200:baload          
		//  131  201:iadd            
		//  132  202:istore          4
			i = 0;
		//  133  204:iconst_0        
		//  134  205:istore_1        
			j = l;
		//  135  206:iload_3         
		//  136  207:istore_2        
			while(abyte0[j] == -1) 
		//* 137  208:aload_0         
		//* 138  209:iload_2         
		//* 139  210:baload          
		//* 140  211:iconst_m1       
		//* 141  212:icmpne          14
			{
				i += 255;
		//  142  215:iload_1         
		//  143  216:sipush          255
		//  144  219:iadd            
		//  145  220:istore_1        
				j++;
		//  146  221:iload_2         
		//  147  222:iconst_1        
		//  148  223:iadd            
		//  149  224:istore_2        
			}
			k = j + 1;
			j = ((int) (abyte0[j]));
			if(abyte0[k] != 1)
				break MISSING_BLOCK_LABEL_139;
			try
			{
				abyte1 = new byte[i1];
				System.arraycopy(((Object) (abyte0)), k, ((Object) (abyte1)), 0, i1);
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				throw new ParserException("Error parsing vorbis codec private");
			}
			k += i1;
			if(abyte0[k] != 3)
				break MISSING_BLOCK_LABEL_129;
			i = k + (i + j);
			if(abyte0[i] != 5)
				break MISSING_BLOCK_LABEL_119;
			abyte2 = new byte[abyte0.length - i];
			System.arraycopy(((Object) (abyte0)), i, ((Object) (abyte2)), 0, abyte0.length - i);
			abyte0 = ((byte []) (new ArrayList(2)));
			((List) (abyte0)).add(((Object) (abyte1)));
			((List) (abyte0)).add(((Object) (abyte2)));
			return ((List) (abyte0));
			throw new ParserException("Error parsing vorbis codec private");
			throw new ParserException("Error parsing vorbis codec private");
			throw new ParserException("Error parsing vorbis codec private");
			throw new ParserException("Error parsing vorbis codec private");
		//* 150  225:goto            208
		}

		public void initializeOutput(ExtractorOutput extractoroutput, int i, long l)
			throws ParserException
		{
			Object obj;
label0:
			{
				Object obj1;
label1:
				{
					float f;
					char c;
label2:
					{
label3:
						{
							String s = codecId;
		//    0    0:aload_0         
		//    1    1:getfield        #226 <Field String codecId>
		//    2    4:astore          9
							switch(s.hashCode())
		//*   3    6:aload           9
		//*   4    8:invokevirtual   #231 <Method int String.hashCode()>
							{
							default:
								break;

		//*   5   11:lookupswitch    25: default 220
		//		               -2095576542: 640
		//		               -2095575984: 623
		//		               -1985379776: 605
		//		               -1784763192: 587
		//		               -1730367663: 569
		//		               -1482641357: 551
		//		               -1373388978: 533
		//		               -538363189: 516
		//		               -538363109: 498
		//		               -425012669: 480
		//		               -356037306: 462
		//		               62923557: 444
		//		               62923603: 426
		//		               62927045: 408
		//		               82338133: 391
		//		               82338134: 375
		//		               99146302: 358
		//		               542569478: 341
		//		               725957860: 324
		//		               855502857: 307
		//		               1422270023: 290
		//		               1809237540: 274
		//		               1950749482: 257
		//		               1950789798: 240
		//		               1951062397: 223
		//*   6  220:goto            657
							case 1951062397: 
								if(s.equals("A_OPUS"))
		//*   7  223:aload           9
		//*   8  225:ldc1            #233 <String "A_OPUS">
		//*   9  227:invokevirtual   #236 <Method boolean String.equals(Object)>
		//*  10  230:ifeq            657
								{
									c = '\n';
		//   11  233:bipush          10
		//   12  235:istore          6
									break label3;
		//   13  237:goto            660
								}
								break;

							case 1950789798: 
								if(!s.equals("A_FLAC"))
									break;
		//   14  240:aload           9
		//   15  242:ldc1            #238 <String "A_FLAC">
		//   16  244:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   17  247:ifeq            657
								c = '\023';
		//   18  250:bipush          19
		//   19  252:istore          6
								break label3;
		//   20  254:goto            660

							case 1950749482: 
								if(!s.equals("A_EAC3"))
									break;
		//   21  257:aload           9
		//   22  259:ldc1            #240 <String "A_EAC3">
		//   23  261:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   24  264:ifeq            657
								c = '\016';
		//   25  267:bipush          14
		//   26  269:istore          6
								break label3;
		//   27  271:goto            660

							case 1809237540: 
								if(!s.equals("V_MPEG2"))
									break;
		//   28  274:aload           9
		//   29  276:ldc1            #242 <String "V_MPEG2">
		//   30  278:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   31  281:ifeq            657
								c = '\002';
		//   32  284:iconst_2        
		//   33  285:istore          6
								break label3;
		//   34  287:goto            660

							case 1422270023: 
								if(!s.equals("S_TEXT/UTF8"))
									break;
		//   35  290:aload           9
		//   36  292:ldc1            #244 <String "S_TEXT/UTF8">
		//   37  294:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   38  297:ifeq            657
								c = '\026';
		//   39  300:bipush          22
		//   40  302:istore          6
								break label3;
		//   41  304:goto            660

							case 855502857: 
								if(!s.equals("V_MPEGH/ISO/HEVC"))
									break;
		//   42  307:aload           9
		//   43  309:ldc1            #246 <String "V_MPEGH/ISO/HEVC">
		//   44  311:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   45  314:ifeq            657
								c = '\007';
		//   46  317:bipush          7
		//   47  319:istore          6
								break label3;
		//   48  321:goto            660

							case 725957860: 
								if(!s.equals("A_PCM/INT/LIT"))
									break;
		//   49  324:aload           9
		//   50  326:ldc1            #248 <String "A_PCM/INT/LIT">
		//   51  328:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   52  331:ifeq            657
								c = '\025';
		//   53  334:bipush          21
		//   54  336:istore          6
								break label3;
		//   55  338:goto            660

							case 542569478: 
								if(!s.equals("A_DTS/EXPRESS"))
									break;
		//   56  341:aload           9
		//   57  343:ldc1            #250 <String "A_DTS/EXPRESS">
		//   58  345:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   59  348:ifeq            657
								c = '\021';
		//   60  351:bipush          17
		//   61  353:istore          6
								break label3;
		//   62  355:goto            660

							case 99146302: 
								if(!s.equals("S_HDMV/PGS"))
									break;
		//   63  358:aload           9
		//   64  360:ldc1            #252 <String "S_HDMV/PGS">
		//   65  362:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   66  365:ifeq            657
								c = '\030';
		//   67  368:bipush          24
		//   68  370:istore          6
								break label3;
		//   69  372:goto            660

							case 82338134: 
								if(!s.equals("V_VP9"))
									break;
		//   70  375:aload           9
		//   71  377:ldc1            #254 <String "V_VP9">
		//   72  379:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   73  382:ifeq            657
								c = '\001';
		//   74  385:iconst_1        
		//   75  386:istore          6
								break label3;
		//   76  388:goto            660

							case 82338133: 
								if(!s.equals("V_VP8"))
									break;
		//   77  391:aload           9
		//   78  393:ldc2            #256 <String "V_VP8">
		//   79  396:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   80  399:ifeq            657
								c = '\0';
		//   81  402:iconst_0        
		//   82  403:istore          6
								break label3;
		//   83  405:goto            660

							case 62927045: 
								if(!s.equals("A_DTS"))
									break;
		//   84  408:aload           9
		//   85  410:ldc2            #258 <String "A_DTS">
		//   86  413:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   87  416:ifeq            657
								c = '\020';
		//   88  419:bipush          16
		//   89  421:istore          6
								break label3;
		//   90  423:goto            660

							case 62923603: 
								if(!s.equals("A_AC3"))
									break;
		//   91  426:aload           9
		//   92  428:ldc2            #260 <String "A_AC3">
		//   93  431:invokevirtual   #236 <Method boolean String.equals(Object)>
		//   94  434:ifeq            657
								c = '\r';
		//   95  437:bipush          13
		//   96  439:istore          6
								break label3;
		//   97  441:goto            660

							case 62923557: 
								if(!s.equals("A_AAC"))
									break;
		//   98  444:aload           9
		//   99  446:ldc2            #262 <String "A_AAC">
		//  100  449:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  101  452:ifeq            657
								c = '\013';
		//  102  455:bipush          11
		//  103  457:istore          6
								break label3;
		//  104  459:goto            660

							case -356037306: 
								if(!s.equals("A_DTS/LOSSLESS"))
									break;
		//  105  462:aload           9
		//  106  464:ldc2            #264 <String "A_DTS/LOSSLESS">
		//  107  467:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  108  470:ifeq            657
								c = '\022';
		//  109  473:bipush          18
		//  110  475:istore          6
								break label3;
		//  111  477:goto            660

							case -425012669: 
								if(!s.equals("S_VOBSUB"))
									break;
		//  112  480:aload           9
		//  113  482:ldc2            #266 <String "S_VOBSUB">
		//  114  485:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  115  488:ifeq            657
								c = '\027';
		//  116  491:bipush          23
		//  117  493:istore          6
								break label3;
		//  118  495:goto            660

							case -538363109: 
								if(!s.equals("V_MPEG4/ISO/AVC"))
									break;
		//  119  498:aload           9
		//  120  500:ldc2            #268 <String "V_MPEG4/ISO/AVC">
		//  121  503:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  122  506:ifeq            657
								c = '\006';
		//  123  509:bipush          6
		//  124  511:istore          6
								break label3;
		//  125  513:goto            660

							case -538363189: 
								if(!s.equals("V_MPEG4/ISO/ASP"))
									break;
		//  126  516:aload           9
		//  127  518:ldc2            #270 <String "V_MPEG4/ISO/ASP">
		//  128  521:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  129  524:ifeq            657
								c = '\004';
		//  130  527:iconst_4        
		//  131  528:istore          6
								break label3;
		//  132  530:goto            660

							case -1373388978: 
								if(!s.equals("V_MS/VFW/FOURCC"))
									break;
		//  133  533:aload           9
		//  134  535:ldc2            #272 <String "V_MS/VFW/FOURCC">
		//  135  538:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  136  541:ifeq            657
								c = '\b';
		//  137  544:bipush          8
		//  138  546:istore          6
								break label3;
		//  139  548:goto            660

							case -1482641357: 
								if(!s.equals("A_MPEG/L3"))
									break;
		//  140  551:aload           9
		//  141  553:ldc2            #274 <String "A_MPEG/L3">
		//  142  556:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  143  559:ifeq            657
								c = '\f';
		//  144  562:bipush          12
		//  145  564:istore          6
								break label3;
		//  146  566:goto            660

							case -1730367663: 
								if(!s.equals("A_VORBIS"))
									break;
		//  147  569:aload           9
		//  148  571:ldc2            #276 <String "A_VORBIS">
		//  149  574:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  150  577:ifeq            657
								c = '\t';
		//  151  580:bipush          9
		//  152  582:istore          6
								break label3;
		//  153  584:goto            660

							case -1784763192: 
								if(!s.equals("A_TRUEHD"))
									break;
		//  154  587:aload           9
		//  155  589:ldc2            #278 <String "A_TRUEHD">
		//  156  592:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  157  595:ifeq            657
								c = '\017';
		//  158  598:bipush          15
		//  159  600:istore          6
								break label3;
		//  160  602:goto            660

							case -1985379776: 
								if(!s.equals("A_MS/ACM"))
									break;
		//  161  605:aload           9
		//  162  607:ldc2            #280 <String "A_MS/ACM">
		//  163  610:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  164  613:ifeq            657
								c = '\024';
		//  165  616:bipush          20
		//  166  618:istore          6
								break label3;
		//  167  620:goto            660

							case -2095575984: 
								if(!s.equals("V_MPEG4/ISO/SP"))
									break;
		//  168  623:aload           9
		//  169  625:ldc2            #282 <String "V_MPEG4/ISO/SP">
		//  170  628:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  171  631:ifeq            657
								c = '\003';
		//  172  634:iconst_3        
		//  173  635:istore          6
								break label3;
		//  174  637:goto            660

							case -2095576542: 
								if(!s.equals("V_MPEG4/ISO/AP"))
									break;
		//  175  640:aload           9
		//  176  642:ldc2            #284 <String "V_MPEG4/ISO/AP">
		//  177  645:invokevirtual   #236 <Method boolean String.equals(Object)>
		//  178  648:ifeq            657
								c = '\005';
		//  179  651:iconst_5        
		//  180  652:istore          6
								break label3;
		//  181  654:goto            660
							}
							c = '\uFFFF';
		//  182  657:iconst_m1       
		//  183  658:istore          6
						}
						obj1 = null;
		//  184  660:aconst_null     
		//  185  661:astore          10
						obj = null;
		//  186  663:aconst_null     
		//  187  664:astore          9
						int j;
						switch(c)
		//* 188  666:iload           6
						{
		//* 189  668:tableswitch     0 24: default 784
		//		               0 1474
		//		               1 1459
		//		               2 1444
		//		               3 1404
		//		               4 1404
		//		               5 1404
		//		               6 1348
		//		               7 1292
		//		               8 1261
		//		               9 1236
		//		               10 1140
		//		               11 1116
		//		               12 1100
		//		               13 1085
		//		               14 1070
		//		               15 1055
		//		               16 1040
		//		               17 1040
		//		               18 1025
		//		               19 1001
		//		               20 911
		//		               21 849
		//		               22 834
		//		               23 810
		//		               24 795
						default:
							throw new ParserException("Unrecognized codec identifier.");
		//  190  784:new             #79  <Class ParserException>
		//  191  787:dup             
		//  192  788:ldc2            #286 <String "Unrecognized codec identifier.">
		//  193  791:invokespecial   #124 <Method void ParserException(String)>
		//  194  794:athrow          

						case 24: // '\030'
							obj = "application/pgs";
		//  195  795:ldc2            #288 <String "application/pgs">
		//  196  798:astore          9
							c = '\uFFFF';
		//  197  800:iconst_m1       
		//  198  801:istore          6
							j = ((int) (c));
		//  199  803:iload           6
		//  200  805:istore          7
							break;

		//* 201  807:goto            1486
						case 23: // '\027'
							obj1 = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
		//  202  810:aload_0         
		//  203  811:getfield        #290 <Field byte[] codecPrivate>
		//  204  814:invokestatic    #156 <Method List Collections.singletonList(Object)>
		//  205  817:astore          10
							obj = "application/vobsub";
		//  206  819:ldc2            #292 <String "application/vobsub">
		//  207  822:astore          9
							c = '\uFFFF';
		//  208  824:iconst_m1       
		//  209  825:istore          6
							j = ((int) (c));
		//  210  827:iload           6
		//  211  829:istore          7
							break;

		//* 212  831:goto            1486
						case 22: // '\026'
							obj = "application/x-subrip";
		//  213  834:ldc2            #294 <String "application/x-subrip">
		//  214  837:astore          9
							c = '\uFFFF';
		//  215  839:iconst_m1       
		//  216  840:istore          6
							j = ((int) (c));
		//  217  842:iload           6
		//  218  844:istore          7
							break;

		//* 219  846:goto            1486
						case 21: // '\025'
							j = Util.getPcmEncoding(audioBitDepth);
		//  220  849:aload_0         
		//  221  850:getfield        #60  <Field int audioBitDepth>
		//  222  853:invokestatic    #300 <Method int Util.getPcmEncoding(int)>
		//  223  856:istore          7
							if(j != 0)
		//* 224  858:iload           7
		//* 225  860:ifeq            874
							{
								obj = "audio/raw";
		//  226  863:ldc2            #302 <String "audio/raw">
		//  227  866:astore          9
								c = '\uFFFF';
		//  228  868:iconst_m1       
		//  229  869:istore          6
							} else
		//* 230  871:goto            1486
							{
								extractoroutput = ((ExtractorOutput) (new StringBuilder()));
		//  231  874:new             #160 <Class StringBuilder>
		//  232  877:dup             
		//  233  878:invokespecial   #161 <Method void StringBuilder()>
		//  234  881:astore_1        
								((StringBuilder) (extractoroutput)).append("Unsupported PCM bit depth: ");
		//  235  882:aload_1         
		//  236  883:ldc2            #304 <String "Unsupported PCM bit depth: ">
		//  237  886:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  238  889:pop             
								((StringBuilder) (extractoroutput)).append(audioBitDepth);
		//  239  890:aload_1         
		//  240  891:aload_0         
		//  241  892:getfield        #60  <Field int audioBitDepth>
		//  242  895:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
		//  243  898:pop             
								throw new ParserException(((StringBuilder) (extractoroutput)).toString());
		//  244  899:new             #79  <Class ParserException>
		//  245  902:dup             
		//  246  903:aload_1         
		//  247  904:invokevirtual   #174 <Method String StringBuilder.toString()>
		//  248  907:invokespecial   #124 <Method void ParserException(String)>
		//  249  910:athrow          
							}
							break;

						case 20: // '\024'
							if(parseMsAcmCodecPrivate(new ParsableByteArray(codecPrivate)))
		//* 250  911:new             #83  <Class ParsableByteArray>
		//* 251  914:dup             
		//* 252  915:aload_0         
		//* 253  916:getfield        #290 <Field byte[] codecPrivate>
		//* 254  919:invokespecial   #310 <Method void ParsableByteArray(byte[])>
		//* 255  922:invokestatic    #312 <Method boolean parseMsAcmCodecPrivate(ParsableByteArray)>
		//* 256  925:ifeq            990
							{
								j = Util.getPcmEncoding(audioBitDepth);
		//  257  928:aload_0         
		//  258  929:getfield        #60  <Field int audioBitDepth>
		//  259  932:invokestatic    #300 <Method int Util.getPcmEncoding(int)>
		//  260  935:istore          7
								if(j != 0)
		//* 261  937:iload           7
		//* 262  939:ifeq            953
								{
									obj = "audio/raw";
		//  263  942:ldc2            #302 <String "audio/raw">
		//  264  945:astore          9
									c = '\uFFFF';
		//  265  947:iconst_m1       
		//  266  948:istore          6
								} else
		//* 267  950:goto            1486
								{
									extractoroutput = ((ExtractorOutput) (new StringBuilder()));
		//  268  953:new             #160 <Class StringBuilder>
		//  269  956:dup             
		//  270  957:invokespecial   #161 <Method void StringBuilder()>
		//  271  960:astore_1        
									((StringBuilder) (extractoroutput)).append("Unsupported PCM bit depth: ");
		//  272  961:aload_1         
		//  273  962:ldc2            #304 <String "Unsupported PCM bit depth: ">
		//  274  965:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
		//  275  968:pop             
									((StringBuilder) (extractoroutput)).append(audioBitDepth);
		//  276  969:aload_1         
		//  277  970:aload_0         
		//  278  971:getfield        #60  <Field int audioBitDepth>
		//  279  974:invokevirtual   #307 <Method StringBuilder StringBuilder.append(int)>
		//  280  977:pop             
									throw new ParserException(((StringBuilder) (extractoroutput)).toString());
		//  281  978:new             #79  <Class ParserException>
		//  282  981:dup             
		//  283  982:aload_1         
		//  284  983:invokevirtual   #174 <Method String StringBuilder.toString()>
		//  285  986:invokespecial   #124 <Method void ParserException(String)>
		//  286  989:athrow          
								}
							} else
							{
								throw new ParserException("Non-PCM MS/ACM is unsupported");
		//  287  990:new             #79  <Class ParserException>
		//  288  993:dup             
		//  289  994:ldc2            #314 <String "Non-PCM MS/ACM is unsupported">
		//  290  997:invokespecial   #124 <Method void ParserException(String)>
		//  291 1000:athrow          
							}
							break;

						case 19: // '\023'
							obj1 = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
		//  292 1001:aload_0         
		//  293 1002:getfield        #290 <Field byte[] codecPrivate>
		//  294 1005:invokestatic    #156 <Method List Collections.singletonList(Object)>
		//  295 1008:astore          10
							obj = "audio/x-flac";
		//  296 1010:ldc2            #316 <String "audio/x-flac">
		//  297 1013:astore          9
							c = '\uFFFF';
		//  298 1015:iconst_m1       
		//  299 1016:istore          6
							j = ((int) (c));
		//  300 1018:iload           6
		//  301 1020:istore          7
							break;

		//* 302 1022:goto            1486
						case 18: // '\022'
							obj = "audio/vnd.dts.hd";
		//  303 1025:ldc2            #318 <String "audio/vnd.dts.hd">
		//  304 1028:astore          9
							c = '\uFFFF';
		//  305 1030:iconst_m1       
		//  306 1031:istore          6
							j = ((int) (c));
		//  307 1033:iload           6
		//  308 1035:istore          7
							break;

		//* 309 1037:goto            1486
						case 16: // '\020'
						case 17: // '\021'
							obj = "audio/vnd.dts";
		//  310 1040:ldc2            #320 <String "audio/vnd.dts">
		//  311 1043:astore          9
							c = '\uFFFF';
		//  312 1045:iconst_m1       
		//  313 1046:istore          6
							j = ((int) (c));
		//  314 1048:iload           6
		//  315 1050:istore          7
							break;

		//* 316 1052:goto            1486
						case 15: // '\017'
							obj = "audio/true-hd";
		//  317 1055:ldc2            #322 <String "audio/true-hd">
		//  318 1058:astore          9
							c = '\uFFFF';
		//  319 1060:iconst_m1       
		//  320 1061:istore          6
							j = ((int) (c));
		//  321 1063:iload           6
		//  322 1065:istore          7
							break;

		//* 323 1067:goto            1486
						case 14: // '\016'
							obj = "audio/eac3";
		//  324 1070:ldc2            #324 <String "audio/eac3">
		//  325 1073:astore          9
							c = '\uFFFF';
		//  326 1075:iconst_m1       
		//  327 1076:istore          6
							j = ((int) (c));
		//  328 1078:iload           6
		//  329 1080:istore          7
							break;

		//* 330 1082:goto            1486
						case 13: // '\r'
							obj = "audio/ac3";
		//  331 1085:ldc2            #326 <String "audio/ac3">
		//  332 1088:astore          9
							c = '\uFFFF';
		//  333 1090:iconst_m1       
		//  334 1091:istore          6
							j = ((int) (c));
		//  335 1093:iload           6
		//  336 1095:istore          7
							break;

		//* 337 1097:goto            1486
						case 12: // '\f'
							obj = "audio/mpeg";
		//  338 1100:ldc2            #328 <String "audio/mpeg">
		//  339 1103:astore          9
							c = '\u1000';
		//  340 1105:sipush          4096
		//  341 1108:istore          6
							j = -1;
		//  342 1110:iconst_m1       
		//  343 1111:istore          7
							break;

		//* 344 1113:goto            1486
						case 11: // '\013'
							obj1 = ((Object) (Collections.singletonList(((Object) (codecPrivate)))));
		//  345 1116:aload_0         
		//  346 1117:getfield        #290 <Field byte[] codecPrivate>
		//  347 1120:invokestatic    #156 <Method List Collections.singletonList(Object)>
		//  348 1123:astore          10
							obj = "audio/mp4a-latm";
		//  349 1125:ldc2            #330 <String "audio/mp4a-latm">
		//  350 1128:astore          9
							c = '\uFFFF';
		//  351 1130:iconst_m1       
		//  352 1131:istore          6
							j = ((int) (c));
		//  353 1133:iload           6
		//  354 1135:istore          7
							break;

		//* 355 1137:goto            1486
						case 10: // '\n'
							obj1 = ((Object) (new ArrayList(3)));
		//  356 1140:new             #93  <Class ArrayList>
		//  357 1143:dup             
		//  358 1144:iconst_3        
		//  359 1145:invokespecial   #219 <Method void ArrayList(int)>
		//  360 1148:astore          10
							((List) (obj1)).add(((Object) (codecPrivate)));
		//  361 1150:aload           10
		//  362 1152:aload_0         
		//  363 1153:getfield        #290 <Field byte[] codecPrivate>
		//  364 1156:invokeinterface #106 <Method boolean List.add(Object)>
		//  365 1161:pop             
							((List) (obj1)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(codecDelayNs).array())));
		//  366 1162:aload           10
		//  367 1164:bipush          8
		//  368 1166:invokestatic    #336 <Method ByteBuffer ByteBuffer.allocate(int)>
		//  369 1169:invokestatic    #342 <Method ByteOrder ByteOrder.nativeOrder()>
		//  370 1172:invokevirtual   #346 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//  371 1175:aload_0         
		//  372 1176:getfield        #64  <Field long codecDelayNs>
		//  373 1179:invokevirtual   #350 <Method ByteBuffer ByteBuffer.putLong(long)>
		//  374 1182:invokevirtual   #354 <Method byte[] ByteBuffer.array()>
		//  375 1185:invokeinterface #106 <Method boolean List.add(Object)>
		//  376 1190:pop             
							((List) (obj1)).add(((Object) (ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(seekPreRollNs).array())));
		//  377 1191:aload           10
		//  378 1193:bipush          8
		//  379 1195:invokestatic    #336 <Method ByteBuffer ByteBuffer.allocate(int)>
		//  380 1198:invokestatic    #342 <Method ByteOrder ByteOrder.nativeOrder()>
		//  381 1201:invokevirtual   #346 <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//  382 1204:aload_0         
		//  383 1205:getfield        #66  <Field long seekPreRollNs>
		//  384 1208:invokevirtual   #350 <Method ByteBuffer ByteBuffer.putLong(long)>
		//  385 1211:invokevirtual   #354 <Method byte[] ByteBuffer.array()>
		//  386 1214:invokeinterface #106 <Method boolean List.add(Object)>
		//  387 1219:pop             
							obj = "audio/opus";
		//  388 1220:ldc2            #356 <String "audio/opus">
		//  389 1223:astore          9
							c = '\u1680';
		//  390 1225:sipush          5760
		//  391 1228:istore          6
							j = -1;
		//  392 1230:iconst_m1       
		//  393 1231:istore          7
							break;

		//* 394 1233:goto            1486
						case 9: // '\t'
							obj1 = ((Object) (parseVorbisCodecPrivate(codecPrivate)));
		//  395 1236:aload_0         
		//  396 1237:getfield        #290 <Field byte[] codecPrivate>
		//  397 1240:invokestatic    #358 <Method List parseVorbisCodecPrivate(byte[])>
		//  398 1243:astore          10
							obj = "audio/vorbis";
		//  399 1245:ldc2            #360 <String "audio/vorbis">
		//  400 1248:astore          9
							c = '\u2000';
		//  401 1250:sipush          8192
		//  402 1253:istore          6
							j = -1;
		//  403 1255:iconst_m1       
		//  404 1256:istore          7
							break;

		//* 405 1258:goto            1486
						case 8: // '\b'
							obj1 = ((Object) (parseFourCcVc1Private(new ParsableByteArray(codecPrivate))));
		//  406 1261:new             #83  <Class ParsableByteArray>
		//  407 1264:dup             
		//  408 1265:aload_0         
		//  409 1266:getfield        #290 <Field byte[] codecPrivate>
		//  410 1269:invokespecial   #310 <Method void ParsableByteArray(byte[])>
		//  411 1272:invokestatic    #362 <Method List parseFourCcVc1Private(ParsableByteArray)>
		//  412 1275:astore          10
							obj = "video/wvc1";
		//  413 1277:ldc2            #364 <String "video/wvc1">
		//  414 1280:astore          9
							c = '\uFFFF';
		//  415 1282:iconst_m1       
		//  416 1283:istore          6
							j = ((int) (c));
		//  417 1285:iload           6
		//  418 1287:istore          7
							break;

		//* 419 1289:goto            1486
						case 7: // '\007'
							obj = ((Object) (parseHevcCodecPrivate(new ParsableByteArray(codecPrivate))));
		//  420 1292:new             #83  <Class ParsableByteArray>
		//  421 1295:dup             
		//  422 1296:aload_0         
		//  423 1297:getfield        #290 <Field byte[] codecPrivate>
		//  424 1300:invokespecial   #310 <Method void ParsableByteArray(byte[])>
		//  425 1303:invokestatic    #366 <Method Pair parseHevcCodecPrivate(ParsableByteArray)>
		//  426 1306:astore          9
							obj1 = ((Object) ((List)((Pair) (obj)).first));
		//  427 1308:aload           9
		//  428 1310:getfield        #370 <Field Object Pair.first>
		//  429 1313:checkcast       #102 <Class List>
		//  430 1316:astore          10
							nalUnitLengthFieldLength = ((Integer)((Pair) (obj)).second).intValue();
		//  431 1318:aload_0         
		//  432 1319:aload           9
		//  433 1321:getfield        #373 <Field Object Pair.second>
		//  434 1324:checkcast       #108 <Class Integer>
		//  435 1327:invokevirtual   #376 <Method int Integer.intValue()>
		//  436 1330:putfield        #378 <Field int nalUnitLengthFieldLength>
							obj = "video/hevc";
		//  437 1333:ldc2            #380 <String "video/hevc">
		//  438 1336:astore          9
							c = '\uFFFF';
		//  439 1338:iconst_m1       
		//  440 1339:istore          6
							j = ((int) (c));
		//  441 1341:iload           6
		//  442 1343:istore          7
							break;

		//* 443 1345:goto            1486
						case 6: // '\006'
							obj = ((Object) (parseAvcCodecPrivate(new ParsableByteArray(codecPrivate))));
		//  444 1348:new             #83  <Class ParsableByteArray>
		//  445 1351:dup             
		//  446 1352:aload_0         
		//  447 1353:getfield        #290 <Field byte[] codecPrivate>
		//  448 1356:invokespecial   #310 <Method void ParsableByteArray(byte[])>
		//  449 1359:invokestatic    #382 <Method Pair parseAvcCodecPrivate(ParsableByteArray)>
		//  450 1362:astore          9
							obj1 = ((Object) ((List)((Pair) (obj)).first));
		//  451 1364:aload           9
		//  452 1366:getfield        #370 <Field Object Pair.first>
		//  453 1369:checkcast       #102 <Class List>
		//  454 1372:astore          10
							nalUnitLengthFieldLength = ((Integer)((Pair) (obj)).second).intValue();
		//  455 1374:aload_0         
		//  456 1375:aload           9
		//  457 1377:getfield        #373 <Field Object Pair.second>
		//  458 1380:checkcast       #108 <Class Integer>
		//  459 1383:invokevirtual   #376 <Method int Integer.intValue()>
		//  460 1386:putfield        #378 <Field int nalUnitLengthFieldLength>
							obj = "video/avc";
		//  461 1389:ldc2            #384 <String "video/avc">
		//  462 1392:astore          9
							c = '\uFFFF';
		//  463 1394:iconst_m1       
		//  464 1395:istore          6
							j = ((int) (c));
		//  465 1397:iload           6
		//  466 1399:istore          7
							break;

		//* 467 1401:goto            1486
						case 3: // '\003'
						case 4: // '\004'
						case 5: // '\005'
							obj1 = ((Object) (codecPrivate));
		//  468 1404:aload_0         
		//  469 1405:getfield        #290 <Field byte[] codecPrivate>
		//  470 1408:astore          10
							if(obj1 == null)
		//* 471 1410:aload           10
		//* 472 1412:ifnonnull       1422
								obj1 = obj;
		//  473 1415:aload           9
		//  474 1417:astore          10
							else
		//* 475 1419:goto            1429
								obj1 = ((Object) (Collections.singletonList(obj1)));
		//  476 1422:aload           10
		//  477 1424:invokestatic    #156 <Method List Collections.singletonList(Object)>
		//  478 1427:astore          10
							obj = "video/mp4v-es";
		//  479 1429:ldc2            #386 <String "video/mp4v-es">
		//  480 1432:astore          9
							c = '\uFFFF';
		//  481 1434:iconst_m1       
		//  482 1435:istore          6
							j = ((int) (c));
		//  483 1437:iload           6
		//  484 1439:istore          7
							break;

		//* 485 1441:goto            1486
						case 2: // '\002'
							obj = "video/mpeg2";
		//  486 1444:ldc2            #388 <String "video/mpeg2">
		//  487 1447:astore          9
							c = '\uFFFF';
		//  488 1449:iconst_m1       
		//  489 1450:istore          6
							j = ((int) (c));
		//  490 1452:iload           6
		//  491 1454:istore          7
							break;

		//* 492 1456:goto            1486
						case 1: // '\001'
							obj = "video/x-vnd.on2.vp9";
		//  493 1459:ldc2            #390 <String "video/x-vnd.on2.vp9">
		//  494 1462:astore          9
							c = '\uFFFF';
		//  495 1464:iconst_m1       
		//  496 1465:istore          6
							j = ((int) (c));
		//  497 1467:iload           6
		//  498 1469:istore          7
							break;

		//* 499 1471:goto            1486
						case 0: // '\0'
							obj = "video/x-vnd.on2.vp8";
		//  500 1474:ldc2            #392 <String "video/x-vnd.on2.vp8">
		//  501 1477:astore          9
							c = '\uFFFF';
		//  502 1479:iconst_m1       
		//  503 1480:istore          6
							j = ((int) (c));
		//  504 1482:iload           6
		//  505 1484:istore          7
							break;
						}
						if(MimeTypes.isAudio(((String) (obj))))
		//* 506 1486:aload           9
		//* 507 1488:invokestatic    #398 <Method boolean MimeTypes.isAudio(String)>
		//* 508 1491:ifeq            1528
						{
							obj = ((Object) (MediaFormat.createAudioFormat(Integer.toString(i), ((String) (obj)), -1, ((int) (c)), l, channelCount, sampleRate, ((List) (obj1)), language, j)));
		//  509 1494:iload_2         
		//  510 1495:invokestatic    #401 <Method String Integer.toString(int)>
		//  511 1498:aload           9
		//  512 1500:iconst_m1       
		//  513 1501:iload           6
		//  514 1503:lload_3         
		//  515 1504:aload_0         
		//  516 1505:getfield        #58  <Field int channelCount>
		//  517 1508:aload_0         
		//  518 1509:getfield        #62  <Field int sampleRate>
		//  519 1512:aload           10
		//  520 1514:aload_0         
		//  521 1515:getfield        #70  <Field String language>
		//  522 1518:iload           7
		//  523 1520:invokestatic    #407 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, List, String, int)>
		//  524 1523:astore          9
							break label0;
		//  525 1525:goto            1775
						}
						if(!MimeTypes.isVideo(((String) (obj))))
							break label1;
		//  526 1528:aload           9
		//  527 1530:invokestatic    #410 <Method boolean MimeTypes.isVideo(String)>
		//  528 1533:ifeq            1689
						if(displayUnit == 0)
		//* 529 1536:aload_0         
		//* 530 1537:getfield        #52  <Field int displayUnit>
		//* 531 1540:ifne            1599
						{
							int k = displayWidth;
		//  532 1543:aload_0         
		//  533 1544:getfield        #48  <Field int displayWidth>
		//  534 1547:istore          8
							j = k;
		//  535 1549:iload           8
		//  536 1551:istore          7
							if(k == -1)
		//* 537 1553:iload           8
		//* 538 1555:iconst_m1       
		//* 539 1556:icmpne          1565
								j = width;
		//  540 1559:aload_0         
		//  541 1560:getfield        #44  <Field int width>
		//  542 1563:istore          7
							displayWidth = j;
		//  543 1565:aload_0         
		//  544 1566:iload           7
		//  545 1568:putfield        #48  <Field int displayWidth>
							k = displayHeight;
		//  546 1571:aload_0         
		//  547 1572:getfield        #50  <Field int displayHeight>
		//  548 1575:istore          8
							j = k;
		//  549 1577:iload           8
		//  550 1579:istore          7
							if(k == -1)
		//* 551 1581:iload           8
		//* 552 1583:iconst_m1       
		//* 553 1584:icmpne          1593
								j = height;
		//  554 1587:aload_0         
		//  555 1588:getfield        #46  <Field int height>
		//  556 1591:istore          7
							displayHeight = j;
		//  557 1593:aload_0         
		//  558 1594:iload           7
		//  559 1596:putfield        #50  <Field int displayHeight>
						}
						j = displayWidth;
		//  560 1599:aload_0         
		//  561 1600:getfield        #48  <Field int displayWidth>
		//  562 1603:istore          7
						if(j != -1)
		//* 563 1605:iload           7
		//* 564 1607:iconst_m1       
		//* 565 1608:icmpeq          1645
						{
							int i1 = displayHeight;
		//  566 1611:aload_0         
		//  567 1612:getfield        #50  <Field int displayHeight>
		//  568 1615:istore          8
							if(i1 != -1)
		//* 569 1617:iload           8
		//* 570 1619:iconst_m1       
		//* 571 1620:icmpeq          1645
							{
								f = (float)(height * j) / (float)(width * i1);
		//  572 1623:aload_0         
		//  573 1624:getfield        #46  <Field int height>
		//  574 1627:iload           7
		//  575 1629:imul            
		//  576 1630:i2f             
		//  577 1631:aload_0         
		//  578 1632:getfield        #44  <Field int width>
		//  579 1635:iload           8
		//  580 1637:imul            
		//  581 1638:i2f             
		//  582 1639:fdiv            
		//  583 1640:fstore          5
								break label2;
		//  584 1642:goto            1650
							}
						}
						f = -1F;
		//  585 1645:ldc2            #411 <Float -1F>
		//  586 1648:fstore          5
					}
					obj = ((Object) (MediaFormat.createVideoFormat(Integer.toString(i), ((String) (obj)), -1, ((int) (c)), l, width, height, ((List) (obj1)), -1, f, projectionData, stereoMode)));
		//  587 1650:iload_2         
		//  588 1651:invokestatic    #401 <Method String Integer.toString(int)>
		//  589 1654:aload           9
		//  590 1656:iconst_m1       
		//  591 1657:iload           6
		//  592 1659:lload_3         
		//  593 1660:aload_0         
		//  594 1661:getfield        #44  <Field int width>
		//  595 1664:aload_0         
		//  596 1665:getfield        #46  <Field int height>
		//  597 1668:aload           10
		//  598 1670:iconst_m1       
		//  599 1671:fload           5
		//  600 1673:aload_0         
		//  601 1674:getfield        #54  <Field byte[] projectionData>
		//  602 1677:aload_0         
		//  603 1678:getfield        #56  <Field int stereoMode>
		//  604 1681:invokestatic    #415 <Method MediaFormat MediaFormat.createVideoFormat(String, String, int, int, long, int, int, List, int, float, byte[], int)>
		//  605 1684:astore          9
					break label0;
		//  606 1686:goto            1775
				}
				if("application/x-subrip".equals(obj))
		//* 607 1689:ldc2            #294 <String "application/x-subrip">
		//* 608 1692:aload           9
		//* 609 1694:invokevirtual   #236 <Method boolean String.equals(Object)>
		//* 610 1697:ifeq            1720
				{
					obj = ((Object) (MediaFormat.createTextFormat(Integer.toString(i), ((String) (obj)), -1, l, language)));
		//  611 1700:iload_2         
		//  612 1701:invokestatic    #401 <Method String Integer.toString(int)>
		//  613 1704:aload           9
		//  614 1706:iconst_m1       
		//  615 1707:lload_3         
		//  616 1708:aload_0         
		//  617 1709:getfield        #70  <Field String language>
		//  618 1712:invokestatic    #419 <Method MediaFormat MediaFormat.createTextFormat(String, String, int, long, String)>
		//  619 1715:astore          9
				} else
		//* 620 1717:goto            1775
				{
					if(!"application/vobsub".equals(obj) && !"application/pgs".equals(obj))
		//* 621 1720:ldc2            #292 <String "application/vobsub">
		//* 622 1723:aload           9
		//* 623 1725:invokevirtual   #236 <Method boolean String.equals(Object)>
		//* 624 1728:ifne            1756
		//* 625 1731:ldc2            #288 <String "application/pgs">
		//* 626 1734:aload           9
		//* 627 1736:invokevirtual   #236 <Method boolean String.equals(Object)>
		//* 628 1739:ifeq            1745
		//* 629 1742:goto            1756
						throw new ParserException("Unexpected MIME type.");
		//  630 1745:new             #79  <Class ParserException>
		//  631 1748:dup             
		//  632 1749:ldc2            #421 <String "Unexpected MIME type.">
		//  633 1752:invokespecial   #124 <Method void ParserException(String)>
		//  634 1755:athrow          
					obj = ((Object) (MediaFormat.createImageFormat(Integer.toString(i), ((String) (obj)), -1, l, ((List) (obj1)), language)));
		//  635 1756:iload_2         
		//  636 1757:invokestatic    #401 <Method String Integer.toString(int)>
		//  637 1760:aload           9
		//  638 1762:iconst_m1       
		//  639 1763:lload_3         
		//  640 1764:aload           10
		//  641 1766:aload_0         
		//  642 1767:getfield        #70  <Field String language>
		//  643 1770:invokestatic    #425 <Method MediaFormat MediaFormat.createImageFormat(String, String, int, long, List, String)>
		//  644 1773:astore          9
				}
			}
			output = extractoroutput.track(number);
		//  645 1775:aload_0         
		//  646 1776:aload_1         
		//  647 1777:aload_0         
		//  648 1778:getfield        #427 <Field int number>
		//  649 1781:invokeinterface #433 <Method TrackOutput ExtractorOutput.track(int)>
		//  650 1786:putfield        #435 <Field TrackOutput output>
			output.format(((MediaFormat) (obj)));
		//  651 1789:aload_0         
		//  652 1790:getfield        #435 <Field TrackOutput output>
		//  653 1793:aload           9
		//  654 1795:invokeinterface #441 <Method void TrackOutput.format(MediaFormat)>
		//  655 1800:return          
		}

		private static final int DISPLAY_UNIT_PIXELS = 0;
		public int audioBitDepth;
		public int channelCount;
		public long codecDelayNs;
		public String codecId;
		public byte codecPrivate[];
		public int defaultSampleDurationNs;
		public int displayHeight;
		public int displayUnit;
		public int displayWidth;
		public byte encryptionKeyId[];
		public boolean hasContentEncryption;
		public int height;
		private String language;
		public int nalUnitLengthFieldLength;
		public int number;
		public TrackOutput output;
		public byte projectionData[];
		public int sampleRate;
		public byte sampleStrippedBytes[];
		public long seekPreRollNs;
		public int stereoMode;
		public int type;
		public int width;


/*
		static String access$202(Track track, String s)
		{
			track.language = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #70  <Field String language>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/

		private Track()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void Object()>
			width = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #44  <Field int width>
			height = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #46  <Field int height>
			displayWidth = -1;
		//    8   14:aload_0         
		//    9   15:iconst_m1       
		//   10   16:putfield        #48  <Field int displayWidth>
			displayHeight = -1;
		//   11   19:aload_0         
		//   12   20:iconst_m1       
		//   13   21:putfield        #50  <Field int displayHeight>
			displayUnit = 0;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #52  <Field int displayUnit>
			projectionData = null;
		//   17   29:aload_0         
		//   18   30:aconst_null     
		//   19   31:putfield        #54  <Field byte[] projectionData>
			stereoMode = -1;
		//   20   34:aload_0         
		//   21   35:iconst_m1       
		//   22   36:putfield        #56  <Field int stereoMode>
			channelCount = 1;
		//   23   39:aload_0         
		//   24   40:iconst_1        
		//   25   41:putfield        #58  <Field int channelCount>
			audioBitDepth = -1;
		//   26   44:aload_0         
		//   27   45:iconst_m1       
		//   28   46:putfield        #60  <Field int audioBitDepth>
			sampleRate = 8000;
		//   29   49:aload_0         
		//   30   50:sipush          8000
		//   31   53:putfield        #62  <Field int sampleRate>
			codecDelayNs = 0L;
		//   32   56:aload_0         
		//   33   57:lconst_0        
		//   34   58:putfield        #64  <Field long codecDelayNs>
			seekPreRollNs = 0L;
		//   35   61:aload_0         
		//   36   62:lconst_0        
		//   37   63:putfield        #66  <Field long seekPreRollNs>
			language = "eng";
		//   38   66:aload_0         
		//   39   67:ldc1            #68  <String "eng">
		//   40   69:putfield        #70  <Field String language>
		//   41   72:return          
		}

	}


	public WebmExtractor()
	{
		this(((EbmlReader) (new DefaultEbmlReader())));
	//    0    0:aload_0         
	//    1    1:new             #347 <Class DefaultEbmlReader>
	//    2    4:dup             
	//    3    5:invokespecial   #349 <Method void DefaultEbmlReader()>
	//    4    8:invokespecial   #352 <Method void WebmExtractor(EbmlReader)>
	//    5   11:return          
	}

	WebmExtractor(EbmlReader ebmlreader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #353 <Method void Object()>
		segmentContentPosition = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #354 <Long -1L>
	//    4    8:putfield        #357 <Field long segmentContentPosition>
		segmentContentSize = -1L;
	//    5   11:aload_0         
	//    6   12:ldc2w           #354 <Long -1L>
	//    7   15:putfield        #359 <Field long segmentContentSize>
		timecodeScale = -1L;
	//    8   18:aload_0         
	//    9   19:ldc2w           #354 <Long -1L>
	//   10   22:putfield        #361 <Field long timecodeScale>
		durationTimecode = -1L;
	//   11   25:aload_0         
	//   12   26:ldc2w           #354 <Long -1L>
	//   13   29:putfield        #363 <Field long durationTimecode>
		durationUs = -1L;
	//   14   32:aload_0         
	//   15   33:ldc2w           #354 <Long -1L>
	//   16   36:putfield        #365 <Field long durationUs>
		cuesContentPosition = -1L;
	//   17   39:aload_0         
	//   18   40:ldc2w           #354 <Long -1L>
	//   19   43:putfield        #367 <Field long cuesContentPosition>
		seekPositionAfterBuildingCues = -1L;
	//   20   46:aload_0         
	//   21   47:ldc2w           #354 <Long -1L>
	//   22   50:putfield        #369 <Field long seekPositionAfterBuildingCues>
		clusterTimecodeUs = -1L;
	//   23   53:aload_0         
	//   24   54:ldc2w           #354 <Long -1L>
	//   25   57:putfield        #371 <Field long clusterTimecodeUs>
		reader = ebmlreader;
	//   26   60:aload_0         
	//   27   61:aload_1         
	//   28   62:putfield        #373 <Field EbmlReader reader>
		reader.init(((EbmlReaderOutput) (new InnerEbmlReaderOutput())));
	//   29   65:aload_0         
	//   30   66:getfield        #373 <Field EbmlReader reader>
	//   31   69:new             #10  <Class WebmExtractor$InnerEbmlReaderOutput>
	//   32   72:dup             
	//   33   73:aload_0         
	//   34   74:aconst_null     
	//   35   75:invokespecial   #376 <Method void WebmExtractor$InnerEbmlReaderOutput(WebmExtractor, WebmExtractor$1)>
	//   36   78:invokeinterface #382 <Method void EbmlReader.init(EbmlReaderOutput)>
		varintReader = new VarintReader();
	//   37   83:aload_0         
	//   38   84:new             #384 <Class VarintReader>
	//   39   87:dup             
	//   40   88:invokespecial   #385 <Method void VarintReader()>
	//   41   91:putfield        #387 <Field VarintReader varintReader>
		tracks = new SparseArray();
	//   42   94:aload_0         
	//   43   95:new             #389 <Class SparseArray>
	//   44   98:dup             
	//   45   99:invokespecial   #390 <Method void SparseArray()>
	//   46  102:putfield        #392 <Field SparseArray tracks>
		scratch = new ParsableByteArray(4);
	//   47  105:aload_0         
	//   48  106:new             #394 <Class ParsableByteArray>
	//   49  109:dup             
	//   50  110:iconst_4        
	//   51  111:invokespecial   #397 <Method void ParsableByteArray(int)>
	//   52  114:putfield        #399 <Field ParsableByteArray scratch>
		vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
	//   53  117:aload_0         
	//   54  118:new             #394 <Class ParsableByteArray>
	//   55  121:dup             
	//   56  122:iconst_4        
	//   57  123:invokestatic    #405 <Method ByteBuffer ByteBuffer.allocate(int)>
	//   58  126:iconst_m1       
	//   59  127:invokevirtual   #408 <Method ByteBuffer ByteBuffer.putInt(int)>
	//   60  130:invokevirtual   #412 <Method byte[] ByteBuffer.array()>
	//   61  133:invokespecial   #415 <Method void ParsableByteArray(byte[])>
	//   62  136:putfield        #417 <Field ParsableByteArray vorbisNumPageSamples>
		seekEntryIdBytes = new ParsableByteArray(4);
	//   63  139:aload_0         
	//   64  140:new             #394 <Class ParsableByteArray>
	//   65  143:dup             
	//   66  144:iconst_4        
	//   67  145:invokespecial   #397 <Method void ParsableByteArray(int)>
	//   68  148:putfield        #419 <Field ParsableByteArray seekEntryIdBytes>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//   69  151:aload_0         
	//   70  152:new             #394 <Class ParsableByteArray>
	//   71  155:dup             
	//   72  156:getstatic       #424 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   73  159:invokespecial   #415 <Method void ParsableByteArray(byte[])>
	//   74  162:putfield        #426 <Field ParsableByteArray nalStartCode>
		nalLength = new ParsableByteArray(4);
	//   75  165:aload_0         
	//   76  166:new             #394 <Class ParsableByteArray>
	//   77  169:dup             
	//   78  170:iconst_4        
	//   79  171:invokespecial   #397 <Method void ParsableByteArray(int)>
	//   80  174:putfield        #428 <Field ParsableByteArray nalLength>
		sampleStrippedBytes = new ParsableByteArray();
	//   81  177:aload_0         
	//   82  178:new             #394 <Class ParsableByteArray>
	//   83  181:dup             
	//   84  182:invokespecial   #429 <Method void ParsableByteArray()>
	//   85  185:putfield        #431 <Field ParsableByteArray sampleStrippedBytes>
		subripSample = new ParsableByteArray();
	//   86  188:aload_0         
	//   87  189:new             #394 <Class ParsableByteArray>
	//   88  192:dup             
	//   89  193:invokespecial   #429 <Method void ParsableByteArray()>
	//   90  196:putfield        #433 <Field ParsableByteArray subripSample>
		encryptionInitializationVector = new ParsableByteArray(8);
	//   91  199:aload_0         
	//   92  200:new             #394 <Class ParsableByteArray>
	//   93  203:dup             
	//   94  204:bipush          8
	//   95  206:invokespecial   #397 <Method void ParsableByteArray(int)>
	//   96  209:putfield        #435 <Field ParsableByteArray encryptionInitializationVector>
		encryptionSubsampleData = new ParsableByteArray();
	//   97  212:aload_0         
	//   98  213:new             #394 <Class ParsableByteArray>
	//   99  216:dup             
	//  100  217:invokespecial   #429 <Method void ParsableByteArray()>
	//  101  220:putfield        #437 <Field ParsableByteArray encryptionSubsampleData>
	//  102  223:return          
	}

	private SeekMap buildSeekMap()
	{
		if(segmentContentPosition != -1L && durationUs != -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #357 <Field long segmentContentPosition>
	//*   2    4:ldc2w           #354 <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifeq            255
	//*   5   11:aload_0         
	//*   6   12:getfield        #365 <Field long durationUs>
	//*   7   15:ldc2w           #354 <Long -1L>
	//*   8   18:lcmp            
	//*   9   19:ifeq            255
		{
			LongArray longarray = cueTimesUs;
	//   10   22:aload_0         
	//   11   23:getfield        #443 <Field LongArray cueTimesUs>
	//   12   26:astore          5
			if(longarray != null && longarray.size() != 0)
	//*  13   28:aload           5
	//*  14   30:ifnull          255
	//*  15   33:aload           5
	//*  16   35:invokevirtual   #449 <Method int LongArray.size()>
	//*  17   38:ifeq            255
			{
				LongArray longarray1 = cueClusterPositions;
	//   18   41:aload_0         
	//   19   42:getfield        #451 <Field LongArray cueClusterPositions>
	//   20   45:astore          5
				if(longarray1 != null && longarray1.size() == cueTimesUs.size())
	//*  21   47:aload           5
	//*  22   49:ifnull          255
	//*  23   52:aload           5
	//*  24   54:invokevirtual   #449 <Method int LongArray.size()>
	//*  25   57:aload_0         
	//*  26   58:getfield        #443 <Field LongArray cueTimesUs>
	//*  27   61:invokevirtual   #449 <Method int LongArray.size()>
	//*  28   64:icmpeq          70
	//*  29   67:goto            255
				{
					int l = cueTimesUs.size();
	//   30   70:aload_0         
	//   31   71:getfield        #443 <Field LongArray cueTimesUs>
	//   32   74:invokevirtual   #449 <Method int LongArray.size()>
	//   33   77:istore          4
					int ai[] = new int[l];
	//   34   79:iload           4
	//   35   81:newarray        int[]
	//   36   83:astore          5
					long al[] = new long[l];
	//   37   85:iload           4
	//   38   87:newarray        long[]
	//   39   89:astore          6
					long al1[] = new long[l];
	//   40   91:iload           4
	//   41   93:newarray        long[]
	//   42   95:astore          7
					long al2[] = new long[l];
	//   43   97:iload           4
	//   44   99:newarray        long[]
	//   45  101:astore          8
					boolean flag = false;
	//   46  103:iconst_0        
	//   47  104:istore_3        
					int j = 0;
	//   48  105:iconst_0        
	//   49  106:istore_2        
					int i;
					do
					{
						i = ((int) (flag));
	//   50  107:iload_3         
	//   51  108:istore_1        
						if(j >= l)
							break;
	//   52  109:iload_2         
	//   53  110:iload           4
	//   54  112:icmpge          151
						al2[j] = cueTimesUs.get(j);
	//   55  115:aload           8
	//   56  117:iload_2         
	//   57  118:aload_0         
	//   58  119:getfield        #443 <Field LongArray cueTimesUs>
	//   59  122:iload_2         
	//   60  123:invokevirtual   #455 <Method long LongArray.get(int)>
	//   61  126:lastore         
						al[j] = segmentContentPosition + cueClusterPositions.get(j);
	//   62  127:aload           6
	//   63  129:iload_2         
	//   64  130:aload_0         
	//   65  131:getfield        #357 <Field long segmentContentPosition>
	//   66  134:aload_0         
	//   67  135:getfield        #451 <Field LongArray cueClusterPositions>
	//   68  138:iload_2         
	//   69  139:invokevirtual   #455 <Method long LongArray.get(int)>
	//   70  142:ladd            
	//   71  143:lastore         
						j++;
	//   72  144:iload_2         
	//   73  145:iconst_1        
	//   74  146:iadd            
	//   75  147:istore_2        
					} while(true);
	//   76  148:goto            107
					do
					{
						int k = l - 1;
	//   77  151:iload           4
	//   78  153:iconst_1        
	//   79  154:isub            
	//   80  155:istore_2        
						if(i < k)
	//*  81  156:iload_1         
	//*  82  157:iload_2         
	//*  83  158:icmpge          197
						{
							k = i + 1;
	//   84  161:iload_1         
	//   85  162:iconst_1        
	//   86  163:iadd            
	//   87  164:istore_2        
							ai[i] = (int)(al[k] - al[i]);
	//   88  165:aload           5
	//   89  167:iload_1         
	//   90  168:aload           6
	//   91  170:iload_2         
	//   92  171:laload          
	//   93  172:aload           6
	//   94  174:iload_1         
	//   95  175:laload          
	//   96  176:lsub            
	//   97  177:l2i             
	//   98  178:iastore         
							al1[i] = al2[k] - al2[i];
	//   99  179:aload           7
	//  100  181:iload_1         
	//  101  182:aload           8
	//  102  184:iload_2         
	//  103  185:laload          
	//  104  186:aload           8
	//  105  188:iload_1         
	//  106  189:laload          
	//  107  190:lsub            
	//  108  191:lastore         
							i = k;
	//  109  192:iload_2         
	//  110  193:istore_1        
						} else
	//* 111  194:goto            151
						{
							ai[k] = (int)((segmentContentPosition + segmentContentSize) - al[k]);
	//  112  197:aload           5
	//  113  199:iload_2         
	//  114  200:aload_0         
	//  115  201:getfield        #357 <Field long segmentContentPosition>
	//  116  204:aload_0         
	//  117  205:getfield        #359 <Field long segmentContentSize>
	//  118  208:ladd            
	//  119  209:aload           6
	//  120  211:iload_2         
	//  121  212:laload          
	//  122  213:lsub            
	//  123  214:l2i             
	//  124  215:iastore         
							al1[k] = durationUs - al2[k];
	//  125  216:aload           7
	//  126  218:iload_2         
	//  127  219:aload_0         
	//  128  220:getfield        #365 <Field long durationUs>
	//  129  223:aload           8
	//  130  225:iload_2         
	//  131  226:laload          
	//  132  227:lsub            
	//  133  228:lastore         
							cueTimesUs = null;
	//  134  229:aload_0         
	//  135  230:aconst_null     
	//  136  231:putfield        #443 <Field LongArray cueTimesUs>
							cueClusterPositions = null;
	//  137  234:aload_0         
	//  138  235:aconst_null     
	//  139  236:putfield        #451 <Field LongArray cueClusterPositions>
							return ((SeekMap) (new ChunkIndex(ai, al, al1, al2)));
	//  140  239:new             #457 <Class ChunkIndex>
	//  141  242:dup             
	//  142  243:aload           5
	//  143  245:aload           6
	//  144  247:aload           7
	//  145  249:aload           8
	//  146  251:invokespecial   #460 <Method void ChunkIndex(int[], long[], long[], long[])>
	//  147  254:areturn         
						}
					} while(true);
				}
			}
		}
		cueTimesUs = null;
	//  148  255:aload_0         
	//  149  256:aconst_null     
	//  150  257:putfield        #443 <Field LongArray cueTimesUs>
		cueClusterPositions = null;
	//  151  260:aload_0         
	//  152  261:aconst_null     
	//  153  262:putfield        #451 <Field LongArray cueClusterPositions>
		return SeekMap.UNSEEKABLE;
	//  154  265:getstatic       #466 <Field SeekMap SeekMap.UNSEEKABLE>
	//  155  268:areturn         
	}

	private void commitSampleToOutput(Track track, long l)
	{
		if("S_TEXT/UTF8".equals(((Object) (track.codecId))))
	//*   0    0:ldc1            #82  <String "S_TEXT/UTF8">
	//*   1    2:aload_1         
	//*   2    3:getfield        #471 <Field String WebmExtractor$Track.codecId>
	//*   3    6:invokevirtual   #477 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            17
			writeSubripSample(track);
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokespecial   #481 <Method void writeSubripSample(WebmExtractor$Track)>
		track.output.sampleMetadata(l, blockFlags, sampleBytesWritten, 0, track.encryptionKeyId);
	//    8   17:aload_1         
	//    9   18:getfield        #485 <Field TrackOutput WebmExtractor$Track.output>
	//   10   21:lload_2         
	//   11   22:aload_0         
	//   12   23:getfield        #487 <Field int blockFlags>
	//   13   26:aload_0         
	//   14   27:getfield        #489 <Field int sampleBytesWritten>
	//   15   30:iconst_0        
	//   16   31:aload_1         
	//   17   32:getfield        #492 <Field byte[] WebmExtractor$Track.encryptionKeyId>
	//   18   35:invokeinterface #498 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
		sampleRead = true;
	//   19   40:aload_0         
	//   20   41:iconst_1        
	//   21   42:putfield        #500 <Field boolean sampleRead>
		resetSample();
	//   22   45:aload_0         
	//   23   46:invokespecial   #503 <Method void resetSample()>
	//   24   49:return          
	}

	private static int[] ensureArrayCapacity(int ai[], int i)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return new int[i];
	//    2    4:iload_1         
	//    3    5:newarray        int[]
	//    4    7:areturn         
		if(ai.length >= i)
	//*   5    8:aload_0         
	//*   6    9:arraylength     
	//*   7   10:iload_1         
	//*   8   11:icmplt          16
			return ai;
	//    9   14:aload_0         
	//   10   15:areturn         
		else
			return new int[Math.max(ai.length * 2, i)];
	//   11   16:aload_0         
	//   12   17:arraylength     
	//   13   18:iconst_2        
	//   14   19:imul            
	//   15   20:iload_1         
	//   16   21:invokestatic    #511 <Method int Math.max(int, int)>
	//   17   24:newarray        int[]
	//   18   26:areturn         
	}

	private static boolean isCodecSupported(String s)
	{
		return "V_VP8".equals(((Object) (s))) || "V_VP9".equals(((Object) (s))) || "V_MPEG2".equals(((Object) (s))) || "V_MPEG4/ISO/SP".equals(((Object) (s))) || "V_MPEG4/ISO/ASP".equals(((Object) (s))) || "V_MPEG4/ISO/AP".equals(((Object) (s))) || "V_MPEG4/ISO/AVC".equals(((Object) (s))) || "V_MPEGH/ISO/HEVC".equals(((Object) (s))) || "V_MS/VFW/FOURCC".equals(((Object) (s))) || "A_OPUS".equals(((Object) (s))) || "A_VORBIS".equals(((Object) (s))) || "A_AAC".equals(((Object) (s))) || "A_MPEG/L3".equals(((Object) (s))) || "A_AC3".equals(((Object) (s))) || "A_EAC3".equals(((Object) (s))) || "A_TRUEHD".equals(((Object) (s))) || "A_DTS".equals(((Object) (s))) || "A_DTS/EXPRESS".equals(((Object) (s))) || "A_DTS/LOSSLESS".equals(((Object) (s))) || "A_FLAC".equals(((Object) (s))) || "A_MS/ACM".equals(((Object) (s))) || "A_PCM/INT/LIT".equals(((Object) (s))) || "S_TEXT/UTF8".equals(((Object) (s))) || "S_VOBSUB".equals(((Object) (s))) || "S_HDMV/PGS".equals(((Object) (s)));
	//    0    0:ldc1            #94  <String "V_VP8">
	//    1    2:aload_0         
	//    2    3:invokevirtual   #477 <Method boolean String.equals(Object)>
	//    3    6:ifne            230
	//    4    9:ldc1            #97  <String "V_VP9">
	//    5   11:aload_0         
	//    6   12:invokevirtual   #477 <Method boolean String.equals(Object)>
	//    7   15:ifne            230
	//    8   18:ldc1            #61  <String "V_MPEG2">
	//    9   20:aload_0         
	//   10   21:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   11   24:ifne            230
	//   12   27:ldc1            #70  <String "V_MPEG4/ISO/SP">
	//   13   29:aload_0         
	//   14   30:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   15   33:ifne            230
	//   16   36:ldc1            #67  <String "V_MPEG4/ISO/ASP">
	//   17   38:aload_0         
	//   18   39:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   19   42:ifne            230
	//   20   45:ldc1            #64  <String "V_MPEG4/ISO/AP">
	//   21   47:aload_0         
	//   22   48:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   23   51:ifne            230
	//   24   54:ldc1            #52  <String "V_MPEG4/ISO/AVC">
	//   25   56:aload_0         
	//   26   57:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   27   60:ifne            230
	//   28   63:ldc1            #55  <String "V_MPEGH/ISO/HEVC">
	//   29   65:aload_0         
	//   30   66:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   31   69:ifne            230
	//   32   72:ldc1            #49  <String "V_MS/VFW/FOURCC">
	//   33   74:aload_0         
	//   34   75:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   35   78:ifne            230
	//   36   81:ldc1            #73  <String "A_OPUS">
	//   37   83:aload_0         
	//   38   84:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   39   87:ifne            230
	//   40   90:ldc1            #91  <String "A_VORBIS">
	//   41   92:aload_0         
	//   42   93:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   43   96:ifne            230
	//   44   99:ldc1            #25  <String "A_AAC">
	//   45  101:aload_0         
	//   46  102:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   47  105:ifne            230
	//   48  108:ldc1            #58  <String "A_MPEG/L3">
	//   49  110:aload_0         
	//   50  111:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   51  114:ifne            230
	//   52  117:ldc1            #28  <String "A_AC3">
	//   53  119:aload_0         
	//   54  120:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   55  123:ifne            230
	//   56  126:ldc1            #43  <String "A_EAC3">
	//   57  128:aload_0         
	//   58  129:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   59  132:ifne            230
	//   60  135:ldc1            #85  <String "A_TRUEHD">
	//   61  137:aload_0         
	//   62  138:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   63  141:ifne            230
	//   64  144:ldc1            #34  <String "A_DTS">
	//   65  146:aload_0         
	//   66  147:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   67  150:ifne            230
	//   68  153:ldc1            #37  <String "A_DTS/EXPRESS">
	//   69  155:aload_0         
	//   70  156:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   71  159:ifne            230
	//   72  162:ldc1            #40  <String "A_DTS/LOSSLESS">
	//   73  164:aload_0         
	//   74  165:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   75  168:ifne            230
	//   76  171:ldc1            #46  <String "A_FLAC">
	//   77  173:aload_0         
	//   78  174:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   79  177:ifne            230
	//   80  180:ldc1            #31  <String "A_MS/ACM">
	//   81  182:aload_0         
	//   82  183:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   83  186:ifne            230
	//   84  189:ldc1            #76  <String "A_PCM/INT/LIT">
	//   85  191:aload_0         
	//   86  192:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   87  195:ifne            230
	//   88  198:ldc1            #82  <String "S_TEXT/UTF8">
	//   89  200:aload_0         
	//   90  201:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   91  204:ifne            230
	//   92  207:ldc1            #88  <String "S_VOBSUB">
	//   93  209:aload_0         
	//   94  210:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   95  213:ifne            230
	//   96  216:ldc1            #79  <String "S_HDMV/PGS">
	//   97  218:aload_0         
	//   98  219:invokevirtual   #477 <Method boolean String.equals(Object)>
	//   99  222:ifeq            228
	//  100  225:goto            230
	//  101  228:iconst_0        
	//  102  229:ireturn         
	//  103  230:iconst_1        
	//  104  231:ireturn         
	}

	private boolean maybeSeekForCues(PositionHolder positionholder, long l)
	{
		if(seekForCues)
	//*   0    0:aload_0         
	//*   1    1:getfield        #517 <Field boolean seekForCues>
	//*   2    4:ifeq            27
		{
			seekPositionAfterBuildingCues = l;
	//    3    7:aload_0         
	//    4    8:lload_2         
	//    5    9:putfield        #369 <Field long seekPositionAfterBuildingCues>
			positionholder.position = cuesContentPosition;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #367 <Field long cuesContentPosition>
	//    9   17:putfield        #522 <Field long PositionHolder.position>
			seekForCues = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #517 <Field boolean seekForCues>
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		}
		if(sentSeekMap)
	//*  15   27:aload_0         
	//*  16   28:getfield        #524 <Field boolean sentSeekMap>
	//*  17   31:ifeq            61
		{
			l = seekPositionAfterBuildingCues;
	//   18   34:aload_0         
	//   19   35:getfield        #369 <Field long seekPositionAfterBuildingCues>
	//   20   38:lstore_2        
			if(l != -1L)
	//*  21   39:lload_2         
	//*  22   40:ldc2w           #354 <Long -1L>
	//*  23   43:lcmp            
	//*  24   44:ifeq            61
			{
				positionholder.position = l;
	//   25   47:aload_1         
	//   26   48:lload_2         
	//   27   49:putfield        #522 <Field long PositionHolder.position>
				seekPositionAfterBuildingCues = -1L;
	//   28   52:aload_0         
	//   29   53:ldc2w           #354 <Long -1L>
	//   30   56:putfield        #369 <Field long seekPositionAfterBuildingCues>
				return true;
	//   31   59:iconst_1        
	//   32   60:ireturn         
			}
		}
		return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
	}

	private void readScratch(ExtractorInput extractorinput, int i)
		throws IOException, InterruptedException
	{
		if(scratch.limit() >= i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #399 <Field ParsableByteArray scratch>
	//*   2    4:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//*   3    7:iload_2         
	//*   4    8:icmplt          12
			return;
	//    5   11:return          
		if(scratch.capacity() < i)
	//*   6   12:aload_0         
	//*   7   13:getfield        #399 <Field ParsableByteArray scratch>
	//*   8   16:invokevirtual   #536 <Method int ParsableByteArray.capacity()>
	//*   9   19:iload_2         
	//*  10   20:icmpge          60
		{
			ParsableByteArray parsablebytearray = scratch;
	//   11   23:aload_0         
	//   12   24:getfield        #399 <Field ParsableByteArray scratch>
	//   13   27:astore_3        
			parsablebytearray.reset(Arrays.copyOf(parsablebytearray.data, Math.max(scratch.data.length * 2, i)), scratch.limit());
	//   14   28:aload_3         
	//   15   29:aload_3         
	//   16   30:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   17   33:aload_0         
	//   18   34:getfield        #399 <Field ParsableByteArray scratch>
	//   19   37:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   20   40:arraylength     
	//   21   41:iconst_2        
	//   22   42:imul            
	//   23   43:iload_2         
	//   24   44:invokestatic    #511 <Method int Math.max(int, int)>
	//   25   47:invokestatic    #545 <Method byte[] Arrays.copyOf(byte[], int)>
	//   26   50:aload_0         
	//   27   51:getfield        #399 <Field ParsableByteArray scratch>
	//   28   54:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//   29   57:invokevirtual   #549 <Method void ParsableByteArray.reset(byte[], int)>
		}
		extractorinput.readFully(scratch.data, scratch.limit(), i - scratch.limit());
	//   30   60:aload_1         
	//   31   61:aload_0         
	//   32   62:getfield        #399 <Field ParsableByteArray scratch>
	//   33   65:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   34   68:aload_0         
	//   35   69:getfield        #399 <Field ParsableByteArray scratch>
	//   36   72:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//   37   75:iload_2         
	//   38   76:aload_0         
	//   39   77:getfield        #399 <Field ParsableByteArray scratch>
	//   40   80:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//   41   83:isub            
	//   42   84:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
		scratch.setLimit(i);
	//   43   89:aload_0         
	//   44   90:getfield        #399 <Field ParsableByteArray scratch>
	//   45   93:iload_2         
	//   46   94:invokevirtual   #558 <Method void ParsableByteArray.setLimit(int)>
	//   47   97:return          
	}

	private int readToOutput(ExtractorInput extractorinput, TrackOutput trackoutput, int i)
		throws IOException, InterruptedException
	{
		int j = sampleStrippedBytes.bytesLeft();
	//    0    0:aload_0         
	//    1    1:getfield        #431 <Field ParsableByteArray sampleStrippedBytes>
	//    2    4:invokevirtual   #564 <Method int ParsableByteArray.bytesLeft()>
	//    3    7:istore          4
		if(j > 0)
	//*   4    9:iload           4
	//*   5   11:ifle            35
		{
			i = Math.min(i, j);
	//    6   14:iload_3         
	//    7   15:iload           4
	//    8   17:invokestatic    #567 <Method int Math.min(int, int)>
	//    9   20:istore_3        
			trackoutput.sampleData(sampleStrippedBytes, i);
	//   10   21:aload_2         
	//   11   22:aload_0         
	//   12   23:getfield        #431 <Field ParsableByteArray sampleStrippedBytes>
	//   13   26:iload_3         
	//   14   27:invokeinterface #571 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		} else
	//*  15   32:goto            45
		{
			i = trackoutput.sampleData(extractorinput, i, false);
	//   16   35:aload_2         
	//   17   36:aload_1         
	//   18   37:iload_3         
	//   19   38:iconst_0        
	//   20   39:invokeinterface #574 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//   21   44:istore_3        
		}
		sampleBytesRead = sampleBytesRead + i;
	//   22   45:aload_0         
	//   23   46:aload_0         
	//   24   47:getfield        #576 <Field int sampleBytesRead>
	//   25   50:iload_3         
	//   26   51:iadd            
	//   27   52:putfield        #576 <Field int sampleBytesRead>
		sampleBytesWritten = sampleBytesWritten + i;
	//   28   55:aload_0         
	//   29   56:aload_0         
	//   30   57:getfield        #489 <Field int sampleBytesWritten>
	//   31   60:iload_3         
	//   32   61:iadd            
	//   33   62:putfield        #489 <Field int sampleBytesWritten>
		return i;
	//   34   65:iload_3         
	//   35   66:ireturn         
	}

	private void readToTarget(ExtractorInput extractorinput, byte abyte0[], int i, int j)
		throws IOException, InterruptedException
	{
		int k = Math.min(j, sampleStrippedBytes.bytesLeft());
	//    0    0:iload           4
	//    1    2:aload_0         
	//    2    3:getfield        #431 <Field ParsableByteArray sampleStrippedBytes>
	//    3    6:invokevirtual   #564 <Method int ParsableByteArray.bytesLeft()>
	//    4    9:invokestatic    #567 <Method int Math.min(int, int)>
	//    5   12:istore          5
		extractorinput.readFully(abyte0, i + k, j - k);
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:iload_3         
	//    9   17:iload           5
	//   10   19:iadd            
	//   11   20:iload           4
	//   12   22:iload           5
	//   13   24:isub            
	//   14   25:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
		if(k > 0)
	//*  15   30:iload           5
	//*  16   32:ifle            46
			sampleStrippedBytes.readBytes(abyte0, i, k);
	//   17   35:aload_0         
	//   18   36:getfield        #431 <Field ParsableByteArray sampleStrippedBytes>
	//   19   39:aload_2         
	//   20   40:iload_3         
	//   21   41:iload           5
	//   22   43:invokevirtual   #581 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		sampleBytesRead = sampleBytesRead + j;
	//   23   46:aload_0         
	//   24   47:aload_0         
	//   25   48:getfield        #576 <Field int sampleBytesRead>
	//   26   51:iload           4
	//   27   53:iadd            
	//   28   54:putfield        #576 <Field int sampleBytesRead>
	//   29   57:return          
	}

	private void resetSample()
	{
		sampleBytesRead = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #576 <Field int sampleBytesRead>
		sampleBytesWritten = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #489 <Field int sampleBytesWritten>
		sampleCurrentNalBytesRemaining = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #583 <Field int sampleCurrentNalBytesRemaining>
		sampleEncodingHandled = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #585 <Field boolean sampleEncodingHandled>
		sampleSignalByteRead = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #587 <Field boolean sampleSignalByteRead>
		samplePartitionCountRead = false;
	//   15   25:aload_0         
	//   16   26:iconst_0        
	//   17   27:putfield        #589 <Field boolean samplePartitionCountRead>
		samplePartitionCount = 0;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #591 <Field int samplePartitionCount>
		sampleSignalByte = 0;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #593 <Field byte sampleSignalByte>
		sampleInitializationVectorRead = false;
	//   24   40:aload_0         
	//   25   41:iconst_0        
	//   26   42:putfield        #595 <Field boolean sampleInitializationVectorRead>
		sampleStrippedBytes.reset();
	//   27   45:aload_0         
	//   28   46:getfield        #431 <Field ParsableByteArray sampleStrippedBytes>
	//   29   49:invokevirtual   #597 <Method void ParsableByteArray.reset()>
	//   30   52:return          
	}

	private long scaleTimecodeToUs(long l)
		throws ParserException
	{
		long l1 = timecodeScale;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field long timecodeScale>
	//    2    4:lstore_3        
		if(l1 != -1L)
	//*   3    5:lload_3         
	//*   4    6:ldc2w           #354 <Long -1L>
	//*   5    9:lcmp            
	//*   6   10:ifeq            22
			return Util.scaleLargeTimestamp(l, l1, 1000L);
	//    7   13:lload_1         
	//    8   14:lload_3         
	//    9   15:ldc2w           #602 <Long 1000L>
	//   10   18:invokestatic    #609 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   11   21:lreturn         
		else
			throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
	//   12   22:new             #601 <Class ParserException>
	//   13   25:dup             
	//   14   26:ldc2            #611 <String "Can't scale timecode prior to timecodeScale being set.">
	//   15   29:invokespecial   #614 <Method void ParserException(String)>
	//   16   32:athrow          
	}

	private static void setSubripSampleEndTimecode(byte abyte0[], long l)
	{
		byte abyte1[];
		if(l == -1L)
	//*   0    0:lload_1         
	//*   1    1:ldc2w           #354 <Long -1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            16
		{
			abyte1 = SUBRIP_TIMECODE_EMPTY;
	//    4    8:getstatic       #332 <Field byte[] SUBRIP_TIMECODE_EMPTY>
	//    5   11:astore          7
		} else
	//*   6   13:goto            123
		{
			int i = (int)(l / 0xd693a400L);
	//    7   16:lload_1         
	//    8   17:ldc2w           #617 <Long 0xd693a400L>
	//    9   20:ldiv            
	//   10   21:l2i             
	//   11   22:istore_3        
			l -= (long)i * 0xd693a400L;
	//   12   23:lload_1         
	//   13   24:iload_3         
	//   14   25:i2l             
	//   15   26:ldc2w           #617 <Long 0xd693a400L>
	//   16   29:lmul            
	//   17   30:lsub            
	//   18   31:lstore_1        
			int j = (int)(l / 0x3938700L);
	//   19   32:lload_1         
	//   20   33:ldc2w           #619 <Long 0x3938700L>
	//   21   36:ldiv            
	//   22   37:l2i             
	//   23   38:istore          4
			l -= 0x3938700 * j;
	//   24   40:lload_1         
	//   25   41:ldc2            #621 <Int 0x3938700>
	//   26   44:iload           4
	//   27   46:imul            
	//   28   47:i2l             
	//   29   48:lsub            
	//   30   49:lstore_1        
			int k = (int)(l / 0xf4240L);
	//   31   50:lload_1         
	//   32   51:ldc2w           #622 <Long 0xf4240L>
	//   33   54:ldiv            
	//   34   55:l2i             
	//   35   56:istore          5
			int i1 = (int)((l - (long)(0xf4240 * k)) / 1000L);
	//   36   58:lload_1         
	//   37   59:ldc2            #624 <Int 0xf4240>
	//   38   62:iload           5
	//   39   64:imul            
	//   40   65:i2l             
	//   41   66:lsub            
	//   42   67:ldc2w           #602 <Long 1000L>
	//   43   70:ldiv            
	//   44   71:l2i             
	//   45   72:istore          6
			abyte1 = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[] {
				Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i1)
			}).getBytes();
	//   46   74:getstatic       #630 <Field Locale Locale.US>
	//   47   77:ldc2            #632 <String "%02d:%02d:%02d,%03d">
	//   48   80:iconst_4        
	//   49   81:anewarray       Object[]
	//   50   84:dup             
	//   51   85:iconst_0        
	//   52   86:iload_3         
	//   53   87:invokestatic    #638 <Method Integer Integer.valueOf(int)>
	//   54   90:aastore         
	//   55   91:dup             
	//   56   92:iconst_1        
	//   57   93:iload           4
	//   58   95:invokestatic    #638 <Method Integer Integer.valueOf(int)>
	//   59   98:aastore         
	//   60   99:dup             
	//   61  100:iconst_2        
	//   62  101:iload           5
	//   63  103:invokestatic    #638 <Method Integer Integer.valueOf(int)>
	//   64  106:aastore         
	//   65  107:dup             
	//   66  108:iconst_3        
	//   67  109:iload           6
	//   68  111:invokestatic    #638 <Method Integer Integer.valueOf(int)>
	//   69  114:aastore         
	//   70  115:invokestatic    #642 <Method String String.format(Locale, String, Object[])>
	//   71  118:invokevirtual   #645 <Method byte[] String.getBytes()>
	//   72  121:astore          7
		}
		System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), 19, 12);
	//   73  123:aload           7
	//   74  125:iconst_0        
	//   75  126:aload_0         
	//   76  127:bipush          19
	//   77  129:bipush          12
	//   78  131:invokestatic    #651 <Method void System.arraycopy(Object, int, Object, int, int)>
	//   79  134:return          
	}

	private void writeSampleData(ExtractorInput extractorinput, Track track, int i)
		throws IOException, InterruptedException
	{
		if("S_TEXT/UTF8".equals(((Object) (track.codecId))))
	//*   0    0:ldc1            #82  <String "S_TEXT/UTF8">
	//*   1    2:aload_2         
	//*   2    3:getfield        #471 <Field String WebmExtractor$Track.codecId>
	//*   3    6:invokevirtual   #477 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            85
		{
			int j = SUBRIP_PREFIX.length + i;
	//    5   12:getstatic       #330 <Field byte[] SUBRIP_PREFIX>
	//    6   15:arraylength     
	//    7   16:iload_3         
	//    8   17:iadd            
	//    9   18:istore          5
			if(subripSample.capacity() < j)
	//*  10   20:aload_0         
	//*  11   21:getfield        #433 <Field ParsableByteArray subripSample>
	//*  12   24:invokevirtual   #536 <Method int ParsableByteArray.capacity()>
	//*  13   27:iload           5
	//*  14   29:icmpge          49
				subripSample.data = Arrays.copyOf(SUBRIP_PREFIX, j + i);
	//   15   32:aload_0         
	//   16   33:getfield        #433 <Field ParsableByteArray subripSample>
	//   17   36:getstatic       #330 <Field byte[] SUBRIP_PREFIX>
	//   18   39:iload           5
	//   19   41:iload_3         
	//   20   42:iadd            
	//   21   43:invokestatic    #545 <Method byte[] Arrays.copyOf(byte[], int)>
	//   22   46:putfield        #539 <Field byte[] ParsableByteArray.data>
			extractorinput.readFully(subripSample.data, SUBRIP_PREFIX.length, i);
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:getfield        #433 <Field ParsableByteArray subripSample>
	//   26   54:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   27   57:getstatic       #330 <Field byte[] SUBRIP_PREFIX>
	//   28   60:arraylength     
	//   29   61:iload_3         
	//   30   62:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
			subripSample.setPosition(0);
	//   31   67:aload_0         
	//   32   68:getfield        #433 <Field ParsableByteArray subripSample>
	//   33   71:iconst_0        
	//   34   72:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
			subripSample.setLimit(j);
	//   35   75:aload_0         
	//   36   76:getfield        #433 <Field ParsableByteArray subripSample>
	//   37   79:iload           5
	//   38   81:invokevirtual   #558 <Method void ParsableByteArray.setLimit(int)>
			return;
	//   39   84:return          
		}
		TrackOutput trackoutput = track.output;
	//   40   85:aload_2         
	//   41   86:getfield        #485 <Field TrackOutput WebmExtractor$Track.output>
	//   42   89:astore          10
		if(!sampleEncodingHandled)
	//*  43   91:aload_0         
	//*  44   92:getfield        #585 <Field boolean sampleEncodingHandled>
	//*  45   95:ifne            801
		{
			if(track.hasContentEncryption)
	//*  46   98:aload_2         
	//*  47   99:getfield        #659 <Field boolean WebmExtractor$Track.hasContentEncryption>
	//*  48  102:ifeq            773
			{
				blockFlags = blockFlags & -3;
	//   49  105:aload_0         
	//   50  106:aload_0         
	//   51  107:getfield        #487 <Field int blockFlags>
	//   52  110:bipush          -3
	//   53  112:iand            
	//   54  113:putfield        #487 <Field int blockFlags>
				boolean flag2 = sampleSignalByteRead;
	//   55  116:aload_0         
	//   56  117:getfield        #587 <Field boolean sampleSignalByteRead>
	//   57  120:istore          9
				char c = '\200';
	//   58  122:sipush          128
	//   59  125:istore          6
				if(!flag2)
	//*  60  127:iload           9
	//*  61  129:ifne            208
				{
					extractorinput.readFully(scratch.data, 0, 1);
	//   62  132:aload_1         
	//   63  133:aload_0         
	//   64  134:getfield        #399 <Field ParsableByteArray scratch>
	//   65  137:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   66  140:iconst_0        
	//   67  141:iconst_1        
	//   68  142:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
					sampleBytesRead = sampleBytesRead + 1;
	//   69  147:aload_0         
	//   70  148:aload_0         
	//   71  149:getfield        #576 <Field int sampleBytesRead>
	//   72  152:iconst_1        
	//   73  153:iadd            
	//   74  154:putfield        #576 <Field int sampleBytesRead>
					if((scratch.data[0] & 0x80) != 128)
	//*  75  157:aload_0         
	//*  76  158:getfield        #399 <Field ParsableByteArray scratch>
	//*  77  161:getfield        #539 <Field byte[] ParsableByteArray.data>
	//*  78  164:iconst_0        
	//*  79  165:baload          
	//*  80  166:sipush          128
	//*  81  169:iand            
	//*  82  170:sipush          128
	//*  83  173:icmpeq          197
					{
						sampleSignalByte = scratch.data[0];
	//   84  176:aload_0         
	//   85  177:aload_0         
	//   86  178:getfield        #399 <Field ParsableByteArray scratch>
	//   87  181:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   88  184:iconst_0        
	//   89  185:baload          
	//   90  186:putfield        #593 <Field byte sampleSignalByte>
						sampleSignalByteRead = true;
	//   91  189:aload_0         
	//   92  190:iconst_1        
	//   93  191:putfield        #587 <Field boolean sampleSignalByteRead>
					} else
	//*  94  194:goto            208
					{
						throw new ParserException("Extension bit is set in signal byte");
	//   95  197:new             #601 <Class ParserException>
	//   96  200:dup             
	//   97  201:ldc2            #661 <String "Extension bit is set in signal byte">
	//   98  204:invokespecial   #614 <Method void ParserException(String)>
	//   99  207:athrow          
					}
				}
				boolean flag;
				if((sampleSignalByte & 1) == 1)
	//* 100  208:aload_0         
	//* 101  209:getfield        #593 <Field byte sampleSignalByte>
	//* 102  212:iconst_1        
	//* 103  213:iand            
	//* 104  214:iconst_1        
	//* 105  215:icmpne          224
					flag = true;
	//  106  218:iconst_1        
	//  107  219:istore          5
				else
	//* 108  221:goto            227
					flag = false;
	//  109  224:iconst_0        
	//  110  225:istore          5
				if(flag)
	//* 111  227:iload           5
	//* 112  229:ifeq            796
				{
					boolean flag1;
					if((sampleSignalByte & 2) == 2)
	//* 113  232:aload_0         
	//* 114  233:getfield        #593 <Field byte sampleSignalByte>
	//* 115  236:iconst_2        
	//* 116  237:iand            
	//* 117  238:iconst_2        
	//* 118  239:icmpne          248
						flag1 = true;
	//  119  242:iconst_1        
	//  120  243:istore          5
					else
	//* 121  245:goto            251
						flag1 = false;
	//  122  248:iconst_0        
	//  123  249:istore          5
					blockFlags = blockFlags | 2;
	//  124  251:aload_0         
	//  125  252:aload_0         
	//  126  253:getfield        #487 <Field int blockFlags>
	//  127  256:iconst_2        
	//  128  257:ior             
	//  129  258:putfield        #487 <Field int blockFlags>
					if(!sampleInitializationVectorRead)
	//* 130  261:aload_0         
	//* 131  262:getfield        #595 <Field boolean sampleInitializationVectorRead>
	//* 132  265:ifne            392
					{
						extractorinput.readFully(encryptionInitializationVector.data, 0, 8);
	//  133  268:aload_1         
	//  134  269:aload_0         
	//  135  270:getfield        #435 <Field ParsableByteArray encryptionInitializationVector>
	//  136  273:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  137  276:iconst_0        
	//  138  277:bipush          8
	//  139  279:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
						sampleBytesRead = sampleBytesRead + 8;
	//  140  284:aload_0         
	//  141  285:aload_0         
	//  142  286:getfield        #576 <Field int sampleBytesRead>
	//  143  289:bipush          8
	//  144  291:iadd            
	//  145  292:putfield        #576 <Field int sampleBytesRead>
						sampleInitializationVectorRead = true;
	//  146  295:aload_0         
	//  147  296:iconst_1        
	//  148  297:putfield        #595 <Field boolean sampleInitializationVectorRead>
						byte abyte0[] = scratch.data;
	//  149  300:aload_0         
	//  150  301:getfield        #399 <Field ParsableByteArray scratch>
	//  151  304:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  152  307:astore          11
						if(!flag1)
	//* 153  309:iload           5
	//* 154  311:ifeq            317
	//* 155  314:goto            320
							c = '\0';
	//  156  317:iconst_0        
	//  157  318:istore          6
						abyte0[0] = (byte)(c | 8);
	//  158  320:aload           11
	//  159  322:iconst_0        
	//  160  323:iload           6
	//  161  325:bipush          8
	//  162  327:ior             
	//  163  328:int2byte        
	//  164  329:bastore         
						scratch.setPosition(0);
	//  165  330:aload_0         
	//  166  331:getfield        #399 <Field ParsableByteArray scratch>
	//  167  334:iconst_0        
	//  168  335:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
						trackoutput.sampleData(scratch, 1);
	//  169  338:aload           10
	//  170  340:aload_0         
	//  171  341:getfield        #399 <Field ParsableByteArray scratch>
	//  172  344:iconst_1        
	//  173  345:invokeinterface #571 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + 1;
	//  174  350:aload_0         
	//  175  351:aload_0         
	//  176  352:getfield        #489 <Field int sampleBytesWritten>
	//  177  355:iconst_1        
	//  178  356:iadd            
	//  179  357:putfield        #489 <Field int sampleBytesWritten>
						encryptionInitializationVector.setPosition(0);
	//  180  360:aload_0         
	//  181  361:getfield        #435 <Field ParsableByteArray encryptionInitializationVector>
	//  182  364:iconst_0        
	//  183  365:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
						trackoutput.sampleData(encryptionInitializationVector, 8);
	//  184  368:aload           10
	//  185  370:aload_0         
	//  186  371:getfield        #435 <Field ParsableByteArray encryptionInitializationVector>
	//  187  374:bipush          8
	//  188  376:invokeinterface #571 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + 8;
	//  189  381:aload_0         
	//  190  382:aload_0         
	//  191  383:getfield        #489 <Field int sampleBytesWritten>
	//  192  386:bipush          8
	//  193  388:iadd            
	//  194  389:putfield        #489 <Field int sampleBytesWritten>
					}
					if(flag1)
	//* 195  392:iload           5
	//* 196  394:ifeq            796
					{
						if(!samplePartitionCountRead)
	//* 197  397:aload_0         
	//* 198  398:getfield        #589 <Field boolean samplePartitionCountRead>
	//* 199  401:ifne            453
						{
							extractorinput.readFully(scratch.data, 0, 1);
	//  200  404:aload_1         
	//  201  405:aload_0         
	//  202  406:getfield        #399 <Field ParsableByteArray scratch>
	//  203  409:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  204  412:iconst_0        
	//  205  413:iconst_1        
	//  206  414:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
							sampleBytesRead = sampleBytesRead + 1;
	//  207  419:aload_0         
	//  208  420:aload_0         
	//  209  421:getfield        #576 <Field int sampleBytesRead>
	//  210  424:iconst_1        
	//  211  425:iadd            
	//  212  426:putfield        #576 <Field int sampleBytesRead>
							scratch.setPosition(0);
	//  213  429:aload_0         
	//  214  430:getfield        #399 <Field ParsableByteArray scratch>
	//  215  433:iconst_0        
	//  216  434:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
							samplePartitionCount = scratch.readUnsignedByte();
	//  217  437:aload_0         
	//  218  438:aload_0         
	//  219  439:getfield        #399 <Field ParsableByteArray scratch>
	//  220  442:invokevirtual   #664 <Method int ParsableByteArray.readUnsignedByte()>
	//  221  445:putfield        #591 <Field int samplePartitionCount>
							samplePartitionCountRead = true;
	//  222  448:aload_0         
	//  223  449:iconst_1        
	//  224  450:putfield        #589 <Field boolean samplePartitionCountRead>
						}
						int k = samplePartitionCount * 4;
	//  225  453:aload_0         
	//  226  454:getfield        #591 <Field int samplePartitionCount>
	//  227  457:iconst_4        
	//  228  458:imul            
	//  229  459:istore          5
						if(scratch.limit() < k)
	//* 230  461:aload_0         
	//* 231  462:getfield        #399 <Field ParsableByteArray scratch>
	//* 232  465:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//* 233  468:iload           5
	//* 234  470:icmpge          486
							scratch.reset(new byte[k], k);
	//  235  473:aload_0         
	//  236  474:getfield        #399 <Field ParsableByteArray scratch>
	//  237  477:iload           5
	//  238  479:newarray        byte[]
	//  239  481:iload           5
	//  240  483:invokevirtual   #549 <Method void ParsableByteArray.reset(byte[], int)>
						extractorinput.readFully(scratch.data, 0, k);
	//  241  486:aload_1         
	//  242  487:aload_0         
	//  243  488:getfield        #399 <Field ParsableByteArray scratch>
	//  244  491:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  245  494:iconst_0        
	//  246  495:iload           5
	//  247  497:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
						sampleBytesRead = sampleBytesRead + k;
	//  248  502:aload_0         
	//  249  503:aload_0         
	//  250  504:getfield        #576 <Field int sampleBytesRead>
	//  251  507:iload           5
	//  252  509:iadd            
	//  253  510:putfield        #576 <Field int sampleBytesRead>
						scratch.setPosition(0);
	//  254  513:aload_0         
	//  255  514:getfield        #399 <Field ParsableByteArray scratch>
	//  256  517:iconst_0        
	//  257  518:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
						scratch.setLimit(k);
	//  258  521:aload_0         
	//  259  522:getfield        #399 <Field ParsableByteArray scratch>
	//  260  525:iload           5
	//  261  527:invokevirtual   #558 <Method void ParsableByteArray.setLimit(int)>
						short word0 = (short)(samplePartitionCount / 2 + 1);
	//  262  530:aload_0         
	//  263  531:getfield        #591 <Field int samplePartitionCount>
	//  264  534:iconst_2        
	//  265  535:idiv            
	//  266  536:iconst_1        
	//  267  537:iadd            
	//  268  538:int2short       
	//  269  539:istore          4
						int j2 = word0 * 6 + 2;
	//  270  541:iload           4
	//  271  543:bipush          6
	//  272  545:imul            
	//  273  546:iconst_2        
	//  274  547:iadd            
	//  275  548:istore          8
						ByteBuffer bytebuffer = encryptionSubsampleDataBuffer;
	//  276  550:aload_0         
	//  277  551:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  278  554:astore          11
						if(bytebuffer == null || bytebuffer.capacity() < j2)
	//* 279  556:aload           11
	//* 280  558:ifnull          571
	//* 281  561:aload           11
	//* 282  563:invokevirtual   #667 <Method int ByteBuffer.capacity()>
	//* 283  566:iload           8
	//* 284  568:icmpge          580
							encryptionSubsampleDataBuffer = ByteBuffer.allocate(j2);
	//  285  571:aload_0         
	//  286  572:iload           8
	//  287  574:invokestatic    #405 <Method ByteBuffer ByteBuffer.allocate(int)>
	//  288  577:putfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
						encryptionSubsampleDataBuffer.position(0);
	//  289  580:aload_0         
	//  290  581:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  291  584:iconst_0        
	//  292  585:invokevirtual   #670 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  293  588:pop             
						encryptionSubsampleDataBuffer.putShort(word0);
	//  294  589:aload_0         
	//  295  590:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  296  593:iload           4
	//  297  595:invokevirtual   #674 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  298  598:pop             
						k = 0;
	//  299  599:iconst_0        
	//  300  600:istore          5
						int j1 = k;
	//  301  602:iload           5
	//  302  604:istore          6
						int l1;
						do
						{
							l1 = samplePartitionCount;
	//  303  606:aload_0         
	//  304  607:getfield        #591 <Field int samplePartitionCount>
	//  305  610:istore          7
							if(k >= l1)
								break;
	//  306  612:iload           5
	//  307  614:iload           7
	//  308  616:icmpge          678
							l1 = scratch.readUnsignedIntToInt();
	//  309  619:aload_0         
	//  310  620:getfield        #399 <Field ParsableByteArray scratch>
	//  311  623:invokevirtual   #677 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  312  626:istore          7
							if(k % 2 == 0)
	//* 313  628:iload           5
	//* 314  630:iconst_2        
	//* 315  631:irem            
	//* 316  632:ifne            652
								encryptionSubsampleDataBuffer.putShort((short)(l1 - j1));
	//  317  635:aload_0         
	//  318  636:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  319  639:iload           7
	//  320  641:iload           6
	//  321  643:isub            
	//  322  644:int2short       
	//  323  645:invokevirtual   #674 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  324  648:pop             
							else
	//* 325  649:goto            665
								encryptionSubsampleDataBuffer.putInt(l1 - j1);
	//  326  652:aload_0         
	//  327  653:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  328  656:iload           7
	//  329  658:iload           6
	//  330  660:isub            
	//  331  661:invokevirtual   #408 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  332  664:pop             
							k++;
	//  333  665:iload           5
	//  334  667:iconst_1        
	//  335  668:iadd            
	//  336  669:istore          5
							j1 = l1;
	//  337  671:iload           7
	//  338  673:istore          6
						} while(true);
	//  339  675:goto            606
						k = i - sampleBytesRead - j1;
	//  340  678:iload_3         
	//  341  679:aload_0         
	//  342  680:getfield        #576 <Field int sampleBytesRead>
	//  343  683:isub            
	//  344  684:iload           6
	//  345  686:isub            
	//  346  687:istore          5
						if(l1 % 2 == 1)
	//* 347  689:iload           7
	//* 348  691:iconst_2        
	//* 349  692:irem            
	//* 350  693:iconst_1        
	//* 351  694:icmpne          710
						{
							encryptionSubsampleDataBuffer.putInt(k);
	//  352  697:aload_0         
	//  353  698:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  354  701:iload           5
	//  355  703:invokevirtual   #408 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  356  706:pop             
						} else
	//* 357  707:goto            730
						{
							encryptionSubsampleDataBuffer.putShort((short)k);
	//  358  710:aload_0         
	//  359  711:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  360  714:iload           5
	//  361  716:int2short       
	//  362  717:invokevirtual   #674 <Method ByteBuffer ByteBuffer.putShort(short)>
	//  363  720:pop             
							encryptionSubsampleDataBuffer.putInt(0);
	//  364  721:aload_0         
	//  365  722:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  366  725:iconst_0        
	//  367  726:invokevirtual   #408 <Method ByteBuffer ByteBuffer.putInt(int)>
	//  368  729:pop             
						}
						encryptionSubsampleData.reset(encryptionSubsampleDataBuffer.array(), j2);
	//  369  730:aload_0         
	//  370  731:getfield        #437 <Field ParsableByteArray encryptionSubsampleData>
	//  371  734:aload_0         
	//  372  735:getfield        #666 <Field ByteBuffer encryptionSubsampleDataBuffer>
	//  373  738:invokevirtual   #412 <Method byte[] ByteBuffer.array()>
	//  374  741:iload           8
	//  375  743:invokevirtual   #549 <Method void ParsableByteArray.reset(byte[], int)>
						trackoutput.sampleData(encryptionSubsampleData, j2);
	//  376  746:aload           10
	//  377  748:aload_0         
	//  378  749:getfield        #437 <Field ParsableByteArray encryptionSubsampleData>
	//  379  752:iload           8
	//  380  754:invokeinterface #571 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
						sampleBytesWritten = sampleBytesWritten + j2;
	//  381  759:aload_0         
	//  382  760:aload_0         
	//  383  761:getfield        #489 <Field int sampleBytesWritten>
	//  384  764:iload           8
	//  385  766:iadd            
	//  386  767:putfield        #489 <Field int sampleBytesWritten>
					}
				}
			} else
	//* 387  770:goto            796
			if(track.sampleStrippedBytes != null)
	//* 388  773:aload_2         
	//* 389  774:getfield        #679 <Field byte[] WebmExtractor$Track.sampleStrippedBytes>
	//* 390  777:ifnull          796
				sampleStrippedBytes.reset(track.sampleStrippedBytes, track.sampleStrippedBytes.length);
	//  391  780:aload_0         
	//  392  781:getfield        #431 <Field ParsableByteArray sampleStrippedBytes>
	//  393  784:aload_2         
	//  394  785:getfield        #679 <Field byte[] WebmExtractor$Track.sampleStrippedBytes>
	//  395  788:aload_2         
	//  396  789:getfield        #679 <Field byte[] WebmExtractor$Track.sampleStrippedBytes>
	//  397  792:arraylength     
	//  398  793:invokevirtual   #549 <Method void ParsableByteArray.reset(byte[], int)>
			sampleEncodingHandled = true;
	//  399  796:aload_0         
	//  400  797:iconst_1        
	//  401  798:putfield        #585 <Field boolean sampleEncodingHandled>
		}
		i += sampleStrippedBytes.limit();
	//  402  801:iload_3         
	//  403  802:aload_0         
	//  404  803:getfield        #431 <Field ParsableByteArray sampleStrippedBytes>
	//  405  806:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//  406  809:iadd            
	//  407  810:istore_3        
		if(!"V_MPEG4/ISO/AVC".equals(((Object) (track.codecId))) && !"V_MPEGH/ISO/HEVC".equals(((Object) (track.codecId))))
	//* 408  811:ldc1            #52  <String "V_MPEG4/ISO/AVC">
	//* 409  813:aload_2         
	//* 410  814:getfield        #471 <Field String WebmExtractor$Track.codecId>
	//* 411  817:invokevirtual   #477 <Method boolean String.equals(Object)>
	//* 412  820:ifne            865
	//* 413  823:ldc1            #55  <String "V_MPEGH/ISO/HEVC">
	//* 414  825:aload_2         
	//* 415  826:getfield        #471 <Field String WebmExtractor$Track.codecId>
	//* 416  829:invokevirtual   #477 <Method boolean String.equals(Object)>
	//* 417  832:ifeq            838
	//* 418  835:goto            865
		{
			do
			{
				int l = sampleBytesRead;
	//  419  838:aload_0         
	//  420  839:getfield        #576 <Field int sampleBytesRead>
	//  421  842:istore          5
				if(l >= i)
					break;
	//  422  844:iload           5
	//  423  846:iload_3         
	//  424  847:icmpge          1004
				readToOutput(extractorinput, trackoutput, i - l);
	//  425  850:aload_0         
	//  426  851:aload_1         
	//  427  852:aload           10
	//  428  854:iload_3         
	//  429  855:iload           5
	//  430  857:isub            
	//  431  858:invokespecial   #681 <Method int readToOutput(ExtractorInput, TrackOutput, int)>
	//  432  861:pop             
			} while(true);
	//  433  862:goto            838
		} else
		{
			byte abyte1[] = nalLength.data;
	//  434  865:aload_0         
	//  435  866:getfield        #428 <Field ParsableByteArray nalLength>
	//  436  869:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  437  872:astore          11
			abyte1[0] = 0;
	//  438  874:aload           11
	//  439  876:iconst_0        
	//  440  877:iconst_0        
	//  441  878:bastore         
			abyte1[1] = 0;
	//  442  879:aload           11
	//  443  881:iconst_1        
	//  444  882:iconst_0        
	//  445  883:bastore         
			abyte1[2] = 0;
	//  446  884:aload           11
	//  447  886:iconst_2        
	//  448  887:iconst_0        
	//  449  888:bastore         
			int i1 = track.nalUnitLengthFieldLength;
	//  450  889:aload_2         
	//  451  890:getfield        #684 <Field int WebmExtractor$Track.nalUnitLengthFieldLength>
	//  452  893:istore          5
			int k1 = track.nalUnitLengthFieldLength;
	//  453  895:aload_2         
	//  454  896:getfield        #684 <Field int WebmExtractor$Track.nalUnitLengthFieldLength>
	//  455  899:istore          6
			while(sampleBytesRead < i) 
	//* 456  901:aload_0         
	//* 457  902:getfield        #576 <Field int sampleBytesRead>
	//* 458  905:iload_3         
	//* 459  906:icmpge          1004
			{
				int i2 = sampleCurrentNalBytesRemaining;
	//  460  909:aload_0         
	//  461  910:getfield        #583 <Field int sampleCurrentNalBytesRemaining>
	//  462  913:istore          7
				if(i2 == 0)
	//* 463  915:iload           7
	//* 464  917:ifne            985
				{
					readToTarget(extractorinput, abyte1, 4 - k1, i1);
	//  465  920:aload_0         
	//  466  921:aload_1         
	//  467  922:aload           11
	//  468  924:iconst_4        
	//  469  925:iload           6
	//  470  927:isub            
	//  471  928:iload           5
	//  472  930:invokespecial   #686 <Method void readToTarget(ExtractorInput, byte[], int, int)>
					nalLength.setPosition(0);
	//  473  933:aload_0         
	//  474  934:getfield        #428 <Field ParsableByteArray nalLength>
	//  475  937:iconst_0        
	//  476  938:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
					sampleCurrentNalBytesRemaining = nalLength.readUnsignedIntToInt();
	//  477  941:aload_0         
	//  478  942:aload_0         
	//  479  943:getfield        #428 <Field ParsableByteArray nalLength>
	//  480  946:invokevirtual   #677 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  481  949:putfield        #583 <Field int sampleCurrentNalBytesRemaining>
					nalStartCode.setPosition(0);
	//  482  952:aload_0         
	//  483  953:getfield        #426 <Field ParsableByteArray nalStartCode>
	//  484  956:iconst_0        
	//  485  957:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
					trackoutput.sampleData(nalStartCode, 4);
	//  486  960:aload           10
	//  487  962:aload_0         
	//  488  963:getfield        #426 <Field ParsableByteArray nalStartCode>
	//  489  966:iconst_4        
	//  490  967:invokeinterface #571 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					sampleBytesWritten = sampleBytesWritten + 4;
	//  491  972:aload_0         
	//  492  973:aload_0         
	//  493  974:getfield        #489 <Field int sampleBytesWritten>
	//  494  977:iconst_4        
	//  495  978:iadd            
	//  496  979:putfield        #489 <Field int sampleBytesWritten>
				} else
	//* 497  982:goto            901
				{
					sampleCurrentNalBytesRemaining = i2 - readToOutput(extractorinput, trackoutput, i2);
	//  498  985:aload_0         
	//  499  986:iload           7
	//  500  988:aload_0         
	//  501  989:aload_1         
	//  502  990:aload           10
	//  503  992:iload           7
	//  504  994:invokespecial   #681 <Method int readToOutput(ExtractorInput, TrackOutput, int)>
	//  505  997:isub            
	//  506  998:putfield        #583 <Field int sampleCurrentNalBytesRemaining>
				}
			}
		}
	//* 507 1001:goto            901
		if("A_VORBIS".equals(((Object) (track.codecId))))
	//* 508 1004:ldc1            #91  <String "A_VORBIS">
	//* 509 1006:aload_2         
	//* 510 1007:getfield        #471 <Field String WebmExtractor$Track.codecId>
	//* 511 1010:invokevirtual   #477 <Method boolean String.equals(Object)>
	//* 512 1013:ifeq            1046
		{
			vorbisNumPageSamples.setPosition(0);
	//  513 1016:aload_0         
	//  514 1017:getfield        #417 <Field ParsableByteArray vorbisNumPageSamples>
	//  515 1020:iconst_0        
	//  516 1021:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
			trackoutput.sampleData(vorbisNumPageSamples, 4);
	//  517 1024:aload           10
	//  518 1026:aload_0         
	//  519 1027:getfield        #417 <Field ParsableByteArray vorbisNumPageSamples>
	//  520 1030:iconst_4        
	//  521 1031:invokeinterface #571 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			sampleBytesWritten = sampleBytesWritten + 4;
	//  522 1036:aload_0         
	//  523 1037:aload_0         
	//  524 1038:getfield        #489 <Field int sampleBytesWritten>
	//  525 1041:iconst_4        
	//  526 1042:iadd            
	//  527 1043:putfield        #489 <Field int sampleBytesWritten>
		}
	//  528 1046:return          
	}

	private void writeSubripSample(Track track)
	{
		setSubripSampleEndTimecode(subripSample.data, blockDurationUs);
	//    0    0:aload_0         
	//    1    1:getfield        #433 <Field ParsableByteArray subripSample>
	//    2    4:getfield        #539 <Field byte[] ParsableByteArray.data>
	//    3    7:aload_0         
	//    4    8:getfield        #688 <Field long blockDurationUs>
	//    5   11:invokestatic    #690 <Method void setSubripSampleEndTimecode(byte[], long)>
		track = ((Track) (track.output));
	//    6   14:aload_1         
	//    7   15:getfield        #485 <Field TrackOutput WebmExtractor$Track.output>
	//    8   18:astore_1        
		ParsableByteArray parsablebytearray = subripSample;
	//    9   19:aload_0         
	//   10   20:getfield        #433 <Field ParsableByteArray subripSample>
	//   11   23:astore_2        
		((TrackOutput) (track)).sampleData(parsablebytearray, parsablebytearray.limit());
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//   16   30:invokeinterface #571 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		sampleBytesWritten = sampleBytesWritten + subripSample.limit();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #489 <Field int sampleBytesWritten>
	//   20   40:aload_0         
	//   21   41:getfield        #433 <Field ParsableByteArray subripSample>
	//   22   44:invokevirtual   #533 <Method int ParsableByteArray.limit()>
	//   23   47:iadd            
	//   24   48:putfield        #489 <Field int sampleBytesWritten>
	//   25   51:return          
	}

	void binaryElement(int i, int j, ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		Track track4;
label0:
		{
label1:
			{
				int k;
label2:
				{
label3:
					{
						int j1;
						int j2;
label4:
						{
							if(i != 161 && i != 163)
	//*   0    0:iload_1         
	//*   1    1:sipush          161
	//*   2    4:icmpeq          244
	//*   3    7:iload_1         
	//*   4    8:sipush          163
	//*   5   11:icmpeq          244
								if(i != 16981)
	//*   6   14:iload_1         
	//*   7   15:sipush          16981
	//*   8   18:icmpeq          216
								{
									if(i != 18402)
	//*   9   21:iload_1         
	//*  10   22:sipush          18402
	//*  11   25:icmpeq          188
									{
										if(i != 21419)
	//*  12   28:iload_1         
	//*  13   29:sipush          21419
	//*  14   32:icmpeq          139
										{
											if(i != 25506)
	//*  15   35:iload_1         
	//*  16   36:sipush          25506
	//*  17   39:icmpeq          111
											{
												if(i == 30322)
	//*  18   42:iload_1         
	//*  19   43:sipush          30322
	//*  20   46:icmpne          77
												{
													Track track = currentTrack;
	//   21   49:aload_0         
	//   22   50:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   23   53:astore          15
													track.projectionData = new byte[j];
	//   24   55:aload           15
	//   25   57:iload_2         
	//   26   58:newarray        byte[]
	//   27   60:putfield        #697 <Field byte[] WebmExtractor$Track.projectionData>
													extractorinput.readFully(track.projectionData, 0, j);
	//   28   63:aload_3         
	//   29   64:aload           15
	//   30   66:getfield        #697 <Field byte[] WebmExtractor$Track.projectionData>
	//   31   69:iconst_0        
	//   32   70:iload_2         
	//   33   71:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
													return;
	//   34   76:return          
												} else
												{
													extractorinput = ((ExtractorInput) (new StringBuilder()));
	//   35   77:new             #699 <Class StringBuilder>
	//   36   80:dup             
	//   37   81:invokespecial   #700 <Method void StringBuilder()>
	//   38   84:astore_3        
													((StringBuilder) (extractorinput)).append("Unexpected id: ");
	//   39   85:aload_3         
	//   40   86:ldc2            #702 <String "Unexpected id: ">
	//   41   89:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
													((StringBuilder) (extractorinput)).append(i);
	//   43   93:aload_3         
	//   44   94:iload_1         
	//   45   95:invokevirtual   #709 <Method StringBuilder StringBuilder.append(int)>
	//   46   98:pop             
													throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//   47   99:new             #601 <Class ParserException>
	//   48  102:dup             
	//   49  103:aload_3         
	//   50  104:invokevirtual   #713 <Method String StringBuilder.toString()>
	//   51  107:invokespecial   #614 <Method void ParserException(String)>
	//   52  110:athrow          
												}
											} else
											{
												Track track1 = currentTrack;
	//   53  111:aload_0         
	//   54  112:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   55  115:astore          15
												track1.codecPrivate = new byte[j];
	//   56  117:aload           15
	//   57  119:iload_2         
	//   58  120:newarray        byte[]
	//   59  122:putfield        #716 <Field byte[] WebmExtractor$Track.codecPrivate>
												extractorinput.readFully(track1.codecPrivate, 0, j);
	//   60  125:aload_3         
	//   61  126:aload           15
	//   62  128:getfield        #716 <Field byte[] WebmExtractor$Track.codecPrivate>
	//   63  131:iconst_0        
	//   64  132:iload_2         
	//   65  133:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
												return;
	//   66  138:return          
											}
										} else
										{
											Arrays.fill(seekEntryIdBytes.data, (byte)0);
	//   67  139:aload_0         
	//   68  140:getfield        #419 <Field ParsableByteArray seekEntryIdBytes>
	//   69  143:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   70  146:iconst_0        
	//   71  147:invokestatic    #720 <Method void Arrays.fill(byte[], byte)>
											extractorinput.readFully(seekEntryIdBytes.data, 4 - j, j);
	//   72  150:aload_3         
	//   73  151:aload_0         
	//   74  152:getfield        #419 <Field ParsableByteArray seekEntryIdBytes>
	//   75  155:getfield        #539 <Field byte[] ParsableByteArray.data>
	//   76  158:iconst_4        
	//   77  159:iload_2         
	//   78  160:isub            
	//   79  161:iload_2         
	//   80  162:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
											seekEntryIdBytes.setPosition(0);
	//   81  167:aload_0         
	//   82  168:getfield        #419 <Field ParsableByteArray seekEntryIdBytes>
	//   83  171:iconst_0        
	//   84  172:invokevirtual   #656 <Method void ParsableByteArray.setPosition(int)>
											seekEntryId = (int)seekEntryIdBytes.readUnsignedInt();
	//   85  175:aload_0         
	//   86  176:aload_0         
	//   87  177:getfield        #419 <Field ParsableByteArray seekEntryIdBytes>
	//   88  180:invokevirtual   #724 <Method long ParsableByteArray.readUnsignedInt()>
	//   89  183:l2i             
	//   90  184:putfield        #726 <Field int seekEntryId>
											return;
	//   91  187:return          
										}
									} else
									{
										Track track2 = currentTrack;
	//   92  188:aload_0         
	//   93  189:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   94  192:astore          15
										track2.encryptionKeyId = new byte[j];
	//   95  194:aload           15
	//   96  196:iload_2         
	//   97  197:newarray        byte[]
	//   98  199:putfield        #492 <Field byte[] WebmExtractor$Track.encryptionKeyId>
										extractorinput.readFully(track2.encryptionKeyId, 0, j);
	//   99  202:aload_3         
	//  100  203:aload           15
	//  101  205:getfield        #492 <Field byte[] WebmExtractor$Track.encryptionKeyId>
	//  102  208:iconst_0        
	//  103  209:iload_2         
	//  104  210:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
										return;
	//  105  215:return          
									}
								} else
								{
									Track track3 = currentTrack;
	//  106  216:aload_0         
	//  107  217:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  108  220:astore          15
									track3.sampleStrippedBytes = new byte[j];
	//  109  222:aload           15
	//  110  224:iload_2         
	//  111  225:newarray        byte[]
	//  112  227:putfield        #679 <Field byte[] WebmExtractor$Track.sampleStrippedBytes>
									extractorinput.readFully(track3.sampleStrippedBytes, 0, j);
	//  113  230:aload_3         
	//  114  231:aload           15
	//  115  233:getfield        #679 <Field byte[] WebmExtractor$Track.sampleStrippedBytes>
	//  116  236:iconst_0        
	//  117  237:iload_2         
	//  118  238:invokeinterface #555 <Method void ExtractorInput.readFully(byte[], int, int)>
									return;
	//  119  243:return          
								}
							if(blockState == 0)
	//* 120  244:aload_0         
	//* 121  245:getfield        #728 <Field int blockState>
	//* 122  248:ifne            298
							{
								blockTrackNumber = (int)varintReader.readUnsignedVarint(extractorinput, false, true, 8);
	//  123  251:aload_0         
	//  124  252:aload_0         
	//  125  253:getfield        #387 <Field VarintReader varintReader>
	//  126  256:aload_3         
	//  127  257:iconst_0        
	//  128  258:iconst_1        
	//  129  259:bipush          8
	//  130  261:invokevirtual   #732 <Method long VarintReader.readUnsignedVarint(ExtractorInput, boolean, boolean, int)>
	//  131  264:l2i             
	//  132  265:putfield        #734 <Field int blockTrackNumber>
								blockTrackNumberLength = varintReader.getLastLength();
	//  133  268:aload_0         
	//  134  269:aload_0         
	//  135  270:getfield        #387 <Field VarintReader varintReader>
	//  136  273:invokevirtual   #737 <Method int VarintReader.getLastLength()>
	//  137  276:putfield        #739 <Field int blockTrackNumberLength>
								blockDurationUs = -1L;
	//  138  279:aload_0         
	//  139  280:ldc2w           #354 <Long -1L>
	//  140  283:putfield        #688 <Field long blockDurationUs>
								blockState = 1;
	//  141  286:aload_0         
	//  142  287:iconst_1        
	//  143  288:putfield        #728 <Field int blockState>
								scratch.reset();
	//  144  291:aload_0         
	//  145  292:getfield        #399 <Field ParsableByteArray scratch>
	//  146  295:invokevirtual   #597 <Method void ParsableByteArray.reset()>
							}
							track4 = (Track)tracks.get(blockTrackNumber);
	//  147  298:aload_0         
	//  148  299:getfield        #392 <Field SparseArray tracks>
	//  149  302:aload_0         
	//  150  303:getfield        #734 <Field int blockTrackNumber>
	//  151  306:invokevirtual   #742 <Method Object SparseArray.get(int)>
	//  152  309:checkcast       #13  <Class WebmExtractor$Track>
	//  153  312:astore          15
							if(track4 == null)
	//* 154  314:aload           15
	//* 155  316:ifnonnull       337
							{
								extractorinput.skipFully(j - blockTrackNumberLength);
	//  156  319:aload_3         
	//  157  320:iload_2         
	//  158  321:aload_0         
	//  159  322:getfield        #739 <Field int blockTrackNumberLength>
	//  160  325:isub            
	//  161  326:invokeinterface #745 <Method void ExtractorInput.skipFully(int)>
								blockState = 0;
	//  162  331:aload_0         
	//  163  332:iconst_0        
	//  164  333:putfield        #728 <Field int blockState>
								return;
	//  165  336:return          
							}
							if(blockState != 1)
								break label0;
	//  166  337:aload_0         
	//  167  338:getfield        #728 <Field int blockState>
	//  168  341:iconst_1        
	//  169  342:icmpne          1208
							readScratch(extractorinput, 3);
	//  170  345:aload_0         
	//  171  346:aload_3         
	//  172  347:iconst_3        
	//  173  348:invokespecial   #747 <Method void readScratch(ExtractorInput, int)>
							k = (scratch.data[2] & 6) >> 1;
	//  174  351:aload_0         
	//  175  352:getfield        #399 <Field ParsableByteArray scratch>
	//  176  355:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  177  358:iconst_2        
	//  178  359:baload          
	//  179  360:bipush          6
	//  180  362:iand            
	//  181  363:iconst_1        
	//  182  364:ishr            
	//  183  365:istore          4
							if(k == 0)
	//* 184  367:iload           4
	//* 185  369:ifne            406
							{
								blockLacingSampleCount = 1;
	//  186  372:aload_0         
	//  187  373:iconst_1        
	//  188  374:putfield        #749 <Field int blockLacingSampleCount>
								blockLacingSampleSizes = ensureArrayCapacity(blockLacingSampleSizes, 1);
	//  189  377:aload_0         
	//  190  378:aload_0         
	//  191  379:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  192  382:iconst_1        
	//  193  383:invokestatic    #753 <Method int[] ensureArrayCapacity(int[], int)>
	//  194  386:putfield        #751 <Field int[] blockLacingSampleSizes>
								blockLacingSampleSizes[0] = j - blockTrackNumberLength - 3;
	//  195  389:aload_0         
	//  196  390:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  197  393:iconst_0        
	//  198  394:iload_2         
	//  199  395:aload_0         
	//  200  396:getfield        #739 <Field int blockTrackNumberLength>
	//  201  399:isub            
	//  202  400:iconst_3        
	//  203  401:isub            
	//  204  402:iastore         
								break label3;
	//  205  403:goto            1008
							}
							if(i != 163)
								break label1;
	//  206  406:iload_1         
	//  207  407:sipush          163
	//  208  410:icmpne          1197
							readScratch(extractorinput, 4);
	//  209  413:aload_0         
	//  210  414:aload_3         
	//  211  415:iconst_4        
	//  212  416:invokespecial   #747 <Method void readScratch(ExtractorInput, int)>
							blockLacingSampleCount = (scratch.data[3] & 0xff) + 1;
	//  213  419:aload_0         
	//  214  420:aload_0         
	//  215  421:getfield        #399 <Field ParsableByteArray scratch>
	//  216  424:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  217  427:iconst_3        
	//  218  428:baload          
	//  219  429:sipush          255
	//  220  432:iand            
	//  221  433:iconst_1        
	//  222  434:iadd            
	//  223  435:putfield        #749 <Field int blockLacingSampleCount>
							blockLacingSampleSizes = ensureArrayCapacity(blockLacingSampleSizes, blockLacingSampleCount);
	//  224  438:aload_0         
	//  225  439:aload_0         
	//  226  440:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  227  443:aload_0         
	//  228  444:getfield        #749 <Field int blockLacingSampleCount>
	//  229  447:invokestatic    #753 <Method int[] ensureArrayCapacity(int[], int)>
	//  230  450:putfield        #751 <Field int[] blockLacingSampleSizes>
							if(k == 2)
	//* 231  453:iload           4
	//* 232  455:iconst_2        
	//* 233  456:icmpne          495
							{
								int l = blockTrackNumberLength;
	//  234  459:aload_0         
	//  235  460:getfield        #739 <Field int blockTrackNumberLength>
	//  236  463:istore          5
								k = blockLacingSampleCount;
	//  237  465:aload_0         
	//  238  466:getfield        #749 <Field int blockLacingSampleCount>
	//  239  469:istore          4
								j = (j - l - 4) / k;
	//  240  471:iload_2         
	//  241  472:iload           5
	//  242  474:isub            
	//  243  475:iconst_4        
	//  244  476:isub            
	//  245  477:iload           4
	//  246  479:idiv            
	//  247  480:istore_2        
								Arrays.fill(blockLacingSampleSizes, 0, k, j);
	//  248  481:aload_0         
	//  249  482:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  250  485:iconst_0        
	//  251  486:iload           4
	//  252  488:iload_2         
	//  253  489:invokestatic    #756 <Method void Arrays.fill(int[], int, int, int)>
								break label3;
	//  254  492:goto            1008
							}
							if(k == 1)
	//* 255  495:iload           4
	//* 256  497:iconst_1        
	//* 257  498:icmpne          643
							{
								k = 4;
	//  258  501:iconst_4        
	//  259  502:istore          4
								int k1 = 0;
	//  260  504:iconst_0        
	//  261  505:istore          6
								int i1 = k1;
	//  262  507:iload           6
	//  263  509:istore          5
								int i2;
								do
								{
									i2 = blockLacingSampleCount;
	//  264  511:aload_0         
	//  265  512:getfield        #749 <Field int blockLacingSampleCount>
	//  266  515:istore          7
									if(k1 >= i2 - 1)
										break;
	//  267  517:iload           6
	//  268  519:iload           7
	//  269  521:iconst_1        
	//  270  522:isub            
	//  271  523:icmpge          619
									blockLacingSampleSizes[k1] = 0;
	//  272  526:aload_0         
	//  273  527:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  274  530:iload           6
	//  275  532:iconst_0        
	//  276  533:iastore         
									i2 = k;
	//  277  534:iload           4
	//  278  536:istore          7
									int k2;
									int ai[];
									do
									{
										k = i2 + 1;
	//  279  538:iload           7
	//  280  540:iconst_1        
	//  281  541:iadd            
	//  282  542:istore          4
										readScratch(extractorinput, k);
	//  283  544:aload_0         
	//  284  545:aload_3         
	//  285  546:iload           4
	//  286  548:invokespecial   #747 <Method void readScratch(ExtractorInput, int)>
										k2 = scratch.data[k - 1] & 0xff;
	//  287  551:aload_0         
	//  288  552:getfield        #399 <Field ParsableByteArray scratch>
	//  289  555:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  290  558:iload           4
	//  291  560:iconst_1        
	//  292  561:isub            
	//  293  562:baload          
	//  294  563:sipush          255
	//  295  566:iand            
	//  296  567:istore          8
										ai = blockLacingSampleSizes;
	//  297  569:aload_0         
	//  298  570:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  299  573:astore          16
										ai[k1] = ai[k1] + k2;
	//  300  575:aload           16
	//  301  577:iload           6
	//  302  579:aload           16
	//  303  581:iload           6
	//  304  583:iaload          
	//  305  584:iload           8
	//  306  586:iadd            
	//  307  587:iastore         
										i2 = k;
	//  308  588:iload           4
	//  309  590:istore          7
									} while(k2 == 255);
	//  310  592:iload           8
	//  311  594:sipush          255
	//  312  597:icmpeq          538
									i1 += ai[k1];
	//  313  600:iload           5
	//  314  602:aload           16
	//  315  604:iload           6
	//  316  606:iaload          
	//  317  607:iadd            
	//  318  608:istore          5
									k1++;
	//  319  610:iload           6
	//  320  612:iconst_1        
	//  321  613:iadd            
	//  322  614:istore          6
								} while(true);
	//  323  616:goto            511
								blockLacingSampleSizes[i2 - 1] = j - blockTrackNumberLength - k - i1;
	//  324  619:aload_0         
	//  325  620:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  326  623:iload           7
	//  327  625:iconst_1        
	//  328  626:isub            
	//  329  627:iload_2         
	//  330  628:aload_0         
	//  331  629:getfield        #739 <Field int blockTrackNumberLength>
	//  332  632:isub            
	//  333  633:iload           4
	//  334  635:isub            
	//  335  636:iload           5
	//  336  638:isub            
	//  337  639:iastore         
								break label3;
	//  338  640:goto            1008
							}
							if(k != 3)
								break label2;
	//  339  643:iload           4
	//  340  645:iconst_3        
	//  341  646:icmpne          1162
							k = 4;
	//  342  649:iconst_4        
	//  343  650:istore          4
							int l1 = 0;
	//  344  652:iconst_0        
	//  345  653:istore          6
							j1 = l1;
	//  346  655:iload           6
	//  347  657:istore          5
label5:
							do
							{
								long l3;
label6:
								{
									j2 = blockLacingSampleCount;
	//  348  659:aload_0         
	//  349  660:getfield        #749 <Field int blockLacingSampleCount>
	//  350  663:istore          7
									if(l1 >= j2 - 1)
										break label4;
	//  351  665:iload           6
	//  352  667:iload           7
	//  353  669:iconst_1        
	//  354  670:isub            
	//  355  671:icmpge          987
									blockLacingSampleSizes[l1] = 0;
	//  356  674:aload_0         
	//  357  675:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  358  678:iload           6
	//  359  680:iconst_0        
	//  360  681:iastore         
									j2 = k + 1;
	//  361  682:iload           4
	//  362  684:iconst_1        
	//  363  685:iadd            
	//  364  686:istore          7
									readScratch(extractorinput, j2);
	//  365  688:aload_0         
	//  366  689:aload_3         
	//  367  690:iload           7
	//  368  692:invokespecial   #747 <Method void readScratch(ExtractorInput, int)>
									byte abyte0[] = scratch.data;
	//  369  695:aload_0         
	//  370  696:getfield        #399 <Field ParsableByteArray scratch>
	//  371  699:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  372  702:astore          16
									int i3 = j2 - 1;
	//  373  704:iload           7
	//  374  706:iconst_1        
	//  375  707:isub            
	//  376  708:istore          9
									if(abyte0[i3] == 0)
										break label5;
	//  377  710:aload           16
	//  378  712:iload           9
	//  379  714:baload          
	//  380  715:ifeq            976
									k = 0;
	//  381  718:iconst_0        
	//  382  719:istore          4
									do
									{
										if(k >= 8)
											break;
	//  383  721:iload           4
	//  384  723:bipush          8
	//  385  725:icmpge          881
										int j3 = 1 << 7 - k;
	//  386  728:iconst_1        
	//  387  729:bipush          7
	//  388  731:iload           4
	//  389  733:isub            
	//  390  734:ishl            
	//  391  735:istore          10
										if((scratch.data[i3] & j3) != 0)
	//* 392  737:aload_0         
	//* 393  738:getfield        #399 <Field ParsableByteArray scratch>
	//* 394  741:getfield        #539 <Field byte[] ParsableByteArray.data>
	//* 395  744:iload           9
	//* 396  746:baload          
	//* 397  747:iload           10
	//* 398  749:iand            
	//* 399  750:ifeq            872
										{
											int l2 = j2 + k;
	//  400  753:iload           7
	//  401  755:iload           4
	//  402  757:iadd            
	//  403  758:istore          8
											readScratch(extractorinput, l2);
	//  404  760:aload_0         
	//  405  761:aload_3         
	//  406  762:iload           8
	//  407  764:invokespecial   #747 <Method void readScratch(ExtractorInput, int)>
											l3 = j3 & (scratch.data[i3] & 0xff);
	//  408  767:iload           10
	//  409  769:aload_0         
	//  410  770:getfield        #399 <Field ParsableByteArray scratch>
	//  411  773:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  412  776:iload           9
	//  413  778:baload          
	//  414  779:sipush          255
	//  415  782:iand            
	//  416  783:iand            
	//  417  784:i2l             
	//  418  785:lstore          11
											for(j2 = i3 + 1; j2 < l2;)
	//* 419  787:iload           9
	//* 420  789:iconst_1        
	//* 421  790:iadd            
	//* 422  791:istore          7
	//* 423  793:iload           7
	//* 424  795:iload           8
	//* 425  797:icmpge          836
											{
												long l4 = scratch.data[j2] & 0xff;
	//  426  800:aload_0         
	//  427  801:getfield        #399 <Field ParsableByteArray scratch>
	//  428  804:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  429  807:iload           7
	//  430  809:baload          
	//  431  810:sipush          255
	//  432  813:iand            
	//  433  814:i2l             
	//  434  815:lstore          13
												j2++;
	//  435  817:iload           7
	//  436  819:iconst_1        
	//  437  820:iadd            
	//  438  821:istore          7
												l3 = l4 | l3 << 8;
	//  439  823:lload           13
	//  440  825:lload           11
	//  441  827:bipush          8
	//  442  829:lshl            
	//  443  830:lor             
	//  444  831:lstore          11
											}

	//* 445  833:goto            793
											if(l1 > 0)
	//* 446  836:iload           6
	//* 447  838:ifle            865
											{
												l3 -= (1L << k * 7 + 6) - 1L;
	//  448  841:lload           11
	//  449  843:lconst_1        
	//  450  844:iload           4
	//  451  846:bipush          7
	//  452  848:imul            
	//  453  849:bipush          6
	//  454  851:iadd            
	//  455  852:lshl            
	//  456  853:lconst_1        
	//  457  854:lsub            
	//  458  855:lsub            
	//  459  856:lstore          11
												k = l2;
	//  460  858:iload           8
	//  461  860:istore          4
											} else
	//* 462  862:goto            888
											{
												k = l2;
	//  463  865:iload           8
	//  464  867:istore          4
											}
											break label6;
	//  465  869:goto            888
										}
										k++;
	//  466  872:iload           4
	//  467  874:iconst_1        
	//  468  875:iadd            
	//  469  876:istore          4
									} while(true);
	//  470  878:goto            721
									l3 = 0L;
	//  471  881:lconst_0        
	//  472  882:lstore          11
									k = j2;
	//  473  884:iload           7
	//  474  886:istore          4
								}
								if(l3 >= 0x80000000L && l3 <= 0x7fffffffL)
	//* 475  888:lload           11
	//* 476  890:ldc2w           #757 <Long 0x80000000L>
	//* 477  893:lcmp            
	//* 478  894:iflt            965
	//* 479  897:lload           11
	//* 480  899:ldc2w           #759 <Long 0x7fffffffL>
	//* 481  902:lcmp            
	//* 482  903:ifgt            965
								{
									j2 = (int)l3;
	//  483  906:lload           11
	//  484  908:l2i             
	//  485  909:istore          7
									int ai1[] = blockLacingSampleSizes;
	//  486  911:aload_0         
	//  487  912:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  488  915:astore          16
									if(l1 != 0)
	//* 489  917:iload           6
	//* 490  919:ifne            925
	//* 491  922:goto            937
										j2 += ai1[l1 - 1];
	//  492  925:iload           7
	//  493  927:aload           16
	//  494  929:iload           6
	//  495  931:iconst_1        
	//  496  932:isub            
	//  497  933:iaload          
	//  498  934:iadd            
	//  499  935:istore          7
									ai1[l1] = j2;
	//  500  937:aload           16
	//  501  939:iload           6
	//  502  941:iload           7
	//  503  943:iastore         
									j1 += blockLacingSampleSizes[l1];
	//  504  944:iload           5
	//  505  946:aload_0         
	//  506  947:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  507  950:iload           6
	//  508  952:iaload          
	//  509  953:iadd            
	//  510  954:istore          5
									l1++;
	//  511  956:iload           6
	//  512  958:iconst_1        
	//  513  959:iadd            
	//  514  960:istore          6
								} else
	//* 515  962:goto            659
								{
									throw new ParserException("EBML lacing sample size out of range.");
	//  516  965:new             #601 <Class ParserException>
	//  517  968:dup             
	//  518  969:ldc2            #762 <String "EBML lacing sample size out of range.">
	//  519  972:invokespecial   #614 <Method void ParserException(String)>
	//  520  975:athrow          
								}
							} while(true);
							throw new ParserException("No valid varint length mask found");
	//  521  976:new             #601 <Class ParserException>
	//  522  979:dup             
	//  523  980:ldc2            #764 <String "No valid varint length mask found">
	//  524  983:invokespecial   #614 <Method void ParserException(String)>
	//  525  986:athrow          
						}
						blockLacingSampleSizes[j2 - 1] = j - blockTrackNumberLength - k - j1;
	//  526  987:aload_0         
	//  527  988:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  528  991:iload           7
	//  529  993:iconst_1        
	//  530  994:isub            
	//  531  995:iload_2         
	//  532  996:aload_0         
	//  533  997:getfield        #739 <Field int blockTrackNumberLength>
	//  534 1000:isub            
	//  535 1001:iload           4
	//  536 1003:isub            
	//  537 1004:iload           5
	//  538 1006:isub            
	//  539 1007:iastore         
					}
					j = ((int) (scratch.data[0]));
	//  540 1008:aload_0         
	//  541 1009:getfield        #399 <Field ParsableByteArray scratch>
	//  542 1012:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  543 1015:iconst_0        
	//  544 1016:baload          
	//  545 1017:istore_2        
					k = ((int) (scratch.data[1]));
	//  546 1018:aload_0         
	//  547 1019:getfield        #399 <Field ParsableByteArray scratch>
	//  548 1022:getfield        #539 <Field byte[] ParsableByteArray.data>
	//  549 1025:iconst_1        
	//  550 1026:baload          
	//  551 1027:istore          4
					blockTimeUs = clusterTimecodeUs + scaleTimecodeToUs(j << 8 | k & 0xff);
	//  552 1029:aload_0         
	//  553 1030:aload_0         
	//  554 1031:getfield        #371 <Field long clusterTimecodeUs>
	//  555 1034:aload_0         
	//  556 1035:iload_2         
	//  557 1036:bipush          8
	//  558 1038:ishl            
	//  559 1039:iload           4
	//  560 1041:sipush          255
	//  561 1044:iand            
	//  562 1045:ior             
	//  563 1046:i2l             
	//  564 1047:invokespecial   #766 <Method long scaleTimecodeToUs(long)>
	//  565 1050:ladd            
	//  566 1051:putfield        #768 <Field long blockTimeUs>
					if((scratch.data[2] & 8) == 8)
	//* 567 1054:aload_0         
	//* 568 1055:getfield        #399 <Field ParsableByteArray scratch>
	//* 569 1058:getfield        #539 <Field byte[] ParsableByteArray.data>
	//* 570 1061:iconst_2        
	//* 571 1062:baload          
	//* 572 1063:bipush          8
	//* 573 1065:iand            
	//* 574 1066:bipush          8
	//* 575 1068:icmpne          1077
						k = 1;
	//  576 1071:iconst_1        
	//  577 1072:istore          4
					else
	//* 578 1074:goto            1080
						k = 0;
	//  579 1077:iconst_0        
	//  580 1078:istore          4
					if(track4.type != 2 && (i != 163 || (scratch.data[2] & 0x80) != 128))
	//* 581 1080:aload           15
	//* 582 1082:getfield        #771 <Field int WebmExtractor$Track.type>
	//* 583 1085:iconst_2        
	//* 584 1086:icmpeq          1123
	//* 585 1089:iload_1         
	//* 586 1090:sipush          163
	//* 587 1093:icmpne          1118
	//* 588 1096:aload_0         
	//* 589 1097:getfield        #399 <Field ParsableByteArray scratch>
	//* 590 1100:getfield        #539 <Field byte[] ParsableByteArray.data>
	//* 591 1103:iconst_2        
	//* 592 1104:baload          
	//* 593 1105:sipush          128
	//* 594 1108:iand            
	//* 595 1109:sipush          128
	//* 596 1112:icmpne          1118
	//* 597 1115:goto            1123
						j = 0;
	//  598 1118:iconst_0        
	//  599 1119:istore_2        
					else
	//* 600 1120:goto            1125
						j = 1;
	//  601 1123:iconst_1        
	//  602 1124:istore_2        
					if(k != 0)
	//* 603 1125:iload           4
	//* 604 1127:ifeq            1138
						k = 0x8000000;
	//  605 1130:ldc2            #772 <Int 0x8000000>
	//  606 1133:istore          4
					else
	//* 607 1135:goto            1141
						k = 0;
	//  608 1138:iconst_0        
	//  609 1139:istore          4
					blockFlags = j | k;
	//  610 1141:aload_0         
	//  611 1142:iload_2         
	//  612 1143:iload           4
	//  613 1145:ior             
	//  614 1146:putfield        #487 <Field int blockFlags>
					blockState = 2;
	//  615 1149:aload_0         
	//  616 1150:iconst_2        
	//  617 1151:putfield        #728 <Field int blockState>
					blockLacingSampleIndex = 0;
	//  618 1154:aload_0         
	//  619 1155:iconst_0        
	//  620 1156:putfield        #774 <Field int blockLacingSampleIndex>
					break label0;
	//  621 1159:goto            1208
				}
				extractorinput = ((ExtractorInput) (new StringBuilder()));
	//  622 1162:new             #699 <Class StringBuilder>
	//  623 1165:dup             
	//  624 1166:invokespecial   #700 <Method void StringBuilder()>
	//  625 1169:astore_3        
				((StringBuilder) (extractorinput)).append("Unexpected lacing value: ");
	//  626 1170:aload_3         
	//  627 1171:ldc2            #776 <String "Unexpected lacing value: ">
	//  628 1174:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  629 1177:pop             
				((StringBuilder) (extractorinput)).append(k);
	//  630 1178:aload_3         
	//  631 1179:iload           4
	//  632 1181:invokevirtual   #709 <Method StringBuilder StringBuilder.append(int)>
	//  633 1184:pop             
				throw new ParserException(((StringBuilder) (extractorinput)).toString());
	//  634 1185:new             #601 <Class ParserException>
	//  635 1188:dup             
	//  636 1189:aload_3         
	//  637 1190:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  638 1193:invokespecial   #614 <Method void ParserException(String)>
	//  639 1196:athrow          
			}
			throw new ParserException("Lacing only supported in SimpleBlocks.");
	//  640 1197:new             #601 <Class ParserException>
	//  641 1200:dup             
	//  642 1201:ldc2            #778 <String "Lacing only supported in SimpleBlocks.">
	//  643 1204:invokespecial   #614 <Method void ParserException(String)>
	//  644 1207:athrow          
		}
		if(i == 163)
		{
			do
	//* 645 1208:iload_1         
	//* 646 1209:sipush          163
	//* 647 1212:icmpne          1286
			{
				i = blockLacingSampleIndex;
	//  648 1215:aload_0         
	//  649 1216:getfield        #774 <Field int blockLacingSampleIndex>
	//  650 1219:istore_1        
				if(i < blockLacingSampleCount)
	//* 651 1220:iload_1         
	//* 652 1221:aload_0         
	//* 653 1222:getfield        #749 <Field int blockLacingSampleCount>
	//* 654 1225:icmpge          1280
				{
					writeSampleData(extractorinput, track4, blockLacingSampleSizes[i]);
	//  655 1228:aload_0         
	//  656 1229:aload_3         
	//  657 1230:aload           15
	//  658 1232:aload_0         
	//  659 1233:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  660 1236:iload_1         
	//  661 1237:iaload          
	//  662 1238:invokespecial   #780 <Method void writeSampleData(ExtractorInput, WebmExtractor$Track, int)>
					commitSampleToOutput(track4, blockTimeUs + (long)((blockLacingSampleIndex * track4.defaultSampleDurationNs) / 1000));
	//  663 1241:aload_0         
	//  664 1242:aload           15
	//  665 1244:aload_0         
	//  666 1245:getfield        #768 <Field long blockTimeUs>
	//  667 1248:aload_0         
	//  668 1249:getfield        #774 <Field int blockLacingSampleIndex>
	//  669 1252:aload           15
	//  670 1254:getfield        #783 <Field int WebmExtractor$Track.defaultSampleDurationNs>
	//  671 1257:imul            
	//  672 1258:sipush          1000
	//  673 1261:idiv            
	//  674 1262:i2l             
	//  675 1263:ladd            
	//  676 1264:invokespecial   #785 <Method void commitSampleToOutput(WebmExtractor$Track, long)>
					blockLacingSampleIndex = blockLacingSampleIndex + 1;
	//  677 1267:aload_0         
	//  678 1268:aload_0         
	//  679 1269:getfield        #774 <Field int blockLacingSampleIndex>
	//  680 1272:iconst_1        
	//  681 1273:iadd            
	//  682 1274:putfield        #774 <Field int blockLacingSampleIndex>
				} else
	//* 683 1277:goto            1215
				{
					blockState = 0;
	//  684 1280:aload_0         
	//  685 1281:iconst_0        
	//  686 1282:putfield        #728 <Field int blockState>
					return;
	//  687 1285:return          
				}
			} while(true);
		} else
		{
			writeSampleData(extractorinput, track4, blockLacingSampleSizes[0]);
	//  688 1286:aload_0         
	//  689 1287:aload_3         
	//  690 1288:aload           15
	//  691 1290:aload_0         
	//  692 1291:getfield        #751 <Field int[] blockLacingSampleSizes>
	//  693 1294:iconst_0        
	//  694 1295:iaload          
	//  695 1296:invokespecial   #780 <Method void writeSampleData(ExtractorInput, WebmExtractor$Track, int)>
			return;
	//  696 1299:return          
		}
	}

	void endMasterElement(int i)
		throws ParserException
	{
		if(i != 160)
	//*   0    0:iload_1         
	//*   1    1:sipush          160
	//*   2    4:icmpeq          370
		{
			if(i != 174)
	//*   3    7:iload_1         
	//*   4    8:sipush          174
	//*   5   11:icmpeq          309
			{
				if(i != 19899)
	//*   6   14:iload_1         
	//*   7   15:sipush          19899
	//*   8   18:icmpeq          263
				{
					if(i != 25152)
	//*   9   21:iload_1         
	//*  10   22:sipush          25152
	//*  11   25:icmpeq          185
					{
						if(i != 28032)
	//*  12   28:iload_1         
	//*  13   29:sipush          28032
	//*  14   32:icmpeq          152
						{
							if(i != 0x1549a966)
	//*  15   35:iload_1         
	//*  16   36:ldc1            #181 <Int 0x1549a966>
	//*  17   38:icmpeq          111
							{
								if(i != 0x1654ae6b)
	//*  18   41:iload_1         
	//*  19   42:ldc1            #218 <Int 0x1654ae6b>
	//*  20   44:icmpeq          80
								{
									if(i != 0x1c53bb6b)
	//*  21   47:iload_1         
	//*  22   48:ldc1            #153 <Int 0x1c53bb6b>
	//*  23   50:icmpeq          54
										return;
	//   24   53:return          
									if(!sentSeekMap)
	//*  25   54:aload_0         
	//*  26   55:getfield        #524 <Field boolean sentSeekMap>
	//*  27   58:ifne            79
									{
										extractorOutput.seekMap(buildSeekMap());
	//   28   61:aload_0         
	//   29   62:getfield        #788 <Field ExtractorOutput extractorOutput>
	//   30   65:aload_0         
	//   31   66:invokespecial   #790 <Method SeekMap buildSeekMap()>
	//   32   69:invokeinterface #796 <Method void ExtractorOutput.seekMap(SeekMap)>
										sentSeekMap = true;
	//   33   74:aload_0         
	//   34   75:iconst_1        
	//   35   76:putfield        #524 <Field boolean sentSeekMap>
									}
									return;
	//   36   79:return          
								}
								if(tracks.size() != 0)
	//*  37   80:aload_0         
	//*  38   81:getfield        #392 <Field SparseArray tracks>
	//*  39   84:invokevirtual   #797 <Method int SparseArray.size()>
	//*  40   87:ifeq            100
								{
									extractorOutput.endTracks();
	//   41   90:aload_0         
	//   42   91:getfield        #788 <Field ExtractorOutput extractorOutput>
	//   43   94:invokeinterface #800 <Method void ExtractorOutput.endTracks()>
									return;
	//   44   99:return          
								} else
								{
									throw new ParserException("No valid tracks were found");
	//   45  100:new             #601 <Class ParserException>
	//   46  103:dup             
	//   47  104:ldc2            #802 <String "No valid tracks were found">
	//   48  107:invokespecial   #614 <Method void ParserException(String)>
	//   49  110:athrow          
								}
							}
							if(timecodeScale == -1L)
	//*  50  111:aload_0         
	//*  51  112:getfield        #361 <Field long timecodeScale>
	//*  52  115:ldc2w           #354 <Long -1L>
	//*  53  118:lcmp            
	//*  54  119:ifne            129
								timecodeScale = 0xf4240L;
	//   55  122:aload_0         
	//   56  123:ldc2w           #622 <Long 0xf4240L>
	//   57  126:putfield        #361 <Field long timecodeScale>
							long l = durationTimecode;
	//   58  129:aload_0         
	//   59  130:getfield        #363 <Field long durationTimecode>
	//   60  133:lstore_2        
							if(l != -1L)
	//*  61  134:lload_2         
	//*  62  135:ldc2w           #354 <Long -1L>
	//*  63  138:lcmp            
	//*  64  139:ifeq            151
								durationUs = scaleTimecodeToUs(l);
	//   65  142:aload_0         
	//   66  143:aload_0         
	//   67  144:lload_2         
	//   68  145:invokespecial   #766 <Method long scaleTimecodeToUs(long)>
	//   69  148:putfield        #365 <Field long durationUs>
							return;
	//   70  151:return          
						}
						if(currentTrack.hasContentEncryption)
	//*  71  152:aload_0         
	//*  72  153:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//*  73  156:getfield        #659 <Field boolean WebmExtractor$Track.hasContentEncryption>
	//*  74  159:ifeq            184
						{
							if(currentTrack.sampleStrippedBytes == null)
	//*  75  162:aload_0         
	//*  76  163:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//*  77  166:getfield        #679 <Field byte[] WebmExtractor$Track.sampleStrippedBytes>
	//*  78  169:ifnonnull       173
								return;
	//   79  172:return          
							else
								throw new ParserException("Combining encryption and compression is not supported");
	//   80  173:new             #601 <Class ParserException>
	//   81  176:dup             
	//   82  177:ldc2            #804 <String "Combining encryption and compression is not supported">
	//   83  180:invokespecial   #614 <Method void ParserException(String)>
	//   84  183:athrow          
						} else
						{
							return;
	//   85  184:return          
						}
					}
					if(currentTrack.hasContentEncryption)
	//*  86  185:aload_0         
	//*  87  186:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//*  88  189:getfield        #659 <Field boolean WebmExtractor$Track.hasContentEncryption>
	//*  89  192:ifeq            262
						if(currentTrack.encryptionKeyId != null)
	//*  90  195:aload_0         
	//*  91  196:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//*  92  199:getfield        #492 <Field byte[] WebmExtractor$Track.encryptionKeyId>
	//*  93  202:ifnull          251
						{
							if(!sentDrmInitData)
	//*  94  205:aload_0         
	//*  95  206:getfield        #806 <Field boolean sentDrmInitData>
	//*  96  209:ifne            262
							{
								extractorOutput.drmInitData(((com.google.android.exoplayer.drm.DrmInitData) (new com.google.android.exoplayer.drm.DrmInitData.Universal(new com.google.android.exoplayer.drm.DrmInitData.SchemeInitData("video/webm", currentTrack.encryptionKeyId)))));
	//   97  212:aload_0         
	//   98  213:getfield        #788 <Field ExtractorOutput extractorOutput>
	//   99  216:new             #808 <Class com.google.android.exoplayer.drm.DrmInitData$Universal>
	//  100  219:dup             
	//  101  220:new             #810 <Class com.google.android.exoplayer.drm.DrmInitData$SchemeInitData>
	//  102  223:dup             
	//  103  224:ldc2            #812 <String "video/webm">
	//  104  227:aload_0         
	//  105  228:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  106  231:getfield        #492 <Field byte[] WebmExtractor$Track.encryptionKeyId>
	//  107  234:invokespecial   #815 <Method void com.google.android.exoplayer.drm.DrmInitData$SchemeInitData(String, byte[])>
	//  108  237:invokespecial   #818 <Method void com.google.android.exoplayer.drm.DrmInitData$Universal(com.google.android.exoplayer.drm.DrmInitData$SchemeInitData)>
	//  109  240:invokeinterface #822 <Method void ExtractorOutput.drmInitData(com.google.android.exoplayer.drm.DrmInitData)>
								sentDrmInitData = true;
	//  110  245:aload_0         
	//  111  246:iconst_1        
	//  112  247:putfield        #806 <Field boolean sentDrmInitData>
								return;
	//  113  250:return          
							}
						} else
						{
							throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
	//  114  251:new             #601 <Class ParserException>
	//  115  254:dup             
	//  116  255:ldc2            #824 <String "Encrypted Track found but ContentEncKeyID was not found">
	//  117  258:invokespecial   #614 <Method void ParserException(String)>
	//  118  261:athrow          
						}
					return;
	//  119  262:return          
				}
				i = seekEntryId;
	//  120  263:aload_0         
	//  121  264:getfield        #726 <Field int seekEntryId>
	//  122  267:istore_1        
				if(i != -1)
	//* 123  268:iload_1         
	//* 124  269:iconst_m1       
	//* 125  270:icmpeq          298
				{
					long l1 = seekEntryPosition;
	//  126  273:aload_0         
	//  127  274:getfield        #826 <Field long seekEntryPosition>
	//  128  277:lstore_2        
					if(l1 != -1L)
	//* 129  278:lload_2         
	//* 130  279:ldc2w           #354 <Long -1L>
	//* 131  282:lcmp            
	//* 132  283:ifeq            298
					{
						if(i == 0x1c53bb6b)
	//* 133  286:iload_1         
	//* 134  287:ldc1            #153 <Int 0x1c53bb6b>
	//* 135  289:icmpne          297
							cuesContentPosition = l1;
	//  136  292:aload_0         
	//  137  293:lload_2         
	//  138  294:putfield        #367 <Field long cuesContentPosition>
						return;
	//  139  297:return          
					}
				}
				throw new ParserException("Mandatory element SeekID or SeekPosition not found");
	//  140  298:new             #601 <Class ParserException>
	//  141  301:dup             
	//  142  302:ldc2            #828 <String "Mandatory element SeekID or SeekPosition not found">
	//  143  305:invokespecial   #614 <Method void ParserException(String)>
	//  144  308:athrow          
			}
			if(isCodecSupported(currentTrack.codecId))
	//* 145  309:aload_0         
	//* 146  310:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//* 147  313:getfield        #471 <Field String WebmExtractor$Track.codecId>
	//* 148  316:invokestatic    #830 <Method boolean isCodecSupported(String)>
	//* 149  319:ifeq            364
			{
				Track track = currentTrack;
	//  150  322:aload_0         
	//  151  323:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  152  326:astore          4
				track.initializeOutput(extractorOutput, track.number, durationUs);
	//  153  328:aload           4
	//  154  330:aload_0         
	//  155  331:getfield        #788 <Field ExtractorOutput extractorOutput>
	//  156  334:aload           4
	//  157  336:getfield        #833 <Field int WebmExtractor$Track.number>
	//  158  339:aload_0         
	//  159  340:getfield        #365 <Field long durationUs>
	//  160  343:invokevirtual   #837 <Method void WebmExtractor$Track.initializeOutput(ExtractorOutput, int, long)>
				tracks.put(currentTrack.number, ((Object) (currentTrack)));
	//  161  346:aload_0         
	//  162  347:getfield        #392 <Field SparseArray tracks>
	//  163  350:aload_0         
	//  164  351:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  165  354:getfield        #833 <Field int WebmExtractor$Track.number>
	//  166  357:aload_0         
	//  167  358:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  168  361:invokevirtual   #841 <Method void SparseArray.put(int, Object)>
			}
			currentTrack = null;
	//  169  364:aload_0         
	//  170  365:aconst_null     
	//  171  366:putfield        #694 <Field WebmExtractor$Track currentTrack>
			return;
	//  172  369:return          
		}
		if(blockState != 2)
	//* 173  370:aload_0         
	//* 174  371:getfield        #728 <Field int blockState>
	//* 175  374:iconst_2        
	//* 176  375:icmpeq          379
			return;
	//  177  378:return          
		if(!sampleSeenReferenceBlock)
	//* 178  379:aload_0         
	//* 179  380:getfield        #843 <Field boolean sampleSeenReferenceBlock>
	//* 180  383:ifne            396
			blockFlags = blockFlags | 1;
	//  181  386:aload_0         
	//  182  387:aload_0         
	//  183  388:getfield        #487 <Field int blockFlags>
	//  184  391:iconst_1        
	//  185  392:ior             
	//  186  393:putfield        #487 <Field int blockFlags>
		commitSampleToOutput((Track)tracks.get(blockTrackNumber), blockTimeUs);
	//  187  396:aload_0         
	//  188  397:aload_0         
	//  189  398:getfield        #392 <Field SparseArray tracks>
	//  190  401:aload_0         
	//  191  402:getfield        #734 <Field int blockTrackNumber>
	//  192  405:invokevirtual   #742 <Method Object SparseArray.get(int)>
	//  193  408:checkcast       #13  <Class WebmExtractor$Track>
	//  194  411:aload_0         
	//  195  412:getfield        #768 <Field long blockTimeUs>
	//  196  415:invokespecial   #785 <Method void commitSampleToOutput(WebmExtractor$Track, long)>
		blockState = 0;
	//  197  418:aload_0         
	//  198  419:iconst_0        
	//  199  420:putfield        #728 <Field int blockState>
	//  200  423:return          
	}

	void floatElement(int i, double d)
	{
		if(i != 181)
	//*   0    0:iload_1         
	//*   1    1:sipush          181
	//*   2    4:icmpeq          22
		{
			if(i != 17545)
	//*   3    7:iload_1         
	//*   4    8:sipush          17545
	//*   5   11:icmpeq          15
			{
				return;
	//    6   14:return          
			} else
			{
				durationTimecode = (long)d;
	//    7   15:aload_0         
	//    8   16:dload_2         
	//    9   17:d2l             
	//   10   18:putfield        #363 <Field long durationTimecode>
				return;
	//   11   21:return          
			}
		} else
		{
			currentTrack.sampleRate = (int)d;
	//   12   22:aload_0         
	//   13   23:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   14   26:dload_2         
	//   15   27:d2i             
	//   16   28:putfield        #848 <Field int WebmExtractor$Track.sampleRate>
			return;
	//   17   31:return          
		}
	}

	int getElementType(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    59: default 484
	//	               131: 494
	//	               134: 492
	//	               155: 494
	//	               159: 494
	//	               160: 490
	//	               161: 488
	//	               163: 488
	//	               174: 490
	//	               176: 494
	//	               179: 494
	//	               181: 486
	//	               183: 490
	//	               186: 494
	//	               187: 490
	//	               215: 494
	//	               224: 490
	//	               225: 490
	//	               231: 494
	//	               241: 494
	//	               251: 494
	//	               16980: 494
	//	               16981: 488
	//	               17026: 492
	//	               17029: 494
	//	               17143: 494
	//	               17545: 486
	//	               18401: 494
	//	               18402: 488
	//	               18407: 490
	//	               18408: 494
	//	               19899: 490
	//	               20529: 494
	//	               20530: 494
	//	               20532: 490
	//	               20533: 490
	//	               21419: 488
	//	               21420: 494
	//	               21432: 494
	//	               21680: 494
	//	               21682: 494
	//	               21690: 494
	//	               22186: 494
	//	               22203: 494
	//	               25152: 490
	//	               25188: 494
	//	               25506: 488
	//	               28032: 490
	//	               30320: 490
	//	               30322: 488
	//	               2274716: 492
	//	               2352003: 494
	//	               2807729: 494
	//	               290298740: 490
	//	               357149030: 490
	//	               374648427: 490
	//	               408125543: 490
	//	               440786851: 490
	//	               475249515: 490
	//	               524531317: 490
		default:
			return 0;
	//    2  484:iconst_0        
	//    3  485:ireturn         

		case 181: 
		case 17545: 
			return 5;
	//    4  486:iconst_5        
	//    5  487:ireturn         

		case 161: 
		case 163: 
		case 16981: 
		case 18402: 
		case 21419: 
		case 25506: 
		case 30322: 
			return 4;
	//    6  488:iconst_4        
	//    7  489:ireturn         

		case 160: 
		case 174: 
		case 183: 
		case 187: 
		case 224: 
		case 225: 
		case 18407: 
		case 19899: 
		case 20532: 
		case 20533: 
		case 25152: 
		case 28032: 
		case 30320: 
		case 290298740: 
		case 357149030: 
		case 374648427: 
		case 408125543: 
		case 440786851: 
		case 475249515: 
		case 524531317: 
			return 1;
	//    8  490:iconst_1        
	//    9  491:ireturn         

		case 134: 
		case 17026: 
		case 2274716: 
			return 3;
	//   10  492:iconst_3        
	//   11  493:ireturn         

		case 131: 
		case 155: 
		case 159: 
		case 176: 
		case 179: 
		case 186: 
		case 215: 
		case 231: 
		case 241: 
		case 251: 
		case 16980: 
		case 17029: 
		case 17143: 
		case 18401: 
		case 18408: 
		case 20529: 
		case 20530: 
		case 21420: 
		case 21432: 
		case 21680: 
		case 21682: 
		case 21690: 
		case 22186: 
		case 22203: 
		case 25188: 
		case 2352003: 
		case 2807729: 
			return 2;
	//   12  494:iconst_2        
	//   13  495:ireturn         
		}
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #788 <Field ExtractorOutput extractorOutput>
	//    3    5:return          
	}

	void integerElement(int i, long l)
		throws ParserException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    27: default 228
	//	               131: 878
	//	               155: 868
	//	               159: 858
	//	               176: 848
	//	               179: 835
	//	               186: 825
	//	               215: 815
	//	               231: 805
	//	               241: 784
	//	               251: 778
	//	               16980: 722
	//	               17029: 660
	//	               17143: 606
	//	               18401: 550
	//	               18408: 496
	//	               20529: 442
	//	               20530: 388
	//	               21420: 377
	//	               21432: 303
	//	               21680: 293
	//	               21682: 283
	//	               21690: 273
	//	               22186: 264
	//	               22203: 255
	//	               25188: 245
	//	               2352003: 235
	//	               2807729: 229
		default:
			return;
	//    2  228:return          

		case 2807729: 
			timecodeScale = l;
	//    3  229:aload_0         
	//    4  230:lload_2         
	//    5  231:putfield        #361 <Field long timecodeScale>
			return;
	//    6  234:return          

		case 2352003: 
			currentTrack.defaultSampleDurationNs = (int)l;
	//    7  235:aload_0         
	//    8  236:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//    9  239:lload_2         
	//   10  240:l2i             
	//   11  241:putfield        #783 <Field int WebmExtractor$Track.defaultSampleDurationNs>
			return;
	//   12  244:return          

		case 25188: 
			currentTrack.audioBitDepth = (int)l;
	//   13  245:aload_0         
	//   14  246:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   15  249:lload_2         
	//   16  250:l2i             
	//   17  251:putfield        #856 <Field int WebmExtractor$Track.audioBitDepth>
			return;
	//   18  254:return          

		case 22203: 
			currentTrack.seekPreRollNs = l;
	//   19  255:aload_0         
	//   20  256:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   21  259:lload_2         
	//   22  260:putfield        #859 <Field long WebmExtractor$Track.seekPreRollNs>
			return;
	//   23  263:return          

		case 22186: 
			currentTrack.codecDelayNs = l;
	//   24  264:aload_0         
	//   25  265:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   26  268:lload_2         
	//   27  269:putfield        #862 <Field long WebmExtractor$Track.codecDelayNs>
			return;
	//   28  272:return          

		case 21690: 
			currentTrack.displayHeight = (int)l;
	//   29  273:aload_0         
	//   30  274:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   31  277:lload_2         
	//   32  278:l2i             
	//   33  279:putfield        #865 <Field int WebmExtractor$Track.displayHeight>
			return;
	//   34  282:return          

		case 21682: 
			currentTrack.displayUnit = (int)l;
	//   35  283:aload_0         
	//   36  284:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   37  287:lload_2         
	//   38  288:l2i             
	//   39  289:putfield        #868 <Field int WebmExtractor$Track.displayUnit>
			return;
	//   40  292:return          

		case 21680: 
			currentTrack.displayWidth = (int)l;
	//   41  293:aload_0         
	//   42  294:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   43  297:lload_2         
	//   44  298:l2i             
	//   45  299:putfield        #871 <Field int WebmExtractor$Track.displayWidth>
			return;
	//   46  302:return          

		case 21432: 
			i = (int)l;
	//   47  303:lload_2         
	//   48  304:l2i             
	//   49  305:istore_1        
			if(i != 3)
	//*  50  306:iload_1         
	//*  51  307:iconst_3        
	//*  52  308:icmpeq          368
			{
				if(i != 15)
	//*  53  311:iload_1         
	//*  54  312:bipush          15
	//*  55  314:icmpeq          359
				{
					switch(i)
	//*  56  317:iload_1         
					{
	//*  57  318:tableswitch     0 1: default 340
	//	               0 350
	//	               1 341
					default:
						return;
	//   58  340:return          

					case 1: // '\001'
						currentTrack.stereoMode = 2;
	//   59  341:aload_0         
	//   60  342:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   61  345:iconst_2        
	//   62  346:putfield        #874 <Field int WebmExtractor$Track.stereoMode>
						return;
	//   63  349:return          

					case 0: // '\0'
						currentTrack.stereoMode = 0;
	//   64  350:aload_0         
	//   65  351:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   66  354:iconst_0        
	//   67  355:putfield        #874 <Field int WebmExtractor$Track.stereoMode>
						return;
	//   68  358:return          
					}
				} else
				{
					currentTrack.stereoMode = 3;
	//   69  359:aload_0         
	//   70  360:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   71  363:iconst_3        
	//   72  364:putfield        #874 <Field int WebmExtractor$Track.stereoMode>
					return;
	//   73  367:return          
				}
			} else
			{
				currentTrack.stereoMode = 1;
	//   74  368:aload_0         
	//   75  369:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   76  372:iconst_1        
	//   77  373:putfield        #874 <Field int WebmExtractor$Track.stereoMode>
				return;
	//   78  376:return          
			}

		case 21420: 
			seekEntryPosition = l + segmentContentPosition;
	//   79  377:aload_0         
	//   80  378:lload_2         
	//   81  379:aload_0         
	//   82  380:getfield        #357 <Field long segmentContentPosition>
	//   83  383:ladd            
	//   84  384:putfield        #826 <Field long seekEntryPosition>
			return;
	//   85  387:return          

		case 20530: 
			if(l == 1L)
	//*  86  388:lload_2         
	//*  87  389:lconst_1        
	//*  88  390:lcmp            
	//*  89  391:ifne            395
			{
				return;
	//   90  394:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   91  395:new             #699 <Class StringBuilder>
	//   92  398:dup             
	//   93  399:invokespecial   #700 <Method void StringBuilder()>
	//   94  402:astore          4
				stringbuilder.append("ContentEncodingScope ");
	//   95  404:aload           4
	//   96  406:ldc2            #876 <String "ContentEncodingScope ">
	//   97  409:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//   98  412:pop             
				stringbuilder.append(l);
	//   99  413:aload           4
	//  100  415:lload_2         
	//  101  416:invokevirtual   #879 <Method StringBuilder StringBuilder.append(long)>
	//  102  419:pop             
				stringbuilder.append(" not supported");
	//  103  420:aload           4
	//  104  422:ldc2            #881 <String " not supported">
	//  105  425:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  106  428:pop             
				throw new ParserException(stringbuilder.toString());
	//  107  429:new             #601 <Class ParserException>
	//  108  432:dup             
	//  109  433:aload           4
	//  110  435:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  111  438:invokespecial   #614 <Method void ParserException(String)>
	//  112  441:athrow          
			}

		case 20529: 
			if(l == 0L)
	//* 113  442:lload_2         
	//* 114  443:lconst_0        
	//* 115  444:lcmp            
	//* 116  445:ifne            449
			{
				return;
	//  117  448:return          
			} else
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//  118  449:new             #699 <Class StringBuilder>
	//  119  452:dup             
	//  120  453:invokespecial   #700 <Method void StringBuilder()>
	//  121  456:astore          4
				stringbuilder1.append("ContentEncodingOrder ");
	//  122  458:aload           4
	//  123  460:ldc2            #883 <String "ContentEncodingOrder ">
	//  124  463:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  125  466:pop             
				stringbuilder1.append(l);
	//  126  467:aload           4
	//  127  469:lload_2         
	//  128  470:invokevirtual   #879 <Method StringBuilder StringBuilder.append(long)>
	//  129  473:pop             
				stringbuilder1.append(" not supported");
	//  130  474:aload           4
	//  131  476:ldc2            #881 <String " not supported">
	//  132  479:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  133  482:pop             
				throw new ParserException(stringbuilder1.toString());
	//  134  483:new             #601 <Class ParserException>
	//  135  486:dup             
	//  136  487:aload           4
	//  137  489:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  138  492:invokespecial   #614 <Method void ParserException(String)>
	//  139  495:athrow          
			}

		case 18408: 
			if(l == 1L)
	//* 140  496:lload_2         
	//* 141  497:lconst_1        
	//* 142  498:lcmp            
	//* 143  499:ifne            503
			{
				return;
	//  144  502:return          
			} else
			{
				StringBuilder stringbuilder2 = new StringBuilder();
	//  145  503:new             #699 <Class StringBuilder>
	//  146  506:dup             
	//  147  507:invokespecial   #700 <Method void StringBuilder()>
	//  148  510:astore          4
				stringbuilder2.append("AESSettingsCipherMode ");
	//  149  512:aload           4
	//  150  514:ldc2            #885 <String "AESSettingsCipherMode ">
	//  151  517:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  152  520:pop             
				stringbuilder2.append(l);
	//  153  521:aload           4
	//  154  523:lload_2         
	//  155  524:invokevirtual   #879 <Method StringBuilder StringBuilder.append(long)>
	//  156  527:pop             
				stringbuilder2.append(" not supported");
	//  157  528:aload           4
	//  158  530:ldc2            #881 <String " not supported">
	//  159  533:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  160  536:pop             
				throw new ParserException(stringbuilder2.toString());
	//  161  537:new             #601 <Class ParserException>
	//  162  540:dup             
	//  163  541:aload           4
	//  164  543:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  165  546:invokespecial   #614 <Method void ParserException(String)>
	//  166  549:athrow          
			}

		case 18401: 
			if(l == 5L)
	//* 167  550:lload_2         
	//* 168  551:ldc2w           #886 <Long 5L>
	//* 169  554:lcmp            
	//* 170  555:ifne            559
			{
				return;
	//  171  558:return          
			} else
			{
				StringBuilder stringbuilder3 = new StringBuilder();
	//  172  559:new             #699 <Class StringBuilder>
	//  173  562:dup             
	//  174  563:invokespecial   #700 <Method void StringBuilder()>
	//  175  566:astore          4
				stringbuilder3.append("ContentEncAlgo ");
	//  176  568:aload           4
	//  177  570:ldc2            #889 <String "ContentEncAlgo ">
	//  178  573:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  179  576:pop             
				stringbuilder3.append(l);
	//  180  577:aload           4
	//  181  579:lload_2         
	//  182  580:invokevirtual   #879 <Method StringBuilder StringBuilder.append(long)>
	//  183  583:pop             
				stringbuilder3.append(" not supported");
	//  184  584:aload           4
	//  185  586:ldc2            #881 <String " not supported">
	//  186  589:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  187  592:pop             
				throw new ParserException(stringbuilder3.toString());
	//  188  593:new             #601 <Class ParserException>
	//  189  596:dup             
	//  190  597:aload           4
	//  191  599:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  192  602:invokespecial   #614 <Method void ParserException(String)>
	//  193  605:athrow          
			}

		case 17143: 
			if(l == 1L)
	//* 194  606:lload_2         
	//* 195  607:lconst_1        
	//* 196  608:lcmp            
	//* 197  609:ifne            613
			{
				return;
	//  198  612:return          
			} else
			{
				StringBuilder stringbuilder4 = new StringBuilder();
	//  199  613:new             #699 <Class StringBuilder>
	//  200  616:dup             
	//  201  617:invokespecial   #700 <Method void StringBuilder()>
	//  202  620:astore          4
				stringbuilder4.append("EBMLReadVersion ");
	//  203  622:aload           4
	//  204  624:ldc2            #891 <String "EBMLReadVersion ">
	//  205  627:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  206  630:pop             
				stringbuilder4.append(l);
	//  207  631:aload           4
	//  208  633:lload_2         
	//  209  634:invokevirtual   #879 <Method StringBuilder StringBuilder.append(long)>
	//  210  637:pop             
				stringbuilder4.append(" not supported");
	//  211  638:aload           4
	//  212  640:ldc2            #881 <String " not supported">
	//  213  643:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  214  646:pop             
				throw new ParserException(stringbuilder4.toString());
	//  215  647:new             #601 <Class ParserException>
	//  216  650:dup             
	//  217  651:aload           4
	//  218  653:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  219  656:invokespecial   #614 <Method void ParserException(String)>
	//  220  659:athrow          
			}

		case 17029: 
			if(l >= 1L && l <= 2L)
	//* 221  660:lload_2         
	//* 222  661:lconst_1        
	//* 223  662:lcmp            
	//* 224  663:iflt            675
	//* 225  666:lload_2         
	//* 226  667:ldc2w           #892 <Long 2L>
	//* 227  670:lcmp            
	//* 228  671:ifgt            675
			{
				return;
	//  229  674:return          
			} else
			{
				StringBuilder stringbuilder5 = new StringBuilder();
	//  230  675:new             #699 <Class StringBuilder>
	//  231  678:dup             
	//  232  679:invokespecial   #700 <Method void StringBuilder()>
	//  233  682:astore          4
				stringbuilder5.append("DocTypeReadVersion ");
	//  234  684:aload           4
	//  235  686:ldc2            #895 <String "DocTypeReadVersion ">
	//  236  689:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  237  692:pop             
				stringbuilder5.append(l);
	//  238  693:aload           4
	//  239  695:lload_2         
	//  240  696:invokevirtual   #879 <Method StringBuilder StringBuilder.append(long)>
	//  241  699:pop             
				stringbuilder5.append(" not supported");
	//  242  700:aload           4
	//  243  702:ldc2            #881 <String " not supported">
	//  244  705:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  245  708:pop             
				throw new ParserException(stringbuilder5.toString());
	//  246  709:new             #601 <Class ParserException>
	//  247  712:dup             
	//  248  713:aload           4
	//  249  715:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  250  718:invokespecial   #614 <Method void ParserException(String)>
	//  251  721:athrow          
			}

		case 16980: 
			if(l == 3L)
	//* 252  722:lload_2         
	//* 253  723:ldc2w           #896 <Long 3L>
	//* 254  726:lcmp            
	//* 255  727:ifne            731
			{
				return;
	//  256  730:return          
			} else
			{
				StringBuilder stringbuilder6 = new StringBuilder();
	//  257  731:new             #699 <Class StringBuilder>
	//  258  734:dup             
	//  259  735:invokespecial   #700 <Method void StringBuilder()>
	//  260  738:astore          4
				stringbuilder6.append("ContentCompAlgo ");
	//  261  740:aload           4
	//  262  742:ldc2            #899 <String "ContentCompAlgo ">
	//  263  745:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  264  748:pop             
				stringbuilder6.append(l);
	//  265  749:aload           4
	//  266  751:lload_2         
	//  267  752:invokevirtual   #879 <Method StringBuilder StringBuilder.append(long)>
	//  268  755:pop             
				stringbuilder6.append(" not supported");
	//  269  756:aload           4
	//  270  758:ldc2            #881 <String " not supported">
	//  271  761:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//  272  764:pop             
				throw new ParserException(stringbuilder6.toString());
	//  273  765:new             #601 <Class ParserException>
	//  274  768:dup             
	//  275  769:aload           4
	//  276  771:invokevirtual   #713 <Method String StringBuilder.toString()>
	//  277  774:invokespecial   #614 <Method void ParserException(String)>
	//  278  777:athrow          
			}

		case 251: 
			sampleSeenReferenceBlock = true;
	//  279  778:aload_0         
	//  280  779:iconst_1        
	//  281  780:putfield        #843 <Field boolean sampleSeenReferenceBlock>
			return;
	//  282  783:return          

		case 241: 
			if(!seenClusterPositionForCurrentCuePoint)
	//* 283  784:aload_0         
	//* 284  785:getfield        #901 <Field boolean seenClusterPositionForCurrentCuePoint>
	//* 285  788:ifne            804
			{
				cueClusterPositions.add(l);
	//  286  791:aload_0         
	//  287  792:getfield        #451 <Field LongArray cueClusterPositions>
	//  288  795:lload_2         
	//  289  796:invokevirtual   #905 <Method void LongArray.add(long)>
				seenClusterPositionForCurrentCuePoint = true;
	//  290  799:aload_0         
	//  291  800:iconst_1        
	//  292  801:putfield        #901 <Field boolean seenClusterPositionForCurrentCuePoint>
			}
			return;
	//  293  804:return          

		case 231: 
			clusterTimecodeUs = scaleTimecodeToUs(l);
	//  294  805:aload_0         
	//  295  806:aload_0         
	//  296  807:lload_2         
	//  297  808:invokespecial   #766 <Method long scaleTimecodeToUs(long)>
	//  298  811:putfield        #371 <Field long clusterTimecodeUs>
			return;
	//  299  814:return          

		case 215: 
			currentTrack.number = (int)l;
	//  300  815:aload_0         
	//  301  816:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  302  819:lload_2         
	//  303  820:l2i             
	//  304  821:putfield        #833 <Field int WebmExtractor$Track.number>
			return;
	//  305  824:return          

		case 186: 
			currentTrack.height = (int)l;
	//  306  825:aload_0         
	//  307  826:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  308  829:lload_2         
	//  309  830:l2i             
	//  310  831:putfield        #908 <Field int WebmExtractor$Track.height>
			return;
	//  311  834:return          

		case 179: 
			cueTimesUs.add(scaleTimecodeToUs(l));
	//  312  835:aload_0         
	//  313  836:getfield        #443 <Field LongArray cueTimesUs>
	//  314  839:aload_0         
	//  315  840:lload_2         
	//  316  841:invokespecial   #766 <Method long scaleTimecodeToUs(long)>
	//  317  844:invokevirtual   #905 <Method void LongArray.add(long)>
			return;
	//  318  847:return          

		case 176: 
			currentTrack.width = (int)l;
	//  319  848:aload_0         
	//  320  849:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  321  852:lload_2         
	//  322  853:l2i             
	//  323  854:putfield        #911 <Field int WebmExtractor$Track.width>
			return;
	//  324  857:return          

		case 159: 
			currentTrack.channelCount = (int)l;
	//  325  858:aload_0         
	//  326  859:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  327  862:lload_2         
	//  328  863:l2i             
	//  329  864:putfield        #914 <Field int WebmExtractor$Track.channelCount>
			return;
	//  330  867:return          

		case 155: 
			blockDurationUs = scaleTimecodeToUs(l);
	//  331  868:aload_0         
	//  332  869:aload_0         
	//  333  870:lload_2         
	//  334  871:invokespecial   #766 <Method long scaleTimecodeToUs(long)>
	//  335  874:putfield        #688 <Field long blockDurationUs>
			return;
	//  336  877:return          

		case 131: 
			currentTrack.type = (int)l;
	//  337  878:aload_0         
	//  338  879:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//  339  882:lload_2         
	//  340  883:l2i             
	//  341  884:putfield        #771 <Field int WebmExtractor$Track.type>
			return;
	//  342  887:return          
		}
	}

	boolean isLevel1Element(int i)
	{
		return i == 0x1549a966 || i == 0x1f43b675 || i == 0x1c53bb6b || i == 0x1654ae6b;
	//    0    0:iload_1         
	//    1    1:ldc1            #181 <Int 0x1549a966>
	//    2    3:icmpeq          29
	//    3    6:iload_1         
	//    4    7:ldc1            #121 <Int 0x1f43b675>
	//    5    9:icmpeq          29
	//    6   12:iload_1         
	//    7   13:ldc1            #153 <Int 0x1c53bb6b>
	//    8   15:icmpeq          29
	//    9   18:iload_1         
	//   10   19:ldc1            #218 <Int 0x1654ae6b>
	//   11   21:icmpne          27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		sampleRead = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #500 <Field boolean sampleRead>
		boolean flag;
		for(flag = true; flag && !sampleRead;)
	//*   3    5:iconst_1        
	//*   4    6:istore_3        
	//*   5    7:iload_3         
	//*   6    8:ifeq            57
	//*   7   11:aload_0         
	//*   8   12:getfield        #500 <Field boolean sampleRead>
	//*   9   15:ifne            57
		{
			boolean flag1 = reader.read(extractorinput);
	//   10   18:aload_0         
	//   11   19:getfield        #373 <Field EbmlReader reader>
	//   12   22:aload_1         
	//   13   23:invokeinterface #921 <Method boolean EbmlReader.read(ExtractorInput)>
	//   14   28:istore          4
			flag = flag1;
	//   15   30:iload           4
	//   16   32:istore_3        
			if(flag1)
	//*  17   33:iload           4
	//*  18   35:ifeq            7
			{
				flag = flag1;
	//   19   38:iload           4
	//   20   40:istore_3        
				if(maybeSeekForCues(positionholder, extractorinput.getPosition()))
	//*  21   41:aload_0         
	//*  22   42:aload_2         
	//*  23   43:aload_1         
	//*  24   44:invokeinterface #924 <Method long ExtractorInput.getPosition()>
	//*  25   49:invokespecial   #926 <Method boolean maybeSeekForCues(PositionHolder, long)>
	//*  26   52:ifeq            7
					return 1;
	//   27   55:iconst_1        
	//   28   56:ireturn         
			}
		}

		return !flag ? -1 : 0;
	//   29   57:iload_3         
	//   30   58:ifeq            63
	//   31   61:iconst_0        
	//   32   62:ireturn         
	//   33   63:iconst_m1       
	//   34   64:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		clusterTimecodeUs = -1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #354 <Long -1L>
	//    2    4:putfield        #371 <Field long clusterTimecodeUs>
		blockState = 0;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #728 <Field int blockState>
		reader.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #373 <Field EbmlReader reader>
	//    8   16:invokeinterface #929 <Method void EbmlReader.reset()>
		varintReader.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #387 <Field VarintReader varintReader>
	//   11   25:invokevirtual   #930 <Method void VarintReader.reset()>
		resetSample();
	//   12   28:aload_0         
	//   13   29:invokespecial   #503 <Method void resetSample()>
	//   14   32:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return (new Sniffer()).sniff(extractorinput);
	//    0    0:new             #933 <Class Sniffer>
	//    1    3:dup             
	//    2    4:invokespecial   #934 <Method void Sniffer()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #936 <Method boolean Sniffer.sniff(ExtractorInput)>
	//    5   11:ireturn         
	}

	void startMasterElement(int i, long l, long l1)
		throws ParserException
	{
		if(i != 160)
	//*   0    0:iload_1         
	//*   1    1:sipush          160
	//*   2    4:icmpeq          216
		{
			if(i != 174)
	//*   3    7:iload_1         
	//*   4    8:sipush          174
	//*   5   11:icmpeq          203
			{
				if(i != 187)
	//*   6   14:iload_1         
	//*   7   15:sipush          187
	//*   8   18:icmpeq          197
				{
					if(i != 19899)
	//*   9   21:iload_1         
	//*  10   22:sipush          19899
	//*  11   25:icmpeq          184
					{
						if(i != 20533)
	//*  12   28:iload_1         
	//*  13   29:sipush          20533
	//*  14   32:icmpeq          175
						{
							if(i != 25152)
	//*  15   35:iload_1         
	//*  16   36:sipush          25152
	//*  17   39:icmpeq          174
							{
								if(i != 0x18538067)
	//*  18   42:iload_1         
	//*  19   43:ldc1            #207 <Int 0x18538067>
	//*  20   45:icmpeq          126
									if(i != 0x1c53bb6b)
	//*  21   48:iload_1         
	//*  22   49:ldc1            #153 <Int 0x1c53bb6b>
	//*  23   51:icmpeq          103
									{
										if(i != 0x1f43b675)
	//*  24   54:iload_1         
	//*  25   55:ldc1            #121 <Int 0x1f43b675>
	//*  26   57:icmpeq          61
											return;
	//   27   60:return          
										if(!sentSeekMap)
	//*  28   61:aload_0         
	//*  29   62:getfield        #524 <Field boolean sentSeekMap>
	//*  30   65:ifne            102
										{
											if(cuesContentPosition != -1L)
	//*  31   68:aload_0         
	//*  32   69:getfield        #367 <Field long cuesContentPosition>
	//*  33   72:ldc2w           #354 <Long -1L>
	//*  34   75:lcmp            
	//*  35   76:ifeq            85
											{
												seekForCues = true;
	//   36   79:aload_0         
	//   37   80:iconst_1        
	//   38   81:putfield        #517 <Field boolean seekForCues>
												return;
	//   39   84:return          
											}
											extractorOutput.seekMap(SeekMap.UNSEEKABLE);
	//   40   85:aload_0         
	//   41   86:getfield        #788 <Field ExtractorOutput extractorOutput>
	//   42   89:getstatic       #466 <Field SeekMap SeekMap.UNSEEKABLE>
	//   43   92:invokeinterface #796 <Method void ExtractorOutput.seekMap(SeekMap)>
											sentSeekMap = true;
	//   44   97:aload_0         
	//   45   98:iconst_1        
	//   46   99:putfield        #524 <Field boolean sentSeekMap>
										}
										return;
	//   47  102:return          
									} else
									{
										cueTimesUs = new LongArray();
	//   48  103:aload_0         
	//   49  104:new             #445 <Class LongArray>
	//   50  107:dup             
	//   51  108:invokespecial   #939 <Method void LongArray()>
	//   52  111:putfield        #443 <Field LongArray cueTimesUs>
										cueClusterPositions = new LongArray();
	//   53  114:aload_0         
	//   54  115:new             #445 <Class LongArray>
	//   55  118:dup             
	//   56  119:invokespecial   #939 <Method void LongArray()>
	//   57  122:putfield        #451 <Field LongArray cueClusterPositions>
										return;
	//   58  125:return          
									}
								long l2 = segmentContentPosition;
	//   59  126:aload_0         
	//   60  127:getfield        #357 <Field long segmentContentPosition>
	//   61  130:lstore          6
								if(l2 != -1L && l2 != l)
	//*  62  132:lload           6
	//*  63  134:ldc2w           #354 <Long -1L>
	//*  64  137:lcmp            
	//*  65  138:ifeq            162
	//*  66  141:lload           6
	//*  67  143:lload_2         
	//*  68  144:lcmp            
	//*  69  145:ifne            151
	//*  70  148:goto            162
								{
									throw new ParserException("Multiple Segment elements not supported");
	//   71  151:new             #601 <Class ParserException>
	//   72  154:dup             
	//   73  155:ldc2            #941 <String "Multiple Segment elements not supported">
	//   74  158:invokespecial   #614 <Method void ParserException(String)>
	//   75  161:athrow          
								} else
								{
									segmentContentPosition = l;
	//   76  162:aload_0         
	//   77  163:lload_2         
	//   78  164:putfield        #357 <Field long segmentContentPosition>
									segmentContentSize = l1;
	//   79  167:aload_0         
	//   80  168:lload           4
	//   81  170:putfield        #359 <Field long segmentContentSize>
									return;
	//   82  173:return          
								}
							} else
							{
								return;
	//   83  174:return          
							}
						} else
						{
							currentTrack.hasContentEncryption = true;
	//   84  175:aload_0         
	//   85  176:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   86  179:iconst_1        
	//   87  180:putfield        #659 <Field boolean WebmExtractor$Track.hasContentEncryption>
							return;
	//   88  183:return          
						}
					} else
					{
						seekEntryId = -1;
	//   89  184:aload_0         
	//   90  185:iconst_m1       
	//   91  186:putfield        #726 <Field int seekEntryId>
						seekEntryPosition = -1L;
	//   92  189:aload_0         
	//   93  190:ldc2w           #354 <Long -1L>
	//   94  193:putfield        #826 <Field long seekEntryPosition>
						return;
	//   95  196:return          
					}
				} else
				{
					seenClusterPositionForCurrentCuePoint = false;
	//   96  197:aload_0         
	//   97  198:iconst_0        
	//   98  199:putfield        #901 <Field boolean seenClusterPositionForCurrentCuePoint>
					return;
	//   99  202:return          
				}
			} else
			{
				currentTrack = new Track();
	//  100  203:aload_0         
	//  101  204:new             #13  <Class WebmExtractor$Track>
	//  102  207:dup             
	//  103  208:aconst_null     
	//  104  209:invokespecial   #944 <Method void WebmExtractor$Track(WebmExtractor$1)>
	//  105  212:putfield        #694 <Field WebmExtractor$Track currentTrack>
				return;
	//  106  215:return          
			}
		} else
		{
			sampleSeenReferenceBlock = false;
	//  107  216:aload_0         
	//  108  217:iconst_0        
	//  109  218:putfield        #843 <Field boolean sampleSeenReferenceBlock>
			return;
	//  110  221:return          
		}
	}

	void stringElement(int i, String s)
		throws ParserException
	{
		if(i != 134)
	//*   0    0:iload_1         
	//*   1    1:sipush          134
	//*   2    4:icmpeq          93
		{
			if(i != 17026)
	//*   3    7:iload_1         
	//*   4    8:sipush          17026
	//*   5   11:icmpeq          31
				if(i != 0x22b59c)
	//*   6   14:iload_1         
	//*   7   15:ldc1            #183 <Int 0x22b59c>
	//*   8   17:icmpeq          21
				{
					return;
	//    9   20:return          
				} else
				{
					currentTrack.language = s;
	//   10   21:aload_0         
	//   11   22:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   12   25:aload_2         
	//   13   26:invokestatic    #950 <Method String WebmExtractor$Track.access$202(WebmExtractor$Track, String)>
	//   14   29:pop             
					return;
	//   15   30:return          
				}
			if(!"webm".equals(((Object) (s))))
	//*  16   31:ldc1            #103 <String "webm">
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #477 <Method boolean String.equals(Object)>
	//*  19   37:ifne            92
			{
				if("matroska".equals(((Object) (s))))
	//*  20   40:ldc1            #100 <String "matroska">
	//*  21   42:aload_2         
	//*  22   43:invokevirtual   #477 <Method boolean String.equals(Object)>
	//*  23   46:ifeq            50
				{
					return;
	//   24   49:return          
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   25   50:new             #699 <Class StringBuilder>
	//   26   53:dup             
	//   27   54:invokespecial   #700 <Method void StringBuilder()>
	//   28   57:astore_3        
					stringbuilder.append("DocType ");
	//   29   58:aload_3         
	//   30   59:ldc2            #952 <String "DocType ">
	//   31   62:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//   32   65:pop             
					stringbuilder.append(s);
	//   33   66:aload_3         
	//   34   67:aload_2         
	//   35   68:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
					stringbuilder.append(" not supported");
	//   37   72:aload_3         
	//   38   73:ldc2            #881 <String " not supported">
	//   39   76:invokevirtual   #706 <Method StringBuilder StringBuilder.append(String)>
	//   40   79:pop             
					throw new ParserException(stringbuilder.toString());
	//   41   80:new             #601 <Class ParserException>
	//   42   83:dup             
	//   43   84:aload_3         
	//   44   85:invokevirtual   #713 <Method String StringBuilder.toString()>
	//   45   88:invokespecial   #614 <Method void ParserException(String)>
	//   46   91:athrow          
				}
			} else
			{
				return;
	//   47   92:return          
			}
		} else
		{
			currentTrack.codecId = s;
	//   48   93:aload_0         
	//   49   94:getfield        #694 <Field WebmExtractor$Track currentTrack>
	//   50   97:aload_2         
	//   51   98:putfield        #471 <Field String WebmExtractor$Track.codecId>
			return;
	//   52  101:return          
		}
	}

	private static final int BLOCK_STATE_DATA = 2;
	private static final int BLOCK_STATE_HEADER = 1;
	private static final int BLOCK_STATE_START = 0;
	private static final String CODEC_ID_AAC = "A_AAC";
	private static final String CODEC_ID_AC3 = "A_AC3";
	private static final String CODEC_ID_ACM = "A_MS/ACM";
	private static final String CODEC_ID_DTS = "A_DTS";
	private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
	private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
	private static final String CODEC_ID_E_AC3 = "A_EAC3";
	private static final String CODEC_ID_FLAC = "A_FLAC";
	private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
	private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
	private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
	private static final String CODEC_ID_MP3 = "A_MPEG/L3";
	private static final String CODEC_ID_MPEG2 = "V_MPEG2";
	private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
	private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
	private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
	private static final String CODEC_ID_OPUS = "A_OPUS";
	private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
	private static final String CODEC_ID_PGS = "S_HDMV/PGS";
	private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
	private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
	private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
	private static final String CODEC_ID_VORBIS = "A_VORBIS";
	private static final String CODEC_ID_VP8 = "V_VP8";
	private static final String CODEC_ID_VP9 = "V_VP9";
	private static final String DOC_TYPE_MATROSKA = "matroska";
	private static final String DOC_TYPE_WEBM = "webm";
	private static final int ENCRYPTION_IV_SIZE = 8;
	private static final int FOURCC_COMPRESSION_VC1 = 0x31435657;
	private static final int ID_AUDIO = 225;
	private static final int ID_AUDIO_BIT_DEPTH = 25188;
	private static final int ID_BLOCK = 161;
	private static final int ID_BLOCK_DURATION = 155;
	private static final int ID_BLOCK_GROUP = 160;
	private static final int ID_CHANNELS = 159;
	private static final int ID_CLUSTER = 0x1f43b675;
	private static final int ID_CODEC_DELAY = 22186;
	private static final int ID_CODEC_ID = 134;
	private static final int ID_CODEC_PRIVATE = 25506;
	private static final int ID_CONTENT_COMPRESSION = 20532;
	private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
	private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
	private static final int ID_CONTENT_ENCODING = 25152;
	private static final int ID_CONTENT_ENCODINGS = 28032;
	private static final int ID_CONTENT_ENCODING_ORDER = 20529;
	private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
	private static final int ID_CONTENT_ENCRYPTION = 20533;
	private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
	private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
	private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
	private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
	private static final int ID_CUES = 0x1c53bb6b;
	private static final int ID_CUE_CLUSTER_POSITION = 241;
	private static final int ID_CUE_POINT = 187;
	private static final int ID_CUE_TIME = 179;
	private static final int ID_CUE_TRACK_POSITIONS = 183;
	private static final int ID_DEFAULT_DURATION = 0x23e383;
	private static final int ID_DISPLAY_HEIGHT = 21690;
	private static final int ID_DISPLAY_UNIT = 21682;
	private static final int ID_DISPLAY_WIDTH = 21680;
	private static final int ID_DOC_TYPE = 17026;
	private static final int ID_DOC_TYPE_READ_VERSION = 17029;
	private static final int ID_DURATION = 17545;
	private static final int ID_EBML = 0x1a45dfa3;
	private static final int ID_EBML_READ_VERSION = 17143;
	private static final int ID_INFO = 0x1549a966;
	private static final int ID_LANGUAGE = 0x22b59c;
	private static final int ID_PIXEL_HEIGHT = 186;
	private static final int ID_PIXEL_WIDTH = 176;
	private static final int ID_PROJECTION = 30320;
	private static final int ID_PROJECTION_PRIVATE = 30322;
	private static final int ID_REFERENCE_BLOCK = 251;
	private static final int ID_SAMPLING_FREQUENCY = 181;
	private static final int ID_SEEK = 19899;
	private static final int ID_SEEK_HEAD = 0x114d9b74;
	private static final int ID_SEEK_ID = 21419;
	private static final int ID_SEEK_POSITION = 21420;
	private static final int ID_SEEK_PRE_ROLL = 22203;
	private static final int ID_SEGMENT = 0x18538067;
	private static final int ID_SEGMENT_INFO = 0x1549a966;
	private static final int ID_SIMPLE_BLOCK = 163;
	private static final int ID_STEREO_MODE = 21432;
	private static final int ID_TIMECODE_SCALE = 0x2ad7b1;
	private static final int ID_TIME_CODE = 231;
	private static final int ID_TRACKS = 0x1654ae6b;
	private static final int ID_TRACK_ENTRY = 174;
	private static final int ID_TRACK_NUMBER = 215;
	private static final int ID_TRACK_TYPE = 131;
	private static final int ID_VIDEO = 224;
	private static final int LACING_EBML = 3;
	private static final int LACING_FIXED_SIZE = 2;
	private static final int LACING_NONE = 0;
	private static final int LACING_XIPH = 1;
	private static final int MP3_MAX_INPUT_SIZE = 4096;
	private static final int OPUS_MAX_INPUT_SIZE = 5760;
	private static final byte SUBRIP_PREFIX[] = {
		49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 
		44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 
		48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 
		48, 10
	};
	private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
	private static final byte SUBRIP_TIMECODE_EMPTY[] = {
		32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 
		32, 32
	};
	private static final int SUBRIP_TIMECODE_LENGTH = 12;
	private static final int TRACK_TYPE_AUDIO = 2;
	private static final int UNKNOWN = -1;
	private static final int VORBIS_MAX_INPUT_SIZE = 8192;
	private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
	private static final int WAVE_FORMAT_PCM = 1;
	private static final int WAVE_FORMAT_SIZE = 18;
	private static final UUID WAVE_SUBFORMAT_PCM = new UUID(0x1000L, 0x389b71L);
	private long blockDurationUs;
	private int blockFlags;
	private int blockLacingSampleCount;
	private int blockLacingSampleIndex;
	private int blockLacingSampleSizes[];
	private int blockState;
	private long blockTimeUs;
	private int blockTrackNumber;
	private int blockTrackNumberLength;
	private long clusterTimecodeUs;
	private LongArray cueClusterPositions;
	private LongArray cueTimesUs;
	private long cuesContentPosition;
	private Track currentTrack;
	private long durationTimecode;
	private long durationUs;
	private final ParsableByteArray encryptionInitializationVector;
	private final ParsableByteArray encryptionSubsampleData;
	private ByteBuffer encryptionSubsampleDataBuffer;
	private ExtractorOutput extractorOutput;
	private final ParsableByteArray nalLength;
	private final ParsableByteArray nalStartCode;
	private final EbmlReader reader;
	private int sampleBytesRead;
	private int sampleBytesWritten;
	private int sampleCurrentNalBytesRemaining;
	private boolean sampleEncodingHandled;
	private boolean sampleInitializationVectorRead;
	private int samplePartitionCount;
	private boolean samplePartitionCountRead;
	private boolean sampleRead;
	private boolean sampleSeenReferenceBlock;
	private byte sampleSignalByte;
	private boolean sampleSignalByteRead;
	private final ParsableByteArray sampleStrippedBytes;
	private final ParsableByteArray scratch;
	private int seekEntryId;
	private final ParsableByteArray seekEntryIdBytes;
	private long seekEntryPosition;
	private boolean seekForCues;
	private long seekPositionAfterBuildingCues;
	private boolean seenClusterPositionForCurrentCuePoint;
	private long segmentContentPosition;
	private long segmentContentSize;
	private boolean sentDrmInitData;
	private boolean sentSeekMap;
	private final ParsableByteArray subripSample;
	private long timecodeScale;
	private final SparseArray tracks;
	private final VarintReader varintReader;
	private final ParsableByteArray vorbisNumPageSamples;

	static 
	{
	//    0    0:bipush          32
	//    1    2:newarray        byte[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc2            #321 <Int 49>
	//    5    9:bastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc2            #322 <Int 10>
	//    9   15:bastore         
	//   10   16:dup             
	//   11   17:iconst_2        
	//   12   18:ldc2            #323 <Int 48>
	//   13   21:bastore         
	//   14   22:dup             
	//   15   23:iconst_3        
	//   16   24:ldc2            #323 <Int 48>
	//   17   27:bastore         
	//   18   28:dup             
	//   19   29:iconst_4        
	//   20   30:ldc2            #324 <Int 58>
	//   21   33:bastore         
	//   22   34:dup             
	//   23   35:iconst_5        
	//   24   36:ldc2            #323 <Int 48>
	//   25   39:bastore         
	//   26   40:dup             
	//   27   41:bipush          6
	//   28   43:ldc2            #323 <Int 48>
	//   29   46:bastore         
	//   30   47:dup             
	//   31   48:bipush          7
	//   32   50:ldc2            #324 <Int 58>
	//   33   53:bastore         
	//   34   54:dup             
	//   35   55:bipush          8
	//   36   57:ldc2            #323 <Int 48>
	//   37   60:bastore         
	//   38   61:dup             
	//   39   62:bipush          9
	//   40   64:ldc2            #323 <Int 48>
	//   41   67:bastore         
	//   42   68:dup             
	//   43   69:bipush          10
	//   44   71:ldc2            #325 <Int 44>
	//   45   74:bastore         
	//   46   75:dup             
	//   47   76:bipush          11
	//   48   78:ldc2            #323 <Int 48>
	//   49   81:bastore         
	//   50   82:dup             
	//   51   83:bipush          12
	//   52   85:ldc2            #323 <Int 48>
	//   53   88:bastore         
	//   54   89:dup             
	//   55   90:bipush          13
	//   56   92:ldc2            #323 <Int 48>
	//   57   95:bastore         
	//   58   96:dup             
	//   59   97:bipush          14
	//   60   99:ldc2            #326 <Int 32>
	//   61  102:bastore         
	//   62  103:dup             
	//   63  104:bipush          15
	//   64  106:ldc2            #327 <Int 45>
	//   65  109:bastore         
	//   66  110:dup             
	//   67  111:bipush          16
	//   68  113:ldc2            #327 <Int 45>
	//   69  116:bastore         
	//   70  117:dup             
	//   71  118:bipush          17
	//   72  120:ldc2            #328 <Int 62>
	//   73  123:bastore         
	//   74  124:dup             
	//   75  125:bipush          18
	//   76  127:ldc2            #326 <Int 32>
	//   77  130:bastore         
	//   78  131:dup             
	//   79  132:bipush          19
	//   80  134:ldc2            #323 <Int 48>
	//   81  137:bastore         
	//   82  138:dup             
	//   83  139:bipush          20
	//   84  141:ldc2            #323 <Int 48>
	//   85  144:bastore         
	//   86  145:dup             
	//   87  146:bipush          21
	//   88  148:ldc2            #324 <Int 58>
	//   89  151:bastore         
	//   90  152:dup             
	//   91  153:bipush          22
	//   92  155:ldc2            #323 <Int 48>
	//   93  158:bastore         
	//   94  159:dup             
	//   95  160:bipush          23
	//   96  162:ldc2            #323 <Int 48>
	//   97  165:bastore         
	//   98  166:dup             
	//   99  167:bipush          24
	//  100  169:ldc2            #324 <Int 58>
	//  101  172:bastore         
	//  102  173:dup             
	//  103  174:bipush          25
	//  104  176:ldc2            #323 <Int 48>
	//  105  179:bastore         
	//  106  180:dup             
	//  107  181:bipush          26
	//  108  183:ldc2            #323 <Int 48>
	//  109  186:bastore         
	//  110  187:dup             
	//  111  188:bipush          27
	//  112  190:ldc2            #325 <Int 44>
	//  113  193:bastore         
	//  114  194:dup             
	//  115  195:bipush          28
	//  116  197:ldc2            #323 <Int 48>
	//  117  200:bastore         
	//  118  201:dup             
	//  119  202:bipush          29
	//  120  204:ldc2            #323 <Int 48>
	//  121  207:bastore         
	//  122  208:dup             
	//  123  209:bipush          30
	//  124  211:ldc2            #323 <Int 48>
	//  125  214:bastore         
	//  126  215:dup             
	//  127  216:bipush          31
	//  128  218:ldc2            #322 <Int 10>
	//  129  221:bastore         
	//  130  222:putstatic       #330 <Field byte[] SUBRIP_PREFIX>
	//  131  225:bipush          12
	//  132  227:newarray        byte[]
	//  133  229:dup             
	//  134  230:iconst_0        
	//  135  231:ldc2            #326 <Int 32>
	//  136  234:bastore         
	//  137  235:dup             
	//  138  236:iconst_1        
	//  139  237:ldc2            #326 <Int 32>
	//  140  240:bastore         
	//  141  241:dup             
	//  142  242:iconst_2        
	//  143  243:ldc2            #326 <Int 32>
	//  144  246:bastore         
	//  145  247:dup             
	//  146  248:iconst_3        
	//  147  249:ldc2            #326 <Int 32>
	//  148  252:bastore         
	//  149  253:dup             
	//  150  254:iconst_4        
	//  151  255:ldc2            #326 <Int 32>
	//  152  258:bastore         
	//  153  259:dup             
	//  154  260:iconst_5        
	//  155  261:ldc2            #326 <Int 32>
	//  156  264:bastore         
	//  157  265:dup             
	//  158  266:bipush          6
	//  159  268:ldc2            #326 <Int 32>
	//  160  271:bastore         
	//  161  272:dup             
	//  162  273:bipush          7
	//  163  275:ldc2            #326 <Int 32>
	//  164  278:bastore         
	//  165  279:dup             
	//  166  280:bipush          8
	//  167  282:ldc2            #326 <Int 32>
	//  168  285:bastore         
	//  169  286:dup             
	//  170  287:bipush          9
	//  171  289:ldc2            #326 <Int 32>
	//  172  292:bastore         
	//  173  293:dup             
	//  174  294:bipush          10
	//  175  296:ldc2            #326 <Int 32>
	//  176  299:bastore         
	//  177  300:dup             
	//  178  301:bipush          11
	//  179  303:ldc2            #326 <Int 32>
	//  180  306:bastore         
	//  181  307:putstatic       #332 <Field byte[] SUBRIP_TIMECODE_EMPTY>
	//  182  310:new             #334 <Class UUID>
	//  183  313:dup             
	//  184  314:ldc2w           #335 <Long 0x1000L>
	//  185  317:ldc2w           #337 <Long 0x389b71L>
	//  186  320:invokespecial   #342 <Method void UUID(long, long)>
	//  187  323:putstatic       #344 <Field UUID WAVE_SUBFORMAT_PCM>
	//* 188  326:return          
	}


/*
	static UUID access$300()
	{
		return WAVE_SUBFORMAT_PCM;
	//    0    0:getstatic       #344 <Field UUID WAVE_SUBFORMAT_PCM>
	//    1    3:areturn         
	}

*/
}
