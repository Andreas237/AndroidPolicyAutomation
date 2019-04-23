// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ts;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.extractor.TrackOutput;
import com.google.android.exoplayer.util.MpegAudioHeader;
import com.google.android.exoplayer.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer.extractor.ts:
//			ElementaryStreamReader

final class MpegAudioReader extends ElementaryStreamReader
{

	public MpegAudioReader(TrackOutput trackoutput)
	{
		super(trackoutput);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void ElementaryStreamReader(TrackOutput)>
		state = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #32  <Field int state>
	//    6   10:aload_0         
	//    7   11:new             #34  <Class ParsableByteArray>
	//    8   14:dup             
	//    9   15:iconst_4        
	//   10   16:invokespecial   #37  <Method void ParsableByteArray(int)>
	//   11   19:putfield        #39  <Field ParsableByteArray headerScratch>
		headerScratch.data[0] = -1;
	//   12   22:aload_0         
	//   13   23:getfield        #39  <Field ParsableByteArray headerScratch>
	//   14   26:getfield        #43  <Field byte[] ParsableByteArray.data>
	//   15   29:iconst_0        
	//   16   30:iconst_m1       
	//   17   31:bastore         
	//   18   32:aload_0         
	//   19   33:new             #45  <Class MpegAudioHeader>
	//   20   36:dup             
	//   21   37:invokespecial   #48  <Method void MpegAudioHeader()>
	//   22   40:putfield        #50  <Field MpegAudioHeader header>
	//   23   43:return          
	}

	private void findHeader(ParsableByteArray parsablebytearray)
	{
		byte abyte0[] = parsablebytearray.data;
	//    0    0:aload_1         
	//    1    1:getfield        #43  <Field byte[] ParsableByteArray.data>
	//    2    4:astore          6
		int i = parsablebytearray.getPosition();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #57  <Method int ParsableByteArray.getPosition()>
	//    5   10:istore_2        
		int j;
		for(j = parsablebytearray.limit(); i < j; i++)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #60  <Method int ParsableByteArray.limit()>
	//*   8   15:istore          4
	//*   9   17:iload_2         
	//*  10   18:iload           4
	//*  11   20:icmpge          127
		{
			boolean flag1;
			if((abyte0[i] & 0xff) == 255)
	//*  12   23:aload           6
	//*  13   25:iload_2         
	//*  14   26:baload          
	//*  15   27:sipush          255
	//*  16   30:iand            
	//*  17   31:sipush          255
	//*  18   34:icmpne          43
				flag1 = true;
	//   19   37:iconst_1        
	//   20   38:istore          5
			else
	//*  21   40:goto            46
				flag1 = false;
	//   22   43:iconst_0        
	//   23   44:istore          5
			boolean flag;
			if(lastByteWasFF && (abyte0[i] & 0xe0) == 224)
	//*  24   46:aload_0         
	//*  25   47:getfield        #62  <Field boolean lastByteWasFF>
	//*  26   50:ifeq            72
	//*  27   53:aload           6
	//*  28   55:iload_2         
	//*  29   56:baload          
	//*  30   57:sipush          224
	//*  31   60:iand            
	//*  32   61:sipush          224
	//*  33   64:icmpne          72
				flag = true;
	//   34   67:iconst_1        
	//   35   68:istore_3        
			else
	//*  36   69:goto            74
				flag = false;
	//   37   72:iconst_0        
	//   38   73:istore_3        
			lastByteWasFF = flag1;
	//   39   74:aload_0         
	//   40   75:iload           5
	//   41   77:putfield        #62  <Field boolean lastByteWasFF>
			if(flag)
	//*  42   80:iload_3         
	//*  43   81:ifeq            120
			{
				parsablebytearray.setPosition(i + 1);
	//   44   84:aload_1         
	//   45   85:iload_2         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:invokevirtual   #65  <Method void ParsableByteArray.setPosition(int)>
				lastByteWasFF = false;
	//   49   91:aload_0         
	//   50   92:iconst_0        
	//   51   93:putfield        #62  <Field boolean lastByteWasFF>
				headerScratch.data[1] = abyte0[i];
	//   52   96:aload_0         
	//   53   97:getfield        #39  <Field ParsableByteArray headerScratch>
	//   54  100:getfield        #43  <Field byte[] ParsableByteArray.data>
	//   55  103:iconst_1        
	//   56  104:aload           6
	//   57  106:iload_2         
	//   58  107:baload          
	//   59  108:bastore         
				frameBytesRead = 2;
	//   60  109:aload_0         
	//   61  110:iconst_2        
	//   62  111:putfield        #67  <Field int frameBytesRead>
				state = 1;
	//   63  114:aload_0         
	//   64  115:iconst_1        
	//   65  116:putfield        #32  <Field int state>
				return;
	//   66  119:return          
			}
		}

	//   67  120:iload_2         
	//   68  121:iconst_1        
	//   69  122:iadd            
	//   70  123:istore_2        
	//*  71  124:goto            17
		parsablebytearray.setPosition(j);
	//   72  127:aload_1         
	//   73  128:iload           4
	//   74  130:invokevirtual   #65  <Method void ParsableByteArray.setPosition(int)>
	//   75  133:return          
	}

	private void readFrameRemainder(ParsableByteArray parsablebytearray)
	{
		int i = Math.min(parsablebytearray.bytesLeft(), frameSize - frameBytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field int frameSize>
	//    4    8:aload_0         
	//    5    9:getfield        #67  <Field int frameBytesRead>
	//    6   12:isub            
	//    7   13:invokestatic    #79  <Method int Math.min(int, int)>
	//    8   16:istore_2        
		output.sampleData(parsablebytearray, i);
	//    9   17:aload_0         
	//   10   18:getfield        #83  <Field TrackOutput output>
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokeinterface #89  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		frameBytesRead = frameBytesRead + i;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #67  <Field int frameBytesRead>
	//   17   33:iload_2         
	//   18   34:iadd            
	//   19   35:putfield        #67  <Field int frameBytesRead>
		if(frameBytesRead < frameSize)
	//*  20   38:aload_0         
	//*  21   39:getfield        #67  <Field int frameBytesRead>
	//*  22   42:aload_0         
	//*  23   43:getfield        #73  <Field int frameSize>
	//*  24   46:icmpge          50
		{
			return;
	//   25   49:return          
		} else
		{
			output.sampleMetadata(timeUs, 1, frameSize, 0, ((byte []) (null)));
	//   26   50:aload_0         
	//   27   51:getfield        #83  <Field TrackOutput output>
	//   28   54:aload_0         
	//   29   55:getfield        #91  <Field long timeUs>
	//   30   58:iconst_1        
	//   31   59:aload_0         
	//   32   60:getfield        #73  <Field int frameSize>
	//   33   63:iconst_0        
	//   34   64:aconst_null     
	//   35   65:invokeinterface #95  <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
			timeUs = timeUs + frameDurationUs;
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #91  <Field long timeUs>
	//   39   75:aload_0         
	//   40   76:getfield        #97  <Field long frameDurationUs>
	//   41   79:ladd            
	//   42   80:putfield        #91  <Field long timeUs>
			frameBytesRead = 0;
	//   43   83:aload_0         
	//   44   84:iconst_0        
	//   45   85:putfield        #67  <Field int frameBytesRead>
			state = 0;
	//   46   88:aload_0         
	//   47   89:iconst_0        
	//   48   90:putfield        #32  <Field int state>
			return;
	//   49   93:return          
		}
	}

	private void readHeaderRemainder(ParsableByteArray parsablebytearray)
	{
		int i = Math.min(parsablebytearray.bytesLeft(), 4 - frameBytesRead);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:iconst_4        
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field int frameBytesRead>
	//    5    9:isub            
	//    6   10:invokestatic    #79  <Method int Math.min(int, int)>
	//    7   13:istore_2        
		parsablebytearray.readBytes(headerScratch.data, frameBytesRead, i);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #39  <Field ParsableByteArray headerScratch>
	//   11   19:getfield        #43  <Field byte[] ParsableByteArray.data>
	//   12   22:aload_0         
	//   13   23:getfield        #67  <Field int frameBytesRead>
	//   14   26:iload_2         
	//   15   27:invokevirtual   #102 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		frameBytesRead = frameBytesRead + i;
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #67  <Field int frameBytesRead>
	//   19   35:iload_2         
	//   20   36:iadd            
	//   21   37:putfield        #67  <Field int frameBytesRead>
		if(frameBytesRead < 4)
	//*  22   40:aload_0         
	//*  23   41:getfield        #67  <Field int frameBytesRead>
	//*  24   44:iconst_4        
	//*  25   45:icmpge          49
			return;
	//   26   48:return          
		headerScratch.setPosition(0);
	//   27   49:aload_0         
	//   28   50:getfield        #39  <Field ParsableByteArray headerScratch>
	//   29   53:iconst_0        
	//   30   54:invokevirtual   #65  <Method void ParsableByteArray.setPosition(int)>
		if(!MpegAudioHeader.populateHeader(headerScratch.readInt(), header))
	//*  31   57:aload_0         
	//*  32   58:getfield        #39  <Field ParsableByteArray headerScratch>
	//*  33   61:invokevirtual   #105 <Method int ParsableByteArray.readInt()>
	//*  34   64:aload_0         
	//*  35   65:getfield        #50  <Field MpegAudioHeader header>
	//*  36   68:invokestatic    #109 <Method boolean MpegAudioHeader.populateHeader(int, MpegAudioHeader)>
	//*  37   71:ifne            85
		{
			frameBytesRead = 0;
	//   38   74:aload_0         
	//   39   75:iconst_0        
	//   40   76:putfield        #67  <Field int frameBytesRead>
			state = 1;
	//   41   79:aload_0         
	//   42   80:iconst_1        
	//   43   81:putfield        #32  <Field int state>
			return;
	//   44   84:return          
		}
		frameSize = header.frameSize;
	//   45   85:aload_0         
	//   46   86:aload_0         
	//   47   87:getfield        #50  <Field MpegAudioHeader header>
	//   48   90:getfield        #110 <Field int MpegAudioHeader.frameSize>
	//   49   93:putfield        #73  <Field int frameSize>
		if(!hasOutputFormat)
	//*  50   96:aload_0         
	//*  51   97:getfield        #112 <Field boolean hasOutputFormat>
	//*  52  100:ifne            178
		{
			frameDurationUs = ((long)header.samplesPerFrame * 0xf4240L) / (long)header.sampleRate;
	//   53  103:aload_0         
	//   54  104:aload_0         
	//   55  105:getfield        #50  <Field MpegAudioHeader header>
	//   56  108:getfield        #115 <Field int MpegAudioHeader.samplesPerFrame>
	//   57  111:i2l             
	//   58  112:ldc2w           #116 <Long 0xf4240L>
	//   59  115:lmul            
	//   60  116:aload_0         
	//   61  117:getfield        #50  <Field MpegAudioHeader header>
	//   62  120:getfield        #120 <Field int MpegAudioHeader.sampleRate>
	//   63  123:i2l             
	//   64  124:ldiv            
	//   65  125:putfield        #97  <Field long frameDurationUs>
			parsablebytearray = ((ParsableByteArray) (MediaFormat.createAudioFormat(((String) (null)), header.mimeType, -1, 4096, -1L, header.channels, header.sampleRate, ((java.util.List) (null)), ((String) (null)))));
	//   66  128:aconst_null     
	//   67  129:aload_0         
	//   68  130:getfield        #50  <Field MpegAudioHeader header>
	//   69  133:getfield        #124 <Field String MpegAudioHeader.mimeType>
	//   70  136:iconst_m1       
	//   71  137:sipush          4096
	//   72  140:ldc2w           #125 <Long -1L>
	//   73  143:aload_0         
	//   74  144:getfield        #50  <Field MpegAudioHeader header>
	//   75  147:getfield        #129 <Field int MpegAudioHeader.channels>
	//   76  150:aload_0         
	//   77  151:getfield        #50  <Field MpegAudioHeader header>
	//   78  154:getfield        #120 <Field int MpegAudioHeader.sampleRate>
	//   79  157:aconst_null     
	//   80  158:aconst_null     
	//   81  159:invokestatic    #135 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String)>
	//   82  162:astore_1        
			output.format(((MediaFormat) (parsablebytearray)));
	//   83  163:aload_0         
	//   84  164:getfield        #83  <Field TrackOutput output>
	//   85  167:aload_1         
	//   86  168:invokeinterface #139 <Method void TrackOutput.format(MediaFormat)>
			hasOutputFormat = true;
	//   87  173:aload_0         
	//   88  174:iconst_1        
	//   89  175:putfield        #112 <Field boolean hasOutputFormat>
		}
		headerScratch.setPosition(0);
	//   90  178:aload_0         
	//   91  179:getfield        #39  <Field ParsableByteArray headerScratch>
	//   92  182:iconst_0        
	//   93  183:invokevirtual   #65  <Method void ParsableByteArray.setPosition(int)>
		output.sampleData(headerScratch, 4);
	//   94  186:aload_0         
	//   95  187:getfield        #83  <Field TrackOutput output>
	//   96  190:aload_0         
	//   97  191:getfield        #39  <Field ParsableByteArray headerScratch>
	//   98  194:iconst_4        
	//   99  195:invokeinterface #89  <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		state = 2;
	//  100  200:aload_0         
	//  101  201:iconst_2        
	//  102  202:putfield        #32  <Field int state>
	//  103  205:return          
	}

	public void consume(ParsableByteArray parsablebytearray)
	{
		do
		{
			if(parsablebytearray.bytesLeft() <= 0)
				break;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #71  <Method int ParsableByteArray.bytesLeft()>
	//    2    4:ifle            63
			switch(state)
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field int state>
			{
	//*   5   11:tableswitch     0 2: default 36
	//	               0 55
	//	               1 47
	//	               2 39
	//*   6   36:goto            0
			case 2: // '\002'
				readFrameRemainder(parsablebytearray);
	//    7   39:aload_0         
	//    8   40:aload_1         
	//    9   41:invokespecial   #142 <Method void readFrameRemainder(ParsableByteArray)>
				break;

	//*  10   44:goto            0
			case 1: // '\001'
				readHeaderRemainder(parsablebytearray);
	//   11   47:aload_0         
	//   12   48:aload_1         
	//   13   49:invokespecial   #144 <Method void readHeaderRemainder(ParsableByteArray)>
				break;

	//*  14   52:goto            0
			case 0: // '\0'
				findHeader(parsablebytearray);
	//   15   55:aload_0         
	//   16   56:aload_1         
	//   17   57:invokespecial   #146 <Method void findHeader(ParsableByteArray)>
				break;
			}
		} while(true);
	//*  18   60:goto            0
	//   19   63:return          
	}

	public void packetFinished()
	{
	//    0    0:return          
	}

	public void packetStarted(long l, boolean flag)
	{
		timeUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #91  <Field long timeUs>
	//    3    5:return          
	}

	public void seek()
	{
		state = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #32  <Field int state>
		frameBytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #67  <Field int frameBytesRead>
		lastByteWasFF = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #62  <Field boolean lastByteWasFF>
	//    9   15:return          
	}

	private static final int HEADER_SIZE = 4;
	private static final int STATE_FINDING_HEADER = 0;
	private static final int STATE_READING_FRAME = 2;
	private static final int STATE_READING_HEADER = 1;
	private int frameBytesRead;
	private long frameDurationUs;
	private int frameSize;
	private boolean hasOutputFormat;
	private final MpegAudioHeader header = new MpegAudioHeader();
	private final ParsableByteArray headerScratch = new ParsableByteArray(4);
	private boolean lastByteWasFF;
	private int state;
	private long timeUs;
}
