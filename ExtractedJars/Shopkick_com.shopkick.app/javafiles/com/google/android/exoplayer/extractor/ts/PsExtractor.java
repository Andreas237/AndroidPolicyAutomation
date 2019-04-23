// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			PtsTimestampAdjuster, Ac3Reader, MpegAudioReader, H262Reader, 
//			ElementaryStreamReader

public final class PsExtractor
	implements Extractor
{
	private static final class PesReader
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

		public PesReader(ElementaryStreamReader elementarystreamreader, PtsTimestampAdjuster ptstimestampadjuster)
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


	public PsExtractor()
	{
		this(new PtsTimestampAdjuster(0L));
	//    0    0:aload_0         
	//    1    1:new             #48  <Class PtsTimestampAdjuster>
	//    2    4:dup             
	//    3    5:lconst_0        
	//    4    6:invokespecial   #51  <Method void PtsTimestampAdjuster(long)>
	//    5    9:invokespecial   #54  <Method void PsExtractor(PtsTimestampAdjuster)>
	//    6   12:return          
	}

	public PsExtractor(PtsTimestampAdjuster ptstimestampadjuster)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		ptsTimestampAdjuster = ptstimestampadjuster;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
		psPacketBuffer = new ParsableByteArray(4096);
	//    5    9:aload_0         
	//    6   10:new             #61  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:sipush          4096
	//    9   17:invokespecial   #64  <Method void ParsableByteArray(int)>
	//   10   20:putfield        #66  <Field ParsableByteArray psPacketBuffer>
		psPayloadReaders = new SparseArray();
	//   11   23:aload_0         
	//   12   24:new             #68  <Class SparseArray>
	//   13   27:dup             
	//   14   28:invokespecial   #69  <Method void SparseArray()>
	//   15   31:putfield        #71  <Field SparseArray psPayloadReaders>
	//   16   34:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		output = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field ExtractorOutput output>
		extractoroutput.seekMap(SeekMap.UNSEEKABLE);
	//    3    5:aload_1         
	//    4    6:getstatic       #81  <Field SeekMap SeekMap.UNSEEKABLE>
	//    5    9:invokeinterface #87  <Method void ExtractorOutput.seekMap(SeekMap)>
	//    6   14:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
label0:
		{
			if(!extractorinput.peekFully(psPacketBuffer.data, 0, 4, true))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//*   3    5:getfield        #97  <Field byte[] ParsableByteArray.data>
	//*   4    8:iconst_0        
	//*   5    9:iconst_4        
	//*   6   10:iconst_1        
	//*   7   11:invokeinterface #103 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*   8   16:ifne            21
				return -1;
	//    9   19:iconst_m1       
	//   10   20:ireturn         
			psPacketBuffer.setPosition(0);
	//   11   21:aload_0         
	//   12   22:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #106 <Method void ParsableByteArray.setPosition(int)>
			int i = psPacketBuffer.readInt();
	//   15   29:aload_0         
	//   16   30:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   17   33:invokevirtual   #110 <Method int ParsableByteArray.readInt()>
	//   18   36:istore_3        
			if(i == 441)
	//*  19   37:iload_3         
	//*  20   38:sipush          441
	//*  21   41:icmpne          46
				return -1;
	//   22   44:iconst_m1       
	//   23   45:ireturn         
			if(i == 442)
	//*  24   46:iload_3         
	//*  25   47:sipush          442
	//*  26   50:icmpne          107
			{
				extractorinput.peekFully(psPacketBuffer.data, 0, 10);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   30   58:getfield        #97  <Field byte[] ParsableByteArray.data>
	//   31   61:iconst_0        
	//   32   62:bipush          10
	//   33   64:invokeinterface #113 <Method void ExtractorInput.peekFully(byte[], int, int)>
				psPacketBuffer.setPosition(0);
	//   34   69:aload_0         
	//   35   70:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   36   73:iconst_0        
	//   37   74:invokevirtual   #106 <Method void ParsableByteArray.setPosition(int)>
				psPacketBuffer.skipBytes(9);
	//   38   77:aload_0         
	//   39   78:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   40   81:bipush          9
	//   41   83:invokevirtual   #116 <Method void ParsableByteArray.skipBytes(int)>
				extractorinput.skipFully((psPacketBuffer.readUnsignedByte() & 7) + 14);
	//   42   86:aload_1         
	//   43   87:aload_0         
	//   44   88:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   45   91:invokevirtual   #119 <Method int ParsableByteArray.readUnsignedByte()>
	//   46   94:bipush          7
	//   47   96:iand            
	//   48   97:bipush          14
	//   49   99:iadd            
	//   50  100:invokeinterface #122 <Method void ExtractorInput.skipFully(int)>
				return 0;
	//   51  105:iconst_0        
	//   52  106:ireturn         
			}
			if(i == 443)
	//*  53  107:iload_3         
	//*  54  108:sipush          443
	//*  55  111:icmpne          155
			{
				extractorinput.peekFully(psPacketBuffer.data, 0, 2);
	//   56  114:aload_1         
	//   57  115:aload_0         
	//   58  116:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   59  119:getfield        #97  <Field byte[] ParsableByteArray.data>
	//   60  122:iconst_0        
	//   61  123:iconst_2        
	//   62  124:invokeinterface #113 <Method void ExtractorInput.peekFully(byte[], int, int)>
				psPacketBuffer.setPosition(0);
	//   63  129:aload_0         
	//   64  130:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   65  133:iconst_0        
	//   66  134:invokevirtual   #106 <Method void ParsableByteArray.setPosition(int)>
				extractorinput.skipFully(psPacketBuffer.readUnsignedShort() + 6);
	//   67  137:aload_1         
	//   68  138:aload_0         
	//   69  139:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//   70  142:invokevirtual   #125 <Method int ParsableByteArray.readUnsignedShort()>
	//   71  145:bipush          6
	//   72  147:iadd            
	//   73  148:invokeinterface #122 <Method void ExtractorInput.skipFully(int)>
				return 0;
	//   74  153:iconst_0        
	//   75  154:ireturn         
			}
			if((i & 0xffffff00) >> 8 != 1)
	//*  76  155:iload_3         
	//*  77  156:sipush          -256
	//*  78  159:iand            
	//*  79  160:bipush          8
	//*  80  162:ishr            
	//*  81  163:iconst_1        
	//*  82  164:icmpeq          176
			{
				extractorinput.skipFully(1);
	//   83  167:aload_1         
	//   84  168:iconst_1        
	//   85  169:invokeinterface #122 <Method void ExtractorInput.skipFully(int)>
				return 0;
	//   86  174:iconst_0        
	//   87  175:ireturn         
			}
			i &= 0xff;
	//   88  176:iload_3         
	//   89  177:sipush          255
	//   90  180:iand            
	//   91  181:istore_3        
			PesReader pesreader1 = (PesReader)psPayloadReaders.get(i);
	//   92  182:aload_0         
	//   93  183:getfield        #71  <Field SparseArray psPayloadReaders>
	//   94  186:iload_3         
	//   95  187:invokevirtual   #129 <Method Object SparseArray.get(int)>
	//   96  190:checkcast       #8   <Class PsExtractor$PesReader>
	//   97  193:astore          5
			positionholder = ((PositionHolder) (pesreader1));
	//   98  195:aload           5
	//   99  197:astore_2        
			if(foundAllTracks)
				break label0;
	//  100  198:aload_0         
	//  101  199:getfield        #131 <Field boolean foundAllTracks>
	//  102  202:ifne            428
			PesReader pesreader = pesreader1;
	//  103  205:aload           5
	//  104  207:astore          4
			if(pesreader1 == null)
	//* 105  209:aload           5
	//* 106  211:ifnonnull       381
			{
				pesreader = null;
	//  107  214:aconst_null     
	//  108  215:astore          4
				if(!foundAudioTrack && i == 189)
	//* 109  217:aload_0         
	//* 110  218:getfield        #133 <Field boolean foundAudioTrack>
	//* 111  221:ifne            258
	//* 112  224:iload_3         
	//* 113  225:sipush          189
	//* 114  228:icmpne          258
				{
					positionholder = ((PositionHolder) (new Ac3Reader(output.track(i), false)));
	//  115  231:new             #135 <Class Ac3Reader>
	//  116  234:dup             
	//  117  235:aload_0         
	//  118  236:getfield        #75  <Field ExtractorOutput output>
	//  119  239:iload_3         
	//  120  240:invokeinterface #139 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  121  245:iconst_0        
	//  122  246:invokespecial   #142 <Method void Ac3Reader(com.google.android.exoplayer.extractor.TrackOutput, boolean)>
	//  123  249:astore_2        
					foundAudioTrack = true;
	//  124  250:aload_0         
	//  125  251:iconst_1        
	//  126  252:putfield        #133 <Field boolean foundAudioTrack>
				} else
	//* 127  255:goto            349
				if(!foundAudioTrack && (i & 0xe0) == 192)
	//* 128  258:aload_0         
	//* 129  259:getfield        #133 <Field boolean foundAudioTrack>
	//* 130  262:ifne            302
	//* 131  265:iload_3         
	//* 132  266:sipush          224
	//* 133  269:iand            
	//* 134  270:sipush          192
	//* 135  273:icmpne          302
				{
					positionholder = ((PositionHolder) (new MpegAudioReader(output.track(i))));
	//  136  276:new             #144 <Class MpegAudioReader>
	//  137  279:dup             
	//  138  280:aload_0         
	//  139  281:getfield        #75  <Field ExtractorOutput output>
	//  140  284:iload_3         
	//  141  285:invokeinterface #139 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  142  290:invokespecial   #147 <Method void MpegAudioReader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  143  293:astore_2        
					foundAudioTrack = true;
	//  144  294:aload_0         
	//  145  295:iconst_1        
	//  146  296:putfield        #133 <Field boolean foundAudioTrack>
				} else
	//* 147  299:goto            349
				{
					positionholder = ((PositionHolder) (pesreader));
	//  148  302:aload           4
	//  149  304:astore_2        
					if(!foundVideoTrack)
	//* 150  305:aload_0         
	//* 151  306:getfield        #149 <Field boolean foundVideoTrack>
	//* 152  309:ifne            349
					{
						positionholder = ((PositionHolder) (pesreader));
	//  153  312:aload           4
	//  154  314:astore_2        
						if((i & 0xf0) == 224)
	//* 155  315:iload_3         
	//* 156  316:sipush          240
	//* 157  319:iand            
	//* 158  320:sipush          224
	//* 159  323:icmpne          349
						{
							positionholder = ((PositionHolder) (new H262Reader(output.track(i))));
	//  160  326:new             #151 <Class H262Reader>
	//  161  329:dup             
	//  162  330:aload_0         
	//  163  331:getfield        #75  <Field ExtractorOutput output>
	//  164  334:iload_3         
	//  165  335:invokeinterface #139 <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//  166  340:invokespecial   #152 <Method void H262Reader(com.google.android.exoplayer.extractor.TrackOutput)>
	//  167  343:astore_2        
							foundVideoTrack = true;
	//  168  344:aload_0         
	//  169  345:iconst_1        
	//  170  346:putfield        #149 <Field boolean foundVideoTrack>
						}
					}
				}
				pesreader = pesreader1;
	//  171  349:aload           5
	//  172  351:astore          4
				if(positionholder != null)
	//* 173  353:aload_2         
	//* 174  354:ifnull          381
				{
					pesreader = new PesReader(((ElementaryStreamReader) (positionholder)), ptsTimestampAdjuster);
	//  175  357:new             #8   <Class PsExtractor$PesReader>
	//  176  360:dup             
	//  177  361:aload_2         
	//  178  362:aload_0         
	//  179  363:getfield        #59  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//  180  366:invokespecial   #155 <Method void PsExtractor$PesReader(ElementaryStreamReader, PtsTimestampAdjuster)>
	//  181  369:astore          4
					psPayloadReaders.put(i, ((Object) (pesreader)));
	//  182  371:aload_0         
	//  183  372:getfield        #71  <Field SparseArray psPayloadReaders>
	//  184  375:iload_3         
	//  185  376:aload           4
	//  186  378:invokevirtual   #159 <Method void SparseArray.put(int, Object)>
				}
			}
			if(!foundAudioTrack || !foundVideoTrack)
	//* 187  381:aload_0         
	//* 188  382:getfield        #133 <Field boolean foundAudioTrack>
	//* 189  385:ifeq            395
	//* 190  388:aload_0         
	//* 191  389:getfield        #149 <Field boolean foundVideoTrack>
	//* 192  392:ifne            411
			{
				positionholder = ((PositionHolder) (pesreader));
	//  193  395:aload           4
	//  194  397:astore_2        
				if(extractorinput.getPosition() <= 0x100000L)
					break label0;
	//  195  398:aload_1         
	//  196  399:invokeinterface #163 <Method long ExtractorInput.getPosition()>
	//  197  404:ldc2w           #17  <Long 0x100000L>
	//  198  407:lcmp            
	//  199  408:ifle            428
			}
			foundAllTracks = true;
	//  200  411:aload_0         
	//  201  412:iconst_1        
	//  202  413:putfield        #131 <Field boolean foundAllTracks>
			output.endTracks();
	//  203  416:aload_0         
	//  204  417:getfield        #75  <Field ExtractorOutput output>
	//  205  420:invokeinterface #166 <Method void ExtractorOutput.endTracks()>
			positionholder = ((PositionHolder) (pesreader));
	//  206  425:aload           4
	//  207  427:astore_2        
		}
		extractorinput.peekFully(psPacketBuffer.data, 0, 2);
	//  208  428:aload_1         
	//  209  429:aload_0         
	//  210  430:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  211  433:getfield        #97  <Field byte[] ParsableByteArray.data>
	//  212  436:iconst_0        
	//  213  437:iconst_2        
	//  214  438:invokeinterface #113 <Method void ExtractorInput.peekFully(byte[], int, int)>
		psPacketBuffer.setPosition(0);
	//  215  443:aload_0         
	//  216  444:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  217  447:iconst_0        
	//  218  448:invokevirtual   #106 <Method void ParsableByteArray.setPosition(int)>
		int j = psPacketBuffer.readUnsignedShort() + 6;
	//  219  451:aload_0         
	//  220  452:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  221  455:invokevirtual   #125 <Method int ParsableByteArray.readUnsignedShort()>
	//  222  458:bipush          6
	//  223  460:iadd            
	//  224  461:istore_3        
		if(positionholder == null)
	//* 225  462:aload_2         
	//* 226  463:ifnonnull       475
		{
			extractorinput.skipFully(j);
	//  227  466:aload_1         
	//  228  467:iload_3         
	//  229  468:invokeinterface #122 <Method void ExtractorInput.skipFully(int)>
			return 0;
	//  230  473:iconst_0        
	//  231  474:ireturn         
		}
		if(psPacketBuffer.capacity() < j)
	//* 232  475:aload_0         
	//* 233  476:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//* 234  479:invokevirtual   #169 <Method int ParsableByteArray.capacity()>
	//* 235  482:iload_3         
	//* 236  483:icmpge          497
			psPacketBuffer.reset(new byte[j], j);
	//  237  486:aload_0         
	//  238  487:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  239  490:iload_3         
	//  240  491:newarray        byte[]
	//  241  493:iload_3         
	//  242  494:invokevirtual   #173 <Method void ParsableByteArray.reset(byte[], int)>
		extractorinput.readFully(psPacketBuffer.data, 0, j);
	//  243  497:aload_1         
	//  244  498:aload_0         
	//  245  499:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  246  502:getfield        #97  <Field byte[] ParsableByteArray.data>
	//  247  505:iconst_0        
	//  248  506:iload_3         
	//  249  507:invokeinterface #176 <Method void ExtractorInput.readFully(byte[], int, int)>
		psPacketBuffer.setPosition(6);
	//  250  512:aload_0         
	//  251  513:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  252  516:bipush          6
	//  253  518:invokevirtual   #106 <Method void ParsableByteArray.setPosition(int)>
		psPacketBuffer.setLimit(j);
	//  254  521:aload_0         
	//  255  522:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  256  525:iload_3         
	//  257  526:invokevirtual   #179 <Method void ParsableByteArray.setLimit(int)>
		((PesReader) (positionholder)).consume(psPacketBuffer, output);
	//  258  529:aload_2         
	//  259  530:aload_0         
	//  260  531:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  261  534:aload_0         
	//  262  535:getfield        #75  <Field ExtractorOutput output>
	//  263  538:invokevirtual   #183 <Method void PsExtractor$PesReader.consume(ParsableByteArray, ExtractorOutput)>
		extractorinput = ((ExtractorInput) (psPacketBuffer));
	//  264  541:aload_0         
	//  265  542:getfield        #66  <Field ParsableByteArray psPacketBuffer>
	//  266  545:astore_1        
		((ParsableByteArray) (extractorinput)).setLimit(((ParsableByteArray) (extractorinput)).capacity());
	//  267  546:aload_1         
	//  268  547:aload_1         
	//  269  548:invokevirtual   #169 <Method int ParsableByteArray.capacity()>
	//  270  551:invokevirtual   #179 <Method void ParsableByteArray.setLimit(int)>
		return 0;
	//  271  554:iconst_0        
	//  272  555:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		ptsTimestampAdjuster.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field PtsTimestampAdjuster ptsTimestampAdjuster>
	//    2    4:invokevirtual   #188 <Method void PtsTimestampAdjuster.reset()>
		for(int i = 0; i < psPayloadReaders.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #71  <Field SparseArray psPayloadReaders>
	//*   8   14:invokevirtual   #191 <Method int SparseArray.size()>
	//*   9   17:icmpge          41
			((PesReader)psPayloadReaders.valueAt(i)).seek();
	//   10   20:aload_0         
	//   11   21:getfield        #71  <Field SparseArray psPayloadReaders>
	//   12   24:iload_1         
	//   13   25:invokevirtual   #194 <Method Object SparseArray.valueAt(int)>
	//   14   28:checkcast       #8   <Class PsExtractor$PesReader>
	//   15   31:invokevirtual   #196 <Method void PsExtractor$PesReader.seek()>

	//   16   34:iload_1         
	//   17   35:iconst_1        
	//   18   36:iadd            
	//   19   37:istore_1        
	//*  20   38:goto            9
	//   21   41:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		byte abyte0[] = new byte[14];
	//    0    0:bipush          14
	//    1    2:newarray        byte[]
	//    2    4:astore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		extractorinput.peekFully(abyte0, 0, 14);
	//    5    7:aload_1         
	//    6    8:aload_3         
	//    7    9:iconst_0        
	//    8   10:bipush          14
	//    9   12:invokeinterface #113 <Method void ExtractorInput.peekFully(byte[], int, int)>
		if(442 != ((abyte0[0] & 0xff) << 24 | (abyte0[1] & 0xff) << 16 | (abyte0[2] & 0xff) << 8 | abyte0[3] & 0xff))
	//*  10   17:sipush          442
	//*  11   20:aload_3         
	//*  12   21:iconst_0        
	//*  13   22:baload          
	//*  14   23:sipush          255
	//*  15   26:iand            
	//*  16   27:bipush          24
	//*  17   29:ishl            
	//*  18   30:aload_3         
	//*  19   31:iconst_1        
	//*  20   32:baload          
	//*  21   33:sipush          255
	//*  22   36:iand            
	//*  23   37:bipush          16
	//*  24   39:ishl            
	//*  25   40:ior             
	//*  26   41:aload_3         
	//*  27   42:iconst_2        
	//*  28   43:baload          
	//*  29   44:sipush          255
	//*  30   47:iand            
	//*  31   48:bipush          8
	//*  32   50:ishl            
	//*  33   51:ior             
	//*  34   52:aload_3         
	//*  35   53:iconst_3        
	//*  36   54:baload          
	//*  37   55:sipush          255
	//*  38   58:iand            
	//*  39   59:ior             
	//*  40   60:icmpeq          65
			return false;
	//   41   63:iconst_0        
	//   42   64:ireturn         
		if((abyte0[4] & 0xc4) != 68)
	//*  43   65:aload_3         
	//*  44   66:iconst_4        
	//*  45   67:baload          
	//*  46   68:sipush          196
	//*  47   71:iand            
	//*  48   72:bipush          68
	//*  49   74:icmpeq          79
			return false;
	//   50   77:iconst_0        
	//   51   78:ireturn         
		if((abyte0[6] & 4) != 4)
	//*  52   79:aload_3         
	//*  53   80:bipush          6
	//*  54   82:baload          
	//*  55   83:iconst_4        
	//*  56   84:iand            
	//*  57   85:iconst_4        
	//*  58   86:icmpeq          91
			return false;
	//   59   89:iconst_0        
	//   60   90:ireturn         
		if((abyte0[8] & 4) != 4)
	//*  61   91:aload_3         
	//*  62   92:bipush          8
	//*  63   94:baload          
	//*  64   95:iconst_4        
	//*  65   96:iand            
	//*  66   97:iconst_4        
	//*  67   98:icmpeq          103
			return false;
	//   68  101:iconst_0        
	//   69  102:ireturn         
		if((abyte0[9] & 1) != 1)
	//*  70  103:aload_3         
	//*  71  104:bipush          9
	//*  72  106:baload          
	//*  73  107:iconst_1        
	//*  74  108:iand            
	//*  75  109:iconst_1        
	//*  76  110:icmpeq          115
			return false;
	//   77  113:iconst_0        
	//   78  114:ireturn         
		if((abyte0[12] & 3) != 3)
	//*  79  115:aload_3         
	//*  80  116:bipush          12
	//*  81  118:baload          
	//*  82  119:iconst_3        
	//*  83  120:iand            
	//*  84  121:iconst_3        
	//*  85  122:icmpeq          127
			return false;
	//   86  125:iconst_0        
	//   87  126:ireturn         
		extractorinput.advancePeekPosition(abyte0[13] & 7);
	//   88  127:aload_1         
	//   89  128:aload_3         
	//   90  129:bipush          13
	//   91  131:baload          
	//   92  132:bipush          7
	//   93  134:iand            
	//   94  135:invokeinterface #201 <Method void ExtractorInput.advancePeekPosition(int)>
		extractorinput.peekFully(abyte0, 0, 3);
	//   95  140:aload_1         
	//   96  141:aload_3         
	//   97  142:iconst_0        
	//   98  143:iconst_3        
	//   99  144:invokeinterface #113 <Method void ExtractorInput.peekFully(byte[], int, int)>
		if(1 == ((abyte0[0] & 0xff) << 16 | (abyte0[1] & 0xff) << 8 | abyte0[2] & 0xff))
	//* 100  149:iconst_1        
	//* 101  150:aload_3         
	//* 102  151:iconst_0        
	//* 103  152:baload          
	//* 104  153:sipush          255
	//* 105  156:iand            
	//* 106  157:bipush          16
	//* 107  159:ishl            
	//* 108  160:aload_3         
	//* 109  161:iconst_1        
	//* 110  162:baload          
	//* 111  163:sipush          255
	//* 112  166:iand            
	//* 113  167:bipush          8
	//* 114  169:ishl            
	//* 115  170:ior             
	//* 116  171:aload_3         
	//* 117  172:iconst_2        
	//* 118  173:baload          
	//* 119  174:sipush          255
	//* 120  177:iand            
	//* 121  178:ior             
	//* 122  179:icmpne          184
			flag = true;
	//  123  182:iconst_1        
	//  124  183:istore_2        
		return flag;
	//  125  184:iload_2         
	//  126  185:ireturn         
	}

	public static final int AUDIO_STREAM = 192;
	public static final int AUDIO_STREAM_MASK = 224;
	private static final long MAX_SEARCH_LENGTH = 0x100000L;
	private static final int MPEG_PROGRAM_END_CODE = 441;
	private static final int PACKET_START_CODE_PREFIX = 1;
	private static final int PACK_START_CODE = 442;
	public static final int PRIVATE_STREAM_1 = 189;
	private static final int SYSTEM_HEADER_START_CODE = 443;
	public static final int VIDEO_STREAM = 224;
	public static final int VIDEO_STREAM_MASK = 240;
	private boolean foundAllTracks;
	private boolean foundAudioTrack;
	private boolean foundVideoTrack;
	private ExtractorOutput output;
	private final ParsableByteArray psPacketBuffer;
	private final SparseArray psPayloadReaders;
	private final PtsTimestampAdjuster ptsTimestampAdjuster;
}
