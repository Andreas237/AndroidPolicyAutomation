// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			Ac3Reader, MpegAudioReader, H262Reader, ElementaryStreamReader

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
					timestampAdjuster.adjustTsTimestamp(l3 << 30 | l4 | l5);
		//   84  164:aload_0         
		//   85  165:getfield        #32  <Field TimestampAdjuster timestampAdjuster>
		//   86  168:lload           7
		//   87  170:bipush          30
		//   88  172:lshl            
		//   89  173:lload           9
		//   90  175:lor             
		//   91  176:lload           11
		//   92  178:lor             
		//   93  179:invokevirtual   #70  <Method long TimestampAdjuster.adjustTsTimestamp(long)>
		//   94  182:pop2            
					seenFirstDts = true;
		//   95  183:aload_0         
		//   96  184:iconst_1        
		//   97  185:putfield        #64  <Field boolean seenFirstDts>
				}
				timeUs = timestampAdjuster.adjustTsTimestamp(l << 30 | l1 | l2);
		//   98  188:aload_0         
		//   99  189:aload_0         
		//  100  190:getfield        #32  <Field TimestampAdjuster timestampAdjuster>
		//  101  193:lload_1         
		//  102  194:bipush          30
		//  103  196:lshl            
		//  104  197:lload_3         
		//  105  198:lor             
		//  106  199:lload           5
		//  107  201:lor             
		//  108  202:invokevirtual   #70  <Method long TimestampAdjuster.adjustTsTimestamp(long)>
		//  109  205:putfield        #62  <Field long timeUs>
			}
		//  110  208:return          
		}

		public void consume(ParsableByteArray parsablebytearray)
			throws ParserException
		{
			parsablebytearray.readBytes(pesScratch.data, 0, 3);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #39  <Field ParsableBitArray pesScratch>
		//    3    5:getfield        #78  <Field byte[] ParsableBitArray.data>
		//    4    8:iconst_0        
		//    5    9:iconst_3        
		//    6   10:invokevirtual   #84  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			pesScratch.setPosition(0);
		//    7   13:aload_0         
		//    8   14:getfield        #39  <Field ParsableBitArray pesScratch>
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #87  <Method void ParsableBitArray.setPosition(int)>
			parseHeader();
		//   11   21:aload_0         
		//   12   22:invokespecial   #89  <Method void parseHeader()>
			parsablebytearray.readBytes(pesScratch.data, 0, extendedHeaderLength);
		//   13   25:aload_1         
		//   14   26:aload_0         
		//   15   27:getfield        #39  <Field ParsableBitArray pesScratch>
		//   16   30:getfield        #78  <Field byte[] ParsableBitArray.data>
		//   17   33:iconst_0        
		//   18   34:aload_0         
		//   19   35:getfield        #59  <Field int extendedHeaderLength>
		//   20   38:invokevirtual   #84  <Method void ParsableByteArray.readBytes(byte[], int, int)>
			pesScratch.setPosition(0);
		//   21   41:aload_0         
		//   22   42:getfield        #39  <Field ParsableBitArray pesScratch>
		//   23   45:iconst_0        
		//   24   46:invokevirtual   #87  <Method void ParsableBitArray.setPosition(int)>
			parseHeaderExtension();
		//   25   49:aload_0         
		//   26   50:invokespecial   #91  <Method void parseHeaderExtension()>
			pesPayloadReader.packetStarted(timeUs, true);
		//   27   53:aload_0         
		//   28   54:getfield        #30  <Field ElementaryStreamReader pesPayloadReader>
		//   29   57:aload_0         
		//   30   58:getfield        #62  <Field long timeUs>
		//   31   61:iconst_1        
		//   32   62:invokeinterface #97  <Method void ElementaryStreamReader.packetStarted(long, boolean)>
			pesPayloadReader.consume(parsablebytearray);
		//   33   67:aload_0         
		//   34   68:getfield        #30  <Field ElementaryStreamReader pesPayloadReader>
		//   35   71:aload_1         
		//   36   72:invokeinterface #99  <Method void ElementaryStreamReader.consume(ParsableByteArray)>
			pesPayloadReader.packetFinished();
		//   37   77:aload_0         
		//   38   78:getfield        #30  <Field ElementaryStreamReader pesPayloadReader>
		//   39   81:invokeinterface #102 <Method void ElementaryStreamReader.packetFinished()>
		//   40   86:return          
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
		//    5    9:invokeinterface #106 <Method void ElementaryStreamReader.seek()>
		//    6   14:return          
		}

		private static final int PES_SCRATCH_SIZE = 64;
		private boolean dtsFlag;
		private int extendedHeaderLength;
		private final ElementaryStreamReader pesPayloadReader;
		private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[64]);
		private boolean ptsFlag;
		private boolean seenFirstDts;
		private long timeUs;
		private final TimestampAdjuster timestampAdjuster;

		public PesReader(ElementaryStreamReader elementarystreamreader, TimestampAdjuster timestampadjuster)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			pesPayloadReader = elementarystreamreader;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field ElementaryStreamReader pesPayloadReader>
			timestampAdjuster = timestampadjuster;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #32  <Field TimestampAdjuster timestampAdjuster>
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
		this(new TimestampAdjuster(0L));
	//    0    0:aload_0         
	//    1    1:new             #64  <Class TimestampAdjuster>
	//    2    4:dup             
	//    3    5:lconst_0        
	//    4    6:invokespecial   #67  <Method void TimestampAdjuster(long)>
	//    5    9:invokespecial   #70  <Method void PsExtractor(TimestampAdjuster)>
	//    6   12:return          
	}

	public PsExtractor(TimestampAdjuster timestampadjuster)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
		timestampAdjuster = timestampadjuster;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #73  <Field TimestampAdjuster timestampAdjuster>
		psPacketBuffer = new ParsableByteArray(4096);
	//    5    9:aload_0         
	//    6   10:new             #75  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:sipush          4096
	//    9   17:invokespecial   #78  <Method void ParsableByteArray(int)>
	//   10   20:putfield        #80  <Field ParsableByteArray psPacketBuffer>
		psPayloadReaders = new SparseArray();
	//   11   23:aload_0         
	//   12   24:new             #82  <Class SparseArray>
	//   13   27:dup             
	//   14   28:invokespecial   #83  <Method void SparseArray()>
	//   15   31:putfield        #85  <Field SparseArray psPayloadReaders>
	//   16   34:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		output = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field ExtractorOutput output>
		extractoroutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L))));
	//    3    5:aload_1         
	//    4    6:new             #91  <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//    5    9:dup             
	//    6   10:ldc2w           #92  <Long 0x1L>
	//    7   13:invokespecial   #94  <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//    8   16:invokeinterface #100 <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
	//    9   21:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(!extractorinput.peekFully(psPacketBuffer.data, 0, 4, true))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//*   3    5:getfield        #110 <Field byte[] ParsableByteArray.data>
	//*   4    8:iconst_0        
	//*   5    9:iconst_4        
	//*   6   10:iconst_1        
	//*   7   11:invokeinterface #116 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*   8   16:ifne            21
			return -1;
	//    9   19:iconst_m1       
	//   10   20:ireturn         
		psPacketBuffer.setPosition(0);
	//   11   21:aload_0         
	//   12   22:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #119 <Method void ParsableByteArray.setPosition(int)>
		int i = psPacketBuffer.readInt();
	//   15   29:aload_0         
	//   16   30:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   17   33:invokevirtual   #123 <Method int ParsableByteArray.readInt()>
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
	//*  26   50:icmpne          99
		{
			extractorinput.peekFully(psPacketBuffer.data, 0, 10);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   30   58:getfield        #110 <Field byte[] ParsableByteArray.data>
	//   31   61:iconst_0        
	//   32   62:bipush          10
	//   33   64:invokeinterface #126 <Method void ExtractorInput.peekFully(byte[], int, int)>
			psPacketBuffer.setPosition(9);
	//   34   69:aload_0         
	//   35   70:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   36   73:bipush          9
	//   37   75:invokevirtual   #119 <Method void ParsableByteArray.setPosition(int)>
			extractorinput.skipFully((psPacketBuffer.readUnsignedByte() & 7) + 14);
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   41   83:invokevirtual   #129 <Method int ParsableByteArray.readUnsignedByte()>
	//   42   86:bipush          7
	//   43   88:iand            
	//   44   89:bipush          14
	//   45   91:iadd            
	//   46   92:invokeinterface #132 <Method void ExtractorInput.skipFully(int)>
			return 0;
	//   47   97:iconst_0        
	//   48   98:ireturn         
		}
		if(i == 443)
	//*  49   99:iload_3         
	//*  50  100:sipush          443
	//*  51  103:icmpne          147
		{
			extractorinput.peekFully(psPacketBuffer.data, 0, 2);
	//   52  106:aload_1         
	//   53  107:aload_0         
	//   54  108:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   55  111:getfield        #110 <Field byte[] ParsableByteArray.data>
	//   56  114:iconst_0        
	//   57  115:iconst_2        
	//   58  116:invokeinterface #126 <Method void ExtractorInput.peekFully(byte[], int, int)>
			psPacketBuffer.setPosition(0);
	//   59  121:aload_0         
	//   60  122:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   61  125:iconst_0        
	//   62  126:invokevirtual   #119 <Method void ParsableByteArray.setPosition(int)>
			extractorinput.skipFully(psPacketBuffer.readUnsignedShort() + 6);
	//   63  129:aload_1         
	//   64  130:aload_0         
	//   65  131:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//   66  134:invokevirtual   #135 <Method int ParsableByteArray.readUnsignedShort()>
	//   67  137:bipush          6
	//   68  139:iadd            
	//   69  140:invokeinterface #132 <Method void ExtractorInput.skipFully(int)>
			return 0;
	//   70  145:iconst_0        
	//   71  146:ireturn         
		}
		if((i & 0xffffff00) >> 8 != 1)
	//*  72  147:iload_3         
	//*  73  148:sipush          -256
	//*  74  151:iand            
	//*  75  152:bipush          8
	//*  76  154:ishr            
	//*  77  155:iconst_1        
	//*  78  156:icmpeq          168
		{
			extractorinput.skipFully(1);
	//   79  159:aload_1         
	//   80  160:iconst_1        
	//   81  161:invokeinterface #132 <Method void ExtractorInput.skipFully(int)>
			return 0;
	//   82  166:iconst_0        
	//   83  167:ireturn         
		}
		i &= 0xff;
	//   84  168:iload_3         
	//   85  169:sipush          255
	//   86  172:iand            
	//   87  173:istore_3        
		PesReader pesreader = (PesReader)psPayloadReaders.get(i);
	//   88  174:aload_0         
	//   89  175:getfield        #85  <Field SparseArray psPayloadReaders>
	//   90  178:iload_3         
	//   91  179:invokevirtual   #139 <Method Object SparseArray.get(int)>
	//   92  182:checkcast       #10  <Class PsExtractor$PesReader>
	//   93  185:astore          7
		positionholder = ((PositionHolder) (pesreader));
	//   94  187:aload           7
	//   95  189:astore_2        
		if(!foundAllTracks)
	//*  96  190:aload_0         
	//*  97  191:getfield        #141 <Field boolean foundAllTracks>
	//*  98  194:ifne            433
		{
			Object obj = ((Object) (pesreader));
	//   99  197:aload           7
	//  100  199:astore          6
			if(pesreader == null)
	//* 101  201:aload           7
	//* 102  203:ifnonnull       369
			{
				positionholder = null;
	//  103  206:aconst_null     
	//  104  207:astore_2        
				if(i == 189)
	//* 105  208:iload_3         
	//* 106  209:sipush          189
	//* 107  212:icmpne          241
				{
					positionholder = ((PositionHolder) (new Ac3Reader()));
	//  108  215:new             #143 <Class Ac3Reader>
	//  109  218:dup             
	//  110  219:invokespecial   #144 <Method void Ac3Reader()>
	//  111  222:astore_2        
					foundAudioTrack = true;
	//  112  223:aload_0         
	//  113  224:iconst_1        
	//  114  225:putfield        #146 <Field boolean foundAudioTrack>
					lastTrackPosition = extractorinput.getPosition();
	//  115  228:aload_0         
	//  116  229:aload_1         
	//  117  230:invokeinterface #150 <Method long ExtractorInput.getPosition()>
	//  118  235:putfield        #152 <Field long lastTrackPosition>
				} else
	//* 119  238:goto            312
				if((i & 0xe0) == 192)
	//* 120  241:iload_3         
	//* 121  242:sipush          224
	//* 122  245:iand            
	//* 123  246:sipush          192
	//* 124  249:icmpne          278
				{
					positionholder = ((PositionHolder) (new MpegAudioReader()));
	//  125  252:new             #154 <Class MpegAudioReader>
	//  126  255:dup             
	//  127  256:invokespecial   #155 <Method void MpegAudioReader()>
	//  128  259:astore_2        
					foundAudioTrack = true;
	//  129  260:aload_0         
	//  130  261:iconst_1        
	//  131  262:putfield        #146 <Field boolean foundAudioTrack>
					lastTrackPosition = extractorinput.getPosition();
	//  132  265:aload_0         
	//  133  266:aload_1         
	//  134  267:invokeinterface #150 <Method long ExtractorInput.getPosition()>
	//  135  272:putfield        #152 <Field long lastTrackPosition>
				} else
	//* 136  275:goto            312
				if((i & 0xf0) == 224)
	//* 137  278:iload_3         
	//* 138  279:sipush          240
	//* 139  282:iand            
	//* 140  283:sipush          224
	//* 141  286:icmpne          312
				{
					positionholder = ((PositionHolder) (new H262Reader()));
	//  142  289:new             #157 <Class H262Reader>
	//  143  292:dup             
	//  144  293:invokespecial   #158 <Method void H262Reader()>
	//  145  296:astore_2        
					foundVideoTrack = true;
	//  146  297:aload_0         
	//  147  298:iconst_1        
	//  148  299:putfield        #160 <Field boolean foundVideoTrack>
					lastTrackPosition = extractorinput.getPosition();
	//  149  302:aload_0         
	//  150  303:aload_1         
	//  151  304:invokeinterface #150 <Method long ExtractorInput.getPosition()>
	//  152  309:putfield        #152 <Field long lastTrackPosition>
				}
				obj = ((Object) (pesreader));
	//  153  312:aload           7
	//  154  314:astore          6
				if(positionholder != null)
	//* 155  316:aload_2         
	//* 156  317:ifnull          369
				{
					obj = ((Object) (new TsPayloadReader.TrackIdGenerator(i, 256)));
	//  157  320:new             #162 <Class TsPayloadReader$TrackIdGenerator>
	//  158  323:dup             
	//  159  324:iload_3         
	//  160  325:sipush          256
	//  161  328:invokespecial   #165 <Method void TsPayloadReader$TrackIdGenerator(int, int)>
	//  162  331:astore          6
					((ElementaryStreamReader) (positionholder)).createTracks(output, ((TsPayloadReader.TrackIdGenerator) (obj)));
	//  163  333:aload_2         
	//  164  334:aload_0         
	//  165  335:getfield        #89  <Field ExtractorOutput output>
	//  166  338:aload           6
	//  167  340:invokeinterface #171 <Method void ElementaryStreamReader.createTracks(ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
					obj = ((Object) (new PesReader(((ElementaryStreamReader) (positionholder)), timestampAdjuster)));
	//  168  345:new             #10  <Class PsExtractor$PesReader>
	//  169  348:dup             
	//  170  349:aload_2         
	//  171  350:aload_0         
	//  172  351:getfield        #73  <Field TimestampAdjuster timestampAdjuster>
	//  173  354:invokespecial   #174 <Method void PsExtractor$PesReader(ElementaryStreamReader, TimestampAdjuster)>
	//  174  357:astore          6
					psPayloadReaders.put(i, obj);
	//  175  359:aload_0         
	//  176  360:getfield        #85  <Field SparseArray psPayloadReaders>
	//  177  363:iload_3         
	//  178  364:aload           6
	//  179  366:invokevirtual   #178 <Method void SparseArray.put(int, Object)>
				}
			}
			long l;
			if(foundAudioTrack && foundVideoTrack)
	//* 180  369:aload_0         
	//* 181  370:getfield        #146 <Field boolean foundAudioTrack>
	//* 182  373:ifeq            396
	//* 183  376:aload_0         
	//* 184  377:getfield        #160 <Field boolean foundVideoTrack>
	//* 185  380:ifeq            396
				l = lastTrackPosition + 8192L;
	//  186  383:aload_0         
	//  187  384:getfield        #152 <Field long lastTrackPosition>
	//  188  387:ldc2w           #24  <Long 8192L>
	//  189  390:ladd            
	//  190  391:lstore          4
			else
	//* 191  393:goto            401
				l = 0x100000L;
	//  192  396:ldc2w           #21  <Long 0x100000L>
	//  193  399:lstore          4
			positionholder = ((PositionHolder) (obj));
	//  194  401:aload           6
	//  195  403:astore_2        
			if(extractorinput.getPosition() > l)
	//* 196  404:aload_1         
	//* 197  405:invokeinterface #150 <Method long ExtractorInput.getPosition()>
	//* 198  410:lload           4
	//* 199  412:lcmp            
	//* 200  413:ifle            433
			{
				foundAllTracks = true;
	//  201  416:aload_0         
	//  202  417:iconst_1        
	//  203  418:putfield        #141 <Field boolean foundAllTracks>
				output.endTracks();
	//  204  421:aload_0         
	//  205  422:getfield        #89  <Field ExtractorOutput output>
	//  206  425:invokeinterface #181 <Method void ExtractorOutput.endTracks()>
				positionholder = ((PositionHolder) (obj));
	//  207  430:aload           6
	//  208  432:astore_2        
			}
		}
		extractorinput.peekFully(psPacketBuffer.data, 0, 2);
	//  209  433:aload_1         
	//  210  434:aload_0         
	//  211  435:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  212  438:getfield        #110 <Field byte[] ParsableByteArray.data>
	//  213  441:iconst_0        
	//  214  442:iconst_2        
	//  215  443:invokeinterface #126 <Method void ExtractorInput.peekFully(byte[], int, int)>
		psPacketBuffer.setPosition(0);
	//  216  448:aload_0         
	//  217  449:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  218  452:iconst_0        
	//  219  453:invokevirtual   #119 <Method void ParsableByteArray.setPosition(int)>
		i = psPacketBuffer.readUnsignedShort() + 6;
	//  220  456:aload_0         
	//  221  457:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  222  460:invokevirtual   #135 <Method int ParsableByteArray.readUnsignedShort()>
	//  223  463:bipush          6
	//  224  465:iadd            
	//  225  466:istore_3        
		if(positionholder == null)
	//* 226  467:aload_2         
	//* 227  468:ifnonnull       480
		{
			extractorinput.skipFully(i);
	//  228  471:aload_1         
	//  229  472:iload_3         
	//  230  473:invokeinterface #132 <Method void ExtractorInput.skipFully(int)>
			return 0;
	//  231  478:iconst_0        
	//  232  479:ireturn         
		} else
		{
			psPacketBuffer.reset(i);
	//  233  480:aload_0         
	//  234  481:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  235  484:iload_3         
	//  236  485:invokevirtual   #184 <Method void ParsableByteArray.reset(int)>
			extractorinput.readFully(psPacketBuffer.data, 0, i);
	//  237  488:aload_1         
	//  238  489:aload_0         
	//  239  490:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  240  493:getfield        #110 <Field byte[] ParsableByteArray.data>
	//  241  496:iconst_0        
	//  242  497:iload_3         
	//  243  498:invokeinterface #187 <Method void ExtractorInput.readFully(byte[], int, int)>
			psPacketBuffer.setPosition(6);
	//  244  503:aload_0         
	//  245  504:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  246  507:bipush          6
	//  247  509:invokevirtual   #119 <Method void ParsableByteArray.setPosition(int)>
			((PesReader) (positionholder)).consume(psPacketBuffer);
	//  248  512:aload_2         
	//  249  513:aload_0         
	//  250  514:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  251  517:invokevirtual   #191 <Method void PsExtractor$PesReader.consume(ParsableByteArray)>
			psPacketBuffer.setLimit(psPacketBuffer.capacity());
	//  252  520:aload_0         
	//  253  521:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  254  524:aload_0         
	//  255  525:getfield        #80  <Field ParsableByteArray psPacketBuffer>
	//  256  528:invokevirtual   #194 <Method int ParsableByteArray.capacity()>
	//  257  531:invokevirtual   #197 <Method void ParsableByteArray.setLimit(int)>
			return 0;
	//  258  534:iconst_0        
	//  259  535:ireturn         
		}
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		timestampAdjuster.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field TimestampAdjuster timestampAdjuster>
	//    2    4:invokevirtual   #203 <Method void TimestampAdjuster.reset()>
		for(int i = 0; i < psPayloadReaders.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore          5
	//*   5   10:iload           5
	//*   6   12:aload_0         
	//*   7   13:getfield        #85  <Field SparseArray psPayloadReaders>
	//*   8   16:invokevirtual   #206 <Method int SparseArray.size()>
	//*   9   19:icmpge          46
			((PesReader)psPayloadReaders.valueAt(i)).seek();
	//   10   22:aload_0         
	//   11   23:getfield        #85  <Field SparseArray psPayloadReaders>
	//   12   26:iload           5
	//   13   28:invokevirtual   #209 <Method Object SparseArray.valueAt(int)>
	//   14   31:checkcast       #10  <Class PsExtractor$PesReader>
	//   15   34:invokevirtual   #211 <Method void PsExtractor$PesReader.seek()>

	//   16   37:iload           5
	//   17   39:iconst_1        
	//   18   40:iadd            
	//   19   41:istore          5
	//*  20   43:goto            10
	//   21   46:return          
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
	//    9   12:invokeinterface #126 <Method void ExtractorInput.peekFully(byte[], int, int)>
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
	//   94  135:invokeinterface #216 <Method void ExtractorInput.advancePeekPosition(int)>
		extractorinput.peekFully(abyte0, 0, 3);
	//   95  140:aload_1         
	//   96  141:aload_3         
	//   97  142:iconst_0        
	//   98  143:iconst_3        
	//   99  144:invokeinterface #126 <Method void ExtractorInput.peekFully(byte[], int, int)>
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
	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new PsExtractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class PsExtractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void PsExtractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	private static final long MAX_SEARCH_LENGTH = 0x100000L;
	private static final long MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND = 8192L;
	private static final int MAX_STREAM_ID_PLUS_ONE = 256;
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
	private long lastTrackPosition;
	private ExtractorOutput output;
	private final ParsableByteArray psPacketBuffer;
	private final SparseArray psPayloadReaders;
	private final TimestampAdjuster timestampAdjuster;

	static 
	{
	//    0    0:new             #8   <Class PsExtractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void PsExtractor$1()>
	//    3    7:putstatic       #61  <Field ExtractorsFactory FACTORY>
	//*   4   10:return          
	}
}
