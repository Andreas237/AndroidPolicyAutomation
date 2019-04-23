// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.*;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			AdtsReader

public final class AdtsExtractor
	implements Extractor
{

	public AdtsExtractor()
	{
		this(0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokespecial   #37  <Method void AdtsExtractor(long)>
	//    3    5:return          
	}

	public AdtsExtractor(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		firstSampleTimestampUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #41  <Field long firstSampleTimestampUs>
		packetBuffer = new ParsableByteArray(200);
	//    5    9:aload_0         
	//    6   10:new             #43  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:sipush          200
	//    9   17:invokespecial   #46  <Method void ParsableByteArray(int)>
	//   10   20:putfield        #48  <Field ParsableByteArray packetBuffer>
	//   11   23:return          
	}

	public void init(ExtractorOutput extractoroutput)
	{
		adtsReader = new AdtsReader(extractoroutput.track(0), extractoroutput.track(1));
	//    0    0:aload_0         
	//    1    1:new             #52  <Class AdtsReader>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:invokeinterface #58  <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//    6   12:aload_1         
	//    7   13:iconst_1        
	//    8   14:invokeinterface #58  <Method com.google.android.exoplayer.extractor.TrackOutput ExtractorOutput.track(int)>
	//    9   19:invokespecial   #61  <Method void AdtsReader(com.google.android.exoplayer.extractor.TrackOutput, com.google.android.exoplayer.extractor.TrackOutput)>
	//   10   22:putfield        #63  <Field AdtsReader adtsReader>
		extractoroutput.endTracks();
	//   11   25:aload_1         
	//   12   26:invokeinterface #66  <Method void ExtractorOutput.endTracks()>
		extractoroutput.seekMap(SeekMap.UNSEEKABLE);
	//   13   31:aload_1         
	//   14   32:getstatic       #72  <Field SeekMap SeekMap.UNSEEKABLE>
	//   15   35:invokeinterface #76  <Method void ExtractorOutput.seekMap(SeekMap)>
	//   16   40:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		int i = extractorinput.read(packetBuffer.data, 0, 200);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field ParsableByteArray packetBuffer>
	//    3    5:getfield        #86  <Field byte[] ParsableByteArray.data>
	//    4    8:iconst_0        
	//    5    9:sipush          200
	//    6   12:invokeinterface #91  <Method int ExtractorInput.read(byte[], int, int)>
	//    7   17:istore_3        
		if(i == -1)
	//*   8   18:iload_3         
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          25
			return -1;
	//   11   23:iconst_m1       
	//   12   24:ireturn         
		packetBuffer.setPosition(0);
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field ParsableByteArray packetBuffer>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #94  <Method void ParsableByteArray.setPosition(int)>
		packetBuffer.setLimit(i);
	//   17   33:aload_0         
	//   18   34:getfield        #48  <Field ParsableByteArray packetBuffer>
	//   19   37:iload_3         
	//   20   38:invokevirtual   #97  <Method void ParsableByteArray.setLimit(int)>
		if(!startedPacket)
	//*  21   41:aload_0         
	//*  22   42:getfield        #99  <Field boolean startedPacket>
	//*  23   45:ifne            65
		{
			adtsReader.packetStarted(firstSampleTimestampUs, true);
	//   24   48:aload_0         
	//   25   49:getfield        #63  <Field AdtsReader adtsReader>
	//   26   52:aload_0         
	//   27   53:getfield        #41  <Field long firstSampleTimestampUs>
	//   28   56:iconst_1        
	//   29   57:invokevirtual   #103 <Method void AdtsReader.packetStarted(long, boolean)>
			startedPacket = true;
	//   30   60:aload_0         
	//   31   61:iconst_1        
	//   32   62:putfield        #99  <Field boolean startedPacket>
		}
		adtsReader.consume(packetBuffer);
	//   33   65:aload_0         
	//   34   66:getfield        #63  <Field AdtsReader adtsReader>
	//   35   69:aload_0         
	//   36   70:getfield        #48  <Field ParsableByteArray packetBuffer>
	//   37   73:invokevirtual   #107 <Method void AdtsReader.consume(ParsableByteArray)>
		return 0;
	//   38   76:iconst_0        
	//   39   77:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		startedPacket = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #99  <Field boolean startedPacket>
		adtsReader.seek();
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field AdtsReader adtsReader>
	//    5    9:invokevirtual   #112 <Method void AdtsReader.seek()>
	//    6   12:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		ParsableByteArray parsablebytearray = new ParsableByteArray(10);
	//    0    0:new             #43  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:bipush          10
	//    3    6:invokespecial   #46  <Method void ParsableByteArray(int)>
	//    4    9:astore          7
		ParsableBitArray parsablebitarray = new ParsableBitArray(parsablebytearray.data);
	//    5   11:new             #116 <Class ParsableBitArray>
	//    6   14:dup             
	//    7   15:aload           7
	//    8   17:getfield        #86  <Field byte[] ParsableByteArray.data>
	//    9   20:invokespecial   #119 <Method void ParsableBitArray(byte[])>
	//   10   23:astore          8
		int i = 0;
	//   11   25:iconst_0        
	//   12   26:istore_2        
		do
		{
			extractorinput.peekFully(parsablebytearray.data, 0, 10);
	//   13   27:aload_1         
	//   14   28:aload           7
	//   15   30:getfield        #86  <Field byte[] ParsableByteArray.data>
	//   16   33:iconst_0        
	//   17   34:bipush          10
	//   18   36:invokeinterface #123 <Method void ExtractorInput.peekFully(byte[], int, int)>
			parsablebytearray.setPosition(0);
	//   19   41:aload           7
	//   20   43:iconst_0        
	//   21   44:invokevirtual   #94  <Method void ParsableByteArray.setPosition(int)>
			if(parsablebytearray.readUnsignedInt24() != ID3_TAG)
	//*  22   47:aload           7
	//*  23   49:invokevirtual   #127 <Method int ParsableByteArray.readUnsignedInt24()>
	//*  24   52:getstatic       #32  <Field int ID3_TAG>
	//*  25   55:icmpeq          231
			{
				extractorinput.resetPeekPosition();
	//   26   58:aload_1         
	//   27   59:invokeinterface #130 <Method void ExtractorInput.resetPeekPosition()>
				extractorinput.advancePeekPosition(i);
	//   28   64:aload_1         
	//   29   65:iload_2         
	//   30   66:invokeinterface #133 <Method void ExtractorInput.advancePeekPosition(int)>
				int l = 0;
	//   31   71:iconst_0        
	//   32   72:istore          4
				int j = l;
	//   33   74:iload           4
	//   34   76:istore_3        
				int i1 = i;
	//   35   77:iload_2         
	//   36   78:istore          5
				do
				{
					extractorinput.peekFully(parsablebytearray.data, 0, 2);
	//   37   80:aload_1         
	//   38   81:aload           7
	//   39   83:getfield        #86  <Field byte[] ParsableByteArray.data>
	//   40   86:iconst_0        
	//   41   87:iconst_2        
	//   42   88:invokeinterface #123 <Method void ExtractorInput.peekFully(byte[], int, int)>
					parsablebytearray.setPosition(0);
	//   43   93:aload           7
	//   44   95:iconst_0        
	//   45   96:invokevirtual   #94  <Method void ParsableByteArray.setPosition(int)>
					if((parsablebytearray.readUnsignedShort() & 0xfff6) != 65520)
	//*  46   99:aload           7
	//*  47  101:invokevirtual   #136 <Method int ParsableByteArray.readUnsignedShort()>
	//*  48  104:ldc1            #137 <Int 65526>
	//*  49  106:iand            
	//*  50  107:ldc1            #138 <Int 65520>
	//*  51  109:icmpeq          153
					{
						extractorinput.resetPeekPosition();
	//   52  112:aload_1         
	//   53  113:invokeinterface #130 <Method void ExtractorInput.resetPeekPosition()>
						i1++;
	//   54  118:iload           5
	//   55  120:iconst_1        
	//   56  121:iadd            
	//   57  122:istore          5
						if(i1 - i >= 8192)
	//*  58  124:iload           5
	//*  59  126:iload_2         
	//*  60  127:isub            
	//*  61  128:sipush          8192
	//*  62  131:icmplt          136
							return false;
	//   63  134:iconst_0        
	//   64  135:ireturn         
						extractorinput.advancePeekPosition(i1);
	//   65  136:aload_1         
	//   66  137:iload           5
	//   67  139:invokeinterface #133 <Method void ExtractorInput.advancePeekPosition(int)>
						l = 0;
	//   68  144:iconst_0        
	//   69  145:istore          4
						j = l;
	//   70  147:iload           4
	//   71  149:istore_3        
					} else
	//*  72  150:goto            80
					{
						l++;
	//   73  153:iload           4
	//   74  155:iconst_1        
	//   75  156:iadd            
	//   76  157:istore          4
						if(l >= 4 && j > 188)
	//*  77  159:iload           4
	//*  78  161:iconst_4        
	//*  79  162:icmplt          174
	//*  80  165:iload_3         
	//*  81  166:sipush          188
	//*  82  169:icmple          174
							return true;
	//   83  172:iconst_1        
	//   84  173:ireturn         
						extractorinput.peekFully(parsablebytearray.data, 0, 4);
	//   85  174:aload_1         
	//   86  175:aload           7
	//   87  177:getfield        #86  <Field byte[] ParsableByteArray.data>
	//   88  180:iconst_0        
	//   89  181:iconst_4        
	//   90  182:invokeinterface #123 <Method void ExtractorInput.peekFully(byte[], int, int)>
						parsablebitarray.setPosition(14);
	//   91  187:aload           8
	//   92  189:bipush          14
	//   93  191:invokevirtual   #139 <Method void ParsableBitArray.setPosition(int)>
						int j1 = parsablebitarray.readBits(13);
	//   94  194:aload           8
	//   95  196:bipush          13
	//   96  198:invokevirtual   #143 <Method int ParsableBitArray.readBits(int)>
	//   97  201:istore          6
						if(j1 <= 6)
	//*  98  203:iload           6
	//*  99  205:bipush          6
	//* 100  207:icmpgt          212
							return false;
	//  101  210:iconst_0        
	//  102  211:ireturn         
						extractorinput.advancePeekPosition(j1 - 6);
	//  103  212:aload_1         
	//  104  213:iload           6
	//  105  215:bipush          6
	//  106  217:isub            
	//  107  218:invokeinterface #133 <Method void ExtractorInput.advancePeekPosition(int)>
						j += j1;
	//  108  223:iload_3         
	//  109  224:iload           6
	//  110  226:iadd            
	//  111  227:istore_3        
					}
				} while(true);
	//  112  228:goto            80
			}
			int k = (parsablebytearray.data[6] & 0x7f) << 21 | (parsablebytearray.data[7] & 0x7f) << 14 | (parsablebytearray.data[8] & 0x7f) << 7 | parsablebytearray.data[9] & 0x7f;
	//  113  231:aload           7
	//  114  233:getfield        #86  <Field byte[] ParsableByteArray.data>
	//  115  236:bipush          6
	//  116  238:baload          
	//  117  239:bipush          127
	//  118  241:iand            
	//  119  242:bipush          21
	//  120  244:ishl            
	//  121  245:aload           7
	//  122  247:getfield        #86  <Field byte[] ParsableByteArray.data>
	//  123  250:bipush          7
	//  124  252:baload          
	//  125  253:bipush          127
	//  126  255:iand            
	//  127  256:bipush          14
	//  128  258:ishl            
	//  129  259:ior             
	//  130  260:aload           7
	//  131  262:getfield        #86  <Field byte[] ParsableByteArray.data>
	//  132  265:bipush          8
	//  133  267:baload          
	//  134  268:bipush          127
	//  135  270:iand            
	//  136  271:bipush          7
	//  137  273:ishl            
	//  138  274:ior             
	//  139  275:aload           7
	//  140  277:getfield        #86  <Field byte[] ParsableByteArray.data>
	//  141  280:bipush          9
	//  142  282:baload          
	//  143  283:bipush          127
	//  144  285:iand            
	//  145  286:ior             
	//  146  287:istore_3        
			i += k + 10;
	//  147  288:iload_2         
	//  148  289:iload_3         
	//  149  290:bipush          10
	//  150  292:iadd            
	//  151  293:iadd            
	//  152  294:istore_2        
			extractorinput.advancePeekPosition(k);
	//  153  295:aload_1         
	//  154  296:iload_3         
	//  155  297:invokeinterface #133 <Method void ExtractorInput.advancePeekPosition(int)>
		} while(true);
	//  156  302:goto            27
	}

	private static final int ID3_TAG = Util.getIntegerCodeForString("ID3");
	private static final int MAX_PACKET_SIZE = 200;
	private static final int MAX_SNIFF_BYTES = 8192;
	private AdtsReader adtsReader;
	private final long firstSampleTimestampUs;
	private final ParsableByteArray packetBuffer;
	private boolean startedPacket;

	static 
	{
	//    0    0:ldc1            #24  <String "ID3">
	//    1    2:invokestatic    #30  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #32  <Field int ID3_TAG>
	//*   3    8:return          
	}
}
