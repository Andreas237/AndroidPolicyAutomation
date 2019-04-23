// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.extractor.ExtractorOutput;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			PsExtractor, PtsTimestampAdjuster, ElementaryStreamReader

private static final class PsExtractor$PesReader
{

	private void parseHeader()
	{
		pesScratch.skipBits(8);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ParsableBitArray pesScratch>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
		ptsFlag = pesScratch.readBit();
	//    4    9:aload_0         
	//    5   10:aload_0         
	//    6   11:getfield        #39  <Field ParsableBitArray pesScratch>
	//    7   14:invokevirtual   #49  <Method boolean ParsableBitArray.readBit()>
	//    8   17:putfield        #51  <Field boolean ptsFlag>
		dtsFlag = pesScratch.readBit();
	//    9   20:aload_0         
	//   10   21:aload_0         
	//   11   22:getfield        #39  <Field ParsableBitArray pesScratch>
	//   12   25:invokevirtual   #49  <Method boolean ParsableBitArray.readBit()>
	//   13   28:putfield        #53  <Field boolean dtsFlag>
		pesScratch.skipBits(6);
	//   14   31:aload_0         
	//   15   32:getfield        #39  <Field ParsableBitArray pesScratch>
	//   16   35:bipush          6
	//   17   37:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
		extendedHeaderLength = pesScratch.readBits(8);
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #39  <Field ParsableBitArray pesScratch>
	//   21   45:bipush          8
	//   22   47:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   23   50:putfield        #59  <Field int extendedHeaderLength>
	//   24   53:return          
	}

	private void parseHeaderExtension()
	{
		timeUs = 0L;
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:putfield        #62  <Field long timeUs>
		if(ptsFlag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #51  <Field boolean ptsFlag>
	//*   5    9:ifeq            208
		{
			pesScratch.skipBits(4);
	//    6   12:aload_0         
	//    7   13:getfield        #39  <Field ParsableBitArray pesScratch>
	//    8   16:iconst_4        
	//    9   17:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
			long l = pesScratch.readBits(3);
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field ParsableBitArray pesScratch>
	//   12   24:iconst_3        
	//   13   25:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   14   28:i2l             
	//   15   29:lstore_1        
			pesScratch.skipBits(1);
	//   16   30:aload_0         
	//   17   31:getfield        #39  <Field ParsableBitArray pesScratch>
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
			long l1 = pesScratch.readBits(15) << 15;
	//   20   38:aload_0         
	//   21   39:getfield        #39  <Field ParsableBitArray pesScratch>
	//   22   42:bipush          15
	//   23   44:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   24   47:bipush          15
	//   25   49:ishl            
	//   26   50:i2l             
	//   27   51:lstore_3        
			pesScratch.skipBits(1);
	//   28   52:aload_0         
	//   29   53:getfield        #39  <Field ParsableBitArray pesScratch>
	//   30   56:iconst_1        
	//   31   57:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
			long l2 = pesScratch.readBits(15);
	//   32   60:aload_0         
	//   33   61:getfield        #39  <Field ParsableBitArray pesScratch>
	//   34   64:bipush          15
	//   35   66:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   36   69:i2l             
	//   37   70:lstore          5
			pesScratch.skipBits(1);
	//   38   72:aload_0         
	//   39   73:getfield        #39  <Field ParsableBitArray pesScratch>
	//   40   76:iconst_1        
	//   41   77:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
			if(!seenFirstDts && dtsFlag)
	//*  42   80:aload_0         
	//*  43   81:getfield        #64  <Field boolean seenFirstDts>
	//*  44   84:ifne            188
	//*  45   87:aload_0         
	//*  46   88:getfield        #53  <Field boolean dtsFlag>
	//*  47   91:ifeq            188
			{
				pesScratch.skipBits(4);
	//   48   94:aload_0         
	//   49   95:getfield        #39  <Field ParsableBitArray pesScratch>
	//   50   98:iconst_4        
	//   51   99:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
				long l3 = pesScratch.readBits(3);
	//   52  102:aload_0         
	//   53  103:getfield        #39  <Field ParsableBitArray pesScratch>
	//   54  106:iconst_3        
	//   55  107:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   56  110:i2l             
	//   57  111:lstore          7
				pesScratch.skipBits(1);
	//   58  113:aload_0         
	//   59  114:getfield        #39  <Field ParsableBitArray pesScratch>
	//   60  117:iconst_1        
	//   61  118:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
				long l4 = pesScratch.readBits(15) << 15;
	//   62  121:aload_0         
	//   63  122:getfield        #39  <Field ParsableBitArray pesScratch>
	//   64  125:bipush          15
	//   65  127:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   66  130:bipush          15
	//   67  132:ishl            
	//   68  133:i2l             
	//   69  134:lstore          9
				pesScratch.skipBits(1);
	//   70  136:aload_0         
	//   71  137:getfield        #39  <Field ParsableBitArray pesScratch>
	//   72  140:iconst_1        
	//   73  141:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
				long l5 = pesScratch.readBits(15);
	//   74  144:aload_0         
	//   75  145:getfield        #39  <Field ParsableBitArray pesScratch>
	//   76  148:bipush          15
	//   77  150:invokevirtual   #57  <Method int ParsableBitArray.readBits(int)>
	//   78  153:i2l             
	//   79  154:lstore          11
				pesScratch.skipBits(1);
	//   80  156:aload_0         
	//   81  157:getfield        #39  <Field ParsableBitArray pesScratch>
	//   82  160:iconst_1        
	//   83  161:invokevirtual   #45  <Method void ParsableBitArray.skipBits(int)>
				ptsTimestampAdjuster.adjustTimestamp(l3 << 30 | l4 | l5);
	//   84  164:aload_0         
	//   85  165:getfield        #32  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//   86  168:lload           7
	//   87  170:bipush          30
	//   88  172:lshl            
	//   89  173:lload           9
	//   90  175:lor             
	//   91  176:lload           11
	//   92  178:lor             
	//   93  179:invokevirtual   #70  <Method long PtsTimestampAdjuster.adjustTimestamp(long)>
	//   94  182:pop2            
				seenFirstDts = true;
	//   95  183:aload_0         
	//   96  184:iconst_1        
	//   97  185:putfield        #64  <Field boolean seenFirstDts>
			}
			timeUs = ptsTimestampAdjuster.adjustTimestamp(l << 30 | l1 | l2);
	//   98  188:aload_0         
	//   99  189:aload_0         
	//  100  190:getfield        #32  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//  101  193:lload_1         
	//  102  194:bipush          30
	//  103  196:lshl            
	//  104  197:lload_3         
	//  105  198:lor             
	//  106  199:lload           5
	//  107  201:lor             
	//  108  202:invokevirtual   #70  <Method long PtsTimestampAdjuster.adjustTimestamp(long)>
	//  109  205:putfield        #62  <Field long timeUs>
		}
	//  110  208:return          
	}

	public void consume(ParsableByteArray parsablebytearray, ExtractorOutput extractoroutput)
	{
		parsablebytearray.readBytes(pesScratch.data, 0, 3);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field ParsableBitArray pesScratch>
	//    3    5:getfield        #76  <Field byte[] ParsableBitArray.data>
	//    4    8:iconst_0        
	//    5    9:iconst_3        
	//    6   10:invokevirtual   #82  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		pesScratch.setPosition(0);
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field ParsableBitArray pesScratch>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #85  <Method void ParsableBitArray.setPosition(int)>
		parseHeader();
	//   11   21:aload_0         
	//   12   22:invokespecial   #87  <Method void parseHeader()>
		parsablebytearray.readBytes(pesScratch.data, 0, extendedHeaderLength);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #39  <Field ParsableBitArray pesScratch>
	//   16   30:getfield        #76  <Field byte[] ParsableBitArray.data>
	//   17   33:iconst_0        
	//   18   34:aload_0         
	//   19   35:getfield        #59  <Field int extendedHeaderLength>
	//   20   38:invokevirtual   #82  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		pesScratch.setPosition(0);
	//   21   41:aload_0         
	//   22   42:getfield        #39  <Field ParsableBitArray pesScratch>
	//   23   45:iconst_0        
	//   24   46:invokevirtual   #85  <Method void ParsableBitArray.setPosition(int)>
		parseHeaderExtension();
	//   25   49:aload_0         
	//   26   50:invokespecial   #89  <Method void parseHeaderExtension()>
		pesPayloadReader.packetStarted(timeUs, true);
	//   27   53:aload_0         
	//   28   54:getfield        #30  <Field ElementaryStreamReader pesPayloadReader>
	//   29   57:aload_0         
	//   30   58:getfield        #62  <Field long timeUs>
	//   31   61:iconst_1        
	//   32   62:invokevirtual   #95  <Method void ElementaryStreamReader.packetStarted(long, boolean)>
		pesPayloadReader.consume(parsablebytearray);
	//   33   65:aload_0         
	//   34   66:getfield        #30  <Field ElementaryStreamReader pesPayloadReader>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #98  <Method void ElementaryStreamReader.consume(ParsableByteArray)>
		pesPayloadReader.packetFinished();
	//   37   73:aload_0         
	//   38   74:getfield        #30  <Field ElementaryStreamReader pesPayloadReader>
	//   39   77:invokevirtual   #101 <Method void ElementaryStreamReader.packetFinished()>
	//   40   80:return          
	}

	public void seek()
	{
		seenFirstDts = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #64  <Field boolean seenFirstDts>
		pesPayloadReader.seek();
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field ElementaryStreamReader pesPayloadReader>
	//    5    9:invokevirtual   #104 <Method void ElementaryStreamReader.seek()>
	//    6   12:return          
	}

	private static final int PES_SCRATCH_SIZE = 64;
	private boolean dtsFlag;
	private int extendedHeaderLength;
	private final ElementaryStreamReader pesPayloadReader;
	private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[64]);
	private boolean ptsFlag;
	private final PtsTimestampAdjuster ptsTimestampAdjuster;
	private boolean seenFirstDts;
	private long timeUs;

	public PsExtractor$PesReader(ElementaryStreamReader elementarystreamreader, PtsTimestampAdjuster ptstimestampadjuster)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		pesPayloadReader = elementarystreamreader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field ElementaryStreamReader pesPayloadReader>
		ptsTimestampAdjuster = ptstimestampadjuster;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//    8   14:aload_0         
	//    9   15:new             #34  <Class ParsableBitArray>
	//   10   18:dup             
	//   11   19:bipush          64
	//   12   21:newarray        byte[]
	//   13   23:invokespecial   #37  <Method void ParsableBitArray(byte[])>
	//   14   26:putfield        #39  <Field ParsableBitArray pesScratch>
	//   15   29:return          
	}
}
