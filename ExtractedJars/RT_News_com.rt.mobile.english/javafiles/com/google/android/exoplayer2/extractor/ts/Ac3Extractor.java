// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			Ac3Reader

public final class Ac3Extractor
	implements Extractor
{

	public Ac3Extractor()
	{
		this(0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokespecial   #47  <Method void Ac3Extractor(long)>
	//    3    5:return          
	}

	public Ac3Extractor(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		firstSampleTimestampUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #50  <Field long firstSampleTimestampUs>
		reader = new Ac3Reader();
	//    5    9:aload_0         
	//    6   10:new             #52  <Class Ac3Reader>
	//    7   13:dup             
	//    8   14:invokespecial   #53  <Method void Ac3Reader()>
	//    9   17:putfield        #55  <Field Ac3Reader reader>
		sampleData = new ParsableByteArray(2786);
	//   10   20:aload_0         
	//   11   21:new             #57  <Class ParsableByteArray>
	//   12   24:dup             
	//   13   25:sipush          2786
	//   14   28:invokespecial   #60  <Method void ParsableByteArray(int)>
	//   15   31:putfield        #62  <Field ParsableByteArray sampleData>
	//   16   34:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		reader.createTracks(extractoroutput, new TsPayloadReader.TrackIdGenerator(0, 1));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Ac3Reader reader>
	//    2    4:aload_1         
	//    3    5:new             #66  <Class TsPayloadReader$TrackIdGenerator>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:iconst_1        
	//    7   11:invokespecial   #69  <Method void TsPayloadReader$TrackIdGenerator(int, int)>
	//    8   14:invokevirtual   #73  <Method void Ac3Reader.createTracks(ExtractorOutput, TsPayloadReader$TrackIdGenerator)>
		extractoroutput.endTracks();
	//    9   17:aload_1         
	//   10   18:invokeinterface #78  <Method void ExtractorOutput.endTracks()>
		extractoroutput.seekMap(((com.google.android.exoplayer2.extractor.SeekMap) (new com.google.android.exoplayer2.extractor.SeekMap.Unseekable(0x1L))));
	//   11   23:aload_1         
	//   12   24:new             #80  <Class com.google.android.exoplayer2.extractor.SeekMap$Unseekable>
	//   13   27:dup             
	//   14   28:ldc2w           #81  <Long 0x1L>
	//   15   31:invokespecial   #83  <Method void com.google.android.exoplayer2.extractor.SeekMap$Unseekable(long)>
	//   16   34:invokeinterface #87  <Method void ExtractorOutput.seekMap(com.google.android.exoplayer2.extractor.SeekMap)>
	//   17   39:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		int i = extractorinput.read(sampleData.data, 0, 2786);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #62  <Field ParsableByteArray sampleData>
	//    3    5:getfield        #97  <Field byte[] ParsableByteArray.data>
	//    4    8:iconst_0        
	//    5    9:sipush          2786
	//    6   12:invokeinterface #102 <Method int ExtractorInput.read(byte[], int, int)>
	//    7   17:istore_3        
		if(i == -1)
	//*   8   18:iload_3         
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          25
			return -1;
	//   11   23:iconst_m1       
	//   12   24:ireturn         
		sampleData.setPosition(0);
	//   13   25:aload_0         
	//   14   26:getfield        #62  <Field ParsableByteArray sampleData>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #105 <Method void ParsableByteArray.setPosition(int)>
		sampleData.setLimit(i);
	//   17   33:aload_0         
	//   18   34:getfield        #62  <Field ParsableByteArray sampleData>
	//   19   37:iload_3         
	//   20   38:invokevirtual   #108 <Method void ParsableByteArray.setLimit(int)>
		if(!startedPacket)
	//*  21   41:aload_0         
	//*  22   42:getfield        #110 <Field boolean startedPacket>
	//*  23   45:ifne            65
		{
			reader.packetStarted(firstSampleTimestampUs, true);
	//   24   48:aload_0         
	//   25   49:getfield        #55  <Field Ac3Reader reader>
	//   26   52:aload_0         
	//   27   53:getfield        #50  <Field long firstSampleTimestampUs>
	//   28   56:iconst_1        
	//   29   57:invokevirtual   #114 <Method void Ac3Reader.packetStarted(long, boolean)>
			startedPacket = true;
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:putfield        #110 <Field boolean startedPacket>
		}
		reader.consume(sampleData);
	//   33   65:aload_0         
	//   34   66:getfield        #55  <Field Ac3Reader reader>
	//   35   69:aload_0         
	//   36   70:getfield        #62  <Field ParsableByteArray sampleData>
	//   37   73:invokevirtual   #118 <Method void Ac3Reader.consume(ParsableByteArray)>
		return 0;
	//   38   76:iconst_0        
	//   39   77:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		startedPacket = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #110 <Field boolean startedPacket>
		reader.seek();
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field Ac3Reader reader>
	//    5    9:invokevirtual   #124 <Method void Ac3Reader.seek()>
	//    6   12:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		ParsableByteArray parsablebytearray = new ParsableByteArray(10);
	//    0    0:new             #57  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:bipush          10
	//    3    6:invokespecial   #60  <Method void ParsableByteArray(int)>
	//    4    9:astore          6
		int i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_2        
		do
		{
			extractorinput.peekFully(parsablebytearray.data, 0, 10);
	//    7   13:aload_1         
	//    8   14:aload           6
	//    9   16:getfield        #97  <Field byte[] ParsableByteArray.data>
	//   10   19:iconst_0        
	//   11   20:bipush          10
	//   12   22:invokeinterface #130 <Method void ExtractorInput.peekFully(byte[], int, int)>
			parsablebytearray.setPosition(0);
	//   13   27:aload           6
	//   14   29:iconst_0        
	//   15   30:invokevirtual   #105 <Method void ParsableByteArray.setPosition(int)>
			if(parsablebytearray.readUnsignedInt24() != ID3_TAG)
	//*  16   33:aload           6
	//*  17   35:invokevirtual   #134 <Method int ParsableByteArray.readUnsignedInt24()>
	//*  18   38:getstatic       #43  <Field int ID3_TAG>
	//*  19   41:icmpeq          171
			{
				extractorinput.resetPeekPosition();
	//   20   44:aload_1         
	//   21   45:invokeinterface #137 <Method void ExtractorInput.resetPeekPosition()>
				extractorinput.advancePeekPosition(i);
	//   22   50:aload_1         
	//   23   51:iload_2         
	//   24   52:invokeinterface #140 <Method void ExtractorInput.advancePeekPosition(int)>
				int j = 0;
	//   25   57:iconst_0        
	//   26   58:istore_3        
				int l = i;
	//   27   59:iload_2         
	//   28   60:istore          4
				do
				{
					extractorinput.peekFully(parsablebytearray.data, 0, 5);
	//   29   62:aload_1         
	//   30   63:aload           6
	//   31   65:getfield        #97  <Field byte[] ParsableByteArray.data>
	//   32   68:iconst_0        
	//   33   69:iconst_5        
	//   34   70:invokeinterface #130 <Method void ExtractorInput.peekFully(byte[], int, int)>
					parsablebytearray.setPosition(0);
	//   35   75:aload           6
	//   36   77:iconst_0        
	//   37   78:invokevirtual   #105 <Method void ParsableByteArray.setPosition(int)>
					if(parsablebytearray.readUnsignedShort() != 2935)
	//*  38   81:aload           6
	//*  39   83:invokevirtual   #143 <Method int ParsableByteArray.readUnsignedShort()>
	//*  40   86:sipush          2935
	//*  41   89:icmpeq          129
					{
						extractorinput.resetPeekPosition();
	//   42   92:aload_1         
	//   43   93:invokeinterface #137 <Method void ExtractorInput.resetPeekPosition()>
						l++;
	//   44   98:iload           4
	//   45  100:iconst_1        
	//   46  101:iadd            
	//   47  102:istore          4
						if(l - i >= 8192)
	//*  48  104:iload           4
	//*  49  106:iload_2         
	//*  50  107:isub            
	//*  51  108:sipush          8192
	//*  52  111:icmplt          116
							return false;
	//   53  114:iconst_0        
	//   54  115:ireturn         
						extractorinput.advancePeekPosition(l);
	//   55  116:aload_1         
	//   56  117:iload           4
	//   57  119:invokeinterface #140 <Method void ExtractorInput.advancePeekPosition(int)>
						j = 0;
	//   58  124:iconst_0        
	//   59  125:istore_3        
					} else
	//*  60  126:goto            62
					{
						j++;
	//   61  129:iload_3         
	//   62  130:iconst_1        
	//   63  131:iadd            
	//   64  132:istore_3        
						if(j >= 4)
	//*  65  133:iload_3         
	//*  66  134:iconst_4        
	//*  67  135:icmplt          140
							return true;
	//   68  138:iconst_1        
	//   69  139:ireturn         
						int i1 = Ac3Util.parseAc3SyncframeSize(parsablebytearray.data);
	//   70  140:aload           6
	//   71  142:getfield        #97  <Field byte[] ParsableByteArray.data>
	//   72  145:invokestatic    #149 <Method int Ac3Util.parseAc3SyncframeSize(byte[])>
	//   73  148:istore          5
						if(i1 == -1)
	//*  74  150:iload           5
	//*  75  152:iconst_m1       
	//*  76  153:icmpne          158
							return false;
	//   77  156:iconst_0        
	//   78  157:ireturn         
						extractorinput.advancePeekPosition(i1 - 5);
	//   79  158:aload_1         
	//   80  159:iload           5
	//   81  161:iconst_5        
	//   82  162:isub            
	//   83  163:invokeinterface #140 <Method void ExtractorInput.advancePeekPosition(int)>
					}
				} while(true);
	//   84  168:goto            62
			}
			parsablebytearray.skipBytes(3);
	//   85  171:aload           6
	//   86  173:iconst_3        
	//   87  174:invokevirtual   #152 <Method void ParsableByteArray.skipBytes(int)>
			int k = parsablebytearray.readSynchSafeInt();
	//   88  177:aload           6
	//   89  179:invokevirtual   #155 <Method int ParsableByteArray.readSynchSafeInt()>
	//   90  182:istore_3        
			i += 10 + k;
	//   91  183:iload_2         
	//   92  184:bipush          10
	//   93  186:iload_3         
	//   94  187:iadd            
	//   95  188:iadd            
	//   96  189:istore_2        
			extractorinput.advancePeekPosition(k);
	//   97  190:aload_1         
	//   98  191:iload_3         
	//   99  192:invokeinterface #140 <Method void ExtractorInput.advancePeekPosition(int)>
		} while(true);
	//  100  197:goto            13
	}

	private static final int AC3_SYNC_WORD = 2935;
	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new Ac3Extractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class Ac3Extractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void Ac3Extractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	private static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
	private static final int MAX_SNIFF_BYTES = 8192;
	private static final int MAX_SYNC_FRAME_SIZE = 2786;
	private final long firstSampleTimestampUs;
	private final Ac3Reader reader;
	private final ParsableByteArray sampleData;
	private boolean startedPacket;

	static 
	{
	//    0    0:new             #8   <Class Ac3Extractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void Ac3Extractor$1()>
	//    3    7:putstatic       #33  <Field ExtractorsFactory FACTORY>
	//    4   10:ldc1            #35  <String "ID3">
	//    5   12:invokestatic    #41  <Method int Util.getIntegerCodeForString(String)>
	//    6   15:putstatic       #43  <Field int ID3_TAG>
	//*   7   18:return          
	}
}
