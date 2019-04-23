// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			StreamReader, OggParser

final class FlacReader extends StreamReader
{

	FlacReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void StreamReader()>
	//    2    4:return          
	}

	static boolean verifyBitstreamType(ParsableByteArray parsablebytearray)
	{
		return parsablebytearray.readUnsignedByte() == 127 && parsablebytearray.readUnsignedInt() == 0x464c4143L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:bipush          127
	//    3    6:icmpne          22
	//    4    9:aload_0         
	//    5   10:invokevirtual   #32  <Method long ParsableByteArray.readUnsignedInt()>
	//    6   13:ldc2w           #33  <Long 0x464c4143L>
	//    7   16:lcmp            
	//    8   17:ifne            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		long l = extractorinput.getPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #45  <Method long ExtractorInput.getPosition()>
	//    2    6:lstore_3        
		if(!oggParser.readPacket(extractorinput, scratch))
	//*   3    7:aload_0         
	//*   4    8:getfield        #49  <Field OggParser oggParser>
	//*   5   11:aload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #53  <Field ParsableByteArray scratch>
	//*   8   16:invokevirtual   #59  <Method boolean OggParser.readPacket(ExtractorInput, ParsableByteArray)>
	//*   9   19:ifne            24
			return -1;
	//   10   22:iconst_m1       
	//   11   23:ireturn         
		extractorinput = ((ExtractorInput) (scratch.data));
	//   12   24:aload_0         
	//   13   25:getfield        #53  <Field ParsableByteArray scratch>
	//   14   28:getfield        #63  <Field byte[] ParsableByteArray.data>
	//   15   31:astore_1        
		if(streamInfo == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #65  <Field FlacStreamInfo streamInfo>
	//*  18   36:ifnonnull       128
		{
			streamInfo = new FlacStreamInfo(((byte []) (extractorinput)), 17);
	//   19   39:aload_0         
	//   20   40:new             #67  <Class FlacStreamInfo>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:bipush          17
	//   24   47:invokespecial   #70  <Method void FlacStreamInfo(byte[], int)>
	//   25   50:putfield        #65  <Field FlacStreamInfo streamInfo>
			extractorinput = ((ExtractorInput) (Arrays.copyOfRange(((byte []) (extractorinput)), 9, scratch.limit())));
	//   26   53:aload_1         
	//   27   54:bipush          9
	//   28   56:aload_0         
	//   29   57:getfield        #53  <Field ParsableByteArray scratch>
	//   30   60:invokevirtual   #73  <Method int ParsableByteArray.limit()>
	//   31   63:invokestatic    #79  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   32   66:astore_1        
			extractorinput[4] = -128;
	//   33   67:aload_1         
	//   34   68:iconst_4        
	//   35   69:bipush          -128
	//   36   71:bastore         
			extractorinput = ((ExtractorInput) (Collections.singletonList(((Object) (extractorinput)))));
	//   37   72:aload_1         
	//   38   73:invokestatic    #85  <Method java.util.List Collections.singletonList(Object)>
	//   39   76:astore_1        
			extractorinput = ((ExtractorInput) (MediaFormat.createAudioFormat(((String) (null)), "audio/x-flac", streamInfo.bitRate(), -1, streamInfo.durationUs(), streamInfo.channels, streamInfo.sampleRate, ((java.util.List) (extractorinput)), ((String) (null)))));
	//   40   77:aconst_null     
	//   41   78:ldc1            #87  <String "audio/x-flac">
	//   42   80:aload_0         
	//   43   81:getfield        #65  <Field FlacStreamInfo streamInfo>
	//   44   84:invokevirtual   #90  <Method int FlacStreamInfo.bitRate()>
	//   45   87:iconst_m1       
	//   46   88:aload_0         
	//   47   89:getfield        #65  <Field FlacStreamInfo streamInfo>
	//   48   92:invokevirtual   #93  <Method long FlacStreamInfo.durationUs()>
	//   49   95:aload_0         
	//   50   96:getfield        #65  <Field FlacStreamInfo streamInfo>
	//   51   99:getfield        #97  <Field int FlacStreamInfo.channels>
	//   52  102:aload_0         
	//   53  103:getfield        #65  <Field FlacStreamInfo streamInfo>
	//   54  106:getfield        #100 <Field int FlacStreamInfo.sampleRate>
	//   55  109:aload_1         
	//   56  110:aconst_null     
	//   57  111:invokestatic    #106 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String)>
	//   58  114:astore_1        
			trackOutput.format(((MediaFormat) (extractorinput)));
	//   59  115:aload_0         
	//   60  116:getfield        #110 <Field TrackOutput trackOutput>
	//   61  119:aload_1         
	//   62  120:invokeinterface #116 <Method void TrackOutput.format(MediaFormat)>
		} else
	//*  63  125:goto            290
		if(extractorinput[0] == -1)
	//*  64  128:aload_1         
	//*  65  129:iconst_0        
	//*  66  130:baload          
	//*  67  131:iconst_m1       
	//*  68  132:icmpne          262
		{
			if(!firstAudioPacketProcessed)
	//*  69  135:aload_0         
	//*  70  136:getfield        #118 <Field boolean firstAudioPacketProcessed>
	//*  71  139:ifne            199
			{
				if(seekTable != null)
	//*  72  142:aload_0         
	//*  73  143:getfield        #120 <Field FlacSeekTable seekTable>
	//*  74  146:ifnull          182
				{
					extractorOutput.seekMap(seekTable.createSeekMap(l, streamInfo.sampleRate));
	//   75  149:aload_0         
	//   76  150:getfield        #124 <Field ExtractorOutput extractorOutput>
	//   77  153:aload_0         
	//   78  154:getfield        #120 <Field FlacSeekTable seekTable>
	//   79  157:lload_3         
	//   80  158:aload_0         
	//   81  159:getfield        #65  <Field FlacStreamInfo streamInfo>
	//   82  162:getfield        #100 <Field int FlacStreamInfo.sampleRate>
	//   83  165:i2l             
	//   84  166:invokevirtual   #130 <Method SeekMap FlacSeekTable.createSeekMap(long, long)>
	//   85  169:invokeinterface #136 <Method void ExtractorOutput.seekMap(SeekMap)>
					seekTable = null;
	//   86  174:aload_0         
	//   87  175:aconst_null     
	//   88  176:putfield        #120 <Field FlacSeekTable seekTable>
				} else
	//*  89  179:goto            194
				{
					extractorOutput.seekMap(SeekMap.UNSEEKABLE);
	//   90  182:aload_0         
	//   91  183:getfield        #124 <Field ExtractorOutput extractorOutput>
	//   92  186:getstatic       #142 <Field SeekMap SeekMap.UNSEEKABLE>
	//   93  189:invokeinterface #136 <Method void ExtractorOutput.seekMap(SeekMap)>
				}
				firstAudioPacketProcessed = true;
	//   94  194:aload_0         
	//   95  195:iconst_1        
	//   96  196:putfield        #118 <Field boolean firstAudioPacketProcessed>
			}
			trackOutput.sampleData(scratch, scratch.limit());
	//   97  199:aload_0         
	//   98  200:getfield        #110 <Field TrackOutput trackOutput>
	//   99  203:aload_0         
	//  100  204:getfield        #53  <Field ParsableByteArray scratch>
	//  101  207:aload_0         
	//  102  208:getfield        #53  <Field ParsableByteArray scratch>
	//  103  211:invokevirtual   #73  <Method int ParsableByteArray.limit()>
	//  104  214:invokeinterface #146 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			scratch.setPosition(0);
	//  105  219:aload_0         
	//  106  220:getfield        #53  <Field ParsableByteArray scratch>
	//  107  223:iconst_0        
	//  108  224:invokevirtual   #150 <Method void ParsableByteArray.setPosition(int)>
			l = FlacUtil.extractSampleTimestamp(streamInfo, scratch);
	//  109  227:aload_0         
	//  110  228:getfield        #65  <Field FlacStreamInfo streamInfo>
	//  111  231:aload_0         
	//  112  232:getfield        #53  <Field ParsableByteArray scratch>
	//  113  235:invokestatic    #156 <Method long FlacUtil.extractSampleTimestamp(FlacStreamInfo, ParsableByteArray)>
	//  114  238:lstore_3        
			trackOutput.sampleMetadata(l, 1, scratch.limit(), 0, ((byte []) (null)));
	//  115  239:aload_0         
	//  116  240:getfield        #110 <Field TrackOutput trackOutput>
	//  117  243:lload_3         
	//  118  244:iconst_1        
	//  119  245:aload_0         
	//  120  246:getfield        #53  <Field ParsableByteArray scratch>
	//  121  249:invokevirtual   #73  <Method int ParsableByteArray.limit()>
	//  122  252:iconst_0        
	//  123  253:aconst_null     
	//  124  254:invokeinterface #160 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
		} else
	//* 125  259:goto            290
		if((extractorinput[0] & 0x7f) == 3 && seekTable == null)
	//* 126  262:aload_1         
	//* 127  263:iconst_0        
	//* 128  264:baload          
	//* 129  265:bipush          127
	//* 130  267:iand            
	//* 131  268:iconst_3        
	//* 132  269:icmpne          290
	//* 133  272:aload_0         
	//* 134  273:getfield        #120 <Field FlacSeekTable seekTable>
	//* 135  276:ifnonnull       290
			seekTable = FlacSeekTable.parseSeekTable(scratch);
	//  136  279:aload_0         
	//  137  280:aload_0         
	//  138  281:getfield        #53  <Field ParsableByteArray scratch>
	//  139  284:invokestatic    #164 <Method FlacSeekTable FlacSeekTable.parseSeekTable(ParsableByteArray)>
	//  140  287:putfield        #120 <Field FlacSeekTable seekTable>
		scratch.reset();
	//  141  290:aload_0         
	//  142  291:getfield        #53  <Field ParsableByteArray scratch>
	//  143  294:invokevirtual   #167 <Method void ParsableByteArray.reset()>
		return 0;
	//  144  297:iconst_0        
	//  145  298:ireturn         
	}

	private static final byte AUDIO_PACKET_TYPE = -1;
	private static final byte SEEKTABLE_PACKET_TYPE = 3;
	private boolean firstAudioPacketProcessed;
	private FlacSeekTable seekTable;
	private FlacStreamInfo streamInfo;
}
