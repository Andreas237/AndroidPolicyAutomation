// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp3;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.*;
import java.io.EOFException;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.extractor.mp3:
//			VbriSeeker, XingSeeker, ConstantBitrateSeeker, Id3Util

public final class Mp3Extractor
	implements Extractor
{
	static interface Seeker
		extends SeekMap
	{

		public abstract long getDurationUs();

		public abstract long getTimeUs(long l);
	}


	public Mp3Extractor()
	{
		this(-1L);
	//    0    0:aload_0         
	//    1    1:ldc2w           #60  <Long -1L>
	//    2    4:invokespecial   #64  <Method void Mp3Extractor(long)>
	//    3    7:return          
	}

	public Mp3Extractor(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
		forcedFirstSampleTimestampUs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #68  <Field long forcedFirstSampleTimestampUs>
		scratch = new ParsableByteArray(4);
	//    5    9:aload_0         
	//    6   10:new             #70  <Class ParsableByteArray>
	//    7   13:dup             
	//    8   14:iconst_4        
	//    9   15:invokespecial   #73  <Method void ParsableByteArray(int)>
	//   10   18:putfield        #75  <Field ParsableByteArray scratch>
		synchronizedHeader = new MpegAudioHeader();
	//   11   21:aload_0         
	//   12   22:new             #77  <Class MpegAudioHeader>
	//   13   25:dup             
	//   14   26:invokespecial   #78  <Method void MpegAudioHeader()>
	//   15   29:putfield        #80  <Field MpegAudioHeader synchronizedHeader>
		basisTimeUs = -1L;
	//   16   32:aload_0         
	//   17   33:ldc2w           #60  <Long -1L>
	//   18   36:putfield        #82  <Field long basisTimeUs>
	//   19   39:return          
	}

	private boolean maybeResynchronize(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.resetPeekPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #93  <Method void ExtractorInput.resetPeekPosition()>
		if(!extractorinput.peekFully(scratch.data, 0, 4, true))
	//*   2    6:aload_1         
	//*   3    7:aload_0         
	//*   4    8:getfield        #75  <Field ParsableByteArray scratch>
	//*   5   11:getfield        #97  <Field byte[] ParsableByteArray.data>
	//*   6   14:iconst_0        
	//*   7   15:iconst_4        
	//*   8   16:iconst_1        
	//*   9   17:invokeinterface #101 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  10   22:ifne            27
			return false;
	//   11   25:iconst_0        
	//   12   26:ireturn         
		scratch.setPosition(0);
	//   13   27:aload_0         
	//   14   28:getfield        #75  <Field ParsableByteArray scratch>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
		int i = scratch.readInt();
	//   17   35:aload_0         
	//   18   36:getfield        #75  <Field ParsableByteArray scratch>
	//   19   39:invokevirtual   #108 <Method int ParsableByteArray.readInt()>
	//   20   42:istore_2        
		if((i & 0xfffe0c00) == (0xfffe0c00 & synchronizedHeaderData) && MpegAudioHeader.getFrameSize(i) != -1)
	//*  21   43:iload_2         
	//*  22   44:ldc1            #12  <Int 0xfffe0c00>
	//*  23   46:iand            
	//*  24   47:ldc1            #12  <Int 0xfffe0c00>
	//*  25   49:aload_0         
	//*  26   50:getfield        #110 <Field int synchronizedHeaderData>
	//*  27   53:iand            
	//*  28   54:icmpne          76
	//*  29   57:iload_2         
	//*  30   58:invokestatic    #114 <Method int MpegAudioHeader.getFrameSize(int)>
	//*  31   61:iconst_m1       
	//*  32   62:icmpeq          76
		{
			MpegAudioHeader.populateHeader(i, synchronizedHeader);
	//   33   65:iload_2         
	//   34   66:aload_0         
	//   35   67:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   36   70:invokestatic    #118 <Method boolean MpegAudioHeader.populateHeader(int, MpegAudioHeader)>
	//   37   73:pop             
			return true;
	//   38   74:iconst_1        
	//   39   75:ireturn         
		} else
		{
			synchronizedHeaderData = 0;
	//   40   76:aload_0         
	//   41   77:iconst_0        
	//   42   78:putfield        #110 <Field int synchronizedHeaderData>
			extractorinput.skipFully(1);
	//   43   81:aload_1         
	//   44   82:iconst_1        
	//   45   83:invokeinterface #121 <Method void ExtractorInput.skipFully(int)>
			return synchronizeCatchingEndOfInput(extractorinput);
	//   46   88:aload_0         
	//   47   89:aload_1         
	//   48   90:invokespecial   #124 <Method boolean synchronizeCatchingEndOfInput(ExtractorInput)>
	//   49   93:ireturn         
		}
	}

	private int readSample(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(sampleBytesRemaining == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field int sampleBytesRemaining>
	//*   2    4:ifne            95
		{
			if(!maybeResynchronize(extractorinput))
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #131 <Method boolean maybeResynchronize(ExtractorInput)>
	//*   6   12:ifne            17
				return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
			if(basisTimeUs == -1L)
	//*   9   17:aload_0         
	//*  10   18:getfield        #82  <Field long basisTimeUs>
	//*  11   21:ldc2w           #60  <Long -1L>
	//*  12   24:lcmp            
	//*  13   25:ifne            84
			{
				basisTimeUs = seeker.getTimeUs(extractorinput.getPosition());
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #133 <Field Mp3Extractor$Seeker seeker>
	//   17   33:aload_1         
	//   18   34:invokeinterface #137 <Method long ExtractorInput.getPosition()>
	//   19   39:invokeinterface #141 <Method long Mp3Extractor$Seeker.getTimeUs(long)>
	//   20   44:putfield        #82  <Field long basisTimeUs>
				if(forcedFirstSampleTimestampUs != -1L)
	//*  21   47:aload_0         
	//*  22   48:getfield        #68  <Field long forcedFirstSampleTimestampUs>
	//*  23   51:ldc2w           #60  <Long -1L>
	//*  24   54:lcmp            
	//*  25   55:ifeq            84
				{
					long l = seeker.getTimeUs(0L);
	//   26   58:aload_0         
	//   27   59:getfield        #133 <Field Mp3Extractor$Seeker seeker>
	//   28   62:lconst_0        
	//   29   63:invokeinterface #141 <Method long Mp3Extractor$Seeker.getTimeUs(long)>
	//   30   68:lstore_3        
					basisTimeUs = basisTimeUs + (forcedFirstSampleTimestampUs - l);
	//   31   69:aload_0         
	//   32   70:aload_0         
	//   33   71:getfield        #82  <Field long basisTimeUs>
	//   34   74:aload_0         
	//   35   75:getfield        #68  <Field long forcedFirstSampleTimestampUs>
	//   36   78:lload_3         
	//   37   79:lsub            
	//   38   80:ladd            
	//   39   81:putfield        #82  <Field long basisTimeUs>
				}
			}
			sampleBytesRemaining = synchronizedHeader.frameSize;
	//   40   84:aload_0         
	//   41   85:aload_0         
	//   42   86:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   43   89:getfield        #144 <Field int MpegAudioHeader.frameSize>
	//   44   92:putfield        #129 <Field int sampleBytesRemaining>
		}
		int i = trackOutput.sampleData(extractorinput, sampleBytesRemaining, true);
	//   45   95:aload_0         
	//   46   96:getfield        #146 <Field TrackOutput trackOutput>
	//   47   99:aload_1         
	//   48  100:aload_0         
	//   49  101:getfield        #129 <Field int sampleBytesRemaining>
	//   50  104:iconst_1        
	//   51  105:invokeinterface #152 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//   52  110:istore_2        
		if(i == -1)
	//*  53  111:iload_2         
	//*  54  112:iconst_m1       
	//*  55  113:icmpne          118
			return -1;
	//   56  116:iconst_m1       
	//   57  117:ireturn         
		sampleBytesRemaining = sampleBytesRemaining - i;
	//   58  118:aload_0         
	//   59  119:aload_0         
	//   60  120:getfield        #129 <Field int sampleBytesRemaining>
	//   61  123:iload_2         
	//   62  124:isub            
	//   63  125:putfield        #129 <Field int sampleBytesRemaining>
		if(sampleBytesRemaining > 0)
	//*  64  128:aload_0         
	//*  65  129:getfield        #129 <Field int sampleBytesRemaining>
	//*  66  132:ifle            137
		{
			return 0;
	//   67  135:iconst_0        
	//   68  136:ireturn         
		} else
		{
			long l1 = basisTimeUs;
	//   69  137:aload_0         
	//   70  138:getfield        #82  <Field long basisTimeUs>
	//   71  141:lstore_3        
			long l2 = (samplesRead * 0xf4240L) / (long)synchronizedHeader.sampleRate;
	//   72  142:aload_0         
	//   73  143:getfield        #154 <Field long samplesRead>
	//   74  146:ldc2w           #155 <Long 0xf4240L>
	//   75  149:lmul            
	//   76  150:aload_0         
	//   77  151:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   78  154:getfield        #159 <Field int MpegAudioHeader.sampleRate>
	//   79  157:i2l             
	//   80  158:ldiv            
	//   81  159:lstore          5
			trackOutput.sampleMetadata(l1 + l2, 1, synchronizedHeader.frameSize, 0, ((byte []) (null)));
	//   82  161:aload_0         
	//   83  162:getfield        #146 <Field TrackOutput trackOutput>
	//   84  165:lload_3         
	//   85  166:lload           5
	//   86  168:ladd            
	//   87  169:iconst_1        
	//   88  170:aload_0         
	//   89  171:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   90  174:getfield        #144 <Field int MpegAudioHeader.frameSize>
	//   91  177:iconst_0        
	//   92  178:aconst_null     
	//   93  179:invokeinterface #163 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
			samplesRead = samplesRead + (long)synchronizedHeader.samplesPerFrame;
	//   94  184:aload_0         
	//   95  185:aload_0         
	//   96  186:getfield        #154 <Field long samplesRead>
	//   97  189:aload_0         
	//   98  190:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   99  193:getfield        #166 <Field int MpegAudioHeader.samplesPerFrame>
	//  100  196:i2l             
	//  101  197:ladd            
	//  102  198:putfield        #154 <Field long samplesRead>
			sampleBytesRemaining = 0;
	//  103  201:aload_0         
	//  104  202:iconst_0        
	//  105  203:putfield        #129 <Field int sampleBytesRemaining>
			return 0;
	//  106  206:iconst_0        
	//  107  207:ireturn         
		}
	}

	private void setupSeeker(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		ParsableByteArray parsablebytearray = new ParsableByteArray(synchronizedHeader.frameSize);
	//    0    0:new             #70  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//    4    8:getfield        #144 <Field int MpegAudioHeader.frameSize>
	//    5   11:invokespecial   #73  <Method void ParsableByteArray(int)>
	//    6   14:astore          8
		extractorinput.peekFully(parsablebytearray.data, 0, synchronizedHeader.frameSize);
	//    7   16:aload_1         
	//    8   17:aload           8
	//    9   19:getfield        #97  <Field byte[] ParsableByteArray.data>
	//   10   22:iconst_0        
	//   11   23:aload_0         
	//   12   24:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   13   27:getfield        #144 <Field int MpegAudioHeader.frameSize>
	//   14   30:invokeinterface #171 <Method void ExtractorInput.peekFully(byte[], int, int)>
		long l = extractorinput.getPosition();
	//   15   35:aload_1         
	//   16   36:invokeinterface #137 <Method long ExtractorInput.getPosition()>
	//   17   41:lstore          4
		long l1 = extractorinput.getLength();
	//   18   43:aload_1         
	//   19   44:invokeinterface #174 <Method long ExtractorInput.getLength()>
	//   20   49:lstore          6
		int i = synchronizedHeader.version;
	//   21   51:aload_0         
	//   22   52:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   23   55:getfield        #177 <Field int MpegAudioHeader.version>
	//   24   58:istore_3        
		byte byte0 = 21;
	//   25   59:bipush          21
	//   26   61:istore_2        
		if((i & 1) != 0)
	//*  27   62:iload_3         
	//*  28   63:iconst_1        
	//*  29   64:iand            
	//*  30   65:ifeq            85
		{
			if(synchronizedHeader.channels != 1)
	//*  31   68:aload_0         
	//*  32   69:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//*  33   72:getfield        #180 <Field int MpegAudioHeader.channels>
	//*  34   75:iconst_1        
	//*  35   76:icmpeq          102
				byte0 = 36;
	//   36   79:bipush          36
	//   37   81:istore_2        
		} else
	//*  38   82:goto            102
		if(synchronizedHeader.channels == 1)
	//*  39   85:aload_0         
	//*  40   86:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//*  41   89:getfield        #180 <Field int MpegAudioHeader.channels>
	//*  42   92:iconst_1        
	//*  43   93:icmpeq          99
	//*  44   96:goto            102
			byte0 = 13;
	//   45   99:bipush          13
	//   46  101:istore_2        
		if(parsablebytearray.limit() >= byte0 + 4)
	//*  47  102:aload           8
	//*  48  104:invokevirtual   #183 <Method int ParsableByteArray.limit()>
	//*  49  107:iload_2         
	//*  50  108:iconst_4        
	//*  51  109:iadd            
	//*  52  110:icmplt          128
		{
			parsablebytearray.setPosition(((int) (byte0)));
	//   53  113:aload           8
	//   54  115:iload_2         
	//   55  116:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
			i = parsablebytearray.readInt();
	//   56  119:aload           8
	//   57  121:invokevirtual   #108 <Method int ParsableByteArray.readInt()>
	//   58  124:istore_3        
		} else
	//*  59  125:goto            130
		{
			i = 0;
	//   60  128:iconst_0        
	//   61  129:istore_3        
		}
		if(i != XING_HEADER && i != INFO_HEADER)
	//*  62  130:iload_3         
	//*  63  131:getstatic       #49  <Field int XING_HEADER>
	//*  64  134:icmpeq          208
	//*  65  137:iload_3         
	//*  66  138:getstatic       #53  <Field int INFO_HEADER>
	//*  67  141:icmpne          147
	//*  68  144:goto            208
		{
			if(parsablebytearray.limit() >= 40)
	//*  69  147:aload           8
	//*  70  149:invokevirtual   #183 <Method int ParsableByteArray.limit()>
	//*  71  152:bipush          40
	//*  72  154:icmplt          306
			{
				parsablebytearray.setPosition(36);
	//   73  157:aload           8
	//   74  159:bipush          36
	//   75  161:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
				if(parsablebytearray.readInt() == VBRI_HEADER)
	//*  76  164:aload           8
	//*  77  166:invokevirtual   #108 <Method int ParsableByteArray.readInt()>
	//*  78  169:getstatic       #57  <Field int VBRI_HEADER>
	//*  79  172:icmpne          306
				{
					seeker = ((Seeker) (VbriSeeker.create(synchronizedHeader, parsablebytearray, l, l1)));
	//   80  175:aload_0         
	//   81  176:aload_0         
	//   82  177:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   83  180:aload           8
	//   84  182:lload           4
	//   85  184:lload           6
	//   86  186:invokestatic    #189 <Method VbriSeeker VbriSeeker.create(MpegAudioHeader, ParsableByteArray, long, long)>
	//   87  189:putfield        #133 <Field Mp3Extractor$Seeker seeker>
					extractorinput.skipFully(synchronizedHeader.frameSize);
	//   88  192:aload_1         
	//   89  193:aload_0         
	//   90  194:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   91  197:getfield        #144 <Field int MpegAudioHeader.frameSize>
	//   92  200:invokeinterface #121 <Method void ExtractorInput.skipFully(int)>
				}
			}
		} else
	//*  93  205:goto            306
		{
			seeker = ((Seeker) (XingSeeker.create(synchronizedHeader, parsablebytearray, l, l1)));
	//   94  208:aload_0         
	//   95  209:aload_0         
	//   96  210:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   97  213:aload           8
	//   98  215:lload           4
	//   99  217:lload           6
	//  100  219:invokestatic    #194 <Method XingSeeker XingSeeker.create(MpegAudioHeader, ParsableByteArray, long, long)>
	//  101  222:putfield        #133 <Field Mp3Extractor$Seeker seeker>
			if(seeker != null && gaplessInfo == null)
	//* 102  225:aload_0         
	//* 103  226:getfield        #133 <Field Mp3Extractor$Seeker seeker>
	//* 104  229:ifnull          293
	//* 105  232:aload_0         
	//* 106  233:getfield        #196 <Field GaplessInfo gaplessInfo>
	//* 107  236:ifnonnull       293
			{
				extractorinput.resetPeekPosition();
	//  108  239:aload_1         
	//  109  240:invokeinterface #93  <Method void ExtractorInput.resetPeekPosition()>
				extractorinput.advancePeekPosition(byte0 + 141);
	//  110  245:aload_1         
	//  111  246:iload_2         
	//  112  247:sipush          141
	//  113  250:iadd            
	//  114  251:invokeinterface #199 <Method void ExtractorInput.advancePeekPosition(int)>
				extractorinput.peekFully(scratch.data, 0, 3);
	//  115  256:aload_1         
	//  116  257:aload_0         
	//  117  258:getfield        #75  <Field ParsableByteArray scratch>
	//  118  261:getfield        #97  <Field byte[] ParsableByteArray.data>
	//  119  264:iconst_0        
	//  120  265:iconst_3        
	//  121  266:invokeinterface #171 <Method void ExtractorInput.peekFully(byte[], int, int)>
				scratch.setPosition(0);
	//  122  271:aload_0         
	//  123  272:getfield        #75  <Field ParsableByteArray scratch>
	//  124  275:iconst_0        
	//  125  276:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
				gaplessInfo = GaplessInfo.createFromXingHeaderValue(scratch.readUnsignedInt24());
	//  126  279:aload_0         
	//  127  280:aload_0         
	//  128  281:getfield        #75  <Field ParsableByteArray scratch>
	//  129  284:invokevirtual   #202 <Method int ParsableByteArray.readUnsignedInt24()>
	//  130  287:invokestatic    #208 <Method GaplessInfo GaplessInfo.createFromXingHeaderValue(int)>
	//  131  290:putfield        #196 <Field GaplessInfo gaplessInfo>
			}
			extractorinput.skipFully(synchronizedHeader.frameSize);
	//  132  293:aload_1         
	//  133  294:aload_0         
	//  134  295:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//  135  298:getfield        #144 <Field int MpegAudioHeader.frameSize>
	//  136  301:invokeinterface #121 <Method void ExtractorInput.skipFully(int)>
		}
		if(seeker == null)
	//* 137  306:aload_0         
	//* 138  307:getfield        #133 <Field Mp3Extractor$Seeker seeker>
	//* 139  310:ifnonnull       383
		{
			extractorinput.resetPeekPosition();
	//  140  313:aload_1         
	//  141  314:invokeinterface #93  <Method void ExtractorInput.resetPeekPosition()>
			extractorinput.peekFully(scratch.data, 0, 4);
	//  142  319:aload_1         
	//  143  320:aload_0         
	//  144  321:getfield        #75  <Field ParsableByteArray scratch>
	//  145  324:getfield        #97  <Field byte[] ParsableByteArray.data>
	//  146  327:iconst_0        
	//  147  328:iconst_4        
	//  148  329:invokeinterface #171 <Method void ExtractorInput.peekFully(byte[], int, int)>
			scratch.setPosition(0);
	//  149  334:aload_0         
	//  150  335:getfield        #75  <Field ParsableByteArray scratch>
	//  151  338:iconst_0        
	//  152  339:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
			MpegAudioHeader.populateHeader(scratch.readInt(), synchronizedHeader);
	//  153  342:aload_0         
	//  154  343:getfield        #75  <Field ParsableByteArray scratch>
	//  155  346:invokevirtual   #108 <Method int ParsableByteArray.readInt()>
	//  156  349:aload_0         
	//  157  350:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//  158  353:invokestatic    #118 <Method boolean MpegAudioHeader.populateHeader(int, MpegAudioHeader)>
	//  159  356:pop             
			seeker = ((Seeker) (new ConstantBitrateSeeker(extractorinput.getPosition(), synchronizedHeader.bitrate, l1)));
	//  160  357:aload_0         
	//  161  358:new             #210 <Class ConstantBitrateSeeker>
	//  162  361:dup             
	//  163  362:aload_1         
	//  164  363:invokeinterface #137 <Method long ExtractorInput.getPosition()>
	//  165  368:aload_0         
	//  166  369:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//  167  372:getfield        #213 <Field int MpegAudioHeader.bitrate>
	//  168  375:lload           6
	//  169  377:invokespecial   #216 <Method void ConstantBitrateSeeker(long, int, long)>
	//  170  380:putfield        #133 <Field Mp3Extractor$Seeker seeker>
		}
	//  171  383:return          
	}

	private boolean synchronize(ExtractorInput extractorinput, boolean flag)
		throws IOException, InterruptedException
	{
		extractorinput.resetPeekPosition();
	//    0    0:aload_1         
	//    1    1:invokeinterface #93  <Method void ExtractorInput.resetPeekPosition()>
		int i;
		int j;
		int k;
		int l;
		if(extractorinput.getPosition() == 0L)
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #137 <Method long ExtractorInput.getPosition()>
	//*   4   12:lconst_0        
	//*   5   13:lcmp            
	//*   6   14:ifne            58
		{
			gaplessInfo = Id3Util.parseId3(extractorinput);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokestatic    #224 <Method GaplessInfo Id3Util.parseId3(ExtractorInput)>
	//   10   22:putfield        #196 <Field GaplessInfo gaplessInfo>
			l = (int)extractorinput.getPeekPosition();
	//   11   25:aload_1         
	//   12   26:invokeinterface #227 <Method long ExtractorInput.getPeekPosition()>
	//   13   31:l2i             
	//   14   32:istore          6
			if(!flag)
	//*  15   34:iload_2         
	//*  16   35:ifne            46
				extractorinput.skipFully(l);
	//   17   38:aload_1         
	//   18   39:iload           6
	//   19   41:invokeinterface #121 <Method void ExtractorInput.skipFully(int)>
			k = 0;
	//   20   46:iconst_0        
	//   21   47:istore          5
			i = k;
	//   22   49:iload           5
	//   23   51:istore_3        
			j = i;
	//   24   52:iload_3         
	//   25   53:istore          4
		} else
	//*  26   55:goto            71
		{
			k = 0;
	//   27   58:iconst_0        
	//   28   59:istore          5
			i = k;
	//   29   61:iload           5
	//   30   63:istore_3        
			j = i;
	//   31   64:iload_3         
	//   32   65:istore          4
			l = j;
	//   33   67:iload           4
	//   34   69:istore          6
		}
		do
		{
			int j1;
			int k1;
label0:
			{
				if(flag && k == 4096)
	//*  35   71:iload_2         
	//*  36   72:ifeq            85
	//*  37   75:iload           5
	//*  38   77:sipush          4096
	//*  39   80:icmpne          85
					return false;
	//   40   83:iconst_0        
	//   41   84:ireturn         
				if(!flag && k == 0x20000)
	//*  42   85:iload_2         
	//*  43   86:ifne            109
	//*  44   89:iload           5
	//*  45   91:ldc1            #17  <Int 0x20000>
	//*  46   93:icmpeq          99
	//*  47   96:goto            109
					throw new ParserException("Searched too many bytes.");
	//   48   99:new             #229 <Class ParserException>
	//   49  102:dup             
	//   50  103:ldc1            #231 <String "Searched too many bytes.">
	//   51  105:invokespecial   #234 <Method void ParserException(String)>
	//   52  108:athrow          
				if(!extractorinput.peekFully(scratch.data, 0, 4, true))
	//*  53  109:aload_1         
	//*  54  110:aload_0         
	//*  55  111:getfield        #75  <Field ParsableByteArray scratch>
	//*  56  114:getfield        #97  <Field byte[] ParsableByteArray.data>
	//*  57  117:iconst_0        
	//*  58  118:iconst_4        
	//*  59  119:iconst_1        
	//*  60  120:invokeinterface #101 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  61  125:ifne            130
					return false;
	//   62  128:iconst_0        
	//   63  129:ireturn         
				scratch.setPosition(0);
	//   64  130:aload_0         
	//   65  131:getfield        #75  <Field ParsableByteArray scratch>
	//   66  134:iconst_0        
	//   67  135:invokevirtual   #104 <Method void ParsableByteArray.setPosition(int)>
				j1 = scratch.readInt();
	//   68  138:aload_0         
	//   69  139:getfield        #75  <Field ParsableByteArray scratch>
	//   70  142:invokevirtual   #108 <Method int ParsableByteArray.readInt()>
	//   71  145:istore          8
				if(i == 0 || (j1 & 0xfffe0c00) == (0xfffe0c00 & i))
	//*  72  147:iload_3         
	//*  73  148:ifeq            163
	//*  74  151:iload           8
	//*  75  153:ldc1            #12  <Int 0xfffe0c00>
	//*  76  155:iand            
	//*  77  156:ldc1            #12  <Int 0xfffe0c00>
	//*  78  158:iload_3         
	//*  79  159:iand            
	//*  80  160:icmpne          176
				{
					k1 = MpegAudioHeader.getFrameSize(j1);
	//   81  163:iload           8
	//   82  165:invokestatic    #114 <Method int MpegAudioHeader.getFrameSize(int)>
	//   83  168:istore          9
					if(k1 != -1)
						break label0;
	//   84  170:iload           9
	//   85  172:iconst_m1       
	//   86  173:icmpne          221
				}
				k++;
	//   87  176:iload           5
	//   88  178:iconst_1        
	//   89  179:iadd            
	//   90  180:istore          5
				if(flag)
	//*  91  182:iload_2         
	//*  92  183:ifeq            206
				{
					extractorinput.resetPeekPosition();
	//   93  186:aload_1         
	//   94  187:invokeinterface #93  <Method void ExtractorInput.resetPeekPosition()>
					extractorinput.advancePeekPosition(l + k);
	//   95  192:aload_1         
	//   96  193:iload           6
	//   97  195:iload           5
	//   98  197:iadd            
	//   99  198:invokeinterface #199 <Method void ExtractorInput.advancePeekPosition(int)>
				} else
	//* 100  203:goto            213
				{
					extractorinput.skipFully(1);
	//  101  206:aload_1         
	//  102  207:iconst_1        
	//  103  208:invokeinterface #121 <Method void ExtractorInput.skipFully(int)>
				}
				i = 0;
	//  104  213:iconst_0        
	//  105  214:istore_3        
				j = i;
	//  106  215:iload_3         
	//  107  216:istore          4
				continue;
	//  108  218:goto            71
			}
			int i1 = j + 1;
	//  109  221:iload           4
	//  110  223:iconst_1        
	//  111  224:iadd            
	//  112  225:istore          7
			if(i1 == 1)
	//* 113  227:iload           7
	//* 114  229:iconst_1        
	//* 115  230:icmpne          250
			{
				MpegAudioHeader.populateHeader(j1, synchronizedHeader);
	//  116  233:iload           8
	//  117  235:aload_0         
	//  118  236:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//  119  239:invokestatic    #118 <Method boolean MpegAudioHeader.populateHeader(int, MpegAudioHeader)>
	//  120  242:pop             
				j = j1;
	//  121  243:iload           8
	//  122  245:istore          4
			} else
	//* 123  247:goto            290
			{
				j = i;
	//  124  250:iload_3         
	//  125  251:istore          4
				if(i1 == 4)
	//* 126  253:iload           7
	//* 127  255:iconst_4        
	//* 128  256:icmpne          290
				{
					if(flag)
	//* 129  259:iload_2         
	//* 130  260:ifeq            277
						extractorinput.skipFully(l + k);
	//  131  263:aload_1         
	//  132  264:iload           6
	//  133  266:iload           5
	//  134  268:iadd            
	//  135  269:invokeinterface #121 <Method void ExtractorInput.skipFully(int)>
					else
	//* 136  274:goto            283
						extractorinput.resetPeekPosition();
	//  137  277:aload_1         
	//  138  278:invokeinterface #93  <Method void ExtractorInput.resetPeekPosition()>
					synchronizedHeaderData = i;
	//  139  283:aload_0         
	//  140  284:iload_3         
	//  141  285:putfield        #110 <Field int synchronizedHeaderData>
					return true;
	//  142  288:iconst_1        
	//  143  289:ireturn         
				}
			}
			extractorinput.advancePeekPosition(k1 - 4);
	//  144  290:aload_1         
	//  145  291:iload           9
	//  146  293:iconst_4        
	//  147  294:isub            
	//  148  295:invokeinterface #199 <Method void ExtractorInput.advancePeekPosition(int)>
			i = j;
	//  149  300:iload           4
	//  150  302:istore_3        
			j = i1;
	//  151  303:iload           7
	//  152  305:istore          4
		} while(true);
	//  153  307:goto            71
	}

	private boolean synchronizeCatchingEndOfInput(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		boolean flag;
		try
		{
			flag = synchronize(extractorinput, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #238 <Method boolean synchronize(ExtractorInput, boolean)>
	//    4    6:istore_2        
		}
	//*   5    7:iload_2         
	//*   6    8:ireturn         
		// Misplaced declaration of an exception variable
		catch(ExtractorInput extractorinput)
	//*   7    9:astore_1        
		{
			return false;
	//    8   10:iconst_0        
	//    9   11:ireturn         
		}
		return flag;
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #242 <Field ExtractorOutput extractorOutput>
		trackOutput = extractoroutput.track(0);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:invokeinterface #248 <Method TrackOutput ExtractorOutput.track(int)>
	//    7   13:putfield        #146 <Field TrackOutput trackOutput>
		extractoroutput.endTracks();
	//    8   16:aload_1         
	//    9   17:invokeinterface #251 <Method void ExtractorOutput.endTracks()>
	//   10   22:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(synchronizedHeaderData == 0 && !synchronizeCatchingEndOfInput(extractorinput))
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field int synchronizedHeaderData>
	//*   2    4:ifne            17
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #124 <Method boolean synchronizeCatchingEndOfInput(ExtractorInput)>
	//*   6   12:ifne            17
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
		if(seeker == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #133 <Field Mp3Extractor$Seeker seeker>
	//*  11   21:ifnonnull       123
		{
			setupSeeker(extractorinput);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #255 <Method void setupSeeker(ExtractorInput)>
			extractorOutput.seekMap(((SeekMap) (seeker)));
	//   15   29:aload_0         
	//   16   30:getfield        #242 <Field ExtractorOutput extractorOutput>
	//   17   33:aload_0         
	//   18   34:getfield        #133 <Field Mp3Extractor$Seeker seeker>
	//   19   37:invokeinterface #259 <Method void ExtractorOutput.seekMap(SeekMap)>
			MediaFormat mediaformat = MediaFormat.createAudioFormat(((String) (null)), synchronizedHeader.mimeType, -1, 4096, seeker.getDurationUs(), synchronizedHeader.channels, synchronizedHeader.sampleRate, ((java.util.List) (null)), ((String) (null)));
	//   20   42:aconst_null     
	//   21   43:aload_0         
	//   22   44:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   23   47:getfield        #263 <Field String MpegAudioHeader.mimeType>
	//   24   50:iconst_m1       
	//   25   51:sipush          4096
	//   26   54:aload_0         
	//   27   55:getfield        #133 <Field Mp3Extractor$Seeker seeker>
	//   28   58:invokeinterface #266 <Method long Mp3Extractor$Seeker.getDurationUs()>
	//   29   63:aload_0         
	//   30   64:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   31   67:getfield        #180 <Field int MpegAudioHeader.channels>
	//   32   70:aload_0         
	//   33   71:getfield        #80  <Field MpegAudioHeader synchronizedHeader>
	//   34   74:getfield        #159 <Field int MpegAudioHeader.sampleRate>
	//   35   77:aconst_null     
	//   36   78:aconst_null     
	//   37   79:invokestatic    #272 <Method MediaFormat MediaFormat.createAudioFormat(String, String, int, int, long, int, int, java.util.List, String)>
	//   38   82:astore_3        
			GaplessInfo gaplessinfo = gaplessInfo;
	//   39   83:aload_0         
	//   40   84:getfield        #196 <Field GaplessInfo gaplessInfo>
	//   41   87:astore          4
			positionholder = ((PositionHolder) (mediaformat));
	//   42   89:aload_3         
	//   43   90:astore_2        
			if(gaplessinfo != null)
	//*  44   91:aload           4
	//*  45   93:ifnull          113
				positionholder = ((PositionHolder) (mediaformat.copyWithGaplessInfo(gaplessinfo.encoderDelay, gaplessInfo.encoderPadding)));
	//   46   96:aload_3         
	//   47   97:aload           4
	//   48   99:getfield        #275 <Field int GaplessInfo.encoderDelay>
	//   49  102:aload_0         
	//   50  103:getfield        #196 <Field GaplessInfo gaplessInfo>
	//   51  106:getfield        #278 <Field int GaplessInfo.encoderPadding>
	//   52  109:invokevirtual   #282 <Method MediaFormat MediaFormat.copyWithGaplessInfo(int, int)>
	//   53  112:astore_2        
			trackOutput.format(((MediaFormat) (positionholder)));
	//   54  113:aload_0         
	//   55  114:getfield        #146 <Field TrackOutput trackOutput>
	//   56  117:aload_2         
	//   57  118:invokeinterface #286 <Method void TrackOutput.format(MediaFormat)>
		}
		return readSample(extractorinput);
	//   58  123:aload_0         
	//   59  124:aload_1         
	//   60  125:invokespecial   #288 <Method int readSample(ExtractorInput)>
	//   61  128:ireturn         
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek()
	{
		synchronizedHeaderData = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #110 <Field int synchronizedHeaderData>
		samplesRead = 0L;
	//    3    5:aload_0         
	//    4    6:lconst_0        
	//    5    7:putfield        #154 <Field long samplesRead>
		basisTimeUs = -1L;
	//    6   10:aload_0         
	//    7   11:ldc2w           #60  <Long -1L>
	//    8   14:putfield        #82  <Field long basisTimeUs>
		sampleBytesRemaining = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #129 <Field int sampleBytesRemaining>
	//   12   22:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return synchronize(extractorinput, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #238 <Method boolean synchronize(ExtractorInput, boolean)>
	//    4    6:ireturn         
	}

	private static final int HEADER_MASK = 0xfffe0c00;
	private static final int INFO_HEADER = Util.getIntegerCodeForString("Info");
	private static final int MAX_SNIFF_BYTES = 4096;
	private static final int MAX_SYNC_BYTES = 0x20000;
	private static final int VBRI_HEADER = Util.getIntegerCodeForString("VBRI");
	private static final int XING_HEADER = Util.getIntegerCodeForString("Xing");
	private long basisTimeUs;
	private ExtractorOutput extractorOutput;
	private final long forcedFirstSampleTimestampUs;
	private GaplessInfo gaplessInfo;
	private int sampleBytesRemaining;
	private long samplesRead;
	private final ParsableByteArray scratch;
	private Seeker seeker;
	private final MpegAudioHeader synchronizedHeader;
	private int synchronizedHeaderData;
	private TrackOutput trackOutput;

	static 
	{
	//    0    0:ldc1            #41  <String "Xing">
	//    1    2:invokestatic    #47  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #49  <Field int XING_HEADER>
	//    3    8:ldc1            #51  <String "Info">
	//    4   10:invokestatic    #47  <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #53  <Field int INFO_HEADER>
	//    6   16:ldc1            #55  <String "VBRI">
	//    7   18:invokestatic    #47  <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #57  <Field int VBRI_HEADER>
	//*   9   24:return          
	}
}
