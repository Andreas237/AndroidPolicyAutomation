// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.*;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp3:
//			ConstantBitrateSeeker, VbriSeeker, XingSeeker

public final class Mp3Extractor
	implements Extractor
{
	public static interface Flags
		extends Annotation
	{
	}

	static interface Seeker
		extends SeekMap
	{

		public abstract long getTimeUs(long l);
	}


	public Mp3Extractor()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #86  <Method void Mp3Extractor(int)>
	//    3    5:return          
	}

	public Mp3Extractor(int i)
	{
		this(i, 0x1L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2w           #87  <Long 0x1L>
	//    3    5:invokespecial   #91  <Method void Mp3Extractor(int, long)>
	//    4    8:return          
	}

	public Mp3Extractor(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
		flags = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #94  <Field int flags>
		forcedFirstSampleTimestampUs = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #96  <Field long forcedFirstSampleTimestampUs>
		scratch = new ParsableByteArray(10);
	//    8   14:aload_0         
	//    9   15:new             #98  <Class ParsableByteArray>
	//   10   18:dup             
	//   11   19:bipush          10
	//   12   21:invokespecial   #99  <Method void ParsableByteArray(int)>
	//   13   24:putfield        #101 <Field ParsableByteArray scratch>
		synchronizedHeader = new MpegAudioHeader();
	//   14   27:aload_0         
	//   15   28:new             #103 <Class MpegAudioHeader>
	//   16   31:dup             
	//   17   32:invokespecial   #104 <Method void MpegAudioHeader()>
	//   18   35:putfield        #106 <Field MpegAudioHeader synchronizedHeader>
		gaplessInfoHolder = new GaplessInfoHolder();
	//   19   38:aload_0         
	//   20   39:new             #108 <Class GaplessInfoHolder>
	//   21   42:dup             
	//   22   43:invokespecial   #109 <Method void GaplessInfoHolder()>
	//   23   46:putfield        #111 <Field GaplessInfoHolder gaplessInfoHolder>
		basisTimeUs = 0x1L;
	//   24   49:aload_0         
	//   25   50:ldc2w           #87  <Long 0x1L>
	//   26   53:putfield        #113 <Field long basisTimeUs>
		id3Peeker = new Id3Peeker();
	//   27   56:aload_0         
	//   28   57:new             #115 <Class Id3Peeker>
	//   29   60:dup             
	//   30   61:invokespecial   #116 <Method void Id3Peeker()>
	//   31   64:putfield        #118 <Field Id3Peeker id3Peeker>
	//   32   67:return          
	}

	private Seeker getConstantBitrateSeeker(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		extractorinput.peekFully(scratch.data, 0, 4);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #101 <Field ParsableByteArray scratch>
	//    3    5:getfield        #128 <Field byte[] ParsableByteArray.data>
	//    4    8:iconst_0        
	//    5    9:iconst_4        
	//    6   10:invokeinterface #134 <Method void ExtractorInput.peekFully(byte[], int, int)>
		scratch.setPosition(0);
	//    7   15:aload_0         
	//    8   16:getfield        #101 <Field ParsableByteArray scratch>
	//    9   19:iconst_0        
	//   10   20:invokevirtual   #137 <Method void ParsableByteArray.setPosition(int)>
		MpegAudioHeader.populateHeader(scratch.readInt(), synchronizedHeader);
	//   11   23:aload_0         
	//   12   24:getfield        #101 <Field ParsableByteArray scratch>
	//   13   27:invokevirtual   #141 <Method int ParsableByteArray.readInt()>
	//   14   30:aload_0         
	//   15   31:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   16   34:invokestatic    #145 <Method boolean MpegAudioHeader.populateHeader(int, MpegAudioHeader)>
	//   17   37:pop             
		return ((Seeker) (new ConstantBitrateSeeker(extractorinput.getLength(), extractorinput.getPosition(), synchronizedHeader)));
	//   18   38:new             #147 <Class ConstantBitrateSeeker>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokeinterface #151 <Method long ExtractorInput.getLength()>
	//   22   48:aload_1         
	//   23   49:invokeinterface #154 <Method long ExtractorInput.getPosition()>
	//   24   54:aload_0         
	//   25   55:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   26   58:invokespecial   #157 <Method void ConstantBitrateSeeker(long, long, MpegAudioHeader)>
	//   27   61:areturn         
	}

	private static int getSeekFrameHeader(ParsableByteArray parsablebytearray, int i)
	{
		if(parsablebytearray.limit() >= i + 4)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #163 <Method int ParsableByteArray.limit()>
	//*   2    4:iload_1         
	//*   3    5:iconst_4        
	//*   4    6:iadd            
	//*   5    7:icmplt          36
		{
			parsablebytearray.setPosition(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #137 <Method void ParsableByteArray.setPosition(int)>
			i = parsablebytearray.readInt();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #141 <Method int ParsableByteArray.readInt()>
	//   11   19:istore_1        
			if(i == SEEK_HEADER_XING || i == SEEK_HEADER_INFO)
	//*  12   20:iload_1         
	//*  13   21:getstatic       #74  <Field int SEEK_HEADER_XING>
	//*  14   24:icmpeq          34
	//*  15   27:iload_1         
	//*  16   28:getstatic       #78  <Field int SEEK_HEADER_INFO>
	//*  17   31:icmpne          36
				return i;
	//   18   34:iload_1         
	//   19   35:ireturn         
		}
		if(parsablebytearray.limit() >= 40)
	//*  20   36:aload_0         
	//*  21   37:invokevirtual   #163 <Method int ParsableByteArray.limit()>
	//*  22   40:bipush          40
	//*  23   42:icmplt          65
		{
			parsablebytearray.setPosition(36);
	//   24   45:aload_0         
	//   25   46:bipush          36
	//   26   48:invokevirtual   #137 <Method void ParsableByteArray.setPosition(int)>
			if(parsablebytearray.readInt() == SEEK_HEADER_VBRI)
	//*  27   51:aload_0         
	//*  28   52:invokevirtual   #141 <Method int ParsableByteArray.readInt()>
	//*  29   55:getstatic       #82  <Field int SEEK_HEADER_VBRI>
	//*  30   58:icmpne          65
				return SEEK_HEADER_VBRI;
	//   31   61:getstatic       #82  <Field int SEEK_HEADER_VBRI>
	//   32   64:ireturn         
		}
		return 0;
	//   33   65:iconst_0        
	//   34   66:ireturn         
	}

	private static boolean headersMatch(int i, long l)
	{
		return (long)(i & 0xfffe0c00) == (l & 0xfffe0c00L);
	//    0    0:iload_0         
	//    1    1:ldc1            #27  <Int 0xfffe0c00>
	//    2    3:iand            
	//    3    4:i2l             
	//    4    5:lload_1         
	//    5    6:ldc2w           #166 <Long 0xfffe0c00L>
	//    6    9:land            
	//    7   10:lcmp            
	//    8   11:ifne            16
	//    9   14:iconst_1        
	//   10   15:ireturn         
	//   11   16:iconst_0        
	//   12   17:ireturn         
	}

	private Seeker maybeReadSeekFrame(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		Object obj = ((Object) (new ParsableByteArray(synchronizedHeader.frameSize)));
	//    0    0:new             #98  <Class ParsableByteArray>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//    4    8:getfield        #171 <Field int MpegAudioHeader.frameSize>
	//    5   11:invokespecial   #99  <Method void ParsableByteArray(int)>
	//    6   14:astore          4
		extractorinput.peekFully(((ParsableByteArray) (obj)).data, 0, synchronizedHeader.frameSize);
	//    7   16:aload_1         
	//    8   17:aload           4
	//    9   19:getfield        #128 <Field byte[] ParsableByteArray.data>
	//   10   22:iconst_0        
	//   11   23:aload_0         
	//   12   24:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   13   27:getfield        #171 <Field int MpegAudioHeader.frameSize>
	//   14   30:invokeinterface #134 <Method void ExtractorInput.peekFully(byte[], int, int)>
		int i = synchronizedHeader.version;
	//   15   35:aload_0         
	//   16   36:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   17   39:getfield        #174 <Field int MpegAudioHeader.version>
	//   18   42:istore_3        
		byte byte0 = 21;
	//   19   43:bipush          21
	//   20   45:istore_2        
		if((i & 1) != 0)
	//*  21   46:iload_3         
	//*  22   47:iconst_1        
	//*  23   48:iand            
	//*  24   49:ifeq            69
		{
			if(synchronizedHeader.channels != 1)
	//*  25   52:aload_0         
	//*  26   53:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//*  27   56:getfield        #177 <Field int MpegAudioHeader.channels>
	//*  28   59:iconst_1        
	//*  29   60:icmpeq          66
				byte0 = 36;
	//   30   63:bipush          36
	//   31   65:istore_2        
		} else
	//*  32   66:goto            89
		if(synchronizedHeader.channels == 1)
	//*  33   69:aload_0         
	//*  34   70:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//*  35   73:getfield        #177 <Field int MpegAudioHeader.channels>
	//*  36   76:iconst_1        
	//*  37   77:icmpeq          83
	//*  38   80:goto            66
			byte0 = 13;
	//   39   83:bipush          13
	//   40   85:istore_2        
	//*  41   86:goto            66
		i = getSeekFrameHeader(((ParsableByteArray) (obj)), ((int) (byte0)));
	//   42   89:aload           4
	//   43   91:iload_2         
	//   44   92:invokestatic    #179 <Method int getSeekFrameHeader(ParsableByteArray, int)>
	//   45   95:istore_3        
		if(i != SEEK_HEADER_XING && i != SEEK_HEADER_INFO)
	//*  46   96:iload_3         
	//*  47   97:getstatic       #74  <Field int SEEK_HEADER_XING>
	//*  48  100:icmpeq          167
	//*  49  103:iload_3         
	//*  50  104:getstatic       #78  <Field int SEEK_HEADER_INFO>
	//*  51  107:icmpne          113
	//*  52  110:goto            167
			if(i == SEEK_HEADER_VBRI)
	//*  53  113:iload_3         
	//*  54  114:getstatic       #82  <Field int SEEK_HEADER_VBRI>
	//*  55  117:icmpne          159
			{
				obj = ((Object) (VbriSeeker.create(extractorinput.getLength(), extractorinput.getPosition(), synchronizedHeader, ((ParsableByteArray) (obj)))));
	//   56  120:aload_1         
	//   57  121:invokeinterface #151 <Method long ExtractorInput.getLength()>
	//   58  126:aload_1         
	//   59  127:invokeinterface #154 <Method long ExtractorInput.getPosition()>
	//   60  132:aload_0         
	//   61  133:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   62  136:aload           4
	//   63  138:invokestatic    #185 <Method VbriSeeker VbriSeeker.create(long, long, MpegAudioHeader, ParsableByteArray)>
	//   64  141:astore          4
				extractorinput.skipFully(synchronizedHeader.frameSize);
	//   65  143:aload_1         
	//   66  144:aload_0         
	//   67  145:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   68  148:getfield        #171 <Field int MpegAudioHeader.frameSize>
	//   69  151:invokeinterface #188 <Method void ExtractorInput.skipFully(int)>
				return ((Seeker) (obj));
	//   70  156:aload           4
	//   71  158:areturn         
			} else
			{
				extractorinput.resetPeekPosition();
	//   72  159:aload_1         
	//   73  160:invokeinterface #191 <Method void ExtractorInput.resetPeekPosition()>
				return null;
	//   74  165:aconst_null     
	//   75  166:areturn         
			}
		obj = ((Object) (XingSeeker.create(extractorinput.getLength(), extractorinput.getPosition(), synchronizedHeader, ((ParsableByteArray) (obj)))));
	//   76  167:aload_1         
	//   77  168:invokeinterface #151 <Method long ExtractorInput.getLength()>
	//   78  173:aload_1         
	//   79  174:invokeinterface #154 <Method long ExtractorInput.getPosition()>
	//   80  179:aload_0         
	//   81  180:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   82  183:aload           4
	//   83  185:invokestatic    #196 <Method XingSeeker XingSeeker.create(long, long, MpegAudioHeader, ParsableByteArray)>
	//   84  188:astore          4
		if(obj != null && !gaplessInfoHolder.hasGaplessInfo())
	//*  85  190:aload           4
	//*  86  192:ifnull          260
	//*  87  195:aload_0         
	//*  88  196:getfield        #111 <Field GaplessInfoHolder gaplessInfoHolder>
	//*  89  199:invokevirtual   #200 <Method boolean GaplessInfoHolder.hasGaplessInfo()>
	//*  90  202:ifne            260
		{
			extractorinput.resetPeekPosition();
	//   91  205:aload_1         
	//   92  206:invokeinterface #191 <Method void ExtractorInput.resetPeekPosition()>
			extractorinput.advancePeekPosition(byte0 + 141);
	//   93  211:aload_1         
	//   94  212:iload_2         
	//   95  213:sipush          141
	//   96  216:iadd            
	//   97  217:invokeinterface #203 <Method void ExtractorInput.advancePeekPosition(int)>
			extractorinput.peekFully(scratch.data, 0, 3);
	//   98  222:aload_1         
	//   99  223:aload_0         
	//  100  224:getfield        #101 <Field ParsableByteArray scratch>
	//  101  227:getfield        #128 <Field byte[] ParsableByteArray.data>
	//  102  230:iconst_0        
	//  103  231:iconst_3        
	//  104  232:invokeinterface #134 <Method void ExtractorInput.peekFully(byte[], int, int)>
			scratch.setPosition(0);
	//  105  237:aload_0         
	//  106  238:getfield        #101 <Field ParsableByteArray scratch>
	//  107  241:iconst_0        
	//  108  242:invokevirtual   #137 <Method void ParsableByteArray.setPosition(int)>
			gaplessInfoHolder.setFromXingHeaderValue(scratch.readUnsignedInt24());
	//  109  245:aload_0         
	//  110  246:getfield        #111 <Field GaplessInfoHolder gaplessInfoHolder>
	//  111  249:aload_0         
	//  112  250:getfield        #101 <Field ParsableByteArray scratch>
	//  113  253:invokevirtual   #206 <Method int ParsableByteArray.readUnsignedInt24()>
	//  114  256:invokevirtual   #210 <Method boolean GaplessInfoHolder.setFromXingHeaderValue(int)>
	//  115  259:pop             
		}
		extractorinput.skipFully(synchronizedHeader.frameSize);
	//  116  260:aload_1         
	//  117  261:aload_0         
	//  118  262:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//  119  265:getfield        #171 <Field int MpegAudioHeader.frameSize>
	//  120  268:invokeinterface #188 <Method void ExtractorInput.skipFully(int)>
		if(obj != null && !((Seeker) (obj)).isSeekable() && i == SEEK_HEADER_INFO)
	//* 121  273:aload           4
	//* 122  275:ifnull          301
	//* 123  278:aload           4
	//* 124  280:invokeinterface #213 <Method boolean Mp3Extractor$Seeker.isSeekable()>
	//* 125  285:ifne            301
	//* 126  288:iload_3         
	//* 127  289:getstatic       #78  <Field int SEEK_HEADER_INFO>
	//* 128  292:icmpne          301
			return getConstantBitrateSeeker(extractorinput);
	//  129  295:aload_0         
	//  130  296:aload_1         
	//  131  297:invokespecial   #215 <Method Mp3Extractor$Seeker getConstantBitrateSeeker(ExtractorInput)>
	//  132  300:areturn         
		else
			return ((Seeker) (obj));
	//  133  301:aload           4
	//  134  303:areturn         
	}

	private int readSample(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(sampleBytesRemaining == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #219 <Field int sampleBytesRemaining>
	//*   2    4:ifne            177
		{
			extractorinput.resetPeekPosition();
	//    3    7:aload_1         
	//    4    8:invokeinterface #191 <Method void ExtractorInput.resetPeekPosition()>
			if(!extractorinput.peekFully(scratch.data, 0, 4, true))
	//*   5   13:aload_1         
	//*   6   14:aload_0         
	//*   7   15:getfield        #101 <Field ParsableByteArray scratch>
	//*   8   18:getfield        #128 <Field byte[] ParsableByteArray.data>
	//*   9   21:iconst_0        
	//*  10   22:iconst_4        
	//*  11   23:iconst_1        
	//*  12   24:invokeinterface #222 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  13   29:ifne            34
				return -1;
	//   14   32:iconst_m1       
	//   15   33:ireturn         
			scratch.setPosition(0);
	//   16   34:aload_0         
	//   17   35:getfield        #101 <Field ParsableByteArray scratch>
	//   18   38:iconst_0        
	//   19   39:invokevirtual   #137 <Method void ParsableByteArray.setPosition(int)>
			int i = scratch.readInt();
	//   20   42:aload_0         
	//   21   43:getfield        #101 <Field ParsableByteArray scratch>
	//   22   46:invokevirtual   #141 <Method int ParsableByteArray.readInt()>
	//   23   49:istore_2        
			if(headersMatch(i, synchronizedHeaderData) && MpegAudioHeader.getFrameSize(i) != -1)
	//*  24   50:iload_2         
	//*  25   51:aload_0         
	//*  26   52:getfield        #224 <Field int synchronizedHeaderData>
	//*  27   55:i2l             
	//*  28   56:invokestatic    #226 <Method boolean headersMatch(int, long)>
	//*  29   59:ifeq            163
	//*  30   62:iload_2         
	//*  31   63:invokestatic    #230 <Method int MpegAudioHeader.getFrameSize(int)>
	//*  32   66:iconst_m1       
	//*  33   67:icmpne          73
	//*  34   70:goto            163
			{
				MpegAudioHeader.populateHeader(i, synchronizedHeader);
	//   35   73:iload_2         
	//   36   74:aload_0         
	//   37   75:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   38   78:invokestatic    #145 <Method boolean MpegAudioHeader.populateHeader(int, MpegAudioHeader)>
	//   39   81:pop             
				if(basisTimeUs == 0x1L)
	//*  40   82:aload_0         
	//*  41   83:getfield        #113 <Field long basisTimeUs>
	//*  42   86:ldc2w           #87  <Long 0x1L>
	//*  43   89:lcmp            
	//*  44   90:ifne            149
				{
					basisTimeUs = seeker.getTimeUs(extractorinput.getPosition());
	//   45   93:aload_0         
	//   46   94:aload_0         
	//   47   95:getfield        #232 <Field Mp3Extractor$Seeker seeker>
	//   48   98:aload_1         
	//   49   99:invokeinterface #154 <Method long ExtractorInput.getPosition()>
	//   50  104:invokeinterface #236 <Method long Mp3Extractor$Seeker.getTimeUs(long)>
	//   51  109:putfield        #113 <Field long basisTimeUs>
					if(forcedFirstSampleTimestampUs != 0x1L)
	//*  52  112:aload_0         
	//*  53  113:getfield        #96  <Field long forcedFirstSampleTimestampUs>
	//*  54  116:ldc2w           #87  <Long 0x1L>
	//*  55  119:lcmp            
	//*  56  120:ifeq            149
					{
						long l = seeker.getTimeUs(0L);
	//   57  123:aload_0         
	//   58  124:getfield        #232 <Field Mp3Extractor$Seeker seeker>
	//   59  127:lconst_0        
	//   60  128:invokeinterface #236 <Method long Mp3Extractor$Seeker.getTimeUs(long)>
	//   61  133:lstore_3        
						basisTimeUs = basisTimeUs + (forcedFirstSampleTimestampUs - l);
	//   62  134:aload_0         
	//   63  135:aload_0         
	//   64  136:getfield        #113 <Field long basisTimeUs>
	//   65  139:aload_0         
	//   66  140:getfield        #96  <Field long forcedFirstSampleTimestampUs>
	//   67  143:lload_3         
	//   68  144:lsub            
	//   69  145:ladd            
	//   70  146:putfield        #113 <Field long basisTimeUs>
					}
				}
				sampleBytesRemaining = synchronizedHeader.frameSize;
	//   71  149:aload_0         
	//   72  150:aload_0         
	//   73  151:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//   74  154:getfield        #171 <Field int MpegAudioHeader.frameSize>
	//   75  157:putfield        #219 <Field int sampleBytesRemaining>
			} else
	//*  76  160:goto            177
			{
				extractorinput.skipFully(1);
	//   77  163:aload_1         
	//   78  164:iconst_1        
	//   79  165:invokeinterface #188 <Method void ExtractorInput.skipFully(int)>
				synchronizedHeaderData = 0;
	//   80  170:aload_0         
	//   81  171:iconst_0        
	//   82  172:putfield        #224 <Field int synchronizedHeaderData>
				return 0;
	//   83  175:iconst_0        
	//   84  176:ireturn         
			}
		}
		int j = trackOutput.sampleData(extractorinput, sampleBytesRemaining, true);
	//   85  177:aload_0         
	//   86  178:getfield        #238 <Field TrackOutput trackOutput>
	//   87  181:aload_1         
	//   88  182:aload_0         
	//   89  183:getfield        #219 <Field int sampleBytesRemaining>
	//   90  186:iconst_1        
	//   91  187:invokeinterface #244 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//   92  192:istore_2        
		if(j == -1)
	//*  93  193:iload_2         
	//*  94  194:iconst_m1       
	//*  95  195:icmpne          200
			return -1;
	//   96  198:iconst_m1       
	//   97  199:ireturn         
		sampleBytesRemaining = sampleBytesRemaining - j;
	//   98  200:aload_0         
	//   99  201:aload_0         
	//  100  202:getfield        #219 <Field int sampleBytesRemaining>
	//  101  205:iload_2         
	//  102  206:isub            
	//  103  207:putfield        #219 <Field int sampleBytesRemaining>
		if(sampleBytesRemaining > 0)
	//* 104  210:aload_0         
	//* 105  211:getfield        #219 <Field int sampleBytesRemaining>
	//* 106  214:ifle            219
		{
			return 0;
	//  107  217:iconst_0        
	//  108  218:ireturn         
		} else
		{
			long l1 = basisTimeUs;
	//  109  219:aload_0         
	//  110  220:getfield        #113 <Field long basisTimeUs>
	//  111  223:lstore_3        
			long l2 = (samplesRead * 0xf4240L) / (long)synchronizedHeader.sampleRate;
	//  112  224:aload_0         
	//  113  225:getfield        #246 <Field long samplesRead>
	//  114  228:ldc2w           #247 <Long 0xf4240L>
	//  115  231:lmul            
	//  116  232:aload_0         
	//  117  233:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//  118  236:getfield        #251 <Field int MpegAudioHeader.sampleRate>
	//  119  239:i2l             
	//  120  240:ldiv            
	//  121  241:lstore          5
			trackOutput.sampleMetadata(l1 + l2, 1, synchronizedHeader.frameSize, 0, ((com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) (null)));
	//  122  243:aload_0         
	//  123  244:getfield        #238 <Field TrackOutput trackOutput>
	//  124  247:lload_3         
	//  125  248:lload           5
	//  126  250:ladd            
	//  127  251:iconst_1        
	//  128  252:aload_0         
	//  129  253:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//  130  256:getfield        #171 <Field int MpegAudioHeader.frameSize>
	//  131  259:iconst_0        
	//  132  260:aconst_null     
	//  133  261:invokeinterface #255 <Method void TrackOutput.sampleMetadata(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$CryptoData)>
			samplesRead = samplesRead + (long)synchronizedHeader.samplesPerFrame;
	//  134  266:aload_0         
	//  135  267:aload_0         
	//  136  268:getfield        #246 <Field long samplesRead>
	//  137  271:aload_0         
	//  138  272:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//  139  275:getfield        #258 <Field int MpegAudioHeader.samplesPerFrame>
	//  140  278:i2l             
	//  141  279:ladd            
	//  142  280:putfield        #246 <Field long samplesRead>
			sampleBytesRemaining = 0;
	//  143  283:aload_0         
	//  144  284:iconst_0        
	//  145  285:putfield        #219 <Field int sampleBytesRemaining>
			return 0;
	//  146  288:iconst_0        
	//  147  289:ireturn         
		}
	}

	private boolean synchronize(ExtractorInput extractorinput, boolean flag)
		throws IOException, InterruptedException
	{
		int l;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            12
			l = 16384;
	//    2    4:sipush          16384
	//    3    7:istore          6
		else
	//*   4    9:goto            16
			l = 0x20000;
	//    5   12:ldc1            #25  <Int 0x20000>
	//    6   14:istore          6
		extractorinput.resetPeekPosition();
	//    7   16:aload_1         
	//    8   17:invokeinterface #191 <Method void ExtractorInput.resetPeekPosition()>
		int i;
		int j;
		int k;
		int i1;
		if(extractorinput.getPosition() == 0L)
	//*   9   22:aload_1         
	//*  10   23:invokeinterface #154 <Method long ExtractorInput.getPosition()>
	//*  11   28:lconst_0        
	//*  12   29:lcmp            
	//*  13   30:ifne            131
		{
			boolean flag1;
			if((flags & 2) != 0)
	//*  14   33:aload_0         
	//*  15   34:getfield        #94  <Field int flags>
	//*  16   37:iconst_2        
	//*  17   38:iand            
	//*  18   39:ifeq            47
				flag1 = true;
	//   19   42:iconst_1        
	//   20   43:istore_3        
			else
	//*  21   44:goto            49
				flag1 = false;
	//   22   47:iconst_0        
	//   23   48:istore_3        
			com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate framepredicate;
			if(flag1)
	//*  24   49:iload_3         
	//*  25   50:ifeq            61
				framepredicate = GaplessInfoHolder.GAPLESS_INFO_ID3_FRAME_PREDICATE;
	//   26   53:getstatic       #264 <Field com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate GaplessInfoHolder.GAPLESS_INFO_ID3_FRAME_PREDICATE>
	//   27   56:astore          11
			else
	//*  28   58:goto            64
				framepredicate = null;
	//   29   61:aconst_null     
	//   30   62:astore          11
			metadata = id3Peeker.peekId3Data(extractorinput, framepredicate);
	//   31   64:aload_0         
	//   32   65:aload_0         
	//   33   66:getfield        #118 <Field Id3Peeker id3Peeker>
	//   34   69:aload_1         
	//   35   70:aload           11
	//   36   72:invokevirtual   #268 <Method Metadata Id3Peeker.peekId3Data(ExtractorInput, com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate)>
	//   37   75:putfield        #270 <Field Metadata metadata>
			if(metadata != null)
	//*  38   78:aload_0         
	//*  39   79:getfield        #270 <Field Metadata metadata>
	//*  40   82:ifnull          97
				gaplessInfoHolder.setFromMetadata(metadata);
	//   41   85:aload_0         
	//   42   86:getfield        #111 <Field GaplessInfoHolder gaplessInfoHolder>
	//   43   89:aload_0         
	//   44   90:getfield        #270 <Field Metadata metadata>
	//   45   93:invokevirtual   #274 <Method boolean GaplessInfoHolder.setFromMetadata(Metadata)>
	//   46   96:pop             
			i1 = (int)extractorinput.getPeekPosition();
	//   47   97:aload_1         
	//   48   98:invokeinterface #277 <Method long ExtractorInput.getPeekPosition()>
	//   49  103:l2i             
	//   50  104:istore          7
			if(!flag)
	//*  51  106:iload_2         
	//*  52  107:ifne            118
				extractorinput.skipFully(i1);
	//   53  110:aload_1         
	//   54  111:iload           7
	//   55  113:invokeinterface #188 <Method void ExtractorInput.skipFully(int)>
			j = 0;
	//   56  118:iconst_0        
	//   57  119:istore          4
			k = j;
	//   58  121:iload           4
	//   59  123:istore          5
			i = k;
	//   60  125:iload           5
	//   61  127:istore_3        
		} else
	//*  62  128:goto            144
		{
			i = 0;
	//   63  131:iconst_0        
	//   64  132:istore_3        
			j = i;
	//   65  133:iload_3         
	//   66  134:istore          4
			k = j;
	//   67  136:iload           4
	//   68  138:istore          5
			i1 = k;
	//   69  140:iload           5
	//   70  142:istore          7
		}
		do
		{
			int j1;
			int k1;
label0:
			{
label1:
				{
label2:
					{
						byte abyte0[] = scratch.data;
	//   71  144:aload_0         
	//   72  145:getfield        #101 <Field ParsableByteArray scratch>
	//   73  148:getfield        #128 <Field byte[] ParsableByteArray.data>
	//   74  151:astore          11
						boolean flag2;
						if(i > 0)
	//*  75  153:iload_3         
	//*  76  154:ifle            163
							flag2 = true;
	//   77  157:iconst_1        
	//   78  158:istore          10
						else
	//*  79  160:goto            166
							flag2 = false;
	//   80  163:iconst_0        
	//   81  164:istore          10
						if(!extractorinput.peekFully(abyte0, 0, 4, flag2))
	//*  82  166:aload_1         
	//*  83  167:aload           11
	//*  84  169:iconst_0        
	//*  85  170:iconst_4        
	//*  86  171:iload           10
	//*  87  173:invokeinterface #222 <Method boolean ExtractorInput.peekFully(byte[], int, int, boolean)>
	//*  88  178:ifne            184
							break label1;
	//   89  181:goto            332
						scratch.setPosition(0);
	//   90  184:aload_0         
	//   91  185:getfield        #101 <Field ParsableByteArray scratch>
	//   92  188:iconst_0        
	//   93  189:invokevirtual   #137 <Method void ParsableByteArray.setPosition(int)>
						j1 = scratch.readInt();
	//   94  192:aload_0         
	//   95  193:getfield        #101 <Field ParsableByteArray scratch>
	//   96  196:invokevirtual   #141 <Method int ParsableByteArray.readInt()>
	//   97  199:istore          8
						if(j == 0 || headersMatch(j1, j))
	//*  98  201:iload           4
	//*  99  203:ifeq            217
	//* 100  206:iload           8
	//* 101  208:iload           4
	//* 102  210:i2l             
	//* 103  211:invokestatic    #226 <Method boolean headersMatch(int, long)>
	//* 104  214:ifeq            230
						{
							k1 = MpegAudioHeader.getFrameSize(j1);
	//  105  217:iload           8
	//  106  219:invokestatic    #230 <Method int MpegAudioHeader.getFrameSize(int)>
	//  107  222:istore          9
							if(k1 != -1)
								break label2;
	//  108  224:iload           9
	//  109  226:iconst_m1       
	//  110  227:icmpne          301
						}
						i = k + 1;
	//  111  230:iload           5
	//  112  232:iconst_1        
	//  113  233:iadd            
	//  114  234:istore_3        
						if(k == l)
	//* 115  235:iload           5
	//* 116  237:iload           6
	//* 117  239:icmpne          259
							if(!flag)
	//* 118  242:iload_2         
	//* 119  243:ifne            257
								throw new ParserException("Searched too many bytes.");
	//  120  246:new             #279 <Class ParserException>
	//  121  249:dup             
	//  122  250:ldc2            #281 <String "Searched too many bytes.">
	//  123  253:invokespecial   #284 <Method void ParserException(String)>
	//  124  256:athrow          
							else
								return false;
	//  125  257:iconst_0        
	//  126  258:ireturn         
						if(flag)
	//* 127  259:iload_2         
	//* 128  260:ifeq            282
						{
							extractorinput.resetPeekPosition();
	//  129  263:aload_1         
	//  130  264:invokeinterface #191 <Method void ExtractorInput.resetPeekPosition()>
							extractorinput.advancePeekPosition(i1 + i);
	//  131  269:aload_1         
	//  132  270:iload           7
	//  133  272:iload_3         
	//  134  273:iadd            
	//  135  274:invokeinterface #203 <Method void ExtractorInput.advancePeekPosition(int)>
						} else
	//* 136  279:goto            289
						{
							extractorinput.skipFully(1);
	//  137  282:aload_1         
	//  138  283:iconst_1        
	//  139  284:invokeinterface #188 <Method void ExtractorInput.skipFully(int)>
						}
						j = 0;
	//  140  289:iconst_0        
	//  141  290:istore          4
						k = i;
	//  142  292:iload_3         
	//  143  293:istore          5
						i = j;
	//  144  295:iload           4
	//  145  297:istore_3        
						continue;
	//  146  298:goto            144
					}
					i++;
	//  147  301:iload_3         
	//  148  302:iconst_1        
	//  149  303:iadd            
	//  150  304:istore_3        
					if(i == 1)
	//* 151  305:iload_3         
	//* 152  306:iconst_1        
	//* 153  307:icmpne          323
					{
						MpegAudioHeader.populateHeader(j1, synchronizedHeader);
	//  154  310:iload           8
	//  155  312:aload_0         
	//  156  313:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//  157  316:invokestatic    #145 <Method boolean MpegAudioHeader.populateHeader(int, MpegAudioHeader)>
	//  158  319:pop             
						break label0;
	//  159  320:goto            364
					}
					j1 = j;
	//  160  323:iload           4
	//  161  325:istore          8
					if(i != 4)
						break label0;
	//  162  327:iload_3         
	//  163  328:iconst_4        
	//  164  329:icmpne          364
				}
				if(flag)
	//* 165  332:iload_2         
	//* 166  333:ifeq            350
					extractorinput.skipFully(i1 + k);
	//  167  336:aload_1         
	//  168  337:iload           7
	//  169  339:iload           5
	//  170  341:iadd            
	//  171  342:invokeinterface #188 <Method void ExtractorInput.skipFully(int)>
				else
	//* 172  347:goto            356
					extractorinput.resetPeekPosition();
	//  173  350:aload_1         
	//  174  351:invokeinterface #191 <Method void ExtractorInput.resetPeekPosition()>
				synchronizedHeaderData = j;
	//  175  356:aload_0         
	//  176  357:iload           4
	//  177  359:putfield        #224 <Field int synchronizedHeaderData>
				return true;
	//  178  362:iconst_1        
	//  179  363:ireturn         
			}
			extractorinput.advancePeekPosition(k1 - 4);
	//  180  364:aload_1         
	//  181  365:iload           9
	//  182  367:iconst_4        
	//  183  368:isub            
	//  184  369:invokeinterface #203 <Method void ExtractorInput.advancePeekPosition(int)>
			j = j1;
	//  185  374:iload           8
	//  186  376:istore          4
		} while(true);
	//  187  378:goto            144
	}

	public void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #288 <Field ExtractorOutput extractorOutput>
		trackOutput = extractorOutput.track(0, 1);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #288 <Field ExtractorOutput extractorOutput>
	//    6   10:iconst_0        
	//    7   11:iconst_1        
	//    8   12:invokeinterface #294 <Method TrackOutput ExtractorOutput.track(int, int)>
	//    9   17:putfield        #238 <Field TrackOutput trackOutput>
		extractorOutput.endTracks();
	//   10   20:aload_0         
	//   11   21:getfield        #288 <Field ExtractorOutput extractorOutput>
	//   12   24:invokeinterface #297 <Method void ExtractorOutput.endTracks()>
	//   13   29:return          
	}

	public int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
		if(synchronizedHeaderData == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #224 <Field int synchronizedHeaderData>
	//*   2    4:ifne            19
			try
			{
				synchronize(extractorinput, false);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokespecial   #303 <Method boolean synchronize(ExtractorInput, boolean)>
	//    7   13:pop             
			}
	//*   8   14:goto            19
	//*   9   17:iconst_m1       
	//*  10   18:ireturn         
	//*  11   19:aload_0         
	//*  12   20:getfield        #232 <Field Mp3Extractor$Seeker seeker>
	//*  13   23:ifnonnull       188
	//*  14   26:aload_0         
	//*  15   27:aload_0         
	//*  16   28:aload_1         
	//*  17   29:invokespecial   #305 <Method Mp3Extractor$Seeker maybeReadSeekFrame(ExtractorInput)>
	//*  18   32:putfield        #232 <Field Mp3Extractor$Seeker seeker>
	//*  19   35:aload_0         
	//*  20   36:getfield        #232 <Field Mp3Extractor$Seeker seeker>
	//*  21   39:ifnull          63
	//*  22   42:aload_0         
	//*  23   43:getfield        #232 <Field Mp3Extractor$Seeker seeker>
	//*  24   46:invokeinterface #213 <Method boolean Mp3Extractor$Seeker.isSeekable()>
	//*  25   51:ifne            72
	//*  26   54:aload_0         
	//*  27   55:getfield        #94  <Field int flags>
	//*  28   58:iconst_1        
	//*  29   59:iand            
	//*  30   60:ifeq            72
	//*  31   63:aload_0         
	//*  32   64:aload_0         
	//*  33   65:aload_1         
	//*  34   66:invokespecial   #215 <Method Mp3Extractor$Seeker getConstantBitrateSeeker(ExtractorInput)>
	//*  35   69:putfield        #232 <Field Mp3Extractor$Seeker seeker>
	//*  36   72:aload_0         
	//*  37   73:getfield        #288 <Field ExtractorOutput extractorOutput>
	//*  38   76:aload_0         
	//*  39   77:getfield        #232 <Field Mp3Extractor$Seeker seeker>
	//*  40   80:invokeinterface #309 <Method void ExtractorOutput.seekMap(SeekMap)>
	//*  41   85:aload_0         
	//*  42   86:getfield        #238 <Field TrackOutput trackOutput>
	//*  43   89:astore          7
	//*  44   91:aload_0         
	//*  45   92:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//*  46   95:getfield        #313 <Field String MpegAudioHeader.mimeType>
	//*  47   98:astore          8
	//*  48  100:aload_0         
	//*  49  101:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//*  50  104:getfield        #177 <Field int MpegAudioHeader.channels>
	//*  51  107:istore_3        
	//*  52  108:aload_0         
	//*  53  109:getfield        #106 <Field MpegAudioHeader synchronizedHeader>
	//*  54  112:getfield        #251 <Field int MpegAudioHeader.sampleRate>
	//*  55  115:istore          4
	//*  56  117:aload_0         
	//*  57  118:getfield        #111 <Field GaplessInfoHolder gaplessInfoHolder>
	//*  58  121:getfield        #316 <Field int GaplessInfoHolder.encoderDelay>
	//*  59  124:istore          5
	//*  60  126:aload_0         
	//*  61  127:getfield        #111 <Field GaplessInfoHolder gaplessInfoHolder>
	//*  62  130:getfield        #319 <Field int GaplessInfoHolder.encoderPadding>
	//*  63  133:istore          6
	//*  64  135:aload_0         
	//*  65  136:getfield        #94  <Field int flags>
	//*  66  139:iconst_2        
	//*  67  140:iand            
	//*  68  141:ifeq            149
	//*  69  144:aconst_null     
	//*  70  145:astore_2        
	//*  71  146:goto            157
	//*  72  149:aload_0         
	//*  73  150:getfield        #270 <Field Metadata metadata>
	//*  74  153:astore_2        
	//*  75  154:goto            146
	//*  76  157:aload           7
	//*  77  159:aconst_null     
	//*  78  160:aload           8
	//*  79  162:aconst_null     
	//*  80  163:iconst_m1       
	//*  81  164:sipush          4096
	//*  82  167:iload_3         
	//*  83  168:iload           4
	//*  84  170:iconst_m1       
	//*  85  171:iload           5
	//*  86  173:iload           6
	//*  87  175:aconst_null     
	//*  88  176:aconst_null     
	//*  89  177:iconst_0        
	//*  90  178:aconst_null     
	//*  91  179:aload_2         
	//*  92  180:invokestatic    #325 <Method Format Format.createAudioSampleFormat(String, String, String, int, int, int, int, int, int, int, java.util.List, com.google.android.exoplayer2.drm.DrmInitData, int, String, Metadata)>
	//*  93  183:invokeinterface #329 <Method void TrackOutput.format(Format)>
	//*  94  188:aload_0         
	//*  95  189:aload_1         
	//*  96  190:invokespecial   #331 <Method int readSample(ExtractorInput)>
	//*  97  193:ireturn         
			// Misplaced declaration of an exception variable
			catch(ExtractorInput extractorinput)
			{
				return -1;
			}
		if(seeker == null)
		{
			seeker = maybeReadSeekFrame(extractorinput);
			if(seeker == null || !seeker.isSeekable() && (flags & 1) != 0)
				seeker = getConstantBitrateSeeker(extractorinput);
			extractorOutput.seekMap(((SeekMap) (seeker)));
			TrackOutput trackoutput = trackOutput;
			String s = synchronizedHeader.mimeType;
			int i = synchronizedHeader.channels;
			int j = synchronizedHeader.sampleRate;
			int k = gaplessInfoHolder.encoderDelay;
			int l = gaplessInfoHolder.encoderPadding;
			if((flags & 2) != 0)
				positionholder = null;
			else
				positionholder = ((PositionHolder) (metadata));
			trackoutput.format(Format.createAudioSampleFormat(((String) (null)), s, ((String) (null)), -1, 4096, i, j, -1, k, l, ((java.util.List) (null)), ((com.google.android.exoplayer2.drm.DrmInitData) (null)), 0, ((String) (null)), ((Metadata) (positionholder))));
		}
		return readSample(extractorinput);
	//*  98  194:astore_1        
	//*  99  195:goto            17
	}

	public void release()
	{
	//    0    0:return          
	}

	public void seek(long l, long l1)
	{
		synchronizedHeaderData = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #224 <Field int synchronizedHeaderData>
		basisTimeUs = 0x1L;
	//    3    5:aload_0         
	//    4    6:ldc2w           #87  <Long 0x1L>
	//    5    9:putfield        #113 <Field long basisTimeUs>
		samplesRead = 0L;
	//    6   12:aload_0         
	//    7   13:lconst_0        
	//    8   14:putfield        #246 <Field long samplesRead>
		sampleBytesRemaining = 0;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #219 <Field int sampleBytesRemaining>
	//   12   22:return          
	}

	public boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return synchronize(extractorinput, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #303 <Method boolean synchronize(ExtractorInput, boolean)>
	//    4    6:ireturn         
	}

	public static final ExtractorsFactory FACTORY = new ExtractorsFactory() {

		public Extractor[] createExtractors()
		{
			return (new Extractor[] {
				new Mp3Extractor()
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Extractor[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:new             #8   <Class Mp3Extractor>
		//    5    9:dup             
		//    6   10:invokespecial   #18  <Method void Mp3Extractor()>
		//    7   13:aastore         
		//    8   14:areturn         
		}

	}
;
	public static final int FLAG_DISABLE_ID3_METADATA = 2;
	public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
	private static final int MAX_SNIFF_BYTES = 16384;
	private static final int MAX_SYNC_BYTES = 0x20000;
	private static final int MPEG_AUDIO_HEADER_MASK = 0xfffe0c00;
	private static final int SCRATCH_LENGTH = 10;
	private static final int SEEK_HEADER_INFO = Util.getIntegerCodeForString("Info");
	private static final int SEEK_HEADER_UNSET = 0;
	private static final int SEEK_HEADER_VBRI = Util.getIntegerCodeForString("VBRI");
	private static final int SEEK_HEADER_XING = Util.getIntegerCodeForString("Xing");
	private long basisTimeUs;
	private ExtractorOutput extractorOutput;
	private final int flags;
	private final long forcedFirstSampleTimestampUs;
	private final GaplessInfoHolder gaplessInfoHolder;
	private final Id3Peeker id3Peeker;
	private Metadata metadata;
	private int sampleBytesRemaining;
	private long samplesRead;
	private final ParsableByteArray scratch;
	private Seeker seeker;
	private final MpegAudioHeader synchronizedHeader;
	private int synchronizedHeaderData;
	private TrackOutput trackOutput;

	static 
	{
	//    0    0:new             #8   <Class Mp3Extractor$1>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void Mp3Extractor$1()>
	//    3    7:putstatic       #64  <Field ExtractorsFactory FACTORY>
	//    4   10:ldc1            #66  <String "Xing">
	//    5   12:invokestatic    #72  <Method int Util.getIntegerCodeForString(String)>
	//    6   15:putstatic       #74  <Field int SEEK_HEADER_XING>
	//    7   18:ldc1            #76  <String "Info">
	//    8   20:invokestatic    #72  <Method int Util.getIntegerCodeForString(String)>
	//    9   23:putstatic       #78  <Field int SEEK_HEADER_INFO>
	//   10   26:ldc1            #80  <String "VBRI">
	//   11   28:invokestatic    #72  <Method int Util.getIntegerCodeForString(String)>
	//   12   31:putstatic       #82  <Field int SEEK_HEADER_VBRI>
	//*  13   34:return          
	}
}
