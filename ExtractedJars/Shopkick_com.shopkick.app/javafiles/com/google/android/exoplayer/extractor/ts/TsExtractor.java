// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.*;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			PtsTimestampAdjuster, Id3Reader, ElementaryStreamReader, Ac3Reader, 
//			MpegAudioReader, H262Reader, DtsReader, H265Reader, 
//			SeiReader, H264Reader, AdtsReader

public final class TsExtractor
	implements Extractor
{
	private class PatReader extends TsPayloadReader
	{

		public void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore          4
			if(flag)
		//*   2    3:iload_2         
		//*   3    4:ifeq            79
			{
				parsablebytearray.skipBytes(parsablebytearray.readUnsignedByte());
		//    4    7:aload_1         
		//    5    8:aload_1         
		//    6    9:invokevirtual   #45  <Method int ParsableByteArray.readUnsignedByte()>
		//    7   12:invokevirtual   #49  <Method void ParsableByteArray.skipBytes(int)>
				parsablebytearray.readBytes(patScratch, 3);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #38  <Field ParsableBitArray patScratch>
		//   11   20:iconst_3        
		//   12   21:invokevirtual   #53  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
				patScratch.skipBits(12);
		//   13   24:aload_0         
		//   14   25:getfield        #38  <Field ParsableBitArray patScratch>
		//   15   28:bipush          12
		//   16   30:invokevirtual   #56  <Method void ParsableBitArray.skipBits(int)>
				sectionLength = patScratch.readBits(12);
		//   17   33:aload_0         
		//   18   34:aload_0         
		//   19   35:getfield        #38  <Field ParsableBitArray patScratch>
		//   20   38:bipush          12
		//   21   40:invokevirtual   #60  <Method int ParsableBitArray.readBits(int)>
		//   22   43:putfield        #62  <Field int sectionLength>
				sectionBytesRead = 0;
		//   23   46:aload_0         
		//   24   47:iconst_0        
		//   25   48:putfield        #64  <Field int sectionBytesRead>
				crc = Util.crc(patScratch.data, 0, 3, -1);
		//   26   51:aload_0         
		//   27   52:aload_0         
		//   28   53:getfield        #38  <Field ParsableBitArray patScratch>
		//   29   56:getfield        #68  <Field byte[] ParsableBitArray.data>
		//   30   59:iconst_0        
		//   31   60:iconst_3        
		//   32   61:iconst_m1       
		//   33   62:invokestatic    #73  <Method int Util.crc(byte[], int, int, int)>
		//   34   65:putfield        #75  <Field int crc>
				sectionData.reset(sectionLength);
		//   35   68:aload_0         
		//   36   69:getfield        #31  <Field ParsableByteArray sectionData>
		//   37   72:aload_0         
		//   38   73:getfield        #62  <Field int sectionLength>
		//   39   76:invokevirtual   #78  <Method void ParsableByteArray.reset(int)>
			}
			int j = Math.min(parsablebytearray.bytesLeft(), sectionLength - sectionBytesRead);
		//   40   79:aload_1         
		//   41   80:invokevirtual   #81  <Method int ParsableByteArray.bytesLeft()>
		//   42   83:aload_0         
		//   43   84:getfield        #62  <Field int sectionLength>
		//   44   87:aload_0         
		//   45   88:getfield        #64  <Field int sectionBytesRead>
		//   46   91:isub            
		//   47   92:invokestatic    #87  <Method int Math.min(int, int)>
		//   48   95:istore          5
			parsablebytearray.readBytes(sectionData.data, sectionBytesRead, j);
		//   49   97:aload_1         
		//   50   98:aload_0         
		//   51   99:getfield        #31  <Field ParsableByteArray sectionData>
		//   52  102:getfield        #88  <Field byte[] ParsableByteArray.data>
		//   53  105:aload_0         
		//   54  106:getfield        #64  <Field int sectionBytesRead>
		//   55  109:iload           5
		//   56  111:invokevirtual   #91  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			sectionBytesRead = sectionBytesRead + j;
		//   57  114:aload_0         
		//   58  115:aload_0         
		//   59  116:getfield        #64  <Field int sectionBytesRead>
		//   60  119:iload           5
		//   61  121:iadd            
		//   62  122:putfield        #64  <Field int sectionBytesRead>
			if(sectionBytesRead < sectionLength)
		//*  63  125:aload_0         
		//*  64  126:getfield        #64  <Field int sectionBytesRead>
		//*  65  129:aload_0         
		//*  66  130:getfield        #62  <Field int sectionLength>
		//*  67  133:icmpge          137
				return;
		//   68  136:return          
			if(Util.crc(sectionData.data, 0, sectionLength, crc) != 0)
		//*  69  137:aload_0         
		//*  70  138:getfield        #31  <Field ParsableByteArray sectionData>
		//*  71  141:getfield        #88  <Field byte[] ParsableByteArray.data>
		//*  72  144:iconst_0        
		//*  73  145:aload_0         
		//*  74  146:getfield        #62  <Field int sectionLength>
		//*  75  149:aload_0         
		//*  76  150:getfield        #75  <Field int crc>
		//*  77  153:invokestatic    #73  <Method int Util.crc(byte[], int, int, int)>
		//*  78  156:ifeq            160
				return;
		//   79  159:return          
			sectionData.skipBytes(5);
		//   80  160:aload_0         
		//   81  161:getfield        #31  <Field ParsableByteArray sectionData>
		//   82  164:iconst_5        
		//   83  165:invokevirtual   #49  <Method void ParsableByteArray.skipBytes(int)>
			for(int k = (sectionLength - 9) / 4; i < k; i++)
		//*  84  168:aload_0         
		//*  85  169:getfield        #62  <Field int sectionLength>
		//*  86  172:bipush          9
		//*  87  174:isub            
		//*  88  175:iconst_4        
		//*  89  176:idiv            
		//*  90  177:istore          5
		//*  91  179:iload           4
		//*  92  181:iload           5
		//*  93  183:icmpge          279
			{
				sectionData.readBytes(patScratch, 4);
		//   94  186:aload_0         
		//   95  187:getfield        #31  <Field ParsableByteArray sectionData>
		//   96  190:aload_0         
		//   97  191:getfield        #38  <Field ParsableBitArray patScratch>
		//   98  194:iconst_4        
		//   99  195:invokevirtual   #53  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
				int l = patScratch.readBits(16);
		//  100  198:aload_0         
		//  101  199:getfield        #38  <Field ParsableBitArray patScratch>
		//  102  202:bipush          16
		//  103  204:invokevirtual   #60  <Method int ParsableBitArray.readBits(int)>
		//  104  207:istore          6
				patScratch.skipBits(3);
		//  105  209:aload_0         
		//  106  210:getfield        #38  <Field ParsableBitArray patScratch>
		//  107  213:iconst_3        
		//  108  214:invokevirtual   #56  <Method void ParsableBitArray.skipBits(int)>
				if(l == 0)
		//* 109  217:iload           6
		//* 110  219:ifne            234
				{
					patScratch.skipBits(13);
		//  111  222:aload_0         
		//  112  223:getfield        #38  <Field ParsableBitArray patScratch>
		//  113  226:bipush          13
		//  114  228:invokevirtual   #56  <Method void ParsableBitArray.skipBits(int)>
				} else
		//* 115  231:goto            270
				{
					int i1 = patScratch.readBits(13);
		//  116  234:aload_0         
		//  117  235:getfield        #38  <Field ParsableBitArray patScratch>
		//  118  238:bipush          13
		//  119  240:invokevirtual   #60  <Method int ParsableBitArray.readBits(int)>
		//  120  243:istore          6
					tsPayloadReaders.put(i1, ((Object) (new PmtReader(i1))));
		//  121  245:aload_0         
		//  122  246:getfield        #21  <Field TsExtractor this$0>
		//  123  249:getfield        #95  <Field SparseArray TsExtractor.tsPayloadReaders>
		//  124  252:iload           6
		//  125  254:new             #97  <Class TsExtractor$PmtReader>
		//  126  257:dup             
		//  127  258:aload_0         
		//  128  259:getfield        #21  <Field TsExtractor this$0>
		//  129  262:iload           6
		//  130  264:invokespecial   #100 <Method void TsExtractor$PmtReader(TsExtractor, int)>
		//  131  267:invokevirtual   #106 <Method void SparseArray.put(int, Object)>
				}
			}

		//  132  270:iload           4
		//  133  272:iconst_1        
		//  134  273:iadd            
		//  135  274:istore          4
		//* 136  276:goto            179
		//  137  279:return          
		}

		public void seek()
		{
		//    0    0:return          
		}

		private int crc;
		private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);
		private int sectionBytesRead;
		private final ParsableByteArray sectionData = new ParsableByteArray();
		private int sectionLength;
		final TsExtractor this$0;

		public PatReader()
		{
			this$0 = TsExtractor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field TsExtractor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #24  <Method void TsExtractor$TsPayloadReader(TsExtractor$1)>
		//    6   10:aload_0         
		//    7   11:new             #26  <Class ParsableByteArray>
		//    8   14:dup             
		//    9   15:invokespecial   #29  <Method void ParsableByteArray()>
		//   10   18:putfield        #31  <Field ParsableByteArray sectionData>
		//   11   21:aload_0         
		//   12   22:new             #33  <Class ParsableBitArray>
		//   13   25:dup             
		//   14   26:iconst_4        
		//   15   27:newarray        byte[]
		//   16   29:invokespecial   #36  <Method void ParsableBitArray(byte[])>
		//   17   32:putfield        #38  <Field ParsableBitArray patScratch>
		//   18   35:return          
		}
	}

	private static final class PesReader extends TsPayloadReader
	{

		private boolean continueRead(ParsableByteArray parsablebytearray, byte abyte0[], int i)
		{
			int j = Math.min(parsablebytearray.bytesLeft(), i - bytesRead);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
		//    2    4:iload_3         
		//    3    5:aload_0         
		//    4    6:getfield        #67  <Field int bytesRead>
		//    5    9:isub            
		//    6   10:invokestatic    #73  <Method int Math.min(int, int)>
		//    7   13:istore          4
			if(j <= 0)
		//*   8   15:iload           4
		//*   9   17:ifgt            22
				return true;
		//   10   20:iconst_1        
		//   11   21:ireturn         
			if(abyte0 == null)
		//*  12   22:aload_2         
		//*  13   23:ifnonnull       35
				parsablebytearray.skipBytes(j);
		//   14   26:aload_1         
		//   15   27:iload           4
		//   16   29:invokevirtual   #77  <Method void ParsableByteArray.skipBytes(int)>
			else
		//*  17   32:goto            46
				parsablebytearray.readBytes(abyte0, bytesRead, j);
		//   18   35:aload_1         
		//   19   36:aload_2         
		//   20   37:aload_0         
		//   21   38:getfield        #67  <Field int bytesRead>
		//   22   41:iload           4
		//   23   43:invokevirtual   #81  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			bytesRead = bytesRead + j;
		//   24   46:aload_0         
		//   25   47:aload_0         
		//   26   48:getfield        #67  <Field int bytesRead>
		//   27   51:iload           4
		//   28   53:iadd            
		//   29   54:putfield        #67  <Field int bytesRead>
			return bytesRead == i;
		//   30   57:aload_0         
		//   31   58:getfield        #67  <Field int bytesRead>
		//   32   61:iload_3         
		//   33   62:icmpne          67
		//   34   65:iconst_1        
		//   35   66:ireturn         
		//   36   67:iconst_0        
		//   37   68:ireturn         
		}

		private boolean parseHeader()
		{
			pesScratch.setPosition(0);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field ParsableBitArray pesScratch>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #86  <Method void ParsableBitArray.setPosition(int)>
			int i = pesScratch.readBits(24);
		//    4    8:aload_0         
		//    5    9:getfield        #54  <Field ParsableBitArray pesScratch>
		//    6   12:bipush          24
		//    7   14:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//    8   17:istore_1        
			if(i != 1)
		//*   9   18:iload_1         
		//*  10   19:iconst_1        
		//*  11   20:icmpeq          61
			{
				StringBuilder stringbuilder = new StringBuilder();
		//   12   23:new             #92  <Class StringBuilder>
		//   13   26:dup             
		//   14   27:invokespecial   #95  <Method void StringBuilder()>
		//   15   30:astore_2        
				stringbuilder.append("Unexpected start code prefix: ");
		//   16   31:aload_2         
		//   17   32:ldc1            #97  <String "Unexpected start code prefix: ">
		//   18   34:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   19   37:pop             
				stringbuilder.append(i);
		//   20   38:aload_2         
		//   21   39:iload_1         
		//   22   40:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
		//   23   43:pop             
				Log.w("TsExtractor", stringbuilder.toString());
		//   24   44:ldc1            #106 <String "TsExtractor">
		//   25   46:aload_2         
		//   26   47:invokevirtual   #110 <Method String StringBuilder.toString()>
		//   27   50:invokestatic    #116 <Method int Log.w(String, String)>
		//   28   53:pop             
				payloadSize = -1;
		//   29   54:aload_0         
		//   30   55:iconst_m1       
		//   31   56:putfield        #118 <Field int payloadSize>
				return false;
		//   32   59:iconst_0        
		//   33   60:ireturn         
			}
			pesScratch.skipBits(8);
		//   34   61:aload_0         
		//   35   62:getfield        #54  <Field ParsableBitArray pesScratch>
		//   36   65:bipush          8
		//   37   67:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			i = pesScratch.readBits(16);
		//   38   70:aload_0         
		//   39   71:getfield        #54  <Field ParsableBitArray pesScratch>
		//   40   74:bipush          16
		//   41   76:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   42   79:istore_1        
			pesScratch.skipBits(5);
		//   43   80:aload_0         
		//   44   81:getfield        #54  <Field ParsableBitArray pesScratch>
		//   45   84:iconst_5        
		//   46   85:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			dataAlignmentIndicator = pesScratch.readBit();
		//   47   88:aload_0         
		//   48   89:aload_0         
		//   49   90:getfield        #54  <Field ParsableBitArray pesScratch>
		//   50   93:invokevirtual   #124 <Method boolean ParsableBitArray.readBit()>
		//   51   96:putfield        #126 <Field boolean dataAlignmentIndicator>
			pesScratch.skipBits(2);
		//   52   99:aload_0         
		//   53  100:getfield        #54  <Field ParsableBitArray pesScratch>
		//   54  103:iconst_2        
		//   55  104:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			ptsFlag = pesScratch.readBit();
		//   56  107:aload_0         
		//   57  108:aload_0         
		//   58  109:getfield        #54  <Field ParsableBitArray pesScratch>
		//   59  112:invokevirtual   #124 <Method boolean ParsableBitArray.readBit()>
		//   60  115:putfield        #128 <Field boolean ptsFlag>
			dtsFlag = pesScratch.readBit();
		//   61  118:aload_0         
		//   62  119:aload_0         
		//   63  120:getfield        #54  <Field ParsableBitArray pesScratch>
		//   64  123:invokevirtual   #124 <Method boolean ParsableBitArray.readBit()>
		//   65  126:putfield        #130 <Field boolean dtsFlag>
			pesScratch.skipBits(6);
		//   66  129:aload_0         
		//   67  130:getfield        #54  <Field ParsableBitArray pesScratch>
		//   68  133:bipush          6
		//   69  135:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
			extendedHeaderLength = pesScratch.readBits(8);
		//   70  138:aload_0         
		//   71  139:aload_0         
		//   72  140:getfield        #54  <Field ParsableBitArray pesScratch>
		//   73  143:bipush          8
		//   74  145:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   75  148:putfield        #132 <Field int extendedHeaderLength>
			if(i == 0)
		//*  76  151:iload_1         
		//*  77  152:ifne            162
			{
				payloadSize = -1;
		//   78  155:aload_0         
		//   79  156:iconst_m1       
		//   80  157:putfield        #118 <Field int payloadSize>
				return true;
		//   81  160:iconst_1        
		//   82  161:ireturn         
			} else
			{
				payloadSize = (i + 6) - 9 - extendedHeaderLength;
		//   83  162:aload_0         
		//   84  163:iload_1         
		//   85  164:bipush          6
		//   86  166:iadd            
		//   87  167:bipush          9
		//   88  169:isub            
		//   89  170:aload_0         
		//   90  171:getfield        #132 <Field int extendedHeaderLength>
		//   91  174:isub            
		//   92  175:putfield        #118 <Field int payloadSize>
				return true;
		//   93  178:iconst_1        
		//   94  179:ireturn         
			}
		}

		private void parseHeaderExtension()
		{
			pesScratch.setPosition(0);
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field ParsableBitArray pesScratch>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #86  <Method void ParsableBitArray.setPosition(int)>
			timeUs = -1L;
		//    4    8:aload_0         
		//    5    9:ldc2w           #134 <Long -1L>
		//    6   12:putfield        #137 <Field long timeUs>
			if(ptsFlag)
		//*   7   15:aload_0         
		//*   8   16:getfield        #128 <Field boolean ptsFlag>
		//*   9   19:ifeq            218
			{
				pesScratch.skipBits(4);
		//   10   22:aload_0         
		//   11   23:getfield        #54  <Field ParsableBitArray pesScratch>
		//   12   26:iconst_4        
		//   13   27:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				long l = pesScratch.readBits(3);
		//   14   30:aload_0         
		//   15   31:getfield        #54  <Field ParsableBitArray pesScratch>
		//   16   34:iconst_3        
		//   17   35:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   18   38:i2l             
		//   19   39:lstore_1        
				pesScratch.skipBits(1);
		//   20   40:aload_0         
		//   21   41:getfield        #54  <Field ParsableBitArray pesScratch>
		//   22   44:iconst_1        
		//   23   45:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				long l1 = pesScratch.readBits(15) << 15;
		//   24   48:aload_0         
		//   25   49:getfield        #54  <Field ParsableBitArray pesScratch>
		//   26   52:bipush          15
		//   27   54:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   28   57:bipush          15
		//   29   59:ishl            
		//   30   60:i2l             
		//   31   61:lstore_3        
				pesScratch.skipBits(1);
		//   32   62:aload_0         
		//   33   63:getfield        #54  <Field ParsableBitArray pesScratch>
		//   34   66:iconst_1        
		//   35   67:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				long l2 = pesScratch.readBits(15);
		//   36   70:aload_0         
		//   37   71:getfield        #54  <Field ParsableBitArray pesScratch>
		//   38   74:bipush          15
		//   39   76:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   40   79:i2l             
		//   41   80:lstore          5
				pesScratch.skipBits(1);
		//   42   82:aload_0         
		//   43   83:getfield        #54  <Field ParsableBitArray pesScratch>
		//   44   86:iconst_1        
		//   45   87:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
				if(!seenFirstDts && dtsFlag)
		//*  46   90:aload_0         
		//*  47   91:getfield        #139 <Field boolean seenFirstDts>
		//*  48   94:ifne            198
		//*  49   97:aload_0         
		//*  50   98:getfield        #130 <Field boolean dtsFlag>
		//*  51  101:ifeq            198
				{
					pesScratch.skipBits(4);
		//   52  104:aload_0         
		//   53  105:getfield        #54  <Field ParsableBitArray pesScratch>
		//   54  108:iconst_4        
		//   55  109:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
					long l3 = pesScratch.readBits(3);
		//   56  112:aload_0         
		//   57  113:getfield        #54  <Field ParsableBitArray pesScratch>
		//   58  116:iconst_3        
		//   59  117:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   60  120:i2l             
		//   61  121:lstore          7
					pesScratch.skipBits(1);
		//   62  123:aload_0         
		//   63  124:getfield        #54  <Field ParsableBitArray pesScratch>
		//   64  127:iconst_1        
		//   65  128:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
					long l4 = pesScratch.readBits(15) << 15;
		//   66  131:aload_0         
		//   67  132:getfield        #54  <Field ParsableBitArray pesScratch>
		//   68  135:bipush          15
		//   69  137:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   70  140:bipush          15
		//   71  142:ishl            
		//   72  143:i2l             
		//   73  144:lstore          9
					pesScratch.skipBits(1);
		//   74  146:aload_0         
		//   75  147:getfield        #54  <Field ParsableBitArray pesScratch>
		//   76  150:iconst_1        
		//   77  151:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
					long l5 = pesScratch.readBits(15);
		//   78  154:aload_0         
		//   79  155:getfield        #54  <Field ParsableBitArray pesScratch>
		//   80  158:bipush          15
		//   81  160:invokevirtual   #90  <Method int ParsableBitArray.readBits(int)>
		//   82  163:i2l             
		//   83  164:lstore          11
					pesScratch.skipBits(1);
		//   84  166:aload_0         
		//   85  167:getfield        #54  <Field ParsableBitArray pesScratch>
		//   86  170:iconst_1        
		//   87  171:invokevirtual   #121 <Method void ParsableBitArray.skipBits(int)>
					ptsTimestampAdjuster.adjustTimestamp(l3 << 30 | l4 | l5);
		//   88  174:aload_0         
		//   89  175:getfield        #47  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
		//   90  178:lload           7
		//   91  180:bipush          30
		//   92  182:lshl            
		//   93  183:lload           9
		//   94  185:lor             
		//   95  186:lload           11
		//   96  188:lor             
		//   97  189:invokevirtual   #145 <Method long PtsTimestampAdjuster.adjustTimestamp(long)>
		//   98  192:pop2            
					seenFirstDts = true;
		//   99  193:aload_0         
		//  100  194:iconst_1        
		//  101  195:putfield        #139 <Field boolean seenFirstDts>
				}
				timeUs = ptsTimestampAdjuster.adjustTimestamp(l << 30 | l1 | l2);
		//  102  198:aload_0         
		//  103  199:aload_0         
		//  104  200:getfield        #47  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
		//  105  203:lload_1         
		//  106  204:bipush          30
		//  107  206:lshl            
		//  108  207:lload_3         
		//  109  208:lor             
		//  110  209:lload           5
		//  111  211:lor             
		//  112  212:invokevirtual   #145 <Method long PtsTimestampAdjuster.adjustTimestamp(long)>
		//  113  215:putfield        #137 <Field long timeUs>
			}
		//  114  218:return          
		}

		private void setState(int i)
		{
			state = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #56  <Field int state>
			bytesRead = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #67  <Field int bytesRead>
		//    6   10:return          
		}

		public void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
		{
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            115
			{
				switch(state)
		//*   2    4:aload_0         
		//*   3    5:getfield        #56  <Field int state>
				{
		//*   4    8:tableswitch     0 3: default 40
		//		               0 110
		//		               1 110
		//		               2 102
		//		               3 43
		//*   5   40:goto            110
				case 3: // '\003'
					if(payloadSize != -1)
		//*   6   43:aload_0         
		//*   7   44:getfield        #118 <Field int payloadSize>
		//*   8   47:iconst_m1       
		//*   9   48:icmpeq          92
					{
						extractoroutput = ((ExtractorOutput) (new StringBuilder()));
		//   10   51:new             #92  <Class StringBuilder>
		//   11   54:dup             
		//   12   55:invokespecial   #95  <Method void StringBuilder()>
		//   13   58:astore_3        
						((StringBuilder) (extractoroutput)).append("Unexpected start indicator: expected ");
		//   14   59:aload_3         
		//   15   60:ldc1            #150 <String "Unexpected start indicator: expected ">
		//   16   62:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   17   65:pop             
						((StringBuilder) (extractoroutput)).append(payloadSize);
		//   18   66:aload_3         
		//   19   67:aload_0         
		//   20   68:getfield        #118 <Field int payloadSize>
		//   21   71:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
		//   22   74:pop             
						((StringBuilder) (extractoroutput)).append(" more bytes");
		//   23   75:aload_3         
		//   24   76:ldc1            #152 <String " more bytes">
		//   25   78:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
		//   26   81:pop             
						Log.w("TsExtractor", ((StringBuilder) (extractoroutput)).toString());
		//   27   82:ldc1            #106 <String "TsExtractor">
		//   28   84:aload_3         
		//   29   85:invokevirtual   #110 <Method String StringBuilder.toString()>
		//   30   88:invokestatic    #116 <Method int Log.w(String, String)>
		//   31   91:pop             
					}
					pesPayloadReader.packetFinished();
		//   32   92:aload_0         
		//   33   93:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
		//   34   96:invokevirtual   #157 <Method void ElementaryStreamReader.packetFinished()>
					break;

		//*  35   99:goto            110
				case 2: // '\002'
					Log.w("TsExtractor", "Unexpected start indicator reading extended header");
		//   36  102:ldc1            #106 <String "TsExtractor">
		//   37  104:ldc1            #159 <String "Unexpected start indicator reading extended header">
		//   38  106:invokestatic    #116 <Method int Log.w(String, String)>
		//   39  109:pop             
					break;
				}
				setState(1);
		//   40  110:aload_0         
		//   41  111:iconst_1        
		//   42  112:invokespecial   #161 <Method void setState(int)>
			}
			do
			{
				if(parsablebytearray.bytesLeft() <= 0)
					break;
		//   43  115:aload_1         
		//   44  116:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
		//   45  119:ifle            392
				int k = state;
		//   46  122:aload_0         
		//   47  123:getfield        #56  <Field int state>
		//   48  126:istore          6
				int i = 0;
		//   49  128:iconst_0        
		//   50  129:istore          4
				int j = 0;
		//   51  131:iconst_0        
		//   52  132:istore          5
				switch(k)
		//*  53  134:iload           6
				{
		//*  54  136:tableswitch     0 3: default 168
		//		               0 381
		//		               1 345
		//		               2 277
		//		               3 171
		//*  55  168:goto            115
				case 3: // '\003'
					int l = parsablebytearray.bytesLeft();
		//   56  171:aload_1         
		//   57  172:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
		//   58  175:istore          6
					i = payloadSize;
		//   59  177:aload_0         
		//   60  178:getfield        #118 <Field int payloadSize>
		//   61  181:istore          4
					if(i != -1)
		//*  62  183:iload           4
		//*  63  185:iconst_m1       
		//*  64  186:icmpne          192
		//*  65  189:goto            199
						j = l - i;
		//   66  192:iload           6
		//   67  194:iload           4
		//   68  196:isub            
		//   69  197:istore          5
					i = l;
		//   70  199:iload           6
		//   71  201:istore          4
					if(j > 0)
		//*  72  203:iload           5
		//*  73  205:ifle            226
					{
						i = l - j;
		//   74  208:iload           6
		//   75  210:iload           5
		//   76  212:isub            
		//   77  213:istore          4
						parsablebytearray.setLimit(parsablebytearray.getPosition() + i);
		//   78  215:aload_1         
		//   79  216:aload_1         
		//   80  217:invokevirtual   #164 <Method int ParsableByteArray.getPosition()>
		//   81  220:iload           4
		//   82  222:iadd            
		//   83  223:invokevirtual   #167 <Method void ParsableByteArray.setLimit(int)>
					}
					pesPayloadReader.consume(parsablebytearray);
		//   84  226:aload_0         
		//   85  227:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
		//   86  230:aload_1         
		//   87  231:invokevirtual   #170 <Method void ElementaryStreamReader.consume(ParsableByteArray)>
					j = payloadSize;
		//   88  234:aload_0         
		//   89  235:getfield        #118 <Field int payloadSize>
		//   90  238:istore          5
					if(j != -1)
		//*  91  240:iload           5
		//*  92  242:iconst_m1       
		//*  93  243:icmpeq          115
					{
						payloadSize = j - i;
		//   94  246:aload_0         
		//   95  247:iload           5
		//   96  249:iload           4
		//   97  251:isub            
		//   98  252:putfield        #118 <Field int payloadSize>
						if(payloadSize == 0)
		//*  99  255:aload_0         
		//* 100  256:getfield        #118 <Field int payloadSize>
		//* 101  259:ifne            115
						{
							pesPayloadReader.packetFinished();
		//  102  262:aload_0         
		//  103  263:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
		//  104  266:invokevirtual   #157 <Method void ElementaryStreamReader.packetFinished()>
							setState(1);
		//  105  269:aload_0         
		//  106  270:iconst_1        
		//  107  271:invokespecial   #161 <Method void setState(int)>
						}
					}
					break;

		//* 108  274:goto            115
				case 2: // '\002'
					i = Math.min(10, extendedHeaderLength);
		//  109  277:bipush          10
		//  110  279:aload_0         
		//  111  280:getfield        #132 <Field int extendedHeaderLength>
		//  112  283:invokestatic    #73  <Method int Math.min(int, int)>
		//  113  286:istore          4
					if(continueRead(parsablebytearray, pesScratch.data, i) && continueRead(parsablebytearray, ((byte []) (null)), extendedHeaderLength))
		//* 114  288:aload_0         
		//* 115  289:aload_1         
		//* 116  290:aload_0         
		//* 117  291:getfield        #54  <Field ParsableBitArray pesScratch>
		//* 118  294:getfield        #174 <Field byte[] ParsableBitArray.data>
		//* 119  297:iload           4
		//* 120  299:invokespecial   #176 <Method boolean continueRead(ParsableByteArray, byte[], int)>
		//* 121  302:ifeq            115
		//* 122  305:aload_0         
		//* 123  306:aload_1         
		//* 124  307:aconst_null     
		//* 125  308:aload_0         
		//* 126  309:getfield        #132 <Field int extendedHeaderLength>
		//* 127  312:invokespecial   #176 <Method boolean continueRead(ParsableByteArray, byte[], int)>
		//* 128  315:ifeq            115
					{
						parseHeaderExtension();
		//  129  318:aload_0         
		//  130  319:invokespecial   #178 <Method void parseHeaderExtension()>
						pesPayloadReader.packetStarted(timeUs, dataAlignmentIndicator);
		//  131  322:aload_0         
		//  132  323:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
		//  133  326:aload_0         
		//  134  327:getfield        #137 <Field long timeUs>
		//  135  330:aload_0         
		//  136  331:getfield        #126 <Field boolean dataAlignmentIndicator>
		//  137  334:invokevirtual   #182 <Method void ElementaryStreamReader.packetStarted(long, boolean)>
						setState(3);
		//  138  337:aload_0         
		//  139  338:iconst_3        
		//  140  339:invokespecial   #161 <Method void setState(int)>
					}
					break;

		//* 141  342:goto            115
				case 1: // '\001'
					if(continueRead(parsablebytearray, pesScratch.data, 9))
		//* 142  345:aload_0         
		//* 143  346:aload_1         
		//* 144  347:aload_0         
		//* 145  348:getfield        #54  <Field ParsableBitArray pesScratch>
		//* 146  351:getfield        #174 <Field byte[] ParsableBitArray.data>
		//* 147  354:bipush          9
		//* 148  356:invokespecial   #176 <Method boolean continueRead(ParsableByteArray, byte[], int)>
		//* 149  359:ifeq            115
					{
						if(parseHeader())
		//* 150  362:aload_0         
		//* 151  363:invokespecial   #184 <Method boolean parseHeader()>
		//* 152  366:ifeq            372
							i = 2;
		//  153  369:iconst_2        
		//  154  370:istore          4
						setState(i);
		//  155  372:aload_0         
		//  156  373:iload           4
		//  157  375:invokespecial   #161 <Method void setState(int)>
					}
					break;

		//* 158  378:goto            115
				case 0: // '\0'
					parsablebytearray.skipBytes(parsablebytearray.bytesLeft());
		//  159  381:aload_1         
		//  160  382:aload_1         
		//  161  383:invokevirtual   #65  <Method int ParsableByteArray.bytesLeft()>
		//  162  386:invokevirtual   #77  <Method void ParsableByteArray.skipBytes(int)>
					break;
				}
			} while(true);
		//  163  389:goto            115
		//  164  392:return          
		}

		public void seek()
		{
			state = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #56  <Field int state>
			bytesRead = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #67  <Field int bytesRead>
			seenFirstDts = false;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #139 <Field boolean seenFirstDts>
			pesPayloadReader.seek();
		//    9   15:aload_0         
		//   10   16:getfield        #45  <Field ElementaryStreamReader pesPayloadReader>
		//   11   19:invokevirtual   #187 <Method void ElementaryStreamReader.seek()>
		//   12   22:return          
		}

		private static final int HEADER_SIZE = 9;
		private static final int MAX_HEADER_EXTENSION_SIZE = 10;
		private static final int PES_SCRATCH_SIZE = 10;
		private static final int STATE_FINDING_HEADER = 0;
		private static final int STATE_READING_BODY = 3;
		private static final int STATE_READING_HEADER = 1;
		private static final int STATE_READING_HEADER_EXTENSION = 2;
		private int bytesRead;
		private boolean dataAlignmentIndicator;
		private boolean dtsFlag;
		private int extendedHeaderLength;
		private int payloadSize;
		private final ElementaryStreamReader pesPayloadReader;
		private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
		private boolean ptsFlag;
		private final PtsTimestampAdjuster ptsTimestampAdjuster;
		private boolean seenFirstDts;
		private int state;
		private long timeUs;

		public PesReader(ElementaryStreamReader elementarystreamreader, PtsTimestampAdjuster ptstimestampadjuster)
		{
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #43  <Method void TsExtractor$TsPayloadReader(TsExtractor$1)>
			pesPayloadReader = elementarystreamreader;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #45  <Field ElementaryStreamReader pesPayloadReader>
			ptsTimestampAdjuster = ptstimestampadjuster;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #47  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
		//    9   15:aload_0         
		//   10   16:new             #49  <Class ParsableBitArray>
		//   11   19:dup             
		//   12   20:bipush          10
		//   13   22:newarray        byte[]
		//   14   24:invokespecial   #52  <Method void ParsableBitArray(byte[])>
		//   15   27:putfield        #54  <Field ParsableBitArray pesScratch>
			state = 0;
		//   16   30:aload_0         
		//   17   31:iconst_0        
		//   18   32:putfield        #56  <Field int state>
		//   19   35:return          
		}
	}

	private class PmtReader extends TsPayloadReader
	{

		private int readPrivateDataStreamType(ParsableByteArray parsablebytearray, int i)
		{
			int k = parsablebytearray.getPosition() + i;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #48  <Method int ParsableByteArray.getPosition()>
		//    2    4:iload_2         
		//    3    5:iadd            
		//    4    6:istore          4
			int j = -1;
		//    5    8:iconst_m1       
		//    6    9:istore_3        
			do
			{
				i = j;
		//    7   10:iload_3         
		//    8   11:istore_2        
				if(parsablebytearray.getPosition() >= k)
					break;
		//    9   12:aload_1         
		//   10   13:invokevirtual   #48  <Method int ParsableByteArray.getPosition()>
		//   11   16:iload           4
		//   12   18:icmpge          146
				int i1 = parsablebytearray.readUnsignedByte();
		//   13   21:aload_1         
		//   14   22:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedByte()>
		//   15   25:istore          6
				int l = parsablebytearray.readUnsignedByte();
		//   16   27:aload_1         
		//   17   28:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedByte()>
		//   18   31:istore          5
				if(i1 == 5)
		//*  19   33:iload           6
		//*  20   35:iconst_5        
		//*  21   36:icmpne          94
				{
					long l1 = parsablebytearray.readUnsignedInt();
		//   22   39:aload_1         
		//   23   40:invokevirtual   #55  <Method long ParsableByteArray.readUnsignedInt()>
		//   24   43:lstore          7
					if(l1 == TsExtractor.AC3_FORMAT_IDENTIFIER)
		//*  25   45:lload           7
		//*  26   47:invokestatic    #58  <Method long TsExtractor.access$500()>
		//*  27   50:lcmp            
		//*  28   51:ifne            61
						i = 129;
		//   29   54:sipush          129
		//   30   57:istore_2        
					else
		//*  31   58:goto            146
					if(l1 == TsExtractor.E_AC3_FORMAT_IDENTIFIER)
		//*  32   61:lload           7
		//*  33   63:invokestatic    #61  <Method long TsExtractor.access$600()>
		//*  34   66:lcmp            
		//*  35   67:ifne            77
					{
						i = 135;
		//   36   70:sipush          135
		//   37   73:istore_2        
					} else
		//*  38   74:goto            146
					{
						i = j;
		//   39   77:iload_3         
		//   40   78:istore_2        
						if(l1 == TsExtractor.HEVC_FORMAT_IDENTIFIER)
		//*  41   79:lload           7
		//*  42   81:invokestatic    #64  <Method long TsExtractor.access$700()>
		//*  43   84:lcmp            
		//*  44   85:ifne            146
							i = 36;
		//   45   88:bipush          36
		//   46   90:istore_2        
					}
					break;
		//   47   91:goto            146
				}
				if(i1 == 106)
		//*  48   94:iload           6
		//*  49   96:bipush          106
		//*  50   98:icmpne          108
					i = 129;
		//   51  101:sipush          129
		//   52  104:istore_2        
				else
		//*  53  105:goto            135
				if(i1 == 122)
		//*  54  108:iload           6
		//*  55  110:bipush          122
		//*  56  112:icmpne          122
				{
					i = 135;
		//   57  115:sipush          135
		//   58  118:istore_2        
				} else
		//*  59  119:goto            135
				{
					i = j;
		//   60  122:iload_3         
		//   61  123:istore_2        
					if(i1 == 123)
		//*  62  124:iload           6
		//*  63  126:bipush          123
		//*  64  128:icmpne          135
						i = 138;
		//   65  131:sipush          138
		//   66  134:istore_2        
				}
				parsablebytearray.skipBytes(l);
		//   67  135:aload_1         
		//   68  136:iload           5
		//   69  138:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
				j = i;
		//   70  141:iload_2         
		//   71  142:istore_3        
			} while(true);
		//   72  143:goto            10
			parsablebytearray.setPosition(k);
		//   73  146:aload_1         
		//   74  147:iload           4
		//   75  149:invokevirtual   #71  <Method void ParsableByteArray.setPosition(int)>
			return i;
		//   76  152:iload_2         
		//   77  153:ireturn         
		}

		public void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput)
		{
			int k;
			if(flag)
		//*   0    0:iload_2         
		//*   1    1:ifeq            76
			{
				parsablebytearray.skipBytes(parsablebytearray.readUnsignedByte());
		//    2    4:aload_1         
		//    3    5:aload_1         
		//    4    6:invokevirtual   #51  <Method int ParsableByteArray.readUnsignedByte()>
		//    5    9:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
				parsablebytearray.readBytes(pmtScratch, 3);
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #32  <Field ParsableBitArray pmtScratch>
		//    9   17:iconst_3        
		//   10   18:invokevirtual   #77  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
				pmtScratch.skipBits(12);
		//   11   21:aload_0         
		//   12   22:getfield        #32  <Field ParsableBitArray pmtScratch>
		//   13   25:bipush          12
		//   14   27:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
				sectionLength = pmtScratch.readBits(12);
		//   15   30:aload_0         
		//   16   31:aload_0         
		//   17   32:getfield        #32  <Field ParsableBitArray pmtScratch>
		//   18   35:bipush          12
		//   19   37:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
		//   20   40:putfield        #86  <Field int sectionLength>
				sectionBytesRead = 0;
		//   21   43:aload_0         
		//   22   44:iconst_0        
		//   23   45:putfield        #88  <Field int sectionBytesRead>
				crc = Util.crc(pmtScratch.data, 0, 3, -1);
		//   24   48:aload_0         
		//   25   49:aload_0         
		//   26   50:getfield        #32  <Field ParsableBitArray pmtScratch>
		//   27   53:getfield        #92  <Field byte[] ParsableBitArray.data>
		//   28   56:iconst_0        
		//   29   57:iconst_3        
		//   30   58:iconst_m1       
		//   31   59:invokestatic    #97  <Method int Util.crc(byte[], int, int, int)>
		//   32   62:putfield        #99  <Field int crc>
				sectionData.reset(sectionLength);
		//   33   65:aload_0         
		//   34   66:getfield        #39  <Field ParsableByteArray sectionData>
		//   35   69:aload_0         
		//   36   70:getfield        #86  <Field int sectionLength>
		//   37   73:invokevirtual   #102 <Method void ParsableByteArray.reset(int)>
			}
			int i = Math.min(parsablebytearray.bytesLeft(), sectionLength - sectionBytesRead);
		//   38   76:aload_1         
		//   39   77:invokevirtual   #105 <Method int ParsableByteArray.bytesLeft()>
		//   40   80:aload_0         
		//   41   81:getfield        #86  <Field int sectionLength>
		//   42   84:aload_0         
		//   43   85:getfield        #88  <Field int sectionBytesRead>
		//   44   88:isub            
		//   45   89:invokestatic    #111 <Method int Math.min(int, int)>
		//   46   92:istore          4
			parsablebytearray.readBytes(sectionData.data, sectionBytesRead, i);
		//   47   94:aload_1         
		//   48   95:aload_0         
		//   49   96:getfield        #39  <Field ParsableByteArray sectionData>
		//   50   99:getfield        #112 <Field byte[] ParsableByteArray.data>
		//   51  102:aload_0         
		//   52  103:getfield        #88  <Field int sectionBytesRead>
		//   53  106:iload           4
		//   54  108:invokevirtual   #115 <Method void ParsableByteArray.readBytes(byte[], int, int)>
			sectionBytesRead = sectionBytesRead + i;
		//   55  111:aload_0         
		//   56  112:aload_0         
		//   57  113:getfield        #88  <Field int sectionBytesRead>
		//   58  116:iload           4
		//   59  118:iadd            
		//   60  119:putfield        #88  <Field int sectionBytesRead>
			if(sectionBytesRead < sectionLength)
		//*  61  122:aload_0         
		//*  62  123:getfield        #88  <Field int sectionBytesRead>
		//*  63  126:aload_0         
		//*  64  127:getfield        #86  <Field int sectionLength>
		//*  65  130:icmpge          134
				return;
		//   66  133:return          
			if(Util.crc(sectionData.data, 0, sectionLength, crc) != 0)
		//*  67  134:aload_0         
		//*  68  135:getfield        #39  <Field ParsableByteArray sectionData>
		//*  69  138:getfield        #112 <Field byte[] ParsableByteArray.data>
		//*  70  141:iconst_0        
		//*  71  142:aload_0         
		//*  72  143:getfield        #86  <Field int sectionLength>
		//*  73  146:aload_0         
		//*  74  147:getfield        #99  <Field int crc>
		//*  75  150:invokestatic    #97  <Method int Util.crc(byte[], int, int, int)>
		//*  76  153:ifeq            157
				return;
		//   77  156:return          
			sectionData.skipBytes(7);
		//   78  157:aload_0         
		//   79  158:getfield        #39  <Field ParsableByteArray sectionData>
		//   80  161:bipush          7
		//   81  163:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
			sectionData.readBytes(pmtScratch, 2);
		//   82  166:aload_0         
		//   83  167:getfield        #39  <Field ParsableByteArray sectionData>
		//   84  170:aload_0         
		//   85  171:getfield        #32  <Field ParsableBitArray pmtScratch>
		//   86  174:iconst_2        
		//   87  175:invokevirtual   #77  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			pmtScratch.skipBits(4);
		//   88  178:aload_0         
		//   89  179:getfield        #32  <Field ParsableBitArray pmtScratch>
		//   90  182:iconst_4        
		//   91  183:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
			i = pmtScratch.readBits(12);
		//   92  186:aload_0         
		//   93  187:getfield        #32  <Field ParsableBitArray pmtScratch>
		//   94  190:bipush          12
		//   95  192:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
		//   96  195:istore          4
			sectionData.skipBytes(i);
		//   97  197:aload_0         
		//   98  198:getfield        #39  <Field ParsableByteArray sectionData>
		//   99  201:iload           4
		//  100  203:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
			if((workaroundFlags & 0x10) != 0 && id3Reader == null)
		//* 101  206:aload_0         
		//* 102  207:getfield        #22  <Field TsExtractor this$0>
		//* 103  210:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 104  213:bipush          16
		//* 105  215:iand            
		//* 106  216:ifeq            251
		//* 107  219:aload_0         
		//* 108  220:getfield        #22  <Field TsExtractor this$0>
		//* 109  223:getfield        #123 <Field Id3Reader TsExtractor.id3Reader>
		//* 110  226:ifnonnull       251
				id3Reader = new Id3Reader(extractoroutput.track(21));
		//  111  229:aload_0         
		//  112  230:getfield        #22  <Field TsExtractor this$0>
		//  113  233:new             #125 <Class Id3Reader>
		//  114  236:dup             
		//  115  237:aload_3         
		//  116  238:bipush          21
		//  117  240:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  118  245:invokespecial   #134 <Method void Id3Reader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  119  248:putfield        #123 <Field Id3Reader TsExtractor.id3Reader>
			k = sectionLength - 9 - i - 4;
		//  120  251:aload_0         
		//  121  252:getfield        #86  <Field int sectionLength>
		//  122  255:bipush          9
		//  123  257:isub            
		//  124  258:iload           4
		//  125  260:isub            
		//  126  261:iconst_4        
		//  127  262:isub            
		//  128  263:istore          5
_L19:
			if(k <= 0) goto _L2; else goto _L1
		//  129  265:iload           5
		//  130  267:ifle            911
_L1:
			int j;
			int l;
			int i1;
			sectionData.readBytes(pmtScratch, 5);
		//  131  270:aload_0         
		//  132  271:getfield        #39  <Field ParsableByteArray sectionData>
		//  133  274:aload_0         
		//  134  275:getfield        #32  <Field ParsableBitArray pmtScratch>
		//  135  278:iconst_5        
		//  136  279:invokevirtual   #77  <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			j = pmtScratch.readBits(8);
		//  137  282:aload_0         
		//  138  283:getfield        #32  <Field ParsableBitArray pmtScratch>
		//  139  286:bipush          8
		//  140  288:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
		//  141  291:istore          4
			pmtScratch.skipBits(3);
		//  142  293:aload_0         
		//  143  294:getfield        #32  <Field ParsableBitArray pmtScratch>
		//  144  297:iconst_3        
		//  145  298:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
			l = pmtScratch.readBits(13);
		//  146  301:aload_0         
		//  147  302:getfield        #32  <Field ParsableBitArray pmtScratch>
		//  148  305:bipush          13
		//  149  307:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
		//  150  310:istore          6
			pmtScratch.skipBits(4);
		//  151  312:aload_0         
		//  152  313:getfield        #32  <Field ParsableBitArray pmtScratch>
		//  153  316:iconst_4        
		//  154  317:invokevirtual   #80  <Method void ParsableBitArray.skipBits(int)>
			i1 = pmtScratch.readBits(12);
		//  155  320:aload_0         
		//  156  321:getfield        #32  <Field ParsableBitArray pmtScratch>
		//  157  324:bipush          12
		//  158  326:invokevirtual   #84  <Method int ParsableBitArray.readBits(int)>
		//  159  329:istore          7
			if(j == 6)
		//* 160  331:iload           4
		//* 161  333:bipush          6
		//* 162  335:icmpne          353
				j = readPrivateDataStreamType(sectionData, i1);
		//  163  338:aload_0         
		//  164  339:aload_0         
		//  165  340:getfield        #39  <Field ParsableByteArray sectionData>
		//  166  343:iload           7
		//  167  345:invokespecial   #136 <Method int readPrivateDataStreamType(ParsableByteArray, int)>
		//  168  348:istore          4
			else
		//* 169  350:goto            362
				sectionData.skipBytes(i1);
		//  170  353:aload_0         
		//  171  354:getfield        #39  <Field ParsableByteArray sectionData>
		//  172  357:iload           7
		//  173  359:invokevirtual   #68  <Method void ParsableByteArray.skipBytes(int)>
			i1 = k - (i1 + 5);
		//  174  362:iload           5
		//  175  364:iload           7
		//  176  366:iconst_5        
		//  177  367:iadd            
		//  178  368:isub            
		//  179  369:istore          7
			if((workaroundFlags & 0x10) != 0)
		//* 180  371:aload_0         
		//* 181  372:getfield        #22  <Field TsExtractor this$0>
		//* 182  375:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 183  378:bipush          16
		//* 184  380:iand            
		//* 185  381:ifeq            391
				k = j;
		//  186  384:iload           4
		//  187  386:istore          5
			else
		//* 188  388:goto            395
				k = l;
		//  189  391:iload           6
		//  190  393:istore          5
			if(trackIds.get(k))
		//* 191  395:aload_0         
		//* 192  396:getfield        #22  <Field TsExtractor this$0>
		//* 193  399:getfield        #140 <Field SparseBooleanArray TsExtractor.trackIds>
		//* 194  402:iload           5
		//* 195  404:invokevirtual   #146 <Method boolean SparseBooleanArray.get(int)>
		//* 196  407:ifeq            413
				continue; /* Loop/switch isn't completed */
		//  197  410:goto            904
			parsablebytearray = null;
		//  198  413:aconst_null     
		//  199  414:astore_1        
			if(j == 15) goto _L4; else goto _L3
		//  200  415:iload           4
		//  201  417:bipush          15
		//  202  419:icmpeq          822
_L3:
			if(j == 21) goto _L6; else goto _L5
		//  203  422:iload           4
		//  204  424:bipush          21
		//  205  426:icmpeq          774
_L5:
			if(j == 27) goto _L8; else goto _L7
		//  206  429:iload           4
		//  207  431:bipush          27
		//  208  433:icmpeq          670
_L7:
			if(j == 36) goto _L10; else goto _L9
		//  209  436:iload           4
		//  210  438:bipush          36
		//  211  440:icmpeq          631
_L9:
			if(j == 135) goto _L12; else goto _L11
		//  212  443:iload           4
		//  213  445:sipush          135
		//  214  448:icmpeq          611
_L11:
			if(j == 138) goto _L14; else goto _L13
		//  215  451:iload           4
		//  216  453:sipush          138
		//  217  456:icmpeq          592
_L13:
			j;
		//  218  459:iload           4
			JVM INSTR tableswitch 2 4: default 488
		//		               2 573
		//		               3 554
		//		               4 535;
		//  219  461:tableswitch     2 4: default 488
		//		               2 573
		//		               3 554
		//		               4 535
			   goto _L15 _L16 _L17 _L18
_L15:
			switch(j)
		//* 220  488:iload           4
			{
		//* 221  490:tableswitch     129 130: default 512
		//		               129 515
		//		               130 592
			default:
				break; /* Loop/switch isn't completed */
		//  222  512:goto            860

			case 129: 
				parsablebytearray = ((ParsableByteArray) (new Ac3Reader(extractoroutput.track(k), false)));
		//  223  515:new             #148 <Class Ac3Reader>
		//  224  518:dup             
		//  225  519:aload_3         
		//  226  520:iload           5
		//  227  522:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  228  527:iconst_0        
		//  229  528:invokespecial   #151 <Method void Ac3Reader(com.google.android.exoplayer.extractor.TrackOutput, boolean)>
		//  230  531:astore_1        
				break; /* Loop/switch isn't completed */
		//  231  532:goto            860

			case 130: 
				break;
			}
			  goto _L14
_L18:
			parsablebytearray = ((ParsableByteArray) (new MpegAudioReader(extractoroutput.track(k))));
		//  232  535:new             #153 <Class MpegAudioReader>
		//  233  538:dup             
		//  234  539:aload_3         
		//  235  540:iload           5
		//  236  542:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  237  547:invokespecial   #154 <Method void MpegAudioReader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  238  550:astore_1        
			break; /* Loop/switch isn't completed */
		//  239  551:goto            860
_L17:
			parsablebytearray = ((ParsableByteArray) (new MpegAudioReader(extractoroutput.track(k))));
		//  240  554:new             #153 <Class MpegAudioReader>
		//  241  557:dup             
		//  242  558:aload_3         
		//  243  559:iload           5
		//  244  561:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  245  566:invokespecial   #154 <Method void MpegAudioReader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  246  569:astore_1        
			break; /* Loop/switch isn't completed */
		//  247  570:goto            860
_L16:
			parsablebytearray = ((ParsableByteArray) (new H262Reader(extractoroutput.track(k))));
		//  248  573:new             #156 <Class H262Reader>
		//  249  576:dup             
		//  250  577:aload_3         
		//  251  578:iload           5
		//  252  580:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  253  585:invokespecial   #157 <Method void H262Reader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  254  588:astore_1        
			break; /* Loop/switch isn't completed */
		//  255  589:goto            860
_L14:
			parsablebytearray = ((ParsableByteArray) (new DtsReader(extractoroutput.track(k))));
		//  256  592:new             #159 <Class DtsReader>
		//  257  595:dup             
		//  258  596:aload_3         
		//  259  597:iload           5
		//  260  599:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  261  604:invokespecial   #160 <Method void DtsReader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  262  607:astore_1        
			break; /* Loop/switch isn't completed */
		//  263  608:goto            860
_L12:
			parsablebytearray = ((ParsableByteArray) (new Ac3Reader(extractoroutput.track(k), true)));
		//  264  611:new             #148 <Class Ac3Reader>
		//  265  614:dup             
		//  266  615:aload_3         
		//  267  616:iload           5
		//  268  618:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  269  623:iconst_1        
		//  270  624:invokespecial   #151 <Method void Ac3Reader(com.google.android.exoplayer.extractor.TrackOutput, boolean)>
		//  271  627:astore_1        
			break; /* Loop/switch isn't completed */
		//  272  628:goto            860
_L10:
			parsablebytearray = ((ParsableByteArray) (new H265Reader(extractoroutput.track(k), new SeiReader(extractoroutput.track(int i = ((SeiReader) (this)).SeiReader)))));
		//  273  631:new             #162 <Class H265Reader>
		//  274  634:dup             
		//  275  635:aload_3         
		//  276  636:iload           5
		//  277  638:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  278  643:new             #164 <Class SeiReader>
		//  279  646:dup             
		//  280  647:aload_3         
		//  281  648:aload_0         
		//  282  649:getfield        #22  <Field TsExtractor this$0>
		//  283  652:invokestatic    #167 <Method int TsExtractor.access$208(TsExtractor)>
		//  284  655:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  285  660:invokespecial   #168 <Method void SeiReader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  286  663:invokespecial   #171 <Method void H265Reader(com.google.android.exoplayer.extractor.TrackOutput, SeiReader)>
		//  287  666:astore_1        
			break; /* Loop/switch isn't completed */
		//  288  667:goto            860
_L8:
			if((workaroundFlags & 4) == 0)
		//* 289  670:aload_0         
		//* 290  671:getfield        #22  <Field TsExtractor this$0>
		//* 291  674:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 292  677:iconst_4        
		//* 293  678:iand            
		//* 294  679:ifeq            685
		//* 295  682:goto            860
			{
				parsablebytearray = ((ParsableByteArray) (extractoroutput.track(k)));
		//  296  685:aload_3         
		//  297  686:iload           5
		//  298  688:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  299  693:astore_1        
				SeiReader seireader = new SeiReader(extractoroutput.track(int i = ((SeiReader) (this)).SeiReader));
		//  300  694:new             #164 <Class SeiReader>
		//  301  697:dup             
		//  302  698:aload_3         
		//  303  699:aload_0         
		//  304  700:getfield        #22  <Field TsExtractor this$0>
		//  305  703:invokestatic    #167 <Method int TsExtractor.access$208(TsExtractor)>
		//  306  706:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  307  711:invokespecial   #168 <Method void SeiReader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  308  714:astore          9
				if((workaroundFlags & 1) != 0)
		//* 309  716:aload_0         
		//* 310  717:getfield        #22  <Field TsExtractor this$0>
		//* 311  720:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 312  723:iconst_1        
		//* 313  724:iand            
		//* 314  725:ifeq            733
					flag = true;
		//  315  728:iconst_1        
		//  316  729:istore_2        
				else
		//* 317  730:goto            735
					flag = false;
		//  318  733:iconst_0        
		//  319  734:istore_2        
				boolean flag1;
				if((workaroundFlags & 8) != 0)
		//* 320  735:aload_0         
		//* 321  736:getfield        #22  <Field TsExtractor this$0>
		//* 322  739:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 323  742:bipush          8
		//* 324  744:iand            
		//* 325  745:ifeq            754
					flag1 = true;
		//  326  748:iconst_1        
		//  327  749:istore          8
				else
		//* 328  751:goto            757
					flag1 = false;
		//  329  754:iconst_0        
		//  330  755:istore          8
				parsablebytearray = ((ParsableByteArray) (new H264Reader(((com.google.android.exoplayer.extractor.TrackOutput) (parsablebytearray)), seireader, flag, flag1)));
		//  331  757:new             #173 <Class H264Reader>
		//  332  760:dup             
		//  333  761:aload_1         
		//  334  762:aload           9
		//  335  764:iload_2         
		//  336  765:iload           8
		//  337  767:invokespecial   #176 <Method void H264Reader(com.google.android.exoplayer.extractor.TrackOutput, SeiReader, boolean, boolean)>
		//  338  770:astore_1        
			}
			break; /* Loop/switch isn't completed */
		//  339  771:goto            860
_L6:
			if((workaroundFlags & 0x10) != 0)
		//* 340  774:aload_0         
		//* 341  775:getfield        #22  <Field TsExtractor this$0>
		//* 342  778:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 343  781:bipush          16
		//* 344  783:iand            
		//* 345  784:ifeq            798
				parsablebytearray = ((ParsableByteArray) (id3Reader));
		//  346  787:aload_0         
		//  347  788:getfield        #22  <Field TsExtractor this$0>
		//  348  791:getfield        #123 <Field Id3Reader TsExtractor.id3Reader>
		//  349  794:astore_1        
			else
		//* 350  795:goto            860
				parsablebytearray = ((ParsableByteArray) (new Id3Reader(extractoroutput.track(int i = ((SeiReader) (this)).SeiReader))));
		//  351  798:new             #125 <Class Id3Reader>
		//  352  801:dup             
		//  353  802:aload_3         
		//  354  803:aload_0         
		//  355  804:getfield        #22  <Field TsExtractor this$0>
		//  356  807:invokestatic    #167 <Method int TsExtractor.access$208(TsExtractor)>
		//  357  810:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  358  815:invokespecial   #134 <Method void Id3Reader(com.google.android.exoplayer.extractor.TrackOutput)>
		//  359  818:astore_1        
			break; /* Loop/switch isn't completed */
		//  360  819:goto            860
_L4:
			if((workaroundFlags & 2) == 0)
		//* 361  822:aload_0         
		//* 362  823:getfield        #22  <Field TsExtractor this$0>
		//* 363  826:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 364  829:iconst_2        
		//* 365  830:iand            
		//* 366  831:ifeq            837
		//* 367  834:goto            860
				parsablebytearray = ((ParsableByteArray) (new AdtsReader(extractoroutput.track(k), ((com.google.android.exoplayer.extractor.TrackOutput) (new DummyTrackOutput())))));
		//  368  837:new             #178 <Class AdtsReader>
		//  369  840:dup             
		//  370  841:aload_3         
		//  371  842:iload           5
		//  372  844:invokeinterface #131 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
		//  373  849:new             #180 <Class DummyTrackOutput>
		//  374  852:dup             
		//  375  853:invokespecial   #181 <Method void DummyTrackOutput()>
		//  376  856:invokespecial   #184 <Method void AdtsReader(com.google.android.exoplayer.extractor.TrackOutput, com.google.android.exoplayer.extractor.TrackOutput)>
		//  377  859:astore_1        
			if(parsablebytearray != null)
		//* 378  860:aload_1         
		//* 379  861:ifnull          904
			{
				trackIds.put(k, true);
		//  380  864:aload_0         
		//  381  865:getfield        #22  <Field TsExtractor this$0>
		//  382  868:getfield        #140 <Field SparseBooleanArray TsExtractor.trackIds>
		//  383  871:iload           5
		//  384  873:iconst_1        
		//  385  874:invokevirtual   #188 <Method void SparseBooleanArray.put(int, boolean)>
				tsPayloadReaders.put(l, ((Object) (new PesReader(((ElementaryStreamReader) (parsablebytearray)), ptsTimestampAdjuster))));
		//  386  877:aload_0         
		//  387  878:getfield        #22  <Field TsExtractor this$0>
		//  388  881:getfield        #192 <Field SparseArray TsExtractor.tsPayloadReaders>
		//  389  884:iload           6
		//  390  886:new             #194 <Class TsExtractor$PesReader>
		//  391  889:dup             
		//  392  890:aload_1         
		//  393  891:aload_0         
		//  394  892:getfield        #22  <Field TsExtractor this$0>
		//  395  895:invokestatic    #198 <Method PtsTimestampAdjuster TsExtractor.access$300(TsExtractor)>
		//  396  898:invokespecial   #201 <Method void TsExtractor$PesReader(ElementaryStreamReader, PtsTimestampAdjuster)>
		//  397  901:invokevirtual   #206 <Method void SparseArray.put(int, Object)>
			}
			k = i1;
		//  398  904:iload           7
		//  399  906:istore          5
			  goto _L19
		//* 400  908:goto            265
_L2:
			if((workaroundFlags & 0x10) != 0)
		//* 401  911:aload_0         
		//* 402  912:getfield        #22  <Field TsExtractor this$0>
		//* 403  915:invokestatic    #119 <Method int TsExtractor.access$100(TsExtractor)>
		//* 404  918:bipush          16
		//* 405  920:iand            
		//* 406  921:ifeq            943
			{
				if(!tracksEnded)
		//* 407  924:aload_0         
		//* 408  925:getfield        #22  <Field TsExtractor this$0>
		//* 409  928:invokestatic    #210 <Method boolean TsExtractor.access$400(TsExtractor)>
		//* 410  931:ifne            974
					extractoroutput.endTracks();
		//  411  934:aload_3         
		//  412  935:invokeinterface #213 <Method void ExtractorOutput.endTracks()>
			} else
		//* 413  940:goto            974
			{
				tsPayloadReaders.remove(0);
		//  414  943:aload_0         
		//  415  944:getfield        #22  <Field TsExtractor this$0>
		//  416  947:getfield        #192 <Field SparseArray TsExtractor.tsPayloadReaders>
		//  417  950:iconst_0        
		//  418  951:invokevirtual   #216 <Method void SparseArray.remove(int)>
				tsPayloadReaders.remove(pid);
		//  419  954:aload_0         
		//  420  955:getfield        #22  <Field TsExtractor this$0>
		//  421  958:getfield        #192 <Field SparseArray TsExtractor.tsPayloadReaders>
		//  422  961:aload_0         
		//  423  962:getfield        #41  <Field int pid>
		//  424  965:invokevirtual   #216 <Method void SparseArray.remove(int)>
				extractoroutput.endTracks();
		//  425  968:aload_3         
		//  426  969:invokeinterface #213 <Method void ExtractorOutput.endTracks()>
			}
			tracksEnded = true;
		//  427  974:aload_0         
		//  428  975:getfield        #22  <Field TsExtractor this$0>
		//  429  978:iconst_1        
		//  430  979:invokestatic    #220 <Method boolean TsExtractor.access$402(TsExtractor, boolean)>
		//  431  982:pop             
			return;
		//  432  983:return          
		}

		public void seek()
		{
		//    0    0:return          
		}

		private int crc;
		private final int pid;
		private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
		private int sectionBytesRead;
		private final ParsableByteArray sectionData = new ParsableByteArray();
		private int sectionLength;
		final TsExtractor this$0;

		public PmtReader(int i)
		{
			this$0 = TsExtractor.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field TsExtractor this$0>
			super();
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:invokespecial   #25  <Method void TsExtractor$TsPayloadReader(TsExtractor$1)>
		//    6   10:aload_0         
		//    7   11:new             #27  <Class ParsableBitArray>
		//    8   14:dup             
		//    9   15:iconst_5        
		//   10   16:newarray        byte[]
		//   11   18:invokespecial   #30  <Method void ParsableBitArray(byte[])>
		//   12   21:putfield        #32  <Field ParsableBitArray pmtScratch>
		//   13   24:aload_0         
		//   14   25:new             #34  <Class ParsableByteArray>
		//   15   28:dup             
		//   16   29:invokespecial   #37  <Method void ParsableByteArray()>
		//   17   32:putfield        #39  <Field ParsableByteArray sectionData>
			pid = i;
		//   18   35:aload_0         
		//   19   36:iload_2         
		//   20   37:putfield        #41  <Field int pid>
		//   21   40:return          
		}
	}

	private static abstract class TsPayloadReader
	{

		public abstract void consume(ParsableByteArray parsablebytearray, boolean flag, ExtractorOutput extractoroutput);

		public abstract void seek();

		private TsPayloadReader()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

	}


	public TsExtractor()
	{
		this(new PtsTimestampAdjuster(0L));
	//    0    0:aload_0         
	//    1    1:new             #116 <Class PtsTimestampAdjuster>
	//    2    4:dup             
	//    3    5:lconst_0        
	//    4    6:invokespecial   #119 <Method void PtsTimestampAdjuster(long)>
	//    5    9:invokespecial   #122 <Method void TsExtractor(PtsTimestampAdjuster)>
	//    6   12:return          
	}

	public TsExtractor(PtsTimestampAdjuster ptstimestampadjuster)
	{
		this(ptstimestampadjuster, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #125 <Method void TsExtractor(PtsTimestampAdjuster, int)>
	//    4    6:return          
	}

	public TsExtractor(PtsTimestampAdjuster ptstimestampadjuster, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void Object()>
		ptsTimestampAdjuster = ptstimestampadjuster;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #129 <Field PtsTimestampAdjuster ptsTimestampAdjuster>
		workaroundFlags = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #131 <Field int workaroundFlags>
		tsPacketBuffer = new ParsableByteArray(940);
	//    8   14:aload_0         
	//    9   15:new             #133 <Class ParsableByteArray>
	//   10   18:dup             
	//   11   19:sipush          940
	//   12   22:invokespecial   #136 <Method void ParsableByteArray(int)>
	//   13   25:putfield        #138 <Field ParsableByteArray tsPacketBuffer>
		tsScratch = new ParsableBitArray(new byte[3]);
	//   14   28:aload_0         
	//   15   29:new             #140 <Class ParsableBitArray>
	//   16   32:dup             
	//   17   33:iconst_3        
	//   18   34:newarray        byte[]
	//   19   36:invokespecial   #143 <Method void ParsableBitArray(byte[])>
	//   20   39:putfield        #145 <Field ParsableBitArray tsScratch>
		tsPayloadReaders = new SparseArray();
	//   21   42:aload_0         
	//   22   43:new             #147 <Class SparseArray>
	//   23   46:dup             
	//   24   47:invokespecial   #148 <Method void SparseArray()>
	//   25   50:putfield        #150 <Field SparseArray tsPayloadReaders>
		trackIds = new SparseBooleanArray();
	//   26   53:aload_0         
	//   27   54:new             #152 <Class SparseBooleanArray>
	//   28   57:dup             
	//   29   58:invokespecial   #153 <Method void SparseBooleanArray()>
	//   30   61:putfield        #155 <Field SparseBooleanArray trackIds>
		continuityCounters = new SparseIntArray();
	//   31   64:aload_0         
	//   32   65:new             #157 <Class SparseIntArray>
	//   33   68:dup             
	//   34   69:invokespecial   #158 <Method void SparseIntArray()>
	//   35   72:putfield        #160 <Field SparseIntArray continuityCounters>
		resetPayloadReaders();
	//   36   75:aload_0         
	//   37   76:invokespecial   #163 <Method void resetPayloadReaders()>
	//   38   79:return          
	}

	private void resetPayloadReaders()
	{
		trackIds.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field SparseBooleanArray trackIds>
	//    2    4:invokevirtual   #183 <Method void SparseBooleanArray.clear()>
		tsPayloadReaders.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #150 <Field SparseArray tsPayloadReaders>
	//    5   11:invokevirtual   #184 <Method void SparseArray.clear()>
		tsPayloadReaders.put(0, ((Object) (new PatReader())));
	//    6   14:aload_0         
	//    7   15:getfield        #150 <Field SparseArray tsPayloadReaders>
	//    8   18:iconst_0        
	//    9   19:new             #10  <Class TsExtractor$PatReader>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #187 <Method void TsExtractor$PatReader(TsExtractor)>
	//   13   27:invokevirtual   #191 <Method void SparseArray.put(int, Object)>
		id3Reader = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #193 <Field Id3Reader id3Reader>
		nextEmbeddedTrackId = 8192;
	//   17   35:aload_0         
	//   18   36:sipush          8192
	//   19   39:putfield        #168 <Field int nextEmbeddedTrackId>
	//   20   42:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		output = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #197 <Field ExtractorOutput output>
		extractoroutput.seekMap(SeekMap.UNSEEKABLE);
	//    3    5:aload_1         
	//    4    6:getstatic       #203 <Field SeekMap SeekMap.UNSEEKABLE>
	//    5    9:invokeinterface #209 <Method void ExtractorOutput.seekMap(SeekMap)>
	//    6   14:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		boolean flag;
		int i1;
		int j1;
		int k1;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
label0:
		{
			positionholder = ((PositionHolder) (tsPacketBuffer.data));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//    2    4:getfield        #219 <Field byte[] ParsableByteArray.data>
	//    3    7:astore_2        
			if(940 - tsPacketBuffer.getPosition() < 188)
	//*   4    8:sipush          940
	//*   5   11:aload_0         
	//*   6   12:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//*   7   15:invokevirtual   #223 <Method int ParsableByteArray.getPosition()>
	//*   8   18:isub            
	//*   9   19:sipush          188
	//*  10   22:icmpge          60
			{
				int i = tsPacketBuffer.bytesLeft();
	//   11   25:aload_0         
	//   12   26:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   13   29:invokevirtual   #226 <Method int ParsableByteArray.bytesLeft()>
	//   14   32:istore_3        
				if(i > 0)
	//*  15   33:iload_3         
	//*  16   34:ifle            51
					System.arraycopy(((Object) (positionholder)), tsPacketBuffer.getPosition(), ((Object) (positionholder)), 0, i);
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   20   42:invokevirtual   #223 <Method int ParsableByteArray.getPosition()>
	//   21   45:aload_2         
	//   22   46:iconst_0        
	//   23   47:iload_3         
	//   24   48:invokestatic    #232 <Method void System.arraycopy(Object, int, Object, int, int)>
				tsPacketBuffer.reset(((byte []) (positionholder)), i);
	//   25   51:aload_0         
	//   26   52:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   27   55:aload_2         
	//   28   56:iload_3         
	//   29   57:invokevirtual   #236 <Method void ParsableByteArray.reset(byte[], int)>
			}
			int j;
			int l;
			for(; tsPacketBuffer.bytesLeft() < 188; tsPacketBuffer.setLimit(j + l))
	//*  30   60:aload_0         
	//*  31   61:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//*  32   64:invokevirtual   #226 <Method int ParsableByteArray.bytesLeft()>
	//*  33   67:sipush          188
	//*  34   70:icmpge          118
			{
				j = tsPacketBuffer.limit();
	//   35   73:aload_0         
	//   36   74:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   37   77:invokevirtual   #239 <Method int ParsableByteArray.limit()>
	//   38   80:istore_3        
				l = extractorinput.read(((byte []) (positionholder)), j, 940 - j);
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:iload_3         
	//   42   84:sipush          940
	//   43   87:iload_3         
	//   44   88:isub            
	//   45   89:invokeinterface #244 <Method int ExtractorInput.read(byte[], int, int)>
	//   46   94:istore          4
				if(l == -1)
	//*  47   96:iload           4
	//*  48   98:iconst_m1       
	//*  49   99:icmpne          104
					return -1;
	//   50  102:iconst_m1       
	//   51  103:ireturn         
			}

	//   52  104:aload_0         
	//   53  105:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   54  108:iload_3         
	//   55  109:iload           4
	//   56  111:iadd            
	//   57  112:invokevirtual   #247 <Method void ParsableByteArray.setLimit(int)>
	//*  58  115:goto            60
			i1 = tsPacketBuffer.limit();
	//   59  118:aload_0         
	//   60  119:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   61  122:invokevirtual   #239 <Method int ParsableByteArray.limit()>
	//   62  125:istore          4
			int k;
			for(k = tsPacketBuffer.getPosition(); k < i1 && positionholder[k] != 71; k++);
	//   63  127:aload_0         
	//   64  128:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   65  131:invokevirtual   #223 <Method int ParsableByteArray.getPosition()>
	//   66  134:istore_3        
	//   67  135:iload_3         
	//   68  136:iload           4
	//   69  138:icmpge          156
	//   70  141:aload_2         
	//   71  142:iload_3         
	//   72  143:baload          
	//   73  144:bipush          71
	//   74  146:icmpeq          156
	//   75  149:iload_3         
	//   76  150:iconst_1        
	//   77  151:iadd            
	//   78  152:istore_3        
	//*  79  153:goto            135
			tsPacketBuffer.setPosition(k);
	//   80  156:aload_0         
	//   81  157:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   82  160:iload_3         
	//   83  161:invokevirtual   #250 <Method void ParsableByteArray.setPosition(int)>
			j1 = k + 188;
	//   84  164:iload_3         
	//   85  165:sipush          188
	//   86  168:iadd            
	//   87  169:istore          5
			if(j1 > i1)
	//*  88  171:iload           5
	//*  89  173:iload           4
	//*  90  175:icmple          180
				return 0;
	//   91  178:iconst_0        
	//   92  179:ireturn         
			extractorinput = ((ExtractorInput) (tsPacketBuffer));
	//   93  180:aload_0         
	//   94  181:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//   95  184:astore_1        
			flag1 = true;
	//   96  185:iconst_1        
	//   97  186:istore          8
			((ParsableByteArray) (extractorinput)).skipBytes(1);
	//   98  188:aload_1         
	//   99  189:iconst_1        
	//  100  190:invokevirtual   #253 <Method void ParsableByteArray.skipBytes(int)>
			tsPacketBuffer.readBytes(tsScratch, 3);
	//  101  193:aload_0         
	//  102  194:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  103  197:aload_0         
	//  104  198:getfield        #145 <Field ParsableBitArray tsScratch>
	//  105  201:iconst_3        
	//  106  202:invokevirtual   #257 <Method void ParsableByteArray.readBytes(ParsableBitArray, int)>
			if(tsScratch.readBit())
	//* 107  205:aload_0         
	//* 108  206:getfield        #145 <Field ParsableBitArray tsScratch>
	//* 109  209:invokevirtual   #261 <Method boolean ParsableBitArray.readBit()>
	//* 110  212:ifeq            226
			{
				tsPacketBuffer.setPosition(j1);
	//  111  215:aload_0         
	//  112  216:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  113  219:iload           5
	//  114  221:invokevirtual   #250 <Method void ParsableByteArray.setPosition(int)>
				return 0;
	//  115  224:iconst_0        
	//  116  225:ireturn         
			}
			flag2 = tsScratch.readBit();
	//  117  226:aload_0         
	//  118  227:getfield        #145 <Field ParsableBitArray tsScratch>
	//  119  230:invokevirtual   #261 <Method boolean ParsableBitArray.readBit()>
	//  120  233:istore          9
			tsScratch.skipBits(1);
	//  121  235:aload_0         
	//  122  236:getfield        #145 <Field ParsableBitArray tsScratch>
	//  123  239:iconst_1        
	//  124  240:invokevirtual   #264 <Method void ParsableBitArray.skipBits(int)>
			k1 = tsScratch.readBits(13);
	//  125  243:aload_0         
	//  126  244:getfield        #145 <Field ParsableBitArray tsScratch>
	//  127  247:bipush          13
	//  128  249:invokevirtual   #268 <Method int ParsableBitArray.readBits(int)>
	//  129  252:istore          6
			tsScratch.skipBits(2);
	//  130  254:aload_0         
	//  131  255:getfield        #145 <Field ParsableBitArray tsScratch>
	//  132  258:iconst_2        
	//  133  259:invokevirtual   #264 <Method void ParsableBitArray.skipBits(int)>
			flag3 = tsScratch.readBit();
	//  134  262:aload_0         
	//  135  263:getfield        #145 <Field ParsableBitArray tsScratch>
	//  136  266:invokevirtual   #261 <Method boolean ParsableBitArray.readBit()>
	//  137  269:istore          10
			flag4 = tsScratch.readBit();
	//  138  271:aload_0         
	//  139  272:getfield        #145 <Field ParsableBitArray tsScratch>
	//  140  275:invokevirtual   #261 <Method boolean ParsableBitArray.readBit()>
	//  141  278:istore          11
			k = tsScratch.readBits(4);
	//  142  280:aload_0         
	//  143  281:getfield        #145 <Field ParsableBitArray tsScratch>
	//  144  284:iconst_4        
	//  145  285:invokevirtual   #268 <Method int ParsableBitArray.readBits(int)>
	//  146  288:istore_3        
			if((workaroundFlags & 0x10) == 0)
	//* 147  289:aload_0         
	//* 148  290:getfield        #131 <Field int workaroundFlags>
	//* 149  293:bipush          16
	//* 150  295:iand            
	//* 151  296:ifne            361
			{
				int l1 = continuityCounters.get(k1, k - 1);
	//  152  299:aload_0         
	//  153  300:getfield        #160 <Field SparseIntArray continuityCounters>
	//  154  303:iload           6
	//  155  305:iload_3         
	//  156  306:iconst_1        
	//  157  307:isub            
	//  158  308:invokevirtual   #272 <Method int SparseIntArray.get(int, int)>
	//  159  311:istore          7
				continuityCounters.put(k1, k);
	//  160  313:aload_0         
	//  161  314:getfield        #160 <Field SparseIntArray continuityCounters>
	//  162  317:iload           6
	//  163  319:iload_3         
	//  164  320:invokevirtual   #275 <Method void SparseIntArray.put(int, int)>
				if(l1 == k)
	//* 165  323:iload           7
	//* 166  325:iload_3         
	//* 167  326:icmpne          345
				{
					if(flag4)
	//* 168  329:iload           11
	//* 169  331:ifeq            361
					{
						tsPacketBuffer.setPosition(j1);
	//  170  334:aload_0         
	//  171  335:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  172  338:iload           5
	//  173  340:invokevirtual   #250 <Method void ParsableByteArray.setPosition(int)>
						return 0;
	//  174  343:iconst_0        
	//  175  344:ireturn         
					}
				} else
				if(k != (l1 + 1) % 16)
	//* 176  345:iload_3         
	//* 177  346:iload           7
	//* 178  348:iconst_1        
	//* 179  349:iadd            
	//* 180  350:bipush          16
	//* 181  352:irem            
	//* 182  353:icmpeq          361
				{
					flag = true;
	//  183  356:iconst_1        
	//  184  357:istore_3        
					break label0;
	//  185  358:goto            363
				}
			}
			flag = false;
	//  186  361:iconst_0        
	//  187  362:istore_3        
		}
		if(flag3)
	//* 188  363:iload           10
	//* 189  365:ifeq            386
		{
			int i2 = tsPacketBuffer.readUnsignedByte();
	//  190  368:aload_0         
	//  191  369:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  192  372:invokevirtual   #278 <Method int ParsableByteArray.readUnsignedByte()>
	//  193  375:istore          7
			tsPacketBuffer.skipBytes(i2);
	//  194  377:aload_0         
	//  195  378:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  196  381:iload           7
	//  197  383:invokevirtual   #253 <Method void ParsableByteArray.skipBytes(int)>
		}
		if(flag4)
	//* 198  386:iload           11
	//* 199  388:ifeq            471
		{
			extractorinput = ((ExtractorInput) ((TsPayloadReader)tsPayloadReaders.get(k1)));
	//  200  391:aload_0         
	//  201  392:getfield        #150 <Field SparseArray tsPayloadReaders>
	//  202  395:iload           6
	//  203  397:invokevirtual   #281 <Method Object SparseArray.get(int)>
	//  204  400:checkcast       #19  <Class TsExtractor$TsPayloadReader>
	//  205  403:astore_1        
			if(extractorinput != null)
	//* 206  404:aload_1         
	//* 207  405:ifnull          471
			{
				if(flag)
	//* 208  408:iload_3         
	//* 209  409:ifeq            416
					((TsPayloadReader) (extractorinput)).seek();
	//  210  412:aload_1         
	//  211  413:invokevirtual   #284 <Method void TsExtractor$TsPayloadReader.seek()>
				tsPacketBuffer.setLimit(j1);
	//  212  416:aload_0         
	//  213  417:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  214  420:iload           5
	//  215  422:invokevirtual   #247 <Method void ParsableByteArray.setLimit(int)>
				((TsPayloadReader) (extractorinput)).consume(tsPacketBuffer, flag2, output);
	//  216  425:aload_1         
	//  217  426:aload_0         
	//  218  427:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  219  430:iload           9
	//  220  432:aload_0         
	//  221  433:getfield        #197 <Field ExtractorOutput output>
	//  222  436:invokevirtual   #288 <Method void TsExtractor$TsPayloadReader.consume(ParsableByteArray, boolean, ExtractorOutput)>
				if(tsPacketBuffer.getPosition() > j1)
	//* 223  439:aload_0         
	//* 224  440:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//* 225  443:invokevirtual   #223 <Method int ParsableByteArray.getPosition()>
	//* 226  446:iload           5
	//* 227  448:icmpgt          454
	//* 228  451:goto            457
					flag1 = false;
	//  229  454:iconst_0        
	//  230  455:istore          8
				Assertions.checkState(flag1);
	//  231  457:iload           8
	//  232  459:invokestatic    #294 <Method void Assertions.checkState(boolean)>
				tsPacketBuffer.setLimit(i1);
	//  233  462:aload_0         
	//  234  463:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  235  466:iload           4
	//  236  468:invokevirtual   #247 <Method void ParsableByteArray.setLimit(int)>
			}
		}
		tsPacketBuffer.setPosition(j1);
	//  237  471:aload_0         
	//  238  472:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//  239  475:iload           5
	//  240  477:invokevirtual   #250 <Method void ParsableByteArray.setPosition(int)>
		return 0;
	//  241  480:iconst_0        
	//  242  481:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		ptsTimestampAdjuster.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//    2    4:invokevirtual   #298 <Method void PtsTimestampAdjuster.reset()>
		tsPacketBuffer.reset();
	//    3    7:aload_0         
	//    4    8:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//    5   11:invokevirtual   #299 <Method void ParsableByteArray.reset()>
		continuityCounters.clear();
	//    6   14:aload_0         
	//    7   15:getfield        #160 <Field SparseIntArray continuityCounters>
	//    8   18:invokevirtual   #300 <Method void SparseIntArray.clear()>
		resetPayloadReaders();
	//    9   21:aload_0         
	//   10   22:invokespecial   #163 <Method void resetPayloadReaders()>
	//   11   25:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = tsPacketBuffer.data;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ParsableByteArray tsPacketBuffer>
	//    2    4:getfield        #219 <Field byte[] ParsableByteArray.data>
	//    3    7:astore          4
		extractorinput.peekFully(abyte0, 0, 940);
	//    4    9:aload_1         
	//    5   10:aload           4
	//    6   12:iconst_0        
	//    7   13:sipush          940
	//    8   16:invokeinterface #306 <Method void ExtractorInput.peekFully(byte[], int, int)>
		int i = 0;
	//    9   21:iconst_0        
	//   10   22:istore_2        
label0:
		do
		{
			if(i < 188)
	//*  11   23:iload_2         
	//*  12   24:sipush          188
	//*  13   27:icmpge          75
			{
				int j = 0;
	//   14   30:iconst_0        
	//   15   31:istore_3        
				do
				{
					if(j == 5)
	//*  16   32:iload_3         
	//*  17   33:iconst_5        
	//*  18   34:icmpne          46
					{
						extractorinput.skipFully(i);
	//   19   37:aload_1         
	//   20   38:iload_2         
	//   21   39:invokeinterface #309 <Method void ExtractorInput.skipFully(int)>
						return true;
	//   22   44:iconst_1        
	//   23   45:ireturn         
					}
					if(abyte0[j * 188 + i] != 71)
	//*  24   46:aload           4
	//*  25   48:iload_3         
	//*  26   49:sipush          188
	//*  27   52:imul            
	//*  28   53:iload_2         
	//*  29   54:iadd            
	//*  30   55:baload          
	//*  31   56:bipush          71
	//*  32   58:icmpeq          68
					{
						i++;
	//   33   61:iload_2         
	//   34   62:iconst_1        
	//   35   63:iadd            
	//   36   64:istore_2        
						continue label0;
	//   37   65:goto            23
					}
					j++;
	//   38   68:iload_3         
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore_3        
				} while(true);
	//   42   72:goto            32
			}
			return false;
	//   43   75:iconst_0        
	//   44   76:ireturn         
		} while(true);
	}

	private static final long AC3_FORMAT_IDENTIFIER = (long)Util.getIntegerCodeForString("AC-3");
	private static final int BASE_EMBEDDED_TRACK_ID = 8192;
	private static final int BUFFER_PACKET_COUNT = 5;
	private static final int BUFFER_SIZE = 940;
	private static final long E_AC3_FORMAT_IDENTIFIER = (long)Util.getIntegerCodeForString("EAC3");
	private static final long HEVC_FORMAT_IDENTIFIER = (long)Util.getIntegerCodeForString("HEVC");
	private static final String TAG = "TsExtractor";
	private static final int TS_PACKET_SIZE = 188;
	private static final int TS_PAT_PID = 0;
	private static final int TS_STREAM_TYPE_AAC = 15;
	private static final int TS_STREAM_TYPE_AC3 = 129;
	private static final int TS_STREAM_TYPE_DTS = 138;
	private static final int TS_STREAM_TYPE_E_AC3 = 135;
	private static final int TS_STREAM_TYPE_H262 = 2;
	private static final int TS_STREAM_TYPE_H264 = 27;
	private static final int TS_STREAM_TYPE_H265 = 36;
	private static final int TS_STREAM_TYPE_HDMV_DTS = 130;
	private static final int TS_STREAM_TYPE_ID3 = 21;
	private static final int TS_STREAM_TYPE_MPA = 3;
	private static final int TS_STREAM_TYPE_MPA_LSF = 4;
	private static final int TS_SYNC_BYTE = 71;
	public static final int WORKAROUND_ALLOW_NON_IDR_KEYFRAMES = 1;
	public static final int WORKAROUND_DETECT_ACCESS_UNITS = 8;
	public static final int WORKAROUND_HLS_MODE = 16;
	public static final int WORKAROUND_IGNORE_AAC_STREAM = 2;
	public static final int WORKAROUND_IGNORE_H264_STREAM = 4;
	private final SparseIntArray continuityCounters;
	Id3Reader id3Reader;
	private int nextEmbeddedTrackId;
	private ExtractorOutput output;
	private final PtsTimestampAdjuster ptsTimestampAdjuster;
	final SparseBooleanArray trackIds;
	private boolean tracksEnded;
	private final ParsableByteArray tsPacketBuffer;
	final SparseArray tsPayloadReaders;
	private final ParsableBitArray tsScratch;
	private final int workaroundFlags;

	static 
	{
	//    0    0:ldc1            #96  <String "AC-3">
	//    1    2:invokestatic    #102 <Method int Util.getIntegerCodeForString(String)>
	//    2    5:i2l             
	//    3    6:putstatic       #104 <Field long AC3_FORMAT_IDENTIFIER>
	//    4    9:ldc1            #106 <String "EAC3">
	//    5   11:invokestatic    #102 <Method int Util.getIntegerCodeForString(String)>
	//    6   14:i2l             
	//    7   15:putstatic       #108 <Field long E_AC3_FORMAT_IDENTIFIER>
	//    8   18:ldc1            #110 <String "HEVC">
	//    9   20:invokestatic    #102 <Method int Util.getIntegerCodeForString(String)>
	//   10   23:i2l             
	//   11   24:putstatic       #112 <Field long HEVC_FORMAT_IDENTIFIER>
	//*  12   27:return          
	}


/*
	static int access$100(TsExtractor tsextractor)
	{
		return tsextractor.workaroundFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int workaroundFlags>
	//    2    4:ireturn         
	}

*/


/*
	static int access$208(TsExtractor tsextractor)
	{
		int i = tsextractor.nextEmbeddedTrackId;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field int nextEmbeddedTrackId>
	//    2    4:istore_1        
		tsextractor.nextEmbeddedTrackId = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #168 <Field int nextEmbeddedTrackId>
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
	}

*/


/*
	static PtsTimestampAdjuster access$300(TsExtractor tsextractor)
	{
		return tsextractor.ptsTimestampAdjuster;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$400(TsExtractor tsextractor)
	{
		return tsextractor.tracksEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field boolean tracksEnded>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$402(TsExtractor tsextractor, boolean flag)
	{
		tsextractor.tracksEnded = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #174 <Field boolean tracksEnded>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static long access$500()
	{
		return AC3_FORMAT_IDENTIFIER;
	//    0    0:getstatic       #104 <Field long AC3_FORMAT_IDENTIFIER>
	//    1    3:lreturn         
	}

*/


/*
	static long access$600()
	{
		return E_AC3_FORMAT_IDENTIFIER;
	//    0    0:getstatic       #108 <Field long E_AC3_FORMAT_IDENTIFIER>
	//    1    3:lreturn         
	}

*/


/*
	static long access$700()
	{
		return HEVC_FORMAT_IDENTIFIER;
	//    0    0:getstatic       #112 <Field long HEVC_FORMAT_IDENTIFIER>
	//    1    3:lreturn         
	}

*/
}
